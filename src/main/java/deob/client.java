package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.b")
    public static boolean field265 = true;

    @ObfuscatedName("client.w")
    public static class197[] field324 = new class197[4];

    @ObfuscatedName("client.r")
    public static int field336 = 1;

    @ObfuscatedName("client.l")
    public static int field267 = 0;

    @ObfuscatedName("client.f")
    public static int field269 = 0;

    @ObfuscatedName("client.u")
    public static boolean field501 = false;

    @ObfuscatedName("client.v")
    public static boolean field471 = false;

    @ObfuscatedName("client.i")
    public static int field273 = 0;

    @ObfuscatedName("client.d")
    public static int field274 = 0;

    @ObfuscatedName("client.k")
    public static boolean field344 = true;

    @ObfuscatedName("client.p")
    public static int field318 = 0;

    @ObfuscatedName("client.j")
    public static long field277 = 1L;

    @ObfuscatedName("client.t")
    public static int field278 = -1;

    @ObfuscatedName("client.c")
    public static int field484 = -1;

    @ObfuscatedName("client.q")
    public static int field280 = -1;

    @ObfuscatedName("client.g")
    public static boolean field347 = true;

    @ObfuscatedName("client.m")
    public static boolean field435 = false;

    @ObfuscatedName("client.ay")
    public static int field283 = 0;

    @ObfuscatedName("client.ae")
    public static int field284 = 0;

    @ObfuscatedName("client.af")
    public static int field285 = 0;

    @ObfuscatedName("client.ab")
    public static int field286 = 0;

    @ObfuscatedName("client.ao")
    public static int field287 = 0;

    @ObfuscatedName("client.ak")
    public static int field378 = 0;

    @ObfuscatedName("client.ah")
    public static int field403 = 0;

    @ObfuscatedName("client.ai")
    public static int field290 = 0;

    @ObfuscatedName("client.al")
    public static int field291 = 0;

    @ObfuscatedName("client.av")
    public static class107 field429 = new class107(new byte[5000]);

    @ObfuscatedName("client.au")
    public static class18 field293 = class18.field527;

    @ObfuscatedName("client.at")
    public static int field396 = 0;

    @ObfuscatedName("client.aw")
    public static int field282 = 0;

    @ObfuscatedName("client.ac")
    public static int field296 = 0;

    @ObfuscatedName("client.be")
    public static int field297 = 0;

    @ObfuscatedName("client.bd")
    public static int field298 = 0;

    @ObfuscatedName("client.bk")
    public static int field299 = 0;

    @ObfuscatedName("client.bb")
    public static int field300 = 0;

    @ObfuscatedName("client.bq")
    public static int field301 = 0;

    @ObfuscatedName("client.bp")
    public static class30[] field302 = new class30[32768];

    @ObfuscatedName("client.bz")
    public static int field303 = 0;

    @ObfuscatedName("client.bm")
    public static int[] field304 = new int[32768];

    @ObfuscatedName("client.ce")
    public static class110 field386 = new class110(5000);

    @ObfuscatedName("client.cu")
    public static class110 field307 = new class110(5000);

    @ObfuscatedName("client.cy")
    public static class110 field308 = new class110(5000);

    @ObfuscatedName("client.ci")
    public static int field309 = 0;

    @ObfuscatedName("client.ct")
    public static int field310 = 0;

    @ObfuscatedName("client.cq")
    public static int field412 = 0;

    @ObfuscatedName("client.ca")
    public static int field312 = 0;

    @ObfuscatedName("client.cv")
    public static int field371 = 0;

    @ObfuscatedName("client.cj")
    public static int field514 = 0;

    @ObfuscatedName("client.cx")
    public static int field460 = 0;

    @ObfuscatedName("client.cc")
    public static int field495 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field476 = false;

    @ObfuscatedName("client.cp")
    public static int field436 = 0;

    @ObfuscatedName("client.cr")
    public static int field454 = 0;

    @ObfuscatedName("client.de")
    public static int field271 = 1;

    @ObfuscatedName("client.df")
    public static int field321 = 0;

    @ObfuscatedName("client.dl")
    public static int field322 = 1;

    @ObfuscatedName("client.dr")
    public static int field323 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field325 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field326 = new int[4][13][13];

    @ObfuscatedName("client.db")
    public static final int[] field295 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dd")
    public static int field328 = 0;

    @ObfuscatedName("client.dw")
    public static int field329 = 2;

    @ObfuscatedName("client.dk")
    public static int field330 = 0;

    @ObfuscatedName("client.do")
    public static int field350 = 2;

    @ObfuscatedName("client.dj")
    public static int field503 = 0;

    @ObfuscatedName("client.dv")
    public static int field333 = 1;

    @ObfuscatedName("client.dp")
    public static int field334 = 0;

    @ObfuscatedName("client.dh")
    public static int field335 = 0;

    @ObfuscatedName("client.dt")
    public static int field315 = 2;

    @ObfuscatedName("client.dq")
    public static int field337 = 0;

    @ObfuscatedName("client.ea")
    public static int field338 = 1;

    @ObfuscatedName("client.eq")
    public static int field313 = 0;

    @ObfuscatedName("client.ev")
    public static int field433 = 0;

    @ObfuscatedName("client.ed")
    public static int field341 = 2301979;

    @ObfuscatedName("client.er")
    public static int field342 = 5063219;

    @ObfuscatedName("client.em")
    public static int field343 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field482 = 7759444;

    @ObfuscatedName("client.ec")
    public static boolean field356 = false;

    @ObfuscatedName("client.fe")
    public static int field346 = 0;

    @ObfuscatedName("client.fs")
    public static int field499 = 128;

    @ObfuscatedName("client.fl")
    public static int field348 = 0;

    @ObfuscatedName("client.fb")
    public static int field349 = 0;

    @ObfuscatedName("client.ff")
    public static int field332 = 0;

    @ObfuscatedName("client.fw")
    public static int field351 = 0;

    @ObfuscatedName("client.fp")
    public static int field466 = 0;

    @ObfuscatedName("client.fk")
    public static int field353 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field354 = false;

    @ObfuscatedName("client.fi")
    public static int field355 = 0;

    @ObfuscatedName("client.fz")
    public static int field464 = 0;

    @ObfuscatedName("client.fy")
    public static int field331 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field381 = new int[field331];

    @ObfuscatedName("client.fn")
    public static int[] field414 = new int[field331];

    @ObfuscatedName("client.fq")
    public static int[] field360 = new int[field331];

    @ObfuscatedName("client.fd")
    public static int[] field361 = new int[field331];

    @ObfuscatedName("client.fh")
    public static int[] field450 = new int[field331];

    @ObfuscatedName("client.fc")
    public static int[] field363 = new int[field331];

    @ObfuscatedName("client.fm")
    public static int[] field364 = new int[field331];

    @ObfuscatedName("client.gz")
    public static String[] field319 = new String[field331];

    @ObfuscatedName("client.gy")
    public static int[][] field366 = new int[104][104];

    @ObfuscatedName("client.gp")
    public static int field367 = 0;

    @ObfuscatedName("client.gm")
    public static int field379 = -1;

    @ObfuscatedName("client.gq")
    public static int field369 = -1;

    @ObfuscatedName("client.gb")
    public static int field359 = 0;

    @ObfuscatedName("client.gl")
    public static int field272 = 0;

    @ObfuscatedName("client.go")
    public static int field372 = 0;

    @ObfuscatedName("client.gv")
    public static int field373 = 0;

    @ObfuscatedName("client.gn")
    public static int field440 = 0;

    @ObfuscatedName("client.gs")
    public static int field375 = 0;

    @ObfuscatedName("client.gc")
    public static int field376 = 0;

    @ObfuscatedName("client.gg")
    public static int field497 = 0;

    @ObfuscatedName("client.gf")
    public static int field281 = 0;

    @ObfuscatedName("client.gw")
    public static int field423 = 0;

    @ObfuscatedName("client.gd")
    public static boolean field380 = false;

    @ObfuscatedName("client.gj")
    public static int field314 = 0;

    @ObfuscatedName("client.gr")
    public static int field345 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field445 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field289 = 0;

    @ObfuscatedName("client.gx")
    public static int[] field385 = new int[2048];

    @ObfuscatedName("client.hp")
    public static int field279 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field462 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class107[] field388 = new class107[2048];

    @ObfuscatedName("client.hv")
    public static int field389 = -1;

    @ObfuscatedName("client.hg")
    public static int field317 = 0;

    @ObfuscatedName("client.hm")
    public static int field443 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field392 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field393 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field394 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field395 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field382 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field486 = -1;

    @ObfuscatedName("client.he")
    public static class177[][][] field263 = new class177[4][104][104];

    @ObfuscatedName("client.hu")
    public static class177 field399 = new class177();

    @ObfuscatedName("client.ht")
    public static class177 field400 = new class177();

    @ObfuscatedName("client.hl")
    public static class177 field401 = new class177();

    @ObfuscatedName("client.hk")
    public static int[] field402 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field288 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field404 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field511 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field406 = false;

    @ObfuscatedName("client.is")
    public static int field320 = 0;

    @ObfuscatedName("client.in")
    public static int[] field408 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field422 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field410 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field411 = new int[500];

    @ObfuscatedName("client.ij")
    public static String[] field384 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field413 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field407 = -1;

    @ObfuscatedName("client.ig")
    public static int field415 = -1;

    @ObfuscatedName("client.iw")
    public static int field352 = 0;

    @ObfuscatedName("client.if")
    public static int field268 = 50;

    @ObfuscatedName("client.il")
    public static int field418 = 0;

    @ObfuscatedName("client.it")
    public static String field276 = null;

    @ObfuscatedName("client.ii")
    public static boolean field420 = false;

    @ObfuscatedName("client.id")
    public static int field421 = -1;

    @ObfuscatedName("client.iq")
    public static int field397 = -1;

    @ObfuscatedName("client.jv")
    public static String field459 = null;

    @ObfuscatedName("client.jx")
    public static String field424 = null;

    @ObfuscatedName("client.jc")
    public static int field425 = -1;

    @ObfuscatedName("client.jr")
    public static class174 field426 = new class174(8);

    @ObfuscatedName("client.jk")
    public static int field427 = 0;

    @ObfuscatedName("client.jw")
    public static int field428 = 0;

    @ObfuscatedName("client.ju")
    public static class152 field306 = null;

    @ObfuscatedName("client.ji")
    public static int field430 = 0;

    @ObfuscatedName("client.jt")
    public static int field431 = 0;

    @ObfuscatedName("client.je")
    public static int field432 = 0;

    @ObfuscatedName("client.jg")
    public static int field383 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field434 = false;

    @ObfuscatedName("client.js")
    public static boolean field507 = false;

    @ObfuscatedName("client.jp")
    public static boolean field516 = false;

    @ObfuscatedName("client.jf")
    public static class152 field437 = null;

    @ObfuscatedName("client.jq")
    public static class152 field438 = null;

    @ObfuscatedName("client.jb")
    public static int field439 = 0;

    @ObfuscatedName("client.jh")
    public static int field491 = 0;

    @ObfuscatedName("client.jd")
    public static class152 field441 = null;

    @ObfuscatedName("client.ja")
    public static boolean field442 = false;

    @ObfuscatedName("client.jn")
    public static int field316 = -1;

    @ObfuscatedName("client.jj")
    public static int field444 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field480 = false;

    @ObfuscatedName("client.jm")
    public static int field374 = -1;

    @ObfuscatedName("client.jl")
    public static int field447 = -1;

    @ObfuscatedName("client.kq")
    public static boolean field455 = false;

    @ObfuscatedName("client.kc")
    public static int field449 = 1;

    @ObfuscatedName("client.kj")
    public static int[] field357 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field451 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field452 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field453 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field405 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field416 = 0;

    @ObfuscatedName("client.kr")
    public static int field456 = 0;

    @ObfuscatedName("client.kt")
    public static int field457 = 0;

    @ObfuscatedName("client.kw")
    public static int field458 = 0;

    @ObfuscatedName("client.kz")
    public static int field417 = 0;

    @ObfuscatedName("client.km")
    public static int[] field483 = new int[2000];

    @ObfuscatedName("client.kl")
    public static String[] field461 = new String[1000];

    @ObfuscatedName("client.ky")
    public static int field370 = 0;

    @ObfuscatedName("client.kb")
    public static class177 field368 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field387 = new class177();

    @ObfuscatedName("client.kn")
    public static class177 field465 = new class177();

    @ObfuscatedName("client.kk")
    public static class174 field358 = new class174(512);

    @ObfuscatedName("client.lq")
    public static int field467 = 0;

    @ObfuscatedName("client.ly")
    public static int field468 = -2;

    @ObfuscatedName("client.lh")
    public static boolean[] field469 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field470 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field398 = new boolean[100];

    @ObfuscatedName("client.le")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field473 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field475 = new int[100];

    @ObfuscatedName("client.ld")
    public static int field390 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field477 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field478 = 0;

    @ObfuscatedName("client.lt")
    public static int field479 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field362 = new long[100];

    @ObfuscatedName("client.lx")
    public static int field481 = 0;

    @ObfuscatedName("client.lb")
    public static int field365 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field339 = new int[128];

    @ObfuscatedName("client.lv")
    public static int[] field448 = new int[128];

    @ObfuscatedName("client.li")
    public static long field485 = -1L;

    @ObfuscatedName("client.ln")
    public static String field523 = null;

    @ObfuscatedName("client.lz")
    public static String field487 = null;

    @ObfuscatedName("client.mv")
    public static int field446 = -1;

    @ObfuscatedName("client.ma")
    public static int field489 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field490 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field266 = new int[1000];

    @ObfuscatedName("client.me")
    public static class72[] field492 = new class72[1000];

    @ObfuscatedName("client.mt")
    public static int field493 = 0;

    @ObfuscatedName("client.mh")
    public static int field494 = 0;

    @ObfuscatedName("client.mg")
    public static int field419 = 0;

    @ObfuscatedName("client.mf")
    public static int field496 = 255;

    @ObfuscatedName("client.mx")
    public static int field463 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field498 = false;

    @ObfuscatedName("client.mo")
    public static int field275 = 127;

    @ObfuscatedName("client.mk")
    public static int field500 = 127;

    @ObfuscatedName("client.nn")
    public static int field377 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field502 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field391 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field504 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field505 = new int[50];

    @ObfuscatedName("client.na")
    public static class52[] field506 = new class52[50];

    @ObfuscatedName("client.nz")
    public static boolean field488 = false;

    @ObfuscatedName("client.np")
    public static boolean[] field508 = new boolean[5];

    @ObfuscatedName("client.nt")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field510 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field294 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field512 = new int[5];

    @ObfuscatedName("client.nl")
    public static int field513 = 0;

    @ObfuscatedName("client.or")
    public static int field292 = 0;

    @ObfuscatedName("client.oo")
    public static class16[] field515 = new class16[400];

    @ObfuscatedName("client.oz")
    public static class173 field327 = new class173();

    @ObfuscatedName("client.oj")
    public static int field517 = 0;

    @ObfuscatedName("client.ov")
    public static class8[] field518 = new class8[400];

    @ObfuscatedName("client.oi")
    public static class157 field519 = new class157();

    @ObfuscatedName("client.ok")
    public static int field520 = -1;

    @ObfuscatedName("client.ol")
    public static int field521 = -1;

    @ObfuscatedName("client.o(I)V")
    public final void method161() {
    }

    public final void init() {
        if (!this.method2529()) {
            return;
        }
        class168[] var1 = new class168[] { class168.field2823, class168.field2825, class168.field2819, class168.field2818, class168.field2821, class168.field2822, class168.field2816, class168.field2824, class168.field2817, class168.field2826 };
        class168[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class168 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2829);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2829)) {
                    case 1:
                        field336 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field273 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                        }
                        break;
                    case 4:
                        field269 = Integer.parseInt(var5);
                    case 5:
                    default:
                        break;
                    case 6:
                        class139[] var6 = new class139[] { class139.field2114, class139.field2118, class139.field2115, class139.field2113, class139.field2116, class139.field2117 };
                        Statics.field1860 = (class139) class99.method2452(var6, Integer.parseInt(var5));
                        if (Statics.field1860 == class139.field2117) {
                            Statics.field270 = class190.field2892;
                        } else {
                            Statics.field270 = class190.field2891;
                        }
                        break;
                    case 7:
                        field267 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                            field501 = true;
                        } else {
                            field501 = false;
                        }
                        break;
                    case 9:
                        int var7 = Integer.parseInt(var5);
                        class138[] var8 = class138.method123();
                        int var9 = 0;
                        class138 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class138 var10 = var8[var9];
                            if (var10.field2105 == var7) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field340 = var11;
                        break;
                    case 10:
                        Statics.field241 = var5;
                }
            }
        }
        method1809();
        Statics.field2096 = this.getCodeBase().getHost();
        String var12 = Statics.field340.field2104;
        byte var13 = 0;
        try {
            Statics.field2082 = 16;
            Statics.field1898 = var13;
            try {
                Statics.field2079 = System.getProperty("os.name");
            } catch (Exception var57) {
                Statics.field2079 = "Unknown";
            }
            Statics.field1928 = Statics.field2079.toLowerCase();
            try {
                Statics.field1825 = System.getProperty("user.home");
                if (Statics.field1825 != null) {
                    Statics.field1825 = Statics.field1825 + "/";
                }
            } catch (Exception var56) {
            }
            try {
                if (Statics.field1928.startsWith("win")) {
                    if (Statics.field1825 == null) {
                        Statics.field1825 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1825 == null) {
                    Statics.field1825 = System.getenv("HOME");
                }
                if (Statics.field1825 != null) {
                    Statics.field1825 = Statics.field1825 + "/";
                }
            } catch (Exception var55) {
            }
            if (Statics.field1825 == null) {
                Statics.field1825 = "~/";
            }
            Statics.field62 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1825, "/tmp/", "" };
            Statics.field2088 = new String[] { ".jagex_cache_" + Statics.field1898, ".file_store_" + Statics.field1898 };
            int var17 = 0;
            label252: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field2080 = new File(Statics.field1825, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field2080.exists()) {
                    try {
                        class195 var22 = new class195(Statics.field2080, "rw", 10000L);
                        class107 var23 = new class107((int) var22.method3337());
                        while (var23.field1841 < var23.field1840.length) {
                            int var24 = var22.method3334(var23.field1840, var23.field1841, var23.field1840.length - var23.field1841);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field1841 += var24;
                        }
                        var23.field1841 = 0;
                        int var25 = var23.method2123();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2123();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2074();
                            if (var26 == 1) {
                                var20 = var23.method2074();
                            }
                        } else {
                            var19 = var23.method2075();
                            if (var26 == 1) {
                                var20 = var23.method2075();
                            }
                        }
                        var22.method3332();
                    } catch (IOException var59) {
                        var59.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class136.method2357(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label228: for (int var30 = 0; var30 < Statics.field2088.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field62.length; var31++) {
                            File var32 = new File(Statics.field62[var31] + Statics.field2088[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class136.method2357(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label228;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1825 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var58) {
                        var58.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class195 var44 = new class195(Statics.field2080, "rw", 10000L);
                        class107 var45 = new class107(500);
                        var45.method2051(3);
                        var45.method2051(var43 == null ? 0 : 1);
                        var45.method2058(var42.getPath());
                        if (var43 != null) {
                            var45.method2058(((File) var43).getPath());
                        }
                        var44.method3341(var45.field1840, 0, var45.field1841);
                        var44.method3332();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field2087 = var47;
                if (!Statics.field2087.exists()) {
                    Statics.field2087.mkdirs();
                }
                File[] var48 = Statics.field2087.listFiles();
                if (var48 == null) {
                    break;
                }
                File[] var49 = var48;
                int var50 = 0;
                while (true) {
                    if (var50 >= var49.length) {
                        break label252;
                    }
                    File var51 = var49[var50];
                    if (!class136.method2357(var51, false)) {
                        var17++;
                        break;
                    }
                    var50++;
                }
            }
            class122.method2526(Statics.field2087);
            class136.method2499();
            class136.field2086 = new class196(new class195(class122.method1808("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2081 = new class196(new class195(class122.method1808("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1989 = new class196[Statics.field2082];
            for (int var52 = 0; var52 < Statics.field2082; var52++) {
                Statics.field1989[var52] = new class196(new class195(class122.method1808("main_file_cache.idx" + var52), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var60) {
            class135.method1996((String) null, var60);
        }
        Statics.field264 = this;
        this.method2527(765, 503, 53);
    }

    @ObfuscatedName("ct.b(B)V")
    public static final void method1809() {
        class79.field1362 = false;
        field471 = false;
    }

    @ObfuscatedName("client.w(B)V")
    public final void method163() {
        Statics.field115 = field269 == 0 ? 43594 : field336 + 40000;
        Statics.field2073 = field269 == 0 ? 443 : field336 + 50000;
        Statics.field912 = Statics.field115;
        Statics.field2667 = class153.field2641;
        Statics.field2665 = class153.field2640;
        Statics.field1821 = class153.field2642;
        Statics.field2666 = class153.field2643;
        if (Statics.field1940.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1967[44] = 71;
            class124.field1967[45] = 26;
            class124.field1967[46] = 72;
            class124.field1967[47] = 73;
            class124.field1967[59] = 57;
            class124.field1967[61] = 27;
            class124.field1967[91] = 42;
            class124.field1967[92] = 74;
            class124.field1967[93] = 43;
            class124.field1967[192] = 28;
            class124.field1967[222] = 58;
            class124.field1967[520] = 59;
        } else {
            class124.field1967[186] = 57;
            class124.field1967[187] = 27;
            class124.field1967[188] = 71;
            class124.field1967[189] = 26;
            class124.field1967[190] = 72;
            class124.field1967[191] = 73;
            class124.field1967[192] = 58;
            class124.field1967[219] = 42;
            class124.field1967[220] = 74;
            class124.field1967[221] = 43;
            class124.field1967[222] = 59;
            class124.field1967[223] = 28;
        }
        class124.method2813(Statics.field128);
        Canvas var1 = Statics.field128;
        var1.addMouseListener(class127.field2007);
        var1.addMouseMotionListener(class127.field2007);
        var1.addFocusListener(class127.field2007);
        Statics.field127 = class118.method820();
        if (Statics.field127 != null) {
            Statics.field127.method2359(Statics.field128);
        }
        Statics.field253 = new class121(255, class136.field2086, class136.field2081, 500000);
        Statics.field92 = class9.method69();
        Statics.field230 = this.getToolkit().getSystemClipboard();
        class125.method2387(this, Statics.field2051);
        if (field269 != 0) {
            field435 = true;
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method452() {
        field318++;
        this.method393();
        while (true) {
            class177 var1 = class149.field2478;
            class148 var2;
            synchronized (class149.field2478) {
                var2 = (class148) class149.field2477.method3120();
            }
            if (var2 == null) {
                try {
                    if (class161.field2700 == 1) {
                        int var4 = Statics.field2709.method2938();
                        if (var4 > 0 && Statics.field2709.method3001()) {
                            int var5 = var4 - Statics.field1015;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2709.method2960(var5);
                        } else {
                            Statics.field2709.method3012();
                            Statics.field2709.method2941();
                            if (Statics.field1924 == null) {
                                class161.field2700 = 0;
                            } else {
                                class161.field2700 = 2;
                            }
                            Statics.field2707 = null;
                            Statics.field628 = null;
                        }
                    }
                } catch (Exception var167) {
                    var167.printStackTrace();
                    Statics.field2709.method3012();
                    class161.field2700 = 0;
                    Statics.field2707 = null;
                    Statics.field628 = null;
                    Statics.field1924 = null;
                }
                method79();
                class124.method2354();
                class127 var7 = class127.field2007;
                synchronized (class127.field2007) {
                    class127.field2002 = class127.field1999;
                    class127.field2003 = class127.field2013;
                    class127.field2004 = class127.field2005;
                    class127.field2009 = class127.field2001;
                    class127.field2010 = class127.field2006;
                    class127.field2011 = class127.field2012;
                    class127.field2017 = class127.field2008;
                    class127.field2001 = 0;
                }
                if (Statics.field127 != null) {
                    int var9 = Statics.field127.method2373();
                    field370 = var9;
                }
                if (field274 == 0) {
                    method1998();
                    class131.method2453();
                } else if (field274 == 5) {
                    class28.method2305(this);
                    method1998();
                    class131.method2453();
                } else if (field274 == 10 || field274 == 11) {
                    class28.method2305(this);
                } else if (field274 == 20) {
                    class28.method2305(this);
                    method2342();
                } else if (field274 == 25) {
                    method2613(false);
                    field454 = 0;
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field522.length; var11++) {
                        if (Statics.field180[var11] != -1 && Statics.field522[var11] == null) {
                            Statics.field522[var11] = Statics.field1884.method2709(Statics.field180[var11], 0);
                            if (Statics.field522[var11] == null) {
                                var10 = false;
                                field454++;
                            }
                        }
                        if (Statics.field2395[var11] != -1 && Statics.field694[var11] == null) {
                            Statics.field694[var11] = Statics.field1884.method2684(Statics.field2395[var11], 0, Statics.field202[var11]);
                            if (Statics.field694[var11] == null) {
                                var10 = false;
                                field454++;
                            }
                        }
                    }
                    if (var10) {
                        field321 = 0;
                        boolean var12 = true;
                        for (int var13 = 0; var13 < Statics.field522.length; var13++) {
                            byte[] var14 = Statics.field694[var13];
                            if (var14 != null) {
                                int var15 = (Statics.field794[var13] >> 8) * 64 - Statics.field1075;
                                int var16 = (Statics.field794[var13] & 0xFF) * 64 - Statics.field1673;
                                if (field325) {
                                    var15 = 10;
                                    var16 = 10;
                                }
                                var12 &= class6.method818(var14, var15, var16);
                            }
                        }
                        if (var12) {
                            if (field323 != 0) {
                                method3046(class142.field2150 + class2.field20 + class2.field15 + 100 + "%" + class2.field18, true);
                            }
                            method79();
                            method2252();
                            method79();
                            Statics.field2098.method1570();
                            method79();
                            System.gc();
                            for (int var17 = 0; var17 < 4; var17++) {
                                field324[var17].method3377();
                            }
                            for (int var18 = 0; var18 < 4; var18++) {
                                for (int var19 = 0; var19 < 104; var19++) {
                                    for (int var20 = 0; var20 < 104; var20++) {
                                        class6.field78[var18][var19][var20] = 0;
                                    }
                                }
                            }
                            method79();
                            class6.field84 = 99;
                            Statics.field82 = new byte[4][104][104];
                            Statics.field81 = new byte[4][104][104];
                            Statics.field73 = new byte[4][104][104];
                            Statics.field2481 = new byte[4][104][104];
                            Statics.field52 = new int[4][105][105];
                            Statics.field1073 = new byte[4][105][105];
                            Statics.field90 = new int[105][105];
                            Statics.field1893 = new int[104];
                            Statics.field1019 = new int[104];
                            Statics.field2389 = new int[104];
                            Statics.field57 = new int[104];
                            Statics.field217 = new int[104];
                            int var21 = Statics.field522.length;
                            class20.method836();
                            method2613(true);
                            if (!field325) {
                                int var22 = 0;
                                label663: while (true) {
                                    if (var22 >= var21) {
                                        for (int var36 = 0; var36 < var21; var36++) {
                                            int var37 = (Statics.field794[var36] >> 8) * 64 - Statics.field1075;
                                            int var38 = (Statics.field794[var36] & 0xFF) * 64 - Statics.field1673;
                                            byte[] var39 = Statics.field522[var36];
                                            if (var39 == null && Statics.field2756 < 800) {
                                                method79();
                                                Statics.method588(var37, var38, 64, 64);
                                            }
                                        }
                                        method2613(true);
                                        int var40 = 0;
                                        while (true) {
                                            if (var40 >= var21) {
                                                break label663;
                                            }
                                            byte[] var41 = Statics.field694[var40];
                                            if (var41 != null) {
                                                int var42 = (Statics.field794[var40] >> 8) * 64 - Statics.field1075;
                                                int var43 = (Statics.field794[var40] & 0xFF) * 64 - Statics.field1673;
                                                method79();
                                                class79 var44 = Statics.field2098;
                                                class197[] var45 = field324;
                                                class107 var46 = new class107(var41);
                                                int var47 = -1;
                                                while (true) {
                                                    int var48 = var46.method2078();
                                                    if (var48 == 0) {
                                                        break;
                                                    }
                                                    var47 += var48;
                                                    int var49 = 0;
                                                    while (true) {
                                                        int var50 = var46.method2078();
                                                        if (var50 == 0) {
                                                            break;
                                                        }
                                                        var49 += var50 - 1;
                                                        int var51 = var49 & 0x3F;
                                                        int var52 = var49 >> 6 & 0x3F;
                                                        int var53 = var49 >> 12;
                                                        int var54 = var46.method2123();
                                                        int var55 = var54 >> 2;
                                                        int var56 = var54 & 0x3;
                                                        int var57 = var42 + var52;
                                                        int var58 = var43 + var51;
                                                        if (var57 > 0 && var58 > 0 && var57 < 103 && var58 < 103) {
                                                            int var59 = var53;
                                                            if ((class6.field78[1][var57][var58] & 0x2) == 2) {
                                                                var59 = var53 - 1;
                                                            }
                                                            class197 var60 = null;
                                                            if (var59 >= 0) {
                                                                var60 = var45[var59];
                                                            }
                                                            class6.method2497(var53, var57, var58, var47, var56, var55, var44, var60);
                                                        }
                                                    }
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                    int var23 = (Statics.field794[var22] >> 8) * 64 - Statics.field1075;
                                    int var24 = (Statics.field794[var22] & 0xFF) * 64 - Statics.field1673;
                                    byte[] var25 = Statics.field522[var22];
                                    if (var25 != null) {
                                        method79();
                                        int var26 = Statics.field967 * 8 - 48;
                                        int var27 = Statics.field2756 * 8 - 48;
                                        class197[] var28 = field324;
                                        int var29 = 0;
                                        label660: while (true) {
                                            if (var29 >= 4) {
                                                class107 var32 = new class107(var25);
                                                int var33 = 0;
                                                while (true) {
                                                    if (var33 >= 4) {
                                                        break label660;
                                                    }
                                                    for (int var34 = 0; var34 < 64; var34++) {
                                                        for (int var35 = 0; var35 < 64; var35++) {
                                                            Statics.method585(var32, var33, var23 + var34, var24 + var35, var26, var27, 0);
                                                        }
                                                    }
                                                    var33++;
                                                }
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    if (var23 + var30 > 0 && var23 + var30 < 103 && var24 + var31 > 0 && var24 + var31 < 103) {
                                                        var28[var29].field2946[var23 + var30][var24 + var31] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    var22++;
                                }
                            }
                            if (field325) {
                                int var61 = 0;
                                label596: while (true) {
                                    if (var61 >= 4) {
                                        for (int var100 = 0; var100 < 13; var100++) {
                                            for (int var101 = 0; var101 < 13; var101++) {
                                                int var102 = field326[0][var100][var101];
                                                if (var102 == -1) {
                                                    Statics.method588(var100 * 8, var101 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2613(true);
                                        int var103 = 0;
                                        while (true) {
                                            if (var103 >= 4) {
                                                break label596;
                                            }
                                            method79();
                                            for (int var104 = 0; var104 < 13; var104++) {
                                                label485: for (int var105 = 0; var105 < 13; var105++) {
                                                    int var106 = field326[var103][var104][var105];
                                                    if (var106 != -1) {
                                                        int var107 = var106 >> 24 & 0x3;
                                                        int var108 = var106 >> 1 & 0x3;
                                                        int var109 = var106 >> 14 & 0x3FF;
                                                        int var110 = var106 >> 3 & 0x7FF;
                                                        int var111 = (var109 / 8 << 8) + var110 / 8;
                                                        for (int var112 = 0; var112 < Statics.field794.length; var112++) {
                                                            if (Statics.field794[var112] == var111 && Statics.field694[var112] != null) {
                                                                byte[] var113 = Statics.field694[var112];
                                                                int var114 = var104 * 8;
                                                                int var115 = var105 * 8;
                                                                int var116 = (var109 & 0x7) * 8;
                                                                int var117 = (var110 & 0x7) * 8;
                                                                class79 var118 = Statics.field2098;
                                                                class197[] var119 = field324;
                                                                class107 var120 = new class107(var113);
                                                                int var121 = -1;
                                                                while (true) {
                                                                    int var122 = var120.method2078();
                                                                    if (var122 == 0) {
                                                                        continue label485;
                                                                    }
                                                                    var121 += var122;
                                                                    int var123 = 0;
                                                                    while (true) {
                                                                        int var124 = var120.method2078();
                                                                        if (var124 == 0) {
                                                                            break;
                                                                        }
                                                                        var123 += var124 - 1;
                                                                        int var125 = var123 & 0x3F;
                                                                        int var126 = var123 >> 6 & 0x3F;
                                                                        int var127 = var123 >> 12;
                                                                        int var128 = var120.method2123();
                                                                        int var129 = var128 >> 2;
                                                                        int var130 = var128 & 0x3;
                                                                        if (var107 == var127 && var126 >= var116 && var126 < var116 + 8 && var125 >= var117 && var125 < var117 + 8) {
                                                                            class36 var131 = class36.method809(var121);
                                                                            int var133 = var126 & 0x7;
                                                                            int var134 = var125 & 0x7;
                                                                            int var136 = var131.field896;
                                                                            int var137 = var131.field861;
                                                                            if ((var130 & 0x1) == 1) {
                                                                                int var138 = var136;
                                                                                var136 = var137;
                                                                                var137 = var138;
                                                                            }
                                                                            int var139 = var108 & 0x3;
                                                                            int var140;
                                                                            if (var139 == 0) {
                                                                                var140 = var133;
                                                                            } else if (var139 == 1) {
                                                                                var140 = var134;
                                                                            } else if (var139 == 2) {
                                                                                var140 = 7 - var133 - (var136 - 1);
                                                                            } else {
                                                                                var140 = 7 - var134 - (var137 - 1);
                                                                            }
                                                                            int var141 = var114 + var140;
                                                                            int var143 = var126 & 0x7;
                                                                            int var144 = var125 & 0x7;
                                                                            int var146 = var131.field896;
                                                                            int var147 = var131.field861;
                                                                            if ((var130 & 0x1) == 1) {
                                                                                int var148 = var146;
                                                                                var146 = var147;
                                                                                var147 = var148;
                                                                            }
                                                                            int var149 = var108 & 0x3;
                                                                            int var150;
                                                                            if (var149 == 0) {
                                                                                var150 = var144;
                                                                            } else if (var149 == 1) {
                                                                                var150 = 7 - var143 - (var146 - 1);
                                                                            } else if (var149 == 2) {
                                                                                var150 = 7 - var144 - (var147 - 1);
                                                                            } else {
                                                                                var150 = var143;
                                                                            }
                                                                            int var151 = var115 + var150;
                                                                            if (var141 > 0 && var151 > 0 && var141 < 103 && var151 < 103) {
                                                                                int var152 = var103;
                                                                                if ((class6.field78[1][var141][var151] & 0x2) == 2) {
                                                                                    var152 = var103 - 1;
                                                                                }
                                                                                class197 var153 = null;
                                                                                if (var152 >= 0) {
                                                                                    var153 = var119[var152];
                                                                                }
                                                                                class6.method2497(var103, var141, var151, var121, var108 + var130 & 0x3, var129, var118, var153);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var103++;
                                        }
                                    }
                                    method79();
                                    for (int var62 = 0; var62 < 13; var62++) {
                                        for (int var63 = 0; var63 < 13; var63++) {
                                            boolean var64 = false;
                                            int var65 = field326[var61][var62][var63];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field794.length; var71++) {
                                                    if (Statics.field794[var71] == var70 && Statics.field522[var71] != null) {
                                                        byte[] var72 = Statics.field522[var71];
                                                        int var73 = var62 * 8;
                                                        int var74 = var63 * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        class197[] var77 = field324;
                                                        for (int var78 = 0; var78 < 8; var78++) {
                                                            for (int var79 = 0; var79 < 8; var79++) {
                                                                if (var73 + var78 > 0 && var73 + var78 < 103 && var74 + var79 > 0 && var74 + var79 < 103) {
                                                                    var77[var61].field2946[var73 + var78][var74 + var79] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class107 var80 = new class107(var72);
                                                        for (int var81 = 0; var81 < 4; var81++) {
                                                            for (int var82 = 0; var82 < 64; var82++) {
                                                                for (int var83 = 0; var83 < 64; var83++) {
                                                                    if (var66 == var81 && var82 >= var75 && var82 < var75 + 8 && var83 >= var76 && var83 < var76 + 8) {
                                                                        int var86 = var73 + class155.method2014(var82 & 0x7, var83 & 0x7, var67);
                                                                        int var88 = var82 & 0x7;
                                                                        int var89 = var83 & 0x7;
                                                                        int var91 = var67 & 0x3;
                                                                        int var92;
                                                                        if (var91 == 0) {
                                                                            var92 = var89;
                                                                        } else if (var91 == 1) {
                                                                            var92 = 7 - var88;
                                                                        } else if (var91 == 2) {
                                                                            var92 = 7 - var89;
                                                                        } else {
                                                                            var92 = var88;
                                                                        }
                                                                        Statics.method585(var80, var61, var86, var74 + var92, 0, 0, var67);
                                                                    } else {
                                                                        Statics.method585(var80, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var64 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var64) {
                                                int var93 = var61;
                                                int var94 = var62 * 8;
                                                int var95 = var63 * 8;
                                                for (int var96 = 0; var96 < 8; var96++) {
                                                    for (int var97 = 0; var97 < 8; var97++) {
                                                        class6.field93[var93][var94 + var96][var95 + var97] = 0;
                                                    }
                                                }
                                                if (var94 > 0) {
                                                    for (int var98 = 1; var98 < 8; var98++) {
                                                        class6.field93[var93][var94][var95 + var98] = class6.field93[var93][var94 - 1][var95 + var98];
                                                    }
                                                }
                                                if (var95 > 0) {
                                                    for (int var99 = 1; var99 < 8; var99++) {
                                                        class6.field93[var93][var94 + var99][var95] = class6.field93[var93][var94 + var99][var95 - 1];
                                                    }
                                                }
                                                if (var94 > 0 && class6.field93[var93][var94 - 1][var95] != 0) {
                                                    class6.field93[var93][var94][var95] = class6.field93[var93][var94 - 1][var95];
                                                } else if (var95 > 0 && class6.field93[var93][var94][var95 - 1] != 0) {
                                                    class6.field93[var93][var94][var95] = class6.field93[var93][var94][var95 - 1];
                                                } else if (var94 > 0 && var95 > 0 && class6.field93[var93][var94 - 1][var95 - 1] != 0) {
                                                    class6.field93[var93][var94][var95] = class6.field93[var93][var94 - 1][var95 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var61++;
                                }
                            }
                            method2613(true);
                            method2252();
                            method79();
                            class6.method2600(Statics.field2098, field324);
                            method2613(true);
                            int var154 = class6.field84;
                            if (var154 > Statics.field1896) {
                                var154 = Statics.field1896;
                            }
                            if (var154 < Statics.field1896 - 1) {
                                int var155 = Statics.field1896 - 1;
                            }
                            if (field471) {
                                Statics.field2098.method1672(class6.field84);
                            } else {
                                Statics.field2098.method1672(0);
                            }
                            for (int var156 = 0; var156 < 104; var156++) {
                                for (int var157 = 0; var157 < 104; var157++) {
                                    method2430(var156, var157);
                                }
                            }
                            method79();
                            for (class15 var158 = (class15) field399.method3122(); var158 != null; var158 = (class15) field399.method3124()) {
                                if (var158.field216 == -1) {
                                    var158.field215 = 0;
                                    method2253(var158);
                                } else {
                                    var158.method3204();
                                }
                            }
                            class36.field848.method3065();
                            if (Statics.field2456 != null) {
                                field386.method2319(131);
                                field386.method2054(1057001181);
                            }
                            if (!field325) {
                                int var159 = (Statics.field967 - 6) / 8;
                                int var160 = (Statics.field967 + 6) / 8;
                                int var161 = (Statics.field2756 - 6) / 8;
                                int var162 = (Statics.field2756 + 6) / 8;
                                for (int var163 = var159 - 1; var163 <= var160 + 1; var163++) {
                                    for (int var164 = var161 - 1; var164 <= var162 + 1; var164++) {
                                        if (var163 < var159 || var163 > var160 || var164 < var161 || var164 > var162) {
                                            Statics.field1884.method2660("m" + var163 + "_" + var164);
                                            Statics.field1884.method2660("l" + var163 + "_" + var164);
                                        }
                                    }
                                }
                            }
                            method3054(30);
                            method79();
                            Statics.field82 = (byte[][][]) null;
                            Statics.field81 = (byte[][][]) null;
                            Statics.field73 = (byte[][][]) null;
                            Statics.field2481 = (byte[][][]) null;
                            Statics.field52 = (int[][][]) null;
                            Statics.field1073 = (byte[][][]) null;
                            Statics.field90 = (int[][]) null;
                            Statics.field1893 = null;
                            Statics.field1019 = null;
                            Statics.field2389 = null;
                            Statics.field57 = null;
                            Statics.field217 = null;
                            field386.method2319(176);
                            class131.method2453();
                        } else {
                            field323 = 2;
                        }
                    } else {
                        field323 = 1;
                    }
                }
                if (field274 == 30) {
                    method2855();
                } else if (field274 == 40 || field274 == 45) {
                    method2342();
                }
                return;
            }
            var2.field2475.method2725(var2.field2471, (int) var2.field2874, var2.field2470, false);
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method165() {
        boolean var1;
        label130: {
            try {
                if (class161.field2700 == 2) {
                    if (Statics.field2707 == null) {
                        Statics.field2707 = class158.method2858(Statics.field1924, Statics.field2705, Statics.field240);
                        if (Statics.field2707 == null) {
                            var1 = false;
                            break label130;
                        }
                    }
                    if (Statics.field628 == null) {
                        Statics.field628 = new class53(Statics.field2702, Statics.field2701);
                    }
                    if (Statics.field2709.method2958(Statics.field2707, Statics.field2704, Statics.field628, 22050)) {
                        Statics.field2709.method2940();
                        Statics.field2709.method2960(Statics.field2706);
                        Statics.field2709.method2942(Statics.field2707, Statics.field2744);
                        class161.field2700 = 0;
                        Statics.field2707 = null;
                        Statics.field628 = null;
                        Statics.field1924 = null;
                        var1 = true;
                        break label130;
                    }
                }
            } catch (Exception var16) {
                var16.printStackTrace();
                Statics.field2709.method3012();
                class161.field2700 = 0;
                Statics.field2707 = null;
                Statics.field628 = null;
                Statics.field1924 = null;
            }
            var1 = false;
        }
        if (var1 && field498 && Statics.field147 != null) {
            Statics.field147.method968();
        }
        if (field2052) {
            class124.method2495(Statics.field128);
            Canvas var4 = Statics.field128;
            var4.removeMouseListener(class127.field2007);
            var4.removeMouseMotionListener(class127.field2007);
            var4.removeFocusListener(class127.field2007);
            class127.field1999 = 0;
            if (Statics.field127 != null) {
                Statics.field127.method2360(Statics.field128);
            }
            this.method2528();
            class124.method2813(Statics.field128);
            Canvas var5 = Statics.field128;
            var5.addMouseListener(class127.field2007);
            var5.addMouseMotionListener(class127.field2007);
            var5.addFocusListener(class127.field2007);
            if (Statics.field127 != null) {
                Statics.field127.method2359(Statics.field128);
            }
        }
        if (field274 == 0) {
            Statics.method1732(class28.field672, class28.field673, (Color) null);
        } else if (field274 == 5) {
            class28.method2324(Statics.field48, Statics.field710);
        } else if (field274 == 10 || field274 == 11) {
            class28.method2324(Statics.field48, Statics.field710);
        } else if (field274 == 20) {
            class28.method2324(Statics.field48, Statics.field710);
        } else if (field274 == 25) {
            if (field323 == 1) {
                if (field454 > field271) {
                    field271 = field454;
                }
                int var6 = (field271 * 50 - field454 * 50) / field271;
                method3046(class142.field2150 + class2.field20 + class2.field15 + var6 + "%" + class2.field18, false);
            } else if (field323 == 2) {
                if (field321 > field322) {
                    field322 = field321;
                }
                int var7 = (field322 * 50 - field321 * 50) / field322 + 50;
                method3046(class142.field2150 + class2.field20 + class2.field15 + var7 + "%" + class2.field18, false);
            } else {
                method3046(class142.field2150, false);
            }
        } else if (field274 == 30) {
            method2609();
        } else if (field274 == 40) {
            method3046(class142.field2151 + class2.field20 + class142.field2313, false);
        } else if (field274 == 45) {
            method3046(class142.field2299, false);
        }
        if (field274 == 30 && field390 == 0 && !field2044) {
            try {
                Graphics var8 = Statics.field128.getGraphics();
                for (int var9 = 0; var9 < field467; var9++) {
                    if (field470[var9]) {
                        Statics.field574.method1325(var8, field472[var9], field473[var9], field474[var9], field475[var9]);
                        field470[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field128.repaint();
            }
        } else if (field274 > 0) {
            try {
                Graphics var11 = Statics.field128.getGraphics();
                Statics.field574.method1324(var11, 0, 0);
                field2044 = false;
                for (int var12 = 0; var12 < field467; var12++) {
                    field470[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field128.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(B)V")
    public final void method166() {
        if (Statics.field952 != null) {
            Statics.field952.field174 = false;
        }
        Statics.field952 = null;
        if (Statics.field1992 != null) {
            Statics.field1992.method2504();
            Statics.field1992 = null;
        }
        if (class124.field1980 != null) {
            class124 var1 = class124.field1980;
            synchronized (class124.field1980) {
                class124.field1980 = null;
            }
        }
        class127.method528();
        Statics.field127 = null;
        if (Statics.field147 != null) {
            Statics.field147.method969();
        }
        if (Statics.field220 != null) {
            Statics.field220.method969();
        }
        if (Statics.field2482 != null) {
            Statics.field2482.method2504();
        }
        Object var3 = class149.field2479;
        synchronized (class149.field2479) {
            if (class149.field2476 != 0) {
                class149.field2476 = 1;
                try {
                    class149.field2479.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        Statics.method569();
    }

    @ObfuscatedName("ff.f(II)V")
    public static void method3054(int arg0) {
        if (field274 == arg0) {
            return;
        }
        if (field274 == 0) {
            class131.method577();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field298 = 0;
            field299 = 0;
            field300 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field305 != null) {
            Statics.field305.method2504();
            Statics.field305 = null;
        }
        if (field274 == 25) {
            field323 = 0;
            field454 = 0;
            field271 = 1;
            field321 = 0;
            field322 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method464(Statics.field128, Statics.field994, Statics.field1265, true, 0);
        } else if (arg0 == 20) {
            class28.method464(Statics.field128, Statics.field994, Statics.field1265, true, field274 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method464(Statics.field128, Statics.field994, Statics.field1265, false, 4);
        } else {
            class28.method30();
        }
        field274 = arg0;
    }

    @ObfuscatedName("client.x(I)V")
    public void method393() {
        if (field274 == 1000) {
            return;
        }
        long var1 = class103.method833();
        int var3 = (int) (var1 - Statics.field2503);
        Statics.field2503 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2483 += var3;
        boolean var4;
        if (class150.field2505 == 0 && class150.field2484 == 0 && class150.field2491 == 0 && class150.field2486 == 0) {
            var4 = true;
        } else if (Statics.field2482 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2483 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2484 < 20 && class150.field2486 > 0) {
                        class151 var5 = (class151) class150.field2485.method3096();
                        class107 var6 = new class107(4);
                        var6.method2051(1);
                        var6.method2053((int) var5.field2874);
                        Statics.field2482.method2509(var6.field1840, 0, 4);
                        class150.field2496.method3091(var5, var5.field2874);
                        class150.field2486--;
                        class150.field2484++;
                    }
                    while (class150.field2505 < 20 && class150.field2491 > 0) {
                        class151 var7 = (class151) class150.field2489.method3174();
                        class107 var8 = new class107(4);
                        var8.method2051(0);
                        var8.method2053((int) var7.field2874);
                        Statics.field2482.method2509(var8.field1840, 0, 4);
                        var7.method3187();
                        class150.field2493.method3091(var7, var7.field2874);
                        class150.field2491--;
                        class150.field2505++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2482.method2507();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2483 = 0;
                        byte var11 = 0;
                        if (Statics.field2670 == null) {
                            var11 = 8;
                        } else if (class150.field2497 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2494.field1841;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2482.method2508(class150.field2494.field1840, class150.field2494.field1841, var12);
                            if (class150.field2500 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2494.field1840[class150.field2494.field1841 + var13] ^= class150.field2500;
                                }
                            }
                            class150.field2494.field1841 += var12;
                            if (class150.field2494.field1841 < var11) {
                                break;
                            }
                            if (Statics.field2670 == null) {
                                class150.field2494.field1841 = 0;
                                int var14 = class150.field2494.method2123();
                                int var15 = class150.field2494.method2232();
                                int var16 = class150.field2494.method2123();
                                int var17 = class150.field2494.method2207();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2496.method3092(var18);
                                Statics.field1814 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2493.method3092(var18);
                                    Statics.field1814 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2670 = var20;
                                Statics.field2495 = new class107(var17 + var21 + Statics.field2670.field2508);
                                Statics.field2495.method2051(var16);
                                Statics.field2495.method2054(var17);
                                class150.field2497 = 8;
                                class150.field2494.field1841 = 0;
                            } else if (class150.field2497 == 0) {
                                if (class150.field2494.field1840[0] == -1) {
                                    class150.field2497 = 1;
                                    class150.field2494.field1841 = 0;
                                } else {
                                    Statics.field2670 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2495.field1840.length - Statics.field2670.field2508;
                            int var23 = 512 - class150.field2497;
                            if (var23 > var22 - Statics.field2495.field1841) {
                                var23 = var22 - Statics.field2495.field1841;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2482.method2508(Statics.field2495.field1840, Statics.field2495.field1841, var23);
                            if (class150.field2500 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2495.field1840[Statics.field2495.field1841 + var24] ^= class150.field2500;
                                }
                            }
                            Statics.field2495.field1841 += var23;
                            class150.field2497 += var23;
                            if (Statics.field2495.field1841 == var22) {
                                if (Statics.field2670.field2874 == 16711935L) {
                                    Statics.field2498 = Statics.field2495;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2499[var25];
                                        if (var26 != null) {
                                            Statics.field2498.field1841 = var25 * 8 + 5;
                                            int var27 = Statics.field2498.method2207();
                                            int var28 = Statics.field2498.method2207();
                                            var26.method2747(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2492.reset();
                                    class150.field2492.update(Statics.field2495.field1840, 0, var22);
                                    int var29 = (int) class150.field2492.getValue();
                                    if (Statics.field2670.field2507 != var29) {
                                        try {
                                            Statics.field2482.method2504();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2501++;
                                        Statics.field2482 = null;
                                        class150.field2500 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2501 = 0;
                                    class150.field2502 = 0;
                                    Statics.field2670.field2506.method2722((int) (Statics.field2670.field2874 & 0xFFFFL), Statics.field2495.field1840, (Statics.field2670.field2874 & 0xFF0000L) == 16711680L, Statics.field1814);
                                }
                                Statics.field2670.method3204();
                                if (Statics.field1814) {
                                    class150.field2484--;
                                } else {
                                    class150.field2505--;
                                }
                                class150.field2497 = 0;
                                Statics.field2670 = null;
                                Statics.field2495 = null;
                            } else {
                                if (class150.field2497 != 512) {
                                    break;
                                }
                                class150.field2497 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2482.method2504();
                } catch (Exception var34) {
                }
                class150.field2502++;
                Statics.field2482 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method168();
        }
    }

    @ObfuscatedName("client.h(I)V")
    public void method168() {
        if (class150.field2501 >= 4) {
            this.method2536("js5crc");
            field274 = 1000;
            return;
        }
        if (class150.field2502 >= 4) {
            if (field274 <= 5) {
                this.method2536("js5io");
                field274 = 1000;
                return;
            }
            field296 = 3000;
            class150.field2502 = 3;
        }
        if (--field296 + 1 > 0) {
            return;
        }
        try {
            if (field282 == 0) {
                Statics.field1881 = Statics.field1450.method2413(Statics.field2096, Statics.field912);
                field282++;
            }
            if (field282 == 1) {
                if (Statics.field1881.field2064 == 2) {
                    this.method169(-1);
                    return;
                }
                if (Statics.field1881.field2064 == 1) {
                    field282++;
                }
            }
            if (field282 == 2) {
                Statics.field170 = new class130((Socket) Statics.field1881.field2067, Statics.field1450);
                class107 var1 = new class107(5);
                var1.method2051(15);
                var1.method2054(53);
                Statics.field170.method2509(var1.field1840, 0, 5);
                field282++;
                Statics.field1271 = class103.method833();
            }
            if (field282 == 3) {
                if (field274 <= 5 || Statics.field170.method2507() > 0) {
                    int var2 = Statics.field170.method2522();
                    if (var2 != 0) {
                        this.method169(var2);
                        return;
                    }
                    field282++;
                } else if (class103.method833() - Statics.field1271 > 30000L) {
                    this.method169(-2);
                    return;
                }
            }
            if (field282 == 4) {
                class150.method848(Statics.field170, field274 > 20);
                Statics.field1881 = null;
                Statics.field170 = null;
                field282 = 0;
                field297 = 0;
            }
        } catch (IOException var4) {
            this.method169(-3);
        }
    }

    @ObfuscatedName("client.a(II)V")
    public void method169(int arg0) {
        Statics.field1881 = null;
        Statics.field170 = null;
        field282 = 0;
        if (Statics.field912 == Statics.field115) {
            Statics.field912 = Statics.field2073;
        } else {
            Statics.field912 = Statics.field115;
        }
        field297++;
        if (field297 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field274 <= 5) {
                this.method2536("js5connect_full");
                field274 = 1000;
            } else {
                field296 = 3000;
            }
        } else if (field297 >= 2 && arg0 == 6) {
            this.method2536("js5connect_outofdate");
            field274 = 1000;
        } else if (field297 >= 4) {
            if (field274 <= 5) {
                this.method2536("js5connect");
                field274 = 1000;
            } else {
                field296 = 3000;
            }
        }
    }

    @ObfuscatedName("cm.u(I)V")
    public static void method1998() {
        if (field396 == 0) {
            Statics.field2098 = new class79(4, 104, 104, class6.field93);
            for (int var0 = 0; var0 < 4; var0++) {
                field324[var0] = new class197(104, 104);
            }
            Statics.field1867 = new class72(512, 512);
            class28.field673 = class142.field2153;
            class28.field672 = 5;
            field396 = 20;
        } else if (field396 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1465[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1605(var1, 500, 800, 512, 334);
            class28.field673 = class142.field2154;
            class28.field672 = 10;
            field396 = 30;
        } else if (field396 == 30) {
            Statics.field2069 = method77(0, false, true, true);
            Statics.field1993 = method77(1, false, true, true);
            Statics.field995 = method77(2, true, false, true);
            Statics.field197 = method77(3, false, true, true);
            Statics.field2745 = method77(4, false, true, true);
            Statics.field1884 = method77(5, true, true, true);
            Statics.field1906 = method77(6, true, true, false);
            Statics.field1020 = method77(7, false, true, true);
            Statics.field1265 = method77(8, false, true, true);
            Statics.field167 = method77(9, false, true, true);
            Statics.field994 = method77(10, false, true, true);
            Statics.field56 = method77(11, false, true, true);
            Statics.field2654 = method77(12, false, true, true);
            Statics.field605 = method77(13, true, false, true);
            Statics.field1580 = method77(14, false, true, false);
            Statics.field1460 = method77(15, false, true, true);
            class28.field673 = class142.field2155;
            class28.field672 = 20;
            field396 = 40;
        } else if (field396 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2069.method2720() * 4 / 100;
            int var8 = var7 + Statics.field1993.method2720() * 4 / 100;
            int var9 = var8 + Statics.field995.method2720() * 2 / 100;
            int var10 = var9 + Statics.field197.method2720() * 2 / 100;
            int var11 = var10 + Statics.field2745.method2720() * 6 / 100;
            int var12 = var11 + Statics.field1884.method2720() * 4 / 100;
            int var13 = var12 + Statics.field1906.method2720() * 2 / 100;
            int var14 = var13 + Statics.field1020.method2720() * 60 / 100;
            int var15 = var14 + Statics.field1265.method2720() * 2 / 100;
            int var16 = var15 + Statics.field167.method2720() * 2 / 100;
            int var17 = var16 + Statics.field994.method2720() * 2 / 100;
            int var18 = var17 + Statics.field56.method2720() * 2 / 100;
            int var19 = var18 + Statics.field2654.method2720() * 2 / 100;
            int var20 = var19 + Statics.field605.method2720() * 2 / 100;
            int var21 = var20 + Statics.field1580.method2720() * 2 / 100;
            int var22 = var21 + Statics.field1460.method2720() * 2 / 100;
            if (var22 == 100) {
                class28.field673 = class142.field2157;
                class28.field672 = 30;
                field396 = 45;
            } else {
                if (var22 != 0) {
                    class28.field673 = class142.field2308 + var22 + "%";
                }
                class28.field672 = 30;
            }
        } else if (field396 == 45) {
            boolean var23 = !field471;
            Statics.field1095 = 22050;
            Statics.field1761 = var23;
            Statics.field627 = 2;
            class162 var24 = new class162();
            var24.method2944(9, 128);
            Statics.field147 = class50.method2009(Statics.field1450, Statics.field128, 0, 22050);
            Statics.field147.method965(var24);
            Statics.method2367(Statics.field1460, Statics.field1580, Statics.field2745, var24);
            Statics.field220 = class50.method2009(Statics.field1450, Statics.field128, 1, 2048);
            Statics.field11 = new class49();
            Statics.field220.method965(Statics.field11);
            Statics.field173 = new class68(22050, Statics.field1095);
            class28.field673 = class142.field2158;
            class28.field672 = 35;
            field396 = 50;
        } else if (field396 == 50) {
            int var25 = 0;
            if (Statics.field710 == null) {
                class147 var26 = Statics.field1265;
                class147 var27 = Statics.field605;
                int var28 = var26.method2655("p11_full");
                int var29 = var26.method2656(var28, "");
                class193 var30 = class70.method596(var26, var27, var28, var29);
                Statics.field710 = var30;
            } else {
                var25++;
            }
            if (Statics.field1914 == null) {
                class147 var31 = Statics.field1265;
                class147 var32 = Statics.field605;
                int var33 = var31.method2655("p12_full");
                int var34 = var31.method2656(var33, "");
                class193 var35 = class70.method596(var31, var32, var33, var34);
                Statics.field1914 = var35;
            } else {
                var25++;
            }
            if (Statics.field48 == null) {
                class147 var36 = Statics.field1265;
                class147 var37 = Statics.field605;
                int var38 = var36.method2655("b12_full");
                int var39 = var36.method2656(var38, "");
                class193 var40 = class70.method596(var36, var37, var38, var39);
                Statics.field48 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class28.field673 = class142.field2350 + var25 * 100 / 3 + "%";
                class28.field672 = 40;
            } else {
                Statics.field2783 = new class145(true);
                class28.field673 = class142.field2160;
                class28.field672 = 40;
                field396 = 60;
            }
        } else if (field396 == 60) {
            int var41 = class28.method478(Statics.field994, Statics.field1265);
            int var42 = class28.method521();
            if (var41 < var42) {
                class28.field673 = class142.field2376 + var41 * 100 / var42 + "%";
                class28.field672 = 50;
            } else {
                class28.field673 = class142.field2177;
                class28.field672 = 50;
                method3054(5);
                field396 = 70;
            }
        } else if (field396 == 70) {
            if (Statics.field995.method2644()) {
                class147 var43 = Statics.field995;
                Statics.field973 = var43;
                class37.method503(Statics.field995);
                class147 var44 = Statics.field995;
                class147 var45 = Statics.field1020;
                Statics.field964 = var44;
                Statics.field955 = var45;
                Statics.field957 = Statics.field964.method2670(3);
                class36.method18(Statics.field995, Statics.field1020, field471);
                class35.method510(Statics.field995, Statics.field1020);
                class147 var46 = Statics.field995;
                class147 var47 = Statics.field1020;
                boolean var48 = field501;
                class193 var49 = Statics.field710;
                Statics.field1049 = var46;
                Statics.field1063 = var47;
                Statics.field1051 = var48;
                Statics.field1049.method2670(10);
                Statics.field1027 = var49;
                class38.method476(Statics.field995, Statics.field2069, Statics.field1993);
                class147 var50 = Statics.field995;
                class147 var51 = Statics.field1020;
                Statics.field945 = var50;
                Statics.field936 = var51;
                class147 var52 = Statics.field995;
                Statics.field997 = var52;
                class147 var53 = Statics.field995;
                Statics.field1074 = var53;
                Statics.field1069 = Statics.field1074.method2670(16);
                class147 var54 = Statics.field197;
                class147 var55 = Statics.field1020;
                class147 var56 = Statics.field1265;
                class147 var57 = Statics.field605;
                Statics.field2535 = var54;
                Statics.field2513 = var55;
                Statics.field2637 = var56;
                Statics.field2552 = var57;
                Statics.field2639 = new class152[Statics.field2535.method2688()][];
                Statics.field2511 = new boolean[Statics.field2535.method2688()];
                class44.method520(Statics.field995);
                class147 var58 = Statics.field995;
                Statics.field1012 = var58;
                class28.field673 = class142.field2164;
                class28.field672 = 60;
                field396 = 80;
            } else {
                class28.field673 = class142.field2241 + Statics.field995.method2727() + "%";
                class28.field672 = 60;
            }
        } else if (field396 == 80) {
            int var59 = 0;
            if (Statics.field1567 == null) {
                class147 var60 = Statics.field1265;
                int var61 = var60.method2655("compass");
                int var62 = var60.method2656(var61, "");
                class72 var63 = class70.method1(var60, var61, var62);
                Statics.field1567 = var63;
            } else {
                var59++;
            }
            if (Statics.field2878 == null) {
                class147 var64 = Statics.field1265;
                int var65 = var64.method2655("mapedge");
                int var66 = var64.method2656(var65, "");
                class72 var67 = class70.method1(var64, var65, var66);
                Statics.field2878 = var67;
            } else {
                var59++;
            }
            if (Statics.field179 == null) {
                Statics.field179 = class70.method2382(Statics.field1265, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field1823 == null) {
                Statics.field1823 = Statics.method3010(Statics.field1265, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field715 == null) {
                Statics.field715 = Statics.method3010(Statics.field1265, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field64 == null) {
                Statics.field64 = Statics.method3010(Statics.field1265, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field2965 == null) {
                Statics.field2965 = Statics.method3010(Statics.field1265, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field551 == null) {
                Statics.field551 = Statics.method3010(Statics.field1265, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field588 == null) {
                Statics.field588 = Statics.method3010(Statics.field1265, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field601 == null) {
                Statics.field601 = Statics.method3010(Statics.field1265, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field1352 == null) {
                Statics.field1352 = Statics.method3010(Statics.field1265, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field2813 == null) {
                Statics.field2813 = class70.method2382(Statics.field1265, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field122 == null) {
                Statics.field122 = class70.method2382(Statics.field1265, "mod_icons", "");
            } else {
                var59++;
            }
            if (Statics.field140 == null) {
                Statics.field140 = class70.method2814(Statics.field1265, "mapback", "");
            } else {
                var59++;
            }
            if (var59 < 14) {
                class28.field673 = class142.field2165 + var59 * 100 / 14 + "%";
                class28.field672 = 70;
            } else {
                Statics.field2906 = Statics.field122;
                Statics.field2878.method1439();
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 41.0D) - 20;
                for (int var72 = 0; var72 < Statics.field1823.length; var72++) {
                    Statics.field1823[var72].method1391(var68 + var71, var69 + var71, var70 + var71);
                }
                Statics.field179[0].method1541(var68 + var71, var69 + var71, var70 + var71);
                Statics.field49 = new int[33];
                Statics.field722 = new int[33];
                Statics.field697 = new int[151];
                Statics.field1763 = new int[151];
                for (int var73 = 0; var73 < 33; var73++) {
                    int var74 = 999;
                    int var75 = 0;
                    for (int var76 = 0; var76 < 34; var76++) {
                        if (Statics.field140.field1327[Statics.field140.field1328 * var73 + var76] == 0) {
                            if (var74 == 999) {
                                var74 = var76;
                            }
                        } else if (var74 != 999) {
                            var75 = var76;
                            break;
                        }
                    }
                    Statics.field49[var73] = var74;
                    Statics.field722[var73] = var75 - var74;
                }
                for (int var77 = 5; var77 < 156; var77++) {
                    int var78 = 999;
                    int var79 = 0;
                    for (int var80 = 25; var80 < 172; var80++) {
                        if (Statics.field140.field1327[Statics.field140.field1328 * var77 + var80] == 0 && var80 > 34 || var77 > 34) {
                            if (var78 == 999) {
                                var78 = var80;
                            }
                        } else if (var78 != 999) {
                            var79 = var80;
                            break;
                        }
                    }
                    Statics.field697[var77 - 5] = var78 - 25;
                    Statics.field1763[var77 - 5] = var79 - var78;
                }
                class28.field673 = class142.field2289;
                class28.field672 = 70;
                field396 = 90;
            }
        } else if (field396 == 90) {
            if (Statics.field167.method2644()) {
                class88 var81 = new class88(Statics.field167, Statics.field1265, 20, 0.8D, field471 ? 64 : 128);
                class84.method1737(var81);
                class84.method1743(0.8D);
                class28.field673 = class142.field2168;
                class28.field672 = 90;
                field396 = 110;
            } else {
                class28.field673 = class142.field2167 + Statics.field167.method2727() + "%";
                class28.field672 = 90;
            }
        } else if (field396 == 110) {
            Statics.field952 = new class12();
            Statics.field1450.method2414(Statics.field952, 10);
            class28.field673 = class142.field2169;
            class28.field672 = 94;
            field396 = 120;
        } else if (field396 == 120) {
            if (Statics.field994.method2658("huffman", "")) {
                class102 var82 = new class102(Statics.field994.method2669("huffman", ""));
                Statics.field2902 = var82;
                class28.field673 = class142.field2190;
                class28.field672 = 96;
                field396 = 130;
            } else {
                class28.field673 = class142.field2378 + "%";
                class28.field672 = 96;
            }
        } else if (field396 == 130) {
            if (!Statics.field197.method2644()) {
                class28.field673 = class142.field2172 + Statics.field197.method2727() * 4 / 5 + "%";
                class28.field672 = 100;
            } else if (!Statics.field2654.method2644()) {
                class28.field673 = class142.field2172 + (80 + Statics.field2654.method2727() / 6) + "%";
                class28.field672 = 100;
            } else if (Statics.field605.method2644()) {
                class28.field673 = class142.field2152;
                class28.field672 = 100;
                field396 = 140;
            } else {
                class28.field673 = class142.field2172 + (96 + Statics.field605.method2727() / 20) + "%";
                class28.field672 = 100;
            }
        } else if (field396 == 140) {
            method3054(10);
        }
    }

    @ObfuscatedName("s.v(IZZZI)Lei;")
    public static class147 method77(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2086 != null) {
            var4 = new class121(arg0, class136.field2086, Statics.field1989[arg0], 1000000);
        }
        return new class147(var4, Statics.field253, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dz.i(B)V")
    public static final void method2342() {
        try {
            if (field298 == 0) {
                if (Statics.field1992 != null) {
                    Statics.field1992.method2504();
                    Statics.field1992 = null;
                }
                Statics.field2644 = null;
                field476 = false;
                field299 = 0;
                field298 = 1;
            }
            if (field298 == 1) {
                if (Statics.field2644 == null) {
                    Statics.field2644 = Statics.field1450.method2413(Statics.field2096, Statics.field912);
                }
                if (Statics.field2644.field2064 == 2) {
                    throw new IOException();
                }
                if (Statics.field2644.field2064 == 1) {
                    Statics.field1992 = new class130((Socket) Statics.field2644.field2067, Statics.field1450);
                    Statics.field2644 = null;
                    field298 = 2;
                }
            }
            if (field298 == 2) {
                field386.field1841 = 0;
                field386.method2051(14);
                Statics.field1992.method2509(field386.field1840, 0, 1);
                field308.field1841 = 0;
                field298 = 3;
            }
            if (field298 == 3) {
                if (Statics.field147 != null) {
                    Statics.field147.method967();
                }
                if (Statics.field220 != null) {
                    Statics.field220.method967();
                }
                int var0 = Statics.field1992.method2522();
                if (Statics.field147 != null) {
                    Statics.field147.method967();
                }
                if (Statics.field220 != null) {
                    Statics.field220.method967();
                }
                if (var0 != 0) {
                    method997(var0);
                    return;
                }
                field308.field1841 = 0;
                field298 = 5;
            }
            if (field298 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field386.field1841 = 0;
                field386.method2051(1);
                field386.method2051(class28.field688.method468());
                field386.method2054(var1[0]);
                field386.method2054(var1[1]);
                field386.method2054(var1[2]);
                field386.method2054(var1[3]);
                switch(class28.field688.field2397) {
                    case 0:
                    case 3:
                        field386.method2053(Statics.field681);
                        field386.field1841 += 5;
                        break;
                    case 1:
                        field386.field1841 += 8;
                        break;
                    case 2:
                        field386.method2054((Integer) Statics.field92.field142.get(class199.method2635(class28.field668)));
                        field386.field1841 += 4;
                }
                field386.method2056(class28.field684);
                field386.method2083(class5.field65, class5.field76);
                field307.field1841 = 0;
                if (field274 == 40) {
                    field307.method2051(18);
                } else {
                    field307.method2051(16);
                }
                field307.method2052(0);
                int var2 = field307.field1841;
                field307.method2054(53);
                field307.method2059(field386.field1840, 0, field386.field1841);
                int var3 = field307.field1841;
                field307.method2056(class28.field668);
                field307.method2051(field471 ? 1 : 0);
                class110 var4 = field307;
                byte[] var5 = new byte[24];
                try {
                    class136.field2085.method3353(0L);
                    class136.field2085.method3367(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var36) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2059(var5, 0, 24);
                class107 var9 = new class107(Statics.field2783.method2624());
                Statics.field2783.method2631(var9);
                field307.method2059(var9.field1840, 0, var9.field1840.length);
                field307.method2054(Statics.field2069.field2451);
                field307.method2054(Statics.field1993.field2451);
                field307.method2054(Statics.field995.field2451);
                field307.method2054(Statics.field197.field2451);
                field307.method2054(Statics.field2745.field2451);
                field307.method2054(Statics.field1884.field2451);
                field307.method2054(Statics.field1906.field2451);
                field307.method2054(Statics.field1020.field2451);
                field307.method2054(Statics.field1265.field2451);
                field307.method2054(Statics.field167.field2451);
                field307.method2054(Statics.field994.field2451);
                field307.method2054(Statics.field56.field2451);
                field307.method2054(Statics.field2654.field2451);
                field307.method2054(Statics.field605.field2451);
                field307.method2054(Statics.field1580.field2451);
                field307.method2054(Statics.field1460.field2451);
                field307.method2081(var1, var3, field307.field1841);
                field307.method2154(field307.field1841 - var2);
                Statics.field1992.method2509(field307.field1840, 0, field307.field1841);
                field386.method2297(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field308.method2297(var1);
                field298 = 6;
            }
            if (field298 == 6 && Statics.field1992.method2507() > 0) {
                int var11 = Statics.field1992.method2522();
                if (var11 == 21 && field274 == 20) {
                    field298 = 7;
                } else if (var11 == 2) {
                    field298 = 9;
                } else if (var11 == 15 && field274 == 40) {
                    method2791();
                    return;
                } else if (var11 == 23 && field300 < 1) {
                    field300++;
                    field298 = 0;
                } else {
                    method997(var11);
                    return;
                }
            }
            if (field298 == 7 && Statics.field1992.method2507() > 0) {
                field301 = (Statics.field1992.method2522() + 3) * 60;
                field298 = 8;
            }
            if (field298 == 8) {
                field299 = 0;
                class28.method469(class142.field2233, class142.field2178, field301 / 60 + class142.field2179);
                if (--field301 <= 0) {
                    field298 = 0;
                }
            } else {
                if (field298 == 9 && Statics.field1992.method2507() >= 13) {
                    boolean var12 = Statics.field1992.method2522() == 1;
                    Statics.field1992.method2508(field308.field1840, 0, 4);
                    field308.field1841 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field308.method2296() << 24;
                        int var15 = var14 | field308.method2296() << 16;
                        int var16 = var15 | field308.method2296() << 8;
                        int var17 = var16 | field308.method2296();
                        int var18 = class199.method2635(class28.field668);
                        if (Statics.field92.field142.size() >= 10 && !Statics.field92.field142.containsKey(var18)) {
                            Iterator var19 = Statics.field92.field142.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field92.field142.put(var18, var17);
                        class9.method819();
                    }
                    field432 = Statics.field1992.method2522();
                    field434 = Statics.field1992.method2522() == 1;
                    field389 = Statics.field1992.method2522();
                    field389 <<= 0x8;
                    field389 += Statics.field1992.method2522();
                    field317 = Statics.field1992.method2522();
                    Statics.field1992.method2508(field308.field1840, 0, 1);
                    field308.field1841 = 0;
                    field310 = field308.method2296();
                    Statics.field1992.method2508(field308.field1840, 0, 2);
                    field308.field1841 = 0;
                    field309 = field308.method2232();
                    if (field317 == 1) {
                        try {
                            class119.method2376(Statics.field264, "zap");
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class119.method2376(Statics.field264, "unzap");
                        } catch (Throwable var34) {
                        }
                    }
                    field298 = 10;
                }
                if (field298 != 10) {
                    field299++;
                    if (field299 > 2000) {
                        if (field300 < 1) {
                            if (Statics.field912 == Statics.field115) {
                                Statics.field912 = Statics.field2073;
                            } else {
                                Statics.field912 = Statics.field115;
                            }
                            field300++;
                            field298 = 0;
                        } else {
                            method997(-3);
                        }
                    }
                } else if (Statics.field1992.method2507() >= field309) {
                    field308.field1841 = 0;
                    Statics.field1992.method2508(field308.field1840, 0, field309);
                    field277 = 1L;
                    field280 = -1;
                    Statics.field952.field175 = 0;
                    Statics.field228 = true;
                    field347 = true;
                    field485 = -1L;
                    class189.method2295();
                    field386.field1841 = 0;
                    field308.field1841 = 0;
                    field310 = -1;
                    field514 = -1;
                    field460 = -1;
                    field495 = -1;
                    field412 = 0;
                    field283 = 0;
                    field371 = 0;
                    field284 = 0;
                    field320 = 0;
                    field406 = false;
                    class127.method3048(0);
                    class10.field156.clear();
                    class10.field154.method3114();
                    class10.field152.method3146();
                    class10.field153 = 0;
                    field418 = 0;
                    field420 = false;
                    field377 = 0;
                    field328 = (int) (Math.random() * 100.0D) - 50;
                    field330 = (int) (Math.random() * 110.0D) - 55;
                    field503 = (int) (Math.random() * 80.0D) - 40;
                    field335 = (int) (Math.random() * 120.0D) - 60;
                    field337 = (int) (Math.random() * 30.0D) - 20;
                    field348 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field419 = 0;
                    field446 = -1;
                    field493 = 0;
                    field494 = 0;
                    field293 = class18.field527;
                    field289 = 0;
                    field303 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field445[var22] = null;
                        field388[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field302[var23] = null;
                    }
                    Statics.field24 = field445[2047] = new class3();
                    field486 = -1;
                    field400.method3134();
                    field401.method3134();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field263[var24][var25][var26] = null;
                            }
                        }
                    }
                    field399 = new class177();
                    field292 = 0;
                    field513 = 0;
                    field517 = 0;
                    for (int var27 = 0; var27 < Statics.field1069; var27++) {
                        class46 var28 = class46.method817(var27);
                        if (var28 != null) {
                            class154.field2648[var27] = 0;
                            class154.field2647[var27] = 0;
                        }
                    }
                    for (int var29 = 0; var29 < field483.length; var29++) {
                        field483[var29] = -1;
                    }
                    field383 = -1;
                    if (field425 != -1) {
                        class152.method2622(field425);
                    }
                    for (class4 var30 = (class4) field426.method3096(); var30 != null; var30 = (class4) field426.method3093()) {
                        method2603(var30, true);
                    }
                    field425 = -1;
                    field426 = new class174(8);
                    field306 = null;
                    field406 = false;
                    field320 = 0;
                    field519.method2842((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field394[var31] = null;
                        field395[var31] = false;
                    }
                    class14.method142();
                    field344 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field469[var32] = true;
                    }
                    field523 = null;
                    Statics.field584 = 0;
                    Statics.field533 = null;
                    Statics.field967 = -1;
                    method116(false);
                    field310 = -1;
                }
            }
        } catch (IOException var37) {
            if (field300 < 1) {
                if (Statics.field912 == Statics.field115) {
                    Statics.field912 = Statics.field2073;
                } else {
                    Statics.field912 = Statics.field115;
                }
                field300++;
                field298 = 0;
            } else {
                method997(-2);
            }
        }
    }

    @ObfuscatedName("ed.n(B)V")
    public static void method2791() {
        field386.field1841 = 0;
        field308.field1841 = 0;
        field310 = -1;
        field514 = -1;
        field460 = -1;
        field495 = -1;
        field309 = 0;
        field412 = 0;
        field283 = 0;
        field320 = 0;
        field406 = false;
        field419 = 0;
        field493 = 0;
        for (int var0 = 0; var0 < field445.length; var0++) {
            if (field445[var0] != null) {
                field445[var0].field767 = -1;
            }
        }
        for (int var1 = 0; var1 < field302.length; var1++) {
            if (field302[var1] != null) {
                field302[var1].field767 = -1;
            }
        }
        class14.method142();
        method3054(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field469[var2] = true;
        }
    }

    @ObfuscatedName("aa.d(II)V")
    public static void method997(int arg0) {
        if (arg0 == -3) {
            class28.method469(class142.field2323, class142.field2191, class142.field2182);
        } else if (arg0 == -2) {
            class28.method469(class142.field2183, class142.field2184, class142.field2185);
        } else if (arg0 == -1) {
            class28.method469(class142.field2283, class142.field2237, class142.field2230);
        } else if (arg0 == 3) {
            class28.method469(class142.field2189, class142.field2166, class142.field2265);
        } else if (arg0 == 4) {
            class28.method469(class142.field2372, class142.field2163, class142.field2194);
        } else if (arg0 == 5) {
            class28.method469(class142.field2195, class142.field2196, class142.field2227);
        } else if (arg0 == 6) {
            class28.method469(class142.field2141, class142.field2199, class142.field2200);
        } else if (arg0 == 7) {
            class28.method469(class142.field2201, class142.field2202, class142.field2203);
        } else if (arg0 == 8) {
            class28.method469(class142.field2181, class142.field2222, class142.field2206);
        } else if (arg0 == 9) {
            class28.method469(class142.field2279, class142.field2208, class142.field2209);
        } else if (arg0 == 10) {
            class28.method469(class142.field2210, class142.field2211, class142.field2207);
        } else if (arg0 == 11) {
            class28.method469(class142.field2213, class142.field2214, class142.field2215);
        } else if (arg0 == 12) {
            class28.method469(class142.field2381, class142.field2217, class142.field2218);
        } else if (arg0 == 13) {
            class28.method469(class142.field2219, class142.field2220, class142.field2221);
        } else if (arg0 == 14) {
            class28.method469(class142.field2238, class142.field2223, class142.field2224);
        } else if (arg0 == 16) {
            class28.method469(class142.field2225, class142.field2360, class142.field2284);
        } else if (arg0 == 17) {
            class28.method469(class142.field2146, class142.field2229, class142.field2205);
        } else if (arg0 == 18) {
            class28.method469(class142.field2231, class142.field2232, class142.field2156);
        } else if (arg0 == 19) {
            class28.method469(class142.field2319, class142.field2249, class142.field2236);
        } else if (arg0 == 20) {
            class28.method469(class142.field2174, class142.field2257, class142.field2239);
        } else if (arg0 == 22) {
            class28.method469(class142.field2240, class142.field2193, class142.field2242);
        } else if (arg0 == 23) {
            class28.method469(class142.field2192, class142.field2244, class142.field2245);
        } else if (arg0 == 24) {
            class28.method469(class142.field2246, class142.field2252, class142.field2144);
        } else if (arg0 == 25) {
            class28.method469(class142.field2294, class142.field2300, class142.field2251);
        } else if (arg0 == 26) {
            class28.method469(class142.field2197, class142.field2253, class142.field2254);
        } else if (arg0 == 27) {
            class28.method469(class142.field2162, class142.field2256, class142.field2159);
        } else if (arg0 == 31) {
            class28.method469(class142.field2264, class142.field2281, class142.field2266);
        } else if (arg0 == 32) {
            class28.method469(class142.field2374, class142.field2268, class142.field2269);
        } else if (arg0 == 37) {
            class28.method469(class142.field2270, class142.field2271, class142.field2272);
        } else if (arg0 == 38) {
            class28.method469(class142.field2273, class142.field2274, class142.field2161);
        } else if (arg0 == 55) {
            class28.method469(class142.field2234, class142.field2277, class142.field2278);
        } else if (arg0 == 56) {
            class28.method469(class142.field2321, class142.field2280, class142.field2204);
            method3054(11);
            return;
        } else if (arg0 == 57) {
            class28.method469(class142.field2298, class142.field2375, class142.field2275);
            method3054(11);
            return;
        } else {
            class28.method469(class142.field2285, class142.field2286, class142.field2287);
        }
        method3054(10);
    }

    @ObfuscatedName("dl.p(I)V")
    public static final void method2252() {
        class41.method144();
        class37.field905.method3065();
        class40.method2290();
        class36.method1825();
        class35.field811.method3065();
        class35.field809.method3065();
        class45.method1387();
        class38.field927.method3065();
        class38.field914.method3065();
        class39.method157();
        class42.method2623();
        class46.field1071.method3065();
        class157.field2669.method3065();
        class152.method2634();
        ((class88) Statics.field1482).method1815();
        class19.field543.method3065();
        Statics.field2069.method2701();
        Statics.field1993.method2701();
        Statics.field197.method2701();
        Statics.field2745.method2701();
        Statics.field1884.method2701();
        Statics.field1906.method2701();
        Statics.field1020.method2701();
        Statics.field1265.method2701();
        Statics.field167.method2701();
        Statics.field994.method2701();
        Statics.field56.method2701();
        Statics.field2654.method2701();
    }

    @ObfuscatedName("r.j(I)V")
    public static final void method45() {
        if (field371 > 0) {
            Statics.method2766();
        } else {
            method3054(40);
            Statics.field305 = Statics.field1992;
            Statics.field1992 = null;
        }
    }

    @ObfuscatedName("fe.z(I)V")
    public static final void method2855() {
        if (field283 > 1) {
            field283--;
        }
        if (field371 > 0) {
            field371--;
        }
        if (field476) {
            field476 = false;
            method45();
            return;
        }
        if (!field406) {
            field384[0] = class142.field2377;
            field413[0] = "";
            field410[0] = 1006;
            field320 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2935(); var0++) {
        }
        if (field274 != 30) {
            return;
        }
        while (class189.method475()) {
            field386.method2319(119);
            field386.method2051(0);
            int var1 = field386.field1841;
            class189.method1733(field386);
            field386.method2093(field386.field1841 - var1);
        }
        Object var2 = Statics.field952.field181;
        synchronized (Statics.field952.field181) {
            if (!field265) {
                Statics.field952.field175 = 0;
            } else if (class127.field2009 != 0 || Statics.field952.field175 >= 40) {
                field386.method2319(145);
                field386.method2051(0);
                int var3 = field386.field1841;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field952.field175 && field386.field1841 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field952.field177[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field952.field176[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field952.field177[var5] == -1 && Statics.field952.field176[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field278 != var7 || field484 != var6) {
                        int var9 = var7 - field278;
                        field278 = var7;
                        int var10 = var6 - field484;
                        field484 = var6;
                        if (field280 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field386.method2052((field280 << 12) + (var9 << 6) + var10);
                            field280 = 0;
                        } else if (field280 < 8) {
                            field386.method2053((field280 << 19) + 8388608 + var8);
                            field280 = 0;
                        } else {
                            field386.method2054((field280 << 19) + -1073741824 + var8);
                            field280 = 0;
                        }
                    } else if (field280 < 2047) {
                        field280++;
                    }
                }
                field386.method2093(field386.field1841 - var3);
                if (var4 >= Statics.field952.field175) {
                    Statics.field952.field175 = 0;
                } else {
                    Statics.field952.field175 -= var4;
                    for (int var11 = 0; var11 < Statics.field952.field175; var11++) {
                        Statics.field952.field176[var11] = Statics.field952.field176[var4 + var11];
                        Statics.field952.field177[var11] = Statics.field952.field177[var4 + var11];
                    }
                }
            }
        }
        if (class127.field2009 == 1 || !Statics.field1666 && class127.field2009 == 4 || class127.field2009 == 2) {
            long var13 = (class127.field2017 - field277 * -1L) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field277 = class127.field2017 * -1L;
            int var15 = class127.field2011;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = class127.field2010;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var17 = var15 * 765 + var16;
            byte var18 = 0;
            if (class127.field2009 == 2) {
                var18 = 1;
            }
            int var19 = (int) var13;
            field386.method2319(125);
            field386.method2054((var18 << 19) + (var19 << 20) + var17);
        }
        if (class124.field1971 > 0) {
            field386.method2319(185);
            field386.method2052(0);
            int var20 = field386.field1841;
            long var21 = class103.method833();
            for (int var23 = 0; var23 < class124.field1971; var23++) {
                long var24 = var21 - field485;
                if (var24 > 16777215L) {
                    var24 = 16777215L;
                }
                field485 = var21;
                field386.method2102((int) var24);
                field386.method2051(class124.field1955[var23]);
            }
            field386.method2154(field386.field1841 - var20);
        }
        if (field353 > 0) {
            field353--;
        }
        if (class124.field1970[96] || class124.field1970[97] || class124.field1970[98] || class124.field1970[99]) {
            field354 = true;
        }
        if (field354 && field353 <= 0) {
            field353 = 20;
            field354 = false;
            field386.method2319(199);
            field386.method2095(field348);
            field386.method2052(field499);
        }
        if (Statics.field228 && !field347) {
            field347 = true;
            field386.method2319(130);
            field386.method2051(1);
        }
        if (!Statics.field228 && field347) {
            field347 = false;
            field386.method2319(130);
            field386.method2051(0);
        }
        if (field471 && Statics.field1896 != field436) {
            method11(Statics.field967, Statics.field2756, Statics.field1896, Statics.field24.field796[0], Statics.field24.field745[0]);
        } else if (Statics.field1896 != field446) {
            field446 = Statics.field1896;
            method92(Statics.field1896);
        }
        if (field274 != 30) {
            return;
        }
        method1734();
        method129();
        field412++;
        if (field412 > 750) {
            method45();
            return;
        }
        method2002();
        for (int var26 = 0; var26 < field303; var26++) {
            int var27 = field304[var26];
            class30 var28 = field302[var27];
            if (var28 != null) {
                method29(var28, var28.field712.field812);
            }
        }
        Statics.method753();
        field433++;
        if (field373 != 0) {
            field372 += 20;
            if (field372 >= 400) {
                field373 = 0;
            }
        }
        if (Statics.field930 != null) {
            field440++;
            if (field440 >= 15) {
                method3375(Statics.field930);
                Statics.field930 = null;
            }
        }
        class152 var29 = Statics.field931;
        class152 var30 = Statics.field223;
        Statics.field931 = null;
        Statics.field223 = null;
        field441 = null;
        field480 = false;
        field442 = false;
        field365 = 0;
        while (class124.method2339() && field365 < 128) {
            if (field432 >= 2 && class124.field1970[82] && Statics.field1812 == 66) {
                String var31 = class10.method1826();
                Statics.field230.setContents(new StringSelection(var31), (ClipboardOwner) null);
            } else {
                field448[field365] = Statics.field1812;
                field339[field365] = Statics.field2393;
                field365++;
            }
        }
        int var32 = field425;
        if (class152.method2621(var32)) {
            method2353(Statics.field2639[var32], -1, 0, 0, 765, 503, 0, 0);
        }
        field449++;
        while (true) {
            class1 var33;
            class152 var34;
            class152 var35;
            do {
                var33 = (class1) field387.method3120();
                if (var33 == null) {
                    while (true) {
                        class1 var36;
                        class152 var37;
                        class152 var38;
                        do {
                            var36 = (class1) field465.method3120();
                            if (var36 == null) {
                                while (true) {
                                    class1 var39;
                                    class152 var40;
                                    class152 var41;
                                    do {
                                        var39 = (class1) field368.method3120();
                                        if (var39 == null) {
                                            method130();
                                            if (field437 != null) {
                                                method27();
                                            }
                                            if (Statics.field531 != null) {
                                                method3375(Statics.field531);
                                                field314++;
                                                if (class127.field2002 == 0) {
                                                    if (field380) {
                                                        if (Statics.field531 == Statics.field1850 && field423 != field376) {
                                                            class152 var42 = Statics.field531;
                                                            byte var43 = 0;
                                                            if (field428 == 1 && var42.field2525 == 206) {
                                                                var43 = 1;
                                                            }
                                                            if (var42.field2623[field423] <= 0) {
                                                                var43 = 0;
                                                            }
                                                            int var44 = Statics.method488(var42);
                                                            boolean var45 = (var44 >> 29 & 0x1) != 0;
                                                            if (var45) {
                                                                int var46 = field376;
                                                                int var47 = field423;
                                                                var42.field2623[var47] = var42.field2623[var46];
                                                                var42.field2579[var47] = var42.field2579[var46];
                                                                var42.field2623[var46] = -1;
                                                                var42.field2579[var46] = 0;
                                                            } else if (var43 == 1) {
                                                                int var48 = field376;
                                                                int var49 = field423;
                                                                while (var48 != var49) {
                                                                    if (var48 > var49) {
                                                                        var42.method2773(var48 - 1, var48);
                                                                        var48--;
                                                                    } else if (var48 < var49) {
                                                                        var42.method2773(var48 + 1, var48);
                                                                        var48++;
                                                                    }
                                                                }
                                                            } else {
                                                                var42.method2773(field423, field376);
                                                            }
                                                            field386.method2319(239);
                                                            field386.method2088(var43);
                                                            field386.method2212(field376);
                                                            field386.method2054(Statics.field531.field2521);
                                                            field386.method2095(field423);
                                                        }
                                                    } else if ((field511 == 1 || method7(field320 - 1)) && field320 > 2) {
                                                        method124(field497, field281);
                                                    } else if (field320 > 0) {
                                                        method834(field497, field281);
                                                    }
                                                    field440 = 10;
                                                    class127.field2009 = 0;
                                                    Statics.field531 = null;
                                                } else if (field314 >= 5 && (class127.field2003 > field497 + 5 || class127.field2003 < field497 - 5 || class127.field2004 > field281 + 5 || class127.field2004 < field281 - 5)) {
                                                    field380 = true;
                                                }
                                            }
                                            if (class79.field1392 != -1) {
                                                int var50 = class79.field1392;
                                                int var51 = class79.field1393;
                                                field386.method2319(139);
                                                field386.method2051(5);
                                                field386.method2095(Statics.field1075 + var50);
                                                field386.method2097(Statics.field1673 + var51);
                                                field386.method2088(class124.field1970[82] ? (class124.field1970[81] ? 2 : 1) : 0);
                                                class79.field1392 = -1;
                                                field359 = class127.field2010;
                                                field272 = class127.field2011;
                                                field373 = 1;
                                                field372 = 0;
                                                field493 = var50;
                                                field494 = var51;
                                            }
                                            if (Statics.field931 != var29) {
                                                if (var29 != null) {
                                                    method3375(var29);
                                                }
                                                if (Statics.field931 != null) {
                                                    method3375(Statics.field931);
                                                }
                                            }
                                            if (Statics.field223 != var30 && field352 == field268) {
                                                if (var30 != null) {
                                                    method3375(var30);
                                                }
                                                if (Statics.field223 != null) {
                                                    method3375(Statics.field223);
                                                }
                                            }
                                            if (Statics.field223 == null) {
                                                if (field352 > 0) {
                                                    field352--;
                                                }
                                            } else if (field352 < field268) {
                                                field352++;
                                                if (field352 == field268) {
                                                    method3375(Statics.field223);
                                                }
                                            }
                                            method33();
                                            if (field488) {
                                                int var52 = Statics.field2646 * 128 + 64;
                                                int var53 = Statics.field2716 * 128 + 64;
                                                int var54 = method36(var52, var53, Statics.field1896) - Statics.field713;
                                                if (Statics.field801 < var52) {
                                                    Statics.field801 += Statics.field137 * (var52 - Statics.field801) / 1000 + Statics.field1922;
                                                    if (Statics.field801 > var52) {
                                                        Statics.field801 = var52;
                                                    }
                                                }
                                                if (Statics.field801 > var52) {
                                                    Statics.field801 -= Statics.field137 * (Statics.field801 - var52) / 1000 + Statics.field1922;
                                                    if (Statics.field801 < var52) {
                                                        Statics.field801 = var52;
                                                    }
                                                }
                                                if (Statics.field594 < var54) {
                                                    Statics.field594 += Statics.field137 * (var54 - Statics.field594) / 1000 + Statics.field1922;
                                                    if (Statics.field594 > var54) {
                                                        Statics.field594 = var54;
                                                    }
                                                }
                                                if (Statics.field594 > var54) {
                                                    Statics.field594 -= Statics.field137 * (Statics.field594 - var54) / 1000 + Statics.field1922;
                                                    if (Statics.field594 < var54) {
                                                        Statics.field594 = var54;
                                                    }
                                                }
                                                if (Statics.field2110 < var53) {
                                                    Statics.field2110 += Statics.field137 * (var53 - Statics.field2110) / 1000 + Statics.field1922;
                                                    if (Statics.field2110 > var53) {
                                                        Statics.field2110 = var53;
                                                    }
                                                }
                                                if (Statics.field2110 > var53) {
                                                    Statics.field2110 -= Statics.field137 * (Statics.field2110 - var53) / 1000 + Statics.field1922;
                                                    if (Statics.field2110 < var53) {
                                                        Statics.field2110 = var53;
                                                    }
                                                }
                                                int var55 = Statics.field2812 * 128 + 64;
                                                int var56 = Statics.field1902 * 128 + 64;
                                                int var57 = method36(var55, var56, Statics.field1896) - Statics.field190;
                                                int var58 = var55 - Statics.field801;
                                                int var59 = var57 - Statics.field594;
                                                int var60 = var56 - Statics.field2110;
                                                int var61 = (int) Math.sqrt((double) (var58 * var58 + var60 * var60));
                                                int var62 = (int) (Math.atan2((double) var59, (double) var61) * 325.949D) & 0x7FF;
                                                int var63 = (int) (Math.atan2((double) var58, (double) var60) * -325.949D) & 0x7FF;
                                                if (var62 < 128) {
                                                    var62 = 128;
                                                }
                                                if (var62 > 383) {
                                                    var62 = 383;
                                                }
                                                if (Statics.field2458 < var62) {
                                                    Statics.field2458 += Statics.field1292 * (var62 - Statics.field2458) / 1000 + Statics.field260;
                                                    if (Statics.field2458 > var62) {
                                                        Statics.field2458 = var62;
                                                    }
                                                }
                                                if (Statics.field2458 > var62) {
                                                    Statics.field2458 -= Statics.field1292 * (Statics.field2458 - var62) / 1000 + Statics.field260;
                                                    if (Statics.field2458 < var62) {
                                                        Statics.field2458 = var62;
                                                    }
                                                }
                                                int var64 = var63 - Statics.field1900;
                                                if (var64 > 1024) {
                                                    var64 -= 2048;
                                                }
                                                if (var64 < -1024) {
                                                    var64 += 2048;
                                                }
                                                if (var64 > 0) {
                                                    Statics.field1900 += Statics.field1292 * var64 / 1000 + Statics.field260;
                                                    Statics.field1900 &= 0x7FF;
                                                }
                                                if (var64 < 0) {
                                                    Statics.field1900 -= Statics.field1292 * -var64 / 1000 + Statics.field260;
                                                    Statics.field1900 &= 0x7FF;
                                                }
                                                int var65 = var63 - Statics.field1900;
                                                if (var65 > 1024) {
                                                    var65 -= 2048;
                                                }
                                                if (var65 < -1024) {
                                                    var65 += 2048;
                                                }
                                                if (var65 < 0 && var64 > 0 || var65 > 0 && var64 < 0) {
                                                    Statics.field1900 = var63;
                                                }
                                            }
                                            for (int var66 = 0; var66 < 5; var66++) {
                                                int var10002 = field512[var66]++;
                                            }
                                            int var67 = ++class127.field1998 - 1;
                                            int var69 = class124.field1975;
                                            if (var67 > 15000 && var69 > 15000) {
                                                field371 = 250;
                                                class127.method3048(14500);
                                                field386.method2319(35);
                                            }
                                            field334++;
                                            if (field334 > 500) {
                                                field334 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    field328 += field329;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    field330 += field350;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    field503 += field333;
                                                }
                                            }
                                            if (field328 < -50) {
                                                field329 = 2;
                                            }
                                            if (field328 > 50) {
                                                field329 = -2;
                                            }
                                            if (field330 < -55) {
                                                field350 = 2;
                                            }
                                            if (field330 > 55) {
                                                field350 = -2;
                                            }
                                            if (field503 < -40) {
                                                field333 = 1;
                                            }
                                            if (field503 > 40) {
                                                field333 = -1;
                                            }
                                            field313++;
                                            if (field313 > 500) {
                                                field313 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    field335 += field315;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    field337 += field338;
                                                }
                                            }
                                            if (field335 < -60) {
                                                field315 = 2;
                                            }
                                            if (field335 > 60) {
                                                field315 = -2;
                                            }
                                            if (field337 < -20) {
                                                field338 = 1;
                                            }
                                            if (field337 > 10) {
                                                field338 = -1;
                                            }
                                            for (class34 var73 = (class34) field327.method3082(); var73 != null; var73 = (class34) field327.method3090()) {
                                                if ((long) var73.field803 < class103.method833() / 1000L - 5L) {
                                                    if (var73.field806 > 0) {
                                                        class10.method1313(5, "", var73.field804 + class142.field2387);
                                                    }
                                                    if (var73.field806 == 0) {
                                                        class10.method1313(5, "", var73.field804 + class142.field2367);
                                                    }
                                                    var73.method3200();
                                                }
                                            }
                                            field312++;
                                            if (field312 > 50) {
                                                field386.method2319(29);
                                            }
                                            try {
                                                if (Statics.field1992 != null && field386.field1841 > 0) {
                                                    Statics.field1992.method2509(field386.field1840, 0, field386.field1841);
                                                    field386.field1841 = 0;
                                                    field312 = 0;
                                                }
                                            } catch (IOException var75) {
                                                method45();
                                            }
                                            return;
                                        }
                                        var40 = var39.field3;
                                        if (var40.field2522 < 0) {
                                            break;
                                        }
                                        var41 = class152.method1829(var40.field2532);
                                    } while (var41 == null || var41.field2629 == null || var40.field2522 >= var41.field2629.length || var41.field2629[var40.field2522] != var40);
                                    class32.method701(var39, 200000);
                                }
                            }
                            var37 = var36.field3;
                            if (var37.field2522 < 0) {
                                break;
                            }
                            var38 = class152.method1829(var37.field2532);
                        } while (var38 == null || var38.field2629 == null || var37.field2522 >= var38.field2629.length || var38.field2629[var37.field2522] != var37);
                        class32.method701(var36, 200000);
                    }
                }
                var34 = var33.field3;
                if (var34.field2522 < 0) {
                    break;
                }
                var35 = class152.method1829(var34.field2532);
            } while (var35 == null || var35.field2629 == null || var34.field2522 >= var35.field2629.length || var35.field2629[var34.field2522] != var34);
            class32.method701(var33, 200000);
        }
    }

    @ObfuscatedName("f.t(I)V")
    public static final void method79() {
        if (Statics.field220 != null) {
            Statics.field220.method975();
        }
        if (Statics.field147 != null) {
            Statics.field147.method975();
        }
    }

    @ObfuscatedName("a.c(I)V")
    public static final void method129() {
        for (int var0 = 0; var0 < field377; var0++) {
            int var10002 = field504[var0]--;
            if (field504[var0] >= -10) {
                class52 var2 = field506[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1017(Statics.field2745, field502[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field504[var0] += var2.method1020();
                    field506[var0] = var2;
                }
                if (field504[var0] < 0) {
                    int var9;
                    if (field505[var0] == 0) {
                        var9 = field275;
                    } else {
                        int var3 = (field505[var0] & 0xFF) * 128;
                        int var4 = field505[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field24.field777;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field505[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field24.field744;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field504[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field500 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1019().method1058(Statics.field173);
                        class58 var11 = class58.method1208(var10, 100, var9);
                        var11.method1085(field391[var0] - 1);
                        Statics.field11.method923(var11);
                    }
                    field504[var0] = -100;
                }
            } else {
                field377--;
                for (int var1 = var0; var1 < field377; var1++) {
                    field502[var1] = field502[var1 + 1];
                    field506[var1] = field506[var1 + 1];
                    field391[var1] = field391[var1 + 1];
                    field504[var1] = field504[var1 + 1];
                    field505[var1] = field505[var1 + 1];
                }
                var0--;
            }
        }
        if (field498 && !class161.method1736()) {
            if (field496 != 0 && field463 != -1) {
                class161.method1920(Statics.field1906, field463, 0, field496, false);
            }
            field498 = false;
        }
    }

    @ObfuscatedName("client.q(Lar;IIIB)V")
    public static void method463(class38 arg0, int arg1, int arg2, int arg3) {
        if (field377 >= 50 || field500 == 0 || arg0.field918 == null || arg1 >= arg0.field918.length) {
            return;
        }
        int var4 = arg0.field918[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field502[field377] = var5;
        field391[field377] = var6;
        field504[field377] = 0;
        field506[field377] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field505[field377] = (var8 << 16) + (var9 << 8) + var7;
        field377++;
    }

    @ObfuscatedName("ez.g(IIII)V")
    public static void method2718(int arg0, int arg1, int arg2) {
        if (field275 == 0 || arg1 == 0 || field377 >= 50) {
            return;
        }
        field502[field377] = arg0;
        field391[field377] = arg1;
        field504[field377] = arg2;
        field506[field377] = null;
        field505[field377] = 0;
        field377++;
    }

    @ObfuscatedName("eb.m(II)V")
    public static void method2620(int arg0) {
        if (arg0 == -1 && !field498) {
            Statics.field2709.method3012();
            class161.field2700 = 1;
            Statics.field1924 = null;
        } else if (arg0 != -1 && field463 != arg0 && field496 != 0 && !field498) {
            class161.method1993(2, Statics.field1906, arg0, 0, field496, false);
        }
        field463 = arg0;
    }

    @ObfuscatedName("o.ae(Ljava/lang/String;B)V")
    public static final void method17(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field92.field148 = !Statics.field92.field148;
            class9.method819();
            if (Statics.field92.field148) {
                class10.method1313(99, "", "Roofs are now all hidden");
            } else {
                class10.method1313(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field432 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field435 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field435 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method45();
            }
            if (arg0.equalsIgnoreCase("errortest") && field269 == 2) {
                throw new RuntimeException();
            }
        }
        field386.method2319(43);
        field386.method2051(arg0.length() + 1);
        field386.method2056(arg0);
    }

    @ObfuscatedName("w.af(B)V")
    public static final void method33() {
        int var0 = field328 + Statics.field24.field777;
        int var1 = field330 + Statics.field24.field744;
        if (Statics.field1509 - var0 < -500 || Statics.field1509 - var0 > 500 || Statics.field537 - var1 < -500 || Statics.field537 - var1 > 500) {
            Statics.field1509 = var0;
            Statics.field537 = var1;
        }
        if (Statics.field1509 != var0) {
            Statics.field1509 += (var0 - Statics.field1509) / 16;
        }
        if (Statics.field537 != var1) {
            Statics.field537 += (var1 - Statics.field537) / 16;
        }
        if (class127.field2002 == 4 && Statics.field1666) {
            int var2 = class127.field2004 - field466;
            field332 = var2 * 2;
            field466 = var2 == -1 || var2 == 1 ? class127.field2004 : (field466 + class127.field2004) / 2;
            int var3 = field351 - class127.field2003;
            field349 = var3 * 2;
            field351 = var3 == -1 || var3 == 1 ? class127.field2003 : (field351 + class127.field2003) / 2;
        } else {
            if (class124.field1970[96]) {
                field349 += (-24 - field349) / 2;
            } else if (class124.field1970[97]) {
                field349 += (24 - field349) / 2;
            } else {
                field349 /= 2;
            }
            if (class124.field1970[98]) {
                field332 += (12 - field332) / 2;
            } else if (class124.field1970[99]) {
                field332 += (-12 - field332) / 2;
            } else {
                field332 /= 2;
            }
            field466 = class127.field2004;
            field351 = class127.field2003;
        }
        field348 = field349 / 2 + field348 & 0x7FF;
        field499 += field332 / 2;
        if (field499 < 128) {
            field499 = 128;
        }
        if (field499 > 383) {
            field499 = 383;
        }
        int var4 = Statics.field1509 >> 7;
        int var5 = Statics.field537 >> 7;
        int var6 = method36(Statics.field1509, Statics.field537, Statics.field1896);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1896;
                    if (var10 < 3 && (class6.field78[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field93[var10][var8][var9];
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
        if (var12 > field355) {
            field355 += (var12 - field355) / 24;
        } else if (var12 < field355) {
            field355 += (var12 - field355) / 80;
        }
    }

    @ObfuscatedName("cm.ab(B)V")
    public static final void method2002() {
        for (int var0 = -1; var0 < field289; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field385[var0];
            }
            class3 var2 = field445[var1];
            if (var2 != null) {
                method29(var2, 1);
            }
        }
    }

    @ObfuscatedName("y.ao(Lah;II)V")
    public static final void method29(class33 arg0, int arg1) {
        if (arg0.field787 > field318) {
            method16(arg0);
        } else if (arg0.field788 >= field318) {
            method470(arg0);
        } else {
            method1823(arg0);
        }
        if (arg0.field777 < 128 || arg0.field744 < 128 || arg0.field777 >= 13184 || arg0.field744 >= 13184) {
            arg0.field773 = -1;
            arg0.field763 = -1;
            arg0.field787 = 0;
            arg0.field788 = 0;
            arg0.field777 = arg0.field796[0] * 128 + arg0.field747 * 64;
            arg0.field744 = arg0.field745[0] * 128 + arg0.field747 * 64;
            arg0.method591();
        }
        if (Statics.field24 == arg0 && (arg0.field777 < 1536 || arg0.field744 < 1536 || arg0.field777 >= 11776 || arg0.field744 >= 11776)) {
            arg0.field773 = -1;
            arg0.field763 = -1;
            arg0.field787 = 0;
            arg0.field788 = 0;
            arg0.field777 = arg0.field796[0] * 128 + arg0.field747 * 64;
            arg0.field744 = arg0.field745[0] * 128 + arg0.field747 * 64;
            arg0.method591();
        }
        if (arg0.field769 != 0) {
            if (arg0.field767 != -1 && arg0.field767 < 32768) {
                class30 var2 = field302[arg0.field767];
                if (var2 != null) {
                    int var3 = arg0.field777 - var2.field777;
                    int var4 = arg0.field744 - var2.field744;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field792 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field767 >= 32768) {
                int var5 = arg0.field767 - 32768;
                if (field389 == var5) {
                    var5 = 2047;
                }
                class3 var6 = field445[var5];
                if (var6 != null) {
                    int var7 = arg0.field777 - var6.field777;
                    int var8 = arg0.field744 - var6.field744;
                    if (var7 != 0 || var8 != 0) {
                        arg0.field792 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field783 != 0 || arg0.field798 != 0) && (arg0.field795 == 0 || arg0.field799 > 0)) {
                int var9 = arg0.field777 - (arg0.field783 * 64 - Statics.field1075 * 64 - Statics.field1075 * 64);
                int var10 = arg0.field744 - (arg0.field798 * 64 - Statics.field1673 * 64 - Statics.field1673 * 64);
                if (var9 != 0 || var10 != 0) {
                    arg0.field792 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
                arg0.field783 = 0;
                arg0.field798 = 0;
            }
            int var11 = arg0.field792 - arg0.field760 & 0x7FF;
            if (var11 == 0) {
                arg0.field797 = 0;
            } else {
                arg0.field797++;
                if (var11 > 1024) {
                    arg0.field760 -= arg0.field769;
                    boolean var12 = true;
                    if (var11 < arg0.field769 || var11 > 2048 - arg0.field769) {
                        arg0.field760 = arg0.field792;
                        var12 = false;
                    }
                    if (arg0.field770 == arg0.field748 && (arg0.field797 > 25 || var12)) {
                        if (arg0.field762 == -1) {
                            arg0.field770 = arg0.field751;
                        } else {
                            arg0.field770 = arg0.field762;
                        }
                    }
                } else {
                    arg0.field760 += arg0.field769;
                    boolean var13 = true;
                    if (var11 < arg0.field769 || var11 > 2048 - arg0.field769) {
                        arg0.field760 = arg0.field792;
                        var13 = false;
                    }
                    if (arg0.field770 == arg0.field748 && (arg0.field797 > 25 || var13)) {
                        if (arg0.field750 == -1) {
                            arg0.field770 = arg0.field751;
                        } else {
                            arg0.field770 = arg0.field750;
                        }
                    }
                }
                arg0.field760 &= 0x7FF;
            }
        }
        method159(arg0);
    }

    @ObfuscatedName("o.ak(Lah;I)V")
    public static final void method16(class33 arg0) {
        int var1 = arg0.field787 - field318;
        int var2 = arg0.field785 * 128 + arg0.field747 * 64;
        int var3 = arg0.field802 * 128 + arg0.field747 * 64;
        arg0.field777 += (var2 - arg0.field777) / var1;
        arg0.field744 += (var3 - arg0.field744) / var1;
        arg0.field799 = 0;
        if (arg0.field789 == 0) {
            arg0.field792 = 1024;
        }
        if (arg0.field789 == 1) {
            arg0.field792 = 1536;
        }
        if (arg0.field789 == 2) {
            arg0.field792 = 0;
        }
        if (arg0.field789 == 3) {
            arg0.field792 = 512;
        }
    }

    @ObfuscatedName("k.ah(Lah;S)V")
    public static final void method470(class33 arg0) {
        if (field318 == arg0.field788 || arg0.field773 == -1 || arg0.field772 != 0 || arg0.field743 + 1 > class38.method131(arg0.field773).field917[arg0.field774]) {
            int var1 = arg0.field788 - arg0.field787;
            int var2 = field318 - arg0.field787;
            int var3 = arg0.field785 * 128 + arg0.field747 * 64;
            int var4 = arg0.field802 * 128 + arg0.field747 * 64;
            int var5 = arg0.field784 * 128 + arg0.field747 * 64;
            int var6 = arg0.field786 * 128 + arg0.field747 * 64;
            arg0.field777 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field744 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field799 = 0;
        if (arg0.field789 == 0) {
            arg0.field792 = 1024;
        }
        if (arg0.field789 == 1) {
            arg0.field792 = 1536;
        }
        if (arg0.field789 == 2) {
            arg0.field792 = 0;
        }
        if (arg0.field789 == 3) {
            arg0.field792 = 512;
        }
        arg0.field760 = arg0.field792;
    }

    @ObfuscatedName("ca.ai(Lah;B)V")
    public static final void method1823(class33 arg0) {
        arg0.field770 = arg0.field748;
        if (arg0.field795 == 0) {
            arg0.field799 = 0;
            return;
        }
        if (arg0.field773 != -1 && arg0.field772 == 0) {
            class38 var1 = class38.method131(arg0.field773);
            if (arg0.field800 > 0 && var1.field928 == 0) {
                arg0.field799++;
                return;
            }
            if (arg0.field800 <= 0 && var1.field915 == 0) {
                arg0.field799++;
                return;
            }
        }
        int var2 = arg0.field777;
        int var3 = arg0.field744;
        int var4 = arg0.field796[arg0.field795 - 1] * 128 + arg0.field747 * 64;
        int var5 = arg0.field745[arg0.field795 - 1] * 128 + arg0.field747 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field777 = var4;
            arg0.field744 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field792 = 1280;
            } else if (var3 > var5) {
                arg0.field792 = 1792;
            } else {
                arg0.field792 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field792 = 768;
            } else if (var3 > var5) {
                arg0.field792 = 256;
            } else {
                arg0.field792 = 512;
            }
        } else if (var3 < var5) {
            arg0.field792 = 1024;
        } else if (var3 > var5) {
            arg0.field792 = 0;
        }
        int var6 = arg0.field792 - arg0.field760 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field768;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field751;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field754;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field753;
        }
        if (var7 == -1) {
            var7 = arg0.field751;
        }
        arg0.field770 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field712.field807;
        }
        if (var9) {
            if (arg0.field792 != arg0.field760 && arg0.field767 == -1 && arg0.field769 != 0) {
                var8 = 2;
            }
            if (arg0.field795 > 2) {
                var8 = 6;
            }
            if (arg0.field795 > 3) {
                var8 = 8;
            }
            if (arg0.field799 > 0 && arg0.field795 > 1) {
                var8 = 8;
                arg0.field799--;
            }
        } else {
            if (arg0.field795 > 1) {
                var8 = 6;
            }
            if (arg0.field795 > 2) {
                var8 = 8;
            }
            if (arg0.field799 > 0 && arg0.field795 > 1) {
                var8 = 8;
                arg0.field799--;
            }
        }
        if (arg0.field752[arg0.field795 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field770 == arg0.field751 && arg0.field758 != -1) {
            arg0.field770 = arg0.field758;
        }
        if (var2 < var4) {
            arg0.field777 += var8;
            if (arg0.field777 > var4) {
                arg0.field777 = var4;
            }
        } else if (var2 > var4) {
            arg0.field777 -= var8;
            if (arg0.field777 < var4) {
                arg0.field777 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field744 += var8;
            if (arg0.field744 > var5) {
                arg0.field744 = var5;
            }
        } else if (var3 > var5) {
            arg0.field744 -= var8;
            if (arg0.field744 < var5) {
                arg0.field744 = var5;
            }
        }
        if (arg0.field777 == var4 && arg0.field744 == var5) {
            arg0.field795--;
            if (arg0.field800 > 0) {
                arg0.field800--;
            }
        }
    }

    @ObfuscatedName("d.al(Lah;S)V")
    public static final void method159(class33 arg0) {
        arg0.field746 = false;
        if (arg0.field770 != -1) {
            class38 var1 = class38.method131(arg0.field770);
            if (var1 == null || var1.field923 == null) {
                arg0.field770 = -1;
            } else {
                arg0.field778++;
                if (arg0.field771 < var1.field923.length && arg0.field778 > var1.field917[arg0.field771]) {
                    arg0.field778 = 1;
                    arg0.field771++;
                    method463(var1, arg0.field771, arg0.field777, arg0.field744);
                }
                if (arg0.field771 >= var1.field923.length) {
                    arg0.field778 = 0;
                    arg0.field771 = 0;
                    method463(var1, arg0.field771, arg0.field777, arg0.field744);
                }
            }
        }
        if (arg0.field763 != -1 && field318 >= arg0.field781) {
            if (arg0.field779 < 0) {
                arg0.field779 = 0;
            }
            int var2 = class39.method147(arg0.field763).field940;
            if (var2 == -1) {
                arg0.field763 = -1;
            } else {
                class38 var3 = class38.method131(var2);
                if (var3 == null || var3.field923 == null) {
                    arg0.field763 = -1;
                } else {
                    arg0.field759++;
                    if (arg0.field779 < var3.field923.length && arg0.field759 > var3.field917[arg0.field779]) {
                        arg0.field759 = 1;
                        arg0.field779++;
                        method463(var3, arg0.field779, arg0.field777, arg0.field744);
                    }
                    if (arg0.field779 >= var3.field923.length && (arg0.field779 < 0 || arg0.field779 >= var3.field923.length)) {
                        arg0.field763 = -1;
                    }
                }
            }
        }
        if (arg0.field773 != -1 && arg0.field772 <= 1) {
            class38 var4 = class38.method131(arg0.field773);
            if (var4.field928 == 1 && arg0.field800 > 0 && arg0.field787 <= field318 && arg0.field788 < field318) {
                arg0.field772 = 1;
                return;
            }
        }
        if (arg0.field773 != -1 && arg0.field772 == 0) {
            class38 var5 = class38.method131(arg0.field773);
            if (var5 == null || var5.field923 == null) {
                arg0.field773 = -1;
            } else {
                arg0.field743++;
                if (arg0.field774 < var5.field923.length && arg0.field743 > var5.field917[arg0.field774]) {
                    arg0.field743 = 1;
                    arg0.field774++;
                    method463(var5, arg0.field774, arg0.field777, arg0.field744);
                }
                if (arg0.field774 >= var5.field923.length) {
                    arg0.field774 -= var5.field919;
                    arg0.field776++;
                    if (arg0.field776 >= var5.field925) {
                        arg0.field773 = -1;
                    } else if (arg0.field774 >= 0 && arg0.field774 < var5.field923.length) {
                        method463(var5, arg0.field774, arg0.field777, arg0.field744);
                    } else {
                        arg0.field773 = -1;
                    }
                }
                arg0.field746 = var5.field929;
            }
        }
        if (arg0.field772 > 0) {
            arg0.field772--;
        }
    }

    @ObfuscatedName("ek.ap(I)V")
    public static final void method2609() {
        if (field425 != -1) {
            int var0 = field425;
            if (class152.method2621(var0)) {
                method35(Statics.field2639[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field467; var1++) {
            if (field469[var1]) {
                field470[var1] = true;
            }
            field398[var1] = field469[var1];
            field469[var1] = false;
        }
        field468 = field318;
        field407 = -1;
        field415 = -1;
        Statics.field1850 = null;
        if (field425 != -1) {
            field467 = 0;
            int var2 = field425;
            if (class152.method2621(var2)) {
                Statics.field77 = null;
                method527(Statics.field2639[var2], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field77 != null) {
                    method527(Statics.field77, -1412584499, 0, 0, 765, 503, Statics.field63, Statics.field2967, -1);
                    Statics.field77 = null;
                }
            } else {
                for (int var3 = 0; var3 < 100; var3++) {
                    field469[var3] = true;
                }
            }
        }
        class73.method1477();
        if (field406) {
            method151();
        } else if (field407 != -1) {
            int var4 = field407;
            int var5 = field415;
            if (field320 >= 2 || field418 != 0 || field420) {
                String var6;
                if (field418 == 1 && field320 < 2) {
                    var6 = class142.field2291 + class142.field2301 + field276 + " " + class2.field19;
                } else if (field420 && field320 < 2) {
                    var6 = field459 + class142.field2301 + field424 + " " + class2.field19;
                } else {
                    var6 = method1735(field320 - 1);
                }
                if (field320 > 2) {
                    var6 = var6 + class2.method778(16777215) + " " + '/' + " " + (field320 - 2) + class142.field2295;
                }
                Statics.field48.method3246(var6, var4 + 4, var5 + 15, 16777215, 0, field318 / 1000);
            }
        }
        if (field390 == 3) {
            for (int var7 = 0; var7 < field467; var7++) {
                if (field398[var7]) {
                    class73.method1482(field472[var7], field473[var7], field474[var7], field475[var7], 16711935, 128);
                } else if (field470[var7]) {
                    class73.method1482(field472[var7], field473[var7], field474[var7], field475[var7], 16711680, 128);
                }
            }
        }
        int var8 = Statics.field1896;
        int var9 = Statics.field24.field777;
        int var10 = Statics.field24.field744;
        int var11 = field433;
        for (class20 var12 = (class20) class20.field552.method3122(); var12 != null; var12 = (class20) class20.field552.method3124()) {
            if (var12.field558 != -1 || var12.field562 != null) {
                int var13 = 0;
                if (var9 > var12.field555) {
                    var13 += var9 - var12.field555;
                } else if (var9 < var12.field553) {
                    var13 += var12.field553 - var9;
                }
                if (var10 > var12.field568) {
                    var13 += var10 - var12.field568;
                } else if (var10 < var12.field554) {
                    var13 += var12.field554 - var10;
                }
                if (var13 - 64 > var12.field556 || field500 == 0 || var12.field563 != var8) {
                    if (var12.field559 != null) {
                        Statics.field11.method924(var12.field559);
                        var12.field559 = null;
                    }
                    if (var12.field564 != null) {
                        Statics.field11.method924(var12.field564);
                        var12.field564 = null;
                    }
                } else {
                    var13 -= 64;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = field500 * (var12.field556 - var13) / var12.field556;
                    class52 var10000;
                    if (var12.field559 != null) {
                        var12.field559.method1086(var14);
                    } else if (var12.field558 >= 0) {
                        var10000 = (class52) null;
                        class52 var15 = class52.method1017(Statics.field2745, var12.field558, 0);
                        if (var15 != null) {
                            class56 var16 = var15.method1019().method1058(Statics.field173);
                            class58 var17 = class58.method1208(var16, 100, var14);
                            var17.method1085(-1);
                            Statics.field11.method923(var17);
                            var12.field559 = var17;
                        }
                    }
                    if (var12.field564 != null) {
                        var12.field564.method1086(var14);
                        if (!var12.field564.method3205()) {
                            var12.field564 = null;
                        }
                    } else if (var12.field562 != null && (var12.field557 -= var11) <= 0) {
                        int var18 = (int) (Math.random() * (double) var12.field562.length);
                        var10000 = (class52) null;
                        class52 var19 = class52.method1017(Statics.field2745, var12.field562[var18], 0);
                        if (var19 != null) {
                            class56 var20 = var19.method1019().method1058(Statics.field173);
                            class58 var21 = class58.method1208(var20, 100, var14);
                            var21.method1085(0);
                            Statics.field11.method923(var21);
                            var12.field564 = var21;
                            var12.field557 = var12.field560 + (int) (Math.random() * (double) (var12.field561 - var12.field560));
                        }
                    }
                }
            }
        }
        field433 = 0;
    }

    @ObfuscatedName("fl.ar(Ljava/lang/String;ZI)V")
    public static final void method3046(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1914.method3326(arg0, 250);
        int var6 = Statics.field1914.method3259(arg0, 250) * 13;
        class73.method1475(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1485(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1914.method3242(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method821(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field128.getGraphics();
                Statics.field574.method1324(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field128.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field467; var13++) {
            if (field474[var13] + field472[var13] > var9 && field472[var13] < var9 + var11 && field475[var13] + field473[var13] > var10 && field473[var13] < var10 + var12) {
                field470[var13] = true;
            }
        }
    }

    @ObfuscatedName("t.au(IIIII)V")
    public static final void method499(int arg0, int arg1, int arg2, int arg3) {
        class73.method1484(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1738();
        field367++;
        method2374(class29.field703);
        boolean var4 = false;
        if (field486 >= 0) {
            for (int var5 = 0; var5 < field289; var5++) {
                if (field486 == field385[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2374(class29.field700);
        }
        method12(true);
        method2374(var4 ? class29.field699 : class29.field698);
        method12(false);
        method2345();
        method2018();
        if (!field488) {
            int var6 = field499;
            if (field355 / 256 > var6) {
                var6 = field355 / 256;
            }
            if (field508[4] && field510[4] + 128 > var6) {
                var6 = field510[4] + 128;
            }
            int var7 = field503 + field348 & 0x7FF;
            int var8 = Statics.field1509;
            int var9 = method36(Statics.field24.field777, Statics.field24.field744, Statics.field1896) - 50;
            int var10 = Statics.field537;
            int var11 = var6 * 3 + 600;
            int var12 = 2048 - var6 & 0x7FF;
            int var13 = 2048 - var7 & 0x7FF;
            int var14 = 0;
            int var15 = 0;
            int var16 = var11;
            if (var12 != 0) {
                int var17 = class84.field1465[var12];
                int var18 = class84.field1486[var12];
                int var19 = var15 * var18 - var11 * var17 >> 16;
                var16 = var15 * var17 + var11 * var18 >> 16;
                var15 = var19;
            }
            if (var13 != 0) {
                int var20 = class84.field1465[var13];
                int var21 = class84.field1486[var13];
                int var22 = var14 * var21 + var16 * var20 >> 16;
                var16 = var16 * var21 - var14 * var20 >> 16;
                var14 = var22;
            }
            Statics.field801 = var8 - var14;
            Statics.field594 = var9 - var15;
            Statics.field2110 = var10 - var16;
            Statics.field2458 = var6;
            Statics.field1900 = var7;
        }
        int var35;
        if (field488) {
            var35 = method2337();
        } else {
            int var23;
            if (Statics.field92.field148) {
                var23 = Statics.field1896;
            } else {
                int var24 = 3;
                if (Statics.field2458 < 310) {
                    int var25 = Statics.field801 >> 7;
                    int var26 = Statics.field2110 >> 7;
                    int var27 = Statics.field24.field777 >> 7;
                    int var28 = Statics.field24.field744 >> 7;
                    if ((class6.field78[Statics.field1896][var25][var26] & 0x4) != 0) {
                        var24 = Statics.field1896;
                    }
                    int var29;
                    if (var27 > var25) {
                        var29 = var27 - var25;
                    } else {
                        var29 = var25 - var27;
                    }
                    int var30;
                    if (var28 > var26) {
                        var30 = var28 - var26;
                    } else {
                        var30 = var26 - var28;
                    }
                    if (var29 > var30) {
                        int var31 = var30 * 65536 / var29;
                        int var32 = 32768;
                        while (var25 != var27) {
                            if (var25 < var27) {
                                var25++;
                            } else if (var25 > var27) {
                                var25--;
                            }
                            if ((class6.field78[Statics.field1896][var25][var26] & 0x4) != 0) {
                                var24 = Statics.field1896;
                            }
                            var32 += var31;
                            if (var32 >= 65536) {
                                var32 -= 65536;
                                if (var26 < var28) {
                                    var26++;
                                } else if (var26 > var28) {
                                    var26--;
                                }
                                if ((class6.field78[Statics.field1896][var25][var26] & 0x4) != 0) {
                                    var24 = Statics.field1896;
                                }
                            }
                        }
                    } else {
                        int var33 = var29 * 65536 / var30;
                        int var34 = 32768;
                        while (var26 != var28) {
                            if (var26 < var28) {
                                var26++;
                            } else if (var26 > var28) {
                                var26--;
                            }
                            if ((class6.field78[Statics.field1896][var25][var26] & 0x4) != 0) {
                                var24 = Statics.field1896;
                            }
                            var34 += var33;
                            if (var34 >= 65536) {
                                var34 -= 65536;
                                if (var25 < var27) {
                                    var25++;
                                } else if (var25 > var27) {
                                    var25--;
                                }
                                if ((class6.field78[Statics.field1896][var25][var26] & 0x4) != 0) {
                                    var24 = Statics.field1896;
                                }
                            }
                        }
                    }
                }
                if ((class6.field78[Statics.field1896][Statics.field24.field777 >> 7][Statics.field24.field744 >> 7] & 0x4) != 0) {
                    var24 = Statics.field1896;
                }
                var23 = var24;
            }
            var35 = var23;
        }
        int var36 = Statics.field801;
        int var37 = Statics.field594;
        int var38 = Statics.field2110;
        int var39 = Statics.field2458;
        int var40 = Statics.field1900;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field508[var41]) {
                int var42 = (int) (Math.random() * (double) (field509[var41] * 2 + 1) - (double) field509[var41] + Math.sin((double) field294[var41] / 100.0D * (double) field512[var41]) * (double) field510[var41]);
                if (var41 == 0) {
                    Statics.field801 += var42;
                }
                if (var41 == 1) {
                    Statics.field594 += var42;
                }
                if (var41 == 2) {
                    Statics.field2110 += var42;
                }
                if (var41 == 3) {
                    Statics.field1900 = Statics.field1900 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field2458 += var42;
                    if (Statics.field2458 < 128) {
                        Statics.field2458 = 128;
                    }
                    if (Statics.field2458 > 383) {
                        Statics.field2458 = 383;
                    }
                }
            }
        }
        int var43 = class127.field2003;
        int var44 = class127.field2004;
        if (class127.field2009 != 0) {
            var43 = class127.field2010;
            var44 = class127.field2011;
        }
        if (var43 >= arg0 && var43 < arg0 + arg2 && var44 >= arg1 && var44 < arg1 + arg3) {
            class98.field1698 = true;
            class98.field1752 = 0;
            class98.field1750 = var43 - arg0;
            class98.field1751 = var44 - arg1;
        } else {
            class98.field1698 = false;
            class98.field1752 = 0;
        }
        method79();
        class73.method1475(arg0, arg1, arg2, arg3, 0);
        method79();
        Statics.field2098.method1608(Statics.field801, Statics.field594, Statics.field2110, Statics.field2458, Statics.field1900, var35);
        method79();
        Statics.field2098.method1664();
        method121(arg0, arg1, arg2, arg3);
        method573(arg0, arg1);
        ((class88) Statics.field1482).method1812(field433);
        method518(arg0, arg1, arg2, arg3);
        Statics.field801 = var36;
        Statics.field594 = var37;
        Statics.field2110 = var38;
        Statics.field2458 = var39;
        Statics.field1900 = var40;
        if (field344 && class150.method337(true, false) == 0) {
            field344 = false;
        }
        if (field344) {
            class73.method1475(arg0, arg1, arg2, arg3, 0);
            method3046(class142.field2150, false);
        }
    }

    @ObfuscatedName("db.aq(Laf;B)V")
    public static final void method2374(class29 arg0) {
        if (Statics.field24.field777 >> 7 == field493 && Statics.field24.field744 >> 7 == field494) {
            field493 = 0;
        }
        int var1 = field289;
        if (class29.field703 == arg0 || class29.field700 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field703 == arg0) {
                var3 = Statics.field24;
                var4 = 33538048;
            } else if (class29.field700 == arg0) {
                var3 = field445[field486];
                var4 = field486 << 14;
            } else {
                var3 = field445[field385[var2]];
                var4 = field385[var2] << 14;
                if (class29.field699 == arg0 && field486 == field385[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method22() && !var3.field41) {
                var3.field45 = false;
                if ((field471 && field289 > 50 || field289 > 200) && class29.field703 != arg0 && var3.field770 == var3.field748) {
                    var3.field45 = true;
                }
                int var5 = var3.field777 >> 7;
                int var6 = var3.field744 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field318 < var3.field35 || field318 >= var3.field34) {
                        if ((var3.field777 & 0x7F) == 64 && (var3.field744 & 0x7F) == 64) {
                            if (field367 == field366[var5][var6]) {
                                continue;
                            }
                            field366[var5][var6] = field367;
                        }
                        var3.field29 = method36(var3.field777, var3.field744, Statics.field1896);
                        Statics.field2098.method1592(Statics.field1896, var3.field777, var3.field744, var3.field29, 60, var3, var3.field760, var4, var3.field746);
                    } else {
                        var3.field45 = false;
                        var3.field29 = method36(var3.field777, var3.field744, Statics.field1896);
                        Statics.field2098.method1582(Statics.field1896, var3.field777, var3.field744, var3.field29, 60, var3, var3.field760, var4, var3.field47, var3.field42, var3.field36, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.at(ZI)V")
    public static final void method12(boolean arg0) {
        for (int var1 = 0; var1 < field303; var1++) {
            class30 var2 = field302[field304[var1]];
            int var3 = (field304[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field712.field831 == arg0 && var2.field712.method617()) {
                int var4 = var2.field777 >> 7;
                int var5 = var2.field744 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field747 == 1 && (var2.field777 & 0x7F) == 64 && (var2.field744 & 0x7F) == 64) {
                        if (field367 == field366[var4][var5]) {
                            continue;
                        }
                        field366[var4][var5] = field367;
                    }
                    if (!var2.field712.field839) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2098.method1592(Statics.field1896, var2.field777, var2.field744, method36(var2.field777 + (var2.field747 * 64 - 64), var2.field744 + (var2.field747 * 64 - 64), Statics.field1896), var2.field747 * 64 - 64 + 60, var2, var2.field760, var3, var2.field746);
                }
            }
        }
    }

    @ObfuscatedName("dz.ag(I)V")
    public static final void method2345() {
        for (class7 var0 = (class7) field400.method3122(); var0 != null; var0 = (class7) field400.method3124()) {
            if (Statics.field1896 != var0.field98 || field318 > var0.field104) {
                var0.method3204();
            } else if (field318 >= var0.field103) {
                if (var0.field107 > 0) {
                    class30 var1 = field302[var0.field107 - 1];
                    if (var1 != null && var1.field777 >= 0 && var1.field777 < 13312 && var1.field744 >= 0 && var1.field744 < 13312) {
                        var0.method65(var1.field777, var1.field744, method36(var1.field777, var1.field744, var0.field98) - var0.field99, field318);
                    }
                }
                if (var0.field107 < 0) {
                    int var2 = -var0.field107 - 1;
                    class3 var3;
                    if (field389 == var2) {
                        var3 = Statics.field24;
                    } else {
                        var3 = field445[var2];
                    }
                    if (var3 != null && var3.field777 >= 0 && var3.field777 < 13312 && var3.field744 >= 0 && var3.field744 < 13312) {
                        var0.method65(var3.field777, var3.field744, method36(var3.field777, var3.field744, var0.field98) - var0.field99, field318);
                    }
                }
                var0.method70(field433);
                Statics.field2098.method1592(Statics.field1896, (int) var0.field109, (int) var0.field110, (int) var0.field111, 60, var0, var0.field117, -1, false);
            }
        }
    }

    @ObfuscatedName("cr.am(I)V")
    public static final void method2018() {
        for (class26 var0 = (class26) field401.method3122(); var0 != null; var0 = (class26) field401.method3124()) {
            if (Statics.field1896 != var0.field631 || var0.field634) {
                var0.method3204();
            } else if (field318 >= var0.field629) {
                var0.method523(field433);
                if (var0.field634) {
                    var0.method3204();
                } else {
                    Statics.field2098.method1592(var0.field631, var0.field632, var0.field630, var0.field633, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dg.aw(I)I")
    public static final int method2337() {
        if (Statics.field92.field148) {
            return Statics.field1896;
        } else {
            int var0 = method36(Statics.field801, Statics.field2110, Statics.field1896);
            return var0 - Statics.field594 >= 800 || (class6.field78[Statics.field1896][Statics.field801 >> 7][Statics.field2110 >> 7] & 0x4) == 0 ? 3 : Statics.field1896;
        }
    }

    @ObfuscatedName("ab.ac(IIB)V")
    public static final void method573(int arg0, int arg1) {
        if (field284 == 2) {
            method578((field287 - Statics.field1075 << 7) + field290, (field378 - Statics.field1673 << 7) + field291, field403 * 2);
            if (field379 > -1 && field318 % 20 < 10) {
                Statics.field551[0].method1400(field379 + arg0 - 12, field369 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("x.as(Lah;IIIIII)V")
    public static final void method118(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field712;
            if (var6.field838 != null) {
                var6 = var6.method603();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field289) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field41) {
                return;
            }
            if (var8.field30 != -1 || var8.field31 != -1) {
                method75(arg0, arg0.field791 + 15);
                if (field379 > -1) {
                    if (var8.field30 != -1) {
                        Statics.field64[var8.field30].method1400(field379 + arg2 - 12, field369 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field31 != -1) {
                        Statics.field2965[var8.field31].method1400(field379 + arg2 - 12, field369 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field284 == 10 && field286 == field385[arg1]) {
                method75(arg0, arg0.field791 + 15);
                if (field379 > -1) {
                    Statics.field551[1].method1400(field379 + arg2 - 12, field369 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field712;
            if (var9.field838 != null) {
                var9 = var9.method603();
            }
            if (var9.field840 >= 0 && var9.field840 < Statics.field2965.length) {
                method75(arg0, arg0.field791 + 15);
                if (field379 > -1) {
                    Statics.field2965[var9.field840].method1400(field379 + arg2 - 12, field369 + arg3 - 30);
                }
            }
            if (field284 == 1 && field285 == field304[arg1 - field289] && field318 % 20 < 10) {
                method75(arg0, arg0.field791 + 15);
                if (field379 > -1) {
                    Statics.field551[0].method1400(field379 + arg2 - 12, field369 + arg3 - 28);
                }
            }
        }
        if (arg0.field764 != null && (arg1 >= field289 || field478 == 4 || !arg0.field757 && (field478 == 0 || field478 == 3 || field478 == 1 && method673(((class3) arg0).field46, false)))) {
            method75(arg0, arg0.field791);
            if (field379 > -1 && field464 < field331) {
                field361[field464] = Statics.field48.method3234(arg0.field764) / 2;
                field360[field464] = Statics.field48.field2910;
                field381[field464] = field379;
                field414[field464] = field369;
                field450[field464] = arg0.field755;
                field363[field464] = arg0.field749;
                field364[field464] = arg0.field780;
                field319[field464] = arg0.field764;
                field464++;
            }
        }
        if (arg0.field793 > field318) {
            method75(arg0, arg0.field791 + 15);
            if (field379 > -1) {
                int var10;
                if (arg1 < field289) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field712;
                    var10 = var11.field820;
                }
                int var12 = arg0.field765 * var10 / arg0.field766;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field765 > 0) {
                    var12 = 1;
                }
                class73.method1475(field379 + arg2 - var10 / 2, field369 + arg3 - 3, var12, 5, 65280);
                class73.method1475(field379 + arg2 - var10 / 2 + var12, field369 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field775[var13] > field318) {
                method75(arg0, arg0.field791 / 2);
                if (field379 > -1) {
                    if (var13 == 1) {
                        field369 -= 20;
                    }
                    if (var13 == 2) {
                        field379 -= 15;
                        field369 -= 10;
                    }
                    if (var13 == 3) {
                        field379 += 15;
                        field369 -= 10;
                    }
                    Statics.field715[arg0.field756[var13]].method1400(field379 + arg2 - 12, field369 + arg3 - 12);
                    Statics.field710.method3245(Integer.toString(arg0.field761[var13]), field379 + arg2 - 1, field369 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("x.az(IIIIB)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3) {
        field464 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field303 + field289; var6++) {
            class33 var7;
            if (var6 == -1) {
                var7 = Statics.field24;
            } else if (var6 < field289) {
                var7 = field445[field385[var6]];
                if (field486 == field385[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field302[field304[var6 - field289]];
            }
            method118(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method118(field445[field486], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field464; var8++) {
            int var9 = field381[var8];
            int var10 = field414[var8];
            int var11 = field361[var8];
            int var12 = field360[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field414[var14] - field360[var14] && var10 - var12 < field414[var14] + 2 && var9 - var11 < field381[var14] + field361[var14] && var9 + var11 > field381[var14] - field361[var14] && field414[var14] - field360[var14] < var10) {
                        var10 = field414[var14] - field360[var14];
                        var13 = true;
                    }
                }
            }
            field379 = field381[var8];
            field369 = field414[var8] = var10;
            String var15 = field319[var8];
            if (field427 == 0) {
                int var16 = 16776960;
                if (field450[var8] < 6) {
                    var16 = field477[field450[var8]];
                }
                if (field450[var8] == 6) {
                    var16 = field367 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field450[var8] == 7) {
                    var16 = field367 % 20 < 10 ? 255 : 65535;
                }
                if (field450[var8] == 8) {
                    var16 = field367 % 20 < 10 ? 45056 : 8454016;
                }
                if (field450[var8] == 9) {
                    int var17 = 150 - field364[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field450[var8] == 10) {
                    int var18 = 150 - field364[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field450[var8] == 11) {
                    int var19 = 150 - field364[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field363[var8] == 0) {
                    Statics.field48.method3245(var15, field379 + arg0, field369 + arg1, var16, 0);
                }
                if (field363[var8] == 1) {
                    Statics.field48.method3243(var15, field379 + arg0, field369 + arg1, var16, 0, field367);
                }
                if (field363[var8] == 2) {
                    Statics.field48.method3323(var15, field379 + arg0, field369 + arg1, var16, 0, field367);
                }
                if (field363[var8] == 3) {
                    Statics.field48.method3247(var15, field379 + arg0, field369 + arg1, var16, 0, field367, 150 - field364[var8]);
                }
                if (field363[var8] == 4) {
                    int var20 = (150 - field364[var8]) * (Statics.field48.method3234(var15) + 100) / 150;
                    class73.method1478(field379 + arg0 - 50, arg1, field379 + arg0 + 50, arg1 + arg3);
                    Statics.field48.method3239(var15, field379 + arg0 + 50 - var20, field369 + arg1, var16, 0);
                    class73.method1484(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field363[var8] == 5) {
                    int var21 = 150 - field364[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class73.method1478(arg0, field369 + arg1 - Statics.field48.field2910 - 1, arg0 + arg2, field369 + arg1 + 5);
                    Statics.field48.method3245(var15, field379 + arg0, field369 + arg1 + var22, var16, 0);
                    class73.method1484(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field48.method3245(var15, field379 + arg0, field369 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("q.ad(IIIIB)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3) {
        if (field373 == 1) {
            Statics.field601[field372 / 100].method1400(field359 - 8, field272 - 8);
        }
        if (field373 == 2) {
            Statics.field601[field372 / 100 + 4].method1400(field359 - 8, field272 - 8);
        }
        field345 = 0;
        int var4 = (Statics.field24.field777 >> 7) + Statics.field1075;
        int var5 = (Statics.field24.field744 >> 7) + Statics.field1673;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field345 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field345 = 1;
        }
        if (field345 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field345 = 0;
        }
        if (!field435) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field1914.method3240("Fps:" + field2049, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field471) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field471) {
            var10 = 16711680;
        }
        Statics.field1914.method3240("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("s.ax(Lah;IB)V")
    public static final void method75(class33 arg0, int arg1) {
        method578(arg0.field777, arg0.field744, arg1);
    }

    @ObfuscatedName("ao.aa(IIII)V")
    public static final void method578(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field379 = -1;
            field369 = -1;
            return;
        }
        int var3 = method36(arg0, arg1, Statics.field1896) - arg2;
        int var4 = arg0 - Statics.field801;
        int var5 = var3 - Statics.field594;
        int var6 = arg1 - Statics.field2110;
        int var7 = class84.field1465[Statics.field2458];
        int var8 = class84.field1486[Statics.field2458];
        int var9 = class84.field1465[Statics.field1900];
        int var10 = class84.field1486[Statics.field1900];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field379 = (var11 << 9) / var15 + 256;
            field369 = (var14 << 9) / var15 + 167;
        } else {
            field379 = -1;
            field369 = -1;
        }
    }

    @ObfuscatedName("r.aj(IIII)I")
    public static final int method36(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field78[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field93[var5][var3][var4] + class6.field93[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field93[var5][var3][var4 + 1] + class6.field93[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("x.an(ZS)V")
    public static final void method116(boolean arg0) {
        field325 = arg0;
        if (!field325) {
            int var1 = field308.method2099();
            int var2 = field308.method2100();
            int var3 = field308.method2090();
            int var4 = (field309 - field308.field1841) / 16;
            Statics.field202 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field202[var5][var6] = field308.method2107();
                }
            }
            int var7 = field308.method2099();
            int var8 = field308.method2099();
            Statics.field794 = new int[var4];
            Statics.field180 = new int[var4];
            Statics.field2395 = new int[var4];
            Statics.field522 = new byte[var4][];
            Statics.field694 = new byte[var4][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field794[var10] = var13;
                        Statics.field180[var10] = Statics.field1884.method2655("m" + var11 + "_" + var12);
                        Statics.field2395[var10] = Statics.field1884.method2655("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method11(var7, var8, var3, var2, var1);
            return;
        }
        int var14 = field308.method2099();
        int var15 = field308.method2100();
        int var16 = field308.method2186();
        int var17 = field308.method2091();
        field308.method2300();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field308.method2301(1);
                    if (var21 == 1) {
                        field326[var18][var19][var20] = field308.method2301(26);
                    } else {
                        field326[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field308.method2302();
        int var22 = (field309 - field308.field1841) / 16;
        Statics.field202 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field202[var23][var24] = field308.method2107();
            }
        }
        int var25 = field308.method2186();
        Statics.field794 = new int[var22];
        Statics.field180 = new int[var22];
        Statics.field2395 = new int[var22];
        Statics.field522 = new byte[var22][];
        Statics.field694 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field326[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field794[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field794[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field180[var26] = Statics.field1884.method2655("m" + var35 + "_" + var36);
                            Statics.field2395[var26] = Statics.field1884.method2655("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method11(var25, var14, var17, var16, var15);
    }

    @ObfuscatedName("o.bw(IIIIII)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field967 == arg0 && Statics.field2756 == arg1 && field436 == arg2 || !field471) {
            return;
        }
        Statics.field967 = arg0;
        Statics.field2756 = arg1;
        field436 = arg2;
        if (!field471) {
            field436 = 0;
        }
        method3054(25);
        method3046(class142.field2150, true);
        int var5 = Statics.field1075;
        int var6 = Statics.field1673;
        Statics.field1075 = (arg0 - 6) * 8;
        Statics.field1673 = (arg1 - 6) * 8;
        int var7 = Statics.field1075 - var5;
        int var8 = Statics.field1673 - var6;
        int var9 = Statics.field1075;
        int var10 = Statics.field1673;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field302[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field796[var13] -= var7;
                    var12.field745[var13] -= var8;
                }
                var12.field777 -= var7 * 128;
                var12.field744 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field445[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field796[var16] -= var7;
                    var15.field745[var16] -= var8;
                }
                var15.field777 -= var7 * 128;
                var15.field744 -= var8 * 128;
            }
        }
        Statics.field1896 = arg2;
        Statics.field24.method586(arg3, arg4, false);
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
                        field263[var27][var23][var24] = field263[var27][var25][var26];
                    } else {
                        field263[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field399.method3122(); var28 != null; var28 = (class15) field399.method3124()) {
            var28.field225 -= var7;
            var28.field208 -= var8;
            if (var28.field225 < 0 || var28.field208 < 0 || var28.field225 >= 104 || var28.field208 >= 104) {
                var28.method3204();
            }
        }
        if (field493 != 0) {
            field493 -= var7;
            field494 -= var8;
        }
        field377 = 0;
        field488 = false;
        field446 = -1;
        field401.method3134();
        field400.method3134();
    }

    @ObfuscatedName("ek.br(ZB)V")
    public static final void method2613(boolean arg0) {
        method79();
        field312++;
        if (field312 < 50 && !arg0) {
            return;
        }
        field312 = 0;
        if (field476 || Statics.field1992 == null) {
            return;
        }
        field386.method2319(29);
        try {
            Statics.field1992.method2509(field386.field1840, 0, field386.field1841);
            field386.field1841 = 0;
        } catch (IOException var2) {
            field476 = true;
        }
    }

    @ObfuscatedName("f.bl(II)V")
    public static final void method92(int arg0) {
        int[] var1 = Statics.field1867.field1303;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field78[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2098.method1604(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2098.method1604(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1867.method1472();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field78[arg0][var10][var9] & 0x18) == 0) {
                    method495(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method495(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field489 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2098.method1580(Statics.field1896, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method809(var14).field864;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field324[Statics.field1896].field2946;
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
                        field492[field489] = Statics.field1823[var15];
                        field490[field489] = var16;
                        field266[field489] = var17;
                        field489++;
                    }
                }
            }
        }
        Statics.field574.method1383();
    }

    @ObfuscatedName("t.bt(IIIIIB)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2098.method1596(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2098.method1600(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1867.field1303;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method809(var12);
            if (var13.field875 == -1) {
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
                class74 var14 = Statics.field179[var13.field875];
                if (var14 != null) {
                    int var15 = (var13.field896 * 4 - var14.field1328) / 2;
                    int var16 = (var13.field861 * 4 - var14.field1324) / 2;
                    var14.method1544(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field861) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2098.method1722(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2098.method1600(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method809(var21);
            if (var22.field875 != -1) {
                class74 var23 = Statics.field179[var22.field875];
                if (var23 != null) {
                    int var24 = (var22.field896 * 4 - var23.field1328) / 2;
                    int var25 = (var22.field861 * 4 - var23.field1324) / 2;
                    var23.method1544(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field861) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1867.field1303;
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
        int var29 = Statics.field2098.method1580(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method809(var30);
        if (var31.field875 == -1) {
            return;
        }
        class74 var32 = Statics.field179[var31.field875];
        if (var32 != null) {
            int var33 = (var31.field896 * 4 - var32.field1328) / 2;
            int var34 = (var31.field861 * 4 - var32.field1324) / 2;
            var32.method1544(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field861) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fg.bo(I)Z")
    public static final boolean method2935() {
        if (Statics.field1992 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1992.method2507();
            if (var0 == 0) {
                return false;
            }
            if (field310 == -1) {
                Statics.field1992.method2508(field308.field1840, 0, 1);
                field308.field1841 = 0;
                field310 = field308.method2296();
                field309 = class166.field2794[field310];
                var0--;
            }
            if (field309 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1992.method2508(field308.field1840, 0, 1);
                field309 = field308.field1840[0] & 0xFF;
                var0--;
            }
            if (field309 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1992.method2508(field308.field1840, 0, 2);
                field308.field1841 = 0;
                field309 = field308.method2232();
                var0 -= 2;
            }
            if (var0 < field309) {
                return false;
            }
            field308.field1841 = 0;
            Statics.field1992.method2508(field308.field1840, 0, field309);
            field412 = 0;
            field495 = field460;
            field460 = field514;
            field514 = field310;
            if (field310 == 207) {
                field292 = 1;
                field457 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 179) {
                int var1 = field308.method2100();
                field425 = var1;
                method20(var1);
                class32.method579(field425);
                for (int var2 = 0; var2 < 100; var2++) {
                    field469[var2] = true;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 10) {
                field488 = false;
                for (int var3 = 0; var3 < 5; var3++) {
                    field508[var3] = false;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 64) {
                Statics.field2653 = field308.method2090();
                Statics.field740 = field308.method2123();
                for (int var4 = Statics.field2653; var4 < Statics.field2653 + 8; var4++) {
                    for (int var5 = Statics.field740; var5 < Statics.field740 + 8; var5++) {
                        if (field263[Statics.field1896][var4][var5] != null) {
                            field263[Statics.field1896][var4][var5] = null;
                            method2430(var4, var5);
                        }
                    }
                }
                for (class15 var6 = (class15) field399.method3122(); var6 != null; var6 = (class15) field399.method3124()) {
                    if (var6.field225 >= Statics.field2653 && var6.field225 < Statics.field2653 + 8 && var6.field208 >= Statics.field740 && var6.field208 < Statics.field740 + 8 && Statics.field1896 == var6.field214) {
                        var6.field216 = 0;
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 20) {
                Statics.field182 = class117.method3(field308.method2123());
                field310 = -1;
                return true;
            }
            if (field310 == 234) {
                int var7 = field308.method2100();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field308.method2207();
                int var9 = field308.method2108();
                int var10 = field308.method2232();
                if (var10 == 65535) {
                    var10 = -1;
                }
                for (int var11 = var7; var11 <= var10; var11++) {
                    long var12 = ((long) var9 << 32) + (long) var11;
                    class186 var14 = field358.method3092(var12);
                    if (var14 != null) {
                        var14.method3204();
                    }
                    field358.method3091(new class179(var8), var12);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 94) {
                int var15 = field308.method2107();
                int var16 = field308.method2232();
                int var17 = var16 >> 10 & 0x1F;
                int var18 = var16 >> 5 & 0x1F;
                int var19 = var16 & 0x1F;
                int var20 = (var19 << 3) + (var17 << 19) + (var18 << 11);
                class152 var21 = class152.method1829(var15);
                if (var21.field2540 != var20) {
                    var21.field2540 = var20;
                    method3375(var21);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 233) {
                int var22 = field308.method2186();
                int var23 = field308.method2108();
                class152 var24 = class152.method1829(var23);
                if (var24.field2553 != 2 || var24.field2607 != var22) {
                    var24.field2553 = 2;
                    var24.field2607 = var22;
                    method3375(var24);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 159) {
                method2723();
                field431 = field308.method2068();
                field417 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 37) {
                class22 var25 = new class22();
                var25.field590 = field308.method2073();
                var25.field583 = field308.method2232();
                int var26 = field308.method2207();
                var25.field581 = var26;
                method3054(45);
                Statics.field1992.method2504();
                Statics.field1992 = null;
                class28.method1731(var25);
                field310 = -1;
                return false;
            }
            if (field310 == 109) {
                method2723();
                field430 = field308.method2123();
                field417 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 98) {
                class110 var27 = field308;
                int var28 = field309;
                class188 var29 = new class188();
                var29.field2880 = var27.method2123();
                var29.field2884 = var27.method2207();
                var29.field2881 = new int[var29.field2880];
                var29.field2882 = new int[var29.field2880];
                var29.field2883 = new Field[var29.field2880];
                var29.field2887 = new int[var29.field2880];
                var29.field2885 = new Method[var29.field2880];
                var29.field2879 = new byte[var29.field2880][][];
                for (int var30 = 0; var30 < var29.field2880; var30++) {
                    try {
                        int var31 = var27.method2123();
                        if (var31 == 0 || var31 == 1 || var31 == 2) {
                            String var32 = var27.method2073();
                            String var33 = var27.method2073();
                            int var34 = 0;
                            if (var31 == 1) {
                                var34 = var27.method2207();
                            }
                            var29.field2881[var30] = var31;
                            var29.field2887[var30] = var34;
                            if (class189.method2404(var32).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var29.field2883[var30] = class189.method2404(var32).getDeclaredField(var33);
                        } else if (var31 == 3 || var31 == 4) {
                            String var35 = var27.method2073();
                            String var36 = var27.method2073();
                            int var37 = var27.method2123();
                            String[] var38 = new String[var37];
                            for (int var39 = 0; var39 < var37; var39++) {
                                var38[var39] = var27.method2073();
                            }
                            String var40 = var27.method2073();
                            byte[][] var41 = new byte[var37][];
                            if (var31 == 3) {
                                for (int var42 = 0; var42 < var37; var42++) {
                                    int var43 = var27.method2207();
                                    var41[var42] = new byte[var43];
                                    var27.method2076(var41[var42], 0, var43);
                                }
                            }
                            var29.field2881[var30] = var31;
                            Class[] var44 = new Class[var37];
                            for (int var45 = 0; var45 < var37; var45++) {
                                var44[var45] = class189.method2404(var38[var45]);
                            }
                            Class var46 = class189.method2404(var40);
                            if (class189.method2404(var35).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var47 = class189.method2404(var35).getDeclaredMethods();
                            Method[] var48 = var47;
                            for (int var49 = 0; var49 < var48.length; var49++) {
                                Method var50 = var48[var49];
                                if (var50.getName().equals(var36)) {
                                    Class[] var51 = var50.getParameterTypes();
                                    if (var44.length == var51.length) {
                                        boolean var52 = true;
                                        for (int var53 = 0; var53 < var44.length; var53++) {
                                            if (var44[var53] != var51[var53]) {
                                                var52 = false;
                                                break;
                                            }
                                        }
                                        if (var52 && var46 == var50.getReturnType()) {
                                            var29.field2885[var30] = var50;
                                        }
                                    }
                                }
                            }
                            var29.field2879[var30] = var41;
                        }
                    } catch (ClassNotFoundException var308) {
                        var29.field2882[var30] = -1;
                    } catch (SecurityException var309) {
                        var29.field2882[var30] = -2;
                    } catch (NullPointerException var310) {
                        var29.field2882[var30] = -3;
                    } catch (Exception var311) {
                        var29.field2882[var30] = -4;
                    } catch (Throwable var312) {
                        var29.field2882[var30] = -5;
                    }
                }
                class189.field2890.method3157(var29);
                field310 = -1;
                return true;
            }
            if (field310 == 230) {
                int var59 = field308.method2123();
                int var60 = field308.method2123();
                int var61 = field308.method2123();
                int var62 = field308.method2123();
                field508[var59] = true;
                field509[var59] = var60;
                field510[var59] = var61;
                field294[var59] = var62;
                field512[var59] = 0;
                field310 = -1;
                return true;
            }
            if (field310 == 152) {
                String var63 = field308.method2073();
                int var64 = field308.method2232();
                byte var65 = field308.method2066();
                boolean var66 = false;
                if (var65 == -128) {
                    var66 = true;
                }
                if (var66) {
                    if (Statics.field584 == 0) {
                        field310 = -1;
                        return true;
                    }
                    boolean var67 = false;
                    int var68;
                    for (var68 = 0; var68 < Statics.field584 && (!Statics.field533[var68].field570.equals(var63) || Statics.field533[var68].field575 != var64); var68++) {
                    }
                    if (var68 < Statics.field584) {
                        while (var68 < Statics.field584 - 1) {
                            Statics.field533[var68] = Statics.field533[var68 + 1];
                            var68++;
                        }
                        Statics.field584--;
                        Statics.field533[Statics.field584] = null;
                    }
                } else {
                    field308.method2073();
                    class21 var69 = new class21();
                    var69.field570 = var63;
                    var69.field569 = class200.method1827(var69.field570, Statics.field270);
                    var69.field575 = var64;
                    var69.field572 = var65;
                    int var70;
                    for (var70 = Statics.field584 - 1; var70 >= 0; var70--) {
                        int var71 = Statics.field533[var70].field569.compareTo(var69.field570);
                        if (var71 == 0) {
                            Statics.field533[var70].field575 = var64;
                            Statics.field533[var70].field572 = var65;
                            if (var63.equals(Statics.field24.field46)) {
                                Statics.field579 = var65;
                            }
                            field458 = field449;
                            field310 = -1;
                            return true;
                        }
                        if (var71 < 0) {
                            break;
                        }
                    }
                    if (Statics.field584 >= Statics.field533.length) {
                        field310 = -1;
                        return true;
                    }
                    for (int var72 = Statics.field584 - 1; var72 > var70; var72--) {
                        Statics.field533[var72 + 1] = Statics.field533[var72];
                    }
                    if (Statics.field584 == 0) {
                        Statics.field533 = new class21[100];
                    }
                    Statics.field533[var70 + 1] = var69;
                    Statics.field584++;
                    if (var63.equals(Statics.field24.field46)) {
                        Statics.field579 = var65;
                    }
                }
                field458 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 170) {
                field443 = 0;
                field279 = 0;
                method114();
                method2500();
                while (field308.method2303(field309) >= 11) {
                    int var73 = field308.method2301(11);
                    if (var73 == 2047) {
                        break;
                    }
                    boolean var74 = false;
                    if (field445[var73] == null) {
                        field445[var73] = new class3();
                        if (field388[var73] != null) {
                            field445[var73].method24(field388[var73]);
                        }
                        var74 = true;
                    }
                    field385[++field289 - 1] = var73;
                    class3 var75 = field445[var73];
                    var75.field790 = field318;
                    int var76 = field308.method2301(1);
                    int var77 = field308.method2301(5);
                    if (var77 > 15) {
                        var77 -= 32;
                    }
                    int var78 = field308.method2301(5);
                    if (var78 > 15) {
                        var78 -= 32;
                    }
                    int var79 = field382[field308.method2301(3)];
                    if (var74) {
                        var75.field792 = var75.field760 = var79;
                    }
                    int var80 = field308.method2301(1);
                    if (var80 == 1) {
                        field462[++field279 - 1] = var73;
                    }
                    var75.method586(Statics.field24.field796[0] + var77, Statics.field24.field745[0] + var78, var76 == 1);
                }
                field308.method2302();
                method14();
                for (int var81 = 0; var81 < field443; var81++) {
                    int var82 = field392[var81];
                    if (field318 != field445[var82].field790) {
                        field445[var82] = null;
                    }
                }
                if (field309 != field308.field1841) {
                    throw new RuntimeException(field308.field1841 + class2.field17 + field309);
                }
                for (int var83 = 0; var83 < field289; var83++) {
                    if (field445[field385[var83]] == null) {
                        throw new RuntimeException(var83 + class2.field17 + field289);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 54) {
                int var84 = field308.method2101();
                int var85 = field308.method2108();
                int var86 = field308.method2068();
                class152 var87 = class152.method1829(var85);
                int var88 = var87.field2595 + var86;
                int var89 = var87.field2529 + var84;
                if (var87.field2526 != var88 || var87.field2527 != var89) {
                    var87.field2526 = var88;
                    var87.field2527 = var89;
                    method3375(var87);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 130) {
                field308.field1841 += 28;
                if (field308.method2133()) {
                    class136.method126(field308, field308.field1841 - 28);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 40) {
                int var90 = field308.method2091();
                int var91 = field308.method2123();
                int var92 = field308.method2123();
                Statics.field1896 = var90 >> 1;
                Statics.field24.method586(var92, var91, (var90 & 0x1) == 1);
                field310 = -1;
                return true;
            }
            if (field310 == 213) {
                int var93 = field308.method2106();
                boolean var94 = field308.method2091() == 1;
                class152 var95 = class152.method1829(var93);
                if (var95.field2533 != var94) {
                    var95.field2533 = var94;
                    method3375(var95);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 236) {
                String var96 = field308.method2073();
                String var97 = class192.method3280(class199.method516(class191.method2349(field308)));
                class10.method1313(6, var96, var97);
                field310 = -1;
                return true;
            }
            if (field310 == 160) {
                int var98 = field308.method2099();
                if (var98 == 65535) {
                    var98 = -1;
                }
                method2620(var98);
                field310 = -1;
                return true;
            }
            if (field310 == 141) {
                int var99 = field308.method2215();
                int var100 = field308.method2186();
                if (var100 == 65535) {
                    var100 = -1;
                }
                if (field496 != 0 && var100 != -1) {
                    class161.method1920(Statics.field56, var100, 0, field496, false);
                    field498 = true;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 86) {
                int var101 = field308.method2207();
                int var102 = field308.method2232();
                if (var101 < -70000) {
                    var102 += 32768;
                }
                class152 var103;
                if (var101 >= 0) {
                    var103 = class152.method1829(var101);
                } else {
                    var103 = null;
                }
                while (field308.field1841 < field309) {
                    int var104 = field308.method2078();
                    int var105 = field308.method2232();
                    int var106 = 0;
                    if (var105 != 0) {
                        var106 = field308.method2123();
                        if (var106 == 255) {
                            var106 = field308.method2207();
                        }
                    }
                    if (var103 != null && var104 >= 0 && var104 < var103.field2623.length) {
                        var103.field2623[var104] = var105;
                        var103.field2579[var104] = var106;
                    }
                    Statics.method1916(var102, var104, var105 - 1, var106);
                }
                if (var103 != null) {
                    method3375(var103);
                }
                method2723();
                field452[++field453 - 1 & 0x1F] = var102 & 0x7FFF;
                field310 = -1;
                return true;
            }
            if (field310 == 155) {
                while (field308.field1841 < field309) {
                    boolean var107 = field308.method2123() == 1;
                    String var108 = field308.method2073();
                    String var109 = field308.method2073();
                    int var110 = field308.method2232();
                    int var111 = field308.method2123();
                    int var112 = field308.method2123();
                    boolean var113 = (var112 & 0x2) != 0;
                    boolean var114 = (var112 & 0x1) != 0;
                    if (var110 > 0) {
                        field308.method2073();
                        field308.method2123();
                        field308.method2207();
                    }
                    field308.method2073();
                    for (int var115 = 0; var115 < field513; var115++) {
                        class16 var116 = field515[var115];
                        if (var107) {
                            if (var109.equals(var116.field246)) {
                                var116.field246 = var108;
                                var116.field236 = var109;
                                var108 = null;
                                break;
                            }
                        } else if (var108.equals(var116.field246)) {
                            if (var116.field232 != var110) {
                                boolean var117 = true;
                                for (class34 var118 = (class34) field327.method3082(); var118 != null; var118 = (class34) field327.method3090()) {
                                    if (var118.field804.equals(var108)) {
                                        if (var110 != 0 && var118.field806 == 0) {
                                            var118.method3200();
                                            var117 = false;
                                        } else if (var110 == 0 && var118.field806 != 0) {
                                            var118.method3200();
                                            var117 = false;
                                        }
                                    }
                                }
                                if (var117) {
                                    field327.method3081(new class34(var108, var110));
                                }
                                var116.field232 = var110;
                            }
                            var116.field236 = var109;
                            var116.field233 = var111;
                            var116.field234 = var113;
                            var116.field235 = var114;
                            var108 = null;
                            break;
                        }
                    }
                    if (var108 != null && field513 < 400) {
                        class16 var119 = new class16();
                        field515[field513] = var119;
                        var119.field246 = var108;
                        var119.field236 = var109;
                        var119.field232 = var110;
                        var119.field233 = var111;
                        var119.field234 = var113;
                        var119.field235 = var114;
                        field513++;
                    }
                }
                field292 = 2;
                field457 = field449;
                boolean var120 = false;
                int var121 = field513;
                while (var121 > 0) {
                    boolean var122 = true;
                    var121--;
                    for (int var123 = 0; var123 < var121; var123++) {
                        boolean var124 = false;
                        class16 var125 = field515[var123];
                        class16 var126 = field515[var123 + 1];
                        if (field336 != var125.field232 && field336 == var126.field232) {
                            var124 = true;
                        }
                        if (!var124 && var125.field232 == 0 && var126.field232 != 0) {
                            var124 = true;
                        }
                        if (!var124 && !var125.field234 && var126.field234) {
                            var124 = true;
                        }
                        if (!var124 && !var125.field235 && var126.field235) {
                            var124 = true;
                        }
                        if (var124) {
                            class16 var127 = field515[var123];
                            field515[var123] = field515[var123 + 1];
                            field515[var123 + 1] = var127;
                            var122 = false;
                        }
                    }
                    if (var122) {
                        break;
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 15) {
                int var128 = field308.method2232();
                int var129 = field308.method2123();
                int var130 = field308.method2232();
                method2718(var128, var129, var130);
                field310 = -1;
                return true;
            }
            if (field310 == 1) {
                int var131 = field308.method2106();
                int var132 = field308.method2100();
                int var133 = field308.method2099();
                class152 var134 = class152.method1829(var131);
                var134.field2565 = (var132 << 16) + var133;
                field310 = -1;
                return true;
            }
            if (field310 == 249) {
                for (int var135 = 0; var135 < class154.field2647.length; var135++) {
                    if (class154.field2648[var135] != class154.field2647[var135]) {
                        class154.field2647[var135] = class154.field2648[var135];
                        method140(var135);
                        field357[++field451 - 1 & 0x1F] = var135;
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 38) {
                int var136 = field308.method2099();
                int var137 = field308.method2108();
                class152 var138 = class152.method1829(var137);
                if (var138 != null && var138.field2523 == 0) {
                    if (var136 > var138.field2512 - var138.field2531) {
                        var136 = var138.field2512 - var138.field2531;
                    }
                    if (var136 < 0) {
                        var136 = 0;
                    }
                    if (var138.field2558 != var136) {
                        var138.field2558 = var136;
                        method3375(var138);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 135) {
                String var139 = field308.method2073();
                int var140 = field308.method2106();
                class152 var141 = class152.method1829(var140);
                if (!var139.equals(var141.field2568)) {
                    var141.field2568 = var139;
                    method3375(var141);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 144) {
                String var142 = field308.method2073();
                long var143 = field308.method2131();
                long var145 = (long) field308.method2232();
                long var147 = (long) field308.method2215();
                int var149 = field308.method2123();
                long var150 = (var145 << 32) + var147;
                boolean var152 = false;
                for (int var153 = 0; var153 < 100; var153++) {
                    if (field362[var153] == var150) {
                        var152 = true;
                        break;
                    }
                }
                if (var149 <= 1 && method1828(var142)) {
                    var152 = true;
                }
                if (!var152 && field345 == 0) {
                    field362[field481] = var150;
                    field481 = (field481 + 1) % 100;
                    String var154 = class192.method3280(class199.method516(class191.method2349(field308)));
                    if (var149 == 2 || var149 == 3) {
                        class10.method97(9, class2.method2502(1) + var142, var154, class198.method824(var143));
                    } else if (var149 == 1) {
                        class10.method97(9, class2.method2502(0) + var142, var154, class198.method824(var143));
                    } else {
                        class10.method97(9, var142, var154, class198.method824(var143));
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 70) {
                int var155 = field308.method2078();
                boolean var156 = field308.method2123() == 1;
                String var157 = "";
                boolean var158 = false;
                if (var156) {
                    var157 = field308.method2073();
                    if (method1828(var157)) {
                        var158 = true;
                    }
                }
                String var159 = field308.method2073();
                if (!var158) {
                    class10.method1313(var155, var157, var159);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 243) {
                int var160 = field308.method2108();
                class152 var161 = class152.method1829(var160);
                var161.field2553 = 3;
                var161.field2607 = Statics.field24.field33.method2853();
                method3375(var161);
                field310 = -1;
                return true;
            }
            if (field310 == 157) {
                field443 = 0;
                field279 = 0;
                method89();
                while (field308.method2303(field309) >= 27) {
                    int var162 = field308.method2301(15);
                    if (var162 == 32767) {
                        break;
                    }
                    boolean var163 = false;
                    if (field302[var162] == null) {
                        field302[var162] = new class30();
                        var163 = true;
                    }
                    class30 var164 = field302[var162];
                    field304[++field303 - 1] = var162;
                    var164.field790 = field318;
                    int var165 = field308.method2301(1);
                    if (var165 == 1) {
                        field462[++field279 - 1] = var162;
                    }
                    int var166 = field308.method2301(5);
                    if (var166 > 15) {
                        var166 -= 32;
                    }
                    int var167 = field308.method2301(5);
                    if (var167 > 15) {
                        var167 -= 32;
                    }
                    var164.field712 = class35.method472(field308.method2301(14));
                    int var168 = field308.method2301(1);
                    int var169 = field382[field308.method2301(3)];
                    if (var163) {
                        var164.field792 = var164.field760 = var169;
                    }
                    var164.field747 = var164.field712.field812;
                    var164.field769 = var164.field712.field835;
                    if (var164.field769 == 0) {
                        var164.field760 = 0;
                    }
                    var164.field751 = var164.field712.field818;
                    var164.field768 = var164.field712.field819;
                    var164.field753 = var164.field712.field821;
                    var164.field754 = var164.field712.field841;
                    var164.field748 = var164.field712.field815;
                    var164.field762 = var164.field712.field834;
                    var164.field750 = var164.field712.field817;
                    var164.method586(Statics.field24.field796[0] + var166, Statics.field24.field745[0] + var167, var168 == 1);
                }
                field308.method2302();
                for (int var170 = 0; var170 < field279; var170++) {
                    int var171 = field462[var170];
                    class30 var172 = field302[var171];
                    int var173 = field308.method2123();
                    if ((var173 & 0x80) != 0) {
                        var172.field767 = field308.method2232();
                        if (var172.field767 == 65535) {
                            var172.field767 = -1;
                        }
                    }
                    if ((var173 & 0x20) != 0) {
                        int var174 = field308.method2100();
                        if (var174 == 65535) {
                            var174 = -1;
                        }
                        int var175 = field308.method2123();
                        if (var172.field773 == var174 && var174 != -1) {
                            int var176 = class38.method131(var174).field921;
                            if (var176 == 1) {
                                var172.field774 = 0;
                                var172.field743 = 0;
                                var172.field772 = var175;
                                var172.field776 = 0;
                            }
                            if (var176 == 2) {
                                var172.field776 = 0;
                            }
                        } else if (var174 == -1 || var172.field773 == -1 || class38.method131(var174).field922 >= class38.method131(var172.field773).field922) {
                            var172.field773 = var174;
                            var172.field774 = 0;
                            var172.field743 = 0;
                            var172.field772 = var175;
                            var172.field776 = 0;
                            var172.field800 = var172.field795;
                        }
                    }
                    if ((var173 & 0x4) != 0) {
                        int var177 = field308.method2089();
                        int var178 = field308.method2091();
                        var172.method594(var177, var178, field318);
                        var172.field793 = field318 + 300;
                        var172.field765 = field308.method2100();
                        var172.field766 = field308.method2186();
                    }
                    if ((var173 & 0x40) != 0) {
                        var172.field712 = class35.method472(field308.method2232());
                        var172.field747 = var172.field712.field812;
                        var172.field769 = var172.field712.field835;
                        var172.field751 = var172.field712.field818;
                        var172.field768 = var172.field712.field819;
                        var172.field753 = var172.field712.field821;
                        var172.field754 = var172.field712.field841;
                        var172.field748 = var172.field712.field815;
                        var172.field762 = var172.field712.field834;
                        var172.field750 = var172.field712.field817;
                    }
                    if ((var173 & 0x1) != 0) {
                        var172.field763 = field308.method2099();
                        int var179 = field308.method2107();
                        var172.field782 = var179 >> 16;
                        var172.field781 = (var179 & 0xFFFF) + field318;
                        var172.field779 = 0;
                        var172.field759 = 0;
                        if (var172.field781 > field318) {
                            var172.field779 = -1;
                        }
                        if (var172.field763 == 65535) {
                            var172.field763 = -1;
                        }
                    }
                    if ((var173 & 0x8) != 0) {
                        int var180 = field308.method2123();
                        int var181 = field308.method2123();
                        var172.method594(var180, var181, field318);
                        var172.field793 = field318 + 300;
                        var172.field765 = field308.method2186();
                        var172.field766 = field308.method2232();
                    }
                    if ((var173 & 0x2) != 0) {
                        var172.field783 = field308.method2100();
                        var172.field798 = field308.method2232();
                    }
                    if ((var173 & 0x10) != 0) {
                        var172.field764 = field308.method2073();
                        var172.field780 = 100;
                    }
                }
                for (int var182 = 0; var182 < field443; var182++) {
                    int var183 = field392[var182];
                    if (field318 != field302[var183].field790) {
                        field302[var183].field712 = null;
                        field302[var183] = null;
                    }
                }
                if (field309 != field308.field1841) {
                    throw new RuntimeException(field308.field1841 + class2.field17 + field309);
                }
                for (int var184 = 0; var184 < field303; var184++) {
                    if (field302[field304[var184]] == null) {
                        throw new RuntimeException(var184 + class2.field17 + field303);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 190) {
                method116(false);
                field310 = -1;
                return true;
            }
            if (field310 == 200) {
                field284 = field308.method2123();
                if (field284 == 1) {
                    field285 = field308.method2232();
                }
                if (field284 >= 2 && field284 <= 6) {
                    if (field284 == 2) {
                        field290 = 64;
                        field291 = 64;
                    }
                    if (field284 == 3) {
                        field290 = 0;
                        field291 = 64;
                    }
                    if (field284 == 4) {
                        field290 = 128;
                        field291 = 64;
                    }
                    if (field284 == 5) {
                        field290 = 64;
                        field291 = 0;
                    }
                    if (field284 == 6) {
                        field290 = 64;
                        field291 = 128;
                    }
                    field284 = 2;
                    field287 = field308.method2232();
                    field378 = field308.method2232();
                    field403 = field308.method2123();
                }
                if (field284 == 10) {
                    field286 = field308.method2232();
                }
                field310 = -1;
                return true;
            }
            if (field310 == 142) {
                int var185 = field308.method2207();
                int var186 = field308.method2068();
                class152 var187 = class152.method1829(var185);
                if (var187.field2557 != var186 || var186 == -1) {
                    var187.field2557 = var186;
                    var187.field2620 = 0;
                    var187.field2628 = 0;
                    method3375(var187);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 49 || field310 == 150 || field310 == 30 || field310 == 95 || field310 == 201 || field310 == 29 || field310 == 44 || field310 == 211 || field310 == 138 || field310 == 96) {
                method96();
                field310 = -1;
                return true;
            }
            if (field310 == 139) {
                for (int var188 = 0; var188 < field445.length; var188++) {
                    if (field445[var188] != null) {
                        field445[var188].field773 = -1;
                    }
                }
                for (int var189 = 0; var189 < field302.length; var189++) {
                    if (field302[var189] != null) {
                        field302[var189].field773 = -1;
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 72) {
                String var190 = field308.method2073();
                int var191 = field308.method2089();
                int var192 = field308.method2089();
                if (var192 >= 1 && var192 <= 8) {
                    if (var190.equalsIgnoreCase("null")) {
                        var190 = null;
                    }
                    field394[var192 - 1] = var190;
                    field395[var192 - 1] = var191 == 0;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 90) {
                int var193 = field308.method2207();
                class152 var194 = class152.method1829(var193);
                for (int var195 = 0; var195 < var194.field2623.length; var195++) {
                    var194.field2623[var195] = -1;
                    var194.field2623[var195] = 0;
                }
                method3375(var194);
                field310 = -1;
                return true;
            }
            if (field310 == 116) {
                int var196 = field309 + field308.field1841;
                int var197 = field308.method2232();
                int var198 = field308.method2232();
                if (field425 != var197) {
                    field425 = var197;
                    method20(field425);
                    class32.method579(field425);
                    for (int var199 = 0; var199 < 100; var199++) {
                        field469[var199] = true;
                    }
                }
                while (var198-- > 0) {
                    int var200 = field308.method2207();
                    int var201 = field308.method2232();
                    int var202 = field308.method2123();
                    class4 var203 = (class4) field426.method3092((long) var200);
                    if (var203 != null && var203.field60 != var201) {
                        method2603(var203, true);
                        var203 = null;
                    }
                    if (var203 == null) {
                        class4 var204 = new class4();
                        var204.field60 = var201;
                        var204.field59 = var202;
                        field426.method3091(var204, (long) var200);
                        method20(var201);
                        class32.method579(var201);
                        class152 var205 = class152.method1829(var200);
                        if (var205 != null) {
                            method3375(var205);
                        }
                        if (field306 != null) {
                            method3375(field306);
                            field306 = null;
                        }
                        for (int var206 = 0; var206 < field320; var206++) {
                            if (method2605(field410[var206])) {
                                if (var206 < field320 - 1) {
                                    for (int var207 = var206; var207 < field320 - 1; var207++) {
                                        field384[var207] = field384[var207 + 1];
                                        field413[var207] = field413[var207 + 1];
                                        field410[var207] = field410[var207 + 1];
                                        field411[var207] = field411[var207 + 1];
                                        field408[var207] = field408[var207 + 1];
                                        field422[var207] = field422[var207 + 1];
                                    }
                                }
                                field320--;
                            }
                        }
                        if (field425 != -1) {
                            int var208 = field425;
                            if (class152.method2621(var208)) {
                                method2355(Statics.field2639[var208], 1);
                            }
                        }
                        var203 = var204;
                    }
                    var203.field50 = true;
                }
                for (class4 var210 = (class4) field426.method3096(); var210 != null; var210 = (class4) field426.method3093()) {
                    if (var210.field50) {
                        var210.field50 = false;
                    } else {
                        method2603(var210, true);
                    }
                }
                field358 = new class174(512);
                while (field308.field1841 < var196) {
                    int var211 = field308.method2207();
                    int var212 = field308.method2232();
                    int var213 = field308.method2232();
                    int var214 = field308.method2207();
                    for (int var215 = var212; var215 <= var213; var215++) {
                        long var216 = ((long) var211 << 32) + (long) var215;
                        field358.method3091(new class179(var214), var216);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 210) {
                int var218 = field308.method2099();
                int var219 = field308.method2108();
                int var220 = field308.method2232();
                int var221 = field308.method2100();
                class152 var222 = class152.method1829(var219);
                if (var222.field2582 != var221 || var222.field2597 != var220 || var222.field2519 != var218) {
                    var222.field2582 = var221;
                    var222.field2597 = var220;
                    var222.field2519 = var218;
                    method3375(var222);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 115) {
                int var223 = field308.method2106();
                int var224 = field308.method2100();
                class154.field2648[var224] = var223;
                if (class154.field2647[var224] != var223) {
                    class154.field2647[var224] = var223;
                    method140(var224);
                }
                field357[++field451 - 1 & 0x1F] = var224;
                field310 = -1;
                return true;
            }
            if (field310 == 80) {
                int var225 = field308.method2123();
                int var226 = field308.method2106();
                int var227 = field308.method2100();
                class4 var228 = (class4) field426.method3092((long) var226);
                if (var228 != null) {
                    method2603(var228, var228.field60 != var227);
                }
                class4 var229 = new class4();
                var229.field60 = var227;
                var229.field59 = var225;
                field426.method3091(var229, (long) var226);
                method20(var227);
                class32.method579(var227);
                class152 var230 = class152.method1829(var226);
                if (var230 != null) {
                    method3375(var230);
                }
                if (field306 != null) {
                    method3375(field306);
                    field306 = null;
                }
                method2392();
                if (field425 != -1) {
                    int var231 = field425;
                    if (class152.method2621(var231)) {
                        method2355(Statics.field2639[var231], 1);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 176) {
                for (int var232 = 0; var232 < Statics.field1069; var232++) {
                    class46 var233 = class46.method817(var232);
                    if (var233 != null) {
                        class154.field2648[var232] = 0;
                        class154.field2647[var232] = 0;
                    }
                }
                method2723();
                field451 += 32;
                field310 = -1;
                return true;
            }
            if (field310 == 178) {
                int var234 = field308.method2106();
                int var235 = field308.method2207();
                int var236 = field308.method2186();
                if (var236 == 65535) {
                    var236 = -1;
                }
                class152 var237 = class152.method1829(var234);
                if (var237.field2520) {
                    var237.field2625 = var236;
                    var237.field2626 = var235;
                    class45 var239 = class45.method1729(var236);
                    var237.field2582 = var239.field1032;
                    var237.field2597 = var239.field1037;
                    var237.field2563 = var239.field1038;
                    var237.field2624 = var239.field1062;
                    var237.field2560 = var239.field1040;
                    var237.field2519 = var239.field1035;
                    if (var237.field2530 > 0) {
                        var237.field2519 = var237.field2519 * 32 / var237.field2530;
                    }
                    method3375(var237);
                } else if (var236 == -1) {
                    var237.field2553 = 0;
                    field310 = -1;
                    return true;
                } else {
                    class45 var238 = class45.method1729(var236);
                    var237.field2553 = 4;
                    var237.field2607 = var236;
                    var237.field2582 = var238.field1032;
                    var237.field2597 = var238.field1037;
                    var237.field2519 = var238.field1035 * 100 / var235;
                    method3375(var237);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 84) {
                field493 = field308.method2123();
                if (field493 == 255) {
                    field493 = 0;
                }
                field494 = field308.method2123();
                if (field494 == 255) {
                    field494 = 0;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 166) {
                field283 = field308.method2100() * 30;
                field417 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 186) {
                int var240 = field308.method2207();
                class4 var241 = (class4) field426.method3092((long) var240);
                if (var241 != null) {
                    method2603(var241, true);
                }
                if (field306 != null) {
                    method3375(field306);
                    field306 = null;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 85) {
                String var242 = field308.method2073();
                Object[] var243 = new Object[var242.length() + 1];
                for (int var244 = var242.length() - 1; var244 >= 0; var244--) {
                    if (var242.charAt(var244) == 's') {
                        var243[var244 + 1] = field308.method2073();
                    } else {
                        var243[var244 + 1] = Integer.valueOf(field308.method2207());
                    }
                }
                var243[0] = Integer.valueOf(field308.method2207());
                class1 var245 = new class1();
                var245.field9 = var243;
                class32.method701(var245, 200000);
                field310 = -1;
                return true;
            }
            if (field310 == 137) {
                Statics.field740 = field308.method2090();
                Statics.field2653 = field308.method2091();
                while (field308.field1841 < field309) {
                    field310 = field308.method2123();
                    method96();
                }
                field310 = -1;
                return true;
            }
            if (field310 == 123) {
                field488 = true;
                Statics.field2646 = field308.method2123();
                Statics.field2716 = field308.method2123();
                Statics.field713 = field308.method2232();
                Statics.field1922 = field308.method2123();
                Statics.field137 = field308.method2123();
                if (Statics.field137 >= 100) {
                    Statics.field801 = Statics.field2646 * 128 + 64;
                    Statics.field2110 = Statics.field2716 * 128 + 64;
                    Statics.field594 = method36(Statics.field801, Statics.field2110, Statics.field1896) - Statics.field713;
                }
                field310 = -1;
                return true;
            }
            if (field310 == 102) {
                while (field308.field1841 < field309) {
                    int var246 = field308.method2123();
                    boolean var247 = (var246 & 0x1) == 1;
                    String var248 = field308.method2073();
                    String var249 = field308.method2073();
                    field308.method2073();
                    for (int var250 = 0; var250 < field517; var250++) {
                        class8 var251 = field518[var250];
                        if (var247) {
                            if (var249.equals(var251.field129)) {
                                var251.field129 = var248;
                                var251.field133 = var249;
                                var248 = null;
                                break;
                            }
                        } else if (var248.equals(var251.field129)) {
                            var251.field129 = var248;
                            var251.field133 = var249;
                            var248 = null;
                            break;
                        }
                    }
                    if (var248 != null && field517 < 400) {
                        class8 var252 = new class8();
                        field518[field517] = var252;
                        var252.field129 = var248;
                        var252.field133 = var249;
                        field517++;
                    }
                }
                field457 = field449;
                field310 = -1;
                return true;
            }
            if (field310 == 153) {
                field419 = field308.method2123();
                field310 = -1;
                return true;
            }
            if (field310 == 220) {
                field458 = field449;
                if (field309 == 0) {
                    field523 = null;
                    field487 = null;
                    Statics.field584 = 0;
                    Statics.field533 = null;
                    field310 = -1;
                    return true;
                }
                field487 = field308.method2073();
                long var253 = field308.method2131();
                field523 = class198.method3050(var253);
                Statics.field2888 = field308.method2066();
                int var255 = field308.method2123();
                if (var255 == 255) {
                    field310 = -1;
                    return true;
                }
                Statics.field584 = var255;
                class21[] var256 = new class21[100];
                for (int var257 = 0; var257 < Statics.field584; var257++) {
                    var256[var257] = new class21();
                    var256[var257].field570 = field308.method2073();
                    var256[var257].field569 = class200.method1827(var256[var257].field570, Statics.field270);
                    var256[var257].field575 = field308.method2232();
                    var256[var257].field572 = field308.method2066();
                    field308.method2073();
                    if (var256[var257].field570.equals(Statics.field24.field46)) {
                        Statics.field579 = var256[var257].field572;
                    }
                }
                boolean var258 = false;
                int var259 = Statics.field584;
                while (var259 > 0) {
                    boolean var260 = true;
                    var259--;
                    for (int var261 = 0; var261 < var259; var261++) {
                        if (var256[var261].field569.compareTo(var256[var261 + 1].field569) > 0) {
                            class21 var262 = var256[var261];
                            var256[var261] = var256[var261 + 1];
                            var256[var261 + 1] = var262;
                            var260 = false;
                        }
                    }
                    if (var260) {
                        break;
                    }
                }
                Statics.field533 = var256;
                field310 = -1;
                return true;
            }
            if (field310 == 59) {
                if (field425 != -1) {
                    int var263 = field425;
                    if (class152.method2621(var263)) {
                        method2355(Statics.field2639[var263], 0);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 113) {
                int var264 = field308.method2100();
                class14 var265 = (class14) class14.field199.method3092((long) var264);
                if (var265 != null) {
                    var265.method3204();
                }
                field452[++field453 - 1 & 0x1F] = var264 & 0x7FFF;
                field310 = -1;
                return true;
            }
            if (field310 == 78) {
                Statics.method2766();
                field310 = -1;
                return false;
            }
            if (field310 == 212) {
                int var266 = field308.method2207();
                int var267 = field308.method2232();
                if (var266 < -70000) {
                    var267 += 32768;
                }
                class152 var268;
                if (var266 >= 0) {
                    var268 = class152.method1829(var266);
                } else {
                    var268 = null;
                }
                if (var268 != null) {
                    for (int var269 = 0; var269 < var268.field2623.length; var269++) {
                        var268.field2623[var269] = 0;
                        var268.field2579[var269] = 0;
                    }
                }
                class14 var270 = (class14) class14.field199.method3092((long) var267);
                if (var270 != null) {
                    for (int var271 = 0; var271 < var270.field198.length; var271++) {
                        var270.field198[var271] = -1;
                        var270.field200[var271] = 0;
                    }
                }
                int var272 = field308.method2232();
                for (int var273 = 0; var273 < var272; var273++) {
                    int var274 = field308.method2090();
                    if (var274 == 255) {
                        var274 = field308.method2108();
                    }
                    int var275 = field308.method2100();
                    if (var268 != null && var273 < var268.field2623.length) {
                        var268.field2623[var273] = var275;
                        var268.field2579[var273] = var274;
                    }
                    Statics.method1916(var267, var273, var275 - 1, var274);
                }
                if (var268 != null) {
                    method3375(var268);
                }
                method2723();
                field452[++field453 - 1 & 0x1F] = var267 & 0x7FFF;
                field310 = -1;
                return true;
            }
            if (field310 == 163) {
                method2723();
                int var276 = field308.method2090();
                int var277 = field308.method2091();
                int var278 = field308.method2106();
                field404[var277] = var278;
                field402[var277] = var276;
                field288[var277] = 1;
                for (int var279 = 0; var279 < 98; var279++) {
                    if (var278 >= class140.field2125[var279]) {
                        field288[var277] = var279 + 2;
                    }
                }
                field405[++field416 - 1 & 0x1F] = var277;
                field310 = -1;
                return true;
            }
            if (field310 == 189) {
                field488 = true;
                Statics.field2812 = field308.method2123();
                Statics.field1902 = field308.method2123();
                Statics.field190 = field308.method2232();
                Statics.field260 = field308.method2123();
                Statics.field1292 = field308.method2123();
                if (Statics.field1292 >= 100) {
                    int var280 = Statics.field2812 * 128 + 64;
                    int var281 = Statics.field1902 * 128 + 64;
                    int var282 = method36(var280, var281, Statics.field1896) - Statics.field190;
                    int var283 = var280 - Statics.field801;
                    int var284 = var282 - Statics.field594;
                    int var285 = var281 - Statics.field2110;
                    int var286 = (int) Math.sqrt((double) (var283 * var283 + var285 * var285));
                    Statics.field2458 = (int) (Math.atan2((double) var284, (double) var286) * 325.949D) & 0x7FF;
                    Statics.field1900 = (int) (Math.atan2((double) var283, (double) var285) * -325.949D) & 0x7FF;
                    if (Statics.field2458 < 128) {
                        Statics.field2458 = 128;
                    }
                    if (Statics.field2458 > 383) {
                        Statics.field2458 = 383;
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 6) {
                method116(true);
                field310 = -1;
                return true;
            }
            if (field310 == 193) {
                String var287 = field308.method2073();
                long var288 = (long) field308.method2232();
                long var290 = (long) field308.method2215();
                int var292 = field308.method2123();
                long var293 = (var288 << 32) + var290;
                boolean var295 = false;
                for (int var296 = 0; var296 < 100; var296++) {
                    if (field362[var296] == var293) {
                        var295 = true;
                        break;
                    }
                }
                if (method1828(var287)) {
                    var295 = true;
                }
                if (!var295 && field345 == 0) {
                    field362[field481] = var293;
                    field481 = (field481 + 1) % 100;
                    String var297 = class192.method3280(class199.method516(class191.method2349(field308)));
                    if (var292 == 2 || var292 == 3) {
                        class10.method1313(7, class2.method2502(1) + var287, var297);
                    } else if (var292 == 1) {
                        class10.method1313(7, class2.method2502(0) + var287, var297);
                    } else {
                        class10.method1313(3, var287, var297);
                    }
                }
                field310 = -1;
                return true;
            }
            if (field310 == 103) {
                int var298 = field308.method2186();
                byte var299 = field308.method2094();
                class154.field2648[var298] = var299;
                if (class154.field2647[var298] != var299) {
                    class154.field2647[var298] = var299;
                    method140(var298);
                }
                field357[++field451 - 1 & 0x1F] = var298;
                field310 = -1;
                return true;
            }
            if (field310 == 231) {
                field478 = field308.method2123();
                field479 = field308.method2123();
                field310 = -1;
                return true;
            }
            if (field310 == 228) {
                int var300 = field308.method2106();
                Statics.field2943 = Statics.field1450.method2429(var300);
                field310 = -1;
                return true;
            }
            if (field310 == 169) {
                int var301 = field308.method2232();
                int var302 = field308.method2207();
                class152 var303 = class152.method1829(var302);
                if (var303.field2553 != 1 || var303.field2607 != var301) {
                    var303.field2553 = 1;
                    var303.field2607 = var301;
                    method3375(var303);
                }
                field310 = -1;
                return true;
            }
            if (field310 == 111) {
                Statics.field740 = field308.method2089();
                Statics.field2653 = field308.method2089();
                field310 = -1;
                return true;
            }
            class135.method1996("" + field310 + class2.field17 + field460 + class2.field17 + field495 + class2.field17 + field309, (Throwable) null);
            Statics.method2766();
        } catch (IOException var313) {
            method45();
        } catch (Exception var314) {
            String var306 = "" + field310 + class2.field17 + field460 + class2.field17 + field495 + class2.field17 + field309 + class2.field17 + (Statics.field1075 + Statics.field24.field796[0]) + class2.field17 + (Statics.field1673 + Statics.field24.field745[0]) + class2.field17;
            for (int var307 = 0; var307 < field309 && var307 < 50; var307++) {
                var306 = var306 + field308.field1840[var307] + class2.field17;
            }
            class135.method1996(var306, var314);
            Statics.method2766();
        }
        return true;
    }

    @ObfuscatedName("f.bu(B)V")
    public static final void method96() {
        if (field310 == 201) {
            int var0 = field308.method2123();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2653;
            int var2 = (var0 & 0x7) + Statics.field740;
            int var3 = var1 + field308.method2066();
            int var4 = var2 + field308.method2066();
            int var5 = field308.method2068();
            int var6 = field308.method2232();
            int var7 = field308.method2123() * 4;
            int var8 = field308.method2123() * 4;
            int var9 = field308.method2232();
            int var10 = field308.method2232();
            int var11 = field308.method2123();
            int var12 = field308.method2123();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field1896, var13, var14, method36(var13, var14, Statics.field1896) - var7, field318 + var9, field318 + var10, var11, var12, var5, var8);
                var17.method65(var15, var16, method36(var15, var16, Statics.field1896) - var8, field318 + var9);
                field400.method3117(var17);
            }
        } else if (field310 == 150) {
            int var18 = field308.method2123();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2653;
            int var20 = (var18 & 0x7) + Statics.field740;
            int var21 = field308.method2232();
            int var22 = field308.method2232();
            int var23 = field308.method2232();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class177 var24 = field263[Statics.field1896][var19][var20];
                if (var24 != null) {
                    for (class25 var25 = (class25) var24.method3122(); var25 != null; var25 = (class25) var24.method3124()) {
                        if ((var21 & 0x7FFF) == var25.field621 && var25.field625 == var22) {
                            var25.field625 = var23;
                            break;
                        }
                    }
                    method2430(var19, var20);
                }
            }
        } else if (field310 == 138) {
            int var26 = field308.method2089();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field295[var27];
            int var30 = field308.method2090();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2653;
            int var32 = (var30 & 0x7) + Statics.field740;
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                method13(Statics.field1896, var31, var32, var29, -1, var27, var28, 0, -1);
            }
        } else if (field310 == 95) {
            int var33 = field308.method2123();
            int var34 = (var33 >> 4 & 0x7) + Statics.field2653;
            int var35 = (var33 & 0x7) + Statics.field740;
            int var36 = field308.method2232();
            int var37 = field308.method2123();
            int var38 = field308.method2232();
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                int var39 = var34 * 128 + 64;
                int var40 = var35 * 128 + 64;
                class26 var41 = new class26(var36, Statics.field1896, var39, var40, method36(var39, var40, Statics.field1896) - var37, var38, field318);
                field401.method3117(var41);
            }
        } else if (field310 == 29) {
            int var42 = field308.method2091();
            int var43 = (var42 >> 4 & 0x7) + Statics.field2653;
            int var44 = (var42 & 0x7) + Statics.field740;
            int var45 = field308.method2232();
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                class177 var46 = field263[Statics.field1896][var43][var44];
                if (var46 != null) {
                    for (class25 var47 = (class25) var46.method3122(); var47 != null; var47 = (class25) var46.method3124()) {
                        if ((var45 & 0x7FFF) == var47.field621) {
                            var47.method3204();
                            break;
                        }
                    }
                    if (var46.method3122() == null) {
                        field263[Statics.field1896][var43][var44] = null;
                    }
                    method2430(var43, var44);
                }
            }
        } else if (field310 == 211) {
            int var48 = field308.method2091();
            int var49 = (var48 >> 4 & 0x7) + Statics.field2653;
            int var50 = (var48 & 0x7) + Statics.field740;
            int var51 = field308.method2123();
            int var52 = var51 >> 2;
            int var53 = var51 & 0x3;
            int var54 = field295[var52];
            int var55 = field308.method2186();
            if (var49 >= 0 && var50 >= 0 && var49 < 103 && var50 < 103) {
                if (var54 == 0) {
                    class80 var56 = Statics.field2098.method1711(Statics.field1896, var49, var50);
                    if (var56 != null) {
                        int var57 = var56.field1426 >> 14 & 0x7FFF;
                        if (var52 == 2) {
                            var56.field1423 = new class11(var57, 2, var53 + 4, Statics.field1896, var49, var50, var55, false, var56.field1423);
                            var56.field1425 = new class11(var57, 2, var53 + 1 & 0x3, Statics.field1896, var49, var50, var55, false, var56.field1425);
                        } else {
                            var56.field1423 = new class11(var57, var52, var53, Statics.field1896, var49, var50, var55, false, var56.field1423);
                        }
                    }
                }
                if (var54 == 1) {
                    class87 var58 = Statics.field2098.method1662(Statics.field1896, var49, var50);
                    if (var58 != null) {
                        int var59 = var58.field1504 >> 14 & 0x7FFF;
                        if (var52 == 4 || var52 == 5) {
                            var58.field1505 = new class11(var59, 4, var53, Statics.field1896, var49, var50, var55, false, var58.field1505);
                        } else if (var52 == 6) {
                            var58.field1505 = new class11(var59, 4, var53 + 4, Statics.field1896, var49, var50, var55, false, var58.field1505);
                        } else if (var52 == 7) {
                            var58.field1505 = new class11(var59, 4, (var53 + 2 & 0x3) + 4, Statics.field1896, var49, var50, var55, false, var58.field1505);
                        } else if (var52 == 8) {
                            var58.field1505 = new class11(var59, 4, var53 + 4, Statics.field1896, var49, var50, var55, false, var58.field1505);
                            var58.field1512 = new class11(var59, 4, (var53 + 2 & 0x3) + 4, Statics.field1896, var49, var50, var55, false, var58.field1512);
                        }
                    }
                }
                if (var54 == 2) {
                    class91 var60 = Statics.field2098.method1594(Statics.field1896, var49, var50);
                    if (var52 == 11) {
                        var52 = 10;
                    }
                    if (var60 != null) {
                        var60.field1559 = new class11(var60.field1562 >> 14 & 0x7FFF, var52, var53, Statics.field1896, var49, var50, var55, false, var60.field1559);
                    }
                }
                if (var54 == 3) {
                    class86 var61 = Statics.field2098.method1595(Statics.field1896, var49, var50);
                    if (var61 != null) {
                        var61.field1490 = new class11(var61.field1491 >> 14 & 0x7FFF, 22, var53, Statics.field1896, var49, var50, var55, false, var61.field1490);
                    }
                }
            }
        } else {
            if (field310 == 49) {
                int var62 = field308.method2123();
                int var63 = (var62 >> 4 & 0x7) + Statics.field2653;
                int var64 = (var62 & 0x7) + Statics.field740;
                int var65 = field308.method2232();
                int var66 = field308.method2123();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = field308.method2123();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (Statics.field24.field796[0] >= var63 - var70 && Statics.field24.field796[0] <= var63 + var70 && Statics.field24.field745[0] >= var64 - var70 && Statics.field24.field745[0] <= var64 + var70 && field500 != 0 && var68 > 0 && field377 < 50) {
                        field502[field377] = var65;
                        field391[field377] = var68;
                        field504[field377] = var69;
                        field506[field377] = null;
                        field505[field377] = (var63 << 16) + (var64 << 8) + var67;
                        field377++;
                    }
                }
            }
            if (field310 == 30) {
                int var71 = field308.method2100();
                byte var72 = field308.method2199();
                int var73 = field308.method2090();
                int var74 = (var73 >> 4 & 0x7) + Statics.field2653;
                int var75 = (var73 & 0x7) + Statics.field740;
                int var76 = field308.method2100();
                int var77 = field308.method2099();
                int var78 = field308.method2186();
                int var79 = field308.method2123();
                int var80 = var79 >> 2;
                int var81 = var79 & 0x3;
                int var82 = field295[var80];
                byte var83 = field308.method2094();
                byte var84 = field308.method2066();
                byte var85 = field308.method2092();
                class3 var86;
                if (field389 == var76) {
                    var86 = Statics.field24;
                } else {
                    var86 = field445[var76];
                }
                if (var86 != null) {
                    class36 var87 = class36.method809(var77);
                    int var88;
                    int var89;
                    if (var81 == 1 || var81 == 3) {
                        var88 = var87.field861;
                        var89 = var87.field896;
                    } else {
                        var88 = var87.field896;
                        var89 = var87.field861;
                    }
                    int var90 = (var88 >> 1) + var74;
                    int var91 = (var88 + 1 >> 1) + var74;
                    int var92 = (var89 >> 1) + var75;
                    int var93 = (var89 + 1 >> 1) + var75;
                    int[][] var94 = class6.field93[Statics.field1896];
                    int var95 = var94[var90][var92] + var94[var91][var92] + var94[var90][var93] + var94[var91][var93] >> 2;
                    int var96 = (var74 << 7) + (var88 << 6);
                    int var97 = (var75 << 7) + (var89 << 6);
                    class98 var98 = var87.method634(var80, var81, var94, var96, var95, var97);
                    if (var98 != null) {
                        method13(Statics.field1896, var74, var75, var82, -1, 0, 0, var78 + 1, var71 + 1);
                        var86.field35 = field318 + var78;
                        var86.field34 = field318 + var71;
                        var86.field40 = var98;
                        var86.field37 = var74 * 128 + var88 * 64;
                        var86.field39 = var75 * 128 + var89 * 64;
                        var86.field38 = var95;
                        if (var72 > var85) {
                            byte var99 = var72;
                            var72 = var85;
                            var85 = var99;
                        }
                        if (var83 > var84) {
                            byte var100 = var83;
                            var83 = var84;
                            var84 = var100;
                        }
                        var86.field47 = var72 + var74;
                        var86.field36 = var74 + var85;
                        var86.field42 = var75 + var83;
                        var86.field44 = var75 + var84;
                    }
                }
            }
            if (field310 == 96) {
                int var101 = field308.method2123();
                int var102 = (var101 >> 4 & 0x7) + Statics.field2653;
                int var103 = (var101 & 0x7) + Statics.field740;
                int var104 = field308.method2100();
                int var105 = field308.method2123();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field295[var106];
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    method13(Statics.field1896, var102, var103, var108, var104, var106, var107, 0, -1);
                }
            } else if (field310 == 44) {
                int var109 = field308.method2232();
                int var110 = field308.method2089();
                int var111 = (var110 >> 4 & 0x7) + Statics.field2653;
                int var112 = (var110 & 0x7) + Statics.field740;
                int var113 = field308.method2100();
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class25 var114 = new class25();
                    var114.field621 = var113;
                    var114.field625 = var109;
                    if (field263[Statics.field1896][var111][var112] == null) {
                        field263[Statics.field1896][var111][var112] = new class177();
                    }
                    field263[Statics.field1896][var111][var112].method3117(var114);
                    method2430(var111, var112);
                }
            }
        }
    }

    @ObfuscatedName("o.bh(IIIIIIIIIB)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field399.method3122(); var10 != null; var10 = (class15) field399.method3124()) {
            if (var10.field214 == arg0 && var10.field225 == arg1 && var10.field208 == arg2 && var10.field206 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field214 = arg0;
            var9.field206 = arg3;
            var9.field225 = arg1;
            var9.field208 = arg2;
            method2253(var9);
            field399.method3117(var9);
        }
        var9.field212 = arg4;
        var9.field219 = arg5;
        var9.field213 = arg6;
        var9.field215 = arg7;
        var9.field216 = arg8;
    }

    @ObfuscatedName("dl.bc(Li;I)V")
    public static final void method2253(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field206 == 0) {
            var1 = Statics.field2098.method1596(arg0.field214, arg0.field225, arg0.field208);
        }
        if (arg0.field206 == 1) {
            var1 = Statics.field2098.method1597(arg0.field214, arg0.field225, arg0.field208);
        }
        if (arg0.field206 == 2) {
            var1 = Statics.field2098.method1722(arg0.field214, arg0.field225, arg0.field208);
        }
        if (arg0.field206 == 3) {
            var1 = Statics.field2098.method1580(arg0.field214, arg0.field225, arg0.field208);
        }
        if (var1 != 0) {
            int var5 = Statics.field2098.method1600(arg0.field214, arg0.field225, arg0.field208, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field209 = var2;
        arg0.field211 = var3;
        arg0.field224 = var4;
    }

    @ObfuscatedName("cu.bn(B)V")
    public static final void method1734() {
        for (class15 var0 = (class15) field399.method3122(); var0 != null; var0 = (class15) field399.method3124()) {
            if (var0.field216 > 0) {
                var0.field216--;
            }
            if (var0.field216 == 0) {
                if (var0.field209 >= 0) {
                    int var1 = var0.field209;
                    int var2 = var0.field211;
                    class36 var3 = class36.method809(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method638(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method71(var0.field214, var0.field206, var0.field225, var0.field208, var0.field209, var0.field224, var0.field211);
                var0.method3204();
            } else {
                if (var0.field215 > 0) {
                    var0.field215--;
                }
                if (var0.field215 == 0 && var0.field225 >= 1 && var0.field208 >= 1 && var0.field225 <= 102 && var0.field208 <= 102) {
                    if (var0.field212 >= 0) {
                        int var5 = var0.field212;
                        int var6 = var0.field219;
                        class36 var7 = class36.method809(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method638(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method71(var0.field214, var0.field206, var0.field225, var0.field208, var0.field212, var0.field213, var0.field219);
                    var0.field215 = -1;
                    if (var0.field212 == var0.field209 && var0.field209 == -1) {
                        var0.method3204();
                    } else if (var0.field212 == var0.field209 && var0.field224 == var0.field213 && var0.field219 == var0.field211) {
                        var0.method3204();
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.by(IIIIIIIS)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field471 && Statics.field1896 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2098.method1596(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2098.method1597(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2098.method1722(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2098.method1580(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2098.method1600(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2098.method1701(arg0, arg2, arg3);
                class36 var15 = class36.method809(var12);
                if (var15.field862 != 0) {
                    field324[arg0].method3383(arg2, arg3, var13, var14, var15.field857);
                }
            }
            if (arg1 == 1) {
                Statics.field2098.method1663(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2098.method1589(arg0, arg2, arg3);
                class36 var16 = class36.method809(var12);
                if (var16.field896 + arg2 > 103 || var16.field896 + arg3 > 103 || var16.field861 + arg2 > 103 || var16.field861 + arg3 > 103) {
                    return;
                }
                if (var16.field862 != 0) {
                    field324[arg0].method3397(arg2, arg3, var16.field896, var16.field861, var14, var16.field857);
                }
            }
            if (arg1 == 3) {
                Statics.field2098.method1590(arg0, arg2, arg3);
                class36 var17 = class36.method809(var12);
                if (var17.field862 == 1) {
                    field324[arg0].method3386(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field78[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field2098;
        class197 var20 = field324[arg0];
        class36 var21 = class36.method809(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field861;
            var23 = var21.field896;
        } else {
            var22 = var21.field896;
            var23 = var21.field861;
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
        int[][] var28 = class6.field93[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field884 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field885 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field868 == -1 && var21.field886 == null) {
                var34 = var21.method634(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field862 == 1) {
                var20.method3400(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field868 == -1 && var21.field886 == null) {
                var57 = var21.method634(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1699(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field862 != 0) {
                var20.method3379(arg2, arg3, var22, var23, var21.field857);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field868 == -1 && var21.field886 == null) {
                var35 = var21.method634(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1699(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3379(arg2, arg3, var22, var23, var21.field857);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field868 == -1 && var21.field886 == null) {
                var36 = var21.method634(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1578(arg0, arg2, arg3, var29, var36, (class78) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3378(arg2, arg3, arg6, arg5, var21.field857);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field868 == -1 && var21.field886 == null) {
                var37 = var21.method634(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1578(arg0, arg2, arg3, var29, var37, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3378(arg2, arg3, arg6, arg5, var21.field857);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field868 == -1 && var21.field886 == null) {
                var39 = var21.method634(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method634(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1578(arg0, arg2, arg3, var29, var39, var40, class6.field85[arg5], class6.field85[var38], var32, var33);
            if (var21.field862 != 0) {
                var20.method3378(arg2, arg3, arg6, arg5, var21.field857);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field868 == -1 && var21.field886 == null) {
                var41 = var21.method634(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1578(arg0, arg2, arg3, var29, var41, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3378(arg2, arg3, arg6, arg5, var21.field857);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field868 == -1 && var21.field886 == null) {
                var42 = var21.method634(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1699(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3379(arg2, arg3, var22, var23, var21.field857);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field868 == -1 && var21.field886 == null) {
                var43 = var21.method634(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1579(arg0, arg2, arg3, var29, var43, (class78) null, class6.field85[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1596(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method809(var45 >> 14 & 0x7FFF).field869;
            }
            class78 var46;
            if (var21.field868 == -1 && var21.field886 == null) {
                var46 = var21.method634(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1579(arg0, arg2, arg3, var29, var46, (class78) null, class6.field85[arg5], 0, class6.field91[arg5] * var44, class6.field86[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1596(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method809(var48 >> 14 & 0x7FFF).field869 / 2;
            }
            class78 var49;
            if (var21.field868 == -1 && var21.field886 == null) {
                var49 = var21.method634(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1579(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field87[arg5] * var47, class6.field88[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field868 == -1 && var21.field886 == null) {
                var51 = var21.method634(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1579(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1596(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method809(var53 >> 14 & 0x7FFF).field869 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field868 == -1 && var21.field886 == null) {
                var55 = var21.method634(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method634(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field868, true, (class78) null);
            }
            var19.method1579(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field87[arg5] * var52, class6.field88[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dk.be(IIS)V")
    public static final void method2430(int arg0, int arg1) {
        class177 var2 = field263[Statics.field1896][arg0][arg1];
        if (var2 == null) {
            Statics.field2098.method1591(Statics.field1896, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3122(); var6 != null; var6 = (class25) var2.method3124()) {
            class45 var7 = class45.method1729(var6.field621);
            long var8 = (long) var7.field1042;
            if (var7.field1043 == 1) {
                var8 = (long) (var6.field625 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2098.method1591(Statics.field1896, arg0, arg1);
            return;
        }
        var2.method3129(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3122(); var12 != null; var12 = (class25) var2.method3124()) {
            if (var5.field621 != var12.field621) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field621 != var12.field621 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2098.method1577(Statics.field1896, arg0, arg1, method36(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1896), var5, var13, var10, var11);
    }

    @ObfuscatedName("x.bd(I)V")
    public static final void method114() {
        field308.method2300();
        int var0 = field308.method2301(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field308.method2301(2);
        if (var1 == 0) {
            field462[++field279 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field308.method2301(3);
            Statics.field24.method587(var2, false);
            int var3 = field308.method2301(1);
            if (var3 == 1) {
                field462[++field279 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field308.method2301(3);
            Statics.field24.method587(var4, true);
            int var5 = field308.method2301(3);
            Statics.field24.method587(var5, true);
            int var6 = field308.method2301(1);
            if (var6 == 1) {
                field462[++field279 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field308.method2301(1);
            Statics.field1896 = field308.method2301(2);
            int var8 = field308.method2301(1);
            if (var8 == 1) {
                field462[++field279 - 1] = 2047;
            }
            int var9 = field308.method2301(7);
            int var10 = field308.method2301(7);
            Statics.field24.method586(var9, var10, var7 == 1);
        }
    }

    @ObfuscatedName("dt.bk(B)V")
    public static final void method2500() {
        int var0 = field308.method2301(8);
        if (var0 < field289) {
            for (int var1 = var0; var1 < field289; var1++) {
                field392[++field443 - 1] = field385[var1];
            }
        }
        if (var0 > field289) {
            throw new RuntimeException("");
        }
        field289 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field385[var2];
            class3 var4 = field445[var3];
            int var5 = field308.method2301(1);
            if (var5 == 0) {
                field385[++field289 - 1] = var3;
                var4.field790 = field318;
            } else {
                int var6 = field308.method2301(2);
                if (var6 == 0) {
                    field385[++field289 - 1] = var3;
                    var4.field790 = field318;
                    field462[++field279 - 1] = var3;
                } else if (var6 == 1) {
                    field385[++field289 - 1] = var3;
                    var4.field790 = field318;
                    int var7 = field308.method2301(3);
                    var4.method587(var7, false);
                    int var8 = field308.method2301(1);
                    if (var8 == 1) {
                        field462[++field279 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field385[++field289 - 1] = var3;
                    var4.field790 = field318;
                    int var9 = field308.method2301(3);
                    var4.method587(var9, true);
                    int var10 = field308.method2301(3);
                    var4.method587(var10, true);
                    int var11 = field308.method2301(1);
                    if (var11 == 1) {
                        field462[++field279 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field392[++field443 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("o.bb(B)V")
    public static final void method14() {
        for (int var0 = 0; var0 < field279; var0++) {
            int var1 = field462[var0];
            class3 var2 = field445[var1];
            int var3 = field308.method2123();
            if ((var3 & 0x20) != 0) {
                var3 += field308.method2123() << 8;
            }
            method2454(var1, var2, var3);
        }
    }

    @ObfuscatedName("do.bq(ILy;II)V")
    public static final void method2454(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x10) != 0) {
            arg1.field783 = field308.method2186();
            arg1.field798 = field308.method2099();
        }
        if ((arg2 & 0x4) != 0) {
            int var3 = field308.method2123();
            byte[] var4 = new byte[var3];
            class107 var5 = new class107(var4);
            field308.method2076(var4, 0, var3);
            field388[arg0] = var5;
            arg1.method24(var5);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field764 = field308.method2073();
            if (arg1.field764.charAt(0) == '~') {
                arg1.field764 = arg1.field764.substring(1);
                class10.method1313(2, arg1.field46, arg1.field764);
            } else if (Statics.field24 == arg1) {
                class10.method1313(2, arg1.field46, arg1.field764);
            }
            arg1.field757 = false;
            arg1.field755 = 0;
            arg1.field749 = 0;
            arg1.field780 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field763 = field308.method2232();
            int var6 = field308.method2108();
            arg1.field782 = var6 >> 16;
            arg1.field781 = (var6 & 0xFFFF) + field318;
            arg1.field779 = 0;
            arg1.field759 = 0;
            if (arg1.field781 > field318) {
                arg1.field779 = -1;
            }
            if (arg1.field763 == 65535) {
                arg1.field763 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field767 = field308.method2186();
            if (arg1.field767 == 65535) {
                arg1.field767 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var7 = field308.method2099();
            int var8 = field308.method2090();
            arg1.method594(var7, var8, field318);
            arg1.field793 = field318 + 300;
            arg1.field765 = field308.method2091();
            arg1.field766 = field308.method2089();
        }
        if ((arg2 & 0x200) != 0) {
            int var9 = field308.method2232();
            int var10 = field308.method2089();
            arg1.method594(var9, var10, field318);
            arg1.field793 = field318 + 300;
            arg1.field765 = field308.method2123();
            arg1.field766 = field308.method2123();
        }
        if ((arg2 & 0x8) != 0) {
            int var11 = field308.method2186();
            int var12 = field308.method2090();
            boolean var13 = field308.method2090() == 1;
            int var14 = field308.method2091();
            int var15 = field308.field1841;
            if (arg1.field46 != null && arg1.field33 != null) {
                boolean var16 = false;
                if (var12 <= 1 && method1828(arg1.field46)) {
                    var16 = true;
                }
                if (!var16 && field345 == 0 && !arg1.field41) {
                    field429.field1841 = 0;
                    field308.method2076(field429.field1840, 0, var14);
                    field429.field1841 = 0;
                    String var17 = class192.method3280(class199.method516(class191.method2349(field429)));
                    arg1.field764 = var17.trim();
                    arg1.field755 = var11 >> 8;
                    arg1.field749 = var11 & 0xFF;
                    arg1.field780 = 150;
                    arg1.field757 = var13;
                    if (var12 == 2 || var12 == 3) {
                        class10.method1313(var13 ? 91 : 1, class2.method2502(1) + arg1.field46, var17);
                    } else if (var12 == 1) {
                        class10.method1313(var13 ? 91 : 1, class2.method2502(0) + arg1.field46, var17);
                    } else {
                        class10.method1313(var13 ? 90 : 2, arg1.field46, var17);
                    }
                }
            }
            field308.field1841 = var14 + var15;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field785 = field308.method2123();
            arg1.field802 = field308.method2089();
            arg1.field784 = field308.method2090();
            arg1.field786 = field308.method2089();
            arg1.field787 = field308.method2232() + field318;
            arg1.field788 = field308.method2232() + field318;
            arg1.field789 = field308.method2089();
            arg1.field795 = 1;
            arg1.field800 = 0;
        }
        if ((arg2 & 0x1) == 0) {
            return;
        }
        int var18 = field308.method2099();
        if (var18 == 65535) {
            var18 = -1;
        }
        int var19 = field308.method2089();
        Statics.method502(arg1, var18, var19);
    }

    @ObfuscatedName("f.bx(B)V")
    public static final void method89() {
        field308.method2300();
        int var0 = field308.method2301(8);
        if (var0 < field303) {
            for (int var1 = var0; var1 < field303; var1++) {
                field392[++field443 - 1] = field304[var1];
            }
        }
        if (var0 > field303) {
            throw new RuntimeException("");
        }
        field303 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field304[var2];
            class30 var4 = field302[var3];
            int var5 = field308.method2301(1);
            if (var5 == 0) {
                field304[++field303 - 1] = var3;
                var4.field790 = field318;
            } else {
                int var6 = field308.method2301(2);
                if (var6 == 0) {
                    field304[++field303 - 1] = var3;
                    var4.field790 = field318;
                    field462[++field279 - 1] = var3;
                } else if (var6 == 1) {
                    field304[++field303 - 1] = var3;
                    var4.field790 = field318;
                    int var7 = field308.method2301(3);
                    var4.method587(var7, false);
                    int var8 = field308.method2301(1);
                    if (var8 == 1) {
                        field462[++field279 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field304[++field303 - 1] = var3;
                    var4.field790 = field318;
                    int var9 = field308.method2301(3);
                    var4.method587(var9, true);
                    int var10 = field308.method2301(3);
                    var4.method587(var10, true);
                    int var11 = field308.method2301(1);
                    if (var11 == 1) {
                        field462[++field279 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field392[++field443 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("n.bf(I)V")
    public static final void method151() {
        int var0 = Statics.field705;
        int var1 = Statics.field2903;
        int var2 = Statics.field1286;
        int var3 = Statics.field126;
        int var4 = 6116423;
        class73.method1475(var0, var1, var2, var3, var4);
        class73.method1475(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1485(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field48.method3239(class142.field2315, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2003;
        int var6 = class127.field2004;
        for (int var7 = 0; var7 < field320; var7++) {
            int var8 = (field320 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field48.method3239(method1735(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field705;
        int var11 = Statics.field2903;
        int var12 = Statics.field1286;
        int var13 = Statics.field126;
        for (int var14 = 0; var14 < field467; var14++) {
            if (field474[var14] + field472[var14] > var10 && field472[var14] < var10 + var12 && field475[var14] + field473[var14] > var11 && field473[var14] < var11 + var13) {
                field470[var14] = true;
            }
        }
    }

    @ObfuscatedName("aw.bj(IIIII)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field467; var4++) {
            if (field474[var4] + field472[var4] > arg0 && field472[var4] < arg0 + arg2 && field475[var4] + field473[var4] > arg1 && field473[var4] < arg1 + arg3) {
                field469[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.ba(S)V")
    public static final void method130() {
        method127();
        if (Statics.field531 != null || field437 != null) {
            return;
        }
        int var12;
        int var13;
        label203: {
            int var0 = class127.field2009;
            if (field406) {
                if (var0 != 1 && (Statics.field1666 || var0 != 4)) {
                    int var1 = class127.field2003;
                    int var2 = class127.field2004;
                    if (var1 < Statics.field705 - 10 || var1 > Statics.field705 + Statics.field1286 + 10 || var2 < Statics.field2903 - 10 || var2 > Statics.field2903 + Statics.field126 + 10) {
                        field406 = false;
                        method821(Statics.field705, Statics.field2903, Statics.field1286, Statics.field126);
                    }
                }
                if (var0 == 1 || !Statics.field1666 && var0 == 4) {
                    int var3 = Statics.field705;
                    int var4 = Statics.field2903;
                    int var5 = Statics.field1286;
                    int var6 = class127.field2010;
                    int var7 = class127.field2011;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field320; var9++) {
                        int var10 = (field320 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method530(var8);
                    }
                    field406 = false;
                    method821(Statics.field705, Statics.field2903, Statics.field1286, Statics.field126);
                }
            } else {
                if ((var0 == 1 || !Statics.field1666 && var0 == 4) && field320 > 0) {
                    int var11 = field410[field320 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field408[field320 - 1];
                        var13 = field422[field320 - 1];
                        class152 var14 = class152.method1829(var13);
                        int var15 = Statics.method488(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label203;
                        }
                        int var17 = Statics.method488(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label203;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field1666 && var0 == 4) && (field511 == 1 && field320 > 2 || method7(field320 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field1666 && var0 == 4) && field320 > 0) {
                    method530(field320 - 1);
                }
                if (var0 == 2 && field320 > 0) {
                    method124(class127.field2010, class127.field2011);
                }
            }
            return;
        }
        if (Statics.field531 != null && !field380 && field511 != 1 && !method7(field320 - 1) && field320 > 0) {
            int var19 = field497;
            int var20 = field281;
            class27 var21 = Statics.field539;
            method570(var21.field654, var21.field647, var21.field648, var21.field649, var21.field650, var21.field650, var19, var20);
            Statics.field539 = null;
        }
        field380 = false;
        field314 = 0;
        if (Statics.field531 != null) {
            method3375(Statics.field531);
        }
        Statics.field531 = class152.method1829(var13);
        field376 = var12;
        field497 = class127.field2010;
        field281 = class127.field2011;
        if (field320 > 0) {
            int var22 = field320 - 1;
            Statics.field539 = new class27();
            Statics.field539.field654 = field408[var22];
            Statics.field539.field647 = field422[var22];
            Statics.field539.field648 = field410[var22];
            Statics.field539.field649 = field411[var22];
            Statics.field539.field650 = field384[var22];
        }
        method3375(Statics.field531);
    }

    @ObfuscatedName("h.bg(III)V")
    public static final void method124(int arg0, int arg1) {
        int var2 = Statics.field48.method3234(class142.field2315);
        for (int var3 = 0; var3 < field320; var3++) {
            int var4 = Statics.field48.method3234(method1735(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field320 * 15 + 21;
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
        field406 = true;
        Statics.field705 = var6;
        Statics.field2903 = var7;
        Statics.field1286 = var2;
        Statics.field126 = field320 * 15 + 22;
    }

    @ObfuscatedName("o.bs(II)Z")
    public static final boolean method7(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field410[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ay.bi(IB)V")
    public static final void method530(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field408[arg0];
        int var2 = field422[arg0];
        int var3 = field410[arg0];
        int var4 = field411[arg0];
        String var5 = field384[arg0];
        String var6 = field413[arg0];
        method570(var1, var2, var3, var4, var5, var6, class127.field2010, class127.field2011);
    }

    @ObfuscatedName("ae.bv(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 45) {
            class3 var8 = field445[arg3];
            if (var8 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(223);
                field386.method2088(class124.field1970[82] ? 1 : 0);
                field386.method2052(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var9 = field445[arg3];
            if (var9 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(67);
                field386.method2052(arg3);
                field386.method2051(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(219);
            field386.method2052(Statics.field1075 + arg0);
            field386.method2192(class124.field1970[82] ? 1 : 0);
            field386.method2097(arg3);
            field386.method2097(Statics.field1673 + arg1);
        }
        if (arg2 == 2) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(211);
            field386.method2097(arg3 >> 14 & 0x7FFF);
            field386.method2103(Statics.field2528);
            field386.method2095(Statics.field1075 + arg0);
            field386.method2088(class124.field1970[82] ? 1 : 0);
            field386.method2052(field421);
            field386.method2095(Statics.field1673 + arg1);
        }
        if (arg2 == 46) {
            class3 var10 = field445[arg3];
            if (var10 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(180);
                field386.method2088(class124.field1970[82] ? 1 : 0);
                field386.method2212(arg3);
            }
        }
        if (arg2 == 5) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(50);
            field386.method2088(class124.field1970[82] ? 1 : 0);
            field386.method2212(Statics.field1075 + arg0);
            field386.method2095(arg3 >> 14 & 0x7FFF);
            field386.method2212(Statics.field1673 + arg1);
        }
        if (arg2 == 9) {
            class30 var11 = field302[arg3];
            if (var11 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(172);
                field386.method2095(arg3);
                field386.method2220(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class30 var12 = field302[arg3];
            if (var12 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(205);
                field386.method2220(class124.field1970[82] ? 1 : 0);
                field386.method2212(arg3);
            }
        }
        if (arg2 == 29) {
            field386.method2319(208);
            field386.method2054(arg1);
            class152 var13 = class152.method1829(arg1);
            if (var13.field2614 != null && var13.field2614[0][0] == 5) {
                int var14 = var13.field2614[0][1];
                if (class154.field2647[var14] != var13.field2588[0]) {
                    class154.field2647[var14] = var13.field2588[0];
                    method140(var14);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var15 = class152.method1320(arg1, arg0);
            if (var15 != null) {
                Statics.method1910(arg3, arg1, arg0, var15.field2625, arg5);
            }
        }
        if (arg2 == 12) {
            class30 var16 = field302[arg3];
            if (var16 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(203);
                field386.method2192(class124.field1970[82] ? 1 : 0);
                field386.method2212(arg3);
            }
        }
        if (arg2 == 39) {
            field386.method2319(231);
            field386.method2052(arg0);
            field386.method2251(arg1);
            field386.method2095(arg3);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 8) {
            class30 var17 = field302[arg3];
            if (var17 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(163);
                field386.method2051(class124.field1970[82] ? 1 : 0);
                field386.method2097(field421);
                field386.method2095(arg3);
                field386.method2251(Statics.field2528);
            }
        }
        if (arg2 == 40) {
            field386.method2319(109);
            field386.method2212(arg3);
            field386.method2054(arg1);
            field386.method2095(arg0);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 43) {
            field386.method2319(193);
            field386.method2097(arg3);
            field386.method2052(arg0);
            field386.method2221(arg1);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 44) {
            class3 var18 = field445[arg3];
            if (var18 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(212);
                field386.method2220(class124.field1970[82] ? 1 : 0);
                field386.method2097(arg3);
            }
        }
        if (arg2 == 28) {
            field386.method2319(208);
            field386.method2054(arg1);
            class152 var19 = class152.method1829(arg1);
            if (var19.field2614 != null && var19.field2614[0][0] == 5) {
                int var20 = var19.field2614[0][1];
                class154.field2647[var20] = 1 - class154.field2647[var20];
                method140(var20);
            }
        }
        if (arg2 == 23) {
            Statics.field2098.method1649(Statics.field1896, arg0, arg1);
        }
        if (arg2 == 38) {
            method1386();
            class152 var21 = class152.method1829(arg1);
            field418 = 1;
            Statics.field1101 = arg0;
            Statics.field53 = arg1;
            Statics.field1653 = arg3;
            method3375(var21);
            field276 = class2.method778(16748608) + class45.method1729(arg3).field1022 + class2.method778(16777215);
            if (field276 == null) {
                field276 = "null";
            }
            return;
        }
        if (arg2 == 30 && field306 == null) {
            method31(arg1, arg0);
            field306 = class152.method1320(arg1, arg0);
            method3375(field306);
        }
        if (arg2 == 13) {
            class30 var22 = field302[arg3];
            if (var22 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(96);
                field386.method2212(arg3);
                field386.method2088(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field386.method2319(175);
            for (class4 var23 = (class4) field426.method3096(); var23 != null; var23 = (class4) field426.method3093()) {
                if (var23.field59 == 0 || var23.field59 == 3) {
                    method2603(var23, true);
                }
            }
            if (field306 != null) {
                method3375(field306);
                field306 = null;
            }
        }
        if (arg2 == 25) {
            class152 var24 = class152.method1320(arg1, arg0);
            if (var24 != null) {
                method1386();
                method1919(arg1, arg0, class156.method2617(Statics.method488(var24)), var24.field2625);
                field418 = 0;
                field459 = method101(var24);
                if (field459 == null) {
                    field459 = "Null";
                }
                if (var24.field2520) {
                    field424 = var24.field2554 + class2.method778(16777215);
                } else {
                    field424 = class2.method778(65280) + var24.field2621 + class2.method778(16777215);
                }
            }
            return;
        }
        if (arg2 == 1002) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field386.method2319(54);
            field386.method2052(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1001) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(159);
            field386.method2095(arg3 >> 14 & 0x7FFF);
            field386.method2097(Statics.field1673 + arg1);
            field386.method2220(class124.field1970[82] ? 1 : 0);
            field386.method2212(Statics.field1075 + arg0);
        }
        if (arg2 == 11) {
            class30 var25 = field302[arg3];
            if (var25 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(250);
                field386.method2097(arg3);
                field386.method2088(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(190);
            field386.method2095(Statics.field1673 + arg1);
            field386.method2212(Statics.field1075 + arg0);
            field386.method2052(arg3);
            field386.method2051(class124.field1970[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(126);
            field386.method2095(Statics.field1075 + arg0);
            field386.method2097(arg3);
            field386.method2051(class124.field1970[82] ? 1 : 0);
            field386.method2212(Statics.field1673 + arg1);
        }
        if (arg2 == 33) {
            field386.method2319(183);
            field386.method2097(arg0);
            field386.method2054(arg1);
            field386.method2052(arg3);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 19) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(177);
            field386.method2052(Statics.field1075 + arg0);
            field386.method2097(Statics.field1673 + arg1);
            field386.method2192(class124.field1970[82] ? 1 : 0);
            field386.method2212(arg3);
        }
        if (arg2 == 6) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(182);
            field386.method2052(Statics.field1075 + arg0);
            field386.method2052(arg3 >> 14 & 0x7FFF);
            field386.method2192(class124.field1970[82] ? 1 : 0);
            field386.method2052(Statics.field1673 + arg1);
        }
        if (arg2 == 51) {
            class3 var26 = field445[arg3];
            if (var26 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(12);
                field386.method2095(arg3);
                field386.method2220(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(134);
            field386.method2052(Statics.field1075 + arg0);
            field386.method2220(class124.field1970[82] ? 1 : 0);
            field386.method2095(arg3 >> 14 & 0x7FFF);
            field386.method2212(Statics.field1673 + arg1);
        }
        if (arg2 == 16) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(140);
            field386.method2097(Statics.field1075 + arg0);
            field386.method2221(Statics.field53);
            field386.method2052(Statics.field1653);
            field386.method2052(Statics.field1101);
            field386.method2052(arg3);
            field386.method2097(Statics.field1673 + arg1);
            field386.method2088(class124.field1970[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field386.method2319(7);
            field386.method2052(arg0);
            field386.method2103(arg1);
            field386.method2097(arg3);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 42) {
            field386.method2319(170);
            field386.method2212(arg0);
            field386.method2052(arg3);
            field386.method2103(arg1);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 1005) {
            class152 var27 = class152.method1829(arg1);
            if (var27 == null || var27.field2579[arg0] < 100000) {
                field386.method2319(91);
                field386.method2095(arg3);
            } else {
                class10.method1313(27, "", var27.field2579[arg0] + " x " + class45.method1729(arg3).field1022);
            }
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 15) {
            class3 var28 = field445[arg3];
            if (var28 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(42);
                field386.method2095(arg3);
                field386.method2088(class124.field1970[82] ? 1 : 0);
                field386.method2097(field421);
                field386.method2251(Statics.field2528);
            }
        }
        if (arg2 == 14) {
            class3 var29 = field445[arg3];
            if (var29 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(135);
                field386.method2052(arg3);
                field386.method2052(Statics.field1101);
                field386.method2054(Statics.field53);
                field386.method2095(Statics.field1653);
                field386.method2051(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(40);
            field386.method2212(Statics.field1075 + arg0);
            field386.method2220(class124.field1970[82] ? 1 : 0);
            field386.method2052(Statics.field1673 + arg1);
            field386.method2095(arg3);
        }
        if (arg2 == 47) {
            class3 var30 = field445[arg3];
            if (var30 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(52);
                field386.method2097(arg3);
                field386.method2192(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(88);
            field386.method2212(Statics.field1673 + arg1);
            field386.method2212(Statics.field1075 + arg0);
            field386.method2052(arg3 >> 14 & 0x7FFF);
            field386.method2088(class124.field1970[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            class30 var31 = field302[arg3];
            if (var31 != null) {
                class35 var32 = var31.field712;
                if (var32.field838 != null) {
                    var32 = var32.method603();
                }
                if (var32 != null) {
                    field386.method2319(202);
                    field386.method2097(var32.field810);
                }
            }
        }
        if (arg2 == 37) {
            field386.method2319(82);
            field386.method2095(arg3);
            field386.method2103(arg1);
            field386.method2212(arg0);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 17) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(21);
            field386.method2192(class124.field1970[82] ? 1 : 0);
            field386.method2212(Statics.field1673 + arg1);
            field386.method2097(arg3);
            field386.method2052(Statics.field1075 + arg0);
            field386.method2212(field421);
            field386.method2054(Statics.field2528);
        }
        if (arg2 == 31) {
            field386.method2319(28);
            field386.method2052(arg0);
            field386.method2251(Statics.field53);
            field386.method2095(Statics.field1653);
            field386.method2221(arg1);
            field386.method2095(arg3);
            field386.method2212(Statics.field1101);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 50) {
            class3 var33 = field445[arg3];
            if (var33 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(192);
                field386.method2052(arg3);
                field386.method2051(class124.field1970[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field493 = arg0;
            field494 = arg1;
            field386.method2319(105);
            field386.method2095(Statics.field1101);
            field386.method2192(class124.field1970[82] ? 1 : 0);
            field386.method2095(Statics.field1075 + arg0);
            field386.method2052(arg3 >> 14 & 0x7FFF);
            field386.method2097(Statics.field1653);
            field386.method2251(Statics.field53);
            field386.method2095(Statics.field1673 + arg1);
        }
        if (arg2 == 58) {
            class152 var34 = class152.method1320(arg1, arg0);
            if (var34 != null) {
                field386.method2319(39);
                field386.method2212(field421);
                field386.method2052(field397);
                field386.method2054(arg1);
                field386.method2054(Statics.field2528);
                field386.method2095(arg0);
                field386.method2212(var34.field2625);
            }
        }
        if (arg2 == 35) {
            field386.method2319(155);
            field386.method2103(arg1);
            field386.method2052(arg3);
            field386.method2095(arg0);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 32) {
            field386.method2319(181);
            field386.method2221(arg1);
            field386.method2103(Statics.field2528);
            field386.method2052(arg0);
            field386.method2097(field421);
            field386.method2095(arg3);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 24) {
            class152 var35 = class152.method1829(arg1);
            boolean var36 = true;
            if (var35.field2525 > 0) {
                var36 = method132(var35);
            }
            if (var36) {
                field386.method2319(208);
                field386.method2054(arg1);
            }
        }
        if (arg2 == 7) {
            class30 var37 = field302[arg3];
            if (var37 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(167);
                field386.method2051(class124.field1970[82] ? 1 : 0);
                field386.method2103(Statics.field53);
                field386.method2097(arg3);
                field386.method2097(Statics.field1653);
                field386.method2097(Statics.field1101);
            }
        }
        if (arg2 == 41) {
            field386.method2319(227);
            field386.method2052(arg3);
            field386.method2054(arg1);
            field386.method2095(arg0);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 1004) {
            field359 = arg6;
            field272 = arg7;
            field373 = 2;
            field372 = 0;
            field386.method2319(91);
            field386.method2095(arg3);
        }
        if (arg2 == 34) {
            field386.method2319(103);
            field386.method2052(arg0);
            field386.method2103(arg1);
            field386.method2212(arg3);
            field440 = 0;
            Statics.field930 = class152.method1829(arg1);
            field375 = arg0;
        }
        if (arg2 == 49) {
            class3 var38 = field445[arg3];
            if (var38 != null) {
                field359 = arg6;
                field272 = arg7;
                field373 = 2;
                field372 = 0;
                field493 = arg0;
                field494 = arg1;
                field386.method2319(84);
                field386.method2052(arg3);
                field386.method2192(class124.field1970[82] ? 1 : 0);
            }
        }
        if (field418 != 0) {
            field418 = 0;
            method3375(class152.method1829(Statics.field53));
        }
        if (field420) {
            method1386();
        }
        if (Statics.field930 != null && field440 == 0) {
            method3375(Statics.field930);
        }
    }

    @ObfuscatedName("cg.bp(IIIIB)V")
    public static void method1919(int arg0, int arg1, int arg2, int arg3) {
        class152 var4 = class152.method1320(arg0, arg1);
        if (var4 != null && var4.field2599 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2599;
            class32.method701(var5, 200000);
        }
        field397 = arg3;
        field420 = true;
        Statics.field2528 = arg0;
        field421 = arg1;
        Statics.field245 = arg2;
        method3375(var4);
    }

    @ObfuscatedName("ba.bz(B)V")
    public static void method1386() {
        if (!field420) {
            return;
        }
        class152 var0 = class152.method1320(Statics.field2528, field421);
        if (var0 != null && var0.field2514 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2514;
            class32.method701(var1, 200000);
        }
        field420 = false;
        method3375(var0);
    }

    @ObfuscatedName("b.bm(IIB)V")
    public static void method31(int arg0, int arg1) {
        field386.method2319(99);
        field386.method2221(arg0);
        field386.method2097(arg1);
    }

    @ObfuscatedName("a.cw(I)V")
    public static final void method127() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field320 - 1; var1++) {
                if (field410[var1] < 1000 && field410[var1 + 1] > 1000) {
                    String var2 = field413[var1];
                    field413[var1] = field413[var1 + 1];
                    field413[var1 + 1] = var2;
                    String var3 = field384[var1];
                    field384[var1] = field384[var1 + 1];
                    field384[var1 + 1] = var3;
                    int var4 = field410[var1];
                    field410[var1] = field410[var1 + 1];
                    field410[var1 + 1] = var4;
                    int var5 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var5;
                    int var6 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var6;
                    int var7 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("y.cf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method19(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field406 || field320 >= 500) {
            return;
        }
        field384[field320] = arg0;
        field413[field320] = arg1;
        field410[field320] = arg2;
        field411[field320] = arg3;
        field408[field320] = arg4;
        field422[field320] = arg5;
        field320++;
    }

    @ObfuscatedName("dy.ce(I)V")
    public static void method2392() {
        for (int var0 = 0; var0 < field320; var0++) {
            if (method2605(field410[var0])) {
                if (var0 < field320 - 1) {
                    for (int var1 = var0; var1 < field320 - 1; var1++) {
                        field384[var1] = field384[var1 + 1];
                        field413[var1] = field413[var1 + 1];
                        field410[var1] = field410[var1 + 1];
                        field411[var1] = field411[var1 + 1];
                        field408[var1] = field408[var1 + 1];
                        field422[var1] = field422[var1 + 1];
                    }
                }
                field320--;
            }
        }
    }

    @ObfuscatedName("en.cu(II)Z")
    public static boolean method2605(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cu.cy(IB)Ljava/lang/String;")
    public static String method1735(int arg0) {
        return field413[arg0].length() > 0 ? field384[arg0] + class142.field2301 + field413[arg0] : field384[arg0];
    }

    @ObfuscatedName("au.ci(IIIII)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3) {
        if (field418 == 0 && !field420) {
            method19(class142.field2296, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1752; var5++) {
            int var6 = class98.field1753[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field2098.method1600(Statics.field1896, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method809(var10);
                    if (var11.field886 != null) {
                        var11 = var11.method637();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field418 == 1) {
                        method19(class142.field2291, field276 + " " + class2.field19 + " " + class2.method778(65535) + var11.field855, 1, var6, var7, var8);
                    } else if (!field420) {
                        String[] var12 = var11.field845;
                        if (field516) {
                            var12 = method2755(var12);
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
                                    method19(var12[var13], class2.method778(65535) + var11.field855, var14, var6, var7, var8);
                                }
                            }
                        }
                        method19(class142.field2292, class2.method778(65535) + var11.field855, 1002, var11.field852 << 14, var7, var8);
                    } else if ((Statics.field245 & 0x4) == 4) {
                        method19(field459, field424 + " " + class2.field19 + " " + class2.method778(65535) + var11.field855, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field302[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field712.field812 == 1 && (var15.field777 & 0x7F) == 64 && (var15.field744 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field303; var16++) {
                            class30 var17 = field302[field304[var16]];
                            if (var17 != null && var15 != var17 && var17.field712.field812 == 1 && var15.field777 == var17.field777 && var15.field744 == var17.field744) {
                                method998(var17.field712, field304[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field289; var18++) {
                            class3 var19 = field445[field385[var18]];
                            if (var19 != null && var15.field777 == var19.field777 && var15.field744 == var19.field744) {
                                method2480(var19, field385[var18], var7, var8);
                            }
                        }
                    }
                    method998(var15.field712, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field445[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field777 & 0x7F) == 64 && (var20.field744 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field303; var21++) {
                            class30 var22 = field302[field304[var21]];
                            if (var22 != null && var22.field712.field812 == 1 && var20.field777 == var22.field777 && var20.field744 == var22.field744) {
                                method998(var22.field712, field304[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field289; var23++) {
                            class3 var24 = field445[field385[var23]];
                            if (var24 != null && var20 != var24 && var20.field777 == var24.field777 && var20.field744 == var24.field744) {
                                method2480(var24, field385[var23], var7, var8);
                            }
                        }
                    }
                    method2480(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field263[Statics.field1896][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3128(); var26 != null; var26 = (class25) var25.method3125()) {
                            class45 var27 = class45.method1729(var26.field621);
                            if (field418 == 1) {
                                method19(class142.field2291, field276 + " " + class2.field19 + " " + class2.method778(16748608) + var27.field1022, 16, var26.field621, var7, var8);
                            } else if (!field420) {
                                String[] var28 = var27.field1044;
                                if (field516) {
                                    var28 = method2755(var28);
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
                                        method19(var28[var29], class2.method778(16748608) + var27.field1022, var30, var26.field621, var7, var8);
                                    } else if (var29 == 2) {
                                        method19(class142.field2142, class2.method778(16748608) + var27.field1022, 20, var26.field621, var7, var8);
                                    }
                                }
                                method19(class142.field2292, class2.method778(16748608) + var27.field1022, 1004, var26.field621, var7, var8);
                            } else if ((Statics.field245 & 0x1) == 1) {
                                method19(field459, field424 + " " + class2.field19 + " " + class2.method778(16748608) + var27.field1022, 17, var26.field621, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.ct(Lal;IIII)V")
    public static final void method998(class35 arg0, int arg1, int arg2, int arg3) {
        if (field320 >= 400) {
            return;
        }
        if (arg0.field838 != null) {
            arg0 = arg0.method603();
        }
        if (arg0 == null || !arg0.field839 || arg0.field826 && field383 != arg1) {
            return;
        }
        String var4 = arg0.field836;
        if (arg0.field828 != 0) {
            int var6 = arg0.field828;
            int var7 = Statics.field24.field32;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method778(16711680);
            } else if (var8 < -6) {
                var9 = class2.method778(16723968);
            } else if (var8 < -3) {
                var9 = class2.method778(16740352);
            } else if (var8 < 0) {
                var9 = class2.method778(16756736);
            } else if (var8 > 9) {
                var9 = class2.method778(65280);
            } else if (var8 > 6) {
                var9 = class2.method778(4259584);
            } else if (var8 > 3) {
                var9 = class2.method778(8453888);
            } else if (var8 > 0) {
                var9 = class2.method778(12648192);
            } else {
                var9 = class2.method778(16776960);
            }
            var4 = var4 + var9 + " " + class2.field15 + class142.field2297 + arg0.field828 + class2.field18;
        }
        if (field418 == 1) {
            method19(class142.field2291, field276 + " " + class2.field19 + " " + class2.method778(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field420) {
            String[] var10 = arg0.field808;
            if (field516) {
                var10 = method2755(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2373)) {
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
                        method19(var10[var11], class2.method778(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2373)) {
                        short var14 = 0;
                        if (field293 == class18.field530 || field293 == class18.field527 && arg0.field828 > Statics.field24.field32) {
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
                        method19(var10[var13], class2.method778(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method19(class142.field2292, class2.method778(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field245 & 0x2) == 2) {
            method19(field459, field424 + " " + class2.field19 + " " + class2.method778(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dp.cq(Ly;IIII)V")
    public static final void method2480(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field24 == arg0 || field320 >= 400) {
            return;
        }
        String var9;
        if (arg0.field43 == 0) {
            String var4 = arg0.field46;
            int var5 = arg0.field32;
            int var6 = Statics.field24.field32;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method778(16711680);
            } else if (var7 < -6) {
                var8 = class2.method778(16723968);
            } else if (var7 < -3) {
                var8 = class2.method778(16740352);
            } else if (var7 < 0) {
                var8 = class2.method778(16756736);
            } else if (var7 > 9) {
                var8 = class2.method778(65280);
            } else if (var7 > 6) {
                var8 = class2.method778(4259584);
            } else if (var7 > 3) {
                var8 = class2.method778(8453888);
            } else if (var7 > 0) {
                var8 = class2.method778(12648192);
            } else {
                var8 = class2.method778(16776960);
            }
            var9 = var4 + var8 + " " + class2.field15 + class142.field2297 + arg0.field32 + class2.field18;
        } else {
            var9 = arg0.field46 + " " + class2.field15 + class142.field2187 + arg0.field43 + class2.field18;
        }
        if (field418 == 1) {
            method19(class142.field2291, field276 + " " + class2.field19 + " " + class2.method778(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field420) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field394[var10] != null) {
                    short var11 = 0;
                    if (field394[var10].equalsIgnoreCase(class142.field2373)) {
                        if (field293 == class18.field530 || field293 == class18.field527 && arg0.field32 > Statics.field24.field32) {
                            var11 = 2000;
                        }
                        if (Statics.field24.field28 != 0 && arg0.field28 != 0) {
                            if (Statics.field24.field28 == arg0.field28) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field395[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field393[var10] + var11;
                    method19(field394[var10], class2.method778(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field245 & 0x8) == 8) {
            method19(field459, field424 + " " + class2.field19 + " " + class2.method778(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field320; var14++) {
            if (field410[var14] == 23) {
                field413[var14] = class2.method778(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("m.ca([Led;IIIIIIIIB)V")
    public static final void method527(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1484(arg2, arg3, arg4, arg5);
        class84.method1738();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2532 == arg1 || arg1 == -1412584499 && field437 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field472[field467] = var10.field2526 + arg6;
                    field473[field467] = var10.field2527 + arg7;
                    field474[field467] = var10.field2530;
                    field475[field467] = var10.field2531;
                    var11 = ++field467 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2636 = var11;
                var10.field2604 = field318;
                if (!var10.field2520 || !Statics.method150(var10)) {
                    if (var10.field2525 > 0) {
                        Statics.method2601(var10);
                    }
                    int var12 = var10.field2526 + arg6;
                    int var13 = var10.field2527 + arg7;
                    int var14 = var10.field2543;
                    if (field437 == var10) {
                        if (arg1 != -1412584499 && !var10.field2586) {
                            Statics.field77 = arg0;
                            Statics.field63 = arg6;
                            Statics.field2967 = arg7;
                            continue;
                        }
                        if (field455 && field442) {
                            int var15 = class127.field2003;
                            int var16 = class127.field2004;
                            int var17 = var15 - field439;
                            int var18 = var16 - field491;
                            if (var17 < field316) {
                                var17 = field316;
                            }
                            if (var10.field2530 + var17 > field316 + field438.field2530) {
                                var17 = field316 + field438.field2530 - var10.field2530;
                            }
                            if (var18 < field444) {
                                var18 = field444;
                            }
                            if (var10.field2531 + var18 > field444 + field438.field2531) {
                                var18 = field444 + field438.field2531 - var10.field2531;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2586) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2523 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2523 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2530 + var12;
                        int var26 = var10.field2531 + var13;
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
                        int var29 = var10.field2530 + var12;
                        int var30 = var10.field2531 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2520 || var19 < var21 && var20 < var22) {
                        if (var10.field2525 != 0) {
                            if (var10.field2525 == 1337) {
                                field407 = var12;
                                field415 = var13;
                                method499(var12, var13, var10.field2530, var10.field2531);
                                class73.method1484(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2525 == 1338) {
                                method79();
                                class73.method1484(var12, var13, Statics.field140.field1328 + var12, Statics.field140.field1324 + var13);
                                if (field419 == 2 || field419 == 5) {
                                    class73.method1481(var12 + 25, var13 + 5, 0, Statics.field697, Statics.field1763);
                                } else {
                                    int var31 = field348 + field335 & 0x7FF;
                                    int var32 = Statics.field24.field777 / 32 + 48;
                                    int var33 = 464 - Statics.field24.field744 / 32;
                                    Statics.field1867.method1410(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field337 + 256, Statics.field697, Statics.field1763);
                                    for (int var34 = 0; var34 < field489; var34++) {
                                        int var35 = field490[var34] * 4 + 2 - Statics.field24.field777 / 32;
                                        int var36 = field266[var34] * 4 + 2 - Statics.field24.field744 / 32;
                                        method115(var12, var13, var35, var36, field492[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field263[Statics.field1896][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field24.field777 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field24.field744 / 32;
                                                method115(var12, var13, var40, var41, Statics.field1352[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field303; var42++) {
                                        class30 var43 = field302[field304[var42]];
                                        if (var43 != null && var43.method22()) {
                                            class35 var44 = var43.field712;
                                            if (var44 != null && var44.field838 != null) {
                                                var44 = var44.method603();
                                            }
                                            if (var44 != null && var44.field827 && var44.field839) {
                                                int var45 = var43.field777 / 32 - Statics.field24.field777 / 32;
                                                int var46 = var43.field744 / 32 - Statics.field24.field744 / 32;
                                                method115(var12, var13, var45, var46, Statics.field1352[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field289; var47++) {
                                        class3 var48 = field445[field385[var47]];
                                        if (var48 != null && var48.method22() && !var48.field41) {
                                            int var49 = var48.field777 / 32 - Statics.field24.field777 / 32;
                                            int var50 = var48.field744 / 32 - Statics.field24.field744 / 32;
                                            boolean var51 = false;
                                            if (method673(var48.field46, true)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field584; var53++) {
                                                if (var48.field46.equals(Statics.field533[var53].field570)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field24.field28 != 0 && var48.field28 != 0 && Statics.field24.field28 == var48.field28) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method115(var12, var13, var49, var50, Statics.field1352[3]);
                                            } else if (var54) {
                                                method115(var12, var13, var49, var50, Statics.field1352[4]);
                                            } else if (var52) {
                                                method115(var12, var13, var49, var50, Statics.field1352[5]);
                                            } else {
                                                method115(var12, var13, var49, var50, Statics.field1352[2]);
                                            }
                                        }
                                    }
                                    if (field284 != 0 && field318 % 20 < 10) {
                                        if (field284 == 1 && field285 >= 0 && field285 < field302.length) {
                                            class30 var55 = field302[field285];
                                            if (var55 != null) {
                                                int var56 = var55.field777 / 32 - Statics.field24.field777 / 32;
                                                int var57 = var55.field744 / 32 - Statics.field24.field744 / 32;
                                                method1912(var12, var13, var56, var57, Statics.field588[1]);
                                            }
                                        }
                                        if (field284 == 2) {
                                            int var58 = field287 * 4 - Statics.field1075 * 4 + 2 - Statics.field24.field777 / 32;
                                            int var59 = field378 * 4 - Statics.field1673 * 4 + 2 - Statics.field24.field744 / 32;
                                            method1912(var12, var13, var58, var59, Statics.field588[1]);
                                        }
                                        if (field284 == 10 && field286 >= 0 && field286 < field445.length) {
                                            class3 var60 = field445[field286];
                                            if (var60 != null) {
                                                int var61 = var60.field777 / 32 - Statics.field24.field777 / 32;
                                                int var62 = var60.field744 / 32 - Statics.field24.field744 / 32;
                                                method1912(var12, var13, var61, var62, Statics.field588[1]);
                                            }
                                        }
                                    }
                                    if (field493 != 0) {
                                        int var63 = field493 * 4 + 2 - Statics.field24.field777 / 32;
                                        int var64 = field494 * 4 + 2 - Statics.field24.field744 / 32;
                                        method115(var12, var13, var63, var64, Statics.field588[0]);
                                    }
                                    if (!Statics.field24.field41) {
                                        class73.method1475(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field419 < 3) {
                                    Statics.field1567.method1410(var12, var13, 33, 33, 25, 25, field348, 256, Statics.field49, Statics.field722);
                                } else {
                                    class73.method1481(var12, var13, 0, Statics.field49, Statics.field722);
                                }
                                if (field398[var11]) {
                                    Statics.field140.method1544(var12, var13);
                                }
                                field470[var11] = true;
                                class73.method1484(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2523 == 0) {
                            if (!var10.field2520 && Statics.method150(var10) && Statics.field931 != var10) {
                                continue;
                            }
                            if (!var10.field2520) {
                                if (var10.field2558 > var10.field2512 - var10.field2531) {
                                    var10.field2558 = var10.field2512 - var10.field2531;
                                }
                                if (var10.field2558 < 0) {
                                    var10.field2558 = 0;
                                }
                            }
                            method527(arg0, var10.field2521, var19, var20, var21, var22, var12 - var10.field2534, var13 - var10.field2558, var11);
                            if (var10.field2629 != null) {
                                method527(var10.field2629, var10.field2521, var19, var20, var21, var22, var12 - var10.field2534, var13 - var10.field2558, var11);
                            }
                            class4 var65 = (class4) field426.method3092((long) var10.field2521);
                            if (var65 != null) {
                                int var66 = var65.field60;
                                if (class152.method2621(var66)) {
                                    Statics.field77 = null;
                                    method527(Statics.field2639[var66], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field77 != null) {
                                        method527(Statics.field77, -1412584499, var19, var20, var21, var22, Statics.field63, Statics.field2967, var11);
                                        Statics.field77 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var67 = 0; var67 < 100; var67++) {
                                        field469[var67] = true;
                                    }
                                } else {
                                    field469[var11] = true;
                                }
                            }
                            class73.method1484(arg2, arg3, arg4, arg5);
                            class84.method1738();
                        }
                        if (field398[var11] || field390 > 1) {
                            if (var10.field2523 == 0 && !var10.field2520 && var10.field2512 > var10.field2531) {
                                method83(var10.field2530 + var12, var13, var10.field2558, var10.field2531, var10.field2512);
                            }
                            if (var10.field2523 != 1) {
                                if (var10.field2523 == 2) {
                                    int var68 = 0;
                                    for (int var69 = 0; var69 < var10.field2531; var69++) {
                                        for (int var70 = 0; var70 < var10.field2530; var70++) {
                                            int var71 = (var10.field2591 + 32) * var70 + var12;
                                            int var72 = (var10.field2575 + 32) * var69 + var13;
                                            if (var68 < 20) {
                                                var71 += var10.field2576[var68];
                                                var72 += var10.field2577[var68];
                                            }
                                            if (var10.field2623[var68] > 0) {
                                                boolean var73 = false;
                                                boolean var74 = false;
                                                int var75 = var10.field2623[var68] - 1;
                                                if (var71 + 32 > arg2 && var71 < arg4 && var72 + 32 > arg3 && var72 < arg5 || Statics.field531 == var10 && field376 == var68) {
                                                    class72 var76;
                                                    if (field418 == 1 && Statics.field1101 == var68 && Statics.field53 == var10.field2521) {
                                                        var76 = class45.method62(var75, var10.field2579[var68], 2, 0, false);
                                                    } else {
                                                        var76 = class45.method62(var75, var10.field2579[var68], 1, 3153952, false);
                                                    }
                                                    if (var76 == null) {
                                                        method3375(var10);
                                                    } else if (Statics.field531 == var10 && field376 == var68) {
                                                        int var77 = class127.field2003 - field497;
                                                        int var78 = class127.field2004 - field281;
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (var78 < 5 && var78 > -5) {
                                                            var78 = 0;
                                                        }
                                                        if (field314 < 5) {
                                                            var77 = 0;
                                                            var78 = 0;
                                                        }
                                                        var76.method1420(var71 + var77, var72 + var78, 128);
                                                        if (arg1 != -1) {
                                                            class152 var79 = arg0[arg1 & 0xFFFF];
                                                            if (var72 + var78 < class73.field1315 && var79.field2558 > 0) {
                                                                int var80 = field433 * (class73.field1315 - var72 - var78) / 3;
                                                                if (var80 > field433 * 10) {
                                                                    var80 = field433 * 10;
                                                                }
                                                                if (var80 > var79.field2558) {
                                                                    var80 = var79.field2558;
                                                                }
                                                                var79.field2558 -= var80;
                                                                field281 += var80;
                                                                method3375(var79);
                                                            }
                                                            if (var72 + var78 + 32 > class73.field1314 && var79.field2558 < var79.field2512 - var79.field2531) {
                                                                int var81 = field433 * (var72 + var78 + 32 - class73.field1314) / 3;
                                                                if (var81 > field433 * 10) {
                                                                    var81 = field433 * 10;
                                                                }
                                                                if (var81 > var79.field2512 - var79.field2531 - var79.field2558) {
                                                                    var81 = var79.field2512 - var79.field2531 - var79.field2558;
                                                                }
                                                                var79.field2558 += var81;
                                                                field281 -= var81;
                                                                method3375(var79);
                                                            }
                                                        }
                                                    } else if (Statics.field930 == var10 && field375 == var68) {
                                                        var76.method1420(var71, var72, 128);
                                                    } else {
                                                        var76.method1400(var71, var72);
                                                    }
                                                }
                                            } else if (var10.field2578 != null && var68 < 20) {
                                                class72 var82 = var10.method2776(var68);
                                                if (var82 != null) {
                                                    var82.method1400(var71, var72);
                                                } else if (class152.field2581) {
                                                    method3375(var10);
                                                }
                                            }
                                            var68++;
                                        }
                                    }
                                } else if (var10.field2523 == 3) {
                                    int var83;
                                    if (method2748(var10)) {
                                        var83 = var10.field2539;
                                        if (Statics.field931 == var10 && var10.field2541 != 0) {
                                            var83 = var10.field2541;
                                        }
                                    } else {
                                        var83 = var10.field2540;
                                        if (Statics.field931 == var10 && var10.field2619 != 0) {
                                            var83 = var10.field2619;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2542) {
                                            class73.method1475(var12, var13, var10.field2530, var10.field2531, var83);
                                        } else {
                                            class73.method1485(var12, var13, var10.field2530, var10.field2531, var83);
                                        }
                                    } else if (var10.field2542) {
                                        class73.method1482(var12, var13, var10.field2530, var10.field2531, var83, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1486(var12, var13, var10.field2530, var10.field2531, var83, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2523 == 4) {
                                    class193 var84 = var10.method2779();
                                    if (var84 != null) {
                                        String var85 = var10.field2568;
                                        int var86;
                                        if (method2748(var10)) {
                                            var86 = var10.field2539;
                                            if (Statics.field931 == var10 && var10.field2541 != 0) {
                                                var86 = var10.field2541;
                                            }
                                            if (var10.field2537.length() > 0) {
                                                var85 = var10.field2537;
                                            }
                                        } else {
                                            var86 = var10.field2540;
                                            if (Statics.field931 == var10 && var10.field2619 != 0) {
                                                var86 = var10.field2619;
                                            }
                                        }
                                        if (var10.field2520 && var10.field2625 != -1) {
                                            class45 var87 = class45.method1729(var10.field2625);
                                            var85 = var87.field1022;
                                            if (var85 == null) {
                                                var85 = "null";
                                            }
                                            if ((var87.field1043 == 1 || var10.field2626 != 1) && var10.field2626 != -1) {
                                                var85 = class2.method778(16748608) + var85 + class2.field14 + " " + 'x' + method501(var10.field2626);
                                            }
                                        }
                                        if (field306 == var10) {
                                            class142 var10000 = (class142) null;
                                            var85 = class142.field2299;
                                            var86 = var10.field2540;
                                        }
                                        if (!var10.field2520) {
                                            var85 = method2393(var85, var10);
                                        }
                                        var84.method3242(var85, var12, var13, var10.field2530, var10.field2531, var86, var10.field2515 ? 0 : -1, var10.field2559, var10.field2572, var10.field2570);
                                    } else if (class152.field2581) {
                                        method3375(var10);
                                    }
                                } else if (var10.field2523 == 5) {
                                    if (var10.field2520) {
                                        class72 var89;
                                        if (var10.field2625 == -1) {
                                            var89 = var10.method2774(false);
                                        } else {
                                            var89 = class45.method62(var10.field2625, var10.field2626, var10.field2549, var10.field2548, false);
                                        }
                                        if (var89 != null) {
                                            int var90 = var89.field1307;
                                            int var91 = var89.field1308;
                                            if (var10.field2583) {
                                                class73.method1478(var12, var13, var10.field2530 + var12, var10.field2531 + var13);
                                                int var92 = (var10.field2530 + (var90 - 1)) / var90;
                                                int var93 = (var10.field2531 + (var91 - 1)) / var91;
                                                for (int var94 = 0; var94 < var92; var94++) {
                                                    for (int var95 = 0; var95 < var93; var95++) {
                                                        if (var10.field2547 != 0) {
                                                            var89.method1412(var90 / 2 + var90 * var94 + var12, var91 / 2 + var91 * var95 + var13, var10.field2547, 4096);
                                                        } else if (var14 == 0) {
                                                            var89.method1400(var90 * var94 + var12, var91 * var95 + var13);
                                                        } else {
                                                            var89.method1420(var90 * var94 + var12, var91 * var95 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1484(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var96 = var10.field2530 * 4096 / var90;
                                                if (var10.field2547 != 0) {
                                                    var89.method1412(var10.field2530 / 2 + var12, var10.field2531 / 2 + var13, var10.field2547, var96);
                                                } else if (var14 != 0) {
                                                    var89.method1437(var12, var13, var10.field2530, var10.field2531, 256 - (var14 & 0xFF));
                                                } else if (var10.field2530 == var90 && var10.field2531 == var91) {
                                                    var89.method1400(var12, var13);
                                                } else {
                                                    var89.method1402(var12, var13, var10.field2530, var10.field2531);
                                                }
                                            }
                                        } else if (class152.field2581) {
                                            method3375(var10);
                                        }
                                    } else {
                                        class72 var88 = var10.method2774(method2748(var10));
                                        if (var88 != null) {
                                            var88.method1400(var12, var13);
                                        } else if (class152.field2581) {
                                            method3375(var10);
                                        }
                                    }
                                } else if (var10.field2523 == 6) {
                                    boolean var97 = method2748(var10);
                                    int var98;
                                    if (var97) {
                                        var98 = var10.field2544;
                                    } else {
                                        var98 = var10.field2557;
                                    }
                                    class98 var99 = null;
                                    int var100 = 0;
                                    if (var10.field2625 != -1) {
                                        class45 var101 = class45.method1729(var10.field2625);
                                        if (var101 != null) {
                                            class45 var102 = var101.method845(var10.field2626);
                                            var99 = var102.method865(1);
                                            if (var99 == null) {
                                                method3375(var10);
                                            } else {
                                                var99.method1923();
                                                var100 = var99.field1353 / 2;
                                            }
                                        }
                                    } else if (var10.field2553 == 5) {
                                        if (var10.field2607 == 0) {
                                            var99 = field519.method2832((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var99 = Statics.field24.method21();
                                        }
                                    } else if (var98 == -1) {
                                        var99 = var10.method2782((class38) null, -1, var97, Statics.field24.field33);
                                        if (var99 == null && class152.field2581) {
                                            method3375(var10);
                                        }
                                    } else {
                                        class38 var103 = class38.method131(var98);
                                        var99 = var10.method2782(var103, var10.field2620, var97, Statics.field24.field33);
                                        if (var99 == null && class152.field2581) {
                                            method3375(var10);
                                        }
                                    }
                                    class84.method1741(var10.field2530 / 2 + var12, var10.field2531 / 2 + var13);
                                    int var104 = var10.field2519 * class84.field1465[var10.field2582] >> 16;
                                    int var105 = var10.field2519 * class84.field1486[var10.field2582] >> 16;
                                    if (var99 != null) {
                                        if (var10.field2520) {
                                            var99.method1923();
                                            if (var10.field2538) {
                                                var99.method1940(0, var10.field2597, var10.field2563, var10.field2582, var10.field2624, var10.field2560 + var100 + var104, var10.field2560 + var105, var10.field2519);
                                            } else {
                                                var99.method1939(0, var10.field2597, var10.field2563, var10.field2582, var10.field2624, var10.field2560 + var100 + var104, var10.field2560 + var105);
                                            }
                                        } else {
                                            var99.method1939(0, var10.field2597, 0, var10.field2582, 0, var104, var105);
                                        }
                                    }
                                    class84.method1740();
                                } else {
                                    if (var10.field2523 == 7) {
                                        class193 var106 = var10.method2779();
                                        if (var106 == null) {
                                            if (class152.field2581) {
                                                method3375(var10);
                                            }
                                            continue;
                                        }
                                        int var107 = 0;
                                        for (int var108 = 0; var108 < var10.field2531; var108++) {
                                            for (int var109 = 0; var109 < var10.field2530; var109++) {
                                                if (var10.field2623[var107] > 0) {
                                                    class45 var110 = class45.method1729(var10.field2623[var107] - 1);
                                                    String var111;
                                                    if (var110.field1043 != 1 && var10.field2579[var107] == 1) {
                                                        var111 = class2.method778(16748608) + var110.field1022 + class2.field14;
                                                    } else {
                                                        var111 = class2.method778(16748608) + var110.field1022 + class2.field14 + " " + 'x' + method501(var10.field2579[var107]);
                                                    }
                                                    int var112 = (var10.field2591 + 115) * var109 + var12;
                                                    int var113 = (var10.field2575 + 12) * var108 + var13;
                                                    if (var10.field2559 == 0) {
                                                        var106.method3239(var111, var112, var113, var10.field2540, var10.field2515 ? 0 : -1);
                                                    } else if (var10.field2559 == 1) {
                                                        var106.method3245(var111, var10.field2530 / 2 + var112, var113, var10.field2540, var10.field2515 ? 0 : -1);
                                                    } else {
                                                        var106.method3240(var111, var10.field2530 + var112 - 1, var113, var10.field2540, var10.field2515 ? 0 : -1);
                                                    }
                                                }
                                                var107++;
                                            }
                                        }
                                    }
                                    if (var10.field2523 == 8 && Statics.field223 == var10 && field352 == field268) {
                                        int var114 = 0;
                                        int var115 = 0;
                                        class193 var116 = Statics.field1914;
                                        String var117 = var10.field2568;
                                        String var118 = method2393(var117, var10);
                                        while (var118.length() > 0) {
                                            int var119 = var118.indexOf(class2.field20);
                                            String var120;
                                            if (var119 == -1) {
                                                var120 = var118;
                                                var118 = "";
                                            } else {
                                                var120 = var118.substring(0, var119);
                                                var118 = var118.substring(var119 + 4);
                                            }
                                            int var121 = var116.method3234(var120);
                                            if (var121 > var114) {
                                                var114 = var121;
                                            }
                                            var115 += var116.field2910 + 1;
                                        }
                                        var114 += 6;
                                        var115 += 7;
                                        int var122 = var10.field2530 + var12 - 5 - var114;
                                        int var123 = var10.field2531 + var13 + 5;
                                        if (var122 < var12 + 5) {
                                            var122 = var12 + 5;
                                        }
                                        if (var114 + var122 > arg4) {
                                            var122 = arg4 - var114;
                                        }
                                        if (var115 + var123 > arg5) {
                                            var123 = arg5 - var115;
                                        }
                                        class73.method1475(var122, var123, var114, var115, 16777120);
                                        class73.method1485(var122, var123, var114, var115, 0);
                                        String var124 = var10.field2568;
                                        int var125 = var116.field2910 + var123 + 2;
                                        String var126 = method2393(var124, var10);
                                        while (var126.length() > 0) {
                                            int var127 = var126.indexOf(class2.field20);
                                            String var128;
                                            if (var127 == -1) {
                                                var128 = var126;
                                                var126 = "";
                                            } else {
                                                var128 = var126.substring(0, var127);
                                                var126 = var126.substring(var127 + 4);
                                            }
                                            var116.method3239(var128, var122 + 3, var125, 0, -1);
                                            var125 += var116.field2910 + 1;
                                        }
                                    }
                                    if (var10.field2523 == 9) {
                                        if (var10.field2550 == 1) {
                                            class73.method1491(var12, var13, var10.field2530 + var12, var10.field2531 + var13, var10.field2540);
                                        } else {
                                            int var129 = var10.field2530 >= 0 ? var10.field2530 : -var10.field2530;
                                            int var130 = var10.field2531 >= 0 ? var10.field2531 : -var10.field2531;
                                            int var131 = var129;
                                            if (var129 < var130) {
                                                var131 = var130;
                                            }
                                            if (var131 != 0) {
                                                int var132 = (var10.field2530 << 16) / var131;
                                                int var133 = (var10.field2531 << 16) / var131;
                                                if (var133 <= var132) {
                                                    var132 = -var132;
                                                } else {
                                                    var133 = -var133;
                                                }
                                                int var134 = var10.field2550 * var133 >> 17;
                                                int var135 = var10.field2550 * var133 + 1 >> 17;
                                                int var136 = var10.field2550 * var132 >> 17;
                                                int var137 = var10.field2550 * var132 + 1 >> 17;
                                                int var138 = var12 + var134;
                                                int var139 = var12 - var135;
                                                int var140 = var10.field2530 + var12 - var135;
                                                int var141 = var10.field2530 + var12 + var134;
                                                int var142 = var13 + var136;
                                                int var143 = var13 - var137;
                                                int var144 = var10.field2531 + var13 - var137;
                                                int var145 = var10.field2531 + var13 + var136;
                                                class84.method1762(var138, var139, var140);
                                                class84.method1749(var142, var143, var144, var138, var139, var140, var10.field2540);
                                                class84.method1762(var138, var140, var141);
                                                class84.method1749(var142, var144, var145, var138, var140, var141, var10.field2540);
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

    @ObfuscatedName("dy.cv(Ljava/lang/String;Led;I)Ljava/lang/String;")
    public static String method2393(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method76(arg1, var2 - 1);
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
                if (Statics.field2943 != null) {
                    int var9 = Statics.field2943.field2065;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2943.field2067 != null) {
                        var8 = (String) Statics.field2943.field2067;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("t.cj(II)Ljava/lang/String;")
    public static final String method501(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method778(65408) + var1.substring(0, var1.length() - 8) + class142.field2173 + " " + class2.field15 + var1 + class2.field18 + class2.field14;
        } else if (var1.length() > 6) {
            return " " + class2.method778(16777215) + var1.substring(0, var1.length() - 4) + class142.field2306 + " " + class2.field15 + var1 + class2.field18 + class2.field14;
        } else {
            return " " + class2.method778(16776960) + var1 + class2.field14;
        }
    }

    @ObfuscatedName("f.cx(IIIIIS)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2813[0].method1544(arg0, arg1);
        Statics.field2813[1].method1544(arg0, arg1 + arg3 - 16);
        class73.method1475(arg0, arg1 + 16, 16, arg3 - 32, field341);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1475(arg0, arg1 + 16 + var6, 16, var5, field342);
        class73.method1489(arg0, arg1 + 16 + var6, var5, field482);
        class73.method1489(arg0 + 1, arg1 + 16 + var6, var5, field482);
        class73.method1516(arg0, arg1 + 16 + var6, 16, field482);
        class73.method1516(arg0, arg1 + 17 + var6, 16, field482);
        class73.method1489(arg0 + 15, arg1 + 16 + var6, var5, field343);
        class73.method1489(arg0 + 14, arg1 + 17 + var6, var5 - 1, field343);
        class73.method1516(arg0, arg1 + 15 + var6 + var5, 16, field343);
        class73.method1516(arg0 + 1, arg1 + 14 + var6 + var5, 15, field343);
    }

    @ObfuscatedName("ee.cc(Led;I)Z")
    public static final boolean method2748(class152 arg0) {
        if (arg0.field2632 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2632.length; var1++) {
            int var2 = method76(arg0, var1);
            int var3 = arg0.field2588[var1];
            if (arg0.field2632[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2632[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2632[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("s.ck(Led;IB)I")
    public static final int method76(class152 arg0, int arg1) {
        if (arg0.field2614 == null || arg1 >= arg0.field2614.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2614[arg1];
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
                    var7 = field402[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field288[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field404[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method1829(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method1729(var12).field1058 || field501)) {
                        for (int var13 = 0; var13 < var11.field2623.length; var13++) {
                            if (var12 + 1 == var11.field2623[var13]) {
                                var7 += var11.field2579[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2647[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2125[field288[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2647[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field24.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2122[var14]) {
                            var7 += field288[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method1829(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method1729(var18).field1058 || field501)) {
                        for (int var19 = 0; var19 < var17.field2623.length; var19++) {
                            if (var18 + 1 == var17.field2623[var19]) {
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
                    int var20 = class154.field2647[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method597(var22);
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
                    var7 = (Statics.field24.field777 >> 7) + Statics.field1075;
                }
                if (var6 == 19) {
                    var7 = (Statics.field24.field744 >> 7) + Statics.field1673;
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

    @ObfuscatedName("ez.cl(Led;IIB)V")
    public static final void method2715(class152 arg0, int arg1, int arg2) {
        if (arg0.field2555 == 1) {
            method19(arg0.field2574, "", 24, 0, 0, arg0.field2521);
        }
        if (arg0.field2555 == 2 && !field420) {
            String var3 = method101(arg0);
            if (var3 != null) {
                method19(var3, class2.method778(65280) + arg0.field2621, 25, 0, -1, arg0.field2521);
            }
        }
        if (arg0.field2555 == 3) {
            method19(class142.field2267, "", 26, 0, 0, arg0.field2521);
        }
        if (arg0.field2555 == 4) {
            method19(arg0.field2574, "", 28, 0, 0, arg0.field2521);
        }
        if (arg0.field2555 == 5) {
            method19(arg0.field2574, "", 29, 0, 0, arg0.field2521);
        }
        if (arg0.field2555 == 6 && field306 == null) {
            method19(arg0.field2574, "", 30, 0, -1, arg0.field2521);
        }
        if (arg0.field2523 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2531; var5++) {
                for (int var6 = 0; var6 < arg0.field2530; var6++) {
                    int var7 = (arg0.field2591 + 32) * var6;
                    int var8 = (arg0.field2575 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2576[var4];
                        var8 += arg0.field2577[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field423 = var4;
                        Statics.field1850 = arg0;
                        if (arg0.field2623[var4] > 0) {
                            class45 var9 = class45.method1729(arg0.field2623[var4] - 1);
                            if (field418 == 1 && class156.method4(Statics.method488(arg0))) {
                                if (Statics.field53 != arg0.field2521 || Statics.field1101 != var4) {
                                    method19(class142.field2291, field276 + " " + class2.field19 + " " + class2.method778(16748608) + var9.field1022, 31, var9.field1028, var4, arg0.field2521);
                                }
                            } else if (!field420 || !class156.method4(Statics.method488(arg0))) {
                                String[] var10 = var9.field1045;
                                if (field516) {
                                    var10 = method2755(var10);
                                }
                                if (class156.method4(Statics.method488(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method19(var10[var11], class2.method778(16748608) + var9.field1022, var12, var9.field1028, var4, arg0.field2521);
                                        } else if (var11 == 4) {
                                            method19(class142.field2370, class2.method778(16748608) + var9.field1022, 37, var9.field1028, var4, arg0.field2521);
                                        }
                                    }
                                }
                                int var13 = Statics.method488(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method19(class142.field2291, class2.method778(16748608) + var9.field1022, 38, var9.field1028, var4, arg0.field2521);
                                }
                                class156 var10000 = (class156) null;
                                if (class156.method4(Statics.method488(arg0)) && var10 != null) {
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
                                            method19(var10[var15], class2.method778(16748608) + var9.field1022, var16, var9.field1028, var4, arg0.field2521);
                                        }
                                    }
                                }
                                String[] var17 = arg0.field2573;
                                if (field516) {
                                    var17 = method2755(var17);
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
                                            method19(var17[var18], class2.method778(16748608) + var9.field1022, var19, var9.field1028, var4, arg0.field2521);
                                        }
                                    }
                                }
                                method19(class142.field2292, class2.method778(16748608) + var9.field1022, 1005, var9.field1028, var4, arg0.field2521);
                            } else if ((Statics.field245 & 0x10) == 16) {
                                method19(field459, field424 + " " + class2.field19 + " " + class2.method778(16748608) + var9.field1022, 32, var9.field1028, var4, arg0.field2521);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2520) {
            return;
        }
        if (!field420) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21 = method2015(arg0, var20);
                if (var21 != null) {
                    method19(var21, arg0.field2554, 1007, var20 + 1, arg0.field2522, arg0.field2521);
                }
            }
            String var22 = method101(arg0);
            if (var22 != null) {
                method19(var22, arg0.field2554, 25, 0, arg0.field2522, arg0.field2521);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = method2015(arg0, var23);
                if (var24 != null) {
                    method19(var24, arg0.field2554, 57, var23 + 1, arg0.field2522, arg0.field2521);
                }
            }
            int var25 = Statics.method488(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method19(class142.field2147, "", 30, 0, arg0.field2522, arg0.field2521);
            }
        } else if (Statics.method504(Statics.method488(arg0)) && (Statics.field245 & 0x20) == 32) {
            method19(field459, field424 + " " + class2.field19 + " " + arg0.field2554, 58, 0, arg0.field2522, arg0.field2521);
        }
    }

    @ObfuscatedName("dm.cs([Led;IIIIIIII)V")
    public static final void method2353(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2520 || var9.field2523 == 0 || var9.field2524 || Statics.method488(var9) != 0 || field438 == var9) && var9.field2532 == arg1 && (!var9.field2520 || !Statics.method150(var9))) {
                int var10 = var9.field2526 + arg6;
                int var11 = var9.field2527 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2523 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2523 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2530 + var10;
                    int var19 = var9.field2531 + var11;
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
                    int var22 = var9.field2530 + var10;
                    int var23 = var9.field2531 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field437 == var9) {
                    field480 = true;
                    field374 = var10;
                    field447 = var11;
                }
                if (!var9.field2520 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2003;
                    int var25 = class127.field2004;
                    if (class127.field2009 != 0) {
                        var24 = class127.field2010;
                        var25 = class127.field2011;
                    }
                    if (var9.field2525 == 1337) {
                        method3375(var9);
                        if (!field344 && !field406 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method745(var24, var25, var12, var13);
                        }
                    } else if (var9.field2525 != 1338) {
                        if (!field406 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2715(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2523 == 0) {
                            if (!var9.field2520 && Statics.method150(var9) && Statics.field931 != var9) {
                                continue;
                            }
                            method2353(arg0, var9.field2521, var12, var13, var14, var15, var10 - var9.field2534, var11 - var9.field2558);
                            if (var9.field2629 != null) {
                                method2353(var9.field2629, var9.field2521, var12, var13, var14, var15, var10 - var9.field2534, var11 - var9.field2558);
                            }
                            class4 var37 = (class4) field426.method3092((long) var9.field2521);
                            if (var37 != null) {
                                if (var37.field59 == 0 && class127.field2003 >= var12 && class127.field2004 >= var13 && class127.field2003 < var14 && class127.field2004 < var15 && !field406 && !field507) {
                                    field384[0] = class142.field2377;
                                    field413[0] = "";
                                    field410[0] = 1006;
                                    field320 = 1;
                                }
                                int var38 = var37.field60;
                                if (class152.method2621(var38)) {
                                    method2353(Statics.field2639[var38], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2520) {
                            if (var9.field2638 && class127.field2003 >= var12 && class127.field2004 >= var13 && class127.field2003 < var14 && class127.field2004 < var15) {
                                for (class1 var39 = (class1) field368.method3122(); var39 != null; var39 = (class1) field368.method3124()) {
                                    if (var39.field10) {
                                        var39.method3204();
                                        var39.field3.field2600 = false;
                                    }
                                }
                                if (Statics.field1913 == 0) {
                                    field437 = null;
                                    field438 = null;
                                }
                                if (!field406) {
                                    field384[0] = class142.field2377;
                                    field413[0] = "";
                                    field410[0] = 1006;
                                    field320 = 1;
                                }
                            }
                            boolean var40;
                            if (class127.field2003 >= var12 && class127.field2004 >= var13 && class127.field2003 < var14 && class127.field2004 < var15) {
                                var40 = true;
                            } else {
                                var40 = false;
                            }
                            boolean var41 = false;
                            if ((class127.field2002 == 1 || !Statics.field1666 && class127.field2002 == 4) && var40) {
                                var41 = true;
                            }
                            boolean var42 = false;
                            if ((class127.field2009 == 1 || !Statics.field1666 && class127.field2009 == 4) && class127.field2010 >= var12 && class127.field2011 >= var13 && class127.field2010 < var14 && class127.field2011 < var15) {
                                var42 = true;
                            }
                            if (var42) {
                                method3218(var9, class127.field2010 - var10, class127.field2011 - var11);
                            }
                            if (field437 != null && field437 != var9 && var40) {
                                int var43 = Statics.method488(var9);
                                boolean var44 = (var43 >> 20 & 0x1) != 0;
                                if (var44) {
                                    field441 = var9;
                                }
                            }
                            if (field438 == var9) {
                                field442 = true;
                                field316 = var10;
                                field444 = var11;
                            }
                            if (var9.field2524) {
                                if (var40 && field370 != 0 && var9.field2609 != null) {
                                    class1 var45 = new class1();
                                    var45.field10 = true;
                                    var45.field3 = var9;
                                    var45.field1 = field370;
                                    var45.field9 = var9.field2609;
                                    field368.method3117(var45);
                                }
                                if (field437 != null || Statics.field531 != null || field406) {
                                    var42 = false;
                                    var41 = false;
                                    var40 = false;
                                }
                                if (!var9.field2631 && var42) {
                                    var9.field2631 = true;
                                    if (var9.field2590 != null) {
                                        class1 var46 = new class1();
                                        var46.field10 = true;
                                        var46.field3 = var9;
                                        var46.field8 = class127.field2010 - var10;
                                        var46.field1 = class127.field2011 - var11;
                                        var46.field9 = var9.field2590;
                                        field368.method3117(var46);
                                    }
                                }
                                if (var9.field2631 && var41 && var9.field2608 != null) {
                                    class1 var47 = new class1();
                                    var47.field10 = true;
                                    var47.field3 = var9;
                                    var47.field8 = class127.field2003 - var10;
                                    var47.field1 = class127.field2004 - var11;
                                    var47.field9 = var9.field2608;
                                    field368.method3117(var47);
                                }
                                if (var9.field2631 && !var41) {
                                    var9.field2631 = false;
                                    if (var9.field2592 != null) {
                                        class1 var48 = new class1();
                                        var48.field10 = true;
                                        var48.field3 = var9;
                                        var48.field8 = class127.field2003 - var10;
                                        var48.field1 = class127.field2004 - var11;
                                        var48.field9 = var9.field2592;
                                        field465.method3117(var48);
                                    }
                                }
                                if (var41 && var9.field2593 != null) {
                                    class1 var49 = new class1();
                                    var49.field10 = true;
                                    var49.field3 = var9;
                                    var49.field8 = class127.field2003 - var10;
                                    var49.field1 = class127.field2004 - var11;
                                    var49.field9 = var9.field2593;
                                    field368.method3117(var49);
                                }
                                if (!var9.field2600 && var40) {
                                    var9.field2600 = true;
                                    if (var9.field2594 != null) {
                                        class1 var50 = new class1();
                                        var50.field10 = true;
                                        var50.field3 = var9;
                                        var50.field8 = class127.field2003 - var10;
                                        var50.field1 = class127.field2004 - var11;
                                        var50.field9 = var9.field2594;
                                        field368.method3117(var50);
                                    }
                                }
                                if (var9.field2600 && var40 && var9.field2510 != null) {
                                    class1 var51 = new class1();
                                    var51.field10 = true;
                                    var51.field3 = var9;
                                    var51.field8 = class127.field2003 - var10;
                                    var51.field1 = class127.field2004 - var11;
                                    var51.field9 = var9.field2510;
                                    field368.method3117(var51);
                                }
                                if (var9.field2600 && !var40) {
                                    var9.field2600 = false;
                                    if (var9.field2561 != null) {
                                        class1 var52 = new class1();
                                        var52.field10 = true;
                                        var52.field3 = var9;
                                        var52.field8 = class127.field2003 - var10;
                                        var52.field1 = class127.field2004 - var11;
                                        var52.field9 = var9.field2561;
                                        field465.method3117(var52);
                                    }
                                }
                                if (var9.field2606 != null) {
                                    class1 var53 = new class1();
                                    var53.field3 = var9;
                                    var53.field9 = var9.field2606;
                                    field387.method3117(var53);
                                }
                                if (var9.field2601 != null && field451 > var9.field2633) {
                                    if (var9.field2602 == null || field451 - var9.field2633 > 32) {
                                        class1 var58 = new class1();
                                        var58.field3 = var9;
                                        var58.field9 = var9.field2601;
                                        field368.method3117(var58);
                                    } else {
                                        label582: for (int var54 = var9.field2633; var54 < field451; var54++) {
                                            int var55 = field357[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2602.length; var56++) {
                                                if (var9.field2602[var56] == var55) {
                                                    class1 var57 = new class1();
                                                    var57.field3 = var9;
                                                    var57.field9 = var9.field2601;
                                                    field368.method3117(var57);
                                                    break label582;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2633 = field451;
                                }
                                if (var9.field2622 != null && field453 > var9.field2627) {
                                    if (var9.field2571 == null || field453 - var9.field2627 > 32) {
                                        class1 var63 = new class1();
                                        var63.field3 = var9;
                                        var63.field9 = var9.field2622;
                                        field368.method3117(var63);
                                    } else {
                                        label558: for (int var59 = var9.field2627; var59 < field453; var59++) {
                                            int var60 = field452[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2571.length; var61++) {
                                                if (var9.field2571[var61] == var60) {
                                                    class1 var62 = new class1();
                                                    var62.field3 = var9;
                                                    var62.field9 = var9.field2622;
                                                    field368.method3117(var62);
                                                    break label558;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2627 = field453;
                                }
                                if (var9.field2605 != null && field416 > var9.field2635) {
                                    if (var9.field2617 == null || field416 - var9.field2635 > 32) {
                                        class1 var68 = new class1();
                                        var68.field3 = var9;
                                        var68.field9 = var9.field2605;
                                        field368.method3117(var68);
                                    } else {
                                        label534: for (int var64 = var9.field2635; var64 < field416; var64++) {
                                            int var65 = field405[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var9.field2617.length; var66++) {
                                                if (var9.field2617[var66] == var65) {
                                                    class1 var67 = new class1();
                                                    var67.field3 = var9;
                                                    var67.field9 = var9.field2605;
                                                    field368.method3117(var67);
                                                    break label534;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2635 = field416;
                                }
                                if (field456 > var9.field2596 && var9.field2610 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field9 = var9.field2610;
                                    field368.method3117(var69);
                                }
                                if (field457 > var9.field2596 && var9.field2612 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field9 = var9.field2612;
                                    field368.method3117(var70);
                                }
                                if (field458 > var9.field2596 && var9.field2613 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field9 = var9.field2613;
                                    field368.method3117(var71);
                                }
                                if (field417 > var9.field2596 && var9.field2634 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field9 = var9.field2634;
                                    field368.method3117(var72);
                                }
                                var9.field2596 = field449;
                                if (var9.field2611 != null) {
                                    for (int var73 = 0; var73 < field365; var73++) {
                                        class1 var74 = new class1();
                                        var74.field3 = var9;
                                        var74.field7 = field448[var73];
                                        var74.field2 = field339[var73];
                                        var74.field9 = var9.field2611;
                                        field368.method3117(var74);
                                    }
                                }
                            }
                        }
                        if (!var9.field2520 && field437 == null && Statics.field531 == null && !field406) {
                            if ((var9.field2603 >= 0 || var9.field2619 != 0) && class127.field2003 >= var12 && class127.field2004 >= var13 && class127.field2003 < var14 && class127.field2004 < var15) {
                                if (var9.field2603 >= 0) {
                                    Statics.field931 = arg0[var9.field2603];
                                } else {
                                    Statics.field931 = var9;
                                }
                            }
                            if (var9.field2523 == 8 && class127.field2003 >= var12 && class127.field2004 >= var13 && class127.field2003 < var14 && class127.field2004 < var15) {
                                Statics.field223 = var9;
                            }
                            if (var9.field2512 > var9.field2531) {
                                int var75 = var9.field2530 + var10;
                                int var76 = var9.field2531;
                                int var77 = var9.field2512;
                                int var78 = class127.field2003;
                                int var79 = class127.field2004;
                                if (field356) {
                                    field346 = 32;
                                } else {
                                    field346 = 0;
                                }
                                field356 = false;
                                if (class127.field2002 == 1 || !Statics.field1666 && class127.field2002 == 4) {
                                    if (var78 >= var75 && var78 < var75 + 16 && var79 >= var11 && var79 < var11 + 16) {
                                        var9.field2558 -= 4;
                                        method3375(var9);
                                    } else if (var78 >= var75 && var78 < var75 + 16 && var79 >= var11 + var76 - 16 && var79 < var11 + var76) {
                                        var9.field2558 += 4;
                                        method3375(var9);
                                    } else if (var78 >= var75 - field346 && var78 < field346 + var75 + 16 && var79 >= var11 + 16 && var79 < var11 + var76 - 16) {
                                        int var80 = (var76 - 32) * var76 / var77;
                                        if (var80 < 8) {
                                            var80 = 8;
                                        }
                                        int var81 = var79 - var11 - 16 - var80 / 2;
                                        int var82 = var76 - 32 - var80;
                                        var9.field2558 = (var77 - var76) * var81 / var82;
                                        method3375(var9);
                                        field356 = true;
                                    }
                                }
                                if (field370 != 0) {
                                    int var83 = var9.field2530;
                                    if (var78 >= var75 - var83 && var79 >= var11 && var78 < var75 + 16 && var79 <= var11 + var76) {
                                        var9.field2558 += field370 * 45;
                                        method3375(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field419 == 0 || field419 == 3) && (class127.field2009 == 1 || !Statics.field1666 && class127.field2009 == 4)) {
                        int var26 = class127.field2010 - 25 - var10;
                        int var27 = class127.field2011 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field348 + field335 & 0x7FF;
                            int var29 = class84.field1465[var28];
                            int var30 = class84.field1486[var28];
                            int var31 = (field337 + 256) * var29 >> 8;
                            int var32 = (field337 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field24.field777 + var33 >> 7;
                            int var36 = Statics.field24.field744 - var34 >> 7;
                            field386.method2319(37);
                            field386.method2051(18);
                            field386.method2095(Statics.field1075 + var35);
                            field386.method2097(Statics.field1673 + var36);
                            field386.method2088(class124.field1970[82] ? (class124.field1970[81] ? 2 : 1) : 0);
                            field386.method2051(var26);
                            field386.method2051(var27);
                            field386.method2052(field348);
                            field386.method2051(57);
                            field386.method2051(field335);
                            field386.method2051(field337);
                            field386.method2051(89);
                            field386.method2052(Statics.field24.field777);
                            field386.method2052(Statics.field24.field744);
                            field386.method2051(63);
                            field493 = var35;
                            field494 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.cg([Led;II)V")
    public static final void method2355(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2523 == 0) {
                    if (var3.field2629 != null) {
                        method2355(var3.field2629, arg1);
                    }
                    class4 var4 = (class4) field426.method3092((long) var3.field2521);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class152.method2621(var5)) {
                            method2355(Statics.field2639[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2615 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field9 = var3.field2615;
                    class32.method701(var6, 200000);
                }
                if (arg1 == 1 && var3.field2616 != null) {
                    if (var3.field2522 >= 0) {
                        class152 var7 = class152.method1829(var3.field2521);
                        if (var7 == null || var7.field2629 == null || var3.field2522 >= var7.field2629.length || var7.field2629[var3.field2522] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field9 = var3.field2616;
                    class32.method701(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("gl.cn(Led;III)V")
    public static final void method3218(class152 arg0, int arg1, int arg2) {
        if (field437 != null || field406 || arg0 == null || method2716(arg0) == null) {
            return;
        }
        field437 = arg0;
        field438 = method2716(arg0);
        field439 = arg1;
        field491 = arg2;
        Statics.field1913 = 0;
        field455 = false;
        if (field320 <= 0) {
            return;
        }
        int var3 = field320 - 1;
        Statics.field539 = new class27();
        Statics.field539.field654 = field408[var3];
        Statics.field539.field647 = field422[var3];
        Statics.field539.field648 = field410[var3];
        Statics.field539.field649 = field411[var3];
        Statics.field539.field650 = field384[var3];
    }

    @ObfuscatedName("y.cd(I)V")
    public static final void method27() {
        method3375(field437);
        Statics.field1913++;
        if (field480 && field442) {
            int var0 = class127.field2003;
            int var1 = class127.field2004;
            int var2 = var0 - field439;
            int var3 = var1 - field491;
            if (var2 < field316) {
                var2 = field316;
            }
            if (field437.field2530 + var2 > field316 + field438.field2530) {
                var2 = field316 + field438.field2530 - field437.field2530;
            }
            if (var3 < field444) {
                var3 = field444;
            }
            if (field437.field2531 + var3 > field444 + field438.field2531) {
                var3 = field444 + field438.field2531 - field437.field2531;
            }
            int var4 = var2 - field374;
            int var5 = var3 - field447;
            int var6 = field437.field2584;
            if (Statics.field1913 > field437.field2585 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field455 = true;
            }
            int var7 = field438.field2534 + (var2 - field316);
            int var8 = field438.field2558 + (var3 - field444);
            if (field437.field2630 != null && field455) {
                class1 var9 = new class1();
                var9.field3 = field437;
                var9.field8 = var7;
                var9.field1 = var8;
                var9.field9 = field437.field2630;
                class32.method701(var9, 200000);
            }
            if (class127.field2002 == 0) {
                if (field455) {
                    if (field437.field2598 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field437;
                        var10.field8 = var7;
                        var10.field1 = var8;
                        var10.field5 = field441;
                        var10.field9 = field437.field2598;
                        class32.method701(var10, 200000);
                    }
                    if (field441 != null && method1037(field437) != null) {
                        field386.method2319(240);
                        field386.method2097(field441.field2625);
                        field386.method2103(field437.field2521);
                        field386.method2251(field441.field2521);
                        field386.method2212(field437.field2522);
                        field386.method2097(field437.field2625);
                        field386.method2095(field441.field2522);
                    }
                } else if ((field511 == 1 || method7(field320 - 1)) && field320 > 2) {
                    method124(field439 + field374, field491 + field447);
                } else if (field320 > 0) {
                    int var11 = field439 + field374;
                    int var12 = field491 + field447;
                    class27 var13 = Statics.field539;
                    method570(var13.field654, var13.field647, var13.field648, var13.field649, var13.field650, var13.field650, var11, var12);
                    Statics.field539 = null;
                }
                field437 = null;
            }
        } else if (Statics.field1913 > 1) {
            field437 = null;
        }
    }

    @ObfuscatedName("aw.cb(III)V")
    public static void method834(int arg0, int arg1) {
        class27 var2 = Statics.field539;
        method570(var2.field654, var2.field647, var2.field648, var2.field649, var2.field650, var2.field650, arg0, arg1);
        Statics.field539 = null;
    }

    @ObfuscatedName("gh.cz(Led;I)V")
    public static void method3375(class152 arg0) {
        if (field468 == arg0.field2604) {
            field469[arg0.field2636] = true;
        }
    }

    @ObfuscatedName("ei.cp(I)V")
    public static void method2723() {
        for (class4 var0 = (class4) field426.method3096(); var0 != null; var0 = (class4) field426.method3093()) {
            int var1 = var0.field60;
            if (class152.method2621(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2639[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2520;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2874;
                    class152 var6 = class152.method1829(var5);
                    if (var6 != null) {
                        method3375(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.cm(Led;B)Led;")
    public static class152 method2716(class152 arg0) {
        class152 var1 = method1037(arg0);
        if (var1 == null) {
            var1 = arg0.field2562;
        }
        return var1;
    }

    @ObfuscatedName("eg.co([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2755(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("y.cr(II)V")
    public static final void method20(int arg0) {
        if (!class152.method2621(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2639[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2620 = 0;
                var3.field2628 = 0;
            }
        }
    }

    @ObfuscatedName("w.de([Led;II)V")
    public static final void method35(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2532 == arg1 && (!var3.field2520 || !Statics.method150(var3))) {
                if (var3.field2523 == 0) {
                    if (!var3.field2520 && Statics.method150(var3) && Statics.field931 != var3) {
                        continue;
                    }
                    method35(arg0, var3.field2521);
                    if (var3.field2629 != null) {
                        method35(var3.field2629, var3.field2521);
                    }
                    class4 var4 = (class4) field426.method3092((long) var3.field2521);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class152.method2621(var5)) {
                            method35(Statics.field2639[var5], -1);
                        }
                    }
                }
                if (var3.field2523 == 6) {
                    if (var3.field2557 != -1 || var3.field2544 != -1) {
                        boolean var6 = method2748(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2544;
                        } else {
                            var7 = var3.field2557;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method131(var7);
                            var3.field2628 += field433;
                            while (var3.field2628 > var8.field917[var3.field2620]) {
                                var3.field2628 -= var8.field917[var3.field2620];
                                var3.field2620++;
                                if (var3.field2620 >= var8.field923.length) {
                                    var3.field2620 -= var8.field919;
                                    if (var3.field2620 < 0 || var3.field2620 >= var8.field923.length) {
                                        var3.field2620 = 0;
                                    }
                                }
                                method3375(var3);
                            }
                        }
                    }
                    if (var3.field2565 != 0 && !var3.field2520) {
                        int var9 = var3.field2565 >> 16;
                        int var10 = var3.field2565 << 16 >> 16;
                        int var11 = field433 * var9;
                        int var12 = field433 * var10;
                        var3.field2582 = var3.field2582 + var11 & 0x7FF;
                        var3.field2597 = var3.field2597 + var12 & 0x7FF;
                        method3375(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.df(II)V")
    public static final void method140(int arg0) {
        method2723();
        for (class20 var1 = (class20) class20.field552.method3122(); var1 != null; var1 = (class20) class20.field552.method3124()) {
            if (var1.field565 != null) {
                var1.method480();
            }
        }
        int var2 = class46.method817(arg0).field1070;
        if (var2 == 0) {
            return;
        }
        int var3 = class154.field2647[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1743(0.9D);
                ((class88) Statics.field1482).method1811(0.9D);
            }
            if (var3 == 2) {
                class84.method1743(0.8D);
                ((class88) Statics.field1482).method1811(0.8D);
            }
            if (var3 == 3) {
                class84.method1743(0.7D);
                ((class88) Statics.field1482).method1811(0.7D);
            }
            if (var3 == 4) {
                class84.method1743(0.6D);
                ((class88) Statics.field1482).method1811(0.6D);
            }
            class45.field1026.method3065();
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
            if (field496 != var4) {
                if (field496 == 0 && field463 != -1) {
                    class161.method1920(Statics.field1906, field463, 0, var4, false);
                    field498 = false;
                } else if (var4 == 0) {
                    Statics.field2709.method3012();
                    class161.field2700 = 1;
                    Statics.field1924 = null;
                    field498 = false;
                } else if (class161.field2700 == 0) {
                    Statics.field2709.method2960(var4);
                } else {
                    Statics.field2706 = var4;
                }
                field496 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field275 = 127;
            }
            if (var3 == 1) {
                field275 = 96;
            }
            if (var3 == 2) {
                field275 = 64;
            }
            if (var3 == 3) {
                field275 = 32;
            }
            if (var3 == 4) {
                field275 = 0;
            }
        }
        if (var2 == 5) {
            field511 = var3;
        }
        if (var2 == 6) {
            field427 = var3;
        }
        if (var2 == 9) {
            field428 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field500 = 127;
            }
            if (var3 == 1) {
                field500 = 96;
            }
            if (var3 == 2) {
                field500 = 64;
            }
            if (var3 == 3) {
                field500 = 32;
            }
            if (var3 == 4) {
                field500 = 0;
            }
        }
        if (var2 == 17) {
            field383 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field526, class18.field530, class18.field527 };
            field293 = (class18) class99.method2452(var5, var3);
            if (field293 == null) {
                field293 = class18.field527;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field486 = -1;
        } else {
            field486 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("en.dr(Lb;ZI)V")
    public static final void method2603(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2874;
        arg0.method3204();
        if (arg1) {
            class152.method2622(var2);
        }
        method1297(var2);
        class152 var4 = class152.method1829(var3);
        if (var4 != null) {
            method3375(var4);
        }
        for (int var5 = 0; var5 < field320; var5++) {
            if (method2605(field410[var5])) {
                if (var5 < field320 - 1) {
                    for (int var6 = var5; var6 < field320 - 1; var6++) {
                        field384[var6] = field384[var6 + 1];
                        field413[var6] = field413[var6 + 1];
                        field410[var6] = field410[var6 + 1];
                        field411[var6] = field411[var6 + 1];
                        field408[var6] = field408[var6 + 1];
                        field422[var6] = field422[var6 + 1];
                    }
                }
                field320--;
            }
        }
        if (field425 != -1) {
            int var7 = field425;
            if (class152.method2621(var7)) {
                method2355(Statics.field2639[var7], 1);
            }
        }
    }

    @ObfuscatedName("v.ds(Led;I)Z")
    public static final boolean method132(class152 arg0) {
        int var1 = arg0.field2525;
        if (var1 == 205) {
            field371 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field519.method2828(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field519.method2829(var4, var5 == 1);
        }
        if (var1 == 324) {
            field519.method2836(false);
        }
        if (var1 == 325) {
            field519.method2836(true);
        }
        if (var1 == 326) {
            field386.method2319(122);
            field519.method2830(field386);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cs.du(IIIILbg;B)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method115(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field348 + field335 & 0x7FF;
        int var7 = class84.field1465[var6];
        int var8 = class84.field1486[var6];
        int var9 = var7 * 256 / (field337 + 256);
        int var10 = var8 * 256 / (field337 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2878.method1411(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("x.dn(IIIILbg;B)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field348 + field335 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1465[var5];
        int var8 = class84.field1486[var5];
        int var9 = var7 * 256 / (field337 + 256);
        int var10 = var8 * 256 / (field337 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1414(Statics.field140, arg0 + 94 + var11 - arg4.field1307 / 2 + 4, arg1 + 83 - var12 - arg4.field1308 / 2 - 4);
        } else {
            arg4.method1400(arg0 + 94 + var11 - arg4.field1307 / 2 + 4, arg1 + 83 - var12 - arg4.field1308 / 2 - 4);
        }
    }

    @ObfuscatedName("av.dg(Ljava/lang/String;ZI)Z")
    public static boolean method673(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method1827(arg0, Statics.field270);
        for (int var3 = 0; var3 < field513; var3++) {
            if (var2.equalsIgnoreCase(class200.method1827(field515[var3].field246, Statics.field270)) && (!arg1 || field515[var3].field232 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method1827(Statics.field24.field46, Statics.field270))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cx.dz(Ljava/lang/String;I)Z")
    public static boolean method1828(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method1827(arg0, Statics.field270);
        for (int var2 = 0; var2 < field517; var2++) {
            class8 var3 = field518[var2];
            if (var1.equalsIgnoreCase(class200.method1827(var3.field129, Statics.field270))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method1827(var3.field133, Statics.field270))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("db.dm(Ljava/lang/String;I)V")
    public static final void method2366(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method1827(arg0, Statics.field270);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field517; var2++) {
            class8 var3 = field518[var2];
            String var4 = var3.field129;
            String var5 = class200.method1827(var4, Statics.field270);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field517--;
                for (int var7 = var2; var7 < field517; var7++) {
                    field518[var7] = field518[var7 + 1];
                }
                field457 = field449;
                field386.method2319(246);
                field386.method2051(Statics.method830(arg0));
                field386.method2056(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.dc(Ljava/lang/String;II)V")
    public static final void method99(String arg0, int arg1) {
        field386.method2319(100);
        field386.method2051(Statics.method830(arg0) + 1);
        field386.method2192(arg1);
        field386.method2056(arg0);
    }

    @ObfuscatedName("z.dx(Ljava/lang/String;I)V")
    public static final void method489(String arg0) {
        if (Statics.field533 != null) {
            field386.method2319(254);
            field386.method2051(Statics.method830(arg0));
            field386.method2056(arg0);
        }
    }

    @ObfuscatedName("cl.da(Ljava/lang/String;B)V")
    public static final void method1909(String arg0) {
        if (!arg0.equals("")) {
            field386.method2319(210);
            field386.method2051(Statics.method830(arg0));
            field386.method2056(arg0);
        }
    }

    @ObfuscatedName("l.db(I)V")
    public static final void method66() {
        field386.method2319(210);
        field386.method2051(0);
    }

    @ObfuscatedName("bb.di(II)V")
    public static void method1297(int arg0) {
        for (class179 var1 = (class179) field358.method3096(); var1 != null; var1 = (class179) field358.method3093()) {
            if ((long) arg0 == (var1.field2874 >> 48 & 0xFFFFL)) {
                var1.method3204();
            }
        }
    }

    @ObfuscatedName("bw.dd(Led;B)Led;")
    public static class152 method1037(class152 arg0) {
        int var1 = class156.method3217(Statics.method488(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class152.method1829(arg0.field2532);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("co.dk(Led;II)Ljava/lang/String;")
    public static String method2015(class152 arg0, int arg1) {
        int var2 = Statics.method488(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2569 == null) {
            return null;
        } else if (arg0.field2618 == null || arg0.field2618.length <= arg1 || arg0.field2618[arg1] == null || arg0.field2618[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2618[arg1];
        }
    }

    @ObfuscatedName("x.do(Led;B)Ljava/lang/String;")
    public static String method101(class152 arg0) {
        if (class156.method2617(Statics.method488(arg0)) == 0) {
            return null;
        } else if (arg0.field2587 == null || arg0.field2587.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2587;
        }
    }

    @ObfuscatedName("bj.dj(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1361(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field269 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field269 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field269 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field269 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field269 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field273 + "/";
    }
}

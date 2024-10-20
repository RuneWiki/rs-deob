package deob;

import java.awt.Canvas;
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

    @ObfuscatedName("client.h")
    public static boolean field257 = true;

    @ObfuscatedName("client.v")
    public static int field403 = 1;

    @ObfuscatedName("client.q")
    public static int field259 = 0;

    @ObfuscatedName("client.g")
    public static int field260 = 0;

    @ObfuscatedName("client.e")
    public static boolean field263 = false;

    @ObfuscatedName("client.l")
    public static boolean field520 = false;

    @ObfuscatedName("client.o")
    public static int field265 = 0;

    @ObfuscatedName("client.w")
    public static class197[] field320 = new class197[4];

    @ObfuscatedName("client.z")
    public static int field264 = 0;

    @ObfuscatedName("client.b")
    public static boolean field359 = true;

    @ObfuscatedName("client.a")
    public static int field269 = 0;

    @ObfuscatedName("client.r")
    public static long field270 = 1L;

    @ObfuscatedName("client.f")
    public static int field272 = -1;

    @ObfuscatedName("client.k")
    public static int field445 = -1;

    @ObfuscatedName("client.p")
    public static int field274 = -1;

    @ObfuscatedName("client.n")
    public static boolean field275 = true;

    @ObfuscatedName("client.j")
    public static boolean field310 = false;

    @ObfuscatedName("client.al")
    public static int field277 = 0;

    @ObfuscatedName("client.au")
    public static int field278 = 0;

    @ObfuscatedName("client.az")
    public static int field345 = 0;

    @ObfuscatedName("client.ag")
    public static int field288 = 0;

    @ObfuscatedName("client.aj")
    public static int field281 = 0;

    @ObfuscatedName("client.af")
    public static int field282 = 0;

    @ObfuscatedName("client.am")
    public static int field440 = 0;

    @ObfuscatedName("client.aa")
    public static int field327 = 0;

    @ObfuscatedName("client.ab")
    public static int field285 = 0;

    @ObfuscatedName("client.ai")
    public static class107 field286 = new class107(new byte[5000]);

    @ObfuscatedName("client.ar")
    public static class18 field385 = class18.field530;

    @ObfuscatedName("client.an")
    public static int field289 = 0;

    @ObfuscatedName("client.ay")
    public static int field290 = 0;

    @ObfuscatedName("client.ae")
    public static int field291 = 0;

    @ObfuscatedName("client.bl")
    public static int field294 = 0;

    @ObfuscatedName("client.bh")
    public static int field454 = 0;

    @ObfuscatedName("client.bd")
    public static int field271 = 0;

    @ObfuscatedName("client.be")
    public static int field297 = 0;

    @ObfuscatedName("client.bj")
    public static int field298 = 0;

    @ObfuscatedName("client.bo")
    public static class30[] field299 = new class30[32768];

    @ObfuscatedName("client.by")
    public static int field300 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field301 = new int[32768];

    @ObfuscatedName("client.cb")
    public static class110 field302 = new class110(5000);

    @ObfuscatedName("client.cv")
    public static class110 field303 = new class110(5000);

    @ObfuscatedName("client.ct")
    public static class110 field406 = new class110(5000);

    @ObfuscatedName("client.cq")
    public static int field482 = 0;

    @ObfuscatedName("client.cr")
    public static int field306 = 0;

    @ObfuscatedName("client.ch")
    public static int field307 = 0;

    @ObfuscatedName("client.cd")
    public static int field308 = 0;

    @ObfuscatedName("client.cp")
    public static int field309 = 0;

    @ObfuscatedName("client.cu")
    public static int field391 = 0;

    @ObfuscatedName("client.cf")
    public static int field311 = 0;

    @ObfuscatedName("client.cj")
    public static int field316 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field522 = false;

    @ObfuscatedName("client.cn")
    public static int field314 = 0;

    @ObfuscatedName("client.cw")
    public static int field315 = 0;

    @ObfuscatedName("client.dd")
    public static int field284 = 1;

    @ObfuscatedName("client.dy")
    public static int field375 = 0;

    @ObfuscatedName("client.dm")
    public static int field386 = 1;

    @ObfuscatedName("client.dl")
    public static int field319 = 0;

    @ObfuscatedName("client.dk")
    public static boolean field273 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field418 = new int[4][13][13];

    @ObfuscatedName("client.dn")
    public static final int[] field287 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field324 = 0;

    @ObfuscatedName("client.da")
    public static int field325 = 2;

    @ObfuscatedName("client.dz")
    public static int field326 = 0;

    @ObfuscatedName("client.dc")
    public static int field318 = 2;

    @ObfuscatedName("client.dx")
    public static int field328 = 0;

    @ObfuscatedName("client.dj")
    public static int field329 = 1;

    @ObfuscatedName("client.dr")
    public static int field363 = 0;

    @ObfuscatedName("client.dv")
    public static int field331 = 0;

    @ObfuscatedName("client.db")
    public static int field332 = 2;

    @ObfuscatedName("client.di")
    public static int field333 = 0;

    @ObfuscatedName("client.eo")
    public static int field380 = 1;

    @ObfuscatedName("client.ep")
    public static int field335 = 0;

    @ObfuscatedName("client.ee")
    public static int field336 = 0;

    @ObfuscatedName("client.ed")
    public static int field337 = 2301979;

    @ObfuscatedName("client.et")
    public static int field338 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field339 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field521 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field341 = false;

    @ObfuscatedName("client.fu")
    public static int field342 = 0;

    @ObfuscatedName("client.fv")
    public static int field343 = 128;

    @ObfuscatedName("client.ff")
    public static int field344 = 0;

    @ObfuscatedName("client.fm")
    public static int field487 = 0;

    @ObfuscatedName("client.fc")
    public static int field469 = 0;

    @ObfuscatedName("client.fj")
    public static int field347 = 0;

    @ObfuscatedName("client.fs")
    public static int field441 = 0;

    @ObfuscatedName("client.fo")
    public static int field468 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field295 = false;

    @ObfuscatedName("client.fx")
    public static int field351 = 0;

    @ObfuscatedName("client.fl")
    public static int field352 = 0;

    @ObfuscatedName("client.fg")
    public static int field353 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field354 = new int[field353];

    @ObfuscatedName("client.fi")
    public static int[] field397 = new int[field353];

    @ObfuscatedName("client.fp")
    public static int[] field356 = new int[field353];

    @ObfuscatedName("client.ft")
    public static int[] field357 = new int[field353];

    @ObfuscatedName("client.fh")
    public static int[] field358 = new int[field353];

    @ObfuscatedName("client.fw")
    public static int[] field503 = new int[field353];

    @ObfuscatedName("client.fq")
    public static int[] field360 = new int[field353];

    @ObfuscatedName("client.gg")
    public static String[] field361 = new String[field353];

    @ObfuscatedName("client.gn")
    public static int[][] field362 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field435 = 0;

    @ObfuscatedName("client.gq")
    public static int field364 = -1;

    @ObfuscatedName("client.gy")
    public static int field437 = -1;

    @ObfuscatedName("client.gv")
    public static int field393 = 0;

    @ObfuscatedName("client.gp")
    public static int field350 = 0;

    @ObfuscatedName("client.gt")
    public static int field368 = 0;

    @ObfuscatedName("client.go")
    public static int field349 = 0;

    @ObfuscatedName("client.gi")
    public static int field370 = 0;

    @ObfuscatedName("client.gh")
    public static int field366 = 0;

    @ObfuscatedName("client.gm")
    public static int field372 = 0;

    @ObfuscatedName("client.ge")
    public static int field348 = 0;

    @ObfuscatedName("client.gu")
    public static int field365 = 0;

    @ObfuscatedName("client.gw")
    public static int field317 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field279 = false;

    @ObfuscatedName("client.gz")
    public static int field377 = 0;

    @ObfuscatedName("client.gr")
    public static int field378 = 0;

    @ObfuscatedName("client.gk")
    public static class3[] field379 = new class3[2048];

    @ObfuscatedName("client.gb")
    public static int field305 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field381 = new int[2048];

    @ObfuscatedName("client.hc")
    public static int field258 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field383 = new int[2048];

    @ObfuscatedName("client.hv")
    public static class107[] field384 = new class107[2048];

    @ObfuscatedName("client.hh")
    public static int field490 = -1;

    @ObfuscatedName("client.hz")
    public static int field480 = 0;

    @ObfuscatedName("client.hw")
    public static int field387 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field296 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field389 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field390 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field518 = new boolean[8];

    @ObfuscatedName("client.hm")
    public static int[] field392 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static int field304 = -1;

    @ObfuscatedName("client.hq")
    public static class177[][][] field394 = new class177[4][104][104];

    @ObfuscatedName("client.ht")
    public static class177 field395 = new class177();

    @ObfuscatedName("client.hy")
    public static class177 field396 = new class177();

    @ObfuscatedName("client.hr")
    public static class177 field267 = new class177();

    @ObfuscatedName("client.hu")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field399 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field330 = new int[25];

    @ObfuscatedName("client.ha")
    public static int field401 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field447 = false;

    @ObfuscatedName("client.iq")
    public static int field280 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field404 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field340 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field411 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field460 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field409 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field410 = -1;

    @ObfuscatedName("client.ij")
    public static int field402 = -1;

    @ObfuscatedName("client.is")
    public static int field412 = 0;

    @ObfuscatedName("client.in")
    public static int field369 = 50;

    @ObfuscatedName("client.ir")
    public static int field414 = 0;

    @ObfuscatedName("client.it")
    public static String field415 = null;

    @ObfuscatedName("client.ig")
    public static boolean field416 = false;

    @ObfuscatedName("client.ia")
    public static int field417 = -1;

    @ObfuscatedName("client.ic")
    public static int field413 = -1;

    @ObfuscatedName("client.ju")
    public static String field491 = null;

    @ObfuscatedName("client.jh")
    public static String field420 = null;

    @ObfuscatedName("client.jb")
    public static int field421 = -1;

    @ObfuscatedName("client.ja")
    public static class174 field371 = new class174(8);

    @ObfuscatedName("client.jm")
    public static int field423 = 0;

    @ObfuscatedName("client.jk")
    public static int field424 = 0;

    @ObfuscatedName("client.jt")
    public static class152 field334 = null;

    @ObfuscatedName("client.jv")
    public static int field426 = 0;

    @ObfuscatedName("client.jr")
    public static int field427 = 0;

    @ObfuscatedName("client.jj")
    public static int field428 = 0;

    @ObfuscatedName("client.jl")
    public static int field429 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field419 = false;

    @ObfuscatedName("client.jy")
    public static boolean field431 = false;

    @ObfuscatedName("client.jq")
    public static boolean field432 = false;

    @ObfuscatedName("client.jo")
    public static class152 field433 = null;

    @ObfuscatedName("client.ji")
    public static class152 field434 = null;

    @ObfuscatedName("client.jp")
    public static int field293 = 0;

    @ObfuscatedName("client.jc")
    public static int field436 = 0;

    @ObfuscatedName("client.jx")
    public static class152 field312 = null;

    @ObfuscatedName("client.jw")
    public static boolean field276 = false;

    @ObfuscatedName("client.jg")
    public static int field268 = -1;

    @ObfuscatedName("client.je")
    public static int field388 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field283 = false;

    @ObfuscatedName("client.jd")
    public static int field442 = -1;

    @ObfuscatedName("client.jz")
    public static int field438 = -1;

    @ObfuscatedName("client.ky")
    public static boolean field444 = false;

    @ObfuscatedName("client.kg")
    public static int field439 = 1;

    @ObfuscatedName("client.kq")
    public static int[] field382 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field519 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field448 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field407 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field450 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field451 = 0;

    @ObfuscatedName("client.kf")
    public static int field452 = 0;

    @ObfuscatedName("client.kw")
    public static int field453 = 0;

    @ObfuscatedName("client.ke")
    public static int field515 = 0;

    @ObfuscatedName("client.ka")
    public static int field455 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field456 = new int[2000];

    @ObfuscatedName("client.km")
    public static String[] field457 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field425 = 0;

    @ObfuscatedName("client.kj")
    public static class177 field459 = new class177();

    @ObfuscatedName("client.kz")
    public static class177 field266 = new class177();

    @ObfuscatedName("client.ki")
    public static class177 field461 = new class177();

    @ObfuscatedName("client.ks")
    public static class174 field462 = new class174(512);

    @ObfuscatedName("client.lp")
    public static int field463 = 0;

    @ObfuscatedName("client.lt")
    public static int field464 = -2;

    @ObfuscatedName("client.lo")
    public static boolean[] field465 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field466 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field467 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static int[] field323 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field470 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.li")
    public static int field472 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field473 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lk")
    public static int field474 = 0;

    @ObfuscatedName("client.lf")
    public static int field475 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field476 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field477 = 0;

    @ObfuscatedName("client.lc")
    public static int field478 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field479 = new int[128];

    @ObfuscatedName("client.ly")
    public static int[] field374 = new int[128];

    @ObfuscatedName("client.la")
    public static long field481 = -1L;

    @ObfuscatedName("client.lb")
    public static String field313 = null;

    @ObfuscatedName("client.le")
    public static String field483 = null;

    @ObfuscatedName("client.md")
    public static int field484 = -1;

    @ObfuscatedName("client.mc")
    public static int field485 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field486 = new int[1000];

    @ObfuscatedName("client.me")
    public static int[] field292 = new int[1000];

    @ObfuscatedName("client.ma")
    public static class72[] field488 = new class72[1000];

    @ObfuscatedName("client.mz")
    public static int field489 = 0;

    @ObfuscatedName("client.mx")
    public static int field430 = 0;

    @ObfuscatedName("client.mn")
    public static int field492 = 0;

    @ObfuscatedName("client.mv")
    public static int field256 = 255;

    @ObfuscatedName("client.ml")
    public static int field494 = -1;

    @ObfuscatedName("client.mj")
    public static boolean field495 = false;

    @ObfuscatedName("client.mk")
    public static int field496 = 127;

    @ObfuscatedName("client.my")
    public static int field497 = 127;

    @ObfuscatedName("client.nv")
    public static int field376 = 0;

    @ObfuscatedName("client.ny")
    public static int[] field422 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field501 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field502 = new int[50];

    @ObfuscatedName("client.ns")
    public static class52[] field443 = new class52[50];

    @ObfuscatedName("client.nc")
    public static boolean field504 = false;

    @ObfuscatedName("client.no")
    public static boolean[] field505 = new boolean[5];

    @ObfuscatedName("client.na")
    public static int[] field506 = new int[5];

    @ObfuscatedName("client.np")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.ne")
    public static int[] field508 = new int[5];

    @ObfuscatedName("client.nm")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.nl")
    public static int field510 = 0;

    @ObfuscatedName("client.oo")
    public static int field511 = 0;

    @ObfuscatedName("client.oq")
    public static class16[] field512 = new class16[400];

    @ObfuscatedName("client.ov")
    public static class173 field513 = new class173();

    @ObfuscatedName("client.ot")
    public static int field498 = 0;

    @ObfuscatedName("client.op")
    public static class8[] field400 = new class8[400];

    @ObfuscatedName("client.om")
    public static class157 field516 = new class157();

    @ObfuscatedName("client.os")
    public static int field517 = -1;

    @ObfuscatedName("client.ox")
    public static int field367 = -1;

    @ObfuscatedName("client.v(I)V")
    public final void method175() {
    }

    public final void init() {
        if (!this.method2664()) {
            return;
        }
        class168[] var1 = new class168[] { class168.field2818, class168.field2816, class168.field2819, class168.field2817, class168.field2820, class168.field2814, class168.field2813, class168.field2821, class168.field2815, class168.field2822 };
        class168[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class168 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2823);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2823)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field263 = true;
                        } else {
                            field263 = false;
                        }
                        break;
                    case 2:
                        field259 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field186 = class138.method1623(Integer.parseInt(var5));
                        break;
                    case 4:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 5:
                        class139[] var6 = class139.method3176();
                        int var7 = Integer.parseInt(var5);
                        class139[] var8 = var6;
                        int var9 = 0;
                        class139 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class139 var10 = var8[var9];
                            if (var7 == var10.method464()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field261 = (class139) var11;
                        if (Statics.field261 == class139.field2119) {
                            Statics.field262 = class190.field2898;
                        } else {
                            Statics.field262 = class190.field2890;
                        }
                        break;
                    case 6:
                        field265 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field260 = Integer.parseInt(var5);
                    case 8:
                    default:
                        break;
                    case 9:
                        Statics.field449 = var5;
                        break;
                    case 10:
                        field403 = Integer.parseInt(var5);
                }
            }
        }
        method132();
        Statics.field2665 = this.getCodeBase().getHost();
        String var12 = Statics.field186.field2107;
        byte var13 = 0;
        try {
            class136.method1059("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class135.method2595((String) null, var15);
        }
        Statics.field321 = this;
        this.method2684(765, 503, 57);
    }

    @ObfuscatedName("o.s(S)V")
    public static final void method132() {
        class79.field1372 = false;
        field520 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method253() {
        Statics.field13 = field260 == 0 ? 43594 : field403 + 40000;
        Statics.field2883 = field260 == 0 ? 443 : field403 + 50000;
        Statics.field408 = Statics.field13;
        Statics.field1887 = class153.field2654;
        Statics.field1665 = class153.field2651;
        Statics.field1008 = class153.field2653;
        Statics.field2677 = class153.field2652;
        if (Statics.field1932.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1969[44] = 71;
            class124.field1969[45] = 26;
            class124.field1969[46] = 72;
            class124.field1969[47] = 73;
            class124.field1969[59] = 57;
            class124.field1969[61] = 27;
            class124.field1969[91] = 42;
            class124.field1969[92] = 74;
            class124.field1969[93] = 43;
            class124.field1969[192] = 28;
            class124.field1969[222] = 58;
            class124.field1969[520] = 59;
        } else {
            class124.field1969[186] = 57;
            class124.field1969[187] = 27;
            class124.field1969[188] = 71;
            class124.field1969[189] = 26;
            class124.field1969[190] = 72;
            class124.field1969[191] = 73;
            class124.field1969[192] = 58;
            class124.field1969[219] = 42;
            class124.field1969[220] = 74;
            class124.field1969[221] = 43;
            class124.field1969[222] = 59;
            class124.field1969[223] = 28;
        }
        class124.method2381(Statics.field2018);
        class127.method2432(Statics.field2018);
        class132 var1;
        try {
            var1 = new class132();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field1897 = var1;
        if (Statics.field1897 != null) {
            Statics.field1897.method2454(Statics.field2018);
        }
        Statics.field1104 = new class121(255, class136.field2084, class136.field2087, 500000);
        Statics.field1357 = class9.method2490();
        Statics.field205 = this.getToolkit().getSystemClipboard();
        Statics.method2087(this, Statics.field1988);
        if (field260 != 0) {
            field310 = true;
        }
    }

    @ObfuscatedName("client.u(S)V")
    public final void method170() {
        field269++;
        this.method354();
        class149.method2380();
        class161.method1999();
        method1897();
        class124.method1793();
        class127 var1 = class127.field2004;
        synchronized (class127.field2004) {
            class127.field1994 = class127.field1992;
            class127.field1996 = class127.field1993;
            class127.field1997 = class127.field1990 * -710092011;
            class127.field2002 = class127.field1998;
            class127.field2003 = class127.field1995;
            class127.field1999 = class127.field2000;
            class127.field2005 = class127.field2006;
            class127.field1998 = 0;
        }
        if (Statics.field1897 != null) {
            int var3 = Statics.field1897.method2456();
            field425 = var3;
        }
        if (field264 == 0) {
            method2925();
            class131.method2519();
        } else if (field264 == 5) {
            class28.method2094(this);
            method2925();
            class131.method2519();
        } else if (field264 == 10 || field264 == 11) {
            class28.method2094(this);
        } else if (field264 == 20) {
            class28.method2094(this);
            method3444();
        } else if (field264 == 25) {
            method3181(false);
            field315 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field181.length; var5++) {
                if (Statics.field1296[var5] != -1 && Statics.field181[var5] == null) {
                    Statics.field181[var5] = Statics.field1855.method2811(Statics.field1296[var5], 0);
                    if (Statics.field181[var5] == null) {
                        var4 = false;
                        field315++;
                    }
                }
                if (Statics.field250[var5] != -1 && Statics.field899[var5] == null) {
                    Statics.field899[var5] = Statics.field1855.method2741(Statics.field250[var5], 0, Statics.field180[var5]);
                    if (Statics.field899[var5] == null) {
                        var4 = false;
                        field315++;
                    }
                }
            }
            if (var4) {
                field375 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field181.length; var7++) {
                    byte[] var8 = Statics.field899[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field1121[var7] >> 8) * 64 - Statics.field197;
                        int var10 = (Statics.field1121[var7] & 0xFF) * 64 - Statics.field1905;
                        if (field273) {
                            var9 = 10;
                            var10 = 10;
                        }
                        boolean var12 = true;
                        class107 var13 = new class107(var8);
                        int var14 = -1;
                        label1135: while (true) {
                            int var15 = var13.method2164();
                            if (var15 == 0) {
                                var6 &= var12;
                                break;
                            }
                            var14 += var15;
                            int var16 = 0;
                            boolean var17 = false;
                            while (true) {
                                while (!var17) {
                                    int var19 = var13.method2164();
                                    if (var19 == 0) {
                                        continue label1135;
                                    }
                                    var16 += var19 - 1;
                                    int var20 = var16 & 0x3F;
                                    int var21 = var16 >> 6 & 0x3F;
                                    int var22 = var13.method2151() >> 2;
                                    int var23 = var9 + var21;
                                    int var24 = var10 + var20;
                                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                                        class36 var25 = class36.method565(var14);
                                        if (var22 != 22 || !field520 || var25.field860 != 0 || var25.field858 == 1 || var25.field879) {
                                            if (!var25.method690()) {
                                                field375++;
                                                var12 = false;
                                            }
                                            var17 = true;
                                        }
                                    }
                                }
                                int var18 = var13.method2164();
                                if (var18 == 0) {
                                    break;
                                }
                                var13.method2151();
                            }
                        }
                    }
                }
                if (var6) {
                    if (field319 != 0) {
                        method485(class142.field2150 + class2.field27 + class2.field24 + 100 + "%" + class2.field25, true);
                    }
                    method1897();
                    method2446();
                    method1897();
                    Statics.field176.method1630();
                    method1897();
                    System.gc();
                    for (int var27 = 0; var27 < 4; var27++) {
                        field320[var27].method3501();
                    }
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                class6.field81[var28][var29][var30] = 0;
                            }
                        }
                    }
                    method1897();
                    class6.field82 = 99;
                    Statics.field84 = new byte[4][104][104];
                    Statics.field101 = new byte[4][104][104];
                    Statics.field80 = new byte[4][104][104];
                    Statics.field86 = new byte[4][104][104];
                    Statics.field2513 = new int[4][105][105];
                    Statics.field87 = new byte[4][105][105];
                    Statics.field88 = new int[105][105];
                    Statics.field89 = new int[104];
                    Statics.field1292 = new int[104];
                    Statics.field2962 = new int[104];
                    Statics.field90 = new int[104];
                    Statics.field2037 = new int[104];
                    int var31 = Statics.field181.length;
                    class20.method1321();
                    method3181(true);
                    if (!field273) {
                        for (int var32 = 0; var32 < var31; var32++) {
                            int var33 = (Statics.field1121[var32] >> 8) * 64 - Statics.field197;
                            int var34 = (Statics.field1121[var32] & 0xFF) * 64 - Statics.field1905;
                            byte[] var35 = Statics.field181[var32];
                            if (var35 != null) {
                                method1897();
                                class6.method34(var35, var33, var34, Statics.field61 * 8 - 48, Statics.field1890 * 8 - 48, field320);
                            }
                        }
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var37 = (Statics.field1121[var36] >> 8) * 64 - Statics.field197;
                            int var38 = (Statics.field1121[var36] & 0xFF) * 64 - Statics.field1905;
                            byte[] var39 = Statics.field181[var36];
                            if (var39 == null && Statics.field1890 < 800) {
                                method1897();
                                class6.method580(var37, var38, 64, 64);
                            }
                        }
                        method3181(true);
                        for (int var40 = 0; var40 < var31; var40++) {
                            byte[] var41 = Statics.field899[var40];
                            if (var41 != null) {
                                int var42 = (Statics.field1121[var40] >> 8) * 64 - Statics.field197;
                                int var43 = (Statics.field1121[var40] & 0xFF) * 64 - Statics.field1905;
                                method1897();
                                class6.method570(var41, var42, var43, Statics.field176, field320);
                            }
                        }
                    }
                    if (field273) {
                        int var44 = 0;
                        label1053: while (true) {
                            if (var44 >= 4) {
                                for (int var83 = 0; var83 < 13; var83++) {
                                    for (int var84 = 0; var84 < 13; var84++) {
                                        int var85 = field418[0][var83][var84];
                                        if (var85 == -1) {
                                            class6.method580(var83 * 8, var84 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3181(true);
                                int var86 = 0;
                                while (true) {
                                    if (var86 >= 4) {
                                        break label1053;
                                    }
                                    method1897();
                                    for (int var87 = 0; var87 < 13; var87++) {
                                        for (int var88 = 0; var88 < 13; var88++) {
                                            int var89 = field418[var86][var87][var88];
                                            if (var89 != -1) {
                                                int var90 = var89 >> 24 & 0x3;
                                                int var91 = var89 >> 1 & 0x3;
                                                int var92 = var89 >> 14 & 0x3FF;
                                                int var93 = var89 >> 3 & 0x7FF;
                                                int var94 = (var92 / 8 << 8) + var93 / 8;
                                                for (int var95 = 0; var95 < Statics.field1121.length; var95++) {
                                                    if (Statics.field1121[var95] == var94 && Statics.field899[var95] != null) {
                                                        class6.method6(Statics.field899[var95], var86, var87 * 8, var88 * 8, var90, (var92 & 0x7) * 8, (var93 & 0x7) * 8, var91, Statics.field176, field320);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var86++;
                                }
                            }
                            method1897();
                            for (int var45 = 0; var45 < 13; var45++) {
                                for (int var46 = 0; var46 < 13; var46++) {
                                    boolean var47 = false;
                                    int var48 = field418[var44][var45][var46];
                                    if (var48 != -1) {
                                        int var49 = var48 >> 24 & 0x3;
                                        int var50 = var48 >> 1 & 0x3;
                                        int var51 = var48 >> 14 & 0x3FF;
                                        int var52 = var48 >> 3 & 0x7FF;
                                        int var53 = (var51 / 8 << 8) + var52 / 8;
                                        for (int var54 = 0; var54 < Statics.field1121.length; var54++) {
                                            if (Statics.field1121[var54] == var53 && Statics.field181[var54] != null) {
                                                byte[] var55 = Statics.field181[var54];
                                                int var56 = var45 * 8;
                                                int var57 = var46 * 8;
                                                int var58 = (var51 & 0x7) * 8;
                                                int var59 = (var52 & 0x7) * 8;
                                                class197[] var60 = field320;
                                                for (int var61 = 0; var61 < 8; var61++) {
                                                    for (int var62 = 0; var62 < 8; var62++) {
                                                        if (var56 + var61 > 0 && var56 + var61 < 103 && var57 + var62 > 0 && var57 + var62 < 103) {
                                                            var60[var44].field2957[var56 + var61][var57 + var62] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var63 = new class107(var55);
                                                for (int var64 = 0; var64 < 4; var64++) {
                                                    for (int var65 = 0; var65 < 64; var65++) {
                                                        for (int var66 = 0; var66 < 64; var66++) {
                                                            if (var49 == var64 && var65 >= var58 && var65 < var58 + 8 && var66 >= var59 && var66 < var59 + 8) {
                                                                int var69 = var56 + class155.method486(var65 & 0x7, var66 & 0x7, var50);
                                                                int var71 = var65 & 0x7;
                                                                int var72 = var66 & 0x7;
                                                                int var74 = var50 & 0x3;
                                                                int var75;
                                                                if (var74 == 0) {
                                                                    var75 = var72;
                                                                } else if (var74 == 1) {
                                                                    var75 = 7 - var71;
                                                                } else if (var74 == 2) {
                                                                    var75 = 7 - var72;
                                                                } else {
                                                                    var75 = var71;
                                                                }
                                                                class6.method1877(var63, var44, var69, var57 + var75, 0, 0, var50);
                                                            } else {
                                                                class6.method1877(var63, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var47 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var47) {
                                        int var76 = var44;
                                        int var77 = var45 * 8;
                                        int var78 = var46 * 8;
                                        for (int var79 = 0; var79 < 8; var79++) {
                                            for (int var80 = 0; var80 < 8; var80++) {
                                                class6.field85[var76][var77 + var79][var78 + var80] = 0;
                                            }
                                        }
                                        if (var77 > 0) {
                                            for (int var81 = 1; var81 < 8; var81++) {
                                                class6.field85[var76][var77][var78 + var81] = class6.field85[var76][var77 - 1][var78 + var81];
                                            }
                                        }
                                        if (var78 > 0) {
                                            for (int var82 = 1; var82 < 8; var82++) {
                                                class6.field85[var76][var77 + var82][var78] = class6.field85[var76][var77 + var82][var78 - 1];
                                            }
                                        }
                                        if (var77 > 0 && class6.field85[var76][var77 - 1][var78] != 0) {
                                            class6.field85[var76][var77][var78] = class6.field85[var76][var77 - 1][var78];
                                        } else if (var78 > 0 && class6.field85[var76][var77][var78 - 1] != 0) {
                                            class6.field85[var76][var77][var78] = class6.field85[var76][var77][var78 - 1];
                                        } else if (var77 > 0 && var78 > 0 && class6.field85[var76][var77 - 1][var78 - 1] != 0) {
                                            class6.field85[var76][var77][var78] = class6.field85[var76][var77 - 1][var78 - 1];
                                        }
                                    }
                                }
                            }
                            var44++;
                        }
                    }
                    method3181(true);
                    method2446();
                    method1897();
                    class79 var96 = Statics.field176;
                    class197[] var97 = field320;
                    for (int var98 = 0; var98 < 4; var98++) {
                        for (int var99 = 0; var99 < 104; var99++) {
                            for (int var100 = 0; var100 < 104; var100++) {
                                if ((class6.field81[var98][var99][var100] & 0x1) == 1) {
                                    int var101 = var98;
                                    if ((class6.field81[1][var99][var100] & 0x2) == 2) {
                                        var101 = var98 - 1;
                                    }
                                    if (var101 >= 0) {
                                        var97[var101].method3511(var99, var100);
                                    }
                                }
                            }
                        }
                    }
                    class6.field99 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field99 < -8) {
                        class6.field99 = -8;
                    }
                    if (class6.field99 > 8) {
                        class6.field99 = 8;
                    }
                    class6.field100 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field100 < -16) {
                        class6.field100 = -16;
                    }
                    if (class6.field100 > 16) {
                        class6.field100 = 16;
                    }
                    for (int var102 = 0; var102 < 4; var102++) {
                        byte[][] var103 = Statics.field87[var102];
                        int var104 = (int) Math.sqrt(5100.0D);
                        int var105 = var104 * 768 >> 8;
                        for (int var106 = 1; var106 < 103; var106++) {
                            for (int var107 = 1; var107 < 103; var107++) {
                                int var108 = class6.field85[var102][var107 + 1][var106] - class6.field85[var102][var107 - 1][var106];
                                int var109 = class6.field85[var102][var107][var106 + 1] - class6.field85[var102][var107][var106 - 1];
                                int var110 = (int) Math.sqrt((double) (var109 * var109 + var108 * var108 + 65536));
                                int var111 = (var108 << 8) / var110;
                                int var112 = 65536 / var110;
                                int var113 = (var109 << 8) / var110;
                                int var114 = (var113 * -50 + var111 * -50 + var112 * -10) / var105 + 96;
                                int var115 = (var103[var107][var106] >> 1) + (var103[var107][var106 + 1] >> 3) + (var103[var107][var106 - 1] >> 2) + (var103[var107 - 1][var106] >> 2) + (var103[var107 + 1][var106] >> 3);
                                Statics.field88[var107][var106] = var114 - var115;
                            }
                        }
                        for (int var116 = 0; var116 < 104; var116++) {
                            Statics.field89[var116] = 0;
                            Statics.field1292[var116] = 0;
                            Statics.field2962[var116] = 0;
                            Statics.field90[var116] = 0;
                            Statics.field2037[var116] = 0;
                        }
                        for (int var117 = -5; var117 < 109; var117++) {
                            for (int var118 = 0; var118 < 104; var118++) {
                                int var119 = var117 + 5;
                                int var10002;
                                if (var119 >= 0 && var119 < 104) {
                                    int var120 = Statics.field84[var102][var119][var118] & 0xFF;
                                    if (var120 > 0) {
                                        int var121 = var120 - 1;
                                        class37 var122 = (class37) class37.field893.method3185((long) var121);
                                        class37 var123;
                                        if (var122 == null) {
                                            byte[] var124 = Statics.field900.method2811(1, var121);
                                            class37 var125 = new class37();
                                            if (var124 != null) {
                                                var125.method706(new class107(var124), var121);
                                            }
                                            var125.method697();
                                            class37.field893.method3186(var125, (long) var121);
                                            var123 = var125;
                                        } else {
                                            var123 = var122;
                                        }
                                        Statics.field89[var118] += var123.field895;
                                        Statics.field1292[var118] += var123.field897;
                                        Statics.field2962[var118] += var123.field892;
                                        Statics.field90[var118] += var123.field898;
                                        var10002 = Statics.field2037[var118]++;
                                    }
                                }
                                int var127 = var117 - 5;
                                if (var127 >= 0 && var127 < 104) {
                                    int var128 = Statics.field84[var102][var127][var118] & 0xFF;
                                    if (var128 > 0) {
                                        int var129 = var128 - 1;
                                        class37 var130 = (class37) class37.field893.method3185((long) var129);
                                        class37 var131;
                                        if (var130 == null) {
                                            byte[] var132 = Statics.field900.method2811(1, var129);
                                            class37 var133 = new class37();
                                            if (var132 != null) {
                                                var133.method706(new class107(var132), var129);
                                            }
                                            var133.method697();
                                            class37.field893.method3186(var133, (long) var129);
                                            var131 = var133;
                                        } else {
                                            var131 = var130;
                                        }
                                        Statics.field89[var118] -= var131.field895;
                                        Statics.field1292[var118] -= var131.field897;
                                        Statics.field2962[var118] -= var131.field892;
                                        Statics.field90[var118] -= var131.field898;
                                        var10002 = Statics.field2037[var118]--;
                                    }
                                }
                            }
                            if (var117 >= 1 && var117 < 103) {
                                int var135 = 0;
                                int var136 = 0;
                                int var137 = 0;
                                int var138 = 0;
                                int var139 = 0;
                                for (int var140 = -5; var140 < 109; var140++) {
                                    int var141 = var140 + 5;
                                    if (var141 >= 0 && var141 < 104) {
                                        var135 += Statics.field89[var141];
                                        var136 += Statics.field1292[var141];
                                        var137 += Statics.field2962[var141];
                                        var138 += Statics.field90[var141];
                                        var139 += Statics.field2037[var141];
                                    }
                                    int var142 = var140 - 5;
                                    if (var142 >= 0 && var142 < 104) {
                                        var135 -= Statics.field89[var142];
                                        var136 -= Statics.field1292[var142];
                                        var137 -= Statics.field2962[var142];
                                        var138 -= Statics.field90[var142];
                                        var139 -= Statics.field2037[var142];
                                    }
                                    if (var140 >= 1 && var140 < 103 && (!field520 || (class6.field81[0][var117][var140] & 0x2) != 0 || (class6.field81[var102][var117][var140] & 0x10) == 0 && class6.method116(var102, var117, var140) == field314)) {
                                        if (var102 < class6.field82) {
                                            class6.field82 = var102;
                                        }
                                        int var143 = Statics.field84[var102][var117][var140] & 0xFF;
                                        int var144 = Statics.field101[var102][var117][var140] & 0xFF;
                                        if (var143 > 0 || var144 > 0) {
                                            int var145 = class6.field85[var102][var117][var140];
                                            int var146 = class6.field85[var102][var117 + 1][var140];
                                            int var147 = class6.field85[var102][var117 + 1][var140 + 1];
                                            int var148 = class6.field85[var102][var117][var140 + 1];
                                            int var149 = Statics.field88[var117][var140];
                                            int var150 = Statics.field88[var117 + 1][var140];
                                            int var151 = Statics.field88[var117 + 1][var140 + 1];
                                            int var152 = Statics.field88[var117][var140 + 1];
                                            int var153 = -1;
                                            int var154 = -1;
                                            if (var143 > 0) {
                                                int var155 = var135 * 256 / var138;
                                                int var156 = var136 / var139;
                                                int var157 = var137 / var139;
                                                var153 = class6.method569(var155, var156, var157);
                                                int var158 = class6.field99 + var155 & 0xFF;
                                                int var159 = class6.field100 + var157;
                                                if (var159 < 0) {
                                                    var159 = 0;
                                                } else if (var159 > 255) {
                                                    var159 = 255;
                                                }
                                                var154 = class6.method569(var158, var156, var159);
                                            }
                                            if (var102 > 0) {
                                                boolean var160 = true;
                                                if (var143 == 0 && Statics.field80[var102][var117][var140] != 0) {
                                                    var160 = false;
                                                }
                                                if (var144 > 0 && !class41.method88(var144 - 1).field968) {
                                                    var160 = false;
                                                }
                                                if (var160 && var145 == var146 && var145 == var147 && var145 == var148) {
                                                    Statics.field2513[var102][var117][var140] |= 0x924;
                                                }
                                            }
                                            int var161 = 0;
                                            if (var154 != -1) {
                                                var161 = class84.field1482[class6.method33(var154, 96)];
                                            }
                                            if (var144 == 0) {
                                                var96.method1635(var102, var117, var140, 0, 0, -1, var145, var146, var147, var148, class6.method33(var153, var149), class6.method33(var153, var150), class6.method33(var153, var151), class6.method33(var153, var152), 0, 0, 0, 0, var161, 0);
                                            } else {
                                                int var162 = Statics.field80[var102][var117][var140] + 1;
                                                byte var163 = Statics.field86[var102][var117][var140];
                                                class41 var164 = class41.method88(var144 - 1);
                                                int var165 = var164.field964;
                                                int var166;
                                                int var167;
                                                if (var165 >= 0) {
                                                    var166 = Statics.field1478.method1868(var165);
                                                    var167 = -1;
                                                } else if (var164.field961 == 16711935) {
                                                    var167 = -2;
                                                    var165 = -1;
                                                    var166 = -2;
                                                } else {
                                                    var167 = class6.method569(var164.field965, var164.field966, var164.field967);
                                                    int var168 = class6.field99 + var164.field965 & 0xFF;
                                                    int var169 = class6.field100 + var164.field967;
                                                    if (var169 < 0) {
                                                        var169 = 0;
                                                    } else if (var169 > 255) {
                                                        var169 = 255;
                                                    }
                                                    var166 = class6.method569(var168, var164.field966, var169);
                                                }
                                                int var170 = 0;
                                                if (var166 != -2) {
                                                    var170 = class84.field1482[class6.method2345(var166, 96)];
                                                }
                                                if (var164.field960 != -1) {
                                                    int var171 = class6.field99 + var164.field970 & 0xFF;
                                                    int var172 = class6.field100 + var164.field963;
                                                    if (var172 < 0) {
                                                        var172 = 0;
                                                    } else if (var172 > 255) {
                                                        var172 = 255;
                                                    }
                                                    int var173 = class6.method569(var171, var164.field969, var172);
                                                    var170 = class84.field1482[class6.method2345(var173, 96)];
                                                }
                                                var96.method1635(var102, var117, var140, var162, var163, var165, var145, var146, var147, var148, class6.method33(var153, var149), class6.method33(var153, var150), class6.method33(var153, var151), class6.method33(var153, var152), class6.method2345(var167, var149), class6.method2345(var167, var150), class6.method2345(var167, var151), class6.method2345(var167, var152), var161, var170);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var174 = 1; var174 < 103; var174++) {
                            for (int var175 = 1; var175 < 103; var175++) {
                                var96.method1634(var102, var175, var174, class6.method116(var102, var175, var174));
                            }
                        }
                        Statics.field84[var102] = (byte[][]) null;
                        Statics.field101[var102] = (byte[][]) null;
                        Statics.field80[var102] = (byte[][]) null;
                        Statics.field86[var102] = (byte[][]) null;
                        Statics.field87[var102] = (byte[][]) null;
                    }
                    var96.method1661(-50, -10, -50);
                    for (int var176 = 0; var176 < 104; var176++) {
                        for (int var177 = 0; var177 < 104; var177++) {
                            if ((class6.field81[1][var176][var177] & 0x2) == 2) {
                                var96.method1772(var176, var177);
                            }
                        }
                    }
                    int var178 = 1;
                    int var179 = 2;
                    int var180 = 4;
                    for (int var181 = 0; var181 < 4; var181++) {
                        if (var181 > 0) {
                            var178 <<= 0x3;
                            var179 <<= 0x3;
                            var180 <<= 0x3;
                        }
                        for (int var182 = 0; var182 <= var181; var182++) {
                            for (int var183 = 0; var183 <= 104; var183++) {
                                for (int var184 = 0; var184 <= 104; var184++) {
                                    if ((Statics.field2513[var182][var184][var183] & var178) != 0) {
                                        int var185 = var183;
                                        int var186 = var183;
                                        int var187 = var182;
                                        int var188 = var182;
                                        while (var185 > 0 && (Statics.field2513[var182][var184][var185 - 1] & var178) != 0) {
                                            var185--;
                                        }
                                        while (var186 < 104 && (Statics.field2513[var182][var184][var186 + 1] & var178) != 0) {
                                            var186++;
                                        }
                                        label675: while (var187 > 0) {
                                            for (int var189 = var185; var189 <= var186; var189++) {
                                                if ((Statics.field2513[var187 - 1][var184][var189] & var178) == 0) {
                                                    break label675;
                                                }
                                            }
                                            var187--;
                                        }
                                        label664: while (var188 < var181) {
                                            for (int var190 = var185; var190 <= var186; var190++) {
                                                if ((Statics.field2513[var188 + 1][var184][var190] & var178) == 0) {
                                                    break label664;
                                                }
                                            }
                                            var188++;
                                        }
                                        int var191 = (var188 + 1 - var187) * (var186 - var185 + 1);
                                        if (var191 >= 8) {
                                            short var192 = 240;
                                            int var193 = class6.field85[var188][var184][var185] - var192;
                                            int var194 = class6.field85[var187][var184][var185];
                                            class79.method1656(var181, 1, var184 * 128, var184 * 128, var185 * 128, var186 * 128 + 128, var193, var194);
                                            for (int var195 = var187; var195 <= var188; var195++) {
                                                for (int var196 = var185; var196 <= var186; var196++) {
                                                    Statics.field2513[var195][var184][var196] &= ~var178;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2513[var182][var184][var183] & var179) != 0) {
                                        int var197 = var184;
                                        int var198 = var184;
                                        int var199 = var182;
                                        int var200 = var182;
                                        while (var197 > 0 && (Statics.field2513[var182][var197 - 1][var183] & var179) != 0) {
                                            var197--;
                                        }
                                        while (var198 < 104 && (Statics.field2513[var182][var198 + 1][var183] & var179) != 0) {
                                            var198++;
                                        }
                                        label728: while (var199 > 0) {
                                            for (int var201 = var197; var201 <= var198; var201++) {
                                                if ((Statics.field2513[var199 - 1][var201][var183] & var179) == 0) {
                                                    break label728;
                                                }
                                            }
                                            var199--;
                                        }
                                        label717: while (var200 < var181) {
                                            for (int var202 = var197; var202 <= var198; var202++) {
                                                if ((Statics.field2513[var200 + 1][var202][var183] & var179) == 0) {
                                                    break label717;
                                                }
                                            }
                                            var200++;
                                        }
                                        int var203 = (var200 + 1 - var199) * (var198 - var197 + 1);
                                        if (var203 >= 8) {
                                            short var204 = 240;
                                            int var205 = class6.field85[var200][var197][var183] - var204;
                                            int var206 = class6.field85[var199][var197][var183];
                                            class79.method1656(var181, 2, var197 * 128, var198 * 128 + 128, var183 * 128, var183 * 128, var205, var206);
                                            for (int var207 = var199; var207 <= var200; var207++) {
                                                for (int var208 = var197; var208 <= var198; var208++) {
                                                    Statics.field2513[var207][var208][var183] &= ~var179;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2513[var182][var184][var183] & var180) != 0) {
                                        int var209 = var184;
                                        int var210 = var184;
                                        int var211 = var183;
                                        int var212 = var183;
                                        while (var211 > 0 && (Statics.field2513[var182][var184][var211 - 1] & var180) != 0) {
                                            var211--;
                                        }
                                        while (var212 < 104 && (Statics.field2513[var182][var184][var212 + 1] & var180) != 0) {
                                            var212++;
                                        }
                                        label781: while (var209 > 0) {
                                            for (int var213 = var211; var213 <= var212; var213++) {
                                                if ((Statics.field2513[var182][var209 - 1][var213] & var180) == 0) {
                                                    break label781;
                                                }
                                            }
                                            var209--;
                                        }
                                        label770: while (var210 < 104) {
                                            for (int var214 = var211; var214 <= var212; var214++) {
                                                if ((Statics.field2513[var182][var210 + 1][var214] & var180) == 0) {
                                                    break label770;
                                                }
                                            }
                                            var210++;
                                        }
                                        if ((var210 - var209 + 1) * (var212 - var211 + 1) >= 4) {
                                            int var215 = class6.field85[var182][var209][var211];
                                            class79.method1656(var181, 4, var209 * 128, var210 * 128 + 128, var211 * 128, var212 * 128 + 128, var215, var215);
                                            for (int var216 = var209; var216 <= var210; var216++) {
                                                for (int var217 = var211; var217 <= var212; var217++) {
                                                    Statics.field2513[var182][var216][var217] &= ~var180;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method3181(true);
                    int var218 = class6.field82;
                    if (var218 > Statics.field2643) {
                        var218 = Statics.field2643;
                    }
                    if (var218 < Statics.field2643 - 1) {
                        int var219 = Statics.field2643 - 1;
                    }
                    if (field520) {
                        Statics.field176.method1760(class6.field82);
                    } else {
                        Statics.field176.method1760(0);
                    }
                    for (int var220 = 0; var220 < 104; var220++) {
                        for (int var221 = 0; var221 < 104; var221++) {
                            method151(var220, var221);
                        }
                    }
                    method1897();
                    method2448();
                    class36.field863.method3188();
                    if (Statics.field1657 != null) {
                        field302.method2386(8);
                        field302.method2140(1057001181);
                    }
                    if (!field273) {
                        int var222 = (Statics.field61 - 6) / 8;
                        int var223 = (Statics.field61 + 6) / 8;
                        int var224 = (Statics.field1890 - 6) / 8;
                        int var225 = (Statics.field1890 + 6) / 8;
                        for (int var226 = var222 - 1; var226 <= var223 + 1; var226++) {
                            for (int var227 = var224 - 1; var227 <= var225 + 1; var227++) {
                                if (var226 < var222 || var226 > var223 || var227 < var224 || var227 > var225) {
                                    Statics.field1855.method2760("m" + var226 + "_" + var227);
                                    Statics.field1855.method2760("l" + var226 + "_" + var227);
                                }
                            }
                        }
                    }
                    method131(30);
                    method1897();
                    Statics.method111();
                    field302.method2386(200);
                    class131.method2519();
                } else {
                    field319 = 2;
                }
            } else {
                field319 = 1;
            }
        }
        if (field264 == 30) {
            method1901();
        } else if (field264 == 40 || field264 == 45) {
            method3444();
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method409() {
        boolean var1;
        label244: {
            try {
                if (class161.field2710 == 2) {
                    if (Statics.field1494 == null) {
                        Statics.field1494 = class158.method2985(Statics.field1805, Statics.field1978, Statics.field2714);
                        if (Statics.field1494 == null) {
                            var1 = false;
                            break label244;
                        }
                    }
                    if (Statics.field2716 == null) {
                        Statics.field2716 = new class53(Statics.field2713, Statics.field2712);
                    }
                    if (Statics.field2666.method3072(Statics.field1494, Statics.field2717, Statics.field2716, 22050)) {
                        Statics.field2666.method3073();
                        Statics.field2666.method3070(Statics.field2715);
                        Statics.field2666.method3075(Statics.field1494, Statics.field1822);
                        class161.field2710 = 0;
                        Statics.field1494 = null;
                        Statics.field2716 = null;
                        Statics.field1805 = null;
                        var1 = true;
                        break label244;
                    }
                }
            } catch (Exception var35) {
                var35.printStackTrace();
                Statics.field2666.method3116();
                class161.field2710 = 0;
                Statics.field1494 = null;
                Statics.field2716 = null;
                Statics.field1805 = null;
            }
            var1 = false;
        }
        if (var1 && field495 && Statics.field230 != null) {
            Statics.field230.method997();
        }
        if (field2051) {
            Canvas var4 = Statics.field2018;
            var4.removeKeyListener(class124.field1951);
            var4.removeFocusListener(class124.field1951);
            class124.field1960 = -1;
            Canvas var5 = Statics.field2018;
            var5.removeMouseListener(class127.field2004);
            var5.removeMouseMotionListener(class127.field2004);
            var5.removeFocusListener(class127.field2004);
            class127.field1992 = 0;
            if (Statics.field1897 != null) {
                Statics.field1897.method2459(Statics.field2018);
            }
            this.method2626();
            class124.method2381(Statics.field2018);
            class127.method2432(Statics.field2018);
            if (Statics.field1897 != null) {
                Statics.field1897.method2454(Statics.field2018);
            }
        }
        if (field264 == 0) {
            int var6 = class28.field669;
            String var7 = class28.field670;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field2018.getGraphics();
                if (Statics.field212 == null) {
                    Statics.field212 = new Font("Helvetica", 1, 13);
                    Statics.field2888 = Statics.field2018.getFontMetrics(Statics.field212);
                }
                if (field2049) {
                    field2049 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field849, Statics.field1070);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1105 == null) {
                        Statics.field1105 = Statics.field2018.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1105.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field212);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field2888.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1105, Statics.field849 / 2 - 152, Statics.field1070 / 2 - 18, (ImageObserver) null);
                } catch (Exception var31) {
                    int var12 = Statics.field849 / 2 - 152;
                    int var13 = Statics.field1070 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field212);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field2888.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var32) {
                Statics.field2018.repaint();
            }
        } else if (field264 == 5) {
            Statics.method2721(Statics.field458, Statics.field576);
        } else if (field264 == 10 || field264 == 11) {
            Statics.method2721(Statics.field458, Statics.field576);
        } else if (field264 == 20) {
            Statics.method2721(Statics.field458, Statics.field576);
        } else if (field264 == 25) {
            if (field319 == 1) {
                if (field315 > field284) {
                    field284 = field315;
                }
                int var15 = (field284 * 50 - field315 * 50) / field284;
                method485(class142.field2150 + class2.field27 + class2.field24 + var15 + "%" + class2.field25, false);
            } else if (field319 == 2) {
                if (field375 > field386) {
                    field386 = field375;
                }
                int var16 = (field386 * 50 - field375 * 50) / field386 + 50;
                method485(class142.field2150 + class2.field27 + class2.field24 + var16 + "%" + class2.field25, false);
            } else {
                method485(class142.field2150, false);
            }
        } else if (field264 == 30) {
            if (field421 != -1) {
                int var17 = field421;
                if (class152.method525(var17)) {
                    method137(Statics.field2584[var17], -1);
                }
            }
            for (int var18 = 0; var18 < field463; var18++) {
                if (field465[var18]) {
                    field466[var18] = true;
                }
                field467[var18] = field465[var18];
                field465[var18] = false;
            }
            field464 = field269;
            field410 = -1;
            field402 = -1;
            Statics.field2872 = null;
            if (field421 != -1) {
                field463 = 0;
                method149(field421, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1538();
            if (field447) {
                method476();
            } else if (field410 != -1) {
                int var19 = field410;
                int var20 = field402;
                if (field280 >= 2 || field414 != 0 || field416) {
                    String var21;
                    if (field414 == 1 && field280 < 2) {
                        var21 = class142.field2158 + class142.field2301 + field415 + " " + class2.field26;
                    } else if (field416 && field280 < 2) {
                        var21 = field491 + class142.field2301 + field420 + " " + class2.field26;
                    } else {
                        int var22 = field280 - 1;
                        String var23;
                        if (field409[var22].length() > 0) {
                            var23 = field460[var22] + class142.field2301 + field409[var22];
                        } else {
                            var23 = field460[var22];
                        }
                        var21 = var23;
                    }
                    if (field280 > 2) {
                        var21 = var21 + class2.method741(16777215) + " " + '/' + " " + (field280 - 2) + class142.field2144;
                    }
                    Statics.field458.method3364(var21, var19 + 4, var20 + 15, 16777215, 0, field269 / 1000);
                }
            }
            if (field472 == 3) {
                for (int var24 = 0; var24 < field463; var24++) {
                    if (field467[var24]) {
                        class73.method1544(field323[var24], field499[var24], field470[var24], field471[var24], 16711935, 128);
                    } else if (field466[var24]) {
                        class73.method1544(field323[var24], field499[var24], field470[var24], field471[var24], 16711680, 128);
                    }
                }
            }
            class20.method520(Statics.field2643, Statics.field1667.field744, Statics.field1667.field738, field336);
            field336 = 0;
        } else if (field264 == 40) {
            method485(class142.field2173 + class2.field27 + class142.field2265, false);
        } else if (field264 == 45) {
            method485(class142.field2299, false);
        }
        if (field264 == 30 && field472 == 0 && !field2049) {
            try {
                Graphics var25 = Statics.field2018.getGraphics();
                for (int var26 = 0; var26 < field463; var26++) {
                    if (field466[var26]) {
                        Statics.field1280.method1385(var25, field323[var26], field499[var26], field470[var26], field471[var26]);
                        field466[var26] = false;
                    }
                }
            } catch (Exception var34) {
                Statics.field2018.repaint();
            }
        } else if (field264 > 0) {
            try {
                Graphics var28 = Statics.field2018.getGraphics();
                Statics.field1280.method1355(var28, 0, 0);
                field2049 = false;
                for (int var29 = 0; var29 < field463; var29++) {
                    field466[var29] = false;
                }
            } catch (Exception var33) {
                Statics.field2018.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method172() {
        if (Statics.field446 != null) {
            Statics.field446.field190 = false;
        }
        Statics.field446 = null;
        if (Statics.field204 != null) {
            Statics.field204.method2612();
            Statics.field204 = null;
        }
        class124.method794();
        if (class127.field2004 != null) {
            class127 var1 = class127.field2004;
            synchronized (class127.field2004) {
                class127.field2004 = null;
            }
        }
        Statics.field1897 = null;
        if (Statics.field230 != null) {
            Statics.field230.method1018();
        }
        if (Statics.field635 != null) {
            Statics.field635.method1018();
        }
        class150.method2382();
        Statics.method125();
        try {
            class136.field2084.method3476();
            for (int var3 = 0; var3 < Statics.field528; var3++) {
                Statics.field1892[var3].method3476();
            }
            class136.field2087.method3476();
            class136.field2085.method3476();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("o.e(IS)V")
    public static void method131(int arg0) {
        if (field264 == arg0) {
            return;
        }
        if (field264 == 0) {
            Statics.field1105 = null;
            Statics.field212 = null;
            Statics.field2888 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field454 = 0;
            field271 = 0;
            field297 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2073 != null) {
            Statics.field2073.method2612();
            Statics.field2073 = null;
        }
        if (field264 == 25) {
            field319 = 0;
            field315 = 0;
            field284 = 1;
            field375 = 0;
            field386 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method118(Statics.field2018, Statics.field143, Statics.field1759, true, 0);
        } else if (arg0 == 20) {
            class28.method118(Statics.field2018, Statics.field143, Statics.field1759, true, field264 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method118(Statics.field2018, Statics.field143, Statics.field1759, false, 4);
        } else {
            class28.method3337();
        }
        field264 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method354() {
        if (field264 == 1000) {
            return;
        }
        long var1 = class103.method1055();
        int var3 = (int) (var1 - Statics.field2494);
        Statics.field2494 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2493 += var3;
        boolean var4;
        if (class150.field2503 == 0 && class150.field2498 == 0 && class150.field2501 == 0 && class150.field2495 == 0) {
            var4 = true;
        } else if (Statics.field2492 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2493 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2498 < 20 && class150.field2495 > 0) {
                        class151 var5 = (class151) class150.field2504.method3220();
                        class107 var6 = new class107(4);
                        var6.method2137(1);
                        var6.method2283((int) var5.field2871);
                        Statics.field2492.method2599(var6.field1841, 0, 4);
                        class150.field2500.method3229(var5, var5.field2871);
                        class150.field2495--;
                        class150.field2498++;
                    }
                    while (class150.field2503 < 20 && class150.field2501 > 0) {
                        class151 var7 = (class151) class150.field2499.method3302();
                        class107 var8 = new class107(4);
                        var8.method2137(0);
                        var8.method2283((int) var7.field2871);
                        Statics.field2492.method2599(var8.field1841, 0, 4);
                        var7.method3305();
                        class150.field2502.method3229(var7, var7.field2871);
                        class150.field2501--;
                        class150.field2503++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2492.method2597();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2493 = 0;
                        byte var11 = 0;
                        if (Statics.field620 == null) {
                            var11 = 8;
                        } else if (class150.field2497 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2496.field1837;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2492.method2598(class150.field2496.field1841, class150.field2496.field1837, var12);
                            if (class150.field2508 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2496.field1841[class150.field2496.field1837 + var13] ^= class150.field2508;
                                }
                            }
                            class150.field2496.field1837 += var12;
                            if (class150.field2496.field1837 < var11) {
                                break;
                            }
                            if (Statics.field620 == null) {
                                class150.field2496.field1837 = 0;
                                int var14 = class150.field2496.method2151();
                                int var15 = class150.field2496.method2313();
                                int var16 = class150.field2496.method2151();
                                int var17 = class150.field2496.method2156();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2500.method3218(var18);
                                Statics.field1896 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2502.method3218(var18);
                                    Statics.field1896 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field620 = var20;
                                Statics.field238 = new class107(var17 + var21 + Statics.field620.field2515);
                                Statics.field238.method2137(var16);
                                Statics.field238.method2140(var17);
                                class150.field2497 = 8;
                                class150.field2496.field1837 = 0;
                            } else if (class150.field2497 == 0) {
                                if (class150.field2496.field1841[0] == -1) {
                                    class150.field2497 = 1;
                                    class150.field2496.field1837 = 0;
                                } else {
                                    Statics.field620 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field238.field1841.length - Statics.field620.field2515;
                            int var23 = 512 - class150.field2497;
                            if (var23 > var22 - Statics.field238.field1837) {
                                var23 = var22 - Statics.field238.field1837;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2492.method2598(Statics.field238.field1841, Statics.field238.field1837, var23);
                            if (class150.field2508 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field238.field1841[Statics.field238.field1837 + var24] ^= class150.field2508;
                                }
                            }
                            Statics.field238.field1837 += var23;
                            class150.field2497 += var23;
                            if (Statics.field238.field1837 == var22) {
                                if (Statics.field620.field2871 == 16711935L) {
                                    Statics.field1448 = Statics.field238;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2507[var25];
                                        if (var26 != null) {
                                            Statics.field1448.field1837 = var25 * 8 + 5;
                                            int var27 = Statics.field1448.method2156();
                                            int var28 = Statics.field1448.method2156();
                                            var26.method2825(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2506.reset();
                                    class150.field2506.update(Statics.field238.field1841, 0, var22);
                                    int var29 = (int) class150.field2506.getValue();
                                    if (Statics.field620.field2514 != var29) {
                                        try {
                                            Statics.field2492.method2612();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2509++;
                                        Statics.field2492 = null;
                                        class150.field2508 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2509 = 0;
                                    class150.field2510 = 0;
                                    Statics.field620.field2518.method2826((int) (Statics.field620.field2871 & 0xFFFFL), Statics.field238.field1841, (Statics.field620.field2871 & 0xFF0000L) == 16711680L, Statics.field1896);
                                }
                                Statics.field620.method3334();
                                if (Statics.field1896) {
                                    class150.field2498--;
                                } else {
                                    class150.field2503--;
                                }
                                class150.field2497 = 0;
                                Statics.field620 = null;
                                Statics.field238 = null;
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
                    Statics.field2492.method2612();
                } catch (Exception var34) {
                }
                class150.field2510++;
                Statics.field2492 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method274();
        }
    }

    @ObfuscatedName("client.o(I)V")
    public void method274() {
        if (class150.field2509 >= 4) {
            this.method2630("js5crc");
            field264 = 1000;
            return;
        }
        if (class150.field2510 >= 4) {
            if (field264 <= 5) {
                this.method2630("js5io");
                field264 = 1000;
                return;
            }
            field291 = 3000;
            class150.field2510 = 3;
        }
        if (--field291 + 1 > 0) {
            return;
        }
        try {
            if (field290 == 0) {
                Statics.field9 = Statics.field649.method2497(Statics.field2665, Statics.field408);
                field290++;
            }
            if (field290 == 1) {
                if (Statics.field9.field2060 == 2) {
                    this.method321(-1);
                    return;
                }
                if (Statics.field9.field2060 == 1) {
                    field290++;
                }
            }
            if (field290 == 2) {
                Statics.field1844 = new class130((Socket) Statics.field9.field2064, Statics.field649);
                class107 var1 = new class107(5);
                var1.method2137(15);
                var1.method2140(57);
                Statics.field1844.method2599(var1.field1841, 0, 5);
                field290++;
                Statics.field514 = class103.method1055();
            }
            if (field290 == 3) {
                if (field264 <= 5 || Statics.field1844.method2597() > 0) {
                    int var2 = Statics.field1844.method2596();
                    if (var2 != 0) {
                        this.method321(var2);
                        return;
                    }
                    field290++;
                } else if (class103.method1055() - Statics.field514 > 30000L) {
                    this.method321(-2);
                    return;
                }
            }
            if (field290 == 4) {
                class150.method2708(Statics.field1844, field264 > 20);
                Statics.field9 = null;
                Statics.field1844 = null;
                field290 = 0;
                field294 = 0;
            }
        } catch (IOException var4) {
            this.method321(-3);
        }
    }

    @ObfuscatedName("client.w(IB)V")
    public void method321(int arg0) {
        Statics.field9 = null;
        Statics.field1844 = null;
        field290 = 0;
        if (Statics.field408 == Statics.field13) {
            Statics.field408 = Statics.field2883;
        } else {
            Statics.field408 = Statics.field13;
        }
        field294++;
        if (field294 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field264 <= 5) {
                this.method2630("js5connect_full");
                field264 = 1000;
            } else {
                field291 = 3000;
            }
        } else if (field294 >= 2 && arg0 == 6) {
            this.method2630("js5connect_outofdate");
            field264 = 1000;
        } else if (field294 >= 4) {
            if (field264 <= 5) {
                this.method2630("js5connect");
                field264 = 1000;
            } else {
                field291 = 3000;
            }
        }
    }

    @ObfuscatedName("ey.t(I)V")
    public static void method2925() {
        if (field289 == 0) {
            Statics.field176 = new class79(4, 104, 104, class6.field85);
            for (int var0 = 0; var0 < 4; var0++) {
                field320[var0] = new class197(104, 104);
            }
            Statics.field653 = new class72(512, 512);
            class28.field670 = class142.field2153;
            class28.field669 = 5;
            field289 = 20;
        } else if (field289 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1464[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1665(var1, 500, 800, 512, 334);
            class28.field670 = class142.field2152;
            class28.field669 = 10;
            field289 = 30;
        } else if (field289 == 30) {
            Statics.field956 = method573(0, false, true, true);
            Statics.field33 = method573(1, false, true, true);
            Statics.field654 = method573(2, true, false, true);
            Statics.field724 = method573(3, false, true, true);
            Statics.field166 = method573(4, false, true, true);
            Statics.field1855 = method573(5, true, true, true);
            Statics.field2899 = method573(6, true, true, false);
            Statics.field255 = method573(7, false, true, true);
            Statics.field1759 = method573(8, false, true, true);
            Statics.field1878 = method573(9, false, true, true);
            Statics.field143 = method573(10, false, true, true);
            Statics.field574 = method573(11, false, true, true);
            Statics.field2487 = method573(12, false, true, true);
            Statics.field1809 = method573(13, true, false, true);
            Statics.field1128 = method573(14, false, true, false);
            Statics.field1850 = method573(15, false, true, true);
            class28.field670 = class142.field2159;
            class28.field669 = 20;
            field289 = 40;
        } else if (field289 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field956.method2831() * 4 / 100;
            int var8 = var7 + Statics.field33.method2831() * 4 / 100;
            int var9 = var8 + Statics.field654.method2831() * 2 / 100;
            int var10 = var9 + Statics.field724.method2831() * 2 / 100;
            int var11 = var10 + Statics.field166.method2831() * 6 / 100;
            int var12 = var11 + Statics.field1855.method2831() * 4 / 100;
            int var13 = var12 + Statics.field2899.method2831() * 2 / 100;
            int var14 = var13 + Statics.field255.method2831() * 60 / 100;
            int var15 = var14 + Statics.field1759.method2831() * 2 / 100;
            int var16 = var15 + Statics.field1878.method2831() * 2 / 100;
            int var17 = var16 + Statics.field143.method2831() * 2 / 100;
            int var18 = var17 + Statics.field574.method2831() * 2 / 100;
            int var19 = var18 + Statics.field2487.method2831() * 2 / 100;
            int var20 = var19 + Statics.field1809.method2831() * 2 / 100;
            int var21 = var20 + Statics.field1128.method2831() * 2 / 100;
            int var22 = var21 + Statics.field1850.method2831() * 2 / 100;
            if (var22 == 100) {
                class28.field670 = class142.field2157;
                class28.field669 = 30;
                field289 = 45;
            } else {
                if (var22 != 0) {
                    class28.field670 = class142.field2156 + var22 + "%";
                }
                class28.field669 = 30;
            }
        } else if (field289 == 45) {
            class50.method514(22050, !field520, 2);
            class162 var23 = new class162();
            var23.method3083(9, 128);
            Statics.field230 = class50.method500(Statics.field649, Statics.field2018, 0, 22050);
            Statics.field230.method994(var23);
            class161.method1900(Statics.field1850, Statics.field1128, Statics.field166, var23);
            Statics.field635 = class50.method500(Statics.field649, Statics.field2018, 1, 2048);
            Statics.field1650 = new class49();
            Statics.field635.method994(Statics.field1650);
            Statics.field1801 = new class68(22050, Statics.field1095);
            class28.field670 = class142.field2387;
            class28.field669 = 35;
            field289 = 50;
        } else if (field289 == 50) {
            int var24 = 0;
            if (Statics.field576 == null) {
                Statics.field576 = class70.method1066(Statics.field1759, Statics.field1809, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field1276 == null) {
                Statics.field1276 = class70.method1066(Statics.field1759, Statics.field1809, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field458 == null) {
                Statics.field458 = class70.method1066(Statics.field1759, Statics.field1809, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field670 = class142.field2289 + var24 * 100 / 3 + "%";
                class28.field669 = 40;
            } else {
                Statics.field2092 = new class145(true);
                class28.field670 = class142.field2326;
                class28.field669 = 40;
                field289 = 60;
            }
        } else if (field289 == 60) {
            int var25 = class28.method572(Statics.field143, Statics.field1759);
            int var26 = class28.method490();
            if (var25 < var26) {
                class28.field670 = class142.field2161 + var25 * 100 / var26 + "%";
                class28.field669 = 50;
            } else {
                class28.field670 = class142.field2369;
                class28.field669 = 50;
                method131(5);
                field289 = 70;
            }
        } else if (field289 == 70) {
            if (Statics.field654.method2770()) {
                class41.method2417(Statics.field654);
                class147 var27 = Statics.field654;
                Statics.field900 = var27;
                class147 var28 = Statics.field654;
                class147 var29 = Statics.field255;
                Statics.field944 = var28;
                Statics.field945 = var29;
                Statics.field946 = Statics.field944.method2750(3);
                class147 var30 = Statics.field654;
                class147 var31 = Statics.field255;
                boolean var32 = field520;
                Statics.field841 = var30;
                Statics.field842 = var31;
                class36.field890 = var32;
                class35.method130(Statics.field654, Statics.field255);
                class45.method150(Statics.field654, Statics.field255, field263, Statics.field576);
                class147 var33 = Statics.field654;
                class147 var34 = Statics.field956;
                class147 var35 = Statics.field33;
                Statics.field917 = var33;
                Statics.field905 = var34;
                Statics.field76 = var35;
                class39.method9(Statics.field654, Statics.field255);
                class42.method2844(Statics.field654);
                class147 var36 = Statics.field654;
                Statics.field1063 = var36;
                Statics.field1064 = Statics.field1063.method2750(16);
                class147 var37 = Statics.field724;
                class147 var38 = Statics.field255;
                class147 var39 = Statics.field1759;
                class147 var40 = Statics.field1809;
                Statics.field2522 = var37;
                Statics.field2523 = var38;
                Statics.field2591 = var39;
                Statics.field2525 = var40;
                Statics.field2584 = new class152[Statics.field2522.method2751()][];
                Statics.field2521 = new boolean[Statics.field2522.method2751()];
                class44.method4(Statics.field654);
                class147 var41 = Statics.field654;
                Statics.field995 = var41;
                class28.field670 = class142.field2296;
                class28.field669 = 60;
                field289 = 80;
            } else {
                class28.field670 = class142.field2192 + Statics.field654.method2829() + "%";
                class28.field669 = 60;
            }
        } else if (field289 == 80) {
            int var42 = 0;
            if (Statics.field2657 == null) {
                Statics.field2657 = class70.method824(Statics.field1759, "compass", "");
            } else {
                var42++;
            }
            if (Statics.field1071 == null) {
                Statics.field1071 = class70.method824(Statics.field1759, "mapedge", "");
            } else {
                var42++;
            }
            if (Statics.field131 == null) {
                Statics.field131 = class70.method595(Statics.field1759, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field1840 == null) {
                Statics.field1840 = class70.method602(Statics.field1759, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field989 == null) {
                Statics.field989 = class70.method602(Statics.field1759, "hitmarks", "");
            } else {
                var42++;
            }
            if (Statics.field1295 == null) {
                Statics.field1295 = class70.method602(Statics.field1759, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field30 == null) {
                Statics.field30 = class70.method602(Statics.field1759, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field2885 == null) {
                Statics.field2885 = class70.method602(Statics.field1759, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field1860 == null) {
                Statics.field1860 = class70.method602(Statics.field1759, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field1681 == null) {
                Statics.field1681 = class70.method602(Statics.field1759, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field943 == null) {
                Statics.field943 = class70.method602(Statics.field1759, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field715 == null) {
                Statics.field715 = class70.method595(Statics.field1759, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field2017 == null) {
                Statics.field2017 = class70.method595(Statics.field1759, "mod_icons", "");
            } else {
                var42++;
            }
            if (Statics.field60 == null) {
                Statics.field60 = class70.method156(Statics.field1759, "mapback", "");
            } else {
                var42++;
            }
            if (var42 < 14) {
                class28.field670 = class142.field2359 + var42 * 100 / 14 + "%";
                class28.field669 = 70;
            } else {
                Statics.field2914 = Statics.field2017;
                Statics.field1071.method1445();
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 41.0D) - 20;
                for (int var47 = 0; var47 < Statics.field1840.length; var47++) {
                    Statics.field1840[var47].method1486(var43 + var46, var44 + var46, var45 + var46);
                }
                Statics.field131[0].method1601(var43 + var46, var44 + var46, var45 + var46);
                method516();
                class28.field670 = class142.field2166;
                class28.field669 = 70;
                field289 = 90;
            }
        } else if (field289 == 90) {
            if (Statics.field1878.method2770()) {
                class88 var48 = new class88(Statics.field1878, Statics.field1759, 20, 0.8D, field520 ? 64 : 128);
                class84.method1802(var48);
                class84.method1803(0.8D);
                class28.field670 = class142.field2216;
                class28.field669 = 90;
                field289 = 110;
            } else {
                class28.field670 = class142.field2167 + Statics.field1878.method2829() + "%";
                class28.field669 = 90;
            }
        } else if (field289 == 110) {
            Statics.field446 = new class12();
            Statics.field649.method2498(Statics.field446, 10);
            class28.field670 = class142.field2339;
            class28.field669 = 94;
            field289 = 120;
        } else if (field289 == 120) {
            if (Statics.field143.method2758("huffman", "")) {
                class102 var49 = new class102(Statics.field143.method2757("huffman", ""));
                Statics.field2902 = var49;
                class28.field670 = class142.field2273;
                class28.field669 = 96;
                field289 = 130;
            } else {
                class28.field670 = class142.field2379 + "%";
                class28.field669 = 96;
            }
        } else if (field289 == 130) {
            if (!Statics.field724.method2770()) {
                class28.field670 = class142.field2172 + Statics.field724.method2829() * 4 / 5 + "%";
                class28.field669 = 100;
            } else if (!Statics.field2487.method2770()) {
                class28.field670 = class142.field2172 + (80 + Statics.field2487.method2829() / 6) + "%";
                class28.field669 = 100;
            } else if (Statics.field1809.method2770()) {
                class28.field670 = class142.field2184;
                class28.field669 = 100;
                field289 = 140;
            } else {
                class28.field670 = class142.field2172 + (96 + Statics.field1809.method2829() / 20) + "%";
                class28.field669 = 100;
            }
        } else if (field289 == 140) {
            method131(10);
        }
    }

    @ObfuscatedName("ag.z(IZZZI)Lef;")
    public static class147 method573(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2084 != null) {
            var4 = new class121(arg0, class136.field2084, Statics.field1892[arg0], 1000000);
        }
        return new class147(var4, Statics.field1104, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("n.b(B)V")
    public static void method516() {
        Statics.field957 = new int[33];
        Statics.field2099 = new int[33];
        Statics.field193 = new int[151];
        Statics.field210 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field60.field1333[Statics.field60.field1328 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field957[var0] = var1;
            Statics.field2099[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field60.field1333[Statics.field60.field1328 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field193[var4 - 5] = var5 - 25;
            Statics.field210[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("gh.a(I)V")
    public static final void method3444() {
        try {
            if (field454 == 0) {
                if (Statics.field204 != null) {
                    Statics.field204.method2612();
                    Statics.field204 = null;
                }
                Statics.field1929 = null;
                field522 = false;
                field271 = 0;
                field454 = 1;
            }
            if (field454 == 1) {
                if (Statics.field1929 == null) {
                    Statics.field1929 = Statics.field649.method2497(Statics.field2665, Statics.field408);
                }
                if (Statics.field1929.field2060 == 2) {
                    throw new IOException();
                }
                if (Statics.field1929.field2060 == 1) {
                    Statics.field204 = new class130((Socket) Statics.field1929.field2064, Statics.field649);
                    Statics.field1929 = null;
                    field454 = 2;
                }
            }
            if (field454 == 2) {
                field302.field1837 = 0;
                field302.method2137(14);
                Statics.field204.method2599(field302.field1841, 0, 1);
                field406.field1837 = 0;
                field454 = 3;
            }
            if (field454 == 3) {
                if (Statics.field230 != null) {
                    Statics.field230.method1017();
                }
                if (Statics.field635 != null) {
                    Statics.field635.method1017();
                }
                int var0 = Statics.field204.method2596();
                if (Statics.field230 != null) {
                    Statics.field230.method1017();
                }
                if (Statics.field635 != null) {
                    Statics.field635.method1017();
                }
                if (var0 != 0) {
                    method26(var0);
                    return;
                }
                field406.field1837 = 0;
                field454 = 5;
            }
            if (field454 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field302.field1837 = 0;
                field302.method2137(1);
                field302.method2137(class28.field677.method464());
                field302.method2140(var1[0]);
                field302.method2140(var1[1]);
                field302.method2140(var1[2]);
                field302.method2140(var1[3]);
                switch(class28.field677.field2404) {
                    case 0:
                        field302.field1837 += 8;
                        break;
                    case 1:
                    case 3:
                        field302.method2283(Statics.field587);
                        field302.field1837 += 5;
                        break;
                    case 2:
                        field302.method2140((Integer) Statics.field1357.field158.get(class199.method3177(class28.field675)));
                        field302.field1837 += 4;
                }
                field302.method2148(class28.field676);
                field302.method2169(class5.field78, class5.field71);
                field303.field1837 = 0;
                if (field264 == 40) {
                    field303.method2137(18);
                } else {
                    field303.method2137(16);
                }
                field303.method2235(0);
                int var2 = field303.field1837;
                field303.method2140(57);
                field303.method2145(field302.field1841, 0, field302.field1837);
                int var3 = field303.field1837;
                field303.method2148(class28.field675);
                field303.method2137(field520 ? 1 : 0);
                class110 var4 = field303;
                byte[] var5 = new byte[24];
                try {
                    class136.field2085.method3472(0L);
                    class136.field2085.method3474(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var25) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2145(var5, 0, 24);
                class107 var9 = new class107(Statics.field2092.method2736());
                Statics.field2092.method2726(var9);
                field303.method2145(var9.field1841, 0, var9.field1841.length);
                field303.method2140(Statics.field956.field2458);
                field303.method2140(Statics.field33.field2458);
                field303.method2140(Statics.field654.field2458);
                field303.method2140(Statics.field724.field2458);
                field303.method2140(Statics.field166.field2458);
                field303.method2140(Statics.field1855.field2458);
                field303.method2140(Statics.field2899.field2458);
                field303.method2140(Statics.field255.field2458);
                field303.method2140(Statics.field1759.field2458);
                field303.method2140(Statics.field1878.field2458);
                field303.method2140(Statics.field143.field2458);
                field303.method2140(Statics.field574.field2458);
                field303.method2140(Statics.field2487.field2458);
                field303.method2140(Statics.field1809.field2458);
                field303.method2140(Statics.field1128.field2458);
                field303.method2140(Statics.field1850.field2458);
                field303.method2167(var1, var3, field303.field1837);
                field303.method2147(field303.field1837 - var2);
                Statics.field204.method2599(field303.field1841, 0, field303.field1837);
                field302.method2416(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field406.method2416(var1);
                field454 = 6;
            }
            if (field454 == 6 && Statics.field204.method2597() > 0) {
                int var11 = Statics.field204.method2596();
                if (var11 == 21 && field264 == 20) {
                    field454 = 7;
                } else if (var11 == 2) {
                    field454 = 9;
                } else if (var11 == 15 && field264 == 40) {
                    method1438();
                    return;
                } else if (var11 == 23 && field297 < 1) {
                    field297++;
                    field454 = 0;
                } else {
                    method26(var11);
                    return;
                }
            }
            if (field454 == 7 && Statics.field204.method2597() > 0) {
                field298 = (Statics.field204.method2596() + 3) * 60;
                field454 = 8;
            }
            if (field454 == 8) {
                field271 = 0;
                class28.method2410(class142.field2177, class142.field2178, field298 / 60 + class142.field2281);
                if (--field298 <= 0) {
                    field454 = 0;
                }
            } else {
                if (field454 == 9 && Statics.field204.method2597() >= 13) {
                    boolean var12 = Statics.field204.method2596() == 1;
                    Statics.field204.method2598(field406.field1841, 0, 4);
                    field406.field1837 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field406.method2404() << 24;
                        int var15 = var14 | field406.method2404() << 16;
                        int var16 = var15 | field406.method2404() << 8;
                        int var17 = var16 | field406.method2404();
                        int var18 = class199.method3177(class28.field675);
                        if (Statics.field1357.field158.size() >= 10 && !Statics.field1357.field158.containsKey(var18)) {
                            Iterator var19 = Statics.field1357.field158.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1357.field158.put(var18, var17);
                        class9.method2552();
                    }
                    field428 = Statics.field204.method2596();
                    field419 = Statics.field204.method2596() == 1;
                    field490 = Statics.field204.method2596();
                    field490 <<= 0x8;
                    field490 += Statics.field204.method2596();
                    field480 = Statics.field204.method2596();
                    Statics.field204.method2598(field406.field1841, 0, 1);
                    field406.field1837 = 0;
                    field306 = field406.method2404();
                    Statics.field204.method2598(field406.field1841, 0, 2);
                    field406.field1837 = 0;
                    field482 = field406.method2313();
                    if (field480 == 1) {
                        try {
                            class119.method2464(Statics.field321, "zap");
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            class119.method2464(Statics.field321, "unzap");
                        } catch (Throwable var23) {
                        }
                    }
                    field454 = 10;
                }
                if (field454 != 10) {
                    field271++;
                    if (field271 > 2000) {
                        if (field297 < 1) {
                            if (Statics.field408 == Statics.field13) {
                                Statics.field408 = Statics.field2883;
                            } else {
                                Statics.field408 = Statics.field13;
                            }
                            field297++;
                            field454 = 0;
                        } else {
                            method26(-3);
                        }
                    }
                } else if (Statics.field204.method2597() >= field482) {
                    field406.field1837 = 0;
                    Statics.field204.method2598(field406.field1841, 0, field482);
                    method564();
                    Statics.field61 = -1;
                    method90(false);
                    field306 = -1;
                }
            }
        } catch (IOException var26) {
            if (field297 < 1) {
                if (Statics.field408 == Statics.field13) {
                    Statics.field408 = Statics.field2883;
                } else {
                    Statics.field408 = Statics.field13;
                }
                field297++;
                field454 = 0;
            } else {
                method26(-2);
            }
        }
    }

    @ObfuscatedName("az.r(I)V")
    public static void method564() {
        field270 = 1L;
        field274 = -1;
        Statics.field446.field183 = 0;
        Statics.field579 = true;
        field275 = true;
        field481 = -1L;
        class189.field2886 = new class180();
        field302.field1837 = 0;
        field406.field1837 = 0;
        field306 = -1;
        field391 = -1;
        field311 = -1;
        field316 = -1;
        field307 = 0;
        field277 = 0;
        field309 = 0;
        field278 = 0;
        field280 = 0;
        field447 = false;
        class127.field1991 = 0;
        class10.field165.clear();
        class10.field160.method3238();
        class10.field161.method3276();
        class10.field162 = 0;
        field414 = 0;
        field416 = false;
        field376 = 0;
        field324 = (int) (Math.random() * 100.0D) - 50;
        field326 = (int) (Math.random() * 110.0D) - 55;
        field328 = (int) (Math.random() * 80.0D) - 40;
        field331 = (int) (Math.random() * 120.0D) - 60;
        field333 = (int) (Math.random() * 30.0D) - 20;
        field344 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field492 = 0;
        field484 = -1;
        field489 = 0;
        field430 = 0;
        field385 = class18.field530;
        field305 = 0;
        field300 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field379[var0] = null;
            field384[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field299[var1] = null;
        }
        Statics.field1667 = field379[2047] = new class3();
        field304 = -1;
        field396.method3250();
        field267.method3250();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field394[var2][var3][var4] = null;
                }
            }
        }
        field395 = new class177();
        field511 = 0;
        field510 = 0;
        field498 = 0;
        for (int var5 = 0; var5 < Statics.field1064; var5++) {
            class46 var6 = class46.method2586(var5);
            if (var6 != null) {
                class154.field2659[var5] = 0;
                class154.field2661[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field456.length; var7++) {
            field456[var7] = -1;
        }
        field429 = -1;
        if (field421 != -1) {
            int var8 = field421;
            if (var8 != -1 && Statics.field2521[var8]) {
                Statics.field2522.method2752(var8);
                if (Statics.field2584[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2584[var8].length; var10++) {
                        if (Statics.field2584[var8][var10] != null) {
                            if (Statics.field2584[var8][var10].field2612 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2584[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2584[var8] = null;
                    }
                    Statics.field2521[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field371.method3220(); var11 != null; var11 = (class4) field371.method3221()) {
            method1792(var11, true);
        }
        field421 = -1;
        field371 = new class174(8);
        field334 = null;
        field447 = false;
        field280 = 0;
        field516.method2947((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field390[var12] = null;
            field518[var12] = false;
        }
        class14.field209 = new class174(32);
        field359 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field465[var13] = true;
        }
        field313 = null;
        Statics.field529 = 0;
        Statics.field59 = null;
    }

    @ObfuscatedName("bc.m(B)V")
    public static void method1438() {
        field302.field1837 = 0;
        field406.field1837 = 0;
        field306 = -1;
        field391 = -1;
        field311 = -1;
        field316 = -1;
        field482 = 0;
        field307 = 0;
        field277 = 0;
        field280 = 0;
        field447 = false;
        field492 = 0;
        field489 = 0;
        for (int var0 = 0; var0 < field379.length; var0++) {
            if (field379[var0] != null) {
                field379[var0].field761 = -1;
            }
        }
        for (int var1 = 0; var1 < field299.length; var1++) {
            if (field299[var1] != null) {
                field299[var1].field761 = -1;
            }
        }
        class14.field209 = new class174(32);
        method131(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field465[var2] = true;
        }
    }

    @ObfuscatedName("v.f(II)V")
    public static void method26(int arg0) {
        if (arg0 == -3) {
            class28.method2410(class142.field2180, class142.field2181, class142.field2182);
        } else if (arg0 == -2) {
            class28.method2410(class142.field2380, class142.field2374, class142.field2143);
        } else if (arg0 == -1) {
            class28.method2410(class142.field2186, class142.field2187, class142.field2188);
        } else if (arg0 == 3) {
            class28.method2410(class142.field2189, class142.field2195, class142.field2191);
        } else if (arg0 == 4) {
            class28.method2410(class142.field2236, class142.field2251, class142.field2194);
        } else if (arg0 == 5) {
            class28.method2410(class142.field2349, class142.field2170, class142.field2287);
        } else if (arg0 == 6) {
            class28.method2410(class142.field2198, class142.field2199, class142.field2200);
        } else if (arg0 == 7) {
            class28.method2410(class142.field2168, class142.field2307, class142.field2203);
        } else if (arg0 == 8) {
            class28.method2410(class142.field2247, class142.field2205, class142.field2206);
        } else if (arg0 == 9) {
            class28.method2410(class142.field2207, class142.field2208, class142.field2209);
        } else if (arg0 == 10) {
            class28.method2410(class142.field2210, class142.field2211, class142.field2212);
        } else if (arg0 == 11) {
            class28.method2410(class142.field2213, class142.field2214, class142.field2215);
        } else if (arg0 == 12) {
            class28.method2410(class142.field2288, class142.field2217, class142.field2300);
        } else if (arg0 == 13) {
            class28.method2410(class142.field2219, class142.field2368, class142.field2163);
        } else if (arg0 == 14) {
            class28.method2410(class142.field2222, class142.field2291, class142.field2183);
        } else if (arg0 == 16) {
            class28.method2410(class142.field2225, class142.field2226, class142.field2227);
        } else if (arg0 == 17) {
            class28.method2410(class142.field2228, class142.field2332, class142.field2230);
        } else if (arg0 == 18) {
            class28.method2410(class142.field2231, class142.field2272, class142.field2233);
        } else if (arg0 == 19) {
            class28.method2410(class142.field2234, class142.field2280, class142.field2197);
        } else if (arg0 == 20) {
            class28.method2410(class142.field2304, class142.field2238, class142.field2239);
        } else if (arg0 == 22) {
            class28.method2410(class142.field2347, class142.field2241, class142.field2242);
        } else if (arg0 == 23) {
            class28.method2410(class142.field2243, class142.field2244, class142.field2245);
        } else if (arg0 == 24) {
            class28.method2410(class142.field2271, class142.field2164, class142.field2248);
        } else if (arg0 == 25) {
            class28.method2410(class142.field2218, class142.field2376, class142.field2204);
        } else if (arg0 == 26) {
            class28.method2410(class142.field2252, class142.field2253, class142.field2254);
        } else if (arg0 == 27) {
            class28.method2410(class142.field2255, class142.field2256, class142.field2257);
        } else if (arg0 == 31) {
            class28.method2410(class142.field2264, class142.field2354, class142.field2266);
        } else if (arg0 == 32) {
            class28.method2410(class142.field2331, class142.field2268, class142.field2269);
        } else if (arg0 == 37) {
            class28.method2410(class142.field2270, class142.field2237, class142.field2160);
        } else if (arg0 == 38) {
            class28.method2410(class142.field2267, class142.field2274, class142.field2275);
        } else if (arg0 == 55) {
            class28.method2410(class142.field2276, class142.field2277, class142.field2278);
        } else if (arg0 == 56) {
            class28.method2410(class142.field2279, class142.field2292, class142.field2389);
            method131(11);
            return;
        } else if (arg0 == 57) {
            class28.method2410(class142.field2282, class142.field2141, class142.field2284);
            method131(11);
            return;
        } else {
            class28.method2410(class142.field2240, class142.field2286, class142.field2190);
        }
        method131(10);
    }

    @ObfuscatedName("r.k(I)V")
    public static final void method474() {
        if (Statics.field204 != null) {
            Statics.field204.method2612();
            Statics.field204 = null;
        }
        method2446();
        Statics.field176.method1630();
        for (int var0 = 0; var0 < 4; var0++) {
            field320[var0].method3501();
        }
        System.gc();
        class161.field2710 = 1;
        Statics.field1805 = null;
        Statics.field1978 = -1;
        Statics.field2714 = -1;
        Statics.field2715 = 0;
        Statics.field1822 = false;
        Statics.field68 = 2;
        field494 = -1;
        field495 = false;
        class20.method1321();
        method131(10);
    }

    @ObfuscatedName("dq.p(B)V")
    public static final void method2446() {
        class41.method2563();
        class37.field893.method3188();
        class40.field947.method3188();
        class36.field871.method3188();
        class36.field863.method3188();
        class36.field845.method3188();
        class36.field846.method3188();
        class35.method800();
        class45.field1015.method3188();
        class45.field1016.method3188();
        class45.field1017.method3188();
        class38.field925.method3188();
        class38.field907.method3188();
        class39.method652();
        class42.field977.method3188();
        Statics.method2872();
        class157.field2679.method3188();
        class152.method2101();
        ((class88) Statics.field1478).method1892();
        class19.field540.method3188();
        Statics.field956.method2753();
        Statics.field33.method2753();
        Statics.field724.method2753();
        Statics.field166.method2753();
        Statics.field1855.method2753();
        Statics.field2899.method2753();
        Statics.field255.method2753();
        Statics.field1759.method2753();
        Statics.field1878.method2753();
        Statics.field143.method2753();
        Statics.field574.method2753();
        Statics.field2487.method2753();
    }

    @ObfuscatedName("ab.n(I)V")
    public static final void method634() {
        if (field309 > 0) {
            method474();
        } else {
            method131(40);
            Statics.field2073 = Statics.field204;
            Statics.field204 = null;
        }
    }

    @ObfuscatedName("cj.j(I)V")
    public static final void method1901() {
        if (field277 > 1) {
            field277--;
        }
        if (field309 > 0) {
            field309--;
        }
        if (field522) {
            field522 = false;
            method634();
            return;
        }
        if (!field447) {
            field460[0] = class142.field2377;
            field409[0] = "";
            field340[0] = 1006;
            field280 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field204 == null) {
                var1 = false;
            } else {
                label2608: {
                    try {
                        int var2 = Statics.field204.method2597();
                        if (var2 == 0) {
                            var1 = false;
                            break label2608;
                        }
                        if (field306 == -1) {
                            Statics.field204.method2598(field406.field1841, 0, 1);
                            field406.field1837 = 0;
                            field306 = field406.method2404();
                            field482 = class166.field2806[field306];
                            var2--;
                        }
                        if (field482 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2608;
                            }
                            Statics.field204.method2598(field406.field1841, 0, 1);
                            field482 = field406.field1841[0] & 0xFF;
                            var2--;
                        }
                        if (field482 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2608;
                            }
                            Statics.field204.method2598(field406.field1841, 0, 2);
                            field406.field1837 = 0;
                            field482 = field406.method2313();
                            var2 -= 2;
                        }
                        if (var2 < field482) {
                            var1 = false;
                            break label2608;
                        }
                        field406.field1837 = 0;
                        Statics.field204.method2598(field406.field1841, 0, field482);
                        field307 = 0;
                        field316 = field311;
                        field311 = field391;
                        field391 = field306;
                        if (field306 == 231) {
                            method3336();
                            field427 = field406.method2221();
                            field455 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 90) {
                            int var3 = field406.method2138();
                            int var4 = field406.method2192();
                            class152 var5 = class152.method1027(var4);
                            if (var5.field2563 != 2 || var5.field2564 != var3) {
                                var5.field2563 = 2;
                                var5.field2564 = var3;
                                method465(var5);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 99) {
                            String var6 = field406.method2159();
                            int var7 = field406.method2313();
                            byte var8 = field406.method2152();
                            boolean var9 = false;
                            if (var8 == -128) {
                                var9 = true;
                            }
                            if (var9) {
                                if (Statics.field529 == 0) {
                                    field306 = -1;
                                    var1 = true;
                                    break label2608;
                                }
                                boolean var10 = false;
                                int var11;
                                for (var11 = 0; var11 < Statics.field529 && (!Statics.field59[var11].field578.equals(var6) || Statics.field59[var11].field573 != var7); var11++) {
                                }
                                if (var11 < Statics.field529) {
                                    while (var11 < Statics.field529 - 1) {
                                        Statics.field59[var11] = Statics.field59[var11 + 1];
                                        var11++;
                                    }
                                    Statics.field529--;
                                    Statics.field59[Statics.field529] = null;
                                }
                            } else {
                                field406.method2159();
                                class21 var12 = new class21();
                                var12.field578 = var6;
                                var12.field572 = class200.method575(var12.field578, Statics.field262);
                                var12.field573 = var7;
                                var12.field577 = var8;
                                int var13;
                                for (var13 = Statics.field529 - 1; var13 >= 0; var13--) {
                                    int var14 = Statics.field59[var13].field572.compareTo(var12.field578);
                                    if (var14 == 0) {
                                        Statics.field59[var13].field573 = var7;
                                        Statics.field59[var13].field577 = var8;
                                        if (var6.equals(Statics.field1667.field42)) {
                                            Statics.field558 = var8;
                                        }
                                        field515 = field439;
                                        field306 = -1;
                                        var1 = true;
                                        break label2608;
                                    }
                                    if (var14 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field529 >= Statics.field59.length) {
                                    field306 = -1;
                                    var1 = true;
                                    break label2608;
                                }
                                for (int var15 = Statics.field529 - 1; var15 > var13; var15--) {
                                    Statics.field59[var15 + 1] = Statics.field59[var15];
                                }
                                if (Statics.field529 == 0) {
                                    Statics.field59 = new class21[100];
                                }
                                Statics.field59[var13 + 1] = var12;
                                Statics.field529++;
                                if (var6.equals(Statics.field1667.field42)) {
                                    Statics.field558 = var8;
                                }
                            }
                            field515 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 232) {
                            int var16 = field406.method2193();
                            class152 var17 = class152.method1027(var16);
                            var17.field2563 = 3;
                            var17.field2564 = Statics.field1667.field47.method2954();
                            method465(var17);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 93) {
                            while (field406.field1837 < field482) {
                                int var18 = field406.method2151();
                                boolean var19 = (var18 & 0x1) == 1;
                                String var20 = field406.method2159();
                                String var21 = field406.method2159();
                                field406.method2159();
                                for (int var22 = 0; var22 < field498; var22++) {
                                    class8 var23 = field400[var22];
                                    if (var19) {
                                        if (var21.equals(var23.field138)) {
                                            var23.field138 = var20;
                                            var23.field139 = var21;
                                            var20 = null;
                                            break;
                                        }
                                    } else if (var20.equals(var23.field138)) {
                                        var23.field138 = var20;
                                        var23.field139 = var21;
                                        var20 = null;
                                        break;
                                    }
                                }
                                if (var20 != null && field498 < 400) {
                                    class8 var24 = new class8();
                                    field400[field498] = var24;
                                    var24.field138 = var20;
                                    var24.field139 = var21;
                                    field498++;
                                }
                            }
                            field453 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 25) {
                            int var25 = field406.method2184();
                            int var26 = field406.method2192();
                            class152 var27 = class152.method1027(var26);
                            if (var27.field2563 != 1 || var27.field2564 != var25) {
                                var27.field2563 = 1;
                                var27.field2564 = var25;
                                method465(var27);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 103) {
                            field515 = field439;
                            if (field482 == 0) {
                                field313 = null;
                                field483 = null;
                                Statics.field529 = 0;
                                Statics.field59 = null;
                                field306 = -1;
                                var1 = true;
                            } else {
                                field483 = field406.method2159();
                                long var28 = field406.method2157();
                                field313 = class198.method3050(var28);
                                Statics.field198 = field406.method2152();
                                int var30 = field406.method2151();
                                if (var30 == 255) {
                                    field306 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field529 = var30;
                                    class21[] var31 = new class21[100];
                                    for (int var32 = 0; var32 < Statics.field529; var32++) {
                                        var31[var32] = new class21();
                                        var31[var32].field578 = field406.method2159();
                                        var31[var32].field572 = class200.method575(var31[var32].field578, Statics.field262);
                                        var31[var32].field573 = field406.method2313();
                                        var31[var32].field577 = field406.method2152();
                                        field406.method2159();
                                        if (var31[var32].field578.equals(Statics.field1667.field42)) {
                                            Statics.field558 = var31[var32].field577;
                                        }
                                    }
                                    boolean var33 = false;
                                    int var34 = Statics.field529;
                                    while (var34 > 0) {
                                        boolean var35 = true;
                                        var34--;
                                        for (int var36 = 0; var36 < var34; var36++) {
                                            if (var31[var36].field572.compareTo(var31[var36 + 1].field572) > 0) {
                                                class21 var37 = var31[var36];
                                                var31[var36] = var31[var36 + 1];
                                                var31[var36 + 1] = var37;
                                                var35 = false;
                                            }
                                        }
                                        if (var35) {
                                            break;
                                        }
                                    }
                                    Statics.field59 = var31;
                                    field306 = -1;
                                    var1 = true;
                                }
                            }
                            break label2608;
                        }
                        if (field306 == 52) {
                            int var38 = field406.method2186();
                            int var39 = field406.method2194();
                            int var40 = field406.method2221();
                            class152 var41 = class152.method1027(var39);
                            int var42 = var41.field2538 + var38;
                            int var43 = var41.field2539 + var40;
                            if (var41.field2558 != var42 || var41.field2571 != var43) {
                                var41.field2558 = var42;
                                var41.field2571 = var43;
                                method465(var41);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 95) {
                            int var44 = field406.method2156();
                            class4 var45 = (class4) field371.method3218((long) var44);
                            if (var45 != null) {
                                method1792(var45, true);
                            }
                            if (field334 != null) {
                                method465(field334);
                                field334 = null;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 193) {
                            int var46 = field406.method2151();
                            int var47 = field406.method2193();
                            int var48 = field406.method2184();
                            class4 var49 = (class4) field371.method3218((long) var47);
                            if (var49 != null) {
                                method1792(var49, var49.field67 != var48);
                            }
                            class4 var50 = new class4();
                            var50.field67 = var48;
                            var50.field63 = var46;
                            field371.method3229(var50, (long) var47);
                            method2714(var48);
                            class32.method1987(var48);
                            class152 var51 = class152.method1027(var47);
                            if (var51 != null) {
                                method465(var51);
                            }
                            if (field334 != null) {
                                method465(field334);
                                field334 = null;
                            }
                            method1425();
                            if (field421 != -1) {
                                method27(field421, 1);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 88) {
                            Statics.field704 = field406.method2176();
                            Statics.field137 = field406.method2177();
                            while (field406.field1837 < field482) {
                                field306 = field406.method2151();
                                method582();
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 63) {
                            for (int var52 = 0; var52 < class154.field2661.length; var52++) {
                                if (class154.field2661[var52] != class154.field2659[var52]) {
                                    class154.field2661[var52] = class154.field2659[var52];
                                    method612(var52);
                                    field382[++field519 - 1 & 0x1F] = var52;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 164) {
                            String var53 = field406.method2159();
                            class110 var54 = field406;
                            String var58;
                            try {
                                int var55 = var54.method2164();
                                if (var55 > 32767) {
                                    var55 = 32767;
                                }
                                byte[] var56 = new byte[var55];
                                var54.field1837 += Statics.field2902.method2091(var54.field1841, var54.field1837, var56, 0, var55);
                                String var57 = class201.method3467(var56, 0, var55);
                                var58 = var57;
                            } catch (Exception var405) {
                                var58 = "Cabbage";
                            }
                            String var61 = class192.method3356(Statics.method2722(var58));
                            class10.method566(6, var53, var61);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 219) {
                            field492 = field406.method2151();
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 145) {
                            int var62 = field406.method2138();
                            class14.method515(var62);
                            field448[++field407 - 1 & 0x1F] = var62 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 94) {
                            String var63 = field406.method2159();
                            long var64 = field406.method2157();
                            long var66 = (long) field406.method2313();
                            long var68 = (long) field406.method2336();
                            int var70 = field406.method2151();
                            long var71 = (var66 << 32) + var68;
                            boolean var73 = false;
                            for (int var74 = 0; var74 < 100; var74++) {
                                if (field476[var74] == var71) {
                                    var73 = true;
                                    break;
                                }
                            }
                            if (var70 <= 1 && method85(var63)) {
                                var73 = true;
                            }
                            if (!var73 && field378 == 0) {
                                field476[field477] = var71;
                                field477 = (field477 + 1) % 100;
                                class110 var75 = field406;
                                String var79;
                                try {
                                    int var76 = var75.method2164();
                                    if (var76 > 32767) {
                                        var76 = 32767;
                                    }
                                    byte[] var77 = new byte[var76];
                                    var75.field1837 += Statics.field2902.method2091(var75.field1841, var75.field1837, var77, 0, var76);
                                    String var78 = class201.method3467(var77, 0, var76);
                                    var79 = var78;
                                } catch (Exception var404) {
                                    var79 = "Cabbage";
                                }
                                String var82 = class192.method3356(Statics.method2722(var79));
                                if (var70 == 2 || var70 == 3) {
                                    class10.method50(9, class2.method2085(1) + var63, var82, class198.method1899(var64));
                                } else if (var70 == 1) {
                                    class10.method50(9, class2.method2085(0) + var63, var82, class198.method1899(var64));
                                } else {
                                    class10.method50(9, var63, var82, class198.method1899(var64));
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 39) {
                            int var83 = field482 + field406.field1837;
                            int var84 = field406.method2313();
                            int var85 = field406.method2313();
                            if (field421 != var84) {
                                field421 = var84;
                                method2714(field421);
                                class32.method1987(field421);
                                for (int var86 = 0; var86 < 100; var86++) {
                                    field465[var86] = true;
                                }
                            }
                            while (var85-- > 0) {
                                int var87 = field406.method2156();
                                int var88 = field406.method2313();
                                int var89 = field406.method2151();
                                class4 var90 = (class4) field371.method3218((long) var87);
                                if (var90 != null && var90.field67 != var88) {
                                    method1792(var90, true);
                                    var90 = null;
                                }
                                if (var90 == null) {
                                    class4 var91 = new class4();
                                    var91.field67 = var88;
                                    var91.field63 = var89;
                                    field371.method3229(var91, (long) var87);
                                    method2714(var88);
                                    class32.method1987(var88);
                                    class152 var92 = class152.method1027(var87);
                                    if (var92 != null) {
                                        method465(var92);
                                    }
                                    if (field334 != null) {
                                        method465(field334);
                                        field334 = null;
                                    }
                                    method1425();
                                    if (field421 != -1) {
                                        method27(field421, 1);
                                    }
                                    var90 = var91;
                                }
                                var90.field64 = true;
                            }
                            for (class4 var94 = (class4) field371.method3220(); var94 != null; var94 = (class4) field371.method3221()) {
                                if (var94.field64) {
                                    var94.field64 = false;
                                } else {
                                    method1792(var94, true);
                                }
                            }
                            field462 = new class174(512);
                            while (field406.field1837 < var83) {
                                int var95 = field406.method2156();
                                int var96 = field406.method2313();
                                int var97 = field406.method2313();
                                int var98 = field406.method2156();
                                for (int var99 = var96; var99 <= var97; var99++) {
                                    long var100 = ((long) var95 << 32) + (long) var99;
                                    field462.method3229(new class179(var98), var100);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 113) {
                            int var102 = field406.method2156();
                            Statics.field74 = Statics.field649.method2504(var102);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 181) {
                            int var103 = field406.method2183();
                            field421 = var103;
                            method2714(var103);
                            class32.method1987(field421);
                            for (int var104 = 0; var104 < 100; var104++) {
                                field465[var104] = true;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 96) {
                            String var105 = field406.method2159();
                            long var106 = (long) field406.method2313();
                            long var108 = (long) field406.method2336();
                            int var110 = field406.method2151();
                            long var111 = (var106 << 32) + var108;
                            boolean var113 = false;
                            for (int var114 = 0; var114 < 100; var114++) {
                                if (field476[var114] == var111) {
                                    var113 = true;
                                    break;
                                }
                            }
                            if (method85(var105)) {
                                var113 = true;
                            }
                            if (!var113 && field378 == 0) {
                                field476[field477] = var111;
                                field477 = (field477 + 1) % 100;
                                class110 var115 = field406;
                                String var119;
                                try {
                                    int var116 = var115.method2164();
                                    if (var116 > 32767) {
                                        var116 = 32767;
                                    }
                                    byte[] var117 = new byte[var116];
                                    var115.field1837 += Statics.field2902.method2091(var115.field1841, var115.field1837, var117, 0, var116);
                                    String var118 = class201.method3467(var117, 0, var116);
                                    var119 = var118;
                                } catch (Exception var403) {
                                    var119 = "Cabbage";
                                }
                                String var122 = class192.method3356(Statics.method2722(var119));
                                if (var110 == 2 || var110 == 3) {
                                    class10.method566(7, class2.method2085(1) + var105, var122);
                                } else if (var110 == 1) {
                                    class10.method566(7, class2.method2085(0) + var105, var122);
                                } else {
                                    class10.method566(3, var105, var122);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 16) {
                            field489 = field406.method2151();
                            if (field489 == 255) {
                                field489 = 0;
                            }
                            field430 = field406.method2151();
                            if (field430 == 255) {
                                field430 = 0;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 169) {
                            field504 = true;
                            Statics.field142 = field406.method2151();
                            Statics.field1007 = field406.method2151();
                            Statics.field2074 = field406.method2313();
                            Statics.field1068 = field406.method2151();
                            Statics.field2220 = field406.method2151();
                            if (Statics.field2220 >= 100) {
                                Statics.field2015 = Statics.field142 * 128 + 64;
                                Statics.field1457 = Statics.field1007 * 128 + 64;
                                Statics.field253 = method1628(Statics.field2015, Statics.field1457, Statics.field2643) - Statics.field2074;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 212) {
                            int var123 = field406.method2192();
                            int var124 = field406.method2186();
                            class152 var125 = class152.method1027(var123);
                            if (var125.field2600 != var124 || var124 == -1) {
                                var125.field2600 = var124;
                                var125.field2637 = 0;
                                var125.field2529 = 0;
                                method465(var125);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 221) {
                            int var126 = field406.method2156();
                            int var127 = field406.method2313();
                            int var128 = var127 >> 10 & 0x1F;
                            int var129 = var127 >> 5 & 0x1F;
                            int var130 = var127 & 0x1F;
                            int var131 = (var130 << 3) + (var128 << 19) + (var129 << 11);
                            class152 var132 = class152.method1027(var126);
                            if (var132.field2553 != var131) {
                                var132.field2553 = var131;
                                method465(var132);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 138) {
                            int var133 = field406.method2193();
                            boolean var134 = field406.method2151() == 1;
                            class152 var135 = class152.method1027(var133);
                            if (var135.field2562 != var134) {
                                var135.field2562 = var134;
                                method465(var135);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 4) {
                            int var136 = field406.method2156();
                            int var137 = field406.method2313();
                            if (var136 < -70000) {
                                var137 += 32768;
                            }
                            class152 var138;
                            if (var136 >= 0) {
                                var138 = class152.method1027(var136);
                            } else {
                                var138 = null;
                            }
                            if (var138 != null) {
                                for (int var139 = 0; var139 < var138.field2633.length; var139++) {
                                    var138.field2633[var139] = 0;
                                    var138.field2649[var139] = 0;
                                }
                            }
                            class14.method163(var137);
                            int var140 = field406.method2313();
                            for (int var141 = 0; var141 < var140; var141++) {
                                int var142 = field406.method2176();
                                if (var142 == 255) {
                                    var142 = field406.method2156();
                                }
                                int var143 = field406.method2184();
                                if (var138 != null && var141 < var138.field2633.length) {
                                    var138.field2633[var141] = var143;
                                    var138.field2649[var141] = var142;
                                }
                                class14.method577(var137, var141, var143 - 1, var142);
                            }
                            if (var138 != null) {
                                method465(var138);
                            }
                            method3336();
                            field448[++field407 - 1 & 0x1F] = var137 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 216) {
                            method474();
                            field306 = -1;
                            var1 = false;
                            break label2608;
                        }
                        if (field306 == 197) {
                            method3336();
                            field426 = field406.method2151();
                            field455 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 23) {
                            int var144 = field406.method2138();
                            if (var144 == 65535) {
                                var144 = -1;
                            }
                            int var145 = field406.method2192();
                            int var146 = field406.method2183();
                            if (var146 == 65535) {
                                var146 = -1;
                            }
                            int var147 = field406.method2193();
                            for (int var148 = var144; var148 <= var146; var148++) {
                                long var149 = ((long) var147 << 32) + (long) var148;
                                class186 var151 = field462.method3218(var149);
                                if (var151 != null) {
                                    var151.method3334();
                                }
                                field462.method3229(new class179(var145), var149);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 161 || field306 == 9 || field306 == 215 || field306 == 126 || field306 == 98 || field306 == 147 || field306 == 112 || field306 == 158 || field306 == 81 || field306 == 107) {
                            method582();
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 160) {
                            int var152 = field406.method2193();
                            int var153 = field406.method2183();
                            int var154 = field406.method2313();
                            int var155 = field406.method2313();
                            class152 var156 = class152.method1027(var152);
                            if (var156.field2636 != var153 || var156.field2543 != var155 || var156.field2574 != var154) {
                                var156.field2636 = var153;
                                var156.field2543 = var155;
                                var156.field2574 = var154;
                                method465(var156);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 166) {
                            class22 var157 = new class22();
                            var157.field591 = field406.method2159();
                            var157.field588 = field406.method2313();
                            int var158 = field406.method2156();
                            var157.field580 = var158;
                            method131(45);
                            Statics.field204.method2612();
                            Statics.field204 = null;
                            class28.method2718(var157);
                            field306 = -1;
                            var1 = false;
                            break label2608;
                        }
                        if (field306 == 135) {
                            if (field421 != -1) {
                                method27(field421, 0);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 44) {
                            for (int var159 = 0; var159 < field379.length; var159++) {
                                if (field379[var159] != null) {
                                    field379[var159].field742 = -1;
                                }
                            }
                            for (int var160 = 0; var160 < field299.length; var160++) {
                                if (field299[var160] != null) {
                                    field299[var160].field742 = -1;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 28) {
                            field387 = 0;
                            field258 = 0;
                            method1394();
                            while (field406.method2391(field482) >= 27) {
                                int var161 = field406.method2389(15);
                                if (var161 == 32767) {
                                    break;
                                }
                                boolean var162 = false;
                                if (field299[var161] == null) {
                                    field299[var161] = new class30();
                                    var162 = true;
                                }
                                class30 var163 = field299[var161];
                                field301[++field300 - 1] = var161;
                                var163.field784 = field269;
                                int var164 = field406.method2389(5);
                                if (var164 > 15) {
                                    var164 -= 32;
                                }
                                int var165 = field406.method2389(1);
                                if (var165 == 1) {
                                    field383[++field258 - 1] = var161;
                                }
                                int var166 = field406.method2389(5);
                                if (var166 > 15) {
                                    var166 -= 32;
                                }
                                int var167 = field406.method2389(1);
                                int var168 = field392[field406.method2389(3)];
                                if (var162) {
                                    var163.field760 = var163.field770 = var168;
                                }
                                var163.field705 = class35.method2723(field406.method2389(14));
                                var163.field773 = var163.field705.field812;
                                var163.field788 = var163.field705.field831;
                                if (var163.field788 == 0) {
                                    var163.field770 = 0;
                                }
                                var163.field747 = var163.field705.field814;
                                var163.field746 = var163.field705.field835;
                                var163.field790 = var163.field705.field823;
                                var163.field748 = var163.field705.field803;
                                var163.field762 = var163.field705.field818;
                                var163.field786 = var163.field705.field820;
                                var163.field774 = var163.field705.field813;
                                var163.method596(Statics.field1667.field763[0] + var166, Statics.field1667.field791[0] + var164, var167 == 1);
                            }
                            field406.method2390();
                            for (int var169 = 0; var169 < field258; var169++) {
                                int var170 = field383[var169];
                                class30 var171 = field299[var170];
                                int var172 = field406.method2151();
                                if ((var172 & 0x2) != 0) {
                                    var171.field772 = field406.method2138();
                                    int var173 = field406.method2194();
                                    var171.field776 = var173 >> 16;
                                    var171.field775 = (var173 & 0xFFFF) + field269;
                                    var171.field740 = 0;
                                    var171.field795 = 0;
                                    if (var171.field775 > field269) {
                                        var171.field740 = -1;
                                    }
                                    if (var171.field772 == 65535) {
                                        var171.field772 = -1;
                                    }
                                }
                                if ((var172 & 0x4) != 0) {
                                    int var174 = field406.method2184();
                                    if (var174 == 65535) {
                                        var174 = -1;
                                    }
                                    int var175 = field406.method2151();
                                    if (var171.field742 == var174 && var174 != -1) {
                                        int var176 = class38.method3551(var174).field921;
                                        if (var176 == 1) {
                                            var171.field768 = 0;
                                            var171.field769 = 0;
                                            var171.field767 = var175;
                                            var171.field771 = 0;
                                        }
                                        if (var176 == 2) {
                                            var171.field771 = 0;
                                        }
                                    } else if (var174 == -1 || var171.field742 == -1 || class38.method3551(var174).field915 >= class38.method3551(var171.field742).field915) {
                                        var171.field742 = var174;
                                        var171.field768 = 0;
                                        var171.field769 = 0;
                                        var171.field767 = var175;
                                        var171.field771 = 0;
                                        var171.field794 = var171.field793;
                                    }
                                }
                                if ((var172 & 0x20) != 0) {
                                    var171.field750 = field406.method2159();
                                    var171.field752 = 100;
                                }
                                if ((var172 & 0x40) != 0) {
                                    var171.field777 = field406.method2183();
                                    var171.field780 = field406.method2184();
                                }
                                if ((var172 & 0x8) != 0) {
                                    var171.field705 = class35.method2723(field406.method2138());
                                    var171.field773 = var171.field705.field812;
                                    var171.field788 = var171.field705.field831;
                                    var171.field747 = var171.field705.field814;
                                    var171.field746 = var171.field705.field835;
                                    var171.field790 = var171.field705.field823;
                                    var171.field748 = var171.field705.field803;
                                    var171.field762 = var171.field705.field818;
                                    var171.field786 = var171.field705.field820;
                                    var171.field774 = var171.field705.field813;
                                }
                                if ((var172 & 0x80) != 0) {
                                    int var177 = field406.method2177();
                                    int var178 = field406.method2177();
                                    var171.method605(var177, var178, field269);
                                    var171.field758 = field269 + 300;
                                    var171.field759 = field406.method2183();
                                    var171.field739 = field406.method2184();
                                }
                                if ((var172 & 0x1) != 0) {
                                    int var179 = field406.method2286();
                                    int var180 = field406.method2151();
                                    var171.method605(var179, var180, field269);
                                    var171.field758 = field269 + 300;
                                    var171.field759 = field406.method2138();
                                    var171.field739 = field406.method2184();
                                }
                                if ((var172 & 0x10) != 0) {
                                    var171.field761 = field406.method2184();
                                    if (var171.field761 == 65535) {
                                        var171.field761 = -1;
                                    }
                                }
                            }
                            for (int var181 = 0; var181 < field387; var181++) {
                                int var182 = field296[var181];
                                if (field269 != field299[var182].field784) {
                                    field299[var182].field705 = null;
                                    field299[var182] = null;
                                }
                            }
                            if (field482 != field406.field1837) {
                                throw new RuntimeException(field406.field1837 + class2.field22 + field482);
                            }
                            for (int var183 = 0; var183 < field300; var183++) {
                                if (field299[field301[var183]] == null) {
                                    throw new RuntimeException(var183 + class2.field22 + field300);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 41) {
                            for (int var184 = 0; var184 < Statics.field1064; var184++) {
                                class46 var185 = class46.method2586(var184);
                                if (var185 != null) {
                                    class154.field2659[var184] = 0;
                                    class154.field2661[var184] = 0;
                                }
                            }
                            method3336();
                            field519 += 32;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 82) {
                            int var186 = field406.method2138();
                            int var187 = field406.method2194();
                            class152 var188 = class152.method1027(var187);
                            if (var188 != null && var188.field2612 == 0) {
                                if (var186 > var188.field2547 - var188.field2601) {
                                    var186 = var188.field2547 - var188.field2601;
                                }
                                if (var186 < 0) {
                                    var186 = 0;
                                }
                                if (var188.field2545 != var186) {
                                    var188.field2545 = var186;
                                    method465(var188);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 149) {
                            field278 = field406.method2151();
                            if (field278 == 1) {
                                field345 = field406.method2313();
                            }
                            if (field278 >= 2 && field278 <= 6) {
                                if (field278 == 2) {
                                    field327 = 64;
                                    field285 = 64;
                                }
                                if (field278 == 3) {
                                    field327 = 0;
                                    field285 = 64;
                                }
                                if (field278 == 4) {
                                    field327 = 128;
                                    field285 = 64;
                                }
                                if (field278 == 5) {
                                    field327 = 64;
                                    field285 = 0;
                                }
                                if (field278 == 6) {
                                    field327 = 64;
                                    field285 = 128;
                                }
                                field278 = 2;
                                field281 = field406.method2313();
                                field282 = field406.method2313();
                                field440 = field406.method2151();
                            }
                            if (field278 == 10) {
                                field288 = field406.method2313();
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 79) {
                            int var189 = field406.method2193();
                            class152 var190 = class152.method1027(var189);
                            for (int var191 = 0; var191 < var190.field2633.length; var191++) {
                                var190.field2633[var191] = -1;
                                var190.field2633[var191] = 0;
                            }
                            method465(var190);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 53) {
                            while (field406.field1837 < field482) {
                                boolean var192 = field406.method2151() == 1;
                                String var193 = field406.method2159();
                                String var194 = field406.method2159();
                                int var195 = field406.method2313();
                                int var196 = field406.method2151();
                                int var197 = field406.method2151();
                                boolean var198 = (var197 & 0x2) != 0;
                                boolean var199 = (var197 & 0x1) != 0;
                                if (var195 > 0) {
                                    field406.method2159();
                                    field406.method2151();
                                    field406.method2156();
                                }
                                field406.method2159();
                                for (int var200 = 0; var200 < field510; var200++) {
                                    class16 var201 = field512[var200];
                                    if (var192) {
                                        if (var194.equals(var201.field237)) {
                                            var201.field237 = var193;
                                            var201.field232 = var194;
                                            var193 = null;
                                            break;
                                        }
                                    } else if (var193.equals(var201.field237)) {
                                        if (var201.field233 != var195) {
                                            boolean var202 = true;
                                            for (class34 var203 = (class34) field513.method3208(); var203 != null; var203 = (class34) field513.method3213()) {
                                                if (var203.field800.equals(var193)) {
                                                    if (var195 != 0 && var203.field798 == 0) {
                                                        var203.method3324();
                                                        var202 = false;
                                                    } else if (var195 == 0 && var203.field798 != 0) {
                                                        var203.method3324();
                                                        var202 = false;
                                                    }
                                                }
                                            }
                                            if (var202) {
                                                field513.method3209(new class34(var193, var195));
                                            }
                                            var201.field233 = var195;
                                        }
                                        var201.field232 = var194;
                                        var201.field239 = var196;
                                        var201.field235 = var198;
                                        var201.field231 = var199;
                                        var193 = null;
                                        break;
                                    }
                                }
                                if (var193 != null && field510 < 400) {
                                    class16 var204 = new class16();
                                    field512[field510] = var204;
                                    var204.field237 = var193;
                                    var204.field232 = var194;
                                    var204.field233 = var195;
                                    var204.field239 = var196;
                                    var204.field235 = var198;
                                    var204.field231 = var199;
                                    field510++;
                                }
                            }
                            field511 = 2;
                            field453 = field439;
                            boolean var205 = false;
                            int var206 = field510;
                            while (var206 > 0) {
                                boolean var207 = true;
                                var206--;
                                for (int var208 = 0; var208 < var206; var208++) {
                                    boolean var209 = false;
                                    class16 var210 = field512[var208];
                                    class16 var211 = field512[var208 + 1];
                                    if (field403 != var210.field233 && field403 == var211.field233) {
                                        var209 = true;
                                    }
                                    if (!var209 && var210.field233 == 0 && var211.field233 != 0) {
                                        var209 = true;
                                    }
                                    if (!var209 && !var210.field235 && var211.field235) {
                                        var209 = true;
                                    }
                                    if (!var209 && !var210.field231 && var211.field231) {
                                        var209 = true;
                                    }
                                    if (var209) {
                                        class16 var212 = field512[var208];
                                        field512[var208] = field512[var208 + 1];
                                        field512[var208 + 1] = var212;
                                        var207 = false;
                                    }
                                }
                                if (var207) {
                                    break;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 57) {
                            String var213 = field406.method2159();
                            Object[] var214 = new Object[var213.length() + 1];
                            for (int var215 = var213.length() - 1; var215 >= 0; var215--) {
                                if (var213.charAt(var215) == 's') {
                                    var214[var215 + 1] = field406.method2159();
                                } else {
                                    var214[var215 + 1] = Integer.valueOf(field406.method2156());
                                }
                            }
                            var214[0] = Integer.valueOf(field406.method2156());
                            class1 var216 = new class1();
                            var216.field17 = var214;
                            class32.method3536(var216);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 34) {
                            method134();
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 87) {
                            String var217 = field406.method2159();
                            int var218 = field406.method2176();
                            int var219 = field406.method2177();
                            if (var218 >= 1 && var218 <= 8) {
                                if (var217.equalsIgnoreCase("null")) {
                                    var217 = null;
                                }
                                field390[var218 - 1] = var217;
                                field518[var218 - 1] = var219 == 0;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 111) {
                            int var220 = field406.method2184();
                            int var221 = field406.method2192();
                            class154.field2659[var220] = var221;
                            if (class154.field2661[var220] != var221) {
                                class154.field2661[var220] = var221;
                                method612(var220);
                            }
                            field382[++field519 - 1 & 0x1F] = var220;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 155) {
                            int var222 = field406.method2286();
                            int var223 = field406.method2176();
                            int var224 = field406.method2176();
                            Statics.field2643 = var223 >> 1;
                            Statics.field1667.method596(var224, var222, (var223 & 0x1) == 1);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 182) {
                            class110 var225 = field406;
                            int var226 = field482;
                            class188 var227 = new class188();
                            var227.field2875 = var225.method2151();
                            var227.field2876 = var225.method2156();
                            var227.field2884 = new int[var227.field2875];
                            var227.field2874 = new int[var227.field2875];
                            var227.field2878 = new Field[var227.field2875];
                            var227.field2879 = new int[var227.field2875];
                            var227.field2880 = new Method[var227.field2875];
                            var227.field2881 = new byte[var227.field2875][][];
                            for (int var228 = 0; var228 < var227.field2875; var228++) {
                                try {
                                    int var229 = var225.method2151();
                                    if (var229 == 0 || var229 == 1 || var229 == 2) {
                                        String var230 = var225.method2159();
                                        String var231 = var225.method2159();
                                        int var232 = 0;
                                        if (var229 == 1) {
                                            var232 = var225.method2156();
                                        }
                                        var227.field2884[var228] = var229;
                                        var227.field2879[var228] = var232;
                                        if (class189.method138(var230).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var227.field2878[var228] = class189.method138(var230).getDeclaredField(var231);
                                    } else if (var229 == 3 || var229 == 4) {
                                        String var233 = var225.method2159();
                                        String var234 = var225.method2159();
                                        int var235 = var225.method2151();
                                        String[] var236 = new String[var235];
                                        for (int var237 = 0; var237 < var235; var237++) {
                                            var236[var237] = var225.method2159();
                                        }
                                        String var238 = var225.method2159();
                                        byte[][] var239 = new byte[var235][];
                                        if (var229 == 3) {
                                            for (int var240 = 0; var240 < var235; var240++) {
                                                int var241 = var225.method2156();
                                                var239[var240] = new byte[var241];
                                                var225.method2162(var239[var240], 0, var241);
                                            }
                                        }
                                        var227.field2884[var228] = var229;
                                        Class[] var242 = new Class[var235];
                                        for (int var243 = 0; var243 < var235; var243++) {
                                            var242[var243] = class189.method138(var236[var243]);
                                        }
                                        Class var244 = class189.method138(var238);
                                        if (class189.method138(var233).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var245 = class189.method138(var233).getDeclaredMethods();
                                        Method[] var246 = var245;
                                        for (int var247 = 0; var247 < var246.length; var247++) {
                                            Method var248 = var246[var247];
                                            if (var248.getName().equals(var234)) {
                                                Class[] var249 = var248.getParameterTypes();
                                                if (var242.length == var249.length) {
                                                    boolean var250 = true;
                                                    for (int var251 = 0; var251 < var242.length; var251++) {
                                                        if (var242[var251] != var249[var251]) {
                                                            var250 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var250 && var244 == var248.getReturnType()) {
                                                        var227.field2880[var228] = var248;
                                                    }
                                                }
                                            }
                                        }
                                        var227.field2881[var228] = var239;
                                    }
                                } catch (ClassNotFoundException var407) {
                                    var227.field2874[var228] = -1;
                                } catch (SecurityException var408) {
                                    var227.field2874[var228] = -2;
                                } catch (NullPointerException var409) {
                                    var227.field2874[var228] = -3;
                                } catch (Exception var410) {
                                    var227.field2874[var228] = -4;
                                } catch (Throwable var411) {
                                    var227.field2874[var228] = -5;
                                }
                            }
                            class189.field2886.method3283(var227);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 21) {
                            method3336();
                            int var257 = field406.method2286();
                            int var258 = field406.method2192();
                            int var259 = field406.method2151();
                            field330[var257] = var258;
                            field398[var257] = var259;
                            field399[var257] = 1;
                            for (int var260 = 0; var260 < 98; var260++) {
                                if (var258 >= class140.field2128[var260]) {
                                    field399[var257] = var260 + 2;
                                }
                            }
                            field450[++field451 - 1 & 0x1F] = var257;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 251) {
                            Statics.field704 = field406.method2286();
                            Statics.field137 = field406.method2286();
                            for (int var261 = Statics.field137; var261 < Statics.field137 + 8; var261++) {
                                for (int var262 = Statics.field704; var262 < Statics.field704 + 8; var262++) {
                                    if (field394[Statics.field2643][var261][var262] != null) {
                                        field394[Statics.field2643][var261][var262] = null;
                                        method151(var261, var262);
                                    }
                                }
                            }
                            for (class15 var263 = (class15) field395.method3257(); var263 != null; var263 = (class15) field395.method3249()) {
                                if (var263.field222 >= Statics.field137 && var263.field222 < Statics.field137 + 8 && var263.field223 >= Statics.field704 && var263.field223 < Statics.field704 + 8 && Statics.field2643 == var263.field220) {
                                    var263.field221 = 0;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 51) {
                            method90(false);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 198) {
                            int var264 = field406.method2183();
                            byte var265 = field406.method2178();
                            class154.field2659[var264] = var265;
                            if (class154.field2661[var264] != var265) {
                                class154.field2661[var264] = var265;
                                method612(var264);
                            }
                            field382[++field519 - 1 & 0x1F] = var264;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 119) {
                            int var266 = field406.method2192();
                            int var267 = field406.method2313();
                            if (var267 == 65535) {
                                var267 = -1;
                            }
                            int var268 = field406.method2156();
                            class152 var269 = class152.method1027(var266);
                            if (var269.field2530) {
                                var269.field2635 = var267;
                                var269.field2619 = var268;
                                class45 var271 = class45.method2547(var267);
                                var269.field2636 = var271.field1027;
                                var269.field2543 = var271.field1014;
                                var269.field2537 = var271.field1029;
                                var269.field2541 = var271.field1019;
                                var269.field2570 = var271.field1031;
                                var269.field2574 = var271.field1012;
                                if (var269.field2535 > 0) {
                                    var269.field2574 = var269.field2574 * 32 / var269.field2535;
                                }
                                method465(var269);
                            } else {
                                if (var267 == -1) {
                                    var269.field2563 = 0;
                                    field306 = -1;
                                    var1 = true;
                                    break label2608;
                                }
                                class45 var270 = class45.method2547(var267);
                                var269.field2563 = 4;
                                var269.field2564 = var267;
                                var269.field2636 = var270.field1027;
                                var269.field2543 = var270.field1014;
                                var269.field2574 = var270.field1012 * 100 / var268;
                                method465(var269);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 210) {
                            int var272 = field406.method2151();
                            int var273 = field406.method2151();
                            int var274 = field406.method2151();
                            int var275 = field406.method2151();
                            field505[var272] = true;
                            field506[var272] = var273;
                            field507[var272] = var274;
                            field508[var272] = var275;
                            field509[var272] = 0;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 33) {
                            Statics.field704 = field406.method2151();
                            Statics.field137 = field406.method2177();
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 235) {
                            field474 = field406.method2151();
                            field475 = field406.method2151();
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 173) {
                            int var276 = field406.method2313();
                            int var277 = field406.method2151();
                            int var278 = field406.method2313();
                            method469(var276, var277, var278);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 152) {
                            field406.field1837 += 28;
                            if (field406.method2171()) {
                                class136.method2476(field406, field406.field1837 - 28);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 141) {
                            field511 = 1;
                            field453 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 17) {
                            method90(true);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 248) {
                            int var279 = field406.method2138();
                            int var280 = field406.method2313();
                            int var281 = field406.method2194();
                            class152 var282 = class152.method1027(var281);
                            var282.field2575 = (var280 << 16) + var279;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 150) {
                            field504 = true;
                            Statics.field208 = field406.method2151();
                            Statics.field1668 = field406.method2151();
                            Statics.field1972 = field406.method2313();
                            Statics.field1069 = field406.method2151();
                            Statics.field141 = field406.method2151();
                            if (Statics.field141 >= 100) {
                                int var283 = Statics.field208 * 128 + 64;
                                int var284 = Statics.field1668 * 128 + 64;
                                int var285 = method1628(var283, var284, Statics.field2643) - Statics.field1972;
                                int var286 = var283 - Statics.field2015;
                                int var287 = var285 - Statics.field253;
                                int var288 = var284 - Statics.field1457;
                                int var289 = (int) Math.sqrt((double) (var286 * var286 + var288 * var288));
                                Statics.field2036 = (int) (Math.atan2((double) var287, (double) var289) * 325.949D) & 0x7FF;
                                Statics.field16 = (int) (Math.atan2((double) var286, (double) var288) * -325.949D) & 0x7FF;
                                if (Statics.field2036 < 128) {
                                    Statics.field2036 = 128;
                                }
                                if (Statics.field2036 > 383) {
                                    Statics.field2036 = 383;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 229) {
                            int var290 = field406.method2156();
                            int var291 = field406.method2313();
                            if (var290 < -70000) {
                                var291 += 32768;
                            }
                            class152 var292;
                            if (var290 >= 0) {
                                var292 = class152.method1027(var290);
                            } else {
                                var292 = null;
                            }
                            while (field406.field1837 < field482) {
                                int var293 = field406.method2164();
                                int var294 = field406.method2313();
                                int var295 = 0;
                                if (var294 != 0) {
                                    var295 = field406.method2151();
                                    if (var295 == 255) {
                                        var295 = field406.method2156();
                                    }
                                }
                                if (var292 != null && var293 >= 0 && var293 < var292.field2633.length) {
                                    var292.field2633[var293] = var294;
                                    var292.field2649[var293] = var295;
                                }
                                class14.method577(var291, var293, var294 - 1, var295);
                            }
                            if (var292 != null) {
                                method465(var292);
                            }
                            method3336();
                            field448[++field407 - 1 & 0x1F] = var291 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 208) {
                            int var296 = field406.method2164();
                            boolean var297 = field406.method2151() == 1;
                            String var298 = "";
                            boolean var299 = false;
                            if (var297) {
                                var298 = field406.method2159();
                                if (method85(var298)) {
                                    var299 = true;
                                }
                            }
                            String var300 = field406.method2159();
                            if (!var299) {
                                class10.method566(var296, var298, var300);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 32) {
                            int var301 = field406.method2193();
                            String var302 = field406.method2159();
                            class152 var303 = class152.method1027(var301);
                            if (!var302.equals(var303.field2578)) {
                                var303.field2578 = var302;
                                method465(var303);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 76) {
                            field277 = field406.method2313() * 30;
                            field455 = field439;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 222) {
                            int var304 = field406.method2151();
                            class117[] var305 = class117.method2720();
                            int var306 = 0;
                            class117 var308;
                            while (true) {
                                if (var306 >= var305.length) {
                                    var308 = null;
                                    break;
                                }
                                class117 var307 = var305[var306];
                                if (var307.field1904 == var304) {
                                    var308 = var307;
                                    break;
                                }
                                var306++;
                            }
                            Statics.field570 = var308;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 100) {
                            field504 = false;
                            for (int var309 = 0; var309 < 5; var309++) {
                                field505[var309] = false;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 40) {
                            int var310 = field406.method2184();
                            if (var310 == 65535) {
                                var310 = -1;
                            }
                            if (var310 == -1 && !field495) {
                                class161.method1028();
                            } else if (var310 != -1 && field494 != var310 && field256 != 0 && !field495) {
                                class147 var311 = Statics.field2899;
                                int var312 = field256;
                                class161.field2710 = 1;
                                Statics.field1805 = var311;
                                Statics.field1978 = var310;
                                Statics.field2714 = 0;
                                Statics.field2715 = var312;
                                Statics.field1822 = false;
                                Statics.field68 = 2;
                            }
                            field494 = var310;
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        if (field306 == 185) {
                            int var313 = field406.method2184();
                            if (var313 == 65535) {
                                var313 = -1;
                            }
                            int var314 = field406.method2188();
                            method165(var313, var314);
                            field306 = -1;
                            var1 = true;
                            break label2608;
                        }
                        class135.method2595("" + field306 + class2.field22 + field311 + class2.field22 + field316 + class2.field22 + field482, (Throwable) null);
                        method474();
                    } catch (IOException var412) {
                        method634();
                    } catch (Exception var413) {
                        String var317 = "" + field306 + class2.field22 + field311 + class2.field22 + field316 + class2.field22 + field482 + class2.field22 + (Statics.field197 + Statics.field1667.field763[0]) + class2.field22 + (Statics.field1905 + Statics.field1667.field791[0]) + class2.field22;
                        for (int var318 = 0; var318 < field482 && var318 < 50; var318++) {
                            var317 = var317 + field406.field1841[var318] + class2.field22;
                        }
                        class135.method2595(var317, var413);
                        method474();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field264 != 30) {
            return;
        }
        while (true) {
            class188 var319 = (class188) class189.field2886.method3284();
            boolean var320;
            if (var319 == null) {
                var320 = false;
            } else {
                var320 = true;
            }
            if (!var320) {
                Object var322 = Statics.field446.field187;
                synchronized (Statics.field446.field187) {
                    if (!field257) {
                        Statics.field446.field183 = 0;
                    } else if (class127.field2002 != 0 || Statics.field446.field183 >= 40) {
                        field302.method2386(252);
                        field302.method2137(0);
                        int var323 = field302.field1837;
                        int var324 = 0;
                        for (int var325 = 0; var325 < Statics.field446.field183 && field302.field1837 - var323 < 240; var325++) {
                            var324++;
                            int var326 = Statics.field446.field185[var325];
                            if (var326 < 0) {
                                var326 = 0;
                            } else if (var326 > 502) {
                                var326 = 502;
                            }
                            int var327 = Statics.field446.field184[var325];
                            if (var327 < 0) {
                                var327 = 0;
                            } else if (var327 > 764) {
                                var327 = 764;
                            }
                            int var328 = var326 * 765 + var327;
                            if (Statics.field446.field185[var325] == -1 && Statics.field446.field184[var325] == -1) {
                                var327 = -1;
                                var326 = -1;
                                var328 = 524287;
                            }
                            if (field272 != var327 || field445 != var326) {
                                int var329 = var327 - field272;
                                field272 = var327;
                                int var330 = var326 - field445;
                                field445 = var326;
                                if (field274 < 8 && var329 >= -32 && var329 <= 31 && var330 >= -32 && var330 <= 31) {
                                    var329 += 32;
                                    var330 += 32;
                                    field302.method2235((field274 << 12) + (var329 << 6) + var330);
                                    field274 = 0;
                                } else if (field274 < 8) {
                                    field302.method2283((field274 << 19) + 8388608 + var328);
                                    field274 = 0;
                                } else {
                                    field302.method2140((field274 << 19) + -1073741824 + var328);
                                    field274 = 0;
                                }
                            } else if (field274 < 2047) {
                                field274++;
                            }
                        }
                        field302.method2275(field302.field1837 - var323);
                        if (var324 >= Statics.field446.field183) {
                            Statics.field446.field183 = 0;
                        } else {
                            Statics.field446.field183 -= var324;
                            for (int var331 = 0; var331 < Statics.field446.field183; var331++) {
                                Statics.field446.field184[var331] = Statics.field446.field184[var324 + var331];
                                Statics.field446.field185[var331] = Statics.field446.field185[var324 + var331];
                            }
                        }
                    }
                }
                if (class127.field2002 == 1 || !Statics.field346 && class127.field2002 == 4 || class127.field2002 == 2) {
                    long var333 = (class127.field2005 - field270 * -1L) / 50L;
                    if (var333 > 4095L) {
                        var333 = 4095L;
                    }
                    field270 = class127.field2005 * -1L;
                    int var335 = class127.field1999;
                    if (var335 < 0) {
                        var335 = 0;
                    } else if (var335 > 502) {
                        var335 = 502;
                    }
                    int var336 = class127.field2003;
                    if (var336 < 0) {
                        var336 = 0;
                    } else if (var336 > 764) {
                        var336 = 764;
                    }
                    int var337 = var335 * 765 + var336;
                    byte var338 = 0;
                    if (class127.field2002 == 2) {
                        var338 = 1;
                    }
                    int var339 = (int) var333;
                    field302.method2386(90);
                    field302.method2140((var338 << 19) + (var339 << 20) + var337);
                }
                if (class124.field1964 > 0) {
                    field302.method2386(100);
                    field302.method2235(0);
                    int var340 = field302.field1837;
                    long var341 = class103.method1055();
                    for (int var343 = 0; var343 < class124.field1964; var343++) {
                        long var344 = var341 - field481;
                        if (var344 > 16777215L) {
                            var344 = 16777215L;
                        }
                        field481 = var341;
                        field302.method2137(class124.field1970[var343]);
                        field302.method2227((int) var344);
                    }
                    field302.method2147(field302.field1837 - var340);
                }
                if (field468 > 0) {
                    field468--;
                }
                if (class124.field1947[96] || class124.field1947[97] || class124.field1947[98] || class124.field1947[99]) {
                    field295 = true;
                }
                if (field295 && field468 <= 0) {
                    field468 = 20;
                    field295 = false;
                    field302.method2386(0);
                    field302.method2181(field344);
                    field302.method2180(field343);
                }
                if (Statics.field579 && !field275) {
                    field275 = true;
                    field302.method2386(68);
                    field302.method2137(1);
                }
                if (!Statics.field579 && field275) {
                    field275 = false;
                    field302.method2386(68);
                    field302.method2137(0);
                }
                method117();
                if (field264 != 30) {
                    return;
                }
                method2469();
                method2686();
                field307++;
                if (field307 > 750) {
                    method634();
                    return;
                }
                for (int var346 = -1; var346 < field305; var346++) {
                    int var347;
                    if (var346 == -1) {
                        var347 = 2047;
                    } else {
                        var347 = field381[var346];
                    }
                    class3 var348 = field379[var347];
                    if (var348 != null) {
                        method2521(var348, 1);
                    }
                }
                for (int var349 = 0; var349 < field300; var349++) {
                    int var350 = field301[var349];
                    class30 var351 = field299[var350];
                    if (var351 != null) {
                        method2521(var351, var351.field705.field812);
                    }
                }
                for (int var352 = -1; var352 < field305; var352++) {
                    int var353;
                    if (var352 == -1) {
                        var353 = 2047;
                    } else {
                        var353 = field381[var352];
                    }
                    class3 var354 = field379[var353];
                    if (var354 != null && var354.field752 > 0) {
                        var354.field752--;
                        if (var354.field752 == 0) {
                            var354.field750 = null;
                        }
                    }
                }
                for (int var355 = 0; var355 < field300; var355++) {
                    int var356 = field301[var355];
                    class30 var357 = field299[var356];
                    if (var357 != null && var357.field752 > 0) {
                        var357.field752--;
                        if (var357.field752 == 0) {
                            var357.field750 = null;
                        }
                    }
                }
                field336++;
                if (field349 != 0) {
                    field368 += 20;
                    if (field368 >= 400) {
                        field349 = 0;
                    }
                }
                if (Statics.field656 != null) {
                    field370++;
                    if (field370 >= 15) {
                        method465(Statics.field656);
                        Statics.field656 = null;
                    }
                }
                class152 var358 = Statics.field844;
                class152 var359 = Statics.field73;
                Statics.field844 = null;
                Statics.field73 = null;
                field312 = null;
                field283 = false;
                field276 = false;
                field478 = 0;
                while (class124.method708() && field478 < 128) {
                    if (field428 >= 2 && class124.field1947[82] && Statics.field2409 == 66) {
                        String var360 = class10.method649();
                        Statics.field205.setContents(new StringSelection(var360), (ClipboardOwner) null);
                    } else {
                        field374[field478] = Statics.field2409;
                        field479[field478] = Statics.field1059;
                        field478++;
                    }
                }
                method524(field421, 0, 0, 765, 503, 0, 0);
                field439++;
                while (true) {
                    class1 var361;
                    class152 var362;
                    class152 var363;
                    do {
                        var361 = (class1) field266.method3264();
                        if (var361 == null) {
                            while (true) {
                                class1 var364;
                                class152 var365;
                                class152 var366;
                                do {
                                    var364 = (class1) field461.method3264();
                                    if (var364 == null) {
                                        while (true) {
                                            class1 var367;
                                            class152 var368;
                                            class152 var369;
                                            do {
                                                var367 = (class1) field459.method3264();
                                                if (var367 == null) {
                                                    method2724();
                                                    if (field433 != null) {
                                                        method503();
                                                    }
                                                    if (Statics.field974 != null) {
                                                        method465(Statics.field974);
                                                        field377++;
                                                        if (class127.field1994 == 0) {
                                                            if (field279) {
                                                                if (Statics.field974 == Statics.field2872 && field372 != field317) {
                                                                    class152 var370 = Statics.field974;
                                                                    byte var371 = 0;
                                                                    if (field424 == 1 && var370.field2585 == 206) {
                                                                        var371 = 1;
                                                                    }
                                                                    if (var370.field2633[field317] <= 0) {
                                                                        var371 = 0;
                                                                    }
                                                                    int var372 = method533(var370);
                                                                    boolean var373 = (var372 >> 29 & 0x1) != 0;
                                                                    if (var373) {
                                                                        int var374 = field372;
                                                                        int var375 = field317;
                                                                        var370.field2633[var375] = var370.field2633[var374];
                                                                        var370.field2649[var375] = var370.field2649[var374];
                                                                        var370.field2633[var374] = -1;
                                                                        var370.field2649[var374] = 0;
                                                                    } else if (var371 == 1) {
                                                                        int var376 = field372;
                                                                        int var377 = field317;
                                                                        while (var376 != var377) {
                                                                            if (var376 > var377) {
                                                                                var370.method2878(var376 - 1, var376);
                                                                                var376--;
                                                                            } else if (var376 < var377) {
                                                                                var370.method2878(var376 + 1, var376);
                                                                                var376++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var370.method2878(field317, field372);
                                                                    }
                                                                    field302.method2386(168);
                                                                    field302.method2235(field317);
                                                                    field302.method2235(field372);
                                                                    field302.method2137(var371);
                                                                    field302.method2140(Statics.field974.field2531);
                                                                }
                                                            } else if ((field401 == 1 || method3165(field280 - 1)) && field280 > 2) {
                                                                method1790(field348, field365);
                                                            } else if (field280 > 0) {
                                                                method1794(field348, field365);
                                                            }
                                                            field370 = 10;
                                                            class127.field2002 = 0;
                                                            Statics.field974 = null;
                                                        } else if (field377 >= 5 && (class127.field1996 > field348 + 5 || class127.field1996 < field348 - 5 || class127.field1997 * -153904067 > field365 + 5 || class127.field1997 * -153904067 < field365 - 5)) {
                                                            field279 = true;
                                                        }
                                                    }
                                                    if (class79.field1396 != -1) {
                                                        int var378 = class79.field1396;
                                                        int var379 = class79.field1397;
                                                        field302.method2386(170);
                                                        field302.method2137(5);
                                                        field302.method2328(class124.field1947[82] ? (class124.field1947[81] ? 2 : 1) : 0);
                                                        field302.method2209(Statics.field1905 + var379);
                                                        field302.method2181(Statics.field197 + var378);
                                                        class79.field1396 = -1;
                                                        field393 = class127.field2003;
                                                        field350 = class127.field1999;
                                                        field349 = 1;
                                                        field368 = 0;
                                                        field489 = var378;
                                                        field430 = var379;
                                                    }
                                                    if (Statics.field844 != var358) {
                                                        if (var358 != null) {
                                                            method465(var358);
                                                        }
                                                        if (Statics.field844 != null) {
                                                            method465(Statics.field844);
                                                        }
                                                    }
                                                    if (Statics.field73 != var359 && field412 == field369) {
                                                        if (var359 != null) {
                                                            method465(var359);
                                                        }
                                                        if (Statics.field73 != null) {
                                                            method465(Statics.field73);
                                                        }
                                                    }
                                                    if (Statics.field73 == null) {
                                                        if (field412 > 0) {
                                                            field412--;
                                                        }
                                                    } else if (field412 < field369) {
                                                        field412++;
                                                        if (field412 == field369) {
                                                            method465(Statics.field73);
                                                        }
                                                    }
                                                    int var380 = field324 + Statics.field1667.field744;
                                                    int var381 = field326 + Statics.field1667.field738;
                                                    if (Statics.field1003 - var380 < -500 || Statics.field1003 - var380 > 500 || Statics.field647 - var381 < -500 || Statics.field647 - var381 > 500) {
                                                        Statics.field1003 = var380;
                                                        Statics.field647 = var381;
                                                    }
                                                    if (Statics.field1003 != var380) {
                                                        Statics.field1003 += (var380 - Statics.field1003) / 16;
                                                    }
                                                    if (Statics.field647 != var381) {
                                                        Statics.field647 += (var381 - Statics.field647) / 16;
                                                    }
                                                    if (class127.field1994 == 4 && Statics.field346) {
                                                        int var382 = class127.field1997 * -153904067 - field441;
                                                        field469 = var382 * 2;
                                                        field441 = var382 == -1 || var382 == 1 ? class127.field1997 * -153904067 : (field441 + class127.field1997 * -153904067) / 2;
                                                        int var383 = field347 - class127.field1996;
                                                        field487 = var383 * 2;
                                                        field347 = var383 == -1 || var383 == 1 ? class127.field1996 : (field347 + class127.field1996) / 2;
                                                    } else {
                                                        if (class124.field1947[96]) {
                                                            field487 += (-24 - field487) / 2;
                                                        } else if (class124.field1947[97]) {
                                                            field487 += (24 - field487) / 2;
                                                        } else {
                                                            field487 /= 2;
                                                        }
                                                        if (class124.field1947[98]) {
                                                            field469 += (12 - field469) / 2;
                                                        } else if (class124.field1947[99]) {
                                                            field469 += (-12 - field469) / 2;
                                                        } else {
                                                            field469 /= 2;
                                                        }
                                                        field441 = class127.field1997 * -153904067;
                                                        field347 = class127.field1996;
                                                    }
                                                    field344 = field487 / 2 + field344 & 0x7FF;
                                                    field343 += field469 / 2;
                                                    if (field343 < 128) {
                                                        field343 = 128;
                                                    }
                                                    if (field343 > 383) {
                                                        field343 = 383;
                                                    }
                                                    int var384 = Statics.field1003 >> 7;
                                                    int var385 = Statics.field647 >> 7;
                                                    int var386 = method1628(Statics.field1003, Statics.field647, Statics.field2643);
                                                    int var387 = 0;
                                                    if (var384 > 3 && var385 > 3 && var384 < 100 && var385 < 100) {
                                                        for (int var388 = var384 - 4; var388 <= var384 + 4; var388++) {
                                                            for (int var389 = var385 - 4; var389 <= var385 + 4; var389++) {
                                                                int var390 = Statics.field2643;
                                                                if (var390 < 3 && (class6.field81[1][var388][var389] & 0x2) == 2) {
                                                                    var390++;
                                                                }
                                                                int var391 = var386 - class6.field85[var390][var388][var389];
                                                                if (var391 > var387) {
                                                                    var387 = var391;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var392 = var387 * 192;
                                                    if (var392 > 98048) {
                                                        var392 = 98048;
                                                    }
                                                    if (var392 < 32768) {
                                                        var392 = 32768;
                                                    }
                                                    if (var392 > field351) {
                                                        field351 += (var392 - field351) / 24;
                                                    } else if (var392 < field351) {
                                                        field351 += (var392 - field351) / 80;
                                                    }
                                                    if (field504) {
                                                        method123();
                                                    }
                                                    for (int var393 = 0; var393 < 5; var393++) {
                                                        int var10002 = field509[var393]++;
                                                    }
                                                    int var394 = ++class127.field1991 - 1;
                                                    int var396 = class124.field1965;
                                                    if (var394 > 15000 && var396 > 15000) {
                                                        field309 = 250;
                                                        class127.field1991 = 14500;
                                                        field302.method2386(159);
                                                    }
                                                    field363++;
                                                    if (field363 > 500) {
                                                        field363 = 0;
                                                        int var398 = (int) (Math.random() * 8.0D);
                                                        if ((var398 & 0x1) == 1) {
                                                            field324 += field325;
                                                        }
                                                        if ((var398 & 0x2) == 2) {
                                                            field326 += field318;
                                                        }
                                                        if ((var398 & 0x4) == 4) {
                                                            field328 += field329;
                                                        }
                                                    }
                                                    if (field324 < -50) {
                                                        field325 = 2;
                                                    }
                                                    if (field324 > 50) {
                                                        field325 = -2;
                                                    }
                                                    if (field326 < -55) {
                                                        field318 = 2;
                                                    }
                                                    if (field326 > 55) {
                                                        field318 = -2;
                                                    }
                                                    if (field328 < -40) {
                                                        field329 = 1;
                                                    }
                                                    if (field328 > 40) {
                                                        field329 = -1;
                                                    }
                                                    field335++;
                                                    if (field335 > 500) {
                                                        field335 = 0;
                                                        int var399 = (int) (Math.random() * 8.0D);
                                                        if ((var399 & 0x1) == 1) {
                                                            field331 += field332;
                                                        }
                                                        if ((var399 & 0x2) == 2) {
                                                            field333 += field380;
                                                        }
                                                    }
                                                    if (field331 < -60) {
                                                        field332 = 2;
                                                    }
                                                    if (field331 > 60) {
                                                        field332 = -2;
                                                    }
                                                    if (field333 < -20) {
                                                        field380 = 1;
                                                    }
                                                    if (field333 > 10) {
                                                        field380 = -1;
                                                    }
                                                    for (class34 var400 = (class34) field513.method3208(); var400 != null; var400 = (class34) field513.method3213()) {
                                                        if ((long) var400.field797 < class103.method1055() / 1000L - 5L) {
                                                            if (var400.field798 > 0) {
                                                                class10.method566(5, "", var400.field800 + class142.field2310);
                                                            }
                                                            if (var400.field798 == 0) {
                                                                class10.method566(5, "", var400.field800 + class142.field2315);
                                                            }
                                                            var400.method3324();
                                                        }
                                                    }
                                                    field308++;
                                                    if (field308 > 50) {
                                                        field302.method2386(110);
                                                    }
                                                    try {
                                                        if (Statics.field204 != null && field302.field1837 > 0) {
                                                            Statics.field204.method2599(field302.field1841, 0, field302.field1837);
                                                            field302.field1837 = 0;
                                                            field308 = 0;
                                                        }
                                                    } catch (IOException var402) {
                                                        method634();
                                                    }
                                                    return;
                                                }
                                                var368 = var367.field5;
                                                if (var368.field2532 < 0) {
                                                    break;
                                                }
                                                var369 = class152.method1027(var368.field2527);
                                            } while (var369 == null || var369.field2639 == null || var368.field2532 >= var369.field2639.length || var369.field2639[var368.field2532] != var368);
                                            class32.method3536(var367);
                                        }
                                    }
                                    var365 = var364.field5;
                                    if (var365.field2532 < 0) {
                                        break;
                                    }
                                    var366 = class152.method1027(var365.field2527);
                                } while (var366 == null || var366.field2639 == null || var365.field2532 >= var366.field2639.length || var366.field2639[var365.field2532] != var365);
                                class32.method3536(var364);
                            }
                        }
                        var362 = var361.field5;
                        if (var362.field2532 < 0) {
                            break;
                        }
                        var363 = class152.method1027(var362.field2527);
                    } while (var363 == null || var363.field2639 == null || var362.field2532 >= var363.field2639.length || var363.field2639[var362.field2532] != var362);
                    class32.method3536(var361);
                }
            }
            field302.method2386(149);
            field302.method2137(0);
            int var321 = field302.field1837;
            class189.method747(field302);
            field302.method2275(field302.field1837 - var321);
        }
    }

    @ObfuscatedName("cf.x(I)V")
    public static final void method1897() {
        if (Statics.field635 != null) {
            Statics.field635.method995();
        }
        if (Statics.field230 != null) {
            Statics.field230.method995();
        }
    }

    @ObfuscatedName("eo.al(I)V")
    public static final void method2686() {
        for (int var0 = 0; var0 < field376; var0++) {
            int var10002 = field501[var0]--;
            if (field501[var0] >= -10) {
                class52 var2 = field443[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1049(Statics.field166, field422[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field501[var0] += var2.method1046();
                    field443[var0] = var2;
                }
                if (field501[var0] < 0) {
                    int var9;
                    if (field502[var0] == 0) {
                        var9 = field496;
                    } else {
                        int var3 = (field502[var0] & 0xFF) * 128;
                        int var4 = field502[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1667.field744;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field502[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1667.field738;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field501[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field497 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1045().method1082(Statics.field1801);
                        class58 var11 = class58.method1112(var10, 100, var9);
                        var11.method1115(field500[var0] - 1);
                        Statics.field1650.method953(var11);
                    }
                    field501[var0] = -100;
                }
            } else {
                field376--;
                for (int var1 = var0; var1 < field376; var1++) {
                    field422[var1] = field422[var1 + 1];
                    field443[var1] = field443[var1 + 1];
                    field500[var1] = field500[var1 + 1];
                    field501[var1] = field501[var1 + 1];
                    field502[var1] = field502[var1 + 1];
                }
                var0--;
            }
        }
        if (field495 && !class161.method2084()) {
            if (field256 != 0 && field494 != -1) {
                class161.method2666(Statics.field2899, field494, 0, field256, false);
            }
            field495 = false;
        }
    }

    @ObfuscatedName("s.au(Lao;IIIB)V")
    public static void method79(class38 arg0, int arg1, int arg2, int arg3) {
        if (field376 >= 50 || field497 == 0 || arg0.field911 == null || arg1 >= arg0.field911.length) {
            return;
        }
        int var4 = arg0.field911[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field422[field376] = var5;
        field500[field376] = var6;
        field501[field376] = 0;
        field443[field376] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field502[field376] = (var8 << 16) + (var9 << 8) + var7;
        field376++;
    }

    @ObfuscatedName("a.az(IIII)V")
    public static void method469(int arg0, int arg1, int arg2) {
        if (field496 == 0 || arg1 == 0 || field376 >= 50) {
            return;
        }
        field422[field376] = arg0;
        field500[field376] = arg1;
        field501[field376] = arg2;
        field443[field376] = null;
        field502[field376] = 0;
        field376++;
    }

    @ObfuscatedName("b.ag(III)V")
    public static void method165(int arg0, int arg1) {
        if (field256 != 0 && arg0 != -1) {
            class161.method2666(Statics.field574, arg0, 0, field256, false);
            field495 = true;
        }
    }

    @ObfuscatedName("y.aj(I)V")
    public static final void method117() {
        if (field520 && Statics.field2643 != field314) {
            method710(Statics.field61, Statics.field1890, Statics.field2643, Statics.field1667.field763[0], Statics.field1667.field791[0]);
        } else if (Statics.field2643 != field484) {
            field484 = Statics.field2643;
            int var0 = Statics.field2643;
            int[] var1 = Statics.field653.field1312;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field81[var0][var6][var4] & 0x18) == 0) {
                        Statics.field176.method1764(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field81[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field176.method1764(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field653.method1443();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field81[var0][var10][var9] & 0x18) == 0) {
                        method463(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field81[var0 + 1][var10][var9] & 0x8) != 0) {
                        method463(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field485 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field176.method1659(Statics.field2643, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class36.method565(var14).field869;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field320[Statics.field2643].field2957;
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
                            field488[field485] = Statics.field1840[var15];
                            field486[field485] = var16;
                            field292[field485] = var17;
                            field485++;
                        }
                    }
                }
            }
            Statics.field1280.method1429();
        }
    }

    @ObfuscatedName("client.af(IIB)V")
    public static final void method421(int arg0, int arg1) {
        if (field492 != 0 && field492 != 3 || class127.field2002 != 1 && Statics.field346 || class127.field2002 != 4) {
            return;
        }
        int var2 = class127.field2003 - 25 - arg0;
        int var3 = class127.field1999 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field344 + field331 & 0x7FF;
        int var5 = class84.field1464[var4];
        int var6 = class84.field1463[var4];
        int var7 = (field333 + 256) * var5 >> 8;
        int var8 = (field333 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1667.field744 + var9 >> 7;
        int var12 = Statics.field1667.field738 - var10 >> 7;
        field302.method2386(244);
        field302.method2137(18);
        field302.method2328(class124.field1947[82] ? (class124.field1947[81] ? 2 : 1) : 0);
        field302.method2209(Statics.field1905 + var12);
        field302.method2181(Statics.field197 + var11);
        field302.method2137(var2);
        field302.method2137(var3);
        field302.method2235(field344);
        field302.method2137(57);
        field302.method2137(field331);
        field302.method2137(field333);
        field302.method2137(89);
        field302.method2235(Statics.field1667.field744);
        field302.method2235(Statics.field1667.field738);
        field302.method2137(63);
        field489 = var11;
        field430 = var12;
    }

    @ObfuscatedName("e.am(B)V")
    public static final void method123() {
        int var0 = Statics.field142 * 128 + 64;
        int var1 = Statics.field1007 * 128 + 64;
        int var2 = method1628(var0, var1, Statics.field2643) - Statics.field2074;
        if (Statics.field2015 < var0) {
            Statics.field2015 += Statics.field2220 * (var0 - Statics.field2015) / 1000 + Statics.field1068;
            if (Statics.field2015 > var0) {
                Statics.field2015 = var0;
            }
        }
        if (Statics.field2015 > var0) {
            Statics.field2015 -= Statics.field2220 * (Statics.field2015 - var0) / 1000 + Statics.field1068;
            if (Statics.field2015 < var0) {
                Statics.field2015 = var0;
            }
        }
        if (Statics.field253 < var2) {
            Statics.field253 += Statics.field2220 * (var2 - Statics.field253) / 1000 + Statics.field1068;
            if (Statics.field253 > var2) {
                Statics.field253 = var2;
            }
        }
        if (Statics.field253 > var2) {
            Statics.field253 -= Statics.field2220 * (Statics.field253 - var2) / 1000 + Statics.field1068;
            if (Statics.field253 < var2) {
                Statics.field253 = var2;
            }
        }
        if (Statics.field1457 < var1) {
            Statics.field1457 += Statics.field2220 * (var1 - Statics.field1457) / 1000 + Statics.field1068;
            if (Statics.field1457 > var1) {
                Statics.field1457 = var1;
            }
        }
        if (Statics.field1457 > var1) {
            Statics.field1457 -= Statics.field2220 * (Statics.field1457 - var1) / 1000 + Statics.field1068;
            if (Statics.field1457 < var1) {
                Statics.field1457 = var1;
            }
        }
        int var3 = Statics.field208 * 128 + 64;
        int var4 = Statics.field1668 * 128 + 64;
        int var5 = method1628(var3, var4, Statics.field2643) - Statics.field1972;
        int var6 = var3 - Statics.field2015;
        int var7 = var5 - Statics.field253;
        int var8 = var4 - Statics.field1457;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2036 < var10) {
            Statics.field2036 += Statics.field141 * (var10 - Statics.field2036) / 1000 + Statics.field1069;
            if (Statics.field2036 > var10) {
                Statics.field2036 = var10;
            }
        }
        if (Statics.field2036 > var10) {
            Statics.field2036 -= Statics.field141 * (Statics.field2036 - var10) / 1000 + Statics.field1069;
            if (Statics.field2036 < var10) {
                Statics.field2036 = var10;
            }
        }
        int var12 = var11 - Statics.field16;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field16 += Statics.field141 * var12 / 1000 + Statics.field1069;
            Statics.field16 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field16 -= Statics.field141 * -var12 / 1000 + Statics.field1069;
            Statics.field16 &= 0x7FF;
        }
        int var13 = var11 - Statics.field16;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field16 = var11;
        }
    }

    @ObfuscatedName("dz.aa(Lam;II)V")
    public static final void method2521(class33 arg0, int arg1) {
        if (arg0.field781 > field269) {
            int var2 = arg0.field781 - field269;
            int var3 = arg0.field773 * 64 + arg0.field745 * 128;
            int var4 = arg0.field779 * 128 + arg0.field773 * 64;
            arg0.field744 += (var3 - arg0.field744) / var2;
            arg0.field738 += (var4 - arg0.field738) / var2;
            arg0.field792 = 0;
            if (arg0.field783 == 0) {
                arg0.field760 = 1024;
            }
            if (arg0.field783 == 1) {
                arg0.field760 = 1536;
            }
            if (arg0.field783 == 2) {
                arg0.field760 = 0;
            }
            if (arg0.field783 == 3) {
                arg0.field760 = 512;
            }
        } else if (arg0.field782 >= field269) {
            if (field269 == arg0.field782 || arg0.field742 == -1 || arg0.field767 != 0 || arg0.field769 + 1 > class38.method3551(arg0.field742).field906[arg0.field768]) {
                int var5 = arg0.field782 - arg0.field781;
                int var6 = field269 - arg0.field781;
                int var7 = arg0.field773 * 64 + arg0.field745 * 128;
                int var8 = arg0.field779 * 128 + arg0.field773 * 64;
                int var9 = arg0.field778 * 128 + arg0.field773 * 64;
                int var10 = arg0.field773 * 64 + arg0.field741 * 128;
                arg0.field744 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field738 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field792 = 0;
            if (arg0.field783 == 0) {
                arg0.field760 = 1024;
            }
            if (arg0.field783 == 1) {
                arg0.field760 = 1536;
            }
            if (arg0.field783 == 2) {
                arg0.field760 = 0;
            }
            if (arg0.field783 == 3) {
                arg0.field760 = 512;
            }
            arg0.field770 = arg0.field760;
        } else {
            arg0.field764 = arg0.field762;
            if (arg0.field793 == 0) {
                arg0.field792 = 0;
            } else {
                label359: {
                    if (arg0.field742 != -1 && arg0.field767 == 0) {
                        class38 var11 = class38.method3551(arg0.field742);
                        if (arg0.field794 > 0 && var11.field904 == 0) {
                            arg0.field792++;
                            break label359;
                        }
                        if (arg0.field794 <= 0 && var11.field923 == 0) {
                            arg0.field792++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field744;
                    int var13 = arg0.field738;
                    int var14 = arg0.field763[arg0.field793 - 1] * 128 + arg0.field773 * 64;
                    int var15 = arg0.field791[arg0.field793 - 1] * 128 + arg0.field773 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field760 = 1280;
                            } else if (var13 > var15) {
                                arg0.field760 = 1792;
                            } else {
                                arg0.field760 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field760 = 768;
                            } else if (var13 > var15) {
                                arg0.field760 = 256;
                            } else {
                                arg0.field760 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field760 = 1024;
                        } else if (var13 > var15) {
                            arg0.field760 = 0;
                        }
                        int var16 = arg0.field760 - arg0.field770 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field746;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field747;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field748;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field790;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field747;
                        }
                        arg0.field764 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class30) {
                            var19 = ((class30) arg0).field705.field836;
                        }
                        if (var19) {
                            if (arg0.field770 != arg0.field760 && arg0.field761 == -1 && arg0.field788 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field793 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field793 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field792 > 0 && arg0.field793 > 1) {
                                var18 = 8;
                                arg0.field792--;
                            }
                        } else {
                            if (arg0.field793 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field793 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field792 > 0 && arg0.field793 > 1) {
                                var18 = 8;
                                arg0.field792--;
                            }
                        }
                        if (arg0.field789[arg0.field793 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field764 == arg0.field747 && arg0.field749 != -1) {
                            arg0.field764 = arg0.field749;
                        }
                        if (var12 < var14) {
                            arg0.field744 += var18;
                            if (arg0.field744 > var14) {
                                arg0.field744 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field744 -= var18;
                            if (arg0.field744 < var14) {
                                arg0.field744 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field738 += var18;
                            if (arg0.field738 > var15) {
                                arg0.field738 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field738 -= var18;
                            if (arg0.field738 < var15) {
                                arg0.field738 = var15;
                            }
                        }
                        if (arg0.field744 == var14 && arg0.field738 == var15) {
                            arg0.field793--;
                            if (arg0.field794 > 0) {
                                arg0.field794--;
                            }
                        }
                    } else {
                        arg0.field744 = var14;
                        arg0.field738 = var15;
                    }
                }
            }
        }
        if (arg0.field744 < 128 || arg0.field738 < 128 || arg0.field744 >= 13184 || arg0.field738 >= 13184) {
            arg0.field742 = -1;
            arg0.field772 = -1;
            arg0.field781 = 0;
            arg0.field782 = 0;
            arg0.field744 = arg0.field763[0] * 128 + arg0.field773 * 64;
            arg0.field738 = arg0.field791[0] * 128 + arg0.field773 * 64;
            arg0.method600();
        }
        if (Statics.field1667 == arg0 && (arg0.field744 < 1536 || arg0.field738 < 1536 || arg0.field744 >= 11776 || arg0.field738 >= 11776)) {
            arg0.field742 = -1;
            arg0.field772 = -1;
            arg0.field781 = 0;
            arg0.field782 = 0;
            arg0.field744 = arg0.field763[0] * 128 + arg0.field773 * 64;
            arg0.field738 = arg0.field791[0] * 128 + arg0.field773 * 64;
            arg0.method600();
        }
        method2442(arg0);
        arg0.field753 = false;
        if (arg0.field764 != -1) {
            class38 var20 = class38.method3551(arg0.field764);
            if (var20 == null || var20.field919 == null) {
                arg0.field764 = -1;
            } else {
                arg0.field766++;
                if (arg0.field765 < var20.field919.length && arg0.field766 > var20.field906[arg0.field765]) {
                    arg0.field766 = 1;
                    arg0.field765++;
                    method79(var20, arg0.field765, arg0.field744, arg0.field738);
                }
                if (arg0.field765 >= var20.field919.length) {
                    arg0.field766 = 0;
                    arg0.field765 = 0;
                    method79(var20, arg0.field765, arg0.field744, arg0.field738);
                }
            }
        }
        if (arg0.field772 != -1 && field269 >= arg0.field775) {
            if (arg0.field740 < 0) {
                arg0.field740 = 0;
            }
            int var21 = class39.method3346(arg0.field772).field932;
            if (var21 == -1) {
                arg0.field772 = -1;
            } else {
                class38 var22 = class38.method3551(var21);
                if (var22 == null || var22.field919 == null) {
                    arg0.field772 = -1;
                } else {
                    arg0.field795++;
                    if (arg0.field740 < var22.field919.length && arg0.field795 > var22.field906[arg0.field740]) {
                        arg0.field795 = 1;
                        arg0.field740++;
                        method79(var22, arg0.field740, arg0.field744, arg0.field738);
                    }
                    if (arg0.field740 >= var22.field919.length && (arg0.field740 < 0 || arg0.field740 >= var22.field919.length)) {
                        arg0.field772 = -1;
                    }
                }
            }
        }
        if (arg0.field742 != -1 && arg0.field767 <= 1) {
            class38 var23 = class38.method3551(arg0.field742);
            if (var23.field904 == 1 && arg0.field794 > 0 && arg0.field781 <= field269 && arg0.field782 < field269) {
                arg0.field767 = 1;
                return;
            }
        }
        if (arg0.field742 != -1 && arg0.field767 == 0) {
            class38 var24 = class38.method3551(arg0.field742);
            if (var24 == null || var24.field919 == null) {
                arg0.field742 = -1;
            } else {
                arg0.field769++;
                if (arg0.field768 < var24.field919.length && arg0.field769 > var24.field906[arg0.field768]) {
                    arg0.field769 = 1;
                    arg0.field768++;
                    method79(var24, arg0.field768, arg0.field744, arg0.field738);
                }
                if (arg0.field768 >= var24.field919.length) {
                    arg0.field768 -= var24.field913;
                    arg0.field771++;
                    if (arg0.field771 >= var24.field918) {
                        arg0.field742 = -1;
                    } else if (arg0.field768 >= 0 && arg0.field768 < var24.field919.length) {
                        method79(var24, arg0.field768, arg0.field744, arg0.field738);
                    } else {
                        arg0.field742 = -1;
                    }
                }
                arg0.field753 = var24.field914;
            }
        }
        if (arg0.field767 > 0) {
            arg0.field767--;
        }
    }

    @ObfuscatedName("ds.ab(Lam;I)V")
    public static final void method2442(class33 arg0) {
        if (arg0.field788 == 0) {
            return;
        }
        if (arg0.field761 != -1 && arg0.field761 < 32768) {
            class30 var1 = field299[arg0.field761];
            if (var1 != null) {
                int var2 = arg0.field744 - var1.field744;
                int var3 = arg0.field738 - var1.field738;
                if (var2 != 0 || var3 != 0) {
                    arg0.field760 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field761 >= 32768) {
            int var4 = arg0.field761 - 32768;
            if (field490 == var4) {
                var4 = 2047;
            }
            class3 var5 = field379[var4];
            if (var5 != null) {
                int var6 = arg0.field744 - var5.field744;
                int var7 = arg0.field738 - var5.field738;
                if (var6 != 0 || var7 != 0) {
                    arg0.field760 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field777 != 0 || arg0.field780 != 0) && (arg0.field793 == 0 || arg0.field792 > 0)) {
            int var8 = arg0.field744 - (arg0.field777 * 64 - Statics.field197 * 64 - Statics.field197 * 64);
            int var9 = arg0.field738 - (arg0.field780 * 64 - Statics.field1905 * 64 - Statics.field1905 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field760 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field777 = 0;
            arg0.field780 = 0;
        }
        int var10 = arg0.field760 - arg0.field770 & 0x7FF;
        if (var10 == 0) {
            arg0.field787 = 0;
            return;
        }
        arg0.field787++;
        if (var10 > 1024) {
            arg0.field770 -= arg0.field788;
            boolean var11 = true;
            if (var10 < arg0.field788 || var10 > 2048 - arg0.field788) {
                arg0.field770 = arg0.field760;
                var11 = false;
            }
            if (arg0.field764 == arg0.field762 && (arg0.field787 > 25 || var11)) {
                if (arg0.field786 == -1) {
                    arg0.field764 = arg0.field747;
                } else {
                    arg0.field764 = arg0.field786;
                }
            }
        } else {
            arg0.field770 += arg0.field788;
            boolean var12 = true;
            if (var10 < arg0.field788 || var10 > 2048 - arg0.field788) {
                arg0.field770 = arg0.field760;
                var12 = false;
            }
            if (arg0.field764 == arg0.field762 && (arg0.field787 > 25 || var12)) {
                if (arg0.field774 == -1) {
                    arg0.field764 = arg0.field747;
                } else {
                    arg0.field764 = arg0.field774;
                }
            }
        }
        arg0.field770 &= 0x7FF;
    }

    @ObfuscatedName("m.ak(Ljava/lang/String;ZI)V")
    public static final void method485(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1276.method3359(arg0, 250);
        int var6 = Statics.field1276.method3394(arg0, 250) * 13;
        class73.method1545(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1548(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1276.method3360(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2090(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2018.getGraphics();
                Statics.field1280.method1355(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2018.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field463; var13++) {
            if (field470[var13] + field323[var13] > var9 && field323[var13] < var9 + var11 && field499[var13] + field471[var13] > var10 && field499[var13] < var10 + var12) {
                field466[var13] = true;
            }
        }
    }

    @ObfuscatedName("co.ao(Laz;I)V")
    public static final void method2099(class29 arg0) {
        if (Statics.field1667.field744 >> 7 == field489 && Statics.field1667.field738 >> 7 == field430) {
            field489 = 0;
        }
        int var1 = field305;
        if (class29.field694 == arg0 || class29.field695 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field694 == arg0) {
                var3 = Statics.field1667;
                var4 = 33538048;
            } else if (class29.field695 == arg0) {
                var3 = field379[field304];
                var4 = field304 << 14;
            } else {
                var3 = field379[field381[var2]];
                var4 = field381[var2] << 14;
                if (class29.field697 == arg0 && field304 == field381[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method23() && !var3.field57) {
                var3.field55 = false;
                if ((field520 && field305 > 50 || field305 > 200) && class29.field694 != arg0 && var3.field764 == var3.field762) {
                    var3.field55 = true;
                }
                int var5 = var3.field744 >> 7;
                int var6 = var3.field738 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field41 == null || field269 < var3.field45 || field269 >= var3.field46) {
                        if ((var3.field744 & 0x7F) == 64 && (var3.field738 & 0x7F) == 64) {
                            if (field435 == field362[var5][var6]) {
                                continue;
                            }
                            field362[var5][var6] = field435;
                        }
                        var3.field44 = method1628(var3.field744, var3.field738, Statics.field2643);
                        Statics.field176.method1720(Statics.field2643, var3.field744, var3.field738, var3.field44, 60, var3, var3.field770, var4, var3.field753);
                    } else {
                        var3.field55 = false;
                        var3.field44 = method1628(var3.field744, var3.field738, Statics.field2643);
                        Statics.field176.method1723(Statics.field2643, var3.field744, var3.field738, var3.field44, 60, var3, var3.field770, var4, var3.field51, var3.field50, var3.field40, var3.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.ar(ZI)V")
    public static final void method122(boolean arg0) {
        for (int var1 = 0; var1 < field300; var1++) {
            class30 var2 = field299[field301[var1]];
            int var3 = (field301[var1] << 14) + 536870912;
            if (var2 != null && var2.method23() && var2.field705.field827 == arg0 && var2.field705.method620()) {
                int var4 = var2.field744 >> 7;
                int var5 = var2.field738 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field773 == 1 && (var2.field744 & 0x7F) == 64 && (var2.field738 & 0x7F) == 64) {
                        if (field435 == field362[var4][var5]) {
                            continue;
                        }
                        field362[var4][var5] = field435;
                    }
                    if (!var2.field705.field817) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field176.method1720(Statics.field2643, var2.field744, var2.field738, method1628(var2.field744 + (var2.field773 * 64 - 64), var2.field738 + (var2.field773 * 64 - 64), Statics.field2643), var2.field773 * 64 - 64 + 60, var2, var2.field770, var3, var2.field753);
                }
            }
        }
    }

    @ObfuscatedName("ai.an(Lam;IIIIII)V")
    public static final void method682(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method23()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field705;
            if (var6.field832 != null) {
                var6 = var6.method654();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field305) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field57) {
                return;
            }
            if (var8.field39 != -1 || var8.field52 != -1) {
                method153(arg0, arg0.field785 + 15);
                if (field364 > -1) {
                    if (var8.field39 != -1) {
                        Statics.field1295[var8.field39].method1470(field364 + arg2 - 12, field437 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field52 != -1) {
                        Statics.field30[var8.field52].method1470(field364 + arg2 - 12, field437 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field278 == 10 && field288 == field381[arg1]) {
                method153(arg0, arg0.field785 + 15);
                if (field364 > -1) {
                    Statics.field2885[1].method1470(field364 + arg2 - 12, field437 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field705;
            if (var9.field832 != null) {
                var9 = var9.method654();
            }
            if (var9.field830 >= 0 && var9.field830 < Statics.field30.length) {
                method153(arg0, arg0.field785 + 15);
                if (field364 > -1) {
                    Statics.field30[var9.field830].method1470(field364 + arg2 - 12, field437 + arg3 - 30);
                }
            }
            if (field278 == 1 && field345 == field301[arg1 - field305] && field269 % 20 < 10) {
                method153(arg0, arg0.field785 + 15);
                if (field364 > -1) {
                    Statics.field2885[0].method1470(field364 + arg2 - 12, field437 + arg3 - 28);
                }
            }
        }
        if (arg0.field750 != null && (arg1 >= field305 || field474 == 4 || !arg0.field751 && (field474 == 0 || field474 == 3 || field474 == 1 && method2997(((class3) arg0).field42, false)))) {
            method153(arg0, arg0.field785);
            if (field364 > -1 && field352 < field353) {
                field357[field352] = Statics.field458.method3352(arg0.field750) / 2;
                field356[field352] = Statics.field458.field2909;
                field354[field352] = field364;
                field397[field352] = field437;
                field358[field352] = arg0.field743;
                field503[field352] = arg0.field754;
                field360[field352] = arg0.field752;
                field361[field352] = arg0.field750;
                field352++;
            }
        }
        if (arg0.field758 > field269) {
            method153(arg0, arg0.field785 + 15);
            if (field364 > -1) {
                int var10;
                if (arg1 < field305) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field705;
                    var10 = var11.field838;
                }
                int var12 = arg0.field759 * var10 / arg0.field739;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field759 > 0) {
                    var12 = 1;
                }
                class73.method1545(field364 + arg2 - var10 / 2, field437 + arg3 - 3, var12, 5, 65280);
                class73.method1545(field364 + arg2 - var10 / 2 + var12, field437 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field757[var13] > field269) {
                method153(arg0, arg0.field785 / 2);
                if (field364 > -1) {
                    if (var13 == 1) {
                        field437 -= 20;
                    }
                    if (var13 == 2) {
                        field364 -= 15;
                        field437 -= 10;
                    }
                    if (var13 == 3) {
                        field364 += 15;
                        field437 -= 10;
                    }
                    Statics.field989[arg0.field756[var13]].method1470(field364 + arg2 - 12, field437 + arg3 - 12);
                    Statics.field576.method3389(Integer.toString(arg0.field755[var13]), field364 + arg2 - 1, field437 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("i.av(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        field352 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field305 + field300; var6++) {
            class33 var7;
            if (var6 == -1) {
                var7 = Statics.field1667;
            } else if (var6 < field305) {
                var7 = field379[field381[var6]];
                if (field304 == field381[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field299[field301[var6 - field305]];
            }
            method682(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method682(field379[field304], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field352; var8++) {
            int var9 = field354[var8];
            int var10 = field397[var8];
            int var11 = field357[var8];
            int var12 = field356[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field397[var14] - field356[var14] && var10 - var12 < field397[var14] + 2 && var9 - var11 < field357[var14] + field354[var14] && var9 + var11 > field354[var14] - field357[var14] && field397[var14] - field356[var14] < var10) {
                        var10 = field397[var14] - field356[var14];
                        var13 = true;
                    }
                }
            }
            field364 = field354[var8];
            field437 = field397[var8] = var10;
            String var15 = field361[var8];
            if (field423 == 0) {
                int var16 = 16776960;
                if (field358[var8] < 6) {
                    var16 = field473[field358[var8]];
                }
                if (field358[var8] == 6) {
                    var16 = field435 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field358[var8] == 7) {
                    var16 = field435 % 20 < 10 ? 255 : 65535;
                }
                if (field358[var8] == 8) {
                    var16 = field435 % 20 < 10 ? 45056 : 8454016;
                }
                if (field358[var8] == 9) {
                    int var17 = 150 - field360[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field358[var8] == 10) {
                    int var18 = 150 - field360[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field358[var8] == 11) {
                    int var19 = 150 - field360[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field503[var8] == 0) {
                    Statics.field458.method3389(var15, field364 + arg0, field437 + arg1, var16, 0);
                }
                if (field503[var8] == 1) {
                    Statics.field458.method3361(var15, field364 + arg0, field437 + arg1, var16, 0, field435);
                }
                if (field503[var8] == 2) {
                    Statics.field458.method3362(var15, field364 + arg0, field437 + arg1, var16, 0, field435);
                }
                if (field503[var8] == 3) {
                    Statics.field458.method3403(var15, field364 + arg0, field437 + arg1, var16, 0, field435, 150 - field360[var8]);
                }
                if (field503[var8] == 4) {
                    int var20 = (150 - field360[var8]) * (Statics.field458.method3352(var15) + 100) / 150;
                    class73.method1540(field364 + arg0 - 50, arg1, field364 + arg0 + 50, arg1 + arg3);
                    Statics.field458.method3392(var15, field364 + arg0 + 50 - var20, field437 + arg1, var16, 0);
                    class73.method1539(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field503[var8] == 5) {
                    int var21 = 150 - field360[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class73.method1540(arg0, field437 + arg1 - Statics.field458.field2909 - 1, arg0 + arg2, field437 + arg1 + 5);
                    Statics.field458.method3389(var15, field364 + arg0, field437 + arg1 + var22, var16, 0);
                    class73.method1539(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field458.method3389(var15, field364 + arg0, field437 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ab.ac(B)V")
    public static final void method613() {
        field378 = 0;
        int var0 = (Statics.field1667.field744 >> 7) + Statics.field197;
        int var1 = (Statics.field1667.field738 >> 7) + Statics.field1905;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field378 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field378 = 1;
        }
        if (field378 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field378 = 0;
        }
    }

    @ObfuscatedName("cv.ay(IIIII)V")
    public static final void method1795(int arg0, int arg1, int arg2, int arg3) {
        if (field349 == 1) {
            Statics.field1681[field368 / 100].method1470(field393 - 8, field350 - 8);
        }
        if (field349 == 2) {
            Statics.field1681[field368 / 100 + 4].method1470(field393 - 8, field350 - 8);
        }
        method613();
        if (!field310) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1276.method3358("Fps:" + field2046, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field520) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field520) {
            var8 = 16711680;
        }
        Statics.field1276.method3358("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("t.ae(Lam;II)V")
    public static final void method153(class33 arg0, int arg1) {
        method2588(arg0.field744, arg0.field738, arg1);
    }

    @ObfuscatedName("dv.ah(IIII)V")
    public static final void method2588(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field364 = -1;
            field437 = -1;
            return;
        }
        int var3 = method1628(arg0, arg1, Statics.field2643) - arg2;
        int var4 = arg0 - Statics.field2015;
        int var5 = var3 - Statics.field253;
        int var6 = arg1 - Statics.field1457;
        int var7 = class84.field1464[Statics.field2036];
        int var8 = class84.field1463[Statics.field2036];
        int var9 = class84.field1464[Statics.field16];
        int var10 = class84.field1463[Statics.field16];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field364 = (var11 << 9) / var15 + 256;
            field437 = (var14 << 9) / var15 + 167;
        } else {
            field364 = -1;
            field437 = -1;
        }
    }

    @ObfuscatedName("bs.aw(IIII)I")
    public static final int method1628(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field81[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field85[var5][var3][var4] + class6.field85[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field85[var5][var3][var4 + 1] + class6.field85[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("u.ax(ZI)V")
    public static final void method90(boolean arg0) {
        field273 = arg0;
        if (!field273) {
            int var1 = field406.method2313();
            int var2 = field406.method2138();
            int var3 = field406.method2183();
            int var4 = (field482 - field406.field1837) / 16;
            Statics.field180 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field180[var5][var6] = field406.method2193();
                }
            }
            int var7 = field406.method2177();
            int var8 = field406.method2138();
            Statics.field1121 = new int[var4];
            Statics.field1296 = new int[var4];
            Statics.field250 = new int[var4];
            Statics.field181 = new byte[var4][];
            Statics.field899 = new byte[var4][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1121[var10] = var13;
                        Statics.field1296[var10] = Statics.field1855.method2815("m" + var11 + "_" + var12);
                        Statics.field250[var10] = Statics.field1855.method2815("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method710(var3, var8, var7, var1, var2);
            return;
        }
        field406.method2385();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field406.method2389(1);
                    if (var17 == 1) {
                        field418[var14][var15][var16] = field406.method2389(26);
                    } else {
                        field418[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field406.method2390();
        int var18 = (field482 - field406.field1837) / 16;
        Statics.field180 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field180[var19][var20] = field406.method2193();
            }
        }
        int var21 = field406.method2138();
        int var22 = field406.method2313();
        int var23 = field406.method2183();
        int var24 = field406.method2313();
        int var25 = field406.method2286();
        Statics.field1121 = new int[var18];
        Statics.field1296 = new int[var18];
        Statics.field250 = new int[var18];
        Statics.field181 = new byte[var18][];
        Statics.field899 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field418[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1121[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1121[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1296[var26] = Statics.field1855.method2815("m" + var35 + "_" + var36);
                            Statics.field250[var26] = Statics.field1855.method2815("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method710(var21, var23, var25, var24, var22);
    }

    @ObfuscatedName("ak.at(IIIIII)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field61 == arg0 && Statics.field1890 == arg1 && field314 == arg2 || !field520) {
            return;
        }
        Statics.field61 = arg0;
        Statics.field1890 = arg1;
        field314 = arg2;
        if (!field520) {
            field314 = 0;
        }
        method131(25);
        method485(class142.field2150, true);
        int var5 = Statics.field197;
        int var6 = Statics.field1905;
        Statics.field197 = (arg0 - 6) * 8;
        Statics.field1905 = (arg1 - 6) * 8;
        int var7 = Statics.field197 - var5;
        int var8 = Statics.field1905 - var6;
        int var9 = Statics.field197;
        int var10 = Statics.field1905;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field299[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field763[var13] -= var7;
                    var12.field791[var13] -= var8;
                }
                var12.field744 -= var7 * 128;
                var12.field738 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field379[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field763[var16] -= var7;
                    var15.field791[var16] -= var8;
                }
                var15.field744 -= var7 * 128;
                var15.field738 -= var8 * 128;
            }
        }
        Statics.field2643 = arg2;
        Statics.field1667.method596(arg3, arg4, false);
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
                        field394[var27][var23][var24] = field394[var27][var25][var26];
                    } else {
                        field394[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field395.method3257(); var28 != null; var28 = (class15) field395.method3249()) {
            var28.field222 -= var7;
            var28.field223 -= var8;
            if (var28.field222 < 0 || var28.field223 < 0 || var28.field222 >= 104 || var28.field223 >= 104) {
                var28.method3334();
            }
        }
        if (field489 != 0) {
            field489 -= var7;
            field430 -= var8;
        }
        field376 = 0;
        field504 = false;
        field484 = -1;
        field267.method3250();
        field396.method3250();
    }

    @ObfuscatedName("fe.ad(ZS)V")
    public static final void method3181(boolean arg0) {
        method1897();
        field308++;
        if (field308 < 50 && !arg0) {
            return;
        }
        field308 = 0;
        if (field522 || Statics.field204 == null) {
            return;
        }
        field302.method2386(110);
        try {
            Statics.field204.method2599(field302.field1841, 0, field302.field1837);
            field302.field1837 = 0;
        } catch (IOException var2) {
            field522 = true;
        }
    }

    @ObfuscatedName("a.as(IIIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field176.method1681(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field176.method1733(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field653.field1312;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method565(var12);
            if (var13.field848 == -1) {
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
                class74 var14 = Statics.field131[var13.field848];
                if (var14 != null) {
                    int var15 = (var13.field856 * 4 - var14.field1328) / 2;
                    int var16 = (var13.field857 * 4 - var14.field1326) / 2;
                    var14.method1599(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field857) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field176.method1658(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field176.method1733(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method565(var21);
            if (var22.field848 != -1) {
                class74 var23 = Statics.field131[var22.field848];
                if (var23 != null) {
                    int var24 = (var22.field856 * 4 - var23.field1328) / 2;
                    int var25 = (var22.field857 * 4 - var23.field1326) / 2;
                    var23.method1599(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field857) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field653.field1312;
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
        int var29 = Statics.field176.method1659(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method565(var30);
        if (var31.field848 == -1) {
            return;
        }
        class74 var32 = Statics.field131[var31.field848];
        if (var32 != null) {
            int var33 = (var31.field856 * 4 - var32.field1328) / 2;
            int var34 = (var31.field857 * 4 - var32.field1326) / 2;
            var32.method1599(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field857) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("aj.ap(I)V")
    public static final void method582() {
        if (field306 == 147) {
            int var0 = field406.method2176();
            int var1 = (var0 >> 4 & 0x7) + Statics.field137;
            int var2 = (var0 & 0x7) + Statics.field704;
            int var3 = field406.method2313();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var4 = field394[Statics.field2643][var1][var2];
                if (var4 != null) {
                    for (class25 var5 = (class25) var4.method3257(); var5 != null; var5 = (class25) var4.method3249()) {
                        if ((var3 & 0x7FFF) == var5.field619) {
                            var5.method3334();
                            break;
                        }
                    }
                    if (var4.method3257() == null) {
                        field394[Statics.field2643][var1][var2] = null;
                    }
                    method151(var1, var2);
                }
            }
            return;
        }
        if (field306 == 215) {
            byte var6 = field406.method2152();
            byte var7 = field406.method2197();
            int var8 = field406.method2183();
            int var9 = field406.method2177();
            int var10 = (var9 >> 4 & 0x7) + Statics.field137;
            int var11 = (var9 & 0x7) + Statics.field704;
            byte var12 = field406.method2152();
            int var13 = field406.method2184();
            byte var14 = field406.method2152();
            int var15 = field406.method2183();
            int var16 = field406.method2138();
            int var17 = field406.method2151();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field287[var18];
            class3 var21;
            if (field490 == var8) {
                var21 = Statics.field1667;
            } else {
                var21 = field379[var8];
            }
            if (var21 != null) {
                class36 var22 = class36.method565(var15);
                int var23;
                int var24;
                if (var19 == 1 || var19 == 3) {
                    var23 = var22.field857;
                    var24 = var22.field856;
                } else {
                    var23 = var22.field856;
                    var24 = var22.field857;
                }
                int var25 = (var23 >> 1) + var10;
                int var26 = (var23 + 1 >> 1) + var10;
                int var27 = (var24 >> 1) + var11;
                int var28 = (var24 + 1 >> 1) + var11;
                int[][] var29 = class6.field85[Statics.field2643];
                int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
                int var31 = (var10 << 7) + (var23 << 6);
                int var32 = (var11 << 7) + (var24 << 6);
                class98 var33 = var22.method688(var18, var19, var29, var31, var30, var32);
                if (var33 != null) {
                    method2447(Statics.field2643, var10, var11, var20, -1, 0, 0, var13 + 1, var16 + 1);
                    var21.field45 = field269 + var13;
                    var21.field46 = field269 + var16;
                    var21.field41 = var33;
                    var21.field38 = var10 * 128 + var23 * 64;
                    var21.field53 = var11 * 128 + var24 * 64;
                    var21.field48 = var30;
                    if (var6 > var7) {
                        byte var34 = var6;
                        var6 = var7;
                        var7 = var34;
                    }
                    if (var14 > var12) {
                        byte var35 = var14;
                        var14 = var12;
                        var12 = var35;
                    }
                    var21.field51 = var6 + var10;
                    var21.field40 = var7 + var10;
                    var21.field50 = var11 + var14;
                    var21.field54 = var11 + var12;
                }
            }
        }
        if (field306 == 9) {
            int var36 = field406.method2151();
            int var37 = (var36 >> 4 & 0x7) + Statics.field137;
            int var38 = (var36 & 0x7) + Statics.field704;
            int var39 = field406.method2313();
            int var40 = field406.method2313();
            int var41 = field406.method2313();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class177 var42 = field394[Statics.field2643][var37][var38];
                if (var42 != null) {
                    for (class25 var43 = (class25) var42.method3257(); var43 != null; var43 = (class25) var42.method3249()) {
                        if ((var39 & 0x7FFF) == var43.field619 && var43.field617 == var40) {
                            var43.field617 = var41;
                            break;
                        }
                    }
                    method151(var37, var38);
                }
            }
        } else if (field306 == 112) {
            int var44 = field406.method2313();
            int var45 = field406.method2286();
            int var46 = (var45 >> 4 & 0x7) + Statics.field137;
            int var47 = (var45 & 0x7) + Statics.field704;
            int var48 = field406.method2183();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class25 var49 = new class25();
                var49.field619 = var44;
                var49.field617 = var48;
                if (field394[Statics.field2643][var46][var47] == null) {
                    field394[Statics.field2643][var46][var47] = new class177();
                }
                field394[Statics.field2643][var46][var47].method3251(var49);
                method151(var46, var47);
            }
        } else if (field306 == 98) {
            int var50 = field406.method2151();
            int var51 = (var50 >> 4 & 0x7) + Statics.field137;
            int var52 = (var50 & 0x7) + Statics.field704;
            int var53 = var51 + field406.method2152();
            int var54 = var52 + field406.method2152();
            int var55 = field406.method2221();
            int var56 = field406.method2313();
            int var57 = field406.method2151() * 4;
            int var58 = field406.method2151() * 4;
            int var59 = field406.method2313();
            int var60 = field406.method2313();
            int var61 = field406.method2151();
            int var62 = field406.method2151();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var56 != 65535) {
                int var63 = var51 * 128 + 64;
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                class7 var67 = new class7(var56, Statics.field2643, var63, var64, method1628(var63, var64, Statics.field2643) - var57, field269 + var59, field269 + var60, var61, var62, var55, var58);
                var67.method84(var65, var66, method1628(var65, var66, Statics.field2643) - var58, field269 + var59);
                field396.method3251(var67);
            }
        } else {
            if (field306 == 161) {
                int var68 = field406.method2151();
                int var69 = (var68 >> 4 & 0x7) + Statics.field137;
                int var70 = (var68 & 0x7) + Statics.field704;
                int var71 = field406.method2313();
                int var72 = field406.method2151();
                int var73 = var72 >> 4 & 0xF;
                int var74 = var72 & 0x7;
                int var75 = field406.method2151();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var76 = var73 + 1;
                    if (Statics.field1667.field763[0] >= var69 - var76 && Statics.field1667.field763[0] <= var69 + var76 && Statics.field1667.field791[0] >= var70 - var76 && Statics.field1667.field791[0] <= var70 + var76 && field497 != 0 && var74 > 0 && field376 < 50) {
                        field422[field376] = var71;
                        field500[field376] = var74;
                        field501[field376] = var75;
                        field443[field376] = null;
                        field502[field376] = (var69 << 16) + (var70 << 8) + var73;
                        field376++;
                    }
                }
            }
            if (field306 == 107) {
                int var77 = field406.method2176();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field287[var78];
                int var81 = field406.method2286();
                int var82 = (var81 >> 4 & 0x7) + Statics.field137;
                int var83 = (var81 & 0x7) + Statics.field704;
                int var84 = field406.method2138();
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                    method2447(Statics.field2643, var82, var83, var80, var84, var78, var79, 0, -1);
                }
            } else if (field306 == 81) {
                int var85 = field406.method2151();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field287[var86];
                int var89 = field406.method2176();
                int var90 = (var89 >> 4 & 0x7) + Statics.field137;
                int var91 = (var89 & 0x7) + Statics.field704;
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    method2447(Statics.field2643, var90, var91, var88, -1, var86, var87, 0, -1);
                }
            } else if (field306 == 158) {
                int var92 = field406.method2286();
                int var93 = (var92 >> 4 & 0x7) + Statics.field137;
                int var94 = (var92 & 0x7) + Statics.field704;
                int var95 = field406.method2313();
                int var96 = field406.method2151();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field287[var97];
                if (var93 >= 0 && var94 >= 0 && var93 < 103 && var94 < 103) {
                    if (var99 == 0) {
                        class80 var100 = Statics.field176.method1652(Statics.field2643, var93, var94);
                        if (var100 != null) {
                            int var101 = var100.field1430 >> 14 & 0x7FFF;
                            if (var97 == 2) {
                                var100.field1428 = new class11(var101, 2, var98 + 4, Statics.field2643, var93, var94, var95, false, var100.field1428);
                                var100.field1426 = new class11(var101, 2, var98 + 1 & 0x3, Statics.field2643, var93, var94, var95, false, var100.field1426);
                            } else {
                                var100.field1428 = new class11(var101, var97, var98, Statics.field2643, var93, var94, var95, false, var100.field1428);
                            }
                        }
                    }
                    if (var99 == 1) {
                        class87 var102 = Statics.field176.method1653(Statics.field2643, var93, var94);
                        if (var102 != null) {
                            int var103 = var102.field1507 >> 14 & 0x7FFF;
                            if (var97 == 4 || var97 == 5) {
                                var102.field1505 = new class11(var103, 4, var98, Statics.field2643, var93, var94, var95, false, var102.field1505);
                            } else if (var97 == 6) {
                                var102.field1505 = new class11(var103, 4, var98 + 4, Statics.field2643, var93, var94, var95, false, var102.field1505);
                            } else if (var97 == 7) {
                                var102.field1505 = new class11(var103, 4, (var98 + 2 & 0x3) + 4, Statics.field2643, var93, var94, var95, false, var102.field1505);
                            } else if (var97 == 8) {
                                var102.field1505 = new class11(var103, 4, var98 + 4, Statics.field2643, var93, var94, var95, false, var102.field1505);
                                var102.field1506 = new class11(var103, 4, (var98 + 2 & 0x3) + 4, Statics.field2643, var93, var94, var95, false, var102.field1506);
                            }
                        }
                    }
                    if (var99 == 2) {
                        class91 var104 = Statics.field176.method1701(Statics.field2643, var93, var94);
                        if (var97 == 11) {
                            var97 = 10;
                        }
                        if (var104 != null) {
                            var104.field1557 = new class11(var104.field1561 >> 14 & 0x7FFF, var97, var98, Statics.field2643, var93, var94, var95, false, var104.field1557);
                        }
                    }
                    if (var99 == 3) {
                        class86 var105 = Statics.field176.method1679(Statics.field2643, var93, var94);
                        if (var105 != null) {
                            var105.field1487 = new class11(var105.field1488 >> 14 & 0x7FFF, 22, var98, Statics.field2643, var93, var94, var95, false, var105.field1487);
                        }
                    }
                }
            } else if (field306 == 126) {
                int var106 = field406.method2151();
                int var107 = (var106 >> 4 & 0x7) + Statics.field137;
                int var108 = (var106 & 0x7) + Statics.field704;
                int var109 = field406.method2313();
                int var110 = field406.method2151();
                int var111 = field406.method2313();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class26 var114 = new class26(var109, Statics.field2643, var112, var113, method1628(var112, var113, Statics.field2643) - var110, var111, field269);
                    field267.method3251(var114);
                }
            }
        }
    }

    @ObfuscatedName("dk.ba(IIIIIIIIII)V")
    public static final void method2447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field395.method3257(); var10 != null; var10 = (class15) field395.method3249()) {
            if (var10.field220 == arg0 && var10.field222 == arg1 && var10.field223 == arg2 && var10.field229 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field220 = arg0;
            var9.field229 = arg3;
            var9.field222 = arg1;
            var9.field223 = arg2;
            method1879(var9);
            field395.method3251(var9);
        }
        var9.field217 = arg4;
        var9.field219 = arg5;
        var9.field218 = arg6;
        var9.field228 = arg7;
        var9.field221 = arg8;
    }

    @ObfuscatedName("dk.bw(I)V")
    public static final void method2448() {
        for (class15 var0 = (class15) field395.method3257(); var0 != null; var0 = (class15) field395.method3249()) {
            if (var0.field221 == -1) {
                var0.field228 = 0;
                method1879(var0);
            } else {
                var0.method3334();
            }
        }
    }

    @ObfuscatedName("ch.bm(Lt;I)V")
    public static final void method1879(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field229 == 0) {
            var1 = Statics.field176.method1681(arg0.field220, arg0.field222, arg0.field223);
        }
        if (arg0.field229 == 1) {
            var1 = Statics.field176.method1657(arg0.field220, arg0.field222, arg0.field223);
        }
        if (arg0.field229 == 2) {
            var1 = Statics.field176.method1658(arg0.field220, arg0.field222, arg0.field223);
        }
        if (arg0.field229 == 3) {
            var1 = Statics.field176.method1659(arg0.field220, arg0.field222, arg0.field223);
        }
        if (var1 != 0) {
            int var5 = Statics.field176.method1733(arg0.field220, arg0.field222, arg0.field223, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field214 = var2;
        arg0.field216 = var3;
        arg0.field215 = var4;
    }

    @ObfuscatedName("de.bg(I)V")
    public static final void method2469() {
        for (class15 var0 = (class15) field395.method3257(); var0 != null; var0 = (class15) field395.method3249()) {
            if (var0.field221 > 0) {
                var0.field221--;
            }
            if (var0.field221 == 0) {
                if (var0.field214 >= 0) {
                    int var1 = var0.field214;
                    int var2 = var0.field216;
                    class36 var3 = class36.method565(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method658(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1998(var0.field220, var0.field229, var0.field222, var0.field223, var0.field214, var0.field215, var0.field216);
                var0.method3334();
            } else {
                if (var0.field228 > 0) {
                    var0.field228--;
                }
                if (var0.field228 == 0 && var0.field222 >= 1 && var0.field223 >= 1 && var0.field222 <= 102 && var0.field223 <= 102) {
                    if (var0.field217 >= 0) {
                        int var5 = var0.field217;
                        int var6 = var0.field219;
                        class36 var7 = class36.method565(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method658(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1998(var0.field220, var0.field229, var0.field222, var0.field223, var0.field217, var0.field218, var0.field219);
                    var0.field228 = -1;
                    if (var0.field217 == var0.field214 && var0.field214 == -1) {
                        var0.method3334();
                    } else if (var0.field217 == var0.field214 && var0.field218 == var0.field215 && var0.field219 == var0.field216) {
                        var0.method3334();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ci.bv(IIIIIIII)V")
    public static final void method1998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field520 && Statics.field2643 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field176.method1681(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field176.method1657(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field176.method1658(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field176.method1659(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field176.method1733(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field176.method1647(arg0, arg2, arg3);
                class36 var15 = class36.method565(var12);
                if (var15.field858 != 0) {
                    field320[arg0].method3521(arg2, arg3, var13, var14, var15.field859);
                }
            }
            if (arg1 == 1) {
                Statics.field176.method1660(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field176.method1649(arg0, arg2, arg3);
                class36 var16 = class36.method565(var12);
                if (var16.field856 + arg2 > 103 || var16.field856 + arg3 > 103 || var16.field857 + arg2 > 103 || var16.field857 + arg3 > 103) {
                    return;
                }
                if (var16.field858 != 0) {
                    field320[arg0].method3508(arg2, arg3, var16.field856, var16.field857, var14, var16.field859);
                }
            }
            if (arg1 == 3) {
                Statics.field176.method1731(arg0, arg2, arg3);
                class36 var17 = class36.method565(var12);
                if (var17.field858 == 1) {
                    field320[arg0].method3510(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field81[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method568(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field176, field320[arg0]);
    }

    @ObfuscatedName("t.bf(III)V")
    public static final void method151(int arg0, int arg1) {
        class177 var2 = field394[Statics.field2643][arg0][arg1];
        if (var2 == null) {
            Statics.field176.method1644(Statics.field2643, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3257(); var6 != null; var6 = (class25) var2.method3249()) {
            class45 var7 = class45.method2547(var6.field619);
            long var8 = (long) var7.field1030;
            if (var7.field1028 == 1) {
                var8 = (long) (var6.field617 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field176.method1644(Statics.field2643, arg0, arg1);
            return;
        }
        var2.method3252(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3257(); var12 != null; var12 = (class25) var2.method3249()) {
            if (var5.field619 != var12.field619) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field619 != var12.field619 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field176.method1632(Statics.field2643, arg0, arg1, method1628(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2643), var5, var13, var10, var11);
    }

    @ObfuscatedName("o.bq(I)V")
    public static final void method134() {
        field387 = 0;
        field258 = 0;
        field406.method2385();
        int var0 = field406.method2389(1);
        if (var0 != 0) {
            int var1 = field406.method2389(2);
            if (var1 == 0) {
                field383[++field258 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field406.method2389(3);
                Statics.field1667.method598(var2, false);
                int var3 = field406.method2389(1);
                if (var3 == 1) {
                    field383[++field258 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field406.method2389(3);
                Statics.field1667.method598(var4, true);
                int var5 = field406.method2389(3);
                Statics.field1667.method598(var5, true);
                int var6 = field406.method2389(1);
                if (var6 == 1) {
                    field383[++field258 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field406.method2389(7);
                int var8 = field406.method2389(7);
                int var9 = field406.method2389(1);
                Statics.field2643 = field406.method2389(2);
                int var10 = field406.method2389(1);
                if (var10 == 1) {
                    field383[++field258 - 1] = 2047;
                }
                Statics.field1667.method596(var8, var7, var9 == 1);
            }
        }
        int var11 = field406.method2389(8);
        if (var11 < field305) {
            for (int var12 = var11; var12 < field305; var12++) {
                field296[++field387 - 1] = field381[var12];
            }
        }
        if (var11 > field305) {
            throw new RuntimeException("");
        }
        field305 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field381[var13];
            class3 var15 = field379[var14];
            int var16 = field406.method2389(1);
            if (var16 == 0) {
                field381[++field305 - 1] = var14;
                var15.field784 = field269;
            } else {
                int var17 = field406.method2389(2);
                if (var17 == 0) {
                    field381[++field305 - 1] = var14;
                    var15.field784 = field269;
                    field383[++field258 - 1] = var14;
                } else if (var17 == 1) {
                    field381[++field305 - 1] = var14;
                    var15.field784 = field269;
                    int var18 = field406.method2389(3);
                    var15.method598(var18, false);
                    int var19 = field406.method2389(1);
                    if (var19 == 1) {
                        field383[++field258 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field381[++field305 - 1] = var14;
                    var15.field784 = field269;
                    int var20 = field406.method2389(3);
                    var15.method598(var20, true);
                    int var21 = field406.method2389(3);
                    var15.method598(var21, true);
                    int var22 = field406.method2389(1);
                    if (var22 == 1) {
                        field383[++field258 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field296[++field387 - 1] = var14;
                }
            }
        }
        method567();
        for (int var23 = 0; var23 < field258; var23++) {
            int var24 = field383[var23];
            class3 var25 = field379[var24];
            int var26 = field406.method2151();
            if ((var26 & 0x40) != 0) {
                var26 += field406.method2151() << 8;
            }
            method1896(var24, var25, var26);
        }
        for (int var27 = 0; var27 < field387; var27++) {
            int var28 = field296[var27];
            if (field269 != field379[var28].field784) {
                field379[var28] = null;
            }
        }
        if (field482 != field406.field1837) {
            throw new RuntimeException(field406.field1837 + class2.field22 + field482);
        }
        for (int var29 = 0; var29 < field305; var29++) {
            if (field379[field381[var29]] == null) {
                throw new RuntimeException(var29 + class2.field22 + field305);
            }
        }
    }

    @ObfuscatedName("az.bk(B)V")
    public static final void method567() {
        while (true) {
            if (field406.method2391(field482) >= 11) {
                int var0 = field406.method2389(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field379[var0] == null) {
                        field379[var0] = new class3();
                        if (field384[var0] != null) {
                            field379[var0].method15(field384[var0]);
                        }
                        var1 = true;
                    }
                    field381[++field305 - 1] = var0;
                    class3 var2 = field379[var0];
                    var2.field784 = field269;
                    int var3 = field392[field406.method2389(3)];
                    if (var1) {
                        var2.field760 = var2.field770 = var3;
                    }
                    int var4 = field406.method2389(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field406.method2389(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field406.method2389(1);
                    int var7 = field406.method2389(1);
                    if (var7 == 1) {
                        field383[++field258 - 1] = var0;
                    }
                    var2.method596(Statics.field1667.field763[0] + var4, Statics.field1667.field791[0] + var5, var6 == 1);
                    continue;
                }
            }
            field406.method2390();
            return;
        }
    }

    @ObfuscatedName("cf.bu(ILh;IB)V")
    public static final void method1896(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x8) != 0) {
            int var3 = field406.method2183();
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = field406.method2177();
            Statics.method28(arg1, var3, var4);
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field750 = field406.method2159();
            if (arg1.field750.charAt(0) == '~') {
                arg1.field750 = arg1.field750.substring(1);
                class10.method566(2, arg1.field42, arg1.field750);
            } else if (Statics.field1667 == arg1) {
                class10.method566(2, arg1.field42, arg1.field750);
            }
            arg1.field751 = false;
            arg1.field743 = 0;
            arg1.field754 = 0;
            arg1.field752 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field772 = field406.method2183();
            int var5 = field406.method2156();
            arg1.field776 = var5 >> 16;
            arg1.field775 = (var5 & 0xFFFF) + field269;
            arg1.field740 = 0;
            arg1.field795 = 0;
            if (arg1.field775 > field269) {
                arg1.field740 = -1;
            }
            if (arg1.field772 == 65535) {
                arg1.field772 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var6 = field406.method2313();
            int var7 = field406.method2176();
            arg1.method605(var6, var7, field269);
            arg1.field758 = field269 + 300;
            arg1.field759 = field406.method2286();
            arg1.field739 = field406.method2151();
        }
        if ((arg2 & 0x2) != 0) {
            int var8 = field406.method2177();
            byte[] var9 = new byte[var8];
            class107 var10 = new class107(var9);
            field406.method2195(var9, 0, var8);
            field384[arg0] = var10;
            arg1.method15(var10);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field745 = field406.method2151();
            arg1.field779 = field406.method2286();
            arg1.field778 = field406.method2176();
            arg1.field741 = field406.method2286();
            arg1.field781 = field406.method2184() + field269;
            arg1.field782 = field406.method2313() + field269;
            arg1.field783 = field406.method2151();
            arg1.field793 = 1;
            arg1.field794 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var11 = field406.method2313();
            int var12 = field406.method2176();
            arg1.method605(var11, var12, field269);
            arg1.field758 = field269 + 300;
            arg1.field759 = field406.method2177();
            arg1.field739 = field406.method2177();
        }
        if ((arg2 & 0x1) != 0) {
            int var13 = field406.method2184();
            int var14 = field406.method2151();
            boolean var15 = field406.method2286() == 1;
            int var16 = field406.method2151();
            int var17 = field406.field1837;
            if (arg1.field42 != null && arg1.field47 != null) {
                boolean var18 = false;
                if (var14 <= 1 && method85(arg1.field42)) {
                    var18 = true;
                }
                if (!var18 && field378 == 0 && !arg1.field57) {
                    field286.field1837 = 0;
                    field406.method2298(field286.field1841, 0, var16);
                    field286.field1837 = 0;
                    class107 var19 = field286;
                    String var23;
                    try {
                        int var20 = var19.method2164();
                        if (var20 > 32767) {
                            var20 = 32767;
                        }
                        byte[] var21 = new byte[var20];
                        var19.field1837 += Statics.field2902.method2091(var19.field1841, var19.field1837, var21, 0, var20);
                        String var22 = class201.method3467(var21, 0, var20);
                        var23 = var22;
                    } catch (Exception var27) {
                        var23 = "Cabbage";
                    }
                    String var26 = class192.method3356(Statics.method2722(var23));
                    arg1.field750 = var26.trim();
                    arg1.field743 = var13 >> 8;
                    arg1.field754 = var13 & 0xFF;
                    arg1.field752 = 150;
                    arg1.field751 = var15;
                    if (var14 == 2 || var14 == 3) {
                        class10.method566(var15 ? 91 : 1, class2.method2085(1) + arg1.field42, var26);
                    } else if (var14 == 1) {
                        class10.method566(var15 ? 91 : 1, class2.method2085(0) + arg1.field42, var26);
                    } else {
                        class10.method566(var15 ? 90 : 2, arg1.field42, var26);
                    }
                }
            }
            field406.field1837 = var16 + var17;
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field777 = field406.method2138();
            arg1.field780 = field406.method2138();
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field761 = field406.method2313();
            if (arg1.field761 == 65535) {
                arg1.field761 = -1;
            }
        }
    }

    @ObfuscatedName("bn.br(I)V")
    public static final void method1394() {
        field406.method2385();
        int var0 = field406.method2389(8);
        if (var0 < field300) {
            for (int var1 = var0; var1 < field300; var1++) {
                field296[++field387 - 1] = field301[var1];
            }
        }
        if (var0 > field300) {
            throw new RuntimeException("");
        }
        field300 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field301[var2];
            class30 var4 = field299[var3];
            int var5 = field406.method2389(1);
            if (var5 == 0) {
                field301[++field300 - 1] = var3;
                var4.field784 = field269;
            } else {
                int var6 = field406.method2389(2);
                if (var6 == 0) {
                    field301[++field300 - 1] = var3;
                    var4.field784 = field269;
                    field383[++field258 - 1] = var3;
                } else if (var6 == 1) {
                    field301[++field300 - 1] = var3;
                    var4.field784 = field269;
                    int var7 = field406.method2389(3);
                    var4.method598(var7, false);
                    int var8 = field406.method2389(1);
                    if (var8 == 1) {
                        field383[++field258 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field301[++field300 - 1] = var3;
                    var4.field784 = field269;
                    int var9 = field406.method2389(3);
                    var4.method598(var9, true);
                    int var10 = field406.method2389(3);
                    var4.method598(var10, true);
                    int var11 = field406.method2389(1);
                    if (var11 == 1) {
                        field383[++field258 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field296[++field387 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("m.bi(B)V")
    public static final void method476() {
        int var0 = Statics.field2877;
        int var1 = Statics.field15;
        int var2 = Statics.field49;
        int var3 = Statics.field545;
        int var4 = 6116423;
        class73.method1545(var0, var1, var2, var3, var4);
        class73.method1545(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1548(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field458.method3392(class142.field2294, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field1996;
        int var6 = class127.field1997 * -153904067;
        for (int var7 = 0; var7 < field280; var7++) {
            int var8 = (field280 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class193 var10 = Statics.field458;
            String var11;
            if (field409[var7].length() > 0) {
                var11 = field460[var7] + class142.field2301 + field409[var7];
            } else {
                var11 = field460[var7];
            }
            var10.method3392(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2877;
        int var13 = Statics.field15;
        int var14 = Statics.field49;
        int var15 = Statics.field545;
        for (int var16 = 0; var16 < field463; var16++) {
            if (field470[var16] + field323[var16] > var12 && field323[var16] < var12 + var14 && field499[var16] + field471[var16] > var13 && field499[var16] < var13 + var15) {
                field466[var16] = true;
            }
        }
    }

    @ObfuscatedName("cl.bl(IIIII)V")
    public static final void method2090(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field463; var4++) {
            if (field470[var4] + field323[var4] > arg0 && field323[var4] < arg0 + arg2 && field499[var4] + field471[var4] > arg1 && field499[var4] < arg1 + arg3) {
                field465[var4] = true;
            }
        }
    }

    @ObfuscatedName("ez.bh(I)V")
    public static final void method2724() {
        method748();
        if (Statics.field974 != null || field433 != null) {
            return;
        }
        int var0 = class127.field2002;
        if (field447) {
            if (var0 != 1 && (Statics.field346 || var0 != 4)) {
                int var1 = class127.field1996;
                int var2 = class127.field1997 * -153904067;
                if (var1 < Statics.field2877 - 10 || var1 > Statics.field49 + Statics.field2877 + 10 || var2 < Statics.field15 - 10 || var2 > Statics.field545 + Statics.field15 + 10) {
                    field447 = false;
                    method2090(Statics.field2877, Statics.field15, Statics.field49, Statics.field545);
                }
            }
            if (var0 == 1 || !Statics.field346 && var0 == 4) {
                int var3 = Statics.field2877;
                int var4 = Statics.field15;
                int var5 = Statics.field49;
                int var6 = class127.field2003;
                int var7 = class127.field1999;
                int var8 = -1;
                for (int var9 = 0; var9 < field280; var9++) {
                    int var10 = (field280 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field404[var8];
                    int var12 = field405[var8];
                    int var13 = field340[var8];
                    int var14 = field411[var8];
                    String var15 = field460[var8];
                    String var16 = field409[var8];
                    Statics.method822(var11, var12, var13, var14, var15, var16, class127.field2003, class127.field1999);
                }
                field447 = false;
                method2090(Statics.field2877, Statics.field15, Statics.field49, Statics.field545);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field346 && var0 == 4) && field280 > 0) {
            int var17 = field340[field280 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                label204: {
                    int var18 = field404[field280 - 1];
                    int var19 = field405[field280 - 1];
                    class152 var20 = class152.method1027(var19);
                    if (!class156.method754(method533(var20))) {
                        int var21 = method533(var20);
                        boolean var22 = (var21 >> 29 & 0x1) != 0;
                        if (!var22) {
                            break label204;
                        }
                    }
                    if (Statics.field974 != null && !field279 && field401 != 1 && !method3165(field280 - 1) && field280 > 0) {
                        method1794(field348, field365);
                    }
                    field279 = false;
                    field377 = 0;
                    if (Statics.field974 != null) {
                        method465(Statics.field974);
                    }
                    Statics.field974 = class152.method1027(var19);
                    field372 = var18;
                    field348 = class127.field2003;
                    field365 = class127.field1999;
                    if (field280 > 0) {
                        method2520(field280 - 1);
                    }
                    method465(Statics.field974);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field346 && var0 == 4) && (field401 == 1 && field280 > 2 || method3165(field280 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field346 && var0 == 4) && field280 > 0) {
            int var23 = field280 - 1;
            if (var23 >= 0) {
                int var24 = field404[var23];
                int var25 = field405[var23];
                int var26 = field340[var23];
                int var27 = field411[var23];
                String var28 = field460[var23];
                String var29 = field409[var23];
                Statics.method822(var24, var25, var26, var27, var28, var29, class127.field2003, class127.field1999);
            }
        }
        if (var0 == 2 && field280 > 0) {
            method1790(class127.field2003, class127.field1999);
        }
    }

    @ObfuscatedName("ca.bd(IIB)V")
    public static final void method1790(int arg0, int arg1) {
        int var2 = Statics.field458.method3352(class142.field2294);
        for (int var3 = 0; var3 < field280; var3++) {
            class193 var4 = Statics.field458;
            String var5;
            if (field409[var3].length() > 0) {
                var5 = field460[var3] + class142.field2301 + field409[var3];
            } else {
                var5 = field460[var3];
            }
            int var6 = var4.method3352(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field280 * 15 + 21;
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
        field447 = true;
        Statics.field2877 = var8;
        Statics.field15 = var9;
        Statics.field49 = var2;
        Statics.field545 = field280 * 15 + 22;
    }

    @ObfuscatedName("ff.be(II)Z")
    public static final boolean method3165(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field340[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dg.bt(ILjava/lang/String;I)V")
    public static void method2434(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field305; var3++) {
            class3 var4 = field379[field381[var3]];
            if (var4 != null && var4.field42 != null && var4.field42.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field302.method2386(70);
                    field302.method2235(field381[var3]);
                    field302.method2142(0);
                } else if (arg0 == 4) {
                    field302.method2386(39);
                    field302.method2142(0);
                    field302.method2180(field381[var3]);
                } else if (arg0 == 6) {
                    field302.method2386(45);
                    field302.method2209(field381[var3]);
                    field302.method2173(0);
                } else if (arg0 == 7) {
                    field302.method2386(35);
                    field302.method2235(field381[var3]);
                    field302.method2173(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method566(4, "", class142.field2290 + arg1);
        }
    }

    @ObfuscatedName("y.bn(I)V")
    public static void method120() {
        if (!field416) {
            return;
        }
        class152 var0 = Statics.method899(Statics.field2711, field417);
        if (var0 != null && var0.field2610 != null) {
            class1 var1 = new class1();
            var1.field5 = var0;
            var1.field17 = var0.field2610;
            class32.method3536(var1);
        }
        field416 = false;
        method465(var0);
    }

    @ObfuscatedName("ao.bc(I)V")
    public static final void method748() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field280 - 1; var1++) {
                if (field340[var1] < 1000 && field340[var1 + 1] > 1000) {
                    String var2 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var2;
                    String var3 = field460[var1];
                    field460[var1] = field460[var1 + 1];
                    field460[var1 + 1] = var3;
                    int var4 = field340[var1];
                    field340[var1] = field340[var1 + 1];
                    field340[var1 + 1] = var4;
                    int var5 = field404[var1];
                    field404[var1] = field404[var1 + 1];
                    field404[var1 + 1] = var5;
                    int var6 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var6;
                    int var7 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("db.bp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2593(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field447 || field280 >= 500) {
            return;
        }
        field460[field280] = arg0;
        field409[field280] = arg1;
        field340[field280] = arg2;
        field411[field280] = arg3;
        field404[field280] = arg4;
        field405[field280] = arg5;
        field280++;
    }

    @ObfuscatedName("bn.bz(I)V")
    public static void method1425() {
        for (int var0 = 0; var0 < field280; var0++) {
            int var1 = field340[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field280 - 1) {
                    for (int var3 = var0; var3 < field280 - 1; var3++) {
                        field460[var3] = field460[var3 + 1];
                        field409[var3] = field409[var3 + 1];
                        field340[var3] = field340[var3 + 1];
                        field411[var3] = field411[var3 + 1];
                        field404[var3] = field404[var3 + 1];
                        field405[var3] = field405[var3 + 1];
                    }
                }
                field280--;
            }
        }
    }

    @ObfuscatedName("i.bb(IIIIB)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3) {
        if (field414 == 0 && !field416) {
            method2593(class142.field2320, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1692; var5++) {
            int var6 = class98.field1749[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field176.method1733(Statics.field2643, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method565(var10);
                    if (var11.field882 != null) {
                        var11 = var11.method664();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field414 == 1) {
                        method2593(class142.field2158, field415 + " " + class2.field26 + " " + class2.method741(65535) + var11.field851, 1, var6, var7, var8);
                    } else if (!field416) {
                        String[] var12 = var11.field868;
                        if (field432) {
                            var12 = method32(var12);
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
                                    method2593(var12[var13], class2.method741(65535) + var11.field851, var14, var6, var7, var8);
                                }
                            }
                        }
                        method2593(class142.field2285, class2.method741(65535) + var11.field851, 1002, var11.field878 << 14, var7, var8);
                    } else if ((Statics.field723 & 0x4) == 4) {
                        method2593(field491, field420 + " " + class2.field26 + " " + class2.method741(65535) + var11.field851, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field299[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field705.field812 == 1 && (var15.field744 & 0x7F) == 64 && (var15.field738 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field300; var16++) {
                            class30 var17 = field299[field301[var16]];
                            if (var17 != null && var15 != var17 && var17.field705.field812 == 1 && var15.field744 == var17.field744 && var15.field738 == var17.field738) {
                                method898(var17.field705, field301[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field305; var18++) {
                            class3 var19 = field379[field381[var18]];
                            if (var19 != null && var15.field744 == var19.field744 && var15.field738 == var19.field738) {
                                method1880(var19, field381[var18], var7, var8);
                            }
                        }
                    }
                    method898(var15.field705, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field379[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field744 & 0x7F) == 64 && (var20.field738 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field300; var21++) {
                            class30 var22 = field299[field301[var21]];
                            if (var22 != null && var22.field705.field812 == 1 && var20.field744 == var22.field744 && var20.field738 == var22.field738) {
                                method898(var22.field705, field301[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field305; var23++) {
                            class3 var24 = field379[field381[var23]];
                            if (var24 != null && var20 != var24 && var20.field744 == var24.field744 && var20.field738 == var24.field738) {
                                method1880(var24, field381[var23], var7, var8);
                            }
                        }
                    }
                    method1880(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field394[Statics.field2643][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3258(); var26 != null; var26 = (class25) var25.method3259()) {
                            class45 var27 = class45.method2547(var26.field619);
                            if (field414 == 1) {
                                method2593(class142.field2158, field415 + " " + class2.field26 + " " + class2.method741(16748608) + var27.field1021, 16, var26.field619, var7, var8);
                            } else if (!field416) {
                                String[] var28 = var27.field1032;
                                if (field432) {
                                    var28 = method32(var28);
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
                                        method2593(var28[var29], class2.method741(16748608) + var27.field1021, var30, var26.field619, var7, var8);
                                    } else if (var29 == 2) {
                                        method2593(class142.field2142, class2.method741(16748608) + var27.field1021, 20, var26.field619, var7, var8);
                                    }
                                }
                                method2593(class142.field2285, class2.method741(16748608) + var27.field1021, 1004, var26.field619, var7, var8);
                            } else if ((Statics.field723 & 0x1) == 1) {
                                method2593(field491, field420 + " " + class2.field26 + " " + class2.method741(16748608) + var27.field1021, 17, var26.field619, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.bx(Lab;IIIB)V")
    public static final void method898(class35 arg0, int arg1, int arg2, int arg3) {
        if (field280 >= 400) {
            return;
        }
        if (arg0.field832 != null) {
            arg0 = arg0.method654();
        }
        if (arg0 == null || !arg0.field817 || arg0.field837 && field429 != arg1) {
            return;
        }
        String var4 = arg0.field807;
        if (arg0.field824 != 0) {
            var4 = var4 + method694(arg0.field824, Statics.field1667.field58) + " " + class2.field24 + class142.field2297 + arg0.field824 + class2.field25;
        }
        if (field414 == 1) {
            method2593(class142.field2158, field415 + " " + class2.field26 + " " + class2.method741(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field416) {
            String[] var5 = arg0.field822;
            if (field432) {
                var5 = method32(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2201)) {
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
                        method2593(var5[var6], class2.method741(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2201)) {
                        short var9 = 0;
                        if (field385 == class18.field524 || field385 == class18.field530 && arg0.field824 > Statics.field1667.field58) {
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
                        method2593(var5[var8], class2.method741(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2593(class142.field2285, class2.method741(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field723 & 0x2) == 2) {
            method2593(field491, field420 + " " + class2.field26 + " " + class2.method741(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ch.bo(Lh;IIIB)V")
    public static final void method1880(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1667 == arg0 || field280 >= 400) {
            return;
        }
        String var4;
        if (arg0.field43 == 0) {
            var4 = arg0.field42 + method694(arg0.field58, Statics.field1667.field58) + " " + class2.field24 + class142.field2297 + arg0.field58 + class2.field25;
        } else {
            var4 = arg0.field42 + " " + class2.field24 + class142.field2298 + arg0.field43 + class2.field25;
        }
        if (field414 == 1) {
            method2593(class142.field2158, field415 + " " + class2.field26 + " " + class2.method741(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field416) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field390[var5] != null) {
                    short var6 = 0;
                    if (field390[var5].equalsIgnoreCase(class142.field2201)) {
                        if (field385 == class18.field524 || field385 == class18.field530 && arg0.field58 > Statics.field1667.field58) {
                            var6 = 2000;
                        }
                        if (Statics.field1667.field56 != 0 && arg0.field56 != 0) {
                            if (Statics.field1667.field56 == arg0.field56) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field518[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field389[var5] + var6;
                    method2593(field390[var5], class2.method741(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field723 & 0x8) == 8) {
            method2593(field491, field420 + " " + class2.field26 + " " + class2.method741(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field280; var9++) {
            if (field340[var9] == 23) {
                field409[var9] = class2.method741(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ai.by(IIB)Ljava/lang/String;")
    public static final String method694(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method741(16711680);
        } else if (var2 < -6) {
            return class2.method741(16723968);
        } else if (var2 < -3) {
            return class2.method741(16740352);
        } else if (var2 < 0) {
            return class2.method741(16756736);
        } else if (var2 > 9) {
            return class2.method741(65280);
        } else if (var2 > 6) {
            return class2.method741(4259584);
        } else if (var2 > 3) {
            return class2.method741(8453888);
        } else if (var2 > 0) {
            return class2.method741(12648192);
        } else {
            return class2.method741(16776960);
        }
    }

    @ObfuscatedName("w.bs(IIIIIIIII)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method525(arg0)) {
            Statics.field1658 = null;
            method2735(Statics.field2584[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1658 != null) {
                method2735(Statics.field1658, -1412584499, arg1, arg2, arg3, arg4, Statics.field2655, Statics.field2124, arg7);
                Statics.field1658 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field465[var8] = true;
            }
        } else {
            field465[arg7] = true;
        }
    }

    @ObfuscatedName("eq.ck([Led;IIIIIIIII)V")
    public static final void method2735(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1539(arg2, arg3, arg4, arg5);
        class84.method1797();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2527 == arg1 || arg1 == -1412584499 && field433 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field323[field463] = var10.field2558 + arg6;
                    field499[field463] = var10.field2571 + arg7;
                    field470[field463] = var10.field2535;
                    field471[field463] = var10.field2601;
                    var11 = ++field463 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2616 = var11;
                var10.field2647 = field269;
                if (!var10.field2530 || !method2719(var10)) {
                    if (var10.field2585 > 0) {
                        int var12 = var10.field2585;
                        if (var12 == 324) {
                            if (field517 == -1) {
                                field517 = var10.field2555;
                                field367 = var10.field2520;
                            }
                            if (field516.field2671) {
                                var10.field2555 = field517;
                            } else {
                                var10.field2555 = field367;
                            }
                        } else if (var12 == 325) {
                            if (field517 == -1) {
                                field517 = var10.field2555;
                                field367 = var10.field2520;
                            }
                            if (field516.field2671) {
                                var10.field2555 = field367;
                            } else {
                                var10.field2555 = field517;
                            }
                        } else if (var12 == 327) {
                            var10.field2636 = 150;
                            var10.field2543 = (int) (Math.sin((double) field269 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2563 = 5;
                            var10.field2564 = 0;
                        } else if (var12 == 328) {
                            var10.field2636 = 150;
                            var10.field2543 = (int) (Math.sin((double) field269 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2563 = 5;
                            var10.field2564 = 1;
                        }
                    }
                    int var13 = var10.field2558 + arg6;
                    int var14 = var10.field2571 + arg7;
                    int var15 = var10.field2626;
                    if (field433 == var10) {
                        if (arg1 != -1412584499 && !var10.field2596) {
                            Statics.field1658 = arg0;
                            Statics.field2655 = arg6;
                            Statics.field2124 = arg7;
                            continue;
                        }
                        if (field444 && field276) {
                            int var16 = class127.field1996;
                            int var17 = class127.field1997 * -153904067;
                            int var18 = var16 - field293;
                            int var19 = var17 - field436;
                            if (var18 < field268) {
                                var18 = field268;
                            }
                            if (var10.field2535 + var18 > field268 + field434.field2535) {
                                var18 = field268 + field434.field2535 - var10.field2535;
                            }
                            if (var19 < field388) {
                                var19 = field388;
                            }
                            if (var10.field2601 + var19 > field388 + field434.field2601) {
                                var19 = field388 + field434.field2601 - var10.field2601;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2596) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2612 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2612 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2535 + var13;
                        int var27 = var10.field2601 + var14;
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
                        int var30 = var10.field2535 + var13;
                        int var31 = var10.field2601 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2530 || var20 < var22 && var21 < var23) {
                        if (var10.field2585 != 0) {
                            if (var10.field2585 == 1337) {
                                field410 = var13;
                                field402 = var14;
                                int var32 = var10.field2535;
                                int var33 = var10.field2601;
                                class73.method1539(var13, var14, var13 + var32, var14 + var33);
                                class84.method1797();
                                field435++;
                                method2099(class29.field694);
                                boolean var34 = false;
                                if (field304 >= 0) {
                                    for (int var35 = 0; var35 < field305; var35++) {
                                        if (field304 == field381[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method2099(class29.field695);
                                }
                                method122(true);
                                method2099(var34 ? class29.field697 : class29.field698);
                                method122(false);
                                for (class7 var36 = (class7) field396.method3257(); var36 != null; var36 = (class7) field396.method3249()) {
                                    if (Statics.field2643 != var36.field103 || field269 > var36.field110) {
                                        var36.method3334();
                                    } else if (field269 >= var36.field106) {
                                        if (var36.field125 > 0) {
                                            class30 var37 = field299[var36.field125 - 1];
                                            if (var37 != null && var37.field744 >= 0 && var37.field744 < 13312 && var37.field738 >= 0 && var37.field738 < 13312) {
                                                var36.method84(var37.field744, var37.field738, method1628(var37.field744, var37.field738, var36.field103) - var36.field108, field269);
                                            }
                                        }
                                        if (var36.field125 < 0) {
                                            int var38 = -var36.field125 - 1;
                                            class3 var39;
                                            if (field490 == var38) {
                                                var39 = Statics.field1667;
                                            } else {
                                                var39 = field379[var38];
                                            }
                                            if (var39 != null && var39.field744 >= 0 && var39.field744 < 13312 && var39.field738 >= 0 && var39.field738 < 13312) {
                                                var36.method84(var39.field744, var39.field738, method1628(var39.field744, var39.field738, var36.field103) - var36.field108, field269);
                                            }
                                        }
                                        var36.method80(field336);
                                        Statics.field176.method1720(Statics.field2643, (int) var36.field115, (int) var36.field116, (int) var36.field107, 60, var36, var36.field123, -1, false);
                                    }
                                }
                                for (class26 var40 = (class26) field267.method3257(); var40 != null; var40 = (class26) field267.method3249()) {
                                    if (Statics.field2643 != var40.field625 || var40.field632) {
                                        var40.method3334();
                                    } else if (field269 >= var40.field623) {
                                        var40.method518(field336);
                                        if (var40.field632) {
                                            var40.method3334();
                                        } else {
                                            Statics.field176.method1720(var40.field625, var40.field629, var40.field624, var40.field628, 60, var40, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field504) {
                                    int var41 = field343;
                                    if (field351 / 256 > var41) {
                                        var41 = field351 / 256;
                                    }
                                    if (field505[4] && field507[4] + 128 > var41) {
                                        var41 = field507[4] + 128;
                                    }
                                    int var42 = field344 + field328 & 0x7FF;
                                    int var43 = Statics.field1003;
                                    int var44 = method1628(Statics.field1667.field744, Statics.field1667.field738, Statics.field2643) - 50;
                                    int var45 = Statics.field647;
                                    int var46 = var41 * 3 + 600;
                                    int var47 = 2048 - var41 & 0x7FF;
                                    int var48 = 2048 - var42 & 0x7FF;
                                    int var49 = 0;
                                    int var50 = 0;
                                    int var51 = var46;
                                    if (var47 != 0) {
                                        int var52 = class84.field1464[var47];
                                        int var53 = class84.field1463[var47];
                                        int var54 = var50 * var53 - var46 * var52 >> 16;
                                        var51 = var50 * var52 + var46 * var53 >> 16;
                                        var50 = var54;
                                    }
                                    if (var48 != 0) {
                                        int var55 = class84.field1464[var48];
                                        int var56 = class84.field1463[var48];
                                        int var57 = var49 * var56 + var51 * var55 >> 16;
                                        var51 = var51 * var56 - var49 * var55 >> 16;
                                        var49 = var57;
                                    }
                                    Statics.field2015 = var43 - var49;
                                    Statics.field253 = var44 - var50;
                                    Statics.field1457 = var45 - var51;
                                    Statics.field2036 = var41;
                                    Statics.field16 = var42;
                                }
                                int var70;
                                if (field504) {
                                    int var71;
                                    if (Statics.field1357.field146) {
                                        var71 = Statics.field2643;
                                    } else {
                                        int var72 = method1628(Statics.field2015, Statics.field1457, Statics.field2643);
                                        if (var72 - Statics.field253 >= 800 || (class6.field81[Statics.field2643][Statics.field2015 >> 7][Statics.field1457 >> 7] & 0x4) == 0) {
                                            var71 = 3;
                                        } else {
                                            var71 = Statics.field2643;
                                        }
                                    }
                                    var70 = var71;
                                } else {
                                    int var58;
                                    if (Statics.field1357.field146) {
                                        var58 = Statics.field2643;
                                    } else {
                                        int var59 = 3;
                                        if (Statics.field2036 < 310) {
                                            int var60 = Statics.field2015 >> 7;
                                            int var61 = Statics.field1457 >> 7;
                                            int var62 = Statics.field1667.field744 >> 7;
                                            int var63 = Statics.field1667.field738 >> 7;
                                            if ((class6.field81[Statics.field2643][var60][var61] & 0x4) != 0) {
                                                var59 = Statics.field2643;
                                            }
                                            int var64;
                                            if (var62 > var60) {
                                                var64 = var62 - var60;
                                            } else {
                                                var64 = var60 - var62;
                                            }
                                            int var65;
                                            if (var63 > var61) {
                                                var65 = var63 - var61;
                                            } else {
                                                var65 = var61 - var63;
                                            }
                                            if (var64 > var65) {
                                                int var66 = var65 * 65536 / var64;
                                                int var67 = 32768;
                                                while (var60 != var62) {
                                                    if (var60 < var62) {
                                                        var60++;
                                                    } else if (var60 > var62) {
                                                        var60--;
                                                    }
                                                    if ((class6.field81[Statics.field2643][var60][var61] & 0x4) != 0) {
                                                        var59 = Statics.field2643;
                                                    }
                                                    var67 += var66;
                                                    if (var67 >= 65536) {
                                                        var67 -= 65536;
                                                        if (var61 < var63) {
                                                            var61++;
                                                        } else if (var61 > var63) {
                                                            var61--;
                                                        }
                                                        if ((class6.field81[Statics.field2643][var60][var61] & 0x4) != 0) {
                                                            var59 = Statics.field2643;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var68 = var64 * 65536 / var65;
                                                int var69 = 32768;
                                                while (var61 != var63) {
                                                    if (var61 < var63) {
                                                        var61++;
                                                    } else if (var61 > var63) {
                                                        var61--;
                                                    }
                                                    if ((class6.field81[Statics.field2643][var60][var61] & 0x4) != 0) {
                                                        var59 = Statics.field2643;
                                                    }
                                                    var69 += var68;
                                                    if (var69 >= 65536) {
                                                        var69 -= 65536;
                                                        if (var60 < var62) {
                                                            var60++;
                                                        } else if (var60 > var62) {
                                                            var60--;
                                                        }
                                                        if ((class6.field81[Statics.field2643][var60][var61] & 0x4) != 0) {
                                                            var59 = Statics.field2643;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field81[Statics.field2643][Statics.field1667.field744 >> 7][Statics.field1667.field738 >> 7] & 0x4) != 0) {
                                            var59 = Statics.field2643;
                                        }
                                        var58 = var59;
                                    }
                                    var70 = var58;
                                }
                                int var73 = Statics.field2015;
                                int var74 = Statics.field253;
                                int var75 = Statics.field1457;
                                int var76 = Statics.field2036;
                                int var77 = Statics.field16;
                                for (int var78 = 0; var78 < 5; var78++) {
                                    if (field505[var78]) {
                                        int var79 = (int) (Math.random() * (double) (field506[var78] * 2 + 1) - (double) field506[var78] + Math.sin((double) field508[var78] / 100.0D * (double) field509[var78]) * (double) field507[var78]);
                                        if (var78 == 0) {
                                            Statics.field2015 += var79;
                                        }
                                        if (var78 == 1) {
                                            Statics.field253 += var79;
                                        }
                                        if (var78 == 2) {
                                            Statics.field1457 += var79;
                                        }
                                        if (var78 == 3) {
                                            Statics.field16 = Statics.field16 + var79 & 0x7FF;
                                        }
                                        if (var78 == 4) {
                                            Statics.field2036 += var79;
                                            if (Statics.field2036 < 128) {
                                                Statics.field2036 = 128;
                                            }
                                            if (Statics.field2036 > 383) {
                                                Statics.field2036 = 383;
                                            }
                                        }
                                    }
                                }
                                int var80 = class127.field1996;
                                int var81 = class127.field1997 * -153904067;
                                if (class127.field2002 != 0) {
                                    var80 = class127.field2003;
                                    var81 = class127.field1999;
                                }
                                if (var80 >= var13 && var80 < var13 + var32 && var81 >= var14 && var81 < var14 + var33) {
                                    class98.field1745 = true;
                                    class98.field1692 = 0;
                                    class98.field1708 = var80 - var13;
                                    class98.field1747 = var81 - var14;
                                } else {
                                    class98.field1745 = false;
                                    class98.field1692 = 0;
                                }
                                method1897();
                                class73.method1545(var13, var14, var32, var33, 0);
                                method1897();
                                Statics.field176.method1668(Statics.field2015, Statics.field253, Statics.field1457, Statics.field2036, Statics.field16, var70);
                                method1897();
                                Statics.field176.method1724();
                                method2(var13, var14, var32, var33);
                                Statics.method91(var13, var14);
                                ((class88) Statics.field1478).method1886(field336);
                                method1795(var13, var14, var32, var33);
                                Statics.field2015 = var73;
                                Statics.field253 = var74;
                                Statics.field1457 = var75;
                                Statics.field2036 = var76;
                                Statics.field16 = var77;
                                if (field359) {
                                    byte var82 = 0;
                                    int var83 = class150.field2498 + class150.field2495 + var82;
                                    if (var83 == 0) {
                                        field359 = false;
                                    }
                                }
                                if (field359) {
                                    class73.method1545(var13, var14, var32, var33, 0);
                                    method485(class142.field2150, false);
                                }
                                class73.method1539(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2585 == 1338) {
                                method2486(var13, var14, var11);
                                class73.method1539(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2612 == 0) {
                            if (!var10.field2530 && method2719(var10) && Statics.field844 != var10) {
                                continue;
                            }
                            if (!var10.field2530) {
                                if (var10.field2545 > var10.field2547 - var10.field2601) {
                                    var10.field2545 = var10.field2547 - var10.field2601;
                                }
                                if (var10.field2545 < 0) {
                                    var10.field2545 = 0;
                                }
                            }
                            method2735(arg0, var10.field2531, var20, var21, var22, var23, var13 - var10.field2544, var14 - var10.field2545, var11);
                            if (var10.field2639 != null) {
                                method2735(var10.field2639, var10.field2531, var20, var21, var22, var23, var13 - var10.field2544, var14 - var10.field2545, var11);
                            }
                            class4 var85 = (class4) field371.method3218((long) var10.field2531);
                            if (var85 != null) {
                                method149(var85.field67, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1539(arg2, arg3, arg4, arg5);
                            class84.method1797();
                        }
                        if (field467[var11] || field472 > 1) {
                            if (var10.field2612 == 0 && !var10.field2530 && var10.field2547 > var10.field2601) {
                                method135(var10.field2535 + var13, var14, var10.field2545, var10.field2601, var10.field2547);
                            }
                            if (var10.field2612 != 1) {
                                if (var10.field2612 == 2) {
                                    int var86 = 0;
                                    for (int var87 = 0; var87 < var10.field2601; var87++) {
                                        for (int var88 = 0; var88 < var10.field2535; var88++) {
                                            int var89 = (var10.field2629 + 32) * var88 + var13;
                                            int var90 = (var10.field2569 + 32) * var87 + var14;
                                            if (var86 < 20) {
                                                var89 += var10.field2586[var86];
                                                var90 += var10.field2587[var86];
                                            }
                                            if (var10.field2633[var86] > 0) {
                                                boolean var91 = false;
                                                boolean var92 = false;
                                                int var93 = var10.field2633[var86] - 1;
                                                if (var89 + 32 > arg2 && var89 < arg4 && var90 + 32 > arg3 && var90 < arg5 || Statics.field974 == var10 && field372 == var86) {
                                                    class72 var94;
                                                    if (field414 == 1 && Statics.field567 == var86 && Statics.field93 == var10.field2531) {
                                                        var94 = class45.method1422(var93, var10.field2649[var86], 2, 0, false);
                                                    } else {
                                                        var94 = class45.method1422(var93, var10.field2649[var86], 1, 3153952, false);
                                                    }
                                                    if (var94 == null) {
                                                        method465(var10);
                                                    } else if (Statics.field974 == var10 && field372 == var86) {
                                                        int var95 = class127.field1996 - field348;
                                                        int var96 = class127.field1997 * -153904067 - field365;
                                                        if (var95 < 5 && var95 > -5) {
                                                            var95 = 0;
                                                        }
                                                        if (var96 < 5 && var96 > -5) {
                                                            var96 = 0;
                                                        }
                                                        if (field377 < 5) {
                                                            var95 = 0;
                                                            var96 = 0;
                                                        }
                                                        var94.method1458(var89 + var95, var90 + var96, 128);
                                                        if (arg1 != -1) {
                                                            class152 var97 = arg0[arg1 & 0xFFFF];
                                                            if (var90 + var96 < class73.field1322 && var97.field2545 > 0) {
                                                                int var98 = field336 * (class73.field1322 - var90 - var96) / 3;
                                                                if (var98 > field336 * 10) {
                                                                    var98 = field336 * 10;
                                                                }
                                                                if (var98 > var97.field2545) {
                                                                    var98 = var97.field2545;
                                                                }
                                                                var97.field2545 -= var98;
                                                                field365 += var98;
                                                                method465(var97);
                                                            }
                                                            if (var90 + var96 + 32 > class73.field1319 && var97.field2545 < var97.field2547 - var97.field2601) {
                                                                int var99 = field336 * (var90 + var96 + 32 - class73.field1319) / 3;
                                                                if (var99 > field336 * 10) {
                                                                    var99 = field336 * 10;
                                                                }
                                                                if (var99 > var97.field2547 - var97.field2601 - var97.field2545) {
                                                                    var99 = var97.field2547 - var97.field2601 - var97.field2545;
                                                                }
                                                                var97.field2545 += var99;
                                                                field365 -= var99;
                                                                method465(var97);
                                                            }
                                                        }
                                                    } else if (Statics.field656 == var10 && field366 == var86) {
                                                        var94.method1458(var89, var90, 128);
                                                    } else {
                                                        var94.method1470(var89, var90);
                                                    }
                                                }
                                            } else if (var10.field2588 != null && var86 < 20) {
                                                class72 var100 = var10.method2889(var86);
                                                if (var100 != null) {
                                                    var100.method1470(var89, var90);
                                                } else if (class152.field2608) {
                                                    method465(var10);
                                                }
                                            }
                                            var86++;
                                        }
                                    }
                                } else if (var10.field2612 == 3) {
                                    int var101;
                                    if (method127(var10)) {
                                        var101 = var10.field2549;
                                        if (Statics.field844 == var10 && var10.field2524 != 0) {
                                            var101 = var10.field2524;
                                        }
                                    } else {
                                        var101 = var10.field2553;
                                        if (Statics.field844 == var10 && var10.field2550 != 0) {
                                            var101 = var10.field2550;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2552) {
                                            class73.method1545(var13, var14, var10.field2535, var10.field2601, var101);
                                        } else {
                                            class73.method1548(var13, var14, var10.field2535, var10.field2601, var101);
                                        }
                                    } else if (var10.field2552) {
                                        class73.method1544(var13, var14, var10.field2535, var10.field2601, var101, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1583(var13, var14, var10.field2535, var10.field2601, var101, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2612 == 4) {
                                    class193 var102 = var10.method2880();
                                    if (var102 != null) {
                                        String var103 = var10.field2578;
                                        int var104;
                                        if (method127(var10)) {
                                            var104 = var10.field2549;
                                            if (Statics.field844 == var10 && var10.field2524 != 0) {
                                                var104 = var10.field2524;
                                            }
                                            if (var10.field2557.length() > 0) {
                                                var103 = var10.field2557;
                                            }
                                        } else {
                                            var104 = var10.field2553;
                                            if (Statics.field844 == var10 && var10.field2550 != 0) {
                                                var104 = var10.field2550;
                                            }
                                        }
                                        if (var10.field2530 && var10.field2635 != -1) {
                                            class45 var105 = class45.method2547(var10.field2635);
                                            var103 = var105.field1021;
                                            if (var103 == null) {
                                                var103 = "null";
                                            }
                                            if ((var105.field1028 == 1 || var10.field2619 != 1) && var10.field2619 != -1) {
                                                var103 = class2.method741(16748608) + var103 + class2.field32 + " " + 'x' + method2917(var10.field2619);
                                            }
                                        }
                                        if (field334 == var10) {
                                            class142 var10000 = (class142) null;
                                            var103 = class142.field2299;
                                            var104 = var10.field2553;
                                        }
                                        if (!var10.field2530) {
                                            var103 = method488(var103, var10);
                                        }
                                        var102.method3360(var103, var13, var14, var10.field2535, var10.field2601, var104, var10.field2583 ? 0 : -1, var10.field2581, var10.field2582, var10.field2551);
                                    } else if (class152.field2608) {
                                        method465(var10);
                                    }
                                } else if (var10.field2612 == 5) {
                                    if (var10.field2530) {
                                        class72 var107;
                                        if (var10.field2635 == -1) {
                                            var107 = var10.method2879(false);
                                        } else {
                                            var107 = class45.method1422(var10.field2635, var10.field2619, var10.field2559, var10.field2560, false);
                                        }
                                        if (var107 != null) {
                                            int var108 = var107.field1315;
                                            int var109 = var107.field1313;
                                            if (var10.field2540) {
                                                class73.method1540(var13, var14, var10.field2535 + var13, var10.field2601 + var14);
                                                int var110 = (var10.field2535 + (var108 - 1)) / var108;
                                                int var111 = (var10.field2601 + (var109 - 1)) / var109;
                                                for (int var112 = 0; var112 < var110; var112++) {
                                                    for (int var113 = 0; var113 < var111; var113++) {
                                                        if (var10.field2622 != 0) {
                                                            var107.method1476(var108 / 2 + var108 * var112 + var13, var109 / 2 + var109 * var113 + var14, var10.field2622, 4096);
                                                        } else if (var15 == 0) {
                                                            var107.method1470(var108 * var112 + var13, var109 * var113 + var14);
                                                        } else {
                                                            var107.method1458(var108 * var112 + var13, var109 * var113 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1539(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var114 = var10.field2535 * 4096 / var108;
                                                if (var10.field2622 != 0) {
                                                    var107.method1476(var10.field2535 / 2 + var13, var10.field2601 / 2 + var14, var10.field2622, var114);
                                                } else if (var15 != 0) {
                                                    var107.method1460(var13, var14, var10.field2535, var10.field2601, 256 - (var15 & 0xFF));
                                                } else if (var10.field2535 == var108 && var10.field2601 == var109) {
                                                    var107.method1470(var13, var14);
                                                } else {
                                                    var107.method1455(var13, var14, var10.field2535, var10.field2601);
                                                }
                                            }
                                        } else if (class152.field2608) {
                                            method465(var10);
                                        }
                                    } else {
                                        class72 var106 = var10.method2879(method127(var10));
                                        if (var106 != null) {
                                            var106.method1470(var13, var14);
                                        } else if (class152.field2608) {
                                            method465(var10);
                                        }
                                    }
                                } else if (var10.field2612 == 6) {
                                    boolean var115 = method127(var10);
                                    int var116;
                                    if (var115) {
                                        var116 = var10.field2568;
                                    } else {
                                        var116 = var10.field2600;
                                    }
                                    class98 var117 = null;
                                    int var118 = 0;
                                    if (var10.field2635 != -1) {
                                        class45 var119 = class45.method2547(var10.field2635);
                                        if (var119 != null) {
                                            class45 var120 = var119.method877(var10.field2619);
                                            var117 = var120.method880(1);
                                            if (var117 == null) {
                                                method465(var10);
                                            } else {
                                                var117.method2006();
                                                var118 = var117.field1358 / 2;
                                            }
                                        }
                                    } else if (var10.field2563 == 5) {
                                        if (var10.field2564 == 0) {
                                            var117 = field516.method2952((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var117 = Statics.field1667.method16();
                                        }
                                    } else if (var116 == -1) {
                                        var117 = var10.method2882((class38) null, -1, var115, Statics.field1667.field47);
                                        if (var117 == null && class152.field2608) {
                                            method465(var10);
                                        }
                                    } else {
                                        class38 var121 = class38.method3551(var116);
                                        var117 = var10.method2882(var121, var10.field2637, var115, Statics.field1667.field47);
                                        if (var117 == null && class152.field2608) {
                                            method465(var10);
                                        }
                                    }
                                    class84.method1801(var10.field2535 / 2 + var13, var10.field2601 / 2 + var14);
                                    int var122 = var10.field2574 * class84.field1464[var10.field2636] >> 16;
                                    int var123 = var10.field2574 * class84.field1463[var10.field2636] >> 16;
                                    if (var117 != null) {
                                        if (var10.field2530) {
                                            var117.method2006();
                                            if (var10.field2576) {
                                                var117.method2056(0, var10.field2543, var10.field2537, var10.field2636, var10.field2541, var10.field2570 + var118 + var122, var10.field2570 + var123, var10.field2574);
                                            } else {
                                                var117.method2018(0, var10.field2543, var10.field2537, var10.field2636, var10.field2541, var10.field2570 + var118 + var122, var10.field2570 + var123);
                                            }
                                        } else {
                                            var117.method2018(0, var10.field2543, 0, var10.field2636, 0, var122, var123);
                                        }
                                    }
                                    class84.method1800();
                                } else {
                                    if (var10.field2612 == 7) {
                                        class193 var124 = var10.method2880();
                                        if (var124 == null) {
                                            if (class152.field2608) {
                                                method465(var10);
                                            }
                                            continue;
                                        }
                                        int var125 = 0;
                                        for (int var126 = 0; var126 < var10.field2601; var126++) {
                                            for (int var127 = 0; var127 < var10.field2535; var127++) {
                                                if (var10.field2633[var125] > 0) {
                                                    class45 var128 = class45.method2547(var10.field2633[var125] - 1);
                                                    String var129;
                                                    if (var128.field1028 != 1 && var10.field2649[var125] == 1) {
                                                        var129 = class2.method741(16748608) + var128.field1021 + class2.field32;
                                                    } else {
                                                        var129 = class2.method741(16748608) + var128.field1021 + class2.field32 + " " + 'x' + method2917(var10.field2649[var125]);
                                                    }
                                                    int var130 = (var10.field2629 + 115) * var127 + var13;
                                                    int var131 = (var10.field2569 + 12) * var126 + var14;
                                                    if (var10.field2581 == 0) {
                                                        var124.method3392(var129, var130, var131, var10.field2553, var10.field2583 ? 0 : -1);
                                                    } else if (var10.field2581 == 1) {
                                                        var124.method3389(var129, var10.field2535 / 2 + var130, var131, var10.field2553, var10.field2583 ? 0 : -1);
                                                    } else {
                                                        var124.method3358(var129, var10.field2535 + var130 - 1, var131, var10.field2553, var10.field2583 ? 0 : -1);
                                                    }
                                                }
                                                var125++;
                                            }
                                        }
                                    }
                                    if (var10.field2612 == 8 && Statics.field73 == var10 && field412 == field369) {
                                        int var132 = 0;
                                        int var133 = 0;
                                        class193 var134 = Statics.field1276;
                                        String var135 = var10.field2578;
                                        String var136 = method488(var135, var10);
                                        while (var136.length() > 0) {
                                            int var137 = var136.indexOf(class2.field27);
                                            String var138;
                                            if (var137 == -1) {
                                                var138 = var136;
                                                var136 = "";
                                            } else {
                                                var138 = var136.substring(0, var137);
                                                var136 = var136.substring(var137 + 4);
                                            }
                                            int var139 = var134.method3352(var138);
                                            if (var139 > var132) {
                                                var132 = var139;
                                            }
                                            var133 += var134.field2909 + 1;
                                        }
                                        var132 += 6;
                                        var133 += 7;
                                        int var140 = var10.field2535 + var13 - 5 - var132;
                                        int var141 = var10.field2601 + var14 + 5;
                                        if (var140 < var13 + 5) {
                                            var140 = var13 + 5;
                                        }
                                        if (var132 + var140 > arg4) {
                                            var140 = arg4 - var132;
                                        }
                                        if (var133 + var141 > arg5) {
                                            var141 = arg5 - var133;
                                        }
                                        class73.method1545(var140, var141, var132, var133, 16777120);
                                        class73.method1548(var140, var141, var132, var133, 0);
                                        String var142 = var10.field2578;
                                        int var143 = var134.field2909 + var141 + 2;
                                        String var144 = method488(var142, var10);
                                        while (var144.length() > 0) {
                                            int var145 = var144.indexOf(class2.field27);
                                            String var146;
                                            if (var145 == -1) {
                                                var146 = var144;
                                                var144 = "";
                                            } else {
                                                var146 = var144.substring(0, var145);
                                                var144 = var144.substring(var145 + 4);
                                            }
                                            var134.method3392(var146, var140 + 3, var143, 0, -1);
                                            var143 += var134.field2909 + 1;
                                        }
                                    }
                                    if (var10.field2612 == 9) {
                                        if (var10.field2554 == 1) {
                                            class73.method1553(var13, var14, var10.field2535 + var13, var10.field2601 + var14, var10.field2553);
                                        } else {
                                            int var147 = var10.field2535 >= 0 ? var10.field2535 : -var10.field2535;
                                            int var148 = var10.field2601 >= 0 ? var10.field2601 : -var10.field2601;
                                            int var149 = var147;
                                            if (var147 < var148) {
                                                var149 = var148;
                                            }
                                            if (var149 != 0) {
                                                int var150 = (var10.field2535 << 16) / var149;
                                                int var151 = (var10.field2601 << 16) / var149;
                                                if (var151 <= var150) {
                                                    var150 = -var150;
                                                } else {
                                                    var151 = -var151;
                                                }
                                                int var152 = var10.field2554 * var151 >> 17;
                                                int var153 = var10.field2554 * var151 + 1 >> 17;
                                                int var154 = var10.field2554 * var150 >> 17;
                                                int var155 = var10.field2554 * var150 + 1 >> 17;
                                                int var156 = var13 + var152;
                                                int var157 = var13 - var153;
                                                int var158 = var10.field2535 + var13 - var153;
                                                int var159 = var10.field2535 + var13 + var152;
                                                int var160 = var14 + var154;
                                                int var161 = var14 - var155;
                                                int var162 = var10.field2601 + var14 - var155;
                                                int var163 = var10.field2601 + var14 + var154;
                                                class84.method1829(var156, var157, var158);
                                                class84.method1808(var160, var161, var162, var156, var157, var158, var10.field2553);
                                                class84.method1829(var156, var158, var159);
                                                class84.method1808(var160, var162, var163, var156, var158, var159, var10.field2553);
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

    @ObfuscatedName("f.ca(Ljava/lang/String;Led;I)Ljava/lang/String;")
    public static String method488(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method155(method796(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field74 != null) {
                    var5 = class199.method701(Statics.field74.field2063);
                    if (Statics.field74.field2064 != null) {
                        var5 = (String) Statics.field74.field2064;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("et.cg(II)Ljava/lang/String;")
    public static final String method2917(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method741(65408) + var1.substring(0, var1.length() - 8) + class142.field2302 + " " + class2.field24 + var1 + class2.field25 + class2.field32;
        } else if (var1.length() > 6) {
            return " " + class2.method741(16777215) + var1.substring(0, var1.length() - 4) + class142.field2171 + " " + class2.field24 + var1 + class2.field25 + class2.field32;
        } else {
            return " " + class2.method741(16776960) + var1 + class2.field32;
        }
    }

    @ObfuscatedName("o.cb(IIIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field715[0].method1599(arg0, arg1);
        Statics.field715[1].method1599(arg0, arg1 + arg3 - 16);
        class73.method1545(arg0, arg1 + 16, 16, arg3 - 32, field337);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1545(arg0, arg1 + 16 + var6, 16, var5, field338);
        class73.method1574(arg0, arg1 + 16 + var6, var5, field521);
        class73.method1574(arg0 + 1, arg1 + 16 + var6, var5, field521);
        class73.method1549(arg0, arg1 + 16 + var6, 16, field521);
        class73.method1549(arg0, arg1 + 17 + var6, 16, field521);
        class73.method1574(arg0 + 15, arg1 + 16 + var6, var5, field339);
        class73.method1574(arg0 + 14, arg1 + 17 + var6, var5 - 1, field339);
        class73.method1549(arg0, arg1 + 15 + var6 + var5, 16, field339);
        class73.method1549(arg0 + 1, arg1 + 14 + var6 + var5, 15, field339);
    }

    @ObfuscatedName("z.cv(II)Ljava/lang/String;")
    public static final String method155(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("l.ct(Led;I)Z")
    public static final boolean method127(class152 arg0) {
        if (arg0.field2628 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2628.length; var1++) {
            int var2 = method796(arg0, var1);
            int var3 = arg0.field2548[var1];
            if (arg0.field2628[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2628[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2628[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("aq.cq(Led;II)I")
    public static final int method796(class152 arg0, int arg1) {
        if (arg0.field2579 == null || arg1 >= arg0.field2579.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2579[arg1];
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
                    var7 = field398[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field399[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field330[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method1027(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method2547(var12).field1024 || field263)) {
                        for (int var13 = 0; var13 < var11.field2633.length; var13++) {
                            if (var12 + 1 == var11.field2633[var13]) {
                                var7 += var11.field2649[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2661[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2128[field399[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2661[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1667.field58;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2133[var14]) {
                            var7 += field399[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method1027(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method2547(var18).field1024 || field263)) {
                        for (int var19 = 0; var19 < var17.field2633.length; var19++) {
                            if (var18 + 1 == var17.field2633[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field426;
                }
                if (var6 == 12) {
                    var7 = field427;
                }
                if (var6 == 13) {
                    int var20 = class154.field2661[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method711(var22);
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
                    var7 = (Statics.field1667.field744 >> 7) + Statics.field197;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1667.field738 >> 7) + Statics.field1905;
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

    @ObfuscatedName("l.cr(Led;IIB)V")
    public static final void method128(class152 arg0, int arg1, int arg2) {
        if (arg0.field2614 == 1) {
            method2593(arg0.field2632, "", 24, 0, 0, arg0.field2531);
        }
        if (arg0.field2614 == 2 && !field416) {
            String var3;
            if (class156.method1791(method533(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2573 == null || arg0.field2573.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2573;
            }
            if (var3 != null) {
                method2593(var3, class2.method741(65280) + arg0.field2631, 25, 0, -1, arg0.field2531);
            }
        }
        if (arg0.field2614 == 3) {
            method2593(class142.field2246, "", 26, 0, 0, arg0.field2531);
        }
        if (arg0.field2614 == 4) {
            method2593(arg0.field2632, "", 28, 0, 0, arg0.field2531);
        }
        if (arg0.field2614 == 5) {
            method2593(arg0.field2632, "", 29, 0, 0, arg0.field2531);
        }
        if (arg0.field2614 == 6 && field334 == null) {
            method2593(arg0.field2632, "", 30, 0, -1, arg0.field2531);
        }
        if (arg0.field2612 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2601; var6++) {
                for (int var7 = 0; var7 < arg0.field2535; var7++) {
                    int var8 = (arg0.field2629 + 32) * var7;
                    int var9 = (arg0.field2569 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2586[var5];
                        var9 += arg0.field2587[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field317 = var5;
                        Statics.field2872 = arg0;
                        if (arg0.field2633[var5] > 0) {
                            label361: {
                                class45 var10 = class45.method2547(arg0.field2633[var5] - 1);
                                if (field414 == 1) {
                                    int var11 = method533(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field93 != arg0.field2531 || Statics.field567 != var5) {
                                            method2593(class142.field2158, field415 + " " + class2.field26 + " " + class2.method741(16748608) + var10.field1021, 31, var10.field1043, var5, arg0.field2531);
                                        }
                                        break label361;
                                    }
                                }
                                if (field416) {
                                    int var13 = method533(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field723 & 0x10) == 16) {
                                            method2593(field491, field420 + " " + class2.field26 + " " + class2.method741(16748608) + var10.field1021, 32, var10.field1043, var5, arg0.field2531);
                                        }
                                        break label361;
                                    }
                                }
                                String[] var15 = var10.field1036;
                                if (field432) {
                                    var15 = method32(var15);
                                }
                                int var16 = method533(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != null && var15[var18] != null) {
                                            byte var19;
                                            if (var18 == 3) {
                                                var19 = 36;
                                            } else {
                                                var19 = 37;
                                            }
                                            method2593(var15[var18], class2.method741(16748608) + var10.field1021, var19, var10.field1043, var5, arg0.field2531);
                                        } else if (var18 == 4) {
                                            method2593(class142.field2193, class2.method741(16748608) + var10.field1021, 37, var10.field1043, var5, arg0.field2531);
                                        }
                                    }
                                }
                                int var20 = method533(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method2593(class142.field2158, class2.method741(16748608) + var10.field1021, 38, var10.field1043, var5, arg0.field2531);
                                }
                                int var22 = method533(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23 && var15 != null) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 33;
                                            }
                                            if (var24 == 1) {
                                                var25 = 34;
                                            }
                                            if (var24 == 2) {
                                                var25 = 35;
                                            }
                                            method2593(var15[var24], class2.method741(16748608) + var10.field1021, var25, var10.field1043, var5, arg0.field2531);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2589;
                                if (field432) {
                                    var26 = method32(var26);
                                }
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method2593(var26[var27], class2.method741(16748608) + var10.field1021, var28, var10.field1043, var5, arg0.field2531);
                                        }
                                    }
                                }
                                method2593(class142.field2285, class2.method741(16748608) + var10.field1021, 1005, var10.field1043, var5, arg0.field2531);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2530) {
            return;
        }
        if (field416) {
            int var29 = method533(arg0);
            boolean var30 = (var29 >> 21 & 0x1) != 0;
            if (var30 && (Statics.field723 & 0x20) == 32) {
                method2593(field491, field420 + " " + class2.field26 + " " + arg0.field2644, 58, 0, arg0.field2532, arg0.field2531);
            }
            return;
        }
        for (int var31 = 9; var31 >= 5; var31--) {
            String var32;
            if (!class156.method583(method533(arg0), var31) && arg0.field2618 == null) {
                var32 = null;
            } else if (arg0.field2592 == null || arg0.field2592.length <= var31 || arg0.field2592[var31] == null || arg0.field2592[var31].trim().length() == 0) {
                var32 = null;
            } else {
                var32 = arg0.field2592[var31];
            }
            if (var32 != null) {
                method2593(var32, arg0.field2644, 1007, var31 + 1, arg0.field2532, arg0.field2531);
            }
        }
        String var34;
        if (class156.method1791(method533(arg0)) == 0) {
            var34 = null;
        } else if (arg0.field2573 == null || arg0.field2573.trim().length() == 0) {
            var34 = null;
        } else {
            var34 = arg0.field2573;
        }
        if (var34 != null) {
            method2593(var34, arg0.field2644, 25, 0, arg0.field2532, arg0.field2531);
        }
        for (int var36 = 4; var36 >= 0; var36--) {
            String var37;
            if (!class156.method583(method533(arg0), var36) && arg0.field2618 == null) {
                var37 = null;
            } else if (arg0.field2592 == null || arg0.field2592.length <= var36 || arg0.field2592[var36] == null || arg0.field2592[var36].trim().length() == 0) {
                var37 = null;
            } else {
                var37 = arg0.field2592[var36];
            }
            if (var37 != null) {
                method2593(var37, arg0.field2644, 57, var36 + 1, arg0.field2532, arg0.field2531);
            }
        }
        if (class156.method2591(method533(arg0))) {
            method2593(class142.field2147, "", 30, 0, arg0.field2532, arg0.field2531);
        }
    }

    @ObfuscatedName("al.ch(IIIIIIIB)V")
    public static final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method525(arg0)) {
            method1(Statics.field2584[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("i.cd([Led;IIIIIIII)V")
    public static final void method1(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2530 || var9.field2612 == 0 || var9.field2598 || method533(var9) != 0 || field434 == var9) && var9.field2527 == arg1 && (!var9.field2530 || !method2719(var9))) {
                int var10 = var9.field2558 + arg6;
                int var11 = var9.field2571 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2612 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2612 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2535 + var10;
                    int var19 = var9.field2601 + var11;
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
                    int var22 = var9.field2535 + var10;
                    int var23 = var9.field2601 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field433 == var9) {
                    field283 = true;
                    field442 = var10;
                    field438 = var11;
                }
                if (!var9.field2530 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1996;
                    int var25 = class127.field1997 * -153904067;
                    if (class127.field2002 != 0) {
                        var24 = class127.field2003;
                        var25 = class127.field1999;
                    }
                    if (var9.field2585 == 1337) {
                        method465(var9);
                        if (!field359 && !field447 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3(var24, var25, var12, var13);
                        }
                    } else if (var9.field2585 == 1338) {
                        method421(var10, var11);
                    } else {
                        if (!field447 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method128(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2612 == 0) {
                            if (!var9.field2530 && method2719(var9) && Statics.field844 != var9) {
                                continue;
                            }
                            method1(arg0, var9.field2531, var12, var13, var14, var15, var10 - var9.field2544, var11 - var9.field2545);
                            if (var9.field2639 != null) {
                                method1(var9.field2639, var9.field2531, var12, var13, var14, var15, var10 - var9.field2544, var11 - var9.field2545);
                            }
                            class4 var26 = (class4) field371.method3218((long) var9.field2531);
                            if (var26 != null) {
                                if (var26.field63 == 0 && class127.field1996 >= var12 && class127.field1997 * -153904067 >= var13 && class127.field1996 < var14 && class127.field1997 * -153904067 < var15 && !field447 && !field431) {
                                    field460[0] = class142.field2377;
                                    field409[0] = "";
                                    field340[0] = 1006;
                                    field280 = 1;
                                }
                                method524(var26.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2530) {
                            if (var9.field2648 && class127.field1996 >= var12 && class127.field1997 * -153904067 >= var13 && class127.field1996 < var14 && class127.field1997 * -153904067 < var15) {
                                for (class1 var27 = (class1) field459.method3257(); var27 != null; var27 = (class1) field459.method3249()) {
                                    if (var27.field2) {
                                        var27.method3334();
                                        var27.field5.field2640 = false;
                                    }
                                }
                                if (Statics.field20 == 0) {
                                    field433 = null;
                                    field434 = null;
                                }
                                if (!field447) {
                                    field460[0] = class142.field2377;
                                    field409[0] = "";
                                    field340[0] = 1006;
                                    field280 = 1;
                                }
                            }
                            boolean var28;
                            if (class127.field1996 >= var12 && class127.field1997 * -153904067 >= var13 && class127.field1996 < var14 && class127.field1997 * -153904067 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class127.field1994 == 1 || !Statics.field346 && class127.field1994 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class127.field2002 == 1 || !Statics.field346 && class127.field2002 == 4) && class127.field2003 >= var12 && class127.field1999 >= var13 && class127.field2003 < var14 && class127.field1999 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                method1437(var9, class127.field2003 - var10, class127.field1999 - var11);
                            }
                            if (field433 != null && field433 != var9 && var28 && class156.method1986(method533(var9))) {
                                field312 = var9;
                            }
                            if (field434 == var9) {
                                field276 = true;
                                field268 = var10;
                                field388 = var11;
                            }
                            if (var9.field2598) {
                                if (var28 && field425 != 0 && var9.field2556 != null) {
                                    class1 var31 = new class1();
                                    var31.field2 = true;
                                    var31.field5 = var9;
                                    var31.field3 = field425;
                                    var31.field17 = var9.field2556;
                                    field459.method3251(var31);
                                }
                                if (field433 != null || Statics.field974 != null || field447) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2641 && var30) {
                                    var9.field2641 = true;
                                    if (var9.field2627 != null) {
                                        class1 var32 = new class1();
                                        var32.field2 = true;
                                        var32.field5 = var9;
                                        var32.field4 = class127.field2003 - var10;
                                        var32.field3 = class127.field1999 - var11;
                                        var32.field17 = var9.field2627;
                                        field459.method3251(var32);
                                    }
                                }
                                if (var9.field2641 && var29 && var9.field2603 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = true;
                                    var33.field5 = var9;
                                    var33.field4 = class127.field1996 - var10;
                                    var33.field3 = class127.field1997 * -153904067 - var11;
                                    var33.field17 = var9.field2603;
                                    field459.method3251(var33);
                                }
                                if (var9.field2641 && !var29) {
                                    var9.field2641 = false;
                                    if (var9.field2602 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = true;
                                        var34.field5 = var9;
                                        var34.field4 = class127.field1996 - var10;
                                        var34.field3 = class127.field1997 * -153904067 - var11;
                                        var34.field17 = var9.field2602;
                                        field461.method3251(var34);
                                    }
                                }
                                if (var29 && var9.field2542 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = true;
                                    var35.field5 = var9;
                                    var35.field4 = class127.field1996 - var10;
                                    var35.field3 = class127.field1997 * -153904067 - var11;
                                    var35.field17 = var9.field2542;
                                    field459.method3251(var35);
                                }
                                if (!var9.field2640 && var28) {
                                    var9.field2640 = true;
                                    if (var9.field2604 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = true;
                                        var36.field5 = var9;
                                        var36.field4 = class127.field1996 - var10;
                                        var36.field3 = class127.field1997 * -153904067 - var11;
                                        var36.field17 = var9.field2604;
                                        field459.method3251(var36);
                                    }
                                }
                                if (var9.field2640 && var28 && var9.field2605 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = true;
                                    var37.field5 = var9;
                                    var37.field4 = class127.field1996 - var10;
                                    var37.field3 = class127.field1997 * -153904067 - var11;
                                    var37.field17 = var9.field2605;
                                    field459.method3251(var37);
                                }
                                if (var9.field2640 && !var28) {
                                    var9.field2640 = false;
                                    if (var9.field2595 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = true;
                                        var38.field5 = var9;
                                        var38.field4 = class127.field1996 - var10;
                                        var38.field3 = class127.field1997 * -153904067 - var11;
                                        var38.field17 = var9.field2595;
                                        field461.method3251(var38);
                                    }
                                }
                                if (var9.field2617 != null) {
                                    class1 var39 = new class1();
                                    var39.field5 = var9;
                                    var39.field17 = var9.field2617;
                                    field266.method3251(var39);
                                }
                                if (var9.field2611 != null && field519 > var9.field2572) {
                                    if (var9.field2634 == null || field519 - var9.field2572 > 32) {
                                        class1 var44 = new class1();
                                        var44.field5 = var9;
                                        var44.field17 = var9.field2611;
                                        field459.method3251(var44);
                                    } else {
                                        label529: for (int var40 = var9.field2572; var40 < field519; var40++) {
                                            int var41 = field382[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var9.field2634.length; var42++) {
                                                if (var9.field2634[var42] == var41) {
                                                    class1 var43 = new class1();
                                                    var43.field5 = var9;
                                                    var43.field17 = var9.field2611;
                                                    field459.method3251(var43);
                                                    break label529;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2572 = field519;
                                }
                                if (var9.field2613 != null && field407 > var9.field2638) {
                                    if (var9.field2646 == null || field407 - var9.field2638 > 32) {
                                        class1 var49 = new class1();
                                        var49.field5 = var9;
                                        var49.field17 = var9.field2613;
                                        field459.method3251(var49);
                                    } else {
                                        label505: for (int var45 = var9.field2638; var45 < field407; var45++) {
                                            int var46 = field448[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2646.length; var47++) {
                                                if (var9.field2646[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field5 = var9;
                                                    var48.field17 = var9.field2613;
                                                    field459.method3251(var48);
                                                    break label505;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2638 = field407;
                                }
                                if (var9.field2615 != null && field451 > var9.field2645) {
                                    if (var9.field2580 == null || field451 - var9.field2645 > 32) {
                                        class1 var54 = new class1();
                                        var54.field5 = var9;
                                        var54.field17 = var9.field2615;
                                        field459.method3251(var54);
                                    } else {
                                        label481: for (int var50 = var9.field2645; var50 < field451; var50++) {
                                            int var51 = field450[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2580.length; var52++) {
                                                if (var9.field2580[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field5 = var9;
                                                    var53.field17 = var9.field2615;
                                                    field459.method3251(var53);
                                                    break label481;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2645 = field451;
                                }
                                if (field452 > var9.field2642 && var9.field2533 != null) {
                                    class1 var55 = new class1();
                                    var55.field5 = var9;
                                    var55.field17 = var9.field2533;
                                    field459.method3251(var55);
                                }
                                if (field453 > var9.field2642 && var9.field2606 != null) {
                                    class1 var56 = new class1();
                                    var56.field5 = var9;
                                    var56.field17 = var9.field2606;
                                    field459.method3251(var56);
                                }
                                if (field515 > var9.field2642 && var9.field2623 != null) {
                                    class1 var57 = new class1();
                                    var57.field5 = var9;
                                    var57.field17 = var9.field2623;
                                    field459.method3251(var57);
                                }
                                if (field455 > var9.field2642 && var9.field2624 != null) {
                                    class1 var58 = new class1();
                                    var58.field5 = var9;
                                    var58.field17 = var9.field2624;
                                    field459.method3251(var58);
                                }
                                var9.field2642 = field439;
                                if (var9.field2620 != null) {
                                    for (int var59 = 0; var59 < field478; var59++) {
                                        class1 var60 = new class1();
                                        var60.field5 = var9;
                                        var60.field8 = field374[var59];
                                        var60.field1 = field479[var59];
                                        var60.field17 = var9.field2620;
                                        field459.method3251(var60);
                                    }
                                }
                            }
                        }
                        if (!var9.field2530 && field433 == null && Statics.field974 == null && !field447) {
                            if ((var9.field2630 >= 0 || var9.field2550 != 0) && class127.field1996 >= var12 && class127.field1997 * -153904067 >= var13 && class127.field1996 < var14 && class127.field1997 * -153904067 < var15) {
                                if (var9.field2630 >= 0) {
                                    Statics.field844 = arg0[var9.field2630];
                                } else {
                                    Statics.field844 = var9;
                                }
                            }
                            if (var9.field2612 == 8 && class127.field1996 >= var12 && class127.field1997 * -153904067 >= var13 && class127.field1996 < var14 && class127.field1997 * -153904067 < var15) {
                                Statics.field73 = var9;
                            }
                            if (var9.field2547 > var9.field2601) {
                                int var61 = var9.field2535 + var10;
                                int var62 = var9.field2601;
                                int var63 = var9.field2547;
                                int var64 = class127.field1996;
                                int var65 = class127.field1997 * -153904067;
                                if (field341) {
                                    field342 = 32;
                                } else {
                                    field342 = 0;
                                }
                                field341 = false;
                                if (class127.field1994 == 1 || !Statics.field346 && class127.field1994 == 4) {
                                    if (var64 >= var61 && var64 < var61 + 16 && var65 >= var11 && var65 < var11 + 16) {
                                        var9.field2545 -= 4;
                                        method465(var9);
                                    } else if (var64 >= var61 && var64 < var61 + 16 && var65 >= var11 + var62 - 16 && var65 < var11 + var62) {
                                        var9.field2545 += 4;
                                        method465(var9);
                                    } else if (var64 >= var61 - field342 && var64 < field342 + var61 + 16 && var65 >= var11 + 16 && var65 < var11 + var62 - 16) {
                                        int var66 = (var62 - 32) * var62 / var63;
                                        if (var66 < 8) {
                                            var66 = 8;
                                        }
                                        int var67 = var65 - var11 - 16 - var66 / 2;
                                        int var68 = var62 - 32 - var66;
                                        var9.field2545 = (var63 - var62) * var67 / var68;
                                        method465(var9);
                                        field341 = true;
                                    }
                                }
                                if (field425 != 0) {
                                    int var69 = var9.field2535;
                                    if (var64 >= var61 - var69 && var65 >= var11 && var64 < var61 + 16 && var65 <= var11 + var62) {
                                        var9.field2545 += field425 * 45;
                                        method465(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cp(III)V")
    public static final void method27(int arg0, int arg1) {
        if (class152.method525(arg0)) {
            method746(Statics.field2584[arg0], arg1);
        }
    }

    @ObfuscatedName("ao.cu([Led;II)V")
    public static final void method746(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2612 == 0) {
                    if (var3.field2639 != null) {
                        method746(var3.field2639, arg1);
                    }
                    class4 var4 = (class4) field371.method3218((long) var3.field2531);
                    if (var4 != null) {
                        method27(var4.field67, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2625 != null) {
                    class1 var5 = new class1();
                    var5.field5 = var3;
                    var5.field17 = var3.field2625;
                    class32.method3536(var5);
                }
                if (arg1 == 1 && var3.field2546 != null) {
                    if (var3.field2532 >= 0) {
                        class152 var6 = class152.method1027(var3.field2531);
                        if (var6 == null || var6.field2639 == null || var3.field2532 >= var6.field2639.length || var6.field2639[var3.field2532] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field5 = var3;
                    var7.field17 = var3.field2546;
                    class32.method3536(var7);
                }
            }
        }
    }

    @ObfuscatedName("bc.cf(Led;IIB)V")
    public static final void method1437(class152 arg0, int arg1, int arg2) {
        if (field433 != null || field447 || arg0 == null) {
            return;
        }
        class152 var3 = arg0;
        int var4 = method533(arg0);
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
                var3 = class152.method1027(var3.field2527);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class152 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2593;
        }
        if (var9 == null) {
            return;
        }
        field433 = arg0;
        class152 var11 = arg0;
        int var12 = method533(arg0);
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
                var11 = class152.method1027(var11.field2527);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class152 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2593;
        }
        field434 = var17;
        field293 = arg1;
        field436 = arg2;
        Statics.field20 = 0;
        field444 = false;
        if (field280 > 0) {
            method2520(field280 - 1);
        }
        return;
    }

    @ObfuscatedName("p.cj(I)V")
    public static final void method503() {
        method465(field433);
        Statics.field20++;
        if (field283 && field276) {
            int var0 = class127.field1996;
            int var1 = class127.field1997 * -153904067;
            int var2 = var0 - field293;
            int var3 = var1 - field436;
            if (var2 < field268) {
                var2 = field268;
            }
            if (field433.field2535 + var2 > field268 + field434.field2535) {
                var2 = field268 + field434.field2535 - field433.field2535;
            }
            if (var3 < field388) {
                var3 = field388;
            }
            if (field433.field2601 + var3 > field388 + field434.field2601) {
                var3 = field388 + field434.field2601 - field433.field2601;
            }
            int var4 = var2 - field442;
            int var5 = var3 - field438;
            int var6 = field433.field2594;
            if (Statics.field20 > field433.field2534 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field444 = true;
            }
            int var7 = field434.field2544 + (var2 - field268);
            int var8 = field434.field2545 + (var3 - field388);
            if (field433.field2607 != null && field444) {
                class1 var9 = new class1();
                var9.field5 = field433;
                var9.field4 = var7;
                var9.field3 = var8;
                var9.field17 = field433.field2607;
                class32.method3536(var9);
            }
            if (class127.field1994 == 0) {
                if (field444) {
                    if (field433.field2566 != null) {
                        class1 var10 = new class1();
                        var10.field5 = field433;
                        var10.field4 = var7;
                        var10.field3 = var8;
                        var10.field7 = field312;
                        var10.field17 = field433.field2566;
                        class32.method3536(var10);
                    }
                    if (field312 != null) {
                        class152 var11 = field433;
                        int var12 = method533(var11);
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
                                var11 = class152.method1027(var11.field2527);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field302.method2386(3);
                            field302.method2209(field312.field2635);
                            field302.method2180(field312.field2532);
                            field302.method2235(field433.field2532);
                            field302.method2190(field433.field2531);
                            field302.method2180(field433.field2635);
                            field302.method2140(field312.field2531);
                        }
                    }
                } else if ((field401 == 1 || method3165(field280 - 1)) && field280 > 2) {
                    method1790(field442 + field293, field438 + field436);
                } else if (field280 > 0) {
                    method1794(field442 + field293, field438 + field436);
                }
                field433 = null;
            }
        } else if (Statics.field20 > 1) {
            field433 = null;
        }
    }

    @ObfuscatedName("dz.cx(II)V")
    public static void method2520(int arg0) {
        Statics.field2054 = new class27();
        Statics.field2054.field645 = field404[arg0];
        Statics.field2054.field642 = field405[arg0];
        Statics.field2054.field648 = field340[arg0];
        Statics.field2054.field644 = field411[arg0];
        Statics.field2054.field641 = field460[arg0];
    }

    @ObfuscatedName("cb.cz(III)V")
    public static void method1794(int arg0, int arg1) {
        class27 var2 = Statics.field2054;
        Statics.method822(var2.field645, var2.field642, var2.field648, var2.field644, var2.field641, var2.field641, arg0, arg1);
        Statics.field2054 = null;
    }

    @ObfuscatedName("a.cs(Led;B)V")
    public static void method465(class152 arg0) {
        if (field464 == arg0.field2647) {
            field465[arg0.field2616] = true;
        }
    }

    @ObfuscatedName("gy.ci(B)V")
    public static void method3336() {
        for (class4 var0 = (class4) field371.method3220(); var0 != null; var0 = (class4) field371.method3221()) {
            int var1 = var0.field67;
            if (class152.method525(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2584[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2530;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2871;
                    class152 var6 = class152.method1027(var5);
                    if (var6 != null) {
                        method465(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cy([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method32(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("eb.cc(II)V")
    public static final void method2714(int arg0) {
        if (!class152.method525(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2637 = 0;
                var3.field2529 = 0;
            }
        }
    }

    @ObfuscatedName("o.cm([Led;II)V")
    public static final void method137(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2527 == arg1 && (!var3.field2530 || !method2719(var3))) {
                if (var3.field2612 == 0) {
                    if (!var3.field2530 && method2719(var3) && Statics.field844 != var3) {
                        continue;
                    }
                    method137(arg0, var3.field2531);
                    if (var3.field2639 != null) {
                        method137(var3.field2639, var3.field2531);
                    }
                    class4 var4 = (class4) field371.method3218((long) var3.field2531);
                    if (var4 != null) {
                        int var5 = var4.field67;
                        if (class152.method525(var5)) {
                            method137(Statics.field2584[var5], -1);
                        }
                    }
                }
                if (var3.field2612 == 6) {
                    if (var3.field2600 != -1 || var3.field2568 != -1) {
                        boolean var6 = method127(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2568;
                        } else {
                            var7 = var3.field2600;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method3551(var7);
                            var3.field2529 += field336;
                            while (var3.field2529 > var8.field906[var3.field2637]) {
                                var3.field2529 -= var8.field906[var3.field2637];
                                var3.field2637++;
                                if (var3.field2637 >= var8.field919.length) {
                                    var3.field2637 -= var8.field913;
                                    if (var3.field2637 < 0 || var3.field2637 >= var8.field919.length) {
                                        var3.field2637 = 0;
                                    }
                                }
                                method465(var3);
                            }
                        }
                    }
                    if (var3.field2575 != 0 && !var3.field2530) {
                        int var9 = var3.field2575 >> 16;
                        int var10 = var3.field2575 << 16 >> 16;
                        int var11 = field336 * var9;
                        int var12 = field336 * var10;
                        var3.field2636 = var3.field2636 + var11 & 0x7FF;
                        var3.field2543 = var3.field2543 + var12 & 0x7FF;
                        method465(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.ce(II)V")
    public static final void method612(int arg0) {
        method3336();
        for (class20 var1 = (class20) class20.field553.method3257(); var1 != null; var1 = (class20) class20.field553.method3249()) {
            if (var1.field563 != null) {
                var1.method480();
            }
        }
        int var2 = class46.method2586(arg0).field1066;
        if (var2 == 0) {
            return;
        }
        int var3 = class154.field2661[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1803(0.9D);
                ((class88) Statics.field1478).method1883(0.9D);
            }
            if (var3 == 2) {
                class84.method1803(0.8D);
                ((class88) Statics.field1478).method1883(0.8D);
            }
            if (var3 == 3) {
                class84.method1803(0.7D);
                ((class88) Statics.field1478).method1883(0.7D);
            }
            if (var3 == 4) {
                class84.method1803(0.6D);
                ((class88) Statics.field1478).method1883(0.6D);
            }
            class45.method2846();
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
            if (field256 != var4) {
                if (field256 == 0 && field494 != -1) {
                    class161.method2666(Statics.field2899, field494, 0, var4, false);
                    field495 = false;
                } else if (var4 == 0) {
                    class161.method1028();
                    field495 = false;
                } else {
                    class161.method2845(var4);
                }
                field256 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field496 = 127;
            }
            if (var3 == 1) {
                field496 = 96;
            }
            if (var3 == 2) {
                field496 = 64;
            }
            if (var3 == 3) {
                field496 = 32;
            }
            if (var3 == 4) {
                field496 = 0;
            }
        }
        if (var2 == 5) {
            field401 = var3;
        }
        if (var2 == 6) {
            field423 = var3;
        }
        if (var2 == 9) {
            field424 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field497 = 127;
            }
            if (var3 == 1) {
                field497 = 96;
            }
            if (var3 == 2) {
                field497 = 64;
            }
            if (var3 == 3) {
                field497 = 32;
            }
            if (var3 == 4) {
                field497 = 0;
            }
        }
        if (var2 == 17) {
            field429 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field524, class18.field530, class18.field525 };
            class18[] var6 = var5;
            int var7 = 0;
            class18 var9;
            while (true) {
                if (var7 >= var6.length) {
                    var9 = null;
                    break;
                }
                class18 var8 = var6[var7];
                if (var3 == var8.method464()) {
                    var9 = var8;
                    break;
                }
                var7++;
            }
            field385 = (class18) var9;
            if (field385 == null) {
                field385 = class18.field530;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field304 = -1;
        } else {
            field304 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("cb.cn(Lv;ZI)V")
    public static final void method1792(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field2871;
        arg0.method3334();
        if (arg1 && var2 != -1 && Statics.field2521[var2]) {
            Statics.field2522.method2752(var2);
            if (Statics.field2584[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2584[var2].length; var5++) {
                    if (Statics.field2584[var2][var5] != null) {
                        if (Statics.field2584[var2][var5].field2612 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2584[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2584[var2] = null;
                }
                Statics.field2521[var2] = false;
            }
        }
        for (class179 var6 = (class179) field462.method3220(); var6 != null; var6 = (class179) field462.method3221()) {
            if ((long) var2 == (var6.field2871 >> 48 & 0xFFFFL)) {
                var6.method3334();
            }
        }
        class152 var7 = class152.method1027(var3);
        if (var7 != null) {
            method465(var7);
        }
        method1425();
        if (field421 != -1) {
            method27(field421, 1);
        }
    }

    @ObfuscatedName("s.cl(Led;I)Z")
    public static final boolean method77(class152 arg0) {
        int var1 = arg0.field2585;
        if (var1 == 205) {
            field309 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field516.method2972(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field516.method2960(var4, var5 == 1);
        }
        if (var1 == 324) {
            field516.method2949(false);
        }
        if (var1 == 325) {
            field516.method2949(true);
        }
        if (var1 == 326) {
            field302.method2386(127);
            field516.method2970(field302);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dh.co(IIIB)V")
    public static final void method2486(int arg0, int arg1, int arg2) {
        method1897();
        class73.method1539(arg0, arg1, Statics.field60.field1328 + arg0, Statics.field60.field1326 + arg1);
        if (field492 == 2 || field492 == 5) {
            class73.method1587(arg0 + 25, arg1 + 5, 0, Statics.field193, Statics.field210);
        } else {
            int var3 = field344 + field331 & 0x7FF;
            int var4 = Statics.field1667.field744 / 32 + 48;
            int var5 = 464 - Statics.field1667.field738 / 32;
            Statics.field653.method1453(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field333 + 256, Statics.field193, Statics.field210);
            for (int var6 = 0; var6 < field485; var6++) {
                int var7 = field486[var6] * 4 + 2 - Statics.field1667.field744 / 32;
                int var8 = field292[var6] * 4 + 2 - Statics.field1667.field738 / 32;
                method136(arg0, arg1, var7, var8, field488[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field394[Statics.field2643][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1667.field744 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1667.field738 / 32;
                        method136(arg0, arg1, var12, var13, Statics.field943[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field300; var14++) {
                class30 var15 = field299[field301[var14]];
                if (var15 != null && var15.method23()) {
                    class35 var16 = var15.field705;
                    if (var16 != null && var16.field832 != null) {
                        var16 = var16.method654();
                    }
                    if (var16 != null && var16.field808 && var16.field817) {
                        int var17 = var15.field744 / 32 - Statics.field1667.field744 / 32;
                        int var18 = var15.field738 / 32 - Statics.field1667.field738 / 32;
                        method136(arg0, arg1, var17, var18, Statics.field943[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field305; var19++) {
                class3 var20 = field379[field381[var19]];
                if (var20 != null && var20.method23() && !var20.field57) {
                    int var21 = var20.field744 / 32 - Statics.field1667.field744 / 32;
                    int var22 = var20.field738 / 32 - Statics.field1667.field738 / 32;
                    boolean var23 = false;
                    if (method2997(var20.field42, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field529; var25++) {
                        if (var20.field42.equals(Statics.field59[var25].field578)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1667.field56 != 0 && var20.field56 != 0 && Statics.field1667.field56 == var20.field56) {
                        var26 = true;
                    }
                    if (var23) {
                        method136(arg0, arg1, var21, var22, Statics.field943[3]);
                    } else if (var26) {
                        method136(arg0, arg1, var21, var22, Statics.field943[4]);
                    } else if (var24) {
                        method136(arg0, arg1, var21, var22, Statics.field943[5]);
                    } else {
                        method136(arg0, arg1, var21, var22, Statics.field943[2]);
                    }
                }
            }
            if (field278 != 0 && field269 % 20 < 10) {
                if (field278 == 1 && field345 >= 0 && field345 < field299.length) {
                    class30 var27 = field299[field345];
                    if (var27 != null) {
                        int var28 = var27.field744 / 32 - Statics.field1667.field744 / 32;
                        int var29 = var27.field738 / 32 - Statics.field1667.field738 / 32;
                        method1988(arg0, arg1, var28, var29, Statics.field1860[1]);
                    }
                }
                if (field278 == 2) {
                    int var30 = field281 * 4 - Statics.field197 * 4 + 2 - Statics.field1667.field744 / 32;
                    int var31 = field282 * 4 - Statics.field1905 * 4 + 2 - Statics.field1667.field738 / 32;
                    method1988(arg0, arg1, var30, var31, Statics.field1860[1]);
                }
                if (field278 == 10 && field288 >= 0 && field288 < field379.length) {
                    class3 var32 = field379[field288];
                    if (var32 != null) {
                        int var33 = var32.field744 / 32 - Statics.field1667.field744 / 32;
                        int var34 = var32.field738 / 32 - Statics.field1667.field738 / 32;
                        method1988(arg0, arg1, var33, var34, Statics.field1860[1]);
                    }
                }
            }
            if (field489 != 0) {
                int var35 = field489 * 4 + 2 - Statics.field1667.field744 / 32;
                int var36 = field430 * 4 + 2 - Statics.field1667.field738 / 32;
                method136(arg0, arg1, var35, var36, Statics.field1860[0]);
            }
            if (!Statics.field1667.field57) {
                class73.method1545(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field492 < 3) {
            Statics.field2657.method1453(arg0, arg1, 33, 33, 25, 25, field344, 256, Statics.field957, Statics.field2099);
        } else {
            class73.method1587(arg0, arg1, 0, Statics.field957, Statics.field2099);
        }
        if (field467[arg2]) {
            Statics.field60.method1599(arg0, arg1);
        }
        field466[arg2] = true;
    }

    @ObfuscatedName("cs.cw(IIIILbp;B)V")
    public static final void method1988(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method136(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field344 + field331 & 0x7FF;
        int var7 = class84.field1464[var6];
        int var8 = class84.field1463[var6];
        int var9 = var7 * 256 / (field333 + 256);
        int var10 = var8 * 256 / (field333 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1071.method1463(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("o.dd(IIIILbp;I)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field344 + field331 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1464[var5];
        int var8 = class84.field1463[var5];
        int var9 = var7 * 256 / (field333 + 256);
        int var10 = var8 * 256 / (field333 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1466(Statics.field60, arg0 + 94 + var11 - arg4.field1315 / 2 + 4, arg1 + 83 - var12 - arg4.field1313 / 2 - 4);
        } else {
            arg4.method1470(arg0 + 94 + var11 - arg4.field1315 / 2 + 4, arg1 + 83 - var12 - arg4.field1313 / 2 - 4);
        }
    }

    @ObfuscatedName("fk.dy(Ljava/lang/String;ZI)Z")
    public static boolean method2997(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method575(arg0, Statics.field262);
        for (int var3 = 0; var3 < field510; var3++) {
            if (var2.equalsIgnoreCase(class200.method575(field512[var3].field237, Statics.field262)) && (!arg1 || field512[var3].field233 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method575(Statics.field1667.field42, Statics.field262))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.dm(Ljava/lang/String;B)Z")
    public static boolean method85(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method575(arg0, Statics.field262);
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field400[var2];
            if (var1.equalsIgnoreCase(class200.method575(var3.field138, Statics.field262))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method575(var3.field139, Statics.field262))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("k.dl(Ljava/lang/String;B)V")
    public static final void method501(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method575(arg0, Statics.field262);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field400[var2];
            String var4 = var3.field138;
            String var5 = class200.method575(var4, Statics.field262);
            if (Statics.method849(arg0, var1, var4, var5)) {
                field498--;
                for (int var6 = var2; var6 < field498; var6++) {
                    field400[var6] = field400[var6 + 1];
                }
                field453 = field439;
                field302.method2386(63);
                field302.method2137(Statics.method1625(arg0));
                field302.method2148(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cz.du(Ljava/lang/String;II)V")
    public static final void method1985(String arg0, int arg1) {
        field302.method2386(126);
        field302.method2137(Statics.method1625(arg0) + 1);
        field302.method2142(arg1);
        field302.method2148(arg0);
    }

    @ObfuscatedName("ch.dp(Ljava/lang/String;B)V")
    public static final void method1881(String arg0) {
        if (Statics.field59 != null) {
            field302.method2386(240);
            field302.method2137(Statics.method1625(arg0));
            field302.method2148(arg0);
        }
    }

    @ObfuscatedName("au.do(Led;I)I")
    public static int method533(class152 arg0) {
        class179 var1 = (class179) field462.method3218(((long) arg0.field2531 << 32) + (long) arg0.field2532);
        return var1 == null ? arg0.field2590 : var1.field2856;
    }

    @ObfuscatedName("en.dg(Led;B)Z")
    public static boolean method2719(class152 arg0) {
        if (field431) {
            if (method533(arg0) != 0) {
                return false;
            }
            if (arg0.field2612 == 0) {
                return false;
            }
        }
        return arg0.field2562;
    }

    @ObfuscatedName("fj.ds(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method3179(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field260 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field260 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field260 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field260 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field260 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field265 + "/";
    }
}

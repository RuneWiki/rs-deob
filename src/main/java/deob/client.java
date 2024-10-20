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

    @ObfuscatedName("client.i")
    public static boolean field510 = true;

    @ObfuscatedName("client.g")
    public static int field262 = 1;

    @ObfuscatedName("client.b")
    public static int field263 = 0;

    @ObfuscatedName("client.l")
    public static int field265 = 0;

    @ObfuscatedName("client.s")
    public static boolean field401 = false;

    @ObfuscatedName("client.f")
    public static boolean field433 = false;

    @ObfuscatedName("client.p")
    public static int field267 = 0;

    @ObfuscatedName("client.w")
    public static class197[] field321 = new class197[4];

    @ObfuscatedName("client.j")
    public static int field269 = 0;

    @ObfuscatedName("client.c")
    public static boolean field521 = true;

    @ObfuscatedName("client.d")
    public static int field442 = 0;

    @ObfuscatedName("client.a")
    public static long field508 = 1L;

    @ObfuscatedName("client.r")
    public static int field325 = -1;

    @ObfuscatedName("client.t")
    public static int field274 = -1;

    @ObfuscatedName("client.k")
    public static int field275 = -1;

    @ObfuscatedName("client.n")
    public static boolean field276 = true;

    @ObfuscatedName("client.z")
    public static boolean field277 = false;

    @ObfuscatedName("client.av")
    public static int field349 = 0;

    @ObfuscatedName("client.ao")
    public static int field279 = 0;

    @ObfuscatedName("client.am")
    public static int field280 = 0;

    @ObfuscatedName("client.ac")
    public static int field515 = 0;

    @ObfuscatedName("client.ak")
    public static int field478 = 0;

    @ObfuscatedName("client.ag")
    public static int field283 = 0;

    @ObfuscatedName("client.ap")
    public static int field299 = 0;

    @ObfuscatedName("client.ah")
    public static int field514 = 0;

    @ObfuscatedName("client.an")
    public static int field286 = 0;

    @ObfuscatedName("client.ay")
    public static class107 field329 = new class107(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static class18 field288 = class18.field528;

    @ObfuscatedName("client.aw")
    public static int field289 = 0;

    @ObfuscatedName("client.au")
    public static int field290 = 0;

    @ObfuscatedName("client.ai")
    public static int field291 = 0;

    @ObfuscatedName("client.by")
    public static int field282 = 0;

    @ObfuscatedName("client.bn")
    public static int field284 = 0;

    @ObfuscatedName("client.bh")
    public static int field295 = 0;

    @ObfuscatedName("client.bk")
    public static int field296 = 0;

    @ObfuscatedName("client.bq")
    public static int field297 = 0;

    @ObfuscatedName("client.bj")
    public static class30[] field298 = new class30[32768];

    @ObfuscatedName("client.bt")
    public static int field351 = 0;

    @ObfuscatedName("client.bu")
    public static int[] field300 = new int[32768];

    @ObfuscatedName("client.cf")
    public static class110 field402 = new class110(5000);

    @ObfuscatedName("client.cu")
    public static class110 field303 = new class110(5000);

    @ObfuscatedName("client.cq")
    public static class110 field448 = new class110(5000);

    @ObfuscatedName("client.cp")
    public static int field305 = 0;

    @ObfuscatedName("client.ch")
    public static int field306 = 0;

    @ObfuscatedName("client.ck")
    public static int field311 = 0;

    @ObfuscatedName("client.cv")
    public static int field308 = 0;

    @ObfuscatedName("client.cw")
    public static int field309 = 0;

    @ObfuscatedName("client.ct")
    public static int field310 = 0;

    @ObfuscatedName("client.cx")
    public static int field376 = 0;

    @ObfuscatedName("client.cs")
    public static int field407 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field313 = false;

    @ObfuscatedName("client.cg")
    public static int field315 = 0;

    @ObfuscatedName("client.cc")
    public static int field316 = 0;

    @ObfuscatedName("client.dd")
    public static int field317 = 1;

    @ObfuscatedName("client.ds")
    public static int field516 = 0;

    @ObfuscatedName("client.dk")
    public static int field281 = 1;

    @ObfuscatedName("client.dw")
    public static int field320 = 0;

    @ObfuscatedName("client.db")
    public static boolean field438 = false;

    @ObfuscatedName("client.di")
    public static int[][][] field343 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field373 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field426 = 0;

    @ObfuscatedName("client.dv")
    public static int field374 = 2;

    @ObfuscatedName("client.dr")
    public static int field327 = 0;

    @ObfuscatedName("client.du")
    public static int field328 = 2;

    @ObfuscatedName("client.dx")
    public static int field365 = 0;

    @ObfuscatedName("client.dt")
    public static int field330 = 1;

    @ObfuscatedName("client.dq")
    public static int field301 = 0;

    @ObfuscatedName("client.dm")
    public static int field332 = 0;

    @ObfuscatedName("client.dj")
    public static int field333 = 2;

    @ObfuscatedName("client.de")
    public static int field334 = 0;

    @ObfuscatedName("client.eh")
    public static int field384 = 1;

    @ObfuscatedName("client.et")
    public static int field336 = 0;

    @ObfuscatedName("client.ev")
    public static int field266 = 0;

    @ObfuscatedName("client.ex")
    public static int field278 = 2301979;

    @ObfuscatedName("client.ec")
    public static int field339 = 5063219;

    @ObfuscatedName("client.en")
    public static int field340 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field341 = 7759444;

    @ObfuscatedName("client.ed")
    public static boolean field342 = false;

    @ObfuscatedName("client.fe")
    public static int field259 = 0;

    @ObfuscatedName("client.fj")
    public static int field344 = 128;

    @ObfuscatedName("client.fp")
    public static int field345 = 0;

    @ObfuscatedName("client.fu")
    public static int field322 = 0;

    @ObfuscatedName("client.fk")
    public static int field364 = 0;

    @ObfuscatedName("client.ff")
    public static int field268 = 0;

    @ObfuscatedName("client.fr")
    public static int field432 = 0;

    @ObfuscatedName("client.fo")
    public static int field350 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field497 = false;

    @ObfuscatedName("client.fh")
    public static int field352 = 0;

    @ObfuscatedName("client.fx")
    public static int field356 = 0;

    @ObfuscatedName("client.ft")
    public static int field354 = 50;

    @ObfuscatedName("client.fm")
    public static int[] field431 = new int[field354];

    @ObfuscatedName("client.fc")
    public static int[] field293 = new int[field354];

    @ObfuscatedName("client.fv")
    public static int[] field357 = new int[field354];

    @ObfuscatedName("client.fl")
    public static int[] field358 = new int[field354];

    @ObfuscatedName("client.fq")
    public static int[] field359 = new int[field354];

    @ObfuscatedName("client.fi")
    public static int[] field360 = new int[field354];

    @ObfuscatedName("client.fa")
    public static int[] field361 = new int[field354];

    @ObfuscatedName("client.gi")
    public static String[] field362 = new String[field354];

    @ObfuscatedName("client.gh")
    public static int[][] field363 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field487 = 0;

    @ObfuscatedName("client.gc")
    public static int field285 = -1;

    @ObfuscatedName("client.gx")
    public static int field366 = -1;

    @ObfuscatedName("client.gs")
    public static int field367 = 0;

    @ObfuscatedName("client.gq")
    public static int field368 = 0;

    @ObfuscatedName("client.gn")
    public static int field307 = 0;

    @ObfuscatedName("client.gu")
    public static int field370 = 0;

    @ObfuscatedName("client.gy")
    public static int field371 = 0;

    @ObfuscatedName("client.gr")
    public static int field372 = 0;

    @ObfuscatedName("client.gb")
    public static int field319 = 0;

    @ObfuscatedName("client.ge")
    public static int field412 = 0;

    @ObfuscatedName("client.gd")
    public static int field375 = 0;

    @ObfuscatedName("client.ga")
    public static int field270 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field377 = false;

    @ObfuscatedName("client.gw")
    public static int field378 = 0;

    @ObfuscatedName("client.gf")
    public static int field331 = 0;

    @ObfuscatedName("client.gz")
    public static class3[] field380 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field483 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field382 = new int[2048];

    @ObfuscatedName("client.ht")
    public static int field335 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field507 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class107[] field385 = new class107[2048];

    @ObfuscatedName("client.hz")
    public static int field386 = -1;

    @ObfuscatedName("client.hn")
    public static int field387 = 0;

    @ObfuscatedName("client.hs")
    public static int field388 = 0;

    @ObfuscatedName("client.hg")
    public static int[] field389 = new int[1000];

    @ObfuscatedName("client.hr")
    public static final int[] field390 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field391 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field392 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field326 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field394 = -1;

    @ObfuscatedName("client.hc")
    public static class177[][][] field395 = new class177[4][104][104];

    @ObfuscatedName("client.ho")
    public static class177 field396 = new class177();

    @ObfuscatedName("client.hq")
    public static class177 field397 = new class177();

    @ObfuscatedName("client.he")
    public static class177 field398 = new class177();

    @ObfuscatedName("client.hu")
    public static int[] field294 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field400 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field436 = new int[25];

    @ObfuscatedName("client.hi")
    public static int field443 = 0;

    @ObfuscatedName("client.hv")
    public static boolean field403 = false;

    @ObfuscatedName("client.im")
    public static int field480 = 0;

    @ObfuscatedName("client.io")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field406 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field441 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field408 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field409 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field410 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field411 = -1;

    @ObfuscatedName("client.ig")
    public static int field399 = -1;

    @ObfuscatedName("client.iw")
    public static int field413 = 0;

    @ObfuscatedName("client.iq")
    public static int field414 = 50;

    @ObfuscatedName("client.iv")
    public static int field430 = 0;

    @ObfuscatedName("client.it")
    public static String field416 = null;

    @ObfuscatedName("client.ia")
    public static boolean field417 = false;

    @ObfuscatedName("client.id")
    public static int field418 = -1;

    @ObfuscatedName("client.il")
    public static int field419 = -1;

    @ObfuscatedName("client.jp")
    public static String field420 = null;

    @ObfuscatedName("client.jn")
    public static String field421 = null;

    @ObfuscatedName("client.jl")
    public static int field422 = -1;

    @ObfuscatedName("client.jz")
    public static class174 field423 = new class174(8);

    @ObfuscatedName("client.jf")
    public static int field393 = 0;

    @ObfuscatedName("client.jg")
    public static int field425 = 0;

    @ObfuscatedName("client.jh")
    public static class152 field449 = null;

    @ObfuscatedName("client.jx")
    public static int field271 = 0;

    @ObfuscatedName("client.je")
    public static int field428 = 0;

    @ObfuscatedName("client.jb")
    public static int field429 = 0;

    @ObfuscatedName("client.jv")
    public static int field444 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field424 = false;

    @ObfuscatedName("client.ja")
    public static boolean field470 = false;

    @ObfuscatedName("client.ju")
    public static boolean field494 = false;

    @ObfuscatedName("client.jt")
    public static class152 field434 = null;

    @ObfuscatedName("client.jw")
    public static class152 field435 = null;

    @ObfuscatedName("client.ji")
    public static int field324 = 0;

    @ObfuscatedName("client.jm")
    public static int field437 = 0;

    @ObfuscatedName("client.jo")
    public static class152 field379 = null;

    @ObfuscatedName("client.jr")
    public static boolean field404 = false;

    @ObfuscatedName("client.jy")
    public static int field440 = -1;

    @ObfuscatedName("client.jj")
    public static int field439 = -1;

    @ObfuscatedName("client.js")
    public static boolean field505 = false;

    @ObfuscatedName("client.jd")
    public static int field348 = -1;

    @ObfuscatedName("client.jq")
    public static int field415 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field445 = false;

    @ObfuscatedName("client.ki")
    public static int field446 = 1;

    @ObfuscatedName("client.kd")
    public static int[] field447 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field450 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field337 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field261 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field451 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field452 = 0;

    @ObfuscatedName("client.ku")
    public static int field453 = 0;

    @ObfuscatedName("client.kn")
    public static int field458 = 0;

    @ObfuscatedName("client.kw")
    public static int field455 = 0;

    @ObfuscatedName("client.ks")
    public static int field456 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field457 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field488 = new String[1000];

    @ObfuscatedName("client.km")
    public static int field459 = 0;

    @ObfuscatedName("client.kr")
    public static class177 field460 = new class177();

    @ObfuscatedName("client.kg")
    public static class177 field461 = new class177();

    @ObfuscatedName("client.kc")
    public static class177 field273 = new class177();

    @ObfuscatedName("client.kf")
    public static class174 field463 = new class174(512);

    @ObfuscatedName("client.ly")
    public static int field464 = 0;

    @ObfuscatedName("client.lf")
    public static int field465 = -2;

    @ObfuscatedName("client.lo")
    public static boolean[] field485 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field467 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field353 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static int[] field469 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field312 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field318 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field473 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field474 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field475 = 0;

    @ObfuscatedName("client.le")
    public static int field476 = 0;

    @ObfuscatedName("client.lb")
    public static long[] field477 = new long[100];

    @ObfuscatedName("client.lt")
    public static int field323 = 0;

    @ObfuscatedName("client.lx")
    public static int field479 = 0;

    @ObfuscatedName("client.li")
    public static int[] field304 = new int[128];

    @ObfuscatedName("client.lu")
    public static int[] field481 = new int[128];

    @ObfuscatedName("client.lc")
    public static long field383 = -1L;

    @ObfuscatedName("client.lj")
    public static String field302 = null;

    @ObfuscatedName("client.lv")
    public static String field484 = null;

    @ObfuscatedName("client.ms")
    public static int field498 = -1;

    @ObfuscatedName("client.mg")
    public static int field486 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field472 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field272 = new int[1000];

    @ObfuscatedName("client.md")
    public static class72[] field489 = new class72[1000];

    @ObfuscatedName("client.mf")
    public static int field490 = 0;

    @ObfuscatedName("client.mo")
    public static int field491 = 0;

    @ObfuscatedName("client.mb")
    public static int field492 = 0;

    @ObfuscatedName("client.me")
    public static int field493 = 255;

    @ObfuscatedName("client.ml")
    public static int field355 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field495 = false;

    @ObfuscatedName("client.mi")
    public static int field496 = 127;

    @ObfuscatedName("client.ma")
    public static int field381 = 127;

    @ObfuscatedName("client.nh")
    public static int field513 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field499 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field501 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field502 = new int[50];

    @ObfuscatedName("client.ne")
    public static class52[] field503 = new class52[50];

    @ObfuscatedName("client.nk")
    public static boolean field504 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field462 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field506 = new int[5];

    @ObfuscatedName("client.nx")
    public static int[] field338 = new int[5];

    @ObfuscatedName("client.nw")
    public static int[] field369 = new int[5];

    @ObfuscatedName("client.np")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.nc")
    public static int field287 = 0;

    @ObfuscatedName("client.og")
    public static int field511 = 0;

    @ObfuscatedName("client.ol")
    public static class16[] field512 = new class16[400];

    @ObfuscatedName("client.on")
    public static class173 field346 = new class173();

    @ObfuscatedName("client.ot")
    public static int field466 = 0;

    @ObfuscatedName("client.ov")
    public static class8[] field427 = new class8[400];

    @ObfuscatedName("client.ou")
    public static class157 field468 = new class157();

    @ObfuscatedName("client.oc")
    public static int field517 = -1;

    @ObfuscatedName("client.oi")
    public static int field518 = -1;

    @ObfuscatedName("client.g(I)V")
    public final void method164() {
    }

    public final void init() {
        if (!this.method2580()) {
            return;
        }
        class168[] var1 = class168.method820();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2820);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2820)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field401 = true;
                        } else {
                            field401 = false;
                        }
                    case 3:
                    default:
                        break;
                    case 4:
                        field265 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field262 = Integer.parseInt(var4);
                        break;
                    case 6:
                        int var6 = Integer.parseInt(var4);
                        class138[] var7 = class138.method1599();
                        int var8 = 0;
                        class138 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class138 var9 = var7[var8];
                            if (var9.field2103 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field264 = var10;
                        break;
                    case 7:
                        Statics.field1971 = var4;
                        break;
                    case 8:
                        field263 = Integer.parseInt(var4);
                        break;
                    case 9:
                        class139[] var5 = new class139[] { class139.field2118, class139.field2106, class139.field2105, class139.field2110, class139.field2107, class139.field2108 };
                        Statics.field72 = (class139) class99.method771(var5, Integer.parseInt(var4));
                        if (Statics.field72 == class139.field2108) {
                            Statics.field177 = class190.field2890;
                        } else {
                            Statics.field177 = class190.field2886;
                        }
                        break;
                    case 10:
                        field267 = Integer.parseInt(var4);
                }
            }
        }
        method2313();
        Statics.field1814 = this.getCodeBase().getHost();
        String var11 = Statics.field264.field2099;
        byte var12 = 0;
        try {
            class136.method151("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class135.method457((String) null, var14);
        }
        Statics.field260 = this;
        this.method2614(765, 503, 56);
    }

    @ObfuscatedName("dk.b(I)V")
    public static final void method2313() {
        class79.field1397 = false;
        field433 = false;
    }

    @ObfuscatedName("client.q(I)V")
    public final void method167() {
        Statics.field645 = field265 == 0 ? 43594 : field262 + 40000;
        Statics.field550 = field265 == 0 ? 443 : field262 + 50000;
        Statics.field716 = Statics.field645;
        Statics.field228 = class153.field2640;
        Statics.field1523 = class153.field2642;
        Statics.field203 = class153.field2641;
        Statics.field1830 = class153.field2639;
        if (Statics.field1943.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1970[44] = 71;
            class124.field1970[45] = 26;
            class124.field1970[46] = 72;
            class124.field1970[47] = 73;
            class124.field1970[59] = 57;
            class124.field1970[61] = 27;
            class124.field1970[91] = 42;
            class124.field1970[92] = 74;
            class124.field1970[93] = 43;
            class124.field1970[192] = 28;
            class124.field1970[222] = 58;
            class124.field1970[520] = 59;
        } else {
            class124.field1970[186] = 57;
            class124.field1970[187] = 27;
            class124.field1970[188] = 71;
            class124.field1970[189] = 26;
            class124.field1970[190] = 72;
            class124.field1970[191] = 73;
            class124.field1970[192] = 58;
            class124.field1970[219] = 42;
            class124.field1970[220] = 74;
            class124.field1970[221] = 43;
            class124.field1970[222] = 59;
            class124.field1970[223] = 28;
        }
        Canvas var1 = Statics.field2040;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1948);
        var1.addFocusListener(class124.field1948);
        class127.method3073(Statics.field2040);
        class132 var2;
        try {
            var2 = new class132();
        } catch (Throwable var15) {
            var2 = null;
        }
        Statics.field1042 = var2;
        if (Statics.field1042 != null) {
            Statics.field1042.method2428(Statics.field2040);
        }
        Statics.field190 = new class121(255, class136.field2085, class136.field2084, 500000);
        class195 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class136.method555("", Statics.field72.field2109, false);
            byte[] var6 = new byte[(int) var4.method3392()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3393(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class107(var6));
        } catch (Exception var16) {
        }
        try {
            if (var4 != null) {
                var4.method3389();
            }
        } catch (Exception var14) {
        }
        Statics.field75 = var5;
        Statics.field523 = this.getToolkit().getSystemClipboard();
        String var13 = Statics.field1264;
        class125.field1975 = this;
        class125.field1976 = var13;
        if (field265 != 0) {
            field277 = true;
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method189() {
        field442++;
        this.method170();
        class149.method745();
        try {
            if (class161.field2706 == 1) {
                int var1 = Statics.field2709.method3047();
                if (var1 > 0 && Statics.field2709.method3057()) {
                    int var2 = var1 - Statics.field2102;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2709.method3003(var2);
                } else {
                    Statics.field2709.method3008();
                    Statics.field2709.method3006();
                    if (Statics.field785 == null) {
                        class161.field2706 = 0;
                    } else {
                        class161.field2706 = 2;
                    }
                    Statics.field608 = null;
                    Statics.field602 = null;
                }
            }
        } catch (Exception var278) {
            var278.printStackTrace();
            Statics.field2709.method3008();
            class161.field2706 = 0;
            Statics.field608 = null;
            Statics.field602 = null;
            Statics.field785 = null;
        }
        method1775();
        class124 var4 = class124.field1948;
        synchronized (class124.field1948) {
            class124.field1969++;
            class124.field1966 = class124.field1974;
            class124.field1951 = 0;
            if (class124.field1965 >= 0) {
                while (class124.field1968 != class124.field1965) {
                    int var6 = class124.field1959[class124.field1968];
                    class124.field1968 = class124.field1968 + 1 & 0x7F;
                    if (var6 < 0) {
                        class124.field1958[~var6] = false;
                    } else {
                        if (!class124.field1958[var6] && class124.field1951 < class124.field1964.length - 1) {
                            class124.field1964[++class124.field1951 - 1] = var6;
                        }
                        class124.field1958[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class124.field1958[var5] = false;
                }
                class124.field1965 = class124.field1968;
            }
            class124.field1974 = class124.field1967;
        }
        class127 var8 = class127.field2004;
        synchronized (class127.field2004) {
            class127.field1995 = class127.field1992;
            class127.field2007 = class127.field1990;
            class127.field1997 = class127.field1994;
            class127.field2002 = class127.field2008;
            class127.field2003 = class127.field1999;
            class127.field2005 = class127.field1993;
            class127.field1996 = class127.field1998;
            class127.field2008 = 0;
        }
        if (Statics.field1042 != null) {
            int var10 = Statics.field1042.method2423();
            field459 = var10;
        }
        if (field269 == 0) {
            method33();
            Statics.field163.method2438();
            for (int var11 = 0; var11 < 32; var11++) {
                field2048[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field2053[var12] = 0L;
            }
            Statics.field989 = 0;
        } else if (field269 == 5) {
            Statics.method124(this);
            method33();
            Statics.field163.method2438();
            for (int var13 = 0; var13 < 32; var13++) {
                field2048[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field2053[var14] = 0L;
            }
            Statics.field989 = 0;
        } else if (field269 == 10 || field269 == 11) {
            Statics.method124(this);
        } else if (field269 == 20) {
            Statics.method124(this);
            method2671();
        } else if (field269 == 25) {
            method3280(false);
            field316 = 0;
            boolean var15 = true;
            for (int var16 = 0; var16 < Statics.field717.length; var16++) {
                if (Statics.field1878[var16] != -1 && Statics.field717[var16] == null) {
                    Statics.field717[var16] = Statics.field253.method2695(Statics.field1878[var16], 0);
                    if (Statics.field717[var16] == null) {
                        var15 = false;
                        field316++;
                    }
                }
                if (Statics.field1655[var16] != -1 && Statics.field236[var16] == null) {
                    Statics.field236[var16] = Statics.field253.method2719(Statics.field1655[var16], 0, Statics.field2020[var16]);
                    if (Statics.field236[var16] == null) {
                        var15 = false;
                        field316++;
                    }
                }
            }
            if (var15) {
                field516 = 0;
                boolean var17 = true;
                for (int var18 = 0; var18 < Statics.field717.length; var18++) {
                    byte[] var19 = Statics.field236[var18];
                    if (var19 != null) {
                        int var20 = (Statics.field2101[var18] >> 8) * 64 - Statics.field314;
                        int var21 = (Statics.field2101[var18] & 0xFF) * 64 - Statics.field2743;
                        if (field438) {
                            var20 = 10;
                            var21 = 10;
                        }
                        boolean var23 = true;
                        class107 var24 = new class107(var19);
                        int var25 = -1;
                        label1339: while (true) {
                            int var26 = var24.method2129();
                            if (var26 == 0) {
                                var17 &= var23;
                                break;
                            }
                            var25 += var26;
                            int var27 = 0;
                            boolean var28 = false;
                            while (true) {
                                while (!var28) {
                                    int var30 = var24.method2129();
                                    if (var30 == 0) {
                                        continue label1339;
                                    }
                                    var27 += var30 - 1;
                                    int var31 = var27 & 0x3F;
                                    int var32 = var27 >> 6 & 0x3F;
                                    int var33 = var24.method2226() >> 2;
                                    int var34 = var20 + var32;
                                    int var35 = var21 + var31;
                                    if (var34 > 0 && var35 > 0 && var34 < 103 && var35 < 103) {
                                        class36 var36 = class36.method12(var25);
                                        if (var33 != 22 || !field433 || var36.field853 != 0 || var36.field859 == 1 || var36.field870) {
                                            if (!var36.method635()) {
                                                field516++;
                                                var23 = false;
                                            }
                                            var28 = true;
                                        }
                                    }
                                }
                                int var29 = var24.method2129();
                                if (var29 == 0) {
                                    break;
                                }
                                var24.method2226();
                            }
                        }
                    }
                }
                if (var17) {
                    if (field320 != 0) {
                        method1776(class142.field2143 + class2.field22 + class2.field19 + 100 + "%" + class2.field31, true);
                    }
                    method1775();
                    method1870();
                    method1775();
                    Statics.field66.method1608();
                    method1775();
                    System.gc();
                    for (int var38 = 0; var38 < 4; var38++) {
                        field321[var38].method3444();
                    }
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 104; var40++) {
                            for (int var41 = 0; var41 < 104; var41++) {
                                class6.field100[var39][var40][var41] = 0;
                            }
                        }
                    }
                    method1775();
                    class6.field85 = 99;
                    Statics.field84 = new byte[4][104][104];
                    Statics.field1763 = new byte[4][104][104];
                    Statics.field87 = new byte[4][104][104];
                    Statics.field2892 = new byte[4][104][104];
                    Statics.field90 = new int[4][105][105];
                    Statics.field88 = new byte[4][105][105];
                    Statics.field530 = new int[105][105];
                    Statics.field101 = new int[104];
                    Statics.field89 = new int[104];
                    Statics.field2868 = new int[104];
                    Statics.field134 = new int[104];
                    Statics.field2681 = new int[104];
                    int var42 = Statics.field717.length;
                    for (class20 var43 = (class20) class20.field567.method3210(); var43 != null; var43 = (class20) class20.field567.method3182()) {
                        if (var43.field559 != null) {
                            Statics.field206.method965(var43.field559);
                            var43.field559 = null;
                        }
                        if (var43.field568 != null) {
                            Statics.field206.method965(var43.field568);
                            var43.field568 = null;
                        }
                    }
                    class20.field567.method3185();
                    method3280(true);
                    if (!field438) {
                        int var44 = 0;
                        label1271: while (true) {
                            if (var44 >= var42) {
                                for (int var58 = 0; var58 < var42; var58++) {
                                    int var59 = (Statics.field2101[var58] >> 8) * 64 - Statics.field314;
                                    int var60 = (Statics.field2101[var58] & 0xFF) * 64 - Statics.field2743;
                                    byte[] var61 = Statics.field717[var58];
                                    if (var61 == null && Statics.field584 < 800) {
                                        method1775();
                                        class6.method2(var59, var60, 64, 64);
                                    }
                                }
                                method3280(true);
                                int var62 = 0;
                                while (true) {
                                    if (var62 >= var42) {
                                        break label1271;
                                    }
                                    byte[] var63 = Statics.field236[var62];
                                    if (var63 != null) {
                                        int var64 = (Statics.field2101[var62] >> 8) * 64 - Statics.field314;
                                        int var65 = (Statics.field2101[var62] & 0xFF) * 64 - Statics.field2743;
                                        method1775();
                                        class6.method2770(var63, var64, var65, Statics.field66, field321);
                                    }
                                    var62++;
                                }
                            }
                            int var45 = (Statics.field2101[var44] >> 8) * 64 - Statics.field314;
                            int var46 = (Statics.field2101[var44] & 0xFF) * 64 - Statics.field2743;
                            byte[] var47 = Statics.field717[var44];
                            if (var47 != null) {
                                method1775();
                                int var48 = Statics.field614 * 8 - 48;
                                int var49 = Statics.field584 * 8 - 48;
                                class197[] var50 = field321;
                                int var51 = 0;
                                label1268: while (true) {
                                    if (var51 >= 4) {
                                        class107 var54 = new class107(var47);
                                        int var55 = 0;
                                        while (true) {
                                            if (var55 >= 4) {
                                                break label1268;
                                            }
                                            for (int var56 = 0; var56 < 64; var56++) {
                                                for (int var57 = 0; var57 < 64; var57++) {
                                                    class6.method1873(var54, var55, var45 + var56, var46 + var57, var48, var49, 0);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                    for (int var52 = 0; var52 < 64; var52++) {
                                        for (int var53 = 0; var53 < 64; var53++) {
                                            if (var45 + var52 > 0 && var45 + var52 < 103 && var46 + var53 > 0 && var46 + var53 < 103) {
                                                var50[var51].field2943[var45 + var52][var46 + var53] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var51++;
                                }
                            }
                            var44++;
                        }
                    }
                    if (field438) {
                        int var66 = 0;
                        label1217: while (true) {
                            if (var66 >= 4) {
                                for (int var113 = 0; var113 < 13; var113++) {
                                    for (int var114 = 0; var114 < 13; var114++) {
                                        int var115 = field343[0][var113][var114];
                                        if (var115 == -1) {
                                            class6.method2(var113 * 8, var114 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3280(true);
                                int var116 = 0;
                                while (true) {
                                    if (var116 >= 4) {
                                        break label1217;
                                    }
                                    method1775();
                                    for (int var117 = 0; var117 < 13; var117++) {
                                        for (int var118 = 0; var118 < 13; var118++) {
                                            int var119 = field343[var116][var117][var118];
                                            if (var119 != -1) {
                                                int var120 = var119 >> 24 & 0x3;
                                                int var121 = var119 >> 1 & 0x3;
                                                int var122 = var119 >> 14 & 0x3FF;
                                                int var123 = var119 >> 3 & 0x7FF;
                                                int var124 = (var122 / 8 << 8) + var123 / 8;
                                                for (int var125 = 0; var125 < Statics.field2101.length; var125++) {
                                                    if (Statics.field2101[var125] == var124 && Statics.field236[var125] != null) {
                                                        class6.method2355(Statics.field236[var125], var116, var117 * 8, var118 * 8, var120, (var122 & 0x7) * 8, (var123 & 0x7) * 8, var121, Statics.field66, field321);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var116++;
                                }
                            }
                            method1775();
                            for (int var67 = 0; var67 < 13; var67++) {
                                for (int var68 = 0; var68 < 13; var68++) {
                                    boolean var69 = false;
                                    int var70 = field343[var66][var67][var68];
                                    if (var70 != -1) {
                                        int var71 = var70 >> 24 & 0x3;
                                        int var72 = var70 >> 1 & 0x3;
                                        int var73 = var70 >> 14 & 0x3FF;
                                        int var74 = var70 >> 3 & 0x7FF;
                                        int var75 = (var73 / 8 << 8) + var74 / 8;
                                        for (int var76 = 0; var76 < Statics.field2101.length; var76++) {
                                            if (Statics.field2101[var76] == var75 && Statics.field717[var76] != null) {
                                                byte[] var77 = Statics.field717[var76];
                                                int var78 = var67 * 8;
                                                int var79 = var68 * 8;
                                                int var80 = (var73 & 0x7) * 8;
                                                int var81 = (var74 & 0x7) * 8;
                                                class197[] var82 = field321;
                                                for (int var83 = 0; var83 < 8; var83++) {
                                                    for (int var84 = 0; var84 < 8; var84++) {
                                                        if (var78 + var83 > 0 && var78 + var83 < 103 && var79 + var84 > 0 && var79 + var84 < 103) {
                                                            var82[var66].field2943[var78 + var83][var79 + var84] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var85 = new class107(var77);
                                                for (int var86 = 0; var86 < 4; var86++) {
                                                    for (int var87 = 0; var87 < 64; var87++) {
                                                        for (int var88 = 0; var88 < 64; var88++) {
                                                            if (var71 == var86 && var87 >= var80 && var87 < var80 + 8 && var88 >= var81 && var88 < var81 + 8) {
                                                                int var92 = var87 & 0x7;
                                                                int var93 = var88 & 0x7;
                                                                int var95 = var72 & 0x3;
                                                                int var96;
                                                                if (var95 == 0) {
                                                                    var96 = var92;
                                                                } else if (var95 == 1) {
                                                                    var96 = var93;
                                                                } else if (var95 == 2) {
                                                                    var96 = 7 - var92;
                                                                } else {
                                                                    var96 = 7 - var93;
                                                                }
                                                                int var99 = var78 + var96;
                                                                int var101 = var87 & 0x7;
                                                                int var102 = var88 & 0x7;
                                                                int var104 = var72 & 0x3;
                                                                int var105;
                                                                if (var104 == 0) {
                                                                    var105 = var102;
                                                                } else if (var104 == 1) {
                                                                    var105 = 7 - var101;
                                                                } else if (var104 == 2) {
                                                                    var105 = 7 - var102;
                                                                } else {
                                                                    var105 = var101;
                                                                }
                                                                class6.method1873(var85, var66, var99, var79 + var105, 0, 0, var72);
                                                            } else {
                                                                class6.method1873(var85, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var69 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var69) {
                                        int var106 = var66;
                                        int var107 = var67 * 8;
                                        int var108 = var68 * 8;
                                        for (int var109 = 0; var109 < 8; var109++) {
                                            for (int var110 = 0; var110 < 8; var110++) {
                                                class6.field83[var106][var107 + var109][var108 + var110] = 0;
                                            }
                                        }
                                        if (var107 > 0) {
                                            for (int var111 = 1; var111 < 8; var111++) {
                                                class6.field83[var106][var107][var108 + var111] = class6.field83[var106][var107 - 1][var108 + var111];
                                            }
                                        }
                                        if (var108 > 0) {
                                            for (int var112 = 1; var112 < 8; var112++) {
                                                class6.field83[var106][var107 + var112][var108] = class6.field83[var106][var107 + var112][var108 - 1];
                                            }
                                        }
                                        if (var107 > 0 && class6.field83[var106][var107 - 1][var108] != 0) {
                                            class6.field83[var106][var107][var108] = class6.field83[var106][var107 - 1][var108];
                                        } else if (var108 > 0 && class6.field83[var106][var107][var108 - 1] != 0) {
                                            class6.field83[var106][var107][var108] = class6.field83[var106][var107][var108 - 1];
                                        } else if (var107 > 0 && var108 > 0 && class6.field83[var106][var107 - 1][var108 - 1] != 0) {
                                            class6.field83[var106][var107][var108] = class6.field83[var106][var107 - 1][var108 - 1];
                                        }
                                    }
                                }
                            }
                            var66++;
                        }
                    }
                    method3280(true);
                    method1870();
                    method1775();
                    class79 var126 = Statics.field66;
                    class197[] var127 = field321;
                    for (int var128 = 0; var128 < 4; var128++) {
                        for (int var129 = 0; var129 < 104; var129++) {
                            for (int var130 = 0; var130 < 104; var130++) {
                                if ((class6.field100[var128][var129][var130] & 0x1) == 1) {
                                    int var131 = var128;
                                    if ((class6.field100[1][var129][var130] & 0x2) == 2) {
                                        var131 = var128 - 1;
                                    }
                                    if (var131 >= 0) {
                                        var127[var131].method3440(var129, var130);
                                    }
                                }
                            }
                        }
                    }
                    class6.field97 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field97 < -8) {
                        class6.field97 = -8;
                    }
                    if (class6.field97 > 8) {
                        class6.field97 = 8;
                    }
                    class6.field93 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field93 < -16) {
                        class6.field93 = -16;
                    }
                    if (class6.field93 > 16) {
                        class6.field93 = 16;
                    }
                    for (int var132 = 0; var132 < 4; var132++) {
                        byte[][] var133 = Statics.field88[var132];
                        int var134 = (int) Math.sqrt(5100.0D);
                        int var135 = var134 * 768 >> 8;
                        for (int var136 = 1; var136 < 103; var136++) {
                            for (int var137 = 1; var137 < 103; var137++) {
                                int var138 = class6.field83[var132][var137 + 1][var136] - class6.field83[var132][var137 - 1][var136];
                                int var139 = class6.field83[var132][var137][var136 + 1] - class6.field83[var132][var137][var136 - 1];
                                int var140 = (int) Math.sqrt((double) (var139 * var139 + var138 * var138 + 65536));
                                int var141 = (var138 << 8) / var140;
                                int var142 = 65536 / var140;
                                int var143 = (var139 << 8) / var140;
                                int var144 = (var143 * -50 + var141 * -50 + var142 * -10) / var135 + 96;
                                int var145 = (var133[var137][var136] >> 1) + (var133[var137][var136 + 1] >> 3) + (var133[var137][var136 - 1] >> 2) + (var133[var137 - 1][var136] >> 2) + (var133[var137 + 1][var136] >> 3);
                                Statics.field530[var137][var136] = var144 - var145;
                            }
                        }
                        for (int var146 = 0; var146 < 104; var146++) {
                            Statics.field101[var146] = 0;
                            Statics.field89[var146] = 0;
                            Statics.field2868[var146] = 0;
                            Statics.field134[var146] = 0;
                            Statics.field2681[var146] = 0;
                        }
                        for (int var147 = -5; var147 < 109; var147++) {
                            for (int var148 = 0; var148 < 104; var148++) {
                                int var149 = var147 + 5;
                                int var10002;
                                if (var149 >= 0 && var149 < 104) {
                                    int var150 = Statics.field84[var132][var149][var148] & 0xFF;
                                    if (var150 > 0) {
                                        int var151 = var150 - 1;
                                        class37 var152 = (class37) class37.field882.method3136((long) var151);
                                        class37 var153;
                                        if (var152 == null) {
                                            byte[] var154 = Statics.field890.method2695(1, var151);
                                            class37 var155 = new class37();
                                            if (var154 != null) {
                                                var155.method677(new class107(var154), var151);
                                            }
                                            var155.method678();
                                            class37.field882.method3127(var155, (long) var151);
                                            var153 = var155;
                                        } else {
                                            var153 = var152;
                                        }
                                        Statics.field101[var148] += var153.field884;
                                        Statics.field89[var148] += var153.field885;
                                        Statics.field2868[var148] += var153.field888;
                                        Statics.field134[var148] += var153.field886;
                                        var10002 = Statics.field2681[var148]++;
                                    }
                                }
                                int var157 = var147 - 5;
                                if (var157 >= 0 && var157 < 104) {
                                    int var158 = Statics.field84[var132][var157][var148] & 0xFF;
                                    if (var158 > 0) {
                                        int var159 = var158 - 1;
                                        class37 var160 = (class37) class37.field882.method3136((long) var159);
                                        class37 var161;
                                        if (var160 == null) {
                                            byte[] var162 = Statics.field890.method2695(1, var159);
                                            class37 var163 = new class37();
                                            if (var162 != null) {
                                                var163.method677(new class107(var162), var159);
                                            }
                                            var163.method678();
                                            class37.field882.method3127(var163, (long) var159);
                                            var161 = var163;
                                        } else {
                                            var161 = var160;
                                        }
                                        Statics.field101[var148] -= var161.field884;
                                        Statics.field89[var148] -= var161.field885;
                                        Statics.field2868[var148] -= var161.field888;
                                        Statics.field134[var148] -= var161.field886;
                                        var10002 = Statics.field2681[var148]--;
                                    }
                                }
                            }
                            if (var147 >= 1 && var147 < 103) {
                                int var165 = 0;
                                int var166 = 0;
                                int var167 = 0;
                                int var168 = 0;
                                int var169 = 0;
                                for (int var170 = -5; var170 < 109; var170++) {
                                    int var171 = var170 + 5;
                                    if (var171 >= 0 && var171 < 104) {
                                        var165 += Statics.field101[var171];
                                        var166 += Statics.field89[var171];
                                        var167 += Statics.field2868[var171];
                                        var168 += Statics.field134[var171];
                                        var169 += Statics.field2681[var171];
                                    }
                                    int var172 = var170 - 5;
                                    if (var172 >= 0 && var172 < 104) {
                                        var165 -= Statics.field101[var172];
                                        var166 -= Statics.field89[var172];
                                        var167 -= Statics.field2868[var172];
                                        var168 -= Statics.field134[var172];
                                        var169 -= Statics.field2681[var172];
                                    }
                                    if (var170 >= 1 && var170 < 103) {
                                        if (field433 && (class6.field100[0][var147][var170] & 0x2) == 0) {
                                            if ((class6.field100[var132][var147][var170] & 0x10) != 0) {
                                                continue;
                                            }
                                            int var173;
                                            if ((class6.field100[var132][var147][var170] & 0x8) != 0) {
                                                var173 = 0;
                                            } else if (var132 <= 0 || (class6.field100[1][var147][var170] & 0x2) == 0) {
                                                var173 = var132;
                                            } else {
                                                var173 = var132 - 1;
                                            }
                                            if (field315 != var173) {
                                                continue;
                                            }
                                        }
                                        if (var132 < class6.field85) {
                                            class6.field85 = var132;
                                        }
                                        int var174 = Statics.field84[var132][var147][var170] & 0xFF;
                                        int var175 = Statics.field1763[var132][var147][var170] & 0xFF;
                                        if (var174 > 0 || var175 > 0) {
                                            int var176 = class6.field83[var132][var147][var170];
                                            int var177 = class6.field83[var132][var147 + 1][var170];
                                            int var178 = class6.field83[var132][var147 + 1][var170 + 1];
                                            int var179 = class6.field83[var132][var147][var170 + 1];
                                            int var180 = Statics.field530[var147][var170];
                                            int var181 = Statics.field530[var147 + 1][var170];
                                            int var182 = Statics.field530[var147 + 1][var170 + 1];
                                            int var183 = Statics.field530[var147][var170 + 1];
                                            int var184 = -1;
                                            int var185 = -1;
                                            if (var174 > 0) {
                                                int var186 = var165 * 256 / var168;
                                                int var187 = var166 / var169;
                                                int var188 = var167 / var169;
                                                var184 = class6.method2691(var186, var187, var188);
                                                int var189 = class6.field97 + var186 & 0xFF;
                                                int var190 = class6.field93 + var188;
                                                if (var190 < 0) {
                                                    var190 = 0;
                                                } else if (var190 > 255) {
                                                    var190 = 255;
                                                }
                                                var185 = class6.method2691(var189, var187, var190);
                                            }
                                            if (var132 > 0) {
                                                boolean var191 = true;
                                                if (var174 == 0 && Statics.field87[var132][var147][var170] != 0) {
                                                    var191 = false;
                                                }
                                                if (var175 > 0) {
                                                    int var192 = var175 - 1;
                                                    class41 var193 = (class41) class41.field948.method3136((long) var192);
                                                    class41 var194;
                                                    if (var193 == null) {
                                                        byte[] var195 = Statics.field947.method2695(4, var192);
                                                        class41 var196 = new class41();
                                                        if (var195 != null) {
                                                            var196.method781(new class107(var195), var192);
                                                        }
                                                        var196.method782();
                                                        class41.field948.method3127(var196, (long) var192);
                                                        var194 = var196;
                                                    } else {
                                                        var194 = var193;
                                                    }
                                                    if (!var194.field951) {
                                                        var191 = false;
                                                    }
                                                }
                                                if (var191 && var176 == var177 && var176 == var178 && var176 == var179) {
                                                    Statics.field90[var132][var147][var170] |= 0x924;
                                                }
                                            }
                                            int var197 = 0;
                                            if (var185 != -1) {
                                                var197 = class84.field1476[class6.method691(var185, 96)];
                                            }
                                            if (var175 == 0) {
                                                var126.method1613(var132, var147, var170, 0, 0, -1, var176, var177, var178, var179, class6.method691(var184, var180), class6.method691(var184, var181), class6.method691(var184, var182), class6.method691(var184, var183), 0, 0, 0, 0, var197, 0);
                                            } else {
                                                int var198 = Statics.field87[var132][var147][var170] + 1;
                                                byte var199 = Statics.field2892[var132][var147][var170];
                                                int var200 = var175 - 1;
                                                class41 var201 = (class41) class41.field948.method3136((long) var200);
                                                class41 var202;
                                                if (var201 == null) {
                                                    byte[] var203 = Statics.field947.method2695(4, var200);
                                                    class41 var204 = new class41();
                                                    if (var203 != null) {
                                                        var204.method781(new class107(var203), var200);
                                                    }
                                                    var204.method782();
                                                    class41.field948.method3127(var204, (long) var200);
                                                    var202 = var204;
                                                } else {
                                                    var202 = var201;
                                                }
                                                int var206 = var202.field950;
                                                int var207;
                                                int var208;
                                                if (var206 >= 0) {
                                                    var207 = Statics.field1457.method1839(var206);
                                                    var208 = -1;
                                                } else if (var202.field949 == 16711935) {
                                                    var208 = -2;
                                                    var206 = -1;
                                                    var207 = -2;
                                                } else {
                                                    var208 = class6.method2691(var202.field955, var202.field958, var202.field960);
                                                    int var209 = class6.field97 + var202.field955 & 0xFF;
                                                    int var210 = class6.field93 + var202.field960;
                                                    if (var210 < 0) {
                                                        var210 = 0;
                                                    } else if (var210 > 255) {
                                                        var210 = 255;
                                                    }
                                                    var207 = class6.method2691(var209, var202.field958, var210);
                                                }
                                                int var211 = 0;
                                                if (var207 != -2) {
                                                    var211 = class84.field1476[class6.method1964(var207, 96)];
                                                }
                                                if (var202.field952 != -1) {
                                                    int var212 = class6.field97 + var202.field956 & 0xFF;
                                                    int var213 = class6.field93 + var202.field954;
                                                    if (var213 < 0) {
                                                        var213 = 0;
                                                    } else if (var213 > 255) {
                                                        var213 = 255;
                                                    }
                                                    int var214 = class6.method2691(var212, var202.field957, var213);
                                                    var211 = class84.field1476[class6.method1964(var214, 96)];
                                                }
                                                var126.method1613(var132, var147, var170, var198, var199, var206, var176, var177, var178, var179, class6.method691(var184, var180), class6.method691(var184, var181), class6.method691(var184, var182), class6.method691(var184, var183), class6.method1964(var208, var180), class6.method1964(var208, var181), class6.method1964(var208, var182), class6.method1964(var208, var183), var197, var211);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var215 = 1; var215 < 103; var215++) {
                            for (int var216 = 1; var216 < 103; var216++) {
                                int var221;
                                if ((class6.field100[var132][var216][var215] & 0x8) != 0) {
                                    var221 = 0;
                                } else if (var132 <= 0 || (class6.field100[1][var216][var215] & 0x2) == 0) {
                                    var221 = var132;
                                } else {
                                    var221 = var132 - 1;
                                }
                                var126.method1612(var132, var216, var215, var221);
                            }
                        }
                        Statics.field84[var132] = (byte[][]) null;
                        Statics.field1763[var132] = (byte[][]) null;
                        Statics.field87[var132] = (byte[][]) null;
                        Statics.field2892[var132] = (byte[][]) null;
                        Statics.field88[var132] = (byte[][]) null;
                    }
                    var126.method1639(-50, -10, -50);
                    for (int var222 = 0; var222 < 104; var222++) {
                        for (int var223 = 0; var223 < 104; var223++) {
                            if ((class6.field100[1][var222][var223] & 0x2) == 2) {
                                var126.method1610(var222, var223);
                            }
                        }
                    }
                    int var224 = 1;
                    int var225 = 2;
                    int var226 = 4;
                    for (int var227 = 0; var227 < 4; var227++) {
                        if (var227 > 0) {
                            var224 <<= 0x3;
                            var225 <<= 0x3;
                            var226 <<= 0x3;
                        }
                        for (int var228 = 0; var228 <= var227; var228++) {
                            for (int var229 = 0; var229 <= 104; var229++) {
                                for (int var230 = 0; var230 <= 104; var230++) {
                                    if ((Statics.field90[var228][var230][var229] & var224) != 0) {
                                        int var231 = var229;
                                        int var232 = var229;
                                        int var233 = var228;
                                        int var234 = var228;
                                        while (var231 > 0 && (Statics.field90[var228][var230][var231 - 1] & var224) != 0) {
                                            var231--;
                                        }
                                        while (var232 < 104 && (Statics.field90[var228][var230][var232 + 1] & var224) != 0) {
                                            var232++;
                                        }
                                        label825: while (var233 > 0) {
                                            for (int var235 = var231; var235 <= var232; var235++) {
                                                if ((Statics.field90[var233 - 1][var230][var235] & var224) == 0) {
                                                    break label825;
                                                }
                                            }
                                            var233--;
                                        }
                                        label814: while (var234 < var227) {
                                            for (int var236 = var231; var236 <= var232; var236++) {
                                                if ((Statics.field90[var234 + 1][var230][var236] & var224) == 0) {
                                                    break label814;
                                                }
                                            }
                                            var234++;
                                        }
                                        int var237 = (var234 + 1 - var233) * (var232 - var231 + 1);
                                        if (var237 >= 8) {
                                            short var238 = 240;
                                            int var239 = class6.field83[var234][var230][var231] - var238;
                                            int var240 = class6.field83[var233][var230][var231];
                                            class79.method1611(var227, 1, var230 * 128, var230 * 128, var231 * 128, var232 * 128 + 128, var239, var240);
                                            for (int var241 = var233; var241 <= var234; var241++) {
                                                for (int var242 = var231; var242 <= var232; var242++) {
                                                    Statics.field90[var241][var230][var242] &= ~var224;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field90[var228][var230][var229] & var225) != 0) {
                                        int var243 = var230;
                                        int var244 = var230;
                                        int var245 = var228;
                                        int var246 = var228;
                                        while (var243 > 0 && (Statics.field90[var228][var243 - 1][var229] & var225) != 0) {
                                            var243--;
                                        }
                                        while (var244 < 104 && (Statics.field90[var228][var244 + 1][var229] & var225) != 0) {
                                            var244++;
                                        }
                                        label878: while (var245 > 0) {
                                            for (int var247 = var243; var247 <= var244; var247++) {
                                                if ((Statics.field90[var245 - 1][var247][var229] & var225) == 0) {
                                                    break label878;
                                                }
                                            }
                                            var245--;
                                        }
                                        label867: while (var246 < var227) {
                                            for (int var248 = var243; var248 <= var244; var248++) {
                                                if ((Statics.field90[var246 + 1][var248][var229] & var225) == 0) {
                                                    break label867;
                                                }
                                            }
                                            var246++;
                                        }
                                        int var249 = (var246 + 1 - var245) * (var244 - var243 + 1);
                                        if (var249 >= 8) {
                                            short var250 = 240;
                                            int var251 = class6.field83[var246][var243][var229] - var250;
                                            int var252 = class6.field83[var245][var243][var229];
                                            class79.method1611(var227, 2, var243 * 128, var244 * 128 + 128, var229 * 128, var229 * 128, var251, var252);
                                            for (int var253 = var245; var253 <= var246; var253++) {
                                                for (int var254 = var243; var254 <= var244; var254++) {
                                                    Statics.field90[var253][var254][var229] &= ~var225;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field90[var228][var230][var229] & var226) != 0) {
                                        int var255 = var230;
                                        int var256 = var230;
                                        int var257 = var229;
                                        int var258 = var229;
                                        while (var257 > 0 && (Statics.field90[var228][var230][var257 - 1] & var226) != 0) {
                                            var257--;
                                        }
                                        while (var258 < 104 && (Statics.field90[var228][var230][var258 + 1] & var226) != 0) {
                                            var258++;
                                        }
                                        label931: while (var255 > 0) {
                                            for (int var259 = var257; var259 <= var258; var259++) {
                                                if ((Statics.field90[var228][var255 - 1][var259] & var226) == 0) {
                                                    break label931;
                                                }
                                            }
                                            var255--;
                                        }
                                        label920: while (var256 < 104) {
                                            for (int var260 = var257; var260 <= var258; var260++) {
                                                if ((Statics.field90[var228][var256 + 1][var260] & var226) == 0) {
                                                    break label920;
                                                }
                                            }
                                            var256++;
                                        }
                                        if ((var256 - var255 + 1) * (var258 - var257 + 1) >= 4) {
                                            int var261 = class6.field83[var228][var255][var257];
                                            class79.method1611(var227, 4, var255 * 128, var256 * 128 + 128, var257 * 128, var258 * 128 + 128, var261, var261);
                                            for (int var262 = var255; var262 <= var256; var262++) {
                                                for (int var263 = var257; var263 <= var258; var263++) {
                                                    Statics.field90[var228][var262][var263] &= ~var226;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method3280(true);
                    int var264 = class6.field85;
                    if (var264 > Statics.field2401) {
                        var264 = Statics.field2401;
                    }
                    if (var264 < Statics.field2401 - 1) {
                        int var265 = Statics.field2401 - 1;
                    }
                    if (field433) {
                        Statics.field66.method1609(class6.field85);
                    } else {
                        Statics.field66.method1609(0);
                    }
                    for (int var266 = 0; var266 < 104; var266++) {
                        for (int var267 = 0; var267 < 104; var267++) {
                            method1302(var266, var267);
                        }
                    }
                    method1775();
                    method86();
                    class36.field835.method3128();
                    if (Statics.field699 != null) {
                        field402.method2361(172);
                        field402.method2137(1057001181);
                    }
                    if (!field438) {
                        int var268 = (Statics.field614 - 6) / 8;
                        int var269 = (Statics.field614 + 6) / 8;
                        int var270 = (Statics.field584 - 6) / 8;
                        int var271 = (Statics.field584 + 6) / 8;
                        for (int var272 = var268 - 1; var272 <= var269 + 1; var272++) {
                            for (int var273 = var270 - 1; var273 <= var271 + 1; var273++) {
                                if (var272 < var268 || var272 > var269 || var273 < var270 || var273 > var271) {
                                    Statics.field253.method2715("m" + var272 + "_" + var273);
                                    Statics.field253.method2715("l" + var272 + "_" + var273);
                                }
                            }
                        }
                    }
                    method592(30);
                    method1775();
                    class6.method135();
                    field402.method2361(201);
                    Statics.field163.method2438();
                    for (int var274 = 0; var274 < 32; var274++) {
                        field2048[var274] = 0L;
                    }
                    for (int var275 = 0; var275 < 32; var275++) {
                        field2053[var275] = 0L;
                    }
                    Statics.field989 = 0;
                } else {
                    field320 = 2;
                }
            } else {
                field320 = 1;
            }
        }
        if (field269 == 30) {
            method2417();
        } else if (field269 == 40 || field269 == 45) {
            method2671();
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method168() {
        boolean var1;
        label207: {
            try {
                if (class161.field2706 == 2) {
                    if (Statics.field608 == null) {
                        Statics.field608 = class158.method2934(Statics.field785, Statics.field153, Statics.field2711);
                        if (Statics.field608 == null) {
                            var1 = false;
                            break label207;
                        }
                    }
                    if (Statics.field602 == null) {
                        Statics.field602 = new class53(Statics.field2708, Statics.field2707);
                    }
                    if (Statics.field2709.method3005(Statics.field608, Statics.field2710, Statics.field602, 22050)) {
                        Statics.field2709.method3101();
                        Statics.field2709.method3003(Statics.field601);
                        Statics.field2709.method3007(Statics.field608, Statics.field1273);
                        class161.field2706 = 0;
                        Statics.field608 = null;
                        Statics.field602 = null;
                        Statics.field785 = null;
                        var1 = true;
                        break label207;
                    }
                }
            } catch (Exception var30) {
                var30.printStackTrace();
                Statics.field2709.method3008();
                class161.field2706 = 0;
                Statics.field608 = null;
                Statics.field602 = null;
                Statics.field785 = null;
            }
            var1 = false;
        }
        if (var1 && field495 && Statics.field618 != null) {
            Statics.field618.method971();
        }
        if (field2042) {
            Canvas var4 = Statics.field2040;
            var4.removeKeyListener(class124.field1948);
            var4.removeFocusListener(class124.field1948);
            class124.field1965 = -1;
            class127.method753(Statics.field2040);
            if (Statics.field1042 != null) {
                Statics.field1042.method2431(Statics.field2040);
            }
            this.method2579();
            Canvas var5 = Statics.field2040;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1948);
            var5.addFocusListener(class124.field1948);
            class127.method3073(Statics.field2040);
            if (Statics.field1042 != null) {
                Statics.field1042.method2428(Statics.field2040);
            }
        }
        if (field269 == 0) {
            int var6 = class28.field661;
            String var7 = class28.field662;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field2040.getGraphics();
                if (Statics.field1456 == null) {
                    Statics.field1456 = new Font("Helvetica", 1, 13);
                    Statics.field1045 = Statics.field2040.getFontMetrics(Statics.field1456);
                }
                if (field2051) {
                    field2051 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field1284, Statics.field1506);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1931 == null) {
                        Statics.field1931 = Statics.field2040.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1931.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1456);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1045.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1931, Statics.field1284 / 2 - 152, Statics.field1506 / 2 - 18, (ImageObserver) null);
                } catch (Exception var26) {
                    int var12 = Statics.field1284 / 2 - 152;
                    int var13 = Statics.field1506 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1456);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1045.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var27) {
                Statics.field2040.repaint();
            }
        } else if (field269 == 5) {
            class28.method591(Statics.field1086, Statics.field138);
        } else if (field269 == 10 || field269 == 11) {
            class28.method591(Statics.field1086, Statics.field138);
        } else if (field269 == 20) {
            class28.method591(Statics.field1086, Statics.field138);
        } else if (field269 == 25) {
            if (field320 == 1) {
                if (field316 > field317) {
                    field317 = field316;
                }
                int var15 = (field317 * 50 - field316 * 50) / field317;
                method1776(class142.field2143 + class2.field22 + class2.field19 + var15 + "%" + class2.field31, false);
            } else if (field320 == 2) {
                if (field516 > field281) {
                    field281 = field516;
                }
                int var16 = (field281 * 50 - field516 * 50) / field281 + 50;
                method1776(class142.field2143 + class2.field22 + class2.field19 + var16 + "%" + class2.field31, false);
            } else {
                method1776(class142.field2143, false);
            }
        } else if (field269 == 30) {
            if (field422 != -1) {
                int var17 = field422;
                if (class152.method692(var17)) {
                    method1959(Statics.field2582[var17], -1);
                }
            }
            for (int var18 = 0; var18 < field464; var18++) {
                if (field485[var18]) {
                    field467[var18] = true;
                }
                field353[var18] = field485[var18];
                field485[var18] = false;
            }
            field465 = field442;
            field411 = -1;
            field399 = -1;
            Statics.field2663 = null;
            if (field422 != -1) {
                field464 = 0;
                method81(field422, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1514();
            if (field403) {
                method131();
            } else if (field411 != -1) {
                method627(field411, field399);
            }
            if (field473 == 3) {
                for (int var19 = 0; var19 < field464; var19++) {
                    if (field353[var19]) {
                        class73.method1565(field469[var19], field312[var19], field471[var19], field318[var19], 16711935, 128);
                    } else if (field467[var19]) {
                        class73.method1565(field469[var19], field312[var19], field471[var19], field318[var19], 16711680, 128);
                    }
                }
            }
            class20.method99(Statics.field2401, Statics.field183.field775, Statics.field183.field720, field266);
            field266 = 0;
        } else if (field269 == 40) {
            method1776(class142.field2144 + class2.field22 + class142.field2145, false);
        } else if (field269 == 45) {
            method1776(class142.field2292, false);
        }
        if (field269 == 30 && field473 == 0 && !field2051) {
            try {
                Graphics var20 = Statics.field2040.getGraphics();
                for (int var21 = 0; var21 < field464; var21++) {
                    if (field467[var21]) {
                        Statics.field977.method1354(var20, field469[var21], field312[var21], field471[var21], field318[var21]);
                        field467[var21] = false;
                    }
                }
            } catch (Exception var29) {
                Statics.field2040.repaint();
            }
        } else if (field269 > 0) {
            try {
                Graphics var23 = Statics.field2040.getGraphics();
                Statics.field977.method1339(var23, 0, 0);
                field2051 = false;
                for (int var24 = 0; var24 < field464; var24++) {
                    field467[var24] = false;
                }
            } catch (Exception var28) {
                Statics.field2040.repaint();
            }
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method169() {
        if (Statics.field204 != null) {
            Statics.field204.field184 = false;
        }
        Statics.field204 = null;
        if (Statics.field156 != null) {
            Statics.field156.method2571();
            Statics.field156 = null;
        }
        class124.method459();
        class127.method130();
        Statics.field1042 = null;
        if (Statics.field618 != null) {
            Statics.field618.method969();
        }
        if (Statics.field1569 != null) {
            Statics.field1569.method969();
        }
        class150.method1368();
        class149.method550();
        try {
            class136.field2085.method3411();
            for (int var1 = 0; var1 < Statics.field2658; var1++) {
                Statics.field1819[var1].method3411();
            }
            class136.field2084.method3411();
            class136.field2082.method3411();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ah.s(IB)V")
    public static void method592(int arg0) {
        if (field269 == arg0) {
            return;
        }
        if (field269 == 0) {
            Statics.field1931 = null;
            Statics.field1456 = null;
            Statics.field1045 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field284 = 0;
            field295 = 0;
            field296 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field195 != null) {
            Statics.field195.method2571();
            Statics.field195 = null;
        }
        if (field269 == 25) {
            field320 = 0;
            field316 = 0;
            field317 = 1;
            field516 = 0;
            field281 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method1955(Statics.field2040, Statics.field1246, Statics.field292, true, 0);
        } else if (arg0 == 20) {
            class28.method1955(Statics.field2040, Statics.field1246, Statics.field292, true, field269 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method1955(Statics.field2040, Statics.field1246, Statics.field292, false, 4);
        } else {
            class28.method2511();
        }
        field269 = arg0;
    }

    @ObfuscatedName("client.f(S)V")
    public void method170() {
        if (field269 == 1000) {
            return;
        }
        long var1 = class103.method1957();
        int var3 = (int) (var1 - Statics.field2486);
        Statics.field2486 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2484 += var3;
        boolean var4;
        if (class150.field2499 == 0 && class150.field2489 == 0 && class150.field2492 == 0 && class150.field2487 == 0) {
            var4 = true;
        } else if (Statics.field2496 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2484 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2489 < 20 && class150.field2487 > 0) {
                        class151 var5 = (class151) class150.field2495.method3162();
                        class107 var6 = new class107(4);
                        var6.method2102(1);
                        var6.method2217((int) var5.field2867);
                        Statics.field2496.method2556(var6.field1849, 0, 4);
                        class150.field2497.method3168(var5, var5.field2867);
                        class150.field2487--;
                        class150.field2489++;
                    }
                    while (class150.field2499 < 20 && class150.field2492 > 0) {
                        class151 var7 = (class151) class150.field2490.method3244();
                        class107 var8 = new class107(4);
                        var8.method2102(0);
                        var8.method2217((int) var7.field2867);
                        Statics.field2496.method2556(var8.field1849, 0, 4);
                        var7.method3254();
                        class150.field2485.method3168(var7, var7.field2867);
                        class150.field2492--;
                        class150.field2499++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2496.method2554();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2484 = 0;
                        byte var11 = 0;
                        if (Statics.field1888 == null) {
                            var11 = 8;
                        } else if (class150.field2483 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2502.field1844;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2496.method2555(class150.field2502.field1849, class150.field2502.field1844, var12);
                            if (class150.field2488 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2502.field1849[class150.field2502.field1844 + var13] ^= class150.field2488;
                                }
                            }
                            class150.field2502.field1844 += var12;
                            if (class150.field2502.field1844 < var11) {
                                break;
                            }
                            if (Statics.field1888 == null) {
                                class150.field2502.field1844 = 0;
                                int var14 = class150.field2502.method2226();
                                int var15 = class150.field2502.method2152();
                                int var16 = class150.field2502.method2226();
                                int var17 = class150.field2502.method2121();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2497.method3171(var18);
                                Statics.field1916 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2485.method3171(var18);
                                    Statics.field1916 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1888 = var20;
                                Statics.field2092 = new class107(var17 + var21 + Statics.field1888.field2506);
                                Statics.field2092.method2102(var16);
                                Statics.field2092.method2137(var17);
                                class150.field2483 = 8;
                                class150.field2502.field1844 = 0;
                            } else if (class150.field2483 == 0) {
                                if (class150.field2502.field1849[0] == -1) {
                                    class150.field2483 = 1;
                                    class150.field2502.field1844 = 0;
                                } else {
                                    Statics.field1888 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2092.field1849.length - Statics.field1888.field2506;
                            int var23 = 512 - class150.field2483;
                            if (var23 > var22 - Statics.field2092.field1844) {
                                var23 = var22 - Statics.field2092.field1844;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2496.method2555(Statics.field2092.field1849, Statics.field2092.field1844, var23);
                            if (class150.field2488 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2092.field1849[Statics.field2092.field1844 + var24] ^= class150.field2488;
                                }
                            }
                            Statics.field2092.field1844 += var23;
                            class150.field2483 += var23;
                            if (Statics.field2092.field1844 == var22) {
                                if (Statics.field1888.field2867 == 16711935L) {
                                    Statics.field2661 = Statics.field2092;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2498[var25];
                                        if (var26 != null) {
                                            Statics.field2661.field1844 = var25 * 8 + 5;
                                            int var27 = Statics.field2661.method2121();
                                            int var28 = Statics.field2661.method2121();
                                            var26.method2778(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2493.reset();
                                    class150.field2493.update(Statics.field2092.field1849, 0, var22);
                                    int var29 = (int) class150.field2493.getValue();
                                    if (Statics.field1888.field2509 != var29) {
                                        try {
                                            Statics.field2496.method2571();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2500++;
                                        Statics.field2496 = null;
                                        class150.field2488 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2500 = 0;
                                    class150.field2501 = 0;
                                    Statics.field1888.field2505.method2774((int) (Statics.field1888.field2867 & 0xFFFFL), Statics.field2092.field1849, (Statics.field1888.field2867 & 0xFF0000L) == 16711680L, Statics.field1916);
                                }
                                Statics.field1888.method3273();
                                if (Statics.field1916) {
                                    class150.field2489--;
                                } else {
                                    class150.field2499--;
                                }
                                class150.field2483 = 0;
                                Statics.field1888 = null;
                                Statics.field2092 = null;
                            } else {
                                if (class150.field2483 != 512) {
                                    break;
                                }
                                class150.field2483 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2496.method2571();
                } catch (Exception var34) {
                }
                class150.field2501++;
                Statics.field2496 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method171();
        }
    }

    @ObfuscatedName("client.p(I)V")
    public void method171() {
        if (class150.field2500 >= 4) {
            this.method2586("js5crc");
            field269 = 1000;
            return;
        }
        if (class150.field2501 >= 4) {
            if (field269 <= 5) {
                this.method2586("js5io");
                field269 = 1000;
                return;
            }
            field291 = 3000;
            class150.field2501 = 3;
        }
        if (--field291 + 1 > 0) {
            return;
        }
        try {
            if (field290 == 0) {
                Statics.field1859 = Statics.field2672.method2462(Statics.field1814, Statics.field716);
                field290++;
            }
            if (field290 == 1) {
                if (Statics.field1859.field2063 == 2) {
                    this.method176(-1);
                    return;
                }
                if (Statics.field1859.field2063 == 1) {
                    field290++;
                }
            }
            if (field290 == 2) {
                Statics.field2006 = new class130((Socket) Statics.field1859.field2060, Statics.field2672);
                class107 var1 = new class107(5);
                var1.method2102(15);
                var1.method2137(56);
                Statics.field2006.method2556(var1.field1849, 0, 5);
                field290++;
                Statics.field2089 = class103.method1957();
            }
            if (field290 == 3) {
                if (field269 <= 5 || Statics.field2006.method2554() > 0) {
                    int var2 = Statics.field2006.method2553();
                    if (var2 != 0) {
                        this.method176(var2);
                        return;
                    }
                    field290++;
                } else if (class103.method1957() - Statics.field2089 > 30000L) {
                    this.method176(-2);
                    return;
                }
            }
            if (field290 == 4) {
                class130 var3 = Statics.field2006;
                boolean var4 = field269 > 20;
                if (Statics.field2496 != null) {
                    try {
                        Statics.field2496.method2571();
                    } catch (Exception var14) {
                    }
                    Statics.field2496 = null;
                }
                Statics.field2496 = var3;
                class150.method556(var4);
                class150.field2502.field1844 = 0;
                Statics.field1888 = null;
                Statics.field2092 = null;
                class150.field2483 = 0;
                while (true) {
                    class151 var6 = (class151) class150.field2497.method3162();
                    if (var6 == null) {
                        while (true) {
                            class151 var7 = (class151) class150.field2485.method3162();
                            if (var7 == null) {
                                if (class150.field2488 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2102(4);
                                        var8.method2102(class150.field2488);
                                        var8.method2223(0);
                                        Statics.field2496.method2556(var8.field1849, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2496.method2571();
                                        } catch (Exception var12) {
                                        }
                                        class150.field2501++;
                                        Statics.field2496 = null;
                                    }
                                }
                                class150.field2484 = 0;
                                Statics.field2486 = class103.method1957();
                                Statics.field1859 = null;
                                Statics.field2006 = null;
                                field290 = 0;
                                field282 = 0;
                                return;
                            }
                            class150.field2490.method3239(var7);
                            class150.field2491.method3168(var7, var7.field2867);
                            class150.field2492++;
                            class150.field2499--;
                        }
                    }
                    class150.field2495.method3168(var6, var6.field2867);
                    class150.field2487++;
                    class150.field2489--;
                }
            }
        } catch (IOException var15) {
            this.method176(-3);
        }
    }

    @ObfuscatedName("client.w(II)V")
    public void method176(int arg0) {
        Statics.field1859 = null;
        Statics.field2006 = null;
        field290 = 0;
        if (Statics.field716 == Statics.field645) {
            Statics.field716 = Statics.field550;
        } else {
            Statics.field716 = Statics.field645;
        }
        field282++;
        if (field282 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field269 <= 5) {
                this.method2586("js5connect_full");
                field269 = 1000;
            } else {
                field291 = 3000;
            }
        } else if (field282 >= 2 && arg0 == 6) {
            this.method2586("js5connect_outofdate");
            field269 = 1000;
        } else if (field282 >= 4) {
            if (field269 <= 5) {
                this.method2586("js5connect");
                field269 = 1000;
            } else {
                field291 = 3000;
            }
        }
    }

    @ObfuscatedName("x.y(I)V")
    public static void method33() {
        if (field289 == 0) {
            Statics.field66 = new class79(4, 104, 104, class6.field83);
            for (int var0 = 0; var0 < 4; var0++) {
                field321[var0] = new class197(104, 104);
            }
            Statics.field1030 = new class72(512, 512);
            class28.field662 = class142.field2348;
            class28.field661 = 5;
            field289 = 20;
        } else if (field289 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1480[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1643(var1, 500, 800, 512, 334);
            class28.field662 = class142.field2147;
            class28.field661 = 10;
            field289 = 30;
        } else if (field289 == 30) {
            Statics.field62 = method551(0, false, true, true);
            Statics.field621 = method551(1, false, true, true);
            Statics.field1810 = method551(2, true, false, true);
            Statics.field2470 = method551(3, false, true, true);
            Statics.field1455 = method551(4, false, true, true);
            Statics.field253 = method551(5, true, true, true);
            Statics.field532 = method551(6, true, true, false);
            Statics.field24 = method551(7, false, true, true);
            Statics.field292 = method551(8, false, true, true);
            Statics.field1829 = method551(9, false, true, true);
            Statics.field1246 = method551(10, false, true, true);
            Statics.field548 = method551(11, false, true, true);
            Statics.field529 = method551(12, false, true, true);
            Statics.field620 = method551(13, true, false, true);
            Statics.field196 = method551(14, false, true, false);
            Statics.field2651 = method551(15, false, true, true);
            class28.field662 = class142.field2148;
            class28.field661 = 20;
            field289 = 40;
        } else if (field289 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field62.method2773() * 4 / 100;
            int var8 = var7 + Statics.field621.method2773() * 4 / 100;
            int var9 = var8 + Statics.field1810.method2773() * 2 / 100;
            int var10 = var9 + Statics.field2470.method2773() * 2 / 100;
            int var11 = var10 + Statics.field1455.method2773() * 6 / 100;
            int var12 = var11 + Statics.field253.method2773() * 4 / 100;
            int var13 = var12 + Statics.field532.method2773() * 2 / 100;
            int var14 = var13 + Statics.field24.method2773() * 60 / 100;
            int var15 = var14 + Statics.field292.method2773() * 2 / 100;
            int var16 = var15 + Statics.field1829.method2773() * 2 / 100;
            int var17 = var16 + Statics.field1246.method2773() * 2 / 100;
            int var18 = var17 + Statics.field548.method2773() * 2 / 100;
            int var19 = var18 + Statics.field529.method2773() * 2 / 100;
            int var20 = var19 + Statics.field620.method2773() * 2 / 100;
            int var21 = var20 + Statics.field196.method2773() * 2 / 100;
            int var22 = var21 + Statics.field2651.method2773() * 2 / 100;
            if (var22 == 100) {
                class28.field662 = class142.field2150;
                class28.field661 = 30;
                field289 = 45;
            } else {
                if (var22 != 0) {
                    class28.field662 = class142.field2149 + var22 + "%";
                }
                class28.field661 = 30;
            }
        } else if (field289 == 45) {
            boolean var23 = !field433;
            Statics.field1077 = 22050;
            Statics.field1081 = var23;
            Statics.field1250 = 2;
            class162 var24 = new class162();
            var24.method3054(9, 128);
            Statics.field618 = class50.method549(Statics.field2672, Statics.field2040, 0, 22050);
            Statics.field618.method968(var24);
            class147 var25 = Statics.field2651;
            class147 var26 = Statics.field196;
            class147 var27 = Statics.field1455;
            Statics.field2710 = var25;
            Statics.field2707 = var26;
            Statics.field2708 = var27;
            Statics.field2709 = var24;
            Statics.field1569 = class50.method549(Statics.field2672, Statics.field2040, 1, 2048);
            Statics.field206 = new class49();
            Statics.field1569.method968(Statics.field206);
            Statics.field1989 = new class68(22050, Statics.field1077);
            class28.field662 = class142.field2180;
            class28.field661 = 35;
            field289 = 50;
        } else if (field289 == 50) {
            int var28 = 0;
            if (Statics.field138 == null) {
                Statics.field138 = class70.method674(Statics.field292, Statics.field620, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field959 == null) {
                Statics.field959 = class70.method674(Statics.field292, Statics.field620, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1086 == null) {
                Statics.field1086 = class70.method674(Statics.field292, Statics.field620, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field662 = class142.field2152 + var28 * 100 / 3 + "%";
                class28.field661 = 40;
            } else {
                Statics.field1831 = new class145(true);
                class28.field662 = class142.field2157;
                class28.field661 = 40;
                field289 = 60;
            }
        } else if (field289 == 60) {
            class147 var29 = Statics.field1246;
            class147 var30 = Statics.field292;
            int var31 = 0;
            if (var29.method2739("title.jpg", "")) {
                var31++;
            }
            if (var30.method2739("logo", "")) {
                var31++;
            }
            if (var30.method2739("titlebox", "")) {
                var31++;
            }
            if (var30.method2739("titlebutton", "")) {
                var31++;
            }
            if (var30.method2739("runes", "")) {
                var31++;
            }
            if (var30.method2739("title_mute", "")) {
                var31++;
            }
            if (var30.method2714("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method2714("options_radio_buttons,2")) {
                var31++;
            }
            var30.method2739("sl_back", "");
            var30.method2739("sl_flags", "");
            var30.method2739("sl_arrows", "");
            var30.method2739("sl_stars", "");
            var30.method2739("sl_button", "");
            byte var34 = 8;
            if (var31 < var34) {
                class28.field662 = class142.field2139 + var31 * 100 / var34 + "%";
                class28.field661 = 50;
            } else {
                class28.field662 = class142.field2155;
                class28.field661 = 50;
                method592(5);
                field289 = 70;
            }
        } else if (field289 == 70) {
            if (Statics.field1810.method2699()) {
                class147 var36 = Statics.field1810;
                Statics.field947 = var36;
                class147 var37 = Statics.field1810;
                Statics.field890 = var37;
                class40.method789(Statics.field1810, Statics.field24);
                class147 var38 = Statics.field1810;
                class147 var39 = Statics.field24;
                boolean var40 = field433;
                Statics.field832 = var38;
                Statics.field833 = var39;
                class36.field834 = var40;
                class35.method2673(Statics.field1810, Statics.field24);
                class45.method715(Statics.field1810, Statics.field24, field401, Statics.field138);
                class38.method2674(Statics.field1810, Statics.field62, Statics.field621);
                class147 var41 = Statics.field1810;
                class147 var42 = Statics.field24;
                Statics.field919 = var41;
                Statics.field1452 = var42;
                class42.method2874(Statics.field1810);
                class147 var43 = Statics.field1810;
                Statics.field1054 = var43;
                Statics.field1043 = Statics.field1054.method2705(16);
                class152.method2059(Statics.field2470, Statics.field24, Statics.field292, Statics.field620);
                class147 var44 = Statics.field1810;
                Statics.field985 = var44;
                class147 var45 = Statics.field1810;
                Statics.field971 = var45;
                class28.field662 = class142.field2167;
                class28.field661 = 60;
                field289 = 80;
            } else {
                class28.field662 = class142.field2198 + Statics.field1810.method2788() + "%";
                class28.field661 = 60;
            }
        } else if (field289 == 80) {
            int var46 = 0;
            if (Statics.field182 == null) {
                class147 var47 = Statics.field292;
                int var48 = var47.method2710("compass");
                int var49 = var47.method2711(var48, "");
                class72 var50 = class70.method666(var47, var48, var49);
                Statics.field182 = var50;
            } else {
                var46++;
            }
            if (Statics.field242 == null) {
                class147 var51 = Statics.field292;
                int var52 = var51.method2710("mapedge");
                int var53 = var51.method2711(var52, "");
                class72 var54 = class70.method666(var51, var52, var53);
                Statics.field242 = var54;
            } else {
                var46++;
            }
            if (Statics.field660 == null) {
                Statics.field660 = class70.method517(Statics.field292, "mapscene", "");
            } else {
                var46++;
            }
            if (Statics.field2122 == null) {
                Statics.field2122 = class70.method455(Statics.field292, "mapfunction", "");
            } else {
                var46++;
            }
            if (Statics.field1046 == null) {
                Statics.field1046 = class70.method455(Statics.field292, "hitmarks", "");
            } else {
                var46++;
            }
            if (Statics.field937 == null) {
                Statics.field937 = class70.method455(Statics.field292, "headicons_pk", "");
            } else {
                var46++;
            }
            if (Statics.field543 == null) {
                Statics.field543 = class70.method455(Statics.field292, "headicons_prayer", "");
            } else {
                var46++;
            }
            if (Statics.field987 == null) {
                Statics.field987 = class70.method455(Statics.field292, "headicons_hint", "");
            } else {
                var46++;
            }
            if (Statics.field1659 == null) {
                Statics.field1659 = class70.method455(Statics.field292, "mapmarker", "");
            } else {
                var46++;
            }
            if (Statics.field534 == null) {
                Statics.field534 = class70.method455(Statics.field292, "cross", "");
            } else {
                var46++;
            }
            if (Statics.field2116 == null) {
                Statics.field2116 = class70.method455(Statics.field292, "mapdots", "");
            } else {
                var46++;
            }
            if (Statics.field2646 == null) {
                Statics.field2646 = class70.method517(Statics.field292, "scrollbar", "");
            } else {
                var46++;
            }
            if (Statics.field69 == null) {
                Statics.field69 = class70.method517(Statics.field292, "mod_icons", "");
            } else {
                var46++;
            }
            if (Statics.field28 == null) {
                Statics.field28 = class70.method1298(Statics.field292, "mapback", "");
            } else {
                var46++;
            }
            if (var46 < 14) {
                class28.field662 = class142.field2158 + var46 * 100 / 14 + "%";
                class28.field661 = 70;
            } else {
                Statics.field2904 = Statics.field69;
                Statics.field242.method1435();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                for (int var59 = 0; var59 < Statics.field2122.length; var59++) {
                    Statics.field2122[var59].method1412(var55 + var58, var56 + var58, var57 + var58);
                }
                Statics.field660[0].method1575(var55 + var58, var56 + var58, var57 + var58);
                method516();
                class28.field662 = class142.field2232;
                class28.field661 = 70;
                field289 = 90;
            }
        } else if (field289 == 90) {
            if (Statics.field1829.method2699()) {
                class88 var60 = new class88(Statics.field1829, Statics.field292, 20, 0.8D, field433 ? 64 : 128);
                class84.method1781(var60);
                class84.method1804(0.8D);
                class28.field662 = class142.field2312;
                class28.field661 = 90;
                field289 = 110;
            } else {
                class28.field662 = class142.field2160 + Statics.field1829.method2788() + "%";
                class28.field661 = 90;
            }
        } else if (field289 == 110) {
            Statics.field204 = new class12();
            Statics.field2672.method2463(Statics.field204, 10);
            class28.field662 = class142.field2162;
            class28.field661 = 94;
            field289 = 120;
        } else if (field289 == 120) {
            if (Statics.field1246.method2739("huffman", "")) {
                class102 var61 = new class102(Statics.field1246.method2712("huffman", ""));
                Statics.field2894 = var61;
                class28.field662 = class142.field2146;
                class28.field661 = 96;
                field289 = 130;
            } else {
                class28.field662 = class142.field2305 + "%";
                class28.field661 = 96;
            }
        } else if (field289 == 130) {
            if (!Statics.field2470.method2699()) {
                class28.field662 = class142.field2335 + Statics.field2470.method2788() * 4 / 5 + "%";
                class28.field661 = 100;
            } else if (!Statics.field529.method2699()) {
                class28.field662 = class142.field2335 + (80 + Statics.field529.method2788() / 6) + "%";
                class28.field661 = 100;
            } else if (Statics.field620.method2699()) {
                class28.field662 = class142.field2166;
                class28.field661 = 100;
                field289 = 140;
            } else {
                class28.field662 = class142.field2335 + (96 + Statics.field620.method2788() / 20) + "%";
                class28.field661 = 100;
            }
        } else if (field289 == 140) {
            method592(10);
        }
    }

    @ObfuscatedName("am.h(IZZZI)Ley;")
    public static class147 method551(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2085 != null) {
            var4 = new class121(arg0, class136.field2085, Statics.field1819[arg0], 1000000);
        }
        return new class147(var4, Statics.field190, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.j(I)V")
    public static void method516() {
        Statics.field136 = new int[33];
        Statics.field1531 = new int[33];
        Statics.field1985 = new int[151];
        Statics.field1288 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field28.field1320[Statics.field28.field1317 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field136[var0] = var1;
            Statics.field1531[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field28.field1320[Statics.field28.field1317 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1985[var4 - 5] = var5 - 25;
            Statics.field1288[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("ep.c(B)V")
    public static final void method2671() {
        try {
            if (field284 == 0) {
                if (Statics.field156 != null) {
                    Statics.field156.method2571();
                    Statics.field156 = null;
                }
                Statics.field347 = null;
                field313 = false;
                field295 = 0;
                field284 = 1;
            }
            if (field284 == 1) {
                if (Statics.field347 == null) {
                    Statics.field347 = Statics.field2672.method2462(Statics.field1814, Statics.field716);
                }
                if (Statics.field347.field2063 == 2) {
                    throw new IOException();
                }
                if (Statics.field347.field2063 == 1) {
                    Statics.field156 = new class130((Socket) Statics.field347.field2060, Statics.field2672);
                    Statics.field347 = null;
                    field284 = 2;
                }
            }
            if (field284 == 2) {
                field402.field1844 = 0;
                field402.method2102(14);
                Statics.field156.method2556(field402.field1849, 0, 1);
                field448.field1844 = 0;
                field284 = 3;
            }
            if (field284 == 3) {
                if (Statics.field618 != null) {
                    Statics.field618.method970();
                }
                if (Statics.field1569 != null) {
                    Statics.field1569.method970();
                }
                int var0 = Statics.field156.method2553();
                if (Statics.field618 != null) {
                    Statics.field618.method970();
                }
                if (Statics.field1569 != null) {
                    Statics.field1569.method970();
                }
                if (var0 != 0) {
                    method34(var0);
                    return;
                }
                field448.field1844 = 0;
                field284 = 5;
            }
            if (field284 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field402.field1844 = 0;
                field402.method2102(1);
                field402.method2102(class28.field669.method462());
                field402.method2137(var1[0]);
                field402.method2137(var1[1]);
                field402.method2137(var1[2]);
                field402.method2137(var1[3]);
                switch(class28.field669.field2400) {
                    case 0:
                    case 3:
                        field402.method2217(Statics.field1973);
                        field402.field1844 += 5;
                        break;
                    case 1:
                        field402.method2137((Integer) Statics.field75.field147.get(class199.method473(class28.field667)));
                        field402.field1844 += 4;
                        break;
                    case 2:
                        field402.field1844 += 8;
                }
                field402.method2107(class28.field668);
                field402.method2148(class5.field78, class5.field74);
                field303.field1844 = 0;
                if (field269 == 40) {
                    field303.method2102(18);
                } else {
                    field303.method2102(16);
                }
                field303.method2223(0);
                int var2 = field303.field1844;
                field303.method2137(56);
                field303.method2241(field402.field1849, 0, field402.field1844);
                int var3 = field303.field1844;
                field303.method2107(class28.field667);
                field303.method2102(field433 ? 1 : 0);
                class136.method1774(field303);
                class107 var4 = new class107(Statics.field1831.method2679());
                Statics.field1831.method2678(var4);
                field303.method2241(var4.field1849, 0, var4.field1849.length);
                field303.method2137(Statics.field62.field2448);
                field303.method2137(Statics.field621.field2448);
                field303.method2137(Statics.field1810.field2448);
                field303.method2137(Statics.field2470.field2448);
                field303.method2137(Statics.field1455.field2448);
                field303.method2137(Statics.field253.field2448);
                field303.method2137(Statics.field532.field2448);
                field303.method2137(Statics.field24.field2448);
                field303.method2137(Statics.field292.field2448);
                field303.method2137(Statics.field1829.field2448);
                field303.method2137(Statics.field1246.field2448);
                field303.method2137(Statics.field548.field2448);
                field303.method2137(Statics.field529.field2448);
                field303.method2137(Statics.field620.field2448);
                field303.method2137(Statics.field196.field2448);
                field303.method2137(Statics.field2651.field2448);
                field303.method2132(var1, var3, field303.field1844);
                field303.method2252(field303.field1844 - var2);
                Statics.field156.method2556(field303.field1849, 0, field303.field1844);
                field402.method2360(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field448.method2360(var1);
                field284 = 6;
            }
            if (field284 == 6 && Statics.field156.method2554() > 0) {
                int var6 = Statics.field156.method2553();
                if (var6 == 21 && field269 == 20) {
                    field284 = 7;
                } else if (var6 == 2) {
                    field284 = 9;
                } else if (var6 == 15 && field269 == 40) {
                    method7();
                    return;
                } else if (var6 == 23 && field296 < 1) {
                    field296++;
                    field284 = 0;
                } else {
                    method34(var6);
                    return;
                }
            }
            if (field284 == 7 && Statics.field156.method2554() > 0) {
                field297 = (Statics.field156.method2553() + 3) * 60;
                field284 = 8;
            }
            if (field284 == 8) {
                field295 = 0;
                class28.method2684(class142.field2170, class142.field2342, field297 / 60 + class142.field2172);
                if (--field297 <= 0) {
                    field284 = 0;
                }
            } else {
                if (field284 == 9 && Statics.field156.method2554() >= 13) {
                    boolean var7 = Statics.field156.method2553() == 1;
                    Statics.field156.method2555(field448.field1849, 0, 4);
                    field448.field1844 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field448.method2362() << 24;
                        int var10 = var9 | field448.method2362() << 16;
                        int var11 = var10 | field448.method2362() << 8;
                        int var12 = var11 | field448.method2362();
                        int var13 = class199.method473(class28.field667);
                        if (Statics.field75.field147.size() >= 10 && !Statics.field75.field147.containsKey(var13)) {
                            Iterator var14 = Statics.field75.field147.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field75.field147.put(var13, var12);
                        class9.method2044();
                    }
                    field429 = Statics.field156.method2553();
                    field424 = Statics.field156.method2553() == 1;
                    field386 = Statics.field156.method2553();
                    field386 <<= 0x8;
                    field386 += Statics.field156.method2553();
                    field387 = Statics.field156.method2553();
                    Statics.field156.method2555(field448.field1849, 0, 1);
                    field448.field1844 = 0;
                    field306 = field448.method2362();
                    Statics.field156.method2555(field448.field1849, 0, 2);
                    field448.field1844 = 0;
                    field305 = field448.method2152();
                    if (field387 == 1) {
                        try {
                            class119.method2432(Statics.field260, "zap");
                        } catch (Throwable var37) {
                        }
                    } else {
                        try {
                            class119.method2432(Statics.field260, "unzap");
                        } catch (Throwable var36) {
                        }
                    }
                    field284 = 10;
                }
                if (field284 != 10) {
                    field295++;
                    if (field295 > 2000) {
                        if (field296 < 1) {
                            if (Statics.field716 == Statics.field645) {
                                Statics.field716 = Statics.field550;
                            } else {
                                Statics.field716 = Statics.field645;
                            }
                            field296++;
                            field284 = 0;
                        } else {
                            method34(-3);
                        }
                    }
                } else if (Statics.field156.method2554() >= field305) {
                    field448.field1844 = 0;
                    Statics.field156.method2555(field448.field1849, 0, field305);
                    field508 = 1L;
                    field275 = -1;
                    Statics.field204.field185 = 0;
                    Statics.field26 = true;
                    field276 = true;
                    field383 = -1L;
                    class189.field2878 = new class180();
                    field402.field1844 = 0;
                    field448.field1844 = 0;
                    field306 = -1;
                    field310 = -1;
                    field376 = -1;
                    field407 = -1;
                    field311 = 0;
                    field349 = 0;
                    field309 = 0;
                    field279 = 0;
                    field480 = 0;
                    field403 = false;
                    class127.method30(0);
                    class10.field164.clear();
                    class10.field157.method3175();
                    class10.field161.method3220();
                    class10.field162 = 0;
                    field430 = 0;
                    field417 = false;
                    field513 = 0;
                    field426 = (int) (Math.random() * 100.0D) - 50;
                    field327 = (int) (Math.random() * 110.0D) - 55;
                    field365 = (int) (Math.random() * 80.0D) - 40;
                    field332 = (int) (Math.random() * 120.0D) - 60;
                    field334 = (int) (Math.random() * 30.0D) - 20;
                    field345 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field492 = 0;
                    field498 = -1;
                    field490 = 0;
                    field491 = 0;
                    field288 = class18.field528;
                    field483 = 0;
                    field351 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field380[var17] = null;
                        field385[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field298[var18] = null;
                    }
                    Statics.field183 = field380[2047] = new class3();
                    field394 = -1;
                    field397.method3185();
                    field398.method3185();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field395[var19][var20][var21] = null;
                            }
                        }
                    }
                    field396 = new class177();
                    field511 = 0;
                    field287 = 0;
                    field466 = 0;
                    for (int var22 = 0; var22 < Statics.field1043; var22++) {
                        class46 var23 = (class46) class46.field1049.method3136((long) var22);
                        class46 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1054.method2695(16, var22);
                            class46 var26 = new class46();
                            if (var25 != null) {
                                var26.method880(new class107(var25));
                            }
                            class46.field1049.method3127(var26, (long) var22);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        if (var24 != null) {
                            class154.field2648[var22] = 0;
                            class154.field2649[var22] = 0;
                        }
                    }
                    for (int var28 = 0; var28 < field457.length; var28++) {
                        field457[var28] = -1;
                    }
                    field444 = -1;
                    if (field422 != -1) {
                        int var29 = field422;
                        if (var29 != -1 && Statics.field2512[var29]) {
                            Statics.field2513.method2707(var29);
                            if (Statics.field2582[var29] != null) {
                                boolean var30 = true;
                                for (int var31 = 0; var31 < Statics.field2582[var29].length; var31++) {
                                    if (Statics.field2582[var29][var31] != null) {
                                        if (Statics.field2582[var29][var31].field2593 == 2) {
                                            var30 = false;
                                        } else {
                                            Statics.field2582[var29][var31] = null;
                                        }
                                    }
                                }
                                if (var30) {
                                    Statics.field2582[var29] = null;
                                }
                                Statics.field2512[var29] = false;
                            }
                        }
                    }
                    for (class4 var32 = (class4) field423.method3162(); var32 != null; var32 = (class4) field423.method3163()) {
                        Statics.method1398(var32, true);
                    }
                    field422 = -1;
                    field423 = new class174(8);
                    field449 = null;
                    field403 = false;
                    field480 = 0;
                    field468.method2908((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var33 = 0; var33 < 8; var33++) {
                        field391[var33] = null;
                        field392[var33] = false;
                    }
                    class14.method5();
                    field521 = true;
                    for (int var34 = 0; var34 < 100; var34++) {
                        field485[var34] = true;
                    }
                    field302 = null;
                    Statics.field1106 = 0;
                    Statics.field1082 = null;
                    Statics.field614 = -1;
                    method817(false);
                    field306 = -1;
                }
            }
        } catch (IOException var38) {
            if (field296 < 1) {
                if (Statics.field716 == Statics.field645) {
                    Statics.field716 = Statics.field550;
                } else {
                    Statics.field716 = Statics.field645;
                }
                field296++;
                field284 = 0;
            } else {
                method34(-2);
            }
        }
    }

    @ObfuscatedName("e.d(I)V")
    public static void method7() {
        field402.field1844 = 0;
        field448.field1844 = 0;
        field306 = -1;
        field310 = -1;
        field376 = -1;
        field407 = -1;
        field305 = 0;
        field311 = 0;
        field349 = 0;
        field480 = 0;
        field403 = false;
        field492 = 0;
        field490 = 0;
        for (int var0 = 0; var0 < field380.length; var0++) {
            if (field380[var0] != null) {
                field380[var0].field743 = -1;
            }
        }
        for (int var1 = 0; var1 < field298.length; var1++) {
            if (field298[var1] != null) {
                field298[var1].field743 = -1;
            }
        }
        class14.method5();
        method592(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field485[var2] = true;
        }
    }

    @ObfuscatedName("x.a(II)V")
    public static void method34(int arg0) {
        if (arg0 == -3) {
            class28.method2684(class142.field2173, class142.field2174, class142.field2255);
        } else if (arg0 == -2) {
            class28.method2684(class142.field2234, class142.field2177, class142.field2285);
        } else if (arg0 == -1) {
            class28.method2684(class142.field2179, class142.field2365, class142.field2181);
        } else if (arg0 == 3) {
            class28.method2684(class142.field2182, class142.field2183, class142.field2184);
        } else if (arg0 == 4) {
            class28.method2684(class142.field2185, class142.field2186, class142.field2178);
        } else if (arg0 == 5) {
            class28.method2684(class142.field2302, class142.field2189, class142.field2251);
        } else if (arg0 == 6) {
            class28.method2684(class142.field2191, class142.field2214, class142.field2193);
        } else if (arg0 == 7) {
            class28.method2684(class142.field2194, class142.field2195, class142.field2196);
        } else if (arg0 == 8) {
            class28.method2684(class142.field2197, class142.field2154, class142.field2199);
        } else if (arg0 == 9) {
            class28.method2684(class142.field2247, class142.field2201, class142.field2202);
        } else if (arg0 == 10) {
            class28.method2684(class142.field2203, class142.field2204, class142.field2205);
        } else if (arg0 == 11) {
            class28.method2684(class142.field2337, class142.field2207, class142.field2208);
        } else if (arg0 == 12) {
            class28.method2684(class142.field2209, class142.field2210, class142.field2211);
        } else if (arg0 == 13) {
            class28.method2684(class142.field2212, class142.field2151, class142.field2351);
        } else if (arg0 == 14) {
            class28.method2684(class142.field2215, class142.field2330, class142.field2217);
        } else if (arg0 == 16) {
            class28.method2684(class142.field2218, class142.field2219, class142.field2220);
        } else if (arg0 == 17) {
            class28.method2684(class142.field2221, class142.field2222, class142.field2223);
        } else if (arg0 == 18) {
            class28.method2684(class142.field2224, class142.field2225, class142.field2226);
        } else if (arg0 == 19) {
            class28.method2684(class142.field2227, class142.field2231, class142.field2229);
        } else if (arg0 == 20) {
            class28.method2684(class142.field2216, class142.field2353, class142.field2328);
        } else if (arg0 == 22) {
            class28.method2684(class142.field2233, class142.field2323, class142.field2164);
        } else if (arg0 == 23) {
            class28.method2684(class142.field2228, class142.field2237, class142.field2238);
        } else if (arg0 == 24) {
            class28.method2684(class142.field2259, class142.field2240, class142.field2241);
        } else if (arg0 == 25) {
            class28.method2684(class142.field2176, class142.field2243, class142.field2244);
        } else if (arg0 == 26) {
            class28.method2684(class142.field2245, class142.field2161, class142.field2165);
        } else if (arg0 == 27) {
            class28.method2684(class142.field2248, class142.field2239, class142.field2250);
        } else if (arg0 == 31) {
            class28.method2684(class142.field2257, class142.field2379, class142.field2141);
        } else if (arg0 == 32) {
            class28.method2684(class142.field2260, class142.field2261, class142.field2262);
        } else if (arg0 == 37) {
            class28.method2684(class142.field2263, class142.field2264, class142.field2265);
        } else if (arg0 == 38) {
            class28.method2684(class142.field2266, class142.field2267, class142.field2288);
        } else if (arg0 == 55) {
            class28.method2684(class142.field2346, class142.field2270, class142.field2271);
        } else if (arg0 == 56) {
            class28.method2684(class142.field2200, class142.field2273, class142.field2274);
            method592(11);
            return;
        } else if (arg0 == 57) {
            class28.method2684(class142.field2275, class142.field2276, class142.field2277);
            method592(11);
            return;
        } else {
            class28.method2684(class142.field2311, class142.field2279, class142.field2368);
        }
        method592(10);
    }

    @ObfuscatedName("ey.o(B)V")
    public static final void method2779() {
        if (Statics.field156 != null) {
            Statics.field156.method2571();
            Statics.field156 = null;
        }
        method1870();
        Statics.field66.method1608();
        for (int var0 = 0; var0 < 4; var0++) {
            field321[var0].method3444();
        }
        System.gc();
        class161.method1875(2);
        field355 = -1;
        field495 = false;
        for (class20 var1 = (class20) class20.field567.method3210(); var1 != null; var1 = (class20) class20.field567.method3182()) {
            if (var1.field559 != null) {
                Statics.field206.method965(var1.field559);
                var1.field559 = null;
            }
            if (var1.field568 != null) {
                Statics.field206.method965(var1.field568);
                var1.field568 = null;
            }
        }
        class20.field567.method3185();
        method592(10);
    }

    @ObfuscatedName("cw.r(I)V")
    public static final void method1870() {
        class41.field948.method3128();
        class37.method1963();
        class40.field935.method3128();
        class36.field865.method3128();
        class36.field835.method3128();
        class36.field836.method3128();
        class36.field837.method3128();
        class35.method129();
        class45.method510();
        class38.field895.method3128();
        class38.field904.method3128();
        class39.field915.method3128();
        class39.field916.method3128();
        class42.method6();
        class46.method1857();
        class157.field2670.method3128();
        class152.method2045();
        ((class88) Statics.field1457).method1863();
        class19.field539.method3128();
        Statics.field62.method2708();
        Statics.field621.method2708();
        Statics.field2470.method2708();
        Statics.field1455.method2708();
        Statics.field253.method2708();
        Statics.field532.method2708();
        Statics.field24.method2708();
        Statics.field292.method2708();
        Statics.field1829.method2708();
        Statics.field1246.method2708();
        Statics.field548.method2708();
        Statics.field529.method2708();
    }

    @ObfuscatedName("db.t(I)V")
    public static final void method2417() {
        if (field349 > 1) {
            field349--;
        }
        if (field309 > 0) {
            field309--;
        }
        if (field313) {
            field313 = false;
            if (field309 > 0) {
                method2779();
            } else {
                method592(40);
                Statics.field195 = Statics.field156;
                Statics.field156 = null;
            }
            return;
        }
        if (!field403) {
            field409[0] = class142.field2268;
            field410[0] = "";
            field441[0] = 1006;
            field480 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field156 == null) {
                var1 = false;
            } else {
                label2616: {
                    try {
                        int var2 = Statics.field156.method2554();
                        if (var2 == 0) {
                            var1 = false;
                            break label2616;
                        }
                        if (field306 == -1) {
                            Statics.field156.method2555(field448.field1849, 0, 1);
                            field448.field1844 = 0;
                            field306 = field448.method2362();
                            field305 = class166.field2804[field306];
                            var2--;
                        }
                        if (field305 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2616;
                            }
                            Statics.field156.method2555(field448.field1849, 0, 1);
                            field305 = field448.field1849[0] & 0xFF;
                            var2--;
                        }
                        if (field305 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2616;
                            }
                            Statics.field156.method2555(field448.field1849, 0, 2);
                            field448.field1844 = 0;
                            field305 = field448.method2152();
                            var2 -= 2;
                        }
                        if (var2 < field305) {
                            var1 = false;
                            break label2616;
                        }
                        field448.field1844 = 0;
                        Statics.field156.method2555(field448.field1849, 0, field305);
                        field311 = 0;
                        field407 = field376;
                        field376 = field310;
                        field310 = field306;
                        if (field306 == 111) {
                            int var3 = field448.method2140();
                            int var4 = field448.method2226();
                            int var5 = field448.method2226();
                            Statics.field2401 = var5 >> 1;
                            Statics.field183.method576(var4, var3, (var5 & 0x1) == 1);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 173) {
                            int var6 = field448.method2121();
                            int var7 = field448.method2152();
                            if (var6 < -70000) {
                                var7 += 32768;
                            }
                            class152 var8;
                            if (var6 >= 0) {
                                var8 = class152.method557(var6);
                            } else {
                                var8 = null;
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < var8.field2577.length; var9++) {
                                    var8.field2577[var9] = 0;
                                    var8.field2551[var9] = 0;
                                }
                            }
                            class14 var10 = (class14) class14.field207.method3171((long) var7);
                            if (var10 != null) {
                                for (int var11 = 0; var11 < var10.field208.length; var11++) {
                                    var10.field208[var11] = -1;
                                    var10.field205[var11] = 0;
                                }
                            }
                            int var12 = field448.method2152();
                            for (int var13 = 0; var13 < var12; var13++) {
                                int var14 = field448.method2224();
                                int var15 = field448.method2226();
                                if (var15 == 255) {
                                    var15 = field448.method2158();
                                }
                                if (var8 != null && var13 < var8.field2577.length) {
                                    var8.field2577[var13] = var14;
                                    var8.field2551[var13] = var15;
                                }
                                class14.method2458(var7, var13, var14 - 1, var15);
                            }
                            if (var8 != null) {
                                method2064(var8);
                            }
                            method546();
                            field337[++field261 - 1 & 0x1F] = var7 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 91) {
                            field279 = field448.method2226();
                            if (field279 == 1) {
                                field280 = field448.method2152();
                            }
                            if (field279 >= 2 && field279 <= 6) {
                                if (field279 == 2) {
                                    field514 = 64;
                                    field286 = 64;
                                }
                                if (field279 == 3) {
                                    field514 = 0;
                                    field286 = 64;
                                }
                                if (field279 == 4) {
                                    field514 = 128;
                                    field286 = 64;
                                }
                                if (field279 == 5) {
                                    field514 = 64;
                                    field286 = 0;
                                }
                                if (field279 == 6) {
                                    field514 = 64;
                                    field286 = 128;
                                }
                                field279 = 2;
                                field478 = field448.method2152();
                                field283 = field448.method2152();
                                field299 = field448.method2226();
                            }
                            if (field279 == 10) {
                                field515 = field448.method2152();
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 169) {
                            for (int var16 = 0; var16 < field380.length; var16++) {
                                if (field380[var16] != null) {
                                    field380[var16].field749 = -1;
                                }
                            }
                            for (int var17 = 0; var17 < field298.length; var17++) {
                                if (field298[var17] != null) {
                                    field298[var17].field749 = -1;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 98) {
                            method817(false);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 117) {
                            int var18 = field448.method2157();
                            Statics.field135 = Statics.field2672.method2485(var18);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 85) {
                            field448.field1844 += 28;
                            if (field448.method2136()) {
                                class136.method788(field448, field448.field1844 - 28);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 53) {
                            for (int var19 = 0; var19 < Statics.field1043; var19++) {
                                class46 var20 = (class46) class46.field1049.method3136((long) var19);
                                class46 var21;
                                if (var20 == null) {
                                    byte[] var22 = Statics.field1054.method2695(16, var19);
                                    class46 var23 = new class46();
                                    if (var22 != null) {
                                        var23.method880(new class107(var22));
                                    }
                                    class46.field1049.method3127(var23, (long) var19);
                                    var21 = var23;
                                } else {
                                    var21 = var20;
                                }
                                if (var21 != null) {
                                    class154.field2648[var19] = 0;
                                    class154.field2649[var19] = 0;
                                }
                            }
                            method546();
                            field450 += 32;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 247) {
                            int var25 = field448.method2224();
                            field422 = var25;
                            method483(var25);
                            class32.method73(field422);
                            for (int var26 = 0; var26 < 100; var26++) {
                                field485[var26] = true;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 207) {
                            field490 = field448.method2226();
                            if (field490 == 255) {
                                field490 = 0;
                            }
                            field491 = field448.method2226();
                            if (field491 == 255) {
                                field491 = 0;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 114) {
                            for (int var27 = 0; var27 < class154.field2649.length; var27++) {
                                if (class154.field2649[var27] != class154.field2648[var27]) {
                                    class154.field2649[var27] = class154.field2648[var27];
                                    method11(var27);
                                    field447[++field450 - 1 & 0x1F] = var27;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 84) {
                            field455 = field446;
                            if (field305 == 0) {
                                field302 = null;
                                field484 = null;
                                Statics.field1106 = 0;
                                Statics.field1082 = null;
                                field306 = -1;
                                var1 = true;
                            } else {
                                field484 = field448.method2124();
                                long var28 = field448.method2118();
                                long var30 = var28;
                                String var32;
                                if (var28 <= 0L || var28 >= 6582952005840035281L) {
                                    var32 = null;
                                } else if (var28 % 37L == 0L) {
                                    var32 = null;
                                } else {
                                    int var33 = 0;
                                    for (long var34 = var28; var34 != 0L; var34 /= 37L) {
                                        var33++;
                                    }
                                    StringBuilder var36 = new StringBuilder(var33);
                                    while (var30 != 0L) {
                                        long var37 = var30;
                                        var30 /= 37L;
                                        var36.append(class198.field2958[(int) (var37 - var30 * 37L)]);
                                    }
                                    var32 = var36.reverse().toString();
                                }
                                field302 = var32;
                                Statics.field99 = field448.method2292();
                                int var39 = field448.method2226();
                                if (var39 == 255) {
                                    field306 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1106 = var39;
                                    class21[] var40 = new class21[100];
                                    for (int var41 = 0; var41 < Statics.field1106; var41++) {
                                        var40[var41] = new class21();
                                        var40[var41].field569 = field448.method2124();
                                        var40[var41].field573 = class200.method2415(var40[var41].field569, Statics.field177);
                                        var40[var41].field571 = field448.method2152();
                                        var40[var41].field572 = field448.method2292();
                                        field448.method2124();
                                        if (var40[var41].field569.equals(Statics.field183.field44)) {
                                            Statics.field1895 = var40[var41].field572;
                                        }
                                    }
                                    boolean var42 = false;
                                    int var43 = Statics.field1106;
                                    while (var43 > 0) {
                                        boolean var44 = true;
                                        var43--;
                                        for (int var45 = 0; var45 < var43; var45++) {
                                            if (var40[var45].field573.compareTo(var40[var45 + 1].field573) > 0) {
                                                class21 var46 = var40[var45];
                                                var40[var45] = var40[var45 + 1];
                                                var40[var45 + 1] = var46;
                                                var44 = false;
                                            }
                                        }
                                        if (var44) {
                                            break;
                                        }
                                    }
                                    Statics.field1082 = var40;
                                    field306 = -1;
                                    var1 = true;
                                }
                            }
                            break label2616;
                        }
                        if (field306 == 193) {
                            class110 var47 = field448;
                            int var48 = field305;
                            class188 var49 = new class188();
                            var49.field2870 = var47.method2226();
                            var49.field2875 = var47.method2121();
                            var49.field2869 = new int[var49.field2870];
                            var49.field2872 = new int[var49.field2870];
                            var49.field2871 = new Field[var49.field2870];
                            var49.field2874 = new int[var49.field2870];
                            var49.field2873 = new Method[var49.field2870];
                            var49.field2876 = new byte[var49.field2870][][];
                            for (int var50 = 0; var50 < var49.field2870; var50++) {
                                try {
                                    int var51 = var47.method2226();
                                    if (var51 == 0 || var51 == 1 || var51 == 2) {
                                        String var52 = var47.method2124();
                                        String var53 = var47.method2124();
                                        int var54 = 0;
                                        if (var51 == 1) {
                                            var54 = var47.method2121();
                                        }
                                        var49.field2869[var50] = var51;
                                        var49.field2874[var50] = var54;
                                        if (class189.method482(var52).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var49.field2871[var50] = class189.method482(var52).getDeclaredField(var53);
                                    } else if (var51 == 3 || var51 == 4) {
                                        String var55 = var47.method2124();
                                        String var56 = var47.method2124();
                                        int var57 = var47.method2226();
                                        String[] var58 = new String[var57];
                                        for (int var59 = 0; var59 < var57; var59++) {
                                            var58[var59] = var47.method2124();
                                        }
                                        String var60 = var47.method2124();
                                        byte[][] var61 = new byte[var57][];
                                        if (var51 == 3) {
                                            for (int var62 = 0; var62 < var57; var62++) {
                                                int var63 = var47.method2121();
                                                var61[var62] = new byte[var63];
                                                var47.method2127(var61[var62], 0, var63);
                                            }
                                        }
                                        var49.field2869[var50] = var51;
                                        Class[] var64 = new Class[var57];
                                        for (int var65 = 0; var65 < var57; var65++) {
                                            var64[var65] = class189.method482(var58[var65]);
                                        }
                                        Class var66 = class189.method482(var60);
                                        if (class189.method482(var55).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var67 = class189.method482(var55).getDeclaredMethods();
                                        Method[] var68 = var67;
                                        for (int var69 = 0; var69 < var68.length; var69++) {
                                            Method var70 = var68[var69];
                                            if (var70.getName().equals(var56)) {
                                                Class[] var71 = var70.getParameterTypes();
                                                if (var64.length == var71.length) {
                                                    boolean var72 = true;
                                                    for (int var73 = 0; var73 < var64.length; var73++) {
                                                        if (var64[var73] != var71[var73]) {
                                                            var72 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var72 && var66 == var70.getReturnType()) {
                                                        var49.field2873[var50] = var70;
                                                    }
                                                }
                                            }
                                        }
                                        var49.field2876[var50] = var61;
                                    }
                                } catch (ClassNotFoundException var389) {
                                    var49.field2872[var50] = -1;
                                } catch (SecurityException var390) {
                                    var49.field2872[var50] = -2;
                                } catch (NullPointerException var391) {
                                    var49.field2872[var50] = -3;
                                } catch (Exception var392) {
                                    var49.field2872[var50] = -4;
                                } catch (Throwable var393) {
                                    var49.field2872[var50] = -5;
                                }
                            }
                            class189.field2878.method3229(var49);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 11) {
                            Statics.field697 = class117.method859(field448.method2226());
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 251) {
                            field504 = true;
                            Statics.field142 = field448.method2226();
                            Statics.field130 = field448.method2226();
                            Statics.field1423 = field448.method2152();
                            Statics.field2474 = field448.method2226();
                            Statics.field92 = field448.method2226();
                            if (Statics.field92 >= 100) {
                                int var79 = Statics.field142 * 128 + 64;
                                int var80 = Statics.field130 * 128 + 64;
                                int var81 = method548(var79, var80, Statics.field2401) - Statics.field1423;
                                int var82 = var79 - Statics.field1818;
                                int var83 = var81 - Statics.field158;
                                int var84 = var80 - Statics.field53;
                                int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                Statics.field1890 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                Statics.field82 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                if (Statics.field1890 < 128) {
                                    Statics.field1890 = 128;
                                }
                                if (Statics.field1890 > 383) {
                                    Statics.field1890 = 383;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 32 || field306 == 199 || field306 == 1 || field306 == 228 || field306 == 248 || field306 == 69 || field306 == 22 || field306 == 240 || field306 == 71 || field306 == 131) {
                            method1771();
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 29) {
                            Statics.field15 = field448.method2140();
                            Statics.field141 = field448.method2140();
                            for (int var86 = Statics.field15; var86 < Statics.field15 + 8; var86++) {
                                for (int var87 = Statics.field141; var87 < Statics.field141 + 8; var87++) {
                                    if (field395[Statics.field2401][var86][var87] != null) {
                                        field395[Statics.field2401][var86][var87] = null;
                                        method1302(var86, var87);
                                    }
                                }
                            }
                            for (class15 var88 = (class15) field396.method3210(); var88 != null; var88 = (class15) field396.method3182()) {
                                if (var88.field222 >= Statics.field15 && var88.field222 < Statics.field15 + 8 && var88.field217 >= Statics.field141 && var88.field217 < Statics.field141 + 8 && Statics.field2401 == var88.field221) {
                                    var88.field225 = 0;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 78) {
                            field511 = 1;
                            field458 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 126) {
                            int var89 = field448.method2157();
                            class152 var90 = class152.method557(var89);
                            var90.field2529 = 3;
                            var90.field2554 = Statics.field183.field41.method2906();
                            method2064(var90);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 161) {
                            int var91 = field448.method2121();
                            int var92 = field448.method2147();
                            class152 var93 = class152.method557(var91);
                            if (var93 != null && var93.field2593 == 0) {
                                if (var92 > var93.field2537 - var93.field2531) {
                                    var92 = var93.field2537 - var93.field2531;
                                }
                                if (var92 < 0) {
                                    var92 = 0;
                                }
                                if (var93.field2535 != var92) {
                                    var93.field2535 = var92;
                                    method2064(var93);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 118) {
                            field504 = false;
                            for (int var94 = 0; var94 < 5; var94++) {
                                field462[var94] = false;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 56) {
                            int var95 = field448.method2152();
                            int var96 = field448.method2121();
                            class152 var97 = class152.method557(var96);
                            if (var97.field2529 != 2 || var97.field2554 != var95) {
                                var97.field2529 = 2;
                                var97.field2554 = var95;
                                method2064(var97);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 135) {
                            String var98 = field448.method2124();
                            int var99 = field448.method2226();
                            int var100 = field448.method2226();
                            if (var99 >= 1 && var99 <= 8) {
                                if (var98.equalsIgnoreCase("null")) {
                                    var98 = null;
                                }
                                field391[var99 - 1] = var98;
                                field392[var99 - 1] = var100 == 0;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 10) {
                            int var101 = field448.method2224();
                            byte var102 = field448.method2267();
                            class154.field2648[var101] = var102;
                            if (class154.field2649[var101] != var102) {
                                class154.field2649[var101] = var102;
                                method11(var101);
                            }
                            field447[++field450 - 1 & 0x1F] = var101;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 86) {
                            int var103 = field448.method2146();
                            int var104 = field448.method2156();
                            int var105 = field448.method2147();
                            class152 var106 = class152.method557(var104);
                            var106.field2565 = (var103 << 16) + var105;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 124) {
                            int var107 = field448.method2224();
                            int var108 = field448.method2158();
                            int var109 = var107 >> 10 & 0x1F;
                            int var110 = var107 >> 5 & 0x1F;
                            int var111 = var107 & 0x1F;
                            int var112 = (var111 << 3) + (var109 << 19) + (var110 << 11);
                            class152 var113 = class152.method557(var108);
                            if (var113.field2538 != var112) {
                                var113.field2538 = var112;
                                method2064(var113);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 42) {
                            int var114 = field448.method2121();
                            int var115 = field448.method2152();
                            if (var114 < -70000) {
                                var115 += 32768;
                            }
                            class152 var116;
                            if (var114 >= 0) {
                                var116 = class152.method557(var114);
                            } else {
                                var116 = null;
                            }
                            while (field448.field1844 < field305) {
                                int var117 = field448.method2129();
                                int var118 = field448.method2152();
                                int var119 = 0;
                                if (var118 != 0) {
                                    var119 = field448.method2226();
                                    if (var119 == 255) {
                                        var119 = field448.method2121();
                                    }
                                }
                                if (var116 != null && var117 >= 0 && var117 < var116.field2577.length) {
                                    var116.field2577[var117] = var118;
                                    var116.field2551[var117] = var119;
                                }
                                class14.method2458(var115, var117, var118 - 1, var119);
                            }
                            if (var116 != null) {
                                method2064(var116);
                            }
                            method546();
                            field337[++field261 - 1 & 0x1F] = var115 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 9) {
                            int var120 = field448.method2129();
                            boolean var121 = field448.method2226() == 1;
                            String var122 = "";
                            boolean var123 = false;
                            if (var121) {
                                var122 = field448.method2124();
                                if (method1388(var122)) {
                                    var123 = true;
                                }
                            }
                            String var124 = field448.method2124();
                            if (!var123) {
                                class10.method2658(var120, var122, var124);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 27) {
                            int var125 = field305 + field448.field1844;
                            int var126 = field448.method2152();
                            int var127 = field448.method2152();
                            if (field422 != var126) {
                                field422 = var126;
                                method483(field422);
                                class32.method73(field422);
                                for (int var128 = 0; var128 < 100; var128++) {
                                    field485[var128] = true;
                                }
                            }
                            while (var127-- > 0) {
                                int var129 = field448.method2121();
                                int var130 = field448.method2152();
                                int var131 = field448.method2226();
                                class4 var132 = (class4) field423.method3171((long) var129);
                                if (var132 != null && var132.field63 != var130) {
                                    Statics.method1398(var132, true);
                                    var132 = null;
                                }
                                if (var132 == null) {
                                    var132 = method460(var129, var130, var131);
                                }
                                var132.field64 = true;
                            }
                            for (class4 var133 = (class4) field423.method3162(); var133 != null; var133 = (class4) field423.method3163()) {
                                if (var133.field64) {
                                    var133.field64 = false;
                                } else {
                                    Statics.method1398(var133, true);
                                }
                            }
                            field463 = new class174(512);
                            while (field448.field1844 < var125) {
                                int var134 = field448.method2121();
                                int var135 = field448.method2152();
                                int var136 = field448.method2152();
                                int var137 = field448.method2121();
                                for (int var138 = var135; var138 <= var136; var138++) {
                                    long var139 = ((long) var134 << 32) + (long) var138;
                                    field463.method3168(new class179(var137), var139);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 139) {
                            field388 = 0;
                            field335 = 0;
                            method558();
                            method481();
                            Statics.method885();
                            method1856();
                            for (int var141 = 0; var141 < field388; var141++) {
                                int var142 = field389[var141];
                                if (field442 != field380[var142].field766) {
                                    field380[var142] = null;
                                }
                            }
                            if (field305 != field448.field1844) {
                                throw new RuntimeException(field448.field1844 + class2.field29 + field305);
                            }
                            for (int var143 = 0; var143 < field483; var143++) {
                                if (field380[field382[var143]] == null) {
                                    throw new RuntimeException(var143 + class2.field29 + field483);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 171) {
                            method553();
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 154) {
                            int var144 = field448.method2156();
                            class152 var145 = class152.method557(var144);
                            for (int var146 = 0; var146 < var145.field2577.length; var146++) {
                                var145.field2577[var146] = -1;
                                var145.field2577[var146] = 0;
                            }
                            method2064(var145);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 113) {
                            int var147 = field448.method2146();
                            int var148 = field448.method2157();
                            int var149 = field448.method2224();
                            int var150 = field448.method2147();
                            class152 var151 = class152.method557(var148);
                            if (var151.field2561 != var147 || var151.field2562 != var149 || var151.field2572 != var150) {
                                var151.field2561 = var147;
                                var151.field2562 = var149;
                                var151.field2572 = var150;
                                method2064(var151);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 121) {
                            String var152 = field448.method2124();
                            String var153 = class192.method3380(class199.method1872(class191.method2641(field448)));
                            class10.method2658(6, var152, var153);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 102) {
                            field349 = field448.method2224() * 30;
                            field456 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 41) {
                            String var154 = field448.method2124();
                            int var155 = field448.method2157();
                            class152 var156 = class152.method557(var155);
                            if (!var154.equals(var156.field2568)) {
                                var156.field2568 = var154;
                                method2064(var156);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 51) {
                            int var157 = field448.method2156();
                            int var158 = field448.method2147();
                            class154.field2648[var158] = var157;
                            if (class154.field2649[var158] != var157) {
                                class154.field2649[var158] = var157;
                                method11(var158);
                            }
                            field447[++field450 - 1 & 0x1F] = var158;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 244) {
                            int var159 = field448.method2208();
                            int var160 = field448.method2204();
                            int var161 = field448.method2157();
                            class152 var162 = class152.method557(var161);
                            int var163 = var162.field2528 + var159;
                            int var164 = var162.field2523 + var160;
                            if (var162.field2526 != var163 || var162.field2527 != var164) {
                                var162.field2526 = var163;
                                var162.field2527 = var164;
                                method2064(var162);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 221) {
                            while (field448.field1844 < field305) {
                                int var165 = field448.method2226();
                                boolean var166 = (var165 & 0x1) == 1;
                                String var167 = field448.method2124();
                                String var168 = field448.method2124();
                                field448.method2124();
                                for (int var169 = 0; var169 < field466; var169++) {
                                    class8 var170 = field427[var169];
                                    if (var166) {
                                        if (var168.equals(var170.field140)) {
                                            var170.field140 = var167;
                                            var170.field133 = var168;
                                            var167 = null;
                                            break;
                                        }
                                    } else if (var167.equals(var170.field140)) {
                                        var170.field140 = var167;
                                        var170.field133 = var168;
                                        var167 = null;
                                        break;
                                    }
                                }
                                if (var167 != null && field466 < 400) {
                                    class8 var171 = new class8();
                                    field427[field466] = var171;
                                    var171.field140 = var167;
                                    var171.field133 = var168;
                                    field466++;
                                }
                            }
                            field458 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 83) {
                            String var172 = field448.method2124();
                            long var173 = (long) field448.method2152();
                            long var175 = (long) field448.method2112();
                            int var177 = field448.method2226();
                            long var178 = (var173 << 32) + var175;
                            boolean var180 = false;
                            for (int var181 = 0; var181 < 100; var181++) {
                                if (field477[var181] == var178) {
                                    var180 = true;
                                    break;
                                }
                            }
                            if (method1388(var172)) {
                                var180 = true;
                            }
                            if (!var180 && field331 == 0) {
                                field477[field323] = var178;
                                field323 = (field323 + 1) % 100;
                                String var182 = class192.method3380(class199.method1872(class191.method2641(field448)));
                                if (var177 == 2 || var177 == 3) {
                                    class10.method2658(7, class2.method754(1) + var172, var182);
                                } else if (var177 == 1) {
                                    class10.method2658(7, class2.method754(0) + var172, var182);
                                } else {
                                    class10.method2658(3, var172, var182);
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 246) {
                            Statics.field15 = field448.method2141();
                            Statics.field141 = field448.method2101();
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 37) {
                            method546();
                            int var183 = field448.method2157();
                            int var184 = field448.method2226();
                            int var185 = field448.method2140();
                            field436[var185] = var183;
                            field294[var185] = var184;
                            field400[var185] = 1;
                            for (int var186 = 0; var186 < 98; var186++) {
                                if (var183 >= class140.field2120[var186]) {
                                    field400[var185] = var186 + 2;
                                }
                            }
                            field451[++field452 - 1 & 0x1F] = var185;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 212) {
                            if (field422 != -1) {
                                method2041(field422, 0);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 218) {
                            while (field448.field1844 < field305) {
                                boolean var187 = field448.method2226() == 1;
                                String var188 = field448.method2124();
                                String var189 = field448.method2124();
                                int var190 = field448.method2152();
                                int var191 = field448.method2226();
                                int var192 = field448.method2226();
                                boolean var193 = (var192 & 0x2) != 0;
                                boolean var194 = (var192 & 0x1) != 0;
                                if (var190 > 0) {
                                    field448.method2124();
                                    field448.method2226();
                                    field448.method2121();
                                }
                                field448.method2124();
                                for (int var195 = 0; var195 < field287; var195++) {
                                    class16 var196 = field512[var195];
                                    if (var187) {
                                        if (var189.equals(var196.field240)) {
                                            var196.field240 = var188;
                                            var196.field229 = var189;
                                            var188 = null;
                                            break;
                                        }
                                    } else if (var188.equals(var196.field240)) {
                                        if (var196.field230 != var190) {
                                            boolean var197 = true;
                                            for (class34 var198 = (class34) field346.method3149(); var198 != null; var198 = (class34) field346.method3151()) {
                                                if (var198.field781.equals(var188)) {
                                                    if (var190 != 0 && var198.field786 == 0) {
                                                        var198.method3270();
                                                        var197 = false;
                                                    } else if (var190 == 0 && var198.field786 != 0) {
                                                        var198.method3270();
                                                        var197 = false;
                                                    }
                                                }
                                            }
                                            if (var197) {
                                                field346.method3148(new class34(var188, var190));
                                            }
                                            var196.field230 = var190;
                                        }
                                        var196.field229 = var189;
                                        var196.field232 = var191;
                                        var196.field235 = var193;
                                        var196.field241 = var194;
                                        var188 = null;
                                        break;
                                    }
                                }
                                if (var188 != null && field287 < 400) {
                                    class16 var199 = new class16();
                                    field512[field287] = var199;
                                    var199.field240 = var188;
                                    var199.field229 = var189;
                                    var199.field230 = var190;
                                    var199.field232 = var191;
                                    var199.field235 = var193;
                                    var199.field241 = var194;
                                    field287++;
                                }
                            }
                            field511 = 2;
                            field458 = field446;
                            boolean var200 = false;
                            int var201 = field287;
                            while (var201 > 0) {
                                boolean var202 = true;
                                var201--;
                                for (int var203 = 0; var203 < var201; var203++) {
                                    boolean var204 = false;
                                    class16 var205 = field512[var203];
                                    class16 var206 = field512[var203 + 1];
                                    if (field262 != var205.field230 && field262 == var206.field230) {
                                        var204 = true;
                                    }
                                    if (!var204 && var205.field230 == 0 && var206.field230 != 0) {
                                        var204 = true;
                                    }
                                    if (!var204 && !var205.field235 && var206.field235) {
                                        var204 = true;
                                    }
                                    if (!var204 && !var205.field241 && var206.field241) {
                                        var204 = true;
                                    }
                                    if (var204) {
                                        class16 var207 = field512[var203];
                                        field512[var203] = field512[var203 + 1];
                                        field512[var203 + 1] = var207;
                                        var202 = false;
                                    }
                                }
                                if (var202) {
                                    break;
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 80) {
                            field492 = field448.method2226();
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 185) {
                            String var208 = field448.method2124();
                            int var209 = field448.method2152();
                            byte var210 = field448.method2292();
                            boolean var211 = false;
                            if (var210 == -128) {
                                var211 = true;
                            }
                            if (var211) {
                                if (Statics.field1106 == 0) {
                                    field306 = -1;
                                    var1 = true;
                                    break label2616;
                                }
                                boolean var212 = false;
                                int var213;
                                for (var213 = 0; var213 < Statics.field1106 && (!Statics.field1082[var213].field569.equals(var208) || Statics.field1082[var213].field571 != var209); var213++) {
                                }
                                if (var213 < Statics.field1106) {
                                    while (var213 < Statics.field1106 - 1) {
                                        Statics.field1082[var213] = Statics.field1082[var213 + 1];
                                        var213++;
                                    }
                                    Statics.field1106--;
                                    Statics.field1082[Statics.field1106] = null;
                                }
                            } else {
                                field448.method2124();
                                class21 var214 = new class21();
                                var214.field569 = var208;
                                var214.field573 = class200.method2415(var214.field569, Statics.field177);
                                var214.field571 = var209;
                                var214.field572 = var210;
                                int var215;
                                for (var215 = Statics.field1106 - 1; var215 >= 0; var215--) {
                                    int var216 = Statics.field1082[var215].field573.compareTo(var214.field569);
                                    if (var216 == 0) {
                                        Statics.field1082[var215].field571 = var209;
                                        Statics.field1082[var215].field572 = var210;
                                        if (var208.equals(Statics.field183.field44)) {
                                            Statics.field1895 = var210;
                                        }
                                        field455 = field446;
                                        field306 = -1;
                                        var1 = true;
                                        break label2616;
                                    }
                                    if (var216 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1106 >= Statics.field1082.length) {
                                    field306 = -1;
                                    var1 = true;
                                    break label2616;
                                }
                                for (int var217 = Statics.field1106 - 1; var217 > var215; var217--) {
                                    Statics.field1082[var217 + 1] = Statics.field1082[var217];
                                }
                                if (Statics.field1106 == 0) {
                                    Statics.field1082 = new class21[100];
                                }
                                Statics.field1082[var215 + 1] = var214;
                                Statics.field1106++;
                                if (var208.equals(Statics.field183.field44)) {
                                    Statics.field1895 = var210;
                                }
                            }
                            field455 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 30) {
                            method546();
                            field271 = field448.method2226();
                            field456 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 191) {
                            int var218 = field448.method2152();
                            Statics.method2393(var218);
                            field337[++field261 - 1 & 0x1F] = var218 & 0x7FFF;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 63) {
                            method2779();
                            field306 = -1;
                            var1 = false;
                            break label2616;
                        }
                        if (field306 == 144) {
                            int var219 = field448.method2121();
                            int var220 = field448.method2158();
                            int var221 = field448.method2152();
                            if (var221 == 65535) {
                                var221 = -1;
                            }
                            int var222 = field448.method2224();
                            if (var222 == 65535) {
                                var222 = -1;
                            }
                            for (int var223 = var222; var223 <= var221; var223++) {
                                long var224 = ((long) var220 << 32) + (long) var223;
                                class186 var226 = field463.method3171(var224);
                                if (var226 != null) {
                                    var226.method3273();
                                }
                                field463.method3168(new class179(var219), var224);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 18) {
                            int var227 = field448.method2149();
                            int var228 = field448.method2156();
                            class152 var229 = class152.method557(var228);
                            if (var229.field2605 != var227 || var227 == -1) {
                                var229.field2605 = var227;
                                var229.field2627 = 0;
                                var229.field2608 = 0;
                                method2064(var229);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 160) {
                            int var230 = field448.method2121();
                            int var231 = field448.method2146();
                            class152 var232 = class152.method557(var230);
                            if (var232.field2529 != 1 || var232.field2554 != var231) {
                                var232.field2529 = 1;
                                var232.field2554 = var231;
                                method2064(var232);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 77) {
                            field504 = true;
                            Statics.field226 = field448.method2226();
                            Statics.field1267 = field448.method2226();
                            Statics.field150 = field448.method2152();
                            Statics.field73 = field448.method2226();
                            Statics.field1112 = field448.method2226();
                            if (Statics.field1112 >= 100) {
                                Statics.field1818 = Statics.field226 * 128 + 64;
                                Statics.field53 = Statics.field1267 * 128 + 64;
                                Statics.field158 = method548(Statics.field1818, Statics.field53, Statics.field2401) - Statics.field150;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 104) {
                            class22 var233 = new class22();
                            var233.field581 = field448.method2124();
                            var233.field589 = field448.method2152();
                            int var234 = field448.method2121();
                            var233.field579 = var234;
                            method592(45);
                            Statics.field156.method2571();
                            Statics.field156 = null;
                            class28.method2811(var233);
                            field306 = -1;
                            var1 = false;
                            break label2616;
                        }
                        if (field306 == 231) {
                            method817(true);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 150) {
                            int var235 = field448.method2226();
                            int var236 = field448.method2226();
                            int var237 = field448.method2226();
                            int var238 = field448.method2226();
                            field462[var235] = true;
                            field506[var235] = var236;
                            field338[var235] = var237;
                            field369[var235] = var238;
                            field509[var235] = 0;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 168) {
                            int var239 = field448.method2152();
                            if (var239 == 65535) {
                                var239 = -1;
                            }
                            if (var239 == -1 && !field495) {
                                Statics.field2709.method3008();
                                class161.field2706 = 1;
                                Statics.field785 = null;
                            } else if (var239 != -1 && field355 != var239 && field493 != 0 && !field495) {
                                class147 var240 = Statics.field532;
                                int var241 = field493;
                                class161.field2706 = 1;
                                Statics.field785 = var240;
                                Statics.field153 = var239;
                                Statics.field2711 = 0;
                                Statics.field601 = var241;
                                Statics.field1273 = false;
                                Statics.field2102 = 2;
                            }
                            field355 = var239;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 16) {
                            int var242 = field448.method2117();
                            int var243 = field448.method2152();
                            if (var243 == 65535) {
                                var243 = -1;
                            }
                            method3116(var243, var242);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 119) {
                            method546();
                            field428 = field448.method2204();
                            field456 = field446;
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 196) {
                            Statics.field141 = field448.method2226();
                            Statics.field15 = field448.method2140();
                            while (field448.field1844 < field305) {
                                field306 = field448.method2226();
                                method1771();
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 4) {
                            field475 = field448.method2226();
                            field476 = field448.method2226();
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 208) {
                            int var244 = field448.method2121();
                            class4 var245 = (class4) field423.method3171((long) var244);
                            if (var245 != null) {
                                Statics.method1398(var245, true);
                            }
                            if (field449 != null) {
                                method2064(field449);
                                field449 = null;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 172) {
                            String var246 = field448.method2124();
                            long var247 = field448.method2118();
                            long var249 = (long) field448.method2152();
                            long var251 = (long) field448.method2112();
                            int var253 = field448.method2226();
                            long var254 = (var249 << 32) + var251;
                            boolean var256 = false;
                            for (int var257 = 0; var257 < 100; var257++) {
                                if (field477[var257] == var254) {
                                    var256 = true;
                                    break;
                                }
                            }
                            if (var253 <= 1 && method1388(var246)) {
                                var256 = true;
                            }
                            if (!var256 && field331 == 0) {
                                field477[field323] = var254;
                                field323 = (field323 + 1) % 100;
                                String var258 = class192.method3380(class199.method1872(class191.method2641(field448)));
                                if (var253 == 2 || var253 == 3) {
                                    class10.method845(9, class2.method754(1) + var246, var258, class198.method472(var247));
                                } else if (var253 == 1) {
                                    class10.method845(9, class2.method754(0) + var246, var258, class198.method472(var247));
                                } else {
                                    class10.method845(9, var246, var258, class198.method472(var247));
                                }
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 46) {
                            boolean var259 = field448.method2140() == 1;
                            int var260 = field448.method2156();
                            class152 var261 = class152.method557(var260);
                            if (var261.field2533 != var259) {
                                var261.field2533 = var259;
                                method2064(var261);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 163) {
                            int var262 = field448.method2147();
                            if (var262 == 65535) {
                                var262 = -1;
                            }
                            int var263 = field448.method2157();
                            int var264 = field448.method2158();
                            class152 var265 = class152.method557(var264);
                            if (var265.field2520) {
                                var265.field2625 = var262;
                                var265.field2616 = var263;
                                class45 var267 = class45.method28(var262);
                                var265.field2561 = var267.field998;
                                var265.field2562 = var267.field1039;
                                var265.field2540 = var267.field1008;
                                var265.field2559 = var267.field1009;
                                var265.field2560 = var267.field1010;
                                var265.field2572 = var267.field1005;
                                if (var265.field2530 > 0) {
                                    var265.field2572 = var265.field2572 * 32 / var265.field2530;
                                }
                                method2064(var265);
                            } else {
                                if (var262 == -1) {
                                    var265.field2529 = 0;
                                    field306 = -1;
                                    var1 = true;
                                    break label2616;
                                }
                                class45 var266 = class45.method28(var262);
                                var265.field2529 = 4;
                                var265.field2554 = var262;
                                var265.field2561 = var266.field998;
                                var265.field2562 = var266.field1039;
                                var265.field2572 = var266.field1005 * 100 / var263;
                                method2064(var265);
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 146) {
                            String var268 = field448.method2124();
                            Object[] var269 = new Object[var268.length() + 1];
                            for (int var270 = var268.length() - 1; var270 >= 0; var270--) {
                                if (var268.charAt(var270) == 's') {
                                    var269[var270 + 1] = field448.method2124();
                                } else {
                                    var269[var270 + 1] = Integer.valueOf(field448.method2121());
                                }
                            }
                            var269[0] = Integer.valueOf(field448.method2121());
                            class1 var271 = new class1();
                            var271.field12 = var269;
                            class32.method884(var271);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 243) {
                            int var272 = field448.method2152();
                            int var273 = field448.method2226();
                            int var274 = field448.method2152();
                            if (field496 != 0 && var273 != 0 && field513 < 50) {
                                field499[field513] = var272;
                                field500[field513] = var273;
                                field501[field513] = var274;
                                field503[field513] = null;
                                field502[field513] = 0;
                                field513++;
                            }
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        if (field306 == 93) {
                            int var278 = field448.method2158();
                            int var279 = field448.method2152();
                            int var280 = field448.method2101();
                            class4 var281 = (class4) field423.method3171((long) var278);
                            if (var281 != null) {
                                Statics.method1398(var281, var281.field63 != var279);
                            }
                            method460(var278, var279, var280);
                            field306 = -1;
                            var1 = true;
                            break label2616;
                        }
                        class135.method457("" + field306 + class2.field29 + field376 + class2.field29 + field407 + class2.field29 + field305, (Throwable) null);
                        method2779();
                    } catch (IOException var394) {
                        if (field309 > 0) {
                            method2779();
                        } else {
                            method592(40);
                            Statics.field195 = Statics.field156;
                            Statics.field156 = null;
                        }
                    } catch (Exception var395) {
                        String var284 = "" + field306 + class2.field29 + field376 + class2.field29 + field407 + class2.field29 + field305 + class2.field29 + (Statics.field314 + Statics.field183.field772[0]) + class2.field29 + (Statics.field2743 + Statics.field183.field773[0]) + class2.field29;
                        for (int var285 = 0; var285 < field305 && var285 < 50; var285++) {
                            var284 = var284 + field448.field1849[var285] + class2.field29;
                        }
                        class135.method457(var284, var395);
                        method2779();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field269 != 30) {
            return;
        }
        while (class189.method507()) {
            field402.method2361(12);
            field402.method2102(0);
            int var286 = field402.field1844;
            class189.method547(field402);
            field402.method2301(field402.field1844 - var286);
        }
        Object var287 = Statics.field204.field191;
        synchronized (Statics.field204.field191) {
            if (!field510) {
                Statics.field204.field185 = 0;
            } else if (class127.field2002 != 0 || Statics.field204.field185 >= 40) {
                field402.method2361(136);
                field402.method2102(0);
                int var288 = field402.field1844;
                int var289 = 0;
                for (int var290 = 0; var290 < Statics.field204.field185 && field402.field1844 - var288 < 240; var290++) {
                    var289++;
                    int var291 = Statics.field204.field188[var290];
                    if (var291 < 0) {
                        var291 = 0;
                    } else if (var291 > 502) {
                        var291 = 502;
                    }
                    int var292 = Statics.field204.field192[var290];
                    if (var292 < 0) {
                        var292 = 0;
                    } else if (var292 > 764) {
                        var292 = 764;
                    }
                    int var293 = var291 * 765 + var292;
                    if (Statics.field204.field188[var290] == -1 && Statics.field204.field192[var290] == -1) {
                        var292 = -1;
                        var291 = -1;
                        var293 = 524287;
                    }
                    if (field325 != var292 || field274 != var291) {
                        int var294 = var292 - field325;
                        field325 = var292;
                        int var295 = var291 - field274;
                        field274 = var291;
                        if (field275 < 8 && var294 >= -32 && var294 <= 31 && var295 >= -32 && var295 <= 31) {
                            var294 += 32;
                            var295 += 32;
                            field402.method2223((field275 << 12) + (var294 << 6) + var295);
                            field275 = 0;
                        } else if (field275 < 8) {
                            field402.method2217((field275 << 19) + 8388608 + var293);
                            field275 = 0;
                        } else {
                            field402.method2137((field275 << 19) + -1073741824 + var293);
                            field275 = 0;
                        }
                    } else if (field275 < 2047) {
                        field275++;
                    }
                }
                field402.method2301(field402.field1844 - var288);
                if (var289 >= Statics.field204.field185) {
                    Statics.field204.field185 = 0;
                } else {
                    Statics.field204.field185 -= var289;
                    for (int var296 = 0; var296 < Statics.field204.field185; var296++) {
                        Statics.field204.field192[var296] = Statics.field204.field192[var289 + var296];
                        Statics.field204.field188[var296] = Statics.field204.field188[var289 + var296];
                    }
                }
            }
        }
        if (class127.field2002 == 1 || !Statics.field1982 && class127.field2002 == 4 || class127.field2002 == 2) {
            long var298 = (class127.field1996 - field508 * -1L) / 50L;
            if (var298 > 4095L) {
                var298 = 4095L;
            }
            field508 = class127.field1996 * -1L;
            int var300 = class127.field2005;
            if (var300 < 0) {
                var300 = 0;
            } else if (var300 > 502) {
                var300 = 502;
            }
            int var301 = class127.field2003;
            if (var301 < 0) {
                var301 = 0;
            } else if (var301 > 764) {
                var301 = 764;
            }
            int var302 = var300 * 765 + var301;
            byte var303 = 0;
            if (class127.field2002 == 2) {
                var303 = 1;
            }
            int var304 = (int) var298;
            field402.method2361(231);
            field402.method2137((var303 << 19) + (var304 << 20) + var302);
        }
        if (class124.field1951 > 0) {
            field402.method2361(27);
            field402.method2223(0);
            int var305 = field402.field1844;
            long var306 = class103.method1957();
            for (int var308 = 0; var308 < class124.field1951; var308++) {
                long var309 = var306 - field383;
                if (var309 > 16777215L) {
                    var309 = 16777215L;
                }
                field383 = var306;
                field402.method2134((int) var309);
                field402.method2197(class124.field1964[var308]);
            }
            field402.method2252(field402.field1844 - var305);
        }
        if (field350 > 0) {
            field350--;
        }
        if (class124.field1958[96] || class124.field1958[97] || class124.field1958[98] || class124.field1958[99]) {
            field497 = true;
        }
        if (field497 && field350 <= 0) {
            field350 = 20;
            field497 = false;
            field402.method2361(76);
            field402.method2135(field345);
            field402.method2207(field344);
        }
        if (Statics.field26 && !field276) {
            field276 = true;
            field402.method2361(217);
            field402.method2102(1);
        }
        if (!Statics.field26 && field276) {
            field276 = false;
            field402.method2361(217);
            field402.method2102(0);
        }
        method160();
        if (field269 != 30) {
            return;
        }
        method139();
        int var10002;
        for (int var311 = 0; var311 < field513; var311++) {
            var10002 = field501[var311]--;
            if (field501[var311] >= -10) {
                class52 var313 = field503[var311];
                if (var313 == null) {
                    class52 var396 = (class52) null;
                    var313 = class52.method1030(Statics.field1455, field499[var311], 0);
                    if (var313 == null) {
                        continue;
                    }
                    field501[var311] += var313.method1018();
                    field503[var311] = var313;
                }
                if (field501[var311] < 0) {
                    int var320;
                    if (field502[var311] == 0) {
                        var320 = field496;
                    } else {
                        int var314 = (field502[var311] & 0xFF) * 128;
                        int var315 = field502[var311] >> 16 & 0xFF;
                        int var316 = var315 * 128 + 64 - Statics.field183.field775;
                        if (var316 < 0) {
                            var316 = -var316;
                        }
                        int var317 = field502[var311] >> 8 & 0xFF;
                        int var318 = var317 * 128 + 64 - Statics.field183.field720;
                        if (var318 < 0) {
                            var318 = -var318;
                        }
                        int var319 = var316 + var318 - 128;
                        if (var319 > var314) {
                            field501[var311] = -100;
                            continue;
                        }
                        if (var319 < 0) {
                            var319 = 0;
                        }
                        var320 = field381 * (var314 - var319) / var314;
                    }
                    if (var320 > 0) {
                        class56 var321 = var313.method1017().method1064(Statics.field1989);
                        class58 var322 = class58.method1090(var321, 100, var320);
                        var322.method1093(field500[var311] - 1);
                        Statics.field206.method947(var322);
                    }
                    field501[var311] = -100;
                }
            } else {
                field513--;
                for (int var312 = var311; var312 < field513; var312++) {
                    field499[var312] = field499[var312 + 1];
                    field503[var312] = field503[var312 + 1];
                    field500[var312] = field500[var312 + 1];
                    field501[var312] = field501[var312 + 1];
                    field502[var312] = field502[var312 + 1];
                }
                var311--;
            }
        }
        if (field495 && !class161.method2454()) {
            if (field493 != 0 && field355 != -1) {
                class161.method515(Statics.field532, field355, 0, field493, false);
            }
            field495 = false;
        }
        field311++;
        if (field311 <= 750) {
            for (int var323 = -1; var323 < field483; var323++) {
                int var324;
                if (var323 == -1) {
                    var324 = 2047;
                } else {
                    var324 = field382[var323];
                }
                class3 var325 = field380[var324];
                if (var325 != null) {
                    method563(var325, 1);
                }
            }
            method2414();
            method2060();
            field266++;
            if (field370 != 0) {
                field307 += 20;
                if (field307 >= 400) {
                    field370 = 0;
                }
            }
            if (Statics.field988 != null) {
                field371++;
                if (field371 >= 15) {
                    method2064(Statics.field988);
                    Statics.field988 = null;
                }
            }
            class152 var326 = Statics.field535;
            class152 var327 = Statics.field520;
            Statics.field535 = null;
            Statics.field520 = null;
            field379 = null;
            field505 = false;
            field404 = false;
            field479 = 0;
            while (class124.method2507() && field479 < 128) {
                if (field429 >= 2 && class124.field1958[82] && Statics.field1894 == 66) {
                    String var328 = class10.method508();
                    Statics.field523.setContents(new StringSelection(var328), (ClipboardOwner) null);
                } else {
                    field481[field479] = Statics.field1894;
                    field304[field479] = Statics.field577;
                    field479++;
                }
            }
            method509(field422, 0, 0, 765, 503, 0, 0);
            field446++;
            while (true) {
                class1 var329;
                class152 var330;
                class152 var331;
                do {
                    var329 = (class1) field461.method3187();
                    if (var329 == null) {
                        while (true) {
                            class1 var332;
                            class152 var333;
                            class152 var334;
                            do {
                                var332 = (class1) field273.method3187();
                                if (var332 == null) {
                                    while (true) {
                                        class1 var335;
                                        class152 var336;
                                        class152 var337;
                                        do {
                                            var335 = (class1) field460.method3187();
                                            if (var335 == null) {
                                                method1000();
                                                if (field434 != null) {
                                                    method2064(field434);
                                                    Statics.field180++;
                                                    if (field505 && field404) {
                                                        int var338 = class127.field2007;
                                                        int var339 = class127.field1997;
                                                        int var340 = var338 - field324;
                                                        int var341 = var339 - field437;
                                                        if (var340 < field440) {
                                                            var340 = field440;
                                                        }
                                                        if (field434.field2530 + var340 > field440 + field435.field2530) {
                                                            var340 = field440 + field435.field2530 - field434.field2530;
                                                        }
                                                        if (var341 < field439) {
                                                            var341 = field439;
                                                        }
                                                        if (field434.field2531 + var341 > field439 + field435.field2531) {
                                                            var341 = field439 + field435.field2531 - field434.field2531;
                                                        }
                                                        int var342 = var340 - field348;
                                                        int var343 = var341 - field415;
                                                        int var344 = field434.field2584;
                                                        if (Statics.field180 > field434.field2585 && (var342 > var344 || var342 < -var344 || var343 > var344 || var343 < -var344)) {
                                                            field445 = true;
                                                        }
                                                        int var345 = field435.field2534 + (var340 - field440);
                                                        int var346 = field435.field2535 + (var341 - field439);
                                                        if (field434.field2519 != null && field445) {
                                                            class1 var347 = new class1();
                                                            var347.field3 = field434;
                                                            var347.field6 = var345;
                                                            var347.field5 = var346;
                                                            var347.field12 = field434.field2519;
                                                            class32.method884(var347);
                                                        }
                                                        if (class127.field1995 == 0) {
                                                            if (field445) {
                                                                if (field434.field2598 != null) {
                                                                    class1 var348 = new class1();
                                                                    var348.field3 = field434;
                                                                    var348.field6 = var345;
                                                                    var348.field5 = var346;
                                                                    var348.field10 = field379;
                                                                    var348.field12 = field434.field2598;
                                                                    class32.method884(var348);
                                                                }
                                                                if (field379 != null && method1871(field434) != null) {
                                                                    field402.method2361(86);
                                                                    field402.method2137(field434.field2626);
                                                                    field402.method2189(field379.field2626);
                                                                    field402.method2135(field434.field2625);
                                                                    field402.method2153(field379.field2625);
                                                                    field402.method2153(field379.field2522);
                                                                    field402.method2135(field434.field2522);
                                                                }
                                                            } else {
                                                                label2769: {
                                                                    label1831: {
                                                                        if (field443 != 1) {
                                                                            int var349 = field480 - 1;
                                                                            boolean var350;
                                                                            if (var349 < 0) {
                                                                                var350 = false;
                                                                            } else {
                                                                                int var351 = field441[var349];
                                                                                if (var351 >= 2000) {
                                                                                    var351 -= 2000;
                                                                                }
                                                                                if (var351 == 1007) {
                                                                                    var350 = true;
                                                                                } else {
                                                                                    var350 = false;
                                                                                }
                                                                            }
                                                                            if (!var350) {
                                                                                break label1831;
                                                                            }
                                                                        }
                                                                        if (field480 > 2) {
                                                                            method2419(field348 + field324, field437 + field415);
                                                                            break label2769;
                                                                        }
                                                                    }
                                                                    if (field480 > 0) {
                                                                        method787(field348 + field324, field437 + field415);
                                                                    }
                                                                }
                                                            }
                                                            field434 = null;
                                                        }
                                                    } else if (Statics.field180 > 1) {
                                                        field434 = null;
                                                    }
                                                }
                                                if (Statics.field1257 != null) {
                                                    method2064(Statics.field1257);
                                                    field378++;
                                                    if (class127.field1995 == 0) {
                                                        if (!field377) {
                                                            label2772: {
                                                                label1817: {
                                                                    if (field443 != 1) {
                                                                        int var360 = field480 - 1;
                                                                        boolean var361;
                                                                        if (var360 < 0) {
                                                                            var361 = false;
                                                                        } else {
                                                                            int var362 = field441[var360];
                                                                            if (var362 >= 2000) {
                                                                                var362 -= 2000;
                                                                            }
                                                                            if (var362 == 1007) {
                                                                                var361 = true;
                                                                            } else {
                                                                                var361 = false;
                                                                            }
                                                                        }
                                                                        if (!var361) {
                                                                            break label1817;
                                                                        }
                                                                    }
                                                                    if (field480 > 2) {
                                                                        method2419(field412, field375);
                                                                        break label2772;
                                                                    }
                                                                }
                                                                if (field480 > 0) {
                                                                    method787(field412, field375);
                                                                }
                                                            }
                                                        } else if (Statics.field2663 == Statics.field1257 && field319 != field270) {
                                                            class152 var352 = Statics.field1257;
                                                            byte var353 = 0;
                                                            if (field425 == 1 && var352.field2525 == 206) {
                                                                var353 = 1;
                                                            }
                                                            if (var352.field2577[field270] <= 0) {
                                                                var353 = 0;
                                                            }
                                                            int var354 = Statics.method2421(var352);
                                                            boolean var355 = (var354 >> 29 & 0x1) != 0;
                                                            if (var355) {
                                                                int var356 = field319;
                                                                int var357 = field270;
                                                                var352.field2577[var357] = var352.field2577[var356];
                                                                var352.field2551[var357] = var352.field2551[var356];
                                                                var352.field2577[var356] = -1;
                                                                var352.field2551[var356] = 0;
                                                            } else if (var353 == 1) {
                                                                int var358 = field319;
                                                                int var359 = field270;
                                                                while (var358 != var359) {
                                                                    if (var358 > var359) {
                                                                        var352.method2828(var358 - 1, var358);
                                                                        var358--;
                                                                    } else if (var358 < var359) {
                                                                        var352.method2828(var358 + 1, var358);
                                                                        var358++;
                                                                    }
                                                                }
                                                            } else {
                                                                var352.method2828(field270, field319);
                                                            }
                                                            field402.method2361(63);
                                                            field402.method2207(field319);
                                                            field402.method2197(var353);
                                                            field402.method2154(Statics.field1257.field2626);
                                                            field402.method2153(field270);
                                                        }
                                                        field371 = 10;
                                                        class127.field2002 = 0;
                                                        Statics.field1257 = null;
                                                    } else if (field378 >= 5 && (class127.field2007 > field412 + 5 || class127.field2007 < field412 - 5 || class127.field1997 > field375 + 5 || class127.field1997 < field375 - 5)) {
                                                        field377 = true;
                                                    }
                                                }
                                                if (class79.field1387 != -1) {
                                                    int var363 = class79.field1387;
                                                    int var364 = class79.field1390;
                                                    field402.method2361(132);
                                                    field402.method2102(5);
                                                    field402.method2223(Statics.field2743 + var364);
                                                    field402.method2135(Statics.field314 + var363);
                                                    field402.method2113(class124.field1958[82] ? (class124.field1958[81] ? 2 : 1) : 0);
                                                    class79.field1387 = -1;
                                                    field367 = class127.field2003;
                                                    field368 = class127.field2005;
                                                    field370 = 1;
                                                    field307 = 0;
                                                    field490 = var363;
                                                    field491 = var364;
                                                }
                                                if (Statics.field535 != var326) {
                                                    if (var326 != null) {
                                                        method2064(var326);
                                                    }
                                                    if (Statics.field535 != null) {
                                                        method2064(Statics.field535);
                                                    }
                                                }
                                                if (Statics.field520 != var327 && field414 == field413) {
                                                    if (var327 != null) {
                                                        method2064(var327);
                                                    }
                                                    if (Statics.field520 != null) {
                                                        method2064(Statics.field520);
                                                    }
                                                }
                                                if (Statics.field520 == null) {
                                                    if (field413 > 0) {
                                                        field413--;
                                                    }
                                                } else if (field413 < field414) {
                                                    field413++;
                                                    if (field414 == field413) {
                                                        method2064(Statics.field520);
                                                    }
                                                }
                                                int var365 = field426 + Statics.field183.field775;
                                                int var366 = field327 + Statics.field183.field720;
                                                if (Statics.field892 - var365 < -500 || Statics.field892 - var365 > 500 || Statics.field70 - var366 < -500 || Statics.field70 - var366 > 500) {
                                                    Statics.field892 = var365;
                                                    Statics.field70 = var366;
                                                }
                                                if (Statics.field892 != var365) {
                                                    Statics.field892 += (var365 - Statics.field892) / 16;
                                                }
                                                if (Statics.field70 != var366) {
                                                    Statics.field70 += (var366 - Statics.field70) / 16;
                                                }
                                                if (class127.field1995 == 4 && Statics.field1982) {
                                                    int var367 = class127.field1997 - field432;
                                                    field364 = var367 * 2;
                                                    field432 = var367 == -1 || var367 == 1 ? class127.field1997 : (field432 + class127.field1997) / 2;
                                                    int var368 = field268 - class127.field2007;
                                                    field322 = var368 * 2;
                                                    field268 = var368 == -1 || var368 == 1 ? class127.field2007 : (field268 + class127.field2007) / 2;
                                                } else {
                                                    if (class124.field1958[96]) {
                                                        field322 += (-24 - field322) / 2;
                                                    } else if (class124.field1958[97]) {
                                                        field322 += (24 - field322) / 2;
                                                    } else {
                                                        field322 /= 2;
                                                    }
                                                    if (class124.field1958[98]) {
                                                        field364 += (12 - field364) / 2;
                                                    } else if (class124.field1958[99]) {
                                                        field364 += (-12 - field364) / 2;
                                                    } else {
                                                        field364 /= 2;
                                                    }
                                                    field432 = class127.field1997;
                                                    field268 = class127.field2007;
                                                }
                                                field345 = field322 / 2 + field345 & 0x7FF;
                                                field344 += field364 / 2;
                                                if (field344 < 128) {
                                                    field344 = 128;
                                                }
                                                if (field344 > 383) {
                                                    field344 = 383;
                                                }
                                                int var369 = Statics.field892 >> 7;
                                                int var370 = Statics.field70 >> 7;
                                                int var371 = method548(Statics.field892, Statics.field70, Statics.field2401);
                                                int var372 = 0;
                                                if (var369 > 3 && var370 > 3 && var369 < 100 && var370 < 100) {
                                                    for (int var373 = var369 - 4; var373 <= var369 + 4; var373++) {
                                                        for (int var374 = var370 - 4; var374 <= var370 + 4; var374++) {
                                                            int var375 = Statics.field2401;
                                                            if (var375 < 3 && (class6.field100[1][var373][var374] & 0x2) == 2) {
                                                                var375++;
                                                            }
                                                            int var376 = var371 - class6.field83[var375][var373][var374];
                                                            if (var376 > var372) {
                                                                var372 = var376;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var377 = var372 * 192;
                                                if (var377 > 98048) {
                                                    var377 = 98048;
                                                }
                                                if (var377 < 32768) {
                                                    var377 = 32768;
                                                }
                                                if (var377 > field352) {
                                                    field352 += (var377 - field352) / 24;
                                                } else if (var377 < field352) {
                                                    field352 += (var377 - field352) / 80;
                                                }
                                                if (field504) {
                                                    method2926();
                                                }
                                                for (int var378 = 0; var378 < 5; var378++) {
                                                    var10002 = field509[var378]++;
                                                }
                                                int var379 = ++class127.field1991 - 1;
                                                int var381 = class124.field1969;
                                                if (var379 > 15000 && var381 > 15000) {
                                                    field309 = 250;
                                                    class127.method30(14500);
                                                    field402.method2361(255);
                                                }
                                                field301++;
                                                if (field301 > 500) {
                                                    field301 = 0;
                                                    int var383 = (int) (Math.random() * 8.0D);
                                                    if ((var383 & 0x1) == 1) {
                                                        field426 += field374;
                                                    }
                                                    if ((var383 & 0x2) == 2) {
                                                        field327 += field328;
                                                    }
                                                    if ((var383 & 0x4) == 4) {
                                                        field365 += field330;
                                                    }
                                                }
                                                if (field426 < -50) {
                                                    field374 = 2;
                                                }
                                                if (field426 > 50) {
                                                    field374 = -2;
                                                }
                                                if (field327 < -55) {
                                                    field328 = 2;
                                                }
                                                if (field327 > 55) {
                                                    field328 = -2;
                                                }
                                                if (field365 < -40) {
                                                    field330 = 1;
                                                }
                                                if (field365 > 40) {
                                                    field330 = -1;
                                                }
                                                field336++;
                                                if (field336 > 500) {
                                                    field336 = 0;
                                                    int var384 = (int) (Math.random() * 8.0D);
                                                    if ((var384 & 0x1) == 1) {
                                                        field332 += field333;
                                                    }
                                                    if ((var384 & 0x2) == 2) {
                                                        field334 += field384;
                                                    }
                                                }
                                                if (field332 < -60) {
                                                    field333 = 2;
                                                }
                                                if (field332 > 60) {
                                                    field333 = -2;
                                                }
                                                if (field334 < -20) {
                                                    field384 = 1;
                                                }
                                                if (field334 > 10) {
                                                    field384 = -1;
                                                }
                                                for (class34 var385 = (class34) field346.method3149(); var385 != null; var385 = (class34) field346.method3151()) {
                                                    if ((long) var385.field779 < class103.method1957() / 1000L - 5L) {
                                                        if (var385.field786 > 0) {
                                                            class10.method2658(5, "", var385.field781 + class142.field2281);
                                                        }
                                                        if (var385.field786 == 0) {
                                                            class10.method2658(5, "", var385.field781 + class142.field2236);
                                                        }
                                                        var385.method3270();
                                                    }
                                                }
                                                field308++;
                                                if (field308 > 50) {
                                                    field402.method2361(244);
                                                }
                                                try {
                                                    if (Statics.field156 != null && field402.field1844 > 0) {
                                                        Statics.field156.method2556(field402.field1849, 0, field402.field1844);
                                                        field402.field1844 = 0;
                                                        field308 = 0;
                                                    }
                                                } catch (IOException var387) {
                                                    if (field309 > 0) {
                                                        method2779();
                                                    } else {
                                                        method592(40);
                                                        Statics.field195 = Statics.field156;
                                                        Statics.field156 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var336 = var335.field3;
                                            if (var336.field2522 < 0) {
                                                break;
                                            }
                                            var337 = class152.method557(var336.field2532);
                                        } while (var337 == null || var337.field2547 == null || var336.field2522 >= var337.field2547.length || var337.field2547[var336.field2522] != var336);
                                        class32.method884(var335);
                                    }
                                }
                                var333 = var332.field3;
                                if (var333.field2522 < 0) {
                                    break;
                                }
                                var334 = class152.method557(var333.field2532);
                            } while (var334 == null || var334.field2547 == null || var333.field2522 >= var334.field2547.length || var334.field2547[var333.field2522] != var333);
                            class32.method884(var332);
                        }
                    }
                    var330 = var329.field3;
                    if (var330.field2522 < 0) {
                        break;
                    }
                    var331 = class152.method557(var330.field2532);
                } while (var331 == null || var331.field2547 == null || var330.field2522 >= var331.field2547.length || var331.field2547[var330.field2522] != var330);
                class32.method884(var329);
            }
        } else if (field309 > 0) {
            method2779();
        } else {
            method592(40);
            Statics.field195 = Statics.field156;
            Statics.field156 = null;
        }
    }

    @ObfuscatedName("cf.k(B)V")
    public static final void method1775() {
        if (Statics.field1569 != null) {
            Statics.field1569.method997();
        }
        if (Statics.field618 != null) {
            Statics.field618.method997();
        }
    }

    @ObfuscatedName("dg.n(Laq;IIIB)V")
    public static void method2394(class38 arg0, int arg1, int arg2, int arg3) {
        if (field513 >= 50 || field381 == 0 || arg0.field906 == null || arg1 >= arg0.field906.length) {
            return;
        }
        int var4 = arg0.field906[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field499[field513] = var5;
        field500[field513] = var6;
        field501[field513] = 0;
        field503[field513] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field502[field513] = (var8 << 16) + (var9 << 8) + var7;
        field513++;
    }

    @ObfuscatedName("dj.z(IB)V")
    public static void method2550(int arg0) {
        if (arg0 == -1 && !field495) {
            Statics.field2709.method3008();
            class161.field2706 = 1;
            Statics.field785 = null;
        } else if (arg0 != -1 && field355 != arg0 && field493 != 0 && !field495) {
            class147 var1 = Statics.field532;
            int var2 = field493;
            class161.field2706 = 1;
            Statics.field785 = var1;
            Statics.field153 = arg0;
            Statics.field2711 = 0;
            Statics.field601 = var2;
            Statics.field1273 = false;
            Statics.field2102 = 2;
        }
        field355 = arg0;
    }

    @ObfuscatedName("fu.av(IIB)V")
    public static void method3116(int arg0, int arg1) {
        if (field493 != 0 && arg0 != -1) {
            class161.method515(Statics.field548, arg0, 0, field493, false);
            field495 = true;
        }
    }

    @ObfuscatedName("j.ao(B)V")
    public static final void method160() {
        if (field433 && Statics.field2401 != field315) {
            method573(Statics.field614, Statics.field584, Statics.field2401, Statics.field183.field772[0], Statics.field183.field773[0]);
        } else if (Statics.field2401 != field498) {
            field498 = Statics.field2401;
            method1406(Statics.field2401);
        }
    }

    @ObfuscatedName("p.am(III)V")
    public static final void method137(int arg0, int arg1) {
        if (field492 != 0 && field492 != 3 || class127.field2002 != 1 && Statics.field1982 || class127.field2002 != 4) {
            return;
        }
        int var2 = class127.field2003 - 25 - arg0;
        int var3 = class127.field2005 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field345 + field332 & 0x7FF;
        int var5 = class84.field1480[var4];
        int var6 = class84.field1464[var4];
        int var7 = (field334 + 256) * var5 >> 8;
        int var8 = (field334 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field183.field775 + var9 >> 7;
        int var12 = Statics.field183.field720 - var10 >> 7;
        field402.method2361(102);
        field402.method2102(18);
        field402.method2223(Statics.field2743 + var12);
        field402.method2135(Statics.field314 + var11);
        field402.method2113(class124.field1958[82] ? (class124.field1958[81] ? 2 : 1) : 0);
        field402.method2102(var2);
        field402.method2102(var3);
        field402.method2223(field345);
        field402.method2102(57);
        field402.method2102(field332);
        field402.method2102(field334);
        field402.method2102(89);
        field402.method2223(Statics.field183.field775);
        field402.method2223(Statics.field183.field720);
        field402.method2102(63);
        field490 = var11;
        field491 = var12;
    }

    @ObfuscatedName("cl.ac(S)V")
    public static final void method2060() {
        for (int var0 = -1; var0 < field483; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field382[var0];
            }
            class3 var2 = field380[var1];
            if (var2 != null && var2.field734 > 0) {
                var2.field734--;
                if (var2.field734 == 0) {
                    var2.field732 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field351; var3++) {
            int var4 = field300[var3];
            class30 var5 = field298[var4];
            if (var5 != null && var5.field734 > 0) {
                var5.field734--;
                if (var5.field734 == 0) {
                    var5.field732 = null;
                }
            }
        }
    }

    @ObfuscatedName("fe.ak(B)V")
    public static final void method2926() {
        int var0 = Statics.field226 * 128 + 64;
        int var1 = Statics.field1267 * 128 + 64;
        int var2 = method548(var0, var1, Statics.field2401) - Statics.field150;
        if (Statics.field1818 < var0) {
            Statics.field1818 += Statics.field1112 * (var0 - Statics.field1818) / 1000 + Statics.field73;
            if (Statics.field1818 > var0) {
                Statics.field1818 = var0;
            }
        }
        if (Statics.field1818 > var0) {
            Statics.field1818 -= Statics.field1112 * (Statics.field1818 - var0) / 1000 + Statics.field73;
            if (Statics.field1818 < var0) {
                Statics.field1818 = var0;
            }
        }
        if (Statics.field158 < var2) {
            Statics.field158 += Statics.field1112 * (var2 - Statics.field158) / 1000 + Statics.field73;
            if (Statics.field158 > var2) {
                Statics.field158 = var2;
            }
        }
        if (Statics.field158 > var2) {
            Statics.field158 -= Statics.field1112 * (Statics.field158 - var2) / 1000 + Statics.field73;
            if (Statics.field158 < var2) {
                Statics.field158 = var2;
            }
        }
        if (Statics.field53 < var1) {
            Statics.field53 += Statics.field1112 * (var1 - Statics.field53) / 1000 + Statics.field73;
            if (Statics.field53 > var1) {
                Statics.field53 = var1;
            }
        }
        if (Statics.field53 > var1) {
            Statics.field53 -= Statics.field1112 * (Statics.field53 - var1) / 1000 + Statics.field73;
            if (Statics.field53 < var1) {
                Statics.field53 = var1;
            }
        }
        int var3 = Statics.field142 * 128 + 64;
        int var4 = Statics.field130 * 128 + 64;
        int var5 = method548(var3, var4, Statics.field2401) - Statics.field1423;
        int var6 = var3 - Statics.field1818;
        int var7 = var5 - Statics.field158;
        int var8 = var4 - Statics.field53;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1890 < var10) {
            Statics.field1890 += Statics.field92 * (var10 - Statics.field1890) / 1000 + Statics.field2474;
            if (Statics.field1890 > var10) {
                Statics.field1890 = var10;
            }
        }
        if (Statics.field1890 > var10) {
            Statics.field1890 -= Statics.field92 * (Statics.field1890 - var10) / 1000 + Statics.field2474;
            if (Statics.field1890 < var10) {
                Statics.field1890 = var10;
            }
        }
        int var12 = var11 - Statics.field82;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field82 += Statics.field92 * var12 / 1000 + Statics.field2474;
            Statics.field82 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field82 -= Statics.field92 * -var12 / 1000 + Statics.field2474;
            Statics.field82 &= 0x7FF;
        }
        int var13 = var11 - Statics.field82;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field82 = var11;
        }
    }

    @ObfuscatedName("dh.ag(I)V")
    public static final void method2414() {
        for (int var0 = 0; var0 < field351; var0++) {
            int var1 = field300[var0];
            class30 var2 = field298[var1];
            if (var2 != null) {
                method563(var2, var2.field695.field794);
            }
        }
    }

    @ObfuscatedName("ak.ap(Lap;IS)V")
    public static final void method563(class33 arg0, int arg1) {
        if (arg0.field724 > field442) {
            int var2 = arg0.field724 - field442;
            int var3 = arg0.field759 * 128 + arg0.field723 * 64;
            int var4 = arg0.field761 * 128 + arg0.field723 * 64;
            arg0.field775 += (var3 - arg0.field775) / var2;
            arg0.field720 += (var4 - arg0.field720) / var2;
            arg0.field771 = 0;
            if (arg0.field770 == 0) {
                arg0.field721 = 1024;
            }
            if (arg0.field770 == 1) {
                arg0.field721 = 1536;
            }
            if (arg0.field770 == 2) {
                arg0.field721 = 0;
            }
            if (arg0.field770 == 3) {
                arg0.field721 = 512;
            }
        } else if (arg0.field730 >= field442) {
            if (field442 == arg0.field730 || arg0.field749 == -1 || arg0.field752 != 0 || arg0.field751 + 1 > class38.method730(arg0.field749).field899[arg0.field756]) {
                int var5 = arg0.field730 - arg0.field724;
                int var6 = field442 - arg0.field724;
                int var7 = arg0.field759 * 128 + arg0.field723 * 64;
                int var8 = arg0.field761 * 128 + arg0.field723 * 64;
                int var9 = arg0.field738 * 128 + arg0.field723 * 64;
                int var10 = arg0.field765 * 128 + arg0.field723 * 64;
                arg0.field775 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field720 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field771 = 0;
            if (arg0.field770 == 0) {
                arg0.field721 = 1024;
            }
            if (arg0.field770 == 1) {
                arg0.field721 = 1536;
            }
            if (arg0.field770 == 2) {
                arg0.field721 = 0;
            }
            if (arg0.field770 == 3) {
                arg0.field721 = 512;
            }
            arg0.field763 = arg0.field721;
        } else {
            arg0.field746 = arg0.field750;
            if (arg0.field764 == 0) {
                arg0.field771 = 0;
            } else {
                label359: {
                    if (arg0.field749 != -1 && arg0.field752 == 0) {
                        class38 var11 = class38.method730(arg0.field749);
                        if (arg0.field776 > 0 && var11.field913 == 0) {
                            arg0.field771++;
                            break label359;
                        }
                        if (arg0.field776 <= 0 && var11.field909 == 0) {
                            arg0.field771++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field775;
                    int var13 = arg0.field720;
                    int var14 = arg0.field772[arg0.field764 - 1] * 128 + arg0.field723 * 64;
                    int var15 = arg0.field773[arg0.field764 - 1] * 128 + arg0.field723 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field721 = 1280;
                            } else if (var13 > var15) {
                                arg0.field721 = 1792;
                            } else {
                                arg0.field721 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field721 = 768;
                            } else if (var13 > var15) {
                                arg0.field721 = 256;
                            } else {
                                arg0.field721 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field721 = 1024;
                        } else if (var13 > var15) {
                            arg0.field721 = 0;
                        }
                        int var16 = arg0.field721 - arg0.field763 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field755;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field742;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field728;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field729;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field742;
                        }
                        arg0.field746 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class30) {
                            var19 = ((class30) arg0).field695.field816;
                        }
                        if (var19) {
                            if (arg0.field763 != arg0.field721 && arg0.field743 == -1 && arg0.field768 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field764 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field764 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field771 > 0 && arg0.field764 > 1) {
                                var18 = 8;
                                arg0.field771--;
                            }
                        } else {
                            if (arg0.field764 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field764 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field771 > 0 && arg0.field764 > 1) {
                                var18 = 8;
                                arg0.field771--;
                            }
                        }
                        if (arg0.field774[arg0.field764 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field746 == arg0.field742 && arg0.field731 != -1) {
                            arg0.field746 = arg0.field731;
                        }
                        if (var12 < var14) {
                            arg0.field775 += var18;
                            if (arg0.field775 > var14) {
                                arg0.field775 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field775 -= var18;
                            if (arg0.field775 < var14) {
                                arg0.field775 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field720 += var18;
                            if (arg0.field720 > var15) {
                                arg0.field720 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field720 -= var18;
                            if (arg0.field720 < var15) {
                                arg0.field720 = var15;
                            }
                        }
                        if (arg0.field775 == var14 && arg0.field720 == var15) {
                            arg0.field764--;
                            if (arg0.field776 > 0) {
                                arg0.field776--;
                            }
                        }
                    } else {
                        arg0.field775 = var14;
                        arg0.field720 = var15;
                    }
                }
            }
        }
        if (arg0.field775 < 128 || arg0.field720 < 128 || arg0.field775 >= 13184 || arg0.field720 >= 13184) {
            arg0.field749 = -1;
            arg0.field754 = -1;
            arg0.field724 = 0;
            arg0.field730 = 0;
            arg0.field775 = arg0.field772[0] * 128 + arg0.field723 * 64;
            arg0.field720 = arg0.field773[0] * 128 + arg0.field723 * 64;
            arg0.method585();
        }
        if (Statics.field183 == arg0 && (arg0.field775 < 1536 || arg0.field720 < 1536 || arg0.field775 >= 11776 || arg0.field720 >= 11776)) {
            arg0.field749 = -1;
            arg0.field754 = -1;
            arg0.field724 = 0;
            arg0.field730 = 0;
            arg0.field775 = arg0.field772[0] * 128 + arg0.field723 * 64;
            arg0.field720 = arg0.field773[0] * 128 + arg0.field723 * 64;
            arg0.method585();
        }
        method159(arg0);
        arg0.field722 = false;
        if (arg0.field746 != -1) {
            class38 var20 = class38.method730(arg0.field746);
            if (var20 == null || var20.field897 == null) {
                arg0.field746 = -1;
            } else {
                arg0.field748++;
                if (arg0.field747 < var20.field897.length && arg0.field748 > var20.field899[arg0.field747]) {
                    arg0.field748 = 1;
                    arg0.field747++;
                    method2394(var20, arg0.field747, arg0.field775, arg0.field720);
                }
                if (arg0.field747 >= var20.field897.length) {
                    arg0.field748 = 0;
                    arg0.field747 = 0;
                    method2394(var20, arg0.field747, arg0.field775, arg0.field720);
                }
            }
        }
        if (arg0.field754 != -1 && field442 >= arg0.field757) {
            if (arg0.field762 < 0) {
                arg0.field762 = 0;
            }
            int var21 = Statics.method1958(arg0.field754).field925;
            if (var21 == -1) {
                arg0.field754 = -1;
            } else {
                class38 var22 = class38.method730(var21);
                if (var22 == null || var22.field897 == null) {
                    arg0.field754 = -1;
                } else {
                    arg0.field719++;
                    if (arg0.field762 < var22.field897.length && arg0.field719 > var22.field899[arg0.field762]) {
                        arg0.field719 = 1;
                        arg0.field762++;
                        method2394(var22, arg0.field762, arg0.field775, arg0.field720);
                    }
                    if (arg0.field762 >= var22.field897.length && (arg0.field762 < 0 || arg0.field762 >= var22.field897.length)) {
                        arg0.field754 = -1;
                    }
                }
            }
        }
        if (arg0.field749 != -1 && arg0.field752 <= 1) {
            class38 var23 = class38.method730(arg0.field749);
            if (var23.field913 == 1 && arg0.field776 > 0 && arg0.field724 <= field442 && arg0.field730 < field442) {
                arg0.field752 = 1;
                return;
            }
        }
        if (arg0.field749 != -1 && arg0.field752 == 0) {
            class38 var24 = class38.method730(arg0.field749);
            if (var24 == null || var24.field897 == null) {
                arg0.field749 = -1;
            } else {
                arg0.field751++;
                if (arg0.field756 < var24.field897.length && arg0.field751 > var24.field899[arg0.field756]) {
                    arg0.field751 = 1;
                    arg0.field756++;
                    method2394(var24, arg0.field756, arg0.field775, arg0.field720);
                }
                if (arg0.field756 >= var24.field897.length) {
                    arg0.field756 -= var24.field902;
                    arg0.field753++;
                    if (arg0.field753 >= var24.field907) {
                        arg0.field749 = -1;
                    } else if (arg0.field756 >= 0 && arg0.field756 < var24.field897.length) {
                        method2394(var24, arg0.field756, arg0.field775, arg0.field720);
                    } else {
                        arg0.field749 = -1;
                    }
                }
                arg0.field722 = var24.field903;
            }
        }
        if (arg0.field752 > 0) {
            arg0.field752--;
        }
    }

    @ObfuscatedName("j.ah(Lap;I)V")
    public static final void method159(class33 arg0) {
        if (arg0.field768 == 0) {
            return;
        }
        if (arg0.field743 != -1 && arg0.field743 < 32768) {
            class30 var1 = field298[arg0.field743];
            if (var1 != null) {
                int var2 = arg0.field775 - var1.field775;
                int var3 = arg0.field720 - var1.field720;
                if (var2 != 0 || var3 != 0) {
                    arg0.field721 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field743 >= 32768) {
            int var4 = arg0.field743 - 32768;
            if (field386 == var4) {
                var4 = 2047;
            }
            class3 var5 = field380[var4];
            if (var5 != null) {
                int var6 = arg0.field775 - var5.field775;
                int var7 = arg0.field720 - var5.field720;
                if (var6 != 0 || var7 != 0) {
                    arg0.field721 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field741 != 0 || arg0.field745 != 0) && (arg0.field764 == 0 || arg0.field771 > 0)) {
            int var8 = arg0.field775 - (arg0.field741 * 64 - Statics.field314 * 64 - Statics.field314 * 64);
            int var9 = arg0.field720 - (arg0.field745 * 64 - Statics.field2743 * 64 - Statics.field2743 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field721 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field741 = 0;
            arg0.field745 = 0;
        }
        int var10 = arg0.field721 - arg0.field763 & 0x7FF;
        if (var10 == 0) {
            arg0.field769 = 0;
            return;
        }
        arg0.field769++;
        if (var10 > 1024) {
            arg0.field763 -= arg0.field768;
            boolean var11 = true;
            if (var10 < arg0.field768 || var10 > 2048 - arg0.field768) {
                arg0.field763 = arg0.field721;
                var11 = false;
            }
            if (arg0.field750 == arg0.field746 && (arg0.field769 > 25 || var11)) {
                if (arg0.field725 == -1) {
                    arg0.field746 = arg0.field742;
                } else {
                    arg0.field746 = arg0.field725;
                }
            }
        } else {
            arg0.field763 += arg0.field768;
            boolean var12 = true;
            if (var10 < arg0.field768 || var10 > 2048 - arg0.field768) {
                arg0.field763 = arg0.field721;
                var12 = false;
            }
            if (arg0.field750 == arg0.field746 && (arg0.field769 > 25 || var12)) {
                if (arg0.field726 == -1) {
                    arg0.field746 = arg0.field742;
                } else {
                    arg0.field746 = arg0.field726;
                }
            }
        }
        arg0.field763 &= 0x7FF;
    }

    @ObfuscatedName("b.an(Li;III)V")
    public static void method71(class3 arg0, int arg1, int arg2) {
        if (arg0.field749 == arg1 && arg1 != -1) {
            int var3 = class38.method730(arg1).field910;
            if (var3 == 1) {
                arg0.field756 = 0;
                arg0.field751 = 0;
                arg0.field752 = arg2;
                arg0.field753 = 0;
            }
            if (var3 == 2) {
                arg0.field753 = 0;
            }
        } else if (arg1 == -1 || arg0.field749 == -1 || class38.method730(arg1).field912 >= class38.method730(arg0.field749).field912) {
            arg0.field749 = arg1;
            arg0.field756 = 0;
            arg0.field751 = 0;
            arg0.field752 = arg2;
            arg0.field753 = 0;
            arg0.field776 = arg0.field764;
        }
    }

    @ObfuscatedName("cu.ay(Ljava/lang/String;ZI)V")
    public static final void method1776(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field959.method3361(arg0, 250);
        int var6 = Statics.field959.method3306(arg0, 250) * 13;
        class73.method1515(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1517(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field959.method3311(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method545(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1869(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2040.getGraphics();
            Statics.field977.method1339(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2040.repaint();
        }
    }

    @ObfuscatedName("el.af(IIIII)V")
    public static final void method2664(int arg0, int arg1, int arg2, int arg3) {
        class73.method1535(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1826();
        field487++;
        method1962(class29.field683);
        boolean var4 = false;
        if (field394 >= 0) {
            for (int var5 = 0; var5 < field483; var5++) {
                if (field394 == field382[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1962(class29.field682);
        }
        method3117(true);
        method1962(var4 ? class29.field690 : class29.field687);
        method3117(false);
        method2672();
        method506();
        if (!field504) {
            int var6 = field344;
            if (field352 / 256 > var6) {
                var6 = field352 / 256;
            }
            if (field462[4] && field338[4] + 128 > var6) {
                var6 = field338[4] + 128;
            }
            int var7 = field365 + field345 & 0x7FF;
            method1854(Statics.field892, method548(Statics.field183.field775, Statics.field183.field720, Statics.field2401) - 50, Statics.field70, var6, var7, var6 * 3 + 600);
        }
        int var20;
        if (field504) {
            int var21;
            if (Statics.field75.field145) {
                var21 = Statics.field2401;
            } else {
                int var22 = method548(Statics.field1818, Statics.field53, Statics.field2401);
                if (var22 - Statics.field158 >= 800 || (class6.field100[Statics.field2401][Statics.field1818 >> 7][Statics.field53 >> 7] & 0x4) == 0) {
                    var21 = 3;
                } else {
                    var21 = Statics.field2401;
                }
            }
            var20 = var21;
        } else {
            int var8;
            if (Statics.field75.field145) {
                var8 = Statics.field2401;
            } else {
                int var9 = 3;
                if (Statics.field1890 < 310) {
                    int var10 = Statics.field1818 >> 7;
                    int var11 = Statics.field53 >> 7;
                    int var12 = Statics.field183.field775 >> 7;
                    int var13 = Statics.field183.field720 >> 7;
                    if ((class6.field100[Statics.field2401][var10][var11] & 0x4) != 0) {
                        var9 = Statics.field2401;
                    }
                    int var14;
                    if (var12 > var10) {
                        var14 = var12 - var10;
                    } else {
                        var14 = var10 - var12;
                    }
                    int var15;
                    if (var13 > var11) {
                        var15 = var13 - var11;
                    } else {
                        var15 = var11 - var13;
                    }
                    if (var14 > var15) {
                        int var16 = var15 * 65536 / var14;
                        int var17 = 32768;
                        while (var10 != var12) {
                            if (var10 < var12) {
                                var10++;
                            } else if (var10 > var12) {
                                var10--;
                            }
                            if ((class6.field100[Statics.field2401][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field2401;
                            }
                            var17 += var16;
                            if (var17 >= 65536) {
                                var17 -= 65536;
                                if (var11 < var13) {
                                    var11++;
                                } else if (var11 > var13) {
                                    var11--;
                                }
                                if ((class6.field100[Statics.field2401][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field2401;
                                }
                            }
                        }
                    } else {
                        int var18 = var14 * 65536 / var15;
                        int var19 = 32768;
                        while (var11 != var13) {
                            if (var11 < var13) {
                                var11++;
                            } else if (var11 > var13) {
                                var11--;
                            }
                            if ((class6.field100[Statics.field2401][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field2401;
                            }
                            var19 += var18;
                            if (var19 >= 65536) {
                                var19 -= 65536;
                                if (var10 < var12) {
                                    var10++;
                                } else if (var10 > var12) {
                                    var10--;
                                }
                                if ((class6.field100[Statics.field2401][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field2401;
                                }
                            }
                        }
                    }
                }
                if ((class6.field100[Statics.field2401][Statics.field183.field775 >> 7][Statics.field183.field720 >> 7] & 0x4) != 0) {
                    var9 = Statics.field2401;
                }
                var8 = var9;
            }
            var20 = var8;
        }
        int var23 = Statics.field1818;
        int var24 = Statics.field158;
        int var25 = Statics.field53;
        int var26 = Statics.field1890;
        int var27 = Statics.field82;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field462[var28]) {
                int var29 = (int) (Math.random() * (double) (field506[var28] * 2 + 1) - (double) field506[var28] + Math.sin((double) field369[var28] / 100.0D * (double) field509[var28]) * (double) field338[var28]);
                if (var28 == 0) {
                    Statics.field1818 += var29;
                }
                if (var28 == 1) {
                    Statics.field158 += var29;
                }
                if (var28 == 2) {
                    Statics.field53 += var29;
                }
                if (var28 == 3) {
                    Statics.field82 = Statics.field82 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field1890 += var29;
                    if (Statics.field1890 < 128) {
                        Statics.field1890 = 128;
                    }
                    if (Statics.field1890 > 383) {
                        Statics.field1890 = 383;
                    }
                }
            }
        }
        int var30 = class127.field2007;
        int var31 = class127.field1997;
        if (class127.field2002 != 0) {
            var30 = class127.field2003;
            var31 = class127.field2005;
        }
        if (var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            class98.field1746 = true;
            class98.field1692 = 0;
            class98.field1753 = var30 - arg0;
            class98.field1748 = var31 - arg1;
        } else {
            class98.field1746 = false;
            class98.field1692 = 0;
        }
        method1775();
        class73.method1515(arg0, arg1, arg2, arg3, 0);
        method1775();
        Statics.field66.method1646(Statics.field1818, Statics.field158, Statics.field53, Statics.field1890, Statics.field82, var20);
        method1775();
        Statics.field66.method1649();
        field356 = 0;
        boolean var32 = false;
        int var33 = -1;
        for (int var34 = -1; var34 < field483 + field351; var34++) {
            class33 var35;
            if (var34 == -1) {
                var35 = Statics.field183;
            } else if (var34 < field483) {
                var35 = field380[field382[var34]];
                if (field394 == field382[var34]) {
                    var32 = true;
                    var33 = var34;
                    continue;
                }
            } else {
                var35 = field298[field300[var34 - field483]];
            }
            method88(var35, var34, arg0, arg1, arg2, arg3);
        }
        if (var32) {
            method88(field380[field394], var33, arg0, arg1, arg2, arg3);
        }
        for (int var36 = 0; var36 < field356; var36++) {
            int var37 = field431[var36];
            int var38 = field293[var36];
            int var39 = field358[var36];
            int var40 = field357[var36];
            boolean var41 = true;
            while (var41) {
                var41 = false;
                for (int var42 = 0; var42 < var36; var42++) {
                    if (var38 + 2 > field293[var42] - field357[var42] && var38 - var40 < field293[var42] + 2 && var37 - var39 < field431[var42] + field358[var42] && var37 + var39 > field431[var42] - field358[var42] && field293[var42] - field357[var42] < var38) {
                        var38 = field293[var42] - field357[var42];
                        var41 = true;
                    }
                }
            }
            field285 = field431[var36];
            field366 = field293[var36] = var38;
            String var43 = field362[var36];
            if (field393 == 0) {
                int var44 = 16776960;
                if (field359[var36] < 6) {
                    var44 = field474[field359[var36]];
                }
                if (field359[var36] == 6) {
                    var44 = field487 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field359[var36] == 7) {
                    var44 = field487 % 20 < 10 ? 255 : 65535;
                }
                if (field359[var36] == 8) {
                    var44 = field487 % 20 < 10 ? 45056 : 8454016;
                }
                if (field359[var36] == 9) {
                    int var45 = 150 - field361[var36];
                    if (var45 < 50) {
                        var44 = var45 * 1280 + 16711680;
                    } else if (var45 < 100) {
                        var44 = 16776960 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var44 = (var45 - 100) * 5 + 65280;
                    }
                }
                if (field359[var36] == 10) {
                    int var46 = 150 - field361[var36];
                    if (var46 < 50) {
                        var44 = var46 * 5 + 16711680;
                    } else if (var46 < 100) {
                        var44 = 16711935 - (var46 - 50) * 327680;
                    } else if (var46 < 150) {
                        var44 = (var46 - 100) * 327680 + 255 - (var46 - 100) * 5;
                    }
                }
                if (field359[var36] == 11) {
                    int var47 = 150 - field361[var36];
                    if (var47 < 50) {
                        var44 = 16777215 - var47 * 327685;
                    } else if (var47 < 100) {
                        var44 = (var47 - 50) * 327685 + 65280;
                    } else if (var47 < 150) {
                        var44 = 16777215 - (var47 - 100) * 327680;
                    }
                }
                if (field360[var36] == 0) {
                    Statics.field1086.method3333(var43, field285 + arg0, field366 + arg1, var44, 0);
                }
                if (field360[var36] == 1) {
                    Statics.field1086.method3312(var43, field285 + arg0, field366 + arg1, var44, 0, field487);
                }
                if (field360[var36] == 2) {
                    Statics.field1086.method3313(var43, field285 + arg0, field366 + arg1, var44, 0, field487);
                }
                if (field360[var36] == 3) {
                    Statics.field1086.method3325(var43, field285 + arg0, field366 + arg1, var44, 0, field487, 150 - field361[var36]);
                }
                if (field360[var36] == 4) {
                    int var48 = (150 - field361[var36]) * (Statics.field1086.method3322(var43) + 100) / 150;
                    class73.method1568(field285 + arg0 - 50, arg1, field285 + arg0 + 50, arg1 + arg3);
                    Statics.field1086.method3308(var43, field285 + arg0 + 50 - var48, field366 + arg1, var44, 0);
                    class73.method1535(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field360[var36] == 5) {
                    int var49 = 150 - field361[var36];
                    int var50 = 0;
                    if (var49 < 25) {
                        var50 = var49 - 25;
                    } else if (var49 > 125) {
                        var50 = var49 - 125;
                    }
                    class73.method1568(arg0, field366 + arg1 - Statics.field1086.field2901 - 1, arg0 + arg2, field366 + arg1 + 5);
                    Statics.field1086.method3333(var43, field285 + arg0, field366 + arg1 + var50, var44, 0);
                    class73.method1535(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1086.method3333(var43, field285 + arg0, field366 + arg1, 16776960, 0);
            }
        }
        if (field279 == 2) {
            method519((field478 - Statics.field314 << 7) + field514, (field283 - Statics.field2743 << 7) + field286, field299 * 2);
            if (field285 > -1 && field442 % 20 < 10) {
                Statics.field987[0].method1429(field285 + arg0 - 12, field366 + arg1 - 28);
            }
        }
        ((class88) Statics.field1457).method1861(field266);
        if (field370 == 1) {
            Statics.field534[field307 / 100].method1429(field367 - 8, field368 - 8);
        }
        if (field370 == 2) {
            Statics.field534[field307 / 100 + 4].method1429(field367 - 8, field368 - 8);
        }
        field331 = 0;
        int var51 = (Statics.field183.field775 >> 7) + Statics.field314;
        int var52 = (Statics.field183.field720 >> 7) + Statics.field2743;
        if (var51 >= 3053 && var51 <= 3156 && var52 >= 3056 && var52 <= 3136) {
            field331 = 1;
        }
        if (var51 >= 3072 && var51 <= 3118 && var52 >= 9492 && var52 <= 9535) {
            field331 = 1;
        }
        if (field331 == 1 && var51 >= 3139 && var51 <= 3199 && var52 >= 3008 && var52 <= 3062) {
            field331 = 0;
        }
        if (field277) {
            int var53 = arg0 + 512 - 5;
            int var54 = arg1 + 20;
            Statics.field959.method3330("Fps:" + field2056, var53, var54, 16776960, -1);
            int var58 = var54 + 15;
            Runtime var55 = Runtime.getRuntime();
            int var56 = (int) ((var55.totalMemory() - var55.freeMemory()) / 1024L);
            int var57 = 16776960;
            if (var56 > 32768 && field433) {
                var57 = 16711680;
            }
            if (var56 > 65536 && !field433) {
                var57 = 16711680;
            }
            Statics.field959.method3330("Mem:" + var56 + "k", var53, var58, var57, -1);
            var54 = var58 + 15;
        }
        Statics.field1818 = var23;
        Statics.field158 = var24;
        Statics.field53 = var25;
        Statics.field1890 = var26;
        Statics.field82 = var27;
        if (field521 && class150.method2808(true, false) == 0) {
            field521 = false;
        }
        if (field521) {
            class73.method1515(arg0, arg1, arg2, arg3, 0);
            method1776(class142.field2143, false);
        }
    }

    @ObfuscatedName("cd.aq(Lam;B)V")
    public static final void method1962(class29 arg0) {
        if (Statics.field183.field775 >> 7 == field490 && Statics.field183.field720 >> 7 == field491) {
            field490 = 0;
        }
        int var1 = field483;
        if (class29.field683 == arg0 || class29.field682 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field683 == arg0) {
                var3 = Statics.field183;
                var4 = 33538048;
            } else if (class29.field682 == arg0) {
                var3 = field380[field394];
                var4 = field394 << 14;
            } else {
                var3 = field380[field382[var2]];
                var4 = field382[var2] << 14;
                if (class29.field690 == arg0 && field394 == field382[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18() && !var3.field52) {
                var3.field50 = false;
                if ((field433 && field483 > 50 || field483 > 200) && class29.field683 != arg0 && var3.field750 == var3.field746) {
                    var3.field50 = true;
                }
                int var5 = var3.field775 >> 7;
                int var6 = var3.field720 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field442 < var3.field40 || field442 >= var3.field33) {
                        if ((var3.field775 & 0x7F) == 64 && (var3.field720 & 0x7F) == 64) {
                            if (field487 == field363[var5][var6]) {
                                continue;
                            }
                            field363[var5][var6] = field487;
                        }
                        var3.field39 = method548(var3.field775, var3.field720, Statics.field2401);
                        Statics.field66.method1619(Statics.field2401, var3.field775, var3.field720, var3.field39, 60, var3, var3.field763, var4, var3.field722);
                    } else {
                        var3.field50 = false;
                        var3.field39 = method548(var3.field775, var3.field720, Statics.field2401);
                        Statics.field66.method1620(Statics.field2401, var3.field775, var3.field720, var3.field39, 60, var3, var3.field763, var4, var3.field46, var3.field47, var3.field48, var3.field57);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fu.aj(ZB)V")
    public static final void method3117(boolean arg0) {
        for (int var1 = 0; var1 < field351; var1++) {
            class30 var2 = field298[field300[var1]];
            int var3 = (field300[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field695.field813 == arg0 && var2.field695.method601()) {
                int var4 = var2.field775 >> 7;
                int var5 = var2.field720 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field723 == 1 && (var2.field775 & 0x7F) == 64 && (var2.field720 & 0x7F) == 64) {
                        if (field487 == field363[var4][var5]) {
                            continue;
                        }
                        field363[var4][var5] = field487;
                    }
                    if (!var2.field695.field795) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field66.method1619(Statics.field2401, var2.field775, var2.field720, method548(var2.field775 + (var2.field723 * 64 - 64), var2.field720 + (var2.field723 * 64 - 64), Statics.field2401), var2.field723 * 64 - 64 + 60, var2, var2.field763, var3, var2.field722);
                }
            }
        }
    }

    @ObfuscatedName("ep.at(I)V")
    public static final void method2672() {
        for (class7 var0 = (class7) field397.method3210(); var0 != null; var0 = (class7) field397.method3182()) {
            if (Statics.field2401 != var0.field106 || field442 > var0.field112) {
                var0.method3273();
            } else if (field442 >= var0.field111) {
                if (var0.field119 > 0) {
                    class30 var1 = field298[var0.field119 - 1];
                    if (var1 != null && var1.field775 >= 0 && var1.field775 < 13312 && var1.field720 >= 0 && var1.field720 < 13312) {
                        var0.method77(var1.field775, var1.field720, method548(var1.field775, var1.field720, var0.field106) - var0.field110, field442);
                    }
                }
                if (var0.field119 < 0) {
                    int var2 = -var0.field119 - 1;
                    class3 var3;
                    if (field386 == var2) {
                        var3 = Statics.field183;
                    } else {
                        var3 = field380[var2];
                    }
                    if (var3 != null && var3.field775 >= 0 && var3.field775 < 13312 && var3.field720 >= 0 && var3.field720 < 13312) {
                        var0.method77(var3.field775, var3.field720, method548(var3.field775, var3.field720, var0.field106) - var0.field110, field442);
                    }
                }
                var0.method76(field266);
                Statics.field66.method1619(Statics.field2401, (int) var0.field117, (int) var0.field118, (int) var0.field127, 60, var0, var0.field125, -1, false);
            }
        }
    }

    @ObfuscatedName("k.aw(I)V")
    public static final void method506() {
        for (class26 var0 = (class26) field398.method3210(); var0 != null; var0 = (class26) field398.method3182()) {
            if (Statics.field2401 != var0.field626 || var0.field630) {
                var0.method3273();
            } else if (field442 >= var0.field625) {
                var0.method514(field266);
                if (var0.field630) {
                    var0.method3273();
                } else {
                    Statics.field66.method1619(var0.field626, var0.field627, var0.field632, var0.field624, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("l.ar(Lap;IIIIII)V")
    public static final void method88(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field695;
            if (var6.field818 != null) {
                var6 = var6.method602();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field483) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field52) {
                return;
            }
            if (var8.field51 != -1 || var8.field36 != -1) {
                int var9 = arg0.field767 + 15;
                method519(arg0.field775, arg0.field720, var9);
                if (field285 > -1) {
                    if (var8.field51 != -1) {
                        Statics.field937[var8.field51].method1429(field285 + arg2 - 12, field366 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field36 != -1) {
                        Statics.field543[var8.field36].method1429(field285 + arg2 - 12, field366 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field279 == 10 && field515 == field382[arg1]) {
                int var10 = arg0.field767 + 15;
                method519(arg0.field775, arg0.field720, var10);
                if (field285 > -1) {
                    Statics.field987[1].method1429(field285 + arg2 - 12, field366 + arg3 - var7);
                }
            }
        } else {
            class35 var11 = ((class30) arg0).field695;
            if (var11.field818 != null) {
                var11 = var11.method602();
            }
            if (var11.field828 >= 0 && var11.field828 < Statics.field543.length) {
                int var12 = arg0.field767 + 15;
                method519(arg0.field775, arg0.field720, var12);
                if (field285 > -1) {
                    Statics.field543[var11.field828].method1429(field285 + arg2 - 12, field366 + arg3 - 30);
                }
            }
            if (field279 == 1 && field280 == field300[arg1 - field483] && field442 % 20 < 10) {
                int var13 = arg0.field767 + 15;
                method519(arg0.field775, arg0.field720, var13);
                if (field285 > -1) {
                    Statics.field987[0].method1429(field285 + arg2 - 12, field366 + arg3 - 28);
                }
            }
        }
        if (arg0.field732 != null && (arg1 >= field483 || field475 == 4 || !arg0.field733 && (field475 == 0 || field475 == 3 || field475 == 1 && method2690(((class3) arg0).field44, false)))) {
            int var14 = arg0.field767;
            method519(arg0.field775, arg0.field720, var14);
            if (field285 > -1 && field356 < field354) {
                field358[field356] = Statics.field1086.method3322(arg0.field732) / 2;
                field357[field356] = Statics.field1086.field2901;
                field431[field356] = field285;
                field293[field356] = field366;
                field359[field356] = arg0.field735;
                field360[field356] = arg0.field736;
                field361[field356] = arg0.field734;
                field362[field356] = arg0.field732;
                field356++;
            }
        }
        if (arg0.field740 > field442) {
            int var15 = arg0.field767 + 15;
            method519(arg0.field775, arg0.field720, var15);
            if (field285 > -1) {
                int var16;
                if (arg1 < field483) {
                    var16 = 30;
                } else {
                    class35 var17 = ((class30) arg0).field695;
                    var16 = var17.field826;
                }
                int var18 = arg0.field760 * var16 / arg0.field744;
                if (var18 > var16) {
                    var18 = var16;
                } else if (var18 == 0 && arg0.field760 > 0) {
                    var18 = 1;
                }
                class73.method1515(field285 + arg2 - var16 / 2, field366 + arg3 - 3, var18, 5, 65280);
                class73.method1515(field285 + arg2 - var16 / 2 + var18, field366 + arg3 - 3, var16 - var18, 5, 16711680);
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (arg0.field739[var19] > field442) {
                int var20 = arg0.field767 / 2;
                method519(arg0.field775, arg0.field720, var20);
                if (field285 > -1) {
                    if (var19 == 1) {
                        field366 -= 20;
                    }
                    if (var19 == 2) {
                        field285 -= 15;
                        field366 -= 10;
                    }
                    if (var19 == 3) {
                        field285 += 15;
                        field366 -= 10;
                    }
                    Statics.field1046[arg0.field727[var19]].method1429(field285 + arg2 - 12, field366 + arg3 - 12);
                    Statics.field138.method3333(Integer.toString(arg0.field737[var19]), field285 + arg2 - 1, field366 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("av.az(IIIS)V")
    public static final void method519(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field285 = -1;
            field366 = -1;
            return;
        }
        int var3 = method548(arg0, arg1, Statics.field2401) - arg2;
        int var4 = arg0 - Statics.field1818;
        int var5 = var3 - Statics.field158;
        int var6 = arg1 - Statics.field53;
        int var7 = class84.field1480[Statics.field1890];
        int var8 = class84.field1464[Statics.field1890];
        int var9 = class84.field1480[Statics.field82];
        int var10 = class84.field1464[Statics.field82];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field285 = (var11 << 9) / var15 + 256;
            field366 = (var14 << 9) / var15 + 167;
        } else {
            field285 = -1;
            field366 = -1;
        }
    }

    @ObfuscatedName("am.au(IIII)I")
    public static final int method548(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field100[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field83[var5][var3][var4] + class6.field83[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field83[var5][var3][var4 + 1] + class6.field83[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ch.ai(IIIIIIB)V")
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1480[var6];
            int var12 = class84.field1464[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1480[var7];
            int var15 = class84.field1464[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1818 = arg0 - var8;
        Statics.field158 = arg1 - var9;
        Statics.field53 = arg2 - var10;
        Statics.field1890 = arg3;
        Statics.field82 = arg4;
    }

    @ObfuscatedName("au.ad(ZI)V")
    public static final void method817(boolean arg0) {
        field438 = arg0;
        if (!field438) {
            int var1 = field448.method2140();
            int var2 = field448.method2152();
            int var3 = field448.method2146();
            int var4 = field448.method2146();
            int var5 = field448.method2224();
            int var6 = (field305 - field448.field1844) / 16;
            Statics.field2020 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field2020[var7][var8] = field448.method2121();
                }
            }
            Statics.field2101 = new int[var6];
            Statics.field1878 = new int[var6];
            Statics.field1655 = new int[var6];
            Statics.field717 = new byte[var6][];
            Statics.field236 = new byte[var6][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2101[var10] = var13;
                        Statics.field1878[var10] = Statics.field253.method2710("m" + var11 + "_" + var12);
                        Statics.field1655[var10] = Statics.field253.method2710("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method573(var4, var2, var1, var3, var5);
            return;
        }
        int var14 = field448.method2146();
        field448.method2363();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field448.method2364(1);
                    if (var18 == 1) {
                        field343[var15][var16][var17] = field448.method2364(26);
                    } else {
                        field343[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field448.method2366();
        int var19 = (field305 - field448.field1844) / 16;
        Statics.field2020 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2020[var20][var21] = field448.method2157();
            }
        }
        int var22 = field448.method2224();
        int var23 = field448.method2152();
        int var24 = field448.method2141();
        int var25 = field448.method2146();
        Statics.field2101 = new int[var19];
        Statics.field1878 = new int[var19];
        Statics.field1655 = new int[var19];
        Statics.field717 = new byte[var19][];
        Statics.field236 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field343[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2101[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2101[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1878[var26] = Statics.field253.method2710("m" + var35 + "_" + var36);
                            Statics.field1655[var26] = Statics.field253.method2710("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method573(var25, var23, var24, var22, var14);
    }

    @ObfuscatedName("ag.al(IIIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field614 == arg0 && Statics.field584 == arg1 && field315 == arg2 || !field433) {
            return;
        }
        Statics.field614 = arg0;
        Statics.field584 = arg1;
        field315 = arg2;
        if (!field433) {
            field315 = 0;
        }
        method592(25);
        method1776(class142.field2143, true);
        int var5 = Statics.field314;
        int var6 = Statics.field2743;
        Statics.field314 = (arg0 - 6) * 8;
        Statics.field2743 = (arg1 - 6) * 8;
        int var7 = Statics.field314 - var5;
        int var8 = Statics.field2743 - var6;
        int var9 = Statics.field314;
        int var10 = Statics.field2743;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field298[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field772[var13] -= var7;
                    var12.field773[var13] -= var8;
                }
                var12.field775 -= var7 * 128;
                var12.field720 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field380[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field772[var16] -= var7;
                    var15.field773[var16] -= var8;
                }
                var15.field775 -= var7 * 128;
                var15.field720 -= var8 * 128;
            }
        }
        Statics.field2401 = arg2;
        Statics.field183.method576(arg3, arg4, false);
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
                        field395[var27][var23][var24] = field395[var27][var25][var26];
                    } else {
                        field395[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field396.method3210(); var28 != null; var28 = (class15) field396.method3182()) {
            var28.field222 -= var7;
            var28.field217 -= var8;
            if (var28.field222 < 0 || var28.field217 < 0 || var28.field222 >= 104 || var28.field217 >= 104) {
                var28.method3273();
            }
        }
        if (field490 != 0) {
            field490 -= var7;
            field491 -= var8;
        }
        field513 = 0;
        field504 = false;
        field498 = -1;
        field398.method3185();
        field397.method3185();
    }

    @ObfuscatedName("gs.ae(ZS)V")
    public static final void method3280(boolean arg0) {
        method1775();
        field308++;
        if (field308 < 50 && !arg0) {
            return;
        }
        field308 = 0;
        if (field313 || Statics.field156 == null) {
            return;
        }
        field402.method2361(244);
        try {
            Statics.field156.method2556(field402.field1849, 0, field402.field1844);
            field402.field1844 = 0;
        } catch (IOException var2) {
            field313 = true;
        }
    }

    @ObfuscatedName("bm.as(II)V")
    public static final void method1406(int arg0) {
        int[] var1 = Statics.field1030.field1300;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field100[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field66.method1712(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field100[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field66.method1712(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1030.method1411();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field100[arg0][var10][var9] & 0x18) == 0) {
                    method85(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field100[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method85(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field486 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field66.method1678(Statics.field2401, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method12(var14).field860;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field321[Statics.field2401].field2943;
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
                        field489[field486] = Statics.field2122[var15];
                        field472[field486] = var16;
                        field272[field486] = var17;
                        field486++;
                    }
                }
            }
        }
        Statics.field977.method1401();
    }

    @ObfuscatedName("l.ax(IIIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field66.method1634(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field66.method1638(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1030.field1300;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method12(var12);
            if (var13.field876 == -1) {
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
                class74 var14 = Statics.field660[var13.field876];
                if (var14 != null) {
                    int var15 = (var13.field877 * 4 - var14.field1317) / 2;
                    int var16 = (var13.field848 * 4 - var14.field1319) / 2;
                    var14.method1583(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field848) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field66.method1636(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field66.method1638(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method12(var21);
            if (var22.field876 != -1) {
                class74 var23 = Statics.field660[var22.field876];
                if (var23 != null) {
                    int var24 = (var22.field877 * 4 - var23.field1317) / 2;
                    int var25 = (var22.field848 * 4 - var23.field1319) / 2;
                    var23.method1583(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field848) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1030.field1300;
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
        int var29 = Statics.field66.method1678(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method12(var30);
        if (var31.field876 == -1) {
            return;
        }
        class74 var32 = Statics.field660[var31.field876];
        if (var32 != null) {
            int var33 = (var31.field877 * 4 - var32.field1317) / 2;
            int var34 = (var31.field848 * 4 - var32.field1319) / 2;
            var32.method1583(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field848) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cn.aa(I)V")
    public static final void method1771() {
        if (field306 == 69) {
            int var0 = field448.method2140();
            int var1 = (var0 >> 4 & 0x7) + Statics.field15;
            int var2 = (var0 & 0x7) + Statics.field141;
            int var3 = field448.method2224();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var4 = field395[Statics.field2401][var1][var2];
                if (var4 != null) {
                    for (class25 var5 = (class25) var4.method3210(); var5 != null; var5 = (class25) var4.method3182()) {
                        if ((var3 & 0x7FFF) == var5.field623) {
                            var5.method3273();
                            break;
                        }
                    }
                    if (var4.method3210() == null) {
                        field395[Statics.field2401][var1][var2] = null;
                    }
                    method1302(var1, var2);
                }
            }
        } else if (field306 == 71) {
            int var6 = field448.method2141();
            int var7 = (var6 >> 4 & 0x7) + Statics.field15;
            int var8 = (var6 & 0x7) + Statics.field141;
            int var9 = field448.method2101();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field373[var10];
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method2670(Statics.field2401, var7, var8, var12, -1, var10, var11, 0, -1);
            }
        } else if (field306 == 131) {
            int var13 = field448.method2101();
            int var14 = (var13 >> 4 & 0x7) + Statics.field15;
            int var15 = (var13 & 0x7) + Statics.field141;
            int var16 = field448.method2226();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field373[var17];
            int var20 = field448.method2224();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                method2670(Statics.field2401, var14, var15, var19, var20, var17, var18, 0, -1);
            }
        } else {
            if (field306 == 32) {
                int var21 = field448.method2226();
                int var22 = (var21 >> 4 & 0x7) + Statics.field15;
                int var23 = (var21 & 0x7) + Statics.field141;
                int var24 = field448.method2152();
                int var25 = field448.method2226();
                int var26 = var25 >> 4 & 0xF;
                int var27 = var25 & 0x7;
                int var28 = field448.method2226();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    int var29 = var26 + 1;
                    if (Statics.field183.field772[0] >= var22 - var29 && Statics.field183.field772[0] <= var22 + var29 && Statics.field183.field773[0] >= var23 - var29 && Statics.field183.field773[0] <= var23 + var29 && field381 != 0 && var27 > 0 && field513 < 50) {
                        field499[field513] = var24;
                        field500[field513] = var27;
                        field501[field513] = var28;
                        field503[field513] = null;
                        field502[field513] = (var22 << 16) + (var23 << 8) + var26;
                        field513++;
                    }
                }
            }
            if (field306 == 1) {
                byte var30 = field448.method2292();
                int var31 = field448.method2152();
                int var32 = field448.method2101();
                int var33 = (var32 >> 4 & 0x7) + Statics.field15;
                int var34 = (var32 & 0x7) + Statics.field141;
                int var35 = field448.method2224();
                int var36 = field448.method2141();
                int var37 = var36 >> 2;
                int var38 = var36 & 0x3;
                int var39 = field373[var37];
                byte var40 = field448.method2292();
                int var41 = field448.method2224();
                byte var42 = field448.method2267();
                int var43 = field448.method2152();
                byte var44 = field448.method2292();
                class3 var45;
                if (field386 == var35) {
                    var45 = Statics.field183;
                } else {
                    var45 = field380[var35];
                }
                if (var45 != null) {
                    class36 var46 = class36.method12(var43);
                    int var47;
                    int var48;
                    if (var38 == 1 || var38 == 3) {
                        var47 = var46.field848;
                        var48 = var46.field877;
                    } else {
                        var47 = var46.field877;
                        var48 = var46.field848;
                    }
                    int var49 = (var47 >> 1) + var33;
                    int var50 = (var47 + 1 >> 1) + var33;
                    int var51 = (var48 >> 1) + var34;
                    int var52 = (var48 + 1 >> 1) + var34;
                    int[][] var53 = class6.field83[Statics.field2401];
                    int var54 = var53[var49][var51] + var53[var50][var51] + var53[var49][var52] + var53[var50][var52] >> 2;
                    int var55 = (var33 << 7) + (var47 << 6);
                    int var56 = (var34 << 7) + (var48 << 6);
                    class98 var57 = var46.method637(var37, var38, var53, var55, var54, var56);
                    if (var57 != null) {
                        method2670(Statics.field2401, var33, var34, var39, -1, 0, 0, var41 + 1, var31 + 1);
                        var45.field40 = field442 + var41;
                        var45.field33 = field442 + var31;
                        var45.field45 = var57;
                        var45.field42 = var33 * 128 + var47 * 64;
                        var45.field35 = var34 * 128 + var48 * 64;
                        var45.field43 = var54;
                        if (var40 > var30) {
                            byte var58 = var40;
                            var40 = var30;
                            var30 = var58;
                        }
                        if (var44 > var42) {
                            byte var59 = var44;
                            var44 = var42;
                            var42 = var59;
                        }
                        var45.field46 = var33 + var40;
                        var45.field48 = var30 + var33;
                        var45.field47 = var34 + var44;
                        var45.field57 = var34 + var42;
                    }
                }
            }
            if (field306 == 228) {
                int var60 = field448.method2226();
                int var61 = (var60 >> 4 & 0x7) + Statics.field15;
                int var62 = (var60 & 0x7) + Statics.field141;
                int var63 = field448.method2152();
                int var64 = field448.method2226();
                int var65 = field448.method2152();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    int var66 = var61 * 128 + 64;
                    int var67 = var62 * 128 + 64;
                    class26 var68 = new class26(var63, Statics.field2401, var66, var67, method548(var66, var67, Statics.field2401) - var64, var65, field442);
                    field398.method3183(var68);
                }
            } else if (field306 == 22) {
                int var69 = field448.method2226();
                int var70 = (var69 >> 4 & 0x7) + Statics.field15;
                int var71 = (var69 & 0x7) + Statics.field141;
                int var72 = field448.method2224();
                int var73 = field448.method2224();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class25 var74 = new class25();
                    var74.field623 = var73;
                    var74.field616 = var72;
                    if (field395[Statics.field2401][var70][var71] == null) {
                        field395[Statics.field2401][var70][var71] = new class177();
                    }
                    field395[Statics.field2401][var70][var71].method3183(var74);
                    method1302(var70, var71);
                }
            } else if (field306 == 199) {
                int var75 = field448.method2226();
                int var76 = (var75 >> 4 & 0x7) + Statics.field15;
                int var77 = (var75 & 0x7) + Statics.field141;
                int var78 = field448.method2152();
                int var79 = field448.method2152();
                int var80 = field448.method2152();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class177 var81 = field395[Statics.field2401][var76][var77];
                    if (var81 != null) {
                        for (class25 var82 = (class25) var81.method3210(); var82 != null; var82 = (class25) var81.method3182()) {
                            if ((var78 & 0x7FFF) == var82.field623 && var82.field616 == var79) {
                                var82.field616 = var80;
                                break;
                            }
                        }
                        method1302(var76, var77);
                    }
                }
            } else if (field306 == 248) {
                int var83 = field448.method2226();
                int var84 = (var83 >> 4 & 0x7) + Statics.field15;
                int var85 = (var83 & 0x7) + Statics.field141;
                int var86 = var84 + field448.method2292();
                int var87 = var85 + field448.method2292();
                int var88 = field448.method2204();
                int var89 = field448.method2152();
                int var90 = field448.method2226() * 4;
                int var91 = field448.method2226() * 4;
                int var92 = field448.method2152();
                int var93 = field448.method2152();
                int var94 = field448.method2226();
                int var95 = field448.method2226();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var89 != 65535) {
                    int var96 = var84 * 128 + 64;
                    int var97 = var85 * 128 + 64;
                    int var98 = var86 * 128 + 64;
                    int var99 = var87 * 128 + 64;
                    class7 var100 = new class7(var89, Statics.field2401, var96, var97, method548(var96, var97, Statics.field2401) - var90, field442 + var92, field442 + var93, var94, var95, var88, var91);
                    var100.method77(var98, var99, method548(var98, var99, Statics.field2401) - var91, field442 + var92);
                    field397.method3183(var100);
                }
            } else if (field306 == 240) {
                int var101 = field448.method2226();
                int var102 = (var101 >> 4 & 0x7) + Statics.field15;
                int var103 = (var101 & 0x7) + Statics.field141;
                int var104 = field448.method2224();
                int var105 = field448.method2140();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field373[var106];
                if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                    if (var108 == 0) {
                        class80 var109 = Statics.field66.method1630(Statics.field2401, var102, var103);
                        if (var109 != null) {
                            int var110 = var109.field1427 >> 14 & 0x7FFF;
                            if (var106 == 2) {
                                var109.field1419 = new class11(var110, 2, var107 + 4, Statics.field2401, var102, var103, var104, false, var109.field1419);
                                var109.field1420 = new class11(var110, 2, var107 + 1 & 0x3, Statics.field2401, var102, var103, var104, false, var109.field1420);
                            } else {
                                var109.field1419 = new class11(var110, var106, var107, Statics.field2401, var102, var103, var104, false, var109.field1419);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class87 var111 = Statics.field66.method1677(Statics.field2401, var102, var103);
                        if (var111 != null) {
                            int var112 = var111.field1493 >> 14 & 0x7FFF;
                            if (var106 == 4 || var106 == 5) {
                                var111.field1500 = new class11(var112, 4, var107, Statics.field2401, var102, var103, var104, false, var111.field1500);
                            } else if (var106 == 6) {
                                var111.field1500 = new class11(var112, 4, var107 + 4, Statics.field2401, var102, var103, var104, false, var111.field1500);
                            } else if (var106 == 7) {
                                var111.field1500 = new class11(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field2401, var102, var103, var104, false, var111.field1500);
                            } else if (var106 == 8) {
                                var111.field1500 = new class11(var112, 4, var107 + 4, Statics.field2401, var102, var103, var104, false, var111.field1500);
                                var111.field1501 = new class11(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field2401, var102, var103, var104, false, var111.field1501);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class91 var113 = Statics.field66.method1632(Statics.field2401, var102, var103);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var113 != null) {
                            var113.field1557 = new class11(var113.field1566 >> 14 & 0x7FFF, var106, var107, Statics.field2401, var102, var103, var104, false, var113.field1557);
                        }
                    }
                    if (var108 == 3) {
                        class86 var114 = Statics.field66.method1622(Statics.field2401, var102, var103);
                        if (var114 != null) {
                            var114.field1485 = new class11(var114.field1482 >> 14 & 0x7FFF, 22, var107, Statics.field2401, var102, var103, var104, false, var114.field1485);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.ab(IIIIIIIIII)V")
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field396.method3210(); var10 != null; var10 = (class15) field396.method3182()) {
            if (var10.field221 == arg0 && var10.field222 == arg1 && var10.field217 == arg2 && var10.field215 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field221 = arg0;
            var9.field215 = arg3;
            var9.field222 = arg1;
            var9.field217 = arg2;
            method1605(var9);
            field396.method3183(var9);
        }
        var9.field216 = arg4;
        var9.field223 = arg5;
        var9.field224 = arg6;
        var9.field214 = arg7;
        var9.field225 = arg8;
    }

    @ObfuscatedName("l.bc(S)V")
    public static final void method86() {
        for (class15 var0 = (class15) field396.method3210(); var0 != null; var0 = (class15) field396.method3182()) {
            if (var0.field225 == -1) {
                var0.field214 = 0;
                method1605(var0);
            } else {
                var0.method3273();
            }
        }
    }

    @ObfuscatedName("bu.bb(Ly;I)V")
    public static final void method1605(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field215 == 0) {
            var1 = Statics.field66.method1634(arg0.field221, arg0.field222, arg0.field217);
        }
        if (arg0.field215 == 1) {
            var1 = Statics.field66.method1653(arg0.field221, arg0.field222, arg0.field217);
        }
        if (arg0.field215 == 2) {
            var1 = Statics.field66.method1636(arg0.field221, arg0.field222, arg0.field217);
        }
        if (arg0.field215 == 3) {
            var1 = Statics.field66.method1678(arg0.field221, arg0.field222, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field66.method1638(arg0.field221, arg0.field222, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field218 = var2;
        arg0.field220 = var3;
        arg0.field227 = var4;
    }

    @ObfuscatedName("p.bo(I)V")
    public static final void method139() {
        for (class15 var0 = (class15) field396.method3210(); var0 != null; var0 = (class15) field396.method3182()) {
            if (var0.field225 > 0) {
                var0.field225--;
            }
            if (var0.field225 == 0) {
                if (var0.field218 >= 0) {
                    int var1 = var0.field218;
                    int var2 = var0.field220;
                    class36 var3 = class36.method12(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method653(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2798(var0.field221, var0.field215, var0.field222, var0.field217, var0.field218, var0.field227, var0.field220);
                var0.method3273();
            } else {
                if (var0.field214 > 0) {
                    var0.field214--;
                }
                if (var0.field214 == 0 && var0.field222 >= 1 && var0.field217 >= 1 && var0.field222 <= 102 && var0.field217 <= 102) {
                    if (var0.field216 >= 0) {
                        int var5 = var0.field216;
                        int var6 = var0.field223;
                        class36 var7 = class36.method12(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method653(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2798(var0.field221, var0.field215, var0.field222, var0.field217, var0.field216, var0.field224, var0.field223);
                    var0.field214 = -1;
                    if (var0.field218 == var0.field216 && var0.field218 == -1) {
                        var0.method3273();
                    } else if (var0.field218 == var0.field216 && var0.field227 == var0.field224 && var0.field223 == var0.field220) {
                        var0.method3273();
                    }
                }
            }
        }
    }

    @ObfuscatedName("eg.bg(IIIIIIII)V")
    public static final void method2798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field433 && Statics.field2401 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field66.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field66.method1653(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field66.method1636(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field66.method1678(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field66.method1638(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field66.method1698(arg0, arg2, arg3);
                class36 var15 = class36.method12(var12);
                if (var15.field859 != 0) {
                    field321[arg0].method3447(arg2, arg3, var13, var14, var15.field850);
                }
            }
            if (arg1 == 1) {
                Statics.field66.method1607(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field66.method1627(arg0, arg2, arg3);
                class36 var16 = class36.method12(var12);
                if (var16.field877 + arg2 > 103 || var16.field877 + arg3 > 103 || var16.field848 + arg2 > 103 || var16.field848 + arg3 > 103) {
                    return;
                }
                if (var16.field859 != 0) {
                    field321[arg0].method3443(arg2, arg3, var16.field877, var16.field848, var14, var16.field850);
                }
            }
            if (arg1 == 3) {
                Statics.field66.method1628(arg0, arg2, arg3);
                class36 var17 = class36.method12(var12);
                if (var17.field859 == 1) {
                    field321[arg0].method3446(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field100[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field66;
        class197 var20 = field321[arg0];
        class36 var21 = class36.method12(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field848;
            var23 = var21.field877;
        } else {
            var22 = var21.field877;
            var23 = var21.field848;
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
        if (var21.field853 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field872 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field842 == -1 && var21.field873 == null) {
                var34 = var21.method637(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1614(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field859 == 1) {
                var20.method3441(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field842 == -1 && var21.field873 == null) {
                var57 = var21.method637(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1618(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field859 != 0) {
                var20.method3439(arg2, arg3, var22, var23, var21.field850);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field842 == -1 && var21.field873 == null) {
                var35 = var21.method637(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1618(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3439(arg2, arg3, var22, var23, var21.field850);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field842 == -1 && var21.field873 == null) {
                var36 = var21.method637(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var36, (class78) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field850);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field842 == -1 && var21.field873 == null) {
                var37 = var21.method637(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var37, (class78) null, class6.field96[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field850);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field842 == -1 && var21.field873 == null) {
                var39 = var21.method637(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method637(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field842, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var39, var40, class6.field91[arg5], class6.field91[var38], var32, var33);
            if (var21.field859 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field850);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field842 == -1 && var21.field873 == null) {
                var41 = var21.method637(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var41, (class78) null, class6.field96[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field850);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field842 == -1 && var21.field873 == null) {
                var42 = var21.method637(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1618(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3439(arg2, arg3, var22, var23, var21.field850);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field842 == -1 && var21.field873 == null) {
                var43 = var21.method637(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, var43, (class78) null, class6.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1634(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method12(var45 >> 14 & 0x7FFF).field856;
            }
            class78 var46;
            if (var21.field842 == -1 && var21.field873 == null) {
                var46 = var21.method637(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, var46, (class78) null, class6.field91[arg5], 0, class6.field86[arg5] * var44, class6.field94[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1634(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method12(var48 >> 14 & 0x7FFF).field856 / 2;
            }
            class78 var49;
            if (var21.field842 == -1 && var21.field873 == null) {
                var49 = var21.method637(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field95[arg5] * var47, class6.field98[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field842 == -1 && var21.field873 == null) {
                var51 = var21.method637(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1634(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method12(var53 >> 14 & 0x7FFF).field856 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field842 == -1 && var21.field873 == null) {
                var55 = var21.method637(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method637(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field842, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field842, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field95[arg5] * var52, class6.field98[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bh.bf(III)V")
    public static final void method1302(int arg0, int arg1) {
        class177 var2 = field395[Statics.field2401][arg0][arg1];
        if (var2 == null) {
            Statics.field66.method1626(Statics.field2401, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3210(); var6 != null; var6 = (class25) var2.method3182()) {
            class45 var7 = class45.method28(var6.field623);
            long var8 = (long) var7.field1028;
            if (var7.field1011 == 1) {
                var8 = (long) (var6.field616 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field66.method1626(Statics.field2401, arg0, arg1);
            return;
        }
        var2.method3216(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3210(); var12 != null; var12 = (class25) var2.method3182()) {
            if (var5.field623 != var12.field623) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field623 != var12.field623 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field66.method1615(Statics.field2401, arg0, arg1, method548(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2401), var5, var13, var10, var11);
    }

    @ObfuscatedName("ak.bv(I)V")
    public static final void method558() {
        field448.method2363();
        int var0 = field448.method2364(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field448.method2364(2);
        if (var1 == 0) {
            field507[++field335 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field448.method2364(3);
            Statics.field183.method577(var2, false);
            int var3 = field448.method2364(1);
            if (var3 == 1) {
                field507[++field335 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field448.method2364(3);
            Statics.field183.method577(var4, true);
            int var5 = field448.method2364(3);
            Statics.field183.method577(var5, true);
            int var6 = field448.method2364(1);
            if (var6 == 1) {
                field507[++field335 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field2401 = field448.method2364(2);
            int var7 = field448.method2364(7);
            int var8 = field448.method2364(1);
            int var9 = field448.method2364(7);
            int var10 = field448.method2364(1);
            if (var10 == 1) {
                field507[++field335 - 1] = 2047;
            }
            Statics.field183.method576(var9, var7, var8 == 1);
        }
    }

    @ObfuscatedName("a.bd(B)V")
    public static final void method481() {
        int var0 = field448.method2364(8);
        if (var0 < field483) {
            for (int var1 = var0; var1 < field483; var1++) {
                field389[++field388 - 1] = field382[var1];
            }
        }
        if (var0 > field483) {
            throw new RuntimeException("");
        }
        field483 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field382[var2];
            class3 var4 = field380[var3];
            int var5 = field448.method2364(1);
            if (var5 == 0) {
                field382[++field483 - 1] = var3;
                var4.field766 = field442;
            } else {
                int var6 = field448.method2364(2);
                if (var6 == 0) {
                    field382[++field483 - 1] = var3;
                    var4.field766 = field442;
                    field507[++field335 - 1] = var3;
                } else if (var6 == 1) {
                    field382[++field483 - 1] = var3;
                    var4.field766 = field442;
                    int var7 = field448.method2364(3);
                    var4.method577(var7, false);
                    int var8 = field448.method2364(1);
                    if (var8 == 1) {
                        field507[++field335 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field382[++field483 - 1] = var3;
                    var4.field766 = field442;
                    int var9 = field448.method2364(3);
                    var4.method577(var9, true);
                    int var10 = field448.method2364(3);
                    var4.method577(var10, true);
                    int var11 = field448.method2364(1);
                    if (var11 == 1) {
                        field507[++field335 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field389[++field388 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ch.bp(I)V")
    public static final void method1856() {
        for (int var0 = 0; var0 < field335; var0++) {
            int var1 = field507[var0];
            class3 var2 = field380[var1];
            int var3 = field448.method2226();
            if ((var3 & 0x40) != 0) {
                var3 += field448.method2226() << 8;
            }
            method183(var1, var2, var3);
        }
    }

    @ObfuscatedName("client.bw(ILi;II)V")
    public static final void method183(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x4) != 0) {
            int var3 = field448.method2224();
            int var4 = field448.method2101();
            arg1.method579(var3, var4, field442);
            arg1.field740 = field442 + 300;
            arg1.field760 = field448.method2226();
            arg1.field744 = field448.method2226();
        }
        if ((arg2 & 0x80) != 0) {
            int var5 = field448.method2224();
            int var6 = field448.method2101();
            boolean var7 = field448.method2101() == 1;
            int var8 = field448.method2141();
            int var9 = field448.field1844;
            if (arg1.field44 != null && arg1.field41 != null) {
                boolean var10 = false;
                if (var6 <= 1 && method1388(arg1.field44)) {
                    var10 = true;
                }
                if (!var10 && field331 == 0 && !arg1.field52) {
                    field329.field1844 = 0;
                    field448.method2127(field329.field1849, 0, var8);
                    field329.field1844 = 0;
                    String var11 = class192.method3380(class199.method1872(class191.method2641(field329)));
                    arg1.field732 = var11.trim();
                    arg1.field735 = var5 >> 8;
                    arg1.field736 = var5 & 0xFF;
                    arg1.field734 = 150;
                    arg1.field733 = var7;
                    if (var6 == 2 || var6 == 3) {
                        class10.method2658(var7 ? 91 : 1, class2.method754(1) + arg1.field44, var11);
                    } else if (var6 == 1) {
                        class10.method2658(var7 ? 91 : 1, class2.method754(0) + arg1.field44, var11);
                    } else {
                        class10.method2658(var7 ? 90 : 2, arg1.field44, var11);
                    }
                }
            }
            field448.field1844 = var8 + var9;
        }
        if ((arg2 & 0x20) != 0) {
            int var12 = field448.method2226();
            byte[] var13 = new byte[var12];
            class107 var14 = new class107(var13);
            field448.method2159(var13, 0, var12);
            field385[arg0] = var14;
            arg1.method15(var14);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field732 = field448.method2124();
            if (arg1.field732.charAt(0) == '~') {
                arg1.field732 = arg1.field732.substring(1);
                class10.method2658(2, arg1.field44, arg1.field732);
            } else if (Statics.field183 == arg1) {
                class10.method2658(2, arg1.field44, arg1.field732);
            }
            arg1.field733 = false;
            arg1.field735 = 0;
            arg1.field736 = 0;
            arg1.field734 = 150;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field741 = field448.method2146();
            arg1.field745 = field448.method2224();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field759 = field448.method2140();
            arg1.field761 = field448.method2141();
            arg1.field738 = field448.method2101();
            arg1.field765 = field448.method2101();
            arg1.field724 = field448.method2147() + field442;
            arg1.field730 = field448.method2147() + field442;
            arg1.field770 = field448.method2101();
            arg1.field764 = 1;
            arg1.field776 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var15 = field448.method2147();
            int var16 = field448.method2141();
            arg1.method579(var15, var16, field442);
            arg1.field740 = field442 + 300;
            arg1.field760 = field448.method2226();
            arg1.field744 = field448.method2140();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field754 = field448.method2146();
            int var17 = field448.method2157();
            arg1.field758 = var17 >> 16;
            arg1.field757 = (var17 & 0xFFFF) + field442;
            arg1.field762 = 0;
            arg1.field719 = 0;
            if (arg1.field757 > field442) {
                arg1.field762 = -1;
            }
            if (arg1.field754 == 65535) {
                arg1.field754 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field743 = field448.method2146();
            if (arg1.field743 == 65535) {
                arg1.field743 = -1;
            }
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        int var18 = field448.method2147();
        if (var18 == 65535) {
            var18 = -1;
        }
        int var19 = field448.method2141();
        method71(arg1, var18, var19);
    }

    @ObfuscatedName("ac.bs(I)V")
    public static final void method553() {
        field388 = 0;
        field335 = 0;
        method93();
        while (field448.method2376(field305) >= 27) {
            int var0 = field448.method2364(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field298[var0] == null) {
                field298[var0] = new class30();
                var16 = true;
            }
            class30 var17 = field298[var0];
            field300[++field351 - 1] = var0;
            var17.field766 = field442;
            var17.field695 = class35.method562(field448.method2364(14));
            int var18 = field448.method2364(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field326[field448.method2364(3)];
            if (var16) {
                var17.field721 = var17.field763 = var19;
            }
            int var20 = field448.method2364(1);
            int var21 = field448.method2364(1);
            if (var21 == 1) {
                field507[++field335 - 1] = var0;
            }
            int var22 = field448.method2364(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.field723 = var17.field695.field794;
            var17.field768 = var17.field695.field817;
            if (var17.field768 == 0) {
                var17.field763 = 0;
            }
            var17.field742 = var17.field695.field808;
            var17.field755 = var17.field695.field801;
            var17.field729 = var17.field695.field802;
            var17.field728 = var17.field695.field825;
            var17.field750 = var17.field695.field797;
            var17.field725 = var17.field695.field798;
            var17.field726 = var17.field695.field799;
            var17.method576(Statics.field183.field772[0] + var22, Statics.field183.field773[0] + var18, var20 == 1);
        }
        field448.method2366();
        for (int var1 = 0; var1 < field335; var1++) {
            int var2 = field507[var1];
            class30 var3 = field298[var2];
            int var4 = field448.method2226();
            if ((var4 & 0x80) != 0) {
                var3.field741 = field448.method2224();
                var3.field745 = field448.method2152();
            }
            if ((var4 & 0x20) != 0) {
                int var5 = field448.method2140();
                int var6 = field448.method2141();
                var3.method579(var5, var6, field442);
                var3.field740 = field442 + 300;
                var3.field760 = field448.method2147();
                var3.field744 = field448.method2146();
            }
            if ((var4 & 0x2) != 0) {
                var3.field695 = class35.method562(field448.method2152());
                var3.field723 = var3.field695.field794;
                var3.field768 = var3.field695.field817;
                var3.field742 = var3.field695.field808;
                var3.field755 = var3.field695.field801;
                var3.field729 = var3.field695.field802;
                var3.field728 = var3.field695.field825;
                var3.field750 = var3.field695.field797;
                var3.field725 = var3.field695.field798;
                var3.field726 = var3.field695.field799;
            }
            if ((var4 & 0x1) != 0) {
                int var7 = field448.method2140();
                int var8 = field448.method2226();
                var3.method579(var7, var8, field442);
                var3.field740 = field442 + 300;
                var3.field760 = field448.method2224();
                var3.field744 = field448.method2147();
            }
            if ((var4 & 0x4) != 0) {
                int var9 = field448.method2146();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field448.method2226();
                if (var3.field749 == var9 && var9 != -1) {
                    int var11 = class38.method730(var9).field910;
                    if (var11 == 1) {
                        var3.field756 = 0;
                        var3.field751 = 0;
                        var3.field752 = var10;
                        var3.field753 = 0;
                    }
                    if (var11 == 2) {
                        var3.field753 = 0;
                    }
                } else if (var9 == -1 || var3.field749 == -1 || class38.method730(var9).field912 >= class38.method730(var3.field749).field912) {
                    var3.field749 = var9;
                    var3.field756 = 0;
                    var3.field751 = 0;
                    var3.field752 = var10;
                    var3.field753 = 0;
                    var3.field776 = var3.field764;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field732 = field448.method2124();
                var3.field734 = 100;
            }
            if ((var4 & 0x40) != 0) {
                var3.field743 = field448.method2146();
                if (var3.field743 == 65535) {
                    var3.field743 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field754 = field448.method2224();
                int var12 = field448.method2157();
                var3.field758 = var12 >> 16;
                var3.field757 = (var12 & 0xFFFF) + field442;
                var3.field762 = 0;
                var3.field719 = 0;
                if (var3.field757 > field442) {
                    var3.field762 = -1;
                }
                if (var3.field754 == 65535) {
                    var3.field754 = -1;
                }
            }
        }
        for (int var13 = 0; var13 < field388; var13++) {
            int var14 = field389[var13];
            if (field442 != field298[var14].field766) {
                field298[var14].field695 = null;
                field298[var14] = null;
            }
        }
        if (field305 != field448.field1844) {
            throw new RuntimeException(field448.field1844 + class2.field29 + field305);
        }
        for (int var15 = 0; var15 < field351; var15++) {
            if (field298[field300[var15]] == null) {
                throw new RuntimeException(var15 + class2.field29 + field351);
            }
        }
    }

    @ObfuscatedName("m.by(B)V")
    public static final void method93() {
        field448.method2363();
        int var0 = field448.method2364(8);
        if (var0 < field351) {
            for (int var1 = var0; var1 < field351; var1++) {
                field389[++field388 - 1] = field300[var1];
            }
        }
        if (var0 > field351) {
            throw new RuntimeException("");
        }
        field351 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field300[var2];
            class30 var4 = field298[var3];
            int var5 = field448.method2364(1);
            if (var5 == 0) {
                field300[++field351 - 1] = var3;
                var4.field766 = field442;
            } else {
                int var6 = field448.method2364(2);
                if (var6 == 0) {
                    field300[++field351 - 1] = var3;
                    var4.field766 = field442;
                    field507[++field335 - 1] = var3;
                } else if (var6 == 1) {
                    field300[++field351 - 1] = var3;
                    var4.field766 = field442;
                    int var7 = field448.method2364(3);
                    var4.method577(var7, false);
                    int var8 = field448.method2364(1);
                    if (var8 == 1) {
                        field507[++field335 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field300[++field351 - 1] = var3;
                    var4.field766 = field442;
                    int var9 = field448.method2364(3);
                    var4.method577(var9, true);
                    int var10 = field448.method2364(3);
                    var4.method577(var10, true);
                    int var11 = field448.method2364(1);
                    if (var11 == 1) {
                        field507[++field335 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field389[++field388 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("an.bn(IIB)V")
    public static final void method627(int arg0, int arg1) {
        if (field480 < 2 && field430 == 0 && !field417) {
            return;
        }
        String var2;
        if (field430 == 1 && field480 < 2) {
            var2 = class142.field2284 + class142.field2294 + field416 + " " + class2.field21;
        } else if (field417 && field480 < 2) {
            var2 = field420 + class142.field2294 + field421 + " " + class2.field21;
        } else {
            var2 = method1046(field480 - 1);
        }
        if (field480 > 2) {
            var2 = var2 + class2.method2043(16777215) + " " + '/' + " " + (field480 - 2) + class142.field2269;
        }
        Statics.field1086.method3315(var2, arg0 + 4, arg1 + 15, 16777215, 0, field442 / 1000);
    }

    @ObfuscatedName("f.bh(I)V")
    public static final void method131() {
        int var0 = Statics.field1517;
        int var1 = Statics.field1044;
        int var2 = Statics.field1670;
        int var3 = Statics.field546;
        int var4 = 6116423;
        class73.method1515(var0, var1, var2, var3, var4);
        class73.method1515(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1517(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1086.method3308(class142.field2358, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2007;
        int var6 = class127.field1997;
        for (int var7 = 0; var7 < field480; var7++) {
            int var8 = (field480 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1086.method3308(method1046(var7), var0 + 3, var8, var9, 0);
        }
        method1869(Statics.field1517, Statics.field1044, Statics.field1670, Statics.field546);
    }

    @ObfuscatedName("ao.bk(IIIII)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field464; var4++) {
            if (field471[var4] + field469[var4] > arg0 && field469[var4] < arg0 + arg2 && field318[var4] + field312[var4] > arg1 && field312[var4] < arg1 + arg3) {
                field485[var4] = true;
            }
        }
    }

    @ObfuscatedName("cv.bq(IIIIB)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field464; var4++) {
            if (field471[var4] + field469[var4] > arg0 && field469[var4] < arg0 + arg2 && field318[var4] + field312[var4] > arg1 && field312[var4] < arg1 + arg3) {
                field467[var4] = true;
            }
        }
    }

    @ObfuscatedName("ax.bz(B)V")
    public static final void method1000() {
        method493();
        if (Statics.field1257 != null || field434 != null) {
            return;
        }
        int var12;
        int var13;
        label229: {
            int var0 = class127.field2002;
            if (field403) {
                if (var0 != 1 && (Statics.field1982 || var0 != 4)) {
                    int var1 = class127.field2007;
                    int var2 = class127.field1997;
                    if (var1 < Statics.field1517 - 10 || var1 > Statics.field1670 + Statics.field1517 + 10 || var2 < Statics.field1044 - 10 || var2 > Statics.field546 + Statics.field1044 + 10) {
                        field403 = false;
                        method545(Statics.field1517, Statics.field1044, Statics.field1670, Statics.field546);
                    }
                }
                if (var0 == 1 || !Statics.field1982 && var0 == 4) {
                    int var3 = Statics.field1517;
                    int var4 = Statics.field1044;
                    int var5 = Statics.field1670;
                    int var6 = class127.field2003;
                    int var7 = class127.field2005;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field480; var9++) {
                        int var10 = (field480 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method1956(var8);
                    }
                    field403 = false;
                    method545(Statics.field1517, Statics.field1044, Statics.field1670, Statics.field546);
                }
            } else {
                if ((var0 == 1 || !Statics.field1982 && var0 == 4) && field480 > 0) {
                    int var11 = field441[field480 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field405[field480 - 1];
                        var13 = field406[field480 - 1];
                        class152 var14 = class152.method557(var13);
                        int var15 = Statics.method2421(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label229;
                        }
                        int var17 = Statics.method2421(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label229;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field1982 && var0 == 4) {
                    label236: {
                        if (field443 != 1 || field480 <= 2) {
                            int var22 = field480 - 1;
                            boolean var23;
                            if (var22 < 0) {
                                var23 = false;
                            } else {
                                int var24 = field441[var22];
                                if (var24 >= 2000) {
                                    var24 -= 2000;
                                }
                                if (var24 == 1007) {
                                    var23 = true;
                                } else {
                                    var23 = false;
                                }
                            }
                            if (!var23) {
                                break label236;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field1982 && var0 == 4) && field480 > 0) {
                    method1956(field480 - 1);
                }
                if (var0 == 2 && field480 > 0) {
                    method2419(class127.field2003, class127.field2005);
                }
            }
            return;
        }
        if (Statics.field1257 != null && !field377 && field443 != 1) {
            int var19 = field480 - 1;
            boolean var20;
            if (var19 < 0) {
                var20 = false;
            } else {
                int var21 = field441[var19];
                if (var21 >= 2000) {
                    var21 -= 2000;
                }
                if (var21 == 1007) {
                    var20 = true;
                } else {
                    var20 = false;
                }
            }
            if (!var20 && field480 > 0) {
                method787(field412, field375);
            }
        }
        field377 = false;
        field378 = 0;
        if (Statics.field1257 != null) {
            method2064(Statics.field1257);
        }
        Statics.field1257 = class152.method557(var13);
        field319 = var12;
        field412 = class127.field2003;
        field375 = class127.field2005;
        if (field480 > 0) {
            method1369(field480 - 1);
        }
        method2064(Statics.field1257);
    }

    @ObfuscatedName("di.bx(III)V")
    public static final void method2419(int arg0, int arg1) {
        int var2 = Statics.field1086.method3322(class142.field2358);
        for (int var3 = 0; var3 < field480; var3++) {
            int var4 = Statics.field1086.method3322(method1046(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field480 * 15 + 21;
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
        field403 = true;
        Statics.field1517 = var6;
        Statics.field1044 = var7;
        Statics.field1670 = var2;
        Statics.field546 = field480 * 15 + 22;
    }

    @ObfuscatedName("ca.bm(II)V")
    public static final void method1956(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field405[arg0];
        int var2 = field406[arg0];
        int var3 = field441[arg0];
        int var4 = field408[arg0];
        String var5 = field409[arg0];
        String var6 = field410[arg0];
        method8(var1, var2, var3, var4, var5, var6, class127.field2003, class127.field2005);
    }

    @ObfuscatedName("v.be(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 43) {
            field402.method2361(82);
            field402.method2137(arg1);
            field402.method2135(arg0);
            field402.method2135(arg3);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 17) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(31);
            field402.method2102(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field2743 + arg1);
            field402.method2135(Statics.field314 + arg0);
            field402.method2207(field418);
            field402.method2154(Statics.field822);
            field402.method2207(arg3);
        }
        if (arg2 == 1001) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(174);
            field402.method2207(Statics.field2743 + arg1);
            field402.method2153(arg3 >> 14 & 0x7FFF);
            field402.method2135(Statics.field314 + arg0);
            field402.method2102(class124.field1958[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class152 var8 = class152.method2392(arg1, arg0);
            if (var8 != null) {
                field402.method2361(154);
                field402.method2153(field419);
                field402.method2154(Statics.field822);
                field402.method2207(var8.field2625);
                field402.method2189(arg1);
                field402.method2135(arg0);
                field402.method2153(field418);
            }
        }
        if (arg2 == 1002) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field402.method2361(11);
            field402.method2223(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 19) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(85);
            field402.method2207(Statics.field2743 + arg1);
            field402.method2153(Statics.field314 + arg0);
            field402.method2153(arg3);
            field402.method2144(class124.field1958[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var9 = field380[arg3];
            if (var9 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(75);
                field402.method2135(field418);
                field402.method2154(Statics.field822);
                field402.method2102(class124.field1958[82] ? 1 : 0);
                field402.method2207(arg3);
            }
        }
        if (arg2 == 6) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(242);
            field402.method2153(arg3 >> 14 & 0x7FFF);
            field402.method2144(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field2743 + arg1);
            field402.method2135(Statics.field314 + arg0);
        }
        if (arg2 == 7) {
            class30 var10 = field298[arg3];
            if (var10 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(222);
                field402.method2144(class124.field1958[82] ? 1 : 0);
                field402.method2154(Statics.field1345);
                field402.method2223(arg3);
                field402.method2207(Statics.field803);
                field402.method2135(Statics.field482);
            }
        }
        if (arg2 == 11) {
            class30 var11 = field298[arg3];
            if (var11 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(56);
                field402.method2144(class124.field1958[82] ? 1 : 0);
                field402.method2135(arg3);
            }
        }
        if (arg2 == 38) {
            method13();
            class152 var12 = class152.method557(arg1);
            field430 = 1;
            Statics.field482 = arg0;
            Statics.field1345 = arg1;
            Statics.field803 = arg3;
            method2064(var12);
            field416 = class2.method2043(16748608) + class45.method28(arg3).field1000 + class2.method2043(16777215);
            if (field416 == null) {
                field416 = "null";
            }
            return;
        }
        if (arg2 == 28) {
            field402.method2361(156);
            field402.method2137(arg1);
            class152 var13 = class152.method557(arg1);
            if (var13.field2617 != null && var13.field2617[0][0] == 5) {
                int var14 = var13.field2617[0][1];
                class154.field2649[var14] = 1 - class154.field2649[var14];
                method11(var14);
            }
        }
        if (arg2 == 1) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(246);
            field402.method2153(Statics.field482);
            field402.method2113(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field314 + arg0);
            field402.method2135(Statics.field803);
            field402.method2189(Statics.field1345);
            field402.method2153(Statics.field2743 + arg1);
            field402.method2223(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 47) {
            class3 var15 = field380[arg3];
            if (var15 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(37);
                field402.method2197(class124.field1958[82] ? 1 : 0);
                field402.method2207(arg3);
            }
        }
        if (arg2 == 35) {
            field402.method2361(59);
            field402.method2153(arg3);
            field402.method2153(arg0);
            field402.method2281(arg1);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 16) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(54);
            field402.method2144(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field314 + arg0);
            field402.method2281(Statics.field1345);
            field402.method2223(Statics.field803);
            field402.method2207(Statics.field482);
            field402.method2223(arg3);
            field402.method2135(Statics.field2743 + arg1);
        }
        if (arg2 == 41) {
            field402.method2361(224);
            field402.method2207(arg3);
            field402.method2207(arg0);
            field402.method2281(arg1);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 4) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(129);
            field402.method2102(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field314 + arg0);
            field402.method2223(Statics.field2743 + arg1);
            field402.method2223(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 25) {
            class152 var16 = class152.method2392(arg1, arg0);
            if (var16 != null) {
                method13();
                int var17 = class156.method2110(Statics.method2421(var16));
                int var18 = var16.field2625;
                class152 var19 = class152.method2392(arg1, arg0);
                if (var19 != null && var19.field2599 != null) {
                    class1 var20 = new class1();
                    var20.field3 = var19;
                    var20.field12 = var19.field2599;
                    class32.method884(var20);
                }
                field419 = var18;
                field417 = true;
                Statics.field822 = arg1;
                field418 = arg0;
                Statics.field2029 = var17;
                method2064(var19);
                field430 = 0;
                field420 = method37(var16);
                if (field420 == null) {
                    field420 = "Null";
                }
                if (var16.field2520) {
                    field421 = var16.field2552 + class2.method2043(16777215);
                } else {
                    field421 = class2.method2043(65280) + var16.field2621 + class2.method2043(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field402.method2361(140);
            field402.method2135(Statics.field482);
            field402.method2135(Statics.field803);
            field402.method2189(Statics.field1345);
            field402.method2135(arg0);
            field402.method2189(arg1);
            field402.method2207(arg3);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 22) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(67);
            field402.method2207(arg3);
            field402.method2102(class124.field1958[82] ? 1 : 0);
            field402.method2207(Statics.field2743 + arg1);
            field402.method2153(Statics.field314 + arg0);
        }
        if (arg2 == 12) {
            class30 var21 = field298[arg3];
            if (var21 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(23);
                field402.method2153(arg3);
                field402.method2144(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var22 = field380[arg3];
            if (var22 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(239);
                field402.method2207(arg3);
                field402.method2113(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field402.method2361(192);
            field402.method2207(arg0);
            field402.method2153(arg3);
            field402.method2281(arg1);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 40) {
            field402.method2361(61);
            field402.method2153(arg0);
            field402.method2153(arg3);
            field402.method2154(arg1);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 33) {
            field402.method2361(200);
            field402.method2281(arg1);
            field402.method2223(arg0);
            field402.method2153(arg3);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 24) {
            class152 var23 = class152.method557(arg1);
            boolean var24 = true;
            if (var23.field2525 > 0) {
                var24 = method572(var23);
            }
            if (var24) {
                field402.method2361(156);
                field402.method2137(arg1);
            }
        }
        if (arg2 == 1003) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            class30 var25 = field298[arg3];
            if (var25 != null) {
                class35 var26 = var25.field695;
                if (var26.field818 != null) {
                    var26 = var26.method602();
                }
                if (var26 != null) {
                    field402.method2361(41);
                    field402.method2223(var26.field792);
                }
            }
        }
        if (arg2 == 42) {
            field402.method2361(79);
            field402.method2281(arg1);
            field402.method2135(arg0);
            field402.method2207(arg3);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 34) {
            field402.method2361(107);
            field402.method2223(arg3);
            field402.method2154(arg1);
            field402.method2207(arg0);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 29) {
            field402.method2361(156);
            field402.method2137(arg1);
            class152 var27 = class152.method557(arg1);
            if (var27.field2617 != null && var27.field2617[0][0] == 5) {
                int var28 = var27.field2617[0][1];
                if (class154.field2649[var28] != var27.field2564[0]) {
                    class154.field2649[var28] = var27.field2564[0];
                    method11(var28);
                }
            }
        }
        if (arg2 == 26) {
            field402.method2361(47);
            for (class4 var29 = (class4) field423.method3162(); var29 != null; var29 = (class4) field423.method3163()) {
                if (var29.field61 == 0 || var29.field61 == 3) {
                    Statics.method1398(var29, true);
                }
            }
            if (field449 != null) {
                method2064(field449);
                field449 = null;
            }
        }
        if (arg2 == 14) {
            class3 var30 = field380[arg3];
            if (var30 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(196);
                field402.method2223(Statics.field803);
                field402.method2207(Statics.field482);
                field402.method2281(Statics.field1345);
                field402.method2223(arg3);
                field402.method2113(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var31 = field380[arg3];
            if (var31 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(106);
                field402.method2153(arg3);
                field402.method2113(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field449 == null) {
            field402.method2361(204);
            field402.method2207(arg0);
            field402.method2189(arg1);
            field449 = class152.method2392(arg1, arg0);
            method2064(field449);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var32 = class152.method2392(arg1, arg0);
            if (var32 != null) {
                int var33 = var32.field2625;
                class152 var34 = class152.method2392(arg1, arg0);
                if (var34 != null) {
                    if (var34.field2576 != null) {
                        class1 var35 = new class1();
                        var35.field3 = var34;
                        var35.field9 = arg3;
                        var35.field1 = arg5;
                        var35.field12 = var34.field2576;
                        class32.method884(var35);
                    }
                    boolean var36 = true;
                    if (var34.field2525 > 0) {
                        var36 = method572(var34);
                    }
                    if (var36 && class156.method161(Statics.method2421(var34), arg3 - 1)) {
                        if (arg3 == 1) {
                            field402.method2361(137);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 2) {
                            field402.method2361(9);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 3) {
                            field402.method2361(157);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 4) {
                            field402.method2361(238);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 5) {
                            field402.method2361(158);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 6) {
                            field402.method2361(237);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 7) {
                            field402.method2361(93);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 8) {
                            field402.method2361(189);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 9) {
                            field402.method2361(236);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                        if (arg3 == 10) {
                            field402.method2361(166);
                            field402.method2137(arg1);
                            field402.method2223(arg0);
                            field402.method2223(var33);
                        }
                    }
                }
            }
        }
        if (arg2 == 13) {
            class30 var37 = field298[arg3];
            if (var37 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(208);
                field402.method2223(arg3);
                field402.method2102(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field402.method2361(98);
            field402.method2189(arg1);
            field402.method2207(field418);
            field402.method2154(Statics.field822);
            field402.method2135(arg3);
            field402.method2153(arg0);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 21) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(164);
            field402.method2144(class124.field1958[82] ? 1 : 0);
            field402.method2135(Statics.field314 + arg0);
            field402.method2135(arg3);
            field402.method2135(Statics.field2743 + arg1);
        }
        if (arg2 == 36) {
            field402.method2361(51);
            field402.method2189(arg1);
            field402.method2223(arg0);
            field402.method2223(arg3);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 1004) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field402.method2361(29);
            field402.method2207(arg3);
        }
        if (arg2 == 48) {
            class3 var38 = field380[arg3];
            if (var38 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(73);
                field402.method2113(class124.field1958[82] ? 1 : 0);
                field402.method2135(arg3);
            }
        }
        if (arg2 == 39) {
            field402.method2361(68);
            field402.method2223(arg3);
            field402.method2154(arg1);
            field402.method2223(arg0);
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 10) {
            class30 var39 = field298[arg3];
            if (var39 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(146);
                field402.method2144(class124.field1958[82] ? 1 : 0);
                field402.method2207(arg3);
            }
        }
        if (arg2 == 18) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(10);
            field402.method2135(Statics.field314 + arg0);
            field402.method2197(class124.field1958[82] ? 1 : 0);
            field402.method2153(Statics.field2743 + arg1);
            field402.method2223(arg3);
        }
        if (arg2 == 50) {
            class3 var40 = field380[arg3];
            if (var40 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(111);
                field402.method2113(class124.field1958[82] ? 1 : 0);
                field402.method2153(arg3);
            }
        }
        if (arg2 == 2) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(2);
            field402.method2154(Statics.field822);
            field402.method2113(class124.field1958[82] ? 1 : 0);
            field402.method2223(Statics.field2743 + arg1);
            field402.method2135(arg3 >> 14 & 0x7FFF);
            field402.method2153(field418);
            field402.method2207(Statics.field314 + arg0);
        }
        if (arg2 == 23) {
            Statics.field66.method1721(Statics.field2401, arg0, arg1);
        }
        if (arg2 == 45) {
            class3 var41 = field380[arg3];
            if (var41 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(160);
                field402.method2135(arg3);
                field402.method2197(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class152 var42 = class152.method557(arg1);
            if (var42 == null || var42.field2551[arg0] < 100000) {
                field402.method2361(29);
                field402.method2207(arg3);
            } else {
                class10.method2658(27, "", var42.field2551[arg0] + " x " + class45.method28(arg3).field1000);
            }
            field371 = 0;
            Statics.field988 = class152.method557(arg1);
            field372 = arg0;
        }
        if (arg2 == 44) {
            class3 var43 = field380[arg3];
            if (var43 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(131);
                field402.method2223(arg3);
                field402.method2144(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(64);
            field402.method2207(Statics.field314 + arg0);
            field402.method2144(class124.field1958[82] ? 1 : 0);
            field402.method2153(Statics.field2743 + arg1);
            field402.method2223(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class30 var44 = field298[arg3];
            if (var44 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(228);
                field402.method2135(arg3);
                field402.method2197(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(197);
            field402.method2223(Statics.field2743 + arg1);
            field402.method2223(Statics.field314 + arg0);
            field402.method2223(arg3 >> 14 & 0x7FFF);
            field402.method2144(class124.field1958[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class30 var45 = field298[arg3];
            if (var45 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(101);
                field402.method2113(class124.field1958[82] ? 1 : 0);
                field402.method2207(field418);
                field402.method2223(arg3);
                field402.method2154(Statics.field822);
            }
        }
        if (arg2 == 46) {
            class3 var46 = field380[arg3];
            if (var46 != null) {
                field367 = arg6;
                field368 = arg7;
                field370 = 2;
                field307 = 0;
                field490 = arg0;
                field491 = arg1;
                field402.method2361(112);
                field402.method2135(arg3);
                field402.method2102(class124.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field367 = arg6;
            field368 = arg7;
            field370 = 2;
            field307 = 0;
            field490 = arg0;
            field491 = arg1;
            field402.method2361(43);
            field402.method2223(Statics.field314 + arg0);
            field402.method2102(class124.field1958[82] ? 1 : 0);
            field402.method2153(Statics.field2743 + arg1);
            field402.method2135(arg3);
        }
        if (field430 != 0) {
            field430 = 0;
            method2064(class152.method557(Statics.field1345));
        }
        if (field417) {
            method13();
        }
        if (Statics.field988 != null && field371 == 0) {
            method2064(Statics.field988);
        }
    }

    @ObfuscatedName("v.bi(B)V")
    public static void method13() {
        if (!field417) {
            return;
        }
        class152 var0 = class152.method2392(Statics.field822, field418);
        if (var0 != null && var0.field2600 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2600;
            class32.method884(var1);
        }
        field417 = false;
        method2064(var0);
    }

    @ObfuscatedName("t.ba(I)V")
    public static final void method493() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field480 - 1; var1++) {
                if (field441[var1] < 1000 && field441[var1 + 1] > 1000) {
                    String var2 = field410[var1];
                    field410[var1] = field410[var1 + 1];
                    field410[var1 + 1] = var2;
                    String var3 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var3;
                    int var4 = field441[var1];
                    field441[var1] = field441[var1 + 1];
                    field441[var1 + 1] = var4;
                    int var5 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var5;
                    int var6 = field406[var1];
                    field406[var1] = field406[var1 + 1];
                    field406[var1 + 1] = var6;
                    int var7 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("j.bj(I)V")
    public static void method162() {
        for (int var0 = 0; var0 < field480; var0++) {
            if (method574(field441[var0])) {
                if (var0 < field480 - 1) {
                    for (int var1 = var0; var1 < field480 - 1; var1++) {
                        field409[var1] = field409[var1 + 1];
                        field410[var1] = field410[var1 + 1];
                        field441[var1] = field441[var1 + 1];
                        field408[var1] = field408[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field406[var1] = field406[var1 + 1];
                    }
                }
                field480--;
            }
        }
    }

    @ObfuscatedName("ag.bt(IB)Z")
    public static boolean method574(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bc.bu(II)Ljava/lang/String;")
    public static String method1046(int arg0) {
        return field410[arg0].length() > 0 ? field409[arg0] + class142.field2294 + field410[arg0] : field409[arg0];
    }

    @ObfuscatedName("an.cj(IIIIB)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3) {
        if (field430 == 0 && !field417) {
            Statics.method779(class142.field2235, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1692; var5++) {
            int var6 = class98.field1714[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field66.method1638(Statics.field2401, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method12(var10);
                    if (var11.field873 != null) {
                        var11 = var11.method634();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field430 == 1) {
                        Statics.method779(class142.field2284, field416 + " " + class2.field21 + " " + class2.method2043(65535) + var11.field869, 1, var6, var7, var8);
                    } else if (!field417) {
                        String[] var12 = var11.field866;
                        if (field494) {
                            var12 = method1769(var12);
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
                                    Statics.method779(var12[var13], class2.method2043(65535) + var11.field869, var14, var6, var7, var8);
                                }
                            }
                        }
                        Statics.method779(class142.field2377, class2.method2043(65535) + var11.field869, 1002, var11.field863 << 14, var7, var8);
                    } else if ((Statics.field2029 & 0x4) == 4) {
                        Statics.method779(field420, field421 + " " + class2.field21 + " " + class2.method2043(65535) + var11.field869, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field298[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field695.field794 == 1 && (var15.field775 & 0x7F) == 64 && (var15.field720 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field351; var16++) {
                            class30 var17 = field298[field300[var16]];
                            if (var17 != null && var15 != var17 && var17.field695.field794 == 1 && var15.field775 == var17.field775 && var15.field720 == var17.field720) {
                                method2464(var17.field695, field300[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field483; var18++) {
                            class3 var19 = field380[field382[var18]];
                            if (var19 != null && var15.field775 == var19.field775 && var15.field720 == var19.field720) {
                                method3(var19, field382[var18], var7, var8);
                            }
                        }
                    }
                    method2464(var15.field695, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field380[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field775 & 0x7F) == 64 && (var20.field720 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field351; var21++) {
                            class30 var22 = field298[field300[var21]];
                            if (var22 != null && var22.field695.field794 == 1 && var20.field775 == var22.field775 && var20.field720 == var22.field720) {
                                method2464(var22.field695, field300[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field483; var23++) {
                            class3 var24 = field380[field382[var23]];
                            if (var24 != null && var20 != var24 && var20.field775 == var24.field775 && var20.field720 == var24.field720) {
                                method3(var24, field382[var23], var7, var8);
                            }
                        }
                    }
                    method3(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field395[Statics.field2401][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3190(); var26 != null; var26 = (class25) var25.method3193()) {
                            class45 var27 = class45.method28(var26.field623);
                            if (field430 == 1) {
                                Statics.method779(class142.field2284, field416 + " " + class2.field21 + " " + class2.method2043(16748608) + var27.field1000, 16, var26.field623, var7, var8);
                            } else if (!field417) {
                                String[] var28 = var27.field1014;
                                if (field494) {
                                    var28 = method1769(var28);
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
                                        Statics.method779(var28[var29], class2.method2043(16748608) + var27.field1000, var30, var26.field623, var7, var8);
                                    } else if (var29 == 2) {
                                        Statics.method779(class142.field2135, class2.method2043(16748608) + var27.field1000, 20, var26.field623, var7, var8);
                                    }
                                }
                                Statics.method779(class142.field2377, class2.method2043(16748608) + var27.field1000, 1004, var26.field623, var7, var8);
                            } else if ((Statics.field2029 & 0x1) == 1) {
                                Statics.method779(field420, field421 + " " + class2.field21 + " " + class2.method2043(16748608) + var27.field1000, 17, var26.field623, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.cn(Lan;IIII)V")
    public static final void method2464(class35 arg0, int arg1, int arg2, int arg3) {
        if (field480 >= 400) {
            return;
        }
        if (arg0.field818 != null) {
            arg0 = arg0.method602();
        }
        if (arg0 == null || !arg0.field795 || arg0.field823 && field444 != arg1) {
            return;
        }
        String var4 = arg0.field811;
        if (arg0.field810 != 0) {
            var4 = var4 + method32(arg0.field810, Statics.field183.field37) + " " + class2.field19 + class142.field2283 + arg0.field810 + class2.field31;
        }
        if (field430 == 1) {
            Statics.method779(class142.field2284, field416 + " " + class2.field21 + " " + class2.method2043(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field417) {
            String[] var5 = arg0.field804;
            if (field494) {
                var5 = method1769(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2327)) {
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
                        Statics.method779(var5[var6], class2.method2043(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2327)) {
                        short var9 = 0;
                        if (field288 == class18.field527 || field288 == class18.field528 && arg0.field810 > Statics.field183.field37) {
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
                        Statics.method779(var5[var8], class2.method2043(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            Statics.method779(class142.field2377, class2.method2043(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2029 & 0x2) == 2) {
            Statics.method779(field420, field421 + " " + class2.field21 + " " + class2.method2043(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.cb(Li;IIII)V")
    public static final void method3(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field183 == arg0 || field480 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field44 + method32(arg0.field37, Statics.field183.field37) + " " + class2.field19 + class142.field2283 + arg0.field37 + class2.field31;
        } else {
            var4 = arg0.field44 + " " + class2.field19 + class142.field2291 + arg0.field38 + class2.field31;
        }
        if (field430 == 1) {
            Statics.method779(class142.field2284, field416 + " " + class2.field21 + " " + class2.method2043(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field417) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field391[var5] != null) {
                    short var6 = 0;
                    if (field391[var5].equalsIgnoreCase(class142.field2327)) {
                        if (field288 == class18.field527 || field288 == class18.field528 && arg0.field37 > Statics.field183.field37) {
                            var6 = 2000;
                        }
                        if (Statics.field183.field58 != 0 && arg0.field58 != 0) {
                            if (Statics.field183.field58 == arg0.field58) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field392[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field390[var5] + var6;
                    Statics.method779(field391[var5], class2.method2043(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2029 & 0x8) == 8) {
            Statics.method779(field420, field421 + " " + class2.field21 + " " + class2.method2043(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field480; var9++) {
            if (field441[var9] == 23) {
                field410[var9] = class2.method2043(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("g.cf(III)Ljava/lang/String;")
    public static final String method32(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2043(16711680);
        } else if (var2 < -6) {
            return class2.method2043(16723968);
        } else if (var2 < -3) {
            return class2.method2043(16740352);
        } else if (var2 < 0) {
            return class2.method2043(16756736);
        } else if (var2 > 9) {
            return class2.method2043(65280);
        } else if (var2 > 6) {
            return class2.method2043(4259584);
        } else if (var2 > 3) {
            return class2.method2043(8453888);
        } else if (var2 > 0) {
            return class2.method2043(12648192);
        } else {
            return class2.method2043(16776960);
        }
    }

    @ObfuscatedName("q.cu(IIIIIIIII)V")
    public static final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method692(arg0)) {
            Statics.field2124 = null;
            method1001(Statics.field2582[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2124 != null) {
                method1001(Statics.field2124, -1412584499, arg1, arg2, arg3, arg4, Statics.field1877, Statics.field2382, arg7);
                Statics.field2124 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field485[var8] = true;
            }
        } else {
            field485[arg7] = true;
        }
    }

    @ObfuscatedName("ax.cq([Lex;IIIIIIIII)V")
    public static final void method1001(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1535(arg2, arg3, arg4, arg5);
        class84.method1826();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2532 == arg1 || arg1 == -1412584499 && field434 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field469[field464] = var10.field2526 + arg6;
                    field312[field464] = var10.field2527 + arg7;
                    field471[field464] = var10.field2530;
                    field318[field464] = var10.field2531;
                    var11 = ++field464 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2636 = var11;
                var10.field2613 = field442;
                if (!var10.field2520 || !method158(var10)) {
                    if (var10.field2525 > 0) {
                        method152(var10);
                    }
                    int var12 = var10.field2526 + arg6;
                    int var13 = var10.field2527 + arg7;
                    int var14 = var10.field2543;
                    if (field434 == var10) {
                        if (arg1 != -1412584499 && !var10.field2586) {
                            Statics.field2124 = arg0;
                            Statics.field1877 = arg6;
                            Statics.field2382 = arg7;
                            continue;
                        }
                        if (field445 && field404) {
                            int var15 = class127.field2007;
                            int var16 = class127.field1997;
                            int var17 = var15 - field324;
                            int var18 = var16 - field437;
                            if (var17 < field440) {
                                var17 = field440;
                            }
                            if (var10.field2530 + var17 > field440 + field435.field2530) {
                                var17 = field440 + field435.field2530 - var10.field2530;
                            }
                            if (var18 < field439) {
                                var18 = field439;
                            }
                            if (var10.field2531 + var18 > field439 + field435.field2531) {
                                var18 = field439 + field435.field2531 - var10.field2531;
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
                    if (var10.field2593 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2593 == 9) {
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
                                field411 = var12;
                                field399 = var13;
                                method2664(var12, var13, var10.field2530, var10.field2531);
                                class73.method1535(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2525 == 1338) {
                                method1775();
                                class73.method1535(var12, var13, Statics.field28.field1317 + var12, Statics.field28.field1319 + var13);
                                if (field492 == 2 || field492 == 5) {
                                    class73.method1524(var12 + 25, var13 + 5, 0, Statics.field1985, Statics.field1288);
                                } else {
                                    int var31 = field345 + field332 & 0x7FF;
                                    int var32 = Statics.field183.field775 / 32 + 48;
                                    int var33 = 464 - Statics.field183.field720 / 32;
                                    Statics.field1030.method1431(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field334 + 256, Statics.field1985, Statics.field1288);
                                    for (int var34 = 0; var34 < field486; var34++) {
                                        int var35 = field472[var34] * 4 + 2 - Statics.field183.field775 / 32;
                                        int var36 = field272[var34] * 4 + 2 - Statics.field183.field720 / 32;
                                        method98(var12, var13, var35, var36, field489[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field395[Statics.field2401][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field183.field775 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field183.field720 / 32;
                                                method98(var12, var13, var40, var41, Statics.field2116[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field351; var42++) {
                                        class30 var43 = field298[field300[var42]];
                                        if (var43 != null && var43.method18()) {
                                            class35 var44 = var43.field695;
                                            if (var44 != null && var44.field818 != null) {
                                                var44 = var44.method602();
                                            }
                                            if (var44 != null && var44.field809 && var44.field795) {
                                                int var45 = var43.field775 / 32 - Statics.field183.field775 / 32;
                                                int var46 = var43.field720 / 32 - Statics.field183.field720 / 32;
                                                method98(var12, var13, var45, var46, Statics.field2116[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field483; var47++) {
                                        class3 var48 = field380[field382[var47]];
                                        if (var48 != null && var48.method18() && !var48.field52) {
                                            int var49 = var48.field775 / 32 - Statics.field183.field775 / 32;
                                            int var50 = var48.field720 / 32 - Statics.field183.field720 / 32;
                                            boolean var51 = false;
                                            if (method2690(var48.field44, true)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field1106; var53++) {
                                                if (var48.field44.equals(Statics.field1082[var53].field569)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field183.field58 != 0 && var48.field58 != 0 && Statics.field183.field58 == var48.field58) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method98(var12, var13, var49, var50, Statics.field2116[3]);
                                            } else if (var54) {
                                                method98(var12, var13, var49, var50, Statics.field2116[4]);
                                            } else if (var52) {
                                                method98(var12, var13, var49, var50, Statics.field2116[5]);
                                            } else {
                                                method98(var12, var13, var49, var50, Statics.field2116[2]);
                                            }
                                        }
                                    }
                                    if (field279 != 0 && field442 % 20 < 10) {
                                        if (field279 == 1 && field280 >= 0 && field280 < field298.length) {
                                            class30 var55 = field298[field280];
                                            if (var55 != null) {
                                                int var56 = var55.field775 / 32 - Statics.field183.field775 / 32;
                                                int var57 = var55.field720 / 32 - Statics.field183.field720 / 32;
                                                method491(var12, var13, var56, var57, Statics.field1659[1]);
                                            }
                                        }
                                        if (field279 == 2) {
                                            int var58 = field478 * 4 - Statics.field314 * 4 + 2 - Statics.field183.field775 / 32;
                                            int var59 = field283 * 4 - Statics.field2743 * 4 + 2 - Statics.field183.field720 / 32;
                                            method491(var12, var13, var58, var59, Statics.field1659[1]);
                                        }
                                        if (field279 == 10 && field515 >= 0 && field515 < field380.length) {
                                            class3 var60 = field380[field515];
                                            if (var60 != null) {
                                                int var61 = var60.field775 / 32 - Statics.field183.field775 / 32;
                                                int var62 = var60.field720 / 32 - Statics.field183.field720 / 32;
                                                method491(var12, var13, var61, var62, Statics.field1659[1]);
                                            }
                                        }
                                    }
                                    if (field490 != 0) {
                                        int var63 = field490 * 4 + 2 - Statics.field183.field775 / 32;
                                        int var64 = field491 * 4 + 2 - Statics.field183.field720 / 32;
                                        method98(var12, var13, var63, var64, Statics.field1659[0]);
                                    }
                                    if (!Statics.field183.field52) {
                                        class73.method1515(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field492 < 3) {
                                    Statics.field182.method1431(var12, var13, 33, 33, 25, 25, field345, 256, Statics.field136, Statics.field1531);
                                } else {
                                    class73.method1524(var12, var13, 0, Statics.field136, Statics.field1531);
                                }
                                if (field353[var11]) {
                                    Statics.field28.method1583(var12, var13);
                                }
                                field467[var11] = true;
                                class73.method1535(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2593 == 0) {
                            if (!var10.field2520 && method158(var10) && Statics.field535 != var10) {
                                continue;
                            }
                            if (!var10.field2520) {
                                if (var10.field2535 > var10.field2537 - var10.field2531) {
                                    var10.field2535 = var10.field2537 - var10.field2531;
                                }
                                if (var10.field2535 < 0) {
                                    var10.field2535 = 0;
                                }
                            }
                            method1001(arg0, var10.field2626, var19, var20, var21, var22, var12 - var10.field2534, var13 - var10.field2535, var11);
                            if (var10.field2547 != null) {
                                method1001(var10.field2547, var10.field2626, var19, var20, var21, var22, var12 - var10.field2534, var13 - var10.field2535, var11);
                            }
                            class4 var65 = (class4) field423.method3171((long) var10.field2626);
                            if (var65 != null) {
                                method81(var65.field63, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1535(arg2, arg3, arg4, arg5);
                            class84.method1826();
                        }
                        if (field353[var11] || field473 > 1) {
                            if (var10.field2593 == 0 && !var10.field2520 && var10.field2537 > var10.field2531) {
                                method878(var10.field2530 + var12, var13, var10.field2535, var10.field2531, var10.field2537);
                            }
                            if (var10.field2593 != 1) {
                                if (var10.field2593 == 2) {
                                    int var66 = 0;
                                    for (int var67 = 0; var67 < var10.field2531; var67++) {
                                        for (int var68 = 0; var68 < var10.field2530; var68++) {
                                            int var69 = (var10.field2574 + 32) * var68 + var12;
                                            int var70 = (var10.field2587 + 32) * var67 + var13;
                                            if (var66 < 20) {
                                                var69 += var10.field2518[var66];
                                                var70 += var10.field2511[var66];
                                            }
                                            if (var10.field2577[var66] > 0) {
                                                boolean var71 = false;
                                                boolean var72 = false;
                                                int var73 = var10.field2577[var66] - 1;
                                                if (var69 + 32 > arg2 && var69 < arg4 && var70 + 32 > arg3 && var70 < arg5 || Statics.field1257 == var10 && field319 == var66) {
                                                    class72 var74;
                                                    if (field430 == 1 && Statics.field482 == var66 && Statics.field1345 == var10.field2626) {
                                                        var74 = class45.method564(var73, var10.field2551[var66], 2, 0, false);
                                                    } else {
                                                        var74 = class45.method564(var73, var10.field2551[var66], 1, 3153952, false);
                                                    }
                                                    if (var74 == null) {
                                                        method2064(var10);
                                                    } else if (Statics.field1257 == var10 && field319 == var66) {
                                                        int var75 = class127.field2007 - field412;
                                                        int var76 = class127.field1997 - field375;
                                                        if (var75 < 5 && var75 > -5) {
                                                            var75 = 0;
                                                        }
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (field378 < 5) {
                                                            var75 = 0;
                                                            var76 = 0;
                                                        }
                                                        var74.method1427(var69 + var75, var70 + var76, 128);
                                                        if (arg1 != -1) {
                                                            class152 var77 = arg0[arg1 & 0xFFFF];
                                                            if (var70 + var76 < class73.field1312 && var77.field2535 > 0) {
                                                                int var78 = field266 * (class73.field1312 - var70 - var76) / 3;
                                                                if (var78 > field266 * 10) {
                                                                    var78 = field266 * 10;
                                                                }
                                                                if (var78 > var77.field2535) {
                                                                    var78 = var77.field2535;
                                                                }
                                                                var77.field2535 -= var78;
                                                                field375 += var78;
                                                                method2064(var77);
                                                            }
                                                            if (var70 + var76 + 32 > class73.field1314 && var77.field2535 < var77.field2537 - var77.field2531) {
                                                                int var79 = field266 * (var70 + var76 + 32 - class73.field1314) / 3;
                                                                if (var79 > field266 * 10) {
                                                                    var79 = field266 * 10;
                                                                }
                                                                if (var79 > var77.field2537 - var77.field2531 - var77.field2535) {
                                                                    var79 = var77.field2537 - var77.field2531 - var77.field2535;
                                                                }
                                                                var77.field2535 += var79;
                                                                field375 -= var79;
                                                                method2064(var77);
                                                            }
                                                        }
                                                    } else if (Statics.field988 == var10 && field372 == var66) {
                                                        var74.method1427(var69, var70, 128);
                                                    } else {
                                                        var74.method1429(var69, var70);
                                                    }
                                                }
                                            } else if (var10.field2578 != null && var66 < 20) {
                                                class72 var80 = var10.method2831(var66);
                                                if (var80 != null) {
                                                    var80.method1429(var69, var70);
                                                } else if (class152.field2563) {
                                                    method2064(var10);
                                                }
                                            }
                                            var66++;
                                        }
                                    }
                                } else if (var10.field2593 == 3) {
                                    int var81;
                                    if (method2873(var10)) {
                                        var81 = var10.field2521;
                                        if (Statics.field535 == var10 && var10.field2541 != 0) {
                                            var81 = var10.field2541;
                                        }
                                    } else {
                                        var81 = var10.field2538;
                                        if (Statics.field535 == var10 && var10.field2619 != 0) {
                                            var81 = var10.field2619;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2542) {
                                            class73.method1515(var12, var13, var10.field2530, var10.field2531, var81);
                                        } else {
                                            class73.method1517(var12, var13, var10.field2530, var10.field2531, var81);
                                        }
                                    } else if (var10.field2542) {
                                        class73.method1565(var12, var13, var10.field2530, var10.field2531, var81, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1518(var12, var13, var10.field2530, var10.field2531, var81, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2593 == 4) {
                                    class193 var82 = var10.method2830();
                                    if (var82 != null) {
                                        String var83 = var10.field2568;
                                        int var84;
                                        if (method2873(var10)) {
                                            var84 = var10.field2521;
                                            if (Statics.field535 == var10 && var10.field2541 != 0) {
                                                var84 = var10.field2541;
                                            }
                                            if (var10.field2569.length() > 0) {
                                                var83 = var10.field2569;
                                            }
                                        } else {
                                            var84 = var10.field2538;
                                            if (Statics.field535 == var10 && var10.field2619 != 0) {
                                                var84 = var10.field2619;
                                            }
                                        }
                                        if (var10.field2520 && var10.field2625 != -1) {
                                            class45 var85 = class45.method28(var10.field2625);
                                            var83 = var85.field1000;
                                            if (var83 == null) {
                                                var83 = "null";
                                            }
                                            if ((var85.field1011 == 1 || var10.field2616 != 1) && var10.field2616 != -1) {
                                                var83 = class2.method2043(16748608) + var83 + class2.field23 + " " + 'x' + method36(var10.field2616);
                                            }
                                        }
                                        if (field449 == var10) {
                                            class142 var10000 = (class142) null;
                                            var83 = class142.field2292;
                                            var84 = var10.field2538;
                                        }
                                        if (!var10.field2520) {
                                            var83 = method3287(var83, var10);
                                        }
                                        var82.method3311(var83, var12, var13, var10.field2530, var10.field2531, var84, var10.field2573 ? 0 : -1, var10.field2571, var10.field2624, var10.field2570);
                                    } else if (class152.field2563) {
                                        method2064(var10);
                                    }
                                } else if (var10.field2593 == 5) {
                                    if (var10.field2520) {
                                        class72 var87;
                                        if (var10.field2625 == -1) {
                                            var87 = var10.method2829(false);
                                        } else {
                                            var87 = class45.method564(var10.field2625, var10.field2616, var10.field2606, var10.field2550, false);
                                        }
                                        if (var87 != null) {
                                            int var88 = var87.field1303;
                                            int var89 = var87.field1309;
                                            if (var10.field2548) {
                                                class73.method1568(var12, var13, var10.field2530 + var12, var10.field2531 + var13);
                                                int var90 = (var10.field2530 + (var88 - 1)) / var88;
                                                int var91 = (var10.field2531 + (var89 - 1)) / var89;
                                                for (int var92 = 0; var92 < var90; var92++) {
                                                    for (int var93 = 0; var93 < var91; var93++) {
                                                        if (var10.field2607 != 0) {
                                                            var87.method1453(var88 / 2 + var88 * var92 + var12, var89 / 2 + var89 * var93 + var13, var10.field2607, 4096);
                                                        } else if (var14 == 0) {
                                                            var87.method1429(var88 * var92 + var12, var89 * var93 + var13);
                                                        } else {
                                                            var87.method1427(var88 * var92 + var12, var89 * var93 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1535(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var94 = var10.field2530 * 4096 / var88;
                                                if (var10.field2607 != 0) {
                                                    var87.method1453(var10.field2530 / 2 + var12, var10.field2531 / 2 + var13, var10.field2607, var94);
                                                } else if (var14 != 0) {
                                                    var87.method1502(var12, var13, var10.field2530, var10.field2531, 256 - (var14 & 0xFF));
                                                } else if (var10.field2530 == var88 && var10.field2531 == var89) {
                                                    var87.method1429(var12, var13);
                                                } else {
                                                    var87.method1423(var12, var13, var10.field2530, var10.field2531);
                                                }
                                            }
                                        } else if (class152.field2563) {
                                            method2064(var10);
                                        }
                                    } else {
                                        class72 var86 = var10.method2829(method2873(var10));
                                        if (var86 != null) {
                                            var86.method1429(var12, var13);
                                        } else if (class152.field2563) {
                                            method2064(var10);
                                        }
                                    }
                                } else if (var10.field2593 == 6) {
                                    boolean var95 = method2873(var10);
                                    int var96;
                                    if (var95) {
                                        var96 = var10.field2628;
                                    } else {
                                        var96 = var10.field2605;
                                    }
                                    class98 var97 = null;
                                    int var98 = 0;
                                    if (var10.field2625 != -1) {
                                        class45 var99 = class45.method28(var10.field2625);
                                        if (var99 != null) {
                                            class45 var100 = var99.method828(var10.field2616);
                                            var97 = var100.method846(1);
                                            if (var97 == null) {
                                                method2064(var10);
                                            } else {
                                                var97.method1969();
                                                var98 = var97.field1349 / 2;
                                            }
                                        }
                                    } else if (var10.field2529 == 5) {
                                        if (var10.field2554 == 0) {
                                            var97 = field468.method2905((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var97 = Statics.field183.method17();
                                        }
                                    } else if (var96 == -1) {
                                        var97 = var10.method2832((class38) null, -1, var95, Statics.field183.field41);
                                        if (var97 == null && class152.field2563) {
                                            method2064(var10);
                                        }
                                    } else {
                                        class38 var101 = class38.method730(var96);
                                        var97 = var10.method2832(var101, var10.field2627, var95, Statics.field183.field41);
                                        if (var97 == null && class152.field2563) {
                                            method2064(var10);
                                        }
                                    }
                                    class84.method1780(var10.field2530 / 2 + var12, var10.field2531 / 2 + var13);
                                    int var102 = var10.field2572 * class84.field1480[var10.field2561] >> 16;
                                    int var103 = var10.field2572 * class84.field1464[var10.field2561] >> 16;
                                    if (var97 != null) {
                                        if (var10.field2520) {
                                            var97.method1969();
                                            if (var10.field2566) {
                                                var97.method2007(0, var10.field2562, var10.field2540, var10.field2561, var10.field2559, var10.field2560 + var98 + var102, var10.field2560 + var103, var10.field2572);
                                            } else {
                                                var97.method2034(0, var10.field2562, var10.field2540, var10.field2561, var10.field2559, var10.field2560 + var98 + var102, var10.field2560 + var103);
                                            }
                                        } else {
                                            var97.method2034(0, var10.field2562, 0, var10.field2561, 0, var102, var103);
                                        }
                                    }
                                    class84.method1815();
                                } else {
                                    if (var10.field2593 == 7) {
                                        class193 var104 = var10.method2830();
                                        if (var104 == null) {
                                            if (class152.field2563) {
                                                method2064(var10);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var10.field2531; var106++) {
                                            for (int var107 = 0; var107 < var10.field2530; var107++) {
                                                if (var10.field2577[var105] > 0) {
                                                    class45 var108 = class45.method28(var10.field2577[var105] - 1);
                                                    String var109;
                                                    if (var108.field1011 != 1 && var10.field2551[var105] == 1) {
                                                        var109 = class2.method2043(16748608) + var108.field1000 + class2.field23;
                                                    } else {
                                                        var109 = class2.method2043(16748608) + var108.field1000 + class2.field23 + " " + 'x' + method36(var10.field2551[var105]);
                                                    }
                                                    int var110 = (var10.field2574 + 115) * var107 + var12;
                                                    int var111 = (var10.field2587 + 12) * var106 + var13;
                                                    if (var10.field2571 == 0) {
                                                        var104.method3308(var109, var110, var111, var10.field2538, var10.field2573 ? 0 : -1);
                                                    } else if (var10.field2571 == 1) {
                                                        var104.method3333(var109, var10.field2530 / 2 + var110, var111, var10.field2538, var10.field2573 ? 0 : -1);
                                                    } else {
                                                        var104.method3330(var109, var10.field2530 + var110 - 1, var111, var10.field2538, var10.field2573 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var10.field2593 == 8 && Statics.field520 == var10 && field414 == field413) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class193 var114 = Statics.field959;
                                        String var115 = var10.field2568;
                                        String var116 = method3287(var115, var10);
                                        while (var116.length() > 0) {
                                            int var117 = var116.indexOf(class2.field22);
                                            String var118;
                                            if (var117 == -1) {
                                                var118 = var116;
                                                var116 = "";
                                            } else {
                                                var118 = var116.substring(0, var117);
                                                var116 = var116.substring(var117 + 4);
                                            }
                                            int var119 = var114.method3322(var118);
                                            if (var119 > var112) {
                                                var112 = var119;
                                            }
                                            var113 += var114.field2901 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var120 = var10.field2530 + var12 - 5 - var112;
                                        int var121 = var10.field2531 + var13 + 5;
                                        if (var120 < var12 + 5) {
                                            var120 = var12 + 5;
                                        }
                                        if (var112 + var120 > arg4) {
                                            var120 = arg4 - var112;
                                        }
                                        if (var113 + var121 > arg5) {
                                            var121 = arg5 - var113;
                                        }
                                        class73.method1515(var120, var121, var112, var113, 16777120);
                                        class73.method1517(var120, var121, var112, var113, 0);
                                        String var122 = var10.field2568;
                                        int var123 = var114.field2901 + var121 + 2;
                                        String var124 = method3287(var122, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field22);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            var114.method3308(var126, var120 + 3, var123, 0, -1);
                                            var123 += var114.field2901 + 1;
                                        }
                                    }
                                    if (var10.field2593 == 9) {
                                        if (var10.field2544 == 1) {
                                            class73.method1523(var12, var13, var10.field2530 + var12, var10.field2531 + var13, var10.field2538);
                                        } else {
                                            int var127 = var10.field2530 >= 0 ? var10.field2530 : -var10.field2530;
                                            int var128 = var10.field2531 >= 0 ? var10.field2531 : -var10.field2531;
                                            int var129 = var127;
                                            if (var127 < var128) {
                                                var129 = var128;
                                            }
                                            if (var129 != 0) {
                                                int var130 = (var10.field2530 << 16) / var129;
                                                int var131 = (var10.field2531 << 16) / var129;
                                                if (var131 <= var130) {
                                                    var130 = -var130;
                                                } else {
                                                    var131 = -var131;
                                                }
                                                int var132 = var10.field2544 * var131 >> 17;
                                                int var133 = var10.field2544 * var131 + 1 >> 17;
                                                int var134 = var10.field2544 * var130 >> 17;
                                                int var135 = var10.field2544 * var130 + 1 >> 17;
                                                int var136 = var12 + var132;
                                                int var137 = var12 - var133;
                                                int var138 = var10.field2530 + var12 - var133;
                                                int var139 = var10.field2530 + var12 + var132;
                                                int var140 = var13 + var134;
                                                int var141 = var13 - var135;
                                                int var142 = var10.field2531 + var13 - var135;
                                                int var143 = var10.field2531 + var13 + var134;
                                                class84.method1785(var136, var137, var138);
                                                class84.method1792(var140, var141, var142, var136, var137, var138, var10.field2538);
                                                class84.method1785(var136, var138, var139);
                                                class84.method1792(var140, var142, var143, var136, var138, var139, var10.field2538);
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

    @ObfuscatedName("gn.cp(Ljava/lang/String;Lex;B)Ljava/lang/String;")
    public static String method3287(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method29(method487(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field135 != null) {
                    var5 = class199.method2668(Statics.field135.field2065);
                    if (Statics.field135.field2060 != null) {
                        var5 = (String) Statics.field135.field2060;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("x.ch(II)Ljava/lang/String;")
    public static final String method36(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field29 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2043(65408) + var1.substring(0, var1.length() - 8) + class142.field2289 + " " + class2.field19 + var1 + class2.field31 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method2043(16777215) + var1.substring(0, var1.length() - 4) + class142.field2297 + " " + class2.field19 + var1 + class2.field31 + class2.field23;
        } else {
            return " " + class2.method2043(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("ad.ck(IIIIII)V")
    public static final void method878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2646[0].method1583(arg0, arg1);
        Statics.field2646[1].method1583(arg0, arg1 + arg3 - 16);
        class73.method1515(arg0, arg1 + 16, 16, arg3 - 32, field278);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1515(arg0, arg1 + 16 + var6, 16, var5, field339);
        class73.method1521(arg0, arg1 + 16 + var6, var5, field341);
        class73.method1521(arg0 + 1, arg1 + 16 + var6, var5, field341);
        class73.method1525(arg0, arg1 + 16 + var6, 16, field341);
        class73.method1525(arg0, arg1 + 17 + var6, 16, field341);
        class73.method1521(arg0 + 15, arg1 + 16 + var6, var5, field340);
        class73.method1521(arg0 + 14, arg1 + 17 + var6, var5 - 1, field340);
        class73.method1525(arg0, arg1 + 15 + var6 + var5, 16, field340);
        class73.method1525(arg0 + 1, arg1 + 14 + var6 + var5, 15, field340);
    }

    @ObfuscatedName("i.cv(II)Ljava/lang/String;")
    public static final String method29(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ec.cw(Lex;I)Z")
    public static final boolean method2873(class152 arg0) {
        if (arg0.field2629 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2629.length; var1++) {
            int var2 = method487(arg0, var1);
            int var3 = arg0.field2564[var1];
            if (arg0.field2629[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2629[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2629[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.ct(Lex;II)I")
    public static final int method487(class152 arg0, int arg1) {
        if (arg0.field2617 == null || arg1 >= arg0.field2617.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2617[arg1];
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
                    var7 = field294[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field400[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field436[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method557(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method28(var12).field1038 || field401)) {
                        for (int var13 = 0; var13 < var11.field2577.length; var13++) {
                            if (var12 + 1 == var11.field2577[var13]) {
                                var7 += var11.field2551[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2649[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2120[field400[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2649[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field183.field37;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2119[var14]) {
                            var7 += field400[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method557(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method28(var18).field1038 || field401)) {
                        for (int var19 = 0; var19 < var17.field2577.length; var19++) {
                            if (var18 + 1 == var17.field2577[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field271;
                }
                if (var6 == 12) {
                    var7 = field428;
                }
                if (var6 == 13) {
                    int var20 = class154.field2649[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method877(var22);
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
                    var7 = (Statics.field183.field775 >> 7) + Statics.field314;
                }
                if (var6 == 19) {
                    var7 = (Statics.field183.field720 >> 7) + Statics.field2743;
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

    @ObfuscatedName("an.cx(Lex;III)V")
    public static final void method608(class152 arg0, int arg1, int arg2) {
        if (arg0.field2524 == 1) {
            Statics.method779(arg0.field2622, "", 24, 0, 0, arg0.field2626);
        }
        if (arg0.field2524 == 2 && !field417) {
            String var3 = method37(arg0);
            if (var3 != null) {
                Statics.method779(var3, class2.method2043(65280) + arg0.field2621, 25, 0, -1, arg0.field2626);
            }
        }
        if (arg0.field2524 == 3) {
            Statics.method779(class142.field2293, "", 26, 0, 0, arg0.field2626);
        }
        if (arg0.field2524 == 4) {
            Statics.method779(arg0.field2622, "", 28, 0, 0, arg0.field2626);
        }
        if (arg0.field2524 == 5) {
            Statics.method779(arg0.field2622, "", 29, 0, 0, arg0.field2626);
        }
        if (arg0.field2524 == 6 && field449 == null) {
            Statics.method779(arg0.field2622, "", 30, 0, -1, arg0.field2626);
        }
        if (arg0.field2593 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2531; var5++) {
                for (int var6 = 0; var6 < arg0.field2530; var6++) {
                    int var7 = (arg0.field2574 + 32) * var6;
                    int var8 = (arg0.field2587 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2518[var4];
                        var8 += arg0.field2511[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field270 = var4;
                        Statics.field2663 = arg0;
                        if (arg0.field2577[var4] > 0) {
                            class45 var9 = class45.method28(arg0.field2577[var4] - 1);
                            if (field430 == 1 && class156.method1606(Statics.method2421(arg0))) {
                                if (Statics.field1345 != arg0.field2626 || Statics.field482 != var4) {
                                    Statics.method779(class142.field2284, field416 + " " + class2.field21 + " " + class2.method2043(16748608) + var9.field1000, 31, var9.field1003, var4, arg0.field2626);
                                }
                            } else if (!field417 || !class156.method1606(Statics.method2421(arg0))) {
                                String[] var10 = var9.field1015;
                                if (field494) {
                                    var10 = method1769(var10);
                                }
                                if (class156.method1606(Statics.method2421(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            Statics.method779(var10[var11], class2.method2043(16748608) + var9.field1000, var12, var9.field1003, var4, arg0.field2626);
                                        } else if (var11 == 4) {
                                            Statics.method779(class142.field2136, class2.method2043(16748608) + var9.field1000, 37, var9.field1003, var4, arg0.field2626);
                                        }
                                    }
                                }
                                if (class156.method2356(Statics.method2421(arg0))) {
                                    Statics.method779(class142.field2284, class2.method2043(16748608) + var9.field1000, 38, var9.field1003, var4, arg0.field2626);
                                }
                                if (class156.method1606(Statics.method2421(arg0)) && var10 != null) {
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
                                            Statics.method779(var10[var13], class2.method2043(16748608) + var9.field1000, var14, var9.field1003, var4, arg0.field2626);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2536;
                                if (field494) {
                                    var15 = method1769(var15);
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
                                            Statics.method779(var15[var16], class2.method2043(16748608) + var9.field1000, var17, var9.field1003, var4, arg0.field2626);
                                        }
                                    }
                                }
                                Statics.method779(class142.field2377, class2.method2043(16748608) + var9.field1000, 1005, var9.field1003, var4, arg0.field2626);
                            } else if ((Statics.field2029 & 0x10) == 16) {
                                Statics.method779(field420, field421 + " " + class2.field21 + " " + class2.method2043(16748608) + var9.field1000, 32, var9.field1003, var4, arg0.field2626);
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
        if (!field417) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19;
                if (!class156.method161(Statics.method2421(arg0), var18) && arg0.field2576 == null) {
                    var19 = null;
                } else if (arg0.field2581 == null || arg0.field2581.length <= var18 || arg0.field2581[var18] == null || arg0.field2581[var18].trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = arg0.field2581[var18];
                }
                if (var19 != null) {
                    Statics.method779(var19, arg0.field2552, 1007, var18 + 1, arg0.field2522, arg0.field2626);
                }
            }
            String var21 = method37(arg0);
            if (var21 != null) {
                Statics.method779(var21, arg0.field2552, 25, 0, arg0.field2522, arg0.field2626);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                String var23;
                if (!class156.method161(Statics.method2421(arg0), var22) && arg0.field2576 == null) {
                    var23 = null;
                } else if (arg0.field2581 == null || arg0.field2581.length <= var22 || arg0.field2581[var22] == null || arg0.field2581[var22].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2581[var22];
                }
                if (var23 != null) {
                    Statics.method779(var23, arg0.field2552, 57, var22 + 1, arg0.field2522, arg0.field2626);
                }
            }
            int var25 = Statics.method2421(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                Statics.method779(class142.field2153, "", 30, 0, arg0.field2522, arg0.field2626);
            }
        } else if (class156.method2381(Statics.method2421(arg0)) && (Statics.field2029 & 0x20) == 32) {
            Statics.method779(field420, field421 + " " + class2.field21 + " " + arg0.field2552, 58, 0, arg0.field2522, arg0.field2626);
        }
    }

    @ObfuscatedName("n.cs(IIIIIIIB)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method692(arg0)) {
            method150(Statics.field2582[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("w.cr([Lex;IIIIIIIB)V")
    public static final void method150(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2520 || var9.field2593 == 0 || var9.field2588 || Statics.method2421(var9) != 0 || field435 == var9) && var9.field2532 == arg1 && (!var9.field2520 || !method158(var9))) {
                int var10 = var9.field2526 + arg6;
                int var11 = var9.field2527 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2593 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2593 == 9) {
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
                if (field434 == var9) {
                    field505 = true;
                    field348 = var10;
                    field415 = var11;
                }
                if (!var9.field2520 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2007;
                    int var25 = class127.field1997;
                    if (class127.field2002 != 0) {
                        var24 = class127.field2003;
                        var25 = class127.field2005;
                    }
                    if (var9.field2525 == 1337) {
                        method2064(var9);
                        if (!field521 && !field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method629(var24, var25, var12, var13);
                        }
                    } else if (var9.field2525 == 1338) {
                        method137(var10, var11);
                    } else {
                        if (!field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method608(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2593 == 0) {
                            if (!var9.field2520 && method158(var9) && Statics.field535 != var9) {
                                continue;
                            }
                            method150(arg0, var9.field2626, var12, var13, var14, var15, var10 - var9.field2534, var11 - var9.field2535);
                            if (var9.field2547 != null) {
                                method150(var9.field2547, var9.field2626, var12, var13, var14, var15, var10 - var9.field2534, var11 - var9.field2535);
                            }
                            class4 var26 = (class4) field423.method3171((long) var9.field2626);
                            if (var26 != null) {
                                if (var26.field61 == 0 && class127.field2007 >= var12 && class127.field1997 >= var13 && class127.field2007 < var14 && class127.field1997 < var15 && !field403 && !field470) {
                                    field409[0] = class142.field2268;
                                    field410[0] = "";
                                    field441[0] = 1006;
                                    field480 = 1;
                                }
                                method509(var26.field63, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2520) {
                            if (var9.field2638 && class127.field2007 >= var12 && class127.field1997 >= var13 && class127.field2007 < var14 && class127.field1997 < var15) {
                                for (class1 var27 = (class1) field460.method3210(); var27 != null; var27 = (class1) field460.method3182()) {
                                    if (var27.field2) {
                                        var27.method3273();
                                        var27.field3.field2637 = false;
                                    }
                                }
                                if (Statics.field180 == 0) {
                                    field434 = null;
                                    field435 = null;
                                }
                                if (!field403) {
                                    field409[0] = class142.field2268;
                                    field410[0] = "";
                                    field441[0] = 1006;
                                    field480 = 1;
                                }
                            }
                            boolean var28;
                            if (class127.field2007 >= var12 && class127.field1997 >= var13 && class127.field2007 < var14 && class127.field1997 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class127.field1995 == 1 || !Statics.field1982 && class127.field1995 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class127.field2002 == 1 || !Statics.field1982 && class127.field2002 == 4) && class127.field2003 >= var12 && class127.field2005 >= var13 && class127.field2003 < var14 && class127.field2005 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                method333(var9, class127.field2003 - var10, class127.field2005 - var11);
                            }
                            if (field434 != null && field434 != var9 && var28) {
                                int var31 = Statics.method2421(var9);
                                boolean var32 = (var31 >> 20 & 0x1) != 0;
                                if (var32) {
                                    field379 = var9;
                                }
                            }
                            if (field435 == var9) {
                                field404 = true;
                                field440 = var10;
                                field439 = var11;
                            }
                            if (var9.field2588) {
                                if (var28 && field459 != 0 && var9.field2609 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = true;
                                    var33.field3 = var9;
                                    var33.field5 = field459;
                                    var33.field12 = var9.field2609;
                                    field460.method3183(var33);
                                }
                                if (field434 != null || Statics.field1257 != null || field403) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2579 && var30) {
                                    var9.field2579 = true;
                                    if (var9.field2630 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = true;
                                        var34.field3 = var9;
                                        var34.field6 = class127.field2003 - var10;
                                        var34.field5 = class127.field2005 - var11;
                                        var34.field12 = var9.field2630;
                                        field460.method3183(var34);
                                    }
                                }
                                if (var9.field2579 && var29 && var9.field2591 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = true;
                                    var35.field3 = var9;
                                    var35.field6 = class127.field2007 - var10;
                                    var35.field5 = class127.field1997 - var11;
                                    var35.field12 = var9.field2591;
                                    field460.method3183(var35);
                                }
                                if (var9.field2579 && !var29) {
                                    var9.field2579 = false;
                                    if (var9.field2592 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = true;
                                        var36.field3 = var9;
                                        var36.field6 = class127.field2007 - var10;
                                        var36.field5 = class127.field1997 - var11;
                                        var36.field12 = var9.field2592;
                                        field273.method3183(var36);
                                    }
                                }
                                if (var29 && var9.field2553 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = true;
                                    var37.field3 = var9;
                                    var37.field6 = class127.field2007 - var10;
                                    var37.field5 = class127.field1997 - var11;
                                    var37.field12 = var9.field2553;
                                    field460.method3183(var37);
                                }
                                if (!var9.field2637 && var28) {
                                    var9.field2637 = true;
                                    if (var9.field2594 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = true;
                                        var38.field3 = var9;
                                        var38.field6 = class127.field2007 - var10;
                                        var38.field5 = class127.field1997 - var11;
                                        var38.field12 = var9.field2594;
                                        field460.method3183(var38);
                                    }
                                }
                                if (var9.field2637 && var28 && var9.field2595 != null) {
                                    class1 var39 = new class1();
                                    var39.field2 = true;
                                    var39.field3 = var9;
                                    var39.field6 = class127.field2007 - var10;
                                    var39.field5 = class127.field1997 - var11;
                                    var39.field12 = var9.field2595;
                                    field460.method3183(var39);
                                }
                                if (var9.field2637 && !var28) {
                                    var9.field2637 = false;
                                    if (var9.field2596 != null) {
                                        class1 var40 = new class1();
                                        var40.field2 = true;
                                        var40.field3 = var9;
                                        var40.field6 = class127.field2007 - var10;
                                        var40.field5 = class127.field1997 - var11;
                                        var40.field12 = var9.field2596;
                                        field273.method3183(var40);
                                    }
                                }
                                if (var9.field2583 != null) {
                                    class1 var41 = new class1();
                                    var41.field3 = var9;
                                    var41.field12 = var9.field2583;
                                    field461.method3183(var41);
                                }
                                if (var9.field2601 != null && field450 > var9.field2623) {
                                    if (var9.field2602 == null || field450 - var9.field2623 > 32) {
                                        class1 var46 = new class1();
                                        var46.field3 = var9;
                                        var46.field12 = var9.field2601;
                                        field460.method3183(var46);
                                    } else {
                                        label534: for (int var42 = var9.field2623; var42 < field450; var42++) {
                                            int var43 = field447[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2602.length; var44++) {
                                                if (var9.field2602[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field3 = var9;
                                                    var45.field12 = var9.field2601;
                                                    field460.method3183(var45);
                                                    break label534;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2623 = field450;
                                }
                                if (var9.field2603 != null && field261 > var9.field2634) {
                                    if (var9.field2604 == null || field261 - var9.field2634 > 32) {
                                        class1 var51 = new class1();
                                        var51.field3 = var9;
                                        var51.field12 = var9.field2603;
                                        field460.method3183(var51);
                                    } else {
                                        label510: for (int var47 = var9.field2634; var47 < field261; var47++) {
                                            int var48 = field337[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2604.length; var49++) {
                                                if (var9.field2604[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field3 = var9;
                                                    var50.field12 = var9.field2603;
                                                    field460.method3183(var50);
                                                    break label510;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2634 = field261;
                                }
                                if (var9.field2618 != null && field452 > var9.field2635) {
                                    if (var9.field2575 == null || field452 - var9.field2635 > 32) {
                                        class1 var56 = new class1();
                                        var56.field3 = var9;
                                        var56.field12 = var9.field2618;
                                        field460.method3183(var56);
                                    } else {
                                        label486: for (int var52 = var9.field2635; var52 < field452; var52++) {
                                            int var53 = field451[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2575.length; var54++) {
                                                if (var9.field2575[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field3 = var9;
                                                    var55.field12 = var9.field2618;
                                                    field460.method3183(var55);
                                                    break label486;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2635 = field452;
                                }
                                if (field453 > var9.field2632 && var9.field2610 != null) {
                                    class1 var57 = new class1();
                                    var57.field3 = var9;
                                    var57.field12 = var9.field2610;
                                    field460.method3183(var57);
                                }
                                if (field458 > var9.field2632 && var9.field2612 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field12 = var9.field2612;
                                    field460.method3183(var58);
                                }
                                if (field455 > var9.field2632 && var9.field2631 != null) {
                                    class1 var59 = new class1();
                                    var59.field3 = var9;
                                    var59.field12 = var9.field2631;
                                    field460.method3183(var59);
                                }
                                if (field456 > var9.field2632 && var9.field2614 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field12 = var9.field2614;
                                    field460.method3183(var60);
                                }
                                var9.field2632 = field446;
                                if (var9.field2611 != null) {
                                    for (int var61 = 0; var61 < field479; var61++) {
                                        class1 var62 = new class1();
                                        var62.field3 = var9;
                                        var62.field8 = field481[var61];
                                        var62.field7 = field304[var61];
                                        var62.field12 = var9.field2611;
                                        field460.method3183(var62);
                                    }
                                }
                            }
                        }
                        if (!var9.field2520 && field434 == null && Statics.field1257 == null && !field403) {
                            if ((var9.field2620 >= 0 || var9.field2619 != 0) && class127.field2007 >= var12 && class127.field1997 >= var13 && class127.field2007 < var14 && class127.field1997 < var15) {
                                if (var9.field2620 >= 0) {
                                    Statics.field535 = arg0[var9.field2620];
                                } else {
                                    Statics.field535 = var9;
                                }
                            }
                            if (var9.field2593 == 8 && class127.field2007 >= var12 && class127.field1997 >= var13 && class127.field2007 < var14 && class127.field1997 < var15) {
                                Statics.field520 = var9;
                            }
                            if (var9.field2537 > var9.field2531) {
                                int var63 = var9.field2530 + var10;
                                int var64 = var9.field2531;
                                int var65 = var9.field2537;
                                int var66 = class127.field2007;
                                int var67 = class127.field1997;
                                if (field342) {
                                    field259 = 32;
                                } else {
                                    field259 = 0;
                                }
                                field342 = false;
                                if (class127.field1995 == 1 || !Statics.field1982 && class127.field1995 == 4) {
                                    if (var66 >= var63 && var66 < var63 + 16 && var67 >= var11 && var67 < var11 + 16) {
                                        var9.field2535 -= 4;
                                        method2064(var9);
                                    } else if (var66 >= var63 && var66 < var63 + 16 && var67 >= var11 + var64 - 16 && var67 < var11 + var64) {
                                        var9.field2535 += 4;
                                        method2064(var9);
                                    } else if (var66 >= var63 - field259 && var66 < field259 + var63 + 16 && var67 >= var11 + 16 && var67 < var11 + var64 - 16) {
                                        int var68 = (var64 - 32) * var64 / var65;
                                        if (var68 < 8) {
                                            var68 = 8;
                                        }
                                        int var69 = var67 - var11 - 16 - var68 / 2;
                                        int var70 = var64 - 32 - var68;
                                        var9.field2535 = (var65 - var64) * var69 / var70;
                                        method2064(var9);
                                        field342 = true;
                                    }
                                }
                                if (field459 != 0) {
                                    int var71 = var9.field2530;
                                    if (var66 >= var63 - var71 && var67 >= var11 && var66 < var63 + 16 && var67 <= var11 + var64) {
                                        var9.field2535 += field459 * 45;
                                        method2064(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ci.ca(IIS)V")
    public static final void method2041(int arg0, int arg1) {
        if (class152.method692(arg0)) {
            method153(Statics.field2582[arg0], arg1);
        }
    }

    @ObfuscatedName("y.ce([Lex;IS)V")
    public static final void method153(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2593 == 0) {
                    if (var3.field2547 != null) {
                        method153(var3.field2547, arg1);
                    }
                    class4 var4 = (class4) field423.method3171((long) var3.field2626);
                    if (var4 != null) {
                        method2041(var4.field63, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2615 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field12 = var3.field2615;
                    class32.method884(var5);
                }
                if (arg1 == 1 && var3.field2556 != null) {
                    if (var3.field2522 >= 0) {
                        class152 var6 = class152.method557(var3.field2626);
                        if (var6 == null || var6.field2547 == null || var3.field2522 >= var6.field2547.length || var6.field2547[var3.field2522] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field12 = var3.field2556;
                    class32.method884(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.cd(Lex;III)V")
    public static final void method333(class152 arg0, int arg1, int arg2) {
        if (field434 != null || field403 || arg0 == null) {
            return;
        }
        class152 var3 = method1871(arg0);
        if (var3 == null) {
            var3 = arg0.field2590;
        }
        if (var3 == null) {
            return;
        }
        field434 = arg0;
        class152 var5 = method1871(arg0);
        if (var5 == null) {
            var5 = arg0.field2590;
        }
        field435 = var5;
        field324 = arg1;
        field437 = arg2;
        Statics.field180 = 0;
        field445 = false;
        if (field480 > 0) {
            method1369(field480 - 1);
        }
        return;
    }

    @ObfuscatedName("bz.cy(II)V")
    public static void method1369(int arg0) {
        Statics.field1504 = new class27();
        Statics.field1504.field638 = field405[arg0];
        Statics.field1504.field644 = field406[arg0];
        Statics.field1504.field639 = field441[arg0];
        Statics.field1504.field640 = field408[arg0];
        Statics.field1504.field641 = field409[arg0];
    }

    @ObfuscatedName("aw.cz(III)V")
    public static void method787(int arg0, int arg1) {
        class27 var2 = Statics.field1504;
        method8(var2.field638, var2.field644, var2.field639, var2.field640, var2.field641, var2.field641, arg0, arg1);
        Statics.field1504 = null;
    }

    @ObfuscatedName("cc.ci(Lex;B)V")
    public static void method2064(class152 arg0) {
        if (field465 == arg0.field2613) {
            field485[arg0.field2636] = true;
        }
    }

    @ObfuscatedName("ao.cm(B)V")
    public static void method546() {
        for (class4 var0 = (class4) field423.method3162(); var0 != null; var0 = (class4) field423.method3163()) {
            int var1 = var0.field63;
            if (class152.method692(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2582[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2520;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2867;
                    class152 var6 = class152.method557(var5);
                    if (var6 != null) {
                        method2064(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.cg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1769(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("o.cl(II)V")
    public static final void method483(int arg0) {
        if (!class152.method692(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2582[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2627 = 0;
                var3.field2608 = 0;
            }
        }
    }

    @ObfuscatedName("cd.co([Lex;IB)V")
    public static final void method1959(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2532 == arg1 && (!var3.field2520 || !method158(var3))) {
                if (var3.field2593 == 0) {
                    if (!var3.field2520 && method158(var3) && Statics.field535 != var3) {
                        continue;
                    }
                    method1959(arg0, var3.field2626);
                    if (var3.field2547 != null) {
                        method1959(var3.field2547, var3.field2626);
                    }
                    class4 var4 = (class4) field423.method3171((long) var3.field2626);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class152.method692(var5)) {
                            method1959(Statics.field2582[var5], -1);
                        }
                    }
                }
                if (var3.field2593 == 6) {
                    if (var3.field2605 != -1 || var3.field2628 != -1) {
                        boolean var6 = method2873(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2628;
                        } else {
                            var7 = var3.field2605;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method730(var7);
                            var3.field2608 += field266;
                            while (var3.field2608 > var8.field899[var3.field2627]) {
                                var3.field2608 -= var8.field899[var3.field2627];
                                var3.field2627++;
                                if (var3.field2627 >= var8.field897.length) {
                                    var3.field2627 -= var8.field902;
                                    if (var3.field2627 < 0 || var3.field2627 >= var8.field897.length) {
                                        var3.field2627 = 0;
                                    }
                                }
                                method2064(var3);
                            }
                        }
                    }
                    if (var3.field2565 != 0 && !var3.field2520) {
                        int var9 = var3.field2565 >> 16;
                        int var10 = var3.field2565 << 16 >> 16;
                        int var11 = field266 * var9;
                        int var12 = field266 * var10;
                        var3.field2561 = var3.field2561 + var11 & 0x7FF;
                        var3.field2562 = var3.field2562 + var12 & 0x7FF;
                        method2064(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cc(II)V")
    public static final void method11(int arg0) {
        method546();
        for (class20 var1 = (class20) class20.field567.method3210(); var1 != null; var1 = (class20) class20.field567.method3182()) {
            if (var1.field565 != null) {
                var1.method474();
            }
        }
        class46 var2 = (class46) class46.field1049.method3136((long) arg0);
        class46 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1054.method2695(16, arg0);
            class46 var5 = new class46();
            if (var4 != null) {
                var5.method880(new class107(var4));
            }
            class46.field1049.method3127(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field1052;
        if (var6 == 0) {
            return;
        }
        int var7 = class154.field2649[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class84.method1804(0.9D);
                ((class88) Statics.field1457).method1864(0.9D);
            }
            if (var7 == 2) {
                class84.method1804(0.8D);
                ((class88) Statics.field1457).method1864(0.8D);
            }
            if (var7 == 3) {
                class84.method1804(0.7D);
                ((class88) Statics.field1457).method1864(0.7D);
            }
            if (var7 == 4) {
                class84.method1804(0.6D);
                ((class88) Statics.field1457).method1864(0.6D);
            }
            class45.field997.method3128();
        }
        if (var6 == 3) {
            short var8 = 0;
            if (var7 == 0) {
                var8 = 255;
            }
            if (var7 == 1) {
                var8 = 192;
            }
            if (var7 == 2) {
                var8 = 128;
            }
            if (var7 == 3) {
                var8 = 64;
            }
            if (var7 == 4) {
                var8 = 0;
            }
            if (field493 != var8) {
                if (field493 == 0 && field355 != -1) {
                    class161.method515(Statics.field532, field355, 0, var8, false);
                    field495 = false;
                } else if (var8 == 0) {
                    Statics.field2709.method3008();
                    class161.field2706 = 1;
                    Statics.field785 = null;
                    field495 = false;
                } else {
                    class161.method819(var8);
                }
                field493 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field496 = 127;
            }
            if (var7 == 1) {
                field496 = 96;
            }
            if (var7 == 2) {
                field496 = 64;
            }
            if (var7 == 3) {
                field496 = 32;
            }
            if (var7 == 4) {
                field496 = 0;
            }
        }
        if (var6 == 5) {
            field443 = var7;
        }
        if (var6 == 6) {
            field393 = var7;
        }
        if (var6 == 9) {
            field425 = var7;
        }
        if (var6 == 10) {
            if (var7 == 0) {
                field381 = 127;
            }
            if (var7 == 1) {
                field381 = 96;
            }
            if (var7 == 2) {
                field381 = 64;
            }
            if (var7 == 3) {
                field381 = 32;
            }
            if (var7 == 4) {
                field381 = 0;
            }
        }
        if (var6 == 17) {
            field444 = var7 & 0xFFFF;
        }
        if (var6 == 18) {
            class18[] var9 = new class18[] { class18.field528, class18.field527, class18.field524 };
            field288 = (class18) class99.method771(var9, var7);
            if (field288 == null) {
                field288 = class18.field528;
            }
        }
        if (var6 != 19) {
            return;
        }
        if (var7 == -1) {
            field394 = -1;
        } else {
            field394 = var7 & 0x7FF;
        }
    }

    @ObfuscatedName("y.dd(Lex;I)V")
    public static final void method152(class152 arg0) {
        int var1 = arg0.field2525;
        if (var1 == 324) {
            if (field517 == -1) {
                field517 = arg0.field2633;
                field518 = arg0.field2546;
            }
            if (field468.field2665) {
                arg0.field2633 = field517;
            } else {
                arg0.field2633 = field518;
            }
        } else if (var1 == 325) {
            if (field517 == -1) {
                field517 = arg0.field2633;
                field518 = arg0.field2546;
            }
            if (field468.field2665) {
                arg0.field2633 = field518;
            } else {
                arg0.field2633 = field517;
            }
        } else if (var1 == 327) {
            arg0.field2561 = 150;
            arg0.field2562 = (int) (Math.sin((double) field442 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2529 = 5;
            arg0.field2554 = 0;
        } else if (var1 == 328) {
            arg0.field2561 = 150;
            arg0.field2562 = (int) (Math.sin((double) field442 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2529 = 5;
            arg0.field2554 = 1;
        }
    }

    @ObfuscatedName("client.ds(IIII)Lg;")
    public static final class4 method460(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field63 = arg1;
        var3.field61 = arg2;
        field423.method3168(var3, (long) arg0);
        method483(arg1);
        class32.method73(arg1);
        class152 var4 = class152.method557(arg0);
        if (var4 != null) {
            method2064(var4);
        }
        if (field449 != null) {
            method2064(field449);
            field449 = null;
        }
        method162();
        if (field422 != -1) {
            method2041(field422, 1);
        }
        return var3;
    }

    @ObfuscatedName("ag.dw(Lex;S)Z")
    public static final boolean method572(class152 arg0) {
        int var1 = arg0.field2525;
        if (var1 == 205) {
            field309 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field468.method2900(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field468.method2921(var4, var5 == 1);
        }
        if (var1 == 324) {
            field468.method2902(false);
        }
        if (var1 == 325) {
            field468.method2902(true);
        }
        if (var1 == 326) {
            field402.method2361(30);
            field468.method2912(field402);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.dz(IIIILbe;I)V")
    public static final void method491(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method98(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field345 + field332 & 0x7FF;
        int var7 = class84.field1480[var6];
        int var8 = class84.field1464[var6];
        int var9 = var7 * 256 / (field334 + 256);
        int var10 = var8 * 256 / (field334 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field242.method1500(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("m.dc(IIIILbe;I)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field345 + field332 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1480[var5];
        int var8 = class84.field1464[var5];
        int var9 = var7 * 256 / (field334 + 256);
        int var10 = var8 * 256 / (field334 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1428(Statics.field28, arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1309 / 2 - 4);
        } else {
            arg4.method1429(arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1309 / 2 - 4);
        }
    }

    @ObfuscatedName("ew.dg(Ljava/lang/String;ZI)Z")
    public static boolean method2690(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method2415(arg0, Statics.field177);
        for (int var3 = 0; var3 < field287; var3++) {
            if (var2.equalsIgnoreCase(class200.method2415(field512[var3].field240, Statics.field177)) && (!arg1 || field512[var3].field230 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method2415(Statics.field183.field44, Statics.field177))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bx.da(Ljava/lang/String;I)Z")
    public static boolean method1388(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method2415(arg0, Statics.field177);
        for (int var2 = 0; var2 < field466; var2++) {
            class8 var3 = field427[var2];
            if (var1.equalsIgnoreCase(class200.method2415(var3.field140, Statics.field177))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method2415(var3.field133, Statics.field177))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("da.do(Ljava/lang/String;ZI)V")
    public static final void method2403(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field466 < 100 || field387 == 1) || field466 >= 400) {
            class10.method2658(31, "", class142.field2286);
            return;
        }
        String var2 = class200.method2415(arg0, Statics.field177);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field466; var3++) {
            class8 var4 = field427[var3];
            String var5 = class200.method2415(var4.field140, Statics.field177);
            if (var5 != null && var5.equals(var2)) {
                class10.method2658(31, "", arg0 + class142.field2303);
                return;
            }
            if (var4.field133 != null) {
                String var6 = class200.method2415(var4.field133, Statics.field177);
                if (var6 != null && var6.equals(var2)) {
                    class10.method2658(31, "", arg0 + class142.field2303);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field287; var7++) {
            class16 var8 = field512[var7];
            String var9 = class200.method2415(var8.field240, Statics.field177);
            if (var9 != null && var9.equals(var2)) {
                class10.method2658(31, "", class142.field2190 + arg0 + class142.field2290);
                return;
            }
            if (var8.field229 != null) {
                String var10 = class200.method2415(var8.field229, Statics.field177);
                if (var10 != null && var10.equals(var2)) {
                    class10.method2658(31, "", class142.field2190 + arg0 + class142.field2290);
                    return;
                }
            }
        }
        if (class200.method2415(Statics.field183.field44, Statics.field177).equals(var2)) {
            class10.method2658(31, "", class142.field2280);
        } else {
            field402.method2361(13);
            field402.method2102(class107.method853(arg0));
            field402.method2107(arg0);
        }
    }

    @ObfuscatedName("b.dh(Ljava/lang/String;I)V")
    public static final void method74(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method2415(arg0, Statics.field177);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field466; var2++) {
            class8 var3 = field427[var2];
            String var4 = var3.field140;
            String var5 = class200.method2415(var4, Statics.field177);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field466--;
                for (int var7 = var2; var7 < field466; var7++) {
                    field427[var7] = field427[var7 + 1];
                }
                field458 = field446;
                field402.method2361(178);
                field402.method2102(class107.method853(arg0));
                field402.method2107(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ez.df(II)V")
    public static void method2665(int arg0) {
        for (class179 var1 = (class179) field463.method3162(); var1 != null; var1 = (class179) field463.method3163()) {
            if ((long) arg0 == (var1.field2867 >> 48 & 0xFFFFL)) {
                var1.method3273();
            }
        }
    }

    @ObfuscatedName("cw.di(Lex;B)Lex;")
    public static class152 method1871(class152 arg0) {
        int var1 = Statics.method2421(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class152.method557(arg0.field2532);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.dl(Lex;I)Z")
    public static boolean method158(class152 arg0) {
        if (field470) {
            if (Statics.method2421(arg0) != 0) {
                return false;
            }
            if (arg0.field2593 == 0) {
                return false;
            }
        }
        return arg0.field2533;
    }

    @ObfuscatedName("x.dn(Lex;B)Ljava/lang/String;")
    public static String method37(class152 arg0) {
        if (class156.method2110(Statics.method2421(arg0)) == 0) {
            return null;
        } else if (arg0.field2539 == null || arg0.field2539.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2539;
        }
    }

    @ObfuscatedName("h.dp(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method154(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field265 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field265 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field265 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field265 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field265 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field267 + "/";
    }
}

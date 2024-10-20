package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.a")
    public static boolean field498 = true;

    @ObfuscatedName("client.g")
    public static int field255 = 1;

    @ObfuscatedName("client.u")
    public static int field256 = 0;

    @ObfuscatedName("client.m")
    public static int field257 = 0;

    @ObfuscatedName("client.f")
    public static boolean field259 = false;

    @ObfuscatedName("client.c")
    public static boolean field260 = false;

    @ObfuscatedName("client.i")
    public static int field261 = 0;

    @ObfuscatedName("client.d")
    public static int field263 = 0;

    @ObfuscatedName("client.b")
    public static boolean field442 = true;

    @ObfuscatedName("client.v")
    public static int field265 = 0;

    @ObfuscatedName("client.n")
    public static long field266 = 1L;

    @ObfuscatedName("client.w")
    public static class194[] field311 = new class194[4];

    @ObfuscatedName("client.q")
    public static int field267 = -1;

    @ObfuscatedName("client.s")
    public static int field268 = -1;

    @ObfuscatedName("client.j")
    public static int field405 = -1;

    @ObfuscatedName("client.r")
    public static boolean field474 = true;

    @ObfuscatedName("client.h")
    public static boolean field271 = false;

    @ObfuscatedName("client.ak")
    public static int field272 = 0;

    @ObfuscatedName("client.ab")
    public static int field273 = 0;

    @ObfuscatedName("client.as")
    public static int field274 = 0;

    @ObfuscatedName("client.aq")
    public static int field275 = 0;

    @ObfuscatedName("client.ai")
    public static int field310 = 0;

    @ObfuscatedName("client.aw")
    public static int field472 = 0;

    @ObfuscatedName("client.aj")
    public static int field278 = 0;

    @ObfuscatedName("client.ax")
    public static int field279 = 0;

    @ObfuscatedName("client.ar")
    public static int field280 = 0;

    @ObfuscatedName("client.ac")
    public static class107 field281 = new class107(new byte[5000]);

    @ObfuscatedName("client.ae")
    public static class18 field282 = class18.field524;

    @ObfuscatedName("client.ad")
    public static int field283 = 0;

    @ObfuscatedName("client.au")
    public static int field285 = 0;

    @ObfuscatedName("client.an")
    public static int field286 = 0;

    @ObfuscatedName("client.bm")
    public static int field287 = 0;

    @ObfuscatedName("client.bb")
    public static int field288 = 0;

    @ObfuscatedName("client.br")
    public static int field289 = 0;

    @ObfuscatedName("client.bt")
    public static int field294 = 0;

    @ObfuscatedName("client.bw")
    public static int field301 = 0;

    @ObfuscatedName("client.bs")
    public static class30[] field292 = new class30[32768];

    @ObfuscatedName("client.bz")
    public static int field463 = 0;

    @ObfuscatedName("client.bp")
    public static int[] field290 = new int[32768];

    @ObfuscatedName("client.cx")
    public static class110 field296 = new class110(5000);

    @ObfuscatedName("client.ch")
    public static class110 field322 = new class110(5000);

    @ObfuscatedName("client.cn")
    public static class110 field507 = new class110(5000);

    @ObfuscatedName("client.cf")
    public static int field299 = 0;

    @ObfuscatedName("client.cr")
    public static int field300 = 0;

    @ObfuscatedName("client.cz")
    public static int field423 = 0;

    @ObfuscatedName("client.ck")
    public static int field302 = 0;

    @ObfuscatedName("client.co")
    public static int field510 = 0;

    @ObfuscatedName("client.ct")
    public static int field304 = 0;

    @ObfuscatedName("client.ci")
    public static int field305 = 0;

    @ObfuscatedName("client.cy")
    public static int field306 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field307 = false;

    @ObfuscatedName("client.cu")
    public static int field449 = 0;

    @ObfuscatedName("client.cj")
    public static int field336 = 0;

    @ObfuscatedName("client.du")
    public static int field277 = 1;

    @ObfuscatedName("client.de")
    public static int field312 = 0;

    @ObfuscatedName("client.dp")
    public static int field370 = 1;

    @ObfuscatedName("client.dg")
    public static int field314 = 0;

    @ObfuscatedName("client.dw")
    public static boolean field317 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field318 = new int[4][13][13];

    @ObfuscatedName("client.dz")
    public static final int[] field368 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dj")
    public static int field320 = 0;

    @ObfuscatedName("client.dm")
    public static int field321 = 2;

    @ObfuscatedName("client.db")
    public static int field316 = 0;

    @ObfuscatedName("client.dd")
    public static int field323 = 2;

    @ObfuscatedName("client.dr")
    public static int field324 = 0;

    @ObfuscatedName("client.dv")
    public static int field444 = 1;

    @ObfuscatedName("client.dx")
    public static int field326 = 0;

    @ObfuscatedName("client.di")
    public static int field327 = 0;

    @ObfuscatedName("client.dt")
    public static int field495 = 2;

    @ObfuscatedName("client.dh")
    public static int field473 = 0;

    @ObfuscatedName("client.ew")
    public static int field412 = 1;

    @ObfuscatedName("client.em")
    public static int field450 = 0;

    @ObfuscatedName("client.er")
    public static int field332 = 0;

    @ObfuscatedName("client.ek")
    public static int field334 = 2301979;

    @ObfuscatedName("client.es")
    public static int field335 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field483 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field429 = 7759444;

    @ObfuscatedName("client.eq")
    public static boolean field338 = false;

    @ObfuscatedName("client.ft")
    public static int field331 = 0;

    @ObfuscatedName("client.fz")
    public static int field340 = 128;

    @ObfuscatedName("client.fl")
    public static int field341 = 0;

    @ObfuscatedName("client.fr")
    public static int field342 = 0;

    @ObfuscatedName("client.fk")
    public static int field343 = 0;

    @ObfuscatedName("client.fa")
    public static int field344 = 0;

    @ObfuscatedName("client.fn")
    public static int field345 = 0;

    @ObfuscatedName("client.fo")
    public static int field297 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field347 = false;

    @ObfuscatedName("client.fu")
    public static int field348 = 0;

    @ObfuscatedName("client.fs")
    public static int field349 = 0;

    @ObfuscatedName("client.fm")
    public static int field514 = 50;

    @ObfuscatedName("client.fe")
    public static int[] field351 = new int[field514];

    @ObfuscatedName("client.fc")
    public static int[] field303 = new int[field514];

    @ObfuscatedName("client.fy")
    public static int[] field392 = new int[field514];

    @ObfuscatedName("client.ff")
    public static int[] field354 = new int[field514];

    @ObfuscatedName("client.fi")
    public static int[] field355 = new int[field514];

    @ObfuscatedName("client.fq")
    public static int[] field356 = new int[field514];

    @ObfuscatedName("client.fd")
    public static int[] field406 = new int[field514];

    @ObfuscatedName("client.gl")
    public static String[] field358 = new String[field514];

    @ObfuscatedName("client.gs")
    public static int[][] field359 = new int[104][104];

    @ObfuscatedName("client.gx")
    public static int field360 = 0;

    @ObfuscatedName("client.gn")
    public static int field477 = -1;

    @ObfuscatedName("client.gv")
    public static int field362 = -1;

    @ObfuscatedName("client.gh")
    public static int field352 = 0;

    @ObfuscatedName("client.gj")
    public static int field461 = 0;

    @ObfuscatedName("client.gb")
    public static int field365 = 0;

    @ObfuscatedName("client.gq")
    public static int field366 = 0;

    @ObfuscatedName("client.gz")
    public static int field367 = 0;

    @ObfuscatedName("client.gf")
    public static int field482 = 0;

    @ObfuscatedName("client.gt")
    public static int field369 = 0;

    @ObfuscatedName("client.gk")
    public static int field357 = 0;

    @ObfuscatedName("client.ga")
    public static int field371 = 0;

    @ObfuscatedName("client.gc")
    public static int field372 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field373 = false;

    @ObfuscatedName("client.gu")
    public static int field374 = 0;

    @ObfuscatedName("client.gg")
    public static int field375 = 0;

    @ObfuscatedName("client.gp")
    public static class3[] field376 = new class3[2048];

    @ObfuscatedName("client.gr")
    public static int field453 = 0;

    @ObfuscatedName("client.gw")
    public static int[] field378 = new int[2048];

    @ObfuscatedName("client.he")
    public static int field506 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field380 = new int[2048];

    @ObfuscatedName("client.hs")
    public static class107[] field381 = new class107[2048];

    @ObfuscatedName("client.hi")
    public static int field382 = -1;

    @ObfuscatedName("client.ha")
    public static int field383 = 0;

    @ObfuscatedName("client.hg")
    public static int field475 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field385 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field500 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field403 = new String[8];

    @ObfuscatedName("client.hp")
    public static boolean[] field388 = new boolean[8];

    @ObfuscatedName("client.hb")
    public static int[] field309 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hj")
    public static int field390 = -1;

    @ObfuscatedName("client.hx")
    public static class176[][][] field391 = new class176[4][104][104];

    @ObfuscatedName("client.ho")
    public static class176 field363 = new class176();

    @ObfuscatedName("client.hk")
    public static class176 field393 = new class176();

    @ObfuscatedName("client.ht")
    public static class176 field333 = new class176();

    @ObfuscatedName("client.hy")
    public static int[] field313 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field396 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field397 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field398 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field515 = false;

    @ObfuscatedName("client.im")
    public static int field400 = 0;

    @ObfuscatedName("client.io")
    public static int[] field401 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field402 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field377 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field404 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field276 = new String[500];

    @ObfuscatedName("client.iv")
    public static String[] field503 = new String[500];

    @ObfuscatedName("client.ir")
    public static int field407 = -1;

    @ObfuscatedName("client.in")
    public static int field329 = -1;

    @ObfuscatedName("client.iy")
    public static int field409 = 0;

    @ObfuscatedName("client.ij")
    public static int field410 = 50;

    @ObfuscatedName("client.iu")
    public static int field411 = 0;

    @ObfuscatedName("client.it")
    public static String field269 = null;

    @ObfuscatedName("client.ia")
    public static boolean field413 = false;

    @ObfuscatedName("client.ig")
    public static int field414 = -1;

    @ObfuscatedName("client.jd")
    public static String field415 = null;

    @ObfuscatedName("client.jq")
    public static String field416 = null;

    @ObfuscatedName("client.ja")
    public static int field417 = -1;

    @ObfuscatedName("client.jl")
    public static class173 field488 = new class173(8);

    @ObfuscatedName("client.jn")
    public static int field419 = 0;

    @ObfuscatedName("client.jv")
    public static int field420 = 0;

    @ObfuscatedName("client.jz")
    public static class151 field339 = null;

    @ObfuscatedName("client.jh")
    public static int field361 = 0;

    @ObfuscatedName("client.jj")
    public static int field353 = 0;

    @ObfuscatedName("client.jc")
    public static int field424 = 0;

    @ObfuscatedName("client.jp")
    public static int field425 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field426 = false;

    @ObfuscatedName("client.jr")
    public static boolean field427 = false;

    @ObfuscatedName("client.jo")
    public static boolean field428 = false;

    @ObfuscatedName("client.jw")
    public static class151 field346 = null;

    @ObfuscatedName("client.jx")
    public static class151 field430 = null;

    @ObfuscatedName("client.je")
    public static int field431 = 0;

    @ObfuscatedName("client.ju")
    public static int field432 = 0;

    @ObfuscatedName("client.jm")
    public static class151 field501 = null;

    @ObfuscatedName("client.jf")
    public static boolean field434 = false;

    @ObfuscatedName("client.jt")
    public static int field435 = -1;

    @ObfuscatedName("client.js")
    public static int field436 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field437 = false;

    @ObfuscatedName("client.ji")
    public static int field438 = -1;

    @ObfuscatedName("client.jg")
    public static int field254 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field270 = false;

    @ObfuscatedName("client.kh")
    public static int field441 = 1;

    @ObfuscatedName("client.kb")
    public static int[] field325 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field252 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field264 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field445 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field446 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field447 = 0;

    @ObfuscatedName("client.ks")
    public static int field448 = 0;

    @ObfuscatedName("client.kq")
    public static int field319 = 0;

    @ObfuscatedName("client.kk")
    public static int field466 = 0;

    @ObfuscatedName("client.kw")
    public static int field451 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field452 = new int[2000];

    @ObfuscatedName("client.kp")
    public static String[] field293 = new String[1000];

    @ObfuscatedName("client.ki")
    public static int field454 = 0;

    @ObfuscatedName("client.kg")
    public static class176 field455 = new class176();

    @ObfuscatedName("client.kx")
    public static class176 field456 = new class176();

    @ObfuscatedName("client.ky")
    public static class176 field328 = new class176();

    @ObfuscatedName("client.kv")
    public static class173 field386 = new class173(512);

    @ObfuscatedName("client.lp")
    public static int field459 = 0;

    @ObfuscatedName("client.lb")
    public static int field460 = -2;

    @ObfuscatedName("client.ll")
    public static boolean[] field418 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field462 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field284 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static int[] field508 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field465 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field295 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lo")
    public static int field399 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field469 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field470 = 0;

    @ObfuscatedName("client.lw")
    public static int field471 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field464 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field487 = 0;

    @ObfuscatedName("client.lt")
    public static int field389 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field476 = new int[128];

    @ObfuscatedName("client.lr")
    public static int[] field458 = new int[128];

    @ObfuscatedName("client.la")
    public static long field422 = -1L;

    @ObfuscatedName("client.lj")
    public static String field478 = null;

    @ObfuscatedName("client.lk")
    public static String field395 = null;

    @ObfuscatedName("client.mw")
    public static int field480 = -1;

    @ObfuscatedName("client.mm")
    public static int field481 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field468 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field364 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class72[] field484 = new class72[1000];

    @ObfuscatedName("client.mc")
    public static int field485 = 0;

    @ObfuscatedName("client.mn")
    public static int field486 = 0;

    @ObfuscatedName("client.mz")
    public static int field291 = 0;

    @ObfuscatedName("client.mk")
    public static int field408 = 255;

    @ObfuscatedName("client.md")
    public static int field489 = -1;

    @ObfuscatedName("client.me")
    public static boolean field490 = false;

    @ObfuscatedName("client.ml")
    public static int field491 = 127;

    @ObfuscatedName("client.mh")
    public static int field492 = 127;

    @ObfuscatedName("client.nn")
    public static int field493 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field330 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.nq")
    public static class52[] field394 = new class52[50];

    @ObfuscatedName("client.nl")
    public static boolean field499 = false;

    @ObfuscatedName("client.nc")
    public static boolean[] field379 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field337 = new int[5];

    @ObfuscatedName("client.np")
    public static int[] field502 = new int[5];

    @ObfuscatedName("client.ne")
    public static int[] field384 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field504 = new int[5];

    @ObfuscatedName("client.ns")
    public static int field505 = 0;

    @ObfuscatedName("client.nk")
    public static int field443 = 0;

    @ObfuscatedName("client.om")
    public static class16[] field479 = new class16[400];

    @ObfuscatedName("client.ow")
    public static class172 field440 = new class172();

    @ObfuscatedName("client.ot")
    public static int field509 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field308 = new class8[400];

    @ObfuscatedName("client.oj")
    public static class156 field511 = new class156();

    @ObfuscatedName("client.oq")
    public static int field512 = -1;

    @ObfuscatedName("client.of")
    public static int field513 = -1;

    @ObfuscatedName("client.a(I)V")
    public final void method163() {
    }

    public final void init() {
        if (!this.method2622()) {
            return;
        }
        class167[] var1 = class167.method778();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2796);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2796)) {
                    case 1:
                        int var5 = Integer.parseInt(var4);
                        class138[] var6 = class138.method83();
                        int var7 = 0;
                        class138 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class138 var8 = var6[var7];
                            if (var8.field2111 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field1862 = var9;
                        break;
                    case 2:
                        field255 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field262 = var4;
                    case 4:
                    default:
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field36)) {
                        }
                        break;
                    case 6:
                        field257 = Integer.parseInt(var4);
                        break;
                    case 7:
                        field256 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field261 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field36)) {
                            field259 = true;
                        } else {
                            field259 = false;
                        }
                        break;
                    case 10:
                        class139[] var10 = new class139[] { class139.field2127, class139.field2120, class139.field2125, class139.field2119, class139.field2118, class139.field2117 };
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
                            if (var11 == var14.method470()) {
                                var15 = var14;
                                break;
                            }
                            var13++;
                        }
                        Statics.field258 = (class139) var15;
                        if (Statics.field258 == class139.field2120) {
                            Statics.field1933 = class187.field2867;
                        } else {
                            Statics.field1933 = class187.field2865;
                        }
                }
            }
        }
        method121();
        Statics.field22 = this.getCodeBase().getHost();
        String var16 = Statics.field1862.field2113;
        byte var17 = 0;
        try {
            class136.method618("oldschool", var16, var17, 16);
        } catch (Exception var19) {
            class135.method95((String) null, var19);
        }
        Statics.field253 = this;
        this.method2596(765, 503, 47);
    }

    @ObfuscatedName("i.u(B)V")
    public static final void method121() {
        class79.field1404 = false;
        field260 = false;
    }

    @ObfuscatedName("client.k(I)V")
    public final void method461() {
        Statics.field103 = field257 == 0 ? 43594 : field255 + 40000;
        Statics.field1755 = field257 == 0 ? 443 : field255 + 50000;
        Statics.field1278 = Statics.field103;
        Statics.field2657 = class152.field2637;
        Statics.field1272 = class152.field2638;
        Statics.field1937 = class152.field2639;
        Statics.field1516 = class152.field2640;
        if (Statics.field1940.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1980[44] = 71;
            class124.field1980[45] = 26;
            class124.field1980[46] = 72;
            class124.field1980[47] = 73;
            class124.field1980[59] = 57;
            class124.field1980[61] = 27;
            class124.field1980[91] = 42;
            class124.field1980[92] = 74;
            class124.field1980[93] = 43;
            class124.field1980[192] = 28;
            class124.field1980[222] = 58;
            class124.field1980[520] = 59;
        } else {
            class124.field1980[186] = 57;
            class124.field1980[187] = 27;
            class124.field1980[188] = 71;
            class124.field1980[189] = 26;
            class124.field1980[190] = 72;
            class124.field1980[191] = 73;
            class124.field1980[192] = 58;
            class124.field1980[219] = 42;
            class124.field1980[220] = 74;
            class124.field1980[221] = 43;
            class124.field1980[222] = 59;
            class124.field1980[223] = 28;
        }
        Canvas var1 = Statics.field1007;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1978);
        var1.addFocusListener(class124.field1978);
        class127.method2064(Statics.field1007);
        Statics.field2896 = class118.method597();
        if (Statics.field2896 != null) {
            Statics.field2896.method2439(Statics.field1007);
        }
        Statics.field178 = new class121(255, class136.field2095, class136.field2084, 500000);
        Statics.field908 = class9.method2();
        Statics.field2467 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field1840;
        class125.field1994 = this;
        class125.field1993 = var3;
        if (field257 != 0) {
            field271 = true;
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method166() {
        field265++;
        this.method169();
        class148.method100();
        try {
            if (class160.field2695 == 1) {
                int var1 = Statics.field2690.method3023();
                if (var1 > 0 && Statics.field2690.method3029()) {
                    int var2 = var1 - Statics.field2892;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2690.method3022(var2);
                } else {
                    Statics.field2690.method3103();
                    Statics.field2690.method3058();
                    if (Statics.field997 == null) {
                        class160.field2695 = 0;
                    } else {
                        class160.field2695 = 2;
                    }
                    Statics.field2688 = null;
                    Statics.field225 = null;
                }
            }
        } catch (Exception var263) {
            var263.printStackTrace();
            Statics.field2690.method3103();
            class160.field2695 = 0;
            Statics.field2688 = null;
            Statics.field225 = null;
            Statics.field997 = null;
        }
        method2475();
        class124 var4 = class124.field1978;
        synchronized (class124.field1978) {
            class124.field1958++;
            class124.field1976 = class124.field1983;
            class124.field1957 = 0;
            if (class124.field1971 >= 0) {
                while (class124.field1977 != class124.field1971) {
                    int var6 = class124.field1970[class124.field1977];
                    class124.field1977 = class124.field1977 + 1 & 0x7F;
                    if (var6 < 0) {
                        class124.field1968[~var6] = false;
                    } else {
                        if (!class124.field1968[var6] && class124.field1957 < class124.field1981.length - 1) {
                            class124.field1981[++class124.field1957 - 1] = var6;
                        }
                        class124.field1968[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class124.field1968[var5] = false;
                }
                class124.field1971 = class124.field1977;
            }
            class124.field1983 = class124.field1979;
        }
        class127 var8 = class127.field2006;
        synchronized (class127.field2006) {
            class127.field2005 = class127.field2002;
            class127.field2004 = class127.field2012;
            class127.field2001 = class127.field2011;
            class127.field2000 = class127.field2008;
            class127.field2013 = class127.field2009;
            class127.field2014 = class127.field2010;
            class127.field2003 = class127.field2015;
            class127.field2008 = 0;
        }
        if (Statics.field2896 != null) {
            int var10 = Statics.field2896.method2446();
            field454 = var10;
        }
        if (field263 == 0) {
            method529();
            Statics.method834();
        } else if (field263 == 5) {
            Statics.method2472(this);
            method529();
            Statics.method834();
        } else if (field263 == 10) {
            Statics.method2472(this);
        } else if (field263 == 20) {
            Statics.method2472(this);
            method3();
        } else if (field263 == 25) {
            method160(false);
            field336 = 0;
            boolean var11 = true;
            for (int var12 = 0; var12 < Statics.field201.length; var12++) {
                if (Statics.field607[var12] != -1 && Statics.field201[var12] == null) {
                    Statics.field201[var12] = Statics.field1814.method2717(Statics.field607[var12], 0);
                    if (Statics.field201[var12] == null) {
                        var11 = false;
                        field336++;
                    }
                }
                if (Statics.field35[var12] != -1 && Statics.field315[var12] == null) {
                    Statics.field315[var12] = Statics.field1814.method2718(Statics.field35[var12], 0, Statics.field1802[var12]);
                    if (Statics.field315[var12] == null) {
                        var11 = false;
                        field336++;
                    }
                }
            }
            if (var11) {
                field312 = 0;
                boolean var13 = true;
                for (int var14 = 0; var14 < Statics.field201.length; var14++) {
                    byte[] var15 = Statics.field315[var14];
                    if (var15 != null) {
                        int var16 = (Statics.field1751[var14] >> 8) * 64 - Statics.field439;
                        int var17 = (Statics.field1751[var14] & 0xFF) * 64 - Statics.field88;
                        if (field317) {
                            var16 = 10;
                            var17 = 10;
                        }
                        var13 &= class6.method934(var15, var16, var17);
                    }
                }
                if (var13) {
                    if (field314 != 0) {
                        method145(class142.field2151 + class2.field25 + class2.field19 + 100 + "%" + class2.field23, true);
                    }
                    method2475();
                    method1974();
                    method2475();
                    Statics.field1866.method1609();
                    method2475();
                    System.gc();
                    for (int var18 = 0; var18 < 4; var18++) {
                        field311[var18].method3466();
                    }
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                class6.field82[var19][var20][var21] = 0;
                            }
                        }
                    }
                    method2475();
                    class6.field99 = 99;
                    Statics.field89 = new byte[4][104][104];
                    Statics.field83 = new byte[4][104][104];
                    Statics.field86 = new byte[4][104][104];
                    Statics.field2648 = new byte[4][104][104];
                    Statics.field81 = new int[4][105][105];
                    Statics.field2468 = new byte[4][105][105];
                    Statics.field1923 = new int[105][105];
                    Statics.field87 = new int[104];
                    Statics.field781 = new int[104];
                    Statics.field84 = new int[104];
                    Statics.field2028 = new int[104];
                    Statics.field2659 = new int[104];
                    int var22 = Statics.field201.length;
                    class20.method21();
                    method160(true);
                    if (!field317) {
                        int var23 = 0;
                        label1211: while (true) {
                            if (var23 >= var22) {
                                for (int var37 = 0; var37 < var22; var37++) {
                                    int var38 = (Statics.field1751[var37] >> 8) * 64 - Statics.field439;
                                    int var39 = (Statics.field1751[var37] & 0xFF) * 64 - Statics.field88;
                                    byte[] var40 = Statics.field201[var37];
                                    if (var40 == null && Statics.field1803 < 800) {
                                        method2475();
                                        class6.method508(var38, var39, 64, 64);
                                    }
                                }
                                method160(true);
                                int var41 = 0;
                                while (true) {
                                    if (var41 >= var22) {
                                        break label1211;
                                    }
                                    byte[] var42 = Statics.field315[var41];
                                    if (var42 != null) {
                                        int var43 = (Statics.field1751[var41] >> 8) * 64 - Statics.field439;
                                        int var44 = (Statics.field1751[var41] & 0xFF) * 64 - Statics.field88;
                                        method2475();
                                        class6.method2437(var42, var43, var44, Statics.field1866, field311);
                                    }
                                    var41++;
                                }
                            }
                            int var24 = (Statics.field1751[var23] >> 8) * 64 - Statics.field439;
                            int var25 = (Statics.field1751[var23] & 0xFF) * 64 - Statics.field88;
                            byte[] var26 = Statics.field201[var23];
                            if (var26 != null) {
                                method2475();
                                int var27 = Statics.field298 * 8 - 48;
                                int var28 = Statics.field1803 * 8 - 48;
                                class194[] var29 = field311;
                                int var30 = 0;
                                label1208: while (true) {
                                    if (var30 >= 4) {
                                        class107 var33 = new class107(var26);
                                        int var34 = 0;
                                        while (true) {
                                            if (var34 >= 4) {
                                                break label1208;
                                            }
                                            for (int var35 = 0; var35 < 64; var35++) {
                                                for (int var36 = 0; var36 < 64; var36++) {
                                                    class6.method2671(var33, var34, var24 + var35, var25 + var36, var27, var28, 0);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                    for (int var31 = 0; var31 < 64; var31++) {
                                        for (int var32 = 0; var32 < 64; var32++) {
                                            if (var24 + var31 > 0 && var24 + var31 < 103 && var25 + var32 > 0 && var25 + var32 < 103) {
                                                var29[var30].field2923[var24 + var31][var25 + var32] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var30++;
                                }
                            }
                            var23++;
                        }
                    }
                    if (field317) {
                        int var45 = 0;
                        label1157: while (true) {
                            if (var45 >= 4) {
                                for (int var83 = 0; var83 < 13; var83++) {
                                    for (int var84 = 0; var84 < 13; var84++) {
                                        int var85 = field318[0][var83][var84];
                                        if (var85 == -1) {
                                            class6.method508(var83 * 8, var84 * 8, 8, 8);
                                        }
                                    }
                                }
                                method160(true);
                                int var86 = 0;
                                while (true) {
                                    if (var86 >= 4) {
                                        break label1157;
                                    }
                                    method2475();
                                    for (int var87 = 0; var87 < 13; var87++) {
                                        label1046: for (int var88 = 0; var88 < 13; var88++) {
                                            int var89 = field318[var86][var87][var88];
                                            if (var89 != -1) {
                                                int var90 = var89 >> 24 & 0x3;
                                                int var91 = var89 >> 1 & 0x3;
                                                int var92 = var89 >> 14 & 0x3FF;
                                                int var93 = var89 >> 3 & 0x7FF;
                                                int var94 = (var92 / 8 << 8) + var93 / 8;
                                                for (int var95 = 0; var95 < Statics.field1751.length; var95++) {
                                                    if (Statics.field1751[var95] == var94 && Statics.field315[var95] != null) {
                                                        byte[] var96 = Statics.field315[var95];
                                                        int var97 = var87 * 8;
                                                        int var98 = var88 * 8;
                                                        int var99 = (var92 & 0x7) * 8;
                                                        int var100 = (var93 & 0x7) * 8;
                                                        class79 var101 = Statics.field1866;
                                                        class194[] var102 = field311;
                                                        class107 var103 = new class107(var96);
                                                        int var104 = -1;
                                                        while (true) {
                                                            int var105 = var103.method2167();
                                                            if (var105 == 0) {
                                                                continue label1046;
                                                            }
                                                            var104 += var105;
                                                            int var106 = 0;
                                                            while (true) {
                                                                int var107 = var103.method2167();
                                                                if (var107 == 0) {
                                                                    break;
                                                                }
                                                                var106 += var107 - 1;
                                                                int var108 = var106 & 0x3F;
                                                                int var109 = var106 >> 6 & 0x3F;
                                                                int var110 = var106 >> 12;
                                                                int var111 = var103.method2125();
                                                                int var112 = var111 >> 2;
                                                                int var113 = var111 & 0x3;
                                                                if (var90 == var110 && var109 >= var99 && var109 < var99 + 8 && var108 >= var100 && var108 < var100 + 8) {
                                                                    class36 var114 = class36.method1794(var104);
                                                                    int var115 = var97 + class154.method2470(var109 & 0x7, var108 & 0x7, var91, var114.field840, var114.field824, var113);
                                                                    int var116 = var98 + class154.method113(var109 & 0x7, var108 & 0x7, var91, var114.field840, var114.field824, var113);
                                                                    if (var115 > 0 && var116 > 0 && var115 < 103 && var116 < 103) {
                                                                        int var117 = var86;
                                                                        if ((class6.field82[1][var115][var116] & 0x2) == 2) {
                                                                            var117 = var86 - 1;
                                                                        }
                                                                        class194 var118 = null;
                                                                        if (var117 >= 0) {
                                                                            var118 = var102[var117];
                                                                        }
                                                                        class6.method850(var86, var115, var116, var104, var91 + var113 & 0x3, var112, var101, var118);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var86++;
                                }
                            }
                            method2475();
                            for (int var46 = 0; var46 < 13; var46++) {
                                for (int var47 = 0; var47 < 13; var47++) {
                                    boolean var48 = false;
                                    int var49 = field318[var45][var46][var47];
                                    if (var49 != -1) {
                                        int var50 = var49 >> 24 & 0x3;
                                        int var51 = var49 >> 1 & 0x3;
                                        int var52 = var49 >> 14 & 0x3FF;
                                        int var53 = var49 >> 3 & 0x7FF;
                                        int var54 = (var52 / 8 << 8) + var53 / 8;
                                        for (int var55 = 0; var55 < Statics.field1751.length; var55++) {
                                            if (Statics.field1751[var55] == var54 && Statics.field201[var55] != null) {
                                                byte[] var56 = Statics.field201[var55];
                                                int var57 = var46 * 8;
                                                int var58 = var47 * 8;
                                                int var59 = (var52 & 0x7) * 8;
                                                int var60 = (var53 & 0x7) * 8;
                                                class194[] var61 = field311;
                                                for (int var62 = 0; var62 < 8; var62++) {
                                                    for (int var63 = 0; var63 < 8; var63++) {
                                                        if (var57 + var62 > 0 && var57 + var62 < 103 && var58 + var63 > 0 && var58 + var63 < 103) {
                                                            var61[var45].field2923[var57 + var62][var58 + var63] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var64 = new class107(var56);
                                                for (int var65 = 0; var65 < 4; var65++) {
                                                    for (int var66 = 0; var66 < 64; var66++) {
                                                        for (int var67 = 0; var67 < 64; var67++) {
                                                            if (var50 == var65 && var66 >= var59 && var66 < var59 + 8 && var67 >= var60 && var67 < var60 + 8) {
                                                                int var71 = var66 & 0x7;
                                                                int var72 = var67 & 0x7;
                                                                int var74 = var51 & 0x3;
                                                                int var75;
                                                                if (var74 == 0) {
                                                                    var75 = var71;
                                                                } else if (var74 == 1) {
                                                                    var75 = var72;
                                                                } else if (var74 == 2) {
                                                                    var75 = 7 - var71;
                                                                } else {
                                                                    var75 = 7 - var72;
                                                                }
                                                                class6.method2671(var64, var45, var57 + var75, var58 + class154.method161(var66 & 0x7, var67 & 0x7, var51), 0, 0, var51);
                                                            } else {
                                                                class6.method2671(var64, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var48 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var48) {
                                        int var76 = var45;
                                        int var77 = var46 * 8;
                                        int var78 = var47 * 8;
                                        for (int var79 = 0; var79 < 8; var79++) {
                                            for (int var80 = 0; var80 < 8; var80++) {
                                                class6.field91[var76][var77 + var79][var78 + var80] = 0;
                                            }
                                        }
                                        if (var77 > 0) {
                                            for (int var81 = 1; var81 < 8; var81++) {
                                                class6.field91[var76][var77][var78 + var81] = class6.field91[var76][var77 - 1][var78 + var81];
                                            }
                                        }
                                        if (var78 > 0) {
                                            for (int var82 = 1; var82 < 8; var82++) {
                                                class6.field91[var76][var77 + var82][var78] = class6.field91[var76][var77 + var82][var78 - 1];
                                            }
                                        }
                                        if (var77 > 0 && class6.field91[var76][var77 - 1][var78] != 0) {
                                            class6.field91[var76][var77][var78] = class6.field91[var76][var77 - 1][var78];
                                        } else if (var78 > 0 && class6.field91[var76][var77][var78 - 1] != 0) {
                                            class6.field91[var76][var77][var78] = class6.field91[var76][var77][var78 - 1];
                                        } else if (var77 > 0 && var78 > 0 && class6.field91[var76][var77 - 1][var78 - 1] != 0) {
                                            class6.field91[var76][var77][var78] = class6.field91[var76][var77 - 1][var78 - 1];
                                        }
                                    }
                                }
                            }
                            var45++;
                        }
                    }
                    method160(true);
                    method1974();
                    method2475();
                    class79 var119 = Statics.field1866;
                    class194[] var120 = field311;
                    for (int var121 = 0; var121 < 4; var121++) {
                        for (int var122 = 0; var122 < 104; var122++) {
                            for (int var123 = 0; var123 < 104; var123++) {
                                if ((class6.field82[var121][var122][var123] & 0x1) == 1) {
                                    int var124 = var121;
                                    if ((class6.field82[1][var122][var123] & 0x2) == 2) {
                                        var124 = var121 - 1;
                                    }
                                    if (var124 >= 0) {
                                        var120[var124].method3468(var122, var123);
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
                    class6.field98 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field98 < -16) {
                        class6.field98 = -16;
                    }
                    if (class6.field98 > 16) {
                        class6.field98 = 16;
                    }
                    for (int var125 = 0; var125 < 4; var125++) {
                        byte[][] var126 = Statics.field2468[var125];
                        int var127 = (int) Math.sqrt(5100.0D);
                        int var128 = var127 * 768 >> 8;
                        for (int var129 = 1; var129 < 103; var129++) {
                            for (int var130 = 1; var130 < 103; var130++) {
                                int var131 = class6.field91[var125][var130 + 1][var129] - class6.field91[var125][var130 - 1][var129];
                                int var132 = class6.field91[var125][var130][var129 + 1] - class6.field91[var125][var130][var129 - 1];
                                int var133 = (int) Math.sqrt((double) (var132 * var132 + var131 * var131 + 65536));
                                int var134 = (var131 << 8) / var133;
                                int var135 = 65536 / var133;
                                int var136 = (var132 << 8) / var133;
                                int var137 = (var136 * -50 + var134 * -50 + var135 * -10) / var128 + 96;
                                int var138 = (var126[var130][var129] >> 1) + (var126[var130][var129 + 1] >> 3) + (var126[var130][var129 - 1] >> 2) + (var126[var130 - 1][var129] >> 2) + (var126[var130 + 1][var129] >> 3);
                                Statics.field1923[var130][var129] = var137 - var138;
                            }
                        }
                        for (int var139 = 0; var139 < 104; var139++) {
                            Statics.field87[var139] = 0;
                            Statics.field781[var139] = 0;
                            Statics.field84[var139] = 0;
                            Statics.field2028[var139] = 0;
                            Statics.field2659[var139] = 0;
                        }
                        for (int var140 = -5; var140 < 109; var140++) {
                            for (int var141 = 0; var141 < 104; var141++) {
                                int var142 = var140 + 5;
                                int var10002;
                                if (var142 >= 0 && var142 < 104) {
                                    int var143 = Statics.field89[var125][var142][var141] & 0xFF;
                                    if (var143 > 0) {
                                        int var144 = var143 - 1;
                                        class37 var145 = (class37) class37.field881.method3166((long) var144);
                                        class37 var146;
                                        if (var145 == null) {
                                            byte[] var147 = Statics.field882.method2717(1, var144);
                                            class37 var148 = new class37();
                                            if (var147 != null) {
                                                var148.method700(new class107(var147), var144);
                                            }
                                            var148.method712();
                                            class37.field881.method3161(var148, (long) var144);
                                            var146 = var148;
                                        } else {
                                            var146 = var145;
                                        }
                                        Statics.field87[var141] += var146.field879;
                                        Statics.field781[var141] += var146.field883;
                                        Statics.field84[var141] += var146.field884;
                                        Statics.field2028[var141] += var146.field885;
                                        var10002 = Statics.field2659[var141]++;
                                    }
                                }
                                int var150 = var140 - 5;
                                if (var150 >= 0 && var150 < 104) {
                                    int var151 = Statics.field89[var125][var150][var141] & 0xFF;
                                    if (var151 > 0) {
                                        int var152 = var151 - 1;
                                        class37 var153 = (class37) class37.field881.method3166((long) var152);
                                        class37 var154;
                                        if (var153 == null) {
                                            byte[] var155 = Statics.field882.method2717(1, var152);
                                            class37 var156 = new class37();
                                            if (var155 != null) {
                                                var156.method700(new class107(var155), var152);
                                            }
                                            var156.method712();
                                            class37.field881.method3161(var156, (long) var152);
                                            var154 = var156;
                                        } else {
                                            var154 = var153;
                                        }
                                        Statics.field87[var141] -= var154.field879;
                                        Statics.field781[var141] -= var154.field883;
                                        Statics.field84[var141] -= var154.field884;
                                        Statics.field2028[var141] -= var154.field885;
                                        var10002 = Statics.field2659[var141]--;
                                    }
                                }
                            }
                            if (var140 >= 1 && var140 < 103) {
                                int var158 = 0;
                                int var159 = 0;
                                int var160 = 0;
                                int var161 = 0;
                                int var162 = 0;
                                for (int var163 = -5; var163 < 109; var163++) {
                                    int var164 = var163 + 5;
                                    if (var164 >= 0 && var164 < 104) {
                                        var158 += Statics.field87[var164];
                                        var159 += Statics.field781[var164];
                                        var160 += Statics.field84[var164];
                                        var161 += Statics.field2028[var164];
                                        var162 += Statics.field2659[var164];
                                    }
                                    int var165 = var163 - 5;
                                    if (var165 >= 0 && var165 < 104) {
                                        var158 -= Statics.field87[var165];
                                        var159 -= Statics.field781[var165];
                                        var160 -= Statics.field84[var165];
                                        var161 -= Statics.field2028[var165];
                                        var162 -= Statics.field2659[var165];
                                    }
                                    if (var163 >= 1 && var163 < 103 && (!field260 || (class6.field82[0][var140][var163] & 0x2) != 0 || (class6.field82[var125][var140][var163] & 0x10) == 0 && class6.method500(var125, var140, var163) == field449)) {
                                        if (var125 < class6.field99) {
                                            class6.field99 = var125;
                                        }
                                        int var166 = Statics.field89[var125][var140][var163] & 0xFF;
                                        int var167 = Statics.field83[var125][var140][var163] & 0xFF;
                                        if (var166 > 0 || var167 > 0) {
                                            int var168 = class6.field91[var125][var140][var163];
                                            int var169 = class6.field91[var125][var140 + 1][var163];
                                            int var170 = class6.field91[var125][var140 + 1][var163 + 1];
                                            int var171 = class6.field91[var125][var140][var163 + 1];
                                            int var172 = Statics.field1923[var140][var163];
                                            int var173 = Statics.field1923[var140 + 1][var163];
                                            int var174 = Statics.field1923[var140 + 1][var163 + 1];
                                            int var175 = Statics.field1923[var140][var163 + 1];
                                            int var176 = -1;
                                            int var177 = -1;
                                            if (var166 > 0) {
                                                int var178 = var158 * 256 / var161;
                                                int var179 = var159 / var162;
                                                int var180 = var160 / var162;
                                                var176 = class6.method149(var178, var179, var180);
                                                int var181 = class6.field97 + var178 & 0xFF;
                                                int var182 = class6.field98 + var180;
                                                if (var182 < 0) {
                                                    var182 = 0;
                                                } else if (var182 > 255) {
                                                    var182 = 255;
                                                }
                                                var177 = class6.method149(var181, var179, var182);
                                            }
                                            if (var125 > 0) {
                                                boolean var183 = true;
                                                if (var166 == 0 && Statics.field86[var125][var140][var163] != 0) {
                                                    var183 = false;
                                                }
                                                if (var167 > 0) {
                                                    int var184 = var167 - 1;
                                                    class41 var185 = (class41) class41.field950.method3166((long) var184);
                                                    class41 var186;
                                                    if (var185 == null) {
                                                        byte[] var187 = Statics.field956.method2717(4, var184);
                                                        class41 var188 = new class41();
                                                        if (var187 != null) {
                                                            var188.method821(new class107(var187), var184);
                                                        }
                                                        var188.method811();
                                                        class41.field950.method3161(var188, (long) var184);
                                                        var186 = var188;
                                                    } else {
                                                        var186 = var185;
                                                    }
                                                    if (!var186.field953) {
                                                        var183 = false;
                                                    }
                                                }
                                                if (var183 && var168 == var169 && var168 == var170 && var168 == var171) {
                                                    Statics.field81[var125][var140][var163] |= 0x924;
                                                }
                                            }
                                            int var189 = 0;
                                            if (var177 != -1) {
                                                var189 = class84.field1463[class6.method97(var177, 96)];
                                            }
                                            if (var167 == 0) {
                                                var119.method1614(var125, var140, var163, 0, 0, -1, var168, var169, var170, var171, class6.method97(var176, var172), class6.method97(var176, var173), class6.method97(var176, var174), class6.method97(var176, var175), 0, 0, 0, 0, var189, 0);
                                            } else {
                                                int var190 = Statics.field86[var125][var140][var163] + 1;
                                                byte var191 = Statics.field2648[var125][var140][var163];
                                                int var192 = var167 - 1;
                                                class41 var193 = (class41) class41.field950.method3166((long) var192);
                                                class41 var194;
                                                if (var193 == null) {
                                                    byte[] var195 = Statics.field956.method2717(4, var192);
                                                    class41 var196 = new class41();
                                                    if (var195 != null) {
                                                        var196.method821(new class107(var195), var192);
                                                    }
                                                    var196.method811();
                                                    class41.field950.method3161(var196, (long) var192);
                                                    var194 = var196;
                                                } else {
                                                    var194 = var193;
                                                }
                                                int var198 = var194.field958;
                                                int var199;
                                                int var200;
                                                if (var198 >= 0) {
                                                    var199 = Statics.field1466.method1851(var198);
                                                    var200 = -1;
                                                } else if (var194.field960 == 16711935) {
                                                    var200 = -2;
                                                    var198 = -1;
                                                    var199 = -2;
                                                } else {
                                                    var200 = class6.method149(var194.field955, var194.field962, var194.field957);
                                                    int var201 = class6.field97 + var194.field955 & 0xFF;
                                                    int var202 = class6.field98 + var194.field957;
                                                    if (var202 < 0) {
                                                        var202 = 0;
                                                    } else if (var202 > 255) {
                                                        var202 = 255;
                                                    }
                                                    var199 = class6.method149(var201, var194.field962, var202);
                                                }
                                                int var203 = 0;
                                                if (var199 != -2) {
                                                    var203 = class84.field1463[class6.method151(var199, 96)];
                                                }
                                                if (var194.field965 != -1) {
                                                    int var204 = class6.field97 + var194.field949 & 0xFF;
                                                    int var205 = class6.field98 + var194.field954;
                                                    if (var205 < 0) {
                                                        var205 = 0;
                                                    } else if (var205 > 255) {
                                                        var205 = 255;
                                                    }
                                                    int var206 = class6.method149(var204, var194.field959, var205);
                                                    var203 = class84.field1463[class6.method151(var206, 96)];
                                                }
                                                var119.method1614(var125, var140, var163, var190, var191, var198, var168, var169, var170, var171, class6.method97(var176, var172), class6.method97(var176, var173), class6.method97(var176, var174), class6.method97(var176, var175), class6.method151(var200, var172), class6.method151(var200, var173), class6.method151(var200, var174), class6.method151(var200, var175), var189, var203);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var207 = 1; var207 < 103; var207++) {
                            for (int var208 = 1; var208 < 103; var208++) {
                                var119.method1613(var125, var208, var207, class6.method500(var125, var208, var207));
                            }
                        }
                        Statics.field89[var125] = (byte[][]) null;
                        Statics.field83[var125] = (byte[][]) null;
                        Statics.field86[var125] = (byte[][]) null;
                        Statics.field2648[var125] = (byte[][]) null;
                        Statics.field2468[var125] = (byte[][]) null;
                    }
                    var119.method1640(-50, -10, -50);
                    for (int var209 = 0; var209 < 104; var209++) {
                        for (int var210 = 0; var210 < 104; var210++) {
                            if ((class6.field82[1][var209][var210] & 0x2) == 2) {
                                var119.method1611(var209, var210);
                            }
                        }
                    }
                    int var211 = 1;
                    int var212 = 2;
                    int var213 = 4;
                    for (int var214 = 0; var214 < 4; var214++) {
                        if (var214 > 0) {
                            var211 <<= 0x3;
                            var212 <<= 0x3;
                            var213 <<= 0x3;
                        }
                        for (int var215 = 0; var215 <= var214; var215++) {
                            for (int var216 = 0; var216 <= 104; var216++) {
                                for (int var217 = 0; var217 <= 104; var217++) {
                                    if ((Statics.field81[var215][var217][var216] & var211) != 0) {
                                        int var218 = var216;
                                        int var219 = var216;
                                        int var220 = var215;
                                        int var221 = var215;
                                        while (var218 > 0 && (Statics.field81[var215][var217][var218 - 1] & var211) != 0) {
                                            var218--;
                                        }
                                        while (var219 < 104 && (Statics.field81[var215][var217][var219 + 1] & var211) != 0) {
                                            var219++;
                                        }
                                        label770: while (var220 > 0) {
                                            for (int var222 = var218; var222 <= var219; var222++) {
                                                if ((Statics.field81[var220 - 1][var217][var222] & var211) == 0) {
                                                    break label770;
                                                }
                                            }
                                            var220--;
                                        }
                                        label759: while (var221 < var214) {
                                            for (int var223 = var218; var223 <= var219; var223++) {
                                                if ((Statics.field81[var221 + 1][var217][var223] & var211) == 0) {
                                                    break label759;
                                                }
                                            }
                                            var221++;
                                        }
                                        int var224 = (var221 + 1 - var220) * (var219 - var218 + 1);
                                        if (var224 >= 8) {
                                            short var225 = 240;
                                            int var226 = class6.field91[var221][var217][var218] - var225;
                                            int var227 = class6.field91[var220][var217][var218];
                                            class79.method1623(var214, 1, var217 * 128, var217 * 128, var218 * 128, var219 * 128 + 128, var226, var227);
                                            for (int var228 = var220; var228 <= var221; var228++) {
                                                for (int var229 = var218; var229 <= var219; var229++) {
                                                    Statics.field81[var228][var217][var229] &= ~var211;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field81[var215][var217][var216] & var212) != 0) {
                                        int var230 = var217;
                                        int var231 = var217;
                                        int var232 = var215;
                                        int var233 = var215;
                                        while (var230 > 0 && (Statics.field81[var215][var230 - 1][var216] & var212) != 0) {
                                            var230--;
                                        }
                                        while (var231 < 104 && (Statics.field81[var215][var231 + 1][var216] & var212) != 0) {
                                            var231++;
                                        }
                                        label823: while (var232 > 0) {
                                            for (int var234 = var230; var234 <= var231; var234++) {
                                                if ((Statics.field81[var232 - 1][var234][var216] & var212) == 0) {
                                                    break label823;
                                                }
                                            }
                                            var232--;
                                        }
                                        label812: while (var233 < var214) {
                                            for (int var235 = var230; var235 <= var231; var235++) {
                                                if ((Statics.field81[var233 + 1][var235][var216] & var212) == 0) {
                                                    break label812;
                                                }
                                            }
                                            var233++;
                                        }
                                        int var236 = (var233 + 1 - var232) * (var231 - var230 + 1);
                                        if (var236 >= 8) {
                                            short var237 = 240;
                                            int var238 = class6.field91[var233][var230][var216] - var237;
                                            int var239 = class6.field91[var232][var230][var216];
                                            class79.method1623(var214, 2, var230 * 128, var231 * 128 + 128, var216 * 128, var216 * 128, var238, var239);
                                            for (int var240 = var232; var240 <= var233; var240++) {
                                                for (int var241 = var230; var241 <= var231; var241++) {
                                                    Statics.field81[var240][var241][var216] &= ~var212;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field81[var215][var217][var216] & var213) != 0) {
                                        int var242 = var217;
                                        int var243 = var217;
                                        int var244 = var216;
                                        int var245 = var216;
                                        while (var244 > 0 && (Statics.field81[var215][var217][var244 - 1] & var213) != 0) {
                                            var244--;
                                        }
                                        while (var245 < 104 && (Statics.field81[var215][var217][var245 + 1] & var213) != 0) {
                                            var245++;
                                        }
                                        label876: while (var242 > 0) {
                                            for (int var246 = var244; var246 <= var245; var246++) {
                                                if ((Statics.field81[var215][var242 - 1][var246] & var213) == 0) {
                                                    break label876;
                                                }
                                            }
                                            var242--;
                                        }
                                        label865: while (var243 < 104) {
                                            for (int var247 = var244; var247 <= var245; var247++) {
                                                if ((Statics.field81[var215][var243 + 1][var247] & var213) == 0) {
                                                    break label865;
                                                }
                                            }
                                            var243++;
                                        }
                                        if ((var243 - var242 + 1) * (var245 - var244 + 1) >= 4) {
                                            int var248 = class6.field91[var215][var242][var244];
                                            class79.method1623(var214, 4, var242 * 128, var243 * 128 + 128, var244 * 128, var245 * 128 + 128, var248, var248);
                                            for (int var249 = var242; var249 <= var243; var249++) {
                                                for (int var250 = var244; var250 <= var245; var250++) {
                                                    Statics.field81[var215][var249][var250] &= ~var213;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method160(true);
                    int var251 = class6.field99;
                    if (var251 > Statics.field930) {
                        var251 = Statics.field930;
                    }
                    if (var251 < Statics.field930 - 1) {
                        int var252 = Statics.field930 - 1;
                    }
                    if (field260) {
                        Statics.field1866.method1610(class6.field99);
                    } else {
                        Statics.field1866.method1610(0);
                    }
                    for (int var253 = 0; var253 < 104; var253++) {
                        for (int var254 = 0; var254 < 104; var254++) {
                            method2894(var253, var254);
                        }
                    }
                    method2475();
                    method2505();
                    class36.field839.method3162();
                    if (Statics.field611 != null) {
                        field296.method2374(7);
                        field296.method2130(1057001181);
                    }
                    if (!field317) {
                        int var255 = (Statics.field298 - 6) / 8;
                        int var256 = (Statics.field298 + 6) / 8;
                        int var257 = (Statics.field1803 - 6) / 8;
                        int var258 = (Statics.field1803 + 6) / 8;
                        for (int var259 = var255 - 1; var259 <= var256 + 1; var259++) {
                            for (int var260 = var257 - 1; var260 <= var258 + 1; var260++) {
                                if (var259 < var255 || var259 > var256 || var260 < var257 || var260 > var258) {
                                    Statics.field1814.method2786("m" + var259 + "_" + var260);
                                    Statics.field1814.method2786("l" + var259 + "_" + var260);
                                }
                            }
                        }
                    }
                    method1871(30);
                    method2475();
                    Statics.field89 = (byte[][][]) null;
                    Statics.field83 = (byte[][][]) null;
                    Statics.field86 = (byte[][][]) null;
                    Statics.field2648 = (byte[][][]) null;
                    Statics.field81 = (int[][][]) null;
                    Statics.field2468 = (byte[][][]) null;
                    Statics.field1923 = (int[][]) null;
                    Statics.field87 = null;
                    Statics.field781 = null;
                    Statics.field84 = null;
                    Statics.field2028 = null;
                    Statics.field2659 = null;
                    field296.method2374(146);
                    Statics.method834();
                } else {
                    field314 = 2;
                }
            } else {
                field314 = 1;
            }
        }
        if (field263 == 30) {
            method26();
        } else if (field263 == 40 || field263 == 45) {
            method3();
        }
    }

    @ObfuscatedName("client.t(B)V")
    public final void method257() {
        boolean var1;
        label210: {
            try {
                if (class160.field2695 == 2) {
                    if (Statics.field2688 == null) {
                        Statics.field2688 = class157.method2954(Statics.field997, Statics.field227, Statics.field2692);
                        if (Statics.field2688 == null) {
                            var1 = false;
                            break label210;
                        }
                    }
                    if (Statics.field225 == null) {
                        Statics.field225 = new class53(Statics.field2689, Statics.field1904);
                    }
                    if (Statics.field2690.method3024(Statics.field2688, Statics.field2691, Statics.field225, 22050)) {
                        Statics.field2690.method3025();
                        Statics.field2690.method3022(Statics.field1264);
                        Statics.field2690.method3027(Statics.field2688, Statics.field709);
                        class160.field2695 = 0;
                        Statics.field2688 = null;
                        Statics.field225 = null;
                        Statics.field997 = null;
                        var1 = true;
                        break label210;
                    }
                }
            } catch (Exception var23) {
                var23.printStackTrace();
                Statics.field2690.method3103();
                class160.field2695 = 0;
                Statics.field2688 = null;
                Statics.field225 = null;
                Statics.field997 = null;
            }
            var1 = false;
        }
        if (var1 && field490 && Statics.field14 != null) {
            Statics.field14.method1023();
        }
        if (field2057) {
            Canvas var4 = Statics.field1007;
            var4.removeKeyListener(class124.field1978);
            var4.removeFocusListener(class124.field1978);
            class124.field1971 = -1;
            class127.method76(Statics.field1007);
            if (Statics.field2896 != null) {
                Statics.field2896.method2440(Statics.field1007);
            }
            this.method2597();
            Canvas var5 = Statics.field1007;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1978);
            var5.addFocusListener(class124.field1978);
            class127.method2064(Statics.field1007);
            if (Statics.field2896 != null) {
                Statics.field2896.method2439(Statics.field1007);
            }
        }
        if (field263 == 0) {
            class131.method848(class28.field651, class28.field654, (Color) null);
        } else if (field263 == 5) {
            class28.method1602(Statics.field1896, Statics.field522);
        } else if (field263 == 10) {
            class28.method1602(Statics.field1896, Statics.field522);
        } else if (field263 == 20) {
            class28.method1602(Statics.field1896, Statics.field522);
        } else if (field263 == 25) {
            if (field314 == 1) {
                if (field336 > field277) {
                    field277 = field336;
                }
                int var6 = (field277 * 50 - field336 * 50) / field277;
                method145(class142.field2151 + class2.field25 + class2.field19 + var6 + "%" + class2.field23, false);
            } else if (field314 == 2) {
                if (field312 > field370) {
                    field370 = field312;
                }
                int var7 = (field370 * 50 - field312 * 50) / field370 + 50;
                method145(class142.field2151 + class2.field25 + class2.field19 + var7 + "%" + class2.field23, false);
            } else {
                method145(class142.field2151, false);
            }
        } else if (field263 == 30) {
            if (field417 != -1) {
                method1421(field417);
            }
            for (int var8 = 0; var8 < field459; var8++) {
                if (field418[var8]) {
                    field462[var8] = true;
                }
                field284[var8] = field418[var8];
                field418[var8] = false;
            }
            field460 = field265;
            field407 = -1;
            field329 = -1;
            Statics.field519 = null;
            if (field417 != -1) {
                field459 = 0;
                method1606(field417, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1522();
            if (field515) {
                method144();
            } else if (field407 != -1) {
                int var9 = field407;
                int var10 = field329;
                if (field400 >= 2 || field411 != 0 || field413) {
                    String var11;
                    if (field411 == 1 && field400 < 2) {
                        var11 = class142.field2283 + class142.field2293 + field269 + " " + class2.field21;
                    } else if (field413 && field400 < 2) {
                        var11 = field415 + class142.field2293 + field416 + " " + class2.field21;
                    } else {
                        int var12 = field400 - 1;
                        String var13;
                        if (field503[var12].length() > 0) {
                            var13 = field276[var12] + class142.field2293 + field503[var12];
                        } else {
                            var13 = field276[var12];
                        }
                        var11 = var13;
                    }
                    if (field400 > 2) {
                        var11 = var11 + class2.method85(16777215) + " " + '/' + " " + (field400 - 2) + class142.field2287;
                    }
                    Statics.field1896.method3339(var11, var9 + 4, var10 + 15, 16777215, 0, field265 / 1000);
                }
            }
            if (field399 == 3) {
                for (int var14 = 0; var14 < field459; var14++) {
                    if (field284[var14]) {
                        class73.method1527(field508[var14], field465[var14], field295[var14], field467[var14], 16711935, 128);
                    } else if (field462[var14]) {
                        class73.method1527(field508[var14], field465[var14], field295[var14], field467[var14], 16711680, 128);
                    }
                }
            }
            class20.method116(Statics.field930, Statics.field521.field729, Statics.field521.field740, field332);
            field332 = 0;
        } else if (field263 == 40) {
            method145(class142.field2152 + class2.field25 + class142.field2153, false);
        } else if (field263 == 45) {
            method145(class142.field2370, false);
        }
        if (field263 == 30 && field399 == 0 && !field2049) {
            try {
                Graphics var15 = Statics.field1007.getGraphics();
                for (int var16 = 0; var16 < field459; var16++) {
                    if (field462[var16]) {
                        Statics.field857.method1359(var15, field508[var16], field465[var16], field295[var16], field467[var16]);
                        field462[var16] = false;
                    }
                }
            } catch (Exception var22) {
                Statics.field1007.repaint();
            }
        } else if (field263 > 0) {
            try {
                Graphics var18 = Statics.field1007.getGraphics();
                Statics.field857.method1358(var18, 0, 0);
                field2049 = false;
                for (int var19 = 0; var19 < field459; var19++) {
                    field462[var19] = false;
                }
            } catch (Exception var21) {
                Statics.field1007.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method168() {
        if (Statics.field1879 != null) {
            Statics.field1879.field191 = false;
        }
        Statics.field1879 = null;
        if (Statics.field18 != null) {
            Statics.field18.method2577();
            Statics.field18 = null;
        }
        if (class124.field1978 != null) {
            class124 var1 = class124.field1978;
            synchronized (class124.field1978) {
                class124.field1978 = null;
            }
        }
        class127.method139();
        Statics.field2896 = null;
        if (Statics.field14 != null) {
            Statics.field14.method1024();
        }
        if (Statics.field2742 != null) {
            Statics.field2742.method1024();
        }
        class149.method23();
        class148.method2424();
        try {
            class136.field2095.method3459();
            for (int var3 = 0; var3 < Statics.field2089; var3++) {
                Statics.field2096[var3].method3459();
            }
            class136.field2084.method3459();
            class136.field2093.method3459();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("cz.f(IS)V")
    public static void method1871(int arg0) {
        if (field263 == arg0) {
            return;
        }
        if (field263 == 0) {
            Statics.field2534 = null;
            Statics.field1280 = null;
            Statics.field948 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field288 = 0;
            field289 = 0;
            field294 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field387 != null) {
            Statics.field387.method2577();
            Statics.field387 = null;
        }
        if (field263 == 25) {
            field314 = 0;
            field336 = 0;
            field277 = 1;
            field312 = 0;
            field370 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class28.method1424(Statics.field1007, Statics.field1638, Statics.field1907);
        } else {
            class28.method143();
        }
        field263 = arg0;
    }

    @ObfuscatedName("client.c(I)V")
    public void method169() {
        if (field263 != 1000) {
            boolean var1 = class149.method2700();
            if (!var1) {
                this.method170();
            }
        }
    }

    @ObfuscatedName("client.i(B)V")
    public void method170() {
        if (class149.field2479 >= 4) {
            this.method2606("js5crc");
            field263 = 1000;
            return;
        }
        if (class149.field2498 >= 4) {
            if (field263 <= 5) {
                this.method2606("js5io");
                field263 = 1000;
                return;
            }
            field286 = 3000;
            class149.field2498 = 3;
        }
        if (--field286 + 1 > 0) {
            return;
        }
        try {
            if (field285 == 0) {
                Statics.field350 = Statics.field1920.method2483(Statics.field22, Statics.field1278);
                field285++;
            }
            if (field285 == 1) {
                if (Statics.field350.field2071 == 2) {
                    this.method302(-1);
                    return;
                }
                if (Statics.field350.field2071 == 1) {
                    field285++;
                }
            }
            if (field285 == 2) {
                Statics.field2124 = new class130((Socket) Statics.field350.field2067, Statics.field1920);
                class107 var1 = new class107(5);
                var1.method2249(15);
                var1.method2130(47);
                Statics.field2124.method2576(var1.field1845, 0, 5);
                field285++;
                Statics.field1677 = class103.method527();
            }
            if (field285 == 3) {
                if (field263 <= 5 || Statics.field2124.method2578() > 0) {
                    int var2 = Statics.field2124.method2594();
                    if (var2 != 0) {
                        this.method302(var2);
                        return;
                    }
                    field285++;
                } else if (class103.method527() - Statics.field1677 > 30000L) {
                    this.method302(-2);
                    return;
                }
            }
            if (field285 == 4) {
                class149.method1886(Statics.field2124, field263 > 20);
                Statics.field350 = null;
                Statics.field2124 = null;
                field285 = 0;
                field287 = 0;
            }
        } catch (IOException var4) {
            this.method302(-3);
        }
    }

    @ObfuscatedName("client.o(II)V")
    public void method302(int arg0) {
        Statics.field350 = null;
        Statics.field2124 = null;
        field285 = 0;
        if (Statics.field1278 == Statics.field103) {
            Statics.field1278 = Statics.field1755;
        } else {
            Statics.field1278 = Statics.field103;
        }
        field287++;
        if (field287 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field263 <= 5) {
                this.method2606("js5connect_full");
                field263 = 1000;
            } else {
                field286 = 3000;
            }
        } else if (field287 >= 2 && arg0 == 6) {
            this.method2606("js5connect_outofdate");
            field263 = 1000;
        } else if (field287 >= 4) {
            if (field263 <= 5) {
                this.method2606("js5connect");
                field263 = 1000;
            } else {
                field286 = 3000;
            }
        }
    }

    @ObfuscatedName("h.d(I)V")
    public static void method529() {
        if (field283 == 0) {
            Statics.field1866 = new class79(4, 104, 104, class6.field91);
            for (int var0 = 0; var0 < 4; var0++) {
                field311[var0] = new class194(104, 104);
            }
            Statics.field237 = new class72(512, 512);
            class28.field654 = class142.field2154;
            class28.field651 = 5;
            field283 = 20;
        } else if (field283 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1469[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1644(var1, 500, 800, 512, 334);
            class28.field654 = class142.field2155;
            class28.field651 = 10;
            field283 = 30;
        } else if (field283 == 30) {
            Statics.field2478 = method2528(0, false, true, true);
            Statics.field1900 = method2528(1, false, true, true);
            Statics.field32 = method2528(2, true, false, true);
            Statics.field204 = method2528(3, false, true, true);
            Statics.field142 = method2528(4, false, true, true);
            Statics.field1814 = method2528(5, true, true, true);
            Statics.field2469 = method2528(6, true, true, false);
            Statics.field1822 = method2528(7, false, true, true);
            Statics.field1907 = method2528(8, false, true, true);
            Statics.field1895 = method2528(9, false, true, true);
            Statics.field1638 = method2528(10, false, true, true);
            Statics.field151 = method2528(11, false, true, true);
            Statics.field621 = method2528(12, false, true, true);
            Statics.field2034 = method2528(13, true, false, true);
            Statics.field1258 = method2528(14, false, true, false);
            Statics.field996 = method2528(15, false, true, true);
            class28.field654 = class142.field2156;
            class28.field651 = 20;
            field283 = 40;
        } else if (field283 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2478.method2794() * 4 / 100;
            int var8 = var7 + Statics.field1900.method2794() * 4 / 100;
            int var9 = var8 + Statics.field32.method2794() * 2 / 100;
            int var10 = var9 + Statics.field204.method2794() * 2 / 100;
            int var11 = var10 + Statics.field142.method2794() * 6 / 100;
            int var12 = var11 + Statics.field1814.method2794() * 4 / 100;
            int var13 = var12 + Statics.field2469.method2794() * 2 / 100;
            int var14 = var13 + Statics.field1822.method2794() * 60 / 100;
            int var15 = var14 + Statics.field1907.method2794() * 2 / 100;
            int var16 = var15 + Statics.field1895.method2794() * 2 / 100;
            int var17 = var16 + Statics.field1638.method2794() * 2 / 100;
            int var18 = var17 + Statics.field151.method2794() * 2 / 100;
            int var19 = var18 + Statics.field621.method2794() * 2 / 100;
            int var20 = var19 + Statics.field2034.method2794() * 2 / 100;
            int var21 = var20 + Statics.field1258.method2794() * 2 / 100;
            int var22 = var21 + Statics.field996.method2794() * 2 / 100;
            if (var22 == 100) {
                class28.field654 = class142.field2194;
                class28.field651 = 30;
                field283 = 45;
            } else {
                if (var22 != 0) {
                    class28.field654 = class142.field2157 + var22 + "%";
                }
                class28.field651 = 30;
            }
        } else if (field283 == 45) {
            boolean var23 = !field260;
            Statics.field1076 = 22050;
            Statics.field1066 = var23;
            Statics.field1893 = 2;
            class161 var24 = new class161();
            var24.method3021(9, 128);
            Statics.field14 = class50.method2660(Statics.field1920, Statics.field1007, 0, 22050);
            Statics.field14.method1020(var24);
            class146 var25 = Statics.field996;
            class146 var26 = Statics.field1258;
            class146 var27 = Statics.field142;
            Statics.field2691 = var25;
            Statics.field1904 = var26;
            Statics.field2689 = var27;
            Statics.field2690 = var24;
            Statics.field2742 = class50.method2660(Statics.field1920, Statics.field1007, 1, 2048);
            Statics.field1654 = new class49();
            Statics.field2742.method1020(Statics.field1654);
            Statics.field549 = new class68(22050, Statics.field1076);
            class28.field654 = class142.field2159;
            class28.field651 = 35;
            field283 = 50;
        } else if (field283 == 50) {
            int var28 = 0;
            if (Statics.field522 == null) {
                Statics.field522 = class70.method99(Statics.field1907, Statics.field2034, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = class70.method99(Statics.field1907, Statics.field2034, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1896 == null) {
                Statics.field1896 = class70.method99(Statics.field1907, Statics.field2034, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field654 = class142.field2160 + var28 * 100 / 3 + "%";
                class28.field651 = 40;
            } else {
                Statics.field2047 = new class144(true);
                class28.field654 = class142.field2161;
                class28.field651 = 40;
                field283 = 60;
            }
        } else if (field283 == 60) {
            int var29 = class28.method579(Statics.field1638, Statics.field1907);
            byte var30 = 6;
            if (var29 < var30) {
                class28.field654 = class142.field2286 + var29 * 100 / var30 + "%";
                class28.field651 = 50;
            } else {
                class28.field654 = class142.field2163;
                class28.field651 = 50;
                method1871(5);
                field283 = 70;
            }
        } else if (field283 == 70) {
            if (Statics.field32.method2721()) {
                class41.method27(Statics.field32);
                class37.method532(Statics.field32);
                class40.method574(Statics.field32, Statics.field1822);
                class36.method2845(Statics.field32, Statics.field1822, field260);
                class146 var32 = Statics.field32;
                class146 var33 = Statics.field1822;
                Statics.field811 = var32;
                Statics.field805 = var33;
                class45.method481(Statics.field32, Statics.field1822, field259, Statics.field522);
                class38.method2376(Statics.field32, Statics.field2478, Statics.field1900);
                class146 var34 = Statics.field32;
                class146 var35 = Statics.field1822;
                Statics.field924 = var34;
                Statics.field913 = var35;
                class42.method524(Statics.field32);
                class46.method20(Statics.field32);
                class151.method2422(Statics.field204, Statics.field1822, Statics.field1907, Statics.field2034);
                class44.method73(Statics.field32);
                class146 var36 = Statics.field32;
                Statics.field977 = var36;
                class28.field654 = class142.field2379;
                class28.field651 = 60;
                field283 = 80;
            } else {
                class28.field654 = class142.field2164 + Statics.field32.method2799() + "%";
                class28.field651 = 60;
            }
        } else if (field283 == 80) {
            int var37 = 0;
            if (Statics.field2697 == null) {
                Statics.field2697 = class70.method515(Statics.field1907, "compass", "");
            } else {
                var37++;
            }
            if (Statics.field28 == null) {
                Statics.field28 = class70.method515(Statics.field1907, "mapedge", "");
            } else {
                var37++;
            }
            if (Statics.field189 == null) {
                Statics.field189 = class70.method2589(Statics.field1907, "mapscene", "");
            } else {
                var37++;
            }
            if (Statics.field571 == null) {
                Statics.field571 = class70.method583(Statics.field1907, "mapfunction", "");
            } else {
                var37++;
            }
            if (Statics.field1826 == null) {
                Statics.field1826 = class70.method583(Statics.field1907, "hitmarks", "");
            } else {
                var37++;
            }
            if (Statics.field1493 == null) {
                Statics.field1493 = class70.method583(Statics.field1907, "headicons_pk", "");
            } else {
                var37++;
            }
            if (Statics.field85 == null) {
                Statics.field85 = class70.method583(Statics.field1907, "headicons_prayer", "");
            } else {
                var37++;
            }
            if (Statics.field251 == null) {
                Statics.field251 = class70.method583(Statics.field1907, "headicons_hint", "");
            } else {
                var37++;
            }
            if (Statics.field1985 == null) {
                Statics.field1985 = class70.method583(Statics.field1907, "mapmarker", "");
            } else {
                var37++;
            }
            if (Statics.field433 == null) {
                Statics.field433 = class70.method583(Statics.field1907, "cross", "");
            } else {
                var37++;
            }
            if (Statics.field1114 == null) {
                Statics.field1114 = class70.method583(Statics.field1907, "mapdots", "");
            } else {
                var37++;
            }
            if (Statics.field1046 == null) {
                Statics.field1046 = class70.method2589(Statics.field1907, "scrollbar", "");
            } else {
                var37++;
            }
            if (Statics.field143 == null) {
                Statics.field143 = class70.method2589(Statics.field1907, "mod_icons", "");
            } else {
                var37++;
            }
            if (Statics.field966 == null) {
                Statics.field966 = Statics.method585(Statics.field1907, "mapback", "");
            } else {
                var37++;
            }
            if (var37 < 14) {
                class28.field654 = class142.field2166 + var37 * 100 / 14 + "%";
                class28.field651 = 70;
            } else {
                Statics.field2879 = Statics.field143;
                Statics.field28.method1492();
                int var38 = (int) (Math.random() * 21.0D) - 10;
                int var39 = (int) (Math.random() * 21.0D) - 10;
                int var40 = (int) (Math.random() * 21.0D) - 10;
                int var41 = (int) (Math.random() * 41.0D) - 20;
                for (int var42 = 0; var42 < Statics.field571.length; var42++) {
                    Statics.field571[var42].method1512(var38 + var41, var39 + var41, var40 + var41);
                }
                Statics.field189[0].method1576(var38 + var41, var39 + var41, var40 + var41);
                method1867();
                class28.field654 = class142.field2167;
                class28.field651 = 70;
                field283 = 90;
            }
        } else if (field283 == 90) {
            if (Statics.field1895.method2721()) {
                class88 var43 = new class88(Statics.field1895, Statics.field1907, 20, 0.8D, field260 ? 64 : 128);
                class84.method1800(var43);
                class84.method1829(0.8D);
                class28.field654 = class142.field2169;
                class28.field651 = 90;
                field283 = 110;
            } else {
                class28.field654 = class142.field2168 + Statics.field1895.method2799() + "%";
                class28.field651 = 90;
            }
        } else if (field283 == 110) {
            Statics.field1879 = new class12();
            Statics.field1920.method2480(Statics.field1879, 10);
            class28.field654 = class142.field2170;
            class28.field651 = 94;
            field283 = 120;
        } else if (field283 == 120) {
            if (Statics.field1638.method2757("huffman", "")) {
                class102 var44 = new class102(Statics.field1638.method2772("huffman", ""));
                Statics.field2869 = var44;
                class28.field654 = class142.field2172;
                class28.field651 = 96;
                field283 = 130;
            } else {
                class28.field654 = class142.field2171 + "%";
                class28.field651 = 96;
            }
        } else if (field283 == 130) {
            if (!Statics.field204.method2721()) {
                class28.field654 = class142.field2173 + Statics.field204.method2799() * 4 / 5 + "%";
                class28.field651 = 100;
            } else if (!Statics.field621.method2721()) {
                class28.field654 = class142.field2173 + (80 + Statics.field621.method2799() / 6) + "%";
                class28.field651 = 100;
            } else if (Statics.field2034.method2721()) {
                class28.field654 = class142.field2174;
                class28.field651 = 100;
                field283 = 140;
            } else {
                class28.field654 = class142.field2173 + (96 + Statics.field2034.method2799() / 20) + "%";
                class28.field651 = 100;
            }
        } else if (field283 == 140) {
            method1871(10);
        }
    }

    @ObfuscatedName("dv.b(IZZZI)Leb;")
    public static class146 method2528(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2095 != null) {
            var4 = new class121(arg0, class136.field2095, Statics.field2096[arg0], 1000000);
        }
        return new class146(var4, Statics.field178, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cr.v(I)V")
    public static void method1867() {
        Statics.field2694 = new int[33];
        Statics.field1342 = new int[33];
        Statics.field129 = new int[151];
        Statics.field945 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field966.field1311[Statics.field966.field1308 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field2694[var0] = var1;
            Statics.field1342[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field966.field1311[Statics.field966.field1308 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field129[var4 - 5] = var5 - 25;
            Statics.field945[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("e.n(I)V")
    public static final void method3() {
        try {
            if (field288 == 0) {
                if (Statics.field18 != null) {
                    Statics.field18.method2577();
                    Statics.field18 = null;
                }
                Statics.field2026 = null;
                field307 = false;
                field289 = 0;
                field288 = 1;
            }
            if (field288 == 1) {
                if (Statics.field2026 == null) {
                    Statics.field2026 = Statics.field1920.method2483(Statics.field22, Statics.field1278);
                }
                if (Statics.field2026.field2071 == 2) {
                    throw new IOException();
                }
                if (Statics.field2026.field2071 == 1) {
                    Statics.field18 = new class130((Socket) Statics.field2026.field2067, Statics.field1920);
                    Statics.field2026 = null;
                    field288 = 2;
                }
            }
            if (field288 == 2) {
                field296.field1841 = 0;
                field296.method2249(14);
                Statics.field18.method2576(field296.field1845, 0, 1);
                field507.field1841 = 0;
                field288 = 3;
            }
            if (field288 == 3) {
                if (Statics.field14 != null) {
                    Statics.field14.method1022();
                }
                if (Statics.field2742 != null) {
                    Statics.field2742.method1022();
                }
                int var0 = Statics.field18.method2594();
                if (Statics.field14 != null) {
                    Statics.field14.method1022();
                }
                if (Statics.field2742 != null) {
                    Statics.field2742.method1022();
                }
                if (var0 != 0) {
                    method581(var0);
                    return;
                }
                field507.field1841 = 0;
                field288 = 5;
            }
            if (field288 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field296.field1841 = 0;
                field296.method2249(10);
                field296.method2130(var1[0]);
                field296.method2130(var1[1]);
                field296.method2130(var1[2]);
                field296.method2130(var1[3]);
                field296.method2131(0L);
                field296.method2132(class28.field658);
                field296.method2159(class5.field75, class5.field71);
                field322.field1841 = 0;
                if (field263 == 40) {
                    field322.method2249(18);
                } else {
                    field322.method2249(16);
                }
                field322.method2128(0);
                int var2 = field322.field1841;
                field322.method2130(47);
                field322.method2135(field296.field1845, 0, field296.field1841);
                int var3 = field322.field1841;
                field322.method2132(class28.field657);
                field322.method2249(field260 ? 1 : 0);
                class136.method509(field322);
                class107 var4 = new class107(Statics.field2047.method2706());
                Statics.field2047.method2707(var4);
                field322.method2135(var4.field1845, 0, var4.field1845.length);
                field322.method2130(Statics.field2478.field2447);
                field322.method2130(Statics.field1900.field2447);
                field322.method2130(Statics.field32.field2447);
                field322.method2130(Statics.field204.field2447);
                field322.method2130(Statics.field142.field2447);
                field322.method2130(Statics.field1814.field2447);
                field322.method2130(Statics.field2469.field2447);
                field322.method2130(Statics.field1822.field2447);
                field322.method2130(Statics.field1907.field2447);
                field322.method2130(Statics.field1895.field2447);
                field322.method2130(Statics.field1638.field2447);
                field322.method2130(Statics.field151.field2447);
                field322.method2130(Statics.field621.field2447);
                field322.method2130(Statics.field2034.field2447);
                field322.method2130(Statics.field1258.field2447);
                field322.method2130(Statics.field996.field2447);
                field322.method2157(var1, var3, field322.field1841);
                field322.method2137(field322.field1841 - var2);
                Statics.field18.method2576(field322.field1845, 0, field322.field1841);
                field296.method2370(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field507.method2370(var1);
                field288 = 6;
            }
            if (field288 == 6 && Statics.field18.method2578() > 0) {
                int var6 = Statics.field18.method2594();
                if (var6 == 21 && field263 == 20) {
                    field288 = 7;
                } else if (var6 == 2) {
                    field288 = 9;
                } else if (var6 == 15 && field263 == 40) {
                    Statics.method3151();
                    return;
                } else if (var6 == 23 && field294 < 1) {
                    field294++;
                    field288 = 0;
                } else {
                    method581(var6);
                    return;
                }
            }
            if (field288 == 7 && Statics.field18.method2578() > 0) {
                field301 = (Statics.field18.method2594() + 3) * 60;
                field288 = 8;
            }
            if (field288 == 8) {
                field289 = 0;
                class28.method1980(class142.field2175, class142.field2176, field301 / 60 + class142.field2177);
                if (--field301 <= 0) {
                    field288 = 0;
                }
            } else {
                if (field288 == 9 && Statics.field18.method2578() >= 8) {
                    field424 = Statics.field18.method2594();
                    field426 = Statics.field18.method2594() == 1;
                    field382 = Statics.field18.method2594();
                    field382 <<= 0x8;
                    field382 += Statics.field18.method2594();
                    field383 = Statics.field18.method2594();
                    Statics.field18.method2579(field507.field1845, 0, 1);
                    field507.field1841 = 0;
                    field300 = field507.method2372();
                    Statics.field18.method2579(field507.field1845, 0, 2);
                    field507.field1841 = 0;
                    field299 = field507.method2182();
                    if (field383 == 1) {
                        try {
                            client var7 = Statics.field253;
                            JSObject.getWindow(var7).call("zap", (Object[]) null);
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            client var9 = Statics.field253;
                            JSObject.getWindow(var9).call("unzap", (Object[]) null);
                        } catch (Throwable var23) {
                        }
                    }
                    field288 = 10;
                }
                if (field288 != 10) {
                    field289++;
                    if (field289 > 2000) {
                        if (field294 < 1) {
                            if (Statics.field1278 == Statics.field103) {
                                Statics.field1278 = Statics.field1755;
                            } else {
                                Statics.field1278 = Statics.field103;
                            }
                            field294++;
                            field288 = 0;
                        } else {
                            method581(-3);
                        }
                    }
                } else if (Statics.field18.method2578() >= field299) {
                    field507.field1841 = 0;
                    Statics.field18.method2579(field507.field1845, 0, field299);
                    field266 = 1L;
                    field405 = -1;
                    Statics.field1879.field187 = 0;
                    Statics.field815 = true;
                    field474 = true;
                    field422 = -1L;
                    class186.field2857 = new class176();
                    field296.field1841 = 0;
                    field507.field1841 = 0;
                    field300 = -1;
                    field304 = -1;
                    field305 = -1;
                    field306 = -1;
                    field423 = 0;
                    field272 = 0;
                    field510 = 0;
                    field273 = 0;
                    field400 = 0;
                    field515 = false;
                    class127.field2007 = 0;
                    class10.method2890();
                    field411 = 0;
                    field413 = false;
                    field493 = 0;
                    field320 = (int) (Math.random() * 100.0D) - 50;
                    field316 = (int) (Math.random() * 110.0D) - 55;
                    field324 = (int) (Math.random() * 80.0D) - 40;
                    field327 = (int) (Math.random() * 120.0D) - 60;
                    field473 = (int) (Math.random() * 30.0D) - 20;
                    field341 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field291 = 0;
                    field480 = -1;
                    field485 = 0;
                    field486 = 0;
                    field282 = class18.field524;
                    field453 = 0;
                    field463 = 0;
                    for (int var11 = 0; var11 < 2048; var11++) {
                        field376[var11] = null;
                        field381[var11] = null;
                    }
                    for (int var12 = 0; var12 < 32768; var12++) {
                        field292[var12] = null;
                    }
                    Statics.field521 = field376[2047] = new class3();
                    field390 = -1;
                    field393.method3231();
                    field333.method3231();
                    for (int var13 = 0; var13 < 4; var13++) {
                        for (int var14 = 0; var14 < 104; var14++) {
                            for (int var15 = 0; var15 < 104; var15++) {
                                field391[var13][var14][var15] = null;
                            }
                        }
                    }
                    field363 = new class176();
                    field443 = 0;
                    field505 = 0;
                    field509 = 0;
                    for (int var16 = 0; var16 < Statics.field1049; var16++) {
                        class46 var17 = class46.method592(var16);
                        if (var17 != null) {
                            class153.field2643[var16] = 0;
                            class153.field2645[var16] = 0;
                        }
                    }
                    for (int var18 = 0; var18 < field452.length; var18++) {
                        field452[var18] = -1;
                    }
                    field425 = -1;
                    if (field417 != -1) {
                        class151.method2701(field417);
                    }
                    for (class4 var19 = (class4) field488.method3196(); var19 != null; var19 = (class4) field488.method3201()) {
                        method126(var19, true);
                    }
                    field417 = -1;
                    field488 = new class173(8);
                    field339 = null;
                    field515 = false;
                    field400 = 0;
                    field511.method2948((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var20 = 0; var20 < 8; var20++) {
                        field403[var20] = null;
                        field388[var20] = false;
                    }
                    class14.field209 = new class173(32);
                    field442 = true;
                    for (int var21 = 0; var21 < 100; var21++) {
                        field418[var21] = true;
                    }
                    field478 = null;
                    Statics.field193 = 0;
                    Statics.field77 = null;
                    Statics.field298 = -1;
                    method533(false);
                    field300 = -1;
                }
            }
        } catch (IOException var25) {
            if (field294 < 1) {
                if (Statics.field1278 == Statics.field103) {
                    Statics.field1278 = Statics.field1755;
                } else {
                    Statics.field1278 = Statics.field103;
                }
                field294++;
                field288 = 0;
            } else {
                method581(-2);
            }
        }
    }

    @ObfuscatedName("as.z(IB)V")
    public static void method581(int arg0) {
        if (arg0 == -3) {
            class28.method1980(class142.field2178, class142.field2179, class142.field2180);
        } else if (arg0 == -2) {
            class28.method1980(class142.field2181, class142.field2182, class142.field2183);
        } else if (arg0 == -1) {
            class28.method1980(class142.field2184, class142.field2185, class142.field2186);
        } else if (arg0 == 3) {
            class28.method1980(class142.field2187, class142.field2188, class142.field2217);
        } else if (arg0 == 4) {
            class28.method1980(class142.field2190, class142.field2191, class142.field2192);
        } else if (arg0 == 5) {
            class28.method1980(class142.field2158, class142.field2344, class142.field2195);
        } else if (arg0 == 6) {
            class28.method1980(class142.field2263, class142.field2197, class142.field2224);
        } else if (arg0 == 7) {
            class28.method1980(class142.field2199, class142.field2227, class142.field2201);
        } else if (arg0 == 8) {
            class28.method1980(class142.field2255, class142.field2203, class142.field2215);
        } else if (arg0 == 9) {
            class28.method1980(class142.field2333, class142.field2206, class142.field2207);
        } else if (arg0 == 10) {
            class28.method1980(class142.field2208, class142.field2209, class142.field2210);
        } else if (arg0 == 11) {
            class28.method1980(class142.field2278, class142.field2212, class142.field2289);
        } else if (arg0 == 12) {
            class28.method1980(class142.field2214, class142.field2233, class142.field2148);
        } else if (arg0 == 13) {
            class28.method1980(class142.field2306, class142.field2218, class142.field2202);
        } else if (arg0 == 14) {
            class28.method1980(class142.field2328, class142.field2221, class142.field2222);
        } else if (arg0 == 16) {
            class28.method1980(class142.field2223, class142.field2334, class142.field2225);
        } else if (arg0 == 17) {
            class28.method1980(class142.field2226, class142.field2144, class142.field2303);
        } else if (arg0 == 18) {
            class28.method1980(class142.field2229, class142.field2230, class142.field2290);
        } else if (arg0 == 19) {
            class28.method1980(class142.field2219, class142.field2232, class142.field2234);
        } else if (arg0 == 20) {
            class28.method1980(class142.field2380, class142.field2236, class142.field2237);
        } else if (arg0 == 22) {
            class28.method1980(class142.field2238, class142.field2239, class142.field2240);
        } else if (arg0 == 23) {
            class28.method1980(class142.field2241, class142.field2356, class142.field2200);
        } else if (arg0 == 24) {
            class28.method1980(class142.field2377, class142.field2245, class142.field2246);
        } else if (arg0 == 25) {
            class28.method1980(class142.field2162, class142.field2248, class142.field2249);
        } else if (arg0 == 26) {
            class28.method1980(class142.field2250, class142.field2251, class142.field2371);
        } else if (arg0 == 27) {
            class28.method1980(class142.field2213, class142.field2254, class142.field2253);
        } else if (arg0 == 31) {
            class28.method1980(class142.field2354, class142.field2252, class142.field2264);
        } else if (arg0 == 32) {
            class28.method1980(class142.field2265, class142.field2266, class142.field2310);
        } else if (arg0 == 37) {
            class28.method1980(class142.field2268, class142.field2269, class142.field2270);
        } else if (arg0 == 38) {
            class28.method1980(class142.field2189, class142.field2317, class142.field2273);
        } else if (arg0 == 55) {
            class28.method1980(class142.field2274, class142.field2275, class142.field2276);
        } else {
            class28.method1980(class142.field2211, class142.field2365, class142.field2326);
        }
        method1871(10);
    }

    @ObfuscatedName("ap.x(B)V")
    public static final void method722() {
        if (Statics.field18 != null) {
            Statics.field18.method2577();
            Statics.field18 = null;
        }
        method1974();
        Statics.field1866.method1609();
        for (int var0 = 0; var0 < 4; var0++) {
            field311[var0].method3466();
        }
        System.gc();
        Statics.method2661(2);
        field489 = -1;
        field490 = false;
        class20.method21();
        method1871(10);
    }

    @ObfuscatedName("cp.q(I)V")
    public static final void method1974() {
        class41.field950.method3162();
        class37.method647();
        class40.field936.method3162();
        class36.field827.method3162();
        class36.field839.method3162();
        class36.field829.method3162();
        class36.field830.method3162();
        class35.method503();
        class45.method71();
        class38.field891.method3162();
        class38.field906.method3162();
        class39.field926.method3162();
        class39.field915.method3162();
        class42.field967.method3162();
        class46.method839();
        class156.method1889();
        class151.field2609.method3162();
        class151.field2513.method3162();
        class151.field2514.method3162();
        ((class88) Statics.field1466).method1876();
        class19.field531.method3162();
        Statics.field2478.method2729();
        Statics.field1900.method2729();
        Statics.field204.method2729();
        Statics.field142.method2729();
        Statics.field1814.method2729();
        Statics.field2469.method2729();
        Statics.field1822.method2729();
        Statics.field1907.method2729();
        Statics.field1895.method2729();
        Statics.field1638.method2729();
        Statics.field151.method2729();
        Statics.field621.method2729();
    }

    @ObfuscatedName("g.s(I)V")
    public static final void method26() {
        if (field272 > 1) {
            field272--;
        }
        if (field510 > 0) {
            field510--;
        }
        if (field307) {
            field307 = false;
            if (field510 > 0) {
                method722();
            } else {
                method1871(40);
                Statics.field387 = Statics.field18;
                Statics.field18 = null;
            }
            return;
        }
        if (!field515) {
            field276[0] = class142.field2366;
            field503[0] = "";
            field377[0] = 1006;
            field400 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field18 == null) {
                var1 = false;
            } else {
                label3058: {
                    try {
                        int var2 = Statics.field18.method2578();
                        if (var2 == 0) {
                            var1 = false;
                            break label3058;
                        }
                        if (field300 == -1) {
                            Statics.field18.method2579(field507.field1845, 0, 1);
                            field507.field1841 = 0;
                            field300 = field507.method2372();
                            field299 = class165.field2786[field300];
                            var2--;
                        }
                        if (field299 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label3058;
                            }
                            Statics.field18.method2579(field507.field1845, 0, 1);
                            field299 = field507.field1845[0] & 0xFF;
                            var2--;
                        }
                        if (field299 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label3058;
                            }
                            Statics.field18.method2579(field507.field1845, 0, 2);
                            field507.field1841 = 0;
                            field299 = field507.method2182();
                            var2 -= 2;
                        }
                        if (var2 < field299) {
                            var1 = false;
                            break label3058;
                        }
                        field507.field1841 = 0;
                        Statics.field18.method2579(field507.field1845, 0, field299);
                        field423 = 0;
                        field306 = field305;
                        field305 = field304;
                        field304 = field300;
                        if (field300 == 41) {
                            int var3 = field507.method2144();
                            int var4 = field507.method2150();
                            class151 var5 = Statics.method815(var4);
                            if (var5.field2553 != var3 || var3 == -1) {
                                var5.field2553 = var3;
                                var5.field2623 = 0;
                                var5.field2624 = 0;
                                Statics.method2431(var5);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 221) {
                            method16();
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 71) {
                            int var6 = field507.method2165();
                            int var7 = field507.method2173();
                            int var8 = field507.method2146();
                            class4 var9 = (class4) field488.method3192((long) var8);
                            if (var9 != null) {
                                method126(var9, var9.field67 != var7);
                            }
                            method935(var8, var7, var6);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 112) {
                            int var10 = field507.method2319();
                            int var11 = field507.method2188();
                            class151 var12 = Statics.method815(var10);
                            if (var12.field2554 != 2 || var12.field2550 != var11) {
                                var12.field2554 = 2;
                                var12.field2550 = var11;
                                Statics.method2431(var12);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 2) {
                            for (int var13 = 0; var13 < field376.length; var13++) {
                                if (field376[var13] != null) {
                                    field376[var13].field742 = -1;
                                }
                            }
                            for (int var14 = 0; var14 < field292.length; var14++) {
                                if (field292[var14] != null) {
                                    field292[var14].field742 = -1;
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 179) {
                            field499 = true;
                            Statics.field708 = field507.method2125();
                            Statics.field2429 = field507.method2125();
                            Statics.field5 = field507.method2182();
                            Statics.field157 = field507.method2125();
                            Statics.field1045 = field507.method2125();
                            if (Statics.field1045 >= 100) {
                                Statics.field1502 = Statics.field708 * 128 + 64;
                                Statics.field678 = Statics.field2429 * 128 + 64;
                                Statics.field1651 = method576(Statics.field1502, Statics.field678, Statics.field930) - Statics.field5;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 70) {
                            int var15 = field507.method2150();
                            String var16 = field507.method2149();
                            class151 var17 = Statics.method815(var15);
                            if (!var16.equals(var17.field2564)) {
                                var17.field2564 = var16;
                                Statics.method2431(var17);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 176) {
                            int var18 = field507.method2125();
                            int var19 = field507.method2125();
                            int var20 = field507.method2125();
                            int var21 = field507.method2125();
                            field379[var18] = true;
                            field337[var18] = var19;
                            field502[var18] = var20;
                            field384[var18] = var21;
                            field504[var18] = 0;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 239) {
                            field507.field1841 += 28;
                            if (field507.method2161()) {
                                class110 var22 = field507;
                                int var23 = field507.field1841 - 28;
                                if (class136.field2093 != null) {
                                    try {
                                        class136.field2093.method3434(0L);
                                        class136.field2093.method3457(var22.field1845, var23, 24);
                                    } catch (Exception var446) {
                                    }
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 15) {
                            String var25 = field507.method2149();
                            long var26 = (long) field507.method2182();
                            long var28 = (long) field507.method2145();
                            int var30 = field507.method2125();
                            long var31 = (var26 << 32) + var28;
                            boolean var33 = false;
                            for (int var34 = 0; var34 < 100; var34++) {
                                if (field464[var34] == var31) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (method1865(var25)) {
                                var33 = true;
                            }
                            if (!var33 && field375 == 0) {
                                field464[field487] = var31;
                                field487 = (field487 + 1) % 100;
                                String var35 = class189.method3331(class196.method3137(class188.method2083(field507)));
                                if (var30 == 2 || var30 == 3) {
                                    class10.method1607(7, class2.method510(1) + var25, var35);
                                } else if (var30 == 1) {
                                    class10.method1607(7, class2.method510(0) + var25, var35);
                                } else {
                                    class10.method1607(3, var25, var35);
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 122) {
                            int var36 = field507.method2176();
                            int var37 = field507.method2146();
                            int var38 = field507.method2144();
                            class151 var39 = Statics.method815(var37);
                            int var40 = var39.field2589 + var36;
                            int var41 = var39.field2525 + var38;
                            if (var39.field2522 != var40 || var39.field2601 != var41) {
                                var39.field2522 = var40;
                                var39.field2601 = var41;
                                Statics.method2431(var39);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 153) {
                            int var42 = field507.method2181();
                            int var43 = field507.method2175();
                            class151 var44 = Statics.method815(var42);
                            if (var44 != null && var44.field2548 == 0) {
                                if (var43 > var44.field2533 - var44.field2527) {
                                    var43 = var44.field2533 - var44.field2527;
                                }
                                if (var43 < 0) {
                                    var43 = 0;
                                }
                                if (var44.field2619 != var43) {
                                    var44.field2619 = var43;
                                    Statics.method2431(var44);
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 68) {
                            int var45 = field507.method2173();
                            int var46 = field507.method2150();
                            int var47 = var45 >> 10 & 0x1F;
                            int var48 = var45 >> 5 & 0x1F;
                            int var49 = var45 & 0x1F;
                            int var50 = (var49 << 3) + (var47 << 19) + (var48 << 11);
                            class151 var51 = Statics.method815(var46);
                            if (var51.field2592 != var50) {
                                var51.field2592 = var50;
                                Statics.method2431(var51);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 183) {
                            field470 = field507.method2125();
                            field471 = field507.method2125();
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 189) {
                            class22 var52 = new class22();
                            var52.field565 = field507.method2149();
                            var52.field575 = field507.method2182();
                            int var53 = field507.method2146();
                            var52.field569 = var53;
                            method1871(45);
                            Statics.field18.method2577();
                            Statics.field18 = null;
                            class28.method582(var52);
                            field300 = -1;
                            var1 = false;
                            break label3058;
                        }
                        if (field300 == 20) {
                            int var54 = field507.method2188();
                            int var55 = field507.method2181();
                            class151 var56 = Statics.method815(var55);
                            if (var56.field2554 != 1 || var56.field2550 != var54) {
                                var56.field2554 = 1;
                                var56.field2550 = var54;
                                Statics.method2431(var56);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 141) {
                            field272 = field507.method2182() * 30;
                            field451 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 148) {
                            String var57 = field507.method2149();
                            long var58 = field507.method2147();
                            long var60 = (long) field507.method2182();
                            long var62 = (long) field507.method2145();
                            int var64 = field507.method2125();
                            long var65 = (var60 << 32) + var62;
                            boolean var67 = false;
                            for (int var68 = 0; var68 < 100; var68++) {
                                if (field464[var68] == var65) {
                                    var67 = true;
                                    break;
                                }
                            }
                            if (var64 <= 1 && method1865(var57)) {
                                var67 = true;
                            }
                            if (!var67 && field375 == 0) {
                                field464[field487] = var65;
                                field487 = (field487 + 1) % 100;
                                String var69 = class189.method3331(class196.method3137(class188.method2083(field507)));
                                if (var64 == 2 || var64 == 3) {
                                    class10.method1(9, class2.method510(1) + var57, var69, class195.method3312(var58));
                                } else if (var64 == 1) {
                                    class10.method1(9, class2.method510(0) + var57, var69, class195.method3312(var58));
                                } else {
                                    class10.method1(9, var57, var69, class195.method3312(var58));
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 164) {
                            method474();
                            field353 = field507.method2144();
                            field451 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 236) {
                            field291 = field507.method2125();
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 87) {
                            int var70 = field507.method2188();
                            if (var70 == 65535) {
                                var70 = -1;
                            }
                            if (var70 == -1 && !field490) {
                                class160.method2404();
                            } else if (var70 != -1 && field489 != var70 && field408 != 0 && !field490) {
                                class146 var71 = Statics.field2469;
                                int var72 = field408;
                                class160.field2695 = 1;
                                Statics.field997 = var71;
                                Statics.field227 = var70;
                                Statics.field2692 = 0;
                                Statics.field1264 = var72;
                                Statics.field709 = false;
                                Statics.field2892 = 2;
                            }
                            field489 = var70;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 191) {
                            int var73 = field507.method2175();
                            if (var73 == 65535) {
                                var73 = -1;
                            }
                            int var74 = field507.method2145();
                            method156(var73, var74);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 138) {
                            int var75 = field507.method2173();
                            class14 var76 = (class14) class14.field209.method3192((long) var75);
                            if (var76 != null) {
                                var76.method3307();
                            }
                            field264[++field445 - 1 & 0x1F] = var75 & 0x7FFF;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 101) {
                            method474();
                            int var77 = field507.method2150();
                            int var78 = field507.method2165();
                            int var79 = field507.method2230();
                            field397[var78] = var77;
                            field313[var78] = var79;
                            field396[var78] = 1;
                            for (int var80 = 0; var80 < 98; var80++) {
                                if (var77 >= class140.field2128[var80]) {
                                    field396[var78] = var80 + 2;
                                }
                            }
                            field446[++field447 - 1 & 0x1F] = var78;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 28) {
                            int var81 = field507.method2173();
                            int var82 = field507.method2182();
                            int var83 = field507.method2319();
                            int var84 = field507.method2182();
                            class151 var85 = Statics.method815(var83);
                            if (var85.field2557 != var82 || var85.field2558 != var81 || var85.field2604 != var84) {
                                var85.field2557 = var82;
                                var85.field2558 = var81;
                                var85.field2604 = var84;
                                Statics.method2431(var85);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 252) {
                            Statics.field2801 = field507.method2230();
                            Statics.field1240 = field507.method2230();
                            for (int var86 = Statics.field1240; var86 < Statics.field1240 + 8; var86++) {
                                for (int var87 = Statics.field2801; var87 < Statics.field2801 + 8; var87++) {
                                    if (field391[Statics.field930][var86][var87] != null) {
                                        field391[Statics.field930][var86][var87] = null;
                                        method2894(var86, var87);
                                    }
                                }
                            }
                            for (class15 var88 = (class15) field363.method3225(); var88 != null; var88 = (class15) field363.method3227()) {
                                if (var88.field215 >= Statics.field1240 && var88.field215 < Statics.field1240 + 8 && var88.field216 >= Statics.field2801 && var88.field216 < Statics.field2801 + 8 && Statics.field930 == var88.field223) {
                                    var88.field224 = 0;
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 181) {
                            int var89 = field507.method2230();
                            int var90 = field507.method2291();
                            int var91 = field507.method2125();
                            Statics.field930 = var91 >> 1;
                            Statics.field521.method600(var90, var89, (var91 & 0x1) == 1);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 69) {
                            field466 = field441;
                            if (field299 == 0) {
                                field478 = null;
                                field395 = null;
                                Statics.field193 = 0;
                                Statics.field77 = null;
                                field300 = -1;
                                var1 = true;
                            } else {
                                field395 = field507.method2149();
                                long var92 = field507.method2147();
                                field478 = class195.method1788(var92);
                                Statics.field1905 = field507.method2201();
                                int var94 = field507.method2125();
                                if (var94 == 255) {
                                    field300 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field193 = var94;
                                    class21[] var95 = new class21[100];
                                    for (int var96 = 0; var96 < Statics.field193; var96++) {
                                        var95[var96] = new class21();
                                        var95[var96].field561 = field507.method2149();
                                        var95[var96].field557 = Statics.method525(var95[var96].field561, Statics.field1933);
                                        var95[var96].field554 = field507.method2182();
                                        var95[var96].field555 = field507.method2201();
                                        field507.method2149();
                                        if (var95[var96].field561.equals(Statics.field521.field50)) {
                                            Statics.field1884 = var95[var96].field555;
                                        }
                                    }
                                    boolean var97 = false;
                                    int var98 = Statics.field193;
                                    while (var98 > 0) {
                                        boolean var99 = true;
                                        var98--;
                                        for (int var100 = 0; var100 < var98; var100++) {
                                            if (var95[var100].field557.compareTo(var95[var100 + 1].field557) > 0) {
                                                class21 var101 = var95[var100];
                                                var95[var100] = var95[var100 + 1];
                                                var95[var100 + 1] = var101;
                                                var99 = false;
                                            }
                                        }
                                        if (var99) {
                                            break;
                                        }
                                    }
                                    Statics.field77 = var95;
                                    field300 = -1;
                                    var1 = true;
                                }
                            }
                            break label3058;
                        }
                        if (field300 == 228) {
                            for (int var102 = 0; var102 < class153.field2645.length; var102++) {
                                if (class153.field2645[var102] != class153.field2643[var102]) {
                                    class153.field2645[var102] = class153.field2643[var102];
                                    method1790(var102);
                                    field325[++field252 - 1 & 0x1F] = var102;
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 36) {
                            int var103 = field507.method2146();
                            class4 var104 = (class4) field488.method3192((long) var103);
                            if (var104 != null) {
                                method126(var104, true);
                            }
                            if (field339 != null) {
                                Statics.method2431(field339);
                                field339 = null;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 12) {
                            int var105 = field507.method2181();
                            class151 var106 = Statics.method815(var105);
                            var106.field2554 = 3;
                            var106.field2550 = Statics.field521.field40.method2940();
                            Statics.method2431(var106);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 134) {
                            method722();
                            field300 = -1;
                            var1 = false;
                            break label3058;
                        }
                        if (field300 == 92) {
                            String var107 = field507.method2149();
                            int var108 = field507.method2182();
                            byte var109 = field507.method2201();
                            boolean var110 = false;
                            if (var109 == -128) {
                                var110 = true;
                            }
                            if (var110) {
                                if (Statics.field193 == 0) {
                                    field300 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                boolean var111 = false;
                                int var112;
                                for (var112 = 0; var112 < Statics.field193 && (!Statics.field77[var112].field561.equals(var107) || Statics.field77[var112].field554 != var108); var112++) {
                                }
                                if (var112 < Statics.field193) {
                                    while (var112 < Statics.field193 - 1) {
                                        Statics.field77[var112] = Statics.field77[var112 + 1];
                                        var112++;
                                    }
                                    Statics.field193--;
                                    Statics.field77[Statics.field193] = null;
                                }
                            } else {
                                field507.method2149();
                                class21 var113 = new class21();
                                var113.field561 = var107;
                                var113.field557 = Statics.method525(var113.field561, Statics.field1933);
                                var113.field554 = var108;
                                var113.field555 = var109;
                                int var114;
                                for (var114 = Statics.field193 - 1; var114 >= 0; var114--) {
                                    int var115 = Statics.field77[var114].field557.compareTo(var113.field561);
                                    if (var115 == 0) {
                                        Statics.field77[var114].field554 = var108;
                                        Statics.field77[var114].field555 = var109;
                                        if (var107.equals(Statics.field521.field50)) {
                                            Statics.field1884 = var109;
                                        }
                                        field466 = field441;
                                        field300 = -1;
                                        var1 = true;
                                        break label3058;
                                    }
                                    if (var115 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field193 >= Statics.field77.length) {
                                    field300 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                for (int var116 = Statics.field193 - 1; var116 > var114; var116--) {
                                    Statics.field77[var116 + 1] = Statics.field77[var116];
                                }
                                if (Statics.field193 == 0) {
                                    Statics.field77 = new class21[100];
                                }
                                Statics.field77[var114 + 1] = var113;
                                Statics.field193++;
                                if (var107.equals(Statics.field521.field50)) {
                                    Statics.field1884 = var109;
                                }
                            }
                            field466 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 108) {
                            int var117 = field507.method2182();
                            int var118 = field507.method2125();
                            int var119 = field507.method2182();
                            if (field491 != 0 && var118 != 0 && field493 < 50) {
                                field494[field493] = var117;
                                field330[field493] = var118;
                                field496[field493] = var119;
                                field394[field493] = null;
                                field497[field493] = 0;
                                field493++;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 245) {
                            int var123 = field507.method2319();
                            int var124 = field507.method2319();
                            int var125 = field507.method2182();
                            if (var125 == 65535) {
                                var125 = -1;
                            }
                            class151 var126 = Statics.method815(var123);
                            if (var126.field2516) {
                                var126.field2600 = var125;
                                var126.field2622 = var124;
                                class45 var128 = class45.method573(var125);
                                var126.field2557 = var128.field1013;
                                var126.field2558 = var128.field1001;
                                var126.field2607 = var128.field1037;
                                var126.field2555 = var128.field1036;
                                var126.field2556 = var128.field1043;
                                var126.field2604 = var128.field1012;
                                if (var126.field2526 > 0) {
                                    var126.field2604 = var126.field2604 * 32 / var126.field2526;
                                }
                                Statics.method2431(var126);
                            } else {
                                if (var125 == -1) {
                                    var126.field2554 = 0;
                                    field300 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                class45 var127 = class45.method573(var125);
                                var126.field2554 = 4;
                                var126.field2550 = var125;
                                var126.field2557 = var127.field1013;
                                var126.field2558 = var127.field1001;
                                var126.field2604 = var127.field1012 * 100 / var124;
                                Statics.method2431(var126);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 61) {
                            field273 = field507.method2125();
                            if (field273 == 1) {
                                field274 = field507.method2182();
                            }
                            if (field273 >= 2 && field273 <= 6) {
                                if (field273 == 2) {
                                    field279 = 64;
                                    field280 = 64;
                                }
                                if (field273 == 3) {
                                    field279 = 0;
                                    field280 = 64;
                                }
                                if (field273 == 4) {
                                    field279 = 128;
                                    field280 = 64;
                                }
                                if (field273 == 5) {
                                    field279 = 64;
                                    field280 = 0;
                                }
                                if (field273 == 6) {
                                    field279 = 64;
                                    field280 = 128;
                                }
                                field273 = 2;
                                field310 = field507.method2182();
                                field472 = field507.method2182();
                                field278 = field507.method2125();
                            }
                            if (field273 == 10) {
                                field275 = field507.method2182();
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 13) {
                            class110 var129 = field507;
                            int var130 = field299;
                            class185 var131 = new class185();
                            var131.field2848 = var129.method2125();
                            var131.field2852 = var129.method2146();
                            var131.field2849 = new int[var131.field2848];
                            var131.field2853 = new int[var131.field2848];
                            var131.field2851 = new Field[var131.field2848];
                            var131.field2850 = new int[var131.field2848];
                            var131.field2847 = new Method[var131.field2848];
                            var131.field2854 = new byte[var131.field2848][][];
                            for (int var132 = 0; var132 < var131.field2848; var132++) {
                                try {
                                    int var133 = var129.method2125();
                                    if (var133 == 0 || var133 == 1 || var133 == 2) {
                                        String var134 = new String(var129.method2149());
                                        String var135 = new String(var129.method2149());
                                        int var136 = 0;
                                        if (var133 == 1) {
                                            var136 = var129.method2146();
                                        }
                                        var131.field2849[var132] = var133;
                                        var131.field2850[var132] = var136;
                                        var131.field2851[var132] = class186.method2712(var134).getDeclaredField(var135);
                                    } else if (var133 == 3 || var133 == 4) {
                                        String var137 = new String(var129.method2149());
                                        String var138 = new String(var129.method2149());
                                        int var139 = var129.method2125();
                                        String[] var140 = new String[var139];
                                        for (int var141 = 0; var141 < var139; var141++) {
                                            var140[var141] = new String(var129.method2149());
                                        }
                                        byte[][] var142 = new byte[var139][];
                                        if (var133 == 3) {
                                            for (int var143 = 0; var143 < var139; var143++) {
                                                int var144 = var129.method2146();
                                                var142[var143] = new byte[var144];
                                                var129.method2321(var142[var143], 0, var144);
                                            }
                                        }
                                        var131.field2849[var132] = var133;
                                        Class[] var145 = new Class[var139];
                                        for (int var146 = 0; var146 < var139; var146++) {
                                            var145[var146] = class186.method2712(var140[var146]);
                                        }
                                        var131.field2847[var132] = class186.method2712(var137).getDeclaredMethod(var138, var145);
                                        var131.field2854[var132] = var142;
                                    }
                                } catch (ClassNotFoundException var449) {
                                    var131.field2853[var132] = -1;
                                } catch (SecurityException var450) {
                                    var131.field2853[var132] = -2;
                                } catch (NullPointerException var451) {
                                    var131.field2853[var132] = -3;
                                } catch (Exception var452) {
                                    var131.field2853[var132] = -4;
                                } catch (Throwable var453) {
                                    var131.field2853[var132] = -5;
                                }
                            }
                            class186.field2857.method3222(var131);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 98) {
                            while (field507.field1841 < field299) {
                                int var152 = field507.method2125();
                                boolean var153 = (var152 & 0x1) == 1;
                                String var154 = field507.method2149();
                                String var155 = field507.method2149();
                                field507.method2149();
                                for (int var156 = 0; var156 < field509; var156++) {
                                    class8 var157 = field308[var156];
                                    if (var153) {
                                        if (var155.equals(var157.field136)) {
                                            var157.field136 = var154;
                                            var157.field133 = var155;
                                            var154 = null;
                                            break;
                                        }
                                    } else if (var154.equals(var157.field136)) {
                                        var157.field136 = var154;
                                        var157.field133 = var155;
                                        var154 = null;
                                        break;
                                    }
                                }
                                if (var154 != null && field509 < 400) {
                                    class8 var158 = new class8();
                                    field308[field509] = var158;
                                    var158.field136 = var154;
                                    var158.field133 = var155;
                                    field509++;
                                }
                            }
                            field319 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 193) {
                            method533(true);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 199) {
                            int var159 = field299 + field507.field1841;
                            int var160 = field507.method2182();
                            int var161 = field507.method2182();
                            if (field417 != var160) {
                                field417 = var160;
                                method1052(field417);
                                Statics.method803(field417);
                                for (int var162 = 0; var162 < 100; var162++) {
                                    field418[var162] = true;
                                }
                            }
                            while (var161-- > 0) {
                                int var163 = field507.method2146();
                                int var164 = field507.method2182();
                                int var165 = field507.method2125();
                                class4 var166 = (class4) field488.method3192((long) var163);
                                if (var166 != null && var166.field67 != var164) {
                                    method126(var166, true);
                                    var166 = null;
                                }
                                if (var166 == null) {
                                    var166 = method935(var163, var164, var165);
                                }
                                var166.field66 = true;
                            }
                            for (class4 var167 = (class4) field488.method3196(); var167 != null; var167 = (class4) field488.method3201()) {
                                if (var167.field66) {
                                    var167.field66 = false;
                                } else {
                                    method126(var167, true);
                                }
                            }
                            field386 = new class173(512);
                            while (field507.field1841 < var159) {
                                int var168 = field507.method2146();
                                int var169 = field507.method2182();
                                int var170 = field507.method2182();
                                int var171 = field507.method2146();
                                for (int var172 = var169; var172 <= var170; var172++) {
                                    long var173 = ((long) var168 << 32) + (long) var172;
                                    field386.method3191(new class178(var171), var173);
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 95) {
                            String var175 = field507.method2149();
                            String var176 = class189.method3331(class196.method3137(class188.method2083(field507)));
                            class10.method1607(6, var175, var176);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 102) {
                            if (field417 != -1) {
                                Statics.method603(field417, 0);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 90) {
                            int var177 = field507.method2146();
                            Statics.field971 = Statics.field1920.method2476(var177);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 170) {
                            String var178 = field507.method2149();
                            Object[] var179 = new Object[var178.length() + 1];
                            for (int var180 = var178.length() - 1; var180 >= 0; var180--) {
                                if (var178.charAt(var180) == 's') {
                                    var179[var180 + 1] = field507.method2149();
                                } else {
                                    var179[var180 + 1] = Integer.valueOf(field507.method2146());
                                }
                            }
                            var179[0] = Integer.valueOf(field507.method2146());
                            class1 var181 = new class1();
                            var181.field13 = var179;
                            class32.method146(var181);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 250) {
                            Statics.field2801 = field507.method2230();
                            Statics.field1240 = field507.method2291();
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 16) {
                            int var182 = field507.method2319();
                            boolean var183 = field507.method2165() == 1;
                            class151 var184 = Statics.method815(var182);
                            if (var184.field2591 != var183) {
                                var184.field2591 = var183;
                                Statics.method2431(var184);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 248) {
                            int var185 = field507.method2167();
                            boolean var186 = field507.method2125() == 1;
                            String var187 = "";
                            boolean var188 = false;
                            if (var186) {
                                var187 = field507.method2149();
                                if (method1865(var187)) {
                                    var188 = true;
                                }
                            }
                            String var189 = field507.method2149();
                            if (!var188) {
                                class10.method1607(var185, var187, var189);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 4) {
                            int var190 = field507.method2146();
                            int var191 = field507.method2182();
                            if (var190 < -70000) {
                                var191 += 32768;
                            }
                            class151 var192;
                            if (var190 >= 0) {
                                var192 = Statics.method815(var190);
                            } else {
                                var192 = null;
                            }
                            if (var192 != null) {
                                for (int var193 = 0; var193 < var192.field2612.length; var193++) {
                                    var192.field2612[var193] = 0;
                                    var192.field2620[var193] = 0;
                                }
                            }
                            class14 var194 = (class14) class14.field209.method3192((long) var191);
                            if (var194 != null) {
                                for (int var195 = 0; var195 < var194.field211.length; var195++) {
                                    var194.field211[var195] = -1;
                                    var194.field206[var195] = 0;
                                }
                            }
                            int var196 = field507.method2182();
                            for (int var197 = 0; var197 < var196; var197++) {
                                int var198 = field507.method2165();
                                if (var198 == 255) {
                                    var198 = field507.method2150();
                                }
                                int var199 = field507.method2173();
                                if (var192 != null && var197 < var192.field2612.length) {
                                    var192.field2612[var197] = var199;
                                    var192.field2620[var197] = var198;
                                }
                                class14.method2065(var191, var197, var199 - 1, var198);
                            }
                            if (var192 != null) {
                                Statics.method2431(var192);
                            }
                            method474();
                            field264[++field445 - 1 & 0x1F] = var191 & 0x7FFF;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 172) {
                            int var200 = field507.method2175();
                            if (var200 == 65535) {
                                var200 = -1;
                            }
                            int var201 = field507.method2181();
                            int var202 = field507.method2319();
                            int var203 = field507.method2173();
                            if (var203 == 65535) {
                                var203 = -1;
                            }
                            for (int var204 = var200; var204 <= var203; var204++) {
                                long var205 = ((long) var201 << 32) + (long) var204;
                                class183 var207 = field386.method3192(var205);
                                if (var207 != null) {
                                    var207.method3307();
                                }
                                field386.method3191(new class178(var202), var205);
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 76) {
                            for (int var208 = 0; var208 < Statics.field1049; var208++) {
                                class46 var209 = class46.method592(var208);
                                if (var209 != null) {
                                    class153.field2643[var208] = 0;
                                    class153.field2645[var208] = 0;
                                }
                            }
                            method474();
                            field252 += 32;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 96) {
                            String var210 = field507.method2149();
                            int var211 = field507.method2291();
                            int var212 = field507.method2291();
                            if (var211 >= 1 && var211 <= 8) {
                                if (var210.equalsIgnoreCase("null")) {
                                    var210 = null;
                                }
                                field403[var211 - 1] = var210;
                                field388[var211 - 1] = var212 == 0;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 22) {
                            int var213 = field507.method2319();
                            class151 var214 = Statics.method815(var213);
                            for (int var215 = 0; var215 < var214.field2612.length; var215++) {
                                var214.field2612[var215] = -1;
                                var214.field2612[var215] = 0;
                            }
                            Statics.method2431(var214);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 135) {
                            int var216 = field507.method2146();
                            int var217 = field507.method2182();
                            if (var216 < -70000) {
                                var217 += 32768;
                            }
                            class151 var218;
                            if (var216 >= 0) {
                                var218 = Statics.method815(var216);
                            } else {
                                var218 = null;
                            }
                            while (field507.field1841 < field299) {
                                int var219 = field507.method2167();
                                int var220 = field507.method2182();
                                int var221 = 0;
                                if (var220 != 0) {
                                    var221 = field507.method2125();
                                    if (var221 == 255) {
                                        var221 = field507.method2146();
                                    }
                                }
                                if (var218 != null && var219 >= 0 && var219 < var218.field2612.length) {
                                    var218.field2612[var219] = var220;
                                    var218.field2620[var219] = var221;
                                }
                                class14.method2065(var217, var219, var220 - 1, var221);
                            }
                            if (var218 != null) {
                                Statics.method2431(var218);
                            }
                            method474();
                            field264[++field445 - 1 & 0x1F] = var217 & 0x7FFF;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 210) {
                            field499 = true;
                            Statics.field15 = field507.method2125();
                            Statics.field2126 = field507.method2125();
                            Statics.field234 = field507.method2182();
                            Statics.field34 = field507.method2125();
                            Statics.field961 = field507.method2125();
                            if (Statics.field961 >= 100) {
                                int var222 = Statics.field15 * 128 + 64;
                                int var223 = Statics.field2126 * 128 + 64;
                                int var224 = method576(var222, var223, Statics.field930) - Statics.field234;
                                int var225 = var222 - Statics.field1502;
                                int var226 = var224 - Statics.field1651;
                                int var227 = var223 - Statics.field678;
                                int var228 = (int) Math.sqrt((double) (var225 * var225 + var227 * var227));
                                Statics.field177 = (int) (Math.atan2((double) var226, (double) var228) * 325.949D) & 0x7FF;
                                Statics.field1420 = (int) (Math.atan2((double) var225, (double) var227) * -325.949D) & 0x7FF;
                                if (Statics.field177 < 128) {
                                    Statics.field177 = 128;
                                }
                                if (Statics.field177 > 383) {
                                    Statics.field177 = 383;
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 215) {
                            int var229 = field507.method2319();
                            int var230 = field507.method2173();
                            class153.field2643[var230] = var229;
                            if (class153.field2645[var230] != var229) {
                                class153.field2645[var230] = var229;
                                method1790(var230);
                            }
                            field325[++field252 - 1 & 0x1F] = var230;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 3) {
                            Statics.field2801 = field507.method2125();
                            Statics.field1240 = field507.method2165();
                            while (field507.field1841 < field299) {
                                field300 = field507.method2125();
                                method1793();
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 202) {
                            int var231 = field507.method2173();
                            field417 = var231;
                            method1052(var231);
                            Statics.method803(field417);
                            for (int var232 = 0; var232 < 100; var232++) {
                                field418[var232] = true;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 185) {
                            field475 = 0;
                            field506 = 0;
                            field507.method2373();
                            int var233 = field507.method2387(8);
                            if (var233 < field463) {
                                for (int var234 = var233; var234 < field463; var234++) {
                                    field385[++field475 - 1] = field290[var234];
                                }
                            }
                            if (var233 > field463) {
                                throw new RuntimeException("");
                            }
                            field463 = 0;
                            for (int var235 = 0; var235 < var233; var235++) {
                                int var236 = field290[var235];
                                class30 var237 = field292[var236];
                                int var238 = field507.method2387(1);
                                if (var238 == 0) {
                                    field290[++field463 - 1] = var236;
                                    var237.field759 = field265;
                                } else {
                                    int var239 = field507.method2387(2);
                                    if (var239 == 0) {
                                        field290[++field463 - 1] = var236;
                                        var237.field759 = field265;
                                        field380[++field506 - 1] = var236;
                                    } else if (var239 == 1) {
                                        field290[++field463 - 1] = var236;
                                        var237.field759 = field265;
                                        int var240 = field507.method2387(3);
                                        var237.method604(var240, false);
                                        int var241 = field507.method2387(1);
                                        if (var241 == 1) {
                                            field380[++field506 - 1] = var236;
                                        }
                                    } else if (var239 == 2) {
                                        field290[++field463 - 1] = var236;
                                        var237.field759 = field265;
                                        int var242 = field507.method2387(3);
                                        var237.method604(var242, true);
                                        int var243 = field507.method2387(3);
                                        var237.method604(var243, true);
                                        int var244 = field507.method2387(1);
                                        if (var244 == 1) {
                                            field380[++field506 - 1] = var236;
                                        }
                                    } else if (var239 == 3) {
                                        field385[++field475 - 1] = var236;
                                    }
                                }
                            }
                            method1866();
                            for (int var245 = 0; var245 < field506; var245++) {
                                int var246 = field380[var245];
                                class30 var247 = field292[var246];
                                int var248 = field507.method2125();
                                if ((var248 & 0x4) != 0) {
                                    int var249 = field507.method2230();
                                    int var250 = field507.method2165();
                                    var247.method616(var249, var250, field265);
                                    var247.field730 = field265 + 300;
                                    var247.field727 = field507.method2291();
                                    var247.field735 = field507.method2291();
                                }
                                if ((var248 & 0x20) != 0) {
                                    var247.field751 = field507.method2182();
                                    int var251 = field507.method2146();
                                    var247.field753 = var251 >> 16;
                                    var247.field750 = (var251 & 0xFFFF) + field265;
                                    var247.field748 = 0;
                                    var247.field725 = 0;
                                    if (var247.field750 > field265) {
                                        var247.field748 = -1;
                                    }
                                    if (var247.field751 == 65535) {
                                        var247.field751 = -1;
                                    }
                                }
                                if ((var248 & 0x10) != 0) {
                                    int var252 = field507.method2230();
                                    int var253 = field507.method2230();
                                    var247.method616(var252, var253, field265);
                                    var247.field730 = field265 + 300;
                                    var247.field727 = field507.method2291();
                                    var247.field735 = field507.method2230();
                                }
                                if ((var248 & 0x8) != 0) {
                                    var247.field683 = class35.method131(field507.method2173());
                                    var247.field716 = var247.field683.field791;
                                    var247.field763 = var247.field683.field814;
                                    var247.field720 = var247.field683.field797;
                                    var247.field755 = var247.field683.field796;
                                    var247.field741 = var247.field683.field786;
                                    var247.field757 = var247.field683.field800;
                                    var247.field717 = var247.field683.field822;
                                    var247.field718 = var247.field683.field795;
                                    var247.field721 = var247.field683.field794;
                                }
                                if ((var248 & 0x80) != 0) {
                                    var247.field712 = field507.method2149();
                                    var247.field733 = 100;
                                }
                                if ((var248 & 0x1) != 0) {
                                    var247.field736 = field507.method2188();
                                    if (var247.field736 == 65535) {
                                        var247.field736 = -1;
                                    }
                                }
                                if ((var248 & 0x2) != 0) {
                                    int var254 = field507.method2173();
                                    if (var254 == 65535) {
                                        var254 = -1;
                                    }
                                    int var255 = field507.method2230();
                                    if (var247.field742 == var254 && var254 != -1) {
                                        int var256 = class38.method81(var254).field901;
                                        if (var256 == 1) {
                                            var247.field713 = 0;
                                            var247.field744 = 0;
                                            var247.field745 = var255;
                                            var247.field746 = 0;
                                        }
                                        if (var256 == 2) {
                                            var247.field746 = 0;
                                        }
                                    } else if (var254 == -1 || var247.field742 == -1 || class38.method81(var254).field900 >= class38.method81(var247.field742).field900) {
                                        var247.field742 = var254;
                                        var247.field713 = 0;
                                        var247.field744 = 0;
                                        var247.field745 = var255;
                                        var247.field746 = 0;
                                        var247.field743 = var247.field764;
                                    }
                                }
                                if ((var248 & 0x40) != 0) {
                                    var247.field737 = field507.method2188();
                                    var247.field749 = field507.method2173();
                                }
                            }
                            for (int var257 = 0; var257 < field475; var257++) {
                                int var258 = field385[var257];
                                if (field265 != field292[var258].field759) {
                                    field292[var258].field683 = null;
                                    field292[var258] = null;
                                }
                            }
                            if (field299 != field507.field1841) {
                                throw new RuntimeException(field507.field1841 + class2.field20 + field299);
                            }
                            for (int var259 = 0; var259 < field463; var259++) {
                                if (field292[field290[var259]] == null) {
                                    throw new RuntimeException(var259 + class2.field20 + field463);
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 205) {
                            method474();
                            field361 = field507.method2125();
                            field451 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 143) {
                            field443 = 1;
                            field319 = field441;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 145 || field300 == 42 || field300 == 27 || field300 == 128 || field300 == 59 || field300 == 103 || field300 == 132 || field300 == 57 || field300 == 246 || field300 == 146) {
                            method1793();
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 38) {
                            int var260 = field507.method2125();
                            class117[] var261 = class117.method580();
                            int var262 = 0;
                            class117 var264;
                            while (true) {
                                if (var262 >= var261.length) {
                                    var264 = null;
                                    break;
                                }
                                class117 var263 = var261[var262];
                                if (var263.field1910 == var260) {
                                    var264 = var263;
                                    break;
                                }
                                var262++;
                            }
                            Statics.field625 = var264;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 50) {
                            method533(false);
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 225) {
                            byte var265 = field507.method2168();
                            int var266 = field507.method2175();
                            class153.field2643[var266] = var265;
                            if (class153.field2645[var266] != var265) {
                                class153.field2645[var266] = var265;
                                method1790(var266);
                            }
                            field325[++field252 - 1 & 0x1F] = var266;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 130) {
                            int var267 = field507.method2146();
                            int var268 = field507.method2182();
                            int var269 = field507.method2173();
                            class151 var270 = Statics.method815(var267);
                            var270.field2561 = (var268 << 16) + var269;
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 165) {
                            field499 = false;
                            for (int var271 = 0; var271 < 5; var271++) {
                                field379[var271] = false;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 109) {
                            while (field507.field1841 < field299) {
                                boolean var272 = field507.method2125() == 1;
                                String var273 = field507.method2149();
                                String var274 = field507.method2149();
                                int var275 = field507.method2182();
                                int var276 = field507.method2125();
                                int var277 = field507.method2125();
                                boolean var278 = (var277 & 0x2) != 0;
                                boolean var279 = (var277 & 0x1) != 0;
                                if (var275 > 0) {
                                    field507.method2149();
                                    field507.method2125();
                                    field507.method2146();
                                }
                                field507.method2149();
                                for (int var280 = 0; var280 < field505; var280++) {
                                    class16 var281 = field479[var280];
                                    if (var272) {
                                        if (var274.equals(var281.field238)) {
                                            var281.field238 = var273;
                                            var281.field228 = var274;
                                            var273 = null;
                                            break;
                                        }
                                    } else if (var273.equals(var281.field238)) {
                                        if (var281.field229 != var275) {
                                            boolean var282 = true;
                                            for (class34 var283 = (class34) field440.method3181(); var283 != null; var283 = (class34) field440.method3183()) {
                                                if (var283.field777.equals(var273)) {
                                                    if (var275 != 0 && var283.field775 == 0) {
                                                        var283.method3299();
                                                        var282 = false;
                                                    } else if (var275 == 0 && var283.field775 != 0) {
                                                        var283.method3299();
                                                        var282 = false;
                                                    }
                                                }
                                            }
                                            if (var282) {
                                                field440.method3180(new class34(var273, var275));
                                            }
                                            var281.field229 = var275;
                                        }
                                        var281.field228 = var274;
                                        var281.field230 = var276;
                                        var281.field231 = var278;
                                        var281.field232 = var279;
                                        var273 = null;
                                        break;
                                    }
                                }
                                if (var273 != null && field505 < 400) {
                                    class16 var284 = new class16();
                                    field479[field505] = var284;
                                    var284.field238 = var273;
                                    var284.field228 = var274;
                                    var284.field229 = var275;
                                    var284.field230 = var276;
                                    var284.field231 = var278;
                                    var284.field232 = var279;
                                    field505++;
                                }
                            }
                            field443 = 2;
                            field319 = field441;
                            boolean var285 = false;
                            int var286 = field505;
                            while (var286 > 0) {
                                boolean var287 = true;
                                var286--;
                                for (int var288 = 0; var288 < var286; var288++) {
                                    boolean var289 = false;
                                    class16 var290 = field479[var288];
                                    class16 var291 = field479[var288 + 1];
                                    if (field255 != var290.field229 && field255 == var291.field229) {
                                        var289 = true;
                                    }
                                    if (!var289 && var290.field229 == 0 && var291.field229 != 0) {
                                        var289 = true;
                                    }
                                    if (!var289 && !var290.field231 && var291.field231) {
                                        var289 = true;
                                    }
                                    if (!var289 && !var290.field232 && var291.field232) {
                                        var289 = true;
                                    }
                                    if (var289) {
                                        class16 var292 = field479[var288];
                                        field479[var288] = field479[var288 + 1];
                                        field479[var288 + 1] = var292;
                                        var287 = false;
                                    }
                                }
                                if (var287) {
                                    break;
                                }
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field300 == 58) {
                            field485 = field507.method2125();
                            if (field485 == 255) {
                                field485 = 0;
                            }
                            field486 = field507.method2125();
                            if (field486 == 255) {
                                field486 = 0;
                            }
                            field300 = -1;
                            var1 = true;
                            break label3058;
                        }
                        class135.method95("" + field300 + class2.field20 + field305 + class2.field20 + field306 + class2.field20 + field299, (Throwable) null);
                        method722();
                    } catch (IOException var454) {
                        if (field510 > 0) {
                            method722();
                        } else {
                            method1871(40);
                            Statics.field387 = Statics.field18;
                            Statics.field18 = null;
                        }
                    } catch (Exception var455) {
                        String var295 = "" + field300 + class2.field20 + field305 + class2.field20 + field306 + class2.field20 + field299 + class2.field20 + (Statics.field439 + Statics.field521.field765[0]) + class2.field20 + (Statics.field88 + Statics.field521.field766[0]) + class2.field20;
                        for (int var296 = 0; var296 < field299 && var296 < 50; var296++) {
                            var295 = var295 + field507.field1845[var296] + class2.field20;
                        }
                        class135.method95(var295, var455);
                        method722();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field263 != 30) {
            return;
        }
        class186.method3133(field296, 219);
        Object var297 = Statics.field1879.field184;
        synchronized (Statics.field1879.field184) {
            if (!field498) {
                Statics.field1879.field187 = 0;
            } else if (class127.field2000 != 0 || Statics.field1879.field187 >= 40) {
                field296.method2374(31);
                field296.method2249(0);
                int var298 = field296.field1841;
                int var299 = 0;
                for (int var300 = 0; var300 < Statics.field1879.field187 && field296.field1841 - var298 < 240; var300++) {
                    var299++;
                    int var301 = Statics.field1879.field188[var300];
                    if (var301 < 0) {
                        var301 = 0;
                    } else if (var301 > 502) {
                        var301 = 502;
                    }
                    int var302 = Statics.field1879.field186[var300];
                    if (var302 < 0) {
                        var302 = 0;
                    } else if (var302 > 764) {
                        var302 = 764;
                    }
                    int var303 = var301 * 765 + var302;
                    if (Statics.field1879.field188[var300] == -1 && Statics.field1879.field186[var300] == -1) {
                        var302 = -1;
                        var301 = -1;
                        var303 = 524287;
                    }
                    if (field267 != var302 || field268 != var301) {
                        int var304 = var302 - field267;
                        field267 = var302;
                        int var305 = var301 - field268;
                        field268 = var301;
                        if (field405 < 8 && var304 >= -32 && var304 <= 31 && var305 >= -32 && var305 <= 31) {
                            var304 += 32;
                            var305 += 32;
                            field296.method2128((field405 << 12) + (var304 << 6) + var305);
                            field405 = 0;
                        } else if (field405 < 8) {
                            field296.method2129((field405 << 19) + 8388608 + var303);
                            field405 = 0;
                        } else {
                            field296.method2130((field405 << 19) + -1073741824 + var303);
                            field405 = 0;
                        }
                    } else if (field405 < 2047) {
                        field405++;
                    }
                }
                field296.method2225(field296.field1841 - var298);
                if (var299 >= Statics.field1879.field187) {
                    Statics.field1879.field187 = 0;
                } else {
                    Statics.field1879.field187 -= var299;
                    for (int var306 = 0; var306 < Statics.field1879.field187; var306++) {
                        Statics.field1879.field186[var306] = Statics.field1879.field186[var299 + var306];
                        Statics.field1879.field188[var306] = Statics.field1879.field188[var299 + var306];
                    }
                }
            }
        }
        if (class127.field2000 == 1 || !Statics.field1475 && class127.field2000 == 4 || class127.field2000 == 2) {
            long var308 = (class127.field2003 - field266 * -1L) / 50L;
            if (var308 > 4095L) {
                var308 = 4095L;
            }
            field266 = class127.field2003 * -1L;
            int var310 = class127.field2014;
            if (var310 < 0) {
                var310 = 0;
            } else if (var310 > 502) {
                var310 = 502;
            }
            int var311 = class127.field2013;
            if (var311 < 0) {
                var311 = 0;
            } else if (var311 > 764) {
                var311 = 764;
            }
            int var312 = var310 * 765 + var311;
            byte var313 = 0;
            if (class127.field2000 == 2) {
                var313 = 1;
            }
            int var314 = (int) var308;
            field296.method2374(70);
            field296.method2130((var313 << 19) + (var314 << 20) + var312);
        }
        if (class124.field1957 > 0) {
            field296.method2374(53);
            field296.method2128(0);
            int var315 = field296.field1841;
            long var316 = class103.method527();
            for (int var318 = 0; var318 < class124.field1957; var318++) {
                long var319 = var316 - field422;
                if (var319 > 16777215L) {
                    var319 = 16777215L;
                }
                field422 = var316;
                field296.method2163(class124.field1981[var318]);
                field296.method2129((int) var319);
            }
            field296.method2137(field296.field1841 - var315);
        }
        if (field297 > 0) {
            field297--;
        }
        if (class124.field1968[96] || class124.field1968[97] || class124.field1968[98] || class124.field1968[99]) {
            field347 = true;
        }
        if (field347 && field297 <= 0) {
            field297 = 20;
            field347 = false;
            field296.method2374(90);
            field296.method2172(field341);
            field296.method2128(field340);
        }
        if (Statics.field815 && !field474) {
            field474 = true;
            field296.method2374(226);
            field296.method2249(1);
        }
        if (!Statics.field815 && field474) {
            field474 = false;
            field296.method2374(226);
            field296.method2249(0);
        }
        method118();
        if (field263 != 30) {
            return;
        }
        for (class15 var321 = (class15) field363.method3225(); var321 != null; var321 = (class15) field363.method3227()) {
            if (var321.field224 > 0) {
                var321.field224--;
            }
            if (var321.field224 == 0) {
                if (var321.field217 >= 0) {
                    int var322 = var321.field217;
                    int var323 = var321.field218;
                    class36 var324 = class36.method1794(var322);
                    if (var323 == 11) {
                        var323 = 10;
                    }
                    if (var323 >= 5 && var323 <= 8) {
                        var323 = 4;
                    }
                    boolean var325 = var324.method692(var323);
                    if (!var325) {
                        continue;
                    }
                }
                method534(var321.field223, var321.field214, var321.field215, var321.field216, var321.field217, var321.field213, var321.field218);
                var321.method3307();
            } else {
                if (var321.field219 > 0) {
                    var321.field219--;
                }
                if (var321.field219 == 0 && var321.field215 >= 1 && var321.field216 >= 1 && var321.field215 <= 102 && var321.field216 <= 102) {
                    if (var321.field220 >= 0) {
                        int var326 = var321.field220;
                        int var327 = var321.field221;
                        class36 var328 = class36.method1794(var326);
                        if (var327 == 11) {
                            var327 = 10;
                        }
                        if (var327 >= 5 && var327 <= 8) {
                            var327 = 4;
                        }
                        boolean var329 = var328.method692(var327);
                        if (!var329) {
                            continue;
                        }
                    }
                    method534(var321.field223, var321.field214, var321.field215, var321.field216, var321.field220, var321.field222, var321.field221);
                    var321.field219 = -1;
                    if (var321.field220 == var321.field217 && var321.field217 == -1) {
                        var321.method3307();
                    } else if (var321.field220 == var321.field217 && var321.field222 == var321.field213 && var321.field221 == var321.field218) {
                        var321.method3307();
                    }
                }
            }
        }
        int var10002;
        for (int var330 = 0; var330 < field493; var330++) {
            var10002 = field496[var330]--;
            if (field496[var330] >= -10) {
                class52 var332 = field394[var330];
                if (var332 == null) {
                    class52 var456 = (class52) null;
                    var332 = class52.method1072(Statics.field142, field494[var330], 0);
                    if (var332 == null) {
                        continue;
                    }
                    field496[var330] += var332.method1064();
                    field394[var330] = var332;
                }
                if (field496[var330] < 0) {
                    int var339;
                    if (field497[var330] == 0) {
                        var339 = field491;
                    } else {
                        int var333 = (field497[var330] & 0xFF) * 128;
                        int var334 = field497[var330] >> 16 & 0xFF;
                        int var335 = var334 * 128 + 64 - Statics.field521.field729;
                        if (var335 < 0) {
                            var335 = -var335;
                        }
                        int var336 = field497[var330] >> 8 & 0xFF;
                        int var337 = var336 * 128 + 64 - Statics.field521.field740;
                        if (var337 < 0) {
                            var337 = -var337;
                        }
                        int var338 = var335 + var337 - 128;
                        if (var338 > var333) {
                            field496[var330] = -100;
                            continue;
                        }
                        if (var338 < 0) {
                            var338 = 0;
                        }
                        var339 = field492 * (var333 - var338) / var333;
                    }
                    if (var339 > 0) {
                        class56 var340 = var332.method1065().method1102(Statics.field549);
                        class58 var341 = class58.method1142(var340, 100, var339);
                        var341.method1126(field330[var330] - 1);
                        Statics.field1654.method974(var341);
                    }
                    field496[var330] = -100;
                }
            } else {
                field493--;
                for (int var331 = var330; var331 < field493; var331++) {
                    field494[var331] = field494[var331 + 1];
                    field394[var331] = field394[var331 + 1];
                    field330[var331] = field330[var331 + 1];
                    field496[var331] = field496[var331 + 1];
                    field497[var331] = field497[var331 + 1];
                }
                var330--;
            }
        }
        if (field490) {
            boolean var342;
            if (class160.field2695 == 0) {
                var342 = Statics.field2690.method3029();
            } else {
                var342 = true;
            }
            if (!var342) {
                if (field408 != 0 && field489 != -1) {
                    class160.method577(Statics.field2469, field489, 0, field408, false);
                }
                field490 = false;
            }
        }
        field423++;
        if (field423 <= 750) {
            method124();
            method2791();
            for (int var343 = -1; var343 < field453; var343++) {
                int var344;
                if (var343 == -1) {
                    var344 = 2047;
                } else {
                    var344 = field378[var343];
                }
                class3 var345 = field376[var344];
                if (var345 != null && var345.field733 > 0) {
                    var345.field733--;
                    if (var345.field733 == 0) {
                        var345.field712 = null;
                    }
                }
            }
            for (int var346 = 0; var346 < field463; var346++) {
                int var347 = field290[var346];
                class30 var348 = field292[var347];
                if (var348 != null && var348.field733 > 0) {
                    var348.field733--;
                    if (var348.field733 == 0) {
                        var348.field712 = null;
                    }
                }
            }
            field332++;
            if (field366 != 0) {
                field365 += 20;
                if (field365 >= 400) {
                    field366 = 0;
                }
            }
            if (Statics.field1913 != null) {
                field367++;
                if (field367 >= 15) {
                    Statics.method2431(Statics.field1913);
                    Statics.field1913 = null;
                }
            }
            class151 var349 = Statics.field631;
            class151 var350 = Statics.field2116;
            Statics.field631 = null;
            Statics.field2116 = null;
            field501 = null;
            field437 = false;
            field434 = false;
            field389 = 0;
            while (class124.method1872() && field389 < 128) {
                if (field424 >= 2 && class124.field1968[82] && Statics.field1752 == 66) {
                    String var351 = Statics.method1601();
                    Statics.field2467.setContents(new StringSelection(var351), (ClipboardOwner) null);
                } else {
                    field458[field389] = Statics.field1752;
                    field476[field389] = Statics.field2383;
                    field389++;
                }
            }
            int var352 = field417;
            if (class151.method1883(var352)) {
                method70(Statics.field2559[var352], -1, 0, 0, 765, 503, 0, 0);
            }
            field441++;
            while (true) {
                class1 var353;
                class151 var354;
                class151 var355;
                do {
                    var353 = (class1) field456.method3223();
                    if (var353 == null) {
                        while (true) {
                            class1 var356;
                            class151 var357;
                            class151 var358;
                            do {
                                var356 = (class1) field328.method3223();
                                if (var356 == null) {
                                    while (true) {
                                        class1 var359;
                                        class151 var360;
                                        class151 var361;
                                        do {
                                            var359 = (class1) field455.method3223();
                                            if (var359 == null) {
                                                boolean var362 = false;
                                                while (!var362) {
                                                    var362 = true;
                                                    for (int var363 = 0; var363 < field400 - 1; var363++) {
                                                        if (field377[var363] < 1000 && field377[var363 + 1] > 1000) {
                                                            String var364 = field503[var363];
                                                            field503[var363] = field503[var363 + 1];
                                                            field503[var363 + 1] = var364;
                                                            String var365 = field276[var363];
                                                            field276[var363] = field276[var363 + 1];
                                                            field276[var363 + 1] = var365;
                                                            int var366 = field377[var363];
                                                            field377[var363] = field377[var363 + 1];
                                                            field377[var363 + 1] = var366;
                                                            int var367 = field401[var363];
                                                            field401[var363] = field401[var363 + 1];
                                                            field401[var363 + 1] = var367;
                                                            int var368 = field402[var363];
                                                            field402[var363] = field402[var363 + 1];
                                                            field402[var363 + 1] = var368;
                                                            int var369 = field404[var363];
                                                            field404[var363] = field404[var363 + 1];
                                                            field404[var363 + 1] = var369;
                                                            var362 = false;
                                                        }
                                                    }
                                                }
                                                if (Statics.field1271 == null && field346 == null) {
                                                    int var370 = class127.field2000;
                                                    if (field515) {
                                                        if (var370 != 1 && (Statics.field1475 || var370 != 4)) {
                                                            int var371 = class127.field2004;
                                                            int var372 = class127.field2001;
                                                            if (var371 < Statics.field1 - 10 || var371 > Statics.field2121 + Statics.field1 + 10 || var372 < Statics.field770 - 10 || var372 > Statics.field770 + Statics.field694 + 10) {
                                                                field515 = false;
                                                                method2662(Statics.field1, Statics.field770, Statics.field2121, Statics.field694);
                                                            }
                                                        }
                                                        if (var370 == 1 || !Statics.field1475 && var370 == 4) {
                                                            int var373 = Statics.field1;
                                                            int var374 = Statics.field770;
                                                            int var375 = Statics.field2121;
                                                            int var376 = class127.field2013;
                                                            int var377 = class127.field2014;
                                                            int var378 = -1;
                                                            for (int var379 = 0; var379 < field400; var379++) {
                                                                int var380 = (field400 - 1 - var379) * 15 + var374 + 31;
                                                                if (var376 > var373 && var376 < var373 + var375 && var377 > var380 - 13 && var377 < var380 + 3) {
                                                                    var378 = var379;
                                                                }
                                                            }
                                                            if (var378 != -1) {
                                                                method497(var378);
                                                            }
                                                            field515 = false;
                                                            method2662(Statics.field1, Statics.field770, Statics.field2121, Statics.field694);
                                                        }
                                                    } else {
                                                        label3318: {
                                                            if ((var370 == 1 || !Statics.field1475 && var370 == 4) && field400 > 0) {
                                                                int var381 = field377[field400 - 1];
                                                                if (var381 == 39 || var381 == 40 || var381 == 41 || var381 == 42 || var381 == 43 || var381 == 33 || var381 == 34 || var381 == 35 || var381 == 36 || var381 == 37 || var381 == 38 || var381 == 1005) {
                                                                    int var382 = field401[field400 - 1];
                                                                    int var383 = field402[field400 - 1];
                                                                    class151 var384 = Statics.method815(var383);
                                                                    if (class155.method2817(method2423(var384)) || class155.method2367(method2423(var384))) {
                                                                        if (Statics.field1271 != null && !field373 && field398 != 1 && !method482(field400 - 1) && field400 > 0) {
                                                                            method1869(field357, field371);
                                                                        }
                                                                        field373 = false;
                                                                        field374 = 0;
                                                                        if (Statics.field1271 != null) {
                                                                            Statics.method2431(Statics.field1271);
                                                                        }
                                                                        Statics.field1271 = Statics.method815(var383);
                                                                        field369 = var382;
                                                                        field357 = class127.field2013;
                                                                        field371 = class127.field2014;
                                                                        if (field400 > 0) {
                                                                            int var385 = field400 - 1;
                                                                            Statics.field1650 = new class27();
                                                                            Statics.field1650.field637 = field401[var385];
                                                                            Statics.field1650.field629 = field402[var385];
                                                                            Statics.field1650.field630 = field377[var385];
                                                                            Statics.field1650.field628 = field404[var385];
                                                                            Statics.field1650.field632 = field276[var385];
                                                                        }
                                                                        Statics.method2431(Statics.field1271);
                                                                        break label3318;
                                                                    }
                                                                }
                                                            }
                                                            if ((var370 == 1 || !Statics.field1475 && var370 == 4) && (field398 == 1 && field400 > 2 || method482(field400 - 1))) {
                                                                var370 = 2;
                                                            }
                                                            if ((var370 == 1 || !Statics.field1475 && var370 == 4) && field400 > 0) {
                                                                method497(field400 - 1);
                                                            }
                                                            if (var370 == 2 && field400 > 0) {
                                                                method1786(class127.field2013, class127.field2014);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (field346 != null) {
                                                    Statics.method2431(field346);
                                                    Statics.field1653++;
                                                    if (field437 && field434) {
                                                        int var386 = class127.field2004;
                                                        int var387 = class127.field2001;
                                                        int var388 = var386 - field431;
                                                        int var389 = var387 - field432;
                                                        if (var388 < field435) {
                                                            var388 = field435;
                                                        }
                                                        if (field346.field2526 + var388 > field435 + field430.field2526) {
                                                            var388 = field435 + field430.field2526 - field346.field2526;
                                                        }
                                                        if (var389 < field436) {
                                                            var389 = field436;
                                                        }
                                                        if (field346.field2527 + var389 > field436 + field430.field2527) {
                                                            var389 = field436 + field430.field2527 - field346.field2527;
                                                        }
                                                        int var390 = var388 - field438;
                                                        int var391 = var389 - field254;
                                                        int var392 = field346.field2632;
                                                        if (Statics.field1653 > field346.field2512 && (var390 > var392 || var390 < -var392 || var391 > var392 || var391 < -var392)) {
                                                            field270 = true;
                                                        }
                                                        int var393 = field430.field2530 + (var388 - field435);
                                                        int var394 = field430.field2619 + (var389 - field436);
                                                        if (field346.field2582 != null && field270) {
                                                            class1 var395 = new class1();
                                                            var395.field3 = field346;
                                                            var395.field4 = var393;
                                                            var395.field9 = var394;
                                                            var395.field13 = field346.field2582;
                                                            class32.method146(var395);
                                                        }
                                                        if (class127.field2005 == 0) {
                                                            if (field270) {
                                                                if (field346.field2594 != null) {
                                                                    class1 var396 = new class1();
                                                                    var396.field3 = field346;
                                                                    var396.field4 = var393;
                                                                    var396.field9 = var394;
                                                                    var396.field7 = field501;
                                                                    var396.field13 = field346.field2594;
                                                                    class32.method146(var396);
                                                                }
                                                                if (field501 != null) {
                                                                    class151 var397 = field346;
                                                                    int var398 = method2423(var397);
                                                                    int var399 = var398 >> 17 & 0x7;
                                                                    int var400 = var399;
                                                                    class151 var401;
                                                                    if (var399 == 0) {
                                                                        var401 = null;
                                                                    } else {
                                                                        int var402 = 0;
                                                                        while (true) {
                                                                            if (var402 >= var400) {
                                                                                var401 = var397;
                                                                                break;
                                                                            }
                                                                            var397 = Statics.method815(var397.field2581);
                                                                            if (var397 == null) {
                                                                                var401 = null;
                                                                                break;
                                                                            }
                                                                            var402++;
                                                                        }
                                                                    }
                                                                    if (var401 != null) {
                                                                        field296.method2374(105);
                                                                        field296.method2179(field501.field2517);
                                                                        field296.method2179(field346.field2517);
                                                                        field296.method2128(field346.field2518);
                                                                        field296.method2128(field501.field2518);
                                                                    }
                                                                }
                                                            } else if ((field398 == 1 || method482(field400 - 1)) && field400 > 2) {
                                                                method1786(field438 + field431, field432 + field254);
                                                            } else if (field400 > 0) {
                                                                method1869(field438 + field431, field432 + field254);
                                                            }
                                                            field346 = null;
                                                        }
                                                    } else if (Statics.field1653 > 1) {
                                                        field346 = null;
                                                    }
                                                }
                                                if (Statics.field1271 != null) {
                                                    Statics.method2431(Statics.field1271);
                                                    field374++;
                                                    if (class127.field2005 == 0) {
                                                        if (field373) {
                                                            if (Statics.field519 == Statics.field1271 && field372 != field369) {
                                                                class151 var403 = Statics.field1271;
                                                                byte var404 = 0;
                                                                if (field420 == 1 && var403.field2521 == 206) {
                                                                    var404 = 1;
                                                                }
                                                                if (var403.field2612[field372] <= 0) {
                                                                    var404 = 0;
                                                                }
                                                                if (class155.method2367(method2423(var403))) {
                                                                    int var405 = field369;
                                                                    int var406 = field372;
                                                                    var403.field2612[var406] = var403.field2612[var405];
                                                                    var403.field2620[var406] = var403.field2620[var405];
                                                                    var403.field2612[var405] = -1;
                                                                    var403.field2620[var405] = 0;
                                                                } else if (var404 == 1) {
                                                                    int var407 = field369;
                                                                    int var408 = field372;
                                                                    while (var407 != var408) {
                                                                        if (var407 > var408) {
                                                                            var403.method2851(var407 - 1, var407);
                                                                            var407--;
                                                                        } else if (var407 < var408) {
                                                                            var403.method2851(var407 + 1, var407);
                                                                            var407++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var403.method2851(field372, field369);
                                                                }
                                                                field296.method2374(25);
                                                                field296.method2163(var404);
                                                                field296.method2265(field372);
                                                                field296.method2179(Statics.field1271.field2517);
                                                                field296.method2265(field369);
                                                            }
                                                        } else if ((field398 == 1 || method482(field400 - 1)) && field400 > 2) {
                                                            method1786(field357, field371);
                                                        } else if (field400 > 0) {
                                                            method1869(field357, field371);
                                                        }
                                                        field367 = 10;
                                                        class127.field2000 = 0;
                                                        Statics.field1271 = null;
                                                    } else if (field374 >= 5 && (class127.field2004 > field357 + 5 || class127.field2004 < field357 - 5 || class127.field2001 > field371 + 5 || class127.field2001 < field371 - 5)) {
                                                        field373 = true;
                                                    }
                                                }
                                                if (class79.field1374 != -1) {
                                                    int var409 = class79.field1374;
                                                    int var410 = class79.field1381;
                                                    field296.method2374(241);
                                                    field296.method2249(5);
                                                    field296.method2162(class124.field1968[82] ? (class124.field1968[81] ? 2 : 1) : 0);
                                                    field296.method2172(Statics.field439 + var409);
                                                    field296.method2170(Statics.field88 + var410);
                                                    class79.field1374 = -1;
                                                    field352 = class127.field2013;
                                                    field461 = class127.field2014;
                                                    field366 = 1;
                                                    field365 = 0;
                                                    field485 = var409;
                                                    field486 = var410;
                                                }
                                                if (Statics.field631 != var349) {
                                                    if (var349 != null) {
                                                        Statics.method2431(var349);
                                                    }
                                                    if (Statics.field631 != null) {
                                                        Statics.method2431(Statics.field631);
                                                    }
                                                }
                                                if (Statics.field2116 != var350 && field410 == field409) {
                                                    if (var350 != null) {
                                                        Statics.method2431(var350);
                                                    }
                                                    if (Statics.field2116 != null) {
                                                        Statics.method2431(Statics.field2116);
                                                    }
                                                }
                                                if (Statics.field2116 == null) {
                                                    if (field409 > 0) {
                                                        field409--;
                                                    }
                                                } else if (field409 < field410) {
                                                    field409++;
                                                    if (field410 == field409) {
                                                        Statics.method2431(Statics.field2116);
                                                    }
                                                }
                                                int var411 = field320 + Statics.field521.field729;
                                                int var412 = field316 + Statics.field521.field740;
                                                if (Statics.field2123 - var411 < -500 || Statics.field2123 - var411 > 500 || Statics.field911 - var412 < -500 || Statics.field911 - var412 > 500) {
                                                    Statics.field2123 = var411;
                                                    Statics.field911 = var412;
                                                }
                                                if (Statics.field2123 != var411) {
                                                    Statics.field2123 += (var411 - Statics.field2123) / 16;
                                                }
                                                if (Statics.field911 != var412) {
                                                    Statics.field911 += (var412 - Statics.field911) / 16;
                                                }
                                                if (class127.field2005 == 4 && Statics.field1475) {
                                                    int var413 = class127.field2001 - field345;
                                                    field343 = var413 * 2;
                                                    field345 = var413 == -1 || var413 == 1 ? class127.field2001 : (field345 + class127.field2001) / 2;
                                                    int var414 = field344 - class127.field2004;
                                                    field342 = var414 * 2;
                                                    field344 = var414 == -1 || var414 == 1 ? class127.field2004 : (field344 + class127.field2004) / 2;
                                                } else {
                                                    if (class124.field1968[96]) {
                                                        field342 += (-24 - field342) / 2;
                                                    } else if (class124.field1968[97]) {
                                                        field342 += (24 - field342) / 2;
                                                    } else {
                                                        field342 /= 2;
                                                    }
                                                    if (class124.field1968[98]) {
                                                        field343 += (12 - field343) / 2;
                                                    } else if (class124.field1968[99]) {
                                                        field343 += (-12 - field343) / 2;
                                                    } else {
                                                        field343 /= 2;
                                                    }
                                                    field345 = class127.field2001;
                                                    field344 = class127.field2004;
                                                }
                                                field341 = field342 / 2 + field341 & 0x7FF;
                                                field340 += field343 / 2;
                                                if (field340 < 128) {
                                                    field340 = 128;
                                                }
                                                if (field340 > 383) {
                                                    field340 = 383;
                                                }
                                                int var415 = Statics.field2123 >> 7;
                                                int var416 = Statics.field911 >> 7;
                                                int var417 = method576(Statics.field2123, Statics.field911, Statics.field930);
                                                int var418 = 0;
                                                if (var415 > 3 && var416 > 3 && var415 < 100 && var416 < 100) {
                                                    for (int var419 = var415 - 4; var419 <= var415 + 4; var419++) {
                                                        for (int var420 = var416 - 4; var420 <= var416 + 4; var420++) {
                                                            int var421 = Statics.field930;
                                                            if (var421 < 3 && (class6.field82[1][var419][var420] & 0x2) == 2) {
                                                                var421++;
                                                            }
                                                            int var422 = var417 - class6.field91[var421][var419][var420];
                                                            if (var422 > var418) {
                                                                var418 = var422;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var423 = var418 * 192;
                                                if (var423 > 98048) {
                                                    var423 = 98048;
                                                }
                                                if (var423 < 32768) {
                                                    var423 = 32768;
                                                }
                                                if (var423 > field348) {
                                                    field348 += (var423 - field348) / 24;
                                                } else if (var423 < field348) {
                                                    field348 += (var423 - field348) / 80;
                                                }
                                                if (field499) {
                                                    int var424 = Statics.field708 * 128 + 64;
                                                    int var425 = Statics.field2429 * 128 + 64;
                                                    int var426 = method576(var424, var425, Statics.field930) - Statics.field5;
                                                    if (Statics.field1502 < var424) {
                                                        Statics.field1502 += Statics.field1045 * (var424 - Statics.field1502) / 1000 + Statics.field157;
                                                        if (Statics.field1502 > var424) {
                                                            Statics.field1502 = var424;
                                                        }
                                                    }
                                                    if (Statics.field1502 > var424) {
                                                        Statics.field1502 -= Statics.field1045 * (Statics.field1502 - var424) / 1000 + Statics.field157;
                                                        if (Statics.field1502 < var424) {
                                                            Statics.field1502 = var424;
                                                        }
                                                    }
                                                    if (Statics.field1651 < var426) {
                                                        Statics.field1651 += Statics.field1045 * (var426 - Statics.field1651) / 1000 + Statics.field157;
                                                        if (Statics.field1651 > var426) {
                                                            Statics.field1651 = var426;
                                                        }
                                                    }
                                                    if (Statics.field1651 > var426) {
                                                        Statics.field1651 -= Statics.field1045 * (Statics.field1651 - var426) / 1000 + Statics.field157;
                                                        if (Statics.field1651 < var426) {
                                                            Statics.field1651 = var426;
                                                        }
                                                    }
                                                    if (Statics.field678 < var425) {
                                                        Statics.field678 += Statics.field1045 * (var425 - Statics.field678) / 1000 + Statics.field157;
                                                        if (Statics.field678 > var425) {
                                                            Statics.field678 = var425;
                                                        }
                                                    }
                                                    if (Statics.field678 > var425) {
                                                        Statics.field678 -= Statics.field1045 * (Statics.field678 - var425) / 1000 + Statics.field157;
                                                        if (Statics.field678 < var425) {
                                                            Statics.field678 = var425;
                                                        }
                                                    }
                                                    int var427 = Statics.field15 * 128 + 64;
                                                    int var428 = Statics.field2126 * 128 + 64;
                                                    int var429 = method576(var427, var428, Statics.field930) - Statics.field234;
                                                    int var430 = var427 - Statics.field1502;
                                                    int var431 = var429 - Statics.field1651;
                                                    int var432 = var428 - Statics.field678;
                                                    int var433 = (int) Math.sqrt((double) (var430 * var430 + var432 * var432));
                                                    int var434 = (int) (Math.atan2((double) var431, (double) var433) * 325.949D) & 0x7FF;
                                                    int var435 = (int) (Math.atan2((double) var430, (double) var432) * -325.949D) & 0x7FF;
                                                    if (var434 < 128) {
                                                        var434 = 128;
                                                    }
                                                    if (var434 > 383) {
                                                        var434 = 383;
                                                    }
                                                    if (Statics.field177 < var434) {
                                                        Statics.field177 += Statics.field961 * (var434 - Statics.field177) / 1000 + Statics.field34;
                                                        if (Statics.field177 > var434) {
                                                            Statics.field177 = var434;
                                                        }
                                                    }
                                                    if (Statics.field177 > var434) {
                                                        Statics.field177 -= Statics.field961 * (Statics.field177 - var434) / 1000 + Statics.field34;
                                                        if (Statics.field177 < var434) {
                                                            Statics.field177 = var434;
                                                        }
                                                    }
                                                    int var436 = var435 - Statics.field1420;
                                                    if (var436 > 1024) {
                                                        var436 -= 2048;
                                                    }
                                                    if (var436 < -1024) {
                                                        var436 += 2048;
                                                    }
                                                    if (var436 > 0) {
                                                        Statics.field1420 += Statics.field961 * var436 / 1000 + Statics.field34;
                                                        Statics.field1420 &= 0x7FF;
                                                    }
                                                    if (var436 < 0) {
                                                        Statics.field1420 -= Statics.field961 * -var436 / 1000 + Statics.field34;
                                                        Statics.field1420 &= 0x7FF;
                                                    }
                                                    int var437 = var435 - Statics.field1420;
                                                    if (var437 > 1024) {
                                                        var437 -= 2048;
                                                    }
                                                    if (var437 < -1024) {
                                                        var437 += 2048;
                                                    }
                                                    if (var437 < 0 && var436 > 0 || var437 > 0 && var436 < 0) {
                                                        Statics.field1420 = var435;
                                                    }
                                                }
                                                for (int var438 = 0; var438 < 5; var438++) {
                                                    var10002 = field504[var438]++;
                                                }
                                                int var439 = ++class127.field2007 - 1;
                                                int var441 = class124.method1432();
                                                if (var439 > 15000 && var441 > 15000) {
                                                    field510 = 250;
                                                    class127.field2007 = 14500;
                                                    field296.method2374(127);
                                                }
                                                field326++;
                                                if (field326 > 500) {
                                                    field326 = 0;
                                                    int var442 = (int) (Math.random() * 8.0D);
                                                    if ((var442 & 0x1) == 1) {
                                                        field320 += field321;
                                                    }
                                                    if ((var442 & 0x2) == 2) {
                                                        field316 += field323;
                                                    }
                                                    if ((var442 & 0x4) == 4) {
                                                        field324 += field444;
                                                    }
                                                }
                                                if (field320 < -50) {
                                                    field321 = 2;
                                                }
                                                if (field320 > 50) {
                                                    field321 = -2;
                                                }
                                                if (field316 < -55) {
                                                    field323 = 2;
                                                }
                                                if (field316 > 55) {
                                                    field323 = -2;
                                                }
                                                if (field324 < -40) {
                                                    field444 = 1;
                                                }
                                                if (field324 > 40) {
                                                    field444 = -1;
                                                }
                                                field450++;
                                                if (field450 > 500) {
                                                    field450 = 0;
                                                    int var443 = (int) (Math.random() * 8.0D);
                                                    if ((var443 & 0x1) == 1) {
                                                        field327 += field495;
                                                    }
                                                    if ((var443 & 0x2) == 2) {
                                                        field473 += field412;
                                                    }
                                                }
                                                if (field327 < -60) {
                                                    field495 = 2;
                                                }
                                                if (field327 > 60) {
                                                    field495 = -2;
                                                }
                                                if (field473 < -20) {
                                                    field412 = 1;
                                                }
                                                if (field473 > 10) {
                                                    field412 = -1;
                                                }
                                                for (class34 var444 = (class34) field440.method3181(); var444 != null; var444 = (class34) field440.method3183()) {
                                                    if ((long) var444.field778 < class103.method527() / 1000L - 5L) {
                                                        if (var444.field775 > 0) {
                                                            class10.method1607(5, "", var444.field777 + class142.field2280);
                                                        }
                                                        if (var444.field775 == 0) {
                                                            class10.method1607(5, "", var444.field777 + class142.field2281);
                                                        }
                                                        var444.method3299();
                                                    }
                                                }
                                                field302++;
                                                if (field302 > 50) {
                                                    field296.method2374(33);
                                                }
                                                try {
                                                    if (Statics.field18 != null && field296.field1841 > 0) {
                                                        Statics.field18.method2576(field296.field1845, 0, field296.field1841);
                                                        field296.field1841 = 0;
                                                        field302 = 0;
                                                    }
                                                } catch (IOException var447) {
                                                    if (field510 > 0) {
                                                        method722();
                                                    } else {
                                                        method1871(40);
                                                        Statics.field387 = Statics.field18;
                                                        Statics.field18 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var360 = var359.field3;
                                            if (var360.field2518 < 0) {
                                                break;
                                            }
                                            var361 = Statics.method815(var360.field2581);
                                        } while (var361 == null || var361.field2508 == null || var360.field2518 >= var361.field2508.length || var361.field2508[var360.field2518] != var360);
                                        class32.method146(var359);
                                    }
                                }
                                var357 = var356.field3;
                                if (var357.field2518 < 0) {
                                    break;
                                }
                                var358 = Statics.method815(var357.field2581);
                            } while (var358 == null || var358.field2508 == null || var357.field2518 >= var358.field2508.length || var358.field2508[var357.field2518] != var357);
                            class32.method146(var356);
                        }
                    }
                    var354 = var353.field3;
                    if (var354.field2518 < 0) {
                        break;
                    }
                    var355 = Statics.method815(var354.field2581);
                } while (var355 == null || var355.field2508 == null || var354.field2518 >= var355.field2508.length || var355.field2508[var354.field2518] != var354);
                class32.method146(var353);
            }
        } else if (field510 > 0) {
            method722();
        } else {
            method1871(40);
            Statics.field387 = Statics.field18;
            Statics.field18 = null;
        }
    }

    @ObfuscatedName("dm.j(B)V")
    public static final void method2475() {
        if (Statics.field2742 != null) {
            Statics.field2742.method1029();
        }
        if (Statics.field14 != null) {
            Statics.field14.method1029();
        }
    }

    @ObfuscatedName("dx.y(Laz;IIIB)V")
    public static void method2572(class38 arg0, int arg1, int arg2, int arg3) {
        if (field493 >= 50 || field492 == 0 || arg0.field896 == null || arg1 >= arg0.field896.length) {
            return;
        }
        int var4 = arg0.field896[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field494[field493] = var5;
        field330[field493] = var6;
        field496[field493] = 0;
        field394[field493] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field497[field493] = (var8 << 16) + (var9 << 8) + var7;
        field493++;
    }

    @ObfuscatedName("n.r(III)V")
    public static void method156(int arg0, int arg1) {
        if (field408 != 0 && arg0 != -1) {
            class160.method577(Statics.field151, arg0, 0, field408, false);
            field490 = true;
        }
    }

    @ObfuscatedName("c.h(I)V")
    public static final void method118() {
        if (field260 && Statics.field930 != field449) {
            method1423(Statics.field298, Statics.field1803, Statics.field930, Statics.field521.field765[0], Statics.field521.field766[0]);
        } else if (Statics.field930 != field480) {
            field480 = Statics.field930;
            method849(Statics.field930);
        }
    }

    @ObfuscatedName("ae.ak(III)V")
    public static final void method779(int arg0, int arg1) {
        if (field291 != 0 && field291 != 3 || class127.field2000 != 1 && Statics.field1475 || class127.field2000 != 4) {
            return;
        }
        int var2 = class127.field2013 - 25 - arg0;
        int var3 = class127.field2014 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field341 + field327 & 0x7FF;
        int var5 = class84.field1469[var4];
        int var6 = class84.field1470[var4];
        int var7 = (field473 + 256) * var5 >> 8;
        int var8 = (field473 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field521.field729 + var9 >> 7;
        int var12 = Statics.field521.field740 - var10 >> 7;
        field296.method2374(213);
        field296.method2249(18);
        field296.method2162(class124.field1968[82] ? (class124.field1968[81] ? 2 : 1) : 0);
        field296.method2172(Statics.field439 + var11);
        field296.method2170(Statics.field88 + var12);
        field296.method2249(var2);
        field296.method2249(var3);
        field296.method2128(field341);
        field296.method2249(57);
        field296.method2249(field327);
        field296.method2249(field473);
        field296.method2249(89);
        field296.method2128(Statics.field521.field729);
        field296.method2128(Statics.field521.field740);
        field296.method2249(63);
        field485 = var11;
        field486 = var12;
    }

    @ObfuscatedName("i.ab(I)V")
    public static final void method124() {
        for (int var0 = -1; var0 < field453; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field378[var0];
            }
            class3 var2 = field376[var1];
            if (var2 != null) {
                method25(var2, 1);
            }
        }
    }

    @ObfuscatedName("ec.as(B)V")
    public static final void method2791() {
        for (int var0 = 0; var0 < field463; var0++) {
            int var1 = field290[var0];
            class30 var2 = field292[var1];
            if (var2 != null) {
                method25(var2, var2.field683.field791);
            }
        }
    }

    @ObfuscatedName("g.aq(Laj;II)V")
    public static final void method25(class33 arg0, int arg1) {
        if (arg0.field756 > field265) {
            int var2 = arg0.field756 - field265;
            int var3 = arg0.field752 * 128 + arg0.field716 * 64;
            int var4 = arg0.field754 * 128 + arg0.field716 * 64;
            arg0.field729 += (var3 - arg0.field729) / var2;
            arg0.field740 += (var4 - arg0.field740) / var2;
            arg0.field768 = 0;
            if (arg0.field747 == 0) {
                arg0.field732 = 1024;
            }
            if (arg0.field747 == 1) {
                arg0.field732 = 1536;
            }
            if (arg0.field747 == 2) {
                arg0.field732 = 0;
            }
            if (arg0.field747 == 3) {
                arg0.field732 = 512;
            }
        } else if (arg0.field738 >= field265) {
            if (field265 == arg0.field738 || arg0.field742 == -1 || arg0.field745 != 0 || arg0.field744 + 1 > class38.method81(arg0.field742).field909[arg0.field713]) {
                int var5 = arg0.field738 - arg0.field756;
                int var6 = field265 - arg0.field756;
                int var7 = arg0.field752 * 128 + arg0.field716 * 64;
                int var8 = arg0.field754 * 128 + arg0.field716 * 64;
                int var9 = arg0.field734 * 128 + arg0.field716 * 64;
                int var10 = arg0.field758 * 128 + arg0.field716 * 64;
                arg0.field729 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field740 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field768 = 0;
            if (arg0.field747 == 0) {
                arg0.field732 = 1024;
            }
            if (arg0.field747 == 1) {
                arg0.field732 = 1536;
            }
            if (arg0.field747 == 2) {
                arg0.field732 = 0;
            }
            if (arg0.field747 == 3) {
                arg0.field732 = 512;
            }
            arg0.field714 = arg0.field732;
        } else {
            method2501(arg0);
        }
        if (arg0.field729 < 128 || arg0.field740 < 128 || arg0.field729 >= 13184 || arg0.field740 >= 13184) {
            arg0.field742 = -1;
            arg0.field751 = -1;
            arg0.field756 = 0;
            arg0.field738 = 0;
            arg0.field729 = arg0.field765[0] * 128 + arg0.field716 * 64;
            arg0.field740 = arg0.field766[0] * 128 + arg0.field716 * 64;
            arg0.method602();
        }
        if (Statics.field521 == arg0 && (arg0.field729 < 1536 || arg0.field740 < 1536 || arg0.field729 >= 11776 || arg0.field740 >= 11776)) {
            arg0.field742 = -1;
            arg0.field751 = -1;
            arg0.field756 = 0;
            arg0.field738 = 0;
            arg0.field729 = arg0.field765[0] * 128 + arg0.field716 * 64;
            arg0.field740 = arg0.field766[0] * 128 + arg0.field716 * 64;
            arg0.method602();
        }
        if (arg0.field763 != 0) {
            if (arg0.field736 != -1 && arg0.field736 < 32768) {
                class30 var11 = field292[arg0.field736];
                if (var11 != null) {
                    int var12 = arg0.field729 - var11.field729;
                    int var13 = arg0.field740 - var11.field740;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field732 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field736 >= 32768) {
                int var14 = arg0.field736 - 32768;
                if (field382 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field376[var14];
                if (var15 != null) {
                    int var16 = arg0.field729 - var15.field729;
                    int var17 = arg0.field740 - var15.field740;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field732 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field737 != 0 || arg0.field749 != 0) && (arg0.field764 == 0 || arg0.field768 > 0)) {
                int var18 = arg0.field729 - (arg0.field737 * 64 - Statics.field439 * 64 - Statics.field439 * 64);
                int var19 = arg0.field740 - (arg0.field749 * 64 - Statics.field88 * 64 - Statics.field88 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field732 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field737 = 0;
                arg0.field749 = 0;
            }
            int var20 = arg0.field732 - arg0.field714 & 0x7FF;
            if (var20 == 0) {
                arg0.field762 = 0;
            } else {
                arg0.field762++;
                if (var20 > 1024) {
                    arg0.field714 -= arg0.field763;
                    boolean var21 = true;
                    if (var20 < arg0.field763 || var20 > 2048 - arg0.field763) {
                        arg0.field714 = arg0.field732;
                        var21 = false;
                    }
                    if (arg0.field739 == arg0.field717 && (arg0.field762 > 25 || var21)) {
                        if (arg0.field718 == -1) {
                            arg0.field739 = arg0.field720;
                        } else {
                            arg0.field739 = arg0.field718;
                        }
                    }
                } else {
                    arg0.field714 += arg0.field763;
                    boolean var22 = true;
                    if (var20 < arg0.field763 || var20 > 2048 - arg0.field763) {
                        arg0.field714 = arg0.field732;
                        var22 = false;
                    }
                    if (arg0.field739 == arg0.field717 && (arg0.field762 > 25 || var22)) {
                        if (arg0.field721 == -1) {
                            arg0.field739 = arg0.field720;
                        } else {
                            arg0.field739 = arg0.field721;
                        }
                    }
                }
                arg0.field714 &= 0x7FF;
            }
        }
        arg0.field715 = false;
        if (arg0.field739 != -1) {
            class38 var24 = class38.method81(arg0.field739);
            if (var24 == null || var24.field907 == null) {
                arg0.field739 = -1;
            } else {
                arg0.field769++;
                if (arg0.field761 < var24.field907.length && arg0.field769 > var24.field909[arg0.field761]) {
                    arg0.field769 = 1;
                    arg0.field761++;
                    method2572(var24, arg0.field761, arg0.field729, arg0.field740);
                }
                if (arg0.field761 >= var24.field907.length) {
                    arg0.field769 = 0;
                    arg0.field761 = 0;
                    method2572(var24, arg0.field761, arg0.field729, arg0.field740);
                }
            }
        }
        if (arg0.field751 != -1 && field265 >= arg0.field750) {
            if (arg0.field748 < 0) {
                arg0.field748 = 0;
            }
            int var25 = class39.method467(arg0.field751).field918;
            if (var25 == -1) {
                arg0.field751 = -1;
            } else {
                class38 var26 = class38.method81(var25);
                if (var26 == null || var26.field907 == null) {
                    arg0.field751 = -1;
                } else {
                    arg0.field725++;
                    if (arg0.field748 < var26.field907.length && arg0.field725 > var26.field909[arg0.field748]) {
                        arg0.field725 = 1;
                        arg0.field748++;
                        method2572(var26, arg0.field748, arg0.field729, arg0.field740);
                    }
                    if (arg0.field748 >= var26.field907.length && (arg0.field748 < 0 || arg0.field748 >= var26.field907.length)) {
                        arg0.field751 = -1;
                    }
                }
            }
        }
        if (arg0.field742 != -1 && arg0.field745 <= 1) {
            class38 var27 = class38.method81(arg0.field742);
            if (var27.field904 == 1 && arg0.field743 > 0 && arg0.field756 <= field265 && arg0.field738 < field265) {
                arg0.field745 = 1;
                return;
            }
        }
        if (arg0.field742 != -1 && arg0.field745 == 0) {
            class38 var28 = class38.method81(arg0.field742);
            if (var28 == null || var28.field907 == null) {
                arg0.field742 = -1;
            } else {
                arg0.field744++;
                if (arg0.field713 < var28.field907.length && arg0.field744 > var28.field909[arg0.field713]) {
                    arg0.field744 = 1;
                    arg0.field713++;
                    method2572(var28, arg0.field713, arg0.field729, arg0.field740);
                }
                if (arg0.field713 >= var28.field907.length) {
                    arg0.field713 -= var28.field897;
                    arg0.field746++;
                    if (arg0.field746 >= var28.field903) {
                        arg0.field742 = -1;
                    } else if (arg0.field713 >= 0 && arg0.field713 < var28.field907.length) {
                        method2572(var28, arg0.field713, arg0.field729, arg0.field740);
                    } else {
                        arg0.field742 = -1;
                    }
                }
                arg0.field715 = var28.field899;
            }
        }
        if (arg0.field745 > 0) {
            arg0.field745--;
        }
    }

    @ObfuscatedName("db.ai(Laj;I)V")
    public static final void method2501(class33 arg0) {
        arg0.field739 = arg0.field717;
        if (arg0.field764 == 0) {
            arg0.field768 = 0;
            return;
        }
        if (arg0.field742 != -1 && arg0.field745 == 0) {
            class38 var1 = class38.method81(arg0.field742);
            if (arg0.field743 > 0 && var1.field904 == 0) {
                arg0.field768++;
                return;
            }
            if (arg0.field743 <= 0 && var1.field905 == 0) {
                arg0.field768++;
                return;
            }
        }
        int var2 = arg0.field729;
        int var3 = arg0.field740;
        int var4 = arg0.field765[arg0.field764 - 1] * 128 + arg0.field716 * 64;
        int var5 = arg0.field766[arg0.field764 - 1] * 128 + arg0.field716 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field729 = var4;
            arg0.field740 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field732 = 1280;
            } else if (var3 > var5) {
                arg0.field732 = 1792;
            } else {
                arg0.field732 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field732 = 768;
            } else if (var3 > var5) {
                arg0.field732 = 256;
            } else {
                arg0.field732 = 512;
            }
        } else if (var3 < var5) {
            arg0.field732 = 1024;
        } else if (var3 > var5) {
            arg0.field732 = 0;
        }
        int var6 = arg0.field732 - arg0.field714 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field755;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field720;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field757;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field741;
        }
        if (var7 == -1) {
            var7 = arg0.field720;
        }
        arg0.field739 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field683.field789;
        }
        if (var9) {
            if (arg0.field732 != arg0.field714 && arg0.field736 == -1 && arg0.field763 != 0) {
                var8 = 2;
            }
            if (arg0.field764 > 2) {
                var8 = 6;
            }
            if (arg0.field764 > 3) {
                var8 = 8;
            }
            if (arg0.field768 > 0 && arg0.field764 > 1) {
                var8 = 8;
                arg0.field768--;
            }
        } else {
            if (arg0.field764 > 1) {
                var8 = 6;
            }
            if (arg0.field764 > 2) {
                var8 = 8;
            }
            if (arg0.field768 > 0 && arg0.field764 > 1) {
                var8 = 8;
                arg0.field768--;
            }
        }
        if (arg0.field767[arg0.field764 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field739 == arg0.field720 && arg0.field724 != -1) {
            arg0.field739 = arg0.field724;
        }
        if (var2 < var4) {
            arg0.field729 += var8;
            if (arg0.field729 > var4) {
                arg0.field729 = var4;
            }
        } else if (var2 > var4) {
            arg0.field729 -= var8;
            if (arg0.field729 < var4) {
                arg0.field729 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field740 += var8;
            if (arg0.field740 > var5) {
                arg0.field740 = var5;
            }
        } else if (var3 > var5) {
            arg0.field740 -= var8;
            if (arg0.field740 < var5) {
                arg0.field740 = var5;
            }
        }
        if (arg0.field729 == var4 && arg0.field740 == var5) {
            arg0.field764--;
            if (arg0.field743 > 0) {
                arg0.field743--;
            }
        }
    }

    @ObfuscatedName("cb.aw(La;III)V")
    public static void method1981(class3 arg0, int arg1, int arg2) {
        if (arg0.field742 == arg1 && arg1 != -1) {
            int var3 = class38.method81(arg1).field901;
            if (var3 == 1) {
                arg0.field713 = 0;
                arg0.field744 = 0;
                arg0.field745 = arg2;
                arg0.field746 = 0;
            }
            if (var3 == 2) {
                arg0.field746 = 0;
            }
        } else if (arg1 == -1 || arg0.field742 == -1 || class38.method81(arg1).field900 >= class38.method81(arg0.field742).field900) {
            arg0.field742 = arg1;
            arg0.field713 = 0;
            arg0.field744 = 0;
            arg0.field745 = arg2;
            arg0.field746 = 0;
            arg0.field743 = arg0.field764;
        }
    }

    @ObfuscatedName("v.aj(Ljava/lang/String;ZI)V")
    public static final void method145(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field57.method3396(arg0, 250);
        int var6 = Statics.field57.method3330(arg0, 250) * 13;
        class73.method1532(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1572(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field57.method3335(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2662(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method147(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1007.getGraphics();
            Statics.field857.method1358(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1007.repaint();
        }
    }

    @ObfuscatedName("ah.ax(Las;I)V")
    public static final void method808(class29 arg0) {
        if (Statics.field521.field729 >> 7 == field485 && Statics.field521.field740 >> 7 == field486) {
            field485 = 0;
        }
        int var1 = field453;
        if (class29.field680 == arg0 || class29.field675 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field680 == arg0) {
                var3 = Statics.field521;
                var4 = 33538048;
            } else if (class29.field675 == arg0) {
                var3 = field376[field390];
                var4 = field390 << 14;
            } else {
                var3 = field376[field378[var2]];
                var4 = field378[var2] << 14;
                if (class29.field677 == arg0 && field390 == field378[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method14()) {
                var3.field56 = false;
                if ((field260 && field453 > 50 || field453 > 200) && class29.field680 != arg0 && var3.field739 == var3.field717) {
                    var3.field56 = true;
                }
                int var5 = var3.field729 >> 7;
                int var6 = var3.field740 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field47 == null || field265 < var3.field43 || field265 >= var3.field59) {
                        if ((var3.field729 & 0x7F) == 64 && (var3.field740 & 0x7F) == 64) {
                            if (field360 == field359[var5][var6]) {
                                continue;
                            }
                            field359[var5][var6] = field360;
                        }
                        var3.field45 = method576(var3.field729, var3.field740, Statics.field930);
                        Statics.field1866.method1620(Statics.field930, var3.field729, var3.field740, var3.field45, 60, var3, var3.field714, var4, var3.field715);
                    } else {
                        var3.field56 = false;
                        var3.field45 = method576(var3.field729, var3.field740, Statics.field930);
                        Statics.field1866.method1621(Statics.field930, var3.field729, var3.field740, var3.field45, 60, var3, var3.field714, var4, var3.field52, var3.field53, var3.field54, var3.field58);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.ar(ZI)V")
    public static final void method1971(boolean arg0) {
        for (int var1 = 0; var1 < field463; var1++) {
            class30 var2 = field292[field290[var1]];
            int var3 = (field290[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field683.field810 == arg0 && var2.field683.method638()) {
                int var4 = var2.field729 >> 7;
                int var5 = var2.field740 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field716 == 1 && (var2.field729 & 0x7F) == 64 && (var2.field740 & 0x7F) == 64) {
                        if (field360 == field359[var4][var5]) {
                            continue;
                        }
                        field359[var4][var5] = field360;
                    }
                    if (!var2.field683.field818) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1866.method1620(Statics.field930, var2.field729, var2.field740, method576(var2.field729 + (var2.field716 * 64 - 64), var2.field740 + (var2.field716 * 64 - 64), Statics.field930), var2.field716 * 64 - 64 + 60, var2, var2.field714, var3, var2.field715);
                }
            }
        }
    }

    @ObfuscatedName("dc.ac(I)V")
    public static final void method2391() {
        for (class26 var0 = (class26) field333.method3225(); var0 != null; var0 = (class26) field333.method3227()) {
            if (Statics.field930 != var0.field617 || var0.field620) {
                var0.method3307();
            } else if (field265 >= var0.field612) {
                var0.method528(field332);
                if (var0.field620) {
                    var0.method3307();
                } else {
                    Statics.field1866.method1620(var0.field617, var0.field614, var0.field613, var0.field616, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("eq.ap(Laj;IIIIII)V")
    public static final void method2930(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method14()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field683;
            if (var6.field798 != null) {
                var6 = var6.method623();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field453) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field41 != -1 || var8.field42 != -1) {
                method140(arg0, arg0.field760 + 15);
                if (field477 > -1) {
                    if (var8.field41 != -1) {
                        Statics.field1493[var8.field41].method1436(field477 + arg2 - 12, field362 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field42 != -1) {
                        Statics.field85[var8.field42].method1436(field477 + arg2 - 12, field362 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field273 == 10 && field275 == field378[arg1]) {
                method140(arg0, arg0.field760 + 15);
                if (field477 > -1) {
                    Statics.field251[1].method1436(field477 + arg2 - 12, field362 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field683;
            if (var9.field798 != null) {
                var9 = var9.method623();
            }
            if (var9.field788 >= 0 && var9.field788 < Statics.field85.length) {
                method140(arg0, arg0.field760 + 15);
                if (field477 > -1) {
                    Statics.field85[var9.field788].method1436(field477 + arg2 - 12, field362 + arg3 - 30);
                }
            }
            if (field273 == 1 && field274 == field290[arg1 - field453] && field265 % 20 < 10) {
                method140(arg0, arg0.field760 + 15);
                if (field477 > -1) {
                    Statics.field251[0].method1436(field477 + arg2 - 12, field362 + arg3 - 28);
                }
            }
        }
        if (arg0.field712 != null && (arg1 >= field453 || field470 == 4 || !arg0.field726 && (field470 == 0 || field470 == 3 || field470 == 1 && method855(((class3) arg0).field50, false)))) {
            method140(arg0, arg0.field760);
            if (field477 > -1 && field349 < field514) {
                field354[field349] = Statics.field1896.method3327(arg0.field712) / 2;
                field392[field349] = Statics.field1896.field2890;
                field351[field349] = field477;
                field303[field349] = field362;
                field355[field349] = arg0.field728;
                field356[field349] = arg0.field722;
                field406[field349] = arg0.field733;
                field358[field349] = arg0.field712;
                field349++;
            }
        }
        if (arg0.field730 > field265) {
            method140(arg0, arg0.field760 + 15);
            if (field477 > -1) {
                int var10 = arg0.field727 * 30 / arg0.field735;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field727 > 0) {
                    var10 = 1;
                }
                class73.method1532(field477 + arg2 - 15, field362 + arg3 - 3, var10, 5, 65280);
                class73.method1532(field477 + arg2 - 15 + var10, field362 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field723[var11] > field265) {
                method140(arg0, arg0.field760 / 2);
                if (field477 > -1) {
                    if (var11 == 1) {
                        field362 -= 20;
                    }
                    if (var11 == 2) {
                        field477 -= 15;
                        field362 -= 10;
                    }
                    if (var11 == 3) {
                        field477 += 15;
                        field362 -= 10;
                    }
                    Statics.field1826[arg0.field731[var11]].method1436(field477 + arg2 - 12, field362 + arg3 - 12);
                    Statics.field522.method3334(Integer.toString(arg0.field719[var11]), field477 + arg2 - 1, field362 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("o.az(I)V")
    public static final void method130() {
        field375 = 0;
        int var0 = (Statics.field521.field729 >> 7) + Statics.field439;
        int var1 = (Statics.field521.field740 >> 7) + Statics.field88;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field375 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field375 = 1;
        }
        if (field375 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field375 = 0;
        }
    }

    @ObfuscatedName("ap.ae(IIIII)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3) {
        if (field366 == 1) {
            Statics.field433[field365 / 100].method1436(field352 - 8, field461 - 8);
        }
        if (field366 == 2) {
            Statics.field433[field365 / 100 + 4].method1436(field352 - 8, field461 - 8);
        }
        method130();
        if (!field271) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field57.method3333("Fps:" + field2056, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field260) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field260) {
            var8 = 16711680;
        }
        Statics.field57.method3333("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("b.ah(Laj;IS)V")
    public static final void method140(class33 arg0, int arg1) {
        method2077(arg0.field729, arg0.field740, arg1);
    }

    @ObfuscatedName("cc.ad(IIII)V")
    public static final void method2077(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field477 = -1;
            field362 = -1;
            return;
        }
        int var3 = method576(arg0, arg1, Statics.field930) - arg2;
        int var4 = arg0 - Statics.field1502;
        int var5 = var3 - Statics.field1651;
        int var6 = arg1 - Statics.field678;
        int var7 = class84.field1469[Statics.field177];
        int var8 = class84.field1470[Statics.field177];
        int var9 = class84.field1469[Statics.field1420];
        int var10 = class84.field1470[Statics.field1420];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field477 = (var11 << 9) / var15 + 256;
            field362 = (var14 << 9) / var15 + 167;
        } else {
            field477 = -1;
            field362 = -1;
        }
    }

    @ObfuscatedName("ab.ay(IIII)I")
    public static final int method576(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field82[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field91[var5][var3][var4] + class6.field91[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field91[var5][var3][var4 + 1] + class6.field91[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ac.at(IIIIIIB)V")
    public static final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1469[var6];
            int var12 = class84.field1470[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1469[var7];
            int var15 = class84.field1470[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1502 = arg0 - var8;
        Statics.field1651 = arg1 - var9;
        Statics.field678 = arg2 - var10;
        Statics.field177 = arg3;
        Statics.field1420 = arg4;
    }

    @ObfuscatedName("h.au(ZI)V")
    public static final void method533(boolean arg0) {
        field317 = arg0;
        if (!field317) {
            int var1 = field507.method2175();
            int var2 = field507.method2173();
            int var3 = (field299 - field507.field1841) / 16;
            Statics.field1802 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1802[var4][var5] = field507.method2319();
                }
            }
            int var6 = field507.method2291();
            int var7 = field507.method2182();
            int var8 = field507.method2173();
            Statics.field1751 = new int[var3];
            Statics.field607 = new int[var3];
            Statics.field35 = new int[var3];
            Statics.field201 = new byte[var3][];
            Statics.field315 = new byte[var3][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1751[var10] = var13;
                        Statics.field607[var10] = Statics.field1814.method2781("m" + var11 + "_" + var12);
                        Statics.field35[var10] = Statics.field1814.method2781("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1423(var2, var8, var6, var1, var7);
            return;
        }
        int var14 = field507.method2230();
        int var15 = field507.method2173();
        field507.method2373();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field507.method2387(1);
                    if (var19 == 1) {
                        field318[var16][var17][var18] = field507.method2387(26);
                    } else {
                        field318[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field507.method2375();
        int var20 = (field299 - field507.field1841) / 16;
        Statics.field1802 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field1802[var21][var22] = field507.method2181();
            }
        }
        int var23 = field507.method2175();
        int var24 = field507.method2188();
        int var25 = field507.method2188();
        Statics.field1751 = new int[var20];
        Statics.field607 = new int[var20];
        Statics.field35 = new int[var20];
        Statics.field201 = new byte[var20][];
        Statics.field315 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field318[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1751[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1751[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field607[var26] = Statics.field1814.method2781("m" + var35 + "_" + var36);
                            Statics.field35[var26] = Statics.field1814.method2781("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1423(var15, var24, var14, var23, var25);
    }

    @ObfuscatedName("bj.an(IIIIIB)V")
    public static final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field298 == arg0 && Statics.field1803 == arg1 && field449 == arg2 || !field260) {
            return;
        }
        Statics.field298 = arg0;
        Statics.field1803 = arg1;
        field449 = arg2;
        if (!field260) {
            field449 = 0;
        }
        method1871(25);
        method145(class142.field2151, true);
        int var5 = Statics.field439;
        int var6 = Statics.field88;
        Statics.field439 = (arg0 - 6) * 8;
        Statics.field88 = (arg1 - 6) * 8;
        int var7 = Statics.field439 - var5;
        int var8 = Statics.field88 - var6;
        int var9 = Statics.field439;
        int var10 = Statics.field88;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field292[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field765[var13] -= var7;
                    var12.field766[var13] -= var8;
                }
                var12.field729 -= var7 * 128;
                var12.field740 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field376[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field765[var16] -= var7;
                    var15.field766[var16] -= var8;
                }
                var15.field729 -= var7 * 128;
                var15.field740 -= var8 * 128;
            }
        }
        Statics.field930 = arg2;
        Statics.field521.method600(arg3, arg4, false);
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
                        field391[var27][var23][var24] = field391[var27][var25][var26];
                    } else {
                        field391[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field363.method3225(); var28 != null; var28 = (class15) field363.method3227()) {
            var28.field215 -= var7;
            var28.field216 -= var8;
            if (var28.field215 < 0 || var28.field216 < 0 || var28.field215 >= 104 || var28.field216 >= 104) {
                var28.method3307();
            }
        }
        if (field485 != 0) {
            field485 -= var7;
            field486 -= var8;
        }
        field493 = 0;
        field499 = false;
        field480 = -1;
        field333.method3231();
        field393.method3231();
    }

    @ObfuscatedName("n.al(ZB)V")
    public static final void method160(boolean arg0) {
        method2475();
        field302++;
        if (field302 < 50 && !arg0) {
            return;
        }
        field302 = 0;
        if (field307 || Statics.field18 == null) {
            return;
        }
        field296.method2374(33);
        try {
            Statics.field18.method2576(field296.field1845, 0, field296.field1841);
            field296.field1841 = 0;
        } catch (IOException var2) {
            field307 = true;
        }
    }

    @ObfuscatedName("at.am(IB)V")
    public static final void method849(int arg0) {
        int[] var1 = Statics.field237.field1292;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field82[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1866.method1643(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field82[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1866.method1643(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field237.method1435();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field82[arg0][var10][var9] & 0x18) == 0) {
                    method762(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field82[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method762(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field481 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1866.method1638(Statics.field930, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method1794(var14).field853;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field311[Statics.field930].field2923;
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
                        field484[field481] = Statics.field571[var15];
                        field468[field481] = var16;
                        field364[field481] = var17;
                        field481++;
                    }
                }
            }
        }
        Statics.field857.method1426();
    }

    @ObfuscatedName("az.av(IIIIII)V")
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1866.method1635(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1866.method1639(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field237.field1292;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method1794(var12);
            if (var13.field842 == -1) {
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
                class74 var14 = Statics.field189[var13.field842];
                if (var14 != null) {
                    int var15 = (var13.field840 * 4 - var14.field1308) / 2;
                    int var16 = (var13.field824 * 4 - var14.field1315) / 2;
                    var14.method1579(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field824) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1866.method1781(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1866.method1639(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method1794(var21);
            if (var22.field842 != -1) {
                class74 var23 = Statics.field189[var22.field842];
                if (var23 != null) {
                    int var24 = (var22.field840 * 4 - var23.field1308) / 2;
                    int var25 = (var22.field824 * 4 - var23.field1315) / 2;
                    var23.method1579(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field824) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field237.field1292;
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
        int var29 = Statics.field1866.method1638(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method1794(var30);
        if (var31.field842 == -1) {
            return;
        }
        class74 var32 = Statics.field189[var31.field842];
        if (var32 != null) {
            int var33 = (var31.field840 * 4 - var32.field1308) / 2;
            int var34 = (var31.field824 * 4 - var32.field1315) / 2;
            var32.method1579(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field824) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ch.ag(I)V")
    public static final void method1793() {
        if (field300 == 57) {
            int var0 = field507.method2125();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1240;
            int var2 = (var0 & 0x7) + Statics.field2801;
            int var3 = field507.method2291();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field368[var4];
            int var7 = field507.method2188();
            if (var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
                if (var6 == 0) {
                    class80 var8 = Statics.field1866.method1715(Statics.field930, var1, var2);
                    if (var8 != null) {
                        int var9 = var8.field1410 >> 14 & 0x7FFF;
                        if (var4 == 2) {
                            var8.field1412 = new class11(var9, 2, var5 + 4, Statics.field930, var1, var2, var7, false, var8.field1412);
                            var8.field1411 = new class11(var9, 2, var5 + 1 & 0x3, Statics.field930, var1, var2, var7, false, var8.field1411);
                        } else {
                            var8.field1412 = new class11(var9, var4, var5, Statics.field930, var1, var2, var7, false, var8.field1412);
                        }
                    }
                }
                if (var6 == 1) {
                    class87 var10 = Statics.field1866.method1770(Statics.field930, var1, var2);
                    if (var10 != null) {
                        int var11 = var10.field1489 >> 14 & 0x7FFF;
                        if (var4 == 4 || var4 == 5) {
                            var10.field1482 = new class11(var11, 4, var5, Statics.field930, var1, var2, var7, false, var10.field1482);
                        } else if (var4 == 6) {
                            var10.field1482 = new class11(var11, 4, var5 + 4, Statics.field930, var1, var2, var7, false, var10.field1482);
                        } else if (var4 == 7) {
                            var10.field1482 = new class11(var11, 4, (var5 + 2 & 0x3) + 4, Statics.field930, var1, var2, var7, false, var10.field1482);
                        } else if (var4 == 8) {
                            var10.field1482 = new class11(var11, 4, var5 + 4, Statics.field930, var1, var2, var7, false, var10.field1482);
                            var10.field1488 = new class11(var11, 4, (var5 + 2 & 0x3) + 4, Statics.field930, var1, var2, var7, false, var10.field1488);
                        }
                    }
                }
                if (var6 == 2) {
                    class91 var12 = Statics.field1866.method1633(Statics.field930, var1, var2);
                    if (var4 == 11) {
                        var4 = 10;
                    }
                    if (var12 != null) {
                        var12.field1545 = new class11(var12.field1553 >> 14 & 0x7FFF, var4, var5, Statics.field930, var1, var2, var7, false, var12.field1545);
                    }
                }
                if (var6 == 3) {
                    class86 var13 = Statics.field1866.method1634(Statics.field930, var1, var2);
                    if (var13 != null) {
                        var13.field1474 = new class11(var13.field1479 >> 14 & 0x7FFF, 22, var5, Statics.field930, var1, var2, var7, false, var13.field1474);
                    }
                }
            }
        } else if (field300 == 59) {
            int var14 = field507.method2125();
            int var15 = (var14 >> 4 & 0x7) + Statics.field1240;
            int var16 = (var14 & 0x7) + Statics.field2801;
            int var17 = var15 + field507.method2201();
            int var18 = var16 + field507.method2201();
            int var19 = field507.method2144();
            int var20 = field507.method2182();
            int var21 = field507.method2125() * 4;
            int var22 = field507.method2125() * 4;
            int var23 = field507.method2182();
            int var24 = field507.method2182();
            int var25 = field507.method2125();
            int var26 = field507.method2125();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field930, var27, var28, method576(var27, var28, Statics.field930) - var21, field265 + var23, field265 + var24, var25, var26, var19, var22);
                var31.method72(var29, var30, method576(var29, var30, Statics.field930) - var22, field265 + var23);
                field393.method3222(var31);
            }
        } else if (field300 == 246) {
            int var32 = field507.method2125();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field368[var33];
            int var36 = field507.method2230();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1240;
            int var38 = (var36 & 0x7) + Statics.field2801;
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                method1371(Statics.field930, var37, var38, var35, -1, var33, var34, 0, -1);
            }
        } else if (field300 == 42) {
            int var39 = field507.method2125();
            int var40 = (var39 >> 4 & 0x7) + Statics.field1240;
            int var41 = (var39 & 0x7) + Statics.field2801;
            int var42 = field507.method2182();
            int var43 = field507.method2182();
            int var44 = field507.method2182();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class176 var45 = field391[Statics.field930][var40][var41];
                if (var45 != null) {
                    for (class25 var46 = (class25) var45.method3225(); var46 != null; var46 = (class25) var45.method3227()) {
                        if ((var42 & 0x7FFF) == var46.field604 && var46.field605 == var43) {
                            var46.field605 = var44;
                            break;
                        }
                    }
                    method2894(var40, var41);
                }
            }
        } else if (field300 == 128) {
            int var47 = field507.method2125();
            int var48 = (var47 >> 4 & 0x7) + Statics.field1240;
            int var49 = (var47 & 0x7) + Statics.field2801;
            int var50 = field507.method2182();
            int var51 = field507.method2125();
            int var52 = field507.method2182();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                int var53 = var48 * 128 + 64;
                int var54 = var49 * 128 + 64;
                class26 var55 = new class26(var50, Statics.field930, var53, var54, method576(var53, var54, Statics.field930) - var51, var52, field265);
                field333.method3222(var55);
            }
        } else if (field300 == 103) {
            int var56 = field507.method2291();
            int var57 = (var56 >> 4 & 0x7) + Statics.field1240;
            int var58 = (var56 & 0x7) + Statics.field2801;
            int var59 = field507.method2182();
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                class176 var60 = field391[Statics.field930][var57][var58];
                if (var60 != null) {
                    for (class25 var61 = (class25) var60.method3225(); var61 != null; var61 = (class25) var60.method3227()) {
                        if ((var59 & 0x7FFF) == var61.field604) {
                            var61.method3307();
                            break;
                        }
                    }
                    if (var60.method3225() == null) {
                        field391[Statics.field930][var57][var58] = null;
                    }
                    method2894(var57, var58);
                }
            }
        } else {
            if (field300 == 27) {
                int var62 = field507.method2188();
                int var63 = field507.method2188();
                int var64 = field507.method2175();
                byte var65 = field507.method2169();
                int var66 = field507.method2125();
                int var67 = (var66 >> 4 & 0x7) + Statics.field1240;
                int var68 = (var66 & 0x7) + Statics.field2801;
                int var69 = field507.method2188();
                byte var70 = field507.method2168();
                int var71 = field507.method2291();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field368[var72];
                byte var75 = field507.method2201();
                byte var76 = field507.method2201();
                class3 var77;
                if (field382 == var69) {
                    var77 = Statics.field521;
                } else {
                    var77 = field376[var69];
                }
                if (var77 != null) {
                    class36 var78 = class36.method1794(var64);
                    int var79;
                    int var80;
                    if (var73 == 1 || var73 == 3) {
                        var79 = var78.field824;
                        var80 = var78.field840;
                    } else {
                        var79 = var78.field840;
                        var80 = var78.field824;
                    }
                    int var81 = (var79 >> 1) + var67;
                    int var82 = (var79 + 1 >> 1) + var67;
                    int var83 = (var80 >> 1) + var68;
                    int var84 = (var80 + 1 >> 1) + var68;
                    int[][] var85 = class6.field91[Statics.field930];
                    int var86 = var85[var81][var83] + var85[var82][var83] + var85[var81][var84] + var85[var82][var84] >> 2;
                    int var87 = (var67 << 7) + (var79 << 6);
                    int var88 = (var68 << 7) + (var80 << 6);
                    class98 var89 = var78.method655(var72, var73, var85, var87, var86, var88);
                    if (var89 != null) {
                        method1371(Statics.field930, var67, var68, var74, -1, 0, 0, var62 + 1, var63 + 1);
                        var77.field43 = field265 + var62;
                        var77.field59 = field265 + var63;
                        var77.field47 = var89;
                        var77.field39 = var67 * 128 + var79 * 64;
                        var77.field48 = var68 * 128 + var80 * 64;
                        var77.field49 = var86;
                        if (var70 > var75) {
                            byte var90 = var70;
                            var70 = var75;
                            var75 = var90;
                        }
                        if (var76 > var65) {
                            byte var91 = var76;
                            var76 = var65;
                            var65 = var91;
                        }
                        var77.field52 = var67 + var70;
                        var77.field54 = var67 + var75;
                        var77.field53 = var68 + var76;
                        var77.field58 = var65 + var68;
                    }
                }
            }
            if (field300 == 132) {
                int var92 = field507.method2188();
                int var93 = field507.method2175();
                int var94 = field507.method2291();
                int var95 = (var94 >> 4 & 0x7) + Statics.field1240;
                int var96 = (var94 & 0x7) + Statics.field2801;
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class25 var97 = new class25();
                    var97.field604 = var93;
                    var97.field605 = var92;
                    if (field391[Statics.field930][var95][var96] == null) {
                        field391[Statics.field930][var95][var96] = new class176();
                    }
                    field391[Statics.field930][var95][var96].method3222(var97);
                    method2894(var95, var96);
                }
            } else {
                if (field300 == 145) {
                    int var98 = field507.method2125();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field1240;
                    int var100 = (var98 & 0x7) + Statics.field2801;
                    int var101 = field507.method2182();
                    int var102 = field507.method2125();
                    int var103 = var102 >> 4 & 0xF;
                    int var104 = var102 & 0x7;
                    int var105 = field507.method2125();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var106 = var103 + 1;
                        if (Statics.field521.field765[0] >= var99 - var106 && Statics.field521.field765[0] <= var99 + var106 && Statics.field521.field766[0] >= var100 - var106 && Statics.field521.field766[0] <= var100 + var106 && field492 != 0 && var104 > 0 && field493 < 50) {
                            field494[field493] = var101;
                            field330[field493] = var104;
                            field496[field493] = var105;
                            field394[field493] = null;
                            field497[field493] = (var99 << 16) + (var100 << 8) + var103;
                            field493++;
                        }
                    }
                }
                if (field300 == 146) {
                    int var107 = field507.method2165();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1240;
                    int var109 = (var107 & 0x7) + Statics.field2801;
                    int var110 = field507.method2175();
                    int var111 = field507.method2125();
                    int var112 = var111 >> 2;
                    int var113 = var111 & 0x3;
                    int var114 = field368[var112];
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        method1371(Statics.field930, var108, var109, var114, var110, var112, var113, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.af(IIIIIIIIII)V")
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field363.method3225(); var10 != null; var10 = (class15) field363.method3227()) {
            if (var10.field223 == arg0 && var10.field215 == arg1 && var10.field216 == arg2 && var10.field214 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field223 = arg0;
            var9.field214 = arg3;
            var9.field215 = arg1;
            var9.field216 = arg2;
            method159(var9);
            field363.method3222(var9);
        }
        var9.field220 = arg4;
        var9.field221 = arg5;
        var9.field222 = arg6;
        var9.field219 = arg7;
        var9.field224 = arg8;
    }

    @ObfuscatedName("dd.ao(I)V")
    public static final void method2505() {
        for (class15 var0 = (class15) field363.method3225(); var0 != null; var0 = (class15) field363.method3227()) {
            if (var0.field224 == -1) {
                var0.field219 = 0;
                method159(var0);
            } else {
                var0.method3307();
            }
        }
    }

    @ObfuscatedName("n.aa(Lb;B)V")
    public static final void method159(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field214 == 0) {
            var1 = Statics.field1866.method1635(arg0.field223, arg0.field215, arg0.field216);
        }
        if (arg0.field214 == 1) {
            var1 = Statics.field1866.method1636(arg0.field223, arg0.field215, arg0.field216);
        }
        if (arg0.field214 == 2) {
            var1 = Statics.field1866.method1781(arg0.field223, arg0.field215, arg0.field216);
        }
        if (arg0.field214 == 3) {
            var1 = Statics.field1866.method1638(arg0.field223, arg0.field215, arg0.field216);
        }
        if (var1 != 0) {
            int var5 = Statics.field1866.method1639(arg0.field223, arg0.field215, arg0.field216, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field217 = var2;
        arg0.field218 = var3;
        arg0.field213 = var4;
    }

    @ObfuscatedName("h.bv(IIIIIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field260 && Statics.field930 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1866.method1635(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1866.method1636(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1866.method1781(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1866.method1638(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1866.method1639(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1866.method1642(arg0, arg2, arg3);
                class36 var15 = class36.method1794(var12);
                if (var15.field844 != 0) {
                    field311[arg0].method3471(arg2, arg3, var13, var14, var15.field828);
                }
            }
            if (arg1 == 1) {
                Statics.field1866.method1627(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1866.method1631(arg0, arg2, arg3);
                class36 var16 = class36.method1794(var12);
                if (var16.field840 + arg2 > 103 || var16.field840 + arg3 > 103 || var16.field824 + arg2 > 103 || var16.field824 + arg3 > 103) {
                    return;
                }
                if (var16.field844 != 0) {
                    field311[arg0].method3465(arg2, arg3, var16.field840, var16.field824, var14, var16.field828);
                }
            }
            if (arg1 == 3) {
                Statics.field1866.method1629(arg0, arg2, arg3);
                class36 var17 = class36.method1794(var12);
                if (var17.field844 == 1) {
                    field311[arg0].method3486(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field82[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method24(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1866, field311[arg0]);
    }

    @ObfuscatedName("ez.bl(III)V")
    public static final void method2894(int arg0, int arg1) {
        class176 var2 = field391[Statics.field930][arg0][arg1];
        if (var2 == null) {
            Statics.field1866.method1630(Statics.field930, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3225(); var6 != null; var6 = (class25) var2.method3227()) {
            class45 var7 = class45.method573(var6.field604);
            long var8 = (long) var7.field1019;
            if (var7.field1018 == 1) {
                var8 = (long) (var6.field605 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1866.method1630(Statics.field930, arg0, arg1);
            return;
        }
        var2.method3221(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3225(); var12 != null; var12 = (class25) var2.method3227()) {
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
        Statics.field1866.method1625(Statics.field930, arg0, arg1, method576(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field930), var5, var13, var10, var11);
    }

    @ObfuscatedName("a.be(B)V")
    public static final void method16() {
        field475 = 0;
        field506 = 0;
        method1870();
        int var0 = field507.method2387(8);
        if (var0 < field453) {
            for (int var1 = var0; var1 < field453; var1++) {
                field385[++field475 - 1] = field378[var1];
            }
        }
        if (var0 > field453) {
            throw new RuntimeException("");
        }
        field453 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field378[var2];
            class3 var4 = field376[var3];
            int var5 = field507.method2387(1);
            if (var5 == 0) {
                field378[++field453 - 1] = var3;
                var4.field759 = field265;
            } else {
                int var6 = field507.method2387(2);
                if (var6 == 0) {
                    field378[++field453 - 1] = var3;
                    var4.field759 = field265;
                    field380[++field506 - 1] = var3;
                } else if (var6 == 1) {
                    field378[++field453 - 1] = var3;
                    var4.field759 = field265;
                    int var7 = field507.method2387(3);
                    var4.method604(var7, false);
                    int var8 = field507.method2387(1);
                    if (var8 == 1) {
                        field380[++field506 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field378[++field453 - 1] = var3;
                    var4.field759 = field265;
                    int var9 = field507.method2387(3);
                    var4.method604(var9, true);
                    int var10 = field507.method2387(3);
                    var4.method604(var10, true);
                    int var11 = field507.method2387(1);
                    if (var11 == 1) {
                        field380[++field506 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field385[++field475 - 1] = var3;
                }
            }
        }
        method155();
        for (int var12 = 0; var12 < field506; var12++) {
            int var13 = field380[var12];
            class3 var14 = field376[var13];
            int var15 = field507.method2125();
            if ((var15 & 0x40) != 0) {
                var15 += field507.method2125() << 8;
            }
            method584(var13, var14, var15);
        }
        for (int var16 = 0; var16 < field475; var16++) {
            int var17 = field385[var16];
            if (field265 != field376[var17].field759) {
                field376[var17] = null;
            }
        }
        if (field299 != field507.field1841) {
            throw new RuntimeException(field507.field1841 + class2.field20 + field299);
        }
        for (int var18 = 0; var18 < field453; var18++) {
            if (field376[field378[var18]] == null) {
                throw new RuntimeException(var18 + class2.field20 + field453);
            }
        }
    }

    @ObfuscatedName("cz.bo(B)V")
    public static final void method1870() {
        field507.method2373();
        int var0 = field507.method2387(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field507.method2387(2);
        if (var1 == 0) {
            field380[++field506 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field507.method2387(3);
            Statics.field521.method604(var2, false);
            int var3 = field507.method2387(1);
            if (var3 == 1) {
                field380[++field506 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field507.method2387(3);
            Statics.field521.method604(var4, true);
            int var5 = field507.method2387(3);
            Statics.field521.method604(var5, true);
            int var6 = field507.method2387(1);
            if (var6 == 1) {
                field380[++field506 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field507.method2387(1);
            int var8 = field507.method2387(7);
            int var9 = field507.method2387(7);
            int var10 = field507.method2387(1);
            if (var10 == 1) {
                field380[++field506 - 1] = 2047;
            }
            Statics.field930 = field507.method2387(2);
            Statics.field521.method600(var9, var8, var7 == 1);
        }
    }

    @ObfuscatedName("n.bg(I)V")
    public static final void method155() {
        while (true) {
            if (field507.method2379(field299) >= 11) {
                int var0 = field507.method2387(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field376[var0] == null) {
                        field376[var0] = new class3();
                        if (field381[var0] != null) {
                            field376[var0].method22(field381[var0]);
                        }
                        var1 = true;
                    }
                    field378[++field453 - 1] = var0;
                    class3 var2 = field376[var0];
                    var2.field759 = field265;
                    int var3 = field507.method2387(1);
                    int var4 = field507.method2387(1);
                    if (var4 == 1) {
                        field380[++field506 - 1] = var0;
                    }
                    int var5 = field507.method2387(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field309[field507.method2387(3)];
                    if (var1) {
                        var2.field732 = var2.field714 = var6;
                    }
                    int var7 = field507.method2387(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method600(Statics.field521.field765[0] + var5, Statics.field521.field766[0] + var7, var3 == 1);
                    continue;
                }
            }
            field507.method2375();
            return;
        }
    }

    @ObfuscatedName("aq.bh(ILa;II)V")
    public static final void method584(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x8) != 0) {
            int var3 = field507.method2175();
            int var4 = field507.method2125();
            boolean var5 = field507.method2230() == 1;
            int var6 = field507.method2165();
            int var7 = field507.field1841;
            if (arg1.field50 != null && arg1.field40 != null) {
                boolean var8 = false;
                if (var4 <= 1 && method1865(arg1.field50)) {
                    var8 = true;
                }
                if (!var8 && field375 == 0) {
                    field281.field1841 = 0;
                    field507.method2276(field281.field1845, 0, var6);
                    field281.field1841 = 0;
                    String var9 = class189.method3331(class196.method3137(class188.method2083(field281)));
                    arg1.field712 = var9.trim();
                    arg1.field728 = var3 >> 8;
                    arg1.field722 = var3 & 0xFF;
                    arg1.field733 = 150;
                    arg1.field726 = var5;
                    if (var4 == 2 || var4 == 3) {
                        class10.method1607(var5 ? 91 : 1, class2.method510(1) + arg1.field50, var9);
                    } else if (var4 == 1) {
                        class10.method1607(var5 ? 91 : 1, class2.method510(0) + arg1.field50, var9);
                    } else {
                        class10.method1607(var5 ? 90 : 2, arg1.field50, var9);
                    }
                }
            }
            field507.field1841 = var6 + var7;
        }
        if ((arg2 & 0x2) != 0) {
            int var10 = field507.method2125();
            byte[] var11 = new byte[var10];
            class107 var12 = new class107(var11);
            field507.method2276(var11, 0, var10);
            field381[arg0] = var12;
            arg1.method22(var12);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field737 = field507.method2173();
            arg1.field749 = field507.method2182();
        }
        if ((arg2 & 0x1) != 0) {
            int var13 = field507.method2291();
            int var14 = field507.method2230();
            arg1.method616(var13, var14, field265);
            arg1.field730 = field265 + 300;
            arg1.field727 = field507.method2125();
            arg1.field735 = field507.method2230();
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field736 = field507.method2175();
            if (arg1.field736 == 65535) {
                arg1.field736 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field712 = field507.method2149();
            if (arg1.field712.charAt(0) == '~') {
                arg1.field712 = arg1.field712.substring(1);
                class10.method1607(2, arg1.field50, arg1.field712);
            } else if (Statics.field521 == arg1) {
                class10.method1607(2, arg1.field50, arg1.field712);
            }
            arg1.field726 = false;
            arg1.field728 = 0;
            arg1.field722 = 0;
            arg1.field733 = 150;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field752 = field507.method2165();
            arg1.field754 = field507.method2165();
            arg1.field734 = field507.method2165();
            arg1.field758 = field507.method2230();
            arg1.field756 = field507.method2182() + field265;
            arg1.field738 = field507.method2173() + field265;
            arg1.field747 = field507.method2230();
            arg1.field764 = 1;
            arg1.field743 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var15 = field507.method2188();
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = field507.method2125();
            method1981(arg1, var15, var16);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field751 = field507.method2175();
            int var17 = field507.method2319();
            arg1.field753 = var17 >> 16;
            arg1.field750 = (var17 & 0xFFFF) + field265;
            arg1.field748 = 0;
            arg1.field725 = 0;
            if (arg1.field750 > field265) {
                arg1.field748 = -1;
            }
            if (arg1.field751 == 65535) {
                arg1.field751 = -1;
            }
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        int var18 = field507.method2291();
        int var19 = field507.method2291();
        arg1.method616(var18, var19, field265);
        arg1.field730 = field265 + 300;
        arg1.field727 = field507.method2230();
        arg1.field735 = field507.method2165();
    }

    @ObfuscatedName("cr.bi(I)V")
    public static final void method1866() {
        while (true) {
            if (field507.method2379(field299) >= 27) {
                int var0 = field507.method2387(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field292[var0] == null) {
                        field292[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field292[var0];
                    field290[++field463 - 1] = var0;
                    var2.field759 = field265;
                    var2.field683 = class35.method131(field507.method2387(14));
                    int var3 = field507.method2387(1);
                    int var4 = field507.method2387(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field507.method2387(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field309[field507.method2387(3)];
                    if (var1) {
                        var2.field732 = var2.field714 = var6;
                    }
                    int var7 = field507.method2387(1);
                    if (var7 == 1) {
                        field380[++field506 - 1] = var0;
                    }
                    var2.field716 = var2.field683.field791;
                    var2.field763 = var2.field683.field814;
                    if (var2.field763 == 0) {
                        var2.field714 = 0;
                    }
                    var2.field720 = var2.field683.field797;
                    var2.field755 = var2.field683.field796;
                    var2.field741 = var2.field683.field786;
                    var2.field757 = var2.field683.field800;
                    var2.field717 = var2.field683.field822;
                    var2.field718 = var2.field683.field795;
                    var2.field721 = var2.field683.field794;
                    var2.method600(Statics.field521.field765[0] + var4, Statics.field521.field766[0] + var5, var3 == 1);
                    continue;
                }
            }
            field507.method2375();
            return;
        }
    }

    @ObfuscatedName("v.bc(B)V")
    public static final void method144() {
        int var0 = Statics.field1;
        int var1 = Statics.field770;
        int var2 = Statics.field2121;
        int var3 = Statics.field694;
        int var4 = 6116423;
        class73.method1532(var0, var1, var2, var3, var4);
        class73.method1532(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1572(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1896.method3394(class142.field2332, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2004;
        int var6 = class127.field2001;
        for (int var7 = 0; var7 < field400; var7++) {
            int var8 = (field400 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class190 var10 = Statics.field1896;
            String var11;
            if (field503[var7].length() > 0) {
                var11 = field276[var7] + class142.field2293 + field503[var7];
            } else {
                var11 = field276[var7];
            }
            var10.method3394(var11, var0 + 3, var8, var9, 0);
        }
        method147(Statics.field1, Statics.field770, Statics.field2121, Statics.field694);
    }

    @ObfuscatedName("ew.bn(IIIIB)V")
    public static final void method2662(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field459; var4++) {
            if (field508[var4] + field295[var4] > arg0 && field508[var4] < arg0 + arg2 && field467[var4] + field465[var4] > arg1 && field465[var4] < arg1 + arg3) {
                field418[var4] = true;
            }
        }
    }

    @ObfuscatedName("v.ba(IIIII)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field459; var4++) {
            if (field508[var4] + field295[var4] > arg0 && field508[var4] < arg0 + arg2 && field467[var4] + field465[var4] > arg1 && field465[var4] < arg1 + arg3) {
                field462[var4] = true;
            }
        }
    }

    @ObfuscatedName("ca.bm(III)V")
    public static final void method1786(int arg0, int arg1) {
        int var2 = Statics.field1896.method3327(class142.field2332);
        for (int var3 = 0; var3 < field400; var3++) {
            class190 var4 = Statics.field1896;
            String var5;
            if (field503[var3].length() > 0) {
                var5 = field276[var3] + class142.field2293 + field503[var3];
            } else {
                var5 = field276[var3];
            }
            int var6 = var4.method3327(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field400 * 15 + 21;
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
        field515 = true;
        Statics.field1 = var8;
        Statics.field770 = var9;
        Statics.field2121 = var2;
        Statics.field694 = field400 * 15 + 22;
    }

    @ObfuscatedName("z.bf(IB)Z")
    public static final boolean method482(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field377[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("q.bb(IB)V")
    public static final void method497(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field401[arg0];
        int var2 = field402[arg0];
        int var3 = field377[arg0];
        int var4 = field404[arg0];
        String var5 = field276[arg0];
        String var6 = field503[arg0];
        method611(var1, var2, var3, var4, var5, var6, class127.field2013, class127.field2014);
    }

    @ObfuscatedName("ab.br(Lak;III)V")
    public static final void method542(class27 arg0, int arg1, int arg2) {
        method611(arg0.field637, arg0.field629, arg0.field630, arg0.field628, arg0.field632, arg0.field632, arg1, arg2);
    }

    @ObfuscatedName("aj.bt(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method611(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1005) {
            class151 var8 = Statics.method815(arg1);
            if (var8 == null || var8.field2620[arg0] < 100000) {
                field296.method2374(9);
                field296.method2128(arg3);
            } else {
                class10.method1607(27, "", var8.field2620[arg0] + " x " + class45.method573(arg3).field999);
            }
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 38) {
            method11();
            class151 var9 = Statics.method815(arg1);
            field411 = 1;
            Statics.field1666 = arg0;
            Statics.field65 = arg1;
            Statics.field1245 = arg3;
            Statics.method2431(var9);
            field269 = class2.method85(16748608) + class45.method573(arg3).field999 + class2.method85(16777215);
            if (field269 == null) {
                field269 = "null";
            }
            return;
        }
        if (arg2 == 1002) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field296.method2374(159);
            field296.method2170(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 18) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(59);
            field296.method2249(class124.field1968[82] ? 1 : 0);
            field296.method2128(Statics.field88 + arg1);
            field296.method2172(arg3);
            field296.method2172(Statics.field439 + arg0);
        }
        if (arg2 == 28) {
            field296.method2374(101);
            field296.method2130(arg1);
            class151 var10 = Statics.method815(arg1);
            if (var10.field2613 != null && var10.field2613[0][0] == 5) {
                int var11 = var10.field2613[0][1];
                class153.field2645[var11] = 1 - class153.field2645[var11];
                method1790(var11);
            }
        }
        if (arg2 == 21) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(109);
            field296.method2265(arg3);
            field296.method2265(Statics.field439 + arg0);
            field296.method2265(Statics.field88 + arg1);
            field296.method2163(class124.field1968[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var12 = field376[arg3];
            if (var12 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(87);
                field296.method2170(Statics.field1666);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2170(Statics.field1245);
                field296.method2179(Statics.field65);
                field296.method2170(arg3);
            }
        }
        if (arg2 == 41) {
            field296.method2374(61);
            field296.method2170(arg3);
            field296.method2172(arg0);
            field296.method2178(arg1);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 44) {
            class3 var13 = field376[arg3];
            if (var13 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(103);
                field296.method2164(class124.field1968[82] ? 1 : 0);
                field296.method2128(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var14 = field376[arg3];
            if (var14 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(13);
                field296.method2128(field414);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2170(arg3);
                field296.method2178(Statics.field29);
            }
        }
        if (arg2 == 47) {
            class3 var15 = field376[arg3];
            if (var15 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(169);
                field296.method2170(arg3);
                field296.method2164(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class30 var16 = field292[arg3];
            if (var16 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(77);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2172(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var17 = field376[arg3];
            if (var17 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(66);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2172(arg3);
            }
        }
        if (arg2 == 5) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(141);
            field296.method2265(arg3 >> 14 & 0x7FFF);
            field296.method2162(class124.field1968[82] ? 1 : 0);
            field296.method2172(Statics.field439 + arg0);
            field296.method2265(Statics.field88 + arg1);
        }
        if (arg2 == 20) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(37);
            field296.method2172(Statics.field439 + arg0);
            field296.method2128(Statics.field88 + arg1);
            field296.method2164(class124.field1968[82] ? 1 : 0);
            field296.method2172(arg3);
        }
        if (arg2 == 29) {
            field296.method2374(101);
            field296.method2130(arg1);
            class151 var18 = Statics.method815(arg1);
            if (var18.field2613 != null && var18.field2613[0][0] == 5) {
                int var19 = var18.field2613[0][1];
                if (class153.field2645[var19] != var18.field2615[0]) {
                    class153.field2645[var19] = var18.field2615[0];
                    method1790(var19);
                }
            }
        }
        if (arg2 == 42) {
            field296.method2374(79);
            field296.method2177(arg1);
            field296.method2172(arg0);
            field296.method2170(arg3);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 17) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(114);
            field296.method2163(class124.field1968[82] ? 1 : 0);
            field296.method2172(Statics.field439 + arg0);
            field296.method2170(field414);
            field296.method2178(Statics.field29);
            field296.method2170(Statics.field88 + arg1);
            field296.method2265(arg3);
        }
        if (arg2 == 16) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(154);
            field296.method2163(class124.field1968[82] ? 1 : 0);
            field296.method2172(Statics.field88 + arg1);
            field296.method2128(Statics.field1245);
            field296.method2178(Statics.field65);
            field296.method2172(arg3);
            field296.method2170(Statics.field439 + arg0);
            field296.method2170(Statics.field1666);
        }
        if (arg2 == 1003) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            class30 var20 = field292[arg3];
            if (var20 != null) {
                class35 var21 = var20.field683;
                if (var21.field798 != null) {
                    var21 = var21.method623();
                }
                if (var21 != null) {
                    field296.method2374(121);
                    field296.method2265(var21.field787);
                }
            }
        }
        if (arg2 == 11) {
            class30 var22 = field292[arg3];
            if (var22 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(95);
                field296.method2265(arg3);
                field296.method2162(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field296.method2374(137);
            field296.method2177(arg1);
            field296.method2170(arg3);
            field296.method2265(arg0);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 30 && field339 == null) {
            field296.method2374(116);
            field296.method2128(arg0);
            field296.method2178(arg1);
            field339 = class151.method1422(arg1, arg0);
            Statics.method2431(field339);
        }
        if (arg2 == 6) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(11);
            field296.method2128(arg3 >> 14 & 0x7FFF);
            field296.method2163(class124.field1968[82] ? 1 : 0);
            field296.method2128(Statics.field88 + arg1);
            field296.method2128(Statics.field439 + arg0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class151 var23 = class151.method1422(arg1, arg0);
            if (var23 != null) {
                if (var23.field2509 != null) {
                    class1 var24 = new class1();
                    var24.field3 = var23;
                    var24.field6 = arg3;
                    var24.field10 = arg5;
                    var24.field13 = var23.field2509;
                    class32.method146(var24);
                }
                boolean var25 = true;
                if (var23.field2521 > 0) {
                    var25 = method112(var23);
                }
                if (var25) {
                    int var26 = method2423(var23);
                    int var27 = arg3 - 1;
                    boolean var28 = (var26 >> var27 + 1 & 0x1) != 0;
                    if (var28) {
                        if (arg3 == 1) {
                            field296.method2374(102);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 2) {
                            field296.method2374(216);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 3) {
                            field296.method2374(243);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 4) {
                            field296.method2374(251);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 5) {
                            field296.method2374(28);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 6) {
                            field296.method2374(142);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 7) {
                            field296.method2374(175);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 8) {
                            field296.method2374(123);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 9) {
                            field296.method2374(24);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                        if (arg3 == 10) {
                            field296.method2374(56);
                            field296.method2130(arg1);
                            field296.method2128(arg0);
                        }
                    }
                }
            }
        }
        if (arg2 == 1004) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field296.method2374(9);
            field296.method2128(arg3);
        }
        if (arg2 == 43) {
            field296.method2374(171);
            field296.method2172(arg0);
            field296.method2172(arg3);
            field296.method2178(arg1);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 51) {
            class3 var29 = field376[arg3];
            if (var29 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(115);
                field296.method2249(class124.field1968[82] ? 1 : 0);
                field296.method2170(arg3);
            }
        }
        if (arg2 == 34) {
            field296.method2374(38);
            field296.method2172(arg0);
            field296.method2130(arg1);
            field296.method2265(arg3);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 8) {
            class30 var30 = field292[arg3];
            if (var30 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(164);
                field296.method2164(class124.field1968[82] ? 1 : 0);
                field296.method2265(field414);
                field296.method2177(Statics.field29);
                field296.method2170(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var31 = field376[arg3];
            if (var31 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(1);
                field296.method2249(class124.field1968[82] ? 1 : 0);
                field296.method2172(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field1866.method1646(Statics.field930, arg0, arg1);
        }
        if (arg2 == 26) {
            method128();
        }
        if (arg2 == 4) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(220);
            field296.method2172(Statics.field88 + arg1);
            field296.method2170(Statics.field439 + arg0);
            field296.method2164(class124.field1968[82] ? 1 : 0);
            field296.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class30 var32 = field292[arg3];
            if (var32 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(43);
                field296.method2172(arg3);
                field296.method2164(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field296.method2374(240);
            field296.method2128(arg3);
            field296.method2130(arg1);
            field296.method2265(arg0);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 1) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(246);
            field296.method2170(Statics.field1666);
            field296.method2265(Statics.field1245);
            field296.method2170(Statics.field88 + arg1);
            field296.method2265(Statics.field439 + arg0);
            field296.method2179(Statics.field65);
            field296.method2249(class124.field1968[82] ? 1 : 0);
            field296.method2170(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 7) {
            class30 var33 = field292[arg3];
            if (var33 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(54);
                field296.method2170(arg3);
                field296.method2172(Statics.field1666);
                field296.method2128(Statics.field1245);
                field296.method2179(Statics.field65);
                field296.method2249(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field296.method2374(39);
            field296.method2179(Statics.field65);
            field296.method2170(Statics.field1245);
            field296.method2172(arg0);
            field296.method2265(arg3);
            field296.method2128(Statics.field1666);
            field296.method2178(arg1);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 1001) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(76);
            field296.method2164(class124.field1968[82] ? 1 : 0);
            field296.method2265(Statics.field439 + arg0);
            field296.method2128(Statics.field88 + arg1);
            field296.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 40) {
            field296.method2374(233);
            field296.method2128(arg3);
            field296.method2177(arg1);
            field296.method2170(arg0);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 13) {
            class30 var34 = field292[arg3];
            if (var34 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(163);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2170(arg3);
            }
        }
        if (arg2 == 22) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(81);
            field296.method2265(Statics.field439 + arg0);
            field296.method2170(Statics.field88 + arg1);
            field296.method2170(arg3);
            field296.method2163(class124.field1968[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class3 var35 = field376[arg3];
            if (var35 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(91);
                field296.method2162(class124.field1968[82] ? 1 : 0);
                field296.method2128(arg3);
            }
        }
        if (arg2 == 3) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(172);
            field296.method2249(class124.field1968[82] ? 1 : 0);
            field296.method2170(Statics.field88 + arg1);
            field296.method2172(Statics.field439 + arg0);
            field296.method2265(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var36 = field376[arg3];
            if (var36 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(242);
                field296.method2172(arg3);
                field296.method2164(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(41);
            field296.method2172(Statics.field439 + arg0);
            field296.method2172(arg3 >> 14 & 0x7FFF);
            field296.method2130(Statics.field29);
            field296.method2128(Statics.field88 + arg1);
            field296.method2249(class124.field1968[82] ? 1 : 0);
            field296.method2265(field414);
        }
        if (arg2 == 12) {
            class30 var37 = field292[arg3];
            if (var37 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(225);
                field296.method2128(arg3);
                field296.method2163(class124.field1968[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class151 var38 = Statics.method815(arg1);
            boolean var39 = true;
            if (var38.field2521 > 0) {
                var39 = method112(var38);
            }
            if (var39) {
                field296.method2374(101);
                field296.method2130(arg1);
            }
        }
        if (arg2 == 46) {
            class3 var40 = field376[arg3];
            if (var40 != null) {
                field352 = arg6;
                field461 = arg7;
                field366 = 2;
                field365 = 0;
                field485 = arg0;
                field486 = arg1;
                field296.method2374(249);
                field296.method2249(class124.field1968[82] ? 1 : 0);
                field296.method2172(arg3);
            }
        }
        if (arg2 == 58) {
            field296.method2374(167);
            field296.method2177(Statics.field29);
            field296.method2172(field414);
            field296.method2128(arg0);
            field296.method2130(arg1);
        }
        if (arg2 == 37) {
            field296.method2374(131);
            field296.method2265(arg0);
            field296.method2178(arg1);
            field296.method2265(arg3);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 33) {
            field296.method2374(92);
            field296.method2172(arg3);
            field296.method2128(arg0);
            field296.method2130(arg1);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 == 19) {
            field352 = arg6;
            field461 = arg7;
            field366 = 2;
            field365 = 0;
            field485 = arg0;
            field486 = arg1;
            field296.method2374(63);
            field296.method2265(Statics.field439 + arg0);
            field296.method2265(arg3);
            field296.method2163(class124.field1968[82] ? 1 : 0);
            field296.method2172(Statics.field88 + arg1);
        }
        if (arg2 == 36) {
            field296.method2374(120);
            field296.method2179(arg1);
            field296.method2172(arg3);
            field296.method2172(arg0);
            field367 = 0;
            Statics.field1913 = Statics.method815(arg1);
            field482 = arg0;
        }
        if (arg2 != 25) {
            if (arg2 == 32) {
                field296.method2374(205);
                field296.method2179(arg1);
                field296.method2170(field414);
                field296.method2170(arg0);
                field296.method2170(arg3);
                field296.method2179(Statics.field29);
                field367 = 0;
                Statics.field1913 = Statics.method815(arg1);
                field482 = arg0;
            }
            if (field411 != 0) {
                field411 = 0;
                Statics.method2431(Statics.method815(Statics.field65));
            }
            if (field413) {
                method11();
            }
            if (Statics.field1913 != null && field367 == 0) {
                Statics.method2431(Statics.field1913);
            }
            return;
        }
        class151 var41 = class151.method1422(arg1, arg0);
        if (var41 == null) {
            return;
        }
        method11();
        int var42 = class155.method2575(method2423(var41));
        class151 var43 = class151.method1422(arg1, arg0);
        if (var43 != null && var43.field2595 != null) {
            class1 var44 = new class1();
            var44.field3 = var43;
            var44.field13 = var43.field2595;
            class32.method146(var44);
        }
        field413 = true;
        Statics.field29 = arg1;
        field414 = arg0;
        Statics.field202 = var42;
        Statics.method2431(var43);
        field411 = 0;
        String var45;
        if (class155.method2575(method2423(var41)) == 0) {
            var45 = null;
        } else if (var41.field2598 == null || var41.field2598.trim().length() == 0) {
            var45 = null;
        } else {
            var45 = var41.field2598;
        }
        field415 = var45;
        if (field415 == null) {
            field415 = "Null";
        }
        if (var41.field2516) {
            field416 = var41.field2577 + class2.method85(16777215);
        } else {
            field416 = class2.method85(65280) + var41.field2617 + class2.method85(16777215);
        }
    }

    @ObfuscatedName("y.bw(ILjava/lang/String;S)V")
    public static void method522(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field453; var3++) {
            class3 var4 = field376[field378[var3]];
            if (var4 != null && var4.field50 != null && var4.field50.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field296.method2374(103);
                    field296.method2164(0);
                    field296.method2128(field378[var3]);
                } else if (arg0 == 4) {
                    field296.method2374(169);
                    field296.method2170(field378[var3]);
                    field296.method2164(0);
                } else if (arg0 == 6) {
                    field296.method2374(91);
                    field296.method2162(0);
                    field296.method2128(field378[var3]);
                } else if (arg0 == 7) {
                    field296.method2374(66);
                    field296.method2162(0);
                    field296.method2172(field378[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method1607(4, "", class142.field2282 + arg1);
        }
    }

    @ObfuscatedName("p.by(I)V")
    public static void method11() {
        if (!field413) {
            return;
        }
        class151 var0 = class151.method1422(Statics.field29, field414);
        if (var0 != null && var0.field2596 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field13 = var0.field2596;
            class32.method146(var1);
        }
        field413 = false;
        Statics.method2431(var0);
    }

    @ObfuscatedName("cy.bj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1888(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field515 || field400 >= 500) {
            return;
        }
        field276[field400] = arg0;
        field503[field400] = arg1;
        field377[field400] = arg2;
        field404[field400] = arg3;
        field401[field400] = arg4;
        field402[field400] = arg5;
        field400++;
    }

    @ObfuscatedName("u.bq(I)V")
    public static void method30() {
        for (int var0 = 0; var0 < field400; var0++) {
            if (method1791(field377[var0])) {
                if (var0 < field400 - 1) {
                    for (int var1 = var0; var1 < field400 - 1; var1++) {
                        field276[var1] = field276[var1 + 1];
                        field503[var1] = field503[var1 + 1];
                        field377[var1] = field377[var1 + 1];
                        field404[var1] = field404[var1 + 1];
                        field401[var1] = field401[var1 + 1];
                        field402[var1] = field402[var1 + 1];
                    }
                }
                field400--;
            }
        }
    }

    @ObfuscatedName("cx.bu(II)Z")
    public static boolean method1791(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("e.bk(IIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3) {
        if (field411 == 0 && !field413) {
            method1888(class142.field2288, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1742; var5++) {
            int var6 = class98.field1743[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1866.method1639(Statics.field930, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method1794(var10);
                    if (var11.field866 != null) {
                        var11 = var11.method649();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field411 == 1) {
                        method1888(class142.field2283, field269 + " " + class2.field21 + " " + class2.method85(65535) + var11.field831, 1, var6, var7, var8);
                    } else if (!field413) {
                        String[] var12 = var11.field837;
                        if (field428) {
                            var12 = method2673(var12);
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
                                    method1888(var12[var13], class2.method85(65535) + var11.field831, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1888(class142.field2284, class2.method85(65535) + var11.field831, 1002, var11.field832 << 14, var7, var8);
                    } else if ((Statics.field202 & 0x4) == 4) {
                        method1888(field415, field416 + " " + class2.field21 + " " + class2.method85(65535) + var11.field831, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field292[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field683.field791 == 1 && (var15.field729 & 0x7F) == 64 && (var15.field740 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field463; var16++) {
                            class30 var17 = field292[field290[var16]];
                            if (var17 != null && var15 != var17 && var17.field683.field791 == 1 && var15.field729 == var17.field729 && var15.field740 == var17.field740) {
                                method138(var17.field683, field290[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field453; var18++) {
                            class3 var19 = field376[field378[var18]];
                            if (var19 != null && var15.field729 == var19.field729 && var15.field740 == var19.field740) {
                                method157(var19, field378[var18], var7, var8);
                            }
                        }
                    }
                    method138(var15.field683, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field376[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field729 & 0x7F) == 64 && (var20.field740 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field463; var21++) {
                            class30 var22 = field292[field290[var21]];
                            if (var22 != null && var22.field683.field791 == 1 && var20.field729 == var22.field729 && var20.field740 == var22.field740) {
                                method138(var22.field683, field290[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field453; var23++) {
                            class3 var24 = field376[field378[var23]];
                            if (var24 != null && var20 != var24 && var20.field729 == var24.field729 && var20.field740 == var24.field740) {
                                method157(var24, field378[var23], var7, var8);
                            }
                        }
                    }
                    method157(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class176 var25 = field391[Statics.field930][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3226(); var26 != null; var26 = (class25) var25.method3228()) {
                            class45 var27 = class45.method573(var26.field604);
                            if (field411 == 1) {
                                method1888(class142.field2283, field269 + " " + class2.field21 + " " + class2.method85(16748608) + var27.field999, 16, var26.field604, var7, var8);
                            } else if (!field413) {
                                String[] var28 = var27.field1021;
                                if (field428) {
                                    var28 = method2673(var28);
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
                                        method1888(var28[var29], class2.method85(16748608) + var27.field999, var30, var26.field604, var7, var8);
                                    } else if (var29 == 2) {
                                        method1888(class142.field2261, class2.method85(16748608) + var27.field999, 20, var26.field604, var7, var8);
                                    }
                                }
                                method1888(class142.field2284, class2.method85(16748608) + var27.field999, 1004, var26.field604, var7, var8);
                            } else if ((Statics.field202 & 0x1) == 1) {
                                method1888(field415, field416 + " " + class2.field21 + " " + class2.method85(16748608) + var27.field999, 17, var26.field604, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.bd(Lar;IIII)V")
    public static final void method138(class35 arg0, int arg1, int arg2, int arg3) {
        if (field400 >= 400) {
            return;
        }
        if (arg0.field798 != null) {
            arg0 = arg0.method623();
        }
        if (arg0 == null || !arg0.field818 || arg0.field820 && field425 != arg1) {
            return;
        }
        String var4 = arg0.field790;
        if (arg0.field807 != 0) {
            int var6 = arg0.field807;
            int var7 = Statics.field521.field55;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method85(16711680);
            } else if (var8 < -6) {
                var9 = class2.method85(16723968);
            } else if (var8 < -3) {
                var9 = class2.method85(16740352);
            } else if (var8 < 0) {
                var9 = class2.method85(16756736);
            } else if (var8 > 9) {
                var9 = class2.method85(65280);
            } else if (var8 > 6) {
                var9 = class2.method85(4259584);
            } else if (var8 > 3) {
                var9 = class2.method85(8453888);
            } else if (var8 > 0) {
                var9 = class2.method85(12648192);
            } else {
                var9 = class2.method85(16776960);
            }
            var4 = var4 + var9 + " " + class2.field19 + class142.field2267 + arg0.field807 + class2.field23;
        }
        if (field411 == 1) {
            method1888(class142.field2283, field269 + " " + class2.field21 + " " + class2.method85(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field413) {
            String[] var10 = arg0.field799;
            if (field428) {
                var10 = method2673(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2285)) {
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
                        method1888(var10[var11], class2.method85(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2285)) {
                        short var14 = 0;
                        if (field282 == class18.field518 || field282 == class18.field524 && arg0.field807 > Statics.field521.field55) {
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
                        method1888(var10[var13], class2.method85(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1888(class142.field2284, class2.method85(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field202 & 0x2) == 2) {
            method1888(field415, field416 + " " + class2.field21 + " " + class2.method85(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("n.bx(La;IIII)V")
    public static final void method157(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field521 == arg0 || field400 >= 400) {
            return;
        }
        String var9;
        if (arg0.field44 == 0) {
            String var4 = arg0.field50;
            int var5 = arg0.field55;
            int var6 = Statics.field521.field55;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method85(16711680);
            } else if (var7 < -6) {
                var8 = class2.method85(16723968);
            } else if (var7 < -3) {
                var8 = class2.method85(16740352);
            } else if (var7 < 0) {
                var8 = class2.method85(16756736);
            } else if (var7 > 9) {
                var8 = class2.method85(65280);
            } else if (var7 > 6) {
                var8 = class2.method85(4259584);
            } else if (var7 > 3) {
                var8 = class2.method85(8453888);
            } else if (var7 > 0) {
                var8 = class2.method85(12648192);
            } else {
                var8 = class2.method85(16776960);
            }
            var9 = var4 + var8 + " " + class2.field19 + class142.field2267 + arg0.field55 + class2.field23;
        } else {
            var9 = arg0.field50 + " " + class2.field19 + class142.field2348 + arg0.field44 + class2.field23;
        }
        if (field411 == 1) {
            method1888(class142.field2283, field269 + " " + class2.field21 + " " + class2.method85(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field413) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field403[var10] != null) {
                    short var11 = 0;
                    if (field403[var10].equalsIgnoreCase(class142.field2285)) {
                        if (field282 == class18.field518 || field282 == class18.field524 && arg0.field55 > Statics.field521.field55) {
                            var11 = 2000;
                        }
                        if (Statics.field521.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field521.field46 == arg0.field46) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field388[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field500[var10] + var11;
                    method1888(field403[var10], class2.method85(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field202 & 0x8) == 8) {
            method1888(field415, field416 + " " + class2.field21 + " " + class2.method85(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field400; var14++) {
            if (field377[var14] == 23) {
                field503[var14] = class2.method85(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bp.bs(IIIIIIIII)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class151.method1883(arg0)) {
            Statics.field242 = null;
            method475(Statics.field2559[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field242 != null) {
                method475(Statics.field242, -1412584499, arg1, arg2, arg3, arg4, Statics.field190, Statics.field30, arg7);
                Statics.field242 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field418[var8] = true;
            }
        } else {
            field418[arg7] = true;
        }
    }

    @ObfuscatedName("z.bz([Lex;IIIIIIIII)V")
    public static final void method475(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1530(arg2, arg3, arg4, arg5);
        class84.method1796();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class151 var10 = arg0[var9];
            if (var10 != null && (var10.field2581 == arg1 || arg1 == -1412584499 && field346 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field508[field459] = var10.field2522 + arg6;
                    field465[field459] = var10.field2601 + arg7;
                    field295[field459] = var10.field2526;
                    field467[field459] = var10.field2527;
                    var11 = ++field459 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2528 = var11;
                var10.field2633 = field265;
                if (!var10.field2516 || !method3033(var10)) {
                    if (var10.field2521 > 0) {
                        Statics.method1885(var10);
                    }
                    int var12 = var10.field2522 + arg6;
                    int var13 = var10.field2601 + arg7;
                    int var14 = var10.field2539;
                    if (field346 == var10) {
                        if (arg1 != -1412584499 && !var10.field2635) {
                            Statics.field242 = arg0;
                            Statics.field190 = arg6;
                            Statics.field30 = arg7;
                            continue;
                        }
                        if (field270 && field434) {
                            int var15 = class127.field2004;
                            int var16 = class127.field2001;
                            int var17 = var15 - field431;
                            int var18 = var16 - field432;
                            if (var17 < field435) {
                                var17 = field435;
                            }
                            if (var10.field2526 + var17 > field435 + field430.field2526) {
                                var17 = field435 + field430.field2526 - var10.field2526;
                            }
                            if (var18 < field436) {
                                var18 = field436;
                            }
                            if (var10.field2527 + var18 > field436 + field430.field2527) {
                                var18 = field436 + field430.field2527 - var10.field2527;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2635) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2548 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2548 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2526 + var12;
                        int var26 = var10.field2527 + var13;
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
                        int var29 = var10.field2526 + var12;
                        int var30 = var10.field2527 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2516 || var19 < var21 && var20 < var22) {
                        if (var10.field2521 != 0) {
                            if (var10.field2521 == 1337) {
                                field407 = var12;
                                field329 = var13;
                                int var31 = var10.field2526;
                                int var32 = var10.field2527;
                                class73.method1530(var12, var13, var12 + var31, var13 + var32);
                                class84.method1796();
                                field360++;
                                method808(class29.field680);
                                boolean var33 = false;
                                if (field390 >= 0) {
                                    for (int var34 = 0; var34 < field453; var34++) {
                                        if (field390 == field378[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method808(class29.field675);
                                }
                                method1971(true);
                                method808(var33 ? class29.field677 : class29.field676);
                                method1971(false);
                                for (class7 var35 = (class7) field393.method3225(); var35 != null; var35 = (class7) field393.method3227()) {
                                    if (Statics.field930 != var35.field105 || field265 > var35.field125) {
                                        var35.method3307();
                                    } else if (field265 >= var35.field118) {
                                        if (var35.field115 > 0) {
                                            class30 var36 = field292[var35.field115 - 1];
                                            if (var36 != null && var36.field729 >= 0 && var36.field729 < 13312 && var36.field740 >= 0 && var36.field740 < 13312) {
                                                var35.method72(var36.field729, var36.field740, method576(var36.field729, var36.field740, var35.field105) - var35.field110, field265);
                                            }
                                        }
                                        if (var35.field115 < 0) {
                                            int var37 = -var35.field115 - 1;
                                            class3 var38;
                                            if (field382 == var37) {
                                                var38 = Statics.field521;
                                            } else {
                                                var38 = field376[var37];
                                            }
                                            if (var38 != null && var38.field729 >= 0 && var38.field729 < 13312 && var38.field740 >= 0 && var38.field740 < 13312) {
                                                var35.method72(var38.field729, var38.field740, method576(var38.field729, var38.field740, var35.field105) - var35.field110, field265);
                                            }
                                        }
                                        var35.method74(field332);
                                        Statics.field1866.method1620(Statics.field930, (int) var35.field117, (int) var35.field111, (int) var35.field119, 60, var35, var35.field131, -1, false);
                                    }
                                }
                                method2391();
                                if (!field499) {
                                    int var39 = field340;
                                    if (field348 / 256 > var39) {
                                        var39 = field348 / 256;
                                    }
                                    if (field379[4] && field502[4] + 128 > var39) {
                                        var39 = field502[4] + 128;
                                    }
                                    int var40 = field341 + field324 & 0x7FF;
                                    method694(Statics.field2123, method576(Statics.field521.field729, Statics.field521.field740, Statics.field930) - 50, Statics.field911, var39, var40, var39 * 3 + 600);
                                }
                                int var53;
                                if (field499) {
                                    int var54;
                                    if (Statics.field908.field140) {
                                        var54 = Statics.field930;
                                    } else {
                                        int var55 = method576(Statics.field1502, Statics.field678, Statics.field930);
                                        if (var55 - Statics.field1651 >= 800 || (class6.field82[Statics.field930][Statics.field1502 >> 7][Statics.field678 >> 7] & 0x4) == 0) {
                                            var54 = 3;
                                        } else {
                                            var54 = Statics.field930;
                                        }
                                    }
                                    var53 = var54;
                                } else {
                                    int var41;
                                    if (Statics.field908.field140) {
                                        var41 = Statics.field930;
                                    } else {
                                        int var42 = 3;
                                        if (Statics.field177 < 310) {
                                            int var43 = Statics.field1502 >> 7;
                                            int var44 = Statics.field678 >> 7;
                                            int var45 = Statics.field521.field729 >> 7;
                                            int var46 = Statics.field521.field740 >> 7;
                                            if ((class6.field82[Statics.field930][var43][var44] & 0x4) != 0) {
                                                var42 = Statics.field930;
                                            }
                                            int var47;
                                            if (var45 > var43) {
                                                var47 = var45 - var43;
                                            } else {
                                                var47 = var43 - var45;
                                            }
                                            int var48;
                                            if (var46 > var44) {
                                                var48 = var46 - var44;
                                            } else {
                                                var48 = var44 - var46;
                                            }
                                            if (var47 > var48) {
                                                int var49 = var48 * 65536 / var47;
                                                int var50 = 32768;
                                                while (var43 != var45) {
                                                    if (var43 < var45) {
                                                        var43++;
                                                    } else if (var43 > var45) {
                                                        var43--;
                                                    }
                                                    if ((class6.field82[Statics.field930][var43][var44] & 0x4) != 0) {
                                                        var42 = Statics.field930;
                                                    }
                                                    var50 += var49;
                                                    if (var50 >= 65536) {
                                                        var50 -= 65536;
                                                        if (var44 < var46) {
                                                            var44++;
                                                        } else if (var44 > var46) {
                                                            var44--;
                                                        }
                                                        if ((class6.field82[Statics.field930][var43][var44] & 0x4) != 0) {
                                                            var42 = Statics.field930;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var51 = var47 * 65536 / var48;
                                                int var52 = 32768;
                                                while (var44 != var46) {
                                                    if (var44 < var46) {
                                                        var44++;
                                                    } else if (var44 > var46) {
                                                        var44--;
                                                    }
                                                    if ((class6.field82[Statics.field930][var43][var44] & 0x4) != 0) {
                                                        var42 = Statics.field930;
                                                    }
                                                    var52 += var51;
                                                    if (var52 >= 65536) {
                                                        var52 -= 65536;
                                                        if (var43 < var45) {
                                                            var43++;
                                                        } else if (var43 > var45) {
                                                            var43--;
                                                        }
                                                        if ((class6.field82[Statics.field930][var43][var44] & 0x4) != 0) {
                                                            var42 = Statics.field930;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field82[Statics.field930][Statics.field521.field729 >> 7][Statics.field521.field740 >> 7] & 0x4) != 0) {
                                            var42 = Statics.field930;
                                        }
                                        var41 = var42;
                                    }
                                    var53 = var41;
                                }
                                int var56 = Statics.field1502;
                                int var57 = Statics.field1651;
                                int var58 = Statics.field678;
                                int var59 = Statics.field177;
                                int var60 = Statics.field1420;
                                for (int var61 = 0; var61 < 5; var61++) {
                                    if (field379[var61]) {
                                        int var62 = (int) (Math.random() * (double) (field337[var61] * 2 + 1) - (double) field337[var61] + Math.sin((double) field384[var61] / 100.0D * (double) field504[var61]) * (double) field502[var61]);
                                        if (var61 == 0) {
                                            Statics.field1502 += var62;
                                        }
                                        if (var61 == 1) {
                                            Statics.field1651 += var62;
                                        }
                                        if (var61 == 2) {
                                            Statics.field678 += var62;
                                        }
                                        if (var61 == 3) {
                                            Statics.field1420 = Statics.field1420 + var62 & 0x7FF;
                                        }
                                        if (var61 == 4) {
                                            Statics.field177 += var62;
                                            if (Statics.field177 < 128) {
                                                Statics.field177 = 128;
                                            }
                                            if (Statics.field177 > 383) {
                                                Statics.field177 = 383;
                                            }
                                        }
                                    }
                                }
                                int var63 = class127.field2004;
                                int var64 = class127.field2001;
                                if (class127.field2000 != 0) {
                                    var63 = class127.field2013;
                                    var64 = class127.field2014;
                                }
                                if (var63 >= var12 && var63 < var12 + var31 && var64 >= var13 && var64 < var13 + var32) {
                                    class98.field1739 = true;
                                    class98.field1742 = 0;
                                    class98.field1696 = var63 - var12;
                                    class98.field1722 = var64 - var13;
                                } else {
                                    class98.field1739 = false;
                                    class98.field1742 = 0;
                                }
                                method2475();
                                class73.method1532(var12, var13, var31, var32, 0);
                                method2475();
                                Statics.field1866.method1647(Statics.field1502, Statics.field1651, Statics.field678, Statics.field177, Statics.field1420, var53);
                                method2475();
                                Statics.field1866.method1685();
                                field349 = 0;
                                boolean var65 = false;
                                int var66 = -1;
                                for (int var67 = -1; var67 < field463 + field453; var67++) {
                                    class33 var68;
                                    if (var67 == -1) {
                                        var68 = Statics.field521;
                                    } else if (var67 < field453) {
                                        var68 = field376[field378[var67]];
                                        if (field390 == field378[var67]) {
                                            var65 = true;
                                            var66 = var67;
                                            continue;
                                        }
                                    } else {
                                        var68 = field292[field290[var67 - field453]];
                                    }
                                    method2930(var68, var67, var12, var13, var31, var32);
                                }
                                if (var65) {
                                    method2930(field376[field390], var66, var12, var13, var31, var32);
                                }
                                for (int var69 = 0; var69 < field349; var69++) {
                                    int var70 = field351[var69];
                                    int var71 = field303[var69];
                                    int var72 = field354[var69];
                                    int var73 = field392[var69];
                                    boolean var74 = true;
                                    while (var74) {
                                        var74 = false;
                                        for (int var75 = 0; var75 < var69; var75++) {
                                            if (var71 + 2 > field303[var75] - field392[var75] && var71 - var73 < field303[var75] + 2 && var70 - var72 < field354[var75] + field351[var75] && var70 + var72 > field351[var75] - field354[var75] && field303[var75] - field392[var75] < var71) {
                                                var71 = field303[var75] - field392[var75];
                                                var74 = true;
                                            }
                                        }
                                    }
                                    field477 = field351[var69];
                                    field362 = field303[var69] = var71;
                                    String var76 = field358[var69];
                                    if (field419 == 0) {
                                        int var77 = 16776960;
                                        if (field355[var69] < 6) {
                                            var77 = field469[field355[var69]];
                                        }
                                        if (field355[var69] == 6) {
                                            var77 = field360 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field355[var69] == 7) {
                                            var77 = field360 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field355[var69] == 8) {
                                            var77 = field360 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field355[var69] == 9) {
                                            int var78 = 150 - field406[var69];
                                            if (var78 < 50) {
                                                var77 = var78 * 1280 + 16711680;
                                            } else if (var78 < 100) {
                                                var77 = 16776960 - (var78 - 50) * 327680;
                                            } else if (var78 < 150) {
                                                var77 = (var78 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field355[var69] == 10) {
                                            int var79 = 150 - field406[var69];
                                            if (var79 < 50) {
                                                var77 = var79 * 5 + 16711680;
                                            } else if (var79 < 100) {
                                                var77 = 16711935 - (var79 - 50) * 327680;
                                            } else if (var79 < 150) {
                                                var77 = (var79 - 100) * 327680 + 255 - (var79 - 100) * 5;
                                            }
                                        }
                                        if (field355[var69] == 11) {
                                            int var80 = 150 - field406[var69];
                                            if (var80 < 50) {
                                                var77 = 16777215 - var80 * 327685;
                                            } else if (var80 < 100) {
                                                var77 = (var80 - 50) * 327685 + 65280;
                                            } else if (var80 < 150) {
                                                var77 = 16777215 - (var80 - 100) * 327680;
                                            }
                                        }
                                        if (field356[var69] == 0) {
                                            Statics.field1896.method3334(var76, field477 + var12, field362 + var13, var77, 0);
                                        }
                                        if (field356[var69] == 1) {
                                            Statics.field1896.method3332(var76, field477 + var12, field362 + var13, var77, 0, field360);
                                        }
                                        if (field356[var69] == 2) {
                                            Statics.field1896.method3337(var76, field477 + var12, field362 + var13, var77, 0, field360);
                                        }
                                        if (field356[var69] == 3) {
                                            Statics.field1896.method3338(var76, field477 + var12, field362 + var13, var77, 0, field360, 150 - field406[var69]);
                                        }
                                        if (field356[var69] == 4) {
                                            int var81 = (150 - field406[var69]) * (Statics.field1896.method3327(var76) + 100) / 150;
                                            class73.method1523(field477 + var12 - 50, var13, field477 + var12 + 50, var13 + var32);
                                            Statics.field1896.method3394(var76, field477 + var12 + 50 - var81, field362 + var13, var77, 0);
                                            class73.method1530(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field356[var69] == 5) {
                                            int var82 = 150 - field406[var69];
                                            int var83 = 0;
                                            if (var82 < 25) {
                                                var83 = var82 - 25;
                                            } else if (var82 > 125) {
                                                var83 = var82 - 125;
                                            }
                                            class73.method1523(var12, field362 + var13 - Statics.field1896.field2890 - 1, var12 + var31, field362 + var13 + 5);
                                            Statics.field1896.method3334(var76, field477 + var12, field362 + var13 + var83, var77, 0);
                                            class73.method1530(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field1896.method3334(var76, field477 + var12, field362 + var13, 16776960, 0);
                                    }
                                }
                                if (field273 == 2) {
                                    method2077((field310 - Statics.field439 << 7) + field279, (field472 - Statics.field88 << 7) + field280, field278 * 2);
                                    if (field477 > -1 && field265 % 20 < 10) {
                                        Statics.field251[0].method1436(field477 + var12 - 12, field362 + var13 - 28);
                                    }
                                }
                                ((class88) Statics.field1466).method1877(field332);
                                method703(var12, var13, var31, var32);
                                Statics.field1502 = var56;
                                Statics.field1651 = var57;
                                Statics.field678 = var58;
                                Statics.field177 = var59;
                                Statics.field1420 = var60;
                                if (field442 && class149.method2500(true, false) == 0) {
                                    field442 = false;
                                }
                                if (field442) {
                                    class73.method1532(var12, var13, var31, var32, 0);
                                    method145(class142.field2151, false);
                                }
                                class73.method1530(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2521 == 1338) {
                                method2475();
                                class73.method1530(var12, var13, Statics.field966.field1308 + var12, Statics.field966.field1315 + var13);
                                if (field291 == 2 || field291 == 5) {
                                    class73.method1538(var12 + 25, var13 + 5, 0, Statics.field129, Statics.field945);
                                } else {
                                    int var84 = field341 + field327 & 0x7FF;
                                    int var85 = Statics.field521.field729 / 32 + 48;
                                    int var86 = 464 - Statics.field521.field740 / 32;
                                    Statics.field237.method1455(var12 + 25, var13 + 5, 146, 151, var85, var86, var84, field473 + 256, Statics.field129, Statics.field945);
                                    for (int var87 = 0; var87 < field481; var87++) {
                                        int var88 = field468[var87] * 4 + 2 - Statics.field521.field729 / 32;
                                        int var89 = field364[var87] * 4 + 2 - Statics.field521.field740 / 32;
                                        method117(var12, var13, var88, var89, field484[var87]);
                                    }
                                    for (int var90 = 0; var90 < 104; var90++) {
                                        for (int var91 = 0; var91 < 104; var91++) {
                                            class176 var92 = field391[Statics.field930][var90][var91];
                                            if (var92 != null) {
                                                int var93 = var90 * 4 + 2 - Statics.field521.field729 / 32;
                                                int var94 = var91 * 4 + 2 - Statics.field521.field740 / 32;
                                                method117(var12, var13, var93, var94, Statics.field1114[0]);
                                            }
                                        }
                                    }
                                    for (int var95 = 0; var95 < field463; var95++) {
                                        class30 var96 = field292[field290[var95]];
                                        if (var96 != null && var96.method14()) {
                                            class35 var97 = var96.field683;
                                            if (var97 != null && var97.field798 != null) {
                                                var97 = var97.method623();
                                            }
                                            if (var97 != null && var97.field806 && var97.field818) {
                                                int var98 = var96.field729 / 32 - Statics.field521.field729 / 32;
                                                int var99 = var96.field740 / 32 - Statics.field521.field740 / 32;
                                                method117(var12, var13, var98, var99, Statics.field1114[1]);
                                            }
                                        }
                                    }
                                    for (int var100 = 0; var100 < field453; var100++) {
                                        class3 var101 = field376[field378[var100]];
                                        if (var101 != null && var101.method14()) {
                                            int var102 = var101.field729 / 32 - Statics.field521.field729 / 32;
                                            int var103 = var101.field740 / 32 - Statics.field521.field740 / 32;
                                            boolean var104 = false;
                                            if (method855(var101.field50, true)) {
                                                var104 = true;
                                            }
                                            boolean var105 = false;
                                            for (int var106 = 0; var106 < Statics.field193; var106++) {
                                                if (var101.field50.equals(Statics.field77[var106].field561)) {
                                                    var105 = true;
                                                    break;
                                                }
                                            }
                                            boolean var107 = false;
                                            if (Statics.field521.field46 != 0 && var101.field46 != 0 && Statics.field521.field46 == var101.field46) {
                                                var107 = true;
                                            }
                                            if (var104) {
                                                method117(var12, var13, var102, var103, Statics.field1114[3]);
                                            } else if (var107) {
                                                method117(var12, var13, var102, var103, Statics.field1114[4]);
                                            } else if (var105) {
                                                method117(var12, var13, var102, var103, Statics.field1114[5]);
                                            } else {
                                                method117(var12, var13, var102, var103, Statics.field1114[2]);
                                            }
                                        }
                                    }
                                    if (field273 != 0 && field265 % 20 < 10) {
                                        if (field273 == 1 && field274 >= 0 && field274 < field292.length) {
                                            class30 var108 = field292[field274];
                                            if (var108 != null) {
                                                int var109 = var108.field729 / 32 - Statics.field521.field729 / 32;
                                                int var110 = var108.field740 / 32 - Statics.field521.field740 / 32;
                                                method127(var12, var13, var109, var110, Statics.field1985[1]);
                                            }
                                        }
                                        if (field273 == 2) {
                                            int var111 = field310 * 4 - Statics.field439 * 4 + 2 - Statics.field521.field729 / 32;
                                            int var112 = field472 * 4 - Statics.field88 * 4 + 2 - Statics.field521.field740 / 32;
                                            method127(var12, var13, var111, var112, Statics.field1985[1]);
                                        }
                                        if (field273 == 10 && field275 >= 0 && field275 < field376.length) {
                                            class3 var113 = field376[field275];
                                            if (var113 != null) {
                                                int var114 = var113.field729 / 32 - Statics.field521.field729 / 32;
                                                int var115 = var113.field740 / 32 - Statics.field521.field740 / 32;
                                                method127(var12, var13, var114, var115, Statics.field1985[1]);
                                            }
                                        }
                                    }
                                    if (field485 != 0) {
                                        int var116 = field485 * 4 + 2 - Statics.field521.field729 / 32;
                                        int var117 = field486 * 4 + 2 - Statics.field521.field740 / 32;
                                        method117(var12, var13, var116, var117, Statics.field1985[0]);
                                    }
                                    class73.method1532(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field291 < 3) {
                                    Statics.field2697.method1455(var12, var13, 33, 33, 25, 25, field341, 256, Statics.field2694, Statics.field1342);
                                } else {
                                    class73.method1538(var12, var13, 0, Statics.field2694, Statics.field1342);
                                }
                                if (field284[var11]) {
                                    Statics.field966.method1579(var12, var13);
                                }
                                field462[var11] = true;
                                class73.method1530(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2548 == 0) {
                            if (!var10.field2516 && method3033(var10) && Statics.field631 != var10) {
                                continue;
                            }
                            if (!var10.field2516) {
                                if (var10.field2619 > var10.field2533 - var10.field2527) {
                                    var10.field2619 = var10.field2533 - var10.field2527;
                                }
                                if (var10.field2619 < 0) {
                                    var10.field2619 = 0;
                                }
                            }
                            method475(arg0, var10.field2517, var19, var20, var21, var22, var12 - var10.field2530, var13 - var10.field2619, var11);
                            if (var10.field2508 != null) {
                                method475(var10.field2508, var10.field2517, var19, var20, var21, var22, var12 - var10.field2530, var13 - var10.field2619, var11);
                            }
                            class4 var118 = (class4) field488.method3192((long) var10.field2517);
                            if (var118 != null) {
                                method1606(var118.field67, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1530(arg2, arg3, arg4, arg5);
                            class84.method1796();
                        }
                        if (field284[var11] || field399 > 1) {
                            if (var10.field2548 == 0 && !var10.field2516 && var10.field2533 > var10.field2527) {
                                method84(var10.field2526 + var12, var13, var10.field2619, var10.field2527, var10.field2533);
                            }
                            if (var10.field2548 != 1) {
                                if (var10.field2548 == 2) {
                                    int var119 = 0;
                                    for (int var120 = 0; var120 < var10.field2527; var120++) {
                                        for (int var121 = 0; var121 < var10.field2526; var121++) {
                                            int var122 = (var10.field2570 + 32) * var121 + var12;
                                            int var123 = (var10.field2571 + 32) * var120 + var13;
                                            if (var119 < 20) {
                                                var122 += var10.field2572[var119];
                                                var123 += var10.field2573[var119];
                                            }
                                            if (var10.field2612[var119] > 0) {
                                                boolean var124 = false;
                                                boolean var125 = false;
                                                int var126 = var10.field2612[var119] - 1;
                                                if (var122 + 32 > arg2 && var122 < arg4 && var123 + 32 > arg3 && var123 < arg5 || Statics.field1271 == var10 && field369 == var119) {
                                                    class72 var127;
                                                    if (field411 == 1 && Statics.field1666 == var119 && Statics.field65 == var10.field2517) {
                                                        var127 = class45.method2522(var126, var10.field2620[var119], 2, 0, false);
                                                    } else {
                                                        var127 = class45.method2522(var126, var10.field2620[var119], 1, 3153952, false);
                                                    }
                                                    if (var127 == null) {
                                                        Statics.method2431(var10);
                                                    } else if (Statics.field1271 == var10 && field369 == var119) {
                                                        int var128 = class127.field2004 - field357;
                                                        int var129 = class127.field2001 - field371;
                                                        if (var128 < 5 && var128 > -5) {
                                                            var128 = 0;
                                                        }
                                                        if (var129 < 5 && var129 > -5) {
                                                            var129 = 0;
                                                        }
                                                        if (field374 < 5) {
                                                            var128 = 0;
                                                            var129 = 0;
                                                        }
                                                        var127.method1468(var122 + var128, var123 + var129, 128);
                                                        if (arg1 != -1) {
                                                            class151 var130 = arg0[arg1 & 0xFFFF];
                                                            if (var123 + var129 < class73.field1304 && var130.field2619 > 0) {
                                                                int var131 = field332 * (class73.field1304 - var123 - var129) / 3;
                                                                if (var131 > field332 * 10) {
                                                                    var131 = field332 * 10;
                                                                }
                                                                if (var131 > var130.field2619) {
                                                                    var131 = var130.field2619;
                                                                }
                                                                var130.field2619 -= var131;
                                                                field371 += var131;
                                                                Statics.method2431(var130);
                                                            }
                                                            if (var123 + var129 + 32 > class73.field1302 && var130.field2619 < var130.field2533 - var130.field2527) {
                                                                int var132 = field332 * (var123 + var129 + 32 - class73.field1302) / 3;
                                                                if (var132 > field332 * 10) {
                                                                    var132 = field332 * 10;
                                                                }
                                                                if (var132 > var130.field2533 - var130.field2527 - var130.field2619) {
                                                                    var132 = var130.field2533 - var130.field2527 - var130.field2619;
                                                                }
                                                                var130.field2619 += var132;
                                                                field371 -= var132;
                                                                Statics.method2431(var130);
                                                            }
                                                        }
                                                    } else if (Statics.field1913 == var10 && field482 == var119) {
                                                        var127.method1468(var122, var123, 128);
                                                    } else {
                                                        var127.method1436(var122, var123);
                                                    }
                                                }
                                            } else if (var10.field2574 != null && var119 < 20) {
                                                class72 var133 = var10.method2877(var119);
                                                if (var133 != null) {
                                                    var133.method1436(var122, var123);
                                                } else if (class151.field2515) {
                                                    Statics.method2431(var10);
                                                }
                                            }
                                            var119++;
                                        }
                                    }
                                } else if (var10.field2548 == 3) {
                                    int var134;
                                    if (method142(var10)) {
                                        var134 = var10.field2535;
                                        if (Statics.field631 == var10 && var10.field2537 != 0) {
                                            var134 = var10.field2537;
                                        }
                                    } else {
                                        var134 = var10.field2592;
                                        if (Statics.field631 == var10 && var10.field2549 != 0) {
                                            var134 = var10.field2549;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2519) {
                                            class73.method1532(var12, var13, var10.field2526, var10.field2527, var134);
                                        } else {
                                            class73.method1572(var12, var13, var10.field2526, var10.field2527, var134);
                                        }
                                    } else if (var10.field2519) {
                                        class73.method1527(var12, var13, var10.field2526, var10.field2527, var134, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1531(var12, var13, var10.field2526, var10.field2527, var134, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2548 == 4) {
                                    class190 var135 = var10.method2853();
                                    if (var135 != null) {
                                        String var136 = var10.field2564;
                                        int var137;
                                        if (method142(var10)) {
                                            var137 = var10.field2535;
                                            if (Statics.field631 == var10 && var10.field2537 != 0) {
                                                var137 = var10.field2537;
                                            }
                                            if (var10.field2565.length() > 0) {
                                                var136 = var10.field2565;
                                            }
                                        } else {
                                            var137 = var10.field2592;
                                            if (Statics.field631 == var10 && var10.field2549 != 0) {
                                                var137 = var10.field2549;
                                            }
                                        }
                                        if (var10.field2516 && var10.field2600 != -1) {
                                            class45 var138 = class45.method573(var10.field2600);
                                            var136 = var138.field999;
                                            if (var136 == null) {
                                                var136 = "null";
                                            }
                                            if ((var138.field1018 == 1 || var10.field2622 != 1) && var10.field2622 != -1) {
                                                var136 = class2.method85(16748608) + var136 + class2.field26 + " " + 'x' + method2076(var10.field2622);
                                            }
                                        }
                                        if (field339 == var10) {
                                            class142 var10000 = (class142) null;
                                            var136 = class142.field2370;
                                            var137 = var10.field2592;
                                        }
                                        if (!var10.field2516) {
                                            var136 = method132(var136, var10);
                                        }
                                        var135.method3335(var136, var12, var13, var10.field2526, var10.field2527, var137, var10.field2560 ? 0 : -1, var10.field2567, var10.field2568, var10.field2626);
                                    } else if (class151.field2515) {
                                        Statics.method2431(var10);
                                    }
                                } else if (var10.field2548 == 5) {
                                    if (var10.field2516) {
                                        class72 var140;
                                        if (var10.field2600 == -1) {
                                            var140 = var10.method2871(false);
                                        } else {
                                            var140 = class45.method2522(var10.field2600, var10.field2622, var10.field2545, var10.field2510, false);
                                        }
                                        if (var140 != null) {
                                            int var141 = var140.field1290;
                                            int var142 = var140.field1295;
                                            if (var10.field2544) {
                                                class73.method1523(var12, var13, var10.field2526 + var12, var10.field2527 + var13);
                                                int var143 = (var10.field2526 + (var141 - 1)) / var141;
                                                int var144 = (var10.field2527 + (var142 - 1)) / var142;
                                                for (int var145 = 0; var145 < var143; var145++) {
                                                    for (int var146 = 0; var146 < var144; var146++) {
                                                        if (var10.field2543 != 0) {
                                                            var140.method1502(var141 / 2 + var141 * var145 + var12, var142 / 2 + var142 * var146 + var13, var10.field2543, 4096);
                                                        } else if (var14 == 0) {
                                                            var140.method1436(var141 * var145 + var12, var142 * var146 + var13);
                                                        } else {
                                                            var140.method1468(var141 * var145 + var12, var142 * var146 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1530(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var147 = var10.field2526 * 4096 / var141;
                                                if (var10.field2543 != 0) {
                                                    var140.method1502(var10.field2526 / 2 + var12, var10.field2527 / 2 + var13, var10.field2543, var147);
                                                } else if (var14 != 0) {
                                                    var140.method1505(var12, var13, var10.field2526, var10.field2527, 256 - (var14 & 0xFF));
                                                } else if (var10.field2526 == var141 && var10.field2527 == var142) {
                                                    var140.method1436(var12, var13);
                                                } else {
                                                    var140.method1447(var12, var13, var10.field2526, var10.field2527);
                                                }
                                            }
                                        } else if (class151.field2515) {
                                            Statics.method2431(var10);
                                        }
                                    } else {
                                        class72 var139 = var10.method2871(method142(var10));
                                        if (var139 != null) {
                                            var139.method1436(var12, var13);
                                        } else if (class151.field2515) {
                                            Statics.method2431(var10);
                                        }
                                    }
                                } else if (var10.field2548 == 6) {
                                    boolean var148 = method142(var10);
                                    int var149;
                                    if (var148) {
                                        var149 = var10.field2563;
                                    } else {
                                        var149 = var10.field2553;
                                    }
                                    class98 var150 = null;
                                    int var151 = 0;
                                    if (var10.field2600 != -1) {
                                        class45 var152 = class45.method573(var10.field2600);
                                        if (var152 != null) {
                                            class45 var153 = var152.method874(var10.field2622);
                                            var150 = var153.method873(1);
                                            if (var150 == null) {
                                                Statics.method2431(var10);
                                            } else {
                                                var150.method1988();
                                                var151 = var150.field1343 / 2;
                                            }
                                        }
                                    } else if (var10.field2554 == 5) {
                                        if (var10.field2550 == 0) {
                                            var150 = field511.method2937((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var150 = Statics.field521.method12();
                                        }
                                    } else if (var149 == -1) {
                                        var150 = var10.method2855((class38) null, -1, var148, Statics.field521.field40);
                                        if (var150 == null && class151.field2515) {
                                            Statics.method2431(var10);
                                        }
                                    } else {
                                        class38 var154 = class38.method81(var149);
                                        var150 = var10.method2855(var154, var10.field2623, var148, Statics.field521.field40);
                                        if (var150 == null && class151.field2515) {
                                            Statics.method2431(var10);
                                        }
                                    }
                                    class84.method1803(var10.field2526 / 2 + var12, var10.field2527 / 2 + var13);
                                    int var155 = var10.field2604 * class84.field1469[var10.field2557] >> 16;
                                    int var156 = var10.field2604 * class84.field1470[var10.field2557] >> 16;
                                    if (var150 != null) {
                                        if (var10.field2516) {
                                            var150.method1988();
                                            if (var10.field2562) {
                                                var150.method2001(0, var10.field2558, var10.field2607, var10.field2557, var10.field2555, var10.field2556 + var151 + var155, var10.field2556 + var156, var10.field2604);
                                            } else {
                                                var150.method1983(0, var10.field2558, var10.field2607, var10.field2557, var10.field2555, var10.field2556 + var151 + var155, var10.field2556 + var156);
                                            }
                                        } else {
                                            var150.method1983(0, var10.field2558, 0, var10.field2557, 0, var155, var156);
                                        }
                                    }
                                    class84.method1798();
                                } else {
                                    if (var10.field2548 == 7) {
                                        class190 var157 = var10.method2853();
                                        if (var157 == null) {
                                            if (class151.field2515) {
                                                Statics.method2431(var10);
                                            }
                                            continue;
                                        }
                                        int var158 = 0;
                                        for (int var159 = 0; var159 < var10.field2527; var159++) {
                                            for (int var160 = 0; var160 < var10.field2526; var160++) {
                                                if (var10.field2612[var158] > 0) {
                                                    class45 var161 = class45.method573(var10.field2612[var158] - 1);
                                                    String var162;
                                                    if (var161.field1018 != 1 && var10.field2620[var158] == 1) {
                                                        var162 = class2.method85(16748608) + var161.field999 + class2.field26;
                                                    } else {
                                                        var162 = class2.method85(16748608) + var161.field999 + class2.field26 + " " + 'x' + method2076(var10.field2620[var158]);
                                                    }
                                                    int var163 = (var10.field2570 + 115) * var160 + var12;
                                                    int var164 = (var10.field2571 + 12) * var159 + var13;
                                                    if (var10.field2567 == 0) {
                                                        var157.method3394(var162, var163, var164, var10.field2592, var10.field2560 ? 0 : -1);
                                                    } else if (var10.field2567 == 1) {
                                                        var157.method3334(var162, var10.field2526 / 2 + var163, var164, var10.field2592, var10.field2560 ? 0 : -1);
                                                    } else {
                                                        var157.method3333(var162, var10.field2526 + var163 - 1, var164, var10.field2592, var10.field2560 ? 0 : -1);
                                                    }
                                                }
                                                var158++;
                                            }
                                        }
                                    }
                                    if (var10.field2548 == 8 && Statics.field2116 == var10 && field410 == field409) {
                                        int var165 = 0;
                                        int var166 = 0;
                                        class190 var167 = Statics.field57;
                                        String var168 = var10.field2564;
                                        String var169 = method132(var168, var10);
                                        while (var169.length() > 0) {
                                            int var170 = var169.indexOf(class2.field25);
                                            String var171;
                                            if (var170 == -1) {
                                                var171 = var169;
                                                var169 = "";
                                            } else {
                                                var171 = var169.substring(0, var170);
                                                var169 = var169.substring(var170 + 4);
                                            }
                                            int var172 = var167.method3327(var171);
                                            if (var172 > var165) {
                                                var165 = var172;
                                            }
                                            var166 += var167.field2890 + 1;
                                        }
                                        var165 += 6;
                                        var166 += 7;
                                        int var173 = var10.field2526 + var12 - 5 - var165;
                                        int var174 = var10.field2527 + var13 + 5;
                                        if (var173 < var12 + 5) {
                                            var173 = var12 + 5;
                                        }
                                        if (var165 + var173 > arg4) {
                                            var173 = arg4 - var165;
                                        }
                                        if (var166 + var174 > arg5) {
                                            var174 = arg5 - var166;
                                        }
                                        class73.method1532(var173, var174, var165, var166, 16777120);
                                        class73.method1572(var173, var174, var165, var166, 0);
                                        String var175 = var10.field2564;
                                        int var176 = var167.field2890 + var174 + 2;
                                        String var177 = method132(var175, var10);
                                        while (var177.length() > 0) {
                                            int var178 = var177.indexOf(class2.field25);
                                            String var179;
                                            if (var178 == -1) {
                                                var179 = var177;
                                                var177 = "";
                                            } else {
                                                var179 = var177.substring(0, var178);
                                                var177 = var177.substring(var178 + 4);
                                            }
                                            var167.method3394(var179, var173 + 3, var176, 0, -1);
                                            var176 += var167.field2890 + 1;
                                        }
                                    }
                                    if (var10.field2548 == 9) {
                                        if (var10.field2540 == 1) {
                                            class73.method1536(var12, var13, var10.field2526 + var12, var10.field2527 + var13, var10.field2592);
                                        } else {
                                            int var180 = var10.field2526 >= 0 ? var10.field2526 : -var10.field2526;
                                            int var181 = var10.field2527 >= 0 ? var10.field2527 : -var10.field2527;
                                            int var182 = var180;
                                            if (var180 < var181) {
                                                var182 = var181;
                                            }
                                            if (var182 != 0) {
                                                int var183 = (var10.field2526 << 16) / var182;
                                                int var184 = (var10.field2527 << 16) / var182;
                                                if (var184 <= var183) {
                                                    var183 = -var183;
                                                } else {
                                                    var184 = -var184;
                                                }
                                                int var185 = var10.field2540 * var184 >> 17;
                                                int var186 = var10.field2540 * var184 + 1 >> 17;
                                                int var187 = var10.field2540 * var183 >> 17;
                                                int var188 = var10.field2540 * var183 + 1 >> 17;
                                                int var189 = var12 + var185;
                                                int var190 = var12 - var186;
                                                int var191 = var10.field2526 + var12 - var186;
                                                int var192 = var10.field2526 + var12 + var185;
                                                int var193 = var13 + var187;
                                                int var194 = var13 - var188;
                                                int var195 = var10.field2527 + var13 - var188;
                                                int var196 = var10.field2527 + var13 + var187;
                                                class84.method1846(var189, var190, var191);
                                                class84.method1795(var193, var194, var195, var189, var190, var191, var10.field2592);
                                                class84.method1846(var189, var191, var192);
                                                class84.method1795(var193, var195, var196, var189, var191, var192, var10.field2592);
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

    @ObfuscatedName("d.bp(Ljava/lang/String;Lex;B)Ljava/lang/String;")
    public static String method132(String arg0, class151 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method476(method226(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field971 != null) {
                    int var6 = Statics.field971.field2073;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field971.field2067 != null) {
                        var5 = (String) Statics.field971.field2067;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cc.cg(IB)Ljava/lang/String;")
    public static final String method2076(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method85(65408) + var1.substring(0, var1.length() - 8) + class142.field2294 + " " + class2.field19 + var1 + class2.field23 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method85(16777215) + var1.substring(0, var1.length() - 4) + class142.field2296 + " " + class2.field19 + var1 + class2.field23 + class2.field26;
        } else {
            return " " + class2.method85(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("au.ca(Lex;IIIIIII)V")
    public static final void method866(class151 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field338) {
            field331 = 32;
        } else {
            field331 = 0;
        }
        field338 = false;
        if (class127.field2005 == 1 || !Statics.field1475 && class127.field2005 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2619 -= 4;
                Statics.method2431(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2619 += 4;
                Statics.method2431(arg0);
            } else if (arg5 >= arg1 - field331 && arg5 < field331 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2619 = (arg4 - arg3) * var8 / var9;
                Statics.method2431(arg0);
                field338 = true;
            }
        }
        if (field454 == 0) {
            return;
        }
        int var10 = arg0.field2526;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2619 += field454 * 45;
            Statics.method2431(arg0);
        }
    }

    @ObfuscatedName("t.cq(IIIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1046[0].method1579(arg0, arg1);
        Statics.field1046[1].method1579(arg0, arg1 + arg3 - 16);
        class73.method1532(arg0, arg1 + 16, 16, arg3 - 32, field334);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1532(arg0, arg1 + 16 + var6, 16, var5, field335);
        class73.method1534(arg0, arg1 + 16 + var6, var5, field429);
        class73.method1534(arg0 + 1, arg1 + 16 + var6, var5, field429);
        class73.method1553(arg0, arg1 + 16 + var6, 16, field429);
        class73.method1553(arg0, arg1 + 17 + var6, 16, field429);
        class73.method1534(arg0 + 15, arg1 + 16 + var6, var5, field483);
        class73.method1534(arg0 + 14, arg1 + 17 + var6, var5 - 1, field483);
        class73.method1553(arg0, arg1 + 15 + var6 + var5, 16, field483);
        class73.method1553(arg0 + 1, arg1 + 14 + var6 + var5, 15, field483);
    }

    @ObfuscatedName("z.cx(IB)Ljava/lang/String;")
    public static final String method476(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("v.ch(Lex;I)Z")
    public static final boolean method142(class151 arg0) {
        if (arg0.field2614 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2614.length; var1++) {
            int var2 = method226(arg0, var1);
            int var3 = arg0.field2615[var1];
            if (arg0.field2614[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2614[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2614[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("client.cn(Lex;II)I")
    public static final int method226(class151 arg0, int arg1) {
        if (arg0.field2613 == null || arg1 >= arg0.field2613.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2613[arg1];
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
                    var7 = field313[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field396[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field397[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class151 var11 = Statics.method815(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method573(var12).field1020 || field259)) {
                        for (int var13 = 0; var13 < var11.field2612.length; var13++) {
                            if (var12 + 1 == var11.field2612[var13]) {
                                var7 += var11.field2620[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class153.field2645[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2128[field396[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class153.field2645[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field521.field55;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2131[var14]) {
                            var7 += field396[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class151 var17 = Statics.method815(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method573(var18).field1020 || field259)) {
                        for (int var19 = 0; var19 < var17.field2612.length; var19++) {
                            if (var18 + 1 == var17.field2612[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field361;
                }
                if (var6 == 12) {
                    var7 = field353;
                }
                if (var6 == 13) {
                    int var20 = class153.field2645[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class153.method3431(var22);
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
                    var7 = (Statics.field521.field729 >> 7) + Statics.field439;
                }
                if (var6 == 19) {
                    var7 = (Statics.field521.field740 >> 7) + Statics.field88;
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

    @ObfuscatedName("c.cf(Lex;III)V")
    public static final void method119(class151 arg0, int arg1, int arg2) {
        if (arg0.field2520 == 1) {
            method1888(arg0.field2618, "", 24, 0, 0, arg0.field2517);
        }
        if (arg0.field2520 == 2 && !field413) {
            String var3;
            if (class155.method2575(method2423(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2598 == null || arg0.field2598.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2598;
            }
            if (var3 != null) {
                method1888(var3, class2.method85(65280) + arg0.field2617, 25, 0, -1, arg0.field2517);
            }
        }
        if (arg0.field2520 == 3) {
            method1888(class142.field2292, "", 26, 0, 0, arg0.field2517);
        }
        if (arg0.field2520 == 4) {
            method1888(arg0.field2618, "", 28, 0, 0, arg0.field2517);
        }
        if (arg0.field2520 == 5) {
            method1888(arg0.field2618, "", 29, 0, 0, arg0.field2517);
        }
        if (arg0.field2520 == 6 && field339 == null) {
            method1888(arg0.field2618, "", 30, 0, -1, arg0.field2517);
        }
        if (arg0.field2548 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2527; var6++) {
                for (int var7 = 0; var7 < arg0.field2526; var7++) {
                    int var8 = (arg0.field2570 + 32) * var7;
                    int var9 = (arg0.field2571 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2572[var5];
                        var9 += arg0.field2573[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field372 = var5;
                        Statics.field519 = arg0;
                        if (arg0.field2612[var5] > 0) {
                            class45 var10 = class45.method573(arg0.field2612[var5] - 1);
                            if (field411 == 1 && class155.method3316(method2423(arg0))) {
                                if (Statics.field65 != arg0.field2517 || Statics.field1666 != var5) {
                                    method1888(class142.field2283, field269 + " " + class2.field21 + " " + class2.method85(16748608) + var10.field999, 31, var10.field1005, var5, arg0.field2517);
                                }
                            } else if (!field413 || !class155.method3316(method2423(arg0))) {
                                String[] var11 = var10.field1022;
                                if (field428) {
                                    var11 = method2673(var11);
                                }
                                if (class155.method3316(method2423(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method1888(var11[var12], class2.method85(16748608) + var10.field999, var13, var10.field1005, var5, arg0.field2517);
                                        } else if (var12 == 4) {
                                            method1888(class142.field2146, class2.method85(16748608) + var10.field999, 37, var10.field1005, var5, arg0.field2517);
                                        }
                                    }
                                }
                                if (class155.method2832(method2423(arg0))) {
                                    method1888(class142.field2283, class2.method85(16748608) + var10.field999, 38, var10.field1005, var5, arg0.field2517);
                                }
                                if (class155.method3316(method2423(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 33;
                                            }
                                            if (var14 == 1) {
                                                var15 = 34;
                                            }
                                            if (var14 == 2) {
                                                var15 = 35;
                                            }
                                            method1888(var11[var14], class2.method85(16748608) + var10.field999, var15, var10.field1005, var5, arg0.field2517);
                                        }
                                    }
                                }
                                String[] var16 = arg0.field2575;
                                if (field428) {
                                    var16 = method2673(var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method1888(var16[var17], class2.method85(16748608) + var10.field999, var18, var10.field1005, var5, arg0.field2517);
                                        }
                                    }
                                }
                                method1888(class142.field2284, class2.method85(16748608) + var10.field999, 1005, var10.field1005, var5, arg0.field2517);
                            } else if ((Statics.field202 & 0x10) == 16) {
                                method1888(field415, field416 + " " + class2.field21 + " " + class2.method85(16748608) + var10.field999, 32, var10.field1005, var5, arg0.field2517);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2516) {
            return;
        }
        if (field413) {
            int var19 = method2423(arg0);
            boolean var20 = (var19 >> 21 & 0x1) != 0;
            if (var20 && (Statics.field202 & 0x20) == 32) {
                method1888(field415, field416 + " " + class2.field21 + " " + arg0.field2577, 58, 0, arg0.field2518, arg0.field2517);
            }
            return;
        }
        for (int var21 = 9; var21 >= 5; var21--) {
            String var22 = method599(arg0, var21);
            if (var22 != null) {
                method1888(var22, arg0.field2577, 1007, var21 + 1, arg0.field2518, arg0.field2517);
            }
        }
        String var23;
        if (class155.method2575(method2423(arg0)) == 0) {
            var23 = null;
        } else if (arg0.field2598 == null || arg0.field2598.trim().length() == 0) {
            var23 = null;
        } else {
            var23 = arg0.field2598;
        }
        if (var23 != null) {
            method1888(var23, arg0.field2577, 25, 0, arg0.field2518, arg0.field2517);
        }
        for (int var25 = 4; var25 >= 0; var25--) {
            String var26 = method599(arg0, var25);
            if (var26 != null) {
                method1888(var26, arg0.field2577, 57, var25 + 1, arg0.field2518, arg0.field2517);
            }
        }
        int var27 = method2423(arg0);
        boolean var28 = (var27 & 0x1) != 0;
        if (var28) {
            method1888(class142.field2150, "", 30, 0, arg0.field2518, arg0.field2517);
        }
    }

    @ObfuscatedName("dk.cr(IIIIIIII)V")
    public static final void method2435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class151.method1883(arg0)) {
            method70(Statics.field2559[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("k.cz([Lex;IIIIIIII)V")
    public static final void method70(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class151 var9 = arg0[var8];
            if (var9 != null && (!var9.field2516 || var9.field2548 == 0 || var9.field2584 || method2423(var9) != 0 || field430 == var9) && var9.field2581 == arg1 && (!var9.field2516 || !method3033(var9))) {
                int var10 = var9.field2522 + arg6;
                int var11 = var9.field2601 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2548 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2548 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2526 + var10;
                    int var19 = var9.field2527 + var11;
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
                    int var22 = var9.field2526 + var10;
                    int var23 = var9.field2527 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field346 == var9) {
                    field437 = true;
                    field438 = var10;
                    field254 = var11;
                }
                if (!var9.field2516 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2004;
                    int var25 = class127.field2001;
                    if (class127.field2000 != 0) {
                        var24 = class127.field2013;
                        var25 = class127.field2014;
                    }
                    if (var9.field2521 == 1337) {
                        Statics.method2431(var9);
                        if (!field442 && !field515 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method5(var24, var25, var12, var13);
                        }
                    } else if (var9.field2521 == 1338) {
                        method779(var10, var11);
                    } else {
                        if (!field515 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method119(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2548 == 0) {
                            if (!var9.field2516 && method3033(var9) && Statics.field631 != var9) {
                                continue;
                            }
                            method70(arg0, var9.field2517, var12, var13, var14, var15, var10 - var9.field2530, var11 - var9.field2619);
                            if (var9.field2508 != null) {
                                method70(var9.field2508, var9.field2517, var12, var13, var14, var15, var10 - var9.field2530, var11 - var9.field2619);
                            }
                            class4 var26 = (class4) field488.method3192((long) var9.field2517);
                            if (var26 != null) {
                                if (var26.field62 == 0 && class127.field2004 >= var12 && class127.field2001 >= var13 && class127.field2004 < var14 && class127.field2001 < var15 && !field515 && !field427) {
                                    field276[0] = class142.field2366;
                                    field503[0] = "";
                                    field377[0] = 1006;
                                    field400 = 1;
                                }
                                method2435(var26.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2516) {
                            if (var9.field2634 && class127.field2004 >= var12 && class127.field2001 >= var13 && class127.field2004 < var14 && class127.field2001 < var15) {
                                for (class1 var27 = (class1) field455.method3225(); var27 != null; var27 = (class1) field455.method3227()) {
                                    if (var27.field2) {
                                        var27.method3307();
                                        var27.field3.field2523 = false;
                                    }
                                }
                                if (Statics.field1653 == 0) {
                                    field346 = null;
                                    field430 = null;
                                }
                                if (!field515) {
                                    field276[0] = class142.field2366;
                                    field503[0] = "";
                                    field377[0] = 1006;
                                    field400 = 1;
                                }
                            }
                            boolean var28;
                            if (class127.field2004 >= var12 && class127.field2001 >= var13 && class127.field2004 < var14 && class127.field2001 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class127.field2005 == 1 || !Statics.field1475 && class127.field2005 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class127.field2000 == 1 || !Statics.field1475 && class127.field2000 == 4) && class127.field2013 >= var12 && class127.field2014 >= var13 && class127.field2013 < var14 && class127.field2014 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                method10(var9, class127.field2013 - var10, class127.field2014 - var11);
                            }
                            if (field346 != null && field346 != var9 && var28 && class155.method2082(method2423(var9))) {
                                field501 = var9;
                            }
                            if (field430 == var9) {
                                field434 = true;
                                field435 = var10;
                                field436 = var11;
                            }
                            if (var9.field2584) {
                                if (var28 && field454 != 0 && var9.field2605 != null) {
                                    class1 var31 = new class1();
                                    var31.field2 = true;
                                    var31.field3 = var9;
                                    var31.field9 = field454;
                                    var31.field13 = var9.field2605;
                                    field455.method3222(var31);
                                }
                                if (field346 != null || Statics.field1271 != null || field515) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2524 && var30) {
                                    var9.field2524 = true;
                                    if (var9.field2586 != null) {
                                        class1 var32 = new class1();
                                        var32.field2 = true;
                                        var32.field3 = var9;
                                        var32.field4 = class127.field2013 - var10;
                                        var32.field9 = class127.field2014 - var11;
                                        var32.field13 = var9.field2586;
                                        field455.method3222(var32);
                                    }
                                }
                                if (var9.field2524 && var29 && var9.field2587 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = true;
                                    var33.field3 = var9;
                                    var33.field4 = class127.field2004 - var10;
                                    var33.field9 = class127.field2001 - var11;
                                    var33.field13 = var9.field2587;
                                    field455.method3222(var33);
                                }
                                if (var9.field2524 && !var29) {
                                    var9.field2524 = false;
                                    if (var9.field2629 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = true;
                                        var34.field3 = var9;
                                        var34.field4 = class127.field2004 - var10;
                                        var34.field9 = class127.field2001 - var11;
                                        var34.field13 = var9.field2629;
                                        field328.method3222(var34);
                                    }
                                }
                                if (var29 && var9.field2583 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = true;
                                    var35.field3 = var9;
                                    var35.field4 = class127.field2004 - var10;
                                    var35.field9 = class127.field2001 - var11;
                                    var35.field13 = var9.field2583;
                                    field455.method3222(var35);
                                }
                                if (!var9.field2523 && var28) {
                                    var9.field2523 = true;
                                    if (var9.field2590 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = true;
                                        var36.field3 = var9;
                                        var36.field4 = class127.field2004 - var10;
                                        var36.field9 = class127.field2001 - var11;
                                        var36.field13 = var9.field2590;
                                        field455.method3222(var36);
                                    }
                                }
                                if (var9.field2523 && var28 && var9.field2627 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = true;
                                    var37.field3 = var9;
                                    var37.field4 = class127.field2004 - var10;
                                    var37.field9 = class127.field2001 - var11;
                                    var37.field13 = var9.field2627;
                                    field455.method3222(var37);
                                }
                                if (var9.field2523 && !var28) {
                                    var9.field2523 = false;
                                    if (var9.field2531 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = true;
                                        var38.field3 = var9;
                                        var38.field4 = class127.field2004 - var10;
                                        var38.field9 = class127.field2001 - var11;
                                        var38.field13 = var9.field2531;
                                        field328.method3222(var38);
                                    }
                                }
                                if (var9.field2603 != null) {
                                    class1 var39 = new class1();
                                    var39.field3 = var9;
                                    var39.field13 = var9.field2603;
                                    field456.method3222(var39);
                                }
                                if (var9.field2593 != null && field252 > var9.field2529) {
                                    if (var9.field2588 == null || field252 - var9.field2529 > 32) {
                                        class1 var44 = new class1();
                                        var44.field3 = var9;
                                        var44.field13 = var9.field2593;
                                        field455.method3222(var44);
                                    } else {
                                        label468: for (int var40 = var9.field2529; var40 < field252; var40++) {
                                            int var41 = field325[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var9.field2588.length; var42++) {
                                                if (var9.field2588[var42] == var41) {
                                                    class1 var43 = new class1();
                                                    var43.field3 = var9;
                                                    var43.field13 = var9.field2593;
                                                    field455.method3222(var43);
                                                    break label468;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2529 = field252;
                                }
                                if (var9.field2599 != null && field445 > var9.field2630) {
                                    if (var9.field2621 == null || field445 - var9.field2630 > 32) {
                                        class1 var49 = new class1();
                                        var49.field3 = var9;
                                        var49.field13 = var9.field2599;
                                        field455.method3222(var49);
                                    } else {
                                        label444: for (int var45 = var9.field2630; var45 < field445; var45++) {
                                            int var46 = field264[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2621.length; var47++) {
                                                if (var9.field2621[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field3 = var9;
                                                    var48.field13 = var9.field2599;
                                                    field455.method3222(var48);
                                                    break label444;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2630 = field445;
                                }
                                if (var9.field2532 != null && field447 > var9.field2631) {
                                    if (var9.field2602 == null || field447 - var9.field2631 > 32) {
                                        class1 var54 = new class1();
                                        var54.field3 = var9;
                                        var54.field13 = var9.field2532;
                                        field455.method3222(var54);
                                    } else {
                                        label420: for (int var50 = var9.field2631; var50 < field447; var50++) {
                                            int var51 = field446[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2602.length; var52++) {
                                                if (var9.field2602[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field3 = var9;
                                                    var53.field13 = var9.field2532;
                                                    field455.method3222(var53);
                                                    break label420;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2631 = field447;
                                }
                                if (field448 > var9.field2628 && var9.field2606 != null) {
                                    class1 var55 = new class1();
                                    var55.field3 = var9;
                                    var55.field13 = var9.field2606;
                                    field455.method3222(var55);
                                }
                                if (field319 > var9.field2628 && var9.field2608 != null) {
                                    class1 var56 = new class1();
                                    var56.field3 = var9;
                                    var56.field13 = var9.field2608;
                                    field455.method3222(var56);
                                }
                                if (field466 > var9.field2628 && var9.field2542 != null) {
                                    class1 var57 = new class1();
                                    var57.field3 = var9;
                                    var57.field13 = var9.field2542;
                                    field455.method3222(var57);
                                }
                                if (field451 > var9.field2628 && var9.field2610 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field13 = var9.field2610;
                                    field455.method3222(var58);
                                }
                                var9.field2628 = field441;
                                if (var9.field2597 != null) {
                                    for (int var59 = 0; var59 < field389; var59++) {
                                        class1 var60 = new class1();
                                        var60.field3 = var9;
                                        var60.field8 = field458[var59];
                                        var60.field11 = field476[var59];
                                        var60.field13 = var9.field2597;
                                        field455.method3222(var60);
                                    }
                                }
                            }
                        }
                        if (!var9.field2516 && field346 == null && Statics.field1271 == null && !field515) {
                            if ((var9.field2616 >= 0 || var9.field2549 != 0) && class127.field2004 >= var12 && class127.field2001 >= var13 && class127.field2004 < var14 && class127.field2001 < var15) {
                                if (var9.field2616 >= 0) {
                                    Statics.field631 = arg0[var9.field2616];
                                } else {
                                    Statics.field631 = var9;
                                }
                            }
                            if (var9.field2548 == 8 && class127.field2004 >= var12 && class127.field2001 >= var13 && class127.field2004 < var14 && class127.field2001 < var15) {
                                Statics.field2116 = var9;
                            }
                            if (var9.field2533 > var9.field2527) {
                                method866(var9, var9.field2526 + var10, var11, var9.field2527, var9.field2533, class127.field2004, class127.field2001);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.co([Lex;IB)V")
    public static final void method1874(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2548 == 0) {
                    if (var3.field2508 != null) {
                        method1874(var3.field2508, arg1);
                    }
                    class4 var4 = (class4) field488.method3192((long) var3.field2517);
                    if (var4 != null) {
                        Statics.method603(var4.field67, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2611 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field13 = var3.field2611;
                    class32.method146(var5);
                }
                if (arg1 == 1 && var3.field2566 != null) {
                    if (var3.field2518 >= 0) {
                        class151 var6 = Statics.method815(var3.field2517);
                        if (var6 == null || var6.field2508 == null || var3.field2518 >= var6.field2508.length || var6.field2508[var3.field2518] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field13 = var3.field2566;
                    class32.method146(var7);
                }
            }
        }
    }

    @ObfuscatedName("p.ct(Lex;III)V")
    public static final void method10(class151 arg0, int arg1, int arg2) {
        if (field346 != null || field515 || arg0 == null || method136(arg0) == null) {
            return;
        }
        field346 = arg0;
        field430 = method136(arg0);
        field431 = arg1;
        field432 = arg2;
        Statics.field1653 = 0;
        field270 = false;
        if (field400 <= 0) {
            return;
        }
        int var3 = field400 - 1;
        Statics.field1650 = new class27();
        Statics.field1650.field637 = field401[var3];
        Statics.field1650.field629 = field402[var3];
        Statics.field1650.field630 = field377[var3];
        Statics.field1650.field628 = field404[var3];
        Statics.field1650.field632 = field276[var3];
    }

    @ObfuscatedName("cz.ci(III)V")
    public static void method1869(int arg0, int arg1) {
        method542(Statics.field1650, arg0, arg1);
        Statics.field1650 = null;
    }

    @ObfuscatedName("w.cw(B)V")
    public static void method474() {
        for (class4 var0 = (class4) field488.method3196(); var0 != null; var0 = (class4) field488.method3201()) {
            int var1 = var0.field67;
            if (class151.method1883(var1)) {
                boolean var2 = true;
                class151[] var3 = Statics.field2559[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2516;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2843;
                    class151 var6 = Statics.method815(var5);
                    if (var6 != null) {
                        Statics.method2431(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.cm(Lex;I)Lex;")
    public static class151 method136(class151 arg0) {
        class151 var1 = arg0;
        int var2 = method2423(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class151 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = Statics.method815(var1.field2581);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class151 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2579;
        }
        return var7;
    }

    @ObfuscatedName("ed.ce([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2673(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("af.cp(II)V")
    public static final void method1052(int arg0) {
        if (!class151.method1883(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2559[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3 != null) {
                var3.field2623 = 0;
                var3.field2624 = 0;
            }
        }
    }

    @ObfuscatedName("bj.cb(II)V")
    public static final void method1421(int arg0) {
        if (class151.method1883(arg0)) {
            method158(Statics.field2559[arg0], -1);
        }
    }

    @ObfuscatedName("n.cs([Lex;II)V")
    public static final void method158(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null && var3.field2581 == arg1 && (!var3.field2516 || !method3033(var3))) {
                if (var3.field2548 == 0) {
                    if (!var3.field2516 && method3033(var3) && Statics.field631 != var3) {
                        continue;
                    }
                    method158(arg0, var3.field2517);
                    if (var3.field2508 != null) {
                        method158(var3.field2508, var3.field2517);
                    }
                    class4 var4 = (class4) field488.method3192((long) var3.field2517);
                    if (var4 != null) {
                        method1421(var4.field67);
                    }
                }
                if (var3.field2548 == 6) {
                    if (var3.field2553 != -1 || var3.field2563 != -1) {
                        boolean var5 = method142(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2563;
                        } else {
                            var6 = var3.field2553;
                        }
                        if (var6 != -1) {
                            class38 var7 = class38.method81(var6);
                            var3.field2624 += field332;
                            while (var3.field2624 > var7.field909[var3.field2623]) {
                                var3.field2624 -= var7.field909[var3.field2623];
                                var3.field2623++;
                                if (var3.field2623 >= var7.field907.length) {
                                    var3.field2623 -= var7.field897;
                                    if (var3.field2623 < 0 || var3.field2623 >= var7.field907.length) {
                                        var3.field2623 = 0;
                                    }
                                }
                                Statics.method2431(var3);
                            }
                        }
                    }
                    if (var3.field2561 != 0 && !var3.field2516) {
                        int var8 = var3.field2561 >> 16;
                        int var9 = var3.field2561 << 16 >> 16;
                        int var10 = field332 * var8;
                        int var11 = field332 * var9;
                        var3.field2557 = var3.field2557 + var10 & 0x7FF;
                        var3.field2558 = var3.field2558 + var11 & 0x7FF;
                        Statics.method2431(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.cv(II)V")
    public static final void method1790(int arg0) {
        method474();
        for (class20 var1 = (class20) class20.field551.method3225(); var1 != null; var1 = (class20) class20.field551.method3227()) {
            if (var1.field547 != null) {
                var1.method484();
            }
        }
        int var2 = class46.method592(arg0).field1052;
        if (var2 == 0) {
            return;
        }
        int var3 = class153.field2645[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1829(0.9D);
                ((class88) Statics.field1466).method1878(0.9D);
            }
            if (var3 == 2) {
                class84.method1829(0.8D);
                ((class88) Statics.field1466).method1878(0.8D);
            }
            if (var3 == 3) {
                class84.method1829(0.7D);
                ((class88) Statics.field1466).method1878(0.7D);
            }
            if (var3 == 4) {
                class84.method1829(0.6D);
                ((class88) Statics.field1466).method1878(0.6D);
            }
            class45.field1004.method3162();
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
            if (field408 != var4) {
                if (field408 == 0 && field489 != -1) {
                    class160.method577(Statics.field2469, field489, 0, var4, false);
                    field490 = false;
                } else if (var4 == 0) {
                    class160.method2404();
                    field490 = false;
                } else if (class160.field2695 == 0) {
                    Statics.field2690.method3022(var4);
                } else {
                    Statics.field1264 = var4;
                }
                field408 = var4;
            }
        }
        if (var2 == 4) {
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
        if (var2 == 5) {
            field398 = var3;
        }
        if (var2 == 6) {
            field419 = var3;
        }
        if (var2 == 9) {
            field420 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field492 = 127;
            }
            if (var3 == 1) {
                field492 = 96;
            }
            if (var3 == 2) {
                field492 = 64;
            }
            if (var3 == 3) {
                field492 = 32;
            }
            if (var3 == 4) {
                field492 = 0;
            }
        }
        if (var2 == 17) {
            field425 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = class18.method2066();
            class18[] var6 = var5;
            int var7 = 0;
            class18 var9;
            while (true) {
                if (var7 >= var6.length) {
                    var9 = null;
                    break;
                }
                class18 var8 = var6[var7];
                if (var3 == var8.method470()) {
                    var9 = var8;
                    break;
                }
                var7++;
            }
            field282 = (class18) var9;
            if (field282 == null) {
                field282 = class18.field524;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field390 = -1;
        } else {
            field390 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("o.cu(I)V")
    public static final void method128() {
        field296.method2374(194);
        for (class4 var0 = (class4) field488.method3196(); var0 != null; var0 = (class4) field488.method3201()) {
            if (var0.field62 == 0 || var0.field62 == 3) {
                method126(var0, true);
            }
        }
        if (field339 != null) {
            Statics.method2431(field339);
            field339 = null;
        }
    }

    @ObfuscatedName("al.cc(IIII)Lg;")
    public static final class4 method935(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field67 = arg1;
        var3.field62 = arg2;
        field488.method3191(var3, (long) arg0);
        method1052(arg1);
        Statics.method803(arg1);
        class151 var4 = Statics.method815(arg0);
        if (var4 != null) {
            Statics.method2431(var4);
        }
        if (field339 != null) {
            Statics.method2431(field339);
            field339 = null;
        }
        method30();
        if (field417 != -1) {
            Statics.method603(field417, 1);
        }
        return var3;
    }

    @ObfuscatedName("i.cl(Lg;ZI)V")
    public static final void method126(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field2843;
        arg0.method3307();
        if (arg1) {
            class151.method2701(var2);
        }
        method1387(var2);
        class151 var4 = Statics.method815(var3);
        if (var4 != null) {
            Statics.method2431(var4);
        }
        method30();
        if (field417 != -1) {
            Statics.method603(field417, 1);
        }
    }

    @ObfuscatedName("f.cj(Lex;I)Z")
    public static final boolean method112(class151 arg0) {
        int var1 = arg0.field2521;
        if (var1 == 205) {
            field510 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field511.method2911(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field511.method2936(var4, var5 == 1);
        }
        if (var1 == 324) {
            field511.method2913(false);
        }
        if (var1 == 325) {
            field511.method2913(true);
        }
        if (var1 == 326) {
            field296.method2374(55);
            field511.method2914(field296);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.du(IIIILbu;I)V")
    public static final void method127(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method117(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field341 + field327 & 0x7FF;
        int var7 = class84.field1469[var6];
        int var8 = class84.field1470[var6];
        int var9 = var7 * 256 / (field473 + 256);
        int var10 = var8 * 256 / (field473 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field28.method1456(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("c.de(IIIILbu;I)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field341 + field327 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1469[var5];
        int var8 = class84.field1470[var5];
        int var9 = var7 * 256 / (field473 + 256);
        int var10 = var8 * 256 / (field473 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1459(Statics.field966, arg0 + 94 + var11 - arg4.field1290 / 2 + 4, arg1 + 83 - var12 - arg4.field1295 / 2 - 4);
        } else {
            arg4.method1436(arg0 + 94 + var11 - arg4.field1290 / 2 + 4, arg1 + 83 - var12 - arg4.field1295 / 2 - 4);
        }
    }

    @ObfuscatedName("au.dp(Ljava/lang/String;ZI)Z")
    public static boolean method855(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method525(arg0, Statics.field1933);
        for (int var3 = 0; var3 < field505; var3++) {
            if (var2.equalsIgnoreCase(Statics.method525(field479[var3].field238, Statics.field1933)) && (!arg1 || field479[var3].field229 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method525(Statics.field521.field50, Statics.field1933))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cr.dg(Ljava/lang/String;I)Z")
    public static boolean method1865(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method525(arg0, Statics.field1933);
        for (int var2 = 0; var2 < field509; var2++) {
            class8 var3 = field308[var2];
            if (var1.equalsIgnoreCase(Statics.method525(var3.field136, Statics.field1933))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method525(var3.field133, Statics.field1933))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.do(Ljava/lang/String;I)V")
    public static final void method108(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field505 < 200 || field383 == 1) || field505 >= 400) {
            class10.method1607(30, "", class142.field2299);
            return;
        }
        String var1 = Statics.method525(arg0, Statics.field1933);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field505; var2++) {
            class16 var3 = field479[var2];
            String var4 = Statics.method525(var3.field238, Statics.field1933);
            if (var4 != null && var4.equals(var1)) {
                class10.method1607(30, "", arg0 + class142.field2300);
                return;
            }
            if (var3.field228 != null) {
                String var5 = Statics.method525(var3.field228, Statics.field1933);
                if (var5 != null && var5.equals(var1)) {
                    class10.method1607(30, "", arg0 + class142.field2300);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field509; var6++) {
            class8 var7 = field308[var6];
            String var8 = Statics.method525(var7.field136, Statics.field1933);
            if (var8 != null && var8.equals(var1)) {
                class10.method1607(30, "", class142.field2305 + arg0 + class142.field2320);
                return;
            }
            if (var7.field133 != null) {
                String var9 = Statics.method525(var7.field133, Statics.field1933);
                if (var9 != null && var9.equals(var1)) {
                    class10.method1607(30, "", class142.field2305 + arg0 + class142.field2320);
                    return;
                }
            }
        }
        if (Statics.method525(Statics.field521.field50, Statics.field1933).equals(var1)) {
            class10.method1607(30, "", class142.field2369);
        } else {
            field296.method2374(236);
            field296.method2249(class107.method4(arg0));
            field296.method2132(arg0);
        }
    }

    @ObfuscatedName("f.dc(Ljava/lang/String;ZB)V")
    public static final void method114(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field509 < 100 || field383 == 1) || field509 >= 400) {
            class10.method1607(31, "", class142.field2301);
            return;
        }
        String var2 = Statics.method525(arg0, Statics.field1933);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field509; var3++) {
            class8 var4 = field308[var3];
            String var5 = Statics.method525(var4.field136, Statics.field1933);
            if (var5 != null && var5.equals(var2)) {
                class10.method1607(31, "", arg0 + class142.field2302);
                return;
            }
            if (var4.field133 != null) {
                String var6 = Statics.method525(var4.field133, Statics.field1933);
                if (var6 != null && var6.equals(var2)) {
                    class10.method1607(31, "", arg0 + class142.field2302);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field505; var7++) {
            class16 var8 = field479[var7];
            String var9 = Statics.method525(var8.field238, Statics.field1933);
            if (var9 != null && var9.equals(var2)) {
                class10.method1607(31, "", class142.field2307 + arg0 + class142.field2242);
                return;
            }
            if (var8.field228 != null) {
                String var10 = Statics.method525(var8.field228, Statics.field1933);
                if (var10 != null && var10.equals(var2)) {
                    class10.method1607(31, "", class142.field2307 + arg0 + class142.field2242);
                    return;
                }
            }
        }
        if (Statics.method525(Statics.field521.field50, Statics.field1933).equals(var2)) {
            class10.method1607(31, "", class142.field2304);
        } else {
            field296.method2374(223);
            field296.method2249(class107.method4(arg0));
            field296.method2132(arg0);
        }
    }

    @ObfuscatedName("r.dq(Ljava/lang/String;I)V")
    public static final void method526(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method525(arg0, Statics.field1933);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field505; var2++) {
            class16 var3 = field479[var2];
            String var4 = var3.field238;
            String var5 = Statics.method525(var4, Statics.field1933);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field505--;
                for (int var7 = var2; var7 < field505; var7++) {
                    field479[var7] = field479[var7 + 1];
                }
                field319 = field441;
                field296.method2374(29);
                field296.method2249(class107.method4(arg0));
                field296.method2132(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bq.dl(Ljava/lang/String;I)V")
    public static final void method1427(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method525(arg0, Statics.field1933);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field509; var2++) {
            class8 var3 = field308[var2];
            String var4 = var3.field136;
            String var5 = Statics.method525(var4, Statics.field1933);
            if (class116.method2471(arg0, var1, var4, var5)) {
                field509--;
                for (int var6 = var2; var6 < field509; var6++) {
                    field308[var6] = field308[var6 + 1];
                }
                field319 = field441;
                field296.method2374(179);
                field296.method2249(class107.method4(arg0));
                field296.method2132(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.dn(Ljava/lang/String;II)V")
    public static final void method493(String arg0, int arg1) {
        field296.method2374(88);
        field296.method2249(class107.method4(arg0) + 1);
        field296.method2132(arg0);
        field296.method2162(arg1);
    }

    @ObfuscatedName("dz.ds(Ljava/lang/String;I)V")
    public static final void method2438(String arg0) {
        if (!arg0.equals("")) {
            field296.method2374(173);
            field296.method2249(class107.method4(arg0));
            field296.method2132(arg0);
        }
    }

    @ObfuscatedName("az.da(I)V")
    public static final void method761() {
        field296.method2374(173);
        field296.method2249(0);
    }

    @ObfuscatedName("by.dw(IB)V")
    public static void method1387(int arg0) {
        for (class178 var1 = (class178) field386.method3196(); var1 != null; var1 = (class178) field386.method3201()) {
            if ((var1.field2843 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3307();
            }
        }
    }

    @ObfuscatedName("ds.dk(Lex;I)I")
    public static int method2423(class151 arg0) {
        class178 var1 = (class178) field386.method3192(((long) arg0.field2517 << 32) + (long) arg0.field2518);
        return var1 == null ? arg0.field2576 : var1.field2834;
    }

    @ObfuscatedName("fg.dz(Lex;B)Z")
    public static boolean method3033(class151 arg0) {
        if (field427) {
            if (method2423(arg0) != 0) {
                return false;
            }
            if (arg0.field2548 == 0) {
                return false;
            }
        }
        return arg0.field2591;
    }

    @ObfuscatedName("aw.dy(Lex;II)Ljava/lang/String;")
    public static String method599(class151 arg0, int arg1) {
        int var2 = method2423(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2509 == null) {
            return null;
        } else if (arg0.field2578 == null || arg0.field2578.length <= arg1 || arg0.field2578[arg1] == null || arg0.field2578[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2578[arg1];
        }
    }
}

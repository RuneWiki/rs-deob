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
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.i")
    public static boolean field271 = true;

    @ObfuscatedName("client.d")
    public static int field257 = 1;

    @ObfuscatedName("client.q")
    public static int field258 = 0;

    @ObfuscatedName("client.a")
    public static int field259 = 0;

    @ObfuscatedName("client.w")
    public static class198[] field373 = new class198[4];

    @ObfuscatedName("client.v")
    public static boolean field261 = false;

    @ObfuscatedName("client.z")
    public static boolean field262 = false;

    @ObfuscatedName("client.j")
    public static int field263 = 0;

    @ObfuscatedName("client.c")
    public static int field265 = 0;

    @ObfuscatedName("client.u")
    public static boolean field266 = true;

    @ObfuscatedName("client.h")
    public static int field440 = 0;

    @ObfuscatedName("client.t")
    public static long field412 = -1L;

    @ObfuscatedName("client.g")
    public static int field510 = -1;

    @ObfuscatedName("client.s")
    public static int field270 = -1;

    @ObfuscatedName("client.p")
    public static int field434 = -1;

    @ObfuscatedName("client.b")
    public static boolean field454 = true;

    @ObfuscatedName("client.l")
    public static boolean field474 = false;

    @ObfuscatedName("client.al")
    public static int field274 = 0;

    @ObfuscatedName("client.aa")
    public static int field392 = 0;

    @ObfuscatedName("client.ar")
    public static int field276 = 0;

    @ObfuscatedName("client.ak")
    public static int field277 = 0;

    @ObfuscatedName("client.ay")
    public static int field264 = 0;

    @ObfuscatedName("client.aw")
    public static int field279 = 0;

    @ObfuscatedName("client.av")
    public static int field492 = 0;

    @ObfuscatedName("client.at")
    public static int field281 = 0;

    @ObfuscatedName("client.af")
    public static int field283 = 0;

    @ObfuscatedName("client.ae")
    public static class107 field342 = new class107(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static class18 field286 = class18.field532;

    @ObfuscatedName("client.az")
    public static int field287 = 0;

    @ObfuscatedName("client.aq")
    public static int field433 = 0;

    @ObfuscatedName("client.an")
    public static int field289 = 0;

    @ObfuscatedName("client.bs")
    public static int field291 = 0;

    @ObfuscatedName("client.be")
    public static int field292 = 0;

    @ObfuscatedName("client.bt")
    public static int field293 = 0;

    @ObfuscatedName("client.bu")
    public static int field294 = 0;

    @ObfuscatedName("client.bl")
    public static int field295 = 0;

    @ObfuscatedName("client.bp")
    public static class30[] field298 = new class30[32768];

    @ObfuscatedName("client.bz")
    public static int field299 = 0;

    @ObfuscatedName("client.bm")
    public static int[] field300 = new int[32768];

    @ObfuscatedName("client.cs")
    public static class110 field301 = new class110(5000);

    @ObfuscatedName("client.cb")
    public static class110 field421 = new class110(5000);

    @ObfuscatedName("client.cc")
    public static class110 field303 = new class110(5000);

    @ObfuscatedName("client.cl")
    public static int field304 = 0;

    @ObfuscatedName("client.ch")
    public static int field305 = 0;

    @ObfuscatedName("client.cw")
    public static int field306 = 0;

    @ObfuscatedName("client.cn")
    public static int field307 = 0;

    @ObfuscatedName("client.cu")
    public static int field308 = 0;

    @ObfuscatedName("client.cd")
    public static int field309 = 0;

    @ObfuscatedName("client.cq")
    public static int field364 = 0;

    @ObfuscatedName("client.cj")
    public static int field362 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field312 = false;

    @ObfuscatedName("client.ck")
    public static int field313 = 0;

    @ObfuscatedName("client.ct")
    public static int field487 = 0;

    @ObfuscatedName("client.du")
    public static int field317 = 1;

    @ObfuscatedName("client.dn")
    public static int field378 = 0;

    @ObfuscatedName("client.dw")
    public static int field465 = 1;

    @ObfuscatedName("client.di")
    public static int field318 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field269 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field356 = new int[4][13][13];

    @ObfuscatedName("client.df")
    public static final int[] field450 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dk")
    public static int field323 = 0;

    @ObfuscatedName("client.db")
    public static int field324 = 2;

    @ObfuscatedName("client.dt")
    public static int field319 = 0;

    @ObfuscatedName("client.de")
    public static int field326 = 2;

    @ObfuscatedName("client.dj")
    public static int field327 = 0;

    @ObfuscatedName("client.dg")
    public static int field328 = 1;

    @ObfuscatedName("client.dy")
    public static int field329 = 0;

    @ObfuscatedName("client.dz")
    public static int field400 = 0;

    @ObfuscatedName("client.dq")
    public static int field331 = 2;

    @ObfuscatedName("client.dd")
    public static int field332 = 0;

    @ObfuscatedName("client.eg")
    public static int field255 = 1;

    @ObfuscatedName("client.em")
    public static int field321 = 0;

    @ObfuscatedName("client.eu")
    public static int field335 = 0;

    @ObfuscatedName("client.eb")
    public static int field336 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field337 = 5063219;

    @ObfuscatedName("client.ek")
    public static int field282 = 3353893;

    @ObfuscatedName("client.er")
    public static int field383 = 7759444;

    @ObfuscatedName("client.ef")
    public static boolean field340 = false;

    @ObfuscatedName("client.fm")
    public static int field341 = 0;

    @ObfuscatedName("client.fo")
    public static int field501 = 128;

    @ObfuscatedName("client.fw")
    public static int field343 = 0;

    @ObfuscatedName("client.fn")
    public static int field512 = 0;

    @ObfuscatedName("client.ff")
    public static int field345 = 0;

    @ObfuscatedName("client.fb")
    public static int field311 = 0;

    @ObfuscatedName("client.fq")
    public static int field347 = 0;

    @ObfuscatedName("client.fi")
    public static int field348 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field325 = false;

    @ObfuscatedName("client.fe")
    public static int field349 = 0;

    @ObfuscatedName("client.fa")
    public static int field495 = 0;

    @ObfuscatedName("client.fd")
    public static int field352 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field267 = new int[field352];

    @ObfuscatedName("client.fv")
    public static int[] field354 = new int[field352];

    @ObfuscatedName("client.fx")
    public static int[] field355 = new int[field352];

    @ObfuscatedName("client.fr")
    public static int[] field478 = new int[field352];

    @ObfuscatedName("client.fc")
    public static int[] field496 = new int[field352];

    @ObfuscatedName("client.fj")
    public static int[] field358 = new int[field352];

    @ObfuscatedName("client.fk")
    public static int[] field359 = new int[field352];

    @ObfuscatedName("client.gr")
    public static String[] field360 = new String[field352];

    @ObfuscatedName("client.gq")
    public static int[][] field361 = new int[104][104];

    @ObfuscatedName("client.gd")
    public static int field330 = 0;

    @ObfuscatedName("client.gx")
    public static int field363 = -1;

    @ObfuscatedName("client.ga")
    public static int field472 = -1;

    @ObfuscatedName("client.gb")
    public static int field365 = 0;

    @ObfuscatedName("client.gm")
    public static int field366 = 0;

    @ObfuscatedName("client.gn")
    public static int field376 = 0;

    @ObfuscatedName("client.go")
    public static int field368 = 0;

    @ObfuscatedName("client.gl")
    public static int field369 = 0;

    @ObfuscatedName("client.gu")
    public static int field370 = 0;

    @ObfuscatedName("client.gw")
    public static int field371 = 0;

    @ObfuscatedName("client.gy")
    public static int field372 = 0;

    @ObfuscatedName("client.gj")
    public static int field473 = 0;

    @ObfuscatedName("client.gh")
    public static int field374 = 0;

    @ObfuscatedName("client.gi")
    public static boolean field375 = false;

    @ObfuscatedName("client.ge")
    public static int field518 = 0;

    @ObfuscatedName("client.gk")
    public static int field382 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field521 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field379 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field380 = new int[2048];

    @ObfuscatedName("client.ha")
    public static int field381 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field422 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class107[] field491 = new class107[2048];

    @ObfuscatedName("client.hf")
    public static int field384 = -1;

    @ObfuscatedName("client.hd")
    public static int field314 = 0;

    @ObfuscatedName("client.hb")
    public static int field386 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field408 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hv")
    public static String[] field350 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field390 = new boolean[8];

    @ObfuscatedName("client.hw")
    public static int[] field391 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field385 = -1;

    @ObfuscatedName("client.hs")
    public static class178[][][] field393 = new class178[4][104][104];

    @ObfuscatedName("client.hk")
    public static class178 field394 = new class178();

    @ObfuscatedName("client.hg")
    public static class178 field395 = new class178();

    @ObfuscatedName("client.hx")
    public static class178 field396 = new class178();

    @ObfuscatedName("client.hz")
    public static int[] field397 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field443 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field480 = 0;

    @ObfuscatedName("client.hr")
    public static boolean field403 = false;

    @ObfuscatedName("client.ij")
    public static int field402 = 0;

    @ObfuscatedName("client.il")
    public static int[] field377 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field320 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field406 = new int[500];

    @ObfuscatedName("client.io")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field273 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field409 = -1;

    @ObfuscatedName("client.ig")
    public static int field315 = -1;

    @ObfuscatedName("client.iq")
    public static int field411 = 0;

    @ObfuscatedName("client.ir")
    public static int field272 = 50;

    @ObfuscatedName("client.ih")
    public static int field413 = 0;

    @ObfuscatedName("client.it")
    public static String field414 = null;

    @ObfuscatedName("client.iy")
    public static boolean field415 = false;

    @ObfuscatedName("client.ix")
    public static int field416 = -1;

    @ObfuscatedName("client.iw")
    public static int field417 = -1;

    @ObfuscatedName("client.ja")
    public static String field334 = null;

    @ObfuscatedName("client.js")
    public static String field419 = null;

    @ObfuscatedName("client.jm")
    public static int field420 = -1;

    @ObfuscatedName("client.jd")
    public static class175 field351 = new class175(8);

    @ObfuscatedName("client.jg")
    public static int field346 = 0;

    @ObfuscatedName("client.jf")
    public static int field423 = 0;

    @ObfuscatedName("client.jr")
    public static class153 field424 = null;

    @ObfuscatedName("client.je")
    public static int field425 = 0;

    @ObfuscatedName("client.jl")
    public static int field436 = 0;

    @ObfuscatedName("client.jk")
    public static int field427 = 0;

    @ObfuscatedName("client.jx")
    public static int field428 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field429 = false;

    @ObfuscatedName("client.jo")
    public static boolean field430 = false;

    @ObfuscatedName("client.jp")
    public static boolean field431 = false;

    @ObfuscatedName("client.jh")
    public static class153 field256 = null;

    @ObfuscatedName("client.jb")
    public static class153 field339 = null;

    @ObfuscatedName("client.jj")
    public static int field338 = 0;

    @ObfuscatedName("client.jv")
    public static int field432 = 0;

    @ObfuscatedName("client.jn")
    public static class153 field316 = null;

    @ObfuscatedName("client.jq")
    public static boolean field437 = false;

    @ObfuscatedName("client.jy")
    public static int field438 = -1;

    @ObfuscatedName("client.ju")
    public static int field439 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field333 = false;

    @ObfuscatedName("client.jz")
    public static int field426 = -1;

    @ObfuscatedName("client.jt")
    public static int field442 = -1;

    @ObfuscatedName("client.kr")
    public static boolean field357 = false;

    @ObfuscatedName("client.ka")
    public static int field444 = 1;

    @ObfuscatedName("client.ki")
    public static int[] field445 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field446 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field447 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field448 = 0;

    @ObfuscatedName("client.km")
    public static int[] field449 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field476 = 0;

    @ObfuscatedName("client.ke")
    public static int field441 = 0;

    @ObfuscatedName("client.ku")
    public static int field452 = 0;

    @ObfuscatedName("client.kj")
    public static int field453 = 0;

    @ObfuscatedName("client.kl")
    public static int field389 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field455 = new int[2000];

    @ObfuscatedName("client.kk")
    public static String[] field456 = new String[1000];

    @ObfuscatedName("client.kb")
    public static int field457 = 0;

    @ObfuscatedName("client.ky")
    public static class178 field458 = new class178();

    @ObfuscatedName("client.kz")
    public static class178 field464 = new class178();

    @ObfuscatedName("client.kx")
    public static class178 field460 = new class178();

    @ObfuscatedName("client.kv")
    public static class175 field461 = new class175(512);

    @ObfuscatedName("client.lr")
    public static int field462 = 0;

    @ObfuscatedName("client.lz")
    public static int field463 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field482 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field410 = new boolean[100];

    @ObfuscatedName("client.li")
    public static boolean[] field466 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field459 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field469 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field471 = 0;

    @ObfuscatedName("client.la")
    public static int[] field404 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lg")
    public static int field502 = 0;

    @ObfuscatedName("client.lc")
    public static int field367 = 0;

    @ObfuscatedName("client.ly")
    public static String field475 = "";

    @ObfuscatedName("client.lk")
    public static long[] field451 = new long[100];

    @ObfuscatedName("client.lt")
    public static int field477 = 0;

    @ObfuscatedName("client.lo")
    public static int field499 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field479 = new int[128];

    @ObfuscatedName("client.ld")
    public static int[] field284 = new int[128];

    @ObfuscatedName("client.lv")
    public static long field481 = -1L;

    @ObfuscatedName("client.ln")
    public static String field494 = null;

    @ObfuscatedName("client.ls")
    public static String field483 = null;

    @ObfuscatedName("client.mn")
    public static int field484 = -1;

    @ObfuscatedName("client.mp")
    public static int field485 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field486 = new int[1000];

    @ObfuscatedName("client.mo")
    public static int[] field468 = new int[1000];

    @ObfuscatedName("client.my")
    public static class72[] field488 = new class72[1000];

    @ObfuscatedName("client.mq")
    public static int field489 = 0;

    @ObfuscatedName("client.md")
    public static int field490 = 0;

    @ObfuscatedName("client.ms")
    public static int field280 = 0;

    @ObfuscatedName("client.mu")
    public static int field418 = 255;

    @ObfuscatedName("client.mw")
    public static int field493 = -1;

    @ObfuscatedName("client.mz")
    public static boolean field288 = false;

    @ObfuscatedName("client.mr")
    public static int field435 = 127;

    @ObfuscatedName("client.mh")
    public static int field254 = 127;

    @ObfuscatedName("client.nc")
    public static int field322 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field388 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field470 = new int[50];

    @ObfuscatedName("client.nb")
    public static class52[] field344 = new class52[50];

    @ObfuscatedName("client.ni")
    public static boolean field503 = false;

    @ObfuscatedName("client.nw")
    public static boolean[] field504 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field505 = new int[5];

    @ObfuscatedName("client.nl")
    public static int[] field506 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field353 = new int[5];

    @ObfuscatedName("client.nx")
    public static int[] field508 = new int[5];

    @ObfuscatedName("client.or")
    public static int field509 = 0;

    @ObfuscatedName("client.ol")
    public static int field302 = 0;

    @ObfuscatedName("client.oc")
    public static class16[] field511 = new class16[400];

    @ObfuscatedName("client.od")
    public static class174 field275 = new class174();

    @ObfuscatedName("client.ou")
    public static int field513 = 0;

    @ObfuscatedName("client.os")
    public static class8[] field514 = new class8[400];

    @ObfuscatedName("client.on")
    public static class158 field515 = new class158();

    @ObfuscatedName("client.oy")
    public static int field516 = -1;

    @ObfuscatedName("client.oq")
    public static int field517 = -1;

    @ObfuscatedName("client.i(B)V")
    public final void method170() {
    }

    public final void init() {
        if (!this.method2573()) {
            return;
        }
        class169[] var1 = class169.method543();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class169 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2836);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2836)) {
                    case 1:
                        field257 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field258 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field22)) {
                            field261 = true;
                        } else {
                            field261 = false;
                        }
                        break;
                    case 4:
                        field259 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field310 = var4;
                        break;
                    case 6:
                        field263 = Integer.parseInt(var4);
                        break;
                    case 7:
                        class140[] var5 = new class140[] { class140.field2120, class140.field2117, class140.field2115, class140.field2118, class140.field2116, class140.field2119 };
                        Statics.field260 = (class140) class99.method519(var5, Integer.parseInt(var4));
                        if (Statics.field260 == class140.field2119) {
                            Statics.field153 = class191.field2899;
                        } else {
                            Statics.field153 = class191.field2904;
                        }
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 9:
                        int var6 = Integer.parseInt(var4);
                        class139[] var7 = class139.method784();
                        int var8 = 0;
                        class139 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class139 var9 = var7[var8];
                            if (var9.field2108 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1889 = var10;
                }
            }
        }
        class79.field1356 = false;
        field262 = false;
        Statics.field531 = this.getCodeBase().getHost();
        String var11 = Statics.field1889.field2107;
        byte var12 = 0;
        try {
            class136.method146("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            Statics.method3084((String) null, var14);
        }
        Statics.field401 = this;
        this.method2607(765, 503, 65);
    }

    @ObfuscatedName("client.q(S)V")
    public final void method204() {
        Statics.field296 = field259 == 0 ? 43594 : field257 + 40000;
        Statics.field533 = field259 == 0 ? 443 : field257 + 50000;
        Statics.field174 = Statics.field296;
        Statics.field2685 = class154.field2656;
        Statics.field2653 = class154.field2652;
        Statics.field2683 = class154.field2661;
        Statics.field1914 = class154.field2659;
        class124.method513();
        Canvas var1 = Statics.field131;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1937);
        var1.addFocusListener(class124.field1937);
        Canvas var2 = Statics.field131;
        var2.addMouseListener(class127.field1995);
        var2.addMouseMotionListener(class127.field1995);
        var2.addFocusListener(class127.field1995);
        class132 var3;
        try {
            var3 = new class132();
        } catch (Throwable var7) {
            var3 = null;
        }
        Statics.field2678 = var3;
        if (Statics.field2678 != null) {
            Statics.field2678.method2408(Statics.field131);
        }
        Statics.field1979 = new class121(255, class136.field2071, class136.field2073, 500000);
        Statics.field2430 = class9.method620();
        Statics.field2002 = this.getToolkit().getSystemClipboard();
        String var6 = Statics.field1647;
        class125.field1966 = this;
        class125.field1967 = var6;
        if (field259 != 0) {
            field474 = true;
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method174() {
        field440++;
        this.method386();
        while (true) {
            class178 var1 = class150.field2488;
            class149 var2;
            synchronized (class150.field2488) {
                var2 = (class149) class150.field2487.method3186();
            }
            if (var2 == null) {
                class162.method132();
                method1783();
                class124 var4 = class124.field1937;
                synchronized (class124.field1937) {
                    class124.field1962++;
                    class124.field1959 = class124.field1961;
                    class124.field1958 = 0;
                    if (class124.field1954 >= 0) {
                        while (class124.field1954 != class124.field1953) {
                            int var6 = class124.field1952[class124.field1953];
                            class124.field1953 = class124.field1953 + 1 & 0x7F;
                            if (var6 < 0) {
                                class124.field1951[~var6] = false;
                            } else {
                                if (!class124.field1951[var6] && class124.field1958 < class124.field1957.length - 1) {
                                    class124.field1957[++class124.field1958 - 1] = var6;
                                }
                                class124.field1951[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class124.field1951[var5] = false;
                        }
                        class124.field1954 = class124.field1953;
                    }
                    class124.field1961 = class124.field1960;
                }
                class127.method2392();
                if (Statics.field2678 != null) {
                    int var8 = Statics.field2678.method2407();
                    field457 = var8;
                }
                if (field265 == 0) {
                    method2510();
                    class131.method511();
                } else if (field265 == 5) {
                    class28.method1859(this);
                    method2510();
                    class131.method511();
                } else if (field265 == 10 || field265 == 11) {
                    class28.method1859(this);
                } else if (field265 == 20) {
                    class28.method1859(this);
                    method2657();
                } else if (field265 == 25) {
                    method2089(false);
                    field487 = 0;
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field1896.length; var10++) {
                        if (Statics.field1475[var10] != -1 && Statics.field1896[var10] == null) {
                            Statics.field1896[var10] = Statics.field1337.method2738(Statics.field1475[var10], 0);
                            if (Statics.field1896[var10] == null) {
                                var9 = false;
                                field487++;
                            }
                        }
                        if (Statics.field996[var10] != -1 && Statics.field195[var10] == null) {
                            Statics.field195[var10] = Statics.field1337.method2675(Statics.field996[var10], 0, Statics.field2932[var10]);
                            if (Statics.field195[var10] == null) {
                                var9 = false;
                                field487++;
                            }
                        }
                    }
                    if (var9) {
                        field378 = 0;
                        boolean var11 = true;
                        for (int var12 = 0; var12 < Statics.field1896.length; var12++) {
                            byte[] var13 = Statics.field195[var12];
                            if (var13 != null) {
                                int var14 = (Statics.field1340[var12] >> 8) * 64 - Statics.field1791;
                                int var15 = (Statics.field1340[var12] & 0xFF) * 64 - Statics.field1002;
                                if (field269) {
                                    var14 = 10;
                                    var15 = 10;
                                }
                                var11 &= class6.method1374(var13, var14, var15);
                            }
                        }
                        if (var11) {
                            if (field318 != 0) {
                                method582(class143.field2291 + class2.field24 + class2.field23 + 100 + "%" + class2.field29, true);
                            }
                            method1783();
                            method159();
                            method1783();
                            Statics.field997.method1667();
                            method1783();
                            System.gc();
                            for (int var16 = 0; var16 < 4; var16++) {
                                field373[var16].method3436();
                            }
                            for (int var17 = 0; var17 < 4; var17++) {
                                for (int var18 = 0; var18 < 104; var18++) {
                                    for (int var19 = 0; var19 < 104; var19++) {
                                        class6.field85[var17][var18][var19] = 0;
                                    }
                                }
                            }
                            method1783();
                            class6.method4();
                            int var20 = Statics.field1896.length;
                            for (class20 var21 = (class20) class20.field571.method3179(); var21 != null; var21 = (class20) class20.field571.method3199()) {
                                if (var21.field570 != null) {
                                    Statics.field243.method957(var21.field570);
                                    var21.field570 = null;
                                }
                                if (var21.field567 != null) {
                                    Statics.field243.method957(var21.field567);
                                    var21.field567 = null;
                                }
                            }
                            class20.field571.method3180();
                            method2089(true);
                            if (!field269) {
                                int var22 = 0;
                                label3260: while (true) {
                                    if (var22 >= var20) {
                                        for (int var36 = 0; var36 < var20; var36++) {
                                            int var37 = (Statics.field1340[var36] >> 8) * 64 - Statics.field1791;
                                            int var38 = (Statics.field1340[var36] & 0xFF) * 64 - Statics.field1002;
                                            byte[] var39 = Statics.field1896[var36];
                                            if (var39 == null && Statics.field1495 < 800) {
                                                method1783();
                                                class6.method81(var37, var38, 64, 64);
                                            }
                                        }
                                        method2089(true);
                                        int var40 = 0;
                                        while (true) {
                                            if (var40 >= var20) {
                                                break label3260;
                                            }
                                            byte[] var41 = Statics.field195[var40];
                                            if (var41 != null) {
                                                int var42 = (Statics.field1340[var40] >> 8) * 64 - Statics.field1791;
                                                int var43 = (Statics.field1340[var40] & 0xFF) * 64 - Statics.field1002;
                                                method1783();
                                                class79 var44 = Statics.field997;
                                                class198[] var45 = field373;
                                                class107 var46 = new class107(var41);
                                                int var47 = -1;
                                                while (true) {
                                                    int var48 = var46.method2131();
                                                    if (var48 == 0) {
                                                        break;
                                                    }
                                                    var47 += var48;
                                                    int var49 = 0;
                                                    while (true) {
                                                        int var50 = var46.method2131();
                                                        if (var50 == 0) {
                                                            break;
                                                        }
                                                        var49 += var50 - 1;
                                                        int var51 = var49 & 0x3F;
                                                        int var52 = var49 >> 6 & 0x3F;
                                                        int var53 = var49 >> 12;
                                                        int var54 = var46.method2148();
                                                        int var55 = var54 >> 2;
                                                        int var56 = var54 & 0x3;
                                                        int var57 = var42 + var52;
                                                        int var58 = var43 + var51;
                                                        if (var57 > 0 && var58 > 0 && var57 < 103 && var58 < 103) {
                                                            int var59 = var53;
                                                            if ((class6.field85[1][var57][var58] & 0x2) == 2) {
                                                                var59 = var53 - 1;
                                                            }
                                                            class198 var60 = null;
                                                            if (var59 >= 0) {
                                                                var60 = var45[var59];
                                                            }
                                                            class6.method470(var53, var57, var58, var47, var56, var55, var44, var60);
                                                        }
                                                    }
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                    int var23 = (Statics.field1340[var22] >> 8) * 64 - Statics.field1791;
                                    int var24 = (Statics.field1340[var22] & 0xFF) * 64 - Statics.field1002;
                                    byte[] var25 = Statics.field1896[var22];
                                    if (var25 != null) {
                                        method1783();
                                        int var26 = Statics.field519 * 8 - 48;
                                        int var27 = Statics.field1495 * 8 - 48;
                                        class198[] var28 = field373;
                                        int var29 = 0;
                                        label3257: while (true) {
                                            if (var29 >= 4) {
                                                class107 var32 = new class107(var25);
                                                int var33 = 0;
                                                while (true) {
                                                    if (var33 >= 4) {
                                                        break label3257;
                                                    }
                                                    for (int var34 = 0; var34 < 64; var34++) {
                                                        for (int var35 = 0; var35 < 64; var35++) {
                                                            class6.method824(var32, var33, var23 + var34, var24 + var35, var26, var27, 0);
                                                        }
                                                    }
                                                    var33++;
                                                }
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    if (var23 + var30 > 0 && var23 + var30 < 103 && var24 + var31 > 0 && var24 + var31 < 103) {
                                                        var28[var29].field2956[var23 + var30][var24 + var31] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    var22++;
                                }
                            }
                            if (field269) {
                                int var61 = 0;
                                label3193: while (true) {
                                    if (var61 >= 4) {
                                        for (int var93 = 0; var93 < 13; var93++) {
                                            for (int var94 = 0; var94 < 13; var94++) {
                                                int var95 = field356[0][var93][var94];
                                                if (var95 == -1) {
                                                    class6.method81(var93 * 8, var94 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2089(true);
                                        int var96 = 0;
                                        while (true) {
                                            if (var96 >= 4) {
                                                break label3193;
                                            }
                                            method1783();
                                            for (int var97 = 0; var97 < 13; var97++) {
                                                label3116: for (int var98 = 0; var98 < 13; var98++) {
                                                    int var99 = field356[var96][var97][var98];
                                                    if (var99 != -1) {
                                                        int var100 = var99 >> 24 & 0x3;
                                                        int var101 = var99 >> 1 & 0x3;
                                                        int var102 = var99 >> 14 & 0x3FF;
                                                        int var103 = var99 >> 3 & 0x7FF;
                                                        int var104 = (var102 / 8 << 8) + var103 / 8;
                                                        for (int var105 = 0; var105 < Statics.field1340.length; var105++) {
                                                            if (Statics.field1340[var105] == var104 && Statics.field195[var105] != null) {
                                                                byte[] var106 = Statics.field195[var105];
                                                                int var107 = var97 * 8;
                                                                int var108 = var98 * 8;
                                                                int var109 = (var102 & 0x7) * 8;
                                                                int var110 = (var103 & 0x7) * 8;
                                                                class79 var111 = Statics.field997;
                                                                class198[] var112 = field373;
                                                                class107 var113 = new class107(var106);
                                                                int var114 = -1;
                                                                while (true) {
                                                                    int var115 = var113.method2131();
                                                                    if (var115 == 0) {
                                                                        continue label3116;
                                                                    }
                                                                    var114 += var115;
                                                                    int var116 = 0;
                                                                    while (true) {
                                                                        int var117 = var113.method2131();
                                                                        if (var117 == 0) {
                                                                            break;
                                                                        }
                                                                        var116 += var117 - 1;
                                                                        int var118 = var116 & 0x3F;
                                                                        int var119 = var116 >> 6 & 0x3F;
                                                                        int var120 = var116 >> 12;
                                                                        int var121 = var113.method2148();
                                                                        int var122 = var121 >> 2;
                                                                        int var123 = var121 & 0x3;
                                                                        if (var100 == var120 && var119 >= var109 && var119 < var109 + 8 && var118 >= var110 && var118 < var110 + 8) {
                                                                            class36 var124 = class36.method2071(var114);
                                                                            int var125 = var107 + Statics.method2400(var119 & 0x7, var118 & 0x7, var101, var124.field855, var124.field860, var123);
                                                                            int var126 = var108 + class156.method502(var119 & 0x7, var118 & 0x7, var101, var124.field855, var124.field860, var123);
                                                                            if (var125 > 0 && var126 > 0 && var125 < 103 && var126 < 103) {
                                                                                int var127 = var96;
                                                                                if ((class6.field85[1][var125][var126] & 0x2) == 2) {
                                                                                    var127 = var96 - 1;
                                                                                }
                                                                                class198 var128 = null;
                                                                                if (var127 >= 0) {
                                                                                    var128 = var112[var127];
                                                                                }
                                                                                class6.method470(var96, var125, var126, var114, var101 + var123 & 0x3, var122, var111, var128);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var96++;
                                        }
                                    }
                                    method1783();
                                    for (int var62 = 0; var62 < 13; var62++) {
                                        for (int var63 = 0; var63 < 13; var63++) {
                                            boolean var64 = false;
                                            int var65 = field356[var61][var62][var63];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field1340.length; var71++) {
                                                    if (Statics.field1340[var71] == var70 && Statics.field1896[var71] != null) {
                                                        byte[] var72 = Statics.field1896[var71];
                                                        int var73 = var62 * 8;
                                                        int var74 = var63 * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        class198[] var77 = field373;
                                                        for (int var78 = 0; var78 < 8; var78++) {
                                                            for (int var79 = 0; var79 < 8; var79++) {
                                                                if (var73 + var78 > 0 && var73 + var78 < 103 && var74 + var79 > 0 && var74 + var79 < 103) {
                                                                    var77[var61].field2956[var73 + var78][var74 + var79] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class107 var80 = new class107(var72);
                                                        for (int var81 = 0; var81 < 4; var81++) {
                                                            for (int var82 = 0; var82 < 64; var82++) {
                                                                for (int var83 = 0; var83 < 64; var83++) {
                                                                    if (var66 == var81 && var82 >= var75 && var82 < var75 + 8 && var83 >= var76 && var83 < var76 + 8) {
                                                                        int var86 = var73 + class156.method2632(var82 & 0x7, var83 & 0x7, var67);
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
                                                                        class6.method824(var80, var61, var86, var74 + var92, 0, 0, var67);
                                                                    } else {
                                                                        class6.method824(var80, 0, -1, -1, 0, 0, 0);
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
                                                class6.method160(var61, var62 * 8, var63 * 8);
                                            }
                                        }
                                    }
                                    var61++;
                                }
                            }
                            method2089(true);
                            method159();
                            method1783();
                            class6.method1322(Statics.field997, field373);
                            method2089(true);
                            int var129 = class6.field86;
                            if (var129 > Statics.field83) {
                                var129 = Statics.field83;
                            }
                            if (var129 < Statics.field83 - 1) {
                                int var130 = Statics.field83 - 1;
                            }
                            if (field262) {
                                Statics.field997.method1732(class6.field86);
                            } else {
                                Statics.field997.method1732(0);
                            }
                            for (int var131 = 0; var131 < 104; var131++) {
                                for (int var132 = 0; var132 < 104; var132++) {
                                    method89(var131, var132);
                                }
                            }
                            method1783();
                            method2751();
                            class36.field843.method3124();
                            if (Statics.field648 != null) {
                                field301.method2355(186);
                                field301.method2127(1057001181);
                            }
                            if (!field269) {
                                int var133 = (Statics.field519 - 6) / 8;
                                int var134 = (Statics.field519 + 6) / 8;
                                int var135 = (Statics.field1495 - 6) / 8;
                                int var136 = (Statics.field1495 + 6) / 8;
                                for (int var137 = var133 - 1; var137 <= var134 + 1; var137++) {
                                    for (int var138 = var135 - 1; var138 <= var136 + 1; var138++) {
                                        if (var137 < var133 || var137 > var134 || var138 < var135 || var138 > var136) {
                                            Statics.field1337.method2710("m" + var137 + "_" + var138);
                                            Statics.field1337.method2710("l" + var137 + "_" + var138);
                                        }
                                    }
                                }
                            }
                            Statics.method26(30);
                            method1783();
                            Statics.field87 = (byte[][][]) null;
                            Statics.field2477 = (byte[][][]) null;
                            Statics.field2128 = (byte[][][]) null;
                            Statics.field2969 = (byte[][][]) null;
                            Statics.field725 = (int[][][]) null;
                            Statics.field99 = (byte[][][]) null;
                            Statics.field978 = (int[][]) null;
                            Statics.field1507 = null;
                            Statics.field1508 = null;
                            Statics.field1503 = null;
                            Statics.field1877 = null;
                            Statics.field994 = null;
                            field301.method2355(22);
                            class131.method511();
                        } else {
                            field318 = 2;
                        }
                    } else {
                        field318 = 1;
                    }
                }
                if (field265 == 30) {
                    if (field274 > 1) {
                        field274--;
                    }
                    if (field308 > 0) {
                        field308--;
                    }
                    if (field312) {
                        field312 = false;
                        method136();
                    } else {
                        if (!field403) {
                            field407[0] = class143.field2377;
                            field273[0] = "";
                            field405[0] = 1006;
                            field402 = 1;
                        }
                        for (int var139 = 0; var139 < 100; var139++) {
                            boolean var140;
                            if (Statics.field2655 == null) {
                                var140 = false;
                            } else {
                                label3510: {
                                    try {
                                        int var141 = Statics.field2655.method2550();
                                        if (var141 == 0) {
                                            var140 = false;
                                            break label3510;
                                        }
                                        if (field305 == -1) {
                                            Statics.field2655.method2551(field303.field1829, 0, 1);
                                            field303.field1826 = 0;
                                            field305 = field303.method2347();
                                            field304 = class167.field2805[field305];
                                            var141--;
                                        }
                                        if (field304 == -1) {
                                            if (var141 <= 0) {
                                                var140 = false;
                                                break label3510;
                                            }
                                            Statics.field2655.method2551(field303.field1829, 0, 1);
                                            field304 = field303.field1829[0] & 0xFF;
                                            var141--;
                                        }
                                        if (field304 == -2) {
                                            if (var141 <= 1) {
                                                var140 = false;
                                                break label3510;
                                            }
                                            Statics.field2655.method2551(field303.field1829, 0, 2);
                                            field303.field1826 = 0;
                                            field304 = field303.method2140();
                                            var141 -= 2;
                                        }
                                        if (var141 < field304) {
                                            var140 = false;
                                            break label3510;
                                        }
                                        field303.field1826 = 0;
                                        Statics.field2655.method2551(field303.field1829, 0, field304);
                                        field306 = 0;
                                        field362 = field364;
                                        field364 = field309;
                                        field309 = field305;
                                        if (field305 == 142) {
                                            for (int var142 = 0; var142 < field521.length; var142++) {
                                                if (field521[var142] != null) {
                                                    field521[var142].field762 = -1;
                                                }
                                            }
                                            for (int var143 = 0; var143 < field298.length; var143++) {
                                                if (field298[var143] != null) {
                                                    field298[var143].field762 = -1;
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 170) {
                                            method1984();
                                            field436 = field303.method2141();
                                            field389 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 82) {
                                            field303.field1826 += 28;
                                            if (field303.method2158()) {
                                                class110 var144 = field303;
                                                int var145 = field303.field1826 - 28;
                                                if (class136.field2072 != null) {
                                                    try {
                                                        class136.field2072.method3403(0L);
                                                        class136.field2072.method3408(var144.field1829, var145, 24);
                                                    } catch (Exception var560) {
                                                    }
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 74) {
                                            Statics.field1484 = field303.method2166();
                                            Statics.field211 = field303.method2148();
                                            for (int var147 = Statics.field1484; var147 < Statics.field1484 + 8; var147++) {
                                                for (int var148 = Statics.field211; var148 < Statics.field211 + 8; var148++) {
                                                    if (field393[Statics.field83][var147][var148] != null) {
                                                        field393[Statics.field83][var147][var148] = null;
                                                        method89(var147, var148);
                                                    }
                                                }
                                            }
                                            for (class15 var149 = (class15) field394.method3179(); var149 != null; var149 = (class15) field394.method3199()) {
                                                if (var149.field217 >= Statics.field1484 && var149.field217 < Statics.field1484 + 8 && var149.field220 >= Statics.field211 && var149.field220 < Statics.field211 + 8 && Statics.field83 == var149.field218) {
                                                    var149.field221 = 0;
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 73) {
                                            Statics.field211 = field303.method2164();
                                            Statics.field1484 = field303.method2164();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 69) {
                                            String var150 = field303.method2182();
                                            long var151 = (long) field303.method2140();
                                            long var153 = (long) field303.method2142();
                                            class138 var155 = (class138) class99.method519(class138.method1607(), field303.method2148());
                                            long var156 = (var151 << 32) + var153;
                                            boolean var158 = false;
                                            for (int var159 = 0; var159 < 100; var159++) {
                                                if (field451[var159] == var156) {
                                                    var158 = true;
                                                    break;
                                                }
                                            }
                                            if (method699(var150)) {
                                                var158 = true;
                                            }
                                            if (!var158 && field382 == 0) {
                                                field451[field477] = var156;
                                                field477 = (field477 + 1) % 100;
                                                class110 var160 = field303;
                                                String var164;
                                                try {
                                                    int var161 = var160.method2131();
                                                    if (var161 > 32767) {
                                                        var161 = 32767;
                                                    }
                                                    byte[] var162 = new byte[var161];
                                                    var160.field1826 += Statics.field2909.method2072(var160.field1829, var160.field1826, var162, 0, var161);
                                                    String var163 = Statics.method2397(var162, 0, var161);
                                                    var164 = var163;
                                                } catch (Exception var559) {
                                                    var164 = "Cabbage";
                                                }
                                                String var167 = class193.method3303(class200.method2659(var164));
                                                byte var168;
                                                if (var155.field2099) {
                                                    var168 = 7;
                                                } else {
                                                    var168 = 3;
                                                }
                                                if (var155.field2098 == -1) {
                                                    class10.method2769(var168, var150, var167);
                                                } else {
                                                    int var170 = var155.field2098;
                                                    String var171 = "<img=" + var170 + ">";
                                                    class10.method2769(var168, var171 + var150, var167);
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 50) {
                                            field503 = false;
                                            for (int var172 = 0; var172 < 5; var172++) {
                                                field504[var172] = false;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 38) {
                                            int var173 = field303.method2179();
                                            int var174 = field303.method2151();
                                            int var175 = var174 >> 10 & 0x1F;
                                            int var176 = var174 >> 5 & 0x1F;
                                            int var177 = var174 & 0x1F;
                                            int var178 = (var177 << 3) + (var175 << 19) + (var176 << 11);
                                            class153 var179 = class153.method1974(var173);
                                            if (var179.field2603 != var178) {
                                                var179.field2603 = var178;
                                                method2750(var179);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 164) {
                                            field503 = true;
                                            Statics.field75 = field303.method2148();
                                            Statics.field203 = field303.method2148();
                                            Statics.field1790 = field303.method2140();
                                            Statics.field2845 = field303.method2148();
                                            Statics.field1415 = field303.method2148();
                                            if (Statics.field1415 >= 100) {
                                                int var180 = Statics.field75 * 128 + 64;
                                                int var181 = Statics.field203 * 128 + 64;
                                                int var182 = method1782(var180, var181, Statics.field83) - Statics.field1790;
                                                int var183 = var180 - Statics.field1878;
                                                int var184 = var182 - Statics.field1247;
                                                int var185 = var181 - Statics.field758;
                                                int var186 = (int) Math.sqrt((double) (var183 * var183 + var185 * var185));
                                                Statics.field703 = (int) (Math.atan2((double) var184, (double) var186) * 325.949D) & 0x7FF;
                                                Statics.field105 = (int) (Math.atan2((double) var183, (double) var185) * -325.949D) & 0x7FF;
                                                if (Statics.field703 < 128) {
                                                    Statics.field703 = 128;
                                                }
                                                if (Statics.field703 > 383) {
                                                    Statics.field703 = 383;
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 217) {
                                            int var187 = field304 + field303.field1826;
                                            int var188 = field303.method2140();
                                            int var189 = field303.method2140();
                                            if (field420 != var188) {
                                                field420 = var188;
                                                method11(field420);
                                                class32.method539(field420);
                                                for (int var190 = 0; var190 < 100; var190++) {
                                                    field482[var190] = true;
                                                }
                                            }
                                            while (var189-- > 0) {
                                                int var191 = field303.method2183();
                                                int var192 = field303.method2140();
                                                int var193 = field303.method2148();
                                                class4 var194 = (class4) field351.method3149((long) var191);
                                                if (var194 != null && var194.field68 != var192) {
                                                    method589(var194, true);
                                                    var194 = null;
                                                }
                                                if (var194 == null) {
                                                    class4 var195 = new class4();
                                                    var195.field68 = var192;
                                                    var195.field70 = var193;
                                                    field351.method3156(var195, (long) var191);
                                                    method11(var192);
                                                    class32.method539(var192);
                                                    class153 var196 = class153.method1974(var191);
                                                    if (var196 != null) {
                                                        method2750(var196);
                                                    }
                                                    if (field424 != null) {
                                                        method2750(field424);
                                                        field424 = null;
                                                    }
                                                    method116();
                                                    if (field420 != -1) {
                                                        int var197 = field420;
                                                        if (class153.method2384(var197)) {
                                                            Statics.method96(Statics.field2545[var197], 1);
                                                        }
                                                    }
                                                    var194 = var195;
                                                }
                                                var194.field69 = true;
                                            }
                                            for (class4 var199 = (class4) field351.method3153(); var199 != null; var199 = (class4) field351.method3151()) {
                                                if (var199.field69) {
                                                    var199.field69 = false;
                                                } else {
                                                    method589(var199, true);
                                                }
                                            }
                                            field461 = new class175(512);
                                            while (field303.field1826 < var187) {
                                                int var200 = field303.method2183();
                                                int var201 = field303.method2140();
                                                int var202 = field303.method2140();
                                                int var203 = field303.method2183();
                                                for (int var204 = var201; var204 <= var202; var204++) {
                                                    long var205 = ((long) var200 << 32) + (long) var204;
                                                    field461.method3156(new class180(var203), var205);
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 199) {
                                            field302 = 1;
                                            field452 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 124) {
                                            Statics.field1484 = field303.method2295();
                                            Statics.field211 = field303.method2164();
                                            while (field303.field1826 < field304) {
                                                field305 = field303.method2148();
                                                method111();
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 90) {
                                            int var207 = field303.method2178();
                                            boolean var208 = field303.method2148() == 1;
                                            class153 var209 = class153.method1974(var207);
                                            if (var209.field2544 != var208) {
                                                var209.field2544 = var208;
                                                method2750(var209);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 61) {
                                            int var210 = field303.method2172();
                                            if (var210 == 65535) {
                                                var210 = -1;
                                            }
                                            int var211 = field303.method2183();
                                            int var212 = field303.method2178();
                                            int var213 = field303.method2140();
                                            if (var213 == 65535) {
                                                var213 = -1;
                                            }
                                            for (int var214 = var213; var214 <= var210; var214++) {
                                                long var215 = ((long) var211 << 32) + (long) var214;
                                                class187 var217 = field461.method3149(var215);
                                                if (var217 != null) {
                                                    var217.method3277();
                                                }
                                                field461.method3156(new class180(var212), var215);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 13) {
                                            int var218 = field303.method2178();
                                            int var219 = field303.method2236();
                                            class153 var220 = class153.method1974(var218);
                                            if (var220.field2564 != 1 || var220.field2563 != var219) {
                                                var220.field2564 = 1;
                                                var220.field2563 = var219;
                                                method2750(var220);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 2) {
                                            method1881();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 19) {
                                            if (field420 != -1) {
                                                int var221 = field420;
                                                if (class153.method2384(var221)) {
                                                    Statics.method96(Statics.field2545[var221], 0);
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 64) {
                                            field503 = true;
                                            Statics.field251 = field303.method2148();
                                            Statics.field18 = field303.method2148();
                                            Statics.field530 = field303.method2140();
                                            Statics.field1477 = field303.method2148();
                                            Statics.field177 = field303.method2148();
                                            if (Statics.field177 >= 100) {
                                                Statics.field1878 = Statics.field251 * 128 + 64;
                                                Statics.field758 = Statics.field18 * 128 + 64;
                                                Statics.field1247 = method1782(Statics.field1878, Statics.field758, Statics.field83) - Statics.field530;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 111) {
                                            int var222 = field303.method2183();
                                            int var223 = field303.method2140();
                                            if (var222 < -70000) {
                                                var223 += 32768;
                                            }
                                            class153 var224;
                                            if (var222 >= 0) {
                                                var224 = class153.method1974(var222);
                                            } else {
                                                var224 = null;
                                            }
                                            while (field303.field1826 < field304) {
                                                int var225 = field303.method2131();
                                                int var226 = field303.method2140();
                                                int var227 = 0;
                                                if (var226 != 0) {
                                                    var227 = field303.method2148();
                                                    if (var227 == 255) {
                                                        var227 = field303.method2183();
                                                    }
                                                }
                                                if (var224 != null && var225 >= 0 && var225 < var224.field2565.length) {
                                                    var224.field2565[var225] = var226;
                                                    var224.field2635[var225] = var227;
                                                }
                                                class14.method97(var223, var225, var226 - 1, var227);
                                            }
                                            if (var224 != null) {
                                                method2750(var224);
                                            }
                                            method1984();
                                            field447[++field448 - 1 & 0x1F] = var223 & 0x7FFF;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 194) {
                                            String var228 = field303.method2182();
                                            long var229 = field303.method2173();
                                            long var231 = (long) field303.method2140();
                                            long var233 = (long) field303.method2142();
                                            class138 var235 = (class138) class99.method519(class138.method1607(), field303.method2148());
                                            long var236 = (var231 << 32) + var233;
                                            boolean var238 = false;
                                            for (int var239 = 0; var239 < 100; var239++) {
                                                if (field451[var239] == var236) {
                                                    var238 = true;
                                                    break;
                                                }
                                            }
                                            if (var235.field2100 && method699(var228)) {
                                                var238 = true;
                                            }
                                            if (!var238 && field382 == 0) {
                                                field451[field477] = var236;
                                                field477 = (field477 + 1) % 100;
                                                String var240 = class193.method3303(class200.method2659(class192.method1981(field303)));
                                                if (var235.field2098 == -1) {
                                                    Statics.method590(9, var228, var240, class199.method2854(var229));
                                                } else {
                                                    int var241 = var235.field2098;
                                                    String var242 = "<img=" + var241 + ">";
                                                    Statics.method590(9, var242 + var228, var240, class199.method2854(var229));
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 186) {
                                            int var243 = field303.method2148();
                                            int var244 = field303.method2148();
                                            int var245 = field303.method2148();
                                            int var246 = field303.method2148();
                                            field504[var243] = true;
                                            field505[var243] = var244;
                                            field506[var243] = var245;
                                            field353[var243] = var246;
                                            field508[var243] = 0;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 231) {
                                            field274 = field303.method2172() * 30;
                                            field389 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 172) {
                                            int var247 = field303.method2183();
                                            Statics.field278 = Statics.field1932.method2459(var247);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 185) {
                                            int var248 = field303.method2131();
                                            boolean var249 = field303.method2148() == 1;
                                            String var250 = "";
                                            boolean var251 = false;
                                            if (var249) {
                                                var250 = field303.method2182();
                                                if (method699(var250)) {
                                                    var251 = true;
                                                }
                                            }
                                            String var252 = field303.method2182();
                                            if (!var251) {
                                                class10.method2769(var248, var250, var252);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 47) {
                                            int var253 = field303.method2140();
                                            if (var253 == 65535) {
                                                var253 = -1;
                                            }
                                            if (var253 == -1 && !field288) {
                                                class162.method2782();
                                            } else if (var253 != -1 && field493 != var253 && field418 != 0 && !field288) {
                                                class162.method1606(2, Statics.field154, var253, 0, field418, false);
                                            }
                                            field493 = var253;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 225) {
                                            int var254 = field303.method2151();
                                            if (var254 == 65535) {
                                                var254 = -1;
                                            }
                                            int var255 = field303.method2142();
                                            method145(var254, var255);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 33) {
                                            while (field303.field1826 < field304) {
                                                boolean var256 = field303.method2148() == 1;
                                                String var257 = field303.method2182();
                                                String var258 = field303.method2182();
                                                int var259 = field303.method2140();
                                                int var260 = field303.method2148();
                                                int var261 = field303.method2148();
                                                boolean var262 = (var261 & 0x2) != 0;
                                                boolean var263 = (var261 & 0x1) != 0;
                                                if (var259 > 0) {
                                                    field303.method2182();
                                                    field303.method2148();
                                                    field303.method2183();
                                                }
                                                field303.method2182();
                                                for (int var264 = 0; var264 < field509; var264++) {
                                                    class16 var265 = field511[var264];
                                                    if (var256) {
                                                        if (var258.equals(var265.field232)) {
                                                            var265.field232 = var257;
                                                            var265.field236 = var258;
                                                            var257 = null;
                                                            break;
                                                        }
                                                    } else if (var257.equals(var265.field232)) {
                                                        if (var265.field233 != var259) {
                                                            boolean var266 = true;
                                                            for (class34 var267 = (class34) field275.method3141(); var267 != null; var267 = (class34) field275.method3144()) {
                                                                if (var267.field793.equals(var257)) {
                                                                    if (var259 != 0 && var267.field791 == 0) {
                                                                        var267.method3272();
                                                                        var266 = false;
                                                                    } else if (var259 == 0 && var267.field791 != 0) {
                                                                        var267.method3272();
                                                                        var266 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var266) {
                                                                field275.method3140(new class34(var257, var259));
                                                            }
                                                            var265.field233 = var259;
                                                        }
                                                        var265.field236 = var258;
                                                        var265.field234 = var260;
                                                        var265.field241 = var262;
                                                        var265.field239 = var263;
                                                        var257 = null;
                                                        break;
                                                    }
                                                }
                                                if (var257 != null && field509 < 400) {
                                                    class16 var268 = new class16();
                                                    field511[field509] = var268;
                                                    var268.field232 = var257;
                                                    var268.field236 = var258;
                                                    var268.field233 = var259;
                                                    var268.field234 = var260;
                                                    var268.field241 = var262;
                                                    var268.field239 = var263;
                                                    field509++;
                                                }
                                            }
                                            field302 = 2;
                                            field452 = field444;
                                            boolean var269 = false;
                                            int var270 = field509;
                                            while (var270 > 0) {
                                                boolean var271 = true;
                                                var270--;
                                                for (int var272 = 0; var272 < var270; var272++) {
                                                    boolean var273 = false;
                                                    class16 var274 = field511[var272];
                                                    class16 var275 = field511[var272 + 1];
                                                    if (field257 != var274.field233 && field257 == var275.field233) {
                                                        var273 = true;
                                                    }
                                                    if (!var273 && var274.field233 == 0 && var275.field233 != 0) {
                                                        var273 = true;
                                                    }
                                                    if (!var273 && !var274.field241 && var275.field241) {
                                                        var273 = true;
                                                    }
                                                    if (!var273 && !var274.field239 && var275.field239) {
                                                        var273 = true;
                                                    }
                                                    if (var273) {
                                                        class16 var276 = field511[var272];
                                                        field511[var272] = field511[var272 + 1];
                                                        field511[var272 + 1] = var276;
                                                        var271 = false;
                                                    }
                                                }
                                                if (var271) {
                                                    break;
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 54) {
                                            int var277 = field303.method2183();
                                            int var278 = field303.method2140();
                                            if (var277 < -70000) {
                                                var278 += 32768;
                                            }
                                            class153 var279;
                                            if (var277 >= 0) {
                                                var279 = class153.method1974(var277);
                                            } else {
                                                var279 = null;
                                            }
                                            if (var279 != null) {
                                                for (int var280 = 0; var280 < var279.field2565.length; var280++) {
                                                    var279.field2565[var280] = 0;
                                                    var279.field2635[var280] = 0;
                                                }
                                            }
                                            class14.method33(var278);
                                            int var281 = field303.method2140();
                                            for (int var282 = 0; var282 < var281; var282++) {
                                                int var283 = field303.method2172();
                                                int var284 = field303.method2148();
                                                if (var284 == 255) {
                                                    var284 = field303.method2183();
                                                }
                                                if (var279 != null && var282 < var279.field2565.length) {
                                                    var279.field2565[var282] = var283;
                                                    var279.field2635[var282] = var284;
                                                }
                                                class14.method97(var278, var282, var283 - 1, var284);
                                            }
                                            if (var279 != null) {
                                                method2750(var279);
                                            }
                                            method1984();
                                            field447[++field448 - 1 & 0x1F] = var278 & 0x7FFF;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 79) {
                                            int var285 = field303.method2164();
                                            String var286 = field303.method2182();
                                            int var287 = field303.method2295();
                                            if (var287 >= 1 && var287 <= 8) {
                                                if (var286.equalsIgnoreCase("null")) {
                                                    var286 = null;
                                                }
                                                field350[var287 - 1] = var286;
                                                field390[var287 - 1] = var285 == 0;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 246) {
                                            for (int var288 = 0; var288 < class155.field2663.length; var288++) {
                                                if (class155.field2664[var288] != class155.field2663[var288]) {
                                                    class155.field2663[var288] = class155.field2664[var288];
                                                    method29(var288);
                                                    field445[++field446 - 1 & 0x1F] = var288;
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 135) {
                                            String var289 = field303.method2182();
                                            int var290 = field303.method2302();
                                            class153 var291 = class153.method1974(var290);
                                            if (!var289.equals(var291.field2579)) {
                                                var291.field2579 = var289;
                                                method2750(var291);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 175) {
                                            int var292 = field303.method2179();
                                            class153 var293 = class153.method1974(var292);
                                            for (int var294 = 0; var294 < var293.field2565.length; var294++) {
                                                var293.field2565[var294] = -1;
                                                var293.field2565[var294] = 0;
                                            }
                                            method2750(var293);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 205) {
                                            String var295 = field303.method2182();
                                            Object[] var296 = new Object[var295.length() + 1];
                                            for (int var297 = var295.length() - 1; var297 >= 0; var297--) {
                                                if (var295.charAt(var297) == 's') {
                                                    var296[var297 + 1] = field303.method2182();
                                                } else {
                                                    var296[var297 + 1] = Integer.valueOf(field303.method2183());
                                                }
                                            }
                                            var296[0] = Integer.valueOf(field303.method2183());
                                            class1 var298 = new class1();
                                            var298.field12 = var296;
                                            class32.method2843(var298, 200000);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 230) {
                                            int var299 = field303.method2179();
                                            int var300 = field303.method2172();
                                            int var301 = field303.method2151();
                                            class153 var302 = class153.method1974(var299);
                                            var302.field2576 = (var301 << 16) + var300;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 22) {
                                            field489 = field303.method2148();
                                            if (field489 == 255) {
                                                field489 = 0;
                                            }
                                            field490 = field303.method2148();
                                            if (field490 == 255) {
                                                field490 = 0;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 146) {
                                            int var303 = field303.method2141();
                                            int var304 = field303.method2186();
                                            int var305 = field303.method2302();
                                            class153 var306 = class153.method1974(var305);
                                            int var307 = var306.field2539 + var303;
                                            int var308 = var306.field2540 + var304;
                                            if (var306.field2537 != var307 || var306.field2538 != var308) {
                                                var306.field2537 = var307;
                                                var306.field2538 = var308;
                                                method2750(var306);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 29) {
                                            int var309 = field303.method2183();
                                            class4 var310 = (class4) field351.method3149((long) var309);
                                            if (var310 != null) {
                                                method589(var310, true);
                                            }
                                            if (field424 != null) {
                                                method2750(field424);
                                                field424 = null;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 168) {
                                            int var311 = field303.method2179();
                                            int var312 = field303.method2140();
                                            class153 var313 = class153.method1974(var311);
                                            if (var313 != null && var313.field2534 == 0) {
                                                if (var312 > var313.field2548 - var313.field2542) {
                                                    var312 = var313.field2548 - var313.field2542;
                                                }
                                                if (var312 < 0) {
                                                    var312 = 0;
                                                }
                                                if (var313.field2536 != var312) {
                                                    var313.field2536 = var312;
                                                    method2750(var313);
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 93) {
                                            int var314 = field303.method2151();
                                            int var315 = field303.method2183();
                                            int var316 = field303.method2172();
                                            int var317 = field303.method2140();
                                            class153 var318 = class153.method1974(var315);
                                            if (var318.field2546 != var314 || var318.field2573 != var316 || var318.field2572 != var317) {
                                                var318.field2546 = var314;
                                                var318.field2573 = var316;
                                                var318.field2572 = var317;
                                                method2750(var318);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 32) {
                                            String var319 = field303.method2182();
                                            class110 var320 = field303;
                                            String var324;
                                            try {
                                                int var321 = var320.method2131();
                                                if (var321 > 32767) {
                                                    var321 = 32767;
                                                }
                                                byte[] var322 = new byte[var321];
                                                var320.field1826 += Statics.field2909.method2072(var320.field1829, var320.field1826, var322, 0, var321);
                                                String var323 = Statics.method2397(var322, 0, var321);
                                                var324 = var323;
                                            } catch (Exception var558) {
                                                var324 = "Cabbage";
                                            }
                                            String var327 = class193.method3303(class200.method2659(var324));
                                            class10.method2769(6, var319, var327);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 86) {
                                            int var328 = field303.method2302();
                                            int var329 = field303.method2151();
                                            if (var329 == 65535) {
                                                var329 = -1;
                                            }
                                            int var330 = field303.method2183();
                                            class153 var331 = class153.method1974(var330);
                                            if (var331.field2531) {
                                                var331.field2636 = var329;
                                                var331.field2597 = var328;
                                                class45 var333 = class45.method1982(var329);
                                                var331.field2546 = var333.field1020;
                                                var331.field2573 = var333.field1021;
                                                var331.field2580 = var333.field1022;
                                                var331.field2570 = var333.field1023;
                                                var331.field2522 = var333.field1006;
                                                var331.field2572 = var333.field1019;
                                                if (var331.field2541 > 0) {
                                                    var331.field2572 = var331.field2572 * 32 / var331.field2541;
                                                }
                                                method2750(var331);
                                            } else {
                                                if (var329 == -1) {
                                                    var331.field2564 = 0;
                                                    field305 = -1;
                                                    var140 = true;
                                                    break label3510;
                                                }
                                                class45 var332 = class45.method1982(var329);
                                                var331.field2564 = 4;
                                                var331.field2563 = var329;
                                                var331.field2546 = var332.field1020;
                                                var331.field2573 = var332.field1021;
                                                var331.field2572 = var332.field1019 * 100 / var328;
                                                method2750(var331);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 91) {
                                            method518();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 131) {
                                            int var334 = field303.method2172();
                                            int var335 = field303.method2302();
                                            class155.field2664[var334] = var335;
                                            if (class155.field2663[var334] != var335) {
                                                class155.field2663[var334] = var335;
                                                method29(var334);
                                            }
                                            field445[++field446 - 1 & 0x1F] = var334;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 20) {
                                            method509();
                                            field305 = -1;
                                            var140 = false;
                                            break label3510;
                                        }
                                        if (field305 == 157) {
                                            int var336 = field303.method2295();
                                            int var337 = field303.method2178();
                                            int var338 = field303.method2172();
                                            class4 var339 = (class4) field351.method3149((long) var337);
                                            if (var339 != null) {
                                                method589(var339, var339.field68 != var338);
                                            }
                                            class4 var340 = new class4();
                                            var340.field68 = var338;
                                            var340.field70 = var336;
                                            field351.method3156(var340, (long) var337);
                                            method11(var338);
                                            class32.method539(var338);
                                            class153 var341 = class153.method1974(var337);
                                            if (var341 != null) {
                                                method2750(var341);
                                            }
                                            if (field424 != null) {
                                                method2750(field424);
                                                field424 = null;
                                            }
                                            method116();
                                            if (field420 != -1) {
                                                int var342 = field420;
                                                if (class153.method2384(var342)) {
                                                    Statics.method96(Statics.field2545[var342], 1);
                                                }
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 143) {
                                            class22 var343 = new class22();
                                            var343.field590 = field303.method2182();
                                            var343.field594 = field303.method2140();
                                            int var344 = field303.method2183();
                                            var343.field582 = var344;
                                            Statics.method26(45);
                                            Statics.field2655.method2548();
                                            Statics.field2655 = null;
                                            class28.method3109(var343);
                                            field305 = -1;
                                            var140 = false;
                                            break label3510;
                                        }
                                        if (field305 == 21) {
                                            int var345 = field303.method2172();
                                            byte var346 = field303.method2139();
                                            class155.field2664[var345] = var346;
                                            if (class155.field2663[var345] != var346) {
                                                class155.field2663[var345] = var346;
                                                method29(var345);
                                            }
                                            field445[++field446 - 1 & 0x1F] = var345;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 101) {
                                            method1984();
                                            field425 = field303.method2148();
                                            field389 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 114) {
                                            int var347 = field303.method2178();
                                            int var348 = field303.method2172();
                                            class153 var349 = class153.method1974(var347);
                                            if (var349.field2564 != 2 || var349.field2563 != var348) {
                                                var349.field2564 = 2;
                                                var349.field2563 = var348;
                                                method2750(var349);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 144) {
                                            Statics.field1874 = class117.method1417(field303.method2148());
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 106) {
                                            for (int var350 = 0; var350 < Statics.field1055; var350++) {
                                                class46 var351 = class46.method2544(var350);
                                                if (var351 != null) {
                                                    class155.field2664[var350] = 0;
                                                    class155.field2663[var350] = 0;
                                                }
                                            }
                                            method1984();
                                            field446 += 32;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 139) {
                                            int var352 = field303.method2295();
                                            int var353 = field303.method2148();
                                            int var354 = field303.method2148();
                                            Statics.field83 = var352 >> 1;
                                            Statics.field1751.method614(var353, var354, (var352 & 0x1) == 1);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 122) {
                                            field280 = field303.method2148();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 183) {
                                            method1984();
                                            int var355 = field303.method2166();
                                            int var356 = field303.method2178();
                                            int var357 = field303.method2166();
                                            field443[var355] = var356;
                                            field397[var355] = var357;
                                            field398[var355] = 1;
                                            for (int var358 = 0; var358 < 98; var358++) {
                                                if (var356 >= class141.field2129[var358]) {
                                                    field398[var355] = var358 + 2;
                                                }
                                            }
                                            field449[++field476 - 1 & 0x1F] = var355;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 191) {
                                            field502 = field303.method2148();
                                            field367 = field303.method2148();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 7) {
                                            int var359 = field303.method2151();
                                            class14 var360 = (class14) class14.field209.method3149((long) var359);
                                            if (var360 != null) {
                                                var360.method3277();
                                            }
                                            field447[++field448 - 1 & 0x1F] = var359 & 0x7FFF;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 241) {
                                            String var361 = field303.method2182();
                                            int var362 = field303.method2140();
                                            byte var363 = field303.method2175();
                                            boolean var364 = false;
                                            if (var363 == -128) {
                                                var364 = true;
                                            }
                                            if (var364) {
                                                if (Statics.field2090 == 0) {
                                                    field305 = -1;
                                                    var140 = true;
                                                    break label3510;
                                                }
                                                boolean var365 = false;
                                                int var366;
                                                for (var366 = 0; var366 < Statics.field2090 && (!Statics.field1794[var366].field574.equals(var361) || Statics.field1794[var366].field575 != var362); var366++) {
                                                }
                                                if (var366 < Statics.field2090) {
                                                    while (var366 < Statics.field2090 - 1) {
                                                        Statics.field1794[var366] = Statics.field1794[var366 + 1];
                                                        var366++;
                                                    }
                                                    Statics.field2090--;
                                                    Statics.field1794[Statics.field2090] = null;
                                                }
                                            } else {
                                                field303.method2182();
                                                class21 var367 = new class21();
                                                var367.field574 = var361;
                                                var367.field580 = class201.method1341(var367.field574, Statics.field153);
                                                var367.field575 = var362;
                                                var367.field576 = var363;
                                                int var368;
                                                for (var368 = Statics.field2090 - 1; var368 >= 0; var368--) {
                                                    int var369 = Statics.field1794[var368].field580.compareTo(var367.field580);
                                                    if (var369 == 0) {
                                                        Statics.field1794[var368].field575 = var362;
                                                        Statics.field1794[var368].field576 = var363;
                                                        if (var361.equals(Statics.field1751.field53)) {
                                                            Statics.field11 = var363;
                                                        }
                                                        field453 = field444;
                                                        field305 = -1;
                                                        var140 = true;
                                                        break label3510;
                                                    }
                                                    if (var369 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field2090 >= Statics.field1794.length) {
                                                    field305 = -1;
                                                    var140 = true;
                                                    break label3510;
                                                }
                                                for (int var370 = Statics.field2090 - 1; var370 > var368; var370--) {
                                                    Statics.field1794[var370 + 1] = Statics.field1794[var370];
                                                }
                                                if (Statics.field2090 == 0) {
                                                    Statics.field1794 = new class21[100];
                                                }
                                                Statics.field1794[var368 + 1] = var367;
                                                Statics.field2090++;
                                                if (var361.equals(Statics.field1751.field53)) {
                                                    Statics.field11 = var363;
                                                }
                                            }
                                            field453 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 162 || field305 == 179 || field305 == 70 || field305 == 210 || field305 == 31 || field305 == 239 || field305 == 84 || field305 == 158 || field305 == 211 || field305 == 245) {
                                            method111();
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 63) {
                                            method843(false);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 10) {
                                            field453 = field444;
                                            if (field304 == 0) {
                                                field494 = null;
                                                field483 = null;
                                                Statics.field2090 = 0;
                                                Statics.field1794 = null;
                                                field305 = -1;
                                                var140 = true;
                                                break label3510;
                                            }
                                            field483 = field303.method2182();
                                            long var371 = field303.method2173();
                                            long var373 = var371;
                                            String var375;
                                            if (var371 <= 0L || var371 >= 6582952005840035281L) {
                                                var375 = null;
                                            } else if (var371 % 37L == 0L) {
                                                var375 = null;
                                            } else {
                                                int var376 = 0;
                                                for (long var377 = var371; var377 != 0L; var377 /= 37L) {
                                                    var376++;
                                                }
                                                StringBuilder var379 = new StringBuilder(var376);
                                                while (var373 != 0L) {
                                                    long var380 = var373;
                                                    var373 /= 37L;
                                                    var379.append(class199.field2970[(int) (var380 - var373 * 37L)]);
                                                }
                                                var375 = var379.reverse().toString();
                                            }
                                            field494 = var375;
                                            Statics.field1976 = field303.method2175();
                                            int var382 = field303.method2148();
                                            if (var382 == 255) {
                                                field305 = -1;
                                                var140 = true;
                                                break label3510;
                                            }
                                            Statics.field2090 = var382;
                                            class21[] var383 = new class21[100];
                                            for (int var384 = 0; var384 < Statics.field2090; var384++) {
                                                var383[var384] = new class21();
                                                var383[var384].field574 = field303.method2182();
                                                var383[var384].field580 = class201.method1341(var383[var384].field574, Statics.field153);
                                                var383[var384].field575 = field303.method2140();
                                                var383[var384].field576 = field303.method2175();
                                                field303.method2182();
                                                if (var383[var384].field574.equals(Statics.field1751.field53)) {
                                                    Statics.field11 = var383[var384].field576;
                                                }
                                            }
                                            boolean var385 = false;
                                            int var386 = Statics.field2090;
                                            while (var386 > 0) {
                                                boolean var387 = true;
                                                var386--;
                                                for (int var388 = 0; var388 < var386; var388++) {
                                                    if (var383[var388].field580.compareTo(var383[var388 + 1].field580) > 0) {
                                                        class21 var389 = var383[var388];
                                                        var383[var388] = var383[var388 + 1];
                                                        var383[var388 + 1] = var389;
                                                        var387 = false;
                                                    }
                                                }
                                                if (var387) {
                                                    break;
                                                }
                                            }
                                            Statics.field1794 = var383;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 88) {
                                            class110 var390 = field303;
                                            int var391 = field304;
                                            class189 var392 = new class189();
                                            var392.field2890 = var390.method2148();
                                            var392.field2891 = var390.method2183();
                                            var392.field2889 = new int[var392.field2890];
                                            var392.field2892 = new int[var392.field2890];
                                            var392.field2893 = new Field[var392.field2890];
                                            var392.field2894 = new int[var392.field2890];
                                            var392.field2895 = new Method[var392.field2890];
                                            var392.field2896 = new byte[var392.field2890][][];
                                            for (int var393 = 0; var393 < var392.field2890; var393++) {
                                                try {
                                                    int var394 = var390.method2148();
                                                    if (var394 == 0 || var394 == 1 || var394 == 2) {
                                                        String var395 = var390.method2182();
                                                        String var396 = var390.method2182();
                                                        int var397 = 0;
                                                        if (var394 == 1) {
                                                            var397 = var390.method2183();
                                                        }
                                                        var392.field2889[var393] = var394;
                                                        var392.field2894[var393] = var397;
                                                        if (class190.method1(var395).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var392.field2893[var393] = class190.method1(var395).getDeclaredField(var396);
                                                    } else if (var394 == 3 || var394 == 4) {
                                                        String var398 = var390.method2182();
                                                        String var399 = var390.method2182();
                                                        int var400 = var390.method2148();
                                                        String[] var401 = new String[var400];
                                                        for (int var402 = 0; var402 < var400; var402++) {
                                                            var401[var402] = var390.method2182();
                                                        }
                                                        String var403 = var390.method2182();
                                                        byte[][] var404 = new byte[var400][];
                                                        if (var394 == 3) {
                                                            for (int var405 = 0; var405 < var400; var405++) {
                                                                int var406 = var390.method2183();
                                                                var404[var405] = new byte[var406];
                                                                var390.method2280(var404[var405], 0, var406);
                                                            }
                                                        }
                                                        var392.field2889[var393] = var394;
                                                        Class[] var407 = new Class[var400];
                                                        for (int var408 = 0; var408 < var400; var408++) {
                                                            var407[var408] = class190.method1(var401[var408]);
                                                        }
                                                        Class var409 = class190.method1(var403);
                                                        if (class190.method1(var398).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var410 = class190.method1(var398).getDeclaredMethods();
                                                        Method[] var411 = var410;
                                                        for (int var412 = 0; var412 < var411.length; var412++) {
                                                            Method var413 = var411[var412];
                                                            if (var413.getName().equals(var399)) {
                                                                Class[] var414 = var413.getParameterTypes();
                                                                if (var407.length == var414.length) {
                                                                    boolean var415 = true;
                                                                    for (int var416 = 0; var416 < var407.length; var416++) {
                                                                        if (var407[var416] != var414[var416]) {
                                                                            var415 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var415 && var409 == var413.getReturnType()) {
                                                                        var392.field2895[var393] = var413;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var392.field2896[var393] = var404;
                                                    }
                                                } catch (ClassNotFoundException var563) {
                                                    var392.field2892[var393] = -1;
                                                } catch (SecurityException var564) {
                                                    var392.field2892[var393] = -2;
                                                } catch (NullPointerException var565) {
                                                    var392.field2892[var393] = -3;
                                                } catch (Exception var566) {
                                                    var392.field2892[var393] = -4;
                                                } catch (Throwable var567) {
                                                    var392.field2892[var393] = -5;
                                                }
                                            }
                                            class190.field2898.method3234(var392);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 18) {
                                            int var422 = field303.method2140();
                                            int var423 = field303.method2148();
                                            int var424 = field303.method2140();
                                            if (field435 != 0 && var423 != 0 && field322 < 50) {
                                                field498[field322] = var422;
                                                field388[field322] = var423;
                                                field500[field322] = var424;
                                                field344[field322] = null;
                                                field470[field322] = 0;
                                                field322++;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 150) {
                                            while (field303.field1826 < field304) {
                                                int var428 = field303.method2148();
                                                boolean var429 = (var428 & 0x1) == 1;
                                                String var430 = field303.method2182();
                                                String var431 = field303.method2182();
                                                field303.method2182();
                                                for (int var432 = 0; var432 < field513; var432++) {
                                                    class8 var433 = field514[var432];
                                                    if (var429) {
                                                        if (var431.equals(var433.field137)) {
                                                            var433.field137 = var430;
                                                            var433.field133 = var431;
                                                            var430 = null;
                                                            break;
                                                        }
                                                    } else if (var430.equals(var433.field137)) {
                                                        var433.field137 = var430;
                                                        var433.field133 = var431;
                                                        var430 = null;
                                                        break;
                                                    }
                                                }
                                                if (var430 != null && field513 < 400) {
                                                    class8 var434 = new class8();
                                                    field514[field513] = var434;
                                                    var434.field137 = var430;
                                                    var434.field133 = var431;
                                                    field513++;
                                                }
                                            }
                                            field452 = field444;
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 80) {
                                            method843(true);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 1) {
                                            field392 = field303.method2148();
                                            if (field392 == 1) {
                                                field276 = field303.method2140();
                                            }
                                            if (field392 >= 2 && field392 <= 6) {
                                                if (field392 == 2) {
                                                    field281 = 64;
                                                    field283 = 64;
                                                }
                                                if (field392 == 3) {
                                                    field281 = 0;
                                                    field283 = 64;
                                                }
                                                if (field392 == 4) {
                                                    field281 = 128;
                                                    field283 = 64;
                                                }
                                                if (field392 == 5) {
                                                    field281 = 64;
                                                    field283 = 0;
                                                }
                                                if (field392 == 6) {
                                                    field281 = 64;
                                                    field283 = 128;
                                                }
                                                field392 = 2;
                                                field264 = field303.method2140();
                                                field279 = field303.method2140();
                                                field492 = field303.method2148();
                                            }
                                            if (field392 == 10) {
                                                field277 = field303.method2140();
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 200) {
                                            int var435 = field303.method2140();
                                            field420 = var435;
                                            method11(var435);
                                            class32.method539(field420);
                                            for (int var436 = 0; var436 < 100; var436++) {
                                                field482[var436] = true;
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 165) {
                                            int var437 = field303.method2179();
                                            class153 var438 = class153.method1974(var437);
                                            var438.field2564 = 3;
                                            var438.field2563 = Statics.field1751.field58.method2875();
                                            method2750(var438);
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        if (field305 == 155) {
                                            int var439 = field303.method2183();
                                            int var440 = field303.method2141();
                                            class153 var441 = class153.method1974(var439);
                                            if (var441.field2568 != var440 || var440 == -1) {
                                                var441.field2568 = var440;
                                                var441.field2638 = 0;
                                                var441.field2639 = 0;
                                                method2750(var441);
                                            }
                                            field305 = -1;
                                            var140 = true;
                                            break label3510;
                                        }
                                        Statics.method3084("" + field305 + class2.field21 + field364 + class2.field21 + field362 + class2.field21 + field304, (Throwable) null);
                                        method509();
                                    } catch (IOException var568) {
                                        method136();
                                    } catch (Exception var569) {
                                        String var444 = "" + field305 + class2.field21 + field364 + class2.field21 + field362 + class2.field21 + field304 + class2.field21 + (Statics.field1791 + Statics.field1751.field785[0]) + class2.field21 + (Statics.field1002 + Statics.field1751.field780[0]) + class2.field21;
                                        for (int var445 = 0; var445 < field304 && var445 < 50; var445++) {
                                            var444 = var444 + field303.field1829[var445] + class2.field21;
                                        }
                                        Statics.method3084(var444, var569);
                                        method509();
                                    }
                                    var140 = true;
                                }
                            }
                            if (!var140) {
                                break;
                            }
                        }
                        if (field265 == 30) {
                            while (class190.method526()) {
                                field301.method2355(4);
                                field301.method2124(0);
                                int var446 = field301.field1826;
                                class190.method1428(field301);
                                field301.method2135(field301.field1826 - var446);
                            }
                            Object var447 = Statics.field622.field185;
                            synchronized (Statics.field622.field185) {
                                if (!field271) {
                                    Statics.field622.field186 = 0;
                                } else if (class127.field1998 != 0 || Statics.field622.field186 >= 40) {
                                    field301.method2355(28);
                                    field301.method2124(0);
                                    int var448 = field301.field1826;
                                    int var449 = 0;
                                    for (int var450 = 0; var450 < Statics.field622.field186 && field301.field1826 - var448 < 240; var450++) {
                                        var449++;
                                        int var451 = Statics.field622.field193[var450];
                                        if (var451 < 0) {
                                            var451 = 0;
                                        } else if (var451 > 502) {
                                            var451 = 502;
                                        }
                                        int var452 = Statics.field622.field187[var450];
                                        if (var452 < 0) {
                                            var452 = 0;
                                        } else if (var452 > 764) {
                                            var452 = 764;
                                        }
                                        int var453 = var451 * 765 + var452;
                                        if (Statics.field622.field193[var450] == -1 && Statics.field622.field187[var450] == -1) {
                                            var452 = -1;
                                            var451 = -1;
                                            var453 = 524287;
                                        }
                                        if (field510 != var452 || field270 != var451) {
                                            int var454 = var452 - field510;
                                            field510 = var452;
                                            int var455 = var451 - field270;
                                            field270 = var451;
                                            if (field434 < 8 && var454 >= -32 && var454 <= 31 && var455 >= -32 && var455 <= 31) {
                                                var454 += 32;
                                                var455 += 32;
                                                field301.method2125((field434 << 12) + (var454 << 6) + var455);
                                                field434 = 0;
                                            } else if (field434 < 8) {
                                                field301.method2126((field434 << 19) + 8388608 + var453);
                                                field434 = 0;
                                            } else {
                                                field301.method2127((field434 << 19) + -1073741824 + var453);
                                                field434 = 0;
                                            }
                                        } else if (field434 < 2047) {
                                            field434++;
                                        }
                                    }
                                    field301.method2135(field301.field1826 - var448);
                                    if (var449 >= Statics.field622.field186) {
                                        Statics.field622.field186 = 0;
                                    } else {
                                        Statics.field622.field186 -= var449;
                                        for (int var456 = 0; var456 < Statics.field622.field186; var456++) {
                                            Statics.field622.field187[var456] = Statics.field622.field187[var449 + var456];
                                            Statics.field622.field193[var456] = Statics.field622.field193[var449 + var456];
                                        }
                                    }
                                }
                            }
                            if (class127.field1998 == 1 || !Statics.field285 && class127.field1998 == 4 || class127.field1998 == 2) {
                                long var458 = (class127.field2000 - field412) / 50L;
                                if (var458 > 4095L) {
                                    var458 = 4095L;
                                }
                                field412 = class127.field2000;
                                int var460 = class127.field1997;
                                if (var460 < 0) {
                                    var460 = 0;
                                } else if (var460 > 502) {
                                    var460 = 502;
                                }
                                int var461 = class127.field1996;
                                if (var461 < 0) {
                                    var461 = 0;
                                } else if (var461 > 764) {
                                    var461 = 764;
                                }
                                int var462 = var460 * 765 + var461;
                                byte var463 = 0;
                                if (class127.field1998 == 2) {
                                    var463 = 1;
                                }
                                int var464 = (int) var458;
                                field301.method2355(31);
                                field301.method2127((var463 << 19) + (var464 << 20) + var462);
                            }
                            if (class124.field1958 > 0) {
                                field301.method2355(78);
                                field301.method2125(0);
                                int var465 = field301.field1826;
                                long var466 = class103.method1066();
                                for (int var468 = 0; var468 < class124.field1958; var468++) {
                                    long var469 = var466 - field481;
                                    if (var469 > 16777215L) {
                                        var469 = 16777215L;
                                    }
                                    field481 = var466;
                                    field301.method2160(class124.field1957[var468]);
                                    field301.method2174((int) var469);
                                }
                                field301.method2134(field301.field1826 - var465);
                            }
                            if (field348 > 0) {
                                field348--;
                            }
                            if (class124.field1951[96] || class124.field1951[97] || class124.field1951[98] || class124.field1951[99]) {
                                field325 = true;
                            }
                            if (field325 && field348 <= 0) {
                                field348 = 20;
                                field325 = false;
                                field301.method2355(193);
                                field301.method2180(field343);
                                field301.method2167(field501);
                            }
                            if (Statics.field16 && !field454) {
                                field454 = true;
                                field301.method2355(227);
                                field301.method2124(1);
                            }
                            if (!Statics.field16 && field454) {
                                field454 = false;
                                field301.method2355(227);
                                field301.method2124(0);
                            }
                            method2569();
                            if (field265 == 30) {
                                method659();
                                int var10002;
                                for (int var471 = 0; var471 < field322; var471++) {
                                    var10002 = field500[var471]--;
                                    if (field500[var471] >= -10) {
                                        class52 var473 = field344[var471];
                                        if (var473 == null) {
                                            class52 var571 = (class52) null;
                                            var473 = class52.method1064(Statics.field1831, field498[var471], 0);
                                            if (var473 == null) {
                                                continue;
                                            }
                                            field500[var471] += var473.method1058();
                                            field344[var471] = var473;
                                        }
                                        if (field500[var471] < 0) {
                                            int var480;
                                            if (field470[var471] == 0) {
                                                var480 = field435;
                                            } else {
                                                int var474 = (field470[var471] & 0xFF) * 128;
                                                int var475 = field470[var471] >> 16 & 0xFF;
                                                int var476 = var475 * 128 + 64 - Statics.field1751.field772;
                                                if (var476 < 0) {
                                                    var476 = -var476;
                                                }
                                                int var477 = field470[var471] >> 8 & 0xFF;
                                                int var478 = var477 * 128 + 64 - Statics.field1751.field732;
                                                if (var478 < 0) {
                                                    var478 = -var478;
                                                }
                                                int var479 = var476 + var478 - 128;
                                                if (var479 > var474) {
                                                    field500[var471] = -100;
                                                    continue;
                                                }
                                                if (var479 < 0) {
                                                    var479 = 0;
                                                }
                                                var480 = field254 * (var474 - var479) / var474;
                                            }
                                            if (var480 > 0) {
                                                class56 var481 = var473.method1057().method1093(Statics.field80);
                                                class58 var482 = class58.method1186(var481, 100, var480);
                                                var482.method1117(field388[var471] - 1);
                                                Statics.field243.method956(var482);
                                            }
                                            field500[var471] = -100;
                                        }
                                    } else {
                                        field322--;
                                        for (int var472 = var471; var472 < field322; var472++) {
                                            field498[var472] = field498[var472 + 1];
                                            field344[var472] = field344[var472 + 1];
                                            field388[var472] = field388[var472 + 1];
                                            field500[var472] = field500[var472 + 1];
                                            field470[var472] = field470[var472 + 1];
                                        }
                                        var471--;
                                    }
                                }
                                if (field288) {
                                    boolean var483;
                                    if (class162.field2719 == 0) {
                                        var483 = Statics.field1278.method3073();
                                    } else {
                                        var483 = true;
                                    }
                                    if (!var483) {
                                        if (field418 != 0 && field493 != -1) {
                                            class162.method2519(Statics.field154, field493, 0, field418, false);
                                        }
                                        field288 = false;
                                    }
                                }
                                field306++;
                                if (field306 > 750) {
                                    method136();
                                } else {
                                    method2656();
                                    method1978();
                                    method752();
                                    field335++;
                                    if (field368 != 0) {
                                        field376 += 20;
                                        if (field376 >= 400) {
                                            field368 = 0;
                                        }
                                    }
                                    if (Statics.field2677 != null) {
                                        field369++;
                                        if (field369 >= 15) {
                                            method2750(Statics.field2677);
                                            Statics.field2677 = null;
                                        }
                                    }
                                    class153 var484 = Statics.field2847;
                                    class153 var485 = Statics.field1252;
                                    Statics.field2847 = null;
                                    Statics.field1252 = null;
                                    field316 = null;
                                    field333 = false;
                                    field437 = false;
                                    field499 = 0;
                                    while (true) {
                                        while (class124.method483() && field499 < 128) {
                                            if (field427 >= 2 && class124.field1951[82] && Statics.field1903 == 66) {
                                                String var486 = class10.method1983();
                                                Statics.field2002.setContents(new StringSelection(var486), (ClipboardOwner) null);
                                            } else {
                                                field284[field499] = Statics.field1903;
                                                field479[field499] = Statics.field980;
                                                field499++;
                                            }
                                        }
                                        int var487 = field420;
                                        if (class153.method2384(var487)) {
                                            method1883(Statics.field2545[var487], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field444++;
                                        while (true) {
                                            class1 var488;
                                            class153 var489;
                                            class153 var490;
                                            do {
                                                var488 = (class1) field464.method3186();
                                                if (var488 == null) {
                                                    while (true) {
                                                        class1 var491;
                                                        class153 var492;
                                                        class153 var493;
                                                        do {
                                                            var491 = (class1) field460.method3186();
                                                            if (var491 == null) {
                                                                while (true) {
                                                                    class1 var494;
                                                                    class153 var495;
                                                                    class153 var496;
                                                                    do {
                                                                        var494 = (class1) field458.method3186();
                                                                        if (var494 == null) {
                                                                            method1604();
                                                                            if (field256 != null) {
                                                                                method2750(field256);
                                                                                Statics.field219++;
                                                                                if (field333 && field437) {
                                                                                    int var497 = class127.field1989;
                                                                                    int var498 = class127.field1990;
                                                                                    int var499 = var497 - field338;
                                                                                    int var500 = var498 - field432;
                                                                                    if (var499 < field438) {
                                                                                        var499 = field438;
                                                                                    }
                                                                                    if (field256.field2541 + var499 > field438 + field339.field2541) {
                                                                                        var499 = field438 + field339.field2541 - field256.field2541;
                                                                                    }
                                                                                    if (var500 < field439) {
                                                                                        var500 = field439;
                                                                                    }
                                                                                    if (field256.field2542 + var500 > field439 + field339.field2542) {
                                                                                        var500 = field439 + field339.field2542 - field256.field2542;
                                                                                    }
                                                                                    int var501 = var499 - field426;
                                                                                    int var502 = var500 - field442;
                                                                                    int var503 = field256.field2634;
                                                                                    if (Statics.field219 > field256.field2596 && (var501 > var503 || var501 < -var503 || var502 > var503 || var502 < -var503)) {
                                                                                        field357 = true;
                                                                                    }
                                                                                    int var504 = field339.field2582 + (var499 - field438);
                                                                                    int var505 = field339.field2536 + (var500 - field439);
                                                                                    if (field256.field2553 != null && field357) {
                                                                                        class1 var506 = new class1();
                                                                                        var506.field3 = field256;
                                                                                        var506.field4 = var504;
                                                                                        var506.field1 = var505;
                                                                                        var506.field12 = field256.field2553;
                                                                                        class32.method2843(var506, 200000);
                                                                                    }
                                                                                    if (class127.field1988 == 0) {
                                                                                        if (field357) {
                                                                                            if (field256.field2609 != null) {
                                                                                                class1 var507 = new class1();
                                                                                                var507.field3 = field256;
                                                                                                var507.field4 = var504;
                                                                                                var507.field1 = var505;
                                                                                                var507.field7 = field316;
                                                                                                var507.field12 = field256.field2609;
                                                                                                class32.method2843(var507, 200000);
                                                                                            }
                                                                                            if (field316 != null) {
                                                                                                class153 var508 = field256;
                                                                                                int var509 = class157.method2845(method3(var508));
                                                                                                class153 var510;
                                                                                                if (var509 == 0) {
                                                                                                    var510 = null;
                                                                                                } else {
                                                                                                    int var511 = 0;
                                                                                                    while (true) {
                                                                                                        if (var511 >= var509) {
                                                                                                            var510 = var508;
                                                                                                            break;
                                                                                                        }
                                                                                                        var508 = class153.method1974(var508.field2543);
                                                                                                        if (var508 == null) {
                                                                                                            var510 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var511++;
                                                                                                    }
                                                                                                }
                                                                                                if (var510 != null) {
                                                                                                    field301.method2355(67);
                                                                                                    field301.method2180(field316.field2636);
                                                                                                    field301.method2127(field256.field2641);
                                                                                                    field301.method2169(field316.field2584);
                                                                                                    field301.method2177(field316.field2641);
                                                                                                    field301.method2180(field256.field2584);
                                                                                                    field301.method2169(field256.field2636);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field480 == 1 || method98(field402 - 1)) && field402 > 2) {
                                                                                            method2406(field426 + field338, field442 + field432);
                                                                                        } else if (field402 > 0) {
                                                                                            method142(field426 + field338, field442 + field432);
                                                                                        }
                                                                                        field256 = null;
                                                                                    }
                                                                                } else if (Statics.field219 > 1) {
                                                                                    field256 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field572 != null) {
                                                                                method2750(Statics.field572);
                                                                                field518++;
                                                                                if (class127.field1988 == 0) {
                                                                                    if (field375) {
                                                                                        if (Statics.field699 == Statics.field572 && field374 != field371) {
                                                                                            class153 var512 = Statics.field572;
                                                                                            byte var513 = 0;
                                                                                            if (field423 == 1 && var512.field2608 == 206) {
                                                                                                var513 = 1;
                                                                                            }
                                                                                            if (var512.field2565[field374] <= 0) {
                                                                                                var513 = 0;
                                                                                            }
                                                                                            int var514 = method3(var512);
                                                                                            boolean var515 = (var514 >> 29 & 0x1) != 0;
                                                                                            if (var515) {
                                                                                                int var516 = field371;
                                                                                                int var517 = field374;
                                                                                                var512.field2565[var517] = var512.field2565[var516];
                                                                                                var512.field2635[var517] = var512.field2635[var516];
                                                                                                var512.field2565[var516] = -1;
                                                                                                var512.field2635[var516] = 0;
                                                                                            } else if (var513 == 1) {
                                                                                                int var518 = field371;
                                                                                                int var519 = field374;
                                                                                                while (var518 != var519) {
                                                                                                    if (var518 > var519) {
                                                                                                        var512.method2803(var518 - 1, var518);
                                                                                                        var518--;
                                                                                                    } else if (var518 < var519) {
                                                                                                        var512.method2803(var518 + 1, var518);
                                                                                                        var518++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var512.method2803(field374, field371);
                                                                                            }
                                                                                            field301.method2355(12);
                                                                                            field301.method2161(var513);
                                                                                            field301.method2292(Statics.field572.field2641);
                                                                                            field301.method2125(field371);
                                                                                            field301.method2169(field374);
                                                                                        }
                                                                                    } else if ((field480 == 1 || method98(field402 - 1)) && field402 > 2) {
                                                                                        method2406(field372, field473);
                                                                                    } else if (field402 > 0) {
                                                                                        method142(field372, field473);
                                                                                    }
                                                                                    field369 = 10;
                                                                                    class127.field1998 = 0;
                                                                                    Statics.field572 = null;
                                                                                } else if (field518 >= 5 && (class127.field1989 > field372 + 5 || class127.field1989 < field372 - 5 || class127.field1990 > field473 + 5 || class127.field1990 < field473 - 5)) {
                                                                                    field375 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1377 != -1) {
                                                                                int var520 = class79.field1377;
                                                                                int var521 = class79.field1395;
                                                                                field301.method2355(57);
                                                                                field301.method2124(5);
                                                                                field301.method2167(Statics.field1791 + var520);
                                                                                field301.method2169(Statics.field1002 + var521);
                                                                                field301.method2159(class124.field1951[82] ? (class124.field1951[81] ? 2 : 1) : 0);
                                                                                class79.field1377 = -1;
                                                                                field365 = class127.field1996;
                                                                                field366 = class127.field1997;
                                                                                field368 = 1;
                                                                                field376 = 0;
                                                                                field489 = var520;
                                                                                field490 = var521;
                                                                            }
                                                                            if (Statics.field2847 != var484) {
                                                                                if (var484 != null) {
                                                                                    method2750(var484);
                                                                                }
                                                                                if (Statics.field2847 != null) {
                                                                                    method2750(Statics.field2847);
                                                                                }
                                                                            }
                                                                            if (Statics.field1252 != var485 && field411 == field272) {
                                                                                if (var485 != null) {
                                                                                    method2750(var485);
                                                                                }
                                                                                if (Statics.field1252 != null) {
                                                                                    method2750(Statics.field1252);
                                                                                }
                                                                            }
                                                                            if (Statics.field1252 == null) {
                                                                                if (field411 > 0) {
                                                                                    field411--;
                                                                                }
                                                                            } else if (field411 < field272) {
                                                                                field411++;
                                                                                if (field411 == field272) {
                                                                                    method2750(Statics.field1252);
                                                                                }
                                                                            }
                                                                            int var522 = field323 + Statics.field1751.field772;
                                                                            int var523 = field319 + Statics.field1751.field732;
                                                                            if (Statics.field965 - var522 < -500 || Statics.field965 - var522 > 500 || Statics.field1867 - var523 < -500 || Statics.field1867 - var523 > 500) {
                                                                                Statics.field965 = var522;
                                                                                Statics.field1867 = var523;
                                                                            }
                                                                            if (Statics.field965 != var522) {
                                                                                Statics.field965 += (var522 - Statics.field965) / 16;
                                                                            }
                                                                            if (Statics.field1867 != var523) {
                                                                                Statics.field1867 += (var523 - Statics.field1867) / 16;
                                                                            }
                                                                            if (class127.field1988 == 4 && Statics.field285) {
                                                                                int var524 = class127.field1990 - field347;
                                                                                field345 = var524 * 2;
                                                                                field347 = var524 == -1 || var524 == 1 ? class127.field1990 : (field347 + class127.field1990) / 2;
                                                                                int var525 = field311 - class127.field1989;
                                                                                field512 = var525 * 2;
                                                                                field311 = var525 == -1 || var525 == 1 ? class127.field1989 : (field311 + class127.field1989) / 2;
                                                                            } else {
                                                                                if (class124.field1951[96]) {
                                                                                    field512 += (-24 - field512) / 2;
                                                                                } else if (class124.field1951[97]) {
                                                                                    field512 += (24 - field512) / 2;
                                                                                } else {
                                                                                    field512 /= 2;
                                                                                }
                                                                                if (class124.field1951[98]) {
                                                                                    field345 += (12 - field345) / 2;
                                                                                } else if (class124.field1951[99]) {
                                                                                    field345 += (-12 - field345) / 2;
                                                                                } else {
                                                                                    field345 /= 2;
                                                                                }
                                                                                field347 = class127.field1990;
                                                                                field311 = class127.field1989;
                                                                            }
                                                                            field343 = field512 / 2 + field343 & 0x7FF;
                                                                            field501 += field345 / 2;
                                                                            if (field501 < 128) {
                                                                                field501 = 128;
                                                                            }
                                                                            if (field501 > 383) {
                                                                                field501 = 383;
                                                                            }
                                                                            int var526 = Statics.field965 >> 7;
                                                                            int var527 = Statics.field1867 >> 7;
                                                                            int var528 = method1782(Statics.field965, Statics.field1867, Statics.field83);
                                                                            int var529 = 0;
                                                                            if (var526 > 3 && var527 > 3 && var526 < 100 && var527 < 100) {
                                                                                for (int var530 = var526 - 4; var530 <= var526 + 4; var530++) {
                                                                                    for (int var531 = var527 - 4; var531 <= var527 + 4; var531++) {
                                                                                        int var532 = Statics.field83;
                                                                                        if (var532 < 3 && (class6.field85[1][var530][var531] & 0x2) == 2) {
                                                                                            var532++;
                                                                                        }
                                                                                        int var533 = var528 - class6.field89[var532][var530][var531];
                                                                                        if (var533 > var529) {
                                                                                            var529 = var533;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var534 = var529 * 192;
                                                                            if (var534 > 98048) {
                                                                                var534 = 98048;
                                                                            }
                                                                            if (var534 < 32768) {
                                                                                var534 = 32768;
                                                                            }
                                                                            if (var534 > field349) {
                                                                                field349 += (var534 - field349) / 24;
                                                                            } else if (var534 < field349) {
                                                                                field349 += (var534 - field349) / 80;
                                                                            }
                                                                            if (field503) {
                                                                                int var535 = Statics.field251 * 128 + 64;
                                                                                int var536 = Statics.field18 * 128 + 64;
                                                                                int var537 = method1782(var535, var536, Statics.field83) - Statics.field530;
                                                                                if (Statics.field1878 < var535) {
                                                                                    Statics.field1878 += Statics.field177 * (var535 - Statics.field1878) / 1000 + Statics.field1477;
                                                                                    if (Statics.field1878 > var535) {
                                                                                        Statics.field1878 = var535;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1878 > var535) {
                                                                                    Statics.field1878 -= Statics.field177 * (Statics.field1878 - var535) / 1000 + Statics.field1477;
                                                                                    if (Statics.field1878 < var535) {
                                                                                        Statics.field1878 = var535;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1247 < var537) {
                                                                                    Statics.field1247 += Statics.field177 * (var537 - Statics.field1247) / 1000 + Statics.field1477;
                                                                                    if (Statics.field1247 > var537) {
                                                                                        Statics.field1247 = var537;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1247 > var537) {
                                                                                    Statics.field1247 -= Statics.field177 * (Statics.field1247 - var537) / 1000 + Statics.field1477;
                                                                                    if (Statics.field1247 < var537) {
                                                                                        Statics.field1247 = var537;
                                                                                    }
                                                                                }
                                                                                if (Statics.field758 < var536) {
                                                                                    Statics.field758 += Statics.field177 * (var536 - Statics.field758) / 1000 + Statics.field1477;
                                                                                    if (Statics.field758 > var536) {
                                                                                        Statics.field758 = var536;
                                                                                    }
                                                                                }
                                                                                if (Statics.field758 > var536) {
                                                                                    Statics.field758 -= Statics.field177 * (Statics.field758 - var536) / 1000 + Statics.field1477;
                                                                                    if (Statics.field758 < var536) {
                                                                                        Statics.field758 = var536;
                                                                                    }
                                                                                }
                                                                                int var538 = Statics.field75 * 128 + 64;
                                                                                int var539 = Statics.field203 * 128 + 64;
                                                                                int var540 = method1782(var538, var539, Statics.field83) - Statics.field1790;
                                                                                int var541 = var538 - Statics.field1878;
                                                                                int var542 = var540 - Statics.field1247;
                                                                                int var543 = var539 - Statics.field758;
                                                                                int var544 = (int) Math.sqrt((double) (var541 * var541 + var543 * var543));
                                                                                int var545 = (int) (Math.atan2((double) var542, (double) var544) * 325.949D) & 0x7FF;
                                                                                int var546 = (int) (Math.atan2((double) var541, (double) var543) * -325.949D) & 0x7FF;
                                                                                if (var545 < 128) {
                                                                                    var545 = 128;
                                                                                }
                                                                                if (var545 > 383) {
                                                                                    var545 = 383;
                                                                                }
                                                                                if (Statics.field703 < var545) {
                                                                                    Statics.field703 += Statics.field1415 * (var545 - Statics.field703) / 1000 + Statics.field2845;
                                                                                    if (Statics.field703 > var545) {
                                                                                        Statics.field703 = var545;
                                                                                    }
                                                                                }
                                                                                if (Statics.field703 > var545) {
                                                                                    Statics.field703 -= Statics.field1415 * (Statics.field703 - var545) / 1000 + Statics.field2845;
                                                                                    if (Statics.field703 < var545) {
                                                                                        Statics.field703 = var545;
                                                                                    }
                                                                                }
                                                                                int var547 = var546 - Statics.field105;
                                                                                if (var547 > 1024) {
                                                                                    var547 -= 2048;
                                                                                }
                                                                                if (var547 < -1024) {
                                                                                    var547 += 2048;
                                                                                }
                                                                                if (var547 > 0) {
                                                                                    Statics.field105 += Statics.field1415 * var547 / 1000 + Statics.field2845;
                                                                                    Statics.field105 &= 0x7FF;
                                                                                }
                                                                                if (var547 < 0) {
                                                                                    Statics.field105 -= Statics.field1415 * -var547 / 1000 + Statics.field2845;
                                                                                    Statics.field105 &= 0x7FF;
                                                                                }
                                                                                int var548 = var546 - Statics.field105;
                                                                                if (var548 > 1024) {
                                                                                    var548 -= 2048;
                                                                                }
                                                                                if (var548 < -1024) {
                                                                                    var548 += 2048;
                                                                                }
                                                                                if (var548 < 0 && var547 > 0 || var548 > 0 && var547 < 0) {
                                                                                    Statics.field105 = var546;
                                                                                }
                                                                            }
                                                                            for (int var549 = 0; var549 < 5; var549++) {
                                                                                var10002 = field508[var549]++;
                                                                            }
                                                                            int var550 = class127.method10();
                                                                            int var551 = class124.field1962;
                                                                            if (var550 > 15000 && var551 > 15000) {
                                                                                field308 = 250;
                                                                                class127.field1991 = 14500;
                                                                                field301.method2355(137);
                                                                            }
                                                                            field329++;
                                                                            if (field329 > 500) {
                                                                                field329 = 0;
                                                                                int var553 = (int) (Math.random() * 8.0D);
                                                                                if ((var553 & 0x1) == 1) {
                                                                                    field323 += field324;
                                                                                }
                                                                                if ((var553 & 0x2) == 2) {
                                                                                    field319 += field326;
                                                                                }
                                                                                if ((var553 & 0x4) == 4) {
                                                                                    field327 += field328;
                                                                                }
                                                                            }
                                                                            if (field323 < -50) {
                                                                                field324 = 2;
                                                                            }
                                                                            if (field323 > 50) {
                                                                                field324 = -2;
                                                                            }
                                                                            if (field319 < -55) {
                                                                                field326 = 2;
                                                                            }
                                                                            if (field319 > 55) {
                                                                                field326 = -2;
                                                                            }
                                                                            if (field327 < -40) {
                                                                                field328 = 1;
                                                                            }
                                                                            if (field327 > 40) {
                                                                                field328 = -1;
                                                                            }
                                                                            field321++;
                                                                            if (field321 > 500) {
                                                                                field321 = 0;
                                                                                int var554 = (int) (Math.random() * 8.0D);
                                                                                if ((var554 & 0x1) == 1) {
                                                                                    field400 += field331;
                                                                                }
                                                                                if ((var554 & 0x2) == 2) {
                                                                                    field332 += field255;
                                                                                }
                                                                            }
                                                                            if (field400 < -60) {
                                                                                field331 = 2;
                                                                            }
                                                                            if (field400 > 60) {
                                                                                field331 = -2;
                                                                            }
                                                                            if (field332 < -20) {
                                                                                field255 = 1;
                                                                            }
                                                                            if (field332 > 10) {
                                                                                field255 = -1;
                                                                            }
                                                                            for (class34 var555 = (class34) field275.method3141(); var555 != null; var555 = (class34) field275.method3144()) {
                                                                                if ((long) var555.field796 < class103.method1066() / 1000L - 5L) {
                                                                                    if (var555.field791 > 0) {
                                                                                        class10.method2769(5, "", var555.field793 + class143.field2242);
                                                                                    }
                                                                                    if (var555.field791 == 0) {
                                                                                        class10.method2769(5, "", var555.field793 + class143.field2289);
                                                                                    }
                                                                                    var555.method3272();
                                                                                }
                                                                            }
                                                                            field307++;
                                                                            if (field307 > 50) {
                                                                                field301.method2355(44);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2655 != null && field301.field1826 > 0) {
                                                                                    Statics.field2655.method2552(field301.field1829, 0, field301.field1826);
                                                                                    field301.field1826 = 0;
                                                                                    field307 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var557) {
                                                                                method136();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var495 = var494.field3;
                                                                        if (var495.field2584 < 0) {
                                                                            break;
                                                                        }
                                                                        var496 = class153.method1974(var495.field2543);
                                                                    } while (var496 == null || var496.field2640 == null || var495.field2584 >= var496.field2640.length || var496.field2640[var495.field2584] != var495);
                                                                    class32.method2843(var494, 200000);
                                                                }
                                                            }
                                                            var492 = var491.field3;
                                                            if (var492.field2584 < 0) {
                                                                break;
                                                            }
                                                            var493 = class153.method1974(var492.field2543);
                                                        } while (var493 == null || var493.field2640 == null || var492.field2584 >= var493.field2640.length || var493.field2640[var492.field2584] != var492);
                                                        class32.method2843(var491, 200000);
                                                    }
                                                }
                                                var489 = var488.field3;
                                                if (var489.field2584 < 0) {
                                                    break;
                                                }
                                                var490 = class153.method1974(var489.field2543);
                                            } while (var490 == null || var490.field2640 == null || var489.field2584 >= var490.field2640.length || var490.field2640[var489.field2584] != var489);
                                            class32.method2843(var488, 200000);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field265 == 40 || field265 == 45) {
                    method2657();
                }
                return;
            }
            var2.field2480.method2756(var2.field2479, (int) var2.field2888, var2.field2478, false);
        }
    }

    @ObfuscatedName("client.a(B)V")
    public final void method371() {
        boolean var1;
        label130: {
            try {
                if (class162.field2719 == 2) {
                    if (Statics.field694 == null) {
                        Statics.field694 = class159.method2897(Statics.field2720, Statics.field1001, Statics.field2726);
                        if (Statics.field694 == null) {
                            var1 = false;
                            break label130;
                        }
                    }
                    if (Statics.field1748 == null) {
                        Statics.field1748 = new class53(Statics.field2718, Statics.field2722);
                    }
                    if (Statics.field1278.method2992(Statics.field694, Statics.field2717, Statics.field1748, 22050)) {
                        Statics.field1278.method2993();
                        Statics.field1278.method3051(Statics.field62);
                        Statics.field1278.method3041(Statics.field694, Statics.field6);
                        class162.field2719 = 0;
                        Statics.field694 = null;
                        Statics.field1748 = null;
                        Statics.field2720 = null;
                        var1 = true;
                        break label130;
                    }
                }
            } catch (Exception var18) {
                var18.printStackTrace();
                Statics.field1278.method2996();
                class162.field2719 = 0;
                Statics.field694 = null;
                Statics.field1748 = null;
                Statics.field2720 = null;
            }
            var1 = false;
        }
        if (var1 && field288 && Statics.field189 != null) {
            Statics.field189.method1006();
        }
        if (field2036) {
            Canvas var4 = Statics.field131;
            var4.removeKeyListener(class124.field1937);
            var4.removeFocusListener(class124.field1937);
            class124.field1954 = -1;
            Canvas var5 = Statics.field131;
            var5.removeMouseListener(class127.field1995);
            var5.removeMouseMotionListener(class127.field1995);
            var5.removeFocusListener(class127.field1995);
            class127.field1999 = 0;
            if (Statics.field2678 != null) {
                Statics.field2678.method2409(Statics.field131);
            }
            this.method2623();
            Canvas var6 = Statics.field131;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class124.field1937);
            var6.addFocusListener(class124.field1937);
            Canvas var7 = Statics.field131;
            var7.addMouseListener(class127.field1995);
            var7.addMouseMotionListener(class127.field1995);
            var7.addFocusListener(class127.field1995);
            if (Statics.field2678 != null) {
                Statics.field2678.method2408(Statics.field131);
            }
        }
        if (field265 == 0) {
            class131.method1401(class28.field666, class28.field667, (Color) null);
        } else if (field265 == 5) {
            class28.method580(Statics.field253, Statics.field507);
        } else if (field265 == 10 || field265 == 11) {
            class28.method580(Statics.field253, Statics.field507);
        } else if (field265 == 20) {
            class28.method580(Statics.field253, Statics.field507);
        } else if (field265 == 25) {
            if (field318 == 1) {
                if (field487 > field317) {
                    field317 = field487;
                }
                int var8 = (field317 * 50 - field487 * 50) / field317;
                method582(class143.field2291 + class2.field24 + class2.field23 + var8 + "%" + class2.field29, false);
            } else if (field318 == 2) {
                if (field378 > field465) {
                    field465 = field378;
                }
                int var9 = (field465 * 50 - field378 * 50) / field465 + 50;
                method582(class143.field2291 + class2.field24 + class2.field23 + var9 + "%" + class2.field29, false);
            } else {
                method582(class143.field2291, false);
            }
        } else if (field265 == 30) {
            method1608();
        } else if (field265 == 40) {
            method582(class143.field2306 + class2.field24 + class143.field2152, false);
        } else if (field265 == 45) {
            method582(class143.field2299, false);
        }
        if (field265 == 30 && field471 == 0 && !field2037) {
            try {
                Graphics var10 = Statics.field131.getGraphics();
                for (int var11 = 0; var11 < field462; var11++) {
                    if (field410[var11]) {
                        Statics.field1668.method1349(var10, field467[var11], field459[var11], field469[var11], field497[var11]);
                        field410[var11] = false;
                    }
                }
            } catch (Exception var17) {
                Statics.field131.repaint();
            }
        } else if (field265 > 0) {
            try {
                Graphics var13 = Statics.field131.getGraphics();
                Statics.field1668.method1348(var13, 0, 0);
                field2037 = false;
                for (int var14 = 0; var14 < field462; var14++) {
                    field410[var14] = false;
                }
            } catch (Exception var16) {
                Statics.field131.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(B)V")
    public final void method396() {
        if (Statics.field622 != null) {
            Statics.field622.field191 = false;
        }
        Statics.field622 = null;
        if (Statics.field2655 != null) {
            Statics.field2655.method2548();
            Statics.field2655 = null;
        }
        if (class124.field1937 != null) {
            class124 var1 = class124.field1937;
            synchronized (class124.field1937) {
                class124.field1937 = null;
            }
        }
        class127.method548();
        Statics.field2678 = null;
        if (Statics.field189 != null) {
            Statics.field189.method1007();
        }
        if (Statics.field2389 != null) {
            Statics.field2389.method1007();
        }
        Statics.method535();
        Object var3 = class150.field2489;
        synchronized (class150.field2489) {
            if (class150.field2491 != 0) {
                class150.field2491 = 1;
                try {
                    class150.field2489.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class136.method834();
    }

    @ObfuscatedName("client.o(I)V")
    public void method386() {
        if (field265 == 1000) {
            return;
        }
        long var1 = class103.method1066();
        int var3 = (int) (var1 - Statics.field2503);
        Statics.field2503 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2497 += var3;
        boolean var4;
        if (class151.field2506 == 0 && class151.field2501 == 0 && class151.field2505 == 0 && class151.field2499 == 0) {
            var4 = true;
        } else if (Statics.field2496 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2497 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2501 < 20 && class151.field2499 > 0) {
                        class152 var5 = (class152) class151.field2508.method3153();
                        class107 var6 = new class107(4);
                        var6.method2124(1);
                        var6.method2126((int) var5.field2888);
                        Statics.field2496.method2552(var6.field1829, 0, 4);
                        class151.field2500.method3156(var5, var5.field2888);
                        class151.field2499--;
                        class151.field2501++;
                    }
                    while (class151.field2506 < 20 && class151.field2505 > 0) {
                        class152 var7 = (class152) class151.field2502.method3237();
                        class107 var8 = new class107(4);
                        var8.method2124(0);
                        var8.method2126((int) var7.field2888);
                        Statics.field2496.method2552(var8.field1829, 0, 4);
                        var7.method3253();
                        class151.field2498.method3156(var7, var7.field2888);
                        class151.field2505--;
                        class151.field2506++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2496.method2550();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2497 = 0;
                        byte var11 = 0;
                        if (Statics.field2776 == null) {
                            var11 = 8;
                        } else if (class151.field2509 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2504.field1826;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2496.method2551(class151.field2504.field1829, class151.field2504.field1826, var12);
                            if (class151.field2512 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2504.field1829[class151.field2504.field1826 + var13] ^= class151.field2512;
                                }
                            }
                            class151.field2504.field1826 += var12;
                            if (class151.field2504.field1826 < var11) {
                                break;
                            }
                            if (Statics.field2776 == null) {
                                class151.field2504.field1826 = 0;
                                int var14 = class151.field2504.method2148();
                                int var15 = class151.field2504.method2140();
                                int var16 = class151.field2504.method2148();
                                int var17 = class151.field2504.method2183();
                                long var18 = (long) ((var14 << 16) + var15);
                                class152 var20 = (class152) class151.field2500.method3149(var18);
                                Statics.field2511 = true;
                                if (var20 == null) {
                                    var20 = (class152) class151.field2498.method3149(var18);
                                    Statics.field2511 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2776 = var20;
                                Statics.field730 = new class107(var17 + var21 + Statics.field2776.field2516);
                                Statics.field730.method2124(var16);
                                Statics.field730.method2127(var17);
                                class151.field2509 = 8;
                                class151.field2504.field1826 = 0;
                            } else if (class151.field2509 == 0) {
                                if (class151.field2504.field1829[0] == -1) {
                                    class151.field2509 = 1;
                                    class151.field2504.field1826 = 0;
                                } else {
                                    Statics.field2776 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field730.field1829.length - Statics.field2776.field2516;
                            int var23 = 512 - class151.field2509;
                            if (var23 > var22 - Statics.field730.field1826) {
                                var23 = var22 - Statics.field730.field1826;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2496.method2551(Statics.field730.field1829, Statics.field730.field1826, var23);
                            if (class151.field2512 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field730.field1829[Statics.field730.field1826 + var24] ^= class151.field2512;
                                }
                            }
                            Statics.field730.field1826 += var23;
                            class151.field2509 += var23;
                            if (Statics.field730.field1826 == var22) {
                                if (Statics.field2776.field2888 == 16711935L) {
                                    Statics.field2065 = Statics.field730;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class148 var26 = class151.field2495[var25];
                                        if (var26 != null) {
                                            Statics.field2065.field1826 = var25 * 8 + 5;
                                            int var27 = Statics.field2065.method2183();
                                            int var28 = Statics.field2065.method2183();
                                            var26.method2770(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2510.reset();
                                    class151.field2510.update(Statics.field730.field1829, 0, var22);
                                    int var29 = (int) class151.field2510.getValue();
                                    if (Statics.field2776.field2517 != var29) {
                                        try {
                                            Statics.field2496.method2548();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2513++;
                                        Statics.field2496 = null;
                                        class151.field2512 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2513 = 0;
                                    class151.field2514 = 0;
                                    Statics.field2776.field2520.method2755((int) (Statics.field2776.field2888 & 0xFFFFL), Statics.field730.field1829, (Statics.field2776.field2888 & 0xFF0000L) == 16711680L, Statics.field2511);
                                }
                                Statics.field2776.method3277();
                                if (Statics.field2511) {
                                    class151.field2501--;
                                } else {
                                    class151.field2506--;
                                }
                                class151.field2509 = 0;
                                Statics.field2776 = null;
                                Statics.field730 = null;
                            } else {
                                if (class151.field2509 != 512) {
                                    break;
                                }
                                class151.field2509 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2496.method2548();
                } catch (Exception var34) {
                }
                class151.field2514++;
                Statics.field2496 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method178();
        }
    }

    @ObfuscatedName("client.v(B)V")
    public void method178() {
        if (class151.field2513 >= 4) {
            this.method2601("js5crc");
            field265 = 1000;
            return;
        }
        if (class151.field2514 >= 4) {
            if (field265 <= 5) {
                this.method2601("js5io");
                field265 = 1000;
                return;
            }
            field289 = 3000;
            class151.field2514 = 3;
        }
        if (--field289 + 1 > 0) {
            return;
        }
        try {
            if (field433 == 0) {
                Statics.field2934 = Statics.field1932.method2465(Statics.field531, Statics.field174);
                field433++;
            }
            if (field433 == 1) {
                if (Statics.field2934.field2045 == 2) {
                    this.method179(-1);
                    return;
                }
                if (Statics.field2934.field2045 == 1) {
                    field433++;
                }
            }
            if (field433 == 2) {
                Statics.field1885 = new class130((Socket) Statics.field2934.field2049, Statics.field1932);
                class107 var1 = new class107(5);
                var1.method2124(15);
                var1.method2127(65);
                Statics.field1885.method2552(var1.field1829, 0, 5);
                field433++;
                Statics.field2521 = class103.method1066();
            }
            if (field433 == 3) {
                if (field265 <= 5 || Statics.field1885.method2550() > 0) {
                    int var2 = Statics.field1885.method2556();
                    if (var2 != 0) {
                        this.method179(var2);
                        return;
                    }
                    field433++;
                } else if (class103.method1066() - Statics.field2521 > 30000L) {
                    this.method179(-2);
                    return;
                }
            }
            if (field433 == 4) {
                class151.method114(Statics.field1885, field265 > 20);
                Statics.field2934 = null;
                Statics.field1885 = null;
                field433 = 0;
                field291 = 0;
            }
        } catch (IOException var4) {
            this.method179(-3);
        }
    }

    @ObfuscatedName("client.z(II)V")
    public void method179(int arg0) {
        Statics.field2934 = null;
        Statics.field1885 = null;
        field433 = 0;
        if (Statics.field296 == Statics.field174) {
            Statics.field174 = Statics.field533;
        } else {
            Statics.field174 = Statics.field296;
        }
        field291++;
        if (field291 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field265 <= 5) {
                this.method2601("js5connect_full");
                field265 = 1000;
            } else {
                field289 = 3000;
            }
        } else if (field291 >= 2 && arg0 == 6) {
            this.method2601("js5connect_outofdate");
            field265 = 1000;
        } else if (field291 >= 4) {
            if (field265 <= 5) {
                this.method2601("js5connect");
                field265 = 1000;
            } else {
                field289 = 3000;
            }
        }
    }

    @ObfuscatedName("dy.j(I)V")
    public static void method2510() {
        if (field287 == 0) {
            Statics.field997 = new class79(4, 104, 104, class6.field89);
            for (int var0 = 0; var0 < 4; var0++) {
                field373[var0] = new class198(104, 104);
            }
            Statics.field1843 = new class72(512, 512);
            class28.field667 = class143.field2318;
            class28.field666 = 5;
            field287 = 20;
        } else if (field287 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1466[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1649(var1, 500, 800, 512, 334);
            class28.field667 = class143.field2154;
            class28.field666 = 10;
            field287 = 30;
        } else if (field287 == 30) {
            Statics.field979 = method768(0, false, true, true);
            Statics.field1287 = method768(1, false, true, true);
            Statics.field1904 = method768(2, true, false, true);
            Statics.field290 = method768(3, false, true, true);
            Statics.field1831 = method768(4, false, true, true);
            Statics.field1337 = method768(5, true, true, true);
            Statics.field154 = method768(6, true, true, false);
            Statics.field107 = method768(7, false, true, true);
            Statics.field2403 = method768(8, false, true, true);
            Statics.field237 = method768(9, false, true, true);
            Statics.field17 = method768(10, false, true, true);
            Statics.field583 = method768(11, false, true, true);
            Statics.field35 = method768(12, false, true, true);
            Statics.field2438 = method768(13, true, false, true);
            Statics.field2761 = method768(14, false, true, false);
            Statics.field1669 = method768(15, false, true, true);
            class28.field667 = class143.field2155;
            class28.field666 = 20;
            field287 = 40;
        } else if (field287 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field979.method2774() * 4 / 100;
            int var8 = var7 + Statics.field1287.method2774() * 4 / 100;
            int var9 = var8 + Statics.field1904.method2774() * 2 / 100;
            int var10 = var9 + Statics.field290.method2774() * 2 / 100;
            int var11 = var10 + Statics.field1831.method2774() * 6 / 100;
            int var12 = var11 + Statics.field1337.method2774() * 4 / 100;
            int var13 = var12 + Statics.field154.method2774() * 2 / 100;
            int var14 = var13 + Statics.field107.method2774() * 60 / 100;
            int var15 = var14 + Statics.field2403.method2774() * 2 / 100;
            int var16 = var15 + Statics.field237.method2774() * 2 / 100;
            int var17 = var16 + Statics.field17.method2774() * 2 / 100;
            int var18 = var17 + Statics.field583.method2774() * 2 / 100;
            int var19 = var18 + Statics.field35.method2774() * 2 / 100;
            int var20 = var19 + Statics.field2438.method2774() * 2 / 100;
            int var21 = var20 + Statics.field2761.method2774() * 2 / 100;
            int var22 = var21 + Statics.field1669.method2774() * 2 / 100;
            if (var22 == 100) {
                class28.field667 = class143.field2157;
                class28.field666 = 30;
                field287 = 45;
            } else {
                if (var22 != 0) {
                    class28.field667 = class143.field2363 + var22 + "%";
                }
                class28.field666 = 30;
            }
        } else if (field287 == 45) {
            class50.method484(22050, !field262, 2);
            class163 var23 = new class163();
            var23.method2997(9, 128);
            Statics.field189 = class50.method493(Statics.field1932, Statics.field131, 0, 22050);
            Statics.field189.method1004(var23);
            class162.method1985(Statics.field1669, Statics.field2761, Statics.field1831, var23);
            Statics.field2389 = class50.method493(Statics.field1932, Statics.field131, 1, 2048);
            Statics.field243 = new class49();
            Statics.field2389.method1004(Statics.field243);
            Statics.field80 = new class68(22050, Statics.field1082);
            class28.field667 = class143.field2158;
            class28.field666 = 35;
            field287 = 50;
        } else if (field287 == 50) {
            int var24 = 0;
            if (Statics.field507 == null) {
                Statics.field507 = class70.method577(Statics.field2403, Statics.field2438, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field2111 == null) {
                Statics.field2111 = class70.method577(Statics.field2403, Statics.field2438, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field253 == null) {
                Statics.field253 = class70.method577(Statics.field2403, Statics.field2438, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field667 = class143.field2159 + var24 * 100 / 3 + "%";
                class28.field666 = 40;
            } else {
                Statics.field59 = new class146(true);
                class28.field667 = class143.field2160;
                class28.field666 = 40;
                field287 = 60;
            }
        } else if (field287 == 60) {
            int var25 = class28.method2442(Statics.field17, Statics.field2403);
            byte var26 = 8;
            if (var25 < var26) {
                class28.field667 = class143.field2161 + var25 * 100 / var26 + "%";
                class28.field666 = 50;
            } else {
                class28.field667 = class143.field2233;
                class28.field666 = 50;
                Statics.method26(5);
                field287 = 70;
            }
        } else if (field287 == 70) {
            if (Statics.field1904.method2678()) {
                class148 var28 = Statics.field1904;
                Statics.field972 = var28;
                class148 var29 = Statics.field1904;
                Statics.field898 = var29;
                class40.method137(Statics.field1904, Statics.field107);
                class148 var30 = Statics.field1904;
                class148 var31 = Statics.field107;
                boolean var32 = field262;
                Statics.field840 = var30;
                Statics.field841 = var31;
                class36.field857 = var32;
                class35.method1857(Statics.field1904, Statics.field107);
                class148 var33 = Statics.field1904;
                class148 var34 = Statics.field107;
                boolean var35 = field261;
                class194 var36 = Statics.field507;
                Statics.field1042 = var33;
                Statics.field1007 = var34;
                Statics.field1016 = var35;
                Statics.field1042.method2684(10);
                Statics.field1899 = var36;
                class148 var37 = Statics.field1904;
                class148 var38 = Statics.field979;
                class148 var39 = Statics.field1287;
                Statics.field918 = var37;
                Statics.field917 = var38;
                Statics.field910 = var39;
                class39.method2653(Statics.field1904, Statics.field107);
                class148 var40 = Statics.field1904;
                Statics.field975 = var40;
                class148 var41 = Statics.field1904;
                Statics.field1056 = var41;
                Statics.field1055 = Statics.field1056.method2684(16);
                class153.method2561(Statics.field290, Statics.field107, Statics.field2403, Statics.field2438);
                class148 var42 = Statics.field1904;
                Statics.field1000 = var42;
                class148 var43 = Statics.field1904;
                Statics.field991 = var43;
                class28.field667 = class143.field2164;
                class28.field666 = 60;
                field287 = 80;
            } else {
                class28.field667 = class143.field2358 + Statics.field1904.method2759() + "%";
                class28.field666 = 60;
            }
        } else if (field287 == 80) {
            int var44 = 0;
            if (Statics.field573 == null) {
                Statics.field573 = class70.method536(Statics.field2403, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field213 == null) {
                Statics.field213 = class70.method536(Statics.field2403, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field2654 == null) {
                Statics.field2654 = Statics.method488(Statics.field2403, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field20 == null) {
                Statics.field20 = class70.method822(Statics.field2403, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field160 == null) {
                Statics.field160 = class70.method822(Statics.field2403, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field794 == null) {
                Statics.field794 = class70.method822(Statics.field2403, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field229 == null) {
                Statics.field229 = class70.method822(Statics.field2403, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field2897 == null) {
                Statics.field2897 = class70.method822(Statics.field2403, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field1635 == null) {
                Statics.field1635 = class70.method822(Statics.field2403, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field2668 == null) {
                Statics.field2668 = class70.method822(Statics.field2403, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field2087 == null) {
                Statics.field2087 = class70.method822(Statics.field2403, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field1335 == null) {
                Statics.field1335 = Statics.method488(Statics.field2403, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field183 == null) {
                Statics.field183 = Statics.method488(Statics.field2403, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field1090 == null) {
                Statics.field1090 = class70.method1319(Statics.field2403, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class28.field667 = class143.field2180 + var44 * 100 / 14 + "%";
                class28.field666 = 70;
            } else {
                Statics.field2919 = Statics.field183;
                Statics.field213.method1437();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field20.length; var49++) {
                    Statics.field20[var49].method1436(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field2654[0].method1585(var45 + var48, var46 + var48, var47 + var48);
                Statics.field245 = new int[33];
                Statics.field78 = new int[33];
                Statics.field155 = new int[151];
                Statics.field2724 = new int[151];
                for (int var50 = 0; var50 < 33; var50++) {
                    int var51 = 999;
                    int var52 = 0;
                    for (int var53 = 0; var53 < 34; var53++) {
                        if (Statics.field1090.field1312[Statics.field1090.field1307 * var50 + var53] == 0) {
                            if (var51 == 999) {
                                var51 = var53;
                            }
                        } else if (var51 != 999) {
                            var52 = var53;
                            break;
                        }
                    }
                    Statics.field245[var50] = var51;
                    Statics.field78[var50] = var52 - var51;
                }
                for (int var54 = 5; var54 < 156; var54++) {
                    int var55 = 999;
                    int var56 = 0;
                    for (int var57 = 25; var57 < 172; var57++) {
                        if (Statics.field1090.field1312[Statics.field1090.field1307 * var54 + var57] == 0 && var57 > 34 || var54 > 34) {
                            if (var55 == 999) {
                                var55 = var57;
                            }
                        } else if (var55 != 999) {
                            var56 = var57;
                            break;
                        }
                    }
                    Statics.field155[var54 - 5] = var55 - 25;
                    Statics.field2724[var54 - 5] = var56 - var55;
                }
                class28.field667 = class143.field2166;
                class28.field666 = 70;
                field287 = 90;
            }
        } else if (field287 == 90) {
            if (Statics.field237.method2678()) {
                class88 var58 = new class88(Statics.field237, Statics.field2403, 20, 0.8D, field262 ? 64 : 128);
                class84.method1808(var58);
                class84.method1834(0.8D);
                class28.field667 = class143.field2168;
                class28.field666 = 90;
                field287 = 110;
            } else {
                class28.field667 = class143.field2177 + Statics.field237.method2759() + "%";
                class28.field666 = 90;
            }
        } else if (field287 == 110) {
            Statics.field622 = new class12();
            Statics.field1932.method2458(Statics.field622, 10);
            class28.field667 = class143.field2220;
            class28.field666 = 94;
            field287 = 120;
        } else if (field287 == 120) {
            if (Statics.field17.method2692("huffman", "")) {
                class102 var59 = new class102(Statics.field17.method2691("huffman", ""));
                class192.method3288(var59);
                class28.field667 = class143.field2296;
                class28.field666 = 96;
                field287 = 130;
            } else {
                class28.field667 = class143.field2170 + "%";
                class28.field666 = 96;
            }
        } else if (field287 == 130) {
            if (!Statics.field290.method2678()) {
                class28.field667 = class143.field2151 + Statics.field290.method2759() * 4 / 5 + "%";
                class28.field666 = 100;
            } else if (!Statics.field35.method2678()) {
                class28.field667 = class143.field2151 + (80 + Statics.field35.method2759() / 6) + "%";
                class28.field666 = 100;
            } else if (Statics.field2438.method2678()) {
                class28.field667 = class143.field2173;
                class28.field666 = 100;
                field287 = 140;
            } else {
                class28.field667 = class143.field2151 + (96 + Statics.field2438.method2759() / 20) + "%";
                class28.field666 = 100;
            }
        } else if (field287 == 140) {
            Statics.method26(10);
        }
    }

    @ObfuscatedName("aj.r(IZZZB)Leh;")
    public static class148 method768(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2071 != null) {
            var4 = new class121(arg0, class136.field2071, Statics.field1853[arg0], 1000000);
        }
        return new class148(var4, Statics.field1979, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("et.c(I)V")
    public static final void method2657() {
        try {
            if (field292 == 0) {
                if (Statics.field2655 != null) {
                    Statics.field2655.method2548();
                    Statics.field2655 = null;
                }
                Statics.field625 = null;
                field312 = false;
                field293 = 0;
                field292 = 1;
            }
            if (field292 == 1) {
                if (Statics.field625 == null) {
                    Statics.field625 = Statics.field1932.method2465(Statics.field531, Statics.field174);
                }
                if (Statics.field625.field2045 == 2) {
                    throw new IOException();
                }
                if (Statics.field625.field2045 == 1) {
                    Statics.field2655 = new class130((Socket) Statics.field625.field2049, Statics.field1932);
                    Statics.field625 = null;
                    field292 = 2;
                }
            }
            if (field292 == 2) {
                field301.field1826 = 0;
                field301.method2124(14);
                Statics.field2655.method2552(field301.field1829, 0, 1);
                field303.field1826 = 0;
                field292 = 3;
            }
            if (field292 == 3) {
                if (Statics.field189 != null) {
                    Statics.field189.method1008();
                }
                if (Statics.field2389 != null) {
                    Statics.field2389.method1008();
                }
                int var0 = Statics.field2655.method2556();
                if (Statics.field189 != null) {
                    Statics.field189.method1008();
                }
                if (Statics.field2389 != null) {
                    Statics.field2389.method1008();
                }
                if (var0 != 0) {
                    method583(var0);
                    return;
                }
                field303.field1826 = 0;
                field292 = 5;
            }
            if (field292 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field301.field1826 = 0;
                field301.method2124(1);
                field301.method2124(class28.field658.method489());
                field301.method2127(var1[0]);
                field301.method2127(var1[1]);
                field301.method2127(var1[2]);
                field301.method2127(var1[3]);
                switch(class28.field658.field2397) {
                    case 0:
                    case 1:
                        field301.method2126(Statics.field144);
                        field301.field1826 += 5;
                        break;
                    case 2:
                        field301.method2127((Integer) Statics.field2430.field142.get(class200.method3106(class28.field671)));
                        field301.field1826 += 4;
                        break;
                    case 3:
                        field301.field1826 += 8;
                }
                field301.method2176(class28.field673);
                field301.method2156(class5.field81, class5.field82);
                field421.field1826 = 0;
                if (field265 == 40) {
                    field421.method2124(18);
                } else {
                    field421.method2124(16);
                }
                field421.method2125(0);
                int var2 = field421.field1826;
                field421.method2127(65);
                field421.method2132(field301.field1829, 0, field301.field1826);
                int var3 = field421.field1826;
                field421.method2176(class28.field671);
                field421.method2124(field262 ? 1 : 0);
                class136.method1419(field421);
                class107 var4 = new class107(Statics.field59.method2664());
                Statics.field59.method2663(var4);
                field421.method2132(var4.field1829, 0, var4.field1829.length);
                field421.method2127(Statics.field979.field2457);
                field421.method2127(Statics.field1287.field2457);
                field421.method2127(Statics.field1904.field2457);
                field421.method2127(Statics.field290.field2457);
                field421.method2127(Statics.field1831.field2457);
                field421.method2127(Statics.field1337.field2457);
                field421.method2127(Statics.field154.field2457);
                field421.method2127(Statics.field107.field2457);
                field421.method2127(Statics.field2403.field2457);
                field421.method2127(Statics.field237.field2457);
                field421.method2127(Statics.field17.field2457);
                field421.method2127(Statics.field583.field2457);
                field421.method2127(Statics.field35.field2457);
                field421.method2127(Statics.field2438.field2457);
                field421.method2127(Statics.field2761.field2457);
                field421.method2127(Statics.field1669.field2457);
                field421.method2154(var1, var3, field421.field1826);
                field421.method2134(field421.field1826 - var2);
                Statics.field2655.method2552(field421.field1829, 0, field421.field1826);
                field301.method2353(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field303.method2353(var1);
                field292 = 6;
            }
            if (field292 == 6 && Statics.field2655.method2550() > 0) {
                int var6 = Statics.field2655.method2556();
                if (var6 == 21 && field265 == 20) {
                    field292 = 7;
                } else if (var6 == 2) {
                    field292 = 9;
                } else if (var6 == 15 && field265 == 40) {
                    method144();
                    return;
                } else if (var6 == 23 && field294 < 1) {
                    field294++;
                    field292 = 0;
                } else {
                    method583(var6);
                    return;
                }
            }
            if (field292 == 7 && Statics.field2655.method2550() > 0) {
                field295 = (Statics.field2655.method2556() + 3) * 60;
                field292 = 8;
            }
            if (field292 == 8) {
                field293 = 0;
                class28.method2070(class143.field2316, class143.field2178, field295 / 60 + class143.field2179);
                if (--field295 <= 0) {
                    field292 = 0;
                }
            } else {
                if (field292 == 9 && Statics.field2655.method2550() >= 13) {
                    boolean var7 = Statics.field2655.method2556() == 1;
                    Statics.field2655.method2551(field303.field1829, 0, 4);
                    field303.field1826 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field303.method2347() << 24;
                        int var10 = var9 | field303.method2347() << 16;
                        int var11 = var10 | field303.method2347() << 8;
                        int var12 = var11 | field303.method2347();
                        int var13 = class200.method3106(class28.field671);
                        if (Statics.field2430.field142.size() >= 10 && !Statics.field2430.field142.containsKey(var13)) {
                            Iterator var14 = Statics.field2430.field142.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2430.field142.put(var13, var12);
                        Statics.method910();
                    }
                    field427 = Statics.field2655.method2556();
                    field429 = Statics.field2655.method2556() == 1;
                    field384 = Statics.field2655.method2556();
                    field384 <<= 0x8;
                    field384 += Statics.field2655.method2556();
                    field314 = Statics.field2655.method2556();
                    Statics.field2655.method2551(field303.field1829, 0, 1);
                    field303.field1826 = 0;
                    field305 = field303.method2347();
                    Statics.field2655.method2551(field303.field1829, 0, 2);
                    field303.field1826 = 0;
                    field304 = field303.method2140();
                    if (field314 == 1) {
                        try {
                            class119.method2423(Statics.field401, "zap");
                        } catch (Throwable var33) {
                        }
                    } else {
                        try {
                            class119.method2423(Statics.field401, "unzap");
                        } catch (Throwable var32) {
                        }
                    }
                    field292 = 10;
                }
                if (field292 != 10) {
                    field293++;
                    if (field293 > 2000) {
                        if (field294 < 1) {
                            if (Statics.field296 == Statics.field174) {
                                Statics.field174 = Statics.field533;
                            } else {
                                Statics.field174 = Statics.field296;
                            }
                            field294++;
                            field292 = 0;
                        } else {
                            method583(-3);
                        }
                    }
                } else if (Statics.field2655.method2550() >= field304) {
                    field303.field1826 = 0;
                    Statics.field2655.method2551(field303.field1829, 0, field304);
                    field412 = -1L;
                    field434 = -1;
                    Statics.field622.field186 = 0;
                    Statics.field16 = true;
                    field454 = true;
                    field481 = -1L;
                    class190.field2898 = new class181();
                    field301.field1826 = 0;
                    field303.field1826 = 0;
                    field305 = -1;
                    field309 = -1;
                    field364 = -1;
                    field362 = -1;
                    field306 = 0;
                    field274 = 0;
                    field308 = 0;
                    field392 = 0;
                    field402 = 0;
                    field403 = false;
                    class127.field1991 = 0;
                    class10.method759();
                    field413 = 0;
                    field415 = false;
                    field322 = 0;
                    field323 = (int) (Math.random() * 100.0D) - 50;
                    field319 = (int) (Math.random() * 110.0D) - 55;
                    field327 = (int) (Math.random() * 80.0D) - 40;
                    field400 = (int) (Math.random() * 120.0D) - 60;
                    field332 = (int) (Math.random() * 30.0D) - 20;
                    field343 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field280 = 0;
                    field484 = -1;
                    field489 = 0;
                    field490 = 0;
                    field286 = class18.field532;
                    field379 = 0;
                    field299 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field521[var17] = null;
                        field491[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field298[var18] = null;
                    }
                    Statics.field1751 = field521[2047] = new class3();
                    field385 = -1;
                    field395.method3180();
                    field396.method3180();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field393[var19][var20][var21] = null;
                            }
                        }
                    }
                    field394 = new class178();
                    field302 = 0;
                    field509 = 0;
                    field513 = 0;
                    for (int var22 = 0; var22 < Statics.field1055; var22++) {
                        class46 var23 = class46.method2544(var22);
                        if (var23 != null) {
                            class155.field2664[var22] = 0;
                            class155.field2663[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field455.length; var24++) {
                        field455[var24] = -1;
                    }
                    field428 = -1;
                    if (field420 != -1) {
                        int var25 = field420;
                        if (var25 != -1 && Statics.field2567[var25]) {
                            Statics.field2524.method2686(var25);
                            if (Statics.field2545[var25] != null) {
                                boolean var26 = true;
                                for (int var27 = 0; var27 < Statics.field2545[var25].length; var27++) {
                                    if (Statics.field2545[var25][var27] != null) {
                                        if (Statics.field2545[var25][var27].field2534 == 2) {
                                            var26 = false;
                                        } else {
                                            Statics.field2545[var25][var27] = null;
                                        }
                                    }
                                }
                                if (var26) {
                                    Statics.field2545[var25] = null;
                                }
                                Statics.field2567[var25] = false;
                            }
                        }
                    }
                    for (class4 var28 = (class4) field351.method3153(); var28 != null; var28 = (class4) field351.method3151()) {
                        method589(var28, true);
                    }
                    field420 = -1;
                    field351 = new class175(8);
                    field424 = null;
                    field403 = false;
                    field402 = 0;
                    field515.method2867((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field350[var29] = null;
                        field390[var29] = false;
                    }
                    class14.field209 = new class175(32);
                    field266 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field482[var30] = true;
                    }
                    field494 = null;
                    Statics.field2090 = 0;
                    Statics.field1794 = null;
                    Statics.field519 = -1;
                    method843(false);
                    field305 = -1;
                }
            }
        } catch (IOException var34) {
            if (field294 < 1) {
                if (Statics.field296 == Statics.field174) {
                    Statics.field174 = Statics.field533;
                } else {
                    Statics.field174 = Statics.field296;
                }
                field294++;
                field292 = 0;
            } else {
                method583(-2);
            }
        }
    }

    @ObfuscatedName("z.u(I)V")
    public static void method144() {
        field301.field1826 = 0;
        field303.field1826 = 0;
        field305 = -1;
        field309 = -1;
        field364 = -1;
        field362 = -1;
        field304 = 0;
        field306 = 0;
        field274 = 0;
        field402 = 0;
        field403 = false;
        field280 = 0;
        field489 = 0;
        for (int var0 = 0; var0 < field521.length; var0++) {
            if (field521[var0] != null) {
                field521[var0].field784 = -1;
            }
        }
        for (int var1 = 0; var1 < field298.length; var1++) {
            if (field298[var1] != null) {
                field298[var1].field784 = -1;
            }
        }
        class14.field209 = new class175(32);
        Statics.method26(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field482[var2] = true;
        }
    }

    @ObfuscatedName("ar.h(II)V")
    public static void method583(int arg0) {
        if (arg0 == -3) {
            class28.method2070(class143.field2276, class143.field2258, class143.field2376);
        } else if (arg0 == -2) {
            class28.method2070(class143.field2183, class143.field2331, class143.field2185);
        } else if (arg0 == -1) {
            class28.method2070(class143.field2186, class143.field2187, class143.field2188);
        } else if (arg0 == 3) {
            class28.method2070(class143.field2189, class143.field2181, class143.field2191);
        } else if (arg0 == 4) {
            class28.method2070(class143.field2192, class143.field2262, class143.field2194);
        } else if (arg0 == 5) {
            class28.method2070(class143.field2143, class143.field2320, class143.field2197);
        } else if (arg0 == 6) {
            class28.method2070(class143.field2198, class143.field2375, class143.field2200);
        } else if (arg0 == 7) {
            class28.method2070(class143.field2351, class143.field2202, class143.field2259);
        } else if (arg0 == 8) {
            class28.method2070(class143.field2204, class143.field2205, class143.field2206);
        } else if (arg0 == 9) {
            class28.method2070(class143.field2207, class143.field2167, class143.field2209);
        } else if (arg0 == 10) {
            class28.method2070(class143.field2210, class143.field2211, class143.field2212);
        } else if (arg0 == 11) {
            class28.method2070(class143.field2223, class143.field2214, class143.field2267);
        } else if (arg0 == 12) {
            class28.method2070(class143.field2216, class143.field2308, class143.field2218);
        } else if (arg0 == 13) {
            class28.method2070(class143.field2219, class143.field2370, class143.field2221);
        } else if (arg0 == 14) {
            class28.method2070(class143.field2222, class143.field2165, class143.field2224);
        } else if (arg0 == 16) {
            class28.method2070(class143.field2225, class143.field2226, class143.field2227);
        } else if (arg0 == 17) {
            class28.method2070(class143.field2228, class143.field2229, class143.field2230);
        } else if (arg0 == 18) {
            class28.method2070(class143.field2231, class143.field2232, class143.field2182);
        } else if (arg0 == 19) {
            class28.method2070(class143.field2384, class143.field2235, class143.field2236);
        } else if (arg0 == 20) {
            class28.method2070(class143.field2237, class143.field2238, class143.field2239);
        } else if (arg0 == 22) {
            class28.method2070(class143.field2240, class143.field2241, class143.field2215);
        } else if (arg0 == 23) {
            class28.method2070(class143.field2243, class143.field2244, class143.field2245);
        } else if (arg0 == 24) {
            class28.method2070(class143.field2246, class143.field2203, class143.field2248);
        } else if (arg0 == 25) {
            class28.method2070(class143.field2249, class143.field2250, class143.field2251);
        } else if (arg0 == 26) {
            class28.method2070(class143.field2252, class143.field2288, class143.field2254);
        } else if (arg0 == 27) {
            class28.method2070(class143.field2255, class143.field2256, class143.field2369);
        } else if (arg0 == 31) {
            class28.method2070(class143.field2264, class143.field2286, class143.field2266);
        } else if (arg0 == 32) {
            class28.method2070(class143.field2283, class143.field2268, class143.field2269);
        } else if (arg0 == 37) {
            class28.method2070(class143.field2270, class143.field2271, class143.field2272);
        } else if (arg0 == 38) {
            class28.method2070(class143.field2295, class143.field2234, class143.field2275);
        } else if (arg0 == 55) {
            class28.method2070(class143.field2247, class143.field2277, class143.field2329);
        } else if (arg0 == 56) {
            class28.method2070(class143.field2279, class143.field2280, class143.field2368);
            Statics.method26(11);
            return;
        } else if (arg0 == 57) {
            class28.method2070(class143.field2282, class143.field2380, class143.field2284);
            Statics.method26(11);
            return;
        } else {
            class28.method2070(class143.field2285, class143.field2184, class143.field2287);
        }
        Statics.method26(10);
    }

    @ObfuscatedName("g.t(I)V")
    public static final void method509() {
        if (Statics.field2655 != null) {
            Statics.field2655.method2548();
            Statics.field2655 = null;
        }
        method159();
        Statics.field997.method1667();
        for (int var0 = 0; var0 < 4; var0++) {
            field373[var0].method3436();
        }
        System.gc();
        class162.method546(2);
        field493 = -1;
        field288 = false;
        for (class20 var1 = (class20) class20.field571.method3179(); var1 != null; var1 = (class20) class20.field571.method3199()) {
            if (var1.field570 != null) {
                Statics.field243.method957(var1.field570);
                var1.field570 = null;
            }
            if (var1.field567 != null) {
                Statics.field243.method957(var1.field567);
                var1.field567 = null;
            }
        }
        class20.field571.method3180();
        Statics.method26(10);
    }

    @ObfuscatedName("r.f(B)V")
    public static final void method159() {
        class41.field958.method3124();
        Statics.method1885();
        class40.method619();
        class36.field842.method3124();
        class36.field843.method3124();
        class36.field882.method3124();
        class36.field876.method3124();
        class35.field799.method3124();
        class35.field800.method3124();
        class45.field1009.method3124();
        class45.field1027.method3124();
        class45.field1011.method3124();
        class38.field902.method3124();
        class38.field903.method3124();
        class39.method45();
        class42.field974.method3124();
        class46.method2658();
        class158.field2686.method3124();
        class153.field2527.method3124();
        class153.field2528.method3124();
        class153.field2529.method3124();
        ((class88) Statics.field1463).method1865();
        class19.field550.method3124();
        Statics.field979.method2687();
        Statics.field1287.method2687();
        Statics.field290.method2687();
        Statics.field1831.method2687();
        Statics.field1337.method2687();
        Statics.field154.method2687();
        Statics.field107.method2687();
        Statics.field2403.method2687();
        Statics.field237.method2687();
        Statics.field17.method2687();
        Statics.field583.method2687();
        Statics.field35.method2687();
    }

    @ObfuscatedName("o.g(I)V")
    public static final void method136() {
        if (field308 > 0) {
            method509();
        } else {
            Statics.method26(40);
            Statics.field1500 = Statics.field2655;
            Statics.field2655 = null;
        }
    }

    @ObfuscatedName("cb.s(I)V")
    public static final void method1783() {
        if (Statics.field2389 != null) {
            Statics.field2389.method1005();
        }
        if (Statics.field189 != null) {
            Statics.field189.method1005();
        }
    }

    @ObfuscatedName("cf.y(Las;IIIB)V")
    public static void method2080(class38 arg0, int arg1, int arg2, int arg3) {
        if (field322 >= 50 || field254 == 0 || arg0.field907 == null || arg1 >= arg0.field907.length) {
            return;
        }
        int var4 = arg0.field907[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field498[field322] = var5;
        field388[field322] = var6;
        field500[field322] = 0;
        field344[field322] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field470[field322] = (var8 << 16) + (var9 << 8) + var7;
        field322++;
    }

    @ObfuscatedName("z.p(III)V")
    public static void method145(int arg0, int arg1) {
        if (field418 != 0 && arg0 != -1) {
            class162.method2519(Statics.field583, arg0, 0, field418, false);
            field288 = true;
        }
    }

    @ObfuscatedName("dd.b(B)V")
    public static final void method2569() {
        if (field262 && Statics.field83 != field313) {
            method551(Statics.field519, Statics.field1495, Statics.field83, Statics.field1751.field785[0], Statics.field1751.field780[0]);
        } else if (Statics.field83 != field484) {
            field484 = Statics.field83;
            method34(Statics.field83);
        }
    }

    @ObfuscatedName("aj.l(I)V")
    public static final void method752() {
        for (int var0 = -1; var0 < field379; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field380[var0];
            }
            class3 var2 = field521[var1];
            if (var2 != null && var2.field760 > 0) {
                var2.field760--;
                if (var2.field760 == 0) {
                    var2.field744 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field299; var3++) {
            int var4 = field300[var3];
            class30 var5 = field298[var4];
            if (var5 != null && var5.field760 > 0) {
                var5.field760--;
                if (var5.field760 == 0) {
                    var5.field744 = null;
                }
            }
        }
    }

    @ObfuscatedName("ew.al(I)V")
    public static final void method2656() {
        for (int var0 = -1; var0 < field379; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field380[var0];
            }
            class3 var2 = field521[var1];
            if (var2 != null) {
                method579(var2, 1);
            }
        }
    }

    @ObfuscatedName("ci.aa(I)V")
    public static final void method1978() {
        for (int var0 = 0; var0 < field299; var0++) {
            int var1 = field300[var0];
            class30 var2 = field298[var1];
            if (var2 != null) {
                method579(var2, var2.field698.field803);
            }
        }
    }

    @ObfuscatedName("ar.ar(Lav;II)V")
    public static final void method579(class33 arg0, int arg1) {
        if (arg0.field790 > field440) {
            int var2 = arg0.field790 - field440;
            int var3 = arg0.field776 * 128 + arg0.field735 * 64;
            int var4 = arg0.field774 * 128 + arg0.field735 * 64;
            arg0.field772 += (var3 - arg0.field772) / var2;
            arg0.field732 += (var4 - arg0.field732) / var2;
            arg0.field734 = 0;
            if (arg0.field778 == 0) {
                arg0.field781 = 1024;
            }
            if (arg0.field778 == 1) {
                arg0.field781 = 1536;
            }
            if (arg0.field778 == 2) {
                arg0.field781 = 0;
            }
            if (arg0.field778 == 3) {
                arg0.field781 = 512;
            }
        } else if (arg0.field737 >= field440) {
            method27(arg0);
        } else {
            method1884(arg0);
        }
        if (arg0.field772 < 128 || arg0.field732 < 128 || arg0.field772 >= 13184 || arg0.field732 >= 13184) {
            arg0.field762 = -1;
            arg0.field765 = -1;
            arg0.field790 = 0;
            arg0.field737 = 0;
            arg0.field772 = arg0.field785[0] * 128 + arg0.field735 * 64;
            arg0.field732 = arg0.field780[0] * 128 + arg0.field735 * 64;
            arg0.method612();
        }
        if (Statics.field1751 == arg0 && (arg0.field772 < 1536 || arg0.field732 < 1536 || arg0.field772 >= 11776 || arg0.field732 >= 11776)) {
            arg0.field762 = -1;
            arg0.field765 = -1;
            arg0.field790 = 0;
            arg0.field737 = 0;
            arg0.field772 = arg0.field785[0] * 128 + arg0.field735 * 64;
            arg0.field732 = arg0.field780[0] * 128 + arg0.field735 * 64;
            arg0.method612();
        }
        method30(arg0);
        arg0.field786 = false;
        if (arg0.field759 != -1) {
            class38 var5 = class38.method658(arg0.field759);
            if (var5 == null || var5.field916 == null) {
                arg0.field759 = -1;
            } else {
                arg0.field789++;
                if (arg0.field752 < var5.field916.length && arg0.field789 > var5.field906[arg0.field752]) {
                    arg0.field789 = 1;
                    arg0.field752++;
                    method2080(var5, arg0.field752, arg0.field772, arg0.field732);
                }
                if (arg0.field752 >= var5.field916.length) {
                    arg0.field789 = 0;
                    arg0.field752 = 0;
                    method2080(var5, arg0.field752, arg0.field772, arg0.field732);
                }
            }
        }
        if (arg0.field765 != -1 && field440 >= arg0.field770) {
            if (arg0.field756 < 0) {
                arg0.field756 = 0;
            }
            int var6 = class39.method138(arg0.field765).field928;
            if (var6 == -1) {
                arg0.field765 = -1;
            } else {
                class38 var7 = class38.method658(var6);
                if (var7 == null || var7.field916 == null) {
                    arg0.field765 = -1;
                } else {
                    arg0.field769++;
                    if (arg0.field756 < var7.field916.length && arg0.field769 > var7.field906[arg0.field756]) {
                        arg0.field769 = 1;
                        arg0.field756++;
                        method2080(var7, arg0.field756, arg0.field772, arg0.field732);
                    }
                    if (arg0.field756 >= var7.field916.length && (arg0.field756 < 0 || arg0.field756 >= var7.field916.length)) {
                        arg0.field765 = -1;
                    }
                }
            }
        }
        if (arg0.field762 != -1 && arg0.field747 <= 1) {
            class38 var8 = class38.method658(arg0.field762);
            if (var8.field915 == 1 && arg0.field731 > 0 && arg0.field790 <= field440 && arg0.field737 < field440) {
                arg0.field747 = 1;
                return;
            }
        }
        if (arg0.field762 != -1 && arg0.field747 == 0) {
            class38 var9 = class38.method658(arg0.field762);
            if (var9 == null || var9.field916 == null) {
                arg0.field762 = -1;
            } else {
                arg0.field764++;
                if (arg0.field763 < var9.field916.length && arg0.field764 > var9.field906[arg0.field763]) {
                    arg0.field764 = 1;
                    arg0.field763++;
                    method2080(var9, arg0.field763, arg0.field772, arg0.field732);
                }
                if (arg0.field763 >= var9.field916.length) {
                    arg0.field763 -= var9.field908;
                    arg0.field766++;
                    if (arg0.field766 >= var9.field914) {
                        arg0.field762 = -1;
                    } else if (arg0.field763 >= 0 && arg0.field763 < var9.field916.length) {
                        method2080(var9, arg0.field763, arg0.field772, arg0.field732);
                    } else {
                        arg0.field762 = -1;
                    }
                }
                arg0.field786 = var9.field904;
            }
        }
        if (arg0.field747 > 0) {
            arg0.field747--;
        }
    }

    @ObfuscatedName("i.ak(Lav;S)V")
    public static final void method27(class33 arg0) {
        if (field440 == arg0.field737 || arg0.field762 == -1 || arg0.field747 != 0 || arg0.field764 + 1 > class38.method658(arg0.field762).field906[arg0.field763]) {
            int var1 = arg0.field737 - arg0.field790;
            int var2 = field440 - arg0.field790;
            int var3 = arg0.field776 * 128 + arg0.field735 * 64;
            int var4 = arg0.field774 * 128 + arg0.field735 * 64;
            int var5 = arg0.field773 * 128 + arg0.field735 * 64;
            int var6 = arg0.field775 * 128 + arg0.field735 * 64;
            arg0.field772 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field732 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field734 = 0;
        if (arg0.field778 == 0) {
            arg0.field781 = 1024;
        }
        if (arg0.field778 == 1) {
            arg0.field781 = 1536;
        }
        if (arg0.field778 == 2) {
            arg0.field781 = 0;
        }
        if (arg0.field778 == 3) {
            arg0.field781 = 512;
        }
        arg0.field733 = arg0.field781;
    }

    @ObfuscatedName("cj.ay(Lav;I)V")
    public static final void method1884(class33 arg0) {
        arg0.field759 = arg0.field736;
        if (arg0.field777 == 0) {
            arg0.field734 = 0;
            return;
        }
        if (arg0.field762 != -1 && arg0.field747 == 0) {
            class38 var1 = class38.method658(arg0.field762);
            if (arg0.field731 > 0 && var1.field915 == 0) {
                arg0.field734++;
                return;
            }
            if (arg0.field731 <= 0 && var1.field901 == 0) {
                arg0.field734++;
                return;
            }
        }
        int var2 = arg0.field772;
        int var3 = arg0.field732;
        int var4 = arg0.field785[arg0.field777 - 1] * 128 + arg0.field735 * 64;
        int var5 = arg0.field780[arg0.field777 - 1] * 128 + arg0.field735 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field772 = var4;
            arg0.field732 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field781 = 1280;
            } else if (var3 > var5) {
                arg0.field781 = 1792;
            } else {
                arg0.field781 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field781 = 768;
            } else if (var3 > var5) {
                arg0.field781 = 256;
            } else {
                arg0.field781 = 512;
            }
        } else if (var3 < var5) {
            arg0.field781 = 1024;
        } else if (var3 > var5) {
            arg0.field781 = 0;
        }
        int var6 = arg0.field781 - arg0.field733 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field740;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field768;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field742;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field741;
        }
        if (var7 == -1) {
            var7 = arg0.field768;
        }
        arg0.field759 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field698.field831;
        }
        if (var9) {
            if (arg0.field781 != arg0.field733 && arg0.field784 == -1 && arg0.field783 != 0) {
                var8 = 2;
            }
            if (arg0.field777 > 2) {
                var8 = 6;
            }
            if (arg0.field777 > 3) {
                var8 = 8;
            }
            if (arg0.field734 > 0 && arg0.field777 > 1) {
                var8 = 8;
                arg0.field734--;
            }
        } else {
            if (arg0.field777 > 1) {
                var8 = 6;
            }
            if (arg0.field777 > 2) {
                var8 = 8;
            }
            if (arg0.field734 > 0 && arg0.field777 > 1) {
                var8 = 8;
                arg0.field734--;
            }
        }
        if (arg0.field787[arg0.field777 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field768 == arg0.field759 && arg0.field743 != -1) {
            arg0.field759 = arg0.field743;
        }
        if (var2 < var4) {
            arg0.field772 += var8;
            if (arg0.field772 > var4) {
                arg0.field772 = var4;
            }
        } else if (var2 > var4) {
            arg0.field772 -= var8;
            if (arg0.field772 < var4) {
                arg0.field772 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field732 += var8;
            if (arg0.field732 > var5) {
                arg0.field732 = var5;
            }
        } else if (var3 > var5) {
            arg0.field732 -= var8;
            if (arg0.field732 < var5) {
                arg0.field732 = var5;
            }
        }
        if (arg0.field772 == var4 && arg0.field732 == var5) {
            arg0.field777--;
            if (arg0.field731 > 0) {
                arg0.field731--;
            }
        }
    }

    @ObfuscatedName("d.aw(Lav;I)V")
    public static final void method30(class33 arg0) {
        if (arg0.field783 == 0) {
            return;
        }
        if (arg0.field784 != -1 && arg0.field784 < 32768) {
            class30 var1 = field298[arg0.field784];
            if (var1 != null) {
                int var2 = arg0.field772 - var1.field772;
                int var3 = arg0.field732 - var1.field732;
                if (var2 != 0 || var3 != 0) {
                    arg0.field781 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field784 >= 32768) {
            int var4 = arg0.field784 - 32768;
            if (field384 == var4) {
                var4 = 2047;
            }
            class3 var5 = field521[var4];
            if (var5 != null) {
                int var6 = arg0.field772 - var5.field772;
                int var7 = arg0.field732 - var5.field732;
                if (var6 != 0 || var7 != 0) {
                    arg0.field781 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field757 != 0 || arg0.field753 != 0) && (arg0.field777 == 0 || arg0.field734 > 0)) {
            int var8 = arg0.field772 - (arg0.field757 * 64 - Statics.field1791 * 64 - Statics.field1791 * 64);
            int var9 = arg0.field732 - (arg0.field753 * 64 - Statics.field1002 * 64 - Statics.field1002 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field781 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field757 = 0;
            arg0.field753 = 0;
        }
        int var10 = arg0.field781 - arg0.field733 & 0x7FF;
        if (var10 == 0) {
            arg0.field782 = 0;
            return;
        }
        arg0.field782++;
        if (var10 > 1024) {
            arg0.field733 -= arg0.field783;
            boolean var11 = true;
            if (var10 < arg0.field783 || var10 > 2048 - arg0.field783) {
                arg0.field733 = arg0.field781;
                var11 = false;
            }
            if (arg0.field759 == arg0.field736 && (arg0.field782 > 25 || var11)) {
                if (arg0.field788 == -1) {
                    arg0.field759 = arg0.field768;
                } else {
                    arg0.field759 = arg0.field788;
                }
            }
        } else {
            arg0.field733 += arg0.field783;
            boolean var12 = true;
            if (var10 < arg0.field783 || var10 > 2048 - arg0.field783) {
                arg0.field733 = arg0.field781;
                var12 = false;
            }
            if (arg0.field759 == arg0.field736 && (arg0.field782 > 25 || var12)) {
                if (arg0.field738 == -1) {
                    arg0.field759 = arg0.field768;
                } else {
                    arg0.field759 = arg0.field738;
                }
            }
        }
        arg0.field733 &= 0x7FF;
    }

    @ObfuscatedName("es.av(Lk;IIB)V")
    public static void method2646(class3 arg0, int arg1, int arg2) {
        if (arg0.field762 == arg1 && arg1 != -1) {
            int var3 = class38.method658(arg1).field899;
            if (var3 == 1) {
                arg0.field763 = 0;
                arg0.field764 = 0;
                arg0.field747 = arg2;
                arg0.field766 = 0;
            }
            if (var3 == 2) {
                arg0.field766 = 0;
            }
        } else if (arg1 == -1 || arg0.field762 == -1 || class38.method658(arg1).field911 >= class38.method658(arg0.field762).field911) {
            arg0.field762 = arg1;
            arg0.field763 = 0;
            arg0.field764 = 0;
            arg0.field747 = arg2;
            arg0.field766 = 0;
            arg0.field731 = arg0.field777;
        }
    }

    @ObfuscatedName("bm.at(B)V")
    public static final void method1608() {
        if (field420 != -1) {
            int var0 = field420;
            if (class153.method2384(var0)) {
                method2586(Statics.field2545[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field462; var1++) {
            if (field482[var1]) {
                field410[var1] = true;
            }
            field466[var1] = field482[var1];
            field482[var1] = false;
        }
        field463 = field440;
        field409 = -1;
        field315 = -1;
        Statics.field699 = null;
        if (field420 != -1) {
            field462 = 0;
            method148(field420, 0, 0, 765, 503, 0, 0, -1);
        }
        class73.method1527();
        if (field403) {
            method1611();
        } else if (field409 != -1) {
            method2627(field409, field315);
        }
        if (field471 == 3) {
            for (int var2 = 0; var2 < field462; var2++) {
                if (field466[var2]) {
                    class73.method1533(field467[var2], field459[var2], field469[var2], field497[var2], 16711935, 128);
                } else if (field410[var2]) {
                    class73.method1533(field467[var2], field459[var2], field469[var2], field497[var2], 16711680, 128);
                }
            }
        }
        class20.method2068(Statics.field83, Statics.field1751.field772, Statics.field1751.field732, field335);
        field335 = 0;
    }

    @ObfuscatedName("ar.af(Ljava/lang/String;ZB)V")
    public static final void method582(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2111.method3363(arg0, 250);
        int var6 = Statics.field2111.method3295(arg0, 250) * 13;
        class73.method1534(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1536(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2111.method3307(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method135(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field131.getGraphics();
                Statics.field1668.method1348(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field131.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field462; var13++) {
            if (field469[var13] + field467[var13] > var9 && field467[var13] < var9 + var11 && field497[var13] + field459[var13] > var10 && field459[var13] < var10 + var12) {
                field410[var13] = true;
            }
        }
    }

    @ObfuscatedName("u.ae(IIIIB)V")
    public static final void method162(int arg0, int arg1, int arg2, int arg3) {
        class73.method1528(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1784();
        field330++;
        method552(class29.field695);
        boolean var4 = false;
        if (field385 >= 0) {
            for (int var5 = 0; var5 < field379; var5++) {
                if (field385 == field380[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method552(class29.field689);
        }
        method506(true);
        method552(var4 ? class29.field691 : class29.field692);
        method506(false);
        for (class7 var6 = (class7) field395.method3179(); var6 != null; var6 = (class7) field395.method3199()) {
            if (Statics.field83 != var6.field104 || field440 > var6.field119) {
                var6.method3277();
            } else if (field440 >= var6.field110) {
                if (var6.field113 > 0) {
                    class30 var7 = field298[var6.field113 - 1];
                    if (var7 != null && var7.field772 >= 0 && var7.field772 < 13312 && var7.field732 >= 0 && var7.field732 < 13312) {
                        var6.method87(var7.field772, var7.field732, method1782(var7.field772, var7.field732, var6.field104) - var6.field108, field440);
                    }
                }
                if (var6.field113 < 0) {
                    int var8 = -var6.field113 - 1;
                    class3 var9;
                    if (field384 == var8) {
                        var9 = Statics.field1751;
                    } else {
                        var9 = field521[var8];
                    }
                    if (var9 != null && var9.field772 >= 0 && var9.field772 < 13312 && var9.field732 >= 0 && var9.field732 < 13312) {
                        var6.method87(var9.field772, var9.field732, method1782(var9.field772, var9.field732, var6.field104) - var6.field108, field440);
                    }
                }
                var6.method88(field335);
                Statics.field997.method1625(Statics.field83, (int) var6.field115, (int) var6.field116, (int) var6.field117, 60, var6, var6.field123, -1, false);
            }
        }
        for (class26 var10 = (class26) field396.method3179(); var10 != null; var10 = (class26) field396.method3199()) {
            if (Statics.field83 != var10.field634 || var10.field632) {
                var10.method3277();
            } else if (field440 >= var10.field624) {
                var10.method547(field335);
                if (var10.field632) {
                    var10.method3277();
                } else {
                    Statics.field997.method1625(var10.field634, var10.field626, var10.field623, var10.field628, 60, var10, 0, -1, false);
                }
            }
        }
        if (!field503) {
            int var11 = field501;
            if (field349 / 256 > var11) {
                var11 = field349 / 256;
            }
            if (field504[4] && field506[4] + 128 > var11) {
                var11 = field506[4] + 128;
            }
            int var12 = field343 + field327 & 0x7FF;
            int var13 = Statics.field965;
            int var14 = method1782(Statics.field1751.field772, Statics.field1751.field732, Statics.field83) - 50;
            int var15 = Statics.field1867;
            int var16 = var11 * 3 + 600;
            int var17 = 2048 - var11 & 0x7FF;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 0;
            int var20 = 0;
            int var21 = var16;
            if (var17 != 0) {
                int var22 = class84.field1466[var17];
                int var23 = class84.field1467[var17];
                int var24 = var20 * var23 - var16 * var22 >> 16;
                var21 = var20 * var22 + var16 * var23 >> 16;
                var20 = var24;
            }
            if (var18 != 0) {
                int var25 = class84.field1466[var18];
                int var26 = class84.field1467[var18];
                int var27 = var19 * var26 + var21 * var25 >> 16;
                var21 = var21 * var26 - var19 * var25 >> 16;
                var19 = var27;
            }
            Statics.field1878 = var13 - var19;
            Statics.field1247 = var14 - var20;
            Statics.field758 = var15 - var21;
            Statics.field703 = var11;
            Statics.field105 = var12;
        }
        int var40;
        if (field503) {
            var40 = method134();
        } else {
            int var28;
            if (Statics.field2430.field140) {
                var28 = Statics.field83;
            } else {
                int var29 = 3;
                if (Statics.field703 < 310) {
                    int var30 = Statics.field1878 >> 7;
                    int var31 = Statics.field758 >> 7;
                    int var32 = Statics.field1751.field772 >> 7;
                    int var33 = Statics.field1751.field732 >> 7;
                    if ((class6.field85[Statics.field83][var30][var31] & 0x4) != 0) {
                        var29 = Statics.field83;
                    }
                    int var34;
                    if (var32 > var30) {
                        var34 = var32 - var30;
                    } else {
                        var34 = var30 - var32;
                    }
                    int var35;
                    if (var33 > var31) {
                        var35 = var33 - var31;
                    } else {
                        var35 = var31 - var33;
                    }
                    if (var34 > var35) {
                        int var36 = var35 * 65536 / var34;
                        int var37 = 32768;
                        while (var30 != var32) {
                            if (var30 < var32) {
                                var30++;
                            } else if (var30 > var32) {
                                var30--;
                            }
                            if ((class6.field85[Statics.field83][var30][var31] & 0x4) != 0) {
                                var29 = Statics.field83;
                            }
                            var37 += var36;
                            if (var37 >= 65536) {
                                var37 -= 65536;
                                if (var31 < var33) {
                                    var31++;
                                } else if (var31 > var33) {
                                    var31--;
                                }
                                if ((class6.field85[Statics.field83][var30][var31] & 0x4) != 0) {
                                    var29 = Statics.field83;
                                }
                            }
                        }
                    } else {
                        int var38 = var34 * 65536 / var35;
                        int var39 = 32768;
                        while (var31 != var33) {
                            if (var31 < var33) {
                                var31++;
                            } else if (var31 > var33) {
                                var31--;
                            }
                            if ((class6.field85[Statics.field83][var30][var31] & 0x4) != 0) {
                                var29 = Statics.field83;
                            }
                            var39 += var38;
                            if (var39 >= 65536) {
                                var39 -= 65536;
                                if (var30 < var32) {
                                    var30++;
                                } else if (var30 > var32) {
                                    var30--;
                                }
                                if ((class6.field85[Statics.field83][var30][var31] & 0x4) != 0) {
                                    var29 = Statics.field83;
                                }
                            }
                        }
                    }
                }
                if ((class6.field85[Statics.field83][Statics.field1751.field772 >> 7][Statics.field1751.field732 >> 7] & 0x4) != 0) {
                    var29 = Statics.field83;
                }
                var28 = var29;
            }
            var40 = var28;
        }
        int var41 = Statics.field1878;
        int var42 = Statics.field1247;
        int var43 = Statics.field758;
        int var44 = Statics.field703;
        int var45 = Statics.field105;
        for (int var46 = 0; var46 < 5; var46++) {
            if (field504[var46]) {
                int var47 = (int) (Math.random() * (double) (field505[var46] * 2 + 1) - (double) field505[var46] + Math.sin((double) field353[var46] / 100.0D * (double) field508[var46]) * (double) field506[var46]);
                if (var46 == 0) {
                    Statics.field1878 += var47;
                }
                if (var46 == 1) {
                    Statics.field1247 += var47;
                }
                if (var46 == 2) {
                    Statics.field758 += var47;
                }
                if (var46 == 3) {
                    Statics.field105 = Statics.field105 + var47 & 0x7FF;
                }
                if (var46 == 4) {
                    Statics.field703 += var47;
                    if (Statics.field703 < 128) {
                        Statics.field703 = 128;
                    }
                    if (Statics.field703 > 383) {
                        Statics.field703 = 383;
                    }
                }
            }
        }
        int var48 = class127.field1989;
        int var49 = class127.field1990;
        if (class127.field1998 != 0) {
            var48 = class127.field1996;
            var49 = class127.field1997;
        }
        if (var48 >= arg0 && var48 < arg0 + arg2 && var49 >= arg1 && var49 < arg1 + arg3) {
            class98.field1734 = true;
            class98.field1682 = 0;
            class98.field1735 = var48 - arg0;
            class98.field1736 = var49 - arg1;
        } else {
            class98.field1734 = false;
            class98.field1682 = 0;
        }
        method1783();
        class73.method1534(arg0, arg1, arg2, arg3, 0);
        method1783();
        Statics.field997.method1652(Statics.field1878, Statics.field1247, Statics.field758, Statics.field703, Statics.field105, var40);
        method1783();
        Statics.field997.method1628();
        field495 = 0;
        boolean var50 = false;
        int var51 = -1;
        for (int var52 = -1; var52 < field379 + field299; var52++) {
            class33 var53;
            if (var52 == -1) {
                var53 = Statics.field1751;
            } else if (var52 < field379) {
                var53 = field521[field380[var52]];
                if (field385 == field380[var52]) {
                    var50 = true;
                    var51 = var52;
                    continue;
                }
            } else {
                var53 = field298[field300[var52 - field379]];
            }
            method1860(var53, var52, arg0, arg1, arg2, arg3);
        }
        if (var50) {
            method1860(field521[field385], var51, arg0, arg1, arg2, arg3);
        }
        for (int var54 = 0; var54 < field495; var54++) {
            int var55 = field267[var54];
            int var56 = field354[var54];
            int var57 = field478[var54];
            int var58 = field355[var54];
            boolean var59 = true;
            while (var59) {
                var59 = false;
                for (int var60 = 0; var60 < var54; var60++) {
                    if (var56 + 2 > field354[var60] - field355[var60] && var56 - var58 < field354[var60] + 2 && var55 - var57 < field478[var60] + field267[var60] && var55 + var57 > field267[var60] - field478[var60] && field354[var60] - field355[var60] < var56) {
                        var56 = field354[var60] - field355[var60];
                        var59 = true;
                    }
                }
            }
            field363 = field267[var54];
            field472 = field354[var54] = var56;
            String var61 = field360[var54];
            if (field346 == 0) {
                int var62 = 16776960;
                if (field496[var54] < 6) {
                    var62 = field404[field496[var54]];
                }
                if (field496[var54] == 6) {
                    var62 = field330 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field496[var54] == 7) {
                    var62 = field330 % 20 < 10 ? 255 : 65535;
                }
                if (field496[var54] == 8) {
                    var62 = field330 % 20 < 10 ? 45056 : 8454016;
                }
                if (field496[var54] == 9) {
                    int var63 = 150 - field359[var54];
                    if (var63 < 50) {
                        var62 = var63 * 1280 + 16711680;
                    } else if (var63 < 100) {
                        var62 = 16776960 - (var63 - 50) * 327680;
                    } else if (var63 < 150) {
                        var62 = (var63 - 100) * 5 + 65280;
                    }
                }
                if (field496[var54] == 10) {
                    int var64 = 150 - field359[var54];
                    if (var64 < 50) {
                        var62 = var64 * 5 + 16711680;
                    } else if (var64 < 100) {
                        var62 = 16711935 - (var64 - 50) * 327680;
                    } else if (var64 < 150) {
                        var62 = (var64 - 100) * 327680 + 255 - (var64 - 100) * 5;
                    }
                }
                if (field496[var54] == 11) {
                    int var65 = 150 - field359[var54];
                    if (var65 < 50) {
                        var62 = 16777215 - var65 * 327685;
                    } else if (var65 < 100) {
                        var62 = (var65 - 50) * 327685 + 65280;
                    } else if (var65 < 150) {
                        var62 = 16777215 - (var65 - 100) * 327680;
                    }
                }
                if (field358[var54] == 0) {
                    Statics.field253.method3306(var61, field363 + arg0, field472 + arg1, var62, 0);
                }
                if (field358[var54] == 1) {
                    Statics.field253.method3308(var61, field363 + arg0, field472 + arg1, var62, 0, field330);
                }
                if (field358[var54] == 2) {
                    Statics.field253.method3319(var61, field363 + arg0, field472 + arg1, var62, 0, field330);
                }
                if (field358[var54] == 3) {
                    Statics.field253.method3310(var61, field363 + arg0, field472 + arg1, var62, 0, field330, 150 - field359[var54]);
                }
                if (field358[var54] == 4) {
                    int var66 = (150 - field359[var54]) * (Statics.field253.method3299(var61) + 100) / 150;
                    class73.method1529(field363 + arg0 - 50, arg1, field363 + arg0 + 50, arg1 + arg3);
                    Statics.field253.method3344(var61, field363 + arg0 + 50 - var66, field472 + arg1, var62, 0);
                    class73.method1528(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field358[var54] == 5) {
                    int var67 = 150 - field359[var54];
                    int var68 = 0;
                    if (var67 < 25) {
                        var68 = var67 - 25;
                    } else if (var67 > 125) {
                        var68 = var67 - 125;
                    }
                    class73.method1529(arg0, field472 + arg1 - Statics.field253.field2916 - 1, arg0 + arg2, field472 + arg1 + 5);
                    Statics.field253.method3306(var61, field363 + arg0, field472 + arg1 + var68, var62, 0);
                    class73.method1528(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field253.method3306(var61, field363 + arg0, field472 + arg1, 16776960, 0);
            }
        }
        method897(arg0, arg1);
        ((class88) Statics.field1463).method1866(field335);
        if (field368 == 1) {
            Statics.field2668[field376 / 100].method1502(field365 - 8, field366 - 8);
        }
        if (field368 == 2) {
            Statics.field2668[field376 / 100 + 4].method1502(field365 - 8, field366 - 8);
        }
        field382 = 0;
        int var69 = (Statics.field1751.field772 >> 7) + Statics.field1791;
        int var70 = (Statics.field1751.field732 >> 7) + Statics.field1002;
        if (var69 >= 3053 && var69 <= 3156 && var70 >= 3056 && var70 <= 3136) {
            field382 = 1;
        }
        if (var69 >= 3072 && var69 <= 3118 && var70 >= 9492 && var70 <= 9535) {
            field382 = 1;
        }
        if (field382 == 1 && var69 >= 3139 && var69 <= 3199 && var70 >= 3008 && var70 <= 3062) {
            field382 = 0;
        }
        if (field474) {
            int var71 = arg0 + 512 - 5;
            int var72 = arg1 + 20;
            Statics.field2111.method3305("Fps:" + field2031, var71, var72, 16776960, -1);
            int var79 = var72 + 15;
            Runtime var73 = Runtime.getRuntime();
            int var74 = (int) ((var73.totalMemory() - var73.freeMemory()) / 1024L);
            int var75 = 16776960;
            if (var74 > 32768 && field262) {
                var75 = 16711680;
            }
            if (var74 > 65536 && !field262) {
                var75 = 16711680;
            }
            Statics.field2111.method3305("Mem:" + var74 + "k", var71, var79, var75, -1);
            var72 = var79 + 15;
        }
        Statics.field1878 = var41;
        Statics.field1247 = var42;
        Statics.field758 = var43;
        Statics.field703 = var44;
        Statics.field105 = var45;
        if (field266) {
            byte var76 = 0;
            int var77 = class151.field2501 + class151.field2499 + var76;
            if (var77 == 0) {
                field266 = false;
            }
        }
        if (field266) {
            class73.method1534(arg0, arg1, arg2, arg3, 0);
            method582(class143.field2291, false);
        }
    }

    @ObfuscatedName("al.ai(Lar;B)V")
    public static final void method552(class29 arg0) {
        if (Statics.field1751.field772 >> 7 == field489 && Statics.field1751.field732 >> 7 == field490) {
            field489 = 0;
        }
        int var1 = field379;
        if (class29.field695 == arg0 || class29.field689 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field695 == arg0) {
                var3 = Statics.field1751;
                var4 = 33538048;
            } else if (class29.field689 == arg0) {
                var3 = field521[field385];
                var4 = field385 << 14;
            } else {
                var3 = field521[field380[var2]];
                var4 = field380[var2] << 14;
                if (class29.field691 == arg0 && field385 == field380[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method14() && !var3.field56) {
                var3.field54 = false;
                if ((field262 && field379 > 50 || field379 > 200) && class29.field695 != arg0 && var3.field759 == var3.field736) {
                    var3.field54 = true;
                }
                int var5 = var3.field772 >> 7;
                int var6 = var3.field732 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field49 == null || field440 < var3.field38 || field440 >= var3.field45) {
                        if ((var3.field772 & 0x7F) == 64 && (var3.field732 & 0x7F) == 64) {
                            if (field330 == field361[var5][var6]) {
                                continue;
                            }
                            field361[var5][var6] = field330;
                        }
                        var3.field47 = method1782(var3.field772, var3.field732, Statics.field83);
                        Statics.field997.method1625(Statics.field83, var3.field772, var3.field732, var3.field47, 60, var3, var3.field733, var4, var3.field786);
                    } else {
                        var3.field54 = false;
                        var3.field47 = method1782(var3.field772, var3.field732, Statics.field83);
                        Statics.field997.method1626(Statics.field83, var3.field772, var3.field732, var3.field47, 60, var3, var3.field733, var4, var3.field50, var3.field51, var3.field52, var3.field43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.as(ZI)V")
    public static final void method506(boolean arg0) {
        for (int var1 = 0; var1 < field299; var1++) {
            class30 var2 = field298[field300[var1]];
            int var3 = (field300[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field698.field810 == arg0 && var2.field698.method650()) {
                int var4 = var2.field772 >> 7;
                int var5 = var2.field732 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field735 == 1 && (var2.field772 & 0x7F) == 64 && (var2.field732 & 0x7F) == 64) {
                        if (field330 == field361[var4][var5]) {
                            continue;
                        }
                        field361[var4][var5] = field330;
                    }
                    if (!var2.field698.field798) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field997.method1625(Statics.field83, var2.field772, var2.field732, method1782(var2.field772 + (var2.field735 * 64 - 64), var2.field732 + (var2.field735 * 64 - 64), Statics.field83), var2.field735 * 64 - 64 + 60, var2, var2.field733, var3, var2.field786);
                }
            }
        }
    }

    @ObfuscatedName("o.aj(B)I")
    public static final int method134() {
        if (Statics.field2430.field140) {
            return Statics.field83;
        } else {
            int var0 = method1782(Statics.field1878, Statics.field758, Statics.field83);
            return var0 - Statics.field1247 >= 800 || (class6.field85[Statics.field83][Statics.field1878 >> 7][Statics.field758 >> 7] & 0x4) == 0 ? 3 : Statics.field83;
        }
    }

    @ObfuscatedName("an.au(III)V")
    public static final void method897(int arg0, int arg1) {
        if (field392 == 2) {
            Statics.method2651((field264 - Statics.field1791 << 7) + field281, (field279 - Statics.field1002 << 7) + field283, field492 * 2);
            if (field363 > -1 && field440 % 20 < 10) {
                Statics.field2897[0].method1502(field363 + arg0 - 12, field472 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cw.az(Lav;IIIIII)V")
    public static final void method1860(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method14()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field698;
            if (var6.field827 != null) {
                var6 = var6.method637();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field379) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field56) {
                return;
            }
            if (var8.field55 != -1 || var8.field40 != -1) {
                method143(arg0, arg0.field739 + 15);
                if (field363 > -1) {
                    if (var8.field55 != -1) {
                        Statics.field794[var8.field55].method1502(field363 + arg2 - 12, field472 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field40 != -1) {
                        Statics.field229[var8.field40].method1502(field363 + arg2 - 12, field472 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field392 == 10 && field277 == field380[arg1]) {
                method143(arg0, arg0.field739 + 15);
                if (field363 > -1) {
                    Statics.field2897[1].method1502(field363 + arg2 - 12, field472 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field698;
            if (var9.field827 != null) {
                var9 = var9.method637();
            }
            if (var9.field825 >= 0 && var9.field825 < Statics.field229.length) {
                method143(arg0, arg0.field739 + 15);
                if (field363 > -1) {
                    Statics.field229[var9.field825].method1502(field363 + arg2 - 12, field472 + arg3 - 30);
                }
            }
            if (field392 == 1 && field276 == field300[arg1 - field379] && field440 % 20 < 10) {
                method143(arg0, arg0.field739 + 15);
                if (field363 > -1) {
                    Statics.field2897[0].method1502(field363 + arg2 - 12, field472 + arg3 - 28);
                }
            }
        }
        if (arg0.field744 != null && (arg1 >= field379 || !arg0.field746 && (field502 == 4 || !arg0.field745 && (field502 == 0 || field502 == 3 || field502 == 1 && method2450(((class3) arg0).field53, false))))) {
            method143(arg0, arg0.field739);
            if (field363 > -1 && field495 < field352) {
                field478[field495] = Statics.field253.method3299(arg0.field744) / 2;
                field355[field495] = Statics.field253.field2916;
                field267[field495] = field363;
                field354[field495] = field472;
                field496[field495] = arg0.field748;
                field358[field495] = arg0.field761;
                field359[field495] = arg0.field760;
                field360[field495] = arg0.field744;
                field495++;
            }
        }
        if (arg0.field749 > field440) {
            method143(arg0, arg0.field739 + 15);
            if (field363 > -1) {
                int var10;
                if (arg1 < field379) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field698;
                    var10 = var11.field833;
                }
                int var12 = arg0.field754 * var10 / arg0.field755;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field754 > 0) {
                    var12 = 1;
                }
                class73.method1534(field363 + arg2 - var10 / 2, field472 + arg3 - 3, var12, 5, 65280);
                class73.method1534(field363 + arg2 - var10 / 2 + var12, field472 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field767[var13] > field440) {
                method143(arg0, arg0.field739 / 2);
                if (field363 > -1) {
                    if (var13 == 1) {
                        field472 -= 20;
                    }
                    if (var13 == 2) {
                        field363 -= 15;
                        field472 -= 10;
                    }
                    if (var13 == 3) {
                        field363 += 15;
                        field472 -= 10;
                    }
                    Statics.field160[arg0.field751[var13]].method1502(field363 + arg2 - 12, field472 + arg3 - 12);
                    Statics.field507.method3306(Integer.toString(arg0.field750[var13]), field363 + arg2 - 1, field472 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("z.ao(Lav;IB)V")
    public static final void method143(class33 arg0, int arg1) {
        Statics.method2651(arg0.field772, arg0.field732, arg1);
    }

    @ObfuscatedName("cb.aq(IIII)I")
    public static final int method1782(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field85[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field89[var5][var3][var4] + class6.field89[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field89[var5][var3][var4 + 1] + class6.field89[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aq.an(ZI)V")
    public static final void method843(boolean arg0) {
        field269 = arg0;
        if (!field269) {
            int var1 = field303.method2148();
            int var2 = (field304 - field303.field1826) / 16;
            Statics.field2932 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field2932[var3][var4] = field303.method2302();
                }
            }
            int var5 = field303.method2172();
            int var6 = field303.method2172();
            int var7 = field303.method2140();
            int var8 = field303.method2151();
            Statics.field1340 = new int[var2];
            Statics.field1475 = new int[var2];
            Statics.field996 = new int[var2];
            Statics.field1896 = new byte[var2][];
            Statics.field195 = new byte[var2][];
            boolean var9 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var5 / 8 == 48) {
                var9 = true;
            }
            if (var6 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1340[var10] = var13;
                        Statics.field1475[var10] = Statics.field1337.method2729("m" + var11 + "_" + var12);
                        Statics.field996[var10] = Statics.field1337.method2729("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method551(var6, var5, var1, var7, var8);
            return;
        }
        int var14 = field303.method2172();
        field303.method2348();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field303.method2349(1);
                    if (var18 == 1) {
                        field356[var15][var16][var17] = field303.method2349(26);
                    } else {
                        field356[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field303.method2350();
        int var19 = (field304 - field303.field1826) / 16;
        Statics.field2932 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2932[var20][var21] = field303.method2183();
            }
        }
        int var22 = field303.method2172();
        int var23 = field303.method2151();
        int var24 = field303.method2140();
        int var25 = field303.method2295();
        Statics.field1340 = new int[var19];
        Statics.field1475 = new int[var19];
        Statics.field996 = new int[var19];
        Statics.field1896 = new byte[var19][];
        Statics.field195 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field356[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1340[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1340[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1475[var26] = Statics.field1337.method2729("m" + var35 + "_" + var36);
                            Statics.field996[var26] = Statics.field1337.method2729("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method551(var22, var23, var25, var24, var14);
    }

    @ObfuscatedName("al.ax(IIIIII)V")
    public static final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field519 == arg0 && Statics.field1495 == arg1 && field313 == arg2 || !field262) {
            return;
        }
        Statics.field519 = arg0;
        Statics.field1495 = arg1;
        field313 = arg2;
        if (!field262) {
            field313 = 0;
        }
        Statics.method26(25);
        method582(class143.field2291, true);
        int var5 = Statics.field1791;
        int var6 = Statics.field1002;
        Statics.field1791 = (arg0 - 6) * 8;
        Statics.field1002 = (arg1 - 6) * 8;
        int var7 = Statics.field1791 - var5;
        int var8 = Statics.field1002 - var6;
        int var9 = Statics.field1791;
        int var10 = Statics.field1002;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field298[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field785[var13] -= var7;
                    var12.field780[var13] -= var8;
                }
                var12.field772 -= var7 * 128;
                var12.field732 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field521[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field785[var16] -= var7;
                    var15.field780[var16] -= var8;
                }
                var15.field772 -= var7 * 128;
                var15.field732 -= var8 * 128;
            }
        }
        Statics.field83 = arg2;
        Statics.field1751.method614(arg3, arg4, false);
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
        for (class15 var28 = (class15) field394.method3179(); var28 != null; var28 = (class15) field394.method3199()) {
            var28.field217 -= var7;
            var28.field220 -= var8;
            if (var28.field217 < 0 || var28.field220 < 0 || var28.field217 >= 104 || var28.field220 >= 104) {
                var28.method3277();
            }
        }
        if (field489 != 0) {
            field489 -= var7;
            field490 -= var8;
        }
        field322 = 0;
        field503 = false;
        field484 = -1;
        field396.method3180();
        field395.method3180();
    }

    @ObfuscatedName("ct.ap(ZI)V")
    public static final void method2089(boolean arg0) {
        method1783();
        field307++;
        if (field307 < 50 && !arg0) {
            return;
        }
        field307 = 0;
        if (field312 || Statics.field2655 == null) {
            return;
        }
        field301.method2355(44);
        try {
            Statics.field2655.method2552(field301.field1829, 0, field301.field1826);
            field301.field1826 = 0;
        } catch (IOException var2) {
            field312 = true;
        }
    }

    @ObfuscatedName("d.ac(IS)V")
    public static final void method34(int arg0) {
        int[] var1 = Statics.field1843.field1298;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field85[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field997.method1717(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field85[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field997.method1717(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1843.method1453();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field85[arg0][var10][var9] & 0x18) == 0) {
                    method621(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field85[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method621(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field485 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field997.method1706(Statics.field83, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method2071(var14).field868;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field373[Statics.field83].field2956;
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
                        field488[field485] = Statics.field20[var15];
                        field486[field485] = var16;
                        field468[field485] = var17;
                        field485++;
                    }
                }
            }
        }
        Statics.field1668.method1424();
    }

    @ObfuscatedName("at.ab(IIIIII)V")
    public static final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field997.method1682(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field997.method1736(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1843.field1298;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method2071(var12);
            if (var13.field869 == -1) {
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
                class74 var14 = Statics.field2654[var13.field869];
                if (var14 != null) {
                    int var15 = (var13.field855 * 4 - var14.field1307) / 2;
                    int var16 = (var13.field860 * 4 - var14.field1310) / 2;
                    var14.method1590(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field860) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field997.method1642(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field997.method1736(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method2071(var21);
            if (var22.field869 != -1) {
                class74 var23 = Statics.field2654[var22.field869];
                if (var23 != null) {
                    int var24 = (var22.field855 * 4 - var23.field1307) / 2;
                    int var25 = (var22.field860 * 4 - var23.field1310) / 2;
                    var23.method1590(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field860) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1843.field1298;
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
        int var29 = Statics.field997.method1706(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method2071(var30);
        if (var31.field869 == -1) {
            return;
        }
        class74 var32 = Statics.field2654[var31.field869];
        if (var32 != null) {
            int var33 = (var31.field855 * 4 - var32.field1307) / 2;
            int var34 = (var31.field860 * 4 - var32.field1310) / 2;
            var32.method1590(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field860) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("w.am(B)V")
    public static final void method111() {
        if (field305 == 31) {
            int var0 = field303.method2148();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1484;
            int var2 = (var0 & 0x7) + Statics.field211;
            int var3 = var1 + field303.method2175();
            int var4 = var2 + field303.method2175();
            int var5 = field303.method2141();
            int var6 = field303.method2140();
            int var7 = field303.method2148() * 4;
            int var8 = field303.method2148() * 4;
            int var9 = field303.method2140();
            int var10 = field303.method2140();
            int var11 = field303.method2148();
            int var12 = field303.method2148();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field83, var13, var14, method1782(var13, var14, Statics.field83) - var7, field440 + var9, field440 + var10, var11, var12, var5, var8);
                var17.method87(var15, var16, method1782(var15, var16, Statics.field83) - var8, field440 + var9);
                field395.method3181(var17);
            }
            return;
        }
        if (field305 == 70) {
            byte var18 = field303.method2139();
            int var19 = field303.method2166();
            int var20 = (var19 >> 4 & 0x7) + Statics.field1484;
            int var21 = (var19 & 0x7) + Statics.field211;
            int var22 = field303.method2151();
            int var23 = field303.method2172();
            byte var24 = field303.method2136();
            int var25 = field303.method2140();
            byte var26 = field303.method2136();
            byte var27 = field303.method2175();
            int var28 = field303.method2172();
            int var29 = field303.method2164();
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = field450[var30];
            class3 var33;
            if (field384 == var23) {
                var33 = Statics.field1751;
            } else {
                var33 = field521[var23];
            }
            if (var33 != null) {
                class36 var34 = class36.method2071(var25);
                int var35;
                int var36;
                if (var31 == 1 || var31 == 3) {
                    var35 = var34.field860;
                    var36 = var34.field855;
                } else {
                    var35 = var34.field855;
                    var36 = var34.field860;
                }
                int var37 = (var35 >> 1) + var20;
                int var38 = (var35 + 1 >> 1) + var20;
                int var39 = (var36 >> 1) + var21;
                int var40 = (var36 + 1 >> 1) + var21;
                int[][] var41 = class6.field89[Statics.field83];
                int var42 = var41[var37][var39] + var41[var38][var39] + var41[var37][var40] + var41[var38][var40] >> 2;
                int var43 = (var20 << 7) + (var35 << 6);
                int var44 = (var21 << 7) + (var36 << 6);
                class98 var45 = var34.method667(var30, var31, var41, var43, var42, var44);
                if (var45 != null) {
                    method494(Statics.field83, var20, var21, var32, -1, 0, 0, var22 + 1, var28 + 1);
                    var33.field38 = field440 + var22;
                    var33.field45 = field440 + var28;
                    var33.field49 = var45;
                    var33.field46 = var20 * 128 + var35 * 64;
                    var33.field48 = var21 * 128 + var36 * 64;
                    var33.field39 = var42;
                    if (var18 > var27) {
                        byte var46 = var18;
                        var18 = var27;
                        var27 = var46;
                    }
                    if (var24 > var26) {
                        byte var47 = var24;
                        var24 = var26;
                        var26 = var47;
                    }
                    var33.field50 = var18 + var20;
                    var33.field52 = var20 + var27;
                    var33.field51 = var21 + var24;
                    var33.field43 = var21 + var26;
                }
            }
        }
        if (field305 == 162) {
            int var48 = field303.method2148();
            int var49 = (var48 >> 4 & 0x7) + Statics.field1484;
            int var50 = (var48 & 0x7) + Statics.field211;
            int var51 = field303.method2140();
            int var52 = field303.method2148();
            int var53 = var52 >> 4 & 0xF;
            int var54 = var52 & 0x7;
            int var55 = field303.method2148();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                int var56 = var53 + 1;
                if (Statics.field1751.field785[0] >= var49 - var56 && Statics.field1751.field785[0] <= var49 + var56 && Statics.field1751.field780[0] >= var50 - var56 && Statics.field1751.field780[0] <= var50 + var56 && field254 != 0 && var54 > 0 && field322 < 50) {
                    field498[field322] = var51;
                    field388[field322] = var54;
                    field500[field322] = var55;
                    field344[field322] = null;
                    field470[field322] = (var49 << 16) + (var50 << 8) + var53;
                    field322++;
                }
            }
        }
        if (field305 == 239) {
            int var57 = field303.method2151();
            int var58 = field303.method2166();
            int var59 = (var58 >> 4 & 0x7) + Statics.field1484;
            int var60 = (var58 & 0x7) + Statics.field211;
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                class178 var61 = field393[Statics.field83][var59][var60];
                if (var61 != null) {
                    for (class25 var62 = (class25) var61.method3179(); var62 != null; var62 = (class25) var61.method3199()) {
                        if ((var57 & 0x7FFF) == var62.field619) {
                            var62.method3277();
                            break;
                        }
                    }
                    if (var61.method3179() == null) {
                        field393[Statics.field83][var59][var60] = null;
                    }
                    method89(var59, var60);
                }
            }
        } else if (field305 == 158) {
            int var63 = field303.method2295();
            int var64 = (var63 >> 4 & 0x7) + Statics.field1484;
            int var65 = (var63 & 0x7) + Statics.field211;
            int var66 = field303.method2164();
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = field450[var67];
            int var70 = field303.method2172();
            if (var64 >= 0 && var65 >= 0 && var64 < 103 && var65 < 103) {
                if (var69 == 0) {
                    class80 var71 = Statics.field997.method1636(Statics.field83, var64, var65);
                    if (var71 != null) {
                        int var72 = var71.field1411 >> 14 & 0x7FFF;
                        if (var67 == 2) {
                            var71.field1417 = new class11(var72, 2, var68 + 4, Statics.field83, var64, var65, var70, false, var71.field1417);
                            var71.field1410 = new class11(var72, 2, var68 + 1 & 0x3, Statics.field83, var64, var65, var70, false, var71.field1410);
                        } else {
                            var71.field1417 = new class11(var72, var67, var68, Statics.field83, var64, var65, var70, false, var71.field1417);
                        }
                    }
                }
                if (var69 == 1) {
                    class87 var73 = Statics.field997.method1662(Statics.field83, var64, var65);
                    if (var73 != null) {
                        int var74 = var73.field1486 >> 14 & 0x7FFF;
                        if (var67 == 4 || var67 == 5) {
                            var73.field1489 = new class11(var74, 4, var68, Statics.field83, var64, var65, var70, false, var73.field1489);
                        } else if (var67 == 6) {
                            var73.field1489 = new class11(var74, 4, var68 + 4, Statics.field83, var64, var65, var70, false, var73.field1489);
                        } else if (var67 == 7) {
                            var73.field1489 = new class11(var74, 4, (var68 + 2 & 0x3) + 4, Statics.field83, var64, var65, var70, false, var73.field1489);
                        } else if (var67 == 8) {
                            var73.field1489 = new class11(var74, 4, var68 + 4, Statics.field83, var64, var65, var70, false, var73.field1489);
                            var73.field1488 = new class11(var74, 4, (var68 + 2 & 0x3) + 4, Statics.field83, var64, var65, var70, false, var73.field1488);
                        }
                    }
                }
                if (var69 == 2) {
                    class91 var75 = Statics.field997.method1638(Statics.field83, var64, var65);
                    if (var67 == 11) {
                        var67 = 10;
                    }
                    if (var75 != null) {
                        var75.field1547 = new class11(var75.field1539 >> 14 & 0x7FFF, var67, var68, Statics.field83, var64, var65, var70, false, var75.field1547);
                    }
                }
                if (var69 == 3) {
                    class86 var76 = Statics.field997.method1639(Statics.field83, var64, var65);
                    if (var76 != null) {
                        var76.field1468 = new class11(var76.field1472 >> 14 & 0x7FFF, 22, var68, Statics.field83, var64, var65, var70, false, var76.field1468);
                    }
                }
            }
        } else if (field305 == 84) {
            int var77 = field303.method2151();
            int var78 = field303.method2140();
            int var79 = field303.method2164();
            int var80 = (var79 >> 4 & 0x7) + Statics.field1484;
            int var81 = (var79 & 0x7) + Statics.field211;
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                class25 var82 = new class25();
                var82.field619 = var78;
                var82.field618 = var77;
                if (field393[Statics.field83][var80][var81] == null) {
                    field393[Statics.field83][var80][var81] = new class178();
                }
                field393[Statics.field83][var80][var81].method3181(var82);
                method89(var80, var81);
            }
        } else if (field305 == 245) {
            int var83 = field303.method2164();
            int var84 = (var83 >> 4 & 0x7) + Statics.field1484;
            int var85 = (var83 & 0x7) + Statics.field211;
            int var86 = field303.method2164();
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = field450[var87];
            int var90 = field303.method2151();
            if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                method494(Statics.field83, var84, var85, var89, var90, var87, var88, 0, -1);
            }
        } else if (field305 == 179) {
            int var91 = field303.method2148();
            int var92 = (var91 >> 4 & 0x7) + Statics.field1484;
            int var93 = (var91 & 0x7) + Statics.field211;
            int var94 = field303.method2140();
            int var95 = field303.method2140();
            int var96 = field303.method2140();
            if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                class178 var97 = field393[Statics.field83][var92][var93];
                if (var97 != null) {
                    for (class25 var98 = (class25) var97.method3179(); var98 != null; var98 = (class25) var97.method3199()) {
                        if ((var94 & 0x7FFF) == var98.field619 && var98.field618 == var95) {
                            var98.field618 = var96;
                            break;
                        }
                    }
                    method89(var92, var93);
                }
            }
        } else if (field305 == 211) {
            int var99 = field303.method2164();
            int var100 = (var99 >> 4 & 0x7) + Statics.field1484;
            int var101 = (var99 & 0x7) + Statics.field211;
            int var102 = field303.method2295();
            int var103 = var102 >> 2;
            int var104 = var102 & 0x3;
            int var105 = field450[var103];
            if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                method494(Statics.field83, var100, var101, var105, -1, var103, var104, 0, -1);
            }
        } else if (field305 == 210) {
            int var106 = field303.method2148();
            int var107 = (var106 >> 4 & 0x7) + Statics.field1484;
            int var108 = (var106 & 0x7) + Statics.field211;
            int var109 = field303.method2140();
            int var110 = field303.method2148();
            int var111 = field303.method2140();
            if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                int var112 = var107 * 128 + 64;
                int var113 = var108 * 128 + 64;
                class26 var114 = new class26(var109, Statics.field83, var112, var113, method1782(var112, var113, Statics.field83) - var110, var111, field440);
                field396.method3181(var114);
            }
        }
    }

    @ObfuscatedName("t.ad(IIIIIIIIIB)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field394.method3179(); var10 != null; var10 = (class15) field394.method3199()) {
            if (var10.field218 == arg0 && var10.field217 == arg1 && var10.field220 == arg2 && var10.field230 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field218 = arg0;
            var9.field230 = arg3;
            var9.field217 = arg1;
            var9.field220 = arg2;
            method1345(var9);
            field394.method3181(var9);
        }
        var9.field224 = arg4;
        var9.field226 = arg5;
        var9.field225 = arg6;
        var9.field227 = arg7;
        var9.field221 = arg8;
    }

    @ObfuscatedName("ej.ah(I)V")
    public static final void method2751() {
        for (class15 var0 = (class15) field394.method3179(); var0 != null; var0 = (class15) field394.method3199()) {
            if (var0.field221 == -1) {
                var0.field227 = 0;
                method1345(var0);
            } else {
                var0.method3277();
            }
        }
    }

    @ObfuscatedName("bl.bf(Lr;I)V")
    public static final void method1345(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field230 == 0) {
            var1 = Statics.field997.method1682(arg0.field218, arg0.field217, arg0.field220);
        }
        if (arg0.field230 == 1) {
            var1 = Statics.field997.method1641(arg0.field218, arg0.field217, arg0.field220);
        }
        if (arg0.field230 == 2) {
            var1 = Statics.field997.method1642(arg0.field218, arg0.field217, arg0.field220);
        }
        if (arg0.field230 == 3) {
            var1 = Statics.field997.method1706(arg0.field218, arg0.field217, arg0.field220);
        }
        if (var1 != 0) {
            int var5 = Statics.field997.method1736(arg0.field218, arg0.field217, arg0.field220, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field228 = var2;
        arg0.field223 = var3;
        arg0.field222 = var4;
    }

    @ObfuscatedName("af.bx(I)V")
    public static final void method659() {
        for (class15 var0 = (class15) field394.method3179(); var0 != null; var0 = (class15) field394.method3199()) {
            if (var0.field221 > 0) {
                var0.field221--;
            }
            if (var0.field221 != 0) {
                if (var0.field227 > 0) {
                    var0.field227--;
                }
                if (var0.field227 == 0 && var0.field217 >= 1 && var0.field220 >= 1 && var0.field217 <= 102 && var0.field220 <= 102 && (var0.field224 < 0 || class6.method596(var0.field224, var0.field226))) {
                    method2064(var0.field218, var0.field230, var0.field217, var0.field220, var0.field224, var0.field225, var0.field226);
                    var0.field227 = -1;
                    if (var0.field228 == var0.field224 && var0.field228 == -1) {
                        var0.method3277();
                    } else if (var0.field228 == var0.field224 && var0.field225 == var0.field222 && var0.field226 == var0.field223) {
                        var0.method3277();
                    }
                }
            } else if (var0.field228 < 0 || class6.method596(var0.field228, var0.field223)) {
                method2064(var0.field218, var0.field230, var0.field217, var0.field220, var0.field228, var0.field222, var0.field223);
                var0.method3277();
            }
        }
    }

    @ObfuscatedName("cp.bb(IIIIIIII)V")
    public static final void method2064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field262 && Statics.field83 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field997.method1682(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field997.method1641(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field997.method1642(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field997.method1706(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field997.method1736(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field997.method1714(arg0, arg2, arg3);
                class36 var15 = class36.method2071(var12);
                if (var15.field854 != 0) {
                    field373[arg0].method3437(arg2, arg3, var13, var14, var15.field856);
                }
            }
            if (arg1 == 1) {
                Statics.field997.method1632(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field997.method1633(arg0, arg2, arg3);
                class36 var16 = class36.method2071(var12);
                if (var16.field855 + arg2 > 103 || var16.field855 + arg3 > 103 || var16.field860 + arg2 > 103 || var16.field860 + arg3 > 103) {
                    return;
                }
                if (var16.field854 != 0) {
                    field373[arg0].method3438(arg2, arg3, var16.field855, var16.field860, var14, var16.field856);
                }
            }
            if (arg1 == 3) {
                Statics.field997.method1653(arg0, arg2, arg3);
                class36 var17 = class36.method2071(var12);
                if (var17.field854 == 1) {
                    field373[arg0].method3439(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field85[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method504(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field997, field373[arg0]);
    }

    @ObfuscatedName("m.bv(IIB)V")
    public static final void method89(int arg0, int arg1) {
        class178 var2 = field393[Statics.field83][arg0][arg1];
        if (var2 == null) {
            Statics.field997.method1767(Statics.field83, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3179(); var6 != null; var6 = (class25) var2.method3199()) {
            class45 var7 = class45.method1982(var6.field619);
            long var8 = (long) var7.field1026;
            if (var7.field1025 == 1) {
                var8 = (long) (var6.field618 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field997.method1767(Statics.field83, arg0, arg1);
            return;
        }
        var2.method3182(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3179(); var12 != null; var12 = (class25) var2.method3199()) {
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
        Statics.field997.method1621(Statics.field83, arg0, arg1, method1782(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field83), var5, var13, var10, var11);
    }

    @ObfuscatedName("cu.bi(B)V")
    public static final void method1881() {
        field386 = 0;
        field381 = 0;
        field303.method2348();
        int var0 = field303.method2349(1);
        if (var0 != 0) {
            int var1 = field303.method2349(2);
            if (var1 == 0) {
                field422[++field381 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field303.method2349(3);
                Statics.field1751.method602(var2, false);
                int var3 = field303.method2349(1);
                if (var3 == 1) {
                    field422[++field381 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field303.method2349(3);
                Statics.field1751.method602(var4, true);
                int var5 = field303.method2349(3);
                Statics.field1751.method602(var5, true);
                int var6 = field303.method2349(1);
                if (var6 == 1) {
                    field422[++field381 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field303.method2349(1);
                if (var7 == 1) {
                    field422[++field381 - 1] = 2047;
                }
                int var8 = field303.method2349(7);
                Statics.field83 = field303.method2349(2);
                int var9 = field303.method2349(7);
                int var10 = field303.method2349(1);
                Statics.field1751.method614(var8, var9, var10 == 1);
            }
        }
        method115();
        while (field303.method2351(field304) >= 11) {
            int var11 = field303.method2349(11);
            if (var11 == 2047) {
                break;
            }
            boolean var19 = false;
            if (field521[var11] == null) {
                field521[var11] = new class3();
                if (field491[var11] != null) {
                    field521[var11].method12(field491[var11]);
                }
                var19 = true;
            }
            field380[++field379 - 1] = var11;
            class3 var20 = field521[var11];
            var20.field779 = field440;
            int var21 = field391[field303.method2349(3)];
            if (var19) {
                var20.field781 = var20.field733 = var21;
            }
            int var22 = field303.method2349(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            int var23 = field303.method2349(5);
            if (var23 > 15) {
                var23 -= 32;
            }
            int var24 = field303.method2349(1);
            if (var24 == 1) {
                field422[++field381 - 1] = var11;
            }
            int var25 = field303.method2349(1);
            var20.method614(Statics.field1751.field785[0] + var23, Statics.field1751.field780[0] + var22, var25 == 1);
        }
        field303.method2350();
        for (int var12 = 0; var12 < field381; var12++) {
            int var13 = field422[var12];
            class3 var14 = field521[var13];
            int var15 = field303.method2148();
            if ((var15 & 0x4) != 0) {
                var15 += field303.method2148() << 8;
            }
            method1855(var13, var14, var15);
        }
        for (int var16 = 0; var16 < field386; var16++) {
            int var17 = field387[var16];
            if (field440 != field521[var17].field779) {
                field521[var17] = null;
            }
        }
        if (field304 != field303.field1826) {
            throw new RuntimeException(field303.field1826 + class2.field21 + field304);
        }
        for (int var18 = 0; var18 < field379; var18++) {
            if (field521[field380[var18]] == null) {
                throw new RuntimeException(var18 + class2.field21 + field379);
            }
        }
    }

    @ObfuscatedName("w.bd(I)V")
    public static final void method115() {
        int var0 = field303.method2349(8);
        if (var0 < field379) {
            for (int var1 = var0; var1 < field379; var1++) {
                field387[++field386 - 1] = field380[var1];
            }
        }
        if (var0 > field379) {
            throw new RuntimeException("");
        }
        field379 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field380[var2];
            class3 var4 = field521[var3];
            int var5 = field303.method2349(1);
            if (var5 == 0) {
                field380[++field379 - 1] = var3;
                var4.field779 = field440;
            } else {
                int var6 = field303.method2349(2);
                if (var6 == 0) {
                    field380[++field379 - 1] = var3;
                    var4.field779 = field440;
                    field422[++field381 - 1] = var3;
                } else if (var6 == 1) {
                    field380[++field379 - 1] = var3;
                    var4.field779 = field440;
                    int var7 = field303.method2349(3);
                    var4.method602(var7, false);
                    int var8 = field303.method2349(1);
                    if (var8 == 1) {
                        field422[++field381 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field380[++field379 - 1] = var3;
                    var4.field779 = field440;
                    int var9 = field303.method2349(3);
                    var4.method602(var9, true);
                    int var10 = field303.method2349(3);
                    var4.method602(var10, true);
                    int var11 = field303.method2349(1);
                    if (var11 == 1) {
                        field422[++field381 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field387[++field386 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ch.bh(ILk;IB)V")
    public static final void method1855(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            int var3 = field303.method2172();
            int var4 = field303.method2295();
            arg1.method605(var3, var4, field440);
            arg1.field749 = field440 + 300;
            arg1.field754 = field303.method2164();
            arg1.field755 = field303.method2164();
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field744 = field303.method2182();
            if (arg1.field744.charAt(0) == '~') {
                arg1.field744 = arg1.field744.substring(1);
                class10.method2769(2, arg1.field53, arg1.field744);
            } else if (Statics.field1751 == arg1) {
                class10.method2769(2, arg1.field53, arg1.field744);
            }
            arg1.field745 = false;
            arg1.field748 = 0;
            arg1.field761 = 0;
            arg1.field760 = 150;
        }
        if ((arg2 & 0x20) != 0) {
            int var5 = field303.method2295();
            byte[] var6 = new byte[var5];
            class107 var7 = new class107(var6);
            field303.method2280(var6, 0, var5);
            field491[arg0] = var7;
            arg1.method12(var7);
        }
        if ((arg2 & 0x40) != 0) {
            int var8 = field303.method2140();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = field303.method2164();
            method2646(arg1, var8, var9);
        }
        if ((arg2 & 0x2) != 0) {
            int var10 = field303.method2140();
            class138 var11 = (class138) class99.method519(class138.method1607(), field303.method2295());
            boolean var12 = field303.method2166() == 1;
            int var13 = field303.method2164();
            int var14 = field303.field1826;
            if (arg1.field53 != null && arg1.field58 != null) {
                boolean var15 = false;
                if (var11.field2100 && method699(arg1.field53)) {
                    var15 = true;
                }
                if (!var15 && field382 == 0 && !arg1.field56) {
                    field342.field1826 = 0;
                    field303.method2181(field342.field1829, 0, var13);
                    field342.field1826 = 0;
                    class107 var16 = field342;
                    String var20;
                    try {
                        int var17 = var16.method2131();
                        if (var17 > 32767) {
                            var17 = 32767;
                        }
                        byte[] var18 = new byte[var17];
                        var16.field1826 += Statics.field2909.method2072(var16.field1829, var16.field1826, var18, 0, var17);
                        String var19 = Statics.method2397(var18, 0, var17);
                        var20 = var19;
                    } catch (Exception var31) {
                        var20 = "Cabbage";
                    }
                    String var23 = class193.method3303(class200.method2659(var20));
                    arg1.field744 = var23.trim();
                    arg1.field748 = var10 >> 8;
                    arg1.field761 = var10 & 0xFF;
                    arg1.field760 = 150;
                    arg1.field745 = var12;
                    arg1.field746 = Statics.field1751 != arg1 && var11.field2100 && field475 != "" && var23.toLowerCase().indexOf(field475) == -1;
                    int var24;
                    if (var11.field2099) {
                        var24 = var12 ? 91 : 1;
                    } else {
                        var24 = var12 ? 90 : 2;
                    }
                    if (var11.field2098 == -1) {
                        class10.method2769(var24, arg1.field53, var23);
                    } else {
                        int var26 = var11.field2098;
                        String var27 = "<img=" + var26 + ">";
                        class10.method2769(var24, var27 + arg1.field53, var23);
                    }
                }
            }
            field303.field1826 = var13 + var14;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field776 = field303.method2164();
            arg1.field774 = field303.method2164();
            arg1.field773 = field303.method2166();
            arg1.field775 = field303.method2148();
            arg1.field790 = field303.method2151() + field440;
            arg1.field737 = field303.method2236() + field440;
            arg1.field778 = field303.method2148();
            arg1.field777 = 1;
            arg1.field731 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field757 = field303.method2151();
            arg1.field753 = field303.method2140();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field765 = field303.method2236();
            int var28 = field303.method2178();
            arg1.field771 = var28 >> 16;
            arg1.field770 = (var28 & 0xFFFF) + field440;
            arg1.field756 = 0;
            arg1.field769 = 0;
            if (arg1.field770 > field440) {
                arg1.field756 = -1;
            }
            if (arg1.field765 == 65535) {
                arg1.field765 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var29 = field303.method2236();
            int var30 = field303.method2166();
            arg1.method605(var29, var30, field440);
            arg1.field749 = field440 + 300;
            arg1.field754 = field303.method2166();
            arg1.field755 = field303.method2166();
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field784 = field303.method2172();
            if (arg1.field784 == 65535) {
                arg1.field784 = -1;
            }
        }
    }

    @ObfuscatedName("s.bn(I)V")
    public static final void method518() {
        field386 = 0;
        field381 = 0;
        field303.method2348();
        int var0 = field303.method2349(8);
        if (var0 < field299) {
            for (int var1 = var0; var1 < field299; var1++) {
                field387[++field386 - 1] = field300[var1];
            }
        }
        if (var0 > field299) {
            throw new RuntimeException("");
        }
        field299 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field300[var2];
            class30 var4 = field298[var3];
            int var5 = field303.method2349(1);
            if (var5 == 0) {
                field300[++field299 - 1] = var3;
                var4.field779 = field440;
            } else {
                int var6 = field303.method2349(2);
                if (var6 == 0) {
                    field300[++field299 - 1] = var3;
                    var4.field779 = field440;
                    field422[++field381 - 1] = var3;
                } else if (var6 == 1) {
                    field300[++field299 - 1] = var3;
                    var4.field779 = field440;
                    int var7 = field303.method2349(3);
                    var4.method602(var7, false);
                    int var8 = field303.method2349(1);
                    if (var8 == 1) {
                        field422[++field381 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field300[++field299 - 1] = var3;
                    var4.field779 = field440;
                    int var9 = field303.method2349(3);
                    var4.method602(var9, true);
                    int var10 = field303.method2349(3);
                    var4.method602(var10, true);
                    int var11 = field303.method2349(1);
                    if (var11 == 1) {
                        field422[++field381 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field387[++field386 - 1] = var3;
                }
            }
        }
        method31();
        method161();
        for (int var12 = 0; var12 < field386; var12++) {
            int var13 = field387[var12];
            if (field440 != field298[var13].field779) {
                field298[var13].field698 = null;
                field298[var13] = null;
            }
        }
        if (field304 != field303.field1826) {
            throw new RuntimeException(field303.field1826 + class2.field21 + field304);
        }
        for (int var14 = 0; var14 < field299; var14++) {
            if (field298[field300[var14]] == null) {
                throw new RuntimeException(var14 + class2.field21 + field299);
            }
        }
    }

    @ObfuscatedName("d.bo(I)V")
    public static final void method31() {
        while (true) {
            if (field303.method2351(field304) >= 27) {
                int var0 = field303.method2349(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field298[var0] == null) {
                        field298[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field298[var0];
                    field300[++field299 - 1] = var0;
                    var2.field779 = field440;
                    int var3 = field303.method2349(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field303.method2349(1);
                    var2.field698 = class35.method616(field303.method2349(14));
                    int var5 = field303.method2349(1);
                    if (var5 == 1) {
                        field422[++field381 - 1] = var0;
                    }
                    int var6 = field303.method2349(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field391[field303.method2349(3)];
                    if (var1) {
                        var2.field781 = var2.field733 = var7;
                    }
                    var2.field735 = var2.field698.field803;
                    var2.field783 = var2.field698.field826;
                    if (var2.field783 == 0) {
                        var2.field733 = 0;
                    }
                    var2.field768 = var2.field698.field822;
                    var2.field740 = var2.field698.field809;
                    var2.field741 = var2.field698.field801;
                    var2.field742 = var2.field698.field812;
                    var2.field736 = var2.field698.field806;
                    var2.field788 = var2.field698.field807;
                    var2.field738 = var2.field698.field808;
                    var2.method614(Statics.field1751.field785[0] + var3, Statics.field1751.field780[0] + var6, var4 == 1);
                    continue;
                }
            }
            field303.method2350();
            return;
        }
    }

    @ObfuscatedName("c.br(I)V")
    public static final void method161() {
        for (int var0 = 0; var0 < field381; var0++) {
            int var1 = field422[var0];
            class30 var2 = field298[var1];
            int var3 = field303.method2148();
            if ((var3 & 0x1) != 0) {
                var2.field744 = field303.method2182();
                var2.field760 = 100;
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field303.method2166();
                int var5 = field303.method2148();
                var2.method605(var4, var5, field440);
                var2.field749 = field440 + 300;
                var2.field754 = field303.method2140();
                var2.field755 = field303.method2140();
            }
            if ((var3 & 0x40) != 0) {
                var2.field698 = class35.method616(field303.method2151());
                var2.field735 = var2.field698.field803;
                var2.field783 = var2.field698.field826;
                var2.field768 = var2.field698.field822;
                var2.field740 = var2.field698.field809;
                var2.field741 = var2.field698.field801;
                var2.field742 = var2.field698.field812;
                var2.field736 = var2.field698.field806;
                var2.field788 = var2.field698.field807;
                var2.field738 = var2.field698.field808;
            }
            if ((var3 & 0x8) != 0) {
                int var6 = field303.method2164();
                int var7 = field303.method2164();
                var2.method605(var6, var7, field440);
                var2.field749 = field440 + 300;
                var2.field754 = field303.method2236();
                var2.field755 = field303.method2236();
            }
            if ((var3 & 0x4) != 0) {
                var2.field765 = field303.method2236();
                int var8 = field303.method2183();
                var2.field771 = var8 >> 16;
                var2.field770 = (var8 & 0xFFFF) + field440;
                var2.field756 = 0;
                var2.field769 = 0;
                if (var2.field770 > field440) {
                    var2.field756 = -1;
                }
                if (var2.field765 == 65535) {
                    var2.field765 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var9 = field303.method2236();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field303.method2164();
                if (var2.field762 == var9 && var9 != -1) {
                    int var11 = class38.method658(var9).field899;
                    if (var11 == 1) {
                        var2.field763 = 0;
                        var2.field764 = 0;
                        var2.field747 = var10;
                        var2.field766 = 0;
                    }
                    if (var11 == 2) {
                        var2.field766 = 0;
                    }
                } else if (var9 == -1 || var2.field762 == -1 || class38.method658(var9).field911 >= class38.method658(var2.field762).field911) {
                    var2.field762 = var9;
                    var2.field763 = 0;
                    var2.field764 = 0;
                    var2.field747 = var10;
                    var2.field766 = 0;
                    var2.field731 = var2.field777;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field784 = field303.method2172();
                if (var2.field784 == 65535) {
                    var2.field784 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field757 = field303.method2140();
                var2.field753 = field303.method2140();
            }
        }
    }

    @ObfuscatedName("eg.bg(III)V")
    public static final void method2627(int arg0, int arg1) {
        if (field402 < 2 && field413 == 0 && !field415) {
            return;
        }
        String var2;
        if (field413 == 1 && field402 < 2) {
            var2 = class143.field2153 + class143.field2301 + field414 + " " + class2.field25;
        } else if (field415 && field402 < 2) {
            var2 = field334 + class143.field2301 + field419 + " " + class2.field25;
        } else {
            var2 = method2067(field402 - 1);
        }
        if (field402 > 2) {
            var2 = var2 + class2.method836(16777215) + " " + '/' + " " + (field402 - 2) + class143.field2162;
        }
        Statics.field253.method3311(var2, arg0 + 4, arg1 + 15, 16777215, 0, field440 / 1000);
    }

    @ObfuscatedName("bm.bs(I)V")
    public static final void method1611() {
        int var0 = Statics.field1865;
        int var1 = Statics.field156;
        int var2 = Statics.field1059;
        int var3 = Statics.field1115;
        int var4 = 6116423;
        class73.method1534(var0, var1, var2, var3, var4);
        class73.method1534(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1536(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field253.method3344(class143.field2294, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field1989;
        int var6 = class127.field1990;
        for (int var7 = 0; var7 < field402; var7++) {
            int var8 = (field402 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field253.method3344(method2067(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field1865;
        int var11 = Statics.field156;
        int var12 = Statics.field1059;
        int var13 = Statics.field1115;
        for (int var14 = 0; var14 < field462; var14++) {
            if (field469[var14] + field467[var14] > var10 && field467[var14] < var10 + var12 && field497[var14] + field459[var14] > var11 && field459[var14] < var11 + var13) {
                field410[var14] = true;
            }
        }
    }

    @ObfuscatedName("o.be(IIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field462; var4++) {
            if (field469[var4] + field467[var4] > arg0 && field467[var4] < arg0 + arg2 && field497[var4] + field459[var4] > arg1 && field459[var4] < arg1 + arg3) {
                field482[var4] = true;
            }
        }
    }

    @ObfuscatedName("bz.bt(I)V")
    public static final void method1604() {
        method711();
        if (Statics.field572 != null || field256 != null) {
            return;
        }
        int var12;
        int var13;
        label196: {
            int var0 = class127.field1998;
            if (field403) {
                if (var0 != 1 && (Statics.field285 || var0 != 4)) {
                    int var1 = class127.field1989;
                    int var2 = class127.field1990;
                    if (var1 < Statics.field1865 - 10 || var1 > Statics.field1865 + Statics.field1059 + 10 || var2 < Statics.field156 - 10 || var2 > Statics.field156 + Statics.field1115 + 10) {
                        field403 = false;
                        method135(Statics.field1865, Statics.field156, Statics.field1059, Statics.field1115);
                    }
                }
                if (var0 == 1 || !Statics.field285 && var0 == 4) {
                    int var3 = Statics.field1865;
                    int var4 = Statics.field156;
                    int var5 = Statics.field1059;
                    int var6 = class127.field1996;
                    int var7 = class127.field1997;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field402; var9++) {
                        int var10 = (field402 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method505(var8);
                    }
                    field403 = false;
                    method135(Statics.field1865, Statics.field156, Statics.field1059, Statics.field1115);
                }
            } else {
                if ((var0 == 1 || !Statics.field285 && var0 == 4) && field402 > 0) {
                    int var11 = field405[field402 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field377[field402 - 1];
                        var13 = field320[field402 - 1];
                        class153 var14 = class153.method1974(var13);
                        if (class157.method2857(method3(var14))) {
                            break label196;
                        }
                        int var15 = method3(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label196;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field285 && var0 == 4) && (field480 == 1 && field402 > 2 || method98(field402 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field285 && var0 == 4) && field402 > 0) {
                    method505(field402 - 1);
                }
                if (var0 == 2 && field402 > 0) {
                    method2406(class127.field1996, class127.field1997);
                }
            }
            return;
        }
        if (Statics.field572 != null && !field375 && field480 != 1 && !method98(field402 - 1) && field402 > 0) {
            method142(field372, field473);
        }
        field375 = false;
        field518 = 0;
        if (Statics.field572 != null) {
            method2750(Statics.field572);
        }
        Statics.field572 = class153.method1974(var13);
        field371 = var12;
        field372 = class127.field1996;
        field473 = class127.field1997;
        if (field402 > 0) {
            method168(field402 - 1);
        }
        method2750(Statics.field572);
    }

    @ObfuscatedName("dr.bu(III)V")
    public static final void method2406(int arg0, int arg1) {
        int var2 = Statics.field253.method3299(class143.field2294);
        for (int var3 = 0; var3 < field402; var3++) {
            int var4 = Statics.field253.method3299(method2067(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field402 * 15 + 21;
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
        Statics.field1865 = var6;
        Statics.field156 = var7;
        Statics.field1059 = var2;
        Statics.field1115 = field402 * 15 + 22;
    }

    @ObfuscatedName("a.bl(II)Z")
    public static final boolean method98(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field405[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("f.ba(II)V")
    public static final void method505(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field377[arg0];
        int var2 = field320[arg0];
        int var3 = field405[arg0];
        int var4 = field406[arg0];
        String var5 = field407[arg0];
        String var6 = field273[arg0];
        method2081(var1, var2, var3, var4, var5, var6, class127.field1996, class127.field1997);
    }

    @ObfuscatedName("cf.bw(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2081(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 23) {
            Statics.field997.method1651(Statics.field83, arg0, arg1);
        }
        if (arg2 == 1002) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field301.method2355(66);
            field301.method2169(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 19) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(191);
            field301.method2169(arg3);
            field301.method2167(Statics.field1002 + arg1);
            field301.method2124(class124.field1951[82] ? 1 : 0);
            field301.method2125(Statics.field1791 + arg0);
        }
        if (arg2 == 13) {
            class30 var8 = field298[arg3];
            if (var8 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(151);
                field301.method2160(class124.field1951[82] ? 1 : 0);
                field301.method2167(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var9 = field521[arg3];
            if (var9 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(222);
                field301.method2161(class124.field1951[82] ? 1 : 0);
                field301.method2169(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var10 = field521[arg3];
            if (var10 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(155);
                field301.method2167(arg3);
                field301.method2161(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field301.method2355(235);
            field301.method2127(arg1);
            class153 var11 = class153.method1974(arg1);
            if (var11.field2628 != null && var11.field2628[0][0] == 5) {
                int var12 = var11.field2628[0][1];
                if (class155.field2663[var12] != var11.field2630[0]) {
                    class155.field2663[var12] = var11.field2630[0];
                    method29(var12);
                }
            }
        }
        if (arg2 == 41) {
            field301.method2355(128);
            field301.method2169(arg3);
            field301.method2180(arg0);
            field301.method2177(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 17) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(146);
            field301.method2161(class124.field1951[82] ? 1 : 0);
            field301.method2167(arg3);
            field301.method2180(Statics.field1791 + arg0);
            field301.method2177(Statics.field1887);
            field301.method2125(field416);
            field301.method2125(Statics.field1002 + arg1);
        }
        if (arg2 == 38) {
            method1880();
            class153 var13 = class153.method1974(arg1);
            field413 = 1;
            Statics.field1836 = arg0;
            Statics.field141 = arg1;
            Statics.field1930 = arg3;
            method2750(var13);
            field414 = class2.method836(16748608) + class45.method1982(arg3).field1014 + class2.method836(16777215);
            if (field414 == null) {
                field414 = "null";
            }
            return;
        }
        if (arg2 == 2) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(136);
            field301.method2169(field416);
            field301.method2125(arg3 >> 14 & 0x7FFF);
            field301.method2161(class124.field1951[82] ? 1 : 0);
            field301.method2167(Statics.field1002 + arg1);
            field301.method2217(Statics.field1887);
            field301.method2167(Statics.field1791 + arg0);
        }
        if (arg2 == 51) {
            class3 var14 = field521[arg3];
            if (var14 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(76);
                field301.method2180(arg3);
                field301.method2161(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class30 var15 = field298[arg3];
            if (var15 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(60);
                field301.method2160(class124.field1951[82] ? 1 : 0);
                field301.method2180(arg3);
            }
        }
        if (arg2 == 7) {
            class30 var16 = field298[arg3];
            if (var16 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(167);
                field301.method2169(arg3);
                field301.method2124(class124.field1951[82] ? 1 : 0);
                field301.method2180(Statics.field1930);
                field301.method2167(Statics.field1836);
                field301.method2177(Statics.field141);
            }
        }
        if (arg2 == 8) {
            class30 var17 = field298[arg3];
            if (var17 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(251);
                field301.method2169(arg3);
                field301.method2127(Statics.field1887);
                field301.method2125(field416);
                field301.method2161(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class30 var18 = field298[arg3];
            if (var18 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(140);
                field301.method2180(arg3);
                field301.method2124(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field301.method2355(110);
            field301.method2125(arg3);
            field301.method2169(arg0);
            field301.method2292(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 1001) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(77);
            field301.method2125(Statics.field1791 + arg0);
            field301.method2125(Statics.field1002 + arg1);
            field301.method2124(class124.field1951[82] ? 1 : 0);
            field301.method2180(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field301.method2355(187);
            field301.method2167(field416);
            field301.method2217(arg1);
            field301.method2167(arg3);
            field301.method2217(Statics.field1887);
            field301.method2169(arg0);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 58) {
            class153 var19 = class153.method1781(arg1, arg0);
            if (var19 != null) {
                field301.method2355(121);
                field301.method2127(arg1);
                field301.method2169(field416);
                field301.method2217(Statics.field1887);
                field301.method2167(var19.field2636);
                field301.method2167(arg0);
                field301.method2125(field417);
            }
        }
        if (arg2 == 36) {
            field301.method2355(21);
            field301.method2180(arg0);
            field301.method2180(arg3);
            field301.method2177(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 10) {
            class30 var20 = field298[arg3];
            if (var20 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(34);
                field301.method2167(arg3);
                field301.method2159(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field301.method2355(71);
            field301.method2217(arg1);
            field301.method2125(arg3);
            field301.method2180(arg0);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 1003) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            class30 var21 = field298[arg3];
            if (var21 != null) {
                class35 var22 = var21.field698;
                if (var22.field827 != null) {
                    var22 = var22.method637();
                }
                if (var22 != null) {
                    field301.method2355(206);
                    field301.method2180(var22.field828);
                }
            }
        }
        if (arg2 == 24) {
            class153 var23 = class153.method1974(arg1);
            boolean var24 = true;
            if (var23.field2608 > 0) {
                var24 = method2417(var23);
            }
            if (var24) {
                field301.method2355(235);
                field301.method2127(arg1);
            }
        }
        if (arg2 == 5) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(135);
            field301.method2160(class124.field1951[82] ? 1 : 0);
            field301.method2180(Statics.field1002 + arg1);
            field301.method2169(Statics.field1791 + arg0);
            field301.method2125(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(216);
            field301.method2125(Statics.field1930);
            field301.method2125(Statics.field1791 + arg0);
            field301.method2169(Statics.field1002 + arg1);
            field301.method2161(class124.field1951[82] ? 1 : 0);
            field301.method2169(arg3 >> 14 & 0x7FFF);
            field301.method2177(Statics.field141);
            field301.method2125(Statics.field1836);
        }
        if (arg2 == 6) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(39);
            field301.method2167(Statics.field1002 + arg1);
            field301.method2167(arg3 >> 14 & 0x7FFF);
            field301.method2124(class124.field1951[82] ? 1 : 0);
            field301.method2180(Statics.field1791 + arg0);
        }
        if (arg2 == 18) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(250);
            field301.method2125(Statics.field1791 + arg0);
            field301.method2167(arg3);
            field301.method2167(Statics.field1002 + arg1);
            field301.method2160(class124.field1951[82] ? 1 : 0);
        }
        if (arg2 == 35) {
            field301.method2355(61);
            field301.method2167(arg3);
            field301.method2180(arg0);
            field301.method2292(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 37) {
            field301.method2355(105);
            field301.method2180(arg3);
            field301.method2167(arg0);
            field301.method2127(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 22) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(156);
            field301.method2159(class124.field1951[82] ? 1 : 0);
            field301.method2169(Statics.field1002 + arg1);
            field301.method2125(arg3);
            field301.method2167(Statics.field1791 + arg0);
        }
        if (arg2 == 16) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(169);
            field301.method2169(Statics.field1791 + arg0);
            field301.method2125(Statics.field1002 + arg1);
            field301.method2167(Statics.field1930);
            field301.method2159(class124.field1951[82] ? 1 : 0);
            field301.method2167(arg3);
            field301.method2217(Statics.field141);
            field301.method2125(Statics.field1836);
        }
        if (arg2 == 15) {
            class3 var25 = field521[arg3];
            if (var25 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(7);
                field301.method2160(class124.field1951[82] ? 1 : 0);
                field301.method2167(arg3);
                field301.method2217(Statics.field1887);
                field301.method2180(field416);
            }
        }
        if (arg2 == 3) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(150);
            field301.method2159(class124.field1951[82] ? 1 : 0);
            field301.method2167(Statics.field1791 + arg0);
            field301.method2167(arg3 >> 14 & 0x7FFF);
            field301.method2180(Statics.field1002 + arg1);
        }
        if (arg2 == 1005) {
            class153 var26 = class153.method1974(arg1);
            if (var26 == null || var26.field2635[arg0] < 100000) {
                field301.method2355(148);
                field301.method2125(arg3);
            } else {
                class10.method2769(27, "", var26.field2635[arg0] + " x " + class45.method1982(arg3).field1014);
            }
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 30 && field424 == null) {
            method99(arg1, arg0);
            field424 = class153.method1781(arg1, arg0);
            method2750(field424);
        }
        if (arg2 == 48) {
            class3 var27 = field521[arg3];
            if (var27 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(87);
                field301.method2161(class124.field1951[82] ? 1 : 0);
                field301.method2167(arg3);
            }
        }
        if (arg2 == 1004) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field301.method2355(148);
            field301.method2125(arg3);
        }
        if (arg2 == 43) {
            field301.method2355(196);
            field301.method2125(arg3);
            field301.method2292(arg1);
            field301.method2125(arg0);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 44) {
            class3 var28 = field521[arg3];
            if (var28 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(101);
                field301.method2159(class124.field1951[82] ? 1 : 0);
                field301.method2180(arg3);
            }
        }
        if (arg2 == 4) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(30);
            field301.method2159(class124.field1951[82] ? 1 : 0);
            field301.method2180(Statics.field1002 + arg1);
            field301.method2125(Statics.field1791 + arg0);
            field301.method2125(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 31) {
            field301.method2355(19);
            field301.method2180(arg0);
            field301.method2180(Statics.field1930);
            field301.method2169(Statics.field1836);
            field301.method2177(arg1);
            field301.method2292(Statics.field141);
            field301.method2180(arg3);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 34) {
            field301.method2355(81);
            field301.method2180(arg0);
            field301.method2217(arg1);
            field301.method2169(arg3);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 20) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(49);
            field301.method2180(Statics.field1791 + arg0);
            field301.method2125(arg3);
            field301.method2124(class124.field1951[82] ? 1 : 0);
            field301.method2167(Statics.field1002 + arg1);
        }
        if (arg2 == 50) {
            class3 var29 = field521[arg3];
            if (var29 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(24);
                field301.method2161(class124.field1951[82] ? 1 : 0);
                field301.method2167(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var30 = field521[arg3];
            if (var30 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(40);
                field301.method2167(arg3);
                field301.method2160(class124.field1951[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class153 var31 = class153.method1781(arg1, arg0);
            if (var31 != null) {
                method1880();
                int var34 = method3(var31);
                int var35 = var34 >> 11 & 0x3F;
                method32(arg1, arg0, var35, var31.field2636);
                field413 = 0;
                field334 = method2660(var31);
                if (field334 == null) {
                    field334 = "Null";
                }
                if (var31.field2531) {
                    field419 = var31.field2592 + class2.method836(16777215);
                } else {
                    field419 = class2.method836(65280) + var31.field2632 + class2.method836(16777215);
                }
            }
            return;
        }
        if (arg2 == 21) {
            field365 = arg6;
            field366 = arg7;
            field368 = 2;
            field376 = 0;
            field489 = arg0;
            field490 = arg1;
            field301.method2355(161);
            field301.method2160(class124.field1951[82] ? 1 : 0);
            field301.method2167(Statics.field1791 + arg0);
            field301.method2167(arg3);
            field301.method2180(Statics.field1002 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var36 = class153.method1781(arg1, arg0);
            if (var36 != null) {
                method1877(arg3, arg1, arg0, var36.field2636, arg5);
            }
        }
        if (arg2 == 28) {
            field301.method2355(235);
            field301.method2127(arg1);
            class153 var37 = class153.method1974(arg1);
            if (var37.field2628 != null && var37.field2628[0][0] == 5) {
                int var38 = var37.field2628[0][1];
                class155.field2663[var38] = 1 - class155.field2663[var38];
                method29(var38);
            }
        }
        if (arg2 == 12) {
            class30 var39 = field298[arg3];
            if (var39 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(254);
                field301.method2161(class124.field1951[82] ? 1 : 0);
                field301.method2167(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var40 = field521[arg3];
            if (var40 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(80);
                field301.method2125(Statics.field1836);
                field301.method2159(class124.field1951[82] ? 1 : 0);
                field301.method2127(Statics.field141);
                field301.method2180(Statics.field1930);
                field301.method2125(arg3);
            }
        }
        if (arg2 == 40) {
            field301.method2355(172);
            field301.method2169(arg0);
            field301.method2217(arg1);
            field301.method2125(arg3);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (arg2 == 47) {
            class3 var41 = field521[arg3];
            if (var41 != null) {
                field365 = arg6;
                field366 = arg7;
                field368 = 2;
                field376 = 0;
                field489 = arg0;
                field490 = arg1;
                field301.method2355(158);
                field301.method2160(class124.field1951[82] ? 1 : 0);
                field301.method2180(arg3);
            }
        }
        if (arg2 == 26) {
            field301.method2355(48);
            for (class4 var42 = (class4) field351.method3153(); var42 != null; var42 = (class4) field351.method3151()) {
                if (var42.field70 == 0 || var42.field70 == 3) {
                    method589(var42, true);
                }
            }
            if (field424 != null) {
                method2750(field424);
                field424 = null;
            }
        }
        if (arg2 == 39) {
            field301.method2355(63);
            field301.method2169(arg0);
            field301.method2180(arg3);
            field301.method2177(arg1);
            field369 = 0;
            Statics.field2677 = class153.method1974(arg1);
            field370 = arg0;
        }
        if (field413 != 0) {
            field413 = 0;
            method2750(class153.method1974(Statics.field141));
        }
        if (field415) {
            method1880();
        }
        if (Statics.field2677 != null && field369 == 0) {
            method2750(Statics.field2677);
        }
    }

    @ObfuscatedName("el.bj(ILjava/lang/String;I)V")
    public static void method2652(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field379; var3++) {
            class3 var4 = field521[field380[var3]];
            if (var4 != null && var4.field53 != null && var4.field53.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field301.method2355(101);
                    field301.method2159(0);
                    field301.method2180(field380[var3]);
                } else if (arg0 == 4) {
                    field301.method2355(158);
                    field301.method2160(0);
                    field301.method2180(field380[var3]);
                } else if (arg0 == 6) {
                    field301.method2355(155);
                    field301.method2167(field380[var3]);
                    field301.method2161(0);
                } else if (arg0 == 7) {
                    field301.method2355(24);
                    field301.method2161(0);
                    field301.method2167(field380[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method2769(4, "", class143.field2290 + arg1);
        }
    }

    @ObfuscatedName("d.bq(IIIII)V")
    public static void method32(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class153.method1781(arg0, arg1);
        if (var4 != null && var4.field2532 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field12 = var4.field2532;
            class32.method2843(var5, 200000);
        }
        field417 = arg3;
        field415 = true;
        Statics.field1887 = arg0;
        field416 = arg1;
        Statics.field565 = arg2;
        method2750(var4);
    }

    @ObfuscatedName("cu.bk(I)V")
    public static void method1880() {
        if (!field415) {
            return;
        }
        class153 var0 = class153.method1781(Statics.field1887, field416);
        if (var0 != null && var0.field2611 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2611;
            class32.method2843(var1, 200000);
        }
        field415 = false;
        method2750(var0);
    }

    @ObfuscatedName("a.by(IIB)V")
    public static void method99(int arg0, int arg1) {
        field301.method2355(240);
        field301.method2177(arg0);
        field301.method2169(arg1);
    }

    @ObfuscatedName("cu.bc(IIIILjava/lang/String;B)V")
    public static void method1877(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class153 var5 = class153.method1781(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2619 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field13 = arg0;
            var6.field10 = arg4;
            var6.field12 = var5.field2619;
            class32.method2843(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2608 > 0) {
            var7 = method2417(var5);
        }
        if (!var7 || !class157.method2082(method3(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field301.method2355(225);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 2) {
            field301.method2355(94);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 3) {
            field301.method2355(160);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 4) {
            field301.method2355(246);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 5) {
            field301.method2355(157);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 6) {
            field301.method2355(106);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 7) {
            field301.method2355(122);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 8) {
            field301.method2355(232);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 9) {
            field301.method2355(211);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
        if (arg0 == 10) {
            field301.method2355(168);
            field301.method2127(arg1);
            field301.method2125(arg2);
            field301.method2125(arg3);
        }
    }

    @ObfuscatedName("ai.bp(B)V")
    public static final void method711() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field402 - 1; var1++) {
                if (field405[var1] < 1000 && field405[var1 + 1] > 1000) {
                    String var2 = field273[var1];
                    field273[var1] = field273[var1 + 1];
                    field273[var1 + 1] = var2;
                    String var3 = field407[var1];
                    field407[var1] = field407[var1 + 1];
                    field407[var1 + 1] = var3;
                    int var4 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var4;
                    int var5 = field377[var1];
                    field377[var1] = field377[var1 + 1];
                    field377[var1 + 1] = var5;
                    int var6 = field320[var1];
                    field320[var1] = field320[var1 + 1];
                    field320[var1 + 1] = var6;
                    int var7 = field406[var1];
                    field406[var1] = field406[var1 + 1];
                    field406[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ak.bz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method586(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field403 || field402 >= 500) {
            return;
        }
        field407[field402] = arg0;
        field273[field402] = arg1;
        field405[field402] = arg2;
        field406[field402] = arg3;
        field377[field402] = arg4;
        field320[field402] = arg5;
        field402++;
    }

    @ObfuscatedName("e.bm(I)V")
    public static void method116() {
        for (int var0 = 0; var0 < field402; var0++) {
            if (method9(field405[var0])) {
                if (var0 < field402 - 1) {
                    for (int var1 = var0; var1 < field402 - 1; var1++) {
                        field407[var1] = field407[var1 + 1];
                        field273[var1] = field273[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field406[var1] = field406[var1 + 1];
                        field377[var1] = field377[var1 + 1];
                        field320[var1] = field320[var1 + 1];
                    }
                }
                field402--;
            }
        }
    }

    @ObfuscatedName("x.cr(IS)Z")
    public static boolean method9(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cz.cg(II)Ljava/lang/String;")
    public static String method2067(int arg0) {
        return field273[arg0].length() > 0 ? field407[arg0] + class143.field2301 + field273[arg0] : field407[arg0];
    }

    @ObfuscatedName("ew.cm(Laf;IIIB)V")
    public static final void method2655(class35 arg0, int arg1, int arg2, int arg3) {
        if (field402 >= 400) {
            return;
        }
        if (arg0.field827 != null) {
            arg0 = arg0.method637();
        }
        if (arg0 == null || !arg0.field798 || arg0.field832 && field428 != arg1) {
            return;
        }
        String var4 = arg0.field802;
        if (arg0.field819 != 0) {
            var4 = var4 + method2628(arg0.field819, Statics.field1751.field44) + " " + class2.field23 + class143.field2297 + arg0.field819 + class2.field29;
        }
        if (field413 == 1) {
            method586(class143.field2153, field414 + " " + class2.field25 + " " + class2.method836(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field415) {
            String[] var5 = arg0.field817;
            if (field431) {
                var5 = method818(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class143.field2253)) {
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
                        method586(var5[var6], class2.method836(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class143.field2253)) {
                        short var9 = 0;
                        if (field286 == class18.field536 || field286 == class18.field532 && arg0.field819 > Statics.field1751.field44) {
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
                        method586(var5[var8], class2.method836(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method586(class143.field2292, class2.method836(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field565 & 0x2) == 2) {
            method586(field334, field419 + " " + class2.field25 + " " + class2.method836(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ak.cs(Lk;IIII)V")
    public static final void method585(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1751 == arg0 || field402 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field53 + method2628(arg0.field44, Statics.field1751.field44) + " " + class2.field23 + class143.field2297 + arg0.field44 + class2.field29;
        } else {
            var4 = arg0.field53 + " " + class2.field23 + class143.field2141 + arg0.field42 + class2.field29;
        }
        if (field413 == 1) {
            method586(class143.field2153, field414 + " " + class2.field25 + " " + class2.method836(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field415) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field350[var5] != null) {
                    short var6 = 0;
                    if (field350[var5].equalsIgnoreCase(class143.field2253)) {
                        if (field286 == class18.field536 || field286 == class18.field532 && arg0.field44 > Statics.field1751.field44) {
                            var6 = 2000;
                        }
                        if (Statics.field1751.field37 != 0 && arg0.field37 != 0) {
                            if (Statics.field1751.field37 == arg0.field37) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field390[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field408[var5] + var6;
                    method586(field350[var5], class2.method836(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field565 & 0x8) == 8) {
            method586(field334, field419 + " " + class2.field25 + " " + class2.method836(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field402; var9++) {
            if (field405[var9] == 23) {
                field273[var9] = class2.method836(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("eq.cb(IIB)Ljava/lang/String;")
    public static final String method2628(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method836(16711680);
        } else if (var2 < -6) {
            return class2.method836(16723968);
        } else if (var2 < -3) {
            return class2.method836(16740352);
        } else if (var2 < 0) {
            return class2.method836(16756736);
        } else if (var2 > 9) {
            return class2.method836(65280);
        } else if (var2 > 6) {
            return class2.method836(4259584);
        } else if (var2 > 3) {
            return class2.method836(8453888);
        } else if (var2 > 0) {
            return class2.method836(12648192);
        } else {
            return class2.method836(16776960);
        }
    }

    @ObfuscatedName("j.cc(IIIIIIIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class153.method2384(arg0)) {
            Statics.field2102 = null;
            method1321(Statics.field2545[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2102 != null) {
                method1321(Statics.field2102, -1412584499, arg1, arg2, arg3, arg4, Statics.field34, Statics.field1336, arg7);
                Statics.field2102 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field482[var8] = true;
            }
        } else {
            field482[arg7] = true;
        }
    }

    @ObfuscatedName("bt.cl([Lep;IIIIIIIIB)V")
    public static final void method1321(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1528(arg2, arg3, arg4, arg5);
        class84.method1784();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class153 var10 = arg0[var9];
            if (var10 != null && (var10.field2543 == arg1 || arg1 == -1412584499 && field256 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field467[field462] = var10.field2537 + arg6;
                    field459[field462] = var10.field2538 + arg7;
                    field469[field462] = var10.field2541;
                    field497[field462] = var10.field2542;
                    var11 = ++field462 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2525 = var11;
                var10.field2648 = field440;
                if (!var10.field2531 || !method495(var10)) {
                    if (var10.field2608 > 0) {
                        method2801(var10);
                    }
                    int var12 = var10.field2537 + arg6;
                    int var13 = var10.field2538 + arg7;
                    int var14 = var10.field2550;
                    if (field256 == var10) {
                        if (arg1 != -1412584499 && !var10.field2633) {
                            Statics.field2102 = arg0;
                            Statics.field34 = arg6;
                            Statics.field1336 = arg7;
                            continue;
                        }
                        if (field357 && field437) {
                            int var15 = class127.field1989;
                            int var16 = class127.field1990;
                            int var17 = var15 - field338;
                            int var18 = var16 - field432;
                            if (var17 < field438) {
                                var17 = field438;
                            }
                            if (var10.field2541 + var17 > field438 + field339.field2541) {
                                var17 = field438 + field339.field2541 - var10.field2541;
                            }
                            if (var18 < field439) {
                                var18 = field439;
                            }
                            if (var10.field2542 + var18 > field439 + field339.field2542) {
                                var18 = field439 + field339.field2542 - var10.field2542;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2633) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2534 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2534 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2541 + var12;
                        int var26 = var10.field2542 + var13;
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
                        int var29 = var10.field2541 + var12;
                        int var30 = var10.field2542 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2531 || var19 < var21 && var20 < var22) {
                        if (var10.field2608 != 0) {
                            if (var10.field2608 == 1337) {
                                field409 = var12;
                                field315 = var13;
                                method162(var12, var13, var10.field2541, var10.field2542);
                                class73.method1528(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2608 == 1338) {
                                method76(var12, var13, var11);
                                class73.method1528(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2534 == 0) {
                            if (!var10.field2531 && method495(var10) && Statics.field2847 != var10) {
                                continue;
                            }
                            if (!var10.field2531) {
                                if (var10.field2536 > var10.field2548 - var10.field2542) {
                                    var10.field2536 = var10.field2548 - var10.field2542;
                                }
                                if (var10.field2536 < 0) {
                                    var10.field2536 = 0;
                                }
                            }
                            method1321(arg0, var10.field2641, var19, var20, var21, var22, var12 - var10.field2582, var13 - var10.field2536, var11);
                            if (var10.field2640 != null) {
                                method1321(var10.field2640, var10.field2641, var19, var20, var21, var22, var12 - var10.field2582, var13 - var10.field2536, var11);
                            }
                            class4 var31 = (class4) field351.method3149((long) var10.field2641);
                            if (var31 != null) {
                                method148(var31.field68, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1528(arg2, arg3, arg4, arg5);
                            class84.method1784();
                        }
                        if (field466[var11] || field471 > 1) {
                            if (var10.field2534 == 0 && !var10.field2531 && var10.field2548 > var10.field2542) {
                                method2800(var10.field2541 + var12, var13, var10.field2536, var10.field2542, var10.field2548);
                            }
                            if (var10.field2534 != 1) {
                                if (var10.field2534 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var10.field2542; var33++) {
                                        for (int var34 = 0; var34 < var10.field2541; var34++) {
                                            int var35 = (var10.field2585 + 32) * var34 + var12;
                                            int var36 = (var10.field2586 + 32) * var33 + var13;
                                            if (var32 < 20) {
                                                var35 += var10.field2587[var32];
                                                var36 += var10.field2588[var32];
                                            }
                                            if (var10.field2565[var32] > 0) {
                                                boolean var37 = false;
                                                boolean var38 = false;
                                                int var39 = var10.field2565[var32] - 1;
                                                if (var35 + 32 > arg2 && var35 < arg4 && var36 + 32 > arg3 && var36 < arg5 || Statics.field572 == var10 && field371 == var32) {
                                                    class72 var40;
                                                    if (field413 == 1 && Statics.field1836 == var32 && Statics.field141 == var10.field2641) {
                                                        var40 = class45.method1421(var39, var10.field2635[var32], 2, 0, false);
                                                    } else {
                                                        var40 = class45.method1421(var39, var10.field2635[var32], 1, 3153952, false);
                                                    }
                                                    if (var40 == null) {
                                                        method2750(var10);
                                                    } else if (Statics.field572 == var10 && field371 == var32) {
                                                        int var41 = class127.field1989 - field372;
                                                        int var42 = class127.field1990 - field473;
                                                        if (var41 < 5 && var41 > -5) {
                                                            var41 = 0;
                                                        }
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (field518 < 5) {
                                                            var41 = 0;
                                                            var42 = 0;
                                                        }
                                                        var40.method1474(var35 + var41, var36 + var42, 128);
                                                        if (arg1 != -1) {
                                                            class153 var43 = arg0[arg1 & 0xFFFF];
                                                            if (var36 + var42 < class73.field1301 && var43.field2536 > 0) {
                                                                int var44 = field335 * (class73.field1301 - var36 - var42) / 3;
                                                                if (var44 > field335 * 10) {
                                                                    var44 = field335 * 10;
                                                                }
                                                                if (var44 > var43.field2536) {
                                                                    var44 = var43.field2536;
                                                                }
                                                                var43.field2536 -= var44;
                                                                field473 += var44;
                                                                method2750(var43);
                                                            }
                                                            if (var36 + var42 + 32 > class73.field1304 && var43.field2536 < var43.field2548 - var43.field2542) {
                                                                int var45 = field335 * (var36 + var42 + 32 - class73.field1304) / 3;
                                                                if (var45 > field335 * 10) {
                                                                    var45 = field335 * 10;
                                                                }
                                                                if (var45 > var43.field2548 - var43.field2542 - var43.field2536) {
                                                                    var45 = var43.field2548 - var43.field2542 - var43.field2536;
                                                                }
                                                                var43.field2536 += var45;
                                                                field473 -= var45;
                                                                method2750(var43);
                                                            }
                                                        }
                                                    } else if (Statics.field2677 == var10 && field370 == var32) {
                                                        var40.method1474(var35, var36, 128);
                                                    } else {
                                                        var40.method1502(var35, var36);
                                                    }
                                                }
                                            } else if (var10.field2554 != null && var32 < 20) {
                                                class72 var46 = var10.method2840(var32);
                                                if (var46 != null) {
                                                    var46.method1502(var35, var36);
                                                } else if (class153.field2530) {
                                                    method2750(var10);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                } else if (var10.field2534 == 3) {
                                    int var47;
                                    if (method588(var10)) {
                                        var47 = var10.field2557;
                                        if (Statics.field2847 == var10 && var10.field2552 != 0) {
                                            var47 = var10.field2552;
                                        }
                                    } else {
                                        var47 = var10.field2603;
                                        if (Statics.field2847 == var10 && var10.field2551 != 0) {
                                            var47 = var10.field2551;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2614) {
                                            class73.method1534(var12, var13, var10.field2541, var10.field2542, var47);
                                        } else {
                                            class73.method1536(var12, var13, var10.field2541, var10.field2542, var47);
                                        }
                                    } else if (var10.field2614) {
                                        class73.method1533(var12, var13, var10.field2541, var10.field2542, var47, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1561(var12, var13, var10.field2541, var10.field2542, var47, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2534 == 4) {
                                    class194 var48 = var10.method2809();
                                    if (var48 != null) {
                                        String var49 = var10.field2579;
                                        int var50;
                                        if (method588(var10)) {
                                            var50 = var10.field2557;
                                            if (Statics.field2847 == var10 && var10.field2552 != 0) {
                                                var50 = var10.field2552;
                                            }
                                            if (var10.field2560.length() > 0) {
                                                var49 = var10.field2560;
                                            }
                                        } else {
                                            var50 = var10.field2603;
                                            if (Statics.field2847 == var10 && var10.field2551 != 0) {
                                                var50 = var10.field2551;
                                            }
                                        }
                                        if (var10.field2531 && var10.field2636 != -1) {
                                            class45 var51 = class45.method1982(var10.field2636);
                                            var49 = var51.field1014;
                                            if (var49 == null) {
                                                var49 = "null";
                                            }
                                            if ((var51.field1025 == 1 || var10.field2597 != 1) && var10.field2597 != -1) {
                                                var49 = class2.method836(16748608) + var49 + class2.field27 + " " + 'x' + method2500(var10.field2597);
                                            }
                                        }
                                        if (field424 == var10) {
                                            class143 var10000 = (class143) null;
                                            var49 = class143.field2299;
                                            var50 = var10.field2603;
                                        }
                                        if (!var10.field2531) {
                                            var49 = method153(var49, var10);
                                        }
                                        var48.method3307(var49, var12, var13, var10.field2541, var10.field2542, var50, var10.field2600 ? 0 : -1, var10.field2647, var10.field2571, var10.field2581);
                                    } else if (class153.field2530) {
                                        method2750(var10);
                                    }
                                } else if (var10.field2534 == 5) {
                                    if (var10.field2531) {
                                        class72 var53;
                                        if (var10.field2636 == -1) {
                                            var53 = var10.method2807(false);
                                        } else {
                                            var53 = class45.method1421(var10.field2636, var10.field2597, var10.field2595, var10.field2561, false);
                                        }
                                        if (var53 != null) {
                                            int var54 = var53.field1293;
                                            int var55 = var53.field1294;
                                            if (var10.field2549) {
                                                class73.method1529(var12, var13, var10.field2541 + var12, var10.field2542 + var13);
                                                int var56 = (var10.field2541 + (var54 - 1)) / var54;
                                                int var57 = (var10.field2542 + (var55 - 1)) / var55;
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    for (int var59 = 0; var59 < var57; var59++) {
                                                        if (var10.field2558 != 0) {
                                                            var53.method1456(var54 / 2 + var54 * var58 + var12, var55 / 2 + var55 * var59 + var13, var10.field2558, 4096);
                                                        } else if (var14 == 0) {
                                                            var53.method1502(var54 * var58 + var12, var55 * var59 + var13);
                                                        } else {
                                                            var53.method1474(var54 * var58 + var12, var55 * var59 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1528(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var60 = var10.field2541 * 4096 / var54;
                                                if (var10.field2558 != 0) {
                                                    var53.method1456(var10.field2541 / 2 + var12, var10.field2542 / 2 + var13, var10.field2558, var60);
                                                } else if (var14 != 0) {
                                                    var53.method1433(var12, var13, var10.field2541, var10.field2542, 256 - (var14 & 0xFF));
                                                } else if (var10.field2541 == var54 && var10.field2542 == var55) {
                                                    var53.method1502(var12, var13);
                                                } else {
                                                    var53.method1496(var12, var13, var10.field2541, var10.field2542);
                                                }
                                            }
                                        } else if (class153.field2530) {
                                            method2750(var10);
                                        }
                                    } else {
                                        class72 var52 = var10.method2807(method588(var10));
                                        if (var52 != null) {
                                            var52.method1502(var12, var13);
                                        } else if (class153.field2530) {
                                            method2750(var10);
                                        }
                                    }
                                } else if (var10.field2534 == 6) {
                                    boolean var61 = method588(var10);
                                    int var62;
                                    if (var61) {
                                        var62 = var10.field2555;
                                    } else {
                                        var62 = var10.field2568;
                                    }
                                    class98 var63 = null;
                                    int var64 = 0;
                                    if (var10.field2636 != -1) {
                                        class45 var65 = class45.method1982(var10.field2636);
                                        if (var65 != null) {
                                            class45 var66 = var65.method851(var10.field2597);
                                            var63 = var66.method868(1);
                                            if (var63 == null) {
                                                method2750(var10);
                                            } else {
                                                var63.method1989();
                                                var64 = var63.field1339 / 2;
                                            }
                                        }
                                    } else if (var10.field2564 == 5) {
                                        if (var10.field2563 == 0) {
                                            var63 = field515.method2873((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var63 = Statics.field1751.method18();
                                        }
                                    } else if (var62 == -1) {
                                        var63 = var10.method2810((class38) null, -1, var61, Statics.field1751.field58);
                                        if (var63 == null && class153.field2530) {
                                            method2750(var10);
                                        }
                                    } else {
                                        class38 var67 = class38.method658(var62);
                                        var63 = var10.method2810(var67, var10.field2638, var61, Statics.field1751.field58);
                                        if (var63 == null && class153.field2530) {
                                            method2750(var10);
                                        }
                                    }
                                    class84.method1787(var10.field2541 / 2 + var12, var10.field2542 / 2 + var13);
                                    int var68 = var10.field2572 * class84.field1466[var10.field2546] >> 16;
                                    int var69 = var10.field2572 * class84.field1467[var10.field2546] >> 16;
                                    if (var63 != null) {
                                        if (var10.field2531) {
                                            var63.method1989();
                                            if (var10.field2577) {
                                                var63.method2003(0, var10.field2573, var10.field2580, var10.field2546, var10.field2570, var10.field2522 + var64 + var68, var10.field2522 + var69, var10.field2572);
                                            } else {
                                                var63.method2002(0, var10.field2573, var10.field2580, var10.field2546, var10.field2570, var10.field2522 + var64 + var68, var10.field2522 + var69);
                                            }
                                        } else {
                                            var63.method2002(0, var10.field2573, 0, var10.field2546, 0, var68, var69);
                                        }
                                    }
                                    class84.method1786();
                                } else {
                                    if (var10.field2534 == 7) {
                                        class194 var70 = var10.method2809();
                                        if (var70 == null) {
                                            if (class153.field2530) {
                                                method2750(var10);
                                            }
                                            continue;
                                        }
                                        int var71 = 0;
                                        for (int var72 = 0; var72 < var10.field2542; var72++) {
                                            for (int var73 = 0; var73 < var10.field2541; var73++) {
                                                if (var10.field2565[var71] > 0) {
                                                    class45 var74 = class45.method1982(var10.field2565[var71] - 1);
                                                    String var75;
                                                    if (var74.field1025 != 1 && var10.field2635[var71] == 1) {
                                                        var75 = class2.method836(16748608) + var74.field1014 + class2.field27;
                                                    } else {
                                                        var75 = class2.method836(16748608) + var74.field1014 + class2.field27 + " " + 'x' + method2500(var10.field2635[var71]);
                                                    }
                                                    int var76 = (var10.field2585 + 115) * var73 + var12;
                                                    int var77 = (var10.field2586 + 12) * var72 + var13;
                                                    if (var10.field2647 == 0) {
                                                        var70.method3344(var75, var76, var77, var10.field2603, var10.field2600 ? 0 : -1);
                                                    } else if (var10.field2647 == 1) {
                                                        var70.method3306(var75, var10.field2541 / 2 + var76, var77, var10.field2603, var10.field2600 ? 0 : -1);
                                                    } else {
                                                        var70.method3305(var75, var10.field2541 + var76 - 1, var77, var10.field2603, var10.field2600 ? 0 : -1);
                                                    }
                                                }
                                                var71++;
                                            }
                                        }
                                    }
                                    if (var10.field2534 == 8 && Statics.field1252 == var10 && field411 == field272) {
                                        int var78 = 0;
                                        int var79 = 0;
                                        class194 var80 = Statics.field2111;
                                        String var81 = var10.field2579;
                                        String var82 = method153(var81, var10);
                                        while (var82.length() > 0) {
                                            int var83 = var82.indexOf(class2.field24);
                                            String var84;
                                            if (var83 == -1) {
                                                var84 = var82;
                                                var82 = "";
                                            } else {
                                                var84 = var82.substring(0, var83);
                                                var82 = var82.substring(var83 + 4);
                                            }
                                            int var85 = var80.method3299(var84);
                                            if (var85 > var78) {
                                                var78 = var85;
                                            }
                                            var79 += var80.field2916 + 1;
                                        }
                                        var78 += 6;
                                        var79 += 7;
                                        int var86 = var10.field2541 + var12 - 5 - var78;
                                        int var87 = var10.field2542 + var13 + 5;
                                        if (var86 < var12 + 5) {
                                            var86 = var12 + 5;
                                        }
                                        if (var78 + var86 > arg4) {
                                            var86 = arg4 - var78;
                                        }
                                        if (var79 + var87 > arg5) {
                                            var87 = arg5 - var79;
                                        }
                                        class73.method1534(var86, var87, var78, var79, 16777120);
                                        class73.method1536(var86, var87, var78, var79, 0);
                                        String var88 = var10.field2579;
                                        int var89 = var80.field2916 + var87 + 2;
                                        String var90 = method153(var88, var10);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf(class2.field24);
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            var80.method3344(var92, var86 + 3, var89, 0, -1);
                                            var89 += var80.field2916 + 1;
                                        }
                                    }
                                    if (var10.field2534 == 9) {
                                        if (var10.field2583 == 1) {
                                            class73.method1542(var12, var13, var10.field2541 + var12, var10.field2542 + var13, var10.field2603);
                                        } else {
                                            int var93 = var10.field2541 >= 0 ? var10.field2541 : -var10.field2541;
                                            int var94 = var10.field2542 >= 0 ? var10.field2542 : -var10.field2542;
                                            int var95 = var93;
                                            if (var93 < var94) {
                                                var95 = var94;
                                            }
                                            if (var95 != 0) {
                                                int var96 = (var10.field2541 << 16) / var95;
                                                int var97 = (var10.field2542 << 16) / var95;
                                                if (var97 <= var96) {
                                                    var96 = -var96;
                                                } else {
                                                    var97 = -var97;
                                                }
                                                int var98 = var10.field2583 * var97 >> 17;
                                                int var99 = var10.field2583 * var97 + 1 >> 17;
                                                int var100 = var10.field2583 * var96 >> 17;
                                                int var101 = var10.field2583 * var96 + 1 >> 17;
                                                int var102 = var12 + var98;
                                                int var103 = var12 - var99;
                                                int var104 = var10.field2541 + var12 - var99;
                                                int var105 = var10.field2541 + var12 + var98;
                                                int var106 = var13 + var100;
                                                int var107 = var13 - var101;
                                                int var108 = var10.field2542 + var13 - var101;
                                                int var109 = var10.field2542 + var13 + var100;
                                                class84.method1809(var102, var103, var104);
                                                class84.method1827(var106, var107, var108, var102, var103, var104, var10.field2603);
                                                class84.method1809(var102, var104, var105);
                                                class84.method1827(var106, var108, var109, var102, var104, var105, var10.field2603);
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

    @ObfuscatedName("j.ch(Ljava/lang/String;Lep;I)Ljava/lang/String;")
    public static String method153(String arg0, class153 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method157(arg1, var2 - 1);
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
                    int var9 = Statics.field278.field2047;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field278.field2049 != null) {
                        var8 = (String) Statics.field278.field2049;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dj.cw(IB)Ljava/lang/String;")
    public static final String method2500(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method836(65408) + var1.substring(0, var1.length() - 8) + class143.field2350 + " " + class2.field23 + var1 + class2.field29 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method836(16777215) + var1.substring(0, var1.length() - 4) + class143.field2304 + " " + class2.field23 + var1 + class2.field29 + class2.field27;
        } else {
            return " " + class2.method836(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("ec.cn(Lep;IIIIIII)V")
    public static final void method2778(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field340) {
            field341 = 32;
        } else {
            field341 = 0;
        }
        field340 = false;
        if (class127.field1988 == 1 || !Statics.field285 && class127.field1988 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2536 -= 4;
                method2750(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2536 += 4;
                method2750(arg0);
            } else if (arg5 >= arg1 - field341 && arg5 < field341 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2536 = (arg4 - arg3) * var8 / var9;
                method2750(arg0);
                field340 = true;
            }
        }
        if (field457 == 0) {
            return;
        }
        int var10 = arg0.field2541;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2536 += field457 * 45;
            method2750(arg0);
        }
    }

    @ObfuscatedName("ee.cu(IIIIII)V")
    public static final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1335[0].method1590(arg0, arg1);
        Statics.field1335[1].method1590(arg0, arg1 + arg3 - 16);
        class73.method1534(arg0, arg1 + 16, 16, arg3 - 32, field336);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1534(arg0, arg1 + 16 + var6, 16, var5, field337);
        class73.method1537(arg0, arg1 + 16 + var6, var5, field383);
        class73.method1537(arg0 + 1, arg1 + 16 + var6, var5, field383);
        class73.method1538(arg0, arg1 + 16 + var6, 16, field383);
        class73.method1538(arg0, arg1 + 17 + var6, 16, field383);
        class73.method1537(arg0 + 15, arg1 + 16 + var6, var5, field282);
        class73.method1537(arg0 + 14, arg1 + 17 + var6, var5 - 1, field282);
        class73.method1538(arg0, arg1 + 15 + var6 + var5, 16, field282);
        class73.method1538(arg0 + 1, arg1 + 14 + var6 + var5, 15, field282);
    }

    @ObfuscatedName("ak.cd(Lep;I)Z")
    public static final boolean method588(class153 arg0) {
        if (arg0.field2629 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2629.length; var1++) {
            int var2 = Statics.method157(arg0, var1);
            int var3 = arg0.field2630[var1];
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

    @ObfuscatedName("u.cj(Lep;III)V")
    public static final void method167(class153 arg0, int arg1, int arg2) {
        if (arg0.field2535 == 1) {
            method586(arg0.field2590, "", 24, 0, 0, arg0.field2641);
        }
        if (arg0.field2535 == 2 && !field415) {
            String var3 = method2660(arg0);
            if (var3 != null) {
                method586(var3, class2.method836(65280) + arg0.field2632, 25, 0, -1, arg0.field2641);
            }
        }
        if (arg0.field2535 == 3) {
            method586(class143.field2300, "", 26, 0, 0, arg0.field2641);
        }
        if (arg0.field2535 == 4) {
            method586(arg0.field2590, "", 28, 0, 0, arg0.field2641);
        }
        if (arg0.field2535 == 5) {
            method586(arg0.field2590, "", 29, 0, 0, arg0.field2641);
        }
        if (arg0.field2535 == 6 && field424 == null) {
            method586(arg0.field2590, "", 30, 0, -1, arg0.field2641);
        }
        if (arg0.field2534 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2542; var5++) {
                for (int var6 = 0; var6 < arg0.field2541; var6++) {
                    int var7 = (arg0.field2585 + 32) * var6;
                    int var8 = (arg0.field2586 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2587[var4];
                        var8 += arg0.field2588[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field374 = var4;
                        Statics.field699 = arg0;
                        if (arg0.field2565[var4] > 0) {
                            label330: {
                                class45 var9 = class45.method1982(arg0.field2565[var4] - 1);
                                if (field413 == 1) {
                                    int var10 = method3(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field141 != arg0.field2641 || Statics.field1836 != var4) {
                                            method586(class143.field2153, field414 + " " + class2.field25 + " " + class2.method836(16748608) + var9.field1014, 31, var9.field1012, var4, arg0.field2641);
                                        }
                                        break label330;
                                    }
                                }
                                if (field415) {
                                    int var12 = method3(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field565 & 0x10) == 16) {
                                            method586(field334, field419 + " " + class2.field25 + " " + class2.method836(16748608) + var9.field1014, 32, var9.field1012, var4, arg0.field2641);
                                        }
                                        break label330;
                                    }
                                }
                                String[] var14 = var9.field1029;
                                if (field431) {
                                    var14 = method818(var14);
                                }
                                int var15 = method3(arg0);
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
                                            method586(var14[var17], class2.method836(16748608) + var9.field1014, var18, var9.field1012, var4, arg0.field2641);
                                        } else if (var17 == 4) {
                                            method586(class143.field2156, class2.method836(16748608) + var9.field1014, 37, var9.field1012, var4, arg0.field2641);
                                        }
                                    }
                                }
                                class157 var10000 = (class157) null;
                                if (class157.method1973(method3(arg0))) {
                                    method586(class143.field2153, class2.method836(16748608) + var9.field1014, 38, var9.field1012, var4, arg0.field2641);
                                }
                                int var19 = method3(arg0);
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
                                            method586(var14[var21], class2.method836(16748608) + var9.field1014, var22, var9.field1012, var4, arg0.field2641);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2612;
                                if (field431) {
                                    var23 = method818(var23);
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
                                            method586(var23[var24], class2.method836(16748608) + var9.field1014, var25, var9.field1012, var4, arg0.field2641);
                                        }
                                    }
                                }
                                method586(class143.field2292, class2.method836(16748608) + var9.field1014, 1005, var9.field1012, var4, arg0.field2641);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2531) {
            return;
        }
        if (field415) {
            int var26 = method3(arg0);
            boolean var27 = (var26 >> 21 & 0x1) != 0;
            if (var27 && (Statics.field565 & 0x20) == 32) {
                method586(field334, field419 + " " + class2.field25 + " " + arg0.field2592, 58, 0, arg0.field2584, arg0.field2641);
            }
            return;
        }
        for (int var28 = 9; var28 >= 5; var28--) {
            String var29;
            if (!class157.method2082(method3(arg0), var28) && arg0.field2619 == null) {
                var29 = null;
            } else if (arg0.field2605 == null || arg0.field2605.length <= var28 || arg0.field2605[var28] == null || arg0.field2605[var28].trim().length() == 0) {
                var29 = null;
            } else {
                var29 = arg0.field2605[var28];
            }
            if (var29 != null) {
                method586(var29, arg0.field2592, 1007, var28 + 1, arg0.field2584, arg0.field2641);
            }
        }
        String var31 = method2660(arg0);
        if (var31 != null) {
            method586(var31, arg0.field2592, 25, 0, arg0.field2584, arg0.field2641);
        }
        for (int var32 = 4; var32 >= 0; var32--) {
            String var33;
            if (!class157.method2082(method3(arg0), var32) && arg0.field2619 == null) {
                var33 = null;
            } else if (arg0.field2605 == null || arg0.field2605.length <= var32 || arg0.field2605[var32] == null || arg0.field2605[var32].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field2605[var32];
            }
            if (var33 != null) {
                method586(var33, arg0.field2592, 57, var32 + 1, arg0.field2584, arg0.field2641);
            }
        }
        int var35 = method3(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method586(class143.field2147, "", 30, 0, arg0.field2584, arg0.field2641);
        }
    }

    @ObfuscatedName("cj.cx([Lep;IIIIIIII)V")
    public static final void method1883(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class153 var9 = arg0[var8];
            if (var9 != null && (!var9.field2531 || var9.field2534 == 0 || var9.field2599 || method3(var9) != 0 || field339 == var9) && var9.field2543 == arg1 && (!var9.field2531 || !method495(var9))) {
                int var10 = var9.field2537 + arg6;
                int var11 = var9.field2538 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2534 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2534 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2541 + var10;
                    int var19 = var9.field2542 + var11;
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
                    int var22 = var9.field2541 + var10;
                    int var23 = var9.field2542 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field256 == var9) {
                    field333 = true;
                    field426 = var10;
                    field442 = var11;
                }
                if (!var9.field2531 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1989;
                    int var25 = class127.field1990;
                    if (class127.field1998 != 0) {
                        var24 = class127.field1996;
                        var25 = class127.field1997;
                    }
                    if (var9.field2608 == 1337) {
                        method2750(var9);
                        if (!field266 && !field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field413 == 0 && !field415) {
                                method586(class143.field2337, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class98.field1682; var28++) {
                                int var29 = class98.field1724[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field997.method1736(Statics.field83, var30, var31, var29) >= 0) {
                                        class36 var34 = class36.method2071(var33);
                                        if (var34.field865 != null) {
                                            var34 = var34.method670();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field413 == 1) {
                                            method586(class143.field2153, field414 + " " + class2.field25 + " " + class2.method836(65535) + var34.field845, 1, var29, var30, var31);
                                        } else if (!field415) {
                                            String[] var35 = var34.field867;
                                            if (field431) {
                                                var35 = method818(var35);
                                            }
                                            if (var35 != null) {
                                                for (int var36 = 4; var36 >= 0; var36--) {
                                                    if (var35[var36] != null) {
                                                        short var37 = 0;
                                                        if (var36 == 0) {
                                                            var37 = 3;
                                                        }
                                                        if (var36 == 1) {
                                                            var37 = 4;
                                                        }
                                                        if (var36 == 2) {
                                                            var37 = 5;
                                                        }
                                                        if (var36 == 3) {
                                                            var37 = 6;
                                                        }
                                                        if (var36 == 4) {
                                                            var37 = 1001;
                                                        }
                                                        method586(var35[var36], class2.method836(65535) + var34.field845, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method586(class143.field2292, class2.method836(65535) + var34.field845, 1002, var34.field847 << 14, var30, var31);
                                        } else if ((Statics.field565 & 0x4) == 4) {
                                            method586(field334, field419 + " " + class2.field25 + " " + class2.method836(65535) + var34.field845, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class30 var38 = field298[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field698.field803 == 1 && (var38.field772 & 0x7F) == 64 && (var38.field732 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field299; var39++) {
                                                class30 var40 = field298[field300[var39]];
                                                if (var40 != null && var38 != var40 && var40.field698.field803 == 1 && var38.field772 == var40.field772 && var38.field732 == var40.field732) {
                                                    method2655(var40.field698, field300[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field379; var41++) {
                                                class3 var42 = field521[field380[var41]];
                                                if (var42 != null && var38.field772 == var42.field772 && var38.field732 == var42.field732) {
                                                    method585(var42, field380[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method2655(var38.field698, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field521[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field772 & 0x7F) == 64 && (var43.field732 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field299; var44++) {
                                                class30 var45 = field298[field300[var44]];
                                                if (var45 != null && var45.field698.field803 == 1 && var43.field772 == var45.field772 && var43.field732 == var45.field732) {
                                                    method2655(var45.field698, field300[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field379; var46++) {
                                                class3 var47 = field521[field380[var46]];
                                                if (var47 != null && var43 != var47 && var43.field772 == var47.field772 && var43.field732 == var47.field732) {
                                                    method585(var47, field380[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field385 == var33) {
                                            var26 = var29;
                                        } else {
                                            method585(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class178 var48 = field393[Statics.field83][var30][var31];
                                        if (var48 != null) {
                                            for (class25 var49 = (class25) var48.method3187(); var49 != null; var49 = (class25) var48.method3194()) {
                                                class45 var50 = class45.method1982(var49.field619);
                                                if (field413 == 1) {
                                                    method586(class143.field2153, field414 + " " + class2.field25 + " " + class2.method836(16748608) + var50.field1014, 16, var49.field619, var30, var31);
                                                } else if (!field415) {
                                                    String[] var51 = var50.field1028;
                                                    if (field431) {
                                                        var51 = method818(var51);
                                                    }
                                                    for (int var52 = 4; var52 >= 0; var52--) {
                                                        if (var51 != null && var51[var52] != null) {
                                                            byte var53 = 0;
                                                            if (var52 == 0) {
                                                                var53 = 18;
                                                            }
                                                            if (var52 == 1) {
                                                                var53 = 19;
                                                            }
                                                            if (var52 == 2) {
                                                                var53 = 20;
                                                            }
                                                            if (var52 == 3) {
                                                                var53 = 21;
                                                            }
                                                            if (var52 == 4) {
                                                                var53 = 22;
                                                            }
                                                            method586(var51[var52], class2.method836(16748608) + var50.field1014, var53, var49.field619, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method586(class143.field2142, class2.method836(16748608) + var50.field1014, 20, var49.field619, var30, var31);
                                                        }
                                                    }
                                                    method586(class143.field2292, class2.method836(16748608) + var50.field1014, 1004, var49.field619, var30, var31);
                                                } else if ((Statics.field565 & 0x1) == 1) {
                                                    method586(field334, field419 + " " + class2.field25 + " " + class2.method836(16748608) + var50.field1014, 17, var49.field619, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field521[field385];
                                method585(var56, field385, var54, var55);
                            }
                        }
                    } else if (var9.field2608 != 1338) {
                        if (!field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method167(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2534 == 0) {
                            if (!var9.field2531 && method495(var9) && Statics.field2847 != var9) {
                                continue;
                            }
                            method1883(arg0, var9.field2641, var12, var13, var14, var15, var10 - var9.field2582, var11 - var9.field2536);
                            if (var9.field2640 != null) {
                                method1883(var9.field2640, var9.field2641, var12, var13, var14, var15, var10 - var9.field2582, var11 - var9.field2536);
                            }
                            class4 var68 = (class4) field351.method3149((long) var9.field2641);
                            if (var68 != null) {
                                if (var68.field70 == 0 && class127.field1989 >= var12 && class127.field1990 >= var13 && class127.field1989 < var14 && class127.field1990 < var15 && !field403 && !field430) {
                                    field407[0] = class143.field2377;
                                    field273[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                                int var69 = var68.field68;
                                if (class153.method2384(var69)) {
                                    method1883(Statics.field2545[var69], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2531) {
                            if (var9.field2649 && class127.field1989 >= var12 && class127.field1990 >= var13 && class127.field1989 < var14 && class127.field1990 < var15) {
                                for (class1 var70 = (class1) field458.method3179(); var70 != null; var70 = (class1) field458.method3199()) {
                                    if (var70.field2) {
                                        var70.method3277();
                                        var70.field3.field2559 = false;
                                    }
                                }
                                if (Statics.field219 == 0) {
                                    field256 = null;
                                    field339 = null;
                                }
                                if (!field403) {
                                    field407[0] = class143.field2377;
                                    field273[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                            }
                            boolean var71;
                            if (class127.field1989 >= var12 && class127.field1990 >= var13 && class127.field1989 < var14 && class127.field1990 < var15) {
                                var71 = true;
                            } else {
                                var71 = false;
                            }
                            boolean var72 = false;
                            if ((class127.field1988 == 1 || !Statics.field285 && class127.field1988 == 4) && var71) {
                                var72 = true;
                            }
                            boolean var73 = false;
                            if ((class127.field1998 == 1 || !Statics.field285 && class127.field1998 == 4) && class127.field1996 >= var12 && class127.field1997 >= var13 && class127.field1996 < var14 && class127.field1997 < var15) {
                                var73 = true;
                            }
                            if (var73) {
                                method522(var9, class127.field1996 - var10, class127.field1997 - var11);
                            }
                            if (field256 != null && field256 != var9 && var71) {
                                int var74 = method3(var9);
                                boolean var75 = (var74 >> 20 & 0x1) != 0;
                                if (var75) {
                                    field316 = var9;
                                }
                            }
                            if (field339 == var9) {
                                field437 = true;
                                field438 = var10;
                                field439 = var11;
                            }
                            if (var9.field2599) {
                                if (var71 && field457 != 0 && var9.field2620 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field3 = var9;
                                    var76.field1 = field457;
                                    var76.field12 = var9.field2620;
                                    field458.method3181(var76);
                                }
                                if (field256 != null || Statics.field572 != null || field403) {
                                    var73 = false;
                                    var72 = false;
                                    var71 = false;
                                }
                                if (!var9.field2642 && var73) {
                                    var9.field2642 = true;
                                    if (var9.field2601 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field3 = var9;
                                        var77.field4 = class127.field1996 - var10;
                                        var77.field1 = class127.field1997 - var11;
                                        var77.field12 = var9.field2601;
                                        field458.method3181(var77);
                                    }
                                }
                                if (var9.field2642 && var72 && var9.field2602 != null) {
                                    class1 var78 = new class1();
                                    var78.field2 = true;
                                    var78.field3 = var9;
                                    var78.field4 = class127.field1989 - var10;
                                    var78.field1 = class127.field1990 - var11;
                                    var78.field12 = var9.field2602;
                                    field458.method3181(var78);
                                }
                                if (var9.field2642 && !var72) {
                                    var9.field2642 = false;
                                    if (var9.field2569 != null) {
                                        class1 var79 = new class1();
                                        var79.field2 = true;
                                        var79.field3 = var9;
                                        var79.field4 = class127.field1989 - var10;
                                        var79.field1 = class127.field1990 - var11;
                                        var79.field12 = var9.field2569;
                                        field460.method3181(var79);
                                    }
                                }
                                if (var72 && var9.field2566 != null) {
                                    class1 var80 = new class1();
                                    var80.field2 = true;
                                    var80.field3 = var9;
                                    var80.field4 = class127.field1989 - var10;
                                    var80.field1 = class127.field1990 - var11;
                                    var80.field12 = var9.field2566;
                                    field458.method3181(var80);
                                }
                                if (!var9.field2559 && var71) {
                                    var9.field2559 = true;
                                    if (var9.field2627 != null) {
                                        class1 var81 = new class1();
                                        var81.field2 = true;
                                        var81.field3 = var9;
                                        var81.field4 = class127.field1989 - var10;
                                        var81.field1 = class127.field1990 - var11;
                                        var81.field12 = var9.field2627;
                                        field458.method3181(var81);
                                    }
                                }
                                if (var9.field2559 && var71 && var9.field2606 != null) {
                                    class1 var82 = new class1();
                                    var82.field2 = true;
                                    var82.field3 = var9;
                                    var82.field4 = class127.field1989 - var10;
                                    var82.field1 = class127.field1990 - var11;
                                    var82.field12 = var9.field2606;
                                    field458.method3181(var82);
                                }
                                if (var9.field2559 && !var71) {
                                    var9.field2559 = false;
                                    if (var9.field2607 != null) {
                                        class1 var83 = new class1();
                                        var83.field2 = true;
                                        var83.field3 = var9;
                                        var83.field4 = class127.field1989 - var10;
                                        var83.field1 = class127.field1990 - var11;
                                        var83.field12 = var9.field2607;
                                        field460.method3181(var83);
                                    }
                                }
                                if (var9.field2598 != null) {
                                    class1 var84 = new class1();
                                    var84.field3 = var9;
                                    var84.field12 = var9.field2598;
                                    field464.method3181(var84);
                                }
                                if (var9.field2533 != null && field446 > var9.field2644) {
                                    if (var9.field2613 == null || field446 - var9.field2644 > 32) {
                                        class1 var89 = new class1();
                                        var89.field3 = var9;
                                        var89.field12 = var9.field2533;
                                        field458.method3181(var89);
                                    } else {
                                        label789: for (int var85 = var9.field2644; var85 < field446; var85++) {
                                            int var86 = field445[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2613.length; var87++) {
                                                if (var9.field2613[var87] == var86) {
                                                    class1 var88 = new class1();
                                                    var88.field3 = var9;
                                                    var88.field12 = var9.field2533;
                                                    field458.method3181(var88);
                                                    break label789;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2644 = field446;
                                }
                                if (var9.field2526 != null && field448 > var9.field2645) {
                                    if (var9.field2615 == null || field448 - var9.field2645 > 32) {
                                        class1 var94 = new class1();
                                        var94.field3 = var9;
                                        var94.field12 = var9.field2526;
                                        field458.method3181(var94);
                                    } else {
                                        label765: for (int var90 = var9.field2645; var90 < field448; var90++) {
                                            int var91 = field447[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2615.length; var92++) {
                                                if (var9.field2615[var92] == var91) {
                                                    class1 var93 = new class1();
                                                    var93.field3 = var9;
                                                    var93.field12 = var9.field2526;
                                                    field458.method3181(var93);
                                                    break label765;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2645 = field448;
                                }
                                if (var9.field2616 != null && field476 > var9.field2646) {
                                    if (var9.field2617 == null || field476 - var9.field2646 > 32) {
                                        class1 var99 = new class1();
                                        var99.field3 = var9;
                                        var99.field12 = var9.field2616;
                                        field458.method3181(var99);
                                    } else {
                                        label741: for (int var95 = var9.field2646; var95 < field476; var95++) {
                                            int var96 = field449[var95 & 0x1F];
                                            for (int var97 = 0; var97 < var9.field2617.length; var97++) {
                                                if (var9.field2617[var97] == var96) {
                                                    class1 var98 = new class1();
                                                    var98.field3 = var9;
                                                    var98.field12 = var9.field2616;
                                                    field458.method3181(var98);
                                                    break label741;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2646 = field476;
                                }
                                if (field441 > var9.field2643 && var9.field2523 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field12 = var9.field2523;
                                    field458.method3181(var100);
                                }
                                if (field452 > var9.field2643 && var9.field2623 != null) {
                                    class1 var101 = new class1();
                                    var101.field3 = var9;
                                    var101.field12 = var9.field2623;
                                    field458.method3181(var101);
                                }
                                if (field453 > var9.field2643 && var9.field2624 != null) {
                                    class1 var102 = new class1();
                                    var102.field3 = var9;
                                    var102.field12 = var9.field2624;
                                    field458.method3181(var102);
                                }
                                if (field389 > var9.field2643 && var9.field2625 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field12 = var9.field2625;
                                    field458.method3181(var103);
                                }
                                var9.field2643 = field444;
                                if (var9.field2622 != null) {
                                    for (int var104 = 0; var104 < field499; var104++) {
                                        class1 var105 = new class1();
                                        var105.field3 = var9;
                                        var105.field8 = field284[var104];
                                        var105.field9 = field479[var104];
                                        var105.field12 = var9.field2622;
                                        field458.method3181(var105);
                                    }
                                }
                            }
                        }
                        if (!var9.field2531 && field256 == null && Statics.field572 == null && !field403) {
                            if ((var9.field2618 >= 0 || var9.field2551 != 0) && class127.field1989 >= var12 && class127.field1990 >= var13 && class127.field1989 < var14 && class127.field1990 < var15) {
                                if (var9.field2618 >= 0) {
                                    Statics.field2847 = arg0[var9.field2618];
                                } else {
                                    Statics.field2847 = var9;
                                }
                            }
                            if (var9.field2534 == 8 && class127.field1989 >= var12 && class127.field1990 >= var13 && class127.field1989 < var14 && class127.field1990 < var15) {
                                Statics.field1252 = var9;
                            }
                            if (var9.field2548 > var9.field2542) {
                                method2778(var9, var9.field2541 + var10, var11, var9.field2542, var9.field2548, class127.field1989, class127.field1990);
                            }
                        }
                    } else if ((field280 == 0 || field280 == 3) && (class127.field1998 == 1 || !Statics.field285 && class127.field1998 == 4)) {
                        int var57 = class127.field1996 - 25 - var10;
                        int var58 = class127.field1997 - 5 - var11;
                        if (var57 >= 0 && var58 >= 0 && var57 < 146 && var58 < 151 && (var57 < 0 || var57 > 23 || var58 < 117 || var58 > 142)) {
                            var57 -= 73;
                            var58 -= 75;
                            int var59 = field400 + field343 & 0x7FF;
                            int var60 = class84.field1466[var59];
                            int var61 = class84.field1467[var59];
                            int var62 = (field332 + 256) * var60 >> 8;
                            int var63 = (field332 + 256) * var61 >> 8;
                            int var64 = var57 * var63 + var58 * var62 >> 11;
                            int var65 = var58 * var63 - var57 * var62 >> 11;
                            int var66 = Statics.field1751.field772 + var64 >> 7;
                            int var67 = Statics.field1751.field732 - var65 >> 7;
                            field301.method2355(11);
                            field301.method2124(18);
                            field301.method2167(Statics.field1791 + var66);
                            field301.method2169(Statics.field1002 + var67);
                            field301.method2159(class124.field1951[82] ? (class124.field1951[81] ? 2 : 1) : 0);
                            field301.method2124(var57);
                            field301.method2124(var58);
                            field301.method2125(field343);
                            field301.method2124(57);
                            field301.method2124(field400);
                            field301.method2124(field332);
                            field301.method2124(89);
                            field301.method2125(Statics.field1751.field772);
                            field301.method2125(Statics.field1751.field732);
                            field301.method2124(63);
                            field489 = var66;
                            field490 = var67;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.ce(Lep;III)V")
    public static final void method522(class153 arg0, int arg1, int arg2) {
        if (field256 != null || field403 || arg0 == null || method158(arg0) == null) {
            return;
        }
        field256 = arg0;
        field339 = method158(arg0);
        field338 = arg1;
        field432 = arg2;
        Statics.field219 = 0;
        field357 = false;
        if (field402 > 0) {
            method168(field402 - 1);
        }
    }

    @ObfuscatedName("u.ci(IB)V")
    public static void method168(int arg0) {
        Statics.field79 = new class27();
        Statics.field79.field641 = field377[arg0];
        Statics.field79.field644 = field320[arg0];
        Statics.field79.field640 = field405[arg0];
        Statics.field79.field638 = field406[arg0];
        Statics.field79.field642 = field407[arg0];
    }

    @ObfuscatedName("v.cv(III)V")
    public static void method142(int arg0, int arg1) {
        class27 var2 = Statics.field79;
        method2081(var2.field641, var2.field644, var2.field640, var2.field638, var2.field642, var2.field642, arg0, arg1);
        Statics.field79 = null;
    }

    @ObfuscatedName("ej.cy(Lep;I)V")
    public static void method2750(class153 arg0) {
        if (field463 == arg0.field2648) {
            field482[arg0.field2525] = true;
        }
    }

    @ObfuscatedName("cv.cp(I)V")
    public static void method1984() {
        for (class4 var0 = (class4) field351.method3153(); var0 != null; var0 = (class4) field351.method3151()) {
            int var1 = var0.field68;
            if (class153.method2384(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2545[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2531;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2888;
                    class153 var6 = class153.method1974(var5);
                    if (var6 != null) {
                        method2750(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cz(Lep;I)Lep;")
    public static class153 method158(class153 arg0) {
        class153 var1 = arg0;
        int var2 = class157.method2845(method3(arg0));
        class153 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class153.method1974(var1.field2543);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class153 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2594;
        }
        return var5;
    }

    @ObfuscatedName("az.ck([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method818(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("k.cf(II)V")
    public static final void method11(int arg0) {
        if (!class153.method2384(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2545[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2638 = 0;
                var3.field2639 = 0;
            }
        }
    }

    @ObfuscatedName("eg.ca([Lep;IB)V")
    public static final void method2586(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null && var3.field2543 == arg1 && (!var3.field2531 || !method495(var3))) {
                if (var3.field2534 == 0) {
                    if (!var3.field2531 && method495(var3) && Statics.field2847 != var3) {
                        continue;
                    }
                    method2586(arg0, var3.field2641);
                    if (var3.field2640 != null) {
                        method2586(var3.field2640, var3.field2641);
                    }
                    class4 var4 = (class4) field351.method3149((long) var3.field2641);
                    if (var4 != null) {
                        int var5 = var4.field68;
                        if (class153.method2384(var5)) {
                            method2586(Statics.field2545[var5], -1);
                        }
                    }
                }
                if (var3.field2534 == 6) {
                    if (var3.field2568 != -1 || var3.field2555 != -1) {
                        boolean var6 = method588(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2555;
                        } else {
                            var7 = var3.field2568;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method658(var7);
                            var3.field2639 += field335;
                            while (var3.field2639 > var8.field906[var3.field2638]) {
                                var3.field2639 -= var8.field906[var3.field2638];
                                var3.field2638++;
                                if (var3.field2638 >= var8.field916.length) {
                                    var3.field2638 -= var8.field908;
                                    if (var3.field2638 < 0 || var3.field2638 >= var8.field916.length) {
                                        var3.field2638 = 0;
                                    }
                                }
                                method2750(var3);
                            }
                        }
                    }
                    if (var3.field2576 != 0 && !var3.field2531) {
                        int var9 = var3.field2576 >> 16;
                        int var10 = var3.field2576 << 16 >> 16;
                        int var11 = field335 * var9;
                        int var12 = field335 * var10;
                        var3.field2546 = var3.field2546 + var11 & 0x7FF;
                        var3.field2573 = var3.field2573 + var12 & 0x7FF;
                        method2750(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.ct(IB)V")
    public static final void method29(int arg0) {
        method1984();
        class20.method1972();
        int var1 = class46.method2544(arg0).field1057;
        if (var1 == 0) {
            return;
        }
        int var2 = class155.field2663[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class84.method1834(0.9D);
                ((class88) Statics.field1463).method1862(0.9D);
            }
            if (var2 == 2) {
                class84.method1834(0.8D);
                ((class88) Statics.field1463).method1862(0.8D);
            }
            if (var2 == 3) {
                class84.method1834(0.7D);
                ((class88) Statics.field1463).method1862(0.7D);
            }
            if (var2 == 4) {
                class84.method1834(0.6D);
                ((class88) Statics.field1463).method1862(0.6D);
            }
            class45.method112();
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
            if (field418 != var3) {
                if (field418 == 0 && field493 != -1) {
                    class162.method2519(Statics.field154, field493, 0, var3, false);
                    field288 = false;
                } else if (var3 == 0) {
                    class162.method2782();
                    field288 = false;
                } else {
                    class162.method770(var3);
                }
                field418 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field435 = 127;
            }
            if (var2 == 1) {
                field435 = 96;
            }
            if (var2 == 2) {
                field435 = 64;
            }
            if (var2 == 3) {
                field435 = 32;
            }
            if (var2 == 4) {
                field435 = 0;
            }
        }
        if (var1 == 5) {
            field480 = var2;
        }
        if (var1 == 6) {
            field346 = var2;
        }
        if (var1 == 9) {
            field423 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field254 = 127;
            }
            if (var2 == 1) {
                field254 = 96;
            }
            if (var2 == 2) {
                field254 = 64;
            }
            if (var2 == 3) {
                field254 = 32;
            }
            if (var2 == 4) {
                field254 = 0;
            }
        }
        if (var1 == 17) {
            field428 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field527, class18.field536, class18.field532 };
            field286 = (class18) class99.method519(var4, var2);
            if (field286 == null) {
                field286 = class18.field532;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field385 = -1;
        } else {
            field385 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("eb.du(Lep;I)V")
    public static final void method2801(class153 arg0) {
        int var1 = arg0.field2608;
        if (var1 == 324) {
            if (field516 == -1) {
                field516 = arg0.field2556;
                field517 = arg0.field2631;
            }
            if (field515.field2679) {
                arg0.field2556 = field516;
            } else {
                arg0.field2556 = field517;
            }
        } else if (var1 == 325) {
            if (field516 == -1) {
                field516 = arg0.field2556;
                field517 = arg0.field2631;
            }
            if (field515.field2679) {
                arg0.field2556 = field517;
            } else {
                arg0.field2556 = field516;
            }
        } else if (var1 == 327) {
            arg0.field2546 = 150;
            arg0.field2573 = (int) (Math.sin((double) field440 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2564 = 5;
            arg0.field2563 = 0;
        } else if (var1 == 328) {
            arg0.field2546 = 150;
            arg0.field2573 = (int) (Math.sin((double) field440 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2564 = 5;
            arg0.field2563 = 1;
        }
    }

    @ObfuscatedName("ak.dn(Li;ZI)V")
    public static final void method589(class4 arg0, boolean arg1) {
        int var2 = arg0.field68;
        int var3 = (int) arg0.field2888;
        arg0.method3277();
        if (arg1 && var2 != -1 && Statics.field2567[var2]) {
            Statics.field2524.method2686(var2);
            if (Statics.field2545[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2545[var2].length; var5++) {
                    if (Statics.field2545[var2][var5] != null) {
                        if (Statics.field2545[var2][var5].field2534 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2545[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2545[var2] = null;
                }
                Statics.field2567[var2] = false;
            }
        }
        for (class180 var6 = (class180) field461.method3153(); var6 != null; var6 = (class180) field461.method3151()) {
            if ((var6.field2888 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3277();
            }
        }
        class153 var7 = class153.method1974(var3);
        if (var7 != null) {
            method2750(var7);
        }
        method116();
        if (field420 != -1) {
            int var8 = field420;
            if (class153.method2384(var8)) {
                Statics.method96(Statics.field2545[var8], 1);
            }
        }
    }

    @ObfuscatedName("df.dw(Lep;I)Z")
    public static final boolean method2417(class153 arg0) {
        int var1 = arg0.field2608;
        if (var1 == 205) {
            field308 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field515.method2868(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field515.method2884(var4, var5 == 1);
        }
        if (var1 == 324) {
            field515.method2870(false);
        }
        if (var1 == 325) {
            field515.method2870(true);
        }
        if (var1 == 326) {
            field301.method2355(108);
            field515.method2866(field301);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.di(IIII)V")
    public static final void method76(int arg0, int arg1, int arg2) {
        method1783();
        class73.method1528(arg0, arg1, Statics.field1090.field1307 + arg0, Statics.field1090.field1310 + arg1);
        if (field280 == 2 || field280 == 5) {
            class73.method1541(arg0 + 25, arg1 + 5, 0, Statics.field155, Statics.field2724);
        } else {
            int var3 = field400 + field343 & 0x7FF;
            int var4 = Statics.field1751.field772 / 32 + 48;
            int var5 = 464 - Statics.field1751.field732 / 32;
            Statics.field1843.method1455(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field332 + 256, Statics.field155, Statics.field2724);
            for (int var6 = 0; var6 < field485; var6++) {
                int var7 = field486[var6] * 4 + 2 - Statics.field1751.field772 / 32;
                int var8 = field468[var6] * 4 + 2 - Statics.field1751.field732 / 32;
                method113(arg0, arg1, var7, var8, field488[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class178 var11 = field393[Statics.field83][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1751.field772 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1751.field732 / 32;
                        method113(arg0, arg1, var12, var13, Statics.field2087[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field299; var14++) {
                class30 var15 = field298[field300[var14]];
                if (var15 != null && var15.method14()) {
                    class35 var16 = var15.field698;
                    if (var16 != null && var16.field827 != null) {
                        var16 = var16.method637();
                    }
                    if (var16 != null && var16.field836 && var16.field798) {
                        int var17 = var15.field772 / 32 - Statics.field1751.field772 / 32;
                        int var18 = var15.field732 / 32 - Statics.field1751.field732 / 32;
                        method113(arg0, arg1, var17, var18, Statics.field2087[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field379; var19++) {
                class3 var20 = field521[field380[var19]];
                if (var20 != null && var20.method14() && !var20.field56) {
                    int var21 = var20.field772 / 32 - Statics.field1751.field772 / 32;
                    int var22 = var20.field732 / 32 - Statics.field1751.field732 / 32;
                    boolean var23 = false;
                    if (method2450(var20.field53, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field2090; var25++) {
                        if (var20.field53.equals(Statics.field1794[var25].field574)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1751.field37 != 0 && var20.field37 != 0 && Statics.field1751.field37 == var20.field37) {
                        var26 = true;
                    }
                    if (var23) {
                        method113(arg0, arg1, var21, var22, Statics.field2087[3]);
                    } else if (var26) {
                        method113(arg0, arg1, var21, var22, Statics.field2087[4]);
                    } else if (var24) {
                        method113(arg0, arg1, var21, var22, Statics.field2087[5]);
                    } else {
                        method113(arg0, arg1, var21, var22, Statics.field2087[2]);
                    }
                }
            }
            if (field392 != 0 && field440 % 20 < 10) {
                if (field392 == 1 && field276 >= 0 && field276 < field298.length) {
                    class30 var27 = field298[field276];
                    if (var27 != null) {
                        int var28 = var27.field772 / 32 - Statics.field1751.field772 / 32;
                        int var29 = var27.field732 / 32 - Statics.field1751.field732 / 32;
                        method3096(arg0, arg1, var28, var29, Statics.field1635[1]);
                    }
                }
                if (field392 == 2) {
                    int var30 = field264 * 4 - Statics.field1791 * 4 + 2 - Statics.field1751.field772 / 32;
                    int var31 = field279 * 4 - Statics.field1002 * 4 + 2 - Statics.field1751.field732 / 32;
                    method3096(arg0, arg1, var30, var31, Statics.field1635[1]);
                }
                if (field392 == 10 && field277 >= 0 && field277 < field521.length) {
                    class3 var32 = field521[field277];
                    if (var32 != null) {
                        int var33 = var32.field772 / 32 - Statics.field1751.field772 / 32;
                        int var34 = var32.field732 / 32 - Statics.field1751.field732 / 32;
                        method3096(arg0, arg1, var33, var34, Statics.field1635[1]);
                    }
                }
            }
            if (field489 != 0) {
                int var35 = field489 * 4 + 2 - Statics.field1751.field772 / 32;
                int var36 = field490 * 4 + 2 - Statics.field1751.field732 / 32;
                method113(arg0, arg1, var35, var36, Statics.field1635[0]);
            }
            if (!Statics.field1751.field56) {
                class73.method1534(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field280 < 3) {
            Statics.field573.method1455(arg0, arg1, 33, 33, 25, 25, field343, 256, Statics.field245, Statics.field78);
        } else {
            class73.method1541(arg0, arg1, 0, Statics.field245, Statics.field78);
        }
        if (field466[arg2]) {
            Statics.field1090.method1590(arg0, arg1);
        }
        field410[arg2] = true;
    }

    @ObfuscatedName("fw.dc(IIIILbq;I)V")
    public static final void method3096(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method113(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field400 + field343 & 0x7FF;
        int var7 = class84.field1466[var6];
        int var8 = class84.field1467[var6];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field213.method1441(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("w.dm(IIIILbq;I)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field400 + field343 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1466[var5];
        int var8 = class84.field1467[var5];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1472(Statics.field1090, arg0 + 94 + var11 - arg4.field1293 / 2 + 4, arg1 + 83 - var12 - arg4.field1294 / 2 - 4);
        } else {
            arg4.method1502(arg0 + 94 + var11 - arg4.field1293 / 2 + 4, arg1 + 83 - var12 - arg4.field1294 / 2 - 4);
        }
    }

    @ObfuscatedName("db.dv(Ljava/lang/String;ZB)Z")
    public static boolean method2450(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method1341(arg0, Statics.field153);
        for (int var3 = 0; var3 < field509; var3++) {
            if (var2.equalsIgnoreCase(class201.method1341(field511[var3].field232, Statics.field153)) && (!arg1 || field511[var3].field233 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method1341(Statics.field1751.field53, Statics.field153))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.dl(Ljava/lang/String;B)Z")
    public static boolean method699(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method1341(arg0, Statics.field153);
        for (int var2 = 0; var2 < field513; var2++) {
            class8 var3 = field514[var2];
            if (var1.equalsIgnoreCase(class201.method1341(var3.field137, Statics.field153))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method1341(var3.field133, Statics.field153))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("j.do(Ljava/lang/String;I)V")
    public static final void method154(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field509 < 200 || field314 == 1) || field509 >= 400) {
            class10.method2769(30, "", class143.field2307);
            return;
        }
        String var1 = class201.method1341(arg0, Statics.field153);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field509; var2++) {
            class16 var3 = field511[var2];
            String var4 = class201.method1341(var3.field232, Statics.field153);
            if (var4 != null && var4.equals(var1)) {
                class10.method2769(30, "", arg0 + class143.field2274);
                return;
            }
            if (var3.field236 != null) {
                String var5 = class201.method1341(var3.field236, Statics.field153);
                if (var5 != null && var5.equals(var1)) {
                    class10.method2769(30, "", arg0 + class143.field2274);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field513; var6++) {
            class8 var7 = field514[var6];
            String var8 = class201.method1341(var7.field137, Statics.field153);
            if (var8 != null && var8.equals(var1)) {
                class10.method2769(30, "", class143.field2313 + arg0 + class143.field2196);
                return;
            }
            if (var7.field133 != null) {
                String var9 = class201.method1341(var7.field133, Statics.field153);
                if (var9 != null && var9.equals(var1)) {
                    class10.method2769(30, "", class143.field2313 + arg0 + class143.field2196);
                    return;
                }
            }
        }
        if (class201.method1341(Statics.field1751.field53, Statics.field153).equals(var1)) {
            class10.method2769(30, "", class143.field2311);
            return;
        }
        field301.method2355(164);
        class110 var10 = field301;
        int var11 = arg0.length() + 1;
        var10.method2124(var11);
        field301.method2176(arg0);
    }

    @ObfuscatedName("dg.dp(Ljava/lang/String;B)V")
    public static final void method2501(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class201.method1341(arg0, Statics.field153);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field509; var2++) {
            class16 var3 = field511[var2];
            String var4 = var3.field232;
            String var5 = class201.method1341(var4, Statics.field153);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field509--;
                for (int var7 = var2; var7 < field509; var7++) {
                    field511[var7] = field511[var7 + 1];
                }
                field452 = field444;
                field301.method2355(9);
                class110 var8 = field301;
                int var9 = arg0.length() + 1;
                var8.method2124(var9);
                field301.method2176(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dj.dh(Ljava/lang/String;B)V")
    public static final void method2499(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class201.method1341(arg0, Statics.field153);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field513; var2++) {
            class8 var3 = field514[var2];
            String var4 = var3.field137;
            String var5 = class201.method1341(var4, Statics.field153);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field513--;
                for (int var7 = var2; var7 < field513; var7++) {
                    field514[var7] = field514[var7 + 1];
                }
                field452 = field444;
                field301.method2355(200);
                class110 var8 = field301;
                int var9 = arg0.length() + 1;
                var8.method2124(var9);
                field301.method2176(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("k.dx(Ljava/lang/String;II)V")
    public static final void method24(String arg0, int arg1) {
        field301.method2355(70);
        class110 var2 = field301;
        int var3 = arg0.length() + 1;
        var2.method2124(var3 + 1);
        field301.method2124(arg1);
        field301.method2176(arg0);
    }

    @ObfuscatedName("cu.dr(Ljava/lang/String;I)V")
    public static final void method1878(String arg0) {
        if (Statics.field1794 == null) {
            return;
        }
        field301.method2355(98);
        class110 var1 = field301;
        int var2 = arg0.length() + 1;
        var1.method2124(var2);
        field301.method2176(arg0);
    }

    @ObfuscatedName("ea.df(Ljava/lang/String;B)V")
    public static final void method2641(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field301.method2355(79);
        class110 var1 = field301;
        int var2 = arg0.length() + 1;
        var1.method2124(var2);
        field301.method2176(arg0);
    }

    @ObfuscatedName("dg.ds(B)V")
    public static final void method2502() {
        field301.method2355(79);
        field301.method2124(0);
    }

    @ObfuscatedName("n.da(Lep;I)I")
    public static int method3(class153 arg0) {
        class180 var1 = (class180) field461.method3149(((long) arg0.field2641 << 32) + (long) arg0.field2584);
        return var1 == null ? arg0.field2591 : var1.field2873;
    }

    @ObfuscatedName("f.dk(Lep;I)Z")
    public static boolean method495(class153 arg0) {
        if (field430) {
            if (method3(arg0) != 0) {
                return false;
            }
            if (arg0.field2534 == 0) {
                return false;
            }
        }
        return arg0.field2544;
    }

    @ObfuscatedName("eo.db(Lep;I)Ljava/lang/String;")
    public static String method2660(class153 arg0) {
        int var1 = method3(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2621 == null || arg0.field2621.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2621;
        }
    }

    @ObfuscatedName("cz.dt(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2069(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field259 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field259 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field259 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field259 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field259 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field263 + "/";
    }
}

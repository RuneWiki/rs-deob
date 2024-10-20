package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;

public final class client extends class131 {

    @ObfuscatedName("client.v")
    public static boolean field311 = true;

    @ObfuscatedName("client.l")
    public static int field402 = 1;

    @ObfuscatedName("client.g")
    public static int field431 = 0;

    @ObfuscatedName("client.r")
    public static int field255 = 0;

    @ObfuscatedName("client.w")
    public static class194[] field266 = new class194[4];

    @ObfuscatedName("client.o")
    public static boolean field256 = false;

    @ObfuscatedName("client.p")
    public static boolean field257 = false;

    @ObfuscatedName("client.n")
    public static int field497 = 0;

    @ObfuscatedName("client.s")
    public static int field260 = 0;

    @ObfuscatedName("client.t")
    public static boolean field261 = true;

    @ObfuscatedName("client.j")
    public static int field262 = 0;

    @ObfuscatedName("client.b")
    public static long field390 = 1L;

    @ObfuscatedName("client.h")
    public static int field265 = -1;

    @ObfuscatedName("client.q")
    public static int field440 = -1;

    @ObfuscatedName("client.d")
    public static int field410 = -1;

    @ObfuscatedName("client.z")
    public static boolean field268 = true;

    @ObfuscatedName("client.e")
    public static boolean field269 = false;

    @ObfuscatedName("client.av")
    public static int field270 = 0;

    @ObfuscatedName("client.al")
    public static int field317 = 0;

    @ObfuscatedName("client.aq")
    public static int field272 = 0;

    @ObfuscatedName("client.aa")
    public static int field273 = 0;

    @ObfuscatedName("client.ah")
    public static int field506 = 0;

    @ObfuscatedName("client.au")
    public static int field275 = 0;

    @ObfuscatedName("client.ai")
    public static int field280 = 0;

    @ObfuscatedName("client.ab")
    public static int field277 = 0;

    @ObfuscatedName("client.ag")
    public static int field263 = 0;

    @ObfuscatedName("client.ax")
    public static class107 field279 = new class107(new byte[5000]);

    @ObfuscatedName("client.ac")
    public static class18 field401 = class18.field513;

    @ObfuscatedName("client.ap")
    public static int field282 = 0;

    @ObfuscatedName("client.as")
    public static int field283 = 0;

    @ObfuscatedName("client.aw")
    public static int field284 = 0;

    @ObfuscatedName("client.bz")
    public static int field286 = 0;

    @ObfuscatedName("client.bv")
    public static int field287 = 0;

    @ObfuscatedName("client.by")
    public static int field288 = 0;

    @ObfuscatedName("client.bc")
    public static int field433 = 0;

    @ObfuscatedName("client.bo")
    public static int field290 = 0;

    @ObfuscatedName("client.bj")
    public static class30[] field291 = new class30[32768];

    @ObfuscatedName("client.br")
    public static int field482 = 0;

    @ObfuscatedName("client.bx")
    public static int[] field293 = new int[32768];

    @ObfuscatedName("client.ck")
    public static class110 field294 = new class110(5000);

    @ObfuscatedName("client.cn")
    public static class110 field295 = new class110(5000);

    @ObfuscatedName("client.cx")
    public static class110 field296 = new class110(5000);

    @ObfuscatedName("client.ci")
    public static int field427 = 0;

    @ObfuscatedName("client.ct")
    public static int field298 = 0;

    @ObfuscatedName("client.cs")
    public static int field442 = 0;

    @ObfuscatedName("client.cu")
    public static int field300 = 0;

    @ObfuscatedName("client.cc")
    public static int field405 = 0;

    @ObfuscatedName("client.cm")
    public static int field302 = 0;

    @ObfuscatedName("client.cg")
    public static int field303 = 0;

    @ObfuscatedName("client.cw")
    public static int field304 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field305 = false;

    @ObfuscatedName("client.cy")
    public static int field335 = 0;

    @ObfuscatedName("client.cf")
    public static int field307 = 0;

    @ObfuscatedName("client.ds")
    public static int field292 = 1;

    @ObfuscatedName("client.dd")
    public static int field338 = 0;

    @ObfuscatedName("client.do")
    public static int field310 = 1;

    @ObfuscatedName("client.dk")
    public static int field350 = 0;

    @ObfuscatedName("client.dq")
    public static boolean field313 = false;

    @ObfuscatedName("client.df")
    public static int[][][] field480 = new int[4][13][13];

    @ObfuscatedName("client.dw")
    public static final int[] field315 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field316 = 0;

    @ObfuscatedName("client.dy")
    public static int field413 = 2;

    @ObfuscatedName("client.dm")
    public static int field312 = 0;

    @ObfuscatedName("client.de")
    public static int field319 = 2;

    @ObfuscatedName("client.db")
    public static int field416 = 0;

    @ObfuscatedName("client.dc")
    public static int field321 = 1;

    @ObfuscatedName("client.dr")
    public static int field322 = 0;

    @ObfuscatedName("client.dl")
    public static int field323 = 0;

    @ObfuscatedName("client.dp")
    public static int field324 = 2;

    @ObfuscatedName("client.dj")
    public static int field325 = 0;

    @ObfuscatedName("client.el")
    public static int field409 = 1;

    @ObfuscatedName("client.eg")
    public static int field327 = 0;

    @ObfuscatedName("client.ek")
    public static int field443 = 0;

    @ObfuscatedName("client.ej")
    public static int field406 = 2301979;

    @ObfuscatedName("client.et")
    public static int field331 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field332 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field333 = 7759444;

    @ObfuscatedName("client.ew")
    public static boolean field334 = false;

    @ObfuscatedName("client.fq")
    public static int field460 = 0;

    @ObfuscatedName("client.fs")
    public static int field330 = 128;

    @ObfuscatedName("client.fd")
    public static int field289 = 0;

    @ObfuscatedName("client.fj")
    public static int field301 = 0;

    @ObfuscatedName("client.ff")
    public static int field306 = 0;

    @ObfuscatedName("client.fp")
    public static int field340 = 0;

    @ObfuscatedName("client.fo")
    public static int field451 = 0;

    @ObfuscatedName("client.fu")
    public static int field418 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field343 = false;

    @ObfuscatedName("client.fr")
    public static int field344 = 0;

    @ObfuscatedName("client.fm")
    public static int field339 = 0;

    @ObfuscatedName("client.fg")
    public static int field346 = 50;

    @ObfuscatedName("client.fn")
    public static int[] field347 = new int[field346];

    @ObfuscatedName("client.fc")
    public static int[] field348 = new int[field346];

    @ObfuscatedName("client.fb")
    public static int[] field349 = new int[field346];

    @ObfuscatedName("client.fh")
    public static int[] field345 = new int[field346];

    @ObfuscatedName("client.ft")
    public static int[] field351 = new int[field346];

    @ObfuscatedName("client.fe")
    public static int[] field379 = new int[field346];

    @ObfuscatedName("client.fi")
    public static int[] field353 = new int[field346];

    @ObfuscatedName("client.gw")
    public static String[] field354 = new String[field346];

    @ObfuscatedName("client.gg")
    public static int[][] field355 = new int[104][104];

    @ObfuscatedName("client.gn")
    public static int field450 = 0;

    @ObfuscatedName("client.gi")
    public static int field357 = -1;

    @ObfuscatedName("client.gp")
    public static int field358 = -1;

    @ObfuscatedName("client.gm")
    public static int field359 = 0;

    @ObfuscatedName("client.gv")
    public static int field360 = 0;

    @ObfuscatedName("client.gc")
    public static int field361 = 0;

    @ObfuscatedName("client.gk")
    public static int field362 = 0;

    @ObfuscatedName("client.gr")
    public static int field363 = 0;

    @ObfuscatedName("client.gx")
    public static int field364 = 0;

    @ObfuscatedName("client.gf")
    public static int field365 = 0;

    @ObfuscatedName("client.gt")
    public static int field366 = 0;

    @ObfuscatedName("client.gu")
    public static int field367 = 0;

    @ObfuscatedName("client.gy")
    public static int field368 = 0;

    @ObfuscatedName("client.go")
    public static boolean field369 = false;

    @ObfuscatedName("client.ge")
    public static int field448 = 0;

    @ObfuscatedName("client.gj")
    public static int field371 = 0;

    @ObfuscatedName("client.gq")
    public static class3[] field372 = new class3[2048];

    @ObfuscatedName("client.gz")
    public static int field373 = 0;

    @ObfuscatedName("client.gd")
    public static int[] field374 = new int[2048];

    @ObfuscatedName("client.hn")
    public static int field375 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field376 = new int[2048];

    @ObfuscatedName("client.hl")
    public static class107[] field377 = new class107[2048];

    @ObfuscatedName("client.hx")
    public static int field434 = -1;

    @ObfuscatedName("client.hs")
    public static int field336 = 0;

    @ObfuscatedName("client.he")
    public static int field326 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field381 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field382 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field281 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field384 = new boolean[8];

    @ObfuscatedName("client.hi")
    public static int[] field479 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field386 = -1;

    @ObfuscatedName("client.hp")
    public static class176[][][] field387 = new class176[4][104][104];

    @ObfuscatedName("client.hj")
    public static class176 field385 = new class176();

    @ObfuscatedName("client.hh")
    public static class176 field389 = new class176();

    @ObfuscatedName("client.hm")
    public static class176 field441 = new class176();

    @ObfuscatedName("client.hz")
    public static int[] field370 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field392 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field393 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field394 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field395 = false;

    @ObfuscatedName("client.ii")
    public static int field396 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field276 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field398 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field399 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field400 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.iv")
    public static String[] field320 = new String[500];

    @ObfuscatedName("client.im")
    public static int field403 = -1;

    @ObfuscatedName("client.ih")
    public static int field254 = -1;

    @ObfuscatedName("client.in")
    public static int field329 = 0;

    @ObfuscatedName("client.ic")
    public static int field258 = 50;

    @ObfuscatedName("client.ij")
    public static int field415 = 0;

    @ObfuscatedName("client.it")
    public static String field408 = null;

    @ObfuscatedName("client.ik")
    public static boolean field467 = false;

    @ObfuscatedName("client.if")
    public static int field328 = -1;

    @ObfuscatedName("client.jh")
    public static String field411 = null;

    @ObfuscatedName("client.ja")
    public static String field412 = null;

    @ObfuscatedName("client.jf")
    public static int field251 = -1;

    @ObfuscatedName("client.jm")
    public static class173 field414 = new class173(8);

    @ObfuscatedName("client.ju")
    public static int field297 = 0;

    @ObfuscatedName("client.ji")
    public static int field484 = 0;

    @ObfuscatedName("client.jz")
    public static class151 field391 = null;

    @ObfuscatedName("client.jn")
    public static int field404 = 0;

    @ObfuscatedName("client.jt")
    public static int field419 = 0;

    @ObfuscatedName("client.jv")
    public static int field388 = 0;

    @ObfuscatedName("client.je")
    public static int field421 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field422 = false;

    @ObfuscatedName("client.jy")
    public static boolean field423 = false;

    @ObfuscatedName("client.jx")
    public static boolean field424 = false;

    @ObfuscatedName("client.jp")
    public static class151 field475 = null;

    @ObfuscatedName("client.jj")
    public static class151 field426 = null;

    @ObfuscatedName("client.jc")
    public static int field308 = 0;

    @ObfuscatedName("client.jw")
    public static int field428 = 0;

    @ObfuscatedName("client.jd")
    public static class151 field429 = null;

    @ObfuscatedName("client.jr")
    public static boolean field430 = false;

    @ObfuscatedName("client.jl")
    public static int field492 = -1;

    @ObfuscatedName("client.jq")
    public static int field432 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field502 = false;

    @ObfuscatedName("client.jo")
    public static int field425 = -1;

    @ObfuscatedName("client.js")
    public static int field435 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field436 = false;

    @ObfuscatedName("client.kf")
    public static int field437 = 1;

    @ObfuscatedName("client.ke")
    public static int[] field438 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field439 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field477 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field267 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field445 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field309 = 0;

    @ObfuscatedName("client.kl")
    public static int field444 = 0;

    @ObfuscatedName("client.kd")
    public static int field278 = 0;

    @ObfuscatedName("client.kw")
    public static int field446 = 0;

    @ObfuscatedName("client.ki")
    public static int field447 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field271 = new int[2000];

    @ObfuscatedName("client.kq")
    public static String[] field449 = new String[1000];

    @ObfuscatedName("client.kt")
    public static int field487 = 0;

    @ObfuscatedName("client.kk")
    public static class176 field341 = new class176();

    @ObfuscatedName("client.kx")
    public static class176 field452 = new class176();

    @ObfuscatedName("client.kg")
    public static class176 field453 = new class176();

    @ObfuscatedName("client.kj")
    public static class173 field454 = new class173(512);

    @ObfuscatedName("client.lt")
    public static int field455 = 0;

    @ObfuscatedName("client.lb")
    public static int field456 = -2;

    @ObfuscatedName("client.lx")
    public static boolean[] field457 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field458 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field459 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static int[] field417 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field462 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field463 = new int[100];

    @ObfuscatedName("client.lg")
    public static int field383 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field337 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lo")
    public static int field466 = 0;

    @ObfuscatedName("client.lu")
    public static int field274 = 0;

    @ObfuscatedName("client.ln")
    public static long[] field468 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field469 = 0;

    @ObfuscatedName("client.lj")
    public static int field470 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field471 = new int[128];

    @ObfuscatedName("client.lq")
    public static int[] field472 = new int[128];

    @ObfuscatedName("client.la")
    public static long field473 = -1L;

    @ObfuscatedName("client.ly")
    public static String field474 = null;

    @ObfuscatedName("client.ld")
    public static String field356 = null;

    @ObfuscatedName("client.mj")
    public static int field476 = -1;

    @ObfuscatedName("client.mp")
    public static int field299 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field478 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field380 = new int[1000];

    @ObfuscatedName("client.mm")
    public static class72[] field420 = new class72[1000];

    @ObfuscatedName("client.mr")
    public static int field481 = 0;

    @ObfuscatedName("client.mw")
    public static int field318 = 0;

    @ObfuscatedName("client.mb")
    public static int field483 = 0;

    @ObfuscatedName("client.mg")
    public static int field259 = 255;

    @ObfuscatedName("client.mo")
    public static int field485 = -1;

    @ObfuscatedName("client.mz")
    public static boolean field486 = false;

    @ObfuscatedName("client.mf")
    public static int field342 = 127;

    @ObfuscatedName("client.mt")
    public static int field488 = 127;

    @ObfuscatedName("client.np")
    public static int field489 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field490 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field491 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field314 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field493 = new int[50];

    @ObfuscatedName("client.nh")
    public static class52[] field464 = new class52[50];

    @ObfuscatedName("client.nu")
    public static boolean field495 = false;

    @ObfuscatedName("client.ni")
    public static boolean[] field496 = new boolean[5];

    @ObfuscatedName("client.nk")
    public static int[] field397 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field498 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field499 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field352 = new int[5];

    @ObfuscatedName("client.ne")
    public static int field501 = 0;

    @ObfuscatedName("client.ns")
    public static int field505 = 0;

    @ObfuscatedName("client.oh")
    public static class16[] field503 = new class16[400];

    @ObfuscatedName("client.ox")
    public static class172 field504 = new class172();

    @ObfuscatedName("client.ov")
    public static int field494 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field465 = new class8[400];

    @ObfuscatedName("client.ol")
    public static class156 field507 = new class156();

    @ObfuscatedName("client.oj")
    public static int field508 = -1;

    @ObfuscatedName("client.on")
    public static int field509 = -1;

    @ObfuscatedName("client.k(I)V")
    public final void method163() {
    }

    public final void init() {
        if (!this.method2591()) {
            return;
        }
        class167[] var1 = class167.method1765();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2787);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2787)) {
                    case 1:
                        field402 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field431 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field500 = var4;
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field32)) {
                            field256 = true;
                        } else {
                            field256 = false;
                        }
                        break;
                    case 5:
                        field255 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field378 = class138.method1868(Integer.parseInt(var4));
                        break;
                    case 7:
                        Statics.field674 = (class139) class99.method458(class139.method1959(), Integer.parseInt(var4));
                        if (Statics.field674 == class139.field2127) {
                            Statics.field154 = class187.field2847;
                        } else {
                            Statics.field154 = class187.field2854;
                        }
                        break;
                    case 8:
                        field497 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field32)) {
                        }
                }
            }
        }
        class79.field1372 = false;
        field257 = false;
        Statics.field2921 = this.getCodeBase().getHost();
        String var5 = Statics.field378.field2116;
        byte var6 = 0;
        try {
            class136.method549("oldschool", var5, var6, 16);
        } catch (Exception var8) {
            class135.method583((String) null, var8);
        }
        Statics.field252 = this;
        this.method2596(765, 503, 49);
    }

    @ObfuscatedName("client.l(S)V")
    public final void method166() {
        Statics.field60 = field255 == 0 ? 43594 : field402 + 40000;
        Statics.field147 = field255 == 0 ? 443 : field402 + 50000;
        Statics.field168 = Statics.field60;
        Statics.field2645 = class152.field2624;
        Statics.field2646 = class152.field2622;
        Statics.field2644 = class152.field2621;
        Statics.field1437 = class152.field2623;
        class124.method897();
        Canvas var1 = Statics.field1523;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1961);
        var1.addFocusListener(class124.field1961);
        class127.method1849(Statics.field1523);
        class132 var2;
        try {
            var2 = new class132();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field1042 = var2;
        if (Statics.field1042 != null) {
            Statics.field1042.method2417(Statics.field1523);
        }
        Statics.field515 = new class121(255, class136.field2083, class136.field2093, 500000);
        Statics.field559 = class9.method146();
        Statics.field987 = this.getToolkit().getSystemClipboard();
        class125.method1402(this, Statics.field551);
        if (field255 != 0) {
            field269 = true;
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method375() {
        field262++;
        this.method170();
        while (true) {
            class176 var1 = class148.field2464;
            class147 var2;
            synchronized (class148.field2464) {
                var2 = (class147) class148.field2461.method3229();
            }
            if (var2 == null) {
                try {
                    if (class160.field2683 == 1) {
                        int var4 = Statics.field2679.method3014();
                        if (var4 > 0 && Statics.field2679.method3100()) {
                            int var5 = var4 - Statics.field2677;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2679.method3013(var5);
                        } else {
                            Statics.field2679.method3050();
                            Statics.field2679.method3017();
                            if (Statics.field558 == null) {
                                class160.field2683 = 0;
                            } else {
                                class160.field2683 = 2;
                            }
                            Statics.field1771 = null;
                            Statics.field2633 = null;
                        }
                    }
                } catch (Exception var392) {
                    var392.printStackTrace();
                    Statics.field2679.method3050();
                    class160.field2683 = 0;
                    Statics.field1771 = null;
                    Statics.field2633 = null;
                    Statics.field558 = null;
                }
                method157();
                class124.method1401();
                class127.method1592();
                if (Statics.field1042 != null) {
                    int var7 = Statics.field1042.method2412();
                    field487 = var7;
                }
                if (field260 == 0) {
                    method18();
                    class131.method1396();
                } else if (field260 == 5) {
                    class28.method436(this);
                    method18();
                    class131.method1396();
                } else if (field260 == 10) {
                    class28.method436(this);
                } else if (field260 == 20) {
                    class28.method436(this);
                    method542();
                } else if (field260 == 25) {
                    method784();
                }
                if (field260 == 30) {
                    if (field270 > 1) {
                        field270--;
                    }
                    if (field405 > 0) {
                        field405--;
                    }
                    if (field305) {
                        field305 = false;
                        method24();
                    } else {
                        if (!field395) {
                            field407[0] = class142.field2228;
                            field320[0] = "";
                            field399[0] = 1006;
                            field396 = 1;
                        }
                        for (int var8 = 0; var8 < 100; var8++) {
                            boolean var9;
                            if (Statics.field1487 == null) {
                                var9 = false;
                            } else {
                                label2805: {
                                    try {
                                        int var10 = Statics.field1487.method2564();
                                        if (var10 == 0) {
                                            var9 = false;
                                            break label2805;
                                        }
                                        if (field298 == -1) {
                                            Statics.field1487.method2565(field296.field1856, 0, 1);
                                            field296.field1854 = 0;
                                            field298 = field296.method2359();
                                            field427 = class165.field2775[field298];
                                            var10--;
                                        }
                                        if (field427 == -1) {
                                            if (var10 <= 0) {
                                                var9 = false;
                                                break label2805;
                                            }
                                            Statics.field1487.method2565(field296.field1856, 0, 1);
                                            field427 = field296.field1856[0] & 0xFF;
                                            var10--;
                                        }
                                        if (field427 == -2) {
                                            if (var10 <= 1) {
                                                var9 = false;
                                                break label2805;
                                            }
                                            Statics.field1487.method2565(field296.field1856, 0, 2);
                                            field296.field1854 = 0;
                                            field427 = field296.method2111();
                                            var10 -= 2;
                                        }
                                        if (var10 < field427) {
                                            var9 = false;
                                            break label2805;
                                        }
                                        field296.field1854 = 0;
                                        Statics.field1487.method2565(field296.field1856, 0, field427);
                                        field442 = 0;
                                        field304 = field303;
                                        field303 = field302;
                                        field302 = field298;
                                        if (field298 == 178) {
                                            while (field296.field1854 < field427) {
                                                int var11 = field296.method2109();
                                                boolean var12 = (var11 & 0x1) == 1;
                                                String var13 = field296.method2126();
                                                String var14 = field296.method2126();
                                                field296.method2126();
                                                for (int var15 = 0; var15 < field494; var15++) {
                                                    class8 var16 = field465[var15];
                                                    if (var12) {
                                                        if (var14.equals(var16.field132)) {
                                                            var16.field132 = var13;
                                                            var16.field131 = var14;
                                                            var13 = null;
                                                            break;
                                                        }
                                                    } else if (var13.equals(var16.field132)) {
                                                        var16.field132 = var13;
                                                        var16.field131 = var14;
                                                        var13 = null;
                                                        break;
                                                    }
                                                }
                                                if (var13 != null && field494 < 400) {
                                                    class8 var17 = new class8();
                                                    field465[field494] = var17;
                                                    var17.field132 = var13;
                                                    var17.field131 = var14;
                                                    field494++;
                                                }
                                            }
                                            field278 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 173) {
                                            field495 = true;
                                            Statics.field185 = field296.method2109();
                                            Statics.field201 = field296.method2109();
                                            Statics.field204 = field296.method2111();
                                            Statics.field967 = field296.method2109();
                                            Statics.field1990 = field296.method2109();
                                            if (Statics.field1990 >= 100) {
                                                Statics.field155 = Statics.field185 * 128 + 64;
                                                Statics.field1663 = Statics.field201 * 128 + 64;
                                                Statics.field561 = method120(Statics.field155, Statics.field1663, Statics.field72) - Statics.field204;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 214) {
                                            field495 = false;
                                            for (int var18 = 0; var18 < 5; var18++) {
                                                field496[var18] = false;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 156) {
                                            int var19 = field296.method2114();
                                            int var20 = field296.method2111();
                                            int var21 = field296.method2094();
                                            class151 var22 = class151.method2354(var19);
                                            var22.field2547 = (var20 << 16) + var21;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 231) {
                                            method2();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 40) {
                                            int var23 = field427 + field296.field1854;
                                            int var24 = field296.method2111();
                                            int var25 = field296.method2111();
                                            if (field251 != var24) {
                                                field251 = var24;
                                                Statics.method752(field251);
                                                class32.method99(field251);
                                                for (int var26 = 0; var26 < 100; var26++) {
                                                    field457[var26] = true;
                                                }
                                            }
                                            while (var25-- > 0) {
                                                int var27 = field296.method2114();
                                                int var28 = field296.method2111();
                                                int var29 = field296.method2109();
                                                class4 var30 = (class4) field414.method3171((long) var27);
                                                if (var30 != null && var30.field62 != var28) {
                                                    method1591(var30, true);
                                                    var30 = null;
                                                }
                                                if (var30 == null) {
                                                    class4 var31 = new class4();
                                                    var31.field62 = var28;
                                                    var31.field61 = var29;
                                                    field414.method3172(var31, (long) var27);
                                                    Statics.method752(var28);
                                                    class32.method99(var28);
                                                    class151 var32 = class151.method2354(var27);
                                                    if (var32 != null) {
                                                        method2685(var32);
                                                    }
                                                    if (field391 != null) {
                                                        method2685(field391);
                                                        field391 = null;
                                                    }
                                                    method478();
                                                    if (field251 != -1) {
                                                        int var33 = field251;
                                                        if (class151.method2456(var33)) {
                                                            method1327(Statics.field2616[var33], 1);
                                                        }
                                                    }
                                                    var30 = var31;
                                                }
                                                var30.field71 = true;
                                            }
                                            for (class4 var35 = (class4) field414.method3170(); var35 != null; var35 = (class4) field414.method3174()) {
                                                if (var35.field71) {
                                                    var35.field71 = false;
                                                } else {
                                                    method1591(var35, true);
                                                }
                                            }
                                            field454 = new class173(512);
                                            while (field296.field1854 < var23) {
                                                int var36 = field296.method2114();
                                                int var37 = field296.method2111();
                                                int var38 = field296.method2111();
                                                int var39 = field296.method2114();
                                                for (int var40 = var37; var40 <= var38; var40++) {
                                                    long var41 = ((long) var36 << 32) + (long) var40;
                                                    field454.method3172(new class178(var39), var41);
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 9) {
                                            int var43 = field296.method2114();
                                            class4 var44 = (class4) field414.method3171((long) var43);
                                            if (var44 != null) {
                                                method1591(var44, true);
                                            }
                                            if (field391 != null) {
                                                method2685(field391);
                                                field391 = null;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 97) {
                                            field446 = field437;
                                            if (field427 == 0) {
                                                field474 = null;
                                                field356 = null;
                                                Statics.field189 = 0;
                                                Statics.field177 = null;
                                                field298 = -1;
                                                var9 = true;
                                                break label2805;
                                            }
                                            field356 = field296.method2126();
                                            long var45 = field296.method2115();
                                            long var47 = var45;
                                            String var49;
                                            if (var45 <= 0L || var45 >= 6582952005840035281L) {
                                                var49 = null;
                                            } else if (var45 % 37L == 0L) {
                                                var49 = null;
                                            } else {
                                                int var50 = 0;
                                                for (long var51 = var45; var51 != 0L; var51 /= 37L) {
                                                    var50++;
                                                }
                                                StringBuilder var53 = new StringBuilder(var50);
                                                while (var47 != 0L) {
                                                    long var54 = var47;
                                                    var47 /= 37L;
                                                    var53.append(class195.field2915[(int) (var54 - var47 * 37L)]);
                                                }
                                                var49 = var53.reverse().toString();
                                            }
                                            field474 = var49;
                                            Statics.field111 = field296.method2110();
                                            int var56 = field296.method2109();
                                            if (var56 == 255) {
                                                field298 = -1;
                                                var9 = true;
                                                break label2805;
                                            }
                                            Statics.field189 = var56;
                                            class21[] var57 = new class21[100];
                                            for (int var58 = 0; var58 < Statics.field189; var58++) {
                                                var57[var58] = new class21();
                                                var57[var58].field557 = field296.method2126();
                                                var57[var58].field553 = class197.method2459(var57[var58].field557, Statics.field154);
                                                var57[var58].field554 = field296.method2111();
                                                var57[var58].field555 = field296.method2110();
                                                field296.method2126();
                                                if (var57[var58].field557.equals(Statics.field1561.field37)) {
                                                    Statics.field46 = var57[var58].field555;
                                                }
                                            }
                                            boolean var59 = false;
                                            int var60 = Statics.field189;
                                            while (var60 > 0) {
                                                boolean var61 = true;
                                                var60--;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    if (var57[var62].field553.compareTo(var57[var62 + 1].field553) > 0) {
                                                        class21 var63 = var57[var62];
                                                        var57[var62] = var57[var62 + 1];
                                                        var57[var62 + 1] = var63;
                                                        var61 = false;
                                                    }
                                                }
                                                if (var61) {
                                                    break;
                                                }
                                            }
                                            Statics.field177 = var57;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 132) {
                                            Statics.field968 = class117.method15(field296.method2109());
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 239) {
                                            Statics.field2095 = field296.method2157();
                                            Statics.field2493 = field296.method2135();
                                            while (field296.field1854 < field427) {
                                                field298 = field296.method2109();
                                                method1594();
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 25) {
                                            int var64 = field296.method2140();
                                            int var65 = field296.method2150();
                                            class151 var66 = class151.method2354(var65);
                                            if (var66 != null && var66.field2499 == 0) {
                                                if (var64 > var66.field2519 - var66.field2513) {
                                                    var64 = var66.field2519 - var66.field2513;
                                                }
                                                if (var64 < 0) {
                                                    var64 = 0;
                                                }
                                                if (var66.field2517 != var64) {
                                                    var66.field2517 = var64;
                                                    method2685(var66);
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 51) {
                                            int var67 = field296.method2150();
                                            Statics.field8 = Statics.field708.method2461(var67);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 105) {
                                            field481 = field296.method2109();
                                            if (field481 == 255) {
                                                field481 = 0;
                                            }
                                            field318 = field296.method2109();
                                            if (field318 == 255) {
                                                field318 = 0;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 115) {
                                            int var68 = field296.method2143();
                                            int var69 = field296.method2114();
                                            class151 var70 = class151.method2354(var69);
                                            if (var70.field2539 != var68 || var68 == -1) {
                                                var70.field2539 = var68;
                                                var70.field2554 = 0;
                                                var70.field2610 = 0;
                                                method2685(var70);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 80) {
                                            field270 = field296.method2094() * 30;
                                            field447 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 109) {
                                            method158();
                                            int var71 = field296.method2135();
                                            int var72 = field296.method2157();
                                            int var73 = field296.method2150();
                                            field393[var72] = var73;
                                            field370[var72] = var71;
                                            field392[var72] = 1;
                                            for (int var74 = 0; var74 < 98; var74++) {
                                                if (var73 >= class140.field2135[var74]) {
                                                    field392[var72] = var74 + 2;
                                                }
                                            }
                                            field445[++field309 - 1 & 0x1F] = var72;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 3) {
                                            int var75 = field296.method2109();
                                            int var76 = field296.method2109();
                                            int var77 = field296.method2109();
                                            int var78 = field296.method2109();
                                            field496[var75] = true;
                                            field397[var75] = var76;
                                            field498[var75] = var77;
                                            field499[var75] = var78;
                                            field352[var75] = 0;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 39) {
                                            while (field296.field1854 < field427) {
                                                boolean var79 = field296.method2109() == 1;
                                                String var80 = field296.method2126();
                                                String var81 = field296.method2126();
                                                int var82 = field296.method2111();
                                                int var83 = field296.method2109();
                                                int var84 = field296.method2109();
                                                boolean var85 = (var84 & 0x2) != 0;
                                                boolean var86 = (var84 & 0x1) != 0;
                                                if (var82 > 0) {
                                                    field296.method2126();
                                                    field296.method2109();
                                                    field296.method2114();
                                                }
                                                field296.method2126();
                                                for (int var87 = 0; var87 < field501; var87++) {
                                                    class16 var88 = field503[var87];
                                                    if (var79) {
                                                        if (var81.equals(var88.field223)) {
                                                            var88.field223 = var80;
                                                            var88.field231 = var81;
                                                            var80 = null;
                                                            break;
                                                        }
                                                    } else if (var80.equals(var88.field223)) {
                                                        if (var88.field234 != var82) {
                                                            boolean var89 = true;
                                                            for (class34 var90 = (class34) field504.method3161(); var90 != null; var90 = (class34) field504.method3169()) {
                                                                if (var90.field774.equals(var80)) {
                                                                    if (var82 != 0 && var90.field783 == 0) {
                                                                        var90.method3266();
                                                                        var89 = false;
                                                                    } else if (var82 == 0 && var90.field783 != 0) {
                                                                        var90.method3266();
                                                                        var89 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var89) {
                                                                field504.method3160(new class34(var80, var82));
                                                            }
                                                            var88.field234 = var82;
                                                        }
                                                        var88.field231 = var81;
                                                        var88.field225 = var83;
                                                        var88.field226 = var85;
                                                        var88.field227 = var86;
                                                        var80 = null;
                                                        break;
                                                    }
                                                }
                                                if (var80 != null && field501 < 400) {
                                                    class16 var91 = new class16();
                                                    field503[field501] = var91;
                                                    var91.field223 = var80;
                                                    var91.field231 = var81;
                                                    var91.field234 = var82;
                                                    var91.field225 = var83;
                                                    var91.field226 = var85;
                                                    var91.field227 = var86;
                                                    field501++;
                                                }
                                            }
                                            field505 = 2;
                                            field278 = field437;
                                            boolean var92 = false;
                                            int var93 = field501;
                                            while (var93 > 0) {
                                                boolean var94 = true;
                                                var93--;
                                                for (int var95 = 0; var95 < var93; var95++) {
                                                    boolean var96 = false;
                                                    class16 var97 = field503[var95];
                                                    class16 var98 = field503[var95 + 1];
                                                    if (field402 != var97.field234 && field402 == var98.field234) {
                                                        var96 = true;
                                                    }
                                                    if (!var96 && var97.field234 == 0 && var98.field234 != 0) {
                                                        var96 = true;
                                                    }
                                                    if (!var96 && !var97.field226 && var98.field226) {
                                                        var96 = true;
                                                    }
                                                    if (!var96 && !var97.field227 && var98.field227) {
                                                        var96 = true;
                                                    }
                                                    if (var96) {
                                                        class16 var99 = field503[var95];
                                                        field503[var95] = field503[var95 + 1];
                                                        field503[var95 + 1] = var99;
                                                        var94 = false;
                                                    }
                                                }
                                                if (var94) {
                                                    break;
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 112) {
                                            int var100 = field296.method2141();
                                            int var101 = field296.method2150();
                                            class153.field2629[var100] = var101;
                                            if (class153.field2628[var100] != var101) {
                                                class153.field2628[var100] = var101;
                                                method777(var100);
                                            }
                                            field438[++field439 - 1 & 0x1F] = var100;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 72) {
                                            int var102 = field296.method2111();
                                            int var103 = field296.method2109();
                                            int var104 = field296.method2111();
                                            if (field342 != 0 && var103 != 0 && field489 < 50) {
                                                field490[field489] = var102;
                                                field491[field489] = var103;
                                                field314[field489] = var104;
                                                field464[field489] = null;
                                                field493[field489] = 0;
                                                field489++;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 45) {
                                            int var108 = field296.method2094();
                                            byte var109 = field296.method2110();
                                            class153.field2629[var108] = var109;
                                            if (class153.field2628[var108] != var109) {
                                                class153.field2628[var108] = var109;
                                                method777(var108);
                                            }
                                            field438[++field439 - 1 & 0x1F] = var108;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 11) {
                                            String var110 = field296.method2126();
                                            int var111 = field296.method2111();
                                            byte var112 = field296.method2110();
                                            boolean var113 = false;
                                            if (var112 == -128) {
                                                var113 = true;
                                            }
                                            if (var113) {
                                                if (Statics.field189 == 0) {
                                                    field298 = -1;
                                                    var9 = true;
                                                    break label2805;
                                                }
                                                boolean var114 = false;
                                                int var115;
                                                for (var115 = 0; var115 < Statics.field189 && (!Statics.field177[var115].field557.equals(var110) || Statics.field177[var115].field554 != var111); var115++) {
                                                }
                                                if (var115 < Statics.field189) {
                                                    while (var115 < Statics.field189 - 1) {
                                                        Statics.field177[var115] = Statics.field177[var115 + 1];
                                                        var115++;
                                                    }
                                                    Statics.field189--;
                                                    Statics.field177[Statics.field189] = null;
                                                }
                                            } else {
                                                field296.method2126();
                                                class21 var116 = new class21();
                                                var116.field557 = var110;
                                                var116.field553 = class197.method2459(var116.field557, Statics.field154);
                                                var116.field554 = var111;
                                                var116.field555 = var112;
                                                int var117;
                                                for (var117 = Statics.field189 - 1; var117 >= 0; var117--) {
                                                    int var118 = Statics.field177[var117].field553.compareTo(var116.field557);
                                                    if (var118 == 0) {
                                                        Statics.field177[var117].field554 = var111;
                                                        Statics.field177[var117].field555 = var112;
                                                        if (var110.equals(Statics.field1561.field37)) {
                                                            Statics.field46 = var112;
                                                        }
                                                        field446 = field437;
                                                        field298 = -1;
                                                        var9 = true;
                                                        break label2805;
                                                    }
                                                    if (var118 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field189 >= Statics.field177.length) {
                                                    field298 = -1;
                                                    var9 = true;
                                                    break label2805;
                                                }
                                                for (int var119 = Statics.field189 - 1; var119 > var117; var119--) {
                                                    Statics.field177[var119 + 1] = Statics.field177[var119];
                                                }
                                                if (Statics.field189 == 0) {
                                                    Statics.field177 = new class21[100];
                                                }
                                                Statics.field177[var117 + 1] = var116;
                                                Statics.field189++;
                                                if (var110.equals(Statics.field1561.field37)) {
                                                    Statics.field46 = var112;
                                                }
                                            }
                                            field446 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 207) {
                                            int var120 = field296.method2135();
                                            int var121 = field296.method2157();
                                            int var122 = field296.method2135();
                                            Statics.field72 = var121 >> 1;
                                            Statics.field1561.method566(var120, var122, (var121 & 0x1) == 1);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 96) {
                                            String var123 = field296.method2126();
                                            Object[] var124 = new Object[var123.length() + 1];
                                            for (int var125 = var123.length() - 1; var125 >= 0; var125--) {
                                                if (var123.charAt(var125) == 's') {
                                                    var124[var125 + 1] = field296.method2126();
                                                } else {
                                                    var124[var125 + 1] = Integer.valueOf(field296.method2114());
                                                }
                                            }
                                            var124[0] = Integer.valueOf(field296.method2114());
                                            class1 var126 = new class1();
                                            var126.field1 = var124;
                                            class32.method585(var126);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 71) {
                                            int var127 = field296.method2122();
                                            boolean var128 = field296.method2109() == 1;
                                            String var129 = "";
                                            boolean var130 = false;
                                            if (var128) {
                                                var129 = field296.method2126();
                                                if (method2883(var129)) {
                                                    var130 = true;
                                                }
                                            }
                                            String var131 = field296.method2126();
                                            if (!var130) {
                                                class10.method2659(var127, var129, var131);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 150) {
                                            int var132 = field296.method2149();
                                            int var133 = field296.method2151();
                                            int var134 = field296.method2094();
                                            if (var134 == 65535) {
                                                var134 = -1;
                                            }
                                            int var135 = field296.method2140();
                                            if (var135 == 65535) {
                                                var135 = -1;
                                            }
                                            for (int var136 = var134; var136 <= var135; var136++) {
                                                long var137 = ((long) var132 << 32) + (long) var136;
                                                class183 var139 = field454.method3171(var137);
                                                if (var139 != null) {
                                                    var139.method3268();
                                                }
                                                field454.method3172(new class178(var133), var137);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 83) {
                                            String var140 = field296.method2126();
                                            long var141 = field296.method2115();
                                            long var143 = (long) field296.method2111();
                                            long var145 = (long) field296.method2113();
                                            int var147 = field296.method2109();
                                            long var148 = (var143 << 32) + var145;
                                            boolean var150 = false;
                                            for (int var151 = 0; var151 < 100; var151++) {
                                                if (field468[var151] == var148) {
                                                    var150 = true;
                                                    break;
                                                }
                                            }
                                            if (var147 <= 1 && method2883(var140)) {
                                                var150 = true;
                                            }
                                            if (!var150 && field371 == 0) {
                                                field468[field469] = var148;
                                                field469 = (field469 + 1) % 100;
                                                String var152 = class189.method3302(class196.method689(class188.method2675(field296)));
                                                if (var147 == 2 || var147 == 3) {
                                                    class10.method662(9, class2.method2678(1) + var140, var152, class195.method837(var141));
                                                } else if (var147 == 1) {
                                                    class10.method662(9, class2.method2678(0) + var140, var152, class195.method837(var141));
                                                } else {
                                                    class10.method662(9, var140, var152, class195.method837(var141));
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 247) {
                                            method158();
                                            field404 = field296.method2109();
                                            field447 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 101) {
                                            int var153 = field296.method2111();
                                            field251 = var153;
                                            Statics.method752(var153);
                                            class32.method99(field251);
                                            for (int var154 = 0; var154 < 100; var154++) {
                                                field457[var154] = true;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 4) {
                                            int var155 = field296.method2109();
                                            int var156 = field296.method2151();
                                            int var157 = field296.method2111();
                                            class4 var158 = (class4) field414.method3171((long) var156);
                                            if (var158 != null) {
                                                method1591(var158, var158.field62 != var157);
                                            }
                                            class4 var159 = new class4();
                                            var159.field62 = var157;
                                            var159.field61 = var155;
                                            field414.method3172(var159, (long) var156);
                                            Statics.method752(var157);
                                            class32.method99(var157);
                                            class151 var160 = class151.method2354(var156);
                                            if (var160 != null) {
                                                method2685(var160);
                                            }
                                            if (field391 != null) {
                                                method2685(field391);
                                                field391 = null;
                                            }
                                            method478();
                                            if (field251 != -1) {
                                                int var161 = field251;
                                                if (class151.method2456(var161)) {
                                                    method1327(Statics.field2616[var161], 1);
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 64) {
                                            field495 = true;
                                            Statics.field1235 = field296.method2109();
                                            Statics.field1873 = field296.method2109();
                                            Statics.field58 = field296.method2111();
                                            Statics.field232 = field296.method2109();
                                            Statics.field1939 = field296.method2109();
                                            if (Statics.field1939 >= 100) {
                                                int var162 = Statics.field1235 * 128 + 64;
                                                int var163 = Statics.field1873 * 128 + 64;
                                                int var164 = method120(var162, var163, Statics.field72) - Statics.field58;
                                                int var165 = var162 - Statics.field155;
                                                int var166 = var164 - Statics.field561;
                                                int var167 = var163 - Statics.field1663;
                                                int var168 = (int) Math.sqrt((double) (var165 * var165 + var167 * var167));
                                                Statics.field1488 = (int) (Math.atan2((double) var166, (double) var168) * 325.949D) & 0x7FF;
                                                Statics.field1339 = (int) (Math.atan2((double) var165, (double) var167) * -325.949D) & 0x7FF;
                                                if (Statics.field1488 < 128) {
                                                    Statics.field1488 = 128;
                                                }
                                                if (Statics.field1488 > 383) {
                                                    Statics.field1488 = 383;
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 230) {
                                            if (field251 != -1) {
                                                int var169 = field251;
                                                if (class151.method2456(var169)) {
                                                    method1327(Statics.field2616[var169], 0);
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 85) {
                                            method885(true);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 22) {
                                            int var170 = field296.method2094();
                                            if (var170 == 65535) {
                                                var170 = -1;
                                            }
                                            if (var170 == -1 && !field486) {
                                                Statics.field2679.method3050();
                                                class160.field2683 = 1;
                                                Statics.field558 = null;
                                            } else if (var170 != -1 && field485 != var170 && field259 != 0 && !field486) {
                                                class160.method694(2, Statics.field158, var170, 0, field259, false);
                                            }
                                            field485 = var170;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 192) {
                                            int var171 = field296.method2290();
                                            int var172 = field296.method2094();
                                            if (var172 == 65535) {
                                                var172 = -1;
                                            }
                                            if (field259 != 0 && var172 != -1) {
                                                class160.method456(Statics.field1894, var172, 0, field259, false);
                                                field486 = true;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 200) {
                                            field483 = field296.method2109();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 104) {
                                            int var173 = field296.method2150();
                                            int var174 = field296.method2141();
                                            class151 var175 = class151.method2354(var173);
                                            if (var175.field2575 != 1 || var175.field2536 != var174) {
                                                var175.field2575 = 1;
                                                var175.field2536 = var174;
                                                method2685(var175);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 94) {
                                            int var176 = field296.method2111();
                                            int var177 = field296.method2141();
                                            int var178 = field296.method2114();
                                            int var179 = field296.method2141();
                                            class151 var180 = class151.method2354(var178);
                                            if (var180.field2551 != var179 || var180.field2611 != var177 || var180.field2520 != var176) {
                                                var180.field2551 = var179;
                                                var180.field2611 = var177;
                                                var180.field2520 = var176;
                                                method2685(var180);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 157) {
                                            int var181 = field296.method2111();
                                            class14 var182 = (class14) class14.field200.method3171((long) var181);
                                            if (var182 != null) {
                                                var182.method3268();
                                            }
                                            field477[++field267 - 1 & 0x1F] = var181 & 0x7FFF;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 148) {
                                            Statics.field2095 = field296.method2135();
                                            Statics.field2493 = field296.method2157();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 62) {
                                            Statics.field2493 = field296.method2109();
                                            Statics.field2095 = field296.method2135();
                                            for (int var183 = Statics.field2095; var183 < Statics.field2095 + 8; var183++) {
                                                for (int var184 = Statics.field2493; var184 < Statics.field2493 + 8; var184++) {
                                                    if (field387[Statics.field72][var183][var184] != null) {
                                                        field387[Statics.field72][var183][var184] = null;
                                                        method2799(var183, var184);
                                                    }
                                                }
                                            }
                                            for (class15 var185 = (class15) field385.method3234(); var185 != null; var185 = (class15) field385.method3209()) {
                                                if (var185.field210 >= Statics.field2095 && var185.field210 < Statics.field2095 + 8 && var185.field211 >= Statics.field2493 && var185.field211 < Statics.field2493 + 8 && Statics.field72 == var185.field215) {
                                                    var185.field212 = 0;
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 6) {
                                            int var186 = field296.method2114();
                                            boolean var187 = field296.method2133() == 1;
                                            class151 var188 = class151.method2354(var186);
                                            if (var188.field2515 != var187) {
                                                var188.field2515 = var187;
                                                method2685(var188);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 69) {
                                            int var189 = field296.method2150();
                                            int var190 = field296.method2112();
                                            int var191 = field296.method2144();
                                            class151 var192 = class151.method2354(var189);
                                            int var193 = var192.field2597 + var191;
                                            int var194 = var192.field2509 + var190;
                                            if (var192.field2562 != var193 || var192.field2545 != var194) {
                                                var192.field2562 = var193;
                                                var192.field2545 = var194;
                                                method2685(var192);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 177) {
                                            class22 var195 = new class22();
                                            var195.field568 = field296.method2126();
                                            var195.field570 = field296.method2111();
                                            int var196 = field296.method2114();
                                            var195.field563 = var196;
                                            method547(45);
                                            Statics.field1487.method2562();
                                            Statics.field1487 = null;
                                            class28.method2672(var195);
                                            field298 = -1;
                                            var9 = false;
                                            break label2805;
                                        }
                                        if (field298 == 87) {
                                            class186.method512(field296, field427);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 176) {
                                            int var197 = field296.method2114();
                                            int var198 = field296.method2111();
                                            if (var197 < -70000) {
                                                var198 += 32768;
                                            }
                                            class151 var199;
                                            if (var197 >= 0) {
                                                var199 = class151.method2354(var197);
                                            } else {
                                                var199 = null;
                                            }
                                            if (var199 != null) {
                                                for (int var200 = 0; var200 < var199.field2497.length; var200++) {
                                                    var199.field2497[var200] = 0;
                                                    var199.field2606[var200] = 0;
                                                }
                                            }
                                            class14.method883(var198);
                                            int var201 = field296.method2111();
                                            for (int var202 = 0; var202 < var201; var202++) {
                                                int var203 = field296.method2111();
                                                int var204 = field296.method2157();
                                                if (var204 == 255) {
                                                    var204 = field296.method2151();
                                                }
                                                if (var199 != null && var202 < var199.field2497.length) {
                                                    var199.field2497[var202] = var203;
                                                    var199.field2606[var202] = var204;
                                                }
                                                class14.method2801(var198, var202, var203 - 1, var204);
                                            }
                                            if (var199 != null) {
                                                method2685(var199);
                                            }
                                            method158();
                                            field477[++field267 - 1 & 0x1F] = var198 & 0x7FFF;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 98) {
                                            field317 = field296.method2109();
                                            if (field317 == 1) {
                                                field272 = field296.method2111();
                                            }
                                            if (field317 >= 2 && field317 <= 6) {
                                                if (field317 == 2) {
                                                    field277 = 64;
                                                    field263 = 64;
                                                }
                                                if (field317 == 3) {
                                                    field277 = 0;
                                                    field263 = 64;
                                                }
                                                if (field317 == 4) {
                                                    field277 = 128;
                                                    field263 = 64;
                                                }
                                                if (field317 == 5) {
                                                    field277 = 64;
                                                    field263 = 0;
                                                }
                                                if (field317 == 6) {
                                                    field277 = 64;
                                                    field263 = 128;
                                                }
                                                field317 = 2;
                                                field506 = field296.method2111();
                                                field275 = field296.method2111();
                                                field280 = field296.method2109();
                                            }
                                            if (field317 == 10) {
                                                field273 = field296.method2111();
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 70 || field298 == 15 || field298 == 196 || field298 == 165 || field298 == 52 || field298 == 12 || field298 == 191 || field298 == 213 || field298 == 199 || field298 == 143) {
                                            method1594();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 114) {
                                            field505 = 1;
                                            field278 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 204) {
                                            int var205 = field296.method2114();
                                            class151 var206 = class151.method2354(var205);
                                            var206.field2575 = 3;
                                            var206.field2536 = Statics.field1561.field38.method2924();
                                            method2685(var206);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 162) {
                                            String var207 = field296.method2126();
                                            String var208 = class189.method3302(class196.method689(class188.method2675(field296)));
                                            class10.method2659(6, var207, var208);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 220) {
                                            int var209 = field296.method2140();
                                            int var210 = field296.method2114();
                                            int var211 = var209 >> 10 & 0x1F;
                                            int var212 = var209 >> 5 & 0x1F;
                                            int var213 = var209 & 0x1F;
                                            int var214 = (var213 << 3) + (var211 << 19) + (var212 << 11);
                                            class151 var215 = class151.method2354(var210);
                                            if (var215.field2604 != var214) {
                                                var215.field2604 = var214;
                                                method2685(var215);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 255) {
                                            method117();
                                            field298 = -1;
                                            var9 = false;
                                            break label2805;
                                        }
                                        if (field298 == 218) {
                                            field296.field1854 += 28;
                                            if (field296.method2123()) {
                                                class110 var216 = field296;
                                                int var217 = field296.field1854 - 28;
                                                if (class136.field2091 != null) {
                                                    try {
                                                        class136.field2091.method3422(0L);
                                                        class136.field2091.method3409(var216.field1856, var217, 24);
                                                    } catch (Exception var387) {
                                                    }
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 179) {
                                            String var219 = field296.method2126();
                                            long var220 = (long) field296.method2111();
                                            long var222 = (long) field296.method2113();
                                            int var224 = field296.method2109();
                                            long var225 = (var220 << 32) + var222;
                                            boolean var227 = false;
                                            for (int var228 = 0; var228 < 100; var228++) {
                                                if (field468[var228] == var225) {
                                                    var227 = true;
                                                    break;
                                                }
                                            }
                                            if (method2883(var219)) {
                                                var227 = true;
                                            }
                                            if (!var227 && field371 == 0) {
                                                field468[field469] = var225;
                                                field469 = (field469 + 1) % 100;
                                                String var229 = class189.method3302(class196.method689(class188.method2675(field296)));
                                                if (var224 == 2 || var224 == 3) {
                                                    class10.method2659(7, class2.method2678(1) + var219, var229);
                                                } else if (var224 == 1) {
                                                    class10.method2659(7, class2.method2678(0) + var219, var229);
                                                } else {
                                                    class10.method2659(3, var219, var229);
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 227) {
                                            int var230 = field296.method2114();
                                            int var231 = field296.method2151();
                                            int var232 = field296.method2094();
                                            if (var232 == 65535) {
                                                var232 = -1;
                                            }
                                            class151 var233 = class151.method2354(var231);
                                            if (var233.field2502) {
                                                var233.field2607 = var232;
                                                var233.field2530 = var230;
                                                class45 var235 = class45.method148(var232);
                                                var233.field2551 = var235.field1007;
                                                var233.field2611 = var235.field1008;
                                                var233.field2608 = var235.field1021;
                                                var233.field2541 = var235.field1010;
                                                var233.field2614 = var235.field1011;
                                                var233.field2520 = var235.field1006;
                                                if (var233.field2512 > 0) {
                                                    var233.field2520 = var233.field2520 * 32 / var233.field2512;
                                                }
                                                method2685(var233);
                                            } else {
                                                if (var232 == -1) {
                                                    var233.field2575 = 0;
                                                    field298 = -1;
                                                    var9 = true;
                                                    break label2805;
                                                }
                                                class45 var234 = class45.method148(var232);
                                                var233.field2575 = 4;
                                                var233.field2536 = var232;
                                                var233.field2551 = var234.field1007;
                                                var233.field2611 = var234.field1008;
                                                var233.field2520 = var234.field1006 * 100 / var230;
                                                method2685(var233);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 144) {
                                            int var236 = field296.method2149();
                                            class151 var237 = class151.method2354(var236);
                                            for (int var238 = 0; var238 < var237.field2497.length; var238++) {
                                                var237.field2497[var238] = -1;
                                                var237.field2497[var238] = 0;
                                            }
                                            method2685(var237);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 127) {
                                            method138();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 172) {
                                            method158();
                                            field419 = field296.method2112();
                                            field447 = field437;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 124) {
                                            for (int var239 = 0; var239 < class153.field2628.length; var239++) {
                                                if (class153.field2629[var239] != class153.field2628[var239]) {
                                                    class153.field2628[var239] = class153.field2629[var239];
                                                    method777(var239);
                                                    field438[++field439 - 1 & 0x1F] = var239;
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 113) {
                                            method885(false);
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 79) {
                                            int var240 = field296.method2133();
                                            String var241 = field296.method2126();
                                            int var242 = field296.method2135();
                                            if (var240 >= 1 && var240 <= 8) {
                                                if (var241.equalsIgnoreCase("null")) {
                                                    var241 = null;
                                                }
                                                field281[var240 - 1] = var241;
                                                field384[var240 - 1] = var242 == 0;
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 131) {
                                            int var243 = field296.method2150();
                                            int var244 = field296.method2094();
                                            class151 var245 = class151.method2354(var243);
                                            if (var245.field2575 != 2 || var245.field2536 != var244) {
                                                var245.field2575 = 2;
                                                var245.field2536 = var244;
                                                method2685(var245);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 8) {
                                            int var246 = field296.method2114();
                                            int var247 = field296.method2111();
                                            if (var246 < -70000) {
                                                var247 += 32768;
                                            }
                                            class151 var248;
                                            if (var246 >= 0) {
                                                var248 = class151.method2354(var246);
                                            } else {
                                                var248 = null;
                                            }
                                            while (field296.field1854 < field427) {
                                                int var249 = field296.method2122();
                                                int var250 = field296.method2111();
                                                int var251 = 0;
                                                if (var250 != 0) {
                                                    var251 = field296.method2109();
                                                    if (var251 == 255) {
                                                        var251 = field296.method2114();
                                                    }
                                                }
                                                if (var248 != null && var249 >= 0 && var249 < var248.field2497.length) {
                                                    var248.field2497[var249] = var250;
                                                    var248.field2606[var249] = var251;
                                                }
                                                class14.method2801(var247, var249, var250 - 1, var251);
                                            }
                                            if (var248 != null) {
                                                method2685(var248);
                                            }
                                            method158();
                                            field477[++field267 - 1 & 0x1F] = var247 & 0x7FFF;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 243) {
                                            for (int var252 = 0; var252 < field372.length; var252++) {
                                                if (field372[var252] != null) {
                                                    field372[var252].field742 = -1;
                                                }
                                            }
                                            for (int var253 = 0; var253 < field291.length; var253++) {
                                                if (field291[var253] != null) {
                                                    field291[var253].field742 = -1;
                                                }
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 10) {
                                            for (int var254 = 0; var254 < Statics.field1053; var254++) {
                                                class46 var255 = class46.method118(var254);
                                                if (var255 != null) {
                                                    class153.field2629[var254] = 0;
                                                    class153.field2628[var254] = 0;
                                                }
                                            }
                                            method158();
                                            field439 += 32;
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 195) {
                                            int var256 = field296.method2149();
                                            String var257 = field296.method2126();
                                            class151 var258 = class151.method2354(var256);
                                            if (!var257.equals(var258.field2550)) {
                                                var258.field2550 = var257;
                                                method2685(var258);
                                            }
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        if (field298 == 93) {
                                            field466 = field296.method2109();
                                            field274 = field296.method2109();
                                            field298 = -1;
                                            var9 = true;
                                            break label2805;
                                        }
                                        class135.method583("" + field298 + class2.field22 + field303 + class2.field22 + field304 + class2.field22 + field427, (Throwable) null);
                                        method117();
                                    } catch (IOException var390) {
                                        method24();
                                    } catch (Exception var391) {
                                        String var261 = "" + field298 + class2.field22 + field303 + class2.field22 + field304 + class2.field22 + field427 + class2.field22 + (Statics.field966 + Statics.field1561.field766[0]) + class2.field22 + (Statics.field1047 + Statics.field1561.field712[0]) + class2.field22;
                                        for (int var262 = 0; var262 < field427 && var262 < 50; var262++) {
                                            var261 = var261 + field296.field1856[var262] + class2.field22;
                                        }
                                        class135.method583(var261, var391);
                                        method117();
                                    }
                                    var9 = true;
                                }
                            }
                            if (!var9) {
                                break;
                            }
                        }
                        if (field260 == 30) {
                            class186.method2560(field294, 88);
                            Object var263 = Statics.field264.field184;
                            synchronized (Statics.field264.field184) {
                                if (!field311) {
                                    Statics.field264.field174 = 0;
                                } else if (class127.field2011 != 0 || Statics.field264.field174 >= 40) {
                                    field294.method2331(63);
                                    field294.method2278(0);
                                    int var264 = field294.field1854;
                                    int var265 = 0;
                                    for (int var266 = 0; var266 < Statics.field264.field174 && field294.field1854 - var264 < 240; var266++) {
                                        var265++;
                                        int var267 = Statics.field264.field172[var266];
                                        if (var267 < 0) {
                                            var267 = 0;
                                        } else if (var267 > 502) {
                                            var267 = 502;
                                        }
                                        int var268 = Statics.field264.field176[var266];
                                        if (var268 < 0) {
                                            var268 = 0;
                                        } else if (var268 > 764) {
                                            var268 = 764;
                                        }
                                        int var269 = var267 * 765 + var268;
                                        if (Statics.field264.field172[var266] == -1 && Statics.field264.field176[var266] == -1) {
                                            var268 = -1;
                                            var267 = -1;
                                            var269 = 524287;
                                        }
                                        if (field265 != var268 || field440 != var267) {
                                            int var270 = var268 - field265;
                                            field265 = var268;
                                            int var271 = var267 - field440;
                                            field440 = var267;
                                            if (field410 < 8 && var270 >= -32 && var270 <= 31 && var271 >= -32 && var271 <= 31) {
                                                var270 += 32;
                                                var271 += 32;
                                                field294.method2096((field410 << 12) + (var270 << 6) + var271);
                                                field410 = 0;
                                            } else if (field410 < 8) {
                                                field294.method2097((field410 << 19) + 8388608 + var269);
                                                field410 = 0;
                                            } else {
                                                field294.method2232((field410 << 19) + -1073741824 + var269);
                                                field410 = 0;
                                            }
                                        } else if (field410 < 2047) {
                                            field410++;
                                        }
                                    }
                                    field294.method2106(field294.field1854 - var264);
                                    if (var265 >= Statics.field264.field174) {
                                        Statics.field264.field174 = 0;
                                    } else {
                                        Statics.field264.field174 -= var265;
                                        for (int var272 = 0; var272 < Statics.field264.field174; var272++) {
                                            Statics.field264.field176[var272] = Statics.field264.field176[var265 + var272];
                                            Statics.field264.field172[var272] = Statics.field264.field172[var265 + var272];
                                        }
                                    }
                                }
                            }
                            if (class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4 || class127.field2011 == 2) {
                                long var274 = (class127.field2014 - field390 * -1L) / 50L;
                                if (var274 > 4095L) {
                                    var274 = 4095L;
                                }
                                field390 = class127.field2014 * -1L;
                                int var276 = class127.field2015;
                                if (var276 < 0) {
                                    var276 = 0;
                                } else if (var276 > 502) {
                                    var276 = 502;
                                }
                                int var277 = class127.field2013;
                                if (var277 < 0) {
                                    var277 = 0;
                                } else if (var277 > 764) {
                                    var277 = 764;
                                }
                                int var278 = var276 * 765 + var277;
                                byte var279 = 0;
                                if (class127.field2011 == 2) {
                                    var279 = 1;
                                }
                                int var280 = (int) var274;
                                field294.method2331(55);
                                field294.method2232((var279 << 19) + (var280 << 20) + var278);
                            }
                            if (class124.field1973 > 0) {
                                field294.method2331(52);
                                field294.method2096(0);
                                int var281 = field294.field1854;
                                long var282 = class103.method790();
                                for (int var284 = 0; var284 < class124.field1973; var284++) {
                                    long var285 = var282 - field473;
                                    if (var285 > 16777215L) {
                                        var285 = 16777215L;
                                    }
                                    field473 = var282;
                                    field294.method2276(class124.field1972[var284]);
                                    field294.method2097((int) var285);
                                }
                                field294.method2105(field294.field1854 - var281);
                            }
                            if (field418 > 0) {
                                field418--;
                            }
                            if (class124.field1966[96] || class124.field1966[97] || class124.field1966[98] || class124.field1966[99]) {
                                field343 = true;
                            }
                            if (field343 && field418 <= 0) {
                                field418 = 20;
                                field343 = false;
                                field294.method2331(156);
                                field294.method2139(field289);
                                field294.method2096(field330);
                            }
                            if (Statics.field1937 && !field268) {
                                field268 = true;
                                field294.method2331(253);
                                field294.method2278(1);
                            }
                            if (!Statics.field1937 && field268) {
                                field268 = false;
                                field294.method2331(253);
                                field294.method2278(0);
                            }
                            if (field257 && Statics.field72 != field335) {
                                method2687(Statics.field21, Statics.field2834, Statics.field72, Statics.field1561.field766[0], Statics.field1561.field712[0]);
                            } else if (Statics.field72 != field476) {
                                field476 = Statics.field72;
                                int var287 = Statics.field72;
                                int[] var288 = Statics.field1519.field1293;
                                int var289 = var288.length;
                                for (int var290 = 0; var290 < var289; var290++) {
                                    var288[var290] = 0;
                                }
                                int var291 = 1;
                                while (true) {
                                    if (var291 >= 103) {
                                        int var294 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var295 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1519.method1406();
                                        for (int var296 = 1; var296 < 103; var296++) {
                                            for (int var297 = 1; var297 < 103; var297++) {
                                                if ((class6.field82[var287][var297][var296] & 0x18) == 0) {
                                                    method477(var287, var297, var296, var294, var295);
                                                }
                                                if (var287 < 3 && (class6.field82[var287 + 1][var297][var296] & 0x8) != 0) {
                                                    method477(var287 + 1, var297, var296, var294, var295);
                                                }
                                            }
                                        }
                                        field299 = 0;
                                        for (int var298 = 0; var298 < 104; var298++) {
                                            for (int var299 = 0; var299 < 104; var299++) {
                                                int var300 = Statics.field56.method1744(Statics.field72, var298, var299);
                                                if (var300 != 0) {
                                                    int var301 = var300 >> 14 & 0x7FFF;
                                                    int var302 = class36.method6(var301).field847;
                                                    if (var302 >= 0) {
                                                        int var303 = var298;
                                                        int var304 = var299;
                                                        if (var302 != 22 && var302 != 29 && var302 != 34 && var302 != 36 && var302 != 46 && var302 != 47 && var302 != 48) {
                                                            int[][] var305 = field266[Statics.field72].field2913;
                                                            for (int var306 = 0; var306 < 10; var306++) {
                                                                int var307 = (int) (Math.random() * 4.0D);
                                                                if (var307 == 0 && var303 > 0 && var303 > var298 - 3 && (var305[var303 - 1][var304] & 0x1240108) == 0) {
                                                                    var303--;
                                                                }
                                                                if (var307 == 1 && var303 < 103 && var303 < var298 + 3 && (var305[var303 + 1][var304] & 0x1240180) == 0) {
                                                                    var303++;
                                                                }
                                                                if (var307 == 2 && var304 > 0 && var304 > var299 - 3 && (var305[var303][var304 - 1] & 0x1240102) == 0) {
                                                                    var304--;
                                                                }
                                                                if (var307 == 3 && var304 < 103 && var304 < var299 + 3 && (var305[var303][var304 + 1] & 0x1240120) == 0) {
                                                                    var304++;
                                                                }
                                                            }
                                                        }
                                                        field420[field299] = Statics.field77[var302];
                                                        field478[field299] = var303;
                                                        field380[field299] = var304;
                                                        field299++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1822.method1398();
                                        break;
                                    }
                                    int var292 = (103 - var291) * 2048 + 24628;
                                    for (int var293 = 1; var293 < 103; var293++) {
                                        if ((class6.field82[var287][var293][var291] & 0x18) == 0) {
                                            Statics.field56.method1758(var288, var292, 512, var287, var293, var291);
                                        }
                                        if (var287 < 3 && (class6.field82[var287 + 1][var293][var291] & 0x8) != 0) {
                                            Statics.field56.method1758(var288, var292, 512, var287 + 1, var293, var291);
                                        }
                                        var292 += 4;
                                    }
                                    var291++;
                                }
                            }
                            if (field260 == 30) {
                                method67();
                                method733();
                                field442++;
                                if (field442 > 750) {
                                    method24();
                                } else {
                                    method831();
                                    method546();
                                    method145();
                                    field443++;
                                    if (field362 != 0) {
                                        field361 += 20;
                                        if (field361 >= 400) {
                                            field362 = 0;
                                        }
                                    }
                                    if (Statics.field220 != null) {
                                        field363++;
                                        if (field363 >= 15) {
                                            method2685(Statics.field220);
                                            Statics.field220 = null;
                                        }
                                    }
                                    class151 var308 = Statics.field1862;
                                    class151 var309 = Statics.field1931;
                                    Statics.field1862 = null;
                                    Statics.field1931 = null;
                                    field429 = null;
                                    field502 = false;
                                    field430 = false;
                                    field470 = 0;
                                    while (true) {
                                        while (class124.method494() && field470 < 128) {
                                            if (field388 >= 2 && class124.field1966[82] && Statics.field1662 == 66) {
                                                String var310 = class10.method1851();
                                                Statics.field987.setContents(new StringSelection(var310), (ClipboardOwner) null);
                                            } else {
                                                field472[field470] = Statics.field1662;
                                                field471[field470] = Statics.field666;
                                                field470++;
                                            }
                                        }
                                        method144(field251, 0, 0, 765, 503, 0, 0);
                                        field437++;
                                        while (true) {
                                            class1 var311;
                                            class151 var312;
                                            class151 var313;
                                            do {
                                                var311 = (class1) field452.method3229();
                                                if (var311 == null) {
                                                    while (true) {
                                                        class1 var314;
                                                        class151 var315;
                                                        class151 var316;
                                                        do {
                                                            var314 = (class1) field453.method3229();
                                                            if (var314 == null) {
                                                                while (true) {
                                                                    class1 var317;
                                                                    class151 var318;
                                                                    class151 var319;
                                                                    do {
                                                                        var317 = (class1) field341.method3229();
                                                                        if (var317 == null) {
                                                                            boolean var320 = false;
                                                                            while (!var320) {
                                                                                var320 = true;
                                                                                for (int var321 = 0; var321 < field396 - 1; var321++) {
                                                                                    if (field399[var321] < 1000 && field399[var321 + 1] > 1000) {
                                                                                        String var322 = field320[var321];
                                                                                        field320[var321] = field320[var321 + 1];
                                                                                        field320[var321 + 1] = var322;
                                                                                        String var323 = field407[var321];
                                                                                        field407[var321] = field407[var321 + 1];
                                                                                        field407[var321 + 1] = var323;
                                                                                        int var324 = field399[var321];
                                                                                        field399[var321] = field399[var321 + 1];
                                                                                        field399[var321 + 1] = var324;
                                                                                        int var325 = field276[var321];
                                                                                        field276[var321] = field276[var321 + 1];
                                                                                        field276[var321 + 1] = var325;
                                                                                        int var326 = field398[var321];
                                                                                        field398[var321] = field398[var321 + 1];
                                                                                        field398[var321 + 1] = var326;
                                                                                        int var327 = field400[var321];
                                                                                        field400[var321] = field400[var321 + 1];
                                                                                        field400[var321 + 1] = var327;
                                                                                        var320 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field1883 == null && field475 == null) {
                                                                                int var328 = class127.field2011;
                                                                                if (field395) {
                                                                                    if (var328 != 1 && (Statics.field144 || var328 != 4)) {
                                                                                        int var329 = class127.field2005;
                                                                                        int var330 = class127.field2006;
                                                                                        if (var329 < Statics.field679 - 10 || var329 > Statics.field679 + Statics.field1564 + 10 || var330 < Statics.field224 - 10 || var330 > Statics.field224 + Statics.field1338 + 10) {
                                                                                            field395 = false;
                                                                                            method474(Statics.field679, Statics.field224, Statics.field1564, Statics.field1338);
                                                                                        }
                                                                                    }
                                                                                    if (var328 == 1 || !Statics.field144 && var328 == 4) {
                                                                                        int var331 = Statics.field679;
                                                                                        int var332 = Statics.field224;
                                                                                        int var333 = Statics.field1564;
                                                                                        int var334 = class127.field2013;
                                                                                        int var335 = class127.field2015;
                                                                                        int var336 = -1;
                                                                                        for (int var337 = 0; var337 < field396; var337++) {
                                                                                            int var338 = (field396 - 1 - var337) * 15 + var332 + 31;
                                                                                            if (var334 > var331 && var334 < var331 + var333 && var335 > var338 - 13 && var335 < var338 + 3) {
                                                                                                var336 = var337;
                                                                                            }
                                                                                        }
                                                                                        if (var336 != -1 && var336 >= 0) {
                                                                                            int var339 = field276[var336];
                                                                                            int var340 = field398[var336];
                                                                                            int var341 = field399[var336];
                                                                                            int var342 = field400[var336];
                                                                                            String var343 = field407[var336];
                                                                                            String var344 = field320[var336];
                                                                                            method2833(var339, var340, var341, var342, var343, var344, class127.field2013, class127.field2015);
                                                                                        }
                                                                                        field395 = false;
                                                                                        method474(Statics.field679, Statics.field224, Statics.field1564, Statics.field1338);
                                                                                    }
                                                                                } else {
                                                                                    label2898: {
                                                                                        if ((var328 == 1 || !Statics.field144 && var328 == 4) && field396 > 0) {
                                                                                            int var345 = field399[field396 - 1];
                                                                                            if (var345 == 39 || var345 == 40 || var345 == 41 || var345 == 42 || var345 == 43 || var345 == 33 || var345 == 34 || var345 == 35 || var345 == 36 || var345 == 37 || var345 == 38 || var345 == 1005) {
                                                                                                label2877: {
                                                                                                    int var346 = field276[field396 - 1];
                                                                                                    int var347 = field398[field396 - 1];
                                                                                                    class151 var348 = class151.method2354(var347);
                                                                                                    int var349 = method731(var348);
                                                                                                    boolean var350 = (var349 >> 28 & 0x1) != 0;
                                                                                                    if (!var350) {
                                                                                                        class155 var393 = (class155) null;
                                                                                                        if (!class155.method2558(method731(var348))) {
                                                                                                            break label2877;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field1883 != null && !field369 && field394 != 1 && !method116(field396 - 1) && field396 > 0) {
                                                                                                        method2373(field366, field367);
                                                                                                    }
                                                                                                    field369 = false;
                                                                                                    field448 = 0;
                                                                                                    if (Statics.field1883 != null) {
                                                                                                        method2685(Statics.field1883);
                                                                                                    }
                                                                                                    Statics.field1883 = class151.method2354(var347);
                                                                                                    field365 = var346;
                                                                                                    field366 = class127.field2013;
                                                                                                    field367 = class127.field2015;
                                                                                                    if (field396 > 0) {
                                                                                                        int var351 = field396 - 1;
                                                                                                        Statics.field1919 = new class27();
                                                                                                        Statics.field1919.field630 = field276[var351];
                                                                                                        Statics.field1919.field626 = field398[var351];
                                                                                                        Statics.field1919.field628 = field399[var351];
                                                                                                        Statics.field1919.field629 = field400[var351];
                                                                                                        Statics.field1919.field631 = field407[var351];
                                                                                                    }
                                                                                                    method2685(Statics.field1883);
                                                                                                    break label2898;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var328 == 1 || !Statics.field144 && var328 == 4) && (field394 == 1 && field396 > 2 || method116(field396 - 1))) {
                                                                                            var328 = 2;
                                                                                        }
                                                                                        if ((var328 == 1 || !Statics.field144 && var328 == 4) && field396 > 0) {
                                                                                            int var352 = field396 - 1;
                                                                                            if (var352 >= 0) {
                                                                                                int var353 = field276[var352];
                                                                                                int var354 = field398[var352];
                                                                                                int var355 = field399[var352];
                                                                                                int var356 = field400[var352];
                                                                                                String var357 = field407[var352];
                                                                                                String var358 = field320[var352];
                                                                                                method2833(var353, var354, var355, var356, var357, var358, class127.field2013, class127.field2015);
                                                                                            }
                                                                                        }
                                                                                        if (var328 == 2 && field396 > 0) {
                                                                                            method2475(class127.field2013, class127.field2015);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field475 != null) {
                                                                                method2685(field475);
                                                                                Statics.field1998++;
                                                                                if (field502 && field430) {
                                                                                    int var359 = class127.field2005;
                                                                                    int var360 = class127.field2006;
                                                                                    int var361 = var359 - field308;
                                                                                    int var362 = var360 - field428;
                                                                                    if (var361 < field492) {
                                                                                        var361 = field492;
                                                                                    }
                                                                                    if (field475.field2512 + var361 > field492 + field426.field2512) {
                                                                                        var361 = field492 + field426.field2512 - field475.field2512;
                                                                                    }
                                                                                    if (var362 < field432) {
                                                                                        var362 = field432;
                                                                                    }
                                                                                    if (field475.field2513 + var362 > field432 + field426.field2513) {
                                                                                        var362 = field432 + field426.field2513 - field475.field2513;
                                                                                    }
                                                                                    int var363 = var361 - field425;
                                                                                    int var364 = var362 - field435;
                                                                                    int var365 = field475.field2566;
                                                                                    if (Statics.field1998 > field475.field2567 && (var363 > var365 || var363 < -var365 || var364 > var365 || var364 < -var365)) {
                                                                                        field436 = true;
                                                                                    }
                                                                                    int var366 = field426.field2516 + (var361 - field492);
                                                                                    int var367 = field426.field2517 + (var362 - field432);
                                                                                    if (field475.field2523 != null && field436) {
                                                                                        class1 var368 = new class1();
                                                                                        var368.field3 = field475;
                                                                                        var368.field4 = var366;
                                                                                        var368.field6 = var367;
                                                                                        var368.field1 = field475.field2523;
                                                                                        class32.method585(var368);
                                                                                    }
                                                                                    if (class127.field2004 == 0) {
                                                                                        if (field436) {
                                                                                            if (field475.field2580 != null) {
                                                                                                class1 var369 = new class1();
                                                                                                var369.field3 = field475;
                                                                                                var369.field4 = var366;
                                                                                                var369.field6 = var367;
                                                                                                var369.field7 = field429;
                                                                                                var369.field1 = field475.field2580;
                                                                                                class32.method585(var369);
                                                                                            }
                                                                                            if (field429 != null && method2384(field475) != null) {
                                                                                                field294.method2331(188);
                                                                                                field294.method2147(field475.field2503);
                                                                                                field294.method2170(field475.field2504);
                                                                                                field294.method2170(field429.field2504);
                                                                                                field294.method2147(field429.field2503);
                                                                                            }
                                                                                        } else if ((field394 == 1 || method116(field396 - 1)) && field396 > 2) {
                                                                                            method2475(field425 + field308, field435 + field428);
                                                                                        } else if (field396 > 0) {
                                                                                            method2373(field425 + field308, field435 + field428);
                                                                                        }
                                                                                        field475 = null;
                                                                                    }
                                                                                } else if (Statics.field1998 > 1) {
                                                                                    field475 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field1883 != null) {
                                                                                method2685(Statics.field1883);
                                                                                field448++;
                                                                                if (class127.field2004 == 0) {
                                                                                    if (field369) {
                                                                                        if (Statics.field1883 == Statics.field1501 && field368 != field365) {
                                                                                            class151 var370 = Statics.field1883;
                                                                                            byte var371 = 0;
                                                                                            if (field484 == 1 && var370.field2507 == 206) {
                                                                                                var371 = 1;
                                                                                            }
                                                                                            if (var370.field2497[field368] <= 0) {
                                                                                                var371 = 0;
                                                                                            }
                                                                                            if (class155.method2558(method731(var370))) {
                                                                                                int var372 = field365;
                                                                                                int var373 = field368;
                                                                                                var370.field2497[var373] = var370.field2497[var372];
                                                                                                var370.field2606[var373] = var370.field2606[var372];
                                                                                                var370.field2497[var372] = -1;
                                                                                                var370.field2606[var372] = 0;
                                                                                            } else if (var371 == 1) {
                                                                                                int var374 = field365;
                                                                                                int var375 = field368;
                                                                                                while (var374 != var375) {
                                                                                                    if (var374 > var375) {
                                                                                                        var370.method2875(var374 - 1, var374);
                                                                                                        var374--;
                                                                                                    } else if (var374 < var375) {
                                                                                                        var370.method2875(var374 + 1, var374);
                                                                                                        var374++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var370.method2875(field368, field365);
                                                                                            }
                                                                                            field294.method2331(191);
                                                                                            field294.method2170(field368);
                                                                                            field294.method2232(Statics.field1883.field2503);
                                                                                            field294.method2137(field365);
                                                                                            field294.method2276(var371);
                                                                                        }
                                                                                    } else if ((field394 == 1 || method116(field396 - 1)) && field396 > 2) {
                                                                                        method2475(field366, field367);
                                                                                    } else if (field396 > 0) {
                                                                                        method2373(field366, field367);
                                                                                    }
                                                                                    field363 = 10;
                                                                                    class127.field2011 = 0;
                                                                                    Statics.field1883 = null;
                                                                                } else if (field448 >= 5 && (class127.field2005 > field366 + 5 || class127.field2005 < field366 - 5 || class127.field2006 > field367 + 5 || class127.field2006 < field367 - 5)) {
                                                                                    field369 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1382 != -1) {
                                                                                int var376 = class79.field1382;
                                                                                int var377 = class79.field1383;
                                                                                field294.method2331(243);
                                                                                field294.method2278(5);
                                                                                field294.method2170(Statics.field1047 + var377);
                                                                                field294.method2276(class124.field1966[82] ? (class124.field1966[81] ? 2 : 1) : 0);
                                                                                field294.method2096(Statics.field966 + var376);
                                                                                class79.field1382 = -1;
                                                                                field359 = class127.field2013;
                                                                                field360 = class127.field2015;
                                                                                field362 = 1;
                                                                                field361 = 0;
                                                                                field481 = var376;
                                                                                field318 = var377;
                                                                            }
                                                                            if (Statics.field1862 != var308) {
                                                                                if (var308 != null) {
                                                                                    method2685(var308);
                                                                                }
                                                                                if (Statics.field1862 != null) {
                                                                                    method2685(Statics.field1862);
                                                                                }
                                                                            }
                                                                            if (Statics.field1931 != var309 && field329 == field258) {
                                                                                if (var309 != null) {
                                                                                    method2685(var309);
                                                                                }
                                                                                if (Statics.field1931 != null) {
                                                                                    method2685(Statics.field1931);
                                                                                }
                                                                            }
                                                                            if (Statics.field1931 == null) {
                                                                                if (field329 > 0) {
                                                                                    field329--;
                                                                                }
                                                                            } else if (field329 < field258) {
                                                                                field329++;
                                                                                if (field329 == field258) {
                                                                                    method2685(Statics.field1931);
                                                                                }
                                                                            }
                                                                            method1588();
                                                                            if (field495) {
                                                                                method2811();
                                                                            }
                                                                            for (int var378 = 0; var378 < 5; var378++) {
                                                                                int var10002 = field352[var378]++;
                                                                            }
                                                                            int var379 = class127.method1768();
                                                                            int var380 = class124.field1977;
                                                                            if (var379 > 15000 && var380 > 15000) {
                                                                                field405 = 250;
                                                                                class127.method3401(14500);
                                                                                field294.method2331(46);
                                                                            }
                                                                            field322++;
                                                                            if (field322 > 500) {
                                                                                field322 = 0;
                                                                                int var382 = (int) (Math.random() * 8.0D);
                                                                                if ((var382 & 0x1) == 1) {
                                                                                    field316 += field413;
                                                                                }
                                                                                if ((var382 & 0x2) == 2) {
                                                                                    field312 += field319;
                                                                                }
                                                                                if ((var382 & 0x4) == 4) {
                                                                                    field416 += field321;
                                                                                }
                                                                            }
                                                                            if (field316 < -50) {
                                                                                field413 = 2;
                                                                            }
                                                                            if (field316 > 50) {
                                                                                field413 = -2;
                                                                            }
                                                                            if (field312 < -55) {
                                                                                field319 = 2;
                                                                            }
                                                                            if (field312 > 55) {
                                                                                field319 = -2;
                                                                            }
                                                                            if (field416 < -40) {
                                                                                field321 = 1;
                                                                            }
                                                                            if (field416 > 40) {
                                                                                field321 = -1;
                                                                            }
                                                                            field327++;
                                                                            if (field327 > 500) {
                                                                                field327 = 0;
                                                                                int var383 = (int) (Math.random() * 8.0D);
                                                                                if ((var383 & 0x1) == 1) {
                                                                                    field323 += field324;
                                                                                }
                                                                                if ((var383 & 0x2) == 2) {
                                                                                    field325 += field409;
                                                                                }
                                                                            }
                                                                            if (field323 < -60) {
                                                                                field324 = 2;
                                                                            }
                                                                            if (field323 > 60) {
                                                                                field324 = -2;
                                                                            }
                                                                            if (field325 < -20) {
                                                                                field409 = 1;
                                                                            }
                                                                            if (field325 > 10) {
                                                                                field409 = -1;
                                                                            }
                                                                            for (class34 var384 = (class34) field504.method3161(); var384 != null; var384 = (class34) field504.method3169()) {
                                                                                if ((long) var384.field782 < class103.method790() / 1000L - 5L) {
                                                                                    if (var384.field783 > 0) {
                                                                                        class10.method2659(5, "", var384.field774 + class142.field2287);
                                                                                    }
                                                                                    if (var384.field783 == 0) {
                                                                                        class10.method2659(5, "", var384.field774 + class142.field2288);
                                                                                    }
                                                                                    var384.method3266();
                                                                                }
                                                                            }
                                                                            field300++;
                                                                            if (field300 > 50) {
                                                                                field294.method2331(73);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1487 != null && field294.field1854 > 0) {
                                                                                    Statics.field1487.method2566(field294.field1856, 0, field294.field1854);
                                                                                    field294.field1854 = 0;
                                                                                    field300 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var386) {
                                                                                method24();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var318 = var317.field3;
                                                                        if (var318.field2504 < 0) {
                                                                            break;
                                                                        }
                                                                        var319 = class151.method2354(var318.field2532);
                                                                    } while (var319 == null || var319.field2586 == null || var318.field2504 >= var319.field2586.length || var319.field2586[var318.field2504] != var318);
                                                                    class32.method585(var317);
                                                                }
                                                            }
                                                            var315 = var314.field3;
                                                            if (var315.field2504 < 0) {
                                                                break;
                                                            }
                                                            var316 = class151.method2354(var315.field2532);
                                                        } while (var316 == null || var316.field2586 == null || var315.field2504 >= var316.field2586.length || var316.field2586[var315.field2504] != var315);
                                                        class32.method585(var314);
                                                    }
                                                }
                                                var312 = var311.field3;
                                                if (var312.field2504 < 0) {
                                                    break;
                                                }
                                                var313 = class151.method2354(var312.field2532);
                                            } while (var313 == null || var313.field2586 == null || var312.field2504 >= var313.field2586.length || var313.field2586[var312.field2504] != var312);
                                            class32.method585(var311);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field260 == 40 || field260 == 45) {
                    method542();
                }
                return;
            }
            var2.field2459.method2785(var2.field2456, (int) var2.field2830, var2.field2458, false);
        }
    }

    @ObfuscatedName("client.a(I)V")
    public final void method168() {
        boolean var1;
        label261: {
            try {
                if (class160.field2683 == 2) {
                    if (Statics.field1771 == null) {
                        Statics.field1771 = class157.method2928(Statics.field558, Statics.field2686, Statics.field1890);
                        if (Statics.field1771 == null) {
                            var1 = false;
                            break label261;
                        }
                    }
                    if (Statics.field2633 == null) {
                        Statics.field2633 = new class53(Statics.field2678, Statics.field2682);
                    }
                    if (Statics.field2679.method3030(Statics.field1771, Statics.field2632, Statics.field2633, 22050)) {
                        Statics.field2679.method3016();
                        Statics.field2679.method3013(Statics.field2684);
                        Statics.field2679.method3051(Statics.field1771, Statics.field1891);
                        class160.field2683 = 0;
                        Statics.field1771 = null;
                        Statics.field2633 = null;
                        Statics.field558 = null;
                        var1 = true;
                        break label261;
                    }
                }
            } catch (Exception var47) {
                var47.printStackTrace();
                Statics.field2679.method3050();
                class160.field2683 = 0;
                Statics.field1771 = null;
                Statics.field2633 = null;
                Statics.field558 = null;
            }
            var1 = false;
        }
        if (var1 && field486 && Statics.field2096 != null) {
            Statics.field2096.method1004();
        }
        if (field2062) {
            Canvas var4 = Statics.field1523;
            var4.removeKeyListener(class124.field1961);
            var4.removeFocusListener(class124.field1961);
            class124.field1965 = -1;
            Canvas var5 = Statics.field1523;
            var5.removeMouseListener(class127.field2003);
            var5.removeMouseMotionListener(class127.field2003);
            var5.removeFocusListener(class127.field2003);
            class127.field2001 = 0;
            if (Statics.field1042 != null) {
                Statics.field1042.method2411(Statics.field1523);
            }
            this.method2590();
            Canvas var6 = Statics.field1523;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class124.field1961);
            var6.addFocusListener(class124.field1961);
            class127.method1849(Statics.field1523);
            if (Statics.field1042 != null) {
                Statics.field1042.method2417(Statics.field1523);
            }
        }
        if (field260 == 0) {
            int var7 = class28.field651;
            String var8 = class28.field636;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1523.getGraphics();
                if (Statics.field778 == null) {
                    Statics.field778 = new Font("Helvetica", 1, 13);
                    Statics.field1280 = Statics.field1523.getFontMetrics(Statics.field778);
                }
                if (field2060) {
                    field2060 = false;
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field80, Statics.field1907);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1908 == null) {
                        Statics.field1908 = Statics.field1523.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1908.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field778);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field1280.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1908, Statics.field80 / 2 - 152, Statics.field1907 / 2 - 18, (ImageObserver) null);
                } catch (Exception var43) {
                    int var13 = Statics.field80 / 2 - 152;
                    int var14 = Statics.field1907 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field778);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field1280.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var44) {
                Statics.field1523.repaint();
            }
        } else if (field260 == 5) {
            class28.method2117(Statics.field1443, Statics.field64);
        } else if (field260 == 10) {
            class28.method2117(Statics.field1443, Statics.field64);
        } else if (field260 == 20) {
            class28.method2117(Statics.field1443, Statics.field64);
        } else if (field260 == 25) {
            if (field350 == 1) {
                if (field307 > field292) {
                    field292 = field307;
                }
                int var16 = (field292 * 50 - field307 * 50) / field292;
                method97(class142.field2267 + class2.field36 + class2.field24 + var16 + "%" + class2.field25, false);
            } else if (field350 == 2) {
                if (field338 > field310) {
                    field310 = field338;
                }
                int var17 = (field310 * 50 - field338 * 50) / field310 + 50;
                method97(class142.field2267 + class2.field36 + class2.field24 + var17 + "%" + class2.field25, false);
            } else {
                method97(class142.field2267, false);
            }
        } else if (field260 == 30) {
            if (field251 != -1) {
                method153(field251);
            }
            for (int var18 = 0; var18 < field455; var18++) {
                if (field457[var18]) {
                    field458[var18] = true;
                }
                field459[var18] = field457[var18];
                field457[var18] = false;
            }
            field456 = field262;
            field403 = -1;
            field254 = -1;
            Statics.field1501 = null;
            if (field251 != -1) {
                field455 = 0;
                method887(field251, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1507();
            if (field395) {
                int var24 = Statics.field679;
                int var25 = Statics.field224;
                int var26 = Statics.field1564;
                int var27 = Statics.field1338;
                int var28 = 6116423;
                class73.method1514(var24, var25, var26, var27, var28);
                class73.method1514(var24 + 1, var25 + 1, var26 - 2, 16, 0);
                class73.method1516(var24 + 1, var25 + 18, var26 - 2, var27 - 19, 0);
                Statics.field1443.method3303(class142.field2293, var24 + 3, var25 + 14, var28, -1);
                int var29 = class127.field2005;
                int var30 = class127.field2006;
                for (int var31 = 0; var31 < field396; var31++) {
                    int var32 = (field396 - 1 - var31) * 15 + var25 + 31;
                    int var33 = 16777215;
                    if (var29 > var24 && var29 < var24 + var26 && var30 > var32 - 13 && var30 < var32 + 3) {
                        var33 = 16776960;
                    }
                    class190 var34 = Statics.field1443;
                    String var35;
                    if (field320[var31].length() > 0) {
                        var35 = field407[var31] + class142.field2237 + field320[var31];
                    } else {
                        var35 = field407[var31];
                    }
                    var34.method3303(var35, var24 + 3, var32, var33, 0);
                }
                method687(Statics.field679, Statics.field224, Statics.field1564, Statics.field1338);
            } else if (field403 != -1) {
                int var19 = field403;
                int var20 = field254;
                if (field396 >= 2 || field415 != 0 || field467) {
                    String var21;
                    if (field415 == 1 && field396 < 2) {
                        var21 = class142.field2290 + class142.field2237 + field408 + " " + class2.field26;
                    } else if (field467 && field396 < 2) {
                        var21 = field411 + class142.field2237 + field412 + " " + class2.field26;
                    } else {
                        int var22 = field396 - 1;
                        String var23;
                        if (field320[var22].length() > 0) {
                            var23 = field407[var22] + class142.field2237 + field320[var22];
                        } else {
                            var23 = field407[var22];
                        }
                        var21 = var23;
                    }
                    if (field396 > 2) {
                        var21 = var21 + class2.method793(16777215) + " " + '/' + " " + (field396 - 2) + class142.field2294;
                    }
                    Statics.field1443.method3304(var21, var19 + 4, var20 + 15, 16777215, 0, field262 / 1000);
                }
            }
            if (field383 == 3) {
                for (int var36 = 0; var36 < field455; var36++) {
                    if (field459[var36]) {
                        class73.method1508(field417[var36], field461[var36], field462[var36], field463[var36], 16711935, 128);
                    } else if (field458[var36]) {
                        class73.method1508(field417[var36], field461[var36], field462[var36], field463[var36], 16711680, 128);
                    }
                }
            }
            class20.method151(Statics.field72, Statics.field1561.field746, Statics.field1561.field713, field443);
            field443 = 0;
        } else if (field260 == 40) {
            method97(class142.field2159 + class2.field36 + class142.field2160, false);
        } else if (field260 == 45) {
            method97(class142.field2298, false);
        }
        if (field260 == 30 && field383 == 0 && !field2060) {
            try {
                Graphics var37 = Statics.field1523.getGraphics();
                for (int var38 = 0; var38 < field455; var38++) {
                    if (field458[var38]) {
                        Statics.field1822.method1338(var37, field417[var38], field461[var38], field462[var38], field463[var38]);
                        field458[var38] = false;
                    }
                }
            } catch (Exception var46) {
                Statics.field1523.repaint();
            }
        } else if (field260 > 0) {
            try {
                Graphics var40 = Statics.field1523.getGraphics();
                Statics.field1822.method1332(var40, 0, 0);
                field2060 = false;
                for (int var41 = 0; var41 < field455; var41++) {
                    field458[var41] = false;
                }
            } catch (Exception var45) {
                Statics.field1523.repaint();
            }
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method169() {
        if (Statics.field264 != null) {
            Statics.field264.field173 = false;
        }
        Statics.field264 = null;
        if (Statics.field1487 != null) {
            Statics.field1487.method2562();
            Statics.field1487 = null;
        }
        if (class124.field1961 != null) {
            class124 var1 = class124.field1961;
            synchronized (class124.field1961) {
                class124.field1961 = null;
            }
        }
        if (class127.field2003 != null) {
            class127 var3 = class127.field2003;
            synchronized (class127.field2003) {
                class127.field2003 = null;
            }
        }
        Statics.field1042 = null;
        if (Statics.field2096 != null) {
            Statics.field2096.method1003();
        }
        if (Statics.field1661 != null) {
            Statics.field1661.method1003();
        }
        class149.method73();
        class148.method825();
        try {
            class136.field2083.method3408();
            for (int var5 = 0; var5 < Statics.field2925; var5++) {
                Statics.field233[var5].method3408();
            }
            class136.field2093.method3408();
            class136.field2091.method3408();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("aq.r(IB)V")
    public static void method547(int arg0) {
        if (field260 == arg0) {
            return;
        }
        if (field260 == 0) {
            class131.method661();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field287 = 0;
            field288 = 0;
            field433 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1335 != null) {
            Statics.field1335.method2562();
            Statics.field1335 = null;
        }
        if (field260 == 25) {
            field350 = 0;
            field307 = 0;
            field292 = 1;
            field338 = 0;
            field310 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class28.method2557(Statics.field1523, Statics.field1927, Statics.field17);
        } else {
            class28.method495();
        }
        field260 = arg0;
    }

    @ObfuscatedName("client.w(B)V")
    public void method170() {
        if (field260 != 1000) {
            boolean var1 = class149.method886();
            if (!var1) {
                this.method368();
            }
        }
    }

    @ObfuscatedName("client.c(I)V")
    public void method368() {
        if (class149.field2486 >= 4) {
            this.method2600("js5crc");
            field260 = 1000;
            return;
        }
        if (class149.field2485 >= 4) {
            if (field260 <= 5) {
                this.method2600("js5io");
                field260 = 1000;
                return;
            }
            field284 = 3000;
            class149.field2485 = 3;
        }
        if (--field284 + 1 > 0) {
            return;
        }
        try {
            if (field283 == 0) {
                Statics.field953 = Statics.field708.method2460(Statics.field2921, Statics.field168);
                field283++;
            }
            if (field283 == 1) {
                if (Statics.field953.field2070 == 2) {
                    this.method172(-1);
                    return;
                }
                if (Statics.field953.field2070 == 1) {
                    field283++;
                }
            }
            if (field283 == 2) {
                Statics.field63 = new class130((Socket) Statics.field953.field2066, Statics.field708);
                class107 var1 = new class107(5);
                var1.method2278(15);
                var1.method2232(49);
                Statics.field63.method2566(var1.field1856, 0, 5);
                field283++;
                Statics.field156 = class103.method790();
            }
            if (field283 == 3) {
                if (field260 <= 5 || Statics.field63.method2564() > 0) {
                    int var2 = Statics.field63.method2563();
                    if (var2 != 0) {
                        this.method172(var2);
                        return;
                    }
                    field283++;
                } else if (class103.method790() - Statics.field156 > 30000L) {
                    this.method172(-2);
                    return;
                }
            }
            if (field283 == 4) {
                class149.method734(Statics.field63, field260 > 20);
                Statics.field953 = null;
                Statics.field63 = null;
                field283 = 0;
                field286 = 0;
            }
        } catch (IOException var4) {
            this.method172(-3);
        }
    }

    @ObfuscatedName("client.f(II)V")
    public void method172(int arg0) {
        Statics.field953 = null;
        Statics.field63 = null;
        field283 = 0;
        if (Statics.field60 == Statics.field168) {
            Statics.field168 = Statics.field147;
        } else {
            Statics.field168 = Statics.field60;
        }
        field286++;
        if (field286 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field260 <= 5) {
                this.method2600("js5connect_full");
                field260 = 1000;
            } else {
                field284 = 3000;
            }
        } else if (field286 >= 2 && arg0 == 6) {
            this.method2600("js5connect_outofdate");
            field260 = 1000;
        } else if (field286 >= 4) {
            if (field260 <= 5) {
                this.method2600("js5connect");
                field260 = 1000;
            } else {
                field284 = 3000;
            }
        }
    }

    @ObfuscatedName("k.o(I)V")
    public static void method18() {
        if (field282 == 0) {
            Statics.field56 = new class79(4, 104, 104, class6.field85);
            for (int var0 = 0; var0 < 4; var0++) {
                field266[var0] = new class194(104, 104);
            }
            Statics.field1519 = new class72(512, 512);
            class28.field636 = class142.field2161;
            class28.field651 = 5;
            field282 = 20;
        } else if (field282 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1472[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1634(var1, 500, 800, 512, 334);
            class28.field636 = class142.field2291;
            class28.field651 = 10;
            field282 = 30;
        } else if (field282 == 30) {
            Statics.field927 = Statics.method1046(0, false, true, true);
            Statics.field138 = Statics.method1046(1, false, true, true);
            Statics.field2491 = Statics.method1046(2, true, false, true);
            Statics.field285 = Statics.method1046(3, false, true, true);
            Statics.field879 = Statics.method1046(4, false, true, true);
            Statics.field705 = Statics.method1046(5, true, true, true);
            Statics.field158 = Statics.method1046(6, true, true, false);
            Statics.field1673 = Statics.method1046(7, false, true, true);
            Statics.field17 = Statics.method1046(8, false, true, true);
            Statics.field710 = Statics.method1046(9, false, true, true);
            Statics.field1927 = Statics.method1046(10, false, true, true);
            Statics.field1894 = Statics.method1046(11, false, true, true);
            Statics.field1640 = Statics.method1046(12, false, true, true);
            Statics.field5 = Statics.method1046(13, true, false, true);
            Statics.field29 = Statics.method1046(14, false, true, false);
            Statics.field1798 = Statics.method1046(15, false, true, true);
            class28.field636 = class142.field2368;
            class28.field651 = 20;
            field282 = 40;
        } else if (field282 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field927.method2776() * 4 / 100;
            int var8 = var7 + Statics.field138.method2776() * 4 / 100;
            int var9 = var8 + Statics.field2491.method2776() * 2 / 100;
            int var10 = var9 + Statics.field285.method2776() * 2 / 100;
            int var11 = var10 + Statics.field879.method2776() * 6 / 100;
            int var12 = var11 + Statics.field705.method2776() * 4 / 100;
            int var13 = var12 + Statics.field158.method2776() * 2 / 100;
            int var14 = var13 + Statics.field1673.method2776() * 60 / 100;
            int var15 = var14 + Statics.field17.method2776() * 2 / 100;
            int var16 = var15 + Statics.field710.method2776() * 2 / 100;
            int var17 = var16 + Statics.field1927.method2776() * 2 / 100;
            int var18 = var17 + Statics.field1894.method2776() * 2 / 100;
            int var19 = var18 + Statics.field1640.method2776() * 2 / 100;
            int var20 = var19 + Statics.field5.method2776() * 2 / 100;
            int var21 = var20 + Statics.field29.method2776() * 2 / 100;
            int var22 = var21 + Statics.field1798.method2776() * 2 / 100;
            if (var22 == 100) {
                class28.field636 = class142.field2165;
                class28.field651 = 30;
                field282 = 45;
            } else {
                if (var22 != 0) {
                    class28.field636 = class142.field2164 + var22 + "%";
                }
                class28.field651 = 30;
            }
        } else if (field282 == 45) {
            class50.method1952(22050, !field257, 2);
            class161 var23 = new class161();
            var23.method3020(9, 128);
            Statics.field2096 = class50.method896(Statics.field708, Statics.field1523, 0, 22050);
            Statics.field2096.method976(var23);
            class146 var24 = Statics.field1798;
            class146 var25 = Statics.field29;
            class146 var26 = Statics.field879;
            Statics.field2632 = var24;
            Statics.field2682 = var25;
            Statics.field2678 = var26;
            Statics.field2679 = var23;
            Statics.field1661 = class50.method896(Statics.field708, Statics.field1523, 1, 2048);
            Statics.field1832 = new class49();
            Statics.field1661.method976(Statics.field1832);
            Statics.field180 = new class68(22050, Statics.field1069);
            class28.field636 = class142.field2166;
            class28.field651 = 35;
            field282 = 50;
        } else if (field282 == 50) {
            int var27 = 0;
            if (Statics.field64 == null) {
                Statics.field64 = Statics.method806(Statics.field17, Statics.field5, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field1103 == null) {
                Statics.field1103 = Statics.method806(Statics.field17, Statics.field5, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field1443 == null) {
                Statics.field1443 = Statics.method806(Statics.field17, Statics.field5, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class28.field636 = class142.field2292 + var27 * 100 / 3 + "%";
                class28.field651 = 40;
            } else {
                Statics.field186 = new class144(true);
                class28.field636 = class142.field2168;
                class28.field651 = 40;
                field282 = 60;
            }
        } else if (field282 == 60) {
            class146 var28 = Statics.field1927;
            class146 var29 = Statics.field17;
            int var30 = 0;
            if (var28.method2722("title.jpg", "")) {
                var30++;
            }
            if (var29.method2722("logo", "")) {
                var30++;
            }
            if (var29.method2722("titlebox", "")) {
                var30++;
            }
            if (var29.method2722("titlebutton", "")) {
                var30++;
            }
            if (var29.method2722("runes", "")) {
                var30++;
            }
            if (var29.method2722("title_mute", "")) {
                var30++;
            }
            var29.method2722("sl_back", "");
            var29.method2722("sl_flags", "");
            var29.method2722("sl_arrows", "");
            var29.method2722("sl_stars", "");
            var29.method2722("sl_button", "");
            byte var33 = 6;
            if (var30 < var33) {
                class28.field636 = class142.field2169 + var30 * 100 / var33 + "%";
                class28.field651 = 50;
            } else {
                class28.field636 = class142.field2261;
                class28.field651 = 50;
                method547(5);
                field282 = 70;
            }
        } else if (field282 == 70) {
            if (Statics.field2491.method2708()) {
                class146 var35 = Statics.field2491;
                Statics.field946 = var35;
                class37.method9(Statics.field2491);
                class146 var36 = Statics.field2491;
                class146 var37 = Statics.field1673;
                Statics.field934 = var36;
                Statics.field924 = var37;
                Statics.field133 = Statics.field934.method2714(3);
                class146 var38 = Statics.field2491;
                class146 var39 = Statics.field1673;
                boolean var40 = field257;
                Statics.field2927 = var38;
                Statics.field1439 = var39;
                class36.field855 = var40;
                class146 var41 = Statics.field2491;
                class146 var42 = Statics.field1673;
                Statics.field1774 = var41;
                Statics.field1440 = var42;
                class45.method1850(Statics.field2491, Statics.field1673, field256, Statics.field64);
                class38.method493(Statics.field2491, Statics.field927, Statics.field138);
                class39.method129(Statics.field2491, Statics.field1673);
                class42.method1950(Statics.field2491);
                class146 var43 = Statics.field2491;
                Statics.field1044 = var43;
                Statics.field1053 = Statics.field1044.method2714(16);
                class151.method2516(Statics.field285, Statics.field1673, Statics.field17, Statics.field5);
                class44.method548(Statics.field2491);
                class43.method1400(Statics.field2491);
                class28.field636 = class142.field2359;
                class28.field651 = 60;
                field282 = 80;
            } else {
                class28.field636 = class142.field2171 + Statics.field2491.method2775() + "%";
                class28.field651 = 60;
            }
        } else if (field282 == 80) {
            int var44 = 0;
            if (Statics.field69 == null) {
                Statics.field69 = Statics.method427(Statics.field17, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field893 == null) {
                Statics.field893 = Statics.method427(Statics.field17, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field775 == null) {
                Statics.field775 = class70.method1010(Statics.field17, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field77 == null) {
                Statics.field77 = class70.method491(Statics.field17, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field235 == null) {
                Statics.field235 = class70.method491(Statics.field17, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field2108 == null) {
                Statics.field2108 = class70.method491(Statics.field17, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field1697 == null) {
                Statics.field1697 = class70.method491(Statics.field17, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field181 == null) {
                Statics.field181 = class70.method491(Statics.field17, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field819 == null) {
                Statics.field819 = class70.method491(Statics.field17, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field770 == null) {
                Statics.field770 = class70.method491(Statics.field17, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field614 == null) {
                Statics.field614 = class70.method491(Statics.field17, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field1857 == null) {
                Statics.field1857 = class70.method1010(Statics.field17, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field250 == null) {
                Statics.field250 = class70.method1010(Statics.field17, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field530 == null) {
                Statics.field530 = class70.method732(Statics.field17, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class28.field636 = class142.field2173 + var44 * 100 / 14 + "%";
                class28.field651 = 70;
            } else {
                Statics.field2865 = Statics.field250;
                Statics.field893.method1408();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field77.length; var49++) {
                    Statics.field77[var49].method1407(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field775[0].method1566(var45 + var48, var46 + var48, var47 + var48);
                method19();
                class28.field636 = class142.field2174;
                class28.field651 = 70;
                field282 = 90;
            }
        } else if (field282 == 90) {
            if (Statics.field710.method2708()) {
                class88 var50 = new class88(Statics.field710, Statics.field17, 20, 0.8D, field257 ? 64 : 128);
                class84.method1808(var50);
                class84.method1805(0.8D);
                class28.field636 = class142.field2251;
                class28.field651 = 90;
                field282 = 110;
            } else {
                class28.field636 = class142.field2175 + Statics.field710.method2775() + "%";
                class28.field651 = 90;
            }
        } else if (field282 == 110) {
            Statics.field264 = new class12();
            Statics.field708.method2465(Statics.field264, 10);
            class28.field636 = class142.field2177;
            class28.field651 = 94;
            field282 = 120;
        } else if (field282 == 120) {
            if (Statics.field1927.method2722("huffman", "")) {
                class102 var51 = new class102(Statics.field1927.method2721("huffman", ""));
                Statics.field2857 = var51;
                class28.field636 = class142.field2328;
                class28.field651 = 96;
                field282 = 130;
            } else {
                class28.field636 = class142.field2178 + "%";
                class28.field651 = 96;
            }
        } else if (field282 == 130) {
            if (!Statics.field285.method2708()) {
                class28.field636 = class142.field2180 + Statics.field285.method2775() * 4 / 5 + "%";
                class28.field651 = 100;
            } else if (!Statics.field1640.method2708()) {
                class28.field636 = class142.field2180 + (80 + Statics.field1640.method2775() / 6) + "%";
                class28.field651 = 100;
            } else if (Statics.field5.method2708()) {
                class28.field636 = class142.field2181;
                class28.field651 = 100;
                field282 = 140;
            } else {
                class28.field636 = class142.field2180 + (96 + Statics.field5.method2775() / 20) + "%";
                class28.field651 = 100;
            }
        } else if (field282 == 140) {
            method547(10);
        }
    }

    @ObfuscatedName("k.n(B)V")
    public static void method19() {
        Statics.field146 = new int[33];
        Statics.field588 = new int[33];
        Statics.field1562 = new int[151];
        Statics.field1485 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field530.field1312[Statics.field530.field1307 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field146[var0] = var1;
            Statics.field588[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field530.field1312[Statics.field530.field1307 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1562[var4 - 5] = var5 - 25;
            Statics.field1485[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("al.m(I)V")
    public static final void method542() {
        try {
            if (field287 == 0) {
                if (Statics.field1487 != null) {
                    Statics.field1487.method2562();
                    Statics.field1487 = null;
                }
                Statics.field1083 = null;
                field305 = false;
                field288 = 0;
                field287 = 1;
            }
            if (field287 == 1) {
                if (Statics.field1083 == null) {
                    Statics.field1083 = Statics.field708.method2460(Statics.field2921, Statics.field168);
                }
                if (Statics.field1083.field2070 == 2) {
                    throw new IOException();
                }
                if (Statics.field1083.field2070 == 1) {
                    Statics.field1487 = new class130((Socket) Statics.field1083.field2066, Statics.field708);
                    Statics.field1083 = null;
                    field287 = 2;
                }
            }
            if (field287 == 2) {
                field294.field1854 = 0;
                field294.method2278(14);
                Statics.field1487.method2566(field294.field1856, 0, 1);
                field296.field1854 = 0;
                field287 = 3;
            }
            if (field287 == 3) {
                if (Statics.field2096 != null) {
                    Statics.field2096.method978();
                }
                if (Statics.field1661 != null) {
                    Statics.field1661.method978();
                }
                int var0 = Statics.field1487.method2563();
                if (Statics.field2096 != null) {
                    Statics.field2096.method978();
                }
                if (Statics.field1661 != null) {
                    Statics.field1661.method978();
                }
                if (var0 != 0) {
                    method795(var0);
                    return;
                }
                field296.field1854 = 0;
                field287 = 5;
            }
            if (field287 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field294.field1854 = 0;
                field294.method2278(10);
                field294.method2232(var1[0]);
                field294.method2232(var1[1]);
                field294.method2232(var1[2]);
                field294.method2232(var1[3]);
                field294.method2099(0L);
                field294.method2275(class28.field657);
                field294.method2277(class5.field78, class5.field75);
                field295.field1854 = 0;
                if (field260 == 40) {
                    field295.method2278(18);
                } else {
                    field295.method2278(16);
                }
                field295.method2096(0);
                int var2 = field295.field1854;
                field295.method2232(49);
                field295.method2098(field294.field1856, 0, field294.field1854);
                int var3 = field295.field1854;
                field295.method2275(class28.field656);
                field295.method2278(field257 ? 1 : 0);
                class136.method2049(field295);
                class107 var4 = new class107(Statics.field186.method2691());
                Statics.field186.method2693(var4);
                field295.method2098(var4.field1856, 0, var4.field1856.length);
                field295.method2232(Statics.field927.field2440);
                field295.method2232(Statics.field138.field2440);
                field295.method2232(Statics.field2491.field2440);
                field295.method2232(Statics.field285.field2440);
                field295.method2232(Statics.field879.field2440);
                field295.method2232(Statics.field705.field2440);
                field295.method2232(Statics.field158.field2440);
                field295.method2232(Statics.field1673.field2440);
                field295.method2232(Statics.field17.field2440);
                field295.method2232(Statics.field710.field2440);
                field295.method2232(Statics.field1927.field2440);
                field295.method2232(Statics.field1894.field2440);
                field295.method2232(Statics.field1640.field2440);
                field295.method2232(Statics.field5.field2440);
                field295.method2232(Statics.field29.field2440);
                field295.method2232(Statics.field1798.field2440);
                field295.method2125(var1, var3, field295.field1854);
                field295.method2105(field295.field1854 - var2);
                Statics.field1487.method2566(field295.field1856, 0, field295.field1854);
                field294.method2330(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field296.method2330(var1);
                field287 = 6;
            }
            if (field287 == 6 && Statics.field1487.method2564() > 0) {
                int var6 = Statics.field1487.method2563();
                if (var6 == 21 && field260 == 20) {
                    field287 = 7;
                } else if (var6 == 2) {
                    field287 = 9;
                } else if (var6 == 15 && field260 == 40) {
                    method2054();
                    return;
                } else if (var6 == 23 && field433 < 1) {
                    field433++;
                    field287 = 0;
                } else {
                    method795(var6);
                    return;
                }
            }
            if (field287 == 7 && Statics.field1487.method2564() > 0) {
                field290 = (Statics.field1487.method2563() + 3) * 60;
                field287 = 8;
            }
            if (field287 == 8) {
                field288 = 0;
                class28.method125(class142.field2182, class142.field2183, field290 / 60 + class142.field2184);
                if (--field290 <= 0) {
                    field287 = 0;
                }
            } else {
                if (field287 == 9 && Statics.field1487.method2564() >= 8) {
                    field388 = Statics.field1487.method2563();
                    field422 = Statics.field1487.method2563() == 1;
                    field434 = Statics.field1487.method2563();
                    field434 <<= 0x8;
                    field434 += Statics.field1487.method2563();
                    field336 = Statics.field1487.method2563();
                    Statics.field1487.method2565(field296.field1856, 0, 1);
                    field296.field1854 = 0;
                    field298 = field296.method2359();
                    Statics.field1487.method2565(field296.field1856, 0, 2);
                    field296.field1854 = 0;
                    field427 = field296.method2111();
                    if (field336 == 1) {
                        try {
                            class119.method2421(Statics.field252, "zap");
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class119.method2421(Statics.field252, "unzap");
                        } catch (Throwable var10) {
                        }
                    }
                    field287 = 10;
                }
                if (field287 != 10) {
                    field288++;
                    if (field288 > 2000) {
                        if (field433 < 1) {
                            if (Statics.field60 == Statics.field168) {
                                Statics.field168 = Statics.field147;
                            } else {
                                Statics.field168 = Statics.field60;
                            }
                            field433++;
                            field287 = 0;
                        } else {
                            method795(-3);
                        }
                    }
                } else if (Statics.field1487.method2564() >= field427) {
                    field296.field1854 = 0;
                    Statics.field1487.method2565(field296.field1856, 0, field427);
                    method1387();
                    Statics.field21 = -1;
                    method885(false);
                    field298 = -1;
                }
            }
        } catch (IOException var12) {
            if (field433 < 1) {
                if (Statics.field60 == Statics.field168) {
                    Statics.field168 = Statics.field147;
                } else {
                    Statics.field168 = Statics.field60;
                }
                field433++;
                field287 = 0;
            } else {
                method795(-2);
            }
        }
    }

    @ObfuscatedName("bi.s(B)V")
    public static void method1387() {
        field390 = 1L;
        field410 = -1;
        Statics.field264.field174 = 0;
        Statics.field1937 = true;
        field268 = true;
        field473 = -1L;
        class186.method3();
        field294.field1854 = 0;
        field296.field1854 = 0;
        field298 = -1;
        field302 = -1;
        field303 = -1;
        field304 = -1;
        field442 = 0;
        field270 = 0;
        field405 = 0;
        field317 = 0;
        field396 = 0;
        field395 = false;
        class127.method3401(0);
        class10.method584();
        field415 = 0;
        field467 = false;
        field489 = 0;
        field316 = (int) (Math.random() * 100.0D) - 50;
        field312 = (int) (Math.random() * 110.0D) - 55;
        field416 = (int) (Math.random() * 80.0D) - 40;
        field323 = (int) (Math.random() * 120.0D) - 60;
        field325 = (int) (Math.random() * 30.0D) - 20;
        field289 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field483 = 0;
        field476 = -1;
        field481 = 0;
        field318 = 0;
        field401 = class18.field513;
        field373 = 0;
        field482 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field372[var0] = null;
            field377[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field291[var1] = null;
        }
        Statics.field1561 = field372[2047] = new class3();
        field386 = -1;
        field389.method3201();
        field441.method3201();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field387[var2][var3][var4] = null;
                }
            }
        }
        field385 = new class176();
        field505 = 0;
        field501 = 0;
        field494 = 0;
        for (int var5 = 0; var5 < Statics.field1053; var5++) {
            class46 var6 = class46.method118(var5);
            if (var6 != null) {
                class153.field2629[var5] = 0;
                class153.field2628[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field271.length; var7++) {
            field271[var7] = -1;
        }
        field421 = -1;
        if (field251 != -1) {
            class151.method2882(field251);
        }
        for (class4 var8 = (class4) field414.method3170(); var8 != null; var8 = (class4) field414.method3174()) {
            method1591(var8, true);
        }
        field251 = -1;
        field414 = new class173(8);
        field391 = null;
        field395 = false;
        field396 = 0;
        field507.method2899((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field281[var9] = null;
            field384[var9] = false;
        }
        class14.method2403();
        field261 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field457[var10] = true;
        }
        field474 = null;
        Statics.field189 = 0;
        Statics.field177 = null;
    }

    @ObfuscatedName("ce.t(I)V")
    public static void method2054() {
        field294.field1854 = 0;
        field296.field1854 = 0;
        field298 = -1;
        field302 = -1;
        field303 = -1;
        field304 = -1;
        field427 = 0;
        field442 = 0;
        field270 = 0;
        field396 = 0;
        field395 = false;
        field483 = 0;
        field481 = 0;
        for (int var0 = 0; var0 < field372.length; var0++) {
            if (field372[var0] != null) {
                field372[var0].field765 = -1;
            }
        }
        for (int var1 = 0; var1 < field291.length; var1++) {
            if (field291[var1] != null) {
                field291[var1].field765 = -1;
            }
        }
        class14.method2403();
        method547(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field457[var2] = true;
        }
    }

    @ObfuscatedName("ap.j(II)V")
    public static void method795(int arg0) {
        if (arg0 == -3) {
            class28.method125(class142.field2185, class142.field2186, class142.field2367);
        } else if (arg0 == -2) {
            class28.method125(class142.field2188, class142.field2151, class142.field2249);
        } else if (arg0 == -1) {
            class28.method125(class142.field2310, class142.field2192, class142.field2246);
        } else if (arg0 == 3) {
            class28.method125(class142.field2270, class142.field2195, class142.field2167);
        } else if (arg0 == 4) {
            class28.method125(class142.field2280, class142.field2240, class142.field2199);
        } else if (arg0 == 5) {
            class28.method125(class142.field2200, class142.field2258, class142.field2191);
        } else if (arg0 == 6) {
            class28.method125(class142.field2203, class142.field2279, class142.field2155);
        } else if (arg0 == 7) {
            class28.method125(class142.field2206, class142.field2207, class142.field2252);
        } else if (arg0 == 8) {
            class28.method125(class142.field2209, class142.field2219, class142.field2211);
        } else if (arg0 == 9) {
            class28.method125(class142.field2212, class142.field2198, class142.field2214);
        } else if (arg0 == 10) {
            class28.method125(class142.field2215, class142.field2216, class142.field2217);
        } else if (arg0 == 11) {
            class28.method125(class142.field2218, class142.field2358, class142.field2220);
        } else if (arg0 == 12) {
            class28.method125(class142.field2378, class142.field2222, class142.field2223);
        } else if (arg0 == 13) {
            class28.method125(class142.field2224, class142.field2225, class142.field2226);
        } else if (arg0 == 14) {
            class28.method125(class142.field2227, class142.field2172, class142.field2229);
        } else if (arg0 == 16) {
            class28.method125(class142.field2230, class142.field2242, class142.field2333);
        } else if (arg0 == 17) {
            class28.method125(class142.field2347, class142.field2234, class142.field2235);
        } else if (arg0 == 18) {
            class28.method125(class142.field2236, class142.field2196, class142.field2238);
        } else if (arg0 == 19) {
            class28.method125(class142.field2239, class142.field2304, class142.field2241);
        } else if (arg0 == 20) {
            class28.method125(class142.field2369, class142.field2286, class142.field2244);
        } else if (arg0 == 22) {
            class28.method125(class142.field2245, class142.field2312, class142.field2202);
        } else if (arg0 == 23) {
            class28.method125(class142.field2248, class142.field2208, class142.field2250);
        } else if (arg0 == 24) {
            class28.method125(class142.field2379, class142.field2179, class142.field2253);
        } else if (arg0 == 25) {
            class28.method125(class142.field2254, class142.field2339, class142.field2256);
        } else if (arg0 == 26) {
            class28.method125(class142.field2257, class142.field2283, class142.field2259);
        } else if (arg0 == 27) {
            class28.method125(class142.field2260, class142.field2337, class142.field2262);
        } else if (arg0 == 31) {
            class28.method125(class142.field2377, class142.field2297, class142.field2271);
        } else if (arg0 == 32) {
            class28.method125(class142.field2373, class142.field2330, class142.field2274);
        } else if (arg0 == 37) {
            class28.method125(class142.field2275, class142.field2276, class142.field2277);
        } else if (arg0 == 38) {
            class28.method125(class142.field2278, class142.field2210, class142.field2329);
        } else if (arg0 == 55) {
            class28.method125(class142.field2281, class142.field2282, class142.field2321);
        } else {
            class28.method125(class142.field2284, class142.field2285, class142.field2187);
        }
        method547(10);
    }

    @ObfuscatedName("c.b(S)V")
    public static final void method117() {
        if (Statics.field1487 != null) {
            Statics.field1487.method2562();
            Statics.field1487 = null;
        }
        method429();
        Statics.field56.method1599();
        for (int var0 = 0; var0 < 4; var0++) {
            field266[var0].method3425();
        }
        System.gc();
        class160.field2683 = 1;
        Statics.field558 = null;
        Statics.field2686 = -1;
        Statics.field1890 = -1;
        Statics.field2684 = 0;
        Statics.field1891 = false;
        Statics.field2677 = 2;
        field485 = -1;
        field486 = false;
        for (class20 var1 = (class20) class20.field538.method3234(); var1 != null; var1 = (class20) class20.field538.method3209()) {
            if (var1.field531 != null) {
                Statics.field1832.method944(var1.field531);
                var1.field531 = null;
            }
            if (var1.field544 != null) {
                Statics.field1832.method944(var1.field544);
                var1.field544 = null;
            }
        }
        class20.field538.method3201();
        method547(10);
    }

    @ObfuscatedName("client.i(S)V")
    public static final void method429() {
        class41.method131();
        class37.method449();
        class40.method778();
        class36.field821.method3141();
        class36.field822.method3141();
        class36.field828.method3141();
        class36.field824.method3141();
        class35.method680();
        class45.field996.method3141();
        class45.field1037.method3141();
        class45.field998.method3141();
        class38.method2501();
        class39.field920.method3141();
        class39.field907.method3141();
        class42.field960.method3141();
        class46.field1045.method3141();
        class156.method2424();
        class151.field2514.method3141();
        class151.field2498.method3141();
        class151.field2500.method3141();
        ((class88) Statics.field1457).method1857();
        class19.field524.method3141();
        Statics.field927.method2717();
        Statics.field138.method2717();
        Statics.field285.method2717();
        Statics.field879.method2717();
        Statics.field705.method2717();
        Statics.field158.method2717();
        Statics.field1673.method2717();
        Statics.field17.method2717();
        Statics.field710.method2717();
        Statics.field1927.method2717();
        Statics.field1894.method2717();
        Statics.field1640.method2717();
    }

    @ObfuscatedName("l.h(I)V")
    public static final void method24() {
        if (field405 > 0) {
            method117();
        } else {
            method547(40);
            Statics.field1335 = Statics.field1487;
            Statics.field1487 = null;
        }
    }

    @ObfuscatedName("s.q(I)V")
    public static final void method157() {
        if (Statics.field1661 != null) {
            Statics.field1661.method977();
        }
        if (Statics.field2096 != null) {
            Statics.field2096.method977();
        }
    }

    @ObfuscatedName("ao.d(I)V")
    public static final void method733() {
        for (int var0 = 0; var0 < field489; var0++) {
            int var10002 = field314[var0]--;
            if (field314[var0] >= -10) {
                class52 var2 = field464[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1033(Statics.field879, field490[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field314[var0] += var2.method1025();
                    field464[var0] = var2;
                }
                if (field314[var0] < 0) {
                    int var9;
                    if (field493[var0] == 0) {
                        var9 = field342;
                    } else {
                        int var3 = (field493[var0] & 0xFF) * 128;
                        int var4 = field493[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1561.field746;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field493[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1561.field713;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field314[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field488 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1026().method1063(Statics.field180);
                        class58 var11 = class58.method1088(var10, 100, var9);
                        var11.method1174(field491[var0] - 1);
                        Statics.field1832.method973(var11);
                    }
                    field314[var0] = -100;
                }
            } else {
                field489--;
                for (int var1 = var0; var1 < field489; var1++) {
                    field490[var1] = field490[var1 + 1];
                    field464[var1] = field464[var1 + 1];
                    field491[var1] = field491[var1 + 1];
                    field314[var1] = field314[var1 + 1];
                    field493[var1] = field493[var1 + 1];
                }
                var0--;
            }
        }
        if (field486 && !class160.method81()) {
            if (field259 != 0 && field485 != -1) {
                class160.method456(Statics.field158, field485, 0, field259, false);
            }
            field486 = false;
        }
    }

    @ObfuscatedName("q.z(Lao;IIII)V")
    public static void method476(class38 arg0, int arg1, int arg2, int arg3) {
        if (field489 >= 50 || field488 == 0 || arg0.field888 == null || arg1 >= arg0.field888.length) {
            return;
        }
        int var4 = arg0.field888[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field490[field489] = var5;
        field491[field489] = var6;
        field314[field489] = 0;
        field464[field489] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field493[field489] = (var8 << 16) + (var9 << 8) + var7;
        field489++;
    }

    @ObfuscatedName("m.e(I)V")
    public static final void method145() {
        for (int var0 = -1; var0 < field373; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field374[var0];
            }
            class3 var2 = field372[var1];
            if (var2 != null && var2.field715 > 0) {
                var2.field715--;
                if (var2.field715 == 0) {
                    var2.field725 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field482; var3++) {
            int var4 = field293[var3];
            class30 var5 = field291[var4];
            if (var5 != null && var5.field715 > 0) {
                var5.field715--;
                if (var5.field715 == 0) {
                    var5.field725 = null;
                }
            }
        }
    }

    @ObfuscatedName("v.av(Ljava/lang/String;S)V")
    public static final void method23(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field559.field141 = !Statics.field559.field141;
            class9.method564();
            if (Statics.field559.field141) {
                class10.method2659(99, "", "Roofs are now all hidden");
            } else {
                class10.method2659(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field388 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field269 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field269 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method24();
            }
            if (arg0.equalsIgnoreCase("errortest") && field255 == 2) {
                throw new RuntimeException();
            }
        }
        field294.method2331(190);
        field294.method2278(arg0.length() + 1);
        field294.method2275(arg0);
    }

    @ObfuscatedName("en.al(I)V")
    public static final void method2811() {
        int var0 = Statics.field185 * 128 + 64;
        int var1 = Statics.field201 * 128 + 64;
        int var2 = method120(var0, var1, Statics.field72) - Statics.field204;
        if (Statics.field155 < var0) {
            Statics.field155 += Statics.field1990 * (var0 - Statics.field155) / 1000 + Statics.field967;
            if (Statics.field155 > var0) {
                Statics.field155 = var0;
            }
        }
        if (Statics.field155 > var0) {
            Statics.field155 -= Statics.field1990 * (Statics.field155 - var0) / 1000 + Statics.field967;
            if (Statics.field155 < var0) {
                Statics.field155 = var0;
            }
        }
        if (Statics.field561 < var2) {
            Statics.field561 += Statics.field1990 * (var2 - Statics.field561) / 1000 + Statics.field967;
            if (Statics.field561 > var2) {
                Statics.field561 = var2;
            }
        }
        if (Statics.field561 > var2) {
            Statics.field561 -= Statics.field1990 * (Statics.field561 - var2) / 1000 + Statics.field967;
            if (Statics.field561 < var2) {
                Statics.field561 = var2;
            }
        }
        if (Statics.field1663 < var1) {
            Statics.field1663 += Statics.field1990 * (var1 - Statics.field1663) / 1000 + Statics.field967;
            if (Statics.field1663 > var1) {
                Statics.field1663 = var1;
            }
        }
        if (Statics.field1663 > var1) {
            Statics.field1663 -= Statics.field1990 * (Statics.field1663 - var1) / 1000 + Statics.field967;
            if (Statics.field1663 < var1) {
                Statics.field1663 = var1;
            }
        }
        int var3 = Statics.field1235 * 128 + 64;
        int var4 = Statics.field1873 * 128 + 64;
        int var5 = method120(var3, var4, Statics.field72) - Statics.field58;
        int var6 = var3 - Statics.field155;
        int var7 = var5 - Statics.field561;
        int var8 = var4 - Statics.field1663;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1488 < var10) {
            Statics.field1488 += Statics.field1939 * (var10 - Statics.field1488) / 1000 + Statics.field232;
            if (Statics.field1488 > var10) {
                Statics.field1488 = var10;
            }
        }
        if (Statics.field1488 > var10) {
            Statics.field1488 -= Statics.field1939 * (Statics.field1488 - var10) / 1000 + Statics.field232;
            if (Statics.field1488 < var10) {
                Statics.field1488 = var10;
            }
        }
        int var12 = var11 - Statics.field1339;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1339 += Statics.field1939 * var12 / 1000 + Statics.field232;
            Statics.field1339 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1339 -= Statics.field1939 * -var12 / 1000 + Statics.field232;
            Statics.field1339 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1339;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1339 = var11;
        }
    }

    @ObfuscatedName("br.aq(B)V")
    public static final void method1588() {
        int var0 = field316 + Statics.field1561.field746;
        int var1 = field312 + Statics.field1561.field713;
        if (Statics.field15 - var0 < -500 || Statics.field15 - var0 > 500 || Statics.field1345 - var1 < -500 || Statics.field1345 - var1 > 500) {
            Statics.field15 = var0;
            Statics.field1345 = var1;
        }
        if (Statics.field15 != var0) {
            Statics.field15 += (var0 - Statics.field15) / 16;
        }
        if (Statics.field1345 != var1) {
            Statics.field1345 += (var1 - Statics.field1345) / 16;
        }
        if (class127.field2004 == 4 && Statics.field144) {
            int var2 = class127.field2006 - field451;
            field306 = var2 * 2;
            field451 = var2 == -1 || var2 == 1 ? class127.field2006 : (field451 + class127.field2006) / 2;
            int var3 = field340 - class127.field2005;
            field301 = var3 * 2;
            field340 = var3 == -1 || var3 == 1 ? class127.field2005 : (field340 + class127.field2005) / 2;
        } else {
            if (class124.field1966[96]) {
                field301 += (-24 - field301) / 2;
            } else if (class124.field1966[97]) {
                field301 += (24 - field301) / 2;
            } else {
                field301 /= 2;
            }
            if (class124.field1966[98]) {
                field306 += (12 - field306) / 2;
            } else if (class124.field1966[99]) {
                field306 += (-12 - field306) / 2;
            } else {
                field306 /= 2;
            }
            field451 = class127.field2006;
            field340 = class127.field2005;
        }
        field289 = field301 / 2 + field289 & 0x7FF;
        field330 += field306 / 2;
        if (field330 < 128) {
            field330 = 128;
        }
        if (field330 > 383) {
            field330 = 383;
        }
        int var4 = Statics.field15 >> 7;
        int var5 = Statics.field1345 >> 7;
        int var6 = method120(Statics.field15, Statics.field1345, Statics.field72);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field72;
                    if (var10 < 3 && (class6.field82[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field85[var10][var8][var9];
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
        if (var12 > field344) {
            field344 += (var12 - field344) / 24;
        } else if (var12 < field344) {
            field344 += (var12 - field344) / 80;
        }
    }

    @ObfuscatedName("as.aa(I)V")
    public static final void method831() {
        for (int var0 = -1; var0 < field373; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field374[var0];
            }
            class3 var2 = field372[var1];
            if (var2 != null) {
                method2674(var2, 1);
            }
        }
    }

    @ObfuscatedName("aq.ah(B)V")
    public static final void method546() {
        for (int var0 = 0; var0 < field482; var0++) {
            int var1 = field293[var0];
            class30 var2 = field291[var1];
            if (var2 != null) {
                method2674(var2, var2.field678.field801);
            }
        }
    }

    @ObfuscatedName("ey.au(Lai;II)V")
    public static final void method2674(class33 arg0, int arg1) {
        if (arg0.field756 > field262) {
            int var2 = arg0.field756 - field262;
            int var3 = arg0.field759 * 128 + arg0.field716 * 64;
            int var4 = arg0.field754 * 128 + arg0.field716 * 64;
            arg0.field746 += (var3 - arg0.field746) / var2;
            arg0.field713 += (var4 - arg0.field713) / var2;
            arg0.field768 = 0;
            if (arg0.field758 == 0) {
                arg0.field761 = 1024;
            }
            if (arg0.field758 == 1) {
                arg0.field761 = 1536;
            }
            if (arg0.field758 == 2) {
                arg0.field761 = 0;
            }
            if (arg0.field758 == 3) {
                arg0.field761 = 512;
            }
        } else if (arg0.field757 >= field262) {
            if (field262 == arg0.field757 || arg0.field742 == -1 || arg0.field745 != 0 || arg0.field772 + 1 > class38.method1866(arg0.field742).field881[arg0.field743]) {
                int var5 = arg0.field757 - arg0.field756;
                int var6 = field262 - arg0.field756;
                int var7 = arg0.field759 * 128 + arg0.field716 * 64;
                int var8 = arg0.field754 * 128 + arg0.field716 * 64;
                int var9 = arg0.field753 * 128 + arg0.field716 * 64;
                int var10 = arg0.field755 * 128 + arg0.field716 * 64;
                arg0.field746 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field713 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field768 = 0;
            if (arg0.field758 == 0) {
                arg0.field761 = 1024;
            }
            if (arg0.field758 == 1) {
                arg0.field761 = 1536;
            }
            if (arg0.field758 == 2) {
                arg0.field761 = 0;
            }
            if (arg0.field758 == 3) {
                arg0.field761 = 512;
            }
            arg0.field714 = arg0.field761;
        } else {
            arg0.field739 = arg0.field751;
            if (arg0.field764 == 0) {
                arg0.field768 = 0;
            } else {
                label360: {
                    if (arg0.field742 != -1 && arg0.field745 == 0) {
                        class38 var11 = class38.method1866(arg0.field742);
                        if (arg0.field769 > 0 && var11.field897 == 0) {
                            arg0.field768++;
                            break label360;
                        }
                        if (arg0.field769 <= 0 && var11.field892 == 0) {
                            arg0.field768++;
                            break label360;
                        }
                    }
                    int var12 = arg0.field746;
                    int var13 = arg0.field713;
                    int var14 = arg0.field766[arg0.field764 - 1] * 128 + arg0.field716 * 64;
                    int var15 = arg0.field712[arg0.field764 - 1] * 128 + arg0.field716 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field761 = 1280;
                            } else if (var13 > var15) {
                                arg0.field761 = 1792;
                            } else {
                                arg0.field761 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field761 = 768;
                            } else if (var13 > var15) {
                                arg0.field761 = 256;
                            } else {
                                arg0.field761 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field761 = 1024;
                        } else if (var13 > var15) {
                            arg0.field761 = 0;
                        }
                        int var16 = arg0.field761 - arg0.field714 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field721;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field720;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field723;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field722;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field720;
                        }
                        arg0.field739 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class30) {
                            var19 = ((class30) arg0).field678.field816;
                        }
                        if (var19) {
                            if (arg0.field761 != arg0.field714 && arg0.field765 == -1 && arg0.field763 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field764 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field764 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field768 > 0 && arg0.field764 > 1) {
                                var18 = 8;
                                arg0.field768--;
                            }
                        } else {
                            if (arg0.field764 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field764 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field768 > 0 && arg0.field764 > 1) {
                                var18 = 8;
                                arg0.field768--;
                            }
                        }
                        if (arg0.field767[arg0.field764 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field739 == arg0.field720 && arg0.field736 != -1) {
                            arg0.field739 = arg0.field736;
                        }
                        if (var12 < var14) {
                            arg0.field746 += var18;
                            if (arg0.field746 > var14) {
                                arg0.field746 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field746 -= var18;
                            if (arg0.field746 < var14) {
                                arg0.field746 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field713 += var18;
                            if (arg0.field713 > var15) {
                                arg0.field713 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field713 -= var18;
                            if (arg0.field713 < var15) {
                                arg0.field713 = var15;
                            }
                        }
                        if (arg0.field746 == var14 && arg0.field713 == var15) {
                            arg0.field764--;
                            if (arg0.field769 > 0) {
                                arg0.field769--;
                            }
                        }
                    } else {
                        arg0.field746 = var14;
                        arg0.field713 = var15;
                    }
                }
            }
        }
        if (arg0.field746 < 128 || arg0.field713 < 128 || arg0.field746 >= 13184 || arg0.field713 >= 13184) {
            arg0.field742 = -1;
            arg0.field747 = -1;
            arg0.field756 = 0;
            arg0.field757 = 0;
            arg0.field746 = arg0.field766[0] * 128 + arg0.field716 * 64;
            arg0.field713 = arg0.field712[0] * 128 + arg0.field716 * 64;
            arg0.method570();
        }
        if (Statics.field1561 == arg0 && (arg0.field746 < 1536 || arg0.field713 < 1536 || arg0.field746 >= 11776 || arg0.field713 >= 11776)) {
            arg0.field742 = -1;
            arg0.field747 = -1;
            arg0.field756 = 0;
            arg0.field757 = 0;
            arg0.field746 = arg0.field766[0] * 128 + arg0.field716 * 64;
            arg0.field713 = arg0.field712[0] * 128 + arg0.field716 * 64;
            arg0.method570();
        }
        if (arg0.field763 != 0) {
            if (arg0.field765 != -1 && arg0.field765 < 32768) {
                class30 var20 = field291[arg0.field765];
                if (var20 != null) {
                    int var21 = arg0.field746 - var20.field746;
                    int var22 = arg0.field713 - var20.field713;
                    if (var21 != 0 || var22 != 0) {
                        arg0.field761 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field765 >= 32768) {
                int var23 = arg0.field765 - 32768;
                if (field434 == var23) {
                    var23 = 2047;
                }
                class3 var24 = field372[var23];
                if (var24 != null) {
                    int var25 = arg0.field746 - var24.field746;
                    int var26 = arg0.field713 - var24.field713;
                    if (var25 != 0 || var26 != 0) {
                        arg0.field761 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field717 != 0 || arg0.field724 != 0) && (arg0.field764 == 0 || arg0.field768 > 0)) {
                int var27 = arg0.field746 - (arg0.field717 * 64 - Statics.field966 * 64 - Statics.field966 * 64);
                int var28 = arg0.field713 - (arg0.field724 * 64 - Statics.field1047 * 64 - Statics.field1047 * 64);
                if (var27 != 0 || var28 != 0) {
                    arg0.field761 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
                arg0.field717 = 0;
                arg0.field724 = 0;
            }
            int var29 = arg0.field761 - arg0.field714 & 0x7FF;
            if (var29 == 0) {
                arg0.field728 = 0;
            } else {
                arg0.field728++;
                if (var29 > 1024) {
                    arg0.field714 -= arg0.field763;
                    boolean var30 = true;
                    if (var29 < arg0.field763 || var29 > 2048 - arg0.field763) {
                        arg0.field714 = arg0.field761;
                        var30 = false;
                    }
                    if (arg0.field751 == arg0.field739 && (arg0.field728 > 25 || var30)) {
                        if (arg0.field718 == -1) {
                            arg0.field739 = arg0.field720;
                        } else {
                            arg0.field739 = arg0.field718;
                        }
                    }
                } else {
                    arg0.field714 += arg0.field763;
                    boolean var31 = true;
                    if (var29 < arg0.field763 || var29 > 2048 - arg0.field763) {
                        arg0.field714 = arg0.field761;
                        var31 = false;
                    }
                    if (arg0.field751 == arg0.field739 && (arg0.field728 > 25 || var31)) {
                        if (arg0.field719 == -1) {
                            arg0.field739 = arg0.field720;
                        } else {
                            arg0.field739 = arg0.field719;
                        }
                    }
                }
                arg0.field714 &= 0x7FF;
            }
        }
        method147(arg0);
    }

    @ObfuscatedName("m.ai(Lai;I)V")
    public static final void method147(class33 arg0) {
        arg0.field727 = false;
        if (arg0.field739 != -1) {
            class38 var1 = class38.method1866(arg0.field739);
            if (var1 == null || var1.field886 == null) {
                arg0.field739 = -1;
            } else {
                arg0.field741++;
                if (arg0.field737 < var1.field886.length && arg0.field741 > var1.field881[arg0.field737]) {
                    arg0.field741 = 1;
                    arg0.field737++;
                    method476(var1, arg0.field737, arg0.field746, arg0.field713);
                }
                if (arg0.field737 >= var1.field886.length) {
                    arg0.field741 = 0;
                    arg0.field737 = 0;
                    method476(var1, arg0.field737, arg0.field746, arg0.field713);
                }
            }
        }
        if (arg0.field747 != -1 && field262 >= arg0.field750) {
            if (arg0.field748 < 0) {
                arg0.field748 = 0;
            }
            int var2 = class39.method2683(arg0.field747).field905;
            if (var2 == -1) {
                arg0.field747 = -1;
            } else {
                class38 var3 = class38.method1866(var2);
                if (var3 == null || var3.field886 == null) {
                    arg0.field747 = -1;
                } else {
                    arg0.field749++;
                    if (arg0.field748 < var3.field886.length && arg0.field749 > var3.field881[arg0.field748]) {
                        arg0.field749 = 1;
                        arg0.field748++;
                        method476(var3, arg0.field748, arg0.field746, arg0.field713);
                    }
                    if (arg0.field748 >= var3.field886.length && (arg0.field748 < 0 || arg0.field748 >= var3.field886.length)) {
                        arg0.field747 = -1;
                    }
                }
            }
        }
        if (arg0.field742 != -1 && arg0.field745 <= 1) {
            class38 var4 = class38.method1866(arg0.field742);
            if (var4.field897 == 1 && arg0.field769 > 0 && arg0.field756 <= field262 && arg0.field757 < field262) {
                arg0.field745 = 1;
                return;
            }
        }
        if (arg0.field742 != -1 && arg0.field745 == 0) {
            class38 var5 = class38.method1866(arg0.field742);
            if (var5 == null || var5.field886 == null) {
                arg0.field742 = -1;
            } else {
                arg0.field772++;
                if (arg0.field743 < var5.field886.length && arg0.field772 > var5.field881[arg0.field743]) {
                    arg0.field772 = 1;
                    arg0.field743++;
                    method476(var5, arg0.field743, arg0.field746, arg0.field713);
                }
                if (arg0.field743 >= var5.field886.length) {
                    arg0.field743 -= var5.field890;
                    arg0.field738++;
                    if (arg0.field738 >= var5.field896) {
                        arg0.field742 = -1;
                    } else if (arg0.field743 >= 0 && arg0.field743 < var5.field886.length) {
                        method476(var5, arg0.field743, arg0.field746, arg0.field713);
                    } else {
                        arg0.field742 = -1;
                    }
                }
                arg0.field727 = var5.field883;
            }
        }
        if (arg0.field745 > 0) {
            arg0.field745--;
        }
    }

    @ObfuscatedName("ct.ab(Lk;III)V")
    public static void method1853(class3 arg0, int arg1, int arg2) {
        if (arg0.field742 == arg1 && arg1 != -1) {
            int var3 = class38.method1866(arg1).field899;
            if (var3 == 1) {
                arg0.field743 = 0;
                arg0.field772 = 0;
                arg0.field745 = arg2;
                arg0.field738 = 0;
            }
            if (var3 == 2) {
                arg0.field738 = 0;
            }
        } else if (arg1 == -1 || arg0.field742 == -1 || class38.method1866(arg1).field887 >= class38.method1866(arg0.field742).field887) {
            arg0.field742 = arg1;
            arg0.field743 = 0;
            arg0.field772 = 0;
            arg0.field745 = arg2;
            arg0.field738 = 0;
            arg0.field769 = arg0.field764;
        }
    }

    @ObfuscatedName("r.ag(Ljava/lang/String;ZI)V")
    public static final void method97(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1103.method3300(arg0, 250);
        int var6 = Statics.field1103.method3301(arg0, 250) * 13;
        class73.method1514(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1516(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1103.method3306(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method474(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method687(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1523.getGraphics();
            Statics.field1822.method1332(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1523.repaint();
        }
    }

    @ObfuscatedName("bi.ax(IIIII)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3) {
        class73.method1532(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1771();
        field450++;
        method79(class29.field671);
        boolean var4 = false;
        if (field386 >= 0) {
            for (int var5 = 0; var5 < field373; var5++) {
                if (field386 == field374[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method79(class29.field677);
        }
        method84(true);
        method79(var4 ? class29.field672 : class29.field670);
        method84(false);
        method1368();
        for (class26 var6 = (class26) field441.method3234(); var6 != null; var6 = (class26) field441.method3209()) {
            if (Statics.field72 != var6.field620 || var6.field621) {
                var6.method3268();
            } else if (field262 >= var6.field613) {
                var6.method498(field443);
                if (var6.field621) {
                    var6.method3268();
                } else {
                    Statics.field56.method1610(var6.field620, var6.field615, var6.field616, var6.field624, 60, var6, 0, -1, false);
                }
            }
        }
        if (!field495) {
            int var7 = field330;
            if (field344 / 256 > var7) {
                var7 = field344 / 256;
            }
            if (field496[4] && field498[4] + 128 > var7) {
                var7 = field498[4] + 128;
            }
            int var8 = field416 + field289 & 0x7FF;
            int var9 = Statics.field15;
            int var10 = method120(Statics.field1561.field746, Statics.field1561.field713, Statics.field72) - 50;
            int var11 = Statics.field1345;
            int var12 = var7 * 3 + 600;
            int var13 = 2048 - var7 & 0x7FF;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 0;
            int var16 = 0;
            int var17 = var12;
            if (var13 != 0) {
                int var18 = class84.field1472[var13];
                int var19 = class84.field1449[var13];
                int var20 = var16 * var19 - var12 * var18 >> 16;
                var17 = var16 * var18 + var12 * var19 >> 16;
                var16 = var20;
            }
            if (var14 != 0) {
                int var21 = class84.field1472[var14];
                int var22 = class84.field1449[var14];
                int var23 = var15 * var22 + var17 * var21 >> 16;
                var17 = var17 * var22 - var15 * var21 >> 16;
                var15 = var23;
            }
            Statics.field155 = var9 - var15;
            Statics.field561 = var10 - var16;
            Statics.field1663 = var11 - var17;
            Statics.field1488 = var7;
            Statics.field1339 = var8;
        }
        int var36;
        if (field495) {
            int var37;
            if (Statics.field559.field141) {
                var37 = Statics.field72;
            } else {
                int var38 = method120(Statics.field155, Statics.field1663, Statics.field72);
                if (var38 - Statics.field561 >= 800 || (class6.field82[Statics.field72][Statics.field155 >> 7][Statics.field1663 >> 7] & 0x4) == 0) {
                    var37 = 3;
                } else {
                    var37 = Statics.field72;
                }
            }
            var36 = var37;
        } else {
            int var24;
            if (Statics.field559.field141) {
                var24 = Statics.field72;
            } else {
                int var25 = 3;
                if (Statics.field1488 < 310) {
                    int var26 = Statics.field155 >> 7;
                    int var27 = Statics.field1663 >> 7;
                    int var28 = Statics.field1561.field746 >> 7;
                    int var29 = Statics.field1561.field713 >> 7;
                    if ((class6.field82[Statics.field72][var26][var27] & 0x4) != 0) {
                        var25 = Statics.field72;
                    }
                    int var30;
                    if (var28 > var26) {
                        var30 = var28 - var26;
                    } else {
                        var30 = var26 - var28;
                    }
                    int var31;
                    if (var29 > var27) {
                        var31 = var29 - var27;
                    } else {
                        var31 = var27 - var29;
                    }
                    if (var30 > var31) {
                        int var32 = var31 * 65536 / var30;
                        int var33 = 32768;
                        while (var26 != var28) {
                            if (var26 < var28) {
                                var26++;
                            } else if (var26 > var28) {
                                var26--;
                            }
                            if ((class6.field82[Statics.field72][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field72;
                            }
                            var33 += var32;
                            if (var33 >= 65536) {
                                var33 -= 65536;
                                if (var27 < var29) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                if ((class6.field82[Statics.field72][var26][var27] & 0x4) != 0) {
                                    var25 = Statics.field72;
                                }
                            }
                        }
                    } else {
                        int var34 = var30 * 65536 / var31;
                        int var35 = 32768;
                        while (var27 != var29) {
                            if (var27 < var29) {
                                var27++;
                            } else if (var27 > var29) {
                                var27--;
                            }
                            if ((class6.field82[Statics.field72][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field72;
                            }
                            var35 += var34;
                            if (var35 >= 65536) {
                                var35 -= 65536;
                                if (var26 < var28) {
                                    var26++;
                                } else if (var26 > var28) {
                                    var26--;
                                }
                                if ((class6.field82[Statics.field72][var26][var27] & 0x4) != 0) {
                                    var25 = Statics.field72;
                                }
                            }
                        }
                    }
                }
                if ((class6.field82[Statics.field72][Statics.field1561.field746 >> 7][Statics.field1561.field713 >> 7] & 0x4) != 0) {
                    var25 = Statics.field72;
                }
                var24 = var25;
            }
            var36 = var24;
        }
        int var39 = Statics.field155;
        int var40 = Statics.field561;
        int var41 = Statics.field1663;
        int var42 = Statics.field1488;
        int var43 = Statics.field1339;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field496[var44]) {
                int var45 = (int) (Math.random() * (double) (field397[var44] * 2 + 1) - (double) field397[var44] + Math.sin((double) field499[var44] / 100.0D * (double) field352[var44]) * (double) field498[var44]);
                if (var44 == 0) {
                    Statics.field155 += var45;
                }
                if (var44 == 1) {
                    Statics.field561 += var45;
                }
                if (var44 == 2) {
                    Statics.field1663 += var45;
                }
                if (var44 == 3) {
                    Statics.field1339 = Statics.field1339 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field1488 += var45;
                    if (Statics.field1488 < 128) {
                        Statics.field1488 = 128;
                    }
                    if (Statics.field1488 > 383) {
                        Statics.field1488 = 383;
                    }
                }
            }
        }
        int var46 = class127.field2005;
        int var47 = class127.field2006;
        if (class127.field2011 != 0) {
            var46 = class127.field2013;
            var47 = class127.field2015;
        }
        if (var46 >= arg0 && var46 < arg0 + arg2 && var47 >= arg1 && var47 < arg1 + arg3) {
            class98.field1713 = true;
            class98.field1760 = 0;
            class98.field1758 = var46 - arg0;
            class98.field1759 = var47 - arg1;
        } else {
            class98.field1713 = false;
            class98.field1760 = 0;
        }
        method157();
        class73.method1514(arg0, arg1, arg2, arg3, 0);
        method157();
        Statics.field56.method1637(Statics.field155, Statics.field561, Statics.field1663, Statics.field1488, Statics.field1339, var36);
        method157();
        Statics.field56.method1683();
        field339 = 0;
        boolean var48 = false;
        int var49 = -1;
        for (int var50 = -1; var50 < field482 + field373; var50++) {
            class33 var51;
            if (var50 == -1) {
                var51 = Statics.field1561;
            } else if (var50 < field373) {
                var51 = field372[field374[var50]];
                if (field386 == field374[var50]) {
                    var48 = true;
                    var49 = var50;
                    continue;
                }
            } else {
                var51 = field291[field293[var50 - field373]];
            }
            method123(var51, var50, arg0, arg1, arg2, arg3);
        }
        if (var48) {
            method123(field372[field386], var49, arg0, arg1, arg2, arg3);
        }
        for (int var52 = 0; var52 < field339; var52++) {
            int var53 = field347[var52];
            int var54 = field348[var52];
            int var55 = field345[var52];
            int var56 = field349[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field348[var58] - field349[var58] && var54 - var56 < field348[var58] + 2 && var53 - var55 < field347[var58] + field345[var58] && var53 + var55 > field347[var58] - field345[var58] && field348[var58] - field349[var58] < var54) {
                        var54 = field348[var58] - field349[var58];
                        var57 = true;
                    }
                }
            }
            field357 = field347[var52];
            field358 = field348[var52] = var54;
            String var59 = field354[var52];
            if (field297 == 0) {
                int var60 = 16776960;
                if (field351[var52] < 6) {
                    var60 = field337[field351[var52]];
                }
                if (field351[var52] == 6) {
                    var60 = field450 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field351[var52] == 7) {
                    var60 = field450 % 20 < 10 ? 255 : 65535;
                }
                if (field351[var52] == 8) {
                    var60 = field450 % 20 < 10 ? 45056 : 8454016;
                }
                if (field351[var52] == 9) {
                    int var61 = 150 - field353[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field351[var52] == 10) {
                    int var62 = 150 - field353[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field351[var52] == 11) {
                    int var63 = 150 - field353[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field379[var52] == 0) {
                    Statics.field1443.method3305(var59, field357 + arg0, field358 + arg1, var60, 0);
                }
                if (field379[var52] == 1) {
                    Statics.field1443.method3307(var59, field357 + arg0, field358 + arg1, var60, 0, field450);
                }
                if (field379[var52] == 2) {
                    Statics.field1443.method3308(var59, field357 + arg0, field358 + arg1, var60, 0, field450);
                }
                if (field379[var52] == 3) {
                    Statics.field1443.method3325(var59, field357 + arg0, field358 + arg1, var60, 0, field450, 150 - field353[var52]);
                }
                if (field379[var52] == 4) {
                    int var64 = (150 - field353[var52]) * (Statics.field1443.method3298(var59) + 100) / 150;
                    class73.method1509(field357 + arg0 - 50, arg1, field357 + arg0 + 50, arg1 + arg3);
                    Statics.field1443.method3303(var59, field357 + arg0 + 50 - var64, field358 + arg1, var60, 0);
                    class73.method1532(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field379[var52] == 5) {
                    int var65 = 150 - field353[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class73.method1509(arg0, field358 + arg1 - Statics.field1443.field2871 - 1, arg0 + arg2, field358 + arg1 + 5);
                    Statics.field1443.method3305(var59, field357 + arg0, field358 + arg1 + var66, var60, 0);
                    class73.method1532(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1443.method3305(var59, field357 + arg0, field358 + arg1, 16776960, 0);
            }
        }
        if (field317 == 2) {
            method1949((field506 - Statics.field966 << 7) + field277, (field275 - Statics.field1047 << 7) + field263, field280 * 2);
            if (field357 > -1 && field262 % 20 < 10) {
                Statics.field181[0].method1405(field357 + arg0 - 12, field358 + arg1 - 28);
            }
        }
        ((class88) Statics.field1457).method1858(field443);
        if (field362 == 1) {
            Statics.field770[field361 / 100].method1405(field359 - 8, field360 - 8);
        }
        if (field362 == 2) {
            Statics.field770[field361 / 100 + 4].method1405(field359 - 8, field360 - 8);
        }
        field371 = 0;
        int var67 = (Statics.field1561.field746 >> 7) + Statics.field966;
        int var68 = (Statics.field1561.field713 >> 7) + Statics.field1047;
        if (var67 >= 3053 && var67 <= 3156 && var68 >= 3056 && var68 <= 3136) {
            field371 = 1;
        }
        if (var67 >= 3072 && var67 <= 3118 && var68 >= 9492 && var68 <= 9535) {
            field371 = 1;
        }
        if (field371 == 1 && var67 >= 3139 && var67 <= 3199 && var68 >= 3008 && var68 <= 3062) {
            field371 = 0;
        }
        if (field269) {
            int var69 = arg0 + 512 - 5;
            int var70 = arg1 + 20;
            Statics.field1103.method3343("Fps:" + field2057, var69, var70, 16776960, -1);
            int var77 = var70 + 15;
            Runtime var71 = Runtime.getRuntime();
            int var72 = (int) ((var71.totalMemory() - var71.freeMemory()) / 1024L);
            int var73 = 16776960;
            if (var72 > 32768 && field257) {
                var73 = 16711680;
            }
            if (var72 > 65536 && !field257) {
                var73 = 16711680;
            }
            Statics.field1103.method3343("Mem:" + var72 + "k", var69, var77, var73, -1);
            var70 = var77 + 15;
        }
        Statics.field155 = var39;
        Statics.field561 = var40;
        Statics.field1663 = var41;
        Statics.field1488 = var42;
        Statics.field1339 = var43;
        if (field261) {
            byte var74 = 0;
            int var75 = class149.field2480 + class149.field2467 + var74;
            if (var75 == 0) {
                field261 = false;
            }
        }
        if (field261) {
            class73.method1514(arg0, arg1, arg2, arg3, 0);
            method97(class142.field2267, false);
        }
    }

    @ObfuscatedName("a.af(Laq;I)V")
    public static final void method79(class29 arg0) {
        if (Statics.field1561.field746 >> 7 == field481 && Statics.field1561.field713 >> 7 == field318) {
            field481 = 0;
        }
        int var1 = field373;
        if (class29.field671 == arg0 || class29.field677 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field671 == arg0) {
                var3 = Statics.field1561;
                var4 = 33538048;
            } else if (class29.field677 == arg0) {
                var3 = field372[field386];
                var4 = field386 << 14;
            } else {
                var3 = field372[field374[var2]];
                var4 = field374[var2] << 14;
                if (class29.field672 == arg0 && field386 == field374[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method20()) {
                var3.field54 = false;
                if ((field257 && field373 > 50 || field373 > 200) && class29.field671 != arg0 && var3.field751 == var3.field739) {
                    var3.field54 = true;
                }
                int var5 = var3.field746 >> 7;
                int var6 = var3.field713 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field49 == null || field262 < var3.field57 || field262 >= var3.field45) {
                        if ((var3.field746 & 0x7F) == 64 && (var3.field713 & 0x7F) == 64) {
                            if (field450 == field355[var5][var6]) {
                                continue;
                            }
                            field355[var5][var6] = field450;
                        }
                        var3.field43 = method120(var3.field746, var3.field713, Statics.field72);
                        Statics.field56.method1610(Statics.field72, var3.field746, var3.field713, var3.field43, 60, var3, var3.field714, var4, var3.field727);
                    } else {
                        var3.field54 = false;
                        var3.field43 = method120(var3.field746, var3.field713, Statics.field72);
                        Statics.field56.method1641(Statics.field72, var3.field746, var3.field713, var3.field43, 60, var3, var3.field714, var4, var3.field50, var3.field51, var3.field52, var3.field53);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.ao(ZI)V")
    public static final void method84(boolean arg0) {
        for (int var1 = 0; var1 < field482; var1++) {
            class30 var2 = field291[field293[var1]];
            int var3 = (field293[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field678.field799 == arg0 && var2.field678.method592()) {
                int var4 = var2.field746 >> 7;
                int var5 = var2.field713 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field716 == 1 && (var2.field746 & 0x7F) == 64 && (var2.field713 & 0x7F) == 64) {
                        if (field450 == field355[var4][var5]) {
                            continue;
                        }
                        field355[var4][var5] = field450;
                    }
                    if (!var2.field678.field815) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field56.method1610(Statics.field72, var2.field746, var2.field713, method120(var2.field746 + (var2.field716 * 64 - 64), var2.field713 + (var2.field716 * 64 - 64), Statics.field72), var2.field716 * 64 - 64 + 60, var2, var2.field714, var3, var2.field727);
                }
            }
        }
    }

    @ObfuscatedName("bi.ac(I)V")
    public static final void method1368() {
        for (class7 var0 = (class7) field389.method3234(); var0 != null; var0 = (class7) field389.method3209()) {
            if (Statics.field72 != var0.field99 || field262 > var0.field108) {
                var0.method3268();
            } else if (field262 >= var0.field107) {
                if (var0.field103 > 0) {
                    class30 var1 = field291[var0.field103 - 1];
                    if (var1 != null && var1.field746 >= 0 && var1.field746 < 13312 && var1.field713 >= 0 && var1.field713 < 13312) {
                        var0.method77(var1.field746, var1.field713, method120(var1.field746, var1.field713, var0.field99) - var0.field121, field262);
                    }
                }
                if (var0.field103 < 0) {
                    int var2 = -var0.field103 - 1;
                    class3 var3;
                    if (field434 == var2) {
                        var3 = Statics.field1561;
                    } else {
                        var3 = field372[var2];
                    }
                    if (var3 != null && var3.field746 >= 0 && var3.field746 < 13312 && var3.field713 >= 0 && var3.field713 < 13312) {
                        var0.method77(var3.field746, var3.field713, method120(var3.field746, var3.field713, var0.field99) - var0.field121, field262);
                    }
                }
                var0.method75(field443);
                Statics.field56.method1610(Statics.field72, (int) var0.field112, (int) var0.field104, (int) var0.field124, 60, var0, var0.field118, -1, false);
            }
        }
    }

    @ObfuscatedName("f.aj(Lai;IIIIII)V")
    public static final void method123(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field678;
            if (var6.field812 != null) {
                var6 = var6.method617();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field373) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field39 != -1 || var8.field59 != -1) {
                method133(arg0, arg0.field744 + 15);
                if (field357 > -1) {
                    if (var8.field39 != -1) {
                        Statics.field2108[var8.field39].method1405(field357 + arg2 - 12, field358 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field59 != -1) {
                        Statics.field1697[var8.field59].method1405(field357 + arg2 - 12, field358 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field317 == 10 && field273 == field374[arg1]) {
                method133(arg0, arg0.field744 + 15);
                if (field357 > -1) {
                    Statics.field181[1].method1405(field357 + arg2 - 12, field358 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field678;
            if (var9.field812 != null) {
                var9 = var9.method617();
            }
            if (var9.field788 >= 0 && var9.field788 < Statics.field1697.length) {
                method133(arg0, arg0.field744 + 15);
                if (field357 > -1) {
                    Statics.field1697[var9.field788].method1405(field357 + arg2 - 12, field358 + arg3 - 30);
                }
            }
            if (field317 == 1 && field272 == field293[arg1 - field373] && field262 % 20 < 10) {
                method133(arg0, arg0.field744 + 15);
                if (field357 > -1) {
                    Statics.field181[0].method1405(field357 + arg2 - 12, field358 + arg3 - 28);
                }
            }
        }
        if (arg0.field725 != null && (arg1 >= field373 || field466 == 4 || !arg0.field726 && (field466 == 0 || field466 == 3 || field466 == 1 && method8(((class3) arg0).field37, false)))) {
            method133(arg0, arg0.field744);
            if (field357 > -1 && field339 < field346) {
                field345[field339] = Statics.field1443.method3298(arg0.field725) / 2;
                field349[field339] = Statics.field1443.field2871;
                field347[field339] = field357;
                field348[field339] = field358;
                field351[field339] = arg0.field740;
                field379[field339] = arg0.field729;
                field353[field339] = arg0.field715;
                field354[field339] = arg0.field725;
                field339++;
            }
        }
        if (arg0.field733 > field262) {
            method133(arg0, arg0.field744 + 15);
            if (field357 > -1) {
                int var10 = arg0.field762 * 30 / arg0.field735;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field762 > 0) {
                    var10 = 1;
                }
                class73.method1514(field357 + arg2 - 15, field358 + arg3 - 3, var10, 5, 65280);
                class73.method1514(field357 + arg2 - 15 + var10, field358 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field732[var11] > field262) {
                method133(arg0, arg0.field744 / 2);
                if (field357 > -1) {
                    if (var11 == 1) {
                        field358 -= 20;
                    }
                    if (var11 == 2) {
                        field357 -= 15;
                        field358 -= 10;
                    }
                    if (var11 == 3) {
                        field357 += 15;
                        field358 -= 10;
                    }
                    Statics.field235[arg0.field731[var11]].method1405(field357 + arg2 - 12, field358 + arg3 - 12);
                    Statics.field64.method3305(Integer.toString(arg0.field730[var11]), field357 + arg2 - 1, field358 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("p.ap(Lai;IB)V")
    public static final void method133(class33 arg0, int arg1) {
        method1949(arg0.field746, arg0.field713, arg1);
    }

    @ObfuscatedName("cj.ae(IIII)V")
    public static final void method1949(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field357 = -1;
            field358 = -1;
            return;
        }
        int var3 = method120(arg0, arg1, Statics.field72) - arg2;
        int var4 = arg0 - Statics.field155;
        int var5 = var3 - Statics.field561;
        int var6 = arg1 - Statics.field1663;
        int var7 = class84.field1472[Statics.field1488];
        int var8 = class84.field1449[Statics.field1488];
        int var9 = class84.field1472[Statics.field1339];
        int var10 = class84.field1449[Statics.field1339];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field357 = (var11 << 9) / var15 + 256;
            field358 = (var14 << 9) / var15 + 167;
        } else {
            field357 = -1;
            field358 = -1;
        }
    }

    @ObfuscatedName("c.at(IIIB)I")
    public static final int method120(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field85[var5][var3][var4] + class6.field85[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field85[var5][var3][var4 + 1] + class6.field85[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aw.as(ZB)V")
    public static final void method885(boolean arg0) {
        field313 = arg0;
        if (!field313) {
            int var1 = field296.method2140();
            int var2 = field296.method2140();
            int var3 = (field427 - field296.field1854) / 16;
            Statics.field1483 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1483[var4][var5] = field296.method2151();
                }
            }
            int var6 = field296.method2109();
            int var7 = field296.method2140();
            int var8 = field296.method2140();
            Statics.field680 = new int[var3];
            Statics.field30 = new int[var3];
            Statics.field1869 = new int[var3];
            Statics.field2148 = new byte[var3][];
            Statics.field1825 = new byte[var3][];
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
                        Statics.field680[var10] = var13;
                        Statics.field30[var10] = Statics.field705.method2771("m" + var11 + "_" + var12);
                        Statics.field1869[var10] = Statics.field705.method2771("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2687(var1, var2, var6, var7, var8);
            return;
        }
        int var14 = field296.method2109();
        int var15 = field296.method2140();
        int var16 = field296.method2094();
        field296.method2341();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field296.method2339(1);
                    if (var20 == 1) {
                        field480[var17][var18][var19] = field296.method2339(26);
                    } else {
                        field480[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field296.method2334();
        int var21 = (field427 - field296.field1854) / 16;
        Statics.field1483 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field1483[var22][var23] = field296.method2149();
            }
        }
        int var24 = field296.method2140();
        int var25 = field296.method2094();
        Statics.field680 = new int[var21];
        Statics.field30 = new int[var21];
        Statics.field1869 = new int[var21];
        Statics.field2148 = new byte[var21][];
        Statics.field1825 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field480[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field680[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field680[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field30[var26] = Statics.field705.method2771("m" + var35 + "_" + var36);
                            Statics.field1869[var26] = Statics.field705.method2771("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2687(var16, var24, var14, var15, var25);
    }

    @ObfuscatedName("ec.aw(IIIIII)V")
    public static final void method2687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field21 == arg0 && Statics.field2834 == arg1 && field335 == arg2 || !field257) {
            return;
        }
        Statics.field21 = arg0;
        Statics.field2834 = arg1;
        field335 = arg2;
        if (!field257) {
            field335 = 0;
        }
        method547(25);
        method97(class142.field2267, true);
        int var5 = Statics.field966;
        int var6 = Statics.field1047;
        Statics.field966 = (arg0 - 6) * 8;
        Statics.field1047 = (arg1 - 6) * 8;
        int var7 = Statics.field966 - var5;
        int var8 = Statics.field1047 - var6;
        int var9 = Statics.field966;
        int var10 = Statics.field1047;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field291[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field766[var13] -= var7;
                    var12.field712[var13] -= var8;
                }
                var12.field746 -= var7 * 128;
                var12.field713 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field372[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field766[var16] -= var7;
                    var15.field712[var16] -= var8;
                }
                var15.field746 -= var7 * 128;
                var15.field713 -= var8 * 128;
            }
        }
        Statics.field72 = arg2;
        Statics.field1561.method566(arg3, arg4, false);
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
        for (class15 var28 = (class15) field385.method3234(); var28 != null; var28 = (class15) field385.method3209()) {
            var28.field210 -= var7;
            var28.field211 -= var8;
            if (var28.field210 < 0 || var28.field211 < 0 || var28.field210 >= 104 || var28.field211 >= 104) {
                var28.method3268();
            }
        }
        if (field481 != 0) {
            field481 -= var7;
            field318 -= var8;
        }
        field489 = 0;
        field495 = false;
        field476 = -1;
        field441.method3201();
        field389.method3201();
    }

    @ObfuscatedName("c.ak(ZI)V")
    public static final void method119(boolean arg0) {
        method157();
        field300++;
        if (field300 < 50 && !arg0) {
            return;
        }
        field300 = 0;
        if (field305 || Statics.field1487 == null) {
            return;
        }
        field294.method2331(73);
        try {
            Statics.field1487.method2566(field294.field1856, 0, field294.field1854);
            field294.field1854 = 0;
        } catch (IOException var2) {
            field305 = true;
        }
    }

    @ObfuscatedName("ap.az(I)V")
    public static final void method784() {
        method119(false);
        field307 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2148.length; var1++) {
            if (Statics.field30[var1] != -1 && Statics.field2148[var1] == null) {
                Statics.field2148[var1] = Statics.field705.method2704(Statics.field30[var1], 0);
                if (Statics.field2148[var1] == null) {
                    var0 = false;
                    field307++;
                }
            }
            if (Statics.field1869[var1] != -1 && Statics.field1825[var1] == null) {
                Statics.field1825[var1] = Statics.field705.method2705(Statics.field1869[var1], 0, Statics.field1483[var1]);
                if (Statics.field1825[var1] == null) {
                    var0 = false;
                    field307++;
                }
            }
        }
        if (!var0) {
            field350 = 1;
            return;
        }
        field338 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2148.length; var3++) {
            byte[] var4 = Statics.field1825[var3];
            if (var4 != null) {
                int var5 = (Statics.field680[var3] >> 8) * 64 - Statics.field966;
                int var6 = (Statics.field680[var3] & 0xFF) * 64 - Statics.field1047;
                if (field313) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class107 var9 = new class107(var4);
                int var10 = -1;
                label1099: while (true) {
                    int var11 = var9.method2122();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2122();
                            if (var16 == 0) {
                                continue label1099;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2109() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class36 var22 = class36.method6(var10);
                                if (var19 != 22 || !field257 || var22.field830 != 0 || var22.field832 == 1 || var22.field857) {
                                    if (!var22.method623()) {
                                        field338++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2122();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2109();
                    }
                }
            }
        }
        if (!var2) {
            field350 = 2;
            return;
        }
        if (field350 != 0) {
            method97(class142.field2267 + class2.field36 + class2.field24 + 100 + "%" + class2.field25, true);
        }
        method157();
        method429();
        method157();
        Statics.field56.method1599();
        method157();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field266[var23].method3425();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field82[var24][var25][var26] = 0;
                }
            }
        }
        method157();
        class6.field83 = 99;
        Statics.field595 = new byte[4][104][104];
        Statics.field84 = new byte[4][104][104];
        Statics.field1932 = new byte[4][104][104];
        Statics.field89 = new byte[4][104][104];
        Statics.field2109 = new int[4][105][105];
        Statics.field2928 = new byte[4][105][105];
        Statics.field594 = new int[105][105];
        Statics.field2638 = new int[104];
        Statics.field1049 = new int[104];
        Statics.field984 = new int[104];
        Statics.field2426 = new int[104];
        Statics.field1276 = new int[104];
        int var27 = Statics.field2148.length;
        class20.method2897();
        method119(true);
        if (!field313) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field680[var28] >> 8) * 64 - Statics.field966;
                int var30 = (Statics.field680[var28] & 0xFF) * 64 - Statics.field1047;
                byte[] var31 = Statics.field2148[var28];
                if (var31 != null) {
                    method157();
                    class6.method2324(var31, var29, var30, Statics.field21 * 8 - 48, Statics.field2834 * 8 - 48, field266);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field680[var32] >> 8) * 64 - Statics.field966;
                int var34 = (Statics.field680[var32] & 0xFF) * 64 - Statics.field1047;
                byte[] var35 = Statics.field2148[var32];
                if (var35 == null && Statics.field2834 < 800) {
                    method157();
                    class6.method143(var33, var34, 64, 64);
                }
            }
            method119(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field1825[var36];
                if (var37 != null) {
                    int var38 = (Statics.field680[var36] >> 8) * 64 - Statics.field966;
                    int var39 = (Statics.field680[var36] & 0xFF) * 64 - Statics.field1047;
                    method157();
                    class79 var40 = Statics.field56;
                    class194[] var41 = field266;
                    class107 var42 = new class107(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method2122();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method2122();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method2109();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class6.field82[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class194 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class6.method459(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field313) {
            for (int var57 = 0; var57 < 4; var57++) {
                method157();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field480[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field680.length; var67++) {
                                if (Statics.field680[var67] == var66 && Statics.field2148[var67] != null) {
                                    byte[] var68 = Statics.field2148[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class194[] var73 = field266;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field2913[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class107 var76 = new class107(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    int var83 = var78 & 0x7;
                                                    int var84 = var79 & 0x7;
                                                    int var86 = var63 & 0x3;
                                                    int var87;
                                                    if (var86 == 0) {
                                                        var87 = var83;
                                                    } else if (var86 == 1) {
                                                        var87 = var84;
                                                    } else if (var86 == 2) {
                                                        var87 = 7 - var83;
                                                    } else {
                                                        var87 = 7 - var84;
                                                    }
                                                    int var90 = var69 + var87;
                                                    int var92 = var78 & 0x7;
                                                    int var93 = var79 & 0x7;
                                                    int var95 = var63 & 0x3;
                                                    int var96;
                                                    if (var95 == 0) {
                                                        var96 = var93;
                                                    } else if (var95 == 1) {
                                                        var96 = 7 - var92;
                                                    } else if (var95 == 2) {
                                                        var96 = 7 - var93;
                                                    } else {
                                                        var96 = var92;
                                                    }
                                                    class6.method160(var76, var57, var90, var70 + var96, 0, 0, var63);
                                                } else {
                                                    class6.method160(var76, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            class6.method464(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var97 = 0; var97 < 13; var97++) {
                for (int var98 = 0; var98 < 13; var98++) {
                    int var99 = field480[0][var97][var98];
                    if (var99 == -1) {
                        class6.method143(var97 * 8, var98 * 8, 8, 8);
                    }
                }
            }
            method119(true);
            for (int var100 = 0; var100 < 4; var100++) {
                method157();
                for (int var101 = 0; var101 < 13; var101++) {
                    for (int var102 = 0; var102 < 13; var102++) {
                        int var103 = field480[var100][var101][var102];
                        if (var103 != -1) {
                            int var104 = var103 >> 24 & 0x3;
                            int var105 = var103 >> 1 & 0x3;
                            int var106 = var103 >> 14 & 0x3FF;
                            int var107 = var103 >> 3 & 0x7FF;
                            int var108 = (var106 / 8 << 8) + var107 / 8;
                            for (int var109 = 0; var109 < Statics.field680.length; var109++) {
                                if (Statics.field680[var109] == var108 && Statics.field1825[var109] != null) {
                                    class6.method130(Statics.field1825[var109], var100, var101 * 8, var102 * 8, var104, (var106 & 0x7) * 8, (var107 & 0x7) * 8, var105, Statics.field56, field266);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method119(true);
        method429();
        method157();
        class79 var110 = Statics.field56;
        class194[] var111 = field266;
        for (int var112 = 0; var112 < 4; var112++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class6.field82[var112][var113][var114] & 0x1) == 1) {
                        int var115 = var112;
                        if ((class6.field82[1][var113][var114] & 0x2) == 2) {
                            var115 = var112 - 1;
                        }
                        if (var115 >= 0) {
                            var111[var115].method3428(var113, var114);
                        }
                    }
                }
            }
        }
        class6.field81 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field81 < -8) {
            class6.field81 = -8;
        }
        if (class6.field81 > 8) {
            class6.field81 = 8;
        }
        class6.field94 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field94 < -16) {
            class6.field94 = -16;
        }
        if (class6.field94 > 16) {
            class6.field94 = 16;
        }
        for (int var116 = 0; var116 < 4; var116++) {
            byte[][] var117 = Statics.field2928[var116];
            int var118 = (int) Math.sqrt(5100.0D);
            int var119 = var118 * 768 >> 8;
            for (int var120 = 1; var120 < 103; var120++) {
                for (int var121 = 1; var121 < 103; var121++) {
                    int var122 = class6.field85[var116][var121 + 1][var120] - class6.field85[var116][var121 - 1][var120];
                    int var123 = class6.field85[var116][var121][var120 + 1] - class6.field85[var116][var121][var120 - 1];
                    int var124 = (int) Math.sqrt((double) (var123 * var123 + var122 * var122 + 65536));
                    int var125 = (var122 << 8) / var124;
                    int var126 = 65536 / var124;
                    int var127 = (var123 << 8) / var124;
                    int var128 = (var127 * -50 + var125 * -50 + var126 * -10) / var119 + 96;
                    int var129 = (var117[var121][var120] >> 1) + (var117[var121][var120 + 1] >> 3) + (var117[var121][var120 - 1] >> 2) + (var117[var121 - 1][var120] >> 2) + (var117[var121 + 1][var120] >> 3);
                    Statics.field594[var121][var120] = var128 - var129;
                }
            }
            for (int var130 = 0; var130 < 104; var130++) {
                Statics.field2638[var130] = 0;
                Statics.field1049[var130] = 0;
                Statics.field984[var130] = 0;
                Statics.field2426[var130] = 0;
                Statics.field1276[var130] = 0;
            }
            for (int var131 = -5; var131 < 109; var131++) {
                for (int var132 = 0; var132 < 104; var132++) {
                    int var133 = var131 + 5;
                    int var10002;
                    if (var133 >= 0 && var133 < 104) {
                        int var134 = Statics.field595[var116][var133][var132] & 0xFF;
                        if (var134 > 0) {
                            int var135 = var134 - 1;
                            class37 var136 = (class37) class37.field871.method3145((long) var135);
                            class37 var137;
                            if (var136 == null) {
                                byte[] var138 = Statics.field870.method2704(1, var135);
                                class37 var139 = new class37();
                                if (var138 != null) {
                                    var139.method665(new class107(var138), var135);
                                }
                                var139.method664();
                                class37.field871.method3147(var139, (long) var135);
                                var137 = var139;
                            } else {
                                var137 = var136;
                            }
                            Statics.field2638[var132] += var137.field877;
                            Statics.field1049[var132] += var137.field874;
                            Statics.field984[var132] += var137.field875;
                            Statics.field2426[var132] += var137.field873;
                            var10002 = Statics.field1276[var132]++;
                        }
                    }
                    int var141 = var131 - 5;
                    if (var141 >= 0 && var141 < 104) {
                        int var142 = Statics.field595[var116][var141][var132] & 0xFF;
                        if (var142 > 0) {
                            class37 var143 = Statics.method22(var142 - 1);
                            Statics.field2638[var132] -= var143.field877;
                            Statics.field1049[var132] -= var143.field874;
                            Statics.field984[var132] -= var143.field875;
                            Statics.field2426[var132] -= var143.field873;
                            var10002 = Statics.field1276[var132]--;
                        }
                    }
                }
                if (var131 >= 1 && var131 < 103) {
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    int var148 = 0;
                    for (int var149 = -5; var149 < 109; var149++) {
                        int var150 = var149 + 5;
                        if (var150 >= 0 && var150 < 104) {
                            var144 += Statics.field2638[var150];
                            var145 += Statics.field1049[var150];
                            var146 += Statics.field984[var150];
                            var147 += Statics.field2426[var150];
                            var148 += Statics.field1276[var150];
                        }
                        int var151 = var149 - 5;
                        if (var151 >= 0 && var151 < 104) {
                            var144 -= Statics.field2638[var151];
                            var145 -= Statics.field1049[var151];
                            var146 -= Statics.field984[var151];
                            var147 -= Statics.field2426[var151];
                            var148 -= Statics.field1276[var151];
                        }
                        if (var149 >= 1 && var149 < 103 && (!field257 || (class6.field82[0][var131][var149] & 0x2) != 0 || (class6.field82[var116][var131][var149] & 0x10) == 0 && class6.method2375(var116, var131, var149) == field335)) {
                            if (var116 < class6.field83) {
                                class6.field83 = var116;
                            }
                            int var152 = Statics.field595[var116][var131][var149] & 0xFF;
                            int var153 = Statics.field84[var116][var131][var149] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class6.field85[var116][var131][var149];
                                int var155 = class6.field85[var116][var131 + 1][var149];
                                int var156 = class6.field85[var116][var131 + 1][var149 + 1];
                                int var157 = class6.field85[var116][var131][var149 + 1];
                                int var158 = Statics.field594[var131][var149];
                                int var159 = Statics.field594[var131 + 1][var149];
                                int var160 = Statics.field594[var131 + 1][var149 + 1];
                                int var161 = Statics.field594[var131][var149 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var144 * 256 / var147;
                                    int var165 = var145 / var148;
                                    int var166 = var146 / var148;
                                    var162 = class6.method496(var164, var165, var166);
                                    int var167 = class6.field81 + var164 & 0xFF;
                                    int var168 = class6.field94 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class6.method496(var167, var165, var168);
                                }
                                if (var116 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && Statics.field1932[var116][var131][var149] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0) {
                                        int var170 = var153 - 1;
                                        class41 var171 = (class41) class41.field942.method3145((long) var170);
                                        class41 var172;
                                        if (var171 == null) {
                                            byte[] var173 = Statics.field946.method2704(4, var170);
                                            class41 var174 = new class41();
                                            if (var173 != null) {
                                                var174.method780(new class107(var173), var170);
                                            }
                                            var174.method781();
                                            class41.field942.method3147(var174, (long) var170);
                                            var172 = var174;
                                        } else {
                                            var172 = var171;
                                        }
                                        if (!var172.field938) {
                                            var169 = false;
                                        }
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        Statics.field2109[var116][var131][var149] |= 0x924;
                                    }
                                }
                                int var175 = 0;
                                if (var163 != -1) {
                                    var175 = class84.field1468[class6.method35(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var110.method1604(var116, var131, var149, 0, 0, -1, var154, var155, var156, var157, class6.method35(var162, var158), class6.method35(var162, var159), class6.method35(var162, var160), class6.method35(var162, var161), 0, 0, 0, 0, var175, 0);
                                } else {
                                    int var176 = Statics.field1932[var116][var131][var149] + 1;
                                    byte var177 = Statics.field89[var116][var131][var149];
                                    int var178 = var153 - 1;
                                    class41 var179 = (class41) class41.field942.method3145((long) var178);
                                    class41 var180;
                                    if (var179 == null) {
                                        byte[] var181 = Statics.field946.method2704(4, var178);
                                        class41 var182 = new class41();
                                        if (var181 != null) {
                                            var182.method780(new class107(var181), var178);
                                        }
                                        var182.method781();
                                        class41.field942.method3147(var182, (long) var178);
                                        var180 = var182;
                                    } else {
                                        var180 = var179;
                                    }
                                    int var184 = var180.field940;
                                    int var185;
                                    int var186;
                                    if (var184 >= 0) {
                                        var185 = Statics.field1457.method1846(var184);
                                        var186 = -1;
                                    } else if (var180.field939 == 16711935) {
                                        var186 = -2;
                                        var184 = -1;
                                        var185 = -2;
                                    } else {
                                        var186 = class6.method496(var180.field945, var180.field950, var180.field944);
                                        int var187 = class6.field81 + var180.field945 & 0xFF;
                                        int var188 = class6.field94 + var180.field944;
                                        if (var188 < 0) {
                                            var188 = 0;
                                        } else if (var188 > 255) {
                                            var188 = 255;
                                        }
                                        var185 = class6.method496(var187, var180.field950, var188);
                                    }
                                    int var189 = 0;
                                    if (var185 != -2) {
                                        var189 = class84.field1468[class6.method2040(var185, 96)];
                                    }
                                    if (var180.field943 != -1) {
                                        int var190 = class6.field81 + var180.field947 & 0xFF;
                                        int var191 = class6.field94 + var180.field949;
                                        if (var191 < 0) {
                                            var191 = 0;
                                        } else if (var191 > 255) {
                                            var191 = 255;
                                        }
                                        int var192 = class6.method496(var190, var180.field941, var191);
                                        var189 = class84.field1468[class6.method2040(var192, 96)];
                                    }
                                    var110.method1604(var116, var131, var149, var176, var177, var184, var154, var155, var156, var157, class6.method35(var162, var158), class6.method35(var162, var159), class6.method35(var162, var160), class6.method35(var162, var161), class6.method2040(var186, var158), class6.method2040(var186, var159), class6.method2040(var186, var160), class6.method2040(var186, var161), var175, var189);
                                }
                            }
                        }
                    }
                }
            }
            for (int var193 = 1; var193 < 103; var193++) {
                for (int var194 = 1; var194 < 103; var194++) {
                    var110.method1603(var116, var194, var193, class6.method2375(var116, var194, var193));
                }
            }
            Statics.field595[var116] = (byte[][]) null;
            Statics.field84[var116] = (byte[][]) null;
            Statics.field1932[var116] = (byte[][]) null;
            Statics.field89[var116] = (byte[][]) null;
            Statics.field2928[var116] = (byte[][]) null;
        }
        var110.method1630(-50, -10, -50);
        for (int var195 = 0; var195 < 104; var195++) {
            for (int var196 = 0; var196 < 104; var196++) {
                if ((class6.field82[1][var195][var196] & 0x2) == 2) {
                    var110.method1601(var195, var196);
                }
            }
        }
        int var197 = 1;
        int var198 = 2;
        int var199 = 4;
        for (int var200 = 0; var200 < 4; var200++) {
            if (var200 > 0) {
                var197 <<= 0x3;
                var198 <<= 0x3;
                var199 <<= 0x3;
            }
            for (int var201 = 0; var201 <= var200; var201++) {
                for (int var202 = 0; var202 <= 104; var202++) {
                    for (int var203 = 0; var203 <= 104; var203++) {
                        if ((Statics.field2109[var201][var203][var202] & var197) != 0) {
                            int var204 = var202;
                            int var205 = var202;
                            int var206 = var201;
                            int var207 = var201;
                            while (var204 > 0 && (Statics.field2109[var201][var203][var204 - 1] & var197) != 0) {
                                var204--;
                            }
                            while (var205 < 104 && (Statics.field2109[var201][var203][var205 + 1] & var197) != 0) {
                                var205++;
                            }
                            label669: while (var206 > 0) {
                                for (int var208 = var204; var208 <= var205; var208++) {
                                    if ((Statics.field2109[var206 - 1][var203][var208] & var197) == 0) {
                                        break label669;
                                    }
                                }
                                var206--;
                            }
                            label658: while (var207 < var200) {
                                for (int var209 = var204; var209 <= var205; var209++) {
                                    if ((Statics.field2109[var207 + 1][var203][var209] & var197) == 0) {
                                        break label658;
                                    }
                                }
                                var207++;
                            }
                            int var210 = (var207 + 1 - var206) * (var205 - var204 + 1);
                            if (var210 >= 8) {
                                short var211 = 240;
                                int var212 = class6.field85[var207][var203][var204] - var211;
                                int var213 = class6.field85[var206][var203][var204];
                                class79.method1638(var200, 1, var203 * 128, var203 * 128, var204 * 128, var205 * 128 + 128, var212, var213);
                                for (int var214 = var206; var214 <= var207; var214++) {
                                    for (int var215 = var204; var215 <= var205; var215++) {
                                        Statics.field2109[var214][var203][var215] &= ~var197;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2109[var201][var203][var202] & var198) != 0) {
                            int var216 = var203;
                            int var217 = var203;
                            int var218 = var201;
                            int var219 = var201;
                            while (var216 > 0 && (Statics.field2109[var201][var216 - 1][var202] & var198) != 0) {
                                var216--;
                            }
                            while (var217 < 104 && (Statics.field2109[var201][var217 + 1][var202] & var198) != 0) {
                                var217++;
                            }
                            label722: while (var218 > 0) {
                                for (int var220 = var216; var220 <= var217; var220++) {
                                    if ((Statics.field2109[var218 - 1][var220][var202] & var198) == 0) {
                                        break label722;
                                    }
                                }
                                var218--;
                            }
                            label711: while (var219 < var200) {
                                for (int var221 = var216; var221 <= var217; var221++) {
                                    if ((Statics.field2109[var219 + 1][var221][var202] & var198) == 0) {
                                        break label711;
                                    }
                                }
                                var219++;
                            }
                            int var222 = (var219 + 1 - var218) * (var217 - var216 + 1);
                            if (var222 >= 8) {
                                short var223 = 240;
                                int var224 = class6.field85[var219][var216][var202] - var223;
                                int var225 = class6.field85[var218][var216][var202];
                                class79.method1638(var200, 2, var216 * 128, var217 * 128 + 128, var202 * 128, var202 * 128, var224, var225);
                                for (int var226 = var218; var226 <= var219; var226++) {
                                    for (int var227 = var216; var227 <= var217; var227++) {
                                        Statics.field2109[var226][var227][var202] &= ~var198;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2109[var201][var203][var202] & var199) != 0) {
                            int var228 = var203;
                            int var229 = var203;
                            int var230 = var202;
                            int var231 = var202;
                            while (var230 > 0 && (Statics.field2109[var201][var203][var230 - 1] & var199) != 0) {
                                var230--;
                            }
                            while (var231 < 104 && (Statics.field2109[var201][var203][var231 + 1] & var199) != 0) {
                                var231++;
                            }
                            label775: while (var228 > 0) {
                                for (int var232 = var230; var232 <= var231; var232++) {
                                    if ((Statics.field2109[var201][var228 - 1][var232] & var199) == 0) {
                                        break label775;
                                    }
                                }
                                var228--;
                            }
                            label764: while (var229 < 104) {
                                for (int var233 = var230; var233 <= var231; var233++) {
                                    if ((Statics.field2109[var201][var229 + 1][var233] & var199) == 0) {
                                        break label764;
                                    }
                                }
                                var229++;
                            }
                            if ((var229 - var228 + 1) * (var231 - var230 + 1) >= 4) {
                                int var234 = class6.field85[var201][var228][var230];
                                class79.method1638(var200, 4, var228 * 128, var229 * 128 + 128, var230 * 128, var231 * 128 + 128, var234, var234);
                                for (int var235 = var228; var235 <= var229; var235++) {
                                    for (int var236 = var230; var236 <= var231; var236++) {
                                        Statics.field2109[var201][var235][var236] &= ~var199;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method119(true);
        int var237 = class6.field83;
        if (var237 > Statics.field72) {
            var237 = Statics.field72;
        }
        if (var237 < Statics.field72 - 1) {
            int var238 = Statics.field72 - 1;
        }
        if (field257) {
            Statics.field56.method1600(class6.field83);
        } else {
            Statics.field56.method1600(0);
        }
        for (int var239 = 0; var239 < 104; var239++) {
            for (int var240 = 0; var240 < 104; var240++) {
                method2799(var239, var240);
            }
        }
        method157();
        for (class15 var241 = (class15) field385.method3234(); var241 != null; var241 = (class15) field385.method3209()) {
            if (var241.field212 == -1) {
                var241.field218 = 0;
                method823(var241);
            } else {
                var241.method3268();
            }
        }
        class36.field822.method3141();
        if (Statics.field1479 != null) {
            field294.method2331(245);
            field294.method2232(1057001181);
        }
        if (!field313) {
            int var242 = (Statics.field21 - 6) / 8;
            int var243 = (Statics.field21 + 6) / 8;
            int var244 = (Statics.field2834 - 6) / 8;
            int var245 = (Statics.field2834 + 6) / 8;
            for (int var246 = var242 - 1; var246 <= var243 + 1; var246++) {
                for (int var247 = var244 - 1; var247 <= var245 + 1; var247++) {
                    if (var246 < var242 || var246 > var243 || var247 < var244 || var247 > var245) {
                        Statics.field705.method2749("m" + var246 + "_" + var247);
                        Statics.field705.method2749("l" + var246 + "_" + var247);
                    }
                }
            }
        }
        method547(30);
        method157();
        Statics.field595 = (byte[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field1932 = (byte[][][]) null;
        Statics.field89 = (byte[][][]) null;
        Statics.field2109 = (int[][][]) null;
        Statics.field2928 = (byte[][][]) null;
        Statics.field594 = (int[][]) null;
        Statics.field2638 = null;
        Statics.field1049 = null;
        Statics.field984 = null;
        Statics.field2426 = null;
        Statics.field1276 = null;
        field294.method2331(207);
        class131.method1396();
    }

    @ObfuscatedName("q.ay(IIIIII)V")
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field56.method1625(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field56.method1629(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1519.field1293;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method6(var12);
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
                class74 var14 = Statics.field775[var13.field848];
                if (var14 != null) {
                    int var15 = (var13.field834 * 4 - var14.field1307) / 2;
                    int var16 = (var13.field851 * 4 - var14.field1310) / 2;
                    var14.method1564(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field851) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field56.method1620(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field56.method1629(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method6(var21);
            if (var22.field848 != -1) {
                class74 var23 = Statics.field775[var22.field848];
                if (var23 != null) {
                    int var24 = (var22.field834 * 4 - var23.field1307) / 2;
                    int var25 = (var22.field851 * 4 - var23.field1310) / 2;
                    var23.method1564(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field851) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1519.field1293;
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
        int var29 = Statics.field56.method1744(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method6(var30);
        if (var31.field848 == -1) {
            return;
        }
        class74 var32 = Statics.field775[var31.field848];
        if (var32 != null) {
            int var33 = (var31.field834 * 4 - var32.field1307) / 2;
            int var34 = (var31.field851 * 4 - var32.field1310) / 2;
            var32.method1564(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field851) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bx.ad(I)V")
    public static final void method1594() {
        if (field298 == 199) {
            int var0 = field296.method2157();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2095;
            int var2 = (var0 & 0x7) + Statics.field2493;
            int var3 = field296.method2133();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field315[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method159(Statics.field72, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field298 == 15) {
            int var7 = field296.method2109();
            int var8 = (var7 >> 4 & 0x7) + Statics.field2095;
            int var9 = (var7 & 0x7) + Statics.field2493;
            int var10 = field296.method2111();
            int var11 = field296.method2111();
            int var12 = field296.method2111();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class176 var13 = field387[Statics.field72][var8][var9];
                if (var13 != null) {
                    for (class25 var14 = (class25) var13.method3234(); var14 != null; var14 = (class25) var13.method3209()) {
                        if ((var10 & 0x7FFF) == var14.field606 && var14.field604 == var11) {
                            var14.field604 = var12;
                            break;
                        }
                    }
                    method2799(var8, var9);
                }
            }
        } else {
            if (field298 == 196) {
                int var15 = field296.method2111();
                int var16 = field296.method2157();
                int var17 = (var16 >> 4 & 0x7) + Statics.field2095;
                int var18 = (var16 & 0x7) + Statics.field2493;
                int var19 = field296.method2140();
                byte var20 = field296.method2110();
                byte var21 = field296.method2136();
                int var22 = field296.method2157();
                int var23 = var22 >> 2;
                int var24 = var22 & 0x3;
                int var25 = field315[var23];
                byte var26 = field296.method2136();
                int var27 = field296.method2111();
                int var28 = field296.method2094();
                byte var29 = field296.method2136();
                class3 var30;
                if (field434 == var19) {
                    var30 = Statics.field1561;
                } else {
                    var30 = field372[var19];
                }
                if (var30 != null) {
                    class36 var31 = class36.method6(var15);
                    int var32;
                    int var33;
                    if (var24 == 1 || var24 == 3) {
                        var32 = var31.field851;
                        var33 = var31.field834;
                    } else {
                        var32 = var31.field834;
                        var33 = var31.field851;
                    }
                    int var34 = (var32 >> 1) + var17;
                    int var35 = (var32 + 1 >> 1) + var17;
                    int var36 = (var33 >> 1) + var18;
                    int var37 = (var33 + 1 >> 1) + var18;
                    int[][] var38 = class6.field85[Statics.field72];
                    int var39 = var38[var34][var36] + var38[var35][var36] + var38[var34][var37] + var38[var35][var37] >> 2;
                    int var40 = (var17 << 7) + (var32 << 6);
                    int var41 = (var18 << 7) + (var33 << 6);
                    class98 var42 = var31.method625(var23, var24, var38, var40, var39, var41);
                    if (var42 != null) {
                        method159(Statics.field72, var17, var18, var25, -1, 0, 0, var28 + 1, var27 + 1);
                        var30.field57 = field262 + var28;
                        var30.field45 = field262 + var27;
                        var30.field49 = var42;
                        var30.field44 = var17 * 128 + var32 * 64;
                        var30.field48 = var18 * 128 + var33 * 64;
                        var30.field47 = var39;
                        if (var26 > var20) {
                            byte var43 = var26;
                            var26 = var20;
                            var20 = var43;
                        }
                        if (var29 > var21) {
                            byte var44 = var29;
                            var29 = var21;
                            var21 = var44;
                        }
                        var30.field50 = var17 + var26;
                        var30.field52 = var17 + var20;
                        var30.field51 = var18 + var29;
                        var30.field53 = var18 + var21;
                    }
                }
            }
            if (field298 == 213) {
                int var45 = field296.method2109();
                int var46 = (var45 >> 4 & 0x7) + Statics.field2095;
                int var47 = (var45 & 0x7) + Statics.field2493;
                int var48 = field296.method2157();
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                int var51 = field315[var49];
                int var52 = field296.method2111();
                if (var46 >= 0 && var47 >= 0 && var46 < 103 && var47 < 103) {
                    if (var51 == 0) {
                        class80 var53 = Statics.field56.method1632(Statics.field72, var46, var47);
                        if (var53 != null) {
                            int var54 = var53.field1409 >> 14 & 0x7FFF;
                            if (var49 == 2) {
                                var53.field1410 = new class11(var54, 2, var50 + 4, Statics.field72, var46, var47, var52, false, var53.field1410);
                                var53.field1414 = new class11(var54, 2, var50 + 1 & 0x3, Statics.field72, var46, var47, var52, false, var53.field1414);
                            } else {
                                var53.field1410 = new class11(var54, var49, var50, Statics.field72, var46, var47, var52, false, var53.field1410);
                            }
                        }
                    }
                    if (var51 == 1) {
                        class87 var55 = Statics.field56.method1622(Statics.field72, var46, var47);
                        if (var55 != null) {
                            int var56 = var55.field1498 >> 14 & 0x7FFF;
                            if (var49 == 4 || var49 == 5) {
                                var55.field1496 = new class11(var56, 4, var50, Statics.field72, var46, var47, var52, false, var55.field1496);
                            } else if (var49 == 6) {
                                var55.field1496 = new class11(var56, 4, var50 + 4, Statics.field72, var46, var47, var52, false, var55.field1496);
                            } else if (var49 == 7) {
                                var55.field1496 = new class11(var56, 4, (var50 + 2 & 0x3) + 4, Statics.field72, var46, var47, var52, false, var55.field1496);
                            } else if (var49 == 8) {
                                var55.field1496 = new class11(var56, 4, var50 + 4, Statics.field72, var46, var47, var52, false, var55.field1496);
                                var55.field1497 = new class11(var56, 4, (var50 + 2 & 0x3) + 4, Statics.field72, var46, var47, var52, false, var55.field1497);
                            }
                        }
                    }
                    if (var51 == 2) {
                        class91 var57 = Statics.field56.method1672(Statics.field72, var46, var47);
                        if (var49 == 11) {
                            var49 = 10;
                        }
                        if (var57 != null) {
                            var57.field1551 = new class11(var57.field1559 >> 14 & 0x7FFF, var49, var50, Statics.field72, var46, var47, var52, false, var57.field1551);
                        }
                    }
                    if (var51 == 3) {
                        class86 var58 = Statics.field56.method1624(Statics.field72, var46, var47);
                        if (var58 != null) {
                            var58.field1477 = new class11(var58.field1482 >> 14 & 0x7FFF, 22, var50, Statics.field72, var46, var47, var52, false, var58.field1477);
                        }
                    }
                }
            } else {
                if (field298 == 70) {
                    int var59 = field296.method2109();
                    int var60 = (var59 >> 4 & 0x7) + Statics.field2095;
                    int var61 = (var59 & 0x7) + Statics.field2493;
                    int var62 = field296.method2111();
                    int var63 = field296.method2109();
                    int var64 = var63 >> 4 & 0xF;
                    int var65 = var63 & 0x7;
                    int var66 = field296.method2109();
                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                        int var67 = var64 + 1;
                        if (Statics.field1561.field766[0] >= var60 - var67 && Statics.field1561.field766[0] <= var60 + var67 && Statics.field1561.field712[0] >= var61 - var67 && Statics.field1561.field712[0] <= var61 + var67 && field488 != 0 && var65 > 0 && field489 < 50) {
                            field490[field489] = var62;
                            field491[field489] = var65;
                            field314[field489] = var66;
                            field464[field489] = null;
                            field493[field489] = (var60 << 16) + (var61 << 8) + var64;
                            field489++;
                        }
                    }
                }
                if (field298 == 12) {
                    int var68 = field296.method2094();
                    int var69 = field296.method2157();
                    int var70 = (var69 >> 4 & 0x7) + Statics.field2095;
                    int var71 = (var69 & 0x7) + Statics.field2493;
                    if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                        class176 var72 = field387[Statics.field72][var70][var71];
                        if (var72 != null) {
                            for (class25 var73 = (class25) var72.method3234(); var73 != null; var73 = (class25) var72.method3209()) {
                                if ((var68 & 0x7FFF) == var73.field606) {
                                    var73.method3268();
                                    break;
                                }
                            }
                            if (var72.method3234() == null) {
                                field387[Statics.field72][var70][var71] = null;
                            }
                            method2799(var70, var71);
                        }
                    }
                } else if (field298 == 191) {
                    int var74 = field296.method2141();
                    int var75 = field296.method2109();
                    int var76 = (var75 >> 4 & 0x7) + Statics.field2095;
                    int var77 = (var75 & 0x7) + Statics.field2493;
                    int var78 = field296.method2140();
                    if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                        class25 var79 = new class25();
                        var79.field606 = var78;
                        var79.field604 = var74;
                        if (field387[Statics.field72][var76][var77] == null) {
                            field387[Statics.field72][var76][var77] = new class176();
                        }
                        field387[Statics.field72][var76][var77].method3202(var79);
                        method2799(var76, var77);
                    }
                } else if (field298 == 52) {
                    int var80 = field296.method2109();
                    int var81 = (var80 >> 4 & 0x7) + Statics.field2095;
                    int var82 = (var80 & 0x7) + Statics.field2493;
                    int var83 = var81 + field296.method2110();
                    int var84 = var82 + field296.method2110();
                    int var85 = field296.method2112();
                    int var86 = field296.method2111();
                    int var87 = field296.method2109() * 4;
                    int var88 = field296.method2109() * 4;
                    int var89 = field296.method2111();
                    int var90 = field296.method2111();
                    int var91 = field296.method2109();
                    int var92 = field296.method2109();
                    if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 65535) {
                        int var93 = var81 * 128 + 64;
                        int var94 = var82 * 128 + 64;
                        int var95 = var83 * 128 + 64;
                        int var96 = var84 * 128 + 64;
                        class7 var97 = new class7(var86, Statics.field72, var93, var94, method120(var93, var94, Statics.field72) - var87, field262 + var89, field262 + var90, var91, var92, var85, var88);
                        var97.method77(var95, var96, method120(var95, var96, Statics.field72) - var88, field262 + var89);
                        field389.method3202(var97);
                    }
                } else if (field298 == 165) {
                    int var98 = field296.method2109();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field2095;
                    int var100 = (var98 & 0x7) + Statics.field2493;
                    int var101 = field296.method2111();
                    int var102 = field296.method2109();
                    int var103 = field296.method2111();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var104 = var99 * 128 + 64;
                        int var105 = var100 * 128 + 64;
                        class26 var106 = new class26(var101, Statics.field72, var104, var105, method120(var104, var105, Statics.field72) - var102, var103, field262);
                        field441.method3202(var106);
                    }
                } else if (field298 == 143) {
                    int var107 = field296.method2157();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field2095;
                    int var109 = (var107 & 0x7) + Statics.field2493;
                    int var110 = field296.method2135();
                    int var111 = var110 >> 2;
                    int var112 = var110 & 0x3;
                    int var113 = field315[var111];
                    int var114 = field296.method2094();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        method159(Statics.field72, var108, var109, var113, var114, var111, var112, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.ar(IIIIIIIIIB)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field385.method3234(); var10 != null; var10 = (class15) field385.method3209()) {
            if (var10.field215 == arg0 && var10.field210 == arg1 && var10.field211 == arg2 && var10.field208 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field215 = arg0;
            var9.field208 = arg3;
            var9.field210 = arg1;
            var9.field211 = arg2;
            method823(var9);
            field385.method3202(var9);
        }
        var9.field209 = arg4;
        var9.field219 = arg5;
        var9.field216 = arg6;
        var9.field218 = arg7;
        var9.field212 = arg8;
    }

    @ObfuscatedName("at.an(Ln;I)V")
    public static final void method823(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field208 == 0) {
            var1 = Statics.field56.method1625(arg0.field215, arg0.field210, arg0.field211);
        }
        if (arg0.field208 == 1) {
            var1 = Statics.field56.method1746(arg0.field215, arg0.field210, arg0.field211);
        }
        if (arg0.field208 == 2) {
            var1 = Statics.field56.method1620(arg0.field215, arg0.field210, arg0.field211);
        }
        if (arg0.field208 == 3) {
            var1 = Statics.field56.method1744(arg0.field215, arg0.field210, arg0.field211);
        }
        if (var1 != 0) {
            int var5 = Statics.field56.method1629(arg0.field215, arg0.field210, arg0.field211, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field217 = var2;
        arg0.field214 = var3;
        arg0.field213 = var4;
    }

    @ObfuscatedName("g.am(I)V")
    public static final void method67() {
        for (class15 var0 = (class15) field385.method3234(); var0 != null; var0 = (class15) field385.method3209()) {
            if (var0.field212 > 0) {
                var0.field212--;
            }
            if (var0.field212 != 0) {
                if (var0.field218 > 0) {
                    var0.field218--;
                }
                if (var0.field218 == 0 && var0.field210 >= 1 && var0.field211 >= 1 && var0.field210 <= 102 && var0.field211 <= 102 && (var0.field209 < 0 || class6.method579(var0.field209, var0.field219))) {
                    Statics.method27(var0.field215, var0.field208, var0.field210, var0.field211, var0.field209, var0.field216, var0.field219);
                    var0.field218 = -1;
                    if (var0.field217 == var0.field209 && var0.field217 == -1) {
                        var0.method3268();
                    } else if (var0.field217 == var0.field209 && var0.field216 == var0.field213 && var0.field219 == var0.field214) {
                        var0.method3268();
                    }
                }
            } else if (var0.field217 < 0 || class6.method579(var0.field217, var0.field214)) {
                Statics.method27(var0.field215, var0.field208, var0.field210, var0.field211, var0.field217, var0.field213, var0.field214);
                var0.method3268();
            }
        }
    }

    @ObfuscatedName("eu.bq(III)V")
    public static final void method2799(int arg0, int arg1) {
        class176 var2 = field387[Statics.field72][arg0][arg1];
        if (var2 == null) {
            Statics.field56.method1618(Statics.field72, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3234(); var6 != null; var6 = (class25) var2.method3209()) {
            class45 var7 = class45.method148(var6.field606);
            long var8 = (long) var7.field1013;
            if (var7.field994 == 1) {
                var8 = (long) (var6.field604 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field56.method1618(Statics.field72, arg0, arg1);
            return;
        }
        var2.method3211(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3234(); var12 != null; var12 = (class25) var2.method3209()) {
            if (var5.field606 != var12.field606) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field606 != var12.field606 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field56.method1602(Statics.field72, arg0, arg1, method120(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field72), var5, var13, var10, var11);
    }

    @ObfuscatedName("y.bl(B)V")
    public static final void method2() {
        field326 = 0;
        field375 = 0;
        method74();
        int var0 = field296.method2339(8);
        if (var0 < field373) {
            for (int var1 = var0; var1 < field373; var1++) {
                field381[++field326 - 1] = field374[var1];
            }
        }
        if (var0 > field373) {
            throw new RuntimeException("");
        }
        field373 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field374[var2];
            class3 var4 = field372[var3];
            int var5 = field296.method2339(1);
            if (var5 == 0) {
                field374[++field373 - 1] = var3;
                var4.field752 = field262;
            } else {
                int var6 = field296.method2339(2);
                if (var6 == 0) {
                    field374[++field373 - 1] = var3;
                    var4.field752 = field262;
                    field376[++field375 - 1] = var3;
                } else if (var6 == 1) {
                    field374[++field373 - 1] = var3;
                    var4.field752 = field262;
                    int var7 = field296.method2339(3);
                    var4.method567(var7, false);
                    int var8 = field296.method2339(1);
                    if (var8 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field374[++field373 - 1] = var3;
                    var4.field752 = field262;
                    int var9 = field296.method2339(3);
                    var4.method567(var9, true);
                    int var10 = field296.method2339(3);
                    var4.method567(var10, true);
                    int var11 = field296.method2339(1);
                    if (var11 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field381[++field326 - 1] = var3;
                }
            }
        }
        method2676();
        for (int var12 = 0; var12 < field375; var12++) {
            int var13 = field376[var12];
            class3 var14 = field372[var13];
            int var15 = field296.method2109();
            if ((var15 & 0x10) != 0) {
                var15 += field296.method2109() << 8;
            }
            if ((var15 & 0x1) != 0) {
                int var16 = field296.method2141();
                int var17 = field296.method2135();
                boolean var18 = field296.method2133() == 1;
                int var19 = field296.method2109();
                int var20 = field296.field1854;
                if (var14.field37 != null && var14.field38 != null) {
                    boolean var21 = false;
                    if (var17 <= 1 && method2883(var14.field37)) {
                        var21 = true;
                    }
                    if (!var21 && field371 == 0) {
                        field279.field1854 = 0;
                        field296.method2153(field279.field1856, 0, var19);
                        field279.field1854 = 0;
                        String var22 = class189.method3302(class196.method689(class188.method2675(field279)));
                        var14.field725 = var22.trim();
                        var14.field740 = var16 >> 8;
                        var14.field729 = var16 & 0xFF;
                        var14.field715 = 150;
                        var14.field726 = var18;
                        if (var17 == 2 || var17 == 3) {
                            class10.method2659(var18 ? 91 : 1, class2.method2678(1) + var14.field37, var22);
                        } else if (var17 == 1) {
                            class10.method2659(var18 ? 91 : 1, class2.method2678(0) + var14.field37, var22);
                        } else {
                            class10.method2659(var18 ? 90 : 2, var14.field37, var22);
                        }
                    }
                }
                field296.field1854 = var19 + var20;
            }
            if ((var15 & 0x20) != 0) {
                var14.field725 = field296.method2126();
                if (var14.field725.charAt(0) == '~') {
                    var14.field725 = var14.field725.substring(1);
                    class10.method2659(2, var14.field37, var14.field725);
                } else if (Statics.field1561 == var14) {
                    class10.method2659(2, var14.field37, var14.field725);
                }
                var14.field726 = false;
                var14.field740 = 0;
                var14.field729 = 0;
                var14.field715 = 150;
            }
            if ((var15 & 0x4) != 0) {
                int var23 = field296.method2111();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field296.method2135();
                method1853(var14, var23, var24);
            }
            if ((var15 & 0x2) != 0) {
                int var25 = field296.method2133();
                int var26 = field296.method2109();
                var14.method569(var25, var26, field262);
                var14.field733 = field262 + 300;
                var14.field762 = field296.method2135();
                var14.field735 = field296.method2133();
            }
            if ((var15 & 0x200) != 0) {
                var14.field759 = field296.method2157();
                var14.field754 = field296.method2109();
                var14.field753 = field296.method2157();
                var14.field755 = field296.method2133();
                var14.field756 = field296.method2094() + field262;
                var14.field757 = field296.method2094() + field262;
                var14.field758 = field296.method2135();
                var14.field764 = 1;
                var14.field769 = 0;
            }
            if ((var15 & 0x40) != 0) {
                int var27 = field296.method2135();
                byte[] var28 = new byte[var27];
                class107 var29 = new class107(var28);
                field296.method2152(var28, 0, var27);
                field377[var13] = var29;
                var14.method12(var29);
            }
            if ((var15 & 0x400) != 0) {
                var14.field747 = field296.method2094();
                int var30 = field296.method2114();
                var14.field760 = var30 >> 16;
                var14.field750 = (var30 & 0xFFFF) + field262;
                var14.field748 = 0;
                var14.field749 = 0;
                if (var14.field750 > field262) {
                    var14.field748 = -1;
                }
                if (var14.field747 == 65535) {
                    var14.field747 = -1;
                }
            }
            if ((var15 & 0x100) != 0) {
                int var31 = field296.method2133();
                int var32 = field296.method2133();
                var14.method569(var31, var32, field262);
                var14.field733 = field262 + 300;
                var14.field762 = field296.method2109();
                var14.field735 = field296.method2133();
            }
            if ((var15 & 0x8) != 0) {
                var14.field765 = field296.method2111();
                if (var14.field765 == 65535) {
                    var14.field765 = -1;
                }
            }
            if ((var15 & 0x80) != 0) {
                var14.field717 = field296.method2111();
                var14.field724 = field296.method2141();
            }
        }
        for (int var33 = 0; var33 < field326; var33++) {
            int var34 = field381[var33];
            if (field262 != field372[var34].field752) {
                field372[var34] = null;
            }
        }
        if (field427 != field296.field1854) {
            throw new RuntimeException(field296.field1854 + class2.field22 + field427);
        }
        for (int var35 = 0; var35 < field373; var35++) {
            if (field372[field374[var35]] == null) {
                throw new RuntimeException(var35 + class2.field22 + field373);
            }
        }
    }

    @ObfuscatedName("a.bh(I)V")
    public static final void method74() {
        field296.method2341();
        int var0 = field296.method2339(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field296.method2339(2);
        if (var1 == 0) {
            field376[++field375 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field296.method2339(3);
            Statics.field1561.method567(var2, false);
            int var3 = field296.method2339(1);
            if (var3 == 1) {
                field376[++field375 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field296.method2339(3);
            Statics.field1561.method567(var4, true);
            int var5 = field296.method2339(3);
            Statics.field1561.method567(var5, true);
            int var6 = field296.method2339(1);
            if (var6 == 1) {
                field376[++field375 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field296.method2339(7);
            int var8 = field296.method2339(1);
            Statics.field72 = field296.method2339(2);
            int var9 = field296.method2339(7);
            int var10 = field296.method2339(1);
            if (var10 == 1) {
                field376[++field375 - 1] = 2047;
            }
            Statics.field1561.method566(var9, var7, var8 == 1);
        }
    }

    @ObfuscatedName("ey.bd(I)V")
    public static final void method2676() {
        while (true) {
            if (field296.method2351(field427) >= 11) {
                int var0 = field296.method2339(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field372[var0] == null) {
                        field372[var0] = new class3();
                        if (field377[var0] != null) {
                            field372[var0].method12(field377[var0]);
                        }
                        var1 = true;
                    }
                    field374[++field373 - 1] = var0;
                    class3 var2 = field372[var0];
                    var2.field752 = field262;
                    int var3 = field296.method2339(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field296.method2339(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field296.method2339(1);
                    if (var5 == 1) {
                        field376[++field375 - 1] = var0;
                    }
                    int var6 = field296.method2339(1);
                    int var7 = field479[field296.method2339(3)];
                    if (var1) {
                        var2.field761 = var2.field714 = var7;
                    }
                    var2.method566(Statics.field1561.field766[0] + var4, Statics.field1561.field712[0] + var3, var6 == 1);
                    continue;
                }
            }
            field296.method2334();
            return;
        }
    }

    @ObfuscatedName("p.bn(S)V")
    public static final void method138() {
        field326 = 0;
        field375 = 0;
        method132();
        while (field296.method2351(field427) >= 27) {
            int var0 = field296.method2339(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field291[var0] == null) {
                field291[var0] = new class30();
                var4 = true;
            }
            class30 var5 = field291[var0];
            field293[++field482 - 1] = var0;
            var5.field752 = field262;
            int var6 = field296.method2339(5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = field479[field296.method2339(3)];
            if (var4) {
                var5.field761 = var5.field714 = var7;
            }
            int var8 = field296.method2339(1);
            int var9 = field296.method2339(5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field678 = class35.method189(field296.method2339(14));
            int var10 = field296.method2339(1);
            if (var10 == 1) {
                field376[++field375 - 1] = var0;
            }
            var5.field716 = var5.field678.field801;
            var5.field763 = var5.field678.field811;
            if (var5.field763 == 0) {
                var5.field714 = 0;
            }
            var5.field720 = var5.field678.field794;
            var5.field721 = var5.field678.field804;
            var5.field722 = var5.field678.field796;
            var5.field723 = var5.field678.field797;
            var5.field751 = var5.field678.field791;
            var5.field718 = var5.field678.field792;
            var5.field719 = var5.field678.field809;
            var5.method566(Statics.field1561.field766[0] + var9, Statics.field1561.field712[0] + var6, var8 == 1);
        }
        field296.method2334();
        method505();
        for (int var1 = 0; var1 < field326; var1++) {
            int var2 = field381[var1];
            if (field262 != field291[var2].field752) {
                field291[var2].field678 = null;
                field291[var2] = null;
            }
        }
        if (field427 != field296.field1854) {
            throw new RuntimeException(field296.field1854 + class2.field22 + field427);
        }
        for (int var3 = 0; var3 < field482; var3++) {
            if (field291[field293[var3]] == null) {
                throw new RuntimeException(var3 + class2.field22 + field482);
            }
        }
    }

    @ObfuscatedName("p.bm(I)V")
    public static final void method132() {
        field296.method2341();
        int var0 = field296.method2339(8);
        if (var0 < field482) {
            for (int var1 = var0; var1 < field482; var1++) {
                field381[++field326 - 1] = field293[var1];
            }
        }
        if (var0 > field482) {
            throw new RuntimeException("");
        }
        field482 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field293[var2];
            class30 var4 = field291[var3];
            int var5 = field296.method2339(1);
            if (var5 == 0) {
                field293[++field482 - 1] = var3;
                var4.field752 = field262;
            } else {
                int var6 = field296.method2339(2);
                if (var6 == 0) {
                    field293[++field482 - 1] = var3;
                    var4.field752 = field262;
                    field376[++field375 - 1] = var3;
                } else if (var6 == 1) {
                    field293[++field482 - 1] = var3;
                    var4.field752 = field262;
                    int var7 = field296.method2339(3);
                    var4.method567(var7, false);
                    int var8 = field296.method2339(1);
                    if (var8 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field293[++field482 - 1] = var3;
                    var4.field752 = field262;
                    int var9 = field296.method2339(3);
                    var4.method567(var9, true);
                    int var10 = field296.method2339(3);
                    var4.method567(var10, true);
                    int var11 = field296.method2339(1);
                    if (var11 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field381[++field326 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("av.ba(I)V")
    public static final void method505() {
        for (int var0 = 0; var0 < field375; var0++) {
            int var1 = field376[var0];
            class30 var2 = field291[var1];
            int var3 = field296.method2109();
            if ((var3 & 0x80) != 0) {
                int var4 = field296.method2135();
                int var5 = field296.method2135();
                var2.method569(var4, var5, field262);
                var2.field733 = field262 + 300;
                var2.field762 = field296.method2133();
                var2.field735 = field296.method2133();
            }
            if ((var3 & 0x10) != 0) {
                var2.field747 = field296.method2111();
                int var6 = field296.method2149();
                var2.field760 = var6 >> 16;
                var2.field750 = (var6 & 0xFFFF) + field262;
                var2.field748 = 0;
                var2.field749 = 0;
                if (var2.field750 > field262) {
                    var2.field748 = -1;
                }
                if (var2.field747 == 65535) {
                    var2.field747 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field765 = field296.method2141();
                if (var2.field765 == 65535) {
                    var2.field765 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field725 = field296.method2126();
                var2.field715 = 100;
            }
            if ((var3 & 0x1) != 0) {
                int var7 = field296.method2140();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field296.method2109();
                if (var2.field742 == var7 && var7 != -1) {
                    int var9 = class38.method1866(var7).field899;
                    if (var9 == 1) {
                        var2.field743 = 0;
                        var2.field772 = 0;
                        var2.field745 = var8;
                        var2.field738 = 0;
                    }
                    if (var9 == 2) {
                        var2.field738 = 0;
                    }
                } else if (var7 == -1 || var2.field742 == -1 || class38.method1866(var7).field887 >= class38.method1866(var2.field742).field887) {
                    var2.field742 = var7;
                    var2.field743 = 0;
                    var2.field772 = 0;
                    var2.field745 = var8;
                    var2.field738 = 0;
                    var2.field769 = var2.field764;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field296.method2109();
                int var11 = field296.method2133();
                var2.method569(var10, var11, field262);
                var2.field733 = field262 + 300;
                var2.field762 = field296.method2157();
                var2.field735 = field296.method2109();
            }
            if ((var3 & 0x2) != 0) {
                var2.field717 = field296.method2094();
                var2.field724 = field296.method2094();
            }
            if ((var3 & 0x8) != 0) {
                var2.field678 = class35.method189(field296.method2140());
                var2.field716 = var2.field678.field801;
                var2.field763 = var2.field678.field811;
                var2.field720 = var2.field678.field794;
                var2.field721 = var2.field678.field804;
                var2.field722 = var2.field678.field796;
                var2.field723 = var2.field678.field797;
                var2.field751 = var2.field678.field791;
                var2.field718 = var2.field678.field792;
                var2.field719 = var2.field678.field809;
            }
        }
    }

    @ObfuscatedName("h.bp(IIIII)V")
    public static final void method474(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field455; var4++) {
            if (field462[var4] + field417[var4] > arg0 && field417[var4] < arg0 + arg2 && field463[var4] + field461[var4] > arg1 && field461[var4] < arg1 + arg3) {
                field457[var4] = true;
            }
        }
    }

    @ObfuscatedName("af.bt(IIIII)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field455; var4++) {
            if (field462[var4] + field417[var4] > arg0 && field417[var4] < arg0 + arg2 && field463[var4] + field461[var4] > arg1 && field461[var4] < arg1 + arg3) {
                field458[var4] = true;
            }
        }
    }

    @ObfuscatedName("dm.bz(III)V")
    public static final void method2475(int arg0, int arg1) {
        int var2 = Statics.field1443.method3298(class142.field2293);
        for (int var3 = 0; var3 < field396; var3++) {
            class190 var4 = Statics.field1443;
            String var5;
            if (field320[var3].length() > 0) {
                var5 = field407[var3] + class142.field2237 + field320[var3];
            } else {
                var5 = field407[var3];
            }
            int var6 = var4.method3298(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field396 * 15 + 21;
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
        field395 = true;
        Statics.field679 = var8;
        Statics.field224 = var9;
        Statics.field1564 = var2;
        Statics.field1338 = field396 * 15 + 22;
    }

    @ObfuscatedName("c.bf(II)Z")
    public static final boolean method116(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field399[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("eo.bv(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method2833(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 40) {
            field294.method2331(107);
            field294.method2170(arg0);
            field294.method2137(arg3);
            field294.method2146(arg1);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 31) {
            field294.method2331(186);
            field294.method2137(arg0);
            field294.method2096(Statics.field31);
            field294.method2148(arg1);
            field294.method2139(arg3);
            field294.method2139(Statics.field242);
            field294.method2148(Statics.field135);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 7) {
            class30 var8 = field291[arg3];
            if (var8 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(147);
                field294.method2137(arg3);
                field294.method2131(class124.field1966[82] ? 1 : 0);
                field294.method2170(Statics.field31);
                field294.method2139(Statics.field242);
                field294.method2148(Statics.field135);
            }
        }
        if (arg2 == 17) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(187);
            field294.method2170(Statics.field966 + arg0);
            field294.method2170(field328);
            field294.method2137(arg3);
            field294.method2131(class124.field1966[82] ? 1 : 0);
            field294.method2096(Statics.field1047 + arg1);
            field294.method2232(Statics.field1885);
        }
        if (arg2 == 10) {
            class30 var9 = field291[arg3];
            if (var9 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(232);
                field294.method2276(class124.field1966[82] ? 1 : 0);
                field294.method2137(arg3);
            }
        }
        if (arg2 == 19) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(6);
            field294.method2170(Statics.field966 + arg0);
            field294.method2096(arg3);
            field294.method2100(class124.field1966[82] ? 1 : 0);
            field294.method2137(Statics.field1047 + arg1);
        }
        if (arg2 == 5) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(67);
            field294.method2100(class124.field1966[82] ? 1 : 0);
            field294.method2170(Statics.field1047 + arg1);
            field294.method2139(arg3 >> 14 & 0x7FFF);
            field294.method2139(Statics.field966 + arg0);
        }
        if (arg2 == 29) {
            field294.method2331(116);
            field294.method2232(arg1);
            class151 var10 = class151.method2354(arg1);
            if (var10.field2599 != null && var10.field2599[0][0] == 5) {
                int var11 = var10.field2599[0][1];
                if (class153.field2628[var11] != var10.field2601[0]) {
                    class153.field2628[var11] = var10.field2601[0];
                    method777(var11);
                }
            }
        }
        if (arg2 == 8) {
            class30 var12 = field291[arg3];
            if (var12 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(56);
                field294.method2170(field328);
                field294.method2232(Statics.field1885);
                field294.method2131(class124.field1966[82] ? 1 : 0);
                field294.method2139(arg3);
            }
        }
        if (arg2 == 1001) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(66);
            field294.method2131(class124.field1966[82] ? 1 : 0);
            field294.method2137(Statics.field1047 + arg1);
            field294.method2096(arg3 >> 14 & 0x7FFF);
            field294.method2170(Statics.field966 + arg0);
        }
        if (arg2 == 58) {
            field294.method2331(114);
            field294.method2139(field328);
            field294.method2148(Statics.field1885);
            field294.method2147(arg1);
            field294.method2170(arg0);
        }
        if (arg2 == 30 && field391 == null) {
            field294.method2331(197);
            field294.method2137(arg0);
            field294.method2232(arg1);
            field391 = class151.method503(arg1, arg0);
            method2685(field391);
        }
        if (arg2 == 36) {
            field294.method2331(182);
            field294.method2137(arg0);
            field294.method2170(arg3);
            field294.method2146(arg1);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 39) {
            field294.method2331(98);
            field294.method2147(arg1);
            field294.method2096(arg3);
            field294.method2137(arg0);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 6) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(250);
            field294.method2139(Statics.field1047 + arg1);
            field294.method2278(class124.field1966[82] ? 1 : 0);
            field294.method2137(Statics.field966 + arg0);
            field294.method2096(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(178);
            field294.method2096(Statics.field966 + arg0);
            field294.method2100(class124.field1966[82] ? 1 : 0);
            field294.method2139(Statics.field1047 + arg1);
            field294.method2139(arg3);
        }
        if (arg2 == 42) {
            field294.method2331(83);
            field294.method2096(arg0);
            field294.method2147(arg1);
            field294.method2137(arg3);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 23) {
            Statics.field56.method1636(Statics.field72, arg0, arg1);
        }
        if (arg2 == 15) {
            class3 var13 = field372[arg3];
            if (var13 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(60);
                field294.method2139(arg3);
                field294.method2147(Statics.field1885);
                field294.method2100(class124.field1966[82] ? 1 : 0);
                field294.method2137(field328);
            }
        }
        if (arg2 == 44) {
            class3 var14 = field372[arg3];
            if (var14 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(86);
                field294.method2278(class124.field1966[82] ? 1 : 0);
                field294.method2139(arg3);
            }
        }
        if (arg2 == 1003) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            class30 var15 = field291[arg3];
            if (var15 != null) {
                class35 var16 = var15.field678;
                if (var16.field812 != null) {
                    var16 = var16.method617();
                }
                if (var16 != null) {
                    field294.method2331(240);
                    field294.method2137(var16.field806);
                }
            }
        }
        if (arg2 == 4) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(200);
            field294.method2096(Statics.field1047 + arg1);
            field294.method2139(Statics.field966 + arg0);
            field294.method2096(arg3 >> 14 & 0x7FFF);
            field294.method2100(class124.field1966[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var17 = field372[arg3];
            if (var17 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(58);
                field294.method2100(class124.field1966[82] ? 1 : 0);
                field294.method2170(arg3);
            }
        }
        if (arg2 == 2) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(150);
            field294.method2278(class124.field1966[82] ? 1 : 0);
            field294.method2137(field328);
            field294.method2139(arg3 >> 14 & 0x7FFF);
            field294.method2139(Statics.field966 + arg0);
            field294.method2232(Statics.field1885);
            field294.method2096(Statics.field1047 + arg1);
        }
        if (arg2 == 49) {
            class3 var18 = field372[arg3];
            if (var18 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(110);
                field294.method2170(arg3);
                field294.method2131(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class30 var19 = field291[arg3];
            if (var19 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(21);
                field294.method2096(arg3);
                field294.method2278(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field294.method2331(116);
            field294.method2232(arg1);
            class151 var20 = class151.method2354(arg1);
            if (var20.field2599 != null && var20.field2599[0][0] == 5) {
                int var21 = var20.field2599[0][1];
                class153.field2628[var21] = 1 - class153.field2628[var21];
                method777(var21);
            }
        }
        if (arg2 == 22) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(91);
            field294.method2100(class124.field1966[82] ? 1 : 0);
            field294.method2137(Statics.field1047 + arg1);
            field294.method2170(arg3);
            field294.method2096(Statics.field966 + arg0);
        }
        if (arg2 == 3) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(254);
            field294.method2170(Statics.field966 + arg0);
            field294.method2278(class124.field1966[82] ? 1 : 0);
            field294.method2137(arg3 >> 14 & 0x7FFF);
            field294.method2137(Statics.field1047 + arg1);
        }
        if (arg2 == 1005) {
            class151 var22 = class151.method2354(arg1);
            if (var22 == null || var22.field2606[arg0] < 100000) {
                field294.method2331(202);
                field294.method2096(arg3);
            } else {
                class10.method2659(27, "", var22.field2606[arg0] + " x " + class45.method148(arg3).field1001);
            }
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 18) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(173);
            field294.method2096(arg3);
            field294.method2278(class124.field1966[82] ? 1 : 0);
            field294.method2170(Statics.field1047 + arg1);
            field294.method2170(Statics.field966 + arg0);
        }
        if (arg2 == 35) {
            field294.method2331(203);
            field294.method2170(arg3);
            field294.method2232(arg1);
            field294.method2170(arg0);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 43) {
            field294.method2331(84);
            field294.method2232(arg1);
            field294.method2096(arg0);
            field294.method2170(arg3);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 24) {
            class151 var23 = class151.method2354(arg1);
            boolean var24 = true;
            if (var23.field2507 > 0) {
                var24 = Statics.method869(var23);
            }
            if (var24) {
                field294.method2331(116);
                field294.method2232(arg1);
            }
        }
        if (arg2 == 51) {
            class3 var25 = field372[arg3];
            if (var25 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(234);
                field294.method2278(class124.field1966[82] ? 1 : 0);
                field294.method2170(arg3);
            }
        }
        if (arg2 == 41) {
            field294.method2331(115);
            field294.method2139(arg3);
            field294.method2139(arg0);
            field294.method2147(arg1);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 1002) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field294.method2331(181);
            field294.method2137(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            Statics.method26(arg3, arg1, arg0, arg5);
        }
        if (arg2 == 37) {
            field294.method2331(176);
            field294.method2170(arg0);
            field294.method2146(arg1);
            field294.method2096(arg3);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 50) {
            class3 var26 = field372[arg3];
            if (var26 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(71);
                field294.method2137(arg3);
                field294.method2278(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field294.method2331(138);
            field294.method2137(arg3);
            field294.method2137(arg0);
            field294.method2148(arg1);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 33) {
            field294.method2331(54);
            field294.method2137(arg3);
            field294.method2232(arg1);
            field294.method2137(arg0);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 47) {
            class3 var27 = field372[arg3];
            if (var27 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(236);
                field294.method2139(arg3);
                field294.method2278(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class30 var28 = field291[arg3];
            if (var28 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(222);
                field294.method2100(class124.field1966[82] ? 1 : 0);
                field294.method2139(arg3);
            }
        }
        if (arg2 == 32) {
            field294.method2331(22);
            field294.method2232(arg1);
            field294.method2148(Statics.field1885);
            field294.method2139(arg0);
            field294.method2170(field328);
            field294.method2170(arg3);
            field363 = 0;
            Statics.field220 = class151.method2354(arg1);
            field364 = arg0;
        }
        if (arg2 == 1) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(41);
            field294.method2096(Statics.field1047 + arg1);
            field294.method2170(Statics.field31);
            field294.method2139(arg3 >> 14 & 0x7FFF);
            field294.method2148(Statics.field135);
            field294.method2100(class124.field1966[82] ? 1 : 0);
            field294.method2170(Statics.field966 + arg0);
            field294.method2139(Statics.field242);
        }
        if (arg2 == 26) {
            field294.method2331(179);
            for (class4 var29 = (class4) field414.method3170(); var29 != null; var29 = (class4) field414.method3174()) {
                if (var29.field61 == 0 || var29.field61 == 3) {
                    method1591(var29, true);
                }
            }
            if (field391 != null) {
                method2685(field391);
                field391 = null;
            }
        }
        if (arg2 == 1004) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field294.method2331(202);
            field294.method2096(arg3);
        }
        if (arg2 == 20) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(208);
            field294.method2096(Statics.field966 + arg0);
            field294.method2170(arg3);
            field294.method2170(Statics.field1047 + arg1);
            field294.method2276(class124.field1966[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class30 var30 = field291[arg3];
            if (var30 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(23);
                field294.method2278(class124.field1966[82] ? 1 : 0);
                field294.method2096(arg3);
            }
        }
        if (arg2 == 16) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field481 = arg0;
            field318 = arg1;
            field294.method2331(152);
            field294.method2170(Statics.field966 + arg0);
            field294.method2139(arg3);
            field294.method2139(Statics.field31);
            field294.method2170(Statics.field242);
            field294.method2139(Statics.field1047 + arg1);
            field294.method2131(class124.field1966[82] ? 1 : 0);
            field294.method2148(Statics.field135);
        }
        if (arg2 == 25) {
            class151 var31 = class151.method503(arg1, arg0);
            if (var31 != null) {
                method506();
                int var32 = method731(var31);
                int var33 = var32 >> 11 & 0x3F;
                class151 var35 = class151.method503(arg1, arg0);
                if (var35 != null && var35.field2581 != null) {
                    class1 var36 = new class1();
                    var36.field3 = var35;
                    var36.field1 = var35.field2581;
                    class32.method585(var36);
                }
                field467 = true;
                Statics.field1885 = arg1;
                field328 = arg0;
                Statics.field1331 = var33;
                method2685(var35);
                field415 = 0;
                int var37 = method731(var31);
                int var38 = var37 >> 11 & 0x3F;
                String var39;
                if (var38 == 0) {
                    var39 = null;
                } else if (var31.field2569 == null || var31.field2569.trim().length() == 0) {
                    var39 = null;
                } else {
                    var39 = var31.field2569;
                }
                field411 = var39;
                if (field411 == null) {
                    field411 = "Null";
                }
                if (var31.field2502) {
                    field412 = var31.field2563 + class2.method793(16777215);
                } else {
                    field412 = class2.method793(65280) + var31.field2603 + class2.method793(16777215);
                }
            }
            return;
        }
        if (arg2 == 45) {
            class3 var40 = field372[arg3];
            if (var40 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(241);
                field294.method2170(arg3);
                field294.method2131(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var41 = field372[arg3];
            if (var41 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(121);
                field294.method2137(arg3);
                field294.method2096(Statics.field242);
                field294.method2232(Statics.field135);
                field294.method2096(Statics.field31);
                field294.method2276(class124.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method506();
            class151 var42 = class151.method2354(arg1);
            field415 = 1;
            Statics.field31 = arg0;
            Statics.field135 = arg1;
            Statics.field242 = arg3;
            method2685(var42);
            field408 = class2.method793(16748608) + class45.method148(arg3).field1001 + class2.method793(16777215);
            if (field408 == null) {
                field408 = "null";
            }
            return;
        }
        if (arg2 == 9) {
            class30 var43 = field291[arg3];
            if (var43 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(96);
                field294.method2278(class124.field1966[82] ? 1 : 0);
                field294.method2096(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var44 = field372[arg3];
            if (var44 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field481 = arg0;
                field318 = arg1;
                field294.method2331(242);
                field294.method2100(class124.field1966[82] ? 1 : 0);
                field294.method2096(arg3);
            }
        }
        if (field415 != 0) {
            field415 = 0;
            method2685(class151.method2354(Statics.field135));
        }
        if (field467) {
            method506();
        }
        if (Statics.field220 != null && field363 == 0) {
            method2685(Statics.field220);
        }
    }

    @ObfuscatedName("av.by(I)V")
    public static void method506() {
        if (!field467) {
            return;
        }
        class151 var0 = class151.method503(Statics.field1885, field328);
        if (var0 != null && var0.field2582 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field1 = var0.field2582;
            class32.method585(var1);
        }
        field467 = false;
        method2685(var0);
    }

    @ObfuscatedName("cg.bo(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1869(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field395 || field396 >= 500) {
            return;
        }
        field407[field396] = arg0;
        field320[field396] = arg1;
        field399[field396] = arg2;
        field400[field396] = arg3;
        field276[field396] = arg4;
        field398[field396] = arg5;
        field396++;
    }

    @ObfuscatedName("q.bb(I)V")
    public static void method478() {
        for (int var0 = 0; var0 < field396; var0++) {
            int var1 = field399[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field396 - 1) {
                    for (int var3 = var0; var3 < field396 - 1; var3++) {
                        field407[var3] = field407[var3 + 1];
                        field320[var3] = field320[var3 + 1];
                        field399[var3] = field399[var3 + 1];
                        field400[var3] = field400[var3 + 1];
                        field276[var3] = field276[var3 + 1];
                        field398[var3] = field398[var3 + 1];
                    }
                }
                field396--;
            }
        }
    }

    @ObfuscatedName("ce.bu(Lag;IIII)V")
    public static final void method2053(class35 arg0, int arg1, int arg2, int arg3) {
        if (field396 >= 400) {
            return;
        }
        if (arg0.field812 != null) {
            arg0 = arg0.method617();
        }
        if (arg0 == null || !arg0.field815 || arg0.field817 && field421 != arg1) {
            return;
        }
        String var4 = arg0.field810;
        if (arg0.field808 != 0) {
            var4 = var4 + method2360(arg0.field808, Statics.field1561.field41) + " " + class2.field24 + class142.field2296 + arg0.field808 + class2.field25;
        }
        if (field415 == 1) {
            method1869(class142.field2290, field408 + " " + class2.field26 + " " + class2.method793(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field467) {
            String[] var5 = arg0.field802;
            if (field424) {
                var5 = method1951(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2233)) {
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
                        method1869(var5[var6], class2.method793(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2233)) {
                        short var9 = 0;
                        if (field401 == class18.field512 || field401 == class18.field513 && arg0.field808 > Statics.field1561.field41) {
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
                        method1869(var5[var8], class2.method793(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1869(class142.field2194, class2.method793(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1331 & 0x2) == 2) {
            method1869(field411, field412 + " " + class2.field26 + " " + class2.method793(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("at.be(Lk;IIIB)V")
    public static final void method824(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1561 == arg0 || field396 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field37 + method2360(arg0.field41, Statics.field1561.field41) + " " + class2.field24 + class142.field2296 + arg0.field41 + class2.field25;
        } else {
            var4 = arg0.field37 + " " + class2.field24 + class142.field2204 + arg0.field42 + class2.field25;
        }
        if (field415 == 1) {
            method1869(class142.field2290, field408 + " " + class2.field26 + " " + class2.method793(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field467) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field281[var5] != null) {
                    short var6 = 0;
                    if (field281[var5].equalsIgnoreCase(class142.field2233)) {
                        if (field401 == class18.field512 || field401 == class18.field513 && arg0.field41 > Statics.field1561.field41) {
                            var6 = 2000;
                        }
                        if (Statics.field1561.field55 != 0 && arg0.field55 != 0) {
                            if (Statics.field1561.field55 == arg0.field55) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field384[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field382[var5] + var6;
                    method1869(field281[var5], class2.method793(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1331 & 0x8) == 8) {
            method1869(field411, field412 + " " + class2.field26 + " " + class2.method793(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field396; var9++) {
            if (field399[var9] == 23) {
                field320[var9] = class2.method793(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dt.bk(IIB)Ljava/lang/String;")
    public static final String method2360(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method793(16711680);
        } else if (var2 < -6) {
            return class2.method793(16723968);
        } else if (var2 < -3) {
            return class2.method793(16740352);
        } else if (var2 < 0) {
            return class2.method793(16756736);
        } else if (var2 > 9) {
            return class2.method793(65280);
        } else if (var2 > 6) {
            return class2.method793(4259584);
        } else if (var2 > 3) {
            return class2.method793(8453888);
        } else if (var2 > 0) {
            return class2.method793(12648192);
        } else {
            return class2.method793(16776960);
        }
    }

    @ObfuscatedName("ak.bg(IIIIIIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class151.method2456(arg0)) {
            Statics.field95 = null;
            method2479(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field95 != null) {
                method2479(Statics.field95, -1412584499, arg1, arg2, arg3, arg4, Statics.field123, Statics.field1986, arg7);
                Statics.field95 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field457[var8] = true;
            }
        } else {
            field457[arg7] = true;
        }
    }

    @ObfuscatedName("dm.bs([Lee;IIIIIIIII)V")
    public static final void method2479(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1532(arg2, arg3, arg4, arg5);
        class84.method1771();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class151 var10 = arg0[var9];
            if (var10 != null && (var10.field2532 == arg1 || arg1 == -1412584499 && field475 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field417[field455] = var10.field2562 + arg6;
                    field461[field455] = var10.field2545 + arg7;
                    field462[field455] = var10.field2512;
                    field463[field455] = var10.field2513;
                    var11 = ++field455 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2618 = var11;
                var10.field2619 = field262;
                if (!var10.field2502 || !method122(var10)) {
                    if (var10.field2507 > 0) {
                        int var12 = var10.field2507;
                        if (var12 == 324) {
                            if (field508 == -1) {
                                field508 = var10.field2535;
                                field509 = var10.field2595;
                            }
                            if (field507.field2641) {
                                var10.field2535 = field508;
                            } else {
                                var10.field2535 = field509;
                            }
                        } else if (var12 == 325) {
                            if (field508 == -1) {
                                field508 = var10.field2535;
                                field509 = var10.field2595;
                            }
                            if (field507.field2641) {
                                var10.field2535 = field509;
                            } else {
                                var10.field2535 = field508;
                            }
                        } else if (var12 == 327) {
                            var10.field2551 = 150;
                            var10.field2611 = (int) (Math.sin((double) field262 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2575 = 5;
                            var10.field2536 = 0;
                        } else if (var12 == 328) {
                            var10.field2551 = 150;
                            var10.field2611 = (int) (Math.sin((double) field262 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2575 = 5;
                            var10.field2536 = 1;
                        }
                    }
                    int var13 = var10.field2562 + arg6;
                    int var14 = var10.field2545 + arg7;
                    int var15 = var10.field2525;
                    if (field475 == var10) {
                        if (arg1 != -1412584499 && !var10.field2568) {
                            Statics.field95 = arg0;
                            Statics.field123 = arg6;
                            Statics.field1986 = arg7;
                            continue;
                        }
                        if (field436 && field430) {
                            int var16 = class127.field2005;
                            int var17 = class127.field2006;
                            int var18 = var16 - field308;
                            int var19 = var17 - field428;
                            if (var18 < field492) {
                                var18 = field492;
                            }
                            if (var10.field2512 + var18 > field492 + field426.field2512) {
                                var18 = field492 + field426.field2512 - var10.field2512;
                            }
                            if (var19 < field432) {
                                var19 = field432;
                            }
                            if (var10.field2513 + var19 > field432 + field426.field2513) {
                                var19 = field432 + field426.field2513 - var10.field2513;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2568) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2499 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2499 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2512 + var13;
                        int var27 = var10.field2513 + var14;
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
                        int var30 = var10.field2512 + var13;
                        int var31 = var10.field2513 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2502 || var20 < var22 && var21 < var23) {
                        if (var10.field2507 != 0) {
                            if (var10.field2507 == 1337) {
                                field403 = var13;
                                field254 = var14;
                                method1372(var13, var14, var10.field2512, var10.field2513);
                                class73.method1532(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2507 == 1338) {
                                method13(var13, var14, var11);
                                class73.method1532(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2499 == 0) {
                            if (!var10.field2502 && method122(var10) && Statics.field1862 != var10) {
                                continue;
                            }
                            if (!var10.field2502) {
                                if (var10.field2517 > var10.field2519 - var10.field2513) {
                                    var10.field2517 = var10.field2519 - var10.field2513;
                                }
                                if (var10.field2517 < 0) {
                                    var10.field2517 = 0;
                                }
                            }
                            method2479(arg0, var10.field2503, var20, var21, var22, var23, var13 - var10.field2516, var14 - var10.field2517, var11);
                            if (var10.field2586 != null) {
                                method2479(var10.field2586, var10.field2503, var20, var21, var22, var23, var13 - var10.field2516, var14 - var10.field2517, var11);
                            }
                            class4 var32 = (class4) field414.method3171((long) var10.field2503);
                            if (var32 != null) {
                                method887(var32.field62, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1532(arg2, arg3, arg4, arg5);
                            class84.method1771();
                        }
                        if (field459[var11] || field383 > 1) {
                            if (var10.field2499 == 0 && !var10.field2502 && var10.field2519 > var10.field2513) {
                                int var33 = var10.field2512 + var13;
                                int var34 = var10.field2517;
                                int var35 = var10.field2513;
                                int var36 = var10.field2519;
                                Statics.field1857[0].method1564(var33, var14);
                                Statics.field1857[1].method1564(var33, var14 + var35 - 16);
                                class73.method1514(var33, var14 + 16, 16, var35 - 32, field406);
                                int var37 = (var35 - 32) * var35 / var36;
                                if (var37 < 8) {
                                    var37 = 8;
                                }
                                int var38 = (var35 - 32 - var37) * var34 / (var36 - var35);
                                class73.method1514(var33, var14 + 16 + var38, 16, var37, field331);
                                class73.method1520(var33, var14 + 16 + var38, var37, field333);
                                class73.method1520(var33 + 1, var14 + 16 + var38, var37, field333);
                                class73.method1518(var33, var14 + 16 + var38, 16, field333);
                                class73.method1518(var33, var14 + 17 + var38, 16, field333);
                                class73.method1520(var33 + 15, var14 + 16 + var38, var37, field332);
                                class73.method1520(var33 + 14, var14 + 17 + var38, var37 - 1, field332);
                                class73.method1518(var33, var14 + 15 + var38 + var37, 16, field332);
                                class73.method1518(var33 + 1, var14 + 14 + var38 + var37, 15, field332);
                            }
                            if (var10.field2499 != 1) {
                                if (var10.field2499 == 2) {
                                    int var39 = 0;
                                    for (int var40 = 0; var40 < var10.field2513; var40++) {
                                        for (int var41 = 0; var41 < var10.field2512; var41++) {
                                            int var42 = (var10.field2556 + 32) * var41 + var13;
                                            int var43 = (var10.field2557 + 32) * var40 + var14;
                                            if (var39 < 20) {
                                                var42 += var10.field2558[var39];
                                                var43 += var10.field2559[var39];
                                            }
                                            if (var10.field2497[var39] > 0) {
                                                boolean var44 = false;
                                                boolean var45 = false;
                                                int var46 = var10.field2497[var39] - 1;
                                                if (var42 + 32 > arg2 && var42 < arg4 && var43 + 32 > arg3 && var43 < arg5 || Statics.field1883 == var10 && field365 == var39) {
                                                    class72 var47;
                                                    if (field415 == 1 && Statics.field31 == var39 && Statics.field135 == var10.field2503) {
                                                        var47 = class45.method1355(var46, var10.field2606[var39], 2, 0, false);
                                                    } else {
                                                        var47 = class45.method1355(var46, var10.field2606[var39], 1, 3153952, false);
                                                    }
                                                    if (var47 == null) {
                                                        method2685(var10);
                                                    } else if (Statics.field1883 == var10 && field365 == var39) {
                                                        int var48 = class127.field2005 - field366;
                                                        int var49 = class127.field2006 - field367;
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (field448 < 5) {
                                                            var48 = 0;
                                                            var49 = 0;
                                                        }
                                                        var47.method1442(var42 + var48, var43 + var49, 128);
                                                        if (arg1 != -1) {
                                                            class151 var50 = arg0[arg1 & 0xFFFF];
                                                            if (var43 + var49 < class73.field1305 && var50.field2517 > 0) {
                                                                int var51 = field443 * (class73.field1305 - var43 - var49) / 3;
                                                                if (var51 > field443 * 10) {
                                                                    var51 = field443 * 10;
                                                                }
                                                                if (var51 > var50.field2517) {
                                                                    var51 = var50.field2517;
                                                                }
                                                                var50.field2517 -= var51;
                                                                field367 += var51;
                                                                method2685(var50);
                                                            }
                                                            if (var43 + var49 + 32 > class73.field1304 && var50.field2517 < var50.field2519 - var50.field2513) {
                                                                int var52 = field443 * (var43 + var49 + 32 - class73.field1304) / 3;
                                                                if (var52 > field443 * 10) {
                                                                    var52 = field443 * 10;
                                                                }
                                                                if (var52 > var50.field2519 - var50.field2513 - var50.field2517) {
                                                                    var52 = var50.field2519 - var50.field2513 - var50.field2517;
                                                                }
                                                                var50.field2517 += var52;
                                                                field367 -= var52;
                                                                method2685(var50);
                                                            }
                                                        }
                                                    } else if (Statics.field220 == var10 && field364 == var39) {
                                                        var47.method1442(var42, var43, 128);
                                                    } else {
                                                        var47.method1405(var42, var43);
                                                    }
                                                }
                                            } else if (var10.field2560 != null && var39 < 20) {
                                                class72 var53 = var10.method2843(var39);
                                                if (var53 != null) {
                                                    var53.method1405(var42, var43);
                                                } else if (class151.field2501) {
                                                    method2685(var10);
                                                }
                                            }
                                            var39++;
                                        }
                                    }
                                } else if (var10.field2499 == 3) {
                                    int var54;
                                    if (method807(var10)) {
                                        var54 = var10.field2521;
                                        if (Statics.field1862 == var10 && var10.field2537 != 0) {
                                            var54 = var10.field2537;
                                        }
                                    } else {
                                        var54 = var10.field2604;
                                        if (Statics.field1862 == var10 && var10.field2522 != 0) {
                                            var54 = var10.field2522;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2546) {
                                            class73.method1514(var13, var14, var10.field2512, var10.field2513, var54);
                                        } else {
                                            class73.method1516(var13, var14, var10.field2512, var10.field2513, var54);
                                        }
                                    } else if (var10.field2546) {
                                        class73.method1508(var13, var14, var10.field2512, var10.field2513, var54, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1557(var13, var14, var10.field2512, var10.field2513, var54, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2499 == 4) {
                                    class190 var55 = var10.method2845();
                                    if (var55 != null) {
                                        String var56 = var10.field2550;
                                        int var57;
                                        if (method807(var10)) {
                                            var57 = var10.field2521;
                                            if (Statics.field1862 == var10 && var10.field2537 != 0) {
                                                var57 = var10.field2537;
                                            }
                                            if (var10.field2552.length() > 0) {
                                                var56 = var10.field2552;
                                            }
                                        } else {
                                            var57 = var10.field2604;
                                            if (Statics.field1862 == var10 && var10.field2522 != 0) {
                                                var57 = var10.field2522;
                                            }
                                        }
                                        if (var10.field2502 && var10.field2607 != -1) {
                                            class45 var58 = class45.method148(var10.field2607);
                                            var56 = var58.field1001;
                                            if (var56 == null) {
                                                var56 = "null";
                                            }
                                            if ((var58.field994 == 1 || var10.field2530 != 1) && var10.field2530 != -1) {
                                                var56 = class2.method793(16748608) + var56 + class2.field28 + " " + 'x' + method501(var10.field2530);
                                            }
                                        }
                                        if (field391 == var10) {
                                            class142 var10000 = (class142) null;
                                            var56 = class142.field2298;
                                            var57 = var10.field2604;
                                        }
                                        if (!var10.field2502) {
                                            var56 = method1870(var56, var10);
                                        }
                                        var55.method3306(var56, var13, var14, var10.field2512, var10.field2513, var57, var10.field2531 ? 0 : -1, var10.field2553, var10.field2579, var10.field2528);
                                    } else if (class151.field2501) {
                                        method2685(var10);
                                    }
                                } else if (var10.field2499 == 5) {
                                    if (var10.field2502) {
                                        class72 var60;
                                        if (var10.field2607 == -1) {
                                            var60 = var10.method2841(false);
                                        } else {
                                            var60 = class45.method1355(var10.field2607, var10.field2530, var10.field2511, var10.field2542, false);
                                        }
                                        if (var60 != null) {
                                            int var61 = var60.field1290;
                                            int var62 = var60.field1288;
                                            if (var10.field2571) {
                                                class73.method1509(var13, var14, var10.field2512 + var13, var10.field2513 + var14);
                                                int var63 = (var10.field2512 + (var61 - 1)) / var61;
                                                int var64 = (var10.field2513 + (var62 - 1)) / var62;
                                                for (int var65 = 0; var65 < var63; var65++) {
                                                    for (int var66 = 0; var66 < var64; var66++) {
                                                        if (var10.field2529 != 0) {
                                                            var60.method1427(var61 / 2 + var61 * var65 + var13, var62 / 2 + var62 * var66 + var14, var10.field2529, 4096);
                                                        } else if (var15 == 0) {
                                                            var60.method1405(var61 * var65 + var13, var62 * var66 + var14);
                                                        } else {
                                                            var60.method1442(var61 * var65 + var13, var62 * var66 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1532(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var67 = var10.field2512 * 4096 / var61;
                                                if (var10.field2529 != 0) {
                                                    var60.method1427(var10.field2512 / 2 + var13, var10.field2513 / 2 + var14, var10.field2529, var67);
                                                } else if (var15 != 0) {
                                                    var60.method1423(var13, var14, var10.field2512, var10.field2513, 256 - (var15 & 0xFF));
                                                } else if (var10.field2512 == var61 && var10.field2513 == var62) {
                                                    var60.method1405(var13, var14);
                                                } else {
                                                    var60.method1417(var13, var14, var10.field2512, var10.field2513);
                                                }
                                            }
                                        } else if (class151.field2501) {
                                            method2685(var10);
                                        }
                                    } else {
                                        class72 var59 = var10.method2841(method807(var10));
                                        if (var59 != null) {
                                            var59.method1405(var13, var14);
                                        } else if (class151.field2501) {
                                            method2685(var10);
                                        }
                                    }
                                } else if (var10.field2499 == 6) {
                                    boolean var68 = method807(var10);
                                    int var69;
                                    if (var68) {
                                        var69 = var10.field2540;
                                    } else {
                                        var69 = var10.field2539;
                                    }
                                    class98 var70 = null;
                                    int var71 = 0;
                                    if (var10.field2607 != -1) {
                                        class45 var72 = class45.method148(var10.field2607);
                                        if (var72 != null) {
                                            class45 var73 = var72.method847(var10.field2530);
                                            var70 = var73.method846(1);
                                            if (var70 == null) {
                                                method2685(var10);
                                            } else {
                                                var70.method1966();
                                                var71 = var70.field1344 / 2;
                                            }
                                        }
                                    } else if (var10.field2575 == 5) {
                                        if (var10.field2536 == 0) {
                                            var70 = field507.method2908((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var70 = Statics.field1561.method14();
                                        }
                                    } else if (var69 == -1) {
                                        var70 = var10.method2844((class38) null, -1, var68, Statics.field1561.field38);
                                        if (var70 == null && class151.field2501) {
                                            method2685(var10);
                                        }
                                    } else {
                                        class38 var74 = class38.method1866(var69);
                                        var70 = var10.method2844(var74, var10.field2554, var68, Statics.field1561.field38);
                                        if (var70 == null && class151.field2501) {
                                            method2685(var10);
                                        }
                                    }
                                    class84.method1783(var10.field2512 / 2 + var13, var10.field2513 / 2 + var14);
                                    int var75 = var10.field2520 * class84.field1472[var10.field2551] >> 16;
                                    int var76 = var10.field2520 * class84.field1449[var10.field2551] >> 16;
                                    if (var70 != null) {
                                        if (var10.field2502) {
                                            var70.method1966();
                                            if (var10.field2548) {
                                                var70.method1962(0, var10.field2611, var10.field2608, var10.field2551, var10.field2541, var10.field2614 + var71 + var75, var10.field2614 + var76, var10.field2520);
                                            } else {
                                                var70.method1961(0, var10.field2611, var10.field2608, var10.field2551, var10.field2541, var10.field2614 + var71 + var75, var10.field2614 + var76);
                                            }
                                        } else {
                                            var70.method1961(0, var10.field2611, 0, var10.field2551, 0, var75, var76);
                                        }
                                    }
                                    class84.method1773();
                                } else {
                                    if (var10.field2499 == 7) {
                                        class190 var77 = var10.method2845();
                                        if (var77 == null) {
                                            if (class151.field2501) {
                                                method2685(var10);
                                            }
                                            continue;
                                        }
                                        int var78 = 0;
                                        for (int var79 = 0; var79 < var10.field2513; var79++) {
                                            for (int var80 = 0; var80 < var10.field2512; var80++) {
                                                if (var10.field2497[var78] > 0) {
                                                    class45 var81 = class45.method148(var10.field2497[var78] - 1);
                                                    String var82;
                                                    if (var81.field994 != 1 && var10.field2606[var78] == 1) {
                                                        var82 = class2.method793(16748608) + var81.field1001 + class2.field28;
                                                    } else {
                                                        var82 = class2.method793(16748608) + var81.field1001 + class2.field28 + " " + 'x' + method501(var10.field2606[var78]);
                                                    }
                                                    int var83 = (var10.field2556 + 115) * var80 + var13;
                                                    int var84 = (var10.field2557 + 12) * var79 + var14;
                                                    if (var10.field2553 == 0) {
                                                        var77.method3303(var82, var83, var84, var10.field2604, var10.field2531 ? 0 : -1);
                                                    } else if (var10.field2553 == 1) {
                                                        var77.method3305(var82, var10.field2512 / 2 + var83, var84, var10.field2604, var10.field2531 ? 0 : -1);
                                                    } else {
                                                        var77.method3343(var82, var10.field2512 + var83 - 1, var84, var10.field2604, var10.field2531 ? 0 : -1);
                                                    }
                                                }
                                                var78++;
                                            }
                                        }
                                    }
                                    if (var10.field2499 == 8 && Statics.field1931 == var10 && field329 == field258) {
                                        int var85 = 0;
                                        int var86 = 0;
                                        class190 var87 = Statics.field1103;
                                        String var88 = var10.field2550;
                                        String var89 = method1870(var88, var10);
                                        while (var89.length() > 0) {
                                            int var90 = var89.indexOf(class2.field36);
                                            String var91;
                                            if (var90 == -1) {
                                                var91 = var89;
                                                var89 = "";
                                            } else {
                                                var91 = var89.substring(0, var90);
                                                var89 = var89.substring(var90 + 4);
                                            }
                                            int var92 = var87.method3298(var91);
                                            if (var92 > var85) {
                                                var85 = var92;
                                            }
                                            var86 += var87.field2871 + 1;
                                        }
                                        var85 += 6;
                                        var86 += 7;
                                        int var93 = var10.field2512 + var13 - 5 - var85;
                                        int var94 = var10.field2513 + var14 + 5;
                                        if (var93 < var13 + 5) {
                                            var93 = var13 + 5;
                                        }
                                        if (var85 + var93 > arg4) {
                                            var93 = arg4 - var85;
                                        }
                                        if (var86 + var94 > arg5) {
                                            var94 = arg5 - var86;
                                        }
                                        class73.method1514(var93, var94, var85, var86, 16777120);
                                        class73.method1516(var93, var94, var85, var86, 0);
                                        String var95 = var10.field2550;
                                        int var96 = var87.field2871 + var94 + 2;
                                        String var97 = method1870(var95, var10);
                                        while (var97.length() > 0) {
                                            int var98 = var97.indexOf(class2.field36);
                                            String var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = "";
                                            } else {
                                                var99 = var97.substring(0, var98);
                                                var97 = var97.substring(var98 + 4);
                                            }
                                            var87.method3303(var99, var93 + 3, var96, 0, -1);
                                            var96 += var87.field2871 + 1;
                                        }
                                    }
                                    if (var10.field2499 == 9) {
                                        if (var10.field2526 == 1) {
                                            class73.method1522(var13, var14, var10.field2512 + var13, var10.field2513 + var14, var10.field2604);
                                        } else {
                                            int var100 = var10.field2512 >= 0 ? var10.field2512 : -var10.field2512;
                                            int var101 = var10.field2513 >= 0 ? var10.field2513 : -var10.field2513;
                                            int var102 = var100;
                                            if (var100 < var101) {
                                                var102 = var101;
                                            }
                                            if (var102 != 0) {
                                                int var103 = (var10.field2512 << 16) / var102;
                                                int var104 = (var10.field2513 << 16) / var102;
                                                if (var104 <= var103) {
                                                    var103 = -var103;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var105 = var10.field2526 * var104 >> 17;
                                                int var106 = var10.field2526 * var104 + 1 >> 17;
                                                int var107 = var10.field2526 * var103 >> 17;
                                                int var108 = var10.field2526 * var103 + 1 >> 17;
                                                int var109 = var13 + var105;
                                                int var110 = var13 - var106;
                                                int var111 = var10.field2512 + var13 - var106;
                                                int var112 = var10.field2512 + var13 + var105;
                                                int var113 = var14 + var107;
                                                int var114 = var14 - var108;
                                                int var115 = var10.field2513 + var14 - var108;
                                                int var116 = var10.field2513 + var14 + var107;
                                                class84.method1779(var109, var110, var111);
                                                class84.method1774(var113, var114, var115, var109, var110, var111, var10.field2604);
                                                class84.method1779(var109, var111, var112);
                                                class84.method1774(var113, var115, var116, var109, var111, var112, var10.field2604);
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

    @ObfuscatedName("cw.bj(Ljava/lang/String;Lee;I)Ljava/lang/String;")
    public static String method1870(String arg0, class151 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method554(arg1, var2 - 1);
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
                if (Statics.field8 != null) {
                    var8 = class196.method3134(Statics.field8.field2067);
                    if (Statics.field8.field2066 != null) {
                        var8 = (String) Statics.field8.field2066;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("e.br(IB)Ljava/lang/String;")
    public static final String method501(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method793(65408) + var1.substring(0, var1.length() - 8) + class142.field2205 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method793(16777215) + var1.substring(0, var1.length() - 4) + class142.field2303 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else {
            return " " + class2.method793(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("au.bx(Lee;IIIIIIB)V")
    public static final void method557(class151 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field334) {
            field460 = 32;
        } else {
            field460 = 0;
        }
        field334 = false;
        if (class127.field2004 == 1 || !Statics.field144 && class127.field2004 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2517 -= 4;
                method2685(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2517 += 4;
                method2685(arg0);
            } else if (arg5 >= arg1 - field460 && arg5 < field460 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2517 = (arg4 - arg3) * var8 / var9;
                method2685(arg0);
                field334 = true;
            }
        }
        if (field487 == 0) {
            return;
        }
        int var10 = arg0.field2512;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2517 += field487 * 45;
            method2685(arg0);
        }
    }

    @ObfuscatedName("ae.ch(Lee;B)Z")
    public static final boolean method807(class151 arg0) {
        if (arg0.field2600 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2600.length; var1++) {
            int var2 = method554(arg0, var1);
            int var3 = arg0.field2601[var1];
            if (arg0.field2600[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2600[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2600[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ah.cl(Lee;IS)I")
    public static final int method554(class151 arg0, int arg1) {
        if (arg0.field2599 == null || arg1 >= arg0.field2599.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2599[arg1];
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
                    var7 = field370[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field392[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field393[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class151 var11 = class151.method2354(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method148(var12).field1040 || field256)) {
                        for (int var13 = 0; var13 < var11.field2497.length; var13++) {
                            if (var12 + 1 == var11.field2497[var13]) {
                                var7 += var11.field2606[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class153.field2628[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2135[field392[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class153.field2628[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1561.field41;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2136[var14]) {
                            var7 += field392[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class151 var17 = class151.method2354(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method148(var18).field1040 || field256)) {
                        for (int var19 = 0; var19 < var17.field2497.length; var19++) {
                            if (var18 + 1 == var17.field2497[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field404;
                }
                if (var6 == 12) {
                    var7 = field419;
                }
                if (var6 == 13) {
                    int var20 = class153.field2628[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class153.method1769(var22);
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
                    var7 = (Statics.field1561.field746 >> 7) + Statics.field966;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1561.field713 >> 7) + Statics.field1047;
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

    @ObfuscatedName("n.cr(IIIIIIIB)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class151.method2456(arg0)) {
            method70(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("g.ck([Lee;IIIIIIIB)V")
    public static final void method70(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class151 var9 = arg0[var8];
            if (var9 != null && (!var9.field2502 || var9.field2499 == 0 || var9.field2570 || method731(var9) != 0 || field426 == var9) && var9.field2532 == arg1 && (!var9.field2502 || !method122(var9))) {
                int var10 = var9.field2562 + arg6;
                int var11 = var9.field2545 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2499 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2499 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2512 + var10;
                    int var19 = var9.field2513 + var11;
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
                    int var22 = var9.field2512 + var10;
                    int var23 = var9.field2513 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field475 == var9) {
                    field502 = true;
                    field425 = var10;
                    field435 = var11;
                }
                if (!var9.field2502 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2005;
                    int var25 = class127.field2006;
                    if (class127.field2011 != 0) {
                        var24 = class127.field2013;
                        var25 = class127.field2015;
                    }
                    if (var9.field2507 == 1337) {
                        method2685(var9);
                        if (!field261 && !field395 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            Statics.method1867(var24, var25, var12, var13);
                        }
                    } else if (var9.field2507 != 1338) {
                        if (!field395 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2506 == 1) {
                                method1869(var9.field2596, "", 24, 0, 0, var9.field2503);
                            }
                            if (var9.field2506 == 2 && !field467) {
                                int var39 = method731(var9);
                                int var40 = var39 >> 11 & 0x3F;
                                String var41;
                                if (var40 == 0) {
                                    var41 = null;
                                } else if (var9.field2569 == null || var9.field2569.trim().length() == 0) {
                                    var41 = null;
                                } else {
                                    var41 = var9.field2569;
                                }
                                if (var41 != null) {
                                    method1869(var41, class2.method793(65280) + var9.field2603, 25, 0, -1, var9.field2503);
                                }
                            }
                            if (var9.field2506 == 3) {
                                method1869(class142.field2299, "", 26, 0, 0, var9.field2503);
                            }
                            if (var9.field2506 == 4) {
                                method1869(var9.field2596, "", 28, 0, 0, var9.field2503);
                            }
                            if (var9.field2506 == 5) {
                                method1869(var9.field2596, "", 29, 0, 0, var9.field2503);
                            }
                            if (var9.field2506 == 6 && field391 == null) {
                                method1869(var9.field2596, "", 30, 0, -1, var9.field2503);
                            }
                            if (var9.field2499 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2513; var44++) {
                                    for (int var45 = 0; var45 < var9.field2512; var45++) {
                                        int var46 = (var9.field2556 + 32) * var45;
                                        int var47 = (var9.field2557 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2558[var43];
                                            var47 += var9.field2559[var43];
                                        }
                                        if (var37 >= var46 && var38 >= var47 && var37 < var46 + 32 && var38 < var47 + 32) {
                                            field368 = var43;
                                            Statics.field1501 = var9;
                                            if (var9.field2497[var43] > 0) {
                                                class45 var48 = class45.method148(var9.field2497[var43] - 1);
                                                if (field415 == 1 && class155.method618(method731(var9))) {
                                                    if (Statics.field135 != var9.field2503 || Statics.field31 != var43) {
                                                        method1869(class142.field2290, field408 + " " + class2.field26 + " " + class2.method793(16748608) + var48.field1001, 31, var48.field1009, var43, var9.field2503);
                                                    }
                                                } else if (!field467 || !class155.method618(method731(var9))) {
                                                    String[] var49 = var48.field1016;
                                                    if (field424) {
                                                        var49 = method1951(var49);
                                                    }
                                                    if (class155.method618(method731(var9))) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var49 != null && var49[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method1869(var49[var50], class2.method793(16748608) + var48.field1001, var51, var48.field1009, var43, var9.field2503);
                                                            } else if (var50 == 4) {
                                                                method1869(class142.field2344, class2.method793(16748608) + var48.field1001, 37, var48.field1009, var43, var9.field2503);
                                                            }
                                                        }
                                                    }
                                                    int var52 = method731(var9);
                                                    boolean var53 = (var52 >> 31 & 0x1) != 0;
                                                    if (var53) {
                                                        method1869(class142.field2290, class2.method793(16748608) + var48.field1001, 38, var48.field1009, var43, var9.field2503);
                                                    }
                                                    class155 var10000 = (class155) null;
                                                    if (class155.method618(method731(var9)) && var49 != null) {
                                                        for (int var54 = 2; var54 >= 0; var54--) {
                                                            if (var49[var54] != null) {
                                                                byte var55 = 0;
                                                                if (var54 == 0) {
                                                                    var55 = 33;
                                                                }
                                                                if (var54 == 1) {
                                                                    var55 = 34;
                                                                }
                                                                if (var54 == 2) {
                                                                    var55 = 35;
                                                                }
                                                                method1869(var49[var54], class2.method793(16748608) + var48.field1001, var55, var48.field1009, var43, var9.field2503);
                                                            }
                                                        }
                                                    }
                                                    String[] var56 = var9.field2561;
                                                    if (field424) {
                                                        var56 = method1951(var56);
                                                    }
                                                    if (var56 != null) {
                                                        for (int var57 = 4; var57 >= 0; var57--) {
                                                            if (var56[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 39;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 40;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 41;
                                                                }
                                                                if (var57 == 3) {
                                                                    var58 = 42;
                                                                }
                                                                if (var57 == 4) {
                                                                    var58 = 43;
                                                                }
                                                                method1869(var56[var57], class2.method793(16748608) + var48.field1001, var58, var48.field1009, var43, var9.field2503);
                                                            }
                                                        }
                                                    }
                                                    method1869(class142.field2194, class2.method793(16748608) + var48.field1001, 1005, var48.field1009, var43, var9.field2503);
                                                } else if ((Statics.field1331 & 0x10) == 16) {
                                                    method1869(field411, field412 + " " + class2.field26 + " " + class2.method793(16748608) + var48.field1001, 32, var48.field1009, var43, var9.field2503);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2502) {
                                if (field467) {
                                    int var59 = method731(var9);
                                    boolean var60 = (var59 >> 21 & 0x1) != 0;
                                    if (var60 && (Statics.field1331 & 0x20) == 32) {
                                        method1869(field411, field412 + " " + class2.field26 + " " + var9.field2563, 58, 0, var9.field2504, var9.field2503);
                                    }
                                } else {
                                    for (int var61 = 9; var61 >= 5; var61--) {
                                        int var62 = method731(var9);
                                        boolean var63 = (var62 >> var61 + 1 & 0x1) != 0;
                                        String var64;
                                        if (!var63 && var9.field2590 == null) {
                                            var64 = null;
                                        } else if (var9.field2564 == null || var9.field2564.length <= var61 || var9.field2564[var61] == null || var9.field2564[var61].trim().length() == 0) {
                                            var64 = null;
                                        } else {
                                            var64 = var9.field2564[var61];
                                        }
                                        if (var64 != null) {
                                            method1869(var64, var9.field2563, 1007, var61 + 1, var9.field2504, var9.field2503);
                                        }
                                    }
                                    int var66 = method731(var9);
                                    int var67 = var66 >> 11 & 0x3F;
                                    String var68;
                                    if (var67 == 0) {
                                        var68 = null;
                                    } else if (var9.field2569 == null || var9.field2569.trim().length() == 0) {
                                        var68 = null;
                                    } else {
                                        var68 = var9.field2569;
                                    }
                                    if (var68 != null) {
                                        method1869(var68, var9.field2563, 25, 0, var9.field2504, var9.field2503);
                                    }
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        int var71 = method731(var9);
                                        boolean var72 = (var71 >> var70 + 1 & 0x1) != 0;
                                        String var73;
                                        if (!var72 && var9.field2590 == null) {
                                            var73 = null;
                                        } else if (var9.field2564 == null || var9.field2564.length <= var70 || var9.field2564[var70] == null || var9.field2564[var70].trim().length() == 0) {
                                            var73 = null;
                                        } else {
                                            var73 = var9.field2564[var70];
                                        }
                                        if (var73 != null) {
                                            method1869(var73, var9.field2563, 57, var70 + 1, var9.field2504, var9.field2503);
                                        }
                                    }
                                    if (class155.method2643(method731(var9))) {
                                        method1869(class142.field2157, "", 30, 0, var9.field2504, var9.field2503);
                                    }
                                }
                            }
                        }
                        if (var9.field2499 == 0) {
                            if (!var9.field2502 && method122(var9) && Statics.field1862 != var9) {
                                continue;
                            }
                            method70(arg0, var9.field2503, var12, var13, var14, var15, var10 - var9.field2516, var11 - var9.field2517);
                            if (var9.field2586 != null) {
                                method70(var9.field2586, var9.field2503, var12, var13, var14, var15, var10 - var9.field2516, var11 - var9.field2517);
                            }
                            class4 var75 = (class4) field414.method3171((long) var9.field2503);
                            if (var75 != null) {
                                if (var75.field61 == 0 && class127.field2005 >= var12 && class127.field2006 >= var13 && class127.field2005 < var14 && class127.field2006 < var15 && !field395 && !field423) {
                                    field407[0] = class142.field2228;
                                    field320[0] = "";
                                    field399[0] = 1006;
                                    field396 = 1;
                                }
                                method144(var75.field62, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2502) {
                            if (var9.field2555 && class127.field2005 >= var12 && class127.field2006 >= var13 && class127.field2005 < var14 && class127.field2006 < var15) {
                                for (class1 var76 = (class1) field341.method3234(); var76 != null; var76 = (class1) field341.method3209()) {
                                    if (var76.field2) {
                                        var76.method3268();
                                        var76.field3.field2612 = false;
                                    }
                                }
                                if (Statics.field1998 == 0) {
                                    field475 = null;
                                    field426 = null;
                                }
                                if (!field395) {
                                    field407[0] = class142.field2228;
                                    field320[0] = "";
                                    field399[0] = 1006;
                                    field396 = 1;
                                }
                            }
                            boolean var77;
                            if (class127.field2005 >= var12 && class127.field2006 >= var13 && class127.field2005 < var14 && class127.field2006 < var15) {
                                var77 = true;
                            } else {
                                var77 = false;
                            }
                            boolean var78 = false;
                            if ((class127.field2004 == 1 || !Statics.field144 && class127.field2004 == 4) && var77) {
                                var78 = true;
                            }
                            boolean var79 = false;
                            if ((class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4) && class127.field2013 >= var12 && class127.field2015 >= var13 && class127.field2013 < var14 && class127.field2015 < var15) {
                                var79 = true;
                            }
                            if (var79) {
                                method2507(var9, class127.field2013 - var10, class127.field2015 - var11);
                            }
                            if (field475 != null && field475 != var9 && var77 && class155.method2431(method731(var9))) {
                                field429 = var9;
                            }
                            if (field426 == var9) {
                                field430 = true;
                                field492 = var10;
                                field432 = var11;
                            }
                            if (var9.field2570) {
                                if (var77 && field487 != 0 && var9.field2591 != null) {
                                    class1 var80 = new class1();
                                    var80.field2 = true;
                                    var80.field3 = var9;
                                    var80.field6 = field487;
                                    var80.field1 = var9.field2591;
                                    field341.method3202(var80);
                                }
                                if (field475 != null || Statics.field1883 != null || field395) {
                                    var79 = false;
                                    var78 = false;
                                    var77 = false;
                                }
                                if (!var9.field2613 && var79) {
                                    var9.field2613 = true;
                                    if (var9.field2609 != null) {
                                        class1 var81 = new class1();
                                        var81.field2 = true;
                                        var81.field3 = var9;
                                        var81.field4 = class127.field2013 - var10;
                                        var81.field6 = class127.field2015 - var11;
                                        var81.field1 = var9.field2609;
                                        field341.method3202(var81);
                                    }
                                }
                                if (var9.field2613 && var78 && var9.field2573 != null) {
                                    class1 var82 = new class1();
                                    var82.field2 = true;
                                    var82.field3 = var9;
                                    var82.field4 = class127.field2005 - var10;
                                    var82.field6 = class127.field2006 - var11;
                                    var82.field1 = var9.field2573;
                                    field341.method3202(var82);
                                }
                                if (var9.field2613 && !var78) {
                                    var9.field2613 = false;
                                    if (var9.field2574 != null) {
                                        class1 var83 = new class1();
                                        var83.field2 = true;
                                        var83.field3 = var9;
                                        var83.field4 = class127.field2005 - var10;
                                        var83.field6 = class127.field2006 - var11;
                                        var83.field1 = var9.field2574;
                                        field453.method3202(var83);
                                    }
                                }
                                if (var78 && var9.field2518 != null) {
                                    class1 var84 = new class1();
                                    var84.field2 = true;
                                    var84.field3 = var9;
                                    var84.field4 = class127.field2005 - var10;
                                    var84.field6 = class127.field2006 - var11;
                                    var84.field1 = var9.field2518;
                                    field341.method3202(var84);
                                }
                                if (!var9.field2612 && var77) {
                                    var9.field2612 = true;
                                    if (var9.field2620 != null) {
                                        class1 var85 = new class1();
                                        var85.field2 = true;
                                        var85.field3 = var9;
                                        var85.field4 = class127.field2005 - var10;
                                        var85.field6 = class127.field2006 - var11;
                                        var85.field1 = var9.field2620;
                                        field341.method3202(var85);
                                    }
                                }
                                if (var9.field2612 && var77 && var9.field2577 != null) {
                                    class1 var86 = new class1();
                                    var86.field2 = true;
                                    var86.field3 = var9;
                                    var86.field4 = class127.field2005 - var10;
                                    var86.field6 = class127.field2006 - var11;
                                    var86.field1 = var9.field2577;
                                    field341.method3202(var86);
                                }
                                if (var9.field2612 && !var77) {
                                    var9.field2612 = false;
                                    if (var9.field2578 != null) {
                                        class1 var87 = new class1();
                                        var87.field2 = true;
                                        var87.field3 = var9;
                                        var87.field4 = class127.field2005 - var10;
                                        var87.field6 = class127.field2006 - var11;
                                        var87.field1 = var9.field2578;
                                        field453.method3202(var87);
                                    }
                                }
                                if (var9.field2605 != null) {
                                    class1 var88 = new class1();
                                    var88.field3 = var9;
                                    var88.field1 = var9.field2605;
                                    field452.method3202(var88);
                                }
                                if (var9.field2583 != null && field439 > var9.field2615) {
                                    if (var9.field2584 == null || field439 - var9.field2615 > 32) {
                                        class1 var93 = new class1();
                                        var93.field3 = var9;
                                        var93.field1 = var9.field2583;
                                        field341.method3202(var93);
                                    } else {
                                        label705: for (int var89 = var9.field2615; var89 < field439; var89++) {
                                            int var90 = field438[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2584.length; var91++) {
                                                if (var9.field2584[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field3 = var9;
                                                    var92.field1 = var9.field2583;
                                                    field341.method3202(var92);
                                                    break label705;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2615 = field439;
                                }
                                if (var9.field2585 != null && field267 > var9.field2589) {
                                    if (var9.field2527 == null || field267 - var9.field2589 > 32) {
                                        class1 var98 = new class1();
                                        var98.field3 = var9;
                                        var98.field1 = var9.field2585;
                                        field341.method3202(var98);
                                    } else {
                                        label681: for (int var94 = var9.field2589; var94 < field267; var94++) {
                                            int var95 = field477[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2527.length; var96++) {
                                                if (var9.field2527[var96] == var95) {
                                                    class1 var97 = new class1();
                                                    var97.field3 = var9;
                                                    var97.field1 = var9.field2585;
                                                    field341.method3202(var97);
                                                    break label681;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2589 = field267;
                                }
                                if (var9.field2587 != null && field309 > var9.field2617) {
                                    if (var9.field2588 == null || field309 - var9.field2617 > 32) {
                                        class1 var103 = new class1();
                                        var103.field3 = var9;
                                        var103.field1 = var9.field2587;
                                        field341.method3202(var103);
                                    } else {
                                        label657: for (int var99 = var9.field2617; var99 < field309; var99++) {
                                            int var100 = field445[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2588.length; var101++) {
                                                if (var9.field2588[var101] == var100) {
                                                    class1 var102 = new class1();
                                                    var102.field3 = var9;
                                                    var102.field1 = var9.field2587;
                                                    field341.method3202(var102);
                                                    break label657;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2617 = field309;
                                }
                                if (field444 > var9.field2543 && var9.field2592 != null) {
                                    class1 var104 = new class1();
                                    var104.field3 = var9;
                                    var104.field1 = var9.field2592;
                                    field341.method3202(var104);
                                }
                                if (field278 > var9.field2543 && var9.field2594 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = var9;
                                    var105.field1 = var9.field2594;
                                    field341.method3202(var105);
                                }
                                if (field446 > var9.field2543 && var9.field2544 != null) {
                                    class1 var106 = new class1();
                                    var106.field3 = var9;
                                    var106.field1 = var9.field2544;
                                    field341.method3202(var106);
                                }
                                if (field447 > var9.field2543 && var9.field2505 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = var9;
                                    var107.field1 = var9.field2505;
                                    field341.method3202(var107);
                                }
                                var9.field2543 = field437;
                                if (var9.field2593 != null) {
                                    for (int var108 = 0; var108 < field470; var108++) {
                                        class1 var109 = new class1();
                                        var109.field3 = var9;
                                        var109.field13 = field472[var108];
                                        var109.field9 = field471[var108];
                                        var109.field1 = var9.field2593;
                                        field341.method3202(var109);
                                    }
                                }
                            }
                        }
                        if (!var9.field2502 && field475 == null && Statics.field1883 == null && !field395) {
                            if ((var9.field2602 >= 0 || var9.field2522 != 0) && class127.field2005 >= var12 && class127.field2006 >= var13 && class127.field2005 < var14 && class127.field2006 < var15) {
                                if (var9.field2602 >= 0) {
                                    Statics.field1862 = arg0[var9.field2602];
                                } else {
                                    Statics.field1862 = var9;
                                }
                            }
                            if (var9.field2499 == 8 && class127.field2005 >= var12 && class127.field2006 >= var13 && class127.field2005 < var14 && class127.field2006 < var15) {
                                Statics.field1931 = var9;
                            }
                            if (var9.field2519 > var9.field2513) {
                                method557(var9, var9.field2512 + var10, var11, var9.field2513, var9.field2519, class127.field2005, class127.field2006);
                            }
                        }
                    } else if ((field483 == 0 || field483 == 3) && (class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4)) {
                        int var26 = class127.field2013 - 25 - var10;
                        int var27 = class127.field2015 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field323 + field289 & 0x7FF;
                            int var29 = class84.field1472[var28];
                            int var30 = class84.field1449[var28];
                            int var31 = (field325 + 256) * var29 >> 8;
                            int var32 = (field325 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field1561.field746 + var33 >> 7;
                            int var36 = Statics.field1561.field713 - var34 >> 7;
                            field294.method2331(7);
                            field294.method2278(18);
                            field294.method2170(Statics.field1047 + var36);
                            field294.method2276(class124.field1966[82] ? (class124.field1966[81] ? 2 : 1) : 0);
                            field294.method2096(Statics.field966 + var35);
                            field294.method2278(var26);
                            field294.method2278(var27);
                            field294.method2096(field289);
                            field294.method2278(57);
                            field294.method2278(field323);
                            field294.method2278(field325);
                            field294.method2278(89);
                            field294.method2096(Statics.field1561.field746);
                            field294.method2096(Statics.field1561.field713);
                            field294.method2278(63);
                            field481 = var35;
                            field318 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.cn([Lee;II)V")
    public static final void method1327(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2499 == 0) {
                    if (var3.field2586 != null) {
                        method1327(var3.field2586, arg1);
                    }
                    class4 var4 = (class4) field414.method3171((long) var3.field2503);
                    if (var4 != null) {
                        int var5 = var4.field62;
                        if (class151.method2456(var5)) {
                            method1327(Statics.field2616[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2508 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field1 = var3.field2508;
                    class32.method585(var6);
                }
                if (arg1 == 1 && var3.field2598 != null) {
                    if (var3.field2504 >= 0) {
                        class151 var7 = class151.method2354(var3.field2503);
                        if (var7 == null || var7.field2586 == null || var3.field2504 >= var7.field2586.length || var7.field2586[var3.field2504] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field1 = var3.field2598;
                    class32.method585(var8);
                }
            }
        }
    }

    @ObfuscatedName("db.cx(Lee;III)V")
    public static final void method2507(class151 arg0, int arg1, int arg2) {
        if (field475 != null || field395 || arg0 == null) {
            return;
        }
        class151 var3 = method2384(arg0);
        if (var3 == null) {
            var3 = arg0.field2565;
        }
        if (var3 == null) {
            return;
        }
        field475 = arg0;
        class151 var5 = method2384(arg0);
        if (var5 == null) {
            var5 = arg0.field2565;
        }
        field426 = var5;
        field308 = arg1;
        field428 = arg2;
        Statics.field1998 = 0;
        field436 = false;
        if (field396 > 0) {
            int var7 = field396 - 1;
            Statics.field1919 = new class27();
            Statics.field1919.field630 = field276[var7];
            Statics.field1919.field626 = field398[var7];
            Statics.field1919.field628 = field399[var7];
            Statics.field1919.field629 = field400[var7];
            Statics.field1919.field631 = field407[var7];
        }
        return;
    }

    @ObfuscatedName("da.ci(III)V")
    public static void method2373(int arg0, int arg1) {
        class27 var2 = Statics.field1919;
        method2833(var2.field630, var2.field626, var2.field628, var2.field629, var2.field631, var2.field631, arg0, arg1);
        Statics.field1919 = null;
    }

    @ObfuscatedName("em.ct(Lee;I)V")
    public static void method2685(class151 arg0) {
        if (field456 == arg0.field2619) {
            field457[arg0.field2618] = true;
        }
    }

    @ObfuscatedName("s.cs(I)V")
    public static void method158() {
        for (class4 var0 = (class4) field414.method3170(); var0 != null; var0 = (class4) field414.method3174()) {
            int var1 = var0.field62;
            if (class151.method2456(var1)) {
                boolean var2 = true;
                class151[] var3 = Statics.field2616[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2502;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2830;
                    class151 var6 = class151.method2354(var5);
                    if (var6 != null) {
                        method2685(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.cu([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1951(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("s.cm(IB)V")
    public static final void method153(int arg0) {
        if (class151.method2456(arg0)) {
            method438(Statics.field2616[arg0], -1);
        }
    }

    @ObfuscatedName("j.cg([Lee;II)V")
    public static final void method438(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null && var3.field2532 == arg1 && (!var3.field2502 || !method122(var3))) {
                if (var3.field2499 == 0) {
                    if (!var3.field2502 && method122(var3) && Statics.field1862 != var3) {
                        continue;
                    }
                    method438(arg0, var3.field2503);
                    if (var3.field2586 != null) {
                        method438(var3.field2586, var3.field2503);
                    }
                    class4 var4 = (class4) field414.method3171((long) var3.field2503);
                    if (var4 != null) {
                        method153(var4.field62);
                    }
                }
                if (var3.field2499 == 6) {
                    if (var3.field2539 != -1 || var3.field2540 != -1) {
                        boolean var5 = method807(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2540;
                        } else {
                            var6 = var3.field2539;
                        }
                        if (var6 != -1) {
                            class38 var7 = class38.method1866(var6);
                            var3.field2610 += field443;
                            while (var3.field2610 > var7.field881[var3.field2554]) {
                                var3.field2610 -= var7.field881[var3.field2554];
                                var3.field2554++;
                                if (var3.field2554 >= var7.field886.length) {
                                    var3.field2554 -= var7.field890;
                                    if (var3.field2554 < 0 || var3.field2554 >= var7.field886.length) {
                                        var3.field2554 = 0;
                                    }
                                }
                                method2685(var3);
                            }
                        }
                    }
                    if (var3.field2547 != 0 && !var3.field2502) {
                        int var8 = var3.field2547 >> 16;
                        int var9 = var3.field2547 << 16 >> 16;
                        int var10 = field443 * var8;
                        int var11 = field443 * var9;
                        var3.field2551 = var3.field2551 + var10 & 0x7FF;
                        var3.field2611 = var3.field2611 + var11 & 0x7FF;
                        method2685(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.cw(IB)V")
    public static final void method777(int arg0) {
        method158();
        for (class20 var1 = (class20) class20.field538.method3234(); var1 != null; var1 = (class20) class20.field538.method3209()) {
            if (var1.field549 != null) {
                var1.method440();
            }
        }
        int var2 = class46.method118(arg0).field1046;
        if (var2 == 0) {
            return;
        }
        int var3 = class153.field2628[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1805(0.9D);
                ((class88) Statics.field1457).method1855(0.9D);
            }
            if (var3 == 2) {
                class84.method1805(0.8D);
                ((class88) Statics.field1457).method1855(0.8D);
            }
            if (var3 == 3) {
                class84.method1805(0.7D);
                ((class88) Statics.field1457).method1855(0.7D);
            }
            if (var3 == 4) {
                class84.method1805(0.6D);
                ((class88) Statics.field1457).method1855(0.6D);
            }
            class45.field998.method3141();
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
            if (field259 != var4) {
                if (field259 == 0 && field485 != -1) {
                    class160.method456(Statics.field158, field485, 0, var4, false);
                    field486 = false;
                } else if (var4 == 0) {
                    Statics.field2679.method3050();
                    class160.field2683 = 1;
                    Statics.field558 = null;
                    field486 = false;
                } else if (class160.field2683 == 0) {
                    Statics.field2679.method3013(var4);
                } else {
                    Statics.field2684 = var4;
                }
                field259 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field342 = 127;
            }
            if (var3 == 1) {
                field342 = 96;
            }
            if (var3 == 2) {
                field342 = 64;
            }
            if (var3 == 3) {
                field342 = 32;
            }
            if (var3 == 4) {
                field342 = 0;
            }
        }
        if (var2 == 5) {
            field394 = var3;
        }
        if (var2 == 6) {
            field297 = var3;
        }
        if (var2 == 9) {
            field484 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field488 = 127;
            }
            if (var3 == 1) {
                field488 = 96;
            }
            if (var3 == 2) {
                field488 = 64;
            }
            if (var3 == 3) {
                field488 = 32;
            }
            if (var3 == 4) {
                field488 = 0;
            }
        }
        if (var2 == 17) {
            field421 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field401 = (class18) class99.method458(class18.method2579(), var3);
            if (field401 == null) {
                field401 = class18.field513;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field386 = -1;
        } else {
            field386 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("br.ca(Lv;ZI)V")
    public static final void method1591(class4 arg0, boolean arg1) {
        int var2 = arg0.field62;
        int var3 = (int) arg0.field2830;
        arg0.method3268();
        if (arg1) {
            class151.method2882(var2);
        }
        method2688(var2);
        class151 var4 = class151.method2354(var3);
        if (var4 != null) {
            method2685(var4);
        }
        method478();
        if (field251 != -1) {
            int var5 = field251;
            if (class151.method2456(var5)) {
                method1327(Statics.field2616[var5], 1);
            }
        }
    }

    @ObfuscatedName("k.cp(IIII)V")
    public static final void method13(int arg0, int arg1, int arg2) {
        method157();
        class73.method1532(arg0, arg1, Statics.field530.field1307 + arg0, Statics.field530.field1310 + arg1);
        if (field483 == 2 || field483 == 5) {
            class73.method1536(arg0 + 25, arg1 + 5, 0, Statics.field1562, Statics.field1485);
        } else {
            int var3 = field323 + field289 & 0x7FF;
            int var4 = Statics.field1561.field746 / 32 + 48;
            int var5 = 464 - Statics.field1561.field713 / 32;
            Statics.field1519.method1425(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field325 + 256, Statics.field1562, Statics.field1485);
            for (int var6 = 0; var6 < field299; var6++) {
                int var7 = field478[var6] * 4 + 2 - Statics.field1561.field746 / 32;
                int var8 = field380[var6] * 4 + 2 - Statics.field1561.field713 / 32;
                method68(arg0, arg1, var7, var8, field420[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class176 var11 = field387[Statics.field72][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1561.field746 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1561.field713 / 32;
                        method68(arg0, arg1, var12, var13, Statics.field614[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field482; var14++) {
                class30 var15 = field291[field293[var14]];
                if (var15 != null && var15.method20()) {
                    class35 var16 = var15.field678;
                    if (var16 != null && var16.field812 != null) {
                        var16 = var16.method617();
                    }
                    if (var16 != null && var16.field803 && var16.field815) {
                        int var17 = var15.field746 / 32 - Statics.field1561.field746 / 32;
                        int var18 = var15.field713 / 32 - Statics.field1561.field713 / 32;
                        method68(arg0, arg1, var17, var18, Statics.field614[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field373; var19++) {
                class3 var20 = field372[field374[var19]];
                if (var20 != null && var20.method20()) {
                    int var21 = var20.field746 / 32 - Statics.field1561.field746 / 32;
                    int var22 = var20.field713 / 32 - Statics.field1561.field713 / 32;
                    boolean var23 = false;
                    if (method8(var20.field37, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field189; var25++) {
                        if (var20.field37.equals(Statics.field177[var25].field557)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1561.field55 != 0 && var20.field55 != 0 && Statics.field1561.field55 == var20.field55) {
                        var26 = true;
                    }
                    if (var23) {
                        method68(arg0, arg1, var21, var22, Statics.field614[3]);
                    } else if (var26) {
                        method68(arg0, arg1, var21, var22, Statics.field614[4]);
                    } else if (var24) {
                        method68(arg0, arg1, var21, var22, Statics.field614[5]);
                    } else {
                        method68(arg0, arg1, var21, var22, Statics.field614[2]);
                    }
                }
            }
            if (field317 != 0 && field262 % 20 < 10) {
                if (field317 == 1 && field272 >= 0 && field272 < field291.length) {
                    class30 var27 = field291[field272];
                    if (var27 != null) {
                        int var28 = var27.field746 / 32 - Statics.field1561.field746 / 32;
                        int var29 = var27.field713 / 32 - Statics.field1561.field713 / 32;
                        method1953(arg0, arg1, var28, var29, Statics.field819[1]);
                    }
                }
                if (field317 == 2) {
                    int var30 = field506 * 4 - Statics.field966 * 4 + 2 - Statics.field1561.field746 / 32;
                    int var31 = field275 * 4 - Statics.field1047 * 4 + 2 - Statics.field1561.field713 / 32;
                    method1953(arg0, arg1, var30, var31, Statics.field819[1]);
                }
                if (field317 == 10 && field273 >= 0 && field273 < field372.length) {
                    class3 var32 = field372[field273];
                    if (var32 != null) {
                        int var33 = var32.field746 / 32 - Statics.field1561.field746 / 32;
                        int var34 = var32.field713 / 32 - Statics.field1561.field713 / 32;
                        method1953(arg0, arg1, var33, var34, Statics.field819[1]);
                    }
                }
            }
            if (field481 != 0) {
                int var35 = field481 * 4 + 2 - Statics.field1561.field746 / 32;
                int var36 = field318 * 4 + 2 - Statics.field1561.field713 / 32;
                method68(arg0, arg1, var35, var36, Statics.field819[0]);
            }
            class73.method1514(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field483 < 3) {
            Statics.field69.method1425(arg0, arg1, 33, 33, 25, 25, field289, 256, Statics.field146, Statics.field588);
        } else {
            class73.method1536(arg0, arg1, 0, Statics.field146, Statics.field588);
        }
        if (field459[arg2]) {
            Statics.field530.method1564(arg0, arg1);
        }
        field458[arg2] = true;
    }

    @ObfuscatedName("cp.cb(IIIILbe;I)V")
    public static final void method1953(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method68(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field323 + field289 & 0x7FF;
        int var7 = class84.field1472[var6];
        int var8 = class84.field1449[var6];
        int var9 = var7 * 256 / (field325 + 256);
        int var10 = var8 * 256 / (field325 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field893.method1426(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("g.cd(IIIILbe;I)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field323 + field289 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1472[var5];
        int var8 = class84.field1449[var5];
        int var9 = var7 * 256 / (field325 + 256);
        int var10 = var8 * 256 / (field325 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1429(Statics.field530, arg0 + 94 + var11 - arg4.field1290 / 2 + 4, arg1 + 83 - var12 - arg4.field1288 / 2 - 4);
        } else {
            arg4.method1405(arg0 + 94 + var11 - arg4.field1290 / 2 + 4, arg1 + 83 - var12 - arg4.field1288 / 2 - 4);
        }
    }

    @ObfuscatedName("u.cz(Ljava/lang/String;ZI)Z")
    public static boolean method8(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class197.method2459(arg0, Statics.field154);
        for (int var3 = 0; var3 < field501; var3++) {
            if (var2.equalsIgnoreCase(class197.method2459(field503[var3].field223, Statics.field154)) && (!arg1 || field503[var3].field234 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class197.method2459(Statics.field1561.field37, Statics.field154))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eb.co(Ljava/lang/String;I)Z")
    public static boolean method2883(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class197.method2459(arg0, Statics.field154);
        for (int var2 = 0; var2 < field494; var2++) {
            class8 var3 = field465[var2];
            if (var1.equalsIgnoreCase(class197.method2459(var3.field132, Statics.field154))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class197.method2459(var3.field131, Statics.field154))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cd.cv(Ljava/lang/String;I)V")
    public static final void method1960(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field501 < 200 || field336 == 1) || field501 >= 400) {
            class10.method2659(30, "", class142.field2306);
            return;
        }
        String var1 = class197.method2459(arg0, Statics.field154);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field501; var2++) {
            class16 var3 = field503[var2];
            String var4 = class197.method2459(var3.field223, Statics.field154);
            if (var4 != null && var4.equals(var1)) {
                class10.method2659(30, "", arg0 + class142.field2307);
                return;
            }
            if (var3.field231 != null) {
                String var5 = class197.method2459(var3.field231, Statics.field154);
                if (var5 != null && var5.equals(var1)) {
                    class10.method2659(30, "", arg0 + class142.field2307);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field494; var6++) {
            class8 var7 = field465[var6];
            String var8 = class197.method2459(var7.field132, Statics.field154);
            if (var8 != null && var8.equals(var1)) {
                class10.method2659(30, "", class142.field2343 + arg0 + class142.field2313);
                return;
            }
            if (var7.field131 != null) {
                String var9 = class197.method2459(var7.field131, Statics.field154);
                if (var9 != null && var9.equals(var1)) {
                    class10.method2659(30, "", class142.field2343 + arg0 + class142.field2313);
                    return;
                }
            }
        }
        if (class197.method2459(Statics.field1561.field37, Statics.field154).equals(var1)) {
            class10.method2659(30, "", class142.field2273);
        } else {
            field294.method2331(170);
            field294.method2278(class107.method71(arg0));
            field294.method2275(arg0);
        }
    }

    @ObfuscatedName("s.cy(Ljava/lang/String;ZI)V")
    public static final void method155(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field494 < 100 || field336 == 1) || field494 >= 400) {
            class10.method2659(31, "", class142.field2308);
            return;
        }
        String var2 = class197.method2459(arg0, Statics.field154);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field494; var3++) {
            class8 var4 = field465[var3];
            String var5 = class197.method2459(var4.field132, Statics.field154);
            if (var5 != null && var5.equals(var2)) {
                class10.method2659(31, "", arg0 + class142.field2309);
                return;
            }
            if (var4.field131 != null) {
                String var6 = class197.method2459(var4.field131, Statics.field154);
                if (var6 != null && var6.equals(var2)) {
                    class10.method2659(31, "", arg0 + class142.field2309);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field501; var7++) {
            class16 var8 = field503[var7];
            String var9 = class197.method2459(var8.field223, Statics.field154);
            if (var9 != null && var9.equals(var2)) {
                class10.method2659(31, "", class142.field2314 + arg0 + class142.field2315);
                return;
            }
            if (var8.field231 != null) {
                String var10 = class197.method2459(var8.field231, Statics.field154);
                if (var10 != null && var10.equals(var2)) {
                    class10.method2659(31, "", class142.field2314 + arg0 + class142.field2315);
                    return;
                }
            }
        }
        if (class197.method2459(Statics.field1561.field37, Statics.field154).equals(var2)) {
            class10.method2659(31, "", class142.field2311);
        } else {
            field294.method2331(4);
            field294.method2278(class107.method71(arg0));
            field294.method2275(arg0);
        }
    }

    @ObfuscatedName("em.cq(Ljava/lang/String;I)V")
    public static final void method2686(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class197.method2459(arg0, Statics.field154);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field501; var2++) {
            class16 var3 = field503[var2];
            String var4 = var3.field223;
            String var5 = class197.method2459(var4, Statics.field154);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field501--;
                for (int var7 = var2; var7 < field501; var7++) {
                    field503[var7] = field503[var7 + 1];
                }
                field278 = field437;
                field294.method2331(79);
                field294.method2278(class107.method71(arg0));
                field294.method2275(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("aj.ce(Ljava/lang/String;I)V")
    public static final void method775(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class197.method2459(arg0, Statics.field154);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field494; var2++) {
            class8 var3 = field465[var2];
            String var4 = var3.field132;
            String var5 = class197.method2459(var4, Statics.field154);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field494--;
                for (int var7 = var2; var7 < field494; var7++) {
                    field465[var7] = field465[var7 + 1];
                }
                field278 = field437;
                field294.method2331(161);
                field294.method2278(class107.method71(arg0));
                field294.method2275(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("by.cf(Ljava/lang/String;B)V")
    public static final void method1300(String arg0) {
        if (Statics.field177 != null) {
            field294.method2331(216);
            field294.method2278(class107.method71(arg0));
            field294.method2275(arg0);
        }
    }

    @ObfuscatedName("ec.ds(IB)V")
    public static void method2688(int arg0) {
        for (class178 var1 = (class178) field454.method3170(); var1 != null; var1 = (class178) field454.method3174()) {
            if ((var1.field2830 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3268();
            }
        }
    }

    @ObfuscatedName("ao.dd(Lee;I)I")
    public static int method731(class151 arg0) {
        class178 var1 = (class178) field454.method3171(((long) arg0.field2503 << 32) + (long) arg0.field2504);
        return var1 == null ? arg0.field2572 : var1.field2820;
    }

    @ObfuscatedName("dn.do(Lee;I)Lee;")
    public static class151 method2384(class151 arg0) {
        int var1 = class155.method836(method731(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class151.method2354(arg0.field2532);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("f.dk(Lee;I)Z")
    public static boolean method122(class151 arg0) {
        if (field423) {
            if (method731(arg0) != 0) {
                return false;
            }
            if (arg0.field2499 == 0) {
                return false;
            }
        }
        return arg0.field2515;
    }
}

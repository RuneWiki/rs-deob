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
import java.util.Iterator;

public final class client extends class133 {

    @ObfuscatedName("client.e")
    public static boolean field252 = true;

    @ObfuscatedName("client.r")
    public static int field253 = 1;

    @ObfuscatedName("client.a")
    public static int field254 = 0;

    @ObfuscatedName("client.g")
    public static int field480 = 0;

    @ObfuscatedName("client.v")
    public static boolean field250 = false;

    @ObfuscatedName("client.w")
    public static class209[] field512 = new class209[4];

    @ObfuscatedName("client.t")
    public static boolean field257 = false;

    @ObfuscatedName("client.s")
    public static int field333 = 0;

    @ObfuscatedName("client.u")
    public static int field259 = 0;

    @ObfuscatedName("client.j")
    public static boolean field260 = true;

    @ObfuscatedName("client.d")
    public static int field372 = 0;

    @ObfuscatedName("client.l")
    public static long field468 = 1L;

    @ObfuscatedName("client.q")
    public static int field263 = -1;

    @ObfuscatedName("client.h")
    public static int field264 = -1;

    @ObfuscatedName("client.c")
    public static int field265 = -1;

    @ObfuscatedName("client.z")
    public static boolean field510 = true;

    @ObfuscatedName("client.i")
    public static boolean field338 = false;

    @ObfuscatedName("client.ah")
    public static int field493 = 0;

    @ObfuscatedName("client.aj")
    public static int field269 = 0;

    @ObfuscatedName("client.ar")
    public static int field270 = 0;

    @ObfuscatedName("client.al")
    public static int field271 = 0;

    @ObfuscatedName("client.aw")
    public static int field272 = 0;

    @ObfuscatedName("client.ao")
    public static int field486 = 0;

    @ObfuscatedName("client.ax")
    public static int field342 = 0;

    @ObfuscatedName("client.au")
    public static int field275 = 0;

    @ObfuscatedName("client.av")
    public static int field276 = 0;

    @ObfuscatedName("client.ae")
    public static class108 field308 = new class108(new byte[5000]);

    @ObfuscatedName("client.at")
    public static class18 field336 = class18.field519;

    @ObfuscatedName("client.an")
    public static int field279 = 0;

    @ObfuscatedName("client.am")
    public static int field280 = 0;

    @ObfuscatedName("client.ai")
    public static int field281 = 0;

    @ObfuscatedName("client.bz")
    public static int field473 = 0;

    @ObfuscatedName("client.bc")
    public static int field284 = 0;

    @ObfuscatedName("client.bw")
    public static int field285 = 0;

    @ObfuscatedName("client.bs")
    public static int field286 = 0;

    @ObfuscatedName("client.bi")
    public static int field309 = 0;

    @ObfuscatedName("client.bv")
    public static class31[] field415 = new class31[32768];

    @ObfuscatedName("client.by")
    public static int field289 = 0;

    @ObfuscatedName("client.bb")
    public static int[] field290 = new int[32768];

    @ObfuscatedName("client.ch")
    public static class111 field291 = new class111(5000);

    @ObfuscatedName("client.ct")
    public static class111 field292 = new class111(5000);

    @ObfuscatedName("client.ck")
    public static class111 field293 = new class111(5000);

    @ObfuscatedName("client.cn")
    public static int field294 = 0;

    @ObfuscatedName("client.cr")
    public static int field274 = 0;

    @ObfuscatedName("client.ca")
    public static int field296 = 0;

    @ObfuscatedName("client.cq")
    public static int field375 = 0;

    @ObfuscatedName("client.cz")
    public static int field380 = 0;

    @ObfuscatedName("client.cp")
    public static int field299 = 0;

    @ObfuscatedName("client.cv")
    public static int field315 = 0;

    @ObfuscatedName("client.cx")
    public static int field301 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field344 = false;

    @ObfuscatedName("client.cl")
    public static int field357 = 0;

    @ObfuscatedName("client.cj")
    public static int field467 = 0;

    @ObfuscatedName("client.df")
    public static int field305 = 1;

    @ObfuscatedName("client.ds")
    public static int field306 = 0;

    @ObfuscatedName("client.dp")
    public static int field283 = 1;

    @ObfuscatedName("client.du")
    public static int field391 = 0;

    @ObfuscatedName("client.di")
    public static boolean field310 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field278 = new int[4][13][13];

    @ObfuscatedName("client.dy")
    public static final int[] field312 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.do")
    public static int field313 = 0;

    @ObfuscatedName("client.dg")
    public static int field314 = 2;

    @ObfuscatedName("client.dw")
    public static int field484 = 0;

    @ObfuscatedName("client.dl")
    public static int field430 = 2;

    @ObfuscatedName("client.dj")
    public static int field317 = 0;

    @ObfuscatedName("client.dk")
    public static int field318 = 1;

    @ObfuscatedName("client.dm")
    public static int field319 = 0;

    @ObfuscatedName("client.da")
    public static int field478 = 0;

    @ObfuscatedName("client.dv")
    public static int field321 = 2;

    @ObfuscatedName("client.dq")
    public static int field322 = 0;

    @ObfuscatedName("client.ee")
    public static int field323 = 1;

    @ObfuscatedName("client.eh")
    public static int field373 = 0;

    @ObfuscatedName("client.ep")
    public static int field316 = 0;

    @ObfuscatedName("client.ez")
    public static int field327 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field328 = 5063219;

    @ObfuscatedName("client.ej")
    public static int field341 = 3353893;

    @ObfuscatedName("client.ey")
    public static int field330 = 7759444;

    @ObfuscatedName("client.eb")
    public static boolean field331 = false;

    @ObfuscatedName("client.fc")
    public static int field332 = 0;

    @ObfuscatedName("client.fq")
    public static int field339 = 128;

    @ObfuscatedName("client.fy")
    public static int field262 = 0;

    @ObfuscatedName("client.fl")
    public static int field273 = 0;

    @ObfuscatedName("client.fg")
    public static int field490 = 0;

    @ObfuscatedName("client.fz")
    public static int field337 = 0;

    @ObfuscatedName("client.fs")
    public static int field474 = 0;

    @ObfuscatedName("client.fh")
    public static int field325 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field340 = false;

    @ObfuscatedName("client.fn")
    public static int field303 = 0;

    @ObfuscatedName("client.fu")
    public static int field423 = 0;

    @ObfuscatedName("client.fd")
    public static int field343 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field300 = new int[field343];

    @ObfuscatedName("client.ff")
    public static int[] field345 = new int[field343];

    @ObfuscatedName("client.fr")
    public static int[] field261 = new int[field343];

    @ObfuscatedName("client.fa")
    public static int[] field347 = new int[field343];

    @ObfuscatedName("client.fx")
    public static int[] field348 = new int[field343];

    @ObfuscatedName("client.fv")
    public static int[] field349 = new int[field343];

    @ObfuscatedName("client.fj")
    public static int[] field350 = new int[field343];

    @ObfuscatedName("client.gr")
    public static String[] field351 = new String[field343];

    @ObfuscatedName("client.gn")
    public static int[][] field368 = new int[104][104];

    @ObfuscatedName("client.gt")
    public static int field498 = 0;

    @ObfuscatedName("client.gq")
    public static int field436 = -1;

    @ObfuscatedName("client.gz")
    public static int field355 = -1;

    @ObfuscatedName("client.gv")
    public static int field502 = 0;

    @ObfuscatedName("client.gx")
    public static int field383 = 0;

    @ObfuscatedName("client.gd")
    public static int field358 = 0;

    @ObfuscatedName("client.ge")
    public static int field359 = 0;

    @ObfuscatedName("client.gb")
    public static int field360 = 0;

    @ObfuscatedName("client.gy")
    public static int field361 = 0;

    @ObfuscatedName("client.gs")
    public static int field362 = 0;

    @ObfuscatedName("client.gw")
    public static int field363 = 0;

    @ObfuscatedName("client.gu")
    public static int field364 = 0;

    @ObfuscatedName("client.gl")
    public static int field367 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field366 = false;

    @ObfuscatedName("client.ga")
    public static int field356 = 0;

    @ObfuscatedName("client.gf")
    public static int field457 = 0;

    @ObfuscatedName("client.gj")
    public static class3[] field369 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field412 = 0;

    @ObfuscatedName("client.gi")
    public static int[] field371 = new int[2048];

    @ObfuscatedName("client.hs")
    public static int field353 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field346 = new int[2048];

    @ObfuscatedName("client.hm")
    public static class108[] field324 = new class108[2048];

    @ObfuscatedName("client.hj")
    public static int field311 = -1;

    @ObfuscatedName("client.hz")
    public static int field376 = 0;

    @ObfuscatedName("client.hd")
    public static int field354 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field258 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field329 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field256 = new String[8];

    @ObfuscatedName("client.hl")
    public static boolean[] field382 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field454 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field384 = -1;

    @ObfuscatedName("client.hw")
    public static class180[][][] field393 = new class180[4][104][104];

    @ObfuscatedName("client.hx")
    public static class180 field385 = new class180();

    @ObfuscatedName("client.he")
    public static class180 field387 = new class180();

    @ObfuscatedName("client.hg")
    public static class180 field388 = new class180();

    @ObfuscatedName("client.hh")
    public static int[] field389 = new int[25];

    @ObfuscatedName("client.ho")
    public static int[] field390 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field458 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field392 = 0;

    @ObfuscatedName("client.hc")
    public static boolean field379 = false;

    @ObfuscatedName("client.ik")
    public static int field394 = 0;

    @ObfuscatedName("client.iv")
    public static int[] field307 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field266 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field397 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field398 = new int[500];

    @ObfuscatedName("client.ib")
    public static String[] field399 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field400 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field401 = -1;

    @ObfuscatedName("client.ip")
    public static int field402 = -1;

    @ObfuscatedName("client.il")
    public static int field381 = 0;

    @ObfuscatedName("client.ii")
    public static int field404 = 50;

    @ObfuscatedName("client.ij")
    public static int field405 = 0;

    @ObfuscatedName("client.it")
    public static String field406 = null;

    @ObfuscatedName("client.iw")
    public static boolean field374 = false;

    @ObfuscatedName("client.id")
    public static int field408 = -1;

    @ObfuscatedName("client.ig")
    public static int field508 = -1;

    @ObfuscatedName("client.jt")
    public static String field410 = null;

    @ObfuscatedName("client.jl")
    public static String field302 = null;

    @ObfuscatedName("client.jc")
    public static int field334 = -1;

    @ObfuscatedName("client.jb")
    public static class177 field413 = new class177(8);

    @ObfuscatedName("client.jz")
    public static int field414 = 0;

    @ObfuscatedName("client.jk")
    public static int field365 = 0;

    @ObfuscatedName("client.jh")
    public static class155 field416 = null;

    @ObfuscatedName("client.jp")
    public static int field417 = 0;

    @ObfuscatedName("client.jn")
    public static int field418 = 0;

    @ObfuscatedName("client.jq")
    public static int field419 = 0;

    @ObfuscatedName("client.jr")
    public static int field420 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field421 = false;

    @ObfuscatedName("client.jv")
    public static boolean field320 = false;

    @ObfuscatedName("client.jx")
    public static boolean field483 = false;

    @ObfuscatedName("client.je")
    public static class155 field424 = null;

    @ObfuscatedName("client.jw")
    public static class155 field425 = null;

    @ObfuscatedName("client.js")
    public static int field426 = 0;

    @ObfuscatedName("client.ju")
    public static int field427 = 0;

    @ObfuscatedName("client.jf")
    public static class155 field428 = null;

    @ObfuscatedName("client.jo")
    public static boolean field429 = false;

    @ObfuscatedName("client.jy")
    public static int field255 = -1;

    @ObfuscatedName("client.jj")
    public static int field431 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field432 = false;

    @ObfuscatedName("client.jg")
    public static int field433 = -1;

    @ObfuscatedName("client.ja")
    public static int field434 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field435 = false;

    @ObfuscatedName("client.kb")
    public static int field495 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field437 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field438 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field439 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field440 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field441 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field442 = 0;

    @ObfuscatedName("client.kr")
    public static int field443 = 0;

    @ObfuscatedName("client.kh")
    public static int field444 = 0;

    @ObfuscatedName("client.kq")
    public static int field445 = 0;

    @ObfuscatedName("client.kv")
    public static int field446 = 0;

    @ObfuscatedName("client.kw")
    public static int field447 = 0;

    @ObfuscatedName("client.ke")
    public static int field448 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field449 = new int[2000];

    @ObfuscatedName("client.kx")
    public static String[] field450 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field295 = 0;

    @ObfuscatedName("client.kj")
    public static class180 field452 = new class180();

    @ObfuscatedName("client.km")
    public static class180 field453 = new class180();

    @ObfuscatedName("client.ln")
    public static class180 field297 = new class180();

    @ObfuscatedName("client.lv")
    public static class177 field455 = new class177(512);

    @ObfuscatedName("client.lp")
    public static int field456 = 0;

    @ObfuscatedName("client.lq")
    public static int field267 = -2;

    @ObfuscatedName("client.lb")
    public static boolean[] field506 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field459 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field460 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field395 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field463 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field464 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field465 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field304 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field407 = 0;

    @ObfuscatedName("client.lk")
    public static int field466 = 0;

    @ObfuscatedName("client.lj")
    public static String field469 = "";

    @ObfuscatedName("client.le")
    public static long[] field470 = new long[100];

    @ObfuscatedName("client.lw")
    public static int field471 = 0;

    @ObfuscatedName("client.lu")
    public static int field504 = 0;

    @ObfuscatedName("client.la")
    public static int[] field451 = new int[128];

    @ObfuscatedName("client.ld")
    public static int[] field485 = new int[128];

    @ObfuscatedName("client.lg")
    public static long field475 = -1L;

    @ObfuscatedName("client.ma")
    public static String field476 = null;

    @ObfuscatedName("client.mu")
    public static String field477 = null;

    @ObfuscatedName("client.mb")
    public static int field472 = -1;

    @ObfuscatedName("client.mw")
    public static int field370 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field378 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field481 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class73[] field482 = new class73[1000];

    @ObfuscatedName("client.me")
    public static int field462 = 0;

    @ObfuscatedName("client.md")
    public static int field298 = 0;

    @ObfuscatedName("client.my")
    public static int field335 = 0;

    @ObfuscatedName("client.mv")
    public static int field479 = 255;

    @ObfuscatedName("client.mh")
    public static int field487 = -1;

    @ObfuscatedName("client.mc")
    public static boolean field488 = false;

    @ObfuscatedName("client.mz")
    public static int field489 = 127;

    @ObfuscatedName("client.mi")
    public static int field268 = 127;

    @ObfuscatedName("client.nb")
    public static int field492 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field352 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field409 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.nl")
    public static class53[] field497 = new class53[50];

    @ObfuscatedName("client.nn")
    public static boolean field288 = false;

    @ObfuscatedName("client.nr")
    public static boolean[] field499 = new boolean[5];

    @ObfuscatedName("client.nf")
    public static int[] field500 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field501 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field422 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field503 = new int[5];

    @ObfuscatedName("client.ou")
    public static int field396 = 0;

    @ObfuscatedName("client.oi")
    public static int field505 = 0;

    @ObfuscatedName("client.ok")
    public static class16[] field277 = new class16[400];

    @ObfuscatedName("client.om")
    public static class176 field507 = new class176();

    @ObfuscatedName("client.os")
    public static int field403 = 0;

    @ObfuscatedName("client.ol")
    public static class8[] field509 = new class8[400];

    @ObfuscatedName("client.ob")
    public static class160 field411 = new class160();

    @ObfuscatedName("client.of")
    public static int field511 = -1;

    @ObfuscatedName("client.oe")
    public static int field287 = -1;

    @ObfuscatedName("client.oa")
    public static class201[] field513 = new class201[6];

    @ObfuscatedName("client.e(B)V")
    public final void method442() {
    }

    public final void init() {
        if (!this.method2639()) {
            return;
        }
        class171[] var1 = Statics.method2007();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class171 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2830);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2830)) {
                    case 1:
                        class142[] var5 = new class142[] { class142.field2146, class142.field2147, class142.field2148, class142.field2156, class142.field2149, class142.field2151 };
                        Statics.field615 = (class142) class100.method2706(var5, Integer.parseInt(var4));
                        if (Statics.field615 == class142.field2151) {
                            Statics.field2060 = class193.field2898;
                        } else {
                            Statics.field2060 = class193.field2904;
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                        }
                    case 3:
                    default:
                        break;
                    case 4:
                        Statics.field907 = var4;
                        break;
                    case 5:
                        field333 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field254 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field2104 = class141.method170(Integer.parseInt(var4));
                        break;
                    case 8:
                        field480 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                            field250 = true;
                        } else {
                            field250 = false;
                        }
                        break;
                    case 10:
                        field253 = Integer.parseInt(var4);
                }
            }
        }
        method2419();
        Statics.field2468 = this.getCodeBase().getHost();
        String var6 = Statics.field2104.field2140;
        byte var7 = 0;
        try {
            class138.method2006("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class137.method94((String) null, var9);
        }
        Statics.field251 = this;
        this.method2640(765, 503, 67);
    }

    @ObfuscatedName("db.a(I)V")
    public static final void method2419() {
        class80.field1419 = false;
        field257 = false;
    }

    @ObfuscatedName("client.n(B)V")
    public final void method189() {
        Statics.field601 = field480 == 0 ? 43594 : field253 + 40000;
        Statics.field201 = field480 == 0 ? 443 : field253 + 50000;
        Statics.field571 = Statics.field601;
        Statics.field2693 = class156.field2673;
        Statics.field2507 = class156.field2672;
        Statics.field2687 = class156.field2674;
        Statics.field1287 = class156.field2675;
        if (Statics.field1959.toLowerCase().indexOf("microsoft") == -1) {
            class126.field1991[44] = 71;
            class126.field1991[45] = 26;
            class126.field1991[46] = 72;
            class126.field1991[47] = 73;
            class126.field1991[59] = 57;
            class126.field1991[61] = 27;
            class126.field1991[91] = 42;
            class126.field1991[92] = 74;
            class126.field1991[93] = 43;
            class126.field1991[192] = 28;
            class126.field1991[222] = 58;
            class126.field1991[520] = 59;
        } else {
            class126.field1991[186] = 57;
            class126.field1991[187] = 27;
            class126.field1991[188] = 71;
            class126.field1991[189] = 26;
            class126.field1991[190] = 72;
            class126.field1991[191] = 73;
            class126.field1991[192] = 58;
            class126.field1991[219] = 42;
            class126.field1991[220] = 74;
            class126.field1991[221] = 43;
            class126.field1991[222] = 59;
            class126.field1991[223] = 28;
        }
        Canvas var1 = Statics.field543;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class126.field1985);
        var1.addFocusListener(class126.field1985);
        class129.method499(Statics.field543);
        Statics.field1920 = class120.method2464();
        if (Statics.field1920 != null) {
            Statics.field1920.method2475(Statics.field543);
        }
        Statics.field525 = new class123(255, class138.field2113, class138.field2114, 500000);
        Statics.field184 = class9.method743();
        Statics.field1364 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field1531;
        class127.field2001 = this;
        class127.field1996 = var3;
        if (field480 != 0) {
            field338 = true;
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method190() {
        field372++;
        this.method386();
        while (true) {
            class180 var1 = class152.field2513;
            class151 var2;
            synchronized (class152.field2513) {
                var2 = (class151) class152.field2512.method3275();
            }
            if (var2 == null) {
                class164.method2015();
                method2014();
                class126 var4 = class126.field1985;
                synchronized (class126.field1985) {
                    class126.field1990++;
                    class126.field1987 = class126.field1976;
                    class126.field1984 = 0;
                    if (class126.field1982 >= 0) {
                        while (class126.field1982 != class126.field1981) {
                            int var6 = class126.field1980[class126.field1981];
                            class126.field1981 = class126.field1981 + 1 & 0x7F;
                            if (var6 < 0) {
                                class126.field1979[~var6] = false;
                            } else {
                                if (!class126.field1979[var6] && class126.field1984 < class126.field1994.length - 1) {
                                    class126.field1994[++class126.field1984 - 1] = var6;
                                }
                                class126.field1979[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class126.field1979[var5] = false;
                        }
                        class126.field1982 = class126.field1981;
                    }
                    class126.field1976 = class126.field1988;
                }
                class129.method2087();
                if (Statics.field1920 != null) {
                    int var8 = Statics.field1920.method2477();
                    field295 = var8;
                }
                if (field259 == 0) {
                    method2462();
                    class133.method872();
                } else if (field259 == 5) {
                    class29.method36(this);
                    method2462();
                    class133.method872();
                } else if (field259 == 10 || field259 == 11) {
                    class29.method36(this);
                } else if (field259 == 20) {
                    class29.method36(this);
                    method1372();
                } else if (field259 == 25) {
                    method26(false);
                    field467 = 0;
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field173.length; var10++) {
                        if (Statics.field625[var10] != -1 && Statics.field173[var10] == null) {
                            Statics.field173[var10] = Statics.field706.method2763(Statics.field625[var10], 0);
                            if (Statics.field173[var10] == null) {
                                var9 = false;
                                field467++;
                            }
                        }
                        if (Statics.field936[var10] != -1 && Statics.field2100[var10] == null) {
                            Statics.field2100[var10] = Statics.field706.method2764(Statics.field936[var10], 0, Statics.field1366[var10]);
                            if (Statics.field2100[var10] == null) {
                                var9 = false;
                                field467++;
                            }
                        }
                    }
                    if (var9) {
                        field306 = 0;
                        boolean var11 = true;
                        for (int var12 = 0; var12 < Statics.field173.length; var12++) {
                            byte[] var13 = Statics.field2100[var12];
                            if (var13 != null) {
                                int var14 = (Statics.field192[var12] >> 8) * 64 - Statics.field140;
                                int var15 = (Statics.field192[var12] & 0xFF) * 64 - Statics.field737;
                                if (field310) {
                                    var14 = 10;
                                    var15 = 10;
                                }
                                var11 &= class6.method1907(var13, var14, var15);
                            }
                        }
                        if (var11) {
                            if (field391 != 0) {
                                method558(class145.field2179 + class2.field20 + class2.field17 + 100 + "%" + class2.field14, true);
                            }
                            method2014();
                            method2442();
                            method2014();
                            Statics.field736.method1653();
                            method2014();
                            System.gc();
                            for (int var16 = 0; var16 < 4; var16++) {
                                field512[var16].method3600();
                            }
                            for (int var17 = 0; var17 < 4; var17++) {
                                for (int var18 = 0; var18 < 104; var18++) {
                                    for (int var19 = 0; var19 < 104; var19++) {
                                        class6.field65[var17][var18][var19] = 0;
                                    }
                                }
                            }
                            method2014();
                            class6.method1647();
                            int var20 = Statics.field173.length;
                            class21.method1915();
                            method26(true);
                            if (!field310) {
                                int var21 = 0;
                                label1208: while (true) {
                                    if (var21 >= var20) {
                                        for (int var35 = 0; var35 < var20; var35++) {
                                            int var36 = (Statics.field192[var35] >> 8) * 64 - Statics.field140;
                                            int var37 = (Statics.field192[var35] & 0xFF) * 64 - Statics.field737;
                                            byte[] var38 = Statics.field173[var35];
                                            if (var38 == null && Statics.field137 < 800) {
                                                method2014();
                                                class6.method153(var36, var37, 64, 64);
                                            }
                                        }
                                        method26(true);
                                        int var39 = 0;
                                        while (true) {
                                            if (var39 >= var20) {
                                                break label1208;
                                            }
                                            byte[] var40 = Statics.field2100[var39];
                                            if (var40 != null) {
                                                int var41 = (Statics.field192[var39] >> 8) * 64 - Statics.field140;
                                                int var42 = (Statics.field192[var39] & 0xFF) * 64 - Statics.field737;
                                                method2014();
                                                class80 var43 = Statics.field736;
                                                class209[] var44 = field512;
                                                class108 var45 = new class108(var40);
                                                int var46 = -1;
                                                while (true) {
                                                    int var47 = var45.method2171();
                                                    if (var47 == 0) {
                                                        break;
                                                    }
                                                    var46 += var47;
                                                    int var48 = 0;
                                                    while (true) {
                                                        int var49 = var45.method2171();
                                                        if (var49 == 0) {
                                                            break;
                                                        }
                                                        var48 += var49 - 1;
                                                        int var50 = var48 & 0x3F;
                                                        int var51 = var48 >> 6 & 0x3F;
                                                        int var52 = var48 >> 12;
                                                        int var53 = var45.method2158();
                                                        int var54 = var53 >> 2;
                                                        int var55 = var53 & 0x3;
                                                        int var56 = var41 + var51;
                                                        int var57 = var42 + var50;
                                                        if (var56 > 0 && var57 > 0 && var56 < 103 && var57 < 103) {
                                                            int var58 = var52;
                                                            if ((class6.field65[1][var56][var57] & 0x2) == 2) {
                                                                var58 = var52 - 1;
                                                            }
                                                            class209 var59 = null;
                                                            if (var58 >= 0) {
                                                                var59 = var44[var58];
                                                            }
                                                            class6.method1920(var52, var56, var57, var46, var55, var54, var43, var59);
                                                        }
                                                    }
                                                }
                                            }
                                            var39++;
                                        }
                                    }
                                    int var22 = (Statics.field192[var21] >> 8) * 64 - Statics.field140;
                                    int var23 = (Statics.field192[var21] & 0xFF) * 64 - Statics.field737;
                                    byte[] var24 = Statics.field173[var21];
                                    if (var24 != null) {
                                        method2014();
                                        int var25 = Statics.field2169 * 8 - 48;
                                        int var26 = Statics.field137 * 8 - 48;
                                        class209[] var27 = field512;
                                        int var28 = 0;
                                        label1205: while (true) {
                                            if (var28 >= 4) {
                                                class108 var31 = new class108(var24);
                                                int var32 = 0;
                                                while (true) {
                                                    if (var32 >= 4) {
                                                        break label1205;
                                                    }
                                                    for (int var33 = 0; var33 < 64; var33++) {
                                                        for (int var34 = 0; var34 < 64; var34++) {
                                                            class6.method164(var31, var32, var22 + var33, var23 + var34, var25, var26, 0);
                                                        }
                                                    }
                                                    var32++;
                                                }
                                            }
                                            for (int var29 = 0; var29 < 64; var29++) {
                                                for (int var30 = 0; var30 < 64; var30++) {
                                                    if (var22 + var29 > 0 && var22 + var29 < 103 && var23 + var30 > 0 && var23 + var30 < 103) {
                                                        var27[var28].field3007[var22 + var29][var23 + var30] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var28++;
                                        }
                                    }
                                    var21++;
                                }
                            }
                            if (field310) {
                                int var60 = 0;
                                label1141: while (true) {
                                    if (var60 >= 4) {
                                        for (int var98 = 0; var98 < 13; var98++) {
                                            for (int var99 = 0; var99 < 13; var99++) {
                                                int var100 = field278[0][var98][var99];
                                                if (var100 == -1) {
                                                    class6.method153(var98 * 8, var99 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method26(true);
                                        int var101 = 0;
                                        while (true) {
                                            if (var101 >= 4) {
                                                break label1141;
                                            }
                                            method2014();
                                            for (int var102 = 0; var102 < 13; var102++) {
                                                label1030: for (int var103 = 0; var103 < 13; var103++) {
                                                    int var104 = field278[var101][var102][var103];
                                                    if (var104 != -1) {
                                                        int var105 = var104 >> 24 & 0x3;
                                                        int var106 = var104 >> 1 & 0x3;
                                                        int var107 = var104 >> 14 & 0x3FF;
                                                        int var108 = var104 >> 3 & 0x7FF;
                                                        int var109 = (var107 / 8 << 8) + var108 / 8;
                                                        for (int var110 = 0; var110 < Statics.field192.length; var110++) {
                                                            if (Statics.field192[var110] == var109 && Statics.field2100[var110] != null) {
                                                                byte[] var111 = Statics.field2100[var110];
                                                                int var112 = var102 * 8;
                                                                int var113 = var103 * 8;
                                                                int var114 = (var107 & 0x7) * 8;
                                                                int var115 = (var108 & 0x7) * 8;
                                                                class80 var116 = Statics.field736;
                                                                class209[] var117 = field512;
                                                                class108 var118 = new class108(var111);
                                                                int var119 = -1;
                                                                while (true) {
                                                                    int var120 = var118.method2171();
                                                                    if (var120 == 0) {
                                                                        continue label1030;
                                                                    }
                                                                    var119 += var120;
                                                                    int var121 = 0;
                                                                    while (true) {
                                                                        int var122 = var118.method2171();
                                                                        if (var122 == 0) {
                                                                            break;
                                                                        }
                                                                        var121 += var122 - 1;
                                                                        int var123 = var121 & 0x3F;
                                                                        int var124 = var121 >> 6 & 0x3F;
                                                                        int var125 = var121 >> 12;
                                                                        int var126 = var118.method2158();
                                                                        int var127 = var126 >> 2;
                                                                        int var128 = var126 & 0x3;
                                                                        if (var105 == var125 && var124 >= var114 && var124 < var114 + 8 && var123 >= var115 && var123 < var115 + 8) {
                                                                            class37 var129 = Statics.method644(var119);
                                                                            int var130 = var112 + class158.method2392(var124 & 0x7, var123 & 0x7, var106, var129.field849, var129.field864, var128);
                                                                            int var131 = var113 + class158.method514(var124 & 0x7, var123 & 0x7, var106, var129.field849, var129.field864, var128);
                                                                            if (var130 > 0 && var131 > 0 && var130 < 103 && var131 < 103) {
                                                                                int var132 = var101;
                                                                                if ((class6.field65[1][var130][var131] & 0x2) == 2) {
                                                                                    var132 = var101 - 1;
                                                                                }
                                                                                class209 var133 = null;
                                                                                if (var132 >= 0) {
                                                                                    var133 = var117[var132];
                                                                                }
                                                                                class6.method1920(var101, var130, var131, var119, var106 + var128 & 0x3, var127, var116, var133);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var101++;
                                        }
                                    }
                                    method2014();
                                    for (int var61 = 0; var61 < 13; var61++) {
                                        for (int var62 = 0; var62 < 13; var62++) {
                                            boolean var63 = false;
                                            int var64 = field278[var60][var61][var62];
                                            if (var64 != -1) {
                                                int var65 = var64 >> 24 & 0x3;
                                                int var66 = var64 >> 1 & 0x3;
                                                int var67 = var64 >> 14 & 0x3FF;
                                                int var68 = var64 >> 3 & 0x7FF;
                                                int var69 = (var67 / 8 << 8) + var68 / 8;
                                                for (int var70 = 0; var70 < Statics.field192.length; var70++) {
                                                    if (Statics.field192[var70] == var69 && Statics.field173[var70] != null) {
                                                        byte[] var71 = Statics.field173[var70];
                                                        int var72 = var61 * 8;
                                                        int var73 = var62 * 8;
                                                        int var74 = (var67 & 0x7) * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        class209[] var76 = field512;
                                                        for (int var77 = 0; var77 < 8; var77++) {
                                                            for (int var78 = 0; var78 < 8; var78++) {
                                                                if (var72 + var77 > 0 && var72 + var77 < 103 && var73 + var78 > 0 && var73 + var78 < 103) {
                                                                    var76[var60].field3007[var72 + var77][var73 + var78] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class108 var79 = new class108(var71);
                                                        for (int var80 = 0; var80 < 4; var80++) {
                                                            for (int var81 = 0; var81 < 64; var81++) {
                                                                for (int var82 = 0; var82 < 64; var82++) {
                                                                    if (var65 == var80 && var81 >= var74 && var81 < var74 + 8 && var82 >= var75 && var82 < var75 + 8) {
                                                                        int var86 = var81 & 0x7;
                                                                        int var87 = var82 & 0x7;
                                                                        int var89 = var66 & 0x3;
                                                                        int var90;
                                                                        if (var89 == 0) {
                                                                            var90 = var86;
                                                                        } else if (var89 == 1) {
                                                                            var90 = var87;
                                                                        } else if (var89 == 2) {
                                                                            var90 = 7 - var86;
                                                                        } else {
                                                                            var90 = 7 - var87;
                                                                        }
                                                                        class6.method164(var79, var60, var72 + var90, var73 + class158.method2574(var81 & 0x7, var82 & 0x7, var66), 0, 0, var66);
                                                                    } else {
                                                                        class6.method164(var79, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var63 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var63) {
                                                int var91 = var60;
                                                int var92 = var61 * 8;
                                                int var93 = var62 * 8;
                                                for (int var94 = 0; var94 < 8; var94++) {
                                                    for (int var95 = 0; var95 < 8; var95++) {
                                                        class6.field76[var91][var92 + var94][var93 + var95] = 0;
                                                    }
                                                }
                                                if (var92 > 0) {
                                                    for (int var96 = 1; var96 < 8; var96++) {
                                                        class6.field76[var91][var92][var93 + var96] = class6.field76[var91][var92 - 1][var93 + var96];
                                                    }
                                                }
                                                if (var93 > 0) {
                                                    for (int var97 = 1; var97 < 8; var97++) {
                                                        class6.field76[var91][var92 + var97][var93] = class6.field76[var91][var92 + var97][var93 - 1];
                                                    }
                                                }
                                                if (var92 > 0 && class6.field76[var91][var92 - 1][var93] != 0) {
                                                    class6.field76[var91][var92][var93] = class6.field76[var91][var92 - 1][var93];
                                                } else if (var93 > 0 && class6.field76[var91][var92][var93 - 1] != 0) {
                                                    class6.field76[var91][var92][var93] = class6.field76[var91][var92][var93 - 1];
                                                } else if (var92 > 0 && var93 > 0 && class6.field76[var91][var92 - 1][var93 - 1] != 0) {
                                                    class6.field76[var91][var92][var93] = class6.field76[var91][var92 - 1][var93 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var60++;
                                }
                            }
                            method26(true);
                            method2442();
                            method2014();
                            class80 var134 = Statics.field736;
                            class209[] var135 = field512;
                            for (int var136 = 0; var136 < 4; var136++) {
                                for (int var137 = 0; var137 < 104; var137++) {
                                    for (int var138 = 0; var138 < 104; var138++) {
                                        if ((class6.field65[var136][var137][var138] & 0x1) == 1) {
                                            int var139 = var136;
                                            if ((class6.field65[1][var137][var138] & 0x2) == 2) {
                                                var139 = var136 - 1;
                                            }
                                            if (var139 >= 0) {
                                                var135[var139].method3613(var137, var138);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field72 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field72 < -8) {
                                class6.field72 = -8;
                            }
                            if (class6.field72 > 8) {
                                class6.field72 = 8;
                            }
                            class6.field77 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field77 < -16) {
                                class6.field77 = -16;
                            }
                            if (class6.field77 > 16) {
                                class6.field77 = 16;
                            }
                            for (int var140 = 0; var140 < 4; var140++) {
                                byte[][] var141 = Statics.field85[var140];
                                int var142 = (int) Math.sqrt(5100.0D);
                                int var143 = var142 * 768 >> 8;
                                for (int var144 = 1; var144 < 103; var144++) {
                                    for (int var145 = 1; var145 < 103; var145++) {
                                        int var146 = class6.field76[var140][var145 + 1][var144] - class6.field76[var140][var145 - 1][var144];
                                        int var147 = class6.field76[var140][var145][var144 + 1] - class6.field76[var140][var145][var144 - 1];
                                        int var148 = (int) Math.sqrt((double) (var147 * var147 + var146 * var146 + 65536));
                                        int var149 = (var146 << 8) / var148;
                                        int var150 = 65536 / var148;
                                        int var151 = (var147 << 8) / var148;
                                        int var152 = (var151 * -50 + var149 * -50 + var150 * -10) / var143 + 96;
                                        int var153 = (var141[var145][var144] >> 1) + (var141[var145][var144 + 1] >> 3) + (var141[var145][var144 - 1] >> 2) + (var141[var145 - 1][var144] >> 2) + (var141[var145 + 1][var144] >> 3);
                                        Statics.field55[var145][var144] = var152 - var153;
                                    }
                                }
                                for (int var154 = 0; var154 < 104; var154++) {
                                    Statics.field1543[var154] = 0;
                                    Statics.field69[var154] = 0;
                                    Statics.field702[var154] = 0;
                                    Statics.field635[var154] = 0;
                                    Statics.field1900[var154] = 0;
                                }
                                for (int var155 = -5; var155 < 109; var155++) {
                                    for (int var156 = 0; var156 < 104; var156++) {
                                        int var157 = var155 + 5;
                                        int var10002;
                                        if (var157 >= 0 && var157 < 104) {
                                            int var158 = Statics.field67[var140][var157][var156] & 0xFF;
                                            if (var158 > 0) {
                                                class38 var159 = class38.method529(var158 - 1);
                                                Statics.field1543[var156] += var159.field901;
                                                Statics.field69[var156] += var159.field904;
                                                Statics.field702[var156] += var159.field908;
                                                Statics.field635[var156] += var159.field906;
                                                var10002 = Statics.field1900[var156]++;
                                            }
                                        }
                                        int var160 = var155 - 5;
                                        if (var160 >= 0 && var160 < 104) {
                                            int var161 = Statics.field67[var140][var160][var156] & 0xFF;
                                            if (var161 > 0) {
                                                class38 var162 = class38.method529(var161 - 1);
                                                Statics.field1543[var156] -= var162.field901;
                                                Statics.field69[var156] -= var162.field904;
                                                Statics.field702[var156] -= var162.field908;
                                                Statics.field635[var156] -= var162.field906;
                                                var10002 = Statics.field1900[var156]--;
                                            }
                                        }
                                    }
                                    if (var155 >= 1 && var155 < 103) {
                                        int var163 = 0;
                                        int var164 = 0;
                                        int var165 = 0;
                                        int var166 = 0;
                                        int var167 = 0;
                                        for (int var168 = -5; var168 < 109; var168++) {
                                            int var169 = var168 + 5;
                                            if (var169 >= 0 && var169 < 104) {
                                                var163 += Statics.field1543[var169];
                                                var164 += Statics.field69[var169];
                                                var165 += Statics.field702[var169];
                                                var166 += Statics.field635[var169];
                                                var167 += Statics.field1900[var169];
                                            }
                                            int var170 = var168 - 5;
                                            if (var170 >= 0 && var170 < 104) {
                                                var163 -= Statics.field1543[var170];
                                                var164 -= Statics.field69[var170];
                                                var165 -= Statics.field702[var170];
                                                var166 -= Statics.field635[var170];
                                                var167 -= Statics.field1900[var170];
                                            }
                                            if (var168 >= 1 && var168 < 103 && (!field257 || (class6.field65[0][var155][var168] & 0x2) != 0 || (class6.field65[var140][var155][var168] & 0x10) == 0 && class6.method729(var140, var155, var168) == field357)) {
                                                if (var140 < class6.field66) {
                                                    class6.field66 = var140;
                                                }
                                                int var171 = Statics.field67[var140][var155][var168] & 0xFF;
                                                int var172 = Statics.field3008[var140][var155][var168] & 0xFF;
                                                if (var171 > 0 || var172 > 0) {
                                                    int var173 = class6.field76[var140][var155][var168];
                                                    int var174 = class6.field76[var140][var155 + 1][var168];
                                                    int var175 = class6.field76[var140][var155 + 1][var168 + 1];
                                                    int var176 = class6.field76[var140][var155][var168 + 1];
                                                    int var177 = Statics.field55[var155][var168];
                                                    int var178 = Statics.field55[var155 + 1][var168];
                                                    int var179 = Statics.field55[var155 + 1][var168 + 1];
                                                    int var180 = Statics.field55[var155][var168 + 1];
                                                    int var181 = -1;
                                                    int var182 = -1;
                                                    if (var171 > 0) {
                                                        int var183 = var163 * 256 / var166;
                                                        int var184 = var164 / var167;
                                                        int var185 = var165 / var167;
                                                        var181 = class6.method2849(var183, var184, var185);
                                                        int var186 = class6.field72 + var183 & 0xFF;
                                                        int var187 = class6.field77 + var185;
                                                        if (var187 < 0) {
                                                            var187 = 0;
                                                        } else if (var187 > 255) {
                                                            var187 = 255;
                                                        }
                                                        var182 = class6.method2849(var186, var184, var187);
                                                    }
                                                    if (var140 > 0) {
                                                        boolean var188 = true;
                                                        if (var171 == 0 && Statics.field540[var140][var155][var168] != 0) {
                                                            var188 = false;
                                                        }
                                                        if (var172 > 0 && !class42.method552(var172 - 1).field989) {
                                                            var188 = false;
                                                        }
                                                        if (var188 && var173 == var174 && var173 == var175 && var173 == var176) {
                                                            Statics.field987[var140][var155][var168] |= 0x924;
                                                        }
                                                    }
                                                    int var189 = 0;
                                                    if (var182 != -1) {
                                                        var189 = class85.field1493[class6.method2951(var182, 96)];
                                                    }
                                                    if (var172 == 0) {
                                                        var134.method1756(var140, var155, var168, 0, 0, -1, var173, var174, var175, var176, class6.method2951(var181, var177), class6.method2951(var181, var178), class6.method2951(var181, var179), class6.method2951(var181, var180), 0, 0, 0, 0, var189, 0);
                                                    } else {
                                                        int var190 = Statics.field540[var140][var155][var168] + 1;
                                                        byte var191 = Statics.field82[var140][var155][var168];
                                                        class42 var192 = class42.method552(var172 - 1);
                                                        int var193 = var192.field977;
                                                        int var194;
                                                        int var195;
                                                        if (var193 >= 0) {
                                                            var194 = Statics.field1494.method1891(var193);
                                                            var195 = -1;
                                                        } else if (var192.field976 == 16711935) {
                                                            var195 = -2;
                                                            var193 = -1;
                                                            var194 = -2;
                                                        } else {
                                                            var195 = class6.method2849(var192.field978, var192.field975, var192.field974);
                                                            int var196 = class6.field72 + var192.field978 & 0xFF;
                                                            int var197 = class6.field77 + var192.field974;
                                                            if (var197 < 0) {
                                                                var197 = 0;
                                                            } else if (var197 > 255) {
                                                                var197 = 255;
                                                            }
                                                            var194 = class6.method2849(var196, var192.field975, var197);
                                                        }
                                                        int var198 = 0;
                                                        if (var194 != -2) {
                                                            var198 = class85.field1493[class6.method116(var194, 96)];
                                                        }
                                                        if (var192.field984 != -1) {
                                                            int var199 = class6.field72 + var192.field983 & 0xFF;
                                                            int var200 = class6.field77 + var192.field985;
                                                            if (var200 < 0) {
                                                                var200 = 0;
                                                            } else if (var200 > 255) {
                                                                var200 = 255;
                                                            }
                                                            int var201 = class6.method2849(var199, var192.field980, var200);
                                                            var198 = class85.field1493[class6.method116(var201, 96)];
                                                        }
                                                        var134.method1756(var140, var155, var168, var190, var191, var193, var173, var174, var175, var176, class6.method2951(var181, var177), class6.method2951(var181, var178), class6.method2951(var181, var179), class6.method2951(var181, var180), class6.method116(var195, var177), class6.method116(var195, var178), class6.method116(var195, var179), class6.method116(var195, var180), var189, var198);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var202 = 1; var202 < 103; var202++) {
                                    for (int var203 = 1; var203 < 103; var203++) {
                                        var134.method1677(var140, var203, var202, class6.method729(var140, var203, var202));
                                    }
                                }
                                Statics.field67[var140] = (byte[][]) null;
                                Statics.field3008[var140] = (byte[][]) null;
                                Statics.field540[var140] = (byte[][]) null;
                                Statics.field82[var140] = (byte[][]) null;
                                Statics.field85[var140] = (byte[][]) null;
                            }
                            var134.method1682(-50, -10, -50);
                            for (int var204 = 0; var204 < 104; var204++) {
                                for (int var205 = 0; var205 < 104; var205++) {
                                    if ((class6.field65[1][var204][var205] & 0x2) == 2) {
                                        var134.method1655(var204, var205);
                                    }
                                }
                            }
                            int var206 = 1;
                            int var207 = 2;
                            int var208 = 4;
                            for (int var209 = 0; var209 < 4; var209++) {
                                if (var209 > 0) {
                                    var206 <<= 0x3;
                                    var207 <<= 0x3;
                                    var208 <<= 0x3;
                                }
                                for (int var210 = 0; var210 <= var209; var210++) {
                                    for (int var211 = 0; var211 <= 104; var211++) {
                                        for (int var212 = 0; var212 <= 104; var212++) {
                                            if ((Statics.field987[var210][var212][var211] & var206) != 0) {
                                                int var213 = var211;
                                                int var214 = var211;
                                                int var215 = var210;
                                                int var216 = var210;
                                                while (var213 > 0 && (Statics.field987[var210][var212][var213 - 1] & var206) != 0) {
                                                    var213--;
                                                }
                                                while (var214 < 104 && (Statics.field987[var210][var212][var214 + 1] & var206) != 0) {
                                                    var214++;
                                                }
                                                label754: while (var215 > 0) {
                                                    for (int var217 = var213; var217 <= var214; var217++) {
                                                        if ((Statics.field987[var215 - 1][var212][var217] & var206) == 0) {
                                                            break label754;
                                                        }
                                                    }
                                                    var215--;
                                                }
                                                label743: while (var216 < var209) {
                                                    for (int var218 = var213; var218 <= var214; var218++) {
                                                        if ((Statics.field987[var216 + 1][var212][var218] & var206) == 0) {
                                                            break label743;
                                                        }
                                                    }
                                                    var216++;
                                                }
                                                int var219 = (var216 + 1 - var215) * (var214 - var213 + 1);
                                                if (var219 >= 8) {
                                                    short var220 = 240;
                                                    int var221 = class6.field76[var216][var212][var213] - var220;
                                                    int var222 = class6.field76[var215][var212][var213];
                                                    class80.method1656(var209, 1, var212 * 128, var212 * 128, var213 * 128, var214 * 128 + 128, var221, var222);
                                                    for (int var223 = var215; var223 <= var216; var223++) {
                                                        for (int var224 = var213; var224 <= var214; var224++) {
                                                            Statics.field987[var223][var212][var224] &= ~var206;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field987[var210][var212][var211] & var207) != 0) {
                                                int var225 = var212;
                                                int var226 = var212;
                                                int var227 = var210;
                                                int var228 = var210;
                                                while (var225 > 0 && (Statics.field987[var210][var225 - 1][var211] & var207) != 0) {
                                                    var225--;
                                                }
                                                while (var226 < 104 && (Statics.field987[var210][var226 + 1][var211] & var207) != 0) {
                                                    var226++;
                                                }
                                                label807: while (var227 > 0) {
                                                    for (int var229 = var225; var229 <= var226; var229++) {
                                                        if ((Statics.field987[var227 - 1][var229][var211] & var207) == 0) {
                                                            break label807;
                                                        }
                                                    }
                                                    var227--;
                                                }
                                                label796: while (var228 < var209) {
                                                    for (int var230 = var225; var230 <= var226; var230++) {
                                                        if ((Statics.field987[var228 + 1][var230][var211] & var207) == 0) {
                                                            break label796;
                                                        }
                                                    }
                                                    var228++;
                                                }
                                                int var231 = (var228 + 1 - var227) * (var226 - var225 + 1);
                                                if (var231 >= 8) {
                                                    short var232 = 240;
                                                    int var233 = class6.field76[var228][var225][var211] - var232;
                                                    int var234 = class6.field76[var227][var225][var211];
                                                    class80.method1656(var209, 2, var225 * 128, var226 * 128 + 128, var211 * 128, var211 * 128, var233, var234);
                                                    for (int var235 = var227; var235 <= var228; var235++) {
                                                        for (int var236 = var225; var236 <= var226; var236++) {
                                                            Statics.field987[var235][var236][var211] &= ~var207;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field987[var210][var212][var211] & var208) != 0) {
                                                int var237 = var212;
                                                int var238 = var212;
                                                int var239 = var211;
                                                int var240 = var211;
                                                while (var239 > 0 && (Statics.field987[var210][var212][var239 - 1] & var208) != 0) {
                                                    var239--;
                                                }
                                                while (var240 < 104 && (Statics.field987[var210][var212][var240 + 1] & var208) != 0) {
                                                    var240++;
                                                }
                                                label860: while (var237 > 0) {
                                                    for (int var241 = var239; var241 <= var240; var241++) {
                                                        if ((Statics.field987[var210][var237 - 1][var241] & var208) == 0) {
                                                            break label860;
                                                        }
                                                    }
                                                    var237--;
                                                }
                                                label849: while (var238 < 104) {
                                                    for (int var242 = var239; var242 <= var240; var242++) {
                                                        if ((Statics.field987[var210][var238 + 1][var242] & var208) == 0) {
                                                            break label849;
                                                        }
                                                    }
                                                    var238++;
                                                }
                                                if ((var238 - var237 + 1) * (var240 - var239 + 1) >= 4) {
                                                    int var243 = class6.field76[var210][var237][var239];
                                                    class80.method1656(var209, 4, var237 * 128, var238 * 128 + 128, var239 * 128, var240 * 128 + 128, var243, var243);
                                                    for (int var244 = var237; var244 <= var238; var244++) {
                                                        for (int var245 = var239; var245 <= var240; var245++) {
                                                            Statics.field987[var210][var244][var245] &= ~var208;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method26(true);
                            int var246 = class6.field66;
                            if (var246 > Statics.field999) {
                                var246 = Statics.field999;
                            }
                            if (var246 < Statics.field999 - 1) {
                                int var247 = Statics.field999 - 1;
                            }
                            if (field257) {
                                Statics.field736.method1700(class6.field66);
                            } else {
                                Statics.field736.method1700(0);
                            }
                            for (int var248 = 0; var248 < 104; var248++) {
                                for (int var249 = 0; var249 < 104; var249++) {
                                    method155(var248, var249);
                                }
                            }
                            method2014();
                            for (class15 var250 = (class15) field385.method3285(); var250 != null; var250 = (class15) field385.method3286()) {
                                if (var250.field214 == -1) {
                                    var250.field213 = 0;
                                    method2935(var250);
                                } else {
                                    var250.method3367();
                                }
                            }
                            class37.field866.method3223();
                            if (Statics.field2028 != null) {
                                field291.method2406(50);
                                field291.method2147(1057001181);
                            }
                            if (!field310) {
                                int var251 = (Statics.field2169 - 6) / 8;
                                int var252 = (Statics.field2169 + 6) / 8;
                                int var253 = (Statics.field137 - 6) / 8;
                                int var254 = (Statics.field137 + 6) / 8;
                                for (int var255 = var251 - 1; var255 <= var252 + 1; var255++) {
                                    for (int var256 = var253 - 1; var256 <= var254 + 1; var256++) {
                                        if (var255 < var251 || var255 > var252 || var256 < var253 || var256 > var254) {
                                            Statics.field706.method2783("m" + var255 + "_" + var256);
                                            Statics.field706.method2783("l" + var255 + "_" + var256);
                                        }
                                    }
                                }
                            }
                            method559(30);
                            method2014();
                            Statics.field67 = (byte[][][]) null;
                            Statics.field3008 = (byte[][][]) null;
                            Statics.field540 = (byte[][][]) null;
                            Statics.field82 = (byte[][][]) null;
                            Statics.field987 = (int[][][]) null;
                            Statics.field85 = (byte[][][]) null;
                            Statics.field55 = (int[][]) null;
                            Statics.field1543 = null;
                            Statics.field69 = null;
                            Statics.field702 = null;
                            Statics.field635 = null;
                            Statics.field1900 = null;
                            field291.method2406(22);
                            class133.method872();
                        } else {
                            field391 = 2;
                        }
                    } else {
                        field391 = 1;
                    }
                }
                if (field259 == 30) {
                    method534();
                } else if (field259 == 40 || field259 == 45) {
                    method1372();
                }
                return;
            }
            var2.field2505.method2845(var2.field2504, (int) var2.field2882, var2.field2508, false);
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method191() {
        boolean var1;
        label316: {
            try {
                if (class164.field2732 == 2) {
                    if (Statics.field200 == null) {
                        Statics.field200 = class161.method3001(Statics.field2733, Statics.field1015, Statics.field2734);
                        if (Statics.field200 == null) {
                            var1 = false;
                            break label316;
                        }
                    }
                    if (Statics.field2737 == null) {
                        Statics.field2737 = new class54(Statics.field2735, Statics.field2730);
                    }
                    if (Statics.field1834.method3086(Statics.field200, Statics.field2736, Statics.field2737, 22050)) {
                        Statics.field1834.method3111();
                        Statics.field1834.method3084(Statics.field2739);
                        Statics.field1834.method3149(Statics.field200, Statics.field2978);
                        class164.field2732 = 0;
                        Statics.field200 = null;
                        Statics.field2737 = null;
                        Statics.field2733 = null;
                        var1 = true;
                        break label316;
                    }
                }
            } catch (Exception var49) {
                var49.printStackTrace();
                Statics.field1834.method3090();
                class164.field2732 = 0;
                Statics.field200 = null;
                Statics.field2737 = null;
                Statics.field2733 = null;
            }
            var1 = false;
        }
        if (var1 && field488 && Statics.field514 != null) {
            Statics.field514.method1034();
        }
        if (field2082) {
            Statics.method1650(Statics.field543);
            Canvas var4 = Statics.field543;
            var4.removeMouseListener(class129.field2019);
            var4.removeMouseMotionListener(class129.field2019);
            var4.removeFocusListener(class129.field2019);
            class129.field2013 = 0;
            if (Statics.field1920 != null) {
                Statics.field1920.method2476(Statics.field543);
            }
            this.method2649();
            Canvas var5 = Statics.field543;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class126.field1985);
            var5.addFocusListener(class126.field1985);
            class129.method499(Statics.field543);
            if (Statics.field1920 != null) {
                Statics.field1920.method2475(Statics.field543);
            }
        }
        if (field259 == 0) {
            int var6 = class29.field673;
            String var7 = class29.field674;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field543.getGraphics();
                if (Statics.field564 == null) {
                    Statics.field564 = new Font("Helvetica", 1, 13);
                    Statics.field800 = Statics.field543.getFontMetrics(Statics.field564);
                }
                if (field2080) {
                    field2080 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field1775, Statics.field2079);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field693 == null) {
                        Statics.field693 = Statics.field543.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field693.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field564);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field800.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field693, Statics.field1775 / 2 - 152, Statics.field2079 / 2 - 18, (ImageObserver) null);
                } catch (Exception var45) {
                    int var12 = Statics.field1775 / 2 - 152;
                    int var13 = Statics.field2079 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field564);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field800.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var46) {
                Statics.field543.repaint();
            }
        } else if (field259 == 5) {
            class29.method2472(Statics.field930, Statics.field191);
        } else if (field259 == 10 || field259 == 11) {
            class29.method2472(Statics.field930, Statics.field191);
        } else if (field259 == 20) {
            class29.method2472(Statics.field930, Statics.field191);
        } else if (field259 == 25) {
            if (field391 == 1) {
                if (field467 > field305) {
                    field305 = field467;
                }
                int var15 = (field305 * 50 - field467 * 50) / field305;
                method558(class145.field2179 + class2.field20 + class2.field17 + var15 + "%" + class2.field14, false);
            } else if (field391 == 2) {
                if (field306 > field283) {
                    field283 = field306;
                }
                int var16 = (field283 * 50 - field306 * 50) / field283 + 50;
                method558(class145.field2179 + class2.field20 + class2.field17 + var16 + "%" + class2.field14, false);
            } else {
                method558(class145.field2179, false);
            }
        } else if (field259 == 30) {
            if (field334 != -1) {
                int var17 = field334;
                if (class155.method2108(var17)) {
                    method140(Statics.field2653[var17], -1);
                }
            }
            for (int var18 = 0; var18 < field456; var18++) {
                if (field506[var18]) {
                    field459[var18] = true;
                }
                field460[var18] = field506[var18];
                field506[var18] = false;
            }
            field267 = field372;
            field401 = -1;
            field402 = -1;
            Statics.field1937 = null;
            if (field334 != -1) {
                field456 = 0;
                method137(field334, 0, 0, 765, 503, 0, 0, -1);
            }
            class74.method1605();
            if (field379) {
                Statics.method2018();
            } else if (field401 != -1) {
                int var19 = field401;
                int var20 = field402;
                if (field394 >= 2 || field405 != 0 || field374) {
                    String var21;
                    if (field405 == 1 && field394 < 2) {
                        var21 = class145.field2191 + class145.field2393 + field406 + " " + class2.field19;
                    } else if (field374 && field394 < 2) {
                        var21 = field410 + class145.field2393 + field302 + " " + class2.field19;
                    } else {
                        int var22 = field394 - 1;
                        String var23;
                        if (field400[var22].length() > 0) {
                            var23 = field399[var22] + class145.field2393 + field400[var22];
                        } else {
                            var23 = field399[var22];
                        }
                        var21 = var23;
                    }
                    if (field394 > 2) {
                        var21 = var21 + class2.method679(16777215) + " " + '/' + " " + (field394 - 2) + class145.field2324;
                    }
                    Statics.field930.method3470(var21, var19 + 4, var20 + 15, 16777215, 0, field372 / 1000);
                }
            }
            if (field465 == 3) {
                for (int var24 = 0; var24 < field456; var24++) {
                    if (field460[var24]) {
                        class74.method1554(field461[var24], field395[var24], field463[var24], field464[var24], 16711935, 128);
                    } else if (field459[var24]) {
                        class74.method1554(field461[var24], field395[var24], field463[var24], field464[var24], 16711680, 128);
                    }
                }
            }
            int var25 = Statics.field999;
            int var26 = Statics.field377.field789;
            int var27 = Statics.field377.field754;
            int var28 = field316;
            for (class21 var29 = (class21) class21.field560.method3285(); var29 != null; var29 = (class21) class21.field560.method3286()) {
                if (var29.field553 != -1 || var29.field559 != null) {
                    int var30 = 0;
                    if (var26 > var29.field556) {
                        var30 += var26 - var29.field556;
                    } else if (var26 < var29.field550) {
                        var30 += var29.field550 - var26;
                    }
                    if (var27 > var29.field548) {
                        var30 += var27 - var29.field548;
                    } else if (var27 < var29.field551) {
                        var30 += var29.field551 - var27;
                    }
                    if (var30 - 64 > var29.field554 || field268 == 0 || var29.field549 != var25) {
                        if (var29.field555 != null) {
                            Statics.field491.method1002(var29.field555);
                            var29.field555 = null;
                        }
                        if (var29.field552 != null) {
                            Statics.field491.method1002(var29.field552);
                            var29.field552 = null;
                        }
                    } else {
                        var30 -= 64;
                        if (var30 < 0) {
                            var30 = 0;
                        }
                        int var31 = field268 * (var29.field554 - var30) / var29.field554;
                        class53 var10000;
                        if (var29.field555 != null) {
                            var29.field555.method1145(var31);
                        } else if (var29.field553 >= 0) {
                            var10000 = (class53) null;
                            class53 var32 = class53.method1073(Statics.field2945, var29.field553, 0);
                            if (var32 != null) {
                                class57 var33 = var32.method1085().method1110(Statics.field198);
                                class59 var34 = class59.method1142(var33, 100, var31);
                                var34.method1174(-1);
                                Statics.field491.method995(var34);
                                var29.field555 = var34;
                            }
                        }
                        if (var29.field552 != null) {
                            var29.field552.method1145(var31);
                            if (!var29.field552.method3365()) {
                                var29.field552 = null;
                            }
                        } else if (var29.field559 != null && (var29.field561 -= var28) <= 0) {
                            int var35 = (int) (Math.random() * (double) var29.field559.length);
                            var10000 = (class53) null;
                            class53 var36 = class53.method1073(Statics.field2945, var29.field559[var35], 0);
                            if (var36 != null) {
                                class57 var37 = var36.method1085().method1110(Statics.field198);
                                class59 var38 = class59.method1142(var37, 100, var31);
                                var38.method1174(0);
                                Statics.field491.method995(var38);
                                var29.field552 = var38;
                                var29.field561 = var29.field557 + (int) (Math.random() * (double) (var29.field558 - var29.field557));
                            }
                        }
                    }
                }
            }
            field316 = 0;
        } else if (field259 == 40) {
            method558(class145.field2180 + class2.field20 + class145.field2181, false);
        } else if (field259 == 45) {
            method558(class145.field2328, false);
        }
        if (field259 == 30 && field465 == 0 && !field2080) {
            try {
                Graphics var39 = Statics.field543.getGraphics();
                for (int var40 = 0; var40 < field456; var40++) {
                    if (field459[var40]) {
                        Statics.field1824.method1399(var39, field461[var40], field395[var40], field463[var40], field464[var40]);
                        field459[var40] = false;
                    }
                }
            } catch (Exception var48) {
                Statics.field543.repaint();
            }
        } else if (field259 > 0) {
            try {
                Graphics var42 = Statics.field543.getGraphics();
                Statics.field1824.method1404(var42, 0, 0);
                field2080 = false;
                for (int var43 = 0; var43 < field456; var43++) {
                    field459[var43] = false;
                }
            } catch (Exception var47) {
                Statics.field543.repaint();
            }
        }
    }

    @ObfuscatedName("client.o(B)V")
    public final void method192() {
        if (Statics.field1530 != null) {
            Statics.field1530.field176 = false;
        }
        Statics.field1530 = null;
        if (Statics.field1522 != null) {
            Statics.field1522.method2609();
            Statics.field1522 = null;
        }
        Statics.method2016();
        if (class129.field2019 != null) {
            class129 var1 = class129.field2019;
            synchronized (class129.field2019) {
                class129.field2019 = null;
            }
        }
        Statics.field1920 = null;
        if (Statics.field514 != null) {
            Statics.field514.method1035();
        }
        if (Statics.field2009 != null) {
            Statics.field2009.method1035();
        }
        if (Statics.field2521 != null) {
            Statics.field2521.method2609();
        }
        Object var3 = class152.field2514;
        synchronized (class152.field2514) {
            if (class152.field2515 != 0) {
                class152.field2515 = 1;
                try {
                    class152.field2514.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class138.field2113.method3583();
            for (int var6 = 0; var6 < Statics.field1906; var6++) {
                Statics.field574[var6].method3583();
            }
            class138.field2114.method3583();
            class138.field2112.method3583();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ah.p(II)V")
    public static void method559(int arg0) {
        if (field259 == arg0) {
            return;
        }
        if (field259 == 0) {
            class133.method1384();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field284 = 0;
            field285 = 0;
            field286 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1849 != null) {
            Statics.field1849.method2609();
            Statics.field1849 = null;
        }
        if (field259 == 25) {
            field391 = 0;
            field467 = 0;
            field305 = 1;
            field306 = 0;
            field283 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method2716(Statics.field543, Statics.field1679, Statics.field282, true, 0);
        } else if (arg0 == 20) {
            class29.method2716(Statics.field543, Statics.field1679, Statics.field282, true, field259 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method2716(Statics.field543, Statics.field1679, Statics.field282, false, 4);
        } else if (Statics.field662) {
            Statics.field659 = null;
            Statics.field655 = null;
            Statics.field654 = null;
            Statics.field3010 = null;
            Statics.field1924 = null;
            Statics.field657 = null;
            Statics.field658 = null;
            Statics.field1282 = null;
            Statics.field660 = null;
            Statics.field650 = null;
            Statics.field1891 = null;
            Statics.field2714 = null;
            Statics.field988 = null;
            Statics.field541 = null;
            Statics.field58 = null;
            Statics.field584 = null;
            Statics.field1268 = null;
            Statics.field665 = null;
            Statics.field617 = null;
            Statics.field608 = null;
            Statics.field2137 = null;
            Statics.field668 = null;
            class164.method173(2);
            class153.method550(true);
            Statics.field662 = false;
        }
        field259 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method386() {
        if (field259 != 1000) {
            boolean var1 = class153.method142();
            if (!var1) {
                this.method194();
            }
        }
    }

    @ObfuscatedName("client.w(B)V")
    public void method194() {
        if (class153.field2534 >= 4) {
            this.method2699("js5crc");
            field259 = 1000;
            return;
        }
        if (class153.field2535 >= 4) {
            if (field259 <= 5) {
                this.method2699("js5io");
                field259 = 1000;
                return;
            }
            field281 = 3000;
            class153.field2535 = 3;
        }
        if (--field281 + 1 > 0) {
            return;
        }
        try {
            if (field280 == 0) {
                Statics.field610 = Statics.field29.method2525(Statics.field2468, Statics.field571);
                field280++;
            }
            if (field280 == 1) {
                if (Statics.field610.field2093 == 2) {
                    this.method384(-1);
                    return;
                }
                if (Statics.field610.field2093 == 1) {
                    field280++;
                }
            }
            if (field280 == 2) {
                Statics.field1948 = new class132((Socket) Statics.field610.field2092, Statics.field29);
                class108 var1 = new class108(5);
                var1.method2144(15);
                var1.method2147(67);
                Statics.field1948.method2634(var1.field1854, 0, 5);
                field280++;
                Statics.field568 = class104.method1417();
            }
            if (field280 == 3) {
                if (field259 <= 5 || Statics.field1948.method2611() > 0) {
                    int var2 = Statics.field1948.method2608();
                    if (var2 != 0) {
                        this.method384(var2);
                        return;
                    }
                    field280++;
                } else if (class104.method1417() - Statics.field568 > 30000L) {
                    this.method384(-2);
                    return;
                }
            }
            if (field280 == 4) {
                class132 var3 = Statics.field1948;
                boolean var4 = field259 > 20;
                if (Statics.field2521 != null) {
                    try {
                        Statics.field2521.method2609();
                    } catch (Exception var14) {
                    }
                    Statics.field2521 = null;
                }
                Statics.field2521 = var3;
                class153.method550(var4);
                class153.field2529.field1859 = 0;
                Statics.field517 = null;
                Statics.field2896 = null;
                class153.field2532 = 0;
                while (true) {
                    class154 var6 = (class154) class153.field2522.method3254();
                    if (var6 == null) {
                        while (true) {
                            class154 var7 = (class154) class153.field2527.method3254();
                            if (var7 == null) {
                                if (class153.field2530 != 0) {
                                    try {
                                        class108 var8 = new class108(4);
                                        var8.method2144(4);
                                        var8.method2144(class153.field2530);
                                        var8.method2145(0);
                                        Statics.field2521.method2634(var8.field1854, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2521.method2609();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2535++;
                                        Statics.field2521 = null;
                                    }
                                }
                                class153.field2518 = 0;
                                Statics.field2519 = class104.method1417();
                                Statics.field610 = null;
                                Statics.field1948 = null;
                                field280 = 0;
                                field473 = 0;
                                return;
                            }
                            class153.field2524.method3329(var7);
                            class153.field2525.method3245(var7, var7.field2882);
                            class153.field2533++;
                            class153.field2526--;
                        }
                    }
                    class153.field2520.method3245(var6, var6.field2882);
                    class153.field2517++;
                    class153.field2523--;
                }
            }
        } catch (IOException var15) {
            this.method384(-3);
        }
    }

    @ObfuscatedName("client.t(IB)V")
    public void method384(int arg0) {
        Statics.field610 = null;
        Statics.field1948 = null;
        field280 = 0;
        if (Statics.field601 == Statics.field571) {
            Statics.field571 = Statics.field201;
        } else {
            Statics.field571 = Statics.field601;
        }
        field473++;
        if (field473 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field259 <= 5) {
                this.method2699("js5connect_full");
                field259 = 1000;
            } else {
                field281 = 3000;
            }
        } else if (field473 >= 2 && arg0 == 6) {
            this.method2699("js5connect_outofdate");
            field259 = 1000;
        } else if (field473 >= 4) {
            if (field259 <= 5) {
                this.method2699("js5connect");
                field259 = 1000;
            } else {
                field281 = 3000;
            }
        }
    }

    @ObfuscatedName("dy.s(I)V")
    public static void method2462() {
        if (field279 == 0) {
            Statics.field736 = new class80(4, 104, 104, class6.field76);
            for (int var0 = 0; var0 < 4; var0++) {
                field512[var0] = new class209(104, 104);
            }
            Statics.field738 = new class73(512, 512);
            class29.field674 = class145.field2182;
            class29.field673 = 5;
            field279 = 20;
        } else if (field279 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1497[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1760(var1, 500, 800, 512, 334);
            class29.field674 = class145.field2281;
            class29.field673 = 10;
            field279 = 30;
        } else if (field279 == 30) {
            Statics.field2510 = method2518(0, false, true, true);
            Statics.field1104 = method2518(1, false, true, true);
            Statics.field2729 = method2518(2, true, false, true);
            Statics.field119 = method2518(3, false, true, true);
            Statics.field2945 = method2518(4, false, true, true);
            Statics.field706 = method2518(5, true, true, true);
            Statics.field1012 = method2518(6, true, true, false);
            Statics.field122 = method2518(7, false, true, true);
            Statics.field282 = method2518(8, false, true, true);
            Statics.field720 = method2518(9, false, true, true);
            Statics.field1679 = method2518(10, false, true, true);
            Statics.field1889 = method2518(11, false, true, true);
            Statics.field1923 = method2518(12, false, true, true);
            Statics.field123 = method2518(13, true, false, true);
            Statics.field1540 = method2518(14, false, true, false);
            Statics.field1309 = method2518(15, false, true, true);
            class29.field674 = class145.field2184;
            class29.field673 = 20;
            field279 = 40;
        } else if (field279 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2510.method2863() * 4 / 100;
            int var8 = var7 + Statics.field1104.method2863() * 4 / 100;
            int var9 = var8 + Statics.field2729.method2863() * 2 / 100;
            int var10 = var9 + Statics.field119.method2863() * 2 / 100;
            int var11 = var10 + Statics.field2945.method2863() * 6 / 100;
            int var12 = var11 + Statics.field706.method2863() * 4 / 100;
            int var13 = var12 + Statics.field1012.method2863() * 2 / 100;
            int var14 = var13 + Statics.field122.method2863() * 60 / 100;
            int var15 = var14 + Statics.field282.method2863() * 2 / 100;
            int var16 = var15 + Statics.field720.method2863() * 2 / 100;
            int var17 = var16 + Statics.field1679.method2863() * 2 / 100;
            int var18 = var17 + Statics.field1889.method2863() * 2 / 100;
            int var19 = var18 + Statics.field1923.method2863() * 2 / 100;
            int var20 = var19 + Statics.field123.method2863() * 2 / 100;
            int var21 = var20 + Statics.field1540.method2863() * 2 / 100;
            int var22 = var21 + Statics.field1309.method2863() * 2 / 100;
            if (var22 == 100) {
                class29.field674 = class145.field2301;
                class29.field673 = 30;
                field279 = 45;
            } else {
                if (var22 != 0) {
                    class29.field674 = class145.field2185 + var22 + "%";
                }
                class29.field673 = 30;
            }
        } else if (field279 == 45) {
            class51.method1098(22050, !field257, 2);
            class165 var23 = new class165();
            var23.method3092(9, 128);
            Statics.field514 = class51.method543(Statics.field29, Statics.field543, 0, 22050);
            Statics.field514.method1055(var23);
            class150 var24 = Statics.field1309;
            class150 var25 = Statics.field1540;
            class150 var26 = Statics.field2945;
            Statics.field2736 = var24;
            Statics.field2730 = var25;
            Statics.field2735 = var26;
            Statics.field1834 = var23;
            Statics.field2009 = class51.method543(Statics.field29, Statics.field543, 1, 2048);
            Statics.field491 = new class50();
            Statics.field2009.method1055(Statics.field491);
            Statics.field198 = new class69(22050, Statics.field1105);
            class29.field674 = class145.field2187;
            class29.field673 = 35;
            field279 = 50;
        } else if (field279 == 50) {
            int var27 = 0;
            if (Statics.field191 == null) {
                class150 var28 = Statics.field282;
                class150 var29 = Statics.field123;
                int var30 = var28.method2778("p11_full");
                int var31 = var28.method2809(var30, "");
                class205 var32;
                if (class71.method806(var28, var30, var31)) {
                    var32 = class71.method2004(var29.method2763(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field191 = var32;
            } else {
                var27++;
            }
            if (Statics.field3019 == null) {
                class150 var34 = Statics.field282;
                class150 var35 = Statics.field123;
                int var36 = var34.method2778("p12_full");
                int var37 = var34.method2809(var36, "");
                class205 var38;
                if (class71.method806(var34, var36, var37)) {
                    var38 = class71.method2004(var35.method2763(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field3019 = var38;
            } else {
                var27++;
            }
            if (Statics.field930 == null) {
                class150 var40 = Statics.field282;
                class150 var41 = Statics.field123;
                int var42 = var40.method2778("b12_full");
                int var43 = var40.method2809(var42, "");
                class205 var44;
                if (class71.method806(var40, var42, var43)) {
                    var44 = class71.method2004(var41.method2763(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field930 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class29.field674 = class145.field2188 + var27 * 100 / 3 + "%";
                class29.field673 = 40;
            } else {
                Statics.field249 = new class148(true);
                class29.field674 = class145.field2189;
                class29.field673 = 40;
                field279 = 60;
            }
        } else if (field279 == 60) {
            int var46 = class29.method85(Statics.field1679, Statics.field282);
            byte var47 = 8;
            if (var46 < var47) {
                class29.field674 = class145.field2223 + var46 * 100 / var47 + "%";
                class29.field673 = 50;
            } else {
                class29.field674 = class145.field2378;
                class29.field673 = 50;
                method559(5);
                field279 = 70;
            }
        } else if (field279 == 70) {
            if (Statics.field2729.method2767()) {
                class42.method3421(Statics.field2729);
                class150 var49 = Statics.field2729;
                Statics.field903 = var49;
                class41.method647(Statics.field2729, Statics.field122);
                class150 var50 = Statics.field2729;
                class150 var51 = Statics.field122;
                boolean var52 = field257;
                Statics.field853 = var50;
                Statics.field1909 = var51;
                class37.field882 = var52;
                class150 var53 = Statics.field2729;
                class150 var54 = Statics.field122;
                Statics.field811 = var53;
                Statics.field815 = var54;
                class46.method171(Statics.field2729, Statics.field122, field250, Statics.field191);
                class39.method739(Statics.field2729, Statics.field2510, Statics.field1104);
                class40.method2(Statics.field2729, Statics.field122);
                class43.method551(Statics.field2729);
                class150 var55 = Statics.field2729;
                Statics.field1077 = var55;
                Statics.field1072 = Statics.field1077.method2773(16);
                class150 var56 = Statics.field119;
                class150 var57 = Statics.field122;
                class150 var58 = Statics.field282;
                class150 var59 = Statics.field123;
                Statics.field1921 = var56;
                Statics.field2613 = var57;
                Statics.field2561 = var58;
                Statics.field2420 = var59;
                Statics.field2653 = new class155[Statics.field1921.method2774()][];
                Statics.field2543 = new boolean[Statics.field1921.method2774()];
                class150 var60 = Statics.field2729;
                Statics.field1018 = var60;
                class150 var61 = Statics.field2729;
                Statics.field2683 = var61;
                class29.field674 = class145.field2193;
                class29.field673 = 60;
                field279 = 80;
            } else {
                class29.field674 = class145.field2353 + Statics.field2729.method2847() + "%";
                class29.field673 = 60;
            }
        } else if (field279 == 80) {
            int var62 = 0;
            if (Statics.field326 == null) {
                Statics.field326 = class71.method151(Statics.field282, "compass", "");
            } else {
                var62++;
            }
            if (Statics.field1290 == null) {
                Statics.field1290 = class71.method151(Statics.field282, "mapedge", "");
            } else {
                var62++;
            }
            if (Statics.field979 == null) {
                Statics.field979 = class71.method563(Statics.field282, "mapscene", "");
            } else {
                var62++;
            }
            if (Statics.field576 == null) {
                Statics.field576 = class71.method2745(Statics.field282, "mapfunction", "");
            } else {
                var62++;
            }
            if (Statics.field2509 == null) {
                Statics.field2509 = class71.method2745(Statics.field282, "hitmarks", "");
            } else {
                var62++;
            }
            if (Statics.field515 == null) {
                Statics.field515 = class71.method2745(Statics.field282, "headicons_pk", "");
            } else {
                var62++;
            }
            if (Statics.field1284 == null) {
                Statics.field1284 = class71.method2745(Statics.field282, "headicons_prayer", "");
            } else {
                var62++;
            }
            if (Statics.field215 == null) {
                Statics.field215 = class71.method2745(Statics.field282, "headicons_hint", "");
            } else {
                var62++;
            }
            if (Statics.field1127 == null) {
                Statics.field1127 = class71.method2745(Statics.field282, "mapmarker", "");
            } else {
                var62++;
            }
            if (Statics.field183 == null) {
                Statics.field183 = class71.method2745(Statics.field282, "cross", "");
            } else {
                var62++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class71.method2745(Statics.field282, "mapdots", "");
            } else {
                var62++;
            }
            if (Statics.field534 == null) {
                Statics.field534 = class71.method563(Statics.field282, "scrollbar", "");
            } else {
                var62++;
            }
            if (Statics.field2941 == null) {
                Statics.field2941 = class71.method563(Statics.field282, "mod_icons", "");
            } else {
                var62++;
            }
            if (Statics.field1359 == null) {
                Statics.field1359 = class71.method143(Statics.field282, "mapback", "");
            } else {
                var62++;
            }
            if (var62 < 14) {
                class29.field674 = class145.field2362 + var62 * 100 / 14 + "%";
                class29.field673 = 70;
            } else {
                Statics.field2957 = Statics.field2941;
                Statics.field1290.method1462();
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 41.0D) - 20;
                for (int var67 = 0; var67 < Statics.field576.length; var67++) {
                    Statics.field576[var67].method1517(var63 + var66, var64 + var66, var65 + var66);
                }
                Statics.field979[0].method1619(var63 + var66, var64 + var66, var65 + var66);
                Statics.field2499 = new int[33];
                Statics.field2768 = new int[33];
                Statics.field932 = new int[151];
                Statics.field195 = new int[151];
                for (int var68 = 0; var68 < 33; var68++) {
                    int var69 = 999;
                    int var70 = 0;
                    for (int var71 = 0; var71 < 34; var71++) {
                        if (Statics.field1359.field1333[Statics.field1359.field1332 * var68 + var71] == 0) {
                            if (var69 == 999) {
                                var69 = var71;
                            }
                        } else if (var69 != 999) {
                            var70 = var71;
                            break;
                        }
                    }
                    Statics.field2499[var68] = var69;
                    Statics.field2768[var68] = var70 - var69;
                }
                for (int var72 = 5; var72 < 156; var72++) {
                    int var73 = 999;
                    int var74 = 0;
                    for (int var75 = 25; var75 < 172; var75++) {
                        if (Statics.field1359.field1333[Statics.field1359.field1332 * var72 + var75] == 0 && var75 > 34 || var72 > 34) {
                            if (var73 == 999) {
                                var73 = var75;
                            }
                        } else if (var73 != 999) {
                            var74 = var75;
                            break;
                        }
                    }
                    Statics.field932[var72 - 5] = var73 - 25;
                    Statics.field195[var72 - 5] = var74 - var73;
                }
                class29.field674 = class145.field2205;
                class29.field673 = 70;
                field279 = 90;
            }
        } else if (field279 == 90) {
            if (Statics.field720.method2767()) {
                class89 var76 = new class89(Statics.field720, Statics.field282, 20, 0.8D, field257 ? 64 : 128);
                class85.method1838(var76);
                class85.method1825(0.8D);
                class29.field674 = class145.field2197;
                class29.field673 = 90;
                field279 = 110;
            } else {
                class29.field674 = class145.field2367 + Statics.field720.method2847() + "%";
                class29.field673 = 90;
            }
        } else if (field279 == 110) {
            Statics.field1530 = new class12();
            Statics.field29.method2526(Statics.field1530, 10);
            class29.field674 = class145.field2357;
            class29.field673 = 94;
            field279 = 120;
        } else if (field279 == 120) {
            if (Statics.field1679.method2781("huffman", "")) {
                class103 var77 = new class103(Statics.field1679.method2780("huffman", ""));
                Statics.method2890(var77);
                class29.field674 = class145.field2200;
                class29.field673 = 96;
                field279 = 130;
            } else {
                class29.field674 = class145.field2199 + "%";
                class29.field673 = 96;
            }
        } else if (field279 == 130) {
            if (!Statics.field119.method2767()) {
                class29.field674 = class145.field2289 + Statics.field119.method2847() * 4 / 5 + "%";
                class29.field673 = 100;
            } else if (!Statics.field1923.method2767()) {
                class29.field674 = class145.field2289 + (80 + Statics.field1923.method2847() / 6) + "%";
                class29.field673 = 100;
            } else if (Statics.field123.method2767()) {
                class29.field674 = class145.field2202;
                class29.field673 = 100;
                field279 = 140;
            } else {
                class29.field674 = class145.field2289 + (96 + Statics.field123.method2847() / 20) + "%";
                class29.field673 = 100;
            }
        } else if (field279 == 140) {
            method559(10);
        }
    }

    @ObfuscatedName("dw.b(IZZZI)Les;")
    public static class150 method2518(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2113 != null) {
            var4 = new class123(arg0, class138.field2113, Statics.field574[arg0], 1000000);
        }
        return new class150(var4, Statics.field525, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.u(I)V")
    public static final void method1372() {
        try {
            if (field284 == 0) {
                if (Statics.field1522 != null) {
                    Statics.field1522.method2609();
                    Statics.field1522 = null;
                }
                Statics.field2500 = null;
                field344 = false;
                field285 = 0;
                field284 = 1;
            }
            if (field284 == 1) {
                if (Statics.field2500 == null) {
                    Statics.field2500 = Statics.field29.method2525(Statics.field2468, Statics.field571);
                }
                if (Statics.field2500.field2093 == 2) {
                    throw new IOException();
                }
                if (Statics.field2500.field2093 == 1) {
                    Statics.field1522 = new class132((Socket) Statics.field2500.field2092, Statics.field29);
                    Statics.field2500 = null;
                    field284 = 2;
                }
            }
            if (field284 == 2) {
                field291.field1859 = 0;
                field291.method2144(14);
                Statics.field1522.method2634(field291.field1854, 0, 1);
                field293.field1859 = 0;
                field284 = 3;
            }
            if (field284 == 3) {
                if (Statics.field514 != null) {
                    Statics.field514.method1033();
                }
                if (Statics.field2009 != null) {
                    Statics.field2009.method1033();
                }
                int var0 = Statics.field1522.method2608();
                if (Statics.field514 != null) {
                    Statics.field514.method1033();
                }
                if (Statics.field2009 != null) {
                    Statics.field2009.method1033();
                }
                if (var0 != 0) {
                    method510(var0);
                    return;
                }
                field293.field1859 = 0;
                field284 = 5;
            }
            if (field284 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field291.field1859 = 0;
                field291.method2144(1);
                field291.method2144(class29.field681.method482());
                field291.method2147(var1[0]);
                field291.method2147(var1[1]);
                field291.method2147(var1[2]);
                field291.method2147(var1[3]);
                switch(class29.field681.field2431) {
                    case 0:
                        field291.field1859 += 8;
                        break;
                    case 1:
                    case 2:
                        field291.method2146(Statics.field1951);
                        field291.field1859 += 5;
                        break;
                    case 3:
                        field291.method2147((Integer) Statics.field184.field136.get(class211.method3453(class29.field664)));
                        field291.field1859 += 4;
                }
                field291.method2149(class29.field680);
                field291.method2312(class5.field59, class5.field60);
                field292.field1859 = 0;
                if (field259 == 40) {
                    field292.method2144(18);
                } else {
                    field292.method2144(16);
                }
                field292.method2145(0);
                int var2 = field292.field1859;
                field292.method2147(67);
                field292.method2190(field291.field1854, 0, field291.field1859);
                int var3 = field292.field1859;
                field292.method2149(class29.field664);
                field292.method2144(field257 ? 1 : 0);
                Statics.method115(field292);
                class108 var4 = new class108(Statics.field249.method2754());
                Statics.field249.method2759(var4);
                field292.method2190(var4.field1854, 0, var4.field1854.length);
                field292.method2147(Statics.field2510.field2472);
                field292.method2147(Statics.field1104.field2472);
                field292.method2147(Statics.field2729.field2472);
                field292.method2147(Statics.field119.field2472);
                field292.method2147(Statics.field2945.field2472);
                field292.method2147(Statics.field706.field2472);
                field292.method2147(Statics.field1012.field2472);
                field292.method2147(Statics.field122.field2472);
                field292.method2147(Statics.field282.field2472);
                field292.method2147(Statics.field720.field2472);
                field292.method2147(Statics.field1679.field2472);
                field292.method2147(Statics.field1889.field2472);
                field292.method2147(Statics.field1923.field2472);
                field292.method2147(Statics.field123.field2472);
                field292.method2147(Statics.field1540.field2472);
                field292.method2147(Statics.field1309.field2472);
                field292.method2174(var1, var3, field292.field1859);
                field292.method2154(field292.field1859 - var2);
                Statics.field1522.method2634(field292.field1854, 0, field292.field1859);
                field291.method2401(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field293.method2401(var1);
                field284 = 6;
            }
            if (field284 == 6 && Statics.field1522.method2611() > 0) {
                int var6 = Statics.field1522.method2608();
                if (var6 == 21 && field259 == 20) {
                    field284 = 7;
                } else if (var6 == 2) {
                    field284 = 9;
                } else if (var6 == 15 && field259 == 40) {
                    method2011();
                    return;
                } else if (var6 == 23 && field286 < 1) {
                    field286++;
                    field284 = 0;
                } else {
                    method510(var6);
                    return;
                }
            }
            if (field284 == 7 && Statics.field1522.method2611() > 0) {
                field309 = (Statics.field1522.method2608() + 3) * 60;
                field284 = 8;
            }
            if (field284 == 8) {
                field285 = 0;
                class29.method486(class145.field2206, class145.field2207, field309 / 60 + class145.field2361);
                if (--field309 <= 0) {
                    field284 = 0;
                }
            } else {
                if (field284 == 9 && Statics.field1522.method2611() >= 13) {
                    boolean var7 = Statics.field1522.method2608() == 1;
                    Statics.field1522.method2612(field293.field1854, 0, 4);
                    field293.field1859 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field293.method2416() << 24;
                        int var10 = var9 | field293.method2416() << 16;
                        int var11 = var10 | field293.method2416() << 8;
                        int var12 = var11 | field293.method2416();
                        int var13 = class211.method3453(class29.field664);
                        if (Statics.field184.field136.size() >= 10 && !Statics.field184.field136.containsKey(var13)) {
                            Iterator var14 = Statics.field184.field136.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field184.field136.put(var13, var12);
                        class9.method2715();
                    }
                    field419 = Statics.field1522.method2608();
                    field421 = Statics.field1522.method2608() == 1;
                    field311 = Statics.field1522.method2608();
                    field311 <<= 0x8;
                    field311 += Statics.field1522.method2608();
                    field376 = Statics.field1522.method2608();
                    Statics.field1522.method2612(field293.field1854, 0, 1);
                    field293.field1859 = 0;
                    field274 = field293.method2416();
                    Statics.field1522.method2612(field293.field1854, 0, 2);
                    field293.field1859 = 0;
                    field294 = field293.method2160();
                    if (field376 == 1) {
                        try {
                            class121.method2490(Statics.field251, "zap");
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class121.method2490(Statics.field251, "unzap");
                        } catch (Throwable var30) {
                        }
                    }
                    field284 = 10;
                }
                if (field284 != 10) {
                    field285++;
                    if (field285 > 2000) {
                        if (field286 < 1) {
                            if (Statics.field601 == Statics.field571) {
                                Statics.field571 = Statics.field201;
                            } else {
                                Statics.field571 = Statics.field601;
                            }
                            field286++;
                            field284 = 0;
                        } else {
                            method510(-3);
                        }
                    }
                } else if (Statics.field1522.method2611() >= field294) {
                    field293.field1859 = 0;
                    Statics.field1522.method2612(field293.field1854, 0, field294);
                    field468 = 1L;
                    field265 = -1;
                    Statics.field1530.field168 = 0;
                    Statics.field652 = true;
                    field510 = true;
                    field475 = -1L;
                    class192.method1453();
                    field291.field1859 = 0;
                    field293.field1859 = 0;
                    field274 = -1;
                    field299 = -1;
                    field315 = -1;
                    field301 = -1;
                    field296 = 0;
                    field493 = 0;
                    field380 = 0;
                    field269 = 0;
                    field394 = 0;
                    field379 = false;
                    class129.field2012 = 0;
                    class10.field146.clear();
                    class10.field144.method3260();
                    class10.field145.method3305();
                    class10.field147 = 0;
                    field405 = 0;
                    field374 = false;
                    field492 = 0;
                    field313 = (int) (Math.random() * 100.0D) - 50;
                    field484 = (int) (Math.random() * 110.0D) - 55;
                    field317 = (int) (Math.random() * 80.0D) - 40;
                    field478 = (int) (Math.random() * 120.0D) - 60;
                    field322 = (int) (Math.random() * 30.0D) - 20;
                    field262 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field335 = 0;
                    field472 = -1;
                    field462 = 0;
                    field298 = 0;
                    field336 = class18.field519;
                    field412 = 0;
                    field289 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field369[var17] = null;
                        field324[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field415[var18] = null;
                    }
                    Statics.field377 = field369[2047] = new class3();
                    field384 = -1;
                    field387.method3292();
                    field388.method3292();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field393[var19][var20][var21] = null;
                            }
                        }
                    }
                    field385 = new class180();
                    field505 = 0;
                    field396 = 0;
                    field403 = 0;
                    for (int var22 = 0; var22 < Statics.field1072; var22++) {
                        class47 var23 = class47.method2889(var22);
                        if (var23 != null) {
                            class157.field2679[var22] = 0;
                            class157.field2680[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field449.length; var24++) {
                        field449[var24] = -1;
                    }
                    field420 = -1;
                    if (field334 != -1) {
                        class155.method2578(field334);
                    }
                    for (class4 var25 = (class4) field413.method3254(); var25 != null; var25 = (class4) field413.method3257()) {
                        method561(var25, true);
                    }
                    field334 = -1;
                    field413 = new class177(8);
                    field416 = null;
                    field379 = false;
                    field394 = 0;
                    field411.method2968((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field256[var26] = null;
                        field382[var26] = false;
                    }
                    class14.method95();
                    field260 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field506[var27] = true;
                    }
                    field476 = null;
                    Statics.field704 = 0;
                    Statics.field1684 = null;
                    for (int var28 = 0; var28 < 6; var28++) {
                        field513[var28] = new class201();
                    }
                    Statics.field621 = null;
                    Statics.field2169 = -1;
                    method159(false);
                    field274 = -1;
                }
            }
        } catch (IOException var32) {
            if (field286 < 1) {
                if (Statics.field601 == Statics.field571) {
                    Statics.field571 = Statics.field201;
                } else {
                    Statics.field571 = Statics.field601;
                }
                field286++;
                field284 = 0;
            } else {
                method510(-2);
            }
        }
    }

    @ObfuscatedName("cc.j(I)V")
    public static void method2011() {
        field291.field1859 = 0;
        field293.field1859 = 0;
        field274 = -1;
        field299 = -1;
        field315 = -1;
        field301 = -1;
        field294 = 0;
        field296 = 0;
        field493 = 0;
        field394 = 0;
        field379 = false;
        field335 = 0;
        field462 = 0;
        for (int var0 = 0; var0 < field369.length; var0++) {
            if (field369[var0] != null) {
                field369[var0].field765 = -1;
            }
        }
        for (int var1 = 0; var1 < field415.length; var1++) {
            if (field415[var1] != null) {
                field415[var1].field765 = -1;
            }
        }
        class14.method95();
        method559(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field506[var2] = true;
        }
    }

    @ObfuscatedName("m.d(II)V")
    public static void method510(int arg0) {
        if (arg0 == -3) {
            class29.method486(class145.field2209, class145.field2333, class145.field2211);
        } else if (arg0 == -2) {
            class29.method486(class145.field2285, class145.field2213, class145.field2214);
        } else if (arg0 == -1) {
            class29.method486(class145.field2215, class145.field2216, class145.field2175);
        } else if (arg0 == 3) {
            class29.method486(class145.field2218, class145.field2183, class145.field2407);
        } else if (arg0 == 4) {
            class29.method486(class145.field2221, class145.field2222, class145.field2186);
        } else if (arg0 == 5) {
            class29.method486(class145.field2224, class145.field2225, class145.field2217);
        } else if (arg0 == 6) {
            class29.method486(class145.field2227, class145.field2228, class145.field2192);
        } else if (arg0 == 7) {
            class29.method486(class145.field2208, class145.field2384, class145.field2232);
        } else if (arg0 == 8) {
            class29.method486(class145.field2233, class145.field2234, class145.field2235);
        } else if (arg0 == 9) {
            class29.method486(class145.field2236, class145.field2237, class145.field2238);
        } else if (arg0 == 10) {
            class29.method486(class145.field2239, class145.field2240, class145.field2264);
        } else if (arg0 == 11) {
            class29.method486(class145.field2359, class145.field2325, class145.field2244);
        } else if (arg0 == 12) {
            class29.method486(class145.field2417, class145.field2246, class145.field2247);
        } else if (arg0 == 13) {
            class29.method486(class145.field2248, class145.field2249, class145.field2250);
        } else if (arg0 == 14) {
            class29.method486(class145.field2332, class145.field2254, class145.field2253);
        } else if (arg0 == 16) {
            class29.method486(class145.field2312, class145.field2330, class145.field2256);
        } else if (arg0 == 17) {
            class29.method486(class145.field2257, class145.field2258, class145.field2259);
        } else if (arg0 == 18) {
            class29.method486(class145.field2260, class145.field2261, class145.field2262);
        } else if (arg0 == 19) {
            class29.method486(class145.field2173, class145.field2220, class145.field2320);
        } else if (arg0 == 20) {
            class29.method486(class145.field2266, class145.field2267, class145.field2272);
        } else if (arg0 == 22) {
            class29.method486(class145.field2269, class145.field2270, class145.field2271);
        } else if (arg0 == 23) {
            class29.method486(class145.field2170, class145.field2273, class145.field2274);
        } else if (arg0 == 24) {
            class29.method486(class145.field2275, class145.field2196, class145.field2277);
        } else if (arg0 == 25) {
            class29.method486(class145.field2278, class145.field2371, class145.field2280);
        } else if (arg0 == 26) {
            class29.method486(class145.field2198, class145.field2391, class145.field2283);
        } else if (arg0 == 27) {
            class29.method486(class145.field2284, class145.field2282, class145.field2286);
        } else if (arg0 == 31) {
            class29.method486(class145.field2293, class145.field2226, class145.field2268);
        } else if (arg0 == 32) {
            class29.method486(class145.field2296, class145.field2297, class145.field2230);
        } else if (arg0 == 37) {
            class29.method486(class145.field2354, class145.field2300, class145.field2376);
        } else if (arg0 == 38) {
            class29.method486(class145.field2302, class145.field2279, class145.field2304);
        } else if (arg0 == 55) {
            class29.method486(class145.field2305, class145.field2306, class145.field2307);
        } else if (arg0 == 56) {
            class29.method486(class145.field2308, class145.field2309, class145.field2310);
            method559(11);
            return;
        } else if (arg0 == 57) {
            class29.method486(class145.field2311, class145.field2370, class145.field2203);
            method559(11);
            return;
        } else {
            class29.method486(class145.field2403, class145.field2315, class145.field2316);
        }
        method559(10);
    }

    @ObfuscatedName("af.l(I)V")
    public static final void method951() {
        if (Statics.field1522 != null) {
            Statics.field1522.method2609();
            Statics.field1522 = null;
        }
        method2442();
        Statics.field736.method1653();
        for (int var0 = 0; var0 < 4; var0++) {
            field512[var0].method3600();
        }
        System.gc();
        class164.method173(2);
        field487 = -1;
        field488 = false;
        class21.method1915();
        method559(10);
    }

    @ObfuscatedName("dn.m(I)V")
    public static final void method2442() {
        class42.method24();
        class38.field910.method3223();
        class41.field958.method3223();
        class37.method864();
        class36.field809.method3223();
        class36.field810.method3223();
        class46.field1070.method3223();
        class46.field1049.method3223();
        class46.field1027.method3223();
        class39.field914.method3223();
        class39.field923.method3223();
        class40.method1921();
        class43.method150();
        class47.field1074.method3223();
        class160.method2747();
        class155.method2012();
        ((class89) Statics.field1494).method1906();
        class19.field535.method3223();
        Statics.field2510.method2799();
        Statics.field1104.method2799();
        Statics.field119.method2799();
        Statics.field2945.method2799();
        Statics.field706.method2799();
        Statics.field1012.method2799();
        Statics.field122.method2799();
        Statics.field282.method2799();
        Statics.field720.method2799();
        Statics.field1679.method2799();
        Statics.field1889.method2799();
        Statics.field1923.method2799();
    }

    @ObfuscatedName("f.q(I)V")
    public static final void method1() {
        if (field380 > 0) {
            method951();
        } else {
            method559(40);
            Statics.field1849 = Statics.field1522;
            Statics.field1522 = null;
        }
    }

    @ObfuscatedName("c.h(S)V")
    public static final void method534() {
        if (field493 > 1) {
            field493--;
        }
        if (field380 > 0) {
            field380--;
        }
        if (field344) {
            field344 = false;
            method1();
            return;
        }
        if (!field379) {
            field399[0] = class145.field2406;
            field400[0] = "";
            field397[0] = 1006;
            field394 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1522 == null) {
                var1 = false;
            } else {
                label2527: {
                    try {
                        int var2 = Statics.field1522.method2611();
                        if (var2 == 0) {
                            var1 = false;
                            break label2527;
                        }
                        if (field274 == -1) {
                            Statics.field1522.method2612(field293.field1854, 0, 1);
                            field293.field1859 = 0;
                            field274 = field293.method2416();
                            field294 = class169.field2822[field274];
                            var2--;
                        }
                        if (field294 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2527;
                            }
                            Statics.field1522.method2612(field293.field1854, 0, 1);
                            field294 = field293.field1854[0] & 0xFF;
                            var2--;
                        }
                        if (field294 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2527;
                            }
                            Statics.field1522.method2612(field293.field1854, 0, 2);
                            field293.field1859 = 0;
                            field294 = field293.method2160();
                            var2 -= 2;
                        }
                        if (var2 < field294) {
                            var1 = false;
                            break label2527;
                        }
                        field293.field1859 = 0;
                        Statics.field1522.method2612(field293.field1854, 0, field294);
                        field296 = 0;
                        field301 = field315;
                        field315 = field299;
                        field299 = field274;
                        if (field274 == 219) {
                            int var3 = field293.method2160();
                            int var4 = field293.method2158();
                            int var5 = field293.method2160();
                            if (field489 != 0 && var4 != 0 && field492 < 50) {
                                field352[field492] = var3;
                                field494[field492] = var4;
                                field409[field492] = var5;
                                field497[field492] = null;
                                field496[field492] = 0;
                                field492++;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 197) {
                            field407 = field293.method2158();
                            field466 = field293.method2158();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 102) {
                            method152();
                            field418 = field293.method2161();
                            field448 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 174) {
                            method951();
                            field274 = -1;
                            var1 = false;
                            break label2527;
                        }
                        if (field274 == 231) {
                            int var9 = field293.method2340();
                            class14.method138(var9);
                            field439[++field440 - 1 & 0x1F] = var9 & 0x7FFF;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 16) {
                            method2431();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 201) {
                            int var10 = field293.method2339();
                            int var11 = field293.method2256();
                            int var12 = field293.method2340();
                            int var13 = field293.method2340();
                            class155 var14 = class155.method3191(var11);
                            if (var14.field2591 != var10 || var14.field2549 != var12 || var14.field2594 != var13) {
                                var14.field2591 = var10;
                                var14.field2549 = var12;
                                var14.field2594 = var13;
                                method2750(var14);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 223) {
                            int var15 = field293.method2158();
                            int var16 = field293.method2158();
                            int var17 = field293.method2158();
                            int var18 = field293.method2158();
                            field499[var15] = true;
                            field500[var15] = var16;
                            field501[var15] = var17;
                            field422[var15] = var18;
                            field503[var15] = 0;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 79) {
                            for (int var19 = 0; var19 < class157.field2680.length; var19++) {
                                if (class157.field2680[var19] != class157.field2679[var19]) {
                                    class157.field2680[var19] = class157.field2679[var19];
                                    method849(var19);
                                    field437[++field438 - 1 & 0x1F] = var19;
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 186) {
                            int var20 = field293.method2200();
                            class155 var21 = class155.method3191(var20);
                            for (int var22 = 0; var22 < var21.field2630.length; var22++) {
                                var21.field2630[var22] = -1;
                                var21.field2630[var22] = 0;
                            }
                            method2750(var21);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 255) {
                            int var23 = field293.method2348();
                            int var24 = field293.method2160();
                            if (var24 == 65535) {
                                var24 = -1;
                            }
                            int var25 = field293.method2348();
                            class155 var26 = class155.method3191(var25);
                            if (var26.field2603) {
                                var26.field2658 = var24;
                                var26.field2659 = var23;
                                class46 var28 = class46.method515(var24);
                                var26.field2591 = var28.field1036;
                                var26.field2549 = var28.field1055;
                                var26.field2584 = var28.field1021;
                                var26.field2589 = var28.field1039;
                                var26.field2602 = var28.field1040;
                                var26.field2594 = var28.field1035;
                                if (var28.field1041 == 1) {
                                    var26.field2597 = 1;
                                } else {
                                    var26.field2597 = 2;
                                }
                                if (var26.field2560 > 0) {
                                    var26.field2594 = var26.field2594 * 32 / var26.field2560;
                                }
                                method2750(var26);
                            } else {
                                if (var24 == -1) {
                                    var26.field2557 = 0;
                                    field274 = -1;
                                    var1 = true;
                                    break label2527;
                                }
                                class46 var27 = class46.method515(var24);
                                var26.field2557 = 4;
                                var26.field2548 = var24;
                                var26.field2591 = var27.field1036;
                                var26.field2549 = var27.field1055;
                                var26.field2594 = var27.field1035 * 100 / var23;
                                method2750(var26);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 85) {
                            field288 = true;
                            Statics.field2825 = field293.method2158();
                            Statics.field1002 = field293.method2158();
                            Statics.field995 = field293.method2160();
                            Statics.field926 = field293.method2158();
                            Statics.field79 = field293.method2158();
                            if (Statics.field79 >= 100) {
                                Statics.field1541 = Statics.field2825 * 128 + 64;
                                Statics.field112 = Statics.field1002 * 128 + 64;
                                Statics.field2909 = method2088(Statics.field1541, Statics.field112, Statics.field999) - Statics.field995;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 2) {
                            String var29 = field293.method2275();
                            Object[] var30 = new Object[var29.length() + 1];
                            for (int var31 = var29.length() - 1; var31 >= 0; var31--) {
                                if (var29.charAt(var31) == 's') {
                                    var30[var31 + 1] = field293.method2275();
                                } else {
                                    var30[var31 + 1] = Integer.valueOf(field293.method2256());
                                }
                            }
                            var30[0] = Integer.valueOf(field293.method2256());
                            class1 var32 = new class1();
                            var32.field7 = var30;
                            class33.method654(var32);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 128) {
                            int var33 = field293.method2160();
                            int var34 = field293.method2200();
                            class157.field2679[var33] = var34;
                            if (class157.field2680[var33] != var34) {
                                class157.field2680[var33] = var34;
                                method849(var33);
                            }
                            field437[++field438 - 1 & 0x1F] = var33;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 60) {
                            int var35 = field293.method2236();
                            String var36 = field293.method2275();
                            int var37 = field293.method2184();
                            if (var37 >= 1 && var37 <= 8) {
                                if (var36.equalsIgnoreCase("null")) {
                                    var36 = null;
                                }
                                field256[var37 - 1] = var36;
                                field382[var37 - 1] = var35 == 0;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 175) {
                            field288 = false;
                            for (int var38 = 0; var38 < 5; var38++) {
                                field499[var38] = false;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 29) {
                            int var39 = field293.method2295();
                            int var40 = field293.method2298();
                            int var41 = field293.method2348();
                            class155 var42 = class155.method3191(var41);
                            int var43 = var42.field2558 + var40;
                            int var44 = var42.field2559 + var39;
                            if (var42.field2569 != var43 || var42.field2554 != var44) {
                                var42.field2569 = var43;
                                var42.field2554 = var44;
                                method2750(var42);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 208) {
                            int var45 = field293.method2348();
                            int var46 = field293.method2192();
                            int var47 = var46 >> 10 & 0x1F;
                            int var48 = var46 >> 5 & 0x1F;
                            int var49 = var46 & 0x1F;
                            int var50 = (var49 << 3) + (var47 << 19) + (var48 << 11);
                            class155 var51 = class155.method3191(var45);
                            if (var51.field2593 != var50) {
                                var51.field2593 = var50;
                                method2750(var51);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 130) {
                            method152();
                            field417 = field293.method2158();
                            field448 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 178) {
                            if (field334 != -1) {
                                int var52 = field334;
                                if (class155.method2108(var52)) {
                                    method649(Statics.field2653[var52], 0);
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 243) {
                            int var53 = field293.method2280();
                            String var54 = field293.method2275();
                            class155 var55 = class155.method3191(var53);
                            if (!var54.equals(var55.field2599)) {
                                var55.field2599 = var54;
                                method2750(var55);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 176) {
                            int var56 = field293.method2340();
                            if (var56 == 65535) {
                                var56 = -1;
                            }
                            method34(var56);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 82) {
                            int var57 = field293.method2340();
                            if (var57 == 65535) {
                                var57 = -1;
                            }
                            int var58 = field293.method2314();
                            if (field479 != 0 && var57 != -1) {
                                class164.method118(Statics.field1889, var57, 0, field479, false);
                                field488 = true;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 115) {
                            int var59 = field293.method2256();
                            class4 var60 = (class4) field413.method3244((long) var59);
                            if (var60 != null) {
                                method561(var60, true);
                            }
                            if (field416 != null) {
                                method2750(field416);
                                field416 = null;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 48) {
                            int var61 = field294 + field293.field1859;
                            int var62 = field293.method2160();
                            int var63 = field293.method2160();
                            if (field334 != var62) {
                                field334 = var62;
                                method2502(field334);
                                class33.method607(field334);
                                for (int var64 = 0; var64 < 100; var64++) {
                                    field506[var64] = true;
                                }
                            }
                            while (var63-- > 0) {
                                int var65 = field293.method2256();
                                int var66 = field293.method2160();
                                int var67 = field293.method2158();
                                class4 var68 = (class4) field413.method3244((long) var65);
                                if (var68 != null && var68.field54 != var66) {
                                    method561(var68, true);
                                    var68 = null;
                                }
                                if (var68 == null) {
                                    var68 = method532(var65, var66, var67);
                                }
                                var68.field50 = true;
                            }
                            for (class4 var69 = (class4) field413.method3254(); var69 != null; var69 = (class4) field413.method3257()) {
                                if (var69.field50) {
                                    var69.field50 = false;
                                } else {
                                    method561(var69, true);
                                }
                            }
                            field455 = new class177(512);
                            while (field293.field1859 < var61) {
                                int var70 = field293.method2256();
                                int var71 = field293.method2160();
                                int var72 = field293.method2160();
                                int var73 = field293.method2256();
                                for (int var74 = var71; var74 <= var72; var74++) {
                                    long var75 = ((long) var70 << 32) + (long) var74;
                                    field455.method3245(new class182(var73), var75);
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 150) {
                            String var77 = field293.method2275();
                            long var78 = (long) field293.method2160();
                            long var80 = (long) field293.method2314();
                            class140[] var82 = new class140[] { class140.field2132, class140.field2126, class140.field2128, class140.field2127, class140.field2129 };
                            class140 var83 = (class140) class100.method2706(var82, field293.method2158());
                            long var84 = (var78 << 32) + var80;
                            boolean var86 = false;
                            for (int var87 = 0; var87 < 100; var87++) {
                                if (field470[var87] == var84) {
                                    var86 = true;
                                    break;
                                }
                            }
                            if (Statics.method32(var77)) {
                                var86 = true;
                            }
                            if (!var86 && field457 == 0) {
                                field470[field471] = var84;
                                field471 = (field471 + 1) % 100;
                                class111 var88 = field293;
                                String var92;
                                try {
                                    int var89 = var88.method2171();
                                    if (var89 > 32767) {
                                        var89 = 32767;
                                    }
                                    byte[] var90 = new byte[var89];
                                    var88.field1859 += Statics.field2950.method2097(var88.field1854, var88.field1859, var90, 0, var89);
                                    String var91 = class213.method567(var90, 0, var89);
                                    var92 = var91;
                                } catch (Exception var388) {
                                    var92 = "Cabbage";
                                }
                                String var95 = class204.method3463(class211.method2017(var92));
                                byte var96;
                                if (var83.field2125) {
                                    var96 = 7;
                                } else {
                                    var96 = 3;
                                }
                                if (var83.field2135 == -1) {
                                    class10.method2441(var96, var77, var95);
                                } else {
                                    class10.method2441(var96, class2.method1918(var83.field2135) + var77, var95);
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 70) {
                            boolean var97 = field293.method2184() == 1;
                            int var98 = field293.method2348();
                            class155 var99 = class155.method3191(var98);
                            if (var99.field2563 != var97) {
                                var99.field2563 = var97;
                                method2750(var99);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 25) {
                            field293.field1859 += 28;
                            if (field293.method2282()) {
                                class138.method2517(field293, field293.field1859 - 28);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 139) {
                            Statics.field577 = field293.method2158();
                            Statics.field129 = field293.method2184();
                            while (field293.field1859 < field294) {
                                field274 = field293.method2158();
                                method498();
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 47) {
                            int var100 = field293.method2160();
                            int var101 = field293.method2339();
                            int var102 = field293.method2256();
                            class155 var103 = class155.method3191(var102);
                            var103.field2628 = (var100 << 16) + var101;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 167) {
                            boolean var104 = field293.method2158() == 1;
                            if (var104) {
                                Statics.field547 = class104.method1417() - field293.method2201();
                                Statics.field621 = new class202(field293, true);
                            } else {
                                Statics.field621 = null;
                            }
                            field447 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 250) {
                            field505 = 1;
                            field444 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 107) {
                            int var105 = field293.method2298();
                            int var106 = field293.method2280();
                            class155 var107 = class155.method3191(var106);
                            if (var107.field2547 != var105 || var105 == -1) {
                                var107.field2547 = var105;
                                var107.field2660 = 0;
                                var107.field2661 = 0;
                                method2750(var107);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 11) {
                            int var108 = field293.method2256();
                            int var109 = field293.method2339();
                            class155 var110 = class155.method3191(var108);
                            if (var110.field2557 != 2 || var110.field2548 != var109) {
                                var110.field2557 = 2;
                                var110.field2548 = var109;
                                method2750(var110);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 56) {
                            String var111 = field293.method2275();
                            long var112 = field293.method2201();
                            long var114 = (long) field293.method2160();
                            long var116 = (long) field293.method2314();
                            class140[] var118 = new class140[] { class140.field2132, class140.field2126, class140.field2128, class140.field2127, class140.field2129 };
                            class140 var119 = (class140) class100.method2706(var118, field293.method2158());
                            long var120 = (var114 << 32) + var116;
                            boolean var122 = false;
                            for (int var123 = 0; var123 < 100; var123++) {
                                if (field470[var123] == var120) {
                                    var122 = true;
                                    break;
                                }
                            }
                            if (var119.field2133 && Statics.method32(var111)) {
                                var122 = true;
                            }
                            if (!var122 && field457 == 0) {
                                field470[field471] = var120;
                                field471 = (field471 + 1) % 100;
                                class111 var124 = field293;
                                String var128;
                                try {
                                    int var125 = var124.method2171();
                                    if (var125 > 32767) {
                                        var125 = 32767;
                                    }
                                    byte[] var126 = new byte[var125];
                                    var124.field1859 += Statics.field2950.method2097(var124.field1854, var124.field1859, var126, 0, var125);
                                    String var127 = class213.method567(var126, 0, var125);
                                    var128 = var127;
                                } catch (Exception var387) {
                                    var128 = "Cabbage";
                                }
                                String var131 = class204.method3463(class211.method2017(var128));
                                if (var119.field2135 == -1) {
                                    class10.method1819(9, var111, var131, class210.method2399(var112));
                                } else {
                                    class10.method1819(9, class2.method1918(var119.field2135) + var111, var131, class210.method2399(var112));
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 14) {
                            field288 = true;
                            Statics.field2062 = field293.method2158();
                            Statics.field2068 = field293.method2158();
                            Statics.field120 = field293.method2160();
                            Statics.field709 = field293.method2158();
                            Statics.field1301 = field293.method2158();
                            if (Statics.field1301 >= 100) {
                                int var132 = Statics.field2062 * 128 + 64;
                                int var133 = Statics.field2068 * 128 + 64;
                                int var134 = method2088(var132, var133, Statics.field999) - Statics.field120;
                                int var135 = var132 - Statics.field1541;
                                int var136 = var134 - Statics.field2909;
                                int var137 = var133 - Statics.field112;
                                int var138 = (int) Math.sqrt((double) (var135 * var135 + var137 * var137));
                                Statics.field708 = (int) (Math.atan2((double) var136, (double) var138) * 325.949D) & 0x7FF;
                                Statics.field2031 = (int) (Math.atan2((double) var135, (double) var137) * -325.949D) & 0x7FF;
                                if (Statics.field708 < 128) {
                                    Statics.field708 = 128;
                                }
                                if (Statics.field708 > 383) {
                                    Statics.field708 = 383;
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 160) {
                            method159(false);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 89) {
                            Statics.field129 = field293.method2184();
                            Statics.field577 = field293.method2236();
                            for (int var139 = Statics.field577; var139 < Statics.field577 + 8; var139++) {
                                for (int var140 = Statics.field129; var140 < Statics.field129 + 8; var140++) {
                                    if (field393[Statics.field999][var139][var140] != null) {
                                        field393[Statics.field999][var139][var140] = null;
                                        method155(var139, var140);
                                    }
                                }
                            }
                            for (class15 var141 = (class15) field385.method3285(); var141 != null; var141 = (class15) field385.method3286()) {
                                if (var141.field218 >= Statics.field577 && var141.field218 < Statics.field577 + 8 && var141.field206 >= Statics.field129 && var141.field206 < Statics.field129 + 8 && Statics.field999 == var141.field207) {
                                    var141.field214 = 0;
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 179) {
                            int var142 = field293.method2256();
                            int var143 = field293.method2160();
                            if (var142 < -70000) {
                                var143 += 32768;
                            }
                            class155 var144;
                            if (var142 >= 0) {
                                var144 = class155.method3191(var142);
                            } else {
                                var144 = null;
                            }
                            while (field293.field1859 < field294) {
                                int var145 = field293.method2171();
                                int var146 = field293.method2160();
                                int var147 = 0;
                                if (var146 != 0) {
                                    var147 = field293.method2158();
                                    if (var147 == 255) {
                                        var147 = field293.method2256();
                                    }
                                }
                                if (var144 != null && var145 >= 0 && var145 < var144.field2630.length) {
                                    var144.field2630[var145] = var146;
                                    var144.field2657[var145] = var147;
                                }
                                class14.method2579(var143, var145, var146 - 1, var147);
                            }
                            if (var144 != null) {
                                method2750(var144);
                            }
                            method152();
                            field439[++field440 - 1 & 0x1F] = var143 & 0x7FFF;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 217) {
                            int var148 = field293.method2171();
                            boolean var149 = field293.method2158() == 1;
                            String var150 = "";
                            boolean var151 = false;
                            if (var149) {
                                var150 = field293.method2275();
                                if (Statics.method32(var150)) {
                                    var151 = true;
                                }
                            }
                            String var152 = field293.method2275();
                            if (!var151) {
                                class10.method2441(var148, var150, var152);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 233) {
                            field462 = field293.method2158();
                            if (field462 == 255) {
                                field462 = 0;
                            }
                            field298 = field293.method2158();
                            if (field298 == 255) {
                                field298 = 0;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 252) {
                            int var153 = field293.method2280();
                            int var154 = field293.method2192();
                            class155 var155 = class155.method3191(var153);
                            if (var155.field2557 != 1 || var155.field2548 != var154) {
                                var155.field2557 = 1;
                                var155.field2548 = var154;
                                method2750(var155);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 170) {
                            int var156 = field293.method2160();
                            int var157 = field293.method2256();
                            class155 var158 = class155.method3191(var157);
                            if (var158 != null && var158.field2570 == 0) {
                                if (var156 > var158.field2587 - var158.field2567) {
                                    var156 = var158.field2587 - var158.field2567;
                                }
                                if (var156 < 0) {
                                    var156 = 0;
                                }
                                if (var158.field2565 != var156) {
                                    var158.field2565 = var156;
                                    method2750(var158);
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 228) {
                            method152();
                            int var159 = field293.method2236();
                            int var160 = field293.method2158();
                            int var161 = field293.method2256();
                            field458[var160] = var161;
                            field389[var160] = var159;
                            field390[var160] = 1;
                            for (int var162 = 0; var162 < 98; var162++) {
                                if (var161 >= class143.field2161[var162]) {
                                    field390[var160] = var162 + 2;
                                }
                            }
                            field441[++field442 - 1 & 0x1F] = var160;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 209) {
                            int var163 = field293.method2340();
                            int var164 = field293.method2256();
                            int var165 = field293.method2158();
                            class4 var166 = (class4) field413.method3244((long) var164);
                            if (var166 != null) {
                                method561(var166, var166.field54 != var163);
                            }
                            method532(var164, var163, var165);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 42) {
                            for (int var167 = 0; var167 < field369.length; var167++) {
                                if (field369[var167] != null) {
                                    field369[var167].field792 = -1;
                                }
                            }
                            for (int var168 = 0; var168 < field415.length; var168++) {
                                if (field415[var168] != null) {
                                    field415[var168].field792 = -1;
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 189) {
                            field269 = field293.method2158();
                            if (field269 == 1) {
                                field270 = field293.method2160();
                            }
                            if (field269 >= 2 && field269 <= 6) {
                                if (field269 == 2) {
                                    field275 = 64;
                                    field276 = 64;
                                }
                                if (field269 == 3) {
                                    field275 = 0;
                                    field276 = 64;
                                }
                                if (field269 == 4) {
                                    field275 = 128;
                                    field276 = 64;
                                }
                                if (field269 == 5) {
                                    field275 = 64;
                                    field276 = 0;
                                }
                                if (field269 == 6) {
                                    field275 = 64;
                                    field276 = 128;
                                }
                                field269 = 2;
                                field272 = field293.method2160();
                                field486 = field293.method2160();
                                field342 = field293.method2158();
                            }
                            if (field269 == 10) {
                                field271 = field293.method2160();
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 172) {
                            method3374();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 213) {
                            int var169 = field293.method2158();
                            if (field293.method2158() == 0) {
                                field513[var169] = new class201();
                                field293.field1859 += 18;
                            } else {
                                field293.field1859--;
                                field513[var169] = new class201(field293, false);
                            }
                            field446 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 61) {
                            field493 = field293.method2339() * 30;
                            field448 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 112) {
                            field445 = field495;
                            if (field294 == 0) {
                                field476 = null;
                                field477 = null;
                                Statics.field704 = 0;
                                Statics.field1684 = null;
                                field274 = -1;
                                var1 = true;
                            } else {
                                field477 = field293.method2275();
                                long var170 = field293.method2201();
                                long var172 = var170;
                                String var174;
                                if (var170 <= 0L || var170 >= 6582952005840035281L) {
                                    var174 = null;
                                } else if (var170 % 37L == 0L) {
                                    var174 = null;
                                } else {
                                    int var175 = 0;
                                    for (long var176 = var170; var176 != 0L; var176 /= 37L) {
                                        var175++;
                                    }
                                    StringBuilder var178 = new StringBuilder(var175);
                                    while (var172 != 0L) {
                                        long var179 = var172;
                                        var172 /= 37L;
                                        var178.append(class210.field3009[(int) (var179 - var172 * 37L)]);
                                    }
                                    var174 = var178.reverse().toString();
                                }
                                field476 = var174;
                                Statics.field710 = field293.method2159();
                                int var181 = field293.method2158();
                                if (var181 == 255) {
                                    field274 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field704 = var181;
                                    class22[] var182 = new class22[100];
                                    for (int var183 = 0; var183 < Statics.field704; var183++) {
                                        var182[var183] = new class22();
                                        var182[var183].field575 = field293.method2275();
                                        var182[var183].field569 = class212.method2741(var182[var183].field575, Statics.field2060);
                                        var182[var183].field579 = field293.method2160();
                                        var182[var183].field570 = field293.method2159();
                                        field293.method2275();
                                        if (var182[var183].field575.equals(Statics.field377.field46)) {
                                            Statics.field127 = var182[var183].field570;
                                        }
                                    }
                                    boolean var184 = false;
                                    int var185 = Statics.field704;
                                    while (var185 > 0) {
                                        boolean var186 = true;
                                        var185--;
                                        for (int var187 = 0; var187 < var185; var187++) {
                                            if (var182[var187].field569.compareTo(var182[var187 + 1].field569) > 0) {
                                                class22 var188 = var182[var187];
                                                var182[var187] = var182[var187 + 1];
                                                var182[var187 + 1] = var188;
                                                var186 = false;
                                            }
                                        }
                                        if (var186) {
                                            break;
                                        }
                                    }
                                    Statics.field1684 = var182;
                                    field274 = -1;
                                    var1 = true;
                                }
                            }
                            break label2527;
                        }
                        if (field274 == 162) {
                            int var189 = field293.method2256();
                            int var190 = field293.method2160();
                            if (var189 < -70000) {
                                var190 += 32768;
                            }
                            class155 var191;
                            if (var189 >= 0) {
                                var191 = class155.method3191(var189);
                            } else {
                                var191 = null;
                            }
                            if (var191 != null) {
                                for (int var192 = 0; var192 < var191.field2630.length; var192++) {
                                    var191.field2630[var192] = 0;
                                    var191.field2657[var192] = 0;
                                }
                            }
                            class14 var193 = (class14) class14.field199.method3244((long) var190);
                            if (var193 != null) {
                                for (int var194 = 0; var194 < var193.field189.length; var194++) {
                                    var193.field189[var194] = -1;
                                    var193.field190[var194] = 0;
                                }
                            }
                            int var195 = field293.method2160();
                            for (int var196 = 0; var196 < var195; var196++) {
                                int var197 = field293.method2160();
                                int var198 = field293.method2236();
                                if (var198 == 255) {
                                    var198 = field293.method2348();
                                }
                                if (var191 != null && var196 < var191.field2630.length) {
                                    var191.field2630[var196] = var197;
                                    var191.field2657[var196] = var198;
                                }
                                class14.method2579(var190, var196, var197 - 1, var198);
                            }
                            if (var191 != null) {
                                method2750(var191);
                            }
                            method152();
                            field439[++field440 - 1 & 0x1F] = var190 & 0x7FFF;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 242) {
                            class192.method174(field293, field294);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 63) {
                            int var199 = field293.method2340();
                            field334 = var199;
                            method2502(var199);
                            class33.method607(field334);
                            for (int var200 = 0; var200 < 100; var200++) {
                                field506[var200] = true;
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 83) {
                            for (int var201 = 0; var201 < Statics.field1072; var201++) {
                                class47 var202 = class47.method2889(var201);
                                if (var202 != null) {
                                    class157.field2679[var201] = 0;
                                    class157.field2680[var201] = 0;
                                }
                            }
                            method152();
                            field438 += 32;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 240) {
                            int var203 = field293.method2192();
                            byte var204 = field293.method2163();
                            class157.field2679[var203] = var204;
                            if (class157.field2680[var203] != var204) {
                                class157.field2680[var203] = var204;
                                method849(var203);
                            }
                            field437[++field438 - 1 & 0x1F] = var203;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 106) {
                            String var205 = field293.method2275();
                            class111 var206 = field293;
                            String var210;
                            try {
                                int var207 = var206.method2171();
                                if (var207 > 32767) {
                                    var207 = 32767;
                                }
                                byte[] var208 = new byte[var207];
                                var206.field1859 += Statics.field2950.method2097(var206.field1854, var206.field1859, var208, 0, var207);
                                String var209 = class213.method567(var208, 0, var207);
                                var210 = var209;
                            } catch (Exception var386) {
                                var210 = "Cabbage";
                            }
                            String var213 = class204.method3463(class211.method2017(var210));
                            class10.method2441(6, var205, var213);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 159) {
                            int var214 = field293.method2256();
                            class155 var215 = class155.method3191(var214);
                            var215.field2557 = 3;
                            var215.field2548 = Statics.field377.field26.method2974();
                            method2750(var215);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 227) {
                            Statics.field22 = class119.method182(field293.method2158());
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 49) {
                            int var216 = field293.method2280();
                            Statics.field1597 = Statics.field29.method2527(var216);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 222 || field274 == 20 || field274 == 194 || field274 == 154 || field274 == 181 || field274 == 199 || field274 == 247 || field274 == 254 || field274 == 126 || field274 == 149) {
                            method498();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 151) {
                            while (field293.field1859 < field294) {
                                boolean var217 = field293.method2158() == 1;
                                String var218 = field293.method2275();
                                String var219 = field293.method2275();
                                int var220 = field293.method2160();
                                int var221 = field293.method2158();
                                int var222 = field293.method2158();
                                boolean var223 = (var222 & 0x2) != 0;
                                boolean var224 = (var222 & 0x1) != 0;
                                if (var220 > 0) {
                                    field293.method2275();
                                    field293.method2158();
                                    field293.method2256();
                                }
                                field293.method2275();
                                for (int var225 = 0; var225 < field396; var225++) {
                                    class16 var226 = field277[var225];
                                    if (var217) {
                                        if (var219.equals(var226.field221)) {
                                            var226.field221 = var218;
                                            var226.field227 = var219;
                                            var218 = null;
                                            break;
                                        }
                                    } else if (var218.equals(var226.field221)) {
                                        if (var226.field222 != var220) {
                                            boolean var227 = true;
                                            for (class35 var228 = (class35) field507.method3235(); var228 != null; var228 = (class35) field507.method3236()) {
                                                if (var228.field801.equals(var218)) {
                                                    if (var220 != 0 && var228.field802 == 0) {
                                                        var228.method3361();
                                                        var227 = false;
                                                    } else if (var220 == 0 && var228.field802 != 0) {
                                                        var228.method3361();
                                                        var227 = false;
                                                    }
                                                }
                                            }
                                            if (var227) {
                                                field507.method3234(new class35(var218, var220));
                                            }
                                            var226.field222 = var220;
                                        }
                                        var226.field227 = var219;
                                        var226.field223 = var221;
                                        var226.field224 = var223;
                                        var226.field229 = var224;
                                        var218 = null;
                                        break;
                                    }
                                }
                                if (var218 != null && field396 < 400) {
                                    class16 var229 = new class16();
                                    field277[field396] = var229;
                                    var229.field221 = var218;
                                    var229.field227 = var219;
                                    var229.field222 = var220;
                                    var229.field223 = var221;
                                    var229.field224 = var223;
                                    var229.field229 = var224;
                                    field396++;
                                }
                            }
                            field505 = 2;
                            field444 = field495;
                            boolean var230 = false;
                            int var231 = field396;
                            while (var231 > 0) {
                                boolean var232 = true;
                                var231--;
                                for (int var233 = 0; var233 < var231; var233++) {
                                    boolean var234 = false;
                                    class16 var235 = field277[var233];
                                    class16 var236 = field277[var233 + 1];
                                    if (field253 != var235.field222 && field253 == var236.field222) {
                                        var234 = true;
                                    }
                                    if (!var234 && var235.field222 == 0 && var236.field222 != 0) {
                                        var234 = true;
                                    }
                                    if (!var234 && !var235.field224 && var236.field224) {
                                        var234 = true;
                                    }
                                    if (!var234 && !var235.field229 && var236.field229) {
                                        var234 = true;
                                    }
                                    if (var234) {
                                        class16 var237 = field277[var233];
                                        field277[var233] = field277[var233 + 1];
                                        field277[var233 + 1] = var237;
                                        var232 = false;
                                    }
                                }
                                if (var232) {
                                    break;
                                }
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 41) {
                            Statics.field577 = field293.method2184();
                            Statics.field129 = field293.method2316();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 35) {
                            String var238 = field293.method2275();
                            int var239 = field293.method2160();
                            byte var240 = field293.method2159();
                            boolean var241 = false;
                            if (var240 == -128) {
                                var241 = true;
                            }
                            if (var241) {
                                if (Statics.field704 == 0) {
                                    field274 = -1;
                                    var1 = true;
                                    break label2527;
                                }
                                boolean var242 = false;
                                int var243;
                                for (var243 = 0; var243 < Statics.field704 && (!Statics.field1684[var243].field575.equals(var238) || Statics.field1684[var243].field579 != var239); var243++) {
                                }
                                if (var243 < Statics.field704) {
                                    while (var243 < Statics.field704 - 1) {
                                        Statics.field1684[var243] = Statics.field1684[var243 + 1];
                                        var243++;
                                    }
                                    Statics.field704--;
                                    Statics.field1684[Statics.field704] = null;
                                }
                            } else {
                                field293.method2275();
                                class22 var244 = new class22();
                                var244.field575 = var238;
                                var244.field569 = class212.method2741(var244.field575, Statics.field2060);
                                var244.field579 = var239;
                                var244.field570 = var240;
                                int var245;
                                for (var245 = Statics.field704 - 1; var245 >= 0; var245--) {
                                    int var246 = Statics.field1684[var245].field569.compareTo(var244.field569);
                                    if (var246 == 0) {
                                        Statics.field1684[var245].field579 = var239;
                                        Statics.field1684[var245].field570 = var240;
                                        if (var238.equals(Statics.field377.field46)) {
                                            Statics.field127 = var240;
                                        }
                                        field445 = field495;
                                        field274 = -1;
                                        var1 = true;
                                        break label2527;
                                    }
                                    if (var246 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field704 >= Statics.field1684.length) {
                                    field274 = -1;
                                    var1 = true;
                                    break label2527;
                                }
                                for (int var247 = Statics.field704 - 1; var247 > var245; var247--) {
                                    Statics.field1684[var247 + 1] = Statics.field1684[var247];
                                }
                                if (Statics.field704 == 0) {
                                    Statics.field1684 = new class22[100];
                                }
                                Statics.field1684[var245 + 1] = var244;
                                Statics.field704++;
                                if (var238.equals(Statics.field377.field46)) {
                                    Statics.field127 = var240;
                                }
                            }
                            field445 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 146) {
                            field335 = field293.method2158();
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 108) {
                            method159(true);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 7) {
                            class23 var248 = new class23();
                            var248.field586 = field293.method2275();
                            var248.field582 = field293.method2160();
                            int var249 = field293.method2256();
                            var248.field585 = var249;
                            method559(45);
                            Statics.field1522.method2609();
                            Statics.field1522 = null;
                            class29.method1815(var248);
                            field274 = -1;
                            var1 = false;
                            break label2527;
                        }
                        if (field274 == 198) {
                            int var250 = field293.method2236();
                            int var251 = field293.method2184();
                            int var252 = field293.method2236();
                            Statics.field999 = var251 >> 1;
                            Statics.field377.method623(var250, var252, (var251 & 0x1) == 1);
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 12) {
                            while (field293.field1859 < field294) {
                                int var253 = field293.method2158();
                                boolean var254 = (var253 & 0x1) == 1;
                                String var255 = field293.method2275();
                                String var256 = field293.method2275();
                                field293.method2275();
                                for (int var257 = 0; var257 < field403; var257++) {
                                    class8 var258 = field509[var257];
                                    if (var254) {
                                        if (var256.equals(var258.field126)) {
                                            var258.field126 = var255;
                                            var258.field124 = var256;
                                            var255 = null;
                                            break;
                                        }
                                    } else if (var255.equals(var258.field126)) {
                                        var258.field126 = var255;
                                        var258.field124 = var256;
                                        var255 = null;
                                        break;
                                    }
                                }
                                if (var255 != null && field403 < 400) {
                                    class8 var259 = new class8();
                                    field509[field403] = var259;
                                    var259.field126 = var255;
                                    var259.field124 = var256;
                                    field403++;
                                }
                            }
                            field444 = field495;
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        if (field274 == 161) {
                            int var260 = field293.method2348();
                            int var261 = field293.method2280();
                            int var262 = field293.method2339();
                            if (var262 == 65535) {
                                var262 = -1;
                            }
                            int var263 = field293.method2340();
                            if (var263 == 65535) {
                                var263 = -1;
                            }
                            for (int var264 = var262; var264 <= var263; var264++) {
                                long var265 = ((long) var260 << 32) + (long) var264;
                                class189 var267 = field455.method3244(var265);
                                if (var267 != null) {
                                    var267.method3367();
                                }
                                field455.method3245(new class182(var261), var265);
                            }
                            field274 = -1;
                            var1 = true;
                            break label2527;
                        }
                        class137.method94("" + field274 + class2.field15 + field315 + class2.field15 + field301 + class2.field15 + field294, (Throwable) null);
                        method951();
                    } catch (IOException var390) {
                        method1();
                    } catch (Exception var391) {
                        String var270 = "" + field274 + class2.field15 + field315 + class2.field15 + field301 + class2.field15 + field294 + class2.field15 + (Statics.field140 + Statics.field377.field740[0]) + class2.field15 + (Statics.field737 + Statics.field377.field795[0]) + class2.field15;
                        for (int var271 = 0; var271 < field294 && var271 < 50; var271++) {
                            var270 = var270 + field293.field1854[var271] + class2.field15;
                        }
                        class137.method94(var270, var391);
                        method951();
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
        while (class192.method883()) {
            field291.method2406(192);
            field291.method2144(0);
            int var272 = field291.field1859;
            class192.method141(field291);
            field291.method2354(field291.field1859 - var272);
        }
        Object var273 = Statics.field1530.field172;
        synchronized (Statics.field1530.field172) {
            if (!field252) {
                Statics.field1530.field168 = 0;
            } else if (class129.field2022 != 0 || Statics.field1530.field168 >= 40) {
                field291.method2406(198);
                field291.method2144(0);
                int var274 = field291.field1859;
                int var275 = 0;
                for (int var276 = 0; var276 < Statics.field1530.field168 && field291.field1859 - var274 < 240; var276++) {
                    var275++;
                    int var277 = Statics.field1530.field170[var276];
                    if (var277 < 0) {
                        var277 = 0;
                    } else if (var277 > 502) {
                        var277 = 502;
                    }
                    int var278 = Statics.field1530.field169[var276];
                    if (var278 < 0) {
                        var278 = 0;
                    } else if (var278 > 764) {
                        var278 = 764;
                    }
                    int var279 = var277 * 765 + var278;
                    if (Statics.field1530.field170[var276] == -1 && Statics.field1530.field169[var276] == -1) {
                        var278 = -1;
                        var277 = -1;
                        var279 = 524287;
                    }
                    if (field263 != var278 || field264 != var277) {
                        int var280 = var278 - field263;
                        field263 = var278;
                        int var281 = var277 - field264;
                        field264 = var277;
                        if (field265 < 8 && var280 >= -32 && var280 <= 31 && var281 >= -32 && var281 <= 31) {
                            var280 += 32;
                            var281 += 32;
                            field291.method2145((field265 << 12) + (var280 << 6) + var281);
                            field265 = 0;
                        } else if (field265 < 8) {
                            field291.method2146((field265 << 19) + 8388608 + var279);
                            field265 = 0;
                        } else {
                            field291.method2147((field265 << 19) + -1073741824 + var279);
                            field265 = 0;
                        }
                    } else if (field265 < 2047) {
                        field265++;
                    }
                }
                field291.method2354(field291.field1859 - var274);
                if (var275 >= Statics.field1530.field168) {
                    Statics.field1530.field168 = 0;
                } else {
                    Statics.field1530.field168 -= var275;
                    for (int var282 = 0; var282 < Statics.field1530.field168; var282++) {
                        Statics.field1530.field169[var282] = Statics.field1530.field169[var275 + var282];
                        Statics.field1530.field170[var282] = Statics.field1530.field170[var275 + var282];
                    }
                }
            }
        }
        if (class129.field2022 == 1 || !Statics.field1264 && class129.field2022 == 4 || class129.field2022 == 2) {
            long var284 = (class129.field2026 - field468 * -1L) / 50L;
            if (var284 > 4095L) {
                var284 = 4095L;
            }
            field468 = class129.field2026 * -1L;
            int var286 = class129.field2011;
            if (var286 < 0) {
                var286 = 0;
            } else if (var286 > 502) {
                var286 = 502;
            }
            int var287 = class129.field2030;
            if (var287 < 0) {
                var287 = 0;
            } else if (var287 > 764) {
                var287 = 764;
            }
            int var288 = var286 * 765 + var287;
            byte var289 = 0;
            if (class129.field2022 == 2) {
                var289 = 1;
            }
            int var290 = (int) var284;
            field291.method2406(133);
            field291.method2147((var289 << 19) + (var290 << 20) + var288);
        }
        if (class126.field1984 > 0) {
            field291.method2406(12);
            field291.method2145(0);
            int var291 = field291.field1859;
            long var292 = class104.method1417();
            for (int var294 = 0; var294 < class126.field1984; var294++) {
                long var295 = var292 - field475;
                if (var295 > 16777215L) {
                    var295 = 16777215L;
                }
                field475 = var292;
                field291.method2180(class126.field1994[var294]);
                field291.method2195((int) var295);
            }
            field291.method2154(field291.field1859 - var291);
        }
        if (field325 > 0) {
            field325--;
        }
        if (class126.field1979[96] || class126.field1979[97] || class126.field1979[98] || class126.field1979[99]) {
            field340 = true;
        }
        if (field340 && field325 <= 0) {
            field325 = 20;
            field340 = false;
            field291.method2406(113);
            field291.method2188(field262);
            field291.method2145(field339);
        }
        if (Statics.field652 && !field510) {
            field510 = true;
            field291.method2406(115);
            field291.method2144(1);
        }
        if (!Statics.field652 && field510) {
            field510 = false;
            field291.method2406(115);
            field291.method2144(0);
        }
        method2941();
        if (field259 != 30) {
            return;
        }
        method530();
        method566();
        field296++;
        if (field296 > 750) {
            method1();
            return;
        }
        Statics.method2746();
        method487();
        for (int var297 = -1; var297 < field412; var297++) {
            int var298;
            if (var297 == -1) {
                var298 = 2047;
            } else {
                var298 = field371[var297];
            }
            class3 var299 = field369[var298];
            if (var299 != null && var299.field756 > 0) {
                var299.field756--;
                if (var299.field756 == 0) {
                    var299.field753 = null;
                }
            }
        }
        for (int var300 = 0; var300 < field289; var300++) {
            int var301 = field290[var300];
            class31 var302 = field415[var301];
            if (var302 != null && var302.field756 > 0) {
                var302.field756--;
                if (var302.field756 == 0) {
                    var302.field753 = null;
                }
            }
        }
        field316++;
        if (field359 != 0) {
            field358 += 20;
            if (field358 >= 400) {
                field359 = 0;
            }
        }
        if (Statics.field993 != null) {
            field360++;
            if (field360 >= 15) {
                method2750(Statics.field993);
                Statics.field993 = null;
            }
        }
        class155 var303 = Statics.field1685;
        class155 var304 = Statics.field2475;
        Statics.field1685 = null;
        Statics.field2475 = null;
        field428 = null;
        field432 = false;
        field429 = false;
        field504 = 0;
        while (class126.method516() && field504 < 128) {
            if (field419 >= 2 && class126.field1979[82] && Statics.field521 == 66) {
                String var305 = class10.method2751();
                Statics.field1364.setContents(new StringSelection(var305), (ClipboardOwner) null);
            } else {
                field485[field504] = Statics.field521;
                field451[field504] = Statics.field1470;
                field504++;
            }
        }
        method616(field334, 0, 0, 765, 503, 0, 0);
        field495++;
        while (true) {
            class1 var306;
            class155 var307;
            class155 var308;
            do {
                var306 = (class1) field453.method3275();
                if (var306 == null) {
                    while (true) {
                        class1 var309;
                        class155 var310;
                        class155 var311;
                        do {
                            var309 = (class1) field297.method3275();
                            if (var309 == null) {
                                while (true) {
                                    class1 var312;
                                    class155 var313;
                                    class155 var314;
                                    do {
                                        var312 = (class1) field452.method3275();
                                        if (var312 == null) {
                                            boolean var315 = false;
                                            while (!var315) {
                                                var315 = true;
                                                for (int var316 = 0; var316 < field394 - 1; var316++) {
                                                    if (field397[var316] < 1000 && field397[var316 + 1] > 1000) {
                                                        String var317 = field400[var316];
                                                        field400[var316] = field400[var316 + 1];
                                                        field400[var316 + 1] = var317;
                                                        String var318 = field399[var316];
                                                        field399[var316] = field399[var316 + 1];
                                                        field399[var316 + 1] = var318;
                                                        int var319 = field397[var316];
                                                        field397[var316] = field397[var316 + 1];
                                                        field397[var316 + 1] = var319;
                                                        int var320 = field307[var316];
                                                        field307[var316] = field307[var316 + 1];
                                                        field307[var316 + 1] = var320;
                                                        int var321 = field266[var316];
                                                        field266[var316] = field266[var316 + 1];
                                                        field266[var316 + 1] = var321;
                                                        int var322 = field398[var316];
                                                        field398[var316] = field398[var316 + 1];
                                                        field398[var316 + 1] = var322;
                                                        var315 = false;
                                                    }
                                                }
                                            }
                                            if (Statics.field177 == null && field424 == null) {
                                                int var323 = class129.field2022;
                                                if (field379) {
                                                    if (var323 != 1 && (Statics.field1264 || var323 != 4)) {
                                                        int var324 = class129.field2017;
                                                        int var325 = class129.field2018;
                                                        if (var324 < Statics.field230 - 10 || var324 > Statics.field711 + Statics.field230 + 10 || var325 < Statics.field2155 - 10 || var325 > Statics.field2155 + Statics.field193 + 10) {
                                                            field379 = false;
                                                            method3(Statics.field230, Statics.field2155, Statics.field711, Statics.field193);
                                                        }
                                                    }
                                                    if (var323 == 1 || !Statics.field1264 && var323 == 4) {
                                                        int var326 = Statics.field230;
                                                        int var327 = Statics.field2155;
                                                        int var328 = Statics.field711;
                                                        int var329 = class129.field2030;
                                                        int var330 = class129.field2011;
                                                        int var331 = -1;
                                                        for (int var332 = 0; var332 < field394; var332++) {
                                                            int var333 = (field394 - 1 - var332) * 15 + var327 + 31;
                                                            if (var329 > var326 && var329 < var326 + var328 && var330 > var333 - 13 && var330 < var333 + 3) {
                                                                var331 = var332;
                                                            }
                                                        }
                                                        if (var331 != -1 && var331 >= 0) {
                                                            int var334 = field307[var331];
                                                            int var335 = field266[var331];
                                                            int var336 = field397[var331];
                                                            int var337 = field398[var331];
                                                            String var338 = field399[var331];
                                                            String var339 = field400[var331];
                                                            method1383(var334, var335, var336, var337, var338, var339, class129.field2030, class129.field2011);
                                                        }
                                                        field379 = false;
                                                        method3(Statics.field230, Statics.field2155, Statics.field711, Statics.field193);
                                                    }
                                                } else {
                                                    label2724: {
                                                        if ((var323 == 1 || !Statics.field1264 && var323 == 4) && field394 > 0) {
                                                            int var340 = field397[field394 - 1];
                                                            if (var340 == 39 || var340 == 40 || var340 == 41 || var340 == 42 || var340 == 43 || var340 == 33 || var340 == 34 || var340 == 35 || var340 == 36 || var340 == 37 || var340 == 38 || var340 == 1005) {
                                                                int var341 = field307[field394 - 1];
                                                                int var342 = field266[field394 - 1];
                                                                class155 var343 = class155.method3191(var342);
                                                                if (class159.method172(method38(var343)) || class159.method2841(method38(var343))) {
                                                                    if (Statics.field177 != null && !field366 && field392 != 1 && !Statics.method37(field394 - 1) && field394 > 0) {
                                                                        int var344 = field363;
                                                                        int var345 = field364;
                                                                        method97(Statics.field1826, var344, var345);
                                                                        Statics.field1826 = null;
                                                                    }
                                                                    field366 = false;
                                                                    field356 = 0;
                                                                    if (Statics.field177 != null) {
                                                                        method2750(Statics.field177);
                                                                    }
                                                                    Statics.field177 = class155.method3191(var342);
                                                                    field362 = var341;
                                                                    field363 = class129.field2030;
                                                                    field364 = class129.field2011;
                                                                    if (field394 > 0) {
                                                                        int var346 = field394 - 1;
                                                                        Statics.field1826 = new class28();
                                                                        Statics.field1826.field651 = field307[var346];
                                                                        Statics.field1826.field649 = field266[var346];
                                                                        Statics.field1826.field647 = field397[var346];
                                                                        Statics.field1826.field648 = field398[var346];
                                                                        Statics.field1826.field646 = field399[var346];
                                                                    }
                                                                    method2750(Statics.field177);
                                                                    break label2724;
                                                                }
                                                            }
                                                        }
                                                        if ((var323 == 1 || !Statics.field1264 && var323 == 4) && (field392 == 1 && field394 > 2 || Statics.method37(field394 - 1))) {
                                                            var323 = 2;
                                                        }
                                                        if ((var323 == 1 || !Statics.field1264 && var323 == 4) && field394 > 0) {
                                                            int var347 = field394 - 1;
                                                            if (var347 >= 0) {
                                                                int var348 = field307[var347];
                                                                int var349 = field266[var347];
                                                                int var350 = field397[var347];
                                                                int var351 = field398[var347];
                                                                String var352 = field399[var347];
                                                                String var353 = field400[var347];
                                                                method1383(var348, var349, var350, var351, var352, var353, class129.field2030, class129.field2011);
                                                            }
                                                        }
                                                        if (var323 == 2 && field394 > 0) {
                                                            Statics.method181(class129.field2030, class129.field2011);
                                                        }
                                                    }
                                                }
                                            }
                                            if (field424 != null) {
                                                method626();
                                            }
                                            if (Statics.field177 != null) {
                                                method2750(Statics.field177);
                                                field356++;
                                                if (class129.field2016 == 0) {
                                                    if (field366) {
                                                        if (Statics.field1937 == Statics.field177 && field367 != field362) {
                                                            class155 var354 = Statics.field177;
                                                            byte var355 = 0;
                                                            if (field365 == 1 && var354.field2555 == 206) {
                                                                var355 = 1;
                                                            }
                                                            if (var354.field2630[field367] <= 0) {
                                                                var355 = 0;
                                                            }
                                                            if (class159.method2841(method38(var354))) {
                                                                int var356 = field362;
                                                                int var357 = field367;
                                                                var354.field2630[var357] = var354.field2630[var356];
                                                                var354.field2657[var357] = var354.field2657[var356];
                                                                var354.field2630[var356] = -1;
                                                                var354.field2657[var356] = 0;
                                                            } else if (var355 == 1) {
                                                                int var358 = field362;
                                                                int var359 = field367;
                                                                while (var358 != var359) {
                                                                    if (var358 > var359) {
                                                                        var354.method2916(var358 - 1, var358);
                                                                        var358--;
                                                                    } else if (var358 < var359) {
                                                                        var354.method2916(var358 + 1, var358);
                                                                        var358++;
                                                                    }
                                                                }
                                                            } else {
                                                                var354.method2916(field367, field362);
                                                            }
                                                            field291.method2406(114);
                                                            field291.method2147(Statics.field177.field2551);
                                                            field291.method2291(field367);
                                                            field291.method2188(field362);
                                                            field291.method2181(var355);
                                                        }
                                                    } else if ((field392 == 1 || Statics.method37(field394 - 1)) && field394 > 2) {
                                                        Statics.method181(field363, field364);
                                                    } else if (field394 > 0) {
                                                        int var360 = field363;
                                                        int var361 = field364;
                                                        method97(Statics.field1826, var360, var361);
                                                        Statics.field1826 = null;
                                                    }
                                                    field360 = 10;
                                                    class129.field2022 = 0;
                                                    Statics.field177 = null;
                                                } else if (field356 >= 5 && (class129.field2017 > field363 + 5 || class129.field2017 < field363 - 5 || class129.field2018 > field364 + 5 || class129.field2018 < field364 - 5)) {
                                                    field366 = true;
                                                }
                                            }
                                            if (class80.field1403 != -1) {
                                                int var362 = class80.field1403;
                                                int var363 = class80.field1404;
                                                field291.method2406(94);
                                                field291.method2144(5);
                                                field291.method2144(class126.field1979[82] ? (class126.field1979[81] ? 2 : 1) : 0);
                                                field291.method2291(Statics.field140 + var362);
                                                field291.method2188(Statics.field737 + var363);
                                                class80.field1403 = -1;
                                                field502 = class129.field2030;
                                                field383 = class129.field2011;
                                                field359 = 1;
                                                field358 = 0;
                                                field462 = var362;
                                                field298 = var363;
                                            }
                                            if (Statics.field1685 != var303) {
                                                if (var303 != null) {
                                                    method2750(var303);
                                                }
                                                if (Statics.field1685 != null) {
                                                    method2750(Statics.field1685);
                                                }
                                            }
                                            if (Statics.field2475 != var304 && field404 == field381) {
                                                if (var304 != null) {
                                                    method2750(var304);
                                                }
                                                if (Statics.field2475 != null) {
                                                    method2750(Statics.field2475);
                                                }
                                            }
                                            if (Statics.field2475 == null) {
                                                if (field381 > 0) {
                                                    field381--;
                                                }
                                            } else if (field381 < field404) {
                                                field381++;
                                                if (field404 == field381) {
                                                    method2750(Statics.field2475);
                                                }
                                            }
                                            int var364 = field313 + Statics.field377.field789;
                                            int var365 = field484 + Statics.field377.field754;
                                            if (Statics.field622 - var364 < -500 || Statics.field622 - var364 > 500 || Statics.field1071 - var365 < -500 || Statics.field1071 - var365 > 500) {
                                                Statics.field622 = var364;
                                                Statics.field1071 = var365;
                                            }
                                            if (Statics.field622 != var364) {
                                                Statics.field622 += (var364 - Statics.field622) / 16;
                                            }
                                            if (Statics.field1071 != var365) {
                                                Statics.field1071 += (var365 - Statics.field1071) / 16;
                                            }
                                            if (class129.field2016 == 4 && Statics.field1264) {
                                                int var366 = class129.field2018 - field474;
                                                field490 = var366 * 2;
                                                field474 = var366 == -1 || var366 == 1 ? class129.field2018 : (field474 + class129.field2018) / 2;
                                                int var367 = field337 - class129.field2017;
                                                field273 = var367 * 2;
                                                field337 = var367 == -1 || var367 == 1 ? class129.field2017 : (field337 + class129.field2017) / 2;
                                            } else {
                                                if (class126.field1979[96]) {
                                                    field273 += (-24 - field273) / 2;
                                                } else if (class126.field1979[97]) {
                                                    field273 += (24 - field273) / 2;
                                                } else {
                                                    field273 /= 2;
                                                }
                                                if (class126.field1979[98]) {
                                                    field490 += (12 - field490) / 2;
                                                } else if (class126.field1979[99]) {
                                                    field490 += (-12 - field490) / 2;
                                                } else {
                                                    field490 /= 2;
                                                }
                                                field474 = class129.field2018;
                                                field337 = class129.field2017;
                                            }
                                            field262 = field273 / 2 + field262 & 0x7FF;
                                            field339 += field490 / 2;
                                            if (field339 < 128) {
                                                field339 = 128;
                                            }
                                            if (field339 > 383) {
                                                field339 = 383;
                                            }
                                            int var368 = Statics.field622 >> 7;
                                            int var369 = Statics.field1071 >> 7;
                                            int var370 = method2088(Statics.field622, Statics.field1071, Statics.field999);
                                            int var371 = 0;
                                            if (var368 > 3 && var369 > 3 && var368 < 100 && var369 < 100) {
                                                for (int var372 = var368 - 4; var372 <= var368 + 4; var372++) {
                                                    for (int var373 = var369 - 4; var373 <= var369 + 4; var373++) {
                                                        int var374 = Statics.field999;
                                                        if (var374 < 3 && (class6.field65[1][var372][var373] & 0x2) == 2) {
                                                            var374++;
                                                        }
                                                        int var375 = var370 - class6.field76[var374][var372][var373];
                                                        if (var375 > var371) {
                                                            var371 = var375;
                                                        }
                                                    }
                                                }
                                            }
                                            int var376 = var371 * 192;
                                            if (var376 > 98048) {
                                                var376 = 98048;
                                            }
                                            if (var376 < 32768) {
                                                var376 = 32768;
                                            }
                                            if (var376 > field303) {
                                                field303 += (var376 - field303) / 24;
                                            } else if (var376 < field303) {
                                                field303 += (var376 - field303) / 80;
                                            }
                                            if (field288) {
                                                method2504();
                                            }
                                            for (int var377 = 0; var377 < 5; var377++) {
                                                int var10002 = field503[var377]++;
                                            }
                                            int var378 = ++class129.field2012 - 1;
                                            int var380 = class126.method3190();
                                            if (var378 > 15000 && var380 > 15000) {
                                                field380 = 250;
                                                class129.field2012 = 14500;
                                                field291.method2406(110);
                                            }
                                            field319++;
                                            if (field319 > 500) {
                                                field319 = 0;
                                                int var381 = (int) (Math.random() * 8.0D);
                                                if ((var381 & 0x1) == 1) {
                                                    field313 += field314;
                                                }
                                                if ((var381 & 0x2) == 2) {
                                                    field484 += field430;
                                                }
                                                if ((var381 & 0x4) == 4) {
                                                    field317 += field318;
                                                }
                                            }
                                            if (field313 < -50) {
                                                field314 = 2;
                                            }
                                            if (field313 > 50) {
                                                field314 = -2;
                                            }
                                            if (field484 < -55) {
                                                field430 = 2;
                                            }
                                            if (field484 > 55) {
                                                field430 = -2;
                                            }
                                            if (field317 < -40) {
                                                field318 = 1;
                                            }
                                            if (field317 > 40) {
                                                field318 = -1;
                                            }
                                            field373++;
                                            if (field373 > 500) {
                                                field373 = 0;
                                                int var382 = (int) (Math.random() * 8.0D);
                                                if ((var382 & 0x1) == 1) {
                                                    field478 += field321;
                                                }
                                                if ((var382 & 0x2) == 2) {
                                                    field322 += field323;
                                                }
                                            }
                                            if (field478 < -60) {
                                                field321 = 2;
                                            }
                                            if (field478 > 60) {
                                                field321 = -2;
                                            }
                                            if (field322 < -20) {
                                                field323 = 1;
                                            }
                                            if (field322 > 10) {
                                                field323 = -1;
                                            }
                                            for (class35 var383 = (class35) field507.method3235(); var383 != null; var383 = (class35) field507.method3236()) {
                                                if ((long) var383.field803 < class104.method1417() / 1000L - 5L) {
                                                    if (var383.field802 > 0) {
                                                        class10.method2441(5, "", var383.field801 + class145.field2317);
                                                    }
                                                    if (var383.field802 == 0) {
                                                        class10.method2441(5, "", var383.field801 + class145.field2318);
                                                    }
                                                    var383.method3361();
                                                }
                                            }
                                            field375++;
                                            if (field375 > 50) {
                                                field291.method2406(227);
                                            }
                                            try {
                                                if (Statics.field1522 != null && field291.field1859 > 0) {
                                                    Statics.field1522.method2634(field291.field1854, 0, field291.field1859);
                                                    field291.field1859 = 0;
                                                    field375 = 0;
                                                }
                                            } catch (IOException var385) {
                                                method1();
                                            }
                                            return;
                                        }
                                        var313 = var312.field3;
                                        if (var313.field2552 < 0) {
                                            break;
                                        }
                                        var314 = class155.method3191(var313.field2562);
                                    } while (var314 == null || var314.field2662 == null || var313.field2552 >= var314.field2662.length || var314.field2662[var313.field2552] != var313);
                                    class33.method654(var312);
                                }
                            }
                            var310 = var309.field3;
                            if (var310.field2552 < 0) {
                                break;
                            }
                            var311 = class155.method3191(var310.field2562);
                        } while (var311 == null || var311.field2662 == null || var310.field2552 >= var311.field2662.length || var311.field2662[var310.field2552] != var310);
                        class33.method654(var309);
                    }
                }
                var307 = var306.field3;
                if (var307.field2552 < 0) {
                    break;
                }
                var308 = class155.method3191(var307.field2562);
            } while (var308 == null || var308.field2662 == null || var307.field2552 >= var308.field2662.length || var308.field2662[var307.field2552] != var307);
            class33.method654(var306);
        }
    }

    @ObfuscatedName("cc.c(I)V")
    public static final void method2014() {
        if (Statics.field2009 != null) {
            Statics.field2009.method1032();
        }
        if (Statics.field514 != null) {
            Statics.field514.method1032();
        }
    }

    @ObfuscatedName("aj.z(I)V")
    public static final void method566() {
        for (int var0 = 0; var0 < field492; var0++) {
            int var10002 = field409[var0]--;
            if (field409[var0] >= -10) {
                class53 var2 = field497[var0];
                if (var2 == null) {
                    class53 var10000 = (class53) null;
                    var2 = class53.method1073(Statics.field2945, field352[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field409[var0] += var2.method1074();
                    field497[var0] = var2;
                }
                if (field409[var0] < 0) {
                    int var9;
                    if (field496[var0] == 0) {
                        var9 = field489;
                    } else {
                        int var3 = (field496[var0] & 0xFF) * 128;
                        int var4 = field496[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field377.field789;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field496[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field377.field754;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field409[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field268 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class57 var10 = var2.method1085().method1110(Statics.field198);
                        class59 var11 = class59.method1142(var10, 100, var9);
                        var11.method1174(field494[var0] - 1);
                        Statics.field491.method995(var11);
                    }
                    field409[var0] = -100;
                }
            } else {
                field492--;
                for (int var1 = var0; var1 < field492; var1++) {
                    field352[var1] = field352[var1 + 1];
                    field497[var1] = field497[var1 + 1];
                    field494[var1] = field494[var1 + 1];
                    field409[var1] = field409[var1 + 1];
                    field496[var1] = field496[var1 + 1];
                }
                var0--;
            }
        }
        if (field488 && !class164.method2936()) {
            if (field479 != 0 && field487 != -1) {
                class164.method118(Statics.field1012, field487, 0, field479, false);
            }
            field488 = false;
        }
    }

    @ObfuscatedName("t.i(Lat;IIIB)V")
    public static void method168(class39 arg0, int arg1, int arg2, int arg3) {
        if (field492 >= 50 || field268 == 0 || arg0.field912 == null || arg1 >= arg0.field912.length) {
            return;
        }
        int var4 = arg0.field912[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field352[field492] = var5;
        field494[field492] = var6;
        field409[field492] = 0;
        field497[field492] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field496[field492] = (var8 << 16) + (var9 << 8) + var7;
        field492++;
    }

    @ObfuscatedName("r.ah(IS)V")
    public static void method34(int arg0) {
        if (arg0 == -1 && !field488) {
            class164.method533();
        } else if (arg0 != -1 && field487 != arg0 && field479 != 0 && !field488) {
            class150 var1 = Statics.field1012;
            int var2 = field479;
            class164.field2732 = 1;
            Statics.field2733 = var1;
            Statics.field1015 = arg0;
            Statics.field2734 = 0;
            Statics.field2739 = var2;
            Statics.field2978 = false;
            Statics.field2731 = 2;
        }
        field487 = arg0;
    }

    @ObfuscatedName("fc.aj(B)V")
    public static final void method2941() {
        if (field257 && Statics.field999 != field357) {
            method526(Statics.field2169, Statics.field137, Statics.field999, Statics.field377.field740[0], Statics.field377.field795[0]);
        } else if (Statics.field999 != field472) {
            field472 = Statics.field999;
            method822(Statics.field999);
        }
    }

    @ObfuscatedName("gi.ar(Ljava/lang/String;S)V")
    public static final void method3595(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field184.field132 = !Statics.field184.field132;
            class9.method2715();
            if (Statics.field184.field132) {
                class10.method2441(99, "", "Roofs are now all hidden");
            } else {
                class10.method2441(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field419 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field338 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field338 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1();
            }
            if (arg0.equalsIgnoreCase("errortest") && field480 == 2) {
                throw new RuntimeException();
            }
        }
        field291.method2406(83);
        field291.method2144(arg0.length() + 1);
        field291.method2149(arg0);
    }

    @ObfuscatedName("dg.al(I)V")
    public static final void method2504() {
        int var0 = Statics.field2825 * 128 + 64;
        int var1 = Statics.field1002 * 128 + 64;
        int var2 = method2088(var0, var1, Statics.field999) - Statics.field995;
        if (Statics.field1541 < var0) {
            Statics.field1541 += Statics.field79 * (var0 - Statics.field1541) / 1000 + Statics.field926;
            if (Statics.field1541 > var0) {
                Statics.field1541 = var0;
            }
        }
        if (Statics.field1541 > var0) {
            Statics.field1541 -= Statics.field79 * (Statics.field1541 - var0) / 1000 + Statics.field926;
            if (Statics.field1541 < var0) {
                Statics.field1541 = var0;
            }
        }
        if (Statics.field2909 < var2) {
            Statics.field2909 += Statics.field79 * (var2 - Statics.field2909) / 1000 + Statics.field926;
            if (Statics.field2909 > var2) {
                Statics.field2909 = var2;
            }
        }
        if (Statics.field2909 > var2) {
            Statics.field2909 -= Statics.field79 * (Statics.field2909 - var2) / 1000 + Statics.field926;
            if (Statics.field2909 < var2) {
                Statics.field2909 = var2;
            }
        }
        if (Statics.field112 < var1) {
            Statics.field112 += Statics.field79 * (var1 - Statics.field112) / 1000 + Statics.field926;
            if (Statics.field112 > var1) {
                Statics.field112 = var1;
            }
        }
        if (Statics.field112 > var1) {
            Statics.field112 -= Statics.field79 * (Statics.field112 - var1) / 1000 + Statics.field926;
            if (Statics.field112 < var1) {
                Statics.field112 = var1;
            }
        }
        int var3 = Statics.field2062 * 128 + 64;
        int var4 = Statics.field2068 * 128 + 64;
        int var5 = method2088(var3, var4, Statics.field999) - Statics.field120;
        int var6 = var3 - Statics.field1541;
        int var7 = var5 - Statics.field2909;
        int var8 = var4 - Statics.field112;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field708 < var10) {
            Statics.field708 += Statics.field1301 * (var10 - Statics.field708) / 1000 + Statics.field709;
            if (Statics.field708 > var10) {
                Statics.field708 = var10;
            }
        }
        if (Statics.field708 > var10) {
            Statics.field708 -= Statics.field1301 * (Statics.field708 - var10) / 1000 + Statics.field709;
            if (Statics.field708 < var10) {
                Statics.field708 = var10;
            }
        }
        int var12 = var11 - Statics.field2031;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2031 += Statics.field1301 * var12 / 1000 + Statics.field709;
            Statics.field2031 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2031 -= Statics.field1301 * -var12 / 1000 + Statics.field709;
            Statics.field2031 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2031;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2031 = var11;
        }
    }

    @ObfuscatedName("d.ao(B)V")
    public static final void method487() {
        for (int var0 = 0; var0 < field289; var0++) {
            int var1 = field290[var0];
            class31 var2 = field415[var1];
            if (var2 != null) {
                method481(var2, var2.field712.field813);
            }
        }
    }

    @ObfuscatedName("j.ax(Lau;II)V")
    public static final void method481(class34 arg0, int arg1) {
        if (arg0.field785 > field372) {
            int var2 = arg0.field785 - field372;
            int var3 = arg0.field793 * 64 + arg0.field744 * 128;
            int var4 = arg0.field793 * 64 + arg0.field783 * 128;
            arg0.field789 += (var3 - arg0.field789) / var2;
            arg0.field754 += (var4 - arg0.field754) / var2;
            arg0.field784 = 0;
            if (arg0.field787 == 0) {
                arg0.field790 = 1024;
            }
            if (arg0.field787 == 1) {
                arg0.field790 = 1536;
            }
            if (arg0.field787 == 2) {
                arg0.field790 = 0;
            }
            if (arg0.field787 == 3) {
                arg0.field790 = 512;
            }
        } else if (arg0.field786 >= field372) {
            Statics.method2635(arg0);
        } else {
            method1812(arg0);
        }
        if (arg0.field789 < 128 || arg0.field754 < 128 || arg0.field789 >= 13184 || arg0.field754 >= 13184) {
            arg0.field792 = -1;
            arg0.field776 = -1;
            arg0.field785 = 0;
            arg0.field786 = 0;
            arg0.field789 = arg0.field740[0] * 128 + arg0.field793 * 64;
            arg0.field754 = arg0.field795[0] * 128 + arg0.field793 * 64;
            arg0.method627();
        }
        if (Statics.field377 == arg0 && (arg0.field789 < 1536 || arg0.field754 < 1536 || arg0.field789 >= 11776 || arg0.field754 >= 11776)) {
            arg0.field792 = -1;
            arg0.field776 = -1;
            arg0.field785 = 0;
            arg0.field786 = 0;
            arg0.field789 = arg0.field740[0] * 128 + arg0.field793 * 64;
            arg0.field754 = arg0.field795[0] * 128 + arg0.field793 * 64;
            arg0.method627();
        }
        method3375(arg0);
        method136(arg0);
    }

    @ObfuscatedName("cb.av(Lau;S)V")
    public static final void method1812(class34 arg0) {
        arg0.field778 = arg0.field745;
        if (arg0.field762 == 0) {
            arg0.field784 = 0;
            return;
        }
        if (arg0.field792 != -1 && arg0.field774 == 0) {
            class39 var1 = class39.method547(arg0.field792);
            if (arg0.field798 > 0 && var1.field927 == 0) {
                arg0.field784++;
                return;
            }
            if (arg0.field798 <= 0 && var1.field919 == 0) {
                arg0.field784++;
                return;
            }
        }
        int var2 = arg0.field789;
        int var3 = arg0.field754;
        int var4 = arg0.field740[arg0.field762 - 1] * 128 + arg0.field793 * 64;
        int var5 = arg0.field795[arg0.field762 - 1] * 128 + arg0.field793 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field789 = var4;
            arg0.field754 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field790 = 1280;
            } else if (var3 > var5) {
                arg0.field790 = 1792;
            } else {
                arg0.field790 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field790 = 768;
            } else if (var3 > var5) {
                arg0.field790 = 256;
            } else {
                arg0.field790 = 512;
            }
        } else if (var3 < var5) {
            arg0.field790 = 1024;
        } else if (var3 > var5) {
            arg0.field790 = 0;
        }
        int var6 = arg0.field790 - arg0.field768 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field797;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field748;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field794;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field750;
        }
        if (var7 == -1) {
            var7 = arg0.field748;
        }
        arg0.field778 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class31) {
            var9 = ((class31) arg0).field712.field841;
        }
        if (var9) {
            if (arg0.field790 != arg0.field768 && arg0.field765 == -1 && arg0.field788 != 0) {
                var8 = 2;
            }
            if (arg0.field762 > 2) {
                var8 = 6;
            }
            if (arg0.field762 > 3) {
                var8 = 8;
            }
            if (arg0.field784 > 0 && arg0.field762 > 1) {
                var8 = 8;
                arg0.field784--;
            }
        } else {
            if (arg0.field762 > 1) {
                var8 = 6;
            }
            if (arg0.field762 > 2) {
                var8 = 8;
            }
            if (arg0.field784 > 0 && arg0.field762 > 1) {
                var8 = 8;
                arg0.field784--;
            }
        }
        if (arg0.field796[arg0.field762 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field778 == arg0.field748 && arg0.field752 != -1) {
            arg0.field778 = arg0.field752;
        }
        if (var2 < var4) {
            arg0.field789 += var8;
            if (arg0.field789 > var4) {
                arg0.field789 = var4;
            }
        } else if (var2 > var4) {
            arg0.field789 -= var8;
            if (arg0.field789 < var4) {
                arg0.field789 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field754 += var8;
            if (arg0.field754 > var5) {
                arg0.field754 = var5;
            }
        } else if (var3 > var5) {
            arg0.field754 -= var8;
            if (arg0.field754 < var5) {
                arg0.field754 = var5;
            }
        }
        if (arg0.field789 == var4 && arg0.field754 == var5) {
            arg0.field762--;
            if (arg0.field798 > 0) {
                arg0.field798--;
            }
        }
    }

    @ObfuscatedName("gd.ae(Lau;I)V")
    public static final void method3375(class34 arg0) {
        if (arg0.field788 == 0) {
            return;
        }
        if (arg0.field765 != -1 && arg0.field765 < 32768) {
            class31 var1 = field415[arg0.field765];
            if (var1 != null) {
                int var2 = arg0.field789 - var1.field789;
                int var3 = arg0.field754 - var1.field754;
                if (var2 != 0 || var3 != 0) {
                    arg0.field790 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field765 >= 32768) {
            int var4 = arg0.field765 - 32768;
            if (field311 == var4) {
                var4 = 2047;
            }
            class3 var5 = field369[var4];
            if (var5 != null) {
                int var6 = arg0.field789 - var5.field789;
                int var7 = arg0.field754 - var5.field754;
                if (var6 != 0 || var7 != 0) {
                    arg0.field790 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field766 != 0 || arg0.field767 != 0) && (arg0.field762 == 0 || arg0.field784 > 0)) {
            int var8 = arg0.field789 - (arg0.field766 * 64 - Statics.field140 * 64 - Statics.field140 * 64);
            int var9 = arg0.field754 - (arg0.field767 * 64 - Statics.field737 * 64 - Statics.field737 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field790 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field766 = 0;
            arg0.field767 = 0;
        }
        int var10 = arg0.field790 - arg0.field768 & 0x7FF;
        if (var10 == 0) {
            arg0.field799 = 0;
            return;
        }
        arg0.field799++;
        if (var10 > 1024) {
            arg0.field768 -= arg0.field788;
            boolean var11 = true;
            if (var10 < arg0.field788 || var10 > 2048 - arg0.field788) {
                arg0.field768 = arg0.field790;
                var11 = false;
            }
            if (arg0.field778 == arg0.field745 && (arg0.field799 > 25 || var11)) {
                if (arg0.field746 == -1) {
                    arg0.field778 = arg0.field748;
                } else {
                    arg0.field778 = arg0.field746;
                }
            }
        } else {
            arg0.field768 += arg0.field788;
            boolean var12 = true;
            if (var10 < arg0.field788 || var10 > 2048 - arg0.field788) {
                arg0.field768 = arg0.field790;
                var12 = false;
            }
            if (arg0.field778 == arg0.field745 && (arg0.field799 > 25 || var12)) {
                if (arg0.field791 == -1) {
                    arg0.field778 = arg0.field748;
                } else {
                    arg0.field778 = arg0.field791;
                }
            }
        }
        arg0.field768 &= 0x7FF;
    }

    @ObfuscatedName("o.ak(Lau;I)V")
    public static final void method136(class34 arg0) {
        arg0.field743 = false;
        if (arg0.field778 != -1) {
            class39 var1 = class39.method547(arg0.field778);
            if (var1 == null || var1.field913 == null) {
                arg0.field778 = -1;
            } else {
                arg0.field782++;
                if (arg0.field769 < var1.field913.length && arg0.field782 > var1.field918[arg0.field769]) {
                    arg0.field782 = 1;
                    arg0.field769++;
                    method168(var1, arg0.field769, arg0.field789, arg0.field754);
                }
                if (arg0.field769 >= var1.field913.length) {
                    arg0.field782 = 0;
                    arg0.field769 = 0;
                    method168(var1, arg0.field769, arg0.field789, arg0.field754);
                }
            }
        }
        if (arg0.field776 != -1 && field372 >= arg0.field779) {
            if (arg0.field777 < 0) {
                arg0.field777 = 0;
            }
            int var2 = class40.method99(arg0.field776).field943;
            if (var2 == -1) {
                arg0.field776 = -1;
            } else {
                class39 var3 = class39.method547(var2);
                if (var3 == null || var3.field913 == null) {
                    arg0.field776 = -1;
                } else {
                    arg0.field763++;
                    if (arg0.field777 < var3.field913.length && arg0.field763 > var3.field918[arg0.field777]) {
                        arg0.field763 = 1;
                        arg0.field777++;
                        method168(var3, arg0.field777, arg0.field789, arg0.field754);
                    }
                    if (arg0.field777 >= var3.field913.length && (arg0.field777 < 0 || arg0.field777 >= var3.field913.length)) {
                        arg0.field776 = -1;
                    }
                }
            }
        }
        if (arg0.field792 != -1 && arg0.field774 <= 1) {
            class39 var4 = class39.method547(arg0.field792);
            if (var4.field927 == 1 && arg0.field798 > 0 && arg0.field785 <= field372 && arg0.field786 < field372) {
                arg0.field774 = 1;
                return;
            }
        }
        if (arg0.field792 != -1 && arg0.field774 == 0) {
            class39 var5 = class39.method547(arg0.field792);
            if (var5 == null || var5.field913 == null) {
                arg0.field792 = -1;
            } else {
                arg0.field773++;
                if (arg0.field759 < var5.field913.length && arg0.field773 > var5.field918[arg0.field759]) {
                    arg0.field773 = 1;
                    arg0.field759++;
                    method168(var5, arg0.field759, arg0.field789, arg0.field754);
                }
                if (arg0.field759 >= var5.field913.length) {
                    arg0.field759 -= var5.field924;
                    arg0.field775++;
                    if (arg0.field775 >= var5.field915) {
                        arg0.field792 = -1;
                    } else if (arg0.field759 >= 0 && arg0.field759 < var5.field913.length) {
                        method168(var5, arg0.field759, arg0.field789, arg0.field754);
                    } else {
                        arg0.field792 = -1;
                    }
                }
                arg0.field743 = var5.field922;
            }
        }
        if (arg0.field774 > 0) {
            arg0.field774--;
        }
    }

    @ObfuscatedName("dg.ay(Ly;IIB)V")
    public static void method2497(class3 arg0, int arg1, int arg2) {
        if (arg0.field792 == arg1 && arg1 != -1) {
            int var3 = class39.method547(arg1).field929;
            if (var3 == 1) {
                arg0.field759 = 0;
                arg0.field773 = 0;
                arg0.field774 = arg2;
                arg0.field775 = 0;
            }
            if (var3 == 2) {
                arg0.field775 = 0;
            }
        } else if (arg1 == -1 || arg0.field792 == -1 || class39.method547(arg1).field928 >= class39.method547(arg0.field792).field928) {
            arg0.field792 = arg1;
            arg0.field759 = 0;
            arg0.field773 = 0;
            arg0.field774 = arg2;
            arg0.field775 = 0;
            arg0.field798 = arg0.field762;
        }
    }

    @ObfuscatedName("ah.at(Ljava/lang/String;ZB)V")
    public static final void method558(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3019.method3461(arg0, 250);
        int var6 = Statics.field3019.method3533(arg0, 250) * 13;
        class74.method1555(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1607(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3019.method3487(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field543.getGraphics();
                Statics.field1824.method1404(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field543.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field456; var13++) {
            if (field463[var13] + field461[var13] > var9 && field461[var13] < var9 + var11 && field464[var13] + field395[var13] > var10 && field395[var13] < var10 + var12) {
                field459[var13] = true;
            }
        }
    }

    @ObfuscatedName("bt.ap(IIIIS)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3) {
        class74.method1549(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1820();
        field498++;
        method676(class30.field698);
        boolean var4 = false;
        if (field384 >= 0) {
            for (int var5 = 0; var5 < field412; var5++) {
                if (field384 == field371[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method676(class30.field699);
        }
        method641(true);
        method676(var4 ? class30.field697 : class30.field705);
        method641(false);
        method2864();
        method2434();
        if (!field288) {
            int var6 = field339;
            if (field303 / 256 > var6) {
                var6 = field303 / 256;
            }
            if (field499[4] && field501[4] + 128 > var6) {
                var6 = field501[4] + 128;
            }
            int var7 = field317 + field262 & 0x7FF;
            method2551(Statics.field622, method2088(Statics.field377.field789, Statics.field377.field754, Statics.field999) - 50, Statics.field1071, var6, var7, var6 * 3 + 600);
        }
        int var20;
        if (field288) {
            int var21;
            if (Statics.field184.field132) {
                var21 = Statics.field999;
            } else {
                int var22 = method2088(Statics.field1541, Statics.field112, Statics.field999);
                if (var22 - Statics.field2909 >= 800 || (class6.field65[Statics.field999][Statics.field1541 >> 7][Statics.field112 >> 7] & 0x4) == 0) {
                    var21 = 3;
                } else {
                    var21 = Statics.field999;
                }
            }
            var20 = var21;
        } else {
            int var8;
            if (Statics.field184.field132) {
                var8 = Statics.field999;
            } else {
                int var9 = 3;
                if (Statics.field708 < 310) {
                    int var10 = Statics.field1541 >> 7;
                    int var11 = Statics.field112 >> 7;
                    int var12 = Statics.field377.field789 >> 7;
                    int var13 = Statics.field377.field754 >> 7;
                    if ((class6.field65[Statics.field999][var10][var11] & 0x4) != 0) {
                        var9 = Statics.field999;
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
                            if ((class6.field65[Statics.field999][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field999;
                            }
                            var17 += var16;
                            if (var17 >= 65536) {
                                var17 -= 65536;
                                if (var11 < var13) {
                                    var11++;
                                } else if (var11 > var13) {
                                    var11--;
                                }
                                if ((class6.field65[Statics.field999][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field999;
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
                            if ((class6.field65[Statics.field999][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field999;
                            }
                            var19 += var18;
                            if (var19 >= 65536) {
                                var19 -= 65536;
                                if (var10 < var12) {
                                    var10++;
                                } else if (var10 > var12) {
                                    var10--;
                                }
                                if ((class6.field65[Statics.field999][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field999;
                                }
                            }
                        }
                    }
                }
                if ((class6.field65[Statics.field999][Statics.field377.field789 >> 7][Statics.field377.field754 >> 7] & 0x4) != 0) {
                    var9 = Statics.field999;
                }
                var8 = var9;
            }
            var20 = var8;
        }
        int var23 = Statics.field1541;
        int var24 = Statics.field2909;
        int var25 = Statics.field112;
        int var26 = Statics.field708;
        int var27 = Statics.field2031;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field499[var28]) {
                int var29 = (int) (Math.random() * (double) (field500[var28] * 2 + 1) - (double) field500[var28] + Math.sin((double) field422[var28] / 100.0D * (double) field503[var28]) * (double) field501[var28]);
                if (var28 == 0) {
                    Statics.field1541 += var29;
                }
                if (var28 == 1) {
                    Statics.field2909 += var29;
                }
                if (var28 == 2) {
                    Statics.field112 += var29;
                }
                if (var28 == 3) {
                    Statics.field2031 = Statics.field2031 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field708 += var29;
                    if (Statics.field708 < 128) {
                        Statics.field708 = 128;
                    }
                    if (Statics.field708 > 383) {
                        Statics.field708 = 383;
                    }
                }
            }
        }
        int var30 = class129.field2017;
        int var31 = class129.field2018;
        if (class129.field2022 != 0) {
            var30 = class129.field2030;
            var31 = class129.field2011;
        }
        if (var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            class99.field1761 = true;
            class99.field1764 = 0;
            class99.field1763 = var30 - arg0;
            class99.field1731 = var31 - arg1;
        } else {
            class99.field1761 = false;
            class99.field1764 = 0;
        }
        method2014();
        class74.method1555(arg0, arg1, arg2, arg3, 0);
        method2014();
        Statics.field736.method1689(Statics.field1541, Statics.field2909, Statics.field112, Statics.field708, Statics.field2031, var20);
        method2014();
        Statics.field736.method1713();
        method648(arg0, arg1, arg2, arg3);
        method180(arg0, arg1);
        ((class89) Statics.field1494).method1909(field316);
        if (field359 == 1) {
            Statics.field183[field358 / 100].method1470(field502 - 8, field383 - 8);
        }
        if (field359 == 2) {
            Statics.field183[field358 / 100 + 4].method1470(field502 - 8, field383 - 8);
        }
        method1818();
        if (field338) {
            int var32 = arg0 + 512 - 5;
            int var33 = arg1 + 20;
            Statics.field3019.method3493("Fps:" + field2076, var32, var33, 16776960, -1);
            int var37 = var33 + 15;
            Runtime var34 = Runtime.getRuntime();
            int var35 = (int) ((var34.totalMemory() - var34.freeMemory()) / 1024L);
            int var36 = 16776960;
            if (var35 > 32768 && field257) {
                var36 = 16711680;
            }
            if (var35 > 65536 && !field257) {
                var36 = 16711680;
            }
            Statics.field3019.method3493("Mem:" + var35 + "k", var32, var37, var36, -1);
            var33 = var37 + 15;
        }
        Statics.field1541 = var23;
        Statics.field2909 = var24;
        Statics.field112 = var25;
        Statics.field708 = var26;
        Statics.field2031 = var27;
        if (field260 && class153.method2733(true, false) == 0) {
            field260 = false;
        }
        if (field260) {
            class74.method1555(arg0, arg1, arg2, arg3, 0);
            method558(class145.field2179, false);
        }
    }

    @ObfuscatedName("ae.an(Lal;I)V")
    public static final void method676(class30 arg0) {
        if (Statics.field377.field789 >> 7 == field462 && Statics.field377.field754 >> 7 == field298) {
            field462 = 0;
        }
        int var1 = field412;
        if (class30.field698 == arg0 || class30.field699 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field698 == arg0) {
                var3 = Statics.field377;
                var4 = 33538048;
            } else if (class30.field699 == arg0) {
                var3 = field369[field384];
                var4 = field384 << 14;
            } else {
                var3 = field369[field371[var2]];
                var4 = field371[var2] << 14;
                if (class30.field697 == arg0 && field384 == field371[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method17() && !var3.field28) {
                var3.field42 = false;
                if ((field257 && field412 > 50 || field412 > 200) && class30.field698 != arg0 && var3.field778 == var3.field745) {
                    var3.field42 = true;
                }
                int var5 = var3.field789 >> 7;
                int var6 = var3.field754 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field37 == null || field372 < var3.field32 || field372 >= var3.field33) {
                        if ((var3.field789 & 0x7F) == 64 && (var3.field754 & 0x7F) == 64) {
                            if (field498 == field368[var5][var6]) {
                                continue;
                            }
                            field368[var5][var6] = field498;
                        }
                        var3.field31 = method2088(var3.field789, var3.field754, Statics.field999);
                        Statics.field736.method1664(Statics.field999, var3.field789, var3.field754, var3.field31, 60, var3, var3.field768, var4, var3.field743);
                    } else {
                        var3.field42 = false;
                        var3.field31 = method2088(var3.field789, var3.field754, Statics.field999);
                        Statics.field736.method1657(Statics.field999, var3.field789, var3.field754, var3.field31, 60, var3, var3.field768, var4, var3.field47, var3.field48, var3.field40, var3.field43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.ad(ZI)V")
    public static final void method641(boolean arg0) {
        for (int var1 = 0; var1 < field289; var1++) {
            class31 var2 = field415[field290[var1]];
            int var3 = (field290[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field712.field817 == arg0 && var2.field712.method655()) {
                int var4 = var2.field789 >> 7;
                int var5 = var2.field754 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field793 == 1 && (var2.field789 & 0x7F) == 64 && (var2.field754 & 0x7F) == 64) {
                        if (field498 == field368[var4][var5]) {
                            continue;
                        }
                        field368[var4][var5] = field498;
                    }
                    if (!var2.field712.field819) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field736.method1664(Statics.field999, var2.field789, var2.field754, method2088(var2.field789 + (var2.field793 * 64 - 64), var2.field754 + (var2.field793 * 64 - 64), Statics.field999), var2.field793 * 64 - 64 + 60, var2, var2.field768, var3, var2.field743);
                }
            }
        }
    }

    @ObfuscatedName("ea.ag(I)V")
    public static final void method2864() {
        for (class7 var0 = (class7) field387.method3285(); var0 != null; var0 = (class7) field387.method3286()) {
            if (Statics.field999 != var0.field88 || field372 > var0.field116) {
                var0.method3367();
            } else if (field372 >= var0.field93) {
                if (var0.field94 > 0) {
                    class31 var1 = field415[var0.field94 - 1];
                    if (var1 != null && var1.field789 >= 0 && var1.field789 < 13312 && var1.field754 >= 0 && var1.field754 < 13312) {
                        var0.method87(var1.field789, var1.field754, method2088(var1.field789, var1.field754, var0.field88) - var0.field92, field372);
                    }
                }
                if (var0.field94 < 0) {
                    int var2 = -var0.field94 - 1;
                    class3 var3;
                    if (field311 == var2) {
                        var3 = Statics.field377;
                    } else {
                        var3 = field369[var2];
                    }
                    if (var3 != null && var3.field789 >= 0 && var3.field789 < 13312 && var3.field754 >= 0 && var3.field754 < 13312) {
                        var0.method87(var3.field789, var3.field754, method2088(var3.field789, var3.field754, var0.field88) - var0.field92, field372);
                    }
                }
                var0.method91(field316);
                Statics.field736.method1664(Statics.field999, (int) var0.field99, (int) var0.field104, (int) var0.field97, 60, var0, var0.field111, -1, false);
            }
        }
    }

    @ObfuscatedName("dh.am(I)V")
    public static final void method2434() {
        for (class27 var0 = (class27) field388.method3285(); var0 != null; var0 = (class27) field388.method3286()) {
            if (Statics.field999 != var0.field642 || var0.field640) {
                var0.method3367();
            } else if (field372 >= var0.field632) {
                var0.method560(field316);
                if (var0.field640) {
                    var0.method3367();
                } else {
                    Statics.field736.method1664(var0.field642, var0.field633, var0.field631, var0.field636, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("u.ai(III)V")
    public static final void method180(int arg0, int arg1) {
        if (field269 == 2) {
            method2003((field272 - Statics.field140 << 7) + field275, (field486 - Statics.field737 << 7) + field276, field342 * 2);
            if (field436 > -1 && field372 % 20 < 10) {
                Statics.field215[0].method1470(field436 + arg0 - 12, field355 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ct.ab(Lau;IIIIII)V")
    public static final void method1813(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field712;
            if (var6.field837 != null) {
                var6 = var6.method657();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field412) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field28) {
                return;
            }
            if (var8.field27 != -1 || var8.field45 != -1) {
                Statics.method1922(arg0, arg0.field770 + 15);
                if (field436 > -1) {
                    if (var8.field27 != -1) {
                        Statics.field515[var8.field27].method1470(field436 + arg2 - 12, field355 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field45 != -1) {
                        Statics.field1284[var8.field45].method1470(field436 + arg2 - 12, field355 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field269 == 10 && field271 == field371[arg1]) {
                Statics.method1922(arg0, arg0.field770 + 15);
                if (field436 > -1) {
                    Statics.field215[1].method1470(field436 + arg2 - 12, field355 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field712;
            if (var9.field837 != null) {
                var9 = var9.method657();
            }
            if (var9.field832 >= 0 && var9.field832 < Statics.field1284.length) {
                Statics.method1922(arg0, arg0.field770 + 15);
                if (field436 > -1) {
                    Statics.field1284[var9.field832].method1470(field436 + arg2 - 12, field355 + arg3 - 30);
                }
            }
            if (field269 == 1 && field270 == field290[arg1 - field412] && field372 % 20 < 10) {
                Statics.method1922(arg0, arg0.field770 + 15);
                if (field436 > -1) {
                    Statics.field215[0].method1470(field436 + arg2 - 12, field355 + arg3 - 28);
                }
            }
        }
        if (arg0.field753 != null && (arg1 >= field412 || !arg0.field755 && (field407 == 4 || !arg0.field780 && (field407 == 0 || field407 == 3 || field407 == 1 && method606(((class3) arg0).field46, false))))) {
            Statics.method1922(arg0, arg0.field770);
            if (field436 > -1 && field423 < field343) {
                field347[field423] = Statics.field930.method3459(arg0.field753) / 2;
                field261[field423] = Statics.field930.field2963;
                field300[field423] = field436;
                field345[field423] = field355;
                field348[field423] = arg0.field757;
                field349[field423] = arg0.field758;
                field350[field423] = arg0.field756;
                field351[field423] = arg0.field753;
                field423++;
            }
        }
        if (arg0.field749 > field372) {
            Statics.method1922(arg0, arg0.field770 + 15);
            if (field436 > -1) {
                int var10;
                if (arg1 < field412) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field712;
                    var10 = var11.field843;
                }
                int var12 = arg0.field741 * var10 / arg0.field764;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field741 > 0) {
                    var12 = 1;
                }
                class74.method1555(field436 + arg2 - var10 / 2, field355 + arg3 - 3, var12, 5, 65280);
                class74.method1555(field436 + arg2 - var10 / 2 + var12, field355 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field761[var13] > field372) {
                Statics.method1922(arg0, arg0.field770 / 2);
                if (field436 > -1) {
                    if (var13 == 1) {
                        field355 -= 20;
                    }
                    if (var13 == 2) {
                        field436 -= 15;
                        field355 -= 10;
                    }
                    if (var13 == 3) {
                        field436 += 15;
                        field355 -= 10;
                    }
                    Statics.field2509[arg0.field760[var13]].method1470(field436 + arg2 - 12, field355 + arg3 - 12);
                    Statics.field191.method3466(Integer.toString(arg0.field771[var13]), field436 + arg2 - 1, field355 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("av.af(IIIIS)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3) {
        field423 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field412 + field289; var6++) {
            class34 var7;
            if (var6 == -1) {
                var7 = Statics.field377;
            } else if (var6 < field412) {
                var7 = field369[field371[var6]];
                if (field384 == field371[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field415[field290[var6 - field412]];
            }
            method1813(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1813(field369[field384], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field423; var8++) {
            int var9 = field300[var8];
            int var10 = field345[var8];
            int var11 = field347[var8];
            int var12 = field261[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field345[var14] - field261[var14] && var10 - var12 < field345[var14] + 2 && var9 - var11 < field347[var14] + field300[var14] && var9 + var11 > field300[var14] - field347[var14] && field345[var14] - field261[var14] < var10) {
                        var10 = field345[var14] - field261[var14];
                        var13 = true;
                    }
                }
            }
            field436 = field300[var8];
            field355 = field345[var8] = var10;
            String var15 = field351[var8];
            if (field414 == 0) {
                int var16 = 16776960;
                if (field348[var8] < 6) {
                    var16 = field304[field348[var8]];
                }
                if (field348[var8] == 6) {
                    var16 = field498 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field348[var8] == 7) {
                    var16 = field498 % 20 < 10 ? 255 : 65535;
                }
                if (field348[var8] == 8) {
                    var16 = field498 % 20 < 10 ? 45056 : 8454016;
                }
                if (field348[var8] == 9) {
                    int var17 = 150 - field350[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field348[var8] == 10) {
                    int var18 = 150 - field350[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field348[var8] == 11) {
                    int var19 = 150 - field350[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field349[var8] == 0) {
                    Statics.field930.method3466(var15, field436 + arg0, field355 + arg1, var16, 0);
                }
                if (field349[var8] == 1) {
                    Statics.field930.method3467(var15, field436 + arg0, field355 + arg1, var16, 0, field498);
                }
                if (field349[var8] == 2) {
                    Statics.field930.method3468(var15, field436 + arg0, field355 + arg1, var16, 0, field498);
                }
                if (field349[var8] == 3) {
                    Statics.field930.method3518(var15, field436 + arg0, field355 + arg1, var16, 0, field498, 150 - field350[var8]);
                }
                if (field349[var8] == 4) {
                    int var20 = (150 - field350[var8]) * (Statics.field930.method3459(var15) + 100) / 150;
                    class74.method1550(field436 + arg0 - 50, arg1, field436 + arg0 + 50, arg1 + arg3);
                    Statics.field930.method3544(var15, field436 + arg0 + 50 - var20, field355 + arg1, var16, 0);
                    class74.method1549(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field349[var8] == 5) {
                    int var21 = 150 - field350[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class74.method1550(arg0, field355 + arg1 - Statics.field930.field2963 - 1, arg0 + arg2, field355 + arg1 + 5);
                    Statics.field930.method3466(var15, field436 + arg0, field355 + arg1 + var22, var16, 0);
                    class74.method1549(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field930.method3466(var15, field436 + arg0, field355 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ck.ac(I)V")
    public static final void method1818() {
        field457 = 0;
        int var0 = (Statics.field377.field789 >> 7) + Statics.field140;
        int var1 = (Statics.field377.field754 >> 7) + Statics.field737;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field457 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field457 = 1;
        }
        if (field457 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field457 = 0;
        }
    }

    @ObfuscatedName("ce.as(IIII)V")
    public static final void method2003(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field436 = -1;
            field355 = -1;
            return;
        }
        int var3 = method2088(arg0, arg1, Statics.field999) - arg2;
        int var4 = arg0 - Statics.field1541;
        int var5 = var3 - Statics.field2909;
        int var6 = arg1 - Statics.field112;
        int var7 = class85.field1497[Statics.field708];
        int var8 = class85.field1498[Statics.field708];
        int var9 = class85.field1497[Statics.field2031];
        int var10 = class85.field1498[Statics.field2031];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field436 = (var11 << 9) / var15 + 256;
            field355 = (var14 << 9) / var15 + 167;
        } else {
            field436 = -1;
            field355 = -1;
        }
    }

    @ObfuscatedName("cd.az(IIII)I")
    public static final int method2088(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field65[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field76[var5][var3][var4] + class6.field76[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field76[var5][var3][var4 + 1] + class6.field76[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dk.aa(IIIIIII)V")
    public static final void method2551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1497[var6];
            int var12 = class85.field1498[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1497[var7];
            int var15 = class85.field1498[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1541 = arg0 - var8;
        Statics.field2909 = arg1 - var9;
        Statics.field112 = arg2 - var10;
        Statics.field708 = arg3;
        Statics.field2031 = arg4;
    }

    @ObfuscatedName("t.ba(ZI)V")
    public static final void method159(boolean arg0) {
        field310 = arg0;
        if (!field310) {
            int var1 = field293.method2339();
            int var2 = field293.method2192();
            int var3 = field293.method2192();
            int var4 = (field294 - field293.field1859) / 16;
            Statics.field1366 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1366[var5][var6] = field293.method2256();
                }
            }
            int var7 = field293.method2340();
            int var8 = field293.method2184();
            Statics.field192 = new int[var4];
            Statics.field625 = new int[var4];
            Statics.field936 = new int[var4];
            Statics.field173 = new byte[var4][];
            Statics.field2100 = new byte[var4][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field192[var10] = var13;
                        Statics.field625[var10] = Statics.field706.method2778("m" + var11 + "_" + var12);
                        Statics.field936[var10] = Statics.field706.method2778("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method526(var1, var7, var8, var2, var3);
            return;
        }
        int var14 = field293.method2340();
        int var15 = field293.method2160();
        int var16 = field293.method2192();
        int var17 = field293.method2192();
        field293.method2396();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field293.method2400(1);
                    if (var21 == 1) {
                        field278[var18][var19][var20] = field293.method2400(26);
                    } else {
                        field278[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field293.method2410();
        int var22 = (field294 - field293.field1859) / 16;
        Statics.field1366 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field1366[var23][var24] = field293.method2348();
            }
        }
        int var25 = field293.method2184();
        Statics.field192 = new int[var22];
        Statics.field625 = new int[var22];
        Statics.field936 = new int[var22];
        Statics.field173 = new byte[var22][];
        Statics.field2100 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field278[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field192[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field192[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field625[var26] = Statics.field706.method2778("m" + var35 + "_" + var36);
                            Statics.field936[var26] = Statics.field706.method2778("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method526(var16, var15, var25, var14, var17);
    }

    @ObfuscatedName("h.br(IIIIII)V")
    public static final void method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2169 == arg0 && Statics.field137 == arg1 && field357 == arg2 || !field257) {
            return;
        }
        Statics.field2169 = arg0;
        Statics.field137 = arg1;
        field357 = arg2;
        if (!field257) {
            field357 = 0;
        }
        method559(25);
        method558(class145.field2179, true);
        int var5 = Statics.field140;
        int var6 = Statics.field737;
        Statics.field140 = (arg0 - 6) * 8;
        Statics.field737 = (arg1 - 6) * 8;
        int var7 = Statics.field140 - var5;
        int var8 = Statics.field737 - var6;
        int var9 = Statics.field140;
        int var10 = Statics.field737;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field415[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field740[var13] -= var7;
                    var12.field795[var13] -= var8;
                }
                var12.field789 -= var7 * 128;
                var12.field754 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field369[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field740[var16] -= var7;
                    var15.field795[var16] -= var8;
                }
                var15.field789 -= var7 * 128;
                var15.field754 -= var8 * 128;
            }
        }
        Statics.field999 = arg2;
        Statics.field377.method623(arg3, arg4, false);
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
        for (class15 var28 = (class15) field385.method3285(); var28 != null; var28 = (class15) field385.method3286()) {
            var28.field218 -= var7;
            var28.field206 -= var8;
            if (var28.field218 < 0 || var28.field206 < 0 || var28.field218 >= 104 || var28.field206 >= 104) {
                var28.method3367();
            }
        }
        if (field462 != 0) {
            field462 -= var7;
            field298 -= var8;
        }
        field492 = 0;
        field288 = false;
        field472 = -1;
        field388.method3292();
        field387.method3292();
    }

    @ObfuscatedName("y.bp(ZI)V")
    public static final void method26(boolean arg0) {
        method2014();
        field375++;
        if (field375 < 50 && !arg0) {
            return;
        }
        field375 = 0;
        if (field344 || Statics.field1522 == null) {
            return;
        }
        field291.method2406(227);
        try {
            Statics.field1522.method2634(field291.field1854, 0, field291.field1859);
            field291.field1859 = 0;
        } catch (IOException var2) {
            field344 = true;
        }
    }

    @ObfuscatedName("an.bf(IB)V")
    public static final void method822(int arg0) {
        int[] var1 = Statics.field738.field1316;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field65[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field736.method1685(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field65[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field736.method1685(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field738.method1460();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field65[arg0][var10][var9] & 0x18) == 0) {
                    method19(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field65[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method19(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field370 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field736.method1759(Statics.field999, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = Statics.method644(var14).field876;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field512[Statics.field999].field3007;
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
                        field482[field370] = Statics.field576[var15];
                        field378[field370] = var16;
                        field481[field370] = var17;
                        field370++;
                    }
                }
            }
        }
        Statics.field1824.method1454();
    }

    @ObfuscatedName("y.bu(IIIIII)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field736.method1715(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field736.method1681(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field738.field1316;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = Statics.method644(var12);
            if (var13.field877 == -1) {
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
                class75 var14 = Statics.field979[var13.field877];
                if (var14 != null) {
                    int var15 = (var13.field849 * 4 - var14.field1332) / 2;
                    int var16 = (var13.field864 * 4 - var14.field1334) / 2;
                    var14.method1621(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field864) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field736.method1758(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field736.method1681(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = Statics.method644(var21);
            if (var22.field877 != -1) {
                class75 var23 = Statics.field979[var22.field877];
                if (var23 != null) {
                    int var24 = (var22.field849 * 4 - var23.field1332) / 2;
                    int var25 = (var22.field864 * 4 - var23.field1334) / 2;
                    var23.method1621(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field864) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field738.field1316;
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
        int var29 = Statics.field736.method1759(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = Statics.method644(var30);
        if (var31.field877 == -1) {
            return;
        }
        class75 var32 = Statics.field979[var31.field877];
        if (var32 != null) {
            int var33 = (var31.field849 * 4 - var32.field1332) / 2;
            int var34 = (var31.field864 * 4 - var32.field1334) / 2;
            var32.method1621(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field864) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("l.bo(I)V")
    public static final void method498() {
        if (field274 == 194) {
            byte var0 = field293.method2186();
            int var1 = field293.method2158();
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = field312[var2];
            int var5 = field293.method2340();
            int var6 = field293.method2339();
            int var7 = field293.method2160();
            int var8 = field293.method2339();
            int var9 = field293.method2236();
            int var10 = (var9 >> 4 & 0x7) + Statics.field577;
            int var11 = (var9 & 0x7) + Statics.field129;
            byte var12 = field293.method2163();
            byte var13 = field293.method2159();
            byte var14 = field293.method2163();
            class3 var15;
            if (field311 == var7) {
                var15 = Statics.field377;
            } else {
                var15 = field369[var7];
            }
            if (var15 != null) {
                class37 var16 = Statics.method644(var6);
                int var17;
                int var18;
                if (var3 == 1 || var3 == 3) {
                    var17 = var16.field864;
                    var18 = var16.field849;
                } else {
                    var17 = var16.field849;
                    var18 = var16.field864;
                }
                int var19 = (var17 >> 1) + var10;
                int var20 = (var17 + 1 >> 1) + var10;
                int var21 = (var18 >> 1) + var11;
                int var22 = (var18 + 1 >> 1) + var11;
                int[][] var23 = class6.field76[Statics.field999];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var10 << 7) + (var17 << 6);
                int var26 = (var11 << 7) + (var18 << 6);
                class99 var27 = var16.method682(var2, var3, var23, var25, var24, var26);
                if (var27 != null) {
                    method1382(Statics.field999, var10, var11, var4, -1, 0, 0, var5 + 1, var8 + 1);
                    var15.field32 = field372 + var5;
                    var15.field33 = field372 + var8;
                    var15.field37 = var27;
                    var15.field34 = var10 * 128 + var17 * 64;
                    var15.field36 = var11 * 128 + var18 * 64;
                    var15.field35 = var24;
                    if (var12 > var14) {
                        byte var28 = var12;
                        var12 = var14;
                        var14 = var28;
                    }
                    if (var0 > var13) {
                        byte var29 = var0;
                        var0 = var13;
                        var13 = var29;
                    }
                    var15.field47 = var10 + var12;
                    var15.field40 = var10 + var14;
                    var15.field48 = var0 + var11;
                    var15.field43 = var11 + var13;
                }
            }
        }
        if (field274 == 254) {
            int var30 = field293.method2158();
            int var31 = var30 >> 2;
            int var32 = var30 & 0x3;
            int var33 = field312[var31];
            int var34 = field293.method2236();
            int var35 = (var34 >> 4 & 0x7) + Statics.field577;
            int var36 = (var34 & 0x7) + Statics.field129;
            int var37 = field293.method2160();
            if (var35 >= 0 && var36 >= 0 && var35 < 103 && var36 < 103) {
                if (var33 == 0) {
                    class81 var38 = Statics.field736.method1673(Statics.field999, var35, var36);
                    if (var38 != null) {
                        int var39 = var38.field1437 >> 14 & 0x7FFF;
                        if (var31 == 2) {
                            var38.field1435 = new class11(var39, 2, var32 + 4, Statics.field999, var35, var36, var37, false, var38.field1435);
                            var38.field1442 = new class11(var39, 2, var32 + 1 & 0x3, Statics.field999, var35, var36, var37, false, var38.field1442);
                        } else {
                            var38.field1435 = new class11(var39, var31, var32, Statics.field999, var35, var36, var37, false, var38.field1435);
                        }
                    }
                }
                if (var33 == 1) {
                    class88 var40 = Statics.field736.method1674(Statics.field999, var35, var36);
                    if (var40 != null) {
                        int var41 = var40.field1517 >> 14 & 0x7FFF;
                        if (var31 == 4 || var31 == 5) {
                            var40.field1515 = new class11(var41, 4, var32, Statics.field999, var35, var36, var37, false, var40.field1515);
                        } else if (var31 == 6) {
                            var40.field1515 = new class11(var41, 4, var32 + 4, Statics.field999, var35, var36, var37, false, var40.field1515);
                        } else if (var31 == 7) {
                            var40.field1515 = new class11(var41, 4, (var32 + 2 & 0x3) + 4, Statics.field999, var35, var36, var37, false, var40.field1515);
                        } else if (var31 == 8) {
                            var40.field1515 = new class11(var41, 4, var32 + 4, Statics.field999, var35, var36, var37, false, var40.field1515);
                            var40.field1511 = new class11(var41, 4, (var32 + 2 & 0x3) + 4, Statics.field999, var35, var36, var37, false, var40.field1511);
                        }
                    }
                }
                if (var33 == 2) {
                    class92 var42 = Statics.field736.method1721(Statics.field999, var35, var36);
                    if (var31 == 11) {
                        var31 = 10;
                    }
                    if (var42 != null) {
                        var42.field1574 = new class11(var42.field1578 >> 14 & 0x7FFF, var31, var32, Statics.field999, var35, var36, var37, false, var42.field1574);
                    }
                }
                if (var33 == 3) {
                    class87 var43 = Statics.field736.method1676(Statics.field999, var35, var36);
                    if (var43 != null) {
                        var43.field1502 = new class11(var43.field1503 >> 14 & 0x7FFF, 22, var32, Statics.field999, var35, var36, var37, false, var43.field1502);
                    }
                }
            }
        } else if (field274 == 126) {
            int var44 = field293.method2184();
            int var45 = (var44 >> 4 & 0x7) + Statics.field577;
            int var46 = (var44 & 0x7) + Statics.field129;
            int var47 = field293.method2184();
            int var48 = var47 >> 2;
            int var49 = var47 & 0x3;
            int var50 = field312[var48];
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                method1382(Statics.field999, var45, var46, var50, -1, var48, var49, 0, -1);
            }
        } else if (field274 == 247) {
            int var51 = field293.method2340();
            int var52 = field293.method2160();
            int var53 = field293.method2184();
            int var54 = (var53 >> 4 & 0x7) + Statics.field577;
            int var55 = (var53 & 0x7) + Statics.field129;
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class26 var56 = new class26();
                var56.field626 = var51;
                var56.field620 = var52;
                if (field393[Statics.field999][var54][var55] == null) {
                    field393[Statics.field999][var54][var55] = new class180();
                }
                field393[Statics.field999][var54][var55].method3276(var56);
                method155(var54, var55);
            }
        } else if (field274 == 149) {
            int var57 = field293.method2160();
            int var58 = field293.method2236();
            int var59 = (var58 >> 4 & 0x7) + Statics.field577;
            int var60 = (var58 & 0x7) + Statics.field129;
            int var61 = field293.method2236();
            int var62 = var61 >> 2;
            int var63 = var61 & 0x3;
            int var64 = field312[var62];
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                method1382(Statics.field999, var59, var60, var64, var57, var62, var63, 0, -1);
            }
        } else if (field274 == 20) {
            int var65 = field293.method2158();
            int var66 = (var65 >> 4 & 0x7) + Statics.field577;
            int var67 = (var65 & 0x7) + Statics.field129;
            int var68 = field293.method2160();
            int var69 = field293.method2160();
            int var70 = field293.method2160();
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                class180 var71 = field393[Statics.field999][var66][var67];
                if (var71 != null) {
                    for (class26 var72 = (class26) var71.method3285(); var72 != null; var72 = (class26) var71.method3286()) {
                        if ((var68 & 0x7FFF) == var72.field626 && var72.field620 == var69) {
                            var72.field620 = var70;
                            break;
                        }
                    }
                    method155(var66, var67);
                }
            }
        } else {
            if (field274 == 222) {
                int var73 = field293.method2158();
                int var74 = (var73 >> 4 & 0x7) + Statics.field577;
                int var75 = (var73 & 0x7) + Statics.field129;
                int var76 = field293.method2160();
                int var77 = field293.method2158();
                int var78 = var77 >> 4 & 0xF;
                int var79 = var77 & 0x7;
                int var80 = field293.method2158();
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    int var81 = var78 + 1;
                    if (Statics.field377.field740[0] >= var74 - var81 && Statics.field377.field740[0] <= var74 + var81 && Statics.field377.field795[0] >= var75 - var81 && Statics.field377.field795[0] <= var75 + var81 && field268 != 0 && var79 > 0 && field492 < 50) {
                        field352[field492] = var76;
                        field494[field492] = var79;
                        field409[field492] = var80;
                        field497[field492] = null;
                        field496[field492] = (var74 << 16) + (var75 << 8) + var78;
                        field492++;
                    }
                }
            }
            if (field274 == 154) {
                int var82 = field293.method2158();
                int var83 = (var82 >> 4 & 0x7) + Statics.field577;
                int var84 = (var82 & 0x7) + Statics.field129;
                int var85 = field293.method2160();
                int var86 = field293.method2158();
                int var87 = field293.method2160();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class27 var90 = new class27(var85, Statics.field999, var88, var89, method2088(var88, var89, Statics.field999) - var86, var87, field372);
                    field388.method3276(var90);
                }
            } else if (field274 == 199) {
                int var91 = field293.method2236();
                int var92 = (var91 >> 4 & 0x7) + Statics.field577;
                int var93 = (var91 & 0x7) + Statics.field129;
                int var94 = field293.method2340();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class180 var95 = field393[Statics.field999][var92][var93];
                    if (var95 != null) {
                        for (class26 var96 = (class26) var95.method3285(); var96 != null; var96 = (class26) var95.method3286()) {
                            if ((var94 & 0x7FFF) == var96.field626) {
                                var96.method3367();
                                break;
                            }
                        }
                        if (var95.method3285() == null) {
                            field393[Statics.field999][var92][var93] = null;
                        }
                        method155(var92, var93);
                    }
                }
            } else if (field274 == 181) {
                int var97 = field293.method2158();
                int var98 = (var97 >> 4 & 0x7) + Statics.field577;
                int var99 = (var97 & 0x7) + Statics.field129;
                int var100 = var98 + field293.method2159();
                int var101 = var99 + field293.method2159();
                int var102 = field293.method2161();
                int var103 = field293.method2160();
                int var104 = field293.method2158() * 4;
                int var105 = field293.method2158() * 4;
                int var106 = field293.method2160();
                int var107 = field293.method2160();
                int var108 = field293.method2158();
                int var109 = field293.method2158();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class7 var114 = new class7(var103, Statics.field999, var110, var111, method2088(var110, var111, Statics.field999) - var104, field372 + var106, field372 + var107, var108, var109, var102, var105);
                    var114.method87(var112, var113, method2088(var112, var113, Statics.field999) - var105, field372 + var106);
                    field387.method3276(var114);
                }
            }
        }
    }

    @ObfuscatedName("bl.be(IIIIIIIIII)V")
    public static final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field385.method3285(); var10 != null; var10 = (class15) field385.method3286()) {
            if (var10.field207 == arg0 && var10.field218 == arg1 && var10.field206 == arg2 && var10.field210 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field207 = arg0;
            var9.field210 = arg3;
            var9.field218 = arg1;
            var9.field206 = arg2;
            method2935(var9);
            field385.method3276(var9);
        }
        var9.field203 = arg4;
        var9.field212 = arg5;
        var9.field211 = arg6;
        var9.field213 = arg7;
        var9.field214 = arg8;
    }

    @ObfuscatedName("ey.bx(Ls;I)V")
    public static final void method2935(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field210 == 0) {
            var1 = Statics.field736.method1715(arg0.field207, arg0.field218, arg0.field206);
        }
        if (arg0.field210 == 1) {
            var1 = Statics.field736.method1678(arg0.field207, arg0.field218, arg0.field206);
        }
        if (arg0.field210 == 2) {
            var1 = Statics.field736.method1758(arg0.field207, arg0.field218, arg0.field206);
        }
        if (arg0.field210 == 3) {
            var1 = Statics.field736.method1759(arg0.field207, arg0.field218, arg0.field206);
        }
        if (var1 != 0) {
            int var5 = Statics.field736.method1681(arg0.field207, arg0.field218, arg0.field206, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field217 = var2;
        arg0.field209 = var3;
        arg0.field208 = var4;
    }

    @ObfuscatedName("h.bh(I)V")
    public static final void method530() {
        for (class15 var0 = (class15) field385.method3285(); var0 != null; var0 = (class15) field385.method3286()) {
            if (var0.field214 > 0) {
                var0.field214--;
            }
            if (var0.field214 != 0) {
                if (var0.field213 > 0) {
                    var0.field213--;
                }
                if (var0.field213 == 0 && var0.field218 >= 1 && var0.field206 >= 1 && var0.field218 <= 102 && var0.field206 <= 102 && (var0.field203 < 0 || class6.method1418(var0.field203, var0.field212))) {
                    method113(var0.field207, var0.field210, var0.field218, var0.field206, var0.field203, var0.field211, var0.field212);
                    var0.field213 = -1;
                    if (var0.field217 == var0.field203 && var0.field217 == -1) {
                        var0.method3367();
                    } else if (var0.field217 == var0.field203 && var0.field211 == var0.field208 && var0.field212 == var0.field209) {
                        var0.method3367();
                    }
                }
            } else if (var0.field217 < 0 || class6.method1418(var0.field217, var0.field209)) {
                method113(var0.field207, var0.field210, var0.field218, var0.field206, var0.field217, var0.field208, var0.field209);
                var0.method3367();
            }
        }
    }

    @ObfuscatedName("g.bj(IIIIIIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field257 && Statics.field999 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field736.method1715(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field736.method1678(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field736.method1758(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field736.method1759(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field736.method1681(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field736.method1668(arg0, arg2, arg3);
                class37 var15 = Statics.method644(var12);
                if (var15.field863 != 0) {
                    field512[arg0].method3604(arg2, arg3, var13, var14, var15.field893);
                }
            }
            if (arg1 == 1) {
                Statics.field736.method1729(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field736.method1707(arg0, arg2, arg3);
                class37 var16 = Statics.method644(var12);
                if (var16.field849 + arg2 > 103 || var16.field849 + arg3 > 103 || var16.field864 + arg2 > 103 || var16.field864 + arg3 > 103) {
                    return;
                }
                if (var16.field863 != 0) {
                    field512[arg0].method3607(arg2, arg3, var16.field849, var16.field864, var14, var16.field893);
                }
            }
            if (arg1 == 3) {
                Statics.field736.method1671(arg0, arg2, arg3);
                class37 var17 = Statics.method644(var12);
                if (var17.field863 == 1) {
                    field512[arg0].method3614(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field65[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method512(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field736, field512[arg0]);
    }

    @ObfuscatedName("t.bm(IIB)V")
    public static final void method155(int arg0, int arg1) {
        class180 var2 = field393[Statics.field999][arg0][arg1];
        if (var2 == null) {
            Statics.field736.method1672(Statics.field999, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3285(); var6 != null; var6 = (class26) var2.method3286()) {
            class46 var7 = class46.method515(var6.field626);
            long var8 = (long) var7.field1042;
            if (var7.field1041 == 1) {
                var8 = (long) (var6.field620 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field736.method1672(Statics.field999, arg0, arg1);
            return;
        }
        var2.method3274(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3285(); var12 != null; var12 = (class26) var2.method3286()) {
            if (var5.field626 != var12.field626) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field626 != var12.field626 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field736.method1660(Statics.field999, arg0, arg1, method2088(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field999), var5, var13, var10, var11);
    }

    @ObfuscatedName("de.bz(I)V")
    public static final void method2431() {
        field354 = 0;
        field353 = 0;
        field293.method2396();
        int var0 = field293.method2400(1);
        if (var0 != 0) {
            int var1 = field293.method2400(2);
            if (var1 == 0) {
                field346[++field353 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field293.method2400(3);
                Statics.field377.method622(var2, false);
                int var3 = field293.method2400(1);
                if (var3 == 1) {
                    field346[++field353 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field293.method2400(3);
                Statics.field377.method622(var4, true);
                int var5 = field293.method2400(3);
                Statics.field377.method622(var5, true);
                int var6 = field293.method2400(1);
                if (var6 == 1) {
                    field346[++field353 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field293.method2400(7);
                int var8 = field293.method2400(1);
                if (var8 == 1) {
                    field346[++field353 - 1] = 2047;
                }
                Statics.field999 = field293.method2400(2);
                int var9 = field293.method2400(1);
                int var10 = field293.method2400(7);
                Statics.field377.method623(var10, var7, var9 == 1);
            }
        }
        method100();
        while (field293.method2402(field294) >= 11) {
            int var11 = field293.method2400(11);
            if (var11 == 2047) {
                break;
            }
            boolean var15 = false;
            if (field369[var11] == null) {
                field369[var11] = new class3();
                if (field324[var11] != null) {
                    field369[var11].method23(field324[var11]);
                }
                var15 = true;
            }
            field371[++field412 - 1] = var11;
            class3 var16 = field369[var11];
            var16.field747 = field372;
            int var17 = field293.method2400(5);
            if (var17 > 15) {
                var17 -= 32;
            }
            int var18 = field293.method2400(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field293.method2400(1);
            int var20 = field293.method2400(1);
            if (var20 == 1) {
                field346[++field353 - 1] = var11;
            }
            int var21 = field454[field293.method2400(3)];
            if (var15) {
                var16.field790 = var16.field768 = var21;
            }
            var16.method623(Statics.field377.field740[0] + var18, Statics.field377.field795[0] + var17, var19 == 1);
        }
        field293.method2410();
        method2473();
        for (int var12 = 0; var12 < field354; var12++) {
            int var13 = field258[var12];
            if (field372 != field369[var13].field747) {
                field369[var13] = null;
            }
        }
        if (field294 != field293.field1859) {
            throw new RuntimeException(field293.field1859 + class2.field15 + field294);
        }
        for (int var14 = 0; var14 < field412; var14++) {
            if (field369[field371[var14]] == null) {
                throw new RuntimeException(var14 + class2.field15 + field412);
            }
        }
    }

    @ObfuscatedName("g.bc(I)V")
    public static final void method100() {
        int var0 = field293.method2400(8);
        if (var0 < field412) {
            for (int var1 = var0; var1 < field412; var1++) {
                field258[++field354 - 1] = field371[var1];
            }
        }
        if (var0 > field412) {
            throw new RuntimeException("");
        }
        field412 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field371[var2];
            class3 var4 = field369[var3];
            int var5 = field293.method2400(1);
            if (var5 == 0) {
                field371[++field412 - 1] = var3;
                var4.field747 = field372;
            } else {
                int var6 = field293.method2400(2);
                if (var6 == 0) {
                    field371[++field412 - 1] = var3;
                    var4.field747 = field372;
                    field346[++field353 - 1] = var3;
                } else if (var6 == 1) {
                    field371[++field412 - 1] = var3;
                    var4.field747 = field372;
                    int var7 = field293.method2400(3);
                    var4.method622(var7, false);
                    int var8 = field293.method2400(1);
                    if (var8 == 1) {
                        field346[++field353 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field371[++field412 - 1] = var3;
                    var4.field747 = field372;
                    int var9 = field293.method2400(3);
                    var4.method622(var9, true);
                    int var10 = field293.method2400(3);
                    var4.method622(var10, true);
                    int var11 = field293.method2400(1);
                    if (var11 == 1) {
                        field346[++field353 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field258[++field354 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dd.bw(B)V")
    public static final void method2473() {
        for (int var0 = 0; var0 < field353; var0++) {
            int var1 = field346[var0];
            class3 var2 = field369[var1];
            int var3 = field293.method2158();
            if ((var3 & 0x1) != 0) {
                var3 += field293.method2158() << 8;
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field293.method2192();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field293.method2158();
                method2497(var2, var4, var5);
            }
            if ((var3 & 0x400) != 0) {
                var2.field776 = field293.method2160();
                int var6 = field293.method2348();
                var2.field781 = var6 >> 16;
                var2.field779 = (var6 & 0xFFFF) + field372;
                var2.field777 = 0;
                var2.field763 = 0;
                if (var2.field779 > field372) {
                    var2.field777 = -1;
                }
                if (var2.field776 == 65535) {
                    var2.field776 = -1;
                }
            }
            if ((var3 & 0x200) != 0) {
                int var7 = field293.method2339();
                int var8 = field293.method2316();
                var2.method625(var7, var8, field372);
                var2.field749 = field372 + 300;
                var2.field741 = field293.method2158();
                var2.field764 = field293.method2158();
            }
            if ((var3 & 0x10) != 0) {
                var2.field765 = field293.method2160();
                if (var2.field765 == 65535) {
                    var2.field765 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field753 = field293.method2275();
                if (var2.field753.charAt(0) == '~') {
                    var2.field753 = var2.field753.substring(1);
                    class10.method2441(2, var2.field46, var2.field753);
                } else if (Statics.field377 == var2) {
                    class10.method2441(2, var2.field46, var2.field753);
                }
                var2.field780 = false;
                var2.field757 = 0;
                var2.field758 = 0;
                var2.field756 = 150;
            }
            if ((var3 & 0x20) != 0) {
                var2.field766 = field293.method2192();
                var2.field767 = field293.method2160();
            }
            if ((var3 & 0x2) != 0) {
                int var9 = field293.method2160();
                int var10 = field293.method2184();
                var2.method625(var9, var10, field372);
                var2.field749 = field372 + 300;
                var2.field741 = field293.method2158();
                var2.field764 = field293.method2316();
            }
            if ((var3 & 0x8) != 0) {
                int var11 = field293.method2339();
                class140[] var12 = new class140[] { class140.field2132, class140.field2126, class140.field2128, class140.field2127, class140.field2129 };
                class140 var13 = (class140) class100.method2706(var12, field293.method2184());
                boolean var14 = field293.method2236() == 1;
                int var15 = field293.method2236();
                int var16 = field293.field1859;
                if (var2.field46 != null && var2.field26 != null) {
                    boolean var17 = false;
                    if (var13.field2133 && Statics.method32(var2.field46)) {
                        var17 = true;
                    }
                    if (!var17 && field457 == 0 && !var2.field28) {
                        field308.field1859 = 0;
                        field293.method2202(field308.field1854, 0, var15);
                        field308.field1859 = 0;
                        class108 var18 = field308;
                        String var22;
                        try {
                            int var19 = var18.method2171();
                            if (var19 > 32767) {
                                var19 = 32767;
                            }
                            byte[] var20 = new byte[var19];
                            var18.field1859 += Statics.field2950.method2097(var18.field1854, var18.field1859, var20, 0, var19);
                            String var21 = class213.method567(var20, 0, var19);
                            var22 = var21;
                        } catch (Exception var30) {
                            var22 = "Cabbage";
                        }
                        String var25 = class204.method3463(class211.method2017(var22));
                        var2.field753 = var25.trim();
                        var2.field757 = var11 >> 8;
                        var2.field758 = var11 & 0xFF;
                        var2.field756 = 150;
                        var2.field780 = var14;
                        var2.field755 = Statics.field377 != var2 && var13.field2133 && field469 != "" && var25.toLowerCase().indexOf(field469) == -1;
                        int var26;
                        if (var13.field2125) {
                            var26 = var14 ? 91 : 1;
                        } else {
                            var26 = var14 ? 90 : 2;
                        }
                        if (var13.field2135 == -1) {
                            class10.method2441(var26, var2.field46, var25);
                        } else {
                            class10.method2441(var26, class2.method1918(var13.field2135) + var2.field46, var25);
                        }
                    }
                }
                field293.field1859 = var15 + var16;
            }
            if ((var3 & 0x4) != 0) {
                int var27 = field293.method2316();
                byte[] var28 = new byte[var27];
                class108 var29 = new class108(var28);
                field293.method2169(var28, 0, var27);
                field324[var1] = var29;
                var2.method23(var29);
            }
            if ((var3 & 0x100) != 0) {
                var2.field744 = field293.method2158();
                var2.field783 = field293.method2158();
                var2.field751 = field293.method2184();
                var2.field742 = field293.method2236();
                var2.field785 = field293.method2160() + field372;
                var2.field786 = field293.method2192() + field372;
                var2.field787 = field293.method2236();
                var2.field762 = 1;
                var2.field798 = 0;
            }
        }
    }

    @ObfuscatedName("gd.bs(I)V")
    public static final void method3374() {
        field354 = 0;
        field353 = 0;
        method165();
        while (field293.method2402(field294) >= 27) {
            int var0 = field293.method2400(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field415[var0] == null) {
                field415[var0] = new class31();
                var16 = true;
            }
            class31 var17 = field415[var0];
            field290[++field289 - 1] = var0;
            var17.field747 = field372;
            int var18 = field454[field293.method2400(3)];
            if (var16) {
                var17.field790 = var17.field768 = var18;
            }
            int var19 = field293.method2400(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field293.method2400(1);
            int var21 = field293.method2400(1);
            if (var21 == 1) {
                field346[++field353 - 1] = var0;
            }
            var17.field712 = class36.method93(field293.method2400(14));
            int var22 = field293.method2400(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.field793 = var17.field712.field813;
            var17.field788 = var17.field712.field836;
            if (var17.field788 == 0) {
                var17.field768 = 0;
            }
            var17.field748 = var17.field712.field830;
            var17.field797 = var17.field712.field820;
            var17.field750 = var17.field712.field807;
            var17.field794 = var17.field712.field822;
            var17.field745 = var17.field712.field816;
            var17.field746 = var17.field712.field840;
            var17.field791 = var17.field712.field818;
            var17.method623(Statics.field377.field740[0] + var19, Statics.field377.field795[0] + var22, var20 == 1);
        }
        field293.method2410();
        for (int var1 = 0; var1 < field353; var1++) {
            int var2 = field346[var1];
            class31 var3 = field415[var2];
            int var4 = field293.method2158();
            if ((var4 & 0x8) != 0) {
                var3.field712 = class36.method93(field293.method2340());
                var3.field793 = var3.field712.field813;
                var3.field788 = var3.field712.field836;
                var3.field748 = var3.field712.field830;
                var3.field797 = var3.field712.field820;
                var3.field750 = var3.field712.field807;
                var3.field794 = var3.field712.field822;
                var3.field745 = var3.field712.field816;
                var3.field746 = var3.field712.field840;
                var3.field791 = var3.field712.field818;
            }
            if ((var4 & 0x80) != 0) {
                var3.field765 = field293.method2160();
                if (var3.field765 == 65535) {
                    var3.field765 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var5 = field293.method2158();
                int var6 = field293.method2158();
                var3.method625(var5, var6, field372);
                var3.field749 = field372 + 300;
                var3.field741 = field293.method2192();
                var3.field764 = field293.method2340();
            }
            if ((var4 & 0x20) != 0) {
                int var7 = field293.method2316();
                int var8 = field293.method2316();
                var3.method625(var7, var8, field372);
                var3.field749 = field372 + 300;
                var3.field741 = field293.method2192();
                var3.field764 = field293.method2340();
            }
            if ((var4 & 0x10) != 0) {
                var3.field776 = field293.method2339();
                int var9 = field293.method2348();
                var3.field781 = var9 >> 16;
                var3.field779 = (var9 & 0xFFFF) + field372;
                var3.field777 = 0;
                var3.field763 = 0;
                if (var3.field779 > field372) {
                    var3.field777 = -1;
                }
                if (var3.field776 == 65535) {
                    var3.field776 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var10 = field293.method2160();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = field293.method2184();
                if (var3.field792 == var10 && var10 != -1) {
                    int var12 = class39.method547(var10).field929;
                    if (var12 == 1) {
                        var3.field759 = 0;
                        var3.field773 = 0;
                        var3.field774 = var11;
                        var3.field775 = 0;
                    }
                    if (var12 == 2) {
                        var3.field775 = 0;
                    }
                } else if (var10 == -1 || var3.field792 == -1 || class39.method547(var10).field928 >= class39.method547(var3.field792).field928) {
                    var3.field792 = var10;
                    var3.field759 = 0;
                    var3.field773 = 0;
                    var3.field774 = var11;
                    var3.field775 = 0;
                    var3.field798 = var3.field762;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field766 = field293.method2192();
                var3.field767 = field293.method2340();
            }
            if ((var4 & 0x40) != 0) {
                var3.field753 = field293.method2275();
                var3.field756 = 100;
            }
        }
        for (int var13 = 0; var13 < field354; var13++) {
            int var14 = field258[var13];
            if (field372 != field415[var14].field747) {
                field415[var14].field712 = null;
                field415[var14] = null;
            }
        }
        if (field294 != field293.field1859) {
            throw new RuntimeException(field293.field1859 + class2.field15 + field294);
        }
        for (int var15 = 0; var15 < field289; var15++) {
            if (field415[field290[var15]] == null) {
                throw new RuntimeException(var15 + class2.field15 + field289);
            }
        }
    }

    @ObfuscatedName("t.bi(B)V")
    public static final void method165() {
        field293.method2396();
        int var0 = field293.method2400(8);
        if (var0 < field289) {
            for (int var1 = var0; var1 < field289; var1++) {
                field258[++field354 - 1] = field290[var1];
            }
        }
        if (var0 > field289) {
            throw new RuntimeException("");
        }
        field289 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field290[var2];
            class31 var4 = field415[var3];
            int var5 = field293.method2400(1);
            if (var5 == 0) {
                field290[++field289 - 1] = var3;
                var4.field747 = field372;
            } else {
                int var6 = field293.method2400(2);
                if (var6 == 0) {
                    field290[++field289 - 1] = var3;
                    var4.field747 = field372;
                    field346[++field353 - 1] = var3;
                } else if (var6 == 1) {
                    field290[++field289 - 1] = var3;
                    var4.field747 = field372;
                    int var7 = field293.method2400(3);
                    var4.method622(var7, false);
                    int var8 = field293.method2400(1);
                    if (var8 == 1) {
                        field346[++field353 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field290[++field289 - 1] = var3;
                    var4.field747 = field372;
                    int var9 = field293.method2400(3);
                    var4.method622(var9, true);
                    int var10 = field293.method2400(3);
                    var4.method622(var10, true);
                    int var11 = field293.method2400(1);
                    if (var11 == 1) {
                        field346[++field353 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field258[++field354 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("f.bd(IIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field456; var4++) {
            if (field463[var4] + field461[var4] > arg0 && field461[var4] < arg0 + arg2 && field464[var4] + field395[var4] > arg1 && field395[var4] < arg1 + arg3) {
                field506[var4] = true;
            }
        }
    }

    @ObfuscatedName("x.bq(Laj;III)V")
    public static final void method97(class28 arg0, int arg1, int arg2) {
        method1383(arg0.field651, arg0.field649, arg0.field647, arg0.field648, arg0.field646, arg0.field646, arg1, arg2);
    }

    @ObfuscatedName("bl.bk(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            field291.method2406(211);
            field291.method2147(arg1);
            class155 var8 = class155.method3191(arg1);
            if (var8.field2629 != null && var8.field2629[0][0] == 5) {
                int var9 = var8.field2629[0][1];
                if (class157.field2680[var9] != var8.field2652[0]) {
                    class157.field2680[var9] = var8.field2652[0];
                    method849(var9);
                }
            }
        }
        if (arg2 == 17) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(241);
            field291.method2257(arg3);
            field291.method2180(class126.field1979[82] ? 1 : 0);
            field291.method2145(Statics.field737 + arg1);
            field291.method2322(Statics.field933);
            field291.method2291(field408);
            field291.method2145(Statics.field140 + arg0);
        }
        if (arg2 == 46) {
            class3 var10 = field369[arg3];
            if (var10 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(170);
                field291.method2181(class126.field1979[82] ? 1 : 0);
                field291.method2188(arg3);
            }
        }
        if (arg2 == 33) {
            field291.method2406(25);
            field291.method2198(arg1);
            field291.method2257(arg3);
            field291.method2188(arg0);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 21) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(184);
            field291.method2188(Statics.field737 + arg1);
            field291.method2144(class126.field1979[82] ? 1 : 0);
            field291.method2188(Statics.field140 + arg0);
            field291.method2188(arg3);
        }
        if (arg2 == 35) {
            field291.method2406(217);
            field291.method2291(arg0);
            field291.method2197(arg1);
            field291.method2257(arg3);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 28) {
            field291.method2406(211);
            field291.method2147(arg1);
            class155 var11 = class155.method3191(arg1);
            if (var11.field2629 != null && var11.field2629[0][0] == 5) {
                int var12 = var11.field2629[0][1];
                class157.field2680[var12] = 1 - class157.field2680[var12];
                method849(var12);
            }
        }
        if (arg2 == 14) {
            class3 var13 = field369[arg3];
            if (var13 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(46);
                field291.method2291(Statics.field113);
                field291.method2179(class126.field1979[82] ? 1 : 0);
                field291.method2257(arg3);
                field291.method2197(Statics.field971);
                field291.method2257(Statics.field2767);
            }
        }
        if (arg2 == 31) {
            field291.method2406(1);
            field291.method2145(arg0);
            field291.method2291(Statics.field113);
            field291.method2257(arg3);
            field291.method2145(Statics.field2767);
            field291.method2198(arg1);
            field291.method2198(Statics.field971);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 38) {
            method114();
            class155 var14 = class155.method3191(arg1);
            field405 = 1;
            Statics.field113 = arg0;
            Statics.field971 = arg1;
            Statics.field2767 = arg3;
            method2750(var14);
            field406 = class2.method679(16748608) + class46.method515(arg3).field1030 + class2.method679(16777215);
            if (field406 == null) {
                field406 = "null";
            }
            return;
        }
        if (arg2 == 20) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(23);
            field291.method2145(Statics.field140 + arg0);
            field291.method2257(arg3);
            field291.method2145(Statics.field737 + arg1);
            field291.method2179(class126.field1979[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class155 var15 = class155.method3191(arg1);
            boolean var16 = true;
            if (var15.field2555 > 0) {
                var16 = method2862(var15);
            }
            if (var16) {
                field291.method2406(211);
                field291.method2147(arg1);
            }
        }
        if (arg2 == 44) {
            class3 var17 = field369[arg3];
            if (var17 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(58);
                field291.method2180(class126.field1979[82] ? 1 : 0);
                field291.method2145(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var18 = field369[arg3];
            if (var18 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(151);
                field291.method2291(arg3);
                field291.method2144(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field291.method2406(91);
            field291.method2145(arg0);
            field291.method2291(arg3);
            field291.method2197(arg1);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 50) {
            class3 var19 = field369[arg3];
            if (var19 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(145);
                field291.method2257(arg3);
                field291.method2179(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            class31 var20 = field415[arg3];
            if (var20 != null) {
                class36 var21 = var20.field712;
                if (var21.field837 != null) {
                    var21 = var21.method657();
                }
                if (var21 != null) {
                    field291.method2406(72);
                    field291.method2188(var21.field844);
                }
            }
        }
        if (arg2 == 34) {
            field291.method2406(149);
            field291.method2257(arg3);
            field291.method2147(arg1);
            field291.method2257(arg0);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 26) {
            method509();
        }
        if (arg2 == 8) {
            class31 var22 = field415[arg3];
            if (var22 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(27);
                field291.method2291(field408);
                field291.method2147(Statics.field933);
                field291.method2145(arg3);
                field291.method2144(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class155 var23 = class155.method611(arg1, arg0);
            if (var23 != null) {
                field291.method2406(66);
                field291.method2322(arg1);
                field291.method2257(field508);
                field291.method2198(Statics.field933);
                field291.method2145(arg0);
                field291.method2291(field408);
                field291.method2291(var23.field2658);
            }
        }
        if (arg2 == 23) {
            Statics.field736.method1688(Statics.field999, arg0, arg1);
        }
        if (arg2 == 43) {
            field291.method2406(55);
            field291.method2257(arg0);
            field291.method2188(arg3);
            field291.method2147(arg1);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 42) {
            field291.method2406(131);
            field291.method2257(arg0);
            field291.method2147(arg1);
            field291.method2291(arg3);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 39) {
            field291.method2406(235);
            field291.method2145(arg3);
            field291.method2257(arg0);
            field291.method2322(arg1);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 1004) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field291.method2406(63);
            field291.method2291(arg3);
        }
        if (arg2 == 16) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(119);
            field291.method2145(Statics.field113);
            field291.method2257(Statics.field737 + arg1);
            field291.method2257(Statics.field140 + arg0);
            field291.method2180(class126.field1979[82] ? 1 : 0);
            field291.method2197(Statics.field971);
            field291.method2291(Statics.field2767);
            field291.method2188(arg3);
        }
        if (arg2 == 25) {
            class155 var24 = class155.method611(arg1, arg0);
            if (var24 != null) {
                method114();
                int var25 = method38(var24);
                int var26 = var25 >> 11 & 0x3F;
                int var28 = var24.field2658;
                class155 var29 = class155.method611(arg1, arg0);
                if (var29 != null && var29.field2586 != null) {
                    class1 var30 = new class1();
                    var30.field3 = var29;
                    var30.field7 = var29.field2586;
                    class33.method654(var30);
                }
                field508 = var28;
                field374 = true;
                Statics.field933 = arg1;
                field408 = arg0;
                Statics.field84 = var26;
                method2750(var29);
                field405 = 0;
                field410 = method2743(var24);
                if (field410 == null) {
                    field410 = "Null";
                }
                if (var24.field2603) {
                    field302 = var24.field2612 + class2.method679(16777215);
                } else {
                    field302 = class2.method679(65280) + var24.field2654 + class2.method679(16777215);
                }
            }
            return;
        }
        if (arg2 == 3) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(78);
            field291.method2188(arg3 >> 14 & 0x7FFF);
            field291.method2188(Statics.field737 + arg1);
            field291.method2291(Statics.field140 + arg0);
            field291.method2179(class126.field1979[82] ? 1 : 0);
        }
        if (arg2 == 9) {
            class31 var31 = field415[arg3];
            if (var31 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(255);
                field291.method2291(arg3);
                field291.method2180(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(124);
            field291.method2257(Statics.field737 + arg1);
            field291.method2145(arg3 >> 14 & 0x7FFF);
            field291.method2144(class126.field1979[82] ? 1 : 0);
            field291.method2145(Statics.field140 + arg0);
        }
        if (arg2 == 37) {
            field291.method2406(35);
            field291.method2198(arg1);
            field291.method2188(arg0);
            field291.method2291(arg3);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 49) {
            class3 var32 = field369[arg3];
            if (var32 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(59);
                field291.method2291(arg3);
                field291.method2179(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field291.method2406(190);
            field291.method2257(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 10) {
            class31 var33 = field415[arg3];
            if (var33 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(135);
                field291.method2188(arg3);
                field291.method2181(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class31 var34 = field415[arg3];
            if (var34 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(186);
                field291.method2145(arg3);
                field291.method2144(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(180);
            field291.method2257(Statics.field140 + arg0);
            field291.method2180(class126.field1979[82] ? 1 : 0);
            field291.method2188(Statics.field737 + arg1);
            field291.method2188(arg3);
        }
        if (arg2 == 5) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(245);
            field291.method2257(Statics.field140 + arg0);
            field291.method2257(Statics.field737 + arg1);
            field291.method2257(arg3 >> 14 & 0x7FFF);
            field291.method2181(class126.field1979[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class155 var35 = class155.method3191(arg1);
            if (var35 == null || var35.field2657[arg0] < 100000) {
                field291.method2406(63);
                field291.method2291(arg3);
            } else {
                class10.method2441(27, "", var35.field2657[arg0] + " x " + class46.method515(arg3).field1030);
            }
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 19) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(96);
            field291.method2188(Statics.field737 + arg1);
            field291.method2188(Statics.field140 + arg0);
            field291.method2145(arg3);
            field291.method2179(class126.field1979[82] ? 1 : 0);
        }
        if (arg2 == 1) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(65);
            field291.method2181(class126.field1979[82] ? 1 : 0);
            field291.method2188(Statics.field113);
            field291.method2145(Statics.field140 + arg0);
            field291.method2198(Statics.field971);
            field291.method2291(Statics.field2767);
            field291.method2291(Statics.field737 + arg1);
            field291.method2145(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var36 = field369[arg3];
            if (var36 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(137);
                field291.method2179(class126.field1979[82] ? 1 : 0);
                field291.method2145(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var37 = field369[arg3];
            if (var37 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(29);
                field291.method2145(arg3);
                field291.method2181(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class31 var38 = field415[arg3];
            if (var38 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(237);
                field291.method2145(arg3);
                field291.method2179(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field291.method2406(153);
            field291.method2145(arg0);
            field291.method2322(arg1);
            field291.method2291(arg3);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 7) {
            class31 var39 = field415[arg3];
            if (var39 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(118);
                field291.method2198(Statics.field971);
                field291.method2188(arg3);
                field291.method2188(Statics.field113);
                field291.method2145(Statics.field2767);
                field291.method2179(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var40 = field369[arg3];
            if (var40 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(99);
                field291.method2257(arg3);
                field291.method2144(class126.field1979[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(215);
            field291.method2291(Statics.field737 + arg1);
            field291.method2179(class126.field1979[82] ? 1 : 0);
            field291.method2197(Statics.field933);
            field291.method2291(Statics.field140 + arg0);
            field291.method2291(field408);
            field291.method2145(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 15) {
            class3 var41 = field369[arg3];
            if (var41 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(160);
                field291.method2144(class126.field1979[82] ? 1 : 0);
                field291.method2291(field408);
                field291.method2291(arg3);
                field291.method2197(Statics.field933);
            }
        }
        if (arg2 == 18) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(224);
            field291.method2145(Statics.field140 + arg0);
            field291.method2291(Statics.field737 + arg1);
            field291.method2181(class126.field1979[82] ? 1 : 0);
            field291.method2188(arg3);
        }
        if (arg2 == 40) {
            field291.method2406(13);
            field291.method2257(arg3);
            field291.method2145(arg0);
            field291.method2198(arg1);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 30 && field416 == null) {
            field291.method2406(138);
            field291.method2145(arg0);
            field291.method2197(arg1);
            field416 = class155.method611(arg1, arg0);
            method2750(field416);
        }
        if (arg2 == 6) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(193);
            field291.method2188(Statics.field140 + arg0);
            field291.method2145(arg3 >> 14 & 0x7FFF);
            field291.method2291(Statics.field737 + arg1);
            field291.method2181(class126.field1979[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field291.method2406(210);
            field291.method2147(arg1);
            field291.method2145(arg3);
            field291.method2145(field408);
            field291.method2291(arg0);
            field291.method2198(Statics.field933);
            field360 = 0;
            Statics.field993 = class155.method3191(arg1);
            field361 = arg0;
        }
        if (arg2 == 12) {
            class31 var42 = field415[arg3];
            if (var42 != null) {
                field502 = arg6;
                field383 = arg7;
                field359 = 2;
                field358 = 0;
                field462 = arg0;
                field298 = arg1;
                field291.method2406(39);
                field291.method2179(class126.field1979[82] ? 1 : 0);
                field291.method2257(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var43 = class155.method611(arg1, arg0);
            if (var43 != null) {
                method2455(arg3, arg1, arg0, var43.field2658, arg5);
            }
        }
        if (arg2 == 4) {
            field502 = arg6;
            field383 = arg7;
            field359 = 2;
            field358 = 0;
            field462 = arg0;
            field298 = arg1;
            field291.method2406(233);
            field291.method2181(class126.field1979[82] ? 1 : 0);
            field291.method2188(arg3 >> 14 & 0x7FFF);
            field291.method2188(Statics.field737 + arg1);
            field291.method2257(Statics.field140 + arg0);
        }
        if (field405 != 0) {
            field405 = 0;
            method2750(class155.method3191(Statics.field971));
        }
        if (field374) {
            method114();
        }
        if (Statics.field993 != null && field360 == 0) {
            method2750(Statics.field993);
        }
    }

    @ObfuscatedName("g.bg(B)V")
    public static void method114() {
        if (!field374) {
            return;
        }
        class155 var0 = class155.method611(Statics.field933, field408);
        if (var0 != null && var0.field2631 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field7 = var0.field2631;
            class33.method654(var1);
        }
        field374 = false;
        method2750(var0);
    }

    @ObfuscatedName("dx.bv(IIIILjava/lang/String;S)V")
    public static void method2455(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class155 var5 = class155.method611(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2639 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field2 = arg0;
            var6.field10 = arg4;
            var6.field7 = var5.field2639;
            class33.method654(var6);
        }
        boolean var7 = true;
        if (var5.field2555 > 0) {
            var7 = method2862(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method38(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field291.method2406(195);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 2) {
            field291.method2406(161);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 3) {
            field291.method2406(152);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 4) {
            field291.method2406(8);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 5) {
            field291.method2406(208);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 6) {
            field291.method2406(246);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 7) {
            field291.method2406(42);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 8) {
            field291.method2406(243);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 9) {
            field291.method2406(9);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
        if (arg0 == 10) {
            field291.method2406(129);
            field291.method2147(arg1);
            field291.method2145(arg2);
            field291.method2145(arg3);
        }
    }

    @ObfuscatedName("di.by(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2459(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field379 || field394 >= 500) {
            return;
        }
        field399[field394] = arg0;
        field400[field394] = arg1;
        field397[field394] = arg2;
        field398[field394] = arg3;
        field307[field394] = arg4;
        field266[field394] = arg5;
        field394++;
    }

    @ObfuscatedName("e.bb(I)V")
    public static void method28() {
        for (int var0 = 0; var0 < field394; var0++) {
            if (Statics.method29(field397[var0])) {
                if (var0 < field394 - 1) {
                    for (int var1 = var0; var1 < field394 - 1; var1++) {
                        field399[var1] = field399[var1 + 1];
                        field400[var1] = field400[var1 + 1];
                        field397[var1] = field397[var1 + 1];
                        field398[var1] = field398[var1 + 1];
                        field307[var1] = field307[var1 + 1];
                        field266[var1] = field266[var1 + 1];
                    }
                }
                field394--;
            }
        }
    }

    @ObfuscatedName("am.cf(Lae;IIII)V")
    public static final void method871(class36 arg0, int arg1, int arg2, int arg3) {
        if (field394 >= 400) {
            return;
        }
        if (arg0.field837 != null) {
            arg0 = arg0.method657();
        }
        if (arg0 == null || !arg0.field819 || arg0.field842 && field420 != arg1) {
            return;
        }
        String var4 = arg0.field812;
        if (arg0.field829 != 0) {
            var4 = var4 + method1643(arg0.field829, Statics.field377.field25) + " " + class2.field17 + class145.field2380 + arg0.field829 + class2.field14;
        }
        if (field405 == 1) {
            method2459(class145.field2191, field406 + " " + class2.field19 + " " + class2.method679(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field374) {
            String[] var5 = arg0.field827;
            if (field483) {
                var5 = method12(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2322)) {
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
                        method2459(var5[var6], class2.method679(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2322)) {
                        short var9 = 0;
                        if (field336 == class18.field518 || field336 == class18.field519 && arg0.field829 > Statics.field377.field25) {
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
                        method2459(var5[var8], class2.method679(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2459(class145.field2364, class2.method679(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field84 & 0x2) == 2) {
            method2459(field410, field302 + " " + class2.field19 + " " + class2.method679(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ap.cb(Ly;IIIS)V")
    public static final void method798(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field377 == arg0 || field394 >= 400) {
            return;
        }
        String var4;
        if (arg0.field30 == 0) {
            var4 = arg0.field46 + method1643(arg0.field25, Statics.field377.field25) + " " + class2.field17 + class145.field2380 + arg0.field25 + class2.field14;
        } else {
            var4 = arg0.field46 + " " + class2.field17 + class145.field2195 + arg0.field30 + class2.field14;
        }
        if (field405 == 1) {
            method2459(class145.field2191, field406 + " " + class2.field19 + " " + class2.method679(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field374) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field256[var5] != null) {
                    short var6 = 0;
                    if (field256[var5].equalsIgnoreCase(class145.field2322)) {
                        if (field336 == class18.field518 || field336 == class18.field519 && arg0.field25 > Statics.field377.field25) {
                            var6 = 2000;
                        }
                        if (Statics.field377.field38 != 0 && arg0.field38 != 0) {
                            if (Statics.field377.field38 == arg0.field38) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field382[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field329[var5] + var6;
                    method2459(field256[var5], class2.method679(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field84 & 0x8) == 8) {
            method2459(field410, field302 + " " + class2.field19 + " " + class2.method679(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field394; var9++) {
            if (field397[var9] == 23) {
                field400[var9] = class2.method679(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bb.ch(III)Ljava/lang/String;")
    public static final String method1643(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method679(16711680);
        } else if (var2 < -6) {
            return class2.method679(16723968);
        } else if (var2 < -3) {
            return class2.method679(16740352);
        } else if (var2 < 0) {
            return class2.method679(16756736);
        } else if (var2 > 9) {
            return class2.method679(65280);
        } else if (var2 > 6) {
            return class2.method679(4259584);
        } else if (var2 > 3) {
            return class2.method679(8453888);
        } else if (var2 > 0) {
            return class2.method679(12648192);
        } else {
            return class2.method679(16776960);
        }
    }

    @ObfuscatedName("o.ct(IIIIIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class155.method2108(arg0)) {
            Statics.field544 = null;
            method2607(Statics.field2653[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field544 != null) {
                method2607(Statics.field544, -1412584499, arg1, arg2, arg3, arg4, Statics.field1705, Statics.field138, arg7);
                Statics.field544 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field506[var8] = true;
            }
        } else {
            field506[arg7] = true;
        }
    }

    @ObfuscatedName("ee.ck([Ley;IIIIIIIII)V")
    public static final void method2607(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1549(arg2, arg3, arg4, arg5);
        class85.method1820();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2562 == arg1 || arg1 == -1412584499 && field424 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field461[field456] = var10.field2569 + arg6;
                    field395[field456] = var10.field2554 + arg7;
                    field463[field456] = var10.field2560;
                    field464[field456] = var10.field2567;
                    var11 = ++field456 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2669 = var11;
                var10.field2670 = field372;
                if (!var10.field2603 || !method565(var10)) {
                    if (var10.field2555 > 0) {
                        int var12 = var10.field2555;
                        if (var12 == 324) {
                            if (field511 == -1) {
                                field511 = var10.field2575;
                                field287 = var10.field2576;
                            }
                            if (field411.field2689) {
                                var10.field2575 = field511;
                            } else {
                                var10.field2575 = field287;
                            }
                        } else if (var12 == 325) {
                            if (field511 == -1) {
                                field511 = var10.field2575;
                                field287 = var10.field2576;
                            }
                            if (field411.field2689) {
                                var10.field2575 = field287;
                            } else {
                                var10.field2575 = field511;
                            }
                        } else if (var12 == 327) {
                            var10.field2591 = 150;
                            var10.field2549 = (int) (Math.sin((double) field372 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2557 = 5;
                            var10.field2548 = 0;
                        } else if (var12 == 328) {
                            var10.field2591 = 150;
                            var10.field2549 = (int) (Math.sin((double) field372 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2557 = 5;
                            var10.field2548 = 1;
                        }
                    }
                    int var13 = var10.field2569 + arg6;
                    int var14 = var10.field2554 + arg7;
                    int var15 = var10.field2573;
                    if (field424 == var10) {
                        if (arg1 != -1412584499 && !var10.field2625) {
                            Statics.field544 = arg0;
                            Statics.field1705 = arg6;
                            Statics.field138 = arg7;
                            continue;
                        }
                        if (field435 && field429) {
                            int var16 = class129.field2017;
                            int var17 = class129.field2018;
                            int var18 = var16 - field426;
                            int var19 = var17 - field427;
                            if (var18 < field255) {
                                var18 = field255;
                            }
                            if (var10.field2560 + var18 > field255 + field425.field2560) {
                                var18 = field255 + field425.field2560 - var10.field2560;
                            }
                            if (var19 < field431) {
                                var19 = field431;
                            }
                            if (var10.field2567 + var19 > field431 + field425.field2567) {
                                var19 = field431 + field425.field2567 - var10.field2567;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2625) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2570 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2570 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2560 + var13;
                        int var27 = var10.field2567 + var14;
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
                        int var30 = var10.field2560 + var13;
                        int var31 = var10.field2567 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2603 || var20 < var22 && var21 < var23) {
                        if (var10.field2555 != 0) {
                            if (var10.field2555 == 1337) {
                                field401 = var13;
                                field402 = var14;
                                method1451(var13, var14, var10.field2560, var10.field2567);
                                class74.method1549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2555 == 1338) {
                                method2014();
                                class74.method1549(var13, var14, Statics.field1359.field1332 + var13, Statics.field1359.field1334 + var14);
                                if (field335 == 2 || field335 == 5) {
                                    class74.method1564(var13 + 25, var14 + 5, 0, Statics.field932, Statics.field195);
                                } else {
                                    int var32 = field478 + field262 & 0x7FF;
                                    int var33 = Statics.field377.field789 / 32 + 48;
                                    int var34 = 464 - Statics.field377.field754 / 32;
                                    Statics.field738.method1480(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field322 + 256, Statics.field932, Statics.field195);
                                    for (int var35 = 0; var35 < field370; var35++) {
                                        int var36 = field378[var35] * 4 + 2 - Statics.field377.field789 / 32;
                                        int var37 = field481[var35] * 4 + 2 - Statics.field377.field754 / 32;
                                        Statics.method1645(var13, var14, var36, var37, field482[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class180 var40 = field393[Statics.field999][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field377.field789 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field377.field754 / 32;
                                                Statics.method1645(var13, var14, var41, var42, Statics.field241[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field289; var43++) {
                                        class31 var44 = field415[field290[var43]];
                                        if (var44 != null && var44.method17()) {
                                            class36 var45 = var44.field712;
                                            if (var45 != null && var45.field837 != null) {
                                                var45 = var45.method657();
                                            }
                                            if (var45 != null && var45.field828 && var45.field819) {
                                                int var46 = var44.field789 / 32 - Statics.field377.field789 / 32;
                                                int var47 = var44.field754 / 32 - Statics.field377.field754 / 32;
                                                Statics.method1645(var13, var14, var46, var47, Statics.field241[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field412; var48++) {
                                        class3 var49 = field369[field371[var48]];
                                        if (var49 != null && var49.method17() && !var49.field28) {
                                            int var50 = var49.field789 / 32 - Statics.field377.field789 / 32;
                                            int var51 = var49.field754 / 32 - Statics.field377.field754 / 32;
                                            boolean var52 = false;
                                            if (method606(var49.field46, true)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            for (int var54 = 0; var54 < Statics.field704; var54++) {
                                                if (var49.field46.equals(Statics.field1684[var54].field575)) {
                                                    var53 = true;
                                                    break;
                                                }
                                            }
                                            boolean var55 = false;
                                            if (Statics.field377.field38 != 0 && var49.field38 != 0 && Statics.field377.field38 == var49.field38) {
                                                var55 = true;
                                            }
                                            if (var52) {
                                                Statics.method1645(var13, var14, var50, var51, Statics.field241[3]);
                                            } else if (var55) {
                                                Statics.method1645(var13, var14, var50, var51, Statics.field241[4]);
                                            } else if (var53) {
                                                Statics.method1645(var13, var14, var50, var51, Statics.field241[5]);
                                            } else {
                                                Statics.method1645(var13, var14, var50, var51, Statics.field241[2]);
                                            }
                                        }
                                    }
                                    if (field269 != 0 && field372 % 20 < 10) {
                                        if (field269 == 1 && field270 >= 0 && field270 < field415.length) {
                                            class31 var56 = field415[field270];
                                            if (var56 != null) {
                                                int var57 = var56.field789 / 32 - Statics.field377.field789 / 32;
                                                int var58 = var56.field754 / 32 - Statics.field377.field754 / 32;
                                                method1452(var13, var14, var57, var58, Statics.field1127[1]);
                                            }
                                        }
                                        if (field269 == 2) {
                                            int var59 = field272 * 4 - Statics.field140 * 4 + 2 - Statics.field377.field789 / 32;
                                            int var60 = field486 * 4 - Statics.field737 * 4 + 2 - Statics.field377.field754 / 32;
                                            method1452(var13, var14, var59, var60, Statics.field1127[1]);
                                        }
                                        if (field269 == 10 && field271 >= 0 && field271 < field369.length) {
                                            class3 var61 = field369[field271];
                                            if (var61 != null) {
                                                int var62 = var61.field789 / 32 - Statics.field377.field789 / 32;
                                                int var63 = var61.field754 / 32 - Statics.field377.field754 / 32;
                                                method1452(var13, var14, var62, var63, Statics.field1127[1]);
                                            }
                                        }
                                    }
                                    if (field462 != 0) {
                                        int var64 = field462 * 4 + 2 - Statics.field377.field789 / 32;
                                        int var65 = field298 * 4 + 2 - Statics.field377.field754 / 32;
                                        Statics.method1645(var13, var14, var64, var65, Statics.field1127[0]);
                                    }
                                    if (!Statics.field377.field28) {
                                        class74.method1555(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field335 < 3) {
                                    Statics.field326.method1480(var13, var14, 33, 33, 25, 25, field262, 256, Statics.field2499, Statics.field2768);
                                } else {
                                    class74.method1564(var13, var14, 0, Statics.field2499, Statics.field2768);
                                }
                                if (field460[var11]) {
                                    Statics.field1359.method1621(var13, var14);
                                }
                                field459[var11] = true;
                                class74.method1549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2570 == 0) {
                            if (!var10.field2603 && method565(var10) && Statics.field1685 != var10) {
                                continue;
                            }
                            if (!var10.field2603) {
                                if (var10.field2565 > var10.field2587 - var10.field2567) {
                                    var10.field2565 = var10.field2587 - var10.field2567;
                                }
                                if (var10.field2565 < 0) {
                                    var10.field2565 = 0;
                                }
                            }
                            method2607(arg0, var10.field2551, var20, var21, var22, var23, var13 - var10.field2564, var14 - var10.field2565, var11);
                            if (var10.field2662 != null) {
                                method2607(var10.field2662, var10.field2551, var20, var21, var22, var23, var13 - var10.field2564, var14 - var10.field2565, var11);
                            }
                            class4 var66 = (class4) field413.method3244((long) var10.field2551);
                            if (var66 != null) {
                                method137(var66.field54, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class74.method1549(arg2, arg3, arg4, arg5);
                            class85.method1820();
                        }
                        if (field460[var11] || field465 > 1) {
                            if (var10.field2570 == 0 && !var10.field2603 && var10.field2587 > var10.field2567) {
                                method873(var10.field2560 + var13, var14, var10.field2565, var10.field2567, var10.field2587);
                            }
                            if (var10.field2570 != 1) {
                                if (var10.field2570 == 2) {
                                    int var67 = 0;
                                    for (int var68 = 0; var68 < var10.field2567; var68++) {
                                        for (int var69 = 0; var69 < var10.field2560; var69++) {
                                            int var70 = (var10.field2605 + 32) * var69 + var13;
                                            int var71 = (var10.field2606 + 32) * var68 + var14;
                                            if (var67 < 20) {
                                                var70 += var10.field2607[var67];
                                                var71 += var10.field2608[var67];
                                            }
                                            if (var10.field2630[var67] > 0) {
                                                boolean var72 = false;
                                                boolean var73 = false;
                                                int var74 = var10.field2630[var67] - 1;
                                                if (var70 + 32 > arg2 && var70 < arg4 && var71 + 32 > arg3 && var71 < arg5 || Statics.field177 == var10 && field362 == var67) {
                                                    class73 var75;
                                                    if (field405 == 1 && Statics.field113 == var67 && Statics.field971 == var10.field2551) {
                                                        var75 = class46.method2749(var74, var10.field2657[var67], 2, 0, 2, false);
                                                    } else {
                                                        var75 = class46.method2749(var74, var10.field2657[var67], 1, 3153952, 2, false);
                                                    }
                                                    if (var75 == null) {
                                                        method2750(var10);
                                                    } else if (Statics.field177 == var10 && field362 == var67) {
                                                        int var76 = class129.field2017 - field363;
                                                        int var77 = class129.field2018 - field364;
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (field356 < 5) {
                                                            var76 = 0;
                                                            var77 = 0;
                                                        }
                                                        var75.method1476(var70 + var76, var71 + var77, 128);
                                                        if (arg1 != -1) {
                                                            class155 var78 = arg0[arg1 & 0xFFFF];
                                                            if (var71 + var77 < class74.field1327 && var78.field2565 > 0) {
                                                                int var79 = field316 * (class74.field1327 - var71 - var77) / 3;
                                                                if (var79 > field316 * 10) {
                                                                    var79 = field316 * 10;
                                                                }
                                                                if (var79 > var78.field2565) {
                                                                    var79 = var78.field2565;
                                                                }
                                                                var78.field2565 -= var79;
                                                                field364 += var79;
                                                                method2750(var78);
                                                            }
                                                            if (var71 + var77 + 32 > class74.field1328 && var78.field2565 < var78.field2587 - var78.field2567) {
                                                                int var80 = field316 * (var71 + var77 + 32 - class74.field1328) / 3;
                                                                if (var80 > field316 * 10) {
                                                                    var80 = field316 * 10;
                                                                }
                                                                if (var80 > var78.field2587 - var78.field2567 - var78.field2565) {
                                                                    var80 = var78.field2587 - var78.field2567 - var78.field2565;
                                                                }
                                                                var78.field2565 += var80;
                                                                field364 -= var80;
                                                                method2750(var78);
                                                            }
                                                        }
                                                    } else if (Statics.field993 == var10 && field361 == var67) {
                                                        var75.method1476(var70, var71, 128);
                                                    } else {
                                                        var75.method1470(var70, var71);
                                                    }
                                                }
                                            } else if (var10.field2609 != null && var67 < 20) {
                                                class73 var81 = var10.method2891(var67);
                                                if (var81 != null) {
                                                    var81.method1470(var70, var71);
                                                } else if (class155.field2544) {
                                                    method2750(var10);
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                } else if (var10.field2570 == 3) {
                                    int var82;
                                    if (method1814(var10)) {
                                        var82 = var10.field2604;
                                        if (Statics.field1685 == var10 && var10.field2571 != 0) {
                                            var82 = var10.field2571;
                                        }
                                    } else {
                                        var82 = var10.field2593;
                                        if (Statics.field1685 == var10 && var10.field2634 != 0) {
                                            var82 = var10.field2634;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2644) {
                                            class74.method1555(var13, var14, var10.field2560, var10.field2567, var82);
                                        } else {
                                            class74.method1607(var13, var14, var10.field2560, var10.field2567, var82);
                                        }
                                    } else if (var10.field2644) {
                                        class74.method1554(var13, var14, var10.field2560, var10.field2567, var82, 256 - (var15 & 0xFF));
                                    } else {
                                        class74.method1558(var13, var14, var10.field2560, var10.field2567, var82, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2570 == 4) {
                                    class205 var83 = var10.method2910();
                                    if (var83 != null) {
                                        String var84 = var10.field2599;
                                        int var85;
                                        if (method1814(var10)) {
                                            var85 = var10.field2604;
                                            if (Statics.field1685 == var10 && var10.field2571 != 0) {
                                                var85 = var10.field2571;
                                            }
                                            if (var10.field2566.length() > 0) {
                                                var84 = var10.field2566;
                                            }
                                        } else {
                                            var85 = var10.field2593;
                                            if (Statics.field1685 == var10 && var10.field2634 != 0) {
                                                var85 = var10.field2634;
                                            }
                                        }
                                        if (var10.field2603 && var10.field2658 != -1) {
                                            class46 var86 = class46.method515(var10.field2658);
                                            var84 = var86.field1030;
                                            if (var84 == null) {
                                                var84 = "null";
                                            }
                                            if ((var86.field1041 == 1 || var10.field2659 != 1) && var10.field2659 != -1) {
                                                var84 = class2.method679(16748608) + var84 + class2.field18 + " " + 'x' + method30(var10.field2659);
                                            }
                                        }
                                        if (field416 == var10) {
                                            class145 var10000 = (class145) null;
                                            var84 = class145.field2328;
                                            var85 = var10.field2593;
                                        }
                                        if (!var10.field2603) {
                                            var84 = method643(var84, var10);
                                        }
                                        var83.method3487(var84, var13, var14, var10.field2560, var10.field2567, var85, var10.field2617 ? 0 : -1, var10.field2635, var10.field2600, var10.field2601);
                                    } else if (class155.field2544) {
                                        method2750(var10);
                                    }
                                } else if (var10.field2570 == 5) {
                                    if (var10.field2603) {
                                        class73 var88;
                                        if (var10.field2658 == -1) {
                                            var88 = var10.method2897(false);
                                        } else {
                                            var88 = class46.method2749(var10.field2658, var10.field2659, var10.field2579, var10.field2580, var10.field2597, false);
                                        }
                                        if (var88 != null) {
                                            int var89 = var88.field1318;
                                            int var90 = var88.field1319;
                                            if (var10.field2578) {
                                                class74.method1550(var13, var14, var10.field2560 + var13, var10.field2567 + var14);
                                                int var91 = (var10.field2560 + (var89 - 1)) / var89;
                                                int var92 = (var10.field2567 + (var90 - 1)) / var90;
                                                for (int var93 = 0; var93 < var91; var93++) {
                                                    for (int var94 = 0; var94 < var92; var94++) {
                                                        if (var10.field2577 != 0) {
                                                            var88.method1481(var89 / 2 + var89 * var93 + var13, var90 / 2 + var90 * var94 + var14, var10.field2577, 4096);
                                                        } else if (var15 == 0) {
                                                            var88.method1470(var89 * var93 + var13, var90 * var94 + var14);
                                                        } else {
                                                            var88.method1476(var89 * var93 + var13, var90 * var94 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1549(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var95 = var10.field2560 * 4096 / var89;
                                                if (var10.field2577 != 0) {
                                                    var88.method1481(var10.field2560 / 2 + var13, var10.field2567 / 2 + var14, var10.field2577, var95);
                                                } else if (var15 != 0) {
                                                    var88.method1507(var13, var14, var10.field2560, var10.field2567, 256 - (var15 & 0xFF));
                                                } else if (var10.field2560 == var89 && var10.field2567 == var90) {
                                                    var88.method1470(var13, var14);
                                                } else {
                                                    var88.method1472(var13, var14, var10.field2560, var10.field2567);
                                                }
                                            }
                                        } else if (class155.field2544) {
                                            method2750(var10);
                                        }
                                    } else {
                                        class73 var87 = var10.method2897(method1814(var10));
                                        if (var87 != null) {
                                            var87.method1470(var13, var14);
                                        } else if (class155.field2544) {
                                            method2750(var10);
                                        }
                                    }
                                } else if (var10.field2570 == 6) {
                                    boolean var96 = method1814(var10);
                                    int var97;
                                    if (var96) {
                                        var97 = var10.field2588;
                                    } else {
                                        var97 = var10.field2547;
                                    }
                                    class99 var98 = null;
                                    int var99 = 0;
                                    if (var10.field2658 != -1) {
                                        class46 var100 = class46.method515(var10.field2658);
                                        if (var100 != null) {
                                            class46 var101 = var100.method891(var10.field2659);
                                            var98 = var101.method890(1);
                                            if (var98 == null) {
                                                method2750(var10);
                                            } else {
                                                var98.method2024();
                                                var99 = var98.field1365 / 2;
                                            }
                                        }
                                    } else if (var10.field2557 == 5) {
                                        if (var10.field2548 == 0) {
                                            var98 = field411.method2965((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var98 = Statics.field377.method16();
                                        }
                                    } else if (var97 == -1) {
                                        var98 = var10.method2900((class39) null, -1, var96, Statics.field377.field26);
                                        if (var98 == null && class155.field2544) {
                                            method2750(var10);
                                        }
                                    } else {
                                        class39 var102 = class39.method547(var97);
                                        var98 = var10.method2900(var102, var10.field2660, var96, Statics.field377.field26);
                                        if (var98 == null && class155.field2544) {
                                            method2750(var10);
                                        }
                                    }
                                    class85.method1823(var10.field2560 / 2 + var13, var10.field2567 / 2 + var14);
                                    int var103 = var10.field2594 * class85.field1497[var10.field2591] >> 16;
                                    int var104 = var10.field2594 * class85.field1498[var10.field2591] >> 16;
                                    if (var98 != null) {
                                        if (var10.field2603) {
                                            var98.method2024();
                                            if (var10.field2596) {
                                                var98.method2060(0, var10.field2549, var10.field2584, var10.field2591, var10.field2589, var10.field2602 + var99 + var103, var10.field2602 + var104, var10.field2594);
                                            } else {
                                                var98.method2025(0, var10.field2549, var10.field2584, var10.field2591, var10.field2589, var10.field2602 + var99 + var103, var10.field2602 + var104);
                                            }
                                        } else {
                                            var98.method2025(0, var10.field2549, 0, var10.field2591, 0, var103, var104);
                                        }
                                    }
                                    class85.method1822();
                                } else {
                                    if (var10.field2570 == 7) {
                                        class205 var105 = var10.method2910();
                                        if (var105 == null) {
                                            if (class155.field2544) {
                                                method2750(var10);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var10.field2567; var107++) {
                                            for (int var108 = 0; var108 < var10.field2560; var108++) {
                                                if (var10.field2630[var106] > 0) {
                                                    class46 var109 = class46.method515(var10.field2630[var106] - 1);
                                                    String var110;
                                                    if (var109.field1041 != 1 && var10.field2657[var106] == 1) {
                                                        var110 = class2.method679(16748608) + var109.field1030 + class2.field18;
                                                    } else {
                                                        var110 = class2.method679(16748608) + var109.field1030 + class2.field18 + " " + 'x' + method30(var10.field2657[var106]);
                                                    }
                                                    int var111 = (var10.field2605 + 115) * var108 + var13;
                                                    int var112 = (var10.field2606 + 12) * var107 + var14;
                                                    if (var10.field2635 == 0) {
                                                        var105.method3544(var110, var111, var112, var10.field2593, var10.field2617 ? 0 : -1);
                                                    } else if (var10.field2635 == 1) {
                                                        var105.method3466(var110, var10.field2560 / 2 + var111, var112, var10.field2593, var10.field2617 ? 0 : -1);
                                                    } else {
                                                        var105.method3493(var110, var10.field2560 + var111 - 1, var112, var10.field2593, var10.field2617 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var10.field2570 == 8 && Statics.field2475 == var10 && field404 == field381) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class205 var115 = Statics.field3019;
                                        String var116 = var10.field2599;
                                        String var117 = method643(var116, var10);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf(class2.field20);
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            int var120 = var115.method3459(var119);
                                            if (var120 > var113) {
                                                var113 = var120;
                                            }
                                            var114 += var115.field2963 + 1;
                                        }
                                        var113 += 6;
                                        var114 += 7;
                                        int var121 = var10.field2560 + var13 - 5 - var113;
                                        int var122 = var10.field2567 + var14 + 5;
                                        if (var121 < var13 + 5) {
                                            var121 = var13 + 5;
                                        }
                                        if (var113 + var121 > arg4) {
                                            var121 = arg4 - var113;
                                        }
                                        if (var114 + var122 > arg5) {
                                            var122 = arg5 - var114;
                                        }
                                        class74.method1555(var121, var122, var113, var114, 16777120);
                                        class74.method1607(var121, var122, var113, var114, 0);
                                        String var123 = var10.field2599;
                                        int var124 = var115.field2963 + var122 + 2;
                                        String var125 = method643(var123, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field20);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            var115.method3544(var127, var121 + 3, var124, 0, -1);
                                            var124 += var115.field2963 + 1;
                                        }
                                    }
                                    if (var10.field2570 == 9) {
                                        if (var10.field2574 == 1) {
                                            class74.method1563(var13, var14, var10.field2560 + var13, var10.field2567 + var14, var10.field2593);
                                        } else {
                                            int var128 = var10.field2560 >= 0 ? var10.field2560 : -var10.field2560;
                                            int var129 = var10.field2567 >= 0 ? var10.field2567 : -var10.field2567;
                                            int var130 = var128;
                                            if (var128 < var129) {
                                                var130 = var129;
                                            }
                                            if (var130 != 0) {
                                                int var131 = (var10.field2560 << 16) / var130;
                                                int var132 = (var10.field2567 << 16) / var130;
                                                if (var132 <= var131) {
                                                    var131 = -var131;
                                                } else {
                                                    var132 = -var132;
                                                }
                                                int var133 = var10.field2574 * var132 >> 17;
                                                int var134 = var10.field2574 * var132 + 1 >> 17;
                                                int var135 = var10.field2574 * var131 >> 17;
                                                int var136 = var10.field2574 * var131 + 1 >> 17;
                                                int var137 = var13 + var133;
                                                int var138 = var13 - var134;
                                                int var139 = var10.field2560 + var13 - var134;
                                                int var140 = var10.field2560 + var13 + var133;
                                                int var141 = var14 + var135;
                                                int var142 = var14 - var136;
                                                int var143 = var10.field2567 + var14 - var136;
                                                int var144 = var10.field2567 + var14 + var135;
                                                class85.method1828(var137, var138, var139);
                                                class85.method1831(var141, var142, var143, var137, var138, var139, var10.field2593);
                                                class85.method1828(var137, var139, var140);
                                                class85.method1831(var141, var143, var144, var137, var139, var140, var10.field2593);
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

    @ObfuscatedName("au.cn(Ljava/lang/String;Ley;I)Ljava/lang/String;")
    public static String method643(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method144(method2732(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1597 != null) {
                    var5 = Statics.method2104(Statics.field1597.field2095);
                    if (Statics.field1597.field2092 != null) {
                        var5 = (String) Statics.field1597.field2092;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("e.cr(II)Ljava/lang/String;")
    public static final String method30(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method679(65408) + var1.substring(0, var1.length() - 8) + class145.field2331 + " " + class2.field17 + var1 + class2.field14 + class2.field18;
        } else if (var1.length() > 6) {
            return " " + class2.method679(16777215) + var1.substring(0, var1.length() - 4) + class145.field2194 + " " + class2.field17 + var1 + class2.field14 + class2.field18;
        } else {
            return " " + class2.method679(16776960) + var1 + class2.field18;
        }
    }

    @ObfuscatedName("cs.ca(Ley;IIIIIIB)V")
    public static final void method1651(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field331) {
            field332 = 32;
        } else {
            field332 = 0;
        }
        field331 = false;
        if (class129.field2016 == 1 || !Statics.field1264 && class129.field2016 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2565 -= 4;
                method2750(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2565 += 4;
                method2750(arg0);
            } else if (arg5 >= arg1 - field332 && arg5 < field332 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2565 = (arg4 - arg3) * var8 / var9;
                method2750(arg0);
                field331 = true;
            }
        }
        if (field295 == 0) {
            return;
        }
        int var10 = arg0.field2560;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2565 += field295 * 45;
            method2750(arg0);
        }
    }

    @ObfuscatedName("am.cq(IIIIII)V")
    public static final void method873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field534[0].method1621(arg0, arg1);
        Statics.field534[1].method1621(arg0, arg1 + arg3 - 16);
        class74.method1555(arg0, arg1 + 16, 16, arg3 - 32, field327);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1555(arg0, arg1 + 16 + var6, 16, var5, field328);
        class74.method1561(arg0, arg1 + 16 + var6, var5, field330);
        class74.method1561(arg0 + 1, arg1 + 16 + var6, var5, field330);
        class74.method1559(arg0, arg1 + 16 + var6, 16, field330);
        class74.method1559(arg0, arg1 + 17 + var6, 16, field330);
        class74.method1561(arg0 + 15, arg1 + 16 + var6, var5, field341);
        class74.method1561(arg0 + 14, arg1 + 17 + var6, var5 - 1, field341);
        class74.method1559(arg0, arg1 + 15 + var6 + var5, 16, field341);
        class74.method1559(arg0 + 1, arg1 + 14 + var6 + var5, 15, field341);
    }

    @ObfuscatedName("p.cz(II)Ljava/lang/String;")
    public static final String method144(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ct.cp(Ley;I)Z")
    public static final boolean method1814(class155 arg0) {
        if (arg0.field2651 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2651.length; var1++) {
            int var2 = method2732(arg0, var1);
            int var3 = arg0.field2652[var1];
            if (arg0.field2651[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2651[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2651[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.cv(Ley;II)I")
    public static final int method2732(class155 arg0, int arg1) {
        if (arg0.field2629 == null || arg1 >= arg0.field2629.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2629[arg1];
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
                    var7 = field389[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field390[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field458[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method3191(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method515(var12).field1043 || field250)) {
                        for (int var13 = 0; var13 < var11.field2630.length; var13++) {
                            if (var12 + 1 == var11.field2630[var13]) {
                                var7 += var11.field2657[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2680[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2161[field390[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2680[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field377.field25;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2160[var14]) {
                            var7 += field390[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method3191(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method515(var18).field1043 || field250)) {
                        for (int var19 = 0; var19 < var17.field2630.length; var19++) {
                            if (var18 + 1 == var17.field2630[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field417;
                }
                if (var6 == 12) {
                    var7 = field418;
                }
                if (var6 == 13) {
                    int var20 = class157.field2680[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method33(var22);
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
                    var7 = (Statics.field377.field789 >> 7) + Statics.field140;
                }
                if (var6 == 19) {
                    var7 = (Statics.field377.field754 >> 7) + Statics.field737;
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

    @ObfuscatedName("av.cx(Ley;III)V")
    public static final void method646(class155 arg0, int arg1, int arg2) {
        if (arg0.field2664 == 1) {
            method2459(arg0.field2655, "", 24, 0, 0, arg0.field2551);
        }
        if (arg0.field2664 == 2 && !field374) {
            String var3 = method2743(arg0);
            if (var3 != null) {
                method2459(var3, class2.method679(65280) + arg0.field2654, 25, 0, -1, arg0.field2551);
            }
        }
        if (arg0.field2664 == 3) {
            method2459(class145.field2329, "", 26, 0, 0, arg0.field2551);
        }
        if (arg0.field2664 == 4) {
            method2459(arg0.field2655, "", 28, 0, 0, arg0.field2551);
        }
        if (arg0.field2664 == 5) {
            method2459(arg0.field2655, "", 29, 0, 0, arg0.field2551);
        }
        if (arg0.field2664 == 6 && field416 == null) {
            method2459(arg0.field2655, "", 30, 0, -1, arg0.field2551);
        }
        if (arg0.field2570 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2567; var5++) {
                for (int var6 = 0; var6 < arg0.field2560; var6++) {
                    int var7 = (arg0.field2605 + 32) * var6;
                    int var8 = (arg0.field2606 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2607[var4];
                        var8 += arg0.field2608[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field367 = var4;
                        Statics.field1937 = arg0;
                        if (arg0.field2630[var4] > 0) {
                            label277: {
                                class46 var9 = class46.method515(arg0.field2630[var4] - 1);
                                if (field405 == 1) {
                                    int var10 = method38(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field971 != arg0.field2551 || Statics.field113 != var4) {
                                            method2459(class145.field2191, field406 + " " + class2.field19 + " " + class2.method679(16748608) + var9.field1030, 31, var9.field1066, var4, arg0.field2551);
                                        }
                                        break label277;
                                    }
                                }
                                if (field374) {
                                    int var12 = method38(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field84 & 0x10) == 16) {
                                            method2459(field410, field302 + " " + class2.field19 + " " + class2.method679(16748608) + var9.field1030, 32, var9.field1066, var4, arg0.field2551);
                                        }
                                        break label277;
                                    }
                                }
                                String[] var14 = var9.field1069;
                                if (field483) {
                                    var14 = method12(var14);
                                }
                                if (class159.method2934(method38(arg0))) {
                                    for (int var15 = 4; var15 >= 3; var15--) {
                                        if (var14 != null && var14[var15] != null) {
                                            byte var16;
                                            if (var15 == 3) {
                                                var16 = 36;
                                            } else {
                                                var16 = 37;
                                            }
                                            method2459(var14[var15], class2.method679(16748608) + var9.field1030, var16, var9.field1066, var4, arg0.field2551);
                                        } else if (var15 == 4) {
                                            method2459(class145.field2172, class2.method679(16748608) + var9.field1030, 37, var9.field1066, var4, arg0.field2551);
                                        }
                                    }
                                }
                                int var17 = method38(arg0);
                                boolean var18 = (var17 >> 31 & 0x1) != 0;
                                if (var18) {
                                    method2459(class145.field2191, class2.method679(16748608) + var9.field1030, 38, var9.field1066, var4, arg0.field2551);
                                }
                                class159 var10000 = (class159) null;
                                if (class159.method2934(method38(arg0)) && var14 != null) {
                                    for (int var19 = 2; var19 >= 0; var19--) {
                                        if (var14[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 33;
                                            }
                                            if (var19 == 1) {
                                                var20 = 34;
                                            }
                                            if (var19 == 2) {
                                                var20 = 35;
                                            }
                                            method2459(var14[var19], class2.method679(16748608) + var9.field1030, var20, var9.field1066, var4, arg0.field2551);
                                        }
                                    }
                                }
                                String[] var21 = arg0.field2610;
                                if (field483) {
                                    var21 = method12(var21);
                                }
                                if (var21 != null) {
                                    for (int var22 = 4; var22 >= 0; var22--) {
                                        if (var21[var22] != null) {
                                            byte var23 = 0;
                                            if (var22 == 0) {
                                                var23 = 39;
                                            }
                                            if (var22 == 1) {
                                                var23 = 40;
                                            }
                                            if (var22 == 2) {
                                                var23 = 41;
                                            }
                                            if (var22 == 3) {
                                                var23 = 42;
                                            }
                                            if (var22 == 4) {
                                                var23 = 43;
                                            }
                                            method2459(var21[var22], class2.method679(16748608) + var9.field1030, var23, var9.field1066, var4, arg0.field2551);
                                        }
                                    }
                                }
                                method2459(class145.field2364, class2.method679(16748608) + var9.field1030, 1005, var9.field1066, var4, arg0.field2551);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2603) {
            return;
        }
        if (!field374) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var25 = method13(arg0, var24);
                if (var25 != null) {
                    method2459(var25, arg0.field2612, 1007, var24 + 1, arg0.field2552, arg0.field2551);
                }
            }
            String var26 = method2743(arg0);
            if (var26 != null) {
                method2459(var26, arg0.field2612, 25, 0, arg0.field2552, arg0.field2551);
            }
            for (int var27 = 4; var27 >= 0; var27--) {
                String var28 = method13(arg0, var27);
                if (var28 != null) {
                    method2459(var28, arg0.field2612, 57, var27 + 1, arg0.field2552, arg0.field2551);
                }
            }
            int var29 = method38(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                method2459(class145.field2176, "", 30, 0, arg0.field2552, arg0.field2551);
            }
        } else if (class159.method117(method38(arg0)) && (Statics.field84 & 0x20) == 32) {
            method2459(field410, field302 + " " + class2.field19 + " " + arg0.field2612, 58, 0, arg0.field2552, arg0.field2551);
        }
    }

    @ObfuscatedName("ax.cg(IIIIIIII)V")
    public static final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class155.method2108(arg0)) {
            method127(Statics.field2653[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("o.cy([Ley;IIIIIIII)V")
    public static final void method127(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2603 || var9.field2570 == 0 || var9.field2619 || method38(var9) != 0 || field425 == var9) && var9.field2562 == arg1 && (!var9.field2603 || !method565(var9))) {
                int var10 = var9.field2569 + arg6;
                int var11 = var9.field2554 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2570 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2570 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2560 + var10;
                    int var19 = var9.field2567 + var11;
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
                    int var22 = var9.field2560 + var10;
                    int var23 = var9.field2567 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field424 == var9) {
                    field432 = true;
                    field433 = var10;
                    field434 = var11;
                }
                if (!var9.field2603 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field2017;
                    int var25 = class129.field2018;
                    if (class129.field2022 != 0) {
                        var24 = class129.field2030;
                        var25 = class129.field2011;
                    }
                    if (var9.field2555 == 1337) {
                        method2750(var9);
                        if (!field260 && !field379 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field405 == 0 && !field374) {
                                method2459(class145.field2204, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class99.field1764; var28++) {
                                int var29 = class99.field1765[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field736.method1681(Statics.field999, var30, var31, var29) >= 0) {
                                        class37 var34 = Statics.method644(var33);
                                        if (var34.field889 != null) {
                                            var34 = var34.method689();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field405 == 1) {
                                            method2459(class145.field2191, field406 + " " + class2.field19 + " " + class2.method679(65535) + var34.field858, 1, var29, var30, var31);
                                        } else if (!field374) {
                                            String[] var35 = var34.field875;
                                            if (field483) {
                                                var35 = method12(var35);
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
                                                        method2459(var35[var36], class2.method679(65535) + var34.field858, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2459(class145.field2364, class2.method679(65535) + var34.field858, 1002, var34.field896 << 14, var30, var31);
                                        } else if ((Statics.field84 & 0x4) == 4) {
                                            method2459(field410, field302 + " " + class2.field19 + " " + class2.method679(65535) + var34.field858, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class31 var38 = field415[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field712.field813 == 1 && (var38.field789 & 0x7F) == 64 && (var38.field754 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field289; var39++) {
                                                class31 var40 = field415[field290[var39]];
                                                if (var40 != null && var38 != var40 && var40.field712.field813 == 1 && var38.field789 == var40.field789 && var38.field754 == var40.field754) {
                                                    method871(var40.field712, field290[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field412; var41++) {
                                                class3 var42 = field369[field371[var41]];
                                                if (var42 != null && var38.field789 == var42.field789 && var38.field754 == var42.field754) {
                                                    method798(var42, field371[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method871(var38.field712, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field369[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field789 & 0x7F) == 64 && (var43.field754 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field289; var44++) {
                                                class31 var45 = field415[field290[var44]];
                                                if (var45 != null && var45.field712.field813 == 1 && var43.field789 == var45.field789 && var43.field754 == var45.field754) {
                                                    method871(var45.field712, field290[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field412; var46++) {
                                                class3 var47 = field369[field371[var46]];
                                                if (var47 != null && var43 != var47 && var43.field789 == var47.field789 && var43.field754 == var47.field754) {
                                                    method798(var47, field371[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field384 == var33) {
                                            var26 = var29;
                                        } else {
                                            method798(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class180 var48 = field393[Statics.field999][var30][var31];
                                        if (var48 != null) {
                                            for (class26 var49 = (class26) var48.method3282(); var49 != null; var49 = (class26) var48.method3279()) {
                                                class46 var50 = class46.method515(var49.field626);
                                                if (field405 == 1) {
                                                    method2459(class145.field2191, field406 + " " + class2.field19 + " " + class2.method679(16748608) + var50.field1030, 16, var49.field626, var30, var31);
                                                } else if (!field374) {
                                                    String[] var51 = var50.field1024;
                                                    if (field483) {
                                                        var51 = method12(var51);
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
                                                            method2459(var51[var52], class2.method679(16748608) + var50.field1030, var53, var49.field626, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method2459(class145.field2171, class2.method679(16748608) + var50.field1030, 20, var49.field626, var30, var31);
                                                        }
                                                    }
                                                    method2459(class145.field2364, class2.method679(16748608) + var50.field1030, 1004, var49.field626, var30, var31);
                                                } else if ((Statics.field84 & 0x1) == 1) {
                                                    method2459(field410, field302 + " " + class2.field19 + " " + class2.method679(16748608) + var50.field1030, 17, var49.field626, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field369[field384];
                                method798(var56, field384, var54, var55);
                            }
                        }
                    } else if (var9.field2555 != 1338) {
                        if (!field379 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method646(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2570 == 0) {
                            if (!var9.field2603 && method565(var9) && Statics.field1685 != var9) {
                                continue;
                            }
                            method127(arg0, var9.field2551, var12, var13, var14, var15, var10 - var9.field2564, var11 - var9.field2565);
                            if (var9.field2662 != null) {
                                method127(var9.field2662, var9.field2551, var12, var13, var14, var15, var10 - var9.field2564, var11 - var9.field2565);
                            }
                            class4 var68 = (class4) field413.method3244((long) var9.field2551);
                            if (var68 != null) {
                                if (var68.field51 == 0 && class129.field2017 >= var12 && class129.field2018 >= var13 && class129.field2017 < var14 && class129.field2018 < var15 && !field379 && !field320) {
                                    field399[0] = class145.field2406;
                                    field400[0] = "";
                                    field397[0] = 1006;
                                    field394 = 1;
                                }
                                int var69 = var68.field54;
                                if (class155.method2108(var69)) {
                                    method127(Statics.field2653[var69], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2603) {
                            if (var9.field2643 && class129.field2017 >= var12 && class129.field2018 >= var13 && class129.field2017 < var14 && class129.field2018 < var15) {
                                for (class1 var70 = (class1) field452.method3285(); var70 != null; var70 = (class1) field452.method3286()) {
                                    if (var70.field1) {
                                        var70.method3367();
                                        var70.field3.field2663 = false;
                                    }
                                }
                                if (Statics.field182 == 0) {
                                    field424 = null;
                                    field425 = null;
                                }
                                if (!field379) {
                                    field399[0] = class145.field2406;
                                    field400[0] = "";
                                    field397[0] = 1006;
                                    field394 = 1;
                                }
                            }
                            boolean var71;
                            if (class129.field2017 >= var12 && class129.field2018 >= var13 && class129.field2017 < var14 && class129.field2018 < var15) {
                                var71 = true;
                            } else {
                                var71 = false;
                            }
                            boolean var72 = false;
                            if ((class129.field2016 == 1 || !Statics.field1264 && class129.field2016 == 4) && var71) {
                                var72 = true;
                            }
                            boolean var73 = false;
                            if ((class129.field2022 == 1 || !Statics.field1264 && class129.field2022 == 4) && class129.field2030 >= var12 && class129.field2011 >= var13 && class129.field2030 < var14 && class129.field2011 < var15) {
                                var73 = true;
                            }
                            if (var73) {
                                method619(var9, class129.field2030 - var10, class129.field2011 - var11);
                            }
                            if (field424 != null && field424 != var9 && var71 && class159.method2626(method38(var9))) {
                                field428 = var9;
                            }
                            if (field425 == var9) {
                                field429 = true;
                                field255 = var10;
                                field431 = var11;
                            }
                            if (var9.field2619) {
                                if (var71 && field295 != 0 && var9.field2640 != null) {
                                    class1 var74 = new class1();
                                    var74.field1 = true;
                                    var74.field3 = var9;
                                    var74.field5 = field295;
                                    var74.field7 = var9.field2640;
                                    field452.method3276(var74);
                                }
                                if (field424 != null || Statics.field177 != null || field379) {
                                    var73 = false;
                                    var72 = false;
                                    var71 = false;
                                }
                                if (!var9.field2622 && var73) {
                                    var9.field2622 = true;
                                    if (var9.field2621 != null) {
                                        class1 var75 = new class1();
                                        var75.field1 = true;
                                        var75.field3 = var9;
                                        var75.field6 = class129.field2030 - var10;
                                        var75.field5 = class129.field2011 - var11;
                                        var75.field7 = var9.field2621;
                                        field452.method3276(var75);
                                    }
                                }
                                if (var9.field2622 && var72 && var9.field2632 != null) {
                                    class1 var76 = new class1();
                                    var76.field1 = true;
                                    var76.field3 = var9;
                                    var76.field6 = class129.field2017 - var10;
                                    var76.field5 = class129.field2018 - var11;
                                    var76.field7 = var9.field2632;
                                    field452.method3276(var76);
                                }
                                if (var9.field2622 && !var72) {
                                    var9.field2622 = false;
                                    if (var9.field2623 != null) {
                                        class1 var77 = new class1();
                                        var77.field1 = true;
                                        var77.field3 = var9;
                                        var77.field6 = class129.field2017 - var10;
                                        var77.field5 = class129.field2018 - var11;
                                        var77.field7 = var9.field2623;
                                        field297.method3276(var77);
                                    }
                                }
                                if (var72 && var9.field2624 != null) {
                                    class1 var78 = new class1();
                                    var78.field1 = true;
                                    var78.field3 = var9;
                                    var78.field6 = class129.field2017 - var10;
                                    var78.field5 = class129.field2018 - var11;
                                    var78.field7 = var9.field2624;
                                    field452.method3276(var78);
                                }
                                if (!var9.field2663 && var71) {
                                    var9.field2663 = true;
                                    if (var9.field2556 != null) {
                                        class1 var79 = new class1();
                                        var79.field1 = true;
                                        var79.field3 = var9;
                                        var79.field6 = class129.field2017 - var10;
                                        var79.field5 = class129.field2018 - var11;
                                        var79.field7 = var9.field2556;
                                        field452.method3276(var79);
                                    }
                                }
                                if (var9.field2663 && var71 && var9.field2626 != null) {
                                    class1 var80 = new class1();
                                    var80.field1 = true;
                                    var80.field3 = var9;
                                    var80.field6 = class129.field2017 - var10;
                                    var80.field5 = class129.field2018 - var11;
                                    var80.field7 = var9.field2626;
                                    field452.method3276(var80);
                                }
                                if (var9.field2663 && !var71) {
                                    var9.field2663 = false;
                                    if (var9.field2638 != null) {
                                        class1 var81 = new class1();
                                        var81.field1 = true;
                                        var81.field3 = var9;
                                        var81.field6 = class129.field2017 - var10;
                                        var81.field5 = class129.field2018 - var11;
                                        var81.field7 = var9.field2638;
                                        field297.method3276(var81);
                                    }
                                }
                                if (var9.field2542 != null) {
                                    class1 var82 = new class1();
                                    var82.field3 = var9;
                                    var82.field7 = var9.field2542;
                                    field453.method3276(var82);
                                }
                                if (var9.field2650 != null && field438 > var9.field2666) {
                                    if (var9.field2633 == null || field438 - var9.field2666 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field7 = var9.field2650;
                                        field452.method3276(var87);
                                    } else {
                                        label796: for (int var83 = var9.field2666; var83 < field438; var83++) {
                                            int var84 = field437[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2633.length; var85++) {
                                                if (var9.field2633[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field7 = var9.field2650;
                                                    field452.method3276(var86);
                                                    break label796;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2666 = field438;
                                }
                                if (var9.field2582 != null && field440 > var9.field2667) {
                                    if (var9.field2671 == null || field440 - var9.field2667 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field7 = var9.field2582;
                                        field452.method3276(var92);
                                    } else {
                                        label772: for (int var88 = var9.field2667; var88 < field440; var88++) {
                                            int var89 = field439[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2671.length; var90++) {
                                                if (var9.field2671[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field7 = var9.field2582;
                                                    field452.method3276(var91);
                                                    break label772;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2667 = field440;
                                }
                                if (var9.field2636 != null && field442 > var9.field2668) {
                                    if (var9.field2637 == null || field442 - var9.field2668 > 32) {
                                        class1 var97 = new class1();
                                        var97.field3 = var9;
                                        var97.field7 = var9.field2636;
                                        field452.method3276(var97);
                                    } else {
                                        label748: for (int var93 = var9.field2668; var93 < field442; var93++) {
                                            int var94 = field441[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2637.length; var95++) {
                                                if (var9.field2637[var95] == var94) {
                                                    class1 var96 = new class1();
                                                    var96.field3 = var9;
                                                    var96.field7 = var9.field2636;
                                                    field452.method3276(var96);
                                                    break label748;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2668 = field442;
                                }
                                if (field443 > var9.field2665 && var9.field2641 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field7 = var9.field2641;
                                    field452.method3276(var98);
                                }
                                if (field444 > var9.field2665 && var9.field2545 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field7 = var9.field2545;
                                    field452.method3276(var99);
                                }
                                if (field445 > var9.field2665 && var9.field2595 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field7 = var9.field2595;
                                    field452.method3276(var100);
                                }
                                if (field446 > var9.field2665 && var9.field2648 != null) {
                                    class1 var101 = new class1();
                                    var101.field3 = var9;
                                    var101.field7 = var9.field2648;
                                    field452.method3276(var101);
                                }
                                if (field447 > var9.field2665 && var9.field2649 != null) {
                                    class1 var102 = new class1();
                                    var102.field3 = var9;
                                    var102.field7 = var9.field2649;
                                    field452.method3276(var102);
                                }
                                if (field448 > var9.field2665 && var9.field2645 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field7 = var9.field2645;
                                    field452.method3276(var103);
                                }
                                var9.field2665 = field495;
                                if (var9.field2642 != null) {
                                    for (int var104 = 0; var104 < field504; var104++) {
                                        class1 var105 = new class1();
                                        var105.field3 = var9;
                                        var105.field8 = field485[var104];
                                        var105.field9 = field451[var104];
                                        var105.field7 = var9.field2642;
                                        field452.method3276(var105);
                                    }
                                }
                            }
                        }
                        if (!var9.field2603 && field424 == null && Statics.field177 == null && !field379) {
                            if ((var9.field2568 >= 0 || var9.field2634 != 0) && class129.field2017 >= var12 && class129.field2018 >= var13 && class129.field2017 < var14 && class129.field2018 < var15) {
                                if (var9.field2568 >= 0) {
                                    Statics.field1685 = arg0[var9.field2568];
                                } else {
                                    Statics.field1685 = var9;
                                }
                            }
                            if (var9.field2570 == 8 && class129.field2017 >= var12 && class129.field2018 >= var13 && class129.field2017 < var14 && class129.field2018 < var15) {
                                Statics.field2475 = var9;
                            }
                            if (var9.field2587 > var9.field2567) {
                                method1651(var9, var9.field2560 + var10, var11, var9.field2567, var9.field2587, class129.field2017, class129.field2018);
                            }
                        }
                    } else if ((field335 == 0 || field335 == 3) && (class129.field2022 == 1 || !Statics.field1264 && class129.field2022 == 4)) {
                        int var57 = class129.field2030 - 25 - var10;
                        int var58 = class129.field2011 - 5 - var11;
                        if (var57 >= 0 && var58 >= 0 && var57 < 146 && var58 < 151 && (var57 < 0 || var57 > 23 || var58 < 117 || var58 > 142)) {
                            var57 -= 73;
                            var58 -= 75;
                            int var59 = field478 + field262 & 0x7FF;
                            int var60 = class85.field1497[var59];
                            int var61 = class85.field1498[var59];
                            int var62 = (field322 + 256) * var60 >> 8;
                            int var63 = (field322 + 256) * var61 >> 8;
                            int var64 = var57 * var63 + var58 * var62 >> 11;
                            int var65 = var58 * var63 - var57 * var62 >> 11;
                            int var66 = Statics.field377.field789 + var64 >> 7;
                            int var67 = Statics.field377.field754 - var65 >> 7;
                            field291.method2406(219);
                            field291.method2144(18);
                            field291.method2144(class126.field1979[82] ? (class126.field1979[81] ? 2 : 1) : 0);
                            field291.method2291(Statics.field140 + var66);
                            field291.method2188(Statics.field737 + var67);
                            field291.method2144(var57);
                            field291.method2144(var58);
                            field291.method2145(field262);
                            field291.method2144(57);
                            field291.method2144(field478);
                            field291.method2144(field322);
                            field291.method2144(89);
                            field291.method2145(Statics.field377.field789);
                            field291.method2145(Statics.field377.field754);
                            field291.method2144(63);
                            field462 = var66;
                            field298 = var67;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.ce(III)V")
    public static final void method1450(int arg0, int arg1) {
        if (class155.method2108(arg0)) {
            method649(Statics.field2653[arg0], arg1);
        }
    }

    @ObfuscatedName("ae.cu([Ley;IB)V")
    public static final void method649(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2570 == 0) {
                    if (var3.field2662 != null) {
                        method649(var3.field2662, arg1);
                    }
                    class4 var4 = (class4) field413.method3244((long) var3.field2551);
                    if (var4 != null) {
                        method1450(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2618 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field7 = var3.field2618;
                    class33.method654(var5);
                }
                if (arg1 == 1 && var3.field2647 != null) {
                    if (var3.field2552 >= 0) {
                        class155 var6 = class155.method3191(var3.field2551);
                        if (var6 == null || var6.field2662 == null || var3.field2552 >= var6.field2662.length || var6.field2662[var3.field2552] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field7 = var3.field2647;
                    class33.method654(var7);
                }
            }
        }
    }

    @ObfuscatedName("ax.cc(Ley;III)V")
    public static final void method619(class155 arg0, int arg1, int arg2) {
        if (field424 != null || field379 || arg0 == null) {
            return;
        }
        class155 var3 = arg0;
        int var4 = class159.method405(method38(arg0));
        class155 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class155.method3191(var3.field2562);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class155 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2614;
        }
        if (var7 == null) {
            return;
        }
        field424 = arg0;
        class155 var9 = arg0;
        int var10 = class159.method405(method38(arg0));
        class155 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class155.method3191(var9.field2562);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class155 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2614;
        }
        field425 = var13;
        field426 = arg1;
        field427 = arg2;
        Statics.field182 = 0;
        field435 = false;
        if (field394 > 0) {
            int var15 = field394 - 1;
            Statics.field1826 = new class28();
            Statics.field1826.field651 = field307[var15];
            Statics.field1826.field649 = field266[var15];
            Statics.field1826.field647 = field397[var15];
            Statics.field1826.field648 = field398[var15];
            Statics.field1826.field646 = field399[var15];
        }
        return;
    }

    @ObfuscatedName("au.cw(I)V")
    public static final void method626() {
        method2750(field424);
        Statics.field182++;
        if (field432 && field429) {
            int var0 = class129.field2017;
            int var1 = class129.field2018;
            int var2 = var0 - field426;
            int var3 = var1 - field427;
            if (var2 < field255) {
                var2 = field255;
            }
            if (field424.field2560 + var2 > field255 + field425.field2560) {
                var2 = field255 + field425.field2560 - field424.field2560;
            }
            if (var3 < field431) {
                var3 = field431;
            }
            if (field424.field2567 + var3 > field431 + field425.field2567) {
                var3 = field431 + field425.field2567 - field424.field2567;
            }
            int var4 = var2 - field433;
            int var5 = var3 - field434;
            int var6 = field424.field2615;
            if (Statics.field182 > field424.field2553 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field435 = true;
            }
            int var7 = field425.field2564 + (var2 - field255);
            int var8 = field425.field2565 + (var3 - field431);
            if (field424.field2656 != null && field435) {
                class1 var9 = new class1();
                var9.field3 = field424;
                var9.field6 = var7;
                var9.field5 = var8;
                var9.field7 = field424.field2656;
                class33.method654(var9);
            }
            if (class129.field2016 == 0) {
                if (field435) {
                    if (field424.field2583 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field424;
                        var10.field6 = var7;
                        var10.field5 = var8;
                        var10.field12 = field428;
                        var10.field7 = field424.field2583;
                        class33.method654(var10);
                    }
                    if (field428 != null) {
                        class155 var11 = field424;
                        int var12 = class159.method405(method38(var11));
                        class155 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class155.method3191(var11.field2562);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field291.method2406(248);
                            field291.method2322(field428.field2551);
                            field291.method2198(field424.field2551);
                            field291.method2257(field424.field2552);
                            field291.method2145(field424.field2658);
                            field291.method2291(field428.field2552);
                            field291.method2188(field428.field2658);
                        }
                    }
                } else if ((field392 == 1 || Statics.method37(field394 - 1)) && field394 > 2) {
                    Statics.method181(field433 + field426, field434 + field427);
                } else if (field394 > 0) {
                    int var15 = field433 + field426;
                    int var16 = field434 + field427;
                    method97(Statics.field1826, var15, var16);
                    Statics.field1826 = null;
                }
                field424 = null;
            }
        } else if (Statics.field182 > 1) {
            field424 = null;
        }
    }

    @ObfuscatedName("et.ci(Ley;I)V")
    public static void method2750(class155 arg0) {
        if (field267 == arg0.field2670) {
            field506[arg0.field2669] = true;
        }
    }

    @ObfuscatedName("w.cd(B)V")
    public static void method152() {
        for (class4 var0 = (class4) field413.method3254(); var0 != null; var0 = (class4) field413.method3257()) {
            int var1 = var0.field54;
            if (class155.method2108(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2653[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2603;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2882;
                    class155 var6 = class155.method3191(var5);
                    if (var6 != null) {
                        method2750(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.cl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method12(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("dg.co(II)V")
    public static final void method2502(int arg0) {
        if (!class155.method2108(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2653[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2660 = 0;
                var3.field2661 = 0;
            }
        }
    }

    @ObfuscatedName("p.cm([Ley;II)V")
    public static final void method140(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null && var3.field2562 == arg1 && (!var3.field2603 || !method565(var3))) {
                if (var3.field2570 == 0) {
                    if (!var3.field2603 && method565(var3) && Statics.field1685 != var3) {
                        continue;
                    }
                    method140(arg0, var3.field2551);
                    if (var3.field2662 != null) {
                        method140(var3.field2662, var3.field2551);
                    }
                    class4 var4 = (class4) field413.method3244((long) var3.field2551);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class155.method2108(var5)) {
                            method140(Statics.field2653[var5], -1);
                        }
                    }
                }
                if (var3.field2570 == 6) {
                    if (var3.field2547 != -1 || var3.field2588 != -1) {
                        boolean var6 = method1814(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2588;
                        } else {
                            var7 = var3.field2547;
                        }
                        if (var7 != -1) {
                            class39 var8 = class39.method547(var7);
                            var3.field2661 += field316;
                            while (var3.field2661 > var8.field918[var3.field2660]) {
                                var3.field2661 -= var8.field918[var3.field2660];
                                var3.field2660++;
                                if (var3.field2660 >= var8.field913.length) {
                                    var3.field2660 -= var8.field924;
                                    if (var3.field2660 < 0 || var3.field2660 >= var8.field913.length) {
                                        var3.field2660 = 0;
                                    }
                                }
                                method2750(var3);
                            }
                        }
                    }
                    if (var3.field2628 != 0 && !var3.field2603) {
                        int var9 = var3.field2628 >> 16;
                        int var10 = var3.field2628 << 16 >> 16;
                        int var11 = field316 * var9;
                        int var12 = field316 * var10;
                        var3.field2591 = var3.field2591 + var11 & 0x7FF;
                        var3.field2549 = var3.field2549 + var12 & 0x7FF;
                        method2750(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.cj(IB)V")
    public static final void method849(int arg0) {
        method152();
        class21.method2737();
        int var1 = class47.method2889(arg0).field1073;
        if (var1 == 0) {
            return;
        }
        int var2 = class157.field2680[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1825(0.9D);
                ((class89) Statics.field1494).method1903(0.9D);
            }
            if (var2 == 2) {
                class85.method1825(0.8D);
                ((class89) Statics.field1494).method1903(0.8D);
            }
            if (var2 == 3) {
                class85.method1825(0.7D);
                ((class89) Statics.field1494).method1903(0.7D);
            }
            if (var2 == 4) {
                class85.method1825(0.6D);
                ((class89) Statics.field1494).method1903(0.6D);
            }
            class46.field1027.method3223();
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
            if (field479 != var3) {
                if (field479 == 0 && field487 != -1) {
                    class164.method118(Statics.field1012, field487, 0, var3, false);
                    field488 = false;
                } else if (var3 == 0) {
                    class164.method533();
                    field488 = false;
                } else if (class164.field2732 == 0) {
                    Statics.field1834.method3084(var3);
                } else {
                    Statics.field2739 = var3;
                }
                field479 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field489 = 127;
            }
            if (var2 == 1) {
                field489 = 96;
            }
            if (var2 == 2) {
                field489 = 64;
            }
            if (var2 == 3) {
                field489 = 32;
            }
            if (var2 == 4) {
                field489 = 0;
            }
        }
        if (var1 == 5) {
            field392 = var2;
        }
        if (var1 == 6) {
            field414 = var2;
        }
        if (var1 == 9) {
            field365 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field268 = 127;
            }
            if (var2 == 1) {
                field268 = 96;
            }
            if (var2 == 2) {
                field268 = 64;
            }
            if (var2 == 3) {
                field268 = 32;
            }
            if (var2 == 4) {
                field268 = 0;
            }
        }
        if (var1 == 17) {
            field420 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field336 = (class18) class100.method2706(class18.method624(), var2);
            if (field336 == null) {
                field336 = class18.field519;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field384 = -1;
        } else {
            field384 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("m.df(B)V")
    public static final void method509() {
        field291.method2406(127);
        for (class4 var0 = (class4) field413.method3254(); var0 != null; var0 = (class4) field413.method3257()) {
            if (var0.field51 == 0 || var0.field51 == 3) {
                method561(var0, true);
            }
        }
        if (field416 != null) {
            method2750(field416);
            field416 = null;
        }
    }

    @ObfuscatedName("c.ds(IIII)Le;")
    public static final class4 method532(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field54 = arg1;
        var3.field51 = arg2;
        field413.method3245(var3, (long) arg0);
        method2502(arg1);
        class33.method607(arg1);
        class155 var4 = class155.method3191(arg0);
        if (var4 != null) {
            method2750(var4);
        }
        if (field416 != null) {
            method2750(field416);
            field416 = null;
        }
        method28();
        if (field334 != -1) {
            method1450(field334, 1);
        }
        return var3;
    }

    @ObfuscatedName("ah.dp(Le;ZS)V")
    public static final void method561(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2882;
        arg0.method3367();
        if (arg1) {
            class155.method2578(var2);
        }
        method1354(var2);
        class155 var4 = class155.method3191(var3);
        if (var4 != null) {
            method2750(var4);
        }
        method28();
        if (field334 != -1) {
            method1450(field334, 1);
        }
    }

    @ObfuscatedName("es.du(Ley;I)Z")
    public static final boolean method2862(class155 arg0) {
        int var1 = arg0.field2555;
        if (var1 == 205) {
            field380 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field411.method2966(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field411.method2981(var4, var5 == 1);
        }
        if (var1 == 324) {
            field411.method2969(false);
        }
        if (var1 == 325) {
            field411.method2969(true);
        }
        if (var1 == 326) {
            field291.method2406(142);
            field411.method2995(field291);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bt.dr(IIIILbq;I)V")
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method1645(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field478 + field262 & 0x7FF;
        int var7 = class85.field1497[var6];
        int var8 = class85.field1498[var6];
        int var9 = var7 * 256 / (field322 + 256);
        int var10 = var8 * 256 / (field322 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1290.method1510(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("aw.db(Ljava/lang/String;ZI)Z")
    public static boolean method606(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method2741(arg0, Statics.field2060);
        for (int var3 = 0; var3 < field396; var3++) {
            if (var2.equalsIgnoreCase(class212.method2741(field277[var3].field221, Statics.field2060)) && (!arg1 || field277[var3].field222 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method2741(Statics.field377.field46, Statics.field2060))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fb.dh(Ljava/lang/String;I)V")
    public static final void method3018(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field396 < 200 || field376 == 1) || field396 >= 400) {
            class10.method2441(30, "", class145.field2336);
            return;
        }
        String var1 = class212.method2741(arg0, Statics.field2060);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field396; var2++) {
            class16 var3 = field277[var2];
            String var4 = class212.method2741(var3.field221, Statics.field2060);
            if (var4 != null && var4.equals(var1)) {
                class10.method2441(30, "", arg0 + class145.field2337);
                return;
            }
            if (var3.field227 != null) {
                String var5 = class212.method2741(var3.field227, Statics.field2060);
                if (var5 != null && var5.equals(var1)) {
                    class10.method2441(30, "", arg0 + class145.field2337);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field403; var6++) {
            class8 var7 = field509[var6];
            String var8 = class212.method2741(var7.field126, Statics.field2060);
            if (var8 != null && var8.equals(var1)) {
                class10.method2441(30, "", class145.field2342 + arg0 + class145.field2343);
                return;
            }
            if (var7.field124 != null) {
                String var9 = class212.method2741(var7.field124, Statics.field2060);
                if (var9 != null && var9.equals(var1)) {
                    class10.method2441(30, "", class145.field2342 + arg0 + class145.field2343);
                    return;
                }
            }
        }
        if (class212.method2741(Statics.field377.field46, Statics.field2060).equals(var1)) {
            class10.method2441(30, "", class145.field2392);
        } else {
            field291.method2406(232);
            field291.method2144(class108.method480(arg0));
            field291.method2149(arg0);
        }
    }

    @ObfuscatedName("l.dn(Ljava/lang/String;ZI)V")
    public static final void method493(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field403 < 100 || field376 == 1) || field403 >= 400) {
            class10.method2441(31, "", class145.field2338);
            return;
        }
        String var2 = class212.method2741(arg0, Statics.field2060);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field403; var3++) {
            class8 var4 = field509[var3];
            String var5 = class212.method2741(var4.field126, Statics.field2060);
            if (var5 != null && var5.equals(var2)) {
                class10.method2441(31, "", arg0 + class145.field2327);
                return;
            }
            if (var4.field124 != null) {
                String var6 = class212.method2741(var4.field124, Statics.field2060);
                if (var6 != null && var6.equals(var2)) {
                    class10.method2441(31, "", arg0 + class145.field2327);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field396; var7++) {
            class16 var8 = field277[var7];
            String var9 = class212.method2741(var8.field221, Statics.field2060);
            if (var9 != null && var9.equals(var2)) {
                class10.method2441(31, "", class145.field2299 + arg0 + class145.field2345);
                return;
            }
            if (var8.field227 != null) {
                String var10 = class212.method2741(var8.field227, Statics.field2060);
                if (var10 != null && var10.equals(var2)) {
                    class10.method2441(31, "", class145.field2299 + arg0 + class145.field2345);
                    return;
                }
            }
        }
        if (class212.method2741(Statics.field377.field46, Statics.field2060).equals(var2)) {
            class10.method2441(31, "", class145.field2341);
        } else {
            field291.method2406(106);
            field291.method2144(class108.method480(arg0));
            field291.method2149(arg0);
        }
    }

    @ObfuscatedName("cx.dx(Ljava/lang/String;I)V")
    public static final void method1919(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method2741(arg0, Statics.field2060);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field396; var2++) {
            class16 var3 = field277[var2];
            String var4 = var3.field221;
            String var5 = class212.method2741(var4, Statics.field2060);
            if (class118.method2447(arg0, var1, var4, var5)) {
                field396--;
                for (int var6 = var2; var6 < field396; var6++) {
                    field277[var6] = field277[var6 + 1];
                }
                field444 = field495;
                field291.method2406(21);
                field291.method2144(class108.method480(arg0));
                field291.method2149(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ce.di(Ljava/lang/String;II)V")
    public static final void method2001(String arg0, int arg1) {
        field291.method2406(105);
        field291.method2144(class108.method480(arg0) + 1);
        field291.method2149(arg0);
        field291.method2181(arg1);
    }

    @ObfuscatedName("fw.dt(Ljava/lang/String;B)V")
    public static final void method3204(String arg0) {
        if (Statics.field1684 != null) {
            field291.method2406(199);
            field291.method2144(class108.method480(arg0));
            field291.method2149(arg0);
        }
    }

    @ObfuscatedName("ev.dy(Ljava/lang/String;I)V")
    public static final void method2840(String arg0) {
        if (!arg0.equals("")) {
            field291.method2406(201);
            field291.method2144(class108.method480(arg0));
            field291.method2149(arg0);
        }
    }

    @ObfuscatedName("bs.dz(IS)V")
    public static void method1354(int arg0) {
        for (class182 var1 = (class182) field455.method3254(); var1 != null; var1 = (class182) field455.method3257()) {
            if ((long) arg0 == (var1.field2882 >> 48 & 0xFFFFL)) {
                var1.method3367();
            }
        }
    }

    @ObfuscatedName("r.do(Ley;B)I")
    public static int method38(class155 arg0) {
        class182 var1 = (class182) field455.method3244(((long) arg0.field2551 << 32) + (long) arg0.field2552);
        return var1 == null ? arg0.field2611 : var1.field2869;
    }

    @ObfuscatedName("aj.dg(Ley;B)Z")
    public static boolean method565(class155 arg0) {
        if (field320) {
            if (method38(arg0) != 0) {
                return false;
            }
            if (arg0.field2570 == 0) {
                return false;
            }
        }
        return arg0.field2563;
    }

    @ObfuscatedName("k.dw(Ley;II)Ljava/lang/String;")
    public static String method13(class155 arg0, int arg1) {
        int var2 = method38(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2639 == null) {
            return null;
        } else if (arg0.field2646 == null || arg0.field2646.length <= arg1 || arg0.field2646[arg1] == null || arg0.field2646[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2646[arg1];
        }
    }

    @ObfuscatedName("ek.dl(Ley;I)Ljava/lang/String;")
    public static String method2743(class155 arg0) {
        int var1 = method38(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2550 == null || arg0.field2550.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2550;
        }
    }

    @ObfuscatedName("u.dj(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method184(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field480 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field480 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field480 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field480 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field480 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field333 + "/";
    }
}

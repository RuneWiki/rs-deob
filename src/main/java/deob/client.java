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
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class133 {

    @ObfuscatedName("client.k")
    public static boolean field242 = true;

    @ObfuscatedName("client.g")
    public static int field244 = 1;

    @ObfuscatedName("client.q")
    public static int field313 = 0;

    @ObfuscatedName("client.a")
    public static int field423 = 0;

    @ObfuscatedName("client.w")
    public static class209[] field304 = new class209[4];

    @ObfuscatedName("client.j")
    public static boolean field508 = false;

    @ObfuscatedName("client.p")
    public static boolean field249 = false;

    @ObfuscatedName("client.n")
    public static int field321 = 0;

    @ObfuscatedName("client.s")
    public static int field270 = 0;

    @ObfuscatedName("client.f")
    public static boolean field450 = true;

    @ObfuscatedName("client.c")
    public static int field418 = 0;

    @ObfuscatedName("client.t")
    public static long field255 = 1L;

    @ObfuscatedName("client.u")
    public static int field253 = -1;

    @ObfuscatedName("client.o")
    public static int field318 = -1;

    @ObfuscatedName("client.m")
    public static int field254 = -1;

    @ObfuscatedName("client.h")
    public static boolean field259 = true;

    @ObfuscatedName("client.d")
    public static boolean field379 = false;

    @ObfuscatedName("client.ac")
    public static int field299 = 0;

    @ObfuscatedName("client.ax")
    public static int field262 = 0;

    @ObfuscatedName("client.af")
    public static int field420 = 0;

    @ObfuscatedName("client.am")
    public static int field462 = 0;

    @ObfuscatedName("client.ah")
    public static int field265 = 0;

    @ObfuscatedName("client.ar")
    public static int field368 = 0;

    @ObfuscatedName("client.ad")
    public static int field267 = 0;

    @ObfuscatedName("client.ao")
    public static int field268 = 0;

    @ObfuscatedName("client.ae")
    public static int field269 = 0;

    @ObfuscatedName("client.ab")
    public static class108 field326 = new class108(new byte[5000]);

    @ObfuscatedName("client.ap")
    public static class18 field358 = class18.field513;

    @ObfuscatedName("client.az")
    public static int field273 = 0;

    @ObfuscatedName("client.aw")
    public static int field504 = 0;

    @ObfuscatedName("client.ak")
    public static int field275 = 0;

    @ObfuscatedName("client.bu")
    public static int field277 = 0;

    @ObfuscatedName("client.bm")
    public static int field413 = 0;

    @ObfuscatedName("client.bl")
    public static int field279 = 0;

    @ObfuscatedName("client.bi")
    public static int field280 = 0;

    @ObfuscatedName("client.bg")
    public static int field281 = 0;

    @ObfuscatedName("client.bs")
    public static class31[] field498 = new class31[32768];

    @ObfuscatedName("client.bd")
    public static int field284 = 0;

    @ObfuscatedName("client.bj")
    public static int[] field285 = new int[32768];

    @ObfuscatedName("client.cs")
    public static class111 field454 = new class111(5000);

    @ObfuscatedName("client.cj")
    public static class111 field477 = new class111(5000);

    @ObfuscatedName("client.cw")
    public static class111 field411 = new class111(5000);

    @ObfuscatedName("client.cp")
    public static int field289 = 0;

    @ObfuscatedName("client.ca")
    public static int field290 = 0;

    @ObfuscatedName("client.cq")
    public static int field511 = 0;

    @ObfuscatedName("client.cb")
    public static int field292 = 0;

    @ObfuscatedName("client.ce")
    public static int field293 = 0;

    @ObfuscatedName("client.cl")
    public static int field427 = 0;

    @ObfuscatedName("client.ci")
    public static int field397 = 0;

    @ObfuscatedName("client.cy")
    public static int field296 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field490 = false;

    @ObfuscatedName("client.cg")
    public static int field298 = 0;

    @ObfuscatedName("client.ct")
    public static int field263 = 0;

    @ObfuscatedName("client.do")
    public static int field300 = 1;

    @ObfuscatedName("client.ds")
    public static int field301 = 0;

    @ObfuscatedName("client.de")
    public static int field302 = 1;

    @ObfuscatedName("client.dd")
    public static int field303 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field329 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field306 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dg")
    public static int field308 = 0;

    @ObfuscatedName("client.dz")
    public static int field496 = 2;

    @ObfuscatedName("client.dm")
    public static int field261 = 0;

    @ObfuscatedName("client.dj")
    public static int field311 = 2;

    @ObfuscatedName("client.dy")
    public static int field312 = 0;

    @ObfuscatedName("client.di")
    public static int field371 = 1;

    @ObfuscatedName("client.dh")
    public static int field245 = 0;

    @ObfuscatedName("client.da")
    public static int field315 = 0;

    @ObfuscatedName("client.dr")
    public static int field316 = 2;

    @ObfuscatedName("client.du")
    public static int field317 = 0;

    @ObfuscatedName("client.el")
    public static int field481 = 1;

    @ObfuscatedName("client.ee")
    public static int field319 = 0;

    @ObfuscatedName("client.em")
    public static int field350 = 0;

    @ObfuscatedName("client.eo")
    public static int field323 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field324 = 5063219;

    @ObfuscatedName("client.ek")
    public static int field325 = 3353893;

    @ObfuscatedName("client.er")
    public static int field295 = 7759444;

    @ObfuscatedName("client.ey")
    public static boolean field327 = false;

    @ObfuscatedName("client.fa")
    public static int field328 = 0;

    @ObfuscatedName("client.fp")
    public static int field422 = 128;

    @ObfuscatedName("client.fz")
    public static int field378 = 0;

    @ObfuscatedName("client.fj")
    public static int field331 = 0;

    @ObfuscatedName("client.fh")
    public static int field332 = 0;

    @ObfuscatedName("client.fq")
    public static int field264 = 0;

    @ObfuscatedName("client.fs")
    public static int field334 = 0;

    @ObfuscatedName("client.fu")
    public static int field335 = 0;

    @ObfuscatedName("client.fx")
    public static boolean field336 = false;

    @ObfuscatedName("client.ff")
    public static int field297 = 0;

    @ObfuscatedName("client.fl")
    public static int field338 = 0;

    @ObfuscatedName("client.fr")
    public static int field339 = 50;

    @ObfuscatedName("client.fn")
    public static int[] field340 = new int[field339];

    @ObfuscatedName("client.fd")
    public static int[] field310 = new int[field339];

    @ObfuscatedName("client.fb")
    public static int[] field501 = new int[field339];

    @ObfuscatedName("client.fi")
    public static int[] field343 = new int[field339];

    @ObfuscatedName("client.fg")
    public static int[] field458 = new int[field339];

    @ObfuscatedName("client.fv")
    public static int[] field345 = new int[field339];

    @ObfuscatedName("client.fe")
    public static int[] field346 = new int[field339];

    @ObfuscatedName("client.gl")
    public static String[] field360 = new String[field339];

    @ObfuscatedName("client.ga")
    public static int[][] field348 = new int[104][104];

    @ObfuscatedName("client.gr")
    public static int field349 = 0;

    @ObfuscatedName("client.gq")
    public static int field258 = -1;

    @ObfuscatedName("client.gk")
    public static int field351 = -1;

    @ObfuscatedName("client.gg")
    public static int field286 = 0;

    @ObfuscatedName("client.gp")
    public static int field353 = 0;

    @ObfuscatedName("client.gd")
    public static int field361 = 0;

    @ObfuscatedName("client.go")
    public static int field355 = 0;

    @ObfuscatedName("client.gv")
    public static int field356 = 0;

    @ObfuscatedName("client.gy")
    public static int field357 = 0;

    @ObfuscatedName("client.gj")
    public static int field388 = 0;

    @ObfuscatedName("client.gs")
    public static int field359 = 0;

    @ObfuscatedName("client.gh")
    public static int field486 = 0;

    @ObfuscatedName("client.gt")
    public static int field240 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field337 = false;

    @ObfuscatedName("client.gb")
    public static int field363 = 0;

    @ObfuscatedName("client.gn")
    public static int field364 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field365 = new class3[2048];

    @ObfuscatedName("client.gi")
    public static int field366 = 0;

    @ObfuscatedName("client.gz")
    public static int[] field367 = new int[2048];

    @ObfuscatedName("client.hx")
    public static int field430 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field369 = new int[2048];

    @ObfuscatedName("client.hb")
    public static class108[] field370 = new class108[2048];

    @ObfuscatedName("client.hv")
    public static int field252 = -1;

    @ObfuscatedName("client.hc")
    public static int field347 = 0;

    @ObfuscatedName("client.hz")
    public static int field373 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field374 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field372 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hg")
    public static String[] field305 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field377 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field440 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static int field445 = -1;

    @ObfuscatedName("client.hm")
    public static class180[][][] field376 = new class180[4][104][104];

    @ObfuscatedName("client.hw")
    public static class180 field291 = new class180();

    @ObfuscatedName("client.hr")
    public static class180 field382 = new class180();

    @ObfuscatedName("client.hd")
    public static class180 field375 = new class180();

    @ObfuscatedName("client.hn")
    public static int[] field384 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field386 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field257 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field250 = false;

    @ObfuscatedName("client.iw")
    public static int field390 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field391 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field394 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field395 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field396 = new String[500];

    @ObfuscatedName("client.iy")
    public static int field491 = -1;

    @ObfuscatedName("client.iu")
    public static int field455 = -1;

    @ObfuscatedName("client.in")
    public static int field492 = 0;

    @ObfuscatedName("client.is")
    public static int field400 = 50;

    @ObfuscatedName("client.ic")
    public static int field401 = 0;

    @ObfuscatedName("client.it")
    public static String field380 = null;

    @ObfuscatedName("client.ie")
    public static boolean field403 = false;

    @ObfuscatedName("client.ib")
    public static int field404 = -1;

    @ObfuscatedName("client.ij")
    public static int field405 = -1;

    @ObfuscatedName("client.jh")
    public static String field406 = null;

    @ObfuscatedName("client.jc")
    public static String field407 = null;

    @ObfuscatedName("client.jr")
    public static int field408 = -1;

    @ObfuscatedName("client.jo")
    public static class177 field409 = new class177(8);

    @ObfuscatedName("client.jt")
    public static int field410 = 0;

    @ObfuscatedName("client.jm")
    public static int field354 = 0;

    @ObfuscatedName("client.jj")
    public static class155 field495 = null;

    @ObfuscatedName("client.jd")
    public static int field283 = 0;

    @ObfuscatedName("client.jf")
    public static int field412 = 0;

    @ObfuscatedName("client.jg")
    public static int field415 = 0;

    @ObfuscatedName("client.jy")
    public static int field416 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field417 = false;

    @ObfuscatedName("client.jp")
    public static boolean field266 = false;

    @ObfuscatedName("client.jq")
    public static boolean field419 = false;

    @ObfuscatedName("client.jn")
    public static class155 field248 = null;

    @ObfuscatedName("client.js")
    public static class155 field421 = null;

    @ObfuscatedName("client.ju")
    public static int field274 = 0;

    @ObfuscatedName("client.je")
    public static int field344 = 0;

    @ObfuscatedName("client.ja")
    public static class155 field272 = null;

    @ObfuscatedName("client.jk")
    public static boolean field437 = false;

    @ObfuscatedName("client.jw")
    public static int field426 = -1;

    @ObfuscatedName("client.jz")
    public static int field387 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field435 = false;

    @ObfuscatedName("client.jb")
    public static int field429 = -1;

    @ObfuscatedName("client.jx")
    public static int field271 = -1;

    @ObfuscatedName("client.ke")
    public static boolean field431 = false;

    @ObfuscatedName("client.kb")
    public static int field432 = 1;

    @ObfuscatedName("client.kr")
    public static int[] field433 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field434 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field466 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field436 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field414 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field449 = 0;

    @ObfuscatedName("client.kq")
    public static int field439 = 0;

    @ObfuscatedName("client.kv")
    public static int field320 = 0;

    @ObfuscatedName("client.kj")
    public static int field441 = 0;

    @ObfuscatedName("client.ky")
    public static int field428 = 0;

    @ObfuscatedName("client.kp")
    public static int field443 = 0;

    @ObfuscatedName("client.kd")
    public static int field444 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field402 = new int[2000];

    @ObfuscatedName("client.kw")
    public static String[] field446 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field447 = 0;

    @ObfuscatedName("client.kg")
    public static class180 field309 = new class180();

    @ObfuscatedName("client.kf")
    public static class180 field442 = new class180();

    @ObfuscatedName("client.lo")
    public static class180 field493 = new class180();

    @ObfuscatedName("client.ld")
    public static class177 field451 = new class177(512);

    @ObfuscatedName("client.lt")
    public static int field452 = 0;

    @ObfuscatedName("client.lg")
    public static int field453 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field506 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field381 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field456 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field424 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field502 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field460 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field461 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field448 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field463 = 0;

    @ObfuscatedName("client.lw")
    public static int field464 = 0;

    @ObfuscatedName("client.lk")
    public static String field287 = "";

    @ObfuscatedName("client.lf")
    public static long[] field488 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field352 = 0;

    @ObfuscatedName("client.lz")
    public static int field468 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field469 = new int[128];

    @ObfuscatedName("client.le")
    public static int[] field470 = new int[128];

    @ObfuscatedName("client.lm")
    public static long field471 = -1L;

    @ObfuscatedName("client.mf")
    public static String field472 = null;

    @ObfuscatedName("client.my")
    public static String field473 = null;

    @ObfuscatedName("client.mk")
    public static int field474 = -1;

    @ObfuscatedName("client.ma")
    public static int field475 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field476 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field438 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class73[] field478 = new class73[1000];

    @ObfuscatedName("client.mc")
    public static int field479 = 0;

    @ObfuscatedName("client.ml")
    public static int field480 = 0;

    @ObfuscatedName("client.mn")
    public static int field482 = 0;

    @ObfuscatedName("client.mj")
    public static int field483 = 255;

    @ObfuscatedName("client.mb")
    public static int field484 = -1;

    @ObfuscatedName("client.mo")
    public static boolean field485 = false;

    @ObfuscatedName("client.mu")
    public static int field314 = 127;

    @ObfuscatedName("client.mr")
    public static int field487 = 127;

    @ObfuscatedName("client.nx")
    public static int field341 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field282 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field383 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field342 = new int[50];

    @ObfuscatedName("client.nb")
    public static class53[] field260 = new class53[50];

    @ObfuscatedName("client.nd")
    public static boolean field494 = false;

    @ObfuscatedName("client.nr")
    public static boolean[] field333 = new boolean[5];

    @ObfuscatedName("client.ns")
    public static int[] field243 = new int[5];

    @ObfuscatedName("client.nm")
    public static int[] field497 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field398 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field499 = new int[5];

    @ObfuscatedName("client.ol")
    public static int field500 = 0;

    @ObfuscatedName("client.oy")
    public static int field288 = 0;

    @ObfuscatedName("client.ow")
    public static class16[] field399 = new class16[400];

    @ObfuscatedName("client.oc")
    public static class176 field503 = new class176();

    @ObfuscatedName("client.oj")
    public static int field467 = 0;

    @ObfuscatedName("client.oo")
    public static class8[] field505 = new class8[400];

    @ObfuscatedName("client.om")
    public static class160 field362 = new class160();

    @ObfuscatedName("client.ok")
    public static int field507 = -1;

    @ObfuscatedName("client.oh")
    public static int field294 = -1;

    @ObfuscatedName("client.os")
    public static class201[] field509 = new class201[6];

    @ObfuscatedName("client.g(I)V")
    public final void method157() {
    }

    public final void init() {
        if (!this.method2619()) {
            return;
        }
        class171[] var1 = new class171[] { class171.field2842, class171.field2838, class171.field2845, class171.field2836, class171.field2844, class171.field2835, class171.field2839, class171.field2840, class171.field2834, class171.field2843 };
        class171[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2837);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2837)) {
                    case 1:
                        field244 = Integer.parseInt(var5);
                        break;
                    case 2:
                        class142[] var6 = new class142[] { class142.field2137, class142.field2141, class142.field2142, class142.field2136, class142.field2140, class142.field2138 };
                        Statics.field246 = (class142) class100.method1(var6, Integer.parseInt(var5));
                        if (Statics.field246 == class142.field2142) {
                            Statics.field247 = class193.field2911;
                        } else {
                            Statics.field247 = class193.field2916;
                        }
                    case 3:
                    default:
                        break;
                    case 4:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                            field508 = true;
                        } else {
                            field508 = false;
                        }
                        break;
                    case 5:
                        field321 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field465 = var5;
                        break;
                    case 7:
                        field423 = Integer.parseInt(var5);
                        break;
                    case 8:
                        Statics.field2815 = class141.method672(Integer.parseInt(var5));
                        break;
                    case 9:
                        field313 = Integer.parseInt(var5);
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                        }
                }
            }
        }
        class80.field1430 = false;
        field249 = false;
        Statics.field198 = this.getCodeBase().getHost();
        String var7 = Statics.field2815.field2132;
        byte var8 = 0;
        try {
            Statics.field1829 = 16;
            Statics.field622 = var8;
            try {
                Statics.field909 = System.getProperty("os.name");
            } catch (Exception var28) {
                Statics.field909 = "Unknown";
            }
            Statics.field2097 = Statics.field909.toLowerCase();
            try {
                Statics.field2090 = System.getProperty("user.home");
                if (Statics.field2090 != null) {
                    Statics.field2090 = Statics.field2090 + "/";
                }
            } catch (Exception var27) {
            }
            try {
                if (Statics.field2097.startsWith("win")) {
                    if (Statics.field2090 == null) {
                        Statics.field2090 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2090 == null) {
                    Statics.field2090 = System.getenv("HOME");
                }
                if (Statics.field2090 != null) {
                    Statics.field2090 = Statics.field2090 + "/";
                }
            } catch (Exception var26) {
            }
            if (Statics.field2090 == null) {
                Statics.field2090 = "~/";
            }
            Statics.field714 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2090, "/tmp/", "" };
            Statics.field2028 = new String[] { ".jagex_cache_" + Statics.field622, ".file_store_" + Statics.field622 };
            label150: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field1365 = class138.method2705("oldschool", var7, var12);
                if (!Statics.field1365.exists()) {
                    Statics.field1365.mkdirs();
                }
                File[] var13 = Statics.field1365.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label150;
                    }
                    File var16 = var14[var15];
                    if (!class138.method1771(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            class124.method2430(Statics.field1365);
            try {
                File var17 = new File(Statics.field2090, "random.dat");
                if (var17.exists()) {
                    class138.field2103 = new class208(new class207(var17, "rw", 25L), 24, 0);
                } else {
                    label130: for (int var18 = 0; var18 < Statics.field2028.length; var18++) {
                        for (int var19 = 0; var19 < Statics.field714.length; var19++) {
                            File var20 = new File(Statics.field714[var19] + Statics.field2028[var18] + File.separatorChar + "random.dat");
                            if (var20.exists()) {
                                class138.field2103 = new class208(new class207(var20, "rw", 25L), 24, 0);
                                break label130;
                            }
                        }
                    }
                }
                if (class138.field2103 == null) {
                    RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                    int var22 = var21.read();
                    var21.seek(0L);
                    var21.write(var22);
                    var21.seek(0L);
                    var21.close();
                    class138.field2103 = new class208(new class207(var17, "rw", 25L), 24, 0);
                }
            } catch (IOException var29) {
            }
            class138.field2095 = new class208(new class207(class124.method2038("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class138.field2096 = new class208(new class207(class124.method2038("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1819 = new class208[Statics.field1829];
            for (int var24 = 0; var24 < Statics.field1829; var24++) {
                Statics.field1819[var24] = new class208(new class207(class124.method2038("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var30) {
            class137.method101((String) null, var30);
        }
        Statics.field241 = this;
        this.method2614(765, 503, 72);
    }

    @ObfuscatedName("client.l(S)V")
    public final void method160() {
        Statics.field1827 = field423 == 0 ? 43594 : field244 + 40000;
        Statics.field1522 = field423 == 0 ? 443 : field244 + 50000;
        Statics.field256 = Statics.field1827;
        Statics.field2515 = class156.field2672;
        Statics.field1889 = class156.field2671;
        Statics.field138 = class156.field2670;
        Statics.field2695 = class156.field2673;
        if (Statics.field1944.toLowerCase().indexOf("microsoft") == -1) {
            class126.field1957[44] = 71;
            class126.field1957[45] = 26;
            class126.field1957[46] = 72;
            class126.field1957[47] = 73;
            class126.field1957[59] = 57;
            class126.field1957[61] = 27;
            class126.field1957[91] = 42;
            class126.field1957[92] = 74;
            class126.field1957[93] = 43;
            class126.field1957[192] = 28;
            class126.field1957[222] = 58;
            class126.field1957[520] = 59;
        } else {
            class126.field1957[186] = 57;
            class126.field1957[187] = 27;
            class126.field1957[188] = 71;
            class126.field1957[189] = 26;
            class126.field1957[190] = 72;
            class126.field1957[191] = 73;
            class126.field1957[192] = 58;
            class126.field1957[219] = 42;
            class126.field1957[220] = 74;
            class126.field1957[221] = 43;
            class126.field1957[222] = 59;
            class126.field1957[223] = 28;
        }
        Canvas var1 = Statics.field2154;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class126.field1978);
        var1.addFocusListener(class126.field1978);
        class129.method2041(Statics.field2154);
        Statics.field1317 = class120.method2398();
        if (Statics.field1317 != null) {
            Statics.field1317.method2445(Statics.field2154);
        }
        Statics.field2013 = new class123(255, class138.field2095, class138.field2096, 500000);
        Statics.field1296 = class9.method71();
        Statics.field510 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field2163;
        class127.field1989 = this;
        class127.field1986 = var3;
        if (field423 != 0) {
            field379 = true;
        }
    }

    @ObfuscatedName("client.a(I)V")
    public final void method203() {
        field418++;
        this.method164();
        while (true) {
            class180 var1 = class152.field2514;
            class151 var2;
            synchronized (class152.field2514) {
                var2 = (class151) class152.field2509.method3227();
            }
            if (var2 == null) {
                class164.method1592();
                method155();
                class126 var4 = class126.field1978;
                synchronized (class126.field1978) {
                    class126.field1982++;
                    class126.field1979 = class126.field1969;
                    class126.field1961 = 0;
                    if (class126.field1960 >= 0) {
                        while (class126.field1973 != class126.field1960) {
                            int var6 = class126.field1972[class126.field1973];
                            class126.field1973 = class126.field1973 + 1 & 0x7F;
                            if (var6 < 0) {
                                class126.field1971[~var6] = false;
                            } else {
                                if (!class126.field1971[var6] && class126.field1961 < class126.field1977.length - 1) {
                                    class126.field1977[++class126.field1961 - 1] = var6;
                                }
                                class126.field1971[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class126.field1971[var5] = false;
                        }
                        class126.field1960 = class126.field1973;
                    }
                    class126.field1969 = class126.field1980;
                }
                class129.method588();
                if (Statics.field1317 != null) {
                    int var8 = Statics.field1317.method2447();
                    field447 = var8;
                }
                int var10002;
                if (field270 == 0) {
                    method449();
                    Statics.field646.method2467();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2058[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2059[var10] = 0L;
                    }
                    Statics.field930 = 0;
                } else if (field270 == 5) {
                    class29.method2410(this);
                    method449();
                    Statics.field646.method2467();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2058[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2059[var12] = 0L;
                    }
                    Statics.field930 = 0;
                } else if (field270 == 10 || field270 == 11) {
                    class29.method2410(this);
                } else if (field270 == 20) {
                    class29.method2410(this);
                    method1326();
                } else if (field270 == 25) {
                    method2(false);
                    field263 = 0;
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field975.length; var14++) {
                        if (Statics.field1526[var14] != -1 && Statics.field975[var14] == null) {
                            Statics.field975[var14] = Statics.field519.method2721(Statics.field1526[var14], 0);
                            if (Statics.field975[var14] == null) {
                                var13 = false;
                                field263++;
                            }
                        }
                        if (Statics.field1315[var14] != -1 && Statics.field1075[var14] == null) {
                            Statics.field1075[var14] = Statics.field519.method2781(Statics.field1315[var14], 0, Statics.field214[var14]);
                            if (Statics.field1075[var14] == null) {
                                var13 = false;
                                field263++;
                            }
                        }
                    }
                    if (var13) {
                        field301 = 0;
                        boolean var15 = true;
                        for (int var16 = 0; var16 < Statics.field975.length; var16++) {
                            byte[] var17 = Statics.field1075[var16];
                            if (var17 != null) {
                                int var18 = (Statics.field2069[var16] >> 8) * 64 - Statics.field1821;
                                int var19 = (Statics.field2069[var16] & 0xFF) * 64 - Statics.field990;
                                if (field329) {
                                    var18 = 10;
                                    var19 = 10;
                                }
                                boolean var21 = true;
                                class108 var22 = new class108(var17);
                                int var23 = -1;
                                label3892: while (true) {
                                    int var24 = var22.method2135();
                                    if (var24 == 0) {
                                        var15 &= var21;
                                        break;
                                    }
                                    var23 += var24;
                                    int var25 = 0;
                                    boolean var26 = false;
                                    while (true) {
                                        while (!var26) {
                                            int var28 = var22.method2135();
                                            if (var28 == 0) {
                                                continue label3892;
                                            }
                                            var25 += var28 - 1;
                                            int var29 = var25 & 0x3F;
                                            int var30 = var25 >> 6 & 0x3F;
                                            int var31 = var22.method2122() >> 2;
                                            int var32 = var18 + var30;
                                            int var33 = var19 + var29;
                                            if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
                                                class37 var34 = class37.method2581(var23);
                                                if (var31 != 22 || !field249 || var34.field874 != 0 || var34.field854 == 1 || var34.field881) {
                                                    if (!var34.method637()) {
                                                        field301++;
                                                        var21 = false;
                                                    }
                                                    var26 = true;
                                                }
                                            }
                                        }
                                        int var27 = var22.method2135();
                                        if (var27 == 0) {
                                            break;
                                        }
                                        var22.method2122();
                                    }
                                }
                            }
                        }
                        if (var15) {
                            if (field303 != 0) {
                                method86(class145.field2174 + class2.field18 + class2.field21 + 100 + "%" + class2.field22, true);
                            }
                            method155();
                            method81();
                            method155();
                            Statics.field2027.method1692();
                            method155();
                            System.gc();
                            for (int var36 = 0; var36 < 4; var36++) {
                                field304[var36].method3588();
                            }
                            for (int var37 = 0; var37 < 4; var37++) {
                                for (int var38 = 0; var38 < 104; var38++) {
                                    for (int var39 = 0; var39 < 104; var39++) {
                                        class6.field72[var37][var38][var39] = 0;
                                    }
                                }
                            }
                            method155();
                            class6.field83 = 99;
                            Statics.field74 = new byte[4][104][104];
                            Statics.field2512 = new byte[4][104][104];
                            Statics.field75 = new byte[4][104][104];
                            Statics.field76 = new byte[4][104][104];
                            Statics.field88 = new int[4][105][105];
                            Statics.field2134 = new byte[4][105][105];
                            Statics.field77 = new int[105][105];
                            Statics.field78 = new int[104];
                            Statics.field2126 = new int[104];
                            Statics.field2144 = new int[104];
                            Statics.field643 = new int[104];
                            Statics.field1898 = new int[104];
                            int var40 = Statics.field975.length;
                            class21.method548();
                            method2(true);
                            if (!field329) {
                                int var41 = 0;
                                label3830: while (true) {
                                    if (var41 >= var40) {
                                        for (int var55 = 0; var55 < var40; var55++) {
                                            int var56 = (Statics.field2069[var55] >> 8) * 64 - Statics.field1821;
                                            int var57 = (Statics.field2069[var55] & 0xFF) * 64 - Statics.field990;
                                            byte[] var58 = Statics.field975[var55];
                                            if (var58 == null && Statics.field641 < 800) {
                                                method155();
                                                class6.method123(var56, var57, 64, 64);
                                            }
                                        }
                                        method2(true);
                                        int var59 = 0;
                                        while (true) {
                                            if (var59 >= var40) {
                                                break label3830;
                                            }
                                            byte[] var60 = Statics.field1075[var59];
                                            if (var60 != null) {
                                                int var61 = (Statics.field2069[var59] >> 8) * 64 - Statics.field1821;
                                                int var62 = (Statics.field2069[var59] & 0xFF) * 64 - Statics.field990;
                                                method155();
                                                class80 var63 = Statics.field2027;
                                                class209[] var64 = field304;
                                                class108 var65 = new class108(var60);
                                                int var66 = -1;
                                                while (true) {
                                                    int var67 = var65.method2135();
                                                    if (var67 == 0) {
                                                        break;
                                                    }
                                                    var66 += var67;
                                                    int var68 = 0;
                                                    while (true) {
                                                        int var69 = var65.method2135();
                                                        if (var69 == 0) {
                                                            break;
                                                        }
                                                        var68 += var69 - 1;
                                                        int var70 = var68 & 0x3F;
                                                        int var71 = var68 >> 6 & 0x3F;
                                                        int var72 = var68 >> 12;
                                                        int var73 = var65.method2122();
                                                        int var74 = var73 >> 2;
                                                        int var75 = var73 & 0x3;
                                                        int var76 = var61 + var71;
                                                        int var77 = var62 + var70;
                                                        if (var76 > 0 && var77 > 0 && var76 < 103 && var77 < 103) {
                                                            int var78 = var72;
                                                            if ((class6.field72[1][var76][var77] & 0x2) == 2) {
                                                                var78 = var72 - 1;
                                                            }
                                                            class209 var79 = null;
                                                            if (var78 >= 0) {
                                                                var79 = var64[var78];
                                                            }
                                                            class6.method28(var72, var76, var77, var66, var75, var74, var63, var79);
                                                        }
                                                    }
                                                }
                                            }
                                            var59++;
                                        }
                                    }
                                    int var42 = (Statics.field2069[var41] >> 8) * 64 - Statics.field1821;
                                    int var43 = (Statics.field2069[var41] & 0xFF) * 64 - Statics.field990;
                                    byte[] var44 = Statics.field975[var41];
                                    if (var44 != null) {
                                        method155();
                                        int var45 = Statics.field1822 * 8 - 48;
                                        int var46 = Statics.field641 * 8 - 48;
                                        class209[] var47 = field304;
                                        int var48 = 0;
                                        label3827: while (true) {
                                            if (var48 >= 4) {
                                                class108 var51 = new class108(var44);
                                                int var52 = 0;
                                                while (true) {
                                                    if (var52 >= 4) {
                                                        break label3827;
                                                    }
                                                    for (int var53 = 0; var53 < 64; var53++) {
                                                        for (int var54 = 0; var54 < 64; var54++) {
                                                            class6.method1594(var51, var52, var42 + var53, var43 + var54, var45, var46, 0);
                                                        }
                                                    }
                                                    var52++;
                                                }
                                            }
                                            for (int var49 = 0; var49 < 64; var49++) {
                                                for (int var50 = 0; var50 < 64; var50++) {
                                                    if (var42 + var49 > 0 && var42 + var49 < 103 && var43 + var50 > 0 && var43 + var50 < 103) {
                                                        var47[var48].field3007[var42 + var49][var43 + var50] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var48++;
                                        }
                                    }
                                    var41++;
                                }
                            }
                            if (field329) {
                                int var80 = 0;
                                label3763: while (true) {
                                    if (var80 >= 4) {
                                        for (int var98 = 0; var98 < 13; var98++) {
                                            for (int var99 = 0; var99 < 13; var99++) {
                                                int var100 = field306[0][var98][var99];
                                                if (var100 == -1) {
                                                    class6.method123(var98 * 8, var99 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2(true);
                                        int var101 = 0;
                                        while (true) {
                                            if (var101 >= 4) {
                                                break label3763;
                                            }
                                            method155();
                                            for (int var102 = 0; var102 < 13; var102++) {
                                                for (int var103 = 0; var103 < 13; var103++) {
                                                    int var104 = field306[var101][var102][var103];
                                                    if (var104 != -1) {
                                                        int var105 = var104 >> 24 & 0x3;
                                                        int var106 = var104 >> 1 & 0x3;
                                                        int var107 = var104 >> 14 & 0x3FF;
                                                        int var108 = var104 >> 3 & 0x7FF;
                                                        int var109 = (var107 / 8 << 8) + var108 / 8;
                                                        for (int var110 = 0; var110 < Statics.field2069.length; var110++) {
                                                            if (Statics.field2069[var110] == var109 && Statics.field1075[var110] != null) {
                                                                class6.method835(Statics.field1075[var110], var101, var102 * 8, var103 * 8, var105, (var107 & 0x7) * 8, (var108 & 0x7) * 8, var106, Statics.field2027, field304);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var101++;
                                        }
                                    }
                                    method155();
                                    for (int var81 = 0; var81 < 13; var81++) {
                                        for (int var82 = 0; var82 < 13; var82++) {
                                            boolean var83 = false;
                                            int var84 = field306[var80][var81][var82];
                                            if (var84 != -1) {
                                                int var85 = var84 >> 24 & 0x3;
                                                int var86 = var84 >> 1 & 0x3;
                                                int var87 = var84 >> 14 & 0x3FF;
                                                int var88 = var84 >> 3 & 0x7FF;
                                                int var89 = (var87 / 8 << 8) + var88 / 8;
                                                for (int var90 = 0; var90 < Statics.field2069.length; var90++) {
                                                    if (Statics.field2069[var90] == var89 && Statics.field975[var90] != null) {
                                                        class6.method2442(Statics.field975[var90], var80, var81 * 8, var82 * 8, var85, (var87 & 0x7) * 8, (var88 & 0x7) * 8, var86, field304);
                                                        var83 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var83) {
                                                int var91 = var80;
                                                int var92 = var81 * 8;
                                                int var93 = var82 * 8;
                                                for (int var94 = 0; var94 < 8; var94++) {
                                                    for (int var95 = 0; var95 < 8; var95++) {
                                                        class6.field84[var91][var92 + var94][var93 + var95] = 0;
                                                    }
                                                }
                                                if (var92 > 0) {
                                                    for (int var96 = 1; var96 < 8; var96++) {
                                                        class6.field84[var91][var92][var93 + var96] = class6.field84[var91][var92 - 1][var93 + var96];
                                                    }
                                                }
                                                if (var93 > 0) {
                                                    for (int var97 = 1; var97 < 8; var97++) {
                                                        class6.field84[var91][var92 + var97][var93] = class6.field84[var91][var92 + var97][var93 - 1];
                                                    }
                                                }
                                                if (var92 > 0 && class6.field84[var91][var92 - 1][var93] != 0) {
                                                    class6.field84[var91][var92][var93] = class6.field84[var91][var92 - 1][var93];
                                                } else if (var93 > 0 && class6.field84[var91][var92][var93 - 1] != 0) {
                                                    class6.field84[var91][var92][var93] = class6.field84[var91][var92][var93 - 1];
                                                } else if (var92 > 0 && var93 > 0 && class6.field84[var91][var92 - 1][var93 - 1] != 0) {
                                                    class6.field84[var91][var92][var93] = class6.field84[var91][var92 - 1][var93 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var80++;
                                }
                            }
                            method2(true);
                            method81();
                            method155();
                            class80 var111 = Statics.field2027;
                            class209[] var112 = field304;
                            for (int var113 = 0; var113 < 4; var113++) {
                                for (int var114 = 0; var114 < 104; var114++) {
                                    for (int var115 = 0; var115 < 104; var115++) {
                                        if ((class6.field72[var113][var114][var115] & 0x1) == 1) {
                                            int var116 = var113;
                                            if ((class6.field72[1][var114][var115] & 0x2) == 2) {
                                                var116 = var113 - 1;
                                            }
                                            if (var116 >= 0) {
                                                var112[var116].method3563(var114, var115);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field71 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field71 < -8) {
                                class6.field71 = -8;
                            }
                            if (class6.field71 > 8) {
                                class6.field71 = 8;
                            }
                            class6.field87 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field87 < -16) {
                                class6.field87 = -16;
                            }
                            if (class6.field87 > 16) {
                                class6.field87 = 16;
                            }
                            for (int var117 = 0; var117 < 4; var117++) {
                                byte[][] var118 = Statics.field2134[var117];
                                int var119 = (int) Math.sqrt(5100.0D);
                                int var120 = var119 * 768 >> 8;
                                for (int var121 = 1; var121 < 103; var121++) {
                                    for (int var122 = 1; var122 < 103; var122++) {
                                        int var123 = class6.field84[var117][var122 + 1][var121] - class6.field84[var117][var122 - 1][var121];
                                        int var124 = class6.field84[var117][var122][var121 + 1] - class6.field84[var117][var122][var121 - 1];
                                        int var125 = (int) Math.sqrt((double) (var124 * var124 + var123 * var123 + 65536));
                                        int var126 = (var123 << 8) / var125;
                                        int var127 = 65536 / var125;
                                        int var128 = (var124 << 8) / var125;
                                        int var129 = (var128 * -50 + var126 * -50 + var127 * -10) / var120 + 96;
                                        int var130 = (var118[var122][var121] >> 1) + (var118[var122][var121 + 1] >> 3) + (var118[var122][var121 - 1] >> 2) + (var118[var122 - 1][var121] >> 2) + (var118[var122 + 1][var121] >> 3);
                                        Statics.field77[var122][var121] = var129 - var130;
                                    }
                                }
                                for (int var131 = 0; var131 < 104; var131++) {
                                    Statics.field78[var131] = 0;
                                    Statics.field2126[var131] = 0;
                                    Statics.field2144[var131] = 0;
                                    Statics.field643[var131] = 0;
                                    Statics.field1898[var131] = 0;
                                }
                                for (int var132 = -5; var132 < 109; var132++) {
                                    for (int var133 = 0; var133 < 104; var133++) {
                                        int var134 = var132 + 5;
                                        if (var134 >= 0 && var134 < 104) {
                                            int var135 = Statics.field74[var117][var134][var133] & 0xFF;
                                            if (var135 > 0) {
                                                class38 var136 = class38.method803(var135 - 1);
                                                Statics.field78[var133] += var136.field898;
                                                Statics.field2126[var133] += var136.field899;
                                                Statics.field2144[var133] += var136.field900;
                                                Statics.field643[var133] += var136.field901;
                                                var10002 = Statics.field1898[var133]++;
                                            }
                                        }
                                        int var137 = var132 - 5;
                                        if (var137 >= 0 && var137 < 104) {
                                            int var138 = Statics.field74[var117][var137][var133] & 0xFF;
                                            if (var138 > 0) {
                                                class38 var139 = class38.method803(var138 - 1);
                                                Statics.field78[var133] -= var139.field898;
                                                Statics.field2126[var133] -= var139.field899;
                                                Statics.field2144[var133] -= var139.field900;
                                                Statics.field643[var133] -= var139.field901;
                                                var10002 = Statics.field1898[var133]--;
                                            }
                                        }
                                    }
                                    if (var132 >= 1 && var132 < 103) {
                                        int var140 = 0;
                                        int var141 = 0;
                                        int var142 = 0;
                                        int var143 = 0;
                                        int var144 = 0;
                                        for (int var145 = -5; var145 < 109; var145++) {
                                            int var146 = var145 + 5;
                                            if (var146 >= 0 && var146 < 104) {
                                                var140 += Statics.field78[var146];
                                                var141 += Statics.field2126[var146];
                                                var142 += Statics.field2144[var146];
                                                var143 += Statics.field643[var146];
                                                var144 += Statics.field1898[var146];
                                            }
                                            int var147 = var145 - 5;
                                            if (var147 >= 0 && var147 < 104) {
                                                var140 -= Statics.field78[var147];
                                                var141 -= Statics.field2126[var147];
                                                var142 -= Statics.field2144[var147];
                                                var143 -= Statics.field643[var147];
                                                var144 -= Statics.field1898[var147];
                                            }
                                            if (var145 >= 1 && var145 < 103 && (!field249 || (class6.field72[0][var132][var145] & 0x2) != 0 || (class6.field72[var117][var132][var145] & 0x10) == 0 && class6.method2396(var117, var132, var145) == field298)) {
                                                if (var117 < class6.field83) {
                                                    class6.field83 = var117;
                                                }
                                                int var148 = Statics.field74[var117][var132][var145] & 0xFF;
                                                int var149 = Statics.field2512[var117][var132][var145] & 0xFF;
                                                if (var148 > 0 || var149 > 0) {
                                                    int var150 = class6.field84[var117][var132][var145];
                                                    int var151 = class6.field84[var117][var132 + 1][var145];
                                                    int var152 = class6.field84[var117][var132 + 1][var145 + 1];
                                                    int var153 = class6.field84[var117][var132][var145 + 1];
                                                    int var154 = Statics.field77[var132][var145];
                                                    int var155 = Statics.field77[var132 + 1][var145];
                                                    int var156 = Statics.field77[var132 + 1][var145 + 1];
                                                    int var157 = Statics.field77[var132][var145 + 1];
                                                    int var158 = -1;
                                                    int var159 = -1;
                                                    if (var148 > 0) {
                                                        int var160 = var140 * 256 / var143;
                                                        int var161 = var141 / var144;
                                                        int var162 = var142 / var144;
                                                        var158 = class6.method736(var160, var161, var162);
                                                        int var163 = class6.field71 + var160 & 0xFF;
                                                        int var164 = class6.field87 + var162;
                                                        if (var164 < 0) {
                                                            var164 = 0;
                                                        } else if (var164 > 255) {
                                                            var164 = 255;
                                                        }
                                                        var159 = class6.method736(var163, var161, var164);
                                                    }
                                                    if (var117 > 0) {
                                                        boolean var165 = true;
                                                        if (var148 == 0 && Statics.field75[var117][var132][var145] != 0) {
                                                            var165 = false;
                                                        }
                                                        if (var149 > 0 && !class42.method2579(var149 - 1).field977) {
                                                            var165 = false;
                                                        }
                                                        if (var165 && var150 == var151 && var150 == var152 && var150 == var153) {
                                                            Statics.field88[var117][var132][var145] |= 0x924;
                                                        }
                                                    }
                                                    int var166 = 0;
                                                    if (var159 != -1) {
                                                        var166 = class85.field1499[class6.method553(var159, 96)];
                                                    }
                                                    if (var149 == 0) {
                                                        var111.method1606(var117, var132, var145, 0, 0, -1, var150, var151, var152, var153, class6.method553(var158, var154), class6.method553(var158, var155), class6.method553(var158, var156), class6.method553(var158, var157), 0, 0, 0, 0, var166, 0);
                                                    } else {
                                                        int var167 = Statics.field75[var117][var132][var145] + 1;
                                                        byte var168 = Statics.field76[var117][var132][var145];
                                                        class42 var169 = class42.method2579(var149 - 1);
                                                        int var170 = var169.field976;
                                                        int var171;
                                                        int var172;
                                                        if (var170 >= 0) {
                                                            var171 = Statics.field1497.method1856(var170);
                                                            var172 = -1;
                                                        } else if (var169.field982 == 16711935) {
                                                            var172 = -2;
                                                            var170 = -1;
                                                            var171 = -2;
                                                        } else {
                                                            var172 = class6.method736(var169.field979, var169.field980, var169.field981);
                                                            int var173 = class6.field71 + var169.field979 & 0xFF;
                                                            int var174 = class6.field87 + var169.field981;
                                                            if (var174 < 0) {
                                                                var174 = 0;
                                                            } else if (var174 > 255) {
                                                                var174 = 255;
                                                            }
                                                            var171 = class6.method736(var173, var169.field980, var174);
                                                        }
                                                        int var175 = 0;
                                                        if (var171 != -2) {
                                                            var175 = class85.field1499[class6.method1330(var171, 96)];
                                                        }
                                                        if (var169.field978 != -1) {
                                                            int var176 = class6.field71 + var169.field985 & 0xFF;
                                                            int var177 = class6.field87 + var169.field986;
                                                            if (var177 < 0) {
                                                                var177 = 0;
                                                            } else if (var177 > 255) {
                                                                var177 = 255;
                                                            }
                                                            int var178 = class6.method736(var176, var169.field983, var177);
                                                            var175 = class85.field1499[class6.method1330(var178, 96)];
                                                        }
                                                        var111.method1606(var117, var132, var145, var167, var168, var170, var150, var151, var152, var153, class6.method553(var158, var154), class6.method553(var158, var155), class6.method553(var158, var156), class6.method553(var158, var157), class6.method1330(var172, var154), class6.method1330(var172, var155), class6.method1330(var172, var156), class6.method1330(var172, var157), var166, var175);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var179 = 1; var179 < 103; var179++) {
                                    for (int var180 = 1; var180 < 103; var180++) {
                                        var111.method1605(var117, var180, var179, class6.method2396(var117, var180, var179));
                                    }
                                }
                                Statics.field74[var117] = (byte[][]) null;
                                Statics.field2512[var117] = (byte[][]) null;
                                Statics.field75[var117] = (byte[][]) null;
                                Statics.field76[var117] = (byte[][]) null;
                                Statics.field2134[var117] = (byte[][]) null;
                            }
                            var111.method1632(-50, -10, -50);
                            for (int var181 = 0; var181 < 104; var181++) {
                                for (int var182 = 0; var182 < 104; var182++) {
                                    if ((class6.field72[1][var181][var182] & 0x2) == 2) {
                                        var111.method1603(var181, var182);
                                    }
                                }
                            }
                            int var183 = 1;
                            int var184 = 2;
                            int var185 = 4;
                            for (int var186 = 0; var186 < 4; var186++) {
                                if (var186 > 0) {
                                    var183 <<= 0x3;
                                    var184 <<= 0x3;
                                    var185 <<= 0x3;
                                }
                                for (int var187 = 0; var187 <= var186; var187++) {
                                    for (int var188 = 0; var188 <= 104; var188++) {
                                        for (int var189 = 0; var189 <= 104; var189++) {
                                            if ((Statics.field88[var187][var189][var188] & var183) != 0) {
                                                int var190 = var188;
                                                int var191 = var188;
                                                int var192 = var187;
                                                int var193 = var187;
                                                while (var190 > 0 && (Statics.field88[var187][var189][var190 - 1] & var183) != 0) {
                                                    var190--;
                                                }
                                                while (var191 < 104 && (Statics.field88[var187][var189][var191 + 1] & var183) != 0) {
                                                    var191++;
                                                }
                                                label3419: while (var192 > 0) {
                                                    for (int var194 = var190; var194 <= var191; var194++) {
                                                        if ((Statics.field88[var192 - 1][var189][var194] & var183) == 0) {
                                                            break label3419;
                                                        }
                                                    }
                                                    var192--;
                                                }
                                                label3408: while (var193 < var186) {
                                                    for (int var195 = var190; var195 <= var191; var195++) {
                                                        if ((Statics.field88[var193 + 1][var189][var195] & var183) == 0) {
                                                            break label3408;
                                                        }
                                                    }
                                                    var193++;
                                                }
                                                int var196 = (var193 + 1 - var192) * (var191 - var190 + 1);
                                                if (var196 >= 8) {
                                                    short var197 = 240;
                                                    int var198 = class6.field84[var193][var189][var190] - var197;
                                                    int var199 = class6.field84[var192][var189][var190];
                                                    class80.method1604(var186, 1, var189 * 128, var189 * 128, var190 * 128, var191 * 128 + 128, var198, var199);
                                                    for (int var200 = var192; var200 <= var193; var200++) {
                                                        for (int var201 = var190; var201 <= var191; var201++) {
                                                            Statics.field88[var200][var189][var201] &= ~var183;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field88[var187][var189][var188] & var184) != 0) {
                                                int var202 = var189;
                                                int var203 = var189;
                                                int var204 = var187;
                                                int var205 = var187;
                                                while (var202 > 0 && (Statics.field88[var187][var202 - 1][var188] & var184) != 0) {
                                                    var202--;
                                                }
                                                while (var203 < 104 && (Statics.field88[var187][var203 + 1][var188] & var184) != 0) {
                                                    var203++;
                                                }
                                                label3472: while (var204 > 0) {
                                                    for (int var206 = var202; var206 <= var203; var206++) {
                                                        if ((Statics.field88[var204 - 1][var206][var188] & var184) == 0) {
                                                            break label3472;
                                                        }
                                                    }
                                                    var204--;
                                                }
                                                label3461: while (var205 < var186) {
                                                    for (int var207 = var202; var207 <= var203; var207++) {
                                                        if ((Statics.field88[var205 + 1][var207][var188] & var184) == 0) {
                                                            break label3461;
                                                        }
                                                    }
                                                    var205++;
                                                }
                                                int var208 = (var205 + 1 - var204) * (var203 - var202 + 1);
                                                if (var208 >= 8) {
                                                    short var209 = 240;
                                                    int var210 = class6.field84[var205][var202][var188] - var209;
                                                    int var211 = class6.field84[var204][var202][var188];
                                                    class80.method1604(var186, 2, var202 * 128, var203 * 128 + 128, var188 * 128, var188 * 128, var210, var211);
                                                    for (int var212 = var204; var212 <= var205; var212++) {
                                                        for (int var213 = var202; var213 <= var203; var213++) {
                                                            Statics.field88[var212][var213][var188] &= ~var184;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field88[var187][var189][var188] & var185) != 0) {
                                                int var214 = var189;
                                                int var215 = var189;
                                                int var216 = var188;
                                                int var217 = var188;
                                                while (var216 > 0 && (Statics.field88[var187][var189][var216 - 1] & var185) != 0) {
                                                    var216--;
                                                }
                                                while (var217 < 104 && (Statics.field88[var187][var189][var217 + 1] & var185) != 0) {
                                                    var217++;
                                                }
                                                label3525: while (var214 > 0) {
                                                    for (int var218 = var216; var218 <= var217; var218++) {
                                                        if ((Statics.field88[var187][var214 - 1][var218] & var185) == 0) {
                                                            break label3525;
                                                        }
                                                    }
                                                    var214--;
                                                }
                                                label3514: while (var215 < 104) {
                                                    for (int var219 = var216; var219 <= var217; var219++) {
                                                        if ((Statics.field88[var187][var215 + 1][var219] & var185) == 0) {
                                                            break label3514;
                                                        }
                                                    }
                                                    var215++;
                                                }
                                                if ((var215 - var214 + 1) * (var217 - var216 + 1) >= 4) {
                                                    int var220 = class6.field84[var187][var214][var216];
                                                    class80.method1604(var186, 4, var214 * 128, var215 * 128 + 128, var216 * 128, var217 * 128 + 128, var220, var220);
                                                    for (int var221 = var214; var221 <= var215; var221++) {
                                                        for (int var222 = var216; var222 <= var217; var222++) {
                                                            Statics.field88[var187][var221][var222] &= ~var185;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2(true);
                            int var223 = class6.field83;
                            if (var223 > Statics.field170) {
                                var223 = Statics.field170;
                            }
                            if (var223 < Statics.field170 - 1) {
                                int var224 = Statics.field170 - 1;
                            }
                            if (field249) {
                                Statics.field2027.method1602(class6.field83);
                            } else {
                                Statics.field2027.method1602(0);
                            }
                            for (int var225 = 0; var225 < 104; var225++) {
                                for (int var226 = 0; var226 < 104; var226++) {
                                    method3148(var225, var226);
                                }
                            }
                            method155();
                            method2460();
                            class37.field843.method3157();
                            if (Statics.field1083 != null) {
                                field454.method2357(229);
                                field454.method2134(1057001181);
                            }
                            if (!field329) {
                                int var227 = (Statics.field1822 - 6) / 8;
                                int var228 = (Statics.field1822 + 6) / 8;
                                int var229 = (Statics.field641 - 6) / 8;
                                int var230 = (Statics.field641 + 6) / 8;
                                for (int var231 = var227 - 1; var231 <= var228 + 1; var231++) {
                                    for (int var232 = var229 - 1; var232 <= var230 + 1; var232++) {
                                        if (var231 < var227 || var231 > var228 || var232 < var229 || var232 > var230) {
                                            Statics.field519.method2740("m" + var231 + "_" + var232);
                                            Statics.field519.method2740("l" + var231 + "_" + var232);
                                        }
                                    }
                                }
                            }
                            method2355(30);
                            method155();
                            class6.method2052();
                            field454.method2357(144);
                            Statics.field646.method2467();
                            for (int var233 = 0; var233 < 32; var233++) {
                                field2058[var233] = 0L;
                            }
                            for (int var234 = 0; var234 < 32; var234++) {
                                field2059[var234] = 0L;
                            }
                            Statics.field930 = 0;
                        } else {
                            field303 = 2;
                        }
                    } else {
                        field303 = 1;
                    }
                }
                if (field270 == 30) {
                    if (field299 > 1) {
                        field299--;
                    }
                    if (field293 > 0) {
                        field293--;
                    }
                    if (field490) {
                        field490 = false;
                        if (field293 > 0) {
                            method447();
                        } else {
                            method2355(40);
                            Statics.field988 = Statics.field59;
                            Statics.field59 = null;
                        }
                    } else {
                        if (!field250) {
                            field395[0] = class145.field2401;
                            field396[0] = "";
                            field393[0] = 1006;
                            field390 = 1;
                        }
                        for (int var235 = 0; var235 < 100; var235++) {
                            boolean var236;
                            if (Statics.field59 == null) {
                                var236 = false;
                            } else {
                                label4193: {
                                    try {
                                        int var237 = Statics.field59.method2589();
                                        if (var237 == 0) {
                                            var236 = false;
                                            break label4193;
                                        }
                                        if (field290 == -1) {
                                            Statics.field59.method2606(field411.field1842, 0, 1);
                                            field411.field1841 = 0;
                                            field290 = field411.method2359();
                                            field289 = class169.field2826[field290];
                                            var237--;
                                        }
                                        if (field289 == -1) {
                                            if (var237 <= 0) {
                                                var236 = false;
                                                break label4193;
                                            }
                                            Statics.field59.method2606(field411.field1842, 0, 1);
                                            field289 = field411.field1842[0] & 0xFF;
                                            var237--;
                                        }
                                        if (field289 == -2) {
                                            if (var237 <= 1) {
                                                var236 = false;
                                                break label4193;
                                            }
                                            Statics.field59.method2606(field411.field1842, 0, 2);
                                            field411.field1841 = 0;
                                            field289 = field411.method2124();
                                            var237 -= 2;
                                        }
                                        if (var237 < field289) {
                                            var236 = false;
                                            break label4193;
                                        }
                                        field411.field1841 = 0;
                                        Statics.field59.method2606(field411.field1842, 0, field289);
                                        field511 = 0;
                                        field296 = field397;
                                        field397 = field427;
                                        field427 = field290;
                                        if (field290 == 179) {
                                            int var238 = field411.method2135();
                                            boolean var239 = field411.method2122() == 1;
                                            String var240 = "";
                                            boolean var241 = false;
                                            if (var239) {
                                                var240 = field411.method2130();
                                                if (method2702(var240)) {
                                                    var241 = true;
                                                }
                                            }
                                            String var242 = field411.method2130();
                                            if (!var241) {
                                                class10.method486(var238, var240, var242);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 200) {
                                            field299 = field411.method2124() * 30;
                                            field444 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 124) {
                                            int var243 = field289 + field411.field1841;
                                            int var244 = field411.method2124();
                                            int var245 = field411.method2124();
                                            if (field408 != var244) {
                                                field408 = var244;
                                                method2582(field408);
                                                class33.method140(field408);
                                                for (int var246 = 0; var246 < 100; var246++) {
                                                    field506[var246] = true;
                                                }
                                            }
                                            while (var245-- > 0) {
                                                int var247 = field411.method2127();
                                                int var248 = field411.method2124();
                                                int var249 = field411.method2122();
                                                class4 var250 = (class4) field409.method3192((long) var247);
                                                if (var250 != null && var250.field60 != var248) {
                                                    method1872(var250, true);
                                                    var250 = null;
                                                }
                                                if (var250 == null) {
                                                    class4 var251 = new class4();
                                                    var251.field60 = var248;
                                                    var251.field55 = var249;
                                                    field409.method3193(var251, (long) var247);
                                                    method2582(var248);
                                                    class33.method140(var248);
                                                    class155 var252 = class155.method1383(var247);
                                                    if (var252 != null) {
                                                        method137(var252);
                                                    }
                                                    if (field495 != null) {
                                                        method137(field495);
                                                        field495 = null;
                                                    }
                                                    method103();
                                                    if (field408 != -1) {
                                                        method139(field408, 1);
                                                    }
                                                    var250 = var251;
                                                }
                                                var250.field56 = true;
                                            }
                                            for (class4 var254 = (class4) field409.method3205(); var254 != null; var254 = (class4) field409.method3196()) {
                                                if (var254.field56) {
                                                    var254.field56 = false;
                                                } else {
                                                    method1872(var254, true);
                                                }
                                            }
                                            field451 = new class177(512);
                                            while (field411.field1841 < var243) {
                                                int var255 = field411.method2127();
                                                int var256 = field411.method2124();
                                                int var257 = field411.method2124();
                                                int var258 = field411.method2127();
                                                for (int var259 = var256; var259 <= var257; var259++) {
                                                    long var260 = ((long) var255 << 32) + (long) var259;
                                                    field451.method3193(new class182(var258), var260);
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 55) {
                                            Statics.field620 = field411.method2122();
                                            Statics.field175 = field411.method2172();
                                            for (int var262 = Statics.field175; var262 < Statics.field175 + 8; var262++) {
                                                for (int var263 = Statics.field620; var263 < Statics.field620 + 8; var263++) {
                                                    if (field376[Statics.field170][var262][var263] != null) {
                                                        field376[Statics.field170][var262][var263] = null;
                                                        method3148(var262, var263);
                                                    }
                                                }
                                            }
                                            for (class15 var264 = (class15) field291.method3226(); var264 != null; var264 = (class15) field291.method3231()) {
                                                if (var264.field204 >= Statics.field175 && var264.field204 < Statics.field175 + 8 && var264.field207 >= Statics.field620 && var264.field207 < Statics.field620 + 8 && Statics.field170 == var264.field205) {
                                                    var264.field213 = 0;
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 46) {
                                            method24();
                                            field283 = field411.method2122();
                                            field444 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 220) {
                                            for (int var265 = 0; var265 < class157.field2678.length; var265++) {
                                                if (class157.field2678[var265] != class157.field2677[var265]) {
                                                    class157.field2678[var265] = class157.field2677[var265];
                                                    method509(var265);
                                                    field433[++field434 - 1 & 0x1F] = var265;
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 248) {
                                            if (field408 != -1) {
                                                method139(field408, 0);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 161) {
                                            method481(true);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 84) {
                                            field463 = field411.method2122();
                                            field464 = field411.method2122();
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 140) {
                                            int var266 = field411.method2162();
                                            int var267 = field411.method2124();
                                            int var268 = field411.method2122();
                                            class4 var269 = (class4) field409.method3192((long) var266);
                                            if (var269 != null) {
                                                method1872(var269, var269.field60 != var267);
                                            }
                                            class4 var270 = new class4();
                                            var270.field60 = var267;
                                            var270.field55 = var268;
                                            field409.method3193(var270, (long) var266);
                                            method2582(var267);
                                            class33.method140(var267);
                                            class155 var271 = class155.method1383(var266);
                                            if (var271 != null) {
                                                method137(var271);
                                            }
                                            if (field495 != null) {
                                                method137(field495);
                                                field495 = null;
                                            }
                                            method103();
                                            if (field408 != -1) {
                                                method139(field408, 1);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 121) {
                                            int var272 = field411.method2127();
                                            boolean var273 = field411.method2172() == 1;
                                            class155 var274 = class155.method1383(var272);
                                            if (var274.field2616 != var273) {
                                                var274.field2616 = var273;
                                                method137(var274);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 39) {
                                            class23 var275 = new class23();
                                            var275.field578 = field411.method2130();
                                            var275.field577 = field411.method2124();
                                            int var276 = field411.method2127();
                                            var275.field579 = var276;
                                            method2355(45);
                                            Statics.field59.method2593();
                                            Statics.field59 = null;
                                            class29.method500(var275);
                                            field290 = -1;
                                            var236 = false;
                                            break label4193;
                                        }
                                        if (field290 == 25) {
                                            method24();
                                            field412 = field411.method2125();
                                            field444 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 205) {
                                            int var277 = field411.method2127();
                                            int var278 = field411.method2124();
                                            if (var277 < -70000) {
                                                var278 += 32768;
                                            }
                                            class155 var279;
                                            if (var277 >= 0) {
                                                var279 = class155.method1383(var277);
                                            } else {
                                                var279 = null;
                                            }
                                            if (var279 != null) {
                                                for (int var280 = 0; var280 < var279.field2594.length; var280++) {
                                                    var279.field2594[var280] = 0;
                                                    var279.field2583[var280] = 0;
                                                }
                                            }
                                            class14 var281 = (class14) class14.field197.method3192((long) var278);
                                            if (var281 != null) {
                                                for (int var282 = 0; var282 < var281.field194.length; var282++) {
                                                    var281.field194[var282] = -1;
                                                    var281.field193[var282] = 0;
                                                }
                                            }
                                            int var283 = field411.method2124();
                                            for (int var284 = 0; var284 < var283; var284++) {
                                                int var285 = field411.method2150();
                                                int var286 = field411.method2122();
                                                if (var286 == 255) {
                                                    var286 = field411.method2201();
                                                }
                                                if (var279 != null && var284 < var279.field2594.length) {
                                                    var279.field2594[var284] = var285;
                                                    var279.field2583[var284] = var286;
                                                }
                                                class14.method127(var278, var284, var285 - 1, var286);
                                            }
                                            if (var279 != null) {
                                                method137(var279);
                                            }
                                            method24();
                                            field466[++field436 - 1 & 0x1F] = var278 & 0x7FFF;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 230) {
                                            int var287 = field411.method2156();
                                            if (var287 == 65535) {
                                                var287 = -1;
                                            }
                                            int var288 = field411.method2196();
                                            int var289 = field411.method2162();
                                            int var290 = field411.method2150();
                                            if (var290 == 65535) {
                                                var290 = -1;
                                            }
                                            for (int var291 = var287; var291 <= var290; var291++) {
                                                long var292 = ((long) var289 << 32) + (long) var291;
                                                class189 var294 = field451.method3192(var292);
                                                if (var294 != null) {
                                                    var294.method3324();
                                                }
                                                field451.method3193(new class182(var288), var292);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 221) {
                                            field494 = false;
                                            for (int var295 = 0; var295 < 5; var295++) {
                                                field333[var295] = false;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 78) {
                                            for (int var296 = 0; var296 < field365.length; var296++) {
                                                if (field365[var296] != null) {
                                                    field365[var296].field736 = -1;
                                                }
                                            }
                                            for (int var297 = 0; var297 < field498.length; var297++) {
                                                if (field498[var297] != null) {
                                                    field498[var297].field736 = -1;
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 75) {
                                            String var298 = field411.method2130();
                                            long var299 = (long) field411.method2124();
                                            long var301 = (long) field411.method2126();
                                            class140 var303 = (class140) class100.method1(class140.method138(), field411.method2122());
                                            long var304 = (var299 << 32) + var301;
                                            boolean var306 = false;
                                            for (int var307 = 0; var307 < 100; var307++) {
                                                if (field488[var307] == var304) {
                                                    var306 = true;
                                                    break;
                                                }
                                            }
                                            if (method2702(var298)) {
                                                var306 = true;
                                            }
                                            if (!var306 && field364 == 0) {
                                                field488[field352] = var304;
                                                field352 = (field352 + 1) % 100;
                                                String var308 = class204.method3425(class211.method251(class203.method2513(field411)));
                                                byte var309;
                                                if (var303.field2124) {
                                                    var309 = 7;
                                                } else {
                                                    var309 = 3;
                                                }
                                                if (var303.field2121 == -1) {
                                                    class10.method486(var309, var298, var308);
                                                } else {
                                                    int var311 = var303.field2121;
                                                    String var312 = "<img=" + var311 + ">";
                                                    class10.method486(var309, var312 + var298, var308);
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 176) {
                                            String var313 = field411.method2130();
                                            String var314 = class204.method3425(class211.method251(class203.method2513(field411)));
                                            class10.method486(6, var313, var314);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 18) {
                                            int var315 = field411.method2127();
                                            class155 var316 = class155.method1383(var315);
                                            for (int var317 = 0; var317 < var316.field2594.length; var317++) {
                                                var316.field2594[var317] = -1;
                                                var316.field2594[var317] = 0;
                                            }
                                            method137(var316);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 237) {
                                            int var318 = field411.method2196();
                                            int var319 = field411.method2150();
                                            int var320 = field411.method2124();
                                            int var321 = field411.method2155();
                                            class155 var322 = class155.method1383(var318);
                                            if (var322.field2559 != var321 || var322.field2561 != var320 || var322.field2632 != var319) {
                                                var322.field2559 = var321;
                                                var322.field2561 = var320;
                                                var322.field2632 = var319;
                                                method137(var322);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 198) {
                                            int var323 = field411.method2150();
                                            int var324 = field411.method2196();
                                            class155 var325 = class155.method1383(var324);
                                            if (var325 != null && var325.field2551 == 0) {
                                                if (var323 > var325.field2565 - var325.field2609) {
                                                    var323 = var325.field2565 - var325.field2609;
                                                }
                                                if (var323 < 0) {
                                                    var323 = 0;
                                                }
                                                if (var325.field2563 != var323) {
                                                    var325.field2563 = var323;
                                                    method137(var325);
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 2) {
                                            int var326 = field411.method2155();
                                            if (var326 == 65535) {
                                                var326 = -1;
                                            }
                                            if (var326 == -1 && !field485) {
                                                Statics.field2730.method3062();
                                                class164.field2732 = 1;
                                                Statics.field1022 = null;
                                            } else if (var326 != -1 && field484 != var326 && field483 != 0 && !field485) {
                                                class150 var327 = Statics.field2711;
                                                int var328 = field483;
                                                class164.field2732 = 1;
                                                Statics.field1022 = var327;
                                                Statics.field2032 = var326;
                                                Statics.field226 = 0;
                                                Statics.field2734 = var328;
                                                Statics.field2733 = false;
                                                Statics.field61 = 2;
                                            }
                                            field484 = var326;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 152) {
                                            int var329 = field411.method2158();
                                            int var330 = field411.method2150();
                                            if (var330 == 65535) {
                                                var330 = -1;
                                            }
                                            if (field483 != 0 && var330 != -1) {
                                                class164.method1775(Statics.field232, var330, 0, field483, false);
                                                field485 = true;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 241) {
                                            int var331 = field411.method2127();
                                            class4 var332 = (class4) field409.method3192((long) var331);
                                            if (var332 != null) {
                                                method1872(var332, true);
                                            }
                                            if (field495 != null) {
                                                method137(field495);
                                                field495 = null;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 214) {
                                            method695();
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 13) {
                                            field441 = field432;
                                            if (field289 == 0) {
                                                field472 = null;
                                                field473 = null;
                                                Statics.field2066 = 0;
                                                Statics.field1854 = null;
                                                field290 = -1;
                                                var236 = true;
                                                break label4193;
                                            }
                                            field473 = field411.method2130();
                                            long var333 = field411.method2192();
                                            field472 = class210.method3366(var333);
                                            Statics.field2496 = field411.method2190();
                                            int var335 = field411.method2122();
                                            if (var335 == 255) {
                                                field290 = -1;
                                                var236 = true;
                                                break label4193;
                                            }
                                            Statics.field2066 = var335;
                                            class22[] var336 = new class22[100];
                                            for (int var337 = 0; var337 < Statics.field2066; var337++) {
                                                var336[var337] = new class22();
                                                var336[var337].field570 = field411.method2130();
                                                var336[var337].field565 = class212.method2168(var336[var337].field570, Statics.field247);
                                                var336[var337].field566 = field411.method2124();
                                                var336[var337].field568 = field411.method2190();
                                                field411.method2130();
                                                if (var336[var337].field570.equals(Statics.field695.field48)) {
                                                    Statics.field2928 = var336[var337].field568;
                                                }
                                            }
                                            boolean var338 = false;
                                            int var339 = Statics.field2066;
                                            while (var339 > 0) {
                                                boolean var340 = true;
                                                var339--;
                                                for (int var341 = 0; var341 < var339; var341++) {
                                                    if (var336[var341].field565.compareTo(var336[var341 + 1].field565) > 0) {
                                                        class22 var342 = var336[var341];
                                                        var336[var341] = var336[var341 + 1];
                                                        var336[var341 + 1] = var342;
                                                        var340 = false;
                                                    }
                                                }
                                                if (var340) {
                                                    break;
                                                }
                                            }
                                            Statics.field1854 = var336;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 181) {
                                            class111 var343 = field411;
                                            int var344 = field289;
                                            class191 var345 = new class191();
                                            var345.field2899 = var343.method2122();
                                            var345.field2906 = var343.method2127();
                                            var345.field2903 = new int[var345.field2899];
                                            var345.field2901 = new int[var345.field2899];
                                            var345.field2902 = new Field[var345.field2899];
                                            var345.field2907 = new int[var345.field2899];
                                            var345.field2904 = new Method[var345.field2899];
                                            var345.field2900 = new byte[var345.field2899][][];
                                            for (int var346 = 0; var346 < var345.field2899; var346++) {
                                                try {
                                                    int var347 = var343.method2122();
                                                    if (var347 == 0 || var347 == 1 || var347 == 2) {
                                                        String var348 = var343.method2130();
                                                        String var349 = var343.method2130();
                                                        int var350 = 0;
                                                        if (var347 == 1) {
                                                            var350 = var343.method2127();
                                                        }
                                                        var345.field2903[var346] = var347;
                                                        var345.field2907[var346] = var350;
                                                        if (class192.method2587(var348).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var345.field2902[var346] = class192.method2587(var348).getDeclaredField(var349);
                                                    } else if (var347 == 3 || var347 == 4) {
                                                        String var351 = var343.method2130();
                                                        String var352 = var343.method2130();
                                                        int var353 = var343.method2122();
                                                        String[] var354 = new String[var353];
                                                        for (int var355 = 0; var355 < var353; var355++) {
                                                            var354[var355] = var343.method2130();
                                                        }
                                                        String var356 = var343.method2130();
                                                        byte[][] var357 = new byte[var353][];
                                                        if (var347 == 3) {
                                                            for (int var358 = 0; var358 < var353; var358++) {
                                                                int var359 = var343.method2127();
                                                                var357[var358] = new byte[var359];
                                                                var343.method2189(var357[var358], 0, var359);
                                                            }
                                                        }
                                                        var345.field2903[var346] = var347;
                                                        Class[] var360 = new Class[var353];
                                                        for (int var361 = 0; var361 < var353; var361++) {
                                                            var360[var361] = class192.method2587(var354[var361]);
                                                        }
                                                        Class var362 = class192.method2587(var356);
                                                        if (class192.method2587(var351).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var363 = class192.method2587(var351).getDeclaredMethods();
                                                        Method[] var364 = var363;
                                                        for (int var365 = 0; var365 < var364.length; var365++) {
                                                            Method var366 = var364[var365];
                                                            if (var366.getName().equals(var352)) {
                                                                Class[] var367 = var366.getParameterTypes();
                                                                if (var360.length == var367.length) {
                                                                    boolean var368 = true;
                                                                    for (int var369 = 0; var369 < var360.length; var369++) {
                                                                        if (var360[var369] != var367[var369]) {
                                                                            var368 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var368 && var362 == var366.getReturnType()) {
                                                                        var345.field2904[var346] = var366;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var345.field2900[var346] = var357;
                                                    }
                                                } catch (ClassNotFoundException var655) {
                                                    var345.field2901[var346] = -1;
                                                } catch (SecurityException var656) {
                                                    var345.field2901[var346] = -2;
                                                } catch (NullPointerException var657) {
                                                    var345.field2901[var346] = -3;
                                                } catch (Exception var658) {
                                                    var345.field2901[var346] = -4;
                                                } catch (Throwable var659) {
                                                    var345.field2901[var346] = -5;
                                                }
                                            }
                                            class192.field2908.method3274(var345);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 122) {
                                            method2677(false);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 106) {
                                            int var375 = field411.method2148();
                                            int var376 = field411.method2148();
                                            int var377 = field411.method2148();
                                            Statics.field170 = var377 >> 1;
                                            Statics.field695.method573(var375, var376, (var377 & 0x1) == 1);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 96) {
                                            int var378 = field411.method2196();
                                            String var379 = field411.method2130();
                                            class155 var380 = class155.method1383(var378);
                                            if (!var379.equals(var380.field2597)) {
                                                var380.field2597 = var379;
                                                method137(var380);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 69) {
                                            int var381 = field411.method2150();
                                            class14.method2708(var381);
                                            field466[++field436 - 1 & 0x1F] = var381 & 0x7FFF;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 235) {
                                            int var382 = field411.method2124();
                                            int var383 = field411.method2122();
                                            int var384 = field411.method2124();
                                            if (field314 != 0 && var383 != 0 && field341 < 50) {
                                                field489[field341] = var382;
                                                field282[field341] = var383;
                                                field383[field341] = var384;
                                                field260[field341] = null;
                                                field342[field341] = 0;
                                                field341++;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 149) {
                                            method24();
                                            int var388 = field411.method2148();
                                            int var389 = field411.method2122();
                                            int var390 = field411.method2201();
                                            field386[var388] = var390;
                                            field384[var388] = var389;
                                            field385[var388] = 1;
                                            for (int var391 = 0; var391 < 98; var391++) {
                                                if (var390 >= class143.field2153[var391]) {
                                                    field385[var388] = var391 + 2;
                                                }
                                            }
                                            field414[++field449 - 1 & 0x1F] = var388;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 226) {
                                            int var392 = field411.method2238();
                                            int var393 = field411.method2201();
                                            int var394 = field411.method2238();
                                            class155 var395 = class155.method1383(var393);
                                            int var396 = var395.field2556 + var392;
                                            int var397 = var395.field2557 + var394;
                                            if (var395.field2601 != var396 || var395.field2555 != var397) {
                                                var395.field2601 = var396;
                                                var395.field2555 = var397;
                                                method137(var395);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 116) {
                                            int var398 = field411.method2127();
                                            int var399 = field411.method2155();
                                            int var400 = field411.method2156();
                                            class155 var401 = class155.method1383(var398);
                                            var401.field2593 = (var400 << 16) + var399;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 89) {
                                            int var402 = field411.method2124();
                                            field408 = var402;
                                            method2582(var402);
                                            class33.method140(field408);
                                            for (int var403 = 0; var403 < 100; var403++) {
                                                field506[var403] = true;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 158) {
                                            int var404 = field411.method2127();
                                            int var405 = field411.method2124();
                                            class155 var406 = class155.method1383(var404);
                                            if (var406.field2581 != 1 || var406.field2582 != var405) {
                                                var406.field2581 = 1;
                                                var406.field2582 = var405;
                                                method137(var406);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 231) {
                                            Statics.field620 = field411.method2154();
                                            Statics.field175 = field411.method2172();
                                            while (field411.field1841 < field289) {
                                                field290 = field411.method2122();
                                                method2694();
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 232) {
                                            byte var407 = field411.method2149();
                                            int var408 = field411.method2150();
                                            class157.field2677[var408] = var407;
                                            if (class157.field2678[var408] != var407) {
                                                class157.field2678[var408] = var407;
                                                method509(var408);
                                            }
                                            field433[++field434 - 1 & 0x1F] = var408;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 100) {
                                            String var409 = field411.method2130();
                                            int var410 = field411.method2124();
                                            byte var411 = field411.method2190();
                                            boolean var412 = false;
                                            if (var411 == -128) {
                                                var412 = true;
                                            }
                                            if (var412) {
                                                if (Statics.field2066 == 0) {
                                                    field290 = -1;
                                                    var236 = true;
                                                    break label4193;
                                                }
                                                boolean var413 = false;
                                                int var414;
                                                for (var414 = 0; var414 < Statics.field2066 && (!Statics.field1854[var414].field570.equals(var409) || Statics.field1854[var414].field566 != var410); var414++) {
                                                }
                                                if (var414 < Statics.field2066) {
                                                    while (var414 < Statics.field2066 - 1) {
                                                        Statics.field1854[var414] = Statics.field1854[var414 + 1];
                                                        var414++;
                                                    }
                                                    Statics.field2066--;
                                                    Statics.field1854[Statics.field2066] = null;
                                                }
                                            } else {
                                                field411.method2130();
                                                class22 var415 = new class22();
                                                var415.field570 = var409;
                                                var415.field565 = class212.method2168(var415.field570, Statics.field247);
                                                var415.field566 = var410;
                                                var415.field568 = var411;
                                                int var416;
                                                for (var416 = Statics.field2066 - 1; var416 >= 0; var416--) {
                                                    int var417 = Statics.field1854[var416].field565.compareTo(var415.field565);
                                                    if (var417 == 0) {
                                                        Statics.field1854[var416].field566 = var410;
                                                        Statics.field1854[var416].field568 = var411;
                                                        if (var409.equals(Statics.field695.field48)) {
                                                            Statics.field2928 = var411;
                                                        }
                                                        field441 = field432;
                                                        field290 = -1;
                                                        var236 = true;
                                                        break label4193;
                                                    }
                                                    if (var417 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field2066 >= Statics.field1854.length) {
                                                    field290 = -1;
                                                    var236 = true;
                                                    break label4193;
                                                }
                                                for (int var418 = Statics.field2066 - 1; var418 > var416; var418--) {
                                                    Statics.field1854[var418 + 1] = Statics.field1854[var418];
                                                }
                                                if (Statics.field2066 == 0) {
                                                    Statics.field1854 = new class22[100];
                                                }
                                                Statics.field1854[var416 + 1] = var415;
                                                Statics.field2066++;
                                                if (var409.equals(Statics.field695.field48)) {
                                                    Statics.field2928 = var411;
                                                }
                                            }
                                            field441 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 11) {
                                            int var419 = field411.method2196();
                                            class155 var420 = class155.method1383(var419);
                                            var420.field2581 = 3;
                                            var420.field2582 = Statics.field695.field36.method2914();
                                            method137(var420);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 14) {
                                            String var421 = field411.method2130();
                                            Object[] var422 = new Object[var421.length() + 1];
                                            for (int var423 = var421.length() - 1; var423 >= 0; var423--) {
                                                if (var421.charAt(var423) == 's') {
                                                    var422[var423 + 1] = field411.method2130();
                                                } else {
                                                    var422[var423 + 1] = Integer.valueOf(field411.method2127());
                                                }
                                            }
                                            var422[0] = Integer.valueOf(field411.method2127());
                                            class1 var424 = new class1();
                                            var424.field8 = var422;
                                            class33.method561(var424, 200000);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 74) {
                                            boolean var425 = field411.method2122() == 1;
                                            if (var425) {
                                                Statics.field997 = class104.method567() - field411.method2192();
                                                Statics.field2679 = new class202(field411, true);
                                            } else {
                                                Statics.field2679 = null;
                                            }
                                            field443 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 60) {
                                            field494 = true;
                                            Statics.field1667 = field411.method2122();
                                            Statics.field2897 = field411.method2122();
                                            Statics.field1860 = field411.method2124();
                                            Statics.field178 = field411.method2122();
                                            Statics.field1091 = field411.method2122();
                                            if (Statics.field1091 >= 100) {
                                                Statics.field1909 = Statics.field1667 * 128 + 64;
                                                Statics.field1985 = Statics.field2897 * 128 + 64;
                                                Statics.field1586 = method2060(Statics.field1909, Statics.field1985, Statics.field170) - Statics.field1860;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 47) {
                                            field262 = field411.method2122();
                                            if (field262 == 1) {
                                                field420 = field411.method2124();
                                            }
                                            if (field262 >= 2 && field262 <= 6) {
                                                if (field262 == 2) {
                                                    field268 = 64;
                                                    field269 = 64;
                                                }
                                                if (field262 == 3) {
                                                    field268 = 0;
                                                    field269 = 64;
                                                }
                                                if (field262 == 4) {
                                                    field268 = 128;
                                                    field269 = 64;
                                                }
                                                if (field262 == 5) {
                                                    field268 = 64;
                                                    field269 = 0;
                                                }
                                                if (field262 == 6) {
                                                    field268 = 64;
                                                    field269 = 128;
                                                }
                                                field262 = 2;
                                                field265 = field411.method2124();
                                                field368 = field411.method2124();
                                                field267 = field411.method2122();
                                            }
                                            if (field262 == 10) {
                                                field462 = field411.method2124();
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 92) {
                                            while (field411.field1841 < field289) {
                                                int var426 = field411.method2122();
                                                boolean var427 = (var426 & 0x1) == 1;
                                                String var428 = field411.method2130();
                                                String var429 = field411.method2130();
                                                field411.method2130();
                                                for (int var430 = 0; var430 < field467; var430++) {
                                                    class8 var431 = field505[var430];
                                                    if (var427) {
                                                        if (var429.equals(var431.field123)) {
                                                            var431.field123 = var428;
                                                            var431.field127 = var429;
                                                            var428 = null;
                                                            break;
                                                        }
                                                    } else if (var428.equals(var431.field123)) {
                                                        var431.field123 = var428;
                                                        var431.field127 = var429;
                                                        var428 = null;
                                                        break;
                                                    }
                                                }
                                                if (var428 != null && field467 < 400) {
                                                    class8 var432 = new class8();
                                                    field505[field467] = var432;
                                                    var432.field123 = var428;
                                                    var432.field127 = var429;
                                                    field467++;
                                                }
                                            }
                                            field320 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 202) {
                                            String var433 = field411.method2130();
                                            long var434 = field411.method2192();
                                            long var436 = (long) field411.method2124();
                                            long var438 = (long) field411.method2126();
                                            class140 var440 = (class140) class100.method1(class140.method138(), field411.method2122());
                                            long var441 = (var436 << 32) + var438;
                                            boolean var443 = false;
                                            for (int var444 = 0; var444 < 100; var444++) {
                                                if (field488[var444] == var441) {
                                                    var443 = true;
                                                    break;
                                                }
                                            }
                                            if (var440.field2123 && method2702(var433)) {
                                                var443 = true;
                                            }
                                            if (!var443 && field364 == 0) {
                                                field488[field352] = var441;
                                                field352 = (field352 + 1) % 100;
                                                String var445 = class204.method3425(class211.method251(class203.method2513(field411)));
                                                if (var440.field2121 == -1) {
                                                    class10.method887(9, var433, var445, class210.method3591(var434));
                                                } else {
                                                    int var446 = var440.field2121;
                                                    String var447 = "<img=" + var446 + ">";
                                                    class10.method887(9, var447 + var433, var445, class210.method3591(var434));
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 132) {
                                            field494 = true;
                                            Statics.field520 = field411.method2122();
                                            Statics.field1308 = field411.method2122();
                                            Statics.field1924 = field411.method2124();
                                            Statics.field699 = field411.method2122();
                                            Statics.field669 = field411.method2122();
                                            if (Statics.field669 >= 100) {
                                                int var448 = Statics.field520 * 128 + 64;
                                                int var449 = Statics.field1308 * 128 + 64;
                                                int var450 = method2060(var448, var449, Statics.field170) - Statics.field1924;
                                                int var451 = var448 - Statics.field1909;
                                                int var452 = var450 - Statics.field1586;
                                                int var453 = var449 - Statics.field1985;
                                                int var454 = (int) Math.sqrt((double) (var451 * var451 + var453 * var453));
                                                Statics.field2777 = (int) (Math.atan2((double) var452, (double) var454) * 325.949D) & 0x7FF;
                                                Statics.field1814 = (int) (Math.atan2((double) var451, (double) var453) * -325.949D) & 0x7FF;
                                                if (Statics.field2777 < 128) {
                                                    Statics.field2777 = 128;
                                                }
                                                if (Statics.field2777 > 383) {
                                                    Statics.field2777 = 383;
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 94) {
                                            Statics.field175 = field411.method2148();
                                            Statics.field620 = field411.method2122();
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 28) {
                                            method481(false);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 145) {
                                            int var455 = field411.method2162();
                                            int var456 = field411.method2150();
                                            class155 var457 = class155.method1383(var455);
                                            if (var457.field2581 != 2 || var457.field2582 != var456) {
                                                var457.field2581 = 2;
                                                var457.field2582 = var456;
                                                method137(var457);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 125) {
                                            field482 = field411.method2122();
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 204) {
                                            int var458 = field411.method2201();
                                            int var459 = field411.method2124();
                                            int var460 = var459 >> 10 & 0x1F;
                                            int var461 = var459 >> 5 & 0x1F;
                                            int var462 = var459 & 0x1F;
                                            int var463 = (var462 << 3) + (var460 << 19) + (var461 << 11);
                                            class155 var464 = class155.method1383(var458);
                                            if (var464.field2566 != var463) {
                                                var464.field2566 = var463;
                                                method137(var464);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 168) {
                                            field411.field1841 += 28;
                                            if (field411.method2142()) {
                                                class111 var465 = field411;
                                                int var466 = field411.field1841 - 28;
                                                if (class138.field2103 != null) {
                                                    try {
                                                        class138.field2103.method3535(0L);
                                                        class138.field2103.method3545(var465.field1842, var466, 24);
                                                    } catch (Exception var651) {
                                                    }
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 244) {
                                            field479 = field411.method2122();
                                            if (field479 == 255) {
                                                field479 = 0;
                                            }
                                            field480 = field411.method2122();
                                            if (field480 == 255) {
                                                field480 = 0;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 154) {
                                            int var468 = field411.method2122();
                                            int var469 = field411.method2122();
                                            int var470 = field411.method2122();
                                            int var471 = field411.method2122();
                                            field333[var468] = true;
                                            field243[var468] = var469;
                                            field497[var468] = var470;
                                            field398[var468] = var471;
                                            field499[var468] = 0;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 225 || field290 == 229 || field290 == 57 || field290 == 111 || field290 == 249 || field290 == 138 || field290 == 104 || field290 == 163 || field290 == 45 || field290 == 41) {
                                            method2694();
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 23) {
                                            field288 = 1;
                                            field320 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 32) {
                                            int var472 = field411.method2124();
                                            int var473 = field411.method2162();
                                            class157.field2677[var472] = var473;
                                            if (class157.field2678[var472] != var473) {
                                                class157.field2678[var472] = var473;
                                                method509(var472);
                                            }
                                            field433[++field434 - 1 & 0x1F] = var472;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 135) {
                                            for (int var474 = 0; var474 < Statics.field1077; var474++) {
                                                class47 var475 = class47.method890(var474);
                                                if (var475 != null) {
                                                    class157.field2677[var474] = 0;
                                                    class157.field2678[var474] = 0;
                                                }
                                            }
                                            method24();
                                            field434 += 32;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 40) {
                                            int var476 = field411.method2201();
                                            Statics.field2506 = Statics.field2056.method2500(var476);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 183) {
                                            while (field411.field1841 < field289) {
                                                boolean var477 = field411.method2122() == 1;
                                                String var478 = field411.method2130();
                                                String var479 = field411.method2130();
                                                int var480 = field411.method2124();
                                                int var481 = field411.method2122();
                                                int var482 = field411.method2122();
                                                boolean var483 = (var482 & 0x2) != 0;
                                                boolean var484 = (var482 & 0x1) != 0;
                                                if (var480 > 0) {
                                                    field411.method2130();
                                                    field411.method2122();
                                                    field411.method2127();
                                                }
                                                field411.method2130();
                                                for (int var485 = 0; var485 < field500; var485++) {
                                                    class16 var486 = field399[var485];
                                                    if (var477) {
                                                        if (var479.equals(var486.field225)) {
                                                            var486.field225 = var478;
                                                            var486.field221 = var479;
                                                            var478 = null;
                                                            break;
                                                        }
                                                    } else if (var478.equals(var486.field225)) {
                                                        if (var486.field220 != var480) {
                                                            boolean var487 = true;
                                                            for (class35 var488 = (class35) field503.method3183(); var488 != null; var488 = (class35) field503.method3184()) {
                                                                if (var488.field795.equals(var478)) {
                                                                    if (var480 != 0 && var488.field798 == 0) {
                                                                        var488.method3323();
                                                                        var487 = false;
                                                                    } else if (var480 == 0 && var488.field798 != 0) {
                                                                        var488.method3323();
                                                                        var487 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var487) {
                                                                field503.method3182(new class35(var478, var480));
                                                            }
                                                            var486.field220 = var480;
                                                        }
                                                        var486.field221 = var479;
                                                        var486.field224 = var481;
                                                        var486.field222 = var483;
                                                        var486.field223 = var484;
                                                        var478 = null;
                                                        break;
                                                    }
                                                }
                                                if (var478 != null && field500 < 400) {
                                                    class16 var489 = new class16();
                                                    field399[field500] = var489;
                                                    var489.field225 = var478;
                                                    var489.field221 = var479;
                                                    var489.field220 = var480;
                                                    var489.field224 = var481;
                                                    var489.field222 = var483;
                                                    var489.field223 = var484;
                                                    field500++;
                                                }
                                            }
                                            field288 = 2;
                                            field320 = field432;
                                            boolean var490 = false;
                                            int var491 = field500;
                                            while (var491 > 0) {
                                                boolean var492 = true;
                                                var491--;
                                                for (int var493 = 0; var493 < var491; var493++) {
                                                    boolean var494 = false;
                                                    class16 var495 = field399[var493];
                                                    class16 var496 = field399[var493 + 1];
                                                    if (field244 != var495.field220 && field244 == var496.field220) {
                                                        var494 = true;
                                                    }
                                                    if (!var494 && var495.field220 == 0 && var496.field220 != 0) {
                                                        var494 = true;
                                                    }
                                                    if (!var494 && !var495.field222 && var496.field222) {
                                                        var494 = true;
                                                    }
                                                    if (!var494 && !var495.field223 && var496.field223) {
                                                        var494 = true;
                                                    }
                                                    if (var494) {
                                                        class16 var497 = field399[var493];
                                                        field399[var493] = field399[var493 + 1];
                                                        field399[var493 + 1] = var497;
                                                        var492 = false;
                                                    }
                                                }
                                                if (var492) {
                                                    break;
                                                }
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 95) {
                                            int var498 = field411.method2122();
                                            if (field411.method2122() == 0) {
                                                field509[var498] = new class201();
                                                field411.field1841 += 18;
                                            } else {
                                                field411.field1841--;
                                                field509[var498] = new class201(field411, false);
                                            }
                                            field428 = field432;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 253) {
                                            int var499 = field411.method2289();
                                            int var500 = field411.method2127();
                                            class155 var501 = class155.method1383(var500);
                                            if (var501.field2542 != var499 || var499 == -1) {
                                                var501.field2542 = var499;
                                                var501.field2598 = 0;
                                                var501.field2659 = 0;
                                                method137(var501);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 175) {
                                            method447();
                                            field290 = -1;
                                            var236 = false;
                                            break label4193;
                                        }
                                        if (field290 == 188) {
                                            int var502 = field411.method2196();
                                            int var503 = field411.method2196();
                                            int var504 = field411.method2156();
                                            if (var504 == 65535) {
                                                var504 = -1;
                                            }
                                            class155 var505 = class155.method1383(var503);
                                            if (var505.field2548) {
                                                var505.field2656 = var504;
                                                var505.field2657 = var502;
                                                class46 var507 = class46.method476(var504);
                                                var505.field2559 = var507.field1040;
                                                var505.field2561 = var507.field1041;
                                                var505.field2591 = var507.field1070;
                                                var505.field2627 = var507.field1045;
                                                var505.field2588 = var507.field1044;
                                                var505.field2632 = var507.field1049;
                                                if (var507.field1033 == 1) {
                                                    var505.field2611 = 1;
                                                } else {
                                                    var505.field2611 = 2;
                                                }
                                                if (var505.field2558 > 0) {
                                                    var505.field2632 = var505.field2632 * 32 / var505.field2558;
                                                }
                                                method137(var505);
                                            } else {
                                                if (var504 == -1) {
                                                    var505.field2581 = 0;
                                                    field290 = -1;
                                                    var236 = true;
                                                    break label4193;
                                                }
                                                class46 var506 = class46.method476(var504);
                                                var505.field2581 = 4;
                                                var505.field2582 = var504;
                                                var505.field2559 = var506.field1040;
                                                var505.field2561 = var506.field1041;
                                                var505.field2632 = var506.field1049 * 100 / var502;
                                                method137(var505);
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 73) {
                                            int var508 = field411.method2127();
                                            int var509 = field411.method2124();
                                            if (var508 < -70000) {
                                                var509 += 32768;
                                            }
                                            class155 var510;
                                            if (var508 >= 0) {
                                                var510 = class155.method1383(var508);
                                            } else {
                                                var510 = null;
                                            }
                                            while (field411.field1841 < field289) {
                                                int var511 = field411.method2135();
                                                int var512 = field411.method2124();
                                                int var513 = 0;
                                                if (var512 != 0) {
                                                    var513 = field411.method2122();
                                                    if (var513 == 255) {
                                                        var513 = field411.method2127();
                                                    }
                                                }
                                                if (var510 != null && var511 >= 0 && var511 < var510.field2594.length) {
                                                    var510.field2594[var511] = var512;
                                                    var510.field2583[var511] = var513;
                                                }
                                                class14.method127(var509, var511, var512 - 1, var513);
                                            }
                                            if (var510 != null) {
                                                method137(var510);
                                            }
                                            method24();
                                            field466[++field436 - 1 & 0x1F] = var509 & 0x7FFF;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 151) {
                                            int var514 = field411.method2122();
                                            class119[] var515 = new class119[] { class119.field1912, class119.field1913, class119.field1915 };
                                            class119[] var516 = var515;
                                            int var517 = 0;
                                            class119 var519;
                                            while (true) {
                                                if (var517 >= var516.length) {
                                                    var519 = null;
                                                    break;
                                                }
                                                class119 var518 = var516[var517];
                                                if (var518.field1914 == var514) {
                                                    var519 = var518;
                                                    break;
                                                }
                                                var517++;
                                            }
                                            Statics.field236 = var519;
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 20) {
                                            method2677(true);
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        if (field290 == 159) {
                                            String var520 = field411.method2130();
                                            int var521 = field411.method2148();
                                            int var522 = field411.method2154();
                                            if (var522 >= 1 && var522 <= 8) {
                                                if (var520.equalsIgnoreCase("null")) {
                                                    var520 = null;
                                                }
                                                field305[var522 - 1] = var520;
                                                field377[var522 - 1] = var521 == 0;
                                            }
                                            field290 = -1;
                                            var236 = true;
                                            break label4193;
                                        }
                                        class137.method101("" + field290 + class2.field19 + field397 + class2.field19 + field296 + class2.field19 + field289, (Throwable) null);
                                        method447();
                                    } catch (IOException var660) {
                                        if (field293 > 0) {
                                            method447();
                                        } else {
                                            method2355(40);
                                            Statics.field988 = Statics.field59;
                                            Statics.field59 = null;
                                        }
                                    } catch (Exception var661) {
                                        String var525 = "" + field290 + class2.field19 + field397 + class2.field19 + field296 + class2.field19 + field289 + class2.field19 + (Statics.field1821 + Statics.field695.field788[0]) + class2.field19 + (Statics.field990 + Statics.field695.field789[0]) + class2.field19;
                                        for (int var526 = 0; var526 < field289 && var526 < 50; var526++) {
                                            var525 = var525 + field411.field1842[var526] + class2.field19;
                                        }
                                        class137.method101(var525, var661);
                                        method447();
                                    }
                                    var236 = true;
                                }
                            }
                            if (!var236) {
                                break;
                            }
                        }
                        if (field270 == 30) {
                            while (true) {
                                class191 var527 = (class191) class192.field2908.method3276();
                                boolean var528;
                                if (var527 == null) {
                                    var528 = false;
                                } else {
                                    var528 = true;
                                }
                                if (!var528) {
                                    Object var530 = Statics.field1701.field172;
                                    synchronized (Statics.field1701.field172) {
                                        if (!field242) {
                                            Statics.field1701.field173 = 0;
                                        } else if (class129.field2009 != 0 || Statics.field1701.field173 >= 40) {
                                            field454.method2357(241);
                                            field454.method2123(0);
                                            int var531 = field454.field1841;
                                            int var532 = 0;
                                            for (int var533 = 0; var533 < Statics.field1701.field173 && field454.field1841 - var531 < 240; var533++) {
                                                var532++;
                                                int var534 = Statics.field1701.field180[var533];
                                                if (var534 < 0) {
                                                    var534 = 0;
                                                } else if (var534 > 502) {
                                                    var534 = 502;
                                                }
                                                int var535 = Statics.field1701.field174[var533];
                                                if (var535 < 0) {
                                                    var535 = 0;
                                                } else if (var535 > 764) {
                                                    var535 = 764;
                                                }
                                                int var536 = var534 * 765 + var535;
                                                if (Statics.field1701.field180[var533] == -1 && Statics.field1701.field174[var533] == -1) {
                                                    var535 = -1;
                                                    var534 = -1;
                                                    var536 = 524287;
                                                }
                                                if (field253 != var535 || field318 != var534) {
                                                    int var537 = var535 - field253;
                                                    field253 = var535;
                                                    int var538 = var534 - field318;
                                                    field318 = var534;
                                                    if (field254 < 8 && var537 >= -32 && var537 <= 31 && var538 >= -32 && var538 <= 31) {
                                                        var537 += 32;
                                                        var538 += 32;
                                                        field454.method2109((field254 << 12) + (var537 << 6) + var538);
                                                        field254 = 0;
                                                    } else if (field254 < 8) {
                                                        field454.method2110((field254 << 19) + 8388608 + var536);
                                                        field254 = 0;
                                                    } else {
                                                        field454.method2134((field254 << 19) + -1073741824 + var536);
                                                        field254 = 0;
                                                    }
                                                } else if (field254 < 2047) {
                                                    field254++;
                                                }
                                            }
                                            field454.method2119(field454.field1841 - var531);
                                            if (var532 >= Statics.field1701.field173) {
                                                Statics.field1701.field173 = 0;
                                            } else {
                                                Statics.field1701.field173 -= var532;
                                                for (int var539 = 0; var539 < Statics.field1701.field173; var539++) {
                                                    Statics.field1701.field174[var539] = Statics.field1701.field174[var532 + var539];
                                                    Statics.field1701.field180[var539] = Statics.field1701.field180[var532 + var539];
                                                }
                                            }
                                        }
                                    }
                                    if (class129.field2009 == 1 || !Statics.field330 && class129.field2009 == 4 || class129.field2009 == 2) {
                                        long var541 = (class129.field2012 - field255 * -1L) / 50L;
                                        if (var541 > 4095L) {
                                            var541 = 4095L;
                                        }
                                        field255 = class129.field2012 * -1L;
                                        int var543 = class129.field1997;
                                        if (var543 < 0) {
                                            var543 = 0;
                                        } else if (var543 > 502) {
                                            var543 = 502;
                                        }
                                        int var544 = class129.field2010;
                                        if (var544 < 0) {
                                            var544 = 0;
                                        } else if (var544 > 764) {
                                            var544 = 764;
                                        }
                                        int var545 = var543 * 765 + var544;
                                        byte var546 = 0;
                                        if (class129.field2009 == 2) {
                                            var546 = 1;
                                        }
                                        int var547 = (int) var541;
                                        field454.method2357(206);
                                        field454.method2134((var546 << 19) + (var547 << 20) + var545);
                                    }
                                    if (class126.field1961 > 0) {
                                        field454.method2357(247);
                                        field454.method2109(0);
                                        int var548 = field454.field1841;
                                        long var549 = class104.method567();
                                        for (int var551 = 0; var551 < class126.field1961; var551++) {
                                            long var552 = var549 - field471;
                                            if (var552 > 16777215L) {
                                                var552 = 16777215L;
                                            }
                                            field471 = var549;
                                            field454.method2141((int) var552);
                                            field454.method2145(class126.field1977[var551]);
                                        }
                                        field454.method2118(field454.field1841 - var548);
                                    }
                                    if (field335 > 0) {
                                        field335--;
                                    }
                                    if (class126.field1971[96] || class126.field1971[97] || class126.field1971[98] || class126.field1971[99]) {
                                        field336 = true;
                                    }
                                    if (field336 && field335 <= 0) {
                                        field335 = 20;
                                        field336 = false;
                                        field454.method2357(5);
                                        field454.method2151(field378);
                                        field454.method2151(field422);
                                    }
                                    if (Statics.field53 && !field259) {
                                        field259 = true;
                                        field454.method2357(88);
                                        field454.method2123(1);
                                    }
                                    if (!Statics.field53 && field259) {
                                        field259 = false;
                                        field454.method2357(88);
                                        field454.method2123(0);
                                    }
                                    method20();
                                    if (field270 == 30) {
                                        method128();
                                        method2448();
                                        field511++;
                                        if (field511 <= 750) {
                                            method124();
                                            method904();
                                            method1025();
                                            field350++;
                                            if (field355 != 0) {
                                                field361 += 20;
                                                if (field361 >= 400) {
                                                    field355 = 0;
                                                }
                                            }
                                            if (Statics.field2684 != null) {
                                                field356++;
                                                if (field356 >= 15) {
                                                    method137(Statics.field2684);
                                                    Statics.field2684 = null;
                                                }
                                            }
                                            class155 var554 = Statics.field2788;
                                            class155 var555 = Statics.field996;
                                            Statics.field2788 = null;
                                            Statics.field996 = null;
                                            field272 = null;
                                            field435 = false;
                                            field437 = false;
                                            field468 = 0;
                                            while (true) {
                                                while (class126.method475() && field468 < 128) {
                                                    if (field415 >= 2 && class126.field1971[82] && Statics.field15 == 66) {
                                                        String var556 = class10.method1353();
                                                        Statics.field510.setContents(new StringSelection(var556), (ClipboardOwner) null);
                                                    } else {
                                                        field470[field468] = Statics.field15;
                                                        field469[field468] = Statics.field2164;
                                                        field468++;
                                                    }
                                                }
                                                int var557 = field408;
                                                if (class155.method485(var557)) {
                                                    method3368(Statics.field2584[var557], -1, 0, 0, 765, 503, 0, 0);
                                                }
                                                field432++;
                                                while (true) {
                                                    class1 var558;
                                                    class155 var559;
                                                    class155 var560;
                                                    do {
                                                        var558 = (class1) field442.method3227();
                                                        if (var558 == null) {
                                                            while (true) {
                                                                class1 var561;
                                                                class155 var562;
                                                                class155 var563;
                                                                do {
                                                                    var561 = (class1) field493.method3227();
                                                                    if (var561 == null) {
                                                                        while (true) {
                                                                            class1 var564;
                                                                            class155 var565;
                                                                            class155 var566;
                                                                            do {
                                                                                var564 = (class1) field309.method3227();
                                                                                if (var564 == null) {
                                                                                    boolean var567 = false;
                                                                                    while (!var567) {
                                                                                        var567 = true;
                                                                                        for (int var568 = 0; var568 < field390 - 1; var568++) {
                                                                                            if (field393[var568] < 1000 && field393[var568 + 1] > 1000) {
                                                                                                String var569 = field396[var568];
                                                                                                field396[var568] = field396[var568 + 1];
                                                                                                field396[var568 + 1] = var569;
                                                                                                String var570 = field395[var568];
                                                                                                field395[var568] = field395[var568 + 1];
                                                                                                field395[var568 + 1] = var570;
                                                                                                int var571 = field393[var568];
                                                                                                field393[var568] = field393[var568 + 1];
                                                                                                field393[var568 + 1] = var571;
                                                                                                int var572 = field391[var568];
                                                                                                field391[var568] = field391[var568 + 1];
                                                                                                field391[var568 + 1] = var572;
                                                                                                int var573 = field392[var568];
                                                                                                field392[var568] = field392[var568 + 1];
                                                                                                field392[var568 + 1] = var573;
                                                                                                int var574 = field394[var568];
                                                                                                field394[var568] = field394[var568 + 1];
                                                                                                field394[var568 + 1] = var574;
                                                                                                var567 = false;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field2147 == null && field248 == null) {
                                                                                        int var575 = class129.field2009;
                                                                                        if (field250) {
                                                                                            if (var575 != 1 && (Statics.field330 || var575 != 4)) {
                                                                                                int var576 = class129.field2003;
                                                                                                int var577 = class129.field2004;
                                                                                                if (var576 < Statics.field2414 - 10 || var576 > Statics.field389 + Statics.field2414 + 10 || var577 < Statics.field523 - 10 || var577 > Statics.field65 + Statics.field523 + 10) {
                                                                                                    field250 = false;
                                                                                                    method885(Statics.field2414, Statics.field523, Statics.field389, Statics.field65);
                                                                                                }
                                                                                            }
                                                                                            if (var575 == 1 || !Statics.field330 && var575 == 4) {
                                                                                                int var578 = Statics.field2414;
                                                                                                int var579 = Statics.field523;
                                                                                                int var580 = Statics.field389;
                                                                                                int var581 = class129.field2010;
                                                                                                int var582 = class129.field1997;
                                                                                                int var583 = -1;
                                                                                                for (int var584 = 0; var584 < field390; var584++) {
                                                                                                    int var585 = (field390 - 1 - var584) * 15 + var579 + 31;
                                                                                                    if (var581 > var578 && var581 < var578 + var580 && var582 > var585 - 13 && var582 < var585 + 3) {
                                                                                                        var583 = var584;
                                                                                                    }
                                                                                                }
                                                                                                if (var583 != -1 && var583 >= 0) {
                                                                                                    int var586 = field391[var583];
                                                                                                    int var587 = field392[var583];
                                                                                                    int var588 = field393[var583];
                                                                                                    int var589 = field394[var583];
                                                                                                    String var590 = field395[var583];
                                                                                                    String var591 = field396[var583];
                                                                                                    method1960(var586, var587, var588, var589, var590, var591, class129.field2010, class129.field1997);
                                                                                                }
                                                                                                field250 = false;
                                                                                                method885(Statics.field2414, Statics.field523, Statics.field389, Statics.field65);
                                                                                            }
                                                                                        } else {
                                                                                            label4308: {
                                                                                                if ((var575 == 1 || !Statics.field330 && var575 == 4) && field390 > 0) {
                                                                                                    int var592 = field393[field390 - 1];
                                                                                                    if (var592 == 39 || var592 == 40 || var592 == 41 || var592 == 42 || var592 == 43 || var592 == 33 || var592 == 34 || var592 == 35 || var592 == 36 || var592 == 37 || var592 == 38 || var592 == 1005) {
                                                                                                        label4281: {
                                                                                                            int var593 = field391[field390 - 1];
                                                                                                            int var594 = field392[field390 - 1];
                                                                                                            class155 var595 = class155.method1383(var594);
                                                                                                            int var596 = method125(var595);
                                                                                                            boolean var597 = (var596 >> 28 & 0x1) != 0;
                                                                                                            if (!var597) {
                                                                                                                int var598 = method125(var595);
                                                                                                                boolean var599 = (var598 >> 29 & 0x1) != 0;
                                                                                                                if (!var599) {
                                                                                                                    break label4281;
                                                                                                                }
                                                                                                            }
                                                                                                            if (Statics.field2147 != null && !field337 && field257 != 1) {
                                                                                                                int var600 = field390 - 1;
                                                                                                                boolean var601;
                                                                                                                if (var600 < 0) {
                                                                                                                    var601 = false;
                                                                                                                } else {
                                                                                                                    int var602 = field393[var600];
                                                                                                                    if (var602 >= 2000) {
                                                                                                                        var602 -= 2000;
                                                                                                                    }
                                                                                                                    if (var602 == 1007) {
                                                                                                                        var601 = true;
                                                                                                                    } else {
                                                                                                                        var601 = false;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!var601 && field390 > 0) {
                                                                                                                    int var603 = field359;
                                                                                                                    int var604 = field486;
                                                                                                                    method2580(Statics.field692, var603, var604);
                                                                                                                    Statics.field692 = null;
                                                                                                                }
                                                                                                            }
                                                                                                            field337 = false;
                                                                                                            field363 = 0;
                                                                                                            if (Statics.field2147 != null) {
                                                                                                                method137(Statics.field2147);
                                                                                                            }
                                                                                                            Statics.field2147 = class155.method1383(var594);
                                                                                                            field388 = var593;
                                                                                                            field359 = class129.field2010;
                                                                                                            field486 = class129.field1997;
                                                                                                            if (field390 > 0) {
                                                                                                                method2228(field390 - 1);
                                                                                                            }
                                                                                                            method137(Statics.field2147);
                                                                                                            break label4308;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (var575 == 1 || !Statics.field330 && var575 == 4) {
                                                                                                    label4301: {
                                                                                                        if (field257 != 1 || field390 <= 2) {
                                                                                                            int var605 = field390 - 1;
                                                                                                            boolean var606;
                                                                                                            if (var605 < 0) {
                                                                                                                var606 = false;
                                                                                                            } else {
                                                                                                                int var607 = field393[var605];
                                                                                                                if (var607 >= 2000) {
                                                                                                                    var607 -= 2000;
                                                                                                                }
                                                                                                                if (var607 == 1007) {
                                                                                                                    var606 = true;
                                                                                                                } else {
                                                                                                                    var606 = false;
                                                                                                                }
                                                                                                            }
                                                                                                            if (!var606) {
                                                                                                                break label4301;
                                                                                                            }
                                                                                                        }
                                                                                                        var575 = 2;
                                                                                                    }
                                                                                                }
                                                                                                if ((var575 == 1 || !Statics.field330 && var575 == 4) && field390 > 0) {
                                                                                                    int var608 = field390 - 1;
                                                                                                    if (var608 >= 0) {
                                                                                                        int var609 = field391[var608];
                                                                                                        int var610 = field392[var608];
                                                                                                        int var611 = field393[var608];
                                                                                                        int var612 = field394[var608];
                                                                                                        String var613 = field395[var608];
                                                                                                        String var614 = field396[var608];
                                                                                                        method1960(var609, var610, var611, var612, var613, var614, class129.field2010, class129.field1997);
                                                                                                    }
                                                                                                }
                                                                                                if (var575 == 2 && field390 > 0) {
                                                                                                    method1870(class129.field2010, class129.field1997);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field248 != null) {
                                                                                        method1871();
                                                                                    }
                                                                                    if (Statics.field2147 != null) {
                                                                                        method137(Statics.field2147);
                                                                                        field363++;
                                                                                        if (class129.field1999 == 0) {
                                                                                            if (!field337) {
                                                                                                label2493: {
                                                                                                    label2492: {
                                                                                                        if (field257 != 1) {
                                                                                                            int var623 = field390 - 1;
                                                                                                            boolean var624;
                                                                                                            if (var623 < 0) {
                                                                                                                var624 = false;
                                                                                                            } else {
                                                                                                                int var625 = field393[var623];
                                                                                                                if (var625 >= 2000) {
                                                                                                                    var625 -= 2000;
                                                                                                                }
                                                                                                                if (var625 == 1007) {
                                                                                                                    var624 = true;
                                                                                                                } else {
                                                                                                                    var624 = false;
                                                                                                                }
                                                                                                            }
                                                                                                            if (!var624) {
                                                                                                                break label2492;
                                                                                                            }
                                                                                                        }
                                                                                                        if (field390 > 2) {
                                                                                                            method1870(field359, field486);
                                                                                                            break label2493;
                                                                                                        }
                                                                                                    }
                                                                                                    if (field390 > 0) {
                                                                                                        int var626 = field359;
                                                                                                        int var627 = field486;
                                                                                                        method2580(Statics.field692, var626, var627);
                                                                                                        Statics.field692 = null;
                                                                                                    }
                                                                                                }
                                                                                            } else if (Statics.field942 == Statics.field2147 && field388 != field240) {
                                                                                                class155 var615 = Statics.field2147;
                                                                                                byte var616 = 0;
                                                                                                if (field354 == 1 && var615.field2553 == 206) {
                                                                                                    var616 = 1;
                                                                                                }
                                                                                                if (var615.field2594[field240] <= 0) {
                                                                                                    var616 = 0;
                                                                                                }
                                                                                                int var617 = method125(var615);
                                                                                                boolean var618 = (var617 >> 29 & 0x1) != 0;
                                                                                                if (var618) {
                                                                                                    int var619 = field388;
                                                                                                    int var620 = field240;
                                                                                                    var615.field2594[var620] = var615.field2594[var619];
                                                                                                    var615.field2583[var620] = var615.field2583[var619];
                                                                                                    var615.field2594[var619] = -1;
                                                                                                    var615.field2583[var619] = 0;
                                                                                                } else if (var616 == 1) {
                                                                                                    int var621 = field388;
                                                                                                    int var622 = field240;
                                                                                                    while (var621 != var622) {
                                                                                                        if (var621 > var622) {
                                                                                                            var615.method2849(var621 - 1, var621);
                                                                                                            var621--;
                                                                                                        } else if (var621 < var622) {
                                                                                                            var615.method2849(var621 + 1, var621);
                                                                                                            var621++;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    var615.method2849(field240, field388);
                                                                                                }
                                                                                                field454.method2357(47);
                                                                                                field454.method2265(Statics.field2147.field2549);
                                                                                                field454.method2268(var616);
                                                                                                field454.method2109(field388);
                                                                                                field454.method2109(field240);
                                                                                            }
                                                                                            field356 = 10;
                                                                                            class129.field2009 = 0;
                                                                                            Statics.field2147 = null;
                                                                                        } else if (field363 >= 5 && (class129.field2003 > field359 + 5 || class129.field2003 < field359 - 5 || class129.field2004 > field486 + 5 || class129.field2004 < field486 - 5)) {
                                                                                            field337 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class80.field1406 != -1) {
                                                                                        int var628 = class80.field1406;
                                                                                        int var629 = class80.field1407;
                                                                                        field454.method2357(253);
                                                                                        field454.method2123(5);
                                                                                        field454.method2153(Statics.field1821 + var628);
                                                                                        field454.method2123(class126.field1971[82] ? (class126.field1971[81] ? 2 : 1) : 0);
                                                                                        field454.method2152(Statics.field990 + var629);
                                                                                        class80.field1406 = -1;
                                                                                        field286 = class129.field2010;
                                                                                        field353 = class129.field1997;
                                                                                        field355 = 1;
                                                                                        field361 = 0;
                                                                                        field479 = var628;
                                                                                        field480 = var629;
                                                                                    }
                                                                                    if (Statics.field2788 != var554) {
                                                                                        if (var554 != null) {
                                                                                            method137(var554);
                                                                                        }
                                                                                        if (Statics.field2788 != null) {
                                                                                            method137(Statics.field2788);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field996 != var555 && field492 == field400) {
                                                                                        if (var555 != null) {
                                                                                            method137(var555);
                                                                                        }
                                                                                        if (Statics.field996 != null) {
                                                                                            method137(Statics.field996);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field996 == null) {
                                                                                        if (field492 > 0) {
                                                                                            field492--;
                                                                                        }
                                                                                    } else if (field492 < field400) {
                                                                                        field492++;
                                                                                        if (field492 == field400) {
                                                                                            method137(Statics.field996);
                                                                                        }
                                                                                    }
                                                                                    int var630 = field308 + Statics.field695.field763;
                                                                                    int var631 = field261 + Statics.field695.field735;
                                                                                    if (Statics.field816 - var630 < -500 || Statics.field816 - var630 > 500 || Statics.field559 - var631 < -500 || Statics.field559 - var631 > 500) {
                                                                                        Statics.field816 = var630;
                                                                                        Statics.field559 = var631;
                                                                                    }
                                                                                    if (Statics.field816 != var630) {
                                                                                        Statics.field816 += (var630 - Statics.field816) / 16;
                                                                                    }
                                                                                    if (Statics.field559 != var631) {
                                                                                        Statics.field559 += (var631 - Statics.field559) / 16;
                                                                                    }
                                                                                    if (class129.field1999 == 4 && Statics.field330) {
                                                                                        int var632 = class129.field2004 - field334;
                                                                                        field332 = var632 * 2;
                                                                                        field334 = var632 == -1 || var632 == 1 ? class129.field2004 : (field334 + class129.field2004) / 2;
                                                                                        int var633 = field264 - class129.field2003;
                                                                                        field331 = var633 * 2;
                                                                                        field264 = var633 == -1 || var633 == 1 ? class129.field2003 : (field264 + class129.field2003) / 2;
                                                                                    } else {
                                                                                        if (class126.field1971[96]) {
                                                                                            field331 += (-24 - field331) / 2;
                                                                                        } else if (class126.field1971[97]) {
                                                                                            field331 += (24 - field331) / 2;
                                                                                        } else {
                                                                                            field331 /= 2;
                                                                                        }
                                                                                        if (class126.field1971[98]) {
                                                                                            field332 += (12 - field332) / 2;
                                                                                        } else if (class126.field1971[99]) {
                                                                                            field332 += (-12 - field332) / 2;
                                                                                        } else {
                                                                                            field332 /= 2;
                                                                                        }
                                                                                        field334 = class129.field2004;
                                                                                        field264 = class129.field2003;
                                                                                    }
                                                                                    field378 = field331 / 2 + field378 & 0x7FF;
                                                                                    field422 += field332 / 2;
                                                                                    if (field422 < 128) {
                                                                                        field422 = 128;
                                                                                    }
                                                                                    if (field422 > 383) {
                                                                                        field422 = 383;
                                                                                    }
                                                                                    int var634 = Statics.field816 >> 7;
                                                                                    int var635 = Statics.field559 >> 7;
                                                                                    int var636 = method2060(Statics.field816, Statics.field559, Statics.field170);
                                                                                    int var637 = 0;
                                                                                    if (var634 > 3 && var635 > 3 && var634 < 100 && var635 < 100) {
                                                                                        for (int var638 = var634 - 4; var638 <= var634 + 4; var638++) {
                                                                                            for (int var639 = var635 - 4; var639 <= var635 + 4; var639++) {
                                                                                                int var640 = Statics.field170;
                                                                                                if (var640 < 3 && (class6.field72[1][var638][var639] & 0x2) == 2) {
                                                                                                    var640++;
                                                                                                }
                                                                                                int var641 = var636 - class6.field84[var640][var638][var639];
                                                                                                if (var641 > var637) {
                                                                                                    var637 = var641;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int var642 = var637 * 192;
                                                                                    if (var642 > 98048) {
                                                                                        var642 = 98048;
                                                                                    }
                                                                                    if (var642 < 32768) {
                                                                                        var642 = 32768;
                                                                                    }
                                                                                    if (var642 > field297) {
                                                                                        field297 += (var642 - field297) / 24;
                                                                                    } else if (var642 < field297) {
                                                                                        field297 += (var642 - field297) / 80;
                                                                                    }
                                                                                    if (field494) {
                                                                                        method671();
                                                                                    }
                                                                                    for (int var643 = 0; var643 < 5; var643++) {
                                                                                        var10002 = field499[var643]++;
                                                                                    }
                                                                                    int var644 = ++class129.field1998 - 1;
                                                                                    int var646 = class126.method594();
                                                                                    if (var644 > 15000 && var646 > 15000) {
                                                                                        field293 = 250;
                                                                                        class129.field1998 = 14500;
                                                                                        field454.method2357(55);
                                                                                    }
                                                                                    field245++;
                                                                                    if (field245 > 500) {
                                                                                        field245 = 0;
                                                                                        int var647 = (int) (Math.random() * 8.0D);
                                                                                        if ((var647 & 0x1) == 1) {
                                                                                            field308 += field496;
                                                                                        }
                                                                                        if ((var647 & 0x2) == 2) {
                                                                                            field261 += field311;
                                                                                        }
                                                                                        if ((var647 & 0x4) == 4) {
                                                                                            field312 += field371;
                                                                                        }
                                                                                    }
                                                                                    if (field308 < -50) {
                                                                                        field496 = 2;
                                                                                    }
                                                                                    if (field308 > 50) {
                                                                                        field496 = -2;
                                                                                    }
                                                                                    if (field261 < -55) {
                                                                                        field311 = 2;
                                                                                    }
                                                                                    if (field261 > 55) {
                                                                                        field311 = -2;
                                                                                    }
                                                                                    if (field312 < -40) {
                                                                                        field371 = 1;
                                                                                    }
                                                                                    if (field312 > 40) {
                                                                                        field371 = -1;
                                                                                    }
                                                                                    field319++;
                                                                                    if (field319 > 500) {
                                                                                        field319 = 0;
                                                                                        int var648 = (int) (Math.random() * 8.0D);
                                                                                        if ((var648 & 0x1) == 1) {
                                                                                            field315 += field316;
                                                                                        }
                                                                                        if ((var648 & 0x2) == 2) {
                                                                                            field317 += field481;
                                                                                        }
                                                                                    }
                                                                                    if (field315 < -60) {
                                                                                        field316 = 2;
                                                                                    }
                                                                                    if (field315 > 60) {
                                                                                        field316 = -2;
                                                                                    }
                                                                                    if (field317 < -20) {
                                                                                        field481 = 1;
                                                                                    }
                                                                                    if (field317 > 10) {
                                                                                        field481 = -1;
                                                                                    }
                                                                                    for (class35 var649 = (class35) field503.method3183(); var649 != null; var649 = (class35) field503.method3184()) {
                                                                                        if ((long) var649.field800 < class104.method567() / 1000L - 5L) {
                                                                                            if (var649.field798 > 0) {
                                                                                                class10.method486(5, "", var649.field795 + class145.field2312);
                                                                                            }
                                                                                            if (var649.field798 == 0) {
                                                                                                class10.method486(5, "", var649.field795 + class145.field2313);
                                                                                            }
                                                                                            var649.method3323();
                                                                                        }
                                                                                    }
                                                                                    field292++;
                                                                                    if (field292 > 50) {
                                                                                        field454.method2357(63);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field59 != null && field454.field1841 > 0) {
                                                                                            Statics.field59.method2594(field454.field1842, 0, field454.field1841);
                                                                                            field454.field1841 = 0;
                                                                                            field292 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var653) {
                                                                                        if (field293 > 0) {
                                                                                            method447();
                                                                                        } else {
                                                                                            method2355(40);
                                                                                            Statics.field988 = Statics.field59;
                                                                                            Statics.field59 = null;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var565 = var564.field3;
                                                                                if (var565.field2550 < 0) {
                                                                                    break;
                                                                                }
                                                                                var566 = class155.method1383(var565.field2560);
                                                                            } while (var566 == null || var566.field2660 == null || var565.field2550 >= var566.field2660.length || var566.field2660[var565.field2550] != var565);
                                                                            class33.method561(var564, 200000);
                                                                        }
                                                                    }
                                                                    var562 = var561.field3;
                                                                    if (var562.field2550 < 0) {
                                                                        break;
                                                                    }
                                                                    var563 = class155.method1383(var562.field2560);
                                                                } while (var563 == null || var563.field2660 == null || var562.field2550 >= var563.field2660.length || var563.field2660[var562.field2550] != var562);
                                                                class33.method561(var561, 200000);
                                                            }
                                                        }
                                                        var559 = var558.field3;
                                                        if (var559.field2550 < 0) {
                                                            break;
                                                        }
                                                        var560 = class155.method1383(var559.field2560);
                                                    } while (var560 == null || var560.field2660 == null || var559.field2550 >= var560.field2660.length || var560.field2660[var559.field2550] != var559);
                                                    class33.method561(var558, 200000);
                                                }
                                            }
                                        } else if (field293 > 0) {
                                            method447();
                                        } else {
                                            method2355(40);
                                            Statics.field988 = Statics.field59;
                                            Statics.field59 = null;
                                        }
                                    }
                                    break;
                                }
                                field454.method2357(162);
                                field454.method2123(0);
                                int var529 = field454.field1841;
                                class192.method552(field454);
                                field454.method2119(field454.field1841 - var529);
                            }
                        }
                    }
                } else if (field270 == 40 || field270 == 45) {
                    method1326();
                }
                return;
            }
            var2.field2501.method2806(var2.field2502, (int) var2.field2894, var2.field2499, false);
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method162() {
        boolean var1 = class164.method10();
        if (var1 && field485 && Statics.field2102 != null) {
            Statics.field2102.method992();
        }
        if (field2063) {
            class126.method1888(Statics.field2154);
            class129.method126(Statics.field2154);
            if (Statics.field1317 != null) {
                Statics.field1317.method2444(Statics.field2154);
            }
            this.method2615();
            Canvas var2 = Statics.field2154;
            var2.setFocusTraversalKeysEnabled(false);
            var2.addKeyListener(class126.field1978);
            var2.addFocusListener(class126.field1978);
            class129.method2041(Statics.field2154);
            if (Statics.field1317 != null) {
                Statics.field1317.method2445(Statics.field2154);
            }
        }
        if (field270 == 0) {
            int var3 = class29.field682;
            String var4 = class29.field658;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field2154.getGraphics();
                if (Statics.field560 == null) {
                    Statics.field560 = new Font("Helvetica", 1, 13);
                    Statics.field2068 = Statics.field2154.getFontMetrics(Statics.field560);
                }
                if (field2053) {
                    field2053 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field1445, Statics.field1116);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field707 == null) {
                        Statics.field707 = Statics.field2154.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field707.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field560);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field2068.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field707, Statics.field1445 / 2 - 152, Statics.field1116 / 2 - 18, (ImageObserver) null);
                } catch (Exception var37) {
                    int var9 = Statics.field1445 / 2 - 152;
                    int var10 = Statics.field1116 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field560);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field2068.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var38) {
                Statics.field2154.repaint();
            }
        } else if (field270 == 5) {
            class29.method80(Statics.field2048, Statics.field1879);
        } else if (field270 == 10 || field270 == 11) {
            class29.method80(Statics.field2048, Statics.field1879);
        } else if (field270 == 20) {
            class29.method80(Statics.field2048, Statics.field1879);
        } else if (field270 == 25) {
            if (field303 == 1) {
                if (field263 > field300) {
                    field300 = field263;
                }
                int var12 = (field300 * 50 - field263 * 50) / field300;
                method86(class145.field2174 + class2.field18 + class2.field21 + var12 + "%" + class2.field22, false);
            } else if (field303 == 2) {
                if (field301 > field302) {
                    field302 = field301;
                }
                int var13 = (field302 * 50 - field301 * 50) / field302 + 50;
                method86(class145.field2174 + class2.field18 + class2.field21 + var13 + "%" + class2.field22, false);
            } else {
                method86(class145.field2174, false);
            }
        } else if (field270 == 30) {
            if (field408 != -1) {
                method775(field408);
            }
            for (int var14 = 0; var14 < field452; var14++) {
                if (field506[var14]) {
                    field381[var14] = true;
                }
                field456[var14] = field506[var14];
                field506[var14] = false;
            }
            field453 = field418;
            field491 = -1;
            field455 = -1;
            Statics.field942 = null;
            if (field408 != -1) {
                field452 = 0;
                int var15 = field408;
                if (class155.method485(var15)) {
                    Statics.field131 = null;
                    method508(Statics.field2584[var15], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field131 != null) {
                        method508(Statics.field131, -1412584499, 0, 0, 765, 503, Statics.field533, Statics.field200, -1);
                        Statics.field131 = null;
                    }
                } else {
                    for (int var16 = 0; var16 < 100; var16++) {
                        field506[var16] = true;
                    }
                }
            }
            class74.method1506();
            if (field250) {
                int var20 = Statics.field2414;
                int var21 = Statics.field523;
                int var22 = Statics.field389;
                int var23 = Statics.field65;
                int var24 = 6116423;
                class74.method1513(var20, var21, var22, var23, var24);
                class74.method1513(var20 + 1, var21 + 1, var22 - 2, 16, 0);
                class74.method1515(var20 + 1, var21 + 18, var22 - 2, var23 - 19, 0);
                Statics.field2048.method3483(class145.field2318, var20 + 3, var21 + 14, var24, -1);
                int var25 = class129.field2003;
                int var26 = class129.field2004;
                for (int var27 = 0; var27 < field390; var27++) {
                    int var28 = (field390 - 1 - var27) * 15 + var21 + 31;
                    int var29 = 16777215;
                    if (var25 > var20 && var25 < var20 + var22 && var26 > var28 - 13 && var26 < var28 + 3) {
                        var29 = 16776960;
                    }
                    Statics.field2048.method3483(method3383(var27), var20 + 3, var28, var29, 0);
                }
                method2784(Statics.field2414, Statics.field523, Statics.field389, Statics.field65);
            } else if (field491 != -1) {
                int var17 = field491;
                int var18 = field455;
                if (field390 >= 2 || field401 != 0 || field403) {
                    String var19;
                    if (field401 == 1 && field390 < 2) {
                        var19 = class145.field2315 + class145.field2377 + field380 + " " + class2.field23;
                    } else if (field403 && field390 < 2) {
                        var19 = field406 + class145.field2377 + field407 + " " + class2.field23;
                    } else {
                        var19 = method3383(field390 - 1);
                    }
                    if (field390 > 2) {
                        var19 = var19 + class2.method2540(16777215) + " " + '/' + " " + (field390 - 2) + class145.field2319;
                    }
                    Statics.field2048.method3488(var19, var17 + 4, var18 + 15, 16777215, 0, field418 / 1000);
                }
            }
            if (field461 == 3) {
                for (int var30 = 0; var30 < field452; var30++) {
                    if (field456[var30]) {
                        class74.method1554(field457[var30], field424[var30], field502[var30], field460[var30], 16711935, 128);
                    } else if (field381[var30]) {
                        class74.method1554(field457[var30], field424[var30], field502[var30], field460[var30], 16711680, 128);
                    }
                }
            }
            class21.method2455(Statics.field170, Statics.field695.field763, Statics.field695.field735, field350);
            field350 = 0;
        } else if (field270 == 40) {
            method86(class145.field2263 + class2.field18 + class145.field2276, false);
        } else if (field270 == 45) {
            method86(class145.field2323, false);
        }
        if (field270 == 30 && field461 == 0 && !field2053) {
            try {
                Graphics var31 = Statics.field2154.getGraphics();
                for (int var32 = 0; var32 < field452; var32++) {
                    if (field381[var32]) {
                        Statics.field1877.method1357(var31, field457[var32], field424[var32], field502[var32], field460[var32]);
                        field381[var32] = false;
                    }
                }
            } catch (Exception var40) {
                Statics.field2154.repaint();
            }
        } else if (field270 > 0) {
            try {
                Graphics var34 = Statics.field2154.getGraphics();
                Statics.field1877.method1377(var34, 0, 0);
                field2053 = false;
                for (int var35 = 0; var35 < field452; var35++) {
                    field381[var35] = false;
                }
            } catch (Exception var39) {
                Statics.field2154.repaint();
            }
        }
    }

    @ObfuscatedName("client.z(I)V")
    public final void method352() {
        if (Statics.field1701 != null) {
            Statics.field1701.field177 = false;
        }
        Statics.field1701 = null;
        if (Statics.field59 != null) {
            Statics.field59.method2593();
            Statics.field59 = null;
        }
        if (class126.field1978 != null) {
            class126 var1 = class126.field1978;
            synchronized (class126.field1978) {
                class126.field1978 = null;
            }
        }
        class129.method1961();
        Statics.field1317 = null;
        if (Statics.field2102 != null) {
            Statics.field2102.method989();
        }
        if (Statics.field1884 != null) {
            Statics.field1884.method989();
        }
        class153.method589();
        Object var3 = class152.field2511;
        synchronized (class152.field2511) {
            if (class152.field2510 != 0) {
                class152.field2510 = 1;
                try {
                    class152.field2511.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class138.field2095.method3534();
            for (int var6 = 0; var6 < Statics.field1829; var6++) {
                Statics.field1819[var6].method3534();
            }
            class138.field2096.method3534();
            class138.field2103.method3534();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dl.w(II)V")
    public static void method2355(int arg0) {
        if (field270 == arg0) {
            return;
        }
        if (field270 == 0) {
            Statics.field707 = null;
            Statics.field560 = null;
            Statics.field2068 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field413 = 0;
            field279 = 0;
            field280 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field988 != null) {
            Statics.field988.method2593();
            Statics.field988 = null;
        }
        if (field270 == 25) {
            field303 = 0;
            field263 = 0;
            field300 = 1;
            field301 = 0;
            field302 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method2750(Statics.field2154, Statics.field1540, Statics.field276, true, 0);
        } else if (arg0 == 20) {
            class29.method2750(Statics.field2154, Statics.field1540, Statics.field276, true, field270 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method2750(Statics.field2154, Statics.field1540, Statics.field276, false, 4);
        } else {
            class29.method510();
        }
        field270 = arg0;
    }

    @ObfuscatedName("client.j(I)V")
    public void method164() {
        if (field270 == 1000) {
            return;
        }
        long var1 = class104.method567();
        int var3 = (int) (var1 - Statics.field2516);
        Statics.field2516 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2518 += var3;
        boolean var4;
        if (class153.field2526 == 0 && class153.field2521 == 0 && class153.field2524 == 0 && class153.field2528 == 0) {
            var4 = true;
        } else if (Statics.field2921 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2518 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2521 < 20 && class153.field2528 > 0) {
                        class154 var5 = (class154) class153.field2523.method3205();
                        class108 var6 = new class108(4);
                        var6.method2123(1);
                        var6.method2110((int) var5.field2894);
                        Statics.field2921.method2594(var6.field1842, 0, 4);
                        class153.field2520.method3193(var5, var5.field2894);
                        class153.field2528--;
                        class153.field2521++;
                    }
                    while (class153.field2526 < 20 && class153.field2524 > 0) {
                        class154 var7 = (class154) class153.field2529.method3281();
                        class108 var8 = new class108(4);
                        var8.method2123(0);
                        var8.method2110((int) var7.field2894);
                        Statics.field2921.method2594(var8.field1842, 0, 4);
                        var7.method3299();
                        class153.field2519.method3193(var7, var7.field2894);
                        class153.field2524--;
                        class153.field2526++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2921.method2589();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2518 = 0;
                        byte var11 = 0;
                        if (Statics.field2162 == null) {
                            var11 = 8;
                        } else if (class153.field2517 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2527.field1841;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2921.method2606(class153.field2527.field1842, class153.field2527.field1841, var12);
                            if (class153.field2522 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2527.field1842[class153.field2527.field1841 + var13] ^= class153.field2522;
                                }
                            }
                            class153.field2527.field1841 += var12;
                            if (class153.field2527.field1841 < var11) {
                                break;
                            }
                            if (Statics.field2162 == null) {
                                class153.field2527.field1841 = 0;
                                int var14 = class153.field2527.method2122();
                                int var15 = class153.field2527.method2124();
                                int var16 = class153.field2527.method2122();
                                int var17 = class153.field2527.method2127();
                                long var18 = (long) ((var14 << 16) + var15);
                                class154 var20 = (class154) class153.field2520.method3192(var18);
                                Statics.field1843 = true;
                                if (var20 == null) {
                                    var20 = (class154) class153.field2519.method3192(var18);
                                    Statics.field1843 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2162 = var20;
                                Statics.field2685 = new class108(var17 + var21 + Statics.field2162.field2538);
                                Statics.field2685.method2123(var16);
                                Statics.field2685.method2134(var17);
                                class153.field2517 = 8;
                                class153.field2527.field1841 = 0;
                            } else if (class153.field2517 == 0) {
                                if (class153.field2527.field1842[0] == -1) {
                                    class153.field2517 = 1;
                                    class153.field2527.field1841 = 0;
                                } else {
                                    Statics.field2162 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2685.field1842.length - Statics.field2162.field2538;
                            int var23 = 512 - class153.field2517;
                            if (var23 > var22 - Statics.field2685.field1841) {
                                var23 = var22 - Statics.field2685.field1841;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2921.method2606(Statics.field2685.field1842, Statics.field2685.field1841, var23);
                            if (class153.field2522 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2685.field1842[Statics.field2685.field1841 + var24] ^= class153.field2522;
                                }
                            }
                            Statics.field2685.field1841 += var23;
                            class153.field2517 += var23;
                            if (Statics.field2685.field1841 == var22) {
                                if (Statics.field2162.field2894 == 16711935L) {
                                    Statics.field2421 = Statics.field2685;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class150 var26 = class153.field2530[var25];
                                        if (var26 != null) {
                                            Statics.field2421.field1841 = var25 * 8 + 5;
                                            int var27 = Statics.field2421.method2127();
                                            int var28 = Statics.field2421.method2127();
                                            var26.method2788(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2525.reset();
                                    class153.field2525.update(Statics.field2685.field1842, 0, var22);
                                    int var29 = (int) class153.field2525.getValue();
                                    if (Statics.field2162.field2537 != var29) {
                                        try {
                                            Statics.field2921.method2593();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2532++;
                                        Statics.field2921 = null;
                                        class153.field2522 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2532 = 0;
                                    class153.field2533 = 0;
                                    Statics.field2162.field2536.method2789((int) (Statics.field2162.field2894 & 0xFFFFL), Statics.field2685.field1842, (Statics.field2162.field2894 & 0xFF0000L) == 16711680L, Statics.field1843);
                                }
                                Statics.field2162.method3324();
                                if (Statics.field1843) {
                                    class153.field2521--;
                                } else {
                                    class153.field2526--;
                                }
                                class153.field2517 = 0;
                                Statics.field2162 = null;
                                Statics.field2685 = null;
                            } else {
                                if (class153.field2517 != 512) {
                                    break;
                                }
                                class153.field2517 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2921.method2593();
                } catch (Exception var34) {
                }
                class153.field2533++;
                Statics.field2921 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method433();
        }
    }

    @ObfuscatedName("client.p(B)V")
    public void method433() {
        if (class153.field2532 >= 4) {
            this.method2621("js5crc");
            field270 = 1000;
            return;
        }
        if (class153.field2533 >= 4) {
            if (field270 <= 5) {
                this.method2621("js5io");
                field270 = 1000;
                return;
            }
            field275 = 3000;
            class153.field2533 = 3;
        }
        if (--field275 + 1 > 0) {
            return;
        }
        try {
            if (field504 == 0) {
                Statics.field1920 = Statics.field2056.method2490(Statics.field198, Statics.field256);
                field504++;
            }
            if (field504 == 1) {
                if (Statics.field1920.field2075 == 2) {
                    this.method166(-1);
                    return;
                }
                if (Statics.field1920.field2075 == 1) {
                    field504++;
                }
            }
            if (field504 == 2) {
                Statics.field1774 = new class132((Socket) Statics.field1920.field2079, Statics.field2056);
                class108 var1 = new class108(5);
                var1.method2123(15);
                var1.method2134(72);
                Statics.field1774.method2594(var1.field1842, 0, 5);
                field504++;
                Statics.field1008 = class104.method567();
            }
            if (field504 == 3) {
                if (field270 <= 5 || Statics.field1774.method2589() > 0) {
                    int var2 = Statics.field1774.method2591();
                    if (var2 != 0) {
                        this.method166(var2);
                        return;
                    }
                    field504++;
                } else if (class104.method567() - Statics.field1008 > 30000L) {
                    this.method166(-2);
                    return;
                }
            }
            if (field504 == 4) {
                Statics.method1776(Statics.field1774, field270 > 20);
                Statics.field1920 = null;
                Statics.field1774 = null;
                field504 = 0;
                field277 = 0;
            }
        } catch (IOException var4) {
            this.method166(-3);
        }
    }

    @ObfuscatedName("client.n(IB)V")
    public void method166(int arg0) {
        Statics.field1920 = null;
        Statics.field1774 = null;
        field504 = 0;
        if (Statics.field256 == Statics.field1827) {
            Statics.field256 = Statics.field1522;
        } else {
            Statics.field256 = Statics.field1827;
        }
        field277++;
        if (field277 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field270 <= 5) {
                this.method2621("js5connect_full");
                field270 = 1000;
            } else {
                field275 = 3000;
            }
        } else if (field277 >= 2 && arg0 == 6) {
            this.method2621("js5connect_outofdate");
            field270 = 1000;
        } else if (field277 >= 4) {
            if (field270 <= 5) {
                this.method2621("js5connect");
                field270 = 1000;
            } else {
                field275 = 3000;
            }
        }
    }

    @ObfuscatedName("t.r(I)V")
    public static void method449() {
        if (field273 == 0) {
            Statics.field2027 = new class80(4, 104, 104, class6.field84);
            for (int var0 = 0; var0 < 4; var0++) {
                field304[var0] = new class209(104, 104);
            }
            Statics.field120 = new class73(512, 512);
            class29.field658 = class145.field2177;
            class29.field682 = 5;
            field273 = 20;
        } else if (field273 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1500[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1636(var1, 500, 800, 512, 334);
            class29.field658 = class145.field2178;
            class29.field682 = 10;
            field273 = 30;
        } else if (field273 == 30) {
            Statics.field1436 = method2881(0, false, true, true);
            Statics.field176 = method2881(1, false, true, true);
            Statics.field1144 = method2881(2, true, false, true);
            Statics.field157 = method2881(3, false, true, true);
            Statics.field1864 = method2881(4, false, true, true);
            Statics.field519 = method2881(5, true, true, true);
            Statics.field2711 = method2881(6, true, true, false);
            Statics.field2852 = method2881(7, false, true, true);
            Statics.field276 = method2881(8, false, true, true);
            Statics.field219 = method2881(9, false, true, true);
            Statics.field1540 = method2881(10, false, true, true);
            Statics.field232 = method2881(11, false, true, true);
            Statics.field235 = method2881(12, false, true, true);
            Statics.field2992 = method2881(13, true, false, true);
            Statics.field1294 = method2881(14, false, true, false);
            Statics.field564 = method2881(15, false, true, true);
            class29.field658 = class145.field2333;
            class29.field682 = 20;
            field273 = 40;
        } else if (field273 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1436.method2786() * 4 / 100;
            int var8 = var7 + Statics.field176.method2786() * 4 / 100;
            int var9 = var8 + Statics.field1144.method2786() * 2 / 100;
            int var10 = var9 + Statics.field157.method2786() * 2 / 100;
            int var11 = var10 + Statics.field1864.method2786() * 6 / 100;
            int var12 = var11 + Statics.field519.method2786() * 4 / 100;
            int var13 = var12 + Statics.field2711.method2786() * 2 / 100;
            int var14 = var13 + Statics.field2852.method2786() * 60 / 100;
            int var15 = var14 + Statics.field276.method2786() * 2 / 100;
            int var16 = var15 + Statics.field219.method2786() * 2 / 100;
            int var17 = var16 + Statics.field1540.method2786() * 2 / 100;
            int var18 = var17 + Statics.field232.method2786() * 2 / 100;
            int var19 = var18 + Statics.field235.method2786() * 2 / 100;
            int var20 = var19 + Statics.field2992.method2786() * 2 / 100;
            int var21 = var20 + Statics.field1294.method2786() * 2 / 100;
            int var22 = var21 + Statics.field564.method2786() * 2 / 100;
            if (var22 == 100) {
                class29.field658 = class145.field2181;
                class29.field682 = 30;
                field273 = 45;
            } else {
                if (var22 != 0) {
                    class29.field658 = class145.field2266 + var22 + "%";
                }
                class29.field682 = 30;
            }
        } else if (field273 == 45) {
            class51.method3341(22050, !field249, 2);
            class165 var23 = new class165();
            var23.method3043(9, 128);
            Statics.field2102 = class51.method458(Statics.field2056, Statics.field2154, 0, 22050);
            Statics.field2102.method986(var23);
            class150 var24 = Statics.field564;
            class150 var25 = Statics.field1294;
            class150 var26 = Statics.field1864;
            Statics.field2731 = var24;
            Statics.field3013 = var25;
            Statics.field2729 = var26;
            Statics.field2730 = var23;
            Statics.field1884 = class51.method458(Statics.field2056, Statics.field2154, 1, 2048);
            Statics.field3011 = new class50();
            Statics.field1884.method986(Statics.field3011);
            Statics.field1772 = new class69(22050, Statics.field1108);
            class29.field658 = class145.field2182;
            class29.field682 = 35;
            field273 = 50;
        } else if (field273 == 50) {
            int var27 = 0;
            if (Statics.field1879 == null) {
                Statics.field1879 = class71.method613(Statics.field276, Statics.field2992, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field1095 == null) {
                Statics.field1095 = class71.method613(Statics.field276, Statics.field2992, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field2048 == null) {
                Statics.field2048 = class71.method613(Statics.field276, Statics.field2992, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class29.field658 = class145.field2183 + var27 * 100 / 3 + "%";
                class29.field682 = 40;
            } else {
                Statics.field2778 = new class148(true);
                class29.field658 = class145.field2184;
                class29.field682 = 40;
                field273 = 60;
            }
        } else if (field273 == 60) {
            class150 var28 = Statics.field1540;
            class150 var29 = Statics.field276;
            int var30 = 0;
            if (var28.method2738("title.jpg", "")) {
                var30++;
            }
            if (var29.method2738("logo", "")) {
                var30++;
            }
            if (var29.method2738("titlebox", "")) {
                var30++;
            }
            if (var29.method2738("titlebutton", "")) {
                var30++;
            }
            if (var29.method2738("runes", "")) {
                var30++;
            }
            if (var29.method2738("title_mute", "")) {
                var30++;
            }
            if (var29.method2739("options_radio_buttons,0")) {
                var30++;
            }
            if (var29.method2739("options_radio_buttons,2")) {
                var30++;
            }
            var29.method2738("sl_back", "");
            var29.method2738("sl_flags", "");
            var29.method2738("sl_arrows", "");
            var29.method2738("sl_stars", "");
            var29.method2738("sl_button", "");
            int var33 = class29.method1589();
            if (var30 < var33) {
                class29.field658 = class145.field2371 + var30 * 100 / var33 + "%";
                class29.field682 = 50;
            } else {
                class29.field658 = class145.field2202;
                class29.field682 = 50;
                method2355(5);
                field273 = 70;
            }
        } else if (field273 == 70) {
            if (Statics.field1144.method2724()) {
                class150 var34 = Statics.field1144;
                Statics.field974 = var34;
                class38.method2036(Statics.field1144);
                class150 var35 = Statics.field1144;
                class150 var36 = Statics.field2852;
                Statics.field971 = var35;
                Statics.field958 = var36;
                Statics.field967 = Statics.field971.method2730(3);
                class37.method34(Statics.field1144, Statics.field2852, field249);
                class150 var37 = Statics.field1144;
                class150 var38 = Statics.field2852;
                Statics.field817 = var37;
                Statics.field809 = var38;
                class150 var39 = Statics.field1144;
                class150 var40 = Statics.field2852;
                boolean var41 = field508;
                class205 var42 = Statics.field1879;
                Statics.field709 = var39;
                Statics.field1057 = var40;
                Statics.field1042 = var41;
                Statics.field1274 = Statics.field709.method2730(10);
                Statics.field66 = var42;
                class39.method551(Statics.field1144, Statics.field1436, Statics.field176);
                class40.method2352(Statics.field1144, Statics.field2852);
                class43.method130(Statics.field1144);
                class150 var43 = Statics.field1144;
                Statics.field1081 = var43;
                Statics.field1077 = Statics.field1081.method2730(16);
                class150 var44 = Statics.field157;
                class150 var45 = Statics.field2852;
                class150 var46 = Statics.field276;
                class150 var47 = Statics.field2992;
                Statics.field2587 = var44;
                Statics.field67 = var45;
                Statics.field619 = var46;
                Statics.field2543 = var47;
                Statics.field2584 = new class155[Statics.field2587.method2729()][];
                Statics.field2541 = new boolean[Statics.field2587.method2729()];
                class45.method122(Statics.field1144);
                class150 var48 = Statics.field1144;
                Statics.field1009 = var48;
                class29.field658 = class145.field2188;
                class29.field682 = 60;
                field273 = 80;
            } else {
                class29.field658 = class145.field2187 + Statics.field1144.method2792() + "%";
                class29.field682 = 60;
            }
        } else if (field273 == 80) {
            int var49 = 0;
            if (Statics.field251 == null) {
                Statics.field251 = class71.method593(Statics.field276, "compass", "");
            } else {
                var49++;
            }
            if (Statics.field322 == null) {
                Statics.field322 = class71.method593(Statics.field276, "mapedge", "");
            } else {
                var49++;
            }
            if (Statics.field1665 == null) {
                Statics.field1665 = class71.method134(Statics.field276, "mapscene", "");
            } else {
                var49++;
            }
            if (Statics.field6 == null) {
                Statics.field6 = Statics.method87(Statics.field276, "mapfunction", "");
            } else {
                var49++;
            }
            if (Statics.field2086 == null) {
                Statics.field2086 = Statics.method87(Statics.field276, "hitmarks", "");
            } else {
                var49++;
            }
            if (Statics.field216 == null) {
                Statics.field216 = Statics.method87(Statics.field276, "headicons_pk", "");
            } else {
                var49++;
            }
            if (Statics.field215 == null) {
                Statics.field215 = Statics.method87(Statics.field276, "headicons_prayer", "");
            } else {
                var49++;
            }
            if (Statics.field2681 == null) {
                Statics.field2681 = Statics.method87(Statics.field276, "headicons_hint", "");
            } else {
                var49++;
            }
            if (Statics.field801 == null) {
                Statics.field801 = Statics.method87(Statics.field276, "mapmarker", "");
            } else {
                var49++;
            }
            if (Statics.field1866 == null) {
                Statics.field1866 = Statics.method87(Statics.field276, "cross", "");
            } else {
                var49++;
            }
            if (Statics.field2146 == null) {
                Statics.field2146 = Statics.method87(Statics.field276, "mapdots", "");
            } else {
                var49++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = class71.method134(Statics.field276, "scrollbar", "");
            } else {
                var49++;
            }
            if (Statics.field2847 == null) {
                Statics.field2847 = class71.method134(Statics.field276, "mod_icons", "");
            } else {
                var49++;
            }
            if (Statics.field842 == null) {
                Statics.field842 = class71.method31(Statics.field276, "mapback", "");
            } else {
                var49++;
            }
            if (var49 < 14) {
                class29.field658 = class145.field2281 + var49 * 100 / 14 + "%";
                class29.field682 = 70;
            } else {
                Statics.field2961 = Statics.field2847;
                Statics.field322.method1427();
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 41.0D) - 20;
                for (int var54 = 0; var54 < Statics.field6.length; var54++) {
                    Statics.field6[var54].method1426(var50 + var53, var51 + var53, var52 + var53);
                }
                Statics.field1665[0].method1564(var50 + var53, var51 + var53, var52 + var53);
                Statics.field686 = new int[33];
                Statics.field2036 = new int[33];
                Statics.field128 = new int[151];
                Statics.field1270 = new int[151];
                for (int var55 = 0; var55 < 33; var55++) {
                    int var56 = 999;
                    int var57 = 0;
                    for (int var58 = 0; var58 < 34; var58++) {
                        if (Statics.field842.field1344[Statics.field842.field1339 * var55 + var58] == 0) {
                            if (var56 == 999) {
                                var56 = var58;
                            }
                        } else if (var56 != 999) {
                            var57 = var58;
                            break;
                        }
                    }
                    Statics.field686[var55] = var56;
                    Statics.field2036[var55] = var57 - var56;
                }
                for (int var59 = 5; var59 < 156; var59++) {
                    int var60 = 999;
                    int var61 = 0;
                    for (int var62 = 25; var62 < 172; var62++) {
                        if (Statics.field842.field1344[Statics.field842.field1339 * var59 + var62] == 0 && var62 > 34 || var59 > 34) {
                            if (var60 == 999) {
                                var60 = var62;
                            }
                        } else if (var60 != 999) {
                            var61 = var62;
                            break;
                        }
                    }
                    Statics.field128[var59 - 5] = var60 - 25;
                    Statics.field1270[var59 - 5] = var61 - var60;
                }
                class29.field658 = class145.field2190;
                class29.field682 = 70;
                field273 = 90;
            }
        } else if (field273 == 90) {
            if (Statics.field219.method2724()) {
                class89 var63 = new class89(Statics.field219, Statics.field276, 20, 0.8D, field249 ? 64 : 128);
                class85.method1783(var63);
                class85.method1838(0.8D);
                class29.field658 = class145.field2400;
                class29.field682 = 90;
                field273 = 110;
            } else {
                class29.field658 = class145.field2402 + Statics.field219.method2792() + "%";
                class29.field682 = 90;
            }
        } else if (field273 == 110) {
            Statics.field1701 = new class12();
            Statics.field2056.method2487(Statics.field1701, 10);
            class29.field658 = class145.field2193;
            class29.field682 = 94;
            field273 = 120;
        } else if (field273 == 120) {
            if (Statics.field1540.method2738("huffman", "")) {
                class103 var64 = new class103(Statics.field1540.method2779("huffman", ""));
                class203.method2040(var64);
                class29.field658 = class145.field2195;
                class29.field682 = 96;
                field273 = 130;
            } else {
                class29.field658 = class145.field2194 + "%";
                class29.field682 = 96;
            }
        } else if (field273 == 130) {
            if (!Statics.field157.method2724()) {
                class29.field658 = class145.field2196 + Statics.field157.method2792() * 4 / 5 + "%";
                class29.field682 = 100;
            } else if (!Statics.field235.method2724()) {
                class29.field658 = class145.field2196 + (80 + Statics.field235.method2792() / 6) + "%";
                class29.field682 = 100;
            } else if (Statics.field2992.method2724()) {
                class29.field658 = class145.field2230;
                class29.field682 = 100;
                field273 = 140;
            } else {
                class29.field658 = class145.field2196 + (96 + Statics.field2992.method2792() / 20) + "%";
                class29.field682 = 100;
            }
        } else if (field273 == 140) {
            method2355(10);
        }
    }

    @ObfuscatedName("er.s(IZZZB)Lej;")
    public static class150 method2881(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2095 != null) {
            var4 = new class123(arg0, class138.field2095, Statics.field1819[arg0], 1000000);
        }
        return new class150(var4, Statics.field2013, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.f(B)V")
    public static final void method1326() {
        try {
            if (field413 == 0) {
                if (Statics.field59 != null) {
                    Statics.field59.method2593();
                    Statics.field59 = null;
                }
                Statics.field617 = null;
                field490 = false;
                field279 = 0;
                field413 = 1;
            }
            if (field413 == 1) {
                if (Statics.field617 == null) {
                    Statics.field617 = Statics.field2056.method2490(Statics.field198, Statics.field256);
                }
                if (Statics.field617.field2075 == 2) {
                    throw new IOException();
                }
                if (Statics.field617.field2075 == 1) {
                    Statics.field59 = new class132((Socket) Statics.field617.field2079, Statics.field2056);
                    Statics.field617 = null;
                    field413 = 2;
                }
            }
            if (field413 == 2) {
                field454.field1841 = 0;
                field454.method2123(14);
                Statics.field59.method2594(field454.field1842, 0, 1);
                field411.field1841 = 0;
                field413 = 3;
            }
            if (field413 == 3) {
                if (Statics.field2102 != null) {
                    Statics.field2102.method994();
                }
                if (Statics.field1884 != null) {
                    Statics.field1884.method994();
                }
                int var0 = Statics.field59.method2591();
                if (Statics.field2102 != null) {
                    Statics.field2102.method994();
                }
                if (Statics.field1884 != null) {
                    Statics.field1884.method994();
                }
                if (var0 != 0) {
                    method2399(var0);
                    return;
                }
                field411.field1841 = 0;
                field413 = 5;
            }
            if (field413 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field454.field1841 = 0;
                field454.method2123(1);
                field454.method2123(class29.field673.method448());
                field454.method2134(var1[0]);
                field454.method2134(var1[1]);
                field454.method2134(var1[2]);
                field454.method2134(var1[3]);
                switch(class29.field673.field2426) {
                    case 0:
                    case 2:
                        field454.method2110(Statics.field1994);
                        field454.field1841 += 5;
                        break;
                    case 1:
                        field454.field1841 += 8;
                        break;
                    case 3:
                        field454.method2134((Integer) Statics.field1296.field135.get(class211.method1386(class29.field674)));
                        field454.field1841 += 4;
                }
                field454.method2304(class29.field651);
                field454.method2314(class5.field70, class5.field64);
                field477.field1841 = 0;
                if (field270 == 40) {
                    field477.method2123(18);
                } else {
                    field477.method2123(16);
                }
                field477.method2109(0);
                int var2 = field477.field1841;
                field477.method2134(72);
                field477.method2116(field454.field1842, 0, field454.field1841);
                int var3 = field477.field1841;
                field477.method2304(class29.field674);
                field477.method2123(field249 ? 1 : 0);
                class111 var4 = field477;
                byte[] var5 = new byte[24];
                try {
                    class138.field2103.method3535(0L);
                    class138.field2103.method3537(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var45) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2116(var5, 0, 24);
                class108 var9 = new class108(Statics.field2778.method2712());
                Statics.field2778.method2709(var9);
                field477.method2116(var9.field1842, 0, var9.field1842.length);
                field477.method2134(Statics.field1436.field2479);
                field477.method2134(Statics.field176.field2479);
                field477.method2134(Statics.field1144.field2479);
                field477.method2134(Statics.field157.field2479);
                field477.method2134(Statics.field1864.field2479);
                field477.method2134(Statics.field519.field2479);
                field477.method2134(Statics.field2711.field2479);
                field477.method2134(Statics.field2852.field2479);
                field477.method2134(Statics.field276.field2479);
                field477.method2134(Statics.field219.field2479);
                field477.method2134(Statics.field1540.field2479);
                field477.method2134(Statics.field232.field2479);
                field477.method2134(Statics.field235.field2479);
                field477.method2134(Statics.field2992.field2479);
                field477.method2134(Statics.field1294.field2479);
                field477.method2134(Statics.field564.field2479);
                field477.method2138(var1, var3, field477.field1841);
                field477.method2118(field477.field1841 - var2);
                Statics.field59.method2594(field477.field1842, 0, field477.field1841);
                field454.method2358(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field411.method2358(var1);
                field413 = 6;
            }
            if (field413 == 6 && Statics.field59.method2589() > 0) {
                int var11 = Statics.field59.method2591();
                if (var11 == 21 && field270 == 20) {
                    field413 = 7;
                } else if (var11 == 2) {
                    field413 = 9;
                } else if (var11 == 15 && field270 == 40) {
                    field454.field1841 = 0;
                    field411.field1841 = 0;
                    field290 = -1;
                    field427 = -1;
                    field397 = -1;
                    field296 = -1;
                    field289 = 0;
                    field511 = 0;
                    field299 = 0;
                    field390 = 0;
                    field250 = false;
                    field482 = 0;
                    field479 = 0;
                    for (int var12 = 0; var12 < field365.length; var12++) {
                        if (field365[var12] != null) {
                            field365[var12].field759 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field498.length; var13++) {
                        if (field498[var13] != null) {
                            field498[var13].field759 = -1;
                        }
                    }
                    class14.field197 = new class177(32);
                    method2355(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field506[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field280 < 1) {
                    field280++;
                    field413 = 0;
                } else {
                    method2399(var11);
                    return;
                }
            }
            if (field413 == 7 && Statics.field59.method2589() > 0) {
                field281 = (Statics.field59.method2591() + 3) * 60;
                field413 = 8;
            }
            if (field413 == 8) {
                field279 = 0;
                class29.method63(class145.field2200, class145.field2306, field281 / 60 + class145.field2361);
                if (--field281 <= 0) {
                    field413 = 0;
                }
            } else {
                if (field413 == 9 && Statics.field59.method2589() >= 13) {
                    boolean var15 = Statics.field59.method2591() == 1;
                    Statics.field59.method2606(field411.field1842, 0, 4);
                    field411.field1841 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field411.method2359() << 24;
                        int var18 = var17 | field411.method2359() << 16;
                        int var19 = var18 | field411.method2359() << 8;
                        int var20 = var19 | field411.method2359();
                        int var21 = class211.method1386(class29.field674);
                        if (Statics.field1296.field135.size() >= 10 && !Statics.field1296.field135.containsKey(var21)) {
                            Iterator var22 = Statics.field1296.field135.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field1296.field135.put(var21, var20);
                        class9.method27();
                    }
                    field415 = Statics.field59.method2591();
                    field417 = Statics.field59.method2591() == 1;
                    field252 = Statics.field59.method2591();
                    field252 <<= 0x8;
                    field252 += Statics.field59.method2591();
                    field347 = Statics.field59.method2591();
                    Statics.field59.method2606(field411.field1842, 0, 1);
                    field411.field1841 = 0;
                    field290 = field411.method2359();
                    Statics.field59.method2606(field411.field1842, 0, 2);
                    field411.field1841 = 0;
                    field289 = field411.method2124();
                    if (field347 == 1) {
                        try {
                            client var23 = Statics.field241;
                            JSObject.getWindow(var23).call("zap", (Object[]) null);
                        } catch (Throwable var44) {
                        }
                    } else {
                        try {
                            client var25 = Statics.field241;
                            JSObject.getWindow(var25).call("unzap", (Object[]) null);
                        } catch (Throwable var43) {
                        }
                    }
                    field413 = 10;
                }
                if (field413 != 10) {
                    field279++;
                    if (field279 > 2000) {
                        if (field280 < 1) {
                            if (Statics.field256 == Statics.field1827) {
                                Statics.field256 = Statics.field1522;
                            } else {
                                Statics.field256 = Statics.field1827;
                            }
                            field280++;
                            field413 = 0;
                        } else {
                            method2399(-3);
                        }
                    }
                } else if (Statics.field59.method2589() >= field289) {
                    field411.field1841 = 0;
                    Statics.field59.method2606(field411.field1842, 0, field289);
                    field255 = 1L;
                    field254 = -1;
                    Statics.field1701.field173 = 0;
                    Statics.field53 = true;
                    field259 = true;
                    field471 = -1L;
                    class192.field2908 = new class183();
                    field454.field1841 = 0;
                    field411.field1841 = 0;
                    field290 = -1;
                    field427 = -1;
                    field397 = -1;
                    field296 = -1;
                    field511 = 0;
                    field299 = 0;
                    field293 = 0;
                    field262 = 0;
                    field390 = 0;
                    field250 = false;
                    class129.field1998 = 0;
                    Statics.method2887();
                    field401 = 0;
                    field403 = false;
                    field341 = 0;
                    field308 = (int) (Math.random() * 100.0D) - 50;
                    field261 = (int) (Math.random() * 110.0D) - 55;
                    field312 = (int) (Math.random() * 80.0D) - 40;
                    field315 = (int) (Math.random() * 120.0D) - 60;
                    field317 = (int) (Math.random() * 30.0D) - 20;
                    field378 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field482 = 0;
                    field474 = -1;
                    field479 = 0;
                    field480 = 0;
                    field358 = class18.field513;
                    field366 = 0;
                    field284 = 0;
                    for (int var27 = 0; var27 < 2048; var27++) {
                        field365[var27] = null;
                        field370[var27] = null;
                    }
                    for (int var28 = 0; var28 < 32768; var28++) {
                        field498[var28] = null;
                    }
                    Statics.field695 = field365[2047] = new class3();
                    field445 = -1;
                    field382.method3223();
                    field375.method3223();
                    for (int var29 = 0; var29 < 4; var29++) {
                        for (int var30 = 0; var30 < 104; var30++) {
                            for (int var31 = 0; var31 < 104; var31++) {
                                field376[var29][var30][var31] = null;
                            }
                        }
                    }
                    field291 = new class180();
                    field288 = 0;
                    field500 = 0;
                    field467 = 0;
                    for (int var32 = 0; var32 < Statics.field1077; var32++) {
                        class47 var33 = class47.method890(var32);
                        if (var33 != null) {
                            class157.field2677[var32] = 0;
                            class157.field2678[var32] = 0;
                        }
                    }
                    for (int var34 = 0; var34 < field402.length; var34++) {
                        field402[var34] = -1;
                    }
                    field416 = -1;
                    if (field408 != -1) {
                        int var35 = field408;
                        if (var35 != -1 && Statics.field2541[var35]) {
                            Statics.field2587.method2732(var35);
                            if (Statics.field2584[var35] != null) {
                                boolean var36 = true;
                                for (int var37 = 0; var37 < Statics.field2584[var35].length; var37++) {
                                    if (Statics.field2584[var35][var37] != null) {
                                        if (Statics.field2584[var35][var37].field2551 == 2) {
                                            var36 = false;
                                        } else {
                                            Statics.field2584[var35][var37] = null;
                                        }
                                    }
                                }
                                if (var36) {
                                    Statics.field2584[var35] = null;
                                }
                                Statics.field2541[var35] = false;
                            }
                        }
                    }
                    for (class4 var38 = (class4) field409.method3205(); var38 != null; var38 = (class4) field409.method3196()) {
                        method1872(var38, true);
                    }
                    field408 = -1;
                    field409 = new class177(8);
                    field495 = null;
                    field250 = false;
                    field390 = 0;
                    field362.method2937((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var39 = 0; var39 < 8; var39++) {
                        field305[var39] = null;
                        field377[var39] = false;
                    }
                    class14.field197 = new class177(32);
                    field450 = true;
                    for (int var40 = 0; var40 < 100; var40++) {
                        field506[var40] = true;
                    }
                    field472 = null;
                    Statics.field2066 = 0;
                    Statics.field1854 = null;
                    for (int var41 = 0; var41 < 6; var41++) {
                        field509[var41] = new class201();
                    }
                    Statics.field2679 = null;
                    Statics.field1822 = -1;
                    method481(false);
                    field290 = -1;
                }
            }
        } catch (IOException var46) {
            if (field280 < 1) {
                if (Statics.field256 == Statics.field1827) {
                    Statics.field256 = Statics.field1522;
                } else {
                    Statics.field256 = Statics.field1827;
                }
                field280++;
                field413 = 0;
            } else {
                method2399(-2);
            }
        }
    }

    @ObfuscatedName("db.c(II)V")
    public static void method2399(int arg0) {
        if (arg0 == -3) {
            class29.method63(class145.field2204, class145.field2292, class145.field2252);
        } else if (arg0 == -2) {
            class29.method63(class145.field2207, class145.field2235, class145.field2251);
        } else if (arg0 == -1) {
            class29.method63(class145.field2374, class145.field2293, class145.field2212);
        } else if (arg0 == 3) {
            class29.method63(class145.field2375, class145.field2214, class145.field2215);
        } else if (arg0 == 4) {
            class29.method63(class145.field2216, class145.field2217, class145.field2218);
        } else if (arg0 == 5) {
            class29.method63(class145.field2278, class145.field2220, class145.field2221);
        } else if (arg0 == 6) {
            class29.method63(class145.field2222, class145.field2223, class145.field2359);
        } else if (arg0 == 7) {
            class29.method63(class145.field2225, class145.field2201, class145.field2227);
        } else if (arg0 == 8) {
            class29.method63(class145.field2228, class145.field2229, class145.field2192);
        } else if (arg0 == 9) {
            class29.method63(class145.field2173, class145.field2232, class145.field2224);
        } else if (arg0 == 10) {
            class29.method63(class145.field2234, class145.field2185, class145.field2206);
        } else if (arg0 == 11) {
            class29.method63(class145.field2237, class145.field2238, class145.field2342);
        } else if (arg0 == 12) {
            class29.method63(class145.field2240, class145.field2241, class145.field2242);
        } else if (arg0 == 13) {
            class29.method63(class145.field2243, class145.field2244, class145.field2245);
        } else if (arg0 == 14) {
            class29.method63(class145.field2383, class145.field2247, class145.field2248);
        } else if (arg0 == 16) {
            class29.method63(class145.field2249, class145.field2250, class145.field2203);
        } else if (arg0 == 17) {
            class29.method63(class145.field2394, class145.field2316, class145.field2254);
        } else if (arg0 == 18) {
            class29.method63(class145.field2255, class145.field2256, class145.field2272);
        } else if (arg0 == 19) {
            class29.method63(class145.field2219, class145.field2259, class145.field2260);
        } else if (arg0 == 20) {
            class29.method63(class145.field2261, class145.field2262, class145.field2403);
        } else if (arg0 == 22) {
            class29.method63(class145.field2264, class145.field2265, class145.field2369);
        } else if (arg0 == 23) {
            class29.method63(class145.field2267, class145.field2268, class145.field2269);
        } else if (arg0 == 24) {
            class29.method63(class145.field2270, class145.field2271, class145.field2236);
        } else if (arg0 == 25) {
            class29.method63(class145.field2344, class145.field2274, class145.field2275);
        } else if (arg0 == 26) {
            class29.method63(class145.field2284, class145.field2186, class145.field2295);
        } else if (arg0 == 27) {
            class29.method63(class145.field2395, class145.field2280, class145.field2258);
        } else if (arg0 == 31) {
            class29.method63(class145.field2288, class145.field2380, class145.field2349);
        } else if (arg0 == 32) {
            class29.method63(class145.field2291, class145.field2253, class145.field2341);
        } else if (arg0 == 37) {
            class29.method63(class145.field2294, class145.field2289, class145.field2296);
        } else if (arg0 == 38) {
            class29.method63(class145.field2297, class145.field2298, class145.field2299);
        } else if (arg0 == 55) {
            class29.method63(class145.field2300, class145.field2191, class145.field2302);
        } else if (arg0 == 56) {
            class29.method63(class145.field2303, class145.field2304, class145.field2277);
            method2355(11);
            return;
        } else if (arg0 == 57) {
            class29.method63(class145.field2305, class145.field2165, class145.field2308);
            method2355(11);
            return;
        } else {
            class29.method63(class145.field2309, class145.field2405, class145.field2311);
        }
        method2355(10);
    }

    @ObfuscatedName("t.t(B)V")
    public static final void method447() {
        if (Statics.field59 != null) {
            Statics.field59.method2593();
            Statics.field59 = null;
        }
        method81();
        Statics.field2027.method1692();
        for (int var0 = 0; var0 < 4; var0++) {
            field304[var0].method3588();
        }
        System.gc();
        class164.field2732 = 1;
        Statics.field1022 = null;
        Statics.field2032 = -1;
        Statics.field226 = -1;
        Statics.field2734 = 0;
        Statics.field2733 = false;
        Statics.field61 = 2;
        field484 = -1;
        field485 = false;
        class21.method548();
        method2355(10);
    }

    @ObfuscatedName("a.i(I)V")
    public static final void method81() {
        class42.method2535();
        class38.method1777();
        class41.field959.method3157();
        class37.field845.method3157();
        class37.field843.method3157();
        class37.field876.method3157();
        class37.field848.method3157();
        class36.method32();
        class46.field1059.method3157();
        class46.field1030.method3157();
        class46.field1031.method3157();
        class39.field913.method3157();
        class39.field914.method3157();
        class40.field937.method3157();
        class40.field944.method3157();
        class43.field992.method3157();
        class47.method586();
        class160.method2689();
        class155.field2544.method3157();
        class155.field2545.method3157();
        class155.field2552.method3157();
        ((class89) Statics.field1497).method1875();
        class19.field525.method3157();
        Statics.field1436.method2728();
        Statics.field176.method2728();
        Statics.field157.method2728();
        Statics.field1864.method2728();
        Statics.field519.method2728();
        Statics.field2711.method2728();
        Statics.field2852.method2728();
        Statics.field276.method2728();
        Statics.field219.method2728();
        Statics.field1540.method2728();
        Statics.field232.method2728();
        Statics.field235.method2728();
    }

    @ObfuscatedName("c.u(I)V")
    public static final void method155() {
        if (Statics.field1884 != null) {
            Statics.field1884.method987();
        }
        if (Statics.field2102 != null) {
            Statics.field2102.method987();
        }
    }

    @ObfuscatedName("dv.y(I)V")
    public static final void method2448() {
        for (int var0 = 0; var0 < field341; var0++) {
            int var10002 = field383[var0]--;
            if (field383[var0] >= -10) {
                class53 var2 = field260[var0];
                if (var2 == null) {
                    class53 var10000 = (class53) null;
                    var2 = class53.method1048(Statics.field1864, field489[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field383[var0] += var2.method1046();
                    field260[var0] = var2;
                }
                if (field383[var0] < 0) {
                    int var9;
                    if (field342[var0] == 0) {
                        var9 = field314;
                    } else {
                        int var3 = (field342[var0] & 0xFF) * 128;
                        int var4 = field342[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field695.field763;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field342[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field695.field735;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field383[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field487 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class57 var10 = var2.method1045().method1089(Statics.field1772);
                        class59 var11 = class59.method1110(var10, 100, var9);
                        var11.method1113(field282[var0] - 1);
                        Statics.field3011.method956(var11);
                    }
                    field383[var0] = -100;
                }
            } else {
                field341--;
                for (int var1 = var0; var1 < field341; var1++) {
                    field489[var1] = field489[var1 + 1];
                    field260[var1] = field260[var1 + 1];
                    field282[var1] = field282[var1 + 1];
                    field383[var1] = field383[var1 + 1];
                    field342[var1] = field342[var1 + 1];
                }
                var0--;
            }
        }
        if (field485 && !class164.method2436()) {
            if (field483 != 0 && field484 != -1) {
                class164.method1775(Statics.field2711, field484, 0, field483, false);
            }
            field485 = false;
        }
    }

    @ObfuscatedName("ag.o(Lap;IIII)V")
    public static void method682(class39 arg0, int arg1, int arg2, int arg3) {
        if (field341 >= 50 || field487 == 0 || arg0.field915 == null || arg1 >= arg0.field915.length) {
            return;
        }
        int var4 = arg0.field915[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field489[field341] = var5;
        field282[field341] = var6;
        field383[field341] = 0;
        field260[field341] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field342[field341] = (var8 << 16) + (var9 << 8) + var7;
        field341++;
    }

    @ObfuscatedName("k.m(I)V")
    public static final void method20() {
        if (field249 && Statics.field170 != field298) {
            method1075(Statics.field1822, Statics.field641, Statics.field170, Statics.field695.field788[0], Statics.field695.field789[0]);
        } else if (Statics.field170 != field474) {
            field474 = Statics.field170;
            int var0 = Statics.field170;
            int[] var1 = Statics.field120.field1325;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field72[var0][var6][var4] & 0x18) == 0) {
                        Statics.field2027.method1635(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field72[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field2027.method1635(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field120.method1425();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field72[var0][var10][var9] & 0x18) == 0) {
                        method2671(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field72[var0 + 1][var10][var9] & 0x8) != 0) {
                        method2671(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field475 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field2027.method1630(Statics.field170, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class37.method2581(var14).field871;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field304[Statics.field170].field3007;
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
                            field478[field475] = Statics.field6[var15];
                            field476[field475] = var16;
                            field438[field475] = var17;
                            field475++;
                        }
                    }
                }
            }
            Statics.field1877.method1416();
        }
    }

    @ObfuscatedName("at.h(III)V")
    public static final void method748(int arg0, int arg1) {
        if (field482 != 0 && field482 != 3 || class129.field2009 != 1 && Statics.field330 || class129.field2009 != 4) {
            return;
        }
        int var2 = class129.field2010 - 25 - arg0;
        int var3 = class129.field1997 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field378 + field315 & 0x7FF;
        int var5 = class85.field1500[var4];
        int var6 = class85.field1501[var4];
        int var7 = (field317 + 256) * var5 >> 8;
        int var8 = (field317 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field695.field763 + var9 >> 7;
        int var12 = Statics.field695.field735 - var10 >> 7;
        field454.method2357(119);
        field454.method2123(18);
        field454.method2153(Statics.field1821 + var11);
        field454.method2123(class126.field1971[82] ? (class126.field1971[81] ? 2 : 1) : 0);
        field454.method2152(Statics.field990 + var12);
        field454.method2123(var2);
        field454.method2123(var3);
        field454.method2109(field378);
        field454.method2123(57);
        field454.method2123(field315);
        field454.method2123(field317);
        field454.method2123(89);
        field454.method2109(Statics.field695.field763);
        field454.method2109(Statics.field695.field735);
        field454.method2123(63);
        field479 = var11;
        field480 = var12;
    }

    @ObfuscatedName("as.x(B)V")
    public static final void method1025() {
        for (int var0 = -1; var0 < field366; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field367[var0];
            }
            class3 var2 = field365[var1];
            if (var2 != null && var2.field774 > 0) {
                var2.field774--;
                if (var2.field774 == 0) {
                    var2.field791 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field284; var3++) {
            int var4 = field285[var3];
            class31 var5 = field498[var4];
            if (var5 != null && var5.field774 > 0) {
                var5.field774--;
                if (var5.field774 == 0) {
                    var5.field791 = null;
                }
            }
        }
    }

    @ObfuscatedName("aw.d(Ljava/lang/String;I)V")
    public static final void method813(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1296.field133 = !Statics.field1296.field133;
            class9.method27();
            if (Statics.field1296.field133) {
                class10.method486(99, "", "Roofs are now all hidden");
            } else {
                class10.method486(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field415 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field379 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field379 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field293 > 0) {
                    method447();
                } else {
                    method2355(40);
                    Statics.field988 = Statics.field59;
                    Statics.field59 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field423 == 2) {
                throw new RuntimeException();
            }
        }
        field454.method2357(181);
        field454.method2123(arg0.length() + 1);
        field454.method2304(arg0);
    }

    @ObfuscatedName("ai.ac(I)V")
    public static final void method671() {
        int var0 = Statics.field1667 * 128 + 64;
        int var1 = Statics.field2897 * 128 + 64;
        int var2 = method2060(var0, var1, Statics.field170) - Statics.field1860;
        if (Statics.field1909 < var0) {
            Statics.field1909 += Statics.field1091 * (var0 - Statics.field1909) / 1000 + Statics.field178;
            if (Statics.field1909 > var0) {
                Statics.field1909 = var0;
            }
        }
        if (Statics.field1909 > var0) {
            Statics.field1909 -= Statics.field1091 * (Statics.field1909 - var0) / 1000 + Statics.field178;
            if (Statics.field1909 < var0) {
                Statics.field1909 = var0;
            }
        }
        if (Statics.field1586 < var2) {
            Statics.field1586 += Statics.field1091 * (var2 - Statics.field1586) / 1000 + Statics.field178;
            if (Statics.field1586 > var2) {
                Statics.field1586 = var2;
            }
        }
        if (Statics.field1586 > var2) {
            Statics.field1586 -= Statics.field1091 * (Statics.field1586 - var2) / 1000 + Statics.field178;
            if (Statics.field1586 < var2) {
                Statics.field1586 = var2;
            }
        }
        if (Statics.field1985 < var1) {
            Statics.field1985 += Statics.field1091 * (var1 - Statics.field1985) / 1000 + Statics.field178;
            if (Statics.field1985 > var1) {
                Statics.field1985 = var1;
            }
        }
        if (Statics.field1985 > var1) {
            Statics.field1985 -= Statics.field1091 * (Statics.field1985 - var1) / 1000 + Statics.field178;
            if (Statics.field1985 < var1) {
                Statics.field1985 = var1;
            }
        }
        int var3 = Statics.field520 * 128 + 64;
        int var4 = Statics.field1308 * 128 + 64;
        int var5 = method2060(var3, var4, Statics.field170) - Statics.field1924;
        int var6 = var3 - Statics.field1909;
        int var7 = var5 - Statics.field1586;
        int var8 = var4 - Statics.field1985;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2777 < var10) {
            Statics.field2777 += Statics.field669 * (var10 - Statics.field2777) / 1000 + Statics.field699;
            if (Statics.field2777 > var10) {
                Statics.field2777 = var10;
            }
        }
        if (Statics.field2777 > var10) {
            Statics.field2777 -= Statics.field669 * (Statics.field2777 - var10) / 1000 + Statics.field699;
            if (Statics.field2777 < var10) {
                Statics.field2777 = var10;
            }
        }
        int var12 = var11 - Statics.field1814;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1814 += Statics.field669 * var12 / 1000 + Statics.field699;
            Statics.field1814 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1814 -= Statics.field669 * -var12 / 1000 + Statics.field699;
            Statics.field1814 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1814;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1814 = var11;
        }
    }

    @ObfuscatedName("w.ax(I)V")
    public static final void method124() {
        for (int var0 = -1; var0 < field366; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field367[var0];
            }
            class3 var2 = field365[var1];
            if (var2 != null) {
                method1774(var2, 1);
            }
        }
    }

    @ObfuscatedName("aa.af(I)V")
    public static final void method904() {
        for (int var0 = 0; var0 < field284; var0++) {
            int var1 = field285[var0];
            class31 var2 = field498[var1];
            if (var2 != null) {
                method1774(var2, var2.field706.field808);
            }
        }
    }

    @ObfuscatedName("cj.am(Lao;II)V")
    public static final void method1774(class34 arg0, int arg1) {
        if (arg0.field755 > field418) {
            int var2 = arg0.field755 - field418;
            int var3 = arg0.field775 * 128 + arg0.field738 * 64;
            int var4 = arg0.field777 * 128 + arg0.field738 * 64;
            arg0.field763 += (var3 - arg0.field763) / var2;
            arg0.field735 += (var4 - arg0.field735) / var2;
            arg0.field790 = 0;
            if (arg0.field781 == 0) {
                arg0.field784 = 1024;
            }
            if (arg0.field781 == 1) {
                arg0.field784 = 1536;
            }
            if (arg0.field781 == 2) {
                arg0.field784 = 0;
            }
            if (arg0.field781 == 3) {
                arg0.field784 = 512;
            }
        } else if (arg0.field780 >= field418) {
            if (field418 == arg0.field780 || arg0.field736 == -1 || arg0.field768 != 0 || arg0.field739 + 1 > class39.method2315(arg0.field736).field917[arg0.field766]) {
                int var5 = arg0.field780 - arg0.field755;
                int var6 = field418 - arg0.field755;
                int var7 = arg0.field775 * 128 + arg0.field738 * 64;
                int var8 = arg0.field777 * 128 + arg0.field738 * 64;
                int var9 = arg0.field776 * 128 + arg0.field738 * 64;
                int var10 = arg0.field778 * 128 + arg0.field738 * 64;
                arg0.field763 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field735 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field790 = 0;
            if (arg0.field781 == 0) {
                arg0.field784 = 1024;
            }
            if (arg0.field781 == 1) {
                arg0.field784 = 1536;
            }
            if (arg0.field781 == 2) {
                arg0.field784 = 0;
            }
            if (arg0.field781 == 3) {
                arg0.field784 = 512;
            }
            arg0.field748 = arg0.field784;
        } else {
            arg0.field782 = arg0.field793;
            if (arg0.field737 == 0) {
                arg0.field790 = 0;
            } else {
                label359: {
                    if (arg0.field736 != -1 && arg0.field768 == 0) {
                        class39 var11 = class39.method2315(arg0.field736);
                        if (arg0.field779 > 0 && var11.field926 == 0) {
                            arg0.field790++;
                            break label359;
                        }
                        if (arg0.field779 <= 0 && var11.field927 == 0) {
                            arg0.field790++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field763;
                    int var13 = arg0.field735;
                    int var14 = arg0.field788[arg0.field737 - 1] * 128 + arg0.field738 * 64;
                    int var15 = arg0.field789[arg0.field737 - 1] * 128 + arg0.field738 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field784 = 1280;
                            } else if (var13 > var15) {
                                arg0.field784 = 1792;
                            } else {
                                arg0.field784 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field784 = 768;
                            } else if (var13 > var15) {
                                arg0.field784 = 256;
                            } else {
                                arg0.field784 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field784 = 1024;
                        } else if (var13 > var15) {
                            arg0.field784 = 0;
                        }
                        int var16 = arg0.field784 - arg0.field748 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field743;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field792;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field745;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field787;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field792;
                        }
                        arg0.field782 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class31) {
                            var19 = ((class31) arg0).field706.field836;
                        }
                        if (var19) {
                            if (arg0.field784 != arg0.field748 && arg0.field759 == -1 && arg0.field751 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field737 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field737 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field737 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        } else {
                            if (arg0.field737 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field737 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field737 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        }
                        if (arg0.field749[arg0.field737 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field792 == arg0.field782 && arg0.field746 != -1) {
                            arg0.field782 = arg0.field746;
                        }
                        if (var12 < var14) {
                            arg0.field763 += var18;
                            if (arg0.field763 > var14) {
                                arg0.field763 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field763 -= var18;
                            if (arg0.field763 < var14) {
                                arg0.field763 = var14;
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
                        if (arg0.field763 == var14 && arg0.field735 == var15) {
                            arg0.field737--;
                            if (arg0.field779 > 0) {
                                arg0.field779--;
                            }
                        }
                    } else {
                        arg0.field763 = var14;
                        arg0.field735 = var15;
                    }
                }
            }
        }
        if (arg0.field763 < 128 || arg0.field735 < 128 || arg0.field763 >= 13184 || arg0.field735 >= 13184) {
            arg0.field736 = -1;
            arg0.field770 = -1;
            arg0.field755 = 0;
            arg0.field780 = 0;
            arg0.field763 = arg0.field788[0] * 128 + arg0.field738 * 64;
            arg0.field735 = arg0.field789[0] * 128 + arg0.field738 * 64;
            arg0.method572();
        }
        if (Statics.field695 == arg0 && (arg0.field763 < 1536 || arg0.field735 < 1536 || arg0.field763 >= 11776 || arg0.field735 >= 11776)) {
            arg0.field736 = -1;
            arg0.field770 = -1;
            arg0.field755 = 0;
            arg0.field780 = 0;
            arg0.field763 = arg0.field788[0] * 128 + arg0.field738 * 64;
            arg0.field735 = arg0.field789[0] * 128 + arg0.field738 * 64;
            arg0.method572();
        }
        method1417(arg0);
        arg0.field765 = false;
        if (arg0.field782 != -1) {
            class39 var20 = class39.method2315(arg0.field782);
            if (var20 == null || var20.field925 == null) {
                arg0.field782 = -1;
            } else {
                arg0.field764++;
                if (arg0.field750 < var20.field925.length && arg0.field764 > var20.field917[arg0.field750]) {
                    arg0.field764 = 1;
                    arg0.field750++;
                    method682(var20, arg0.field750, arg0.field763, arg0.field735);
                }
                if (arg0.field750 >= var20.field925.length) {
                    arg0.field764 = 0;
                    arg0.field750 = 0;
                    method682(var20, arg0.field750, arg0.field763, arg0.field735);
                }
            }
        }
        if (arg0.field770 != -1 && field418 >= arg0.field773) {
            if (arg0.field771 < 0) {
                arg0.field771 = 0;
            }
            int var21 = class40.method2885(arg0.field770).field940;
            if (var21 == -1) {
                arg0.field770 = -1;
            } else {
                class39 var22 = class39.method2315(var21);
                if (var22 == null || var22.field925 == null) {
                    arg0.field770 = -1;
                } else {
                    arg0.field772++;
                    if (arg0.field771 < var22.field925.length && arg0.field772 > var22.field917[arg0.field771]) {
                        arg0.field772 = 1;
                        arg0.field771++;
                        method682(var22, arg0.field771, arg0.field763, arg0.field735);
                    }
                    if (arg0.field771 >= var22.field925.length && (arg0.field771 < 0 || arg0.field771 >= var22.field925.length)) {
                        arg0.field770 = -1;
                    }
                }
            }
        }
        if (arg0.field736 != -1 && arg0.field768 <= 1) {
            class39 var23 = class39.method2315(arg0.field736);
            if (var23.field926 == 1 && arg0.field779 > 0 && arg0.field755 <= field418 && arg0.field780 < field418) {
                arg0.field768 = 1;
                return;
            }
        }
        if (arg0.field736 != -1 && arg0.field768 == 0) {
            class39 var24 = class39.method2315(arg0.field736);
            if (var24 == null || var24.field925 == null) {
                arg0.field736 = -1;
            } else {
                arg0.field739++;
                if (arg0.field766 < var24.field925.length && arg0.field739 > var24.field917[arg0.field766]) {
                    arg0.field739 = 1;
                    arg0.field766++;
                    method682(var24, arg0.field766, arg0.field763, arg0.field735);
                }
                if (arg0.field766 >= var24.field925.length) {
                    arg0.field766 -= var24.field919;
                    arg0.field769++;
                    if (arg0.field769 >= var24.field931) {
                        arg0.field736 = -1;
                    } else if (arg0.field766 >= 0 && arg0.field766 < var24.field925.length) {
                        method682(var24, arg0.field766, arg0.field763, arg0.field735);
                    } else {
                        arg0.field736 = -1;
                    }
                }
                arg0.field765 = var24.field934;
            }
        }
        if (arg0.field768 > 0) {
            arg0.field768--;
        }
    }

    @ObfuscatedName("ba.ah(Lao;S)V")
    public static final void method1417(class34 arg0) {
        if (arg0.field751 == 0) {
            return;
        }
        if (arg0.field759 != -1 && arg0.field759 < 32768) {
            class31 var1 = field498[arg0.field759];
            if (var1 != null) {
                int var2 = arg0.field763 - var1.field763;
                int var3 = arg0.field735 - var1.field735;
                if (var2 != 0 || var3 != 0) {
                    arg0.field784 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field759 >= 32768) {
            int var4 = arg0.field759 - 32768;
            if (field252 == var4) {
                var4 = 2047;
            }
            class3 var5 = field365[var4];
            if (var5 != null) {
                int var6 = arg0.field763 - var5.field763;
                int var7 = arg0.field735 - var5.field735;
                if (var6 != 0 || var7 != 0) {
                    arg0.field784 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field760 != 0 || arg0.field761 != 0) && (arg0.field737 == 0 || arg0.field790 > 0)) {
            int var8 = arg0.field763 - (arg0.field760 * 64 - Statics.field1821 * 64 - Statics.field1821 * 64);
            int var9 = arg0.field735 - (arg0.field761 * 64 - Statics.field990 * 64 - Statics.field990 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field784 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field760 = 0;
            arg0.field761 = 0;
        }
        int var10 = arg0.field784 - arg0.field748 & 0x7FF;
        if (var10 == 0) {
            arg0.field785 = 0;
            return;
        }
        arg0.field785++;
        if (var10 > 1024) {
            arg0.field748 -= arg0.field751;
            boolean var11 = true;
            if (var10 < arg0.field751 || var10 > 2048 - arg0.field751) {
                arg0.field748 = arg0.field784;
                var11 = false;
            }
            if (arg0.field793 == arg0.field782 && (arg0.field785 > 25 || var11)) {
                if (arg0.field747 == -1) {
                    arg0.field782 = arg0.field792;
                } else {
                    arg0.field782 = arg0.field747;
                }
            }
        } else {
            arg0.field748 += arg0.field751;
            boolean var12 = true;
            if (var10 < arg0.field751 || var10 > 2048 - arg0.field751) {
                arg0.field748 = arg0.field784;
                var12 = false;
            }
            if (arg0.field793 == arg0.field782 && (arg0.field785 > 25 || var12)) {
                if (arg0.field741 == -1) {
                    arg0.field782 = arg0.field792;
                } else {
                    arg0.field782 = arg0.field741;
                }
            }
        }
        arg0.field748 &= 0x7FF;
    }

    @ObfuscatedName("ao.ar(Lk;III)V")
    public static void method587(class3 arg0, int arg1, int arg2) {
        if (arg0.field736 == arg1 && arg1 != -1) {
            int var3 = class39.method2315(arg1).field921;
            if (var3 == 1) {
                arg0.field766 = 0;
                arg0.field739 = 0;
                arg0.field768 = arg2;
                arg0.field769 = 0;
            }
            if (var3 == 2) {
                arg0.field769 = 0;
            }
        } else if (arg1 == -1 || arg0.field736 == -1 || class39.method2315(arg1).field922 >= class39.method2315(arg0.field736).field922) {
            arg0.field736 = arg1;
            arg0.field766 = 0;
            arg0.field739 = 0;
            arg0.field768 = arg2;
            arg0.field769 = 0;
            arg0.field779 = arg0.field737;
        }
    }

    @ObfuscatedName("b.ad(Ljava/lang/String;ZI)V")
    public static final void method86(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1095.method3450(arg0, 250);
        int var6 = Statics.field1095.method3424(arg0, 250) * 13;
        class74.method1513(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1515(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1095.method3419(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method885(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2784(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2154.getGraphics();
            Statics.field1877.method1377(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2154.repaint();
        }
    }

    @ObfuscatedName("a.ao(IIIIB)V")
    public static final void method75(int arg0, int arg1, int arg2, int arg3) {
        class74.method1526(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1779();
        field349++;
        method4(class30.field703);
        boolean var4 = false;
        if (field445 >= 0) {
            for (int var5 = 0; var5 < field366; var5++) {
                if (field445 == field367[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method4(class30.field696);
        }
        method504(true);
        method4(var4 ? class30.field698 : class30.field700);
        method504(false);
        for (class7 var6 = (class7) field382.method3226(); var6 != null; var6 = (class7) field382.method3231()) {
            if (Statics.field170 != var6.field92 || field418 > var6.field91) {
                var6.method3324();
            } else if (field418 >= var6.field112) {
                if (var6.field99 > 0) {
                    class31 var7 = field498[var6.field99 - 1];
                    if (var7 != null && var7.field763 >= 0 && var7.field763 < 13312 && var7.field735 >= 0 && var7.field735 < 13312) {
                        var6.method74(var7.field763, var7.field735, method2060(var7.field763, var7.field735, var6.field92) - var6.field96, field418);
                    }
                }
                if (var6.field99 < 0) {
                    int var8 = -var6.field99 - 1;
                    class3 var9;
                    if (field252 == var8) {
                        var9 = Statics.field695;
                    } else {
                        var9 = field365[var8];
                    }
                    if (var9 != null && var9.field763 >= 0 && var9.field763 < 13312 && var9.field735 >= 0 && var9.field735 < 13312) {
                        var6.method74(var9.field763, var9.field735, method2060(var9.field763, var9.field735, var6.field92) - var6.field96, field418);
                    }
                }
                var6.method79(field350);
                Statics.field2027.method1662(Statics.field170, (int) var6.field103, (int) var6.field102, (int) var6.field105, 60, var6, var6.field117, -1, false);
            }
        }
        for (class27 var10 = (class27) field375.method3226(); var10 != null; var10 = (class27) field375.method3231()) {
            if (Statics.field170 != var10.field629 || var10.field627) {
                var10.method3324();
            } else if (field418 >= var10.field628) {
                var10.method501(field350);
                if (var10.field627) {
                    var10.method3324();
                } else {
                    Statics.field2027.method1662(var10.field629, var10.field630, var10.field631, var10.field635, 60, var10, 0, -1, false);
                }
            }
        }
        if (!field494) {
            int var11 = field422;
            if (field297 / 256 > var11) {
                var11 = field297 / 256;
            }
            if (field333[4] && field497[4] + 128 > var11) {
                var11 = field497[4] + 128;
            }
            int var12 = field378 + field312 & 0x7FF;
            method2882(Statics.field816, method2060(Statics.field695.field763, Statics.field695.field735, Statics.field170) - 50, Statics.field559, var11, var12, var11 * 3 + 600);
        }
        int var25;
        if (field494) {
            var25 = method135();
        } else {
            int var13;
            if (Statics.field1296.field133) {
                var13 = Statics.field170;
            } else {
                int var14 = 3;
                if (Statics.field2777 < 310) {
                    int var15 = Statics.field1909 >> 7;
                    int var16 = Statics.field1985 >> 7;
                    int var17 = Statics.field695.field763 >> 7;
                    int var18 = Statics.field695.field735 >> 7;
                    if ((class6.field72[Statics.field170][var15][var16] & 0x4) != 0) {
                        var14 = Statics.field170;
                    }
                    int var19;
                    if (var17 > var15) {
                        var19 = var17 - var15;
                    } else {
                        var19 = var15 - var17;
                    }
                    int var20;
                    if (var18 > var16) {
                        var20 = var18 - var16;
                    } else {
                        var20 = var16 - var18;
                    }
                    if (var19 > var20) {
                        int var21 = var20 * 65536 / var19;
                        int var22 = 32768;
                        while (var15 != var17) {
                            if (var15 < var17) {
                                var15++;
                            } else if (var15 > var17) {
                                var15--;
                            }
                            if ((class6.field72[Statics.field170][var15][var16] & 0x4) != 0) {
                                var14 = Statics.field170;
                            }
                            var22 += var21;
                            if (var22 >= 65536) {
                                var22 -= 65536;
                                if (var16 < var18) {
                                    var16++;
                                } else if (var16 > var18) {
                                    var16--;
                                }
                                if ((class6.field72[Statics.field170][var15][var16] & 0x4) != 0) {
                                    var14 = Statics.field170;
                                }
                            }
                        }
                    } else {
                        int var23 = var19 * 65536 / var20;
                        int var24 = 32768;
                        while (var16 != var18) {
                            if (var16 < var18) {
                                var16++;
                            } else if (var16 > var18) {
                                var16--;
                            }
                            if ((class6.field72[Statics.field170][var15][var16] & 0x4) != 0) {
                                var14 = Statics.field170;
                            }
                            var24 += var23;
                            if (var24 >= 65536) {
                                var24 -= 65536;
                                if (var15 < var17) {
                                    var15++;
                                } else if (var15 > var17) {
                                    var15--;
                                }
                                if ((class6.field72[Statics.field170][var15][var16] & 0x4) != 0) {
                                    var14 = Statics.field170;
                                }
                            }
                        }
                    }
                }
                if ((class6.field72[Statics.field170][Statics.field695.field763 >> 7][Statics.field695.field735 >> 7] & 0x4) != 0) {
                    var14 = Statics.field170;
                }
                var13 = var14;
            }
            var25 = var13;
        }
        int var26 = Statics.field1909;
        int var27 = Statics.field1586;
        int var28 = Statics.field1985;
        int var29 = Statics.field2777;
        int var30 = Statics.field1814;
        for (int var31 = 0; var31 < 5; var31++) {
            if (field333[var31]) {
                int var32 = (int) (Math.random() * (double) (field243[var31] * 2 + 1) - (double) field243[var31] + Math.sin((double) field398[var31] / 100.0D * (double) field499[var31]) * (double) field497[var31]);
                if (var31 == 0) {
                    Statics.field1909 += var32;
                }
                if (var31 == 1) {
                    Statics.field1586 += var32;
                }
                if (var31 == 2) {
                    Statics.field1985 += var32;
                }
                if (var31 == 3) {
                    Statics.field1814 = Statics.field1814 + var32 & 0x7FF;
                }
                if (var31 == 4) {
                    Statics.field2777 += var32;
                    if (Statics.field2777 < 128) {
                        Statics.field2777 = 128;
                    }
                    if (Statics.field2777 > 383) {
                        Statics.field2777 = 383;
                    }
                }
            }
        }
        int var33 = class129.field2003;
        int var34 = class129.field2004;
        if (class129.field2009 != 0) {
            var33 = class129.field2010;
            var34 = class129.field1997;
        }
        if (var33 >= arg0 && var33 < arg0 + arg2 && var34 >= arg1 && var34 < arg1 + arg3) {
            class99.field1760 = true;
            class99.field1750 = 0;
            class99.field1761 = var33 - arg0;
            class99.field1717 = var34 - arg1;
        } else {
            class99.field1760 = false;
            class99.field1750 = 0;
        }
        method155();
        class74.method1513(arg0, arg1, arg2, arg3, 0);
        method155();
        Statics.field2027.method1639(Statics.field1909, Statics.field1586, Statics.field1985, Statics.field2777, Statics.field1814, var25);
        method155();
        Statics.field2027.method1615();
        field338 = 0;
        boolean var35 = false;
        int var36 = -1;
        for (int var37 = -1; var37 < field366 + field284; var37++) {
            class34 var38;
            if (var37 == -1) {
                var38 = Statics.field695;
            } else if (var37 < field366) {
                var38 = field365[field367[var37]];
                if (field445 == field367[var37]) {
                    var35 = true;
                    var36 = var37;
                    continue;
                }
            } else {
                var38 = field498[field285[var37 - field366]];
            }
            method2704(var38, var37, arg0, arg1, arg2, arg3);
        }
        if (var35) {
            method2704(field365[field445], var36, arg0, arg1, arg2, arg3);
        }
        for (int var39 = 0; var39 < field338; var39++) {
            int var40 = field340[var39];
            int var41 = field310[var39];
            int var42 = field343[var39];
            int var43 = field501[var39];
            boolean var44 = true;
            while (var44) {
                var44 = false;
                for (int var45 = 0; var45 < var39; var45++) {
                    if (var41 + 2 > field310[var45] - field501[var45] && var41 - var43 < field310[var45] + 2 && var40 - var42 < field343[var45] + field340[var45] && var40 + var42 > field340[var45] - field343[var45] && field310[var45] - field501[var45] < var41) {
                        var41 = field310[var45] - field501[var45];
                        var44 = true;
                    }
                }
            }
            field258 = field340[var39];
            field351 = field310[var39] = var41;
            String var46 = field360[var39];
            if (field410 == 0) {
                int var47 = 16776960;
                if (field458[var39] < 6) {
                    var47 = field448[field458[var39]];
                }
                if (field458[var39] == 6) {
                    var47 = field349 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field458[var39] == 7) {
                    var47 = field349 % 20 < 10 ? 255 : 65535;
                }
                if (field458[var39] == 8) {
                    var47 = field349 % 20 < 10 ? 45056 : 8454016;
                }
                if (field458[var39] == 9) {
                    int var48 = 150 - field346[var39];
                    if (var48 < 50) {
                        var47 = var48 * 1280 + 16711680;
                    } else if (var48 < 100) {
                        var47 = 16776960 - (var48 - 50) * 327680;
                    } else if (var48 < 150) {
                        var47 = (var48 - 100) * 5 + 65280;
                    }
                }
                if (field458[var39] == 10) {
                    int var49 = 150 - field346[var39];
                    if (var49 < 50) {
                        var47 = var49 * 5 + 16711680;
                    } else if (var49 < 100) {
                        var47 = 16711935 - (var49 - 50) * 327680;
                    } else if (var49 < 150) {
                        var47 = (var49 - 100) * 327680 + 255 - (var49 - 100) * 5;
                    }
                }
                if (field458[var39] == 11) {
                    int var50 = 150 - field346[var39];
                    if (var50 < 50) {
                        var47 = 16777215 - var50 * 327685;
                    } else if (var50 < 100) {
                        var47 = (var50 - 50) * 327685 + 65280;
                    } else if (var50 < 150) {
                        var47 = 16777215 - (var50 - 100) * 327680;
                    }
                }
                if (field345[var39] == 0) {
                    Statics.field2048.method3428(var46, field258 + arg0, field351 + arg1, var47, 0);
                }
                if (field345[var39] == 1) {
                    Statics.field2048.method3430(var46, field258 + arg0, field351 + arg1, var47, 0, field349);
                }
                if (field345[var39] == 2) {
                    Statics.field2048.method3438(var46, field258 + arg0, field351 + arg1, var47, 0, field349);
                }
                if (field345[var39] == 3) {
                    Statics.field2048.method3443(var46, field258 + arg0, field351 + arg1, var47, 0, field349, 150 - field346[var39]);
                }
                if (field345[var39] == 4) {
                    int var51 = (150 - field346[var39]) * (Statics.field2048.method3477(var46) + 100) / 150;
                    class74.method1511(field258 + arg0 - 50, arg1, field258 + arg0 + 50, arg1 + arg3);
                    Statics.field2048.method3483(var46, field258 + arg0 + 50 - var51, field351 + arg1, var47, 0);
                    class74.method1526(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field345[var39] == 5) {
                    int var52 = 150 - field346[var39];
                    int var53 = 0;
                    if (var52 < 25) {
                        var53 = var52 - 25;
                    } else if (var52 > 125) {
                        var53 = var52 - 125;
                    }
                    class74.method1511(arg0, field351 + arg1 - Statics.field2048.field2958 - 1, arg0 + arg2, field351 + arg1 + 5);
                    Statics.field2048.method3428(var46, field258 + arg0, field351 + arg1 + var53, var47, 0);
                    class74.method1526(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2048.method3428(var46, field258 + arg0, field351 + arg1, 16776960, 0);
            }
        }
        if (field262 == 2) {
            method149((field265 - Statics.field1821 << 7) + field268, (field368 - Statics.field990 << 7) + field269, field267 * 2);
            if (field258 > -1 && field418 % 20 < 10) {
                Statics.field2681[0].method1435(field258 + arg0 - 12, field351 + arg1 - 28);
            }
        }
        ((class89) Statics.field1497).method1874(field350);
        method5(arg0, arg1, arg2, arg3);
        Statics.field1909 = var26;
        Statics.field1586 = var27;
        Statics.field1985 = var28;
        Statics.field2777 = var29;
        Statics.field1814 = var30;
        if (field450 && class153.method777(true, false) == 0) {
            field450 = false;
        }
        if (field450) {
            class74.method1513(arg0, arg1, arg2, arg3, 0);
            method86(class145.field2174, false);
        }
    }

    @ObfuscatedName("e.ae(Lam;I)V")
    public static final void method4(class30 arg0) {
        if (Statics.field695.field763 >> 7 == field479 && Statics.field695.field735 >> 7 == field480) {
            field479 = 0;
        }
        int var1 = field366;
        if (class30.field703 == arg0 || class30.field696 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field703 == arg0) {
                var3 = Statics.field695;
                var4 = 33538048;
            } else if (class30.field696 == arg0) {
                var3 = field365[field445];
                var4 = field445 << 14;
            } else {
                var3 = field365[field367[var2]];
                var4 = field367[var2] << 14;
                if (class30.field698 == arg0 && field445 == field367[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method25() && !var3.field52) {
                var3.field50 = false;
                if ((field249 && field366 > 50 || field366 > 200) && class30.field703 != arg0 && var3.field793 == var3.field782) {
                    var3.field50 = true;
                }
                int var5 = var3.field763 >> 7;
                int var6 = var3.field735 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field418 < var3.field40 || field418 >= var3.field34) {
                        if ((var3.field763 & 0x7F) == 64 && (var3.field735 & 0x7F) == 64) {
                            if (field349 == field348[var5][var6]) {
                                continue;
                            }
                            field348[var5][var6] = field349;
                        }
                        var3.field39 = method2060(var3.field763, var3.field735, Statics.field170);
                        Statics.field2027.method1662(Statics.field170, var3.field763, var3.field735, var3.field39, 60, var3, var3.field748, var4, var3.field765);
                    } else {
                        var3.field50 = false;
                        var3.field39 = method2060(var3.field763, var3.field735, Statics.field170);
                        Statics.field2027.method1613(Statics.field170, var3.field763, var3.field735, var3.field39, 60, var3, var3.field748, var4, var3.field46, var3.field47, var3.field33, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.ab(ZB)V")
    public static final void method504(boolean arg0) {
        for (int var1 = 0; var1 < field284; var1++) {
            class31 var2 = field498[field285[var1]];
            int var3 = (field285[var1] << 14) + 536870912;
            if (var2 != null && var2.method25() && var2.field706.field839 == arg0 && var2.field706.method609()) {
                int var4 = var2.field763 >> 7;
                int var5 = var2.field735 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field738 == 1 && (var2.field763 & 0x7F) == 64 && (var2.field735 & 0x7F) == 64) {
                        if (field349 == field348[var4][var5]) {
                            continue;
                        }
                        field348[var4][var5] = field349;
                    }
                    if (!var2.field706.field835) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2027.method1662(Statics.field170, var2.field763, var2.field735, method2060(var2.field763 + (var2.field738 * 64 - 64), var2.field735 + (var2.field738 * 64 - 64), Statics.field170), var2.field738 * 64 - 64 + 60, var2, var2.field748, var3, var2.field765);
                }
            }
        }
    }

    @ObfuscatedName("p.ai(B)I")
    public static final int method135() {
        if (Statics.field1296.field133) {
            return Statics.field170;
        } else {
            int var0 = method2060(Statics.field1909, Statics.field1985, Statics.field170);
            return var0 - Statics.field1586 >= 800 || (class6.field72[Statics.field170][Statics.field1909 >> 7][Statics.field1985 >> 7] & 0x4) == 0 ? 3 : Statics.field170;
        }
    }

    @ObfuscatedName("eg.ag(Lao;IIIIII)V")
    public static final void method2704(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field706;
            if (var6.field832 != null) {
                var6 = var6.method611();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field366) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field52) {
                return;
            }
            if (var8.field35 != -1 || var8.field45 != -1) {
                Statics.method2707(arg0, arg0.field756 + 15);
                if (field258 > -1) {
                    if (var8.field35 != -1) {
                        Statics.field216[var8.field35].method1435(field258 + arg2 - 12, field351 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field45 != -1) {
                        Statics.field215[var8.field45].method1435(field258 + arg2 - 12, field351 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field262 == 10 && field462 == field367[arg1]) {
                Statics.method2707(arg0, arg0.field756 + 15);
                if (field258 > -1) {
                    Statics.field2681[1].method1435(field258 + arg2 - 12, field351 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field706;
            if (var9.field832 != null) {
                var9 = var9.method611();
            }
            if (var9.field807 >= 0 && var9.field807 < Statics.field215.length) {
                Statics.method2707(arg0, arg0.field756 + 15);
                if (field258 > -1) {
                    Statics.field215[var9.field807].method1435(field258 + arg2 - 12, field351 + arg3 - 30);
                }
            }
            if (field262 == 1 && field420 == field285[arg1 - field366] && field418 % 20 < 10) {
                Statics.method2707(arg0, arg0.field756 + 15);
                if (field258 > -1) {
                    Statics.field2681[0].method1435(field258 + arg2 - 12, field351 + arg3 - 28);
                }
            }
        }
        if (arg0.field791 != null && (arg1 >= field366 || !arg0.field740 && (field463 == 4 || !arg0.field734 && (field463 == 0 || field463 == 3 || field463 == 1 && method1959(((class3) arg0).field48, false))))) {
            Statics.method2707(arg0, arg0.field756);
            if (field258 > -1 && field338 < field339) {
                field343[field338] = Statics.field2048.method3477(arg0.field791) / 2;
                field501[field338] = Statics.field2048.field2958;
                field340[field338] = field258;
                field310[field338] = field351;
                field458[field338] = arg0.field753;
                field345[field338] = arg0.field752;
                field346[field338] = arg0.field774;
                field360[field338] = arg0.field791;
                field338++;
            }
        }
        if (arg0.field786 > field418) {
            Statics.method2707(arg0, arg0.field756 + 15);
            if (field258 > -1) {
                int var10;
                if (arg1 < field366) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field706;
                    var10 = var11.field830;
                }
                int var12 = arg0.field757 * var10 / arg0.field758;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field757 > 0) {
                    var12 = 1;
                }
                class74.method1513(field258 + arg2 - var10 / 2, field351 + arg3 - 3, var12, 5, 65280);
                class74.method1513(field258 + arg2 - var10 / 2 + var12, field351 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field762[var13] > field418) {
                Statics.method2707(arg0, arg0.field756 / 2);
                if (field258 > -1) {
                    if (var13 == 1) {
                        field351 -= 20;
                    }
                    if (var13 == 2) {
                        field258 -= 15;
                        field351 -= 10;
                    }
                    if (var13 == 3) {
                        field258 += 15;
                        field351 -= 10;
                    }
                    Statics.field2086[arg0.field754[var13]].method1435(field258 + arg2 - 12, field351 + arg3 - 12);
                    Statics.field1879.method3428(Integer.toString(arg0.field744[var13]), field258 + arg2 - 1, field351 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ay.ap(I)V")
    public static final void method808() {
        field364 = 0;
        int var0 = (Statics.field695.field763 >> 7) + Statics.field1821;
        int var1 = (Statics.field695.field735 >> 7) + Statics.field990;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field364 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field364 = 1;
        }
        if (field364 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field364 = 0;
        }
    }

    @ObfuscatedName("v.at(IIIIB)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3) {
        if (field355 == 1) {
            Statics.field1866[field361 / 100].method1435(field286 - 8, field353 - 8);
        }
        if (field355 == 2) {
            Statics.field1866[field361 / 100 + 4].method1435(field286 - 8, field353 - 8);
        }
        method808();
        if (!field379) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1095.method3427("Fps:" + field2050, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field249) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field249) {
            var8 = 16711680;
        }
        Statics.field1095.method3427("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("s.an(IIII)V")
    public static final void method149(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field258 = -1;
            field351 = -1;
            return;
        }
        int var3 = method2060(arg0, arg1, Statics.field170) - arg2;
        int var4 = arg0 - Statics.field1909;
        int var5 = var3 - Statics.field1586;
        int var6 = arg1 - Statics.field1985;
        int var7 = class85.field1500[Statics.field2777];
        int var8 = class85.field1501[Statics.field2777];
        int var9 = class85.field1500[Statics.field1814];
        int var10 = class85.field1501[Statics.field1814];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field258 = (var11 << 9) / var15 + 256;
            field351 = (var14 << 9) / var15 + 167;
        } else {
            field258 = -1;
            field351 = -1;
        }
    }

    @ObfuscatedName("do.ay(IIII)I")
    public static final int method2060(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field72[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field84[var5][var3][var4] + class6.field84[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field84[var5][var3][var4 + 1] + class6.field84[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("er.aw(IIIIIIB)V")
    public static final void method2882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1500[var6];
            int var12 = class85.field1501[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1500[var7];
            int var15 = class85.field1501[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1909 = arg0 - var8;
        Statics.field1586 = arg1 - var9;
        Statics.field1985 = arg2 - var10;
        Statics.field2777 = arg3;
        Statics.field1814 = arg4;
    }

    @ObfuscatedName("m.ak(ZI)V")
    public static final void method481(boolean arg0) {
        field329 = arg0;
        if (!field329) {
            int var1 = field411.method2150();
            int var2 = (field289 - field411.field1841) / 16;
            Statics.field214 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field214[var3][var4] = field411.method2127();
                }
            }
            int var5 = field411.method2150();
            int var6 = field411.method2150();
            int var7 = field411.method2154();
            int var8 = field411.method2156();
            Statics.field2069 = new int[var2];
            Statics.field1526 = new int[var2];
            Statics.field1315 = new int[var2];
            Statics.field975 = new byte[var2][];
            Statics.field1075 = new byte[var2][];
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
                        Statics.field2069[var10] = var13;
                        Statics.field1526[var10] = Statics.field519.method2735("m" + var11 + "_" + var12);
                        Statics.field1315[var10] = Statics.field519.method2735("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1075(var6, var5, var7, var8, var1);
            return;
        }
        int var14 = field411.method2150();
        int var15 = field411.method2124();
        field411.method2383();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field411.method2366(1);
                    if (var19 == 1) {
                        field306[var16][var17][var18] = field411.method2366(26);
                    } else {
                        field306[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field411.method2361();
        int var20 = (field289 - field411.field1841) / 16;
        Statics.field214 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field214[var21][var22] = field411.method2162();
            }
        }
        int var23 = field411.method2124();
        int var24 = field411.method2122();
        int var25 = field411.method2155();
        Statics.field2069 = new int[var20];
        Statics.field1526 = new int[var20];
        Statics.field1315 = new int[var20];
        Statics.field975 = new byte[var20][];
        Statics.field1075 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field306[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2069[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2069[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1526[var26] = Statics.field519.method2735("m" + var35 + "_" + var36);
                            Statics.field1315[var26] = Statics.field519.method2735("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1075(var23, var15, var24, var25, var14);
    }

    @ObfuscatedName("bq.aq(IIIIII)V")
    public static final void method1075(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1822 == arg0 && Statics.field641 == arg1 && field298 == arg2 || !field249) {
            return;
        }
        Statics.field1822 = arg0;
        Statics.field641 = arg1;
        field298 = arg2;
        if (!field249) {
            field298 = 0;
        }
        method2355(25);
        method86(class145.field2174, true);
        int var5 = Statics.field1821;
        int var6 = Statics.field990;
        Statics.field1821 = (arg0 - 6) * 8;
        Statics.field990 = (arg1 - 6) * 8;
        int var7 = Statics.field1821 - var5;
        int var8 = Statics.field990 - var6;
        int var9 = Statics.field1821;
        int var10 = Statics.field990;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field498[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field788[var13] -= var7;
                    var12.field789[var13] -= var8;
                }
                var12.field763 -= var7 * 128;
                var12.field735 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field365[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field788[var16] -= var7;
                    var15.field789[var16] -= var8;
                }
                var15.field763 -= var7 * 128;
                var15.field735 -= var8 * 128;
            }
        }
        Statics.field170 = arg2;
        Statics.field695.method573(arg3, arg4, false);
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
                        field376[var27][var23][var24] = field376[var27][var25][var26];
                    } else {
                        field376[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field291.method3226(); var28 != null; var28 = (class15) field291.method3231()) {
            var28.field204 -= var7;
            var28.field207 -= var8;
            if (var28.field204 < 0 || var28.field207 < 0 || var28.field204 >= 104 || var28.field207 >= 104) {
                var28.method3324();
            }
        }
        if (field479 != 0) {
            field479 -= var7;
            field480 -= var8;
        }
        field341 = 0;
        field494 = false;
        field474 = -1;
        field375.method3223();
        field382.method3223();
    }

    @ObfuscatedName("e.aa(ZI)V")
    public static final void method2(boolean arg0) {
        method155();
        field292++;
        if (field292 < 50 && !arg0) {
            return;
        }
        field292 = 0;
        if (field490 || Statics.field59 == null) {
            return;
        }
        field454.method2357(63);
        try {
            Statics.field59.method2594(field454.field1842, 0, field454.field1841);
            field454.field1841 = 0;
        } catch (IOException var2) {
            field490 = true;
        }
    }

    @ObfuscatedName("em.aj(IIIIIB)V")
    public static final void method2671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2027.method1627(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2027.method1631(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field120.field1325;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method2581(var12);
            if (var13.field872 == -1) {
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
                class75 var14 = Statics.field1665[var13.field872];
                if (var14 != null) {
                    int var15 = (var13.field858 * 4 - var14.field1339) / 2;
                    int var16 = (var13.field859 * 4 - var14.field1343) / 2;
                    var14.method1565(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field859) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2027.method1671(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2027.method1631(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method2581(var21);
            if (var22.field872 != -1) {
                class75 var23 = Statics.field1665[var22.field872];
                if (var23 != null) {
                    int var24 = (var22.field858 * 4 - var23.field1339) / 2;
                    int var25 = (var22.field859 * 4 - var23.field1343) / 2;
                    var23.method1565(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field859) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field120.field1325;
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
        int var29 = Statics.field2027.method1630(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method2581(var30);
        if (var31.field872 == -1) {
            return;
        }
        class75 var32 = Statics.field1665[var31.field872];
        if (var32 != null) {
            int var33 = (var31.field858 * 4 - var32.field1339) / 2;
            int var34 = (var31.field859 * 4 - var32.field1343) / 2;
            var32.method1565(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field859) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ea.au(I)V")
    public static final void method2694() {
        if (field290 == 45) {
            int var0 = field411.method2154();
            int var1 = (var0 >> 4 & 0x7) + Statics.field175;
            int var2 = (var0 & 0x7) + Statics.field620;
            int var3 = field411.method2122();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field307[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method2059(Statics.field170, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field290 == 104) {
            int var7 = field411.method2154();
            int var8 = (var7 >> 4 & 0x7) + Statics.field175;
            int var9 = (var7 & 0x7) + Statics.field620;
            int var10 = field411.method2150();
            int var11 = field411.method2150();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class26 var12 = new class26();
                var12.field626 = var10;
                var12.field616 = var11;
                if (field376[Statics.field170][var8][var9] == null) {
                    field376[Statics.field170][var8][var9] = new class180();
                }
                field376[Statics.field170][var8][var9].method3224(var12);
                method3148(var8, var9);
            }
        } else if (field290 == 138) {
            int var13 = field411.method2148();
            int var14 = (var13 >> 4 & 0x7) + Statics.field175;
            int var15 = (var13 & 0x7) + Statics.field620;
            int var16 = field411.method2150();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class180 var17 = field376[Statics.field170][var14][var15];
                if (var17 != null) {
                    for (class26 var18 = (class26) var17.method3226(); var18 != null; var18 = (class26) var17.method3231()) {
                        if ((var16 & 0x7FFF) == var18.field626) {
                            var18.method3324();
                            break;
                        }
                    }
                    if (var17.method3226() == null) {
                        field376[Statics.field170][var14][var15] = null;
                    }
                    method3148(var14, var15);
                }
            }
        } else if (field290 == 249) {
            int var19 = field411.method2122();
            int var20 = (var19 >> 4 & 0x7) + Statics.field175;
            int var21 = (var19 & 0x7) + Statics.field620;
            int var22 = var20 + field411.method2190();
            int var23 = var21 + field411.method2190();
            int var24 = field411.method2125();
            int var25 = field411.method2124();
            int var26 = field411.method2122() * 4;
            int var27 = field411.method2122() * 4;
            int var28 = field411.method2124();
            int var29 = field411.method2124();
            int var30 = field411.method2122();
            int var31 = field411.method2122();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var25 != 65535) {
                int var32 = var20 * 128 + 64;
                int var33 = var21 * 128 + 64;
                int var34 = var22 * 128 + 64;
                int var35 = var23 * 128 + 64;
                class7 var36 = new class7(var25, Statics.field170, var32, var33, method2060(var32, var33, Statics.field170) - var26, field418 + var28, field418 + var29, var30, var31, var24, var27);
                var36.method74(var34, var35, method2060(var34, var35, Statics.field170) - var27, field418 + var28);
                field382.method3224(var36);
            }
        } else if (field290 == 229) {
            int var37 = field411.method2122();
            int var38 = (var37 >> 4 & 0x7) + Statics.field175;
            int var39 = (var37 & 0x7) + Statics.field620;
            int var40 = field411.method2124();
            int var41 = field411.method2124();
            int var42 = field411.method2124();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class180 var43 = field376[Statics.field170][var38][var39];
                if (var43 != null) {
                    for (class26 var44 = (class26) var43.method3226(); var44 != null; var44 = (class26) var43.method3231()) {
                        if ((var40 & 0x7FFF) == var44.field626 && var44.field616 == var41) {
                            var44.field616 = var42;
                            break;
                        }
                    }
                    method3148(var38, var39);
                }
            }
        } else if (field290 == 41) {
            int var45 = field411.method2122();
            int var46 = (var45 >> 4 & 0x7) + Statics.field175;
            int var47 = (var45 & 0x7) + Statics.field620;
            int var48 = field411.method2172();
            int var49 = var48 >> 2;
            int var50 = var48 & 0x3;
            int var51 = field307[var49];
            int var52 = field411.method2150();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                method2059(Statics.field170, var46, var47, var51, var52, var49, var50, 0, -1);
            }
        } else if (field290 == 111) {
            int var53 = field411.method2122();
            int var54 = (var53 >> 4 & 0x7) + Statics.field175;
            int var55 = (var53 & 0x7) + Statics.field620;
            int var56 = field411.method2124();
            int var57 = field411.method2122();
            int var58 = field411.method2124();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                int var59 = var54 * 128 + 64;
                int var60 = var55 * 128 + 64;
                class27 var61 = new class27(var56, Statics.field170, var59, var60, method2060(var59, var60, Statics.field170) - var57, var58, field418);
                field375.method3224(var61);
            }
        } else {
            if (field290 == 225) {
                int var62 = field411.method2122();
                int var63 = (var62 >> 4 & 0x7) + Statics.field175;
                int var64 = (var62 & 0x7) + Statics.field620;
                int var65 = field411.method2124();
                int var66 = field411.method2122();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = field411.method2122();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (Statics.field695.field788[0] >= var63 - var70 && Statics.field695.field788[0] <= var63 + var70 && Statics.field695.field789[0] >= var64 - var70 && Statics.field695.field789[0] <= var64 + var70 && field487 != 0 && var68 > 0 && field341 < 50) {
                        field489[field341] = var65;
                        field282[field341] = var68;
                        field383[field341] = var69;
                        field260[field341] = null;
                        field342[field341] = (var63 << 16) + (var64 << 8) + var67;
                        field341++;
                    }
                }
            }
            if (field290 == 163) {
                int var71 = field411.method2154();
                int var72 = (var71 >> 4 & 0x7) + Statics.field175;
                int var73 = (var71 & 0x7) + Statics.field620;
                int var74 = field411.method2122();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field307[var75];
                int var78 = field411.method2124();
                if (var72 >= 0 && var73 >= 0 && var72 < 103 && var73 < 103) {
                    if (var77 == 0) {
                        class81 var79 = Statics.field2027.method1623(Statics.field170, var72, var73);
                        if (var79 != null) {
                            int var80 = var79.field1440 >> 14 & 0x7FFF;
                            if (var75 == 2) {
                                var79.field1441 = new class11(var80, 2, var76 + 4, Statics.field170, var72, var73, var78, false, var79.field1441);
                                var79.field1439 = new class11(var80, 2, var76 + 1 & 0x3, Statics.field170, var72, var73, var78, false, var79.field1439);
                            } else {
                                var79.field1441 = new class11(var80, var75, var76, Statics.field170, var72, var73, var78, false, var79.field1441);
                            }
                        }
                    }
                    if (var77 == 1) {
                        class88 var81 = Statics.field2027.method1624(Statics.field170, var72, var73);
                        if (var81 != null) {
                            int var82 = var81.field1520 >> 14 & 0x7FFF;
                            if (var75 == 4 || var75 == 5) {
                                var81.field1518 = new class11(var82, 4, var76, Statics.field170, var72, var73, var78, false, var81.field1518);
                            } else if (var75 == 6) {
                                var81.field1518 = new class11(var82, 4, var76 + 4, Statics.field170, var72, var73, var78, false, var81.field1518);
                            } else if (var75 == 7) {
                                var81.field1518 = new class11(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field170, var72, var73, var78, false, var81.field1518);
                            } else if (var75 == 8) {
                                var81.field1518 = new class11(var82, 4, var76 + 4, Statics.field170, var72, var73, var78, false, var81.field1518);
                                var81.field1523 = new class11(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field170, var72, var73, var78, false, var81.field1523);
                            }
                        }
                    }
                    if (var77 == 2) {
                        class92 var83 = Statics.field2027.method1762(Statics.field170, var72, var73);
                        if (var75 == 11) {
                            var75 = 10;
                        }
                        if (var83 != null) {
                            var83.field1570 = new class11(var83.field1579 >> 14 & 0x7FFF, var75, var76, Statics.field170, var72, var73, var78, false, var83.field1570);
                        }
                    }
                    if (var77 == 3) {
                        class87 var84 = Statics.field2027.method1626(Statics.field170, var72, var73);
                        if (var84 != null) {
                            var84.field1505 = new class11(var84.field1509 >> 14 & 0x7FFF, 22, var76, Statics.field170, var72, var73, var78, false, var84.field1505);
                        }
                    }
                }
            } else if (field290 == 57) {
                byte var85 = field411.method2244();
                int var86 = field411.method2154();
                int var87 = (var86 >> 4 & 0x7) + Statics.field175;
                int var88 = (var86 & 0x7) + Statics.field620;
                int var89 = field411.method2150();
                int var90 = field411.method2150();
                int var91 = field411.method2155();
                byte var92 = field411.method2149();
                int var93 = field411.method2122();
                int var94 = var93 >> 2;
                int var95 = var93 & 0x3;
                int var96 = field307[var94];
                int var97 = field411.method2155();
                byte var98 = field411.method2244();
                byte var99 = field411.method2244();
                class3 var100;
                if (field252 == var89) {
                    var100 = Statics.field695;
                } else {
                    var100 = field365[var89];
                }
                if (var100 != null) {
                    class37 var101 = class37.method2581(var91);
                    int var102;
                    int var103;
                    if (var95 == 1 || var95 == 3) {
                        var102 = var101.field859;
                        var103 = var101.field858;
                    } else {
                        var102 = var101.field858;
                        var103 = var101.field859;
                    }
                    int var104 = (var102 >> 1) + var87;
                    int var105 = (var102 + 1 >> 1) + var87;
                    int var106 = (var103 >> 1) + var88;
                    int var107 = (var103 + 1 >> 1) + var88;
                    int[][] var108 = class6.field84[Statics.field170];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var87 << 7) + (var102 << 6);
                    int var111 = (var88 << 7) + (var103 << 6);
                    class99 var112 = var101.method635(var94, var95, var108, var110, var109, var111);
                    if (var112 != null) {
                        method2059(Statics.field170, var87, var88, var96, -1, 0, 0, var90 + 1, var97 + 1);
                        var100.field40 = field418 + var90;
                        var100.field34 = field418 + var97;
                        var100.field44 = var112;
                        var100.field42 = var87 * 128 + var102 * 64;
                        var100.field43 = var88 * 128 + var103 * 64;
                        var100.field41 = var109;
                        if (var98 > var85) {
                            byte var113 = var98;
                            var98 = var85;
                            var85 = var113;
                        }
                        if (var99 > var92) {
                            byte var114 = var99;
                            var99 = var92;
                            var92 = var114;
                        }
                        var100.field46 = var87 + var98;
                        var100.field33 = var85 + var87;
                        var100.field47 = var88 + var99;
                        var100.field49 = var88 + var92;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.al(IIIIIIIIIB)V")
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field291.method3226(); var10 != null; var10 = (class15) field291.method3231()) {
            if (var10.field205 == arg0 && var10.field204 == arg1 && var10.field207 == arg2 && var10.field203 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field205 = arg0;
            var9.field203 = arg3;
            var9.field204 = arg1;
            var9.field207 = arg2;
            method1886(var9);
            field291.method3224(var9);
        }
        var9.field209 = arg4;
        var9.field202 = arg5;
        var9.field210 = arg6;
        var9.field212 = arg7;
        var9.field213 = arg8;
    }

    @ObfuscatedName("dz.as(B)V")
    public static final void method2460() {
        for (class15 var0 = (class15) field291.method3226(); var0 != null; var0 = (class15) field291.method3231()) {
            if (var0.field213 == -1) {
                var0.field212 = 0;
                method1886(var0);
            } else {
                var0.method3324();
            }
        }
    }

    @ObfuscatedName("cy.av(Ls;B)V")
    public static final void method1886(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field203 == 0) {
            var1 = Statics.field2027.method1627(arg0.field205, arg0.field204, arg0.field207);
        }
        if (arg0.field203 == 1) {
            var1 = Statics.field2027.method1628(arg0.field205, arg0.field204, arg0.field207);
        }
        if (arg0.field203 == 2) {
            var1 = Statics.field2027.method1671(arg0.field205, arg0.field204, arg0.field207);
        }
        if (arg0.field203 == 3) {
            var1 = Statics.field2027.method1630(arg0.field205, arg0.field204, arg0.field207);
        }
        if (var1 != 0) {
            int var5 = Statics.field2027.method1631(arg0.field205, arg0.field204, arg0.field207, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field211 = var2;
        arg0.field208 = var3;
        arg0.field206 = var4;
    }

    @ObfuscatedName("j.bw(I)V")
    public static final void method128() {
        for (class15 var0 = (class15) field291.method3226(); var0 != null; var0 = (class15) field291.method3231()) {
            if (var0.field213 > 0) {
                var0.field213--;
            }
            if (var0.field213 != 0) {
                if (var0.field212 > 0) {
                    var0.field212--;
                }
                if (var0.field212 == 0 && var0.field204 >= 1 && var0.field207 >= 1 && var0.field204 <= 102 && var0.field207 <= 102 && (var0.field209 < 0 || class6.method120(var0.field209, var0.field202))) {
                    Statics.method886(var0.field205, var0.field203, var0.field204, var0.field207, var0.field209, var0.field210, var0.field202);
                    var0.field212 = -1;
                    if (var0.field211 == var0.field209 && var0.field211 == -1) {
                        var0.method3324();
                    } else if (var0.field211 == var0.field209 && var0.field210 == var0.field206 && var0.field208 == var0.field202) {
                        var0.method3324();
                    }
                }
            } else if (var0.field211 < 0 || class6.method120(var0.field211, var0.field208)) {
                Statics.method886(var0.field205, var0.field203, var0.field204, var0.field207, var0.field211, var0.field206, var0.field208);
                var0.method3324();
            }
        }
    }

    @ObfuscatedName("fo.bk(IIB)V")
    public static final void method3148(int arg0, int arg1) {
        class180 var2 = field376[Statics.field170][arg0][arg1];
        if (var2 == null) {
            Statics.field2027.method1622(Statics.field170, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3226(); var6 != null; var6 = (class26) var2.method3231()) {
            class46 var7 = class46.method476(var6.field626);
            long var8 = (long) var7.field1027;
            if (var7.field1033 == 1) {
                var8 = (long) (var6.field616 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2027.method1622(Statics.field170, arg0, arg1);
            return;
        }
        var2.method3225(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3226(); var12 != null; var12 = (class26) var2.method3231()) {
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
        Statics.field2027.method1608(Statics.field170, arg0, arg1, method2060(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field170), var5, var13, var10, var11);
    }

    @ObfuscatedName("ag.bv(I)V")
    public static final void method695() {
        field373 = 0;
        field430 = 0;
        method697();
        int var0 = field411.method2366(8);
        if (var0 < field366) {
            for (int var1 = var0; var1 < field366; var1++) {
                field374[++field373 - 1] = field367[var1];
            }
        }
        if (var0 > field366) {
            throw new RuntimeException("");
        }
        field366 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field367[var2];
            class3 var4 = field365[var3];
            int var5 = field411.method2366(1);
            if (var5 == 0) {
                field367[++field366 - 1] = var3;
                var4.field783 = field418;
            } else {
                int var6 = field411.method2366(2);
                if (var6 == 0) {
                    field367[++field366 - 1] = var3;
                    var4.field783 = field418;
                    field369[++field430 - 1] = var3;
                } else if (var6 == 1) {
                    field367[++field366 - 1] = var3;
                    var4.field783 = field418;
                    int var7 = field411.method2366(3);
                    var4.method577(var7, false);
                    int var8 = field411.method2366(1);
                    if (var8 == 1) {
                        field369[++field430 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field367[++field366 - 1] = var3;
                    var4.field783 = field418;
                    int var9 = field411.method2366(3);
                    var4.method577(var9, true);
                    int var10 = field411.method2366(3);
                    var4.method577(var10, true);
                    int var11 = field411.method2366(1);
                    if (var11 == 1) {
                        field369[++field430 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field374[++field373 - 1] = var3;
                }
            }
        }
        method129();
        for (int var12 = 0; var12 < field430; var12++) {
            int var13 = field369[var12];
            class3 var14 = field365[var13];
            int var15 = field411.method2122();
            if ((var15 & 0x20) != 0) {
                var15 += field411.method2122() << 8;
            }
            if ((var15 & 0x40) != 0) {
                int var16 = field411.method2150();
                class140 var17 = (class140) class100.method1(class140.method138(), field411.method2172());
                boolean var18 = field411.method2122() == 1;
                int var19 = field411.method2122();
                int var20 = field411.field1841;
                if (var14.field48 != null && var14.field36 != null) {
                    boolean var21 = false;
                    if (var17.field2123 && method2702(var14.field48)) {
                        var21 = true;
                    }
                    if (!var21 && field364 == 0 && !var14.field52) {
                        field326.field1841 = 0;
                        field411.method2189(field326.field1842, 0, var19);
                        field326.field1841 = 0;
                        String var22 = class204.method3425(class211.method251(class203.method2513(field326)));
                        var14.field791 = var22.trim();
                        var14.field753 = var16 >> 8;
                        var14.field752 = var16 & 0xFF;
                        var14.field774 = 150;
                        var14.field734 = var18;
                        var14.field740 = Statics.field695 != var14 && var17.field2123 && field287 != "" && var22.toLowerCase().indexOf(field287) == -1;
                        int var23;
                        if (var17.field2124) {
                            var23 = var18 ? 91 : 1;
                        } else {
                            var23 = var18 ? 90 : 2;
                        }
                        if (var17.field2121 == -1) {
                            class10.method486(var23, var14.field48, var22);
                        } else {
                            int var25 = var17.field2121;
                            String var26 = "<img=" + var25 + ">";
                            class10.method486(var23, var26 + var14.field48, var22);
                        }
                    }
                }
                field411.field1841 = var19 + var20;
            }
            if ((var15 & 0x8) != 0) {
                var14.field759 = field411.method2156();
                if (var14.field759 == 65535) {
                    var14.field759 = -1;
                }
            }
            if ((var15 & 0x4) != 0) {
                int var27 = field411.method2154();
                byte[] var28 = new byte[var27];
                class108 var29 = new class108(var28);
                field411.method2189(var28, 0, var27);
                field370[var13] = var29;
                var14.method13(var29);
            }
            if ((var15 & 0x1) != 0) {
                int var30 = field411.method2156();
                int var31 = field411.method2122();
                var14.method576(var30, var31, field418);
                var14.field786 = field418 + 300;
                var14.field757 = field411.method2122();
                var14.field758 = field411.method2154();
            }
            if ((var15 & 0x80) != 0) {
                int var32 = field411.method2156();
                if (var32 == 65535) {
                    var32 = -1;
                }
                int var33 = field411.method2172();
                method587(var14, var32, var33);
            }
            if ((var15 & 0x100) != 0) {
                var14.field775 = field411.method2122();
                var14.field777 = field411.method2122();
                var14.field776 = field411.method2154();
                var14.field778 = field411.method2172();
                var14.field755 = field411.method2156() + field418;
                var14.field780 = field411.method2155() + field418;
                var14.field781 = field411.method2122();
                var14.field737 = 1;
                var14.field779 = 0;
            }
            if ((var15 & 0x2) != 0) {
                var14.field791 = field411.method2130();
                if (var14.field791.charAt(0) == '~') {
                    var14.field791 = var14.field791.substring(1);
                    class10.method486(2, var14.field48, var14.field791);
                } else if (Statics.field695 == var14) {
                    class10.method486(2, var14.field48, var14.field791);
                }
                var14.field734 = false;
                var14.field753 = 0;
                var14.field752 = 0;
                var14.field774 = 150;
            }
            if ((var15 & 0x200) != 0) {
                var14.field770 = field411.method2150();
                int var34 = field411.method2201();
                var14.field767 = var34 >> 16;
                var14.field773 = (var34 & 0xFFFF) + field418;
                var14.field771 = 0;
                var14.field772 = 0;
                if (var14.field773 > field418) {
                    var14.field771 = -1;
                }
                if (var14.field770 == 65535) {
                    var14.field770 = -1;
                }
            }
            if ((var15 & 0x10) != 0) {
                var14.field760 = field411.method2155();
                var14.field761 = field411.method2156();
            }
            if ((var15 & 0x400) != 0) {
                int var35 = field411.method2155();
                int var36 = field411.method2148();
                var14.method576(var35, var36, field418);
                var14.field786 = field418 + 300;
                var14.field757 = field411.method2172();
                var14.field758 = field411.method2148();
            }
        }
        for (int var37 = 0; var37 < field373; var37++) {
            int var38 = field374[var37];
            if (field418 != field365[var38].field783) {
                field365[var38] = null;
            }
        }
        if (field289 != field411.field1841) {
            throw new RuntimeException(field411.field1841 + class2.field19 + field289);
        }
        for (int var39 = 0; var39 < field366; var39++) {
            if (field365[field367[var39]] == null) {
                throw new RuntimeException(var39 + class2.field19 + field366);
            }
        }
    }

    @ObfuscatedName("ag.br(S)V")
    public static final void method697() {
        field411.method2383();
        int var0 = field411.method2366(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field411.method2366(2);
        if (var1 == 0) {
            field369[++field430 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field411.method2366(3);
            Statics.field695.method577(var2, false);
            int var3 = field411.method2366(1);
            if (var3 == 1) {
                field369[++field430 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field411.method2366(3);
            Statics.field695.method577(var4, true);
            int var5 = field411.method2366(3);
            Statics.field695.method577(var5, true);
            int var6 = field411.method2366(1);
            if (var6 == 1) {
                field369[++field430 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field170 = field411.method2366(2);
            int var7 = field411.method2366(1);
            int var8 = field411.method2366(7);
            int var9 = field411.method2366(1);
            if (var9 == 1) {
                field369[++field430 - 1] = 2047;
            }
            int var10 = field411.method2366(7);
            Statics.field695.method573(var8, var10, var7 == 1);
        }
    }

    @ObfuscatedName("j.bn(I)V")
    public static final void method129() {
        while (true) {
            if (field411.method2362(field289) >= 11) {
                int var0 = field411.method2366(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field365[var0] == null) {
                        field365[var0] = new class3();
                        if (field370[var0] != null) {
                            field365[var0].method13(field370[var0]);
                        }
                        var1 = true;
                    }
                    field367[++field366 - 1] = var0;
                    class3 var2 = field365[var0];
                    var2.field783 = field418;
                    int var3 = field411.method2366(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field440[field411.method2366(3)];
                    if (var1) {
                        var2.field784 = var2.field748 = var4;
                    }
                    int var5 = field411.method2366(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field411.method2366(1);
                    if (var6 == 1) {
                        field369[++field430 - 1] = var0;
                    }
                    int var7 = field411.method2366(1);
                    var2.method573(Statics.field695.field788[0] + var3, Statics.field695.field789[0] + var5, var7 == 1);
                    continue;
                }
            }
            field411.method2361();
            return;
        }
    }

    @ObfuscatedName("ez.bc(ZI)V")
    public static final void method2677(boolean arg0) {
        field373 = 0;
        field430 = 0;
        field411.method2383();
        int var1 = field411.method2366(8);
        if (var1 < field284) {
            for (int var2 = var1; var2 < field284; var2++) {
                field374[++field373 - 1] = field285[var2];
            }
        }
        if (var1 > field284) {
            throw new RuntimeException("");
        }
        field284 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field285[var3];
            class31 var5 = field498[var4];
            int var6 = field411.method2366(1);
            if (var6 == 0) {
                field285[++field284 - 1] = var4;
                var5.field783 = field418;
            } else {
                int var7 = field411.method2366(2);
                if (var7 == 0) {
                    field285[++field284 - 1] = var4;
                    var5.field783 = field418;
                    field369[++field430 - 1] = var4;
                } else if (var7 == 1) {
                    field285[++field284 - 1] = var4;
                    var5.field783 = field418;
                    int var8 = field411.method2366(3);
                    var5.method577(var8, false);
                    int var9 = field411.method2366(1);
                    if (var9 == 1) {
                        field369[++field430 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field285[++field284 - 1] = var4;
                    var5.field783 = field418;
                    int var10 = field411.method2366(3);
                    var5.method577(var10, true);
                    int var11 = field411.method2366(3);
                    var5.method577(var11, true);
                    int var12 = field411.method2366(1);
                    if (var12 == 1) {
                        field369[++field430 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field374[++field373 - 1] = var4;
                }
            }
        }
        method633(arg0);
        for (int var13 = 0; var13 < field430; var13++) {
            int var14 = field369[var13];
            class31 var15 = field498[var14];
            int var16 = field411.method2122();
            if ((var16 & 0x80) != 0) {
                int var17 = field411.method2148();
                int var18 = field411.method2148();
                var15.method576(var17, var18, field418);
                var15.field786 = field418 + 300;
                var15.field757 = field411.method2124();
                var15.field758 = field411.method2156();
            }
            if ((var16 & 0x1) != 0) {
                var15.field706 = class36.method571(field411.method2150());
                var15.field738 = var15.field706.field808;
                var15.field751 = var15.field706.field803;
                var15.field792 = var15.field706.field814;
                var15.field743 = var15.field706.field815;
                var15.field787 = var15.field706.field810;
                var15.field745 = var15.field706.field812;
                var15.field793 = var15.field706.field811;
                var15.field747 = var15.field706.field831;
                var15.field741 = var15.field706.field813;
            }
            if ((var16 & 0x8) != 0) {
                var15.field760 = field411.method2155();
                var15.field761 = field411.method2124();
            }
            if ((var16 & 0x40) != 0) {
                var15.field770 = field411.method2150();
                int var19 = field411.method2201();
                var15.field767 = var19 >> 16;
                var15.field773 = (var19 & 0xFFFF) + field418;
                var15.field771 = 0;
                var15.field772 = 0;
                if (var15.field773 > field418) {
                    var15.field771 = -1;
                }
                if (var15.field770 == 65535) {
                    var15.field770 = -1;
                }
            }
            if ((var16 & 0x2) != 0) {
                int var20 = field411.method2154();
                int var21 = field411.method2172();
                var15.method576(var20, var21, field418);
                var15.field786 = field418 + 300;
                var15.field757 = field411.method2124();
                var15.field758 = field411.method2156();
            }
            if ((var16 & 0x4) != 0) {
                var15.field759 = field411.method2124();
                if (var15.field759 == 65535) {
                    var15.field759 = -1;
                }
            }
            if ((var16 & 0x20) != 0) {
                int var22 = field411.method2155();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field411.method2148();
                if (var15.field736 == var22 && var22 != -1) {
                    int var24 = class39.method2315(var22).field921;
                    if (var24 == 1) {
                        var15.field766 = 0;
                        var15.field739 = 0;
                        var15.field768 = var23;
                        var15.field769 = 0;
                    }
                    if (var24 == 2) {
                        var15.field769 = 0;
                    }
                } else if (var22 == -1 || var15.field736 == -1 || class39.method2315(var22).field922 >= class39.method2315(var15.field736).field922) {
                    var15.field736 = var22;
                    var15.field766 = 0;
                    var15.field739 = 0;
                    var15.field768 = var23;
                    var15.field769 = 0;
                    var15.field779 = var15.field737;
                }
            }
            if ((var16 & 0x10) != 0) {
                var15.field791 = field411.method2130();
                var15.field774 = 100;
            }
        }
        for (int var25 = 0; var25 < field373; var25++) {
            int var26 = field374[var25];
            if (field418 != field498[var26].field783) {
                field498[var26].field706 = null;
                field498[var26] = null;
            }
        }
        if (field289 != field411.field1841) {
            throw new RuntimeException(field411.field1841 + class2.field19 + field289);
        }
        for (int var27 = 0; var27 < field284; var27++) {
            if (field498[field285[var27]] == null) {
                throw new RuntimeException(var27 + class2.field19 + field284);
            }
        }
    }

    @ObfuscatedName("ai.bt(ZI)V")
    public static final void method633(boolean arg0) {
        while (true) {
            if (field411.method2362(field289) >= 27) {
                int var1 = field411.method2366(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field498[var1] == null) {
                        field498[var1] = new class31();
                        var2 = true;
                    }
                    class31 var3 = field498[var1];
                    field285[++field284 - 1] = var1;
                    var3.field783 = field418;
                    int var4 = field440[field411.method2366(3)];
                    if (var2) {
                        var3.field784 = var3.field748 = var4;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field411.method2366(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field411.method2366(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field411.method2366(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field411.method2366(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    var3.field706 = class36.method571(field411.method2366(14));
                    int var7 = field411.method2366(1);
                    int var8 = field411.method2366(1);
                    if (var8 == 1) {
                        field369[++field430 - 1] = var1;
                    }
                    var3.field738 = var3.field706.field808;
                    var3.field751 = var3.field706.field803;
                    if (var3.field751 == 0) {
                        var3.field748 = 0;
                    }
                    var3.field792 = var3.field706.field814;
                    var3.field743 = var3.field706.field815;
                    var3.field787 = var3.field706.field810;
                    var3.field745 = var3.field706.field812;
                    var3.field793 = var3.field706.field811;
                    var3.field747 = var3.field706.field831;
                    var3.field741 = var3.field706.field813;
                    var3.method573(Statics.field695.field788[0] + var6, Statics.field695.field789[0] + var5, var7 == 1);
                    continue;
                }
            }
            field411.method2361();
            return;
        }
    }

    @ObfuscatedName("aq.bz(IIIII)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field452; var4++) {
            if (field502[var4] + field457[var4] > arg0 && field457[var4] < arg0 + arg2 && field460[var4] + field424[var4] > arg1 && field424[var4] < arg1 + arg3) {
                field506[var4] = true;
            }
        }
    }

    @ObfuscatedName("ep.bb(IIIIB)V")
    public static final void method2784(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field452; var4++) {
            if (field502[var4] + field457[var4] > arg0 && field457[var4] < arg0 + arg2 && field460[var4] + field424[var4] > arg1 && field424[var4] < arg1 + arg3) {
                field381[var4] = true;
            }
        }
    }

    @ObfuscatedName("cq.bu(III)V")
    public static final void method1870(int arg0, int arg1) {
        int var2 = Statics.field2048.method3477(class145.field2318);
        for (int var3 = 0; var3 < field390; var3++) {
            int var4 = Statics.field2048.method3477(method3383(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field390 * 15 + 21;
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
        field250 = true;
        Statics.field2414 = var6;
        Statics.field523 = var7;
        Statics.field389 = var2;
        Statics.field65 = field390 * 15 + 22;
    }

    @ObfuscatedName("du.bm(Lax;III)V")
    public static final void method2580(class28 arg0, int arg1, int arg2) {
        method1960(arg0.field644, arg0.field639, arg0.field640, arg0.field645, arg0.field642, arg0.field642, arg1, arg2);
    }

    @ObfuscatedName("cz.bl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1960(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 44) {
            class3 var8 = field365[arg3];
            if (var8 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(199);
                field454.method2144(class126.field1971[82] ? 1 : 0);
                field454.method2151(arg3);
            }
        }
        if (arg2 == 21) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(107);
            field454.method2144(class126.field1971[82] ? 1 : 0);
            field454.method2153(Statics.field1821 + arg0);
            field454.method2151(arg3);
            field454.method2153(Statics.field990 + arg1);
        }
        if (arg2 == 50) {
            class3 var9 = field365[arg3];
            if (var9 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(175);
                field454.method2153(arg3);
                field454.method2123(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field454.method2357(74);
            field454.method2151(arg0);
            field454.method2134(arg1);
            field454.method2153(arg3);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 28) {
            field454.method2357(41);
            field454.method2134(arg1);
            class155 var10 = class155.method1383(arg1);
            if (var10.field2648 != null && var10.field2648[0][0] == 5) {
                int var11 = var10.field2648[0][1];
                class157.field2678[var11] = 1 - class157.field2678[var11];
                method509(var11);
            }
        }
        if (arg2 == 9) {
            class31 var12 = field498[arg3];
            if (var12 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(62);
                field454.method2152(arg3);
                field454.method2145(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class155 var13 = class155.method1027(arg1, arg0);
            if (var13 != null) {
                method1962();
                int var14 = method125(var13);
                int var15 = var14 >> 11 & 0x3F;
                int var17 = var13.field2656;
                class155 var18 = class155.method1027(arg1, arg0);
                if (var18 != null && var18.field2562 != null) {
                    class1 var19 = new class1();
                    var19.field3 = var18;
                    var19.field8 = var18.field2562;
                    class33.method561(var19, 200000);
                }
                field405 = var17;
                field403 = true;
                Statics.field1893 = arg1;
                field404 = arg0;
                Statics.field1849 = var15;
                method137(var18);
                field401 = 0;
                int var20 = method125(var13);
                int var21 = var20 >> 11 & 0x3F;
                String var22;
                if (var21 == 0) {
                    var22 = null;
                } else if (var13.field2595 == null || var13.field2595.trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = var13.field2595;
                }
                field406 = var22;
                if (field406 == null) {
                    field406 = "Null";
                }
                if (var13.field2548) {
                    field407 = var13.field2623 + class2.method2540(16777215);
                } else {
                    field407 = class2.method2540(65280) + var13.field2658 + class2.method2540(16777215);
                }
            }
            return;
        }
        if (arg2 == 3) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(137);
            field454.method2152(Statics.field1821 + arg0);
            field454.method2145(class126.field1971[82] ? 1 : 0);
            field454.method2109(arg3 >> 14 & 0x7FFF);
            field454.method2153(Statics.field990 + arg1);
        }
        if (arg2 == 19) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(31);
            field454.method2151(Statics.field990 + arg1);
            field454.method2268(class126.field1971[82] ? 1 : 0);
            field454.method2153(arg3);
            field454.method2151(Statics.field1821 + arg0);
        }
        if (arg2 == 6) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(147);
            field454.method2152(Statics.field1821 + arg0);
            field454.method2152(arg3 >> 14 & 0x7FFF);
            field454.method2153(Statics.field990 + arg1);
            field454.method2145(class126.field1971[82] ? 1 : 0);
        }
        if (arg2 == 51) {
            class3 var23 = field365[arg3];
            if (var23 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(221);
                field454.method2144(class126.field1971[82] ? 1 : 0);
                field454.method2151(arg3);
            }
        }
        if (arg2 == 2) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(0);
            field454.method2151(arg3 >> 14 & 0x7FFF);
            field454.method2268(class126.field1971[82] ? 1 : 0);
            field454.method2153(field404);
            field454.method2152(Statics.field1821 + arg0);
            field454.method2161(Statics.field1893);
            field454.method2151(Statics.field990 + arg1);
        }
        if (arg2 == 4) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(95);
            field454.method2152(arg3 >> 14 & 0x7FFF);
            field454.method2151(Statics.field990 + arg1);
            field454.method2151(Statics.field1821 + arg0);
            field454.method2144(class126.field1971[82] ? 1 : 0);
        }
        if (arg2 == 29) {
            field454.method2357(41);
            field454.method2134(arg1);
            class155 var24 = class155.method1383(arg1);
            if (var24.field2648 != null && var24.field2648[0][0] == 5) {
                int var25 = var24.field2648[0][1];
                if (class157.field2678[var25] != var24.field2650[0]) {
                    class157.field2678[var25] = var24.field2650[0];
                    method509(var25);
                }
            }
        }
        if (arg2 == 8) {
            class31 var26 = field498[arg3];
            if (var26 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(48);
                field454.method2316(Statics.field1893);
                field454.method2123(class126.field1971[82] ? 1 : 0);
                field454.method2151(field404);
                field454.method2151(arg3);
            }
        }
        if (arg2 == 26) {
            method778();
        }
        if (arg2 == 7) {
            class31 var27 = field498[arg3];
            if (var27 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(215);
                field454.method2153(arg3);
                field454.method2145(class126.field1971[82] ? 1 : 0);
                field454.method2153(Statics.field562);
                field454.method2265(Statics.field2463);
                field454.method2151(Statics.field149);
            }
        }
        if (arg2 == 13) {
            class31 var28 = field498[arg3];
            if (var28 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(116);
                field454.method2151(arg3);
                field454.method2144(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(141);
            field454.method2265(Statics.field1893);
            field454.method2151(arg3);
            field454.method2144(class126.field1971[82] ? 1 : 0);
            field454.method2151(Statics.field990 + arg1);
            field454.method2109(Statics.field1821 + arg0);
            field454.method2153(field404);
        }
        if (arg2 == 1001) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(171);
            field454.method2153(Statics.field1821 + arg0);
            field454.method2268(class126.field1971[82] ? 1 : 0);
            field454.method2153(arg3 >> 14 & 0x7FFF);
            field454.method2151(Statics.field990 + arg1);
        }
        if (arg2 == 34) {
            field454.method2357(210);
            field454.method2109(arg0);
            field454.method2134(arg1);
            field454.method2151(arg3);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 32) {
            field454.method2357(43);
            field454.method2316(Statics.field1893);
            field454.method2161(arg1);
            field454.method2109(arg0);
            field454.method2151(arg3);
            field454.method2152(field404);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var29 = class155.method1027(arg1, arg0);
            if (var29 != null) {
                int var30 = var29.field2656;
                class155 var31 = class155.method1027(arg1, arg0);
                if (var31 != null) {
                    if (var31.field2637 != null) {
                        class1 var32 = new class1();
                        var32.field3 = var31;
                        var32.field1 = arg3;
                        var32.field10 = arg5;
                        var32.field8 = var31.field2637;
                        class33.method561(var32, 200000);
                    }
                    boolean var33 = true;
                    if (var31.field2553 > 0) {
                        var33 = method2834(var31);
                    }
                    if (var33) {
                        int var34 = method125(var31);
                        int var35 = arg3 - 1;
                        boolean var36 = (var34 >> var35 + 1 & 0x1) != 0;
                        if (var36) {
                            if (arg3 == 1) {
                                field454.method2357(60);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 2) {
                                field454.method2357(101);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 3) {
                                field454.method2357(99);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 4) {
                                field454.method2357(150);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 5) {
                                field454.method2357(122);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 6) {
                                field454.method2357(117);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 7) {
                                field454.method2357(118);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 8) {
                                field454.method2357(156);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 9) {
                                field454.method2357(49);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                            if (arg3 == 10) {
                                field454.method2357(92);
                                field454.method2134(arg1);
                                field454.method2109(arg0);
                                field454.method2109(var30);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 20) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(103);
            field454.method2152(Statics.field990 + arg1);
            field454.method2151(arg3);
            field454.method2153(Statics.field1821 + arg0);
            field454.method2123(class126.field1971[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(94);
            field454.method2109(Statics.field1821 + arg0);
            field454.method2145(class126.field1971[82] ? 1 : 0);
            field454.method2152(arg3);
            field454.method2153(Statics.field990 + arg1);
        }
        if (arg2 == 35) {
            field454.method2357(155);
            field454.method2134(arg1);
            field454.method2153(arg0);
            field454.method2153(arg3);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 1002) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field454.method2357(66);
            field454.method2153(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class3 var37 = field365[arg3];
            if (var37 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(251);
                field454.method2151(arg3);
                field454.method2268(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(77);
            field454.method2153(Statics.field990 + arg1);
            field454.method2153(Statics.field1821 + arg0);
            field454.method2152(arg3 >> 14 & 0x7FFF);
            field454.method2144(class126.field1971[82] ? 1 : 0);
        }
        if (arg2 == 1) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(102);
            field454.method2109(Statics.field990 + arg1);
            field454.method2152(Statics.field562);
            field454.method2123(class126.field1971[82] ? 1 : 0);
            field454.method2161(Statics.field2463);
            field454.method2152(arg3 >> 14 & 0x7FFF);
            field454.method2152(Statics.field1821 + arg0);
            field454.method2153(Statics.field149);
        }
        if (arg2 == 43) {
            field454.method2357(32);
            field454.method2152(arg0);
            field454.method2316(arg1);
            field454.method2109(arg3);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 16) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(238);
            field454.method2153(arg3);
            field454.method2134(Statics.field2463);
            field454.method2151(Statics.field149);
            field454.method2153(Statics.field1821 + arg0);
            field454.method2152(Statics.field990 + arg1);
            field454.method2268(class126.field1971[82] ? 1 : 0);
            field454.method2109(Statics.field562);
        }
        if (arg2 == 11) {
            class31 var38 = field498[arg3];
            if (var38 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(114);
                field454.method2268(class126.field1971[82] ? 1 : 0);
                field454.method2151(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var39 = field365[arg3];
            if (var39 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(98);
                field454.method2109(arg3);
                field454.method2145(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field454.method2357(125);
            field454.method2152(arg3);
            field454.method2153(arg0);
            field454.method2316(arg1);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 10) {
            class31 var40 = field498[arg3];
            if (var40 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(3);
                field454.method2144(class126.field1971[82] ? 1 : 0);
                field454.method2109(arg3);
            }
        }
        if (arg2 == 18) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field479 = arg0;
            field480 = arg1;
            field454.method2357(135);
            field454.method2152(Statics.field1821 + arg0);
            field454.method2152(Statics.field990 + arg1);
            field454.method2145(class126.field1971[82] ? 1 : 0);
            field454.method2151(arg3);
        }
        if (arg2 == 41) {
            field454.method2357(191);
            field454.method2152(arg0);
            field454.method2152(arg3);
            field454.method2265(arg1);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 58) {
            class155 var41 = class155.method1027(arg1, arg0);
            if (var41 != null) {
                field454.method2357(83);
                field454.method2151(var41.field2656);
                field454.method2151(arg0);
                field454.method2153(field405);
                field454.method2265(Statics.field1893);
                field454.method2153(field404);
                field454.method2161(arg1);
            }
        }
        if (arg2 == 1003) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            class31 var42 = field498[arg3];
            if (var42 != null) {
                class36 var43 = var42.field706;
                if (var43.field832 != null) {
                    var43 = var43.method611();
                }
                if (var43 != null) {
                    field454.method2357(231);
                    field454.method2109(var43.field806);
                }
            }
        }
        if (arg2 == 1005) {
            class155 var44 = class155.method1383(arg1);
            if (var44 == null || var44.field2583[arg0] < 100000) {
                field454.method2357(189);
                field454.method2151(arg3);
            } else {
                class10.method486(27, "", var44.field2583[arg0] + " x " + class46.method476(arg3).field1034);
            }
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 40) {
            field454.method2357(196);
            field454.method2265(arg1);
            field454.method2151(arg3);
            field454.method2109(arg0);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 30 && field495 == null) {
            field454.method2357(138);
            field454.method2153(arg0);
            field454.method2134(arg1);
            field495 = class155.method1027(arg1, arg0);
            method137(field495);
        }
        if (arg2 == 14) {
            class3 var45 = field365[arg3];
            if (var45 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(10);
                field454.method2151(Statics.field149);
                field454.method2161(Statics.field2463);
                field454.method2151(arg3);
                field454.method2151(Statics.field562);
                field454.method2145(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field454.method2357(194);
            field454.method2151(arg3);
            field454.method2109(Statics.field149);
            field454.method2152(Statics.field562);
            field454.method2161(arg1);
            field454.method2161(Statics.field2463);
            field454.method2152(arg0);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 42) {
            field454.method2357(252);
            field454.method2151(arg3);
            field454.method2265(arg1);
            field454.method2152(arg0);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 39) {
            field454.method2357(12);
            field454.method2152(arg3);
            field454.method2109(arg0);
            field454.method2316(arg1);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 37) {
            field454.method2357(188);
            field454.method2265(arg1);
            field454.method2153(arg0);
            field454.method2109(arg3);
            field356 = 0;
            Statics.field2684 = class155.method1383(arg1);
            field357 = arg0;
        }
        if (arg2 == 45) {
            class3 var46 = field365[arg3];
            if (var46 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(75);
                field454.method2145(class126.field1971[82] ? 1 : 0);
                field454.method2109(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field2027.method1653(Statics.field170, arg0, arg1);
        }
        if (arg2 == 15) {
            class3 var47 = field365[arg3];
            if (var47 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(23);
                field454.method2109(field404);
                field454.method2109(arg3);
                field454.method2265(Statics.field1893);
                field454.method2144(class126.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var48 = field365[arg3];
            if (var48 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(163);
                field454.method2145(class126.field1971[82] ? 1 : 0);
                field454.method2152(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var49 = field365[arg3];
            if (var49 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(202);
                field454.method2144(class126.field1971[82] ? 1 : 0);
                field454.method2109(arg3);
            }
        }
        if (arg2 == 38) {
            method1962();
            class155 var50 = class155.method1383(arg1);
            field401 = 1;
            Statics.field562 = arg0;
            Statics.field2463 = arg1;
            Statics.field149 = arg3;
            method137(var50);
            field380 = class2.method2540(16748608) + class46.method476(arg3).field1034 + class2.method2540(16777215);
            if (field380 == null) {
                field380 = "null";
            }
            return;
        }
        if (arg2 == 1004) {
            field286 = arg6;
            field353 = arg7;
            field355 = 2;
            field361 = 0;
            field454.method2357(189);
            field454.method2151(arg3);
        }
        if (arg2 == 12) {
            class31 var51 = field498[arg3];
            if (var51 != null) {
                field286 = arg6;
                field353 = arg7;
                field355 = 2;
                field361 = 0;
                field479 = arg0;
                field480 = arg1;
                field454.method2357(120);
                field454.method2268(class126.field1971[82] ? 1 : 0);
                field454.method2151(arg3);
            }
        }
        if (arg2 == 24) {
            class155 var52 = class155.method1383(arg1);
            boolean var53 = true;
            if (var52.field2553 > 0) {
                var53 = method2834(var52);
            }
            if (var53) {
                field454.method2357(41);
                field454.method2134(arg1);
            }
        }
        if (field401 != 0) {
            field401 = 0;
            method137(class155.method1383(Statics.field2463));
        }
        if (field403) {
            method1962();
        }
        if (Statics.field2684 != null && field356 == 0) {
            method137(Statics.field2684);
        }
    }

    @ObfuscatedName("ag.bi(ILjava/lang/String;I)V")
    public static void method698(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field366; var3++) {
            class3 var4 = field365[field367[var3]];
            if (var4 != null && var4.field48 != null && var4.field48.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field454.method2357(199);
                    field454.method2144(0);
                    field454.method2151(field367[var3]);
                } else if (arg0 == 4) {
                    field454.method2357(98);
                    field454.method2109(field367[var3]);
                    field454.method2145(0);
                } else if (arg0 == 6) {
                    field454.method2357(163);
                    field454.method2145(0);
                    field454.method2152(field367[var3]);
                } else if (arg0 == 7) {
                    field454.method2357(175);
                    field454.method2153(field367[var3]);
                    field454.method2123(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method486(4, "", class145.field2314 + arg1);
        }
    }

    @ObfuscatedName("ch.bg(I)V")
    public static void method1962() {
        if (!field403) {
            return;
        }
        class155 var0 = class155.method1027(Statics.field1893, field404);
        if (var0 != null && var0.field2655 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2655;
            class33.method561(var1, 200000);
        }
        field403 = false;
        method137(var0);
    }

    @ObfuscatedName("ab.bp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method628(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field250 || field390 >= 500) {
            return;
        }
        field395[field390] = arg0;
        field396[field390] = arg1;
        field393[field390] = arg2;
        field394[field390] = arg3;
        field391[field390] = arg4;
        field392[field390] = arg5;
        field390++;
    }

    @ObfuscatedName("w.bh(I)V")
    public static void method103() {
        for (int var0 = 0; var0 < field390; var0++) {
            if (method2545(field393[var0])) {
                if (var0 < field390 - 1) {
                    for (int var1 = var0; var1 < field390 - 1; var1++) {
                        field395[var1] = field395[var1 + 1];
                        field396[var1] = field396[var1 + 1];
                        field393[var1] = field393[var1 + 1];
                        field394[var1] = field394[var1 + 1];
                        field391[var1] = field391[var1 + 1];
                        field392[var1] = field392[var1 + 1];
                    }
                }
                field390--;
            }
        }
    }

    @ObfuscatedName("da.bx(II)Z")
    public static boolean method2545(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("gh.be(II)Ljava/lang/String;")
    public static String method3383(int arg0) {
        return field396[arg0].length() > 0 ? field395[arg0] + class145.field2377 + field396[arg0] : field395[arg0];
    }

    @ObfuscatedName("ao.ba(Lab;IIII)V")
    public static final void method590(class36 arg0, int arg1, int arg2, int arg3) {
        if (field390 >= 400) {
            return;
        }
        if (arg0.field832 != null) {
            arg0 = arg0.method611();
        }
        if (arg0 == null || !arg0.field835 || arg0.field837 && field416 != arg1) {
            return;
        }
        String var4 = arg0.field841;
        if (arg0.field824 != 0) {
            var4 = var4 + method1772(arg0.field824, Statics.field695.field37) + " " + class2.field21 + class145.field2411 + arg0.field824 + class2.field22;
        }
        if (field401 == 1) {
            method628(class145.field2315, field380 + " " + class2.field23 + " " + class2.method2540(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field403) {
            String[] var5 = arg0.field838;
            if (field419) {
                var5 = method136(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2317)) {
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
                        method628(var5[var6], class2.method2540(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2317)) {
                        short var9 = 0;
                        if (field358 == class18.field514 || field358 == class18.field513 && arg0.field824 > Statics.field695.field37) {
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
                        method628(var5[var8], class2.method2540(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method628(class145.field2179, class2.method2540(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1849 & 0x2) == 2) {
            method628(field406, field407 + " " + class2.field23 + " " + class2.method2540(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("af.bo(Lk;IIII)V")
    public static final void method549(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field695 == arg0 || field390 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field48 + method1772(arg0.field37, Statics.field695.field37) + " " + class2.field21 + class145.field2411 + arg0.field37 + class2.field22;
        } else {
            var4 = arg0.field48 + " " + class2.field21 + class145.field2322 + arg0.field38 + class2.field22;
        }
        if (field401 == 1) {
            method628(class145.field2315, field380 + " " + class2.field23 + " " + class2.method2540(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field403) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field305[var5] != null) {
                    short var6 = 0;
                    if (field305[var5].equalsIgnoreCase(class145.field2317)) {
                        if (field358 == class18.field514 || field358 == class18.field513 && arg0.field37 > Statics.field695.field37) {
                            var6 = 2000;
                        }
                        if (Statics.field695.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field695.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field377[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field372[var5] + var6;
                    method628(field305[var5], class2.method2540(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1849 & 0x8) == 8) {
            method628(field406, field407 + " " + class2.field23 + " " + class2.method2540(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field390; var9++) {
            if (field393[var9] == 23) {
                field396[var9] = class2.method2540(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cc.by(III)Ljava/lang/String;")
    public static final String method1772(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2540(16711680);
        } else if (var2 < -6) {
            return class2.method2540(16723968);
        } else if (var2 < -3) {
            return class2.method2540(16740352);
        } else if (var2 < 0) {
            return class2.method2540(16756736);
        } else if (var2 > 9) {
            return class2.method2540(65280);
        } else if (var2 > 6) {
            return class2.method2540(4259584);
        } else if (var2 > 3) {
            return class2.method2540(8453888);
        } else if (var2 > 0) {
            return class2.method2540(12648192);
        } else {
            return class2.method2540(16776960);
        }
    }

    @ObfuscatedName("ax.bf([Ler;IIIIIIIII)V")
    public static final void method508(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1526(arg2, arg3, arg4, arg5);
        class85.method1779();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2560 == arg1 || arg1 == -1412584499 && field248 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field457[field452] = var10.field2601 + arg6;
                    field424[field452] = var10.field2555 + arg7;
                    field502[field452] = var10.field2558;
                    field460[field452] = var10.field2609;
                    var11 = ++field452 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2667 = var11;
                var10.field2619 = field418;
                if (!var10.field2548 || !method2400(var10)) {
                    if (var10.field2553 > 0) {
                        int var12 = var10.field2553;
                        if (var12 == 324) {
                            if (field507 == -1) {
                                field507 = var10.field2573;
                                field294 = var10.field2574;
                            }
                            if (field362.field2689) {
                                var10.field2573 = field507;
                            } else {
                                var10.field2573 = field294;
                            }
                        } else if (var12 == 325) {
                            if (field507 == -1) {
                                field507 = var10.field2573;
                                field294 = var10.field2574;
                            }
                            if (field362.field2689) {
                                var10.field2573 = field294;
                            } else {
                                var10.field2573 = field507;
                            }
                        } else if (var12 == 327) {
                            var10.field2559 = 150;
                            var10.field2561 = (int) (Math.sin((double) field418 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2581 = 5;
                            var10.field2582 = 0;
                        } else if (var12 == 328) {
                            var10.field2559 = 150;
                            var10.field2561 = (int) (Math.sin((double) field418 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2581 = 5;
                            var10.field2582 = 1;
                        }
                    }
                    int var13 = var10.field2601 + arg6;
                    int var14 = var10.field2555 + arg7;
                    int var15 = var10.field2546;
                    if (field248 == var10) {
                        if (arg1 != -1412584499 && !var10.field2610) {
                            Statics.field131 = arg0;
                            Statics.field533 = arg6;
                            Statics.field200 = arg7;
                            continue;
                        }
                        if (field431 && field437) {
                            int var16 = class129.field2003;
                            int var17 = class129.field2004;
                            int var18 = var16 - field274;
                            int var19 = var17 - field344;
                            if (var18 < field426) {
                                var18 = field426;
                            }
                            if (var10.field2558 + var18 > field426 + field421.field2558) {
                                var18 = field426 + field421.field2558 - var10.field2558;
                            }
                            if (var19 < field387) {
                                var19 = field387;
                            }
                            if (var10.field2609 + var19 > field387 + field421.field2609) {
                                var19 = field387 + field421.field2609 - var10.field2609;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2610) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2551 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2551 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2558 + var13;
                        int var27 = var10.field2609 + var14;
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
                        int var30 = var10.field2558 + var13;
                        int var31 = var10.field2609 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2548 || var20 < var22 && var21 < var23) {
                        if (var10.field2553 != 0) {
                            if (var10.field2553 == 1337) {
                                field491 = var13;
                                field455 = var14;
                                method75(var13, var14, var10.field2558, var10.field2609);
                                class74.method1526(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2553 == 1338) {
                                method1958(var13, var14, var11);
                                class74.method1526(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2551 == 0) {
                            if (!var10.field2548 && method2400(var10) && Statics.field2788 != var10) {
                                continue;
                            }
                            if (!var10.field2548) {
                                if (var10.field2563 > var10.field2565 - var10.field2609) {
                                    var10.field2563 = var10.field2565 - var10.field2609;
                                }
                                if (var10.field2563 < 0) {
                                    var10.field2563 = 0;
                                }
                            }
                            method508(arg0, var10.field2549, var20, var21, var22, var23, var13 - var10.field2621, var14 - var10.field2563, var11);
                            if (var10.field2660 != null) {
                                method508(var10.field2660, var10.field2549, var20, var21, var22, var23, var13 - var10.field2621, var14 - var10.field2563, var11);
                            }
                            class4 var32 = (class4) field409.method3192((long) var10.field2549);
                            if (var32 != null) {
                                int var33 = var32.field60;
                                if (class155.method485(var33)) {
                                    Statics.field131 = null;
                                    method508(Statics.field2584[var33], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field131 != null) {
                                        method508(Statics.field131, -1412584499, var20, var21, var22, var23, Statics.field533, Statics.field200, var11);
                                        Statics.field131 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var34 = 0; var34 < 100; var34++) {
                                        field506[var34] = true;
                                    }
                                } else {
                                    field506[var11] = true;
                                }
                            }
                            class74.method1526(arg2, arg3, arg4, arg5);
                            class85.method1779();
                        }
                        if (field456[var11] || field461 > 1) {
                            if (var10.field2551 == 0 && !var10.field2548 && var10.field2565 > var10.field2609) {
                                int var35 = var10.field2558 + var13;
                                int var36 = var10.field2563;
                                int var37 = var10.field2609;
                                int var38 = var10.field2565;
                                Statics.field57[0].method1565(var35, var14);
                                Statics.field57[1].method1565(var35, var14 + var37 - 16);
                                class74.method1513(var35, var14 + 16, 16, var37 - 32, field323);
                                int var39 = (var37 - 32) * var37 / var38;
                                if (var39 < 8) {
                                    var39 = 8;
                                }
                                int var40 = (var37 - 32 - var39) * var36 / (var38 - var37);
                                class74.method1513(var35, var14 + 16 + var40, 16, var39, field324);
                                class74.method1519(var35, var14 + 16 + var40, var39, field295);
                                class74.method1519(var35 + 1, var14 + 16 + var40, var39, field295);
                                class74.method1509(var35, var14 + 16 + var40, 16, field295);
                                class74.method1509(var35, var14 + 17 + var40, 16, field295);
                                class74.method1519(var35 + 15, var14 + 16 + var40, var39, field325);
                                class74.method1519(var35 + 14, var14 + 17 + var40, var39 - 1, field325);
                                class74.method1509(var35, var14 + 15 + var40 + var39, 16, field325);
                                class74.method1509(var35 + 1, var14 + 14 + var40 + var39, 15, field325);
                            }
                            if (var10.field2551 != 1) {
                                if (var10.field2551 == 2) {
                                    int var41 = 0;
                                    for (int var42 = 0; var42 < var10.field2609; var42++) {
                                        for (int var43 = 0; var43 < var10.field2558; var43++) {
                                            int var44 = (var10.field2603 + 32) * var43 + var13;
                                            int var45 = (var10.field2604 + 32) * var42 + var14;
                                            if (var41 < 20) {
                                                var44 += var10.field2605[var41];
                                                var45 += var10.field2606[var41];
                                            }
                                            if (var10.field2594[var41] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var10.field2594[var41] - 1;
                                                if (var44 + 32 > arg2 && var44 < arg4 && var45 + 32 > arg3 && var45 < arg5 || Statics.field2147 == var10 && field388 == var41) {
                                                    class73 var49;
                                                    if (field401 == 1 && Statics.field562 == var41 && Statics.field2463 == var10.field2549) {
                                                        var49 = class46.method502(var48, var10.field2583[var41], 2, 0, 2, false);
                                                    } else {
                                                        var49 = class46.method502(var48, var10.field2583[var41], 1, 3153952, 2, false);
                                                    }
                                                    if (var49 == null) {
                                                        method137(var10);
                                                    } else if (Statics.field2147 == var10 && field388 == var41) {
                                                        int var50 = class129.field2003 - field359;
                                                        int var51 = class129.field2004 - field486;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (field363 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method1489(var44 + var50, var45 + var51, 128);
                                                        if (arg1 != -1) {
                                                            class155 var52 = arg0[arg1 & 0xFFFF];
                                                            if (var45 + var51 < class74.field1333 && var52.field2563 > 0) {
                                                                int var53 = field350 * (class74.field1333 - var45 - var51) / 3;
                                                                if (var53 > field350 * 10) {
                                                                    var53 = field350 * 10;
                                                                }
                                                                if (var53 > var52.field2563) {
                                                                    var53 = var52.field2563;
                                                                }
                                                                var52.field2563 -= var53;
                                                                field486 += var53;
                                                                method137(var52);
                                                            }
                                                            if (var45 + var51 + 32 > class74.field1334 && var52.field2563 < var52.field2565 - var52.field2609) {
                                                                int var54 = field350 * (var45 + var51 + 32 - class74.field1334) / 3;
                                                                if (var54 > field350 * 10) {
                                                                    var54 = field350 * 10;
                                                                }
                                                                if (var54 > var52.field2565 - var52.field2609 - var52.field2563) {
                                                                    var54 = var52.field2565 - var52.field2609 - var52.field2563;
                                                                }
                                                                var52.field2563 += var54;
                                                                field486 -= var54;
                                                                method137(var52);
                                                            }
                                                        }
                                                    } else if (Statics.field2684 == var10 && field357 == var41) {
                                                        var49.method1489(var44, var45, 128);
                                                    } else {
                                                        var49.method1435(var44, var45);
                                                    }
                                                }
                                            } else if (var10.field2547 != null && var41 < 20) {
                                                class73 var55 = var10.method2843(var41);
                                                if (var55 != null) {
                                                    var55.method1435(var44, var45);
                                                } else if (class155.field2652) {
                                                    method137(var10);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                } else if (var10.field2551 == 3) {
                                    int var56;
                                    if (method84(var10)) {
                                        var56 = var10.field2567;
                                        if (Statics.field2788 == var10 && var10.field2569 != 0) {
                                            var56 = var10.field2569;
                                        }
                                    } else {
                                        var56 = var10.field2566;
                                        if (Statics.field2788 == var10 && var10.field2568 != 0) {
                                            var56 = var10.field2568;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2570) {
                                            class74.method1513(var13, var14, var10.field2558, var10.field2609, var56);
                                        } else {
                                            class74.method1515(var13, var14, var10.field2558, var10.field2609, var56);
                                        }
                                    } else if (var10.field2570) {
                                        class74.method1554(var13, var14, var10.field2558, var10.field2609, var56, 256 - (var15 & 0xFF));
                                    } else {
                                        class74.method1516(var13, var14, var10.field2558, var10.field2609, var56, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2551 == 4) {
                                    class205 var57 = var10.method2842();
                                    if (var57 != null) {
                                        String var58 = var10.field2597;
                                        int var59;
                                        if (method84(var10)) {
                                            var59 = var10.field2567;
                                            if (Statics.field2788 == var10 && var10.field2569 != 0) {
                                                var59 = var10.field2569;
                                            }
                                            if (var10.field2592.length() > 0) {
                                                var58 = var10.field2592;
                                            }
                                        } else {
                                            var59 = var10.field2566;
                                            if (Statics.field2788 == var10 && var10.field2568 != 0) {
                                                var59 = var10.field2568;
                                            }
                                        }
                                        if (var10.field2548 && var10.field2656 != -1) {
                                            class46 var60 = class46.method476(var10.field2656);
                                            var58 = var60.field1034;
                                            if (var58 == null) {
                                                var58 = "null";
                                            }
                                            if ((var60.field1033 == 1 || var10.field2657 != 1) && var10.field2657 != -1) {
                                                var58 = class2.method2540(16748608) + var58 + class2.field25 + " " + 'x' + method1352(var10.field2657);
                                            }
                                        }
                                        if (field495 == var10) {
                                            class145 var10000 = (class145) null;
                                            var58 = class145.field2323;
                                            var59 = var10.field2566;
                                        }
                                        if (!var10.field2548) {
                                            var58 = method72(var58, var10);
                                        }
                                        var57.method3419(var58, var13, var14, var10.field2558, var10.field2609, var59, var10.field2602 ? 0 : -1, var10.field2638, var10.field2654, var10.field2599);
                                    } else if (class155.field2652) {
                                        method137(var10);
                                    }
                                } else if (var10.field2551 == 5) {
                                    if (var10.field2548) {
                                        class73 var62;
                                        if (var10.field2656 == -1) {
                                            var62 = var10.method2841(false);
                                        } else {
                                            var62 = class46.method502(var10.field2656, var10.field2657, var10.field2577, var10.field2578, var10.field2611, false);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1321;
                                            int var64 = var62.field1324;
                                            if (var10.field2608) {
                                                class74.method1511(var13, var14, var10.field2558 + var13, var10.field2609 + var14);
                                                int var65 = (var10.field2558 + (var63 - 1)) / var63;
                                                int var66 = (var10.field2609 + (var64 - 1)) / var64;
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var10.field2575 != 0) {
                                                            var62.method1459(var63 / 2 + var63 * var67 + var13, var64 / 2 + var64 * var68 + var14, var10.field2575, 4096);
                                                        } else if (var15 == 0) {
                                                            var62.method1435(var63 * var67 + var13, var64 * var68 + var14);
                                                        } else {
                                                            var62.method1489(var63 * var67 + var13, var64 * var68 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1526(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var69 = var10.field2558 * 4096 / var63;
                                                if (var10.field2575 != 0) {
                                                    var62.method1459(var10.field2558 / 2 + var13, var10.field2609 / 2 + var14, var10.field2575, var69);
                                                } else if (var15 != 0) {
                                                    var62.method1443(var13, var14, var10.field2558, var10.field2609, 256 - (var15 & 0xFF));
                                                } else if (var10.field2558 == var63 && var10.field2609 == var64) {
                                                    var62.method1435(var13, var14);
                                                } else {
                                                    var62.method1475(var13, var14, var10.field2558, var10.field2609);
                                                }
                                            }
                                        } else if (class155.field2652) {
                                            method137(var10);
                                        }
                                    } else {
                                        class73 var61 = var10.method2841(method84(var10));
                                        if (var61 != null) {
                                            var61.method1435(var13, var14);
                                        } else if (class155.field2652) {
                                            method137(var10);
                                        }
                                    }
                                } else if (var10.field2551 == 6) {
                                    boolean var70 = method84(var10);
                                    int var71;
                                    if (var70) {
                                        var71 = var10.field2600;
                                    } else {
                                        var71 = var10.field2542;
                                    }
                                    class99 var72 = null;
                                    int var73 = 0;
                                    if (var10.field2656 != -1) {
                                        class46 var74 = class46.method476(var10.field2656);
                                        if (var74 != null) {
                                            class46 var75 = var74.method866(var10.field2657);
                                            var72 = var75.method843(1);
                                            if (var72 == null) {
                                                method137(var10);
                                            } else {
                                                var72.method1967();
                                                var73 = var72.field1369 / 2;
                                            }
                                        }
                                    } else if (var10.field2581 == 5) {
                                        if (var10.field2582 == 0) {
                                            var72 = field362.method2908((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var72 = Statics.field695.method14();
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var10.method2865((class39) null, -1, var70, Statics.field695.field36);
                                        if (var72 == null && class155.field2652) {
                                            method137(var10);
                                        }
                                    } else {
                                        class39 var76 = class39.method2315(var71);
                                        var72 = var10.method2865(var76, var10.field2598, var70, Statics.field695.field36);
                                        if (var72 == null && class155.field2652) {
                                            method137(var10);
                                        }
                                    }
                                    class85.method1786(var10.field2558 / 2 + var13, var10.field2609 / 2 + var14);
                                    int var77 = var10.field2632 * class85.field1500[var10.field2559] >> 16;
                                    int var78 = var10.field2632 * class85.field1501[var10.field2559] >> 16;
                                    if (var72 != null) {
                                        if (var10.field2548) {
                                            var72.method1967();
                                            if (var10.field2607) {
                                                var72.method1970(0, var10.field2561, var10.field2591, var10.field2559, var10.field2627, var10.field2588 + var73 + var77, var10.field2588 + var78, var10.field2632);
                                            } else {
                                                var72.method1992(0, var10.field2561, var10.field2591, var10.field2559, var10.field2627, var10.field2588 + var73 + var77, var10.field2588 + var78);
                                            }
                                        } else {
                                            var72.method1992(0, var10.field2561, 0, var10.field2559, 0, var77, var78);
                                        }
                                    }
                                    class85.method1824();
                                } else {
                                    if (var10.field2551 == 7) {
                                        class205 var79 = var10.method2842();
                                        if (var79 == null) {
                                            if (class155.field2652) {
                                                method137(var10);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var10.field2609; var81++) {
                                            for (int var82 = 0; var82 < var10.field2558; var82++) {
                                                if (var10.field2594[var80] > 0) {
                                                    class46 var83 = class46.method476(var10.field2594[var80] - 1);
                                                    String var84;
                                                    if (var83.field1033 != 1 && var10.field2583[var80] == 1) {
                                                        var84 = class2.method2540(16748608) + var83.field1034 + class2.field25;
                                                    } else {
                                                        var84 = class2.method2540(16748608) + var83.field1034 + class2.field25 + " " + 'x' + method1352(var10.field2583[var80]);
                                                    }
                                                    int var85 = (var10.field2603 + 115) * var82 + var13;
                                                    int var86 = (var10.field2604 + 12) * var81 + var14;
                                                    if (var10.field2638 == 0) {
                                                        var79.method3483(var84, var85, var86, var10.field2566, var10.field2602 ? 0 : -1);
                                                    } else if (var10.field2638 == 1) {
                                                        var79.method3428(var84, var10.field2558 / 2 + var85, var86, var10.field2566, var10.field2602 ? 0 : -1);
                                                    } else {
                                                        var79.method3427(var84, var10.field2558 + var85 - 1, var86, var10.field2566, var10.field2602 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var10.field2551 == 8 && Statics.field996 == var10 && field492 == field400) {
                                        int var87 = 0;
                                        int var88 = 0;
                                        class205 var89 = Statics.field1095;
                                        String var90 = var10.field2597;
                                        String var91 = method72(var90, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field18);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            int var94 = var89.method3477(var93);
                                            if (var94 > var87) {
                                                var87 = var94;
                                            }
                                            var88 += var89.field2958 + 1;
                                        }
                                        var87 += 6;
                                        var88 += 7;
                                        int var95 = var10.field2558 + var13 - 5 - var87;
                                        int var96 = var10.field2609 + var14 + 5;
                                        if (var95 < var13 + 5) {
                                            var95 = var13 + 5;
                                        }
                                        if (var87 + var95 > arg4) {
                                            var95 = arg4 - var87;
                                        }
                                        if (var88 + var96 > arg5) {
                                            var96 = arg5 - var88;
                                        }
                                        class74.method1513(var95, var96, var87, var88, 16777120);
                                        class74.method1515(var95, var96, var87, var88, 0);
                                        String var97 = var10.field2597;
                                        int var98 = var89.field2958 + var96 + 2;
                                        String var99 = method72(var97, var10);
                                        while (var99.length() > 0) {
                                            int var100 = var99.indexOf(class2.field18);
                                            String var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = "";
                                            } else {
                                                var101 = var99.substring(0, var100);
                                                var99 = var99.substring(var100 + 4);
                                            }
                                            var89.method3483(var101, var95 + 3, var98, 0, -1);
                                            var98 += var89.field2958 + 1;
                                        }
                                    }
                                    if (var10.field2551 == 9) {
                                        if (var10.field2572 == 1) {
                                            class74.method1521(var13, var14, var10.field2558 + var13, var10.field2609 + var14, var10.field2566);
                                        } else {
                                            int var102 = var10.field2558 >= 0 ? var10.field2558 : -var10.field2558;
                                            int var103 = var10.field2609 >= 0 ? var10.field2609 : -var10.field2609;
                                            int var104 = var102;
                                            if (var102 < var103) {
                                                var104 = var103;
                                            }
                                            if (var104 != 0) {
                                                int var105 = (var10.field2558 << 16) / var104;
                                                int var106 = (var10.field2609 << 16) / var104;
                                                if (var106 <= var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var106 = -var106;
                                                }
                                                int var107 = var10.field2572 * var106 >> 17;
                                                int var108 = var10.field2572 * var106 + 1 >> 17;
                                                int var109 = var10.field2572 * var105 >> 17;
                                                int var110 = var10.field2572 * var105 + 1 >> 17;
                                                int var111 = var13 + var107;
                                                int var112 = var13 - var108;
                                                int var113 = var10.field2558 + var13 - var108;
                                                int var114 = var10.field2558 + var13 + var107;
                                                int var115 = var14 + var109;
                                                int var116 = var14 - var110;
                                                int var117 = var10.field2609 + var14 - var110;
                                                int var118 = var10.field2609 + var14 + var109;
                                                class85.method1781(var111, var112, var113);
                                                class85.method1789(var115, var116, var117, var111, var112, var113, var10.field2566);
                                                class85.method1781(var111, var113, var114);
                                                class85.method1789(var115, var117, var118, var111, var113, var114, var10.field2566);
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

    @ObfuscatedName("l.bs(Ljava/lang/String;Ler;I)Ljava/lang/String;")
    public static String method72(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method33(method2814(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2506 != null) {
                    var5 = class211.method3346(Statics.field2506.field2076);
                    if (Statics.field2506.field2079 != null) {
                        var5 = (String) Statics.field2506.field2079;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bh.bd(II)Ljava/lang/String;")
    public static final String method1352(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2540(65408) + var1.substring(0, var1.length() - 8) + class145.field2326 + " " + class2.field21 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method2540(16777215) + var1.substring(0, var1.length() - 4) + class145.field2412 + " " + class2.field21 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method2540(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("q.bj(IS)Ljava/lang/String;")
    public static final String method33(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("b.ck(Ler;I)Z")
    public static final boolean method84(class155 arg0) {
        if (arg0.field2649 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2649.length; var1++) {
            int var2 = method2814(arg0, var1);
            int var3 = arg0.field2650[var1];
            if (arg0.field2649[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2649[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2649[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.cv(Ler;IS)I")
    public static final int method2814(class155 arg0, int arg1) {
        if (arg0.field2648 == null || arg1 >= arg0.field2648.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2648[arg1];
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
                    var7 = field384[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field385[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field386[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method1383(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method476(var12).field1029 || field508)) {
                        for (int var13 = 0; var13 < var11.field2594.length; var13++) {
                            if (var12 + 1 == var11.field2594[var13]) {
                                var7 += var11.field2583[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2678[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2153[field385[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2678[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field695.field37;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2152[var14]) {
                            var7 += field385[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method1383(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method476(var18).field1029 || field508)) {
                        for (int var19 = 0; var19 < var17.field2594.length; var19++) {
                            if (var18 + 1 == var17.field2594[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field283;
                }
                if (var6 == 12) {
                    var7 = field412;
                }
                if (var6 == 13) {
                    int var20 = class157.field2678[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method82(var22);
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
                    var7 = (Statics.field695.field763 >> 7) + Statics.field1821;
                }
                if (var6 == 19) {
                    var7 = (Statics.field695.field735 >> 7) + Statics.field990;
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

    @ObfuscatedName("gc.cc([Ler;IIIIIIII)V")
    public static final void method3368(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2548 || var9.field2551 == 0 || var9.field2617 || method125(var9) != 0 || field421 == var9) && var9.field2560 == arg1 && (!var9.field2548 || !method2400(var9))) {
                int var10 = var9.field2601 + arg6;
                int var11 = var9.field2555 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2551 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2551 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2558 + var10;
                    int var19 = var9.field2609 + var11;
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
                    int var22 = var9.field2558 + var10;
                    int var23 = var9.field2609 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field248 == var9) {
                    field435 = true;
                    field429 = var10;
                    field271 = var11;
                }
                if (!var9.field2548 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field2003;
                    int var25 = class129.field2004;
                    if (class129.field2009 != 0) {
                        var24 = class129.field2010;
                        var25 = class129.field1997;
                    }
                    if (var9.field2553 == 1337) {
                        method137(var9);
                        if (!field450 && !field250 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field401 == 0 && !field403) {
                                method628(class145.field2180, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class99.field1750; var28++) {
                                int var29 = class99.field1741[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2027.method1631(Statics.field170, var30, var31, var29) >= 0) {
                                        class37 var34 = class37.method2581(var33);
                                        if (var34.field884 != null) {
                                            var34 = var34.method661();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field401 == 1) {
                                            method628(class145.field2315, field380 + " " + class2.field23 + " " + class2.method2540(65535) + var34.field853, 1, var29, var30, var31);
                                        } else if (!field403) {
                                            String[] var35 = var34.field870;
                                            if (field419) {
                                                var35 = method136(var35);
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
                                                        method628(var35[var36], class2.method2540(65535) + var34.field853, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method628(class145.field2179, class2.method2540(65535) + var34.field853, 1002, var34.field850 << 14, var30, var31);
                                        } else if ((Statics.field1849 & 0x4) == 4) {
                                            method628(field406, field407 + " " + class2.field23 + " " + class2.method2540(65535) + var34.field853, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class31 var38 = field498[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field706.field808 == 1 && (var38.field763 & 0x7F) == 64 && (var38.field735 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field284; var39++) {
                                                class31 var40 = field498[field285[var39]];
                                                if (var40 != null && var38 != var40 && var40.field706.field808 == 1 && var38.field763 == var40.field763 && var38.field735 == var40.field735) {
                                                    method590(var40.field706, field285[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field366; var41++) {
                                                class3 var42 = field365[field367[var41]];
                                                if (var42 != null && var38.field763 == var42.field763 && var38.field735 == var42.field735) {
                                                    method549(var42, field367[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method590(var38.field706, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field365[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field763 & 0x7F) == 64 && (var43.field735 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field284; var44++) {
                                                class31 var45 = field498[field285[var44]];
                                                if (var45 != null && var45.field706.field808 == 1 && var43.field763 == var45.field763 && var43.field735 == var45.field735) {
                                                    method590(var45.field706, field285[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field366; var46++) {
                                                class3 var47 = field365[field367[var46]];
                                                if (var47 != null && var43 != var47 && var43.field763 == var47.field763 && var43.field735 == var47.field735) {
                                                    method549(var47, field367[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field445 == var33) {
                                            var26 = var29;
                                        } else {
                                            method549(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class180 var48 = field376[Statics.field170][var30][var31];
                                        if (var48 != null) {
                                            for (class26 var49 = (class26) var48.method3230(); var49 != null; var49 = (class26) var48.method3249()) {
                                                class46 var50 = class46.method476(var49.field626);
                                                if (field401 == 1) {
                                                    method628(class145.field2315, field380 + " " + class2.field23 + " " + class2.method2540(16748608) + var50.field1034, 16, var49.field626, var30, var31);
                                                } else if (!field403) {
                                                    String[] var51 = var50.field1043;
                                                    if (field419) {
                                                        var51 = method136(var51);
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
                                                            method628(var51[var52], class2.method2540(16748608) + var50.field1034, var53, var49.field626, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method628(class145.field2273, class2.method2540(16748608) + var50.field1034, 20, var49.field626, var30, var31);
                                                        }
                                                    }
                                                    method628(class145.field2179, class2.method2540(16748608) + var50.field1034, 1004, var49.field626, var30, var31);
                                                } else if ((Statics.field1849 & 0x1) == 1) {
                                                    method628(field406, field407 + " " + class2.field23 + " " + class2.method2540(16748608) + var50.field1034, 17, var49.field626, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field365[field445];
                                method549(var56, field445, var54, var55);
                            }
                        }
                    } else if (var9.field2553 == 1338) {
                        method748(var10, var11);
                    } else {
                        if (!field250 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var57 = var24 - var10;
                            int var58 = var25 - var11;
                            if (var9.field2630 == 1) {
                                method628(var9.field2653, "", 24, 0, 0, var9.field2549);
                            }
                            if (var9.field2630 == 2 && !field403) {
                                int var59 = method125(var9);
                                int var60 = var59 >> 11 & 0x3F;
                                String var61;
                                if (var60 == 0) {
                                    var61 = null;
                                } else if (var9.field2595 == null || var9.field2595.trim().length() == 0) {
                                    var61 = null;
                                } else {
                                    var61 = var9.field2595;
                                }
                                if (var61 != null) {
                                    method628(var61, class2.method2540(65280) + var9.field2658, 25, 0, -1, var9.field2549);
                                }
                            }
                            if (var9.field2630 == 3) {
                                method628(class145.field2324, "", 26, 0, 0, var9.field2549);
                            }
                            if (var9.field2630 == 4) {
                                method628(var9.field2653, "", 28, 0, 0, var9.field2549);
                            }
                            if (var9.field2630 == 5) {
                                method628(var9.field2653, "", 29, 0, 0, var9.field2549);
                            }
                            if (var9.field2630 == 6 && field495 == null) {
                                method628(var9.field2653, "", 30, 0, -1, var9.field2549);
                            }
                            if (var9.field2551 == 2) {
                                int var63 = 0;
                                for (int var64 = 0; var64 < var9.field2609; var64++) {
                                    for (int var65 = 0; var65 < var9.field2558; var65++) {
                                        int var66 = (var9.field2603 + 32) * var65;
                                        int var67 = (var9.field2604 + 32) * var64;
                                        if (var63 < 20) {
                                            var66 += var9.field2605[var63];
                                            var67 += var9.field2606[var63];
                                        }
                                        if (var57 >= var66 && var58 >= var67 && var57 < var66 + 32 && var58 < var67 + 32) {
                                            field240 = var63;
                                            Statics.field942 = var9;
                                            if (var9.field2594[var63] > 0) {
                                                label1298: {
                                                    class46 var68 = class46.method476(var9.field2594[var63] - 1);
                                                    if (field401 == 1) {
                                                        int var69 = method125(var9);
                                                        boolean var70 = (var69 >> 30 & 0x1) != 0;
                                                        if (var70) {
                                                            if (Statics.field2463 != var9.field2549 || Statics.field562 != var63) {
                                                                method628(class145.field2315, field380 + " " + class2.field23 + " " + class2.method2540(16748608) + var68.field1034, 31, var68.field1039, var63, var9.field2549);
                                                            }
                                                            break label1298;
                                                        }
                                                    }
                                                    if (field403) {
                                                        int var71 = method125(var9);
                                                        boolean var72 = (var71 >> 30 & 0x1) != 0;
                                                        if (var72) {
                                                            if ((Statics.field1849 & 0x10) == 16) {
                                                                method628(field406, field407 + " " + class2.field23 + " " + class2.method2540(16748608) + var68.field1034, 32, var68.field1039, var63, var9.field2549);
                                                            }
                                                            break label1298;
                                                        }
                                                    }
                                                    String[] var73 = var68.field1067;
                                                    if (field419) {
                                                        var73 = method136(var73);
                                                    }
                                                    int var74 = method125(var9);
                                                    boolean var75 = (var74 >> 30 & 0x1) != 0;
                                                    if (var75) {
                                                        for (int var76 = 4; var76 >= 3; var76--) {
                                                            if (var73 != null && var73[var76] != null) {
                                                                byte var77;
                                                                if (var76 == 3) {
                                                                    var77 = 36;
                                                                } else {
                                                                    var77 = 37;
                                                                }
                                                                method628(var73[var76], class2.method2540(16748608) + var68.field1034, var77, var68.field1039, var63, var9.field2549);
                                                            } else if (var76 == 4) {
                                                                method628(class145.field2189, class2.method2540(16748608) + var68.field1034, 37, var68.field1039, var63, var9.field2549);
                                                            }
                                                        }
                                                    }
                                                    int var78 = method125(var9);
                                                    boolean var79 = (var78 >> 31 & 0x1) != 0;
                                                    if (var79) {
                                                        method628(class145.field2315, class2.method2540(16748608) + var68.field1034, 38, var68.field1039, var63, var9.field2549);
                                                    }
                                                    int var80 = method125(var9);
                                                    boolean var81 = (var80 >> 30 & 0x1) != 0;
                                                    if (var81 && var73 != null) {
                                                        for (int var82 = 2; var82 >= 0; var82--) {
                                                            if (var73[var82] != null) {
                                                                byte var83 = 0;
                                                                if (var82 == 0) {
                                                                    var83 = 33;
                                                                }
                                                                if (var82 == 1) {
                                                                    var83 = 34;
                                                                }
                                                                if (var82 == 2) {
                                                                    var83 = 35;
                                                                }
                                                                method628(var73[var82], class2.method2540(16748608) + var68.field1034, var83, var68.field1039, var63, var9.field2549);
                                                            }
                                                        }
                                                    }
                                                    String[] var84 = var9.field2596;
                                                    if (field419) {
                                                        var84 = method136(var84);
                                                    }
                                                    if (var84 != null) {
                                                        for (int var85 = 4; var85 >= 0; var85--) {
                                                            if (var84[var85] != null) {
                                                                byte var86 = 0;
                                                                if (var85 == 0) {
                                                                    var86 = 39;
                                                                }
                                                                if (var85 == 1) {
                                                                    var86 = 40;
                                                                }
                                                                if (var85 == 2) {
                                                                    var86 = 41;
                                                                }
                                                                if (var85 == 3) {
                                                                    var86 = 42;
                                                                }
                                                                if (var85 == 4) {
                                                                    var86 = 43;
                                                                }
                                                                method628(var84[var85], class2.method2540(16748608) + var68.field1034, var86, var68.field1039, var63, var9.field2549);
                                                            }
                                                        }
                                                    }
                                                    method628(class145.field2179, class2.method2540(16748608) + var68.field1034, 1005, var68.field1039, var63, var9.field2549);
                                                }
                                            }
                                        }
                                        var63++;
                                    }
                                }
                            }
                            if (var9.field2548) {
                                if (field403) {
                                    int var87 = method125(var9);
                                    boolean var88 = (var87 >> 21 & 0x1) != 0;
                                    if (var88 && (Statics.field1849 & 0x20) == 32) {
                                        method628(field406, field407 + " " + class2.field23 + " " + var9.field2623, 58, 0, var9.field2550, var9.field2549);
                                    }
                                } else {
                                    for (int var89 = 9; var89 >= 5; var89--) {
                                        String var90 = method83(var9, var89);
                                        if (var90 != null) {
                                            method628(var90, var9.field2623, 1007, var89 + 1, var9.field2550, var9.field2549);
                                        }
                                    }
                                    int var91 = method125(var9);
                                    int var92 = var91 >> 11 & 0x3F;
                                    String var93;
                                    if (var92 == 0) {
                                        var93 = null;
                                    } else if (var9.field2595 == null || var9.field2595.trim().length() == 0) {
                                        var93 = null;
                                    } else {
                                        var93 = var9.field2595;
                                    }
                                    if (var93 != null) {
                                        method628(var93, var9.field2623, 25, 0, var9.field2550, var9.field2549);
                                    }
                                    for (int var95 = 4; var95 >= 0; var95--) {
                                        String var96 = method83(var9, var95);
                                        if (var96 != null) {
                                            method628(var96, var9.field2623, 57, var95 + 1, var9.field2550, var9.field2549);
                                        }
                                    }
                                    if (class159.method1354(method125(var9))) {
                                        method628(class145.field2171, "", 30, 0, var9.field2550, var9.field2549);
                                    }
                                }
                            }
                        }
                        if (var9.field2551 == 0) {
                            if (!var9.field2548 && method2400(var9) && Statics.field2788 != var9) {
                                continue;
                            }
                            method3368(arg0, var9.field2549, var12, var13, var14, var15, var10 - var9.field2621, var11 - var9.field2563);
                            if (var9.field2660 != null) {
                                method3368(var9.field2660, var9.field2549, var12, var13, var14, var15, var10 - var9.field2621, var11 - var9.field2563);
                            }
                            class4 var97 = (class4) field409.method3192((long) var9.field2549);
                            if (var97 != null) {
                                if (var97.field55 == 0 && class129.field2003 >= var12 && class129.field2004 >= var13 && class129.field2003 < var14 && class129.field2004 < var15 && !field250 && !field266) {
                                    field395[0] = class145.field2401;
                                    field396[0] = "";
                                    field393[0] = 1006;
                                    field390 = 1;
                                }
                                int var98 = var97.field60;
                                if (class155.method485(var98)) {
                                    method3368(Statics.field2584[var98], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2548) {
                            if (var9.field2669 && class129.field2003 >= var12 && class129.field2004 >= var13 && class129.field2003 < var14 && class129.field2004 < var15) {
                                for (class1 var99 = (class1) field309.method3226(); var99 != null; var99 = (class1) field309.method3231()) {
                                    if (var99.field5) {
                                        var99.method3324();
                                        var99.field3.field2661 = false;
                                    }
                                }
                                if (Statics.field697 == 0) {
                                    field248 = null;
                                    field421 = null;
                                }
                                if (!field250) {
                                    field395[0] = class145.field2401;
                                    field396[0] = "";
                                    field393[0] = 1006;
                                    field390 = 1;
                                }
                            }
                            boolean var100;
                            if (class129.field2003 >= var12 && class129.field2004 >= var13 && class129.field2003 < var14 && class129.field2004 < var15) {
                                var100 = true;
                            } else {
                                var100 = false;
                            }
                            boolean var101 = false;
                            if ((class129.field1999 == 1 || !Statics.field330 && class129.field1999 == 4) && var100) {
                                var101 = true;
                            }
                            boolean var102 = false;
                            if ((class129.field2009 == 1 || !Statics.field330 && class129.field2009 == 4) && class129.field2010 >= var12 && class129.field1997 >= var13 && class129.field2010 < var14 && class129.field1997 < var15) {
                                var102 = true;
                            }
                            if (var102) {
                                method592(var9, class129.field2010 - var10, class129.field1997 - var11);
                            }
                            if (field248 != null && field248 != var9 && var100) {
                                int var103 = method125(var9);
                                boolean var104 = (var103 >> 20 & 0x1) != 0;
                                if (var104) {
                                    field272 = var9;
                                }
                            }
                            if (field421 == var9) {
                                field437 = true;
                                field426 = var10;
                                field387 = var11;
                            }
                            if (var9.field2617) {
                                if (var100 && field447 != 0 && var9.field2540 != null) {
                                    class1 var105 = new class1();
                                    var105.field5 = true;
                                    var105.field3 = var9;
                                    var105.field14 = field447;
                                    var105.field8 = var9.field2540;
                                    field309.method3224(var105);
                                }
                                if (field248 != null || Statics.field2147 != null || field250) {
                                    var102 = false;
                                    var101 = false;
                                    var100 = false;
                                }
                                if (!var9.field2662 && var102) {
                                    var9.field2662 = true;
                                    if (var9.field2571 != null) {
                                        class1 var106 = new class1();
                                        var106.field5 = true;
                                        var106.field3 = var9;
                                        var106.field11 = class129.field2010 - var10;
                                        var106.field14 = class129.field1997 - var11;
                                        var106.field8 = var9.field2571;
                                        field309.method3224(var106);
                                    }
                                }
                                if (var9.field2662 && var101 && var9.field2620 != null) {
                                    class1 var107 = new class1();
                                    var107.field5 = true;
                                    var107.field3 = var9;
                                    var107.field11 = class129.field2003 - var10;
                                    var107.field14 = class129.field2004 - var11;
                                    var107.field8 = var9.field2620;
                                    field309.method3224(var107);
                                }
                                if (var9.field2662 && !var101) {
                                    var9.field2662 = false;
                                    if (var9.field2589 != null) {
                                        class1 var108 = new class1();
                                        var108.field5 = true;
                                        var108.field3 = var9;
                                        var108.field11 = class129.field2003 - var10;
                                        var108.field14 = class129.field2004 - var11;
                                        var108.field8 = var9.field2589;
                                        field493.method3224(var108);
                                    }
                                }
                                if (var101 && var9.field2622 != null) {
                                    class1 var109 = new class1();
                                    var109.field5 = true;
                                    var109.field3 = var9;
                                    var109.field11 = class129.field2003 - var10;
                                    var109.field14 = class129.field2004 - var11;
                                    var109.field8 = var9.field2622;
                                    field309.method3224(var109);
                                }
                                if (!var9.field2661 && var100) {
                                    var9.field2661 = true;
                                    if (var9.field2554 != null) {
                                        class1 var110 = new class1();
                                        var110.field5 = true;
                                        var110.field3 = var9;
                                        var110.field11 = class129.field2003 - var10;
                                        var110.field14 = class129.field2004 - var11;
                                        var110.field8 = var9.field2554;
                                        field309.method3224(var110);
                                    }
                                }
                                if (var9.field2661 && var100 && var9.field2624 != null) {
                                    class1 var111 = new class1();
                                    var111.field5 = true;
                                    var111.field3 = var9;
                                    var111.field11 = class129.field2003 - var10;
                                    var111.field14 = class129.field2004 - var11;
                                    var111.field8 = var9.field2624;
                                    field309.method3224(var111);
                                }
                                if (var9.field2661 && !var100) {
                                    var9.field2661 = false;
                                    if (var9.field2625 != null) {
                                        class1 var112 = new class1();
                                        var112.field5 = true;
                                        var112.field3 = var9;
                                        var112.field11 = class129.field2003 - var10;
                                        var112.field14 = class129.field2004 - var11;
                                        var112.field8 = var9.field2625;
                                        field493.method3224(var112);
                                    }
                                }
                                if (var9.field2636 != null) {
                                    class1 var113 = new class1();
                                    var113.field3 = var9;
                                    var113.field8 = var9.field2636;
                                    field442.method3224(var113);
                                }
                                if (var9.field2576 != null && field434 > var9.field2664) {
                                    if (var9.field2631 == null || field434 - var9.field2664 > 32) {
                                        class1 var118 = new class1();
                                        var118.field3 = var9;
                                        var118.field8 = var9.field2576;
                                        field309.method3224(var118);
                                    } else {
                                        label994: for (int var114 = var9.field2664; var114 < field434; var114++) {
                                            int var115 = field433[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2631.length; var116++) {
                                                if (var9.field2631[var116] == var115) {
                                                    class1 var117 = new class1();
                                                    var117.field3 = var9;
                                                    var117.field8 = var9.field2576;
                                                    field309.method3224(var117);
                                                    break label994;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2664 = field434;
                                }
                                if (var9.field2580 != null && field436 > var9.field2640) {
                                    if (var9.field2633 == null || field436 - var9.field2640 > 32) {
                                        class1 var123 = new class1();
                                        var123.field3 = var9;
                                        var123.field8 = var9.field2580;
                                        field309.method3224(var123);
                                    } else {
                                        label970: for (int var119 = var9.field2640; var119 < field436; var119++) {
                                            int var120 = field466[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2633.length; var121++) {
                                                if (var9.field2633[var121] == var120) {
                                                    class1 var122 = new class1();
                                                    var122.field3 = var9;
                                                    var122.field8 = var9.field2580;
                                                    field309.method3224(var122);
                                                    break label970;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2640 = field436;
                                }
                                if (var9.field2634 != null && field449 > var9.field2666) {
                                    if (var9.field2635 == null || field449 - var9.field2666 > 32) {
                                        class1 var128 = new class1();
                                        var128.field3 = var9;
                                        var128.field8 = var9.field2634;
                                        field309.method3224(var128);
                                    } else {
                                        label946: for (int var124 = var9.field2666; var124 < field449; var124++) {
                                            int var125 = field414[var124 & 0x1F];
                                            for (int var126 = 0; var126 < var9.field2635.length; var126++) {
                                                if (var9.field2635[var126] == var125) {
                                                    class1 var127 = new class1();
                                                    var127.field3 = var9;
                                                    var127.field8 = var9.field2634;
                                                    field309.method3224(var127);
                                                    break label946;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2666 = field449;
                                }
                                if (field439 > var9.field2663 && var9.field2639 != null) {
                                    class1 var129 = new class1();
                                    var129.field3 = var9;
                                    var129.field8 = var9.field2639;
                                    field309.method3224(var129);
                                }
                                if (field320 > var9.field2663 && var9.field2590 != null) {
                                    class1 var130 = new class1();
                                    var130.field3 = var9;
                                    var130.field8 = var9.field2590;
                                    field309.method3224(var130);
                                }
                                if (field441 > var9.field2663 && var9.field2642 != null) {
                                    class1 var131 = new class1();
                                    var131.field3 = var9;
                                    var131.field8 = var9.field2642;
                                    field309.method3224(var131);
                                }
                                if (field428 > var9.field2663 && var9.field2586 != null) {
                                    class1 var132 = new class1();
                                    var132.field3 = var9;
                                    var132.field8 = var9.field2586;
                                    field309.method3224(var132);
                                }
                                if (field443 > var9.field2663 && var9.field2647 != null) {
                                    class1 var133 = new class1();
                                    var133.field3 = var9;
                                    var133.field8 = var9.field2647;
                                    field309.method3224(var133);
                                }
                                if (field444 > var9.field2663 && var9.field2643 != null) {
                                    class1 var134 = new class1();
                                    var134.field3 = var9;
                                    var134.field8 = var9.field2643;
                                    field309.method3224(var134);
                                }
                                var9.field2663 = field432;
                                if (var9.field2646 != null) {
                                    for (int var135 = 0; var135 < field468; var135++) {
                                        class1 var136 = new class1();
                                        var136.field3 = var9;
                                        var136.field4 = field470[var135];
                                        var136.field2 = field469[var135];
                                        var136.field8 = var9.field2646;
                                        field309.method3224(var136);
                                    }
                                }
                            }
                        }
                        if (!var9.field2548 && field248 == null && Statics.field2147 == null && !field250) {
                            if ((var9.field2651 >= 0 || var9.field2568 != 0) && class129.field2003 >= var12 && class129.field2004 >= var13 && class129.field2003 < var14 && class129.field2004 < var15) {
                                if (var9.field2651 >= 0) {
                                    Statics.field2788 = arg0[var9.field2651];
                                } else {
                                    Statics.field2788 = var9;
                                }
                            }
                            if (var9.field2551 == 8 && class129.field2003 >= var12 && class129.field2004 >= var13 && class129.field2003 < var14 && class129.field2004 < var15) {
                                Statics.field996 = var9;
                            }
                            if (var9.field2565 > var9.field2609) {
                                int var137 = var9.field2558 + var10;
                                int var138 = var9.field2609;
                                int var139 = var9.field2565;
                                int var140 = class129.field2003;
                                int var141 = class129.field2004;
                                if (field327) {
                                    field328 = 32;
                                } else {
                                    field328 = 0;
                                }
                                field327 = false;
                                if (class129.field1999 == 1 || !Statics.field330 && class129.field1999 == 4) {
                                    if (var140 >= var137 && var140 < var137 + 16 && var141 >= var11 && var141 < var11 + 16) {
                                        var9.field2563 -= 4;
                                        method137(var9);
                                    } else if (var140 >= var137 && var140 < var137 + 16 && var141 >= var11 + var138 - 16 && var141 < var11 + var138) {
                                        var9.field2563 += 4;
                                        method137(var9);
                                    } else if (var140 >= var137 - field328 && var140 < field328 + var137 + 16 && var141 >= var11 + 16 && var141 < var11 + var138 - 16) {
                                        int var142 = (var138 - 32) * var138 / var139;
                                        if (var142 < 8) {
                                            var142 = 8;
                                        }
                                        int var143 = var141 - var11 - 16 - var142 / 2;
                                        int var144 = var138 - 32 - var142;
                                        var9.field2563 = (var139 - var138) * var143 / var144;
                                        method137(var9);
                                        field327 = true;
                                    }
                                }
                                if (field447 != 0) {
                                    int var145 = var9.field2558;
                                    if (var140 >= var137 - var145 && var141 >= var11 && var140 < var137 + 16 && var141 <= var11 + var138) {
                                        var9.field2563 += field447 * 45;
                                        method137(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.cs(III)V")
    public static final void method139(int arg0, int arg1) {
        if (class155.method485(arg0)) {
            method1599(Statics.field2584[arg0], arg1);
        }
    }

    @ObfuscatedName("ck.cj([Ler;IB)V")
    public static final void method1599(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2551 == 0) {
                    if (var3.field2660 != null) {
                        method1599(var3.field2660, arg1);
                    }
                    class4 var4 = (class4) field409.method3192((long) var3.field2549);
                    if (var4 != null) {
                        method139(var4.field60, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2644 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field8 = var3.field2644;
                    class33.method561(var5, 200000);
                }
                if (arg1 == 1 && var3.field2645 != null) {
                    if (var3.field2550 >= 0) {
                        class155 var6 = class155.method1383(var3.field2549);
                        if (var6 == null || var6.field2660 == null || var3.field2550 >= var6.field2660.length || var6.field2660[var3.field2550] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field8 = var3.field2645;
                    class33.method561(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ae.cw(Ler;IIB)V")
    public static final void method592(class155 arg0, int arg1, int arg2) {
        if (field248 != null || field250 || arg0 == null || method2385(arg0) == null) {
            return;
        }
        field248 = arg0;
        field421 = method2385(arg0);
        field274 = arg1;
        field344 = arg2;
        Statics.field697 = 0;
        field431 = false;
        if (field390 > 0) {
            method2228(field390 - 1);
        }
    }

    @ObfuscatedName("cb.cp(B)V")
    public static final void method1871() {
        method137(field248);
        Statics.field697++;
        if (field435 && field437) {
            int var0 = class129.field2003;
            int var1 = class129.field2004;
            int var2 = var0 - field274;
            int var3 = var1 - field344;
            if (var2 < field426) {
                var2 = field426;
            }
            if (field248.field2558 + var2 > field426 + field421.field2558) {
                var2 = field426 + field421.field2558 - field248.field2558;
            }
            if (var3 < field387) {
                var3 = field387;
            }
            if (field248.field2609 + var3 > field387 + field421.field2609) {
                var3 = field387 + field421.field2609 - field248.field2609;
            }
            int var4 = var2 - field429;
            int var5 = var3 - field271;
            int var6 = field248.field2613;
            if (Statics.field697 > field248.field2614 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field431 = true;
            }
            int var7 = field421.field2621 + (var2 - field426);
            int var8 = field421.field2563 + (var3 - field387);
            if (field248.field2626 != null && field431) {
                class1 var9 = new class1();
                var9.field3 = field248;
                var9.field11 = var7;
                var9.field14 = var8;
                var9.field8 = field248.field2626;
                class33.method561(var9, 200000);
            }
            if (class129.field1999 == 0) {
                if (field431) {
                    if (field248.field2585 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field248;
                        var10.field11 = var7;
                        var10.field14 = var8;
                        var10.field7 = field272;
                        var10.field8 = field248.field2585;
                        class33.method561(var10, 200000);
                    }
                    if (field272 != null && method2818(field248) != null) {
                        field454.method2357(86);
                        field454.method2153(field248.field2656);
                        field454.method2153(field248.field2550);
                        field454.method2161(field272.field2549);
                        field454.method2134(field248.field2549);
                        field454.method2153(field272.field2656);
                        field454.method2153(field272.field2550);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field257 != 1) {
                                int var11 = field390 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field393[var11];
                                    if (var13 >= 2000) {
                                        var13 -= 2000;
                                    }
                                    if (var13 == 1007) {
                                        var12 = true;
                                    } else {
                                        var12 = false;
                                    }
                                }
                                if (!var12) {
                                    break label72;
                                }
                            }
                            if (field390 > 2) {
                                method1870(field429 + field274, field344 + field271);
                                break label99;
                            }
                        }
                        if (field390 > 0) {
                            int var14 = field429 + field274;
                            int var15 = field344 + field271;
                            method2580(Statics.field692, var14, var15);
                            Statics.field692 = null;
                        }
                    }
                }
                field248 = null;
            }
        } else if (Statics.field697 > 1) {
            field248 = null;
        }
    }

    @ObfuscatedName("dd.ca(II)V")
    public static void method2228(int arg0) {
        Statics.field692 = new class28();
        Statics.field692.field644 = field391[arg0];
        Statics.field692.field639 = field392[arg0];
        Statics.field692.field640 = field393[arg0];
        Statics.field692.field645 = field394[arg0];
        Statics.field692.field642 = field395[arg0];
    }

    @ObfuscatedName("p.cq(Ler;I)V")
    public static void method137(class155 arg0) {
        if (field453 == arg0.field2619) {
            field506[arg0.field2667] = true;
        }
    }

    @ObfuscatedName("k.cb(I)V")
    public static void method24() {
        for (class4 var0 = (class4) field409.method3205(); var0 != null; var0 = (class4) field409.method3196()) {
            int var1 = var0.field60;
            if (class155.method485(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2584[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2548;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2894;
                    class155 var6 = class155.method1383(var5);
                    if (var6 != null) {
                        method137(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.ce(Ler;I)Ler;")
    public static class155 method2385(class155 arg0) {
        class155 var1 = method2818(arg0);
        if (var1 == null) {
            var1 = arg0.field2612;
        }
        return var1;
    }

    @ObfuscatedName("p.cl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method136(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("el.ci(II)V")
    public static final void method2582(int arg0) {
        if (!class155.method485(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2598 = 0;
                var3.field2659 = 0;
            }
        }
    }

    @ObfuscatedName("az.cy(II)V")
    public static final void method775(int arg0) {
        if (class155.method485(arg0)) {
            method85(Statics.field2584[arg0], -1);
        }
    }

    @ObfuscatedName("b.cm([Ler;II)V")
    public static final void method85(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null && var3.field2560 == arg1 && (!var3.field2548 || !method2400(var3))) {
                if (var3.field2551 == 0) {
                    if (!var3.field2548 && method2400(var3) && Statics.field2788 != var3) {
                        continue;
                    }
                    method85(arg0, var3.field2549);
                    if (var3.field2660 != null) {
                        method85(var3.field2660, var3.field2549);
                    }
                    class4 var4 = (class4) field409.method3192((long) var3.field2549);
                    if (var4 != null) {
                        method775(var4.field60);
                    }
                }
                if (var3.field2551 == 6) {
                    if (var3.field2542 != -1 || var3.field2600 != -1) {
                        boolean var5 = method84(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2600;
                        } else {
                            var6 = var3.field2542;
                        }
                        if (var6 != -1) {
                            class39 var7 = class39.method2315(var6);
                            var3.field2659 += field350;
                            while (var3.field2659 > var7.field917[var3.field2598]) {
                                var3.field2659 -= var7.field917[var3.field2598];
                                var3.field2598++;
                                if (var3.field2598 >= var7.field925.length) {
                                    var3.field2598 -= var7.field919;
                                    if (var3.field2598 < 0 || var3.field2598 >= var7.field925.length) {
                                        var3.field2598 = 0;
                                    }
                                }
                                method137(var3);
                            }
                        }
                    }
                    if (var3.field2593 != 0 && !var3.field2548) {
                        int var8 = var3.field2593 >> 16;
                        int var9 = var3.field2593 << 16 >> 16;
                        int var10 = field350 * var8;
                        int var11 = field350 * var9;
                        var3.field2559 = var3.field2559 + var10 & 0x7FF;
                        var3.field2561 = var3.field2561 + var11 & 0x7FF;
                        method137(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.cd(IB)V")
    public static final void method509(int arg0) {
        method24();
        class21.method2443();
        int var1 = class47.method890(arg0).field1076;
        if (var1 == 0) {
            return;
        }
        int var2 = class157.field2678[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1838(0.9D);
                ((class89) Statics.field1497).method1873(0.9D);
            }
            if (var2 == 2) {
                class85.method1838(0.8D);
                ((class89) Statics.field1497).method1873(0.8D);
            }
            if (var2 == 3) {
                class85.method1838(0.7D);
                ((class89) Statics.field1497).method1873(0.7D);
            }
            if (var2 == 4) {
                class85.method1838(0.6D);
                ((class89) Statics.field1497).method1873(0.6D);
            }
            class46.field1031.method3157();
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
            if (field483 != var3) {
                if (field483 == 0 && field484 != -1) {
                    class164.method1775(Statics.field2711, field484, 0, var3, false);
                    field485 = false;
                } else if (var3 == 0) {
                    Statics.field2730.method3062();
                    class164.field2732 = 1;
                    Statics.field1022 = null;
                    field485 = false;
                } else {
                    class164.method2354(var3);
                }
                field483 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field314 = 127;
            }
            if (var2 == 1) {
                field314 = 96;
            }
            if (var2 == 2) {
                field314 = 64;
            }
            if (var2 == 3) {
                field314 = 32;
            }
            if (var2 == 4) {
                field314 = 0;
            }
        }
        if (var1 == 5) {
            field257 = var2;
        }
        if (var1 == 6) {
            field410 = var2;
        }
        if (var1 == 9) {
            field354 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field487 = 127;
            }
            if (var2 == 1) {
                field487 = 96;
            }
            if (var2 == 2) {
                field487 = 64;
            }
            if (var2 == 3) {
                field487 = 32;
            }
            if (var2 == 4) {
                field487 = 0;
            }
        }
        if (var1 == 17) {
            field416 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field517, class18.field514, class18.field513 };
            field358 = (class18) class100.method1(var4, var2);
            if (field358 == null) {
                field358 = class18.field513;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field445 = -1;
        } else {
            field445 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("az.cr(I)V")
    public static final void method778() {
        field454.method2357(203);
        for (class4 var0 = (class4) field409.method3205(); var0 != null; var0 = (class4) field409.method3196()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method1872(var0, true);
            }
        }
        if (field495 != null) {
            method137(field495);
            field495 = null;
        }
    }

    @ObfuscatedName("cb.cz(Lg;ZB)V")
    public static final void method1872(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2894;
        arg0.method3324();
        if (arg1 && var2 != -1 && Statics.field2541[var2]) {
            Statics.field2587.method2732(var2);
            if (Statics.field2584[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2584[var2].length; var5++) {
                    if (Statics.field2584[var2][var5] != null) {
                        if (Statics.field2584[var2][var5].field2551 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2584[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2584[var2] = null;
                }
                Statics.field2541[var2] = false;
            }
        }
        for (class182 var6 = (class182) field451.method3205(); var6 != null; var6 = (class182) field451.method3196()) {
            if ((long) var2 == (var6.field2894 >> 48 & 0xFFFFL)) {
                var6.method3324();
            }
        }
        class155 var7 = class155.method1383(var3);
        if (var7 != null) {
            method137(var7);
        }
        method103();
        if (field408 != -1) {
            method139(field408, 1);
        }
    }

    @ObfuscatedName("ek.ch(Ler;S)Z")
    public static final boolean method2834(class155 arg0) {
        int var1 = arg0.field2553;
        if (var1 == 205) {
            field293 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field362.method2910(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field362.method2920(var4, var5 == 1);
        }
        if (var1 == 324) {
            field362.method2911(false);
        }
        if (var1 == 325) {
            field362.method2911(true);
        }
        if (var1 == 326) {
            field454.method2357(65);
            field362.method2912(field454);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cr.cn(IIII)V")
    public static final void method1958(int arg0, int arg1, int arg2) {
        method155();
        class74.method1526(arg0, arg1, Statics.field842.field1339 + arg0, Statics.field842.field1343 + arg1);
        if (field482 == 2 || field482 == 5) {
            class74.method1522(arg0 + 25, arg1 + 5, 0, Statics.field128, Statics.field1270);
        } else {
            int var3 = field378 + field315 & 0x7FF;
            int var4 = Statics.field695.field763 / 32 + 48;
            int var5 = 464 - Statics.field695.field735 / 32;
            Statics.field120.method1445(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field317 + 256, Statics.field128, Statics.field1270);
            for (int var6 = 0; var6 < field475; var6++) {
                int var7 = field476[var6] * 4 + 2 - Statics.field695.field763 / 32;
                int var8 = field438[var6] * 4 + 2 - Statics.field695.field735 / 32;
                method1869(arg0, arg1, var7, var8, field478[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class180 var11 = field376[Statics.field170][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field695.field763 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field695.field735 / 32;
                        method1869(arg0, arg1, var12, var13, Statics.field2146[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field284; var14++) {
                class31 var15 = field498[field285[var14]];
                if (var15 != null && var15.method25()) {
                    class36 var16 = var15.field706;
                    if (var16 != null && var16.field832 != null) {
                        var16 = var16.method611();
                    }
                    if (var16 != null && var16.field820 && var16.field835) {
                        int var17 = var15.field763 / 32 - Statics.field695.field763 / 32;
                        int var18 = var15.field735 / 32 - Statics.field695.field735 / 32;
                        method1869(arg0, arg1, var17, var18, Statics.field2146[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field366; var19++) {
                class3 var20 = field365[field367[var19]];
                if (var20 != null && var20.method25() && !var20.field52) {
                    int var21 = var20.field763 / 32 - Statics.field695.field763 / 32;
                    int var22 = var20.field735 / 32 - Statics.field695.field735 / 32;
                    boolean var23 = false;
                    if (method1959(var20.field48, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field2066; var25++) {
                        if (var20.field48.equals(Statics.field1854[var25].field570)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field695.field51 != 0 && var20.field51 != 0 && Statics.field695.field51 == var20.field51) {
                        var26 = true;
                    }
                    if (var23) {
                        method1869(arg0, arg1, var21, var22, Statics.field2146[3]);
                    } else if (var26) {
                        method1869(arg0, arg1, var21, var22, Statics.field2146[4]);
                    } else if (var24) {
                        method1869(arg0, arg1, var21, var22, Statics.field2146[5]);
                    } else {
                        method1869(arg0, arg1, var21, var22, Statics.field2146[2]);
                    }
                }
            }
            if (field262 != 0 && field418 % 20 < 10) {
                if (field262 == 1 && field420 >= 0 && field420 < field498.length) {
                    class31 var27 = field498[field420];
                    if (var27 != null) {
                        int var28 = var27.field763 / 32 - Statics.field695.field763 / 32;
                        int var29 = var27.field735 / 32 - Statics.field695.field735 / 32;
                        method2953(arg0, arg1, var28, var29, Statics.field801[1]);
                    }
                }
                if (field262 == 2) {
                    int var30 = field265 * 4 - Statics.field1821 * 4 + 2 - Statics.field695.field763 / 32;
                    int var31 = field368 * 4 - Statics.field990 * 4 + 2 - Statics.field695.field735 / 32;
                    method2953(arg0, arg1, var30, var31, Statics.field801[1]);
                }
                if (field262 == 10 && field462 >= 0 && field462 < field365.length) {
                    class3 var32 = field365[field462];
                    if (var32 != null) {
                        int var33 = var32.field763 / 32 - Statics.field695.field763 / 32;
                        int var34 = var32.field735 / 32 - Statics.field695.field735 / 32;
                        method2953(arg0, arg1, var33, var34, Statics.field801[1]);
                    }
                }
            }
            if (field479 != 0) {
                int var35 = field479 * 4 + 2 - Statics.field695.field763 / 32;
                int var36 = field480 * 4 + 2 - Statics.field695.field735 / 32;
                method1869(arg0, arg1, var35, var36, Statics.field801[0]);
            }
            if (!Statics.field695.field52) {
                class74.method1513(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field482 < 3) {
            Statics.field251.method1445(arg0, arg1, 33, 33, 25, 25, field378, 256, Statics.field686, Statics.field2036);
        } else {
            class74.method1522(arg0, arg1, 0, Statics.field686, Statics.field2036);
        }
        if (field456[arg2]) {
            Statics.field842.method1565(arg0, arg1);
        }
        field381[arg2] = true;
    }

    @ObfuscatedName("fc.cu(IIIILbo;I)V")
    public static final void method2953(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1869(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field378 + field315 & 0x7FF;
        int var7 = class85.field1500[var6];
        int var8 = class85.field1501[var6];
        int var9 = var7 * 256 / (field317 + 256);
        int var10 = var8 * 256 / (field317 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field322.method1491(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cq.cx(IIIILbo;B)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field378 + field315 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1500[var5];
        int var8 = class85.field1501[var5];
        int var9 = var7 * 256 / (field317 + 256);
        int var10 = var8 * 256 / (field317 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1449(Statics.field842, arg0 + 94 + var11 - arg4.field1321 / 2 + 4, arg1 + 83 - var12 - arg4.field1324 / 2 - 4);
        } else {
            arg4.method1435(arg0 + 94 + var11 - arg4.field1321 / 2 + 4, arg1 + 83 - var12 - arg4.field1324 / 2 - 4);
        }
    }

    @ObfuscatedName("cr.cg(Ljava/lang/String;ZB)Z")
    public static boolean method1959(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method2168(arg0, Statics.field247);
        for (int var3 = 0; var3 < field500; var3++) {
            if (var2.equalsIgnoreCase(class212.method2168(field399[var3].field225, Statics.field247)) && (!arg1 || field399[var3].field220 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method2168(Statics.field695.field48, Statics.field247))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ed.cf(Ljava/lang/String;B)Z")
    public static boolean method2702(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method2168(arg0, Statics.field247);
        for (int var2 = 0; var2 < field467; var2++) {
            class8 var3 = field505[var2];
            if (var1.equalsIgnoreCase(class212.method2168(var3.field123, Statics.field247))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method2168(var3.field127, Statics.field247))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("m.co(Ljava/lang/String;I)V")
    public static final void method482(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method2168(arg0, Statics.field247);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field467; var2++) {
            class8 var3 = field505[var2];
            String var4 = var3.field123;
            String var5 = class212.method2168(var4, Statics.field247);
            if (class118.method35(arg0, var1, var4, var5)) {
                field467--;
                for (int var6 = var2; var6 < field467; var6++) {
                    field505[var6] = field505[var6 + 1];
                }
                field320 = field432;
                field454.method2357(6);
                field454.method2123(class108.method2832(arg0));
                field454.method2304(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cc.ct(Ljava/lang/String;I)V")
    public static final void method1770(String arg0) {
        if (!arg0.equals("")) {
            field454.method2357(134);
            field454.method2123(class108.method2832(arg0));
            field454.method2304(arg0);
        }
    }

    @ObfuscatedName("j.do(Ler;I)I")
    public static int method125(class155 arg0) {
        class182 var1 = (class182) field451.method3192(((long) arg0.field2549 << 32) + (long) arg0.field2550);
        return var1 == null ? arg0.field2641 : var1.field2881;
    }

    @ObfuscatedName("eo.ds(Ler;I)Ler;")
    public static class155 method2818(class155 arg0) {
        int var1 = class159.method1364(method125(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class155.method1383(arg0.field2560);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("db.de(Ler;B)Z")
    public static boolean method2400(class155 arg0) {
        if (field266) {
            if (method125(arg0) != 0) {
                return false;
            }
            if (arg0.field2551 == 0) {
                return false;
            }
        }
        return arg0.field2616;
    }

    @ObfuscatedName("a.dd(Ler;II)Ljava/lang/String;")
    public static String method83(class155 arg0, int arg1) {
        int var2 = method125(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2637 == null) {
            return null;
        } else if (arg0.field2665 == null || arg0.field2665.length <= arg1 || arg0.field2665[arg1] == null || arg0.field2665[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2665[arg1];
        }
    }

    @ObfuscatedName("dy.dq(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2512(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field423 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field423 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field423 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field423 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field423 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field321 + "/";
    }
}

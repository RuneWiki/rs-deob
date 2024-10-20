package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.k")
    public static boolean field278 = true;

    @ObfuscatedName("client.e")
    public static int field258 = 1;

    @ObfuscatedName("client.w")
    public static class198[] field316 = new class198[4];

    @ObfuscatedName("client.m")
    public static int field259 = 0;

    @ObfuscatedName("client.j")
    public static int field396 = 0;

    @ObfuscatedName("client.b")
    public static boolean field264 = false;

    @ObfuscatedName("client.r")
    public static boolean field265 = false;

    @ObfuscatedName("client.l")
    public static int field266 = 0;

    @ObfuscatedName("client.t")
    public static int field267 = 0;

    @ObfuscatedName("client.d")
    public static boolean field268 = true;

    @ObfuscatedName("client.z")
    public static int field269 = 0;

    @ObfuscatedName("client.n")
    public static long field270 = 1L;

    @ObfuscatedName("client.f")
    public static int field271 = -1;

    @ObfuscatedName("client.a")
    public static int field502 = -1;

    @ObfuscatedName("client.p")
    public static int field273 = -1;

    @ObfuscatedName("client.s")
    public static boolean field283 = true;

    @ObfuscatedName("client.c")
    public static boolean field440 = false;

    @ObfuscatedName("client.ar")
    public static int field276 = 0;

    @ObfuscatedName("client.ac")
    public static int field277 = 0;

    @ObfuscatedName("client.ah")
    public static int field496 = 0;

    @ObfuscatedName("client.ap")
    public static int field392 = 0;

    @ObfuscatedName("client.aj")
    public static int field280 = 0;

    @ObfuscatedName("client.as")
    public static int field477 = 0;

    @ObfuscatedName("client.aa")
    public static int field256 = 0;

    @ObfuscatedName("client.am")
    public static int field261 = 0;

    @ObfuscatedName("client.ae")
    public static int field455 = 0;

    @ObfuscatedName("client.ai")
    public static class107 field285 = new class107(new byte[5000]);

    @ObfuscatedName("client.au")
    public static class18 field286 = class18.field525;

    @ObfuscatedName("client.aw")
    public static int field287 = 0;

    @ObfuscatedName("client.aq")
    public static int field421 = 0;

    @ObfuscatedName("client.ak")
    public static int field356 = 0;

    @ObfuscatedName("client.bb")
    public static int field290 = 0;

    @ObfuscatedName("client.bi")
    public static int field291 = 0;

    @ObfuscatedName("client.bm")
    public static int field292 = 0;

    @ObfuscatedName("client.bo")
    public static int field293 = 0;

    @ObfuscatedName("client.bv")
    public static int field413 = 0;

    @ObfuscatedName("client.bp")
    public static class30[] field295 = new class30[32768];

    @ObfuscatedName("client.bs")
    public static int field369 = 0;

    @ObfuscatedName("client.bl")
    public static int[] field486 = new int[32768];

    @ObfuscatedName("client.co")
    public static class110 field298 = new class110(5000);

    @ObfuscatedName("client.cn")
    public static class110 field441 = new class110(5000);

    @ObfuscatedName("client.cl")
    public static class110 field300 = new class110(5000);

    @ObfuscatedName("client.ca")
    public static int field301 = 0;

    @ObfuscatedName("client.cd")
    public static int field302 = 0;

    @ObfuscatedName("client.cx")
    public static int field303 = 0;

    @ObfuscatedName("client.cg")
    public static int field492 = 0;

    @ObfuscatedName("client.cv")
    public static int field355 = 0;

    @ObfuscatedName("client.cy")
    public static int field306 = 0;

    @ObfuscatedName("client.cp")
    public static int field307 = 0;

    @ObfuscatedName("client.ck")
    public static int field422 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field348 = false;

    @ObfuscatedName("client.cu")
    public static int field310 = 0;

    @ObfuscatedName("client.cz")
    public static int field257 = 0;

    @ObfuscatedName("client.du")
    public static int field312 = 1;

    @ObfuscatedName("client.ds")
    public static int field313 = 0;

    @ObfuscatedName("client.dk")
    public static int field314 = 1;

    @ObfuscatedName("client.do")
    public static int field315 = 0;

    @ObfuscatedName("client.dy")
    public static boolean field365 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field318 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field319 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field320 = 0;

    @ObfuscatedName("client.df")
    public static int field342 = 2;

    @ObfuscatedName("client.dz")
    public static int field322 = 0;

    @ObfuscatedName("client.dl")
    public static int field323 = 2;

    @ObfuscatedName("client.dv")
    public static int field324 = 0;

    @ObfuscatedName("client.dg")
    public static int field325 = 1;

    @ObfuscatedName("client.dp")
    public static int field427 = 0;

    @ObfuscatedName("client.di")
    public static int field504 = 0;

    @ObfuscatedName("client.de")
    public static int field498 = 2;

    @ObfuscatedName("client.dw")
    public static int field488 = 0;

    @ObfuscatedName("client.ee")
    public static int field330 = 1;

    @ObfuscatedName("client.el")
    public static int field282 = 0;

    @ObfuscatedName("client.ef")
    public static int field294 = 0;

    @ObfuscatedName("client.es")
    public static int field333 = 2301979;

    @ObfuscatedName("client.eq")
    public static int field367 = 5063219;

    @ObfuscatedName("client.eg")
    public static int field335 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field336 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field337 = false;

    @ObfuscatedName("client.fj")
    public static int field431 = 0;

    @ObfuscatedName("client.fd")
    public static int field339 = 128;

    @ObfuscatedName("client.fq")
    public static int field503 = 0;

    @ObfuscatedName("client.fv")
    public static int field341 = 0;

    @ObfuscatedName("client.fm")
    public static int field513 = 0;

    @ObfuscatedName("client.fk")
    public static int field343 = 0;

    @ObfuscatedName("client.fs")
    public static int field344 = 0;

    @ObfuscatedName("client.fy")
    public static int field345 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field346 = false;

    @ObfuscatedName("client.fn")
    public static int field347 = 0;

    @ObfuscatedName("client.fe")
    public static int field456 = 0;

    @ObfuscatedName("client.fz")
    public static int field482 = 50;

    @ObfuscatedName("client.fl")
    public static int[] field350 = new int[field482];

    @ObfuscatedName("client.fo")
    public static int[] field351 = new int[field482];

    @ObfuscatedName("client.fx")
    public static int[] field352 = new int[field482];

    @ObfuscatedName("client.fb")
    public static int[] field353 = new int[field482];

    @ObfuscatedName("client.fr")
    public static int[] field340 = new int[field482];

    @ObfuscatedName("client.ff")
    public static int[] field326 = new int[field482];

    @ObfuscatedName("client.ft")
    public static int[] field510 = new int[field482];

    @ObfuscatedName("client.gy")
    public static String[] field357 = new String[field482];

    @ObfuscatedName("client.gt")
    public static int[][] field382 = new int[104][104];

    @ObfuscatedName("client.gm")
    public static int field423 = 0;

    @ObfuscatedName("client.gq")
    public static int field381 = -1;

    @ObfuscatedName("client.gf")
    public static int field361 = -1;

    @ObfuscatedName("client.gu")
    public static int field362 = 0;

    @ObfuscatedName("client.gb")
    public static int field363 = 0;

    @ObfuscatedName("client.gh")
    public static int field304 = 0;

    @ObfuscatedName("client.gk")
    public static int field376 = 0;

    @ObfuscatedName("client.gv")
    public static int field366 = 0;

    @ObfuscatedName("client.ge")
    public static int field467 = 0;

    @ObfuscatedName("client.gw")
    public static int field368 = 0;

    @ObfuscatedName("client.go")
    public static int field284 = 0;

    @ObfuscatedName("client.gx")
    public static int field452 = 0;

    @ObfuscatedName("client.gr")
    public static int field371 = 0;

    @ObfuscatedName("client.gi")
    public static boolean field470 = false;

    @ObfuscatedName("client.gz")
    public static int field373 = 0;

    @ObfuscatedName("client.gp")
    public static int field374 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field297 = new class3[2048];

    @ObfuscatedName("client.gc")
    public static int field419 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field377 = new int[2048];

    @ObfuscatedName("client.hc")
    public static int field378 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field379 = new int[2048];

    @ObfuscatedName("client.hp")
    public static class107[] field380 = new class107[2048];

    @ObfuscatedName("client.hz")
    public static int field444 = -1;

    @ObfuscatedName("client.ho")
    public static int field508 = 0;

    @ObfuscatedName("client.hj")
    public static int field383 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field327 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field385 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hg")
    public static String[] field386 = new String[8];

    @ObfuscatedName("client.hl")
    public static boolean[] field387 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field388 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hi")
    public static int field389 = -1;

    @ObfuscatedName("client.hb")
    public static class178[][][] field390 = new class178[4][104][104];

    @ObfuscatedName("client.hn")
    public static class178 field391 = new class178();

    @ObfuscatedName("client.he")
    public static class178 field296 = new class178();

    @ObfuscatedName("client.hr")
    public static class178 field443 = new class178();

    @ObfuscatedName("client.hu")
    public static int[] field394 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field395 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field516 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field397 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field334 = false;

    @ObfuscatedName("client.ii")
    public static int field399 = 0;

    @ObfuscatedName("client.is")
    public static int[] field400 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field401 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field308 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field403 = new int[500];

    @ObfuscatedName("client.iq")
    public static String[] field404 = new String[500];

    @ObfuscatedName("client.in")
    public static String[] field405 = new String[500];

    @ObfuscatedName("client.iu")
    public static int field406 = -1;

    @ObfuscatedName("client.im")
    public static int field407 = -1;

    @ObfuscatedName("client.ia")
    public static int field408 = 0;

    @ObfuscatedName("client.ip")
    public static int field409 = 50;

    @ObfuscatedName("client.ij")
    public static int field410 = 0;

    @ObfuscatedName("client.it")
    public static String field411 = null;

    @ObfuscatedName("client.ib")
    public static boolean field515 = false;

    @ObfuscatedName("client.ie")
    public static int field305 = -1;

    @ObfuscatedName("client.iv")
    public static int field321 = -1;

    @ObfuscatedName("client.jd")
    public static String field311 = null;

    @ObfuscatedName("client.js")
    public static String field416 = null;

    @ObfuscatedName("client.ja")
    public static int field417 = -1;

    @ObfuscatedName("client.jf")
    public static class175 field418 = new class175(8);

    @ObfuscatedName("client.jc")
    public static int field402 = 0;

    @ObfuscatedName("client.jr")
    public static int field420 = 0;

    @ObfuscatedName("client.jx")
    public static class153 field436 = null;

    @ObfuscatedName("client.jg")
    public static int field272 = 0;

    @ObfuscatedName("client.ju")
    public static int field299 = 0;

    @ObfuscatedName("client.jt")
    public static int field424 = 0;

    @ObfuscatedName("client.jy")
    public static int field425 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field426 = false;

    @ObfuscatedName("client.jb")
    public static boolean field398 = false;

    @ObfuscatedName("client.jv")
    public static boolean field428 = false;

    @ObfuscatedName("client.ji")
    public static class153 field429 = null;

    @ObfuscatedName("client.jj")
    public static class153 field364 = null;

    @ObfuscatedName("client.jm")
    public static int field331 = 0;

    @ObfuscatedName("client.jk")
    public static int field432 = 0;

    @ObfuscatedName("client.jn")
    public static class153 field433 = null;

    @ObfuscatedName("client.jp")
    public static boolean field434 = false;

    @ObfuscatedName("client.jw")
    public static int field435 = -1;

    @ObfuscatedName("client.jo")
    public static int field317 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field437 = false;

    @ObfuscatedName("client.jh")
    public static int field438 = -1;

    @ObfuscatedName("client.jl")
    public static int field439 = -1;

    @ObfuscatedName("client.kv")
    public static boolean field495 = false;

    @ObfuscatedName("client.kj")
    public static int field506 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field442 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field414 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field354 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field445 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field446 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field447 = 0;

    @ObfuscatedName("client.ki")
    public static int field448 = 0;

    @ObfuscatedName("client.ke")
    public static int field449 = 0;

    @ObfuscatedName("client.ku")
    public static int field450 = 0;

    @ObfuscatedName("client.ks")
    public static int field451 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field338 = new int[2000];

    @ObfuscatedName("client.kh")
    public static String[] field453 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field511 = 0;

    @ObfuscatedName("client.kc")
    public static class178 field262 = new class178();

    @ObfuscatedName("client.ka")
    public static class178 field359 = new class178();

    @ObfuscatedName("client.kd")
    public static class178 field393 = new class178();

    @ObfuscatedName("client.ky")
    public static class175 field458 = new class175(512);

    @ObfuscatedName("client.le")
    public static int field459 = 0;

    @ObfuscatedName("client.lc")
    public static int field460 = -2;

    @ObfuscatedName("client.lm")
    public static boolean[] field461 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field462 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field463 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static int[] field464 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field465 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field466 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field281 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field468 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field469 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lt")
    public static int field288 = 0;

    @ObfuscatedName("client.lz")
    public static int field471 = 0;

    @ObfuscatedName("client.lx")
    public static String field472 = "";

    @ObfuscatedName("client.lp")
    public static long[] field473 = new long[100];

    @ObfuscatedName("client.ls")
    public static int field474 = 0;

    @ObfuscatedName("client.lh")
    public static int field476 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field490 = new int[128];

    @ObfuscatedName("client.ly")
    public static int[] field478 = new int[128];

    @ObfuscatedName("client.lw")
    public static long field479 = -1L;

    @ObfuscatedName("client.lb")
    public static String field480 = null;

    @ObfuscatedName("client.la")
    public static String field481 = null;

    @ObfuscatedName("client.ma")
    public static int field493 = -1;

    @ObfuscatedName("client.mc")
    public static int field483 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field484 = new int[1000];

    @ObfuscatedName("client.mn")
    public static int[] field485 = new int[1000];

    @ObfuscatedName("client.mj")
    public static class72[] field309 = new class72[1000];

    @ObfuscatedName("client.ml")
    public static int field415 = 0;

    @ObfuscatedName("client.mz")
    public static int field430 = 0;

    @ObfuscatedName("client.ms")
    public static int field489 = 0;

    @ObfuscatedName("client.mo")
    public static int field328 = 255;

    @ObfuscatedName("client.mx")
    public static int field491 = -1;

    @ObfuscatedName("client.my")
    public static boolean field370 = false;

    @ObfuscatedName("client.mk")
    public static int field279 = 127;

    @ObfuscatedName("client.mf")
    public static int field494 = 127;

    @ObfuscatedName("client.nk")
    public static int field454 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field384 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field349 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field499 = new int[50];

    @ObfuscatedName("client.nh")
    public static class52[] field500 = new class52[50];

    @ObfuscatedName("client.nq")
    public static boolean field501 = false;

    @ObfuscatedName("client.nu")
    public static boolean[] field487 = new boolean[5];

    @ObfuscatedName("client.nz")
    public static int[] field372 = new int[5];

    @ObfuscatedName("client.nc")
    public static int[] field289 = new int[5];

    @ObfuscatedName("client.nt")
    public static int[] field263 = new int[5];

    @ObfuscatedName("client.ni")
    public static int[] field332 = new int[5];

    @ObfuscatedName("client.ox")
    public static int field507 = 0;

    @ObfuscatedName("client.oc")
    public static int field375 = 0;

    @ObfuscatedName("client.oy")
    public static class16[] field509 = new class16[400];

    @ObfuscatedName("client.oe")
    public static class174 field505 = new class174();

    @ObfuscatedName("client.ou")
    public static int field457 = 0;

    @ObfuscatedName("client.oj")
    public static class8[] field512 = new class8[400];

    @ObfuscatedName("client.ok")
    public static class158 field358 = new class158();

    @ObfuscatedName("client.ol")
    public static int field514 = -1;

    @ObfuscatedName("client.oq")
    public static int field412 = -1;

    @ObfuscatedName("client.k(B)V")
    public final void method171() {
    }

    public final void init() {
        if (!this.method2575()) {
            return;
        }
        class169[] var1 = new class169[] { class169.field2832, class169.field2835, class169.field2841, class169.field2834, class169.field2839, class169.field2840, class169.field2831, class169.field2836, class169.field2833, class169.field2838 };
        class169[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class169 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2837);
            if (var5 != null) {
                int var6;
                class139[] var8;
                int var9;
                switch(Integer.parseInt(var4.field2837)) {
                    case 1:
                        field258 = Integer.parseInt(var5);
                        continue;
                    case 2:
                        Statics.field2517 = var5;
                    case 3:
                    default:
                        continue;
                    case 4:
                        Statics.field329 = (class140) class99.method1947(class140.method116(), Integer.parseInt(var5));
                        if (Statics.field329 == class140.field2140) {
                            Statics.field274 = class191.field2903;
                        } else {
                            Statics.field274 = class191.field2905;
                        }
                        continue;
                    case 5:
                        field266 = Integer.parseInt(var5);
                        continue;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                            field264 = true;
                        } else {
                            field264 = false;
                        }
                        continue;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                        }
                        continue;
                    case 8:
                        field396 = Integer.parseInt(var5);
                        continue;
                    case 9:
                        field259 = Integer.parseInt(var5);
                        continue;
                    case 10:
                        var6 = Integer.parseInt(var5);
                        class139[] var7 = new class139[] { class139.field2126, class139.field2128, class139.field2127, class139.field2124 };
                        var8 = var7;
                        var9 = 0;
                }
                class139 var11;
                while (true) {
                    if (var9 >= var8.length) {
                        var11 = null;
                        break;
                    }
                    class139 var10 = var8[var9];
                    if (var10.field2129 == var6) {
                        var11 = var10;
                        break;
                    }
                    var9++;
                }
                Statics.field260 = var11;
            }
        }
        class79.field1378 = false;
        field265 = false;
        Statics.field1062 = this.getCodeBase().getHost();
        String var12 = Statics.field260.field2125;
        byte var13 = 0;
        try {
            Statics.field1814 = 16;
            Statics.field2780 = var13;
            try {
                Statics.field946 = System.getProperty("os.name");
            } catch (Exception var64) {
                Statics.field946 = "Unknown";
            }
            Statics.field2117 = Statics.field946.toLowerCase();
            try {
                Statics.field1583 = System.getProperty("user.home");
                if (Statics.field1583 != null) {
                    Statics.field1583 = Statics.field1583 + "/";
                }
            } catch (Exception var63) {
            }
            try {
                if (Statics.field2117.startsWith("win")) {
                    if (Statics.field1583 == null) {
                        Statics.field1583 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1583 == null) {
                    Statics.field1583 = System.getenv("HOME");
                }
                if (Statics.field1583 != null) {
                    Statics.field1583 = Statics.field1583 + "/";
                }
            } catch (Exception var62) {
            }
            if (Statics.field1583 == null) {
                Statics.field1583 = "~/";
            }
            Statics.field2034 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1583, "/tmp/", "" };
            Statics.field1457 = new String[] { ".jagex_cache_" + Statics.field2780, ".file_store_" + Statics.field2780 };
            int var17 = 0;
            label289: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field1886 = new File(Statics.field1583, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field1886.exists()) {
                    try {
                        class196 var22 = new class196(Statics.field1886, "rw", 10000L);
                        class107 var23 = new class107((int) var22.method3422());
                        while (var23.field1844 < var23.field1843.length) {
                            int var24 = var22.method3423(var23.field1843, var23.field1844, var23.field1843.length - var23.field1844);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field1844 += var24;
                        }
                        var23.field1844 = 0;
                        int var25 = var23.method2092();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2092();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2241();
                            if (var26 == 1) {
                                var20 = var23.method2241();
                            }
                        } else {
                            var19 = var23.method2174();
                            if (var26 == 1) {
                                var20 = var23.method2174();
                            }
                        }
                        var22.method3424();
                    } catch (IOException var67) {
                        var67.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class136.method449(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label264: for (int var30 = 0; var30 < Statics.field1457.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field2034.length; var31++) {
                            File var32 = new File(Statics.field2034[var31] + Statics.field1457[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class136.method449(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label264;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1583 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
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
                    } catch (Exception var66) {
                        var66.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class196 var44 = new class196(Statics.field1886, "rw", 10000L);
                        class107 var45 = new class107(500);
                        var45.method2079(3);
                        var45.method2079(var43 == null ? 0 : 1);
                        var45.method2085(var42.getPath());
                        if (var43 != null) {
                            var45.method2085(((File) var43).getPath());
                        }
                        var44.method3421(var45.field1843, 0, var45.field1844);
                        var44.method3424();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field60 = var47;
                if (!Statics.field60.exists()) {
                    Statics.field60.mkdirs();
                }
                File[] var48 = Statics.field60.listFiles();
                if (var48 == null) {
                    break;
                }
                File[] var49 = var48;
                int var50 = 0;
                while (true) {
                    if (var50 >= var49.length) {
                        break label289;
                    }
                    File var51 = var49[var50];
                    if (!class136.method449(var51, false)) {
                        var17++;
                        break;
                    }
                    var50++;
                }
            }
            class122.method1937(Statics.field60);
            try {
                File var52 = new File(Statics.field1583, "random.dat");
                if (var52.exists()) {
                    class136.field2093 = new class197(new class196(var52, "rw", 25L), 24, 0);
                } else {
                    label219: for (int var53 = 0; var53 < Statics.field1457.length; var53++) {
                        for (int var54 = 0; var54 < Statics.field2034.length; var54++) {
                            File var55 = new File(Statics.field2034[var54] + Statics.field1457[var53] + File.separatorChar + "random.dat");
                            if (var55.exists()) {
                                class136.field2093 = new class197(new class196(var55, "rw", 25L), 24, 0);
                                break label219;
                            }
                        }
                    }
                }
                if (class136.field2093 == null) {
                    RandomAccessFile var56 = new RandomAccessFile(var52, "rw");
                    int var57 = var56.read();
                    var56.seek(0L);
                    var56.write(var57);
                    var56.seek(0L);
                    var56.close();
                    class136.field2093 = new class197(new class196(var52, "rw", 25L), 24, 0);
                }
            } catch (IOException var65) {
            }
            class136.field2094 = new class197(new class196(class122.method1855("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2087 = new class197(new class196(class122.method1855("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1862 = new class197[Statics.field1814];
            for (int var59 = 0; var59 < Statics.field1814; var59++) {
                Statics.field1862[var59] = new class197(new class196(class122.method1855("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var68) {
            class135.method33((String) null, var68);
        }
        Statics.field275 = this;
        this.method2580(765, 503, 66);
    }

    @ObfuscatedName("client.w(B)V")
    public final void method173() {
        Statics.field2828 = field396 == 0 ? 43594 : field258 + 40000;
        Statics.field68 = field396 == 0 ? 443 : field258 + 50000;
        Statics.field1280 = Statics.field2828;
        Statics.field2694 = class154.field2679;
        Statics.field2696 = class154.field2676;
        Statics.field1829 = class154.field2674;
        Statics.field623 = class154.field2677;
        if (Statics.field1941.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1987[44] = 71;
            class124.field1987[45] = 26;
            class124.field1987[46] = 72;
            class124.field1987[47] = 73;
            class124.field1987[59] = 57;
            class124.field1987[61] = 27;
            class124.field1987[91] = 42;
            class124.field1987[92] = 74;
            class124.field1987[93] = 43;
            class124.field1987[192] = 28;
            class124.field1987[222] = 58;
            class124.field1987[520] = 59;
        } else {
            class124.field1987[186] = 57;
            class124.field1987[187] = 27;
            class124.field1987[188] = 71;
            class124.field1987[189] = 26;
            class124.field1987[190] = 72;
            class124.field1987[191] = 73;
            class124.field1987[192] = 58;
            class124.field1987[219] = 42;
            class124.field1987[220] = 74;
            class124.field1987[221] = 43;
            class124.field1987[222] = 59;
            class124.field1987[223] = 28;
        }
        Canvas var1 = Statics.field1255;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1976);
        var1.addFocusListener(class124.field1976);
        Canvas var2 = Statics.field1255;
        var2.addMouseListener(class127.field2006);
        var2.addMouseMotionListener(class127.field2006);
        var2.addFocusListener(class127.field2006);
        Statics.field2030 = class118.method850();
        if (Statics.field2030 != null) {
            Statics.field2030.method2421(Statics.field1255);
        }
        Statics.field2050 = new class121(255, class136.field2094, class136.field2087, 500000);
        Statics.field1459 = Statics.method2044();
        Statics.field188 = this.getToolkit().getSystemClipboard();
        String var4 = Statics.field1880;
        class125.field1996 = this;
        class125.field1994 = var4;
        if (field396 != 0) {
            field440 = true;
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method174() {
        field269++;
        this.method177();
        class150.method480();
        class162.method2651();
        method752();
        class124.method517();
        class127.method1836();
        if (Statics.field2030 != null) {
            int var1 = Statics.field2030.method2424();
            field511 = var1;
        }
        if (field267 == 0) {
            method583();
            class131.method155();
        } else if (field267 == 5) {
            class28.method2495(this);
            method583();
            class131.method155();
        } else if (field267 == 10 || field267 == 11) {
            class28.method2495(this);
        } else if (field267 == 20) {
            class28.method2495(this);
            method134();
        } else if (field267 == 25) {
            method459(false);
            field257 = 0;
            boolean var2 = true;
            for (int var3 = 0; var3 < Statics.field232.length; var3++) {
                if (Statics.field136[var3] != -1 && Statics.field232[var3] == null) {
                    Statics.field232[var3] = Statics.field1056.method2734(Statics.field136[var3], 0);
                    if (Statics.field232[var3] == null) {
                        var2 = false;
                        field257++;
                    }
                }
                if (Statics.field635[var3] != -1 && Statics.field706[var3] == null) {
                    Statics.field706[var3] = Statics.field1056.method2685(Statics.field635[var3], 0, Statics.field192[var3]);
                    if (Statics.field706[var3] == null) {
                        var2 = false;
                        field257++;
                    }
                }
            }
            if (var2) {
                field313 = 0;
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field232.length; var5++) {
                    byte[] var6 = Statics.field706[var5];
                    if (var6 != null) {
                        int var7 = (Statics.field957[var5] >> 8) * 64 - Statics.field1870;
                        int var8 = (Statics.field957[var5] & 0xFF) * 64 - Statics.field47;
                        if (field365) {
                            var7 = 10;
                            var8 = 10;
                        }
                        var4 &= Statics.method30(var6, var7, var8);
                    }
                }
                if (var4) {
                    if (field315 != 0) {
                        method2329(class143.field2179 + class2.field21 + class2.field18 + 100 + "%" + class2.field19, true);
                    }
                    method752();
                    method2413();
                    method752();
                    Statics.field2085.method1575();
                    method752();
                    System.gc();
                    for (int var9 = 0; var9 < 4; var9++) {
                        field316[var9].method3465();
                    }
                    for (int var10 = 0; var10 < 4; var10++) {
                        for (int var11 = 0; var11 < 104; var11++) {
                            for (int var12 = 0; var12 < 104; var12++) {
                                class6.field76[var10][var11][var12] = 0;
                            }
                        }
                    }
                    method752();
                    class6.method2665();
                    int var13 = Statics.field232.length;
                    class20.method1739();
                    method459(true);
                    if (!field365) {
                        int var14 = 0;
                        label1421: while (true) {
                            if (var14 >= var13) {
                                for (int var28 = 0; var28 < var13; var28++) {
                                    int var29 = (Statics.field957[var28] >> 8) * 64 - Statics.field1870;
                                    int var30 = (Statics.field957[var28] & 0xFF) * 64 - Statics.field47;
                                    byte[] var31 = Statics.field232[var28];
                                    if (var31 == null && Statics.field526 < 800) {
                                        method752();
                                        class6.method755(var29, var30, 64, 64);
                                    }
                                }
                                method459(true);
                                int var32 = 0;
                                while (true) {
                                    if (var32 >= var13) {
                                        break label1421;
                                    }
                                    byte[] var33 = Statics.field706[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field957[var32] >> 8) * 64 - Statics.field1870;
                                        int var35 = (Statics.field957[var32] & 0xFF) * 64 - Statics.field47;
                                        method752();
                                        class6.method621(var33, var34, var35, Statics.field2085, field316);
                                    }
                                    var32++;
                                }
                            }
                            int var15 = (Statics.field957[var14] >> 8) * 64 - Statics.field1870;
                            int var16 = (Statics.field957[var14] & 0xFF) * 64 - Statics.field47;
                            byte[] var17 = Statics.field232[var14];
                            if (var17 != null) {
                                method752();
                                int var18 = Statics.field709 * 8 - 48;
                                int var19 = Statics.field526 * 8 - 48;
                                class198[] var20 = field316;
                                int var21 = 0;
                                label1418: while (true) {
                                    if (var21 >= 4) {
                                        class107 var24 = new class107(var17);
                                        int var25 = 0;
                                        while (true) {
                                            if (var25 >= 4) {
                                                break label1418;
                                            }
                                            for (int var26 = 0; var26 < 64; var26++) {
                                                for (int var27 = 0; var27 < 64; var27++) {
                                                    class6.method2414(var24, var25, var15 + var26, var16 + var27, var18, var19, 0);
                                                }
                                            }
                                            var25++;
                                        }
                                    }
                                    for (int var22 = 0; var22 < 64; var22++) {
                                        for (int var23 = 0; var23 < 64; var23++) {
                                            if (var15 + var22 > 0 && var15 + var22 < 103 && var16 + var23 > 0 && var16 + var23 < 103) {
                                                var20[var21].field2965[var15 + var22][var16 + var23] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var21++;
                                }
                            }
                            var14++;
                        }
                    }
                    if (field365) {
                        int var36 = 0;
                        label1367: while (true) {
                            if (var36 >= 4) {
                                for (int var59 = 0; var59 < 13; var59++) {
                                    for (int var60 = 0; var60 < 13; var60++) {
                                        int var61 = field318[0][var59][var60];
                                        if (var61 == -1) {
                                            class6.method755(var59 * 8, var60 * 8, 8, 8);
                                        }
                                    }
                                }
                                method459(true);
                                int var62 = 0;
                                while (true) {
                                    if (var62 >= 4) {
                                        break label1367;
                                    }
                                    method752();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            int var65 = field318[var62][var63][var64];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field957.length; var71++) {
                                                    if (Statics.field957[var71] == var70 && Statics.field706[var71] != null) {
                                                        class6.method167(Statics.field706[var71], var62, var63 * 8, var64 * 8, var66, (var68 & 0x7) * 8, (var69 & 0x7) * 8, var67, Statics.field2085, field316);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method752();
                            for (int var37 = 0; var37 < 13; var37++) {
                                for (int var38 = 0; var38 < 13; var38++) {
                                    boolean var39 = false;
                                    int var40 = field318[var36][var37][var38];
                                    if (var40 != -1) {
                                        int var41 = var40 >> 24 & 0x3;
                                        int var42 = var40 >> 1 & 0x3;
                                        int var43 = var40 >> 14 & 0x3FF;
                                        int var44 = var40 >> 3 & 0x7FF;
                                        int var45 = (var43 / 8 << 8) + var44 / 8;
                                        for (int var46 = 0; var46 < Statics.field957.length; var46++) {
                                            if (Statics.field957[var46] == var45 && Statics.field232[var46] != null) {
                                                byte[] var47 = Statics.field232[var46];
                                                int var48 = var37 * 8;
                                                int var49 = var38 * 8;
                                                int var50 = (var43 & 0x7) * 8;
                                                int var51 = (var44 & 0x7) * 8;
                                                class198[] var52 = field316;
                                                for (int var53 = 0; var53 < 8; var53++) {
                                                    for (int var54 = 0; var54 < 8; var54++) {
                                                        if (var48 + var53 > 0 && var48 + var53 < 103 && var49 + var54 > 0 && var49 + var54 < 103) {
                                                            var52[var36].field2965[var48 + var53][var49 + var54] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var55 = new class107(var47);
                                                for (int var56 = 0; var56 < 4; var56++) {
                                                    for (int var57 = 0; var57 < 64; var57++) {
                                                        for (int var58 = 0; var58 < 64; var58++) {
                                                            if (var41 == var56 && var57 >= var50 && var57 < var50 + 8 && var58 >= var51 && var58 < var51 + 8) {
                                                                class6.method2414(var55, var36, var48 + class156.method505(var57 & 0x7, var58 & 0x7, var42), var49 + class156.method160(var57 & 0x7, var58 & 0x7, var42), 0, 0, var42);
                                                            } else {
                                                                class6.method2414(var55, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var39 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var39) {
                                        class6.method502(var36, var37 * 8, var38 * 8);
                                    }
                                }
                            }
                            var36++;
                        }
                    }
                    method459(true);
                    method2413();
                    method752();
                    class6.method819(Statics.field2085, field316);
                    method459(true);
                    int var72 = class6.field75;
                    if (var72 > Statics.field1) {
                        var72 = Statics.field1;
                    }
                    if (var72 < Statics.field1 - 1) {
                        int var73 = Statics.field1 - 1;
                    }
                    if (field265) {
                        Statics.field2085.method1679(class6.field75);
                    } else {
                        Statics.field2085.method1679(0);
                    }
                    for (int var74 = 0; var74 < 104; var74++) {
                        for (int var75 = 0; var75 < 104; var75++) {
                            method506(var74, var75);
                        }
                    }
                    method752();
                    for (class15 var76 = (class15) field391.method3200(); var76 != null; var76 = (class15) field391.method3209()) {
                        if (var76.field225 == -1) {
                            var76.field226 = 0;
                            method2946(var76);
                        } else {
                            var76.method3304();
                        }
                    }
                    class36.field894.method3138();
                    if (Statics.field1900 != null) {
                        field298.method2335(84);
                        field298.method2247(1057001181);
                    }
                    if (!field365) {
                        int var77 = (Statics.field709 - 6) / 8;
                        int var78 = (Statics.field709 + 6) / 8;
                        int var79 = (Statics.field526 - 6) / 8;
                        int var80 = (Statics.field526 + 6) / 8;
                        for (int var81 = var77 - 1; var81 <= var78 + 1; var81++) {
                            for (int var82 = var79 - 1; var82 <= var80 + 1; var82++) {
                                if (var81 < var77 || var81 > var78 || var82 < var79 || var82 > var80) {
                                    Statics.field1056.method2703("m" + var81 + "_" + var82);
                                    Statics.field1056.method2703("l" + var81 + "_" + var82);
                                }
                            }
                        }
                    }
                    method2382(30);
                    method752();
                    class6.method148();
                    field298.method2335(70);
                    class131.method155();
                } else {
                    field315 = 2;
                }
            } else {
                field315 = 1;
            }
        }
        if (field267 == 30) {
            if (field276 > 1) {
                field276--;
            }
            if (field355 > 0) {
                field355--;
            }
            if (field348) {
                field348 = false;
                if (field355 > 0) {
                    method106();
                } else {
                    method2382(40);
                    Statics.field1858 = Statics.field2147;
                    Statics.field2147 = null;
                }
            } else {
                if (!field334) {
                    field404[0] = class143.field2406;
                    field405[0] = "";
                    field308[0] = 1006;
                    field399 = 1;
                }
                for (int var83 = 0; var83 < 100 && method545(); var83++) {
                }
                if (field267 == 30) {
                    while (true) {
                        class189 var84 = (class189) class190.field2896.method3243();
                        boolean var85;
                        if (var84 == null) {
                            var85 = false;
                        } else {
                            var85 = true;
                        }
                        if (!var85) {
                            Object var87 = Statics.field546.field186;
                            synchronized (Statics.field546.field186) {
                                if (!field278) {
                                    Statics.field546.field183 = 0;
                                } else if (class127.field2018 != 0 || Statics.field546.field183 >= 40) {
                                    field298.method2335(52);
                                    field298.method2079(0);
                                    int var88 = field298.field1844;
                                    int var89 = 0;
                                    for (int var90 = 0; var90 < Statics.field546.field183 && field298.field1844 - var88 < 240; var90++) {
                                        var89++;
                                        int var91 = Statics.field546.field185[var90];
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 502) {
                                            var91 = 502;
                                        }
                                        int var92 = Statics.field546.field189[var90];
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 764) {
                                            var92 = 764;
                                        }
                                        int var93 = var91 * 765 + var92;
                                        if (Statics.field546.field185[var90] == -1 && Statics.field546.field189[var90] == -1) {
                                            var92 = -1;
                                            var91 = -1;
                                            var93 = 524287;
                                        }
                                        if (field271 != var92 || field502 != var91) {
                                            int var94 = var92 - field271;
                                            field271 = var92;
                                            int var95 = var91 - field502;
                                            field502 = var91;
                                            if (field273 < 8 && var94 >= -32 && var94 <= 31 && var95 >= -32 && var95 <= 31) {
                                                var94 += 32;
                                                var95 += 32;
                                                field298.method2100((field273 << 12) + (var94 << 6) + var95);
                                                field273 = 0;
                                            } else if (field273 < 8) {
                                                field298.method2080((field273 << 19) + 8388608 + var93);
                                                field273 = 0;
                                            } else {
                                                field298.method2247((field273 << 19) + -1073741824 + var93);
                                                field273 = 0;
                                            }
                                        } else if (field273 < 2047) {
                                            field273++;
                                        }
                                    }
                                    field298.method2089(field298.field1844 - var88);
                                    if (var89 >= Statics.field546.field183) {
                                        Statics.field546.field183 = 0;
                                    } else {
                                        Statics.field546.field183 -= var89;
                                        for (int var96 = 0; var96 < Statics.field546.field183; var96++) {
                                            Statics.field546.field189[var96] = Statics.field546.field189[var89 + var96];
                                            Statics.field546.field185[var96] = Statics.field546.field185[var89 + var96];
                                        }
                                    }
                                }
                            }
                            if (class127.field2018 == 1 || !Statics.field235 && class127.field2018 == 4 || class127.field2018 == 2) {
                                long var98 = (class127.field2021 - field270 * -1L) / 50L;
                                if (var98 > 4095L) {
                                    var98 = 4095L;
                                }
                                field270 = class127.field2021 * -1L;
                                int var100 = class127.field2020;
                                if (var100 < 0) {
                                    var100 = 0;
                                } else if (var100 > 502) {
                                    var100 = 502;
                                }
                                int var101 = class127.field2017;
                                if (var101 < 0) {
                                    var101 = 0;
                                } else if (var101 > 764) {
                                    var101 = 764;
                                }
                                int var102 = var100 * 765 + var101;
                                byte var103 = 0;
                                if (class127.field2018 == 2) {
                                    var103 = 1;
                                }
                                int var104 = (int) var98;
                                field298.method2335(180);
                                field298.method2247((var103 << 19) + (var104 << 20) + var102);
                            }
                            if (class124.field1982 > 0) {
                                field298.method2335(162);
                                field298.method2100(0);
                                int var105 = field298.field1844;
                                long var106 = class103.method98();
                                for (int var108 = 0; var108 < class124.field1982; var108++) {
                                    long var109 = var106 - field479;
                                    if (var109 > 16777215L) {
                                        var109 = 16777215L;
                                    }
                                    field479 = var106;
                                    field298.method2079(class124.field1981[var108]);
                                    field298.method2128((int) var109);
                                }
                                field298.method2088(field298.field1844 - var105);
                            }
                            if (field345 > 0) {
                                field345--;
                            }
                            if (class124.field1975[96] || class124.field1975[97] || class124.field1975[98] || class124.field1975[99]) {
                                field346 = true;
                            }
                            if (field346 && field345 <= 0) {
                                field345 = 20;
                                field346 = false;
                                field298.method2335(81);
                                field298.method2101(field503);
                                field298.method2120(field339);
                            }
                            if (Statics.field622 && !field283) {
                                field283 = true;
                                field298.method2335(163);
                                field298.method2079(1);
                            }
                            if (!Statics.field622 && field283) {
                                field283 = false;
                                field298.method2335(163);
                                field298.method2079(0);
                            }
                            if (field265 && Statics.field1 != field310) {
                                method26(Statics.field709, Statics.field526, Statics.field1, Statics.field1767.field783[0], Statics.field1767.field793[0]);
                            } else if (Statics.field1 != field493) {
                                field493 = Statics.field1;
                                Statics.method27(Statics.field1);
                            }
                            if (field267 == 30) {
                                method135();
                                int var10002;
                                for (int var111 = 0; var111 < field454; var111++) {
                                    var10002 = field349[var111]--;
                                    if (field349[var111] >= -10) {
                                        class52 var113 = field500[var111];
                                        if (var113 == null) {
                                            class52 var10000 = (class52) null;
                                            var113 = class52.method1034(Statics.field2130, field384[var111], 0);
                                            if (var113 == null) {
                                                continue;
                                            }
                                            field349[var111] += var113.method1029();
                                            field500[var111] = var113;
                                        }
                                        if (field349[var111] < 0) {
                                            int var120;
                                            if (field499[var111] == 0) {
                                                var120 = field279;
                                            } else {
                                                int var114 = (field499[var111] & 0xFF) * 128;
                                                int var115 = field499[var111] >> 16 & 0xFF;
                                                int var116 = var115 * 128 + 64 - Statics.field1767.field780;
                                                if (var116 < 0) {
                                                    var116 = -var116;
                                                }
                                                int var117 = field499[var111] >> 8 & 0xFF;
                                                int var118 = var117 * 128 + 64 - Statics.field1767.field761;
                                                if (var118 < 0) {
                                                    var118 = -var118;
                                                }
                                                int var119 = var116 + var118 - 128;
                                                if (var119 > var114) {
                                                    field349[var111] = -100;
                                                    continue;
                                                }
                                                if (var119 < 0) {
                                                    var119 = 0;
                                                }
                                                var120 = field494 * (var114 - var119) / var114;
                                            }
                                            if (var120 > 0) {
                                                class56 var121 = var113.method1028().method1055(Statics.field158);
                                                class58 var122 = class58.method1078(var121, 100, var120);
                                                var122.method1153(field497[var111] - 1);
                                                Statics.field708.method940(var122);
                                            }
                                            field349[var111] = -100;
                                        }
                                    } else {
                                        field454--;
                                        for (int var112 = var111; var112 < field454; var112++) {
                                            field384[var112] = field384[var112 + 1];
                                            field500[var112] = field500[var112 + 1];
                                            field497[var112] = field497[var112 + 1];
                                            field349[var112] = field349[var112 + 1];
                                            field499[var112] = field499[var112 + 1];
                                        }
                                        var111--;
                                    }
                                }
                                if (field370 && !class162.method2861()) {
                                    if (field328 != 0 && field491 != -1) {
                                        class162.method1832(Statics.field1684, field491, 0, field328, false);
                                    }
                                    field370 = false;
                                }
                                field303++;
                                if (field303 <= 750) {
                                    method489();
                                    for (int var123 = 0; var123 < field369; var123++) {
                                        int var124 = field486[var123];
                                        class30 var125 = field295[var124];
                                        if (var125 != null) {
                                            method550(var125, var125.field705.field831);
                                        }
                                    }
                                    method2383();
                                    field294++;
                                    if (field376 != 0) {
                                        field304 += 20;
                                        if (field304 >= 400) {
                                            field376 = 0;
                                        }
                                    }
                                    if (Statics.field1273 != null) {
                                        field366++;
                                        if (field366 >= 15) {
                                            method1830(Statics.field1273);
                                            Statics.field1273 = null;
                                        }
                                    }
                                    class153 var126 = Statics.field533;
                                    class153 var127 = Statics.field65;
                                    Statics.field533 = null;
                                    Statics.field65 = null;
                                    field433 = null;
                                    field437 = false;
                                    field434 = false;
                                    field476 = 0;
                                    while (true) {
                                        while (class124.method3() && field476 < 128) {
                                            if (field424 >= 2 && class124.field1975[82] && Statics.field1935 == 66) {
                                                String var128 = class10.method753();
                                                Statics.field188.setContents(new StringSelection(var128), (ClipboardOwner) null);
                                            } else {
                                                field478[field476] = Statics.field1935;
                                                field490[field476] = Statics.field1808;
                                                field476++;
                                            }
                                        }
                                        int var129 = field417;
                                        if (class153.method2498(var129)) {
                                            method892(Statics.field2556[var129], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field506++;
                                        while (true) {
                                            class1 var130;
                                            class153 var131;
                                            class153 var132;
                                            do {
                                                var130 = (class1) field359.method3219();
                                                if (var130 == null) {
                                                    while (true) {
                                                        class1 var133;
                                                        class153 var134;
                                                        class153 var135;
                                                        do {
                                                            var133 = (class1) field393.method3219();
                                                            if (var133 == null) {
                                                                while (true) {
                                                                    class1 var136;
                                                                    class153 var137;
                                                                    class153 var138;
                                                                    do {
                                                                        var136 = (class1) field262.method3219();
                                                                        if (var136 == null) {
                                                                            boolean var139 = false;
                                                                            while (!var139) {
                                                                                var139 = true;
                                                                                for (int var140 = 0; var140 < field399 - 1; var140++) {
                                                                                    if (field308[var140] < 1000 && field308[var140 + 1] > 1000) {
                                                                                        String var141 = field405[var140];
                                                                                        field405[var140] = field405[var140 + 1];
                                                                                        field405[var140 + 1] = var141;
                                                                                        String var142 = field404[var140];
                                                                                        field404[var140] = field404[var140 + 1];
                                                                                        field404[var140 + 1] = var142;
                                                                                        int var143 = field308[var140];
                                                                                        field308[var140] = field308[var140 + 1];
                                                                                        field308[var140 + 1] = var143;
                                                                                        int var144 = field400[var140];
                                                                                        field400[var140] = field400[var140 + 1];
                                                                                        field400[var140 + 1] = var144;
                                                                                        int var145 = field401[var140];
                                                                                        field401[var140] = field401[var140 + 1];
                                                                                        field401[var140 + 1] = var145;
                                                                                        int var146 = field403[var140];
                                                                                        field403[var140] = field403[var140 + 1];
                                                                                        field403[var140 + 1] = var146;
                                                                                        var139 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field1668 == null && field429 == null) {
                                                                                int var147 = class127.field2018;
                                                                                if (field334) {
                                                                                    if (var147 != 1 && (Statics.field235 || var147 != 4)) {
                                                                                        int var148 = class127.field2008;
                                                                                        int var149 = class127.field2013;
                                                                                        if (var148 < Statics.field557 - 10 || var148 > Statics.field557 + Statics.field2767 + 10 || var149 < Statics.field1275 - 10 || var149 > Statics.field600 + Statics.field1275 + 10) {
                                                                                            field334 = false;
                                                                                            method1737(Statics.field557, Statics.field1275, Statics.field2767, Statics.field600);
                                                                                        }
                                                                                    }
                                                                                    if (var147 == 1 || !Statics.field235 && var147 == 4) {
                                                                                        int var150 = Statics.field557;
                                                                                        int var151 = Statics.field1275;
                                                                                        int var152 = Statics.field2767;
                                                                                        int var153 = class127.field2017;
                                                                                        int var154 = class127.field2020;
                                                                                        int var155 = -1;
                                                                                        for (int var156 = 0; var156 < field399; var156++) {
                                                                                            int var157 = (field399 - 1 - var156) * 15 + var151 + 31;
                                                                                            if (var153 > var150 && var153 < var150 + var152 && var154 > var157 - 13 && var154 < var157 + 3) {
                                                                                                var155 = var156;
                                                                                            }
                                                                                        }
                                                                                        if (var155 != -1 && var155 >= 0) {
                                                                                            int var158 = field400[var155];
                                                                                            int var159 = field401[var155];
                                                                                            int var160 = field308[var155];
                                                                                            int var161 = field403[var155];
                                                                                            String var162 = field404[var155];
                                                                                            String var163 = field405[var155];
                                                                                            method456(var158, var159, var160, var161, var162, var163, class127.field2017, class127.field2020);
                                                                                        }
                                                                                        field334 = false;
                                                                                        method1737(Statics.field557, Statics.field1275, Statics.field2767, Statics.field600);
                                                                                    }
                                                                                } else {
                                                                                    label1625: {
                                                                                        if ((var147 == 1 || !Statics.field235 && var147 == 4) && field399 > 0) {
                                                                                            int var164 = field308[field399 - 1];
                                                                                            if (var164 == 39 || var164 == 40 || var164 == 41 || var164 == 42 || var164 == 43 || var164 == 33 || var164 == 34 || var164 == 35 || var164 == 36 || var164 == 37 || var164 == 38 || var164 == 1005) {
                                                                                                int var165 = field400[field399 - 1];
                                                                                                int var166 = field401[field399 - 1];
                                                                                                class153 var167 = class153.method1565(var166);
                                                                                                if (class157.method582(method1833(var167)) || class157.method461(method1833(var167))) {
                                                                                                    if (Statics.field1668 != null && !field470 && field397 != 1 && !method128(field399 - 1) && field399 > 0) {
                                                                                                        method2815(field284, field452);
                                                                                                    }
                                                                                                    field470 = false;
                                                                                                    field373 = 0;
                                                                                                    if (Statics.field1668 != null) {
                                                                                                        method1830(Statics.field1668);
                                                                                                    }
                                                                                                    Statics.field1668 = class153.method1565(var166);
                                                                                                    field368 = var165;
                                                                                                    field284 = class127.field2017;
                                                                                                    field452 = class127.field2020;
                                                                                                    if (field399 > 0) {
                                                                                                        int var168 = field399 - 1;
                                                                                                        Statics.field187 = new class27();
                                                                                                        Statics.field187.field645 = field400[var168];
                                                                                                        Statics.field187.field653 = field401[var168];
                                                                                                        Statics.field187.field646 = field308[var168];
                                                                                                        Statics.field187.field644 = field403[var168];
                                                                                                        Statics.field187.field647 = field404[var168];
                                                                                                    }
                                                                                                    method1830(Statics.field1668);
                                                                                                    break label1625;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var147 == 1 || !Statics.field235 && var147 == 4) && (field397 == 1 && field399 > 2 || method128(field399 - 1))) {
                                                                                            var147 = 2;
                                                                                        }
                                                                                        if ((var147 == 1 || !Statics.field235 && var147 == 4) && field399 > 0) {
                                                                                            int var169 = field399 - 1;
                                                                                            if (var169 >= 0) {
                                                                                                int var170 = field400[var169];
                                                                                                int var171 = field401[var169];
                                                                                                int var172 = field308[var169];
                                                                                                int var173 = field403[var169];
                                                                                                String var174 = field404[var169];
                                                                                                String var175 = field405[var169];
                                                                                                method456(var170, var171, var172, var173, var174, var175, class127.field2017, class127.field2020);
                                                                                            }
                                                                                        }
                                                                                        if (var147 == 2 && field399 > 0) {
                                                                                            method527(class127.field2017, class127.field2020);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field429 != null) {
                                                                                method1830(field429);
                                                                                Statics.field171++;
                                                                                if (field437 && field434) {
                                                                                    int var176 = class127.field2008;
                                                                                    int var177 = class127.field2013;
                                                                                    int var178 = var176 - field331;
                                                                                    int var179 = var177 - field432;
                                                                                    if (var178 < field435) {
                                                                                        var178 = field435;
                                                                                    }
                                                                                    if (field429.field2565 + var178 > field435 + field364.field2565) {
                                                                                        var178 = field435 + field364.field2565 - field429.field2565;
                                                                                    }
                                                                                    if (var179 < field317) {
                                                                                        var179 = field317;
                                                                                    }
                                                                                    if (field429.field2603 + var179 > field317 + field364.field2603) {
                                                                                        var179 = field317 + field364.field2603 - field429.field2603;
                                                                                    }
                                                                                    int var180 = var178 - field438;
                                                                                    int var181 = var179 - field439;
                                                                                    int var182 = field429.field2619;
                                                                                    if (Statics.field171 > field429.field2586 && (var180 > var182 || var180 < -var182 || var181 > var182 || var181 < -var182)) {
                                                                                        field495 = true;
                                                                                    }
                                                                                    int var183 = field364.field2569 + (var178 - field435);
                                                                                    int var184 = field364.field2659 + (var179 - field317);
                                                                                    if (field429.field2632 != null && field495) {
                                                                                        class1 var185 = new class1();
                                                                                        var185.field3 = field429;
                                                                                        var185.field4 = var183;
                                                                                        var185.field14 = var184;
                                                                                        var185.field5 = field429.field2632;
                                                                                        class32.method44(var185);
                                                                                    }
                                                                                    if (class127.field2009 == 0) {
                                                                                        if (field495) {
                                                                                            if (field429.field2633 != null) {
                                                                                                class1 var186 = new class1();
                                                                                                var186.field3 = field429;
                                                                                                var186.field4 = var183;
                                                                                                var186.field14 = var184;
                                                                                                var186.field2 = field433;
                                                                                                var186.field5 = field429.field2633;
                                                                                                class32.method44(var186);
                                                                                            }
                                                                                            if (field433 != null && method111(field429) != null) {
                                                                                                field298.method2335(40);
                                                                                                field298.method2130(field429.field2583);
                                                                                                field298.method2100(field429.field2660);
                                                                                                field298.method2120(field433.field2660);
                                                                                                field298.method2247(field433.field2583);
                                                                                                field298.method2137(field429.field2557);
                                                                                                field298.method2120(field433.field2557);
                                                                                            }
                                                                                        } else if ((field397 == 1 || method128(field399 - 1)) && field399 > 2) {
                                                                                            method527(field438 + field331, field439 + field432);
                                                                                        } else if (field399 > 0) {
                                                                                            method2815(field438 + field331, field439 + field432);
                                                                                        }
                                                                                        field429 = null;
                                                                                    }
                                                                                } else if (Statics.field171 > 1) {
                                                                                    field429 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field1668 != null) {
                                                                                method1830(Statics.field1668);
                                                                                field373++;
                                                                                if (class127.field2009 == 0) {
                                                                                    if (field470) {
                                                                                        if (Statics.field718 == Statics.field1668 && field371 != field368) {
                                                                                            class153 var187 = Statics.field1668;
                                                                                            byte var188 = 0;
                                                                                            if (field420 == 1 && var187.field2560 == 206) {
                                                                                                var188 = 1;
                                                                                            }
                                                                                            if (var187.field2658[field371] <= 0) {
                                                                                                var188 = 0;
                                                                                            }
                                                                                            if (class157.method461(method1833(var187))) {
                                                                                                int var189 = field368;
                                                                                                int var190 = field371;
                                                                                                var187.field2658[var190] = var187.field2658[var189];
                                                                                                var187.field2596[var190] = var187.field2596[var189];
                                                                                                var187.field2658[var189] = -1;
                                                                                                var187.field2596[var189] = 0;
                                                                                            } else if (var188 == 1) {
                                                                                                int var191 = field368;
                                                                                                int var192 = field371;
                                                                                                while (var191 != var192) {
                                                                                                    if (var191 > var192) {
                                                                                                        var187.method2816(var191 - 1, var191);
                                                                                                        var191--;
                                                                                                    } else if (var191 < var192) {
                                                                                                        var187.method2816(var191 + 1, var191);
                                                                                                        var191++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var187.method2816(field371, field368);
                                                                                            }
                                                                                            field298.method2335(173);
                                                                                            field298.method2120(field371);
                                                                                            field298.method2101(field368);
                                                                                            field298.method2114(var188);
                                                                                            field298.method2244(Statics.field1668.field2583);
                                                                                        }
                                                                                    } else if ((field397 == 1 || method128(field399 - 1)) && field399 > 2) {
                                                                                        method527(field284, field452);
                                                                                    } else if (field399 > 0) {
                                                                                        method2815(field284, field452);
                                                                                    }
                                                                                    field366 = 10;
                                                                                    class127.field2018 = 0;
                                                                                    Statics.field1668 = null;
                                                                                } else if (field373 >= 5 && (class127.field2008 > field284 + 5 || class127.field2008 < field284 - 5 || class127.field2013 > field452 + 5 || class127.field2013 < field452 - 5)) {
                                                                                    field470 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1395 != -1) {
                                                                                int var193 = class79.field1395;
                                                                                int var194 = class79.field1371;
                                                                                field298.method2335(153);
                                                                                field298.method2079(5);
                                                                                field298.method2101(Statics.field47 + var194);
                                                                                field298.method2137(Statics.field1870 + var193);
                                                                                field298.method2079(class124.field1975[82] ? (class124.field1975[81] ? 2 : 1) : 0);
                                                                                class79.field1395 = -1;
                                                                                field362 = class127.field2017;
                                                                                field363 = class127.field2020;
                                                                                field376 = 1;
                                                                                field304 = 0;
                                                                                field415 = var193;
                                                                                field430 = var194;
                                                                            }
                                                                            if (Statics.field533 != var126) {
                                                                                if (var126 != null) {
                                                                                    method1830(var126);
                                                                                }
                                                                                if (Statics.field533 != null) {
                                                                                    method1830(Statics.field533);
                                                                                }
                                                                            }
                                                                            if (Statics.field65 != var127 && field409 == field408) {
                                                                                if (var127 != null) {
                                                                                    method1830(var127);
                                                                                }
                                                                                if (Statics.field65 != null) {
                                                                                    method1830(Statics.field65);
                                                                                }
                                                                            }
                                                                            if (Statics.field65 == null) {
                                                                                if (field408 > 0) {
                                                                                    field408--;
                                                                                }
                                                                            } else if (field408 < field409) {
                                                                                field408++;
                                                                                if (field409 == field408) {
                                                                                    method1830(Statics.field65);
                                                                                }
                                                                            }
                                                                            method169();
                                                                            if (field501) {
                                                                                method10();
                                                                            }
                                                                            for (int var195 = 0; var195 < 5; var195++) {
                                                                                var10002 = field332[var195]++;
                                                                            }
                                                                            int var196 = ++class127.field2007 - 1;
                                                                            int var198 = class124.field1986;
                                                                            if (var196 > 15000 && var198 > 15000) {
                                                                                field355 = 250;
                                                                                class127.method11(14500);
                                                                                field298.method2335(184);
                                                                            }
                                                                            field427++;
                                                                            if (field427 > 500) {
                                                                                field427 = 0;
                                                                                int var200 = (int) (Math.random() * 8.0D);
                                                                                if ((var200 & 0x1) == 1) {
                                                                                    field320 += field342;
                                                                                }
                                                                                if ((var200 & 0x2) == 2) {
                                                                                    field322 += field323;
                                                                                }
                                                                                if ((var200 & 0x4) == 4) {
                                                                                    field324 += field325;
                                                                                }
                                                                            }
                                                                            if (field320 < -50) {
                                                                                field342 = 2;
                                                                            }
                                                                            if (field320 > 50) {
                                                                                field342 = -2;
                                                                            }
                                                                            if (field322 < -55) {
                                                                                field323 = 2;
                                                                            }
                                                                            if (field322 > 55) {
                                                                                field323 = -2;
                                                                            }
                                                                            if (field324 < -40) {
                                                                                field325 = 1;
                                                                            }
                                                                            if (field324 > 40) {
                                                                                field325 = -1;
                                                                            }
                                                                            field282++;
                                                                            if (field282 > 500) {
                                                                                field282 = 0;
                                                                                int var201 = (int) (Math.random() * 8.0D);
                                                                                if ((var201 & 0x1) == 1) {
                                                                                    field504 += field498;
                                                                                }
                                                                                if ((var201 & 0x2) == 2) {
                                                                                    field488 += field330;
                                                                                }
                                                                            }
                                                                            if (field504 < -60) {
                                                                                field498 = 2;
                                                                            }
                                                                            if (field504 > 60) {
                                                                                field498 = -2;
                                                                            }
                                                                            if (field488 < -20) {
                                                                                field330 = 1;
                                                                            }
                                                                            if (field488 > 10) {
                                                                                field330 = -1;
                                                                            }
                                                                            for (class34 var202 = (class34) field505.method3163(); var202 != null; var202 = (class34) field505.method3169()) {
                                                                                if ((long) var202.field803 < class103.method98() / 1000L - 5L) {
                                                                                    if (var202.field799 > 0) {
                                                                                        class10.method469(5, "", var202.field798 + class143.field2396);
                                                                                    }
                                                                                    if (var202.field799 == 0) {
                                                                                        class10.method469(5, "", var202.field798 + class143.field2318);
                                                                                    }
                                                                                    var202.method3296();
                                                                                }
                                                                            }
                                                                            field492++;
                                                                            if (field492 > 50) {
                                                                                field298.method2335(126);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2147 != null && field298.field1844 > 0) {
                                                                                    Statics.field2147.method2568(field298.field1843, 0, field298.field1844);
                                                                                    field298.field1844 = 0;
                                                                                    field492 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var204) {
                                                                                if (field355 > 0) {
                                                                                    method106();
                                                                                } else {
                                                                                    method2382(40);
                                                                                    Statics.field1858 = Statics.field2147;
                                                                                    Statics.field2147 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var137 = var136.field3;
                                                                        if (var137.field2557 < 0) {
                                                                            break;
                                                                        }
                                                                        var138 = class153.method1565(var137.field2654);
                                                                    } while (var138 == null || var138.field2664 == null || var137.field2557 >= var138.field2664.length || var138.field2664[var137.field2557] != var137);
                                                                    class32.method44(var136);
                                                                }
                                                            }
                                                            var134 = var133.field3;
                                                            if (var134.field2557 < 0) {
                                                                break;
                                                            }
                                                            var135 = class153.method1565(var134.field2654);
                                                        } while (var135 == null || var135.field2664 == null || var134.field2557 >= var135.field2664.length || var135.field2664[var134.field2557] != var134);
                                                        class32.method44(var133);
                                                    }
                                                }
                                                var131 = var130.field3;
                                                if (var131.field2557 < 0) {
                                                    break;
                                                }
                                                var132 = class153.method1565(var131.field2654);
                                            } while (var132 == null || var132.field2664 == null || var131.field2557 >= var132.field2664.length || var132.field2664[var131.field2557] != var131);
                                            class32.method44(var130);
                                        }
                                    }
                                } else if (field355 > 0) {
                                    method106();
                                } else {
                                    method2382(40);
                                    Statics.field1858 = Statics.field2147;
                                    Statics.field2147 = null;
                                }
                            }
                            break;
                        }
                        field298.method2335(134);
                        field298.method2079(0);
                        int var86 = field298.field1844;
                        class190.method823(field298);
                        field298.method2089(field298.field1844 - var86);
                    }
                }
            }
        } else if (field267 == 40 || field267 == 45) {
            method134();
        }
    }

    @ObfuscatedName("client.u(B)V")
    public final void method178() {
        boolean var1 = class162.method2573();
        if (var1 && field370 && Statics.field2779 != null) {
            Statics.field2779.method1000();
        }
        if (field2054) {
            Canvas var2 = Statics.field1255;
            var2.removeKeyListener(class124.field1976);
            var2.removeFocusListener(class124.field1976);
            class124.field1978 = -1;
            Canvas var3 = Statics.field1255;
            var3.removeMouseListener(class127.field2006);
            var3.removeMouseMotionListener(class127.field2006);
            var3.removeFocusListener(class127.field2006);
            class127.field2011 = 0;
            if (Statics.field2030 != null) {
                Statics.field2030.method2422(Statics.field1255);
            }
            this.method2621();
            Canvas var4 = Statics.field1255;
            var4.setFocusTraversalKeysEnabled(false);
            var4.addKeyListener(class124.field1976);
            var4.addFocusListener(class124.field1976);
            Canvas var5 = Statics.field1255;
            var5.addMouseListener(class127.field2006);
            var5.addMouseMotionListener(class127.field2006);
            var5.addFocusListener(class127.field2006);
            if (Statics.field2030 != null) {
                Statics.field2030.method2421(Statics.field1255);
            }
        }
        if (field267 == 0) {
            class131.method2419(class28.field674, class28.field675, (Color) null);
        } else if (field267 == 5) {
            class28.method1852(Statics.field1817, Statics.field719);
        } else if (field267 == 10 || field267 == 11) {
            class28.method1852(Statics.field1817, Statics.field719);
        } else if (field267 == 20) {
            class28.method1852(Statics.field1817, Statics.field719);
        } else if (field267 == 25) {
            if (field315 == 1) {
                if (field257 > field312) {
                    field312 = field257;
                }
                int var6 = (field312 * 50 - field257 * 50) / field312;
                method2329(class143.field2179 + class2.field21 + class2.field18 + var6 + "%" + class2.field19, false);
            } else if (field315 == 2) {
                if (field313 > field314) {
                    field314 = field313;
                }
                int var7 = (field314 * 50 - field313 * 50) / field314 + 50;
                method2329(class143.field2179 + class2.field21 + class2.field18 + var7 + "%" + class2.field19, false);
            } else {
                method2329(class143.field2179, false);
            }
        } else if (field267 == 30) {
            if (field417 != -1) {
                int var8 = field417;
                if (class153.method2498(var8)) {
                    Statics.method2927(Statics.field2556[var8], -1);
                }
            }
            for (int var9 = 0; var9 < field459; var9++) {
                if (field461[var9]) {
                    field462[var9] = true;
                }
                field463[var9] = field461[var9];
                field461[var9] = false;
            }
            field460 = field269;
            field406 = -1;
            field407 = -1;
            Statics.field718 = null;
            if (field417 != -1) {
                field459 = 0;
                method2863(field417, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1485();
            if (field334) {
                int var15 = Statics.field557;
                int var16 = Statics.field1275;
                int var17 = Statics.field2767;
                int var18 = Statics.field600;
                int var19 = 6116423;
                class73.method1492(var15, var16, var17, var18, var19);
                class73.method1492(var15 + 1, var16 + 1, var17 - 2, 16, 0);
                class73.method1494(var15 + 1, var16 + 18, var17 - 2, var18 - 19, 0);
                Statics.field1817.method3361(class143.field2323, var15 + 3, var16 + 14, var19, -1);
                int var20 = class127.field2008;
                int var21 = class127.field2013;
                for (int var22 = 0; var22 < field399; var22++) {
                    int var23 = (field399 - 1 - var22) * 15 + var16 + 31;
                    int var24 = 16777215;
                    if (var20 > var15 && var20 < var15 + var17 && var21 > var23 - 13 && var21 < var23 + 3) {
                        var24 = 16776960;
                    }
                    Statics.field1817.method3361(method37(var22), var15 + 3, var23, var24, 0);
                }
                method153(Statics.field557, Statics.field1275, Statics.field2767, Statics.field600);
            } else if (field406 != -1) {
                int var10 = field406;
                int var11 = field407;
                if (field399 >= 2 || field410 != 0 || field515) {
                    String var12;
                    if (field410 == 1 && field399 < 2) {
                        var12 = class143.field2320 + class143.field2277 + field411 + " " + class2.field25;
                    } else if (field515 && field399 < 2) {
                        var12 = field311 + class143.field2277 + field416 + " " + class2.field25;
                    } else {
                        int var13 = field399 - 1;
                        String var14;
                        if (field405[var13].length() > 0) {
                            var14 = field404[var13] + class143.field2277 + field405[var13];
                        } else {
                            var14 = field404[var13];
                        }
                        var12 = var14;
                    }
                    if (field399 > 2) {
                        var12 = var12 + class2.method1850(16777215) + " " + '/' + " " + (field399 - 2) + class143.field2324;
                    }
                    Statics.field1817.method3341(var12, var10 + 4, var11 + 15, 16777215, 0, field269 / 1000);
                }
            }
            if (field468 == 3) {
                for (int var25 = 0; var25 < field459; var25++) {
                    if (field463[var25]) {
                        class73.method1504(field464[var25], field465[var25], field466[var25], field281[var25], 16711935, 128);
                    } else if (field462[var25]) {
                        class73.method1504(field464[var25], field465[var25], field466[var25], field281[var25], 16711680, 128);
                    }
                }
            }
            int var26 = Statics.field1;
            int var27 = Statics.field1767.field780;
            int var28 = Statics.field1767.field761;
            int var29 = field294;
            for (class20 var30 = (class20) class20.field551.method3200(); var30 != null; var30 = (class20) class20.field551.method3209()) {
                if (var30.field548 != -1 || var30.field541 != null) {
                    int var31 = 0;
                    if (var27 > var30.field545) {
                        var31 += var27 - var30.field545;
                    } else if (var27 < var30.field543) {
                        var31 += var30.field543 - var27;
                    }
                    if (var28 > var30.field544) {
                        var31 += var28 - var30.field544;
                    } else if (var28 < var30.field542) {
                        var31 += var30.field542 - var28;
                    }
                    if (var31 - 64 > var30.field556 || field494 == 0 || var30.field547 != var26) {
                        if (var30.field552 != null) {
                            Statics.field708.method941(var30.field552);
                            var30.field552 = null;
                        }
                        if (var30.field554 != null) {
                            Statics.field708.method941(var30.field554);
                            var30.field554 = null;
                        }
                    } else {
                        var31 -= 64;
                        if (var31 < 0) {
                            var31 = 0;
                        }
                        int var32 = field494 * (var30.field556 - var31) / var30.field556;
                        class52 var10000;
                        if (var30.field552 != null) {
                            var30.field552.method1089(var32);
                        } else if (var30.field548 >= 0) {
                            var10000 = (class52) null;
                            class52 var33 = class52.method1034(Statics.field2130, var30.field548, 0);
                            if (var33 != null) {
                                class56 var34 = var33.method1028().method1055(Statics.field158);
                                class58 var35 = class58.method1078(var34, 100, var32);
                                var35.method1153(-1);
                                Statics.field708.method940(var35);
                                var30.field552 = var35;
                            }
                        }
                        if (var30.field554 != null) {
                            var30.field554.method1089(var32);
                            if (!var30.field554.method3303()) {
                                var30.field554 = null;
                            }
                        } else if (var30.field541 != null && (var30.field553 -= var29) <= 0) {
                            int var36 = (int) (Math.random() * (double) var30.field541.length);
                            var10000 = (class52) null;
                            class52 var37 = class52.method1034(Statics.field2130, var30.field541[var36], 0);
                            if (var37 != null) {
                                class56 var38 = var37.method1028().method1055(Statics.field158);
                                class58 var39 = class58.method1078(var38, 100, var32);
                                var39.method1153(0);
                                Statics.field708.method940(var39);
                                var30.field554 = var39;
                                var30.field553 = var30.field550 + (int) (Math.random() * (double) (var30.field549 - var30.field550));
                            }
                        }
                    }
                }
            }
            field294 = 0;
        } else if (field267 == 40) {
            method2329(class143.field2180 + class2.field21 + class143.field2181, false);
        } else if (field267 == 45) {
            method2329(class143.field2262, false);
        }
        if (field267 == 30 && field468 == 0 && !field2061) {
            try {
                Graphics var40 = Statics.field1255.getGraphics();
                for (int var41 = 0; var41 < field459; var41++) {
                    if (field462[var41]) {
                        Statics.field1849.method1315(var40, field464[var41], field465[var41], field466[var41], field281[var41]);
                        field462[var41] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field1255.repaint();
            }
        } else if (field267 > 0) {
            try {
                Graphics var43 = Statics.field1255.getGraphics();
                Statics.field1849.method1314(var43, 0, 0);
                field2061 = false;
                for (int var44 = 0; var44 < field459; var44++) {
                    field462[var44] = false;
                }
            } catch (Exception var46) {
                Statics.field1255.repaint();
            }
        }
    }

    @ObfuscatedName("client.j(B)V")
    public final void method263() {
        if (Statics.field546 != null) {
            Statics.field546.field182 = false;
        }
        Statics.field546 = null;
        if (Statics.field2147 != null) {
            Statics.field2147.method2553();
            Statics.field2147 = null;
        }
        if (class124.field1976 != null) {
            class124 var1 = class124.field1976;
            synchronized (class124.field1976) {
                class124.field1976 = null;
            }
        }
        if (class127.field2006 != null) {
            class127 var3 = class127.field2006;
            synchronized (class127.field2006) {
                class127.field2006 = null;
            }
        }
        Statics.field2030 = null;
        if (Statics.field2779 != null) {
            Statics.field2779.method982();
        }
        if (Statics.field91 != null) {
            Statics.field91.method982();
        }
        if (Statics.field2525 != null) {
            Statics.field2525.method2553();
        }
        class150.method152();
        try {
            class136.field2094.method3460();
            for (int var5 = 0; var5 < Statics.field1814; var5++) {
                Statics.field1862[var5].method3460();
            }
            class136.field2087.method3460();
            class136.field2093.method3460();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("dq.o(II)V")
    public static void method2382(int arg0) {
        if (field267 == arg0) {
            return;
        }
        if (field267 == 0) {
            class131.method83();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field291 = 0;
            field292 = 0;
            field293 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1858 != null) {
            Statics.field1858.method2553();
            Statics.field1858 = null;
        }
        if (field267 == 25) {
            field315 = 0;
            field257 = 0;
            field312 = 1;
            field313 = 0;
            field314 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method112(Statics.field1255, Statics.field1295, Statics.field1517, true, 0);
        } else if (arg0 == 20) {
            class28.method112(Statics.field1255, Statics.field1295, Statics.field1517, true, field267 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method112(Statics.field1255, Statics.field1295, Statics.field1517, false, 4);
        } else if (Statics.field659) {
            Statics.field663 = null;
            Statics.field657 = null;
            Statics.field692 = null;
            Statics.field671 = null;
            Statics.field131 = null;
            Statics.field660 = null;
            Statics.field800 = null;
            Statics.field1905 = null;
            Statics.field144 = null;
            Statics.field611 = null;
            Statics.field523 = null;
            Statics.field859 = null;
            Statics.field961 = null;
            Statics.field643 = null;
            Statics.field664 = null;
            Statics.field690 = null;
            Statics.field655 = null;
            Statics.field2538 = null;
            Statics.field1281 = null;
            Statics.field666 = null;
            Statics.field562 = null;
            Statics.field1120 = null;
            class162.method2508(2);
            class151.method1851(true);
            Statics.field659 = false;
        }
        field267 = arg0;
    }

    @ObfuscatedName("client.h(B)V")
    public void method177() {
        if (field267 != 1000) {
            boolean var1 = class151.method1573();
            if (!var1) {
                this.method223();
            }
        }
    }

    @ObfuscatedName("client.b(B)V")
    public void method223() {
        if (class151.field2535 >= 4) {
            this.method2582("js5crc");
            field267 = 1000;
            return;
        }
        if (class151.field2536 >= 4) {
            if (field267 <= 5) {
                this.method2582("js5io");
                field267 = 1000;
                return;
            }
            field356 = 3000;
            class151.field2536 = 3;
        }
        if (--field356 + 1 > 0) {
            return;
        }
        try {
            if (field421 == 0) {
                Statics.field164 = Statics.field1064.method2485(Statics.field1062, Statics.field1280);
                field421++;
            }
            if (field421 == 1) {
                if (Statics.field164.field2070 == 2) {
                    this.method179(-1);
                    return;
                }
                if (Statics.field164.field2070 == 1) {
                    field421++;
                }
            }
            if (field421 == 2) {
                Statics.field184 = new class130((Socket) Statics.field164.field2077, Statics.field1064);
                class107 var1 = new class107(5);
                var1.method2079(15);
                var1.method2247(66);
                Statics.field184.method2568(var1.field1843, 0, 5);
                field421++;
                Statics.field238 = class103.method98();
            }
            if (field421 == 3) {
                if (field267 <= 5 || Statics.field184.method2551() > 0) {
                    int var2 = Statics.field184.method2550();
                    if (var2 != 0) {
                        this.method179(var2);
                        return;
                    }
                    field421++;
                } else if (class103.method98() - Statics.field238 > 30000L) {
                    this.method179(-2);
                    return;
                }
            }
            if (field421 == 4) {
                class130 var3 = Statics.field184;
                boolean var4 = field267 > 20;
                if (Statics.field2525 != null) {
                    try {
                        Statics.field2525.method2553();
                    } catch (Exception var14) {
                    }
                    Statics.field2525 = null;
                }
                Statics.field2525 = var3;
                class151.method1851(var4);
                class151.field2537.field1844 = 0;
                Statics.field2910 = null;
                Statics.field1855 = null;
                class151.field2531 = 0;
                while (true) {
                    class152 var6 = (class152) class151.field2521.method3182();
                    if (var6 == null) {
                        while (true) {
                            class152 var7 = (class152) class151.field2523.method3182();
                            if (var7 == null) {
                                if (class151.field2534 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2079(4);
                                        var8.method2079(class151.field2534);
                                        var8.method2100(0);
                                        Statics.field2525.method2568(var8.field1843, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2525.method2553();
                                        } catch (Exception var12) {
                                        }
                                        class151.field2536++;
                                        Statics.field2525 = null;
                                    }
                                }
                                class151.field2530 = 0;
                                Statics.field2520 = class103.method98();
                                Statics.field164 = null;
                                Statics.field184 = null;
                                field421 = 0;
                                field290 = 0;
                                return;
                            }
                            class151.field2527.method3268(var7);
                            class151.field2526.method3177(var7, var7.field2885);
                            class151.field2519++;
                            class151.field2529--;
                        }
                    }
                    class151.field2518.method3177(var6, var6.field2885);
                    class151.field2522++;
                    class151.field2524--;
                }
            }
        } catch (IOException var15) {
            this.method179(-3);
        }
    }

    @ObfuscatedName("client.r(II)V")
    public void method179(int arg0) {
        Statics.field164 = null;
        Statics.field184 = null;
        field421 = 0;
        if (Statics.field2828 == Statics.field1280) {
            Statics.field1280 = Statics.field68;
        } else {
            Statics.field1280 = Statics.field2828;
        }
        field290++;
        if (field290 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field267 <= 5) {
                this.method2582("js5connect_full");
                field267 = 1000;
            } else {
                field356 = 3000;
            }
        } else if (field290 >= 2 && arg0 == 6) {
            this.method2582("js5connect_outofdate");
            field267 = 1000;
        } else if (field290 >= 4) {
            if (field267 <= 5) {
                this.method2582("js5connect");
                field267 = 1000;
            } else {
                field356 = 3000;
            }
        }
    }

    @ObfuscatedName("am.l(B)V")
    public static void method583() {
        if (field287 == 0) {
            Statics.field2085 = new class79(4, 104, 104, class6.field82);
            for (int var0 = 0; var0 < 4; var0++) {
                field316[var0] = new class198(104, 104);
            }
            Statics.field535 = new class72(512, 512);
            class28.field675 = class143.field2182;
            class28.field674 = 5;
            field287 = 20;
        } else if (field287 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1491[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1609(var1, 500, 800, 512, 334);
            class28.field675 = class143.field2183;
            class28.field674 = 10;
            field287 = 30;
        } else if (field287 == 30) {
            Statics.field955 = method1735(0, false, true, true);
            Statics.field696 = method1735(1, false, true, true);
            Statics.field1877 = method1735(2, true, false, true);
            Statics.field154 = method1735(3, false, true, true);
            Statics.field2130 = method1735(4, false, true, true);
            Statics.field1056 = method1735(5, true, true, true);
            Statics.field1684 = method1735(6, true, true, false);
            Statics.field650 = method1735(7, false, true, true);
            Statics.field1517 = method1735(8, false, true, true);
            Statics.field239 = method1735(9, false, true, true);
            Statics.field1295 = method1735(10, false, true, true);
            Statics.field564 = method1735(11, false, true, true);
            Statics.field699 = method1735(12, false, true, true);
            Statics.field945 = method1735(13, true, false, true);
            Statics.field1274 = method1735(14, false, true, false);
            Statics.field155 = method1735(15, false, true, true);
            class28.field675 = class143.field2184;
            class28.field674 = 20;
            field287 = 40;
        } else if (field287 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field955.method2764() * 4 / 100;
            int var8 = var7 + Statics.field696.method2764() * 4 / 100;
            int var9 = var8 + Statics.field1877.method2764() * 2 / 100;
            int var10 = var9 + Statics.field154.method2764() * 2 / 100;
            int var11 = var10 + Statics.field2130.method2764() * 6 / 100;
            int var12 = var11 + Statics.field1056.method2764() * 4 / 100;
            int var13 = var12 + Statics.field1684.method2764() * 2 / 100;
            int var14 = var13 + Statics.field650.method2764() * 60 / 100;
            int var15 = var14 + Statics.field1517.method2764() * 2 / 100;
            int var16 = var15 + Statics.field239.method2764() * 2 / 100;
            int var17 = var16 + Statics.field1295.method2764() * 2 / 100;
            int var18 = var17 + Statics.field564.method2764() * 2 / 100;
            int var19 = var18 + Statics.field699.method2764() * 2 / 100;
            int var20 = var19 + Statics.field945.method2764() * 2 / 100;
            int var21 = var20 + Statics.field1274.method2764() * 2 / 100;
            int var22 = var21 + Statics.field155.method2764() * 2 / 100;
            if (var22 == 100) {
                class28.field675 = class143.field2186;
                class28.field674 = 30;
                field287 = 45;
            } else {
                if (var22 != 0) {
                    class28.field675 = class143.field2202 + var22 + "%";
                }
                class28.field674 = 30;
            }
        } else if (field287 == 45) {
            boolean var23 = !field265;
            Statics.field72 = 22050;
            Statics.field1089 = var23;
            Statics.field70 = 2;
            class163 var24 = new class163();
            var24.method3026(9, 128);
            Statics.field2779 = class50.method92(Statics.field1064, Statics.field1255, 0, 22050);
            Statics.field2779.method979(var24);
            class162.method2(Statics.field155, Statics.field1274, Statics.field2130, var24);
            Statics.field91 = class50.method92(Statics.field1064, Statics.field1255, 1, 2048);
            Statics.field708 = new class49();
            Statics.field91.method979(Statics.field708);
            Statics.field158 = new class68(22050, Statics.field72);
            class28.field675 = class143.field2187;
            class28.field674 = 35;
            field287 = 50;
        } else if (field287 == 50) {
            int var25 = 0;
            if (Statics.field719 == null) {
                class148 var26 = Statics.field1517;
                class148 var27 = Statics.field945;
                int var28 = var26.method2699("p11_full");
                int var29 = var26.method2700(var28, "");
                class194 var30;
                if (class70.method2037(var26, var28, var29)) {
                    byte[] var31 = var27.method2734(var28, var29);
                    class194 var32;
                    if (var31 == null) {
                        var32 = null;
                    } else {
                        class194 var33 = new class194(var31, Statics.field1293, Statics.field1291, Statics.field1292, Statics.field1290, Statics.field1501, Statics.field1294);
                        class70.method36();
                        var32 = var33;
                    }
                    var30 = var32;
                } else {
                    var30 = null;
                }
                Statics.field719 = var30;
            } else {
                var25++;
            }
            if (Statics.field148 == null) {
                class148 var35 = Statics.field1517;
                class148 var36 = Statics.field945;
                int var37 = var35.method2699("p12_full");
                int var38 = var35.method2700(var37, "");
                class194 var39;
                if (class70.method2037(var35, var37, var38)) {
                    byte[] var40 = var36.method2734(var37, var38);
                    class194 var41;
                    if (var40 == null) {
                        var41 = null;
                    } else {
                        class194 var42 = new class194(var40, Statics.field1293, Statics.field1291, Statics.field1292, Statics.field1290, Statics.field1501, Statics.field1294);
                        class70.method36();
                        var41 = var42;
                    }
                    var39 = var41;
                } else {
                    var39 = null;
                }
                Statics.field148 = var39;
            } else {
                var25++;
            }
            if (Statics.field1817 == null) {
                Statics.field1817 = class70.method795(Statics.field1517, Statics.field945, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class28.field675 = class143.field2188 + var25 * 100 / 3 + "%";
                class28.field674 = 40;
            } else {
                Statics.field1296 = new class146(true);
                class28.field675 = class143.field2189;
                class28.field674 = 40;
                field287 = 60;
            }
        } else if (field287 == 60) {
            int var44 = class28.method2043(Statics.field1295, Statics.field1517);
            int var45 = class28.method490();
            if (var44 < var45) {
                class28.field675 = class143.field2190 + var44 * 100 / var45 + "%";
                class28.field674 = 50;
            } else {
                class28.field675 = class143.field2386;
                class28.field674 = 50;
                method2382(5);
                field287 = 70;
            }
        } else if (field287 == 70) {
            if (Statics.field1877.method2688()) {
                class41.method132(Statics.field1877);
                class37.method1853(Statics.field1877);
                class148 var46 = Statics.field1877;
                class148 var47 = Statics.field650;
                Statics.field951 = var46;
                Statics.field1898 = var47;
                Statics.field1893 = Statics.field951.method2681(3);
                class148 var48 = Statics.field1877;
                class148 var49 = Statics.field650;
                boolean var50 = field265;
                Statics.field869 = var48;
                Statics.field847 = var49;
                class36.field888 = var50;
                class35.method477(Statics.field1877, Statics.field650);
                class45.method113(Statics.field1877, Statics.field650, field264, Statics.field719);
                class148 var51 = Statics.field1877;
                class148 var52 = Statics.field955;
                class148 var53 = Statics.field696;
                Statics.field914 = var51;
                Statics.field2830 = var52;
                Statics.field909 = var53;
                class148 var54 = Statics.field1877;
                class148 var55 = Statics.field650;
                Statics.field933 = var54;
                Statics.field928 = var55;
                class148 var56 = Statics.field1877;
                Statics.field984 = var56;
                class148 var57 = Statics.field1877;
                Statics.field1067 = var57;
                Statics.field1065 = Statics.field1067.method2681(16);
                class148 var58 = Statics.field154;
                class148 var59 = Statics.field650;
                class148 var60 = Statics.field1517;
                class148 var61 = Statics.field945;
                Statics.field1888 = var58;
                Statics.field2597 = var59;
                Statics.field2567 = var60;
                Statics.field2570 = var61;
                Statics.field2556 = new class153[Statics.field1888.method2695()][];
                Statics.field2547 = new boolean[Statics.field1888.method2695()];
                class44.method1318(Statics.field1877);
                class43.method159(Statics.field1877);
                class28.field675 = class143.field2298;
                class28.field674 = 60;
                field287 = 80;
            } else {
                class28.field675 = class143.field2192 + Statics.field1877.method2785() + "%";
                class28.field674 = 60;
            }
        } else if (field287 == 80) {
            int var62 = 0;
            if (Statics.field2092 == null) {
                Statics.field2092 = class70.method673(Statics.field1517, "compass", "");
            } else {
                var62++;
            }
            if (Statics.field1434 == null) {
                Statics.field1434 = class70.method673(Statics.field1517, "mapedge", "");
            } else {
                var62++;
            }
            if (Statics.field619 == null) {
                Statics.field619 = class70.method2655(Statics.field1517, "mapscene", "");
            } else {
                var62++;
            }
            if (Statics.field1896 == null) {
                Statics.field1896 = class70.method1848(Statics.field1517, "mapfunction", "");
            } else {
                var62++;
            }
            if (Statics.field1527 == null) {
                Statics.field1527 = class70.method1848(Statics.field1517, "hitmarks", "");
            } else {
                var62++;
            }
            if (Statics.field1081 == null) {
                Statics.field1081 = class70.method1848(Statics.field1517, "headicons_pk", "");
            } else {
                var62++;
            }
            if (Statics.field801 == null) {
                Statics.field801 = class70.method1848(Statics.field1517, "headicons_prayer", "");
            } else {
                var62++;
            }
            if (Statics.field649 == null) {
                Statics.field649 = class70.method1848(Statics.field1517, "headicons_hint", "");
            } else {
                var62++;
            }
            if (Statics.field1861 == null) {
                Statics.field1861 = class70.method1848(Statics.field1517, "mapmarker", "");
            } else {
                var62++;
            }
            if (Statics.field1004 == null) {
                Statics.field1004 = class70.method1848(Statics.field1517, "cross", "");
            } else {
                var62++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class70.method1848(Statics.field1517, "mapdots", "");
            } else {
                var62++;
            }
            if (Statics.field697 == null) {
                Statics.field697 = class70.method2655(Statics.field1517, "scrollbar", "");
            } else {
                var62++;
            }
            if (Statics.field993 == null) {
                Statics.field993 = class70.method2655(Statics.field1517, "mod_icons", "");
            } else {
                var62++;
            }
            if (Statics.field48 == null) {
                Statics.field48 = Statics.method1571(Statics.field1517, "mapback", "");
            } else {
                var62++;
            }
            if (var62 < 14) {
                class28.field675 = class143.field2172 + var62 * 100 / 14 + "%";
                class28.field674 = 70;
            } else {
                Statics.field2921 = Statics.field993;
                Statics.field1434.method1396();
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 41.0D) - 20;
                for (int var67 = 0; var67 < Statics.field1896.length; var67++) {
                    Statics.field1896[var67].method1449(var63 + var66, var64 + var66, var65 + var66);
                }
                Statics.field619[0].method1546(var63 + var66, var64 + var66, var65 + var66);
                Statics.field71 = new int[33];
                Statics.field1271 = new int[33];
                Statics.field90 = new int[151];
                Statics.field2812 = new int[151];
                for (int var68 = 0; var68 < 33; var68++) {
                    int var69 = 999;
                    int var70 = 0;
                    for (int var71 = 0; var71 < 34; var71++) {
                        if (Statics.field48.field1329[Statics.field48.field1327 * var68 + var71] == 0) {
                            if (var69 == 999) {
                                var69 = var71;
                            }
                        } else if (var69 != 999) {
                            var70 = var71;
                            break;
                        }
                    }
                    Statics.field71[var68] = var69;
                    Statics.field1271[var68] = var70 - var69;
                }
                for (int var72 = 5; var72 < 156; var72++) {
                    int var73 = 999;
                    int var74 = 0;
                    for (int var75 = 25; var75 < 172; var75++) {
                        if (Statics.field48.field1329[Statics.field48.field1327 * var72 + var75] == 0 && var75 > 34 || var72 > 34) {
                            if (var73 == 999) {
                                var73 = var75;
                            }
                        } else if (var73 != 999) {
                            var74 = var75;
                            break;
                        }
                    }
                    Statics.field90[var72 - 5] = var73 - 25;
                    Statics.field2812[var72 - 5] = var74 - var73;
                }
                class28.field675 = class143.field2195;
                class28.field674 = 70;
                field287 = 90;
            }
        } else if (field287 == 90) {
            if (Statics.field239.method2688()) {
                class88 var76 = new class88(Statics.field239, Statics.field1517, 20, 0.8D, field265 ? 64 : 128);
                class84.method1766(var76);
                class84.method1775(0.8D);
                class28.field675 = class143.field2197;
                class28.field674 = 90;
                field287 = 110;
            } else {
                class28.field675 = class143.field2196 + Statics.field239.method2785() + "%";
                class28.field674 = 90;
            }
        } else if (field287 == 110) {
            Statics.field546 = new class12();
            Statics.field1064.method2461(Statics.field546, 10);
            class28.field675 = class143.field2198;
            class28.field674 = 94;
            field287 = 120;
        } else if (field287 == 120) {
            if (Statics.field1295.method2735("huffman", "")) {
                class102 var77 = new class102(Statics.field1295.method2732("huffman", ""));
                class192.method115(var77);
                class28.field675 = class143.field2200;
                class28.field674 = 96;
                field287 = 130;
            } else {
                class28.field675 = class143.field2402 + "%";
                class28.field674 = 96;
            }
        } else if (field287 == 130) {
            if (!Statics.field154.method2688()) {
                class28.field675 = class143.field2201 + Statics.field154.method2785() * 4 / 5 + "%";
                class28.field674 = 100;
            } else if (!Statics.field699.method2688()) {
                class28.field675 = class143.field2201 + (80 + Statics.field699.method2785() / 6) + "%";
                class28.field674 = 100;
            } else if (Statics.field945.method2688()) {
                class28.field675 = class143.field2391;
                class28.field674 = 100;
                field287 = 140;
            } else {
                class28.field675 = class143.field2201 + (96 + Statics.field945.method2785() / 20) + "%";
                class28.field674 = 100;
            }
        } else if (field287 == 140) {
            method2382(10);
        }
    }

    @ObfuscatedName("co.x(IZZZI)Leb;")
    public static class148 method1735(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2094 != null) {
            var4 = new class121(arg0, class136.field2094, Statics.field1862[arg0], 1000000);
        }
        return new class148(var4, Statics.field2050, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.q(I)V")
    public static final void method134() {
        try {
            if (field291 == 0) {
                if (Statics.field2147 != null) {
                    Statics.field2147.method2553();
                    Statics.field2147 = null;
                }
                Statics.field172 = null;
                field348 = false;
                field292 = 0;
                field291 = 1;
            }
            if (field291 == 1) {
                if (Statics.field172 == null) {
                    Statics.field172 = Statics.field1064.method2485(Statics.field1062, Statics.field1280);
                }
                if (Statics.field172.field2070 == 2) {
                    throw new IOException();
                }
                if (Statics.field172.field2070 == 1) {
                    Statics.field2147 = new class130((Socket) Statics.field172.field2077, Statics.field1064);
                    Statics.field172 = null;
                    field291 = 2;
                }
            }
            if (field291 == 2) {
                field298.field1844 = 0;
                field298.method2079(14);
                Statics.field2147.method2568(field298.field1843, 0, 1);
                field300.field1844 = 0;
                field291 = 3;
            }
            if (field291 == 3) {
                if (Statics.field2779 != null) {
                    Statics.field2779.method981();
                }
                if (Statics.field91 != null) {
                    Statics.field91.method981();
                }
                int var0 = Statics.field2147.method2550();
                if (Statics.field2779 != null) {
                    Statics.field2779.method981();
                }
                if (Statics.field91 != null) {
                    Statics.field91.method981();
                }
                if (var0 != 0) {
                    method1744(var0);
                    return;
                }
                field300.field1844 = 0;
                field291 = 5;
            }
            if (field291 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field298.field1844 = 0;
                field298.method2079(1);
                field298.method2079(class28.field682.method450());
                field298.method2247(var1[0]);
                field298.method2247(var1[1]);
                field298.method2247(var1[2]);
                field298.method2247(var1[3]);
                switch(class28.field682.field2433) {
                    case 0:
                    case 1:
                        field298.method2080(Statics.field683);
                        field298.field1844 += 5;
                        break;
                    case 2:
                        field298.method2247((Integer) Statics.field1459.field142.get(class200.method1279(class28.field668)));
                        field298.field1844 += 4;
                        break;
                    case 3:
                        field298.field1844 += 8;
                }
                field298.method2193(class28.field681);
                field298.method2110(class5.field66, class5.field67);
                field441.field1844 = 0;
                if (field267 == 40) {
                    field441.method2079(18);
                } else {
                    field441.method2079(16);
                }
                field441.method2100(0);
                int var2 = field441.field1844;
                field441.method2247(66);
                field441.method2086(field298.field1843, 0, field298.field1844);
                int var3 = field441.field1844;
                field441.method2193(class28.field668);
                field441.method2079(field265 ? 1 : 0);
                class110 var4 = field441;
                byte[] var5 = new byte[24];
                try {
                    class136.field2093.method3453(0L);
                    class136.field2093.method3441(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var30) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2086(var5, 0, 24);
                class107 var9 = new class107(Statics.field1296.method2674());
                Statics.field1296.method2670(var9);
                field441.method2086(var9.field1843, 0, var9.field1843.length);
                field441.method2247(Statics.field955.field2489);
                field441.method2247(Statics.field696.field2489);
                field441.method2247(Statics.field1877.field2489);
                field441.method2247(Statics.field154.field2489);
                field441.method2247(Statics.field2130.field2489);
                field441.method2247(Statics.field1056.field2489);
                field441.method2247(Statics.field1684.field2489);
                field441.method2247(Statics.field650.field2489);
                field441.method2247(Statics.field1517.field2489);
                field441.method2247(Statics.field239.field2489);
                field441.method2247(Statics.field1295.field2489);
                field441.method2247(Statics.field564.field2489);
                field441.method2247(Statics.field699.field2489);
                field441.method2247(Statics.field945.field2489);
                field441.method2247(Statics.field1274.field2489);
                field441.method2247(Statics.field155.field2489);
                field441.method2108(var1, var3, field441.field1844);
                field441.method2088(field441.field1844 - var2);
                Statics.field2147.method2568(field441.field1843, 0, field441.field1844);
                field298.method2334(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field300.method2334(var1);
                field291 = 6;
            }
            if (field291 == 6 && Statics.field2147.method2551() > 0) {
                int var11 = Statics.field2147.method2550();
                if (var11 == 21 && field267 == 20) {
                    field291 = 7;
                } else if (var11 == 2) {
                    field291 = 9;
                } else if (var11 == 15 && field267 == 40) {
                    field298.field1844 = 0;
                    field300.field1844 = 0;
                    field302 = -1;
                    field306 = -1;
                    field307 = -1;
                    field422 = -1;
                    field301 = 0;
                    field303 = 0;
                    field276 = 0;
                    field399 = 0;
                    field334 = false;
                    field489 = 0;
                    field415 = 0;
                    for (int var12 = 0; var12 < field297.length; var12++) {
                        if (field297[var12] != null) {
                            field297[var12].field784 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field295.length; var13++) {
                        if (field295[var13] != null) {
                            field295[var13].field784 = -1;
                        }
                    }
                    class14.field208 = new class175(32);
                    method2382(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field461[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field293 < 1) {
                    field293++;
                    field291 = 0;
                } else {
                    method1744(var11);
                    return;
                }
            }
            if (field291 == 7 && Statics.field2147.method2551() > 0) {
                field413 = (Statics.field2147.method2550() + 3) * 60;
                field291 = 8;
            }
            if (field291 == 8) {
                field292 = 0;
                class28.method1949(class143.field2307, class143.field2244, field413 / 60 + class143.field2208);
                if (--field413 <= 0) {
                    field291 = 0;
                }
            } else {
                if (field291 == 9 && Statics.field2147.method2551() >= 13) {
                    boolean var15 = Statics.field2147.method2550() == 1;
                    Statics.field2147.method2557(field300.field1843, 0, 4);
                    field300.field1844 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field300.method2336() << 24;
                        int var18 = var17 | field300.method2336() << 16;
                        int var19 = var18 | field300.method2336() << 8;
                        int var20 = var19 | field300.method2336();
                        int var21 = class200.method1279(class28.field668);
                        if (Statics.field1459.field142.size() >= 10 && !Statics.field1459.field142.containsKey(var21)) {
                            Iterator var22 = Statics.field1459.field142.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field1459.field142.put(var21, var20);
                        class9.method8();
                    }
                    field424 = Statics.field2147.method2550();
                    field426 = Statics.field2147.method2550() == 1;
                    field444 = Statics.field2147.method2550();
                    field444 <<= 0x8;
                    field444 += Statics.field2147.method2550();
                    field508 = Statics.field2147.method2550();
                    Statics.field2147.method2557(field300.field1843, 0, 1);
                    field300.field1844 = 0;
                    field302 = field300.method2336();
                    Statics.field2147.method2557(field300.field1843, 0, 2);
                    field300.field1844 = 0;
                    field301 = field300.method2094();
                    if (field508 == 1) {
                        try {
                            client var23 = Statics.field275;
                            JSObject.getWindow(var23).call("zap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    } else {
                        try {
                            client var25 = Statics.field275;
                            JSObject.getWindow(var25).call("unzap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    }
                    field291 = 10;
                }
                if (field291 != 10) {
                    field292++;
                    if (field292 > 2000) {
                        if (field293 < 1) {
                            if (Statics.field2828 == Statics.field1280) {
                                Statics.field1280 = Statics.field68;
                            } else {
                                Statics.field1280 = Statics.field2828;
                            }
                            field293++;
                            field291 = 0;
                        } else {
                            method1744(-3);
                        }
                    }
                } else if (Statics.field2147.method2551() >= field301) {
                    field300.field1844 = 0;
                    Statics.field2147.method2557(field300.field1843, 0, field301);
                    method478();
                    Statics.field709 = -1;
                    method1854(false);
                    field302 = -1;
                }
            }
        } catch (IOException var31) {
            if (field293 < 1) {
                if (Statics.field2828 == Statics.field1280) {
                    Statics.field1280 = Statics.field68;
                } else {
                    Statics.field1280 = Statics.field2828;
                }
                field293++;
                field291 = 0;
            } else {
                method1744(-2);
            }
        }
    }

    @ObfuscatedName("v.t(I)V")
    public static void method478() {
        field270 = 1L;
        field273 = -1;
        Statics.field546.field183 = 0;
        Statics.field622 = true;
        field283 = true;
        field479 = -1L;
        class190.method131();
        field298.field1844 = 0;
        field300.field1844 = 0;
        field302 = -1;
        field306 = -1;
        field307 = -1;
        field422 = -1;
        field303 = 0;
        field276 = 0;
        field355 = 0;
        field277 = 0;
        field399 = 0;
        field334 = false;
        class127.method11(0);
        class10.method662();
        field410 = 0;
        field515 = false;
        field454 = 0;
        field320 = (int) (Math.random() * 100.0D) - 50;
        field322 = (int) (Math.random() * 110.0D) - 55;
        field324 = (int) (Math.random() * 80.0D) - 40;
        field504 = (int) (Math.random() * 120.0D) - 60;
        field488 = (int) (Math.random() * 30.0D) - 20;
        field503 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field489 = 0;
        field493 = -1;
        field415 = 0;
        field430 = 0;
        field286 = class18.field525;
        field419 = 0;
        field369 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field297[var0] = null;
            field380[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field295[var1] = null;
        }
        Statics.field1767 = field297[2047] = new class3();
        field389 = -1;
        field296.method3201();
        field443.method3201();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field390[var2][var3][var4] = null;
                }
            }
        }
        field391 = new class178();
        field375 = 0;
        field507 = 0;
        field457 = 0;
        for (int var5 = 0; var5 < Statics.field1065; var5++) {
            class46 var6 = class46.method101(var5);
            if (var6 != null) {
                class155.field2683[var5] = 0;
                class155.field2684[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field338.length; var7++) {
            field338[var7] = -1;
        }
        field425 = -1;
        if (field417 != -1) {
            int var8 = field417;
            if (var8 != -1 && Statics.field2547[var8]) {
                Statics.field1888.method2704(var8);
                if (Statics.field2556[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2556[var8].length; var10++) {
                        if (Statics.field2556[var8][var10] != null) {
                            if (Statics.field2556[var8][var10].field2558 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2556[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2556[var8] = null;
                    }
                    Statics.field2547[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field418.method3182(); var11 != null; var11 = (class4) field418.method3178()) {
            method151(var11, true);
        }
        field417 = -1;
        field418 = new class175(8);
        field436 = null;
        field334 = false;
        field399 = 0;
        field358.method2912((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field386[var12] = null;
            field387[var12] = false;
        }
        class14.field208 = new class175(32);
        field268 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field461[var13] = true;
        }
        field480 = null;
        Statics.field1354 = 0;
        Statics.field175 = null;
    }

    @ObfuscatedName("cn.y(II)V")
    public static void method1744(int arg0) {
        if (arg0 == -3) {
            class28.method1949(class143.field2223, class143.field2339, class143.field2274);
        } else if (arg0 == -2) {
            class28.method1949(class143.field2212, class143.field2271, class143.field2214);
        } else if (arg0 == -1) {
            class28.method1949(class143.field2215, class143.field2216, class143.field2217);
        } else if (arg0 == 3) {
            class28.method1949(class143.field2170, class143.field2213, class143.field2220);
        } else if (arg0 == 4) {
            class28.method1949(class143.field2221, class143.field2222, class143.field2243);
        } else if (arg0 == 5) {
            class28.method1949(class143.field2224, class143.field2225, class143.field2226);
        } else if (arg0 == 6) {
            class28.method1949(class143.field2308, class143.field2266, class143.field2229);
        } else if (arg0 == 7) {
            class28.method1949(class143.field2230, class143.field2231, class143.field2232);
        } else if (arg0 == 8) {
            class28.method1949(class143.field2233, class143.field2234, class143.field2235);
        } else if (arg0 == 9) {
            class28.method1949(class143.field2236, class143.field2237, class143.field2238);
        } else if (arg0 == 10) {
            class28.method1949(class143.field2239, class143.field2249, class143.field2241);
        } else if (arg0 == 11) {
            class28.method1949(class143.field2242, class143.field2291, class143.field2193);
        } else if (arg0 == 12) {
            class28.method1949(class143.field2252, class143.field2246, class143.field2247);
        } else if (arg0 == 13) {
            class28.method1949(class143.field2248, class143.field2210, class143.field2250);
        } else if (arg0 == 14) {
            class28.method1949(class143.field2251, class143.field2281, class143.field2302);
        } else if (arg0 == 16) {
            class28.method1949(class143.field2254, class143.field2255, class143.field2256);
        } else if (arg0 == 17) {
            class28.method1949(class143.field2287, class143.field2258, class143.field2259);
        } else if (arg0 == 18) {
            class28.method1949(class143.field2382, class143.field2261, class143.field2227);
        } else if (arg0 == 19) {
            class28.method1949(class143.field2263, class143.field2264, class143.field2297);
        } else if (arg0 == 20) {
            class28.method1949(class143.field2328, class143.field2267, class143.field2268);
        } else if (arg0 == 22) {
            class28.method1949(class143.field2269, class143.field2270, class143.field2204);
        } else if (arg0 == 23) {
            class28.method1949(class143.field2272, class143.field2273, class143.field2300);
        } else if (arg0 == 24) {
            class28.method1949(class143.field2275, class143.field2276, class143.field2340);
        } else if (arg0 == 25) {
            class28.method1949(class143.field2336, class143.field2279, class143.field2280);
        } else if (arg0 == 26) {
            class28.method1949(class143.field2311, class143.field2282, class143.field2283);
        } else if (arg0 == 27) {
            class28.method1949(class143.field2364, class143.field2207, class143.field2286);
        } else if (arg0 == 31) {
            class28.method1949(class143.field2395, class143.field2377, class143.field2295);
        } else if (arg0 == 32) {
            class28.method1949(class143.field2296, class143.field2345, class143.field2383);
        } else if (arg0 == 37) {
            class28.method1949(class143.field2301, class143.field2366, class143.field2206);
        } else if (arg0 == 38) {
            class28.method1949(class143.field2341, class143.field2219, class143.field2304);
        } else if (arg0 == 55) {
            class28.method1949(class143.field2407, class143.field2306, class143.field2278);
        } else if (arg0 == 56) {
            class28.method1949(class143.field2211, class143.field2245, class143.field2310);
            method2382(11);
            return;
        } else if (arg0 == 57) {
            class28.method1949(class143.field2413, class143.field2312, class143.field2313);
            method2382(11);
            return;
        } else {
            class28.method1949(class143.field2314, class143.field2315, class143.field2316);
        }
        method2382(10);
    }

    @ObfuscatedName("o.d(I)V")
    public static final void method106() {
        if (Statics.field2147 != null) {
            Statics.field2147.method2553();
            Statics.field2147 = null;
        }
        method2413();
        Statics.field2085.method1575();
        for (int var0 = 0; var0 < 4; var0++) {
            field316[var0].method3465();
        }
        System.gc();
        class162.method2508(2);
        field491 = -1;
        field370 = false;
        class20.method1739();
        method2382(10);
    }

    @ObfuscatedName("dy.z(I)V")
    public static final void method2413() {
        class41.method556();
        class37.method3044();
        class40.field956.method3138();
        class36.method1745();
        class35.field807.method3138();
        class35.field808.method3138();
        class45.field1009.method3138();
        class45.field1010.method3138();
        class45.field1011.method3138();
        class38.field920.method3138();
        class38.field911.method3138();
        class39.field930.method3138();
        class39.field931.method3138();
        class42.method549();
        class46.field1059.method3138();
        class158.field2697.method3138();
        class153.method1742();
        ((class88) Statics.field1488).method1840();
        class19.field537.method3138();
        Statics.field955.method2729();
        Statics.field696.method2729();
        Statics.field154.method2729();
        Statics.field2130.method2729();
        Statics.field1056.method2729();
        Statics.field1684.method2729();
        Statics.field650.method2729();
        Statics.field1517.method2729();
        Statics.field239.method2729();
        Statics.field1295.method2729();
        Statics.field564.method2729();
        Statics.field699.method2729();
    }

    @ObfuscatedName("az.n(B)V")
    public static final void method752() {
        if (Statics.field91 != null) {
            Statics.field91.method980();
        }
        if (Statics.field2779 != null) {
            Statics.field2779.method980();
        }
    }

    @ObfuscatedName("f.v(Lax;IIII)V")
    public static void method487(class38 arg0, int arg1, int arg2, int arg3) {
        if (field454 >= 50 || field494 == 0 || arg0.field915 == null || arg1 >= arg0.field915.length) {
            return;
        }
        int var4 = arg0.field915[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field384[field454] = var5;
        field497[field454] = var6;
        field349[field454] = 0;
        field500[field454] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field499[field454] = (var8 << 16) + (var9 << 8) + var7;
        field454++;
    }

    @ObfuscatedName("e.f(IIII)V")
    public static void method31(int arg0, int arg1, int arg2) {
        if (field279 == 0 || arg1 == 0 || field454 >= 50) {
            return;
        }
        field384[field454] = arg0;
        field497[field454] = arg1;
        field349[field454] = arg2;
        field500[field454] = null;
        field499[field454] = 0;
        field454++;
    }

    @ObfuscatedName("c.a(II)V")
    public static void method516(int arg0) {
        if (arg0 == -1 && !field370) {
            Statics.field2473.method3024();
            class162.field2729 = 1;
            Statics.field2726 = null;
        } else if (arg0 != -1 && field491 != arg0 && field328 != 0 && !field370) {
            class148 var1 = Statics.field1684;
            int var2 = field328;
            class162.field2729 = 1;
            Statics.field2726 = var1;
            Statics.field1247 = arg0;
            Statics.field2731 = 0;
            Statics.field134 = var2;
            Statics.field2730 = false;
            Statics.field1063 = 2;
        }
        field491 = arg0;
    }

    @ObfuscatedName("cn.p(III)V")
    public static void method1741(int arg0, int arg1) {
        if (field328 != 0 && arg0 != -1) {
            class162.method1832(Statics.field564, arg0, 0, field328, false);
            field370 = true;
        }
    }

    @ObfuscatedName("au.s(III)V")
    public static final void method727(int arg0, int arg1) {
        if (field489 != 0 && field489 != 3 || class127.field2018 != 1 && Statics.field235 || class127.field2018 != 4) {
            return;
        }
        int var2 = class127.field2017 - 25 - arg0;
        int var3 = class127.field2020 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field504 + field503 & 0x7FF;
        int var5 = class84.field1491[var4];
        int var6 = class84.field1492[var4];
        int var7 = (field488 + 256) * var5 >> 8;
        int var8 = (field488 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1767.field780 + var9 >> 7;
        int var12 = Statics.field1767.field761 - var10 >> 7;
        field298.method2335(37);
        field298.method2079(18);
        field298.method2101(Statics.field47 + var12);
        field298.method2137(Statics.field1870 + var11);
        field298.method2079(class124.field1975[82] ? (class124.field1975[81] ? 2 : 1) : 0);
        field298.method2079(var2);
        field298.method2079(var3);
        field298.method2100(field503);
        field298.method2079(57);
        field298.method2079(field504);
        field298.method2079(field488);
        field298.method2079(89);
        field298.method2100(Statics.field1767.field780);
        field298.method2100(Statics.field1767.field761);
        field298.method2079(63);
        field415 = var11;
        field430 = var12;
    }

    @ObfuscatedName("dq.c(B)V")
    public static final void method2383() {
        for (int var0 = -1; var0 < field419; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field377[var0];
            }
            class3 var2 = field297[var1];
            if (var2 != null && var2.field788 > 0) {
                var2.field788--;
                if (var2.field788 == 0) {
                    var2.field751 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field369; var3++) {
            int var4 = field486[var3];
            class30 var5 = field295[var4];
            if (var5 != null && var5.field788 > 0) {
                var5.field788--;
                if (var5.field788 == 0) {
                    var5.field751 = null;
                }
            }
        }
    }

    @ObfuscatedName("as.ar(Ljava/lang/String;B)V")
    public static final void method565(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1459.field140 = !Statics.field1459.field140;
            class9.method8();
            if (Statics.field1459.field140) {
                class10.method469(99, "", "Roofs are now all hidden");
            } else {
                class10.method469(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field424 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field440 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field440 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field355 > 0) {
                    method106();
                } else {
                    method2382(40);
                    Statics.field1858 = Statics.field2147;
                    Statics.field2147 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field396 == 2) {
                throw new RuntimeException();
            }
        }
        field298.method2335(201);
        field298.method2079(arg0.length() + 1);
        field298.method2193(arg0);
    }

    @ObfuscatedName("i.ac(I)V")
    public static final void method10() {
        int var0 = Statics.field1250 * 128 + 64;
        int var1 = Statics.field255 * 128 + 64;
        int var2 = method584(var0, var1, Statics.field1) - Statics.field51;
        if (Statics.field721 < var0) {
            Statics.field721 += Statics.field157 * (var0 - Statics.field721) / 1000 + Statics.field703;
            if (Statics.field721 > var0) {
                Statics.field721 = var0;
            }
        }
        if (Statics.field721 > var0) {
            Statics.field721 -= Statics.field157 * (Statics.field721 - var0) / 1000 + Statics.field703;
            if (Statics.field721 < var0) {
                Statics.field721 = var0;
            }
        }
        if (Statics.field13 < var2) {
            Statics.field13 += Statics.field157 * (var2 - Statics.field13) / 1000 + Statics.field703;
            if (Statics.field13 > var2) {
                Statics.field13 = var2;
            }
        }
        if (Statics.field13 > var2) {
            Statics.field13 -= Statics.field157 * (Statics.field13 - var2) / 1000 + Statics.field703;
            if (Statics.field13 < var2) {
                Statics.field13 = var2;
            }
        }
        if (Statics.field849 < var1) {
            Statics.field849 += Statics.field157 * (var1 - Statics.field849) / 1000 + Statics.field703;
            if (Statics.field849 > var1) {
                Statics.field849 = var1;
            }
        }
        if (Statics.field849 > var1) {
            Statics.field849 -= Statics.field157 * (Statics.field849 - var1) / 1000 + Statics.field703;
            if (Statics.field849 < var1) {
                Statics.field849 = var1;
            }
        }
        int var3 = Statics.field49 * 128 + 64;
        int var4 = Statics.field518 * 128 + 64;
        int var5 = method584(var3, var4, Statics.field1) - Statics.field1266;
        int var6 = var3 - Statics.field721;
        int var7 = var5 - Statics.field13;
        int var8 = var4 - Statics.field849;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field161 < var10) {
            Statics.field161 += Statics.field1117 * (var10 - Statics.field161) / 1000 + Statics.field1435;
            if (Statics.field161 > var10) {
                Statics.field161 = var10;
            }
        }
        if (Statics.field161 > var10) {
            Statics.field161 -= Statics.field1117 * (Statics.field161 - var10) / 1000 + Statics.field1435;
            if (Statics.field161 < var10) {
                Statics.field161 = var10;
            }
        }
        int var12 = var11 - Statics.field1863;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1863 += Statics.field1117 * var12 / 1000 + Statics.field1435;
            Statics.field1863 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1863 -= Statics.field1117 * -var12 / 1000 + Statics.field1435;
            Statics.field1863 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1863;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1863 = var11;
        }
    }

    @ObfuscatedName("y.ah(I)V")
    public static final void method169() {
        int var0 = field320 + Statics.field1767.field780;
        int var1 = field322 + Statics.field1767.field761;
        if (Statics.field1666 - var0 < -500 || Statics.field1666 - var0 > 500 || Statics.field587 - var1 < -500 || Statics.field587 - var1 > 500) {
            Statics.field1666 = var0;
            Statics.field587 = var1;
        }
        if (Statics.field1666 != var0) {
            Statics.field1666 += (var0 - Statics.field1666) / 16;
        }
        if (Statics.field587 != var1) {
            Statics.field587 += (var1 - Statics.field587) / 16;
        }
        if (class127.field2009 == 4 && Statics.field235) {
            int var2 = class127.field2013 - field344;
            field513 = var2 * 2;
            field344 = var2 == -1 || var2 == 1 ? class127.field2013 : (field344 + class127.field2013) / 2;
            int var3 = field343 - class127.field2008;
            field341 = var3 * 2;
            field343 = var3 == -1 || var3 == 1 ? class127.field2008 : (field343 + class127.field2008) / 2;
        } else {
            if (class124.field1975[96]) {
                field341 += (-24 - field341) / 2;
            } else if (class124.field1975[97]) {
                field341 += (24 - field341) / 2;
            } else {
                field341 /= 2;
            }
            if (class124.field1975[98]) {
                field513 += (12 - field513) / 2;
            } else if (class124.field1975[99]) {
                field513 += (-12 - field513) / 2;
            } else {
                field513 /= 2;
            }
            field344 = class127.field2013;
            field343 = class127.field2008;
        }
        field503 = field341 / 2 + field503 & 0x7FF;
        field339 += field513 / 2;
        if (field339 < 128) {
            field339 = 128;
        }
        if (field339 > 383) {
            field339 = 383;
        }
        int var4 = Statics.field1666 >> 7;
        int var5 = Statics.field587 >> 7;
        int var6 = method584(Statics.field1666, Statics.field587, Statics.field1);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1;
                    if (var10 < 3 && (class6.field76[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field82[var10][var8][var9];
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
        if (var12 > field347) {
            field347 += (var12 - field347) / 24;
        } else if (var12 < field347) {
            field347 += (var12 - field347) / 80;
        }
    }

    @ObfuscatedName("a.ap(I)V")
    public static final void method489() {
        for (int var0 = -1; var0 < field419; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field377[var0];
            }
            class3 var2 = field297[var1];
            if (var2 != null) {
                method550(var2, 1);
            }
        }
    }

    @ObfuscatedName("ap.aj(Laa;II)V")
    public static final void method550(class33 arg0, int arg1) {
        if (arg0.field769 > field269) {
            method6(arg0);
        } else if (arg0.field789 >= field269) {
            method714(arg0);
        } else {
            arg0.field766 = arg0.field739;
            if (arg0.field791 == 0) {
                arg0.field795 = 0;
            } else {
                label424: {
                    if (arg0.field762 != -1 && arg0.field772 == 0) {
                        class38 var2 = class38.method552(arg0.field762);
                        if (arg0.field752 > 0 && var2.field923 == 0) {
                            arg0.field795++;
                            break label424;
                        }
                        if (arg0.field752 <= 0 && var2.field924 == 0) {
                            arg0.field795++;
                            break label424;
                        }
                    }
                    int var3 = arg0.field780;
                    int var4 = arg0.field761;
                    int var5 = arg0.field783[arg0.field791 - 1] * 128 + arg0.field742 * 64;
                    int var6 = arg0.field793[arg0.field791 - 1] * 128 + arg0.field742 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field738 = 1280;
                            } else if (var4 > var6) {
                                arg0.field738 = 1792;
                            } else {
                                arg0.field738 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field738 = 768;
                            } else if (var4 > var6) {
                                arg0.field738 = 256;
                            } else {
                                arg0.field738 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field738 = 1024;
                        } else if (var4 > var6) {
                            arg0.field738 = 0;
                        }
                        int var7 = arg0.field738 - arg0.field792 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field747;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field746;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field749;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field748;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field746;
                        }
                        arg0.field766 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class30) {
                            var10 = ((class30) arg0).field705.field821;
                        }
                        if (var10) {
                            if (arg0.field792 != arg0.field738 && arg0.field784 == -1 && arg0.field790 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field791 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field791 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field795 > 0 && arg0.field791 > 1) {
                                var9 = 8;
                                arg0.field795--;
                            }
                        } else {
                            if (arg0.field791 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field791 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field795 > 0 && arg0.field791 > 1) {
                                var9 = 8;
                                arg0.field795--;
                            }
                        }
                        if (arg0.field794[arg0.field791 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field766 == arg0.field746 && arg0.field750 != -1) {
                            arg0.field766 = arg0.field750;
                        }
                        if (var3 < var5) {
                            arg0.field780 += var9;
                            if (arg0.field780 > var5) {
                                arg0.field780 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field780 -= var9;
                            if (arg0.field780 < var5) {
                                arg0.field780 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field761 += var9;
                            if (arg0.field761 > var6) {
                                arg0.field761 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field761 -= var9;
                            if (arg0.field761 < var6) {
                                arg0.field761 = var6;
                            }
                        }
                        if (arg0.field780 == var5 && arg0.field761 == var6) {
                            arg0.field791--;
                            if (arg0.field752 > 0) {
                                arg0.field752--;
                            }
                        }
                    } else {
                        arg0.field780 = var5;
                        arg0.field761 = var6;
                    }
                }
            }
        }
        if (arg0.field780 < 128 || arg0.field761 < 128 || arg0.field780 >= 13184 || arg0.field761 >= 13184) {
            arg0.field762 = -1;
            arg0.field774 = -1;
            arg0.field769 = 0;
            arg0.field789 = 0;
            arg0.field780 = arg0.field783[0] * 128 + arg0.field742 * 64;
            arg0.field761 = arg0.field793[0] * 128 + arg0.field742 * 64;
            arg0.method572();
        }
        if (Statics.field1767 == arg0 && (arg0.field780 < 1536 || arg0.field761 < 1536 || arg0.field780 >= 11776 || arg0.field761 >= 11776)) {
            arg0.field762 = -1;
            arg0.field774 = -1;
            arg0.field769 = 0;
            arg0.field789 = 0;
            arg0.field780 = arg0.field783[0] * 128 + arg0.field742 * 64;
            arg0.field761 = arg0.field793[0] * 128 + arg0.field742 * 64;
            arg0.method572();
        }
        if (arg0.field790 != 0) {
            if (arg0.field784 != -1 && arg0.field784 < 32768) {
                class30 var11 = field295[arg0.field784];
                if (var11 != null) {
                    int var12 = arg0.field780 - var11.field780;
                    int var13 = arg0.field761 - var11.field761;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field738 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field784 >= 32768) {
                int var14 = arg0.field784 - 32768;
                if (field444 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field297[var14];
                if (var15 != null) {
                    int var16 = arg0.field780 - var15.field780;
                    int var17 = arg0.field761 - var15.field761;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field738 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field764 != 0 || arg0.field765 != 0) && (arg0.field791 == 0 || arg0.field795 > 0)) {
                int var18 = arg0.field780 - (arg0.field764 * 64 - Statics.field1870 * 64 - Statics.field1870 * 64);
                int var19 = arg0.field761 - (arg0.field765 * 64 - Statics.field47 * 64 - Statics.field47 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field738 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field764 = 0;
                arg0.field765 = 0;
            }
            int var20 = arg0.field738 - arg0.field792 & 0x7FF;
            if (var20 == 0) {
                arg0.field740 = 0;
            } else {
                arg0.field740++;
                if (var20 > 1024) {
                    arg0.field792 -= arg0.field790;
                    boolean var21 = true;
                    if (var20 < arg0.field790 || var20 > 2048 - arg0.field790) {
                        arg0.field792 = arg0.field738;
                        var21 = false;
                    }
                    if (arg0.field766 == arg0.field739 && (arg0.field740 > 25 || var21)) {
                        if (arg0.field786 == -1) {
                            arg0.field766 = arg0.field746;
                        } else {
                            arg0.field766 = arg0.field786;
                        }
                    }
                } else {
                    arg0.field792 += arg0.field790;
                    boolean var22 = true;
                    if (var20 < arg0.field790 || var20 > 2048 - arg0.field790) {
                        arg0.field792 = arg0.field738;
                        var22 = false;
                    }
                    if (arg0.field766 == arg0.field739 && (arg0.field740 > 25 || var22)) {
                        if (arg0.field745 == -1) {
                            arg0.field766 = arg0.field746;
                        } else {
                            arg0.field766 = arg0.field745;
                        }
                    }
                }
                arg0.field792 &= 0x7FF;
            }
        }
        arg0.field796 = false;
        if (arg0.field766 != -1) {
            class38 var24 = class38.method552(arg0.field766);
            if (var24 == null || var24.field921 == null) {
                arg0.field766 = -1;
            } else {
                arg0.field753++;
                if (arg0.field767 < var24.field921.length && arg0.field753 > var24.field910[arg0.field767]) {
                    arg0.field753 = 1;
                    arg0.field767++;
                    method487(var24, arg0.field767, arg0.field780, arg0.field761);
                }
                if (arg0.field767 >= var24.field921.length) {
                    arg0.field753 = 0;
                    arg0.field767 = 0;
                    method487(var24, arg0.field767, arg0.field780, arg0.field761);
                }
            }
        }
        if (arg0.field774 != -1 && field269 >= arg0.field777) {
            if (arg0.field775 < 0) {
                arg0.field775 = 0;
            }
            int var25 = class39.method685(arg0.field774).field939;
            if (var25 == -1) {
                arg0.field774 = -1;
            } else {
                class38 var26 = class38.method552(var25);
                if (var26 == null || var26.field921 == null) {
                    arg0.field774 = -1;
                } else {
                    arg0.field768++;
                    if (arg0.field775 < var26.field921.length && arg0.field768 > var26.field910[arg0.field775]) {
                        arg0.field768 = 1;
                        arg0.field775++;
                        method487(var26, arg0.field775, arg0.field780, arg0.field761);
                    }
                    if (arg0.field775 >= var26.field921.length && (arg0.field775 < 0 || arg0.field775 >= var26.field921.length)) {
                        arg0.field774 = -1;
                    }
                }
            }
        }
        if (arg0.field762 != -1 && arg0.field772 <= 1) {
            class38 var27 = class38.method552(arg0.field762);
            if (var27.field923 == 1 && arg0.field752 > 0 && arg0.field769 <= field269 && arg0.field789 < field269) {
                arg0.field772 = 1;
                return;
            }
        }
        if (arg0.field762 != -1 && arg0.field772 == 0) {
            class38 var28 = class38.method552(arg0.field762);
            if (var28 == null || var28.field921 == null) {
                arg0.field762 = -1;
            } else {
                arg0.field771++;
                if (arg0.field770 < var28.field921.length && arg0.field771 > var28.field910[arg0.field770]) {
                    arg0.field771 = 1;
                    arg0.field770++;
                    method487(var28, arg0.field770, arg0.field780, arg0.field761);
                }
                if (arg0.field770 >= var28.field921.length) {
                    arg0.field770 -= var28.field927;
                    arg0.field773++;
                    if (arg0.field773 >= var28.field917) {
                        arg0.field762 = -1;
                    } else if (arg0.field770 >= 0 && arg0.field770 < var28.field921.length) {
                        method487(var28, arg0.field770, arg0.field780, arg0.field761);
                    } else {
                        arg0.field762 = -1;
                    }
                }
                arg0.field796 = var28.field918;
            }
        }
        if (arg0.field772 > 0) {
            arg0.field772--;
        }
    }

    @ObfuscatedName("i.as(Laa;I)V")
    public static final void method6(class33 arg0) {
        int var1 = arg0.field769 - field269;
        int var2 = arg0.field779 * 128 + arg0.field742 * 64;
        int var3 = arg0.field781 * 128 + arg0.field742 * 64;
        arg0.field780 += (var2 - arg0.field780) / var1;
        arg0.field761 += (var3 - arg0.field761) / var1;
        arg0.field795 = 0;
        if (arg0.field785 == 0) {
            arg0.field738 = 1024;
        }
        if (arg0.field785 == 1) {
            arg0.field738 = 1536;
        }
        if (arg0.field785 == 2) {
            arg0.field738 = 0;
        }
        if (arg0.field785 == 3) {
            arg0.field738 = 512;
        }
    }

    @ObfuscatedName("ax.aa(Laa;B)V")
    public static final void method714(class33 arg0) {
        if (field269 == arg0.field789 || arg0.field762 == -1 || arg0.field772 != 0 || arg0.field771 + 1 > class38.method552(arg0.field762).field910[arg0.field770]) {
            int var1 = arg0.field789 - arg0.field769;
            int var2 = field269 - arg0.field769;
            int var3 = arg0.field779 * 128 + arg0.field742 * 64;
            int var4 = arg0.field781 * 128 + arg0.field742 * 64;
            int var5 = arg0.field763 * 128 + arg0.field742 * 64;
            int var6 = arg0.field782 * 128 + arg0.field742 * 64;
            arg0.field780 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field761 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field795 = 0;
        if (arg0.field785 == 0) {
            arg0.field738 = 1024;
        }
        if (arg0.field785 == 1) {
            arg0.field738 = 1536;
        }
        if (arg0.field785 == 2) {
            arg0.field738 = 0;
        }
        if (arg0.field785 == 3) {
            arg0.field738 = 512;
        }
        arg0.field792 = arg0.field738;
    }

    @ObfuscatedName("df.am(Lk;III)V")
    public static void method2455(class3 arg0, int arg1, int arg2) {
        if (arg0.field762 == arg1 && arg1 != -1) {
            int var3 = class38.method552(arg1).field925;
            if (var3 == 1) {
                arg0.field770 = 0;
                arg0.field771 = 0;
                arg0.field772 = arg2;
                arg0.field773 = 0;
            }
            if (var3 == 2) {
                arg0.field773 = 0;
            }
        } else if (arg1 == -1 || arg0.field762 == -1 || class38.method552(arg1).field919 >= class38.method552(arg0.field762).field919) {
            arg0.field762 = arg1;
            arg0.field770 = 0;
            arg0.field771 = 0;
            arg0.field772 = arg2;
            arg0.field773 = 0;
            arg0.field752 = arg0.field791;
        }
    }

    @ObfuscatedName("dn.ae(Ljava/lang/String;ZB)V")
    public static final void method2329(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field148.method3410(arg0, 250);
        int var6 = Statics.field148.method3333(arg0, 250) * 13;
        class73.method1492(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1494(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field148.method3348(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1737(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method153(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1255.getGraphics();
            Statics.field1849.method1314(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1255.repaint();
        }
    }

    @ObfuscatedName("k.ai(Lah;B)V")
    public static final void method12(class29 arg0) {
        if (Statics.field1767.field780 >> 7 == field415 && Statics.field1767.field761 >> 7 == field430) {
            field415 = 0;
        }
        int var1 = field419;
        if (class29.field704 == arg0 || class29.field695 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field704 == arg0) {
                var3 = Statics.field1767;
                var4 = 33538048;
            } else if (class29.field695 == arg0) {
                var3 = field297[field389];
                var4 = field389 << 14;
            } else {
                var3 = field297[field377[var2]];
                var4 = field377[var2] << 14;
                if (class29.field698 == arg0 && field389 == field377[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method25() && !var3.field46) {
                var3.field34 = false;
                if ((field265 && field419 > 50 || field419 > 200) && class29.field704 != arg0 && var3.field766 == var3.field739) {
                    var3.field34 = true;
                }
                int var5 = var3.field780 >> 7;
                int var6 = var3.field761 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field39 == null || field269 < var3.field31 || field269 >= var3.field42) {
                        if ((var3.field780 & 0x7F) == 64 && (var3.field761 & 0x7F) == 64) {
                            if (field423 == field382[var5][var6]) {
                                continue;
                            }
                            field382[var5][var6] = field423;
                        }
                        var3.field33 = method584(var3.field780, var3.field761, Statics.field1);
                        Statics.field2085.method1586(Statics.field1, var3.field780, var3.field761, var3.field33, 60, var3, var3.field792, var4, var3.field796);
                    } else {
                        var3.field34 = false;
                        var3.field33 = method584(var3.field780, var3.field761, Statics.field1);
                        Statics.field2085.method1589(Statics.field1, var3.field780, var3.field761, var3.field33, 60, var3, var3.field792, var4, var3.field40, var3.field28, var3.field27, var3.field43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.ax(B)I")
    public static final int method475() {
        if (Statics.field1459.field140) {
            return Statics.field1;
        }
        int var0 = 3;
        if (Statics.field161 < 310) {
            int var1 = Statics.field721 >> 7;
            int var2 = Statics.field849 >> 7;
            int var3 = Statics.field1767.field780 >> 7;
            int var4 = Statics.field1767.field761 >> 7;
            if ((class6.field76[Statics.field1][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1;
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
                    if ((class6.field76[Statics.field1][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field76[Statics.field1][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1;
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
                    if ((class6.field76[Statics.field1][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field76[Statics.field1][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1;
                        }
                    }
                }
            }
        }
        if ((class6.field76[Statics.field1][Statics.field1767.field780 >> 7][Statics.field1767.field761 >> 7] & 0x4) != 0) {
            var0 = Statics.field1;
        }
        return var0;
    }

    @ObfuscatedName("gb.au(IIB)V")
    public static final void method3317(int arg0, int arg1) {
        if (field277 == 2) {
            method2541((field280 - Statics.field1870 << 7) + field261, (field477 - Statics.field47 << 7) + field455, field256 * 2);
            if (field381 > -1 && field269 % 20 < 10) {
                Statics.field649[0].method1453(field381 + arg0 - 12, field361 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("z.az(Laa;IIIIII)V")
    public static final void method460(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field705;
            if (var6.field835 != null) {
                var6 = var6.method596();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field419) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field46) {
                return;
            }
            if (var8.field29 != -1 || var8.field30 != -1) {
                method2374(arg0, arg0.field787 + 15);
                if (field381 > -1) {
                    if (var8.field29 != -1) {
                        Statics.field1081[var8.field29].method1453(field381 + arg2 - 12, field361 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field30 != -1) {
                        Statics.field801[var8.field30].method1453(field381 + arg2 - 12, field361 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field277 == 10 && field392 == field377[arg1]) {
                method2374(arg0, arg0.field787 + 15);
                if (field381 > -1) {
                    Statics.field649[1].method1453(field381 + arg2 - 12, field361 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field705;
            if (var9.field835 != null) {
                var9 = var9.method596();
            }
            if (var9.field833 >= 0 && var9.field833 < Statics.field801.length) {
                method2374(arg0, arg0.field787 + 15);
                if (field381 > -1) {
                    Statics.field801[var9.field833].method1453(field381 + arg2 - 12, field361 + arg3 - 30);
                }
            }
            if (field277 == 1 && field496 == field486[arg1 - field419] && field269 % 20 < 10) {
                method2374(arg0, arg0.field787 + 15);
                if (field381 > -1) {
                    Statics.field649[0].method1453(field381 + arg2 - 12, field361 + arg3 - 28);
                }
            }
        }
        if (arg0.field751 != null && (arg1 >= field419 || !arg0.field754 && (field288 == 4 || !arg0.field743 && (field288 == 0 || field288 == 3 || field288 == 1 && method2454(((class3) arg0).field45, false))))) {
            method2374(arg0, arg0.field787);
            if (field381 > -1 && field456 < field482) {
                field353[field456] = Statics.field1817.method3337(arg0.field751) / 2;
                field352[field456] = Statics.field1817.field2930;
                field350[field456] = field381;
                field351[field456] = field361;
                field340[field456] = arg0.field755;
                field326[field456] = arg0.field756;
                field510[field456] = arg0.field788;
                field357[field456] = arg0.field751;
                field456++;
            }
        }
        if (arg0.field760 > field269) {
            method2374(arg0, arg0.field787 + 15);
            if (field381 > -1) {
                int var10;
                if (arg1 < field419) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field705;
                    var10 = var11.field841;
                }
                int var12 = arg0.field776 * var10 / arg0.field744;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field776 > 0) {
                    var12 = 1;
                }
                class73.method1492(field381 + arg2 - var10 / 2, field361 + arg3 - 3, var12, 5, 65280);
                class73.method1492(field381 + arg2 - var10 / 2 + var12, field361 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field759[var13] > field269) {
                method2374(arg0, arg0.field787 / 2);
                if (field381 > -1) {
                    if (var13 == 1) {
                        field361 -= 20;
                    }
                    if (var13 == 2) {
                        field381 -= 15;
                        field361 -= 10;
                    }
                    if (var13 == 3) {
                        field381 += 15;
                        field361 -= 10;
                    }
                    Statics.field1527[arg0.field778[var13]].method1453(field381 + arg2 - 12, field361 + arg3 - 12);
                    Statics.field719.method3393(Integer.toString(arg0.field757[var13]), field381 + arg2 - 1, field361 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ei.aw(I)V")
    public static final void method2680() {
        field374 = 0;
        int var0 = (Statics.field1767.field780 >> 7) + Statics.field1870;
        int var1 = (Statics.field1767.field761 >> 7) + Statics.field47;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field374 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field374 = 1;
        }
        if (field374 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field374 = 0;
        }
    }

    @ObfuscatedName("da.ag(Laa;II)V")
    public static final void method2374(class33 arg0, int arg1) {
        method2541(arg0.field780, arg0.field761, arg1);
    }

    @ObfuscatedName("di.ao(IIIB)V")
    public static final void method2541(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field381 = -1;
            field361 = -1;
            return;
        }
        int var3 = method584(arg0, arg1, Statics.field1) - arg2;
        int var4 = arg0 - Statics.field721;
        int var5 = var3 - Statics.field13;
        int var6 = arg1 - Statics.field849;
        int var7 = class84.field1491[Statics.field161];
        int var8 = class84.field1492[Statics.field161];
        int var9 = class84.field1491[Statics.field1863];
        int var10 = class84.field1492[Statics.field1863];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field381 = (var11 << 9) / var15 + 256;
            field361 = (var14 << 9) / var15 + 167;
        } else {
            field381 = -1;
            field361 = -1;
        }
    }

    @ObfuscatedName("am.aq(IIII)I")
    public static final int method584(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field76[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field82[var5][var3][var4] + class6.field82[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field82[var5][var3][var4 + 1] + class6.field82[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ay.ak(IIIIIII)V")
    public static final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1491[var6];
            int var12 = class84.field1492[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1491[var7];
            int var15 = class84.field1492[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field721 = arg0 - var8;
        Statics.field13 = arg1 - var9;
        Statics.field849 = arg2 - var10;
        Statics.field161 = arg3;
        Statics.field1863 = arg4;
    }

    @ObfuscatedName("cp.al(ZB)V")
    public static final void method1854(boolean arg0) {
        field365 = arg0;
        if (!field365) {
            int var1 = (field301 - field300.field1844) / 16;
            Statics.field192 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field192[var2][var3] = field300.method2077();
                }
            }
            int var4 = field300.method2124();
            int var5 = field300.method2125();
            int var6 = field300.method2125();
            int var7 = field300.method2123();
            int var8 = field300.method2173();
            Statics.field957 = new int[var1];
            Statics.field136 = new int[var1];
            Statics.field635 = new int[var1];
            Statics.field232 = new byte[var1][];
            Statics.field706 = new byte[var1][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var4 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var4 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field957[var10] = var13;
                        Statics.field136[var10] = Statics.field1056.method2699("m" + var11 + "_" + var12);
                        Statics.field635[var10] = Statics.field1056.method2699("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method26(var5, var4, var8, var6, var7);
            return;
        }
        int var14 = field300.method2118();
        int var15 = field300.method2124();
        field300.method2347();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field300.method2360(1);
                    if (var19 == 1) {
                        field318[var16][var17][var18] = field300.method2360(26);
                    } else {
                        field318[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field300.method2338();
        int var20 = (field301 - field300.field1844) / 16;
        Statics.field192 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field192[var21][var22] = field300.method2077();
            }
        }
        int var23 = field300.method2094();
        int var24 = field300.method2094();
        int var25 = field300.method2094();
        Statics.field957 = new int[var20];
        Statics.field136 = new int[var20];
        Statics.field635 = new int[var20];
        Statics.field232 = new byte[var20][];
        Statics.field706 = new byte[var20][];
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
                            if (Statics.field957[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field957[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field136[var26] = Statics.field1056.method2699("m" + var35 + "_" + var36);
                            Statics.field635[var26] = Statics.field1056.method2699("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method26(var23, var15, var14, var25, var24);
    }

    @ObfuscatedName("k.at(IIIIIB)V")
    public static final void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field709 == arg0 && Statics.field526 == arg1 && field310 == arg2 || !field265) {
            return;
        }
        Statics.field709 = arg0;
        Statics.field526 = arg1;
        field310 = arg2;
        if (!field265) {
            field310 = 0;
        }
        method2382(25);
        method2329(class143.field2179, true);
        int var5 = Statics.field1870;
        int var6 = Statics.field47;
        Statics.field1870 = (arg0 - 6) * 8;
        Statics.field47 = (arg1 - 6) * 8;
        int var7 = Statics.field1870 - var5;
        int var8 = Statics.field47 - var6;
        int var9 = Statics.field1870;
        int var10 = Statics.field47;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field295[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field783[var13] -= var7;
                    var12.field793[var13] -= var8;
                }
                var12.field780 -= var7 * 128;
                var12.field761 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field297[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field783[var16] -= var7;
                    var15.field793[var16] -= var8;
                }
                var15.field780 -= var7 * 128;
                var15.field761 -= var8 * 128;
            }
        }
        Statics.field1 = arg2;
        Statics.field1767.method567(arg3, arg4, false);
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
                        field390[var27][var23][var24] = field390[var27][var25][var26];
                    } else {
                        field390[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field391.method3200(); var28 != null; var28 = (class15) field391.method3209()) {
            var28.field224 -= var7;
            var28.field217 -= var8;
            if (var28.field224 < 0 || var28.field217 < 0 || var28.field224 >= 104 || var28.field217 >= 104) {
                var28.method3304();
            }
        }
        if (field415 != 0) {
            field415 -= var7;
            field430 -= var8;
        }
        field454 = 0;
        field501 = false;
        field493 = -1;
        field443.method3201();
        field296.method3201();
    }

    @ObfuscatedName("z.an(ZI)V")
    public static final void method459(boolean arg0) {
        method752();
        field492++;
        if (field492 < 50 && !arg0) {
            return;
        }
        field492 = 0;
        if (field348 || Statics.field2147 == null) {
            return;
        }
        field298.method2335(126);
        try {
            Statics.field2147.method2568(field298.field1843, 0, field298.field1844);
            field298.field1844 = 0;
        } catch (IOException var2) {
            field348 = true;
        }
    }

    @ObfuscatedName("ab.ab(IIIIIB)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2085.method1610(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2085.method1604(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field535.field1315;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method1847(var12);
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
                class74 var14 = Statics.field619[var13.field877];
                if (var14 != null) {
                    int var15 = (var13.field868 * 4 - var14.field1327) / 2;
                    int var16 = (var13.field862 * 4 - var14.field1325) / 2;
                    var14.method1547(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field862) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2085.method1597(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2085.method1604(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method1847(var21);
            if (var22.field877 != -1) {
                class74 var23 = Statics.field619[var22.field877];
                if (var23 != null) {
                    int var24 = (var22.field868 * 4 - var23.field1327) / 2;
                    int var25 = (var22.field862 * 4 - var23.field1325) / 2;
                    var23.method1547(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field862) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field535.field1315;
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
        int var29 = Statics.field2085.method1606(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method1847(var30);
        if (var31.field877 == -1) {
            return;
        }
        class74 var32 = Statics.field619[var31.field877];
        if (var32 != null) {
            int var33 = (var31.field868 * 4 - var32.field1327) / 2;
            int var34 = (var31.field862 * 4 - var32.field1325) / 2;
            var32.method1547(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field862) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ac.ad(I)Z")
    public static final boolean method545() {
        if (Statics.field2147 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2147.method2551();
            if (var0 == 0) {
                return false;
            }
            if (field302 == -1) {
                Statics.field2147.method2557(field300.field1843, 0, 1);
                field300.field1844 = 0;
                field302 = field300.method2336();
                field301 = class167.field2826[field302];
                var0--;
            }
            if (field301 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2147.method2557(field300.field1843, 0, 1);
                field301 = field300.field1843[0] & 0xFF;
                var0--;
            }
            if (field301 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2147.method2557(field300.field1843, 0, 2);
                field300.field1844 = 0;
                field301 = field300.method2094();
                var0 -= 2;
            }
            if (var0 < field301) {
                return false;
            }
            field300.field1844 = 0;
            Statics.field2147.method2557(field300.field1843, 0, field301);
            field303 = 0;
            field422 = field307;
            field307 = field306;
            field306 = field302;
            if (field302 == 165) {
                method38();
                int var1 = field300.method2092();
                int var2 = field300.method2133();
                int var3 = field300.method2173();
                field516[var3] = var2;
                field394[var3] = var1;
                field395[var3] = 1;
                for (int var4 = 0; var4 < 98; var4++) {
                    if (var2 >= class141.field2149[var4]) {
                        field395[var3] = var4 + 2;
                    }
                }
                field446[++field447 - 1 & 0x1F] = var3;
                field302 = -1;
                return true;
            }
            if (field302 == 107) {
                method1854(false);
                field302 = -1;
                return true;
            }
            if (field302 == 86) {
                Statics.field250 = field300.method2118();
                Statics.field1257 = field300.method2092();
                field302 = -1;
                return true;
            }
            if (field302 == 110) {
                int var5 = field300.method2124();
                int var6 = field300.method2133();
                class153 var7 = class153.method1565(var6);
                if (var7 != null && var7.field2558 == 0) {
                    if (var5 > var7.field2639 - var7.field2603) {
                        var5 = var7.field2639 - var7.field2603;
                    }
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7.field2659 != var5) {
                        var7.field2659 = var5;
                        method1830(var7);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 13 || field302 == 167 || field302 == 189 || field302 == 109 || field302 == 19 || field302 == 2 || field302 == 48 || field302 == 76 || field302 == 124 || field302 == 219) {
                method2402();
                field302 = -1;
                return true;
            }
            if (field302 == 75) {
                field300.field1844 += 28;
                if (field300.method2278()) {
                    class136.method474(field300, field300.field1844 - 28);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 67) {
                int var8 = field300.method2112();
                int var9 = field300.method2124();
                class155.field2683[var9] = var8;
                if (class155.field2684[var9] != var8) {
                    class155.field2684[var9] = var8;
                    method2408(var9);
                }
                field442[++field414 - 1 & 0x1F] = var9;
                field302 = -1;
                return true;
            }
            if (field302 == 137) {
                int var10 = field300.method2125();
                field417 = var10;
                method108(var10);
                class32.method1740(field417);
                for (int var11 = 0; var11 < 100; var11++) {
                    field461[var11] = true;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 240) {
                field450 = field506;
                if (field301 == 0) {
                    field480 = null;
                    field481 = null;
                    Statics.field1354 = 0;
                    Statics.field175 = null;
                    field302 = -1;
                    return true;
                }
                field481 = field300.method2251();
                long var12 = field300.method2098();
                field480 = class199.method1946(var12);
                Statics.field174 = field300.method2117();
                int var14 = field300.method2092();
                if (var14 == 255) {
                    field302 = -1;
                    return true;
                }
                Statics.field1354 = var14;
                class21[] var15 = new class21[100];
                for (int var16 = 0; var16 < Statics.field1354; var16++) {
                    var15[var16] = new class21();
                    var15[var16].field565 = field300.method2251();
                    var15[var16].field561 = class201.method2517(var15[var16].field565, Statics.field274);
                    var15[var16].field567 = field300.method2094();
                    var15[var16].field563 = field300.method2117();
                    field300.method2251();
                    if (var15[var16].field565.equals(Statics.field1767.field45)) {
                        Statics.field1820 = var15[var16].field563;
                    }
                }
                boolean var17 = false;
                int var18 = Statics.field1354;
                while (var18 > 0) {
                    boolean var19 = true;
                    var18--;
                    for (int var20 = 0; var20 < var18; var20++) {
                        if (var15[var20].field561.compareTo(var15[var20 + 1].field561) > 0) {
                            class21 var21 = var15[var20];
                            var15[var20] = var15[var20 + 1];
                            var15[var20 + 1] = var21;
                            var19 = false;
                        }
                    }
                    if (var19) {
                        break;
                    }
                }
                Statics.field175 = var15;
                field302 = -1;
                return true;
            }
            if (field302 == 16) {
                method38();
                field272 = field300.method2092();
                field451 = field506;
                field302 = -1;
                return true;
            }
            if (field302 == 201) {
                class110 var22 = field300;
                int var23 = field301;
                class189 var24 = new class189();
                var24.field2891 = var22.method2092();
                var24.field2893 = var22.method2112();
                var24.field2888 = new int[var24.field2891];
                var24.field2890 = new int[var24.field2891];
                var24.field2892 = new Field[var24.field2891];
                var24.field2894 = new int[var24.field2891];
                var24.field2889 = new Method[var24.field2891];
                var24.field2895 = new byte[var24.field2891][][];
                for (int var25 = 0; var25 < var24.field2891; var25++) {
                    try {
                        int var26 = var22.method2092();
                        if (var26 == 0 || var26 == 1 || var26 == 2) {
                            String var27 = var22.method2251();
                            String var28 = var22.method2251();
                            int var29 = 0;
                            if (var26 == 1) {
                                var29 = var22.method2112();
                            }
                            var24.field2888[var25] = var26;
                            var24.field2894[var25] = var29;
                            if (Statics.method1382(var27).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var24.field2892[var25] = Statics.method1382(var27).getDeclaredField(var28);
                        } else if (var26 == 3 || var26 == 4) {
                            String var30 = var22.method2251();
                            String var31 = var22.method2251();
                            int var32 = var22.method2092();
                            String[] var33 = new String[var32];
                            for (int var34 = 0; var34 < var32; var34++) {
                                var33[var34] = var22.method2251();
                            }
                            String var35 = var22.method2251();
                            byte[][] var36 = new byte[var32][];
                            if (var26 == 3) {
                                for (int var37 = 0; var37 < var32; var37++) {
                                    int var38 = var22.method2112();
                                    var36[var37] = new byte[var38];
                                    var22.method2283(var36[var37], 0, var38);
                                }
                            }
                            var24.field2888[var25] = var26;
                            Class[] var39 = new Class[var32];
                            for (int var40 = 0; var40 < var32; var40++) {
                                var39[var40] = Statics.method1382(var33[var40]);
                            }
                            Class var41 = Statics.method1382(var35);
                            if (Statics.method1382(var30).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var42 = Statics.method1382(var30).getDeclaredMethods();
                            Method[] var43 = var42;
                            for (int var44 = 0; var44 < var43.length; var44++) {
                                Method var45 = var43[var44];
                                if (var45.getName().equals(var31)) {
                                    Class[] var46 = var45.getParameterTypes();
                                    if (var39.length == var46.length) {
                                        boolean var47 = true;
                                        for (int var48 = 0; var48 < var39.length; var48++) {
                                            if (var39[var48] != var46[var48]) {
                                                var47 = false;
                                                break;
                                            }
                                        }
                                        if (var47 && var41 == var45.getReturnType()) {
                                            var24.field2889[var25] = var45;
                                        }
                                    }
                                }
                            }
                            var24.field2895[var25] = var36;
                        }
                    } catch (ClassNotFoundException var349) {
                        var24.field2890[var25] = -1;
                    } catch (SecurityException var350) {
                        var24.field2890[var25] = -2;
                    } catch (NullPointerException var351) {
                        var24.field2890[var25] = -3;
                    } catch (Exception var352) {
                        var24.field2890[var25] = -4;
                    } catch (Throwable var353) {
                        var24.field2890[var25] = -5;
                    }
                }
                class190.field2896.method3248(var24);
                field302 = -1;
                return true;
            }
            if (field302 == 203) {
                field501 = true;
                Statics.field1250 = field300.method2092();
                Statics.field255 = field300.method2092();
                Statics.field51 = field300.method2094();
                Statics.field703 = field300.method2092();
                Statics.field157 = field300.method2092();
                if (Statics.field157 >= 100) {
                    Statics.field721 = Statics.field1250 * 128 + 64;
                    Statics.field849 = Statics.field255 * 128 + 64;
                    Statics.field13 = method584(Statics.field721, Statics.field849, Statics.field1) - Statics.field51;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 8) {
                field276 = field300.method2123() * 30;
                field451 = field506;
                field302 = -1;
                return true;
            }
            if (field302 == 80) {
                field501 = true;
                Statics.field49 = field300.method2092();
                Statics.field518 = field300.method2092();
                Statics.field1266 = field300.method2094();
                Statics.field1435 = field300.method2092();
                Statics.field1117 = field300.method2092();
                if (Statics.field1117 >= 100) {
                    int var54 = Statics.field49 * 128 + 64;
                    int var55 = Statics.field518 * 128 + 64;
                    int var56 = method584(var54, var55, Statics.field1) - Statics.field1266;
                    int var57 = var54 - Statics.field721;
                    int var58 = var56 - Statics.field13;
                    int var59 = var55 - Statics.field849;
                    int var60 = (int) Math.sqrt((double) (var57 * var57 + var59 * var59));
                    Statics.field161 = (int) (Math.atan2((double) var58, (double) var60) * 325.949D) & 0x7FF;
                    Statics.field1863 = (int) (Math.atan2((double) var57, (double) var59) * -325.949D) & 0x7FF;
                    if (Statics.field161 < 128) {
                        Statics.field161 = 128;
                    }
                    if (Statics.field161 > 383) {
                        Statics.field161 = 383;
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 98) {
                if (field417 != -1) {
                    int var61 = field417;
                    if (class153.method2498(var61)) {
                        Statics.method103(Statics.field2556[var61], 0);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 54) {
                int var62 = field300.method2112();
                int var63 = field300.method2094();
                if (var62 < -70000) {
                    var63 += 32768;
                }
                class153 var64;
                if (var62 >= 0) {
                    var64 = class153.method1565(var62);
                } else {
                    var64 = null;
                }
                while (field300.field1844 < field301) {
                    int var65 = field300.method2105();
                    int var66 = field300.method2094();
                    int var67 = 0;
                    if (var66 != 0) {
                        var67 = field300.method2092();
                        if (var67 == 255) {
                            var67 = field300.method2112();
                        }
                    }
                    if (var64 != null && var65 >= 0 && var65 < var64.field2658.length) {
                        var64.field2658[var65] = var66;
                        var64.field2596[var65] = var67;
                    }
                    class14.method1389(var63, var65, var66 - 1, var67);
                }
                if (var64 != null) {
                    method1830(var64);
                }
                method38();
                field354[++field445 - 1 & 0x1F] = var63 & 0x7FFF;
                field302 = -1;
                return true;
            }
            if (field302 == 55) {
                int var68 = field300.method2133();
                int var69 = field300.method2207();
                class153 var70 = class153.method1565(var68);
                if (var70.field2592 != var69 || var69 == -1) {
                    var70.field2592 = var69;
                    var70.field2626 = 0;
                    var70.field2663 = 0;
                    method1830(var70);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 91) {
                int var71 = field300.method2112();
                Statics.field1278 = Statics.field1064.method2472(var71);
                field302 = -1;
                return true;
            }
            if (field302 == 185) {
                Statics.field250 = field300.method2173();
                Statics.field1257 = field300.method2092();
                while (field300.field1844 < field301) {
                    field302 = field300.method2092();
                    method2402();
                }
                field302 = -1;
                return true;
            }
            if (field302 == 114) {
                String var72 = field300.method2251();
                int var73 = field300.method2133();
                class153 var74 = class153.method1565(var73);
                if (!var72.equals(var74.field2620)) {
                    var74.field2620 = var72;
                    method1830(var74);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 250) {
                int var75 = field300.method2133();
                int var76 = field300.method2127();
                int var77 = field300.method2207();
                class153 var78 = class153.method1565(var75);
                int var79 = var78.field2563 + var76;
                int var80 = var78.field2564 + var77;
                if (var78.field2581 != var79 || var78.field2562 != var80) {
                    var78.field2581 = var79;
                    var78.field2562 = var80;
                    method1830(var78);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 64) {
                int var81 = field300.method2125();
                int var82 = field300.method2077();
                int var83 = field300.method2125();
                class153 var84 = class153.method1565(var82);
                var84.field2651 = (var81 << 16) + var83;
                field302 = -1;
                return true;
            }
            if (field302 == 210) {
                int var85 = field300.method2173();
                String var86 = field300.method2251();
                int var87 = field300.method2118();
                if (var87 >= 1 && var87 <= 8) {
                    if (var86.equalsIgnoreCase("null")) {
                        var86 = null;
                    }
                    field386[var87 - 1] = var86;
                    field387[var87 - 1] = var85 == 0;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 159) {
                for (int var88 = 0; var88 < Statics.field1065; var88++) {
                    class46 var89 = class46.method101(var88);
                    if (var89 != null) {
                        class155.field2683[var88] = 0;
                        class155.field2684[var88] = 0;
                    }
                }
                method38();
                field414 += 32;
                field302 = -1;
                return true;
            }
            if (field302 == 101) {
                while (field300.field1844 < field301) {
                    boolean var90 = field300.method2092() == 1;
                    String var91 = field300.method2251();
                    String var92 = field300.method2251();
                    int var93 = field300.method2094();
                    int var94 = field300.method2092();
                    int var95 = field300.method2092();
                    boolean var96 = (var95 & 0x2) != 0;
                    boolean var97 = (var95 & 0x1) != 0;
                    if (var93 > 0) {
                        field300.method2251();
                        field300.method2092();
                        field300.method2112();
                    }
                    field300.method2251();
                    for (int var98 = 0; var98 < field507; var98++) {
                        class16 var99 = field509[var98];
                        if (var90) {
                            if (var92.equals(var99.field236)) {
                                var99.field236 = var91;
                                var99.field237 = var92;
                                var91 = null;
                                break;
                            }
                        } else if (var91.equals(var99.field236)) {
                            if (var99.field231 != var93) {
                                boolean var100 = true;
                                for (class34 var101 = (class34) field505.method3163(); var101 != null; var101 = (class34) field505.method3169()) {
                                    if (var101.field798.equals(var91)) {
                                        if (var93 != 0 && var101.field799 == 0) {
                                            var101.method3296();
                                            var100 = false;
                                        } else if (var93 == 0 && var101.field799 != 0) {
                                            var101.method3296();
                                            var100 = false;
                                        }
                                    }
                                }
                                if (var100) {
                                    field505.method3162(new class34(var91, var93));
                                }
                                var99.field231 = var93;
                            }
                            var99.field237 = var92;
                            var99.field234 = var94;
                            var99.field233 = var96;
                            var99.field230 = var97;
                            var91 = null;
                            break;
                        }
                    }
                    if (var91 != null && field507 < 400) {
                        class16 var102 = new class16();
                        field509[field507] = var102;
                        var102.field236 = var91;
                        var102.field237 = var92;
                        var102.field231 = var93;
                        var102.field234 = var94;
                        var102.field233 = var96;
                        var102.field230 = var97;
                        field507++;
                    }
                }
                field375 = 2;
                field449 = field506;
                boolean var103 = false;
                int var104 = field507;
                while (var104 > 0) {
                    boolean var105 = true;
                    var104--;
                    for (int var106 = 0; var106 < var104; var106++) {
                        boolean var107 = false;
                        class16 var108 = field509[var106];
                        class16 var109 = field509[var106 + 1];
                        if (field258 != var108.field231 && field258 == var109.field231) {
                            var107 = true;
                        }
                        if (!var107 && var108.field231 == 0 && var109.field231 != 0) {
                            var107 = true;
                        }
                        if (!var107 && !var108.field233 && var109.field233) {
                            var107 = true;
                        }
                        if (!var107 && !var108.field230 && var109.field230) {
                            var107 = true;
                        }
                        if (var107) {
                            class16 var110 = field509[var106];
                            field509[var106] = field509[var106 + 1];
                            field509[var106 + 1] = var110;
                            var105 = false;
                        }
                    }
                    if (var105) {
                        break;
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 141) {
                int var111 = field300.method2094();
                int var112 = field300.method2092();
                int var113 = field300.method2094();
                method31(var111, var112, var113);
                field302 = -1;
                return true;
            }
            if (field302 == 116) {
                int var114 = field300.method2077();
                class153 var115 = class153.method1565(var114);
                for (int var116 = 0; var116 < var115.field2658.length; var116++) {
                    var115.field2658[var116] = -1;
                    var115.field2658[var116] = 0;
                }
                method1830(var115);
                field302 = -1;
                return true;
            }
            if (field302 == 195) {
                int var117 = field300.method2125();
                if (var117 == 65535) {
                    var117 = -1;
                }
                int var118 = field300.method2133();
                int var119 = field300.method2135();
                int var120 = field300.method2124();
                if (var120 == 65535) {
                    var120 = -1;
                }
                for (int var121 = var120; var121 <= var117; var121++) {
                    long var122 = ((long) var119 << 32) + (long) var121;
                    class187 var124 = field458.method3174(var122);
                    if (var124 != null) {
                        var124.method3304();
                    }
                    field458.method3177(new class180(var118), var122);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 120) {
                while (field300.field1844 < field301) {
                    int var125 = field300.method2092();
                    boolean var126 = (var125 & 0x1) == 1;
                    String var127 = field300.method2251();
                    String var128 = field300.method2251();
                    field300.method2251();
                    for (int var129 = 0; var129 < field457; var129++) {
                        class8 var130 = field512[var129];
                        if (var126) {
                            if (var128.equals(var130.field129)) {
                                var130.field129 = var127;
                                var130.field128 = var128;
                                var127 = null;
                                break;
                            }
                        } else if (var127.equals(var130.field129)) {
                            var130.field129 = var127;
                            var130.field128 = var128;
                            var127 = null;
                            break;
                        }
                    }
                    if (var127 != null && field457 < 400) {
                        class8 var131 = new class8();
                        field512[field457] = var131;
                        var131.field129 = var127;
                        var131.field128 = var128;
                        field457++;
                    }
                }
                field449 = field506;
                field302 = -1;
                return true;
            }
            if (field302 == 153) {
                for (int var132 = 0; var132 < field297.length; var132++) {
                    if (field297[var132] != null) {
                        field297[var132].field762 = -1;
                    }
                }
                for (int var133 = 0; var133 < field295.length; var133++) {
                    if (field295[var133] != null) {
                        field295[var133].field762 = -1;
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 243) {
                int var134 = field300.method2077();
                boolean var135 = field300.method2173() == 1;
                class153 var136 = class153.method1565(var134);
                if (var136.field2568 != var135) {
                    var136.field2568 = var135;
                    method1830(var136);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 63) {
                class22 var137 = new class22();
                var137.field576 = field300.method2251();
                var137.field578 = field300.method2094();
                int var138 = field300.method2112();
                var137.field574 = var138;
                method2382(45);
                Statics.field2147.method2553();
                Statics.field2147 = null;
                class28.method548(var137);
                field302 = -1;
                return false;
            }
            if (field302 == 87) {
                field375 = 1;
                field449 = field506;
                field302 = -1;
                return true;
            }
            if (field302 == 79) {
                int var139 = field300.method2092();
                int var140 = field300.method2116();
                int var141 = field300.method2116();
                Statics.field1 = var140 >> 1;
                Statics.field1767.method567(var141, var139, (var140 & 0x1) == 1);
                field302 = -1;
                return true;
            }
            if (field302 == 193) {
                int var142 = field300.method2092();
                int var143 = field300.method2092();
                int var144 = field300.method2092();
                int var145 = field300.method2092();
                field487[var142] = true;
                field372[var142] = var143;
                field289[var142] = var144;
                field263[var142] = var145;
                field332[var142] = 0;
                field302 = -1;
                return true;
            }
            if (field302 == 74) {
                String var146 = field300.method2251();
                int var147 = field300.method2094();
                byte var148 = field300.method2117();
                boolean var149 = false;
                if (var148 == -128) {
                    var149 = true;
                }
                if (var149) {
                    if (Statics.field1354 == 0) {
                        field302 = -1;
                        return true;
                    }
                    boolean var150 = false;
                    int var151;
                    for (var151 = 0; var151 < Statics.field1354 && (!Statics.field175[var151].field565.equals(var146) || Statics.field175[var151].field567 != var147); var151++) {
                    }
                    if (var151 < Statics.field1354) {
                        while (var151 < Statics.field1354 - 1) {
                            Statics.field175[var151] = Statics.field175[var151 + 1];
                            var151++;
                        }
                        Statics.field1354--;
                        Statics.field175[Statics.field1354] = null;
                    }
                } else {
                    field300.method2251();
                    class21 var152 = new class21();
                    var152.field565 = var146;
                    var152.field561 = class201.method2517(var152.field565, Statics.field274);
                    var152.field567 = var147;
                    var152.field563 = var148;
                    int var153;
                    for (var153 = Statics.field1354 - 1; var153 >= 0; var153--) {
                        int var154 = Statics.field175[var153].field561.compareTo(var152.field561);
                        if (var154 == 0) {
                            Statics.field175[var153].field567 = var147;
                            Statics.field175[var153].field563 = var148;
                            if (var146.equals(Statics.field1767.field45)) {
                                Statics.field1820 = var148;
                            }
                            field450 = field506;
                            field302 = -1;
                            return true;
                        }
                        if (var154 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1354 >= Statics.field175.length) {
                        field302 = -1;
                        return true;
                    }
                    for (int var155 = Statics.field1354 - 1; var155 > var153; var155--) {
                        Statics.field175[var155 + 1] = Statics.field175[var155];
                    }
                    if (Statics.field1354 == 0) {
                        Statics.field175 = new class21[100];
                    }
                    Statics.field175[var153 + 1] = var152;
                    Statics.field1354++;
                    if (var146.equals(Statics.field1767.field45)) {
                        Statics.field1820 = var148;
                    }
                }
                field450 = field506;
                field302 = -1;
                return true;
            }
            if (field302 == 150) {
                field383 = 0;
                field378 = 0;
                method102();
                int var156 = field300.method2360(8);
                if (var156 < field419) {
                    for (int var157 = var156; var157 < field419; var157++) {
                        field327[++field383 - 1] = field377[var157];
                    }
                }
                if (var156 > field419) {
                    throw new RuntimeException("");
                }
                field419 = 0;
                for (int var158 = 0; var158 < var156; var158++) {
                    int var159 = field377[var158];
                    class3 var160 = field297[var159];
                    int var161 = field300.method2360(1);
                    if (var161 == 0) {
                        field377[++field419 - 1] = var159;
                        var160.field758 = field269;
                    } else {
                        int var162 = field300.method2360(2);
                        if (var162 == 0) {
                            field377[++field419 - 1] = var159;
                            var160.field758 = field269;
                            field379[++field378 - 1] = var159;
                        } else if (var162 == 1) {
                            field377[++field419 - 1] = var159;
                            var160.field758 = field269;
                            int var163 = field300.method2360(3);
                            var160.method573(var163, false);
                            int var164 = field300.method2360(1);
                            if (var164 == 1) {
                                field379[++field378 - 1] = var159;
                            }
                        } else if (var162 == 2) {
                            field377[++field419 - 1] = var159;
                            var160.field758 = field269;
                            int var165 = field300.method2360(3);
                            var160.method573(var165, true);
                            int var166 = field300.method2360(3);
                            var160.method573(var166, true);
                            int var167 = field300.method2360(1);
                            if (var167 == 1) {
                                field379[++field378 - 1] = var159;
                            }
                        } else if (var162 == 3) {
                            field327[++field383 - 1] = var159;
                        }
                    }
                }
                method1831();
                for (int var168 = 0; var168 < field378; var168++) {
                    int var169 = field379[var168];
                    class3 var170 = field297[var169];
                    int var171 = field300.method2092();
                    if ((var171 & 0x40) != 0) {
                        var171 += field300.method2092() << 8;
                    }
                    if ((var171 & 0x80) != 0) {
                        int var172 = field300.method2094();
                        if (var172 == 65535) {
                            var172 = -1;
                        }
                        int var173 = field300.method2092();
                        method2455(var170, var172, var173);
                    }
                    if ((var171 & 0x200) != 0) {
                        int var174 = field300.method2094();
                        int var175 = field300.method2173();
                        var170.method581(var174, var175, field269);
                        var170.field760 = field269 + 300;
                        var170.field776 = field300.method2116();
                        var170.field744 = field300.method2118();
                    }
                    if ((var171 & 0x4) != 0) {
                        var170.field764 = field300.method2094();
                        var170.field765 = field300.method2094();
                    }
                    if ((var171 & 0x20) != 0) {
                        int var176 = field300.method2118();
                        byte[] var177 = new byte[var176];
                        class107 var178 = new class107(var177);
                        field300.method2136(var177, 0, var176);
                        field380[var169] = var178;
                        var170.method13(var178);
                    }
                    if ((var171 & 0x10) != 0) {
                        var170.field784 = field300.method2125();
                        if (var170.field784 == 65535) {
                            var170.field784 = -1;
                        }
                    }
                    if ((var171 & 0x1) != 0) {
                        int var179 = field300.method2124();
                        class138 var180 = (class138) class99.method1947(class138.method2462(), field300.method2116());
                        boolean var181 = field300.method2092() == 1;
                        int var182 = field300.method2118();
                        int var183 = field300.field1844;
                        if (var170.field45 != null && var170.field35 != null) {
                            boolean var184 = false;
                            if (var180.field2120 && method1379(var170.field45)) {
                                var184 = true;
                            }
                            if (!var184 && field374 == 0 && !var170.field46) {
                                field285.field1844 = 0;
                                field300.method2136(field285.field1843, 0, var182);
                                field285.field1844 = 0;
                                class107 var185 = field285;
                                String var186 = class192.method1849(var185, 32767);
                                String var187 = class193.method3334(class200.method509(var186));
                                var170.field751 = var187.trim();
                                var170.field755 = var179 >> 8;
                                var170.field756 = var179 & 0xFF;
                                var170.field788 = 150;
                                var170.field743 = var181;
                                var170.field754 = Statics.field1767 != var170 && var180.field2120 && field472 != "" && var187.toLowerCase().indexOf(field472) == -1;
                                int var188;
                                if (var180.field2110) {
                                    var188 = var181 ? 91 : 1;
                                } else {
                                    var188 = var181 ? 90 : 2;
                                }
                                if (var180.field2116 == -1) {
                                    class10.method469(var188, var170.field45, var187);
                                } else {
                                    int var190 = var180.field2116;
                                    String var191 = "<img=" + var190 + ">";
                                    class10.method469(var188, var191 + var170.field45, var187);
                                }
                            }
                        }
                        field300.field1844 = var182 + var183;
                    }
                    if ((var171 & 0x8) != 0) {
                        var170.field751 = field300.method2251();
                        if (var170.field751.charAt(0) == '~') {
                            var170.field751 = var170.field751.substring(1);
                            class10.method469(2, var170.field45, var170.field751);
                        } else if (Statics.field1767 == var170) {
                            class10.method469(2, var170.field45, var170.field751);
                        }
                        var170.field743 = false;
                        var170.field755 = 0;
                        var170.field756 = 0;
                        var170.field788 = 150;
                    }
                    if ((var171 & 0x2) != 0) {
                        int var192 = field300.method2125();
                        int var193 = field300.method2118();
                        var170.method581(var192, var193, field269);
                        var170.field760 = field269 + 300;
                        var170.field776 = field300.method2116();
                        var170.field744 = field300.method2092();
                    }
                    if ((var171 & 0x400) != 0) {
                        var170.field779 = field300.method2118();
                        var170.field781 = field300.method2092();
                        var170.field763 = field300.method2092();
                        var170.field782 = field300.method2118();
                        var170.field769 = field300.method2125() + field269;
                        var170.field789 = field300.method2123() + field269;
                        var170.field785 = field300.method2092();
                        var170.field791 = 1;
                        var170.field752 = 0;
                    }
                    if ((var171 & 0x100) != 0) {
                        var170.field774 = field300.method2125();
                        int var194 = field300.method2133();
                        var170.field741 = var194 >> 16;
                        var170.field777 = (var194 & 0xFFFF) + field269;
                        var170.field775 = 0;
                        var170.field768 = 0;
                        if (var170.field777 > field269) {
                            var170.field775 = -1;
                        }
                        if (var170.field774 == 65535) {
                            var170.field774 = -1;
                        }
                    }
                }
                for (int var195 = 0; var195 < field383; var195++) {
                    int var196 = field327[var195];
                    if (field269 != field297[var196].field758) {
                        field297[var196] = null;
                    }
                }
                if (field301 != field300.field1844) {
                    throw new RuntimeException(field300.field1844 + class2.field26 + field301);
                }
                for (int var197 = 0; var197 < field419; var197++) {
                    if (field297[field377[var197]] == null) {
                        throw new RuntimeException(var197 + class2.field26 + field419);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 182) {
                field277 = field300.method2092();
                if (field277 == 1) {
                    field496 = field300.method2094();
                }
                if (field277 >= 2 && field277 <= 6) {
                    if (field277 == 2) {
                        field261 = 64;
                        field455 = 64;
                    }
                    if (field277 == 3) {
                        field261 = 0;
                        field455 = 64;
                    }
                    if (field277 == 4) {
                        field261 = 128;
                        field455 = 64;
                    }
                    if (field277 == 5) {
                        field261 = 64;
                        field455 = 0;
                    }
                    if (field277 == 6) {
                        field261 = 64;
                        field455 = 128;
                    }
                    field277 = 2;
                    field280 = field300.method2094();
                    field477 = field300.method2094();
                    field256 = field300.method2092();
                }
                if (field277 == 10) {
                    field392 = field300.method2094();
                }
                field302 = -1;
                return true;
            }
            if (field302 == 196) {
                int var198 = field301 + field300.field1844;
                int var199 = field300.method2094();
                int var200 = field300.method2094();
                if (field417 != var199) {
                    field417 = var199;
                    method108(field417);
                    class32.method1740(field417);
                    for (int var201 = 0; var201 < 100; var201++) {
                        field461[var201] = true;
                    }
                }
                while (var200-- > 0) {
                    int var202 = field300.method2112();
                    int var203 = field300.method2094();
                    int var204 = field300.method2092();
                    class4 var205 = (class4) field418.method3174((long) var202);
                    if (var205 != null && var205.field55 != var203) {
                        method151(var205, true);
                        var205 = null;
                    }
                    if (var205 == null) {
                        class4 var206 = new class4();
                        var206.field55 = var203;
                        var206.field58 = var204;
                        field418.method3177(var206, (long) var202);
                        method108(var203);
                        class32.method1740(var203);
                        class153 var207 = class153.method1565(var202);
                        if (var207 != null) {
                            method1830(var207);
                        }
                        if (field436 != null) {
                            method1830(field436);
                            field436 = null;
                        }
                        method1010();
                        if (field417 != -1) {
                            int var208 = field417;
                            if (class153.method2498(var208)) {
                                Statics.method103(Statics.field2556[var208], 1);
                            }
                        }
                        var205 = var206;
                    }
                    var205.field56 = true;
                }
                for (class4 var210 = (class4) field418.method3182(); var210 != null; var210 = (class4) field418.method3178()) {
                    if (var210.field56) {
                        var210.field56 = false;
                    } else {
                        method151(var210, true);
                    }
                }
                field458 = new class175(512);
                while (field300.field1844 < var198) {
                    int var211 = field300.method2112();
                    int var212 = field300.method2094();
                    int var213 = field300.method2094();
                    int var214 = field300.method2112();
                    for (int var215 = var212; var215 <= var213; var215++) {
                        long var216 = ((long) var211 << 32) + (long) var215;
                        field458.method3177(new class180(var214), var216);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 69) {
                int var218 = field300.method2125();
                byte var219 = field300.method2143();
                class155.field2683[var218] = var219;
                if (class155.field2684[var218] != var219) {
                    class155.field2684[var218] = var219;
                    method2408(var218);
                }
                field442[++field414 - 1 & 0x1F] = var218;
                field302 = -1;
                return true;
            }
            if (field302 == 89) {
                String var220 = field300.method2251();
                long var221 = (long) field300.method2094();
                long var223 = (long) field300.method2096();
                class138 var225 = (class138) class99.method1947(class138.method2462(), field300.method2092());
                long var226 = (var221 << 32) + var223;
                boolean var228 = false;
                for (int var229 = 0; var229 < 100; var229++) {
                    if (field473[var229] == var226) {
                        var228 = true;
                        break;
                    }
                }
                if (method1379(var220)) {
                    var228 = true;
                }
                if (!var228 && field374 == 0) {
                    field473[field474] = var226;
                    field474 = (field474 + 1) % 100;
                    class110 var230 = field300;
                    String var231 = class192.method1849(var230, 32767);
                    String var232 = class193.method3334(class200.method509(var231));
                    byte var233;
                    if (var225.field2110) {
                        var233 = 7;
                    } else {
                        var233 = 3;
                    }
                    if (var225.field2116 == -1) {
                        class10.method469(var233, var220, var232);
                    } else {
                        int var235 = var225.field2116;
                        String var236 = "<img=" + var235 + ">";
                        class10.method469(var233, var236 + var220, var232);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 53) {
                field501 = false;
                for (int var237 = 0; var237 < 5; var237++) {
                    field487[var237] = false;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 119) {
                field489 = field300.method2092();
                field302 = -1;
                return true;
            }
            if (field302 == 238) {
                field288 = field300.method2092();
                field471 = field300.method2092();
                field302 = -1;
                return true;
            }
            if (field302 == 152) {
                int var238 = field300.method2112();
                int var239 = field300.method2094();
                if (var238 < -70000) {
                    var239 += 32768;
                }
                class153 var240;
                if (var238 >= 0) {
                    var240 = class153.method1565(var238);
                } else {
                    var240 = null;
                }
                if (var240 != null) {
                    for (int var241 = 0; var241 < var240.field2658.length; var241++) {
                        var240.field2658[var241] = 0;
                        var240.field2596[var241] = 0;
                    }
                }
                class14 var242 = (class14) class14.field208.method3174((long) var239);
                if (var242 != null) {
                    for (int var243 = 0; var243 < var242.field207.length; var243++) {
                        var242.field207[var243] = -1;
                        var242.field206[var243] = 0;
                    }
                }
                int var244 = field300.method2094();
                for (int var245 = 0; var245 < var244; var245++) {
                    int var246 = field300.method2094();
                    int var247 = field300.method2092();
                    if (var247 == 255) {
                        var247 = field300.method2077();
                    }
                    if (var240 != null && var245 < var240.field2658.length) {
                        var240.field2658[var245] = var246;
                        var240.field2596[var245] = var247;
                    }
                    class14.method1389(var239, var245, var246 - 1, var247);
                }
                if (var240 != null) {
                    method1830(var240);
                }
                method38();
                field354[++field445 - 1 & 0x1F] = var239 & 0x7FFF;
                field302 = -1;
                return true;
            }
            if (field302 == 216) {
                method1854(true);
                field302 = -1;
                return true;
            }
            if (field302 == 44) {
                int var248 = field300.method2094();
                int var249 = field300.method2112();
                class153 var250 = class153.method1565(var249);
                if (var250.field2588 != 2 || var250.field2589 != var248) {
                    var250.field2588 = 2;
                    var250.field2589 = var248;
                    method1830(var250);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 233) {
                String var251 = field300.method2251();
                long var252 = field300.method2098();
                long var254 = (long) field300.method2094();
                long var256 = (long) field300.method2096();
                class138 var258 = (class138) class99.method1947(class138.method2462(), field300.method2092());
                long var259 = (var254 << 32) + var256;
                boolean var261 = false;
                for (int var262 = 0; var262 < 100; var262++) {
                    if (field473[var262] == var259) {
                        var261 = true;
                        break;
                    }
                }
                if (var258.field2120 && method1379(var251)) {
                    var261 = true;
                }
                if (!var261 && field374 == 0) {
                    field473[field474] = var259;
                    field474 = (field474 + 1) % 100;
                    class110 var263 = field300;
                    String var264 = class192.method1849(var263, 32767);
                    String var265 = class193.method3334(class200.method509(var264));
                    if (var258.field2116 == -1) {
                        class10.method568(9, var251, var265, class199.method743(var252));
                    } else {
                        int var266 = var258.field2116;
                        String var267 = "<img=" + var266 + ">";
                        class10.method568(9, var267 + var251, var265, class199.method743(var252));
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 6) {
                int var268 = field300.method2123();
                int var269 = field300.method2112();
                class153 var270 = class153.method1565(var269);
                if (var270.field2588 != 1 || var270.field2589 != var268) {
                    var270.field2588 = 1;
                    var270.field2589 = var268;
                    method1830(var270);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 127) {
                int var271 = field300.method2125();
                if (var271 == 65535) {
                    var271 = -1;
                }
                method516(var271);
                field302 = -1;
                return true;
            }
            if (field302 == 18) {
                int var272 = field300.method2129();
                int var273 = field300.method2124();
                if (var273 == 65535) {
                    var273 = -1;
                }
                method1741(var273, var272);
                field302 = -1;
                return true;
            }
            if (field302 == 71) {
                int var274 = field300.method2133();
                class153 var275 = class153.method1565(var274);
                var275.field2588 = 3;
                var275.field2589 = Statics.field1767.field35.method2925();
                method1830(var275);
                field302 = -1;
                return true;
            }
            if (field302 == 160) {
                Statics.field1257 = field300.method2092();
                Statics.field250 = field300.method2092();
                for (int var276 = Statics.field250; var276 < Statics.field250 + 8; var276++) {
                    for (int var277 = Statics.field1257; var277 < Statics.field1257 + 8; var277++) {
                        if (field390[Statics.field1][var276][var277] != null) {
                            field390[Statics.field1][var276][var277] = null;
                            method506(var276, var277);
                        }
                    }
                }
                for (class15 var278 = (class15) field391.method3200(); var278 != null; var278 = (class15) field391.method3209()) {
                    if (var278.field224 >= Statics.field250 && var278.field224 < Statics.field250 + 8 && var278.field217 >= Statics.field1257 && var278.field217 < Statics.field1257 + 8 && Statics.field1 == var278.field214) {
                        var278.field225 = 0;
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 90) {
                int var279 = field300.method2125();
                class14 var280 = (class14) class14.field208.method3174((long) var279);
                if (var280 != null) {
                    var280.method3304();
                }
                field354[++field445 - 1 & 0x1F] = var279 & 0x7FFF;
                field302 = -1;
                return true;
            }
            if (field302 == 251) {
                String var281 = field300.method2251();
                Object[] var282 = new Object[var281.length() + 1];
                for (int var283 = var281.length() - 1; var283 >= 0; var283--) {
                    if (var281.charAt(var283) == 's') {
                        var282[var283 + 1] = field300.method2251();
                    } else {
                        var282[var283 + 1] = Integer.valueOf(field300.method2112());
                    }
                }
                var282[0] = Integer.valueOf(field300.method2112());
                class1 var284 = new class1();
                var284.field5 = var282;
                class32.method44(var284);
                field302 = -1;
                return true;
            }
            if (field302 == 183) {
                field415 = field300.method2092();
                if (field415 == 255) {
                    field415 = 0;
                }
                field430 = field300.method2092();
                if (field430 == 255) {
                    field430 = 0;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 184) {
                int var285 = field300.method2094();
                int var286 = field300.method2125();
                int var287 = field300.method2077();
                int var288 = field300.method2123();
                class153 var289 = class153.method1565(var287);
                if (var289.field2578 != var288 || var289.field2550 != var286 || var289.field2599 != var285) {
                    var289.field2578 = var288;
                    var289.field2550 = var286;
                    var289.field2599 = var285;
                    method1830(var289);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 60) {
                String var290 = field300.method2251();
                class110 var291 = field300;
                String var292 = class192.method1849(var291, 32767);
                String var293 = class193.method3334(class200.method509(var292));
                class10.method469(6, var290, var293);
                field302 = -1;
                return true;
            }
            if (field302 == 58) {
                int var294 = field300.method2112();
                class4 var295 = (class4) field418.method3174((long) var294);
                if (var295 != null) {
                    method151(var295, true);
                }
                if (field436 != null) {
                    method1830(field436);
                    field436 = null;
                }
                field302 = -1;
                return true;
            }
            if (field302 == 68) {
                field383 = 0;
                field378 = 0;
                field300.method2347();
                int var296 = field300.method2360(8);
                if (var296 < field369) {
                    for (int var297 = var296; var297 < field369; var297++) {
                        field327[++field383 - 1] = field486[var297];
                    }
                }
                if (var296 > field369) {
                    throw new RuntimeException("");
                }
                field369 = 0;
                for (int var298 = 0; var298 < var296; var298++) {
                    int var299 = field486[var298];
                    class30 var300 = field295[var299];
                    int var301 = field300.method2360(1);
                    if (var301 == 0) {
                        field486[++field369 - 1] = var299;
                        var300.field758 = field269;
                    } else {
                        int var302 = field300.method2360(2);
                        if (var302 == 0) {
                            field486[++field369 - 1] = var299;
                            var300.field758 = field269;
                            field379[++field378 - 1] = var299;
                        } else if (var302 == 1) {
                            field486[++field369 - 1] = var299;
                            var300.field758 = field269;
                            int var303 = field300.method2360(3);
                            var300.method573(var303, false);
                            int var304 = field300.method2360(1);
                            if (var304 == 1) {
                                field379[++field378 - 1] = var299;
                            }
                        } else if (var302 == 2) {
                            field486[++field369 - 1] = var299;
                            var300.field758 = field269;
                            int var305 = field300.method2360(3);
                            var300.method573(var305, true);
                            int var306 = field300.method2360(3);
                            var300.method573(var306, true);
                            int var307 = field300.method2360(1);
                            if (var307 == 1) {
                                field379[++field378 - 1] = var299;
                            }
                        } else if (var302 == 3) {
                            field327[++field383 - 1] = var299;
                        }
                    }
                }
                while (field300.method2333(field301) >= 27) {
                    int var308 = field300.method2360(15);
                    if (var308 == 32767) {
                        break;
                    }
                    boolean var309 = false;
                    if (field295[var308] == null) {
                        field295[var308] = new class30();
                        var309 = true;
                    }
                    class30 var310 = field295[var308];
                    field486[++field369 - 1] = var308;
                    var310.field758 = field269;
                    int var311 = field300.method2360(5);
                    if (var311 > 15) {
                        var311 -= 32;
                    }
                    int var312 = field388[field300.method2360(3)];
                    if (var309) {
                        var310.field738 = var310.field792 = var312;
                    }
                    int var313 = field300.method2360(1);
                    if (var313 == 1) {
                        field379[++field378 - 1] = var308;
                    }
                    int var314 = field300.method2360(5);
                    if (var314 > 15) {
                        var314 -= 32;
                    }
                    var310.field705 = class35.method34(field300.method2360(14));
                    int var315 = field300.method2360(1);
                    var310.field742 = var310.field705.field831;
                    var310.field790 = var310.field705.field827;
                    if (var310.field790 == 0) {
                        var310.field792 = 0;
                    }
                    var310.field746 = var310.field705.field844;
                    var310.field747 = var310.field705.field826;
                    var310.field748 = var310.field705.field819;
                    var310.field749 = var310.field705.field820;
                    var310.field739 = var310.field705.field814;
                    var310.field786 = var310.field705.field815;
                    var310.field745 = var310.field705.field816;
                    var310.method567(Statics.field1767.field783[0] + var314, Statics.field1767.field793[0] + var311, var315 == 1);
                }
                field300.method2338();
                method476();
                for (int var316 = 0; var316 < field383; var316++) {
                    int var317 = field327[var316];
                    if (field269 != field295[var317].field758) {
                        field295[var317].field705 = null;
                        field295[var317] = null;
                    }
                }
                if (field301 != field300.field1844) {
                    throw new RuntimeException(field300.field1844 + class2.field26 + field301);
                }
                for (int var318 = 0; var318 < field369; var318++) {
                    if (field295[field486[var318]] == null) {
                        throw new RuntimeException(var318 + class2.field26 + field369);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 117) {
                for (int var319 = 0; var319 < class155.field2684.length; var319++) {
                    if (class155.field2684[var319] != class155.field2683[var319]) {
                        class155.field2684[var319] = class155.field2683[var319];
                        method2408(var319);
                        field442[++field414 - 1 & 0x1F] = var319;
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 179) {
                int var320 = field300.method2077();
                int var321 = field300.method2123();
                int var322 = var321 >> 10 & 0x1F;
                int var323 = var321 >> 5 & 0x1F;
                int var324 = var321 & 0x1F;
                int var325 = (var324 << 3) + (var322 << 19) + (var323 << 11);
                class153 var326 = class153.method1565(var320);
                if (var326.field2573 != var325) {
                    var326.field2573 = var325;
                    method1830(var326);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 221) {
                method106();
                field302 = -1;
                return false;
            }
            if (field302 == 66) {
                Statics.field1284 = class117.method2511(field300.method2092());
                field302 = -1;
                return true;
            }
            if (field302 == 17) {
                int var327 = field300.method2105();
                boolean var328 = field300.method2092() == 1;
                String var329 = "";
                boolean var330 = false;
                if (var328) {
                    var329 = field300.method2251();
                    if (method1379(var329)) {
                        var330 = true;
                    }
                }
                String var331 = field300.method2251();
                if (!var330) {
                    class10.method469(var327, var329, var331);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 113) {
                int var332 = field300.method2094();
                if (var332 == 65535) {
                    var332 = -1;
                }
                int var333 = field300.method2133();
                int var334 = field300.method2135();
                class153 var335 = class153.method1565(var333);
                if (var335.field2635) {
                    var335.field2660 = var332;
                    var335.field2661 = var334;
                    class45 var337 = Statics.method2406(var332);
                    var335.field2578 = var337.field1020;
                    var335.field2550 = var337.field1021;
                    var335.field2598 = var337.field1008;
                    var335.field2594 = var337.field1023;
                    var335.field2595 = var337.field1024;
                    var335.field2599 = var337.field1031;
                    if (var335.field2565 > 0) {
                        var335.field2599 = var335.field2599 * 32 / var335.field2565;
                    }
                    method1830(var335);
                } else if (var332 == -1) {
                    var335.field2588 = 0;
                    field302 = -1;
                    return true;
                } else {
                    class45 var336 = Statics.method2406(var332);
                    var335.field2588 = 4;
                    var335.field2589 = var332;
                    var335.field2578 = var336.field1020;
                    var335.field2550 = var336.field1021;
                    var335.field2599 = var336.field1031 * 100 / var334;
                    method1830(var335);
                }
                field302 = -1;
                return true;
            }
            if (field302 == 149) {
                int var338 = field300.method2173();
                int var339 = field300.method2123();
                int var340 = field300.method2135();
                class4 var341 = (class4) field418.method3174((long) var340);
                if (var341 != null) {
                    method151(var341, var341.field55 != var339);
                }
                class4 var342 = new class4();
                var342.field55 = var339;
                var342.field58 = var338;
                field418.method3177(var342, (long) var340);
                method108(var339);
                class32.method1740(var339);
                class153 var343 = class153.method1565(var340);
                if (var343 != null) {
                    method1830(var343);
                }
                if (field436 != null) {
                    method1830(field436);
                    field436 = null;
                }
                method1010();
                if (field417 != -1) {
                    int var344 = field417;
                    if (class153.method2498(var344)) {
                        Statics.method103(Statics.field2556[var344], 1);
                    }
                }
                field302 = -1;
                return true;
            }
            if (field302 == 30) {
                method38();
                field299 = field300.method2099();
                field451 = field506;
                field302 = -1;
                return true;
            }
            class135.method33("" + field302 + class2.field26 + field307 + class2.field26 + field422 + class2.field26 + field301, (Throwable) null);
            method106();
        } catch (IOException var354) {
            if (field355 > 0) {
                method106();
            } else {
                method2382(40);
                Statics.field1858 = Statics.field2147;
                Statics.field2147 = null;
            }
        } catch (Exception var355) {
            String var347 = "" + field302 + class2.field26 + field307 + class2.field26 + field422 + class2.field26 + field301 + class2.field26 + (Statics.field1870 + Statics.field1767.field783[0]) + class2.field26 + (Statics.field47 + Statics.field1767.field793[0]) + class2.field26;
            for (int var348 = 0; var348 < field301 && var348 < 50; var348++) {
                var347 = var347 + field300.field1843[var348] + class2.field26;
            }
            class135.method33(var347, var355);
            method106();
        }
        return true;
    }

    @ObfuscatedName("dm.af(I)V")
    public static final void method2402() {
        if (field302 == 48) {
            int var0 = field300.method2094();
            int var1 = field300.method2118();
            int var2 = (var1 >> 4 & 0x7) + Statics.field250;
            int var3 = (var1 & 0x7) + Statics.field1257;
            int var4 = field300.method2124();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class25 var5 = new class25();
                var5.field625 = var4;
                var5.field618 = var0;
                if (field390[Statics.field1][var2][var3] == null) {
                    field390[Statics.field1][var2][var3] = new class178();
                }
                field390[Statics.field1][var2][var3].method3202(var5);
                method506(var2, var3);
            }
        } else if (field302 == 19) {
            int var6 = field300.method2092();
            int var7 = (var6 >> 4 & 0x7) + Statics.field250;
            int var8 = (var6 & 0x7) + Statics.field1257;
            int var9 = var7 + field300.method2117();
            int var10 = var8 + field300.method2117();
            int var11 = field300.method2099();
            int var12 = field300.method2094();
            int var13 = field300.method2092() * 4;
            int var14 = field300.method2092() * 4;
            int var15 = field300.method2094();
            int var16 = field300.method2094();
            int var17 = field300.method2092();
            int var18 = field300.method2092();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                class7 var23 = new class7(var12, Statics.field1, var19, var20, method584(var19, var20, Statics.field1) - var13, field269 + var15, field269 + var16, var17, var18, var11, var14);
                var23.method85(var21, var22, method584(var21, var22, Statics.field1) - var14, field269 + var15);
                field296.method3202(var23);
            }
        } else if (field302 == 167) {
            int var24 = field300.method2092();
            int var25 = (var24 >> 4 & 0x7) + Statics.field250;
            int var26 = (var24 & 0x7) + Statics.field1257;
            int var27 = field300.method2094();
            int var28 = field300.method2094();
            int var29 = field300.method2094();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class178 var30 = field390[Statics.field1][var25][var26];
                if (var30 != null) {
                    for (class25 var31 = (class25) var30.method3200(); var31 != null; var31 = (class25) var30.method3209()) {
                        if ((var27 & 0x7FFF) == var31.field625 && var31.field618 == var28) {
                            var31.field618 = var29;
                            break;
                        }
                    }
                    method506(var25, var26);
                }
            }
        } else {
            if (field302 == 189) {
                byte var32 = field300.method2143();
                int var33 = field300.method2116();
                int var34 = (var33 >> 4 & 0x7) + Statics.field250;
                int var35 = (var33 & 0x7) + Statics.field1257;
                byte var36 = field300.method2117();
                int var37 = field300.method2123();
                int var38 = field300.method2125();
                byte var39 = field300.method2143();
                byte var40 = field300.method2143();
                int var41 = field300.method2123();
                int var42 = field300.method2124();
                int var43 = field300.method2116();
                int var44 = var43 >> 2;
                int var45 = var43 & 0x3;
                int var46 = field319[var44];
                class3 var47;
                if (field444 == var41) {
                    var47 = Statics.field1767;
                } else {
                    var47 = field297[var41];
                }
                if (var47 != null) {
                    class36 var48 = class36.method1847(var37);
                    int var49;
                    int var50;
                    if (var45 == 1 || var45 == 3) {
                        var49 = var48.field862;
                        var50 = var48.field868;
                    } else {
                        var49 = var48.field868;
                        var50 = var48.field862;
                    }
                    int var51 = (var49 >> 1) + var34;
                    int var52 = (var49 + 1 >> 1) + var34;
                    int var53 = (var50 >> 1) + var35;
                    int var54 = (var50 + 1 >> 1) + var35;
                    int[][] var55 = class6.field82[Statics.field1];
                    int var56 = var55[var51][var53] + var55[var52][var53] + var55[var51][var54] + var55[var52][var54] >> 2;
                    int var57 = (var34 << 7) + (var49 << 6);
                    int var58 = (var35 << 7) + (var50 << 6);
                    class98 var59 = var48.method630(var44, var45, var55, var57, var56, var58);
                    if (var59 != null) {
                        method558(Statics.field1, var34, var35, var46, -1, 0, 0, var42 + 1, var38 + 1);
                        var47.field31 = field269 + var42;
                        var47.field42 = field269 + var38;
                        var47.field39 = var59;
                        var47.field44 = var34 * 128 + var49 * 64;
                        var47.field38 = var35 * 128 + var50 * 64;
                        var47.field41 = var56;
                        if (var32 > var40) {
                            byte var60 = var32;
                            var32 = var40;
                            var40 = var60;
                        }
                        if (var36 > var39) {
                            byte var61 = var36;
                            var36 = var39;
                            var39 = var61;
                        }
                        var47.field40 = var32 + var34;
                        var47.field27 = var34 + var40;
                        var47.field28 = var35 + var36;
                        var47.field43 = var35 + var39;
                    }
                }
            }
            if (field302 == 13) {
                int var62 = field300.method2092();
                int var63 = (var62 >> 4 & 0x7) + Statics.field250;
                int var64 = (var62 & 0x7) + Statics.field1257;
                int var65 = field300.method2094();
                int var66 = field300.method2092();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = field300.method2092();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (Statics.field1767.field783[0] >= var63 - var70 && Statics.field1767.field783[0] <= var63 + var70 && Statics.field1767.field793[0] >= var64 - var70 && Statics.field1767.field793[0] <= var64 + var70 && field494 != 0 && var68 > 0 && field454 < 50) {
                        field384[field454] = var65;
                        field497[field454] = var68;
                        field349[field454] = var69;
                        field500[field454] = null;
                        field499[field454] = (var63 << 16) + (var64 << 8) + var67;
                        field454++;
                    }
                }
            }
            if (field302 == 2) {
                int var71 = field300.method2118();
                int var72 = (var71 >> 4 & 0x7) + Statics.field250;
                int var73 = (var71 & 0x7) + Statics.field1257;
                int var74 = field300.method2094();
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    class178 var75 = field390[Statics.field1][var72][var73];
                    if (var75 != null) {
                        for (class25 var76 = (class25) var75.method3200(); var76 != null; var76 = (class25) var75.method3209()) {
                            if ((var74 & 0x7FFF) == var76.field625) {
                                var76.method3304();
                                break;
                            }
                        }
                        if (var75.method3200() == null) {
                            field390[Statics.field1][var72][var73] = null;
                        }
                        method506(var72, var73);
                    }
                }
            } else if (field302 == 219) {
                int var77 = field300.method2118();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field319[var78];
                int var81 = field300.method2125();
                int var82 = field300.method2118();
                int var83 = (var82 >> 4 & 0x7) + Statics.field250;
                int var84 = (var82 & 0x7) + Statics.field1257;
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    method558(Statics.field1, var83, var84, var80, var81, var78, var79, 0, -1);
                }
            } else if (field302 == 76) {
                int var85 = field300.method2116();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field319[var86];
                int var89 = field300.method2123();
                int var90 = field300.method2118();
                int var91 = (var90 >> 4 & 0x7) + Statics.field250;
                int var92 = (var90 & 0x7) + Statics.field1257;
                if (var91 >= 0 && var92 >= 0 && var91 < 103 && var92 < 103) {
                    if (var88 == 0) {
                        class80 var93 = Statics.field2085.method1670(Statics.field1, var91, var92);
                        if (var93 != null) {
                            int var94 = var93.field1432 >> 14 & 0x7FFF;
                            if (var86 == 2) {
                                var93.field1431 = new class11(var94, 2, var87 + 4, Statics.field1, var91, var92, var89, false, var93.field1431);
                                var93.field1430 = new class11(var94, 2, var87 + 1 & 0x3, Statics.field1, var91, var92, var89, false, var93.field1430);
                            } else {
                                var93.field1431 = new class11(var94, var86, var87, Statics.field1, var91, var92, var89, false, var93.field1431);
                            }
                        }
                    }
                    if (var88 == 1) {
                        class87 var95 = Statics.field2085.method1598(Statics.field1, var91, var92);
                        if (var95 != null) {
                            int var96 = var95.field1512 >> 14 & 0x7FFF;
                            if (var86 == 4 || var86 == 5) {
                                var95.field1510 = new class11(var96, 4, var87, Statics.field1, var91, var92, var89, false, var95.field1510);
                            } else if (var86 == 6) {
                                var95.field1510 = new class11(var96, 4, var87 + 4, Statics.field1, var91, var92, var89, false, var95.field1510);
                            } else if (var86 == 7) {
                                var95.field1510 = new class11(var96, 4, (var87 + 2 & 0x3) + 4, Statics.field1, var91, var92, var89, false, var95.field1510);
                            } else if (var86 == 8) {
                                var95.field1510 = new class11(var96, 4, var87 + 4, Statics.field1, var91, var92, var89, false, var95.field1510);
                                var95.field1515 = new class11(var96, 4, (var87 + 2 & 0x3) + 4, Statics.field1, var91, var92, var89, false, var95.field1515);
                            }
                        }
                    }
                    if (var88 == 2) {
                        class91 var97 = Statics.field2085.method1599(Statics.field1, var91, var92);
                        if (var86 == 11) {
                            var86 = 10;
                        }
                        if (var97 != null) {
                            var97.field1557 = new class11(var97.field1568 >> 14 & 0x7FFF, var86, var87, Statics.field1, var91, var92, var89, false, var97.field1557);
                        }
                    }
                    if (var88 == 3) {
                        class86 var98 = Statics.field2085.method1600(Statics.field1, var91, var92);
                        if (var98 != null) {
                            var98.field1498 = new class11(var98.field1493 >> 14 & 0x7FFF, 22, var87, Statics.field1, var91, var92, var89, false, var98.field1498);
                        }
                    }
                }
            } else if (field302 == 124) {
                int var99 = field300.method2092();
                int var100 = (var99 >> 4 & 0x7) + Statics.field250;
                int var101 = (var99 & 0x7) + Statics.field1257;
                int var102 = field300.method2092();
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = field319[var103];
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    method558(Statics.field1, var100, var101, var105, -1, var103, var104, 0, -1);
                }
            } else if (field302 == 109) {
                int var106 = field300.method2092();
                int var107 = (var106 >> 4 & 0x7) + Statics.field250;
                int var108 = (var106 & 0x7) + Statics.field1257;
                int var109 = field300.method2094();
                int var110 = field300.method2092();
                int var111 = field300.method2094();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class26 var114 = new class26(var109, Statics.field1, var112, var113, method584(var112, var113, Statics.field1) - var110, var111, field269);
                    field443.method3202(var114);
                }
            }
        }
    }

    @ObfuscatedName("as.by(IIIIIIIIII)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field391.method3200(); var10 != null; var10 = (class15) field391.method3209()) {
            if (var10.field214 == arg0 && var10.field224 == arg1 && var10.field217 == arg2 && var10.field215 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field214 = arg0;
            var9.field215 = arg3;
            var9.field224 = arg1;
            var9.field217 = arg2;
            method2946(var9);
            field391.method3202(var9);
        }
        var9.field221 = arg4;
        var9.field223 = arg5;
        var9.field216 = arg6;
        var9.field226 = arg7;
        var9.field225 = arg8;
    }

    @ObfuscatedName("fh.bd(Lq;I)V")
    public static final void method2946(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field215 == 0) {
            var1 = Statics.field2085.method1610(arg0.field214, arg0.field224, arg0.field217);
        }
        if (arg0.field215 == 1) {
            var1 = Statics.field2085.method1602(arg0.field214, arg0.field224, arg0.field217);
        }
        if (arg0.field215 == 2) {
            var1 = Statics.field2085.method1597(arg0.field214, arg0.field224, arg0.field217);
        }
        if (arg0.field215 == 3) {
            var1 = Statics.field2085.method1606(arg0.field214, arg0.field224, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field2085.method1604(arg0.field214, arg0.field224, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field218 = var2;
        arg0.field220 = var3;
        arg0.field219 = var4;
    }

    @ObfuscatedName("r.bu(I)V")
    public static final void method135() {
        for (class15 var0 = (class15) field391.method3200(); var0 != null; var0 = (class15) field391.method3209()) {
            if (var0.field225 > 0) {
                var0.field225--;
            }
            if (var0.field225 != 0) {
                if (var0.field226 > 0) {
                    var0.field226--;
                }
                if (var0.field226 == 0 && var0.field224 >= 1 && var0.field217 >= 1 && var0.field224 <= 102 && var0.field217 <= 102 && (var0.field221 < 0 || class6.method86(var0.field221, var0.field223))) {
                    method94(var0.field214, var0.field215, var0.field224, var0.field217, var0.field221, var0.field216, var0.field223);
                    var0.field226 = -1;
                    if (var0.field221 == var0.field218 && var0.field218 == -1) {
                        var0.method3304();
                    } else if (var0.field221 == var0.field218 && var0.field219 == var0.field216 && var0.field223 == var0.field220) {
                        var0.method3304();
                    }
                }
            } else if (var0.field218 < 0 || class6.method86(var0.field218, var0.field220)) {
                method94(var0.field214, var0.field215, var0.field224, var0.field217, var0.field218, var0.field219, var0.field220);
                var0.method3304();
            }
        }
    }

    @ObfuscatedName("u.bq(IIIIIIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field265 && Statics.field1 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2085.method1610(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2085.method1602(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2085.method1597(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2085.method1606(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2085.method1604(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2085.method1592(arg0, arg2, arg3);
                class36 var15 = class36.method1847(var12);
                if (var15.field863 != 0) {
                    field316[arg0].method3471(arg2, arg3, var13, var14, var15.field875);
                }
            }
            if (arg1 == 1) {
                Statics.field2085.method1593(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2085.method1577(arg0, arg2, arg3);
                class36 var16 = class36.method1847(var12);
                if (var16.field868 + arg2 > 103 || var16.field868 + arg3 > 103 || var16.field862 + arg2 > 103 || var16.field862 + arg3 > 103) {
                    return;
                }
                if (var16.field863 != 0) {
                    field316[arg0].method3472(arg2, arg3, var16.field868, var16.field862, var14, var16.field875);
                }
            }
            if (arg1 == 3) {
                Statics.field2085.method1580(arg0, arg2, arg3);
                class36 var17 = class36.method1847(var12);
                if (var17.field863 == 1) {
                    field316[arg0].method3474(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field76[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field2085;
        class198 var20 = field316[arg0];
        class36 var21 = class36.method1847(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field862;
            var23 = var21.field868;
        } else {
            var22 = var21.field868;
            var23 = var21.field862;
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
        int[][] var28 = class6.field82[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field865 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field886 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field897 == -1 && var21.field867 == null) {
                var34 = var21.method630(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1581(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field863 == 1) {
                var20.method3469(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field897 == -1 && var21.field867 == null) {
                var57 = var21.method630(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1652(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field863 != 0) {
                var20.method3467(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field897 == -1 && var21.field867 == null) {
                var35 = var21.method630(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1652(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field863 != 0) {
                var20.method3467(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field897 == -1 && var21.field867 == null) {
                var36 = var21.method630(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1583(arg0, arg2, arg3, var29, var36, (class78) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field863 != 0) {
                var20.method3464(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field897 == -1 && var21.field867 == null) {
                var37 = var21.method630(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1583(arg0, arg2, arg3, var29, var37, (class78) null, class6.field77[arg5], 0, var32, var33);
            if (var21.field863 != 0) {
                var20.method3464(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field897 == -1 && var21.field867 == null) {
                var39 = var21.method630(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method630(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field897, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1583(arg0, arg2, arg3, var29, var39, var40, class6.field81[arg5], class6.field81[var38], var32, var33);
            if (var21.field863 != 0) {
                var20.method3464(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field897 == -1 && var21.field867 == null) {
                var41 = var21.method630(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1583(arg0, arg2, arg3, var29, var41, (class78) null, class6.field77[arg5], 0, var32, var33);
            if (var21.field863 != 0) {
                var20.method3464(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field897 == -1 && var21.field867 == null) {
                var42 = var21.method630(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1652(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field863 != 0) {
                var20.method3467(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field897 == -1 && var21.field867 == null) {
                var43 = var21.method630(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1584(arg0, arg2, arg3, var29, var43, (class78) null, class6.field81[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1610(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method1847(var45 >> 14 & 0x7FFF).field870;
            }
            class78 var46;
            if (var21.field897 == -1 && var21.field867 == null) {
                var46 = var21.method630(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1584(arg0, arg2, arg3, var29, var46, (class78) null, class6.field81[arg5], 0, class6.field84[arg5] * var44, class6.field78[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1610(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method1847(var48 >> 14 & 0x7FFF).field870 / 2;
            }
            class78 var49;
            if (var21.field897 == -1 && var21.field867 == null) {
                var49 = var21.method630(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1584(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field86[arg5] * var47, class6.field83[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field897 == -1 && var21.field867 == null) {
                var51 = var21.method630(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1584(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1610(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method1847(var53 >> 14 & 0x7FFF).field870 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field897 == -1 && var21.field867 == null) {
                var55 = var21.method630(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method630(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field897, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field897, true, (class78) null);
            }
            var19.method1584(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field86[arg5] * var52, class6.field83[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("s.ba(III)V")
    public static final void method506(int arg0, int arg1) {
        class178 var2 = field390[Statics.field1][arg0][arg1];
        if (var2 == null) {
            Statics.field2085.method1596(Statics.field1, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3200(); var6 != null; var6 = (class25) var2.method3209()) {
            class45 var7 = Statics.method2406(var6.field625);
            long var8 = (long) var7.field1044;
            if (var7.field1025 == 1) {
                var8 = (long) (var6.field618 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2085.method1596(Statics.field1, arg0, arg1);
            return;
        }
        var2.method3203(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3200(); var12 != null; var12 = (class25) var2.method3209()) {
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
        Statics.field2085.method1582(Statics.field1, arg0, arg1, method584(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1), var5, var13, var10, var11);
    }

    @ObfuscatedName("j.bf(I)V")
    public static final void method102() {
        field300.method2347();
        int var0 = field300.method2360(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field300.method2360(2);
        if (var1 == 0) {
            field379[++field378 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field300.method2360(3);
            Statics.field1767.method573(var2, false);
            int var3 = field300.method2360(1);
            if (var3 == 1) {
                field379[++field378 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field300.method2360(3);
            Statics.field1767.method573(var4, true);
            int var5 = field300.method2360(3);
            Statics.field1767.method573(var5, true);
            int var6 = field300.method2360(1);
            if (var6 == 1) {
                field379[++field378 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field300.method2360(7);
            int var8 = field300.method2360(1);
            int var9 = field300.method2360(7);
            int var10 = field300.method2360(1);
            if (var10 == 1) {
                field379[++field378 - 1] = 2047;
            }
            Statics.field1 = field300.method2360(2);
            Statics.field1767.method567(var9, var7, var8 == 1);
        }
    }

    @ObfuscatedName("cd.bw(I)V")
    public static final void method1831() {
        while (true) {
            if (field300.method2333(field301) >= 11) {
                int var0 = field300.method2360(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field297[var0] == null) {
                        field297[var0] = new class3();
                        if (field380[var0] != null) {
                            field297[var0].method13(field380[var0]);
                        }
                        var1 = true;
                    }
                    field377[++field419 - 1] = var0;
                    class3 var2 = field297[var0];
                    var2.field758 = field269;
                    int var3 = field300.method2360(1);
                    int var4 = field388[field300.method2360(3)];
                    if (var1) {
                        var2.field738 = var2.field792 = var4;
                    }
                    int var5 = field300.method2360(1);
                    if (var5 == 1) {
                        field379[++field378 - 1] = var0;
                    }
                    int var6 = field300.method2360(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field300.method2360(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method567(Statics.field1767.field783[0] + var6, Statics.field1767.field793[0] + var7, var3 == 1);
                    continue;
                }
            }
            field300.method2338();
            return;
        }
    }

    @ObfuscatedName("v.bz(I)V")
    public static final void method476() {
        for (int var0 = 0; var0 < field378; var0++) {
            int var1 = field379[var0];
            class30 var2 = field295[var1];
            int var3 = field300.method2092();
            if ((var3 & 0x4) != 0) {
                int var4 = field300.method2173();
                int var5 = field300.method2116();
                var2.method581(var4, var5, field269);
                var2.field760 = field269 + 300;
                var2.field776 = field300.method2125();
                var2.field744 = field300.method2094();
            }
            if ((var3 & 0x2) != 0) {
                var2.field774 = field300.method2124();
                int var6 = field300.method2077();
                var2.field741 = var6 >> 16;
                var2.field777 = (var6 & 0xFFFF) + field269;
                var2.field775 = 0;
                var2.field768 = 0;
                if (var2.field777 > field269) {
                    var2.field775 = -1;
                }
                if (var2.field774 == 65535) {
                    var2.field774 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field751 = field300.method2251();
                var2.field788 = 100;
            }
            if ((var3 & 0x80) != 0) {
                int var7 = field300.method2173();
                int var8 = field300.method2092();
                var2.method581(var7, var8, field269);
                var2.field760 = field269 + 300;
                var2.field776 = field300.method2094();
                var2.field744 = field300.method2124();
            }
            if ((var3 & 0x10) != 0) {
                var2.field705 = class35.method34(field300.method2123());
                var2.field742 = var2.field705.field831;
                var2.field790 = var2.field705.field827;
                var2.field746 = var2.field705.field844;
                var2.field747 = var2.field705.field826;
                var2.field748 = var2.field705.field819;
                var2.field749 = var2.field705.field820;
                var2.field739 = var2.field705.field814;
                var2.field786 = var2.field705.field815;
                var2.field745 = var2.field705.field816;
            }
            if ((var3 & 0x40) != 0) {
                var2.field784 = field300.method2123();
                if (var2.field784 == 65535) {
                    var2.field784 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field764 = field300.method2124();
                var2.field765 = field300.method2124();
            }
            if ((var3 & 0x8) != 0) {
                int var9 = field300.method2125();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field300.method2118();
                if (var2.field762 == var9 && var9 != -1) {
                    int var11 = class38.method552(var9).field925;
                    if (var11 == 1) {
                        var2.field770 = 0;
                        var2.field771 = 0;
                        var2.field772 = var10;
                        var2.field773 = 0;
                    }
                    if (var11 == 2) {
                        var2.field773 = 0;
                    }
                } else if (var9 == -1 || var2.field762 == -1 || class38.method552(var9).field919 >= class38.method552(var2.field762).field919) {
                    var2.field762 = var9;
                    var2.field770 = 0;
                    var2.field771 = 0;
                    var2.field772 = var10;
                    var2.field773 = 0;
                    var2.field752 = var2.field791;
                }
            }
        }
    }

    @ObfuscatedName("co.be(IIIII)V")
    public static final void method1737(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field459; var4++) {
            if (field466[var4] + field464[var4] > arg0 && field464[var4] < arg0 + arg2 && field465[var4] + field281[var4] > arg1 && field465[var4] < arg1 + arg3) {
                field461[var4] = true;
            }
        }
    }

    @ObfuscatedName("q.bc(IIIII)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field459; var4++) {
            if (field466[var4] + field464[var4] > arg0 && field464[var4] < arg0 + arg2 && field465[var4] + field281[var4] > arg1 && field465[var4] < arg1 + arg3) {
                field462[var4] = true;
            }
        }
    }

    @ObfuscatedName("ac.bn(III)V")
    public static final void method527(int arg0, int arg1) {
        int var2 = Statics.field1817.method3337(class143.field2323);
        for (int var3 = 0; var3 < field399; var3++) {
            int var4 = Statics.field1817.method3337(method37(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field399 * 15 + 21;
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
        field334 = true;
        Statics.field557 = var6;
        Statics.field1275 = var7;
        Statics.field2767 = var2;
        Statics.field600 = field399 * 15 + 22;
    }

    @ObfuscatedName("h.bb(IB)Z")
    public static final boolean method128(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field308[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("d.bi(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 4) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(35);
            field298.method2101(Statics.field1870 + arg0);
            field298.method2101(arg3 >> 14 & 0x7FFF);
            field298.method2137(Statics.field47 + arg1);
            field298.method2115(class124.field1975[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            class30 var8 = field295[arg3];
            if (var8 != null) {
                class35 var9 = var8.field705;
                if (var9.field835 != null) {
                    var9 = var9.method596();
                }
                if (var9 != null) {
                    field298.method2335(229);
                    field298.method2100(var9.field809);
                }
            }
        }
        if (arg2 == 32) {
            field298.method2335(250);
            field298.method2120(field305);
            field298.method2100(arg3);
            field298.method2132(Statics.field1300);
            field298.method2137(arg0);
            field298.method2130(arg1);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 24) {
            class153 var10 = class153.method1565(arg1);
            boolean var11 = true;
            if (var10.field2560 > 0) {
                var11 = method2867(var10);
            }
            if (var11) {
                field298.method2335(48);
                field298.method2247(arg1);
            }
        }
        if (arg2 == 58) {
            class153 var12 = class153.method2544(arg1, arg0);
            if (var12 != null) {
                field298.method2335(156);
                field298.method2120(arg0);
                field298.method2101(field321);
                field298.method2244(Statics.field1300);
                field298.method2100(field305);
                field298.method2244(arg1);
                field298.method2100(var12.field2660);
            }
        }
        if (arg2 == 13) {
            class30 var13 = field295[arg3];
            if (var13 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(243);
                field298.method2079(class124.field1975[82] ? 1 : 0);
                field298.method2137(arg3);
            }
        }
        if (arg2 == 41) {
            field298.method2335(160);
            field298.method2120(arg3);
            field298.method2132(arg1);
            field298.method2100(arg0);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 18) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(239);
            field298.method2101(Statics.field1870 + arg0);
            field298.method2120(arg3);
            field298.method2137(Statics.field47 + arg1);
            field298.method2169(class124.field1975[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class30 var14 = field295[arg3];
            if (var14 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(183);
                field298.method2137(arg3);
                field298.method2115(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method2642();
        }
        if (arg2 == 1) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(128);
            field298.method2130(Statics.field50);
            field298.method2101(arg3 >> 14 & 0x7FFF);
            field298.method2101(Statics.field1826);
            field298.method2101(Statics.field1870 + arg0);
            field298.method2120(Statics.field74);
            field298.method2079(class124.field1975[82] ? 1 : 0);
            field298.method2101(Statics.field47 + arg1);
        }
        if (arg2 == 29) {
            field298.method2335(48);
            field298.method2247(arg1);
            class153 var15 = class153.method1565(arg1);
            if (var15.field2574 != null && var15.field2574[0][0] == 5) {
                int var16 = var15.field2574[0][1];
                if (class155.field2684[var16] != var15.field2631[0]) {
                    class155.field2684[var16] = var15.field2631[0];
                    method2408(var16);
                }
            }
        }
        if (arg2 == 3) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(182);
            field298.method2101(Statics.field1870 + arg0);
            field298.method2100(arg3 >> 14 & 0x7FFF);
            field298.method2169(class124.field1975[82] ? 1 : 0);
            field298.method2120(Statics.field47 + arg1);
        }
        if (arg2 == 10) {
            class30 var17 = field295[arg3];
            if (var17 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(117);
                field298.method2115(class124.field1975[82] ? 1 : 0);
                field298.method2137(arg3);
            }
        }
        if (arg2 == 35) {
            field298.method2335(102);
            field298.method2137(arg3);
            field298.method2247(arg1);
            field298.method2120(arg0);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 2) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(193);
            field298.method2244(Statics.field1300);
            field298.method2101(Statics.field47 + arg1);
            field298.method2137(Statics.field1870 + arg0);
            field298.method2101(field305);
            field298.method2120(arg3 >> 14 & 0x7FFF);
            field298.method2169(class124.field1975[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class30 var18 = field295[arg3];
            if (var18 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(138);
                field298.method2114(class124.field1975[82] ? 1 : 0);
                field298.method2137(arg3);
            }
        }
        if (arg2 == 38) {
            method2373();
            class153 var19 = class153.method1565(arg1);
            field410 = 1;
            Statics.field74 = arg0;
            Statics.field50 = arg1;
            Statics.field1826 = arg3;
            method1830(var19);
            field411 = class2.method1850(16748608) + Statics.method2406(arg3).field1026 + class2.method1850(16777215);
            if (field411 == null) {
                field411 = "null";
            }
            return;
        }
        if (arg2 == 45) {
            class3 var20 = field297[arg3];
            if (var20 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(253);
                field298.method2115(class124.field1975[82] ? 1 : 0);
                field298.method2100(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field2085.method1618(Statics.field1, arg0, arg1);
        }
        if (arg2 == 1005) {
            class153 var21 = class153.method1565(arg1);
            if (var21 == null || var21.field2596[arg0] < 100000) {
                field298.method2335(74);
                field298.method2120(arg3);
            } else {
                class10.method469(27, "", var21.field2596[arg0] + " x " + Statics.method2406(arg3).field1026);
            }
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 30 && field436 == null) {
            field298.method2335(61);
            field298.method2244(arg1);
            field298.method2100(arg0);
            field436 = class153.method2544(arg1, arg0);
            method1830(field436);
        }
        if (arg2 == 21) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(36);
            field298.method2100(Statics.field47 + arg1);
            field298.method2079(class124.field1975[82] ? 1 : 0);
            field298.method2120(Statics.field1870 + arg0);
            field298.method2137(arg3);
        }
        if (arg2 == 46) {
            class3 var22 = field297[arg3];
            if (var22 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(125);
                field298.method2120(arg3);
                field298.method2079(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(142);
            field298.method2120(Statics.field1870 + arg0);
            field298.method2120(Statics.field47 + arg1);
            field298.method2100(arg3 >> 14 & 0x7FFF);
            field298.method2114(class124.field1975[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var23 = class153.method2544(arg1, arg0);
            if (var23 != null) {
                int var24 = var23.field2660;
                class153 var25 = class153.method2544(arg1, arg0);
                if (var25 != null) {
                    if (var25.field2559 != null) {
                        class1 var26 = new class1();
                        var26.field3 = var25;
                        var26.field6 = arg3;
                        var26.field10 = arg5;
                        var26.field5 = var25.field2559;
                        class32.method44(var26);
                    }
                    boolean var27 = true;
                    if (var25.field2560 > 0) {
                        var27 = method2867(var25);
                    }
                    if (var27) {
                        int var28 = method1833(var25);
                        int var29 = arg3 - 1;
                        boolean var30 = (var28 >> var29 + 1 & 0x1) != 0;
                        if (var30) {
                            if (arg3 == 1) {
                                field298.method2335(169);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 2) {
                                field298.method2335(72);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 3) {
                                field298.method2335(91);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 4) {
                                field298.method2335(188);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 5) {
                                field298.method2335(27);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 6) {
                                field298.method2335(178);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 7) {
                                field298.method2335(190);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 8) {
                                field298.method2335(98);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 9) {
                                field298.method2335(71);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                            if (arg3 == 10) {
                                field298.method2335(75);
                                field298.method2247(arg1);
                                field298.method2100(arg0);
                                field298.method2100(var24);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 31) {
            field298.method2335(103);
            field298.method2120(arg3);
            field298.method2244(Statics.field50);
            field298.method2100(arg0);
            field298.method2247(arg1);
            field298.method2120(Statics.field1826);
            field298.method2100(Statics.field74);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 7) {
            class30 var31 = field295[arg3];
            if (var31 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(212);
                field298.method2244(Statics.field50);
                field298.method2100(Statics.field74);
                field298.method2169(class124.field1975[82] ? 1 : 0);
                field298.method2137(Statics.field1826);
                field298.method2100(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var32 = field297[arg3];
            if (var32 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(223);
                field298.method2100(arg3);
                field298.method2114(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var33 = field297[arg3];
            if (var33 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(63);
                field298.method2137(arg3);
                field298.method2079(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field298.method2335(65);
            field298.method2100(arg0);
            field298.method2130(arg1);
            field298.method2101(arg3);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 44) {
            class3 var34 = field297[arg3];
            if (var34 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(99);
                field298.method2079(class124.field1975[82] ? 1 : 0);
                field298.method2120(arg3);
            }
        }
        if (arg2 == 22) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(135);
            field298.method2120(arg3);
            field298.method2101(Statics.field1870 + arg0);
            field298.method2137(Statics.field47 + arg1);
            field298.method2114(class124.field1975[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field298.method2335(104);
            field298.method2120(arg3);
            field298.method2244(arg1);
            field298.method2137(arg0);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 40) {
            field298.method2335(191);
            field298.method2100(arg0);
            field298.method2100(arg3);
            field298.method2247(arg1);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 19) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(228);
            field298.method2100(Statics.field1870 + arg0);
            field298.method2115(class124.field1975[82] ? 1 : 0);
            field298.method2137(Statics.field47 + arg1);
            field298.method2120(arg3);
        }
        if (arg2 == 42) {
            field298.method2335(39);
            field298.method2101(arg0);
            field298.method2100(arg3);
            field298.method2132(arg1);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 8) {
            class30 var35 = field295[arg3];
            if (var35 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(241);
                field298.method2100(arg3);
                field298.method2114(class124.field1975[82] ? 1 : 0);
                field298.method2244(Statics.field1300);
                field298.method2137(field305);
            }
        }
        if (arg2 == 20) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(146);
            field298.method2137(Statics.field1870 + arg0);
            field298.method2169(class124.field1975[82] ? 1 : 0);
            field298.method2137(Statics.field47 + arg1);
            field298.method2120(arg3);
        }
        if (arg2 == 28) {
            field298.method2335(48);
            field298.method2247(arg1);
            class153 var36 = class153.method1565(arg1);
            if (var36.field2574 != null && var36.field2574[0][0] == 5) {
                int var37 = var36.field2574[0][1];
                class155.field2684[var37] = 1 - class155.field2684[var37];
                method2408(var37);
            }
        }
        if (arg2 == 51) {
            class3 var38 = field297[arg3];
            if (var38 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(19);
                field298.method2120(arg3);
                field298.method2079(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var39 = field297[arg3];
            if (var39 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(76);
                field298.method2132(Statics.field50);
                field298.method2137(Statics.field1826);
                field298.method2120(Statics.field74);
                field298.method2079(class124.field1975[82] ? 1 : 0);
                field298.method2137(arg3);
            }
        }
        if (arg2 == 39) {
            field298.method2335(58);
            field298.method2101(arg3);
            field298.method2247(arg1);
            field298.method2100(arg0);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 34) {
            field298.method2335(234);
            field298.method2132(arg1);
            field298.method2120(arg3);
            field298.method2101(arg0);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 25) {
            class153 var40 = class153.method2544(arg1, arg0);
            if (var40 != null) {
                method2373();
                int var43 = method1833(var40);
                int var44 = var43 >> 11 & 0x3F;
                method472(arg1, arg0, var44, var40.field2660);
                field410 = 0;
                field311 = Statics.method2667(var40);
                if (field311 == null) {
                    field311 = "Null";
                }
                if (var40.field2635) {
                    field416 = var40.field2647 + class2.method1850(16777215);
                } else {
                    field416 = class2.method1850(65280) + var40.field2656 + class2.method1850(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(25);
            field298.method2101(Statics.field47 + arg1);
            field298.method2100(Statics.field1870 + arg0);
            field298.method2100(arg3);
            field298.method2137(field305);
            field298.method2169(class124.field1975[82] ? 1 : 0);
            field298.method2132(Statics.field1300);
        }
        if (arg2 == 49) {
            class3 var45 = field297[arg3];
            if (var45 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(221);
                field298.method2137(arg3);
                field298.method2079(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field298.method2335(26);
            field298.method2120(arg3);
            field298.method2101(arg0);
            field298.method2247(arg1);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 50) {
            class3 var46 = field297[arg3];
            if (var46 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(42);
                field298.method2100(arg3);
                field298.method2115(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class30 var47 = field295[arg3];
            if (var47 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(29);
                field298.method2100(arg3);
                field298.method2115(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field298.method2335(49);
            field298.method2101(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 33) {
            field298.method2335(106);
            field298.method2247(arg1);
            field298.method2100(arg0);
            field298.method2137(arg3);
            field366 = 0;
            Statics.field1273 = class153.method1565(arg1);
            field467 = arg0;
        }
        if (arg2 == 15) {
            class3 var48 = field297[arg3];
            if (var48 != null) {
                field362 = arg6;
                field363 = arg7;
                field376 = 2;
                field304 = 0;
                field415 = arg0;
                field430 = arg1;
                field298.method2335(130);
                field298.method2120(arg3);
                field298.method2120(field305);
                field298.method2132(Statics.field1300);
                field298.method2169(class124.field1975[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field298.method2335(74);
            field298.method2120(arg3);
        }
        if (arg2 == 6) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(150);
            field298.method2137(Statics.field1870 + arg0);
            field298.method2079(class124.field1975[82] ? 1 : 0);
            field298.method2100(Statics.field47 + arg1);
            field298.method2120(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 5) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(85);
            field298.method2137(Statics.field1870 + arg0);
            field298.method2100(arg3 >> 14 & 0x7FFF);
            field298.method2115(class124.field1975[82] ? 1 : 0);
            field298.method2137(Statics.field47 + arg1);
        }
        if (arg2 == 16) {
            field362 = arg6;
            field363 = arg7;
            field376 = 2;
            field304 = 0;
            field415 = arg0;
            field430 = arg1;
            field298.method2335(12);
            field298.method2169(class124.field1975[82] ? 1 : 0);
            field298.method2101(Statics.field74);
            field298.method2101(arg3);
            field298.method2137(Statics.field1870 + arg0);
            field298.method2137(Statics.field47 + arg1);
            field298.method2247(Statics.field50);
            field298.method2101(Statics.field1826);
        }
        if (field410 != 0) {
            field410 = 0;
            method1830(class153.method1565(Statics.field50));
        }
        if (field515) {
            method2373();
        }
        if (Statics.field1273 != null && field366 == 0) {
            method1830(Statics.field1273);
        }
    }

    @ObfuscatedName("o.bm(ILjava/lang/String;I)V")
    public static void method110(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field419; var3++) {
            class3 var4 = field297[field377[var3]];
            if (var4 != null && var4.field45 != null && var4.field45.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field298.method2335(99);
                    field298.method2079(0);
                    field298.method2120(field377[var3]);
                } else if (arg0 == 4) {
                    field298.method2335(223);
                    field298.method2100(field377[var3]);
                    field298.method2114(0);
                } else if (arg0 == 6) {
                    field298.method2335(221);
                    field298.method2137(field377[var3]);
                    field298.method2079(0);
                } else if (arg0 == 7) {
                    field298.method2335(42);
                    field298.method2100(field377[var3]);
                    field298.method2115(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method469(4, "", class143.field2319 + arg1);
        }
    }

    @ObfuscatedName("n.bo(IIIIB)V")
    public static void method472(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class153.method2544(arg0, arg1);
        if (var4 != null && var4.field2616 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field5 = var4.field2616;
            class32.method44(var5);
        }
        field321 = arg3;
        field515 = true;
        Statics.field1300 = arg0;
        field305 = arg1;
        Statics.field1677 = arg2;
        method1830(var4);
    }

    @ObfuscatedName("da.bv(I)V")
    public static void method2373() {
        if (!field515) {
            return;
        }
        class153 var0 = class153.method2544(Statics.field1300, field305);
        if (var0 != null && var0.field2628 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field5 = var0.field2628;
            class32.method44(var1);
        }
        field515 = false;
        method1830(var0);
    }

    @ObfuscatedName("dd.bh(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2409(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field334 || field399 >= 500) {
            return;
        }
        field404[field399] = arg0;
        field405[field399] = arg1;
        field308[field399] = arg2;
        field403[field399] = arg3;
        field400[field399] = arg4;
        field401[field399] = arg5;
        field399++;
    }

    @ObfuscatedName("ab.bx(I)V")
    public static void method1010() {
        for (int var0 = 0; var0 < field399; var0++) {
            if (method161(field308[var0])) {
                if (var0 < field399 - 1) {
                    for (int var1 = var0; var1 < field399 - 1; var1++) {
                        field404[var1] = field404[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field308[var1] = field308[var1 + 1];
                        field403[var1] = field403[var1 + 1];
                        field400[var1] = field400[var1 + 1];
                        field401[var1] = field401[var1 + 1];
                    }
                }
                field399--;
            }
        }
    }

    @ObfuscatedName("t.bk(IS)Z")
    public static boolean method161(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("w.bt(II)Ljava/lang/String;")
    public static String method37(int arg0) {
        return field405[arg0].length() > 0 ? field404[arg0] + class143.field2277 + field405[arg0] : field404[arg0];
    }

    @ObfuscatedName("ep.bg(Lae;IIII)V")
    public static final void method2663(class35 arg0, int arg1, int arg2, int arg3) {
        if (field399 >= 400) {
            return;
        }
        if (arg0.field835 != null) {
            arg0 = arg0.method596();
        }
        if (arg0 == null || !arg0.field838 || arg0.field840 && field425 != arg1) {
            return;
        }
        String var4 = arg0.field810;
        if (arg0.field832 != 0) {
            int var6 = arg0.field832;
            int var7 = Statics.field1767.field36;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1850(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1850(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1850(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1850(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1850(65280);
            } else if (var8 > 6) {
                var9 = class2.method1850(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1850(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1850(12648192);
            } else {
                var9 = class2.method1850(16776960);
            }
            var4 = var4 + var9 + " " + class2.field18 + class143.field2326 + arg0.field832 + class2.field19;
        }
        if (field410 == 1) {
            method2409(class143.field2320, field411 + " " + class2.field25 + " " + class2.method1850(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field515) {
            String[] var10 = arg0.field825;
            if (field428) {
                var10 = method2546(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class143.field2322)) {
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
                        method2409(var10[var11], class2.method1850(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class143.field2322)) {
                        short var14 = 0;
                        if (field286 == class18.field519 || field286 == class18.field525 && arg0.field832 > Statics.field1767.field36) {
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
                        method2409(var10[var13], class2.method1850(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method2409(class143.field2265, class2.method1850(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1677 & 0x2) == 2) {
            method2409(field311, field416 + " " + class2.field25 + " " + class2.method1850(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ew.br(Lk;IIII)V")
    public static final void method2660(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1767 == arg0 || field399 >= 400) {
            return;
        }
        String var9;
        if (arg0.field32 == 0) {
            String var4 = arg0.field45;
            int var5 = arg0.field36;
            int var6 = Statics.field1767.field36;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1850(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1850(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1850(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1850(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1850(65280);
            } else if (var7 > 6) {
                var8 = class2.method1850(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1850(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1850(12648192);
            } else {
                var8 = class2.method1850(16776960);
            }
            var9 = var4 + var8 + " " + class2.field18 + class143.field2326 + arg0.field36 + class2.field19;
        } else {
            var9 = arg0.field45 + " " + class2.field18 + class143.field2327 + arg0.field32 + class2.field19;
        }
        if (field410 == 1) {
            method2409(class143.field2320, field411 + " " + class2.field25 + " " + class2.method1850(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field515) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field386[var10] != null) {
                    short var11 = 0;
                    if (field386[var10].equalsIgnoreCase(class143.field2322)) {
                        if (field286 == class18.field519 || field286 == class18.field525 && arg0.field36 > Statics.field1767.field36) {
                            var11 = 2000;
                        }
                        if (Statics.field1767.field37 != 0 && arg0.field37 != 0) {
                            if (Statics.field1767.field37 == arg0.field37) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field387[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field385[var10] + var11;
                    method2409(field386[var10], class2.method1850(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1677 & 0x8) == 8) {
            method2409(field311, field416 + " " + class2.field25 + " " + class2.method1850(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field399; var14++) {
            if (field308[var14] == 23) {
                field405[var14] = class2.method1850(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("eg.bj(IIIIIIIII)V")
    public static final void method2863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class153.method2498(arg0)) {
            Statics.field209 = null;
            method156(Statics.field2556[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field209 != null) {
                method156(Statics.field209, -1412584499, arg1, arg2, arg3, arg4, Statics.field1823, Statics.field69, arg7);
                Statics.field209 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field461[var8] = true;
            }
        } else {
            field461[arg7] = true;
        }
    }

    @ObfuscatedName("t.bp([Leq;IIIIIIIII)V")
    public static final void method156(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1486(arg2, arg3, arg4, arg5);
        class84.method1747();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class153 var10 = arg0[var9];
            if (var10 != null && (var10.field2654 == arg1 || arg1 == -1412584499 && field429 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field464[field459] = var10.field2581 + arg6;
                    field465[field459] = var10.field2562 + arg7;
                    field466[field459] = var10.field2565;
                    field281[field459] = var10.field2603;
                    var11 = ++field459 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2671 = var11;
                var10.field2672 = field269;
                if (!var10.field2635 || !method1948(var10)) {
                    if (var10.field2560 > 0) {
                        int var12 = var10.field2560;
                        if (var12 == 324) {
                            if (field514 == -1) {
                                field514 = var10.field2580;
                                field412 = var10.field2552;
                            }
                            if (field358.field2690) {
                                var10.field2580 = field514;
                            } else {
                                var10.field2580 = field412;
                            }
                        } else if (var12 == 325) {
                            if (field514 == -1) {
                                field514 = var10.field2580;
                                field412 = var10.field2552;
                            }
                            if (field358.field2690) {
                                var10.field2580 = field412;
                            } else {
                                var10.field2580 = field514;
                            }
                        } else if (var12 == 327) {
                            var10.field2578 = 150;
                            var10.field2550 = (int) (Math.sin((double) field269 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2588 = 5;
                            var10.field2589 = 0;
                        } else if (var12 == 328) {
                            var10.field2578 = 150;
                            var10.field2550 = (int) (Math.sin((double) field269 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2588 = 5;
                            var10.field2589 = 1;
                        }
                    }
                    int var13 = var10.field2581 + arg6;
                    int var14 = var10.field2562 + arg7;
                    int var15 = var10.field2548;
                    if (field429 == var10) {
                        if (arg1 != -1412584499 && !var10.field2621) {
                            Statics.field209 = arg0;
                            Statics.field1823 = arg6;
                            Statics.field69 = arg7;
                            continue;
                        }
                        if (field495 && field434) {
                            int var16 = class127.field2008;
                            int var17 = class127.field2013;
                            int var18 = var16 - field331;
                            int var19 = var17 - field432;
                            if (var18 < field435) {
                                var18 = field435;
                            }
                            if (var10.field2565 + var18 > field435 + field364.field2565) {
                                var18 = field435 + field364.field2565 - var10.field2565;
                            }
                            if (var19 < field317) {
                                var19 = field317;
                            }
                            if (var10.field2603 + var19 > field317 + field364.field2603) {
                                var19 = field317 + field364.field2603 - var10.field2603;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2621) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2558 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2558 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2565 + var13;
                        int var27 = var10.field2603 + var14;
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
                        int var30 = var10.field2565 + var13;
                        int var31 = var10.field2603 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2635 || var20 < var22 && var21 < var23) {
                        if (var10.field2560 != 0) {
                            if (var10.field2560 == 1337) {
                                field406 = var13;
                                field407 = var14;
                                int var32 = var10.field2565;
                                int var33 = var10.field2603;
                                class73.method1486(var13, var14, var13 + var32, var14 + var33);
                                class84.method1747();
                                field423++;
                                method12(class29.field704);
                                boolean var34 = false;
                                if (field389 >= 0) {
                                    for (int var35 = 0; var35 < field419; var35++) {
                                        if (field389 == field377[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method12(class29.field695);
                                }
                                Statics.method807(true);
                                method12(var34 ? class29.field698 : class29.field701);
                                Statics.method807(false);
                                for (class7 var36 = (class7) field296.method3200(); var36 != null; var36 = (class7) field296.method3209()) {
                                    if (Statics.field1 != var36.field119 || field269 > var36.field106) {
                                        var36.method3304();
                                    } else if (field269 >= var36.field105) {
                                        if (var36.field123 > 0) {
                                            class30 var37 = field295[var36.field123 - 1];
                                            if (var37 != null && var37.field780 >= 0 && var37.field780 < 13312 && var37.field761 >= 0 && var37.field761 < 13312) {
                                                var36.method85(var37.field780, var37.field761, method584(var37.field780, var37.field761, var36.field119) - var36.field104, field269);
                                            }
                                        }
                                        if (var36.field123 < 0) {
                                            int var38 = -var36.field123 - 1;
                                            class3 var39;
                                            if (field444 == var38) {
                                                var39 = Statics.field1767;
                                            } else {
                                                var39 = field297[var38];
                                            }
                                            if (var39 != null && var39.field780 >= 0 && var39.field780 < 13312 && var39.field761 >= 0 && var39.field761 < 13312) {
                                                var36.method85(var39.field780, var39.field761, method584(var39.field780, var39.field761, var36.field119) - var36.field104, field269);
                                            }
                                        }
                                        var36.method84(field294);
                                        Statics.field2085.method1586(Statics.field1, (int) var36.field116, (int) var36.field112, (int) var36.field113, 60, var36, var36.field124, -1, false);
                                    }
                                }
                                for (class26 var40 = (class26) field443.method3200(); var40 != null; var40 = (class26) field443.method3209()) {
                                    if (Statics.field1 != var40.field629 || var40.field636) {
                                        var40.method3304();
                                    } else if (field269 >= var40.field628) {
                                        var40.method515(field294);
                                        if (var40.field636) {
                                            var40.method3304();
                                        } else {
                                            Statics.field2085.method1586(var40.field629, var40.field627, var40.field631, var40.field632, 60, var40, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field501) {
                                    int var41 = field339;
                                    if (field347 / 256 > var41) {
                                        var41 = field347 / 256;
                                    }
                                    if (field487[4] && field289[4] + 128 > var41) {
                                        var41 = field289[4] + 128;
                                    }
                                    int var42 = field503 + field324 & 0x7FF;
                                    method664(Statics.field1666, method584(Statics.field1767.field780, Statics.field1767.field761, Statics.field1) - 50, Statics.field587, var41, var42, var41 * 3 + 600);
                                }
                                int var43;
                                if (field501) {
                                    int var44;
                                    if (Statics.field1459.field140) {
                                        var44 = Statics.field1;
                                    } else {
                                        int var45 = method584(Statics.field721, Statics.field849, Statics.field1);
                                        if (var45 - Statics.field13 >= 800 || (class6.field76[Statics.field1][Statics.field721 >> 7][Statics.field849 >> 7] & 0x4) == 0) {
                                            var44 = 3;
                                        } else {
                                            var44 = Statics.field1;
                                        }
                                    }
                                    var43 = var44;
                                } else {
                                    var43 = method475();
                                }
                                int var46 = Statics.field721;
                                int var47 = Statics.field13;
                                int var48 = Statics.field849;
                                int var49 = Statics.field161;
                                int var50 = Statics.field1863;
                                for (int var51 = 0; var51 < 5; var51++) {
                                    if (field487[var51]) {
                                        int var52 = (int) (Math.random() * (double) (field372[var51] * 2 + 1) - (double) field372[var51] + Math.sin((double) field263[var51] / 100.0D * (double) field332[var51]) * (double) field289[var51]);
                                        if (var51 == 0) {
                                            Statics.field721 += var52;
                                        }
                                        if (var51 == 1) {
                                            Statics.field13 += var52;
                                        }
                                        if (var51 == 2) {
                                            Statics.field849 += var52;
                                        }
                                        if (var51 == 3) {
                                            Statics.field1863 = Statics.field1863 + var52 & 0x7FF;
                                        }
                                        if (var51 == 4) {
                                            Statics.field161 += var52;
                                            if (Statics.field161 < 128) {
                                                Statics.field161 = 128;
                                            }
                                            if (Statics.field161 > 383) {
                                                Statics.field161 = 383;
                                            }
                                        }
                                    }
                                }
                                int var53 = class127.field2008;
                                int var54 = class127.field2013;
                                if (class127.field2018 != 0) {
                                    var53 = class127.field2017;
                                    var54 = class127.field2020;
                                }
                                if (var53 >= var13 && var53 < var13 + var32 && var54 >= var14 && var54 < var14 + var33) {
                                    class98.field1709 = true;
                                    class98.field1753 = 0;
                                    class98.field1751 = var53 - var13;
                                    class98.field1752 = var54 - var14;
                                } else {
                                    class98.field1709 = false;
                                    class98.field1753 = 0;
                                }
                                method752();
                                class73.method1492(var13, var14, var32, var33, 0);
                                method752();
                                Statics.field2085.method1710(Statics.field721, Statics.field13, Statics.field849, Statics.field161, Statics.field1863, var43);
                                method752();
                                Statics.field2085.method1681();
                                field456 = 0;
                                boolean var55 = false;
                                int var56 = -1;
                                for (int var57 = -1; var57 < field419 + field369; var57++) {
                                    class33 var58;
                                    if (var57 == -1) {
                                        var58 = Statics.field1767;
                                    } else if (var57 < field419) {
                                        var58 = field297[field377[var57]];
                                        if (field389 == field377[var57]) {
                                            var55 = true;
                                            var56 = var57;
                                            continue;
                                        }
                                    } else {
                                        var58 = field295[field486[var57 - field419]];
                                    }
                                    method460(var58, var57, var13, var14, var32, var33);
                                }
                                if (var55) {
                                    method460(field297[field389], var56, var13, var14, var32, var33);
                                }
                                for (int var59 = 0; var59 < field456; var59++) {
                                    int var60 = field350[var59];
                                    int var61 = field351[var59];
                                    int var62 = field353[var59];
                                    int var63 = field352[var59];
                                    boolean var64 = true;
                                    while (var64) {
                                        var64 = false;
                                        for (int var65 = 0; var65 < var59; var65++) {
                                            if (var61 + 2 > field351[var65] - field352[var65] && var61 - var63 < field351[var65] + 2 && var60 - var62 < field353[var65] + field350[var65] && var60 + var62 > field350[var65] - field353[var65] && field351[var65] - field352[var65] < var61) {
                                                var61 = field351[var65] - field352[var65];
                                                var64 = true;
                                            }
                                        }
                                    }
                                    field381 = field350[var59];
                                    field361 = field351[var59] = var61;
                                    String var66 = field357[var59];
                                    if (field402 == 0) {
                                        int var67 = 16776960;
                                        if (field340[var59] < 6) {
                                            var67 = field469[field340[var59]];
                                        }
                                        if (field340[var59] == 6) {
                                            var67 = field423 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field340[var59] == 7) {
                                            var67 = field423 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field340[var59] == 8) {
                                            var67 = field423 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field340[var59] == 9) {
                                            int var68 = 150 - field510[var59];
                                            if (var68 < 50) {
                                                var67 = var68 * 1280 + 16711680;
                                            } else if (var68 < 100) {
                                                var67 = 16776960 - (var68 - 50) * 327680;
                                            } else if (var68 < 150) {
                                                var67 = (var68 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field340[var59] == 10) {
                                            int var69 = 150 - field510[var59];
                                            if (var69 < 50) {
                                                var67 = var69 * 5 + 16711680;
                                            } else if (var69 < 100) {
                                                var67 = 16711935 - (var69 - 50) * 327680;
                                            } else if (var69 < 150) {
                                                var67 = (var69 - 100) * 327680 + 255 - (var69 - 100) * 5;
                                            }
                                        }
                                        if (field340[var59] == 11) {
                                            int var70 = 150 - field510[var59];
                                            if (var70 < 50) {
                                                var67 = 16777215 - var70 * 327685;
                                            } else if (var70 < 100) {
                                                var67 = (var70 - 50) * 327685 + 65280;
                                            } else if (var70 < 150) {
                                                var67 = 16777215 - (var70 - 100) * 327680;
                                            }
                                        }
                                        if (field326[var59] == 0) {
                                            Statics.field1817.method3393(var66, field381 + var13, field361 + var14, var67, 0);
                                        }
                                        if (field326[var59] == 1) {
                                            Statics.field1817.method3338(var66, field381 + var13, field361 + var14, var67, 0, field423);
                                        }
                                        if (field326[var59] == 2) {
                                            Statics.field1817.method3339(var66, field381 + var13, field361 + var14, var67, 0, field423);
                                        }
                                        if (field326[var59] == 3) {
                                            Statics.field1817.method3340(var66, field381 + var13, field361 + var14, var67, 0, field423, 150 - field510[var59]);
                                        }
                                        if (field326[var59] == 4) {
                                            int var71 = (150 - field510[var59]) * (Statics.field1817.method3337(var66) + 100) / 150;
                                            class73.method1487(field381 + var13 - 50, var14, field381 + var13 + 50, var14 + var33);
                                            Statics.field1817.method3361(var66, field381 + var13 + 50 - var71, field361 + var14, var67, 0);
                                            class73.method1486(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field326[var59] == 5) {
                                            int var72 = 150 - field510[var59];
                                            int var73 = 0;
                                            if (var72 < 25) {
                                                var73 = var72 - 25;
                                            } else if (var72 > 125) {
                                                var73 = var72 - 125;
                                            }
                                            class73.method1487(var13, field361 + var14 - Statics.field1817.field2930 - 1, var13 + var32, field361 + var14 + 5);
                                            Statics.field1817.method3393(var66, field381 + var13, field361 + var14 + var73, var67, 0);
                                            class73.method1486(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field1817.method3393(var66, field381 + var13, field361 + var14, 16776960, 0);
                                    }
                                }
                                method3317(var13, var14);
                                ((class88) Statics.field1488).method1841(field294);
                                if (field376 == 1) {
                                    Statics.field1004[field304 / 100].method1453(field362 - 8, field363 - 8);
                                }
                                if (field376 == 2) {
                                    Statics.field1004[field304 / 100 + 4].method1453(field362 - 8, field363 - 8);
                                }
                                method2680();
                                if (field440) {
                                    int var74 = var13 + 512 - 5;
                                    int var75 = var14 + 20;
                                    Statics.field148.method3335("Fps:" + field2051, var74, var75, 16776960, -1);
                                    int var161 = var75 + 15;
                                    Runtime var76 = Runtime.getRuntime();
                                    int var77 = (int) ((var76.totalMemory() - var76.freeMemory()) / 1024L);
                                    int var78 = 16776960;
                                    if (var77 > 32768 && field265) {
                                        var78 = 16711680;
                                    }
                                    if (var77 > 65536 && !field265) {
                                        var78 = 16711680;
                                    }
                                    Statics.field148.method3335("Mem:" + var77 + "k", var74, var161, var78, -1);
                                    var75 = var161 + 15;
                                }
                                Statics.field721 = var46;
                                Statics.field13 = var47;
                                Statics.field849 = var48;
                                Statics.field161 = var49;
                                Statics.field1863 = var50;
                                if (field268) {
                                    byte var79 = 0;
                                    int var80 = class151.field2524 + class151.field2522 + var79;
                                    if (var80 == 0) {
                                        field268 = false;
                                    }
                                }
                                if (field268) {
                                    class73.method1492(var13, var14, var32, var33, 0);
                                    method2329(class143.field2179, false);
                                }
                                class73.method1486(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2560 == 1338) {
                                method150(var13, var14, var11);
                                class73.method1486(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2558 == 0) {
                            if (!var10.field2635 && method1948(var10) && Statics.field533 != var10) {
                                continue;
                            }
                            if (!var10.field2635) {
                                if (var10.field2659 > var10.field2639 - var10.field2603) {
                                    var10.field2659 = var10.field2639 - var10.field2603;
                                }
                                if (var10.field2659 < 0) {
                                    var10.field2659 = 0;
                                }
                            }
                            method156(arg0, var10.field2583, var20, var21, var22, var23, var13 - var10.field2569, var14 - var10.field2659, var11);
                            if (var10.field2664 != null) {
                                method156(var10.field2664, var10.field2583, var20, var21, var22, var23, var13 - var10.field2569, var14 - var10.field2659, var11);
                            }
                            class4 var82 = (class4) field418.method3174((long) var10.field2583);
                            if (var82 != null) {
                                method2863(var82.field55, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1486(arg2, arg3, arg4, arg5);
                            class84.method1747();
                        }
                        if (field463[var11] || field468 > 1) {
                            if (var10.field2558 == 0 && !var10.field2635 && var10.field2639 > var10.field2603) {
                                method136(var10.field2565 + var13, var14, var10.field2659, var10.field2603, var10.field2639);
                            }
                            if (var10.field2558 != 1) {
                                if (var10.field2558 == 2) {
                                    int var83 = 0;
                                    for (int var84 = 0; var84 < var10.field2603; var84++) {
                                        for (int var85 = 0; var85 < var10.field2565; var85++) {
                                            int var86 = (var10.field2609 + 32) * var85 + var13;
                                            int var87 = (var10.field2610 + 32) * var84 + var14;
                                            if (var83 < 20) {
                                                var86 += var10.field2611[var83];
                                                var87 += var10.field2612[var83];
                                            }
                                            if (var10.field2658[var83] > 0) {
                                                boolean var88 = false;
                                                boolean var89 = false;
                                                int var90 = var10.field2658[var83] - 1;
                                                if (var86 + 32 > arg2 && var86 < arg4 && var87 + 32 > arg3 && var87 < arg5 || Statics.field1668 == var10 && field368 == var83) {
                                                    class72 var91;
                                                    if (field410 == 1 && Statics.field74 == var83 && Statics.field50 == var10.field2583) {
                                                        var91 = Statics.method9(var90, var10.field2596[var83], 2, 0, false);
                                                    } else {
                                                        var91 = Statics.method9(var90, var10.field2596[var83], 1, 3153952, false);
                                                    }
                                                    if (var91 == null) {
                                                        method1830(var10);
                                                    } else if (Statics.field1668 == var10 && field368 == var83) {
                                                        int var92 = class127.field2008 - field284;
                                                        int var93 = class127.field2013 - field452;
                                                        if (var92 < 5 && var92 > -5) {
                                                            var92 = 0;
                                                        }
                                                        if (var93 < 5 && var93 > -5) {
                                                            var93 = 0;
                                                        }
                                                        if (field373 < 5) {
                                                            var92 = 0;
                                                            var93 = 0;
                                                        }
                                                        var91.method1410(var86 + var92, var87 + var93, 128);
                                                        if (arg1 != -1) {
                                                            class153 var94 = arg0[arg1 & 0xFFFF];
                                                            if (var87 + var93 < class73.field1321 && var94.field2659 > 0) {
                                                                int var95 = field294 * (class73.field1321 - var87 - var93) / 3;
                                                                if (var95 > field294 * 10) {
                                                                    var95 = field294 * 10;
                                                                }
                                                                if (var95 > var94.field2659) {
                                                                    var95 = var94.field2659;
                                                                }
                                                                var94.field2659 -= var95;
                                                                field452 += var95;
                                                                method1830(var94);
                                                            }
                                                            if (var87 + var93 + 32 > class73.field1318 && var94.field2659 < var94.field2639 - var94.field2603) {
                                                                int var96 = field294 * (var87 + var93 + 32 - class73.field1318) / 3;
                                                                if (var96 > field294 * 10) {
                                                                    var96 = field294 * 10;
                                                                }
                                                                if (var96 > var94.field2639 - var94.field2603 - var94.field2659) {
                                                                    var96 = var94.field2639 - var94.field2603 - var94.field2659;
                                                                }
                                                                var94.field2659 += var96;
                                                                field452 -= var96;
                                                                method1830(var94);
                                                            }
                                                        }
                                                    } else if (Statics.field1273 == var10 && field467 == var83) {
                                                        var91.method1410(var86, var87, 128);
                                                    } else {
                                                        var91.method1453(var86, var87);
                                                    }
                                                }
                                            } else if (var10.field2549 != null && var83 < 20) {
                                                class72 var97 = var10.method2849(var83);
                                                if (var97 != null) {
                                                    var97.method1453(var86, var87);
                                                } else if (class153.field2554) {
                                                    method1830(var10);
                                                }
                                            }
                                            var83++;
                                        }
                                    }
                                } else if (var10.field2558 == 3) {
                                    int var98;
                                    if (method462(var10)) {
                                        var98 = var10.field2600;
                                        if (Statics.field533 == var10 && var10.field2576 != 0) {
                                            var98 = var10.field2576;
                                        }
                                    } else {
                                        var98 = var10.field2573;
                                        if (Statics.field533 == var10 && var10.field2575 != 0) {
                                            var98 = var10.field2575;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2546) {
                                            class73.method1492(var13, var14, var10.field2565, var10.field2603, var98);
                                        } else {
                                            class73.method1494(var13, var14, var10.field2565, var10.field2603, var98);
                                        }
                                    } else if (var10.field2546) {
                                        class73.method1504(var13, var14, var10.field2565, var10.field2603, var98, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1495(var13, var14, var10.field2565, var10.field2603, var98, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2558 == 4) {
                                    class194 var99 = var10.method2823();
                                    if (var99 != null) {
                                        String var100 = var10.field2620;
                                        int var101;
                                        if (method462(var10)) {
                                            var101 = var10.field2600;
                                            if (Statics.field533 == var10 && var10.field2576 != 0) {
                                                var101 = var10.field2576;
                                            }
                                            if (var10.field2604.length() > 0) {
                                                var100 = var10.field2604;
                                            }
                                        } else {
                                            var101 = var10.field2573;
                                            if (Statics.field533 == var10 && var10.field2575 != 0) {
                                                var101 = var10.field2575;
                                            }
                                        }
                                        if (var10.field2635 && var10.field2660 != -1) {
                                            class45 var102 = Statics.method2406(var10.field2660);
                                            var100 = var102.field1026;
                                            if (var100 == null) {
                                                var100 = "null";
                                            }
                                            if ((var102.field1025 == 1 || var10.field2661 != 1) && var10.field2661 != -1) {
                                                var100 = class2.method1850(16748608) + var100 + class2.field22 + " " + 'x' + method90(var10.field2661);
                                            }
                                        }
                                        if (field436 == var10) {
                                            class143 var10000 = (class143) null;
                                            var100 = class143.field2262;
                                            var101 = var10.field2573;
                                        }
                                        if (!var10.field2635) {
                                            var100 = Statics.method162(var100, var10);
                                        }
                                        var99.method3348(var100, var13, var14, var10.field2565, var10.field2603, var101, var10.field2566 ? 0 : -1, var10.field2606, var10.field2607, var10.field2605);
                                    } else if (class153.field2554) {
                                        method1830(var10);
                                    }
                                } else if (var10.field2558 == 5) {
                                    if (var10.field2635) {
                                        class72 var104;
                                        if (var10.field2660 == -1) {
                                            var104 = var10.method2822(false);
                                        } else {
                                            var104 = Statics.method9(var10.field2660, var10.field2661, var10.field2584, var10.field2634, false);
                                        }
                                        if (var104 != null) {
                                            int var105 = var104.field1311;
                                            int var106 = var104.field1306;
                                            if (var10.field2673) {
                                                class73.method1487(var13, var14, var10.field2565 + var13, var10.field2603 + var14);
                                                int var107 = (var10.field2565 + (var105 - 1)) / var105;
                                                int var108 = (var10.field2603 + (var106 - 1)) / var106;
                                                for (int var109 = 0; var109 < var107; var109++) {
                                                    for (int var110 = 0; var110 < var108; var110++) {
                                                        if (var10.field2582 != 0) {
                                                            var104.method1446(var105 / 2 + var105 * var109 + var13, var106 / 2 + var106 * var110 + var14, var10.field2582, 4096);
                                                        } else if (var15 == 0) {
                                                            var104.method1453(var105 * var109 + var13, var106 * var110 + var14);
                                                        } else {
                                                            var104.method1410(var105 * var109 + var13, var106 * var110 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1486(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var111 = var10.field2565 * 4096 / var105;
                                                if (var10.field2582 != 0) {
                                                    var104.method1446(var10.field2565 / 2 + var13, var10.field2603 / 2 + var14, var10.field2582, var111);
                                                } else if (var15 != 0) {
                                                    var104.method1412(var13, var14, var10.field2565, var10.field2603, 256 - (var15 & 0xFF));
                                                } else if (var10.field2565 == var105 && var10.field2603 == var106) {
                                                    var104.method1453(var13, var14);
                                                } else {
                                                    var104.method1406(var13, var14, var10.field2565, var10.field2603);
                                                }
                                            }
                                        } else if (class153.field2554) {
                                            method1830(var10);
                                        }
                                    } else {
                                        class72 var103 = var10.method2822(method462(var10));
                                        if (var103 != null) {
                                            var103.method1453(var13, var14);
                                        } else if (class153.field2554) {
                                            method1830(var10);
                                        }
                                    }
                                } else if (var10.field2558 == 6) {
                                    boolean var112 = method462(var10);
                                    int var113;
                                    if (var112) {
                                        var113 = var10.field2593;
                                    } else {
                                        var113 = var10.field2592;
                                    }
                                    class98 var114 = null;
                                    int var115 = 0;
                                    if (var10.field2660 != -1) {
                                        class45 var116 = Statics.method2406(var10.field2660);
                                        if (var116 != null) {
                                            class45 var117 = var116.method831(var10.field2661);
                                            var114 = var117.method830(1);
                                            if (var114 == null) {
                                                method1830(var10);
                                            } else {
                                                var114.method1955();
                                                var115 = var114.field1360 / 2;
                                            }
                                        }
                                    } else if (var10.field2588 == 5) {
                                        if (var10.field2589 == 0) {
                                            var114 = field358.method2900((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var114 = Statics.field1767.method14();
                                        }
                                    } else if (var113 == -1) {
                                        var114 = var10.method2825((class38) null, -1, var112, Statics.field1767.field35);
                                        if (var114 == null && class153.field2554) {
                                            method1830(var10);
                                        }
                                    } else {
                                        class38 var118 = class38.method552(var113);
                                        var114 = var10.method2825(var118, var10.field2626, var112, Statics.field1767.field35);
                                        if (var114 == null && class153.field2554) {
                                            method1830(var10);
                                        }
                                    }
                                    class84.method1802(var10.field2565 / 2 + var13, var10.field2603 / 2 + var14);
                                    int var119 = var10.field2599 * class84.field1491[var10.field2578] >> 16;
                                    int var120 = var10.field2599 * class84.field1492[var10.field2578] >> 16;
                                    if (var114 != null) {
                                        if (var10.field2635) {
                                            var114.method1955();
                                            if (var10.field2652) {
                                                var114.method1967(0, var10.field2550, var10.field2598, var10.field2578, var10.field2594, var10.field2595 + var115 + var119, var10.field2595 + var120, var10.field2599);
                                            } else {
                                                var114.method2025(0, var10.field2550, var10.field2598, var10.field2578, var10.field2594, var10.field2595 + var115 + var119, var10.field2595 + var120);
                                            }
                                        } else {
                                            var114.method2025(0, var10.field2550, 0, var10.field2578, 0, var119, var120);
                                        }
                                    }
                                    class84.method1749();
                                } else {
                                    if (var10.field2558 == 7) {
                                        class194 var121 = var10.method2823();
                                        if (var121 == null) {
                                            if (class153.field2554) {
                                                method1830(var10);
                                            }
                                            continue;
                                        }
                                        int var122 = 0;
                                        for (int var123 = 0; var123 < var10.field2603; var123++) {
                                            for (int var124 = 0; var124 < var10.field2565; var124++) {
                                                if (var10.field2658[var122] > 0) {
                                                    class45 var125 = Statics.method2406(var10.field2658[var122] - 1);
                                                    String var126;
                                                    if (var125.field1025 != 1 && var10.field2596[var122] == 1) {
                                                        var126 = class2.method1850(16748608) + var125.field1026 + class2.field22;
                                                    } else {
                                                        var126 = class2.method1850(16748608) + var125.field1026 + class2.field22 + " " + 'x' + method90(var10.field2596[var122]);
                                                    }
                                                    int var127 = (var10.field2609 + 115) * var124 + var13;
                                                    int var128 = (var10.field2610 + 12) * var123 + var14;
                                                    if (var10.field2606 == 0) {
                                                        var121.method3361(var126, var127, var128, var10.field2573, var10.field2566 ? 0 : -1);
                                                    } else if (var10.field2606 == 1) {
                                                        var121.method3393(var126, var10.field2565 / 2 + var127, var128, var10.field2573, var10.field2566 ? 0 : -1);
                                                    } else {
                                                        var121.method3335(var126, var10.field2565 + var127 - 1, var128, var10.field2573, var10.field2566 ? 0 : -1);
                                                    }
                                                }
                                                var122++;
                                            }
                                        }
                                    }
                                    if (var10.field2558 == 8 && Statics.field65 == var10 && field409 == field408) {
                                        int var129 = 0;
                                        int var130 = 0;
                                        class194 var131 = Statics.field148;
                                        String var132 = var10.field2620;
                                        String var133 = Statics.method162(var132, var10);
                                        while (var133.length() > 0) {
                                            int var134 = var133.indexOf(class2.field21);
                                            String var135;
                                            if (var134 == -1) {
                                                var135 = var133;
                                                var133 = "";
                                            } else {
                                                var135 = var133.substring(0, var134);
                                                var133 = var133.substring(var134 + 4);
                                            }
                                            int var136 = var131.method3337(var135);
                                            if (var136 > var129) {
                                                var129 = var136;
                                            }
                                            var130 += var131.field2930 + 1;
                                        }
                                        var129 += 6;
                                        var130 += 7;
                                        int var137 = var10.field2565 + var13 - 5 - var129;
                                        int var138 = var10.field2603 + var14 + 5;
                                        if (var137 < var13 + 5) {
                                            var137 = var13 + 5;
                                        }
                                        if (var129 + var137 > arg4) {
                                            var137 = arg4 - var129;
                                        }
                                        if (var130 + var138 > arg5) {
                                            var138 = arg5 - var130;
                                        }
                                        class73.method1492(var137, var138, var129, var130, 16777120);
                                        class73.method1494(var137, var138, var129, var130, 0);
                                        String var139 = var10.field2620;
                                        int var140 = var131.field2930 + var138 + 2;
                                        String var141 = Statics.method162(var139, var10);
                                        while (var141.length() > 0) {
                                            int var142 = var141.indexOf(class2.field21);
                                            String var143;
                                            if (var142 == -1) {
                                                var143 = var141;
                                                var141 = "";
                                            } else {
                                                var143 = var141.substring(0, var142);
                                                var141 = var141.substring(var142 + 4);
                                            }
                                            var131.method3361(var143, var137 + 3, var140, 0, -1);
                                            var140 += var131.field2930 + 1;
                                        }
                                    }
                                    if (var10.field2558 == 9) {
                                        if (var10.field2579 == 1) {
                                            class73.method1499(var13, var14, var10.field2565 + var13, var10.field2603 + var14, var10.field2573);
                                        } else {
                                            int var144 = var10.field2565 >= 0 ? var10.field2565 : -var10.field2565;
                                            int var145 = var10.field2603 >= 0 ? var10.field2603 : -var10.field2603;
                                            int var146 = var144;
                                            if (var144 < var145) {
                                                var146 = var145;
                                            }
                                            if (var146 != 0) {
                                                int var147 = (var10.field2565 << 16) / var146;
                                                int var148 = (var10.field2603 << 16) / var146;
                                                if (var148 <= var147) {
                                                    var147 = -var147;
                                                } else {
                                                    var148 = -var148;
                                                }
                                                int var149 = var10.field2579 * var148 >> 17;
                                                int var150 = var10.field2579 * var148 + 1 >> 17;
                                                int var151 = var10.field2579 * var147 >> 17;
                                                int var152 = var10.field2579 * var147 + 1 >> 17;
                                                int var153 = var13 + var149;
                                                int var154 = var13 - var150;
                                                int var155 = var10.field2565 + var13 - var150;
                                                int var156 = var10.field2565 + var13 + var149;
                                                int var157 = var14 + var151;
                                                int var158 = var14 - var152;
                                                int var159 = var10.field2603 + var14 - var152;
                                                int var160 = var10.field2603 + var14 + var151;
                                                class84.method1780(var153, var154, var155);
                                                class84.method1757(var157, var158, var159, var153, var154, var155, var10.field2573);
                                                class84.method1780(var153, var155, var156);
                                                class84.method1757(var157, var159, var160, var153, var155, var156, var10.field2573);
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

    @ObfuscatedName("u.bl(II)Ljava/lang/String;")
    public static final String method90(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field26 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1850(65408) + var1.substring(0, var1.length() - 8) + class143.field2253 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method1850(16777215) + var1.substring(0, var1.length() - 4) + class143.field2333 + " " + class2.field18 + var1 + class2.field19 + class2.field22;
        } else {
            return " " + class2.method1850(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("e.cc(Leq;IIIIIII)V")
    public static final void method32(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field337) {
            field431 = 32;
        } else {
            field431 = 0;
        }
        field337 = false;
        if (class127.field2009 == 1 || !Statics.field235 && class127.field2009 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2659 -= 4;
                method1830(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2659 += 4;
                method1830(arg0);
            } else if (arg5 >= arg1 - field431 && arg5 < field431 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2659 = (arg4 - arg3) * var8 / var9;
                method1830(arg0);
                field337 = true;
            }
        }
        if (field511 == 0) {
            return;
        }
        int var10 = arg0.field2565;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2659 += field511 * 45;
            method1830(arg0);
        }
    }

    @ObfuscatedName("r.cm(IIIIIB)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field697[0].method1547(arg0, arg1);
        Statics.field697[1].method1547(arg0, arg1 + arg3 - 16);
        class73.method1492(arg0, arg1 + 16, 16, arg3 - 32, field333);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1492(arg0, arg1 + 16 + var6, 16, var5, field367);
        class73.method1498(arg0, arg1 + 16 + var6, var5, field336);
        class73.method1498(arg0 + 1, arg1 + 16 + var6, var5, field336);
        class73.method1496(arg0, arg1 + 16 + var6, 16, field336);
        class73.method1496(arg0, arg1 + 17 + var6, 16, field336);
        class73.method1498(arg0 + 15, arg1 + 16 + var6, var5, field335);
        class73.method1498(arg0 + 14, arg1 + 17 + var6, var5 - 1, field335);
        class73.method1496(arg0, arg1 + 15 + var6 + var5, 16, field335);
        class73.method1496(arg0 + 1, arg1 + 14 + var6 + var5, 15, field335);
    }

    @ObfuscatedName("z.ct(Leq;I)Z")
    public static final boolean method462(class153 arg0) {
        if (arg0.field2653 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2653.length; var1++) {
            int var2 = method2650(arg0, var1);
            int var3 = arg0.field2631[var1];
            if (arg0.field2653[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2653[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2653[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ek.co(Leq;II)I")
    public static final int method2650(class153 arg0, int arg1) {
        if (arg0.field2574 == null || arg1 >= arg0.field2574.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2574[arg1];
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
                    var7 = field394[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field395[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field516[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method1565(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method2406(var12).field1027 || field264)) {
                        for (int var13 = 0; var13 < var11.field2658.length; var13++) {
                            if (var12 + 1 == var11.field2658[var13]) {
                                var7 += var11.field2596[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2684[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2149[field395[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2684[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1767.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2152[var14]) {
                            var7 += field395[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method1565(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method2406(var18).field1027 || field264)) {
                        for (int var19 = 0; var19 < var17.field2658.length; var19++) {
                            if (var18 + 1 == var17.field2658[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field272;
                }
                if (var6 == 12) {
                    var7 = field299;
                }
                if (var6 == 13) {
                    int var20 = class155.field2684[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method879(var22);
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
                    var7 = (Statics.field1767.field780 >> 7) + Statics.field1870;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1767.field761 >> 7) + Statics.field47;
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

    @ObfuscatedName("al.cn([Leq;IIIIIIIB)V")
    public static final void method892(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class153 var9 = arg0[var8];
            if (var9 != null && (!var9.field2635 || var9.field2558 == 0 || var9.field2623 || method1833(var9) != 0 || field364 == var9) && var9.field2654 == arg1 && (!var9.field2635 || !method1948(var9))) {
                int var10 = var9.field2581 + arg6;
                int var11 = var9.field2562 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2558 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2558 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2565 + var10;
                    int var19 = var9.field2603 + var11;
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
                    int var22 = var9.field2565 + var10;
                    int var23 = var9.field2603 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field429 == var9) {
                    field437 = true;
                    field438 = var10;
                    field439 = var11;
                }
                if (!var9.field2635 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2008;
                    int var25 = class127.field2013;
                    if (class127.field2018 != 0) {
                        var24 = class127.field2017;
                        var25 = class127.field2020;
                    }
                    if (var9.field2560 == 1337) {
                        method1830(var9);
                        if (!field268 && !field334 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field410 == 0 && !field515) {
                                method2409(class143.field2325, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class98.field1753; var28++) {
                                int var29 = class98.field1743[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2085.method1604(Statics.field1, var30, var31, var29) >= 0) {
                                        class36 var34 = class36.method1847(var33);
                                        if (var34.field867 != null) {
                                            var34 = var34.method633();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field410 == 1) {
                                            method2409(class143.field2320, field411 + " " + class2.field25 + " " + class2.method1850(65535) + var34.field856, 1, var29, var30, var31);
                                        } else if (!field515) {
                                            String[] var35 = var34.field873;
                                            if (field428) {
                                                var35 = method2546(var35);
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
                                                        method2409(var35[var36], class2.method1850(65535) + var34.field856, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2409(class143.field2265, class2.method1850(65535) + var34.field856, 1002, var34.field853 << 14, var30, var31);
                                        } else if ((Statics.field1677 & 0x4) == 4) {
                                            method2409(field311, field416 + " " + class2.field25 + " " + class2.method1850(65535) + var34.field856, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class30 var38 = field295[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field705.field831 == 1 && (var38.field780 & 0x7F) == 64 && (var38.field761 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field369; var39++) {
                                                class30 var40 = field295[field486[var39]];
                                                if (var40 != null && var38 != var40 && var40.field705.field831 == 1 && var38.field780 == var40.field780 && var38.field761 == var40.field761) {
                                                    method2663(var40.field705, field486[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field419; var41++) {
                                                class3 var42 = field297[field377[var41]];
                                                if (var42 != null && var38.field780 == var42.field780 && var38.field761 == var42.field761) {
                                                    method2660(var42, field377[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method2663(var38.field705, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field297[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field780 & 0x7F) == 64 && (var43.field761 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field369; var44++) {
                                                class30 var45 = field295[field486[var44]];
                                                if (var45 != null && var45.field705.field831 == 1 && var43.field780 == var45.field780 && var43.field761 == var45.field761) {
                                                    method2663(var45.field705, field486[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field419; var46++) {
                                                class3 var47 = field297[field377[var46]];
                                                if (var47 != null && var43 != var47 && var43.field780 == var47.field780 && var43.field761 == var47.field761) {
                                                    method2660(var47, field377[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field389 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2660(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class178 var48 = field390[Statics.field1][var30][var31];
                                        if (var48 != null) {
                                            for (class25 var49 = (class25) var48.method3205(); var49 != null; var49 = (class25) var48.method3210()) {
                                                class45 var50 = Statics.method2406(var49.field625);
                                                if (field410 == 1) {
                                                    method2409(class143.field2320, field411 + " " + class2.field25 + " " + class2.method1850(16748608) + var50.field1026, 16, var49.field625, var30, var31);
                                                } else if (!field515) {
                                                    String[] var51 = var50.field1028;
                                                    if (field428) {
                                                        var51 = method2546(var51);
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
                                                            method2409(var51[var52], class2.method1850(16748608) + var50.field1026, var53, var49.field625, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method2409(class143.field2171, class2.method1850(16748608) + var50.field1026, 20, var49.field625, var30, var31);
                                                        }
                                                    }
                                                    method2409(class143.field2265, class2.method1850(16748608) + var50.field1026, 1004, var49.field625, var30, var31);
                                                } else if ((Statics.field1677 & 0x1) == 1) {
                                                    method2409(field311, field416 + " " + class2.field25 + " " + class2.method1850(16748608) + var50.field1026, 17, var49.field625, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field297[field389];
                                method2660(var56, field389, var54, var55);
                            }
                        }
                    } else if (var9.field2560 == 1338) {
                        method727(var10, var11);
                    } else {
                        if (!field334 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var57 = var24 - var10;
                            int var58 = var25 - var11;
                            if (var9.field2645 == 1) {
                                method2409(var9.field2657, "", 24, 0, 0, var9.field2583);
                            }
                            if (var9.field2645 == 2 && !field515) {
                                String var59 = Statics.method2667(var9);
                                if (var59 != null) {
                                    method2409(var59, class2.method1850(65280) + var9.field2656, 25, 0, -1, var9.field2583);
                                }
                            }
                            if (var9.field2645 == 3) {
                                method2409(class143.field2329, "", 26, 0, 0, var9.field2583);
                            }
                            if (var9.field2645 == 4) {
                                method2409(var9.field2657, "", 28, 0, 0, var9.field2583);
                            }
                            if (var9.field2645 == 5) {
                                method2409(var9.field2657, "", 29, 0, 0, var9.field2583);
                            }
                            if (var9.field2645 == 6 && field436 == null) {
                                method2409(var9.field2657, "", 30, 0, -1, var9.field2583);
                            }
                            if (var9.field2558 == 2) {
                                int var60 = 0;
                                for (int var61 = 0; var61 < var9.field2603; var61++) {
                                    for (int var62 = 0; var62 < var9.field2565; var62++) {
                                        int var63 = (var9.field2609 + 32) * var62;
                                        int var64 = (var9.field2610 + 32) * var61;
                                        if (var60 < 20) {
                                            var63 += var9.field2611[var60];
                                            var64 += var9.field2612[var60];
                                        }
                                        if (var57 >= var63 && var58 >= var64 && var57 < var63 + 32 && var58 < var64 + 32) {
                                            field371 = var60;
                                            Statics.field718 = var9;
                                            if (var9.field2658[var60] > 0) {
                                                class45 var65 = Statics.method2406(var9.field2658[var60] - 1);
                                                if (field410 == 1 && class157.method1835(method1833(var9))) {
                                                    if (Statics.field50 != var9.field2583 || Statics.field74 != var60) {
                                                        method2409(class143.field2320, field411 + " " + class2.field25 + " " + class2.method1850(16748608) + var65.field1026, 31, var65.field1038, var60, var9.field2583);
                                                    }
                                                } else if (!field515 || !class157.method1835(method1833(var9))) {
                                                    String[] var66 = var65.field1019;
                                                    if (field428) {
                                                        var66 = method2546(var66);
                                                    }
                                                    if (class157.method1835(method1833(var9))) {
                                                        for (int var67 = 4; var67 >= 3; var67--) {
                                                            if (var66 != null && var66[var67] != null) {
                                                                byte var68;
                                                                if (var67 == 3) {
                                                                    var68 = 36;
                                                                } else {
                                                                    var68 = 37;
                                                                }
                                                                method2409(var66[var67], class2.method1850(16748608) + var65.field1026, var68, var65.field1038, var60, var9.field2583);
                                                            } else if (var67 == 4) {
                                                                method2409(class143.field2294, class2.method1850(16748608) + var65.field1026, 37, var65.field1038, var60, var9.field2583);
                                                            }
                                                        }
                                                    }
                                                    if (class157.method2668(method1833(var9))) {
                                                        method2409(class143.field2320, class2.method1850(16748608) + var65.field1026, 38, var65.field1038, var60, var9.field2583);
                                                    }
                                                    if (class157.method1835(method1833(var9)) && var66 != null) {
                                                        for (int var69 = 2; var69 >= 0; var69--) {
                                                            if (var66[var69] != null) {
                                                                byte var70 = 0;
                                                                if (var69 == 0) {
                                                                    var70 = 33;
                                                                }
                                                                if (var69 == 1) {
                                                                    var70 = 34;
                                                                }
                                                                if (var69 == 2) {
                                                                    var70 = 35;
                                                                }
                                                                method2409(var66[var69], class2.method1850(16748608) + var65.field1026, var70, var65.field1038, var60, var9.field2583);
                                                            }
                                                        }
                                                    }
                                                    String[] var71 = var9.field2614;
                                                    if (field428) {
                                                        var71 = method2546(var71);
                                                    }
                                                    if (var71 != null) {
                                                        for (int var72 = 4; var72 >= 0; var72--) {
                                                            if (var71[var72] != null) {
                                                                byte var73 = 0;
                                                                if (var72 == 0) {
                                                                    var73 = 39;
                                                                }
                                                                if (var72 == 1) {
                                                                    var73 = 40;
                                                                }
                                                                if (var72 == 2) {
                                                                    var73 = 41;
                                                                }
                                                                if (var72 == 3) {
                                                                    var73 = 42;
                                                                }
                                                                if (var72 == 4) {
                                                                    var73 = 43;
                                                                }
                                                                method2409(var71[var72], class2.method1850(16748608) + var65.field1026, var73, var65.field1038, var60, var9.field2583);
                                                            }
                                                        }
                                                    }
                                                    method2409(class143.field2265, class2.method1850(16748608) + var65.field1026, 1005, var65.field1038, var60, var9.field2583);
                                                } else if ((Statics.field1677 & 0x10) == 16) {
                                                    method2409(field311, field416 + " " + class2.field25 + " " + class2.method1850(16748608) + var65.field1026, 32, var65.field1038, var60, var9.field2583);
                                                }
                                            }
                                        }
                                        var60++;
                                    }
                                }
                            }
                            if (var9.field2635) {
                                if (field515) {
                                    int var74 = method1833(var9);
                                    boolean var75 = (var74 >> 21 & 0x1) != 0;
                                    if (var75 && (Statics.field1677 & 0x20) == 32) {
                                        method2409(field311, field416 + " " + class2.field25 + " " + var9.field2647, 58, 0, var9.field2557, var9.field2583);
                                    }
                                } else {
                                    for (int var76 = 9; var76 >= 5; var76--) {
                                        String var77 = method457(var9, var76);
                                        if (var77 != null) {
                                            method2409(var77, var9.field2647, 1007, var76 + 1, var9.field2557, var9.field2583);
                                        }
                                    }
                                    String var78 = Statics.method2667(var9);
                                    if (var78 != null) {
                                        method2409(var78, var9.field2647, 25, 0, var9.field2557, var9.field2583);
                                    }
                                    for (int var79 = 4; var79 >= 0; var79--) {
                                        String var80 = method457(var9, var79);
                                        if (var80 != null) {
                                            method2409(var80, var9.field2647, 57, var79 + 1, var9.field2557, var9.field2583);
                                        }
                                    }
                                    if (class157.method158(method1833(var9))) {
                                        method2409(class143.field2176, "", 30, 0, var9.field2557, var9.field2583);
                                    }
                                }
                            }
                        }
                        if (var9.field2558 == 0) {
                            if (!var9.field2635 && method1948(var9) && Statics.field533 != var9) {
                                continue;
                            }
                            method892(arg0, var9.field2583, var12, var13, var14, var15, var10 - var9.field2569, var11 - var9.field2659);
                            if (var9.field2664 != null) {
                                method892(var9.field2664, var9.field2583, var12, var13, var14, var15, var10 - var9.field2569, var11 - var9.field2659);
                            }
                            class4 var81 = (class4) field418.method3174((long) var9.field2583);
                            if (var81 != null) {
                                if (var81.field58 == 0 && class127.field2008 >= var12 && class127.field2013 >= var13 && class127.field2008 < var14 && class127.field2013 < var15 && !field334 && !field398) {
                                    field404[0] = class143.field2406;
                                    field405[0] = "";
                                    field308[0] = 1006;
                                    field399 = 1;
                                }
                                int var82 = var81.field55;
                                if (class153.method2498(var82)) {
                                    method892(Statics.field2556[var82], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2635) {
                            if (var9.field2585 && class127.field2008 >= var12 && class127.field2013 >= var13 && class127.field2008 < var14 && class127.field2013 < var15) {
                                for (class1 var83 = (class1) field262.method3200(); var83 != null; var83 = (class1) field262.method3209()) {
                                    if (var83.field11) {
                                        var83.method3304();
                                        var83.field3.field2665 = false;
                                    }
                                }
                                if (Statics.field171 == 0) {
                                    field429 = null;
                                    field364 = null;
                                }
                                if (!field334) {
                                    field404[0] = class143.field2406;
                                    field405[0] = "";
                                    field308[0] = 1006;
                                    field399 = 1;
                                }
                            }
                            boolean var84;
                            if (class127.field2008 >= var12 && class127.field2013 >= var13 && class127.field2008 < var14 && class127.field2013 < var15) {
                                var84 = true;
                            } else {
                                var84 = false;
                            }
                            boolean var85 = false;
                            if ((class127.field2009 == 1 || !Statics.field235 && class127.field2009 == 4) && var84) {
                                var85 = true;
                            }
                            boolean var86 = false;
                            if ((class127.field2018 == 1 || !Statics.field235 && class127.field2018 == 4) && class127.field2017 >= var12 && class127.field2020 >= var13 && class127.field2017 < var14 && class127.field2020 < var15) {
                                var86 = true;
                            }
                            if (var86) {
                                method2860(var9, class127.field2017 - var10, class127.field2020 - var11);
                            }
                            if (field429 != null && field429 != var9 && var84 && class157.method1938(method1833(var9))) {
                                field433 = var9;
                            }
                            if (field364 == var9) {
                                field434 = true;
                                field435 = var10;
                                field317 = var11;
                            }
                            if (var9.field2623) {
                                if (var84 && field511 != 0 && var9.field2644 != null) {
                                    class1 var87 = new class1();
                                    var87.field11 = true;
                                    var87.field3 = var9;
                                    var87.field14 = field511;
                                    var87.field5 = var9.field2644;
                                    field262.method3202(var87);
                                }
                                if (field429 != null || Statics.field1668 != null || field334) {
                                    var86 = false;
                                    var85 = false;
                                    var84 = false;
                                }
                                if (!var9.field2666 && var86) {
                                    var9.field2666 = true;
                                    if (var9.field2625 != null) {
                                        class1 var88 = new class1();
                                        var88.field11 = true;
                                        var88.field3 = var9;
                                        var88.field4 = class127.field2017 - var10;
                                        var88.field14 = class127.field2020 - var11;
                                        var88.field5 = var9.field2625;
                                        field262.method3202(var88);
                                    }
                                }
                                if (var9.field2666 && var85 && var9.field2572 != null) {
                                    class1 var89 = new class1();
                                    var89.field11 = true;
                                    var89.field3 = var9;
                                    var89.field4 = class127.field2008 - var10;
                                    var89.field14 = class127.field2013 - var11;
                                    var89.field5 = var9.field2572;
                                    field262.method3202(var89);
                                }
                                if (var9.field2666 && !var85) {
                                    var9.field2666 = false;
                                    if (var9.field2561 != null) {
                                        class1 var90 = new class1();
                                        var90.field11 = true;
                                        var90.field3 = var9;
                                        var90.field4 = class127.field2008 - var10;
                                        var90.field14 = class127.field2013 - var11;
                                        var90.field5 = var9.field2561;
                                        field393.method3202(var90);
                                    }
                                }
                                if (var85 && var9.field2555 != null) {
                                    class1 var91 = new class1();
                                    var91.field11 = true;
                                    var91.field3 = var9;
                                    var91.field4 = class127.field2008 - var10;
                                    var91.field14 = class127.field2013 - var11;
                                    var91.field5 = var9.field2555;
                                    field262.method3202(var91);
                                }
                                if (!var9.field2665 && var84) {
                                    var9.field2665 = true;
                                    if (var9.field2601 != null) {
                                        class1 var92 = new class1();
                                        var92.field11 = true;
                                        var92.field3 = var9;
                                        var92.field4 = class127.field2008 - var10;
                                        var92.field14 = class127.field2013 - var11;
                                        var92.field5 = var9.field2601;
                                        field262.method3202(var92);
                                    }
                                }
                                if (var9.field2665 && var84 && var9.field2608 != null) {
                                    class1 var93 = new class1();
                                    var93.field11 = true;
                                    var93.field3 = var9;
                                    var93.field4 = class127.field2008 - var10;
                                    var93.field14 = class127.field2013 - var11;
                                    var93.field5 = var9.field2608;
                                    field262.method3202(var93);
                                }
                                if (var9.field2665 && !var84) {
                                    var9.field2665 = false;
                                    if (var9.field2613 != null) {
                                        class1 var94 = new class1();
                                        var94.field11 = true;
                                        var94.field3 = var9;
                                        var94.field4 = class127.field2008 - var10;
                                        var94.field14 = class127.field2013 - var11;
                                        var94.field5 = var9.field2613;
                                        field393.method3202(var94);
                                    }
                                }
                                if (var9.field2642 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field5 = var9.field2642;
                                    field359.method3202(var95);
                                }
                                if (var9.field2636 != null && field414 > var9.field2668) {
                                    if (var9.field2637 == null || field414 - var9.field2668 > 32) {
                                        class1 var100 = new class1();
                                        var100.field3 = var9;
                                        var100.field5 = var9.field2636;
                                        field262.method3202(var100);
                                    } else {
                                        label885: for (int var96 = var9.field2668; var96 < field414; var96++) {
                                            int var97 = field442[var96 & 0x1F];
                                            for (int var98 = 0; var98 < var9.field2637.length; var98++) {
                                                if (var9.field2637[var98] == var97) {
                                                    class1 var99 = new class1();
                                                    var99.field3 = var9;
                                                    var99.field5 = var9.field2636;
                                                    field262.method3202(var99);
                                                    break label885;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2668 = field414;
                                }
                                if (var9.field2638 != null && field445 > var9.field2669) {
                                    if (var9.field2627 == null || field445 - var9.field2669 > 32) {
                                        class1 var105 = new class1();
                                        var105.field3 = var9;
                                        var105.field5 = var9.field2638;
                                        field262.method3202(var105);
                                    } else {
                                        label861: for (int var101 = var9.field2669; var101 < field445; var101++) {
                                            int var102 = field354[var101 & 0x1F];
                                            for (int var103 = 0; var103 < var9.field2627.length; var103++) {
                                                if (var9.field2627[var103] == var102) {
                                                    class1 var104 = new class1();
                                                    var104.field3 = var9;
                                                    var104.field5 = var9.field2638;
                                                    field262.method3202(var104);
                                                    break label861;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2669 = field445;
                                }
                                if (var9.field2640 != null && field447 > var9.field2670) {
                                    if (var9.field2641 == null || field447 - var9.field2670 > 32) {
                                        class1 var110 = new class1();
                                        var110.field3 = var9;
                                        var110.field5 = var9.field2640;
                                        field262.method3202(var110);
                                    } else {
                                        label837: for (int var106 = var9.field2670; var106 < field447; var106++) {
                                            int var107 = field446[var106 & 0x1F];
                                            for (int var108 = 0; var108 < var9.field2641.length; var108++) {
                                                if (var9.field2641[var108] == var107) {
                                                    class1 var109 = new class1();
                                                    var109.field3 = var9;
                                                    var109.field5 = var9.field2640;
                                                    field262.method3202(var109);
                                                    break label837;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2670 = field447;
                                }
                                if (field448 > var9.field2667 && var9.field2629 != null) {
                                    class1 var111 = new class1();
                                    var111.field3 = var9;
                                    var111.field5 = var9.field2629;
                                    field262.method3202(var111);
                                }
                                if (field449 > var9.field2667 && var9.field2662 != null) {
                                    class1 var112 = new class1();
                                    var112.field3 = var9;
                                    var112.field5 = var9.field2662;
                                    field262.method3202(var112);
                                }
                                if (field450 > var9.field2667 && var9.field2648 != null) {
                                    class1 var113 = new class1();
                                    var113.field3 = var9;
                                    var113.field5 = var9.field2648;
                                    field262.method3202(var113);
                                }
                                if (field451 > var9.field2667 && var9.field2649 != null) {
                                    class1 var114 = new class1();
                                    var114.field3 = var9;
                                    var114.field5 = var9.field2649;
                                    field262.method3202(var114);
                                }
                                var9.field2667 = field506;
                                if (var9.field2646 != null) {
                                    for (int var115 = 0; var115 < field476; var115++) {
                                        class1 var116 = new class1();
                                        var116.field3 = var9;
                                        var116.field7 = field478[var115];
                                        var116.field9 = field490[var115];
                                        var116.field5 = var9.field2646;
                                        field262.method3202(var116);
                                    }
                                }
                            }
                        }
                        if (!var9.field2635 && field429 == null && Statics.field1668 == null && !field334) {
                            if ((var9.field2571 >= 0 || var9.field2575 != 0) && class127.field2008 >= var12 && class127.field2013 >= var13 && class127.field2008 < var14 && class127.field2013 < var15) {
                                if (var9.field2571 >= 0) {
                                    Statics.field533 = arg0[var9.field2571];
                                } else {
                                    Statics.field533 = var9;
                                }
                            }
                            if (var9.field2558 == 8 && class127.field2008 >= var12 && class127.field2013 >= var13 && class127.field2008 < var14 && class127.field2013 < var15) {
                                Statics.field65 = var9;
                            }
                            if (var9.field2639 > var9.field2603) {
                                method32(var9, var9.field2565 + var10, var11, var9.field2603, var9.field2639, class127.field2008, class127.field2013);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.cl(III)V")
    public static final void method130(int arg0, int arg1) {
        if (class153.method2498(arg0)) {
            Statics.method103(Statics.field2556[arg0], arg1);
        }
    }

    @ObfuscatedName("eq.cd(Leq;IIB)V")
    public static final void method2860(class153 arg0, int arg1, int arg2) {
        if (field429 != null || field334 || arg0 == null || method2669(arg0) == null) {
            return;
        }
        field429 = arg0;
        field364 = method2669(arg0);
        field331 = arg1;
        field432 = arg2;
        Statics.field171 = 0;
        field495 = false;
        if (field399 <= 0) {
            return;
        }
        int var3 = field399 - 1;
        Statics.field187 = new class27();
        Statics.field187.field645 = field400[var3];
        Statics.field187.field653 = field401[var3];
        Statics.field187.field646 = field308[var3];
        Statics.field187.field644 = field403[var3];
        Statics.field187.field647 = field404[var3];
    }

    @ObfuscatedName("ex.cx(III)V")
    public static void method2815(int arg0, int arg1) {
        class27 var2 = Statics.field187;
        method456(var2.field645, var2.field653, var2.field646, var2.field644, var2.field647, var2.field647, arg0, arg1);
        Statics.field187 = null;
    }

    @ObfuscatedName("cd.cg(Leq;B)V")
    public static void method1830(class153 arg0) {
        if (field460 == arg0.field2672) {
            field461[arg0.field2671] = true;
        }
    }

    @ObfuscatedName("w.cv(I)V")
    public static void method38() {
        for (class4 var0 = (class4) field418.method3182(); var0 != null; var0 = (class4) field418.method3178()) {
            int var1 = var0.field55;
            if (class153.method2498(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2556[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2635;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2885;
                    class153 var6 = class153.method1565(var5);
                    if (var6 != null) {
                        method1830(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.cy(Leq;I)Leq;")
    public static class153 method2669(class153 arg0) {
        class153 var1 = method111(arg0);
        if (var1 == null) {
            var1 = arg0.field2618;
        }
        return var1;
    }

    @ObfuscatedName("de.cp([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2546(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("o.ck(II)V")
    public static final void method108(int arg0) {
        if (!class153.method2498(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2556[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2626 = 0;
                var3.field2663 = 0;
            }
        }
    }

    @ObfuscatedName("dd.cw(IB)V")
    public static final void method2408(int arg0) {
        method38();
        for (class20 var1 = (class20) class20.field551.method3200(); var1 != null; var1 = (class20) class20.field551.method3209()) {
            if (var1.field555 != null) {
                var1.method473();
            }
        }
        int var2 = class46.method101(arg0).field1060;
        if (var2 == 0) {
            return;
        }
        int var3 = class155.field2684[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1775(0.9D);
                ((class88) Statics.field1488).method1837(0.9D);
            }
            if (var3 == 2) {
                class84.method1775(0.8D);
                ((class88) Statics.field1488).method1837(0.8D);
            }
            if (var3 == 3) {
                class84.method1775(0.7D);
                ((class88) Statics.field1488).method1837(0.7D);
            }
            if (var3 == 4) {
                class84.method1775(0.6D);
                ((class88) Statics.field1488).method1837(0.6D);
            }
            class45.method660();
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
            if (field328 != var4) {
                if (field328 == 0 && field491 != -1) {
                    class162.method1832(Statics.field1684, field491, 0, var4, false);
                    field370 = false;
                } else if (var4 == 0) {
                    Statics.field2473.method3024();
                    class162.field2729 = 1;
                    Statics.field2726 = null;
                    field370 = false;
                } else if (class162.field2729 == 0) {
                    Statics.field2473.method3066(var4);
                } else {
                    Statics.field134 = var4;
                }
                field328 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field279 = 127;
            }
            if (var3 == 1) {
                field279 = 96;
            }
            if (var3 == 2) {
                field279 = 64;
            }
            if (var3 == 3) {
                field279 = 32;
            }
            if (var3 == 4) {
                field279 = 0;
            }
        }
        if (var2 == 5) {
            field397 = var3;
        }
        if (var2 == 6) {
            field402 = var3;
        }
        if (var2 == 9) {
            field420 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field494 = 127;
            }
            if (var3 == 1) {
                field494 = 96;
            }
            if (var3 == 2) {
                field494 = 64;
            }
            if (var3 == 3) {
                field494 = 32;
            }
            if (var3 == 4) {
                field494 = 0;
            }
        }
        if (var2 == 17) {
            field425 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field525, class18.field519, class18.field520 };
            field286 = (class18) class99.method1947(var5, var3);
            if (field286 == null) {
                field286 = class18.field525;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field389 = -1;
        } else {
            field389 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("et.cb(I)V")
    public static final void method2642() {
        field298.method2335(51);
        for (class4 var0 = (class4) field418.method3182(); var0 != null; var0 = (class4) field418.method3178()) {
            if (var0.field58 == 0 || var0.field58 == 3) {
                method151(var0, true);
            }
        }
        if (field436 != null) {
            method1830(field436);
            field436 = null;
        }
    }

    @ObfuscatedName("x.cj(Le;ZS)V")
    public static final void method151(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field2885;
        arg0.method3304();
        if (arg1 && var2 != -1 && Statics.field2547[var2]) {
            Statics.field1888.method2704(var2);
            if (Statics.field2556[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2556[var2].length; var5++) {
                    if (Statics.field2556[var2][var5] != null) {
                        if (Statics.field2556[var2][var5].field2558 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2556[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2556[var2] = null;
                }
                Statics.field2547[var2] = false;
            }
        }
        for (class180 var6 = (class180) field458.method3182(); var6 != null; var6 = (class180) field458.method3178()) {
            if ((var6.field2885 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3304();
            }
        }
        class153 var7 = class153.method1565(var3);
        if (var7 != null) {
            method1830(var7);
        }
        method1010();
        if (field417 != -1) {
            method130(field417, 1);
        }
    }

    @ObfuscatedName("ea.ch(Leq;I)Z")
    public static final boolean method2867(class153 arg0) {
        int var1 = arg0.field2560;
        if (var1 == 205) {
            field355 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field358.method2926(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field358.method2911(var4, var5 == 1);
        }
        if (var1 == 324) {
            field358.method2923(false);
        }
        if (var1 == 325) {
            field358.method2923(true);
        }
        if (var1 == 326) {
            field298.method2335(78);
            field358.method2898(field298);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.ce(IIIS)V")
    public static final void method150(int arg0, int arg1, int arg2) {
        method752();
        class73.method1486(arg0, arg1, Statics.field48.field1327 + arg0, Statics.field48.field1325 + arg1);
        if (field489 == 2 || field489 == 5) {
            class73.method1501(arg0 + 25, arg1 + 5, 0, Statics.field90, Statics.field2812);
        } else {
            int var3 = field504 + field503 & 0x7FF;
            int var4 = Statics.field1767.field780 / 32 + 48;
            int var5 = 464 - Statics.field1767.field761 / 32;
            Statics.field535.method1414(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field488 + 256, Statics.field90, Statics.field2812);
            for (int var6 = 0; var6 < field483; var6++) {
                int var7 = field484[var6] * 4 + 2 - Statics.field1767.field780 / 32;
                int var8 = field485[var6] * 4 + 2 - Statics.field1767.field761 / 32;
                method518(arg0, arg1, var7, var8, field309[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class178 var11 = field390[Statics.field1][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1767.field780 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1767.field761 / 32;
                        method518(arg0, arg1, var12, var13, Statics.field15[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field369; var14++) {
                class30 var15 = field295[field486[var14]];
                if (var15 != null && var15.method25()) {
                    class35 var16 = var15.field705;
                    if (var16 != null && var16.field835 != null) {
                        var16 = var16.method596();
                    }
                    if (var16 != null && var16.field837 && var16.field838) {
                        int var17 = var15.field780 / 32 - Statics.field1767.field780 / 32;
                        int var18 = var15.field761 / 32 - Statics.field1767.field761 / 32;
                        method518(arg0, arg1, var17, var18, Statics.field15[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field419; var19++) {
                class3 var20 = field297[field377[var19]];
                if (var20 != null && var20.method25() && !var20.field46) {
                    int var21 = var20.field780 / 32 - Statics.field1767.field780 / 32;
                    int var22 = var20.field761 / 32 - Statics.field1767.field761 / 32;
                    boolean var23 = false;
                    if (method2454(var20.field45, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1354; var25++) {
                        if (var20.field45.equals(Statics.field175[var25].field565)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1767.field37 != 0 && var20.field37 != 0 && Statics.field1767.field37 == var20.field37) {
                        var26 = true;
                    }
                    if (var23) {
                        method518(arg0, arg1, var21, var22, Statics.field15[3]);
                    } else if (var26) {
                        method518(arg0, arg1, var21, var22, Statics.field15[4]);
                    } else if (var24) {
                        method518(arg0, arg1, var21, var22, Statics.field15[5]);
                    } else {
                        method518(arg0, arg1, var21, var22, Statics.field15[2]);
                    }
                }
            }
            if (field277 != 0 && field269 % 20 < 10) {
                if (field277 == 1 && field496 >= 0 && field496 < field295.length) {
                    class30 var27 = field295[field496];
                    if (var27 != null) {
                        int var28 = var27.field780 / 32 - Statics.field1767.field780 / 32;
                        int var29 = var27.field761 / 32 - Statics.field1767.field761 / 32;
                        method166(arg0, arg1, var28, var29, Statics.field1861[1]);
                    }
                }
                if (field277 == 2) {
                    int var30 = field280 * 4 - Statics.field1870 * 4 + 2 - Statics.field1767.field780 / 32;
                    int var31 = field477 * 4 - Statics.field47 * 4 + 2 - Statics.field1767.field761 / 32;
                    method166(arg0, arg1, var30, var31, Statics.field1861[1]);
                }
                if (field277 == 10 && field392 >= 0 && field392 < field297.length) {
                    class3 var32 = field297[field392];
                    if (var32 != null) {
                        int var33 = var32.field780 / 32 - Statics.field1767.field780 / 32;
                        int var34 = var32.field761 / 32 - Statics.field1767.field761 / 32;
                        method166(arg0, arg1, var33, var34, Statics.field1861[1]);
                    }
                }
            }
            if (field415 != 0) {
                int var35 = field415 * 4 + 2 - Statics.field1767.field780 / 32;
                int var36 = field430 * 4 + 2 - Statics.field1767.field761 / 32;
                method518(arg0, arg1, var35, var36, Statics.field1861[0]);
            }
            if (!Statics.field1767.field46) {
                class73.method1492(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field489 < 3) {
            Statics.field2092.method1414(arg0, arg1, 33, 33, 25, 25, field503, 256, Statics.field71, Statics.field1271);
        } else {
            class73.method1501(arg0, arg1, 0, Statics.field71, Statics.field1271);
        }
        if (field463[arg2]) {
            Statics.field48.method1547(arg0, arg1);
        }
        field462[arg2] = true;
    }

    @ObfuscatedName("y.ci(IIIILbt;I)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method518(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field504 + field503 & 0x7FF;
        int var7 = class84.field1491[var6];
        int var8 = class84.field1492[var6];
        int var9 = var7 * 256 / (field488 + 256);
        int var10 = var8 * 256 / (field488 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1434.method1447(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ar.cq(IIIILbt;B)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field504 + field503 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1491[var5];
        int var8 = class84.field1492[var5];
        int var9 = var7 * 256 / (field488 + 256);
        int var10 = var8 * 256 / (field488 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1452(Statics.field48, arg0 + 94 + var11 - arg4.field1311 / 2 + 4, arg1 + 83 - var12 - arg4.field1306 / 2 - 4);
        } else {
            arg4.method1453(arg0 + 94 + var11 - arg4.field1311 / 2 + 4, arg1 + 83 - var12 - arg4.field1306 / 2 - 4);
        }
    }

    @ObfuscatedName("df.cu(Ljava/lang/String;ZS)Z")
    public static boolean method2454(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method2517(arg0, Statics.field274);
        for (int var3 = 0; var3 < field507; var3++) {
            if (var2.equalsIgnoreCase(class201.method2517(field509[var3].field236, Statics.field274)) && (!arg1 || field509[var3].field231 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method2517(Statics.field1767.field45, Statics.field274))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bx.cs(Ljava/lang/String;I)Z")
    public static boolean method1379(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method2517(arg0, Statics.field274);
        for (int var2 = 0; var2 < field457; var2++) {
            class8 var3 = field512[var2];
            if (var1.equalsIgnoreCase(class201.method2517(var3.field129, Statics.field274))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method2517(var3.field128, Statics.field274))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ak.cf(Ljava/lang/String;ZI)V")
    public static final void method877(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field457 < 100 || field508 == 1) || field457 >= 400) {
            class10.method469(31, "", class143.field2338);
            return;
        }
        String var2 = class201.method2517(arg0, Statics.field274);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field457; var3++) {
            class8 var4 = field512[var3];
            String var5 = class201.method2517(var4.field129, Statics.field274);
            if (var5 != null && var5.equals(var2)) {
                class10.method469(31, "", arg0 + class143.field2194);
                return;
            }
            if (var4.field128 != null) {
                String var6 = class201.method2517(var4.field128, Statics.field274);
                if (var6 != null && var6.equals(var2)) {
                    class10.method469(31, "", arg0 + class143.field2194);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field507; var7++) {
            class16 var8 = field509[var7];
            String var9 = class201.method2517(var8.field236, Statics.field274);
            if (var9 != null && var9.equals(var2)) {
                class10.method469(31, "", class143.field2344 + arg0 + class143.field2240);
                return;
            }
            if (var8.field237 != null) {
                String var10 = class201.method2517(var8.field237, Statics.field274);
                if (var10 != null && var10.equals(var2)) {
                    class10.method469(31, "", class143.field2344 + arg0 + class143.field2240);
                    return;
                }
            }
        }
        if (class201.method2517(Statics.field1767.field45, Statics.field274).equals(var2)) {
            class10.method469(31, "", class143.field2355);
            return;
        }
        field298.method2335(197);
        class110 var11 = field298;
        int var12 = arg0.length() + 1;
        var11.method2079(var12);
        field298.method2193(arg0);
    }

    @ObfuscatedName("ac.cz(Ljava/lang/String;B)V")
    public static final void method547(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class201.method2517(arg0, Statics.field274);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field507; var2++) {
            class16 var3 = field509[var2];
            String var4 = var3.field236;
            String var5 = class201.method2517(var4, Statics.field274);
            if (class116.method1738(arg0, var1, var4, var5)) {
                field507--;
                for (int var6 = var2; var6 < field507; var6++) {
                    field509[var6] = field509[var6 + 1];
                }
                field449 = field506;
                field298.method2335(133);
                class110 var7 = field298;
                int var8 = arg0.length() + 1;
                var7.method2079(var8);
                field298.method2193(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dn.du(Ljava/lang/String;I)V")
    public static final void method2331(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class201.method2517(arg0, Statics.field274);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field457; var2++) {
            class8 var3 = field512[var2];
            String var4 = var3.field129;
            String var5 = class201.method2517(var4, Statics.field274);
            if (class116.method1738(arg0, var1, var4, var5)) {
                field457--;
                for (int var6 = var2; var6 < field457; var6++) {
                    field512[var6] = field512[var6 + 1];
                }
                field449 = field506;
                field298.method2335(143);
                class110 var7 = field298;
                int var8 = arg0.length() + 1;
                var7.method2079(var8);
                field298.method2193(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bl.ds(Ljava/lang/String;I)V")
    public static final void method1568(String arg0) {
        if (Statics.field175 == null) {
            return;
        }
        field298.method2335(218);
        class110 var1 = field298;
        int var2 = arg0.length() + 1;
        var1.method2079(var2);
        field298.method2193(arg0);
    }

    @ObfuscatedName("cf.dk(I)V")
    public static final void method2040() {
        field298.method2335(41);
        field298.method2079(0);
    }

    @ObfuscatedName("cd.do(Leq;I)I")
    public static int method1833(class153 arg0) {
        class180 var1 = (class180) field458.method3174(((long) arg0.field2583 << 32) + (long) arg0.field2557);
        return var1 == null ? arg0.field2615 : var1.field2872;
    }

    @ObfuscatedName("o.dn(Leq;I)Leq;")
    public static class153 method111(class153 arg0) {
        int var1 = method1833(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class153.method1565(arg0.field2654);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ch.db(Leq;I)Z")
    public static boolean method1948(class153 arg0) {
        if (field398) {
            if (method1833(arg0) != 0) {
                return false;
            }
            if (arg0.field2558 == 0) {
                return false;
            }
        }
        return arg0.field2568;
    }

    @ObfuscatedName("d.da(Leq;II)Ljava/lang/String;")
    public static String method457(class153 arg0, int arg1) {
        int var2 = method1833(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2559 == null) {
            return null;
        } else if (arg0.field2617 == null || arg0.field2617.length <= arg1 || arg0.field2617[arg1] == null || arg0.field2617[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2617[arg1];
        }
    }

    @ObfuscatedName("ax.dm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method712(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field396 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field396 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field396 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field396 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field396 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field266 + "/";
    }
}

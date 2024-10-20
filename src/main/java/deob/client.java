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
import netscape.javascript.JSObject;

public final class client extends class133 {

    @ObfuscatedName("client.z")
    public static boolean field412 = true;

    @ObfuscatedName("client.b")
    public static int field243 = 1;

    @ObfuscatedName("client.k")
    public static int field244 = 0;

    @ObfuscatedName("client.w")
    public static class209[] field304 = new class209[4];

    @ObfuscatedName("client.l")
    public static int field438 = 0;

    @ObfuscatedName("client.h")
    public static boolean field325 = false;

    @ObfuscatedName("client.p")
    public static boolean field247 = false;

    @ObfuscatedName("client.i")
    public static int field324 = 0;

    @ObfuscatedName("client.f")
    public static int field250 = 0;

    @ObfuscatedName("client.u")
    public static boolean field251 = true;

    @ObfuscatedName("client.v")
    public static int field410 = 0;

    @ObfuscatedName("client.r")
    public static long field253 = 1L;

    @ObfuscatedName("client.t")
    public static int field475 = -1;

    @ObfuscatedName("client.e")
    public static int field263 = -1;

    @ObfuscatedName("client.m")
    public static int field297 = -1;

    @ObfuscatedName("client.o")
    public static boolean field258 = true;

    @ObfuscatedName("client.a")
    public static boolean field300 = false;

    @ObfuscatedName("client.am")
    public static int field260 = 0;

    @ObfuscatedName("client.ac")
    public static int field296 = 0;

    @ObfuscatedName("client.ap")
    public static int field262 = 0;

    @ObfuscatedName("client.aq")
    public static int field358 = 0;

    @ObfuscatedName("client.az")
    public static int field264 = 0;

    @ObfuscatedName("client.ae")
    public static int field265 = 0;

    @ObfuscatedName("client.at")
    public static int field266 = 0;

    @ObfuscatedName("client.as")
    public static int field267 = 0;

    @ObfuscatedName("client.aj")
    public static int field317 = 0;

    @ObfuscatedName("client.an")
    public static class108 field269 = new class108(new byte[5000]);

    @ObfuscatedName("client.ah")
    public static class18 field271 = class18.field513;

    @ObfuscatedName("client.aa")
    public static int field273 = 0;

    @ObfuscatedName("client.ao")
    public static int field274 = 0;

    @ObfuscatedName("client.ad")
    public static int field275 = 0;

    @ObfuscatedName("client.bm")
    public static int field348 = 0;

    @ObfuscatedName("client.bl")
    public static int field409 = 0;

    @ObfuscatedName("client.bz")
    public static int field279 = 0;

    @ObfuscatedName("client.bp")
    public static int field473 = 0;

    @ObfuscatedName("client.bu")
    public static int field420 = 0;

    @ObfuscatedName("client.bi")
    public static class31[] field261 = new class31[32768];

    @ObfuscatedName("client.bj")
    public static int field283 = 0;

    @ObfuscatedName("client.bv")
    public static int[] field284 = new int[32768];

    @ObfuscatedName("client.cs")
    public static class111 field285 = new class111(5000);

    @ObfuscatedName("client.cw")
    public static class111 field286 = new class111(5000);

    @ObfuscatedName("client.ce")
    public static class111 field504 = new class111(5000);

    @ObfuscatedName("client.co")
    public static int field288 = 0;

    @ObfuscatedName("client.ck")
    public static int field289 = 0;

    @ObfuscatedName("client.ct")
    public static int field290 = 0;

    @ObfuscatedName("client.cd")
    public static int field248 = 0;

    @ObfuscatedName("client.cv")
    public static int field292 = 0;

    @ObfuscatedName("client.cg")
    public static int field293 = 0;

    @ObfuscatedName("client.cp")
    public static int field294 = 0;

    @ObfuscatedName("client.cz")
    public static int field295 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field460 = false;

    @ObfuscatedName("client.cl")
    public static int field447 = 0;

    @ObfuscatedName("client.cq")
    public static int field298 = 0;

    @ObfuscatedName("client.di")
    public static int field299 = 1;

    @ObfuscatedName("client.dv")
    public static int field259 = 0;

    @ObfuscatedName("client.dg")
    public static int field301 = 1;

    @ObfuscatedName("client.df")
    public static int field257 = 0;

    @ObfuscatedName("client.du")
    public static boolean field305 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field252 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field270 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field308 = 0;

    @ObfuscatedName("client.dp")
    public static int field309 = 2;

    @ObfuscatedName("client.dx")
    public static int field488 = 0;

    @ObfuscatedName("client.dy")
    public static int field490 = 2;

    @ObfuscatedName("client.dj")
    public static int field400 = 0;

    @ObfuscatedName("client.db")
    public static int field313 = 1;

    @ObfuscatedName("client.dr")
    public static int field314 = 0;

    @ObfuscatedName("client.dt")
    public static int field315 = 0;

    @ObfuscatedName("client.dz")
    public static int field316 = 2;

    @ObfuscatedName("client.dm")
    public static int field378 = 0;

    @ObfuscatedName("client.er")
    public static int field318 = 1;

    @ObfuscatedName("client.en")
    public static int field319 = 0;

    @ObfuscatedName("client.ef")
    public static int field240 = 0;

    @ObfuscatedName("client.ey")
    public static int field502 = 2301979;

    @ObfuscatedName("client.eh")
    public static int field366 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field509 = 3353893;

    @ObfuscatedName("client.ec")
    public static int field249 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field327 = false;

    @ObfuscatedName("client.fm")
    public static int field328 = 0;

    @ObfuscatedName("client.fj")
    public static int field329 = 128;

    @ObfuscatedName("client.fi")
    public static int field330 = 0;

    @ObfuscatedName("client.fe")
    public static int field331 = 0;

    @ObfuscatedName("client.fc")
    public static int field332 = 0;

    @ObfuscatedName("client.fv")
    public static int field312 = 0;

    @ObfuscatedName("client.fq")
    public static int field280 = 0;

    @ObfuscatedName("client.ft")
    public static int field335 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field336 = false;

    @ObfuscatedName("client.fs")
    public static int field337 = 0;

    @ObfuscatedName("client.fz")
    public static int field338 = 0;

    @ObfuscatedName("client.fx")
    public static int field339 = 50;

    @ObfuscatedName("client.fg")
    public static int[] field340 = new int[field339];

    @ObfuscatedName("client.fl")
    public static int[] field341 = new int[field339];

    @ObfuscatedName("client.fu")
    public static int[] field342 = new int[field339];

    @ObfuscatedName("client.fh")
    public static int[] field459 = new int[field339];

    @ObfuscatedName("client.fb")
    public static int[] field443 = new int[field339];

    @ObfuscatedName("client.fn")
    public static int[] field345 = new int[field339];

    @ObfuscatedName("client.ff")
    public static int[] field346 = new int[field339];

    @ObfuscatedName("client.gy")
    public static String[] field498 = new String[field339];

    @ObfuscatedName("client.gm")
    public static int[][] field399 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field499 = 0;

    @ObfuscatedName("client.gq")
    public static int field396 = -1;

    @ObfuscatedName("client.gf")
    public static int field351 = -1;

    @ObfuscatedName("client.gk")
    public static int field354 = 0;

    @ObfuscatedName("client.gn")
    public static int field333 = 0;

    @ObfuscatedName("client.gp")
    public static int field477 = 0;

    @ObfuscatedName("client.gx")
    public static int field355 = 0;

    @ObfuscatedName("client.gv")
    public static int field356 = 0;

    @ObfuscatedName("client.gr")
    public static int field357 = 0;

    @ObfuscatedName("client.gg")
    public static int field350 = 0;

    @ObfuscatedName("client.gw")
    public static int field359 = 0;

    @ObfuscatedName("client.gs")
    public static int field374 = 0;

    @ObfuscatedName("client.gh")
    public static int field485 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field362 = false;

    @ObfuscatedName("client.go")
    public static int field363 = 0;

    @ObfuscatedName("client.gz")
    public static int field364 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field365 = new class3[2048];

    @ObfuscatedName("client.gb")
    public static int field255 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field367 = new int[2048];

    @ObfuscatedName("client.hq")
    public static int field268 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field369 = new int[2048];

    @ObfuscatedName("client.hc")
    public static class108[] field370 = new class108[2048];

    @ObfuscatedName("client.hg")
    public static int field371 = -1;

    @ObfuscatedName("client.hk")
    public static int field281 = 0;

    @ObfuscatedName("client.hm")
    public static int field373 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field246 = new int[1000];

    @ObfuscatedName("client.hx")
    public static final int[] field375 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field376 = new String[8];

    @ObfuscatedName("client.hy")
    public static boolean[] field377 = new boolean[8];

    @ObfuscatedName("client.hi")
    public static int[] field425 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hu")
    public static int field379 = -1;

    @ObfuscatedName("client.hp")
    public static class180[][][] field349 = new class180[4][104][104];

    @ObfuscatedName("client.hr")
    public static class180 field380 = new class180();

    @ObfuscatedName("client.hd")
    public static class180 field382 = new class180();

    @ObfuscatedName("client.hb")
    public static class180 field383 = new class180();

    @ObfuscatedName("client.hh")
    public static int[] field384 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field282 = new int[25];

    @ObfuscatedName("client.ha")
    public static int field387 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field388 = false;

    @ObfuscatedName("client.ip")
    public static int field360 = 0;

    @ObfuscatedName("client.is")
    public static int[] field320 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field394 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field395 = new String[500];

    @ObfuscatedName("client.ii")
    public static String[] field361 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field254 = -1;

    @ObfuscatedName("client.iu")
    public static int field398 = -1;

    @ObfuscatedName("client.ir")
    public static int field492 = 0;

    @ObfuscatedName("client.ih")
    public static int field277 = 50;

    @ObfuscatedName("client.ig")
    public static int field402 = 0;

    @ObfuscatedName("client.it")
    public static String field403 = null;

    @ObfuscatedName("client.ic")
    public static boolean field404 = false;

    @ObfuscatedName("client.iq")
    public static int field405 = -1;

    @ObfuscatedName("client.ie")
    public static int field406 = -1;

    @ObfuscatedName("client.jv")
    public static String field407 = null;

    @ObfuscatedName("client.jz")
    public static String field408 = null;

    @ObfuscatedName("client.ja")
    public static int field421 = -1;

    @ObfuscatedName("client.jm")
    public static class177 field245 = new class177(8);

    @ObfuscatedName("client.jh")
    public static int field411 = 0;

    @ObfuscatedName("client.ji")
    public static int field391 = 0;

    @ObfuscatedName("client.jn")
    public static class155 field413 = null;

    @ObfuscatedName("client.jo")
    public static int field414 = 0;

    @ObfuscatedName("client.js")
    public static int field415 = 0;

    @ObfuscatedName("client.jb")
    public static int field416 = 0;

    @ObfuscatedName("client.jl")
    public static int field417 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field418 = false;

    @ObfuscatedName("client.jd")
    public static boolean field419 = false;

    @ObfuscatedName("client.jj")
    public static boolean field311 = false;

    @ObfuscatedName("client.ju")
    public static class155 field401 = null;

    @ObfuscatedName("client.jq")
    public static class155 field422 = null;

    @ObfuscatedName("client.jp")
    public static int field423 = 0;

    @ObfuscatedName("client.jr")
    public static int field424 = 0;

    @ObfuscatedName("client.jg")
    public static class155 field310 = null;

    @ObfuscatedName("client.jx")
    public static boolean field426 = false;

    @ObfuscatedName("client.jw")
    public static int field427 = -1;

    @ObfuscatedName("client.jc")
    public static int field428 = -1;

    @ObfuscatedName("client.je")
    public static boolean field429 = false;

    @ObfuscatedName("client.jt")
    public static int field242 = -1;

    @ObfuscatedName("client.jf")
    public static int field476 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field278 = false;

    @ObfuscatedName("client.kv")
    public static int field433 = 1;

    @ObfuscatedName("client.kd")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.km")
    public static int field435 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field436 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field437 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field353 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field439 = 0;

    @ObfuscatedName("client.ki")
    public static int field482 = 0;

    @ObfuscatedName("client.kk")
    public static int field441 = 0;

    @ObfuscatedName("client.kl")
    public static int field442 = 0;

    @ObfuscatedName("client.kc")
    public static int field343 = 0;

    @ObfuscatedName("client.ka")
    public static int field444 = 0;

    @ObfuscatedName("client.kg")
    public static int field445 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field440 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field386 = new String[1000];

    @ObfuscatedName("client.kn")
    public static int field448 = 0;

    @ObfuscatedName("client.kz")
    public static class180 field449 = new class180();

    @ObfuscatedName("client.kr")
    public static class180 field450 = new class180();

    @ObfuscatedName("client.lg")
    public static class180 field451 = new class180();

    @ObfuscatedName("client.lr")
    public static class177 field452 = new class177(512);

    @ObfuscatedName("client.lm")
    public static int field453 = 0;

    @ObfuscatedName("client.ln")
    public static int field323 = -2;

    @ObfuscatedName("client.ls")
    public static boolean[] field470 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field456 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field457 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static int[] field458 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field510 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.ld")
    public static int field462 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field463 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field464 = 0;

    @ObfuscatedName("client.ll")
    public static int field465 = 0;

    @ObfuscatedName("client.ly")
    public static String field466 = "";

    @ObfuscatedName("client.lj")
    public static long[] field467 = new long[100];

    @ObfuscatedName("client.la")
    public static int field468 = 0;

    @ObfuscatedName("client.lk")
    public static int field469 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field326 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field471 = new int[128];

    @ObfuscatedName("client.lv")
    public static long field454 = -1L;

    @ObfuscatedName("client.mg")
    public static String field291 = null;

    @ObfuscatedName("client.my")
    public static String field474 = null;

    @ObfuscatedName("client.mt")
    public static int field472 = -1;

    @ObfuscatedName("client.mo")
    public static int field455 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field334 = new int[1000];

    @ObfuscatedName("client.mi")
    public static int[] field478 = new int[1000];

    @ObfuscatedName("client.mn")
    public static class73[] field479 = new class73[1000];

    @ObfuscatedName("client.mu")
    public static int field480 = 0;

    @ObfuscatedName("client.mz")
    public static int field481 = 0;

    @ObfuscatedName("client.mb")
    public static int field372 = 0;

    @ObfuscatedName("client.mv")
    public static int field483 = 255;

    @ObfuscatedName("client.mq")
    public static int field484 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field352 = false;

    @ObfuscatedName("client.mj")
    public static int field486 = 127;

    @ObfuscatedName("client.ms")
    public static int field430 = 127;

    @ObfuscatedName("client.nm")
    public static int field397 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field287 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field491 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field306 = new int[50];

    @ObfuscatedName("client.ne")
    public static class53[] field493 = new class53[50];

    @ObfuscatedName("client.nj")
    public static boolean field494 = false;

    @ObfuscatedName("client.nh")
    public static boolean[] field495 = new boolean[5];

    @ObfuscatedName("client.nb")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field497 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field431 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field302 = new int[5];

    @ObfuscatedName("client.os")
    public static int field500 = 0;

    @ObfuscatedName("client.ov")
    public static int field501 = 0;

    @ObfuscatedName("client.oh")
    public static class16[] field347 = new class16[400];

    @ObfuscatedName("client.of")
    public static class176 field344 = new class176();

    @ObfuscatedName("client.ob")
    public static int field381 = 0;

    @ObfuscatedName("client.og")
    public static class8[] field505 = new class8[400];

    @ObfuscatedName("client.op")
    public static class160 field506 = new class160();

    @ObfuscatedName("client.oq")
    public static int field507 = -1;

    @ObfuscatedName("client.oz")
    public static int field432 = -1;

    @ObfuscatedName("client.oa")
    public static class201[] field368 = new class201[6];

    @ObfuscatedName("client.b(B)V")
    public final void method167() {
    }

    public final void init() {
        if (!this.method2548()) {
            return;
        }
        class171[] var1 = new class171[] { class171.field2827, class171.field2829, class171.field2826, class171.field2838, class171.field2825, class171.field2833, class171.field2832, class171.field2828, class171.field2830, class171.field2831 };
        class171[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2835);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2835)) {
                    case 1:
                        field243 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field324 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field1885 = (class142) class100.method1742(class142.method1842(), Integer.parseInt(var5));
                        if (Statics.field1885 == class142.field2126) {
                            Statics.field2061 = class193.field2906;
                        } else {
                            Statics.field2061 = class193.field2902;
                        }
                        break;
                    case 4:
                        field244 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field390 = var5;
                        break;
                    case 6:
                        field438 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                            field325 = true;
                        } else {
                            field325 = false;
                        }
                        break;
                    case 8:
                        Statics.field1794 = class141.method32(Integer.parseInt(var5));
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                        }
                }
            }
        }
        class80.field1401 = false;
        field247 = false;
        Statics.field671 = this.getCodeBase().getHost();
        String var6 = Statics.field1794.field2114;
        byte var7 = 0;
        try {
            Statics.field2074 = 16;
            Statics.field2065 = var7;
            try {
                Statics.field2077 = System.getProperty("os.name");
            } catch (Exception var52) {
                Statics.field2077 = "Unknown";
            }
            Statics.field1915 = Statics.field2077.toLowerCase();
            try {
                Statics.field546 = System.getProperty("user.home");
                if (Statics.field546 != null) {
                    Statics.field546 = Statics.field546 + "/";
                }
            } catch (Exception var51) {
            }
            try {
                if (Statics.field1915.startsWith("win")) {
                    if (Statics.field546 == null) {
                        Statics.field546 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field546 == null) {
                    Statics.field546 = System.getenv("HOME");
                }
                if (Statics.field546 != null) {
                    Statics.field546 = Statics.field546 + "/";
                }
            } catch (Exception var50) {
            }
            if (Statics.field546 == null) {
                Statics.field546 = "~/";
            }
            Statics.field2082 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field546, "/tmp/", "" };
            Statics.field2081 = new String[] { ".jagex_cache_" + Statics.field2065, ".file_store_" + Statics.field2065 };
            int var11 = 0;
            label260: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2072 = new File(Statics.field546, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2072.exists()) {
                    try {
                        class207 var16 = new class207(Statics.field2072, "rw", 10000L);
                        class108 var17 = new class108((int) var16.method3437());
                        while (var17.field1824 < var17.field1828.length) {
                            int var18 = var16.method3450(var17.field1828, var17.field1824, var17.field1828.length - var17.field1824);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field1824 += var18;
                        }
                        var17.field1824 = 0;
                        int var19 = var17.method2083();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2083();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2188();
                            if (var20 == 1) {
                                var14 = var17.method2188();
                            }
                        } else {
                            var13 = var17.method2093();
                            if (var20 == 1) {
                                var14 = var17.method2093();
                            }
                        }
                        var16.method3449();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class138.method858(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label235: for (int var24 = 0; var24 < Statics.field2081.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field2082.length; var25++) {
                            File var26 = new File(Statics.field2082[var25] + Statics.field2081[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class138.method858(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label235;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field546 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var36 = new File(var13);
                    Object var37 = null;
                    try {
                        class207 var38 = new class207(Statics.field2072, "rw", 10000L);
                        class108 var39 = new class108(500);
                        var39.method2069(3);
                        var39.method2069(var37 == null ? 0 : 1);
                        var39.method2076(var36.getPath());
                        if (var37 != null) {
                            var39.method2076(((File) var37).getPath());
                        }
                        var38.method3436(var39.field1828, 0, var39.field1824);
                        var38.method3449();
                    } catch (IOException var49) {
                        var49.printStackTrace();
                    }
                }
                File var41 = new File(var13);
                Statics.field2073 = var41;
                if (!Statics.field2073.exists()) {
                    Statics.field2073.mkdirs();
                }
                File[] var42 = Statics.field2073.listFiles();
                if (var42 != null) {
                    File[] var43 = var42;
                    for (int var44 = 0; var44 < var43.length; var44++) {
                        File var45 = var43[var44];
                        if (!class138.method858(var45, false)) {
                            var11++;
                            continue label260;
                        }
                    }
                }
                break;
            }
            File var46 = Statics.field2073;
            Statics.field1926 = var46;
            if (!Statics.field1926.exists()) {
                throw new RuntimeException("");
            }
            class124.field1922 = true;
            class138.method2841();
            class138.field2080 = new class208(new class207(class124.method582("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class138.field2078 = new class208(new class207(class124.method582("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2079 = new class208[Statics.field2074];
            for (int var47 = 0; var47 < Statics.field2074; var47++) {
                Statics.field2079[var47] = new class208(new class207(class124.method582("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var55) {
            class137.method2362((String) null, var55);
        }
        Statics.field241 = this;
        this.method2546(765, 503, 69);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method298() {
        Statics.field2453 = field438 == 0 ? 43594 : field243 + 40000;
        Statics.field1902 = field438 == 0 ? 443 : field243 + 50000;
        Statics.field1801 = Statics.field2453;
        Statics.field2684 = class156.field2665;
        Statics.field1450 = class156.field2661;
        Statics.field795 = class156.field2662;
        Statics.field2691 = class156.field2663;
        class126.method2623();
        Canvas var1 = Statics.field683;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class126.field1947);
        var1.addFocusListener(class126.field1947);
        Canvas var2 = Statics.field683;
        var2.addMouseListener(class129.field2006);
        var2.addMouseMotionListener(class129.field2006);
        var2.addFocusListener(class129.field2006);
        Statics.field184 = class120.method2306();
        if (Statics.field184 != null) {
            Statics.field184.method2410(Statics.field683);
        }
        Statics.field1747 = new class123(255, class138.field2080, class138.field2078, 500000);
        Statics.field217 = class9.method461();
        Statics.field1574 = this.getToolkit().getSystemClipboard();
        class127.method482(this, Statics.field601);
        if (field438 != 0) {
            field300 = true;
        }
    }

    @ObfuscatedName("client.w(B)V")
    public final void method171() {
        field410++;
        this.method174();
        while (true) {
            class180 var1 = class152.field2498;
            class151 var2;
            synchronized (class152.field2498) {
                var2 = (class151) class152.field2495.method3186();
            }
            if (var2 == null) {
                class164.method2522();
                Statics.method1737();
                class126 var4 = class126.field1947;
                synchronized (class126.field1947) {
                    class126.field1957++;
                    class126.field1961 = class126.field1963;
                    class126.field1955 = 0;
                    if (class126.field1956 >= 0) {
                        while (class126.field1968 != class126.field1956) {
                            int var6 = class126.field1954[class126.field1968];
                            class126.field1968 = class126.field1968 + 1 & 0x7F;
                            if (var6 < 0) {
                                class126.field1969[~var6] = false;
                            } else {
                                if (!class126.field1969[var6] && class126.field1955 < class126.field1959.length - 1) {
                                    class126.field1959[++class126.field1955 - 1] = var6;
                                }
                                class126.field1969[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class126.field1969[var5] = false;
                        }
                        class126.field1956 = class126.field1968;
                    }
                    class126.field1963 = class126.field1945;
                }
                class129 var8 = class129.field2006;
                synchronized (class129.field2006) {
                    class129.field1995 = class129.field1992;
                    class129.field1996 = class129.field2004;
                    class129.field1997 = class129.field1994 * 1333259055;
                    class129.field1990 = class129.field1998;
                    class129.field2002 = class129.field1999;
                    class129.field2003 = class129.field2000;
                    class129.field2005 = class129.field2001;
                    class129.field1998 = 0;
                }
                if (Statics.field184 != null) {
                    int var10 = Statics.field184.method2406();
                    field448 = var10;
                }
                if (field250 == 0) {
                    method2361();
                    class133.method704();
                } else if (field250 == 5) {
                    class29.method477(this);
                    method2361();
                    Statics.field145.method2414();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2042[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2041[var12] = 0L;
                    }
                    Statics.field1282 = 0;
                } else if (field250 == 10 || field250 == 11) {
                    class29.method477(this);
                } else if (field250 == 20) {
                    class29.method477(this);
                    method148();
                } else if (field250 == 25) {
                    method792();
                }
                if (field250 == 30) {
                    method118();
                } else if (field250 == 40 || field250 == 45) {
                    method148();
                }
                return;
            }
            var2.field2489.method2743(var2.field2486, (int) var2.field2887, var2.field2491, false);
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method172() {
        boolean var1;
        label217: {
            try {
                if (class164.field2722 == 2) {
                    if (Statics.field3020 == null) {
                        Statics.field3020 = class161.method2903(Statics.field2723, Statics.field2725, Statics.field2720);
                        if (Statics.field3020 == null) {
                            var1 = false;
                            break label217;
                        }
                    }
                    if (Statics.field2727 == null) {
                        Statics.field2727 = new class54(Statics.field2719, Statics.field1903);
                    }
                    if (Statics.field2721.method3041(Statics.field3020, Statics.field2724, Statics.field2727, 22050)) {
                        Statics.field2721.method3059();
                        Statics.field2721.method2965(Statics.field1565);
                        Statics.field2721.method2970(Statics.field3020, Statics.field2726);
                        class164.field2722 = 0;
                        Statics.field3020 = null;
                        Statics.field2727 = null;
                        Statics.field2723 = null;
                        var1 = true;
                        break label217;
                    }
                }
            } catch (Exception var25) {
                var25.printStackTrace();
                Statics.field2721.method3058();
                class164.field2722 = 0;
                Statics.field3020 = null;
                Statics.field2727 = null;
                Statics.field2723 = null;
            }
            var1 = false;
        }
        if (var1 && field352 && Statics.field1015 != null) {
            Statics.field1015.method960();
        }
        if (field2045) {
            Canvas var4 = Statics.field683;
            var4.removeKeyListener(class126.field1947);
            var4.removeFocusListener(class126.field1947);
            class126.field1956 = -1;
            class129.method2023(Statics.field683);
            if (Statics.field184 != null) {
                Statics.field184.method2400(Statics.field683);
            }
            this.method2547();
            Canvas var5 = Statics.field683;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class126.field1947);
            var5.addFocusListener(class126.field1947);
            Canvas var6 = Statics.field683;
            var6.addMouseListener(class129.field2006);
            var6.addMouseMotionListener(class129.field2006);
            var6.addFocusListener(class129.field2006);
            if (Statics.field184 != null) {
                Statics.field184.method2410(Statics.field683);
            }
        }
        if (field250 == 0) {
            class133.method757(class29.field661, class29.field684, (Color) null);
        } else if (field250 == 5) {
            class29.method1827(Statics.field3, Statics.field681);
        } else if (field250 == 10 || field250 == 11) {
            class29.method1827(Statics.field3, Statics.field681);
        } else if (field250 == 20) {
            class29.method1827(Statics.field3, Statics.field681);
        } else if (field250 == 25) {
            if (field257 == 1) {
                if (field298 > field299) {
                    field299 = field298;
                }
                int var7 = (field299 * 50 - field298 * 50) / field299;
                method2535(class145.field2157 + class2.field21 + class2.field31 + var7 + "%" + class2.field24, false);
            } else if (field257 == 2) {
                if (field259 > field301) {
                    field301 = field259;
                }
                int var8 = (field301 * 50 - field259 * 50) / field301 + 50;
                method2535(class145.field2157 + class2.field21 + class2.field31 + var8 + "%" + class2.field24, false);
            } else {
                method2535(class145.field2157, false);
            }
        } else if (field250 == 30) {
            if (field421 != -1) {
                int var9 = field421;
                if (class155.method1264(var9)) {
                    method2483(Statics.field2565[var9], -1);
                }
            }
            for (int var10 = 0; var10 < field453; var10++) {
                if (field470[var10]) {
                    field456[var10] = true;
                }
                field457[var10] = field470[var10];
                field470[var10] = false;
            }
            field323 = field410;
            field254 = -1;
            field398 = -1;
            Statics.field52 = null;
            if (field421 != -1) {
                field453 = 0;
                method89(field421, 0, 0, 765, 503, 0, 0, -1);
            }
            class74.method1459();
            if (field388) {
                method1352();
            } else if (field254 != -1) {
                int var11 = field254;
                int var12 = field398;
                if (field360 >= 2 || field402 != 0 || field404) {
                    String var13;
                    if (field402 == 1 && field360 < 2) {
                        var13 = class145.field2298 + class145.field2308 + field403 + " " + class2.field26;
                    } else if (field404 && field360 < 2) {
                        var13 = field407 + class145.field2308 + field408 + " " + class2.field26;
                    } else {
                        int var14 = field360 - 1;
                        String var15;
                        if (field361[var14].length() > 0) {
                            var15 = field395[var14] + class145.field2308 + field361[var14];
                        } else {
                            var15 = field395[var14];
                        }
                        var13 = var15;
                    }
                    if (field360 > 2) {
                        var13 = var13 + class2.method1265(16777215) + " " + '/' + " " + (field360 - 2) + class145.field2302;
                    }
                    Statics.field3.method3375(var13, var11 + 4, var12 + 15, 16777215, 0, field410 / 1000);
                }
            }
            if (field462 == 3) {
                for (int var16 = 0; var16 < field453; var16++) {
                    if (field457[var16]) {
                        class74.method1481(field458[var16], field510[var16], field487[var16], field461[var16], 16711935, 128);
                    } else if (field456[var16]) {
                        class74.method1481(field458[var16], field510[var16], field487[var16], field461[var16], 16711680, 128);
                    }
                }
            }
            class21.method2420(Statics.field1121, Statics.field2031.field753, Statics.field2031.field736, field240);
            field240 = 0;
        } else if (field250 == 40) {
            method2535(class145.field2158 + class2.field21 + class145.field2188, false);
        } else if (field250 == 45) {
            method2535(class145.field2306, false);
        }
        if (field250 == 30 && field462 == 0 && !field2033) {
            try {
                Graphics var17 = Statics.field683.getGraphics();
                for (int var18 = 0; var18 < field453; var18++) {
                    if (field456[var18]) {
                        Statics.field1449.method1295(var17, field458[var18], field510[var18], field487[var18], field461[var18]);
                        field456[var18] = false;
                    }
                }
            } catch (Exception var24) {
                Statics.field683.repaint();
            }
        } else if (field250 > 0) {
            try {
                Graphics var20 = Statics.field683.getGraphics();
                Statics.field1449.method1300(var20, 0, 0);
                field2033 = false;
                for (int var21 = 0; var21 < field453; var21++) {
                    field456[var21] = false;
                }
            } catch (Exception var23) {
                Statics.field683.repaint();
            }
        }
    }

    @ObfuscatedName("client.n(B)V")
    public final void method255() {
        if (Statics.field256 != null) {
            Statics.field256.field163 = false;
        }
        Statics.field256 = null;
        if (Statics.field550 != null) {
            Statics.field550.method2537();
            Statics.field550 = null;
        }
        if (class126.field1947 != null) {
            class126 var1 = class126.field1947;
            synchronized (class126.field1947) {
                class126.field1947 = null;
            }
        }
        class129.method1357();
        Statics.field184 = null;
        if (Statics.field1015 != null) {
            Statics.field1015.method961();
        }
        if (Statics.field1084 != null) {
            Statics.field1084.method961();
        }
        if (Statics.field2514 != null) {
            Statics.field2514.method2537();
        }
        class152.method164();
        Statics.method122();
    }

    @ObfuscatedName("l.d(II)V")
    public static void method88(int arg0) {
        if (field250 == arg0) {
            return;
        }
        if (field250 == 0) {
            Statics.field1070 = null;
            Statics.field27 = null;
            Statics.field2049 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field409 = 0;
            field279 = 0;
            field473 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field174 != null) {
            Statics.field174.method2537();
            Statics.field174 = null;
        }
        if (field250 == 25) {
            field257 = 0;
            field298 = 0;
            field299 = 1;
            field259 = 0;
            field301 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method2763(Statics.field683, Statics.field1283, Statics.field533, true, 0);
        } else if (arg0 == 20) {
            class29.method2763(Statics.field683, Statics.field1283, Statics.field533, true, field250 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method2763(Statics.field683, Statics.field1283, Statics.field533, false, 4);
        } else if (Statics.field657) {
            Statics.field643 = null;
            Statics.field680 = null;
            Statics.field648 = null;
            Statics.field690 = null;
            Statics.field662 = null;
            Statics.field647 = null;
            Statics.field2677 = null;
            Statics.field646 = null;
            Statics.field670 = null;
            Statics.field557 = null;
            Statics.field1866 = null;
            Statics.field1899 = null;
            Statics.field615 = null;
            Statics.field1792 = null;
            Statics.field651 = null;
            Statics.field202 = null;
            Statics.field674 = null;
            Statics.field517 = null;
            Statics.field2837 = null;
            Statics.field1124 = null;
            Statics.field645 = null;
            Statics.field656 = null;
            class164.field2722 = 1;
            Statics.field2723 = null;
            Statics.field2725 = -1;
            Statics.field2720 = -1;
            Statics.field1565 = 0;
            Statics.field2726 = false;
            Statics.field582 = 2;
            class153.method2336(true);
            Statics.field657 = false;
        }
        field250 = arg0;
    }

    @ObfuscatedName("client.h(I)V")
    public void method174() {
        if (field250 == 1000) {
            return;
        }
        long var1 = class104.method528();
        int var3 = (int) (var1 - Statics.field2508);
        Statics.field2508 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2505 += var3;
        boolean var4;
        if (class153.field2509 == 0 && class153.field2506 == 0 && class153.field2500 == 0 && class153.field2504 == 0) {
            var4 = true;
        } else if (Statics.field2514 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2505 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2506 < 20 && class153.field2504 > 0) {
                        class154 var5 = (class154) class153.field2503.method3139();
                        class108 var6 = new class108(4);
                        var6.method2069(1);
                        var6.method2217((int) var5.field2887);
                        Statics.field2514.method2532(var6.field1828, 0, 4);
                        class153.field2507.method3137(var5, var5.field2887);
                        class153.field2504--;
                        class153.field2506++;
                    }
                    while (class153.field2509 < 20 && class153.field2500 > 0) {
                        class154 var7 = (class154) class153.field2517.method3225();
                        class108 var8 = new class108(4);
                        var8.method2069(0);
                        var8.method2217((int) var7.field2887);
                        Statics.field2514.method2532(var8.field1828, 0, 4);
                        var7.method3235();
                        class153.field2511.method3137(var7, var7.field2887);
                        class153.field2500--;
                        class153.field2509++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2514.method2530();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2505 = 0;
                        byte var11 = 0;
                        if (Statics.field1427 == null) {
                            var11 = 8;
                        } else if (class153.field2513 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2512.field1824;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2514.method2531(class153.field2512.field1828, class153.field2512.field1824, var12);
                            if (class153.field2516 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2512.field1828[class153.field2512.field1824 + var13] ^= class153.field2516;
                                }
                            }
                            class153.field2512.field1824 += var12;
                            if (class153.field2512.field1824 < var11) {
                                break;
                            }
                            if (Statics.field1427 == null) {
                                class153.field2512.field1824 = 0;
                                int var14 = class153.field2512.method2083();
                                int var15 = class153.field2512.method2263();
                                int var16 = class153.field2512.method2083();
                                int var17 = class153.field2512.method2117();
                                long var18 = (long) ((var14 << 16) + var15);
                                class154 var20 = (class154) class153.field2507.method3140(var18);
                                Statics.field81 = true;
                                if (var20 == null) {
                                    var20 = (class154) class153.field2511.method3140(var18);
                                    Statics.field81 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1427 = var20;
                                Statics.field2400 = new class108(var17 + var21 + Statics.field1427.field2522);
                                Statics.field2400.method2069(var16);
                                Statics.field2400.method2245(var17);
                                class153.field2513 = 8;
                                class153.field2512.field1824 = 0;
                            } else if (class153.field2513 == 0) {
                                if (class153.field2512.field1828[0] == -1) {
                                    class153.field2513 = 1;
                                    class153.field2512.field1824 = 0;
                                } else {
                                    Statics.field1427 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2400.field1828.length - Statics.field1427.field2522;
                            int var23 = 512 - class153.field2513;
                            if (var23 > var22 - Statics.field2400.field1824) {
                                var23 = var22 - Statics.field2400.field1824;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2514.method2531(Statics.field2400.field1828, Statics.field2400.field1824, var23);
                            if (class153.field2516 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2400.field1828[Statics.field2400.field1824 + var24] ^= class153.field2516;
                                }
                            }
                            Statics.field2400.field1824 += var23;
                            class153.field2513 += var23;
                            if (Statics.field2400.field1824 == var22) {
                                if (Statics.field1427.field2887 == 16711935L) {
                                    Statics.field146 = Statics.field2400;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class150 var26 = class153.field2515[var25];
                                        if (var26 != null) {
                                            Statics.field146.field1824 = var25 * 8 + 5;
                                            int var27 = Statics.field146.method2117();
                                            int var28 = Statics.field146.method2117();
                                            var26.method2739(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2510.reset();
                                    class153.field2510.update(Statics.field2400.field1828, 0, var22);
                                    int var29 = (int) class153.field2510.getValue();
                                    if (Statics.field1427.field2526 != var29) {
                                        try {
                                            Statics.field2514.method2537();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2502++;
                                        Statics.field2514 = null;
                                        class153.field2516 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2502 = 0;
                                    class153.field2518 = 0;
                                    Statics.field1427.field2520.method2746((int) (Statics.field1427.field2887 & 0xFFFFL), Statics.field2400.field1828, (Statics.field1427.field2887 & 0xFF0000L) == 16711680L, Statics.field81);
                                }
                                Statics.field1427.method3259();
                                if (Statics.field81) {
                                    class153.field2506--;
                                } else {
                                    class153.field2509--;
                                }
                                class153.field2513 = 0;
                                Statics.field1427 = null;
                                Statics.field2400 = null;
                            } else {
                                if (class153.field2513 != 512) {
                                    break;
                                }
                                class153.field2513 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2514.method2537();
                } catch (Exception var34) {
                }
                class153.field2518++;
                Statics.field2514 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method175();
        }
    }

    @ObfuscatedName("client.y(I)V")
    public void method175() {
        if (class153.field2502 >= 4) {
            this.method2557("js5crc");
            field250 = 1000;
            return;
        }
        if (class153.field2518 >= 4) {
            if (field250 <= 5) {
                this.method2557("js5io");
                field250 = 1000;
                return;
            }
            field275 = 3000;
            class153.field2518 = 3;
        }
        if (--field275 + 1 > 0) {
            return;
        }
        try {
            if (field274 == 0) {
                Statics.field1294 = Statics.field519.method2441(Statics.field671, Statics.field1801);
                field274++;
            }
            if (field274 == 1) {
                if (Statics.field1294.field2055 == 2) {
                    this.method351(-1);
                    return;
                }
                if (Statics.field1294.field2055 == 1) {
                    field274++;
                }
            }
            if (field274 == 2) {
                Statics.field225 = new class132((Socket) Statics.field1294.field2059, Statics.field519);
                class108 var1 = new class108(5);
                var1.method2069(15);
                var1.method2245(69);
                Statics.field225.method2532(var1.field1828, 0, 5);
                field274++;
                Statics.field1877 = class104.method528();
            }
            if (field274 == 3) {
                if (field250 <= 5 || Statics.field225.method2530() > 0) {
                    int var2 = Statics.field225.method2533();
                    if (var2 != 0) {
                        this.method351(var2);
                        return;
                    }
                    field274++;
                } else if (class104.method528() - Statics.field1877 > 30000L) {
                    this.method351(-2);
                    return;
                }
            }
            if (field274 == 4) {
                class153.method2385(Statics.field225, field250 > 20);
                Statics.field1294 = null;
                Statics.field225 = null;
                field274 = 0;
                field348 = 0;
            }
        } catch (IOException var4) {
            this.method351(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method351(int arg0) {
        Statics.field1294 = null;
        Statics.field225 = null;
        field274 = 0;
        if (Statics.field2453 == Statics.field1801) {
            Statics.field1801 = Statics.field1902;
        } else {
            Statics.field1801 = Statics.field2453;
        }
        field348++;
        if (field348 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field250 <= 5) {
                this.method2557("js5connect_full");
                field250 = 1000;
            } else {
                field275 = 3000;
            }
        } else if (field348 >= 2 && arg0 == 6) {
            this.method2557("js5connect_outofdate");
            field250 = 1000;
        } else if (field348 >= 4) {
            if (field250 <= 5) {
                this.method2557("js5connect");
                field250 = 1000;
            } else {
                field275 = 3000;
            }
        }
    }

    @ObfuscatedName("dh.i(I)V")
    public static void method2361() {
        if (field273 == 0) {
            Statics.field303 = new class80(4, 104, 104, class6.field76);
            for (int var0 = 0; var0 < 4; var0++) {
                field304[var0] = new class209(104, 104);
            }
            Statics.field1810 = new class73(512, 512);
            class29.field684 = class145.field2282;
            class29.field661 = 5;
            field273 = 20;
        } else if (field273 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1479[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1627(var1, 500, 800, 512, 334);
            class29.field684 = class145.field2161;
            class29.field661 = 10;
            field273 = 30;
        } else if (field273 == 30) {
            Statics.field2088 = method483(0, false, true, true);
            Statics.field637 = method483(1, false, true, true);
            Statics.field1987 = method483(2, true, false, true);
            Statics.field84 = method483(3, false, true, true);
            Statics.field215 = method483(4, false, true, true);
            Statics.field276 = method483(5, true, true, true);
            Statics.field1860 = method483(6, true, true, false);
            Statics.field2473 = method483(7, false, true, true);
            Statics.field533 = method483(8, false, true, true);
            Statics.field124 = method483(9, false, true, true);
            Statics.field1283 = method483(10, false, true, true);
            Statics.field2834 = method483(11, false, true, true);
            Statics.field1348 = method483(12, false, true, true);
            Statics.field641 = method483(13, true, false, true);
            Statics.field2757 = method483(14, false, true, false);
            Statics.field1918 = method483(15, false, true, true);
            class29.field684 = class145.field2339;
            class29.field661 = 20;
            field273 = 40;
        } else if (field273 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2088.method2738() * 4 / 100;
            int var8 = var7 + Statics.field637.method2738() * 4 / 100;
            int var9 = var8 + Statics.field1987.method2738() * 2 / 100;
            int var10 = var9 + Statics.field84.method2738() * 2 / 100;
            int var11 = var10 + Statics.field215.method2738() * 6 / 100;
            int var12 = var11 + Statics.field276.method2738() * 4 / 100;
            int var13 = var12 + Statics.field1860.method2738() * 2 / 100;
            int var14 = var13 + Statics.field2473.method2738() * 60 / 100;
            int var15 = var14 + Statics.field533.method2738() * 2 / 100;
            int var16 = var15 + Statics.field124.method2738() * 2 / 100;
            int var17 = var16 + Statics.field1283.method2738() * 2 / 100;
            int var18 = var17 + Statics.field2834.method2738() * 2 / 100;
            int var19 = var18 + Statics.field1348.method2738() * 2 / 100;
            int var20 = var19 + Statics.field641.method2738() * 2 / 100;
            int var21 = var20 + Statics.field2757.method2738() * 2 / 100;
            int var22 = var21 + Statics.field1918.method2738() * 2 / 100;
            if (var22 == 100) {
                class29.field684 = class145.field2164;
                class29.field661 = 30;
                field273 = 45;
            } else {
                if (var22 != 0) {
                    class29.field684 = class145.field2258 + var22 + "%";
                }
                class29.field661 = 30;
            }
        } else if (field273 == 45) {
            class51.method3554(22050, !field247, 2);
            class165 var23 = new class165();
            var23.method3014(9, 128);
            Statics.field1015 = class51.method1841(Statics.field519, Statics.field683, 0, 22050);
            Statics.field1015.method967(var23);
            class150 var24 = Statics.field1918;
            class150 var25 = Statics.field2757;
            class150 var26 = Statics.field215;
            Statics.field2724 = var24;
            Statics.field1903 = var25;
            Statics.field2719 = var26;
            Statics.field2721 = var23;
            Statics.field1084 = class51.method1841(Statics.field519, Statics.field683, 1, 2048);
            Statics.field1842 = new class50();
            Statics.field1084.method967(Statics.field1842);
            Statics.field164 = new class69(22050, Statics.field1093);
            class29.field684 = class145.field2355;
            class29.field661 = 35;
            field273 = 50;
        } else if (field273 == 50) {
            int var27 = 0;
            if (Statics.field681 == null) {
                class150 var28 = Statics.field533;
                class150 var29 = Statics.field641;
                int var30 = var28.method2723("p11_full");
                int var31 = var28.method2676(var30, "");
                class205 var32 = Statics.method2843(var28, var29, var30, var31);
                Statics.field681 = var32;
            } else {
                var27++;
            }
            if (Statics.field1003 == null) {
                Statics.field1003 = class71.method1743(Statics.field533, Statics.field641, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field3 == null) {
                class150 var33 = Statics.field533;
                class150 var34 = Statics.field641;
                int var35 = var33.method2723("b12_full");
                int var36 = var33.method2676(var35, "");
                class205 var37 = Statics.method2843(var33, var34, var35, var36);
                Statics.field3 = var37;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class29.field684 = class145.field2166 + var27 * 100 / 3 + "%";
                class29.field661 = 40;
            } else {
                Statics.field521 = new class148(true);
                class29.field684 = class145.field2255;
                class29.field661 = 40;
                field273 = 60;
            }
        } else if (field273 == 60) {
            class150 var38 = Statics.field1283;
            class150 var39 = Statics.field533;
            int var40 = 0;
            if (var38.method2678("title.jpg", "")) {
                var40++;
            }
            if (var39.method2678("logo", "")) {
                var40++;
            }
            if (var39.method2678("titlebox", "")) {
                var40++;
            }
            if (var39.method2678("titlebutton", "")) {
                var40++;
            }
            if (var39.method2678("runes", "")) {
                var40++;
            }
            if (var39.method2678("title_mute", "")) {
                var40++;
            }
            if (var39.method2674("options_radio_buttons,0")) {
                var40++;
            }
            if (var39.method2674("options_radio_buttons,2")) {
                var40++;
            }
            var39.method2678("sl_back", "");
            var39.method2678("sl_flags", "");
            var39.method2678("sl_arrows", "");
            var39.method2678("sl_stars", "");
            var39.method2678("sl_button", "");
            byte var43 = 8;
            if (var40 < var43) {
                class29.field684 = class145.field2168 + var40 * 100 / var43 + "%";
                class29.field661 = 50;
            } else {
                class29.field684 = class145.field2169;
                class29.field661 = 50;
                method88(5);
                field273 = 70;
            }
        } else if (field273 == 70) {
            if (Statics.field1987.method2664()) {
                Statics.method27(Statics.field1987);
                class38.method22(Statics.field1987);
                class41.method30(Statics.field1987, Statics.field2473);
                class37.method799(Statics.field1987, Statics.field2473, field247);
                class150 var45 = Statics.field1987;
                class150 var46 = Statics.field2473;
                Statics.field807 = var45;
                Statics.field804 = var46;
                class150 var47 = Statics.field1987;
                class150 var48 = Statics.field2473;
                boolean var49 = field325;
                class205 var50 = Statics.field681;
                Statics.field1041 = var47;
                Statics.field2888 = var48;
                Statics.field144 = var49;
                Statics.field1016 = Statics.field1041.method2688(10);
                Statics.field1873 = var50;
                class150 var51 = Statics.field1987;
                class150 var52 = Statics.field2088;
                class150 var53 = Statics.field637;
                Statics.field916 = var51;
                Statics.field936 = var52;
                Statics.field2676 = var53;
                class40.method1739(Statics.field1987, Statics.field2473);
                class150 var54 = Statics.field1987;
                Statics.field984 = var54;
                class150 var55 = Statics.field1987;
                Statics.field1065 = var55;
                Statics.field1066 = Statics.field1065.method2688(16);
                class155.method574(Statics.field84, Statics.field2473, Statics.field533, Statics.field641);
                class45.method1283(Statics.field1987);
                class150 var56 = Statics.field1987;
                Statics.field998 = var56;
                class29.field684 = class145.field2171;
                class29.field661 = 60;
                field273 = 80;
            } else {
                class29.field684 = class145.field2170 + Statics.field1987.method2745() + "%";
                class29.field661 = 60;
            }
        } else if (field273 == 80) {
            int var57 = 0;
            if (Statics.field321 == null) {
                Statics.field321 = class71.method1025(Statics.field533, "compass", "");
            } else {
                var57++;
            }
            if (Statics.field307 == null) {
                Statics.field307 = class71.method1025(Statics.field533, "mapedge", "");
            } else {
                var57++;
            }
            if (Statics.field2067 == null) {
                Statics.field2067 = class71.method2638(Statics.field533, "mapscene", "");
            } else {
                var57++;
            }
            if (Statics.field13 == null) {
                Statics.field13 = class71.method6(Statics.field533, "mapfunction", "");
            } else {
                var57++;
            }
            if (Statics.field1301 == null) {
                Statics.field1301 = class71.method6(Statics.field533, "hitmarks", "");
            } else {
                var57++;
            }
            if (Statics.field667 == null) {
                Statics.field667 = class71.method6(Statics.field533, "headicons_pk", "");
            } else {
                var57++;
            }
            if (Statics.field913 == null) {
                Statics.field913 = class71.method6(Statics.field533, "headicons_prayer", "");
            } else {
                var57++;
            }
            if (Statics.field1453 == null) {
                Statics.field1453 = class71.method6(Statics.field533, "headicons_hint", "");
            } else {
                var57++;
            }
            if (Statics.field1966 == null) {
                Statics.field1966 = class71.method6(Statics.field533, "mapmarker", "");
            } else {
                var57++;
            }
            if (Statics.field1278 == null) {
                Statics.field1278 = class71.method6(Statics.field533, "cross", "");
            } else {
                var57++;
            }
            if (Statics.field520 == null) {
                Statics.field520 = class71.method6(Statics.field533, "mapdots", "");
            } else {
                var57++;
            }
            if (Statics.field1848 == null) {
                Statics.field1848 = class71.method2638(Statics.field533, "scrollbar", "");
            } else {
                var57++;
            }
            if (Statics.field597 == null) {
                Statics.field597 = class71.method2638(Statics.field533, "mod_icons", "");
            } else {
                var57++;
            }
            if (Statics.field522 == null) {
                Statics.field522 = class71.method151(Statics.field533, "mapback", "");
            } else {
                var57++;
            }
            if (var57 < 14) {
                class29.field684 = class145.field2172 + var57 * 100 / 14 + "%";
                class29.field661 = 70;
            } else {
                Statics.field2959 = Statics.field597;
                Statics.field307.method1359();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                for (int var62 = 0; var62 < Statics.field13.length; var62++) {
                    Statics.field13[var62].method1362(var58 + var61, var59 + var61, var60 + var61);
                }
                Statics.field2067[0].method1524(var58 + var61, var59 + var61, var60 + var61);
                Statics.field511 = new int[33];
                Statics.field1838 = new int[33];
                Statics.field2142 = new int[151];
                Statics.field14 = new int[151];
                for (int var63 = 0; var63 < 33; var63++) {
                    int var64 = 999;
                    int var65 = 0;
                    for (int var66 = 0; var66 < 34; var66++) {
                        if (Statics.field522.field1321[Statics.field522.field1323 * var63 + var66] == 0) {
                            if (var64 == 999) {
                                var64 = var66;
                            }
                        } else if (var64 != 999) {
                            var65 = var66;
                            break;
                        }
                    }
                    Statics.field511[var63] = var64;
                    Statics.field1838[var63] = var65 - var64;
                }
                for (int var67 = 5; var67 < 156; var67++) {
                    int var68 = 999;
                    int var69 = 0;
                    for (int var70 = 25; var70 < 172; var70++) {
                        if (Statics.field522.field1321[Statics.field522.field1323 * var67 + var70] == 0 && var70 > 34 || var67 > 34) {
                            if (var68 == 999) {
                                var68 = var70;
                            }
                        } else if (var68 != 999) {
                            var69 = var70;
                            break;
                        }
                    }
                    Statics.field2142[var67 - 5] = var68 - 25;
                    Statics.field14[var67 - 5] = var69 - var68;
                }
                class29.field684 = class145.field2206;
                class29.field661 = 70;
                field273 = 90;
            }
        } else if (field273 == 90) {
            if (Statics.field124.method2664()) {
                class89 var71 = new class89(Statics.field124, Statics.field533, 20, 0.8D, field247 ? 64 : 128);
                class85.method1752(var71);
                class85.method1753(0.8D);
                class29.field684 = class145.field2338;
                class29.field661 = 90;
                field273 = 110;
            } else {
                class29.field684 = class145.field2174 + Statics.field124.method2745() + "%";
                class29.field661 = 90;
            }
        } else if (field273 == 110) {
            Statics.field256 = new class12();
            Statics.field519.method2442(Statics.field256, 10);
            class29.field684 = class145.field2192;
            class29.field661 = 94;
            field273 = 120;
        } else if (field273 == 120) {
            if (Statics.field1283.method2678("huffman", "")) {
                class103 var72 = new class103(Statics.field1283.method2677("huffman", ""));
                Statics.field2953 = var72;
                class29.field684 = class145.field2178;
                class29.field661 = 96;
                field273 = 130;
            } else {
                class29.field684 = class145.field2354 + "%";
                class29.field661 = 96;
            }
        } else if (field273 == 130) {
            if (!Statics.field84.method2664()) {
                class29.field684 = class145.field2179 + Statics.field84.method2745() * 4 / 5 + "%";
                class29.field661 = 100;
            } else if (!Statics.field1348.method2664()) {
                class29.field684 = class145.field2179 + (80 + Statics.field1348.method2745() / 6) + "%";
                class29.field661 = 100;
            } else if (Statics.field641.method2664()) {
                class29.field684 = class145.field2361;
                class29.field661 = 100;
                field273 = 140;
            } else {
                class29.field684 = class145.field2179 + (96 + Statics.field641.method2745() / 20) + "%";
                class29.field661 = 100;
            }
        } else if (field273 == 140) {
            method88(10);
        }
    }

    @ObfuscatedName("e.s(IZZZB)Lev;")
    public static class150 method483(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2080 != null) {
            var4 = new class123(arg0, class138.field2080, Statics.field2079[arg0], 1000000);
        }
        return new class150(var4, Statics.field1747, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("i.f(I)V")
    public static final void method148() {
        try {
            if (field409 == 0) {
                if (Statics.field550 != null) {
                    Statics.field550.method2537();
                    Statics.field550 = null;
                }
                Statics.field2920 = null;
                field460 = false;
                field279 = 0;
                field409 = 1;
            }
            if (field409 == 1) {
                if (Statics.field2920 == null) {
                    Statics.field2920 = Statics.field519.method2441(Statics.field671, Statics.field1801);
                }
                if (Statics.field2920.field2055 == 2) {
                    throw new IOException();
                }
                if (Statics.field2920.field2055 == 1) {
                    Statics.field550 = new class132((Socket) Statics.field2920.field2059, Statics.field519);
                    Statics.field2920 = null;
                    field409 = 2;
                }
            }
            if (field409 == 2) {
                field285.field1824 = 0;
                field285.method2069(14);
                Statics.field550.method2532(field285.field1828, 0, 1);
                field504.field1824 = 0;
                field409 = 3;
            }
            if (field409 == 3) {
                if (Statics.field1015 != null) {
                    Statics.field1015.method991();
                }
                if (Statics.field1084 != null) {
                    Statics.field1084.method991();
                }
                int var0 = Statics.field550.method2533();
                if (Statics.field1015 != null) {
                    Statics.field1015.method991();
                }
                if (Statics.field1084 != null) {
                    Statics.field1084.method991();
                }
                if (var0 != 0) {
                    method3350(var0);
                    return;
                }
                field504.field1824 = 0;
                field409 = 5;
            }
            if (field409 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field285.field1824 = 0;
                field285.method2069(1);
                field285.method2069(class29.field669.method457());
                field285.method2245(var1[0]);
                field285.method2245(var1[1]);
                field285.method2245(var1[2]);
                field285.method2245(var1[3]);
                switch(class29.field669.field2409) {
                    case 0:
                    case 3:
                        field285.method2217(Statics.field610);
                        field285.field1824 += 5;
                        break;
                    case 1:
                        field285.field1824 += 8;
                        break;
                    case 2:
                        field285.method2245((Integer) Statics.field217.field130.get(class211.method3521(class29.field655)));
                        field285.field1824 += 4;
                }
                field285.method2074(class29.field668);
                field285.method2101(class5.field61, class5.field62);
                field286.field1824 = 0;
                if (field250 == 40) {
                    field286.method2069(18);
                } else {
                    field286.method2069(16);
                }
                field286.method2195(0);
                int var2 = field286.field1824;
                field286.method2245(69);
                field286.method2146(field285.field1828, 0, field285.field1824);
                int var3 = field286.field1824;
                field286.method2074(class29.field655);
                field286.method2069(field247 ? 1 : 0);
                class111 var4 = field286;
                byte[] var5 = new byte[24];
                try {
                    class138.field2076.method3473(0L);
                    class138.field2076.method3461(var5);
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
                var4.method2146(var5, 0, 24);
                class108 var9 = new class108(Statics.field521.method2644());
                Statics.field521.method2643(var9);
                field286.method2146(var9.field1828, 0, var9.field1828.length);
                field286.method2245(Statics.field2088.field2465);
                field286.method2245(Statics.field637.field2465);
                field286.method2245(Statics.field1987.field2465);
                field286.method2245(Statics.field84.field2465);
                field286.method2245(Statics.field215.field2465);
                field286.method2245(Statics.field276.field2465);
                field286.method2245(Statics.field1860.field2465);
                field286.method2245(Statics.field2473.field2465);
                field286.method2245(Statics.field533.field2465);
                field286.method2245(Statics.field124.field2465);
                field286.method2245(Statics.field1283.field2465);
                field286.method2245(Statics.field2834.field2465);
                field286.method2245(Statics.field1348.field2465);
                field286.method2245(Statics.field641.field2465);
                field286.method2245(Statics.field2757.field2465);
                field286.method2245(Statics.field1918.field2465);
                field286.method2099(var1, var3, field286.field1824);
                field286.method2079(field286.field1824 - var2);
                Statics.field550.method2532(field286.field1828, 0, field286.field1824);
                field285.method2311(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field504.method2311(var1);
                field409 = 6;
            }
            if (field409 == 6 && Statics.field550.method2530() > 0) {
                int var11 = Statics.field550.method2533();
                if (var11 == 21 && field250 == 20) {
                    field409 = 7;
                } else if (var11 == 2) {
                    field409 = 9;
                } else if (var11 == 15 && field250 == 40) {
                    field285.field1824 = 0;
                    field504.field1824 = 0;
                    field289 = -1;
                    field293 = -1;
                    field294 = -1;
                    field295 = -1;
                    field288 = 0;
                    field290 = 0;
                    field260 = 0;
                    field360 = 0;
                    field388 = false;
                    field372 = 0;
                    field480 = 0;
                    for (int var12 = 0; var12 < field365.length; var12++) {
                        if (field365[var12] != null) {
                            field365[var12].field793 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field261.length; var13++) {
                        if (field261[var13] != null) {
                            field261[var13].field793 = -1;
                        }
                    }
                    class14.field188 = new class177(32);
                    method88(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field470[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field473 < 1) {
                    field473++;
                    field409 = 0;
                } else {
                    method3350(var11);
                    return;
                }
            }
            if (field409 == 7 && Statics.field550.method2530() > 0) {
                field420 = (Statics.field550.method2533() + 3) * 60;
                field409 = 8;
            }
            if (field409 == 8) {
                field279 = 0;
                class29.method133(class145.field2252, class145.field2185, field420 / 60 + class145.field2186);
                if (--field420 <= 0) {
                    field409 = 0;
                }
            } else {
                if (field409 == 9 && Statics.field550.method2530() >= 13) {
                    boolean var15 = Statics.field550.method2533() == 1;
                    Statics.field550.method2531(field504.field1828, 0, 4);
                    field504.field1824 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field504.method2310() << 24;
                        int var18 = var17 | field504.method2310() << 16;
                        int var19 = var18 | field504.method2310() << 8;
                        int var20 = var19 | field504.method2310();
                        int var21 = class211.method3521(class29.field655);
                        if (Statics.field217.field130.size() >= 10 && !Statics.field217.field130.containsKey(var21)) {
                            Iterator var22 = Statics.field217.field130.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field217.field130.put(var21, var20);
                        class9.method2526();
                    }
                    field416 = Statics.field550.method2533();
                    field418 = Statics.field550.method2533() == 1;
                    field371 = Statics.field550.method2533();
                    field371 <<= 0x8;
                    field371 += Statics.field550.method2533();
                    field281 = Statics.field550.method2533();
                    Statics.field550.method2531(field504.field1828, 0, 1);
                    field504.field1824 = 0;
                    field289 = field504.method2310();
                    Statics.field550.method2531(field504.field1828, 0, 2);
                    field504.field1824 = 0;
                    field288 = field504.method2263();
                    if (field281 == 1) {
                        try {
                            client var23 = Statics.field241;
                            JSObject.getWindow(var23).call("zap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    } else {
                        try {
                            client var25 = Statics.field241;
                            JSObject.getWindow(var25).call("unzap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    }
                    field409 = 10;
                }
                if (field409 != 10) {
                    field279++;
                    if (field279 > 2000) {
                        if (field473 < 1) {
                            if (Statics.field2453 == Statics.field1801) {
                                Statics.field1801 = Statics.field1902;
                            } else {
                                Statics.field1801 = Statics.field2453;
                            }
                            field473++;
                            field409 = 0;
                        } else {
                            method3350(-3);
                        }
                    }
                } else if (Statics.field550.method2530() >= field288) {
                    field504.field1824 = 0;
                    Statics.field550.method2531(field504.field1828, 0, field288);
                    method555();
                    Statics.field600 = -1;
                    method2762(false);
                    field289 = -1;
                }
            }
        } catch (IOException var31) {
            if (field473 < 1) {
                if (Statics.field2453 == Statics.field1801) {
                    Statics.field1801 = Statics.field1902;
                } else {
                    Statics.field1801 = Statics.field2453;
                }
                field473++;
                field409 = 0;
            } else {
                method3350(-2);
            }
        }
    }

    @ObfuscatedName("ae.u(I)V")
    public static void method555() {
        field253 = 1L;
        field297 = -1;
        Statics.field256.field162 = 0;
        Statics.field734 = true;
        field258 = true;
        field454 = -1L;
        class192.field2900 = new class183();
        field285.field1824 = 0;
        field504.field1824 = 0;
        field289 = -1;
        field293 = -1;
        field294 = -1;
        field295 = -1;
        field290 = 0;
        field260 = 0;
        field292 = 0;
        field296 = 0;
        field360 = 0;
        field388 = false;
        class129.method156(0);
        class10.method450();
        field402 = 0;
        field404 = false;
        field397 = 0;
        field308 = (int) (Math.random() * 100.0D) - 50;
        field488 = (int) (Math.random() * 110.0D) - 55;
        field400 = (int) (Math.random() * 80.0D) - 40;
        field315 = (int) (Math.random() * 120.0D) - 60;
        field378 = (int) (Math.random() * 30.0D) - 20;
        field330 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field372 = 0;
        field472 = -1;
        field480 = 0;
        field481 = 0;
        field271 = class18.field513;
        field255 = 0;
        field283 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field365[var0] = null;
            field370[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field261[var1] = null;
        }
        Statics.field2031 = field365[2047] = new class3();
        field379 = -1;
        field382.method3168();
        field383.method3168();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field349[var2][var3][var4] = null;
                }
            }
        }
        field380 = new class180();
        field501 = 0;
        field500 = 0;
        field381 = 0;
        for (int var5 = 0; var5 < Statics.field1066; var5++) {
            class47 var6 = class47.method756(var5);
            if (var6 != null) {
                class157.field2675[var5] = 0;
                class157.field2672[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field440.length; var7++) {
            field440[var7] = -1;
        }
        field417 = -1;
        if (field421 != -1) {
            class155.method547(field421);
        }
        for (class4 var8 = (class4) field245.method3139(); var8 != null; var8 = (class4) field245.method3146()) {
            method147(var8, true);
        }
        field421 = -1;
        field245 = new class177(8);
        field413 = null;
        field388 = false;
        field360 = 0;
        field506.method2891((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field376[var9] = null;
            field377[var9] = false;
        }
        class14.field188 = new class177(32);
        field251 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field470[var10] = true;
        }
        field291 = null;
        Statics.field825 = 0;
        Statics.field1296 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            field368[var11] = new class201();
        }
        Statics.field569 = null;
    }

    @ObfuscatedName("go.v(II)V")
    public static void method3350(int arg0) {
        if (arg0 == -3) {
            class29.method133(class145.field2153, class145.field2242, class145.field2257);
        } else if (arg0 == -2) {
            class29.method133(class145.field2190, class145.field2159, class145.field2309);
        } else if (arg0 == -1) {
            class29.method133(class145.field2193, class145.field2194, class145.field2256);
        } else if (arg0 == 3) {
            class29.method133(class145.field2196, class145.field2301, class145.field2198);
        } else if (arg0 == 4) {
            class29.method133(class145.field2199, class145.field2200, class145.field2201);
        } else if (arg0 == 5) {
            class29.method133(class145.field2202, class145.field2378, class145.field2155);
        } else if (arg0 == 6) {
            class29.method133(class145.field2205, class145.field2203, class145.field2207);
        } else if (arg0 == 7) {
            class29.method133(class145.field2208, class145.field2296, class145.field2340);
        } else if (arg0 == 8) {
            class29.method133(class145.field2211, class145.field2212, class145.field2213);
        } else if (arg0 == 9) {
            class29.method133(class145.field2210, class145.field2215, class145.field2216);
        } else if (arg0 == 10) {
            class29.method133(class145.field2191, class145.field2218, class145.field2219);
        } else if (arg0 == 11) {
            class29.method133(class145.field2220, class145.field2221, class145.field2222);
        } else if (arg0 == 12) {
            class29.method133(class145.field2167, class145.field2224, class145.field2225);
        } else if (arg0 == 13) {
            class29.method133(class145.field2226, class145.field2227, class145.field2228);
        } else if (arg0 == 14) {
            class29.method133(class145.field2381, class145.field2230, class145.field2304);
        } else if (arg0 == 16) {
            class29.method133(class145.field2232, class145.field2233, class145.field2234);
        } else if (arg0 == 17) {
            class29.method133(class145.field2329, class145.field2236, class145.field2251);
        } else if (arg0 == 18) {
            class29.method133(class145.field2241, class145.field2345, class145.field2173);
        } else if (arg0 == 19) {
            class29.method133(class145.field2237, class145.field2261, class145.field2337);
        } else if (arg0 == 20) {
            class29.method133(class145.field2244, class145.field2245, class145.field2246);
        } else if (arg0 == 22) {
            class29.method133(class145.field2374, class145.field2248, class145.field2249);
        } else if (arg0 == 23) {
            class29.method133(class145.field2250, class145.field2217, class145.field2313);
        } else if (arg0 == 24) {
            class29.method133(class145.field2253, class145.field2243, class145.field2312);
        } else if (arg0 == 25) {
            class29.method133(class145.field2195, class145.field2260, class145.field2342);
        } else if (arg0 == 26) {
            class29.method133(class145.field2259, class145.field2320, class145.field2264);
        } else if (arg0 == 27) {
            class29.method133(class145.field2262, class145.field2263, class145.field2231);
        } else if (arg0 == 31) {
            class29.method133(class145.field2271, class145.field2272, class145.field2273);
        } else if (arg0 == 32) {
            class29.method133(class145.field2274, class145.field2275, class145.field2276);
        } else if (arg0 == 37) {
            class29.method133(class145.field2285, class145.field2278, class145.field2279);
        } else if (arg0 == 38) {
            class29.method133(class145.field2280, class145.field2281, class145.field2348);
        } else if (arg0 == 55) {
            class29.method133(class145.field2283, class145.field2284, class145.field2336);
        } else if (arg0 == 56) {
            class29.method133(class145.field2286, class145.field2238, class145.field2288);
            method88(11);
            return;
        } else if (arg0 == 57) {
            class29.method133(class145.field2289, class145.field2183, class145.field2291);
            method88(11);
            return;
        } else {
            class29.method133(class145.field2292, class145.field2293, class145.field2294);
        }
        method88(10);
    }

    @ObfuscatedName("ez.r(I)V")
    public static final void method2640() {
        if (Statics.field550 != null) {
            Statics.field550.method2537();
            Statics.field550 = null;
        }
        method2029();
        Statics.field303.method1577();
        for (int var0 = 0; var0 < 4; var0++) {
            field304[var0].method3504();
        }
        System.gc();
        class164.field2722 = 1;
        Statics.field2723 = null;
        Statics.field2725 = -1;
        Statics.field2720 = -1;
        Statics.field1565 = 0;
        Statics.field2726 = false;
        Statics.field582 = 2;
        field484 = -1;
        field352 = false;
        for (class21 var1 = (class21) class21.field553.method3174(); var1 != null; var1 = (class21) class21.field553.method3176()) {
            if (var1.field558 != null) {
                Statics.field1842.method918(var1.field558);
                var1.field558 = null;
            }
            if (var1.field555 != null) {
                Statics.field1842.method918(var1.field555);
                var1.field555 = null;
            }
        }
        class21.field553.method3168();
        method88(10);
    }

    @ObfuscatedName("di.q(I)V")
    public static final void method2029() {
        class42.field975.method3100();
        class38.field902.method3100();
        class41.method3088();
        class37.method462();
        class36.field805.method3100();
        class36.field821.method3100();
        class46.method510();
        class39.field934.method3100();
        class39.field919.method3100();
        class40.field940.method3100();
        class40.field941.method3100();
        class43.field981.method3100();
        Statics.method780();
        class160.method493();
        class155.method155();
        ((class89) Statics.field1473).method1834();
        class19.field527.method3100();
        Statics.field2088.method2696();
        Statics.field637.method2696();
        Statics.field84.method2696();
        Statics.field215.method2696();
        Statics.field276.method2696();
        Statics.field1860.method2696();
        Statics.field2473.method2696();
        Statics.field533.method2696();
        Statics.field124.method2696();
        Statics.field1283.method2696();
        Statics.field2834.method2696();
        Statics.field1348.method2696();
    }

    @ObfuscatedName("z.x(I)V")
    public static final void method21() {
        if (field292 > 0) {
            method2640();
        } else {
            method88(40);
            Statics.field174 = Statics.field550;
            Statics.field550 = null;
        }
    }

    @ObfuscatedName("d.t(I)V")
    public static final void method118() {
        if (field260 > 1) {
            field260--;
        }
        if (field292 > 0) {
            field292--;
        }
        if (field460) {
            field460 = false;
            method21();
            return;
        }
        if (!field388) {
            field395[0] = class145.field2229;
            field361[0] = "";
            field393[0] = 1006;
            field360 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2543(); var0++) {
        }
        if (field250 != 30) {
            return;
        }
        while (true) {
            class191 var1 = (class191) class192.field2900.method3213();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field256.field161;
                synchronized (Statics.field256.field161) {
                    if (!field412) {
                        Statics.field256.field162 = 0;
                    } else if (class129.field1990 != 0 || Statics.field256.field162 >= 40) {
                        field285.method2312(51);
                        field285.method2069(0);
                        int var5 = field285.field1824;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field256.field162 && field285.field1824 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field256.field160[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field256.field165[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field256.field160[var7] == -1 && Statics.field256.field165[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field475 != var9 || field263 != var8) {
                                int var11 = var9 - field475;
                                field475 = var9;
                                int var12 = var8 - field263;
                                field263 = var8;
                                if (field297 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field285.method2195((field297 << 12) + (var11 << 6) + var12);
                                    field297 = 0;
                                } else if (field297 < 8) {
                                    field285.method2217((field297 << 19) + 8388608 + var10);
                                    field297 = 0;
                                } else {
                                    field285.method2245((field297 << 19) + -1073741824 + var10);
                                    field297 = 0;
                                }
                            } else if (field297 < 2047) {
                                field297++;
                            }
                        }
                        field285.method2189(field285.field1824 - var5);
                        if (var6 >= Statics.field256.field162) {
                            Statics.field256.field162 = 0;
                        } else {
                            Statics.field256.field162 -= var6;
                            for (int var13 = 0; var13 < Statics.field256.field162; var13++) {
                                Statics.field256.field165[var13] = Statics.field256.field165[var6 + var13];
                                Statics.field256.field160[var13] = Statics.field256.field160[var6 + var13];
                            }
                        }
                    }
                }
                if (class129.field1990 == 1 || !Statics.field2927 && class129.field1990 == 4 || class129.field1990 == 2) {
                    long var15 = (class129.field2005 - field253 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field253 = class129.field2005 * -1L;
                    int var17 = class129.field2003;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 502) {
                        var17 = 502;
                    }
                    int var18 = class129.field2002;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 764) {
                        var18 = 764;
                    }
                    int var19 = var17 * 765 + var18;
                    byte var20 = 0;
                    if (class129.field1990 == 2) {
                        var20 = 1;
                    }
                    int var21 = (int) var15;
                    field285.method2312(201);
                    field285.method2245((var20 << 19) + (var21 << 20) + var19);
                }
                if (class126.field1955 > 0) {
                    field285.method2312(28);
                    field285.method2195(0);
                    int var22 = field285.field1824;
                    long var23 = class104.method528();
                    for (int var25 = 0; var25 < class126.field1955; var25++) {
                        long var26 = var23 - field454;
                        if (var26 > 16777215L) {
                            var26 = 16777215L;
                        }
                        field454 = var23;
                        field285.method2121((int) var26);
                        field285.method2088(class126.field1959[var25]);
                    }
                    field285.method2079(field285.field1824 - var22);
                }
                if (field335 > 0) {
                    field335--;
                }
                if (class126.field1969[96] || class126.field1969[97] || class126.field1969[98] || class126.field1969[99]) {
                    field336 = true;
                }
                if (field336 && field335 <= 0) {
                    field335 = 20;
                    field336 = false;
                    field285.method2312(249);
                    field285.method2115(field329);
                    field285.method2113(field330);
                }
                if (Statics.field734 && !field258) {
                    field258 = true;
                    field285.method2312(251);
                    field285.method2069(1);
                }
                if (!Statics.field734 && field258) {
                    field258 = false;
                    field285.method2312(251);
                    field285.method2069(0);
                }
                method603();
                if (field250 != 30) {
                    return;
                }
                method509();
                int var10002;
                for (int var28 = 0; var28 < field397; var28++) {
                    var10002 = field491[var28]--;
                    if (field491[var28] >= -10) {
                        class53 var30 = field493[var28];
                        if (var30 == null) {
                            class53 var10000 = (class53) null;
                            var30 = class53.method1019(Statics.field215, field489[var28], 0);
                            if (var30 == null) {
                                continue;
                            }
                            field491[var28] += var30.method1012();
                            field493[var28] = var30;
                        }
                        if (field491[var28] < 0) {
                            int var37;
                            if (field306[var28] == 0) {
                                var37 = field486;
                            } else {
                                int var31 = (field306[var28] & 0xFF) * 128;
                                int var32 = field306[var28] >> 16 & 0xFF;
                                int var33 = var32 * 128 + 64 - Statics.field2031.field753;
                                if (var33 < 0) {
                                    var33 = -var33;
                                }
                                int var34 = field306[var28] >> 8 & 0xFF;
                                int var35 = var34 * 128 + 64 - Statics.field2031.field736;
                                if (var35 < 0) {
                                    var35 = -var35;
                                }
                                int var36 = var33 + var35 - 128;
                                if (var36 > var31) {
                                    field491[var28] = -100;
                                    continue;
                                }
                                if (var36 < 0) {
                                    var36 = 0;
                                }
                                var37 = field430 * (var31 - var36) / var31;
                            }
                            if (var37 > 0) {
                                class57 var38 = var30.method1011().method1044(Statics.field164);
                                class59 var39 = class59.method1127(var38, 100, var37);
                                var39.method1068(field287[var28] - 1);
                                Statics.field1842.method913(var39);
                            }
                            field491[var28] = -100;
                        }
                    } else {
                        field397--;
                        for (int var29 = var28; var29 < field397; var29++) {
                            field489[var29] = field489[var29 + 1];
                            field493[var29] = field493[var29 + 1];
                            field287[var29] = field287[var29 + 1];
                            field491[var29] = field491[var29 + 1];
                            field306[var29] = field306[var29 + 1];
                        }
                        var28--;
                    }
                }
                if (field352 && !class164.method481()) {
                    if (field483 != 0 && field484 != -1) {
                        Statics.method31(Statics.field1860, field484, 0, field483, false);
                    }
                    field352 = false;
                }
                field290++;
                if (field290 > 750) {
                    method21();
                    return;
                }
                for (int var40 = -1; var40 < field255; var40++) {
                    int var41;
                    if (var40 == -1) {
                        var41 = 2047;
                    } else {
                        var41 = field367[var40];
                    }
                    class3 var42 = field365[var41];
                    if (var42 != null) {
                        method491(var42, 1);
                    }
                }
                method2008();
                for (int var43 = -1; var43 < field255; var43++) {
                    int var44;
                    if (var43 == -1) {
                        var44 = 2047;
                    } else {
                        var44 = field367[var43];
                    }
                    class3 var45 = field365[var44];
                    if (var45 != null && var45.field751 > 0) {
                        var45.field751--;
                        if (var45.field751 == 0) {
                            var45.field748 = null;
                        }
                    }
                }
                for (int var46 = 0; var46 < field283; var46++) {
                    int var47 = field284[var46];
                    class31 var48 = field261[var47];
                    if (var48 != null && var48.field751 > 0) {
                        var48.field751--;
                        if (var48.field751 == 0) {
                            var48.field748 = null;
                        }
                    }
                }
                field240++;
                if (field355 != 0) {
                    field477 += 20;
                    if (field477 >= 400) {
                        field355 = 0;
                    }
                }
                if (Statics.field1261 != null) {
                    field356++;
                    if (field356 >= 15) {
                        method2761(Statics.field1261);
                        Statics.field1261 = null;
                    }
                }
                class155 var49 = Statics.field986;
                class155 var50 = Statics.field2022;
                Statics.field986 = null;
                Statics.field2022 = null;
                field310 = null;
                field429 = false;
                field426 = false;
                field469 = 0;
                while (class126.method2460() && field469 < 128) {
                    if (field416 >= 2 && class126.field1969[82] && Statics.field693 == 66) {
                        String var51 = class10.method559();
                        Statics.field1574.setContents(new StringSelection(var51), (ClipboardOwner) null);
                    } else {
                        field471[field469] = Statics.field693;
                        field326[field469] = Statics.field2118;
                        field469++;
                    }
                }
                method1740(field421, 0, 0, 765, 503, 0, 0);
                field433++;
                while (true) {
                    class1 var52;
                    class155 var53;
                    class155 var54;
                    do {
                        var52 = (class1) field450.method3186();
                        if (var52 == null) {
                            while (true) {
                                class1 var55;
                                class155 var56;
                                class155 var57;
                                do {
                                    var55 = (class1) field451.method3186();
                                    if (var55 == null) {
                                        while (true) {
                                            class1 var58;
                                            class155 var59;
                                            class155 var60;
                                            do {
                                                var58 = (class1) field449.method3186();
                                                if (var58 == null) {
                                                    boolean var61 = false;
                                                    while (!var61) {
                                                        var61 = true;
                                                        for (int var62 = 0; var62 < field360 - 1; var62++) {
                                                            if (field393[var62] < 1000 && field393[var62 + 1] > 1000) {
                                                                String var63 = field361[var62];
                                                                field361[var62] = field361[var62 + 1];
                                                                field361[var62 + 1] = var63;
                                                                String var64 = field395[var62];
                                                                field395[var62] = field395[var62 + 1];
                                                                field395[var62 + 1] = var64;
                                                                int var65 = field393[var62];
                                                                field393[var62] = field393[var62 + 1];
                                                                field393[var62 + 1] = var65;
                                                                int var66 = field320[var62];
                                                                field320[var62] = field320[var62 + 1];
                                                                field320[var62 + 1] = var66;
                                                                int var67 = field392[var62];
                                                                field392[var62] = field392[var62 + 1];
                                                                field392[var62 + 1] = var67;
                                                                int var68 = field394[var62];
                                                                field394[var62] = field394[var62 + 1];
                                                                field394[var62 + 1] = var68;
                                                                var61 = false;
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field158 == null && field401 == null) {
                                                        int var69 = class129.field1990;
                                                        if (field388) {
                                                            if (var69 != 1 && (Statics.field2927 || var69 != 4)) {
                                                                int var70 = class129.field1996;
                                                                int var71 = class129.field1997 * -918864945;
                                                                if (var70 < Statics.field1518 - 10 || var70 > Statics.field1518 + Statics.field1349 + 10 || var71 < Statics.field1417 - 10 || var71 > Statics.field389 + Statics.field1417 + 10) {
                                                                    field388 = false;
                                                                    method28(Statics.field1518, Statics.field1417, Statics.field1349, Statics.field389);
                                                                }
                                                            }
                                                            if (var69 == 1 || !Statics.field2927 && var69 == 4) {
                                                                int var72 = Statics.field1518;
                                                                int var73 = Statics.field1417;
                                                                int var74 = Statics.field1349;
                                                                int var75 = class129.field2002;
                                                                int var76 = class129.field2003;
                                                                int var77 = -1;
                                                                for (int var78 = 0; var78 < field360; var78++) {
                                                                    int var79 = (field360 - 1 - var78) * 15 + var73 + 31;
                                                                    if (var75 > var72 && var75 < var72 + var74 && var76 > var79 - 13 && var76 < var79 + 3) {
                                                                        var77 = var78;
                                                                    }
                                                                }
                                                                if (var77 != -1 && var77 >= 0) {
                                                                    int var80 = field320[var77];
                                                                    int var81 = field392[var77];
                                                                    int var82 = field393[var77];
                                                                    int var83 = field394[var77];
                                                                    String var84 = field395[var77];
                                                                    String var85 = field361[var77];
                                                                    method1830(var80, var81, var82, var83, var84, var85, class129.field2002, class129.field2003);
                                                                }
                                                                field388 = false;
                                                                method28(Statics.field1518, Statics.field1417, Statics.field1349, Statics.field389);
                                                            }
                                                        } else {
                                                            label1206: {
                                                                int var87;
                                                                int var88;
                                                                label1283: {
                                                                    if ((var69 == 1 || !Statics.field2927 && var69 == 4) && field360 > 0) {
                                                                        int var86 = field393[field360 - 1];
                                                                        if (var86 == 39 || var86 == 40 || var86 == 41 || var86 == 42 || var86 == 43 || var86 == 33 || var86 == 34 || var86 == 35 || var86 == 36 || var86 == 37 || var86 == 38 || var86 == 1005) {
                                                                            var87 = field320[field360 - 1];
                                                                            var88 = field392[field360 - 1];
                                                                            class155 var89 = class155.method2787(var88);
                                                                            if (class159.method2394(method1736(var89))) {
                                                                                break label1283;
                                                                            }
                                                                            int var90 = method1736(var89);
                                                                            boolean var91 = (var90 >> 29 & 0x1) != 0;
                                                                            if (var91) {
                                                                                break label1283;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var69 == 1 || !Statics.field2927 && var69 == 4) {
                                                                        label1276: {
                                                                            if (field387 != 1 || field360 <= 2) {
                                                                                int var98 = field360 - 1;
                                                                                boolean var99;
                                                                                if (var98 < 0) {
                                                                                    var99 = false;
                                                                                } else {
                                                                                    int var100 = field393[var98];
                                                                                    if (var100 >= 2000) {
                                                                                        var100 -= 2000;
                                                                                    }
                                                                                    if (var100 == 1007) {
                                                                                        var99 = true;
                                                                                    } else {
                                                                                        var99 = false;
                                                                                    }
                                                                                }
                                                                                if (!var99) {
                                                                                    break label1276;
                                                                                }
                                                                            }
                                                                            var69 = 2;
                                                                        }
                                                                    }
                                                                    if ((var69 == 1 || !Statics.field2927 && var69 == 4) && field360 > 0) {
                                                                        int var101 = field360 - 1;
                                                                        if (var101 >= 0) {
                                                                            int var102 = field320[var101];
                                                                            int var103 = field392[var101];
                                                                            int var104 = field393[var101];
                                                                            int var105 = field394[var101];
                                                                            String var106 = field395[var101];
                                                                            String var107 = field361[var101];
                                                                            method1830(var102, var103, var104, var105, var106, var107, class129.field2002, class129.field2003);
                                                                        }
                                                                    }
                                                                    if (var69 == 2 && field360 > 0) {
                                                                        method806(class129.field2002, class129.field2003);
                                                                    }
                                                                    break label1206;
                                                                }
                                                                if (Statics.field158 != null && !field362 && field387 != 1) {
                                                                    int var92 = field360 - 1;
                                                                    boolean var93;
                                                                    if (var92 < 0) {
                                                                        var93 = false;
                                                                    } else {
                                                                        int var94 = field393[var92];
                                                                        if (var94 >= 2000) {
                                                                            var94 -= 2000;
                                                                        }
                                                                        if (var94 == 1007) {
                                                                            var93 = true;
                                                                        } else {
                                                                            var93 = false;
                                                                        }
                                                                    }
                                                                    if (!var93 && field360 > 0) {
                                                                        int var95 = field359;
                                                                        int var96 = field374;
                                                                        class28 var97 = Statics.field503;
                                                                        method1830(var97.field632, var97.field631, var97.field633, var97.field636, var97.field635, var97.field635, var95, var96);
                                                                        Statics.field503 = null;
                                                                    }
                                                                }
                                                                field362 = false;
                                                                field363 = 0;
                                                                if (Statics.field158 != null) {
                                                                    method2761(Statics.field158);
                                                                }
                                                                Statics.field158 = class155.method2787(var88);
                                                                field350 = var87;
                                                                field359 = class129.field2002;
                                                                field374 = class129.field2003;
                                                                if (field360 > 0) {
                                                                    method2434(field360 - 1);
                                                                }
                                                                method2761(Statics.field158);
                                                            }
                                                        }
                                                    }
                                                    if (field401 != null) {
                                                        method2761(field401);
                                                        Statics.field799++;
                                                        if (field429 && field426) {
                                                            int var108 = class129.field1996;
                                                            int var109 = class129.field1997 * -918864945;
                                                            int var110 = var108 - field423;
                                                            int var111 = var109 - field424;
                                                            if (var110 < field427) {
                                                                var110 = field427;
                                                            }
                                                            if (field401.field2547 + var110 > field427 + field422.field2547) {
                                                                var110 = field427 + field422.field2547 - field401.field2547;
                                                            }
                                                            if (var111 < field428) {
                                                                var111 = field428;
                                                            }
                                                            if (field401.field2554 + var111 > field428 + field422.field2554) {
                                                                var111 = field428 + field422.field2554 - field401.field2554;
                                                            }
                                                            int var112 = var110 - field242;
                                                            int var113 = var111 - field476;
                                                            int var114 = field401.field2602;
                                                            if (Statics.field799 > field401.field2603 && (var112 > var114 || var112 < -var114 || var113 > var114 || var113 < -var114)) {
                                                                field278 = true;
                                                            }
                                                            int var115 = field422.field2620 + (var110 - field427);
                                                            int var116 = field422.field2552 + (var111 - field428);
                                                            if (field401.field2590 != null && field278) {
                                                                class1 var117 = new class1();
                                                                var117.field18 = field401;
                                                                var117.field4 = var115;
                                                                var117.field5 = var116;
                                                                var117.field15 = field401.field2590;
                                                                class33.method124(var117, 200000);
                                                            }
                                                            if (class129.field1995 == 0) {
                                                                if (field278) {
                                                                    if (field401.field2616 != null) {
                                                                        class1 var118 = new class1();
                                                                        var118.field18 = field401;
                                                                        var118.field4 = var115;
                                                                        var118.field5 = var116;
                                                                        var118.field7 = field310;
                                                                        var118.field15 = field401.field2616;
                                                                        class33.method124(var118, 200000);
                                                                    }
                                                                    if (field310 != null) {
                                                                        class155 var119 = field401;
                                                                        int var120 = class159.method2848(method1736(var119));
                                                                        class155 var121;
                                                                        if (var120 == 0) {
                                                                            var121 = null;
                                                                        } else {
                                                                            int var122 = 0;
                                                                            while (true) {
                                                                                if (var122 >= var120) {
                                                                                    var121 = var119;
                                                                                    break;
                                                                                }
                                                                                var119 = class155.method2787(var119.field2531);
                                                                                if (var119 == null) {
                                                                                    var121 = null;
                                                                                    break;
                                                                                }
                                                                                var122++;
                                                                            }
                                                                        }
                                                                        if (var121 != null) {
                                                                            field285.method2312(76);
                                                                            field285.method2113(field401.field2539);
                                                                            field285.method2125(field310.field2538);
                                                                            field285.method2113(field310.field2539);
                                                                            field285.method2114(field310.field2569);
                                                                            field285.method2125(field401.field2538);
                                                                            field285.method2113(field401.field2569);
                                                                        }
                                                                    }
                                                                } else {
                                                                    label1238: {
                                                                        label890: {
                                                                            if (field387 != 1) {
                                                                                int var123 = field360 - 1;
                                                                                boolean var124;
                                                                                if (var123 < 0) {
                                                                                    var124 = false;
                                                                                } else {
                                                                                    int var125 = field393[var123];
                                                                                    if (var125 >= 2000) {
                                                                                        var125 -= 2000;
                                                                                    }
                                                                                    if (var125 == 1007) {
                                                                                        var124 = true;
                                                                                    } else {
                                                                                        var124 = false;
                                                                                    }
                                                                                }
                                                                                if (!var124) {
                                                                                    break label890;
                                                                                }
                                                                            }
                                                                            if (field360 > 2) {
                                                                                method806(field423 + field242, field476 + field424);
                                                                                break label1238;
                                                                            }
                                                                        }
                                                                        if (field360 > 0) {
                                                                            int var126 = field423 + field242;
                                                                            int var127 = field476 + field424;
                                                                            class28 var128 = Statics.field503;
                                                                            method1830(var128.field632, var128.field631, var128.field633, var128.field636, var128.field635, var128.field635, var126, var127);
                                                                            Statics.field503 = null;
                                                                        }
                                                                    }
                                                                }
                                                                field401 = null;
                                                            }
                                                        } else if (Statics.field799 > 1) {
                                                            field401 = null;
                                                        }
                                                    }
                                                    if (Statics.field158 != null) {
                                                        method2761(Statics.field158);
                                                        field363++;
                                                        if (class129.field1995 == 0) {
                                                            if (!field362) {
                                                                label1242: {
                                                                    label864: {
                                                                        if (field387 != 1) {
                                                                            int var137 = field360 - 1;
                                                                            boolean var138;
                                                                            if (var137 < 0) {
                                                                                var138 = false;
                                                                            } else {
                                                                                int var139 = field393[var137];
                                                                                if (var139 >= 2000) {
                                                                                    var139 -= 2000;
                                                                                }
                                                                                if (var139 == 1007) {
                                                                                    var138 = true;
                                                                                } else {
                                                                                    var138 = false;
                                                                                }
                                                                            }
                                                                            if (!var138) {
                                                                                break label864;
                                                                            }
                                                                        }
                                                                        if (field360 > 2) {
                                                                            method806(field359, field374);
                                                                            break label1242;
                                                                        }
                                                                    }
                                                                    if (field360 > 0) {
                                                                        int var140 = field359;
                                                                        int var141 = field374;
                                                                        class28 var142 = Statics.field503;
                                                                        method1830(var142.field632, var142.field631, var142.field633, var142.field636, var142.field635, var142.field635, var140, var141);
                                                                        Statics.field503 = null;
                                                                    }
                                                                }
                                                            } else if (Statics.field52 == Statics.field158 && field485 != field350) {
                                                                class155 var129 = Statics.field158;
                                                                byte var130 = 0;
                                                                if (field391 == 1 && var129.field2640 == 206) {
                                                                    var130 = 1;
                                                                }
                                                                if (var129.field2643[field485] <= 0) {
                                                                    var130 = 0;
                                                                }
                                                                int var131 = method1736(var129);
                                                                boolean var132 = (var131 >> 29 & 0x1) != 0;
                                                                if (var132) {
                                                                    int var133 = field350;
                                                                    int var134 = field485;
                                                                    var129.field2643[var134] = var129.field2643[var133];
                                                                    var129.field2644[var134] = var129.field2644[var133];
                                                                    var129.field2643[var133] = -1;
                                                                    var129.field2644[var133] = 0;
                                                                } else if (var130 == 1) {
                                                                    int var135 = field350;
                                                                    int var136 = field485;
                                                                    while (var135 != var136) {
                                                                        if (var135 > var136) {
                                                                            var129.method2793(var135 - 1, var135);
                                                                            var135--;
                                                                        } else if (var135 < var136) {
                                                                            var129.method2793(var135 + 1, var135);
                                                                            var135++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var129.method2793(field485, field350);
                                                                }
                                                                field285.method2312(21);
                                                                field285.method2195(field485);
                                                                field285.method2123(Statics.field158.field2538);
                                                                field285.method2196(var130);
                                                                field285.method2115(field350);
                                                            }
                                                            field356 = 10;
                                                            class129.field1990 = 0;
                                                            Statics.field158 = null;
                                                        } else if (field363 >= 5 && (class129.field1996 > field359 + 5 || class129.field1996 < field359 - 5 || class129.field1997 * -918864945 > field374 + 5 || class129.field1997 * -918864945 < field374 - 5)) {
                                                            field362 = true;
                                                        }
                                                    }
                                                    if (class80.field1412 != -1) {
                                                        int var143 = class80.field1412;
                                                        int var144 = class80.field1391;
                                                        field285.method2312(84);
                                                        field285.method2069(5);
                                                        field285.method2115(Statics.field223 + var144);
                                                        field285.method2115(Statics.field86 + var143);
                                                        field285.method2088(class126.field1969[82] ? (class126.field1969[81] ? 2 : 1) : 0);
                                                        class80.field1412 = -1;
                                                        field354 = class129.field2002;
                                                        field333 = class129.field2003;
                                                        field355 = 1;
                                                        field477 = 0;
                                                        field480 = var143;
                                                        field481 = var144;
                                                    }
                                                    if (Statics.field986 != var49) {
                                                        if (var49 != null) {
                                                            method2761(var49);
                                                        }
                                                        if (Statics.field986 != null) {
                                                            method2761(Statics.field986);
                                                        }
                                                    }
                                                    if (Statics.field2022 != var50 && field492 == field277) {
                                                        if (var50 != null) {
                                                            method2761(var50);
                                                        }
                                                        if (Statics.field2022 != null) {
                                                            method2761(Statics.field2022);
                                                        }
                                                    }
                                                    if (Statics.field2022 == null) {
                                                        if (field492 > 0) {
                                                            field492--;
                                                        }
                                                    } else if (field492 < field277) {
                                                        field492++;
                                                        if (field492 == field277) {
                                                            method2761(Statics.field2022);
                                                        }
                                                    }
                                                    int var145 = field308 + Statics.field2031.field753;
                                                    int var146 = field488 + Statics.field2031.field736;
                                                    if (Statics.field110 - var145 < -500 || Statics.field110 - var145 > 500 || Statics.field1993 - var146 < -500 || Statics.field1993 - var146 > 500) {
                                                        Statics.field110 = var145;
                                                        Statics.field1993 = var146;
                                                    }
                                                    if (Statics.field110 != var145) {
                                                        Statics.field110 += (var145 - Statics.field110) / 16;
                                                    }
                                                    if (Statics.field1993 != var146) {
                                                        Statics.field1993 += (var146 - Statics.field1993) / 16;
                                                    }
                                                    if (class129.field1995 == 4 && Statics.field2927) {
                                                        int var147 = class129.field1997 * -918864945 - field280;
                                                        field332 = var147 * 2;
                                                        field280 = var147 == -1 || var147 == 1 ? class129.field1997 * -918864945 : (field280 + class129.field1997 * -918864945) / 2;
                                                        int var148 = field312 - class129.field1996;
                                                        field331 = var148 * 2;
                                                        field312 = var148 == -1 || var148 == 1 ? class129.field1996 : (field312 + class129.field1996) / 2;
                                                    } else {
                                                        if (class126.field1969[96]) {
                                                            field331 += (-24 - field331) / 2;
                                                        } else if (class126.field1969[97]) {
                                                            field331 += (24 - field331) / 2;
                                                        } else {
                                                            field331 /= 2;
                                                        }
                                                        if (class126.field1969[98]) {
                                                            field332 += (12 - field332) / 2;
                                                        } else if (class126.field1969[99]) {
                                                            field332 += (-12 - field332) / 2;
                                                        } else {
                                                            field332 /= 2;
                                                        }
                                                        field280 = class129.field1997 * -918864945;
                                                        field312 = class129.field1996;
                                                    }
                                                    field330 = field331 / 2 + field330 & 0x7FF;
                                                    field329 += field332 / 2;
                                                    if (field329 < 128) {
                                                        field329 = 128;
                                                    }
                                                    if (field329 > 383) {
                                                        field329 = 383;
                                                    }
                                                    int var149 = Statics.field110 >> 7;
                                                    int var150 = Statics.field1993 >> 7;
                                                    int var151 = method126(Statics.field110, Statics.field1993, Statics.field1121);
                                                    int var152 = 0;
                                                    if (var149 > 3 && var150 > 3 && var149 < 100 && var150 < 100) {
                                                        for (int var153 = var149 - 4; var153 <= var149 + 4; var153++) {
                                                            for (int var154 = var150 - 4; var154 <= var150 + 4; var154++) {
                                                                int var155 = Statics.field1121;
                                                                if (var155 < 3 && (class6.field83[1][var153][var154] & 0x2) == 2) {
                                                                    var155++;
                                                                }
                                                                int var156 = var151 - class6.field76[var155][var153][var154];
                                                                if (var156 > var152) {
                                                                    var152 = var156;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var157 = var152 * 192;
                                                    if (var157 > 98048) {
                                                        var157 = 98048;
                                                    }
                                                    if (var157 < 32768) {
                                                        var157 = 32768;
                                                    }
                                                    if (var157 > field337) {
                                                        field337 += (var157 - field337) / 24;
                                                    } else if (var157 < field337) {
                                                        field337 += (var157 - field337) / 80;
                                                    }
                                                    if (field494) {
                                                        method3334();
                                                    }
                                                    for (int var158 = 0; var158 < 5; var158++) {
                                                        var10002 = field302[var158]++;
                                                    }
                                                    int var159 = ++class129.field1991 - 1;
                                                    int var161 = class126.field1957;
                                                    if (var159 > 15000 && var161 > 15000) {
                                                        field292 = 250;
                                                        class129.method156(14500);
                                                        field285.method2312(6);
                                                    }
                                                    field314++;
                                                    if (field314 > 500) {
                                                        field314 = 0;
                                                        int var163 = (int) (Math.random() * 8.0D);
                                                        if ((var163 & 0x1) == 1) {
                                                            field308 += field309;
                                                        }
                                                        if ((var163 & 0x2) == 2) {
                                                            field488 += field490;
                                                        }
                                                        if ((var163 & 0x4) == 4) {
                                                            field400 += field313;
                                                        }
                                                    }
                                                    if (field308 < -50) {
                                                        field309 = 2;
                                                    }
                                                    if (field308 > 50) {
                                                        field309 = -2;
                                                    }
                                                    if (field488 < -55) {
                                                        field490 = 2;
                                                    }
                                                    if (field488 > 55) {
                                                        field490 = -2;
                                                    }
                                                    if (field400 < -40) {
                                                        field313 = 1;
                                                    }
                                                    if (field400 > 40) {
                                                        field313 = -1;
                                                    }
                                                    field319++;
                                                    if (field319 > 500) {
                                                        field319 = 0;
                                                        int var164 = (int) (Math.random() * 8.0D);
                                                        if ((var164 & 0x1) == 1) {
                                                            field315 += field316;
                                                        }
                                                        if ((var164 & 0x2) == 2) {
                                                            field378 += field318;
                                                        }
                                                    }
                                                    if (field315 < -60) {
                                                        field316 = 2;
                                                    }
                                                    if (field315 > 60) {
                                                        field316 = -2;
                                                    }
                                                    if (field378 < -20) {
                                                        field318 = 1;
                                                    }
                                                    if (field378 > 10) {
                                                        field318 = -1;
                                                    }
                                                    for (class35 var165 = (class35) field344.method3122(); var165 != null; var165 = (class35) field344.method3127()) {
                                                        if ((long) var165.field796 < class104.method528() / 1000L - 5L) {
                                                            if (var165.field797 > 0) {
                                                                class10.method995(5, "", var165.field801 + class145.field2295);
                                                            }
                                                            if (var165.field797 == 0) {
                                                                class10.method995(5, "", var165.field801 + class145.field2163);
                                                            }
                                                            var165.method3253();
                                                        }
                                                    }
                                                    field248++;
                                                    if (field248 > 50) {
                                                        field285.method2312(107);
                                                    }
                                                    try {
                                                        if (Statics.field550 != null && field285.field1824 > 0) {
                                                            Statics.field550.method2532(field285.field1828, 0, field285.field1824);
                                                            field285.field1824 = 0;
                                                            field248 = 0;
                                                        }
                                                    } catch (IOException var167) {
                                                        method21();
                                                    }
                                                    return;
                                                }
                                                var59 = var58.field18;
                                                if (var59.field2539 < 0) {
                                                    break;
                                                }
                                                var60 = class155.method2787(var59.field2531);
                                            } while (var60 == null || var60.field2649 == null || var59.field2539 >= var60.field2649.length || var60.field2649[var59.field2539] != var59);
                                            class33.method124(var58, 200000);
                                        }
                                    }
                                    var56 = var55.field18;
                                    if (var56.field2539 < 0) {
                                        break;
                                    }
                                    var57 = class155.method2787(var56.field2531);
                                } while (var57 == null || var57.field2649 == null || var56.field2539 >= var57.field2649.length || var57.field2649[var56.field2539] != var56);
                                class33.method124(var55, 200000);
                            }
                        }
                        var53 = var52.field18;
                        if (var53.field2539 < 0) {
                            break;
                        }
                        var54 = class155.method2787(var53.field2531);
                    } while (var54 == null || var54.field2649 == null || var53.field2539 >= var54.field2649.length || var54.field2649[var53.field2539] != var53);
                    class33.method124(var52, 200000);
                }
            }
            field285.method2312(191);
            field285.method2069(0);
            int var3 = field285.field1824;
            class192.method149(field285);
            field285.method2189(field285.field1824 - var3);
        }
    }

    @ObfuscatedName("ge.m(Lah;IIII)V")
    public static void method3346(class39 arg0, int arg1, int arg2, int arg3) {
        if (field397 >= 50 || field430 == 0 || arg0.field923 == null || arg1 >= arg0.field923.length) {
            return;
        }
        int var4 = arg0.field923[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field489[field397] = var5;
        field287[field397] = var6;
        field491[field397] = 0;
        field493[field397] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field306[field397] = (var8 << 16) + (var9 << 8) + var7;
        field397++;
    }

    @ObfuscatedName("ao.o(IIII)V")
    public static void method793(int arg0, int arg1, int arg2) {
        if (field486 == 0 || arg1 == 0 || field397 >= 50) {
            return;
        }
        field489[field397] = arg0;
        field287[field397] = arg1;
        field491[field397] = arg2;
        field493[field397] = null;
        field306[field397] = 0;
        field397++;
    }

    @ObfuscatedName("bo.a(II)V")
    public static void method1288(int arg0) {
        if (arg0 == -1 && !field352) {
            Statics.field2721.method3058();
            class164.field2722 = 1;
            Statics.field2723 = null;
        } else if (arg0 != -1 && field484 != arg0 && field483 != 0 && !field352) {
            class164.method123(2, Statics.field1860, arg0, 0, field483, false);
        }
        field484 = arg0;
    }

    @ObfuscatedName("an.am(I)V")
    public static final void method603() {
        if (field247 && Statics.field1121 != field447) {
            Statics.method2012(Statics.field600, Statics.field714, Statics.field1121, Statics.field2031.field747[0], Statics.field2031.field790[0]);
        } else if (Statics.field1121 != field472) {
            field472 = Statics.field1121;
            method2655(Statics.field1121);
        }
    }

    @ObfuscatedName("l.ac(Ljava/lang/String;I)V")
    public static final void method87(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field217.field128 = !Statics.field217.field128;
            class9.method2526();
            if (Statics.field217.field128) {
                class10.method995(99, "", "Roofs are now all hidden");
            } else {
                class10.method995(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field416 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field300 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field300 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method21();
            }
            if (arg0.equalsIgnoreCase("errortest") && field438 == 2) {
                throw new RuntimeException();
            }
        }
        field285.method2312(89);
        field285.method2069(arg0.length() + 1);
        field285.method2074(arg0);
    }

    @ObfuscatedName("ge.ap(B)V")
    public static final void method3334() {
        int var0 = Statics.field2084 * 128 + 64;
        int var1 = Statics.field626 * 128 + 64;
        int var2 = method126(var0, var1, Statics.field1121) - Statics.field1985;
        if (Statics.field12 < var0) {
            Statics.field12 += Statics.field1748 * (var0 - Statics.field12) / 1000 + Statics.field802;
            if (Statics.field12 > var0) {
                Statics.field12 = var0;
            }
        }
        if (Statics.field12 > var0) {
            Statics.field12 -= Statics.field1748 * (Statics.field12 - var0) / 1000 + Statics.field802;
            if (Statics.field12 < var0) {
                Statics.field12 = var0;
            }
        }
        if (Statics.field166 < var2) {
            Statics.field166 += Statics.field1748 * (var2 - Statics.field166) / 1000 + Statics.field802;
            if (Statics.field166 > var2) {
                Statics.field166 = var2;
            }
        }
        if (Statics.field166 > var2) {
            Statics.field166 -= Statics.field1748 * (Statics.field166 - var2) / 1000 + Statics.field802;
            if (Statics.field166 < var2) {
                Statics.field166 = var2;
            }
        }
        if (Statics.field180 < var1) {
            Statics.field180 += Statics.field1748 * (var1 - Statics.field180) / 1000 + Statics.field802;
            if (Statics.field180 > var1) {
                Statics.field180 = var1;
            }
        }
        if (Statics.field180 > var1) {
            Statics.field180 -= Statics.field1748 * (Statics.field180 - var1) / 1000 + Statics.field802;
            if (Statics.field180 < var1) {
                Statics.field180 = var1;
            }
        }
        int var3 = Statics.field957 * 128 + 64;
        int var4 = Statics.field800 * 128 + 64;
        int var5 = method126(var3, var4, Statics.field1121) - Statics.field1788;
        int var6 = var3 - Statics.field12;
        int var7 = var5 - Statics.field166;
        int var8 = var4 - Statics.field180;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1002 < var10) {
            Statics.field1002 += Statics.field2451 * (var10 - Statics.field1002) / 1000 + Statics.field1925;
            if (Statics.field1002 > var10) {
                Statics.field1002 = var10;
            }
        }
        if (Statics.field1002 > var10) {
            Statics.field1002 -= Statics.field2451 * (Statics.field1002 - var10) / 1000 + Statics.field1925;
            if (Statics.field1002 < var10) {
                Statics.field1002 = var10;
            }
        }
        int var12 = var11 - Statics.field446;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field446 += Statics.field2451 * var12 / 1000 + Statics.field1925;
            Statics.field446 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field446 -= Statics.field2451 * -var12 / 1000 + Statics.field1925;
            Statics.field446 &= 0x7FF;
        }
        int var13 = var11 - Statics.field446;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field446 = var11;
        }
    }

    @ObfuscatedName("cr.aq(I)V")
    public static final void method2008() {
        for (int var0 = 0; var0 < field283; var0++) {
            int var1 = field284[var0];
            class31 var2 = field261[var1];
            if (var2 != null) {
                method491(var2, var2.field702.field809);
            }
        }
    }

    @ObfuscatedName("e.az(Las;IB)V")
    public static final void method491(class34 arg0, int arg1) {
        if (arg0.field780 > field410) {
            int var2 = arg0.field780 - field410;
            int var3 = arg0.field776 * 128 + arg0.field741 * 64;
            int var4 = arg0.field778 * 128 + arg0.field741 * 64;
            arg0.field753 += (var3 - arg0.field753) / var2;
            arg0.field736 += (var4 - arg0.field736) / var2;
            arg0.field792 = 0;
            if (arg0.field782 == 0) {
                arg0.field737 = 1024;
            }
            if (arg0.field782 == 1) {
                arg0.field737 = 1536;
            }
            if (arg0.field782 == 2) {
                arg0.field737 = 0;
            }
            if (arg0.field782 == 3) {
                arg0.field737 = 512;
            }
        } else if (arg0.field781 >= field410) {
            method85(arg0);
        } else {
            method506(arg0);
        }
        if (arg0.field753 < 128 || arg0.field736 < 128 || arg0.field753 >= 13184 || arg0.field736 >= 13184) {
            arg0.field766 = -1;
            arg0.field771 = -1;
            arg0.field780 = 0;
            arg0.field781 = 0;
            arg0.field753 = arg0.field747[0] * 128 + arg0.field741 * 64;
            arg0.field736 = arg0.field790[0] * 128 + arg0.field741 * 64;
            arg0.method564();
        }
        if (Statics.field2031 == arg0 && (arg0.field753 < 1536 || arg0.field736 < 1536 || arg0.field753 >= 11776 || arg0.field736 >= 11776)) {
            arg0.field766 = -1;
            arg0.field771 = -1;
            arg0.field780 = 0;
            arg0.field781 = 0;
            arg0.field753 = arg0.field747[0] * 128 + arg0.field741 * 64;
            arg0.field736 = arg0.field790[0] * 128 + arg0.field741 * 64;
            arg0.method564();
        }
        method1741(arg0);
        method2487(arg0);
    }

    @ObfuscatedName("w.ae(Las;I)V")
    public static final void method85(class34 arg0) {
        if (field410 == arg0.field781 || arg0.field766 == -1 || arg0.field769 != 0 || arg0.field777 + 1 > class39.method2627(arg0.field766).field918[arg0.field767]) {
            int var1 = arg0.field781 - arg0.field780;
            int var2 = field410 - arg0.field780;
            int var3 = arg0.field776 * 128 + arg0.field741 * 64;
            int var4 = arg0.field778 * 128 + arg0.field741 * 64;
            int var5 = arg0.field744 * 128 + arg0.field741 * 64;
            int var6 = arg0.field743 * 128 + arg0.field741 * 64;
            arg0.field753 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field736 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field792 = 0;
        if (arg0.field782 == 0) {
            arg0.field737 = 1024;
        }
        if (arg0.field782 == 1) {
            arg0.field737 = 1536;
        }
        if (arg0.field782 == 2) {
            arg0.field737 = 0;
        }
        if (arg0.field782 == 3) {
            arg0.field737 = 512;
        }
        arg0.field785 = arg0.field737;
    }

    @ObfuscatedName("o.at(Las;B)V")
    public static final void method506(class34 arg0) {
        arg0.field775 = arg0.field740;
        if (arg0.field761 == 0) {
            arg0.field792 = 0;
            return;
        }
        if (arg0.field766 != -1 && arg0.field769 == 0) {
            class39 var1 = class39.method2627(arg0.field766);
            if (arg0.field735 > 0 && var1.field931 == 0) {
                arg0.field792++;
                return;
            }
            if (arg0.field735 <= 0 && var1.field929 == 0) {
                arg0.field792++;
                return;
            }
        }
        int var2 = arg0.field753;
        int var3 = arg0.field736;
        int var4 = arg0.field747[arg0.field761 - 1] * 128 + arg0.field741 * 64;
        int var5 = arg0.field790[arg0.field761 - 1] * 128 + arg0.field741 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field753 = var4;
            arg0.field736 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field737 = 1280;
            } else if (var3 > var5) {
                arg0.field737 = 1792;
            } else {
                arg0.field737 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field737 = 768;
            } else if (var3 > var5) {
                arg0.field737 = 256;
            } else {
                arg0.field737 = 512;
            }
        } else if (var3 < var5) {
            arg0.field737 = 1024;
        } else if (var3 > var5) {
            arg0.field737 = 0;
        }
        int var6 = arg0.field737 - arg0.field785 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field764;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field774;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field746;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field768;
        }
        if (var7 == -1) {
            var7 = arg0.field774;
        }
        arg0.field775 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class31) {
            var9 = ((class31) arg0).field702.field834;
        }
        if (var9) {
            if (arg0.field785 != arg0.field737 && arg0.field793 == -1 && arg0.field787 != 0) {
                var8 = 2;
            }
            if (arg0.field761 > 2) {
                var8 = 6;
            }
            if (arg0.field761 > 3) {
                var8 = 8;
            }
            if (arg0.field792 > 0 && arg0.field761 > 1) {
                var8 = 8;
                arg0.field792--;
            }
        } else {
            if (arg0.field761 > 1) {
                var8 = 6;
            }
            if (arg0.field761 > 2) {
                var8 = 8;
            }
            if (arg0.field792 > 0 && arg0.field761 > 1) {
                var8 = 8;
                arg0.field792--;
            }
        }
        if (arg0.field791[arg0.field761 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field775 == arg0.field774 && arg0.field738 != -1) {
            arg0.field775 = arg0.field738;
        }
        if (var2 < var4) {
            arg0.field753 += var8;
            if (arg0.field753 > var4) {
                arg0.field753 = var4;
            }
        } else if (var2 > var4) {
            arg0.field753 -= var8;
            if (arg0.field753 < var4) {
                arg0.field753 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field736 += var8;
            if (arg0.field736 > var5) {
                arg0.field736 = var5;
            }
        } else if (var3 > var5) {
            arg0.field736 -= var8;
            if (arg0.field736 < var5) {
                arg0.field736 = var5;
            }
        }
        if (arg0.field753 == var4 && arg0.field736 == var5) {
            arg0.field761--;
            if (arg0.field735 > 0) {
                arg0.field735--;
            }
        }
    }

    @ObfuscatedName("cw.as(Las;I)V")
    public static final void method1741(class34 arg0) {
        if (arg0.field787 == 0) {
            return;
        }
        if (arg0.field793 != -1 && arg0.field793 < 32768) {
            class31 var1 = field261[arg0.field793];
            if (var1 != null) {
                int var2 = arg0.field753 - var1.field753;
                int var3 = arg0.field736 - var1.field736;
                if (var2 != 0 || var3 != 0) {
                    arg0.field737 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field793 >= 32768) {
            int var4 = arg0.field793 - 32768;
            if (field371 == var4) {
                var4 = 2047;
            }
            class3 var5 = field365[var4];
            if (var5 != null) {
                int var6 = arg0.field753 - var5.field753;
                int var7 = arg0.field736 - var5.field736;
                if (var6 != 0 || var7 != 0) {
                    arg0.field737 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field789 != 0 || arg0.field762 != 0) && (arg0.field761 == 0 || arg0.field792 > 0)) {
            int var8 = arg0.field753 - (arg0.field789 * 64 - Statics.field86 * 64 - Statics.field86 * 64);
            int var9 = arg0.field736 - (arg0.field762 * 64 - Statics.field223 * 64 - Statics.field223 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field737 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field789 = 0;
            arg0.field762 = 0;
        }
        int var10 = arg0.field737 - arg0.field785 & 0x7FF;
        if (var10 == 0) {
            arg0.field786 = 0;
            return;
        }
        arg0.field786++;
        if (var10 > 1024) {
            arg0.field785 -= arg0.field787;
            boolean var11 = true;
            if (var10 < arg0.field787 || var10 > 2048 - arg0.field787) {
                arg0.field785 = arg0.field737;
                var11 = false;
            }
            if (arg0.field775 == arg0.field740 && (arg0.field786 > 25 || var11)) {
                if (arg0.field760 == -1) {
                    arg0.field775 = arg0.field774;
                } else {
                    arg0.field775 = arg0.field760;
                }
            }
        } else {
            arg0.field785 += arg0.field787;
            boolean var12 = true;
            if (var10 < arg0.field787 || var10 > 2048 - arg0.field787) {
                arg0.field785 = arg0.field737;
                var12 = false;
            }
            if (arg0.field775 == arg0.field740 && (arg0.field786 > 25 || var12)) {
                if (arg0.field742 == -1) {
                    arg0.field775 = arg0.field774;
                } else {
                    arg0.field775 = arg0.field742;
                }
            }
        }
        arg0.field785 &= 0x7FF;
    }

    @ObfuscatedName("dr.aj(Las;S)V")
    public static final void method2487(class34 arg0) {
        arg0.field770 = false;
        if (arg0.field775 != -1) {
            class39 var1 = class39.method2627(arg0.field775);
            if (var1 == null || var1.field920 == null) {
                arg0.field775 = -1;
            } else {
                arg0.field765++;
                if (arg0.field763 < var1.field920.length && arg0.field765 > var1.field918[arg0.field763]) {
                    arg0.field765 = 1;
                    arg0.field763++;
                    method3346(var1, arg0.field763, arg0.field753, arg0.field736);
                }
                if (arg0.field763 >= var1.field920.length) {
                    arg0.field765 = 0;
                    arg0.field763 = 0;
                    method3346(var1, arg0.field763, arg0.field753, arg0.field736);
                }
            }
        }
        if (arg0.field771 != -1 && field410 >= arg0.field779) {
            if (arg0.field772 < 0) {
                arg0.field772 = 0;
            }
            int var2 = class40.method2523(arg0.field771).field953;
            if (var2 == -1) {
                arg0.field771 = -1;
            } else {
                class39 var3 = class39.method2627(var2);
                if (var3 == null || var3.field920 == null) {
                    arg0.field771 = -1;
                } else {
                    arg0.field773++;
                    if (arg0.field772 < var3.field920.length && arg0.field773 > var3.field918[arg0.field772]) {
                        arg0.field773 = 1;
                        arg0.field772++;
                        method3346(var3, arg0.field772, arg0.field753, arg0.field736);
                    }
                    if (arg0.field772 >= var3.field920.length && (arg0.field772 < 0 || arg0.field772 >= var3.field920.length)) {
                        arg0.field771 = -1;
                    }
                }
            }
        }
        if (arg0.field766 != -1 && arg0.field769 <= 1) {
            class39 var4 = class39.method2627(arg0.field766);
            if (var4.field931 == 1 && arg0.field735 > 0 && arg0.field780 <= field410 && arg0.field781 < field410) {
                arg0.field769 = 1;
                return;
            }
        }
        if (arg0.field766 != -1 && arg0.field769 == 0) {
            class39 var5 = class39.method2627(arg0.field766);
            if (var5 == null || var5.field920 == null) {
                arg0.field766 = -1;
            } else {
                arg0.field777++;
                if (arg0.field767 < var5.field920.length && arg0.field777 > var5.field918[arg0.field767]) {
                    arg0.field777 = 1;
                    arg0.field767++;
                    method3346(var5, arg0.field767, arg0.field753, arg0.field736);
                }
                if (arg0.field767 >= var5.field920.length) {
                    arg0.field767 -= var5.field924;
                    arg0.field745++;
                    if (arg0.field745 >= var5.field930) {
                        arg0.field766 = -1;
                    } else if (arg0.field767 >= 0 && arg0.field767 < var5.field920.length) {
                        method3346(var5, arg0.field767, arg0.field753, arg0.field736);
                    } else {
                        arg0.field766 = -1;
                    }
                }
                arg0.field770 = var5.field932;
            }
        }
        if (arg0.field769 > 0) {
            arg0.field769--;
        }
    }

    @ObfuscatedName("dx.an(Lz;III)V")
    public static void method2429(class3 arg0, int arg1, int arg2) {
        if (arg0.field766 == arg1 && arg1 != -1) {
            int var3 = class39.method2627(arg1).field933;
            if (var3 == 1) {
                arg0.field767 = 0;
                arg0.field777 = 0;
                arg0.field769 = arg2;
                arg0.field745 = 0;
            }
            if (var3 == 2) {
                arg0.field745 = 0;
            }
        } else if (arg1 == -1 || arg0.field766 == -1 || class39.method2627(arg1).field927 >= class39.method2627(arg0.field766).field927) {
            arg0.field766 = arg1;
            arg0.field767 = 0;
            arg0.field777 = 0;
            arg0.field769 = arg2;
            arg0.field745 = 0;
            arg0.field735 = arg0.field761;
        }
    }

    @ObfuscatedName("en.al(Ljava/lang/String;ZB)V")
    public static final void method2535(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1003.method3358(arg0, 250);
        int var6 = Statics.field1003.method3359(arg0, 250) * 13;
        class74.method1466(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1510(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1003.method3372(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method28(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method119(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field683.getGraphics();
            Statics.field1449.method1300(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field683.repaint();
        }
    }

    @ObfuscatedName("ct.ag(IIIII)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3) {
        class74.method1460(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1748();
        field499++;
        method1844(class30.field697);
        boolean var4 = false;
        if (field379 >= 0) {
            for (int var5 = 0; var5 < field255; var5++) {
                if (field379 == field367[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1844(class30.field687);
        }
        method1925(true);
        method1844(var4 ? class30.field689 : class30.field686);
        method1925(false);
        for (class7 var6 = (class7) field382.method3174(); var6 != null; var6 = (class7) field382.method3176()) {
            if (Statics.field1121 != var6.field93 || field410 > var6.field101) {
                var6.method3259();
            } else if (field410 >= var6.field92) {
                if (var6.field95 > 0) {
                    class31 var7 = field261[var6.field95 - 1];
                    if (var7 != null && var7.field753 >= 0 && var7.field753 < 13312 && var7.field736 >= 0 && var7.field736 < 13312) {
                        var6.method75(var7.field753, var7.field736, method126(var7.field753, var7.field736, var6.field93) - var6.field118, field410);
                    }
                }
                if (var6.field95 < 0) {
                    int var8 = -var6.field95 - 1;
                    class3 var9;
                    if (field371 == var8) {
                        var9 = Statics.field2031;
                    } else {
                        var9 = field365[var8];
                    }
                    if (var9 != null && var9.field753 >= 0 && var9.field753 < 13312 && var9.field736 >= 0 && var9.field736 < 13312) {
                        var6.method75(var9.field753, var9.field736, method126(var9.field753, var9.field736, var6.field93) - var6.field118, field410);
                    }
                }
                var6.method79(field240);
                Statics.field303.method1596(Statics.field1121, (int) var6.field90, (int) var6.field98, (int) var6.field99, 60, var6, var6.field105, -1, false);
            }
        }
        for (class27 var10 = (class27) field383.method3174(); var10 != null; var10 = (class27) field383.method3176()) {
            if (Statics.field1121 != var10.field628 || var10.field625) {
                var10.method3259();
            } else if (field410 >= var10.field617) {
                var10.method513(field240);
                if (var10.field625) {
                    var10.method3259();
                } else {
                    Statics.field303.method1596(var10.field628, var10.field619, var10.field618, var10.field621, 60, var10, 0, -1, false);
                }
            }
        }
        if (!field494) {
            int var11 = field329;
            if (field337 / 256 > var11) {
                var11 = field337 / 256;
            }
            if (field495[4] && field497[4] + 128 > var11) {
                var11 = field497[4] + 128;
            }
            int var12 = field400 + field330 & 0x7FF;
            method1831(Statics.field110, method126(Statics.field2031.field753, Statics.field2031.field736, Statics.field1121) - 50, Statics.field1993, var11, var12, var11 * 3 + 600);
        }
        int var13;
        if (field494) {
            int var14;
            if (Statics.field217.field128) {
                var14 = Statics.field1121;
            } else {
                int var15 = method126(Statics.field12, Statics.field180, Statics.field1121);
                if (var15 - Statics.field166 >= 800 || (class6.field83[Statics.field1121][Statics.field12 >> 7][Statics.field180 >> 7] & 0x4) == 0) {
                    var14 = 3;
                } else {
                    var14 = Statics.field1121;
                }
            }
            var13 = var14;
        } else {
            var13 = method2346();
        }
        int var16 = Statics.field12;
        int var17 = Statics.field166;
        int var18 = Statics.field180;
        int var19 = Statics.field1002;
        int var20 = Statics.field446;
        for (int var21 = 0; var21 < 5; var21++) {
            if (field495[var21]) {
                int var22 = (int) (Math.random() * (double) (field496[var21] * 2 + 1) - (double) field496[var21] + Math.sin((double) field431[var21] / 100.0D * (double) field302[var21]) * (double) field497[var21]);
                if (var21 == 0) {
                    Statics.field12 += var22;
                }
                if (var21 == 1) {
                    Statics.field166 += var22;
                }
                if (var21 == 2) {
                    Statics.field180 += var22;
                }
                if (var21 == 3) {
                    Statics.field446 = Statics.field446 + var22 & 0x7FF;
                }
                if (var21 == 4) {
                    Statics.field1002 += var22;
                    if (Statics.field1002 < 128) {
                        Statics.field1002 = 128;
                    }
                    if (Statics.field1002 > 383) {
                        Statics.field1002 = 383;
                    }
                }
            }
        }
        int var23 = class129.field1996;
        int var24 = class129.field1997 * -918864945;
        if (class129.field1990 != 0) {
            var23 = class129.field2002;
            var24 = class129.field2003;
        }
        if (var23 >= arg0 && var23 < arg0 + arg2 && var24 >= arg1 && var24 < arg1 + arg3) {
            class99.field1741 = true;
            class99.field1728 = 0;
            class99.field1682 = var23 - arg0;
            class99.field1735 = var24 - arg1;
        } else {
            class99.field1741 = false;
            class99.field1728 = 0;
        }
        Statics.method1737();
        class74.method1466(arg0, arg1, arg2, arg3, 0);
        Statics.method1737();
        Statics.field303.method1598(Statics.field12, Statics.field166, Statics.field180, Statics.field1002, Statics.field446, var13);
        Statics.method1737();
        Statics.field303.method1693();
        field338 = 0;
        boolean var25 = false;
        int var26 = -1;
        for (int var27 = -1; var27 < field283 + field255; var27++) {
            class34 var28;
            if (var27 == -1) {
                var28 = Statics.field2031;
            } else if (var27 < field255) {
                var28 = field365[field367[var27]];
                if (field379 == field367[var27]) {
                    var25 = true;
                    var26 = var27;
                    continue;
                }
            } else {
                var28 = field261[field284[var27 - field255]];
            }
            method1746(var28, var27, arg0, arg1, arg2, arg3);
        }
        if (var25) {
            method1746(field365[field379], var26, arg0, arg1, arg2, arg3);
        }
        for (int var29 = 0; var29 < field338; var29++) {
            int var30 = field340[var29];
            int var31 = field341[var29];
            int var32 = field459[var29];
            int var33 = field342[var29];
            boolean var34 = true;
            while (var34) {
                var34 = false;
                for (int var35 = 0; var35 < var29; var35++) {
                    if (var31 + 2 > field341[var35] - field342[var35] && var31 - var33 < field341[var35] + 2 && var30 - var32 < field459[var35] + field340[var35] && var30 + var32 > field340[var35] - field459[var35] && field341[var35] - field342[var35] < var31) {
                        var31 = field341[var35] - field342[var35];
                        var34 = true;
                    }
                }
            }
            field396 = field340[var29];
            field351 = field341[var29] = var31;
            String var36 = field498[var29];
            if (field411 == 0) {
                int var37 = 16776960;
                if (field443[var29] < 6) {
                    var37 = field463[field443[var29]];
                }
                if (field443[var29] == 6) {
                    var37 = field499 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field443[var29] == 7) {
                    var37 = field499 % 20 < 10 ? 255 : 65535;
                }
                if (field443[var29] == 8) {
                    var37 = field499 % 20 < 10 ? 45056 : 8454016;
                }
                if (field443[var29] == 9) {
                    int var38 = 150 - field346[var29];
                    if (var38 < 50) {
                        var37 = var38 * 1280 + 16711680;
                    } else if (var38 < 100) {
                        var37 = 16776960 - (var38 - 50) * 327680;
                    } else if (var38 < 150) {
                        var37 = (var38 - 100) * 5 + 65280;
                    }
                }
                if (field443[var29] == 10) {
                    int var39 = 150 - field346[var29];
                    if (var39 < 50) {
                        var37 = var39 * 5 + 16711680;
                    } else if (var39 < 100) {
                        var37 = 16711935 - (var39 - 50) * 327680;
                    } else if (var39 < 150) {
                        var37 = (var39 - 100) * 327680 + 255 - (var39 - 100) * 5;
                    }
                }
                if (field443[var29] == 11) {
                    int var40 = 150 - field346[var29];
                    if (var40 < 50) {
                        var37 = 16777215 - var40 * 327685;
                    } else if (var40 < 100) {
                        var37 = (var40 - 50) * 327685 + 65280;
                    } else if (var40 < 150) {
                        var37 = 16777215 - (var40 - 100) * 327680;
                    }
                }
                if (field345[var29] == 0) {
                    Statics.field3.method3363(var36, field396 + arg0, field351 + arg1, var37, 0);
                }
                if (field345[var29] == 1) {
                    Statics.field3.method3365(var36, field396 + arg0, field351 + arg1, var37, 0, field499);
                }
                if (field345[var29] == 2) {
                    Statics.field3.method3393(var36, field396 + arg0, field351 + arg1, var37, 0, field499);
                }
                if (field345[var29] == 3) {
                    Statics.field3.method3367(var36, field396 + arg0, field351 + arg1, var37, 0, field499, 150 - field346[var29]);
                }
                if (field345[var29] == 4) {
                    int var41 = (150 - field346[var29]) * (Statics.field3.method3371(var36) + 100) / 150;
                    class74.method1484(field396 + arg0 - 50, arg1, field396 + arg0 + 50, arg1 + arg3);
                    Statics.field3.method3361(var36, field396 + arg0 + 50 - var41, field351 + arg1, var37, 0);
                    class74.method1460(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field345[var29] == 5) {
                    int var42 = 150 - field346[var29];
                    int var43 = 0;
                    if (var42 < 25) {
                        var43 = var42 - 25;
                    } else if (var42 > 125) {
                        var43 = var42 - 125;
                    }
                    class74.method1484(arg0, field351 + arg1 - Statics.field3.field2960 - 1, arg0 + arg2, field351 + arg1 + 5);
                    Statics.field3.method3363(var36, field396 + arg0, field351 + arg1 + var43, var37, 0);
                    class74.method1460(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3.method3363(var36, field396 + arg0, field351 + arg1, 16776960, 0);
            }
        }
        if (field296 == 2) {
            method668((field264 - Statics.field86 << 7) + field267, (field265 - Statics.field223 << 7) + field317, field266 * 2);
            if (field396 > -1 && field410 % 20 < 10) {
                Statics.field1453[0].method1364(field396 + arg0 - 12, field351 + arg1 - 28);
            }
        }
        ((class89) Statics.field1473).method1833(field240);
        method140(arg0, arg1, arg2, arg3);
        Statics.field12 = var16;
        Statics.field166 = var17;
        Statics.field180 = var18;
        Statics.field1002 = var19;
        Statics.field446 = var20;
        if (field251 && class153.method2426(true, false) == 0) {
            field251 = false;
        }
        if (field251) {
            class74.method1466(arg0, arg1, arg2, arg3, 0);
            method2535(class145.field2157, false);
        }
    }

    @ObfuscatedName("cz.ah(Laq;B)V")
    public static final void method1844(class30 arg0) {
        if (Statics.field2031.field753 >> 7 == field480 && Statics.field2031.field736 >> 7 == field481) {
            field480 = 0;
        }
        int var1 = field255;
        if (class30.field697 == arg0 || class30.field687 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field697 == arg0) {
                var3 = Statics.field2031;
                var4 = 33538048;
            } else if (class30.field687 == arg0) {
                var3 = field365[field379];
                var4 = field379 << 14;
            } else {
                var3 = field365[field367[var2]];
                var4 = field367[var2] << 14;
                if (class30.field689 == arg0 && field379 == field367[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method14() && !var3.field51) {
                var3.field49 = false;
                if ((field247 && field255 > 50 || field255 > 200) && class30.field697 != arg0 && var3.field775 == var3.field740) {
                    var3.field49 = true;
                }
                int var5 = var3.field753 >> 7;
                int var6 = var3.field736 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field410 < var3.field34 || field410 >= var3.field35) {
                        if ((var3.field753 & 0x7F) == 64 && (var3.field736 & 0x7F) == 64) {
                            if (field499 == field399[var5][var6]) {
                                continue;
                            }
                            field399[var5][var6] = field499;
                        }
                        var3.field38 = method126(var3.field753, var3.field736, Statics.field1121);
                        Statics.field303.method1596(Statics.field1121, var3.field753, var3.field736, var3.field38, 60, var3, var3.field785, var4, var3.field770);
                    } else {
                        var3.field49 = false;
                        var3.field38 = method126(var3.field753, var3.field736, Statics.field1121);
                        Statics.field303.method1572(Statics.field1121, var3.field753, var3.field736, var3.field38, 60, var3, var3.field785, var4, var3.field40, var3.field46, var3.field47, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.ar(ZI)V")
    public static final void method1925(boolean arg0) {
        for (int var1 = 0; var1 < field283; var1++) {
            class31 var2 = field261[field284[var1]];
            int var3 = (field284[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field702.field847 == arg0 && var2.field702.method583()) {
                int var4 = var2.field753 >> 7;
                int var5 = var2.field736 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field741 == 1 && (var2.field753 & 0x7F) == 64 && (var2.field736 & 0x7F) == 64) {
                        if (field499 == field399[var4][var5]) {
                            continue;
                        }
                        field399[var4][var5] = field499;
                    }
                    if (!var2.field702.field836) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field303.method1596(Statics.field1121, var2.field753, var2.field736, method126(var2.field753 + (var2.field741 * 64 - 64), var2.field736 + (var2.field741 * 64 - 64), Statics.field1121), var2.field741 * 64 - 64 + 60, var2, var2.field785, var3, var2.field770);
                }
            }
        }
    }

    @ObfuscatedName("da.aa(I)I")
    public static final int method2346() {
        if (Statics.field217.field128) {
            return Statics.field1121;
        }
        int var0 = 3;
        if (Statics.field1002 < 310) {
            int var1 = Statics.field12 >> 7;
            int var2 = Statics.field180 >> 7;
            int var3 = Statics.field2031.field753 >> 7;
            int var4 = Statics.field2031.field736 >> 7;
            if ((class6.field83[Statics.field1121][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1121;
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
                    if ((class6.field83[Statics.field1121][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1121;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field83[Statics.field1121][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1121;
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
                    if ((class6.field83[Statics.field1121][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1121;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field83[Statics.field1121][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1121;
                        }
                    }
                }
            }
        }
        if ((class6.field83[Statics.field1121][Statics.field2031.field753 >> 7][Statics.field2031.field736 >> 7] & 0x4) != 0) {
            var0 = Statics.field1121;
        }
        return var0;
    }

    @ObfuscatedName("ce.ax(Las;IIIIII)V")
    public static final void method1746(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method14()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field702;
            if (var6.field803 != null) {
                var6 = var6.method576();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field255) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field51) {
                return;
            }
            if (var8.field43 != -1 || var8.field36 != -1) {
                method128(arg0, arg0.field784 + 15);
                if (field396 > -1) {
                    if (var8.field43 != -1) {
                        Statics.field667[var8.field43].method1364(field396 + arg2 - 12, field351 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field36 != -1) {
                        Statics.field913[var8.field36].method1364(field396 + arg2 - 12, field351 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field296 == 10 && field358 == field367[arg1]) {
                method128(arg0, arg0.field784 + 15);
                if (field396 > -1) {
                    Statics.field1453[1].method1364(field396 + arg2 - 12, field351 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field702;
            if (var9.field803 != null) {
                var9 = var9.method576();
            }
            if (var9.field831 >= 0 && var9.field831 < Statics.field913.length) {
                method128(arg0, arg0.field784 + 15);
                if (field396 > -1) {
                    Statics.field913[var9.field831].method1364(field396 + arg2 - 12, field351 + arg3 - 30);
                }
            }
            if (field296 == 1 && field262 == field284[arg1 - field255] && field410 % 20 < 10) {
                method128(arg0, arg0.field784 + 15);
                if (field396 > -1) {
                    Statics.field1453[0].method1364(field396 + arg2 - 12, field351 + arg3 - 28);
                }
            }
        }
        if (arg0.field748 != null && (arg1 >= field255 || !arg0.field750 && (field464 == 4 || !arg0.field749 && (field464 == 0 || field464 == 3 || field464 == 1 && method33(((class3) arg0).field39, false))))) {
            method128(arg0, arg0.field784);
            if (field396 > -1 && field338 < field339) {
                field459[field338] = Statics.field3.method3371(arg0.field748) / 2;
                field342[field338] = Statics.field3.field2960;
                field340[field338] = field396;
                field341[field338] = field351;
                field443[field338] = arg0.field752;
                field345[field338] = arg0.field788;
                field346[field338] = arg0.field751;
                field498[field338] = arg0.field748;
                field338++;
            }
        }
        if (arg0.field757 > field410) {
            method128(arg0, arg0.field784 + 15);
            if (field396 > -1) {
                int var10;
                if (arg1 < field255) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field702;
                    var10 = var11.field839;
                }
                int var12 = arg0.field758 * var10 / arg0.field759;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field758 > 0) {
                    var12 = 1;
                }
                class74.method1466(field396 + arg2 - var10 / 2, field351 + arg3 - 3, var12, 5, 65280);
                class74.method1466(field396 + arg2 - var10 / 2 + var12, field351 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field756[var13] > field410) {
                method128(arg0, arg0.field784 / 2);
                if (field396 > -1) {
                    if (var13 == 1) {
                        field351 -= 20;
                    }
                    if (var13 == 2) {
                        field396 -= 15;
                        field351 -= 10;
                    }
                    if (var13 == 3) {
                        field396 += 15;
                        field351 -= 10;
                    }
                    Statics.field1301[arg0.field755[var13]].method1364(field396 + arg2 - 12, field351 + arg3 - 12);
                    Statics.field681.method3363(Integer.toString(arg0.field754[var13]), field396 + arg2 - 1, field351 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("d.ay(I)V")
    public static final void method113() {
        field364 = 0;
        int var0 = (Statics.field2031.field753 >> 7) + Statics.field86;
        int var1 = (Statics.field2031.field736 >> 7) + Statics.field223;
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

    @ObfuscatedName("i.ao(IIIII)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3) {
        if (field355 == 1) {
            Statics.field1278[field477 / 100].method1364(field354 - 8, field333 - 8);
        }
        if (field355 == 2) {
            Statics.field1278[field477 / 100 + 4].method1364(field354 - 8, field333 - 8);
        }
        method113();
        if (!field300) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1003.method3362("Fps:" + field2040, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field247) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field247) {
            var8 = 16711680;
        }
        Statics.field1003.method3362("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("y.ad(Las;II)V")
    public static final void method128(class34 arg0, int arg1) {
        method668(arg0.field753, arg0.field736, arg1);
    }

    @ObfuscatedName("ag.ab(IIIB)V")
    public static final void method668(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field396 = -1;
            field351 = -1;
            return;
        }
        int var3 = method126(arg0, arg1, Statics.field1121) - arg2;
        int var4 = arg0 - Statics.field12;
        int var5 = var3 - Statics.field166;
        int var6 = arg1 - Statics.field180;
        int var7 = class85.field1479[Statics.field1002];
        int var8 = class85.field1465[Statics.field1002];
        int var9 = class85.field1479[Statics.field446];
        int var10 = class85.field1465[Statics.field446];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field396 = (var11 << 9) / var15 + 256;
            field351 = (var14 << 9) / var15 + 167;
        } else {
            field396 = -1;
            field351 = -1;
        }
    }

    @ObfuscatedName("y.af(IIII)I")
    public static final int method126(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field83[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field76[var5][var3][var4] + class6.field76[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field76[var5][var3][var4 + 1] + class6.field76[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cd.aw(IIIIIIB)V")
    public static final void method1831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1479[var6];
            int var12 = class85.field1465[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1479[var7];
            int var15 = class85.field1465[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field12 = arg0 - var8;
        Statics.field166 = arg1 - var9;
        Statics.field180 = arg2 - var10;
        Statics.field1002 = arg3;
        Statics.field446 = arg4;
    }

    @ObfuscatedName("ea.ai(ZI)V")
    public static final void method2762(boolean arg0) {
        field305 = arg0;
        if (!field305) {
            int var1 = field504.method2118();
            int var2 = field504.method2108();
            int var3 = (field288 - field504.field1824) / 16;
            Statics.field848 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field848[var4][var5] = field504.method2127();
                }
            }
            int var6 = field504.method2164();
            int var7 = field504.method2263();
            int var8 = field504.method2118();
            Statics.field1750 = new int[var3];
            Statics.field564 = new int[var3];
            Statics.field129 = new int[var3];
            Statics.field1858 = new byte[var3][];
            Statics.field1103 = new byte[var3][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1750[var10] = var13;
                        Statics.field564[var10] = Statics.field276.method2723("m" + var11 + "_" + var12);
                        Statics.field129[var10] = Statics.field276.method2723("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method2012(var7, var6, var2, var8, var1);
            return;
        }
        int var14 = field504.method2164();
        int var15 = field504.method2116();
        field504.method2334();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field504.method2315(1);
                    if (var19 == 1) {
                        field252[var16][var17][var18] = field504.method2315(26);
                    } else {
                        field252[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field504.method2316();
        int var20 = (field288 - field504.field1824) / 16;
        Statics.field848 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field848[var21][var22] = field504.method2127();
            }
        }
        int var23 = field504.method2118();
        int var24 = field504.method2107();
        int var25 = field504.method2116();
        Statics.field1750 = new int[var20];
        Statics.field564 = new int[var20];
        Statics.field129 = new int[var20];
        Statics.field1858 = new byte[var20][];
        Statics.field1103 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field252[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1750[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1750[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field564[var26] = Statics.field276.method2723("m" + var35 + "_" + var36);
                            Statics.field129[var26] = Statics.field276.method2723("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method2012(var23, var25, var24, var15, var14);
    }

    @ObfuscatedName("fw.au(ZB)V")
    public static final void method3089(boolean arg0) {
        Statics.method1737();
        field248++;
        if (field248 < 50 && !arg0) {
            return;
        }
        field248 = 0;
        if (field460 || Statics.field550 == null) {
            return;
        }
        field285.method2312(107);
        try {
            Statics.field550.method2532(field285.field1828, 0, field285.field1824);
            field285.field1824 = 0;
        } catch (IOException var2) {
            field460 = true;
        }
    }

    @ObfuscatedName("ao.av(I)V")
    public static final void method792() {
        method3089(false);
        field298 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1858.length; var1++) {
            if (Statics.field564[var1] != -1 && Statics.field1858[var1] == null) {
                Statics.field1858[var1] = Statics.field276.method2660(Statics.field564[var1], 0);
                if (Statics.field1858[var1] == null) {
                    var0 = false;
                    field298++;
                }
            }
            if (Statics.field129[var1] != -1 && Statics.field1103[var1] == null) {
                Statics.field1103[var1] = Statics.field276.method2661(Statics.field129[var1], 0, Statics.field848[var1]);
                if (Statics.field1103[var1] == null) {
                    var0 = false;
                    field298++;
                }
            }
        }
        if (!var0) {
            field257 = 1;
            return;
        }
        field259 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1858.length; var3++) {
            byte[] var4 = Statics.field1103[var3];
            if (var4 != null) {
                int var5 = (Statics.field1750[var3] >> 8) * 64 - Statics.field86;
                int var6 = (Statics.field1750[var3] & 0xFF) * 64 - Statics.field223;
                if (field305) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class108 var9 = new class108(var4);
                int var10 = -1;
                label587: while (true) {
                    int var11 = var9.method2215();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2215();
                            if (var16 == 0) {
                                continue label587;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2083() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class37 var22 = class37.method3266(var10);
                                if (var19 != 22 || !field247 || var22.field869 != 0 || var22.field879 == 1 || var22.field888) {
                                    if (!var22.method609()) {
                                        field259++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2215();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2083();
                    }
                }
            }
        }
        if (!var2) {
            field257 = 2;
            return;
        }
        if (field257 != 0) {
            method2535(class145.field2157 + class2.field21 + class2.field31 + 100 + "%" + class2.field24, true);
        }
        Statics.method1737();
        method2029();
        Statics.method1737();
        Statics.field303.method1577();
        Statics.method1737();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field304[var23].method3504();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field83[var24][var25][var26] = 0;
                }
            }
        }
        Statics.method1737();
        class6.field75 = 99;
        Statics.field66 = new byte[4][104][104];
        Statics.field68 = new byte[4][104][104];
        Statics.field1517 = new byte[4][104][104];
        Statics.field69 = new byte[4][104][104];
        Statics.field2683 = new int[4][105][105];
        Statics.field2979 = new byte[4][105][105];
        Statics.field2116 = new int[105][105];
        Statics.field70 = new int[104];
        Statics.field611 = new int[104];
        Statics.field71 = new int[104];
        Statics.field2096 = new int[104];
        Statics.field2146 = new int[104];
        int var27 = Statics.field1858.length;
        for (class21 var28 = (class21) class21.field553.method3174(); var28 != null; var28 = (class21) class21.field553.method3176()) {
            if (var28.field558 != null) {
                Statics.field1842.method918(var28.field558);
                var28.field558 = null;
            }
            if (var28.field555 != null) {
                Statics.field1842.method918(var28.field555);
                var28.field555 = null;
            }
        }
        class21.field553.method3168();
        method3089(true);
        if (!field305) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field1750[var29] >> 8) * 64 - Statics.field86;
                int var31 = (Statics.field1750[var29] & 0xFF) * 64 - Statics.field223;
                byte[] var32 = Statics.field1858[var29];
                if (var32 != null) {
                    Statics.method1737();
                    class6.method602(var32, var30, var31, Statics.field600 * 8 - 48, Statics.field714 * 8 - 48, field304);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field1750[var33] >> 8) * 64 - Statics.field86;
                int var35 = (Statics.field1750[var33] & 0xFF) * 64 - Statics.field223;
                byte[] var36 = Statics.field1858[var33];
                if (var36 == null && Statics.field714 < 800) {
                    Statics.method1737();
                    class6.method3268(var34, var35, 64, 64);
                }
            }
            method3089(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1103[var37];
                if (var38 != null) {
                    int var39 = (Statics.field1750[var37] >> 8) * 64 - Statics.field86;
                    int var40 = (Statics.field1750[var37] & 0xFF) * 64 - Statics.field223;
                    Statics.method1737();
                    class6.method703(var38, var39, var40, Statics.field303, field304);
                }
            }
        }
        if (field305) {
            for (int var41 = 0; var41 < 4; var41++) {
                Statics.method1737();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field252[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field1750.length; var51++) {
                                if (Statics.field1750[var51] == var50 && Statics.field1858[var51] != null) {
                                    byte[] var52 = Statics.field1858[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class209[] var57 = field304;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field3002[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class108 var60 = new class108(var52);
                                    for (int var61 = 0; var61 < 4; var61++) {
                                        for (int var62 = 0; var62 < 64; var62++) {
                                            for (int var63 = 0; var63 < 64; var63++) {
                                                if (var46 == var61 && var62 >= var55 && var62 < var55 + 8 && var63 >= var56 && var63 < var56 + 8) {
                                                    int var67 = var62 & 0x7;
                                                    int var68 = var63 & 0x7;
                                                    int var70 = var47 & 0x3;
                                                    int var71;
                                                    if (var70 == 0) {
                                                        var71 = var67;
                                                    } else if (var70 == 1) {
                                                        var71 = var68;
                                                    } else if (var70 == 2) {
                                                        var71 = 7 - var67;
                                                    } else {
                                                        var71 = 7 - var68;
                                                    }
                                                    class6.method855(var60, var41, var53 + var71, var54 + Statics.method517(var62 & 0x7, var63 & 0x7, var47), 0, 0, var47);
                                                } else {
                                                    class6.method855(var60, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            int var72 = var41;
                            int var73 = var42 * 8;
                            int var74 = var43 * 8;
                            for (int var75 = 0; var75 < 8; var75++) {
                                for (int var76 = 0; var76 < 8; var76++) {
                                    class6.field76[var72][var73 + var75][var74 + var76] = 0;
                                }
                            }
                            if (var73 > 0) {
                                for (int var77 = 1; var77 < 8; var77++) {
                                    class6.field76[var72][var73][var74 + var77] = class6.field76[var72][var73 - 1][var74 + var77];
                                }
                            }
                            if (var74 > 0) {
                                for (int var78 = 1; var78 < 8; var78++) {
                                    class6.field76[var72][var73 + var78][var74] = class6.field76[var72][var73 + var78][var74 - 1];
                                }
                            }
                            if (var73 > 0 && class6.field76[var72][var73 - 1][var74] != 0) {
                                class6.field76[var72][var73][var74] = class6.field76[var72][var73 - 1][var74];
                            } else if (var74 > 0 && class6.field76[var72][var73][var74 - 1] != 0) {
                                class6.field76[var72][var73][var74] = class6.field76[var72][var73][var74 - 1];
                            } else if (var73 > 0 && var74 > 0 && class6.field76[var72][var73 - 1][var74 - 1] != 0) {
                                class6.field76[var72][var73][var74] = class6.field76[var72][var73 - 1][var74 - 1];
                            }
                        }
                    }
                }
            }
            for (int var79 = 0; var79 < 13; var79++) {
                for (int var80 = 0; var80 < 13; var80++) {
                    int var81 = field252[0][var79][var80];
                    if (var81 == -1) {
                        class6.method3268(var79 * 8, var80 * 8, 8, 8);
                    }
                }
            }
            method3089(true);
            for (int var82 = 0; var82 < 4; var82++) {
                Statics.method1737();
                for (int var83 = 0; var83 < 13; var83++) {
                    label388: for (int var84 = 0; var84 < 13; var84++) {
                        int var85 = field252[var82][var83][var84];
                        if (var85 != -1) {
                            int var86 = var85 >> 24 & 0x3;
                            int var87 = var85 >> 1 & 0x3;
                            int var88 = var85 >> 14 & 0x3FF;
                            int var89 = var85 >> 3 & 0x7FF;
                            int var90 = (var88 / 8 << 8) + var89 / 8;
                            for (int var91 = 0; var91 < Statics.field1750.length; var91++) {
                                if (Statics.field1750[var91] == var90 && Statics.field1103[var91] != null) {
                                    byte[] var92 = Statics.field1103[var91];
                                    int var93 = var83 * 8;
                                    int var94 = var84 * 8;
                                    int var95 = (var88 & 0x7) * 8;
                                    int var96 = (var89 & 0x7) * 8;
                                    class80 var97 = Statics.field303;
                                    class209[] var98 = field304;
                                    class108 var99 = new class108(var92);
                                    int var100 = -1;
                                    while (true) {
                                        int var101 = var99.method2215();
                                        if (var101 == 0) {
                                            continue label388;
                                        }
                                        var100 += var101;
                                        int var102 = 0;
                                        while (true) {
                                            int var103 = var99.method2215();
                                            if (var103 == 0) {
                                                break;
                                            }
                                            var102 += var103 - 1;
                                            int var104 = var102 & 0x3F;
                                            int var105 = var102 >> 6 & 0x3F;
                                            int var106 = var102 >> 12;
                                            int var107 = var99.method2083();
                                            int var108 = var107 >> 2;
                                            int var109 = var107 & 0x3;
                                            if (var86 == var106 && var105 >= var95 && var105 < var95 + 8 && var104 >= var96 && var104 < var96 + 8) {
                                                class37 var110 = class37.method3266(var100);
                                                int var111 = var93 + class158.method1931(var105 & 0x7, var104 & 0x7, var87, var110.field865, var110.field866, var109);
                                                int var113 = var105 & 0x7;
                                                int var114 = var104 & 0x7;
                                                int var116 = var110.field865;
                                                int var117 = var110.field866;
                                                if ((var109 & 0x1) == 1) {
                                                    int var118 = var116;
                                                    var116 = var117;
                                                    var117 = var118;
                                                }
                                                int var119 = var87 & 0x3;
                                                int var120;
                                                if (var119 == 0) {
                                                    var120 = var114;
                                                } else if (var119 == 1) {
                                                    var120 = 7 - var113 - (var116 - 1);
                                                } else if (var119 == 2) {
                                                    var120 = 7 - var114 - (var117 - 1);
                                                } else {
                                                    var120 = var113;
                                                }
                                                int var121 = var94 + var120;
                                                if (var111 > 0 && var121 > 0 && var111 < 103 && var121 < 103) {
                                                    int var122 = var82;
                                                    if ((class6.field83[1][var111][var121] & 0x2) == 2) {
                                                        var122 = var82 - 1;
                                                    }
                                                    class209 var123 = null;
                                                    if (var122 >= 0) {
                                                        var123 = var98[var122];
                                                    }
                                                    class6.method575(var82, var111, var121, var100, var87 + var109 & 0x3, var108, var97, var123);
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
        method3089(true);
        method2029();
        Statics.method1737();
        class6.method1(Statics.field303, field304);
        method3089(true);
        int var124 = class6.field75;
        if (var124 > Statics.field1121) {
            var124 = Statics.field1121;
        }
        if (var124 < Statics.field1121 - 1) {
            int var125 = Statics.field1121 - 1;
        }
        if (field247) {
            Statics.field303.method1561(class6.field75);
        } else {
            Statics.field303.method1561(0);
        }
        for (int var126 = 0; var126 < 104; var126++) {
            for (int var127 = 0; var127 < 104; var127++) {
                method544(var126, var127);
            }
        }
        Statics.method1737();
        for (class15 var128 = (class15) field380.method3174(); var128 != null; var128 = (class15) field380.method3176()) {
            if (var128.field198 == -1) {
                var128.field200 = 0;
                method2305(var128);
            } else {
                var128.method3259();
            }
        }
        class37.field853.method3100();
        if (Statics.field928 != null) {
            field285.method2312(218);
            field285.method2245(1057001181);
        }
        if (!field305) {
            int var129 = (Statics.field600 - 6) / 8;
            int var130 = (Statics.field600 + 6) / 8;
            int var131 = (Statics.field714 - 6) / 8;
            int var132 = (Statics.field714 + 6) / 8;
            for (int var133 = var129 - 1; var133 <= var130 + 1; var133++) {
                for (int var134 = var131 - 1; var134 <= var132 + 1; var134++) {
                    if (var133 < var129 || var133 > var130 || var134 < var131 || var134 > var132) {
                        Statics.field276.method2680("m" + var133 + "_" + var134);
                        Statics.field276.method2680("l" + var133 + "_" + var134);
                    }
                }
            }
        }
        method88(30);
        Statics.method1737();
        Statics.method2344();
        field285.method2312(102);
        class133.method704();
    }

    @ObfuscatedName("ej.bq(II)V")
    public static final void method2655(int arg0) {
        int[] var1 = Statics.field1810.field1304;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field83[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field303.method1594(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field303.method1594(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1810.method1379();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field83[arg0][var10][var9] & 0x18) == 0) {
                    method2867(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2867(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field455 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field303.method1589(Statics.field1121, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class37.method3266(var14).field878;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field304[Statics.field1121].field3002;
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
                        field479[field455] = Statics.field13[var15];
                        field334[field455] = var16;
                        field478[field455] = var17;
                        field455++;
                    }
                }
            }
        }
        Statics.field1449.method1353();
    }

    @ObfuscatedName("fp.bs(IIIIIB)V")
    public static final void method2867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field303.method1586(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field303.method1590(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1810.field1304;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method3266(var12);
            if (var13.field859 == -1) {
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
                class75 var14 = Statics.field2067[var13.field859];
                if (var14 != null) {
                    int var15 = (var13.field865 * 4 - var14.field1323) / 2;
                    int var16 = (var13.field866 * 4 - var14.field1324) / 2;
                    var14.method1522(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field866) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field303.method1588(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field303.method1590(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method3266(var21);
            if (var22.field859 != -1) {
                class75 var23 = Statics.field2067[var22.field859];
                if (var23 != null) {
                    int var24 = (var22.field865 * 4 - var23.field1323) / 2;
                    int var25 = (var22.field866 * 4 - var23.field1324) / 2;
                    var23.method1522(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field866) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1810.field1304;
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
        int var29 = Statics.field303.method1589(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method3266(var30);
        if (var31.field859 == -1) {
            return;
        }
        class75 var32 = Statics.field2067[var31.field859];
        if (var32 != null) {
            int var33 = (var31.field865 * 4 - var32.field1323) / 2;
            int var34 = (var31.field866 * 4 - var32.field1324) / 2;
            var32.method1522(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field866) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("en.bh(I)Z")
    public static final boolean method2543() {
        if (Statics.field550 == null) {
            return false;
        }
        try {
            int var0 = Statics.field550.method2530();
            if (var0 == 0) {
                return false;
            }
            if (field289 == -1) {
                Statics.field550.method2531(field504.field1828, 0, 1);
                field504.field1824 = 0;
                field289 = field504.method2310();
                field288 = class169.field2822[field289];
                var0--;
            }
            if (field288 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field550.method2531(field504.field1828, 0, 1);
                field288 = field504.field1828[0] & 0xFF;
                var0--;
            }
            if (field288 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field550.method2531(field504.field1828, 0, 2);
                field504.field1824 = 0;
                field288 = field504.method2263();
                var0 -= 2;
            }
            if (var0 < field288) {
                return false;
            }
            field504.field1824 = 0;
            Statics.field550.method2531(field504.field1828, 0, field288);
            field290 = 0;
            field295 = field294;
            field294 = field293;
            field293 = field289;
            if (field289 == 71) {
                int var1 = field504.method2117();
                int var2 = field504.method2263();
                if (var1 < -70000) {
                    var2 += 32768;
                }
                class155 var3;
                if (var1 >= 0) {
                    var3 = class155.method2787(var1);
                } else {
                    var3 = null;
                }
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2643.length; var4++) {
                        var3.field2643[var4] = 0;
                        var3.field2644[var4] = 0;
                    }
                }
                class14.method12(var2);
                int var5 = field504.method2263();
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = field504.method2083();
                    if (var7 == 255) {
                        var7 = field504.method2126();
                    }
                    int var8 = field504.method2164();
                    if (var3 != null && var6 < var3.field2643.length) {
                        var3.field2643[var6] = var8;
                        var3.field2644[var6] = var7;
                    }
                    class14.method2068(var2, var6, var8 - 1, var7);
                }
                if (var3 != null) {
                    method2761(var3);
                }
                method1554();
                field436[++field437 - 1 & 0x1F] = var2 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 196) {
                int var9 = field504.method2117();
                int var10 = field504.method2263();
                if (var9 < -70000) {
                    var10 += 32768;
                }
                class155 var11;
                if (var9 >= 0) {
                    var11 = class155.method2787(var9);
                } else {
                    var11 = null;
                }
                while (field504.field1824 < field288) {
                    int var12 = field504.method2215();
                    int var13 = field504.method2263();
                    int var14 = 0;
                    if (var13 != 0) {
                        var14 = field504.method2083();
                        if (var14 == 255) {
                            var14 = field504.method2117();
                        }
                    }
                    if (var11 != null && var12 >= 0 && var12 < var11.field2643.length) {
                        var11.field2643[var12] = var13;
                        var11.field2644[var12] = var14;
                    }
                    class14.method2068(var10, var12, var13 - 1, var14);
                }
                if (var11 != null) {
                    method2761(var11);
                }
                method1554();
                field436[++field437 - 1 & 0x1F] = var10 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 29) {
                method1554();
                field415 = field504.method2214();
                field445 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 228) {
                int var15 = field504.method2215();
                boolean var16 = field504.method2083() == 1;
                String var17 = "";
                boolean var18 = false;
                if (var16) {
                    var17 = field504.method2091();
                    if (method2391(var17)) {
                        var18 = true;
                    }
                }
                String var19 = field504.method2091();
                if (!var18) {
                    class10.method995(var15, var17, var19);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 0) {
                method1554();
                int var20 = field504.method2126();
                int var21 = field504.method2107();
                int var22 = field504.method2108();
                field282[var21] = var20;
                field384[var21] = var22;
                field385[var21] = 1;
                for (int var23 = 0; var23 < 98; var23++) {
                    if (var20 >= class143.field2133[var23]) {
                        field385[var21] = var23 + 2;
                    }
                }
                field353[++field439 - 1 & 0x1F] = var21;
                field289 = -1;
                return true;
            }
            if (field289 == 209) {
                field504.field1824 += 28;
                if (field504.method2225()) {
                    class111 var24 = field504;
                    int var25 = field504.field1824 - 28;
                    if (class138.field2076 != null) {
                        try {
                            class138.field2076.method3473(0L);
                            class138.field2076.method3463(var24.field1828, var25, 24);
                        } catch (Exception var301) {
                        }
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 162) {
                for (int var27 = 0; var27 < class157.field2672.length; var27++) {
                    if (class157.field2675[var27] != class157.field2672[var27]) {
                        class157.field2672[var27] = class157.field2675[var27];
                        method134(var27);
                        field434[++field435 - 1 & 0x1F] = var27;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 62) {
                method2640();
                field289 = -1;
                return false;
            }
            if (field289 == 40) {
                field494 = true;
                Statics.field2084 = field504.method2083();
                Statics.field626 = field504.method2083();
                Statics.field1985 = field504.method2263();
                Statics.field802 = field504.method2083();
                Statics.field1748 = field504.method2083();
                if (Statics.field1748 >= 100) {
                    Statics.field12 = Statics.field2084 * 128 + 64;
                    Statics.field180 = Statics.field626 * 128 + 64;
                    Statics.field166 = method126(Statics.field12, Statics.field180, Statics.field1121) - Statics.field1985;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 201) {
                field494 = true;
                Statics.field957 = field504.method2083();
                Statics.field800 = field504.method2083();
                Statics.field1788 = field504.method2263();
                Statics.field1925 = field504.method2083();
                Statics.field2451 = field504.method2083();
                if (Statics.field2451 >= 100) {
                    int var28 = Statics.field957 * 128 + 64;
                    int var29 = Statics.field800 * 128 + 64;
                    int var30 = method126(var28, var29, Statics.field1121) - Statics.field1788;
                    int var31 = var28 - Statics.field12;
                    int var32 = var30 - Statics.field166;
                    int var33 = var29 - Statics.field180;
                    int var34 = (int) Math.sqrt((double) (var31 * var31 + var33 * var33));
                    Statics.field1002 = (int) (Math.atan2((double) var32, (double) var34) * 325.949D) & 0x7FF;
                    Statics.field446 = (int) (Math.atan2((double) var31, (double) var33) * -325.949D) & 0x7FF;
                    if (Statics.field1002 < 128) {
                        Statics.field1002 = 128;
                    }
                    if (Statics.field1002 > 383) {
                        Statics.field1002 = 383;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 35) {
                field442 = field433;
                if (field288 == 0) {
                    field291 = null;
                    field474 = null;
                    Statics.field825 = 0;
                    Statics.field1296 = null;
                    field289 = -1;
                    return true;
                }
                field474 = field504.method2091();
                long var35 = field504.method2089();
                field291 = class210.method3287(var35);
                Statics.field843 = field504.method2173();
                int var37 = field504.method2083();
                if (var37 == 255) {
                    field289 = -1;
                    return true;
                }
                Statics.field825 = var37;
                class22[] var38 = new class22[100];
                for (int var39 = 0; var39 < Statics.field825; var39++) {
                    var38[var39] = new class22();
                    var38[var39].field566 = field504.method2091();
                    var38[var39].field563 = class212.method2544(var38[var39].field566, Statics.field2061);
                    var38[var39].field565 = field504.method2263();
                    var38[var39].field570 = field504.method2173();
                    field504.method2091();
                    if (var38[var39].field566.equals(Statics.field2031.field39)) {
                        Statics.field151 = var38[var39].field570;
                    }
                }
                boolean var40 = false;
                int var41 = Statics.field825;
                while (var41 > 0) {
                    boolean var42 = true;
                    var41--;
                    for (int var43 = 0; var43 < var41; var43++) {
                        if (var38[var43].field563.compareTo(var38[var43 + 1].field563) > 0) {
                            class22 var44 = var38[var43];
                            var38[var43] = var38[var43 + 1];
                            var38[var43 + 1] = var44;
                            var42 = false;
                        }
                    }
                    if (var42) {
                        break;
                    }
                }
                Statics.field1296 = var38;
                field289 = -1;
                return true;
            }
            if (field289 == 247) {
                int var45 = field504.method2107();
                int var46 = field504.method2107();
                int var47 = field504.method2108();
                Statics.field1121 = var45 >> 1;
                Statics.field2031.method562(var46, var47, (var45 & 0x1) == 1);
                field289 = -1;
                return true;
            }
            if (field289 == 65) {
                int var48 = field504.method2126();
                class155 var49 = class155.method2787(var48);
                for (int var50 = 0; var50 < var49.field2643.length; var50++) {
                    var49.field2643[var50] = -1;
                    var49.field2643[var50] = 0;
                }
                method2761(var49);
                field289 = -1;
                return true;
            }
            if (field289 == 83) {
                while (field504.field1824 < field288) {
                    boolean var51 = field504.method2083() == 1;
                    String var52 = field504.method2091();
                    String var53 = field504.method2091();
                    int var54 = field504.method2263();
                    int var55 = field504.method2083();
                    int var56 = field504.method2083();
                    boolean var57 = (var56 & 0x2) != 0;
                    boolean var58 = (var56 & 0x1) != 0;
                    if (var54 > 0) {
                        field504.method2091();
                        field504.method2083();
                        field504.method2117();
                    }
                    field504.method2091();
                    for (int var59 = 0; var59 < field500; var59++) {
                        class16 var60 = field347[var59];
                        if (var51) {
                            if (var53.equals(var60.field218)) {
                                var60.field218 = var52;
                                var60.field211 = var53;
                                var52 = null;
                                break;
                            }
                        } else if (var52.equals(var60.field218)) {
                            if (var60.field210 != var54) {
                                boolean var61 = true;
                                for (class35 var62 = (class35) field344.method3122(); var62 != null; var62 = (class35) field344.method3127()) {
                                    if (var62.field801.equals(var52)) {
                                        if (var54 != 0 && var62.field797 == 0) {
                                            var62.method3253();
                                            var61 = false;
                                        } else if (var54 == 0 && var62.field797 != 0) {
                                            var62.method3253();
                                            var61 = false;
                                        }
                                    }
                                }
                                if (var61) {
                                    field344.method3130(new class35(var52, var54));
                                }
                                var60.field210 = var54;
                            }
                            var60.field211 = var53;
                            var60.field213 = var55;
                            var60.field214 = var57;
                            var60.field212 = var58;
                            var52 = null;
                            break;
                        }
                    }
                    if (var52 != null && field500 < 400) {
                        class16 var63 = new class16();
                        field347[field500] = var63;
                        var63.field218 = var52;
                        var63.field211 = var53;
                        var63.field210 = var54;
                        var63.field213 = var55;
                        var63.field214 = var57;
                        var63.field212 = var58;
                        field500++;
                    }
                }
                field501 = 2;
                field441 = field433;
                boolean var64 = false;
                int var65 = field500;
                while (var65 > 0) {
                    boolean var66 = true;
                    var65--;
                    for (int var67 = 0; var67 < var65; var67++) {
                        boolean var68 = false;
                        class16 var69 = field347[var67];
                        class16 var70 = field347[var67 + 1];
                        if (field243 != var69.field210 && field243 == var70.field210) {
                            var68 = true;
                        }
                        if (!var68 && var69.field210 == 0 && var70.field210 != 0) {
                            var68 = true;
                        }
                        if (!var68 && !var69.field214 && var70.field214) {
                            var68 = true;
                        }
                        if (!var68 && !var69.field212 && var70.field212) {
                            var68 = true;
                        }
                        if (var68) {
                            class16 var71 = field347[var67];
                            field347[var67] = field347[var67 + 1];
                            field347[var67 + 1] = var71;
                            var66 = false;
                        }
                    }
                    if (var66) {
                        break;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 157) {
                boolean var72 = field504.method2083() == 1;
                if (var72) {
                    Statics.field2845 = class104.method528() - field504.method2089();
                    Statics.field569 = new class202(field504, true);
                } else {
                    Statics.field569 = null;
                }
                field444 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 192) {
                int var73 = field504.method2263();
                int var74 = field504.method2083();
                int var75 = field504.method2263();
                method793(var73, var74, var75);
                field289 = -1;
                return true;
            }
            if (field289 == 95 || field289 == 178 || field289 == 28 || field289 == 143 || field289 == 235 || field289 == 195 || field289 == 77 || field289 == 25 || field289 == 23 || field289 == 205) {
                method2022();
                field289 = -1;
                return true;
            }
            if (field289 == 130) {
                field480 = field504.method2083();
                if (field480 == 255) {
                    field480 = 0;
                }
                field481 = field504.method2083();
                if (field481 == 255) {
                    field481 = 0;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 240) {
                int var76 = field504.method2106();
                class155 var77 = class155.method2787(var76);
                var77.field2558 = 3;
                var77.field2528 = Statics.field2031.field33.method2877();
                method2761(var77);
                field289 = -1;
                return true;
            }
            if (field289 == 61) {
                method857();
                field289 = -1;
                return true;
            }
            if (field289 == 14) {
                String var78 = field504.method2091();
                class111 var79 = field504;
                String var83;
                try {
                    int var80 = var79.method2215();
                    if (var80 > 32767) {
                        var80 = 32767;
                    }
                    byte[] var81 = new byte[var80];
                    var79.field1824 += Statics.field2953.method2018(var79.field1828, var79.field1824, var81, 0, var80);
                    String var82 = class213.method549(var81, 0, var80);
                    var83 = var82;
                } catch (Exception var300) {
                    var83 = "Cabbage";
                }
                String var86 = class204.method3360(Statics.method550(var83));
                class10.method995(6, var78, var86);
                field289 = -1;
                return true;
            }
            if (field289 == 94) {
                String var87 = field504.method2091();
                long var88 = field504.method2089();
                long var90 = (long) field504.method2263();
                long var92 = (long) field504.method2260();
                class140[] var94 = new class140[] { class140.field2109, class140.field2098, class140.field2099, class140.field2101, class140.field2100 };
                class140 var95 = (class140) class100.method1742(var94, field504.method2083());
                long var96 = (var90 << 32) + var92;
                boolean var98 = false;
                for (int var99 = 0; var99 < 100; var99++) {
                    if (field467[var99] == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var95.field2106 && method2391(var87)) {
                    var98 = true;
                }
                if (!var98 && field364 == 0) {
                    field467[field468] = var96;
                    field468 = (field468 + 1) % 100;
                    class111 var100 = field504;
                    String var104;
                    try {
                        int var101 = var100.method2215();
                        if (var101 > 32767) {
                            var101 = 32767;
                        }
                        byte[] var102 = new byte[var101];
                        var100.field1824 += Statics.field2953.method2018(var100.field1828, var100.field1824, var102, 0, var101);
                        String var103 = class213.method549(var102, 0, var101);
                        var104 = var103;
                    } catch (Exception var299) {
                        var104 = "Cabbage";
                    }
                    String var107 = class204.method3360(Statics.method550(var104));
                    if (var95.field2107 == -1) {
                        class10.method974(9, var87, var107, class210.method1358(var88));
                    } else {
                        class10.method974(9, class2.method2524(var95.field2107) + var87, var107, class210.method1358(var88));
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 238) {
                int var108 = field504.method2120();
                int var109 = field504.method2120();
                int var110 = field504.method2117();
                class155 var111 = class155.method2787(var110);
                int var112 = var111.field2642 + var108;
                int var113 = var111.field2546 + var109;
                if (var111.field2543 != var112 || var111.field2544 != var113) {
                    var111.field2543 = var112;
                    var111.field2544 = var113;
                    method2761(var111);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 168) {
                int var114 = field504.method2263();
                if (var114 == 65535) {
                    var114 = -1;
                }
                method1288(var114);
                field289 = -1;
                return true;
            }
            if (field289 == 88) {
                int var115 = field504.method2116();
                if (var115 == 65535) {
                    var115 = -1;
                }
                int var116 = field504.method2122();
                if (field483 != 0 && var115 != -1) {
                    Statics.method31(Statics.field2834, var115, 0, field483, false);
                    field352 = true;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 128) {
                for (int var117 = 0; var117 < Statics.field1066; var117++) {
                    class47 var118 = class47.method756(var117);
                    if (var118 != null) {
                        class157.field2675[var117] = 0;
                        class157.field2672[var117] = 0;
                    }
                }
                method1554();
                field435 += 32;
                field289 = -1;
                return true;
            }
            if (field289 == 212) {
                boolean var119 = field504.method2108() == 1;
                int var120 = field504.method2126();
                class155 var121 = class155.method2787(var120);
                if (var121.field2550 != var119) {
                    var121.field2550 = var119;
                    method2761(var121);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 52) {
                method856();
                field289 = -1;
                return true;
            }
            if (field289 == 39) {
                for (int var122 = 0; var122 < field365.length; var122++) {
                    if (field365[var122] != null) {
                        field365[var122].field766 = -1;
                    }
                }
                for (int var123 = 0; var123 < field261.length; var123++) {
                    if (field261[var123] != null) {
                        field261[var123].field766 = -1;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 96) {
                int var124 = field504.method2106();
                int var125 = field504.method2119();
                class155 var126 = class155.method2787(var124);
                if (var126.field2574 != var125 || var125 == -1) {
                    var126.field2574 = var125;
                    var126.field2647 = 0;
                    var126.field2645 = 0;
                    method2761(var126);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 106) {
                int var127 = field504.method2127();
                Statics.field508 = Statics.field519.method2443(var127);
                field289 = -1;
                return true;
            }
            if (field289 == 51) {
                int var128 = field504.method2116();
                byte var129 = field504.method2173();
                class157.field2675[var128] = var129;
                if (class157.field2672[var128] != var129) {
                    class157.field2672[var128] = var129;
                    method134(var128);
                }
                field434[++field435 - 1 & 0x1F] = var128;
                field289 = -1;
                return true;
            }
            if (field289 == 8) {
                field296 = field504.method2083();
                if (field296 == 1) {
                    field262 = field504.method2263();
                }
                if (field296 >= 2 && field296 <= 6) {
                    if (field296 == 2) {
                        field267 = 64;
                        field317 = 64;
                    }
                    if (field296 == 3) {
                        field267 = 0;
                        field317 = 64;
                    }
                    if (field296 == 4) {
                        field267 = 128;
                        field317 = 64;
                    }
                    if (field296 == 5) {
                        field267 = 64;
                        field317 = 0;
                    }
                    if (field296 == 6) {
                        field267 = 64;
                        field317 = 128;
                    }
                    field296 = 2;
                    field264 = field504.method2263();
                    field265 = field504.method2263();
                    field266 = field504.method2083();
                }
                if (field296 == 10) {
                    field358 = field504.method2263();
                }
                field289 = -1;
                return true;
            }
            if (field289 == 153) {
                if (field421 != -1) {
                    int var130 = field421;
                    if (class155.method1264(var130)) {
                        method1933(Statics.field2565[var130], 0);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 111) {
                int var131 = field504.method2116();
                class14.method725(var131);
                field436[++field437 - 1 & 0x1F] = var131 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 229) {
                int var132 = field504.method2127();
                int var133 = field504.method2108();
                int var134 = field504.method2263();
                class4 var135 = (class4) field245.method3140((long) var132);
                if (var135 != null) {
                    method147(var135, var135.field60 != var134);
                }
                class4 var136 = new class4();
                var136.field60 = var134;
                var136.field55 = var133;
                field245.method3137(var136, (long) var132);
                method1744(var134);
                class33.method2431(var134);
                class155 var137 = class155.method2787(var132);
                if (var137 != null) {
                    method2761(var137);
                }
                if (field413 != null) {
                    method2761(field413);
                    field413 = null;
                }
                method497();
                if (field421 != -1) {
                    int var138 = field421;
                    if (class155.method1264(var138)) {
                        method1933(Statics.field2565[var138], 1);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 93) {
                int var139 = field504.method2106();
                int var140 = field504.method2118();
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = field504.method2126();
                class155 var142 = class155.method2787(var139);
                if (var142.field2537) {
                    var142.field2569 = var140;
                    var142.field2646 = var141;
                    class46 var144 = class46.method86(var140);
                    var142.field2578 = var144.field1028;
                    var142.field2579 = var144.field1031;
                    var142.field2580 = var144.field1030;
                    var142.field2576 = var144.field1062;
                    var142.field2577 = var144.field1032;
                    var142.field2581 = var144.field1027;
                    if (var144.field1026 == 1) {
                        var142.field2584 = 1;
                    } else {
                        var142.field2584 = 2;
                    }
                    if (var142.field2547 > 0) {
                        var142.field2581 = var142.field2581 * 32 / var142.field2547;
                    }
                    method2761(var142);
                } else if (var140 == -1) {
                    var142.field2558 = 0;
                    field289 = -1;
                    return true;
                } else {
                    class46 var143 = class46.method86(var140);
                    var142.field2558 = 4;
                    var142.field2528 = var140;
                    var142.field2578 = var143.field1028;
                    var142.field2579 = var143.field1031;
                    var142.field2581 = var143.field1027 * 100 / var141;
                    method2761(var142);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 115) {
                int var145 = field504.method2118();
                if (var145 == 65535) {
                    var145 = -1;
                }
                int var146 = field504.method2126();
                int var147 = field504.method2118();
                if (var147 == 65535) {
                    var147 = -1;
                }
                int var148 = field504.method2106();
                for (int var149 = var147; var149 <= var145; var149++) {
                    long var150 = ((long) var148 << 32) + (long) var149;
                    class189 var152 = field452.method3140(var150);
                    if (var152 != null) {
                        var152.method3259();
                    }
                    field452.method3137(new class182(var146), var150);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 84) {
                int var153 = field504.method2083();
                int var154 = field504.method2083();
                int var155 = field504.method2083();
                int var156 = field504.method2083();
                field495[var153] = true;
                field496[var153] = var154;
                field497[var153] = var155;
                field431[var153] = var156;
                field302[var153] = 0;
                field289 = -1;
                return true;
            }
            if (field289 == 22) {
                String var157 = field504.method2091();
                Object[] var158 = new Object[var157.length() + 1];
                for (int var159 = var157.length() - 1; var159 >= 0; var159--) {
                    if (var157.charAt(var159) == 's') {
                        var158[var159 + 1] = field504.method2091();
                    } else {
                        var158[var159 + 1] = Integer.valueOf(field504.method2117());
                    }
                }
                var158[0] = Integer.valueOf(field504.method2117());
                class1 var160 = new class1();
                var160.field15 = var158;
                class33.method124(var160, 200000);
                field289 = -1;
                return true;
            }
            if (field289 == 246) {
                field494 = false;
                for (int var161 = 0; var161 < 5; var161++) {
                    field495[var161] = false;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 1) {
                int var162 = field504.method2117();
                int var163 = field504.method2164();
                class155 var164 = class155.method2787(var162);
                if (var164.field2558 != 2 || var164.field2528 != var163) {
                    var164.field2558 = 2;
                    var164.field2528 = var163;
                    method2761(var164);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 49) {
                int var165 = field504.method2126();
                int var166 = field504.method2116();
                int var167 = var166 >> 10 & 0x1F;
                int var168 = var166 >> 5 & 0x1F;
                int var169 = var166 & 0x1F;
                int var170 = (var169 << 3) + (var167 << 19) + (var168 << 11);
                class155 var171 = class155.method2787(var165);
                if (var171.field2555 != var170) {
                    var171.field2555 = var170;
                    method2761(var171);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 53) {
                field260 = field504.method2116() * 30;
                field445 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 233) {
                while (field504.field1824 < field288) {
                    int var172 = field504.method2083();
                    boolean var173 = (var172 & 0x1) == 1;
                    String var174 = field504.method2091();
                    String var175 = field504.method2091();
                    field504.method2091();
                    for (int var176 = 0; var176 < field381; var176++) {
                        class8 var177 = field505[var176];
                        if (var173) {
                            if (var175.equals(var177.field123)) {
                                var177.field123 = var174;
                                var177.field120 = var175;
                                var174 = null;
                                break;
                            }
                        } else if (var174.equals(var177.field123)) {
                            var177.field123 = var174;
                            var177.field120 = var175;
                            var174 = null;
                            break;
                        }
                    }
                    if (var174 != null && field381 < 400) {
                        class8 var178 = new class8();
                        field505[field381] = var178;
                        var178.field123 = var174;
                        var178.field120 = var175;
                        field381++;
                    }
                }
                field441 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 136) {
                int var179 = field504.method2117();
                int var180 = field504.method2164();
                class155 var181 = class155.method2787(var179);
                if (var181 != null && var181.field2540 == 0) {
                    if (var180 > var181.field2630 - var181.field2554) {
                        var180 = var181.field2630 - var181.field2554;
                    }
                    if (var180 < 0) {
                        var180 = 0;
                    }
                    if (var181.field2552 != var180) {
                        var181.field2552 = var180;
                        method2761(var181);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 82) {
                int var182 = field504.method2083();
                if (field504.method2083() == 0) {
                    field368[var182] = new class201();
                    field504.field1824 += 18;
                } else {
                    field504.field1824--;
                    field368[var182] = new class201(field504, false);
                }
                field343 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 98) {
                int var183 = field288 + field504.field1824;
                int var184 = field504.method2263();
                int var185 = field504.method2263();
                if (field421 != var184) {
                    field421 = var184;
                    method1744(field421);
                    class33.method2431(field421);
                    for (int var186 = 0; var186 < 100; var186++) {
                        field470[var186] = true;
                    }
                }
                while (var185-- > 0) {
                    int var187 = field504.method2117();
                    int var188 = field504.method2263();
                    int var189 = field504.method2083();
                    class4 var190 = (class4) field245.method3140((long) var187);
                    if (var190 != null && var190.field60 != var188) {
                        method147(var190, true);
                        var190 = null;
                    }
                    if (var190 == null) {
                        class4 var191 = new class4();
                        var191.field60 = var188;
                        var191.field55 = var189;
                        field245.method3137(var191, (long) var187);
                        method1744(var188);
                        class33.method2431(var188);
                        class155 var192 = class155.method2787(var187);
                        if (var192 != null) {
                            method2761(var192);
                        }
                        if (field413 != null) {
                            method2761(field413);
                            field413 = null;
                        }
                        method497();
                        if (field421 != -1) {
                            int var193 = field421;
                            if (class155.method1264(var193)) {
                                method1933(Statics.field2565[var193], 1);
                            }
                        }
                        var190 = var191;
                    }
                    var190.field54 = true;
                }
                for (class4 var195 = (class4) field245.method3139(); var195 != null; var195 = (class4) field245.method3146()) {
                    if (var195.field54) {
                        var195.field54 = false;
                    } else {
                        method147(var195, true);
                    }
                }
                field452 = new class177(512);
                while (field504.field1824 < var183) {
                    int var196 = field504.method2117();
                    int var197 = field504.method2263();
                    int var198 = field504.method2263();
                    int var199 = field504.method2117();
                    for (int var200 = var197; var200 <= var198; var200++) {
                        long var201 = ((long) var196 << 32) + (long) var200;
                        field452.method3137(new class182(var199), var201);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 249) {
                int var203 = field504.method2127();
                String var204 = field504.method2091();
                class155 var205 = class155.method2787(var203);
                if (!var204.equals(var205.field2586)) {
                    var205.field2586 = var204;
                    method2761(var205);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 206) {
                method2762(true);
                field289 = -1;
                return true;
            }
            if (field289 == 47) {
                field372 = field504.method2083();
                field289 = -1;
                return true;
            }
            if (field289 == 200) {
                int var206 = field504.method2117();
                int var207 = field504.method2116();
                class155 var208 = class155.method2787(var206);
                if (var208.field2558 != 1 || var208.field2528 != var207) {
                    var208.field2558 = 1;
                    var208.field2528 = var207;
                    method2761(var208);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 19) {
                int var209 = field504.method2227();
                int var210 = field504.method2227();
                String var211 = field504.method2091();
                if (var210 >= 1 && var210 <= 8) {
                    if (var211.equalsIgnoreCase("null")) {
                        var211 = null;
                    }
                    field376[var210 - 1] = var211;
                    field377[var210 - 1] = var209 == 0;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 70) {
                field501 = 1;
                field441 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 170) {
                int var212 = field504.method2118();
                int var213 = field504.method2126();
                int var214 = field504.method2116();
                int var215 = field504.method2164();
                class155 var216 = class155.method2787(var213);
                if (var216.field2578 != var212 || var216.field2579 != var214 || var216.field2581 != var215) {
                    var216.field2578 = var212;
                    var216.field2579 = var214;
                    var216.field2581 = var215;
                    method2761(var216);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 76) {
                int var217 = field504.method2117();
                class4 var218 = (class4) field245.method3140((long) var217);
                if (var218 != null) {
                    method147(var218, true);
                }
                if (field413 != null) {
                    method2761(field413);
                    field413 = null;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 182) {
                method1554();
                field414 = field504.method2083();
                field445 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 102) {
                String var219 = field504.method2091();
                long var220 = (long) field504.method2263();
                long var222 = (long) field504.method2260();
                class140[] var224 = new class140[] { class140.field2109, class140.field2098, class140.field2099, class140.field2101, class140.field2100 };
                class140 var225 = (class140) class100.method1742(var224, field504.method2083());
                long var226 = (var220 << 32) + var222;
                boolean var228 = false;
                for (int var229 = 0; var229 < 100; var229++) {
                    if (field467[var229] == var226) {
                        var228 = true;
                        break;
                    }
                }
                if (method2391(var219)) {
                    var228 = true;
                }
                if (!var228 && field364 == 0) {
                    field467[field468] = var226;
                    field468 = (field468 + 1) % 100;
                    class111 var230 = field504;
                    String var234;
                    try {
                        int var231 = var230.method2215();
                        if (var231 > 32767) {
                            var231 = 32767;
                        }
                        byte[] var232 = new byte[var231];
                        var230.field1824 += Statics.field2953.method2018(var230.field1828, var230.field1824, var232, 0, var231);
                        String var233 = class213.method549(var232, 0, var231);
                        var234 = var233;
                    } catch (Exception var298) {
                        var234 = "Cabbage";
                    }
                    String var237 = class204.method3360(Statics.method550(var234));
                    byte var238;
                    if (var225.field2105) {
                        var238 = 7;
                    } else {
                        var238 = 3;
                    }
                    if (var225.field2107 == -1) {
                        class10.method995(var238, var219, var237);
                    } else {
                        class10.method995(var238, class2.method2524(var225.field2107) + var219, var237);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 159) {
                Statics.field1878 = class119.method2352(field504.method2083());
                field289 = -1;
                return true;
            }
            if (field289 == 56) {
                int var239 = field504.method2263();
                int var240 = field504.method2117();
                class157.field2675[var239] = var240;
                if (class157.field2672[var239] != var240) {
                    class157.field2672[var239] = var240;
                    method134(var239);
                }
                field434[++field435 - 1 & 0x1F] = var239;
                field289 = -1;
                return true;
            }
            if (field289 == 74) {
                int var241 = field504.method2118();
                field421 = var241;
                method1744(var241);
                class33.method2431(field421);
                for (int var242 = 0; var242 < 100; var242++) {
                    field470[var242] = true;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 216) {
                class23 var243 = new class23();
                var243.field574 = field504.method2091();
                var243.field578 = field504.method2263();
                int var244 = field504.method2117();
                var243.field572 = var244;
                method88(45);
                Statics.field550.method2537();
                Statics.field550 = null;
                class29.method2612(var243);
                field289 = -1;
                return false;
            }
            if (field289 == 126) {
                class111 var245 = field504;
                int var246 = field288;
                class191 var247 = new class191();
                var247.field2899 = var245.method2083();
                var247.field2892 = var245.method2117();
                var247.field2893 = new int[var247.field2899];
                var247.field2894 = new int[var247.field2899];
                var247.field2895 = new Field[var247.field2899];
                var247.field2898 = new int[var247.field2899];
                var247.field2891 = new Method[var247.field2899];
                var247.field2897 = new byte[var247.field2899][][];
                for (int var248 = 0; var248 < var247.field2899; var248++) {
                    try {
                        int var249 = var245.method2083();
                        if (var249 == 0 || var249 == 1 || var249 == 2) {
                            String var250 = var245.method2091();
                            String var251 = var245.method2091();
                            int var252 = 0;
                            if (var249 == 1) {
                                var252 = var245.method2117();
                            }
                            var247.field2893[var248] = var249;
                            var247.field2898[var248] = var252;
                            if (class192.method2846(var250).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var247.field2895[var248] = class192.method2846(var250).getDeclaredField(var251);
                        } else if (var249 == 3 || var249 == 4) {
                            String var253 = var245.method2091();
                            String var254 = var245.method2091();
                            int var255 = var245.method2083();
                            String[] var256 = new String[var255];
                            for (int var257 = 0; var257 < var255; var257++) {
                                var256[var257] = var245.method2091();
                            }
                            String var258 = var245.method2091();
                            byte[][] var259 = new byte[var255][];
                            if (var249 == 3) {
                                for (int var260 = 0; var260 < var255; var260++) {
                                    int var261 = var245.method2117();
                                    var259[var260] = new byte[var261];
                                    var245.method2094(var259[var260], 0, var261);
                                }
                            }
                            var247.field2893[var248] = var249;
                            Class[] var262 = new Class[var255];
                            for (int var263 = 0; var263 < var255; var263++) {
                                var262[var263] = class192.method2846(var256[var263]);
                            }
                            Class var264 = class192.method2846(var258);
                            if (class192.method2846(var253).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var265 = class192.method2846(var253).getDeclaredMethods();
                            Method[] var266 = var265;
                            for (int var267 = 0; var267 < var266.length; var267++) {
                                Method var268 = var266[var267];
                                if (var268.getName().equals(var254)) {
                                    Class[] var269 = var268.getParameterTypes();
                                    if (var262.length == var269.length) {
                                        boolean var270 = true;
                                        for (int var271 = 0; var271 < var262.length; var271++) {
                                            if (var262[var271] != var269[var271]) {
                                                var270 = false;
                                                break;
                                            }
                                        }
                                        if (var270 && var264 == var268.getReturnType()) {
                                            var247.field2891[var248] = var268;
                                        }
                                    }
                                }
                            }
                            var247.field2897[var248] = var259;
                        }
                    } catch (ClassNotFoundException var302) {
                        var247.field2894[var248] = -1;
                    } catch (SecurityException var303) {
                        var247.field2894[var248] = -2;
                    } catch (NullPointerException var304) {
                        var247.field2894[var248] = -3;
                    } catch (Exception var305) {
                        var247.field2894[var248] = -4;
                    } catch (Throwable var306) {
                        var247.field2894[var248] = -5;
                    }
                }
                class192.field2900.method3212(var247);
                field289 = -1;
                return true;
            }
            if (field289 == 121) {
                method2762(false);
                field289 = -1;
                return true;
            }
            if (field289 == 99) {
                Statics.field113 = field504.method2108();
                Statics.field1917 = field504.method2083();
                for (int var277 = Statics.field113; var277 < Statics.field113 + 8; var277++) {
                    for (int var278 = Statics.field1917; var278 < Statics.field1917 + 8; var278++) {
                        if (field349[Statics.field1121][var277][var278] != null) {
                            field349[Statics.field1121][var277][var278] = null;
                            method544(var277, var278);
                        }
                    }
                }
                for (class15 var279 = (class15) field380.method3174(); var279 != null; var279 = (class15) field380.method3176()) {
                    if (var279.field192 >= Statics.field113 && var279.field192 < Statics.field113 + 8 && var279.field193 >= Statics.field1917 && var279.field193 < Statics.field1917 + 8 && Statics.field1121 == var279.field190) {
                        var279.field198 = 0;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 207) {
                field464 = field504.method2083();
                field465 = field504.method2083();
                field289 = -1;
                return true;
            }
            if (field289 == 253) {
                int var280 = field504.method2164();
                int var281 = field504.method2118();
                int var282 = field504.method2126();
                class155 var283 = class155.method2787(var282);
                var283.field2582 = (var280 << 16) + var281;
                field289 = -1;
                return true;
            }
            if (field289 == 239) {
                Statics.field113 = field504.method2227();
                Statics.field1917 = field504.method2083();
                field289 = -1;
                return true;
            }
            if (field289 == 44) {
                String var284 = field504.method2091();
                int var285 = field504.method2263();
                byte var286 = field504.method2173();
                boolean var287 = false;
                if (var286 == -128) {
                    var287 = true;
                }
                if (var287) {
                    if (Statics.field825 == 0) {
                        field289 = -1;
                        return true;
                    }
                    boolean var288 = false;
                    int var289;
                    for (var289 = 0; var289 < Statics.field825 && (!Statics.field1296[var289].field566.equals(var284) || Statics.field1296[var289].field565 != var285); var289++) {
                    }
                    if (var289 < Statics.field825) {
                        while (var289 < Statics.field825 - 1) {
                            Statics.field1296[var289] = Statics.field1296[var289 + 1];
                            var289++;
                        }
                        Statics.field825--;
                        Statics.field1296[Statics.field825] = null;
                    }
                } else {
                    field504.method2091();
                    class22 var290 = new class22();
                    var290.field566 = var284;
                    var290.field563 = class212.method2544(var290.field566, Statics.field2061);
                    var290.field565 = var285;
                    var290.field570 = var286;
                    int var291;
                    for (var291 = Statics.field825 - 1; var291 >= 0; var291--) {
                        int var292 = Statics.field1296[var291].field563.compareTo(var290.field563);
                        if (var292 == 0) {
                            Statics.field1296[var291].field565 = var285;
                            Statics.field1296[var291].field570 = var286;
                            if (var284.equals(Statics.field2031.field39)) {
                                Statics.field151 = var286;
                            }
                            field442 = field433;
                            field289 = -1;
                            return true;
                        }
                        if (var292 < 0) {
                            break;
                        }
                    }
                    if (Statics.field825 >= Statics.field1296.length) {
                        field289 = -1;
                        return true;
                    }
                    for (int var293 = Statics.field825 - 1; var293 > var291; var293--) {
                        Statics.field1296[var293 + 1] = Statics.field1296[var293];
                    }
                    if (Statics.field825 == 0) {
                        Statics.field1296 = new class22[100];
                    }
                    Statics.field1296[var291 + 1] = var290;
                    Statics.field825++;
                    if (var284.equals(Statics.field2031.field39)) {
                        Statics.field151 = var286;
                    }
                }
                field442 = field433;
                field289 = -1;
                return true;
            }
            if (field289 == 72) {
                Statics.field113 = field504.method2107();
                Statics.field1917 = field504.method2083();
                while (field504.field1824 < field288) {
                    field289 = field504.method2083();
                    method2022();
                }
                field289 = -1;
                return true;
            }
            class137.method2362("" + field289 + class2.field22 + field294 + class2.field22 + field295 + class2.field22 + field288, (Throwable) null);
            method2640();
        } catch (IOException var307) {
            method21();
        } catch (Exception var308) {
            String var296 = "" + field289 + class2.field22 + field294 + class2.field22 + field295 + class2.field22 + field288 + class2.field22 + (Statics.field86 + Statics.field2031.field747[0]) + class2.field22 + (Statics.field223 + Statics.field2031.field790[0]) + class2.field22;
            for (int var297 = 0; var297 < field288 && var297 < 50; var297++) {
                var296 = var296 + field504.field1828[var297] + class2.field22;
            }
            class137.method2362(var296, var308);
            method2640();
        }
        return true;
    }

    @ObfuscatedName("cu.bt(I)V")
    public static final void method2022() {
        if (field289 == 205) {
            int var0 = field504.method2227();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field270[var1];
            int var4 = field504.method2263();
            int var5 = field504.method2108();
            int var6 = (var5 >> 4 & 0x7) + Statics.field113;
            int var7 = (var5 & 0x7) + Statics.field1917;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                method2856(Statics.field1121, var6, var7, var3, var4, var1, var2, 0, -1);
            }
        } else if (field289 == 178) {
            int var8 = field504.method2083();
            int var9 = (var8 >> 4 & 0x7) + Statics.field113;
            int var10 = (var8 & 0x7) + Statics.field1917;
            int var11 = field504.method2263();
            int var12 = field504.method2263();
            int var13 = field504.method2263();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class180 var14 = field349[Statics.field1121][var9][var10];
                if (var14 != null) {
                    for (class26 var15 = (class26) var14.method3174(); var15 != null; var15 = (class26) var14.method3176()) {
                        if ((var11 & 0x7FFF) == var15.field607 && var15.field608 == var12) {
                            var15.field608 = var13;
                            break;
                        }
                    }
                    method544(var9, var10);
                }
            }
        } else {
            if (field289 == 28) {
                int var16 = field504.method2083();
                int var17 = (var16 >> 4 & 0x7) + Statics.field113;
                int var18 = (var16 & 0x7) + Statics.field1917;
                int var19 = field504.method2118();
                int var20 = field504.method2164();
                byte var21 = field504.method2110();
                int var22 = field504.method2164();
                int var23 = field504.method2227();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field270[var24];
                byte var27 = field504.method2111();
                byte var28 = field504.method2112();
                int var29 = field504.method2263();
                byte var30 = field504.method2173();
                class3 var31;
                if (field371 == var20) {
                    var31 = Statics.field2031;
                } else {
                    var31 = field365[var20];
                }
                if (var31 != null) {
                    class37 var32 = class37.method3266(var22);
                    int var33;
                    int var34;
                    if (var25 == 1 || var25 == 3) {
                        var33 = var32.field866;
                        var34 = var32.field865;
                    } else {
                        var33 = var32.field865;
                        var34 = var32.field866;
                    }
                    int var35 = (var33 >> 1) + var17;
                    int var36 = (var33 + 1 >> 1) + var17;
                    int var37 = (var34 >> 1) + var18;
                    int var38 = (var34 + 1 >> 1) + var18;
                    int[][] var39 = class6.field76[Statics.field1121];
                    int var40 = var39[var35][var37] + var39[var36][var37] + var39[var35][var38] + var39[var36][var38] >> 2;
                    int var41 = (var17 << 7) + (var33 << 6);
                    int var42 = (var18 << 7) + (var34 << 6);
                    class99 var43 = var32.method604(var24, var25, var39, var41, var40, var42);
                    if (var43 != null) {
                        method2856(Statics.field1121, var17, var18, var26, -1, 0, 0, var19 + 1, var29 + 1);
                        var31.field34 = field410 + var19;
                        var31.field35 = field410 + var29;
                        var31.field44 = var43;
                        var31.field41 = var17 * 128 + var33 * 64;
                        var31.field50 = var18 * 128 + var34 * 64;
                        var31.field42 = var40;
                        if (var28 > var21) {
                            byte var44 = var28;
                            var28 = var21;
                            var21 = var44;
                        }
                        if (var30 > var27) {
                            byte var45 = var30;
                            var30 = var27;
                            var27 = var45;
                        }
                        var31.field40 = var17 + var28;
                        var31.field47 = var17 + var21;
                        var31.field46 = var18 + var30;
                        var31.field48 = var18 + var27;
                    }
                }
            }
            if (field289 == 77) {
                int var46 = field504.method2227();
                int var47 = (var46 >> 4 & 0x7) + Statics.field113;
                int var48 = (var46 & 0x7) + Statics.field1917;
                int var49 = field504.method2118();
                int var50 = field504.method2116();
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    class26 var51 = new class26();
                    var51.field607 = var49;
                    var51.field608 = var50;
                    if (field349[Statics.field1121][var47][var48] == null) {
                        field349[Statics.field1121][var47][var48] = new class180();
                    }
                    field349[Statics.field1121][var47][var48].method3169(var51);
                    method544(var47, var48);
                }
            } else if (field289 == 143) {
                int var52 = field504.method2083();
                int var53 = (var52 >> 4 & 0x7) + Statics.field113;
                int var54 = (var52 & 0x7) + Statics.field1917;
                int var55 = field504.method2263();
                int var56 = field504.method2083();
                int var57 = field504.method2263();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    class27 var60 = new class27(var55, Statics.field1121, var58, var59, method126(var58, var59, Statics.field1121) - var56, var57, field410);
                    field383.method3169(var60);
                }
            } else if (field289 == 195) {
                int var61 = field504.method2108();
                int var62 = (var61 >> 4 & 0x7) + Statics.field113;
                int var63 = (var61 & 0x7) + Statics.field1917;
                int var64 = field504.method2118();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    class180 var65 = field349[Statics.field1121][var62][var63];
                    if (var65 != null) {
                        for (class26 var66 = (class26) var65.method3174(); var66 != null; var66 = (class26) var65.method3176()) {
                            if ((var64 & 0x7FFF) == var66.field607) {
                                var66.method3259();
                                break;
                            }
                        }
                        if (var65.method3174() == null) {
                            field349[Statics.field1121][var62][var63] = null;
                        }
                        method544(var62, var63);
                    }
                }
            } else if (field289 == 25) {
                int var67 = field504.method2263();
                int var68 = field504.method2108();
                int var69 = (var68 >> 4 & 0x7) + Statics.field113;
                int var70 = (var68 & 0x7) + Statics.field1917;
                int var71 = field504.method2083();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field270[var72];
                if (var69 >= 0 && var70 >= 0 && var69 < 103 && var70 < 103) {
                    if (var74 == 0) {
                        class81 var75 = Statics.field303.method1582(Statics.field1121, var69, var70);
                        if (var75 != null) {
                            int var76 = var75.field1423 >> 14 & 0x7FFF;
                            if (var72 == 2) {
                                var75.field1422 = new class11(var76, 2, var73 + 4, Statics.field1121, var69, var70, var67, false, var75.field1422);
                                var75.field1418 = new class11(var76, 2, var73 + 1 & 0x3, Statics.field1121, var69, var70, var67, false, var75.field1418);
                            } else {
                                var75.field1422 = new class11(var76, var72, var73, Statics.field1121, var69, var70, var67, false, var75.field1422);
                            }
                        }
                    }
                    if (var74 == 1) {
                        class88 var77 = Statics.field303.method1583(Statics.field1121, var69, var70);
                        if (var77 != null) {
                            int var78 = var77.field1489 >> 14 & 0x7FFF;
                            if (var72 == 4 || var72 == 5) {
                                var77.field1497 = new class11(var78, 4, var73, Statics.field1121, var69, var70, var67, false, var77.field1497);
                            } else if (var72 == 6) {
                                var77.field1497 = new class11(var78, 4, var73 + 4, Statics.field1121, var69, var70, var67, false, var77.field1497);
                            } else if (var72 == 7) {
                                var77.field1497 = new class11(var78, 4, (var73 + 2 & 0x3) + 4, Statics.field1121, var69, var70, var67, false, var77.field1497);
                            } else if (var72 == 8) {
                                var77.field1497 = new class11(var78, 4, var73 + 4, Statics.field1121, var69, var70, var67, false, var77.field1497);
                                var77.field1495 = new class11(var78, 4, (var73 + 2 & 0x3) + 4, Statics.field1121, var69, var70, var67, false, var77.field1495);
                            }
                        }
                    }
                    if (var74 == 2) {
                        class92 var79 = Statics.field303.method1610(Statics.field1121, var69, var70);
                        if (var72 == 11) {
                            var72 = 10;
                        }
                        if (var79 != null) {
                            var79.field1547 = new class11(var79.field1553 >> 14 & 0x7FFF, var72, var73, Statics.field1121, var69, var70, var67, false, var79.field1547);
                        }
                    }
                    if (var74 == 3) {
                        class87 var80 = Statics.field303.method1585(Statics.field1121, var69, var70);
                        if (var80 != null) {
                            var80.field1483 = new class11(var80.field1485 >> 14 & 0x7FFF, 22, var73, Statics.field1121, var69, var70, var67, false, var80.field1483);
                        }
                    }
                }
            } else if (field289 == 23) {
                int var81 = field504.method2227();
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field270[var82];
                int var85 = field504.method2107();
                int var86 = (var85 >> 4 & 0x7) + Statics.field113;
                int var87 = (var85 & 0x7) + Statics.field1917;
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    method2856(Statics.field1121, var86, var87, var84, -1, var82, var83, 0, -1);
                }
            } else if (field289 == 235) {
                int var88 = field504.method2083();
                int var89 = (var88 >> 4 & 0x7) + Statics.field113;
                int var90 = (var88 & 0x7) + Statics.field1917;
                int var91 = var89 + field504.method2173();
                int var92 = var90 + field504.method2173();
                int var93 = field504.method2214();
                int var94 = field504.method2263();
                int var95 = field504.method2083() * 4;
                int var96 = field504.method2083() * 4;
                int var97 = field504.method2263();
                int var98 = field504.method2263();
                int var99 = field504.method2083();
                int var100 = field504.method2083();
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var94 != 65535) {
                    int var101 = var89 * 128 + 64;
                    int var102 = var90 * 128 + 64;
                    int var103 = var91 * 128 + 64;
                    int var104 = var92 * 128 + 64;
                    class7 var105 = new class7(var94, Statics.field1121, var101, var102, method126(var101, var102, Statics.field1121) - var95, field410 + var97, field410 + var98, var99, var100, var93, var96);
                    var105.method75(var103, var104, method126(var103, var104, Statics.field1121) - var96, field410 + var97);
                    field382.method3169(var105);
                }
            } else if (field289 == 95) {
                int var106 = field504.method2083();
                int var107 = (var106 >> 4 & 0x7) + Statics.field113;
                int var108 = (var106 & 0x7) + Statics.field1917;
                int var109 = field504.method2263();
                int var110 = field504.method2083();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = field504.method2083();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var114 = var111 + 1;
                    if (Statics.field2031.field747[0] >= var107 - var114 && Statics.field2031.field747[0] <= var107 + var114 && Statics.field2031.field790[0] >= var108 - var114 && Statics.field2031.field790[0] <= var108 + var114 && field430 != 0 && var112 > 0 && field397 < 50) {
                        field489[field397] = var109;
                        field287[field397] = var112;
                        field491[field397] = var113;
                        field493[field397] = null;
                        field306[field397] = (var107 << 16) + (var108 << 8) + var111;
                        field397++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.bg(IIIIIIIIIB)V")
    public static final void method2856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field380.method3174(); var10 != null; var10 = (class15) field380.method3176()) {
            if (var10.field190 == arg0 && var10.field192 == arg1 && var10.field193 == arg2 && var10.field191 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field190 = arg0;
            var9.field191 = arg3;
            var9.field192 = arg1;
            var9.field193 = arg2;
            method2305(var9);
            field380.method3169(var9);
        }
        var9.field201 = arg4;
        var9.field199 = arg5;
        var9.field194 = arg6;
        var9.field200 = arg7;
        var9.field198 = arg8;
    }

    @ObfuscatedName("dn.bx(Ls;B)V")
    public static final void method2305(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field191 == 0) {
            var1 = Statics.field303.method1586(arg0.field190, arg0.field192, arg0.field193);
        }
        if (arg0.field191 == 1) {
            var1 = Statics.field303.method1607(arg0.field190, arg0.field192, arg0.field193);
        }
        if (arg0.field191 == 2) {
            var1 = Statics.field303.method1588(arg0.field190, arg0.field192, arg0.field193);
        }
        if (arg0.field191 == 3) {
            var1 = Statics.field303.method1589(arg0.field190, arg0.field192, arg0.field193);
        }
        if (var1 != 0) {
            int var5 = Statics.field303.method1590(arg0.field190, arg0.field192, arg0.field193, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field208 = var2;
        arg0.field196 = var3;
        arg0.field195 = var4;
    }

    @ObfuscatedName("a.bk(B)V")
    public static final void method509() {
        for (class15 var0 = (class15) field380.method3174(); var0 != null; var0 = (class15) field380.method3176()) {
            if (var0.field198 > 0) {
                var0.field198--;
            }
            if (var0.field198 != 0) {
                if (var0.field200 > 0) {
                    var0.field200--;
                }
                if (var0.field200 == 0 && var0.field192 >= 1 && var0.field193 >= 1 && var0.field192 <= 102 && var0.field193 <= 102 && (var0.field201 < 0 || class6.method125(var0.field201, var0.field199))) {
                    method2389(var0.field190, var0.field191, var0.field192, var0.field193, var0.field201, var0.field194, var0.field199);
                    var0.field200 = -1;
                    if (var0.field208 == var0.field201 && var0.field208 == -1) {
                        var0.method3259();
                    } else if (var0.field208 == var0.field201 && var0.field195 == var0.field194 && var0.field199 == var0.field196) {
                        var0.method3259();
                    }
                }
            } else if (var0.field208 < 0 || class6.method125(var0.field208, var0.field196)) {
                method2389(var0.field190, var0.field191, var0.field192, var0.field193, var0.field208, var0.field195, var0.field196);
                var0.method3259();
            }
        }
    }

    @ObfuscatedName("du.by(IIIIIIII)V")
    public static final void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field247 && Statics.field1121 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field303.method1586(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field303.method1607(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field303.method1588(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field303.method1589(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field303.method1590(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field303.method1560(arg0, arg2, arg3);
                class37 var15 = class37.method3266(var12);
                if (var15.field879 != 0) {
                    field304[arg0].method3489(arg2, arg3, var13, var14, var15.field868);
                }
            }
            if (arg1 == 1) {
                Statics.field303.method1696(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field303.method1579(arg0, arg2, arg3);
                class37 var16 = class37.method3266(var12);
                if (var16.field865 + arg2 > 103 || var16.field865 + arg3 > 103 || var16.field866 + arg2 > 103 || var16.field866 + arg3 > 103) {
                    return;
                }
                if (var16.field879 != 0) {
                    field304[arg0].method3490(arg2, arg3, var16.field865, var16.field866, var14, var16.field868);
                }
            }
            if (arg1 == 3) {
                Statics.field303.method1580(arg0, arg2, arg3);
                class37 var17 = class37.method3266(var12);
                if (var17.field879 == 1) {
                    field304[arg0].method3482(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field83[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method530(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field303, field304[arg0]);
    }

    @ObfuscatedName("aq.br(III)V")
    public static final void method544(int arg0, int arg1) {
        class180 var2 = field349[Statics.field1121][arg0][arg1];
        if (var2 == null) {
            Statics.field303.method1581(Statics.field1121, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3174(); var6 != null; var6 = (class26) var2.method3176()) {
            class46 var7 = class46.method86(var6.field607);
            long var8 = (long) var7.field1061;
            if (var7.field1026 == 1) {
                var8 = (long) (var6.field608 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field303.method1581(Statics.field1121, arg0, arg1);
            return;
        }
        var2.method3170(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3174(); var12 != null; var12 = (class26) var2.method3176()) {
            if (var5.field607 != var12.field607) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field607 != var12.field607 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field303.method1625(Statics.field1121, arg0, arg1, method126(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1121), var5, var13, var10, var11);
    }

    @ObfuscatedName("ab.be(S)V")
    public static final void method856() {
        field373 = 0;
        field268 = 0;
        method2795();
        int var0 = field504.method2315(8);
        if (var0 < field255) {
            for (int var1 = var0; var1 < field255; var1++) {
                field246[++field373 - 1] = field367[var1];
            }
        }
        if (var0 > field255) {
            throw new RuntimeException("");
        }
        field255 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field367[var2];
            class3 var4 = field365[var3];
            int var5 = field504.method2315(1);
            if (var5 == 0) {
                field367[++field255 - 1] = var3;
                var4.field783 = field410;
            } else {
                int var6 = field504.method2315(2);
                if (var6 == 0) {
                    field367[++field255 - 1] = var3;
                    var4.field783 = field410;
                    field369[++field268 - 1] = var3;
                } else if (var6 == 1) {
                    field367[++field255 - 1] = var3;
                    var4.field783 = field410;
                    int var7 = field504.method2315(3);
                    var4.method563(var7, false);
                    int var8 = field504.method2315(1);
                    if (var8 == 1) {
                        field369[++field268 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field367[++field255 - 1] = var3;
                    var4.field783 = field410;
                    int var9 = field504.method2315(3);
                    var4.method563(var9, true);
                    int var10 = field504.method2315(3);
                    var4.method563(var10, true);
                    int var11 = field504.method2315(1);
                    if (var11 == 1) {
                        field369[++field268 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field246[++field373 - 1] = var3;
                }
            }
        }
        method1285();
        for (int var12 = 0; var12 < field268; var12++) {
            int var13 = field369[var12];
            class3 var14 = field365[var13];
            int var15 = field504.method2083();
            if ((var15 & 0x4) != 0) {
                var15 += field504.method2083() << 8;
            }
            method599(var13, var14, var15);
        }
        for (int var16 = 0; var16 < field373; var16++) {
            int var17 = field246[var16];
            if (field410 != field365[var17].field783) {
                field365[var17] = null;
            }
        }
        if (field288 != field504.field1824) {
            throw new RuntimeException(field504.field1824 + class2.field22 + field288);
        }
        for (int var18 = 0; var18 < field255; var18++) {
            if (field365[field367[var18]] == null) {
                throw new RuntimeException(var18 + class2.field22 + field255);
            }
        }
    }

    @ObfuscatedName("ec.bm(B)V")
    public static final void method2795() {
        field504.method2334();
        int var0 = field504.method2315(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field504.method2315(2);
        if (var1 == 0) {
            field369[++field268 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field504.method2315(3);
            Statics.field2031.method563(var2, false);
            int var3 = field504.method2315(1);
            if (var3 == 1) {
                field369[++field268 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field504.method2315(3);
            Statics.field2031.method563(var4, true);
            int var5 = field504.method2315(3);
            Statics.field2031.method563(var5, true);
            int var6 = field504.method2315(1);
            if (var6 == 1) {
                field369[++field268 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field504.method2315(7);
            int var8 = field504.method2315(1);
            int var9 = field504.method2315(1);
            if (var9 == 1) {
                field369[++field268 - 1] = 2047;
            }
            int var10 = field504.method2315(7);
            Statics.field1121 = field504.method2315(2);
            Statics.field2031.method562(var10, var7, var8 == 1);
        }
    }

    @ObfuscatedName("bo.bl(B)V")
    public static final void method1285() {
        while (true) {
            if (field504.method2317(field288) >= 11) {
                int var0 = field504.method2315(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field365[var0] == null) {
                        field365[var0] = new class3();
                        if (field370[var0] != null) {
                            field365[var0].method13(field370[var0]);
                        }
                        var1 = true;
                    }
                    field367[++field255 - 1] = var0;
                    class3 var2 = field365[var0];
                    var2.field783 = field410;
                    int var3 = field504.method2315(1);
                    int var4 = field504.method2315(1);
                    if (var4 == 1) {
                        field369[++field268 - 1] = var0;
                    }
                    int var5 = field504.method2315(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field504.method2315(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field425[field504.method2315(3)];
                    if (var1) {
                        var2.field737 = var2.field785 = var7;
                    }
                    var2.method562(Statics.field2031.field747[0] + var6, Statics.field2031.field790[0] + var5, var3 == 1);
                    continue;
                }
            }
            field504.method2316();
            return;
        }
    }

    @ObfuscatedName("an.bz(ILz;II)V")
    public static final void method599(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            int var3 = field504.method2118();
            int var4 = field504.method2108();
            arg1.method565(var3, var4, field410);
            arg1.field757 = field410 + 300;
            arg1.field758 = field504.method2083();
            arg1.field759 = field504.method2083();
        }
        if ((arg2 & 0x20) != 0) {
            int var5 = field504.method2118();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = field504.method2083();
            method2429(arg1, var5, var6);
        }
        if ((arg2 & 0x1) != 0) {
            int var7 = field504.method2263();
            int var8 = field504.method2227();
            arg1.method565(var7, var8, field410);
            arg1.field757 = field410 + 300;
            arg1.field758 = field504.method2107();
            arg1.field759 = field504.method2227();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field776 = field504.method2108();
            arg1.field778 = field504.method2108();
            arg1.field744 = field504.method2107();
            arg1.field743 = field504.method2227();
            arg1.field780 = field504.method2263() + field410;
            arg1.field781 = field504.method2164() + field410;
            arg1.field782 = field504.method2107();
            arg1.field761 = 1;
            arg1.field735 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field771 = field504.method2118();
            int var9 = field504.method2117();
            arg1.field739 = var9 >> 16;
            arg1.field779 = (var9 & 0xFFFF) + field410;
            arg1.field772 = 0;
            arg1.field773 = 0;
            if (arg1.field779 > field410) {
                arg1.field772 = -1;
            }
            if (arg1.field771 == 65535) {
                arg1.field771 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var10 = field504.method2118();
            class140[] var11 = new class140[] { class140.field2109, class140.field2098, class140.field2099, class140.field2101, class140.field2100 };
            class140 var12 = (class140) class100.method1742(var11, field504.method2108());
            boolean var13 = field504.method2083() == 1;
            int var14 = field504.method2108();
            int var15 = field504.field1824;
            if (arg1.field39 != null && arg1.field33 != null) {
                boolean var16 = false;
                if (var12.field2106 && method2391(arg1.field39)) {
                    var16 = true;
                }
                if (!var16 && field364 == 0 && !arg1.field51) {
                    field269.field1824 = 0;
                    field504.method2129(field269.field1828, 0, var14);
                    field269.field1824 = 0;
                    class108 var17 = field269;
                    String var21;
                    try {
                        int var18 = var17.method2215();
                        if (var18 > 32767) {
                            var18 = 32767;
                        }
                        byte[] var19 = new byte[var18];
                        var17.field1824 += Statics.field2953.method2018(var17.field1828, var17.field1824, var19, 0, var18);
                        String var20 = class213.method549(var19, 0, var18);
                        var21 = var20;
                    } catch (Exception var29) {
                        var21 = "Cabbage";
                    }
                    String var24 = class204.method3360(Statics.method550(var21));
                    arg1.field748 = var24.trim();
                    arg1.field752 = var10 >> 8;
                    arg1.field788 = var10 & 0xFF;
                    arg1.field751 = 150;
                    arg1.field749 = var13;
                    arg1.field750 = Statics.field2031 != arg1 && var12.field2106 && field466 != "" && var24.toLowerCase().indexOf(field466) == -1;
                    int var25;
                    if (var12.field2105) {
                        var25 = var13 ? 91 : 1;
                    } else {
                        var25 = var13 ? 90 : 2;
                    }
                    if (var12.field2107 == -1) {
                        class10.method995(var25, arg1.field39, var24);
                    } else {
                        class10.method995(var25, class2.method2524(var12.field2107) + arg1.field39, var24);
                    }
                }
            }
            field504.field1824 = var14 + var15;
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field793 = field504.method2116();
            if (arg1.field793 == 65535) {
                arg1.field793 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var26 = field504.method2107();
            byte[] var27 = new byte[var26];
            class108 var28 = new class108(var27);
            field504.method2094(var27, 0, var26);
            field370[arg0] = var28;
            arg1.method13(var28);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field748 = field504.method2091();
            if (arg1.field748.charAt(0) == '~') {
                arg1.field748 = arg1.field748.substring(1);
                class10.method995(2, arg1.field39, arg1.field748);
            } else if (Statics.field2031 == arg1) {
                class10.method995(2, arg1.field39, arg1.field748);
            }
            arg1.field749 = false;
            arg1.field752 = 0;
            arg1.field788 = 0;
            arg1.field751 = 150;
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field789 = field504.method2118();
            arg1.field762 = field504.method2116();
        }
    }

    @ObfuscatedName("ab.bp(I)V")
    public static final void method857() {
        field373 = 0;
        field268 = 0;
        method3007();
        while (field504.method2317(field288) >= 27) {
            int var0 = field504.method2315(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field261[var0] == null) {
                field261[var0] = new class31();
                var16 = true;
            }
            class31 var17 = field261[var0];
            field284[++field283 - 1] = var0;
            var17.field783 = field410;
            int var18 = field504.method2315(1);
            int var19 = field504.method2315(1);
            if (var19 == 1) {
                field369[++field268 - 1] = var0;
            }
            int var20 = field425[field504.method2315(3)];
            if (var16) {
                var17.field737 = var17.field785 = var20;
            }
            var17.field702 = class36.method2273(field504.method2315(14));
            int var21 = field504.method2315(5);
            if (var21 > 15) {
                var21 -= 32;
            }
            int var22 = field504.method2315(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.field741 = var17.field702.field809;
            var17.field787 = var17.field702.field832;
            if (var17.field787 == 0) {
                var17.field785 = 0;
            }
            var17.field774 = var17.field702.field815;
            var17.field764 = var17.field702.field816;
            var17.field768 = var17.field702.field817;
            var17.field746 = var17.field702.field818;
            var17.field740 = var17.field702.field812;
            var17.field760 = var17.field702.field813;
            var17.field742 = var17.field702.field828;
            var17.method562(Statics.field2031.field747[0] + var22, Statics.field2031.field790[0] + var21, var18 == 1);
        }
        field504.method2316();
        for (int var1 = 0; var1 < field268; var1++) {
            int var2 = field369[var1];
            class31 var3 = field261[var2];
            int var4 = field504.method2083();
            if ((var4 & 0x40) != 0) {
                var3.field702 = class36.method2273(field504.method2116());
                var3.field741 = var3.field702.field809;
                var3.field787 = var3.field702.field832;
                var3.field774 = var3.field702.field815;
                var3.field764 = var3.field702.field816;
                var3.field768 = var3.field702.field817;
                var3.field746 = var3.field702.field818;
                var3.field740 = var3.field702.field812;
                var3.field760 = var3.field702.field813;
                var3.field742 = var3.field702.field828;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = field504.method2116();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field504.method2083();
                if (var3.field766 == var5 && var5 != -1) {
                    int var7 = class39.method2627(var5).field933;
                    if (var7 == 1) {
                        var3.field767 = 0;
                        var3.field777 = 0;
                        var3.field769 = var6;
                        var3.field745 = 0;
                    }
                    if (var7 == 2) {
                        var3.field745 = 0;
                    }
                } else if (var5 == -1 || var3.field766 == -1 || class39.method2627(var5).field927 >= class39.method2627(var3.field766).field927) {
                    var3.field766 = var5;
                    var3.field767 = 0;
                    var3.field777 = 0;
                    var3.field769 = var6;
                    var3.field745 = 0;
                    var3.field735 = var3.field761;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field771 = field504.method2116();
                int var8 = field504.method2126();
                var3.field739 = var8 >> 16;
                var3.field779 = (var8 & 0xFFFF) + field410;
                var3.field772 = 0;
                var3.field773 = 0;
                if (var3.field779 > field410) {
                    var3.field772 = -1;
                }
                if (var3.field771 == 65535) {
                    var3.field771 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field789 = field504.method2263();
                var3.field762 = field504.method2164();
            }
            if ((var4 & 0x80) != 0) {
                var3.field748 = field504.method2091();
                var3.field751 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field793 = field504.method2118();
                if (var3.field793 == 65535) {
                    var3.field793 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var9 = field504.method2083();
                int var10 = field504.method2108();
                var3.method565(var9, var10, field410);
                var3.field757 = field410 + 300;
                var3.field758 = field504.method2118();
                var3.field759 = field504.method2116();
            }
            if ((var4 & 0x10) != 0) {
                int var11 = field504.method2227();
                int var12 = field504.method2108();
                var3.method565(var11, var12, field410);
                var3.field757 = field410 + 300;
                var3.field758 = field504.method2118();
                var3.field759 = field504.method2116();
            }
        }
        for (int var13 = 0; var13 < field373; var13++) {
            int var14 = field246[var13];
            if (field410 != field261[var14].field783) {
                field261[var14].field702 = null;
                field261[var14] = null;
            }
        }
        if (field288 != field504.field1824) {
            throw new RuntimeException(field504.field1824 + class2.field22 + field288);
        }
        for (int var15 = 0; var15 < field283; var15++) {
            if (field261[field284[var15]] == null) {
                throw new RuntimeException(var15 + class2.field22 + field283);
            }
        }
    }

    @ObfuscatedName("fe.bu(B)V")
    public static final void method3007() {
        field504.method2334();
        int var0 = field504.method2315(8);
        if (var0 < field283) {
            for (int var1 = var0; var1 < field283; var1++) {
                field246[++field373 - 1] = field284[var1];
            }
        }
        if (var0 > field283) {
            throw new RuntimeException("");
        }
        field283 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field284[var2];
            class31 var4 = field261[var3];
            int var5 = field504.method2315(1);
            if (var5 == 0) {
                field284[++field283 - 1] = var3;
                var4.field783 = field410;
            } else {
                int var6 = field504.method2315(2);
                if (var6 == 0) {
                    field284[++field283 - 1] = var3;
                    var4.field783 = field410;
                    field369[++field268 - 1] = var3;
                } else if (var6 == 1) {
                    field284[++field283 - 1] = var3;
                    var4.field783 = field410;
                    int var7 = field504.method2315(3);
                    var4.method563(var7, false);
                    int var8 = field504.method2315(1);
                    if (var8 == 1) {
                        field369[++field268 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field284[++field283 - 1] = var3;
                    var4.field783 = field410;
                    int var9 = field504.method2315(3);
                    var4.method563(var9, true);
                    int var10 = field504.method2315(3);
                    var4.method563(var10, true);
                    int var11 = field504.method2315(1);
                    if (var11 == 1) {
                        field369[++field268 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field246[++field373 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bf.bd(B)V")
    public static final void method1352() {
        int var0 = Statics.field1518;
        int var1 = Statics.field1417;
        int var2 = Statics.field1349;
        int var3 = Statics.field389;
        int var4 = 6116423;
        class74.method1466(var0, var1, var2, var3, var4);
        class74.method1466(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class74.method1510(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3.method3361(class145.field2254, var0 + 3, var1 + 14, var4, -1);
        int var5 = class129.field1996;
        int var6 = class129.field1997 * -918864945;
        for (int var7 = 0; var7 < field360; var7++) {
            int var8 = (field360 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field3.method3361(method29(var7), var0 + 3, var8, var9, 0);
        }
        method119(Statics.field1518, Statics.field1417, Statics.field1349, Statics.field389);
    }

    @ObfuscatedName("b.bo(IIIIS)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field453; var4++) {
            if (field487[var4] + field458[var4] > arg0 && field458[var4] < arg0 + arg2 && field510[var4] + field461[var4] > arg1 && field510[var4] < arg1 + arg3) {
                field470[var4] = true;
            }
        }
    }

    @ObfuscatedName("d.bn(IIIII)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field453; var4++) {
            if (field487[var4] + field458[var4] > arg0 && field458[var4] < arg0 + arg2 && field510[var4] + field461[var4] > arg1 && field510[var4] < arg1 + arg3) {
                field456[var4] = true;
            }
        }
    }

    @ObfuscatedName("ad.bc(III)V")
    public static final void method806(int arg0, int arg1) {
        int var2 = Statics.field3.method3371(class145.field2254);
        for (int var3 = 0; var3 < field360; var3++) {
            class205 var4 = Statics.field3;
            String var5;
            if (field361[var3].length() > 0) {
                var5 = field395[var3] + class145.field2308 + field361[var3];
            } else {
                var5 = field395[var3];
            }
            int var6 = var4.method3371(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field360 * 15 + 21;
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
        field388 = true;
        Statics.field1518 = var8;
        Statics.field1417 = var9;
        Statics.field1349 = var2;
        Statics.field389 = field360 * 15 + 22;
    }

    @ObfuscatedName("cd.bf(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var8 = class155.method2637(arg1, arg0);
            if (var8 != null) {
                method82(arg3, arg1, arg0, var8.field2569, arg5);
            }
        }
        if (arg2 == 11) {
            class31 var9 = field261[arg3];
            if (var9 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(27);
                field285.method2088(class126.field1969[82] ? 1 : 0);
                field285.method2195(arg3);
            }
        }
        if (arg2 == 4) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(143);
            field285.method2113(Statics.field223 + arg1);
            field285.method2115(arg3 >> 14 & 0x7FFF);
            field285.method2069(class126.field1969[82] ? 1 : 0);
            field285.method2195(Statics.field86 + arg0);
        }
        if (arg2 == 24) {
            class155 var10 = class155.method2787(arg1);
            boolean var11 = true;
            if (var10.field2640 > 0) {
                var11 = method1319(var10);
            }
            if (var11) {
                field285.method2312(213);
                field285.method2245(arg1);
            }
        }
        if (arg2 == 7) {
            class31 var12 = field261[arg3];
            if (var12 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(219);
                field285.method2114(arg3);
                field285.method2152(class126.field1969[82] ? 1 : 0);
                field285.method2115(Statics.field119);
                field285.method2125(Statics.field1501);
                field285.method2195(Statics.field841);
            }
        }
        if (arg2 == 9) {
            class31 var13 = field261[arg3];
            if (var13 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(118);
                field285.method2113(arg3);
                field285.method2152(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method543();
            class155 var14 = class155.method2787(arg1);
            field402 = 1;
            Statics.field841 = arg0;
            Statics.field1501 = arg1;
            Statics.field119 = arg3;
            method2761(var14);
            field403 = class2.method1265(16748608) + class46.method86(arg3).field1022 + class2.method1265(16777215);
            if (field403 == null) {
                field403 = "null";
            }
            return;
        }
        if (arg2 == 44) {
            class3 var15 = field365[arg3];
            if (var15 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(240);
                field285.method2195(arg3);
                field285.method2196(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class155 var16 = class155.method2787(arg1);
            if (var16 == null || var16.field2644[arg0] < 100000) {
                field285.method2312(195);
                field285.method2195(arg3);
            } else {
                class10.method995(27, "", var16.field2644[arg0] + " x " + class46.method86(arg3).field1022);
            }
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 34) {
            field285.method2312(197);
            field285.method2114(arg0);
            field285.method2113(arg3);
            field285.method2125(arg1);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 29) {
            field285.method2312(213);
            field285.method2245(arg1);
            class155 var17 = class155.method2787(arg1);
            if (var17.field2637 != null && var17.field2637[0][0] == 5) {
                int var18 = var17.field2637[0][1];
                if (class157.field2672[var18] != var17.field2600[0]) {
                    class157.field2672[var18] = var17.field2600[0];
                    method134(var18);
                }
            }
        }
        if (arg2 == 16) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(243);
            field285.method2114(Statics.field223 + arg1);
            field285.method2195(Statics.field119);
            field285.method2115(Statics.field86 + arg0);
            field285.method2152(class126.field1969[82] ? 1 : 0);
            field285.method2115(Statics.field841);
            field285.method2114(arg3);
            field285.method2123(Statics.field1501);
        }
        if (arg2 == 28) {
            field285.method2312(213);
            field285.method2245(arg1);
            class155 var19 = class155.method2787(arg1);
            if (var19.field2637 != null && var19.field2637[0][0] == 5) {
                int var20 = var19.field2637[0][1];
                class157.field2672[var20] = 1 - class157.field2672[var20];
                method134(var20);
            }
        }
        if (arg2 == 15) {
            class3 var21 = field365[arg3];
            if (var21 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(182);
                field285.method2069(class126.field1969[82] ? 1 : 0);
                field285.method2114(arg3);
                field285.method2123(Statics.field179);
                field285.method2195(field405);
            }
        }
        if (arg2 == 32) {
            field285.method2312(33);
            field285.method2113(field405);
            field285.method2245(Statics.field179);
            field285.method2245(arg1);
            field285.method2113(arg3);
            field285.method2114(arg0);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 1002) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field285.method2312(123);
            field285.method2195(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field285.method2312(127);
            field285.method2114(arg3);
            field285.method2114(arg0);
            field285.method2245(arg1);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 23) {
            Statics.field303.method1597(Statics.field1121, arg0, arg1);
        }
        if (arg2 == 18) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(117);
            field285.method2113(Statics.field223 + arg1);
            field285.method2088(class126.field1969[82] ? 1 : 0);
            field285.method2114(arg3);
            field285.method2115(Statics.field86 + arg0);
        }
        if (arg2 == 13) {
            class31 var22 = field261[arg3];
            if (var22 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(4);
                field285.method2195(arg3);
                field285.method2088(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var23 = field365[arg3];
            if (var23 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(189);
                field285.method2195(arg3);
                field285.method2196(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(46);
            field285.method2113(Statics.field86 + arg0);
            field285.method2114(Statics.field223 + arg1);
            field285.method2196(class126.field1969[82] ? 1 : 0);
            field285.method2195(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 10) {
            class31 var24 = field261[arg3];
            if (var24 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(198);
                field285.method2114(arg3);
                field285.method2196(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class155 var25 = class155.method2637(arg1, arg0);
            if (var25 != null) {
                field285.method2312(106);
                field285.method2195(field405);
                field285.method2195(field406);
                field285.method2124(arg1);
                field285.method2125(Statics.field179);
                field285.method2115(var25.field2569);
                field285.method2195(arg0);
            }
        }
        if (arg2 == 30 && field413 == null) {
            field285.method2312(50);
            field285.method2245(arg1);
            field285.method2115(arg0);
            field413 = class155.method2637(arg1, arg0);
            method2761(field413);
        }
        if (arg2 == 47) {
            class3 var26 = field365[arg3];
            if (var26 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(69);
                field285.method2196(class126.field1969[82] ? 1 : 0);
                field285.method2113(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var27 = field365[arg3];
            if (var27 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(179);
                field285.method2152(class126.field1969[82] ? 1 : 0);
                field285.method2114(arg3);
            }
        }
        if (arg2 == 25) {
            class155 var28 = class155.method2637(arg1, arg0);
            if (var28 != null) {
                method543();
                method670(arg1, arg0, class159.method1845(method1736(var28)), var28.field2569);
                field402 = 0;
                String var29;
                if (class159.method1845(method1736(var28)) == 0) {
                    var29 = null;
                } else if (var28.field2605 == null || var28.field2605.trim().length() == 0) {
                    var29 = null;
                } else {
                    var29 = var28.field2605;
                }
                field407 = var29;
                if (field407 == null) {
                    field407 = "Null";
                }
                if (var28.field2537) {
                    field408 = var28.field2599 + class2.method1265(16777215);
                } else {
                    field408 = class2.method1265(65280) + var28.field2641 + class2.method1265(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(56);
            field285.method2195(field405);
            field285.method2195(Statics.field223 + arg1);
            field285.method2113(Statics.field86 + arg0);
            field285.method2123(Statics.field179);
            field285.method2069(class126.field1969[82] ? 1 : 0);
            field285.method2115(arg3);
        }
        if (arg2 == 20) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(65);
            field285.method2195(Statics.field223 + arg1);
            field285.method2113(Statics.field86 + arg0);
            field285.method2195(arg3);
            field285.method2069(class126.field1969[82] ? 1 : 0);
        }
        if (arg2 == 45) {
            class3 var30 = field365[arg3];
            if (var30 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(215);
                field285.method2088(class126.field1969[82] ? 1 : 0);
                field285.method2115(arg3);
            }
        }
        if (arg2 == 21) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(134);
            field285.method2114(arg3);
            field285.method2113(Statics.field223 + arg1);
            field285.method2088(class126.field1969[82] ? 1 : 0);
            field285.method2195(Statics.field86 + arg0);
        }
        if (arg2 == 43) {
            field285.method2312(38);
            field285.method2195(arg3);
            field285.method2123(arg1);
            field285.method2115(arg0);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 40) {
            field285.method2312(8);
            field285.method2123(arg1);
            field285.method2113(arg0);
            field285.method2195(arg3);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 51) {
            class3 var31 = field365[arg3];
            if (var31 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(223);
                field285.method2088(class126.field1969[82] ? 1 : 0);
                field285.method2115(arg3);
            }
        }
        if (arg2 == 3) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(237);
            field285.method2088(class126.field1969[82] ? 1 : 0);
            field285.method2113(Statics.field223 + arg1);
            field285.method2114(Statics.field86 + arg0);
            field285.method2115(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 36) {
            field285.method2312(159);
            field285.method2115(arg3);
            field285.method2124(arg1);
            field285.method2114(arg0);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 35) {
            field285.method2312(124);
            field285.method2113(arg0);
            field285.method2245(arg1);
            field285.method2115(arg3);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 2) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(67);
            field285.method2069(class126.field1969[82] ? 1 : 0);
            field285.method2114(Statics.field223 + arg1);
            field285.method2124(Statics.field179);
            field285.method2115(field405);
            field285.method2114(Statics.field86 + arg0);
            field285.method2113(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(23);
            field285.method2115(Statics.field86 + arg0);
            field285.method2196(class126.field1969[82] ? 1 : 0);
            field285.method2195(arg3);
            field285.method2114(Statics.field223 + arg1);
        }
        if (arg2 == 46) {
            class3 var32 = field365[arg3];
            if (var32 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(168);
                field285.method2115(arg3);
                field285.method2196(class126.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field285.method2312(163);
            field285.method2245(arg1);
            field285.method2114(arg0);
            field285.method2195(arg3);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 41) {
            field285.method2312(141);
            field285.method2113(arg3);
            field285.method2124(arg1);
            field285.method2115(arg0);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 19) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(30);
            field285.method2195(arg3);
            field285.method2114(Statics.field86 + arg0);
            field285.method2195(Statics.field223 + arg1);
            field285.method2196(class126.field1969[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var33 = field365[arg3];
            if (var33 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(52);
                field285.method2196(class126.field1969[82] ? 1 : 0);
                field285.method2113(arg3);
            }
        }
        if (arg2 == 8) {
            class31 var34 = field261[arg3];
            if (var34 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(160);
                field285.method2123(Statics.field179);
                field285.method2115(field405);
                field285.method2196(class126.field1969[82] ? 1 : 0);
                field285.method2113(arg3);
            }
        }
        if (arg2 == 39) {
            field285.method2312(183);
            field285.method2195(arg0);
            field285.method2195(arg3);
            field285.method2123(arg1);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 1004) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field285.method2312(195);
            field285.method2195(arg3);
        }
        if (arg2 == 31) {
            field285.method2312(176);
            field285.method2113(Statics.field841);
            field285.method2113(Statics.field119);
            field285.method2113(arg0);
            field285.method2245(arg1);
            field285.method2114(arg3);
            field285.method2123(Statics.field1501);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 1) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(234);
            field285.method2195(Statics.field86 + arg0);
            field285.method2196(class126.field1969[82] ? 1 : 0);
            field285.method2195(Statics.field119);
            field285.method2124(Statics.field1501);
            field285.method2114(arg3 >> 14 & 0x7FFF);
            field285.method2114(Statics.field841);
            field285.method2114(Statics.field223 + arg1);
        }
        if (arg2 == 33) {
            field285.method2312(204);
            field285.method2115(arg0);
            field285.method2114(arg3);
            field285.method2245(arg1);
            field356 = 0;
            Statics.field1261 = class155.method2787(arg1);
            field357 = arg0;
        }
        if (arg2 == 14) {
            class3 var35 = field365[arg3];
            if (var35 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(20);
                field285.method2115(Statics.field841);
                field285.method2115(arg3);
                field285.method2196(class126.field1969[82] ? 1 : 0);
                field285.method2245(Statics.field1501);
                field285.method2114(Statics.field119);
            }
        }
        if (arg2 == 12) {
            class31 var36 = field261[arg3];
            if (var36 != null) {
                field354 = arg6;
                field333 = arg7;
                field355 = 2;
                field477 = 0;
                field480 = arg0;
                field481 = arg1;
                field285.method2312(31);
                field285.method2069(class126.field1969[82] ? 1 : 0);
                field285.method2113(arg3);
            }
        }
        if (arg2 == 1003) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            class31 var37 = field261[arg3];
            if (var37 != null) {
                class36 var38 = var37.field702;
                if (var38.field803 != null) {
                    var38 = var38.method576();
                }
                if (var38 != null) {
                    field285.method2312(203);
                    field285.method2115(var38.field820);
                }
            }
        }
        if (arg2 == 5) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(244);
            field285.method2115(Statics.field86 + arg0);
            field285.method2195(Statics.field223 + arg1);
            field285.method2196(class126.field1969[82] ? 1 : 0);
            field285.method2114(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 6) {
            field354 = arg6;
            field333 = arg7;
            field355 = 2;
            field477 = 0;
            field480 = arg0;
            field481 = arg1;
            field285.method2312(41);
            field285.method2195(arg3 >> 14 & 0x7FFF);
            field285.method2114(Statics.field86 + arg0);
            field285.method2196(class126.field1969[82] ? 1 : 0);
            field285.method2114(Statics.field223 + arg1);
        }
        if (arg2 == 26) {
            field285.method2312(206);
            for (class4 var39 = (class4) field245.method3139(); var39 != null; var39 = (class4) field245.method3146()) {
                if (var39.field55 == 0 || var39.field55 == 3) {
                    method147(var39, true);
                }
            }
            if (field413 != null) {
                method2761(field413);
                field413 = null;
            }
        }
        if (field402 != 0) {
            field402 = 0;
            method2761(class155.method2787(Statics.field1501));
        }
        if (field404) {
            method543();
        }
        if (Statics.field1261 != null && field356 == 0) {
            method2761(Statics.field1261);
        }
    }

    @ObfuscatedName("ag.bw(IIIII)V")
    public static void method670(int arg0, int arg1, int arg2, int arg3) {
        class155 var4 = class155.method2637(arg0, arg1);
        if (var4 != null && var4.field2617 != null) {
            class1 var5 = new class1();
            var5.field18 = var4;
            var5.field15 = var4.field2617;
            class33.method124(var5, 200000);
        }
        field406 = arg3;
        field404 = true;
        Statics.field179 = arg0;
        field405 = arg1;
        Statics.field842 = arg2;
        method2761(var4);
    }

    @ObfuscatedName("aq.ba(I)V")
    public static void method543() {
        if (!field404) {
            return;
        }
        class155 var0 = class155.method2637(Statics.field179, field405);
        if (var0 != null && var0.field2618 != null) {
            class1 var1 = new class1();
            var1.field18 = var0;
            var1.field15 = var0.field2618;
            class33.method124(var1, 200000);
        }
        field404 = false;
        method2761(var0);
    }

    @ObfuscatedName("w.bb(IIIILjava/lang/String;B)V")
    public static void method82(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class155 var5 = class155.method2637(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2626 != null) {
            class1 var6 = new class1();
            var6.field18 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field15 = var5.field2626;
            class33.method124(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2640 > 0) {
            var7 = method1319(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method1736(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field285.method2312(35);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 2) {
            field285.method2312(220);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 3) {
            field285.method2312(93);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 4) {
            field285.method2312(104);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 5) {
            field285.method2312(42);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 6) {
            field285.method2312(194);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 7) {
            field285.method2312(238);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 8) {
            field285.method2312(97);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 9) {
            field285.method2312(210);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
        if (arg0 == 10) {
            field285.method2312(247);
            field285.method2245(arg1);
            field285.method2195(arg2);
            field285.method2195(arg3);
        }
    }

    @ObfuscatedName("ao.bi(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method790(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field388 || field360 >= 500) {
            return;
        }
        field395[field360] = arg0;
        field361[field360] = arg1;
        field393[field360] = arg2;
        field394[field360] = arg3;
        field320[field360] = arg4;
        field392[field360] = arg5;
        field360++;
    }

    @ObfuscatedName("m.bj(I)V")
    public static void method497() {
        for (int var0 = 0; var0 < field360; var0++) {
            if (method554(field393[var0])) {
                if (var0 < field360 - 1) {
                    for (int var1 = var0; var1 < field360 - 1; var1++) {
                        field395[var1] = field395[var1 + 1];
                        field361[var1] = field361[var1 + 1];
                        field393[var1] = field393[var1 + 1];
                        field394[var1] = field394[var1 + 1];
                        field320[var1] = field320[var1 + 1];
                        field392[var1] = field392[var1 + 1];
                    }
                }
                field360--;
            }
        }
    }

    @ObfuscatedName("ae.bv(II)Z")
    public static boolean method554(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("k.ca(IB)Ljava/lang/String;")
    public static String method29(int arg0) {
        return field361[arg0].length() > 0 ? field395[arg0] + class145.field2308 + field361[arg0] : field395[arg0];
    }

    @ObfuscatedName("af.cc(Lan;IIII)V")
    public static final void method870(class36 arg0, int arg1, int arg2, int arg3) {
        if (field360 >= 400) {
            return;
        }
        if (arg0.field803 != null) {
            arg0 = arg0.method576();
        }
        if (arg0 == null || !arg0.field836 || arg0.field838 && field417 != arg1) {
            return;
        }
        String var4 = arg0.field840;
        if (arg0.field810 != 0) {
            var4 = var4 + method2363(arg0.field810, Statics.field2031.field45) + " " + class2.field31 + class145.field2175 + arg0.field810 + class2.field24;
        }
        if (field402 == 1) {
            method790(class145.field2298, field403 + " " + class2.field26 + " " + class2.method1265(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field404) {
            String[] var5 = arg0.field823;
            if (field311) {
                var5 = method1843(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2235)) {
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
                        method790(var5[var6], class2.method1265(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2235)) {
                        short var9 = 0;
                        if (field271 == class18.field512 || field271 == class18.field513 && arg0.field810 > Statics.field2031.field45) {
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
                        method790(var5[var8], class2.method1265(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method790(class145.field2299, class2.method1265(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field842 & 0x2) == 2) {
            method790(field407, field408 + " " + class2.field26 + " " + class2.method1265(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eu.cn(Lz;IIII)V")
    public static final void method2639(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2031 == arg0 || field360 >= 400) {
            return;
        }
        String var9;
        if (arg0.field37 == 0) {
            String var4 = arg0.field39;
            int var5 = arg0.field45;
            int var6 = Statics.field2031.field45;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1265(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1265(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1265(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1265(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1265(65280);
            } else if (var7 > 6) {
                var8 = class2.method1265(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1265(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1265(12648192);
            } else {
                var8 = class2.method1265(16776960);
            }
            var9 = var4 + var8 + " " + class2.field31 + class145.field2175 + arg0.field45 + class2.field24;
        } else {
            var9 = arg0.field39 + " " + class2.field31 + class145.field2189 + arg0.field37 + class2.field24;
        }
        if (field402 == 1) {
            method790(class145.field2298, field403 + " " + class2.field26 + " " + class2.method1265(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field404) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field376[var10] != null) {
                    short var11 = 0;
                    if (field376[var10].equalsIgnoreCase(class145.field2235)) {
                        if (field271 == class18.field512 || field271 == class18.field513 && arg0.field45 > Statics.field2031.field45) {
                            var11 = 2000;
                        }
                        if (Statics.field2031.field32 != 0 && arg0.field32 != 0) {
                            if (Statics.field2031.field32 == arg0.field32) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field377[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field375[var10] + var11;
                    method790(field376[var10], class2.method1265(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field842 & 0x8) == 8) {
            method790(field407, field408 + " " + class2.field26 + " " + class2.method1265(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field360; var14++) {
            if (field393[var14] == 23) {
                field361[var14] = class2.method1265(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("dh.cs(III)Ljava/lang/String;")
    public static final String method2363(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1265(16711680);
        } else if (var2 < -6) {
            return class2.method1265(16723968);
        } else if (var2 < -3) {
            return class2.method1265(16740352);
        } else if (var2 < 0) {
            return class2.method1265(16756736);
        } else if (var2 > 9) {
            return class2.method1265(65280);
        } else if (var2 > 6) {
            return class2.method1265(4259584);
        } else if (var2 > 3) {
            return class2.method1265(8453888);
        } else if (var2 > 0) {
            return class2.method1265(12648192);
        } else {
            return class2.method1265(16776960);
        }
    }

    @ObfuscatedName("l.cw(IIIIIIIIS)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class155.method1264(arg0)) {
            Statics.field560 = null;
            method2014(Statics.field2565[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field560 != null) {
                method2014(Statics.field560, -1412584499, arg1, arg2, arg3, arg4, Statics.field2493, Statics.field2484, arg7);
                Statics.field560 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field470[var8] = true;
            }
        } else {
            field470[arg7] = true;
        }
    }

    @ObfuscatedName("cl.ce([Lec;IIIIIIIII)V")
    public static final void method2014(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1460(arg2, arg3, arg4, arg5);
        class85.method1748();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2531 == arg1 || arg1 == -1412584499 && field401 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field458[field453] = var10.field2543 + arg6;
                    field510[field453] = var10.field2544 + arg7;
                    field487[field453] = var10.field2547;
                    field461[field453] = var10.field2554;
                    var11 = ++field453 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2656 = var11;
                var10.field2657 = field410;
                if (!var10.field2537 || !method165(var10)) {
                    if (var10.field2640 > 0) {
                        int var12 = var10.field2640;
                        if (var12 == 324) {
                            if (field507 == -1) {
                                field507 = var10.field2562;
                                field432 = var10.field2563;
                            }
                            if (field506.field2686) {
                                var10.field2562 = field507;
                            } else {
                                var10.field2562 = field432;
                            }
                        } else if (var12 == 325) {
                            if (field507 == -1) {
                                field507 = var10.field2562;
                                field432 = var10.field2563;
                            }
                            if (field506.field2686) {
                                var10.field2562 = field432;
                            } else {
                                var10.field2562 = field507;
                            }
                        } else if (var12 == 327) {
                            var10.field2578 = 150;
                            var10.field2579 = (int) (Math.sin((double) field410 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2558 = 5;
                            var10.field2528 = 0;
                        } else if (var12 == 328) {
                            var10.field2578 = 150;
                            var10.field2579 = (int) (Math.sin((double) field410 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2558 = 5;
                            var10.field2528 = 1;
                        }
                    }
                    int var13 = var10.field2543 + arg6;
                    int var14 = var10.field2544 + arg7;
                    int var15 = var10.field2560;
                    if (field401 == var10) {
                        if (arg1 != -1412584499 && !var10.field2631) {
                            Statics.field560 = arg0;
                            Statics.field2493 = arg6;
                            Statics.field2484 = arg7;
                            continue;
                        }
                        if (field278 && field426) {
                            int var16 = class129.field1996;
                            int var17 = class129.field1997 * -918864945;
                            int var18 = var16 - field423;
                            int var19 = var17 - field424;
                            if (var18 < field427) {
                                var18 = field427;
                            }
                            if (var10.field2547 + var18 > field427 + field422.field2547) {
                                var18 = field427 + field422.field2547 - var10.field2547;
                            }
                            if (var19 < field428) {
                                var19 = field428;
                            }
                            if (var10.field2554 + var19 > field428 + field422.field2554) {
                                var19 = field428 + field422.field2554 - var10.field2554;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2631) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2540 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2540 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2547 + var13;
                        int var27 = var10.field2554 + var14;
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
                        int var30 = var10.field2547 + var13;
                        int var31 = var10.field2554 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2537 || var20 < var22 && var21 < var23) {
                        if (var10.field2640 != 0) {
                            if (var10.field2640 == 1337) {
                                field254 = var13;
                                field398 = var14;
                                method1828(var13, var14, var10.field2547, var10.field2554);
                                class74.method1460(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2640 == 1338) {
                                Statics.method1737();
                                class74.method1460(var13, var14, Statics.field522.field1323 + var13, Statics.field522.field1324 + var14);
                                if (field372 == 2 || field372 == 5) {
                                    class74.method1499(var13 + 25, var14 + 5, 0, Statics.field2142, Statics.field14);
                                } else {
                                    int var32 = field330 + field315 & 0x7FF;
                                    int var33 = Statics.field2031.field753 / 32 + 48;
                                    int var34 = 464 - Statics.field2031.field736 / 32;
                                    Statics.field1810.method1381(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field378 + 256, Statics.field2142, Statics.field14);
                                    for (int var35 = 0; var35 < field455; var35++) {
                                        int var36 = field334[var35] * 4 + 2 - Statics.field2031.field753 / 32;
                                        int var37 = field478[var35] * 4 + 2 - Statics.field2031.field736 / 32;
                                        Statics.method153(var13, var14, var36, var37, field479[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class180 var40 = field349[Statics.field1121][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field2031.field753 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field2031.field736 / 32;
                                                Statics.method153(var13, var14, var41, var42, Statics.field520[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field283; var43++) {
                                        class31 var44 = field261[field284[var43]];
                                        if (var44 != null && var44.method14()) {
                                            class36 var45 = var44.field702;
                                            if (var45 != null && var45.field803 != null) {
                                                var45 = var45.method576();
                                            }
                                            if (var45 != null && var45.field835 && var45.field836) {
                                                int var46 = var44.field753 / 32 - Statics.field2031.field753 / 32;
                                                int var47 = var44.field736 / 32 - Statics.field2031.field736 / 32;
                                                Statics.method153(var13, var14, var46, var47, Statics.field520[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field255; var48++) {
                                        class3 var49 = field365[field367[var48]];
                                        if (var49 != null && var49.method14() && !var49.field51) {
                                            int var50 = var49.field753 / 32 - Statics.field2031.field753 / 32;
                                            int var51 = var49.field736 / 32 - Statics.field2031.field736 / 32;
                                            boolean var52 = false;
                                            if (method33(var49.field39, true)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            for (int var54 = 0; var54 < Statics.field825; var54++) {
                                                if (var49.field39.equals(Statics.field1296[var54].field566)) {
                                                    var53 = true;
                                                    break;
                                                }
                                            }
                                            boolean var55 = false;
                                            if (Statics.field2031.field32 != 0 && var49.field32 != 0 && Statics.field2031.field32 == var49.field32) {
                                                var55 = true;
                                            }
                                            if (var52) {
                                                Statics.method153(var13, var14, var50, var51, Statics.field520[3]);
                                            } else if (var55) {
                                                Statics.method153(var13, var14, var50, var51, Statics.field520[4]);
                                            } else if (var53) {
                                                Statics.method153(var13, var14, var50, var51, Statics.field520[5]);
                                            } else {
                                                Statics.method153(var13, var14, var50, var51, Statics.field520[2]);
                                            }
                                        }
                                    }
                                    if (field296 != 0 && field410 % 20 < 10) {
                                        if (field296 == 1 && field262 >= 0 && field262 < field261.length) {
                                            class31 var56 = field261[field262];
                                            if (var56 != null) {
                                                int var57 = var56.field753 / 32 - Statics.field2031.field753 / 32;
                                                int var58 = var56.field736 / 32 - Statics.field2031.field736 / 32;
                                                method495(var13, var14, var57, var58, Statics.field1966[1]);
                                            }
                                        }
                                        if (field296 == 2) {
                                            int var59 = field264 * 4 - Statics.field86 * 4 + 2 - Statics.field2031.field753 / 32;
                                            int var60 = field265 * 4 - Statics.field223 * 4 + 2 - Statics.field2031.field736 / 32;
                                            method495(var13, var14, var59, var60, Statics.field1966[1]);
                                        }
                                        if (field296 == 10 && field358 >= 0 && field358 < field365.length) {
                                            class3 var61 = field365[field358];
                                            if (var61 != null) {
                                                int var62 = var61.field753 / 32 - Statics.field2031.field753 / 32;
                                                int var63 = var61.field736 / 32 - Statics.field2031.field736 / 32;
                                                method495(var13, var14, var62, var63, Statics.field1966[1]);
                                            }
                                        }
                                    }
                                    if (field480 != 0) {
                                        int var64 = field480 * 4 + 2 - Statics.field2031.field753 / 32;
                                        int var65 = field481 * 4 + 2 - Statics.field2031.field736 / 32;
                                        Statics.method153(var13, var14, var64, var65, Statics.field1966[0]);
                                    }
                                    if (!Statics.field2031.field51) {
                                        class74.method1466(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field372 < 3) {
                                    Statics.field321.method1381(var13, var14, 33, 33, 25, 25, field330, 256, Statics.field511, Statics.field1838);
                                } else {
                                    class74.method1499(var13, var14, 0, Statics.field511, Statics.field1838);
                                }
                                if (field457[var11]) {
                                    Statics.field522.method1522(var13, var14);
                                }
                                field456[var11] = true;
                                class74.method1460(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2540 == 0) {
                            if (!var10.field2537 && method165(var10) && Statics.field986 != var10) {
                                continue;
                            }
                            if (!var10.field2537) {
                                if (var10.field2552 > var10.field2630 - var10.field2554) {
                                    var10.field2552 = var10.field2630 - var10.field2554;
                                }
                                if (var10.field2552 < 0) {
                                    var10.field2552 = 0;
                                }
                            }
                            method2014(arg0, var10.field2538, var20, var21, var22, var23, var13 - var10.field2620, var14 - var10.field2552, var11);
                            if (var10.field2649 != null) {
                                method2014(var10.field2649, var10.field2538, var20, var21, var22, var23, var13 - var10.field2620, var14 - var10.field2552, var11);
                            }
                            class4 var66 = (class4) field245.method3140((long) var10.field2538);
                            if (var66 != null) {
                                method89(var66.field60, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class74.method1460(arg2, arg3, arg4, arg5);
                            class85.method1748();
                        }
                        if (field457[var11] || field462 > 1) {
                            if (var10.field2540 == 0 && !var10.field2537 && var10.field2630 > var10.field2554) {
                                method2013(var10.field2547 + var13, var14, var10.field2552, var10.field2554, var10.field2630);
                            }
                            if (var10.field2540 != 1) {
                                if (var10.field2540 == 2) {
                                    int var67 = 0;
                                    for (int var68 = 0; var68 < var10.field2554; var68++) {
                                        for (int var69 = 0; var69 < var10.field2547; var69++) {
                                            int var70 = (var10.field2604 + 32) * var69 + var13;
                                            int var71 = (var10.field2593 + 32) * var68 + var14;
                                            if (var67 < 20) {
                                                var70 += var10.field2594[var67];
                                                var71 += var10.field2551[var67];
                                            }
                                            if (var10.field2643[var67] > 0) {
                                                boolean var72 = false;
                                                boolean var73 = false;
                                                int var74 = var10.field2643[var67] - 1;
                                                if (var70 + 32 > arg2 && var70 < arg4 && var71 + 32 > arg3 && var71 < arg5 || Statics.field158 == var10 && field350 == var67) {
                                                    class73 var75;
                                                    if (field402 == 1 && Statics.field841 == var67 && Statics.field1501 == var10.field2538) {
                                                        var75 = class46.method131(var74, var10.field2644[var67], 2, 0, 2, false);
                                                    } else {
                                                        var75 = class46.method131(var74, var10.field2644[var67], 1, 3153952, 2, false);
                                                    }
                                                    if (var75 == null) {
                                                        method2761(var10);
                                                    } else if (Statics.field158 == var10 && field350 == var67) {
                                                        int var76 = class129.field1996 - field359;
                                                        int var77 = class129.field1997 * -918864945 - field374;
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (field363 < 5) {
                                                            var76 = 0;
                                                            var77 = 0;
                                                        }
                                                        var75.method1377(var70 + var76, var71 + var77, 128);
                                                        if (arg1 != -1) {
                                                            class155 var78 = arg0[arg1 & 0xFFFF];
                                                            if (var71 + var77 < class74.field1317 && var78.field2552 > 0) {
                                                                int var79 = field240 * (class74.field1317 - var71 - var77) / 3;
                                                                if (var79 > field240 * 10) {
                                                                    var79 = field240 * 10;
                                                                }
                                                                if (var79 > var78.field2552) {
                                                                    var79 = var78.field2552;
                                                                }
                                                                var78.field2552 -= var79;
                                                                field374 += var79;
                                                                method2761(var78);
                                                            }
                                                            if (var71 + var77 + 32 > class74.field1318 && var78.field2552 < var78.field2630 - var78.field2554) {
                                                                int var80 = field240 * (var71 + var77 + 32 - class74.field1318) / 3;
                                                                if (var80 > field240 * 10) {
                                                                    var80 = field240 * 10;
                                                                }
                                                                if (var80 > var78.field2630 - var78.field2554 - var78.field2552) {
                                                                    var80 = var78.field2630 - var78.field2554 - var78.field2552;
                                                                }
                                                                var78.field2552 += var80;
                                                                field374 -= var80;
                                                                method2761(var78);
                                                            }
                                                        }
                                                    } else if (Statics.field1261 == var10 && field357 == var67) {
                                                        var75.method1377(var70, var71, 128);
                                                    } else {
                                                        var75.method1364(var70, var71);
                                                    }
                                                }
                                            } else if (var10.field2596 != null && var67 < 20) {
                                                class73 var81 = var10.method2809(var67);
                                                if (var81 != null) {
                                                    var81.method1364(var70, var71);
                                                } else if (class155.field2636) {
                                                    method2761(var10);
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                } else if (var10.field2540 == 3) {
                                    int var82;
                                    if (method545(var10)) {
                                        var82 = var10.field2556;
                                        if (Statics.field986 == var10 && var10.field2621 != 0) {
                                            var82 = var10.field2621;
                                        }
                                    } else {
                                        var82 = var10.field2555;
                                        if (Statics.field986 == var10 && var10.field2557 != 0) {
                                            var82 = var10.field2557;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2559) {
                                            class74.method1466(var13, var14, var10.field2547, var10.field2554, var82);
                                        } else {
                                            class74.method1510(var13, var14, var10.field2547, var10.field2554, var82);
                                        }
                                    } else if (var10.field2559) {
                                        class74.method1481(var13, var14, var10.field2547, var10.field2554, var82, 256 - (var15 & 0xFF));
                                    } else {
                                        class74.method1469(var13, var14, var10.field2547, var10.field2554, var82, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2540 == 4) {
                                    class205 var83 = var10.method2827();
                                    if (var83 != null) {
                                        String var84 = var10.field2586;
                                        int var85;
                                        if (method545(var10)) {
                                            var85 = var10.field2556;
                                            if (Statics.field986 == var10 && var10.field2621 != 0) {
                                                var85 = var10.field2621;
                                            }
                                            if (var10.field2587.length() > 0) {
                                                var84 = var10.field2587;
                                            }
                                        } else {
                                            var85 = var10.field2555;
                                            if (Statics.field986 == var10 && var10.field2557 != 0) {
                                                var85 = var10.field2557;
                                            }
                                        }
                                        if (var10.field2537 && var10.field2569 != -1) {
                                            class46 var86 = class46.method86(var10.field2569);
                                            var84 = var86.field1022;
                                            if (var84 == null) {
                                                var84 = "null";
                                            }
                                            if ((var86.field1026 == 1 || var10.field2646 != 1) && var10.field2646 != -1) {
                                                var84 = class2.method1265(16748608) + var84 + class2.field28 + " " + 'x' + method83(var10.field2646);
                                            }
                                        }
                                        if (field413 == var10) {
                                            class145 var10000 = (class145) null;
                                            var84 = class145.field2306;
                                            var85 = var10.field2555;
                                        }
                                        if (!var10.field2537) {
                                            var84 = method2635(var84, var10);
                                        }
                                        var83.method3372(var84, var13, var14, var10.field2547, var10.field2554, var85, var10.field2591 ? 0 : -1, var10.field2534, var10.field2606, var10.field2564);
                                    } else if (class155.field2636) {
                                        method2761(var10);
                                    }
                                } else if (var10.field2540 == 5) {
                                    if (var10.field2537) {
                                        class73 var88;
                                        if (var10.field2569 == -1) {
                                            var88 = var10.method2840(false);
                                        } else {
                                            var88 = class46.method131(var10.field2569, var10.field2646, var10.field2566, var10.field2567, var10.field2584, false);
                                        }
                                        if (var88 != null) {
                                            int var89 = var88.field1307;
                                            int var90 = var88.field1308;
                                            if (var10.field2648) {
                                                class74.method1484(var13, var14, var10.field2547 + var13, var10.field2554 + var14);
                                                int var91 = (var10.field2547 + (var89 - 1)) / var89;
                                                int var92 = (var10.field2554 + (var90 - 1)) / var90;
                                                for (int var93 = 0; var93 < var91; var93++) {
                                                    for (int var94 = 0; var94 < var92; var94++) {
                                                        if (var10.field2601 != 0) {
                                                            var88.method1383(var89 / 2 + var89 * var93 + var13, var90 / 2 + var90 * var94 + var14, var10.field2601, 4096);
                                                        } else if (var15 == 0) {
                                                            var88.method1364(var89 * var93 + var13, var90 * var94 + var14);
                                                        } else {
                                                            var88.method1377(var89 * var93 + var13, var90 * var94 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1460(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var95 = var10.field2547 * 4096 / var89;
                                                if (var10.field2601 != 0) {
                                                    var88.method1383(var10.field2547 / 2 + var13, var10.field2554 / 2 + var14, var10.field2601, var95);
                                                } else if (var15 != 0) {
                                                    var88.method1365(var13, var14, var10.field2547, var10.field2554, 256 - (var15 & 0xFF));
                                                } else if (var10.field2547 == var89 && var10.field2554 == var90) {
                                                    var88.method1364(var13, var14);
                                                } else {
                                                    var88.method1439(var13, var14, var10.field2547, var10.field2554);
                                                }
                                            }
                                        } else if (class155.field2636) {
                                            method2761(var10);
                                        }
                                    } else {
                                        class73 var87 = var10.method2840(method545(var10));
                                        if (var87 != null) {
                                            var87.method1364(var13, var14);
                                        } else if (class155.field2636) {
                                            method2761(var10);
                                        }
                                    }
                                } else if (var10.field2540 == 6) {
                                    boolean var96 = method545(var10);
                                    int var97;
                                    if (var96) {
                                        var97 = var10.field2575;
                                    } else {
                                        var97 = var10.field2574;
                                    }
                                    class99 var98 = null;
                                    int var99 = 0;
                                    if (var10.field2569 != -1) {
                                        class46 var100 = class46.method86(var10.field2569);
                                        if (var100 != null) {
                                            class46 var101 = var100.method816(var10.field2646);
                                            var98 = var101.method815(1);
                                            if (var98 == null) {
                                                method2761(var10);
                                            } else {
                                                var98.method1940();
                                                var99 = var98.field1352 / 2;
                                            }
                                        }
                                    } else if (var10.field2558 == 5) {
                                        if (var10.field2528 == 0) {
                                            var98 = field506.method2875((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var98 = Statics.field2031.method15();
                                        }
                                    } else if (var97 == -1) {
                                        var98 = var10.method2797((class39) null, -1, var96, Statics.field2031.field33);
                                        if (var98 == null && class155.field2636) {
                                            method2761(var10);
                                        }
                                    } else {
                                        class39 var102 = class39.method2627(var97);
                                        var98 = var10.method2797(var102, var10.field2647, var96, Statics.field2031.field33);
                                        if (var98 == null && class155.field2636) {
                                            method2761(var10);
                                        }
                                    }
                                    class85.method1751(var10.field2547 / 2 + var13, var10.field2554 / 2 + var14);
                                    int var103 = var10.field2581 * class85.field1479[var10.field2578] >> 16;
                                    int var104 = var10.field2581 * class85.field1465[var10.field2578] >> 16;
                                    if (var98 != null) {
                                        if (var10.field2537) {
                                            var98.method1940();
                                            if (var10.field2652) {
                                                var98.method1967(0, var10.field2579, var10.field2580, var10.field2578, var10.field2576, var10.field2577 + var99 + var103, var10.field2577 + var104, var10.field2581);
                                            } else {
                                                var98.method1951(0, var10.field2579, var10.field2580, var10.field2578, var10.field2576, var10.field2577 + var99 + var103, var10.field2577 + var104);
                                            }
                                        } else {
                                            var98.method1951(0, var10.field2579, 0, var10.field2578, 0, var103, var104);
                                        }
                                    }
                                    class85.method1758();
                                } else {
                                    if (var10.field2540 == 7) {
                                        class205 var105 = var10.method2827();
                                        if (var105 == null) {
                                            if (class155.field2636) {
                                                method2761(var10);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var10.field2554; var107++) {
                                            for (int var108 = 0; var108 < var10.field2547; var108++) {
                                                if (var10.field2643[var106] > 0) {
                                                    class46 var109 = class46.method86(var10.field2643[var106] - 1);
                                                    String var110;
                                                    if (var109.field1026 != 1 && var10.field2644[var106] == 1) {
                                                        var110 = class2.method1265(16748608) + var109.field1022 + class2.field28;
                                                    } else {
                                                        var110 = class2.method1265(16748608) + var109.field1022 + class2.field28 + " " + 'x' + method83(var10.field2644[var106]);
                                                    }
                                                    int var111 = (var10.field2604 + 115) * var108 + var13;
                                                    int var112 = (var10.field2593 + 12) * var107 + var14;
                                                    if (var10.field2534 == 0) {
                                                        var105.method3361(var110, var111, var112, var10.field2555, var10.field2591 ? 0 : -1);
                                                    } else if (var10.field2534 == 1) {
                                                        var105.method3363(var110, var10.field2547 / 2 + var111, var112, var10.field2555, var10.field2591 ? 0 : -1);
                                                    } else {
                                                        var105.method3362(var110, var10.field2547 + var111 - 1, var112, var10.field2555, var10.field2591 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var10.field2540 == 8 && Statics.field2022 == var10 && field492 == field277) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class205 var115 = Statics.field1003;
                                        String var116 = var10.field2586;
                                        String var117 = method2635(var116, var10);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf(class2.field21);
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            int var120 = var115.method3371(var119);
                                            if (var120 > var113) {
                                                var113 = var120;
                                            }
                                            var114 += var115.field2960 + 1;
                                        }
                                        var113 += 6;
                                        var114 += 7;
                                        int var121 = var10.field2547 + var13 - 5 - var113;
                                        int var122 = var10.field2554 + var14 + 5;
                                        if (var121 < var13 + 5) {
                                            var121 = var13 + 5;
                                        }
                                        if (var113 + var121 > arg4) {
                                            var121 = arg4 - var113;
                                        }
                                        if (var114 + var122 > arg5) {
                                            var122 = arg5 - var114;
                                        }
                                        class74.method1466(var121, var122, var113, var114, 16777120);
                                        class74.method1510(var121, var122, var113, var114, 0);
                                        String var123 = var10.field2586;
                                        int var124 = var115.field2960 + var122 + 2;
                                        String var125 = method2635(var123, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field21);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            var115.method3361(var127, var121 + 3, var124, 0, -1);
                                            var124 += var115.field2960 + 1;
                                        }
                                    }
                                    if (var10.field2540 == 9) {
                                        if (var10.field2658 == 1) {
                                            class74.method1501(var13, var14, var10.field2547 + var13, var10.field2554 + var14, var10.field2555);
                                        } else {
                                            int var128 = var10.field2547 >= 0 ? var10.field2547 : -var10.field2547;
                                            int var129 = var10.field2554 >= 0 ? var10.field2554 : -var10.field2554;
                                            int var130 = var128;
                                            if (var128 < var129) {
                                                var130 = var129;
                                            }
                                            if (var130 != 0) {
                                                int var131 = (var10.field2547 << 16) / var130;
                                                int var132 = (var10.field2554 << 16) / var130;
                                                if (var132 <= var131) {
                                                    var131 = -var131;
                                                } else {
                                                    var132 = -var132;
                                                }
                                                int var133 = var10.field2658 * var132 >> 17;
                                                int var134 = var10.field2658 * var132 + 1 >> 17;
                                                int var135 = var10.field2658 * var131 >> 17;
                                                int var136 = var10.field2658 * var131 + 1 >> 17;
                                                int var137 = var13 + var133;
                                                int var138 = var13 - var134;
                                                int var139 = var10.field2547 + var13 - var134;
                                                int var140 = var10.field2547 + var13 + var133;
                                                int var141 = var14 + var135;
                                                int var142 = var14 - var136;
                                                int var143 = var10.field2554 + var14 - var136;
                                                int var144 = var10.field2554 + var14 + var135;
                                                class85.method1756(var137, var138, var139);
                                                class85.method1759(var141, var142, var143, var137, var138, var139, var10.field2555);
                                                class85.method1756(var137, var139, var140);
                                                class85.method1759(var141, var143, var144, var137, var139, var140, var10.field2555);
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

    @ObfuscatedName("eb.co(Ljava/lang/String;Lec;I)Ljava/lang/String;")
    public static String method2635(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2737(arg1, var2 - 1);
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
                if (Statics.field508 != null) {
                    int var9 = Statics.field508.field2056;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field508.field2059 != null) {
                        var8 = (String) Statics.field508.field2059;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.ck(II)Ljava/lang/String;")
    public static final String method83(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1265(65408) + var1.substring(0, var1.length() - 8) + class145.field2165 + " " + class2.field31 + var1 + class2.field24 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method1265(16777215) + var1.substring(0, var1.length() - 4) + class145.field2311 + " " + class2.field31 + var1 + class2.field24 + class2.field28;
        } else {
            return " " + class2.method1265(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("x.ct(Lec;IIIIIII)V")
    public static final void method475(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field327) {
            field328 = 32;
        } else {
            field328 = 0;
        }
        field327 = false;
        if (class129.field1995 == 1 || !Statics.field2927 && class129.field1995 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2552 -= 4;
                method2761(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2552 += 4;
                method2761(arg0);
            } else if (arg5 >= arg1 - field328 && arg5 < field328 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2552 = (arg4 - arg3) * var8 / var9;
                method2761(arg0);
                field327 = true;
            }
        }
        if (field448 == 0) {
            return;
        }
        int var10 = arg0.field2547;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2552 += field448 * 45;
            method2761(arg0);
        }
    }

    @ObfuscatedName("cl.cd(IIIIII)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1848[0].method1522(arg0, arg1);
        Statics.field1848[1].method1522(arg0, arg1 + arg3 - 16);
        class74.method1466(arg0, arg1 + 16, 16, arg3 - 32, field502);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1466(arg0, arg1 + 16 + var6, 16, var5, field366);
        class74.method1472(arg0, arg1 + 16 + var6, var5, field249);
        class74.method1472(arg0 + 1, arg1 + 16 + var6, var5, field249);
        class74.method1505(arg0, arg1 + 16 + var6, 16, field249);
        class74.method1505(arg0, arg1 + 17 + var6, 16, field249);
        class74.method1472(arg0 + 15, arg1 + 16 + var6, var5, field509);
        class74.method1472(arg0 + 14, arg1 + 17 + var6, var5 - 1, field509);
        class74.method1505(arg0, arg1 + 15 + var6 + var5, 16, field509);
        class74.method1505(arg0 + 1, arg1 + 14 + var6 + var5, 15, field509);
    }

    @ObfuscatedName("aq.cv(Lec;I)Z")
    public static final boolean method545(class155 arg0) {
        if (arg0.field2638 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2638.length; var1++) {
            int var2 = method2737(arg0, var1);
            int var3 = arg0.field2600[var1];
            if (arg0.field2638[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2638[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2638[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.cg(Lec;IB)I")
    public static final int method2737(class155 arg0, int arg1) {
        if (arg0.field2637 == null || arg1 >= arg0.field2637.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2637[arg1];
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
                    var7 = field282[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method2787(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method86(var12).field1035 || field325)) {
                        for (int var13 = 0; var13 < var11.field2643.length; var13++) {
                            if (var12 + 1 == var11.field2643[var13]) {
                                var7 += var11.field2644[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2672[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2133[field385[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2672[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2031.field45;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2132[var14]) {
                            var7 += field385[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method2787(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method86(var18).field1035 || field325)) {
                        for (int var19 = 0; var19 < var17.field2643.length; var19++) {
                            if (var18 + 1 == var17.field2643[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field414;
                }
                if (var6 == 12) {
                    var7 = field415;
                }
                if (var6 == 13) {
                    int var20 = class157.field2672[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method671(var22);
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
                    var7 = (Statics.field2031.field753 >> 7) + Statics.field86;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2031.field736 >> 7) + Statics.field223;
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

    @ObfuscatedName("cn.cp(IIIIIIIS)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class155.method1264(arg0)) {
            method1932(Statics.field2565[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cj.cz([Lec;IIIIIIII)V")
    public static final void method1932(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2537 || var9.field2540 == 0 || var9.field2611 || method1736(var9) != 0 || field422 == var9) && var9.field2531 == arg1 && (!var9.field2537 || !method165(var9))) {
                int var10 = var9.field2543 + arg6;
                int var11 = var9.field2544 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2540 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2540 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2547 + var10;
                    int var19 = var9.field2554 + var11;
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
                    int var22 = var9.field2547 + var10;
                    int var23 = var9.field2554 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field401 == var9) {
                    field429 = true;
                    field242 = var10;
                    field476 = var11;
                }
                if (!var9.field2537 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field1996;
                    int var25 = class129.field1997 * -918864945;
                    if (class129.field1990 != 0) {
                        var24 = class129.field2002;
                        var25 = class129.field2003;
                    }
                    if (var9.field2640 == 1337) {
                        method2761(var9);
                        if (!field251 && !field388 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field402 == 0 && !field404) {
                                method790(class145.field2290, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class99.field1728; var28++) {
                                int var29 = class99.field1710[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field303.method1590(Statics.field1121, var30, var31, var29) >= 0) {
                                        class37 var34 = class37.method3266(var33);
                                        if (var34.field891 != null) {
                                            var34 = var34.method614();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field402 == 1) {
                                            method790(class145.field2298, field403 + " " + class2.field26 + " " + class2.method1265(65535) + var34.field860, 1, var29, var30, var31);
                                        } else if (!field404) {
                                            String[] var35 = var34.field877;
                                            if (field311) {
                                                var35 = method1843(var35);
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
                                                        method790(var35[var36], class2.method1265(65535) + var34.field860, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method790(class145.field2299, class2.method1265(65535) + var34.field860, 1002, var34.field857 << 14, var30, var31);
                                        } else if ((Statics.field842 & 0x4) == 4) {
                                            method790(field407, field408 + " " + class2.field26 + " " + class2.method1265(65535) + var34.field860, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class31 var38 = field261[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field702.field809 == 1 && (var38.field753 & 0x7F) == 64 && (var38.field736 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field283; var39++) {
                                                class31 var40 = field261[field284[var39]];
                                                if (var40 != null && var38 != var40 && var40.field702.field809 == 1 && var38.field753 == var40.field753 && var38.field736 == var40.field736) {
                                                    method870(var40.field702, field284[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field255; var41++) {
                                                class3 var42 = field365[field367[var41]];
                                                if (var42 != null && var38.field753 == var42.field753 && var38.field736 == var42.field736) {
                                                    method2639(var42, field367[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method870(var38.field702, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field365[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field753 & 0x7F) == 64 && (var43.field736 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field283; var44++) {
                                                class31 var45 = field261[field284[var44]];
                                                if (var45 != null && var45.field702.field809 == 1 && var43.field753 == var45.field753 && var43.field736 == var45.field736) {
                                                    method870(var45.field702, field284[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field255; var46++) {
                                                class3 var47 = field365[field367[var46]];
                                                if (var47 != null && var43 != var47 && var43.field753 == var47.field753 && var43.field736 == var47.field736) {
                                                    method2639(var47, field367[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field379 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2639(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class180 var48 = field349[Statics.field1121][var30][var31];
                                        if (var48 != null) {
                                            for (class26 var49 = (class26) var48.method3183(); var49 != null; var49 = (class26) var48.method3167()) {
                                                class46 var50 = class46.method86(var49.field607);
                                                if (field402 == 1) {
                                                    method790(class145.field2298, field403 + " " + class2.field26 + " " + class2.method1265(16748608) + var50.field1022, 16, var49.field607, var30, var31);
                                                } else if (!field404) {
                                                    String[] var51 = var50.field1036;
                                                    if (field311) {
                                                        var51 = method1843(var51);
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
                                                            method790(var51[var52], class2.method1265(16748608) + var50.field1022, var53, var49.field607, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method790(class145.field2149, class2.method1265(16748608) + var50.field1022, 20, var49.field607, var30, var31);
                                                        }
                                                    }
                                                    method790(class145.field2299, class2.method1265(16748608) + var50.field1022, 1004, var49.field607, var30, var31);
                                                } else if ((Statics.field842 & 0x1) == 1) {
                                                    method790(field407, field408 + " " + class2.field26 + " " + class2.method1265(16748608) + var50.field1022, 17, var49.field607, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field365[field379];
                                method2639(var56, field379, var54, var55);
                            }
                        }
                    } else if (var9.field2640 != 1338) {
                        if (!field388 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var68 = var24 - var10;
                            int var69 = var25 - var11;
                            if (var9.field2541 == 1) {
                                method790(var9.field2536, "", 24, 0, 0, var9.field2538);
                            }
                            if (var9.field2541 == 2 && !field404) {
                                String var70;
                                if (class159.method1845(method1736(var9)) == 0) {
                                    var70 = null;
                                } else if (var9.field2605 == null || var9.field2605.trim().length() == 0) {
                                    var70 = null;
                                } else {
                                    var70 = var9.field2605;
                                }
                                if (var70 != null) {
                                    method790(var70, class2.method1265(65280) + var9.field2641, 25, 0, -1, var9.field2538);
                                }
                            }
                            if (var9.field2541 == 3) {
                                method790(class145.field2307, "", 26, 0, 0, var9.field2538);
                            }
                            if (var9.field2541 == 4) {
                                method790(var9.field2536, "", 28, 0, 0, var9.field2538);
                            }
                            if (var9.field2541 == 5) {
                                method790(var9.field2536, "", 29, 0, 0, var9.field2538);
                            }
                            if (var9.field2541 == 6 && field413 == null) {
                                method790(var9.field2536, "", 30, 0, -1, var9.field2538);
                            }
                            if (var9.field2540 == 2) {
                                int var72 = 0;
                                for (int var73 = 0; var73 < var9.field2554; var73++) {
                                    for (int var74 = 0; var74 < var9.field2547; var74++) {
                                        int var75 = (var9.field2604 + 32) * var74;
                                        int var76 = (var9.field2593 + 32) * var73;
                                        if (var72 < 20) {
                                            var75 += var9.field2594[var72];
                                            var76 += var9.field2551[var72];
                                        }
                                        if (var68 >= var75 && var69 >= var76 && var68 < var75 + 32 && var69 < var76 + 32) {
                                            field485 = var72;
                                            Statics.field52 = var9;
                                            if (var9.field2643[var72] > 0) {
                                                label1260: {
                                                    class46 var77 = class46.method86(var9.field2643[var72] - 1);
                                                    if (field402 == 1) {
                                                        int var78 = method1736(var9);
                                                        boolean var79 = (var78 >> 30 & 0x1) != 0;
                                                        if (var79) {
                                                            if (Statics.field1501 != var9.field2538 || Statics.field841 != var72) {
                                                                method790(class145.field2298, field403 + " " + class2.field26 + " " + class2.method1265(16748608) + var77.field1022, 31, var77.field1020, var72, var9.field2538);
                                                            }
                                                            break label1260;
                                                        }
                                                    }
                                                    if (field404) {
                                                        int var80 = method1736(var9);
                                                        boolean var81 = (var80 >> 30 & 0x1) != 0;
                                                        if (var81) {
                                                            if ((Statics.field842 & 0x10) == 16) {
                                                                method790(field407, field408 + " " + class2.field26 + " " + class2.method1265(16748608) + var77.field1022, 32, var77.field1020, var72, var9.field2538);
                                                            }
                                                            break label1260;
                                                        }
                                                    }
                                                    String[] var82 = var77.field1029;
                                                    if (field311) {
                                                        var82 = method1843(var82);
                                                    }
                                                    int var83 = method1736(var9);
                                                    boolean var84 = (var83 >> 30 & 0x1) != 0;
                                                    if (var84) {
                                                        for (int var85 = 4; var85 >= 3; var85--) {
                                                            if (var82 != null && var82[var85] != null) {
                                                                byte var86;
                                                                if (var85 == 3) {
                                                                    var86 = 36;
                                                                } else {
                                                                    var86 = 37;
                                                                }
                                                                method790(var82[var85], class2.method1265(16748608) + var77.field1022, var86, var77.field1020, var72, var9.field2538);
                                                            } else if (var85 == 4) {
                                                                method790(class145.field2150, class2.method1265(16748608) + var77.field1022, 37, var77.field1020, var72, var9.field2538);
                                                            }
                                                        }
                                                    }
                                                    class159 var10000 = (class159) null;
                                                    if (class159.method542(method1736(var9))) {
                                                        method790(class145.field2298, class2.method1265(16748608) + var77.field1022, 38, var77.field1020, var72, var9.field2538);
                                                    }
                                                    int var87 = method1736(var9);
                                                    boolean var88 = (var87 >> 30 & 0x1) != 0;
                                                    if (var88 && var82 != null) {
                                                        for (int var89 = 2; var89 >= 0; var89--) {
                                                            if (var82[var89] != null) {
                                                                byte var90 = 0;
                                                                if (var89 == 0) {
                                                                    var90 = 33;
                                                                }
                                                                if (var89 == 1) {
                                                                    var90 = 34;
                                                                }
                                                                if (var89 == 2) {
                                                                    var90 = 35;
                                                                }
                                                                method790(var82[var89], class2.method1265(16748608) + var77.field1022, var90, var77.field1020, var72, var9.field2538);
                                                            }
                                                        }
                                                    }
                                                    String[] var91 = var9.field2597;
                                                    if (field311) {
                                                        var91 = method1843(var91);
                                                    }
                                                    if (var91 != null) {
                                                        for (int var92 = 4; var92 >= 0; var92--) {
                                                            if (var91[var92] != null) {
                                                                byte var93 = 0;
                                                                if (var92 == 0) {
                                                                    var93 = 39;
                                                                }
                                                                if (var92 == 1) {
                                                                    var93 = 40;
                                                                }
                                                                if (var92 == 2) {
                                                                    var93 = 41;
                                                                }
                                                                if (var92 == 3) {
                                                                    var93 = 42;
                                                                }
                                                                if (var92 == 4) {
                                                                    var93 = 43;
                                                                }
                                                                method790(var91[var92], class2.method1265(16748608) + var77.field1022, var93, var77.field1020, var72, var9.field2538);
                                                            }
                                                        }
                                                    }
                                                    method790(class145.field2299, class2.method1265(16748608) + var77.field1022, 1005, var77.field1020, var72, var9.field2538);
                                                }
                                            }
                                        }
                                        var72++;
                                    }
                                }
                            }
                            if (var9.field2537) {
                                if (field404) {
                                    int var94 = method1736(var9);
                                    boolean var95 = (var94 >> 21 & 0x1) != 0;
                                    if (var95 && (Statics.field842 & 0x20) == 32) {
                                        method790(field407, field408 + " " + class2.field26 + " " + var9.field2599, 58, 0, var9.field2539, var9.field2538);
                                    }
                                } else {
                                    for (int var96 = 9; var96 >= 5; var96--) {
                                        String var97 = method105(var9, var96);
                                        if (var97 != null) {
                                            method790(var97, var9.field2599, 1007, var96 + 1, var9.field2539, var9.field2538);
                                        }
                                    }
                                    String var98 = method2395(var9);
                                    if (var98 != null) {
                                        method790(var98, var9.field2599, 25, 0, var9.field2539, var9.field2538);
                                    }
                                    for (int var99 = 4; var99 >= 0; var99--) {
                                        String var100 = method105(var9, var99);
                                        if (var100 != null) {
                                            method790(var100, var9.field2599, 57, var99 + 1, var9.field2539, var9.field2538);
                                        }
                                    }
                                    if (class159.method808(method1736(var9))) {
                                        method790(class145.field2154, "", 30, 0, var9.field2539, var9.field2538);
                                    }
                                }
                            }
                        }
                        if (var9.field2540 == 0) {
                            if (!var9.field2537 && method165(var9) && Statics.field986 != var9) {
                                continue;
                            }
                            method1932(arg0, var9.field2538, var12, var13, var14, var15, var10 - var9.field2620, var11 - var9.field2552);
                            if (var9.field2649 != null) {
                                method1932(var9.field2649, var9.field2538, var12, var13, var14, var15, var10 - var9.field2620, var11 - var9.field2552);
                            }
                            class4 var101 = (class4) field245.method3140((long) var9.field2538);
                            if (var101 != null) {
                                if (var101.field55 == 0 && class129.field1996 >= var12 && class129.field1997 * -918864945 >= var13 && class129.field1996 < var14 && class129.field1997 * -918864945 < var15 && !field388 && !field419) {
                                    field395[0] = class145.field2229;
                                    field361[0] = "";
                                    field393[0] = 1006;
                                    field360 = 1;
                                }
                                method1740(var101.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2537) {
                            if (var9.field2639 && class129.field1996 >= var12 && class129.field1997 * -918864945 >= var13 && class129.field1996 < var14 && class129.field1997 * -918864945 < var15) {
                                for (class1 var102 = (class1) field449.method3174(); var102 != null; var102 = (class1) field449.method3176()) {
                                    if (var102.field2) {
                                        var102.method3259();
                                        var102.field18.field2622 = false;
                                    }
                                }
                                if (Statics.field799 == 0) {
                                    field401 = null;
                                    field422 = null;
                                }
                                if (!field388) {
                                    field395[0] = class145.field2229;
                                    field361[0] = "";
                                    field393[0] = 1006;
                                    field360 = 1;
                                }
                            }
                            boolean var103;
                            if (class129.field1996 >= var12 && class129.field1997 * -918864945 >= var13 && class129.field1996 < var14 && class129.field1997 * -918864945 < var15) {
                                var103 = true;
                            } else {
                                var103 = false;
                            }
                            boolean var104 = false;
                            if ((class129.field1995 == 1 || !Statics.field2927 && class129.field1995 == 4) && var103) {
                                var104 = true;
                            }
                            boolean var105 = false;
                            if ((class129.field1990 == 1 || !Statics.field2927 && class129.field1990 == 4) && class129.field2002 >= var12 && class129.field2003 >= var13 && class129.field2002 < var14 && class129.field2003 < var15) {
                                var105 = true;
                            }
                            if (var105) {
                                method471(var9, class129.field2002 - var10, class129.field2003 - var11);
                            }
                            if (field401 != null && field401 != var9 && var103 && class159.method1930(method1736(var9))) {
                                field310 = var9;
                            }
                            if (field422 == var9) {
                                field426 = true;
                                field427 = var10;
                                field428 = var11;
                            }
                            if (var9.field2611) {
                                if (var103 && field448 != 0 && var9.field2627 != null) {
                                    class1 var106 = new class1();
                                    var106.field2 = true;
                                    var106.field18 = var9;
                                    var106.field5 = field448;
                                    var106.field15 = var9.field2627;
                                    field449.method3169(var106);
                                }
                                if (field401 != null || Statics.field158 != null || field388) {
                                    var105 = false;
                                    var104 = false;
                                    var103 = false;
                                }
                                if (!var9.field2651 && var105) {
                                    var9.field2651 = true;
                                    if (var9.field2608 != null) {
                                        class1 var107 = new class1();
                                        var107.field2 = true;
                                        var107.field18 = var9;
                                        var107.field4 = class129.field2002 - var10;
                                        var107.field5 = class129.field2003 - var11;
                                        var107.field15 = var9.field2608;
                                        field449.method3169(var107);
                                    }
                                }
                                if (var9.field2651 && var104 && var9.field2615 != null) {
                                    class1 var108 = new class1();
                                    var108.field2 = true;
                                    var108.field18 = var9;
                                    var108.field4 = class129.field1996 - var10;
                                    var108.field5 = class129.field1997 * -918864945 - var11;
                                    var108.field15 = var9.field2615;
                                    field449.method3169(var108);
                                }
                                if (var9.field2651 && !var104) {
                                    var9.field2651 = false;
                                    if (var9.field2610 != null) {
                                        class1 var109 = new class1();
                                        var109.field2 = true;
                                        var109.field18 = var9;
                                        var109.field4 = class129.field1996 - var10;
                                        var109.field5 = class129.field1997 * -918864945 - var11;
                                        var109.field15 = var9.field2610;
                                        field451.method3169(var109);
                                    }
                                }
                                if (var104 && var9.field2532 != null) {
                                    class1 var110 = new class1();
                                    var110.field2 = true;
                                    var110.field18 = var9;
                                    var110.field4 = class129.field1996 - var10;
                                    var110.field5 = class129.field1997 * -918864945 - var11;
                                    var110.field15 = var9.field2532;
                                    field449.method3169(var110);
                                }
                                if (!var9.field2622 && var103) {
                                    var9.field2622 = true;
                                    if (var9.field2612 != null) {
                                        class1 var111 = new class1();
                                        var111.field2 = true;
                                        var111.field18 = var9;
                                        var111.field4 = class129.field1996 - var10;
                                        var111.field5 = class129.field1997 * -918864945 - var11;
                                        var111.field15 = var9.field2612;
                                        field449.method3169(var111);
                                    }
                                }
                                if (var9.field2622 && var103 && var9.field2613 != null) {
                                    class1 var112 = new class1();
                                    var112.field2 = true;
                                    var112.field18 = var9;
                                    var112.field4 = class129.field1996 - var10;
                                    var112.field5 = class129.field1997 * -918864945 - var11;
                                    var112.field15 = var9.field2613;
                                    field449.method3169(var112);
                                }
                                if (var9.field2622 && !var103) {
                                    var9.field2622 = false;
                                    if (var9.field2614 != null) {
                                        class1 var113 = new class1();
                                        var113.field2 = true;
                                        var113.field18 = var9;
                                        var113.field4 = class129.field1996 - var10;
                                        var113.field5 = class129.field1997 * -918864945 - var11;
                                        var113.field15 = var9.field2614;
                                        field451.method3169(var113);
                                    }
                                }
                                if (var9.field2571 != null) {
                                    class1 var114 = new class1();
                                    var114.field18 = var9;
                                    var114.field15 = var9.field2571;
                                    field450.method3169(var114);
                                }
                                if (var9.field2619 != null && field435 > var9.field2625) {
                                    if (var9.field2635 == null || field435 - var9.field2625 > 32) {
                                        class1 var119 = new class1();
                                        var119.field18 = var9;
                                        var119.field15 = var9.field2619;
                                        field449.method3169(var119);
                                    } else {
                                        label959: for (int var115 = var9.field2625; var115 < field435; var115++) {
                                            int var116 = field434[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2635.length; var117++) {
                                                if (var9.field2635[var117] == var116) {
                                                    class1 var118 = new class1();
                                                    var118.field18 = var9;
                                                    var118.field15 = var9.field2619;
                                                    field449.method3169(var118);
                                                    break label959;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2625 = field435;
                                }
                                if (var9.field2598 != null && field437 > var9.field2654) {
                                    if (var9.field2570 == null || field437 - var9.field2654 > 32) {
                                        class1 var124 = new class1();
                                        var124.field18 = var9;
                                        var124.field15 = var9.field2598;
                                        field449.method3169(var124);
                                    } else {
                                        label935: for (int var120 = var9.field2654; var120 < field437; var120++) {
                                            int var121 = field436[var120 & 0x1F];
                                            for (int var122 = 0; var122 < var9.field2570.length; var122++) {
                                                if (var9.field2570[var122] == var121) {
                                                    class1 var123 = new class1();
                                                    var123.field18 = var9;
                                                    var123.field15 = var9.field2598;
                                                    field449.method3169(var123);
                                                    break label935;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2654 = field437;
                                }
                                if (var9.field2623 != null && field439 > var9.field2655) {
                                    if (var9.field2624 == null || field439 - var9.field2655 > 32) {
                                        class1 var129 = new class1();
                                        var129.field18 = var9;
                                        var129.field15 = var9.field2623;
                                        field449.method3169(var129);
                                    } else {
                                        label911: for (int var125 = var9.field2655; var125 < field439; var125++) {
                                            int var126 = field353[var125 & 0x1F];
                                            for (int var127 = 0; var127 < var9.field2624.length; var127++) {
                                                if (var9.field2624[var127] == var126) {
                                                    class1 var128 = new class1();
                                                    var128.field18 = var9;
                                                    var128.field15 = var9.field2623;
                                                    field449.method3169(var128);
                                                    break label911;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2655 = field439;
                                }
                                if (field482 > var9.field2549 && var9.field2628 != null) {
                                    class1 var130 = new class1();
                                    var130.field18 = var9;
                                    var130.field15 = var9.field2628;
                                    field449.method3169(var130);
                                }
                                if (field441 > var9.field2549 && var9.field2588 != null) {
                                    class1 var131 = new class1();
                                    var131.field18 = var9;
                                    var131.field15 = var9.field2588;
                                    field449.method3169(var131);
                                }
                                if (field442 > var9.field2549 && var9.field2609 != null) {
                                    class1 var132 = new class1();
                                    var132.field18 = var9;
                                    var132.field15 = var9.field2609;
                                    field449.method3169(var132);
                                }
                                if (field343 > var9.field2549 && var9.field2629 != null) {
                                    class1 var133 = new class1();
                                    var133.field18 = var9;
                                    var133.field15 = var9.field2629;
                                    field449.method3169(var133);
                                }
                                if (field444 > var9.field2549 && var9.field2583 != null) {
                                    class1 var134 = new class1();
                                    var134.field18 = var9;
                                    var134.field15 = var9.field2583;
                                    field449.method3169(var134);
                                }
                                if (field445 > var9.field2549 && var9.field2632 != null) {
                                    class1 var135 = new class1();
                                    var135.field18 = var9;
                                    var135.field15 = var9.field2632;
                                    field449.method3169(var135);
                                }
                                var9.field2549 = field433;
                                if (var9.field2633 != null) {
                                    for (int var136 = 0; var136 < field469; var136++) {
                                        class1 var137 = new class1();
                                        var137.field18 = var9;
                                        var137.field11 = field471[var136];
                                        var137.field9 = field326[var136];
                                        var137.field15 = var9.field2633;
                                        field449.method3169(var137);
                                    }
                                }
                            }
                        }
                        if (!var9.field2537 && field401 == null && Statics.field158 == null && !field388) {
                            if ((var9.field2653 >= 0 || var9.field2557 != 0) && class129.field1996 >= var12 && class129.field1997 * -918864945 >= var13 && class129.field1996 < var14 && class129.field1997 * -918864945 < var15) {
                                if (var9.field2653 >= 0) {
                                    Statics.field986 = arg0[var9.field2653];
                                } else {
                                    Statics.field986 = var9;
                                }
                            }
                            if (var9.field2540 == 8 && class129.field1996 >= var12 && class129.field1997 * -918864945 >= var13 && class129.field1996 < var14 && class129.field1997 * -918864945 < var15) {
                                Statics.field2022 = var9;
                            }
                            if (var9.field2630 > var9.field2554) {
                                method475(var9, var9.field2547 + var10, var11, var9.field2554, var9.field2630, class129.field1996, class129.field1997 * -918864945);
                            }
                        }
                    } else if ((field372 == 0 || field372 == 3) && (class129.field1990 == 1 || !Statics.field2927 && class129.field1990 == 4)) {
                        int var57 = class129.field2002 - 25 - var10;
                        int var58 = class129.field2003 - 5 - var11;
                        if (var57 >= 0 && var58 >= 0 && var57 < 146 && var58 < 151 && (var57 < 0 || var57 > 23 || var58 < 117 || var58 > 142)) {
                            var57 -= 73;
                            var58 -= 75;
                            int var59 = field330 + field315 & 0x7FF;
                            int var60 = class85.field1479[var59];
                            int var61 = class85.field1465[var59];
                            int var62 = (field378 + 256) * var60 >> 8;
                            int var63 = (field378 + 256) * var61 >> 8;
                            int var64 = var57 * var63 + var58 * var62 >> 11;
                            int var65 = var58 * var63 - var57 * var62 >> 11;
                            int var66 = Statics.field2031.field753 + var64 >> 7;
                            int var67 = Statics.field2031.field736 - var65 >> 7;
                            field285.method2312(87);
                            field285.method2069(18);
                            field285.method2115(Statics.field223 + var67);
                            field285.method2115(Statics.field86 + var66);
                            field285.method2088(class126.field1969[82] ? (class126.field1969[81] ? 2 : 1) : 0);
                            field285.method2069(var57);
                            field285.method2069(var58);
                            field285.method2195(field330);
                            field285.method2069(57);
                            field285.method2069(field315);
                            field285.method2069(field378);
                            field285.method2069(89);
                            field285.method2195(Statics.field2031.field753);
                            field285.method2195(Statics.field2031.field736);
                            field285.method2069(63);
                            field480 = var66;
                            field481 = var67;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.cm([Lec;II)V")
    public static final void method1933(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2540 == 0) {
                    if (var3.field2649 != null) {
                        method1933(var3.field2649, arg1);
                    }
                    class4 var4 = (class4) field245.method3140((long) var3.field2538);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class155.method1264(var5)) {
                            method1933(Statics.field2565[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2548 != null) {
                    class1 var6 = new class1();
                    var6.field18 = var3;
                    var6.field15 = var3.field2548;
                    class33.method124(var6, 200000);
                }
                if (arg1 == 1 && var3.field2634 != null) {
                    if (var3.field2539 >= 0) {
                        class155 var7 = class155.method2787(var3.field2538);
                        if (var7 == null || var7.field2649 == null || var3.field2539 >= var7.field2649.length || var7.field2649[var3.field2539] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field18 = var3;
                    var8.field15 = var3.field2634;
                    class33.method124(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("q.ci(Lec;III)V")
    public static final void method471(class155 arg0, int arg1, int arg2) {
        if (field401 != null || field388 || arg0 == null || method84(arg0) == null) {
            return;
        }
        field401 = arg0;
        field422 = method84(arg0);
        field423 = arg1;
        field424 = arg2;
        Statics.field799 = 0;
        field278 = false;
        if (field360 > 0) {
            method2434(field360 - 1);
        }
    }

    @ObfuscatedName("dy.cy(IS)V")
    public static void method2434(int arg0) {
        Statics.field503 = new class28();
        Statics.field503.field632 = field320[arg0];
        Statics.field503.field631 = field392[arg0];
        Statics.field503.field633 = field393[arg0];
        Statics.field503.field636 = field394[arg0];
        Statics.field503.field635 = field395[arg0];
    }

    @ObfuscatedName("ev.ch(Lec;I)V")
    public static void method2761(class155 arg0) {
        if (field323 == arg0.field2657) {
            field470[arg0.field2656] = true;
        }
    }

    @ObfuscatedName("bv.cf(I)V")
    public static void method1554() {
        for (class4 var0 = (class4) field245.method3139(); var0 != null; var0 = (class4) field245.method3146()) {
            int var1 = var0.field60;
            if (class155.method1264(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2565[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2537;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2887;
                    class155 var6 = class155.method2787(var5);
                    if (var6 != null) {
                        method2761(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.cj(Lec;I)Lec;")
    public static class155 method84(class155 arg0) {
        class155 var1 = arg0;
        int var2 = class159.method2848(method1736(arg0));
        class155 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class155.method2787(var1.field2531);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class155 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2545;
        }
        return var5;
    }

    @ObfuscatedName("cz.cx([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1843(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cw.cr(IB)V")
    public static final void method1744(int arg0) {
        if (!class155.method1264(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2565[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2647 = 0;
                var3.field2645 = 0;
            }
        }
    }

    @ObfuscatedName("dr.cl([Lec;IB)V")
    public static final void method2483(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null && var3.field2531 == arg1 && (!var3.field2537 || !method165(var3))) {
                if (var3.field2540 == 0) {
                    if (!var3.field2537 && method165(var3) && Statics.field986 != var3) {
                        continue;
                    }
                    method2483(arg0, var3.field2538);
                    if (var3.field2649 != null) {
                        method2483(var3.field2649, var3.field2538);
                    }
                    class4 var4 = (class4) field245.method3140((long) var3.field2538);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class155.method1264(var5)) {
                            method2483(Statics.field2565[var5], -1);
                        }
                    }
                }
                if (var3.field2540 == 6) {
                    if (var3.field2574 != -1 || var3.field2575 != -1) {
                        boolean var6 = method545(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2575;
                        } else {
                            var7 = var3.field2574;
                        }
                        if (var7 != -1) {
                            class39 var8 = class39.method2627(var7);
                            var3.field2645 += field240;
                            while (var3.field2645 > var8.field918[var3.field2647]) {
                                var3.field2645 -= var8.field918[var3.field2647];
                                var3.field2647++;
                                if (var3.field2647 >= var8.field920.length) {
                                    var3.field2647 -= var8.field924;
                                    if (var3.field2647 < 0 || var3.field2647 >= var8.field920.length) {
                                        var3.field2647 = 0;
                                    }
                                }
                                method2761(var3);
                            }
                        }
                    }
                    if (var3.field2582 != 0 && !var3.field2537) {
                        int var9 = var3.field2582 >> 16;
                        int var10 = var3.field2582 << 16 >> 16;
                        int var11 = field240 * var9;
                        int var12 = field240 * var10;
                        var3.field2578 = var3.field2578 + var11 & 0x7FF;
                        var3.field2579 = var3.field2579 + var12 & 0x7FF;
                        method2761(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.cb(IB)V")
    public static final void method134(int arg0) {
        method1554();
        for (class21 var1 = (class21) class21.field553.method3174(); var1 != null; var1 = (class21) class21.field553.method3176()) {
            if (var1.field556 != null) {
                var1.method472();
            }
        }
        int var2 = class47.method756(arg0).field1068;
        if (var2 == 0) {
            return;
        }
        int var3 = class157.field2672[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1753(0.9D);
                ((class89) Statics.field1473).method1835(0.9D);
            }
            if (var3 == 2) {
                class85.method1753(0.8D);
                ((class89) Statics.field1473).method1835(0.8D);
            }
            if (var3 == 3) {
                class85.method1753(0.7D);
                ((class89) Statics.field1473).method1835(0.7D);
            }
            if (var3 == 4) {
                class85.method1753(0.6D);
                ((class89) Statics.field1473).method1835(0.6D);
            }
            class46.field1019.method3100();
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
            if (field483 != var4) {
                if (field483 == 0 && field484 != -1) {
                    Statics.method31(Statics.field1860, field484, 0, var4, false);
                    field352 = false;
                } else if (var4 == 0) {
                    Statics.field2721.method3058();
                    class164.field2722 = 1;
                    Statics.field2723 = null;
                    field352 = false;
                } else if (class164.field2722 == 0) {
                    Statics.field2721.method2965(var4);
                } else {
                    Statics.field1565 = var4;
                }
                field483 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field486 = 127;
            }
            if (var3 == 1) {
                field486 = 96;
            }
            if (var3 == 2) {
                field486 = 64;
            }
            if (var3 == 3) {
                field486 = 32;
            }
            if (var3 == 4) {
                field486 = 0;
            }
        }
        if (var2 == 5) {
            field387 = var3;
        }
        if (var2 == 6) {
            field411 = var3;
        }
        if (var2 == 9) {
            field391 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field430 = 127;
            }
            if (var3 == 1) {
                field430 = 96;
            }
            if (var3 == 2) {
                field430 = 64;
            }
            if (var3 == 3) {
                field430 = 32;
            }
            if (var3 == 4) {
                field430 = 0;
            }
        }
        if (var2 == 17) {
            field417 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field271 = (class18) class100.method1742(class18.method600(), var3);
            if (field271 == null) {
                field271 = class18.field513;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field379 = -1;
        } else {
            field379 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("i.cu(Lb;ZB)V")
    public static final void method147(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2887;
        arg0.method3259();
        if (arg1) {
            class155.method547(var2);
        }
        for (class182 var4 = (class182) field452.method3139(); var4 != null; var4 = (class182) field452.method3146()) {
            if ((long) var2 == (var4.field2887 >> 48 & 0xFFFFL)) {
                var4.method3259();
            }
        }
        class155 var5 = class155.method2787(var3);
        if (var5 != null) {
            method2761(var5);
        }
        method497();
        if (field421 != -1) {
            int var6 = field421;
            if (class155.method1264(var6)) {
                method1933(Statics.field2565[var6], 1);
            }
        }
    }

    @ObfuscatedName("bn.cq(Lec;I)Z")
    public static final boolean method1319(class155 arg0) {
        int var1 = arg0.field2640;
        if (var1 == 205) {
            field292 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field506.method2871(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field506.method2872(var4, var5 == 1);
        }
        if (var1 == 324) {
            field506.method2873(false);
        }
        if (var1 == 325) {
            field506.method2873(true);
        }
        if (var1 == 326) {
            field285.method2312(224);
            field506.method2883(field285);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.di(IIIILbw;B)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method153(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field330 + field315 & 0x7FF;
        int var7 = class85.field1479[var6];
        int var8 = class85.field1465[var6];
        int var9 = var7 * 256 / (field378 + 256);
        int var10 = var8 * 256 / (field378 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field307.method1452(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("c.dg(Ljava/lang/String;ZI)Z")
    public static boolean method33(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method2544(arg0, Statics.field2061);
        for (int var3 = 0; var3 < field500; var3++) {
            if (var2.equalsIgnoreCase(class212.method2544(field347[var3].field218, Statics.field2061)) && (!arg1 || field347[var3].field210 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method2544(Statics.field2031.field39, Statics.field2061))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dk.df(Ljava/lang/String;I)Z")
    public static boolean method2391(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method2544(arg0, Statics.field2061);
        for (int var2 = 0; var2 < field381; var2++) {
            class8 var3 = field505[var2];
            if (var1.equalsIgnoreCase(class212.method2544(var3.field123, Statics.field2061))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method2544(var3.field120, Statics.field2061))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("er.dq(Ljava/lang/String;B)V")
    public static final void method2525(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field500 < 200 || field281 == 1) || field500 >= 400) {
            class10.method995(30, "", class145.field2314);
            return;
        }
        String var1 = class212.method2544(arg0, Statics.field2061);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field500; var2++) {
            class16 var3 = field347[var2];
            String var4 = class212.method2544(var3.field218, Statics.field2061);
            if (var4 != null && var4.equals(var1)) {
                class10.method995(30, "", arg0 + class145.field2315);
                return;
            }
            if (var3.field211 != null) {
                String var5 = class212.method2544(var3.field211, Statics.field2061);
                if (var5 != null && var5.equals(var1)) {
                    class10.method995(30, "", arg0 + class145.field2315);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field381; var6++) {
            class8 var7 = field505[var6];
            String var8 = class212.method2544(var7.field123, Statics.field2061);
            if (var8 != null && var8.equals(var1)) {
                class10.method995(30, "", class145.field2239 + arg0 + class145.field2321);
                return;
            }
            if (var7.field120 != null) {
                String var9 = class212.method2544(var7.field120, Statics.field2061);
                if (var9 != null && var9.equals(var1)) {
                    class10.method995(30, "", class145.field2239 + arg0 + class145.field2321);
                    return;
                }
            }
        }
        if (class212.method2544(Statics.field2031.field39, Statics.field2061).equals(var1)) {
            class10.method995(30, "", class145.field2318);
        } else {
            field285.method2312(169);
            field285.method2069(class108.method546(arg0));
            field285.method2074(arg0);
        }
    }

    @ObfuscatedName("af.dn(Ljava/lang/String;I)V")
    public static final void method859(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method2544(arg0, Statics.field2061);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field500; var2++) {
            class16 var3 = field347[var2];
            String var4 = var3.field218;
            String var5 = class212.method2544(var4, Statics.field2061);
            if (class118.method1840(arg0, var1, var4, var5)) {
                field500--;
                for (int var6 = var2; var6 < field500; var6++) {
                    field347[var6] = field347[var6 + 1];
                }
                field441 = field433;
                field285.method2312(148);
                field285.method2069(class108.method546(arg0));
                field285.method2074(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("db.de(Ljava/lang/String;B)V")
    public static final void method2465(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method2544(arg0, Statics.field2061);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field381; var2++) {
            class8 var3 = field505[var2];
            String var4 = var3.field123;
            String var5 = class212.method2544(var4, Statics.field2061);
            if (class118.method1840(arg0, var1, var4, var5)) {
                field381--;
                for (int var6 = var2; var6 < field381; var6++) {
                    field505[var6] = field505[var6 + 1];
                }
                field441 = field433;
                field285.method2312(186);
                field285.method2069(class108.method546(arg0));
                field285.method2074(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cn.do(Lec;I)I")
    public static int method1736(class155 arg0) {
        class182 var1 = (class182) field452.method3140(((long) arg0.field2538 << 32) + (long) arg0.field2539);
        return var1 == null ? arg0.field2650 : var1.field2872;
    }

    @ObfuscatedName("u.da(Lec;I)Z")
    public static boolean method165(class155 arg0) {
        if (field419) {
            if (method1736(arg0) != 0) {
                return false;
            }
            if (arg0.field2540 == 0) {
                return false;
            }
        }
        return arg0.field2550;
    }

    @ObfuscatedName("n.dh(Lec;IB)Ljava/lang/String;")
    public static String method105(class155 arg0, int arg1) {
        int var2 = method1736(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2626 == null) {
            return null;
        } else if (arg0.field2589 == null || arg0.field2589.length <= arg1 || arg0.field2589[arg1] == null || arg0.field2589[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2589[arg1];
        }
    }

    @ObfuscatedName("dk.dd(Lec;B)Ljava/lang/String;")
    public static String method2395(class155 arg0) {
        if (class159.method1845(method1736(arg0)) == 0) {
            return null;
        } else if (arg0.field2605 == null || arg0.field2605.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2605;
        }
    }

    @ObfuscatedName("cf.du(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1926(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field438 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field438 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field438 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field438 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field438 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field324 + "/";
    }

    @ObfuscatedName("y.dc(Ljava/lang/String;ZB)V")
    public static void method130(String arg0, boolean arg1) {
        Statics.field1987.field2469 = false;
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1016; var5++) {
            class46 var6 = class46.method86(var5);
            if ((!arg1 || var6.field1037) && var6.field1053 == -1 && var6.field1022.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1350 = -1;
                    Statics.field2945 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        Statics.field2945 = var3;
        Statics.field126 = 0;
        Statics.field1350 = var4;
        String[] var9 = new String[Statics.field1350];
        for (int var10 = 0; var10 < Statics.field1350; var10++) {
            var9[var10] = class46.method86(var3[var10]).field1022;
        }
        class113.method1355(var9, Statics.field2945);
        Statics.field1987.method2696();
        Statics.field1987.field2469 = true;
    }
}

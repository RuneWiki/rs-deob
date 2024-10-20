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

public final class client extends class135 {

    @ObfuscatedName("client.i")
    public static boolean field347 = true;

    @ObfuscatedName("client.k")
    public static int field443 = 1;

    @ObfuscatedName("client.h")
    public static int field241 = 0;

    @ObfuscatedName("client.n")
    public static int field372 = 0;

    @ObfuscatedName("client.z")
    public static boolean field435 = false;

    @ObfuscatedName("client.t")
    public static boolean field245 = false;

    @ObfuscatedName("client.w")
    public static class211[] field456 = new class211[4];

    @ObfuscatedName("client.v")
    public static int field293 = 0;

    @ObfuscatedName("client.a")
    public static int field352 = 0;

    @ObfuscatedName("client.m")
    public static boolean field497 = true;

    @ObfuscatedName("client.c")
    public static int field249 = 0;

    @ObfuscatedName("client.j")
    public static long field250 = -1L;

    @ObfuscatedName("client.l")
    public static int field504 = -1;

    @ObfuscatedName("client.u")
    public static int field252 = -1;

    @ObfuscatedName("client.r")
    public static int field329 = -1;

    @ObfuscatedName("client.an")
    public static boolean field254 = true;

    @ObfuscatedName("client.ao")
    public static boolean field255 = false;

    @ObfuscatedName("client.ah")
    public static int field259 = 0;

    @ObfuscatedName("client.ai")
    public static int field257 = 0;

    @ObfuscatedName("client.aa")
    public static int field431 = 0;

    @ObfuscatedName("client.ag")
    public static int field463 = 0;

    @ObfuscatedName("client.ar")
    public static int field260 = 0;

    @ObfuscatedName("client.al")
    public static int field261 = 0;

    @ObfuscatedName("client.ae")
    public static int field262 = 0;

    @ObfuscatedName("client.ak")
    public static int field263 = 0;

    @ObfuscatedName("client.at")
    public static int field397 = 0;

    @ObfuscatedName("client.am")
    public static class110 field265 = new class110(new byte[5000]);

    @ObfuscatedName("client.aq")
    public static class18 field266 = class18.field508;

    @ObfuscatedName("client.aj")
    public static int field469 = 0;

    @ObfuscatedName("client.ap")
    public static int field269 = 0;

    @ObfuscatedName("client.af")
    public static int field270 = 0;

    @ObfuscatedName("client.bb")
    public static int field271 = 0;

    @ObfuscatedName("client.bk")
    public static int field272 = 0;

    @ObfuscatedName("client.bh")
    public static int field273 = 0;

    @ObfuscatedName("client.br")
    public static int field274 = 0;

    @ObfuscatedName("client.bd")
    public static int field275 = 0;

    @ObfuscatedName("client.bv")
    public static class31[] field277 = new class31[32768];

    @ObfuscatedName("client.ci")
    public static int field278 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field279 = new int[32768];

    @ObfuscatedName("client.cp")
    public static class113 field281 = new class113(5000);

    @ObfuscatedName("client.cy")
    public static class113 field282 = new class113(5000);

    @ObfuscatedName("client.ch")
    public static class113 field283 = new class113(5000);

    @ObfuscatedName("client.cn")
    public static int field284 = 0;

    @ObfuscatedName("client.ce")
    public static int field285 = 0;

    @ObfuscatedName("client.cd")
    public static int field286 = 0;

    @ObfuscatedName("client.cl")
    public static int field287 = 0;

    @ObfuscatedName("client.cz")
    public static int field288 = 0;

    @ObfuscatedName("client.cv")
    public static int field493 = 0;

    @ObfuscatedName("client.cb")
    public static int field290 = 0;

    @ObfuscatedName("client.cs")
    public static int field291 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field360 = false;

    @ObfuscatedName("client.cg")
    public static int field296 = 0;

    @ObfuscatedName("client.dh")
    public static int field294 = 0;

    @ObfuscatedName("client.dv")
    public static int field295 = 1;

    @ObfuscatedName("client.dn")
    public static int field413 = 0;

    @ObfuscatedName("client.dd")
    public static int field297 = 1;

    @ObfuscatedName("client.dc")
    public static int field438 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field300 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field301 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field359 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field253 = 0;

    @ObfuscatedName("client.dr")
    public static int field305 = 2;

    @ObfuscatedName("client.dm")
    public static int field306 = 0;

    @ObfuscatedName("client.dz")
    public static int field307 = 2;

    @ObfuscatedName("client.dp")
    public static int field371 = 0;

    @ObfuscatedName("client.dq")
    public static int field309 = 1;

    @ObfuscatedName("client.da")
    public static int field310 = 0;

    @ObfuscatedName("client.dy")
    public static int field311 = 0;

    @ObfuscatedName("client.ed")
    public static int field312 = 2;

    @ObfuscatedName("client.er")
    public static int field313 = 0;

    @ObfuscatedName("client.ey")
    public static int field314 = 1;

    @ObfuscatedName("client.ev")
    public static int field315 = 0;

    @ObfuscatedName("client.eq")
    public static int field316 = 0;

    @ObfuscatedName("client.eo")
    public static int field317 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field318 = 5063219;

    @ObfuscatedName("client.ec")
    public static int field319 = 3353893;

    @ObfuscatedName("client.fv")
    public static int field299 = 7759444;

    @ObfuscatedName("client.ff")
    public static boolean field321 = false;

    @ObfuscatedName("client.fa")
    public static int field322 = 0;

    @ObfuscatedName("client.fb")
    public static int field324 = 128;

    @ObfuscatedName("client.ft")
    public static int field325 = 0;

    @ObfuscatedName("client.fq")
    public static int field326 = 0;

    @ObfuscatedName("client.fd")
    public static int field327 = 0;

    @ObfuscatedName("client.fl")
    public static int field328 = 0;

    @ObfuscatedName("client.fe")
    public static int field302 = 0;

    @ObfuscatedName("client.fy")
    public static int field330 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field331 = false;

    @ObfuscatedName("client.fj")
    public static int field332 = 0;

    @ObfuscatedName("client.fw")
    public static int field333 = 0;

    @ObfuscatedName("client.fi")
    public static int field334 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field437 = new int[field334];

    @ObfuscatedName("client.fx")
    public static int[] field416 = new int[field334];

    @ObfuscatedName("client.fn")
    public static int[] field337 = new int[field334];

    @ObfuscatedName("client.fz")
    public static int[] field338 = new int[field334];

    @ObfuscatedName("client.fs")
    public static int[] field339 = new int[field334];

    @ObfuscatedName("client.gb")
    public static int[] field340 = new int[field334];

    @ObfuscatedName("client.gj")
    public static int[] field341 = new int[field334];

    @ObfuscatedName("client.gf")
    public static String[] field251 = new String[field334];

    @ObfuscatedName("client.gs")
    public static int[][] field363 = new int[104][104];

    @ObfuscatedName("client.gw")
    public static int field344 = 0;

    @ObfuscatedName("client.go")
    public static int field345 = -1;

    @ObfuscatedName("client.gk")
    public static int field346 = -1;

    @ObfuscatedName("client.gn")
    public static int field246 = 0;

    @ObfuscatedName("client.gx")
    public static int field320 = 0;

    @ObfuscatedName("client.ge")
    public static int field423 = 0;

    @ObfuscatedName("client.gg")
    public static int field350 = 0;

    @ObfuscatedName("client.gt")
    public static int field351 = 0;

    @ObfuscatedName("client.gr")
    public static int field484 = 0;

    @ObfuscatedName("client.ga")
    public static int field353 = 0;

    @ObfuscatedName("client.gv")
    public static int field490 = 0;

    @ObfuscatedName("client.gi")
    public static int field370 = 0;

    @ObfuscatedName("client.gp")
    public static int field243 = 0;

    @ObfuscatedName("client.gm")
    public static boolean field357 = false;

    @ObfuscatedName("client.gz")
    public static int field358 = 0;

    @ObfuscatedName("client.gd")
    public static int field488 = 0;

    @ObfuscatedName("client.gu")
    public static class3[] field401 = new class3[2048];

    @ObfuscatedName("client.hg")
    public static int field478 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field247 = new int[2048];

    @ObfuscatedName("client.hi")
    public static int field394 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field364 = new int[2048];

    @ObfuscatedName("client.hj")
    public static class110[] field365 = new class110[2048];

    @ObfuscatedName("client.hs")
    public static int field366 = -1;

    @ObfuscatedName("client.hb")
    public static int field367 = 0;

    @ObfuscatedName("client.hv")
    public static int field368 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field369 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field483 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hk")
    public static String[] field349 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field248 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field374 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.he")
    public static int field242 = -1;

    @ObfuscatedName("client.hp")
    public static class182[][][] field375 = new class182[4][104][104];

    @ObfuscatedName("client.ha")
    public static class182 field376 = new class182();

    @ObfuscatedName("client.hy")
    public static class182 field414 = new class182();

    @ObfuscatedName("client.hx")
    public static class182 field378 = new class182();

    @ObfuscatedName("client.hm")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field430 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field381 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field496 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field383 = false;

    @ObfuscatedName("client.ir")
    public static int field377 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field385 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field384 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field387 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field388 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field389 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field390 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field391 = -1;

    @ObfuscatedName("client.iq")
    public static int field392 = -1;

    @ObfuscatedName("client.im")
    public static int field467 = 0;

    @ObfuscatedName("client.id")
    public static int field289 = 50;

    @ObfuscatedName("client.ij")
    public static int field395 = 0;

    @ObfuscatedName("client.it")
    public static String field396 = null;

    @ObfuscatedName("client.ig")
    public static boolean field486 = false;

    @ObfuscatedName("client.jq")
    public static int field398 = -1;

    @ObfuscatedName("client.jy")
    public static int field399 = -1;

    @ObfuscatedName("client.jz")
    public static String field400 = null;

    @ObfuscatedName("client.jd")
    public static String field393 = null;

    @ObfuscatedName("client.jn")
    public static int field402 = -1;

    @ObfuscatedName("client.jo")
    public static class179 field403 = new class179(8);

    @ObfuscatedName("client.jp")
    public static int field404 = 0;

    @ObfuscatedName("client.jf")
    public static int field405 = 0;

    @ObfuscatedName("client.jk")
    public static class157 field406 = null;

    @ObfuscatedName("client.ji")
    public static int field407 = 0;

    @ObfuscatedName("client.jr")
    public static int field408 = 0;

    @ObfuscatedName("client.jb")
    public static int field409 = 0;

    @ObfuscatedName("client.jh")
    public static int field410 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field411 = false;

    @ObfuscatedName("client.jt")
    public static boolean field412 = false;

    @ObfuscatedName("client.js")
    public static boolean field502 = false;

    @ObfuscatedName("client.jc")
    public static class157 field419 = null;

    @ObfuscatedName("client.jx")
    public static class157 field415 = null;

    @ObfuscatedName("client.jl")
    public static int field356 = 0;

    @ObfuscatedName("client.ju")
    public static int field355 = 0;

    @ObfuscatedName("client.je")
    public static class157 field418 = null;

    @ObfuscatedName("client.ja")
    public static boolean field494 = false;

    @ObfuscatedName("client.jw")
    public static int field420 = -1;

    @ObfuscatedName("client.jv")
    public static int field343 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field422 = false;

    @ObfuscatedName("client.kg")
    public static int field361 = -1;

    @ObfuscatedName("client.kn")
    public static int field380 = -1;

    @ObfuscatedName("client.kb")
    public static boolean field425 = false;

    @ObfuscatedName("client.kr")
    public static int field446 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field336 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field428 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field429 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field373 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field439 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field432 = 0;

    @ObfuscatedName("client.ky")
    public static int field335 = 0;

    @ObfuscatedName("client.kk")
    public static int field434 = 0;

    @ObfuscatedName("client.kw")
    public static int field426 = 0;

    @ObfuscatedName("client.kl")
    public static int field436 = 0;

    @ObfuscatedName("client.kc")
    public static int field480 = 0;

    @ObfuscatedName("client.km")
    public static int field292 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field427 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field440 = new String[1000];

    @ObfuscatedName("client.kh")
    public static int field441 = 0;

    @ObfuscatedName("client.lz")
    public static class182 field442 = new class182();

    @ObfuscatedName("client.lk")
    public static class182 field475 = new class182();

    @ObfuscatedName("client.lx")
    public static class182 field444 = new class182();

    @ObfuscatedName("client.lr")
    public static class179 field445 = new class179(512);

    @ObfuscatedName("client.li")
    public static int field417 = 0;

    @ObfuscatedName("client.lu")
    public static int field447 = -2;

    @ObfuscatedName("client.lb")
    public static boolean[] field264 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field449 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field450 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field451 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field452 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field453 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field454 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field455 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field471 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.le")
    public static int field457 = 0;

    @ObfuscatedName("client.lv")
    public static int field458 = 0;

    @ObfuscatedName("client.lm")
    public static String field459 = "";

    @ObfuscatedName("client.lw")
    public static long[] field461 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field342 = 0;

    @ObfuscatedName("client.ls")
    public static int field298 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field464 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field465 = new int[128];

    @ObfuscatedName("client.me")
    public static long field474 = -1L;

    @ObfuscatedName("client.mp")
    public static String field495 = null;

    @ObfuscatedName("client.mk")
    public static String field468 = null;

    @ObfuscatedName("client.mq")
    public static int field477 = -1;

    @ObfuscatedName("client.mn")
    public static int field470 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field308 = new int[1000];

    @ObfuscatedName("client.mg")
    public static int[] field472 = new int[1000];

    @ObfuscatedName("client.ms")
    public static class73[] field473 = new class73[1000];

    @ObfuscatedName("client.my")
    public static int field362 = 0;

    @ObfuscatedName("client.md")
    public static int field462 = 0;

    @ObfuscatedName("client.mx")
    public static int field476 = 0;

    @ObfuscatedName("client.mu")
    public static int field433 = 255;

    @ObfuscatedName("client.mm")
    public static int field479 = -1;

    @ObfuscatedName("client.mz")
    public static boolean field448 = false;

    @ObfuscatedName("client.nv")
    public static int field487 = 127;

    @ObfuscatedName("client.ni")
    public static int field481 = 127;

    @ObfuscatedName("client.nb")
    public static int field482 = 0;

    @ObfuscatedName("client.no")
    public static int[] field256 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field348 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field485 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field238 = new int[50];

    @ObfuscatedName("client.nh")
    public static class53[] field354 = new class53[50];

    @ObfuscatedName("client.nu")
    public static boolean field382 = false;

    @ObfuscatedName("client.nf")
    public static boolean[] field489 = new boolean[5];

    @ObfuscatedName("client.oc")
    public static int[] field424 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field491 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field466 = new int[5];

    @ObfuscatedName("client.ok")
    public static int field267 = 0;

    @ObfuscatedName("client.oq")
    public static int field304 = 0;

    @ObfuscatedName("client.oy")
    public static class16[] field258 = new class16[400];

    @ObfuscatedName("client.ov")
    public static class178 field421 = new class178();

    @ObfuscatedName("client.ow")
    public static int field498 = 0;

    @ObfuscatedName("client.oz")
    public static class8[] field499 = new class8[400];

    @ObfuscatedName("client.ot")
    public static class162 field500 = new class162();

    @ObfuscatedName("client.oh")
    public static int field501 = -1;

    @ObfuscatedName("client.os")
    public static int field244 = -1;

    @ObfuscatedName("client.op")
    public static class203[] field503 = new class203[6];

    @ObfuscatedName("client.e(B)V")
    public final void method163() {
    }

    public final void init() {
        if (!this.method2639()) {
            return;
        }
        class173[] var1 = class173.method442();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2840);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2840)) {
                    case 1:
                        field443 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field2042 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field241 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field1767 = var4;
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                            field435 = true;
                        } else {
                            field435 = false;
                        }
                        break;
                    case 6:
                        field293 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field240 = (class144) class100.method1330(Statics.method2631(), Integer.parseInt(var4));
                        if (Statics.field240 == class144.field2155) {
                            Statics.field1450 = class195.field2923;
                        } else {
                            Statics.field1450 = class195.field2928;
                        }
                        break;
                    case 8:
                        Statics.field163 = var4;
                        break;
                    case 9:
                        field372 = Integer.parseInt(var4);
                    case 10:
                    default:
                        break;
                    case 11:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                        }
                        break;
                    case 12:
                        Statics.field985 = class143.method2616(Integer.parseInt(var4));
                }
            }
        }
        class80.field1396 = false;
        field245 = false;
        Statics.field1830 = this.getCodeBase().getHost();
        String var5 = Statics.field985.field2141;
        byte var6 = 0;
        try {
            Statics.field2103 = 16;
            Statics.field2136 = var6;
            try {
                Statics.field1917 = System.getProperty("os.name");
            } catch (Exception var67) {
                Statics.field1917 = "Unknown";
            }
            Statics.field2701 = Statics.field1917.toLowerCase();
            try {
                Statics.field2109 = System.getProperty("user.home");
                if (Statics.field2109 != null) {
                    Statics.field2109 = Statics.field2109 + "/";
                }
            } catch (Exception var66) {
            }
            try {
                if (Statics.field2701.startsWith("win")) {
                    if (Statics.field2109 == null) {
                        Statics.field2109 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2109 == null) {
                    Statics.field2109 = System.getenv("HOME");
                }
                if (Statics.field2109 != null) {
                    Statics.field2109 = Statics.field2109 + "/";
                }
            } catch (Exception var65) {
            }
            if (Statics.field2109 == null) {
                Statics.field2109 = "~/";
            }
            Statics.field2106 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2109, "/tmp/", "" };
            Statics.field686 = new String[] { ".jagex_cache_" + Statics.field2136, ".file_store_" + Statics.field2136 };
            int var10 = 0;
            label282: while (var10 < 4) {
                String var11 = var10 == 0 ? "" : "" + var10;
                Statics.field3036 = new File(Statics.field2109, "jagex_cl_oldschool_" + var5 + var11 + ".dat");
                String var12 = null;
                String var13 = null;
                boolean var14 = false;
                if (Statics.field3036.exists()) {
                    try {
                        class209 var15 = new class209(Statics.field3036, "rw", 10000L);
                        class110 var16 = new class110((int) var15.method3581());
                        while (var16.field1855 < var16.field1862.length) {
                            int var17 = var15.method3578(var16.field1862, var16.field1855, var16.field1862.length - var16.field1855);
                            if (var17 == -1) {
                                throw new IOException();
                            }
                            var16.field1855 += var17;
                        }
                        var16.field1855 = 0;
                        int var18 = var16.method2142();
                        if (var18 < 1 || var18 > 3) {
                            throw new IOException("" + var18);
                        }
                        int var19 = 0;
                        if (var18 > 1) {
                            var19 = var16.method2142();
                        }
                        if (var18 <= 2) {
                            var12 = var16.method2247();
                            if (var19 == 1) {
                                var13 = var16.method2247();
                            }
                        } else {
                            var12 = var16.method2152();
                            if (var19 == 1) {
                                var13 = var16.method2152();
                            }
                        }
                        var15.method3587();
                    } catch (IOException var69) {
                        var69.printStackTrace();
                    }
                    if (var12 != null) {
                        File var21 = new File(var12);
                        if (!var21.exists()) {
                            var12 = null;
                        }
                    }
                    if (var12 != null) {
                        File var22 = new File(var12, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var64) {
                            var25 = false;
                        }
                        if (!var25) {
                            var12 = null;
                        }
                    }
                }
                if (var12 == null && var10 == 0) {
                    label257: for (int var27 = 0; var27 < Statics.field686.length; var27++) {
                        for (int var28 = 0; var28 < Statics.field2106.length; var28++) {
                            File var29 = new File(Statics.field2106[var28] + Statics.field686[var27] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var29.exists()) {
                                File var30 = new File(var29, "test.dat");
                                boolean var33;
                                try {
                                    RandomAccessFile var31 = new RandomAccessFile(var30, "rw");
                                    int var32 = var31.read();
                                    var31.seek(0L);
                                    var31.write(var32);
                                    var31.seek(0L);
                                    var31.close();
                                    var30.delete();
                                    var33 = true;
                                } catch (Exception var63) {
                                    var33 = false;
                                }
                                if (var33) {
                                    var12 = var29.toString();
                                    var14 = true;
                                    break label257;
                                }
                            }
                        }
                    }
                }
                if (var12 == null) {
                    var12 = Statics.field2109 + File.separatorChar + "jagexcache" + var11 + File.separatorChar + "oldschool" + File.separatorChar + var5 + File.separatorChar;
                    var14 = true;
                }
                if (var13 != null) {
                    File var35 = new File(var13);
                    File var36 = new File(var12);
                    try {
                        File[] var37 = var35.listFiles();
                        File[] var38 = var37;
                        for (int var39 = 0; var39 < var38.length; var39++) {
                            File var40 = var38[var39];
                            File var41 = new File(var36, var40.getName());
                            boolean var42 = var40.renameTo(var41);
                            if (!var42) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var68) {
                        var68.printStackTrace();
                    }
                    var14 = true;
                }
                if (var14) {
                    File var44 = new File(var12);
                    Object var45 = null;
                    try {
                        class209 var46 = new class209(Statics.field3036, "rw", 10000L);
                        class110 var47 = new class110(500);
                        var47.method2203(3);
                        var47.method2203(var45 == null ? 0 : 1);
                        var47.method2220(var44.getPath());
                        if (var45 != null) {
                            var47.method2220(((File) var45).getPath());
                        }
                        var46.method3575(var47.field1862, 0, var47.field1855);
                        var46.method3587();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                }
                File var49 = new File(var12);
                Statics.field62 = var49;
                if (!Statics.field62.exists()) {
                    Statics.field62.mkdirs();
                }
                File[] var50 = Statics.field62.listFiles();
                if (var50 == null) {
                    break;
                }
                File[] var51 = var50;
                int var52 = 0;
                while (true) {
                    if (var52 >= var51.length) {
                        break label282;
                    }
                    File var53 = var51[var52];
                    boolean var56;
                    try {
                        RandomAccessFile var54 = new RandomAccessFile(var53, "rw");
                        int var55 = var54.read();
                        var54.seek(0L);
                        var54.write(var55);
                        var54.seek(0L);
                        var54.close();
                        var56 = true;
                    } catch (Exception var61) {
                        var56 = false;
                    }
                    if (!var56) {
                        var10++;
                        break;
                    }
                    var52++;
                }
            }
            File var58 = Statics.field62;
            Statics.field1962 = var58;
            if (!Statics.field1962.exists()) {
                throw new RuntimeException("");
            }
            class126.field1958 = true;
            class140.method147();
            class140.field2110 = new class210(new class209(class126.method603("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class140.field2107 = new class210(new class209(class126.method603("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2013 = new class210[Statics.field2103];
            for (int var59 = 0; var59 < Statics.field2103; var59++) {
                Statics.field2013[var59] = new class210(new class209(class126.method603("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var70) {
            class139.method1404((String) null, var70);
        }
        Statics.field386 = this;
        this.method2644(765, 503, 73);
    }

    @ObfuscatedName("client.k(I)V")
    public final void method165() {
        Statics.field276 = field372 == 0 ? 43594 : field443 + 40000;
        Statics.field1492 = field372 == 0 ? 443 : field443 + 50000;
        Statics.field122 = Statics.field276;
        Statics.field1662 = class158.field2686;
        Statics.field2711 = class158.field2684;
        Statics.field1935 = class158.field2685;
        Statics.field2731 = class158.field2687;
        Statics.method440();
        class128.method66(Statics.field2149);
        Canvas var1 = Statics.field2149;
        var1.addMouseListener(class131.field2033);
        var1.addMouseMotionListener(class131.field2033);
        var1.addFocusListener(class131.field2033);
        Statics.field605 = class122.method1600();
        if (Statics.field605 != null) {
            Statics.field605.method2443(Statics.field2149);
        }
        Statics.field198 = new class125(255, class140.field2110, class140.field2107, 500000);
        Statics.field1422 = class9.method125();
        Statics.field640 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field1283;
        class129.field2014 = this;
        class129.field2009 = var3;
        if (field372 != 0) {
            field255 = true;
        }
    }

    @ObfuscatedName("client.h(B)V")
    public final void method166() {
        field249++;
        this.method318();
        while (true) {
            class182 var1 = class154.field2520;
            class153 var2;
            synchronized (class154.field2520) {
                var2 = (class153) class154.field2514.method3291();
            }
            if (var2 == null) {
                try {
                    if (class166.field2749 == 1) {
                        int var4 = Statics.field1963.method3191();
                        if (var4 > 0 && Statics.field1963.method3104()) {
                            int var5 = var4 - Statics.field2108;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field1963.method3095(var5);
                        } else {
                            Statics.field1963.method3101();
                            Statics.field1963.method3099();
                            if (Statics.field2750 == null) {
                                class166.field2749 = 0;
                            } else {
                                class166.field2749 = 2;
                            }
                            Statics.field642 = null;
                            Statics.field1509 = null;
                        }
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                    Statics.field1963.method3101();
                    class166.field2749 = 0;
                    Statics.field642 = null;
                    Statics.field1509 = null;
                    Statics.field2750 = null;
                }
                method2364();
                class128 var7 = class128.field2007;
                synchronized (class128.field2007) {
                    class128.field2003++;
                    class128.field2001 = class128.field2002;
                    class128.field1999 = 0;
                    if (class128.field1995 >= 0) {
                        while (class128.field1995 != class128.field1990) {
                            int var9 = class128.field1993[class128.field1990];
                            class128.field1990 = class128.field1990 + 1 & 0x7F;
                            if (var9 < 0) {
                                class128.field1992[~var9] = false;
                            } else {
                                if (!class128.field1992[var9] && class128.field1999 < class128.field1998.length - 1) {
                                    class128.field1998[++class128.field1999 - 1] = var9;
                                }
                                class128.field1992[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class128.field1992[var8] = false;
                        }
                        class128.field1995 = class128.field1990;
                    }
                    class128.field2002 = class128.field1979;
                }
                class131.method843();
                if (Statics.field605 != null) {
                    int var11 = Statics.field605.method2445();
                    field441 = var11;
                }
                if (field352 == 0) {
                    method3211();
                    class135.method2868();
                } else if (field352 == 5) {
                    class29.method97(this);
                    method3211();
                    class135.method2868();
                } else if (field352 == 10 || field352 == 11) {
                    class29.method97(this);
                } else if (field352 == 20) {
                    class29.method97(this);
                    method2079();
                } else if (field352 == 25) {
                    method150();
                }
                if (field352 == 30) {
                    method79();
                } else if (field352 == 40 || field352 == 45) {
                    method2079();
                }
                return;
            }
            var2.field2510.method2849(var2.field2509, (int) var2.field2905, var2.field2512, false);
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method196() {
        boolean var1 = class166.method154();
        if (var1 && field448 && Statics.field1299 != null) {
            Statics.field1299.method979();
        }
        if (field2076) {
            Canvas var2 = Statics.field2149;
            var2.removeKeyListener(class128.field2007);
            var2.removeFocusListener(class128.field2007);
            class128.field1995 = -1;
            class131.method1958(Statics.field2149);
            if (Statics.field605 != null) {
                Statics.field605.method2444(Statics.field2149);
            }
            this.method2632();
            class128.method66(Statics.field2149);
            class131.method2081(Statics.field2149);
            if (Statics.field605 != null) {
                Statics.field605.method2443(Statics.field2149);
            }
        }
        if (field352 == 0) {
            class135.method546(class29.field662, class29.field663, (Color) null);
        } else if (field352 == 5) {
            class29.method580(Statics.field1918, Statics.field2543);
        } else if (field352 == 10 || field352 == 11) {
            class29.method580(Statics.field1918, Statics.field2543);
        } else if (field352 == 20) {
            class29.method580(Statics.field1918, Statics.field2543);
        } else if (field352 == 25) {
            if (field438 == 1) {
                if (field294 > field295) {
                    field295 = field294;
                }
                int var3 = (field295 * 50 - field294 * 50) / field295;
                method1768(class147.field2184 + class2.field26 + class2.field23 + var3 + "%" + class2.field24, false);
            } else if (field438 == 2) {
                if (field413 > field297) {
                    field297 = field413;
                }
                int var4 = (field297 * 50 - field413 * 50) / field297 + 50;
                method1768(class147.field2184 + class2.field26 + class2.field23 + var4 + "%" + class2.field24, false);
            } else {
                method1768(class147.field2184, false);
            }
        } else if (field352 == 30) {
            method1369();
        } else if (field352 == 40) {
            method1768(class147.field2268 + class2.field26 + class147.field2186, false);
        } else if (field352 == 45) {
            method1768(class147.field2333, false);
        }
        if (field352 == 30 && field455 == 0 && !field2074) {
            try {
                Graphics var5 = Statics.field2149.getGraphics();
                for (int var6 = 0; var6 < field417; var6++) {
                    if (field449[var6]) {
                        Statics.field1952.method1335(var5, field451[var6], field452[var6], field453[var6], field454[var6]);
                        field449[var6] = false;
                    }
                }
            } catch (Exception var12) {
                Statics.field2149.repaint();
            }
        } else if (field352 > 0) {
            try {
                Graphics var8 = Statics.field2149.getGraphics();
                Statics.field1952.method1342(var8, 0, 0);
                field2074 = false;
                for (int var9 = 0; var9 < field417; var9++) {
                    field449[var9] = false;
                }
            } catch (Exception var11) {
                Statics.field2149.repaint();
            }
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method168() {
        if (Statics.field536 != null) {
            Statics.field536.field167 = false;
        }
        Statics.field536 = null;
        if (Statics.field607 != null) {
            Statics.field607.method2608();
            Statics.field607 = null;
        }
        class128.method749();
        class131.method12();
        Statics.field605 = null;
        if (Statics.field1299 != null) {
            Statics.field1299.method980();
        }
        if (Statics.field4 != null) {
            Statics.field4.method980();
        }
        if (Statics.field2535 != null) {
            Statics.field2535.method2608();
        }
        class154.method571();
        class140.method2513();
    }

    @ObfuscatedName("fm.o(IB)V")
    public static void method2950(int arg0) {
        if (field352 == arg0) {
            return;
        }
        if (field352 == 0) {
            Statics.field794 = null;
            Statics.field548 = null;
            Statics.field187 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field272 = 0;
            field273 = 0;
            field274 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field280 != null) {
            Statics.field280.method2608();
            Statics.field280 = null;
        }
        if (field352 == 25) {
            field438 = 0;
            field294 = 0;
            field295 = 1;
            field413 = 0;
            field297 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method2442(Statics.field2149, Statics.field790, Statics.field795, true, 0);
        } else if (arg0 == 20) {
            Statics.method2442(Statics.field2149, Statics.field790, Statics.field795, true, field352 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method2442(Statics.field2149, Statics.field790, Statics.field795, false, 4);
        } else {
            class29.method2744();
        }
        field352 = arg0;
    }

    @ObfuscatedName("client.g(I)V")
    public void method318() {
        if (field352 == 1000) {
            return;
        }
        long var1 = class106.method3592();
        int var3 = (int) (var1 - Statics.field2523);
        Statics.field2523 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class155.field2522 += var3;
        boolean var4;
        if (class155.field2532 == 0 && class155.field2527 == 0 && class155.field2541 == 0 && class155.field2525 == 0) {
            var4 = true;
        } else if (Statics.field2535 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class155.field2522 > 30000) {
                        throw new IOException();
                    }
                    while (class155.field2527 < 20 && class155.field2525 > 0) {
                        class156 var5 = (class156) class155.field2524.method3260();
                        class110 var6 = new class110(4);
                        var6.method2203(1);
                        var6.method2130((int) var5.field2905);
                        Statics.field2535.method2613(var6.field1862, 0, 4);
                        class155.field2526.method3258(var5, var5.field2905);
                        class155.field2525--;
                        class155.field2527++;
                    }
                    while (class155.field2532 < 20 && class155.field2541 > 0) {
                        class156 var7 = (class156) class155.field2528.method3350();
                        class110 var8 = new class110(4);
                        var8.method2203(0);
                        var8.method2130((int) var7.field2905);
                        Statics.field2535.method2613(var8.field1862, 0, 4);
                        var7.method3367();
                        class155.field2531.method3258(var7, var7.field2905);
                        class155.field2541--;
                        class155.field2532++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2535.method2611();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class155.field2522 = 0;
                        byte var11 = 0;
                        if (Statics.field1531 == null) {
                            var11 = 8;
                        } else if (class155.field2530 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class155.field2534.field1855;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2535.method2619(class155.field2534.field1862, class155.field2534.field1855, var12);
                            if (class155.field2538 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class155.field2534.field1862[class155.field2534.field1855 + var13] ^= class155.field2538;
                                }
                            }
                            class155.field2534.field1855 += var12;
                            if (class155.field2534.field1855 < var11) {
                                break;
                            }
                            if (Statics.field1531 == null) {
                                class155.field2534.field1855 = 0;
                                int var14 = class155.field2534.method2142();
                                int var15 = class155.field2534.method2292();
                                int var16 = class155.field2534.method2142();
                                int var17 = class155.field2534.method2195();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class155.field2526.method3257(var18);
                                Statics.field568 = true;
                                if (var20 == null) {
                                    var20 = (class156) class155.field2531.method3257(var18);
                                    Statics.field568 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1531 = var20;
                                Statics.field2537 = new class110(var17 + var21 + Statics.field1531.field2546);
                                Statics.field2537.method2203(var16);
                                Statics.field2537.method2131(var17);
                                class155.field2530 = 8;
                                class155.field2534.field1855 = 0;
                            } else if (class155.field2530 == 0) {
                                if (class155.field2534.field1862[0] == -1) {
                                    class155.field2530 = 1;
                                    class155.field2534.field1855 = 0;
                                } else {
                                    Statics.field1531 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2537.field1862.length - Statics.field1531.field2546;
                            int var23 = 512 - class155.field2530;
                            if (var23 > var22 - Statics.field2537.field1855) {
                                var23 = var22 - Statics.field2537.field1855;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2535.method2619(Statics.field2537.field1862, Statics.field2537.field1855, var23);
                            if (class155.field2538 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2537.field1862[Statics.field2537.field1855 + var24] ^= class155.field2538;
                                }
                            }
                            Statics.field2537.field1855 += var23;
                            class155.field2530 += var23;
                            if (Statics.field2537.field1855 == var22) {
                                if (Statics.field1531.field2905 == 16711935L) {
                                    Statics.field2689 = Statics.field2537;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class155.field2521[var25];
                                        if (var26 != null) {
                                            Statics.field2689.field1855 = var25 * 8 + 5;
                                            int var27 = Statics.field2689.method2195();
                                            int var28 = Statics.field2689.method2195();
                                            var26.method2847(var27, var28);
                                        }
                                    }
                                } else {
                                    class155.field2536.reset();
                                    class155.field2536.update(Statics.field2537.field1862, 0, var22);
                                    int var29 = (int) class155.field2536.getValue();
                                    if (Statics.field1531.field2544 != var29) {
                                        try {
                                            Statics.field2535.method2608();
                                        } catch (Exception var35) {
                                        }
                                        class155.field2539++;
                                        Statics.field2535 = null;
                                        class155.field2538 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class155.field2539 = 0;
                                    class155.field2540 = 0;
                                    Statics.field1531.field2551.method2848((int) (Statics.field1531.field2905 & 0xFFFFL), Statics.field2537.field1862, (Statics.field1531.field2905 & 0xFF0000L) == 16711680L, Statics.field568);
                                }
                                Statics.field1531.method3392();
                                if (Statics.field568) {
                                    class155.field2527--;
                                } else {
                                    class155.field2532--;
                                }
                                class155.field2530 = 0;
                                Statics.field1531 = null;
                                Statics.field2537 = null;
                            } else {
                                if (class155.field2530 != 512) {
                                    break;
                                }
                                class155.field2530 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2535.method2608();
                } catch (Exception var34) {
                }
                class155.field2540++;
                Statics.field2535 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method262();
        }
    }

    @ObfuscatedName("client.z(I)V")
    public void method262() {
        if (class155.field2539 >= 4) {
            this.method2641("js5crc");
            field352 = 1000;
            return;
        }
        if (class155.field2540 >= 4) {
            if (field352 <= 5) {
                this.method2641("js5io");
                field352 = 1000;
                return;
            }
            field270 = 3000;
            class155.field2540 = 3;
        }
        if (--field270 + 1 > 0) {
            return;
        }
        try {
            if (field269 == 0) {
                Statics.field268 = Statics.field1532.method2506(Statics.field1830, Statics.field122);
                field269++;
            }
            if (field269 == 1) {
                if (Statics.field268.field2088 == 2) {
                    this.method171(-1);
                    return;
                }
                if (Statics.field268.field2088 == 1) {
                    field269++;
                }
            }
            if (field269 == 2) {
                Statics.field33 = new class134((Socket) Statics.field268.field2089, Statics.field1532);
                class110 var1 = new class110(5);
                var1.method2203(15);
                var1.method2131(73);
                Statics.field33.method2613(var1.field1862, 0, 5);
                field269++;
                Statics.field1572 = class106.method3592();
            }
            if (field269 == 3) {
                if (field352 <= 5 || Statics.field33.method2611() > 0) {
                    int var2 = Statics.field33.method2612();
                    if (var2 != 0) {
                        this.method171(var2);
                        return;
                    }
                    field269++;
                } else if (class106.method3592() - Statics.field1572 > 30000L) {
                    this.method171(-2);
                    return;
                }
            }
            if (field269 == 4) {
                class134 var3 = Statics.field33;
                boolean var4 = field352 > 20;
                if (Statics.field2535 != null) {
                    try {
                        Statics.field2535.method2608();
                    } catch (Exception var14) {
                    }
                    Statics.field2535 = null;
                }
                Statics.field2535 = var3;
                class155.method2606(var4);
                class155.field2534.field1855 = 0;
                Statics.field1531 = null;
                Statics.field2537 = null;
                class155.field2530 = 0;
                while (true) {
                    class156 var6 = (class156) class155.field2526.method3260();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class155.field2531.method3260();
                            if (var7 == null) {
                                if (class155.field2538 != 0) {
                                    try {
                                        class110 var8 = new class110(4);
                                        var8.method2203(4);
                                        var8.method2203(class155.field2538);
                                        var8.method2267(0);
                                        Statics.field2535.method2613(var8.field1862, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2535.method2608();
                                        } catch (Exception var12) {
                                        }
                                        class155.field2540++;
                                        Statics.field2535 = null;
                                    }
                                }
                                class155.field2522 = 0;
                                Statics.field2523 = class106.method3592();
                                Statics.field268 = null;
                                Statics.field33 = null;
                                field269 = 0;
                                field271 = 0;
                                return;
                            }
                            class155.field2528.method3355(var7);
                            class155.field2529.method3258(var7, var7.field2905);
                            class155.field2541++;
                            class155.field2532--;
                        }
                    }
                    class155.field2524.method3258(var6, var6.field2905);
                    class155.field2525++;
                    class155.field2527--;
                }
            }
        } catch (IOException var15) {
            this.method171(-3);
        }
    }

    @ObfuscatedName("client.t(IB)V")
    public void method171(int arg0) {
        Statics.field268 = null;
        Statics.field33 = null;
        field269 = 0;
        if (Statics.field276 == Statics.field122) {
            Statics.field122 = Statics.field1492;
        } else {
            Statics.field122 = Statics.field276;
        }
        field271++;
        if (field271 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field352 <= 5) {
                this.method2641("js5connect_full");
                field352 = 1000;
            } else {
                field270 = 3000;
            }
        } else if (field271 >= 2 && arg0 == 6) {
            this.method2641("js5connect_outofdate");
            field352 = 1000;
        } else if (field271 >= 4) {
            if (field352 <= 5) {
                this.method2641("js5connect");
                field352 = 1000;
            } else {
                field270 = 3000;
            }
        }
    }

    @ObfuscatedName("fu.y(B)V")
    public static void method3211() {
        if (field469 == 0) {
            Statics.field1098 = new class80(4, 104, 104, class6.field84);
            for (int var0 = 0; var0 < 4; var0++) {
                field456[var0] = new class211(104, 104);
            }
            Statics.field719 = new class73(512, 512);
            class29.field663 = class147.field2242;
            class29.field662 = 5;
            field469 = 20;
        } else if (field469 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1483[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1636(var1, 500, 800, 512, 334);
            class29.field663 = class147.field2385;
            class29.field662 = 10;
            field469 = 30;
        } else if (field469 == 30) {
            Statics.field1922 = method1847(0, false, true, true);
            Statics.field1534 = method1847(1, false, true, true);
            Statics.field615 = method1847(2, true, false, true);
            Statics.field569 = method1847(3, false, true, true);
            Statics.field2715 = method1847(4, false, true, true);
            Statics.field598 = method1847(5, true, true, true);
            Statics.field162 = method1847(6, true, true, false);
            Statics.field1986 = method1847(7, false, true, true);
            Statics.field795 = method1847(8, false, true, true);
            Statics.field705 = method1847(9, false, true, true);
            Statics.field790 = method1847(10, false, true, true);
            Statics.field1510 = method1847(11, false, true, true);
            Statics.field2159 = method1847(12, false, true, true);
            Statics.field2 = method1847(13, true, false, true);
            Statics.field1493 = method1847(14, false, true, false);
            Statics.field1061 = method1847(15, false, true, true);
            class29.field663 = class147.field2256;
            class29.field662 = 20;
            field469 = 40;
        } else if (field469 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1922.method2846() * 4 / 100;
            int var8 = var7 + Statics.field1534.method2846() * 4 / 100;
            int var9 = var8 + Statics.field615.method2846() * 2 / 100;
            int var10 = var9 + Statics.field569.method2846() * 2 / 100;
            int var11 = var10 + Statics.field2715.method2846() * 6 / 100;
            int var12 = var11 + Statics.field598.method2846() * 4 / 100;
            int var13 = var12 + Statics.field162.method2846() * 2 / 100;
            int var14 = var13 + Statics.field1986.method2846() * 60 / 100;
            int var15 = var14 + Statics.field795.method2846() * 2 / 100;
            int var16 = var15 + Statics.field705.method2846() * 2 / 100;
            int var17 = var16 + Statics.field790.method2846() * 2 / 100;
            int var18 = var17 + Statics.field1510.method2846() * 2 / 100;
            int var19 = var18 + Statics.field2159.method2846() * 2 / 100;
            int var20 = var19 + Statics.field2.method2846() * 2 / 100;
            int var21 = var20 + Statics.field1493.method2846() * 2 / 100;
            int var22 = var21 + Statics.field1061.method2846() * 2 / 100;
            if (var22 == 100) {
                class29.field663 = class147.field2191;
                class29.field662 = 30;
                field469 = 45;
            } else {
                if (var22 != 0) {
                    class29.field663 = class147.field2207 + var22 + "%";
                }
                class29.field662 = 30;
            }
        } else if (field469 == 45) {
            boolean var23 = !field245;
            Statics.field1092 = 22050;
            Statics.field1077 = var23;
            Statics.field1078 = 2;
            class167 var24 = new class167();
            var24.method3123(9, 128);
            Statics.field1299 = class51.method2058(Statics.field1532, Statics.field2149, 0, 22050);
            Statics.field1299.method976(var24);
            class166.method1011(Statics.field1061, Statics.field1493, Statics.field2715, var24);
            Statics.field4 = class51.method2058(Statics.field1532, Statics.field2149, 1, 2048);
            Statics.field58 = new class50();
            Statics.field4.method976(Statics.field58);
            Statics.field2047 = new class69(22050, Statics.field1092);
            class29.field663 = class147.field2192;
            class29.field662 = 35;
            field469 = 50;
        } else if (field469 == 50) {
            int var25 = 0;
            if (Statics.field2543 == null) {
                class152 var26 = Statics.field795;
                class152 var27 = Statics.field2;
                int var28 = var26.method2778("p11_full");
                int var29 = var26.method2839(var28, "");
                class207 var30 = class71.method144(var26, var27, var28, var29);
                Statics.field2543 = var30;
            } else {
                var25++;
            }
            if (Statics.field1825 == null) {
                class152 var31 = Statics.field795;
                class152 var32 = Statics.field2;
                int var33 = var31.method2778("p12_full");
                int var34 = var31.method2839(var33, "");
                class207 var35 = class71.method144(var31, var32, var33, var34);
                Statics.field1825 = var35;
            } else {
                var25++;
            }
            if (Statics.field1918 == null) {
                class152 var36 = Statics.field795;
                class152 var37 = Statics.field2;
                int var38 = var36.method2778("b12_full");
                int var39 = var36.method2839(var38, "");
                class207 var40 = class71.method144(var36, var37, var38, var39);
                Statics.field1918 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class29.field663 = class147.field2193 + var25 * 100 / 3 + "%";
                class29.field662 = 40;
            } else {
                Statics.field1521 = new class150(true);
                class29.field663 = class147.field2194;
                class29.field662 = 40;
                field469 = 60;
            }
        } else if (field469 == 60) {
            int var41 = class29.method441(Statics.field790, Statics.field795);
            byte var42 = 8;
            if (var41 < var42) {
                class29.field663 = class147.field2195 + var41 * 100 / var42 + "%";
                class29.field662 = 50;
            } else {
                class29.field663 = class147.field2196;
                class29.field662 = 50;
                method2950(5);
                field469 = 70;
            }
        } else if (field469 == 70) {
            if (Statics.field615.method2809()) {
                class42.method2060(Statics.field615);
                class38.method124(Statics.field615);
                class41.method498(Statics.field615, Statics.field1986);
                class37.method2412(Statics.field615, Statics.field1986, field245);
                class36.method2707(Statics.field615, Statics.field1986);
                class46.method529(Statics.field615, Statics.field1986, field435, Statics.field2543);
                class39.method151(Statics.field615, Statics.field1922, Statics.field1534);
                class40.method465(Statics.field615, Statics.field1986);
                class43.method2739(Statics.field615);
                class47.method2080(Statics.field615);
                class157.method2727(Statics.field569, Statics.field1986, Statics.field795, Statics.field2);
                class45.method987(Statics.field615);
                class152 var44 = Statics.field615;
                Statics.field993 = var44;
                class29.field663 = class147.field2342;
                class29.field662 = 60;
                field469 = 80;
            } else {
                class29.field663 = class147.field2197 + Statics.field615.method2851() + "%";
                class29.field662 = 60;
            }
        } else if (field469 == 80) {
            int var45 = 0;
            if (Statics.field239 == null) {
                class152 var46 = Statics.field795;
                int var47 = var46.method2778("compass");
                int var48 = var46.method2839(var47, "");
                class73 var49 = class71.method2574(var46, var47, var48);
                Statics.field239 = var49;
            } else {
                var45++;
            }
            if (Statics.field1940 == null) {
                class152 var50 = Statics.field795;
                int var51 = var50.method2778("mapedge");
                int var52 = var50.method2839(var51, "");
                class73 var53 = class71.method2574(var50, var51, var52);
                Statics.field1940 = var53;
            } else {
                var45++;
            }
            if (Statics.field70 == null) {
                Statics.field70 = class71.method1765(Statics.field795, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field1669 == null) {
                Statics.field1669 = class71.method500(Statics.field795, "mapfunction", "");
            } else {
                var45++;
            }
            if (Statics.field1654 == null) {
                Statics.field1654 = class71.method500(Statics.field795, "hitmarks", "");
            } else {
                var45++;
            }
            if (Statics.field974 == null) {
                Statics.field974 = class71.method500(Statics.field795, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field196 == null) {
                Statics.field196 = class71.method500(Statics.field795, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field166 == null) {
                Statics.field166 = class71.method500(Statics.field795, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field1838 == null) {
                Statics.field1838 = class71.method500(Statics.field795, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field526 == null) {
                Statics.field526 = class71.method500(Statics.field795, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field520 == null) {
                Statics.field520 = class71.method500(Statics.field795, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field211 == null) {
                Statics.field211 = class71.method1765(Statics.field795, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field976 == null) {
                Statics.field976 = class71.method1765(Statics.field795, "mod_icons", "");
            } else {
                var45++;
            }
            if (Statics.field524 == null) {
                Statics.field524 = class71.method588(Statics.field795, "mapback", "");
            } else {
                var45++;
            }
            if (var45 < 14) {
                class29.field663 = class147.field2226 + var45 * 100 / 14 + "%";
                class29.field662 = 70;
            } else {
                Statics.field2978 = Statics.field976;
                Statics.field1940.method1412();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                for (int var58 = 0; var58 < Statics.field1669.length; var58++) {
                    Statics.field1669[var58].method1431(var54 + var57, var55 + var57, var56 + var57);
                }
                Statics.field70[0].method1573(var54 + var57, var55 + var57, var56 + var57);
                method1968();
                class29.field663 = class147.field2362;
                class29.field662 = 70;
                field469 = 90;
            }
        } else if (field469 == 90) {
            if (Statics.field705.method2809()) {
                class89 var59 = new class89(Statics.field705, Statics.field795, 20, 0.8D, field245 ? 64 : 128);
                class85.method1827(var59);
                class85.method1775(0.8D);
                class29.field663 = class147.field2202;
                class29.field662 = 90;
                field469 = 110;
            } else {
                class29.field663 = class147.field2199 + Statics.field705.method2851() + "%";
                class29.field662 = 90;
            }
        } else if (field469 == 110) {
            Statics.field536 = new class12();
            Statics.field1532.method2496(Statics.field536, 10);
            class29.field663 = class147.field2203;
            class29.field662 = 94;
            field469 = 120;
        } else if (field469 == 120) {
            if (Statics.field790.method2777("huffman", "")) {
                class104 var60 = new class104(Statics.field790.method2779("huffman", ""));
                Statics.field2968 = var60;
                class29.field663 = class147.field2267;
                class29.field662 = 96;
                field469 = 130;
            } else {
                class29.field663 = class147.field2204 + "%";
                class29.field662 = 96;
            }
        } else if (field469 == 130) {
            if (!Statics.field569.method2809()) {
                class29.field663 = class147.field2235 + Statics.field569.method2851() * 4 / 5 + "%";
                class29.field662 = 100;
            } else if (!Statics.field2159.method2809()) {
                class29.field663 = class147.field2235 + (80 + Statics.field2159.method2851() / 6) + "%";
                class29.field662 = 100;
            } else if (Statics.field2.method2809()) {
                class29.field663 = class147.field2412;
                class29.field662 = 100;
                field469 = 140;
            } else {
                class29.field663 = class147.field2235 + (96 + Statics.field2.method2851() / 20) + "%";
                class29.field662 = 100;
            }
        } else if (field469 == 140) {
            method2950(10);
        }
    }

    @ObfuscatedName("cn.w(IZZZI)Len;")
    public static class152 method1847(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class125 var4 = null;
        if (class140.field2110 != null) {
            var4 = new class125(arg0, class140.field2110, Statics.field2013[arg0], 1000000);
        }
        return new class152(var4, Statics.field198, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cu.x(I)V")
    public static void method1968() {
        Statics.field939 = new int[33];
        Statics.field2162 = new int[33];
        Statics.field1010 = new int[151];
        Statics.field1004 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field524.field1327[Statics.field524.field1324 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field939[var0] = var1;
            Statics.field2162[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field524.field1327[Statics.field524.field1324 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1010[var4 - 5] = var5 - 25;
            Statics.field1004[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("de.v(I)V")
    public static final void method2079() {
        try {
            if (field272 == 0) {
                if (Statics.field607 != null) {
                    Statics.field607.method2608();
                    Statics.field607 = null;
                }
                Statics.field1906 = null;
                field360 = false;
                field273 = 0;
                field272 = 1;
            }
            if (field272 == 1) {
                if (Statics.field1906 == null) {
                    Statics.field1906 = Statics.field1532.method2506(Statics.field1830, Statics.field122);
                }
                if (Statics.field1906.field2088 == 2) {
                    throw new IOException();
                }
                if (Statics.field1906.field2088 == 1) {
                    Statics.field607 = new class134((Socket) Statics.field1906.field2089, Statics.field1532);
                    Statics.field1906 = null;
                    field272 = 2;
                }
            }
            if (field272 == 2) {
                field281.field1855 = 0;
                field281.method2203(14);
                Statics.field607.method2613(field281.field1862, 0, 1);
                field283.field1855 = 0;
                field272 = 3;
            }
            if (field272 == 3) {
                if (Statics.field1299 != null) {
                    Statics.field1299.method978();
                }
                if (Statics.field4 != null) {
                    Statics.field4.method978();
                }
                int var0 = Statics.field607.method2612();
                if (Statics.field1299 != null) {
                    Statics.field1299.method978();
                }
                if (Statics.field4 != null) {
                    Statics.field4.method978();
                }
                if (var0 != 0) {
                    method1299(var0);
                    return;
                }
                field283.field1855 = 0;
                field272 = 5;
            }
            if (field272 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field281.field1855 = 0;
                field281.method2203(1);
                field281.method2203(class29.field670.method446());
                field281.method2131(var1[0]);
                field281.method2131(var1[1]);
                field281.method2131(var1[2]);
                field281.method2131(var1[3]);
                switch(class29.field670.field2432) {
                    case 0:
                        field281.field1855 += 8;
                        break;
                    case 1:
                    case 2:
                        field281.method2130(Statics.field721);
                        field281.field1855 += 5;
                        break;
                    case 3:
                        field281.method2131((Integer) Statics.field1422.field131.get(class213.method3484(class29.field653)));
                        field281.field1855 += 4;
                }
                field281.method2133(class29.field673);
                field281.method2160(class5.field68, class5.field71);
                field282.field1855 = 0;
                if (field352 == 40) {
                    field282.method2203(18);
                } else {
                    field282.method2203(16);
                }
                field282.method2267(0);
                int var2 = field282.field1855;
                field282.method2131(73);
                field282.method2136(field281.field1862, 0, field281.field1855);
                int var3 = field282.field1855;
                field282.method2133(class29.field653);
                field282.method2203(field245 ? 1 : 0);
                class140.method6(field282);
                field282.method2133(Statics.field1767);
                field282.method2131(Statics.field2042);
                class110 var4 = new class110(Statics.field1521.method2753());
                Statics.field1521.method2752(var4);
                field282.method2136(var4.field1862, 0, var4.field1862.length);
                field282.method2131(Statics.field1922.field2489);
                field282.method2131(Statics.field1534.field2489);
                field282.method2131(Statics.field615.field2489);
                field282.method2131(Statics.field569.field2489);
                field282.method2131(Statics.field2715.field2489);
                field282.method2131(Statics.field598.field2489);
                field282.method2131(Statics.field162.field2489);
                field282.method2131(Statics.field1986.field2489);
                field282.method2131(Statics.field795.field2489);
                field282.method2131(Statics.field705.field2489);
                field282.method2131(Statics.field790.field2489);
                field282.method2131(Statics.field1510.field2489);
                field282.method2131(Statics.field2159.field2489);
                field282.method2131(Statics.field2.field2489);
                field282.method2131(Statics.field1493.field2489);
                field282.method2131(Statics.field1061.field2489);
                field282.method2238(var1, var3, field282.field1855);
                field282.method2191(field282.field1855 - var2);
                Statics.field607.method2613(field282.field1862, 0, field282.field1855);
                field281.method2365(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field283.method2365(var1);
                field272 = 6;
            }
            if (field272 == 6 && Statics.field607.method2611() > 0) {
                int var6 = Statics.field607.method2612();
                if (var6 == 21 && field352 == 20) {
                    field272 = 7;
                } else if (var6 == 2) {
                    field272 = 9;
                } else if (var6 == 15 && field352 == 40) {
                    field281.field1855 = 0;
                    field283.field1855 = 0;
                    field285 = -1;
                    field493 = -1;
                    field290 = -1;
                    field291 = -1;
                    field284 = 0;
                    field286 = 0;
                    field259 = 0;
                    field377 = 0;
                    field383 = false;
                    field476 = 0;
                    field362 = 0;
                    for (int var7 = 0; var7 < field401.length; var7++) {
                        if (field401[var7] != null) {
                            field401[var7].field751 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field277.length; var8++) {
                        if (field277[var8] != null) {
                            field277[var8].field751 = -1;
                        }
                    }
                    class14.field195 = new class179(32);
                    method2950(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field264[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field274 < 1) {
                    field274++;
                    field272 = 0;
                } else {
                    method1299(var6);
                    return;
                }
            }
            if (field272 == 7 && Statics.field607.method2611() > 0) {
                field275 = (Statics.field607.method2612() + 3) * 60;
                field272 = 8;
            }
            if (field272 == 8) {
                field273 = 0;
                class29.method148(class147.field2180, class147.field2212, field275 / 60 + class147.field2213);
                if (--field275 <= 0) {
                    field272 = 0;
                }
            } else {
                if (field272 == 9 && Statics.field607.method2611() >= 13) {
                    boolean var10 = Statics.field607.method2612() == 1;
                    Statics.field607.method2619(field283.field1862, 0, 4);
                    field283.field1855 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field283.method2367() << 24;
                        int var13 = var12 | field283.method2367() << 16;
                        int var14 = var13 | field283.method2367() << 8;
                        int var15 = var14 | field283.method2367();
                        int var16 = class213.method3484(class29.field653);
                        if (Statics.field1422.field131.size() >= 10 && !Statics.field1422.field131.containsKey(var16)) {
                            Iterator var17 = Statics.field1422.field131.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field1422.field131.put(var16, var15);
                        class9.method2557();
                    }
                    field409 = Statics.field607.method2612();
                    field411 = Statics.field607.method2612() == 1;
                    field366 = Statics.field607.method2612();
                    field366 <<= 0x8;
                    field366 += Statics.field607.method2612();
                    field367 = Statics.field607.method2612();
                    Statics.field607.method2619(field283.field1862, 0, 1);
                    field283.field1855 = 0;
                    field285 = field283.method2367();
                    Statics.field607.method2619(field283.field1862, 0, 2);
                    field283.field1855 = 0;
                    field284 = field283.method2292();
                    if (field367 == 1) {
                        try {
                            client var18 = Statics.field386;
                            JSObject.getWindow(var18).call("zap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class123.method2470(Statics.field386, "unzap");
                        } catch (Throwable var34) {
                        }
                    }
                    field272 = 10;
                }
                if (field272 != 10) {
                    field273++;
                    if (field273 > 2000) {
                        if (field274 < 1) {
                            if (Statics.field276 == Statics.field122) {
                                Statics.field122 = Statics.field1492;
                            } else {
                                Statics.field122 = Statics.field276;
                            }
                            field274++;
                            field272 = 0;
                        } else {
                            method1299(-3);
                        }
                    }
                } else if (Statics.field607.method2611() >= field284) {
                    field283.field1855 = 0;
                    Statics.field607.method2619(field283.field1862, 0, field284);
                    field250 = -1L;
                    field329 = -1;
                    Statics.field536.field172 = 0;
                    Statics.field1007 = true;
                    field254 = true;
                    field474 = -1L;
                    class194.method1331();
                    field281.field1855 = 0;
                    field283.field1855 = 0;
                    field285 = -1;
                    field493 = -1;
                    field290 = -1;
                    field291 = -1;
                    field286 = 0;
                    field259 = 0;
                    field288 = 0;
                    field257 = 0;
                    field377 = 0;
                    field383 = false;
                    class131.field2026 = 0;
                    class10.method1594();
                    field395 = 0;
                    field486 = false;
                    field482 = 0;
                    field253 = (int) (Math.random() * 100.0D) - 50;
                    field306 = (int) (Math.random() * 110.0D) - 55;
                    field371 = (int) (Math.random() * 80.0D) - 40;
                    field311 = (int) (Math.random() * 120.0D) - 60;
                    field313 = (int) (Math.random() * 30.0D) - 20;
                    field325 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field476 = 0;
                    field477 = -1;
                    field362 = 0;
                    field462 = 0;
                    field266 = class18.field508;
                    field478 = 0;
                    field278 = 0;
                    for (int var21 = 0; var21 < 2048; var21++) {
                        field401[var21] = null;
                        field365[var21] = null;
                    }
                    for (int var22 = 0; var22 < 32768; var22++) {
                        field277[var22] = null;
                    }
                    Statics.field920 = field401[2047] = new class3();
                    field242 = -1;
                    field414.method3287();
                    field378.method3287();
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                field375[var23][var24][var25] = null;
                            }
                        }
                    }
                    field376 = new class182();
                    field304 = 0;
                    field267 = 0;
                    field498 = 0;
                    for (int var26 = 0; var26 < Statics.field537; var26++) {
                        class47 var27 = class47.method2746(var26);
                        if (var27 != null) {
                            class159.field2691[var26] = 0;
                            class159.field2692[var26] = 0;
                        }
                    }
                    for (int var28 = 0; var28 < field427.length; var28++) {
                        field427[var28] = -1;
                    }
                    field410 = -1;
                    if (field402 != -1) {
                        class157.method2514(field402);
                    }
                    for (class4 var29 = (class4) field403.method3260(); var29 != null; var29 = (class4) field403.method3261()) {
                        method31(var29, true);
                    }
                    field402 = -1;
                    field403 = new class179(8);
                    field406 = null;
                    field383 = false;
                    field377 = 0;
                    field500.method2967((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var30 = 0; var30 < 8; var30++) {
                        field349[var30] = null;
                        field248[var30] = false;
                    }
                    class14.method604();
                    field497 = true;
                    for (int var31 = 0; var31 < 100; var31++) {
                        field264[var31] = true;
                    }
                    field495 = null;
                    Statics.field1896 = 0;
                    Statics.field1429 = null;
                    for (int var32 = 0; var32 < 6; var32++) {
                        field503[var32] = new class203();
                    }
                    Statics.field1455 = null;
                    Statics.field1882 = -1;
                    method2749(false);
                    field285 = -1;
                }
            }
        } catch (IOException var36) {
            if (field274 < 1) {
                if (Statics.field276 == Statics.field122) {
                    Statics.field122 = Statics.field1492;
                } else {
                    Statics.field122 = Statics.field276;
                }
                field274++;
                field272 = 0;
            } else {
                method1299(-2);
            }
        }
    }

    @ObfuscatedName("bh.q(II)V")
    public static void method1299(int arg0) {
        if (arg0 == -3) {
            class29.method148(class147.field2352, class147.field2215, class147.field2177);
        } else if (arg0 == -2) {
            class29.method148(class147.field2217, class147.field2210, class147.field2230);
        } else if (arg0 == -1) {
            class29.method148(class147.field2220, class147.field2221, class147.field2353);
        } else if (arg0 == 3) {
            class29.method148(class147.field2224, class147.field2265, class147.field2189);
        } else if (arg0 == 4) {
            class29.method148(class147.field2392, class147.field2227, class147.field2264);
        } else if (arg0 == 5) {
            class29.method148(class147.field2420, class147.field2223, class147.field2231);
        } else if (arg0 == 6) {
            class29.method148(class147.field2232, class147.field2233, class147.field2183);
        } else if (arg0 == 7) {
            class29.method148(class147.field2218, class147.field2377, class147.field2237);
        } else if (arg0 == 8) {
            class29.method148(class147.field2238, class147.field2271, class147.field2240);
        } else if (arg0 == 9) {
            class29.method148(class147.field2241, class147.field2395, class147.field2243);
        } else if (arg0 == 10) {
            class29.method148(class147.field2372, class147.field2245, class147.field2246);
        } else if (arg0 == 11) {
            class29.method148(class147.field2247, class147.field2248, class147.field2249);
        } else if (arg0 == 12) {
            class29.method148(class147.field2250, class147.field2390, class147.field2222);
        } else if (arg0 == 13) {
            class29.method148(class147.field2253, class147.field2254, class147.field2255);
        } else if (arg0 == 14) {
            class29.method148(class147.field2282, class147.field2190, class147.field2258);
        } else if (arg0 == 16) {
            class29.method148(class147.field2272, class147.field2260, class147.field2257);
        } else if (arg0 == 17) {
            class29.method148(class147.field2262, class147.field2263, class147.field2414);
        } else if (arg0 == 18) {
            class29.method148(class147.field2325, class147.field2266, class147.field2310);
        } else if (arg0 == 19) {
            class29.method148(class147.field2277, class147.field2269, class147.field2270);
        } else if (arg0 == 20) {
            class29.method148(class147.field2379, class147.field2386, class147.field2234);
        } else if (arg0 == 22) {
            class29.method148(class147.field2274, class147.field2275, class147.field2276);
        } else if (arg0 == 23) {
            class29.method148(class147.field2396, class147.field2278, class147.field2279);
        } else if (arg0 == 24) {
            class29.method148(class147.field2419, class147.field2281, class147.field2225);
        } else if (arg0 == 25) {
            class29.method148(class147.field2283, class147.field2284, class147.field2313);
        } else if (arg0 == 26) {
            class29.method148(class147.field2286, class147.field2287, class147.field2288);
        } else if (arg0 == 27) {
            class29.method148(class147.field2206, class147.field2290, class147.field2252);
        } else if (arg0 == 31) {
            class29.method148(class147.field2298, class147.field2299, class147.field2300);
        } else if (arg0 == 32) {
            class29.method148(class147.field2301, class147.field2302, class147.field2388);
        } else if (arg0 == 37) {
            class29.method148(class147.field2304, class147.field2305, class147.field2306);
        } else if (arg0 == 38) {
            class29.method148(class147.field2307, class147.field2308, class147.field2309);
        } else if (arg0 == 55) {
            class29.method148(class147.field2244, class147.field2311, class147.field2312);
        } else if (arg0 == 56) {
            class29.method148(class147.field2293, class147.field2259, class147.field2315);
            method2950(11);
            return;
        } else if (arg0 == 57) {
            class29.method148(class147.field2316, class147.field2317, class147.field2318);
            method2950(11);
            return;
        } else {
            class29.method148(class147.field2319, class147.field2185, class147.field2321);
        }
        method2950(10);
    }

    @ObfuscatedName("dc.f(I)V")
    public static final void method2186() {
        if (Statics.field607 != null) {
            Statics.field607.method2608();
            Statics.field607 = null;
        }
        Statics.method4();
        Statics.field1098.method1603();
        for (int var0 = 0; var0 < 4; var0++) {
            field456[var0].method3638();
        }
        System.gc();
        class166.method2738(2);
        field479 = -1;
        field448 = false;
        class21.method2078();
        method2950(10);
    }

    @ObfuscatedName("fu.a(S)V")
    public static final void method3212() {
        if (field288 > 0) {
            method2186();
        } else {
            method2950(40);
            Statics.field280 = Statics.field607;
            Statics.field607 = null;
        }
    }

    @ObfuscatedName("n.m(I)V")
    public static final void method79() {
        if (field259 > 1) {
            field259--;
        }
        if (field288 > 0) {
            field288--;
        }
        if (field360) {
            field360 = false;
            method3212();
            return;
        }
        if (!field383) {
            field389[0] = class147.field2411;
            field390[0] = "";
            field387[0] = 1006;
            field377 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field607 == null) {
                var1 = false;
            } else {
                label3058: {
                    try {
                        int var2 = Statics.field607.method2611();
                        if (var2 == 0) {
                            var1 = false;
                            break label3058;
                        }
                        if (field285 == -1) {
                            Statics.field607.method2619(field283.field1862, 0, 1);
                            field283.field1855 = 0;
                            field285 = field283.method2367();
                            field284 = class171.field2827[field285];
                            var2--;
                        }
                        if (field284 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label3058;
                            }
                            Statics.field607.method2619(field283.field1862, 0, 1);
                            field284 = field283.field1862[0] & 0xFF;
                            var2--;
                        }
                        if (field284 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label3058;
                            }
                            Statics.field607.method2619(field283.field1862, 0, 2);
                            field283.field1855 = 0;
                            field284 = field283.method2292();
                            var2 -= 2;
                        }
                        if (var2 < field284) {
                            var1 = false;
                            break label3058;
                        }
                        field283.field1855 = 0;
                        Statics.field607.method2619(field283.field1862, 0, field284);
                        field286 = 0;
                        field291 = field290;
                        field290 = field493;
                        field493 = field285;
                        if (field285 == 136) {
                            int var3 = field283.method2195();
                            class157 var4 = class157.method835(var3);
                            var4.field2653 = 3;
                            var4.field2571 = Statics.field920.field36.method2972();
                            method3452(var4);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 26) {
                            while (field283.field1855 < field284) {
                                int var5 = field283.method2142();
                                boolean var6 = (var5 & 0x1) == 1;
                                String var7 = field283.method2150();
                                String var8 = field283.method2150();
                                field283.method2150();
                                for (int var9 = 0; var9 < field498; var9++) {
                                    class8 var10 = field499[var9];
                                    if (var6) {
                                        if (var8.equals(var10.field129)) {
                                            var10.field129 = var7;
                                            var10.field125 = var8;
                                            var7 = null;
                                            break;
                                        }
                                    } else if (var7.equals(var10.field129)) {
                                        var10.field129 = var7;
                                        var10.field125 = var8;
                                        var7 = null;
                                        break;
                                    }
                                }
                                if (var7 != null && field498 < 400) {
                                    class8 var11 = new class8();
                                    field499[field498] = var11;
                                    var11.field129 = var7;
                                    var11.field125 = var8;
                                    field498++;
                                }
                            }
                            field434 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 0) {
                            field457 = field283.method2142();
                            field458 = field283.method2142();
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 151) {
                            field368 = 0;
                            field394 = 0;
                            field283.method2368();
                            int var12 = field283.method2375(1);
                            if (var12 != 0) {
                                int var13 = field283.method2375(2);
                                if (var13 == 0) {
                                    field364[++field394 - 1] = 2047;
                                } else if (var13 == 1) {
                                    int var14 = field283.method2375(3);
                                    Statics.field920.method600(var14, false);
                                    int var15 = field283.method2375(1);
                                    if (var15 == 1) {
                                        field364[++field394 - 1] = 2047;
                                    }
                                } else if (var13 == 2) {
                                    int var16 = field283.method2375(3);
                                    Statics.field920.method600(var16, true);
                                    int var17 = field283.method2375(3);
                                    Statics.field920.method600(var17, true);
                                    int var18 = field283.method2375(1);
                                    if (var18 == 1) {
                                        field364[++field394 - 1] = 2047;
                                    }
                                } else if (var13 == 3) {
                                    int var19 = field283.method2375(1);
                                    int var20 = field283.method2375(1);
                                    if (var20 == 1) {
                                        field364[++field394 - 1] = 2047;
                                    }
                                    int var21 = field283.method2375(7);
                                    int var22 = field283.method2375(7);
                                    Statics.field788 = field283.method2375(2);
                                    Statics.field920.method591(var21, var22, var19 == 1);
                                }
                            }
                            int var23 = field283.method2375(8);
                            if (var23 < field478) {
                                for (int var24 = var23; var24 < field478; var24++) {
                                    field369[++field368 - 1] = field247[var24];
                                }
                            }
                            if (var23 > field478) {
                                throw new RuntimeException("");
                            }
                            field478 = 0;
                            for (int var25 = 0; var25 < var23; var25++) {
                                int var26 = field247[var25];
                                class3 var27 = field401[var26];
                                int var28 = field283.method2375(1);
                                if (var28 == 0) {
                                    field247[++field478 - 1] = var26;
                                    var27.field774 = field249;
                                } else {
                                    int var29 = field283.method2375(2);
                                    if (var29 == 0) {
                                        field247[++field478 - 1] = var26;
                                        var27.field774 = field249;
                                        field364[++field394 - 1] = var26;
                                    } else if (var29 == 1) {
                                        field247[++field478 - 1] = var26;
                                        var27.field774 = field249;
                                        int var30 = field283.method2375(3);
                                        var27.method600(var30, false);
                                        int var31 = field283.method2375(1);
                                        if (var31 == 1) {
                                            field364[++field394 - 1] = var26;
                                        }
                                    } else if (var29 == 2) {
                                        field247[++field478 - 1] = var26;
                                        var27.field774 = field249;
                                        int var32 = field283.method2375(3);
                                        var27.method600(var32, true);
                                        int var33 = field283.method2375(3);
                                        var27.method600(var33, true);
                                        int var34 = field283.method2375(1);
                                        if (var34 == 1) {
                                            field364[++field394 - 1] = var26;
                                        }
                                    } else if (var29 == 3) {
                                        field369[++field368 - 1] = var26;
                                    }
                                }
                            }
                            while (field283.method2373(field284) >= 11) {
                                int var35 = field283.method2375(11);
                                if (var35 == 2047) {
                                    break;
                                }
                                boolean var36 = false;
                                if (field401[var35] == null) {
                                    field401[var35] = new class3();
                                    if (field365[var35] != null) {
                                        field401[var35].method14(field365[var35]);
                                    }
                                    var36 = true;
                                }
                                field247[++field478 - 1] = var35;
                                class3 var37 = field401[var35];
                                var37.field774 = field249;
                                int var38 = field283.method2375(5);
                                if (var38 > 15) {
                                    var38 -= 32;
                                }
                                int var39 = field283.method2375(1);
                                int var40 = field374[field283.method2375(3)];
                                if (var36) {
                                    var37.field776 = var37.field761 = var40;
                                }
                                int var41 = field283.method2375(5);
                                if (var41 > 15) {
                                    var41 -= 32;
                                }
                                int var42 = field283.method2375(1);
                                if (var42 == 1) {
                                    field364[++field394 - 1] = var35;
                                }
                                var37.method591(Statics.field920.field780[0] + var38, Statics.field920.field752[0] + var41, var39 == 1);
                            }
                            field283.method2369();
                            for (int var43 = 0; var43 < field394; var43++) {
                                int var44 = field364[var43];
                                class3 var45 = field401[var44];
                                int var46 = field283.method2142();
                                if ((var46 & 0x1) != 0) {
                                    var46 += field283.method2142() << 8;
                                }
                                Statics.method2397(var44, var45, var46);
                            }
                            for (int var47 = 0; var47 < field368; var47++) {
                                int var48 = field369[var47];
                                if (field249 != field401[var48].field774) {
                                    field401[var48] = null;
                                }
                            }
                            if (field284 != field283.field1855) {
                                throw new RuntimeException(field283.field1855 + class2.field21 + field284);
                            }
                            for (int var49 = 0; var49 < field478; var49++) {
                                if (field401[field247[var49]] == null) {
                                    throw new RuntimeException(var49 + class2.field21 + field478);
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 81) {
                            int var50 = field283.method2174();
                            int var51 = field283.method2184();
                            int var52 = var50 >> 10 & 0x1F;
                            int var53 = var50 >> 5 & 0x1F;
                            int var54 = var50 & 0x1F;
                            int var55 = (var54 << 3) + (var52 << 19) + (var53 << 11);
                            class157 var56 = class157.method835(var51);
                            if (var56.field2579 != var55) {
                                var56.field2579 = var55;
                                method3452(var56);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 193) {
                            int var57 = field283.method2184();
                            int var58 = field283.method2292();
                            int var59 = field283.method2292();
                            class157 var60 = class157.method835(var57);
                            var60.field2606 = (var58 << 16) + var59;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 32) {
                            int var61 = field283.method2256();
                            int var62 = field283.method2184();
                            class157 var63 = class157.method835(var62);
                            if (var63.field2598 != var61 || var61 == -1) {
                                var63.field2598 = var61;
                                var63.field2671 = 0;
                                var63.field2672 = 0;
                                method3452(var63);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 106) {
                            String var64 = field283.method2150();
                            Object[] var65 = new Object[var64.length() + 1];
                            for (int var66 = var64.length() - 1; var66 >= 0; var66--) {
                                if (var64.charAt(var66) == 's') {
                                    var65[var66 + 1] = field283.method2150();
                                } else {
                                    var65[var66 + 1] = Integer.valueOf(field283.method2195());
                                }
                            }
                            var65[0] = Integer.valueOf(field283.method2195());
                            class1 var67 = new class1();
                            var67.field12 = var65;
                            class33.method127(var67, 200000);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 177) {
                            int var68 = field283.method2166();
                            String var69 = field283.method2150();
                            int var70 = field283.method2207();
                            if (var68 >= 1 && var68 <= 8) {
                                if (var69.equalsIgnoreCase("null")) {
                                    var69 = null;
                                }
                                field349[var68 - 1] = var69;
                                field248[var68 - 1] = var70 == 0;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 149) {
                            method27();
                            field408 = field283.method2256();
                            field292 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 246) {
                            String var71 = field283.method2150();
                            long var72 = field283.method2148();
                            long var74 = (long) field283.method2292();
                            long var76 = (long) field283.method2146();
                            class142[] var78 = new class142[] { class142.field2127, class142.field2128, class142.field2135, class142.field2129, class142.field2130 };
                            class142 var79 = (class142) class100.method1330(var78, field283.method2142());
                            long var80 = (var74 << 32) + var76;
                            boolean var82 = false;
                            for (int var83 = 0; var83 < 100; var83++) {
                                if (field461[var83] == var80) {
                                    var82 = true;
                                    break;
                                }
                            }
                            if (var79.field2134 && method1866(var71)) {
                                var82 = true;
                            }
                            if (!var82 && field488 == 0) {
                                field461[field342] = var80;
                                field342 = (field342 + 1) % 100;
                                String var84 = class206.method3540(class213.method122(class205.method1301(field283)));
                                if (var79.field2132 == -1) {
                                    class10.method2416(9, var71, var84, class212.method2061(var72));
                                } else {
                                    int var85 = var79.field2132;
                                    String var86 = "<img=" + var85 + ">";
                                    class10.method2416(9, var86 + var71, var84, class212.method2061(var72));
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 194) {
                            class113 var87 = field283;
                            int var88 = field284;
                            class193 var89 = new class193();
                            var89.field2909 = var87.method2142();
                            var89.field2913 = var87.method2195();
                            var89.field2910 = new int[var89.field2909];
                            var89.field2911 = new int[var89.field2909];
                            var89.field2916 = new Field[var89.field2909];
                            var89.field2914 = new int[var89.field2909];
                            var89.field2912 = new Method[var89.field2909];
                            var89.field2908 = new byte[var89.field2909][][];
                            for (int var90 = 0; var90 < var89.field2909; var90++) {
                                try {
                                    int var91 = var87.method2142();
                                    if (var91 == 0 || var91 == 1 || var91 == 2) {
                                        String var92 = var87.method2150();
                                        String var93 = var87.method2150();
                                        int var94 = 0;
                                        if (var91 == 1) {
                                            var94 = var87.method2195();
                                        }
                                        var89.field2910[var90] = var91;
                                        var89.field2914[var90] = var94;
                                        if (class194.method731(var92).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var89.field2916[var90] = class194.method731(var92).getDeclaredField(var93);
                                    } else if (var91 == 3 || var91 == 4) {
                                        String var95 = var87.method2150();
                                        String var96 = var87.method2150();
                                        int var97 = var87.method2142();
                                        String[] var98 = new String[var97];
                                        for (int var99 = 0; var99 < var97; var99++) {
                                            var98[var99] = var87.method2150();
                                        }
                                        String var100 = var87.method2150();
                                        byte[][] var101 = new byte[var97][];
                                        if (var91 == 3) {
                                            for (int var102 = 0; var102 < var97; var102++) {
                                                int var103 = var87.method2195();
                                                var101[var102] = new byte[var103];
                                                var87.method2235(var101[var102], 0, var103);
                                            }
                                        }
                                        var89.field2910[var90] = var91;
                                        Class[] var104 = new Class[var97];
                                        for (int var105 = 0; var105 < var97; var105++) {
                                            var104[var105] = class194.method731(var98[var105]);
                                        }
                                        Class var106 = class194.method731(var100);
                                        if (class194.method731(var95).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var107 = class194.method731(var95).getDeclaredMethods();
                                        Method[] var108 = var107;
                                        for (int var109 = 0; var109 < var108.length; var109++) {
                                            Method var110 = var108[var109];
                                            if (var110.getName().equals(var96)) {
                                                Class[] var111 = var110.getParameterTypes();
                                                if (var104.length == var111.length) {
                                                    boolean var112 = true;
                                                    for (int var113 = 0; var113 < var104.length; var113++) {
                                                        if (var104[var113] != var111[var113]) {
                                                            var112 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var112 && var106 == var110.getReturnType()) {
                                                        var89.field2912[var90] = var110;
                                                    }
                                                }
                                            }
                                        }
                                        var89.field2908[var90] = var101;
                                    }
                                } catch (ClassNotFoundException var479) {
                                    var89.field2911[var90] = -1;
                                } catch (SecurityException var480) {
                                    var89.field2911[var90] = -2;
                                } catch (NullPointerException var481) {
                                    var89.field2911[var90] = -3;
                                } catch (Exception var482) {
                                    var89.field2911[var90] = -4;
                                } catch (Throwable var483) {
                                    var89.field2911[var90] = -5;
                                }
                            }
                            class194.field2919.method3332(var89);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 185) {
                            Statics.field303 = field283.method2181();
                            Statics.field791 = field283.method2207();
                            while (field283.field1855 < field284) {
                                field285 = field283.method2142();
                                method2737();
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 178) {
                            int var119 = field283.method2142();
                            if (field283.method2142() == 0) {
                                field503[var119] = new class203();
                                field283.field1855 += 18;
                            } else {
                                field283.field1855--;
                                field503[var119] = new class203(field283, false);
                            }
                            field436 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 50) {
                            method439(true);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 22) {
                            field304 = 1;
                            field434 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 255) {
                            for (int var120 = 0; var120 < class159.field2692.length; var120++) {
                                if (class159.field2692[var120] != class159.field2691[var120]) {
                                    class159.field2692[var120] = class159.field2691[var120];
                                    method840(var120);
                                    field336[++field428 - 1 & 0x1F] = var120;
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 253) {
                            int var121 = field283.method2195();
                            int var122 = field283.method2292();
                            if (var121 < -70000) {
                                var122 += 32768;
                            }
                            class157 var123;
                            if (var121 >= 0) {
                                var123 = class157.method835(var121);
                            } else {
                                var123 = null;
                            }
                            while (field283.field1855 < field284) {
                                int var124 = field283.method2155();
                                int var125 = field283.method2292();
                                int var126 = 0;
                                if (var125 != 0) {
                                    var126 = field283.method2142();
                                    if (var126 == 255) {
                                        var126 = field283.method2195();
                                    }
                                }
                                if (var123 != null && var124 >= 0 && var124 < var123.field2667.length) {
                                    var123.field2667[var124] = var125;
                                    var123.field2668[var124] = var126;
                                }
                                class14.method152(var122, var124, var125 - 1, var126);
                            }
                            if (var123 != null) {
                                method3452(var123);
                            }
                            method27();
                            field429[++field373 - 1 & 0x1F] = var122 & 0x7FFF;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 130) {
                            Statics.field791 = field283.method2166();
                            Statics.field303 = field283.method2166();
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 211) {
                            method2749(false);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 70) {
                            int var127 = field283.method2195();
                            int var128 = field283.method2292();
                            if (var127 < -70000) {
                                var128 += 32768;
                            }
                            class157 var129;
                            if (var127 >= 0) {
                                var129 = class157.method835(var127);
                            } else {
                                var129 = null;
                            }
                            if (var129 != null) {
                                for (int var130 = 0; var130 < var129.field2667.length; var130++) {
                                    var129.field2667[var130] = 0;
                                    var129.field2668[var130] = 0;
                                }
                            }
                            class14.method2456(var128);
                            int var131 = field283.method2292();
                            for (int var132 = 0; var132 < var131; var132++) {
                                int var133 = field283.method2142();
                                if (var133 == 255) {
                                    var133 = field283.method2183();
                                }
                                int var134 = field283.method2175();
                                if (var129 != null && var132 < var129.field2667.length) {
                                    var129.field2667[var132] = var134;
                                    var129.field2668[var132] = var133;
                                }
                                class14.method152(var128, var132, var134 - 1, var133);
                            }
                            if (var129 != null) {
                                method3452(var129);
                            }
                            method27();
                            field429[++field373 - 1 & 0x1F] = var128 & 0x7FFF;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 129) {
                            int var135 = field283.method2174();
                            int var136 = field283.method2195();
                            class157 var137 = class157.method835(var136);
                            if (var137.field2653 != 1 || var137.field2571 != var135) {
                                var137.field2653 = 1;
                                var137.field2571 = var135;
                                method3452(var137);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 158) {
                            int var138 = field283.method2195();
                            Statics.field1897 = Statics.field1532.method2508(var138);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 2) {
                            field426 = field446;
                            if (field284 == 0) {
                                field495 = null;
                                field468 = null;
                                Statics.field1896 = 0;
                                Statics.field1429 = null;
                                field285 = -1;
                                var1 = true;
                            } else {
                                field468 = field283.method2150();
                                long var139 = field283.method2148();
                                field495 = class212.method3480(var139);
                                Statics.field581 = field283.method2294();
                                int var141 = field283.method2142();
                                if (var141 == 255) {
                                    field285 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1896 = var141;
                                    class22[] var142 = new class22[100];
                                    for (int var143 = 0; var143 < Statics.field1896; var143++) {
                                        var142[var143] = new class22();
                                        var142[var143].field559 = field283.method2150();
                                        var142[var143].field565 = class214.method608(var142[var143].field559, Statics.field1450);
                                        var142[var143].field560 = field283.method2292();
                                        var142[var143].field562 = field283.method2294();
                                        field283.method2150();
                                        if (var142[var143].field559.equals(Statics.field920.field46)) {
                                            Statics.field148 = var142[var143].field562;
                                        }
                                    }
                                    boolean var144 = false;
                                    int var145 = Statics.field1896;
                                    while (var145 > 0) {
                                        boolean var146 = true;
                                        var145--;
                                        for (int var147 = 0; var147 < var145; var147++) {
                                            if (var142[var147].field565.compareTo(var142[var147 + 1].field565) > 0) {
                                                class22 var148 = var142[var147];
                                                var142[var147] = var142[var147 + 1];
                                                var142[var147 + 1] = var148;
                                                var146 = false;
                                            }
                                        }
                                        if (var146) {
                                            break;
                                        }
                                    }
                                    Statics.field1429 = var142;
                                    field285 = -1;
                                    var1 = true;
                                }
                            }
                            break label3058;
                        }
                        if (field285 == 65) {
                            boolean var149 = field283.method2142() == 1;
                            if (var149) {
                                Statics.field2730 = class106.method3592() - field283.method2148();
                                Statics.field1455 = new class204(field283, true);
                            } else {
                                Statics.field1455 = null;
                            }
                            field480 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 114) {
                            while (field283.field1855 < field284) {
                                boolean var150 = field283.method2142() == 1;
                                String var151 = field283.method2150();
                                String var152 = field283.method2150();
                                int var153 = field283.method2292();
                                int var154 = field283.method2142();
                                int var155 = field283.method2142();
                                boolean var156 = (var155 & 0x2) != 0;
                                boolean var157 = (var155 & 0x1) != 0;
                                if (var153 > 0) {
                                    field283.method2150();
                                    field283.method2142();
                                    field283.method2195();
                                }
                                field283.method2150();
                                for (int var158 = 0; var158 < field267; var158++) {
                                    class16 var159 = field258[var158];
                                    if (var150) {
                                        if (var152.equals(var159.field222)) {
                                            var159.field222 = var151;
                                            var159.field218 = var152;
                                            var151 = null;
                                            break;
                                        }
                                    } else if (var151.equals(var159.field222)) {
                                        if (var159.field217 != var153) {
                                            boolean var160 = true;
                                            for (class35 var161 = (class35) field421.method3253(); var161 != null; var161 = (class35) field421.method3244()) {
                                                if (var161.field789.equals(var151)) {
                                                    if (var153 != 0 && var161.field792 == 0) {
                                                        var161.method3388();
                                                        var160 = false;
                                                    } else if (var153 == 0 && var161.field792 != 0) {
                                                        var161.method3388();
                                                        var160 = false;
                                                    }
                                                }
                                            }
                                            if (var160) {
                                                field421.method3250(new class35(var151, var153));
                                            }
                                            var159.field217 = var153;
                                        }
                                        var159.field218 = var152;
                                        var159.field220 = var154;
                                        var159.field221 = var156;
                                        var159.field219 = var157;
                                        var151 = null;
                                        break;
                                    }
                                }
                                if (var151 != null && field267 < 400) {
                                    class16 var162 = new class16();
                                    field258[field267] = var162;
                                    var162.field222 = var151;
                                    var162.field218 = var152;
                                    var162.field217 = var153;
                                    var162.field220 = var154;
                                    var162.field221 = var156;
                                    var162.field219 = var157;
                                    field267++;
                                }
                            }
                            field304 = 2;
                            field434 = field446;
                            boolean var163 = false;
                            int var164 = field267;
                            while (var164 > 0) {
                                boolean var165 = true;
                                var164--;
                                for (int var166 = 0; var166 < var164; var166++) {
                                    boolean var167 = false;
                                    class16 var168 = field258[var166];
                                    class16 var169 = field258[var166 + 1];
                                    if (field443 != var168.field217 && field443 == var169.field217) {
                                        var167 = true;
                                    }
                                    if (!var167 && var168.field217 == 0 && var169.field217 != 0) {
                                        var167 = true;
                                    }
                                    if (!var167 && !var168.field221 && var169.field221) {
                                        var167 = true;
                                    }
                                    if (!var167 && !var168.field219 && var169.field219) {
                                        var167 = true;
                                    }
                                    if (var167) {
                                        class16 var170 = field258[var166];
                                        field258[var166] = field258[var166 + 1];
                                        field258[var166 + 1] = var170;
                                        var165 = false;
                                    }
                                }
                                if (var165) {
                                    break;
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 225) {
                            int var171 = field283.method2292();
                            int var172 = field283.method2142();
                            int var173 = field283.method2292();
                            method1956(var171, var172, var173);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 25) {
                            int var174 = field283.method2175();
                            if (var174 == 65535) {
                                var174 = -1;
                            }
                            method63(var174);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 58) {
                            int var175 = field283.method2292();
                            if (var175 == 65535) {
                                var175 = -1;
                            }
                            int var176 = field283.method2260();
                            if (field433 != 0 && var175 != -1) {
                                class166.method2949(Statics.field1510, var175, 0, field433, false);
                                field448 = true;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 214) {
                            String var177 = field283.method2150();
                            int var178 = field283.method2292();
                            byte var179 = field283.method2294();
                            boolean var180 = false;
                            if (var179 == -128) {
                                var180 = true;
                            }
                            if (var180) {
                                if (Statics.field1896 == 0) {
                                    field285 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                boolean var181 = false;
                                int var182;
                                for (var182 = 0; var182 < Statics.field1896 && (!Statics.field1429[var182].field559.equals(var177) || Statics.field1429[var182].field560 != var178); var182++) {
                                }
                                if (var182 < Statics.field1896) {
                                    while (var182 < Statics.field1896 - 1) {
                                        Statics.field1429[var182] = Statics.field1429[var182 + 1];
                                        var182++;
                                    }
                                    Statics.field1896--;
                                    Statics.field1429[Statics.field1896] = null;
                                }
                            } else {
                                field283.method2150();
                                class22 var183 = new class22();
                                var183.field559 = var177;
                                var183.field565 = class214.method608(var183.field559, Statics.field1450);
                                var183.field560 = var178;
                                var183.field562 = var179;
                                int var184;
                                for (var184 = Statics.field1896 - 1; var184 >= 0; var184--) {
                                    int var185 = Statics.field1429[var184].field565.compareTo(var183.field565);
                                    if (var185 == 0) {
                                        Statics.field1429[var184].field560 = var178;
                                        Statics.field1429[var184].field562 = var179;
                                        if (var177.equals(Statics.field920.field46)) {
                                            Statics.field148 = var179;
                                        }
                                        field426 = field446;
                                        field285 = -1;
                                        var1 = true;
                                        break label3058;
                                    }
                                    if (var185 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1896 >= Statics.field1429.length) {
                                    field285 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                for (int var186 = Statics.field1896 - 1; var186 > var184; var186--) {
                                    Statics.field1429[var186 + 1] = Statics.field1429[var186];
                                }
                                if (Statics.field1896 == 0) {
                                    Statics.field1429 = new class22[100];
                                }
                                Statics.field1429[var184 + 1] = var183;
                                Statics.field1896++;
                                if (var177.equals(Statics.field920.field46)) {
                                    Statics.field148 = var179;
                                }
                            }
                            field426 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 12) {
                            int var187 = field283.method2175();
                            int var188 = field283.method2183();
                            class159.field2691[var187] = var188;
                            if (class159.field2692[var187] != var188) {
                                class159.field2692[var187] = var188;
                                method840(var187);
                            }
                            field336[++field428 - 1 & 0x1F] = var187;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 251) {
                            int var189 = field283.method2195();
                            String var190 = field283.method2150();
                            class157 var191 = class157.method835(var189);
                            if (!var190.equals(var191.field2610)) {
                                var191.field2610 = var190;
                                method3452(var191);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 167) {
                            field382 = true;
                            Statics.field1496 = field283.method2142();
                            Statics.field611 = field283.method2142();
                            Statics.field689 = field283.method2292();
                            Statics.field838 = field283.method2142();
                            Statics.field126 = field283.method2142();
                            if (Statics.field126 >= 100) {
                                Statics.field1250 = Statics.field1496 * 128 + 64;
                                Statics.field323 = Statics.field611 * 128 + 64;
                                Statics.field1984 = method83(Statics.field1250, Statics.field323, Statics.field788) - Statics.field689;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 125) {
                            int var192 = field284 + field283.field1855;
                            int var193 = field283.method2292();
                            int var194 = field283.method2292();
                            if (field402 != var193) {
                                field402 = var193;
                                method456(field402);
                                class33.method1970(field402);
                                for (int var195 = 0; var195 < 100; var195++) {
                                    field264[var195] = true;
                                }
                            }
                            while (var194-- > 0) {
                                int var196 = field283.method2195();
                                int var197 = field283.method2292();
                                int var198 = field283.method2142();
                                class4 var199 = (class4) field403.method3257((long) var196);
                                if (var199 != null && var199.field56 != var197) {
                                    method31(var199, true);
                                    var199 = null;
                                }
                                if (var199 == null) {
                                    var199 = Statics.method502(var196, var197, var198);
                                }
                                var199.field55 = true;
                            }
                            for (class4 var200 = (class4) field403.method3260(); var200 != null; var200 = (class4) field403.method3261()) {
                                if (var200.field55) {
                                    var200.field55 = false;
                                } else {
                                    method31(var200, true);
                                }
                            }
                            field445 = new class179(512);
                            while (field283.field1855 < var192) {
                                int var201 = field283.method2195();
                                int var202 = field283.method2292();
                                int var203 = field283.method2292();
                                int var204 = field283.method2195();
                                for (int var205 = var202; var205 <= var203; var205++) {
                                    long var206 = ((long) var201 << 32) + (long) var205;
                                    field445.method3258(new class184(var204), var206);
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 124) {
                            byte var208 = field283.method2170();
                            int var209 = field283.method2292();
                            class159.field2691[var209] = var208;
                            if (class159.field2692[var209] != var208) {
                                class159.field2692[var209] = var208;
                                method840(var209);
                            }
                            field336[++field428 - 1 & 0x1F] = var209;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 200) {
                            field382 = false;
                            for (int var210 = 0; var210 < 5; var210++) {
                                field489[var210] = false;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 1) {
                            int var211 = field283.method2195();
                            int var212 = field283.method2175();
                            class157 var213 = class157.method835(var211);
                            if (var213 != null && var213.field2564 == 0) {
                                if (var212 > var213.field2662 - var213.field2617) {
                                    var212 = var213.field2662 - var213.field2617;
                                }
                                if (var212 < 0) {
                                    var212 = 0;
                                }
                                if (var213.field2568 != var212) {
                                    var213.field2568 = var212;
                                    method3452(var213);
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 93 || field285 == 166 || field285 == 132 || field285 == 64 || field285 == 135 || field285 == 39 || field285 == 235 || field285 == 188 || field285 == 247 || field285 == 77) {
                            method2737();
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 202) {
                            String var214 = field283.method2150();
                            Statics.field1767 = var214;
                            try {
                                String var215 = Statics.field386.getParameter(class173.field2852.field2840);
                                String var216 = Statics.field386.getParameter(class173.field2853.field2840);
                                String var217 = var215 + "settings=" + var214 + "; version=1; path=/; domain=" + var216;
                                String var218;
                                if (var214.length() == 0) {
                                    var218 = var217 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    var218 = var217 + "; Expires=" + class102.method2716(class106.method3592() + 94608000000L) + "; Max-Age=" + 94608000L;
                                }
                                class123.method2460(Statics.field386, "document.cookie=\"" + var218 + "\"");
                            } catch (Throwable var477) {
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 224) {
                            field476 = field283.method2142();
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 179) {
                            method2749(true);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 218) {
                            String var220 = field283.method2150();
                            String var221 = class206.method3540(class213.method122(class205.method1301(field283)));
                            class10.method691(6, var220, var221);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 195) {
                            int var222 = field283.method2176();
                            class14.method2740(var222);
                            field429[++field373 - 1 & 0x1F] = var222 & 0x7FFF;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 219) {
                            int var223 = field283.method2175();
                            if (var223 == 65535) {
                                var223 = -1;
                            }
                            int var224 = field283.method2292();
                            if (var224 == 65535) {
                                var224 = -1;
                            }
                            int var225 = field283.method2195();
                            int var226 = field283.method2127();
                            for (int var227 = var224; var227 <= var223; var227++) {
                                long var228 = ((long) var225 << 32) + (long) var227;
                                class191 var230 = field445.method3257(var228);
                                if (var230 != null) {
                                    var230.method3392();
                                }
                                field445.method3258(new class184(var226), var228);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 76) {
                            int var231 = field283.method2155();
                            boolean var232 = field283.method2142() == 1;
                            String var233 = "";
                            boolean var234 = false;
                            if (var232) {
                                var233 = field283.method2150();
                                if (method1866(var233)) {
                                    var234 = true;
                                }
                            }
                            String var235 = field283.method2150();
                            if (!var234) {
                                class10.method691(var231, var233, var235);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 35) {
                            method439(false);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 11) {
                            int var236 = field283.method2181();
                            int var237 = field283.method2183();
                            int var238 = field283.method2292();
                            class4 var239 = (class4) field403.method3257((long) var237);
                            if (var239 != null) {
                                method31(var239, var239.field56 != var238);
                            }
                            Statics.method502(var237, var238, var236);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 78) {
                            for (int var240 = 0; var240 < Statics.field537; var240++) {
                                class47 var241 = class47.method2746(var240);
                                if (var241 != null) {
                                    class159.field2691[var240] = 0;
                                    class159.field2692[var240] = 0;
                                }
                            }
                            method27();
                            field428 += 32;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 48) {
                            method27();
                            field407 = field283.method2142();
                            field292 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 127) {
                            field382 = true;
                            Statics.field2716 = field283.method2142();
                            Statics.field1124 = field283.method2142();
                            Statics.field1813 = field283.method2292();
                            Statics.field998 = field283.method2142();
                            Statics.field2125 = field283.method2142();
                            if (Statics.field2125 >= 100) {
                                int var242 = Statics.field2716 * 128 + 64;
                                int var243 = Statics.field1124 * 128 + 64;
                                int var244 = method83(var242, var243, Statics.field788) - Statics.field1813;
                                int var245 = var242 - Statics.field1250;
                                int var246 = var244 - Statics.field1984;
                                int var247 = var243 - Statics.field323;
                                int var248 = (int) Math.sqrt((double) (var245 * var245 + var247 * var247));
                                Statics.field535 = (int) (Math.atan2((double) var246, (double) var248) * 325.949D) & 0x7FF;
                                Statics.field92 = (int) (Math.atan2((double) var245, (double) var247) * -325.949D) & 0x7FF;
                                if (Statics.field535 < 128) {
                                    Statics.field535 = 128;
                                }
                                if (Statics.field535 > 383) {
                                    Statics.field535 = 383;
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 156) {
                            field259 = field283.method2174() * 30;
                            field292 = field446;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 79) {
                            if (field402 != -1) {
                                method576(field402, 0);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 56) {
                            field257 = field283.method2142();
                            if (field257 == 1) {
                                field431 = field283.method2292();
                            }
                            if (field257 >= 2 && field257 <= 6) {
                                if (field257 == 2) {
                                    field263 = 64;
                                    field397 = 64;
                                }
                                if (field257 == 3) {
                                    field263 = 0;
                                    field397 = 64;
                                }
                                if (field257 == 4) {
                                    field263 = 128;
                                    field397 = 64;
                                }
                                if (field257 == 5) {
                                    field263 = 64;
                                    field397 = 0;
                                }
                                if (field257 == 6) {
                                    field263 = 64;
                                    field397 = 128;
                                }
                                field257 = 2;
                                field260 = field283.method2292();
                                field261 = field283.method2292();
                                field262 = field283.method2142();
                            }
                            if (field257 == 10) {
                                field463 = field283.method2292();
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 80) {
                            int var249 = field283.method2183();
                            int var250 = field283.method2176();
                            int var251 = field283.method2176();
                            int var252 = field283.method2292();
                            class157 var253 = class157.method835(var249);
                            if (var253.field2602 != var251 || var253.field2603 != var250 || var253.field2605 != var252) {
                                var253.field2602 = var251;
                                var253.field2603 = var250;
                                var253.field2605 = var252;
                                method3452(var253);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 221) {
                            Statics.field791 = field283.method2181();
                            Statics.field303 = field283.method2181();
                            for (int var254 = Statics.field303; var254 < Statics.field303 + 8; var254++) {
                                for (int var255 = Statics.field791; var255 < Statics.field791 + 8; var255++) {
                                    if (field375[Statics.field788][var254][var255] != null) {
                                        field375[Statics.field788][var254][var255] = null;
                                        method3704(var254, var255);
                                    }
                                }
                            }
                            for (class15 var256 = (class15) field376.method3293(); var256 != null; var256 = (class15) field376.method3288()) {
                                if (var256.field200 >= Statics.field303 && var256.field200 < Statics.field303 + 8 && var256.field206 >= Statics.field791 && var256.field206 < Statics.field791 + 8 && Statics.field788 == var256.field212) {
                                    var256.field209 = 0;
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 94) {
                            int var257 = field283.method2195();
                            int var258 = field283.method2127();
                            int var259 = field283.method2175();
                            if (var259 == 65535) {
                                var259 = -1;
                            }
                            class157 var260 = class157.method835(var257);
                            if (var260.field2561) {
                                var260.field2669 = var259;
                                var260.field2670 = var258;
                                class46 var262 = class46.method2398(var259);
                                var260.field2602 = var262.field1049;
                                var260.field2603 = var262.field1029;
                                var260.field2604 = var262.field1059;
                                var260.field2573 = var262.field1013;
                                var260.field2682 = var262.field1032;
                                var260.field2605 = var262.field1027;
                                if (var262.field1022 == 1) {
                                    var260.field2629 = 1;
                                } else {
                                    var260.field2629 = 2;
                                }
                                if (var260.field2594 > 0) {
                                    var260.field2605 = var260.field2605 * 32 / var260.field2594;
                                }
                                method3452(var260);
                            } else {
                                if (var259 == -1) {
                                    var260.field2653 = 0;
                                    field285 = -1;
                                    var1 = true;
                                    break label3058;
                                }
                                class46 var261 = class46.method2398(var259);
                                var260.field2653 = 4;
                                var260.field2571 = var259;
                                var260.field2602 = var261.field1049;
                                var260.field2603 = var261.field1029;
                                var260.field2605 = var261.field1027 * 100 / var258;
                                method3452(var260);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 103) {
                            int var263 = field283.method2195();
                            class4 var264 = (class4) field403.method3257((long) var263);
                            if (var264 != null) {
                                method31(var264, true);
                            }
                            if (field406 != null) {
                                method3452(field406);
                                field406 = null;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 233) {
                            String var265 = field283.method2150();
                            long var266 = (long) field283.method2292();
                            long var268 = (long) field283.method2146();
                            class142[] var270 = new class142[] { class142.field2127, class142.field2128, class142.field2135, class142.field2129, class142.field2130 };
                            class142 var271 = (class142) class100.method1330(var270, field283.method2142());
                            long var272 = (var266 << 32) + var268;
                            boolean var274 = false;
                            for (int var275 = 0; var275 < 100; var275++) {
                                if (field461[var275] == var272) {
                                    var274 = true;
                                    break;
                                }
                            }
                            if (method1866(var265)) {
                                var274 = true;
                            }
                            if (!var274 && field488 == 0) {
                                field461[field342] = var272;
                                field342 = (field342 + 1) % 100;
                                String var276 = class206.method3540(class213.method122(class205.method1301(field283)));
                                byte var277;
                                if (var271.field2133) {
                                    var277 = 7;
                                } else {
                                    var277 = 3;
                                }
                                if (var271.field2132 == -1) {
                                    class10.method691(var277, var265, var276);
                                } else {
                                    int var279 = var271.field2132;
                                    String var280 = "<img=" + var279 + ">";
                                    class10.method691(var277, var280 + var265, var276);
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 169) {
                            field283.field1855 += 28;
                            if (field283.method2259()) {
                                class140.method2564(field283, field283.field1855 - 28);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 175) {
                            int var281 = field283.method2175();
                            int var282 = field283.method2127();
                            class157 var283 = class157.method835(var282);
                            if (var283.field2653 != 2 || var283.field2571 != var281) {
                                var283.field2653 = 2;
                                var283.field2571 = var281;
                                method3452(var283);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 171) {
                            int var284 = field283.method2184();
                            class157 var285 = class157.method835(var284);
                            for (int var286 = 0; var286 < var285.field2667.length; var286++) {
                                var285.field2667[var286] = -1;
                                var285.field2667[var286] = 0;
                            }
                            method3452(var285);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 120) {
                            field362 = field283.method2142();
                            if (field362 == 255) {
                                field362 = 0;
                            }
                            field462 = field283.method2142();
                            if (field462 == 255) {
                                field462 = 0;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 249) {
                            Statics.field20 = class121.method80(field283.method2142());
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 131) {
                            class23 var287 = new class23();
                            var287.field570 = field283.method2150();
                            var287.field580 = field283.method2292();
                            int var288 = field283.method2195();
                            var287.field578 = var288;
                            method2950(45);
                            Statics.field607.method2608();
                            Statics.field607 = null;
                            class29.method1864(var287);
                            field285 = -1;
                            var1 = false;
                            break label3058;
                        }
                        if (field285 == 222) {
                            method27();
                            int var289 = field283.method2166();
                            int var290 = field283.method2184();
                            int var291 = field283.method2181();
                            field381[var289] = var290;
                            field379[var289] = var291;
                            field430[var289] = 1;
                            for (int var292 = 0; var292 < 98; var292++) {
                                if (var290 >= class145.field2163[var292]) {
                                    field430[var289] = var292 + 2;
                                }
                            }
                            field439[++field432 - 1 & 0x1F] = var289;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 87) {
                            int var293 = field283.method2175();
                            field402 = var293;
                            method456(var293);
                            class33.method1970(field402);
                            for (int var294 = 0; var294 < 100; var294++) {
                                field264[var294] = true;
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 170) {
                            int var295 = field283.method2142();
                            int var296 = field283.method2142();
                            int var297 = field283.method2142();
                            int var298 = field283.method2142();
                            field489[var295] = true;
                            field424[var295] = var296;
                            field491[var295] = var297;
                            field492[var295] = var298;
                            field466[var295] = 0;
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 119) {
                            int var299 = field283.method2256();
                            int var300 = field283.method2127();
                            int var301 = field283.method2128();
                            class157 var302 = class157.method835(var300);
                            int var303 = var302.field2569 + var299;
                            int var304 = var302.field2570 + var301;
                            if (var302.field2567 != var303 || var302.field2643 != var304) {
                                var302.field2567 = var303;
                                var302.field2643 = var304;
                                method3452(var302);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 184) {
                            for (int var305 = 0; var305 < field401.length; var305++) {
                                if (field401[var305] != null) {
                                    field401[var305].field747 = -1;
                                }
                            }
                            for (int var306 = 0; var306 < field277.length; var306++) {
                                if (field277[var306] != null) {
                                    field277[var306].field747 = -1;
                                }
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 189) {
                            int var307 = field283.method2142();
                            int var308 = field283.method2142();
                            int var309 = field283.method2142();
                            Statics.field788 = var307 >> 1;
                            Statics.field920.method591(var309, var308, (var307 & 0x1) == 1);
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 18) {
                            boolean var310 = field283.method2207() == 1;
                            int var311 = field283.method2195();
                            class157 var312 = class157.method835(var311);
                            if (var312.field2633 != var310) {
                                var312.field2633 = var310;
                                method3452(var312);
                            }
                            field285 = -1;
                            var1 = true;
                            break label3058;
                        }
                        if (field285 == 150) {
                            method2186();
                            field285 = -1;
                            var1 = false;
                            break label3058;
                        }
                        class139.method1404("" + field285 + class2.field21 + field290 + class2.field21 + field291 + class2.field21 + field284, (Throwable) null);
                        method2186();
                    } catch (IOException var484) {
                        if (field288 > 0) {
                            method2186();
                        } else {
                            method2950(40);
                            Statics.field280 = Statics.field607;
                            Statics.field607 = null;
                        }
                    } catch (Exception var485) {
                        String var315 = "" + field285 + class2.field21 + field290 + class2.field21 + field291 + class2.field21 + field284 + class2.field21 + (Statics.field842 + Statics.field920.field780[0]) + class2.field21 + (Statics.field176 + Statics.field920.field752[0]) + class2.field21;
                        for (int var316 = 0; var316 < field284 && var316 < 50; var316++) {
                            var315 = var315 + field283.field1862[var316] + class2.field21;
                        }
                        class139.method1404(var315, var485);
                        method2186();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field352 != 30) {
            return;
        }
        while (class194.method638()) {
            field281.method2381(199);
            field281.method2203(0);
            int var317 = field281.field1855;
            class194.method2965(field281);
            field281.method2139(field281.field1855 - var317);
        }
        Object var318 = Statics.field536.field168;
        synchronized (Statics.field536.field168) {
            if (!field347) {
                Statics.field536.field172 = 0;
            } else if (class131.field2032 != 0 || Statics.field536.field172 >= 40) {
                field281.method2381(215);
                field281.method2203(0);
                int var319 = field281.field1855;
                int var320 = 0;
                for (int var321 = 0; var321 < Statics.field536.field172 && field281.field1855 - var319 < 240; var321++) {
                    var320++;
                    int var322 = Statics.field536.field171[var321];
                    if (var322 < 0) {
                        var322 = 0;
                    } else if (var322 > 502) {
                        var322 = 502;
                    }
                    int var323 = Statics.field536.field170[var321];
                    if (var323 < 0) {
                        var323 = 0;
                    } else if (var323 > 764) {
                        var323 = 764;
                    }
                    int var324 = var322 * 765 + var323;
                    if (Statics.field536.field171[var321] == -1 && Statics.field536.field170[var321] == -1) {
                        var323 = -1;
                        var322 = -1;
                        var324 = 524287;
                    }
                    if (field504 != var323 || field252 != var322) {
                        int var325 = var323 - field504;
                        field504 = var323;
                        int var326 = var322 - field252;
                        field252 = var322;
                        if (field329 < 8 && var325 >= -32 && var325 <= 31 && var326 >= -32 && var326 <= 31) {
                            var325 += 32;
                            var326 += 32;
                            field281.method2267((field329 << 12) + (var325 << 6) + var326);
                            field329 = 0;
                        } else if (field329 < 8) {
                            field281.method2130((field329 << 19) + 8388608 + var324);
                            field329 = 0;
                        } else {
                            field281.method2131((field329 << 19) + -1073741824 + var324);
                            field329 = 0;
                        }
                    } else if (field329 < 2047) {
                        field329++;
                    }
                }
                field281.method2139(field281.field1855 - var319);
                if (var320 >= Statics.field536.field172) {
                    Statics.field536.field172 = 0;
                } else {
                    Statics.field536.field172 -= var320;
                    for (int var327 = 0; var327 < Statics.field536.field172; var327++) {
                        Statics.field536.field170[var327] = Statics.field536.field170[var320 + var327];
                        Statics.field536.field171[var327] = Statics.field536.field171[var320 + var327];
                    }
                }
            }
        }
        if (class131.field2032 == 1 || !Statics.field2049 && class131.field2032 == 4 || class131.field2032 == 2) {
            long var329 = (class131.field2031 - field250) / 50L;
            if (var329 > 4095L) {
                var329 = 4095L;
            }
            field250 = class131.field2031;
            int var331 = class131.field2035;
            if (var331 < 0) {
                var331 = 0;
            } else if (var331 > 502) {
                var331 = 502;
            }
            int var332 = class131.field2021;
            if (var332 < 0) {
                var332 = 0;
            } else if (var332 > 764) {
                var332 = 764;
            }
            int var333 = var331 * 765 + var332;
            byte var334 = 0;
            if (class131.field2032 == 2) {
                var334 = 1;
            }
            int var335 = (int) var329;
            field281.method2381(180);
            field281.method2131((var334 << 19) + (var335 << 20) + var333);
        }
        if (class128.field1999 > 0) {
            field281.method2381(48);
            field281.method2267(0);
            int var336 = field281.field1855;
            long var337 = class106.method3592();
            for (int var339 = 0; var339 < class128.field1999; var339++) {
                long var340 = var337 - field474;
                if (var340 > 16777215L) {
                    var340 = 16777215L;
                }
                field474 = var337;
                field281.method2178((int) var340);
                field281.method2165(class128.field1998[var339]);
            }
            field281.method2191(field281.field1855 - var336);
        }
        if (field330 > 0) {
            field330--;
        }
        if (class128.field1992[96] || class128.field1992[97] || class128.field1992[98] || class128.field1992[99]) {
            field331 = true;
        }
        if (field331 && field330 <= 0) {
            field330 = 20;
            field331 = false;
            field281.method2381(158);
            field281.method2172(field324);
            field281.method2173(field325);
        }
        if (Statics.field1007 && !field254) {
            field254 = true;
            field281.method2381(2);
            field281.method2203(1);
        }
        if (!Statics.field1007 && field254) {
            field254 = false;
            field281.method2381(2);
            field281.method2203(0);
        }
        method2874();
        if (field352 != 30) {
            return;
        }
        for (class15 var342 = (class15) field376.method3293(); var342 != null; var342 = (class15) field376.method3288()) {
            if (var342.field209 > 0) {
                var342.field209--;
            }
            if (var342.field209 != 0) {
                if (var342.field199 > 0) {
                    var342.field199--;
                }
                if (var342.field199 == 0 && var342.field200 >= 1 && var342.field206 >= 1 && var342.field200 <= 102 && var342.field206 <= 102) {
                    if (var342.field205 >= 0) {
                        int var343 = var342.field205;
                        int var344 = var342.field207;
                        class37 var345 = class37.method2940(var343);
                        if (var344 == 11) {
                            var344 = 10;
                        }
                        if (var344 >= 5 && var344 <= 8) {
                            var344 = 4;
                        }
                        boolean var346 = var345.method651(var344);
                        if (!var346) {
                            continue;
                        }
                    }
                    method2661(var342.field212, var342.field210, var342.field200, var342.field206, var342.field205, var342.field202, var342.field207);
                    var342.field199 = -1;
                    if (var342.field208 == var342.field205 && var342.field208 == -1) {
                        var342.method3392();
                    } else if (var342.field208 == var342.field205 && var342.field203 == var342.field202 && var342.field207 == var342.field204) {
                        var342.method3392();
                    }
                }
            } else if (var342.field208 < 0 || class6.method1769(var342.field208, var342.field204)) {
                method2661(var342.field212, var342.field210, var342.field200, var342.field206, var342.field208, var342.field203, var342.field204);
                var342.method3392();
            }
        }
        int var10002;
        for (int var347 = 0; var347 < field482; var347++) {
            var10002 = field485[var347]--;
            if (field485[var347] >= -10) {
                class53 var349 = field354[var347];
                if (var349 == null) {
                    class53 var486 = (class53) null;
                    var349 = class53.method1033(Statics.field2715, field256[var347], 0);
                    if (var349 == null) {
                        continue;
                    }
                    field485[var347] += var349.method1023();
                    field354[var347] = var349;
                }
                if (field485[var347] < 0) {
                    int var356;
                    if (field238[var347] == 0) {
                        var356 = field487;
                    } else {
                        int var350 = (field238[var347] & 0xFF) * 128;
                        int var351 = field238[var347] >> 16 & 0xFF;
                        int var352 = var351 * 128 + 64 - Statics.field920.field731;
                        if (var352 < 0) {
                            var352 = -var352;
                        }
                        int var353 = field238[var347] >> 8 & 0xFF;
                        int var354 = var353 * 128 + 64 - Statics.field920.field787;
                        if (var354 < 0) {
                            var354 = -var354;
                        }
                        int var355 = var352 + var354 - 128;
                        if (var355 > var350) {
                            field485[var347] = -100;
                            continue;
                        }
                        if (var355 < 0) {
                            var355 = 0;
                        }
                        var356 = field481 * (var350 - var355) / var350;
                    }
                    if (var356 > 0) {
                        class57 var357 = var349.method1024().method1063(Statics.field2047);
                        class59 var358 = class59.method1116(var357, 100, var356);
                        var358.method1108(field348[var347] - 1);
                        Statics.field58.method955(var358);
                    }
                    field485[var347] = -100;
                }
            } else {
                field482--;
                for (int var348 = var347; var348 < field482; var348++) {
                    field256[var348] = field256[var348 + 1];
                    field354[var348] = field354[var348 + 1];
                    field348[var348] = field348[var348 + 1];
                    field485[var348] = field485[var348 + 1];
                    field238[var348] = field238[var348 + 1];
                }
                var347--;
            }
        }
        if (field448 && !class166.method2069()) {
            if (field433 != 0 && field479 != -1) {
                class166.method2949(Statics.field162, field479, 0, field433, false);
            }
            field448 = false;
        }
        field286++;
        if (field286 > 750) {
            method3212();
            return;
        }
        method577();
        method109();
        for (int var359 = -1; var359 < field478; var359++) {
            int var360;
            if (var359 == -1) {
                var360 = 2047;
            } else {
                var360 = field247[var359];
            }
            class3 var361 = field401[var360];
            if (var361 != null && var361.field735 > 0) {
                var361.field735--;
                if (var361.field735 == 0) {
                    var361.field739 = null;
                }
            }
        }
        for (int var362 = 0; var362 < field278; var362++) {
            int var363 = field279[var362];
            class31 var364 = field277[var363];
            if (var364 != null && var364.field735 > 0) {
                var364.field735--;
                if (var364.field735 == 0) {
                    var364.field739 = null;
                }
            }
        }
        field316++;
        if (field350 != 0) {
            field423 += 20;
            if (field423 >= 400) {
                field350 = 0;
            }
        }
        if (Statics.field1956 != null) {
            field351++;
            if (field351 >= 15) {
                method3452(Statics.field1956);
                Statics.field1956 = null;
            }
        }
        class157 var365 = Statics.field57;
        class157 var366 = Statics.field159;
        Statics.field57 = null;
        Statics.field159 = null;
        field418 = null;
        field422 = false;
        field494 = false;
        field298 = 0;
        while (class128.method1862() && field298 < 128) {
            if (field409 >= 2 && class128.field1992[82] && Statics.field1005 == 66) {
                String var367 = class10.method462();
                Statics.field640.setContents(new StringSelection(var367), (ClipboardOwner) null);
            } else {
                field465[field298] = Statics.field1005;
                field464[field298] = Statics.field2858;
                field298++;
            }
        }
        int var368 = field402;
        if (class157.method2890(var368)) {
            method2433(Statics.field2673[var368], -1, 0, 0, 765, 503, 0, 0);
        }
        field446++;
        while (true) {
            class1 var369;
            class157 var370;
            class157 var371;
            do {
                var369 = (class1) field475.method3291();
                if (var369 == null) {
                    while (true) {
                        class1 var372;
                        class157 var373;
                        class157 var374;
                        do {
                            var372 = (class1) field444.method3291();
                            if (var372 == null) {
                                while (true) {
                                    class1 var375;
                                    class157 var376;
                                    class157 var377;
                                    do {
                                        var375 = (class1) field442.method3291();
                                        if (var375 == null) {
                                            boolean var378 = false;
                                            while (!var378) {
                                                var378 = true;
                                                for (int var379 = 0; var379 < field377 - 1; var379++) {
                                                    if (field387[var379] < 1000 && field387[var379 + 1] > 1000) {
                                                        String var380 = field390[var379];
                                                        field390[var379] = field390[var379 + 1];
                                                        field390[var379 + 1] = var380;
                                                        String var381 = field389[var379];
                                                        field389[var379] = field389[var379 + 1];
                                                        field389[var379 + 1] = var381;
                                                        int var382 = field387[var379];
                                                        field387[var379] = field387[var379 + 1];
                                                        field387[var379 + 1] = var382;
                                                        int var383 = field385[var379];
                                                        field385[var379] = field385[var379 + 1];
                                                        field385[var379 + 1] = var383;
                                                        int var384 = field384[var379];
                                                        field384[var379] = field384[var379 + 1];
                                                        field384[var379 + 1] = var384;
                                                        int var385 = field388[var379];
                                                        field388[var379] = field388[var379 + 1];
                                                        field388[var379 + 1] = var385;
                                                        var378 = false;
                                                    }
                                                }
                                            }
                                            if (Statics.field941 == null && field419 == null) {
                                                int var386 = class131.field2032;
                                                if (field383) {
                                                    if (var386 != 1 && (Statics.field2049 || var386 != 4)) {
                                                        int var387 = class131.field2022;
                                                        int var388 = class131.field2036 * -379793861;
                                                        if (var387 < Statics.field2459 - 10 || var387 > Statics.field2459 + Statics.field1891 + 10 || var388 < Statics.field158 - 10 || var388 > Statics.field650 + Statics.field158 + 10) {
                                                            field383 = false;
                                                            int var389 = Statics.field2459;
                                                            int var390 = Statics.field158;
                                                            int var391 = Statics.field1891;
                                                            int var392 = Statics.field650;
                                                            for (int var393 = 0; var393 < field417; var393++) {
                                                                if (field453[var393] + field451[var393] > var389 && field451[var393] < var389 + var391 && field454[var393] + field452[var393] > var390 && field452[var393] < var390 + var392) {
                                                                    field264[var393] = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (var386 == 1 || !Statics.field2049 && var386 == 4) {
                                                        int var394 = Statics.field2459;
                                                        int var395 = Statics.field158;
                                                        int var396 = Statics.field1891;
                                                        int var397 = class131.field2021;
                                                        int var398 = class131.field2035;
                                                        int var399 = -1;
                                                        for (int var400 = 0; var400 < field377; var400++) {
                                                            int var401 = (field377 - 1 - var400) * 15 + var395 + 31;
                                                            if (var397 > var394 && var397 < var394 + var396 && var398 > var401 - 13 && var398 < var401 + 3) {
                                                                var399 = var400;
                                                            }
                                                        }
                                                        if (var399 != -1) {
                                                            method64(var399);
                                                        }
                                                        field383 = false;
                                                        int var402 = Statics.field2459;
                                                        int var403 = Statics.field158;
                                                        int var404 = Statics.field1891;
                                                        int var405 = Statics.field650;
                                                        for (int var406 = 0; var406 < field417; var406++) {
                                                            if (field453[var406] + field451[var406] > var402 && field451[var406] < var402 + var404 && field454[var406] + field452[var406] > var403 && field452[var406] < var403 + var405) {
                                                                field264[var406] = true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    label3176: {
                                                        int var408;
                                                        int var409;
                                                        label3296: {
                                                            if ((var386 == 1 || !Statics.field2049 && var386 == 4) && field377 > 0) {
                                                                int var407 = field387[field377 - 1];
                                                                if (var407 == 39 || var407 == 40 || var407 == 41 || var407 == 42 || var407 == 43 || var407 == 33 || var407 == 34 || var407 == 35 || var407 == 36 || var407 == 37 || var407 == 38 || var407 == 1005) {
                                                                    var408 = field385[field377 - 1];
                                                                    var409 = field384[field377 - 1];
                                                                    class157 var410 = class157.method835(var409);
                                                                    int var411 = method153(var410);
                                                                    boolean var412 = (var411 >> 28 & 0x1) != 0;
                                                                    if (var412) {
                                                                        break label3296;
                                                                    }
                                                                    int var413 = method153(var410);
                                                                    boolean var414 = (var413 >> 29 & 0x1) != 0;
                                                                    if (var414) {
                                                                        break label3296;
                                                                    }
                                                                }
                                                            }
                                                            if (var386 == 1 || !Statics.field2049 && var386 == 4) {
                                                                label3289: {
                                                                    if (field496 != 1 || field377 <= 2) {
                                                                        int var422 = field377 - 1;
                                                                        boolean var423;
                                                                        if (var422 < 0) {
                                                                            var423 = false;
                                                                        } else {
                                                                            int var424 = field387[var422];
                                                                            if (var424 >= 2000) {
                                                                                var424 -= 2000;
                                                                            }
                                                                            if (var424 == 1007) {
                                                                                var423 = true;
                                                                            } else {
                                                                                var423 = false;
                                                                            }
                                                                        }
                                                                        if (!var423) {
                                                                            break label3289;
                                                                        }
                                                                    }
                                                                    var386 = 2;
                                                                }
                                                            }
                                                            if ((var386 == 1 || !Statics.field2049 && var386 == 4) && field377 > 0) {
                                                                method64(field377 - 1);
                                                            }
                                                            if (var386 == 2 && field377 > 0) {
                                                                method1767(class131.field2021, class131.field2035);
                                                            }
                                                            break label3176;
                                                        }
                                                        if (Statics.field941 != null && !field357 && field496 != 1) {
                                                            int var415 = field377 - 1;
                                                            boolean var416;
                                                            if (var415 < 0) {
                                                                var416 = false;
                                                            } else {
                                                                int var417 = field387[var415];
                                                                if (var417 >= 2000) {
                                                                    var417 -= 2000;
                                                                }
                                                                if (var417 == 1007) {
                                                                    var416 = true;
                                                                } else {
                                                                    var416 = false;
                                                                }
                                                            }
                                                            if (!var416 && field377 > 0) {
                                                                int var418 = field490;
                                                                int var419 = field370;
                                                                class28 var420 = Statics.field557;
                                                                method700(var420.field636, var420.field635, var420.field637, var420.field638, var420.field639, var420.field639, var418, var419);
                                                                Statics.field557 = null;
                                                            }
                                                        }
                                                        field357 = false;
                                                        field358 = 0;
                                                        if (Statics.field941 != null) {
                                                            method3452(Statics.field941);
                                                        }
                                                        Statics.field941 = class157.method835(var409);
                                                        field353 = var408;
                                                        field490 = class131.field2021;
                                                        field370 = class131.field2035;
                                                        if (field377 > 0) {
                                                            int var421 = field377 - 1;
                                                            Statics.field557 = new class28();
                                                            Statics.field557.field636 = field385[var421];
                                                            Statics.field557.field635 = field384[var421];
                                                            Statics.field557.field637 = field387[var421];
                                                            Statics.field557.field638 = field388[var421];
                                                            Statics.field557.field639 = field389[var421];
                                                        }
                                                        method3452(Statics.field941);
                                                    }
                                                }
                                            }
                                            if (field419 != null) {
                                                method1957();
                                            }
                                            if (Statics.field941 != null) {
                                                method3452(Statics.field941);
                                                field358++;
                                                if (class131.field2025 == 0) {
                                                    if (!field357) {
                                                        label3241: {
                                                            label2178: {
                                                                if (field496 != 1) {
                                                                    int var433 = field377 - 1;
                                                                    boolean var434;
                                                                    if (var433 < 0) {
                                                                        var434 = false;
                                                                    } else {
                                                                        int var435 = field387[var433];
                                                                        if (var435 >= 2000) {
                                                                            var435 -= 2000;
                                                                        }
                                                                        if (var435 == 1007) {
                                                                            var434 = true;
                                                                        } else {
                                                                            var434 = false;
                                                                        }
                                                                    }
                                                                    if (!var434) {
                                                                        break label2178;
                                                                    }
                                                                }
                                                                if (field377 > 2) {
                                                                    method1767(field490, field370);
                                                                    break label3241;
                                                                }
                                                            }
                                                            if (field377 > 0) {
                                                                int var436 = field490;
                                                                int var437 = field370;
                                                                class28 var438 = Statics.field557;
                                                                method700(var438.field636, var438.field635, var438.field637, var438.field638, var438.field639, var438.field639, var436, var437);
                                                                Statics.field557 = null;
                                                            }
                                                        }
                                                    } else if (Statics.field941 == Statics.field65 && field353 != field243) {
                                                        class157 var425 = Statics.field941;
                                                        byte var426 = 0;
                                                        if (field405 == 1 && var425.field2563 == 206) {
                                                            var426 = 1;
                                                        }
                                                        if (var425.field2667[field243] <= 0) {
                                                            var426 = 0;
                                                        }
                                                        int var427 = method153(var425);
                                                        boolean var428 = (var427 >> 29 & 0x1) != 0;
                                                        if (var428) {
                                                            int var429 = field353;
                                                            int var430 = field243;
                                                            var425.field2667[var430] = var425.field2667[var429];
                                                            var425.field2668[var430] = var425.field2668[var429];
                                                            var425.field2667[var429] = -1;
                                                            var425.field2668[var429] = 0;
                                                        } else if (var426 == 1) {
                                                            int var431 = field353;
                                                            int var432 = field243;
                                                            while (var431 != var432) {
                                                                if (var431 > var432) {
                                                                    var425.method2898(var431 - 1, var431);
                                                                    var431--;
                                                                } else if (var431 < var432) {
                                                                    var425.method2898(var431 + 1, var431);
                                                                    var431++;
                                                                }
                                                            }
                                                        } else {
                                                            var425.method2898(field243, field353);
                                                        }
                                                        field281.method2381(13);
                                                        field281.method2172(field243);
                                                        field281.method2163(var426);
                                                        field281.method2182(Statics.field941.field2562);
                                                        field281.method2173(field353);
                                                    }
                                                    field351 = 10;
                                                    class131.field2032 = 0;
                                                    Statics.field941 = null;
                                                } else if (field358 >= 5 && (class131.field2022 > field490 + 5 || class131.field2022 < field490 - 5 || class131.field2036 * -379793861 > field370 + 5 || class131.field2036 * -379793861 < field370 - 5)) {
                                                    field357 = true;
                                                }
                                            }
                                            if (class80.field1392 != -1) {
                                                int var439 = class80.field1392;
                                                int var440 = class80.field1393;
                                                field281.method2381(6);
                                                field281.method2203(5);
                                                field281.method2165(class128.field1992[82] ? (class128.field1992[81] ? 2 : 1) : 0);
                                                field281.method2173(Statics.field176 + var440);
                                                field281.method2301(Statics.field842 + var439);
                                                class80.field1392 = -1;
                                                field246 = class131.field2021;
                                                field320 = class131.field2035;
                                                field350 = 1;
                                                field423 = 0;
                                                field362 = var439;
                                                field462 = var440;
                                            }
                                            if (Statics.field57 != var365) {
                                                if (var365 != null) {
                                                    method3452(var365);
                                                }
                                                if (Statics.field57 != null) {
                                                    method3452(Statics.field57);
                                                }
                                            }
                                            if (Statics.field159 != var366 && field467 == field289) {
                                                if (var366 != null) {
                                                    method3452(var366);
                                                }
                                                if (Statics.field159 != null) {
                                                    method3452(Statics.field159);
                                                }
                                            }
                                            if (Statics.field159 == null) {
                                                if (field467 > 0) {
                                                    field467--;
                                                }
                                            } else if (field467 < field289) {
                                                field467++;
                                                if (field467 == field289) {
                                                    method3452(Statics.field159);
                                                }
                                            }
                                            int var441 = field253 + Statics.field920.field731;
                                            int var442 = field306 + Statics.field920.field787;
                                            if (Statics.field722 - var441 < -500 || Statics.field722 - var441 > 500 || Statics.field61 - var442 < -500 || Statics.field61 - var442 > 500) {
                                                Statics.field722 = var441;
                                                Statics.field61 = var442;
                                            }
                                            if (Statics.field722 != var441) {
                                                Statics.field722 += (var441 - Statics.field722) / 16;
                                            }
                                            if (Statics.field61 != var442) {
                                                Statics.field61 += (var442 - Statics.field61) / 16;
                                            }
                                            if (class131.field2025 == 4 && Statics.field2049) {
                                                int var443 = class131.field2036 * -379793861 - field302;
                                                field327 = var443 * 2;
                                                field302 = var443 == -1 || var443 == 1 ? class131.field2036 * -379793861 : (field302 + class131.field2036 * -379793861) / 2;
                                                int var444 = field328 - class131.field2022;
                                                field326 = var444 * 2;
                                                field328 = var444 == -1 || var444 == 1 ? class131.field2022 : (field328 + class131.field2022) / 2;
                                            } else {
                                                if (class128.field1992[96]) {
                                                    field326 += (-24 - field326) / 2;
                                                } else if (class128.field1992[97]) {
                                                    field326 += (24 - field326) / 2;
                                                } else {
                                                    field326 /= 2;
                                                }
                                                if (class128.field1992[98]) {
                                                    field327 += (12 - field327) / 2;
                                                } else if (class128.field1992[99]) {
                                                    field327 += (-12 - field327) / 2;
                                                } else {
                                                    field327 /= 2;
                                                }
                                                field302 = class131.field2036 * -379793861;
                                                field328 = class131.field2022;
                                            }
                                            field325 = field326 / 2 + field325 & 0x7FF;
                                            field324 += field327 / 2;
                                            if (field324 < 128) {
                                                field324 = 128;
                                            }
                                            if (field324 > 383) {
                                                field324 = 383;
                                            }
                                            int var445 = Statics.field722 >> 7;
                                            int var446 = Statics.field61 >> 7;
                                            int var447 = method83(Statics.field722, Statics.field61, Statics.field788);
                                            int var448 = 0;
                                            if (var445 > 3 && var446 > 3 && var445 < 100 && var446 < 100) {
                                                for (int var449 = var445 - 4; var449 <= var445 + 4; var449++) {
                                                    for (int var450 = var446 - 4; var450 <= var446 + 4; var450++) {
                                                        int var451 = Statics.field788;
                                                        if (var451 < 3 && (class6.field78[1][var449][var450] & 0x2) == 2) {
                                                            var451++;
                                                        }
                                                        int var452 = var447 - class6.field84[var451][var449][var450];
                                                        if (var452 > var448) {
                                                            var448 = var452;
                                                        }
                                                    }
                                                }
                                            }
                                            int var453 = var448 * 192;
                                            if (var453 > 98048) {
                                                var453 = 98048;
                                            }
                                            if (var453 < 32768) {
                                                var453 = 32768;
                                            }
                                            if (var453 > field332) {
                                                field332 += (var453 - field332) / 24;
                                            } else if (var453 < field332) {
                                                field332 += (var453 - field332) / 80;
                                            }
                                            if (field382) {
                                                int var454 = Statics.field1496 * 128 + 64;
                                                int var455 = Statics.field611 * 128 + 64;
                                                int var456 = method83(var454, var455, Statics.field788) - Statics.field689;
                                                if (Statics.field1250 < var454) {
                                                    Statics.field1250 += Statics.field126 * (var454 - Statics.field1250) / 1000 + Statics.field838;
                                                    if (Statics.field1250 > var454) {
                                                        Statics.field1250 = var454;
                                                    }
                                                }
                                                if (Statics.field1250 > var454) {
                                                    Statics.field1250 -= Statics.field126 * (Statics.field1250 - var454) / 1000 + Statics.field838;
                                                    if (Statics.field1250 < var454) {
                                                        Statics.field1250 = var454;
                                                    }
                                                }
                                                if (Statics.field1984 < var456) {
                                                    Statics.field1984 += Statics.field126 * (var456 - Statics.field1984) / 1000 + Statics.field838;
                                                    if (Statics.field1984 > var456) {
                                                        Statics.field1984 = var456;
                                                    }
                                                }
                                                if (Statics.field1984 > var456) {
                                                    Statics.field1984 -= Statics.field126 * (Statics.field1984 - var456) / 1000 + Statics.field838;
                                                    if (Statics.field1984 < var456) {
                                                        Statics.field1984 = var456;
                                                    }
                                                }
                                                if (Statics.field323 < var455) {
                                                    Statics.field323 += Statics.field126 * (var455 - Statics.field323) / 1000 + Statics.field838;
                                                    if (Statics.field323 > var455) {
                                                        Statics.field323 = var455;
                                                    }
                                                }
                                                if (Statics.field323 > var455) {
                                                    Statics.field323 -= Statics.field126 * (Statics.field323 - var455) / 1000 + Statics.field838;
                                                    if (Statics.field323 < var455) {
                                                        Statics.field323 = var455;
                                                    }
                                                }
                                                int var457 = Statics.field2716 * 128 + 64;
                                                int var458 = Statics.field1124 * 128 + 64;
                                                int var459 = method83(var457, var458, Statics.field788) - Statics.field1813;
                                                int var460 = var457 - Statics.field1250;
                                                int var461 = var459 - Statics.field1984;
                                                int var462 = var458 - Statics.field323;
                                                int var463 = (int) Math.sqrt((double) (var460 * var460 + var462 * var462));
                                                int var464 = (int) (Math.atan2((double) var461, (double) var463) * 325.949D) & 0x7FF;
                                                int var465 = (int) (Math.atan2((double) var460, (double) var462) * -325.949D) & 0x7FF;
                                                if (var464 < 128) {
                                                    var464 = 128;
                                                }
                                                if (var464 > 383) {
                                                    var464 = 383;
                                                }
                                                if (Statics.field535 < var464) {
                                                    Statics.field535 += Statics.field2125 * (var464 - Statics.field535) / 1000 + Statics.field998;
                                                    if (Statics.field535 > var464) {
                                                        Statics.field535 = var464;
                                                    }
                                                }
                                                if (Statics.field535 > var464) {
                                                    Statics.field535 -= Statics.field2125 * (Statics.field535 - var464) / 1000 + Statics.field998;
                                                    if (Statics.field535 < var464) {
                                                        Statics.field535 = var464;
                                                    }
                                                }
                                                int var466 = var465 - Statics.field92;
                                                if (var466 > 1024) {
                                                    var466 -= 2048;
                                                }
                                                if (var466 < -1024) {
                                                    var466 += 2048;
                                                }
                                                if (var466 > 0) {
                                                    Statics.field92 += Statics.field2125 * var466 / 1000 + Statics.field998;
                                                    Statics.field92 &= 0x7FF;
                                                }
                                                if (var466 < 0) {
                                                    Statics.field92 -= Statics.field2125 * -var466 / 1000 + Statics.field998;
                                                    Statics.field92 &= 0x7FF;
                                                }
                                                int var467 = var465 - Statics.field92;
                                                if (var467 > 1024) {
                                                    var467 -= 2048;
                                                }
                                                if (var467 < -1024) {
                                                    var467 += 2048;
                                                }
                                                if (var467 < 0 && var466 > 0 || var467 > 0 && var466 < 0) {
                                                    Statics.field92 = var465;
                                                }
                                            }
                                            for (int var468 = 0; var468 < 5; var468++) {
                                                var10002 = field466[var468]++;
                                            }
                                            int var469 = ++class131.field2026 - 1;
                                            int var471 = class128.method68();
                                            if (var469 > 15000 && var471 > 15000) {
                                                field288 = 250;
                                                class131.method486(14500);
                                                field281.method2381(0);
                                            }
                                            field310++;
                                            if (field310 > 500) {
                                                field310 = 0;
                                                int var472 = (int) (Math.random() * 8.0D);
                                                if ((var472 & 0x1) == 1) {
                                                    field253 += field305;
                                                }
                                                if ((var472 & 0x2) == 2) {
                                                    field306 += field307;
                                                }
                                                if ((var472 & 0x4) == 4) {
                                                    field371 += field309;
                                                }
                                            }
                                            if (field253 < -50) {
                                                field305 = 2;
                                            }
                                            if (field253 > 50) {
                                                field305 = -2;
                                            }
                                            if (field306 < -55) {
                                                field307 = 2;
                                            }
                                            if (field306 > 55) {
                                                field307 = -2;
                                            }
                                            if (field371 < -40) {
                                                field309 = 1;
                                            }
                                            if (field371 > 40) {
                                                field309 = -1;
                                            }
                                            field315++;
                                            if (field315 > 500) {
                                                field315 = 0;
                                                int var473 = (int) (Math.random() * 8.0D);
                                                if ((var473 & 0x1) == 1) {
                                                    field311 += field312;
                                                }
                                                if ((var473 & 0x2) == 2) {
                                                    field313 += field314;
                                                }
                                            }
                                            if (field311 < -60) {
                                                field312 = 2;
                                            }
                                            if (field311 > 60) {
                                                field312 = -2;
                                            }
                                            if (field313 < -20) {
                                                field314 = 1;
                                            }
                                            if (field313 > 10) {
                                                field314 = -1;
                                            }
                                            for (class35 var474 = (class35) field421.method3253(); var474 != null; var474 = (class35) field421.method3244()) {
                                                if ((long) var474.field793 < class106.method3592() / 1000L - 5L) {
                                                    if (var474.field792 > 0) {
                                                        class10.method691(5, "", var474.field789 + class147.field2340);
                                                    }
                                                    if (var474.field792 == 0) {
                                                        class10.method691(5, "", var474.field789 + class147.field2323);
                                                    }
                                                    var474.method3388();
                                                }
                                            }
                                            field287++;
                                            if (field287 > 50) {
                                                field281.method2381(149);
                                            }
                                            try {
                                                if (Statics.field607 != null && field281.field1855 > 0) {
                                                    Statics.field607.method2613(field281.field1862, 0, field281.field1855);
                                                    field281.field1855 = 0;
                                                    field287 = 0;
                                                }
                                            } catch (IOException var476) {
                                                method3212();
                                            }
                                            return;
                                        }
                                        var376 = var375.field3;
                                        if (var376.field2680 < 0) {
                                            break;
                                        }
                                        var377 = class157.method835(var376.field2611);
                                    } while (var377 == null || var377.field2630 == null || var376.field2680 >= var377.field2630.length || var377.field2630[var376.field2680] != var376);
                                    class33.method127(var375, 200000);
                                }
                            }
                            var373 = var372.field3;
                            if (var373.field2680 < 0) {
                                break;
                            }
                            var374 = class157.method835(var373.field2611);
                        } while (var374 == null || var374.field2630 == null || var373.field2680 >= var374.field2630.length || var374.field2630[var373.field2680] != var373);
                        class33.method127(var372, 200000);
                    }
                }
                var370 = var369.field3;
                if (var370.field2680 < 0) {
                    break;
                }
                var371 = class157.method835(var370.field2611);
            } while (var371 == null || var371.field2630 == null || var370.field2680 >= var371.field2630.length || var371.field2630[var370.field2680] != var370);
            class33.method127(var369, 200000);
        }
    }

    @ObfuscatedName("di.c(I)V")
    public static final void method2364() {
        if (Statics.field4 != null) {
            Statics.field4.method977();
        }
        if (Statics.field1299 != null) {
            Statics.field1299.method977();
        }
    }

    @ObfuscatedName("cw.d(IIII)V")
    public static void method1956(int arg0, int arg1, int arg2) {
        if (field487 == 0 || arg1 == 0 || field482 >= 50) {
            return;
        }
        field256[field482] = arg0;
        field348[field482] = arg1;
        field485[field482] = arg2;
        field354[field482] = null;
        field238[field482] = 0;
        field482++;
    }

    @ObfuscatedName("p.l(II)V")
    public static void method63(int arg0) {
        if (arg0 == -1 && !field448) {
            class166.method2062();
        } else if (arg0 != -1 && field479 != arg0 && field433 != 0 && !field448) {
            class166.method2742(2, Statics.field162, arg0, 0, field433, false);
        }
        field479 = arg0;
    }

    @ObfuscatedName("eo.u(B)V")
    public static final void method2874() {
        if (field245 && Statics.field788 != field296) {
            method1969(Statics.field1882, Statics.field1871, Statics.field788, Statics.field920.field780[0], Statics.field920.field752[0]);
        } else if (Statics.field788 != field477) {
            field477 = Statics.field788;
            method1858(Statics.field788);
        }
    }

    @ObfuscatedName("dr.r(III)V")
    public static final void method2479(int arg0, int arg1) {
        if (field476 != 0 && field476 != 3 || class131.field2032 != 1 && Statics.field2049 || class131.field2032 != 4) {
            return;
        }
        int var2 = class131.field2021 - 25 - arg0;
        int var3 = class131.field2035 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field325 + field311 & 0x7FF;
        int var5 = class85.field1483[var4];
        int var6 = class85.field1469[var4];
        int var7 = (field313 + 256) * var5 >> 8;
        int var8 = (field313 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field920.field731 + var9 >> 7;
        int var12 = Statics.field920.field787 - var10 >> 7;
        field281.method2381(249);
        field281.method2203(18);
        field281.method2165(class128.field1992[82] ? (class128.field1992[81] ? 2 : 1) : 0);
        field281.method2173(Statics.field176 + var12);
        field281.method2301(Statics.field842 + var11);
        field281.method2203(var2);
        field281.method2203(var3);
        field281.method2267(field325);
        field281.method2203(57);
        field281.method2203(field311);
        field281.method2203(field313);
        field281.method2203(89);
        field281.method2267(Statics.field920.field731);
        field281.method2267(Statics.field920.field787);
        field281.method2203(63);
        field362 = var11;
        field462 = var12;
    }

    @ObfuscatedName("ai.an(I)V")
    public static final void method577() {
        for (int var0 = -1; var0 < field478; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field247[var0];
            }
            class3 var2 = field401[var1];
            if (var2 != null) {
                method525(var2, 1);
            }
        }
    }

    @ObfuscatedName("z.ao(I)V")
    public static final void method109() {
        for (int var0 = 0; var0 < field278; var0++) {
            int var1 = field279[var0];
            class31 var2 = field277[var1];
            if (var2 != null) {
                method525(var2, var2.field696.field804);
            }
        }
    }

    @ObfuscatedName("u.ah(Lal;IB)V")
    public static final void method525(class34 arg0, int arg1) {
        if (arg0.field771 > field249) {
            method985(arg0);
        } else if (arg0.field772 >= field249) {
            method476(arg0);
        } else {
            arg0.field754 = arg0.field783;
            if (arg0.field779 == 0) {
                arg0.field784 = 0;
            } else {
                label314: {
                    if (arg0.field747 != -1 && arg0.field756 == 0) {
                        class39 var2 = class39.method1863(arg0.field747);
                        if (arg0.field727 > 0 && var2.field915 == 0) {
                            arg0.field784++;
                            break label314;
                        }
                        if (arg0.field727 <= 0 && var2.field916 == 0) {
                            arg0.field784++;
                            break label314;
                        }
                    }
                    int var3 = arg0.field731;
                    int var4 = arg0.field787;
                    int var5 = arg0.field780[arg0.field779 - 1] * 128 + arg0.field730 * 64;
                    int var6 = arg0.field752[arg0.field779 - 1] * 128 + arg0.field730 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field776 = 1280;
                            } else if (var4 > var6) {
                                arg0.field776 = 1792;
                            } else {
                                arg0.field776 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field776 = 768;
                            } else if (var4 > var6) {
                                arg0.field776 = 256;
                            } else {
                                arg0.field776 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field776 = 1024;
                        } else if (var4 > var6) {
                            arg0.field776 = 0;
                        }
                        int var7 = arg0.field776 - arg0.field761 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field728;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field734;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field737;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field781;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field734;
                        }
                        arg0.field754 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class31) {
                            var10 = ((class31) arg0).field696.field815;
                        }
                        if (var10) {
                            if (arg0.field776 != arg0.field761 && arg0.field751 == -1 && arg0.field778 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field779 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field779 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field784 > 0 && arg0.field779 > 1) {
                                var9 = 8;
                                arg0.field784--;
                            }
                        } else {
                            if (arg0.field779 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field779 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field784 > 0 && arg0.field779 > 1) {
                                var9 = 8;
                                arg0.field784--;
                            }
                        }
                        if (arg0.field782[arg0.field779 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field754 == arg0.field734 && arg0.field744 != -1) {
                            arg0.field754 = arg0.field744;
                        }
                        if (var3 < var5) {
                            arg0.field731 += var9;
                            if (arg0.field731 > var5) {
                                arg0.field731 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field731 -= var9;
                            if (arg0.field731 < var5) {
                                arg0.field731 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field787 += var9;
                            if (arg0.field787 > var6) {
                                arg0.field787 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field787 -= var9;
                            if (arg0.field787 < var6) {
                                arg0.field787 = var6;
                            }
                        }
                        if (arg0.field731 == var5 && arg0.field787 == var6) {
                            arg0.field779--;
                            if (arg0.field727 > 0) {
                                arg0.field727--;
                            }
                        }
                    } else {
                        arg0.field731 = var5;
                        arg0.field787 = var6;
                    }
                }
            }
        }
        if (arg0.field731 < 128 || arg0.field787 < 128 || arg0.field731 >= 13184 || arg0.field787 >= 13184) {
            arg0.field747 = -1;
            arg0.field762 = -1;
            arg0.field771 = 0;
            arg0.field772 = 0;
            arg0.field731 = arg0.field780[0] * 128 + arg0.field730 * 64;
            arg0.field787 = arg0.field752[0] * 128 + arg0.field730 * 64;
            arg0.method592();
        }
        if (Statics.field920 == arg0 && (arg0.field731 < 1536 || arg0.field787 < 1536 || arg0.field731 >= 11776 || arg0.field787 >= 11776)) {
            arg0.field747 = -1;
            arg0.field762 = -1;
            arg0.field771 = 0;
            arg0.field772 = 0;
            arg0.field731 = arg0.field780[0] * 128 + arg0.field730 * 64;
            arg0.field787 = arg0.field752[0] * 128 + arg0.field730 * 64;
            arg0.method592();
        }
        method1848(arg0);
        arg0.field729 = false;
        if (arg0.field754 != -1) {
            class39 var11 = class39.method1863(arg0.field754);
            if (var11 == null || var11.field904 == null) {
                arg0.field754 = -1;
            } else {
                arg0.field740++;
                if (arg0.field766 < var11.field904.length && arg0.field740 > var11.field906[arg0.field766]) {
                    arg0.field740 = 1;
                    arg0.field766++;
                    Statics.method3408(var11, arg0.field766, arg0.field731, arg0.field787);
                }
                if (arg0.field766 >= var11.field904.length) {
                    arg0.field740 = 0;
                    arg0.field766 = 0;
                    Statics.method3408(var11, arg0.field766, arg0.field731, arg0.field787);
                }
            }
        }
        if (arg0.field762 != -1 && field249 >= arg0.field765) {
            if (arg0.field763 < 0) {
                arg0.field763 = 0;
            }
            int var12 = class40.method1763(arg0.field762).field929;
            if (var12 == -1) {
                arg0.field762 = -1;
            } else {
                class39 var13 = class39.method1863(var12);
                if (var13 == null || var13.field904 == null) {
                    arg0.field762 = -1;
                } else {
                    arg0.field749++;
                    if (arg0.field763 < var13.field904.length && arg0.field749 > var13.field906[arg0.field763]) {
                        arg0.field749 = 1;
                        arg0.field763++;
                        Statics.method3408(var13, arg0.field763, arg0.field731, arg0.field787);
                    }
                    if (arg0.field763 >= var13.field904.length && (arg0.field763 < 0 || arg0.field763 >= var13.field904.length)) {
                        arg0.field762 = -1;
                    }
                }
            }
        }
        if (arg0.field747 != -1 && arg0.field756 <= 1) {
            class39 var14 = class39.method1863(arg0.field747);
            if (var14.field915 == 1 && arg0.field727 > 0 && arg0.field771 <= field249 && arg0.field772 < field249) {
                arg0.field756 = 1;
                return;
            }
        }
        if (arg0.field747 != -1 && arg0.field756 == 0) {
            class39 var15 = class39.method1863(arg0.field747);
            if (var15 == null || var15.field904 == null) {
                arg0.field747 = -1;
            } else {
                arg0.field759++;
                if (arg0.field758 < var15.field904.length && arg0.field759 > var15.field906[arg0.field758]) {
                    arg0.field759 = 1;
                    arg0.field758++;
                    Statics.method3408(var15, arg0.field758, arg0.field731, arg0.field787);
                }
                if (arg0.field758 >= var15.field904.length) {
                    arg0.field758 -= var15.field908;
                    arg0.field755++;
                    if (arg0.field755 >= var15.field921) {
                        arg0.field747 = -1;
                    } else if (arg0.field758 >= 0 && arg0.field758 < var15.field904.length) {
                        Statics.method3408(var15, arg0.field758, arg0.field731, arg0.field787);
                    } else {
                        arg0.field747 = -1;
                    }
                }
                arg0.field729 = var15.field910;
            }
        }
        if (arg0.field756 > 0) {
            arg0.field756--;
        }
    }

    @ObfuscatedName("ab.ai(Lal;I)V")
    public static final void method985(class34 arg0) {
        int var1 = arg0.field771 - field249;
        int var2 = arg0.field767 * 128 + arg0.field730 * 64;
        int var3 = arg0.field769 * 128 + arg0.field730 * 64;
        arg0.field731 += (var2 - arg0.field731) / var1;
        arg0.field787 += (var3 - arg0.field787) / var1;
        arg0.field784 = 0;
        if (arg0.field773 == 0) {
            arg0.field776 = 1024;
        }
        if (arg0.field773 == 1) {
            arg0.field776 = 1536;
        }
        if (arg0.field773 == 2) {
            arg0.field776 = 0;
        }
        if (arg0.field773 == 3) {
            arg0.field776 = 512;
        }
    }

    @ObfuscatedName("m.aa(Lal;I)V")
    public static final void method476(class34 arg0) {
        if (field249 == arg0.field772 || arg0.field747 == -1 || arg0.field756 != 0 || arg0.field759 + 1 > class39.method1863(arg0.field747).field906[arg0.field758]) {
            int var1 = arg0.field772 - arg0.field771;
            int var2 = field249 - arg0.field771;
            int var3 = arg0.field767 * 128 + arg0.field730 * 64;
            int var4 = arg0.field769 * 128 + arg0.field730 * 64;
            int var5 = arg0.field768 * 128 + arg0.field730 * 64;
            int var6 = arg0.field770 * 128 + arg0.field730 * 64;
            arg0.field731 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field787 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field784 = 0;
        if (arg0.field773 == 0) {
            arg0.field776 = 1024;
        }
        if (arg0.field773 == 1) {
            arg0.field776 = 1536;
        }
        if (arg0.field773 == 2) {
            arg0.field776 = 0;
        }
        if (arg0.field773 == 3) {
            arg0.field776 = 512;
        }
        arg0.field761 = arg0.field776;
    }

    @ObfuscatedName("cn.ag(Lal;I)V")
    public static final void method1848(class34 arg0) {
        if (arg0.field778 == 0) {
            return;
        }
        if (arg0.field751 != -1 && arg0.field751 < 32768) {
            class31 var1 = field277[arg0.field751];
            if (var1 != null) {
                int var2 = arg0.field731 - var1.field731;
                int var3 = arg0.field787 - var1.field787;
                if (var2 != 0 || var3 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field751 >= 32768) {
            int var4 = arg0.field751 - 32768;
            if (field366 == var4) {
                var4 = 2047;
            }
            class3 var5 = field401[var4];
            if (var5 != null) {
                int var6 = arg0.field731 - var5.field731;
                int var7 = arg0.field787 - var5.field787;
                if (var6 != 0 || var7 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field745 != 0 || arg0.field757 != 0) && (arg0.field779 == 0 || arg0.field784 > 0)) {
            int var8 = arg0.field731 - (arg0.field745 * 64 - Statics.field842 * 64 - Statics.field842 * 64);
            int var9 = arg0.field787 - (arg0.field757 * 64 - Statics.field176 * 64 - Statics.field176 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field776 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field745 = 0;
            arg0.field757 = 0;
        }
        int var10 = arg0.field776 - arg0.field761 & 0x7FF;
        if (var10 == 0) {
            arg0.field777 = 0;
            return;
        }
        arg0.field777++;
        if (var10 > 1024) {
            arg0.field761 -= arg0.field778;
            boolean var11 = true;
            if (var10 < arg0.field778 || var10 > 2048 - arg0.field778) {
                arg0.field761 = arg0.field776;
                var11 = false;
            }
            if (arg0.field783 == arg0.field754 && (arg0.field777 > 25 || var11)) {
                if (arg0.field732 == -1) {
                    arg0.field754 = arg0.field734;
                } else {
                    arg0.field754 = arg0.field732;
                }
            }
        } else {
            arg0.field761 += arg0.field778;
            boolean var12 = true;
            if (var10 < arg0.field778 || var10 > 2048 - arg0.field778) {
                arg0.field761 = arg0.field776;
                var12 = false;
            }
            if (arg0.field783 == arg0.field754 && (arg0.field777 > 25 || var12)) {
                if (arg0.field764 == -1) {
                    arg0.field754 = arg0.field734;
                } else {
                    arg0.field754 = arg0.field764;
                }
            }
        }
        arg0.field761 &= 0x7FF;
    }

    @ObfuscatedName("x.ar(Li;III)V")
    public static void method145(class3 arg0, int arg1, int arg2) {
        if (arg0.field747 == arg1 && arg1 != -1) {
            int var3 = class39.method1863(arg1).field917;
            if (var3 == 1) {
                arg0.field758 = 0;
                arg0.field759 = 0;
                arg0.field756 = arg2;
                arg0.field755 = 0;
            }
            if (var3 == 2) {
                arg0.field755 = 0;
            }
        } else if (arg1 == -1 || arg0.field747 == -1 || class39.method1863(arg1).field911 >= class39.method1863(arg0.field747).field911) {
            arg0.field747 = arg1;
            arg0.field758 = 0;
            arg0.field759 = 0;
            arg0.field756 = arg2;
            arg0.field755 = 0;
            arg0.field727 = arg0.field779;
        }
    }

    @ObfuscatedName("bu.al(I)V")
    public static final void method1369() {
        if (field402 != -1) {
            method1870(field402);
        }
        for (int var0 = 0; var0 < field417; var0++) {
            if (field264[var0]) {
                field449[var0] = true;
            }
            field450[var0] = field264[var0];
            field264[var0] = false;
        }
        field447 = field249;
        field391 = -1;
        field392 = -1;
        Statics.field65 = null;
        if (field402 != -1) {
            field417 = 0;
            method146(field402, 0, 0, 765, 503, 0, 0, -1);
        }
        class74.method1506();
        if (field383) {
            int var1 = Statics.field2459;
            int var2 = Statics.field158;
            int var3 = Statics.field1891;
            int var4 = Statics.field650;
            int var5 = 6116423;
            class74.method1512(var1, var2, var3, var4, var5);
            class74.method1512(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class74.method1526(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field1918.method3500(class147.field2343, var1 + 3, var2 + 14, var5, -1);
            int var6 = class131.field2022;
            int var7 = class131.field2036 * -379793861;
            for (int var8 = 0; var8 < field377; var8++) {
                int var9 = (field377 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                class207 var11 = Statics.field1918;
                String var12;
                if (field390[var8].length() > 0) {
                    var12 = field389[var8] + class147.field2336 + field390[var8];
                } else {
                    var12 = field389[var8];
                }
                var11.method3500(var12, var1 + 3, var9, var10, 0);
            }
            method2325(Statics.field2459, Statics.field158, Statics.field1891, Statics.field650);
        } else if (field391 != -1) {
            method572(field391, field392);
        }
        if (field455 == 3) {
            for (int var13 = 0; var13 < field417; var13++) {
                if (field450[var13]) {
                    class74.method1523(field451[var13], field452[var13], field453[var13], field454[var13], 16711935, 128);
                } else if (field449[var13]) {
                    class74.method1523(field451[var13], field452[var13], field453[var13], field454[var13], 16711680, 128);
                }
            }
        }
        class21.method803(Statics.field788, Statics.field920.field731, Statics.field920.field787, field316);
        field316 = 0;
    }

    @ObfuscatedName("cp.ae(Ljava/lang/String;ZI)V")
    public static final void method1768(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1825.method3498(arg0, 250);
        int var6 = Statics.field1825.method3511(arg0, 250) * 13;
        class74.method1512(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1526(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1825.method3503(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field417; var11++) {
            if (field453[var11] + field451[var11] > var7 && field451[var11] < var7 + var9 && field454[var11] + field452[var11] > var8 && field452[var11] < var8 + var10) {
                field264[var11] = true;
            }
        }
        if (!arg1) {
            method2325(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var12 = Statics.field2149.getGraphics();
            Statics.field1952.method1342(var12, 0, 0);
        } catch (Exception var14) {
            Statics.field2149.repaint();
        }
    }

    @ObfuscatedName("ft.ak(IIIII)V")
    public static final void method3092(int arg0, int arg1, int arg2, int arg3) {
        class74.method1507(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1771();
        field344++;
        method455(class30.field684);
        boolean var4 = false;
        if (field242 >= 0) {
            for (int var5 = 0; var5 < field478; var5++) {
                if (field242 == field247[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method455(class30.field685);
        }
        method29(true);
        method455(var4 ? class30.field687 : class30.field690);
        method29(false);
        method120();
        method24();
        if (!field382) {
            int var6 = field324;
            if (field332 / 256 > var6) {
                var6 = field332 / 256;
            }
            if (field489[4] && field491[4] + 128 > var6) {
                var6 = field491[4] + 128;
            }
            int var7 = field371 + field325 & 0x7FF;
            method121(Statics.field722, method83(Statics.field920.field731, Statics.field920.field787, Statics.field788) - 50, Statics.field61, var6, var7, var6 * 3 + 600);
        }
        int var20;
        if (field382) {
            var20 = method703();
        } else {
            int var8;
            if (Statics.field1422.field135) {
                var8 = Statics.field788;
            } else {
                int var9 = 3;
                if (Statics.field535 < 310) {
                    int var10 = Statics.field1250 >> 7;
                    int var11 = Statics.field323 >> 7;
                    int var12 = Statics.field920.field731 >> 7;
                    int var13 = Statics.field920.field787 >> 7;
                    if ((class6.field78[Statics.field788][var10][var11] & 0x4) != 0) {
                        var9 = Statics.field788;
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
                            if ((class6.field78[Statics.field788][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field788;
                            }
                            var17 += var16;
                            if (var17 >= 65536) {
                                var17 -= 65536;
                                if (var11 < var13) {
                                    var11++;
                                } else if (var11 > var13) {
                                    var11--;
                                }
                                if ((class6.field78[Statics.field788][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field788;
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
                            if ((class6.field78[Statics.field788][var10][var11] & 0x4) != 0) {
                                var9 = Statics.field788;
                            }
                            var19 += var18;
                            if (var19 >= 65536) {
                                var19 -= 65536;
                                if (var10 < var12) {
                                    var10++;
                                } else if (var10 > var12) {
                                    var10--;
                                }
                                if ((class6.field78[Statics.field788][var10][var11] & 0x4) != 0) {
                                    var9 = Statics.field788;
                                }
                            }
                        }
                    }
                }
                if ((class6.field78[Statics.field788][Statics.field920.field731 >> 7][Statics.field920.field787 >> 7] & 0x4) != 0) {
                    var9 = Statics.field788;
                }
                var8 = var9;
            }
            var20 = var8;
        }
        int var21 = Statics.field1250;
        int var22 = Statics.field1984;
        int var23 = Statics.field323;
        int var24 = Statics.field535;
        int var25 = Statics.field92;
        for (int var26 = 0; var26 < 5; var26++) {
            if (field489[var26]) {
                int var27 = (int) (Math.random() * (double) (field424[var26] * 2 + 1) - (double) field424[var26] + Math.sin((double) field492[var26] / 100.0D * (double) field466[var26]) * (double) field491[var26]);
                if (var26 == 0) {
                    Statics.field1250 += var27;
                }
                if (var26 == 1) {
                    Statics.field1984 += var27;
                }
                if (var26 == 2) {
                    Statics.field323 += var27;
                }
                if (var26 == 3) {
                    Statics.field92 = Statics.field92 + var27 & 0x7FF;
                }
                if (var26 == 4) {
                    Statics.field535 += var27;
                    if (Statics.field535 < 128) {
                        Statics.field535 = 128;
                    }
                    if (Statics.field535 > 383) {
                        Statics.field535 = 383;
                    }
                }
            }
        }
        int var28 = class131.field2022;
        int var29 = class131.field2036 * -379793861;
        if (class131.field2032 != 0) {
            var28 = class131.field2021;
            var29 = class131.field2035;
        }
        if (var28 >= arg0 && var28 < arg0 + arg2 && var29 >= arg1 && var29 < arg1 + arg3) {
            class99.field1703 = true;
            class99.field1756 = 0;
            class99.field1754 = var28 - arg0;
            class99.field1742 = var29 - arg1;
        } else {
            class99.field1703 = false;
            class99.field1756 = 0;
        }
        method2364();
        class74.method1512(arg0, arg1, arg2, arg3, 0);
        method2364();
        Statics.field1098.method1616(Statics.field1250, Statics.field1984, Statics.field323, Statics.field535, Statics.field92, var20);
        method2364();
        Statics.field1098.method1617();
        field333 = 0;
        boolean var30 = false;
        int var31 = -1;
        for (int var32 = -1; var32 < field478 + field278; var32++) {
            class34 var33;
            if (var32 == -1) {
                var33 = Statics.field920;
            } else if (var32 < field478) {
                var33 = field401[field247[var32]];
                if (field242 == field247[var32]) {
                    var30 = true;
                    var31 = var32;
                    continue;
                }
            } else {
                var33 = field277[field279[var32 - field478]];
            }
            method499(var33, var32, arg0, arg1, arg2, arg3);
        }
        if (var30) {
            method499(field401[field242], var31, arg0, arg1, arg2, arg3);
        }
        for (int var34 = 0; var34 < field333; var34++) {
            int var35 = field437[var34];
            int var36 = field416[var34];
            int var37 = field338[var34];
            int var38 = field337[var34];
            boolean var39 = true;
            while (var39) {
                var39 = false;
                for (int var40 = 0; var40 < var34; var40++) {
                    if (var36 + 2 > field416[var40] - field337[var40] && var36 - var38 < field416[var40] + 2 && var35 - var37 < field437[var40] + field338[var40] && var35 + var37 > field437[var40] - field338[var40] && field416[var40] - field337[var40] < var36) {
                        var36 = field416[var40] - field337[var40];
                        var39 = true;
                    }
                }
            }
            field345 = field437[var34];
            field346 = field416[var34] = var36;
            String var41 = field251[var34];
            if (field404 == 0) {
                int var42 = 16776960;
                if (field339[var34] < 6) {
                    var42 = field471[field339[var34]];
                }
                if (field339[var34] == 6) {
                    var42 = field344 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field339[var34] == 7) {
                    var42 = field344 % 20 < 10 ? 255 : 65535;
                }
                if (field339[var34] == 8) {
                    var42 = field344 % 20 < 10 ? 45056 : 8454016;
                }
                if (field339[var34] == 9) {
                    int var43 = 150 - field341[var34];
                    if (var43 < 50) {
                        var42 = var43 * 1280 + 16711680;
                    } else if (var43 < 100) {
                        var42 = 16776960 - (var43 - 50) * 327680;
                    } else if (var43 < 150) {
                        var42 = (var43 - 100) * 5 + 65280;
                    }
                }
                if (field339[var34] == 10) {
                    int var44 = 150 - field341[var34];
                    if (var44 < 50) {
                        var42 = var44 * 5 + 16711680;
                    } else if (var44 < 100) {
                        var42 = 16711935 - (var44 - 50) * 327680;
                    } else if (var44 < 150) {
                        var42 = (var44 - 100) * 327680 + 255 - (var44 - 100) * 5;
                    }
                }
                if (field339[var34] == 11) {
                    int var45 = 150 - field341[var34];
                    if (var45 < 50) {
                        var42 = 16777215 - var45 * 327685;
                    } else if (var45 < 100) {
                        var42 = (var45 - 50) * 327685 + 65280;
                    } else if (var45 < 150) {
                        var42 = 16777215 - (var45 - 100) * 327680;
                    }
                }
                if (field340[var34] == 0) {
                    Statics.field1918.method3502(var41, field345 + arg0, field346 + arg1, var42, 0);
                }
                if (field340[var34] == 1) {
                    Statics.field1918.method3504(var41, field345 + arg0, field346 + arg1, var42, 0, field344);
                }
                if (field340[var34] == 2) {
                    Statics.field1918.method3505(var41, field345 + arg0, field346 + arg1, var42, 0, field344);
                }
                if (field340[var34] == 3) {
                    Statics.field1918.method3537(var41, field345 + arg0, field346 + arg1, var42, 0, field344, 150 - field341[var34]);
                }
                if (field340[var34] == 4) {
                    int var46 = (150 - field341[var34]) * (Statics.field1918.method3559(var41) + 100) / 150;
                    class74.method1508(field345 + arg0 - 50, arg1, field345 + arg0 + 50, arg1 + arg3);
                    Statics.field1918.method3500(var41, field345 + arg0 + 50 - var46, field346 + arg1, var42, 0);
                    class74.method1507(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field340[var34] == 5) {
                    int var47 = 150 - field341[var34];
                    int var48 = 0;
                    if (var47 < 25) {
                        var48 = var47 - 25;
                    } else if (var47 > 125) {
                        var48 = var47 - 125;
                    }
                    class74.method1508(arg0, field346 + arg1 - Statics.field1918.field2975 - 1, arg0 + arg2, field346 + arg1 + 5);
                    Statics.field1918.method3502(var41, field345 + arg0, field346 + arg1 + var48, var42, 0);
                    class74.method1507(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1918.method3502(var41, field345 + arg0, field346 + arg1, 16776960, 0);
            }
        }
        if (field257 == 2) {
            method536((field260 - Statics.field842 << 7) + field263, (field261 - Statics.field176 << 7) + field397, field262 * 2);
            if (field345 > -1 && field249 % 20 < 10) {
                Statics.field166[0].method1484(field345 + arg0 - 12, field346 + arg1 - 28);
            }
        }
        ((class89) Statics.field1480).method1852(field316);
        if (field350 == 1) {
            Statics.field526[field423 / 100].method1484(field246 - 8, field320 - 8);
        }
        if (field350 == 2) {
            Statics.field526[field423 / 100 + 4].method1484(field246 - 8, field320 - 8);
        }
        method643();
        if (field255) {
            int var49 = arg0 + 512 - 5;
            int var50 = arg1 + 20;
            Statics.field1825.method3501("Fps:" + field2071, var49, var50, 16776960, -1);
            int var54 = var50 + 15;
            Runtime var51 = Runtime.getRuntime();
            int var52 = (int) ((var51.totalMemory() - var51.freeMemory()) / 1024L);
            int var53 = 16776960;
            if (var52 > 32768 && field245) {
                var53 = 16711680;
            }
            if (var52 > 65536 && !field245) {
                var53 = 16711680;
            }
            Statics.field1825.method3501("Mem:" + var52 + "k", var49, var54, var53, -1);
            var50 = var54 + 15;
        }
        Statics.field1250 = var21;
        Statics.field1984 = var22;
        Statics.field323 = var23;
        Statics.field535 = var24;
        Statics.field92 = var25;
        if (field497 && class155.method582(true, false) == 0) {
            field497 = false;
        }
        if (field497) {
            class74.method1512(arg0, arg1, arg2, arg3, 0);
            method1768(class147.field2184, false);
        }
    }

    @ObfuscatedName("s.at(Lai;B)V")
    public static final void method455(class30 arg0) {
        if (Statics.field920.field731 >> 7 == field362 && Statics.field920.field787 >> 7 == field462) {
            field362 = 0;
        }
        int var1 = field478;
        if (class30.field684 == arg0 || class30.field685 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field684 == arg0) {
                var3 = Statics.field920;
                var4 = 33538048;
            } else if (class30.field685 == arg0) {
                var3 = field401[field242];
                var4 = field242 << 14;
            } else {
                var3 = field401[field247[var2]];
                var4 = field247[var2] << 14;
                if (class30.field687 == arg0 && field242 == field247[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method16() && !var3.field54) {
                var3.field41 = false;
                if ((field245 && field478 > 50 || field478 > 200) && class30.field684 != arg0 && var3.field783 == var3.field754) {
                    var3.field41 = true;
                }
                int var5 = var3.field731 >> 7;
                int var6 = var3.field787 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field47 == null || field249 < var3.field39 || field249 >= var3.field42) {
                        if ((var3.field731 & 0x7F) == 64 && (var3.field787 & 0x7F) == 64) {
                            if (field344 == field363[var5][var6]) {
                                continue;
                            }
                            field363[var5][var6] = field344;
                        }
                        var3.field40 = method83(var3.field731, var3.field787, Statics.field788);
                        Statics.field1098.method1614(Statics.field788, var3.field731, var3.field787, var3.field40, 60, var3, var3.field761, var4, var3.field729);
                    } else {
                        var3.field41 = false;
                        var3.field40 = method83(var3.field731, var3.field787, Statics.field788);
                        Statics.field1098.method1615(Statics.field788, var3.field731, var3.field787, var3.field40, 60, var3, var3.field761, var4, var3.field48, var3.field52, var3.field50, var3.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.am(ZI)V")
    public static final void method29(boolean arg0) {
        for (int var1 = 0; var1 < field278; var1++) {
            class31 var2 = field277[field279[var1]];
            int var3 = (field279[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field696.field823 == arg0 && var2.field696.method623()) {
                int var4 = var2.field731 >> 7;
                int var5 = var2.field787 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field730 == 1 && (var2.field731 & 0x7F) == 64 && (var2.field787 & 0x7F) == 64) {
                        if (field344 == field363[var4][var5]) {
                            continue;
                        }
                        field363[var4][var5] = field344;
                    }
                    if (!var2.field696.field831) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1098.method1614(Statics.field788, var2.field731, var2.field787, method83(var2.field731 + (var2.field730 * 64 - 64), var2.field787 + (var2.field730 * 64 - 64), Statics.field788), var2.field730 * 64 - 64 + 60, var2, var2.field761, var3, var2.field729);
                }
            }
        }
    }

    @ObfuscatedName("t.aw(B)V")
    public static final void method120() {
        for (class7 var0 = (class7) field414.method3293(); var0 != null; var0 = (class7) field414.method3288()) {
            if (Statics.field788 != var0.field98 || field249 > var0.field104) {
                var0.method3392();
            } else if (field249 >= var0.field103) {
                if (var0.field115 > 0) {
                    class31 var1 = field277[var0.field115 - 1];
                    if (var1 != null && var1.field731 >= 0 && var1.field731 < 13312 && var1.field787 >= 0 && var1.field787 < 13312) {
                        var0.method71(var1.field731, var1.field787, method83(var1.field731, var1.field787, var0.field98) - var0.field109, field249);
                    }
                }
                if (var0.field115 < 0) {
                    int var2 = -var0.field115 - 1;
                    class3 var3;
                    if (field366 == var2) {
                        var3 = Statics.field920;
                    } else {
                        var3 = field401[var2];
                    }
                    if (var3 != null && var3.field731 >= 0 && var3.field731 < 13312 && var3.field787 >= 0 && var3.field787 < 13312) {
                        var0.method71(var3.field731, var3.field787, method83(var3.field731, var3.field787, var0.field98) - var0.field109, field249);
                    }
                }
                var0.method72(field316);
                Statics.field1098.method1614(Statics.field788, (int) var0.field110, (int) var0.field120, (int) var0.field111, 60, var0, var0.field117, -1, false);
            }
        }
    }

    @ObfuscatedName("k.as(I)V")
    public static final void method24() {
        for (class27 var0 = (class27) field378.method3293(); var0 != null; var0 = (class27) field378.method3288()) {
            if (Statics.field788 != var0.field621 || var0.field630) {
                var0.method3392();
            } else if (field249 >= var0.field620) {
                var0.method532(field316);
                if (var0.field630) {
                    var0.method3392();
                } else {
                    Statics.field1098.method1614(var0.field621, var0.field622, var0.field623, var0.field633, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("am.aq(B)I")
    public static final int method703() {
        if (Statics.field1422.field135) {
            return Statics.field788;
        } else {
            int var0 = method83(Statics.field1250, Statics.field323, Statics.field788);
            return var0 - Statics.field1984 >= 800 || (class6.field78[Statics.field788][Statics.field1250 >> 7][Statics.field323 >> 7] & 0x4) == 0 ? 3 : Statics.field788;
        }
    }

    @ObfuscatedName("c.ac(Lal;IIIIIB)V")
    public static final void method499(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method16()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field696;
            if (var6.field828 != null) {
                var6 = var6.method615();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field478) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field54) {
                return;
            }
            if (var8.field37 != -1 || var8.field38 != -1) {
                int var9 = arg0.field775 + 15;
                method536(arg0.field731, arg0.field787, var9);
                if (field345 > -1) {
                    if (var8.field37 != -1) {
                        Statics.field974[var8.field37].method1484(field345 + arg2 - 12, field346 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field196[var8.field38].method1484(field345 + arg2 - 12, field346 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field257 == 10 && field463 == field247[arg1]) {
                int var10 = arg0.field775 + 15;
                method536(arg0.field731, arg0.field787, var10);
                if (field345 > -1) {
                    Statics.field166[1].method1484(field345 + arg2 - 12, field346 + arg3 - var7);
                }
            }
        } else {
            class36 var11 = ((class31) arg0).field696;
            if (var11.field828 != null) {
                var11 = var11.method615();
            }
            if (var11.field826 >= 0 && var11.field826 < Statics.field196.length) {
                int var12 = arg0.field775 + 15;
                method536(arg0.field731, arg0.field787, var12);
                if (field345 > -1) {
                    Statics.field196[var11.field826].method1484(field345 + arg2 - 12, field346 + arg3 - 30);
                }
            }
            if (field257 == 1 && field431 == field279[arg1 - field478] && field249 % 20 < 10) {
                int var13 = arg0.field775 + 15;
                method536(arg0.field731, arg0.field787, var13);
                if (field345 > -1) {
                    Statics.field166[0].method1484(field345 + arg2 - 12, field346 + arg3 - 28);
                }
            }
        }
        if (arg0.field739 != null && (arg1 >= field478 || !arg0.field741 && (field457 == 4 || !arg0.field738 && (field457 == 0 || field457 == 3 || field457 == 1 && method65(((class3) arg0).field46, false))))) {
            int var14 = arg0.field775;
            method536(arg0.field731, arg0.field787, var14);
            if (field345 > -1 && field333 < field334) {
                field338[field333] = Statics.field1918.method3559(arg0.field739) / 2;
                field337[field333] = Statics.field1918.field2975;
                field437[field333] = field345;
                field416[field333] = field346;
                field339[field333] = arg0.field743;
                field340[field333] = arg0.field733;
                field341[field333] = arg0.field735;
                field251[field333] = arg0.field739;
                field333++;
            }
        }
        if (arg0.field748 > field249) {
            int var15 = arg0.field775 + 15;
            method536(arg0.field731, arg0.field787, var15);
            if (field345 > -1) {
                int var16;
                if (arg1 < field478) {
                    var16 = 30;
                } else {
                    class36 var17 = ((class31) arg0).field696;
                    var16 = var17.field810;
                }
                int var18 = arg0.field760 * var16 / arg0.field750;
                if (var18 > var16) {
                    var18 = var16;
                } else if (var18 == 0 && arg0.field760 > 0) {
                    var18 = 1;
                }
                class74.method1512(field345 + arg2 - var16 / 2, field346 + arg3 - 3, var18, 5, 65280);
                class74.method1512(field345 + arg2 - var16 / 2 + var18, field346 + arg3 - 3, var16 - var18, 5, 16711680);
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (arg0.field742[var19] > field249) {
                int var20 = arg0.field775 / 2;
                method536(arg0.field731, arg0.field787, var20);
                if (field345 > -1) {
                    if (var19 == 1) {
                        field346 -= 20;
                    }
                    if (var19 == 2) {
                        field345 -= 15;
                        field346 -= 10;
                    }
                    if (var19 == 3) {
                        field345 += 15;
                        field346 -= 10;
                    }
                    Statics.field1654[arg0.field746[var19]].method1484(field345 + arg2 - 12, field346 + arg3 - 12);
                    Statics.field2543.method3502(Integer.toString(arg0.field753[var19]), field345 + arg2 - 1, field346 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ak.aj(I)V")
    public static final void method643() {
        field488 = 0;
        int var0 = (Statics.field920.field731 >> 7) + Statics.field842;
        int var1 = (Statics.field920.field787 >> 7) + Statics.field176;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field488 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field488 = 1;
        }
        if (field488 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field488 = 0;
        }
    }

    @ObfuscatedName("ao.av(IIIB)V")
    public static final void method536(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field345 = -1;
            field346 = -1;
            return;
        }
        int var3 = method83(arg0, arg1, Statics.field788) - arg2;
        int var4 = arg0 - Statics.field1250;
        int var5 = var3 - Statics.field1984;
        int var6 = arg1 - Statics.field323;
        int var7 = class85.field1483[Statics.field535];
        int var8 = class85.field1469[Statics.field535];
        int var9 = class85.field1483[Statics.field92];
        int var10 = class85.field1469[Statics.field92];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field345 = (var11 << 9) / var15 + 256;
            field346 = (var14 << 9) / var15 + 167;
        } else {
            field345 = -1;
            field346 = -1;
        }
    }

    @ObfuscatedName("o.ax(IIIB)I")
    public static final int method83(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field84[var5][var3][var4] + class6.field84[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field84[var5][var3][var4 + 1] + class6.field84[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("t.ap(IIIIIIB)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1483[var6];
            int var12 = class85.field1469[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1483[var7];
            int var15 = class85.field1469[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1250 = arg0 - var8;
        Statics.field1984 = arg1 - var9;
        Statics.field323 = arg2 - var10;
        Statics.field535 = arg3;
        Statics.field92 = arg4;
    }

    @ObfuscatedName("el.af(ZB)V")
    public static final void method2749(boolean arg0) {
        field300 = arg0;
        if (!field300) {
            int var1 = field283.method2292();
            int var2 = field283.method2176();
            int var3 = field283.method2174();
            int var4 = (field284 - field283.field1855) / 16;
            Statics.field2439 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2439[var5][var6] = field283.method2183();
                }
            }
            int var7 = field283.method2181();
            int var8 = field283.method2174();
            Statics.field233 = new int[var4];
            Statics.field529 = new int[var4];
            Statics.field3034 = new int[var4];
            Statics.field190 = new byte[var4][];
            Statics.field1434 = new byte[var4][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field233[var10] = var13;
                        Statics.field529[var10] = Statics.field598.method2778("m" + var11 + "_" + var12);
                        Statics.field3034[var10] = Statics.field598.method2778("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1969(var3, var1, var7, var2, var8);
            return;
        }
        int var14 = field283.method2181();
        int var15 = field283.method2174();
        field283.method2368();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field283.method2375(1);
                    if (var19 == 1) {
                        field301[var16][var17][var18] = field283.method2375(26);
                    } else {
                        field301[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field283.method2369();
        int var20 = (field284 - field283.field1855) / 16;
        Statics.field2439 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field2439[var21][var22] = field283.method2184();
            }
        }
        int var23 = field283.method2292();
        int var24 = field283.method2176();
        int var25 = field283.method2174();
        Statics.field233 = new int[var20];
        Statics.field529 = new int[var20];
        Statics.field3034 = new int[var20];
        Statics.field190 = new byte[var20][];
        Statics.field1434 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field301[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field233[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field233[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field529[var26] = Statics.field598.method2778("m" + var35 + "_" + var36);
                            Statics.field3034[var26] = Statics.field598.method2778("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1969(var24, var15, var14, var23, var25);
    }

    @ObfuscatedName("cu.az(IIIIII)V")
    public static final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1882 == arg0 && Statics.field1871 == arg1 && field296 == arg2 || !field245) {
            return;
        }
        Statics.field1882 = arg0;
        Statics.field1871 = arg1;
        field296 = arg2;
        if (!field245) {
            field296 = 0;
        }
        method2950(25);
        method1768(class147.field2184, true);
        int var5 = Statics.field842;
        int var6 = Statics.field176;
        Statics.field842 = (arg0 - 6) * 8;
        Statics.field176 = (arg1 - 6) * 8;
        int var7 = Statics.field842 - var5;
        int var8 = Statics.field176 - var6;
        int var9 = Statics.field842;
        int var10 = Statics.field176;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field277[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field780[var13] -= var7;
                    var12.field752[var13] -= var8;
                }
                var12.field731 -= var7 * 128;
                var12.field787 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field401[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field780[var16] -= var7;
                    var15.field752[var16] -= var8;
                }
                var15.field731 -= var7 * 128;
                var15.field787 -= var8 * 128;
            }
        }
        Statics.field788 = arg2;
        Statics.field920.method591(arg3, arg4, false);
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
                        field375[var27][var23][var24] = field375[var27][var25][var26];
                    } else {
                        field375[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field376.method3293(); var28 != null; var28 = (class15) field376.method3288()) {
            var28.field200 -= var7;
            var28.field206 -= var8;
            if (var28.field200 < 0 || var28.field206 < 0 || var28.field200 >= 104 || var28.field206 >= 104) {
                var28.method3392();
            }
        }
        if (field362 != 0) {
            field362 -= var7;
            field462 -= var8;
        }
        field482 = 0;
        field382 = false;
        field477 = -1;
        field378.method3287();
        field414.method3287();
    }

    @ObfuscatedName("e.ay(ZB)V")
    public static final void method11(boolean arg0) {
        method2364();
        field287++;
        if (field287 < 50 && !arg0) {
            return;
        }
        field287 = 0;
        if (field360 || Statics.field607 == null) {
            return;
        }
        field281.method2381(149);
        try {
            Statics.field607.method2613(field281.field1862, 0, field281.field1855);
            field281.field1855 = 0;
        } catch (IOException var2) {
            field360 = true;
        }
    }

    @ObfuscatedName("v.au(B)V")
    public static final void method150() {
        method11(false);
        field294 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field190.length; var1++) {
            if (Statics.field529[var1] != -1 && Statics.field190[var1] == null) {
                Statics.field190[var1] = Statics.field598.method2761(Statics.field529[var1], 0);
                if (Statics.field190[var1] == null) {
                    var0 = false;
                    field294++;
                }
            }
            if (Statics.field3034[var1] != -1 && Statics.field1434[var1] == null) {
                Statics.field1434[var1] = Statics.field598.method2765(Statics.field3034[var1], 0, Statics.field2439[var1]);
                if (Statics.field1434[var1] == null) {
                    var0 = false;
                    field294++;
                }
            }
        }
        if (!var0) {
            field438 = 1;
            return;
        }
        field413 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field190.length; var3++) {
            byte[] var4 = Statics.field1434[var3];
            if (var4 != null) {
                int var5 = (Statics.field233[var3] >> 8) * 64 - Statics.field842;
                int var6 = (Statics.field233[var3] & 0xFF) * 64 - Statics.field176;
                if (field300) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method1861(var4, var5, var6);
            }
        }
        if (!var2) {
            field438 = 2;
            return;
        }
        if (field438 != 0) {
            method1768(class147.field2184 + class2.field26 + class2.field23 + 100 + "%" + class2.field24, true);
        }
        method2364();
        Statics.method4();
        method2364();
        Statics.field1098.method1603();
        method2364();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field456[var7].method3638();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field78[var8][var9][var10] = 0;
                }
            }
        }
        method2364();
        class6.field79 = 99;
        Statics.field80 = new byte[4][104][104];
        Statics.field91 = new byte[4][104][104];
        Statics.field2096 = new byte[4][104][104];
        Statics.field184 = new byte[4][104][104];
        Statics.field2966 = new int[4][105][105];
        Statics.field1943 = new byte[4][105][105];
        Statics.field2915 = new int[105][105];
        Statics.field1458 = new int[104];
        Statics.field2016 = new int[104];
        Statics.field31 = new int[104];
        Statics.field1271 = new int[104];
        Statics.field997 = new int[104];
        int var11 = Statics.field190.length;
        class21.method2078();
        method11(true);
        if (!field300) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field233[var12] >> 8) * 64 - Statics.field842;
                int var14 = (Statics.field233[var12] & 0xFF) * 64 - Statics.field176;
                byte[] var15 = Statics.field190[var12];
                if (var15 != null) {
                    method2364();
                    int var16 = Statics.field1882 * 8 - 48;
                    int var17 = Statics.field1871 * 8 - 48;
                    class211[] var18 = field456;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field3016[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class110 var22 = new class110(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class6.method2428(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field233[var26] >> 8) * 64 - Statics.field842;
                int var28 = (Statics.field233[var26] & 0xFF) * 64 - Statics.field176;
                byte[] var29 = Statics.field190[var26];
                if (var29 == null && Statics.field1871 < 800) {
                    method2364();
                    class6.method2441(var27, var28, 64, 64);
                }
            }
            method11(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field1434[var30];
                if (var31 != null) {
                    int var32 = (Statics.field233[var30] >> 8) * 64 - Statics.field842;
                    int var33 = (Statics.field233[var30] & 0xFF) * 64 - Statics.field176;
                    method2364();
                    class6.method2396(var31, var32, var33, Statics.field1098, field456);
                }
            }
        }
        if (field300) {
            for (int var34 = 0; var34 < 4; var34++) {
                method2364();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field301[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field233.length; var44++) {
                                if (Statics.field233[var44] == var43 && Statics.field190[var44] != null) {
                                    byte[] var45 = Statics.field190[var44];
                                    int var46 = var35 * 8;
                                    int var47 = var36 * 8;
                                    int var48 = (var41 & 0x7) * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    class211[] var50 = field456;
                                    for (int var51 = 0; var51 < 8; var51++) {
                                        for (int var52 = 0; var52 < 8; var52++) {
                                            if (var46 + var51 > 0 && var46 + var51 < 103 && var47 + var52 > 0 && var47 + var52 < 103) {
                                                var50[var34].field3016[var46 + var51][var47 + var52] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class110 var53 = new class110(var45);
                                    for (int var54 = 0; var54 < 4; var54++) {
                                        for (int var55 = 0; var55 < 64; var55++) {
                                            for (int var56 = 0; var56 < 64; var56++) {
                                                if (var39 == var54 && var55 >= var48 && var55 < var48 + 8 && var56 >= var49 && var56 < var49 + 8) {
                                                    int var59 = var46 + class160.method479(var55 & 0x7, var56 & 0x7, var40);
                                                    int var61 = var55 & 0x7;
                                                    int var62 = var56 & 0x7;
                                                    int var64 = var40 & 0x3;
                                                    int var65;
                                                    if (var64 == 0) {
                                                        var65 = var62;
                                                    } else if (var64 == 1) {
                                                        var65 = 7 - var61;
                                                    } else if (var64 == 2) {
                                                        var65 = 7 - var62;
                                                    } else {
                                                        var65 = var61;
                                                    }
                                                    class6.method2428(var53, var34, var59, var47 + var65, 0, 0, var40);
                                                } else {
                                                    class6.method2428(var53, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            int var66 = var34;
                            int var67 = var35 * 8;
                            int var68 = var36 * 8;
                            for (int var69 = 0; var69 < 8; var69++) {
                                for (int var70 = 0; var70 < 8; var70++) {
                                    class6.field84[var66][var67 + var69][var68 + var70] = 0;
                                }
                            }
                            if (var67 > 0) {
                                for (int var71 = 1; var71 < 8; var71++) {
                                    class6.field84[var66][var67][var68 + var71] = class6.field84[var66][var67 - 1][var68 + var71];
                                }
                            }
                            if (var68 > 0) {
                                for (int var72 = 1; var72 < 8; var72++) {
                                    class6.field84[var66][var67 + var72][var68] = class6.field84[var66][var67 + var72][var68 - 1];
                                }
                            }
                            if (var67 > 0 && class6.field84[var66][var67 - 1][var68] != 0) {
                                class6.field84[var66][var67][var68] = class6.field84[var66][var67 - 1][var68];
                            } else if (var68 > 0 && class6.field84[var66][var67][var68 - 1] != 0) {
                                class6.field84[var66][var67][var68] = class6.field84[var66][var67][var68 - 1];
                            } else if (var67 > 0 && var68 > 0 && class6.field84[var66][var67 - 1][var68 - 1] != 0) {
                                class6.field84[var66][var67][var68] = class6.field84[var66][var67 - 1][var68 - 1];
                            }
                        }
                    }
                }
            }
            for (int var73 = 0; var73 < 13; var73++) {
                for (int var74 = 0; var74 < 13; var74++) {
                    int var75 = field301[0][var73][var74];
                    if (var75 == -1) {
                        class6.method2441(var73 * 8, var74 * 8, 8, 8);
                    }
                }
            }
            method11(true);
            for (int var76 = 0; var76 < 4; var76++) {
                method2364();
                for (int var77 = 0; var77 < 13; var77++) {
                    label983: for (int var78 = 0; var78 < 13; var78++) {
                        int var79 = field301[var76][var77][var78];
                        if (var79 != -1) {
                            int var80 = var79 >> 24 & 0x3;
                            int var81 = var79 >> 1 & 0x3;
                            int var82 = var79 >> 14 & 0x3FF;
                            int var83 = var79 >> 3 & 0x7FF;
                            int var84 = (var82 / 8 << 8) + var83 / 8;
                            for (int var85 = 0; var85 < Statics.field233.length; var85++) {
                                if (Statics.field233[var85] == var84 && Statics.field1434[var85] != null) {
                                    byte[] var86 = Statics.field1434[var85];
                                    int var87 = var77 * 8;
                                    int var88 = var78 * 8;
                                    int var89 = (var82 & 0x7) * 8;
                                    int var90 = (var83 & 0x7) * 8;
                                    class80 var91 = Statics.field1098;
                                    class211[] var92 = field456;
                                    class110 var93 = new class110(var86);
                                    int var94 = -1;
                                    while (true) {
                                        int var95 = var93.method2155();
                                        if (var95 == 0) {
                                            continue label983;
                                        }
                                        var94 += var95;
                                        int var96 = 0;
                                        while (true) {
                                            int var97 = var93.method2155();
                                            if (var97 == 0) {
                                                break;
                                            }
                                            var96 += var97 - 1;
                                            int var98 = var96 & 0x3F;
                                            int var99 = var96 >> 6 & 0x3F;
                                            int var100 = var96 >> 12;
                                            int var101 = var93.method2142();
                                            int var102 = var101 >> 2;
                                            int var103 = var101 & 0x3;
                                            if (var80 == var100 && var99 >= var89 && var99 < var89 + 8 && var98 >= var90 && var98 < var90 + 8) {
                                                class37 var104 = class37.method2940(var94);
                                                int var106 = var99 & 0x7;
                                                int var107 = var98 & 0x7;
                                                int var109 = var104.field855;
                                                int var110 = var104.field856;
                                                if ((var103 & 0x1) == 1) {
                                                    int var111 = var109;
                                                    var109 = var110;
                                                    var110 = var111;
                                                }
                                                int var112 = var81 & 0x3;
                                                int var113;
                                                if (var112 == 0) {
                                                    var113 = var106;
                                                } else if (var112 == 1) {
                                                    var113 = var107;
                                                } else if (var112 == 2) {
                                                    var113 = 7 - var106 - (var109 - 1);
                                                } else {
                                                    var113 = 7 - var107 - (var110 - 1);
                                                }
                                                int var114 = var87 + var113;
                                                int var116 = var99 & 0x7;
                                                int var117 = var98 & 0x7;
                                                int var119 = var104.field855;
                                                int var120 = var104.field856;
                                                if ((var103 & 0x1) == 1) {
                                                    int var121 = var119;
                                                    var119 = var120;
                                                    var120 = var121;
                                                }
                                                int var122 = var81 & 0x3;
                                                int var123;
                                                if (var122 == 0) {
                                                    var123 = var117;
                                                } else if (var122 == 1) {
                                                    var123 = 7 - var116 - (var119 - 1);
                                                } else if (var122 == 2) {
                                                    var123 = 7 - var117 - (var120 - 1);
                                                } else {
                                                    var123 = var116;
                                                }
                                                int var124 = var88 + var123;
                                                if (var114 > 0 && var124 > 0 && var114 < 103 && var124 < 103) {
                                                    int var125 = var76;
                                                    if ((class6.field78[1][var114][var124] & 0x2) == 2) {
                                                        var125 = var76 - 1;
                                                    }
                                                    class211 var126 = null;
                                                    if (var125 >= 0) {
                                                        var126 = var92[var125];
                                                    }
                                                    class6.method606(var76, var114, var124, var94, var81 + var103 & 0x3, var102, var91, var126);
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
        method11(true);
        Statics.method4();
        method2364();
        class80 var127 = Statics.field1098;
        class211[] var128 = field456;
        for (int var129 = 0; var129 < 4; var129++) {
            for (int var130 = 0; var130 < 104; var130++) {
                for (int var131 = 0; var131 < 104; var131++) {
                    if ((class6.field78[var129][var130][var131] & 0x1) == 1) {
                        int var132 = var129;
                        if ((class6.field78[1][var130][var131] & 0x2) == 2) {
                            var132 = var129 - 1;
                        }
                        if (var132 >= 0) {
                            var128[var132].method3621(var130, var131);
                        }
                    }
                }
            }
        }
        class6.field90 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field90 < -8) {
            class6.field90 = -8;
        }
        if (class6.field90 > 8) {
            class6.field90 = 8;
        }
        class6.field89 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field89 < -16) {
            class6.field89 = -16;
        }
        if (class6.field89 > 16) {
            class6.field89 = 16;
        }
        for (int var133 = 0; var133 < 4; var133++) {
            byte[][] var134 = Statics.field1943[var133];
            int var135 = (int) Math.sqrt(5100.0D);
            int var136 = var135 * 768 >> 8;
            for (int var137 = 1; var137 < 103; var137++) {
                for (int var138 = 1; var138 < 103; var138++) {
                    int var139 = class6.field84[var133][var138 + 1][var137] - class6.field84[var133][var138 - 1][var137];
                    int var140 = class6.field84[var133][var138][var137 + 1] - class6.field84[var133][var138][var137 - 1];
                    int var141 = (int) Math.sqrt((double) (var140 * var140 + var139 * var139 + 65536));
                    int var142 = (var139 << 8) / var141;
                    int var143 = 65536 / var141;
                    int var144 = (var140 << 8) / var141;
                    int var145 = (var144 * -50 + var142 * -50 + var143 * -10) / var136 + 96;
                    int var146 = (var134[var138][var137] >> 1) + (var134[var138][var137 + 1] >> 3) + (var134[var138][var137 - 1] >> 2) + (var134[var138 - 1][var137] >> 2) + (var134[var138 + 1][var137] >> 3);
                    Statics.field2915[var138][var137] = var145 - var146;
                }
            }
            for (int var147 = 0; var147 < 104; var147++) {
                Statics.field1458[var147] = 0;
                Statics.field2016[var147] = 0;
                Statics.field31[var147] = 0;
                Statics.field1271[var147] = 0;
                Statics.field997[var147] = 0;
            }
            for (int var148 = -5; var148 < 109; var148++) {
                for (int var149 = 0; var149 < 104; var149++) {
                    int var150 = var148 + 5;
                    int var10002;
                    if (var150 >= 0 && var150 < 104) {
                        int var151 = Statics.field80[var133][var150][var149] & 0xFF;
                        if (var151 > 0) {
                            int var152 = var151 - 1;
                            class38 var153 = (class38) class38.field892.method3218((long) var152);
                            class38 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field897.method2761(1, var152);
                                class38 var156 = new class38();
                                if (var155 != null) {
                                    var156.method696(new class110(var155), var152);
                                }
                                var156.method708();
                                class38.field892.method3220(var156, (long) var152);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            Statics.field1458[var149] += var154.field894;
                            Statics.field2016[var149] += var154.field895;
                            Statics.field31[var149] += var154.field891;
                            Statics.field1271[var149] += var154.field899;
                            var10002 = Statics.field997[var149]++;
                        }
                    }
                    int var158 = var148 - 5;
                    if (var158 >= 0 && var158 < 104) {
                        int var159 = Statics.field80[var133][var158][var149] & 0xFF;
                        if (var159 > 0) {
                            int var160 = var159 - 1;
                            class38 var161 = (class38) class38.field892.method3218((long) var160);
                            class38 var162;
                            if (var161 == null) {
                                byte[] var163 = Statics.field897.method2761(1, var160);
                                class38 var164 = new class38();
                                if (var163 != null) {
                                    var164.method696(new class110(var163), var160);
                                }
                                var164.method708();
                                class38.field892.method3220(var164, (long) var160);
                                var162 = var164;
                            } else {
                                var162 = var161;
                            }
                            Statics.field1458[var149] -= var162.field894;
                            Statics.field2016[var149] -= var162.field895;
                            Statics.field31[var149] -= var162.field891;
                            Statics.field1271[var149] -= var162.field899;
                            var10002 = Statics.field997[var149]--;
                        }
                    }
                }
                if (var148 >= 1 && var148 < 103) {
                    int var166 = 0;
                    int var167 = 0;
                    int var168 = 0;
                    int var169 = 0;
                    int var170 = 0;
                    for (int var171 = -5; var171 < 109; var171++) {
                        int var172 = var171 + 5;
                        if (var172 >= 0 && var172 < 104) {
                            var166 += Statics.field1458[var172];
                            var167 += Statics.field2016[var172];
                            var168 += Statics.field31[var172];
                            var169 += Statics.field1271[var172];
                            var170 += Statics.field997[var172];
                        }
                        int var173 = var171 - 5;
                        if (var173 >= 0 && var173 < 104) {
                            var166 -= Statics.field1458[var173];
                            var167 -= Statics.field2016[var173];
                            var168 -= Statics.field31[var173];
                            var169 -= Statics.field1271[var173];
                            var170 -= Statics.field997[var173];
                        }
                        if (var171 >= 1 && var171 < 103) {
                            if (field245 && (class6.field78[0][var148][var171] & 0x2) == 0) {
                                if ((class6.field78[var133][var148][var171] & 0x10) != 0) {
                                    continue;
                                }
                                int var174;
                                if ((class6.field78[var133][var148][var171] & 0x8) != 0) {
                                    var174 = 0;
                                } else if (var133 <= 0 || (class6.field78[1][var148][var171] & 0x2) == 0) {
                                    var174 = var133;
                                } else {
                                    var174 = var133 - 1;
                                }
                                if (field296 != var174) {
                                    continue;
                                }
                            }
                            if (var133 < class6.field79) {
                                class6.field79 = var133;
                            }
                            int var175 = Statics.field80[var133][var148][var171] & 0xFF;
                            int var176 = Statics.field91[var133][var148][var171] & 0xFF;
                            if (var175 > 0 || var176 > 0) {
                                int var177 = class6.field84[var133][var148][var171];
                                int var178 = class6.field84[var133][var148 + 1][var171];
                                int var179 = class6.field84[var133][var148 + 1][var171 + 1];
                                int var180 = class6.field84[var133][var148][var171 + 1];
                                int var181 = Statics.field2915[var148][var171];
                                int var182 = Statics.field2915[var148 + 1][var171];
                                int var183 = Statics.field2915[var148 + 1][var171 + 1];
                                int var184 = Statics.field2915[var148][var171 + 1];
                                int var185 = -1;
                                int var186 = -1;
                                if (var175 > 0) {
                                    int var187 = var166 * 256 / var169;
                                    int var188 = var167 / var170;
                                    int var189 = var168 / var170;
                                    var185 = class6.method2728(var187, var188, var189);
                                    int var190 = class6.field90 + var187 & 0xFF;
                                    int var191 = class6.field89 + var189;
                                    if (var191 < 0) {
                                        var191 = 0;
                                    } else if (var191 > 255) {
                                        var191 = 255;
                                    }
                                    var186 = class6.method2728(var190, var188, var191);
                                }
                                if (var133 > 0) {
                                    boolean var192 = true;
                                    if (var175 == 0 && Statics.field2096[var133][var148][var171] != 0) {
                                        var192 = false;
                                    }
                                    if (var176 > 0 && !class42.method23(var176 - 1).field973) {
                                        var192 = false;
                                    }
                                    if (var192 && var177 == var178 && var177 == var179 && var177 == var180) {
                                        Statics.field2966[var133][var148][var171] |= 0x924;
                                    }
                                }
                                int var193 = 0;
                                if (var186 != -1) {
                                    var193 = class85.field1464[class6.method607(var186, 96)];
                                }
                                if (var176 == 0) {
                                    var127.method1620(var133, var148, var171, 0, 0, -1, var177, var178, var179, var180, class6.method607(var185, var181), class6.method607(var185, var182), class6.method607(var185, var183), class6.method607(var185, var184), 0, 0, 0, 0, var193, 0);
                                } else {
                                    int var194 = Statics.field2096[var133][var148][var171] + 1;
                                    byte var195 = Statics.field184[var133][var148][var171];
                                    class42 var196 = class42.method23(var176 - 1);
                                    int var197 = var196.field963;
                                    int var198;
                                    int var199;
                                    if (var197 >= 0) {
                                        var198 = Statics.field1480.method1836(var197);
                                        var199 = -1;
                                    } else if (var196.field962 == 16711935) {
                                        var199 = -2;
                                        var197 = -1;
                                        var198 = -2;
                                    } else {
                                        var199 = class6.method2728(var196.field966, var196.field967, var196.field968);
                                        int var200 = class6.field90 + var196.field966 & 0xFF;
                                        int var201 = class6.field89 + var196.field968;
                                        if (var201 < 0) {
                                            var201 = 0;
                                        } else if (var201 > 255) {
                                            var201 = 255;
                                        }
                                        var198 = class6.method2728(var200, var196.field967, var201);
                                    }
                                    int var202 = 0;
                                    if (var198 != -2) {
                                        var202 = class85.field1464[class6.method115(var198, 96)];
                                    }
                                    if (var196.field971 != -1) {
                                        int var203 = class6.field90 + var196.field961 & 0xFF;
                                        int var204 = class6.field89 + var196.field969;
                                        if (var204 < 0) {
                                            var204 = 0;
                                        } else if (var204 > 255) {
                                            var204 = 255;
                                        }
                                        int var205 = class6.method2728(var203, var196.field970, var204);
                                        var202 = class85.field1464[class6.method115(var205, 96)];
                                    }
                                    var127.method1620(var133, var148, var171, var194, var195, var197, var177, var178, var179, var180, class6.method607(var185, var181), class6.method607(var185, var182), class6.method607(var185, var183), class6.method607(var185, var184), class6.method115(var199, var181), class6.method115(var199, var182), class6.method115(var199, var183), class6.method115(var199, var184), var193, var202);
                                }
                            }
                        }
                    }
                }
            }
            for (int var206 = 1; var206 < 103; var206++) {
                for (int var207 = 1; var207 < 103; var207++) {
                    var127.method1675(var133, var207, var206, class6.method5(var133, var207, var206));
                }
            }
            Statics.field80[var133] = (byte[][]) null;
            Statics.field91[var133] = (byte[][]) null;
            Statics.field2096[var133] = (byte[][]) null;
            Statics.field184[var133] = (byte[][]) null;
            Statics.field1943[var133] = (byte[][]) null;
        }
        var127.method1634(-50, -10, -50);
        for (int var208 = 0; var208 < 104; var208++) {
            for (int var209 = 0; var209 < 104; var209++) {
                if ((class6.field78[1][var208][var209] & 0x2) == 2) {
                    var127.method1605(var208, var209);
                }
            }
        }
        int var210 = 1;
        int var211 = 2;
        int var212 = 4;
        for (int var213 = 0; var213 < 4; var213++) {
            if (var213 > 0) {
                var210 <<= 0x3;
                var211 <<= 0x3;
                var212 <<= 0x3;
            }
            for (int var214 = 0; var214 <= var213; var214++) {
                for (int var215 = 0; var215 <= 104; var215++) {
                    for (int var216 = 0; var216 <= 104; var216++) {
                        if ((Statics.field2966[var214][var216][var215] & var210) != 0) {
                            int var217 = var215;
                            int var218 = var215;
                            int var219 = var214;
                            int var220 = var214;
                            while (var217 > 0 && (Statics.field2966[var214][var216][var217 - 1] & var210) != 0) {
                                var217--;
                            }
                            while (var218 < 104 && (Statics.field2966[var214][var216][var218 + 1] & var210) != 0) {
                                var218++;
                            }
                            label709: while (var219 > 0) {
                                for (int var221 = var217; var221 <= var218; var221++) {
                                    if ((Statics.field2966[var219 - 1][var216][var221] & var210) == 0) {
                                        break label709;
                                    }
                                }
                                var219--;
                            }
                            label698: while (var220 < var213) {
                                for (int var222 = var217; var222 <= var218; var222++) {
                                    if ((Statics.field2966[var220 + 1][var216][var222] & var210) == 0) {
                                        break label698;
                                    }
                                }
                                var220++;
                            }
                            int var223 = (var220 + 1 - var219) * (var218 - var217 + 1);
                            if (var223 >= 8) {
                                short var224 = 240;
                                int var225 = class6.field84[var220][var216][var217] - var224;
                                int var226 = class6.field84[var219][var216][var217];
                                class80.method1606(var213, 1, var216 * 128, var216 * 128, var217 * 128, var218 * 128 + 128, var225, var226);
                                for (int var227 = var219; var227 <= var220; var227++) {
                                    for (int var228 = var217; var228 <= var218; var228++) {
                                        Statics.field2966[var227][var216][var228] &= ~var210;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2966[var214][var216][var215] & var211) != 0) {
                            int var229 = var216;
                            int var230 = var216;
                            int var231 = var214;
                            int var232 = var214;
                            while (var229 > 0 && (Statics.field2966[var214][var229 - 1][var215] & var211) != 0) {
                                var229--;
                            }
                            while (var230 < 104 && (Statics.field2966[var214][var230 + 1][var215] & var211) != 0) {
                                var230++;
                            }
                            label762: while (var231 > 0) {
                                for (int var233 = var229; var233 <= var230; var233++) {
                                    if ((Statics.field2966[var231 - 1][var233][var215] & var211) == 0) {
                                        break label762;
                                    }
                                }
                                var231--;
                            }
                            label751: while (var232 < var213) {
                                for (int var234 = var229; var234 <= var230; var234++) {
                                    if ((Statics.field2966[var232 + 1][var234][var215] & var211) == 0) {
                                        break label751;
                                    }
                                }
                                var232++;
                            }
                            int var235 = (var232 + 1 - var231) * (var230 - var229 + 1);
                            if (var235 >= 8) {
                                short var236 = 240;
                                int var237 = class6.field84[var232][var229][var215] - var236;
                                int var238 = class6.field84[var231][var229][var215];
                                class80.method1606(var213, 2, var229 * 128, var230 * 128 + 128, var215 * 128, var215 * 128, var237, var238);
                                for (int var239 = var231; var239 <= var232; var239++) {
                                    for (int var240 = var229; var240 <= var230; var240++) {
                                        Statics.field2966[var239][var240][var215] &= ~var211;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2966[var214][var216][var215] & var212) != 0) {
                            int var241 = var216;
                            int var242 = var216;
                            int var243 = var215;
                            int var244 = var215;
                            while (var243 > 0 && (Statics.field2966[var214][var216][var243 - 1] & var212) != 0) {
                                var243--;
                            }
                            while (var244 < 104 && (Statics.field2966[var214][var216][var244 + 1] & var212) != 0) {
                                var244++;
                            }
                            label815: while (var241 > 0) {
                                for (int var245 = var243; var245 <= var244; var245++) {
                                    if ((Statics.field2966[var214][var241 - 1][var245] & var212) == 0) {
                                        break label815;
                                    }
                                }
                                var241--;
                            }
                            label804: while (var242 < 104) {
                                for (int var246 = var243; var246 <= var244; var246++) {
                                    if ((Statics.field2966[var214][var242 + 1][var246] & var212) == 0) {
                                        break label804;
                                    }
                                }
                                var242++;
                            }
                            if ((var242 - var241 + 1) * (var244 - var243 + 1) >= 4) {
                                int var247 = class6.field84[var214][var241][var243];
                                class80.method1606(var213, 4, var241 * 128, var242 * 128 + 128, var243 * 128, var244 * 128 + 128, var247, var247);
                                for (int var248 = var241; var248 <= var242; var248++) {
                                    for (int var249 = var243; var249 <= var244; var249++) {
                                        Statics.field2966[var214][var248][var249] &= ~var212;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method11(true);
        int var250 = class6.field79;
        if (var250 > Statics.field788) {
            var250 = Statics.field788;
        }
        if (var250 < Statics.field788 - 1) {
            int var251 = Statics.field788 - 1;
        }
        if (field245) {
            Statics.field1098.method1637(class6.field79);
        } else {
            Statics.field1098.method1637(0);
        }
        for (int var252 = 0; var252 < 104; var252++) {
            for (int var253 = 0; var253 < 104; var253++) {
                method3704(var252, var253);
            }
        }
        method2364();
        method1601();
        class37.field843.method3231();
        if (Statics.field619 != null) {
            field281.method2381(237);
            field281.method2131(1057001181);
        }
        if (!field300) {
            int var254 = (Statics.field1882 - 6) / 8;
            int var255 = (Statics.field1882 + 6) / 8;
            int var256 = (Statics.field1871 - 6) / 8;
            int var257 = (Statics.field1871 + 6) / 8;
            for (int var258 = var254 - 1; var258 <= var255 + 1; var258++) {
                for (int var259 = var256 - 1; var259 <= var257 + 1; var259++) {
                    if (var258 < var254 || var258 > var255 || var259 < var256 || var259 > var257) {
                        Statics.field598.method2782("m" + var258 + "_" + var259);
                        Statics.field598.method2782("l" + var258 + "_" + var259);
                    }
                }
            }
        }
        method2950(30);
        method2364();
        Statics.field80 = (byte[][][]) null;
        Statics.field91 = (byte[][][]) null;
        Statics.field2096 = (byte[][][]) null;
        Statics.field184 = (byte[][][]) null;
        Statics.field2966 = (int[][][]) null;
        Statics.field1943 = (byte[][][]) null;
        Statics.field2915 = (int[][]) null;
        Statics.field1458 = null;
        Statics.field2016 = null;
        Statics.field31 = null;
        Statics.field1271 = null;
        Statics.field997 = null;
        field281.method2381(71);
        class135.method2868();
    }

    @ObfuscatedName("cd.ab(II)V")
    public static final void method1858(int arg0) {
        int[] var1 = Statics.field719.field1307;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field78[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1098.method1752(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1098.method1752(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field719.method1487();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field78[arg0][var10][var9] & 0x18) == 0) {
                    method2064(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field78[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2064(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field470 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1098.method1710(Statics.field788, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class37.method2940(var14).field844;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field456[Statics.field788].field3016;
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
                        field473[field470] = Statics.field1669[var15];
                        field308[field470] = var16;
                        field472[field470] = var17;
                        field470++;
                    }
                }
            }
        }
        Statics.field1952.method1401();
    }

    @ObfuscatedName("cx.ad(IIIIII)V")
    public static final void method2064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1098.method1629(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1098.method1633(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field719.field1307;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method2940(var12);
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
                class75 var14 = Statics.field70[var13.field869];
                if (var14 != null) {
                    int var15 = (var13.field855 * 4 - var14.field1324) / 2;
                    int var16 = (var13.field856 * 4 - var14.field1325) / 2;
                    var14.method1576(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field856) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1098.method1613(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1098.method1633(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method2940(var21);
            if (var22.field869 != -1) {
                class75 var23 = Statics.field70[var22.field869];
                if (var23 != null) {
                    int var24 = (var22.field855 * 4 - var23.field1324) / 2;
                    int var25 = (var22.field856 * 4 - var23.field1325) / 2;
                    var23.method1576(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field856) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field719.field1307;
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
        int var29 = Statics.field1098.method1710(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method2940(var30);
        if (var31.field869 == -1) {
            return;
        }
        class75 var32 = Statics.field70[var31.field869];
        if (var32 != null) {
            int var33 = (var31.field855 * 4 - var32.field1324) / 2;
            int var34 = (var31.field856 * 4 - var32.field1325) / 2;
            var32.method1576(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field856) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ei.bq(S)V")
    public static final void method2737() {
        if (field285 == 188) {
            int var0 = field283.method2207();
            int var1 = (var0 >> 4 & 0x7) + Statics.field303;
            int var2 = (var0 & 0x7) + Statics.field791;
            int var3 = field283.method2176();
            int var4 = field283.method2142();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field359[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
                if (var7 == 0) {
                    class81 var8 = Statics.field1098.method1638(Statics.field788, var1, var2);
                    if (var8 != null) {
                        int var9 = var8.field1426 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1424 = new class11(var9, 2, var6 + 4, Statics.field788, var1, var2, var3, false, var8.field1424);
                            var8.field1425 = new class11(var9, 2, var6 + 1 & 0x3, Statics.field788, var1, var2, var3, false, var8.field1425);
                        } else {
                            var8.field1424 = new class11(var9, var5, var6, Statics.field788, var1, var2, var3, false, var8.field1424);
                        }
                    }
                }
                if (var7 == 1) {
                    class88 var10 = Statics.field1098.method1626(Statics.field788, var1, var2);
                    if (var10 != null) {
                        int var11 = var10.field1503 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1507 = new class11(var11, 4, var6, Statics.field788, var1, var2, var3, false, var10.field1507);
                        } else if (var5 == 6) {
                            var10.field1507 = new class11(var11, 4, var6 + 4, Statics.field788, var1, var2, var3, false, var10.field1507);
                        } else if (var5 == 7) {
                            var10.field1507 = new class11(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field788, var1, var2, var3, false, var10.field1507);
                        } else if (var5 == 8) {
                            var10.field1507 = new class11(var11, 4, var6 + 4, Statics.field788, var1, var2, var3, false, var10.field1507);
                            var10.field1504 = new class11(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field788, var1, var2, var3, false, var10.field1504);
                        }
                    }
                }
                if (var7 == 2) {
                    class92 var12 = Statics.field1098.method1627(Statics.field788, var1, var2);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1561 = new class11(var12.field1569 >> 14 & 0x7FFF, var5, var6, Statics.field788, var1, var2, var3, false, var12.field1561);
                    }
                }
                if (var7 == 3) {
                    class87 var13 = Statics.field1098.method1739(Statics.field788, var1, var2);
                    if (var13 != null) {
                        var13.field1488 = new class11(var13.field1489 >> 14 & 0x7FFF, 22, var6, Statics.field788, var1, var2, var3, false, var13.field1488);
                    }
                }
            }
        } else if (field285 == 39) {
            int var14 = field283.method2175();
            int var15 = field283.method2181();
            int var16 = (var15 >> 4 & 0x7) + Statics.field303;
            int var17 = (var15 & 0x7) + Statics.field791;
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class182 var18 = field375[Statics.field788][var16][var17];
                if (var18 != null) {
                    for (class26 var19 = (class26) var18.method3293(); var19 != null; var19 = (class26) var18.method3288()) {
                        if ((var14 & 0x7FFF) == var19.field613) {
                            var19.method3392();
                            break;
                        }
                    }
                    if (var18.method3293() == null) {
                        field375[Statics.field788][var16][var17] = null;
                    }
                    method3704(var16, var17);
                }
            }
        } else if (field285 == 166) {
            int var20 = field283.method2142();
            int var21 = (var20 >> 4 & 0x7) + Statics.field303;
            int var22 = (var20 & 0x7) + Statics.field791;
            int var23 = field283.method2292();
            int var24 = field283.method2292();
            int var25 = field283.method2292();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class182 var26 = field375[Statics.field788][var21][var22];
                if (var26 != null) {
                    for (class26 var27 = (class26) var26.method3293(); var27 != null; var27 = (class26) var26.method3288()) {
                        if ((var23 & 0x7FFF) == var27.field613 && var27.field612 == var24) {
                            var27.field612 = var25;
                            break;
                        }
                    }
                    method3704(var21, var22);
                }
            }
        } else if (field285 == 135) {
            int var28 = field283.method2142();
            int var29 = (var28 >> 4 & 0x7) + Statics.field303;
            int var30 = (var28 & 0x7) + Statics.field791;
            int var31 = var29 + field283.method2294();
            int var32 = var30 + field283.method2294();
            int var33 = field283.method2256();
            int var34 = field283.method2292();
            int var35 = field283.method2142() * 4;
            int var36 = field283.method2142() * 4;
            int var37 = field283.method2292();
            int var38 = field283.method2292();
            int var39 = field283.method2142();
            int var40 = field283.method2142();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var34 != 65535) {
                int var41 = var29 * 128 + 64;
                int var42 = var30 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                class7 var45 = new class7(var34, Statics.field788, var41, var42, method83(var41, var42, Statics.field788) - var35, field249 + var37, field249 + var38, var39, var40, var33, var36);
                var45.method71(var43, var44, method83(var43, var44, Statics.field788) - var36, field249 + var37);
                field414.method3302(var45);
            }
        } else if (field285 == 235) {
            int var46 = field283.method2175();
            int var47 = field283.method2142();
            int var48 = (var47 >> 4 & 0x7) + Statics.field303;
            int var49 = (var47 & 0x7) + Statics.field791;
            int var50 = field283.method2174();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class26 var51 = new class26();
                var51.field613 = var46;
                var51.field612 = var50;
                if (field375[Statics.field788][var48][var49] == null) {
                    field375[Statics.field788][var48][var49] = new class182();
                }
                field375[Statics.field788][var48][var49].method3302(var51);
                method3704(var48, var49);
            }
        } else if (field285 == 247) {
            int var52 = field283.method2166();
            int var53 = (var52 >> 4 & 0x7) + Statics.field303;
            int var54 = (var52 & 0x7) + Statics.field791;
            int var55 = field283.method2207();
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = field359[var56];
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                method2084(Statics.field788, var53, var54, var58, -1, var56, var57, 0, -1);
            }
        } else {
            if (field285 == 93) {
                int var59 = field283.method2142();
                int var60 = (var59 >> 4 & 0x7) + Statics.field303;
                int var61 = (var59 & 0x7) + Statics.field791;
                int var62 = field283.method2292();
                int var63 = field283.method2142();
                int var64 = var63 >> 4 & 0xF;
                int var65 = var63 & 0x7;
                int var66 = field283.method2142();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var67 = var64 + 1;
                    if (Statics.field920.field780[0] >= var60 - var67 && Statics.field920.field780[0] <= var60 + var67 && Statics.field920.field752[0] >= var61 - var67 && Statics.field920.field752[0] <= var61 + var67 && field481 != 0 && var65 > 0 && field482 < 50) {
                        field256[field482] = var62;
                        field348[field482] = var65;
                        field485[field482] = var66;
                        field354[field482] = null;
                        field238[field482] = (var60 << 16) + (var61 << 8) + var64;
                        field482++;
                    }
                }
            }
            if (field285 == 132) {
                int var68 = field283.method2174();
                int var69 = field283.method2174();
                byte var70 = field283.method2170();
                int var71 = field283.method2176();
                int var72 = field283.method2142();
                int var73 = (var72 >> 4 & 0x7) + Statics.field303;
                int var74 = (var72 & 0x7) + Statics.field791;
                byte var75 = field283.method2294();
                byte var76 = field283.method2169();
                int var77 = field283.method2181();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field359[var78];
                int var81 = field283.method2174();
                byte var82 = field283.method2169();
                class3 var83;
                if (field366 == var71) {
                    var83 = Statics.field920;
                } else {
                    var83 = field401[var71];
                }
                if (var83 != null) {
                    class37 var84 = class37.method2940(var69);
                    int var85;
                    int var86;
                    if (var79 == 1 || var79 == 3) {
                        var85 = var84.field856;
                        var86 = var84.field855;
                    } else {
                        var85 = var84.field855;
                        var86 = var84.field856;
                    }
                    int var87 = (var85 >> 1) + var73;
                    int var88 = (var85 + 1 >> 1) + var73;
                    int var89 = (var86 >> 1) + var74;
                    int var90 = (var86 + 1 >> 1) + var74;
                    int[][] var91 = class6.field84[Statics.field788];
                    int var92 = var91[var87][var89] + var91[var88][var89] + var91[var87][var90] + var91[var88][var90] >> 2;
                    int var93 = (var73 << 7) + (var85 << 6);
                    int var94 = (var74 << 7) + (var86 << 6);
                    class99 var95 = var84.method654(var78, var79, var91, var93, var92, var94);
                    if (var95 != null) {
                        method2084(Statics.field788, var73, var74, var80, -1, 0, 0, var68 + 1, var81 + 1);
                        var83.field39 = field249 + var68;
                        var83.field42 = field249 + var81;
                        var83.field47 = var95;
                        var83.field43 = var73 * 128 + var85 * 64;
                        var83.field44 = var74 * 128 + var86 * 64;
                        var83.field45 = var92;
                        if (var70 > var76) {
                            byte var96 = var70;
                            var70 = var76;
                            var76 = var96;
                        }
                        if (var75 > var82) {
                            byte var97 = var75;
                            var75 = var82;
                            var82 = var97;
                        }
                        var83.field48 = var70 + var73;
                        var83.field50 = var73 + var76;
                        var83.field52 = var74 + var75;
                        var83.field51 = var74 + var82;
                    }
                }
            }
            if (field285 == 77) {
                int var98 = field283.method2176();
                int var99 = field283.method2207();
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = field359[var100];
                int var103 = field283.method2166();
                int var104 = (var103 >> 4 & 0x7) + Statics.field303;
                int var105 = (var103 & 0x7) + Statics.field791;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    method2084(Statics.field788, var104, var105, var102, var98, var100, var101, 0, -1);
                }
            } else if (field285 == 64) {
                int var106 = field283.method2142();
                int var107 = (var106 >> 4 & 0x7) + Statics.field303;
                int var108 = (var106 & 0x7) + Statics.field791;
                int var109 = field283.method2292();
                int var110 = field283.method2142();
                int var111 = field283.method2292();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class27 var114 = new class27(var109, Statics.field788, var112, var113, method83(var112, var113, Statics.field788) - var110, var111, field249);
                    field378.method3302(var114);
                }
            }
        }
    }

    @ObfuscatedName("dv.bc(IIIIIIIIII)V")
    public static final void method2084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field376.method3293(); var10 != null; var10 = (class15) field376.method3288()) {
            if (var10.field212 == arg0 && var10.field200 == arg1 && var10.field206 == arg2 && var10.field210 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field212 = arg0;
            var9.field210 = arg3;
            var9.field200 = arg1;
            var9.field206 = arg2;
            method1764(var9);
            field376.method3302(var9);
        }
        var9.field205 = arg4;
        var9.field207 = arg5;
        var9.field202 = arg6;
        var9.field199 = arg7;
        var9.field209 = arg8;
    }

    @ObfuscatedName("ci.bj(B)V")
    public static final void method1601() {
        for (class15 var0 = (class15) field376.method3293(); var0 != null; var0 = (class15) field376.method3288()) {
            if (var0.field209 == -1) {
                var0.field199 = 0;
                method1764(var0);
            } else {
                var0.method3392();
            }
        }
    }

    @ObfuscatedName("ck.bm(Lv;I)V")
    public static final void method1764(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field210 == 0) {
            var1 = Statics.field1098.method1629(arg0.field212, arg0.field200, arg0.field206);
        }
        if (arg0.field210 == 1) {
            var1 = Statics.field1098.method1666(arg0.field212, arg0.field200, arg0.field206);
        }
        if (arg0.field210 == 2) {
            var1 = Statics.field1098.method1613(arg0.field212, arg0.field200, arg0.field206);
        }
        if (arg0.field210 == 3) {
            var1 = Statics.field1098.method1710(arg0.field212, arg0.field200, arg0.field206);
        }
        if (var1 != 0) {
            int var5 = Statics.field1098.method1633(arg0.field212, arg0.field200, arg0.field206, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field208 = var2;
        arg0.field204 = var3;
        arg0.field203 = var4;
    }

    @ObfuscatedName("eq.bx(IIIIIIII)V")
    public static final void method2661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field245 && Statics.field788 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1098.method1629(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1098.method1666(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1098.method1613(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1098.method1710(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1098.method1633(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1098.method1760(arg0, arg2, arg3);
                class37 var15 = class37.method2940(var12);
                if (var15.field857 != 0) {
                    field456[arg0].method3624(arg2, arg3, var13, var14, var15.field858);
                }
            }
            if (arg1 == 1) {
                Statics.field1098.method1602(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1098.method1622(arg0, arg2, arg3);
                class37 var16 = class37.method2940(var12);
                if (var16.field855 + arg2 > 103 || var16.field855 + arg3 > 103 || var16.field856 + arg2 > 103 || var16.field856 + arg3 > 103) {
                    return;
                }
                if (var16.field857 != 0) {
                    field456[arg0].method3625(arg2, arg3, var16.field855, var16.field856, var14, var16.field858);
                }
            }
            if (arg1 == 3) {
                Statics.field1098.method1628(arg0, arg2, arg3);
                class37 var17 = class37.method2940(var12);
                if (var17.field857 == 1) {
                    field456[arg0].method3617(arg2, arg3);
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
        class6.method516(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1098, field456[arg0]);
    }

    @ObfuscatedName("hh.bi(III)V")
    public static final void method3704(int arg0, int arg1) {
        class182 var2 = field375[Statics.field788][arg0][arg1];
        if (var2 == null) {
            Statics.field1098.method1625(Statics.field788, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3293(); var6 != null; var6 = (class26) var2.method3288()) {
            class46 var7 = class46.method2398(var6.field613);
            long var8 = (long) var7.field1034;
            if (var7.field1022 == 1) {
                var8 = (long) (var6.field612 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1098.method1625(Statics.field788, arg0, arg1);
            return;
        }
        var2.method3289(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3293(); var12 != null; var12 = (class26) var2.method3288()) {
            if (var5.field613 != var12.field613) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field613 != var12.field613 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1098.method1610(Statics.field788, arg0, arg1, method83(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field788), var5, var13, var10, var11);
    }

    @ObfuscatedName("client.ba(ZI)V")
    public static final void method439(boolean arg0) {
        field368 = 0;
        field394 = 0;
        method84();
        method2447(arg0);
        method2();
        for (int var1 = 0; var1 < field368; var1++) {
            int var2 = field369[var1];
            if (field249 != field277[var2].field774) {
                field277[var2].field696 = null;
                field277[var2] = null;
            }
        }
        if (field284 != field283.field1855) {
            throw new RuntimeException(field283.field1855 + class2.field21 + field284);
        }
        for (int var3 = 0; var3 < field278; var3++) {
            if (field277[field279[var3]] == null) {
                throw new RuntimeException(var3 + class2.field21 + field278);
            }
        }
    }

    @ObfuscatedName("o.be(B)V")
    public static final void method84() {
        field283.method2368();
        int var0 = field283.method2375(8);
        if (var0 < field278) {
            for (int var1 = var0; var1 < field278; var1++) {
                field369[++field368 - 1] = field279[var1];
            }
        }
        if (var0 > field278) {
            throw new RuntimeException("");
        }
        field278 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field279[var2];
            class31 var4 = field277[var3];
            int var5 = field283.method2375(1);
            if (var5 == 0) {
                field279[++field278 - 1] = var3;
                var4.field774 = field249;
            } else {
                int var6 = field283.method2375(2);
                if (var6 == 0) {
                    field279[++field278 - 1] = var3;
                    var4.field774 = field249;
                    field364[++field394 - 1] = var3;
                } else if (var6 == 1) {
                    field279[++field278 - 1] = var3;
                    var4.field774 = field249;
                    int var7 = field283.method2375(3);
                    var4.method600(var7, false);
                    int var8 = field283.method2375(1);
                    if (var8 == 1) {
                        field364[++field394 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field279[++field278 - 1] = var3;
                    var4.field774 = field249;
                    int var9 = field283.method2375(3);
                    var4.method600(var9, true);
                    int var10 = field283.method2375(3);
                    var4.method600(var10, true);
                    int var11 = field283.method2375(1);
                    if (var11 == 1) {
                        field364[++field394 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field369[++field368 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("du.bt(ZB)V")
    public static final void method2447(boolean arg0) {
        while (true) {
            if (field283.method2373(field284) >= 27) {
                int var1 = field283.method2375(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field277[var1] == null) {
                        field277[var1] = new class31();
                        var2 = true;
                    }
                    class31 var3 = field277[var1];
                    field279[++field278 - 1] = var1;
                    var3.field774 = field249;
                    int var4 = field283.method2375(1);
                    if (var4 == 1) {
                        field364[++field394 - 1] = var1;
                    }
                    var3.field696 = class36.method2556(field283.method2375(14));
                    int var5;
                    if (arg0) {
                        var5 = field283.method2375(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field283.method2375(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field283.method2375(1);
                    int var7 = field374[field283.method2375(3)];
                    if (var2) {
                        var3.field776 = var3.field761 = var7;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field283.method2375(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field283.method2375(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field730 = var3.field696.field804;
                    var3.field778 = var3.field696.field827;
                    if (var3.field778 == 0) {
                        var3.field761 = 0;
                    }
                    var3.field734 = var3.field696.field825;
                    var3.field728 = var3.field696.field811;
                    var3.field781 = var3.field696.field812;
                    var3.field737 = var3.field696.field834;
                    var3.field783 = var3.field696.field829;
                    var3.field732 = var3.field696.field832;
                    var3.field764 = var3.field696.field809;
                    var3.method591(Statics.field920.field780[0] + var8, Statics.field920.field752[0] + var5, var6 == 1);
                    continue;
                }
            }
            field283.method2369();
            return;
        }
    }

    @ObfuscatedName("b.bo(I)V")
    public static final void method2() {
        for (int var0 = 0; var0 < field394; var0++) {
            int var1 = field364[var0];
            class31 var2 = field277[var1];
            int var3 = field283.method2142();
            if ((var3 & 0x40) != 0) {
                var2.field745 = field283.method2176();
                var2.field757 = field283.method2175();
            }
            if ((var3 & 0x1) != 0) {
                var2.field751 = field283.method2174();
                if (var2.field751 == 65535) {
                    var2.field751 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field762 = field283.method2174();
                int var4 = field283.method2184();
                var2.field736 = var4 >> 16;
                var2.field765 = (var4 & 0xFFFF) + field249;
                var2.field763 = 0;
                var2.field749 = 0;
                if (var2.field765 > field249) {
                    var2.field763 = -1;
                }
                if (var2.field762 == 65535) {
                    var2.field762 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var5 = field283.method2175();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field283.method2181();
                if (var2.field747 == var5 && var5 != -1) {
                    int var7 = class39.method1863(var5).field917;
                    if (var7 == 1) {
                        var2.field758 = 0;
                        var2.field759 = 0;
                        var2.field756 = var6;
                        var2.field755 = 0;
                    }
                    if (var7 == 2) {
                        var2.field755 = 0;
                    }
                } else if (var5 == -1 || var2.field747 == -1 || class39.method1863(var5).field911 >= class39.method1863(var2.field747).field911) {
                    var2.field747 = var5;
                    var2.field758 = 0;
                    var2.field759 = 0;
                    var2.field756 = var6;
                    var2.field755 = 0;
                    var2.field727 = var2.field779;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field283.method2181();
                int var9 = field283.method2181();
                var2.method593(var8, var9, field249);
                var2.field748 = field249 + 300;
                var2.field760 = field283.method2174();
                var2.field750 = field283.method2292();
            }
            if ((var3 & 0x4) != 0) {
                int var10 = field283.method2181();
                int var11 = field283.method2142();
                var2.method593(var10, var11, field249);
                var2.field748 = field249 + 300;
                var2.field760 = field283.method2292();
                var2.field750 = field283.method2176();
            }
            if ((var3 & 0x2) != 0) {
                var2.field696 = class36.method2556(field283.method2175());
                var2.field730 = var2.field696.field804;
                var2.field778 = var2.field696.field827;
                var2.field734 = var2.field696.field825;
                var2.field728 = var2.field696.field811;
                var2.field781 = var2.field696.field812;
                var2.field737 = var2.field696.field834;
                var2.field783 = var2.field696.field829;
                var2.field732 = var2.field696.field832;
                var2.field764 = var2.field696.field809;
            }
            if ((var3 & 0x20) != 0) {
                var2.field739 = field283.method2150();
                var2.field735 = 100;
            }
        }
    }

    @ObfuscatedName("ah.bz(IIS)V")
    public static final void method572(int arg0, int arg1) {
        if (field377 < 2 && field395 == 0 && !field486) {
            return;
        }
        String var2;
        if (field395 == 1 && field377 < 2) {
            var2 = class147.field2303 + class147.field2336 + field396 + " " + class2.field32;
        } else if (field486 && field377 < 2) {
            var2 = field400 + class147.field2336 + field393 + " " + class2.field32;
        } else {
            int var3 = field377 - 1;
            String var4;
            if (field390[var3].length() > 0) {
                var4 = field389[var3] + class147.field2336 + field390[var3];
            } else {
                var4 = field389[var3];
            }
            var2 = var4;
        }
        if (field377 > 2) {
            var2 = var2 + class2.method459(16777215) + " " + '/' + " " + (field377 - 2) + class147.field2329;
        }
        Statics.field1918.method3507(var2, arg0 + 4, arg1 + 15, 16777215, 0, field249 / 1000);
    }

    @ObfuscatedName("dc.bb(IIIII)V")
    public static final void method2325(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field417; var4++) {
            if (field453[var4] + field451[var4] > arg0 && field451[var4] < arg0 + arg2 && field454[var4] + field452[var4] > arg1 && field452[var4] < arg1 + arg3) {
                field449[var4] = true;
            }
        }
    }

    @ObfuscatedName("cp.bk(III)V")
    public static final void method1767(int arg0, int arg1) {
        int var2 = Statics.field1918.method3559(class147.field2343);
        for (int var3 = 0; var3 < field377; var3++) {
            class207 var4 = Statics.field1918;
            String var5;
            if (field390[var3].length() > 0) {
                var5 = field389[var3] + class147.field2336 + field390[var3];
            } else {
                var5 = field389[var3];
            }
            int var6 = var4.method3559(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field377 * 15 + 21;
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
        field383 = true;
        Statics.field2459 = var8;
        Statics.field158 = var9;
        Statics.field1891 = var2;
        Statics.field650 = field377 * 15 + 22;
    }

    @ObfuscatedName("p.bh(IB)V")
    public static final void method64(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field385[arg0];
        int var2 = field384[arg0];
        int var3 = field387[arg0];
        int var4 = field388[arg0];
        String var5 = field389[arg0];
        String var6 = field390[arg0];
        method700(var1, var2, var3, var4, var5, var6, class131.field2021, class131.field2035);
    }

    @ObfuscatedName("am.br(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method700(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 21) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(119);
            field281.method2301(arg3);
            field281.method2301(Statics.field176 + arg1);
            field281.method2129(class128.field1992[82] ? 1 : 0);
            field281.method2173(Statics.field842 + arg0);
        }
        if (arg2 == 17) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(64);
            field281.method2172(Statics.field176 + arg1);
            field281.method2173(field398);
            field281.method2165(class128.field1992[82] ? 1 : 0);
            field281.method2131(Statics.field614);
            field281.method2173(Statics.field842 + arg0);
            field281.method2301(arg3);
        }
        if (arg2 == 20) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(102);
            field281.method2301(Statics.field842 + arg0);
            field281.method2165(class128.field1992[82] ? 1 : 0);
            field281.method2172(Statics.field176 + arg1);
            field281.method2172(arg3);
        }
        if (arg2 == 45) {
            class3 var8 = field401[arg3];
            if (var8 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(120);
                field281.method2165(class128.field1992[82] ? 1 : 0);
                field281.method2267(arg3);
            }
        }
        if (arg2 == 40) {
            field281.method2381(222);
            field281.method2131(arg1);
            field281.method2172(arg3);
            field281.method2301(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 51) {
            class3 var9 = field401[arg3];
            if (var9 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(182);
                field281.method2165(class128.field1992[82] ? 1 : 0);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 43) {
            field281.method2381(161);
            field281.method2172(arg0);
            field281.method2301(arg3);
            field281.method2180(arg1);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 23) {
            Statics.field1098.method1631(Statics.field788, arg0, arg1);
        }
        if (arg2 == 1004) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field281.method2381(205);
            field281.method2267(arg3);
        }
        if (arg2 == 14) {
            class3 var10 = field401[arg3];
            if (var10 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(73);
                field281.method2173(arg3);
                field281.method2301(Statics.field1808);
                field281.method2267(Statics.field1355);
                field281.method2129(class128.field1992[82] ? 1 : 0);
                field281.method2182(Statics.field2017);
            }
        }
        if (arg2 == 13) {
            class31 var11 = field277[arg3];
            if (var11 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(238);
                field281.method2172(arg3);
                field281.method2163(class128.field1992[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(221);
            field281.method2172(Statics.field176 + arg1);
            field281.method2172(Statics.field1355);
            field281.method2182(Statics.field2017);
            field281.method2203(class128.field1992[82] ? 1 : 0);
            field281.method2172(arg3);
            field281.method2172(Statics.field842 + arg0);
            field281.method2301(Statics.field1808);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class157 var12 = class157.method1871(arg1, arg0);
            if (var12 != null) {
                int var13 = var12.field2669;
                class157 var14 = class157.method1871(arg1, arg0);
                if (var14 != null) {
                    if (var14.field2650 != null) {
                        class1 var15 = new class1();
                        var15.field3 = var14;
                        var15.field6 = arg3;
                        var15.field10 = arg5;
                        var15.field12 = var14.field2650;
                        class33.method127(var15, 200000);
                    }
                    boolean var16 = true;
                    if (var14.field2563 > 0) {
                        var16 = method693(var14);
                    }
                    if (var16) {
                        int var17 = method153(var14);
                        int var18 = arg3 - 1;
                        boolean var19 = (var17 >> var18 + 1 & 0x1) != 0;
                        if (var19) {
                            if (arg3 == 1) {
                                field281.method2381(50);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 2) {
                                field281.method2381(186);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 3) {
                                field281.method2381(7);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 4) {
                                field281.method2381(150);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 5) {
                                field281.method2381(166);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 6) {
                                field281.method2381(37);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 7) {
                                field281.method2381(59);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 8) {
                                field281.method2381(141);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 9) {
                                field281.method2381(177);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                            if (arg3 == 10) {
                                field281.method2381(228);
                                field281.method2131(arg1);
                                field281.method2267(arg0);
                                field281.method2267(var13);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 48) {
            class3 var20 = field401[arg3];
            if (var20 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(210);
                field281.method2129(class128.field1992[82] ? 1 : 0);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 24) {
            class157 var21 = class157.method835(arg1);
            boolean var22 = true;
            if (var21.field2563 > 0) {
                var22 = method693(var21);
            }
            if (var22) {
                field281.method2381(3);
                field281.method2131(arg1);
            }
        }
        if (arg2 == 30 && field406 == null) {
            method477(arg1, arg0);
            field406 = class157.method1871(arg1, arg0);
            method3452(field406);
        }
        if (arg2 == 58) {
            class157 var23 = class157.method1871(arg1, arg0);
            if (var23 != null) {
                field281.method2381(243);
                field281.method2172(field399);
                field281.method2182(arg1);
                field281.method2180(Statics.field614);
                field281.method2301(field398);
                field281.method2267(arg0);
                field281.method2172(var23.field2669);
            }
        }
        if (arg2 == 5) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(142);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2301(Statics.field176 + arg1);
            field281.method2172(arg3 >> 14 & 0x7FFF);
            field281.method2301(Statics.field842 + arg0);
        }
        if (arg2 == 29) {
            field281.method2381(3);
            field281.method2131(arg1);
            class157 var24 = class157.method835(arg1);
            if (var24.field2661 != null && var24.field2661[0][0] == 5) {
                int var25 = var24.field2661[0][1];
                if (class159.field2692[var25] != var24.field2663[0]) {
                    class159.field2692[var25] = var24.field2663[0];
                    method840(var25);
                }
            }
        }
        if (arg2 == 12) {
            class31 var26 = field277[arg3];
            if (var26 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(206);
                field281.method2203(class128.field1992[82] ? 1 : 0);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 36) {
            field281.method2381(24);
            field281.method2131(arg1);
            field281.method2267(arg3);
            field281.method2173(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 4) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(33);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2301(Statics.field176 + arg1);
            field281.method2172(arg3 >> 14 & 0x7FFF);
            field281.method2267(Statics.field842 + arg0);
        }
        if (arg2 == 7) {
            class31 var27 = field277[arg3];
            if (var27 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(98);
                field281.method2131(Statics.field2017);
                field281.method2129(class128.field1992[82] ? 1 : 0);
                field281.method2173(Statics.field1808);
                field281.method2301(Statics.field1355);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 2) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(47);
            field281.method2172(Statics.field176 + arg1);
            field281.method2267(arg3 >> 14 & 0x7FFF);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2161(Statics.field614);
            field281.method2172(Statics.field842 + arg0);
            field281.method2172(field398);
        }
        if (arg2 == 9) {
            class31 var28 = field277[arg3];
            if (var28 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(126);
                field281.method2267(arg3);
                field281.method2163(class128.field1992[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field281.method2381(88);
            field281.method2267(arg3);
            field281.method2161(Statics.field614);
            field281.method2173(field398);
            field281.method2267(arg0);
            field281.method2180(arg1);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 47) {
            class3 var29 = field401[arg3];
            if (var29 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(49);
                field281.method2203(class128.field1992[82] ? 1 : 0);
                field281.method2267(arg3);
            }
        }
        if (arg2 == 6) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(147);
            field281.method2301(Statics.field842 + arg0);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2301(Statics.field176 + arg1);
            field281.method2267(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            field281.method2381(251);
            for (class4 var30 = (class4) field403.method3260(); var30 != null; var30 = (class4) field403.method3261()) {
                if (var30.field64 == 0 || var30.field64 == 3) {
                    method31(var30, true);
                }
            }
            if (field406 != null) {
                method3452(field406);
                field406 = null;
            }
        }
        if (arg2 == 15) {
            class3 var31 = field401[arg3];
            if (var31 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(151);
                field281.method2267(field398);
                field281.method2163(class128.field1992[82] ? 1 : 0);
                field281.method2182(Statics.field614);
                field281.method2172(arg3);
            }
        }
        if (arg2 == 35) {
            field281.method2381(20);
            field281.method2131(arg1);
            field281.method2172(arg3);
            field281.method2172(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 11) {
            class31 var32 = field277[arg3];
            if (var32 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(99);
                field281.method2203(class128.field1992[82] ? 1 : 0);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 10) {
            class31 var33 = field277[arg3];
            if (var33 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(25);
                field281.method2203(class128.field1992[82] ? 1 : 0);
                field281.method2173(arg3);
            }
        }
        if (arg2 == 42) {
            field281.method2381(140);
            field281.method2161(arg1);
            field281.method2301(arg0);
            field281.method2172(arg3);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 37) {
            field281.method2381(62);
            field281.method2161(arg1);
            field281.method2172(arg3);
            field281.method2173(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 1) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(209);
            field281.method2301(Statics.field842 + arg0);
            field281.method2267(Statics.field176 + arg1);
            field281.method2131(Statics.field2017);
            field281.method2267(Statics.field1355);
            field281.method2203(class128.field1992[82] ? 1 : 0);
            field281.method2267(arg3 >> 14 & 0x7FFF);
            field281.method2172(Statics.field1808);
        }
        if (arg2 == 28) {
            field281.method2381(3);
            field281.method2131(arg1);
            class157 var34 = class157.method835(arg1);
            if (var34.field2661 != null && var34.field2661[0][0] == 5) {
                int var35 = var34.field2661[0][1];
                class159.field2692[var35] = 1 - class159.field2692[var35];
                method840(var35);
            }
        }
        if (arg2 == 18) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(242);
            field281.method2165(class128.field1992[82] ? 1 : 0);
            field281.method2173(Statics.field176 + arg1);
            field281.method2267(Statics.field842 + arg0);
            field281.method2267(arg3);
        }
        if (arg2 == 3) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(53);
            field281.method2267(Statics.field842 + arg0);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2172(arg3 >> 14 & 0x7FFF);
            field281.method2173(Statics.field176 + arg1);
        }
        if (arg2 == 1001) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(208);
            field281.method2172(Statics.field842 + arg0);
            field281.method2172(Statics.field176 + arg1);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 19) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(44);
            field281.method2163(class128.field1992[82] ? 1 : 0);
            field281.method2301(arg3);
            field281.method2267(Statics.field176 + arg1);
            field281.method2173(Statics.field842 + arg0);
        }
        if (arg2 == 1005) {
            class157 var36 = class157.method835(arg1);
            if (var36 == null || var36.field2668[arg0] < 100000) {
                field281.method2381(205);
                field281.method2267(arg3);
            } else {
                class10.method691(27, "", var36.field2668[arg0] + " x " + class46.method2398(arg3).field1012);
            }
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 39) {
            field281.method2381(128);
            field281.method2172(arg0);
            field281.method2172(arg3);
            field281.method2180(arg1);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 46) {
            class3 var37 = field401[arg3];
            if (var37 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(165);
                field281.method2163(class128.field1992[82] ? 1 : 0);
                field281.method2301(arg3);
            }
        }
        if (arg2 == 41) {
            field281.method2381(69);
            field281.method2172(arg3);
            field281.method2180(arg1);
            field281.method2172(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 25) {
            class157 var38 = class157.method1871(arg1, arg0);
            if (var38 != null) {
                method161();
                int var39 = class161.method2892(method153(var38));
                int var40 = var38.field2669;
                class157 var41 = class157.method1871(arg1, arg0);
                if (var41 != null && var41.field2641 != null) {
                    class1 var42 = new class1();
                    var42.field3 = var41;
                    var42.field12 = var41.field2641;
                    class33.method127(var42, 200000);
                }
                field399 = var40;
                field486 = true;
                Statics.field614 = arg1;
                field398 = arg0;
                Statics.field9 = var39;
                method3452(var41);
                field395 = 0;
                String var43;
                if (class161.method2892(method153(var38)) == 0) {
                    var43 = null;
                } else if (var38.field2591 == null || var38.field2591.trim().length() == 0) {
                    var43 = null;
                } else {
                    var43 = var38.field2591;
                }
                field400 = var43;
                if (field400 == null) {
                    field400 = "Null";
                }
                if (var38.field2561) {
                    field393 = var38.field2566 + class2.method459(16777215);
                } else {
                    field393 = class2.method459(65280) + var38.field2665 + class2.method459(16777215);
                }
            }
            return;
        }
        if (arg2 == 33) {
            field281.method2381(129);
            field281.method2161(arg1);
            field281.method2172(arg3);
            field281.method2267(arg0);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 34) {
            field281.method2381(89);
            field281.method2173(arg3);
            field281.method2267(arg0);
            field281.method2131(arg1);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 1003) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            class31 var44 = field277[arg3];
            if (var44 != null) {
                class36 var45 = var44.field696;
                if (var45.field828 != null) {
                    var45 = var45.method615();
                }
                if (var45 != null) {
                    field281.method2381(244);
                    field281.method2301(var45.field802);
                }
            }
        }
        if (arg2 == 1002) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field281.method2381(156);
            field281.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class3 var46 = field401[arg3];
            if (var46 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(173);
                field281.method2165(class128.field1992[82] ? 1 : 0);
                field281.method2172(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var47 = field401[arg3];
            if (var47 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(72);
                field281.method2172(arg3);
                field281.method2203(class128.field1992[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method161();
            class157 var48 = class157.method835(arg1);
            field395 = 1;
            Statics.field1808 = arg0;
            Statics.field2017 = arg1;
            Statics.field1355 = arg3;
            method3452(var48);
            field396 = class2.method459(16748608) + class46.method2398(arg3).field1012 + class2.method459(16777215);
            if (field396 == null) {
                field396 = "null";
            }
            return;
        }
        if (arg2 == 49) {
            class3 var49 = field401[arg3];
            if (var49 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(187);
                field281.method2173(arg3);
                field281.method2163(class128.field1992[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field281.method2381(78);
            field281.method2172(Statics.field1808);
            field281.method2131(arg1);
            field281.method2172(arg3);
            field281.method2267(arg0);
            field281.method2131(Statics.field2017);
            field281.method2172(Statics.field1355);
            field351 = 0;
            Statics.field1956 = class157.method835(arg1);
            field484 = arg0;
        }
        if (arg2 == 8) {
            class31 var50 = field277[arg3];
            if (var50 != null) {
                field246 = arg6;
                field320 = arg7;
                field350 = 2;
                field423 = 0;
                field362 = arg0;
                field462 = arg1;
                field281.method2381(171);
                field281.method2267(field398);
                field281.method2172(arg3);
                field281.method2203(class128.field1992[82] ? 1 : 0);
                field281.method2161(Statics.field614);
            }
        }
        if (arg2 == 22) {
            field246 = arg6;
            field320 = arg7;
            field350 = 2;
            field423 = 0;
            field362 = arg0;
            field462 = arg1;
            field281.method2381(76);
            field281.method2173(arg3);
            field281.method2173(Statics.field842 + arg0);
            field281.method2165(class128.field1992[82] ? 1 : 0);
            field281.method2172(Statics.field176 + arg1);
        }
        if (field395 != 0) {
            field395 = 0;
            method3452(class157.method835(Statics.field2017));
        }
        if (field486) {
            method161();
        }
        if (Statics.field1956 != null && field351 == 0) {
            method3452(Statics.field1956);
        }
    }

    @ObfuscatedName("f.bd(B)V")
    public static void method161() {
        if (!field486) {
            return;
        }
        class157 var0 = class157.method1871(Statics.field614, field398);
        if (var0 != null && var0.field2572 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2572;
            class33.method127(var1, 200000);
        }
        field486 = false;
        method3452(var0);
    }

    @ObfuscatedName("m.bw(III)V")
    public static void method477(int arg0, int arg1) {
        field281.method2381(54);
        field281.method2180(arg0);
        field281.method2172(arg1);
    }

    @ObfuscatedName("ey.bu(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2605(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field383 || field377 >= 500) {
            return;
        }
        field389[field377] = arg0;
        field390[field377] = arg1;
        field387[field377] = arg2;
        field388[field377] = arg3;
        field385[field377] = arg4;
        field384[field377] = arg5;
        field377++;
    }

    @ObfuscatedName("cl.bg(IIIII)V")
    public static final void method1859(int arg0, int arg1, int arg2, int arg3) {
        if (field395 == 0 && !field486) {
            method2605(class147.field2330, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1756; var6++) {
            int var7 = class99.field1749[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1098.method1633(Statics.field788, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method2940(var11);
                    if (var12.field881 != null) {
                        var12 = var12.method656();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field395 == 1) {
                        method2605(class147.field2303, field396 + " " + class2.field32 + " " + class2.method459(65535) + var12.field850, 1, var7, var8, var9);
                    } else if (!field486) {
                        String[] var13 = var12.field867;
                        if (field502) {
                            var13 = method10(var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 3;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 5;
                                    }
                                    if (var14 == 3) {
                                        var15 = 6;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1001;
                                    }
                                    method2605(var13[var14], class2.method459(65535) + var12.field850, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2605(class147.field2326, class2.method459(65535) + var12.field850, 1002, var12.field845 << 14, var8, var9);
                    } else if ((Statics.field9 & 0x4) == 4) {
                        method2605(field400, field393 + " " + class2.field32 + " " + class2.method459(65535) + var12.field850, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field277[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field696.field804 == 1 && (var16.field731 & 0x7F) == 64 && (var16.field787 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field278; var17++) {
                            class31 var18 = field277[field279[var17]];
                            if (var18 != null && var16 != var18 && var18.field696.field804 == 1 && var16.field731 == var18.field731 && var16.field787 == var18.field787) {
                                method559(var18.field696, field279[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field478; var19++) {
                            class3 var20 = field401[field247[var19]];
                            if (var20 != null && var16.field731 == var20.field731 && var16.field787 == var20.field787) {
                                method3(var20, field247[var19], var8, var9);
                            }
                        }
                    }
                    method559(var16.field696, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field401[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field731 & 0x7F) == 64 && (var21.field787 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field278; var22++) {
                            class31 var23 = field277[field279[var22]];
                            if (var23 != null && var23.field696.field804 == 1 && var21.field731 == var23.field731 && var21.field787 == var23.field787) {
                                method559(var23.field696, field279[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field478; var24++) {
                            class3 var25 = field401[field247[var24]];
                            if (var25 != null && var21 != var25 && var21.field731 == var25.field731 && var21.field787 == var25.field787) {
                                method3(var25, field247[var24], var8, var9);
                            }
                        }
                    }
                    if (field242 == var11) {
                        var4 = var7;
                    } else {
                        method3(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class182 var26 = field375[Statics.field788][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3294(); var27 != null; var27 = (class26) var26.method3296()) {
                            class46 var28 = class46.method2398(var27.field613);
                            if (field395 == 1) {
                                method2605(class147.field2303, field396 + " " + class2.field32 + " " + class2.method459(16748608) + var28.field1012, 16, var27.field613, var8, var9);
                            } else if (!field486) {
                                String[] var29 = var28.field1045;
                                if (field502) {
                                    var29 = method10(var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 18;
                                        }
                                        if (var30 == 1) {
                                            var31 = 19;
                                        }
                                        if (var30 == 2) {
                                            var31 = 20;
                                        }
                                        if (var30 == 3) {
                                            var31 = 21;
                                        }
                                        if (var30 == 4) {
                                            var31 = 22;
                                        }
                                        method2605(var29[var30], class2.method459(16748608) + var28.field1012, var31, var27.field613, var8, var9);
                                    } else if (var30 == 2) {
                                        method2605(class147.field2176, class2.method459(16748608) + var28.field1012, 20, var27.field613, var8, var9);
                                    }
                                }
                                method2605(class147.field2326, class2.method459(16748608) + var28.field1012, 1004, var27.field613, var8, var9);
                            } else if ((Statics.field9 & 0x1) == 1) {
                                method2605(field400, field393 + " " + class2.field32 + " " + class2.method459(16748608) + var28.field1012, 17, var27.field613, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field401[field242];
            method3(var34, field242, var32, var33);
        }
    }

    @ObfuscatedName("ah.by(Lak;IIII)V")
    public static final void method559(class36 arg0, int arg1, int arg2, int arg3) {
        if (field377 >= 400) {
            return;
        }
        if (arg0.field828 != null) {
            arg0 = arg0.method615();
        }
        if (arg0 == null || !arg0.field831 || arg0.field833 && field410 != arg1) {
            return;
        }
        String var4 = arg0.field803;
        if (arg0.field807 != 0) {
            var4 = var4 + method1766(arg0.field807, Statics.field920.field49) + " " + class2.field23 + class147.field2331 + arg0.field807 + class2.field24;
        }
        if (field395 == 1) {
            method2605(class147.field2303, field396 + " " + class2.field32 + " " + class2.method459(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field486) {
            String[] var5 = arg0.field818;
            if (field502) {
                var5 = method10(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class147.field2327)) {
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
                        method2605(var5[var6], class2.method459(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class147.field2327)) {
                        short var9 = 0;
                        if (field266 == class18.field506 || field266 == class18.field508 && arg0.field807 > Statics.field920.field49) {
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
                        method2605(var5[var8], class2.method459(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2605(class147.field2326, class2.method459(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field9 & 0x2) == 2) {
            method2605(field400, field393 + " " + class2.field32 + " " + class2.method459(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("b.bs(Li;IIII)V")
    public static final void method3(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field920 == arg0 || field377 >= 400) {
            return;
        }
        String var4;
        if (arg0.field35 == 0) {
            var4 = arg0.field46 + method1766(arg0.field49, Statics.field920.field49) + " " + class2.field23 + class147.field2331 + arg0.field49 + class2.field24;
        } else {
            var4 = arg0.field46 + " " + class2.field23 + class147.field2332 + arg0.field35 + class2.field24;
        }
        if (field395 == 1) {
            method2605(class147.field2303, field396 + " " + class2.field32 + " " + class2.method459(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field486) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field349[var5] != null) {
                    short var6 = 0;
                    if (field349[var5].equalsIgnoreCase(class147.field2327)) {
                        if (field266 == class18.field506 || field266 == class18.field508 && arg0.field49 > Statics.field920.field49) {
                            var6 = 2000;
                        }
                        if (Statics.field920.field53 != 0 && arg0.field53 != 0) {
                            if (Statics.field920.field53 == arg0.field53) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field248[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field483[var5] + var6;
                    method2605(field349[var5], class2.method459(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field9 & 0x8) == 8) {
            method2605(field400, field393 + " " + class2.field32 + " " + class2.method459(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field377; var9++) {
            if (field387[var9] == 23) {
                field390[var9] = class2.method459(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cp.bf(III)Ljava/lang/String;")
    public static final String method1766(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method459(16711680);
        } else if (var2 < -6) {
            return class2.method459(16723968);
        } else if (var2 < -3) {
            return class2.method459(16740352);
        } else if (var2 < 0) {
            return class2.method459(16756736);
        } else if (var2 > 9) {
            return class2.method459(65280);
        } else if (var2 > 6) {
            return class2.method459(4259584);
        } else if (var2 > 3) {
            return class2.method459(8453888);
        } else if (var2 > 0) {
            return class2.method459(12648192);
        } else {
            return class2.method459(16776960);
        }
    }

    @ObfuscatedName("v.bl(IIIIIIIIB)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method2890(arg0)) {
            Statics.field1807 = null;
            method1379(Statics.field2673[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1807 != null) {
                method1379(Statics.field1807, -1412584499, arg1, arg2, arg3, arg4, Statics.field1687, Statics.field136, arg7);
                Statics.field1807 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field264[var8] = true;
            }
        } else {
            field264[arg7] = true;
        }
    }

    @ObfuscatedName("bu.bn([Lfv;IIIIIIIII)V")
    public static final void method1379(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1507(arg2, arg3, arg4, arg5);
        class85.method1771();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2611 == arg1 || arg1 == -1412584499 && field419 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field451[field417] = var10.field2567 + arg6;
                    field452[field417] = var10.field2643 + arg7;
                    field453[field417] = var10.field2594;
                    field454[field417] = var10.field2617;
                    var11 = ++field417 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2623 = var11;
                var10.field2652 = field249;
                if (!var10.field2561 || !Statics.method821(var10)) {
                    if (var10.field2563 > 0) {
                        method7(var10);
                    }
                    int var12 = var10.field2567 + arg6;
                    int var13 = var10.field2643 + arg7;
                    int var14 = var10.field2584;
                    if (field419 == var10) {
                        if (arg1 != -1412584499 && !var10.field2628) {
                            Statics.field1807 = arg0;
                            Statics.field1687 = arg6;
                            Statics.field136 = arg7;
                            continue;
                        }
                        if (field425 && field494) {
                            int var15 = class131.field2022;
                            int var16 = class131.field2036 * -379793861;
                            int var17 = var15 - field356;
                            int var18 = var16 - field355;
                            if (var17 < field420) {
                                var17 = field420;
                            }
                            if (var10.field2594 + var17 > field420 + field415.field2594) {
                                var17 = field420 + field415.field2594 - var10.field2594;
                            }
                            if (var18 < field343) {
                                var18 = field343;
                            }
                            if (var10.field2617 + var18 > field343 + field415.field2617) {
                                var18 = field343 + field415.field2617 - var10.field2617;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2628) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2564 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2564 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2594 + var12;
                        int var26 = var10.field2617 + var13;
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
                        int var29 = var10.field2594 + var12;
                        int var30 = var10.field2617 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2561 || var19 < var21 && var20 < var22) {
                        if (var10.field2563 != 0) {
                            if (var10.field2563 == 1337) {
                                field391 = var12;
                                field392 = var13;
                                method3092(var12, var13, var10.field2594, var10.field2617);
                                class74.method1507(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2563 == 1338) {
                                method2364();
                                class74.method1507(var12, var13, Statics.field524.field1324 + var12, Statics.field524.field1325 + var13);
                                if (field476 == 2 || field476 == 5) {
                                    class74.method1520(var12 + 25, var13 + 5, 0, Statics.field1010, Statics.field1004);
                                } else {
                                    int var31 = field325 + field311 & 0x7FF;
                                    int var32 = Statics.field920.field731 / 32 + 48;
                                    int var33 = 464 - Statics.field920.field787 / 32;
                                    Statics.field719.method1436(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field313 + 256, Statics.field1010, Statics.field1004);
                                    for (int var34 = 0; var34 < field470; var34++) {
                                        int var35 = field308[var34] * 4 + 2 - Statics.field920.field731 / 32;
                                        int var36 = field472[var34] * 4 + 2 - Statics.field920.field787 / 32;
                                        method1872(var12, var13, var35, var36, field473[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class182 var39 = field375[Statics.field788][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field920.field731 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field920.field787 / 32;
                                                method1872(var12, var13, var40, var41, Statics.field520[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field278; var42++) {
                                        class31 var43 = field277[field279[var42]];
                                        if (var43 != null && var43.method16()) {
                                            class36 var44 = var43.field696;
                                            if (var44 != null && var44.field828 != null) {
                                                var44 = var44.method615();
                                            }
                                            if (var44 != null && var44.field819 && var44.field831) {
                                                int var45 = var43.field731 / 32 - Statics.field920.field731 / 32;
                                                int var46 = var43.field787 / 32 - Statics.field920.field787 / 32;
                                                method1872(var12, var13, var45, var46, Statics.field520[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field478; var47++) {
                                        class3 var48 = field401[field247[var47]];
                                        if (var48 != null && var48.method16() && !var48.field54) {
                                            int var49 = var48.field731 / 32 - Statics.field920.field731 / 32;
                                            int var50 = var48.field787 / 32 - Statics.field920.field787 / 32;
                                            boolean var51 = false;
                                            if (method65(var48.field46, true)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field1896; var53++) {
                                                if (var48.field46.equals(Statics.field1429[var53].field559)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field920.field53 != 0 && var48.field53 != 0 && Statics.field920.field53 == var48.field53) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method1872(var12, var13, var49, var50, Statics.field520[3]);
                                            } else if (var54) {
                                                method1872(var12, var13, var49, var50, Statics.field520[4]);
                                            } else if (var52) {
                                                method1872(var12, var13, var49, var50, Statics.field520[5]);
                                            } else {
                                                method1872(var12, var13, var49, var50, Statics.field520[2]);
                                            }
                                        }
                                    }
                                    if (field257 != 0 && field249 % 20 < 10) {
                                        if (field257 == 1 && field431 >= 0 && field431 < field277.length) {
                                            class31 var55 = field277[field431];
                                            if (var55 != null) {
                                                int var56 = var55.field731 / 32 - Statics.field920.field731 / 32;
                                                int var57 = var55.field787 / 32 - Statics.field920.field787 / 32;
                                                method119(var12, var13, var56, var57, Statics.field1838[1]);
                                            }
                                        }
                                        if (field257 == 2) {
                                            int var58 = field260 * 4 - Statics.field842 * 4 + 2 - Statics.field920.field731 / 32;
                                            int var59 = field261 * 4 - Statics.field176 * 4 + 2 - Statics.field920.field787 / 32;
                                            method119(var12, var13, var58, var59, Statics.field1838[1]);
                                        }
                                        if (field257 == 10 && field463 >= 0 && field463 < field401.length) {
                                            class3 var60 = field401[field463];
                                            if (var60 != null) {
                                                int var61 = var60.field731 / 32 - Statics.field920.field731 / 32;
                                                int var62 = var60.field787 / 32 - Statics.field920.field787 / 32;
                                                method119(var12, var13, var61, var62, Statics.field1838[1]);
                                            }
                                        }
                                    }
                                    if (field362 != 0) {
                                        int var63 = field362 * 4 + 2 - Statics.field920.field731 / 32;
                                        int var64 = field462 * 4 + 2 - Statics.field920.field787 / 32;
                                        method1872(var12, var13, var63, var64, Statics.field1838[0]);
                                    }
                                    if (!Statics.field920.field54) {
                                        class74.method1512(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field476 < 3) {
                                    Statics.field239.method1436(var12, var13, 33, 33, 25, 25, field325, 256, Statics.field939, Statics.field2162);
                                } else {
                                    class74.method1520(var12, var13, 0, Statics.field939, Statics.field2162);
                                }
                                if (field450[var11]) {
                                    Statics.field524.method1576(var12, var13);
                                }
                                field449[var11] = true;
                                class74.method1507(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2564 == 0) {
                            if (!var10.field2561 && Statics.method821(var10) && Statics.field57 != var10) {
                                continue;
                            }
                            if (!var10.field2561) {
                                if (var10.field2568 > var10.field2662 - var10.field2617) {
                                    var10.field2568 = var10.field2662 - var10.field2617;
                                }
                                if (var10.field2568 < 0) {
                                    var10.field2568 = 0;
                                }
                            }
                            method1379(arg0, var10.field2562, var19, var20, var21, var22, var12 - var10.field2575, var13 - var10.field2568, var11);
                            if (var10.field2630 != null) {
                                method1379(var10.field2630, var10.field2562, var19, var20, var21, var22, var12 - var10.field2575, var13 - var10.field2568, var11);
                            }
                            class4 var65 = (class4) field403.method3257((long) var10.field2562);
                            if (var65 != null) {
                                method146(var65.field56, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class74.method1507(arg2, arg3, arg4, arg5);
                            class85.method1771();
                        }
                        if (field450[var11] || field455 > 1) {
                            if (var10.field2564 == 0 && !var10.field2561 && var10.field2662 > var10.field2617) {
                                method2067(var10.field2594 + var12, var13, var10.field2568, var10.field2617, var10.field2662);
                            }
                            if (var10.field2564 != 1) {
                                if (var10.field2564 == 2) {
                                    int var66 = 0;
                                    for (int var67 = 0; var67 < var10.field2617; var67++) {
                                        for (int var68 = 0; var68 < var10.field2594; var68++) {
                                            int var69 = (var10.field2616 + 32) * var68 + var12;
                                            int var70 = (var10.field2593 + 32) * var67 + var13;
                                            if (var66 < 20) {
                                                var69 += var10.field2618[var66];
                                                var70 += var10.field2619[var66];
                                            }
                                            if (var10.field2667[var66] > 0) {
                                                boolean var71 = false;
                                                boolean var72 = false;
                                                int var73 = var10.field2667[var66] - 1;
                                                if (var69 + 32 > arg2 && var69 < arg4 && var70 + 32 > arg3 && var70 < arg5 || Statics.field941 == var10 && field353 == var66) {
                                                    class73 var74;
                                                    if (field395 == 1 && Statics.field1808 == var66 && Statics.field2017 == var10.field2562) {
                                                        var74 = class46.method143(var73, var10.field2668[var66], 2, 0, 2, false);
                                                    } else {
                                                        var74 = class46.method143(var73, var10.field2668[var66], 1, 3153952, 2, false);
                                                    }
                                                    if (var74 == null) {
                                                        method3452(var10);
                                                    } else if (Statics.field941 == var10 && field353 == var66) {
                                                        int var75 = class131.field2022 - field490;
                                                        int var76 = class131.field2036 * -379793861 - field370;
                                                        if (var75 < 5 && var75 > -5) {
                                                            var75 = 0;
                                                        }
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (field358 < 5) {
                                                            var75 = 0;
                                                            var76 = 0;
                                                        }
                                                        var74.method1426(var69 + var75, var70 + var76, 128);
                                                        if (arg1 != -1) {
                                                            class157 var77 = arg0[arg1 & 0xFFFF];
                                                            if (var70 + var76 < class74.field1315 && var77.field2568 > 0) {
                                                                int var78 = field316 * (class74.field1315 - var70 - var76) / 3;
                                                                if (var78 > field316 * 10) {
                                                                    var78 = field316 * 10;
                                                                }
                                                                if (var78 > var77.field2568) {
                                                                    var78 = var77.field2568;
                                                                }
                                                                var77.field2568 -= var78;
                                                                field370 += var78;
                                                                method3452(var77);
                                                            }
                                                            if (var70 + var76 + 32 > class74.field1318 && var77.field2568 < var77.field2662 - var77.field2617) {
                                                                int var79 = field316 * (var70 + var76 + 32 - class74.field1318) / 3;
                                                                if (var79 > field316 * 10) {
                                                                    var79 = field316 * 10;
                                                                }
                                                                if (var79 > var77.field2662 - var77.field2617 - var77.field2568) {
                                                                    var79 = var77.field2662 - var77.field2617 - var77.field2568;
                                                                }
                                                                var77.field2568 += var79;
                                                                field370 -= var79;
                                                                method3452(var77);
                                                            }
                                                        }
                                                    } else if (Statics.field1956 == var10 && field484 == var66) {
                                                        var74.method1426(var69, var70, 128);
                                                    } else {
                                                        var74.method1484(var69, var70);
                                                    }
                                                }
                                            } else if (var10.field2620 != null && var66 < 20) {
                                                class73 var80 = var10.method2904(var66);
                                                if (var80 != null) {
                                                    var80.method1484(var69, var70);
                                                } else if (class157.field2560) {
                                                    method3452(var10);
                                                }
                                            }
                                            var66++;
                                        }
                                    }
                                } else if (var10.field2564 == 3) {
                                    int var81;
                                    if (method2747(var10)) {
                                        var81 = var10.field2580;
                                        if (Statics.field57 == var10 && var10.field2582 != 0) {
                                            var81 = var10.field2582;
                                        }
                                    } else {
                                        var81 = var10.field2579;
                                        if (Statics.field57 == var10 && var10.field2581 != 0) {
                                            var81 = var10.field2581;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2583) {
                                            class74.method1512(var12, var13, var10.field2594, var10.field2617, var81);
                                        } else {
                                            class74.method1526(var12, var13, var10.field2594, var10.field2617, var81);
                                        }
                                    } else if (var10.field2583) {
                                        class74.method1523(var12, var13, var10.field2594, var10.field2617, var81, 256 - (var14 & 0xFF));
                                    } else {
                                        class74.method1515(var12, var13, var10.field2594, var10.field2617, var81, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2564 == 4) {
                                    class207 var82 = var10.method2900();
                                    if (var82 != null) {
                                        String var83 = var10.field2610;
                                        int var84;
                                        if (method2747(var10)) {
                                            var84 = var10.field2580;
                                            if (Statics.field57 == var10 && var10.field2582 != 0) {
                                                var84 = var10.field2582;
                                            }
                                            if (var10.field2651.length() > 0) {
                                                var83 = var10.field2651;
                                            }
                                        } else {
                                            var84 = var10.field2579;
                                            if (Statics.field57 == var10 && var10.field2581 != 0) {
                                                var84 = var10.field2581;
                                            }
                                        }
                                        if (var10.field2561 && var10.field2669 != -1) {
                                            class46 var85 = class46.method2398(var10.field2669);
                                            var83 = var85.field1012;
                                            if (var83 == null) {
                                                var83 = "null";
                                            }
                                            if ((var85.field1022 == 1 || var10.field2670 != 1) && var10.field2670 != -1) {
                                                String var86 = class2.method459(16748608) + var83 + class2.field27 + " " + 'x';
                                                int var87 = var10.field2670;
                                                String var88 = Integer.toString(var87);
                                                for (int var89 = var88.length() - 3; var89 > 0; var89 -= 3) {
                                                    var88 = var88.substring(0, var89) + class2.field21 + var88.substring(var89);
                                                }
                                                StringBuilder var10000;
                                                class147 var10001;
                                                String var90;
                                                if (var88.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method459(65408)).append(var88.substring(0, var88.length() - 8));
                                                    var10001 = (class147) null;
                                                    var90 = var10000.append(class147.field2415).append(" ").append(class2.field23).append(var88).append(class2.field24).append(class2.field27).toString();
                                                } else if (var88.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method459(16777215)).append(var88.substring(0, var88.length() - 4));
                                                    var10001 = (class147) null;
                                                    var90 = var10000.append(class147.field2338).append(" ").append(class2.field23).append(var88).append(class2.field24).append(class2.field27).toString();
                                                } else {
                                                    var90 = " " + class2.method459(16776960) + var88 + class2.field27;
                                                }
                                                var83 = var86 + var90;
                                            }
                                        }
                                        if (field406 == var10) {
                                            class147 var154 = (class147) null;
                                            var83 = class147.field2333;
                                            var84 = var10.field2579;
                                        }
                                        if (!var10.field2561) {
                                            var83 = method1407(var83, var10);
                                        }
                                        var82.method3503(var83, var12, var13, var10.field2594, var10.field2617, var84, var10.field2615 ? 0 : -1, var10.field2613, var10.field2614, var10.field2612);
                                    } else if (class157.field2560) {
                                        method3452(var10);
                                    }
                                } else if (var10.field2564 == 5) {
                                    if (var10.field2561) {
                                        class73 var92;
                                        if (var10.field2669 == -1) {
                                            var92 = var10.method2899(false);
                                        } else {
                                            var92 = class46.method143(var10.field2669, var10.field2670, var10.field2599, var10.field2601, var10.field2629, false);
                                        }
                                        if (var92 != null) {
                                            int var93 = var92.field1306;
                                            int var94 = var92.field1304;
                                            if (var10.field2642) {
                                                class74.method1508(var12, var13, var10.field2594 + var12, var10.field2617 + var13);
                                                int var95 = (var10.field2594 + (var93 - 1)) / var93;
                                                int var96 = (var10.field2617 + (var94 - 1)) / var94;
                                                for (int var97 = 0; var97 < var95; var97++) {
                                                    for (int var98 = 0; var98 < var96; var98++) {
                                                        if (var10.field2588 != 0) {
                                                            var92.method1432(var93 / 2 + var93 * var97 + var12, var94 / 2 + var94 * var98 + var13, var10.field2588, 4096);
                                                        } else if (var14 == 0) {
                                                            var92.method1484(var93 * var97 + var12, var94 * var98 + var13);
                                                        } else {
                                                            var92.method1426(var93 * var97 + var12, var94 * var98 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1507(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var99 = var10.field2594 * 4096 / var93;
                                                if (var10.field2588 != 0) {
                                                    var92.method1432(var10.field2594 / 2 + var12, var10.field2617 / 2 + var13, var10.field2588, var99);
                                                } else if (var14 != 0) {
                                                    var92.method1486(var12, var13, var10.field2594, var10.field2617, 256 - (var14 & 0xFF));
                                                } else if (var10.field2594 == var93 && var10.field2617 == var94) {
                                                    var92.method1484(var12, var13);
                                                } else {
                                                    var92.method1422(var12, var13, var10.field2594, var10.field2617);
                                                }
                                            }
                                        } else if (class157.field2560) {
                                            method3452(var10);
                                        }
                                    } else {
                                        class73 var91 = var10.method2899(method2747(var10));
                                        if (var91 != null) {
                                            var91.method1484(var12, var13);
                                        } else if (class157.field2560) {
                                            method3452(var10);
                                        }
                                    }
                                } else if (var10.field2564 == 6) {
                                    boolean var100 = method2747(var10);
                                    int var101;
                                    if (var100) {
                                        var101 = var10.field2576;
                                    } else {
                                        var101 = var10.field2598;
                                    }
                                    class99 var102 = null;
                                    int var103 = 0;
                                    if (var10.field2669 != -1) {
                                        class46 var104 = class46.method2398(var10.field2669);
                                        if (var104 != null) {
                                            class46 var105 = var104.method859(var10.field2670);
                                            var102 = var105.method855(1);
                                            if (var102 == null) {
                                                method3452(var10);
                                            } else {
                                                var102.method1976();
                                                var103 = var102.field1354 / 2;
                                            }
                                        }
                                    } else if (var10.field2653 == 5) {
                                        if (var10.field2571 == 0) {
                                            var102 = field500.method2988((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var102 = Statics.field920.method15();
                                        }
                                    } else if (var101 == -1) {
                                        var102 = var10.method2902((class39) null, -1, var100, Statics.field920.field36);
                                        if (var102 == null && class157.field2560) {
                                            method3452(var10);
                                        }
                                    } else {
                                        class39 var106 = class39.method1863(var101);
                                        var102 = var10.method2902(var106, var10.field2671, var100, Statics.field920.field36);
                                        if (var102 == null && class157.field2560) {
                                            method3452(var10);
                                        }
                                    }
                                    class85.method1800(var10.field2594 / 2 + var12, var10.field2617 / 2 + var13);
                                    int var107 = var10.field2605 * class85.field1483[var10.field2602] >> 16;
                                    int var108 = var10.field2605 * class85.field1469[var10.field2602] >> 16;
                                    if (var102 != null) {
                                        if (var10.field2561) {
                                            var102.method1976();
                                            if (var10.field2600) {
                                                var102.method1988(0, var10.field2603, var10.field2604, var10.field2602, var10.field2573, var10.field2682 + var103 + var107, var10.field2682 + var108, var10.field2605);
                                            } else {
                                                var102.method1987(0, var10.field2603, var10.field2604, var10.field2602, var10.field2573, var10.field2682 + var103 + var107, var10.field2682 + var108);
                                            }
                                        } else {
                                            var102.method1987(0, var10.field2603, 0, var10.field2602, 0, var107, var108);
                                        }
                                    }
                                    class85.method1802();
                                } else {
                                    if (var10.field2564 == 7) {
                                        class207 var109 = var10.method2900();
                                        if (var109 == null) {
                                            if (class157.field2560) {
                                                method3452(var10);
                                            }
                                            continue;
                                        }
                                        int var110 = 0;
                                        for (int var111 = 0; var111 < var10.field2617; var111++) {
                                            for (int var112 = 0; var112 < var10.field2594; var112++) {
                                                if (var10.field2667[var110] > 0) {
                                                    class46 var113 = class46.method2398(var10.field2667[var110] - 1);
                                                    String var114;
                                                    if (var113.field1022 != 1 && var10.field2668[var110] == 1) {
                                                        var114 = class2.method459(16748608) + var113.field1012 + class2.field27;
                                                    } else {
                                                        String var115 = class2.method459(16748608) + var113.field1012 + class2.field27 + " " + 'x';
                                                        int var116 = var10.field2668[var110];
                                                        String var117 = Integer.toString(var116);
                                                        for (int var118 = var117.length() - 3; var118 > 0; var118 -= 3) {
                                                            var117 = var117.substring(0, var118) + class2.field21 + var117.substring(var118);
                                                        }
                                                        String var119;
                                                        if (var117.length() > 9) {
                                                            var119 = " " + class2.method459(65408) + var117.substring(0, var117.length() - 8) + class147.field2415 + " " + class2.field23 + var117 + class2.field24 + class2.field27;
                                                        } else if (var117.length() > 6) {
                                                            var119 = " " + class2.method459(16777215) + var117.substring(0, var117.length() - 4) + class147.field2338 + " " + class2.field23 + var117 + class2.field24 + class2.field27;
                                                        } else {
                                                            var119 = " " + class2.method459(16776960) + var117 + class2.field27;
                                                        }
                                                        var114 = var115 + var119;
                                                    }
                                                    int var120 = (var10.field2616 + 115) * var112 + var12;
                                                    int var121 = (var10.field2593 + 12) * var111 + var13;
                                                    if (var10.field2613 == 0) {
                                                        var109.method3500(var114, var120, var121, var10.field2579, var10.field2615 ? 0 : -1);
                                                    } else if (var10.field2613 == 1) {
                                                        var109.method3502(var114, var10.field2594 / 2 + var120, var121, var10.field2579, var10.field2615 ? 0 : -1);
                                                    } else {
                                                        var109.method3501(var114, var10.field2594 + var120 - 1, var121, var10.field2579, var10.field2615 ? 0 : -1);
                                                    }
                                                }
                                                var110++;
                                            }
                                        }
                                    }
                                    if (var10.field2564 == 8 && Statics.field159 == var10 && field467 == field289) {
                                        int var122 = 0;
                                        int var123 = 0;
                                        class207 var124 = Statics.field1825;
                                        String var125 = var10.field2610;
                                        String var126 = method1407(var125, var10);
                                        while (var126.length() > 0) {
                                            int var127 = var126.indexOf(class2.field26);
                                            String var128;
                                            if (var127 == -1) {
                                                var128 = var126;
                                                var126 = "";
                                            } else {
                                                var128 = var126.substring(0, var127);
                                                var126 = var126.substring(var127 + 4);
                                            }
                                            int var129 = var124.method3559(var128);
                                            if (var129 > var122) {
                                                var122 = var129;
                                            }
                                            var123 += var124.field2975 + 1;
                                        }
                                        var122 += 6;
                                        var123 += 7;
                                        int var130 = var10.field2594 + var12 - 5 - var122;
                                        int var131 = var10.field2617 + var13 + 5;
                                        if (var130 < var12 + 5) {
                                            var130 = var12 + 5;
                                        }
                                        if (var122 + var130 > arg4) {
                                            var130 = arg4 - var122;
                                        }
                                        if (var123 + var131 > arg5) {
                                            var131 = arg5 - var123;
                                        }
                                        class74.method1512(var130, var131, var122, var123, 16777120);
                                        class74.method1526(var130, var131, var122, var123, 0);
                                        String var132 = var10.field2610;
                                        int var133 = var124.field2975 + var131 + 2;
                                        String var134 = method1407(var132, var10);
                                        while (var134.length() > 0) {
                                            int var135 = var134.indexOf(class2.field26);
                                            String var136;
                                            if (var135 == -1) {
                                                var136 = var134;
                                                var134 = "";
                                            } else {
                                                var136 = var134.substring(0, var135);
                                                var134 = var134.substring(var135 + 4);
                                            }
                                            var124.method3500(var136, var130 + 3, var133, 0, -1);
                                            var133 += var124.field2975 + 1;
                                        }
                                    }
                                    if (var10.field2564 == 9) {
                                        if (var10.field2585 == 1) {
                                            class74.method1547(var12, var13, var10.field2594 + var12, var10.field2617 + var13, var10.field2579);
                                        } else {
                                            int var137 = var10.field2594 >= 0 ? var10.field2594 : -var10.field2594;
                                            int var138 = var10.field2617 >= 0 ? var10.field2617 : -var10.field2617;
                                            int var139 = var137;
                                            if (var137 < var138) {
                                                var139 = var138;
                                            }
                                            if (var139 != 0) {
                                                int var140 = (var10.field2594 << 16) / var139;
                                                int var141 = (var10.field2617 << 16) / var139;
                                                if (var141 <= var140) {
                                                    var140 = -var140;
                                                } else {
                                                    var141 = -var141;
                                                }
                                                int var142 = var10.field2585 * var141 >> 17;
                                                int var143 = var10.field2585 * var141 + 1 >> 17;
                                                int var144 = var10.field2585 * var140 >> 17;
                                                int var145 = var10.field2585 * var140 + 1 >> 17;
                                                int var146 = var12 + var142;
                                                int var147 = var12 - var143;
                                                int var148 = var10.field2594 + var12 - var143;
                                                int var149 = var10.field2594 + var12 + var142;
                                                int var150 = var13 + var144;
                                                int var151 = var13 - var145;
                                                int var152 = var10.field2617 + var13 - var145;
                                                int var153 = var10.field2617 + var13 + var144;
                                                class85.method1778(var146, var147, var148);
                                                class85.method1781(var150, var151, var152, var146, var147, var148, var10.field2579);
                                                class85.method1778(var146, var148, var149);
                                                class85.method1781(var150, var152, var153, var146, var148, var149, var10.field2579);
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

    @ObfuscatedName("bg.bv(Ljava/lang/String;Lfv;I)Ljava/lang/String;")
    public static String method1407(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method466(method1960(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1897 != null) {
                    var5 = class213.method2875(Statics.field1897.field2087);
                    if (Statics.field1897.field2089 != null) {
                        var5 = (String) Statics.field1897.field2089;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.ci(IIIIIS)V")
    public static final void method2067(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field211[0].method1576(arg0, arg1);
        Statics.field211[1].method1576(arg0, arg1 + arg3 - 16);
        class74.method1512(arg0, arg1 + 16, 16, arg3 - 32, field317);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1512(arg0, arg1 + 16 + var6, 16, var5, field318);
        class74.method1518(arg0, arg1 + 16 + var6, var5, field299);
        class74.method1518(arg0 + 1, arg1 + 16 + var6, var5, field299);
        class74.method1511(arg0, arg1 + 16 + var6, 16, field299);
        class74.method1511(arg0, arg1 + 17 + var6, 16, field299);
        class74.method1518(arg0 + 15, arg1 + 16 + var6, var5, field319);
        class74.method1518(arg0 + 14, arg1 + 17 + var6, var5 - 1, field319);
        class74.method1511(arg0, arg1 + 15 + var6 + var5, 16, field319);
        class74.method1511(arg0 + 1, arg1 + 14 + var6 + var5, 15, field319);
    }

    @ObfuscatedName("a.cf(IB)Ljava/lang/String;")
    public static final String method466(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("eh.ck(Lfv;S)Z")
    public static final boolean method2747(class157 arg0) {
        if (arg0.field2632 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2632.length; var1++) {
            int var2 = method1960(arg0, var1);
            int var3 = arg0.field2663[var1];
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

    @ObfuscatedName("ca.ct(Lfv;II)I")
    public static final int method1960(class157 arg0, int arg1) {
        if (arg0.field2661 == null || arg1 >= arg0.field2661.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2661[arg1];
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
                    var7 = field379[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field430[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field381[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method835(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method2398(var12).field1035 || field435)) {
                        for (int var13 = 0; var13 < var11.field2667.length; var13++) {
                            if (var12 + 1 == var11.field2667[var13]) {
                                var7 += var11.field2668[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2692[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class145.field2163[field430[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2692[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field920.field49;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class145.field2161[var14]) {
                            var7 += field430[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method835(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method2398(var18).field1035 || field435)) {
                        for (int var19 = 0; var19 < var17.field2667.length; var19++) {
                            if (var18 + 1 == var17.field2667[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field407;
                }
                if (var6 == 12) {
                    var7 = field408;
                }
                if (var6 == 13) {
                    int var20 = class159.field2692[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2741(var22);
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
                    var7 = (Statics.field920.field731 >> 7) + Statics.field842;
                }
                if (var6 == 19) {
                    var7 = (Statics.field920.field787 >> 7) + Statics.field176;
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

    @ObfuscatedName("b.cq(Lfv;III)V")
    public static final void method1(class157 arg0, int arg1, int arg2) {
        if (arg0.field2639 == 1) {
            method2605(arg0.field2666, "", 24, 0, 0, arg0.field2562);
        }
        if (arg0.field2639 == 2 && !field486) {
            String var3;
            if (class161.method2892(method153(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2591 == null || arg0.field2591.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2591;
            }
            if (var3 != null) {
                method2605(var3, class2.method459(65280) + arg0.field2665, 25, 0, -1, arg0.field2562);
            }
        }
        if (arg0.field2639 == 3) {
            method2605(class147.field2334, "", 26, 0, 0, arg0.field2562);
        }
        if (arg0.field2639 == 4) {
            method2605(arg0.field2666, "", 28, 0, 0, arg0.field2562);
        }
        if (arg0.field2639 == 5) {
            method2605(arg0.field2666, "", 29, 0, 0, arg0.field2562);
        }
        if (arg0.field2639 == 6 && field406 == null) {
            method2605(arg0.field2666, "", 30, 0, -1, arg0.field2562);
        }
        if (arg0.field2564 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2617; var6++) {
                for (int var7 = 0; var7 < arg0.field2594; var7++) {
                    int var8 = (arg0.field2616 + 32) * var7;
                    int var9 = (arg0.field2593 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2618[var5];
                        var9 += arg0.field2619[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field243 = var5;
                        Statics.field65 = arg0;
                        if (arg0.field2667[var5] > 0) {
                            class46 var10 = class46.method2398(arg0.field2667[var5] - 1);
                            if (field395 == 1 && class161.method2399(method153(arg0))) {
                                if (Statics.field2017 != arg0.field2562 || Statics.field1808 != var5) {
                                    method2605(class147.field2303, field396 + " " + class2.field32 + " " + class2.method459(16748608) + var10.field1012, 31, var10.field1020, var5, arg0.field2562);
                                }
                            } else if (!field486 || !class161.method2399(method153(arg0))) {
                                String[] var11 = var10.field1046;
                                if (field502) {
                                    var11 = method10(var11);
                                }
                                if (class161.method2399(method153(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method2605(var11[var12], class2.method459(16748608) + var10.field1012, var13, var10.field1020, var5, arg0.field2562);
                                        } else if (var12 == 4) {
                                            method2605(class147.field2200, class2.method459(16748608) + var10.field1012, 37, var10.field1020, var5, arg0.field2562);
                                        }
                                    }
                                }
                                if (class161.method2889(method153(arg0))) {
                                    method2605(class147.field2303, class2.method459(16748608) + var10.field1012, 38, var10.field1020, var5, arg0.field2562);
                                }
                                if (class161.method2399(method153(arg0)) && var11 != null) {
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
                                            method2605(var11[var14], class2.method459(16748608) + var10.field1012, var15, var10.field1020, var5, arg0.field2562);
                                        }
                                    }
                                }
                                String[] var16 = arg0.field2607;
                                if (field502) {
                                    var16 = method10(var16);
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
                                            method2605(var16[var17], class2.method459(16748608) + var10.field1012, var18, var10.field1020, var5, arg0.field2562);
                                        }
                                    }
                                }
                                method2605(class147.field2326, class2.method459(16748608) + var10.field1012, 1005, var10.field1020, var5, arg0.field2562);
                            } else if ((Statics.field9 & 0x10) == 16) {
                                method2605(field400, field393 + " " + class2.field32 + " " + class2.method459(16748608) + var10.field1012, 32, var10.field1020, var5, arg0.field2562);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2561) {
            return;
        }
        if (!field486) {
            for (int var19 = 9; var19 >= 5; var19--) {
                String var20 = Statics.method2745(arg0, var19);
                if (var20 != null) {
                    method2605(var20, arg0.field2566, 1007, var19 + 1, arg0.field2680, arg0.field2562);
                }
            }
            String var21;
            if (class161.method2892(method153(arg0)) == 0) {
                var21 = null;
            } else if (arg0.field2591 == null || arg0.field2591.trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field2591;
            }
            if (var21 != null) {
                method2605(var21, arg0.field2566, 25, 0, arg0.field2680, arg0.field2562);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = Statics.method2745(arg0, var23);
                if (var24 != null) {
                    method2605(var24, arg0.field2566, 57, var23 + 1, arg0.field2680, arg0.field2562);
                }
            }
            if (class161.method1851(method153(arg0))) {
                method2605(class147.field2181, "", 30, 0, arg0.field2680, arg0.field2562);
            }
        } else if (class161.method155(method153(arg0)) && (Statics.field9 & 0x20) == 32) {
            method2605(field400, field393 + " " + class2.field32 + " " + arg0.field2566, 58, 0, arg0.field2680, arg0.field2562);
        }
    }

    @ObfuscatedName("dt.cp([Lfv;IIIIIIII)V")
    public static final void method2433(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2561 || var9.field2564 == 0 || var9.field2638 || method153(var9) != 0 || field415 == var9) && var9.field2611 == arg1 && (!var9.field2561 || !Statics.method821(var9))) {
                int var10 = var9.field2567 + arg6;
                int var11 = var9.field2643 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2564 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2564 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2594 + var10;
                    int var19 = var9.field2617 + var11;
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
                    int var22 = var9.field2594 + var10;
                    int var23 = var9.field2617 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field419 == var9) {
                    field422 = true;
                    field361 = var10;
                    field380 = var11;
                }
                if (!var9.field2561 || var12 < var14 && var13 < var15) {
                    int var24 = class131.field2022;
                    int var25 = class131.field2036 * -379793861;
                    if (class131.field2032 != 0) {
                        var24 = class131.field2021;
                        var25 = class131.field2035;
                    }
                    if (var9.field2563 == 1337) {
                        method3452(var9);
                        if (!field497 && !field383 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1859(var24, var25, var12, var13);
                        }
                    } else if (var9.field2563 == 1338) {
                        method2479(var10, var11);
                    } else {
                        if (!field383 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2564 == 0) {
                            if (!var9.field2561 && Statics.method821(var9) && Statics.field57 != var9) {
                                continue;
                            }
                            method2433(arg0, var9.field2562, var12, var13, var14, var15, var10 - var9.field2575, var11 - var9.field2568);
                            if (var9.field2630 != null) {
                                method2433(var9.field2630, var9.field2562, var12, var13, var14, var15, var10 - var9.field2575, var11 - var9.field2568);
                            }
                            class4 var26 = (class4) field403.method3257((long) var9.field2562);
                            if (var26 != null) {
                                if (var26.field64 == 0 && class131.field2022 >= var12 && class131.field2036 * -379793861 >= var13 && class131.field2022 < var14 && class131.field2036 * -379793861 < var15 && !field383 && !field412) {
                                    field389[0] = class147.field2411;
                                    field390[0] = "";
                                    field387[0] = 1006;
                                    field377 = 1;
                                }
                                int var27 = var26.field56;
                                if (class157.method2890(var27)) {
                                    method2433(Statics.field2673[var27], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2561) {
                            if (var9.field2552 && class131.field2022 >= var12 && class131.field2036 * -379793861 >= var13 && class131.field2022 < var14 && class131.field2036 * -379793861 < var15) {
                                for (class1 var28 = (class1) field442.method3293(); var28 != null; var28 = (class1) field442.method3288()) {
                                    if (var28.field5) {
                                        var28.method3392();
                                        var28.field3.field2674 = false;
                                    }
                                }
                                if (Statics.field188 == 0) {
                                    field419 = null;
                                    field415 = null;
                                }
                                if (!field383) {
                                    field389[0] = class147.field2411;
                                    field390[0] = "";
                                    field387[0] = 1006;
                                    field377 = 1;
                                }
                            }
                            boolean var29;
                            if (class131.field2022 >= var12 && class131.field2036 * -379793861 >= var13 && class131.field2022 < var14 && class131.field2036 * -379793861 < var15) {
                                var29 = true;
                            } else {
                                var29 = false;
                            }
                            boolean var30 = false;
                            if ((class131.field2025 == 1 || !Statics.field2049 && class131.field2025 == 4) && var29) {
                                var30 = true;
                            }
                            boolean var31 = false;
                            if ((class131.field2032 == 1 || !Statics.field2049 && class131.field2032 == 4) && class131.field2021 >= var12 && class131.field2035 >= var13 && class131.field2021 < var14 && class131.field2035 < var15) {
                                var31 = true;
                            }
                            if (var31) {
                                method1010(var9, class131.field2021 - var10, class131.field2035 - var11);
                            }
                            if (field419 != null && field419 != var9 && var29) {
                                int var32 = method153(var9);
                                boolean var33 = (var32 >> 20 & 0x1) != 0;
                                if (var33) {
                                    field418 = var9;
                                }
                            }
                            if (field415 == var9) {
                                field494 = true;
                                field420 = var10;
                                field343 = var11;
                            }
                            if (var9.field2638) {
                                if (var29 && field441 != 0 && var9.field2590 != null) {
                                    class1 var34 = new class1();
                                    var34.field5 = true;
                                    var34.field3 = var9;
                                    var34.field1 = field441;
                                    var34.field12 = var9.field2590;
                                    field442.method3302(var34);
                                }
                                if (field419 != null || Statics.field941 != null || field383) {
                                    var31 = false;
                                    var30 = false;
                                    var29 = false;
                                }
                                if (!var9.field2675 && var31) {
                                    var9.field2675 = true;
                                    if (var9.field2553 != null) {
                                        class1 var35 = new class1();
                                        var35.field5 = true;
                                        var35.field3 = var9;
                                        var35.field13 = class131.field2021 - var10;
                                        var35.field1 = class131.field2035 - var11;
                                        var35.field12 = var9.field2553;
                                        field442.method3302(var35);
                                    }
                                }
                                if (var9.field2675 && var30 && var9.field2589 != null) {
                                    class1 var36 = new class1();
                                    var36.field5 = true;
                                    var36.field3 = var9;
                                    var36.field13 = class131.field2022 - var10;
                                    var36.field1 = class131.field2036 * -379793861 - var11;
                                    var36.field12 = var9.field2589;
                                    field442.method3302(var36);
                                }
                                if (var9.field2675 && !var30) {
                                    var9.field2675 = false;
                                    if (var9.field2634 != null) {
                                        class1 var37 = new class1();
                                        var37.field5 = true;
                                        var37.field3 = var9;
                                        var37.field13 = class131.field2022 - var10;
                                        var37.field1 = class131.field2036 * -379793861 - var11;
                                        var37.field12 = var9.field2634;
                                        field444.method3302(var37);
                                    }
                                }
                                if (var30 && var9.field2635 != null) {
                                    class1 var38 = new class1();
                                    var38.field5 = true;
                                    var38.field3 = var9;
                                    var38.field13 = class131.field2022 - var10;
                                    var38.field1 = class131.field2036 * -379793861 - var11;
                                    var38.field12 = var9.field2635;
                                    field442.method3302(var38);
                                }
                                if (!var9.field2674 && var29) {
                                    var9.field2674 = true;
                                    if (var9.field2636 != null) {
                                        class1 var39 = new class1();
                                        var39.field5 = true;
                                        var39.field3 = var9;
                                        var39.field13 = class131.field2022 - var10;
                                        var39.field1 = class131.field2036 * -379793861 - var11;
                                        var39.field12 = var9.field2636;
                                        field442.method3302(var39);
                                    }
                                }
                                if (var9.field2674 && var29 && var9.field2637 != null) {
                                    class1 var40 = new class1();
                                    var40.field5 = true;
                                    var40.field3 = var9;
                                    var40.field13 = class131.field2022 - var10;
                                    var40.field1 = class131.field2036 * -379793861 - var11;
                                    var40.field12 = var9.field2637;
                                    field442.method3302(var40);
                                }
                                if (var9.field2674 && !var29) {
                                    var9.field2674 = false;
                                    if (var9.field2660 != null) {
                                        class1 var41 = new class1();
                                        var41.field5 = true;
                                        var41.field3 = var9;
                                        var41.field13 = class131.field2022 - var10;
                                        var41.field1 = class131.field2036 * -379793861 - var11;
                                        var41.field12 = var9.field2660;
                                        field444.method3302(var41);
                                    }
                                }
                                if (var9.field2649 != null) {
                                    class1 var42 = new class1();
                                    var42.field3 = var9;
                                    var42.field12 = var9.field2649;
                                    field475.method3302(var42);
                                }
                                if (var9.field2621 != null && field428 > var9.field2677) {
                                    if (var9.field2644 == null || field428 - var9.field2677 > 32) {
                                        class1 var47 = new class1();
                                        var47.field3 = var9;
                                        var47.field12 = var9.field2621;
                                        field442.method3302(var47);
                                    } else {
                                        label549: for (int var43 = var9.field2677; var43 < field428; var43++) {
                                            int var44 = field336[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2644.length; var45++) {
                                                if (var9.field2644[var45] == var44) {
                                                    class1 var46 = new class1();
                                                    var46.field3 = var9;
                                                    var46.field12 = var9.field2621;
                                                    field442.method3302(var46);
                                                    break label549;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2677 = field428;
                                }
                                if (var9.field2645 != null && field373 > var9.field2678) {
                                    if (var9.field2646 == null || field373 - var9.field2678 > 32) {
                                        class1 var52 = new class1();
                                        var52.field3 = var9;
                                        var52.field12 = var9.field2645;
                                        field442.method3302(var52);
                                    } else {
                                        label525: for (int var48 = var9.field2678; var48 < field373; var48++) {
                                            int var49 = field429[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2646.length; var50++) {
                                                if (var9.field2646[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field3 = var9;
                                                    var51.field12 = var9.field2645;
                                                    field442.method3302(var51);
                                                    break label525;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2678 = field373;
                                }
                                if (var9.field2647 != null && field432 > var9.field2679) {
                                    if (var9.field2648 == null || field432 - var9.field2679 > 32) {
                                        class1 var57 = new class1();
                                        var57.field3 = var9;
                                        var57.field12 = var9.field2647;
                                        field442.method3302(var57);
                                    } else {
                                        label501: for (int var53 = var9.field2679; var53 < field432; var53++) {
                                            int var54 = field439[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2648.length; var55++) {
                                                if (var9.field2648[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field3 = var9;
                                                    var56.field12 = var9.field2647;
                                                    field442.method3302(var56);
                                                    break label501;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2679 = field432;
                                }
                                if (field335 > var9.field2664 && var9.field2595 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field12 = var9.field2595;
                                    field442.method3302(var58);
                                }
                                if (field434 > var9.field2664 && var9.field2654 != null) {
                                    class1 var59 = new class1();
                                    var59.field3 = var9;
                                    var59.field12 = var9.field2654;
                                    field442.method3302(var59);
                                }
                                if (field426 > var9.field2664 && var9.field2554 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field12 = var9.field2554;
                                    field442.method3302(var60);
                                }
                                if (field436 > var9.field2664 && var9.field2659 != null) {
                                    class1 var61 = new class1();
                                    var61.field3 = var9;
                                    var61.field12 = var9.field2659;
                                    field442.method3302(var61);
                                }
                                if (field480 > var9.field2664 && var9.field2578 != null) {
                                    class1 var62 = new class1();
                                    var62.field3 = var9;
                                    var62.field12 = var9.field2578;
                                    field442.method3302(var62);
                                }
                                if (field292 > var9.field2664 && var9.field2656 != null) {
                                    class1 var63 = new class1();
                                    var63.field3 = var9;
                                    var63.field12 = var9.field2656;
                                    field442.method3302(var63);
                                }
                                var9.field2664 = field446;
                                if (var9.field2608 != null) {
                                    for (int var64 = 0; var64 < field298; var64++) {
                                        class1 var65 = new class1();
                                        var65.field3 = var9;
                                        var65.field8 = field465[var64];
                                        var65.field14 = field464[var64];
                                        var65.field12 = var9.field2608;
                                        field442.method3302(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2561 && field419 == null && Statics.field941 == null && !field383) {
                            if ((var9.field2559 >= 0 || var9.field2581 != 0) && class131.field2022 >= var12 && class131.field2036 * -379793861 >= var13 && class131.field2022 < var14 && class131.field2036 * -379793861 < var15) {
                                if (var9.field2559 >= 0) {
                                    Statics.field57 = arg0[var9.field2559];
                                } else {
                                    Statics.field57 = var9;
                                }
                            }
                            if (var9.field2564 == 8 && class131.field2022 >= var12 && class131.field2036 * -379793861 >= var13 && class131.field2022 < var14 && class131.field2036 * -379793861 < var15) {
                                Statics.field159 = var9;
                            }
                            if (var9.field2662 > var9.field2617) {
                                int var66 = var9.field2594 + var10;
                                int var67 = var9.field2617;
                                int var68 = var9.field2662;
                                int var69 = class131.field2022;
                                int var70 = class131.field2036 * -379793861;
                                if (field321) {
                                    field322 = 32;
                                } else {
                                    field322 = 0;
                                }
                                field321 = false;
                                if (class131.field2025 == 1 || !Statics.field2049 && class131.field2025 == 4) {
                                    if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 && var70 < var11 + 16) {
                                        var9.field2568 -= 4;
                                        method3452(var9);
                                    } else if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 + var67 - 16 && var70 < var11 + var67) {
                                        var9.field2568 += 4;
                                        method3452(var9);
                                    } else if (var69 >= var66 - field322 && var69 < field322 + var66 + 16 && var70 >= var11 + 16 && var70 < var11 + var67 - 16) {
                                        int var71 = (var67 - 32) * var67 / var68;
                                        if (var71 < 8) {
                                            var71 = 8;
                                        }
                                        int var72 = var70 - var11 - 16 - var71 / 2;
                                        int var73 = var67 - 32 - var71;
                                        var9.field2568 = (var68 - var67) * var72 / var73;
                                        method3452(var9);
                                        field321 = true;
                                    }
                                }
                                if (field441 != 0) {
                                    int var74 = var9.field2594;
                                    if (var69 >= var66 - var74 && var70 >= var11 && var69 < var66 + 16 && var70 <= var11 + var67) {
                                        var9.field2568 += field441 * 45;
                                        method3452(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.cy(IIB)V")
    public static final void method576(int arg0, int arg1) {
        if (class157.method2890(arg0)) {
            method116(Statics.field2673[arg0], arg1);
        }
    }

    @ObfuscatedName("z.ch([Lfv;II)V")
    public static final void method116(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2564 == 0) {
                    if (var3.field2630 != null) {
                        method116(var3.field2630, arg1);
                    }
                    class4 var4 = (class4) field403.method3257((long) var3.field2562);
                    if (var4 != null) {
                        method576(var4.field56, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2657 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field12 = var3.field2657;
                    class33.method127(var5, 200000);
                }
                if (arg1 == 1 && var3.field2658 != null) {
                    if (var3.field2680 >= 0) {
                        class157 var6 = class157.method835(var3.field2562);
                        if (var6 == null || var6.field2630 == null || var3.field2680 >= var6.field2630.length || var6.field2630[var3.field2680] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field12 = var3.field2658;
                    class33.method127(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ab.cn(Lfv;III)V")
    public static final void method1010(class157 arg0, int arg1, int arg2) {
        if (field419 != null || field383 || arg0 == null) {
            return;
        }
        class157 var3 = arg0;
        int var4 = class161.method2565(method153(arg0));
        class157 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class157.method835(var3.field2611);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class157 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2625;
        }
        if (var7 == null) {
            return;
        }
        field419 = arg0;
        class157 var9 = arg0;
        int var10 = class161.method2565(method153(arg0));
        class157 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class157.method835(var9.field2611);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class157 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2625;
        }
        field415 = var13;
        field356 = arg1;
        field355 = arg2;
        Statics.field188 = 0;
        field425 = false;
        if (field377 > 0) {
            int var15 = field377 - 1;
            Statics.field557 = new class28();
            Statics.field557.field636 = field385[var15];
            Statics.field557.field635 = field384[var15];
            Statics.field557.field637 = field387[var15];
            Statics.field557.field638 = field388[var15];
            Statics.field557.field639 = field389[var15];
        }
        return;
    }

    @ObfuscatedName("cw.ce(I)V")
    public static final void method1957() {
        method3452(field419);
        Statics.field188++;
        if (field422 && field494) {
            int var0 = class131.field2022;
            int var1 = class131.field2036 * -379793861;
            int var2 = var0 - field356;
            int var3 = var1 - field355;
            if (var2 < field420) {
                var2 = field420;
            }
            if (field419.field2594 + var2 > field420 + field415.field2594) {
                var2 = field420 + field415.field2594 - field419.field2594;
            }
            if (var3 < field343) {
                var3 = field343;
            }
            if (field419.field2617 + var3 > field343 + field415.field2617) {
                var3 = field343 + field415.field2617 - field419.field2617;
            }
            int var4 = var2 - field361;
            int var5 = var3 - field380;
            int var6 = field419.field2626;
            if (Statics.field188 > field419.field2627 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field425 = true;
            }
            int var7 = field415.field2575 + (var2 - field420);
            int var8 = field415.field2568 + (var3 - field343);
            if (field419.field2655 != null && field425) {
                class1 var9 = new class1();
                var9.field3 = field419;
                var9.field13 = var7;
                var9.field1 = var8;
                var9.field12 = field419.field2655;
                class33.method127(var9, 200000);
            }
            if (class131.field2025 == 0) {
                if (field425) {
                    if (field419.field2681 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field419;
                        var10.field13 = var7;
                        var10.field1 = var8;
                        var10.field7 = field418;
                        var10.field12 = field419.field2681;
                        class33.method127(var10, 200000);
                    }
                    if (field418 != null) {
                        class157 var11 = field419;
                        int var12 = class161.method2565(method153(var11));
                        class157 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class157.method835(var11.field2611);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field281.method2381(167);
                            field281.method2301(field418.field2680);
                            field281.method2182(field418.field2562);
                            field281.method2180(field419.field2562);
                            field281.method2172(field419.field2680);
                            field281.method2172(field419.field2669);
                            field281.method2173(field418.field2669);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field496 != 1) {
                                int var15 = field377 - 1;
                                boolean var16;
                                if (var15 < 0) {
                                    var16 = false;
                                } else {
                                    int var17 = field387[var15];
                                    if (var17 >= 2000) {
                                        var17 -= 2000;
                                    }
                                    if (var17 == 1007) {
                                        var16 = true;
                                    } else {
                                        var16 = false;
                                    }
                                }
                                if (!var16) {
                                    break label91;
                                }
                            }
                            if (field377 > 2) {
                                method1767(field361 + field356, field380 + field355);
                                break label120;
                            }
                        }
                        if (field377 > 0) {
                            int var18 = field361 + field356;
                            int var19 = field380 + field355;
                            class28 var20 = Statics.field557;
                            method700(var20.field636, var20.field635, var20.field637, var20.field638, var20.field639, var20.field639, var18, var19);
                            Statics.field557 = null;
                        }
                    }
                }
                field419 = null;
            }
        } else if (Statics.field188 > 1) {
            field419 = null;
        }
    }

    @ObfuscatedName("gv.cd(Lfv;I)V")
    public static void method3452(class157 arg0) {
        if (field447 == arg0.field2652) {
            field264[arg0.field2623] = true;
        }
    }

    @ObfuscatedName("k.cl(I)V")
    public static void method27() {
        for (class4 var0 = (class4) field403.method3260(); var0 != null; var0 = (class4) field403.method3261()) {
            int var1 = var0.field56;
            if (class157.method2890(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2673[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2561;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2905;
                    class157 var6 = class157.method835(var5);
                    if (var6 != null) {
                        method3452(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.cz([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method10(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("s.cv(IB)V")
    public static final void method456(int arg0) {
        if (!class157.method2890(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2673[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2671 = 0;
                var3.field2672 = 0;
            }
        }
    }

    @ObfuscatedName("cb.cb(II)V")
    public static final void method1870(int arg0) {
        if (class157.method2890(arg0)) {
            method25(Statics.field2673[arg0], -1);
        }
    }

    @ObfuscatedName("k.cs([Lfv;II)V")
    public static final void method25(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2611 == arg1 && (!var3.field2561 || !Statics.method821(var3))) {
                if (var3.field2564 == 0) {
                    if (!var3.field2561 && Statics.method821(var3) && Statics.field57 != var3) {
                        continue;
                    }
                    method25(arg0, var3.field2562);
                    if (var3.field2630 != null) {
                        method25(var3.field2630, var3.field2562);
                    }
                    class4 var4 = (class4) field403.method3257((long) var3.field2562);
                    if (var4 != null) {
                        method1870(var4.field56);
                    }
                }
                if (var3.field2564 == 6) {
                    if (var3.field2598 != -1 || var3.field2576 != -1) {
                        boolean var5 = method2747(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2576;
                        } else {
                            var6 = var3.field2598;
                        }
                        if (var6 != -1) {
                            class39 var7 = class39.method1863(var6);
                            var3.field2672 += field316;
                            while (var3.field2672 > var7.field906[var3.field2671]) {
                                var3.field2672 -= var7.field906[var3.field2671];
                                var3.field2671++;
                                if (var3.field2671 >= var7.field904.length) {
                                    var3.field2671 -= var7.field908;
                                    if (var3.field2671 < 0 || var3.field2671 >= var7.field904.length) {
                                        var3.field2671 = 0;
                                    }
                                }
                                method3452(var3);
                            }
                        }
                    }
                    if (var3.field2606 != 0 && !var3.field2561) {
                        int var8 = var3.field2606 >> 16;
                        int var9 = var3.field2606 << 16 >> 16;
                        int var10 = field316 * var8;
                        int var11 = field316 * var9;
                        var3.field2602 = var3.field2602 + var10 & 0x7FF;
                        var3.field2603 = var3.field2603 + var11 & 0x7FF;
                        method3452(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.cc(II)V")
    public static final void method840(int arg0) {
        method27();
        for (class21 var1 = (class21) class21.field546.method3293(); var1 != null; var1 = (class21) class21.field546.method3288()) {
            if (var1.field552 != null) {
                var1.method482();
            }
        }
        int var2 = class47.method2746(arg0).field1065;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2692[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1775(0.9D);
                ((class89) Statics.field1480).method1854(0.9D);
            }
            if (var3 == 2) {
                class85.method1775(0.8D);
                ((class89) Statics.field1480).method1854(0.8D);
            }
            if (var3 == 3) {
                class85.method1775(0.7D);
                ((class89) Statics.field1480).method1854(0.7D);
            }
            if (var3 == 4) {
                class85.method1775(0.6D);
                ((class89) Statics.field1480).method1854(0.6D);
            }
            class46.field1019.method3231();
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
            if (field433 != var4) {
                if (field433 == 0 && field479 != -1) {
                    class166.method2949(Statics.field162, field479, 0, var4, false);
                    field448 = false;
                } else if (var4 == 0) {
                    class166.method2062();
                    field448 = false;
                } else if (class166.field2749 == 0) {
                    Statics.field1963.method3095(var4);
                } else {
                    Statics.field2753 = var4;
                }
                field433 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field487 = 127;
            }
            if (var3 == 1) {
                field487 = 96;
            }
            if (var3 == 2) {
                field487 = 64;
            }
            if (var3 == 3) {
                field487 = 32;
            }
            if (var3 == 4) {
                field487 = 0;
            }
        }
        if (var2 == 5) {
            field496 = var3;
        }
        if (var2 == 6) {
            field404 = var3;
        }
        if (var2 == 9) {
            field405 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field481 = 127;
            }
            if (var3 == 1) {
                field481 = 96;
            }
            if (var3 == 2) {
                field481 = 64;
            }
            if (var3 == 3) {
                field481 = 32;
            }
            if (var3 == 4) {
                field481 = 0;
            }
        }
        if (var2 == 17) {
            field410 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field266 = (class18) class100.method1330(class18.method820(), var3);
            if (field266 == null) {
                field266 = class18.field508;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field242 = -1;
        } else {
            field242 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("e.cw(Lfv;I)V")
    public static final void method7(class157 arg0) {
        int var1 = arg0.field2563;
        if (var1 == 324) {
            if (field501 == -1) {
                field501 = arg0.field2586;
                field244 = arg0.field2587;
            }
            if (field500.field2703) {
                arg0.field2586 = field501;
            } else {
                arg0.field2586 = field244;
            }
        } else if (var1 == 325) {
            if (field501 == -1) {
                field501 = arg0.field2586;
                field244 = arg0.field2587;
            }
            if (field500.field2703) {
                arg0.field2586 = field244;
            } else {
                arg0.field2586 = field501;
            }
        } else if (var1 == 327) {
            arg0.field2602 = 150;
            arg0.field2603 = (int) (Math.sin((double) field249 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2653 = 5;
            arg0.field2571 = 0;
        } else if (var1 == 328) {
            arg0.field2602 = 150;
            arg0.field2603 = (int) (Math.sin((double) field249 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2653 = 5;
            arg0.field2571 = 1;
        }
    }

    @ObfuscatedName("h.cu(Lk;ZI)V")
    public static final void method31(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2905;
        arg0.method3392();
        if (arg1) {
            class157.method2514(var2);
        }
        for (class184 var4 = (class184) field445.method3260(); var4 != null; var4 = (class184) field445.method3261()) {
            if ((long) var2 == (var4.field2905 >> 48 & 0xFFFFL)) {
                var4.method3392();
            }
        }
        class157 var5 = class157.method835(var3);
        if (var5 != null) {
            method3452(var5);
        }
        for (int var6 = 0; var6 < field377; var6++) {
            int var7 = field387[var6];
            boolean var8 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
            if (var8) {
                if (var6 < field377 - 1) {
                    for (int var9 = var6; var9 < field377 - 1; var9++) {
                        field389[var9] = field389[var9 + 1];
                        field390[var9] = field390[var9 + 1];
                        field387[var9] = field387[var9 + 1];
                        field388[var9] = field388[var9 + 1];
                        field385[var9] = field385[var9 + 1];
                        field384[var9] = field384[var9 + 1];
                    }
                }
                field377--;
            }
        }
        if (field402 != -1) {
            method576(field402, 1);
        }
    }

    @ObfuscatedName("at.cr(Lfv;I)Z")
    public static final boolean method693(class157 arg0) {
        int var1 = arg0.field2563;
        if (var1 == 205) {
            field288 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field500.method2969(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field500.method2970(var4, var5 == 1);
        }
        if (var1 == 324) {
            field500.method2971(false);
        }
        if (var1 == 325) {
            field500.method2971(true);
        }
        if (var1 == 326) {
            field281.method2381(197);
            field500.method2968(field281);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.co(IIIILby;I)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1872(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field325 + field311 & 0x7FF;
        int var7 = class85.field1483[var6];
        int var8 = class85.field1469[var6];
        int var9 = var7 * 256 / (field313 + 256);
        int var10 = var8 * 256 / (field313 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1940.method1461(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cb.cx(IIIILby;I)V")
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field325 + field311 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1483[var5];
        int var8 = class85.field1469[var5];
        int var9 = var7 * 256 / (field313 + 256);
        int var10 = var8 * 256 / (field313 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1434(Statics.field524, arg0 + 94 + var11 - arg4.field1306 / 2 + 4, arg1 + 83 - var12 - arg4.field1304 / 2 - 4);
        } else {
            arg4.method1484(arg0 + 94 + var11 - arg4.field1306 / 2 + 4, arg1 + 83 - var12 - arg4.field1304 / 2 - 4);
        }
    }

    @ObfuscatedName("p.cj(Ljava/lang/String;ZI)Z")
    public static boolean method65(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class214.method608(arg0, Statics.field1450);
        for (int var3 = 0; var3 < field267; var3++) {
            if (var2.equalsIgnoreCase(class214.method608(field258[var3].field222, Statics.field1450)) && (!arg1 || field258[var3].field217 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class214.method608(Statics.field920.field46, Statics.field1450))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cv.cg(Ljava/lang/String;B)Z")
    public static boolean method1866(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class214.method608(arg0, Statics.field1450);
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field499[var2];
            if (var1.equalsIgnoreCase(class214.method608(var3.field129, Statics.field1450))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class214.method608(var3.field125, Statics.field1450))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ak.cm(Ljava/lang/String;I)V")
    public static final void method646(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field267 < 200 || field367 == 1) || field267 >= 400) {
            class10.method691(30, "", class147.field2341);
            return;
        }
        String var1 = class214.method608(arg0, Statics.field1450);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field267; var2++) {
            class16 var3 = field258[var2];
            String var4 = class214.method608(var3.field222, Statics.field1450);
            if (var4 != null && var4.equals(var1)) {
                class10.method691(30, "", arg0 + class147.field2291);
                return;
            }
            if (var3.field218 != null) {
                String var5 = class214.method608(var3.field218, Statics.field1450);
                if (var5 != null && var5.equals(var1)) {
                    class10.method691(30, "", arg0 + class147.field2291);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field498; var6++) {
            class8 var7 = field499[var6];
            String var8 = class214.method608(var7.field129, Statics.field1450);
            if (var8 != null && var8.equals(var1)) {
                class10.method691(30, "", class147.field2347 + arg0 + class147.field2348);
                return;
            }
            if (var7.field125 != null) {
                String var9 = class214.method608(var7.field125, Statics.field1450);
                if (var9 != null && var9.equals(var1)) {
                    class10.method691(30, "", class147.field2347 + arg0 + class147.field2348);
                    return;
                }
            }
        }
        if (class214.method608(Statics.field920.field46, Statics.field1450).equals(var1)) {
            class10.method691(30, "", class147.field2345);
        } else {
            field281.method2381(104);
            field281.method2203(class110.method1954(arg0));
            field281.method2133(arg0);
        }
    }

    @ObfuscatedName("en.de(Ljava/lang/String;ZI)V")
    public static final void method2860(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field498 < 100 || field367 == 1) || field498 >= 400) {
            class10.method691(31, "", class147.field2216);
            return;
        }
        String var2 = class214.method608(arg0, Statics.field1450);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field498; var3++) {
            class8 var4 = field499[var3];
            String var5 = class214.method608(var4.field129, Statics.field1450);
            if (var5 != null && var5.equals(var2)) {
                class10.method691(31, "", arg0 + class147.field2344);
                return;
            }
            if (var4.field125 != null) {
                String var6 = class214.method608(var4.field125, Statics.field1450);
                if (var6 != null && var6.equals(var2)) {
                    class10.method691(31, "", arg0 + class147.field2344);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field267; var7++) {
            class16 var8 = field258[var7];
            String var9 = class214.method608(var8.field222, Statics.field1450);
            if (var9 != null && var9.equals(var2)) {
                class10.method691(31, "", class147.field2349 + arg0 + class147.field2350);
                return;
            }
            if (var8.field218 != null) {
                String var10 = class214.method608(var8.field218, Statics.field1450);
                if (var10 != null && var10.equals(var2)) {
                    class10.method691(31, "", class147.field2349 + arg0 + class147.field2350);
                    return;
                }
            }
        }
        if (class214.method608(Statics.field920.field46, Statics.field1450).equals(var2)) {
            class10.method691(31, "", class147.field2346);
        } else {
            field281.method2381(80);
            field281.method2203(class110.method1954(arg0));
            field281.method2133(arg0);
        }
    }

    @ObfuscatedName("at.dv(Ljava/lang/String;B)V")
    public static final void method672(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class214.method608(arg0, Statics.field1450);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field499[var2];
            String var4 = var3.field129;
            String var5 = class214.method608(var4, Statics.field1450);
            if (class120.method1405(arg0, var1, var4, var5)) {
                field498--;
                for (int var6 = var2; var6 < field498; var6++) {
                    field499[var6] = field499[var6 + 1];
                }
                field434 = field446;
                field281.method2381(231);
                field281.method2203(class110.method1954(arg0));
                field281.method2133(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dv.dn(Ljava/lang/String;I)V")
    public static final void method2086(String arg0) {
        if (!arg0.equals("")) {
            field281.method2381(245);
            field281.method2203(class110.method1954(arg0));
            field281.method2133(arg0);
        }
    }

    @ObfuscatedName("z.dd(B)V")
    public static final void method114() {
        field281.method2381(245);
        field281.method2203(0);
    }

    @ObfuscatedName("q.dc(Lfv;B)I")
    public static int method153(class157 arg0) {
        class184 var1 = (class184) field445.method3257(((long) arg0.field2562 << 32) + (long) arg0.field2680);
        return var1 == null ? arg0.field2622 : var1.field2891;
    }

    @ObfuscatedName("p.dg(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method56(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field372 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field372 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field372 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field372 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field372 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1767 != null) {
            var3 = "/p=" + Statics.field1767;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field293 + "/a=" + Statics.field2042 + var3 + "/";
    }

    @ObfuscatedName("el.dx(Ljava/lang/String;ZB)V")
    public static void method2748(String arg0, boolean arg1) {
        Statics.field615.field2491 = false;
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1016; var5++) {
            class46 var6 = class46.method2398(var5);
            if ((!arg1 || var6.field1028) && var6.field1036 == -1 && var6.field1012.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field127 = -1;
                    Statics.field2516 = null;
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
        Statics.field2516 = var3;
        Statics.field1974 = 0;
        Statics.field127 = var4;
        String[] var9 = new String[Statics.field127];
        for (int var10 = 0; var10 < Statics.field127; var10++) {
            var9[var10] = class46.method2398(var3[var10]).field1012;
        }
        class115.method30(var9, Statics.field2516);
        Statics.field615.method2831();
        Statics.field615.field2491 = true;
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class135 {

    @ObfuscatedName("client.f")
    public static boolean field245 = true;

    @ObfuscatedName("client.j")
    public static int field400 = 1;

    @ObfuscatedName("client.l")
    public static int field247 = 0;

    @ObfuscatedName("client.k")
    public static int field249 = 0;

    @ObfuscatedName("client.o")
    public static boolean field251 = false;

    @ObfuscatedName("client.c")
    public static boolean field252 = false;

    @ObfuscatedName("client.r")
    public static int field396 = 0;

    @ObfuscatedName("client.d")
    public static int field255 = 0;

    @ObfuscatedName("client.b")
    public static boolean field256 = true;

    @ObfuscatedName("client.a")
    public static int field257 = 0;

    @ObfuscatedName("client.i")
    public static long field387 = 1L;

    @ObfuscatedName("client.w")
    public static class211[] field307 = new class211[4];

    @ObfuscatedName("client.z")
    public static int field410 = -1;

    @ObfuscatedName("client.u")
    public static int field260 = -1;

    @ObfuscatedName("client.ad")
    public static int field261 = -1;

    @ObfuscatedName("client.ah")
    public static boolean field262 = true;

    @ObfuscatedName("client.ao")
    public static boolean field382 = false;

    @ObfuscatedName("client.as")
    public static int field264 = 0;

    @ObfuscatedName("client.at")
    public static int field265 = 0;

    @ObfuscatedName("client.ai")
    public static int field266 = 0;

    @ObfuscatedName("client.aj")
    public static int field267 = 0;

    @ObfuscatedName("client.aq")
    public static int field268 = 0;

    @ObfuscatedName("client.an")
    public static int field284 = 0;

    @ObfuscatedName("client.ac")
    public static int field501 = 0;

    @ObfuscatedName("client.ap")
    public static int field263 = 0;

    @ObfuscatedName("client.az")
    public static int field272 = 0;

    @ObfuscatedName("client.ax")
    public static class110 field273 = new class110(new byte[5000]);

    @ObfuscatedName("client.av")
    public static class18 field304 = class18.field525;

    @ObfuscatedName("client.ak")
    public static int field275 = 0;

    @ObfuscatedName("client.ay")
    public static int field276 = 0;

    @ObfuscatedName("client.af")
    public static int field277 = 0;

    @ObfuscatedName("client.bd")
    public static int field280 = 0;

    @ObfuscatedName("client.bm")
    public static int field437 = 0;

    @ObfuscatedName("client.bz")
    public static int field282 = 0;

    @ObfuscatedName("client.bv")
    public static int field281 = 0;

    @ObfuscatedName("client.be")
    public static int field244 = 0;

    @ObfuscatedName("client.cg")
    public static class31[] field286 = new class31[32768];

    @ObfuscatedName("client.cf")
    public static int field287 = 0;

    @ObfuscatedName("client.ch")
    public static int[] field288 = new int[32768];

    @ObfuscatedName("client.cz")
    public static class113 field289 = new class113(5000);

    @ObfuscatedName("client.cn")
    public static class113 field290 = new class113(5000);

    @ObfuscatedName("client.cr")
    public static class113 field412 = new class113(5000);

    @ObfuscatedName("client.cv")
    public static int field292 = 0;

    @ObfuscatedName("client.ct")
    public static int field293 = 0;

    @ObfuscatedName("client.ci")
    public static int field294 = 0;

    @ObfuscatedName("client.cl")
    public static int field295 = 0;

    @ObfuscatedName("client.cq")
    public static int field296 = 0;

    @ObfuscatedName("client.cc")
    public static int field297 = 0;

    @ObfuscatedName("client.cu")
    public static int field298 = 0;

    @ObfuscatedName("client.ce")
    public static int field466 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field399 = false;

    @ObfuscatedName("client.ck")
    public static int field301 = 0;

    @ObfuscatedName("client.dw")
    public static int field302 = 0;

    @ObfuscatedName("client.dk")
    public static int field481 = 1;

    @ObfuscatedName("client.dd")
    public static int field341 = 0;

    @ObfuscatedName("client.dp")
    public static int field305 = 1;

    @ObfuscatedName("client.dq")
    public static int field378 = 0;

    @ObfuscatedName("client.dh")
    public static boolean field308 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field380 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field462 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field311 = 0;

    @ObfuscatedName("client.dz")
    public static int field312 = 2;

    @ObfuscatedName("client.dr")
    public static int field313 = 0;

    @ObfuscatedName("client.dx")
    public static int field314 = 2;

    @ObfuscatedName("client.de")
    public static int field315 = 0;

    @ObfuscatedName("client.dm")
    public static int field316 = 1;

    @ObfuscatedName("client.di")
    public static int field513 = 0;

    @ObfuscatedName("client.eb")
    public static int field318 = 0;

    @ObfuscatedName("client.er")
    public static int field319 = 2;

    @ObfuscatedName("client.ek")
    public static int field320 = 0;

    @ObfuscatedName("client.ey")
    public static int field321 = 1;

    @ObfuscatedName("client.eq")
    public static int field330 = 0;

    @ObfuscatedName("client.ef")
    public static int field477 = 0;

    @ObfuscatedName("client.eg")
    public static int field325 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field326 = 5063219;

    @ObfuscatedName("client.fb")
    public static int field327 = 3353893;

    @ObfuscatedName("client.fh")
    public static int field328 = 7759444;

    @ObfuscatedName("client.fu")
    public static boolean field329 = false;

    @ObfuscatedName("client.fm")
    public static int field333 = 0;

    @ObfuscatedName("client.fl")
    public static int field246 = 128;

    @ObfuscatedName("client.ft")
    public static int field309 = 0;

    @ObfuscatedName("client.fa")
    public static int field300 = 0;

    @ObfuscatedName("client.fj")
    public static int field334 = 0;

    @ObfuscatedName("client.fn")
    public static int field426 = 0;

    @ObfuscatedName("client.fd")
    public static int field336 = 0;

    @ObfuscatedName("client.fy")
    public static int field448 = 0;

    @ObfuscatedName("client.ff")
    public static boolean field338 = false;

    @ObfuscatedName("client.fr")
    public static int field271 = 0;

    @ObfuscatedName("client.fz")
    public static int field484 = 0;

    @ObfuscatedName("client.fk")
    public static int field373 = 50;

    @ObfuscatedName("client.fx")
    public static int[] field467 = new int[field373];

    @ObfuscatedName("client.fi")
    public static int[] field402 = new int[field373];

    @ObfuscatedName("client.fs")
    public static int[] field344 = new int[field373];

    @ObfuscatedName("client.fg")
    public static int[] field345 = new int[field373];

    @ObfuscatedName("client.gl")
    public static int[] field346 = new int[field373];

    @ObfuscatedName("client.gk")
    public static int[] field347 = new int[field373];

    @ObfuscatedName("client.gg")
    public static int[] field348 = new int[field373];

    @ObfuscatedName("client.gz")
    public static String[] field349 = new String[field373];

    @ObfuscatedName("client.ga")
    public static int[][] field350 = new int[104][104];

    @ObfuscatedName("client.gs")
    public static int field351 = 0;

    @ObfuscatedName("client.gf")
    public static int field352 = -1;

    @ObfuscatedName("client.ge")
    public static int field353 = -1;

    @ObfuscatedName("client.gu")
    public static int field354 = 0;

    @ObfuscatedName("client.gb")
    public static int field470 = 0;

    @ObfuscatedName("client.gw")
    public static int field356 = 0;

    @ObfuscatedName("client.gx")
    public static int field357 = 0;

    @ObfuscatedName("client.gn")
    public static int field358 = 0;

    @ObfuscatedName("client.gj")
    public static int field359 = 0;

    @ObfuscatedName("client.gc")
    public static int field360 = 0;

    @ObfuscatedName("client.gv")
    public static int field361 = 0;

    @ObfuscatedName("client.gr")
    public static int field362 = 0;

    @ObfuscatedName("client.gp")
    public static int field363 = 0;

    @ObfuscatedName("client.go")
    public static boolean field364 = false;

    @ObfuscatedName("client.gq")
    public static int field365 = 0;

    @ObfuscatedName("client.gy")
    public static int field417 = 0;

    @ObfuscatedName("client.hs")
    public static class3[] field367 = new class3[2048];

    @ObfuscatedName("client.hu")
    public static int field368 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field337 = new int[2048];

    @ObfuscatedName("client.hr")
    public static int field270 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field371 = new int[2048];

    @ObfuscatedName("client.hm")
    public static class110[] field343 = new class110[2048];

    @ObfuscatedName("client.hh")
    public static int field374 = -1;

    @ObfuscatedName("client.ha")
    public static int field450 = 0;

    @ObfuscatedName("client.hf")
    public static int field375 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field376 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field377 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hk")
    public static String[] field340 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field379 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field486 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static int field505 = -1;

    @ObfuscatedName("client.hi")
    public static class182[][][] field432 = new class182[4][104][104];

    @ObfuscatedName("client.hl")
    public static class182 field383 = new class182();

    @ObfuscatedName("client.hp")
    public static class182 field384 = new class182();

    @ObfuscatedName("client.hd")
    public static class182 field385 = new class182();

    @ObfuscatedName("client.hn")
    public static int[] field386 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field331 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field388 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field389 = 0;

    @ObfuscatedName("client.il")
    public static boolean field390 = false;

    @ObfuscatedName("client.io")
    public static int field259 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field258 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field395 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field476 = new String[500];

    @ObfuscatedName("client.iw")
    public static String[] field397 = new String[500];

    @ObfuscatedName("client.ig")
    public static int field398 = -1;

    @ObfuscatedName("client.iu")
    public static int field430 = -1;

    @ObfuscatedName("client.is")
    public static int field391 = 0;

    @ObfuscatedName("client.ia")
    public static int field291 = 50;

    @ObfuscatedName("client.ii")
    public static int field442 = 0;

    @ObfuscatedName("client.it")
    public static String field447 = null;

    @ObfuscatedName("client.iz")
    public static boolean field453 = false;

    @ObfuscatedName("client.jr")
    public static int field405 = -1;

    @ObfuscatedName("client.jc")
    public static int field274 = -1;

    @ObfuscatedName("client.jj")
    public static String field407 = null;

    @ObfuscatedName("client.ja")
    public static String field408 = null;

    @ObfuscatedName("client.ju")
    public static int field409 = -1;

    @ObfuscatedName("client.jy")
    public static class179 field431 = new class179(8);

    @ObfuscatedName("client.ji")
    public static int field411 = 0;

    @ObfuscatedName("client.jk")
    public static int field323 = 0;

    @ObfuscatedName("client.jz")
    public static class157 field401 = null;

    @ObfuscatedName("client.jd")
    public static int field414 = 0;

    @ObfuscatedName("client.jq")
    public static int field415 = 0;

    @ObfuscatedName("client.jo")
    public static int field416 = 0;

    @ObfuscatedName("client.jg")
    public static int field509 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field418 = false;

    @ObfuscatedName("client.jx")
    public static boolean field419 = false;

    @ObfuscatedName("client.jv")
    public static boolean field420 = false;

    @ObfuscatedName("client.jm")
    public static class157 field421 = null;

    @ObfuscatedName("client.jn")
    public static class157 field422 = null;

    @ObfuscatedName("client.jt")
    public static int field423 = 0;

    @ObfuscatedName("client.jw")
    public static int field424 = 0;

    @ObfuscatedName("client.je")
    public static class157 field425 = null;

    @ObfuscatedName("client.js")
    public static boolean field317 = false;

    @ObfuscatedName("client.jh")
    public static int field253 = -1;

    @ObfuscatedName("client.jp")
    public static int field506 = -1;

    @ObfuscatedName("client.kc")
    public static boolean field278 = false;

    @ObfuscatedName("client.kr")
    public static int field403 = -1;

    @ObfuscatedName("client.ks")
    public static int field355 = -1;

    @ObfuscatedName("client.kt")
    public static boolean field429 = false;

    @ObfuscatedName("client.kw")
    public static int field435 = 1;

    @ObfuscatedName("client.kj")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field413 = 0;

    @ObfuscatedName("client.km")
    public static int[] field436 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field370 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field438 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field439 = 0;

    @ObfuscatedName("client.ka")
    public static int field440 = 0;

    @ObfuscatedName("client.kv")
    public static int field372 = 0;

    @ObfuscatedName("client.kp")
    public static int field451 = 0;

    @ObfuscatedName("client.ko")
    public static int field443 = 0;

    @ObfuscatedName("client.ke")
    public static int field444 = 0;

    @ObfuscatedName("client.kb")
    public static int field445 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field446 = new int[2000];

    @ObfuscatedName("client.kz")
    public static String[] field499 = new String[1000];

    @ObfuscatedName("client.le")
    public static int field485 = 0;

    @ObfuscatedName("client.ly")
    public static class182 field449 = new class182();

    @ObfuscatedName("client.lx")
    public static class182 field406 = new class182();

    @ObfuscatedName("client.lj")
    public static class182 field335 = new class182();

    @ObfuscatedName("client.lz")
    public static class179 field452 = new class179(512);

    @ObfuscatedName("client.lp")
    public static int field502 = 0;

    @ObfuscatedName("client.lk")
    public static int field454 = -2;

    @ObfuscatedName("client.lc")
    public static boolean[] field455 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field456 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field457 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field458 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field459 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field460 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field322 = 0;

    @ObfuscatedName("client.ld")
    public static int[] field463 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field310 = 0;

    @ObfuscatedName("client.lf")
    public static int field465 = 0;

    @ObfuscatedName("client.li")
    public static String field369 = "";

    @ObfuscatedName("client.lb")
    public static long[] field306 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field468 = 0;

    @ObfuscatedName("client.lh")
    public static int field469 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field441 = new int[128];

    @ObfuscatedName("client.mu")
    public static int[] field471 = new int[128];

    @ObfuscatedName("client.mk")
    public static long field472 = -1L;

    @ObfuscatedName("client.mc")
    public static String field473 = null;

    @ObfuscatedName("client.mj")
    public static String field474 = null;

    @ObfuscatedName("client.ma")
    public static int field475 = -1;

    @ObfuscatedName("client.mq")
    public static int field433 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field342 = new int[1000];

    @ObfuscatedName("client.mo")
    public static int[] field478 = new int[1000];

    @ObfuscatedName("client.md")
    public static class73[] field479 = new class73[1000];

    @ObfuscatedName("client.mf")
    public static int field480 = 0;

    @ObfuscatedName("client.mz")
    public static int field332 = 0;

    @ObfuscatedName("client.mp")
    public static int field482 = 0;

    @ObfuscatedName("client.ms")
    public static int field483 = 255;

    @ObfuscatedName("client.me")
    public static int field464 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field269 = false;

    @ObfuscatedName("client.ny")
    public static int field299 = 127;

    @ObfuscatedName("client.ng")
    public static int field487 = 127;

    @ObfuscatedName("client.nt")
    public static int field488 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field490 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field491 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field492 = new int[50];

    @ObfuscatedName("client.nu")
    public static class53[] field303 = new class53[50];

    @ObfuscatedName("client.nf")
    public static boolean field494 = false;

    @ObfuscatedName("client.ot")
    public static boolean[] field495 = new boolean[5];

    @ObfuscatedName("client.os")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field497 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field498 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field404 = new int[5];

    @ObfuscatedName("client.of")
    public static int field500 = 0;

    @ObfuscatedName("client.oo")
    public static int field381 = 0;

    @ObfuscatedName("client.op")
    public static class16[] field394 = new class16[400];

    @ObfuscatedName("client.oa")
    public static class178 field503 = new class178();

    @ObfuscatedName("client.ou")
    public static int field493 = 0;

    @ObfuscatedName("client.oj")
    public static class8[] field508 = new class8[400];

    @ObfuscatedName("client.oz")
    public static class162 field339 = new class162();

    @ObfuscatedName("client.oc")
    public static int field366 = -1;

    @ObfuscatedName("client.ox")
    public static int field427 = -1;

    @ObfuscatedName("client.oh")
    public static class203[] field507 = new class203[6];

    @ObfuscatedName("client.f(I)V")
    public final void method169() {
    }

    public final void init() {
        if (!this.method2650()) {
            return;
        }
        class173[] var1 = class173.method1896();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2863);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2863)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                            field251 = true;
                        } else {
                            field251 = false;
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                        }
                        break;
                    case 3:
                        field400 = Integer.parseInt(var4);
                    case 4:
                    case 6:
                    case 12:
                    default:
                        break;
                    case 5:
                        Statics.field980 = var4;
                        break;
                    case 7:
                        field247 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field1941 = (class144) class100.method1415(class144.method2918(), Integer.parseInt(var4));
                        if (Statics.field1941 == class144.field2143) {
                            Statics.field250 = class195.field2927;
                        } else {
                            Statics.field250 = class195.field2934;
                        }
                        break;
                    case 9:
                        Statics.field1817 = Integer.parseInt(var4);
                        break;
                    case 10:
                        int var5 = Integer.parseInt(var4);
                        class143[] var6 = new class143[] { class143.field2134, class143.field2132, class143.field2130, class143.field2136 };
                        class143[] var7 = var6;
                        int var8 = 0;
                        class143 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class143 var9 = var7[var8];
                            if (var9.field2129 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field248 = var10;
                        break;
                    case 11:
                        field249 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field396 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field188 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field254 = var4;
                }
            }
        }
        class80.field1397 = false;
        field252 = false;
        Statics.field2717 = this.getCodeBase().getHost();
        String var11 = Statics.field248.field2133;
        byte var12 = 0;
        try {
            Statics.field2099 = 16;
            Statics.field2096 = var12;
            try {
                Statics.field1910 = System.getProperty("os.name");
            } catch (Exception var37) {
                Statics.field1910 = "Unknown";
            }
            Statics.field2106 = Statics.field1910.toLowerCase();
            try {
                Statics.field2858 = System.getProperty("user.home");
                if (Statics.field2858 != null) {
                    Statics.field2858 = Statics.field2858 + "/";
                }
            } catch (Exception var36) {
            }
            try {
                if (Statics.field2106.startsWith("win")) {
                    if (Statics.field2858 == null) {
                        Statics.field2858 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2858 == null) {
                    Statics.field2858 = System.getenv("HOME");
                }
                if (Statics.field2858 != null) {
                    Statics.field2858 = Statics.field2858 + "/";
                }
            } catch (Exception var35) {
            }
            if (Statics.field2858 == null) {
                Statics.field2858 = "~/";
            }
            Statics.field512 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2858, "/tmp/", "" };
            Statics.field2954 = new String[] { ".jagex_cache_" + Statics.field2096, ".file_store_" + Statics.field2096 };
            label163: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field3044 = class140.method317("oldschool", var11, var16);
                if (!Statics.field3044.exists()) {
                    Statics.field3044.mkdirs();
                }
                File[] var17 = Statics.field3044.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label163;
                    }
                    File var20 = var18[var19];
                    boolean var23;
                    try {
                        RandomAccessFile var21 = new RandomAccessFile(var20, "rw");
                        int var22 = var21.read();
                        var21.seek(0L);
                        var21.write(var22);
                        var21.seek(0L);
                        var21.close();
                        var23 = true;
                    } catch (Exception var34) {
                        var23 = false;
                    }
                    if (!var23) {
                        break;
                    }
                    var19++;
                }
            }
            class126.method166(Statics.field3044);
            try {
                File var25 = new File(Statics.field2858, "random.dat");
                if (var25.exists()) {
                    class140.field2101 = new class210(new class209(var25, "rw", 25L), 24, 0);
                } else {
                    label142: for (int var26 = 0; var26 < Statics.field2954.length; var26++) {
                        for (int var27 = 0; var27 < Statics.field512.length; var27++) {
                            File var28 = new File(Statics.field512[var27] + Statics.field2954[var26] + File.separatorChar + "random.dat");
                            if (var28.exists()) {
                                class140.field2101 = new class210(new class209(var28, "rw", 25L), 24, 0);
                                break label142;
                            }
                        }
                    }
                }
                if (class140.field2101 == null) {
                    RandomAccessFile var29 = new RandomAccessFile(var25, "rw");
                    int var30 = var29.read();
                    var29.seek(0L);
                    var29.write(var30);
                    var29.seek(0L);
                    var29.close();
                    class140.field2101 = new class210(new class209(var25, "rw", 25L), 24, 0);
                }
            } catch (IOException var38) {
            }
            class140.field2104 = new class210(new class209(class126.method2092("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class140.field2098 = new class210(new class209(class126.method2092("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field536 = new class210[Statics.field2099];
            for (int var32 = 0; var32 < Statics.field2099; var32++) {
                Statics.field536[var32] = new class210(new class209(class126.method2092("main_file_cache.idx" + var32), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var39) {
            class139.method2439((String) null, var39);
        }
        Statics.field3035 = this;
        this.method2648(765, 503, 75);
    }

    @ObfuscatedName("client.l(B)V")
    public final void method171() {
        Statics.field240 = field249 == 0 ? 43594 : field400 + 40000;
        Statics.field1932 = field249 == 0 ? 443 : field400 + 50000;
        Statics.field285 = Statics.field240;
        Statics.field2704 = class158.field2673;
        Statics.field2700 = class158.field2676;
        Statics.field153 = class158.field2675;
        Statics.field2701 = class158.field2678;
        class128.method586();
        Statics.method2098(Statics.field231);
        class131.method2503(Statics.field231);
        class136 var1;
        try {
            var1 = new class136();
        } catch (Throwable var14) {
            var1 = null;
        }
        Statics.field2498 = var1;
        if (Statics.field2498 != null) {
            Statics.field2498.method2477(Statics.field231);
        }
        Statics.field1282 = new class125(255, class140.field2104, class140.field2098, 500000);
        class209 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class140.method2484("", Statics.field1941.field2144, false);
            byte[] var5 = new byte[(int) var3.method3587()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3583(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class110(var5));
        } catch (Exception var15) {
        }
        try {
            if (var3 != null) {
                var3.method3579();
            }
        } catch (Exception var13) {
        }
        Statics.field152 = var4;
        Statics.field510 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field793;
        class129.field1999 = this;
        class129.field2003 = var12;
        if (field249 != 0) {
            field382 = true;
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method465() {
        field257++;
        this.method175();
        while (true) {
            class182 var1 = class154.field2513;
            class153 var2;
            synchronized (class154.field2513) {
                var2 = (class153) class154.field2512.method3299();
            }
            if (var2 == null) {
                try {
                    if (class166.field2737 == 1) {
                        int var4 = Statics.field2736.method3206();
                        if (var4 > 0 && Statics.field2736.method3119()) {
                            int var5 = var4 - Statics.field2738;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2736.method3113(var5);
                        } else {
                            Statics.field2736.method3157();
                            Statics.field2736.method3169();
                            if (Statics.field1666 == null) {
                                class166.field2737 = 0;
                            } else {
                                class166.field2737 = 2;
                            }
                            Statics.field2688 = null;
                            Statics.field75 = null;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                    Statics.field2736.method3157();
                    class166.field2737 = 0;
                    Statics.field2688 = null;
                    Statics.field75 = null;
                    Statics.field1666 = null;
                }
                method69();
                class128.method476();
                class131 var7 = class131.field2017;
                synchronized (class131.field2017) {
                    class131.field2018 = class131.field2015;
                    class131.field2019 = class131.field2016;
                    class131.field2020 = class131.field2014;
                    class131.field2025 = class131.field2030;
                    class131.field2026 = class131.field2022;
                    class131.field2027 = class131.field2028;
                    class131.field2021 = class131.field2024;
                    class131.field2030 = 0;
                }
                if (Statics.field2498 != null) {
                    int var9 = Statics.field2498.method2482();
                    field485 = var9;
                }
                if (field255 == 0) {
                    method2467();
                    class135.method156();
                } else if (field255 == 5) {
                    class29.method823(this);
                    method2467();
                    class135.method156();
                } else if (field255 == 10 || field255 == 11) {
                    class29.method823(this);
                } else if (field255 == 20) {
                    class29.method823(this);
                    method1985();
                } else if (field255 == 25) {
                    method2960();
                }
                if (field255 == 30) {
                    method2514();
                } else if (field255 == 40 || field255 == 45) {
                    method1985();
                }
                return;
            }
            var2.field2502.method2867(var2.field2506, (int) var2.field2911, var2.field2504, false);
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method173() {
        boolean var1 = class166.method1422();
        if (var1 && field269 && Statics.field197 != null) {
            Statics.field197.method999();
        }
        if (field2062) {
            class128.method2721(Statics.field231);
            Canvas var2 = Statics.field231;
            var2.removeMouseListener(class131.field2017);
            var2.removeMouseMotionListener(class131.field2017);
            var2.removeFocusListener(class131.field2017);
            class131.field2015 = 0;
            if (Statics.field2498 != null) {
                Statics.field2498.method2476(Statics.field231);
            }
            this.method2649();
            Statics.method2098(Statics.field231);
            class131.method2503(Statics.field231);
            if (Statics.field2498 != null) {
                Statics.field2498.method2477(Statics.field231);
            }
        }
        if (field255 == 0) {
            class135.method2090(class29.field665, class29.field679, (Color) null);
        } else if (field255 == 5) {
            class29.method845(Statics.field2683, Statics.field660);
        } else if (field255 == 10 || field255 == 11) {
            class29.method845(Statics.field2683, Statics.field660);
        } else if (field255 == 20) {
            class29.method845(Statics.field2683, Statics.field660);
        } else if (field255 == 25) {
            if (field378 == 1) {
                if (field302 > field481) {
                    field481 = field302;
                }
                int var3 = (field481 * 50 - field302 * 50) / field481;
                method797(class147.field2170 + class2.field32 + class2.field24 + var3 + "%" + class2.field22, false);
            } else if (field378 == 2) {
                if (field341 > field305) {
                    field305 = field341;
                }
                int var4 = (field305 * 50 - field341 * 50) / field305 + 50;
                method797(class147.field2170 + class2.field32 + class2.field24 + var4 + "%" + class2.field22, false);
            } else {
                method797(class147.field2170, false);
            }
        } else if (field255 == 30) {
            method71();
        } else if (field255 == 40) {
            method797(class147.field2271 + class2.field32 + class147.field2400, false);
        } else if (field255 == 45) {
            method797(class147.field2319, false);
        }
        if (field255 == 30 && field322 == 0 && !field2066) {
            try {
                Graphics var5 = Statics.field231.getGraphics();
                for (int var6 = 0; var6 < field502; var6++) {
                    if (field456[var6]) {
                        Statics.field1913.method1347(var5, field458[var6], field459[var6], field460[var6], field461[var6]);
                        field456[var6] = false;
                    }
                }
            } catch (Exception var12) {
                Statics.field231.repaint();
            }
        } else if (field255 > 0) {
            try {
                Graphics var8 = Statics.field231.getGraphics();
                Statics.field1913.method1346(var8, 0, 0);
                field2066 = false;
                for (int var9 = 0; var9 < field502; var9++) {
                    field456[var9] = false;
                }
            } catch (Exception var11) {
                Statics.field231.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method174() {
        if (Statics.field199 != null) {
            Statics.field199.field179 = false;
        }
        Statics.field199 = null;
        if (Statics.field619 != null) {
            Statics.field619.method2625();
            Statics.field619 = null;
        }
        if (class128.field1990 != null) {
            class128 var1 = class128.field1990;
            synchronized (class128.field1990) {
                class128.field1990 = null;
            }
        }
        if (class131.field2017 != null) {
            class131 var3 = class131.field2017;
            synchronized (class131.field2017) {
                class131.field2017 = null;
            }
        }
        Statics.field2498 = null;
        if (Statics.field197 != null) {
            Statics.field197.method1012();
        }
        if (Statics.field1886 != null) {
            Statics.field1886.method1012();
        }
        if (Statics.field2536 != null) {
            Statics.field2536.method2625();
        }
        class154.method2748();
        try {
            class140.field2104.method3597();
            for (int var5 = 0; var5 < Statics.field2099; var5++) {
                Statics.field536[var5].method3597();
            }
            class140.field2098.method3597();
            class140.field2101.method3597();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("w.y(IB)V")
    public static void method500(int arg0) {
        if (field255 == arg0) {
            return;
        }
        if (field255 == 0) {
            class135.method1798();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field437 = 0;
            field282 = 0;
            field281 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field527 != null) {
            Statics.field527.method2625();
            Statics.field527 = null;
        }
        if (field255 == 25) {
            field378 = 0;
            field302 = 0;
            field481 = 1;
            field341 = 0;
            field305 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method515(Statics.field231, Statics.field549, Statics.field504, true, 0);
        } else if (arg0 == 20) {
            class29.method515(Statics.field231, Statics.field549, Statics.field504, true, field255 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method515(Statics.field231, Statics.field549, Statics.field504, false, 4);
        } else {
            class29.method503();
        }
        field255 = arg0;
    }

    @ObfuscatedName("client.m(B)V")
    public void method175() {
        if (field255 == 1000) {
            return;
        }
        long var1 = class106.method487();
        int var3 = (int) (var1 - Statics.field2535);
        Statics.field2535 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class155.field2517 += var3;
        boolean var4;
        if (class155.field2516 == 0 && class155.field2522 == 0 && class155.field2525 == 0 && class155.field2520 == 0) {
            var4 = true;
        } else if (Statics.field2536 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class155.field2517 > 30000) {
                        throw new IOException();
                    }
                    while (class155.field2522 < 20 && class155.field2520 > 0) {
                        class156 var5 = (class156) class155.field2527.method3269();
                        class110 var6 = new class110(4);
                        var6.method2263(1);
                        var6.method2149((int) var5.field2911);
                        Statics.field2536.method2628(var6.field1853, 0, 4);
                        class155.field2531.method3282(var5, var5.field2911);
                        class155.field2520--;
                        class155.field2522++;
                    }
                    while (class155.field2516 < 20 && class155.field2525 > 0) {
                        class156 var7 = (class156) class155.field2523.method3351();
                        class110 var8 = new class110(4);
                        var8.method2263(0);
                        var8.method2149((int) var7.field2911);
                        Statics.field2536.method2628(var8.field1853, 0, 4);
                        var7.method3371();
                        class155.field2518.method3282(var7, var7.field2911);
                        class155.field2525--;
                        class155.field2516++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2536.method2626();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class155.field2517 = 0;
                        byte var11 = 0;
                        if (Statics.field2084 == null) {
                            var11 = 8;
                        } else if (class155.field2528 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class155.field2529.field1847;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2536.method2627(class155.field2529.field1853, class155.field2529.field1847, var12);
                            if (class155.field2534 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class155.field2529.field1853[class155.field2529.field1847 + var13] ^= class155.field2534;
                                }
                            }
                            class155.field2529.field1847 += var12;
                            if (class155.field2529.field1847 < var11) {
                                break;
                            }
                            if (Statics.field2084 == null) {
                                class155.field2529.field1847 = 0;
                                int var14 = class155.field2529.method2257();
                                int var15 = class155.field2529.method2194();
                                int var16 = class155.field2529.method2257();
                                int var17 = class155.field2529.method2297();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class155.field2531.method3274(var18);
                                Statics.field2526 = true;
                                if (var20 == null) {
                                    var20 = (class156) class155.field2518.method3274(var18);
                                    Statics.field2526 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2084 = var20;
                                Statics.field2530 = new class110(var17 + var21 + Statics.field2084.field2541);
                                Statics.field2530.method2263(var16);
                                Statics.field2530.method2260(var17);
                                class155.field2528 = 8;
                                class155.field2529.field1847 = 0;
                            } else if (class155.field2528 == 0) {
                                if (class155.field2529.field1853[0] == -1) {
                                    class155.field2528 = 1;
                                    class155.field2529.field1847 = 0;
                                } else {
                                    Statics.field2084 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2530.field1853.length - Statics.field2084.field2541;
                            int var23 = 512 - class155.field2528;
                            if (var23 > var22 - Statics.field2530.field1847) {
                                var23 = var22 - Statics.field2530.field1847;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2536.method2627(Statics.field2530.field1853, Statics.field2530.field1847, var23);
                            if (class155.field2534 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2530.field1853[Statics.field2530.field1847 + var24] ^= class155.field2534;
                                }
                            }
                            Statics.field2530.field1847 += var23;
                            class155.field2528 += var23;
                            if (Statics.field2530.field1847 == var22) {
                                if (Statics.field2084.field2911 == 16711935L) {
                                    Statics.field1 = Statics.field2530;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class155.field2533[var25];
                                        if (var26 != null) {
                                            Statics.field1.field1847 = var25 * 8 + 5;
                                            int var27 = Statics.field1.method2297();
                                            int var28 = Statics.field1.method2297();
                                            var26.method2865(var27, var28);
                                        }
                                    }
                                } else {
                                    class155.field2532.reset();
                                    class155.field2532.update(Statics.field2530.field1853, 0, var22);
                                    int var29 = (int) class155.field2532.getValue();
                                    if (Statics.field2084.field2538 != var29) {
                                        try {
                                            Statics.field2536.method2625();
                                        } catch (Exception var35) {
                                        }
                                        class155.field2519++;
                                        Statics.field2536 = null;
                                        class155.field2534 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class155.field2519 = 0;
                                    class155.field2521 = 0;
                                    Statics.field2084.field2540.method2866((int) (Statics.field2084.field2911 & 0xFFFFL), Statics.field2530.field1853, (Statics.field2084.field2911 & 0xFF0000L) == 16711680L, Statics.field2526);
                                }
                                Statics.field2084.method3392();
                                if (Statics.field2526) {
                                    class155.field2522--;
                                } else {
                                    class155.field2516--;
                                }
                                class155.field2528 = 0;
                                Statics.field2084 = null;
                                Statics.field2530 = null;
                            } else {
                                if (class155.field2528 != 512) {
                                    break;
                                }
                                class155.field2528 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2536.method2625();
                } catch (Exception var34) {
                }
                class155.field2521++;
                Statics.field2536 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method176();
        }
    }

    @ObfuscatedName("client.o(I)V")
    public void method176() {
        if (class155.field2519 >= 4) {
            this.method2660("js5crc");
            field255 = 1000;
            return;
        }
        if (class155.field2521 >= 4) {
            if (field255 <= 5) {
                this.method2660("js5io");
                field255 = 1000;
                return;
            }
            field277 = 3000;
            class155.field2521 = 3;
        }
        if (--field277 + 1 > 0) {
            return;
        }
        try {
            if (field276 == 0) {
                Statics.field2426 = Statics.field1950.method2528(Statics.field2717, Statics.field285);
                field276++;
            }
            if (field276 == 1) {
                if (Statics.field2426.field2078 == 2) {
                    this.method177(-1);
                    return;
                }
                if (Statics.field2426.field2078 == 1) {
                    field276++;
                }
            }
            if (field276 == 2) {
                Statics.field1001 = new class134((Socket) Statics.field2426.field2079, Statics.field1950);
                class110 var1 = new class110(5);
                var1.method2263(15);
                var1.method2260(75);
                Statics.field1001.method2628(var1.field1853, 0, 5);
                field276++;
                Statics.field167 = class106.method487();
            }
            if (field276 == 3) {
                if (field255 <= 5 || Statics.field1001.method2626() > 0) {
                    int var2 = Statics.field1001.method2624();
                    if (var2 != 0) {
                        this.method177(var2);
                        return;
                    }
                    field276++;
                } else if (class106.method487() - Statics.field167 > 30000L) {
                    this.method177(-2);
                    return;
                }
            }
            if (field276 == 4) {
                class155.method1997(Statics.field1001, field255 > 20);
                Statics.field2426 = null;
                Statics.field1001 = null;
                field276 = 0;
                field280 = 0;
            }
        } catch (IOException var4) {
            this.method177(-3);
        }
    }

    @ObfuscatedName("client.c(II)V")
    public void method177(int arg0) {
        Statics.field2426 = null;
        Statics.field1001 = null;
        field276 = 0;
        if (Statics.field285 == Statics.field240) {
            Statics.field285 = Statics.field1932;
        } else {
            Statics.field285 = Statics.field240;
        }
        field280++;
        if (field280 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field255 <= 5) {
                this.method2660("js5connect_full");
                field255 = 1000;
            } else {
                field277 = 3000;
            }
        } else if (field280 >= 2 && arg0 == 6) {
            this.method2660("js5connect_outofdate");
            field255 = 1000;
        } else if (field280 >= 4) {
            if (field255 <= 5) {
                this.method2660("js5connect");
                field255 = 1000;
            } else {
                field277 = 3000;
            }
        }
    }

    @ObfuscatedName("da.r(I)V")
    public static void method2467() {
        if (field275 == 0) {
            Statics.field186 = new class80(4, 104, 104, class6.field90);
            for (int var0 = 0; var0 < 4; var0++) {
                field307[var0] = new class211(104, 104);
            }
            Statics.field158 = new class73(512, 512);
            class29.field679 = class147.field2178;
            class29.field665 = 5;
            field275 = 20;
        } else if (field275 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1468[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1780(var1, 500, 800, 512, 334);
            class29.field679 = class147.field2174;
            class29.field665 = 10;
            field275 = 30;
        } else if (field275 == 30) {
            Statics.field1267 = method1995(0, false, true, true);
            Statics.field647 = method1995(1, false, true, true);
            Statics.field2735 = method1995(2, true, false, true);
            Statics.field1512 = method1995(3, false, true, true);
            Statics.field1080 = method1995(4, false, true, true);
            Statics.field173 = method1995(5, true, true, true);
            Statics.field929 = method1995(6, true, true, false);
            Statics.field61 = method1995(7, false, true, true);
            Statics.field504 = method1995(8, false, true, true);
            Statics.field1820 = method1995(9, false, true, true);
            Statics.field549 = method1995(10, false, true, true);
            Statics.field890 = method1995(11, false, true, true);
            Statics.field1281 = method1995(12, false, true, true);
            Statics.field930 = method1995(13, true, false, true);
            Statics.field2924 = method1995(14, false, true, false);
            Statics.field279 = method1995(15, false, true, true);
            class29.field679 = class147.field2175;
            class29.field665 = 20;
            field275 = 40;
        } else if (field275 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1267.method2891() * 4 / 100;
            int var8 = var7 + Statics.field647.method2891() * 4 / 100;
            int var9 = var8 + Statics.field2735.method2891() * 2 / 100;
            int var10 = var9 + Statics.field1512.method2891() * 2 / 100;
            int var11 = var10 + Statics.field1080.method2891() * 6 / 100;
            int var12 = var11 + Statics.field173.method2891() * 4 / 100;
            int var13 = var12 + Statics.field929.method2891() * 2 / 100;
            int var14 = var13 + Statics.field61.method2891() * 60 / 100;
            int var15 = var14 + Statics.field504.method2891() * 2 / 100;
            int var16 = var15 + Statics.field1820.method2891() * 2 / 100;
            int var17 = var16 + Statics.field549.method2891() * 2 / 100;
            int var18 = var17 + Statics.field890.method2891() * 2 / 100;
            int var19 = var18 + Statics.field1281.method2891() * 2 / 100;
            int var20 = var19 + Statics.field930.method2891() * 2 / 100;
            int var21 = var20 + Statics.field2924.method2891() * 2 / 100;
            int var22 = var21 + Statics.field279.method2891() * 2 / 100;
            if (var22 == 100) {
                class29.field679 = class147.field2177;
                class29.field665 = 30;
                field275 = 45;
            } else {
                if (var22 != 0) {
                    class29.field679 = class147.field2207 + var22 + "%";
                }
                class29.field665 = 30;
            }
        } else if (field275 == 45) {
            boolean var23 = !field252;
            Statics.field1819 = 22050;
            Statics.field1078 = var23;
            Statics.field2844 = 2;
            class167 var24 = new class167();
            var24.method3117(9, 128);
            Statics.field197 = class51.method1996(Statics.field1950, Statics.field231, 0, 22050);
            Statics.field197.method996(var24);
            class166.method540(Statics.field279, Statics.field2924, Statics.field1080, var24);
            Statics.field1886 = class51.method1996(Statics.field1950, Statics.field231, 1, 2048);
            Statics.field1345 = new class50();
            Statics.field1886.method996(Statics.field1345);
            Statics.field1832 = new class69(22050, Statics.field1819);
            class29.field679 = class147.field2310;
            class29.field665 = 35;
            field275 = 50;
        } else if (field275 == 50) {
            int var25 = 0;
            if (Statics.field660 == null) {
                class152 var26 = Statics.field504;
                class152 var27 = Statics.field930;
                int var28 = var26.method2799("p11_full");
                int var29 = var26.method2841(var28, "");
                class207 var30 = class71.method543(var26, var27, var28, var29);
                Statics.field660 = var30;
            } else {
                var25++;
            }
            if (Statics.field2094 == null) {
                class152 var31 = Statics.field504;
                class152 var32 = Statics.field930;
                int var33 = var31.method2799("p12_full");
                int var34 = var31.method2841(var33, "");
                class207 var35 = class71.method543(var31, var32, var33, var34);
                Statics.field2094 = var35;
            } else {
                var25++;
            }
            if (Statics.field2683 == null) {
                class152 var36 = Statics.field504;
                class152 var37 = Statics.field930;
                int var38 = var36.method2799("b12_full");
                int var39 = var36.method2841(var38, "");
                class207 var40 = class71.method543(var36, var37, var38, var39);
                Statics.field2683 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class29.field679 = class147.field2353 + var25 * 100 / 3 + "%";
                class29.field665 = 40;
            } else {
                Statics.field183 = new class150(true);
                class29.field679 = class147.field2180;
                class29.field665 = 40;
                field275 = 60;
            }
        } else if (field275 == 60) {
            class152 var41 = Statics.field549;
            class152 var42 = Statics.field504;
            int var43 = 0;
            if (var41.method2802("title.jpg", "")) {
                var43++;
            }
            if (var42.method2802("logo", "")) {
                var43++;
            }
            if (var42.method2802("titlebox", "")) {
                var43++;
            }
            if (var42.method2802("titlebutton", "")) {
                var43++;
            }
            if (var42.method2802("runes", "")) {
                var43++;
            }
            if (var42.method2802("title_mute", "")) {
                var43++;
            }
            if (var42.method2792("options_radio_buttons,0")) {
                var43++;
            }
            if (var42.method2792("options_radio_buttons,2")) {
                var43++;
            }
            var42.method2802("sl_back", "");
            var42.method2802("sl_flags", "");
            var42.method2802("sl_arrows", "");
            var42.method2802("sl_stars", "");
            var42.method2802("sl_button", "");
            int var46 = class29.method530();
            if (var43 < var46) {
                class29.field679 = class147.field2181 + var43 * 100 / var46 + "%";
                class29.field665 = 50;
            } else {
                class29.field679 = class147.field2182;
                class29.field665 = 50;
                method500(5);
                field275 = 70;
            }
        } else if (field275 == 70) {
            if (Statics.field2735.method2834()) {
                class152 var47 = Statics.field2735;
                Statics.field969 = var47;
                class38.method20(Statics.field2735);
                class152 var48 = Statics.field2735;
                class152 var49 = Statics.field61;
                Statics.field955 = var48;
                Statics.field2685 = var49;
                Statics.field952 = Statics.field955.method2794(3);
                class152 var50 = Statics.field2735;
                class152 var51 = Statics.field61;
                boolean var52 = field252;
                Statics.field2955 = var50;
                Statics.field840 = var51;
                class37.field876 = var52;
                class36.method542(Statics.field2735, Statics.field61);
                class46.method735(Statics.field2735, Statics.field61, field251, Statics.field660);
                class39.method2966(Statics.field2735, Statics.field1267, Statics.field647);
                class152 var53 = Statics.field2735;
                class152 var54 = Statics.field61;
                Statics.field928 = var53;
                Statics.field937 = var54;
                class43.method1986(Statics.field2735);
                class152 var55 = Statics.field2735;
                Statics.field1063 = var55;
                Statics.field1058 = Statics.field1063.method2794(16);
                class152 var56 = Statics.field1512;
                class152 var57 = Statics.field61;
                class152 var58 = Statics.field504;
                class152 var59 = Statics.field930;
                Statics.field2543 = var56;
                Statics.field2666 = var57;
                Statics.field1113 = var58;
                Statics.field2570 = var59;
                Statics.field2658 = new class157[Statics.field2543.method2795()][];
                Statics.field1906 = new boolean[Statics.field2543.method2795()];
                class152 var60 = Statics.field2735;
                Statics.field997 = var60;
                class152 var61 = Statics.field2735;
                Statics.field990 = var61;
                class29.field679 = class147.field2184;
                class29.field665 = 60;
                field275 = 80;
            } else {
                class29.field679 = class147.field2230 + Statics.field2735.method2869() + "%";
                class29.field665 = 60;
            }
        } else if (field275 == 80) {
            int var62 = 0;
            if (Statics.field69 == null) {
                class152 var63 = Statics.field504;
                int var64 = var63.method2799("compass");
                int var65 = var63.method2841(var64, "");
                class73 var66;
                if (class71.method610(var63, var64, var65)) {
                    var66 = class71.method111();
                } else {
                    var66 = null;
                }
                Statics.field69 = var66;
            } else {
                var62++;
            }
            if (Statics.field1857 == null) {
                class152 var68 = Statics.field504;
                int var69 = var68.method2799("mapedge");
                int var70 = var68.method2841(var69, "");
                class73 var71;
                if (class71.method610(var68, var69, var70)) {
                    var71 = class71.method111();
                } else {
                    var71 = null;
                }
                Statics.field1857 = var71;
            } else {
                var62++;
            }
            if (Statics.field1690 == null) {
                Statics.field1690 = class71.method2462(Statics.field504, "mapscene", "");
            } else {
                var62++;
            }
            if (Statics.field1868 == null) {
                Statics.field1868 = class71.method1894(Statics.field504, "mapfunction", "");
            } else {
                var62++;
            }
            if (Statics.field1456 == null) {
                Statics.field1456 = class71.method1894(Statics.field504, "hitmarks", "");
            } else {
                var62++;
            }
            if (Statics.field797 == null) {
                Statics.field797 = class71.method1894(Statics.field504, "headicons_pk", "");
            } else {
                var62++;
            }
            if (Statics.field2007 == null) {
                Statics.field2007 = class71.method1894(Statics.field504, "headicons_prayer", "");
            } else {
                var62++;
            }
            if (Statics.field1287 == null) {
                Statics.field1287 = class71.method1894(Statics.field504, "headicons_hint", "");
            } else {
                var62++;
            }
            if (Statics.field324 == null) {
                Statics.field324 = class71.method1894(Statics.field504, "mapmarker", "");
            } else {
                var62++;
            }
            if (Statics.field1816 == null) {
                Statics.field1816 = class71.method1894(Statics.field504, "cross", "");
            } else {
                var62++;
            }
            if (Statics.field1247 == null) {
                Statics.field1247 = class71.method1894(Statics.field504, "mapdots", "");
            } else {
                var62++;
            }
            if (Statics.field731 == null) {
                Statics.field731 = class71.method2462(Statics.field504, "scrollbar", "");
            } else {
                var62++;
            }
            if (Statics.field1925 == null) {
                Statics.field1925 = class71.method2462(Statics.field504, "mod_icons", "");
            } else {
                var62++;
            }
            if (Statics.field1457 == null) {
                Statics.field1457 = class71.method126(Statics.field504, "mapback", "");
            } else {
                var62++;
            }
            if (var62 < 14) {
                class29.field679 = class147.field2185 + var62 * 100 / 14 + "%";
                class29.field665 = 70;
            } else {
                Statics.field2992 = Statics.field1925;
                Statics.field1857.method1472();
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 41.0D) - 20;
                for (int var77 = 0; var77 < Statics.field1868.length; var77++) {
                    Statics.field1868[var77].method1467(var73 + var76, var74 + var76, var75 + var76);
                }
                Statics.field1690[0].method1580(var73 + var76, var74 + var76, var75 + var76);
                method75();
                class29.field679 = class147.field2186;
                class29.field665 = 70;
                field275 = 90;
            }
        } else if (field275 == 90) {
            if (Statics.field1820.method2834()) {
                class89 var78 = new class89(Statics.field1820, Statics.field504, 20, 0.8D, field252 ? 64 : 128);
                class85.method1838(var78);
                class85.method1805(0.8D);
                class29.field679 = class147.field2188;
                class29.field665 = 90;
                field275 = 110;
            } else {
                class29.field679 = class147.field2295 + Statics.field1820.method2869() + "%";
                class29.field665 = 90;
            }
        } else if (field275 == 110) {
            Statics.field199 = new class12();
            Statics.field1950.method2547(Statics.field199, 10);
            class29.field679 = class147.field2189;
            class29.field665 = 94;
            field275 = 120;
        } else if (field275 == 120) {
            if (Statics.field549.method2802("huffman", "")) {
                class104 var79 = new class104(Statics.field549.method2801("huffman", ""));
                Statics.field2937 = var79;
                class29.field679 = class147.field2191;
                class29.field665 = 96;
                field275 = 130;
            } else {
                class29.field679 = class147.field2190 + "%";
                class29.field665 = 96;
            }
        } else if (field275 == 130) {
            if (!Statics.field1512.method2834()) {
                class29.field679 = class147.field2192 + Statics.field1512.method2869() * 4 / 5 + "%";
                class29.field665 = 100;
            } else if (!Statics.field1281.method2834()) {
                class29.field679 = class147.field2192 + (80 + Statics.field1281.method2869() / 6) + "%";
                class29.field665 = 100;
            } else if (Statics.field930.method2834()) {
                class29.field679 = class147.field2193;
                class29.field665 = 100;
                field275 = 140;
            } else {
                class29.field679 = class147.field2192 + (96 + Statics.field930.method2869() / 20) + "%";
                class29.field665 = 100;
            }
        } else if (field275 == 140) {
            method500(10);
        }
    }

    @ObfuscatedName("ca.s(IZZZI)Lei;")
    public static class152 method1995(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class125 var4 = null;
        if (class140.field2104 != null) {
            var4 = new class125(arg0, class140.field2104, Statics.field536[arg0], 1000000);
        }
        return new class152(var4, Statics.field1282, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.n(I)V")
    public static void method75() {
        Statics.field1490 = new int[33];
        Statics.field537 = new int[33];
        Statics.field97 = new int[151];
        Statics.field2952 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field1457.field1318[Statics.field1457.field1321 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1490[var0] = var1;
            Statics.field537[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field1457.field1318[Statics.field1457.field1321 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field97[var4 - 5] = var5 - 25;
            Statics.field2952[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("ce.q(I)V")
    public static final void method1985() {
        try {
            if (field437 == 0) {
                if (Statics.field619 != null) {
                    Statics.field619.method2625();
                    Statics.field619 = null;
                }
                Statics.field216 = null;
                field399 = false;
                field282 = 0;
                field437 = 1;
            }
            if (field437 == 1) {
                if (Statics.field216 == null) {
                    Statics.field216 = Statics.field1950.method2528(Statics.field2717, Statics.field285);
                }
                if (Statics.field216.field2078 == 2) {
                    throw new IOException();
                }
                if (Statics.field216.field2078 == 1) {
                    Statics.field619 = new class134((Socket) Statics.field216.field2079, Statics.field1950);
                    Statics.field216 = null;
                    field437 = 2;
                }
            }
            if (field437 == 2) {
                field289.field1847 = 0;
                field289.method2263(14);
                Statics.field619.method2628(field289.field1853, 0, 1);
                field412.field1847 = 0;
                field437 = 3;
            }
            if (field437 == 3) {
                if (Statics.field197 != null) {
                    Statics.field197.method998();
                }
                if (Statics.field1886 != null) {
                    Statics.field1886.method998();
                }
                int var0 = Statics.field619.method2624();
                if (Statics.field197 != null) {
                    Statics.field197.method998();
                }
                if (Statics.field1886 != null) {
                    Statics.field1886.method998();
                }
                if (var0 != 0) {
                    method1792(var0);
                    return;
                }
                field412.field1847 = 0;
                field437 = 5;
            }
            if (field437 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field289.field1847 = 0;
                field289.method2263(1);
                field289.method2263(class29.field682.method467());
                field289.method2260(var1[0]);
                field289.method2260(var1[1]);
                field289.method2260(var1[2]);
                field289.method2260(var1[3]);
                switch(class29.field682.field2424) {
                    case 0:
                    case 1:
                        field289.method2149(Statics.field697);
                        field289.field1847 += 5;
                        break;
                    case 2:
                        field289.method2260((Integer) Statics.field152.field136.get(class213.method2762(class29.field686)));
                        field289.field1847 += 4;
                        break;
                    case 3:
                        field289.field1847 += 8;
                }
                field289.method2152(class29.field673);
                field289.method2179(class5.field66, class5.field74);
                field290.field1847 = 0;
                if (field255 == 40) {
                    field290.method2263(18);
                } else {
                    field290.method2263(16);
                }
                field290.method2148(0);
                int var2 = field290.field1847;
                field290.method2260(75);
                field290.method2248(field289.field1853, 0, field289.field1847);
                int var3 = field290.field1847;
                field290.method2152(class29.field686);
                field290.method2263(field252 ? 1 : 0);
                class140.method607(field290);
                field290.method2152(Statics.field254);
                field290.method2260(Statics.field188);
                class110 var4 = new class110(Statics.field183.method2773());
                Statics.field183.method2775(var4);
                field290.method2248(var4.field1853, 0, var4.field1853.length);
                field290.method2263(Statics.field1817);
                field290.method2260(Statics.field1267.field2466);
                field290.method2260(Statics.field647.field2466);
                field290.method2260(Statics.field2735.field2466);
                field290.method2260(Statics.field1512.field2466);
                field290.method2260(Statics.field1080.field2466);
                field290.method2260(Statics.field173.field2466);
                field290.method2260(Statics.field929.field2466);
                field290.method2260(Statics.field61.field2466);
                field290.method2260(Statics.field504.field2466);
                field290.method2260(Statics.field1820.field2466);
                field290.method2260(Statics.field549.field2466);
                field290.method2260(Statics.field890.field2466);
                field290.method2260(Statics.field1281.field2466);
                field290.method2260(Statics.field930.field2466);
                field290.method2260(Statics.field2924.field2466);
                field290.method2260(Statics.field279.field2466);
                field290.method2232(var1, var3, field290.field1847);
                field290.method2157(field290.field1847 - var2);
                Statics.field619.method2628(field290.field1853, 0, field290.field1847);
                field289.method2397(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field412.method2397(var1);
                field437 = 6;
            }
            if (field437 == 6 && Statics.field619.method2626() > 0) {
                int var6 = Statics.field619.method2624();
                if (var6 == 21 && field255 == 20) {
                    field437 = 7;
                } else if (var6 == 2) {
                    field437 = 9;
                } else if (var6 == 15 && field255 == 40) {
                    Statics.method2413();
                    return;
                } else if (var6 == 23 && field281 < 1) {
                    field281++;
                    field437 = 0;
                } else {
                    method1792(var6);
                    return;
                }
            }
            if (field437 == 7 && Statics.field619.method2626() > 0) {
                field244 = (Statics.field619.method2624() + 3) * 60;
                field437 = 8;
            }
            if (field437 == 8) {
                field282 = 0;
                class29.method217(class147.field2197, class147.field2198, field244 / 60 + class147.field2247);
                if (--field244 <= 0) {
                    field437 = 0;
                }
            } else {
                if (field437 == 9 && Statics.field619.method2626() >= 13) {
                    boolean var7 = Statics.field619.method2624() == 1;
                    Statics.field619.method2627(field412.field1853, 0, 4);
                    field412.field1847 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field412.method2399() << 24;
                        int var10 = var9 | field412.method2399() << 16;
                        int var11 = var10 | field412.method2399() << 8;
                        int var12 = var11 | field412.method2399();
                        int var13 = class213.method2762(class29.field686);
                        if (Statics.field152.field136.size() >= 10 && !Statics.field152.field136.containsKey(var13)) {
                            Iterator var14 = Statics.field152.field136.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field152.field136.put(var13, var12);
                        class9.method1794();
                    }
                    field416 = Statics.field619.method2624();
                    field418 = Statics.field619.method2624() == 1;
                    field374 = Statics.field619.method2624();
                    field374 <<= 0x8;
                    field374 += Statics.field619.method2624();
                    field450 = Statics.field619.method2624();
                    Statics.field619.method2627(field412.field1853, 0, 1);
                    field412.field1847 = 0;
                    field293 = field412.method2399();
                    Statics.field619.method2627(field412.field1853, 0, 2);
                    field412.field1847 = 0;
                    field292 = field412.method2194();
                    if (field450 == 1) {
                        try {
                            client var15 = Statics.field3035;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var21) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field3035;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var20) {
                        }
                    }
                    field437 = 10;
                }
                if (field437 != 10) {
                    field282++;
                    if (field282 > 2000) {
                        if (field281 < 1) {
                            if (Statics.field285 == Statics.field240) {
                                Statics.field285 = Statics.field1932;
                            } else {
                                Statics.field285 = Statics.field240;
                            }
                            field281++;
                            field437 = 0;
                        } else {
                            method1792(-3);
                        }
                    }
                } else if (Statics.field619.method2626() >= field292) {
                    field412.field1847 = 0;
                    Statics.field619.method2627(field412.field1853, 0, field292);
                    method1880();
                    Statics.field608 = -1;
                    method2893(false);
                    field293 = -1;
                }
            }
        } catch (IOException var22) {
            if (field281 < 1) {
                if (Statics.field285 == Statics.field240) {
                    Statics.field285 = Statics.field1932;
                } else {
                    Statics.field285 = Statics.field240;
                }
                field281++;
                field437 = 0;
            } else {
                method1792(-2);
            }
        }
    }

    @ObfuscatedName("cv.e(B)V")
    public static void method1880() {
        field387 = 1L;
        field261 = -1;
        Statics.field199.field175 = 0;
        Statics.field2056 = true;
        field262 = true;
        field472 = -1L;
        class194.field2926 = new class185();
        field289.field1847 = 0;
        field412.field1847 = 0;
        field293 = -1;
        field297 = -1;
        field298 = -1;
        field466 = -1;
        field294 = 0;
        field264 = 0;
        field296 = 0;
        field265 = 0;
        field259 = 0;
        field390 = false;
        class131.field2013 = 0;
        class10.method511();
        field442 = 0;
        field453 = false;
        field488 = 0;
        field311 = (int) (Math.random() * 100.0D) - 50;
        field313 = (int) (Math.random() * 110.0D) - 55;
        field315 = (int) (Math.random() * 80.0D) - 40;
        field318 = (int) (Math.random() * 120.0D) - 60;
        field320 = (int) (Math.random() * 30.0D) - 20;
        field309 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field482 = 0;
        field475 = -1;
        field480 = 0;
        field332 = 0;
        field304 = class18.field525;
        field368 = 0;
        field287 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field367[var0] = null;
            field343[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field286[var1] = null;
        }
        Statics.field1508 = field367[2047] = new class3();
        field505 = -1;
        field384.method3297();
        field385.method3297();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field432[var2][var3][var4] = null;
                }
            }
        }
        field383 = new class182();
        field381 = 0;
        field500 = 0;
        field493 = 0;
        for (int var5 = 0; var5 < Statics.field1058; var5++) {
            class47 var6 = (class47) class47.field1060.method3231((long) var5);
            class47 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field1063.method2852(16, var5);
                class47 var9 = new class47();
                if (var8 != null) {
                    var9.method899(new class110(var8));
                }
                class47.field1060.method3228(var9, (long) var5);
                var7 = var9;
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                class159.field2681[var5] = 0;
                class159.field2680[var5] = 0;
            }
        }
        for (int var11 = 0; var11 < field446.length; var11++) {
            field446[var11] = -1;
        }
        field509 = -1;
        if (field409 != -1) {
            class157.method2704(field409);
        }
        for (class4 var12 = (class4) field431.method3269(); var12 != null; var12 = (class4) field431.method3270()) {
            method2539(var12, true);
        }
        field409 = -1;
        field431 = new class179(8);
        field401 = null;
        field390 = false;
        field259 = 0;
        field339.method2991((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field340[var13] = null;
            field379[var13] = false;
        }
        class14.method70();
        field256 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field455[var14] = true;
        }
        field473 = null;
        Statics.field1289 = 0;
        Statics.field578 = null;
        for (int var15 = 0; var15 < 6; var15++) {
            field507[var15] = new class203();
        }
        Statics.field12 = null;
    }

    @ObfuscatedName("ch.b(IB)V")
    public static void method1792(int arg0) {
        if (arg0 == -3) {
            class29.method217(class147.field2200, class147.field2201, class147.field2215);
        } else if (arg0 == -2) {
            class29.method217(class147.field2203, class147.field2204, class147.field2205);
        } else if (arg0 == -1) {
            class29.method217(class147.field2206, class147.field2374, class147.field2208);
        } else if (arg0 == 3) {
            class29.method217(class147.field2209, class147.field2210, class147.field2211);
        } else if (arg0 == 4) {
            class29.method217(class147.field2212, class147.field2213, class147.field2221);
        } else if (arg0 == 5) {
            class29.method217(class147.field2315, class147.field2227, class147.field2305);
        } else if (arg0 == 6) {
            class29.method217(class147.field2199, class147.field2214, class147.field2375);
        } else if (arg0 == 7) {
            class29.method217(class147.field2361, class147.field2335, class147.field2228);
        } else if (arg0 == 8) {
            class29.method217(class147.field2224, class147.field2225, class147.field2226);
        } else if (arg0 == 9) {
            class29.method217(class147.field2280, class147.field2340, class147.field2229);
        } else if (arg0 == 10) {
            class29.method217(class147.field2385, class147.field2311, class147.field2232);
        } else if (arg0 == 11) {
            class29.method217(class147.field2386, class147.field2234, class147.field2235);
        } else if (arg0 == 12) {
            class29.method217(class147.field2236, class147.field2162, class147.field2238);
        } else if (arg0 == 13) {
            class29.method217(class147.field2239, class147.field2240, class147.field2241);
        } else if (arg0 == 14) {
            class29.method217(class147.field2242, class147.field2243, class147.field2368);
        } else if (arg0 == 16) {
            class29.method217(class147.field2245, class147.field2290, class147.field2202);
        } else if (arg0 == 17) {
            class29.method217(class147.field2248, class147.field2249, class147.field2369);
        } else if (arg0 == 18) {
            class29.method217(class147.field2251, class147.field2252, class147.field2253);
        } else if (arg0 == 19) {
            class29.method217(class147.field2329, class147.field2331, class147.field2327);
        } else if (arg0 == 20) {
            class29.method217(class147.field2383, class147.field2260, class147.field2259);
        } else if (arg0 == 22) {
            class29.method217(class147.field2356, class147.field2261, class147.field2262);
        } else if (arg0 == 23) {
            class29.method217(class147.field2263, class147.field2264, class147.field2265);
        } else if (arg0 == 24) {
            class29.method217(class147.field2266, class147.field2267, class147.field2268);
        } else if (arg0 == 25) {
            class29.method217(class147.field2269, class147.field2179, class147.field2218);
        } else if (arg0 == 26) {
            class29.method217(class147.field2272, class147.field2409, class147.field2274);
        } else if (arg0 == 27) {
            class29.method217(class147.field2275, class147.field2276, class147.field2277);
        } else if (arg0 == 31) {
            class29.method217(class147.field2183, class147.field2351, class147.field2320);
        } else if (arg0 == 32) {
            class29.method217(class147.field2254, class147.field2288, class147.field2244);
        } else if (arg0 == 37) {
            class29.method217(class147.field2392, class147.field2187, class147.field2292);
        } else if (arg0 == 38) {
            class29.method217(class147.field2293, class147.field2294, class147.field2233);
        } else if (arg0 == 55) {
            class29.method217(class147.field2349, class147.field2297, class147.field2298);
        } else if (arg0 == 56) {
            class29.method217(class147.field2216, class147.field2300, class147.field2301);
            method500(11);
            return;
        } else if (arg0 == 57) {
            class29.method217(class147.field2302, class147.field2303, class147.field2304);
            method500(11);
            return;
        } else {
            class29.method217(class147.field2255, class147.field2306, class147.field2257);
        }
        method500(10);
    }

    @ObfuscatedName("fb.a(B)V")
    public static final void method2959() {
        if (Statics.field619 != null) {
            Statics.field619.method2625();
            Statics.field619 = null;
        }
        method1796();
        Statics.field186.method1616();
        for (int var0 = 0; var0 < 4; var0++) {
            field307[var0].method3633();
        }
        System.gc();
        class166.method2473(2);
        field464 = -1;
        field269 = false;
        for (class21 var1 = (class21) class21.field564.method3303(); var1 != null; var1 = (class21) class21.field564.method3305()) {
            if (var1.field557 != null) {
                Statics.field1345.method976(var1.field557);
                var1.field557 = null;
            }
            if (var1.field562 != null) {
                Statics.field1345.method976(var1.field562);
                var1.field562 = null;
            }
        }
        class21.field564.method3297();
        method500(10);
    }

    @ObfuscatedName("cj.i(B)V")
    public static final void method1796() {
        class42.method538();
        class38.method1605();
        class41.field953.method3229();
        class37.field850.method3229();
        class37.field842.method3229();
        class37.field879.method3229();
        class37.field844.method3229();
        class36.method2101();
        class46.field1008.method3229();
        class46.field1009.method3229();
        class46.field1041.method3229();
        class39.field907.method3229();
        class39.field920.method3229();
        class40.method2768();
        class43.method153();
        class47.method2583();
        class162.field2703.method3229();
        class157.method2609();
        ((class89) Statics.field1479).method1884();
        class19.field538.method3229();
        Statics.field1267.method2822();
        Statics.field647.method2822();
        Statics.field1512.method2822();
        Statics.field1080.method2822();
        Statics.field173.method2822();
        Statics.field929.method2822();
        Statics.field61.method2822();
        Statics.field504.method2822();
        Statics.field1820.method2822();
        Statics.field549.method2822();
        Statics.field890.method2822();
        Statics.field1281.method2822();
    }

    @ObfuscatedName("x.w(B)V")
    public static final void method509() {
        if (field296 > 0) {
            method2959();
        } else {
            method500(40);
            Statics.field527 = Statics.field619;
            Statics.field619 = null;
        }
    }

    @ObfuscatedName("dz.x(I)V")
    public static final void method2514() {
        if (field264 > 1) {
            field264--;
        }
        if (field296 > 0) {
            field296--;
        }
        if (field399) {
            field399 = false;
            method509();
            return;
        }
        if (!field390) {
            field476[0] = class147.field2397;
            field397[0] = "";
            field258[0] = 1006;
            field259 = 1;
        }
        for (int var0 = 0; var0 < 100 && method150(); var0++) {
        }
        if (field255 != 30) {
            return;
        }
        while (true) {
            class193 var1 = (class193) class194.field2926.method3343();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field199.field174;
                synchronized (Statics.field199.field174) {
                    if (!field245) {
                        Statics.field199.field175 = 0;
                    } else if (class131.field2025 != 0 || Statics.field199.field175 >= 40) {
                        field289.method2414(214);
                        field289.method2263(0);
                        int var5 = field289.field1847;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field199.field175 && field289.field1847 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field199.field177[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field199.field176[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field199.field177[var7] == -1 && Statics.field199.field176[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field410 != var9 || field260 != var8) {
                                int var11 = var9 - field410;
                                field410 = var9;
                                int var12 = var8 - field260;
                                field260 = var8;
                                if (field261 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field289.method2148((field261 << 12) + (var11 << 6) + var12);
                                    field261 = 0;
                                } else if (field261 < 8) {
                                    field289.method2149((field261 << 19) + 8388608 + var10);
                                    field261 = 0;
                                } else {
                                    field289.method2260((field261 << 19) + -1073741824 + var10);
                                    field261 = 0;
                                }
                            } else if (field261 < 2047) {
                                field261++;
                            }
                        }
                        field289.method2158(field289.field1847 - var5);
                        if (var6 >= Statics.field199.field175) {
                            Statics.field199.field175 = 0;
                        } else {
                            Statics.field199.field175 -= var6;
                            for (int var13 = 0; var13 < Statics.field199.field175; var13++) {
                                Statics.field199.field176[var13] = Statics.field199.field176[var6 + var13];
                                Statics.field199.field177[var13] = Statics.field199.field177[var6 + var13];
                            }
                        }
                    }
                }
                if (class131.field2025 == 1 || !Statics.field927 && class131.field2025 == 4 || class131.field2025 == 2) {
                    long var15 = (class131.field2021 - field387 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field387 = class131.field2021 * -1L;
                    int var17 = class131.field2027;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 502) {
                        var17 = 502;
                    }
                    int var18 = class131.field2026;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 764) {
                        var18 = 764;
                    }
                    int var19 = var17 * 765 + var18;
                    byte var20 = 0;
                    if (class131.field2025 == 2) {
                        var20 = 1;
                    }
                    int var21 = (int) var15;
                    field289.method2414(105);
                    field289.method2260((var20 << 19) + (var21 << 20) + var19);
                }
                if (class128.field1987 > 0) {
                    field289.method2414(92);
                    field289.method2148(0);
                    int var22 = field289.field1847;
                    long var23 = class106.method487();
                    for (int var25 = 0; var25 < class128.field1987; var25++) {
                        long var26 = var23 - field472;
                        if (var26 > 16777215L) {
                            var26 = 16777215L;
                        }
                        field472 = var23;
                        field289.method2149((int) var26);
                        field289.method2182(class128.field1986[var25]);
                    }
                    field289.method2157(field289.field1847 - var22);
                }
                if (field448 > 0) {
                    field448--;
                }
                if (class128.field1967[96] || class128.field1967[97] || class128.field1967[98] || class128.field1967[99]) {
                    field338 = true;
                }
                if (field338 && field448 <= 0) {
                    field448 = 20;
                    field338 = false;
                    field289.method2414(154);
                    field289.method2148(field309);
                    field289.method2190(field246);
                }
                if (Statics.field2056 && !field262) {
                    field262 = true;
                    field289.method2414(95);
                    field289.method2263(1);
                }
                if (!Statics.field2056 && field262) {
                    field262 = false;
                    field289.method2414(95);
                    field289.method2263(0);
                }
                method132();
                if (field255 != 30) {
                    return;
                }
                method125();
                int var10002;
                for (int var28 = 0; var28 < field488; var28++) {
                    var10002 = field491[var28]--;
                    if (field491[var28] >= -10) {
                        class53 var30 = field303[var28];
                        if (var30 == null) {
                            class53 var10000 = (class53) null;
                            var30 = class53.method1054(Statics.field1080, field489[var28], 0);
                            if (var30 == null) {
                                continue;
                            }
                            field491[var28] += var30.method1048();
                            field303[var28] = var30;
                        }
                        if (field491[var28] < 0) {
                            int var37;
                            if (field492[var28] == 0) {
                                var37 = field299;
                            } else {
                                int var31 = (field492[var28] & 0xFF) * 128;
                                int var32 = field492[var28] >> 16 & 0xFF;
                                int var33 = var32 * 128 + 64 - Statics.field1508.field766;
                                if (var33 < 0) {
                                    var33 = -var33;
                                }
                                int var34 = field492[var28] >> 8 & 0xFF;
                                int var35 = var34 * 128 + 64 - Statics.field1508.field759;
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
                                var37 = field487 * (var31 - var36) / var31;
                            }
                            if (var37 > 0) {
                                class57 var38 = var30.method1047().method1086(Statics.field1832);
                                class59 var39 = class59.method1233(var38, 100, var37);
                                var39.method1117(field490[var28] - 1);
                                Statics.field1345.method950(var39);
                            }
                            field491[var28] = -100;
                        }
                    } else {
                        field488--;
                        for (int var29 = var28; var29 < field488; var29++) {
                            field489[var29] = field489[var29 + 1];
                            field303[var29] = field303[var29 + 1];
                            field490[var29] = field490[var29 + 1];
                            field491[var29] = field491[var29 + 1];
                            field492[var29] = field492[var29 + 1];
                        }
                        var28--;
                    }
                }
                if (field269 && !class166.method2851()) {
                    if (field483 != 0 && field464 != -1) {
                        class166.method25(Statics.field929, field464, 0, field483, false);
                    }
                    field269 = false;
                }
                field294++;
                if (field294 > 750) {
                    method509();
                    return;
                }
                method2590();
                Statics.method1613();
                for (int var40 = -1; var40 < field368; var40++) {
                    int var41;
                    if (var40 == -1) {
                        var41 = 2047;
                    } else {
                        var41 = field337[var40];
                    }
                    class3 var42 = field367[var41];
                    if (var42 != null && var42.field738 > 0) {
                        var42.field738--;
                        if (var42.field738 == 0) {
                            var42.field746 = null;
                        }
                    }
                }
                for (int var43 = 0; var43 < field287; var43++) {
                    int var44 = field288[var43];
                    class31 var45 = field286[var44];
                    if (var45 != null && var45.field738 > 0) {
                        var45.field738--;
                        if (var45.field738 == 0) {
                            var45.field746 = null;
                        }
                    }
                }
                field477++;
                if (field357 != 0) {
                    field356 += 20;
                    if (field356 >= 400) {
                        field357 = 0;
                    }
                }
                if (Statics.field1836 != null) {
                    field358++;
                    if (field358 >= 15) {
                        method1031(Statics.field1836);
                        Statics.field1836 = null;
                    }
                }
                class157 var46 = Statics.field141;
                class157 var47 = Statics.field16;
                Statics.field141 = null;
                Statics.field16 = null;
                field425 = null;
                field278 = false;
                field317 = false;
                field469 = 0;
                while (Statics.method2526() && field469 < 128) {
                    if (field416 >= 2 && class128.field1967[82] && Statics.field1933 == 66) {
                        String var48 = class10.method531();
                        Statics.field510.setContents(new StringSelection(var48), (ClipboardOwner) null);
                    } else {
                        field471[field469] = Statics.field1933;
                        field441[field469] = Statics.field1799;
                        field469++;
                    }
                }
                int var49 = field409;
                if (class157.method1793(var49)) {
                    method19(Statics.field2658[var49], -1, 0, 0, 765, 503, 0, 0);
                }
                field435++;
                while (true) {
                    class1 var50;
                    class157 var51;
                    class157 var52;
                    do {
                        var50 = (class1) field406.method3299();
                        if (var50 == null) {
                            while (true) {
                                class1 var53;
                                class157 var54;
                                class157 var55;
                                do {
                                    var53 = (class1) field335.method3299();
                                    if (var53 == null) {
                                        while (true) {
                                            class1 var56;
                                            class157 var57;
                                            class157 var58;
                                            do {
                                                var56 = (class1) field449.method3299();
                                                if (var56 == null) {
                                                    boolean var59 = false;
                                                    while (!var59) {
                                                        var59 = true;
                                                        for (int var60 = 0; var60 < field259 - 1; var60++) {
                                                            if (field258[var60] < 1000 && field258[var60 + 1] > 1000) {
                                                                String var61 = field397[var60];
                                                                field397[var60] = field397[var60 + 1];
                                                                field397[var60 + 1] = var61;
                                                                String var62 = field476[var60];
                                                                field476[var60] = field476[var60 + 1];
                                                                field476[var60 + 1] = var62;
                                                                int var63 = field258[var60];
                                                                field258[var60] = field258[var60 + 1];
                                                                field258[var60 + 1] = var63;
                                                                int var64 = field392[var60];
                                                                field392[var60] = field392[var60 + 1];
                                                                field392[var60 + 1] = var64;
                                                                int var65 = field393[var60];
                                                                field393[var60] = field393[var60 + 1];
                                                                field393[var60 + 1] = var65;
                                                                int var66 = field395[var60];
                                                                field395[var60] = field395[var60 + 1];
                                                                field395[var60 + 1] = var66;
                                                                var59 = false;
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field579 == null && field421 == null) {
                                                        int var67 = class131.field2025;
                                                        if (field390) {
                                                            if (var67 != 1 && (Statics.field927 || var67 != 4)) {
                                                                int var68 = class131.field2019;
                                                                int var69 = class131.field2020;
                                                                if (var68 < Statics.field11 - 10 || var68 > Statics.field699 + Statics.field11 + 10 || var69 < Statics.field140 - 10 || var69 > Statics.field1572 + Statics.field140 + 10) {
                                                                    field390 = false;
                                                                    method654(Statics.field11, Statics.field140, Statics.field699, Statics.field1572);
                                                                }
                                                            }
                                                            if (var67 == 1 || !Statics.field927 && var67 == 4) {
                                                                int var70 = Statics.field11;
                                                                int var71 = Statics.field140;
                                                                int var72 = Statics.field699;
                                                                int var73 = class131.field2026;
                                                                int var74 = class131.field2027;
                                                                int var75 = -1;
                                                                for (int var76 = 0; var76 < field259; var76++) {
                                                                    int var77 = (field259 - 1 - var76) * 15 + var71 + 31;
                                                                    if (var73 > var70 && var73 < var70 + var72 && var74 > var77 - 13 && var74 < var77 + 3) {
                                                                        var75 = var76;
                                                                    }
                                                                }
                                                                if (var75 != -1) {
                                                                    method3219(var75);
                                                                }
                                                                field390 = false;
                                                                method654(Statics.field11, Statics.field140, Statics.field699, Statics.field1572);
                                                            }
                                                        } else {
                                                            label962: {
                                                                if ((var67 == 1 || !Statics.field927 && var67 == 4) && field259 > 0) {
                                                                    int var78 = field258[field259 - 1];
                                                                    if (var78 == 39 || var78 == 40 || var78 == 41 || var78 == 42 || var78 == 43 || var78 == 33 || var78 == 34 || var78 == 35 || var78 == 36 || var78 == 37 || var78 == 38 || var78 == 1005) {
                                                                        label951: {
                                                                            int var79 = field392[field259 - 1];
                                                                            int var80 = field393[field259 - 1];
                                                                            class157 var81 = class157.method151(var80);
                                                                            int var82 = Statics.method1003(var81);
                                                                            boolean var83 = (var82 >> 28 & 0x1) != 0;
                                                                            if (!var83) {
                                                                                class161 var103 = (class161) null;
                                                                                if (!class161.method29(Statics.method1003(var81))) {
                                                                                    break label951;
                                                                                }
                                                                            }
                                                                            if (Statics.field579 != null && !field364 && field389 != 1 && !method2446(field259 - 1) && field259 > 0) {
                                                                                method1611(field361, field362);
                                                                            }
                                                                            field364 = false;
                                                                            field365 = 0;
                                                                            if (Statics.field579 != null) {
                                                                                method1031(Statics.field579);
                                                                            }
                                                                            Statics.field579 = class157.method151(var80);
                                                                            field360 = var79;
                                                                            field361 = class131.field2026;
                                                                            field362 = class131.field2027;
                                                                            if (field259 > 0) {
                                                                                method26(field259 - 1);
                                                                            }
                                                                            method1031(Statics.field579);
                                                                            break label962;
                                                                        }
                                                                    }
                                                                }
                                                                if ((var67 == 1 || !Statics.field927 && var67 == 4) && (field389 == 1 && field259 > 2 || method2446(field259 - 1))) {
                                                                    var67 = 2;
                                                                }
                                                                if ((var67 == 1 || !Statics.field927 && var67 == 4) && field259 > 0) {
                                                                    method3219(field259 - 1);
                                                                }
                                                                if (var67 == 2 && field259 > 0) {
                                                                    method2425(class131.field2026, class131.field2027);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (field421 != null) {
                                                        method2750();
                                                    }
                                                    if (Statics.field579 != null) {
                                                        method1031(Statics.field579);
                                                        field365++;
                                                        if (class131.field2018 == 0) {
                                                            if (field364) {
                                                                if (Statics.field977 == Statics.field579 && field363 != field360) {
                                                                    class157 var84 = Statics.field579;
                                                                    byte var85 = 0;
                                                                    if (field323 == 1 && var84.field2555 == 206) {
                                                                        var85 = 1;
                                                                    }
                                                                    if (var84.field2656[field363] <= 0) {
                                                                        var85 = 0;
                                                                    }
                                                                    if (class161.method29(Statics.method1003(var84))) {
                                                                        int var86 = field360;
                                                                        int var87 = field363;
                                                                        var84.field2656[var87] = var84.field2656[var86];
                                                                        var84.field2657[var87] = var84.field2657[var86];
                                                                        var84.field2656[var86] = -1;
                                                                        var84.field2657[var86] = 0;
                                                                    } else if (var85 == 1) {
                                                                        int var88 = field360;
                                                                        int var89 = field363;
                                                                        while (var88 != var89) {
                                                                            if (var88 > var89) {
                                                                                var84.method2924(var88 - 1, var88);
                                                                                var88--;
                                                                            } else if (var88 < var89) {
                                                                                var84.method2924(var88 + 1, var88);
                                                                                var88++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var84.method2924(field363, field360);
                                                                    }
                                                                    field289.method2414(85);
                                                                    field289.method2200(Statics.field579.field2635);
                                                                    field289.method2192(field363);
                                                                    field289.method2182(var85);
                                                                    field289.method2148(field360);
                                                                }
                                                            } else if ((field389 == 1 || method2446(field259 - 1)) && field259 > 2) {
                                                                method2425(field361, field362);
                                                            } else if (field259 > 0) {
                                                                method1611(field361, field362);
                                                            }
                                                            field358 = 10;
                                                            class131.field2025 = 0;
                                                            Statics.field579 = null;
                                                        } else if (field365 >= 5 && (class131.field2019 > field361 + 5 || class131.field2019 < field361 - 5 || class131.field2020 > field362 + 5 || class131.field2020 < field362 - 5)) {
                                                            field364 = true;
                                                        }
                                                    }
                                                    if (class80.field1392 != -1) {
                                                        int var90 = class80.field1392;
                                                        int var91 = class80.field1393;
                                                        field289.method2414(80);
                                                        field289.method2263(5);
                                                        field289.method2148(Statics.field1821 + var91);
                                                        field289.method2192(Statics.field73 + var90);
                                                        field289.method2263(class128.field1967[82] ? (class128.field1967[81] ? 2 : 1) : 0);
                                                        class80.field1392 = -1;
                                                        field354 = class131.field2026;
                                                        field470 = class131.field2027;
                                                        field357 = 1;
                                                        field356 = 0;
                                                        field480 = var90;
                                                        field332 = var91;
                                                    }
                                                    if (Statics.field141 != var46) {
                                                        if (var46 != null) {
                                                            method1031(var46);
                                                        }
                                                        if (Statics.field141 != null) {
                                                            method1031(Statics.field141);
                                                        }
                                                    }
                                                    if (Statics.field16 != var47 && field391 == field291) {
                                                        if (var47 != null) {
                                                            method1031(var47);
                                                        }
                                                        if (Statics.field16 != null) {
                                                            method1031(Statics.field16);
                                                        }
                                                    }
                                                    if (Statics.field16 == null) {
                                                        if (field391 > 0) {
                                                            field391--;
                                                        }
                                                    } else if (field391 < field291) {
                                                        field391++;
                                                        if (field391 == field291) {
                                                            method1031(Statics.field16);
                                                        }
                                                    }
                                                    method120();
                                                    if (field494) {
                                                        method472();
                                                    }
                                                    for (int var92 = 0; var92 < 5; var92++) {
                                                        var10002 = field404[var92]++;
                                                    }
                                                    int var93 = ++class131.field2013 - 1;
                                                    int var95 = class128.field1991;
                                                    if (var93 > 15000 && var95 > 15000) {
                                                        field296 = 250;
                                                        class131.field2013 = 14500;
                                                        field289.method2414(59);
                                                    }
                                                    field513++;
                                                    if (field513 > 500) {
                                                        field513 = 0;
                                                        int var97 = (int) (Math.random() * 8.0D);
                                                        if ((var97 & 0x1) == 1) {
                                                            field311 += field312;
                                                        }
                                                        if ((var97 & 0x2) == 2) {
                                                            field313 += field314;
                                                        }
                                                        if ((var97 & 0x4) == 4) {
                                                            field315 += field316;
                                                        }
                                                    }
                                                    if (field311 < -50) {
                                                        field312 = 2;
                                                    }
                                                    if (field311 > 50) {
                                                        field312 = -2;
                                                    }
                                                    if (field313 < -55) {
                                                        field314 = 2;
                                                    }
                                                    if (field313 > 55) {
                                                        field314 = -2;
                                                    }
                                                    if (field315 < -40) {
                                                        field316 = 1;
                                                    }
                                                    if (field315 > 40) {
                                                        field316 = -1;
                                                    }
                                                    field330++;
                                                    if (field330 > 500) {
                                                        field330 = 0;
                                                        int var98 = (int) (Math.random() * 8.0D);
                                                        if ((var98 & 0x1) == 1) {
                                                            field318 += field319;
                                                        }
                                                        if ((var98 & 0x2) == 2) {
                                                            field320 += field321;
                                                        }
                                                    }
                                                    if (field318 < -60) {
                                                        field319 = 2;
                                                    }
                                                    if (field318 > 60) {
                                                        field319 = -2;
                                                    }
                                                    if (field320 < -20) {
                                                        field321 = 1;
                                                    }
                                                    if (field320 > 10) {
                                                        field321 = -1;
                                                    }
                                                    for (class35 var99 = (class35) field503.method3255(); var99 != null; var99 = (class35) field503.method3253()) {
                                                        if ((long) var99.field796 < class106.method487() / 1000L - 5L) {
                                                            if (var99.field795 > 0) {
                                                                class10.method591(5, "", var99.field794 + class147.field2308);
                                                            }
                                                            if (var99.field795 == 0) {
                                                                class10.method591(5, "", var99.field794 + class147.field2309);
                                                            }
                                                            var99.method3391();
                                                        }
                                                    }
                                                    field295++;
                                                    if (field295 > 50) {
                                                        field289.method2414(22);
                                                    }
                                                    try {
                                                        if (Statics.field619 != null && field289.field1847 > 0) {
                                                            Statics.field619.method2628(field289.field1853, 0, field289.field1847);
                                                            field289.field1847 = 0;
                                                            field295 = 0;
                                                        }
                                                    } catch (IOException var101) {
                                                        method509();
                                                    }
                                                    return;
                                                }
                                                var57 = var56.field3;
                                                if (var57.field2552 < 0) {
                                                    break;
                                                }
                                                var58 = class157.method151(var57.field2615);
                                            } while (var58 == null || var58.field2662 == null || var57.field2552 >= var58.field2662.length || var58.field2662[var57.field2552] != var57);
                                            class33.method16(var56);
                                        }
                                    }
                                    var54 = var53.field3;
                                    if (var54.field2552 < 0) {
                                        break;
                                    }
                                    var55 = class157.method151(var54.field2615);
                                } while (var55 == null || var55.field2662 == null || var54.field2552 >= var55.field2662.length || var55.field2662[var54.field2552] != var54);
                                class33.method16(var53);
                            }
                        }
                        var51 = var50.field3;
                        if (var51.field2552 < 0) {
                            break;
                        }
                        var52 = class157.method151(var51.field2615);
                    } while (var52 == null || var52.field2662 == null || var51.field2552 >= var52.field2662.length || var52.field2662[var51.field2552] != var51);
                    class33.method16(var50);
                }
            }
            field289.method2414(28);
            field289.method2263(0);
            int var3 = field289.field1847;
            class194.method2961(field289);
            field289.method2158(field289.field1847 - var3);
        }
    }

    @ObfuscatedName("g.h(B)V")
    public static final void method69() {
        if (Statics.field1886 != null) {
            Statics.field1886.method997();
        }
        if (Statics.field197 != null) {
            Statics.field197.method997();
        }
    }

    @ObfuscatedName("j.z(Lax;IIII)V")
    public static void method23(class39 arg0, int arg1, int arg2, int arg3) {
        if (field488 >= 50 || field487 == 0 || arg0.field915 == null || arg1 >= arg0.field915.length) {
            return;
        }
        int var4 = arg0.field915[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field489[field488] = var5;
        field490[field488] = var6;
        field491[field488] = 0;
        field303[field488] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field492[field488] = (var8 << 16) + (var9 << 8) + var7;
        field488++;
    }

    @ObfuscatedName("bm.u(II)V")
    public static void method1316(int arg0) {
        if (arg0 == -1 && !field269) {
            Statics.field2736.method3157();
            class166.field2737 = 1;
            Statics.field1666 = null;
        } else if (arg0 != -1 && field464 != arg0 && field483 != 0 && !field269) {
            class152 var1 = Statics.field929;
            int var2 = field483;
            class166.field2737 = 1;
            Statics.field1666 = var1;
            Statics.field64 = arg0;
            Statics.field1825 = 0;
            Statics.field2508 = var2;
            Statics.field31 = false;
            Statics.field2738 = 2;
        }
        field464 = arg0;
    }

    @ObfuscatedName("r.ad(I)V")
    public static final void method132() {
        if (field252 && Statics.field1829 != field301) {
            method2769(Statics.field608, Statics.field709, Statics.field1829, Statics.field1508.field753[0], Statics.field1508.field776[0]);
        } else if (Statics.field1829 != field475) {
            field475 = Statics.field1829;
            int var0 = Statics.field1829;
            int[] var1 = Statics.field158.field1308;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field98[var0][var6][var4] & 0x18) == 0) {
                        Statics.field186.method1750(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field98[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field186.method1750(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field158.method1461();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field98[var0][var10][var9] & 0x18) == 0) {
                        method24(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field98[var0 + 1][var10][var9] & 0x8) != 0) {
                        method24(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field433 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field186.method1645(Statics.field1829, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class37.method7(var14).field862;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field307[Statics.field1829].field3031;
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
                            field479[field433] = Statics.field1868[var15];
                            field342[field433] = var16;
                            field478[field433] = var17;
                            field433++;
                        }
                    }
                }
            }
            Statics.field1913.method1414();
        }
    }

    @ObfuscatedName("r.ah(III)V")
    public static final void method131(int arg0, int arg1) {
        if (field482 != 0 && field482 != 3 || class131.field2025 != 1 && Statics.field927 || class131.field2025 != 4) {
            return;
        }
        int var2 = class131.field2026 - 25 - arg0;
        int var3 = class131.field2027 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field318 + field309 & 0x7FF;
        int var5 = class85.field1468[var4];
        int var6 = class85.field1483[var4];
        int var7 = (field320 + 256) * var5 >> 8;
        int var8 = (field320 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1508.field766 + var9 >> 7;
        int var12 = Statics.field1508.field759 - var10 >> 7;
        field289.method2414(34);
        field289.method2263(18);
        field289.method2148(Statics.field1821 + var12);
        field289.method2192(Statics.field73 + var11);
        field289.method2263(class128.field1967[82] ? (class128.field1967[81] ? 2 : 1) : 0);
        field289.method2263(var2);
        field289.method2263(var3);
        field289.method2148(field309);
        field289.method2263(57);
        field289.method2263(field318);
        field289.method2263(field320);
        field289.method2263(89);
        field289.method2148(Statics.field1508.field766);
        field289.method2148(Statics.field1508.field759);
        field289.method2263(63);
        field480 = var11;
        field332 = var12;
    }

    @ObfuscatedName("u.ao(Ljava/lang/String;I)V")
    public static final void method529(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field152.field144 = !Statics.field152.field144;
            class9.method1794();
            if (Statics.field152.field144) {
                class10.method591(99, "", "Roofs are now all hidden");
            } else {
                class10.method591(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field416 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field382 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field382 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method509();
            }
            if (arg0.equalsIgnoreCase("errortest") && field249 == 2) {
                throw new RuntimeException();
            }
        }
        field289.method2414(123);
        field289.method2263(arg0.length() + 1);
        field289.method2152(arg0);
    }

    @ObfuscatedName("b.as(B)V")
    public static final void method472() {
        int var0 = Statics.field2870 * 128 + 64;
        int var1 = Statics.field528 * 128 + 64;
        int var2 = method149(var0, var1, Statics.field1829) - Statics.field1888;
        if (Statics.field1903 < var0) {
            Statics.field1903 += Statics.field1053 * (var0 - Statics.field1903) / 1000 + Statics.field1273;
            if (Statics.field1903 > var0) {
                Statics.field1903 = var0;
            }
        }
        if (Statics.field1903 > var0) {
            Statics.field1903 -= Statics.field1053 * (Statics.field1903 - var0) / 1000 + Statics.field1273;
            if (Statics.field1903 < var0) {
                Statics.field1903 = var0;
            }
        }
        if (Statics.field622 < var2) {
            Statics.field622 += Statics.field1053 * (var2 - Statics.field622) / 1000 + Statics.field1273;
            if (Statics.field622 > var2) {
                Statics.field622 = var2;
            }
        }
        if (Statics.field622 > var2) {
            Statics.field622 -= Statics.field1053 * (Statics.field622 - var2) / 1000 + Statics.field1273;
            if (Statics.field622 < var2) {
                Statics.field622 = var2;
            }
        }
        if (Statics.field602 < var1) {
            Statics.field602 += Statics.field1053 * (var1 - Statics.field602) / 1000 + Statics.field1273;
            if (Statics.field602 > var1) {
                Statics.field602 = var1;
            }
        }
        if (Statics.field602 > var1) {
            Statics.field602 -= Statics.field1053 * (Statics.field602 - var1) / 1000 + Statics.field1273;
            if (Statics.field602 < var1) {
                Statics.field602 = var1;
            }
        }
        int var3 = Statics.field2393 * 128 + 64;
        int var4 = Statics.field732 * 128 + 64;
        int var5 = method149(var3, var4, Statics.field1829) - Statics.field65;
        int var6 = var3 - Statics.field1903;
        int var7 = var5 - Statics.field622;
        int var8 = var4 - Statics.field602;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2791 < var10) {
            Statics.field2791 += Statics.field1912 * (var10 - Statics.field2791) / 1000 + Statics.field1057;
            if (Statics.field2791 > var10) {
                Statics.field2791 = var10;
            }
        }
        if (Statics.field2791 > var10) {
            Statics.field2791 -= Statics.field1912 * (Statics.field2791 - var10) / 1000 + Statics.field1057;
            if (Statics.field2791 < var10) {
                Statics.field2791 = var10;
            }
        }
        int var12 = var11 - Statics.field925;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field925 += Statics.field1912 * var12 / 1000 + Statics.field1057;
            Statics.field925 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field925 -= Statics.field1912 * -var12 / 1000 + Statics.field1057;
            Statics.field925 &= 0x7FF;
        }
        int var13 = var11 - Statics.field925;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field925 = var11;
        }
    }

    @ObfuscatedName("o.at(B)V")
    public static final void method120() {
        int var0 = field311 + Statics.field1508.field766;
        int var1 = field313 + Statics.field1508.field759;
        if (Statics.field232 - var0 < -500 || Statics.field232 - var0 > 500 || Statics.field1354 - var1 < -500 || Statics.field1354 - var1 > 500) {
            Statics.field232 = var0;
            Statics.field1354 = var1;
        }
        if (Statics.field232 != var0) {
            Statics.field232 += (var0 - Statics.field232) / 16;
        }
        if (Statics.field1354 != var1) {
            Statics.field1354 += (var1 - Statics.field1354) / 16;
        }
        if (class131.field2018 == 4 && Statics.field927) {
            int var2 = class131.field2020 - field336;
            field334 = var2 * 2;
            field336 = var2 == -1 || var2 == 1 ? class131.field2020 : (field336 + class131.field2020) / 2;
            int var3 = field426 - class131.field2019;
            field300 = var3 * 2;
            field426 = var3 == -1 || var3 == 1 ? class131.field2019 : (field426 + class131.field2019) / 2;
        } else {
            if (class128.field1967[96]) {
                field300 += (-24 - field300) / 2;
            } else if (class128.field1967[97]) {
                field300 += (24 - field300) / 2;
            } else {
                field300 /= 2;
            }
            if (class128.field1967[98]) {
                field334 += (12 - field334) / 2;
            } else if (class128.field1967[99]) {
                field334 += (-12 - field334) / 2;
            } else {
                field334 /= 2;
            }
            field336 = class131.field2020;
            field426 = class131.field2019;
        }
        field309 = field300 / 2 + field309 & 0x7FF;
        field246 += field334 / 2;
        if (field246 < 128) {
            field246 = 128;
        }
        if (field246 > 383) {
            field246 = 383;
        }
        int var4 = Statics.field232 >> 7;
        int var5 = Statics.field1354 >> 7;
        int var6 = method149(Statics.field232, Statics.field1354, Statics.field1829);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1829;
                    if (var10 < 3 && (class6.field98[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field90[var10][var8][var9];
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
        if (var12 > field271) {
            field271 += (var12 - field271) / 24;
        } else if (var12 < field271) {
            field271 += (var12 - field271) / 80;
        }
    }

    @ObfuscatedName("di.ai(I)V")
    public static final void method2590() {
        for (int var0 = -1; var0 < field368; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field337[var0];
            }
            class3 var2 = field367[var1];
            if (var2 != null) {
                method2732(var2, 1);
            }
        }
    }

    @ObfuscatedName("eo.aq(Laq;II)V")
    public static final void method2732(class34 arg0, int arg1) {
        if (arg0.field748 > field257) {
            int var2 = arg0.field748 - field257;
            int var3 = arg0.field774 * 128 + arg0.field737 * 64;
            int var4 = arg0.field788 * 128 + arg0.field737 * 64;
            arg0.field766 += (var3 - arg0.field766) / var2;
            arg0.field759 += (var4 - arg0.field759) / var2;
            arg0.field790 = 0;
            if (arg0.field791 == 0) {
                arg0.field783 = 1024;
            }
            if (arg0.field791 == 1) {
                arg0.field783 = 1536;
            }
            if (arg0.field791 == 2) {
                arg0.field783 = 0;
            }
            if (arg0.field791 == 3) {
                arg0.field783 = 512;
            }
        } else if (arg0.field770 >= field257) {
            if (field257 == arg0.field770 || arg0.field764 == -1 || arg0.field736 != 0 || arg0.field761 + 1 > class39.method682(arg0.field764).field911[arg0.field765]) {
                int var5 = arg0.field770 - arg0.field748;
                int var6 = field257 - arg0.field748;
                int var7 = arg0.field774 * 128 + arg0.field737 * 64;
                int var8 = arg0.field788 * 128 + arg0.field737 * 64;
                int var9 = arg0.field775 * 128 + arg0.field737 * 64;
                int var10 = arg0.field777 * 128 + arg0.field737 * 64;
                arg0.field766 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field759 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field790 = 0;
            if (arg0.field791 == 0) {
                arg0.field783 = 1024;
            }
            if (arg0.field791 == 1) {
                arg0.field783 = 1536;
            }
            if (arg0.field791 == 2) {
                arg0.field783 = 0;
            }
            if (arg0.field791 == 3) {
                arg0.field783 = 512;
            }
            arg0.field735 = arg0.field783;
        } else {
            arg0.field734 = arg0.field772;
            if (arg0.field786 == 0) {
                arg0.field790 = 0;
            } else {
                label469: {
                    if (arg0.field764 != -1 && arg0.field736 == 0) {
                        class39 var11 = class39.method682(arg0.field764);
                        if (arg0.field767 > 0 && var11.field917 == 0) {
                            arg0.field790++;
                            break label469;
                        }
                        if (arg0.field767 <= 0 && var11.field912 == 0) {
                            arg0.field790++;
                            break label469;
                        }
                    }
                    int var12 = arg0.field766;
                    int var13 = arg0.field759;
                    int var14 = arg0.field753[arg0.field786 - 1] * 128 + arg0.field737 * 64;
                    int var15 = arg0.field776[arg0.field786 - 1] * 128 + arg0.field737 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field783 = 1280;
                            } else if (var13 > var15) {
                                arg0.field783 = 1792;
                            } else {
                                arg0.field783 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field783 = 768;
                            } else if (var13 > var15) {
                                arg0.field783 = 256;
                            } else {
                                arg0.field783 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field783 = 1024;
                        } else if (var13 > var15) {
                            arg0.field783 = 0;
                        }
                        int var16 = arg0.field783 - arg0.field735 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field742;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field741;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field780;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field743;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field741;
                        }
                        arg0.field734 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class31) {
                            var19 = ((class31) arg0).field695.field834;
                        }
                        if (var19) {
                            if (arg0.field783 != arg0.field735 && arg0.field758 == -1 && arg0.field785 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field786 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field786 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field786 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        } else {
                            if (arg0.field786 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field786 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field786 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        }
                        if (arg0.field789[arg0.field786 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field741 == arg0.field734 && arg0.field745 != -1) {
                            arg0.field734 = arg0.field745;
                        }
                        if (var12 < var14) {
                            arg0.field766 += var18;
                            if (arg0.field766 > var14) {
                                arg0.field766 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field766 -= var18;
                            if (arg0.field766 < var14) {
                                arg0.field766 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field759 += var18;
                            if (arg0.field759 > var15) {
                                arg0.field759 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field759 -= var18;
                            if (arg0.field759 < var15) {
                                arg0.field759 = var15;
                            }
                        }
                        if (arg0.field766 == var14 && arg0.field759 == var15) {
                            arg0.field786--;
                            if (arg0.field767 > 0) {
                                arg0.field767--;
                            }
                        }
                    } else {
                        arg0.field766 = var14;
                        arg0.field759 = var15;
                    }
                }
            }
        }
        if (arg0.field766 < 128 || arg0.field759 < 128 || arg0.field766 >= 13184 || arg0.field759 >= 13184) {
            arg0.field764 = -1;
            arg0.field769 = -1;
            arg0.field748 = 0;
            arg0.field770 = 0;
            arg0.field766 = arg0.field753[0] * 128 + arg0.field737 * 64;
            arg0.field759 = arg0.field776[0] * 128 + arg0.field737 * 64;
            arg0.method612();
        }
        if (Statics.field1508 == arg0 && (arg0.field766 < 1536 || arg0.field759 < 1536 || arg0.field766 >= 11776 || arg0.field759 >= 11776)) {
            arg0.field764 = -1;
            arg0.field769 = -1;
            arg0.field748 = 0;
            arg0.field770 = 0;
            arg0.field766 = arg0.field753[0] * 128 + arg0.field737 * 64;
            arg0.field759 = arg0.field776[0] * 128 + arg0.field737 * 64;
            arg0.method612();
        }
        if (arg0.field785 != 0) {
            if (arg0.field758 != -1 && arg0.field758 < 32768) {
                class31 var20 = field286[arg0.field758];
                if (var20 != null) {
                    int var21 = arg0.field766 - var20.field766;
                    int var22 = arg0.field759 - var20.field759;
                    if (var21 != 0 || var22 != 0) {
                        arg0.field783 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field758 >= 32768) {
                int var23 = arg0.field758 - 32768;
                if (field374 == var23) {
                    var23 = 2047;
                }
                class3 var24 = field367[var23];
                if (var24 != null) {
                    int var25 = arg0.field766 - var24.field766;
                    int var26 = arg0.field759 - var24.field759;
                    if (var25 != 0 || var26 != 0) {
                        arg0.field783 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field778 != 0 || arg0.field779 != 0) && (arg0.field786 == 0 || arg0.field790 > 0)) {
                int var27 = arg0.field766 - (arg0.field778 * 64 - Statics.field73 * 64 - Statics.field73 * 64);
                int var28 = arg0.field759 - (arg0.field779 * 64 - Statics.field1821 * 64 - Statics.field1821 * 64);
                if (var27 != 0 || var28 != 0) {
                    arg0.field783 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
                arg0.field778 = 0;
                arg0.field779 = 0;
            }
            int var29 = arg0.field783 - arg0.field735 & 0x7FF;
            if (var29 == 0) {
                arg0.field760 = 0;
            } else {
                arg0.field760++;
                if (var29 > 1024) {
                    arg0.field735 -= arg0.field785;
                    boolean var30 = true;
                    if (var29 < arg0.field785 || var29 > 2048 - arg0.field785) {
                        arg0.field735 = arg0.field783;
                        var30 = false;
                    }
                    if (arg0.field772 == arg0.field734 && (arg0.field760 > 25 || var30)) {
                        if (arg0.field739 == -1) {
                            arg0.field734 = arg0.field741;
                        } else {
                            arg0.field734 = arg0.field739;
                        }
                    }
                } else {
                    arg0.field735 += arg0.field785;
                    boolean var31 = true;
                    if (var29 < arg0.field785 || var29 > 2048 - arg0.field785) {
                        arg0.field735 = arg0.field783;
                        var31 = false;
                    }
                    if (arg0.field772 == arg0.field734 && (arg0.field760 > 25 || var31)) {
                        if (arg0.field740 == -1) {
                            arg0.field734 = arg0.field741;
                        } else {
                            arg0.field734 = arg0.field740;
                        }
                    }
                }
                arg0.field735 &= 0x7FF;
            }
        }
        arg0.field773 = false;
        if (arg0.field734 != -1) {
            class39 var33 = class39.method682(arg0.field734);
            if (var33 == null || var33.field908 == null) {
                arg0.field734 = -1;
            } else {
                arg0.field763++;
                if (arg0.field762 < var33.field908.length && arg0.field763 > var33.field911[arg0.field762]) {
                    arg0.field763 = 1;
                    arg0.field762++;
                    method23(var33, arg0.field762, arg0.field766, arg0.field759);
                }
                if (arg0.field762 >= var33.field908.length) {
                    arg0.field763 = 0;
                    arg0.field762 = 0;
                    method23(var33, arg0.field762, arg0.field766, arg0.field759);
                }
            }
        }
        if (arg0.field769 != -1 && field257 >= arg0.field792) {
            if (arg0.field750 < 0) {
                arg0.field750 = 0;
            }
            int var34 = class40.method2864(arg0.field769).field933;
            if (var34 == -1) {
                arg0.field769 = -1;
            } else {
                class39 var35 = class39.method682(var34);
                if (var35 == null || var35.field908 == null) {
                    arg0.field769 = -1;
                } else {
                    arg0.field771++;
                    if (arg0.field750 < var35.field908.length && arg0.field771 > var35.field911[arg0.field750]) {
                        arg0.field771 = 1;
                        arg0.field750++;
                        method23(var35, arg0.field750, arg0.field766, arg0.field759);
                    }
                    if (arg0.field750 >= var35.field908.length && (arg0.field750 < 0 || arg0.field750 >= var35.field908.length)) {
                        arg0.field769 = -1;
                    }
                }
            }
        }
        if (arg0.field764 != -1 && arg0.field736 <= 1) {
            class39 var36 = class39.method682(arg0.field764);
            if (var36.field917 == 1 && arg0.field767 > 0 && arg0.field748 <= field257 && arg0.field770 < field257) {
                arg0.field736 = 1;
                return;
            }
        }
        if (arg0.field764 != -1 && arg0.field736 == 0) {
            class39 var37 = class39.method682(arg0.field764);
            if (var37 == null || var37.field908 == null) {
                arg0.field764 = -1;
            } else {
                arg0.field761++;
                if (arg0.field765 < var37.field908.length && arg0.field761 > var37.field911[arg0.field765]) {
                    arg0.field761 = 1;
                    arg0.field765++;
                    method23(var37, arg0.field765, arg0.field766, arg0.field759);
                }
                if (arg0.field765 >= var37.field908.length) {
                    arg0.field765 -= var37.field913;
                    arg0.field768++;
                    if (arg0.field768 >= var37.field919) {
                        arg0.field764 = -1;
                    } else if (arg0.field765 >= 0 && arg0.field765 < var37.field908.length) {
                        method23(var37, arg0.field765, arg0.field766, arg0.field759);
                    } else {
                        arg0.field764 = -1;
                    }
                }
                arg0.field773 = var37.field909;
            }
        }
        if (arg0.field736 > 0) {
            arg0.field736--;
        }
    }

    @ObfuscatedName("q.an(Lf;III)V")
    public static void method152(class3 arg0, int arg1, int arg2) {
        if (arg0.field764 == arg1 && arg1 != -1) {
            int var3 = class39.method682(arg1).field922;
            if (var3 == 1) {
                arg0.field765 = 0;
                arg0.field761 = 0;
                arg0.field736 = arg2;
                arg0.field768 = 0;
            }
            if (var3 == 2) {
                arg0.field768 = 0;
            }
        } else if (arg1 == -1 || arg0.field764 == -1 || class39.method682(arg1).field916 >= class39.method682(arg0.field764).field916) {
            arg0.field764 = arg1;
            arg0.field765 = 0;
            arg0.field761 = 0;
            arg0.field736 = arg2;
            arg0.field768 = 0;
            arg0.field767 = arg0.field786;
        }
    }

    @ObfuscatedName("k.ac(I)V")
    public static final void method71() {
        if (field409 != -1) {
            int var0 = field409;
            if (class157.method1793(var0)) {
                method585(Statics.field2658[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field502; var1++) {
            if (field455[var1]) {
                field456[var1] = true;
            }
            field457[var1] = field455[var1];
            field455[var1] = false;
        }
        field454 = field257;
        field398 = -1;
        field430 = -1;
        Statics.field977 = null;
        if (field409 != -1) {
            field502 = 0;
            method853(field409, 0, 0, 765, 503, 0, 0, -1);
        }
        class74.method1513();
        if (field390) {
            int var2 = Statics.field11;
            int var3 = Statics.field140;
            int var4 = Statics.field699;
            int var5 = Statics.field1572;
            int var6 = 6116423;
            class74.method1520(var2, var3, var4, var5, var6);
            class74.method1520(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class74.method1522(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2683.method3499(class147.field2314, var2 + 3, var3 + 14, var6, -1);
            int var7 = class131.field2019;
            int var8 = class131.field2020;
            for (int var9 = 0; var9 < field259; var9++) {
                int var10 = (field259 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class207 var12 = Statics.field2683;
                String var13;
                if (field397[var9].length() > 0) {
                    var13 = field476[var9] + class147.field2321 + field397[var9];
                } else {
                    var13 = field476[var9];
                }
                var12.method3499(var13, var2 + 3, var10, var11, 0);
            }
            method534(Statics.field11, Statics.field140, Statics.field699, Statics.field1572);
        } else if (field398 != -1) {
            method114(field398, field430);
        }
        if (field322 == 3) {
            for (int var14 = 0; var14 < field502; var14++) {
                if (field457[var14]) {
                    class74.method1519(field458[var14], field459[var14], field460[var14], field461[var14], 16711935, 128);
                } else if (field456[var14]) {
                    class74.method1519(field458[var14], field459[var14], field460[var14], field461[var14], 16711680, 128);
                }
            }
        }
        int var15 = Statics.field1829;
        int var16 = Statics.field1508.field766;
        int var17 = Statics.field1508.field759;
        int var18 = field477;
        for (class21 var19 = (class21) class21.field564.method3303(); var19 != null; var19 = (class21) class21.field564.method3305()) {
            if (var19.field556 != -1 || var19.field550 != null) {
                int var20 = 0;
                if (var16 > var19.field553) {
                    var20 += var16 - var19.field553;
                } else if (var16 < var19.field551) {
                    var20 += var19.field551 - var16;
                }
                if (var17 > var19.field554) {
                    var20 += var17 - var19.field554;
                } else if (var17 < var19.field552) {
                    var20 += var19.field552 - var17;
                }
                if (var20 - 64 > var19.field555 || field487 == 0 || var19.field565 != var15) {
                    if (var19.field557 != null) {
                        Statics.field1345.method976(var19.field557);
                        var19.field557 = null;
                    }
                    if (var19.field562 != null) {
                        Statics.field1345.method976(var19.field562);
                        var19.field562 = null;
                    }
                } else {
                    var20 -= 64;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = field487 * (var19.field555 - var20) / var19.field555;
                    class53 var10000;
                    if (var19.field557 != null) {
                        var19.field557.method1223(var21);
                    } else if (var19.field556 >= 0) {
                        var10000 = (class53) null;
                        class53 var22 = class53.method1054(Statics.field1080, var19.field556, 0);
                        if (var22 != null) {
                            class57 var23 = var22.method1047().method1086(Statics.field1832);
                            class59 var24 = class59.method1233(var23, 100, var21);
                            var24.method1117(-1);
                            Statics.field1345.method950(var24);
                            var19.field557 = var24;
                        }
                    }
                    if (var19.field562 != null) {
                        var19.field562.method1223(var21);
                        if (!var19.field562.method3393()) {
                            var19.field562 = null;
                        }
                    } else if (var19.field550 != null && (var19.field561 -= var18) <= 0) {
                        int var25 = (int) (Math.random() * (double) var19.field550.length);
                        var10000 = (class53) null;
                        class53 var26 = class53.method1054(Statics.field1080, var19.field550[var25], 0);
                        if (var26 != null) {
                            class57 var27 = var26.method1047().method1086(Statics.field1832);
                            class59 var28 = class59.method1233(var27, 100, var21);
                            var28.method1117(0);
                            Statics.field1345.method950(var28);
                            var19.field562 = var28;
                            var19.field561 = var19.field558 + (int) (Math.random() * (double) (var19.field559 - var19.field558));
                        }
                    }
                }
            }
        }
        field477 = 0;
    }

    @ObfuscatedName("am.ap(Ljava/lang/String;ZI)V")
    public static final void method797(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2094.method3496(arg0, 250);
        int var6 = Statics.field2094.method3497(arg0, 250) * 13;
        class74.method1520(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1522(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2094.method3502(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method654(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method534(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field231.getGraphics();
            Statics.field1913.method1346(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field231.repaint();
        }
    }

    @ObfuscatedName("n.az(Las;B)V")
    public static final void method147(class30 arg0) {
        if (Statics.field1508.field766 >> 7 == field480 && Statics.field1508.field759 >> 7 == field332) {
            field480 = 0;
        }
        int var1 = field368;
        if (class30.field692 == arg0 || class30.field688 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field692 == arg0) {
                var3 = Statics.field1508;
                var4 = 33538048;
            } else if (class30.field688 == arg0) {
                var3 = field367[field505];
                var4 = field505 << 14;
            } else {
                var3 = field367[field337[var2]];
                var4 = field337[var2] << 14;
                if (class30.field689 == arg0 && field505 == field337[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method12() && !var3.field54) {
                var3.field36 = false;
                if ((field252 && field368 > 50 || field368 > 200) && class30.field692 != arg0 && var3.field772 == var3.field734) {
                    var3.field36 = true;
                }
                int var5 = var3.field766 >> 7;
                int var6 = var3.field759 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field47 == null || field257 < var3.field42 || field257 >= var3.field43) {
                        if ((var3.field766 & 0x7F) == 64 && (var3.field759 & 0x7F) == 64) {
                            if (field351 == field350[var5][var6]) {
                                continue;
                            }
                            field350[var5][var6] = field351;
                        }
                        var3.field41 = method149(var3.field766, var3.field759, Statics.field1829);
                        Statics.field186.method1627(Statics.field1829, var3.field766, var3.field759, var3.field41, 60, var3, var3.field735, var4, var3.field773);
                    } else {
                        var3.field36 = false;
                        var3.field41 = method149(var3.field766, var3.field759, Statics.field1829);
                        Statics.field186.method1716(Statics.field1829, var3.field766, var3.field759, var3.field41, 60, var3, var3.field735, var4, var3.field48, var3.field49, var3.field50, var3.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.ax(ZI)V")
    public static final void method1317(boolean arg0) {
        for (int var1 = 0; var1 < field287; var1++) {
            class31 var2 = field286[field288[var1]];
            int var3 = (field288[var1] << 14) + 536870912;
            if (var2 != null && var2.method12() && var2.field695.field825 == arg0 && var2.field695.method628()) {
                int var4 = var2.field766 >> 7;
                int var5 = var2.field759 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field737 == 1 && (var2.field766 & 0x7F) == 64 && (var2.field759 & 0x7F) == 64) {
                        if (field351 == field350[var4][var5]) {
                            continue;
                        }
                        field350[var4][var5] = field351;
                    }
                    if (!var2.field695.field833) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field186.method1627(Statics.field1829, var2.field766, var2.field759, method149(var2.field766 + (var2.field737 * 64 - 64), var2.field759 + (var2.field737 * 64 - 64), Statics.field1829), var2.field737 * 64 - 64 + 60, var2, var2.field735, var3, var2.field773);
                }
            }
        }
    }

    @ObfuscatedName("dr.al(I)V")
    public static final void method2525() {
        for (class27 var0 = (class27) field385.method3303(); var0 != null; var0 = (class27) field385.method3305()) {
            if (Statics.field1829 != var0.field627 || var0.field636) {
                var0.method3392();
            } else if (field257 >= var0.field629) {
                var0.method533(field477);
                if (var0.field636) {
                    var0.method3392();
                } else {
                    Statics.field186.method1627(var0.field627, var0.field630, var0.field637, var0.field631, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("m.am(I)I")
    public static final int method118() {
        if (Statics.field152.field144) {
            return Statics.field1829;
        } else {
            int var0 = method149(Statics.field1903, Statics.field602, Statics.field1829);
            return var0 - Statics.field622 >= 800 || (class6.field98[Statics.field1829][Statics.field1903 >> 7][Statics.field602 >> 7] & 0x4) == 0 ? 3 : Statics.field1829;
        }
    }

    @ObfuscatedName("ad.av(Laq;IIIIIB)V")
    public static final void method539(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method12()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field695;
            if (var6.field818 != null) {
                var6 = var6.method627();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field368) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field54) {
                return;
            }
            if (var8.field52 != -1 || var8.field38 != -1) {
                int var9 = arg0.field782 + 15;
                method583(arg0.field766, arg0.field759, var9);
                if (field352 > -1) {
                    if (var8.field52 != -1) {
                        Statics.field797[var8.field52].method1431(field352 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field2007[var8.field38].method1431(field352 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field265 == 10 && field267 == field337[arg1]) {
                int var10 = arg0.field782 + 15;
                method583(arg0.field766, arg0.field759, var10);
                if (field352 > -1) {
                    Statics.field1287[1].method1431(field352 + arg2 - 12, field353 + arg3 - var7);
                }
            }
        } else {
            class36 var11 = ((class31) arg0).field695;
            if (var11.field818 != null) {
                var11 = var11.method627();
            }
            if (var11.field815 >= 0 && var11.field815 < Statics.field2007.length) {
                int var12 = arg0.field782 + 15;
                method583(arg0.field766, arg0.field759, var12);
                if (field352 > -1) {
                    Statics.field2007[var11.field815].method1431(field352 + arg2 - 12, field353 + arg3 - 30);
                }
            }
            if (field265 == 1 && field266 == field288[arg1 - field368] && field257 % 20 < 10) {
                int var13 = arg0.field782 + 15;
                method583(arg0.field766, arg0.field759, var13);
                if (field352 > -1) {
                    Statics.field1287[0].method1431(field352 + arg2 - 12, field353 + arg3 - 28);
                }
            }
        }
        if (arg0.field746 != null && (arg1 >= field368 || !arg0.field733 && (field310 == 4 || !arg0.field747 && (field310 == 0 || field310 == 3 || field310 == 1 && method98(((class3) arg0).field40, false))))) {
            int var14 = arg0.field782;
            method583(arg0.field766, arg0.field759, var14);
            if (field352 > -1 && field484 < field373) {
                field345[field484] = Statics.field2683.method3494(arg0.field746) / 2;
                field344[field484] = Statics.field2683.field2990;
                field467[field484] = field352;
                field402[field484] = field353;
                field346[field484] = arg0.field744;
                field347[field484] = arg0.field751;
                field348[field484] = arg0.field738;
                field349[field484] = arg0.field746;
                field484++;
            }
        }
        if (arg0.field755 > field257) {
            int var15 = arg0.field782 + 15;
            method583(arg0.field766, arg0.field759, var15);
            if (field352 > -1) {
                int var16;
                if (arg1 < field368) {
                    var16 = 30;
                } else {
                    class36 var17 = ((class31) arg0).field695;
                    var16 = var17.field836;
                }
                int var18 = arg0.field756 * var16 / arg0.field757;
                if (var18 > var16) {
                    var18 = var16;
                } else if (var18 == 0 && arg0.field756 > 0) {
                    var18 = 1;
                }
                class74.method1520(field352 + arg2 - var16 / 2, field353 + arg3 - 3, var18, 5, 65280);
                class74.method1520(field352 + arg2 - var16 / 2 + var18, field353 + arg3 - 3, var16 - var18, 5, 16711680);
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (arg0.field754[var19] > field257) {
                int var20 = arg0.field782 / 2;
                method583(arg0.field766, arg0.field759, var20);
                if (field352 > -1) {
                    if (var19 == 1) {
                        field353 -= 20;
                    }
                    if (var19 == 2) {
                        field352 -= 15;
                        field353 -= 10;
                    }
                    if (var19 == 3) {
                        field352 += 15;
                        field353 -= 10;
                    }
                    Statics.field1456[arg0.field749[var19]].method1431(field352 + arg2 - 12, field353 + arg3 - 12);
                    Statics.field660.method3501(Integer.toString(arg0.field752[var19]), field352 + arg2 - 1, field353 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("as.ar(IIII)V")
    public static final void method583(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field352 = -1;
            field353 = -1;
            return;
        }
        int var3 = method149(arg0, arg1, Statics.field1829) - arg2;
        int var4 = arg0 - Statics.field1903;
        int var5 = var3 - Statics.field622;
        int var6 = arg1 - Statics.field602;
        int var7 = class85.field1468[Statics.field2791];
        int var8 = class85.field1483[Statics.field2791];
        int var9 = class85.field1468[Statics.field925];
        int var10 = class85.field1483[Statics.field925];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field352 = (var11 << 9) / var15 + 256;
            field353 = (var14 << 9) / var15 + 167;
        } else {
            field352 = -1;
            field353 = -1;
        }
    }

    @ObfuscatedName("n.ak(IIII)I")
    public static final int method149(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field98[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field90[var5][var3][var4] + class6.field90[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field90[var5][var3][var4 + 1] + class6.field90[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("el.aw(ZB)V")
    public static final void method2893(boolean arg0) {
        field308 = arg0;
        if (!field308) {
            int var1 = field412.method2194();
            int var2 = field412.method2342();
            int var3 = field412.method2342();
            int var4 = field412.method2342();
            int var5 = (field292 - field412.field1847) / 16;
            Statics.field597 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field597[var6][var7] = field412.method2306();
                }
            }
            int var8 = field412.method2257();
            Statics.field3041 = new int[var5];
            Statics.field1813 = new int[var5];
            Statics.field1454 = new int[var5];
            Statics.field1807 = new byte[var5][];
            Statics.field1916 = new byte[var5][];
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
                        Statics.field3041[var10] = var13;
                        Statics.field1813[var10] = Statics.field173.method2799("m" + var11 + "_" + var12);
                        Statics.field1454[var10] = Statics.field173.method2799("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2769(var1, var2, var8, var4, var3);
            return;
        }
        int var14 = field412.method2195();
        int var15 = field412.method2257();
        int var16 = field412.method2317();
        field412.method2400();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field412.method2401(1);
                    if (var20 == 1) {
                        field380[var17][var18][var19] = field412.method2401(26);
                    } else {
                        field380[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field412.method2402();
        int var21 = (field292 - field412.field1847) / 16;
        Statics.field597 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field597[var22][var23] = field412.method2202();
            }
        }
        int var24 = field412.method2195();
        int var25 = field412.method2342();
        Statics.field3041 = new int[var21];
        Statics.field1813 = new int[var21];
        Statics.field1454 = new int[var21];
        Statics.field1807 = new byte[var21][];
        Statics.field1916 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field380[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field3041[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field3041[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1813[var26] = Statics.field173.method2799("m" + var35 + "_" + var36);
                            Statics.field1454[var26] = Statics.field173.method2799("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2769(var24, var14, var15, var25, var16);
    }

    @ObfuscatedName("ee.ag(IIIIII)V")
    public static final void method2769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field608 == arg0 && Statics.field709 == arg1 && field301 == arg2 || !field252) {
            return;
        }
        Statics.field608 = arg0;
        Statics.field709 = arg1;
        field301 = arg2;
        if (!field252) {
            field301 = 0;
        }
        method500(25);
        method797(class147.field2170, true);
        int var5 = Statics.field73;
        int var6 = Statics.field1821;
        Statics.field73 = (arg0 - 6) * 8;
        Statics.field1821 = (arg1 - 6) * 8;
        int var7 = Statics.field73 - var5;
        int var8 = Statics.field1821 - var6;
        int var9 = Statics.field73;
        int var10 = Statics.field1821;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field286[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field753[var13] -= var7;
                    var12.field776[var13] -= var8;
                }
                var12.field766 -= var7 * 128;
                var12.field759 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field367[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field753[var16] -= var7;
                    var15.field776[var16] -= var8;
                }
                var15.field766 -= var7 * 128;
                var15.field759 -= var8 * 128;
            }
        }
        Statics.field1829 = arg2;
        Statics.field1508.method611(arg3, arg4, false);
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
                        field432[var27][var23][var24] = field432[var27][var25][var26];
                    } else {
                        field432[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field383.method3303(); var28 != null; var28 = (class15) field383.method3305()) {
            var28.field207 -= var7;
            var28.field217 -= var8;
            if (var28.field207 < 0 || var28.field217 < 0 || var28.field207 >= 104 || var28.field217 >= 104) {
                var28.method3392();
            }
        }
        if (field480 != 0) {
            field480 -= var7;
            field332 -= var8;
        }
        field488 = 0;
        field494 = false;
        field475 = -1;
        field385.method3297();
        field384.method3297();
    }

    @ObfuscatedName("dp.ay(ZI)V")
    public static final void method2271(boolean arg0) {
        method69();
        field295++;
        if (field295 < 50 && !arg0) {
            return;
        }
        field295 = 0;
        if (field399 || Statics.field619 == null) {
            return;
        }
        field289.method2414(22);
        try {
            Statics.field619.method2628(field289.field1853, 0, field289.field1847);
            field289.field1847 = 0;
        } catch (IOException var2) {
            field399 = true;
        }
    }

    @ObfuscatedName("fb.af(B)V")
    public static final void method2960() {
        method2271(false);
        field302 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1807.length; var1++) {
            if (Statics.field1813[var1] != -1 && Statics.field1807[var1] == null) {
                Statics.field1807[var1] = Statics.field173.method2852(Statics.field1813[var1], 0);
                if (Statics.field1807[var1] == null) {
                    var0 = false;
                    field302++;
                }
            }
            if (Statics.field1454[var1] != -1 && Statics.field1916[var1] == null) {
                Statics.field1916[var1] = Statics.field173.method2861(Statics.field1454[var1], 0, Statics.field597[var1]);
                if (Statics.field1916[var1] == null) {
                    var0 = false;
                    field302++;
                }
            }
        }
        if (!var0) {
            field378 = 1;
            return;
        }
        field341 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1807.length; var3++) {
            byte[] var4 = Statics.field1916[var3];
            if (var4 != null) {
                int var5 = (Statics.field3041[var3] >> 8) * 64 - Statics.field73;
                int var6 = (Statics.field3041[var3] & 0xFF) * 64 - Statics.field1821;
                if (field308) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class110 var9 = new class110(var4);
                int var10 = -1;
                label1112: while (true) {
                    int var11 = var9.method2174();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2174();
                            if (var16 == 0) {
                                continue label1112;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2257() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class37 var22 = class37.method7(var10);
                                if (var19 != 22 || !field252 || var22.field855 != 0 || var22.field856 == 1 || var22.field859) {
                                    if (!var22.method660()) {
                                        field341++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2174();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2257();
                    }
                }
            }
        }
        if (!var2) {
            field378 = 2;
            return;
        }
        if (field378 != 0) {
            method797(class147.field2170 + class2.field32 + class2.field24 + 100 + "%" + class2.field22, true);
        }
        method69();
        method1796();
        method69();
        Statics.field186.method1616();
        method69();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field307[var23].method3633();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field98[var24][var25][var26] = 0;
                }
            }
        }
        method69();
        class6.method905();
        int var27 = Statics.field1807.length;
        for (class21 var28 = (class21) class21.field564.method3303(); var28 != null; var28 = (class21) class21.field564.method3305()) {
            if (var28.field557 != null) {
                Statics.field1345.method976(var28.field557);
                var28.field557 = null;
            }
            if (var28.field562 != null) {
                Statics.field1345.method976(var28.field562);
                var28.field562 = null;
            }
        }
        class21.field564.method3297();
        method2271(true);
        if (!field308) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field3041[var29] >> 8) * 64 - Statics.field73;
                int var31 = (Statics.field3041[var29] & 0xFF) * 64 - Statics.field1821;
                byte[] var32 = Statics.field1807[var29];
                if (var32 != null) {
                    method69();
                    Statics.method2719(var32, var30, var31, Statics.field608 * 8 - 48, Statics.field709 * 8 - 48, field307);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field3041[var33] >> 8) * 64 - Statics.field73;
                int var35 = (Statics.field3041[var33] & 0xFF) * 64 - Statics.field1821;
                byte[] var36 = Statics.field1807[var33];
                if (var36 == null && Statics.field709 < 800) {
                    method69();
                    class6.method595(var34, var35, 64, 64);
                }
            }
            method2271(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1916[var37];
                if (var38 != null) {
                    int var39 = (Statics.field3041[var37] >> 8) * 64 - Statics.field73;
                    int var40 = (Statics.field3041[var37] & 0xFF) * 64 - Statics.field1821;
                    method69();
                    class6.method1897(var38, var39, var40, Statics.field186, field307);
                }
            }
        }
        if (field308) {
            for (int var41 = 0; var41 < 4; var41++) {
                method69();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field380[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field3041.length; var51++) {
                                if (Statics.field3041[var51] == var50 && Statics.field1807[var51] != null) {
                                    class6.method1797(Statics.field1807[var51], var41, var42 * 8, var43 * 8, var46, (var48 & 0x7) * 8, (var49 & 0x7) * 8, var47, field307);
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            int var52 = var41;
                            int var53 = var42 * 8;
                            int var54 = var43 * 8;
                            for (int var55 = 0; var55 < 8; var55++) {
                                for (int var56 = 0; var56 < 8; var56++) {
                                    class6.field90[var52][var53 + var55][var54 + var56] = 0;
                                }
                            }
                            if (var53 > 0) {
                                for (int var57 = 1; var57 < 8; var57++) {
                                    class6.field90[var52][var53][var54 + var57] = class6.field90[var52][var53 - 1][var54 + var57];
                                }
                            }
                            if (var54 > 0) {
                                for (int var58 = 1; var58 < 8; var58++) {
                                    class6.field90[var52][var53 + var58][var54] = class6.field90[var52][var53 + var58][var54 - 1];
                                }
                            }
                            if (var53 > 0 && class6.field90[var52][var53 - 1][var54] != 0) {
                                class6.field90[var52][var53][var54] = class6.field90[var52][var53 - 1][var54];
                            } else if (var54 > 0 && class6.field90[var52][var53][var54 - 1] != 0) {
                                class6.field90[var52][var53][var54] = class6.field90[var52][var53][var54 - 1];
                            } else if (var53 > 0 && var54 > 0 && class6.field90[var52][var53 - 1][var54 - 1] != 0) {
                                class6.field90[var52][var53][var54] = class6.field90[var52][var53 - 1][var54 - 1];
                            }
                        }
                    }
                }
            }
            for (int var59 = 0; var59 < 13; var59++) {
                for (int var60 = 0; var60 < 13; var60++) {
                    int var61 = field380[0][var59][var60];
                    if (var61 == -1) {
                        class6.method595(var59 * 8, var60 * 8, 8, 8);
                    }
                }
            }
            method2271(true);
            for (int var62 = 0; var62 < 4; var62++) {
                method69();
                for (int var63 = 0; var63 < 13; var63++) {
                    label947: for (int var64 = 0; var64 < 13; var64++) {
                        int var65 = field380[var62][var63][var64];
                        if (var65 != -1) {
                            int var66 = var65 >> 24 & 0x3;
                            int var67 = var65 >> 1 & 0x3;
                            int var68 = var65 >> 14 & 0x3FF;
                            int var69 = var65 >> 3 & 0x7FF;
                            int var70 = (var68 / 8 << 8) + var69 / 8;
                            for (int var71 = 0; var71 < Statics.field3041.length; var71++) {
                                if (Statics.field3041[var71] == var70 && Statics.field1916[var71] != null) {
                                    byte[] var72 = Statics.field1916[var71];
                                    int var73 = var63 * 8;
                                    int var74 = var64 * 8;
                                    int var75 = (var68 & 0x7) * 8;
                                    int var76 = (var69 & 0x7) * 8;
                                    class80 var77 = Statics.field186;
                                    class211[] var78 = field307;
                                    class110 var79 = new class110(var72);
                                    int var80 = -1;
                                    while (true) {
                                        int var81 = var79.method2174();
                                        if (var81 == 0) {
                                            continue label947;
                                        }
                                        var80 += var81;
                                        int var82 = 0;
                                        while (true) {
                                            int var83 = var79.method2174();
                                            if (var83 == 0) {
                                                break;
                                            }
                                            var82 += var83 - 1;
                                            int var84 = var82 & 0x3F;
                                            int var85 = var82 >> 6 & 0x3F;
                                            int var86 = var82 >> 12;
                                            int var87 = var79.method2257();
                                            int var88 = var87 >> 2;
                                            int var89 = var87 & 0x3;
                                            if (var66 == var86 && var85 >= var75 && var85 < var75 + 8 && var84 >= var76 && var84 < var76 + 8) {
                                                class37 var90 = class37.method7(var80);
                                                int var92 = var85 & 0x7;
                                                int var93 = var84 & 0x7;
                                                int var95 = var90.field854;
                                                int var96 = var90.field875;
                                                if ((var89 & 0x1) == 1) {
                                                    int var97 = var95;
                                                    var95 = var96;
                                                    var96 = var97;
                                                }
                                                int var98 = var67 & 0x3;
                                                int var99;
                                                if (var98 == 0) {
                                                    var99 = var92;
                                                } else if (var98 == 1) {
                                                    var99 = var93;
                                                } else if (var98 == 2) {
                                                    var99 = 7 - var92 - (var95 - 1);
                                                } else {
                                                    var99 = 7 - var93 - (var96 - 1);
                                                }
                                                int var100 = var73 + var99;
                                                int var101 = var74 + class160.method1(var85 & 0x7, var84 & 0x7, var67, var90.field854, var90.field875, var89);
                                                if (var100 > 0 && var101 > 0 && var100 < 103 && var101 < 103) {
                                                    int var102 = var62;
                                                    if ((class6.field98[1][var100][var101] & 0x2) == 2) {
                                                        var102 = var62 - 1;
                                                    }
                                                    class211 var103 = null;
                                                    if (var102 >= 0) {
                                                        var103 = var78[var102];
                                                    }
                                                    class6.method134(var62, var100, var101, var80, var67 + var89 & 0x3, var88, var77, var103);
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
        method2271(true);
        method1796();
        method69();
        class80 var104 = Statics.field186;
        class211[] var105 = field307;
        for (int var106 = 0; var106 < 4; var106++) {
            for (int var107 = 0; var107 < 104; var107++) {
                for (int var108 = 0; var108 < 104; var108++) {
                    if ((class6.field98[var106][var107][var108] & 0x1) == 1) {
                        int var109 = var106;
                        if ((class6.field98[1][var107][var108] & 0x2) == 2) {
                            var109 = var106 - 1;
                        }
                        if (var109 >= 0) {
                            var105[var109].method3630(var107, var108);
                        }
                    }
                }
            }
        }
        class6.field85 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field85 < -8) {
            class6.field85 = -8;
        }
        if (class6.field85 > 8) {
            class6.field85 = 8;
        }
        class6.field93 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field93 < -16) {
            class6.field93 = -16;
        }
        if (class6.field93 > 16) {
            class6.field93 = 16;
        }
        for (int var110 = 0; var110 < 4; var110++) {
            byte[][] var111 = Statics.field82[var110];
            int var112 = (int) Math.sqrt(5100.0D);
            int var113 = var112 * 768 >> 8;
            for (int var114 = 1; var114 < 103; var114++) {
                for (int var115 = 1; var115 < 103; var115++) {
                    int var116 = class6.field90[var110][var115 + 1][var114] - class6.field90[var110][var115 - 1][var114];
                    int var117 = class6.field90[var110][var115][var114 + 1] - class6.field90[var110][var115][var114 - 1];
                    int var118 = (int) Math.sqrt((double) (var117 * var117 + var116 * var116 + 65536));
                    int var119 = (var116 << 8) / var118;
                    int var120 = 65536 / var118;
                    int var121 = (var117 << 8) / var118;
                    int var122 = (var121 * -50 + var119 * -50 + var120 * -10) / var113 + 96;
                    int var123 = (var111[var115][var114] >> 1) + (var111[var115][var114 + 1] >> 3) + (var111[var115][var114 - 1] >> 2) + (var111[var115 - 1][var114] >> 2) + (var111[var115 + 1][var114] >> 3);
                    Statics.field2087[var115][var114] = var122 - var123;
                }
            }
            for (int var124 = 0; var124 < 104; var124++) {
                Statics.field92[var124] = 0;
                Statics.field56[var124] = 0;
                Statics.field84[var124] = 0;
                Statics.field526[var124] = 0;
                Statics.field710[var124] = 0;
            }
            for (int var125 = -5; var125 < 109; var125++) {
                for (int var126 = 0; var126 < 104; var126++) {
                    int var127 = var125 + 5;
                    int var10002;
                    if (var127 >= 0 && var127 < 104) {
                        int var128 = Statics.field83[var110][var127][var126] & 0xFF;
                        if (var128 > 0) {
                            int var129 = var128 - 1;
                            class38 var130 = (class38) class38.field897.method3231((long) var129);
                            class38 var131;
                            if (var130 == null) {
                                byte[] var132 = Statics.field901.method2852(1, var129);
                                class38 var133 = new class38();
                                if (var132 != null) {
                                    var133.method692(new class110(var132), var129);
                                }
                                var133.method691();
                                class38.field897.method3228(var133, (long) var129);
                                var131 = var133;
                            } else {
                                var131 = var130;
                            }
                            Statics.field92[var126] += var131.field891;
                            Statics.field56[var126] += var131.field894;
                            Statics.field84[var126] += var131.field900;
                            Statics.field526[var126] += var131.field896;
                            var10002 = Statics.field710[var126]++;
                        }
                    }
                    int var135 = var125 - 5;
                    if (var135 >= 0 && var135 < 104) {
                        int var136 = Statics.field83[var110][var135][var126] & 0xFF;
                        if (var136 > 0) {
                            int var137 = var136 - 1;
                            class38 var138 = (class38) class38.field897.method3231((long) var137);
                            class38 var139;
                            if (var138 == null) {
                                byte[] var140 = Statics.field901.method2852(1, var137);
                                class38 var141 = new class38();
                                if (var140 != null) {
                                    var141.method692(new class110(var140), var137);
                                }
                                var141.method691();
                                class38.field897.method3228(var141, (long) var137);
                                var139 = var141;
                            } else {
                                var139 = var138;
                            }
                            Statics.field92[var126] -= var139.field891;
                            Statics.field56[var126] -= var139.field894;
                            Statics.field84[var126] -= var139.field900;
                            Statics.field526[var126] -= var139.field896;
                            var10002 = Statics.field710[var126]--;
                        }
                    }
                }
                if (var125 >= 1 && var125 < 103) {
                    int var143 = 0;
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    for (int var148 = -5; var148 < 109; var148++) {
                        int var149 = var148 + 5;
                        if (var149 >= 0 && var149 < 104) {
                            var143 += Statics.field92[var149];
                            var144 += Statics.field56[var149];
                            var145 += Statics.field84[var149];
                            var146 += Statics.field526[var149];
                            var147 += Statics.field710[var149];
                        }
                        int var150 = var148 - 5;
                        if (var150 >= 0 && var150 < 104) {
                            var143 -= Statics.field92[var150];
                            var144 -= Statics.field56[var150];
                            var145 -= Statics.field84[var150];
                            var146 -= Statics.field526[var150];
                            var147 -= Statics.field710[var150];
                        }
                        if (var148 >= 1 && var148 < 103) {
                            if (field252 && (class6.field98[0][var125][var148] & 0x2) == 0) {
                                if ((class6.field98[var110][var125][var148] & 0x10) != 0) {
                                    continue;
                                }
                                int var151;
                                if ((class6.field98[var110][var125][var148] & 0x8) != 0) {
                                    var151 = 0;
                                } else if (var110 <= 0 || (class6.field98[1][var125][var148] & 0x2) == 0) {
                                    var151 = var110;
                                } else {
                                    var151 = var110 - 1;
                                }
                                if (field301 != var151) {
                                    continue;
                                }
                            }
                            if (var110 < class6.field77) {
                                class6.field77 = var110;
                            }
                            int var152 = Statics.field83[var110][var125][var148] & 0xFF;
                            int var153 = Statics.field79[var110][var125][var148] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class6.field90[var110][var125][var148];
                                int var155 = class6.field90[var110][var125 + 1][var148];
                                int var156 = class6.field90[var110][var125 + 1][var148 + 1];
                                int var157 = class6.field90[var110][var125][var148 + 1];
                                int var158 = Statics.field2087[var125][var148];
                                int var159 = Statics.field2087[var125 + 1][var148];
                                int var160 = Statics.field2087[var125 + 1][var148 + 1];
                                int var161 = Statics.field2087[var125][var148 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var143 * 256 / var146;
                                    int var165 = var144 / var147;
                                    int var166 = var145 / var147;
                                    var162 = class6.method2753(var164, var165, var166);
                                    int var167 = class6.field85 + var164 & 0xFF;
                                    int var168 = class6.field93 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class6.method2753(var167, var165, var168);
                                }
                                if (var110 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && Statics.field78[var110][var125][var148] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0 && !class42.method129(var153 - 1).field968) {
                                        var169 = false;
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        Statics.field76[var110][var125][var148] |= 0x924;
                                    }
                                }
                                int var170 = 0;
                                if (var163 != -1) {
                                    var170 = class85.field1467[class6.method78(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var104.method1621(var110, var125, var148, 0, 0, -1, var154, var155, var156, var157, class6.method78(var162, var158), class6.method78(var162, var159), class6.method78(var162, var160), class6.method78(var162, var161), 0, 0, 0, 0, var170, 0);
                                } else {
                                    int var171 = Statics.field78[var110][var125][var148] + 1;
                                    byte var172 = Statics.field81[var110][var125][var148];
                                    class42 var173 = class42.method129(var153 - 1);
                                    int var174 = var173.field967;
                                    int var175;
                                    int var176;
                                    if (var174 >= 0) {
                                        var175 = Statics.field1479.method1871(var174);
                                        var176 = -1;
                                    } else if (var173.field972 == 16711935) {
                                        var176 = -2;
                                        var174 = -1;
                                        var175 = -2;
                                    } else {
                                        var176 = class6.method2753(var173.field970, var173.field971, var173.field976);
                                        int var177 = class6.field85 + var173.field970 & 0xFF;
                                        int var178 = class6.field93 + var173.field976;
                                        if (var178 < 0) {
                                            var178 = 0;
                                        } else if (var178 > 255) {
                                            var178 = 255;
                                        }
                                        var175 = class6.method2753(var177, var173.field971, var178);
                                    }
                                    int var179 = 0;
                                    if (var175 != -2) {
                                        var179 = class85.field1467[Statics.method82(var175, 96)];
                                    }
                                    if (var173.field966 != -1) {
                                        int var180 = class6.field85 + var173.field973 & 0xFF;
                                        int var181 = class6.field93 + var173.field975;
                                        if (var181 < 0) {
                                            var181 = 0;
                                        } else if (var181 > 255) {
                                            var181 = 255;
                                        }
                                        int var182 = class6.method2753(var180, var173.field974, var181);
                                        var179 = class85.field1467[Statics.method82(var182, 96)];
                                    }
                                    var104.method1621(var110, var125, var148, var171, var172, var174, var154, var155, var156, var157, class6.method78(var162, var158), class6.method78(var162, var159), class6.method78(var162, var160), class6.method78(var162, var161), Statics.method82(var176, var158), Statics.method82(var176, var159), Statics.method82(var176, var160), Statics.method82(var176, var161), var170, var179);
                                }
                            }
                        }
                    }
                }
            }
            for (int var183 = 1; var183 < 103; var183++) {
                for (int var184 = 1; var184 < 103; var184++) {
                    int var189;
                    if ((class6.field98[var110][var184][var183] & 0x8) != 0) {
                        var189 = 0;
                    } else if (var110 <= 0 || (class6.field98[1][var184][var183] & 0x2) == 0) {
                        var189 = var110;
                    } else {
                        var189 = var110 - 1;
                    }
                    var104.method1687(var110, var184, var183, var189);
                }
            }
            Statics.field83[var110] = (byte[][]) null;
            Statics.field79[var110] = (byte[][]) null;
            Statics.field78[var110] = (byte[][]) null;
            Statics.field81[var110] = (byte[][]) null;
            Statics.field82[var110] = (byte[][]) null;
        }
        var104.method1640(-50, -10, -50);
        for (int var190 = 0; var190 < 104; var190++) {
            for (int var191 = 0; var191 < 104; var191++) {
                if ((class6.field98[1][var190][var191] & 0x2) == 2) {
                    var104.method1618(var190, var191);
                }
            }
        }
        int var192 = 1;
        int var193 = 2;
        int var194 = 4;
        for (int var195 = 0; var195 < 4; var195++) {
            if (var195 > 0) {
                var192 <<= 0x3;
                var193 <<= 0x3;
                var194 <<= 0x3;
            }
            for (int var196 = 0; var196 <= var195; var196++) {
                for (int var197 = 0; var197 <= 104; var197++) {
                    for (int var198 = 0; var198 <= 104; var198++) {
                        if ((Statics.field76[var196][var198][var197] & var192) != 0) {
                            int var199 = var197;
                            int var200 = var197;
                            int var201 = var196;
                            int var202 = var196;
                            while (var199 > 0 && (Statics.field76[var196][var198][var199 - 1] & var192) != 0) {
                                var199--;
                            }
                            while (var200 < 104 && (Statics.field76[var196][var198][var200 + 1] & var192) != 0) {
                                var200++;
                            }
                            label666: while (var201 > 0) {
                                for (int var203 = var199; var203 <= var200; var203++) {
                                    if ((Statics.field76[var201 - 1][var198][var203] & var192) == 0) {
                                        break label666;
                                    }
                                }
                                var201--;
                            }
                            label655: while (var202 < var195) {
                                for (int var204 = var199; var204 <= var200; var204++) {
                                    if ((Statics.field76[var202 + 1][var198][var204] & var192) == 0) {
                                        break label655;
                                    }
                                }
                                var202++;
                            }
                            int var205 = (var202 + 1 - var201) * (var200 - var199 + 1);
                            if (var205 >= 8) {
                                short var206 = 240;
                                int var207 = class6.field90[var202][var198][var199] - var206;
                                int var208 = class6.field90[var201][var198][var199];
                                class80.method1726(var195, 1, var198 * 128, var198 * 128, var199 * 128, var200 * 128 + 128, var207, var208);
                                for (int var209 = var201; var209 <= var202; var209++) {
                                    for (int var210 = var199; var210 <= var200; var210++) {
                                        Statics.field76[var209][var198][var210] &= ~var192;
                                    }
                                }
                            }
                        }
                        if ((Statics.field76[var196][var198][var197] & var193) != 0) {
                            int var211 = var198;
                            int var212 = var198;
                            int var213 = var196;
                            int var214 = var196;
                            while (var211 > 0 && (Statics.field76[var196][var211 - 1][var197] & var193) != 0) {
                                var211--;
                            }
                            while (var212 < 104 && (Statics.field76[var196][var212 + 1][var197] & var193) != 0) {
                                var212++;
                            }
                            label719: while (var213 > 0) {
                                for (int var215 = var211; var215 <= var212; var215++) {
                                    if ((Statics.field76[var213 - 1][var215][var197] & var193) == 0) {
                                        break label719;
                                    }
                                }
                                var213--;
                            }
                            label708: while (var214 < var195) {
                                for (int var216 = var211; var216 <= var212; var216++) {
                                    if ((Statics.field76[var214 + 1][var216][var197] & var193) == 0) {
                                        break label708;
                                    }
                                }
                                var214++;
                            }
                            int var217 = (var214 + 1 - var213) * (var212 - var211 + 1);
                            if (var217 >= 8) {
                                short var218 = 240;
                                int var219 = class6.field90[var214][var211][var197] - var218;
                                int var220 = class6.field90[var213][var211][var197];
                                class80.method1726(var195, 2, var211 * 128, var212 * 128 + 128, var197 * 128, var197 * 128, var219, var220);
                                for (int var221 = var213; var221 <= var214; var221++) {
                                    for (int var222 = var211; var222 <= var212; var222++) {
                                        Statics.field76[var221][var222][var197] &= ~var193;
                                    }
                                }
                            }
                        }
                        if ((Statics.field76[var196][var198][var197] & var194) != 0) {
                            int var223 = var198;
                            int var224 = var198;
                            int var225 = var197;
                            int var226 = var197;
                            while (var225 > 0 && (Statics.field76[var196][var198][var225 - 1] & var194) != 0) {
                                var225--;
                            }
                            while (var226 < 104 && (Statics.field76[var196][var198][var226 + 1] & var194) != 0) {
                                var226++;
                            }
                            label772: while (var223 > 0) {
                                for (int var227 = var225; var227 <= var226; var227++) {
                                    if ((Statics.field76[var196][var223 - 1][var227] & var194) == 0) {
                                        break label772;
                                    }
                                }
                                var223--;
                            }
                            label761: while (var224 < 104) {
                                for (int var228 = var225; var228 <= var226; var228++) {
                                    if ((Statics.field76[var196][var224 + 1][var228] & var194) == 0) {
                                        break label761;
                                    }
                                }
                                var224++;
                            }
                            if ((var224 - var223 + 1) * (var226 - var225 + 1) >= 4) {
                                int var229 = class6.field90[var196][var223][var225];
                                class80.method1726(var195, 4, var223 * 128, var224 * 128 + 128, var225 * 128, var226 * 128 + 128, var229, var229);
                                for (int var230 = var223; var230 <= var224; var230++) {
                                    for (int var231 = var225; var231 <= var226; var231++) {
                                        Statics.field76[var196][var230][var231] &= ~var194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2271(true);
        int var232 = class6.field77;
        if (var232 > Statics.field1829) {
            var232 = Statics.field1829;
        }
        if (var232 < Statics.field1829 - 1) {
            int var233 = Statics.field1829 - 1;
        }
        if (field252) {
            Statics.field186.method1617(class6.field77);
        } else {
            Statics.field186.method1617(0);
        }
        for (int var234 = 0; var234 < 104; var234++) {
            for (int var235 = 0; var235 < 104; var235++) {
                method1984(var234, var235);
            }
        }
        method69();
        method1999();
        class37.field842.method3229();
        if (Statics.field2137 != null) {
            field289.method2414(40);
            field289.method2260(1057001181);
        }
        if (!field308) {
            int var236 = (Statics.field608 - 6) / 8;
            int var237 = (Statics.field608 + 6) / 8;
            int var238 = (Statics.field709 - 6) / 8;
            int var239 = (Statics.field709 + 6) / 8;
            for (int var240 = var236 - 1; var240 <= var237 + 1; var240++) {
                for (int var241 = var238 - 1; var241 <= var239 + 1; var241++) {
                    if (var240 < var236 || var240 > var237 || var241 < var238 || var241 > var239) {
                        Statics.field173.method2811("m" + var240 + "_" + var241);
                        Statics.field173.method2811("l" + var240 + "_" + var241);
                    }
                }
            }
        }
        method500(30);
        method69();
        class6.method33();
        field289.method2414(2);
        class135.method156();
    }

    @ObfuscatedName("j.au(IIIIII)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field186.method1642(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field186.method1646(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field158.field1308;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method7(var12);
            if (var13.field868 == -1) {
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
                class75 var14 = Statics.field1690[var13.field868];
                if (var14 != null) {
                    int var15 = (var13.field854 * 4 - var14.field1321) / 2;
                    int var16 = (var13.field875 * 4 - var14.field1319) / 2;
                    var14.method1586(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field875) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field186.method1644(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field186.method1646(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method7(var21);
            if (var22.field868 != -1) {
                class75 var23 = Statics.field1690[var22.field868];
                if (var23 != null) {
                    int var24 = (var22.field854 * 4 - var23.field1321) / 2;
                    int var25 = (var22.field875 * 4 - var23.field1319) / 2;
                    var23.method1586(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field875) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field158.field1308;
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
        int var29 = Statics.field186.method1645(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method7(var30);
        if (var31.field868 == -1) {
            return;
        }
        class75 var32 = Statics.field1690[var31.field868];
        if (var32 != null) {
            int var33 = (var31.field854 * 4 - var32.field1321) / 2;
            int var34 = (var31.field875 * 4 - var32.field1319) / 2;
            var32.method1586(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field875) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("n.aa(I)Z")
    public static final boolean method150() {
        if (Statics.field619 == null) {
            return false;
        }
        try {
            int var0 = Statics.field619.method2626();
            if (var0 == 0) {
                return false;
            }
            if (field293 == -1) {
                Statics.field619.method2627(field412.field1853, 0, 1);
                field412.field1847 = 0;
                field293 = field412.method2399();
                field292 = class171.field2842[field293];
                var0--;
            }
            if (field292 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field619.method2627(field412.field1853, 0, 1);
                field292 = field412.field1853[0] & 0xFF;
                var0--;
            }
            if (field292 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field619.method2627(field412.field1853, 0, 2);
                field412.field1847 = 0;
                field292 = field412.method2194();
                var0 -= 2;
            }
            if (var0 < field292) {
                return false;
            }
            field412.field1847 = 0;
            Statics.field619.method2627(field412.field1853, 0, field292);
            field294 = 0;
            field466 = field298;
            field298 = field297;
            field297 = field293;
            if (field293 == 133) {
                int var1 = field412.method2317();
                int var2 = field412.method2203();
                int var3 = field412.method2342();
                int var4 = field412.method2194();
                class157 var5 = class157.method151(var2);
                if (var5.field2591 != var1 || var5.field2590 != var4 || var5.field2652 != var3) {
                    var5.field2591 = var1;
                    var5.field2590 = var4;
                    var5.field2652 = var3;
                    method1031(var5);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 101) {
                field494 = true;
                Statics.field2393 = field412.method2257();
                Statics.field732 = field412.method2257();
                Statics.field65 = field412.method2194();
                Statics.field1057 = field412.method2257();
                Statics.field1912 = field412.method2257();
                if (Statics.field1912 >= 100) {
                    int var6 = Statics.field2393 * 128 + 64;
                    int var7 = Statics.field732 * 128 + 64;
                    int var8 = method149(var6, var7, Statics.field1829) - Statics.field65;
                    int var9 = var6 - Statics.field1903;
                    int var10 = var8 - Statics.field622;
                    int var11 = var7 - Statics.field602;
                    int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                    Statics.field2791 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
                    Statics.field925 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
                    if (Statics.field2791 < 128) {
                        Statics.field2791 = 128;
                    }
                    if (Statics.field2791 > 383) {
                        Statics.field2791 = 383;
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 107) {
                String var13 = field412.method2159();
                int var14 = field412.method2194();
                byte var15 = field412.method2162();
                boolean var16 = false;
                if (var15 == -128) {
                    var16 = true;
                }
                if (var16) {
                    if (Statics.field1289 == 0) {
                        field293 = -1;
                        return true;
                    }
                    boolean var17 = false;
                    int var18;
                    for (var18 = 0; var18 < Statics.field1289 && (!Statics.field578[var18].field575.equals(var13) || Statics.field578[var18].field572 != var14); var18++) {
                    }
                    if (var18 < Statics.field1289) {
                        while (var18 < Statics.field1289 - 1) {
                            Statics.field578[var18] = Statics.field578[var18 + 1];
                            var18++;
                        }
                        Statics.field1289--;
                        Statics.field578[Statics.field1289] = null;
                    }
                } else {
                    field412.method2159();
                    class22 var19 = new class22();
                    var19.field575 = var13;
                    var19.field571 = Statics.method2579(var19.field575, Statics.field250);
                    var19.field572 = var14;
                    var19.field573 = var15;
                    int var20;
                    for (var20 = Statics.field1289 - 1; var20 >= 0; var20--) {
                        int var21 = Statics.field578[var20].field571.compareTo(var19.field571);
                        if (var21 == 0) {
                            Statics.field578[var20].field572 = var14;
                            Statics.field578[var20].field573 = var15;
                            if (var13.equals(Statics.field1508.field40)) {
                                Statics.field1993 = var15;
                            }
                            field451 = field435;
                            field293 = -1;
                            return true;
                        }
                        if (var21 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1289 >= Statics.field578.length) {
                        field293 = -1;
                        return true;
                    }
                    for (int var22 = Statics.field1289 - 1; var22 > var20; var22--) {
                        Statics.field578[var22 + 1] = Statics.field578[var22];
                    }
                    if (Statics.field1289 == 0) {
                        Statics.field578 = new class22[100];
                    }
                    Statics.field578[var20 + 1] = var19;
                    Statics.field1289++;
                    if (var13.equals(Statics.field1508.field40)) {
                        Statics.field1993 = var15;
                    }
                }
                field451 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 78) {
                int var23 = field412.method2297();
                class4 var24 = (class4) field431.method3274((long) var23);
                if (var24 != null) {
                    method2539(var24, true);
                }
                if (field401 != null) {
                    method1031(field401);
                    field401 = null;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 106) {
                method2959();
                field293 = -1;
                return false;
            }
            if (field293 == 58) {
                method498(false);
                field293 = -1;
                return true;
            }
            if (field293 == 14) {
                int var25 = field412.method2297();
                boolean var26 = field412.method2340() == 1;
                class157 var27 = class157.method151(var25);
                if (var27.field2563 != var26) {
                    var27.field2563 = var26;
                    method1031(var27);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 8) {
                String var28 = field412.method2159();
                Statics.field254 = var28;
                try {
                    String var29 = Statics.field3035.getParameter(class173.field2860.field2863);
                    String var30 = Statics.field3035.getParameter(class173.field2857.field2863);
                    String var31 = var29 + "settings=" + var28 + "; version=1; path=/; domain=" + var30;
                    String var32;
                    if (var28.length() == 0) {
                        var32 = var31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var32 = var31 + "; Expires=" + class102.method1993(class106.method487() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class123.method2487(Statics.field3035, "document.cookie=\"" + var32 + "\"");
                } catch (Throwable var279) {
                }
                field293 = -1;
                return true;
            }
            if (field293 == 85) {
                field482 = field412.method2257();
                field293 = -1;
                return true;
            }
            if (field293 == 234) {
                method1612();
                field414 = field412.method2257();
                field445 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 115) {
                method1612();
                int var34 = field412.method2203();
                int var35 = field412.method2291();
                int var36 = field412.method2340();
                field388[var35] = var34;
                field386[var35] = var36;
                field331[var35] = 1;
                for (int var37 = 0; var37 < 98; var37++) {
                    if (var34 >= class145.field2150[var37]) {
                        field331[var35] = var37 + 2;
                    }
                }
                field438[++field439 - 1 & 0x1F] = var35;
                field293 = -1;
                return true;
            }
            if (field293 == 20) {
                class23 var38 = new class23();
                var38.field583 = field412.method2159();
                var38.field588 = field412.method2194();
                int var39 = field412.method2297();
                var38.field584 = var39;
                method500(45);
                Statics.field619.method2625();
                Statics.field619 = null;
                class29.method2755(var38);
                field293 = -1;
                return false;
            }
            if (field293 == 53) {
                method1612();
                field415 = field412.method2308();
                field445 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 82) {
                int var40 = field412.method2317();
                byte var41 = field412.method2189();
                class159.field2681[var40] = var41;
                if (class159.field2680[var40] != var41) {
                    class159.field2680[var40] = var41;
                    method2767(var40);
                }
                field434[++field413 - 1 & 0x1F] = var40;
                field293 = -1;
                return true;
            }
            if (field293 == 50) {
                field381 = 1;
                field372 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 132) {
                int var42 = field412.method2306();
                int var43 = field412.method2297();
                int var44 = field412.method2194();
                if (var44 == 65535) {
                    var44 = -1;
                }
                class157 var45 = class157.method151(var43);
                if (var45.field2550) {
                    var45.field2594 = var44;
                    var45.field2659 = var42;
                    class46 var47 = class46.method712(var44);
                    var45.field2591 = var47.field1028;
                    var45.field2590 = var47.field1021;
                    var45.field2593 = var47.field1019;
                    var45.field2589 = var47.field1023;
                    var45.field2579 = var47.field1052;
                    var45.field2652 = var47.field1048;
                    if (var47.field1025 == 1) {
                        var45.field2597 = 1;
                    } else {
                        var45.field2597 = 2;
                    }
                    if (var45.field2560 > 0) {
                        var45.field2652 = var45.field2652 * 32 / var45.field2560;
                    }
                    method1031(var45);
                } else if (var44 == -1) {
                    var45.field2583 = 0;
                    field293 = -1;
                    return true;
                } else {
                    class46 var46 = class46.method712(var44);
                    var45.field2583 = 4;
                    var45.field2584 = var44;
                    var45.field2591 = var46.field1028;
                    var45.field2590 = var46.field1021;
                    var45.field2652 = var46.field1048 * 100 / var42;
                    method1031(var45);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 113) {
                int var48 = field412.method2342();
                class14 var49 = (class14) class14.field201.method3274((long) var48);
                if (var49 != null) {
                    var49.method3392();
                }
                field436[++field370 - 1 & 0x1F] = var48 & 0x7FFF;
                field293 = -1;
                return true;
            }
            if (field293 == 139) {
                int var50 = field412.method2306();
                String var51 = field412.method2159();
                class157 var52 = class157.method151(var50);
                if (!var51.equals(var52.field2582)) {
                    var52.field2582 = var51;
                    method1031(var52);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 17) {
                field494 = true;
                Statics.field2870 = field412.method2257();
                Statics.field528 = field412.method2257();
                Statics.field1888 = field412.method2194();
                Statics.field1273 = field412.method2257();
                Statics.field1053 = field412.method2257();
                if (Statics.field1053 >= 100) {
                    Statics.field1903 = Statics.field2870 * 128 + 64;
                    Statics.field602 = Statics.field528 * 128 + 64;
                    Statics.field622 = method149(Statics.field1903, Statics.field602, Statics.field1829) - Statics.field1888;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 170) {
                int var53 = field412.method2194();
                int var54 = field412.method2257();
                int var55 = field412.method2194();
                if (field299 != 0 && var54 != 0 && field488 < 50) {
                    field489[field488] = var53;
                    field490[field488] = var54;
                    field491[field488] = var55;
                    field303[field488] = null;
                    field492[field488] = 0;
                    field488++;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 46) {
                int var59 = field412.method2195();
                int var60 = field412.method2202();
                class157 var61 = class157.method151(var60);
                if (var61.field2583 != 1 || var61.field2584 != var59) {
                    var61.field2583 = 1;
                    var61.field2584 = var59;
                    method1031(var61);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 49) {
                for (int var62 = 0; var62 < class159.field2680.length; var62++) {
                    if (class159.field2681[var62] != class159.field2680[var62]) {
                        class159.field2680[var62] = class159.field2681[var62];
                        method2767(var62);
                        field434[++field413 - 1 & 0x1F] = var62;
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 160) {
                Statics.field520 = field412.method2340();
                Statics.field1535 = field412.method2187();
                field293 = -1;
                return true;
            }
            if (field293 == 209) {
                for (int var63 = 0; var63 < Statics.field1058; var63++) {
                    class47 var64 = (class47) class47.field1060.method3231((long) var63);
                    class47 var65;
                    if (var64 == null) {
                        byte[] var66 = Statics.field1063.method2852(16, var63);
                        class47 var67 = new class47();
                        if (var66 != null) {
                            var67.method899(new class110(var66));
                        }
                        class47.field1060.method3228(var67, (long) var63);
                        var65 = var67;
                    } else {
                        var65 = var64;
                    }
                    if (var65 != null) {
                        class159.field2681[var63] = 0;
                        class159.field2680[var63] = 0;
                    }
                }
                method1612();
                field413 += 32;
                field293 = -1;
                return true;
            }
            if (field293 == 183) {
                int var69 = field412.method2203();
                class157 var70 = class157.method151(var69);
                for (int var71 = 0; var71 < var70.field2656.length; var71++) {
                    var70.field2656[var71] = -1;
                    var70.field2656[var71] = 0;
                }
                method1031(var70);
                field293 = -1;
                return true;
            }
            if (field293 == 163) {
                int var72 = field412.method2317();
                int var73 = field412.method2317();
                int var74 = field412.method2202();
                class157 var75 = class157.method151(var74);
                var75.field2650 = (var72 << 16) + var73;
                field293 = -1;
                return true;
            }
            if (field293 == 28) {
                int var76 = field412.method2174();
                boolean var77 = field412.method2257() == 1;
                String var78 = "";
                boolean var79 = false;
                if (var77) {
                    var78 = field412.method2159();
                    if (method27(var78)) {
                        var79 = true;
                    }
                }
                String var80 = field412.method2159();
                if (!var79) {
                    class10.method591(var76, var78, var80);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 238) {
                int var81 = field412.method2197();
                int var82 = field412.method2203();
                class157 var83 = class157.method151(var82);
                if (var83.field2587 != var81 || var81 == -1) {
                    var83.field2587 = var81;
                    var83.field2545 = 0;
                    var83.field2661 = 0;
                    method1031(var83);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 134) {
                field310 = field412.method2257();
                field465 = field412.method2257();
                field293 = -1;
                return true;
            }
            if (field293 == 240) {
                field265 = field412.method2257();
                if (field265 == 1) {
                    field266 = field412.method2194();
                }
                if (field265 >= 2 && field265 <= 6) {
                    if (field265 == 2) {
                        field263 = 64;
                        field272 = 64;
                    }
                    if (field265 == 3) {
                        field263 = 0;
                        field272 = 64;
                    }
                    if (field265 == 4) {
                        field263 = 128;
                        field272 = 64;
                    }
                    if (field265 == 5) {
                        field263 = 64;
                        field272 = 0;
                    }
                    if (field265 == 6) {
                        field263 = 64;
                        field272 = 128;
                    }
                    field265 = 2;
                    field268 = field412.method2194();
                    field284 = field412.method2194();
                    field501 = field412.method2257();
                }
                if (field265 == 10) {
                    field267 = field412.method2194();
                }
                field293 = -1;
                return true;
            }
            if (field293 == 22) {
                field451 = field435;
                if (field292 == 0) {
                    field473 = null;
                    field474 = null;
                    Statics.field1289 = 0;
                    Statics.field578 = null;
                    field293 = -1;
                    return true;
                }
                field474 = field412.method2159();
                long var84 = field412.method2167();
                field473 = class212.method3403(var84);
                Statics.field147 = field412.method2162();
                int var86 = field412.method2257();
                if (var86 == 255) {
                    field293 = -1;
                    return true;
                }
                Statics.field1289 = var86;
                class22[] var87 = new class22[100];
                for (int var88 = 0; var88 < Statics.field1289; var88++) {
                    var87[var88] = new class22();
                    var87[var88].field575 = field412.method2159();
                    var87[var88].field571 = Statics.method2579(var87[var88].field575, Statics.field250);
                    var87[var88].field572 = field412.method2194();
                    var87[var88].field573 = field412.method2162();
                    field412.method2159();
                    if (var87[var88].field575.equals(Statics.field1508.field40)) {
                        Statics.field1993 = var87[var88].field573;
                    }
                }
                boolean var89 = false;
                int var90 = Statics.field1289;
                while (var90 > 0) {
                    boolean var91 = true;
                    var90--;
                    for (int var92 = 0; var92 < var90; var92++) {
                        if (var87[var92].field571.compareTo(var87[var92 + 1].field571) > 0) {
                            class22 var93 = var87[var92];
                            var87[var92] = var87[var92 + 1];
                            var87[var92 + 1] = var93;
                            var91 = false;
                        }
                    }
                    if (var91) {
                        break;
                    }
                }
                Statics.field578 = var87;
                field293 = -1;
                return true;
            }
            if (field293 == 123) {
                field375 = 0;
                field270 = 0;
                method2464();
                int var94 = field412.method2401(8);
                if (var94 < field368) {
                    for (int var95 = var94; var95 < field368; var95++) {
                        field376[++field375 - 1] = field337[var95];
                    }
                }
                if (var94 > field368) {
                    throw new RuntimeException("");
                }
                field368 = 0;
                for (int var96 = 0; var96 < var94; var96++) {
                    int var97 = field337[var96];
                    class3 var98 = field367[var97];
                    int var99 = field412.method2401(1);
                    if (var99 == 0) {
                        field337[++field368 - 1] = var97;
                        var98.field781 = field257;
                    } else {
                        int var100 = field412.method2401(2);
                        if (var100 == 0) {
                            field337[++field368 - 1] = var97;
                            var98.field781 = field257;
                            field371[++field270 - 1] = var97;
                        } else if (var100 == 1) {
                            field337[++field368 - 1] = var97;
                            var98.field781 = field257;
                            int var101 = field412.method2401(3);
                            var98.method618(var101, false);
                            int var102 = field412.method2401(1);
                            if (var102 == 1) {
                                field371[++field270 - 1] = var97;
                            }
                        } else if (var100 == 2) {
                            field337[++field368 - 1] = var97;
                            var98.field781 = field257;
                            int var103 = field412.method2401(3);
                            var98.method618(var103, true);
                            int var104 = field412.method2401(3);
                            var98.method618(var104, true);
                            int var105 = field412.method2401(1);
                            if (var105 == 1) {
                                field371[++field270 - 1] = var97;
                            }
                        } else if (var100 == 3) {
                            field376[++field375 - 1] = var97;
                        }
                    }
                }
                method713();
                for (int var106 = 0; var106 < field270; var106++) {
                    int var107 = field371[var106];
                    class3 var108 = field367[var107];
                    int var109 = field412.method2257();
                    if ((var109 & 0x20) != 0) {
                        var109 += field412.method2257() << 8;
                    }
                    method2093(var107, var108, var109);
                }
                for (int var110 = 0; var110 < field375; var110++) {
                    int var111 = field376[var110];
                    if (field257 != field367[var111].field781) {
                        field367[var111] = null;
                    }
                }
                if (field292 != field412.field1847) {
                    throw new RuntimeException(field412.field1847 + class2.field19 + field292);
                }
                for (int var112 = 0; var112 < field368; var112++) {
                    if (field367[field337[var112]] == null) {
                        throw new RuntimeException(var112 + class2.field19 + field368);
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 56) {
                int var113 = field412.method2257();
                String var114 = field412.method2159();
                int var115 = field412.method2291();
                if (var115 >= 1 && var115 <= 8) {
                    if (var114.equalsIgnoreCase("null")) {
                        var114 = null;
                    }
                    field340[var115 - 1] = var114;
                    field379[var115 - 1] = var113 == 0;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 16) {
                int var116 = field412.method2257();
                int var117 = field412.method2187();
                int var118 = field412.method2187();
                Statics.field1829 = var117 >> 1;
                Statics.field1508.method611(var116, var118, (var117 & 0x1) == 1);
                field293 = -1;
                return true;
            }
            if (field293 == 243) {
                field480 = field412.method2257();
                if (field480 == 255) {
                    field480 = 0;
                }
                field332 = field412.method2257();
                if (field332 == 255) {
                    field332 = 0;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 117) {
                while (field412.field1847 < field292) {
                    int var119 = field412.method2257();
                    boolean var120 = (var119 & 0x1) == 1;
                    String var121 = field412.method2159();
                    String var122 = field412.method2159();
                    field412.method2159();
                    for (int var123 = 0; var123 < field493; var123++) {
                        class8 var124 = field508[var123];
                        if (var120) {
                            if (var122.equals(var124.field135)) {
                                var124.field135 = var121;
                                var124.field129 = var122;
                                var121 = null;
                                break;
                            }
                        } else if (var121.equals(var124.field135)) {
                            var124.field135 = var121;
                            var124.field129 = var122;
                            var121 = null;
                            break;
                        }
                    }
                    if (var121 != null && field493 < 400) {
                        class8 var125 = new class8();
                        field508[field493] = var125;
                        var125.field135 = var121;
                        var125.field129 = var122;
                        field493++;
                    }
                }
                field372 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 70) {
                Statics.field1535 = field412.method2257();
                Statics.field520 = field412.method2187();
                for (int var126 = Statics.field520; var126 < Statics.field520 + 8; var126++) {
                    for (int var127 = Statics.field1535; var127 < Statics.field1535 + 8; var127++) {
                        if (field432[Statics.field1829][var126][var127] != null) {
                            field432[Statics.field1829][var126][var127] = null;
                            method1984(var126, var127);
                        }
                    }
                }
                for (class15 var128 = (class15) field383.method3303(); var128 != null; var128 = (class15) field383.method3305()) {
                    if (var128.field207 >= Statics.field520 && var128.field207 < Statics.field520 + 8 && var128.field217 >= Statics.field1535 && var128.field217 < Statics.field1535 + 8 && Statics.field1829 == var128.field208) {
                        var128.field215 = 0;
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 23) {
                int var129 = field412.method2342();
                int var130 = field412.method2203();
                int var131 = field412.method2187();
                class4 var132 = (class4) field431.method3274((long) var130);
                if (var132 != null) {
                    method2539(var132, var132.field58 != var129);
                }
                class4 var133 = new class4();
                var133.field58 = var129;
                var133.field57 = var131;
                field431.method3282(var133, (long) var130);
                method580(var129);
                class33.method113(var129);
                class157 var134 = class157.method151(var130);
                if (var134 != null) {
                    method1031(var134);
                }
                if (field401 != null) {
                    method1031(field401);
                    field401 = null;
                }
                method122();
                if (field409 != -1) {
                    Statics.method2752(field409, 1);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 196) {
                method498(true);
                field293 = -1;
                return true;
            }
            if (field293 == 131) {
                for (int var135 = 0; var135 < field367.length; var135++) {
                    if (field367[var135] != null) {
                        field367[var135].field764 = -1;
                    }
                }
                for (int var136 = 0; var136 < field286.length; var136++) {
                    if (field286[var136] != null) {
                        field286[var136].field764 = -1;
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 39) {
                int var137 = field412.method2257();
                if (field412.method2257() == 0) {
                    field507[var137] = new class203();
                    field412.field1847 += 18;
                } else {
                    field412.field1847--;
                    field507[var137] = new class203(field412, false);
                }
                field443 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 236) {
                field412.field1847 += 28;
                if (field412.method2249()) {
                    class140.method497(field412, field412.field1847 - 28);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 29) {
                if (field409 != -1) {
                    Statics.method2752(field409, 0);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 26) {
                field264 = field412.method2317() * 30;
                field445 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 52 || field293 == 173 || field293 == 100 || field293 == 249 || field293 == 31 || field293 == 137 || field293 == 233 || field293 == 199 || field293 == 156 || field293 == 12) {
                method1883();
                field293 = -1;
                return true;
            }
            if (field293 == 212) {
                int var138 = field292 + field412.field1847;
                int var139 = field412.method2194();
                int var140 = field412.method2194();
                if (field409 != var139) {
                    field409 = var139;
                    method580(field409);
                    class33.method113(field409);
                    for (int var141 = 0; var141 < 100; var141++) {
                        field455[var141] = true;
                    }
                }
                while (var140-- > 0) {
                    int var142 = field412.method2297();
                    int var143 = field412.method2194();
                    int var144 = field412.method2257();
                    class4 var145 = (class4) field431.method3274((long) var142);
                    if (var145 != null && var145.field58 != var143) {
                        method2539(var145, true);
                        var145 = null;
                    }
                    if (var145 == null) {
                        class4 var146 = new class4();
                        var146.field58 = var143;
                        var146.field57 = var144;
                        field431.method3282(var146, (long) var142);
                        method580(var143);
                        class33.method113(var143);
                        class157 var147 = class157.method151(var142);
                        if (var147 != null) {
                            method1031(var147);
                        }
                        if (field401 != null) {
                            method1031(field401);
                            field401 = null;
                        }
                        method122();
                        if (field409 != -1) {
                            Statics.method2752(field409, 1);
                        }
                        var145 = var146;
                    }
                    var145.field59 = true;
                }
                for (class4 var149 = (class4) field431.method3269(); var149 != null; var149 = (class4) field431.method3270()) {
                    if (var149.field59) {
                        var149.field59 = false;
                    } else {
                        method2539(var149, true);
                    }
                }
                field452 = new class179(512);
                while (field412.field1847 < var138) {
                    int var150 = field412.method2297();
                    int var151 = field412.method2194();
                    int var152 = field412.method2194();
                    int var153 = field412.method2297();
                    for (int var154 = var151; var154 <= var152; var154++) {
                        long var155 = ((long) var150 << 32) + (long) var154;
                        field452.method3282(new class184(var153), var155);
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 215) {
                int var157 = field412.method2194();
                if (var157 == 65535) {
                    var157 = -1;
                }
                int var158 = field412.method2203();
                int var159 = field412.method2342();
                if (var159 == 65535) {
                    var159 = -1;
                }
                int var160 = field412.method2306();
                for (int var161 = var159; var161 <= var157; var161++) {
                    long var162 = ((long) var160 << 32) + (long) var161;
                    class191 var164 = field452.method3274(var162);
                    if (var164 != null) {
                        var164.method3392();
                    }
                    field452.method3282(new class184(var158), var162);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 3) {
                int var165 = field412.method2194();
                int var166 = field412.method2297();
                class159.field2681[var165] = var166;
                if (class159.field2680[var165] != var166) {
                    class159.field2680[var165] = var166;
                    method2767(var165);
                }
                field434[++field413 - 1 & 0x1F] = var165;
                field293 = -1;
                return true;
            }
            if (field293 == 40) {
                int var167 = field412.method2203();
                int var168 = field412.method2194();
                class157 var169 = class157.method151(var167);
                if (var169.field2583 != 2 || var169.field2584 != var168) {
                    var169.field2583 = 2;
                    var169.field2584 = var168;
                    method1031(var169);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 37) {
                int var170 = field412.method2202();
                int var171 = field412.method2194();
                int var172 = var171 >> 10 & 0x1F;
                int var173 = var171 >> 5 & 0x1F;
                int var174 = var171 & 0x1F;
                int var175 = (var174 << 3) + (var172 << 19) + (var173 << 11);
                class157 var176 = class157.method151(var170);
                if (var176.field2568 != var175) {
                    var176.field2568 = var175;
                    method1031(var176);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 128) {
                while (field412.field1847 < field292) {
                    boolean var177 = field412.method2257() == 1;
                    String var178 = field412.method2159();
                    String var179 = field412.method2159();
                    int var180 = field412.method2194();
                    int var181 = field412.method2257();
                    int var182 = field412.method2257();
                    boolean var183 = (var182 & 0x2) != 0;
                    boolean var184 = (var182 & 0x1) != 0;
                    if (var180 > 0) {
                        field412.method2159();
                        field412.method2257();
                        field412.method2297();
                    }
                    field412.method2159();
                    for (int var185 = 0; var185 < field500; var185++) {
                        class16 var186 = field394[var185];
                        if (var177) {
                            if (var179.equals(var186.field230)) {
                                var186.field230 = var178;
                                var186.field219 = var179;
                                var178 = null;
                                break;
                            }
                        } else if (var178.equals(var186.field230)) {
                            if (var186.field223 != var180) {
                                boolean var187 = true;
                                for (class35 var188 = (class35) field503.method3255(); var188 != null; var188 = (class35) field503.method3253()) {
                                    if (var188.field794.equals(var178)) {
                                        if (var180 != 0 && var188.field795 == 0) {
                                            var188.method3391();
                                            var187 = false;
                                        } else if (var180 == 0 && var188.field795 != 0) {
                                            var188.method3391();
                                            var187 = false;
                                        }
                                    }
                                }
                                if (var187) {
                                    field503.method3261(new class35(var178, var180));
                                }
                                var186.field223 = var180;
                            }
                            var186.field219 = var179;
                            var186.field221 = var181;
                            var186.field222 = var183;
                            var186.field225 = var184;
                            var178 = null;
                            break;
                        }
                    }
                    if (var178 != null && field500 < 400) {
                        class16 var189 = new class16();
                        field394[field500] = var189;
                        var189.field230 = var178;
                        var189.field219 = var179;
                        var189.field223 = var180;
                        var189.field221 = var181;
                        var189.field222 = var183;
                        var189.field225 = var184;
                        field500++;
                    }
                }
                field381 = 2;
                field372 = field435;
                boolean var190 = false;
                int var191 = field500;
                while (var191 > 0) {
                    boolean var192 = true;
                    var191--;
                    for (int var193 = 0; var193 < var191; var193++) {
                        boolean var194 = false;
                        class16 var195 = field394[var193];
                        class16 var196 = field394[var193 + 1];
                        if (field400 != var195.field223 && field400 == var196.field223) {
                            var194 = true;
                        }
                        if (!var194 && var195.field223 == 0 && var196.field223 != 0) {
                            var194 = true;
                        }
                        if (!var194 && !var195.field222 && var196.field222) {
                            var194 = true;
                        }
                        if (!var194 && !var195.field225 && var196.field225) {
                            var194 = true;
                        }
                        if (var194) {
                            class16 var197 = field394[var193];
                            field394[var193] = field394[var193 + 1];
                            field394[var193 + 1] = var197;
                            var192 = false;
                        }
                    }
                    if (var192) {
                        break;
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 177) {
                method2893(true);
                field293 = -1;
                return true;
            }
            if (field293 == 194) {
                int var198 = field412.method2257();
                class121[] var199 = class121.method2582();
                int var200 = 0;
                class121 var202;
                while (true) {
                    if (var200 >= var199.length) {
                        var202 = null;
                        break;
                    }
                    class121 var201 = var199[var200];
                    if (var201.field1923 == var198) {
                        var202 = var201;
                        break;
                    }
                    var200++;
                }
                Statics.field996 = var202;
                field293 = -1;
                return true;
            }
            if (field293 == 220) {
                int var203 = field412.method2195();
                field409 = var203;
                method580(var203);
                class33.method113(field409);
                for (int var204 = 0; var204 < 100; var204++) {
                    field455[var204] = true;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 18) {
                int var205 = field412.method2342();
                if (var205 == 65535) {
                    var205 = -1;
                }
                method1316(var205);
                field293 = -1;
                return true;
            }
            if (field293 == 159) {
                int var206 = field412.method2317();
                if (var206 == 65535) {
                    var206 = -1;
                }
                int var207 = field412.method2198();
                if (field483 != 0 && var206 != -1) {
                    class166.method25(Statics.field890, var206, 0, field483, false);
                    field269 = true;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 89) {
                String var208 = field412.method2159();
                String var209 = class206.method3513(class213.method2723(class205.method532(field412)));
                class10.method591(6, var208, var209);
                field293 = -1;
                return true;
            }
            if (field293 == 239) {
                int var210 = field412.method2297();
                int var211 = field412.method2194();
                class157 var212 = class157.method151(var210);
                if (var212 != null && var212.field2553 == 0) {
                    if (var211 > var212.field2638 - var212.field2561) {
                        var211 = var212.field2638 - var212.field2561;
                    }
                    if (var211 < 0) {
                        var211 = 0;
                    }
                    if (var212.field2627 != var211) {
                        var212.field2627 = var211;
                        method1031(var212);
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 73) {
                String var213 = field412.method2159();
                long var214 = field412.method2167();
                long var216 = (long) field412.method2194();
                long var218 = (long) field412.method2267();
                class142[] var220 = new class142[] { class142.field2123, class142.field2121, class142.field2120, class142.field2126, class142.field2125 };
                class142 var221 = (class142) class100.method1415(var220, field412.method2257());
                long var222 = (var216 << 32) + var218;
                boolean var224 = false;
                for (int var225 = 0; var225 < 100; var225++) {
                    if (field306[var225] == var222) {
                        var224 = true;
                        break;
                    }
                }
                if (var221.field2119 && method27(var213)) {
                    var224 = true;
                }
                if (!var224 && field417 == 0) {
                    field306[field468] = var222;
                    field468 = (field468 + 1) % 100;
                    String var226 = class206.method3513(class213.method2723(class205.method532(field412)));
                    if (var221.field2124 == -1) {
                        class10.method2766(9, var213, var226, class212.method821(var214));
                    } else {
                        class10.method2766(9, Statics.method2521(var221.field2124) + var213, var226, class212.method821(var214));
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 222) {
                String var227 = field412.method2159();
                Object[] var228 = new Object[var227.length() + 1];
                for (int var229 = var227.length() - 1; var229 >= 0; var229--) {
                    if (var227.charAt(var229) == 's') {
                        var228[var229 + 1] = field412.method2159();
                    } else {
                        var228[var229 + 1] = Integer.valueOf(field412.method2297());
                    }
                }
                var228[0] = Integer.valueOf(field412.method2297());
                class1 var230 = new class1();
                var230.field9 = var228;
                class33.method16(var230);
                field293 = -1;
                return true;
            }
            if (field293 == 65) {
                int var231 = field412.method2203();
                class157 var232 = class157.method151(var231);
                var232.field2583 = 3;
                var232.field2584 = Statics.field1508.field39.method2999();
                method1031(var232);
                field293 = -1;
                return true;
            }
            if (field293 == 255) {
                Statics.field1535 = field412.method2187();
                Statics.field520 = field412.method2187();
                while (field412.field1847 < field292) {
                    field293 = field412.method2257();
                    method1883();
                }
                field293 = -1;
                return true;
            }
            if (field293 == 98) {
                String var233 = field412.method2159();
                long var234 = (long) field412.method2194();
                long var236 = (long) field412.method2267();
                class142[] var238 = new class142[] { class142.field2123, class142.field2121, class142.field2120, class142.field2126, class142.field2125 };
                class142 var239 = (class142) class100.method1415(var238, field412.method2257());
                long var240 = (var234 << 32) + var236;
                boolean var242 = false;
                for (int var243 = 0; var243 < 100; var243++) {
                    if (field306[var243] == var240) {
                        var242 = true;
                        break;
                    }
                }
                if (method27(var233)) {
                    var242 = true;
                }
                if (!var242 && field417 == 0) {
                    field306[field468] = var240;
                    field468 = (field468 + 1) % 100;
                    String var244 = class206.method3513(class213.method2723(class205.method532(field412)));
                    byte var245;
                    if (var239.field2118) {
                        var245 = 7;
                    } else {
                        var245 = 3;
                    }
                    if (var239.field2124 == -1) {
                        class10.method591(var245, var233, var244);
                    } else {
                        class10.method591(var245, Statics.method2521(var239.field2124) + var233, var244);
                    }
                }
                field293 = -1;
                return true;
            }
            if (field293 == 9) {
                field494 = false;
                for (int var246 = 0; var246 < 5; var246++) {
                    field495[var246] = false;
                }
                field293 = -1;
                return true;
            }
            if (field293 == 171) {
                int var247 = field412.method2297();
                int var248 = field412.method2194();
                if (var247 < -70000) {
                    var248 += 32768;
                }
                class157 var249;
                if (var247 >= 0) {
                    var249 = class157.method151(var247);
                } else {
                    var249 = null;
                }
                if (var249 != null) {
                    for (int var250 = 0; var250 < var249.field2656.length; var250++) {
                        var249.field2656[var250] = 0;
                        var249.field2657[var250] = 0;
                    }
                }
                class14 var251 = (class14) class14.field201.method3274((long) var248);
                if (var251 != null) {
                    for (int var252 = 0; var252 < var251.field196.length; var252++) {
                        var251.field196[var252] = -1;
                        var251.field198[var252] = 0;
                    }
                }
                int var253 = field412.method2194();
                for (int var254 = 0; var254 < var253; var254++) {
                    int var255 = field412.method2194();
                    int var256 = field412.method2340();
                    if (var256 == 255) {
                        var256 = field412.method2306();
                    }
                    if (var249 != null && var254 < var249.field2656.length) {
                        var249.field2656[var254] = var255;
                        var249.field2657[var254] = var256;
                    }
                    class14.method603(var248, var254, var255 - 1, var256);
                }
                if (var249 != null) {
                    method1031(var249);
                }
                method1612();
                field436[++field370 - 1 & 0x1F] = var248 & 0x7FFF;
                field293 = -1;
                return true;
            }
            if (field293 == 224) {
                class194.method8(field412, field292);
                field293 = -1;
                return true;
            }
            if (field293 == 6) {
                int var257 = field412.method2308();
                int var258 = field412.method2196();
                int var259 = field412.method2203();
                class157 var260 = class157.method151(var259);
                int var261 = var260.field2624 + var258;
                int var262 = var260.field2580 + var257;
                if (var260.field2556 != var261 || var260.field2557 != var262) {
                    var260.field2556 = var261;
                    var260.field2557 = var262;
                    method1031(var260);
                }
                field293 = -1;
                return true;
            }
            if (field293 == 192) {
                int var263 = field412.method2297();
                int var264 = field412.method2194();
                if (var263 < -70000) {
                    var264 += 32768;
                }
                class157 var265;
                if (var263 >= 0) {
                    var265 = class157.method151(var263);
                } else {
                    var265 = null;
                }
                while (field412.field1847 < field292) {
                    int var266 = field412.method2174();
                    int var267 = field412.method2194();
                    int var268 = 0;
                    if (var267 != 0) {
                        var268 = field412.method2257();
                        if (var268 == 255) {
                            var268 = field412.method2297();
                        }
                    }
                    if (var265 != null && var266 >= 0 && var266 < var265.field2656.length) {
                        var265.field2656[var266] = var267;
                        var265.field2657[var266] = var268;
                    }
                    class14.method603(var264, var266, var267 - 1, var268);
                }
                if (var265 != null) {
                    method1031(var265);
                }
                method1612();
                field436[++field370 - 1 & 0x1F] = var264 & 0x7FFF;
                field293 = -1;
                return true;
            }
            if (field293 == 43) {
                boolean var269 = field412.method2257() == 1;
                if (var269) {
                    Statics.field95 = class106.method487() - field412.method2167();
                    Statics.field12 = new class204(field412, true);
                } else {
                    Statics.field12 = null;
                }
                field444 = field435;
                field293 = -1;
                return true;
            }
            if (field293 == 155) {
                int var270 = field412.method2202();
                Statics.field1872 = Statics.field1950.method2533(var270);
                field293 = -1;
                return true;
            }
            if (field293 == 35) {
                method2893(false);
                field293 = -1;
                return true;
            }
            if (field293 == 138) {
                int var271 = field412.method2257();
                int var272 = field412.method2257();
                int var273 = field412.method2257();
                int var274 = field412.method2257();
                field495[var271] = true;
                field496[var271] = var272;
                field497[var271] = var273;
                field498[var271] = var274;
                field404[var271] = 0;
                field293 = -1;
                return true;
            }
            class139.method2439("" + field293 + class2.field19 + field298 + class2.field19 + field466 + class2.field19 + field292, (Throwable) null);
            method2959();
        } catch (IOException var280) {
            method509();
        } catch (Exception var281) {
            String var277 = "" + field293 + class2.field19 + field298 + class2.field19 + field466 + class2.field19 + field292 + class2.field19 + (Statics.field73 + Statics.field1508.field753[0]) + class2.field19 + (Statics.field1821 + Statics.field1508.field776[0]) + class2.field19;
            for (int var278 = 0; var278 < field292 && var278 < 50; var278++) {
                var277 = var277 + field412.field1853[var278] + class2.field19;
            }
            class139.method2439(var277, var281);
            method2959();
        }
        return true;
    }

    @ObfuscatedName("ct.ab(I)V")
    public static final void method1883() {
        if (field293 == 137) {
            int var0 = field412.method2194();
            int var1 = field412.method2257();
            int var2 = (var1 >> 4 & 0x7) + Statics.field520;
            int var3 = (var1 & 0x7) + Statics.field1535;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class182 var4 = field432[Statics.field1829][var2][var3];
                if (var4 != null) {
                    for (class26 var5 = (class26) var4.method3303(); var5 != null; var5 = (class26) var4.method3305()) {
                        if ((var0 & 0x7FFF) == var5.field623) {
                            var5.method3392();
                            break;
                        }
                    }
                    if (var4.method3303() == null) {
                        field432[Statics.field1829][var2][var3] = null;
                    }
                    method1984(var2, var3);
                }
            }
            return;
        }
        if (field293 == 52) {
            int var6 = field412.method2257();
            int var7 = (var6 >> 4 & 0x7) + Statics.field520;
            int var8 = (var6 & 0x7) + Statics.field1535;
            int var9 = field412.method2194();
            int var10 = field412.method2257();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = field412.method2257();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var14 = var11 + 1;
                if (Statics.field1508.field753[0] >= var7 - var14 && Statics.field1508.field753[0] <= var7 + var14 && Statics.field1508.field776[0] >= var8 - var14 && Statics.field1508.field776[0] <= var8 + var14 && field487 != 0 && var12 > 0 && field488 < 50) {
                    field489[field488] = var9;
                    field490[field488] = var12;
                    field491[field488] = var13;
                    field303[field488] = null;
                    field492[field488] = (var7 << 16) + (var8 << 8) + var11;
                    field488++;
                }
            }
        }
        if (field293 == 233) {
            int var15 = field412.method2195();
            int var16 = field412.method2195();
            int var17 = field412.method2187();
            int var18 = (var17 >> 4 & 0x7) + Statics.field520;
            int var19 = (var17 & 0x7) + Statics.field1535;
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class26 var20 = new class26();
                var20.field623 = var15;
                var20.field626 = var16;
                if (field432[Statics.field1829][var18][var19] == null) {
                    field432[Statics.field1829][var18][var19] = new class182();
                }
                field432[Statics.field1829][var18][var19].method3323(var20);
                method1984(var18, var19);
            }
        } else if (field293 == 249) {
            int var21 = field412.method2257();
            int var22 = (var21 >> 4 & 0x7) + Statics.field520;
            int var23 = (var21 & 0x7) + Statics.field1535;
            int var24 = field412.method2194();
            int var25 = field412.method2257();
            int var26 = field412.method2194();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var27 = var22 * 128 + 64;
                int var28 = var23 * 128 + 64;
                class27 var29 = new class27(var24, Statics.field1829, var27, var28, method149(var27, var28, Statics.field1829) - var25, var26, field257);
                field385.method3323(var29);
            }
        } else {
            if (field293 == 100) {
                int var30 = field412.method2317();
                int var31 = field412.method2194();
                int var32 = field412.method2187();
                int var33 = (var32 >> 4 & 0x7) + Statics.field520;
                int var34 = (var32 & 0x7) + Statics.field1535;
                byte var35 = field412.method2188();
                int var36 = field412.method2195();
                byte var37 = field412.method2189();
                int var38 = field412.method2187();
                int var39 = var38 >> 2;
                int var40 = var38 & 0x3;
                int var41 = field462[var39];
                int var42 = field412.method2317();
                byte var43 = field412.method2189();
                byte var44 = field412.method2188();
                class3 var45;
                if (field374 == var36) {
                    var45 = Statics.field1508;
                } else {
                    var45 = field367[var36];
                }
                if (var45 != null) {
                    class37 var46 = class37.method7(var42);
                    int var47;
                    int var48;
                    if (var40 == 1 || var40 == 3) {
                        var47 = var46.field875;
                        var48 = var46.field854;
                    } else {
                        var47 = var46.field854;
                        var48 = var46.field875;
                    }
                    int var49 = (var47 >> 1) + var33;
                    int var50 = (var47 + 1 >> 1) + var33;
                    int var51 = (var48 >> 1) + var34;
                    int var52 = (var48 + 1 >> 1) + var34;
                    int[][] var53 = class6.field90[Statics.field1829];
                    int var54 = var53[var49][var51] + var53[var50][var51] + var53[var49][var52] + var53[var50][var52] >> 2;
                    int var55 = (var33 << 7) + (var47 << 6);
                    int var56 = (var34 << 7) + (var48 << 6);
                    class99 var57 = var46.method662(var39, var40, var53, var55, var54, var56);
                    if (var57 != null) {
                        method1795(Statics.field1829, var33, var34, var41, -1, 0, 0, var30 + 1, var31 + 1);
                        var45.field42 = field257 + var30;
                        var45.field43 = field257 + var31;
                        var45.field47 = var57;
                        var45.field44 = var33 * 128 + var47 * 64;
                        var45.field37 = var34 * 128 + var48 * 64;
                        var45.field45 = var54;
                        if (var44 > var43) {
                            byte var58 = var44;
                            var44 = var43;
                            var43 = var58;
                        }
                        if (var35 > var37) {
                            byte var59 = var35;
                            var35 = var37;
                            var37 = var59;
                        }
                        var45.field48 = var33 + var44;
                        var45.field50 = var33 + var43;
                        var45.field49 = var34 + var35;
                        var45.field51 = var34 + var37;
                    }
                }
            }
            if (field293 == 199) {
                int var60 = field412.method2342();
                int var61 = field412.method2257();
                int var62 = (var61 >> 4 & 0x7) + Statics.field520;
                int var63 = (var61 & 0x7) + Statics.field1535;
                int var64 = field412.method2340();
                int var65 = var64 >> 2;
                int var66 = var64 & 0x3;
                int var67 = field462[var65];
                if (var62 >= 0 && var63 >= 0 && var62 < 103 && var63 < 103) {
                    if (var67 == 0) {
                        class81 var68 = Statics.field186.method1638(Statics.field1829, var62, var63);
                        if (var68 != null) {
                            int var69 = var68.field1426 >> 14 & 0x7FFF;
                            if (var65 == 2) {
                                var68.field1428 = new class11(var69, 2, var66 + 4, Statics.field1829, var62, var63, var60, false, var68.field1428);
                                var68.field1425 = new class11(var69, 2, var66 + 1 & 0x3, Statics.field1829, var62, var63, var60, false, var68.field1425);
                            } else {
                                var68.field1428 = new class11(var69, var65, var66, Statics.field1829, var62, var63, var60, false, var68.field1428);
                            }
                        }
                    }
                    if (var67 == 1) {
                        class88 var70 = Statics.field186.method1639(Statics.field1829, var62, var63);
                        if (var70 != null) {
                            int var71 = var70.field1504 >> 14 & 0x7FFF;
                            if (var65 == 4 || var65 == 5) {
                                var70.field1502 = new class11(var71, 4, var66, Statics.field1829, var62, var63, var60, false, var70.field1502);
                            } else if (var65 == 6) {
                                var70.field1502 = new class11(var71, 4, var66 + 4, Statics.field1829, var62, var63, var60, false, var70.field1502);
                            } else if (var65 == 7) {
                                var70.field1502 = new class11(var71, 4, (var66 + 2 & 0x3) + 4, Statics.field1829, var62, var63, var60, false, var70.field1502);
                            } else if (var65 == 8) {
                                var70.field1502 = new class11(var71, 4, var66 + 4, Statics.field1829, var62, var63, var60, false, var70.field1502);
                                var70.field1495 = new class11(var71, 4, (var66 + 2 & 0x3) + 4, Statics.field1829, var62, var63, var60, false, var70.field1495);
                            }
                        }
                    }
                    if (var67 == 2) {
                        class92 var72 = Statics.field186.method1664(Statics.field1829, var62, var63);
                        if (var65 == 11) {
                            var65 = 10;
                        }
                        if (var72 != null) {
                            var72.field1562 = new class11(var72.field1570 >> 14 & 0x7FFF, var65, var66, Statics.field1829, var62, var63, var60, false, var72.field1562);
                        }
                    }
                    if (var67 == 3) {
                        class87 var73 = Statics.field186.method1641(Statics.field1829, var62, var63);
                        if (var73 != null) {
                            var73.field1493 = new class11(var73.field1487 >> 14 & 0x7FFF, 22, var66, Statics.field1829, var62, var63, var60, false, var73.field1493);
                        }
                    }
                }
            } else if (field293 == 156) {
                int var74 = field412.method2291();
                int var75 = (var74 >> 4 & 0x7) + Statics.field520;
                int var76 = (var74 & 0x7) + Statics.field1535;
                int var77 = field412.method2340();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field462[var78];
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    method1795(Statics.field1829, var75, var76, var80, -1, var78, var79, 0, -1);
                }
            } else if (field293 == 12) {
                int var81 = field412.method2257();
                int var82 = (var81 >> 4 & 0x7) + Statics.field520;
                int var83 = (var81 & 0x7) + Statics.field1535;
                int var84 = field412.method2291();
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                int var87 = field462[var85];
                int var88 = field412.method2195();
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                    method1795(Statics.field1829, var82, var83, var87, var88, var85, var86, 0, -1);
                }
            } else if (field293 == 31) {
                int var89 = field412.method2257();
                int var90 = (var89 >> 4 & 0x7) + Statics.field520;
                int var91 = (var89 & 0x7) + Statics.field1535;
                int var92 = var90 + field412.method2162();
                int var93 = var91 + field412.method2162();
                int var94 = field412.method2308();
                int var95 = field412.method2194();
                int var96 = field412.method2257() * 4;
                int var97 = field412.method2257() * 4;
                int var98 = field412.method2194();
                int var99 = field412.method2194();
                int var100 = field412.method2257();
                int var101 = field412.method2257();
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var95 != 65535) {
                    int var102 = var90 * 128 + 64;
                    int var103 = var91 * 128 + 64;
                    int var104 = var92 * 128 + 64;
                    int var105 = var93 * 128 + 64;
                    class7 var106 = new class7(var95, Statics.field1829, var102, var103, method149(var102, var103, Statics.field1829) - var96, field257 + var98, field257 + var99, var100, var101, var94, var97);
                    var106.method72(var104, var105, method149(var104, var105, Statics.field1829) - var97, field257 + var98);
                    field384.method3323(var106);
                }
            } else if (field293 == 173) {
                int var107 = field412.method2257();
                int var108 = (var107 >> 4 & 0x7) + Statics.field520;
                int var109 = (var107 & 0x7) + Statics.field1535;
                int var110 = field412.method2194();
                int var111 = field412.method2194();
                int var112 = field412.method2194();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class182 var113 = field432[Statics.field1829][var108][var109];
                    if (var113 != null) {
                        for (class26 var114 = (class26) var113.method3303(); var114 != null; var114 = (class26) var113.method3305()) {
                            if ((var110 & 0x7FFF) == var114.field623 && var114.field626 == var111) {
                                var114.field626 = var112;
                                break;
                            }
                        }
                        method1984(var108, var109);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.ae(IIIIIIIIIB)V")
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field383.method3303(); var10 != null; var10 = (class15) field383.method3305()) {
            if (var10.field208 == arg0 && var10.field207 == arg1 && var10.field217 == arg2 && var10.field206 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field208 = arg0;
            var9.field206 = arg3;
            var9.field207 = arg1;
            var9.field217 = arg2;
            method2000(var9);
            field383.method3323(var9);
        }
        var9.field211 = arg4;
        var9.field205 = arg5;
        var9.field213 = arg6;
        var9.field214 = arg7;
        var9.field215 = arg8;
    }

    @ObfuscatedName("cw.bx(I)V")
    public static final void method1999() {
        for (class15 var0 = (class15) field383.method3303(); var0 != null; var0 = (class15) field383.method3305()) {
            if (var0.field215 == -1) {
                var0.field214 = 0;
                method2000(var0);
            } else {
                var0.method3392();
            }
        }
    }

    @ObfuscatedName("cw.bj(Ln;I)V")
    public static final void method2000(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field206 == 0) {
            var1 = Statics.field186.method1642(arg0.field208, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 1) {
            var1 = Statics.field186.method1643(arg0.field208, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 2) {
            var1 = Statics.field186.method1644(arg0.field208, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 3) {
            var1 = Statics.field186.method1645(arg0.field208, arg0.field207, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field186.method1646(arg0.field208, arg0.field207, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field212 = var2;
        arg0.field210 = var3;
        arg0.field204 = var4;
    }

    @ObfuscatedName("c.ba(I)V")
    public static final void method125() {
        for (class15 var0 = (class15) field383.method3303(); var0 != null; var0 = (class15) field383.method3305()) {
            if (var0.field215 > 0) {
                var0.field215--;
            }
            if (var0.field215 == 0) {
                if (var0.field212 >= 0) {
                    int var1 = var0.field212;
                    int var2 = var0.field210;
                    class37 var3 = class37.method7(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method659(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1998(var0.field208, var0.field206, var0.field207, var0.field217, var0.field212, var0.field204, var0.field210);
                var0.method3392();
            } else {
                if (var0.field214 > 0) {
                    var0.field214--;
                }
                if (var0.field214 == 0 && var0.field207 >= 1 && var0.field217 >= 1 && var0.field207 <= 102 && var0.field217 <= 102) {
                    if (var0.field211 >= 0) {
                        int var5 = var0.field211;
                        int var6 = var0.field205;
                        class37 var7 = class37.method7(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method659(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1998(var0.field208, var0.field206, var0.field207, var0.field217, var0.field211, var0.field213, var0.field205);
                    var0.field214 = -1;
                    if (var0.field212 == var0.field211 && var0.field212 == -1) {
                        var0.method3392();
                    } else if (var0.field212 == var0.field211 && var0.field213 == var0.field204 && var0.field210 == var0.field205) {
                        var0.method3392();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.bi(IIIIIIII)V")
    public static final void method1998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field252 && Statics.field1829 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field186.method1642(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field186.method1643(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field186.method1644(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field186.method1645(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field186.method1646(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field186.method1633(arg0, arg2, arg3);
                class37 var15 = class37.method7(var12);
                if (var15.field856 != 0) {
                    field307[arg0].method3636(arg2, arg3, var13, var14, var15.field843);
                }
            }
            if (arg1 == 1) {
                Statics.field186.method1634(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field186.method1635(arg0, arg2, arg3);
                class37 var16 = class37.method7(var12);
                if (var16.field854 + arg2 > 103 || var16.field854 + arg3 > 103 || var16.field875 + arg2 > 103 || var16.field875 + arg3 > 103) {
                    return;
                }
                if (var16.field856 != 0) {
                    field307[arg0].method3638(arg2, arg3, var16.field854, var16.field875, var14, var16.field843);
                }
            }
            if (arg1 == 3) {
                Statics.field186.method1762(arg0, arg2, arg3);
                class37 var17 = class37.method7(var12);
                if (var17.field856 == 1) {
                    field307[arg0].method3639(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field98[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2100(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field186, field307[arg0]);
    }

    @ObfuscatedName("ce.bb(III)V")
    public static final void method1984(int arg0, int arg1) {
        class182 var2 = field432[Statics.field1829][arg0][arg1];
        if (var2 == null) {
            Statics.field186.method1637(Statics.field1829, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3303(); var6 != null; var6 = (class26) var2.method3305()) {
            class46 var7 = class46.method712(var6.field623);
            long var8 = (long) var7.field1026;
            if (var7.field1025 == 1) {
                var8 = (long) (var6.field626 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field186.method1637(Statics.field1829, arg0, arg1);
            return;
        }
        var2.method3300(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3303(); var12 != null; var12 = (class26) var2.method3305()) {
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
        Statics.field186.method1623(Statics.field1829, arg0, arg1, method149(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1829), var5, var13, var10, var11);
    }

    @ObfuscatedName("dc.bk(I)V")
    public static final void method2464() {
        field412.method2400();
        int var0 = field412.method2401(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field412.method2401(2);
        if (var1 == 0) {
            field371[++field270 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field412.method2401(3);
            Statics.field1508.method618(var2, false);
            int var3 = field412.method2401(1);
            if (var3 == 1) {
                field371[++field270 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field412.method2401(3);
            Statics.field1508.method618(var4, true);
            int var5 = field412.method2401(3);
            Statics.field1508.method618(var5, true);
            int var6 = field412.method2401(1);
            if (var6 == 1) {
                field371[++field270 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field412.method2401(1);
            if (var7 == 1) {
                field371[++field270 - 1] = 2047;
            }
            int var8 = field412.method2401(7);
            int var9 = field412.method2401(7);
            int var10 = field412.method2401(1);
            Statics.field1829 = field412.method2401(2);
            Statics.field1508.method611(var9, var8, var10 == 1);
        }
    }

    @ObfuscatedName("az.bl(B)V")
    public static final void method713() {
        while (true) {
            if (field412.method2403(field292) >= 11) {
                int var0 = field412.method2401(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field367[var0] == null) {
                        field367[var0] = new class3();
                        if (field343[var0] != null) {
                            field367[var0].method10(field343[var0]);
                        }
                        var1 = true;
                    }
                    field337[++field368 - 1] = var0;
                    class3 var2 = field367[var0];
                    var2.field781 = field257;
                    int var3 = field412.method2401(1);
                    if (var3 == 1) {
                        field371[++field270 - 1] = var0;
                    }
                    int var4 = field486[field412.method2401(3)];
                    if (var1) {
                        var2.field783 = var2.field735 = var4;
                    }
                    int var5 = field412.method2401(1);
                    int var6 = field412.method2401(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field412.method2401(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method611(Statics.field1508.field753[0] + var7, Statics.field1508.field776[0] + var6, var5 == 1);
                    continue;
                }
            }
            field412.method2402();
            return;
        }
    }

    @ObfuscatedName("ds.bt(ILf;II)V")
    public static final void method2093(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x40) != 0) {
            arg1.field758 = field412.method2195();
            if (arg1.field758 == 65535) {
                arg1.field758 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var3 = field412.method2342();
            int var4 = field412.method2291();
            arg1.method620(var3, var4, field257);
            arg1.field755 = field257 + 300;
            arg1.field756 = field412.method2187();
            arg1.field757 = field412.method2187();
        }
        if ((arg2 & 0x4) != 0) {
            int var5 = field412.method2187();
            byte[] var6 = new byte[var5];
            class110 var7 = new class110(var6);
            field412.method2206(var6, 0, var5);
            field343[arg0] = var7;
            arg1.method10(var7);
        }
        if ((arg2 & 0x8) != 0) {
            int var8 = field412.method2195();
            int var9 = field412.method2187();
            arg1.method620(var8, var9, field257);
            arg1.field755 = field257 + 300;
            arg1.field756 = field412.method2340();
            arg1.field757 = field412.method2291();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field769 = field412.method2317();
            int var10 = field412.method2297();
            arg1.field787 = var10 >> 16;
            arg1.field792 = (var10 & 0xFFFF) + field257;
            arg1.field750 = 0;
            arg1.field771 = 0;
            if (arg1.field792 > field257) {
                arg1.field750 = -1;
            }
            if (arg1.field769 == 65535) {
                arg1.field769 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var11 = field412.method2194();
            class142 var12 = (class142) class100.method1415(class142.method473(), field412.method2340());
            boolean var13 = field412.method2187() == 1;
            int var14 = field412.method2257();
            int var15 = field412.field1847;
            if (arg1.field40 != null && arg1.field39 != null) {
                boolean var16 = false;
                if (var12.field2119 && method27(arg1.field40)) {
                    var16 = true;
                }
                if (!var16 && field417 == 0 && !arg1.field54) {
                    field273.field1847 = 0;
                    field412.method2347(field273.field1853, 0, var14);
                    field273.field1847 = 0;
                    String var17 = class206.method3513(class213.method2723(class205.method532(field273)));
                    arg1.field746 = var17.trim();
                    arg1.field744 = var11 >> 8;
                    arg1.field751 = var11 & 0xFF;
                    arg1.field738 = 150;
                    arg1.field747 = var13;
                    arg1.field733 = Statics.field1508 != arg1 && var12.field2119 && field369 != "" && var17.toLowerCase().indexOf(field369) == -1;
                    int var18;
                    if (var12.field2118) {
                        var18 = var13 ? 91 : 1;
                    } else {
                        var18 = var13 ? 90 : 2;
                    }
                    if (var12.field2124 == -1) {
                        class10.method591(var18, arg1.field40, var17);
                    } else {
                        class10.method591(var18, Statics.method2521(var12.field2124) + arg1.field40, var17);
                    }
                }
            }
            field412.field1847 = var14 + var15;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field774 = field412.method2187();
            arg1.field788 = field412.method2291();
            arg1.field775 = field412.method2257();
            arg1.field777 = field412.method2257();
            arg1.field748 = field412.method2317() + field257;
            arg1.field770 = field412.method2317() + field257;
            arg1.field791 = field412.method2257();
            arg1.field786 = 1;
            arg1.field767 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var19 = field412.method2342();
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = field412.method2340();
            method152(arg1, var19, var20);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field778 = field412.method2342();
            arg1.field779 = field412.method2194();
        }
        if ((arg2 & 0x10) == 0) {
            return;
        }
        arg1.field746 = field412.method2159();
        if (arg1.field746.charAt(0) == '~') {
            arg1.field746 = arg1.field746.substring(1);
            class10.method591(2, arg1.field40, arg1.field746);
        } else if (Statics.field1508 == arg1) {
            class10.method591(2, arg1.field40, arg1.field746);
        }
        arg1.field747 = false;
        arg1.field744 = 0;
        arg1.field751 = 0;
        arg1.field738 = 150;
    }

    @ObfuscatedName("i.bc(ZI)V")
    public static final void method498(boolean arg0) {
        field375 = 0;
        field270 = 0;
        field412.method2400();
        int var1 = field412.method2401(8);
        if (var1 < field287) {
            for (int var2 = var1; var2 < field287; var2++) {
                field376[++field375 - 1] = field288[var2];
            }
        }
        if (var1 > field287) {
            throw new RuntimeException("");
        }
        field287 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field288[var3];
            class31 var5 = field286[var4];
            int var6 = field412.method2401(1);
            if (var6 == 0) {
                field288[++field287 - 1] = var4;
                var5.field781 = field257;
            } else {
                int var7 = field412.method2401(2);
                if (var7 == 0) {
                    field288[++field287 - 1] = var4;
                    var5.field781 = field257;
                    field371[++field270 - 1] = var4;
                } else if (var7 == 1) {
                    field288[++field287 - 1] = var4;
                    var5.field781 = field257;
                    int var8 = field412.method2401(3);
                    var5.method618(var8, false);
                    int var9 = field412.method2401(1);
                    if (var9 == 1) {
                        field371[++field270 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field288[++field287 - 1] = var4;
                    var5.field781 = field257;
                    int var10 = field412.method2401(3);
                    var5.method618(var10, true);
                    int var11 = field412.method2401(3);
                    var5.method618(var11, true);
                    int var12 = field412.method2401(1);
                    if (var12 == 1) {
                        field371[++field270 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field376[++field375 - 1] = var4;
                }
            }
        }
        method1073(arg0);
        method115();
        for (int var13 = 0; var13 < field375; var13++) {
            int var14 = field376[var13];
            if (field257 != field286[var14].field781) {
                field286[var14].field695 = null;
                field286[var14] = null;
            }
        }
        if (field292 != field412.field1847) {
            throw new RuntimeException(field412.field1847 + class2.field19 + field292);
        }
        for (int var15 = 0; var15 < field287; var15++) {
            if (field286[field288[var15]] == null) {
                throw new RuntimeException(var15 + class2.field19 + field287);
            }
        }
    }

    @ObfuscatedName("bj.bn(ZI)V")
    public static final void method1073(boolean arg0) {
        while (true) {
            if (field412.method2403(field292) >= 27) {
                int var1 = field412.method2401(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field286[var1] == null) {
                        field286[var1] = new class31();
                        var2 = true;
                    }
                    class31 var3 = field286[var1];
                    field288[++field287 - 1] = var1;
                    var3.field781 = field257;
                    int var4 = field412.method2401(1);
                    if (var4 == 1) {
                        field371[++field270 - 1] = var1;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field412.method2401(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field412.method2401(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field412.method2401(1);
                    int var7;
                    if (arg0) {
                        var7 = field412.method2401(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field412.method2401(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var3.field695 = class36.method80(field412.method2401(14));
                    int var8 = field486[field412.method2401(3)];
                    if (var2) {
                        var3.field783 = var3.field735 = var8;
                    }
                    var3.field737 = var3.field695.field806;
                    var3.field785 = var3.field695.field829;
                    if (var3.field785 == 0) {
                        var3.field735 = 0;
                    }
                    var3.field741 = var3.field695.field830;
                    var3.field742 = var3.field695.field813;
                    var3.field743 = var3.field695.field831;
                    var3.field780 = var3.field695.field814;
                    var3.field772 = var3.field695.field820;
                    var3.field739 = var3.field695.field810;
                    var3.field740 = var3.field695.field811;
                    var3.method611(Statics.field1508.field753[0] + var7, Statics.field1508.field776[0] + var5, var6 == 1);
                    continue;
                }
            }
            field412.method2402();
            return;
        }
    }

    @ObfuscatedName("m.bu(I)V")
    public static final void method115() {
        for (int var0 = 0; var0 < field270; var0++) {
            int var1 = field371[var0];
            class31 var2 = field286[var1];
            int var3 = field412.method2257();
            if ((var3 & 0x80) != 0) {
                var2.field695 = class36.method80(field412.method2342());
                var2.field737 = var2.field695.field806;
                var2.field785 = var2.field695.field829;
                var2.field741 = var2.field695.field830;
                var2.field742 = var2.field695.field813;
                var2.field743 = var2.field695.field831;
                var2.field780 = var2.field695.field814;
                var2.field772 = var2.field695.field820;
                var2.field739 = var2.field695.field810;
                var2.field740 = var2.field695.field811;
            }
            if ((var3 & 0x8) != 0) {
                var2.field746 = field412.method2159();
                var2.field738 = 100;
            }
            if ((var3 & 0x4) != 0) {
                int var4 = field412.method2187();
                int var5 = field412.method2187();
                var2.method620(var4, var5, field257);
                var2.field755 = field257 + 300;
                var2.field756 = field412.method2195();
                var2.field757 = field412.method2317();
            }
            if ((var3 & 0x1) != 0) {
                var2.field758 = field412.method2342();
                if (var2.field758 == 65535) {
                    var2.field758 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var6 = field412.method2340();
                int var7 = field412.method2257();
                var2.method620(var6, var7, field257);
                var2.field755 = field257 + 300;
                var2.field756 = field412.method2194();
                var2.field757 = field412.method2317();
            }
            if ((var3 & 0x40) != 0) {
                var2.field769 = field412.method2195();
                int var8 = field412.method2203();
                var2.field787 = var8 >> 16;
                var2.field792 = (var8 & 0xFFFF) + field257;
                var2.field750 = 0;
                var2.field771 = 0;
                if (var2.field792 > field257) {
                    var2.field750 = -1;
                }
                if (var2.field769 == 65535) {
                    var2.field769 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field778 = field412.method2195();
                var2.field779 = field412.method2342();
            }
            if ((var3 & 0x20) != 0) {
                int var9 = field412.method2342();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field412.method2187();
                if (var2.field764 == var9 && var9 != -1) {
                    int var11 = class39.method682(var9).field922;
                    if (var11 == 1) {
                        var2.field765 = 0;
                        var2.field761 = 0;
                        var2.field736 = var10;
                        var2.field768 = 0;
                    }
                    if (var11 == 2) {
                        var2.field768 = 0;
                    }
                } else if (var9 == -1 || var2.field764 == -1 || class39.method682(var9).field916 >= class39.method682(var2.field764).field916) {
                    var2.field764 = var9;
                    var2.field765 = 0;
                    var2.field761 = 0;
                    var2.field736 = var10;
                    var2.field768 = 0;
                    var2.field767 = var2.field786;
                }
            }
        }
    }

    @ObfuscatedName("m.bo(III)V")
    public static final void method114(int arg0, int arg1) {
        if (field259 < 2 && field442 == 0 && !field453) {
            return;
        }
        String var2;
        if (field442 == 1 && field259 < 2) {
            var2 = class147.field2348 + class147.field2321 + field447 + " " + class2.field21;
        } else if (field453 && field259 < 2) {
            var2 = field407 + class147.field2321 + field408 + " " + class2.field21;
        } else {
            int var3 = field259 - 1;
            String var4;
            if (field397[var3].length() > 0) {
                var4 = field476[var3] + class147.field2321 + field397[var3];
            } else {
                var4 = field476[var3];
            }
            var2 = var4;
        }
        if (field259 > 2) {
            var2 = var2 + class2.method855(16777215) + " " + '/' + " " + (field259 - 2) + class147.field2330;
        }
        Statics.field2683.method3506(var2, arg0 + 4, arg1 + 15, 16777215, 0, field257 / 1000);
    }

    @ObfuscatedName("ac.br(IIIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field502; var4++) {
            if (field460[var4] + field458[var4] > arg0 && field458[var4] < arg0 + arg2 && field461[var4] + field459[var4] > arg1 && field459[var4] < arg1 + arg3) {
                field455[var4] = true;
            }
        }
    }

    @ObfuscatedName("ad.bd(IIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field502; var4++) {
            if (field460[var4] + field458[var4] > arg0 && field458[var4] < arg0 + arg2 && field461[var4] + field459[var4] > arg1 && field459[var4] < arg1 + arg3) {
                field456[var4] = true;
            }
        }
    }

    @ObfuscatedName("dg.bm(IIB)V")
    public static final void method2425(int arg0, int arg1) {
        int var2 = Statics.field2683.method3494(class147.field2314);
        for (int var3 = 0; var3 < field259; var3++) {
            class207 var4 = Statics.field2683;
            String var5;
            if (field397[var3].length() > 0) {
                var5 = field476[var3] + class147.field2321 + field397[var3];
            } else {
                var5 = field476[var3];
            }
            int var6 = var4.method3494(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field259 * 15 + 21;
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
        field390 = true;
        Statics.field11 = var8;
        Statics.field140 = var9;
        Statics.field699 = var2;
        Statics.field1572 = field259 * 15 + 22;
    }

    @ObfuscatedName("du.bz(II)Z")
    public static final boolean method2446(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field258[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fd.bv(II)V")
    public static final void method3219(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field392[arg0];
        int var2 = field393[arg0];
        int var3 = field258[arg0];
        int var4 = field395[arg0];
        String var5 = field476[arg0];
        String var6 = field397[arg0];
        method77(var1, var2, var3, var4, var5, var6, class131.field2026, class131.field2027);
    }

    @ObfuscatedName("k.bf(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method77(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 45) {
            class3 var8 = field367[arg3];
            if (var8 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(63);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2191(arg3);
            }
        }
        if (arg2 == 12) {
            class31 var9 = field286[arg3];
            if (var9 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(167);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2192(arg3);
            }
        }
        if (arg2 == 11) {
            class31 var10 = field286[arg3];
            if (var10 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(26);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2192(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var11 = field367[arg3];
            if (var11 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(0);
                field289.method2192(arg3);
                field289.method2181(Statics.field2149);
                field289.method2182(class128.field1967[82] ? 1 : 0);
                field289.method2192(Statics.field1901);
                field289.method2148(Statics.field1524);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class157 var12 = class157.method155(arg1, arg0);
            if (var12 != null) {
                method579(arg3, arg1, arg0, var12.field2594, arg5);
            }
        }
        if (arg2 == 21) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(202);
            field289.method2192(Statics.field73 + arg0);
            field289.method2192(Statics.field1821 + arg1);
            field289.method2182(class128.field1967[82] ? 1 : 0);
            field289.method2190(arg3);
        }
        if (arg2 == 1002) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field289.method2414(77);
            field289.method2148(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class31 var13 = field286[arg3];
            if (var13 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(183);
                field289.method2192(arg3);
                field289.method2182(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class31 var14 = field286[arg3];
            if (var14 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(172);
                field289.method2191(arg3);
                field289.method2182(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field289.method2414(70);
            field289.method2192(arg3);
            field289.method2148(arg0);
            field289.method2181(arg1);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 35) {
            field289.method2414(173);
            field289.method2190(arg0);
            field289.method2199(arg1);
            field289.method2190(arg3);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 39) {
            field289.method2414(249);
            field289.method2148(arg0);
            field289.method2148(arg3);
            field289.method2200(arg1);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 51) {
            class3 var15 = field367[arg3];
            if (var15 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(139);
                field289.method2263(class128.field1967[82] ? 1 : 0);
                field289.method2191(arg3);
            }
        }
        if (arg2 == 22) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(210);
            field289.method2192(Statics.field1821 + arg1);
            field289.method2192(arg3);
            field289.method2263(class128.field1967[82] ? 1 : 0);
            field289.method2148(Statics.field73 + arg0);
        }
        if (arg2 == 46) {
            class3 var16 = field367[arg3];
            if (var16 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(196);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2191(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var17 = field367[arg3];
            if (var17 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(62);
                field289.method2148(field405);
                field289.method2263(class128.field1967[82] ? 1 : 0);
                field289.method2199(Statics.field1873);
                field289.method2192(arg3);
            }
        }
        if (arg2 == 16) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(103);
            field289.method2190(arg3);
            field289.method2148(Statics.field1524);
            field289.method2191(Statics.field1821 + arg1);
            field289.method2199(Statics.field2149);
            field289.method2184(class128.field1967[82] ? 1 : 0);
            field289.method2148(Statics.field73 + arg0);
            field289.method2191(Statics.field1901);
        }
        if (arg2 == 33) {
            field289.method2414(93);
            field289.method2199(arg1);
            field289.method2190(arg3);
            field289.method2192(arg0);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 30 && field401 == null) {
            method906(arg1, arg0);
            field401 = class157.method155(arg1, arg0);
            method1031(field401);
        }
        if (arg2 == 9) {
            class31 var18 = field286[arg3];
            if (var18 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(150);
                field289.method2148(arg3);
                field289.method2294(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class157 var19 = class157.method151(arg1);
            if (var19 == null || var19.field2657[arg0] < 100000) {
                field289.method2414(82);
                field289.method2148(arg3);
            } else {
                class10.method591(27, "", var19.field2657[arg0] + " x " + class46.method712(arg3).field1022);
            }
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 1004) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field289.method2414(82);
            field289.method2148(arg3);
        }
        if (arg2 == 31) {
            field289.method2414(131);
            field289.method2181(arg1);
            field289.method2192(Statics.field1524);
            field289.method2192(arg3);
            field289.method2192(Statics.field1901);
            field289.method2260(Statics.field2149);
            field289.method2192(arg0);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 44) {
            class3 var20 = field367[arg3];
            if (var20 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(74);
                field289.method2191(arg3);
                field289.method2294(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method2468();
            class157 var21 = class157.method151(arg1);
            field442 = 1;
            Statics.field1901 = arg0;
            Statics.field2149 = arg1;
            Statics.field1524 = arg3;
            method1031(var21);
            field447 = class2.method855(16748608) + class46.method712(arg3).field1022 + class2.method855(16777215);
            if (field447 == null) {
                field447 = "null";
            }
            return;
        }
        if (arg2 == 1) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(44);
            field289.method2192(Statics.field1901);
            field289.method2200(Statics.field2149);
            field289.method2191(Statics.field1821 + arg1);
            field289.method2192(Statics.field73 + arg0);
            field289.method2263(class128.field1967[82] ? 1 : 0);
            field289.method2148(Statics.field1524);
            field289.method2192(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 5) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(255);
            field289.method2192(Statics.field73 + arg0);
            field289.method2190(Statics.field1821 + arg1);
            field289.method2294(class128.field1967[82] ? 1 : 0);
            field289.method2191(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field186.method1788(Statics.field1829, arg0, arg1);
        }
        if (arg2 == 48) {
            class3 var22 = field367[arg3];
            if (var22 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(118);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2191(arg3);
            }
        }
        if (arg2 == 1001) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(67);
            field289.method2190(Statics.field1821 + arg1);
            field289.method2148(Statics.field73 + arg0);
            field289.method2294(class128.field1967[82] ? 1 : 0);
            field289.method2148(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 25) {
            class157 var23 = class157.method155(arg1, arg0);
            if (var23 != null) {
                method2468();
                method2426(arg1, arg0, class161.method2(Statics.method1003(var23)), var23.field2594);
                field442 = 0;
                field407 = method146(var23);
                if (field407 == null) {
                    field407 = "Null";
                }
                if (var23.field2550) {
                    field408 = var23.field2612 + class2.method855(16777215);
                } else {
                    field408 = class2.method855(65280) + var23.field2651 + class2.method855(16777215);
                }
            }
            return;
        }
        if (arg2 == 2) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(187);
            field289.method2190(Statics.field1821 + arg1);
            field289.method2148(field405);
            field289.method2190(Statics.field73 + arg0);
            field289.method2200(Statics.field1873);
            field289.method2190(arg3 >> 14 & 0x7FFF);
            field289.method2294(class128.field1967[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class3 var24 = field367[arg3];
            if (var24 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(230);
                field289.method2190(arg3);
                field289.method2182(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field289.method2414(247);
            field289.method2260(arg1);
            field289.method2192(arg3);
            field289.method2190(arg0);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 3) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(19);
            field289.method2182(class128.field1967[82] ? 1 : 0);
            field289.method2192(Statics.field73 + arg0);
            field289.method2190(arg3 >> 14 & 0x7FFF);
            field289.method2190(Statics.field1821 + arg1);
        }
        if (arg2 == 7) {
            class31 var25 = field286[arg3];
            if (var25 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(235);
                field289.method2190(arg3);
                field289.method2260(Statics.field2149);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2148(Statics.field1524);
                field289.method2190(Statics.field1901);
            }
        }
        if (arg2 == 47) {
            class3 var26 = field367[arg3];
            if (var26 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(253);
                field289.method2190(arg3);
                field289.method2263(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field289.method2414(36);
            field289.method2260(arg1);
            class157 var27 = class157.method151(arg1);
            if (var27.field2640 != null && var27.field2640[0][0] == 5) {
                int var28 = var27.field2640[0][1];
                class159.field2680[var28] = 1 - class159.field2680[var28];
                method2767(var28);
            }
        }
        if (arg2 == 37) {
            field289.method2414(50);
            field289.method2200(arg1);
            field289.method2148(arg0);
            field289.method2192(arg3);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 40) {
            field289.method2414(209);
            field289.method2200(arg1);
            field289.method2148(arg0);
            field289.method2192(arg3);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 20) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(117);
            field289.method2294(class128.field1967[82] ? 1 : 0);
            field289.method2192(arg3);
            field289.method2190(Statics.field1821 + arg1);
            field289.method2191(Statics.field73 + arg0);
        }
        if (arg2 == 4) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(222);
            field289.method2190(Statics.field73 + arg0);
            field289.method2191(Statics.field1821 + arg1);
            field289.method2148(arg3 >> 14 & 0x7FFF);
            field289.method2184(class128.field1967[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field289.method2414(142);
            field289.method2190(field405);
            field289.method2260(Statics.field1873);
            field289.method2260(arg1);
            field289.method2192(arg3);
            field289.method2190(arg0);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 58) {
            class157 var29 = class157.method155(arg1, arg0);
            if (var29 != null) {
                field289.method2414(37);
                field289.method2191(field405);
                field289.method2148(field274);
                field289.method2181(Statics.field1873);
                field289.method2191(var29.field2594);
                field289.method2190(arg0);
                field289.method2181(arg1);
            }
        }
        if (arg2 == 18) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(115);
            field289.method2190(arg3);
            field289.method2191(Statics.field1821 + arg1);
            field289.method2191(Statics.field73 + arg0);
            field289.method2184(class128.field1967[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field289.method2414(119);
            field289.method2191(arg3);
            field289.method2148(arg0);
            field289.method2199(arg1);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 17) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(200);
            field289.method2192(field405);
            field289.method2260(Statics.field1873);
            field289.method2191(Statics.field1821 + arg1);
            field289.method2190(arg3);
            field289.method2263(class128.field1967[82] ? 1 : 0);
            field289.method2191(Statics.field73 + arg0);
        }
        if (arg2 == 1003) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            class31 var30 = field286[arg3];
            if (var30 != null) {
                class36 var31 = var30.field695;
                if (var31.field818 != null) {
                    var31 = var31.method627();
                }
                if (var31 != null) {
                    field289.method2414(240);
                    field289.method2148(var31.field804);
                }
            }
        }
        if (arg2 == 19) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(52);
            field289.method2192(arg3);
            field289.method2294(class128.field1967[82] ? 1 : 0);
            field289.method2148(Statics.field1821 + arg1);
            field289.method2192(Statics.field73 + arg0);
        }
        if (arg2 == 36) {
            field289.method2414(215);
            field289.method2191(arg0);
            field289.method2260(arg1);
            field289.method2190(arg3);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 50) {
            class3 var32 = field367[arg3];
            if (var32 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(180);
                field289.method2191(arg3);
                field289.method2294(class128.field1967[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field289.method2414(36);
            field289.method2260(arg1);
            class157 var33 = class157.method151(arg1);
            if (var33.field2640 != null && var33.field2640[0][0] == 5) {
                int var34 = var33.field2640[0][1];
                if (class159.field2680[var34] != var33.field2668[0]) {
                    class159.field2680[var34] = var33.field2668[0];
                    method2767(var34);
                }
            }
        }
        if (arg2 == 6) {
            field354 = arg6;
            field470 = arg7;
            field357 = 2;
            field356 = 0;
            field480 = arg0;
            field332 = arg1;
            field289.method2414(189);
            field289.method2148(arg3 >> 14 & 0x7FFF);
            field289.method2192(Statics.field1821 + arg1);
            field289.method2148(Statics.field73 + arg0);
            field289.method2294(class128.field1967[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field289.method2414(116);
            field289.method2192(arg0);
            field289.method2181(arg1);
            field289.method2148(arg3);
            field358 = 0;
            Statics.field1836 = class157.method151(arg1);
            field359 = arg0;
        }
        if (arg2 == 24) {
            class157 var35 = class157.method151(arg1);
            boolean var36 = true;
            if (var35.field2555 > 0) {
                var36 = method2620(var35);
            }
            if (var36) {
                field289.method2414(36);
                field289.method2260(arg1);
            }
        }
        if (arg2 == 8) {
            class31 var37 = field286[arg3];
            if (var37 != null) {
                field354 = arg6;
                field470 = arg7;
                field357 = 2;
                field356 = 0;
                field480 = arg0;
                field332 = arg1;
                field289.method2414(161);
                field289.method2184(class128.field1967[82] ? 1 : 0);
                field289.method2191(field405);
                field289.method2199(Statics.field1873);
                field289.method2190(arg3);
            }
        }
        if (arg2 == 26) {
            field289.method2414(48);
            for (class4 var38 = (class4) field431.method3269(); var38 != null; var38 = (class4) field431.method3270()) {
                if (var38.field57 == 0 || var38.field57 == 3) {
                    method2539(var38, true);
                }
            }
            if (field401 != null) {
                method1031(field401);
                field401 = null;
            }
        }
        if (field442 != 0) {
            field442 = 0;
            method1031(class157.method151(Statics.field2149));
        }
        if (field453) {
            method2468();
        }
        if (Statics.field1836 != null && field358 == 0) {
            method1031(Statics.field1836);
        }
    }

    @ObfuscatedName("dn.be(IIIII)V")
    public static void method2426(int arg0, int arg1, int arg2, int arg3) {
        class157 var4 = class157.method155(arg0, arg1);
        if (var4 != null && var4.field2630 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2630;
            class33.method16(var5);
        }
        field274 = arg3;
        field453 = true;
        Statics.field1873 = arg0;
        field405 = arg1;
        Statics.field30 = arg2;
        method1031(var4);
    }

    @ObfuscatedName("dl.bs(I)V")
    public static void method2468() {
        if (!field453) {
            return;
        }
        class157 var0 = class157.method155(Statics.field1873, field405);
        if (var0 != null && var0.field2631 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2631;
            class33.method16(var1);
        }
        field453 = false;
        method1031(var0);
    }

    @ObfuscatedName("ay.bw(III)V")
    public static void method906(int arg0, int arg1) {
        field289.method2414(89);
        field289.method2181(arg0);
        field289.method2191(arg1);
    }

    @ObfuscatedName("ao.bp(IIIILjava/lang/String;B)V")
    public static void method579(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class157 var5 = class157.method155(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2639 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field2 = arg0;
            var6.field10 = arg4;
            var6.field9 = var5.field2639;
            class33.method16(var6);
        }
        boolean var7 = true;
        if (var5.field2555 > 0) {
            var7 = method2620(var5);
        }
        if (!var7 || !class161.method2513(Statics.method1003(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field289.method2414(238);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 2) {
            field289.method2414(25);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 3) {
            field289.method2414(3);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 4) {
            field289.method2414(5);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 5) {
            field289.method2414(234);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 6) {
            field289.method2414(242);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 7) {
            field289.method2414(127);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 8) {
            field289.method2414(104);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 9) {
            field289.method2414(193);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
        if (arg0 == 10) {
            field289.method2414(199);
            field289.method2260(arg1);
            field289.method2148(arg2);
            field289.method2148(arg3);
        }
    }

    @ObfuscatedName("m.bh(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method117(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field390 || field259 >= 500) {
            return;
        }
        field476[field259] = arg0;
        field397[field259] = arg1;
        field258[field259] = arg2;
        field395[field259] = arg3;
        field392[field259] = arg4;
        field393[field259] = arg5;
        field259++;
    }

    @ObfuscatedName("c.bg(B)V")
    public static void method122() {
        for (int var0 = 0; var0 < field259; var0++) {
            int var1 = field258[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field259 - 1) {
                    for (int var3 = var0; var3 < field259 - 1; var3++) {
                        field476[var3] = field476[var3 + 1];
                        field397[var3] = field397[var3 + 1];
                        field258[var3] = field258[var3 + 1];
                        field395[var3] = field395[var3 + 1];
                        field392[var3] = field392[var3 + 1];
                        field393[var3] = field393[var3 + 1];
                    }
                }
                field259--;
            }
        }
    }

    @ObfuscatedName("eg.bq(Lac;IIII)V")
    public static final void method2907(class36 arg0, int arg1, int arg2, int arg3) {
        if (field259 >= 400) {
            return;
        }
        if (arg0.field818 != null) {
            arg0 = arg0.method627();
        }
        if (arg0 == null || !arg0.field833 || arg0.field835 && field509 != arg1) {
            return;
        }
        String var4 = arg0.field805;
        if (arg0.field812 != 0) {
            var4 = var4 + Statics.method3578(arg0.field812, Statics.field1508.field46) + " " + class2.field24 + class147.field2161 + arg0.field812 + class2.field22;
        }
        if (field442 == 1) {
            method117(class147.field2348, field447 + " " + class2.field21 + " " + class2.method855(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field453) {
            String[] var5 = arg0.field827;
            if (field420) {
                var5 = method2074(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class147.field2313)) {
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
                        method117(var5[var6], class2.method855(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class147.field2313)) {
                        short var9 = 0;
                        if (field304 == class18.field515 || field304 == class18.field525 && arg0.field812 > Statics.field1508.field46) {
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
                        method117(var5[var8], class2.method855(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method117(class147.field2312, class2.method855(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field30 & 0x2) == 2) {
            method117(field407, field408 + " " + class2.field21 + " " + class2.method855(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bf.by(Lf;IIII)V")
    public static final void method1358(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1508 == arg0 || field259 >= 400) {
            return;
        }
        String var9;
        if (arg0.field53 == 0) {
            String var4 = arg0.field40;
            int var5 = arg0.field46;
            int var6 = Statics.field1508.field46;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method855(16711680);
            } else if (var7 < -6) {
                var8 = class2.method855(16723968);
            } else if (var7 < -3) {
                var8 = class2.method855(16740352);
            } else if (var7 < 0) {
                var8 = class2.method855(16756736);
            } else if (var7 > 9) {
                var8 = class2.method855(65280);
            } else if (var7 > 6) {
                var8 = class2.method855(4259584);
            } else if (var7 > 3) {
                var8 = class2.method855(8453888);
            } else if (var7 > 0) {
                var8 = class2.method855(12648192);
            } else {
                var8 = class2.method855(16776960);
            }
            var9 = var4 + var8 + " " + class2.field24 + class147.field2161 + arg0.field46 + class2.field22;
        } else {
            var9 = arg0.field40 + " " + class2.field24 + class147.field2318 + arg0.field53 + class2.field22;
        }
        if (field442 == 1) {
            method117(class147.field2348, field447 + " " + class2.field21 + " " + class2.method855(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field453) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field340[var10] != null) {
                    short var11 = 0;
                    if (field340[var10].equalsIgnoreCase(class147.field2313)) {
                        if (field304 == class18.field515 || field304 == class18.field525 && arg0.field46 > Statics.field1508.field46) {
                            var11 = 2000;
                        }
                        if (Statics.field1508.field35 != 0 && arg0.field35 != 0) {
                            if (Statics.field1508.field35 == arg0.field35) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field379[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field377[var10] + var11;
                    method117(field340[var10], class2.method855(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field30 & 0x8) == 8) {
            method117(field407, field408 + " " + class2.field21 + " " + class2.method855(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field259; var14++) {
            if (field258[var14] == 23) {
                field397[var14] = class2.method855(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("aw.cf(IIIIIIIII)V")
    public static final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method1793(arg0)) {
            Statics.field784 = null;
            method2733(Statics.field2658[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field784 != null) {
                method2733(Statics.field784, -1412584499, arg1, arg2, arg3, arg4, Statics.field523, Statics.field189, arg7);
                Statics.field784 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field455[var8] = true;
            }
        } else {
            field455[arg7] = true;
        }
    }

    @ObfuscatedName("eo.ch([Lfb;IIIIIIIII)V")
    public static final void method2733(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1514(arg2, arg3, arg4, arg5);
        class85.method1801();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2615 == arg1 || arg1 == -1412584499 && field421 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field458[field502] = var10.field2556 + arg6;
                    field459[field502] = var10.field2557 + arg7;
                    field460[field502] = var10.field2560;
                    field461[field502] = var10.field2561;
                    var11 = ++field502 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2669 = var11;
                var10.field2571 = field257;
                if (!var10.field2550 || !method5(var10)) {
                    if (var10.field2555 > 0) {
                        int var12 = var10.field2555;
                        if (var12 == 324) {
                            if (field366 == -1) {
                                field366 = var10.field2575;
                                field427 = var10.field2576;
                            }
                            if (field339.field2696) {
                                var10.field2575 = field366;
                            } else {
                                var10.field2575 = field427;
                            }
                        } else if (var12 == 325) {
                            if (field366 == -1) {
                                field366 = var10.field2575;
                                field427 = var10.field2576;
                            }
                            if (field339.field2696) {
                                var10.field2575 = field427;
                            } else {
                                var10.field2575 = field366;
                            }
                        } else if (var12 == 327) {
                            var10.field2591 = 150;
                            var10.field2590 = (int) (Math.sin((double) field257 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2583 = 5;
                            var10.field2584 = 0;
                        } else if (var12 == 328) {
                            var10.field2591 = 150;
                            var10.field2590 = (int) (Math.sin((double) field257 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2583 = 5;
                            var10.field2584 = 1;
                        }
                    }
                    int var13 = var10.field2556 + arg6;
                    int var14 = var10.field2557 + arg7;
                    int var15 = var10.field2609;
                    if (field421 == var10) {
                        if (arg1 != -1412584499 && !var10.field2617) {
                            Statics.field784 = arg0;
                            Statics.field523 = arg6;
                            Statics.field189 = arg7;
                            continue;
                        }
                        if (field429 && field317) {
                            int var16 = class131.field2019;
                            int var17 = class131.field2020;
                            int var18 = var16 - field423;
                            int var19 = var17 - field424;
                            if (var18 < field253) {
                                var18 = field253;
                            }
                            if (var10.field2560 + var18 > field253 + field422.field2560) {
                                var18 = field253 + field422.field2560 - var10.field2560;
                            }
                            if (var19 < field506) {
                                var19 = field506;
                            }
                            if (var10.field2561 + var19 > field506 + field422.field2561) {
                                var19 = field506 + field422.field2561 - var10.field2561;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2617) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2553 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2553 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2560 + var13;
                        int var27 = var10.field2561 + var14;
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
                        int var31 = var10.field2561 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2550 || var20 < var22 && var21 < var23) {
                        if (var10.field2555 != 0) {
                            if (var10.field2555 == 1337) {
                                field398 = var13;
                                field430 = var14;
                                int var32 = var10.field2560;
                                int var33 = var10.field2561;
                                class74.method1514(var13, var14, var13 + var32, var14 + var33);
                                class85.method1801();
                                field351++;
                                method147(class30.field692);
                                boolean var34 = false;
                                if (field505 >= 0) {
                                    for (int var35 = 0; var35 < field368; var35++) {
                                        if (field505 == field337[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method147(class30.field688);
                                }
                                method1317(true);
                                method147(var34 ? class30.field689 : class30.field691);
                                method1317(false);
                                for (class7 var36 = (class7) field384.method3303(); var36 != null; var36 = (class7) field384.method3305()) {
                                    if (Statics.field1829 != var36.field118 || field257 > var36.field106) {
                                        var36.method3392();
                                    } else if (field257 >= var36.field105) {
                                        if (var36.field113 > 0) {
                                            class31 var37 = field286[var36.field113 - 1];
                                            if (var37 != null && var37.field766 >= 0 && var37.field766 < 13312 && var37.field759 >= 0 && var37.field759 < 13312) {
                                                var36.method72(var37.field766, var37.field759, method149(var37.field766, var37.field759, var36.field118) - var36.field104, field257);
                                            }
                                        }
                                        if (var36.field113 < 0) {
                                            int var38 = -var36.field113 - 1;
                                            class3 var39;
                                            if (field374 == var38) {
                                                var39 = Statics.field1508;
                                            } else {
                                                var39 = field367[var38];
                                            }
                                            if (var39 != null && var39.field766 >= 0 && var39.field766 < 13312 && var39.field759 >= 0 && var39.field759 < 13312) {
                                                var36.method72(var39.field766, var39.field759, method149(var39.field766, var39.field759, var36.field118) - var36.field104, field257);
                                            }
                                        }
                                        var36.method76(field477);
                                        Statics.field186.method1627(Statics.field1829, (int) var36.field115, (int) var36.field112, (int) var36.field109, 60, var36, var36.field119, -1, false);
                                    }
                                }
                                method2525();
                                if (!field494) {
                                    int var40 = field246;
                                    if (field271 / 256 > var40) {
                                        var40 = field271 / 256;
                                    }
                                    if (field495[4] && field497[4] + 128 > var40) {
                                        var40 = field497[4] + 128;
                                    }
                                    int var41 = field315 + field309 & 0x7FF;
                                    int var42 = Statics.field232;
                                    int var43 = method149(Statics.field1508.field766, Statics.field1508.field759, Statics.field1829) - 50;
                                    int var44 = Statics.field1354;
                                    int var45 = var40 * 3 + 600;
                                    int var46 = 2048 - var40 & 0x7FF;
                                    int var47 = 2048 - var41 & 0x7FF;
                                    int var48 = 0;
                                    int var49 = 0;
                                    int var50 = var45;
                                    if (var46 != 0) {
                                        int var51 = class85.field1468[var46];
                                        int var52 = class85.field1483[var46];
                                        int var53 = var49 * var52 - var45 * var51 >> 16;
                                        var50 = var49 * var51 + var45 * var52 >> 16;
                                        var49 = var53;
                                    }
                                    if (var47 != 0) {
                                        int var54 = class85.field1468[var47];
                                        int var55 = class85.field1483[var47];
                                        int var56 = var48 * var55 + var50 * var54 >> 16;
                                        var50 = var50 * var55 - var48 * var54 >> 16;
                                        var48 = var56;
                                    }
                                    Statics.field1903 = var42 - var48;
                                    Statics.field622 = var43 - var49;
                                    Statics.field602 = var44 - var50;
                                    Statics.field2791 = var40;
                                    Statics.field925 = var41;
                                }
                                int var69;
                                if (field494) {
                                    var69 = method118();
                                } else {
                                    int var57;
                                    if (Statics.field152.field144) {
                                        var57 = Statics.field1829;
                                    } else {
                                        int var58 = 3;
                                        if (Statics.field2791 < 310) {
                                            int var59 = Statics.field1903 >> 7;
                                            int var60 = Statics.field602 >> 7;
                                            int var61 = Statics.field1508.field766 >> 7;
                                            int var62 = Statics.field1508.field759 >> 7;
                                            if ((class6.field98[Statics.field1829][var59][var60] & 0x4) != 0) {
                                                var58 = Statics.field1829;
                                            }
                                            int var63;
                                            if (var61 > var59) {
                                                var63 = var61 - var59;
                                            } else {
                                                var63 = var59 - var61;
                                            }
                                            int var64;
                                            if (var62 > var60) {
                                                var64 = var62 - var60;
                                            } else {
                                                var64 = var60 - var62;
                                            }
                                            if (var63 > var64) {
                                                int var65 = var64 * 65536 / var63;
                                                int var66 = 32768;
                                                while (var59 != var61) {
                                                    if (var59 < var61) {
                                                        var59++;
                                                    } else if (var59 > var61) {
                                                        var59--;
                                                    }
                                                    if ((class6.field98[Statics.field1829][var59][var60] & 0x4) != 0) {
                                                        var58 = Statics.field1829;
                                                    }
                                                    var66 += var65;
                                                    if (var66 >= 65536) {
                                                        var66 -= 65536;
                                                        if (var60 < var62) {
                                                            var60++;
                                                        } else if (var60 > var62) {
                                                            var60--;
                                                        }
                                                        if ((class6.field98[Statics.field1829][var59][var60] & 0x4) != 0) {
                                                            var58 = Statics.field1829;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var67 = var63 * 65536 / var64;
                                                int var68 = 32768;
                                                while (var60 != var62) {
                                                    if (var60 < var62) {
                                                        var60++;
                                                    } else if (var60 > var62) {
                                                        var60--;
                                                    }
                                                    if ((class6.field98[Statics.field1829][var59][var60] & 0x4) != 0) {
                                                        var58 = Statics.field1829;
                                                    }
                                                    var68 += var67;
                                                    if (var68 >= 65536) {
                                                        var68 -= 65536;
                                                        if (var59 < var61) {
                                                            var59++;
                                                        } else if (var59 > var61) {
                                                            var59--;
                                                        }
                                                        if ((class6.field98[Statics.field1829][var59][var60] & 0x4) != 0) {
                                                            var58 = Statics.field1829;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field98[Statics.field1829][Statics.field1508.field766 >> 7][Statics.field1508.field759 >> 7] & 0x4) != 0) {
                                            var58 = Statics.field1829;
                                        }
                                        var57 = var58;
                                    }
                                    var69 = var57;
                                }
                                int var70 = Statics.field1903;
                                int var71 = Statics.field622;
                                int var72 = Statics.field602;
                                int var73 = Statics.field2791;
                                int var74 = Statics.field925;
                                for (int var75 = 0; var75 < 5; var75++) {
                                    if (field495[var75]) {
                                        int var76 = (int) (Math.random() * (double) (field496[var75] * 2 + 1) - (double) field496[var75] + Math.sin((double) field498[var75] / 100.0D * (double) field404[var75]) * (double) field497[var75]);
                                        if (var75 == 0) {
                                            Statics.field1903 += var76;
                                        }
                                        if (var75 == 1) {
                                            Statics.field622 += var76;
                                        }
                                        if (var75 == 2) {
                                            Statics.field602 += var76;
                                        }
                                        if (var75 == 3) {
                                            Statics.field925 = Statics.field925 + var76 & 0x7FF;
                                        }
                                        if (var75 == 4) {
                                            Statics.field2791 += var76;
                                            if (Statics.field2791 < 128) {
                                                Statics.field2791 = 128;
                                            }
                                            if (Statics.field2791 > 383) {
                                                Statics.field2791 = 383;
                                            }
                                        }
                                    }
                                }
                                int var77 = class131.field2019;
                                int var78 = class131.field2020;
                                if (class131.field2025 != 0) {
                                    var77 = class131.field2026;
                                    var78 = class131.field2027;
                                }
                                if (var77 >= var13 && var77 < var13 + var32 && var78 >= var14 && var78 < var14 + var33) {
                                    class99.field1755 = true;
                                    class99.field1749 = 0;
                                    class99.field1747 = var77 - var13;
                                    class99.field1748 = var78 - var14;
                                } else {
                                    class99.field1755 = false;
                                    class99.field1749 = 0;
                                }
                                method69();
                                class74.method1520(var13, var14, var32, var33, 0);
                                method69();
                                Statics.field186.method1654(Statics.field1903, Statics.field622, Statics.field602, Statics.field2791, Statics.field925, var69);
                                method69();
                                Statics.field186.method1630();
                                field484 = 0;
                                boolean var79 = false;
                                int var80 = -1;
                                for (int var81 = -1; var81 < field368 + field287; var81++) {
                                    class34 var82;
                                    if (var81 == -1) {
                                        var82 = Statics.field1508;
                                    } else if (var81 < field368) {
                                        var82 = field367[field337[var81]];
                                        if (field505 == field337[var81]) {
                                            var79 = true;
                                            var80 = var81;
                                            continue;
                                        }
                                    } else {
                                        var82 = field286[field288[var81 - field368]];
                                    }
                                    method539(var82, var81, var13, var14, var32, var33);
                                }
                                if (var79) {
                                    method539(field367[field505], var80, var13, var14, var32, var33);
                                }
                                for (int var83 = 0; var83 < field484; var83++) {
                                    int var84 = field467[var83];
                                    int var85 = field402[var83];
                                    int var86 = field345[var83];
                                    int var87 = field344[var83];
                                    boolean var88 = true;
                                    while (var88) {
                                        var88 = false;
                                        for (int var89 = 0; var89 < var83; var89++) {
                                            if (var85 + 2 > field402[var89] - field344[var89] && var85 - var87 < field402[var89] + 2 && var84 - var86 < field467[var89] + field345[var89] && var84 + var86 > field467[var89] - field345[var89] && field402[var89] - field344[var89] < var85) {
                                                var85 = field402[var89] - field344[var89];
                                                var88 = true;
                                            }
                                        }
                                    }
                                    field352 = field467[var83];
                                    field353 = field402[var83] = var85;
                                    String var90 = field349[var83];
                                    if (field411 == 0) {
                                        int var91 = 16776960;
                                        if (field346[var83] < 6) {
                                            var91 = field463[field346[var83]];
                                        }
                                        if (field346[var83] == 6) {
                                            var91 = field351 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field346[var83] == 7) {
                                            var91 = field351 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field346[var83] == 8) {
                                            var91 = field351 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field346[var83] == 9) {
                                            int var92 = 150 - field348[var83];
                                            if (var92 < 50) {
                                                var91 = var92 * 1280 + 16711680;
                                            } else if (var92 < 100) {
                                                var91 = 16776960 - (var92 - 50) * 327680;
                                            } else if (var92 < 150) {
                                                var91 = (var92 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field346[var83] == 10) {
                                            int var93 = 150 - field348[var83];
                                            if (var93 < 50) {
                                                var91 = var93 * 5 + 16711680;
                                            } else if (var93 < 100) {
                                                var91 = 16711935 - (var93 - 50) * 327680;
                                            } else if (var93 < 150) {
                                                var91 = (var93 - 100) * 327680 + 255 - (var93 - 100) * 5;
                                            }
                                        }
                                        if (field346[var83] == 11) {
                                            int var94 = 150 - field348[var83];
                                            if (var94 < 50) {
                                                var91 = 16777215 - var94 * 327685;
                                            } else if (var94 < 100) {
                                                var91 = (var94 - 50) * 327685 + 65280;
                                            } else if (var94 < 150) {
                                                var91 = 16777215 - (var94 - 100) * 327680;
                                            }
                                        }
                                        if (field347[var83] == 0) {
                                            Statics.field2683.method3501(var90, field352 + var13, field353 + var14, var91, 0);
                                        }
                                        if (field347[var83] == 1) {
                                            Statics.field2683.method3503(var90, field352 + var13, field353 + var14, var91, 0, field351);
                                        }
                                        if (field347[var83] == 2) {
                                            Statics.field2683.method3504(var90, field352 + var13, field353 + var14, var91, 0, field351);
                                        }
                                        if (field347[var83] == 3) {
                                            Statics.field2683.method3505(var90, field352 + var13, field353 + var14, var91, 0, field351, 150 - field348[var83]);
                                        }
                                        if (field347[var83] == 4) {
                                            int var95 = (150 - field348[var83]) * (Statics.field2683.method3494(var90) + 100) / 150;
                                            class74.method1515(field352 + var13 - 50, var14, field352 + var13 + 50, var14 + var33);
                                            Statics.field2683.method3499(var90, field352 + var13 + 50 - var95, field353 + var14, var91, 0);
                                            class74.method1514(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field347[var83] == 5) {
                                            int var96 = 150 - field348[var83];
                                            int var97 = 0;
                                            if (var96 < 25) {
                                                var97 = var96 - 25;
                                            } else if (var96 > 125) {
                                                var97 = var96 - 125;
                                            }
                                            class74.method1515(var13, field353 + var14 - Statics.field2683.field2990 - 1, var13 + var32, field353 + var14 + 5);
                                            Statics.field2683.method3501(var90, field352 + var13, field353 + var14 + var97, var91, 0);
                                            class74.method1514(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field2683.method3501(var90, field352 + var13, field353 + var14, 16776960, 0);
                                    }
                                }
                                if (field265 == 2) {
                                    method583((field268 - Statics.field73 << 7) + field263, (field284 - Statics.field1821 << 7) + field272, field501 * 2);
                                    if (field352 > -1 && field257 % 20 < 10) {
                                        Statics.field1287[0].method1431(field352 + var13 - 12, field353 + var14 - 28);
                                    }
                                }
                                ((class89) Statics.field1479).method1885(field477);
                                if (field357 == 1) {
                                    Statics.field1816[field356 / 100].method1431(field354 - 8, field470 - 8);
                                }
                                if (field357 == 2) {
                                    Statics.field1816[field356 / 100 + 4].method1431(field354 - 8, field470 - 8);
                                }
                                field417 = 0;
                                int var98 = (Statics.field1508.field766 >> 7) + Statics.field73;
                                int var99 = (Statics.field1508.field759 >> 7) + Statics.field1821;
                                if (var98 >= 3053 && var98 <= 3156 && var99 >= 3056 && var99 <= 3136) {
                                    field417 = 1;
                                }
                                if (var98 >= 3072 && var98 <= 3118 && var99 >= 9492 && var99 <= 9535) {
                                    field417 = 1;
                                }
                                if (field417 == 1 && var98 >= 3139 && var98 <= 3199 && var99 >= 3008 && var99 <= 3062) {
                                    field417 = 0;
                                }
                                if (field382) {
                                    int var100 = var13 + 512 - 5;
                                    int var101 = var14 + 20;
                                    Statics.field2094.method3500("Fps:" + field2071, var100, var101, 16776960, -1);
                                    int var187 = var101 + 15;
                                    Runtime var102 = Runtime.getRuntime();
                                    int var103 = (int) ((var102.totalMemory() - var102.freeMemory()) / 1024L);
                                    int var104 = 16776960;
                                    if (var103 > 32768 && field252) {
                                        var104 = 16711680;
                                    }
                                    if (var103 > 65536 && !field252) {
                                        var104 = 16711680;
                                    }
                                    Statics.field2094.method3500("Mem:" + var103 + "k", var100, var187, var104, -1);
                                    var101 = var187 + 15;
                                }
                                Statics.field1903 = var70;
                                Statics.field622 = var71;
                                Statics.field602 = var72;
                                Statics.field2791 = var73;
                                Statics.field925 = var74;
                                if (field256) {
                                    byte var105 = 0;
                                    int var106 = class155.field2522 + class155.field2520 + var105;
                                    if (var106 == 0) {
                                        field256 = false;
                                    }
                                }
                                if (field256) {
                                    class74.method1520(var13, var14, var32, var33, 0);
                                    method797(class147.field2170, false);
                                }
                                class74.method1514(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2555 == 1338) {
                                method67(var13, var14, var11);
                                class74.method1514(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2553 == 0) {
                            if (!var10.field2550 && method5(var10) && Statics.field141 != var10) {
                                continue;
                            }
                            if (!var10.field2550) {
                                if (var10.field2627 > var10.field2638 - var10.field2561) {
                                    var10.field2627 = var10.field2638 - var10.field2561;
                                }
                                if (var10.field2627 < 0) {
                                    var10.field2627 = 0;
                                }
                            }
                            method2733(arg0, var10.field2635, var20, var21, var22, var23, var13 - var10.field2564, var14 - var10.field2627, var11);
                            if (var10.field2662 != null) {
                                method2733(var10.field2662, var10.field2635, var20, var21, var22, var23, var13 - var10.field2564, var14 - var10.field2627, var11);
                            }
                            class4 var108 = (class4) field431.method3274((long) var10.field2635);
                            if (var108 != null) {
                                method853(var108.field58, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class74.method1514(arg2, arg3, arg4, arg5);
                            class85.method1801();
                        }
                        if (field457[var11] || field322 > 1) {
                            if (var10.field2553 == 0 && !var10.field2550 && var10.field2638 > var10.field2561) {
                                method2981(var10.field2560 + var13, var14, var10.field2627, var10.field2561, var10.field2638);
                            }
                            if (var10.field2553 != 1) {
                                if (var10.field2553 == 2) {
                                    int var109 = 0;
                                    for (int var110 = 0; var110 < var10.field2561; var110++) {
                                        for (int var111 = 0; var111 < var10.field2560; var111++) {
                                            int var112 = (var10.field2605 + 32) * var111 + var13;
                                            int var113 = (var10.field2606 + 32) * var110 + var14;
                                            if (var109 < 20) {
                                                var112 += var10.field2607[var109];
                                                var113 += var10.field2608[var109];
                                            }
                                            if (var10.field2656[var109] > 0) {
                                                boolean var114 = false;
                                                boolean var115 = false;
                                                int var116 = var10.field2656[var109] - 1;
                                                if (var112 + 32 > arg2 && var112 < arg4 && var113 + 32 > arg3 && var113 < arg5 || Statics.field579 == var10 && field360 == var109) {
                                                    class73 var117;
                                                    if (field442 == 1 && Statics.field1901 == var109 && Statics.field2149 == var10.field2635) {
                                                        var117 = class46.method2466(var116, var10.field2657[var109], 2, 0, 2, false);
                                                    } else {
                                                        var117 = class46.method2466(var116, var10.field2657[var109], 1, 3153952, 2, false);
                                                    }
                                                    if (var117 == null) {
                                                        method1031(var10);
                                                    } else if (Statics.field579 == var10 && field360 == var109) {
                                                        int var118 = class131.field2019 - field361;
                                                        int var119 = class131.field2020 - field362;
                                                        if (var118 < 5 && var118 > -5) {
                                                            var118 = 0;
                                                        }
                                                        if (var119 < 5 && var119 > -5) {
                                                            var119 = 0;
                                                        }
                                                        if (field365 < 5) {
                                                            var118 = 0;
                                                            var119 = 0;
                                                        }
                                                        var117.method1443(var112 + var118, var113 + var119, 128);
                                                        if (arg1 != -1) {
                                                            class157 var120 = arg0[arg1 & 0xFFFF];
                                                            if (var113 + var119 < class74.field1313 && var120.field2627 > 0) {
                                                                int var121 = field477 * (class74.field1313 - var113 - var119) / 3;
                                                                if (var121 > field477 * 10) {
                                                                    var121 = field477 * 10;
                                                                }
                                                                if (var121 > var120.field2627) {
                                                                    var121 = var120.field2627;
                                                                }
                                                                var120.field2627 -= var121;
                                                                field362 += var121;
                                                                method1031(var120);
                                                            }
                                                            if (var113 + var119 + 32 > class74.field1315 && var120.field2627 < var120.field2638 - var120.field2561) {
                                                                int var122 = field477 * (var113 + var119 + 32 - class74.field1315) / 3;
                                                                if (var122 > field477 * 10) {
                                                                    var122 = field477 * 10;
                                                                }
                                                                if (var122 > var120.field2638 - var120.field2561 - var120.field2627) {
                                                                    var122 = var120.field2638 - var120.field2561 - var120.field2627;
                                                                }
                                                                var120.field2627 += var122;
                                                                field362 -= var122;
                                                                method1031(var120);
                                                            }
                                                        }
                                                    } else if (Statics.field1836 == var10 && field359 == var109) {
                                                        var117.method1443(var112, var113, 128);
                                                    } else {
                                                        var117.method1431(var112, var113);
                                                    }
                                                }
                                            } else if (var10.field2616 != null && var109 < 20) {
                                                class73 var123 = var10.method2919(var109);
                                                if (var123 != null) {
                                                    var123.method1431(var112, var113);
                                                } else if (class157.field2549) {
                                                    method1031(var10);
                                                }
                                            }
                                            var109++;
                                        }
                                    }
                                } else if (var10.field2553 == 3) {
                                    int var124;
                                    if (method3468(var10)) {
                                        var124 = var10.field2569;
                                        if (Statics.field141 == var10 && var10.field2623 != 0) {
                                            var124 = var10.field2623;
                                        }
                                    } else {
                                        var124 = var10.field2568;
                                        if (Statics.field141 == var10 && var10.field2573 != 0) {
                                            var124 = var10.field2573;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2572) {
                                            class74.method1520(var13, var14, var10.field2560, var10.field2561, var124);
                                        } else {
                                            class74.method1522(var13, var14, var10.field2560, var10.field2561, var124);
                                        }
                                    } else if (var10.field2572) {
                                        class74.method1519(var13, var14, var10.field2560, var10.field2561, var124, 256 - (var15 & 0xFF));
                                    } else {
                                        class74.method1523(var13, var14, var10.field2560, var10.field2561, var124, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2553 == 4) {
                                    class207 var125 = var10.method2938();
                                    if (var125 != null) {
                                        String var126 = var10.field2582;
                                        int var127;
                                        if (method3468(var10)) {
                                            var127 = var10.field2569;
                                            if (Statics.field141 == var10 && var10.field2623 != 0) {
                                                var127 = var10.field2623;
                                            }
                                            if (var10.field2613.length() > 0) {
                                                var126 = var10.field2613;
                                            }
                                        } else {
                                            var127 = var10.field2568;
                                            if (Statics.field141 == var10 && var10.field2573 != 0) {
                                                var127 = var10.field2573;
                                            }
                                        }
                                        if (var10.field2550 && var10.field2594 != -1) {
                                            class46 var128 = class46.method712(var10.field2594);
                                            var126 = var128.field1022;
                                            if (var126 == null) {
                                                var126 = "null";
                                            }
                                            if ((var128.field1025 == 1 || var10.field2659 != 1) && var10.field2659 != -1) {
                                                var126 = class2.method855(16748608) + var126 + class2.field25 + " " + 'x' + method486(var10.field2659);
                                            }
                                        }
                                        if (field401 == var10) {
                                            class147 var10000 = (class147) null;
                                            var126 = class147.field2319;
                                            var127 = var10.field2568;
                                        }
                                        if (!var10.field2550) {
                                            var126 = method1411(var126, var10);
                                        }
                                        var125.method3502(var126, var13, var14, var10.field2560, var10.field2561, var127, var10.field2604 ? 0 : -1, var10.field2602, var10.field2547, var10.field2601);
                                    } else if (class157.field2549) {
                                        method1031(var10);
                                    }
                                } else if (var10.field2553 == 5) {
                                    if (var10.field2550) {
                                        class73 var130;
                                        if (var10.field2594 == -1) {
                                            var130 = var10.method2925(false);
                                        } else {
                                            var130 = class46.method2466(var10.field2594, var10.field2659, var10.field2558, var10.field2592, var10.field2597, false);
                                        }
                                        if (var130 != null) {
                                            int var131 = var130.field1303;
                                            int var132 = var130.field1305;
                                            if (var10.field2599) {
                                                class74.method1515(var13, var14, var10.field2560 + var13, var10.field2561 + var14);
                                                int var133 = (var10.field2560 + (var131 - 1)) / var131;
                                                int var134 = (var10.field2561 + (var132 - 1)) / var132;
                                                for (int var135 = 0; var135 < var133; var135++) {
                                                    for (int var136 = 0; var136 < var134; var136++) {
                                                        if (var10.field2577 != 0) {
                                                            var130.method1448(var131 / 2 + var131 * var135 + var13, var132 / 2 + var132 * var136 + var14, var10.field2577, 4096);
                                                        } else if (var15 == 0) {
                                                            var130.method1431(var131 * var135 + var13, var132 * var136 + var14);
                                                        } else {
                                                            var130.method1443(var131 * var135 + var13, var132 * var136 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1514(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var137 = var10.field2560 * 4096 / var131;
                                                if (var10.field2577 != 0) {
                                                    var130.method1448(var10.field2560 / 2 + var13, var10.field2561 / 2 + var14, var10.field2577, var137);
                                                } else if (var15 != 0) {
                                                    var130.method1445(var13, var14, var10.field2560, var10.field2561, 256 - (var15 & 0xFF));
                                                } else if (var10.field2560 == var131 && var10.field2561 == var132) {
                                                    var130.method1431(var13, var14);
                                                } else {
                                                    var130.method1439(var13, var14, var10.field2560, var10.field2561);
                                                }
                                            }
                                        } else if (class157.field2549) {
                                            method1031(var10);
                                        }
                                    } else {
                                        class73 var129 = var10.method2925(method3468(var10));
                                        if (var129 != null) {
                                            var129.method1431(var13, var14);
                                        } else if (class157.field2549) {
                                            method1031(var10);
                                        }
                                    }
                                } else if (var10.field2553 == 6) {
                                    boolean var138 = method3468(var10);
                                    int var139;
                                    if (var138) {
                                        var139 = var10.field2588;
                                    } else {
                                        var139 = var10.field2587;
                                    }
                                    class99 var140 = null;
                                    int var141 = 0;
                                    if (var10.field2594 != -1) {
                                        class46 var142 = class46.method712(var10.field2594);
                                        if (var142 != null) {
                                            class46 var143 = var142.method863(var10.field2659);
                                            var140 = var143.method862(1);
                                            if (var140 == null) {
                                                method1031(var10);
                                            } else {
                                                var140.method2006();
                                                var141 = var140.field1355 / 2;
                                            }
                                        }
                                    } else if (var10.field2583 == 5) {
                                        if (var10.field2584 == 0) {
                                            var140 = field339.method2997((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var140 = Statics.field1508.method11();
                                        }
                                    } else if (var139 == -1) {
                                        var140 = var10.method2946((class39) null, -1, var138, Statics.field1508.field39);
                                        if (var140 == null && class157.field2549) {
                                            method1031(var10);
                                        }
                                    } else {
                                        class39 var144 = class39.method682(var139);
                                        var140 = var10.method2946(var144, var10.field2545, var138, Statics.field1508.field39);
                                        if (var140 == null && class157.field2549) {
                                            method1031(var10);
                                        }
                                    }
                                    class85.method1804(var10.field2560 / 2 + var13, var10.field2561 / 2 + var14);
                                    int var145 = var10.field2652 * class85.field1468[var10.field2591] >> 16;
                                    int var146 = var10.field2652 * class85.field1483[var10.field2591] >> 16;
                                    if (var140 != null) {
                                        if (var10.field2550) {
                                            var140.method2006();
                                            if (var10.field2596) {
                                                var140.method2030(0, var10.field2590, var10.field2593, var10.field2591, var10.field2589, var10.field2579 + var141 + var145, var10.field2579 + var146, var10.field2652);
                                            } else {
                                                var140.method2016(0, var10.field2590, var10.field2593, var10.field2591, var10.field2589, var10.field2579 + var141 + var145, var10.field2579 + var146);
                                            }
                                        } else {
                                            var140.method2016(0, var10.field2590, 0, var10.field2591, 0, var145, var146);
                                        }
                                    }
                                    class85.method1803();
                                } else {
                                    if (var10.field2553 == 7) {
                                        class207 var147 = var10.method2938();
                                        if (var147 == null) {
                                            if (class157.field2549) {
                                                method1031(var10);
                                            }
                                            continue;
                                        }
                                        int var148 = 0;
                                        for (int var149 = 0; var149 < var10.field2561; var149++) {
                                            for (int var150 = 0; var150 < var10.field2560; var150++) {
                                                if (var10.field2656[var148] > 0) {
                                                    class46 var151 = class46.method712(var10.field2656[var148] - 1);
                                                    String var152;
                                                    if (var151.field1025 != 1 && var10.field2657[var148] == 1) {
                                                        var152 = class2.method855(16748608) + var151.field1022 + class2.field25;
                                                    } else {
                                                        var152 = class2.method855(16748608) + var151.field1022 + class2.field25 + " " + 'x' + method486(var10.field2657[var148]);
                                                    }
                                                    int var153 = (var10.field2605 + 115) * var150 + var13;
                                                    int var154 = (var10.field2606 + 12) * var149 + var14;
                                                    if (var10.field2602 == 0) {
                                                        var147.method3499(var152, var153, var154, var10.field2568, var10.field2604 ? 0 : -1);
                                                    } else if (var10.field2602 == 1) {
                                                        var147.method3501(var152, var10.field2560 / 2 + var153, var154, var10.field2568, var10.field2604 ? 0 : -1);
                                                    } else {
                                                        var147.method3500(var152, var10.field2560 + var153 - 1, var154, var10.field2568, var10.field2604 ? 0 : -1);
                                                    }
                                                }
                                                var148++;
                                            }
                                        }
                                    }
                                    if (var10.field2553 == 8 && Statics.field16 == var10 && field391 == field291) {
                                        int var155 = 0;
                                        int var156 = 0;
                                        class207 var157 = Statics.field2094;
                                        String var158 = var10.field2582;
                                        String var159 = method1411(var158, var10);
                                        while (var159.length() > 0) {
                                            int var160 = var159.indexOf(class2.field32);
                                            String var161;
                                            if (var160 == -1) {
                                                var161 = var159;
                                                var159 = "";
                                            } else {
                                                var161 = var159.substring(0, var160);
                                                var159 = var159.substring(var160 + 4);
                                            }
                                            int var162 = var157.method3494(var161);
                                            if (var162 > var155) {
                                                var155 = var162;
                                            }
                                            var156 += var157.field2990 + 1;
                                        }
                                        var155 += 6;
                                        var156 += 7;
                                        int var163 = var10.field2560 + var13 - 5 - var155;
                                        int var164 = var10.field2561 + var14 + 5;
                                        if (var163 < var13 + 5) {
                                            var163 = var13 + 5;
                                        }
                                        if (var155 + var163 > arg4) {
                                            var163 = arg4 - var155;
                                        }
                                        if (var156 + var164 > arg5) {
                                            var164 = arg5 - var156;
                                        }
                                        class74.method1520(var163, var164, var155, var156, 16777120);
                                        class74.method1522(var163, var164, var155, var156, 0);
                                        String var165 = var10.field2582;
                                        int var166 = var157.field2990 + var164 + 2;
                                        String var167 = method1411(var165, var10);
                                        while (var167.length() > 0) {
                                            int var168 = var167.indexOf(class2.field32);
                                            String var169;
                                            if (var168 == -1) {
                                                var169 = var167;
                                                var167 = "";
                                            } else {
                                                var169 = var167.substring(0, var168);
                                                var167 = var167.substring(var168 + 4);
                                            }
                                            var157.method3499(var169, var163 + 3, var166, 0, -1);
                                            var166 += var157.field2990 + 1;
                                        }
                                    }
                                    if (var10.field2553 == 9) {
                                        if (var10.field2574 == 1) {
                                            class74.method1527(var13, var14, var10.field2560 + var13, var10.field2561 + var14, var10.field2568);
                                        } else {
                                            int var170 = var10.field2560 >= 0 ? var10.field2560 : -var10.field2560;
                                            int var171 = var10.field2561 >= 0 ? var10.field2561 : -var10.field2561;
                                            int var172 = var170;
                                            if (var170 < var171) {
                                                var172 = var171;
                                            }
                                            if (var172 != 0) {
                                                int var173 = (var10.field2560 << 16) / var172;
                                                int var174 = (var10.field2561 << 16) / var172;
                                                if (var174 <= var173) {
                                                    var173 = -var173;
                                                } else {
                                                    var174 = -var174;
                                                }
                                                int var175 = var10.field2574 * var174 >> 17;
                                                int var176 = var10.field2574 * var174 + 1 >> 17;
                                                int var177 = var10.field2574 * var173 >> 17;
                                                int var178 = var10.field2574 * var173 + 1 >> 17;
                                                int var179 = var13 + var175;
                                                int var180 = var13 - var176;
                                                int var181 = var10.field2560 + var13 - var176;
                                                int var182 = var10.field2560 + var13 + var175;
                                                int var183 = var14 + var177;
                                                int var184 = var14 - var178;
                                                int var185 = var10.field2561 + var14 - var178;
                                                int var186 = var10.field2561 + var14 + var177;
                                                class85.method1809(var179, var180, var181);
                                                class85.method1812(var183, var184, var185, var179, var180, var181, var10.field2568);
                                                class85.method1809(var179, var181, var182);
                                                class85.method1812(var183, var185, var186, var179, var181, var182, var10.field2568);
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

    @ObfuscatedName("be.co(Ljava/lang/String;Lfb;B)Ljava/lang/String;")
    public static String method1411(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1895(arg1, var2 - 1);
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
                if (Statics.field1872 != null) {
                    var8 = class213.method3213(Statics.field1872.field2076);
                    if (Statics.field1872.field2079 != null) {
                        var8 = (String) Statics.field1872.field2079;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.cj(IB)Ljava/lang/String;")
    public static final String method486(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method855(65408) + var1.substring(0, var1.length() - 8) + class147.field2322 + " " + class2.field24 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method855(16777215) + var1.substring(0, var1.length() - 4) + class147.field2324 + " " + class2.field24 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method855(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("g.cd(Lfb;IIIIIIB)V")
    public static final void method57(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field329) {
            field333 = 32;
        } else {
            field333 = 0;
        }
        field329 = false;
        if (class131.field2018 == 1 || !Statics.field927 && class131.field2018 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2627 -= 4;
                method1031(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2627 += 4;
                method1031(arg0);
            } else if (arg5 >= arg1 - field333 && arg5 < field333 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2627 = (arg4 - arg3) * var8 / var9;
                method1031(arg0);
                field329 = true;
            }
        }
        if (field485 == 0) {
            return;
        }
        int var10 = arg0.field2560;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2627 += field485 * 45;
            method1031(arg0);
        }
    }

    @ObfuscatedName("fm.cz(IIIIIB)V")
    public static final void method2981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field731[0].method1586(arg0, arg1);
        Statics.field731[1].method1586(arg0, arg1 + arg3 - 16);
        class74.method1520(arg0, arg1 + 16, 16, arg3 - 32, field325);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1520(arg0, arg1 + 16 + var6, 16, var5, field326);
        class74.method1526(arg0, arg1 + 16 + var6, var5, field328);
        class74.method1526(arg0 + 1, arg1 + 16 + var6, var5, field328);
        class74.method1524(arg0, arg1 + 16 + var6, 16, field328);
        class74.method1524(arg0, arg1 + 17 + var6, 16, field328);
        class74.method1526(arg0 + 15, arg1 + 16 + var6, var5, field327);
        class74.method1526(arg0 + 14, arg1 + 17 + var6, var5 - 1, field327);
        class74.method1524(arg0, arg1 + 15 + var6 + var5, 16, field327);
        class74.method1524(arg0 + 1, arg1 + 14 + var6 + var5, 15, field327);
    }

    @ObfuscatedName("gp.cn(Lfb;I)Z")
    public static final boolean method3468(class157 arg0) {
        if (arg0.field2595 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2595.length; var1++) {
            int var2 = method1895(arg0, var1);
            int var3 = arg0.field2668[var1];
            if (arg0.field2595[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2595[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2595[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ci.cr(Lfb;II)I")
    public static final int method1895(class157 arg0, int arg1) {
        if (arg0.field2640 == null || arg1 >= arg0.field2640.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2640[arg1];
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
                    var7 = field386[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field331[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field388[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method151(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method712(var12).field1042 || field251)) {
                        for (int var13 = 0; var13 < var11.field2656.length; var13++) {
                            if (var12 + 1 == var11.field2656[var13]) {
                                var7 += var11.field2657[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2680[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class145.field2150[field331[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2680[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1508.field46;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class145.field2148[var14]) {
                            var7 += field331[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method151(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method712(var18).field1042 || field251)) {
                        for (int var19 = 0; var19 < var17.field2656.length; var19++) {
                            if (var18 + 1 == var17.field2656[var19]) {
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
                    int var20 = class159.field2680[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method127(var22);
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
                    var7 = (Statics.field1508.field766 >> 7) + Statics.field73;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1508.field759 >> 7) + Statics.field1821;
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

    @ObfuscatedName("f.cv([Lfb;IIIIIIII)V")
    public static final void method19(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2550 || var9.field2553 == 0 || var9.field2544 || Statics.method1003(var9) != 0 || field422 == var9) && var9.field2615 == arg1 && (!var9.field2550 || !method5(var9))) {
                int var10 = var9.field2556 + arg6;
                int var11 = var9.field2557 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2553 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2553 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2560 + var10;
                    int var19 = var9.field2561 + var11;
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
                    int var23 = var9.field2561 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field421 == var9) {
                    field278 = true;
                    field403 = var10;
                    field355 = var11;
                }
                if (!var9.field2550 || var12 < var14 && var13 < var15) {
                    int var24 = class131.field2019;
                    int var25 = class131.field2020;
                    if (class131.field2025 != 0) {
                        var24 = class131.field2026;
                        var25 = class131.field2027;
                    }
                    if (var9.field2555 == 1337) {
                        method1031(var9);
                        if (!field256 && !field390 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field442 == 0 && !field453) {
                                method117(class147.field2316, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class99.field1749; var28++) {
                                int var29 = class99.field1750[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field186.method1646(Statics.field1829, var30, var31, var29) >= 0) {
                                        class37 var34 = class37.method7(var33);
                                        if (var34.field880 != null) {
                                            var34 = var34.method665();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field442 == 1) {
                                            method117(class147.field2348, field447 + " " + class2.field21 + " " + class2.method855(65535) + var34.field849, 1, var29, var30, var31);
                                        } else if (!field453) {
                                            String[] var35 = var34.field866;
                                            if (field420) {
                                                var35 = method2074(var35);
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
                                                        method117(var35[var36], class2.method855(65535) + var34.field849, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method117(class147.field2312, class2.method855(65535) + var34.field849, 1002, var34.field882 << 14, var30, var31);
                                        } else if ((Statics.field30 & 0x4) == 4) {
                                            method117(field407, field408 + " " + class2.field21 + " " + class2.method855(65535) + var34.field849, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class31 var38 = field286[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field695.field806 == 1 && (var38.field766 & 0x7F) == 64 && (var38.field759 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field287; var39++) {
                                                class31 var40 = field286[field288[var39]];
                                                if (var40 != null && var38 != var40 && var40.field695.field806 == 1 && var38.field766 == var40.field766 && var38.field759 == var40.field759) {
                                                    method2907(var40.field695, field288[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field368; var41++) {
                                                class3 var42 = field367[field337[var41]];
                                                if (var42 != null && var38.field766 == var42.field766 && var38.field759 == var42.field759) {
                                                    method1358(var42, field337[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method2907(var38.field695, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field367[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field766 & 0x7F) == 64 && (var43.field759 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field287; var44++) {
                                                class31 var45 = field286[field288[var44]];
                                                if (var45 != null && var45.field695.field806 == 1 && var43.field766 == var45.field766 && var43.field759 == var45.field759) {
                                                    method2907(var45.field695, field288[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field368; var46++) {
                                                class3 var47 = field367[field337[var46]];
                                                if (var47 != null && var43 != var47 && var43.field766 == var47.field766 && var43.field759 == var47.field759) {
                                                    method1358(var47, field337[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field505 == var33) {
                                            var26 = var29;
                                        } else {
                                            method1358(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class182 var48 = field432[Statics.field1829][var30][var31];
                                        if (var48 != null) {
                                            for (class26 var49 = (class26) var48.method3304(); var49 != null; var49 = (class26) var48.method3325()) {
                                                class46 var50 = class46.method712(var49.field623);
                                                if (field442 == 1) {
                                                    method117(class147.field2348, field447 + " " + class2.field21 + " " + class2.method855(16748608) + var50.field1022, 16, var49.field623, var30, var31);
                                                } else if (!field453) {
                                                    String[] var51 = var50.field1031;
                                                    if (field420) {
                                                        var51 = method2074(var51);
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
                                                            method117(var51[var52], class2.method855(16748608) + var50.field1022, var53, var49.field623, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method117(class147.field2359, class2.method855(16748608) + var50.field1022, 20, var49.field623, var30, var31);
                                                        }
                                                    }
                                                    method117(class147.field2312, class2.method855(16748608) + var50.field1022, 1004, var49.field623, var30, var31);
                                                } else if ((Statics.field30 & 0x1) == 1) {
                                                    method117(field407, field408 + " " + class2.field21 + " " + class2.method855(16748608) + var50.field1022, 17, var49.field623, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field367[field505];
                                method1358(var56, field505, var54, var55);
                            }
                        }
                    } else if (var9.field2555 == 1338) {
                        method131(var10, var11);
                    } else {
                        if (!field390 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var57 = var24 - var10;
                            int var58 = var25 - var11;
                            if (var9.field2554 == 1) {
                                method117(var9.field2646, "", 24, 0, 0, var9.field2635);
                            }
                            if (var9.field2554 == 2 && !field453) {
                                String var59 = method146(var9);
                                if (var59 != null) {
                                    method117(var59, class2.method855(65280) + var9.field2651, 25, 0, -1, var9.field2635);
                                }
                            }
                            if (var9.field2554 == 3) {
                                method117(class147.field2223, "", 26, 0, 0, var9.field2635);
                            }
                            if (var9.field2554 == 4) {
                                method117(var9.field2646, "", 28, 0, 0, var9.field2635);
                            }
                            if (var9.field2554 == 5) {
                                method117(var9.field2646, "", 29, 0, 0, var9.field2635);
                            }
                            if (var9.field2554 == 6 && field401 == null) {
                                method117(var9.field2646, "", 30, 0, -1, var9.field2635);
                            }
                            if (var9.field2553 == 2) {
                                int var60 = 0;
                                for (int var61 = 0; var61 < var9.field2561; var61++) {
                                    for (int var62 = 0; var62 < var9.field2560; var62++) {
                                        int var63 = (var9.field2605 + 32) * var62;
                                        int var64 = (var9.field2606 + 32) * var61;
                                        if (var60 < 20) {
                                            var63 += var9.field2607[var60];
                                            var64 += var9.field2608[var60];
                                        }
                                        if (var57 >= var63 && var58 >= var64 && var57 < var63 + 32 && var58 < var64 + 32) {
                                            field363 = var60;
                                            Statics.field977 = var9;
                                            if (var9.field2656[var60] > 0) {
                                                label1234: {
                                                    class46 var65 = class46.method712(var9.field2656[var60] - 1);
                                                    if (field442 == 1) {
                                                        int var66 = Statics.method1003(var9);
                                                        boolean var67 = (var66 >> 30 & 0x1) != 0;
                                                        if (var67) {
                                                            if (Statics.field2149 != var9.field2635 || Statics.field1901 != var60) {
                                                                method117(class147.field2348, field447 + " " + class2.field21 + " " + class2.method855(16748608) + var65.field1022, 31, var65.field1046, var60, var9.field2635);
                                                            }
                                                            break label1234;
                                                        }
                                                    }
                                                    if (field453) {
                                                        int var68 = Statics.method1003(var9);
                                                        boolean var69 = (var68 >> 30 & 0x1) != 0;
                                                        if (var69) {
                                                            if ((Statics.field30 & 0x10) == 16) {
                                                                method117(field407, field408 + " " + class2.field21 + " " + class2.method855(16748608) + var65.field1022, 32, var65.field1046, var60, var9.field2635);
                                                            }
                                                            break label1234;
                                                        }
                                                    }
                                                    String[] var70 = var65.field1027;
                                                    if (field420) {
                                                        var70 = method2074(var70);
                                                    }
                                                    int var71 = Statics.method1003(var9);
                                                    boolean var72 = (var71 >> 30 & 0x1) != 0;
                                                    if (var72) {
                                                        for (int var73 = 4; var73 >= 3; var73--) {
                                                            if (var70 != null && var70[var73] != null) {
                                                                byte var74;
                                                                if (var73 == 3) {
                                                                    var74 = 36;
                                                                } else {
                                                                    var74 = 37;
                                                                }
                                                                method117(var70[var73], class2.method855(16748608) + var65.field1022, var74, var65.field1046, var60, var9.field2635);
                                                            } else if (var73 == 4) {
                                                                method117(class147.field2163, class2.method855(16748608) + var65.field1022, 37, var65.field1046, var60, var9.field2635);
                                                            }
                                                        }
                                                    }
                                                    class161 var10000 = (class161) null;
                                                    if (Statics.method2588(Statics.method1003(var9))) {
                                                        method117(class147.field2348, class2.method855(16748608) + var65.field1022, 38, var65.field1046, var60, var9.field2635);
                                                    }
                                                    int var75 = Statics.method1003(var9);
                                                    boolean var76 = (var75 >> 30 & 0x1) != 0;
                                                    if (var76 && var70 != null) {
                                                        for (int var77 = 2; var77 >= 0; var77--) {
                                                            if (var70[var77] != null) {
                                                                byte var78 = 0;
                                                                if (var77 == 0) {
                                                                    var78 = 33;
                                                                }
                                                                if (var77 == 1) {
                                                                    var78 = 34;
                                                                }
                                                                if (var77 == 2) {
                                                                    var78 = 35;
                                                                }
                                                                method117(var70[var77], class2.method855(16748608) + var65.field1022, var78, var65.field1046, var60, var9.field2635);
                                                            }
                                                        }
                                                    }
                                                    String[] var79 = var9.field2610;
                                                    if (field420) {
                                                        var79 = method2074(var79);
                                                    }
                                                    if (var79 != null) {
                                                        for (int var80 = 4; var80 >= 0; var80--) {
                                                            if (var79[var80] != null) {
                                                                byte var81 = 0;
                                                                if (var80 == 0) {
                                                                    var81 = 39;
                                                                }
                                                                if (var80 == 1) {
                                                                    var81 = 40;
                                                                }
                                                                if (var80 == 2) {
                                                                    var81 = 41;
                                                                }
                                                                if (var80 == 3) {
                                                                    var81 = 42;
                                                                }
                                                                if (var80 == 4) {
                                                                    var81 = 43;
                                                                }
                                                                method117(var79[var80], class2.method855(16748608) + var65.field1022, var81, var65.field1046, var60, var9.field2635);
                                                            }
                                                        }
                                                    }
                                                    method117(class147.field2312, class2.method855(16748608) + var65.field1022, 1005, var65.field1046, var60, var9.field2635);
                                                }
                                            }
                                        }
                                        var60++;
                                    }
                                }
                            }
                            if (var9.field2550) {
                                if (field453) {
                                    int var82 = Statics.method1003(var9);
                                    boolean var83 = (var82 >> 21 & 0x1) != 0;
                                    if (var83 && (Statics.field30 & 0x20) == 32) {
                                        method117(field407, field408 + " " + class2.field21 + " " + var9.field2612, 58, 0, var9.field2552, var9.field2635);
                                    }
                                } else {
                                    for (int var84 = 9; var84 >= 5; var84--) {
                                        String var85;
                                        if (!class161.method2513(Statics.method1003(var9), var84) && var9.field2639 == null) {
                                            var85 = null;
                                        } else if (var9.field2542 == null || var9.field2542.length <= var84 || var9.field2542[var84] == null || var9.field2542[var84].trim().length() == 0) {
                                            var85 = null;
                                        } else {
                                            var85 = var9.field2542[var84];
                                        }
                                        if (var85 != null) {
                                            method117(var85, var9.field2612, 1007, var84 + 1, var9.field2552, var9.field2635);
                                        }
                                    }
                                    String var87 = method146(var9);
                                    if (var87 != null) {
                                        method117(var87, var9.field2612, 25, 0, var9.field2552, var9.field2635);
                                    }
                                    for (int var88 = 4; var88 >= 0; var88--) {
                                        String var89;
                                        if (!class161.method2513(Statics.method1003(var9), var88) && var9.field2639 == null) {
                                            var89 = null;
                                        } else if (var9.field2542 == null || var9.field2542.length <= var88 || var9.field2542[var88] == null || var9.field2542[var88].trim().length() == 0) {
                                            var89 = null;
                                        } else {
                                            var89 = var9.field2542[var88];
                                        }
                                        if (var89 != null) {
                                            method117(var89, var9.field2612, 57, var88 + 1, var9.field2552, var9.field2635);
                                        }
                                    }
                                    if (class161.method873(Statics.method1003(var9))) {
                                        method117(class147.field2167, "", 30, 0, var9.field2552, var9.field2635);
                                    }
                                }
                            }
                        }
                        if (var9.field2553 == 0) {
                            if (!var9.field2550 && method5(var9) && Statics.field141 != var9) {
                                continue;
                            }
                            method19(arg0, var9.field2635, var12, var13, var14, var15, var10 - var9.field2564, var11 - var9.field2627);
                            if (var9.field2662 != null) {
                                method19(var9.field2662, var9.field2635, var12, var13, var14, var15, var10 - var9.field2564, var11 - var9.field2627);
                            }
                            class4 var91 = (class4) field431.method3274((long) var9.field2635);
                            if (var91 != null) {
                                if (var91.field57 == 0 && class131.field2019 >= var12 && class131.field2020 >= var13 && class131.field2019 < var14 && class131.field2020 < var15 && !field390 && !field419) {
                                    field476[0] = class147.field2397;
                                    field397[0] = "";
                                    field258[0] = 1006;
                                    field259 = 1;
                                }
                                int var92 = var91.field58;
                                if (class157.method1793(var92)) {
                                    method19(Statics.field2658[var92], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2550) {
                            if (var9.field2671 && class131.field2019 >= var12 && class131.field2020 >= var13 && class131.field2019 < var14 && class131.field2020 < var15) {
                                for (class1 var93 = (class1) field449.method3303(); var93 != null; var93 = (class1) field449.method3305()) {
                                    if (var93.field8) {
                                        var93.method3392();
                                        var93.field3.field2663 = false;
                                    }
                                }
                                if (Statics.field164 == 0) {
                                    field421 = null;
                                    field422 = null;
                                }
                                if (!field390) {
                                    field476[0] = class147.field2397;
                                    field397[0] = "";
                                    field258[0] = 1006;
                                    field259 = 1;
                                }
                            }
                            boolean var94;
                            if (class131.field2019 >= var12 && class131.field2020 >= var13 && class131.field2019 < var14 && class131.field2020 < var15) {
                                var94 = true;
                            } else {
                                var94 = false;
                            }
                            boolean var95 = false;
                            if ((class131.field2018 == 1 || !Statics.field927 && class131.field2018 == 4) && var94) {
                                var95 = true;
                            }
                            boolean var96 = false;
                            if ((class131.field2025 == 1 || !Statics.field927 && class131.field2025 == 4) && class131.field2026 >= var12 && class131.field2027 >= var13 && class131.field2026 < var14 && class131.field2027 < var15) {
                                var96 = true;
                            }
                            if (var96) {
                                method2438(var9, class131.field2026 - var10, class131.field2027 - var11);
                            }
                            if (field421 != null && field421 != var9 && var94 && class161.method2890(Statics.method1003(var9))) {
                                field425 = var9;
                            }
                            if (field422 == var9) {
                                field317 = true;
                                field253 = var10;
                                field506 = var11;
                            }
                            if (var9.field2544) {
                                if (var94 && field485 != 0 && var9.field2562 != null) {
                                    class1 var97 = new class1();
                                    var97.field8 = true;
                                    var97.field3 = var9;
                                    var97.field5 = field485;
                                    var97.field9 = var9.field2562;
                                    field449.method3323(var97);
                                }
                                if (field421 != null || Statics.field579 != null || field390) {
                                    var96 = false;
                                    var95 = false;
                                    var94 = false;
                                }
                                if (!var9.field2660 && var96) {
                                    var9.field2660 = true;
                                    if (var9.field2621 != null) {
                                        class1 var98 = new class1();
                                        var98.field8 = true;
                                        var98.field3 = var9;
                                        var98.field6 = class131.field2026 - var10;
                                        var98.field5 = class131.field2027 - var11;
                                        var98.field9 = var9.field2621;
                                        field449.method3323(var98);
                                    }
                                }
                                if (var9.field2660 && var95 && var9.field2622 != null) {
                                    class1 var99 = new class1();
                                    var99.field8 = true;
                                    var99.field3 = var9;
                                    var99.field6 = class131.field2019 - var10;
                                    var99.field5 = class131.field2020 - var11;
                                    var99.field9 = var9.field2622;
                                    field449.method3323(var99);
                                }
                                if (var9.field2660 && !var95) {
                                    var9.field2660 = false;
                                    if (var9.field2619 != null) {
                                        class1 var100 = new class1();
                                        var100.field8 = true;
                                        var100.field3 = var9;
                                        var100.field6 = class131.field2019 - var10;
                                        var100.field5 = class131.field2020 - var11;
                                        var100.field9 = var9.field2619;
                                        field335.method3323(var100);
                                    }
                                }
                                if (var95 && var9.field2655 != null) {
                                    class1 var101 = new class1();
                                    var101.field8 = true;
                                    var101.field3 = var9;
                                    var101.field6 = class131.field2019 - var10;
                                    var101.field5 = class131.field2020 - var11;
                                    var101.field9 = var9.field2655;
                                    field449.method3323(var101);
                                }
                                if (!var9.field2663 && var94) {
                                    var9.field2663 = true;
                                    if (var9.field2625 != null) {
                                        class1 var102 = new class1();
                                        var102.field8 = true;
                                        var102.field3 = var9;
                                        var102.field6 = class131.field2019 - var10;
                                        var102.field5 = class131.field2020 - var11;
                                        var102.field9 = var9.field2625;
                                        field449.method3323(var102);
                                    }
                                }
                                if (var9.field2663 && var94 && var9.field2626 != null) {
                                    class1 var103 = new class1();
                                    var103.field8 = true;
                                    var103.field3 = var9;
                                    var103.field6 = class131.field2019 - var10;
                                    var103.field5 = class131.field2020 - var11;
                                    var103.field9 = var9.field2626;
                                    field449.method3323(var103);
                                }
                                if (var9.field2663 && !var94) {
                                    var9.field2663 = false;
                                    if (var9.field2551 != null) {
                                        class1 var104 = new class1();
                                        var104.field8 = true;
                                        var104.field3 = var9;
                                        var104.field6 = class131.field2019 - var10;
                                        var104.field5 = class131.field2020 - var11;
                                        var104.field9 = var9.field2551;
                                        field335.method3323(var104);
                                    }
                                }
                                if (var9.field2614 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = var9;
                                    var105.field9 = var9.field2614;
                                    field406.method3323(var105);
                                }
                                if (var9.field2664 != null && field413 > var9.field2578) {
                                    if (var9.field2633 == null || field413 - var9.field2578 > 32) {
                                        class1 var110 = new class1();
                                        var110.field3 = var9;
                                        var110.field9 = var9.field2664;
                                        field449.method3323(var110);
                                    } else {
                                        label931: for (int var106 = var9.field2578; var106 < field413; var106++) {
                                            int var107 = field434[var106 & 0x1F];
                                            for (int var108 = 0; var108 < var9.field2633.length; var108++) {
                                                if (var9.field2633[var108] == var107) {
                                                    class1 var109 = new class1();
                                                    var109.field3 = var9;
                                                    var109.field9 = var9.field2664;
                                                    field449.method3323(var109);
                                                    break label931;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2578 = field413;
                                }
                                if (var9.field2634 != null && field370 > var9.field2667) {
                                    if (var9.field2565 == null || field370 - var9.field2667 > 32) {
                                        class1 var115 = new class1();
                                        var115.field3 = var9;
                                        var115.field9 = var9.field2634;
                                        field449.method3323(var115);
                                    } else {
                                        label907: for (int var111 = var9.field2667; var111 < field370; var111++) {
                                            int var112 = field436[var111 & 0x1F];
                                            for (int var113 = 0; var113 < var9.field2565.length; var113++) {
                                                if (var9.field2565[var113] == var112) {
                                                    class1 var114 = new class1();
                                                    var114.field3 = var9;
                                                    var114.field9 = var9.field2634;
                                                    field449.method3323(var114);
                                                    break label907;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2667 = field370;
                                }
                                if (var9.field2636 != null && field439 > var9.field2654) {
                                    if (var9.field2637 == null || field439 - var9.field2654 > 32) {
                                        class1 var120 = new class1();
                                        var120.field3 = var9;
                                        var120.field9 = var9.field2636;
                                        field449.method3323(var120);
                                    } else {
                                        label883: for (int var116 = var9.field2654; var116 < field439; var116++) {
                                            int var117 = field438[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2637.length; var118++) {
                                                if (var9.field2637[var118] == var117) {
                                                    class1 var119 = new class1();
                                                    var119.field3 = var9;
                                                    var119.field9 = var9.field2636;
                                                    field449.method3323(var119);
                                                    break label883;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2654 = field439;
                                }
                                if (field440 > var9.field2665 && var9.field2641 != null) {
                                    class1 var121 = new class1();
                                    var121.field3 = var9;
                                    var121.field9 = var9.field2641;
                                    field449.method3323(var121);
                                }
                                if (field372 > var9.field2665 && var9.field2643 != null) {
                                    class1 var122 = new class1();
                                    var122.field3 = var9;
                                    var122.field9 = var9.field2643;
                                    field449.method3323(var122);
                                }
                                if (field451 > var9.field2665 && var9.field2644 != null) {
                                    class1 var123 = new class1();
                                    var123.field3 = var9;
                                    var123.field9 = var9.field2644;
                                    field449.method3323(var123);
                                }
                                if (field443 > var9.field2665 && var9.field2648 != null) {
                                    class1 var124 = new class1();
                                    var124.field3 = var9;
                                    var124.field9 = var9.field2648;
                                    field449.method3323(var124);
                                }
                                if (field444 > var9.field2665 && var9.field2649 != null) {
                                    class1 var125 = new class1();
                                    var125.field3 = var9;
                                    var125.field9 = var9.field2649;
                                    field449.method3323(var125);
                                }
                                if (field445 > var9.field2665 && var9.field2645 != null) {
                                    class1 var126 = new class1();
                                    var126.field3 = var9;
                                    var126.field9 = var9.field2645;
                                    field449.method3323(var126);
                                }
                                var9.field2665 = field435;
                                if (var9.field2642 != null) {
                                    for (int var127 = 0; var127 < field469; var127++) {
                                        class1 var128 = new class1();
                                        var128.field3 = var9;
                                        var128.field13 = field471[var127];
                                        var128.field4 = field441[var127];
                                        var128.field9 = var9.field2642;
                                        field449.method3323(var128);
                                    }
                                }
                            }
                        }
                        if (!var9.field2550 && field421 == null && Statics.field579 == null && !field390) {
                            if ((var9.field2653 >= 0 || var9.field2573 != 0) && class131.field2019 >= var12 && class131.field2020 >= var13 && class131.field2019 < var14 && class131.field2020 < var15) {
                                if (var9.field2653 >= 0) {
                                    Statics.field141 = arg0[var9.field2653];
                                } else {
                                    Statics.field141 = var9;
                                }
                            }
                            if (var9.field2553 == 8 && class131.field2019 >= var12 && class131.field2020 >= var13 && class131.field2019 < var14 && class131.field2020 < var15) {
                                Statics.field16 = var9;
                            }
                            if (var9.field2638 > var9.field2561) {
                                method57(var9, var9.field2560 + var10, var11, var9.field2561, var9.field2638, class131.field2019, class131.field2020);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.ci([Lfb;IB)V")
    public static final void method3146(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2553 == 0) {
                    if (var3.field2662 != null) {
                        method3146(var3.field2662, arg1);
                    }
                    class4 var4 = (class4) field431.method3274((long) var3.field2635);
                    if (var4 != null) {
                        Statics.method2752(var4.field58, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2600 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field9 = var3.field2600;
                    class33.method16(var5);
                }
                if (arg1 == 1 && var3.field2647 != null) {
                    if (var3.field2552 >= 0) {
                        class157 var6 = class157.method151(var3.field2635);
                        if (var6 == null || var6.field2662 == null || var3.field2552 >= var6.field2662.length || var6.field2662[var3.field2552] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field9 = var3.field2647;
                    class33.method16(var7);
                }
            }
        }
    }

    @ObfuscatedName("dn.cl(Lfb;IIB)V")
    public static final void method2438(class157 arg0, int arg1, int arg2) {
        if (field421 != null || field390 || arg0 == null || method2589(arg0) == null) {
            return;
        }
        field421 = arg0;
        field422 = method2589(arg0);
        field423 = arg1;
        field424 = arg2;
        Statics.field164 = 0;
        field429 = false;
        if (field259 > 0) {
            method26(field259 - 1);
        }
    }

    @ObfuscatedName("ed.cq(I)V")
    public static final void method2750() {
        method1031(field421);
        Statics.field164++;
        if (field278 && field317) {
            int var0 = class131.field2019;
            int var1 = class131.field2020;
            int var2 = var0 - field423;
            int var3 = var1 - field424;
            if (var2 < field253) {
                var2 = field253;
            }
            if (field421.field2560 + var2 > field253 + field422.field2560) {
                var2 = field253 + field422.field2560 - field421.field2560;
            }
            if (var3 < field506) {
                var3 = field506;
            }
            if (field421.field2561 + var3 > field506 + field422.field2561) {
                var3 = field506 + field422.field2561 - field421.field2561;
            }
            int var4 = var2 - field403;
            int var5 = var3 - field355;
            int var6 = field421.field2632;
            if (Statics.field164 > field421.field2603 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field429 = true;
            }
            int var7 = field422.field2564 + (var2 - field253);
            int var8 = field422.field2627 + (var3 - field506);
            if (field421.field2628 != null && field429) {
                class1 var9 = new class1();
                var9.field3 = field421;
                var9.field6 = var7;
                var9.field5 = var8;
                var9.field9 = field421.field2628;
                class33.method16(var9);
            }
            if (class131.field2018 == 0) {
                if (field429) {
                    if (field421.field2629 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field421;
                        var10.field6 = var7;
                        var10.field5 = var8;
                        var10.field7 = field425;
                        var10.field9 = field421.field2629;
                        class33.method16(var10);
                    }
                    if (field425 != null && method2760(field421) != null) {
                        field289.method2414(120);
                        field289.method2181(field421.field2635);
                        field289.method2191(field425.field2552);
                        field289.method2148(field425.field2594);
                        field289.method2199(field425.field2635);
                        field289.method2191(field421.field2552);
                        field289.method2192(field421.field2594);
                    }
                } else if ((field389 == 1 || method2446(field259 - 1)) && field259 > 2) {
                    method2425(field423 + field403, field424 + field355);
                } else if (field259 > 0) {
                    method1611(field423 + field403, field424 + field355);
                }
                field421 = null;
            }
        } else if (Statics.field164 > 1) {
            field421 = null;
        }
    }

    @ObfuscatedName("l.cc(II)V")
    public static void method26(int arg0) {
        Statics.field60 = new class28();
        Statics.field60.field648 = field392[arg0];
        Statics.field60.field643 = field393[arg0];
        Statics.field60.field645 = field258[arg0];
        Statics.field60.field644 = field395[arg0];
        Statics.field60.field646 = field476[arg0];
    }

    @ObfuscatedName("cg.cu(III)V")
    public static void method1611(int arg0, int arg1) {
        class28 var2 = Statics.field60;
        method77(var2.field648, var2.field643, var2.field645, var2.field644, var2.field646, var2.field646, arg0, arg1);
        Statics.field60 = null;
    }

    @ObfuscatedName("ab.ce(Lfb;I)V")
    public static void method1031(class157 arg0) {
        if (field454 == arg0.field2571) {
            field455[arg0.field2669] = true;
        }
    }

    @ObfuscatedName("cg.cp(I)V")
    public static void method1612() {
        for (class4 var0 = (class4) field431.method3269(); var0 != null; var0 = (class4) field431.method3270()) {
            int var1 = var0.field58;
            if (class157.method1793(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2658[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2550;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2911;
                    class157 var6 = class157.method151(var5);
                    if (var6 != null) {
                        method1031(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.ca(Lfb;S)Lfb;")
    public static class157 method2589(class157 arg0) {
        class157 var1 = method2760(arg0);
        if (var1 == null) {
            var1 = arg0.field2670;
        }
        return var1;
    }

    @ObfuscatedName("cx.cw([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2074(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.cy(II)V")
    public static final void method580(int arg0) {
        if (!class157.method1793(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2658[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2545 = 0;
                var3.field2661 = 0;
            }
        }
    }

    @ObfuscatedName("at.cb([Lfb;II)V")
    public static final void method585(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2615 == arg1 && (!var3.field2550 || !method5(var3))) {
                if (var3.field2553 == 0) {
                    if (!var3.field2550 && method5(var3) && Statics.field141 != var3) {
                        continue;
                    }
                    method585(arg0, var3.field2635);
                    if (var3.field2662 != null) {
                        method585(var3.field2662, var3.field2635);
                    }
                    class4 var4 = (class4) field431.method3274((long) var3.field2635);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class157.method1793(var5)) {
                            method585(Statics.field2658[var5], -1);
                        }
                    }
                }
                if (var3.field2553 == 6) {
                    if (var3.field2587 != -1 || var3.field2588 != -1) {
                        boolean var6 = method3468(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2588;
                        } else {
                            var7 = var3.field2587;
                        }
                        if (var7 != -1) {
                            class39 var8 = class39.method682(var7);
                            var3.field2661 += field477;
                            while (var3.field2661 > var8.field911[var3.field2545]) {
                                var3.field2661 -= var8.field911[var3.field2545];
                                var3.field2545++;
                                if (var3.field2545 >= var8.field908.length) {
                                    var3.field2545 -= var8.field913;
                                    if (var3.field2545 < 0 || var3.field2545 >= var8.field908.length) {
                                        var3.field2545 = 0;
                                    }
                                }
                                method1031(var3);
                            }
                        }
                    }
                    if (var3.field2650 != 0 && !var3.field2550) {
                        int var9 = var3.field2650 >> 16;
                        int var10 = var3.field2650 << 16 >> 16;
                        int var11 = field477 * var9;
                        int var12 = field477 * var10;
                        var3.field2591 = var3.field2591 + var11 & 0x7FF;
                        var3.field2590 = var3.field2590 + var12 & 0x7FF;
                        method1031(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.cx(IS)V")
    public static final void method2767(int arg0) {
        method1612();
        class21.method471();
        class47 var1 = (class47) class47.field1060.method3231((long) arg0);
        class47 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1063.method2852(16, arg0);
            class47 var4 = new class47();
            if (var3 != null) {
                var4.method899(new class110(var3));
            }
            class47.field1060.method3228(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1059;
        if (var5 == 0) {
            return;
        }
        int var6 = class159.field2680[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class85.method1805(0.9D);
                ((class89) Statics.field1479).method1882(0.9D);
            }
            if (var6 == 2) {
                class85.method1805(0.8D);
                ((class89) Statics.field1479).method1882(0.8D);
            }
            if (var6 == 3) {
                class85.method1805(0.7D);
                ((class89) Statics.field1479).method1882(0.7D);
            }
            if (var6 == 4) {
                class85.method1805(0.6D);
                ((class89) Statics.field1479).method1882(0.6D);
            }
            class46.field1041.method3229();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field483 != var7) {
                if (field483 == 0 && field464 != -1) {
                    class166.method25(Statics.field929, field464, 0, var7, false);
                    field269 = false;
                } else if (var7 == 0) {
                    Statics.field2736.method3157();
                    class166.field2737 = 1;
                    Statics.field1666 = null;
                    field269 = false;
                } else {
                    class166.method2571(var7);
                }
                field483 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field299 = 127;
            }
            if (var6 == 1) {
                field299 = 96;
            }
            if (var6 == 2) {
                field299 = 64;
            }
            if (var6 == 3) {
                field299 = 32;
            }
            if (var6 == 4) {
                field299 = 0;
            }
        }
        if (var5 == 5) {
            field389 = var6;
        }
        if (var5 == 6) {
            field411 = var6;
        }
        if (var5 == 9) {
            field323 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field487 = 127;
            }
            if (var6 == 1) {
                field487 = 96;
            }
            if (var6 == 2) {
                field487 = 64;
            }
            if (var6 == 3) {
                field487 = 32;
            }
            if (var6 == 4) {
                field487 = 0;
            }
        }
        if (var5 == 17) {
            field509 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field304 = (class18) class100.method1415(class18.method1412(), var6);
            if (field304 == null) {
                field304 = class18.field525;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field505 = -1;
        } else {
            field505 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("dx.cm(Lj;ZS)V")
    public static final void method2539(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field2911;
        arg0.method3392();
        if (arg1) {
            class157.method2704(var2);
        }
        for (class184 var4 = (class184) field452.method3269(); var4 != null; var4 = (class184) field452.method3270()) {
            if ((long) var2 == (var4.field2911 >> 48 & 0xFFFFL)) {
                var4.method3392();
            }
        }
        class157 var5 = class157.method151(var3);
        if (var5 != null) {
            method1031(var5);
        }
        method122();
        if (field409 != -1) {
            Statics.method2752(field409, 1);
        }
    }

    @ObfuscatedName("ek.cs(Lfb;I)Z")
    public static final boolean method2620(class157 arg0) {
        int var1 = arg0.field2555;
        if (var1 == 205) {
            field296 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field339.method2992(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field339.method2993(var4, var5 == 1);
        }
        if (var1 == 324) {
            field339.method2994(false);
        }
        if (var1 == 325) {
            field339.method2994(true);
        }
        if (var1 == 326) {
            field289.method2414(153);
            field339.method2995(field289);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.ck(IIIB)V")
    public static final void method67(int arg0, int arg1, int arg2) {
        method69();
        class74.method1514(arg0, arg1, Statics.field1457.field1321 + arg0, Statics.field1457.field1319 + arg1);
        if (field482 == 2 || field482 == 5) {
            class74.method1529(arg0 + 25, arg1 + 5, 0, Statics.field97, Statics.field2952);
        } else {
            int var3 = field318 + field309 & 0x7FF;
            int var4 = Statics.field1508.field766 / 32 + 48;
            int var5 = 464 - Statics.field1508.field759 / 32;
            Statics.field158.method1455(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field320 + 256, Statics.field97, Statics.field2952);
            for (int var6 = 0; var6 < field433; var6++) {
                int var7 = field342[var6] * 4 + 2 - Statics.field1508.field766 / 32;
                int var8 = field478[var6] * 4 + 2 - Statics.field1508.field759 / 32;
                method709(arg0, arg1, var7, var8, field479[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class182 var11 = field432[Statics.field1829][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1508.field766 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1508.field759 / 32;
                        method709(arg0, arg1, var12, var13, Statics.field1247[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field287; var14++) {
                class31 var15 = field286[field288[var14]];
                if (var15 != null && var15.method12()) {
                    class36 var16 = var15.field695;
                    if (var16 != null && var16.field818 != null) {
                        var16 = var16.method627();
                    }
                    if (var16 != null && var16.field837 && var16.field833) {
                        int var17 = var15.field766 / 32 - Statics.field1508.field766 / 32;
                        int var18 = var15.field759 / 32 - Statics.field1508.field759 / 32;
                        method709(arg0, arg1, var17, var18, Statics.field1247[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field368; var19++) {
                class3 var20 = field367[field337[var19]];
                if (var20 != null && var20.method12() && !var20.field54) {
                    int var21 = var20.field766 / 32 - Statics.field1508.field766 / 32;
                    int var22 = var20.field759 / 32 - Statics.field1508.field759 / 32;
                    boolean var23 = false;
                    if (method98(var20.field40, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1289; var25++) {
                        if (var20.field40.equals(Statics.field578[var25].field575)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1508.field35 != 0 && var20.field35 != 0 && Statics.field1508.field35 == var20.field35) {
                        var26 = true;
                    }
                    if (var23) {
                        method709(arg0, arg1, var21, var22, Statics.field1247[3]);
                    } else if (var26) {
                        method709(arg0, arg1, var21, var22, Statics.field1247[4]);
                    } else if (var24) {
                        method709(arg0, arg1, var21, var22, Statics.field1247[5]);
                    } else {
                        method709(arg0, arg1, var21, var22, Statics.field1247[2]);
                    }
                }
            }
            if (field265 != 0 && field257 % 20 < 10) {
                if (field265 == 1 && field266 >= 0 && field266 < field286.length) {
                    class31 var27 = field286[field266];
                    if (var27 != null) {
                        int var28 = var27.field766 / 32 - Statics.field1508.field766 / 32;
                        int var29 = var27.field759 / 32 - Statics.field1508.field759 / 32;
                        method119(arg0, arg1, var28, var29, Statics.field324[1]);
                    }
                }
                if (field265 == 2) {
                    int var30 = field268 * 4 - Statics.field73 * 4 + 2 - Statics.field1508.field766 / 32;
                    int var31 = field284 * 4 - Statics.field1821 * 4 + 2 - Statics.field1508.field759 / 32;
                    method119(arg0, arg1, var30, var31, Statics.field324[1]);
                }
                if (field265 == 10 && field267 >= 0 && field267 < field367.length) {
                    class3 var32 = field367[field267];
                    if (var32 != null) {
                        int var33 = var32.field766 / 32 - Statics.field1508.field766 / 32;
                        int var34 = var32.field759 / 32 - Statics.field1508.field759 / 32;
                        method119(arg0, arg1, var33, var34, Statics.field324[1]);
                    }
                }
            }
            if (field480 != 0) {
                int var35 = field480 * 4 + 2 - Statics.field1508.field766 / 32;
                int var36 = field332 * 4 + 2 - Statics.field1508.field759 / 32;
                method709(arg0, arg1, var35, var36, Statics.field324[0]);
            }
            if (!Statics.field1508.field54) {
                class74.method1520(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field482 < 3) {
            Statics.field69.method1455(arg0, arg1, 33, 33, 25, 25, field309, 256, Statics.field1490, Statics.field537);
        } else {
            class74.method1529(arg0, arg1, 0, Statics.field1490, Statics.field537);
        }
        if (field457[arg2]) {
            Statics.field1457.method1586(arg0, arg1);
        }
        field456[arg2] = true;
    }

    @ObfuscatedName("o.ds(IIIILbw;B)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method709(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field318 + field309 & 0x7FF;
        int var7 = class85.field1468[var6];
        int var8 = class85.field1483[var6];
        int var9 = var7 * 256 / (field320 + 256);
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1857.method1447(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("az.dy(IIIILbw;I)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field318 + field309 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1468[var5];
        int var8 = class85.field1483[var5];
        int var9 = var7 * 256 / (field320 + 256);
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1450(Statics.field1457, arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1305 / 2 - 4);
        } else {
            arg4.method1431(arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1305 / 2 - 4);
        }
    }

    @ObfuscatedName("m.dw(Ljava/lang/String;ZB)Z")
    public static boolean method98(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method2579(arg0, Statics.field250);
        for (int var3 = 0; var3 < field500; var3++) {
            if (var2.equalsIgnoreCase(Statics.method2579(field394[var3].field230, Statics.field250)) && (!arg1 || field394[var3].field223 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method2579(Statics.field1508.field40, Statics.field250))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("l.dk(Ljava/lang/String;B)Z")
    public static boolean method27(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method2579(arg0, Statics.field250);
        for (int var2 = 0; var2 < field493; var2++) {
            class8 var3 = field508[var2];
            if (var1.equalsIgnoreCase(Statics.method2579(var3.field135, Statics.field250))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method2579(var3.field129, Statics.field250))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("l.dd(Ljava/lang/String;ZB)V")
    public static final void method28(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field493 < 100 || field450 == 1) || field493 >= 400) {
            class10.method591(31, "", class147.field2258);
            return;
        }
        String var2 = Statics.method2579(arg0, Statics.field250);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field493; var3++) {
            class8 var4 = field508[var3];
            String var5 = Statics.method2579(var4.field135, Statics.field250);
            if (var5 != null && var5.equals(var2)) {
                class10.method591(31, "", arg0 + class147.field2273);
                return;
            }
            if (var4.field129 != null) {
                String var6 = Statics.method2579(var4.field129, Statics.field250);
                if (var6 != null && var6.equals(var2)) {
                    class10.method591(31, "", arg0 + class147.field2273);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field500; var7++) {
            class16 var8 = field394[var7];
            String var9 = Statics.method2579(var8.field230, Statics.field250);
            if (var9 != null && var9.equals(var2)) {
                class10.method591(31, "", class147.field2307 + arg0 + class147.field2336);
                return;
            }
            if (var8.field219 != null) {
                String var10 = Statics.method2579(var8.field219, Statics.field250);
                if (var10 != null && var10.equals(var2)) {
                    class10.method591(31, "", class147.field2307 + arg0 + class147.field2336);
                    return;
                }
            }
        }
        if (Statics.method2579(Statics.field1508.field40, Statics.field250).equals(var2)) {
            class10.method591(31, "", class147.field2332);
            return;
        }
        field289.method2414(90);
        class113 var11 = field289;
        int var12 = arg0.length() + 1;
        var11.method2263(var12);
        field289.method2152(arg0);
    }

    @ObfuscatedName("by.dp(Ljava/lang/String;B)V")
    public static final void method1606(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method2579(arg0, Statics.field250);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field500; var2++) {
            class16 var3 = field394[var2];
            String var4 = var3.field230;
            String var5 = Statics.method2579(var4, Statics.field250);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field500--;
                for (int var7 = var2; var7 < field500; var7++) {
                    field394[var7] = field394[var7 + 1];
                }
                field372 = field435;
                field289.method2414(113);
                class113 var8 = field289;
                int var9 = arg0.length() + 1;
                var8.method2263(var9);
                field289.method2152(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dj.dq(Ljava/lang/String;I)V")
    public static final void method2394(String arg0) {
        if (Statics.field578 == null) {
            return;
        }
        field289.method2414(137);
        class113 var1 = field289;
        int var2 = arg0.length() + 1;
        var1.method2263(var2);
        field289.method2152(arg0);
    }

    @ObfuscatedName("fa.dj(I)V")
    public static final void method3209() {
        field289.method2414(65);
        field289.method2263(0);
    }

    @ObfuscatedName("eh.dn(Lfb;B)Lfb;")
    public static class157 method2760(class157 arg0) {
        int var1 = Statics.method1003(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class157.method151(arg0.field2615);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("t.do(Lfb;I)Z")
    public static boolean method5(class157 arg0) {
        if (field419) {
            if (Statics.method1003(arg0) != 0) {
                return false;
            }
            if (arg0.field2553 == 0) {
                return false;
            }
        }
        return arg0.field2563;
    }

    @ObfuscatedName("s.du(Lfb;I)Ljava/lang/String;")
    public static String method146(class157 arg0) {
        if (class161.method2(Statics.method1003(arg0)) == 0) {
            return null;
        } else if (arg0.field2618 == null || arg0.field2618.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2618;
        }
    }

    @ObfuscatedName("al.dt(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method763(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field249 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field249 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field249 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field249 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field249 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field254 != null) {
            var3 = "/p=" + Statics.field254;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field396 + "/a=" + Statics.field188 + var3 + "/";
    }
}
